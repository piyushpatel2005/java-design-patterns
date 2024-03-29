package pluralsight.abstractfactory;

import pluralsight.abstractfactory.factory.CreditCardFactory;
import pluralsight.abstractfactory.model.CardType;
import pluralsight.abstractfactory.model.CreditCard;

public class Main {
    public static void main(String[] args) {

        CreditCardFactory abstractFactory = CreditCardFactory.getCreditCardFactory(775);

        CreditCard card = abstractFactory.getCreditCard(CardType.PLATINUM);
        System.out.println(card.getClass());

        abstractFactory = CreditCardFactory.getCreditCardFactory(600);

        CreditCard card2 = abstractFactory.getCreditCard(CardType.GOLD);
        System.out.println(card2);
    }
}
