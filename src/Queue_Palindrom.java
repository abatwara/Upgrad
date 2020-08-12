import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
class Queue_Palindrom {

    public void checkPalindrome(String input) {

        Queue<Character> q = new LinkedList<>();
        String reversedString = "";
        for(int i=input.length()-1;i>=0;i--)
        {
            q.add(input.charAt(i));
        }
        while (!q.isEmpty())
            reversedString+=q.remove();
        if(input.equals(reversedString))
            System.out.println("The given input is a palindrome.");
        else
            System.out.println("The given input is not a palindrome.");
    }
    public static void main(String[] args) {
        Queue_Palindrom obj = new Queue_Palindrom();
        Scanner in = new Scanner(System.in);
        String inputString = in .nextLine();
        obj.checkPalindrome(inputString);

    }
}

