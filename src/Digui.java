import java.util.*;
/**   
* @Title: Digui.java
* @Package: java.util.* 
* @Description: �Զ��ı��������ݼ�
* @author: ��ٻ   
* @date: 2017��9��23�� ����9:33:58
* @version V1.0   
*/

/**
* @ClassName: Digui
* @Description: �Զ��ı��������ݼ�
* @author: ��ٻ
* @date: 2017��9��23�� ����9:33:58
* 
*/

public class Digui {

	/** 
	* @Title: main 
	* @Description: TODO(������һ�仰�����������������) 
	* @param @param args    �趨�ļ� 
	* @return void    �������� 
	* @throws 
	*/

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
        Scanner s=new Scanner(System.in);
        System.out.print("������һ������:");
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
