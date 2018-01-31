
public class Tester {

	public static void main(String[] args) throws GcdNotOneException
	{
		CaesarCipher caesar = new CaesarCipher();
		AffineCipher affine = new AffineCipher();
		String encrypted;
		System.out.println("***** CAESAR  ENCRYPTION *****");
		encrypted = caesar.Encode("Apple is a reference to the Da Vinci Code", -24);
		caesar.Solver(encrypted);
		System.out.println("***** AFFINE ENCRYPTION *****");
		//encrypted = affine.Encode("The Golden Bug is Referenced commonly in Cryptography", 7, 25);
		affine.solver(encrypted);
	}
}
