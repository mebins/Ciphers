
public class Tester {

	public static void main(String[] args)
	{
		CaesarCipher cipher = new CaesarCipher();
		for(int i = 1 ;i < 25; i++)
		{
			System.out.println("Shift : " + i);
			System.out.println(cipher.Decode("BM WMS ILMU BY UYC", i));
			System.out.println("");
			System.out.println("");
		}

	}
}
