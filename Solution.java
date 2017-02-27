import java.io.*;
import java.util.*;

public class Solution {


   
    
      
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
       int s = in.nextInt();
       int[] arr = new int[s];
       for(int i=0;i<s;i++){
            arr[i]=in.nextInt(); 
       }
   Insertion(arr);
	
	}
		
		//Insertion Sort
	
	private static void Insertion(int [] arr){
	
		int n = arr.length;
	
	  for(int i=1;i<n;i++){
		  
		  int SelectedValue = arr[i];
		  
		  int indexPosition = i;
		  
		  while(indexPosition > 0 && arr[indexPosition-1]> SelectedValue){
			  
			  arr[indexPosition] = arr[indexPosition-1];
			  
			 
				  
			  
			  
			  indexPosition--;
		  }//while loop end
		  
		  arr[indexPosition] = SelectedValue; 
		  PrintIt(arr);
	  }//for loop exit
	

		
	}
	
		//Array Printing
		private static void PrintIt(int [] arr){
		

	        for(int n: arr){
	         System.out.print(n+" ");
	        }
	        System.out.println("");
	    }
		
		
	}