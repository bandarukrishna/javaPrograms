package practicePrograms;

public class StringSorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String a[]= {"krish","vijji","chanti","java","selenium"},temp;

for(int i=0;i<a.length;i++) {
	for(int j=i+1;j<a.length;j++) {
		if(a[i].compareTo(a[j])>0) {
			temp=a[i];
			a[i]=a[j];
			a[j]=temp;
		}
	}
}
for(String s:a) {
	System.out.println(s);
}
	}

}
