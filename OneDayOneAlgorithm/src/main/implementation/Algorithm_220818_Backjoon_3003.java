package main.implementation;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


/*
 * 
 * https://www.acmicpc.net/problem/3003
 * 
 * */


public class Algorithm_220818_Backjoon_3003 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		final int King = 1;
		final int Queen = 1;
		final int Rook = 2;
		final int Bishop = 2;
		final int Knight = 2;
		final int Pawn = 8;
		
		StringBuilder sb = new StringBuilder();
		
		
			
		sb.append(King-Integer.parseInt(st.nextToken())).append(" ");
		sb.append(Queen-Integer.parseInt(st.nextToken())).append(" ");
		sb.append(Rook-Integer.parseInt(st.nextToken())).append(" ");
		sb.append(Bishop-Integer.parseInt(st.nextToken())).append(" ");
		sb.append(Knight-Integer.parseInt(st.nextToken())).append(" ");
		sb.append(Pawn-Integer.parseInt(st.nextToken())).append(" ");
			
		System.out.println(sb);
		
		
	}

}
