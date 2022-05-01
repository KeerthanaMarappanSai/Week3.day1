
public class Automation extends AutomationSuper implements Language,TestTool {

	public static void main(String[] args) {
		
		Automation auto=new Automation();
		auto.Selenium("Selenium");
		auto.Java("Java");
		auto.inter(123);
	}

	final public void Selenium(String Selenium) {
		// TODO Auto-generated method stub
		System.out.println("Selenium");
	}

	final public void Java(String Java) {
		// TODO Auto-generated method stub
		System.out.println("Java");
	}
	
	public void inter(int id)
	{
		this.Selenium("");
		this.Java("");
		super.SuperClass();
	}
	
	
}
