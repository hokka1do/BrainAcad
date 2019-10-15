package generics;

import java.lang.reflect.Type;

/**
 * Created by Brainacad4 on 14.10.2019.
 */
public class XmlData extends AbstractData implements Storable<XmlData> {
    TYPE type =TYPE.XML;
    public XmlData(long id) {
        super(id);
    }

    @Override
    String convertToString() {
        return null;
    }

    @Override
    public XmlData read() {
        return null;
    }

    @Override
    public void write(XmlData data) {

    }

    @Override
    public Type getType() {
        return null;
    }
}
