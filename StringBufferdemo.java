public class StringBufferdemo {

	public static void main(String []args) {
		String firstName = "Ron";
		String secName = "Santos";
		
		//It chooses  character from secNam its starts from Zero
		System.out.println(secName.charAt(3));
		System.out.println(firstName.concat(secName));
		System.out.println(firstName.equals(secName));
		System.out.println(firstName.equalsIgnoreCase(firstName));
		System.out.println(firstName.indexOf(secName));
		System.out.println(secName.lastIndexOf(secName));
		System.out.println(secName.toLowerCase());
		System.out.println(firstName.toUpperCase());
		System.out.println(firstName.replace("R", "S"));
		System.out.println(firstName.substring(2));
		System.out.println(secName.substring(1, 3));
		System.out.println(String.valueOf( secName));
		System.out.println(firstName.trim());
		
		StringBuilder builder = new StringBuilder("I don know");
		
		StringBuffer buffy = new StringBuffer("I Finally got it");
		
		System.out.println(buffy.capacity());
		System.out.println(builder.length());
		System.out.println(buffy.replace(2, 3 , "String"));
		System.out.println(builder.append("String"));
		
		String password = "Hello";
		
	}
}