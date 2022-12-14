package lesson1.InMemoryModel;

import lesson1.ModelElements.Camera;
import lesson1.ModelElements.Flash;
import lesson1.ModelElements.PoligonalModel;
import lesson1.ModelElements.Scene;

import java.util.List;

/**
 * Class ModelStore describe storage Scene and model elements
 */
public class ModelStore implements IModelChanger{
    public List<PoligonalModel> Models;
    public List<Scene> Scenes;
    public List<Flash> Flashes;
    public List<Camera> Cameras;

    private List<IModelChangedObserver> changeObservers;

    public Scene GetScene(int ID) {
        if (ID < 0 || ID >= Scenes.size()) {
            return null;
        }

        return  Scenes.get(ID);
    }

    @Override
    public void NotifyChange(IModelChanger sender) {
        //TO-DO
    }
}
