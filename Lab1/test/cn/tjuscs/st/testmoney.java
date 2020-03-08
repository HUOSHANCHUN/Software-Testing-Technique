package cn.tjuscs.st;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class testmoney {

	@Test
	public void testmoney1(){//×îĞ¡±ß½ç²âÊÔ
		moneylab ml = new moneylab();
		int x=0;
		boolean result=ml.money(x);
		assertEquals(true,result);
		
	}
	@Test
	public void testmoney2(){//·¶Î§ÄÚ²âÊÔ
		moneylab ml = new moneylab();
		int x=1;
		boolean result=ml.money(x);
		assertEquals(true,result);
		
	}
	@Test
	public void testmoney3(){//×î´ó±ß½ç²âÊÔ
		moneylab ml = new moneylab();
		int x=93;
		boolean result=ml.money(x);
		assertEquals(true,result);
		
	}
	@Test
	public void testmoney4(){//·¶Î§Íâ²âÊÔ
		moneylab ml = new moneylab();
		int x=95;
		boolean result=ml.money(x);
		assertEquals(true,result);
		
	}

}