class jj 
{
    public static boolean isPrime(int number) 
	{
        if (number <= 1) {
            return false;
        }
        
        for (int i = 2; i < number; i++) 
		{
            if (number % i == 0) 
                return false; 
        }
        return true;
    }
    public static boolean isOdd(int number) 
	{
        return number % 2 != 0;
    }

    public static void call() 
	{
        int number = 7;
        if (isPrime(number)) 
		
            System.out.println(number + " is a prime number.");
        else
            System.out.println(number + " is not a prime number.");
		
        if (isOdd(number))
            System.out.println(number + " is an odd number.");
        else 
            System.out.println(number + " is an even number.");
    }
	public static void main(String[] args)
	{
		call();
	}
}
