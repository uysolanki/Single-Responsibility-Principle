package day19.solid.srp.solution2;


public class SrpTextSolutionDriverApp {

	public static void main(String[] args) {
		TextManipulator tm=new TextManipulator("Mahendra Singh");
		tm.addText(" Dhoni");
		
		TextPrinter tp=new TextPrinter(tm);
		tp.printText();
		
		tm.replaceText("Singh", "Kumar");
		tp.printReplaceSpaceByStar();

	}

}
