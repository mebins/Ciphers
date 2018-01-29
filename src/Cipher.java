import java.util.HashMap;

public class Cipher {
	
	public HashMap<String, Integer> table = new HashMap<>(); 
	public HashMap<Integer, String> ltable = new HashMap<>();
	
	
	public Cipher()
	{
		

	table.put("A", 0);
	table.put("B", 1);
	table.put("C", 2);
	table.put("D", 3);
	table.put("E", 4);
	table.put("F", 5);
	table.put("G", 6);
	table.put("H", 7);
	table.put("I", 8);
	table.put("J", 9);
	table.put("K", 10);
	table.put("L", 11);
	table.put("M", 12);
	table.put("N", 13);
	table.put("O", 14);
	table.put("P", 15);
	table.put("Q", 16);
	table.put("R", 17);
	table.put("S", 18);
	table.put("T", 19);
	table.put("U", 20);
	table.put("V", 21);
	table.put("W", 22);
	table.put("X", 23);
	table.put("Y", 24);
	table.put("Z", 25);
	ltable.put(0, "A");
	ltable.put(1, "B");
	ltable.put(2, "C");
	ltable.put(3, "D");
	ltable.put(4, "E");
	ltable.put(5, "F");
	ltable.put(6, "G");
	ltable.put(7, "H");
	ltable.put(8, "I");
	ltable.put(9, "J");
	ltable.put(10, "K");
	ltable.put(11, "L");
	ltable.put(12, "M");
	ltable.put(13, "N");
	ltable.put(14, "O");
	ltable.put(15, "P");
	ltable.put(16, "Q");
	ltable.put(17, "R");
	ltable.put(18, "S");
	ltable.put(19, "T");
	ltable.put(20, "U");
	ltable.put(21, "V");
	ltable.put(22, "W");
	ltable.put(23, "X");
	ltable.put(24, "Y");
	ltable.put(25, "Z");
	}
}
