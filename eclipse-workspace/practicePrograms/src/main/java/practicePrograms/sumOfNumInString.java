package practicePrograms;
public class sumOfNumInString {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        /*Input:- aa123bb4
        Output:- 127
        Input:- bbb5cc5dd12
        Output:- 22*/
        String s = "aa123bb4";
        int sum = 0;
        String k[] = s.split(("[a-zA-Z]"));
        for (int j = 0; j < k.length; j++) {

            if (k[j].length() != 0) {

                int i = Integer.parseInt(k[j]);
                sum = sum + i;
            }
        }
        System.out.println(sum);
    }

}