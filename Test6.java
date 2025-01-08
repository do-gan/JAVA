class jj 
{
	public static void login(String username,String password)
	{
		boolean isValidUser = false;
		switch(username)
		{
			case "ankan","souparno":
				isValidUser=true;
				break;
			default:
				System.out.println("Invalid User name");
				return;
		}
		if (isValidUser) 
		{
            switch (password) 
			{
                case "madhu","trisha":
                    System.out.println("Login successful! Welcome, " + username);
                    break;
                default:
                    System.out.println("Invalid password!");
                    break;
            }
		}
	}
    public static void main(String[] args) 
	{
		String a = args[0];
		String b = args[1];
		login(a,b);
    }
}