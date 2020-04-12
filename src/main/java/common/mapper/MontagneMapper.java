package common.mapper;

import common.dto.ElementDTO;
import model.element.Element;

import static model.carte.TypeAxe.MONTAGNE;

public class MontagneMapper extends ElementMapper {
    @Override
    public void map(Element elt) {
        super.setType(MONTAGNE.getName());
        super.setAxeHorizontal(elt.getAxe().getAxeHorizontal());
        super.setAxeVertical(elt.getAxe().getAxeVertical());
    }
}
