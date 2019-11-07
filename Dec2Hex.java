import java.util.Scanner;
class Dec2Hex
{
    private static int Arg1;
    public static void main(String args[])
    {
		if (args.length > 0) //checking for arguments
		{
			try 
			{
				Arg1 = Integer.parseInt(args[0]); //setting Arg1 to value of the first argument
			} 
			catch (NumberFormatException e)  //checking if input is an integer
			{
				System.err.println("Argument" + args[0] + " must be an integer.");
				System.exit(0); //close application
			}
		}
		else if (args.length == 0) //checking for lack of arguments
		{
			System.out.println("Error! no input argument provided!");
			System.exit(0); //close application
		}
		
		//setting up hexadecimal values
		char ch[]={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
		int rem, num;
		num = Arg1;
		String hexadecimal=""; 
		System.out.println("Converting the Decimal Value " + num + " to Hex...");
		
		//converting decimal to hexadecimal
		while(num != 0)
		{
			rem=num%16;
			hexadecimal= ch[rem] + hexadecimal;
			num= num/16;
		}
		
		System.out.println("Hexadecimal representation is : " + hexadecimal);
		System.exit(0); //close application
	}
		
}