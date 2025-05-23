import java.util.*;
class Reverse {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        String reverse = "";
        for (int i = str.length()-1; i >= 0; i--) {
            reverse = reverse+str.charAt(i);
        }
        System.out.println(reverse);
    }
}
