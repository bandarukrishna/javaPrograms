package practicePrograms;

public class ReverseStringRecursion {
	
	public static void main(String[] args) {
		String s="carvia";
		System.out.println(s.substring(1));
		System.out.println((s.substring(1)) + s.charAt(0));
		System.out.println(reverse(s));
	}
    
	
	static String reverse(String input) {
        if (input.isEmpty()) {  
           // System.out.println("String is empty now");
            return input;
        }
        return reverse(input.substring(1)) + input.charAt(0);   
    }
}
