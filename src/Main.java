//done
public class Main
{
    public static void main(String[] args)
    {
        for (int i = 2; i < 101; i++)
        {
            if (Primes.isPrime(i))
            {
                System.out.println(i);
            }
        }
        String[] s={"java","madam","Palindrome", "racecar","apple","kayak","song","noon"};
        Palindrome.isPalindrome(s);
    }
}
