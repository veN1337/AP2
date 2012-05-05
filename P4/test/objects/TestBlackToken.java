package objects;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestBlackToken extends AbstractTestToken {
	@Before
	public void setUp() {
		object = BlackToken.instance();
	}

	@Test
	public void isBack() {
		assertTrue(object.isBlack());
	}
	
	@Test
	public void unchanged() {
		assertFalse(object.nextGeneration(1).isBlack());
		assertSame(object, object.nextGeneration(2));
		assertSame(object, object.nextGeneration(3));
		assertFalse(object.nextGeneration(4).isBlack());
	}
	@Test
	public void test2() {
		assertTrue(object.nextGeneration(ts2).isBlack());
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
