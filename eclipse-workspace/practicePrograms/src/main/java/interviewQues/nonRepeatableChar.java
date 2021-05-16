package interviewQues;

public class nonRepeatableChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		method();
	}
static void method() {
	String str = "zzzzzbbbckcccddehhhhiii";
	int[] countingArray = new int[128];
	str.chars().forEach(value -> countingArray[value]++);
	int nonRepeatingCharAsInt = 0;
	for (int i = 0; i < countingArray.length; i++) {
	    if (countingArray[i] == 1) {
	      //  nonRepeatingCharAsInt = i;
	        System.out.println("character = " + Character.valueOf((char) i));
	       // break;
	    }
	}
	//System.out.println("character = " + Character.valueOf((char) nonRepeatingCharAsInt));
}
}
