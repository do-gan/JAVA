class jj 
{
    public static void call() 
	{
		for(int i=1;i<=7;i++)
		{	
			if(i==3){
				System.out.println("i am 3");
				continue;}
			if(i==5){
				System.out.println("i am 5");
				continue;}			
			System.out.println(i);
			
		}
    }
	public static void main(String[] args)
	{
		call();
	}
}