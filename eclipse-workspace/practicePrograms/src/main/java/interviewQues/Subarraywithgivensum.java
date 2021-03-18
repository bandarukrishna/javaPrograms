package interviewQues;
public class Subarraywithgivensum {
	/*Given an unsorted array A of size N that contains only
   non-negative integers, find a continuous sub-array which 
   adds to a given number S.
	Example 1:
	Input:
	N = 5, S = 12
	A[] = {1,2,3,7,5}
	Output: 2 4
	Explanation: The sum of elements 
	from 2nd position to 4th position 
	is 12.*/
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int A[] = {1,2,3,4,5,6,7,8,9,10};
     subarraySum(A,A.length,15);//A=Array, length, requiredsum
	}
static void subarraySum(int[] arr, int n, int s) {
    // Your code here
	for(int i=0;i<n-1;i++) {
		int subArrysum=arr[i];
		for(int j=i+1;j<n;j++) {
			subArrysum=subArrysum+arr[j];
			if(subArrysum==s) {
				System.out.println("Start index: "+i+" end index: "+j);
			}
			
		}
	}
        
    }
}
