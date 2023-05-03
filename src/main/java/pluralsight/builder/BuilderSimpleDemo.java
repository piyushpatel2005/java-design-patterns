package pluralsight.builder;

public class BuilderSimpleDemo {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder();

        builder.append("This is an example ");
        builder.append("of the pluralsight.builder pattern. ");
        builder.append(42);
        System.out.println(builder.toString());
    }
}
