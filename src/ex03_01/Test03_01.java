package ex03_01;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class Test03_01 {
	public GCD gcd=new GCD();
	@Before
	public void setUp() throws Exception {}

	@Test
	public void testGetGCD(){
		//������������ʹ��
		assertEquals(10,gcd.getGCD(20, 10));
		//����ǰһ�����Ⱥ�һ����С
		assertEquals(12,gcd.getGCD(24, 36));
		//�����и��������
		assertEquals(-1,gcd.getGCD(-20, 36));
	}

}
