package base;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner enter = new Scanner(System.in);
		
		System.out.println("How many attempts did you take this season?");
		double Attem = enter.nextInt();
		
		System.out.println("How many passes did you complete this season?");
		double Comp = enter.nextInt();
		
		System.out.println("How much yards did you get this season?");
		double Yards = enter.nextDouble();
		
		System.out.println("How many touchdown passes did you get this season?");
		double Tdown = enter.nextInt();
		
		System.out.println("How many interceptions did you get this season?");
		double Inter = enter.nextInt();
		
		enter.close();
		
		double a= (Comp/Attem-.3)*5;
		
		if (a > 2.375)
		{
			a= 2.375;
		}
		else if (a <0)
		{
			a = 0;
		}
		
		double b= (Yards/Attem-3)*.25;
		
		if (b > 2.375)
		{
			b= 2.375;
		}
		else if (b <0)
		{
			b = 0;
		}
		
		double c= (Tdown/Attem)*20;
		
		if (c > 2.375)
		{
			c= 2.375;
		}
		else if (c <0)
		{
			c = 0;
		}
		
		double d= 2.375-(Inter/Attem*25);
		
		if (d > 2.375)
		{
			d= 2.375;
		}
		else if (d <0)
		{
			d = 0;
		}
		
		double Prating = (((a+b+c+d)/6)*100);
		System.out.print("Your passer rating is ");
		System.out.printf("%.2f", Prating);
		System.out.print("!");
		
		
		
		

		

	}

}
