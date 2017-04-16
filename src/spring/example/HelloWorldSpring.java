package spring.example;

public class HelloWorldSpring {
	private String sayContent;	
	public String sayHello() 
      {
		System.out.println("HelloWorldSpring Say:Hello World");
		return sayContent;
	}
	public String getSayContent() {
		return sayContent;
	}
	public void setSayContent(String sayContent) {
		this.sayContent = sayContent;
	}

}
