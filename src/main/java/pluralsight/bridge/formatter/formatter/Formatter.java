package pluralsight.bridge.formatter.formatter;

import pluralsight.bridge.formatter.domain.Detail;

import java.util.List;

public interface Formatter {

    String format(String header, List<Detail> details);
}
