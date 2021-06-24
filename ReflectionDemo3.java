package labExercise4;

public class ReflectionDemo3 {
	public static void main(String[] args)throws Exception {
		Students s=(Students)Class.forName("labExercise4.JavaStudents").getDeclaredConstructor().newInstance();
		System.out.println(s);
		 s=(Students)Class.forName("labExercise4.JavaStudents").getDeclaredConstructor(String.class).newInstance("ramu");
		System.out.println(s);
	}

}
abstract class Students{
	
}
class JavaStudents extends Students{
	JavaStudents(){
	}
		JavaStudents(String s){
			System.out.println(s);
		}
	
}