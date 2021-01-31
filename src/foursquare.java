public class foursquare extends TwoDShape implements Regular{
    @Override
    public String Square() {
        return "side square";
    }

    @Override
    public String getName() {
        return "foursquare";
    }

    @Override
    public int getAngle() {
        return 360;
    }
}
