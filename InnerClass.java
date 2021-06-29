package smweek4;

public class InnerClass {

	public static void main(String[] args) {
		Kali kalimark=new Kali();
		kalimark.sellCola();
		
		Pepsi pepsico=new Pepsi ();
		pepsico.sellCola();
	}

}
interface Cola{
	public void makeCola();
}
class Pepsi{
	public void sellCola() {
		Cola cc=new Kali().thief();
		cc.makeCola();
		System.out.println("pepsi fills campa cola in pepsi bottle and sell....");
	}
}
class Kali{
	public void sellCola() {
		class CampCola implements Cola{
			@Override
			public void makeCola() {
				System.out.println("cola made by campa cola...");
			}
		}
		CampaCola cc=new CampaCola();
		cc.makeCola();
		System.out.println("kali fills campa cola in bovonto bottle and sell..");
	}
	public Cola thief() {
		return new CampaCola();
	}
	private class CampaCola implements Cola{
		@Override
		public void makeCola() {
			System.out.println("cola made by campa cola...");
		}
	}
}