package main.implementation;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
 * 
 * https://www.acmicpc.net/problem/3048
 * 
 * */


public class Algorithm_220821_Backjoon_3048 {
	
	
	public static void main(String[] args) throws Exception {
		
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		
		
		int N1 = Integer.parseInt(st.nextToken());
		int N2 = Integer.parseInt(st.nextToken());
		
		char Rant [] = new char[N1];
		char Lant [] = new char[N2];
		
		boolean RLcheck [] = new boolean[N1+N2]; 
		char ant [] = new char[N1+N2];
		
		String ant1_str = br.readLine();
		String ant2_str = br.readLine();
		
		int T = Integer.parseInt(br.readLine());

		
		int a = N1;
		for(int i=0; i<Rant.length; i++) {
			
			Rant[i] = ant1_str.charAt(--a);
			
		}
		
		for(int i=0; i<Lant.length; i++) {
			Lant[i] = ant2_str.charAt(i);
		}
		
		for(int i=0;i<N1; i++) {
			
			ant[i] = Rant[i];
			RLcheck[i] = true;
		}
		
		for(int i=N1; i<ant.length;i++) {
			
			ant[i] = Lant[i-N1];
			
			RLcheck[i] = false;
			
			
		}

	
		while (T-- > 0) {
			for (int i = 0; i < ant.length - 1; i++) {
				if (RLcheck[i] == true && RLcheck[i + 1] == false) {
					// 개미 위치 바꾸기
					char tmp = ant[i];
					ant[i] = ant[i + 1];
					ant[i + 1] = tmp;
					
					
					// 개미 상태변수 바꾸기
					boolean tmp2 = RLcheck[i];
					RLcheck[i] = RLcheck[i + 1];
					RLcheck[i + 1] = tmp2;
			
					i++;
				}
			}

		}
		

		for (char ch : ant) {
			sb.append(ch);
		}

		
		System.out.println(sb);
		
		
	}
	
	
}
