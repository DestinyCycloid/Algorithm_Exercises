package ex03_02;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class Test03_02 {
	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testgetMax() {
		//�����������
		double[] array1={0,1,2,3,4,5,6};
		assertEquals(6,Max.getMax(0, array1));
		//�����������ͬ��С�������������±�ȡ���ұߵġ�
		double[] array2={0,1,7,7,7,5,6};
		assertEquals(4,Max.getMax(0, array2));
		//������ʼ����Ϊ��ֵ
		double[] array3={0,1,7,7,7,5,6};
		assertEquals(-1,Max.getMax(-1, array3));
		//��������Ϊ��
		double[] array4={};
		assertEquals(-1,Max.getMax(0, array4));
	}

}
