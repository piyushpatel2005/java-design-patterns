package pluralsight.abstractfactory.factory;

import pluralsight.abstractfactory.factory.CreditCardFactory;
import pluralsight.abstractfactory.model.CardType;
import pluralsight.abstractfactory.model.CreditCard;
import pluralsight.abstractfactory.model.amex.AmexGoldCreditCard;
import pluralsight.abstractfactory.model.amex.AmexPlatinumCreditCard;
import pluralsight.abstractfactory.validator.AmexGoldValidator;
import pluralsight.abstractfactory.validator.AmexPlatinumValidator;
import pluralsight.abstractfactory.validator.Validator;

public class AmexFactory extends CreditCardFactory {


    @Override
    public CreditCard getCreditCard(CardType cardType) {
        switch (cardType) {
            case GOLD:
                return new AmexGoldCreditCard();
            case PLATINUM:
                return new AmexPlatinumCreditCard();
        }
        return null;
    }

    @Override
    public Validator getValidator(CardType cardType) {
        switch (cardType) {
            case GOLD:
                return new AmexGoldValidator();
            case PLATINUM:
                return new AmexPlatinumValidator();
        }
        return null;
    }
}
