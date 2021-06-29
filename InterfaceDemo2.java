package smweek4;

public class InterfaceDemo2 {
public static void mySomeMethod() {
	System.out.println("my some method is called...");
}
public void myAnotherMethod() {
	System.out.println("my another logic is called...");
}
	public static void main(String[] args) {
	Teacher teacher=InterfaceDemo2::mySomeMethod;
	teacher.doTeach();
	
	teacher=new InterfaceDemo2()::myAnotherMethod;
	teacher.doTeach();

	}

}
interface Teacher{
	public void doTeach();
}