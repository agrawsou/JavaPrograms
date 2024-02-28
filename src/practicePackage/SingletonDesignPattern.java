package practicePackage;

public class SingletonDesignPattern {
	
	private static SingletonDesignPattern sp = null;
	public String str;
	
	private SingletonDesignPattern() {
		str = "Hello World";
	}
	
	public static SingletonDesignPattern getInstance() {
		if(sp == null) 
			sp = new SingletonDesignPattern();
		return sp;
		}
	
	public static void main(String args[]) {
		SingletonDesignPattern x = getInstance();
		SingletonDesignPattern y = getInstance();
		SingletonDesignPattern z = getInstance();
		
		System.out.println(z.str.toUpperCase());
		
	}
}
