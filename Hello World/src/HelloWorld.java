
public class HelloWorld {

	/**
	 * @param args
	 */
	public static void main(String[] arguments) {
		float x = 9;
		float y = 5;
		int z = (int)(x / y);
		System.out.print("z=" + z);
		System.out.print("\nx=" + x);
		System.out.print("\ny=" + y);
		switch (z) {
			case 1:
				x = x + 2;
				System.out.print("\ncase1 x=" + x);
			case 2:
				x = x + 3;
				System.out.print("\ncase2 x=" + x);
			default:
				x = x + 1;
		}
		System.out.println("\nValue of x: " + x);
		
		HelloWorld hiObj = new HelloWorld();
		hiObj.aFunction();
	}
	
	public void aFunction() {
		System.out.println("This is a function");
	}
}
