package lesson2;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animals[] anim = new Animals[10];//(3, 4, true, "milk");
		Cat acat = new Cat(3, 4, true, "milk", "Barsic", "Angor");
		anim[0] = acat;
		voice(anim[0]);
		voice(acat);
		
		System.out.println(anim[0].getClass());
		
		if (anim[0].getClass() ==Cat.class){
			Cat catT = (Cat)anim[0];
			catT.getVoice();
			System.out.println(catT);
		}
	}

	public static void voice(Animals a) {
		a.getVoice();
	}

}
