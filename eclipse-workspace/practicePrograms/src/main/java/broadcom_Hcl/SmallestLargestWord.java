package broadcom_Hcl;

import java.util.Stack;

public class SmallestLargestWord {
/* input
 "Hardships often prepare ordinary people for an is extraordinary destiny"
 * output
smallest words:[an, is]
Largest words: extraordinary
 * */
    public static void main(String[] args) {
        String string = "Hardships often prepare ordinary people for an is extraordinary destiny";
        String word = "", small = "", large = "";
      // String[] words = new String[100];
      //  int length = 0;
        Stack < String > stksmall = new Stack < String > ();
        Stack < String > stk = new Stack < String > ();
        //Add extra space after string to get the last word in the given string    
      //  string = string + " ";
        String[] words=string.split(" ");
        int length =words.length;
  /*      for (int i = 0; i < string.length(); i++) {
            //Split the string into words    
            if (string.charAt(i) != ' ') {
                word = word + string.charAt(i);
            } else {
                //Add word to array words    
                words[length] = word;
                //Increment length    
                length++;
                //Make word an empty string    
                word = "";
            }
        }*/
        //Initialize small and large with first word in the string    
        small = large = words[0];

        //Determine smallest and largest word in the string    
        for (int k = 1; k < length; k++) {

            //If length of small is greater than any word present in the string    
            //Store value of word into small    
            int l = words[k].length(), s = small.length();
            if (s >= l) {
                small = words[k];
                if (s == l) {
                    stksmall.push(small);
                } else {
                    stksmall.clear();
                    stksmall.push(small);
                }

            }
            //If length of large is less than any word present in the string    
            //Store value of word into large    
            if (large.length() < words[k].length()) {
                large = words[k];
            }

        }

        System.out.println("smallest words:" +stksmall);

        // System.out.println("Smallest word: " + small);    
        System.out.println("Largest words: " + large);
    }
}