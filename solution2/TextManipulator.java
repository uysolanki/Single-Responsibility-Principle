package day19.solid.srp.solution2;

public class TextManipulator {
	private String text;
	
	public TextManipulator() {}
	public TextManipulator(String text)
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
}
