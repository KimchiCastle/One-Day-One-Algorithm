package main.implementation;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Algorithm_220816_Backjoon_14425 {

/*
 * 
 * https://www.acmicpc.net/problem/14425
 * 	
 */
	
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		
		Map<String,Integer> MyMap = new HashMap<String, Integer>();
		
		for(int i=0; i<N; i++) {
			
			MyMap.put(br.readLine(), i);
			
			
		}
		
		int count = 0;
		
		for(int i=0; i<M;i++) {
			
			if(MyMap.containsKey(br.readLine())){
				
				count++;
				
			}
			
			
		}
		
		
		System.out.println(count);
		
	}
	
	
}
