package amzon;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
public class twoIntEqualtoGivenValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {1,3,5,7,9,2,4,6,8};
		System.out.println("Enter target sum");
		Scanner sc = new Scanner (System.in);  		
		int givenNum=sc.nextInt();
		List<Integer>  list= IntStream.of(a)
                .boxed()
                .collect(Collectors.toList());
		for(int i=0;i<a.length;i++) {
			int k=givenNum-a[i];
			if(list.contains(k) && k!=a[i]) {
				System.out.println("Vales are "+a[i] +"and" +k);
				//break;
			}
		}
	}

}
