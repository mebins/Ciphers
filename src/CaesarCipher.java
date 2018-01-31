/*
 * Shifts the Letter by X amount, all there is to it. 
 */
public class CaesarCipher extends Cipher {
	
	
	public String Encode(String input, int shift)
	{
		String result = new String();
		for(int i = 0; i < input.length(); i++)
		{
			String current_letter = Character.toString(input.charAt(i)).toUpperCase();
			if(current_letter.equals(" ")) {result += " "; continue;}
			int position = table.get(current_letter);
			while((position + shift) > 25) position -= 26;
			while((position + shift < 0 )) position += 26;
			result += ltable.get(position+shift);
		}
		return result;
	}

	public String Decode(String input, int shift) {
		String result = new String();
		for(int i = 0; i < input.length(); i++) {
			String current_letter = Character.toString(input.charAt(i));
			if(current_letter.equals(" ")) {result += " "; continue;}
			int position = table.get(current_letter);
			while((position - shift) < 0) position += 26; 
			result += ltable.get(position-shift);
		}
		return result;
	}
	public void Solver(String input)
	{
		for(int i = 0; i < 26; i++)
		{
			System.out.println("Shift: " + i + " Output: " + Decode(input, i));
		}
	}
}
