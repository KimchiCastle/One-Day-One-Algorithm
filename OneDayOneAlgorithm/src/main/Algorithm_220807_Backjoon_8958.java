package main;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
 * 
 * https://www.acmicpc.net/problem/8958
 * 
 * */
public class Algorithm_220807_Backjoon_8958 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		
		//입력받기
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int tc = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		
		String [] arr = new String[tc];
		
		
		for(int i=0; i<tc; i++) {
			arr[i] = br.readLine();
			
			int res = 0;
			
			int res2 = 0;
			
			for(int k=0; k<arr[i].length(); k++) {
				
				if(arr[i].charAt(k)=='O') {
					
					res++;
					
				}else {
					res = 0;
				}
				
				res2 += res;
			}
			
			sb.append(res2).append("\n");
		}
		
		
		System.out.println(sb);
		
		
	}

}
