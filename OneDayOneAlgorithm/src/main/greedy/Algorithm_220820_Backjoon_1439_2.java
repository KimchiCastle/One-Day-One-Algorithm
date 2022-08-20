package main.greedy;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Algorithm_220820_Backjoon_1439_2 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String S = br.readLine();
		
		char one = '1';
		char zero = '0';
		
		
		int count1 = 0;
		int count0 = 0;
		
		if(S.charAt(0)==zero) count1++;
		else count0++;
		
		for(int i=0; i<S.length()-1; i++) {
			
			if(S.charAt(i)==one) {
				
				if(S.charAt(i+1)!=one) {
					
					count1++;
					
				}
				
				
			}else if(S.charAt(i)==zero) {
				
				if(S.charAt(i+1)!=zero) {
					count0++;
				}
				
				
			}
			
			
		}

		
		
		System.out.println(Math.min(count1, count0));
		
		
	}

}
