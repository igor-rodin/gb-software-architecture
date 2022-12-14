package lesson1.ModelElements;

import java.util.List;

/**
 * The class Scene describe the 3d scene.
 * ID - unique identifier of the scene.
 * Models - list of polygonal models in the Scene.
 * Flashes - list of light sources in the Scene.
 */
public class Scene {
    public int Id;
    public List<PoligonalModel> Models;
    public List<Flash> Flashes;

    /**
     * Method add polygonal model to the Scene
     * @param model polygonal model {@link PoligonalModel}
     */
    public void AddPolygonalModel(PoligonalModel model) {
        if (model != null) {
            Models.add(model);
        }
    }

    /**
     * Method add light source to the Scene
     * @param flash light source {@link Flash}
     */
    public void AddFlash(Flash flash) {
        if (flash != null) {
            Flashes.add(flash);
        }
    }
}
