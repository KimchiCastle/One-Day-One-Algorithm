package main.DFS;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

/*
 * 
 * https://www.acmicpc.net/problem/24479
 * 
 * */


public class Algorithm_220818_Backjoon_24479 {
	
	
	static int count;
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		//출력용 Builder
		StringBuilder sb = new StringBuilder();
		
		//정점수
		int N = Integer.parseInt(st.nextToken());
		
		//간선수
		int M = Integer.parseInt(st.nextToken());
		
		//시작노드
		int S = Integer.parseInt(st.nextToken());
		
		//그래프 list 생성
		List<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>();
		
		
		//정답 출력용 배열
		int res [] = new int[N+1];
		
		//DFS 방문 체크용 boolean 배열
		boolean visit [] = new boolean[N+1];
		
		
		for(int i=0; i<N+1; i++) {
			
			ArrayList<Integer> al = new ArrayList<Integer>();
			
			
			list.add(al);
			
			
		}
		
		
		//인접그래프 만들기 간선 수만큼
		
		for(int i=0; i<M; i++) {
			
			st = new StringTokenizer(br.readLine());
			
			int u = Integer.parseInt(st.nextToken());
			int v = Integer.parseInt(st.nextToken());
			
			list.get(u).add(v);
			list.get(v).add(u);
			
			
		}
		
		//그래프를 정렬하기 오름차순으로 출력해야하기 때문
		for(int i=1; i<=N; i++) {
			
			Collections.sort(list.get(i));
			
		}
		
		// 그래프 확인 출력용
//		for (int i = 1; i < list.size(); i++) {
//			for (int k = 0; k < list.get(i).size(); k++) {
//
//				System.out.printf("%d ", list.get(i).get(k));
//
//			}
//			System.out.println();
//		}
		
		
		dfs(visit,res,S,list);
		
		
		for(int i=1; i<res.length; i++) {
			
			sb.append(res[i]).append("\n");
			
		}
		
		
		System.out.println(sb);
		
	}

	private static void dfs(boolean[] visit, int[] res, int s, List<ArrayList<Integer>> list) {
		// TODO Auto-generated method stub
		
		//정점 방문처리
		visit[s] = true;
		
		res[s] = ++count;
		
		for(int a : list.get(s)) {
			
			//a를 방문하지 안았다면 dfs 실행
			if(visit[a] == false) {
				dfs(visit, res, a, list);
			}
			
		}
		
		
		
	}
	
	
}
