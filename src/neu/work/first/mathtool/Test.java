package neu.work.first.mathtool;

/**
 * @author shunguoguo 测试多态实现
 *
 */
public class Test {
	public static void main(String[] args) {

		MathTool mt = new Circular(2.0);
		System.out.println(mt.Perimeter());
		System.out.println(mt.area());

		MathTool mt2 = new Square(1.0, 2.0);
		System.out.println(mt2.Perimeter());
		System.out.println(mt2.area());

	}
}
