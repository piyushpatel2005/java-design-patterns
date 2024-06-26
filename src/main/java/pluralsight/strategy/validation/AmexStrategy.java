package pluralsight.strategy.validation;

import pluralsight.strategy.domain.CreditCard;

public class AmexStrategy extends ValidationStrategy {
    @Override
    public boolean isValid(CreditCard creditCard) {
        boolean isValid = false;

        isValid = creditCard.getNumber().startsWith("37") || creditCard.getNumber().startsWith("34");

        if (isValid) {
            isValid = creditCard.getNumber().length() == 15;
        }

        if (isValid) {
            isValid = passesLuhn(creditCard.getNumber());
        }

        return isValid;
    }
}
