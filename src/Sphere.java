public class Sphere extends ThreeDShape implements Regular {
    @Override
    public int getAngle() {
        return 720;
    }

    @Override
    public String Volume() {
        return "4/3*pi*r^3";
    }

    @Override
    public String Square() {
        return "4*pi*r^2";
    }

    @Override
    public String getName() {
        return "Sphere";
    }
}
