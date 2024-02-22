package pluralsight.abstractfactory.validator;

import pluralsight.abstractfactory.model.CreditCard;

public class AmexPlatinumValidator implements Validator {
    @Override
    public boolean isValid(CreditCard creditCard) {
        return false;
    }
}
