class jj 
{
    public static void call() 
	{
		int num=10;
		int num1=20;
		int num2=25;
		int largest = Math.max(num, num1); 
		int sum=num+num1;
		int smallest = Math.min(sum, num2);
		System.out.println("is the largest "+largest);
        System.out.println("is the smallest "+smallest);
    }
	public static void main(String[] args)
	{
		call();
	}
}