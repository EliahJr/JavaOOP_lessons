package cat_hw1;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cat simon = new Cat("Simon",5.6);
			
		simon.catmey();
		simon.getmeat2cat(3);
		simon.playwithcat(600);
		if (simon.isWanteat())
			simon.getmeat2cat(5.6);
		simon.playwithcat(600);
		simon.playwithcat(600);
		System.out.println(simon.toString());
	}

}
