package generics;

/**
 * Created by Brainacad4 on 14.10.2019.
 */
public class DocumentProcessorUtil {

    static int ID_COUNTER;

    private DocumentProcessorUtil() {
    }

    <T extends AbstractData & Storable> StringData convert(T data) {
        StringData stringData = new StringData(ID_COUNTER++, data.getType(), data);
        return stringData;
    }

    static <T> void build(Storable storeObj, T data) {
        storeObj.write(data);
    }

    public static void main(String[] args) {
        XmlData xmlData = new XmlData(ID_COUNTER);
        String xmlData2 = "<?xml version=\"1.0\"?><Tests>qwerty</Tests>";
        BinaryData binaryData = new BinaryData(ID_COUNTER);

        NumericData numericData = new NumericData(ID_COUNTER);

    }
}
