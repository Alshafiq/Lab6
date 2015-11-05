import junit.framework.*;

public class AllTests extends TestSuite {
	
	public static void main(String[] args) {
		junit.textui.TestRunner.run(new AllTests());
	}
	
	public static Test suite() {
		TestSuite suite = new TestSuite("Test for com.saorsa.nowplaying.tests");
		suite.addTest(new TestSuite(TestEmptyMovieList.class));
		suite.addTest(new TestSuite(TestMovieListWithOneMovie.class));
		suite.addTest(new TestSuite(TestMovieListWithTwoMovies.class));
		return suite;
	}
	
}
