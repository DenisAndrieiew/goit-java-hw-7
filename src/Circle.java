public class Circle extends TwoDShape implements Regular{
    @Override
    public String getName() {
        return "Circle";
    }


    @Override
    public int getAngle() {
        return 360;
    }
}
