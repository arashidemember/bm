package cn.com.week8.test1218;
/*未解决问题：
 * 	1.只是从一个找到了另一个，如何找出所有的
 *  2.像1223343  有重复没有考虑
 * 
 * */
public class Permutation{
		/**
		 * 字典序法   全排列算法
		 */
	     /* eg.839647521
			1.自右至左找到排列中第一个比右边数字小的数字 4 array[i-1]
			2.自右至左找到排列中第一个比array[i-1]大的数字 array[j] 5 
			3.交换array[i-1]和 array[j]  839647521变为839657421
			4.将array[i-1]之后的数据倒序 即7421变为1247
		 */
	private int[] array = {8,3,9,6,4,7,5,2,1};
	public int[] nextArray() {
		int length = array.length;
		System.out.println("length = "+length);
		this.printArray(array);
		System.out.println();
		//eg.839647521
		//1.自右至左找到排列中第一个比右边数字小的数字 4 ArrayList[i-1]
		int i=0;
		for (i = length-1;  i>0; i--) {
			if (array[i]>array[i-1]) {
				break;
			}
		}
		System.out.print(i+"-------");
		//如果没有找到，也就是到了最后一位
		if(i == 0) {
			return array;
		}
		 
		//2.自右至左找到排列中第一个比array[i-1]大的数字 array[j] 5 
		int j = 0;
		for(j=length-1;j>i;j--) {
			if (array[j]>array[i-1]) {
				break;
			}
		}
		System.out.println(j);
		
		//3.交换array[i-1]和 array[j]  839647521变为839657421
		int tmp = 0;
		tmp = array[i-1];
		//System.out.println("tmp = "+tmp);
		array[i-1] = array[j];
		//System.out.println("array[i-1 = "+array[i-1]);
		array[j]= tmp;
		//System.out.println("array[j] = "+array[j]);
		
		//4.将array[i-1]之后的数据倒序 即7421变为1247
		while(i < length - 1) {
			tmp = array[i];
			array[i] = array[length - 1];
			array[length-1] = tmp;
			i++;
			length--;
		}
		//5.最终答案是839651247
		return array;
	}
	
	//打印数组
	public void printArray(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i]);
		}
	}
	
	//计算n!
	public static int factorial(int num) {
        int total = 1;
        if (num > 0) {
            total *= num;
            total *= factorial(num - 1);
        }
        return total;
    }
	
	
	public static void main(String[] args) {
		
		Permutation p = new Permutation();
	    int[] nextArray = p.nextArray();
	    p.printArray(nextArray);
		
	}
	
	
}
