package main;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
 * 
 * https://www.acmicpc.net/problem/25285
 * 
 * */


public class Algorithm_220817_Backjoon_25285 {
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringBuilder sb = new StringBuilder();
		
		int T = Integer.parseInt(br.readLine());
		
		for(int i=0; i<T; i++) {
			
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			double h = Double.parseDouble(st.nextToken());
			double w = Double.parseDouble(st.nextToken());
			
			double h_m2 = (h/100)*(h/100);
			
			double BMI = w/h_m2;
			
			if(h < 140.1) sb.append(6).append("\n");
			
				
			else if(h >= 140.1 && h < 146) sb.append(5).append("\n");
			
			else if(h >= 146 && h < 159 ) sb.append(4).append("\n");
			
			else if(h >= 159 && h < 161 ) {
				
				if(BMI >= 16.0 && BMI < 35 ) sb.append(3).append("\n");
				
				else sb.append(4).append("\n");
				
				
				
			}
			
			else if(h>=161 && h<204) {
				
				if(BMI < 16.0 || BMI >= 35.0 ) sb.append(4).append("\n");
				
				else if( (BMI >=16.0 && BMI < 18.5) || (BMI >= 30.0 && BMI < 35.0 ) ) sb.append(3).append("\n");
					
				else if( (BMI >=18.5 && BMI < 20.0) || (BMI >= 25.0 && BMI < 30.0 ) ) sb.append(2).append("\n");
				
				else if(  BMI >=20.0 && BMI < 25.0  ) sb.append(1).append("\n");
				
				
			}else if(h>=204) sb.append(4).append("\n");
				
			
			
		} // for end
		
		System.out.println(sb);
		
	}
	
	
}
