package main.bruteforce;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
 * 
 * https://www.acmicpc.net/problem/1436
 * 
 * */


public class Algorithm_220819_Backjoon_1436 {
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringBuilder sb = new StringBuilder();
		
		
		int N = Integer.parseInt(br.readLine());
		
		int count = 665;
		
		int res = 0;
		
		while( true ) {
			
			count++;
			
			String count_str = Integer.toString(count);
			
			if(count_str.contains("666")) {
				
				res++;
				
				if(res==N) {
					
					break;
					
				}
				
			}
			
			
			
		}
		
		sb.append(count);
		
		System.out.println(sb);
		
	}
	
	
}
