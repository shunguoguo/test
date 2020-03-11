package neu.work.first.mathtool;

/**
 * @author shunguoguo
 *计算圆形的周长和面积
 */
public class Circular implements MathTool {
	Double r;

	Circular(Double r) {
		this.r = r;
	}

	@Override
	public Double Perimeter() {
		// TODO Auto-generated method stub
		return 2 * Math.PI * r;
	}

	@Override
	public Double area() {
		// TODO Auto-generated method stub
		return Math.PI * r * r;
	}

}
