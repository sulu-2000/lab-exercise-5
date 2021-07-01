package smweek4;

public class InterfaceDemo {
	public static void main(String[] args) {
		alopathyhospital alo=new alopathyhospital();
		doctor doctor=(doctor)alo;
		nurse nurse =(nurse)alo;
		alo.docure();
		alo.nurse_care();
		homeopathyhospital homeo=new homeopathyhospital();
		homeo.docure();
	}
}
interface doctor{
	public void docure();
}
interface surgion extends doctor{

}
interface nurse{
	public void nurse_care();
}
class alopathyhospital implements doctor,nurse{
	public void docure() {
		System.out.println("doctor docure method is overriden...");
	}
	public void nurse_care() {
		System.out.println("nurese nurse_care methods is overriden....");
	}
}
class homeopathyhospital implements doctor{
	public void docure() {
		System.out.println("doctor docure method is overriden...in hemeopathyhospital...");
	}
}