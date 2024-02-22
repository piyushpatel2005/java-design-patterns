package pluralsight.abstractfactory.validator;

import pluralsight.abstractfactory.model.CreditCard;

public interface Validator {
    public boolean isValid(CreditCard creditCard);
}
