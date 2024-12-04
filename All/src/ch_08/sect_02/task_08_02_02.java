package ch_08.sect_02;

public class task_08_02_02 {
    public static void main(String[] args) {

//        String -> StringBuffer / StringBuilder:
        String str = "Hello";
        StringBuffer sbBuffer = new StringBuffer(str);
        StringBuilder sbBuilder = new StringBuilder(str);

//        StringBuffer / StringBuilder -> String:
        String resultFromBuffer = sbBuffer.toString();
        String resultFromBuilder = sbBuilder.toString();

//        StringBuffer <-> StringBuilder:
//        Прямой конверсии нет, но можно преобразовать через String:
        StringBuilder builderFromBuffer = new StringBuilder(sbBuffer.toString());
        StringBuffer bufferFromBuilder = new StringBuffer(sbBuilder.toString());
    }
}
