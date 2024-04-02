package day19.solid.srp.solution2;

public class TextPrinter {
	
	TextManipulator textManip;

	public TextPrinter() {}
	public TextPrinter(TextManipulator textManip) {
		this.textManip = textManip;
	}
	
	void printText()
	{
		System.out.println(this.textManip.getText());
	}
	
	void printLineWise()
	{
		String names[]=this.textManip.getText().split(" ");
		for(String s:names)
			System.out.println(s);
	}
	
	void printFromToIndex(int fromIndex,int toIndex)
	{
		for(int i=fromIndex;i<=toIndex;i++)
			System.out.print(this.textManip.getText().charAt(i));
	}
	
	void printReplaceSpaceByStar()
	{
		for(int i=0;i<this.textManip.getText().length();i++)
		{
			if(this.textManip.getText().charAt(i)== ' ')
			{
			System.out.print("*");
			}
			else
			{
				System.out.print(this.textManip.getText().charAt(i));
			}
		}
	}
}
