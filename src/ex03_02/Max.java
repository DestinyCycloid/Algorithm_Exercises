package ex03_02;

public class Max {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//double[] array2={0,1,7,7,7,5,6};
		//System.out.println(getMax(0,array2));
	}
	/**
	 * ����һ����һ������array�����ֵ�±�ĺ���
	 * @param i
	 * ���ǵ�ǰ��ʼ�±�
	 * @param array
	 * ���Ǹ���������
	 * @return
	 * ���ص��Ǹ����������ֵ���±ꡣ
	 */
	public static int getMax(int i,double[] array){
		int j,k;
		//���������������ֵΪ-1
		if(i<0||array.length<1){
			return -1;
		}
		//��������Ļ�
		if(i<array.length-1){
			j=getMax(i+1, array);
			if(array[i]>array[j]){
				k=i;
			}
			else{
				k=j;
			}
		}
		else{
			k=array.length-1;
		}
		return k;
	}

}
