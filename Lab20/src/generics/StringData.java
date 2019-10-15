package generics;

import java.lang.reflect.Type;

/**
 * Created by Brainacad4 on 14.10.2019.
 */
public class StringData extends AbstractData {
    private Type type;
    private String data;

    public <T extends AbstractData & Storable> StringData(long id, Type type, T data) {
        super(id);
    }

    @Override
    String convertToString() {
        return null;
    }
}
