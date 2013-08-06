
import static org.junit.Assert.assertTrue;
import org.junit.Test;
public class Practice_1_PrimitiveTypesTests {
	Practice_1_PrimitiveTypes	practice_1	= new Practice_1_PrimitiveTypes();
	@Test
	public void x1() {
		assertTrue(Byte.valueOf(practice_1.x1).equals(new Byte("1")));
	}
	@Test
	public void x2() {
		assertTrue(Byte.valueOf(practice_1.x2).equals(Byte.MIN_VALUE));
	}
	@Test
	public void x3() {
		assertTrue(Byte.valueOf(practice_1.x3).equals(Byte.MAX_VALUE));
	}
	@Test
	public void x4() {
		assertTrue(Short.valueOf(practice_1.x4).equals(Short.MIN_VALUE));
	}
	@Test
	public void x5() {
		assertTrue(Short.valueOf(practice_1.x5).equals(Short.MAX_VALUE));
	}
	@Test
	public void x6() {
		assertTrue(Integer.valueOf(practice_1.x6).equals(Integer.MIN_VALUE));
	}
	@Test
	public void x7() {
		assertTrue(Integer.valueOf(practice_1.x7).equals(Integer.MAX_VALUE));
	}
	@Test
	public void x8() {
		assertTrue(Long.valueOf(practice_1.x8).equals(((long)Integer.MIN_VALUE)*21));
	}
	@Test
	public void x9() {
		assertTrue(Long.valueOf(practice_1.x9).equals(((long)Integer.MAX_VALUE)*21));
	}
	@Test
	public void x10() {
		assertTrue(Float.valueOf(practice_1.x10).equals(new Float("-3.14")));
	}
	@Test
	public void x11() {
		assertTrue(Float.valueOf(practice_1.x11).equals(new Float("3.14")));
	}
	@Test
	public void x12() {
		assertTrue(Double.valueOf(practice_1.x12).equals(new Double("-3.14")));
	}
	@Test
	public void x13() {
		assertTrue(Double.valueOf(practice_1.x13).equals(new Double("3.14")));
	}
	@Test
	public void x14() {
		assertTrue(practice_1.x14==53);
	}
	@Test
	public void x15() {
		assertTrue(!practice_1.x15);
	}
}
