package lesson1.ModelElements;

import java.util.ArrayList;
import java.util.List;

public class PoligonalModel {
     public List<Texture> Textures;
     public List<Poligon> Poligons;

     public PoligonalModel(List<Texture> textures, List<Poligon> poligons) {
          Textures = textures;
          Poligons = poligons;
     }
}
