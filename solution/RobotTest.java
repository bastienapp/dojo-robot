import junit.framework.*;
import org.junit.Test;
import java.util.Arrays;

public class RobotTest extends TestCase {

	@Test
	public void testTrue() throws Exception {
		assertEquals(true, true);
	}

	@Test
	public void test1() throws Exception {
		assertEquals(6, Robot.move(3, "EESNSSW"));
	}

	@Test
	public void test2() throws Exception {
		assertEquals(13, Robot.move(5, "EESSWSSWNEEESS"));
	}
}