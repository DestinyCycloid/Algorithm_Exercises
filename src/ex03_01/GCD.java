package ex03_01;

import org.junit.experimental.theories.Theories;

public class GCD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println(getGCD(10,20));
	}
	/**
	 * ����һ������������ķ���
	 * @param a
	 * ���ǵ�һ��������Ĭ�������������������Ǹ�
	 * @param b
	 * ���ǵڶ�������
	 * @return
	 * ���ص���������������������������ֵΪ���������ʾ����Ϊ�����ˡ�
	 */
	public  int getGCD(int a,int b){
		//���a<0����bС��0
		if(a<0||b<0){
			return -1;
		}
		//���a<b�Ļ���Ҫ��������λ��
		if(a<b){
			int c=b;
			b=a;
			a=c;
		}
		//���b����0�ͷ���a
		if(b==0){
			return a;
		}
		//����͵ݹ�ʵ��
		else{
			return getGCD(b,a%b);
		}
	}

}
