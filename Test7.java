class jj
{
	public static void nameUser(String name1,String name2,String name3)
	{ 
		int len1 = name1.length();
        int len2 = name2.length();
        int len3 = name3.length();
		switch ((len1 > 3 ? 1 : 0) + (len2 > 3 ? 1 : 0) + (len3 > 3 ? 1 : 0))
		{
			case 3:
				System.out.println("Greet the user: All names are valid!");
				break;
			default:
				System.out.println("sorry");
				break;
		}
	}
	public static void main(String[] args)
	{
		String a = args[0];
		String b = args[1];
		String c = args[2];
		cal(a,b,c);
		nameUser(a,b,c);
		
	}
	public static void cal(String aa,String bb,String cc)
	{
		System.out.println(aa+" user 1 length is "+aa.length());
		System.out.println(bb+" user 2 length is "+bb.length());
		System.out.println(cc+" user 3 length is "+cc.length());
	}
}