package day19.solid.srp.problem2;

public class TextDriver {
public static void main(String[] args) {
	TextManipulatorAndPrinter t1=new TextManipulatorAndPrinter("Mahendra Singh");
	t1.printText();
	t1.printLineWise();
	t1.printFromToIndex(0, 4);
	
	t1.addText(" Dhoni");
	t1.printText();
	t1.printLineWise();
	//t1.printFromToIndex(9, 14);
	
	t1.replaceText("Singh", "Kumar");
	t1.printText();
	t1.printLineWise();
	//t1.printFromToIndex(9, 14);
	
	t1.deleteText("Kumar");
	t1.printText();
	t1.printLineWise();
	//t1.printFromToIndex(9, 14);
	
}
}
