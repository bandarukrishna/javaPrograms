package practicePrograms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class duplicateElemAsList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {12,1,2,3,4,1,2,3,4,11,12,13,14,14};
		int l= a.length;
		List<Integer> lst=new ArrayList<Integer>();
		for(int i=0;i<l;i++) {
			for(int j=i+1;j<l;j++) {
				if(a[i]==a[j] && Collections.frequency(lst, a[i])==0) {
					
					lst.add(a[i]);
				}
			}
		}
System.out.println(lst);

	}

}
