
public class Wrapper {

	public static void main(String[] args) {
		
		/*
		 * valueOf()  
		 */
		Integer i1 = Integer.valueOf("123");
		Float d1 = Float.valueOf("3.14f");
		
		Integer i2 = Integer.valueOf("101",2);
		
		System.out.println(d1);
		
		/*
		 * parseXxx() 
		 */
		
		Integer a = Integer.parseInt("123");
		Float b = Float.parseFloat("13.45");
		System.out.println(a+" , "+b);
		
		
		/*
		 * xxxValue()
		 */
		
		int c  = i2.intValue();
		System.out.println(c);
		

	}

}
