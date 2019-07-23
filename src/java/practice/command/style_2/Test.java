package practice.command.style_2;

public class Test {

    public static void main(String[] args) {

        Chef chef = new Chef();

        //客人点单
        Command command1 = new CookChickenCommand(chef);
        Command command2 = new CookChickenCommand(chef);
        Command command3 = new CookDuckCommand(chef);

        //服务员记录客人点单
        Waiter waiter = new Waiter();
        waiter.addCommand(command1);
        waiter.addCommand(command2);
        waiter.addCommand(command3);

        //鸭有骚味，不要了
        waiter.cancleCommand(command3);

        waiter.notifyChef();



    }
}
