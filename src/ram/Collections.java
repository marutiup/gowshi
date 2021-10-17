package ram;

public class Collections {

	public static void main(String[] args) {
	
		String a="hai sri its me ";
		
		int length = a.length();
		
		System.out.println(length);
		
		boolean contains = a.contains("me");
		System.out.println(contains);
		boolean equals = a.equals("hai sri its me");
		System.out.println(equals);
		boolean equalsIgnoreCase = a.equalsIgnoreCase("hai sri its me");
		System.out.println(equalsIgnoreCase);
		String upperCase = a.toUpperCase();
		System.out.println(upperCase);
		String lowerCase = a.toLowerCase();
		System.out.println(lowerCase);
		String trim = a.trim();
		System.out.println(trim);
		int hashCode = a.hashCode();
		System.out.println(hashCode);
		int indexOf = a.indexOf("i");
		System.out.println(indexOf);
		int lastIndexOf = a.lastIndexOf("i");
		System.out.println(lastIndexOf);
		String replace = a.replace("hai", "hello");
		System.out.println(replace);
		
		
		
		

	}

}
