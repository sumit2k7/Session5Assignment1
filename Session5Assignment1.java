import java.util.Scanner;

public class Session5Assignment1 extends Area {
	public int CalculateArea(int len, int bre)
	{
		return len*bre;
	}
	public static void main(String[] args) {
		int len,bre;
		char option;
		Scanner sc=new Scanner(System.in);
		System.out.println("Press R to Calculate are of Rectange and Press T to Calculate Area of Triangle");
		option=sc.next().charAt(0);
		Area aa=new Area();
	
		if(option=='R')
		{
			System.out.println("Enter Length and Breadth of Rectangle");
			len=sc.nextInt();
			bre=sc.nextInt();
		System.out.println("Area of Rectangle is :-> "+	aa.CalculateArea(len, bre));
		}
		else if(option=='T')
		{
			System.out.println("Enter Height and Base of Triangle");
			len=sc.nextInt();
			bre=sc.nextInt();
		System.out.println("Area of Rectangle is :-> "+	aa.CalculateArea(len, bre)/2);
		}
		sc.close();
		

	}

}

class Area
{
	private int x;
	private int y;
	
	public  int CalculateArea(int x,int y)
		{
		return x*y;
		}
}
