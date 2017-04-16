package spring.aop;

public class PersonImpl implements Person {
	private String name;
	private int age;

	@Override
	public void info() {
		// TODO Auto-generated method stub
		System.out.println("我的名字是:  " + name + " , 今年年龄为:  " + age);
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		if (age < 45) {
			System.out.println("我还年轻，奔跑迅速...");
		} else {
			System.out.println("我年老体弱，只能慢跑...");
		}

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	

}
