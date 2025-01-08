class jj 
{
    public static void UsingForLoop()
	{
        System.out.println("Using for loop:");
        for (int i = 1; i <= 10; i++) 
			System.out.print(i + " ");
    }
    public static void UsingWhileLoop() 
	{
        System.out.println("Using while loop:");
        int i = 1;
        while (i <= 10) {
            System.out.print(i + " ");
            i++;
        }
    }
    public static void UsingDoWhileLoop() 
	{
        System.out.println("Using do-while loop:");
        int i = 1;
        do 
		{
            System.out.print(i + " ");
            i++;
        } 
		while (i <= 10);
    }

    public static void main(String[] args) {
        UsingForLoop();
        UsingWhileLoop(); 
        UsingDoWhileLoop(); 
    }
}