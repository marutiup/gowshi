package ram;

public class Practics01100921 extends Practics1100921 {
	
	@Override
	public void dc() {
		// TODO Auto-generated method stub
		System.out.println("child class");
		super.dc();
	}
	
       
	
	public void hi() {
		System.out.println("child class");
		
	}
	
	
	
	
	

	public static void main(String[] args) {
		
		Practics01100921 ob=new Practics01100921();
		ob.hi();
		ob.dc();
		
	}

}
