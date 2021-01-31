public class RegularTriangle extends Triangle implements Regular{

    @Override
    public int getAngle() {
        return 180;
    }

    @Override
    public String Square() {
        return "a^2*sqrt(3)/4";
    }

    @Override
    public String getName() {
        return "regular triangle";
    }
}
