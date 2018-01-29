public class CaesarCipher extends Cipher {

	public String Encode(String input) {
		String result = new String();
		for(int i = 0; i < input.length(); i++)
		{
			String current_letter = Character.toString(input.charAt(i));
			if(current_letter.equals(" ")) {result += " "; continue;}
			int position = table.get(current_letter);
			while((position + 1) > 25) position -= 26; 
			result += ltable.get(position+1);
		}
		return result;
	}
	public String Encode(String input, int shift)
	{
		String result = new String();
		for(int i = 0; i < input.length(); i++)
		{
			String current_letter = Character.toString(input.charAt(i));
			if(current_letter.equals(" ")) {result += " "; continue;}
			int position = table.get(current_letter);
			while((position + shift) > 25) position -= 26; 
			result += ltable.get(position+shift);
		}
		return result;
	}

	public String Decode(String input)
	{
		String result = new String();
		for(int i = 0; i < input.length(); i++) {
			String current_letter = Character.toString(input.charAt(i));
			if(current_letter.equals(" ")) {result += " "; continue;}
			int position = table.get(current_letter);
			while((position - 1) < 0) position += 26; 
			result += ltable.get(position-1);
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

}
