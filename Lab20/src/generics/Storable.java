package generics;

import java.lang.reflect.Type;


public interface Storable<S> {
    S read();
    void  write(S data);
    Type getType();
}
