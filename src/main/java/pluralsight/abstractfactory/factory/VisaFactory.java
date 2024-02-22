package pluralsight.abstractfactory.factory;

import pluralsight.abstractfactory.factory.CreditCardFactory;
import pluralsight.abstractfactory.model.CardType;
import pluralsight.abstractfactory.model.CreditCard;
import pluralsight.abstractfactory.model.visa.VisaBlackCreditCard;
import pluralsight.abstractfactory.model.visa.VisaGoldCreditCard;
import pluralsight.abstractfactory.validator.Validator;
import pluralsight.abstractfactory.validator.VisaValidator;

public class VisaFactory extends CreditCardFactory {
    @Override
    public CreditCard getCreditCard(CardType cardType) {
        switch (cardType) {
            case GOLD:
                return new VisaGoldCreditCard();
            case PLATINUM:
                return new VisaBlackCreditCard();
        }
        return null;
    }

    @Override
    public Validator getValidator(CardType cardType) {
        return new VisaValidator();
    }
}
