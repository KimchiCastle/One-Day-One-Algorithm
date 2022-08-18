package main.binarysearch;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;


/*
 * 
 * 	https://www.acmicpc.net/problem/19592
 * 
 */

public class Algorithm_220809_Backjoon_13706  {
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int T = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		
		
		for(int i=0; i<T; i++) {
			
			
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			//참가자수 N, 나는 N번째참가자
			int N = Integer.parseInt(st.nextToken());
			
			//트랙길이 X
			int X = Integer.parseInt(st.nextToken());
			
			//최대 부스터속도 Y
			int Y = Integer.parseInt(st.nextToken());
			
			int [] arr = new int[N];
			
			st = new StringTokenizer(br.readLine());
			
			for(int k=0; k<N; k++) {
				arr[k] = Integer.parseInt(st.nextToken());
			}
			
			//내 속도
			int MyS = arr[N-1];
			
			// 1등 속도
			int firstS = Arrays.stream(arr).max().getAsInt();
			
			//1등으로 도달할 수 있는 최소시간
			double MAX_T = X * 1.0 / firstS;
			
			//내가 부스터 쓰고 도달하는 최고 시간
			double MyB = 1 + 1.0 * (X-Y) / MyS;
			
			
			//부스터를 쓰지 않아도 이기면
			if(MyS>=firstS) {
				
				sb.append(0).append("\n");
				
				continue;
				
			//부스터를 써도 못이기면
			}else if( MyB >= MAX_T ) {
				
				sb.append(-1).append("\n");
				
				continue;
				
			}
			
			//이분탐색을 통해 최소부스터 시간 구하기
			
			int start = 0;
			int end = Y;
			int mid = 0;
			
			while(start<=end) {
				
				mid = (start + end)/2;
				
				double mt = 1 + 1.0 * (X-mid) / MyS;
				
				if(mt>=MAX_T) {
					
					start = mid +1;
					
				}else {
					end = mid-1;
				}
				
			}
			
			sb.append(start).append("\n");
			
		}
		
		
		System.out.println(sb.toString());
		
	}
	
	
}
