package hw3_human;

/**
 * 1)Создайте класс описывающий человека (создайте метод выводящий информацию о
 * человеке)
 *
 * 
 */
public   class Human implements Comparable<Object>{
	private int age;
	private Sex sex_;
	
	/** firstname = имя */
	private String fname;
	/** secondname = отчество */
	private String sname;
	/** lastname = фамилия */
	private String lname;

	public Human(int age, Sex s, String fname, String sname, String lname) {
		super();
		this.age = age;
		this.sex_ = s;
		this.fname = fname;
		this.sname = sname;
		this.lname = lname;
	}
	
	@Override
	public int compareTo(Object o) {
	if (o == null) {
	return -1;
	}
	Human anotherH = (Human) o;
	return this.lname.compareToIgnoreCase(anotherH.getLname());
	}
	
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Sex getS() {
		return sex_;
	}

	public void setS(Sex s) {
		this.sex_ = s;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	@Override
	public String toString() {
		return String.format("Human [ fname=%s, sname=%s, lname=%s, age=%d, sex=%s,]", fname, sname, lname, age, sex_);
	}

 

	// abstract void sort(Human[] Human, int rule);

}
