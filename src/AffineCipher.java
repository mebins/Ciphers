import java.util.HashMap;
/*
 * Uses the Algorithm A(x + b) % M to Encrypt where A and the size of the alphabet(M) have a GCD of 1 
 * Uses the Algorithm A^-1 (x-b) % M to Decrypt where A^-1 is a number 0<x<26 and multiplied by A mod 26 returns a 1. 
 */
public class AffineCipher extends Cipher {

	HashMap<String, String> decryption = new HashMap<>();
	//(ax+b) 
	public String Encode(String input, int a, int b) throws GcdNotOneException
	{
		if(this.GCD(a, 26) != 1) throw new GcdNotOneException(a+" : and 26 GCD is not 1");
		decryption.clear();
		String result = new String();
		for(int i = 0; i< input.length(); i++)
		{
			if(Character.toString(input.charAt(i)).equals(" ")) { result+= " "; continue;}
			int letter = this.table.get(Character.toString(input.charAt(i)).toUpperCase());
		
			letter *= a;
			letter += b; 
			letter %= 26; 
			
			result+= ltable.get(letter).toUpperCase();
		}
		
		return result;
	}
	
	public String Decode(String input, int a , int b) throws GcdNotOneException
	{
		
		if(GCD(a,26) != 1) throw new GcdNotOneException("GCD of " + a +" and 26 is not one");
		String result = new String();

		for(int i = 0; i < input.length(); i++){
			if(Character.toString(input.charAt(i)).equals(" ")) { result+= " "; continue;}
			String letter = Character.toString(input.charAt(i));
			int letter_value = table.get(letter);
			int a_inverse = 0;
			for(int j = 0; j < 26; j++)
			{
				if ((j*a) % 26 == 1)
				{
					a_inverse = j;
					break;
				}
			}
			while(letter_value - b < 0) letter_value += 26;
			letter_value = a_inverse*(letter_value - b) % 26;
			letter = ltable.get(letter_value);
			
			result += letter;
		}

		return result;
	}
	/* Exhaustive Search, but since there is only 312 possibilities this is okay. 
	 * We could also use Frequency Analysis, But for this problem its not necessary. 
	 */
	public void solver(String input) throws GcdNotOneException
	{
		int[] gcd_keys = {1,3,5,7,9,11,15,17,19,21,23,25}; 
		for(int key : gcd_keys)
		{	
			for(int j = 0; j < 26; j++)
			{
				System.out.println("Key: " + key + " Shift: " + j + " Output: " + Decode(input, key, j));
			}
		}
	}
}
