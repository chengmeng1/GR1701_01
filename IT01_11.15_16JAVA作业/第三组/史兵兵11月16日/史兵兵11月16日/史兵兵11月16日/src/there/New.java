package there;

import java.util.Scanner;

/** 
 * @author  作者 E-mail:738348954@qq.com
 * @date    创建时间：2017年11月16日 下午3:47:29 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class New {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("请输入H为多少");
		double H = sc.nextInt();
		double hn = H / 2; //第一次反弹反弹高度 
		
		int i = 0;
		System.out.println("请输入N为多少");
		int N = sc.nextInt();
		for (i = 1;i< N;i ++){
		H = H + hn * 2;    //第i次落地经过多少米
		hn = hn / 2;       //第i次反弹的高度
		}
		System.out.println("第" + i + "次落地经过" + H +"米"); 
		System.out.println("第" + i + "次反弹" + hn + "米");
     
	}

}
