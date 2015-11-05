import junit.framework.TestCase;
import static org.junit.Assert.*;
import org.junit.*;

public class TestEmptyMovieList{

	private MovieList movieList = null;
	
	@Before
	public void setUp() {
		movieList = new MovieList();
	}
	
	@Test
	public void testSize() {
		assertEquals("Size of empty movie list should be 0.", 0, movieList.size());
	}

}
