 import java.util.*;
/**   
* @Title: Fangzhen.java
* @Package: java.util.* 
* @Description: 输出一个回形方阵
* @author: 杨倩   
* @date: 2017年9月23日 下午9:40:28
* @version V1.0   
*/

/**
* @ClassName: Fangzhen
* @Description: 输出一个回形方阵
* @author: 杨倩
* @date: 2017年9月23日 下午9:40:28
* 
*/

public class Fangzhen {

	/** 
	* @Title: main 
	* @Description: TODO(这里用一句话描述这个方法的作用) 
	* @param @param args    设定文件 
	* @return void    返回类型 
	* @throws 
	*/

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,x,y;
		Scanner s=new Scanner(System.in);
        System.out.print("请输入一个4到10之间的整数:");
        n=s.nextInt();
        int[][] matrix=new int[n][n];
        for(x=0;x<=n-1;x++)
        	for(y=0;y<=n-1;y++)
        	{
        		if(y==0) matrix[x][y]=x+1;
        		else if(x==n-1)matrix[x][y]=n+y;
        		else if(y==n-1)matrix[x][y]=3*n-2-x;
        		else if(x==0)matrix[x][y]=4*n-4-(y-1);
        		else if(y==1)matrix[x][y]=4*n-4+x;
        		else if(x==n-2)matrix[x][y]=5*n-6+(y-1);
        		else if(y==n-2)matrix[x][y]=7*n-12-(x-1);
        		else if(x==1)matrix[x][y]=8*n-16-(y-2);
        		else if(y==2)matrix[x][y]=8*n-16+(x-1);
        		else if(x==n-3)matrix[x][y]=9*n-20+(y-2);
        		else if(y==n-3)matrix[x][y]=11*n-30-(x-2);
        		else if(x==2)matrix[x][y]=12*n-36-(y-3);
        		else if(y==3)matrix[x][y]=12*n-36+(x-2);
        		else if(x==n-4)matrix[x][y]=13*n-42+(y-3);
        		else if(y==n-4)matrix[x][y]=15*n-56-(x-3);
        		else if(x==3)matrix[x][y]=16*n-64-(y-4);
        		else if(y==4)matrix[x][y]=16*n-64+(x-3);
        		else if(x==n-5)matrix[x][y]=17*n-72+(y-4);
        		else if(y==n-5)matrix[x][y]=19*n-90-(x-4);
        		else if(x==4)matrix[x][y]=20*n-100-(y-5);
        		else if(y==5)matrix[x][y]=20*n-100+(x-4);
        		else if(x==5)matrix[x][y]=24*n-144-(y-6);
        	}
        for(x=0;x<=n-1;x++)
        {
        	for(y=0;y<=n-1;y++)
        	{
        		System.out.print(matrix[x][y]+"  ");
        	}
        	System.out.println();
        }
	}
}
