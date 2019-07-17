package practice.adapter;

/**
 * 船长会使用划艇
 */
public class Captain implements RowingBoat{
    private RowingBoat rowingBoat;

    public Captain(RowingBoat rowingBoat){
        this.rowingBoat = rowingBoat;
    }
    @Override
    public void row() {
        rowingBoat.row();
    }
}
