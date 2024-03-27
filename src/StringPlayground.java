

public class StringPlayground {
    public static void main(String[] args) {

        String s = "((3+7)*2)";
        int count = parenthesesBalance(s);
        System.out.println(count);
    }


        public static int parenthesesBalance(String s){
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(') {
                count++; }
            else if (c == ')') {
                count--; }
        }
        return count;
    }
}