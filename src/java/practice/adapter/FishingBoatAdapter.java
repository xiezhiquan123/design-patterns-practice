package practice.adapter;

/**
 * 用划艇技术来操作渔船的适配器
 */
public class FishingBoatAdapter implements RowingBoat {

    FishingBoat fishingBoat;

    public FishingBoatAdapter(){
        fishingBoat = new FishingBoat();
    }
    @Override
    public void row() {
        fishingBoat.sail();
    }
}
