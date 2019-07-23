package practice.command.style_2;

import java.util.ArrayList;
import java.util.List;

public class Waiter {

    private List<Command> commandList = new ArrayList<>();

    public void addCommand(Command command){
        commandList.add(command);
    }

    public void cancleCommand(Command command){
        commandList.remove(command);
    }

    public void notifyChef(){
        for (Command command: commandList){
            command.action();
        }
    }
}
