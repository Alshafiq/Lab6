import org.junit.runner.RunWith;
import org.junit.runners.Suite.SuiteClasses;
import org.junit.runners.Suite;
import junit.framework.*;

@RunWith(Suite.class)

@SuiteClasses({
	TestEmptyMovieList.class, 
	TestMovieListWithOneMovie.class, 
	TestMovieListWithTwoMovies.class
})

public class AllTests {
	
}
