package package1;       //This java file is inside package named package1 inside src folder.
import java.util.Scanner;     //importing all classes from java's util library.. Because it has Scanner class which is used to take input from user.



/*
 * This assignment helped me to master the concept of super and this keywords.
 */

class car      //Declaring the class car
{
	int maxSpeed;       //Declaring the int variable maxSpeed.
	
	public car(int maxSpeed)       //Constructor of vehicle class.
	{
		this.maxSpeed=maxSpeed;        //Assigning the max speed variable with the parameter.
		System.out.println("This is the constructor of Car class."); 
	}
	
	public void displaySpeed()
	{
		System.out.println("The speed of the car is "+this.maxSpeed);      //Using 'this' keyword with variable.
	}
	
}


class skoda extends car        //Declaring skoda class which is the child class of car.
{
	int maxSpeed;         //Assigning the int variable maxSpeed.
	
	public skoda(int maxSpeed1,int maxSpeed2)
	{
		super(maxSpeed1);              //passing the value to constructor of superclass with 'super' keyword.
		this.maxSpeed=maxSpeed2;       //Assigning the max speed variable with the parameter.
		System.out.println("This is the constructor of skoda class."); 
	}
	
	public void display()
	{
		super.displaySpeed();      //Using 'super' keyword with method.
		this.displaySpeed();       //Using 'this' keyword with method.
	}
	
	public void displaySpeed()
	{
		System.out.println("The speed of the skoda is "+this.maxSpeed);     //Using 'this' keyword with variable.
	}
	
}


public class Assignment3_2     //Class declaration.
{
	public static void main(String[] args)    //main function declaration. and because it is static, program execution starts from main function.
	{
		int carSpeed,skodaSpeed;    //Declaring two int variables to store maximum speed of car and skoda.
		
		System.out.println("Enter the two numbers,One denoting maximum speed of car and other denoting maximum speed of skoda");
		// asking value of choice from the user.
        // for printing this on screen. we have used the inbuilt function println() of out stream of System class.
		
		
		//Now we want to take input of the values of speeds from the user.
      	// For taking input from the user, we have to make the object of Scanner class.
      	//And we have to pass System.in stream in the constructor of that object to read input from keyboard.
		Scanner sc=new Scanner(System.in);       //creating object of Scanner class.
		
		carSpeed=sc.nextInt();          //Initializing carSpeed variable with first value entered by user.
		skodaSpeed=sc.nextInt();        //Initializing skodaSpeed variable with second value entered by user.
		
		skoda carSpeedTest=new skoda(carSpeed,skodaSpeed);    //Creating the new object of class skoda which is inherited by car.
		//Passing the speeds of car and skoda to the constructor of the new created object.
		
		carSpeedTest.display();     //Invoking the method display.
		
		sc.close();       //Closing the scanner class object.
	}   //End of main function.
}  //End of class.