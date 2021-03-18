package practicePrograms;

import java.util.Arrays;

public class firstandFinaloccurenaceofNumber {
	public static void main(String args[]){  
		
		/*input: 
			[2, 3, 5, 1, 4, 7, 8, 6, 9, 10]
			after sorting: 
			1 2 3 4 5 6 7 8 9 10 
			output:
			1 10 2 9 3 8 4 7 5 6 */
	int arr[]= {2,3,5,1,4,7,8,6,9,10};
	int temp;
	System.out.println("input: "+"\n"+Arrays.toString(arr));
	for(int i=0;i<arr.length;i++) {
		for(int j=i+1;j<arr.length;j++) {			
			if(arr[i]>arr[j]) {
				temp =arr[i];
				arr[i]= arr[j];
				arr[j]=temp;
			}
		
	}
		}
	System.out.print("after sorting: "+"\n");
	for(int k=0;k<arr.length;k++) {
	
		System.out.print(arr[k]+" ");	
	}
	System.out.println("\n" +"output:");
	for( int a=0;a<arr.length/2;a++) {
		
		System.out.print(arr[a]+" "+arr[arr.length-a-1]+" ");

	}
	if(arr.length%2!=0) {
		System.out.print(arr[(arr.length/2)]);
	}
	}
}
