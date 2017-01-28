package l3excapt;

import javax.swing.JOptionPane;

public class main {
	public static void main(String[] args) {
		double a;
		for (;;) {
			try {
				a = Double.valueOf(JOptionPane.showInputDialog("Input double number"));
				break;
			} catch (NumberFormatException e) {
				JOptionPane.showMessageDialog(null, "Error number format");
			}
			catch(NullPointerException e){
				JOptionPane.showMessageDialog(null,"Set def value a = 0");
				a = 0;
				break;
			}
		}
		System.out.println(a);
	}

}
