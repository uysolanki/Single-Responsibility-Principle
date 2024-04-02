package day19.solid.srp.problem2;

public class TextManipulatorAndPrinter {
		private String text;
		
		public TextManipulatorAndPrinter() {}
		public TextManipulatorAndPrinter(String text)
		{
			this.text=text;
		}
		public String getText() {
			return text;
		}
		public void setText(String text) {
			this.text = text;
		}
		
				
		void addText(String newtext)
		{
			this.text=text.concat(newtext);
		}
		
		void replaceText(String oldText,String newText)
		{
			if(this.text.contains(oldText))
			{
				this.text=text.replace(oldText, newText);
			}
			else
			{
				System.out.println("Text not found to replace");
			}
		}
		
		void deleteText(String delText)
		{
			if(this.text.contains(delText))
			{
				this.text=text.replace(delText,"");
			}
			else
			{
				System.out.println("Text not found to delete");
			}
		}
		
		void printText()
		{
			System.out.println(text);
		}
		
		void printLineWise()
		{
			String names[]=this.text.split(" ");
			for(String s:names)
				System.out.println(s);
		}
		
		void printFromToIndex(int fromIndex,int toIndex)
		{
			for(int i=fromIndex;i<=toIndex;i++)
				System.out.print(this.text.charAt(i));
		}
}
