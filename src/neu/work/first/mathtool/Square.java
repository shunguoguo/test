package neu.work.first.mathtool;



/**
 * @author shunguoguo
 * 计算长方形面积
 *
 */
public class Square  implements MathTool {
	Double a ,b;
	Square( Double a,Double b){
		this.a = a;
		this.b = b;
	}

	@Override
	public Double area() {
		// TODO Auto-generated method stub
		return a*b;
	}

	@Override
	public Double Perimeter() {
		// TODO Auto-generated method stub
		return 2*(a+b);
	}
}
