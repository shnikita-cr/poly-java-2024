package ch_02.sect_03;

class task_02_03_01 {
    public static void main(String[] args) {
        //Операторы присваивания
        int x = 10;         // =
        x += 5;             // x = x + 5 -> 15
        x -= 2;             // x = x - 2 -> 13
        x *= 3;             // x = x * 3 -> 39
        x /= 3;             // x = x / 3 -> 13
        x %= 5;             // x = x % 5 -> 3

        String str = "Hello, ";
        str += "world!";    // str = str + "world!" -> "Hello, world!"

        //Тернарный оператор ?:
        int a = 10, b = 20;
        int min = (a < b) ? a : b;    // min = 10

        String result = (a > b) ? "a is greater" : "b is greater";  // "b is greater"

        //Логические операторы || и &&
        boolean cond1 = true;
        boolean cond2 = false;

        boolean orResult = cond1 || cond2;  // true
        boolean andResult = cond1 && cond2; // false

        //Побитовые операторы |, ^, &

        int bit1 = 5;    // 0101 в бинарном виде
        int bit2 = 3;    // 0011 в бинарном виде

        int orBitwise = bit1 | bit2;   // 0101 | 0011 -> 0111 -> 7
        int xorBitwise = bit1 ^ bit2;  // 0101 ^ 0011 -> 0110 -> 6
        int andBitwise = bit1 & bit2;  // 0101 & 0011 -> 0001 -> 1


        //Операторы сравнения ==, >, >=, <, <=
        int x1 = 5, x2 = 10;

        boolean isEqual = (x1 == x2);  // false
        boolean isGreater = (x1 > x2); // false
        boolean isGreaterOrEqual = (x1 >= x2); // false
        boolean isLess = (x1 < x2);    // true
        boolean isLessOrEqual = (x1 <= x2);    // true

        String s1 = "Hello";
        String s2 = "World";

        boolean stringsEqual = s1.equals(s2);  // false

        //Побитовые сдвиги >>, >>>, <<
        int shiftVal = 8;  // 1000 в бинарном виде

        int rightShift = shiftVal >> 2;   // 1000 >> 2 -> 0010 == 2
        int unsignedRightShift = shiftVal >>> 2;  // 1000 >>> 2 -> 0010 == 2
        int leftShift = shiftVal << 2;    // 1000 << 2 -> 100000 == 32

        //Арифметические операторы +, -, *, /, %
        int num1 = 20;
        int num2 = 6;

        int addition = num1 + num2;    // 26
        int subtraction = num1 - num2; // 14
        int multiplication = num1 * num2; // 120
        int division = num1 / num2;    // 3
        int modulus = num1 % num2;     // 2

        String greeting = "Hello";
        String name = "Alice";
        String fullGreeting = greeting + ", " + name;  // "Hello, Alice"

        //Префиксные и постфиксные операторы ++ и --
        int val = 5;

        int postIncrement = val++;     // постфиксный инкремент -> postIncrement = 5, val = 6
        int preIncrement = ++val;      // префиксный инкремент -> preIncrement = 7, val = 7

        int postDecrement = val--;     // постфиксный декремент -> postDecrement = 7, val = 6
        int preDecrement = --val;      // префиксный декремент -> preDecrement = 5, val = 5

        //Побитовые операторы ~ и !
        int bitVal = 5;   // 0101 в бинарном виде
        int bitwiseNot = ~bitVal;   // ~0101 -> 1010 в бинарном виде (с учетом знака -6)

        boolean flag = true;
        boolean logicalNot = !flag; // false

        //Операторы ( ) и [ ]
        int[] array = {1, 2, 3, 4};

        int elementAtIndex = array[2]; // 3

        int sum = (3 + 5) * 2;         // приоритет операции -> 16
    }

    public void strings() {
        //Оператор + для конкатенации строк
        String str1 = "Hello, ";
        String str2 = "world!";
        String result = str1 + str2;      // "Hello, world!"

        String str3 = "Number: ";
        int num = 10;
        String resultWithInt = str3 + num; // "Number: 10"

        //Оператор += для добавления к строке
        String greeting = "Hello";
        greeting += ", world!";           // "Hello, world!"

        //Оператор == и метод equals для сравнения строк
        String s1 = "Hello";
        String s2 = "Hello";
        String s3 = new String("Hello");

        boolean isEqual = s1 == s2;        // true, поскольку s1 и s2 указывают на один и тот же объект
        boolean isEqualNew = s1 == s3;     // false, так как s3 создан через new и указывает на другой объект
        boolean isEqualContent = s1.equals(s3); // true, сравнение содержимого строк

        //Тернарный оператор ?:
        String str = "Java";
        String result2 = (str.length() > 3) ? "Long string" : "Short string"; // "Long string"

        //Примеры использования () для изменения приоритета операций
        String str4 = "Age: ";
        String result3 = str4 + (10 + 5) + "."; // "Age: 15.", скобки меняют приоритет
    }
}

