package neu.work.first;

/**
 * @author shunguoguo 打印乘法表
 */
public class Print_Multiplication_Table {
	public static void print() {
		for (int i = 1; i <= 9; i++)
			for (int j = 1; j <= i; j++) {
				System.out.print(j + "*" + i + "=" + (i * j) + "  ");
				if (i == j)
					System.out.println();

			}

	}

	public static void main(String[] args) {
		print();
	}
}
