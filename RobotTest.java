import junit.framework.*;
import org.junit.Test;
import java.util.Arrays;

public class RobotTest extends TestCase {

	@Test
	public void testTrue() throws Exception {
		assertEquals(true, true);
	}

	@Test
	public void testTrue1() throws Exception {
		assertEquals(1, Robot.robotMove(1, ""));
	}

	@Test
	public void testTrue2() throws Exception {
		assertEquals(6, Robot.robotMove(3, "EESNSSW"));
	}

	@Test
	public void testTrue3() throws Exception {
		assertEquals(13, Robot.robotMove(5, "EESSWSSWNEEES"));
	}

	@Test
	public void testTrue4() throws Exception {
		try {
			Robot.robotMove(5, "N");
		}catch (IndexOutOfBoundsException e){
			assertEquals("Robot is out of bounds", e.getMessage());
		}
	}

	@Test
	public void testTrue5() throws Exception {
		try {
			Robot.robotMove(0, "N");
		}catch (IllegalArgumentException e){
			assertEquals("n <= 0", e.getMessage());
		}
	}


}
