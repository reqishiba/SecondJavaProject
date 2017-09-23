import java.util.*;
/**   
* @Title: Digui.java
* @Package: java.util.* 
* @Description: 以二的倍数递增递减
* @author: 杨倩   
* @date: 2017年9月23日 下午9:33:58
* @version V1.0   
*/

/**
* @ClassName: Digui
* @Description: 以二的倍数递增递减
* @author: 杨倩
* @date: 2017年9月23日 下午9:33:58
* 
*/

public class Digui {

	/** 
	* @Title: main 
	* @Description: TODO(这里用一句话描述这个方法的作用) 
	* @param @param args    设定文件 
	* @return void    返回类型 
	* @throws 
	*/

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
        Scanner s=new Scanner(System.in);
        System.out.print("请输入一个整数:");
        n=s.nextInt();
        twice(n);
        half(n);
	}
	public static void twice(int t) {
		if(t<10000)
			{System.out.println(t);
			twice(2*t);
			}
	}
	public static void half(int t) {
		if(t<10000)
			{
			half(2*t);
			System.out.println(t);
			}
	}
}
