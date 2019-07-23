package practice.command.style_2;

public class CookChickenCommand implements Command {

    private Chef chef;

    public CookChickenCommand(Chef chef){
        this.chef =chef;
    }
    @Override
    public void action() {
        chef.cookChicken();
    }
}
