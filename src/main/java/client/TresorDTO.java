package client;

import application.ElementResponse;

import static client.FileHelper.*;

public class TresorDTO extends ElementAbstract {
    @Override
    public StringBuilder getLine(ElementResponse elt) {
        StringBuilder result = new StringBuilder();
        result.append(COMMENT)
                .append(" {")
                .append(TRESOR)
                .append(" comme Trésor}")
                .append(SEPARATOR)
                .append("{Axe horizontal}")
                .append(SEPARATOR)
                .append("{Axe vertical}")
                .append(SEPARATOR)
                .append("{Nb. de trésors restants}")
                .append(END_LINE);
        result.append(TRESOR + SEPARATOR)
                .append(elt.getAxeHorizontal())
                .append(SEPARATOR)
                .append(elt.getAxeVertical())
                .append(SEPARATOR)
                .append(elt.getNbTresor())
                .append(END_LINE);
        return result;
    }
}