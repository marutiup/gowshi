package ram;

public class Good_morning {

	public static void main(String[] args) {

		
		String sri="good morning";
		String ram="GOOG MORNING ";
		
		int i = sri.compareToIgnoreCase(ram);
		String[] split = sri.split(ram);
		System.out.println(split);
		
		
		
		
		System.out.println(i);
		
		System.out.println(sri.substring(5));
		
		
		
		
	}

}
