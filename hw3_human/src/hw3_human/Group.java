package hw3_human;

import java.util.Arrays;

/**
 * 1)Создайте класс описывающий человека (создайте метод выводящий информацию о человеке) 
 * 2)На его основе создайте класс студент (переопределите метод вывода информации) 
 * 3)Создайте класс группа — который содержит массив из 10 объектов  класса студент. 
 * Реализуйте методы добавления студента, удаления студента и
 * метод поиска студента по фамилии. В случае попытки добавления 11 студента
 * создайте собственное исключение и обработайте его. Определите метод
 * toString() для группы так, что бы он выводил список студентов в алфавитном
 * порядке
 */
public class Group {
	final private int maxid = 10;

	private Student students[] = new Student[10];
	private int col;

	/**
	 * @param students
	 * @param col
	 */
	public Group(Student[] students) {
		int j =0;
		try{
		if(students.length+1 >= this.maxid)
			throw new NullPointerException();
		
		}
		catch(NullPointerException e){
			System.out.println("only 10 students can be added");
		}
finally{
		for (int i=0;i<this.maxid; i++){
			
			if (students[i] == null)
				continue;
			this.students[j] = students[i];
			this.students[j].setGid(this);
			this.students[j].setSid(j);;
			j++;
		}
		this.col = this.students.length;
}
	}

	
	public long searchstudent(String  searhLastnameStudent) {
		for (Student i : this.students)
			if (i.getLname().compareToIgnoreCase(searhLastnameStudent) > 0)
				return i.getSid();
		return -1;

	}

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
	 try{
		 if (col== maxid) 	throw new OutOfRangeException();
		 
			
		}
	 	catch (OutOfRangeException e) {
			System.out.println(e.getMessage());
			System.out.printf(" 10 studends only", stud.toString());
			return -1000;
			}
		catch (Exception e){
			
		}
		
		return 0;
	}

	@Override
	public String toString() {
		Arrays.sort((Human[])this.students); 
		StringBuilder builder = new StringBuilder();
		builder.append("Group [students=");
		builder.append(Arrays.toString(students));
		builder.append(", maxid=");
		builder.append(maxid);
		builder.append(", Students in group=");
		builder.append(col);
		builder.append("]");
		return builder.toString();
	}


}
