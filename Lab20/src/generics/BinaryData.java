package generics;

import java.lang.reflect.Type;
import java.util.Arrays;

/**
 * Created by Brainacad4 on 14.10.2019.
 */
public class BinaryData extends AbstractData implements Storable<BinaryData> {
    private final TYPE type = TYPE.BIN;
    private byte[] data;

    public byte[] getData() {
        return data;
    }

    public void setData(byte[] data) {
        this.data = data;
    }

    public BinaryData(long id) {
        super(id);
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
        return type.getClass();
    }

    @Override
    String convertToString() {
        return "BinaryData{" +
                "type=" + type +
                ", data=" + Arrays.toString(data) +
                '}';
    }

    @Override
    public String toString() {
        return "BinaryData{" +
                "type=" + type +
                ", data=" + Arrays.toString(data) +
                '}';
    }
}
