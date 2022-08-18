package main.binarysearch;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

/*
 * 
 * https://www.acmicpc.net/problem/10816
 * 
 */


//이분탐색으로 풀기
public class Algorithm_220813_Backjoon_10816 {
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringBuilder sb = new StringBuilder();
		
		int N = Integer.parseInt(br.readLine());
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int [] card = new int[N];
		
		for(int i=0; i<N; i++) {
			
			card[i] = Integer.parseInt(st.nextToken());
			
		}
		
		//찾고자 하는 배열 정렬
		Arrays.sort(card);
		
		int M = Integer.parseInt(br.readLine());
		
		st = new StringTokenizer(br.readLine());
	
		for(int i=0; i<M; i++) {
			
			int search = Integer.parseInt(st.nextToken());
			
			
			sb.append(upperBound(search,card)-lowerBound(search,card)).append(" ");
			
			
		}
		
//		for(int a : card) {
//			System.out.println(a);
//		}
		
		
		
		System.out.println(sb.toString());
		
		
	}

	private static int upperBound(int search, int[] card) {
		// TODO Auto-generated method stub
		
		int start = 0;
		int end = card.length;
		
		while(start<end) {
			
			int	mid = (start+end)/2;
			
			if(search<card[mid]){
				end = mid;
			}else {
				start = mid+1;
				
			}
			
		
		}
		
		return start;
	}
	private static int lowerBound(int search, int[] card) {
		// TODO Auto-generated method stub
		
		int start = 0;
		int end = card.length;
		
		
		while(start<end) {
			
			int	mid = (start+end)/2;
			
			if(search<=card[mid]){
				end =mid;
			}else {
				start = mid+1;
				
			}
			
			
		}
		
		return start;
	}
	
	
}
