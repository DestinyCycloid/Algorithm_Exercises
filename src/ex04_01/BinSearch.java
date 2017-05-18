package ex04_01;

import static org.junit.Assert.assertEquals;

public class BinSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double[] arrary1={1,2,3,4,5,6,7};
		System.out.println(BinSearch.getBinSearch(arrary1, 0, arrary1.length-1,7));
	}
	/**
	 * ����һ�������������в���Ŀ��ֵ�Ķ��ֲ���
	 * @param array
	 * ���Ǹ�������������
	 * @param start
	 * ���ǲ��ҵ�����
	 * @param end
	 * ���ǲ��ҵ�����
	 * @param x
	 * ����Ҫ���ҵ�ֵ
	 * @return
	 * ����ҵ�Ŀ��ֵ������Ŀ��Ԫ���±꣬���򷵻�-1��
	 */
	public static int getBinSearch(double[] array,int start,int end,double x){
		if(start==end){
			if (array[start]==x){
				return start;
			}
			else{
				return -1;
			}
		}
		else{
			int mid=(start+end)/2;
			if(array[mid]==x){
				return mid;
			}
			else if(array[mid]>x){
				return getBinSearch(array, start, mid, x);
			}
			else{
				return getBinSearch(array, mid+1, end, x);
			}
			
		}
	}

}
