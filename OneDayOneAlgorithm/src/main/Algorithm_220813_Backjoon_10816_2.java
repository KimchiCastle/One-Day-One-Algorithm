package main;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

/*
 * 
 * https://www.acmicpc.net/problem/10816
 * 
 */


//이분탐색으로 풀기
public class Algorithm_220813_Backjoon_10816_2 {
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringBuilder sb = new StringBuilder();
		
		int N = Integer.parseInt(br.readLine());
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		
		Map<Integer, Integer> cardMap = new HashMap<Integer, Integer>();
		
		
		for(int i=0; i<N; i++) {
			
			int card = Integer.parseInt(st.nextToken());
			
			cardMap.put(card, cardMap.getOrDefault(card, 0)+1);
			
			
		}
		
		int M = Integer.parseInt(br.readLine());
		
		
		st = new StringTokenizer(br.readLine());
		
		for(int i=0; i<M; i++) {
			
			int search = Integer.parseInt(st.nextToken());
			
			sb.append(cardMap.getOrDefault(search, 0)).append(" ");
			
		}
		
		System.out.println(sb.toString());
		
		
	}

	
	
}
