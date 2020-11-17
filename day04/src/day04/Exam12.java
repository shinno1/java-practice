package day04;

public class Exam12 {
	public static void main(String[] args) {
		int[] arr = new int[10];
		int min = 1000;
		int max = 0;
		
		for (int i = 0; i < arr.length ; i++) {
			arr[i] = (int)(Math.random() * 100 + 1);
		}
		
		for(int i = 0 ; i < arr.length ; i++) {
			System.out.print(arr[i] + " ");
		}
		
//		for(int e : arr) {
//			System.out.println(e + " ");
//		}
		
		System.out.println();
		
//		for (int i = 0 ; i < arr.length ; i++) {
//			if (arr[i] < min) {
//				min = arr[i];
//			}
//			
//			if (arr[i] > max) {
//				max = arr[i];
//			}
//		} System.out.println("min : " + min);
//		  System.out.println("max : " + max);
		
		  for (int i = 0 ; i < arr.length ; i++) {
				if (arr[i] < min) {
					min = arr[i];
				}
				
				if (arr[i] > max) {
					max = arr[i];
				}
		
		  }	
		  //for-each문으로 변환
		  for(int e : arr) {
			  if(e > max) {
				  max = e;
			  }
			  
			  if(e < min) {
				  min = e;
			  }
			  
			  
		  }
		  System.out.println("max = " + max + " / min = " + min);
		  
		  
		  
		  
	} 
		
		
		
		
		
		
		
		
		
		
		
}
