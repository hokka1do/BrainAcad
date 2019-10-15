package generics;

import java.lang.reflect.Type;

/**
 * Created by Brainacad4 on 14.10.2019.
 */
public class BinaryData extends AbstractData implements Storable<BinaryData>{
    TYPE type = TYPE.BIN;

    public BinaryData(long id) {
        super(id);
    }

    @Override
    String convertToString() {
        return null;
    }

    @Override
    public BinaryData read() {
        return null;
    }

    @Override
    public void write(BinaryData data) {

    }

    @Override
    public Type getType() {
        return null;
    }
}
