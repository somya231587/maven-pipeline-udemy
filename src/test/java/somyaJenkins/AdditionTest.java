package somyaJenkins;

import static org.junit.Assert.*;

import org.junit.Test;

public class AdditionTest {

	@Test
	public void test() {
		Jenkins_Calculation ob=new Jenkins_Calculation();
		assertEquals(10,ob.add(5, 5));
	}

}
