import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Anagram{
    //Method to check if two strings are anagram of each other or not
    public static boolean check(String str1, String str2){
        char[] ch1 = str1.toLowerCase().toCharArray();
        char[] ch2 = str2.toLowerCase().toCharArray();
        //Write your code here
        arrange(ch1);
        arrange(ch2);
        if(Arrays.equals(ch1,ch2))
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    //Method to sort the character array
    public static void arrange(char[] ch){
        for(int i=0;i<ch.length;i++)
        {
            for(int j=i;j<ch.length;j++)
            {
                if(ch[i]>ch[j])
                {
                    char temp = ch[j];
                    ch[j] = ch[i];
                    ch[i] = temp;
                }
            }
        }
    }

    public static void main(String[] x){
        Map<String,String> map = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        String key;
        String value;
        for(int i = 1; i <= num; i++){
            key = sc.next();
            value = sc.next();
            map.put(key,value);
        }
        boolean anagram = false;
        for(String s1 : map.keySet())
        {
            if(check(s1,map.get(s1)))
            {
                anagram = true;
                System.out.println(s1+":"+map.get(s1));
            }

        }
        if(!anagram)
            System.out.println(anagram);
    }
}
