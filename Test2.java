class jj
{
    public static void main(String[] args) 
	{
		String name1=args[0];
        call(name1);
    }
	public static void call(String name)
	{ 
		for(int i=0;i<name.length();i++)
		{
			char ch = name.charAt(i);
			if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' )
				System.out.println(ch + " is vowel");
			else
				System.out.println(ch + " is consonant");
			
		}		
	}
}