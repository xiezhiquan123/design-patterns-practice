package practice.command.style_3;

public class Goblin extends Target {

    public Goblin(){
        setSize(Size.NORMALL);
        setVisibility(Visibility.VISIBLE);
    }
    @Override
    public String toString() {
        return "Goblin";
    }
}
