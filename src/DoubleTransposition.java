
public class DoubleTransposition {

	private String[][] matrix;
	private int rows;
	private int cols;

	public DoubleTransposition(int rows, int cols, String plain) {
		this.rows = rows;
		this.cols = cols;
		matrix = new String[rows][cols];
		int row = 0;
		int col = 0;
		int plain_index = 0;
		String[] text = plain.split(" ");
		while (plain_index < text.length) {
			if (col == cols) {
				row++;
				col = 0;
			}
			matrix[row][col] = text[plain_index];
			col++;
			plain_index++;
		}
	}

	public void rowPermutations(String s)
	{
		String[] perm = s.split(" ");
		int[] perm_parse = new int[perm.length];
		int index = 0;
		for(int i = 0; i < perm.length; i++)
		{
			perm_parse[i] = Integer.parseInt(perm[i]);
		}
		String[][] new_matrix = new String[rows][cols];
		int row = 0;
		for(int shift = 0; shift < perm_parse.length; shift++)
		{
			index = perm_parse[shift]-1;
			for(int col = 0; col < cols; col++)
			{
				new_matrix[row][col] = matrix[index][col];
			}
			row++;
		}
		matrix = new_matrix;
		
	}
	public void colPermutations(String s)
	{
		String[] perm = s.split(" ");
		int[] perm_parse = new int[perm.length];
		int index = 0;
		for(int i = 0; i < perm.length; i++)
		{
			perm_parse[i] = Integer.parseInt(perm[i]);
		}
		String[][] new_matrix = new String[rows][cols];
		int col = 0;
		for(int shift = 0; shift < perm_parse.length; shift++)
		{
			index = perm_parse[shift]-1;
			for(int row = 0; row < rows; row++)
			{
				new_matrix[row][col] = matrix[row][index];
			}
			col++;
		}
		matrix = new_matrix;
		
	}
	public String generateString() {
		String result = "";

		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				result += matrix[i][j];
			}
			result +="\n";
		}

		return result;

	}

	public static void main(String[] args) {
		DoubleTransposition x = new DoubleTransposition(5, 5, "T A I U I I D A H T E P R T E W I E E S A N V S T");
		System.out.println(x.generateString());
		x.rowPermutations("2 4 1 5 3");
		System.out.println(x.generateString());
		x.colPermutations("2 3 1 5 4");
		System.out.println(x.generateString());
	}
}
