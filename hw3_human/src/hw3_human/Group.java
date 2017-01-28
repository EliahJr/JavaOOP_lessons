package hw3_human;

import java.util.Arrays;

/**
 * 1)�������� ����� ����������� �������� (�������� ����� ��������� ���������� � ��������) 
 * 2)�� ��� ������ �������� ����� ������� (�������������� ����� ������ ����������) 
 * 3)�������� ����� ������ � ������� �������� ������ �� 10 ��������  ������ �������. 
 * ���������� ������ ���������� ��������, �������� �������� �
 * ����� ������ �������� �� �������. � ������ ������� ���������� 11 ��������
 * �������� ����������� ���������� � ����������� ���. ���������� �����
 * toString() ��� ������ ���, ��� �� �� ������� ������ ��������� � ����������
 * �������
 */
public class Group {
	private Student students[] = new Student[10];
	private int maxid = 10;
	private int col;

	public long searchstudent(Student searhStudent) {
		for (Student i : this.students)
			if (i.getLname().compareToIgnoreCase(searhStudent.getLname()) > 0)
				return i.getSid();
		return -1;

	}

	public int delStudent(Student stud) {
		long index;
		int i = -2;
		try {
			if (stud == null)
				throw new NullPointerException();
			index = this.searchstudent(stud);
			if (index == -1)
				throw new OutOfRangeException();

			for (i = 0; i < this.students.length; i++) {
				if (this.students[i].getSid() == index)
					break;
			}

			for (int j = i; j < this.students.length - 1; j++) {
				this.students[j] = this.students[i];
				i++;
			}
			this.students[i] = null;

			this.col--;
		} catch (NullPointerException e) {
			System.out.println("null pointer in delStudent ");
			return -1;
		} catch (OutOfRangeException e) {
			System.out.println(e.getMessage());
			System.out.printf("student %s not found in group", stud.toString());
			return -1000;
		} finally {

		}

		return 0;// all done
	};

	public int addStudent(Student stud) {
		return 0;
	}

	@Override
	public String toString() {
		return String.format("Group [students=%s, maxid=%s, col=%s]", Arrays.toString(students), maxid, col);
	}
}
