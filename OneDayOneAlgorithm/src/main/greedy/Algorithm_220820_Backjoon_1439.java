package main.greedy;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Algorithm_220820_Backjoon_1439 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String S = br.readLine();
		

		StringTokenizer st0 = new StringTokenizer(S,"0");
		StringTokenizer st1 = new StringTokenizer(S,"1");
		
		
		System.out.println( ( st0.countTokens() > st1.countTokens() ) ? st1.countTokens() : st0.countTokens() );
		
	}

}
