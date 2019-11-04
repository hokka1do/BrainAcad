package generics;

import java.lang.reflect.Type;

/**
 * Created by Brainacad4 on 14.10.2019.
 */
public class NumericData extends AbstractData implements Storable<NumericData> {
    TYPE type = TYPE.NUM;
    private Number data;

    public NumericData(long id) {
        super(id);
    }


    @Override
    String convertToString() {
        return "NumericData{" +
                "type=" + type +
                ", data=" + data +
                '}';
    }

    @Override
    public String toString() {
        return "NumericData{" +
                "type=" + type +
                ", data=" + data +
                '}';
    }

    @Override
    public NumericData read() {
        return null;
    }

    @Override
    public void write(NumericData data) {
    }

    @Override
    public Type getType() {
        return type.getClass();
    }
}
