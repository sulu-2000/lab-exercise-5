package smweek4;

public class DecortorPattern {

	public static void main(String[] args) {
		Mall m=new MensWear(new WomensWear(new TraditionalFood()));
		System.out.println(m.go());
	}

}
abstract class Mall{
	abstract String go();
}
abstract class DressShop extends Mall{

}
abstract class FoodShop extends Mall{

}
class MensWear extends DressShop{
	Mall path;
	public MensWear() {
		
	}
	public MensWear(Mall path) {
		this.path=path;
		}
	@Override
	String go() {
		if(path==null)
			return " go to MensWear and return to home";
		else
			return " go to MensWear & "+path.go();
	}
}
class WomensWear extends DressShop {
	Mall path;
	public WomensWear() {
		
	}
	public WomensWear(Mall path) {
		this.path=path;
		}
	@Override
	String go() {
		if(path==null)
			return " go to WomensWear and return to home";
		else
			return " go to WomensWear & "+path.go();
	}
}
class FastFood extends FoodShop {
	Mall path;
	public FastFood() {
		
	}
	public FastFood(Mall path) {
		this.path=path;
		}
	@Override
	String go() {
		if(path==null)
			return " go to FastFood and return to home";
		else
			return " go to FastFood & "+path.go();
	}
}

class TraditionalFood extends FoodShop {
	Mall path;
	public TraditionalFood() {
		
	}
	public TraditionalFood(Mall path) {
		this.path=path;
		}
	@Override
	String go() {
		if(path==null)
			return " go to TraditionalFood and return to home";
		else
			return " go to TraditionalFood & "+path.go();
	}
}