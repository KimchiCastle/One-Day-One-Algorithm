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
		
		//테스트케이스 숫자받기
		int tc = Integer.parseInt(br.readLine());
		
		
		//출력할 SB 선언
		StringBuilder sb = new StringBuilder();
		
		
		//배열 선언... 굳이 할 필요가 없어 보이긴함
		String [] arr = new String[tc];
		
		//반복문 돌면서
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
		
		//저장된 sb 출력
		System.out.println(sb.toString());
		
		
	}

}
