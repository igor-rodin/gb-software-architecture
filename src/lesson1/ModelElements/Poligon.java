package lesson1.ModelElements;

import lesson1.BaseTypes.Point3D;

import java.util.List;

/**
 * The class Poligon describe the polygonal model.
 * Points - vertex of the model.
 */
public class Poligon {
    public List<Point3D> Points;

    public Poligon(List<Point3D> points) {
        Points = points;
    }
}
