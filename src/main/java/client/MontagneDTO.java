package client;

import application.ElementResponse;

import static client.FileHelper.*;

public class MontagneDTO extends ElementAbstract {
    @Override
    public StringBuilder getLine(ElementResponse elt) {
        StringBuilder result = new StringBuilder();
        result.append(MONTAGNE)
                .append(SEPARATOR)
                .append(elt.getAxeHorizontal())
                .append(SEPARATOR)
                .append(elt.getAxeVertical())
                .append(END_LINE);
        return result;
    }
}