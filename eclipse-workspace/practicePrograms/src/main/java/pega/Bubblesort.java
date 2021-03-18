package pega;

import java.util.Arrays;

public class Bubblesort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a[]= {14,3,5,7,8,6,1,47,23,22,19};
bubblesort(a);
	}

	
	static void bubblesort(int a[]) {
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length-1-i;j++)
			{
				if(a[j]>a[j+1])
				{
			     int temp = a[j];
			     a[j]=a[j+1];
			     a[j+1]=temp;
			    }
				
			}
			System.out.println(Arrays.toString(a));
		}
		
		
	}
}
