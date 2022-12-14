package lesson1.ModelElements;

import java.awt.Color;

import lesson1.BaseTypes.Angle3D;
import lesson1.BaseTypes.Point3D;


/**
 * The class Flash describe the light source in 3d scene.
 * Location - position of the Flash in the scene.
 * Angle - angle of the rotation of Flash.
 * Color - color of the Flash.
 * Power - the power of the Flash.
 */
public class Flash {
    public Point3D Location;
    public Angle3D Angle;
    public Color Color;

    public float Power;

    /**
     * Method rotate Flash on angle ({@link  Angle3D})
     * @param angle
     */
    public void Rotate(Angle3D angle) {
        //TO-DO
    }

    /**
     * Method move Flash to new point ({@link Point3D}) position
     * @param point3D
     */
    public void Move(Point3D point3D) {
        //TO-DO
    }
}
