package main;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

/*
 * 
 *   https://www.acmicpc.net/problem/10815
 * 
 * 
 * */



public class Algorithm_220808_Backjoon_10815 {
	
	
	public static void main(String[] args) throws Exception {
		
/*
5
6 3 2 10 -10
8
10 9 -5 2 3 4 5 -10


*/		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = null;
		
		int n = Integer.parseInt(br.readLine());
		
		int arr [] = new int[n];
		
		st = new StringTokenizer(br.readLine());
		
		
		for(int i=0; i<n; i++) {
			
			arr[i] = Integer.parseInt(st.nextToken());
			
		}
		
		//탐색될 애는 정렬되어 있어야 한다.
		Arrays.sort(arr);
		
		int r = Integer.parseInt(br.readLine());
		
		st = new StringTokenizer(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		
		
		
		for(int i=0; i<r; i++) {
			
			
			int search = Integer.parseInt(st.nextToken());
			sb.append(binarysearch(arr,n,search)+" ");
			
			
			
			
		}
		
		
		
		System.out.println(sb.toString());
		
		
		
	}

	private static int binarysearch(int[] arr, int n, int search) {
		// TODO Auto-generated method stub
		
		int first = 0;
		int last = n -1;
		int mid = 0;
		
		
		//시작이 끝보다 커지거나 같을때 까지
		while(first <= last) {
			
			mid = (first + last)/2; // 중간 인덱스
			
			
			
			if (arr[mid]==search) {
				
				return 1;
				
			}else if(arr[mid] < search){
				
				first = mid+1;
				
			}else {
				
				last = mid - 1;
				
			}
			
			
		}
		
		return 0;
	}
	
	
	
}
