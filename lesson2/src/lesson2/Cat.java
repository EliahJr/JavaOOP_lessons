package lesson2;

public class Cat extends Animals {
	String name;
	String type;

	public Cat(int age, double weigt, boolean sex, String ration, String name, String type) {
		super(age, weigt, sex, ration);
		this.name = name;
		this.type = type;
	}

	@Override
	public void getVoice() {
		System.out.println("May - May");
	}

	@Override
	public String toString() {
		return "Cat [name=" + name + ", type=" + type + super.toString();
	}
}
