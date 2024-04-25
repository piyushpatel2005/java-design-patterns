package pluralsight.command.model;

import pluralsight.command.model.Command;

// invoker
public class Switch {

    public void storeAndExecute(Command command) {
        command.execute();
    }


}
