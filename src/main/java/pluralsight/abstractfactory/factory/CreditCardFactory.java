package pluralsight.abstractfactory.factory;

import pluralsight.abstractfactory.model.CardType;
import pluralsight.abstractfactory.model.CreditCard;
import pluralsight.abstractfactory.validator.Validator;

public abstract class CreditCardFactory {

    public static CreditCardFactory getCreditCardFactory(int creditScore) {
        if (creditScore > 650) {
            return new AmexFactory();
        } else {
            return new VisaFactory();
        }
    }

    public abstract CreditCard getCreditCard(CardType cardType);

    public abstract Validator getValidator(CardType cardType);
}
