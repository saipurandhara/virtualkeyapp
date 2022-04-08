package com.lock;
import java.util.Scanner;
public class DemoLock {
	

	public static void main(String[] args) {
	System.out.println("**************************************************************************************************************");		
                        
	    System.err.println("            ******************* LockedMe.com **************        ");
                      System.err.println("Developer details: ");
	   System.err.println( "                       V Sai Purandhara    ");                             
                      System.err.println("                 Email Id : purandhara999@gmail.com      "); 
            
                    System.out.println("                                                                            ");           
                    System.out.println(" **************************************************************************************************************"); 
	

		// TODO Auto-generated method stub
		
		Scanner in= new Scanner(System.in);
	
		boolean mainLoop=true;
		int choice;
while(true) {

//Display the menu
	
System.out.println();
System.out.println("         ************** Welcome to  File Management System ****************                       ");
System.out.println("Thank you for using DemoLock....");
	


System.out.println(" Operation  are available:   ");
System.out.println(" 1 : Display names of all  existing files in The Directory");
System.out.println(" 2 : Display The Menu ");
System.out.println(" 3 : Exit ");


System.out.println();
System.out.println();
System.out.println("*******************************");
System.out.print("Please Enter a Number of above which task you want to perfrom: ");


//Get user choice
 choice = in.nextInt();

//Display the title of the chosen  module
switch (choice)
{
case 1:
	ShowallFiles sf = new ShowallFiles();
	sf.Show();
	
	
	break;
	
case 2:
	FileManagement fn=new FileManagement();
	fn.Filemenu();
	
	
	break;

case 3:
	
	System.out.println("Exiting from the Program....");
                    System.out.println("Thank you for using Lockedme....");
                    System.out.println("Have a good Day");
	 System.exit(0);
	break;
default:
	 System.out.println("Incorrect option Choosed! Please enter another Choice Number");

break;

}
	}

}
	
}