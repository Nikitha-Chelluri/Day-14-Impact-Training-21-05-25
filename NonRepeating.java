import java.util.*;
class NonRepeating {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        String str2 = "";
        for (int i = 0; i < str.length(); i++) {
            char n = str.charAt(i);
            if (str.indexOf(n) == str.lastIndexOf(n)){
                System.out.println(n);
                break;
            }
        }
    }
}