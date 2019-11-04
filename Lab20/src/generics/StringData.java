package generics;

import java.lang.reflect.Type;

/**
 * Created by Brainacad4 on 14.10.2019.
 */
public class StringData extends AbstractData {
    private Type type;
    private String data;

    public <T extends AbstractData> StringData(long id, Type type, T data) {
        super(id);
        this.type = type;
        this.data = data.convertToString();
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    @Override
    String convertToString() {
        return "StringData{" +
                "type=" + type +
                ", data='" + data + '\'' +
                '}';
    }
}
