package spring.aop;

public class PersonImpl implements Person {
	private String name;
	private int age;

	@Override
	public void info() {
		// TODO Auto-generated method stub
		System.out.println("�ҵ�������:  " + name + " , ��������Ϊ:  " + age);
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		if (age < 45) {
			System.out.println("�һ����ᣬ����Ѹ��...");
		} else {
			System.out.println("������������ֻ������...");
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
