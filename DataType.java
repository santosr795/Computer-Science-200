public class DataType {
	public static void main(String [] args){
		int a,b;
			a = 25;
			b = 12;
			
		double y,z;
			y = 2;
			z = 11;
		double sum = z + a;
		int product = a * b;
		double difference = b - a;
		double quotient = a / z;
		double remainder = z % y;
	System.out.println("a = " + a);
	System.out.println("b = " +  b);
	System.out.println("y = " + y);
	System.out.println("z = " + z);
	
	System.out.println("sum: z + a = " + sum);
	System.out.println("difference = b - a = " + difference);
	System.out.println("product = a * b = " + product);
	System.out.println("qoutient = a / z = " + quotient );
	System.out.println("remainder = z % y = " + remainder);
	}
}