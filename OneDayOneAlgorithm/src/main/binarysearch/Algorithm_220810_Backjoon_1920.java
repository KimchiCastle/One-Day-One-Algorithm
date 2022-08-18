package main.binarysearch;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

/*
 * 
 * https://www.acmicpc.net/problem/1920
 * 
 */


public class Algorithm_220810_Backjoon_1920 {
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		//정답출력용 빌더 생성
		StringBuilder sb = new StringBuilder();
		
		//카드 개수 받기
		int N = Integer.parseInt(br.readLine());
		
		int [] card = new int[N];
		
		//잘라내기
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		for(int i=0; i<N; i++) {
			card[i] = Integer.parseInt(st.nextToken());
		}
		
		//카드 정렬
		Arrays.sort(card);
		
		int M = Integer.parseInt(br.readLine());
		
		//카드찾기
		
		st = new StringTokenizer(br.readLine());
		for(int i=0; i<M; i++) {
			
			int search = Integer.parseInt(st.nextToken());
			
			sb.append(MyBinarySearch(card,N,search)).append("\n");
			
		}
		
		System.out.println(sb);
		
		
	}

	private static int MyBinarySearch(int[] card, int N, int search) {
		// TODO Auto-generated method stub
		
		
		int start = 0;
		int end = N-1;
		int mid = 0;
		
		
		while(start<=end) {
			
			mid = (start+end)/2;
			
			
			if(card[mid]==search) {
				
				return 1;
				
			}else if(card[mid]<search) {
				
				start = mid + 1;
				
				
			}else {
				
				end = mid -1;
				
			}
			
			
			
			
		}
		
		return 0;
	}
	
	
}
