package pluralsight.bridge.formatter.printer;

import pluralsight.bridge.formatter.domain.Detail;
import pluralsight.bridge.formatter.formatter.Formatter;

import java.util.List;

public abstract class Printer {

    // doesn't know anything about the formatter being passed in here
    public String print(Formatter formatter) {
        return formatter.format(getHeader(), getDetails());
    }

    abstract protected List<Detail> getDetails();

    abstract protected String getHeader();
}
