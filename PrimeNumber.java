import java.util.Scanner;
class  PrimeNumber
{
	static boolean isPrime(int number){
		int factors = 0;
		for (int i = 1; i <= number; i++)
		{
			if(number % i == 0){
				factors++;
			}
		}
		if(factors == 2)
			return true;
		else
			return false;
	}
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number:");
		int number = scan.nextInt();
		boolean result = isPrime(number);
		if(result)
			System.out.println("Given number " + number + " is a prime number");
		else
			System.out.println("Given number " + number + " is not a prime number");
	}
}