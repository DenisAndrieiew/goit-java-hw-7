public class Circle extends TwoDShape implements Regular{
    @Override
    public String getName() {
        return "Circle";
    }

    @Override
    public String Square() {
        return "pi*r^2";
    }

    @Override
    public int getAngle() {
        return 360;
    }
}
