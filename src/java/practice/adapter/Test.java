package practice.adapter;

/**
 * 只会划艇的船长，开着渔船走了
 */
public class Test {
    public static void main(String[] args) {
        Captain captain = new Captain(new FishingBoatAdapter());
        captain.row();
    }
}
