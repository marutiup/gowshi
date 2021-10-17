package ram;

public  class Practics1100921 {
	public void sri() {
		System.out.println("hai");
		}
	
		public void sri(int a) {
			System.out.println("hai sriram");
		}
		public void dc() {
			System.out.println("dc");
		}
		
		public static void main(String[] args) {
			
			String sri="   hi sri ";
			
			char charAt = sri.charAt(3);
			System.out.println(charAt);
			boolean contains = sri.contains(" ");
			System.out.println(contains);
			boolean ignoreCase = sri.equalsIgnoreCase(sri);
			System.out.println(ignoreCase);
			byte[] bytes = sri.getBytes();
			System.out.println(bytes[2]);
			String trim = sri.trim();
			System.out.println(trim);
			String replace = sri.replace("hi", "hai");
			System.out.println(replace);
			String upperCase = sri.toUpperCase();
			System.out.println(upperCase);
			
			
		}
		
	}


