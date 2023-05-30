import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MovieManagerTest {

    MovieManager manager = new MovieManager();


    @Test
    public void shouldSetCorrectMovie() {

        manager.add("Фильм 1");
        manager.add("Фильм 2");
        manager.add("Фильм 3");
        manager.add("Фильм 4");
        manager.add("Фильм 5");

        String[] expected = {"Фильм 1", "Фильм 2", "Фильм 3", "Фильм 4", "Фильм 5"};
        String[] actual = manager.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldSetCorrectMovieIfOne() {

        manager.add("Фильм 1");

        String[] expected = {"Фильм 1"};
        String[] actual = manager.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldSetCorrectMovieIfNoAdd() {


        String[] expected = {};
        String[] actual = manager.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldSetCorrectMovieContrary() {

        manager.add("Фильм 1");
        manager.add("Фильм 2");
        manager.add("Фильм 3");
        manager.add("Фильм 4");
        manager.add("Фильм 5");

        String[] expected = {"Фильм 5", "Фильм 4", "Фильм 3", "Фильм 2", "Фильм 1"};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldSetCorrectMovieContraryIfEight() {

        manager.add("Фильм 1");
        manager.add("Фильм 2");
        manager.add("Фильм 3");
        manager.add("Фильм 4");
        manager.add("Фильм 5");
        manager.add("Фильм 6");
        manager.add("Фильм 7");
        manager.add("Фильм 8");

        String[] expected = {"Фильм 8", "Фильм 7", "Фильм 6", "Фильм 5", "Фильм 4"};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldSetCorrectMovieContraryIfOne() {

        manager.add("Фильм 1");

        String[] expected = {"Фильм 1"};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldSetCorrectMovieContraryIfZero() {

        String[] expected = {};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldSetCorrectMovieContraryWithLimit() {
        MovieManager manager = new MovieManager(3);
        manager.add("Фильм 1");

        String[] expected = {"Фильм 1"};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldSetCorrectMovieContraryWithLimitEight() {
        MovieManager manager = new MovieManager(8);
        manager.add("Фильм 1");
        manager.add("Фильм 2");
        manager.add("Фильм 3");
        manager.add("Фильм 4");
        manager.add("Фильм 5");
        manager.add("Фильм 6");
        manager.add("Фильм 7");
        manager.add("Фильм 8");

        String[] expected = {"Фильм 8", "Фильм 7", "Фильм 6", "Фильм 5", "Фильм 4", "Фильм 3", "Фильм 2", "Фильм 1"};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }
}
