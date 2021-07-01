package smweek4;

public class CloningDemo1{
	public static void main(String[] args) {
		sheep mothersheep =new sheep();
		mothersheep.name="i am mothersheep.....";
		sheep dolly= mothersheep.createclone();
		dolly.name="i am dolly";
		System.out.println("mather name...."+mothersheep.name);
		System.out.println("child name.... "+dolly.name);
	}
}
class sheep implements Cloneable{
	public sheep() {
		System.out.println("sheep is created....");
	}
	String name;
	public sheep createclone(){
		try {
		return(sheep)super.clone();	
		}catch(CloneNotSupportedException cne) {
			cne.printStackTrace();
			return null;
		}

	}
}