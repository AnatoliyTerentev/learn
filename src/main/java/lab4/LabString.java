package lab4;

public class LabString {
    public LabString() {
    }
    public static void main(String[] args) {
        String str = "Java-строго типизированный объектно-ориентированный язык программирования, " +
                    "разработанный компанией Sun Microsystems в последующем приобретённой компанией Oracle ";

        /*1. Получить длину строки */
        System.out.println("1. String length consist of " + str.length()+ "symbols");

        /*2. Сравнить 2 строки без учета регистра */
        String str1 = new String();
        String str2 = new String();
        str1 = "Java-строго типизированный объектно-ориентированный язык программирования, сравнить с str ";
        str2 = "Java-строго типизированный объектно-ориентированный язык программирования, " +
            "разработанный компанией Sun Microsystems в последующем приобретённой компанией Oracle";
        String str4 = "Занести в пул литералов";

        System.out.print("2: str vs str1 is " + str.equalsIgnoreCase(str1));
        System.out.println("; str vs str2 is " + str.equalsIgnoreCase(str2));

        /*3. Создать новую строку с помощью конструктора и занести ее в пул литералов */
        String strLit = new String("Занести в пул литералов");
        System.out.println("3: "+ strLit.intern());

        /*4. Объединить 2 строки при которых новый объект будет создан */
        String str3 = new String();
                str3=str+str2;
        System.out.println("4: " + str3);

        /*5. Объединить 2 строки при которых новый объект НЕ будет созданы*/
        str = str.concat("добавление строки");
        System.out.println("5: " + str);

        /*6. Получить из строки массив символов*/
        char[] strToCharArr = str3.toCharArray();
        System.out.println("6: " + strToCharArr);

        /*7. Получить из строки массив байтов*/
        byte[] strToByteArr  = str.getBytes();
        System.out.println("7: " + str.getBytes());

        /* 8. Привести строку к верхнему регистру */
        System.out.println("8: " + str.toUpperCase());

        /* 9. Найти первую позицию символа "а" в строке*/
        System.out.println("9: " + str.indexOf('а'));

        /*10. Найти последнюю позицию символа "а" в строке*/
        System.out.println("9: " + str.lastIndexOf('а'));

        /*11. Проверить содержит-ли строка слово "Sun"*/
        System.out.println("11 :" + str.contains("Sun"));

        /*12. Проверить оканчивается-ли строка на "Oracle"*/
        System.out.println( "12 :" + str3.endsWith("Oracle"));

        /*13. Проверить начинается-ли строка на "Java"*/
        System.out.println( "13 :" + str.startsWith("Java"));

        /*14. Заменить все символы "а" в строке на символ "о" */
        str2 = str2.replace("а","о");
        System.out.println("14: " + str2);

        /*15. Получить подстроку с 44 символа по 90 символ*/
        System.out.println("15: " + str.substring(44,90));

        /*16. Разбить строку по символу пробел (т.е. чтобы каждое слово было отдельным элементом массива)*/
        String[] strArr = str.split(" ");
        for (String word : strArr) {
            System.out.println("16: " + word);
        }
        
        /*17. Сделать с из строки str строку типа StringBuilder*/
        StringBuilder stringBuilder = new StringBuilder(str);
        System.out.println("17: " + stringBuilder);

        /*18. Добавить в конец строки StringBuilder символ точки*/
        System.out.println("18: " + stringBuilder.append("."));

        /*19. Удалить из строки StringBuilder подстроку ", разработанный компанией Sun Microsystems в последующем приобретённой компанией Oracle"*/
        System.out.println("19: " + stringBuilder.delete(stringBuilder.indexOf(","),stringBuilder.lastIndexOf(".")+1));

        /*20. Поменять последовательность символов в строке на обратную. */
        System.out.println("20: " + stringBuilder.reverse());
        }
}
