package practicePrograms;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class NoOfWordsCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//input
		//out put Saket 2 by 1 this 1 This 1 is 2 done 1 
		String str = "This this is is done by Saket Saket";
		String s[]=str.split(" ");
		Map<String, Integer> m=new HashMap<String,Integer>();
		for(int i=0; i<s.length;i++) {
			if(m.containsKey(s[i])) {
				int count=m.get(s[i]);
				m.put(s[i],count+1);
			}
			else {
				m.put(s[i],1);
			}
		}
for(Map.Entry m1:m.entrySet())
{
	System.out.print(m1.getKey()+" "+m1.getValue()+" ");
}

//iterator using while
System.out.println();
Iterator itr = m.entrySet().iterator();
while(itr.hasNext()) {
    Map.Entry me = (Map.Entry) itr.next();
    System.out.print(me.getKey() + " " + me.getValue()+" ");
}
	}

}
