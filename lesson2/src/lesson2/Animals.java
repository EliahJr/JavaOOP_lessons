package lesson2;

public class Animals {
	int age;
	double weigt;
	boolean sex;
	String ration;

	public Animals(int age, double weigt, boolean sex, String ration) {
		super();
		this.age = age;
		this.weigt = weigt;
		this.sex = sex;
		this.ration = ration;
	}

	public Animals() {
		super();
	}

	public void getVoice() {
	}

	public String toString() {
		return " age=" + age + ", weigt=" + weigt + ", sex=" + sex + ", ration=" + ration + "]";
	}
}