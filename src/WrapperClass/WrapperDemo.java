package WrapperClass;

public class WrapperDemo {
	
	public static void main(String[] args) {
		
		int a = 20;
		String data = String.valueOf(a);
		System.out.println(data.getClass());
		
		String num = "20";
//		Integer n = Integer.valueOf(num);
		Integer n = Integer.valueOf(num);
		System.out.println(n+" : "+n.getClass().getName());
		
		
		String isValid = "vuvyuv";
		Boolean b = Boolean.valueOf(isValid);
		System.out.println(b);
		
		
		String s = "subhi";
		Integer nk = Integer.valueOf(s);
		System.out.println(nk+" : "+nk.getClass().getName());
	}

}
