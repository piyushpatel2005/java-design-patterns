package pluralsight.visitor.withpattern;

// Element interface
public interface AtvPart {
    public void accept(AtvPartVisitor visitor);
}
