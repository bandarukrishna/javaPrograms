package amzon;

import java.util.Arrays;

public class missingNuminArray {
	static int misngNum,sumofArray=0;
	public static void main(String[] args) {
		int[] a= {1,3,5,7,9,2,4,6};
		Arrays.sort(a);
		for(int i=1;i<=a.length;i++) {
			if(i!=a[i-1]) {
				misngNum=i;
				break;
			}
			
		}
	System.out.println(misngNum);
//method 2
int l=a.length+1;
int sumofseries =l*(l+1)/2;
for(int i=0;i<a.length;i++) {
	sumofArray=sumofArray+a[i];
}
System.out.println("missing Num: "+(sumofseries-sumofArray));
	}

}
