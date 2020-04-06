package prototype;

public class Main {

    public static void main(String[]args) {
        Registry registry = new Registry();

        Movie movie = (Movie)registry.createItem("Movie");
        movie.setRuntime("new");
        System.out.println(movie);

        Book book = (Book)registry.createItem("Book");
        book.setNumberOfPages(244);
        System.out.println(book);

    }
}
