import junit.framework.*;
import static org.junit.Assert.*;
import org.junit.*;

public class StretchTest
{
	public StretchTest()
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
		assertThrows(Exception.class, () -> {new Stretch(null, 0, null, null);});
		assertThrows(Exception.class, () -> {new Stretch(null, -1, null, null);});
	}
}