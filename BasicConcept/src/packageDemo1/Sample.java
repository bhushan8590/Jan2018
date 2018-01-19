package packageDemo1;

public class Sample {
	
	public int publicvar=90000;
	protected String prostr="Protected String";
	int defaultvar=80000;
	private int privatedata=60;
	static String title="Basic Concepts";
	final int finalData = 850000;
	
	public void printvarinfo(){
		System.out.println(prostr);
		System.out.println("public data:"+publicvar);
		System.out.println("default data:"+defaultvar);
		System.out.println("private data:"+privatedata);
		System.out.println("Static title:"+title);
	}
	
	protected void protectedMethod(){
		System.out.println(prostr+" from protected method");
	}
	
	void defaultMethod(){
		System.out.println(defaultvar+" from default method");
	}
	
	private void privateMethod(){
		System.out.println(privatedata+" from private method");
	}
	
	void changefinalvar(){
		//this.finalData += 5000; 
	}
	
}
