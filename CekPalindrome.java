import java.util.Scanner;

public class CekPalindrome {
    public static void main(String[] args) {
        
        String Kata, rev = "";
        Scanner Masukan = new Scanner(System.in);

        System.out.println(" Masukan kata/kalimat: ");
        Kata = Masukan.nextLine();

        int length = Kata.length();

        for ( int i=length-1; i>=0; i--){
            rev = rev + Kata.charAt(i);
        }

        if (Kata.equals(rev)){
            System.out.println(Kata+" Adalah sebuah Palindrome");
        }
        else {
            System.out.println(Kata+" Bukan Sebuah Palindrome");
        }

        Masukan.close();
    }
}
