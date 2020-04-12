package exposition;

import common.DimensionDTO;
import common.ElementDTO;

import java.util.List;

public interface CarteAuxtTresors {

    void play(DimensionDTO dimensions, List<ElementDTO> elements);

    List<ElementDTO> getElements();
}
