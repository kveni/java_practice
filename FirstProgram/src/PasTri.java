
public class PasTri {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int row = 6;
        int r, num;
        for (int i = 0; i <= row; i++) {
            num = 1;
            r = i + 1;
            //pre-spacing
            for (int j = row - i; j > 0; j--) {
                System.out.print(" ");
            }
            for (int col = 0; col <= i; col++) {
                if (col > 0) {
                    num = num * (r - col) / col;
                }
                System.out.print(num + " ");
            }
            System.out.println();
        }
	}

}
