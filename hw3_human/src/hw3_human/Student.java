package hw3_human;

/**
 * 1)�������� ����� ����������� �������� (�������� ����� ��������� ���������� �
 * ��������) 2)�� ��� ������ �������� ����� ������� (�������������� ����� ������
 * ����������)
 */
public class Student extends Human {
	/** id of group // link */
	private Group gid;
	//�� �������� 
	private long sid; // id student in group; it sets when student will be added
	/** ������� ���� */
	private float avgMark;
	private boolean hasgrant;
	private double grant;

	public Student(int age, Sex s, String fname, String sname, String lname) {
		// TODO Auto-generated constructor stub
		super(age, s, fname, sname, lname);
		this.gid = null;
		this.avgMark = 0;
		this.hasgrant = false;
		this.grant = 0;
	}

	public Student(int age, Sex s, String fname, String sname, String lname, Group gid, float avgMark, boolean hasgrant,
			double grant) {
		super(age, s, fname, sname, lname);
		this.gid = gid;
		this.avgMark = avgMark;
		this.hasgrant = hasgrant;
		this.grant = grant;
	}

	public Group getGid() {
		return gid;
	}

	public void setGid(Group gid) {
		this.gid = gid;
	}

	public float getAvgMark() {
		return avgMark;
	}

	public void setAvgMark(float avgMark) {
		this.avgMark = avgMark;
	}

	public boolean isHasgrant() {
		return hasgrant;
	}

	public void setHasgrant(boolean hasgrant) {
		this.hasgrant = hasgrant;
	}

	public double getGrant() {
		return grant;
	}

	public void setGrant(double grant) {
		this.grant = grant;
	}

	public long getSid() {
		return sid;
	}

	public void setSid(long sid) {
		this.sid = sid;
	}

	 

}
