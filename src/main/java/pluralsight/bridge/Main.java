package pluralsight.bridge;

public class Main {

    public static void main(String[] args) {

        Movie movie = new Movie();
        movie.setClassification("Action");
        movie.setRuntime("2:15");
        movie.setTitle("John Wick");
        movie.setYear("2014");

        Formatter printFormatter = new PrintFormatter();
        Printer moviePrinter = new MoviePrinter(movie);

        String printedMaterial = moviePrinter.print(printFormatter);

        System.out.println(printedMaterial);

        // For different styles of printing, we simply need the formatter class for that style
        // We can use the same movie object.
        Formatter htmlFormatter = new HtmlFormatter();

        String htmlMaterial = moviePrinter.print(htmlFormatter);

        System.out.println(htmlMaterial);
    }
}
