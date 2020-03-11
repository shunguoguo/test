package neu.work.first;

import java.util.Scanner;

public class ScanAndSort {
	/**
	 * 打印乘法表主方法
	 */
	public void inputAndSortArry() {
		
		System.out.println("请输入总个数");

		Scanner sc = new Scanner(System.in);
		int j  = sc.nextInt();
		Double[] arry = new Double[j];
		System.out.println("输入具体数，用enter隔开：");
		int i = 0 ;
		for(;i<j;i++){
			arry[i] = sc.nextDouble();
			
		}
		//冒泡排序
		i = 0;
		Double temp;
		for(i = 0;i<j;i++)
			for(int k = i+1 ;k<j;k++) {
				if(arry[i]>arry[k]) {
					temp = arry[k];
					arry[k]=arry[i];
					arry[i]=temp;
				}
			
		}
		
		//输出排序后数组
		System.out.println("从小到大排序：");
		for(i=0;i<j;i++)
		System.out.println(arry[i]);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ScanAndSort().inputAndSortArry();

	}

}
