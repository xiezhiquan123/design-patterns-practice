package practice.command.style_2;

public class CookDuckCommand implements Command {

    private Chef chef;

    public CookDuckCommand(Chef chef){
        this.chef = chef;
    }
    @Override
    public void action() {
        chef.cookDuck();
    }
}
