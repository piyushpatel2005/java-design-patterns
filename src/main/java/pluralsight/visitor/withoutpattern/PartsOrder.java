package pluralsight.visitor.withoutpattern;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PartsOrder implements AtvPart {

    private List<AtvPart> parts = new ArrayList<>();

    public PartsOrder() {

    }

    public void addPart(AtvPart atvPart) {
        parts.add(atvPart);
    }

    public List<AtvPart> getParts() {
        return Collections.unmodifiableList(parts);
    }

    // adding single method to base class would require to modify all subclasses
    @Override
    public double calculateShipping() {
        double shippingCost = 0;
        for (AtvPart atvPart : parts) {
            shippingCost += atvPart.calculateShipping();
        }
        return shippingCost;
    }
}
