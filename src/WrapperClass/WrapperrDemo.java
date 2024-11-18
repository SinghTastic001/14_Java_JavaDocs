package WrapperClass;

public class WrapperrDemo {
	
	public static void main(String[] args) {
		
		int num = 5;
		String st = String.valueOf(num);
		System.out.println(st);
		System.out.println(st.getClass());
		
		Float f = Float.valueOf(num);
		System.out.println(f);
		System.out.println(f.getClass());
		
		String num1 = "200";
		Integer in = Integer.valueOf(num1);
		System.out.println(in);
		System.out.println(in.getClass());
		System.out.println(num1.getClass().getName());
		
		String s = "subhi";
		Integer nk = Integer.valueOf(s);
//		System.out.println(nk+" : "+nk.getClass().getName());
		System.out.println(nk);
	}

}
