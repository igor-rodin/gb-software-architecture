package lesson1.ModelElements;

import lesson1.BaseTypes.Angle3D;
import lesson1.BaseTypes.Point3D;

/**
 * The class Camera describe the camera in 3d scene.
 * Location - position of the Camera in the scene.
 * Angle - angle of the rotation of Camera.
 */
public class Camera {
    public Point3D Location;
    public Angle3D Angle;

    /**
     * Method rotate Camera on angle ({@link  Angle3D})
     * @param angle
     */
    public void Rotate(Angle3D angle) {
        //TO-DO
    }

    /**
     * Method move Camera to new point ({@link Point3D}) location
     * @param point3D
     */
    public void Move(Point3D point3D) {
        //TO-DO
    }
}
