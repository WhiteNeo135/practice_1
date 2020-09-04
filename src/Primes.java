//first part lab1
public class Primes
{
    public static boolean isPrime(int n)
    {
        boolean correct=true;
        for (int i=2; i<n; i++)
        {
            if (n % i == 0)
            {
                correct = false;
                break;
            }
        }
        return correct;
    }
}
