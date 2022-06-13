import java.util.Scanner;

public class palindrome {
    static void checkPalindrome(String input){
        boolean res = true;
        int len = input.length();
        for(int i=0;i<=len/2;i++){
            if (input.charAt(i)!=input.charAt(len-i-1)) {
                res = false;
                break;
            }
        }
        if (res) {
            System.out.println("The input given is Palindrome!");
        }
        else{
            System.out.println("The input is not Palindrome!");
        }
    }
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the String:");
        String str = obj.next();
        checkPalindrome(str);
    }
}
