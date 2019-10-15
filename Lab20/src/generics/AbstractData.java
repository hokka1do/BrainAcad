package generics;

/**
 * Created by Brainacad4 on 14.10.2019.
 */
public abstract class AbstractData {
    long id;

    public AbstractData(long id) {
        this.id = id;
    }

    public long getId() {
        return id;
    }

    abstract String convertToString();
}

