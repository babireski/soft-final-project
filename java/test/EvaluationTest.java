import junit.framework.TestCase;
import static org.junit.Assert.*;
import org.junit.*;

public class EvaluationTest extends TestCase
{
	public EvaluationTest()
	{

	}

	@Before
	public void setUp()
	{

	}

	@After
	public void tearDown()
	{

	}

	@Test
	public void testConstructor() throws Exception
	{
		assertThrows(Exception.class, () -> {new Evaluation(null, null, -1);});
		assertThrows(Exception.class, () -> {new Evaluation(null, null, 11);});
	}
}
