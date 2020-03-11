package neu.work.first;

public class print_diamond {
	// int i =( ((int)Math.random() *
	// 10)%2==0)?(int)Math.random()+1:(int)Math.random();

	int i = (int)( Math.random() * 10);//调用java内部提供的产生随机数方法
	 int j = (i%2==0) ? i+1 : i;

	public void print() {
		int k = j;

		for (i = 0; i < (2 * j + 1); i++) {
			for (int h = 0; h < (2 * j + 1); h++) {
				if (h == (k - i) | h == (k + i) | h == (i - k) | h == (3 * k - i)) {
					System.out.print("*");
				}

				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}

	}

	public static void main(String[] args) {
		new print_diamond().print();
	}

}
