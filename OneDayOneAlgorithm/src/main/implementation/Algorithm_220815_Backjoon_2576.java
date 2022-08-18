package main.implementation;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
 * 
 * https://www.acmicpc.net/problem/2576
 * 
 * */

public class Algorithm_220815_Backjoon_2576 {

	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringBuilder sb = new StringBuilder();
		
		int res = -1;
		
		List<Integer> list = new ArrayList<Integer>();
		
		for(int i=0; i<7;i++) {
			
			int N = Integer.parseInt(br.readLine());
			
			//홀수일때
			if(N%2==1) {
				
				list.add(N);
				
				res += N;
				
			}
			
		}
		//내림차순정렬
		Collections.sort(list);
		
		if(res != -1) {
			sb.append(res+1).append("\n").append(list.get(0));
		}else {
			sb.append(res);
		}
		
		System.out.println(sb);
	}
	
	
}
