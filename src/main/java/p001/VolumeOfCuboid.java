package p001;

public class VolumeOfCuboid {
    /*  Bob needs a fast way to calculate the volume of a cuboid with three values:
    the length, width and height of the cuboid. Write a function to help Bob with this calculation.*/

    public static void main(String[] args) {
        double a = 9;
        double b = 6;
        double c = 3;
        System.out.println(getVolumeOfCuboid(a, b, c));
    }

    public static double getVolumeOfCuboid(final double length, final double width, final double height) {

        return length * width * height;
    }
}
