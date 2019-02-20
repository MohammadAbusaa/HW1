import static org.junit.jupiter.api.Assertions.*;

import org.junit.Ignore;
import org.junit.jupiter.api.Test;

class sctesting {

	shopcart c1;
	
	@Test
	void test() {
		c1=new shopcart();
		assertTrue(0==c1.itemscount());
	}
	@Test 
	void test2() {
		c1=new shopcart();
		c1.additem();
		c1.addval(127);
		assertTrue(127==c1.cartvalue());
		assertTrue(1==c1.itemscount());
	}
	@Test
	void test3() {
		c1=new shopcart();
		c1.additem();
		c1.addval(127);
		c1.additem();
		c1.addval(100);
		assertTrue(2==c1.itemscount());
		assertTrue(227==c1.cartvalue());
	}

}
