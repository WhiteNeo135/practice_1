import java.lang.String;
//second part lab1
public class Palindrome
{
    public static void isPalindrome(String[] args)
    {
        String s="";
        for (int i = 0; i < args.length; i++)
        {
            s = args[i];
            String revs=reverseString(s);
            if (revs.equals(s))
                System.out.println(s + " is a palindrome");
            else
                System.out.println(s + " isn't a palindrome");
        }
    }
    // for reversing
    public static String reverseString(String s)
    {
        char[] array = s.toCharArray();
        String revs="";
        for (int i = s.length()-1; i >= 0; i--)
        {
            revs += array[i];
        }
        return revs;
    }
}
