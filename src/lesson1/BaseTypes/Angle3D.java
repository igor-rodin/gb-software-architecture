package lesson1.BaseTypes;

/**
 * Class Angle3D describe rigid body rotation in 3d space.
 *  alpha, betta, gamma  - Euler angles in radians
 */
public class Angle3D {
    private final double alpha;
    private final double betta;
    private final double gamma;

    public Angle3D(double alpha, double betta, double gamma) {
        this.alpha = alpha;
        this.betta = betta;
        this.gamma = gamma;
    }
}
