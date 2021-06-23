package labExercise4;

import java.util.Scanner;

public class ReflectionDemo {

	public static void main(String[] args) throws Exception{
		Paint StaticPaint=new RedPaint();
		System.out.println("object created through staic way..:"+StaticPaint);
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter the qualified class name...");
		String paintClass=scan.next();
		Paint dynamicPaint=(Paint)Class.forName(paintClass).newInstance();
		System.out.println("object created through dynamic way...:"+dynamicPaint);
		Paint s=(Paint)Class.forName(paintClass).getConstructor().newInstance();
		System.out.println("object created through dynamic way...:"+dynamicPaint);
	}

}
abstract class Paint{
	
}
class RedPaint extends Paint{
	public RedPaint() {
		
	}
}
class BluePaint extends Paint{
	public BluePaint() {
		
	}
}