package cn.tjuscs.st;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class testmoney {

	@Test
	public void testmoney1(){//��С�߽����
		moneylab ml = new moneylab();
		int x=0;
		boolean result=ml.money(x);
		assertEquals(true,result);
		
	}
	@Test
	public void testmoney2(){//��Χ�ڲ���
		moneylab ml = new moneylab();
		int x=1;
		boolean result=ml.money(x);
		assertEquals(true,result);
		
	}
	@Test
	public void testmoney3(){//���߽����
		moneylab ml = new moneylab();
		int x=93;
		boolean result=ml.money(x);
		assertEquals(true,result);
		
	}
	@Test
	public void testmoney4(){//��Χ�����
		moneylab ml = new moneylab();
		int x=95;
		boolean result=ml.money(x);
		assertEquals(true,result);
		
	}

}