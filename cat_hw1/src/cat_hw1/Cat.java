package cat_hw1;
/**
 * 
 * @author Grom
 Описать класс «Cat» (в качестве образца можно взять домашнего питомца).
Наделить его свойствами и методами. Создать несколько экземпляров объектов этого
класса. Использовать эти объекты.
 
 */
public class Cat {
	private String name;
	private double weight;
	private boolean isSleep;
	private boolean isWantplay;
	private boolean isWanteat;
	private boolean isplay;
	private boolean iseat;

	public Cat() {
		super();

	}

	public Cat(String name, double weight)
			{super();
			this.name = name;
			this.weight = weight;
			this.isSleep = false;
			this.isWantplay = false;
			this.isWanteat = false;
			this.isplay = false;
			this.iseat = false;
			}
	
	public Cat(String name, double weight, boolean isSleep, boolean isWantplay, boolean isWanteat, boolean isplay,
			boolean iseat) {
		super();
		this.name = name;
		this.weight = weight;
		this.isSleep = isSleep;
		this.isWantplay = isWantplay;
		this.isWanteat = isWanteat;
		this.isplay = isplay;
		this.iseat = iseat;
	}

	public boolean isIsplay() {
		return isplay;
	}

	public void setIsplay(boolean isplay) {
		this.isplay = isplay;
	}

	public boolean isIseat() {
		return iseat;
	}

	public void setIseat(boolean iseat) {
		this.iseat = iseat;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getWeight() {
		if (weight > 10)
			System.out.println("Cat is FAT!!! it need more PLAY");
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public boolean isSleep() {
		return isSleep;
	}

	public void setSleep(boolean isSleep) {
		this.isSleep = isSleep;
	}

	public boolean isWantplay() {
		return isWantplay;
	}

	public void setWantplay(boolean isWantplay) {
		this.isWantplay = isWantplay;
	}

	public boolean isWanteat() {
		return isWanteat;
	}

	public void setWanteat(boolean isWanteat) {
		this.isWanteat = isWanteat;
	}

	/**/
	public void catmey() {
		int i = 0;
		do {
			System.out.print("Mey! ");
			i++;
		} while (i < 10);
		System.out.println();
	}

	public void catmurr() {
		int i = 0;
		do {
			System.out.print("Murr! ");
			i++;
		} while (i < 10);
		System.out.println();
	}

	public void getmeat2cat(double weigth_eat) {
		System.out.println("cat is eat now!");
		if (weigth_eat < 1) {
			this.setWanteat(true);
		} else {
			this.setWanteat(false);
			this.setWeight(weigth_eat / 10.0 + this.getWeight());
			// this.setSleep(weigth_eat/(weigth_eat+1)*8);
			this.catmurr();
			this.setSleep(true);
			System.out.println(this.toString());
		}

	}

	public void playwithcat(long secs) {
		if (this.isSleep) {
			System.out.println("cat is sleep now!");
			this.setSleep(false);
		}
		if (this.isWanteat) {
			this.catmey();
			this.catmey();
			System.out.println("Cat want eat!");
			System.out.println(this.toString());
			return;
		}

		this.isplay = true;
		System.out.println("cat is playing  now, but want sleep");
		/*try {
			System.out.wait(secs);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		this.weight -= weight / 10000 * secs;
		this.setWanteat(true);
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Cat [name=");
		builder.append(name);
		builder.append(", weight=");
		builder.append(weight);
		builder.append(", isSleep=");
		builder.append(isSleep);
		builder.append(", isWantplay=");
		builder.append(isWantplay);
		builder.append(", isWanteat=");
		builder.append(isWanteat);
		builder.append(", isplay=");
		builder.append(isplay);
		builder.append(", iseat=");
		builder.append(iseat);
		builder.append("]");
		return builder.toString();
	}

}
