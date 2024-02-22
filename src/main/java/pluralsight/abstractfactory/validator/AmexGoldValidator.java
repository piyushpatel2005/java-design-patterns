package pluralsight.abstractfactory.validator;

import pluralsight.abstractfactory.model.CreditCard;

public class AmexGoldValidator implements Validator {
    @Override
    public boolean isValid(CreditCard creditCard) {
        return false;
    }
}
