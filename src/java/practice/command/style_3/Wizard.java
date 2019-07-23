package practice.command.style_3;

import java.util.Deque;
import java.util.LinkedList;

public class Wizard {

    private Deque<Command> undoStack = new LinkedList<>();

    private Deque<Command> redoStack = new LinkedList<>();

    public Wizard(){

    }

    public void castSpell(Command command,Target target){
        command.execute(target);
        undoStack.offerLast(command);
    }

    public void undoLastSpell(){
        if(!undoStack.isEmpty()){
            Command previousSpell = undoStack.pollLast();
            redoStack.offerLast(previousSpell);
            previousSpell.undo();
        }
    }

    public void redoLastSpell(){
        if(!redoStack.isEmpty()){
            Command previousSpell = redoStack.pollLast();
            undoStack.offerLast(previousSpell);
            previousSpell.redo();
        }
    }
}
