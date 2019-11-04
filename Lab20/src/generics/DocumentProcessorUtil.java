package generics;

import java.util.Arrays;

/**
 * Created by Brainacad4 on 14.10.2019.
 */
public class DocumentProcessorUtil {

    private static int ID_COUNTER;

    private DocumentProcessorUtil() {
    }

    private <T extends AbstractData & Storable> StringData convert(T data) {
        StringData stringData = new StringData(ID_COUNTER++, data.getType(), data);
        return stringData;
    }

    static <T> void build(Storable storeObj, T data) {
        storeObj.write(data);
    }

    public static void main(String[] args) {
        XmlData xmlData = new XmlData(++ID_COUNTER);
        BinaryData binaryData = new BinaryData(++ID_COUNTER);
        NumericData numericData = new NumericData(++ID_COUNTER);
        String xml = "<?xml version=\"1.0\"?><Tests>qwerty</Tests>";
        byte[] array = "Данные в байтах".getBytes();
        Double d = 123.456789;
        DocumentProcessorUtil.build(xmlData, xml);
        DocumentProcessorUtil.build(binaryData, array);
        DocumentProcessorUtil.build(numericData, d);
        StringData stringData = new DocumentProcessorUtil().convert(xmlData);
        System.out.println(stringData);
        StringData stringData2 = new DocumentProcessorUtil().convert(binaryData);
        System.out.println(stringData2);
        StringData stringData3 = new DocumentProcessorUtil().convert(numericData);
        System.out.println(stringData3);

    }
}
/**
 * 6.Создать класс Main
 * •Создать psvm
 * •Создать экземпляры классов XmlData, BinaryData, NumericData()
 * •Вкачестве id передать инкрементное значение счетчика ID_COUNTER;
 * •Подготовить данные для объектов:
 * XmlData–“<?xml version="1.0"?><Tests>qwerty</Tests>”
 * BinaryData–получить массив байт из тестовой строки «Данные в байтах»
 * NumericData–любое число например Double d= 123.456789;
 * •С помощью метода DocumentProcessorUtil.build() объединить данные с обьектом.
 * •СпомощьюметодаDocumentProcessorUtil.convert();преобразовать первоначальные объекты в StringData
 * •Вывести данные из всех полученных StringDataна экран.
 * 7.ДобавитьабстрактныйметодвклассAbstractData-abstract String convertToString()
 * 8.Реализовать этот метод во всех дочерних классах. Метод должен правильно преобразовать
 * хранящееся данные в строковый вид.
 * 9.В конструкторе класса StringDataизменить присвоение данных. Вызывать новый метод convertToString().
 * Примечание из Generic можно убрать Storable;
 **/