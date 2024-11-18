
public class Boxing {
	
	public static void main(String[] args) {
		
//		Boxing :- when primitive value store in objec like wrapper object 
		
		int num = 8;
		Integer numob = new Integer(num);
		
		
//		AutoBoxing :- when primitive value store in object directly 
		
		int num1 = 10;
		Integer numobj1 = num1;
		
		
//		Unboxing := when object value store in primitve data type;
		
		Integer in = 10;
		int num2 = in.intValue();
		
//		autounboxing := when object value store in primitive type directly;
		
		int num3 = in;
	}

}
