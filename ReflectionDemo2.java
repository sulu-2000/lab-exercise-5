package labExercise4;

public class ReflectionDemo2 {

	public static void main(String[] args)throws Exception
	{
		Politician p=new AbcPolitician("ramu","father ramu");
				System.out.println(p);
				p=(Politician)Class.forName("labExercise4.AbcPolitician").getConstructor(new Class[] {String.class,String.class}).newInstance("dynamic ramu","dynamic father ramu");
				System.out.println("dynamic ramu...."+p);
				p=(Politician)Class.forName("labExercise4.AbcPolitician").getConstructor(String.class,String.class).newInstance("new dynamic ramu","new dynamic father ramu");
				System.out.println("new dynamic ramu...."+p);
	}

}
abstract class Politician{
	
}
class AbcPolitician extends Politician{
	String name;String fname;
	public AbcPolitician(String name, String fname) {
		this.name=name;this.fname=fname;
	}
	@Override
	public String toString() {
		return "the object is..:"+this.name+":"+this.fname;
	}
}
class XyzPolitician extends Politician{
	
}