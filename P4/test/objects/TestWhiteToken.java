package objects;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestWhiteToken extends AbstractTestToken {
	@Before
	public void setUp() {
		object = WhiteToken.instance();
	}

	@Test
	public void isWhite() {
		assertFalse(object.isBlack());
	}
	
	@Test
	public void unchanged() {
		assertSame(object, object.nextGeneration(2));
		assertTrue(object.nextGeneration(3).isBlack());
		assertSame(object, object.nextGeneration(4));
	}
	
	@Test
	public void test2() {
		assertFalse(object.nextGeneration(ts2).isBlack());
	}

	@Test
	public void test3() {
		assertTrue(object.nextGeneration(ts3).isBlack());
	}

	@Test
	public void test4() {
		assertFalse(object.nextGeneration(ts4).isBlack());
	}
}
