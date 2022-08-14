package main;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
 * 
 * https://www.acmicpc.net/problem/1712
 * 
 * */

public class Algorithm_220814_Backjoon_1712 {
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		
		
		int A = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());
		int C = Integer.parseInt(st.nextToken());
		
		if(B<C) {
			
			sb.append(A/(C-B) + 1);
		}else {
			sb.append(-1);
		}
		
		
		System.out.println(sb);
		
		
	}
	
	
}
