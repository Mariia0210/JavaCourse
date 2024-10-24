package com.javalesson.hello;

public class HelloWorld {

    public static void main(String[] args) {

        byte a = 10;
        short c = 200;
        int q = 18;
        long myLongValue = 123_456_789_876_543_211_2L;

        float myfloatValue = 23.56F;
        double myDoubleValue = 56.45d;

        float sum = a + c + q + myLongValue + myfloatValue;
        float floatResult = myfloatValue / 3;

        double myNewDouble = 23.56;
        char char1 = 'A';
        char char2 = 'a';
        char char3 = '\n';
        char char4 = '^';
        char char5 = '\u00B6';


        System.out.println("Sum of Characters");
        System.out.println("chars:" + char1 + char2 + char3 + char4 + char5);


        System.out.println("Characters");
        System.out.println("char1 = " + char1);
        System.out.println("char2 = " + char2);
        System.out.println("char3 = " + char3);
        System.out.println("char4 = " + char4);
        System.out.println("char5 = " + char5);


        boolean b1 = true;
        boolean b2 = false;

        String s = "some string" + " some other string";
        System.out.println(s);

        System.out.println("myDoubleResult = " + myNewDouble / 3);

        System.out.println("floatResult = " + floatResult);
        System.out.println("SUM = " + sum);
        System.out.println("f = " + ((a + q) - 1));
        System.out.println("short c = " + c);
        System.out.println("int q =" + q);


        short someShort = a;
        int someInt = someShort;

        someShort = (short) someInt;
        someInt = (int) myLongValue;

        double someDouble = myfloatValue;
        System.out.println("someDouble = " + someDouble);

        double someIntToDouble = someInt;
        System.out.println("someInt = " + someInt);
        System.out.println("someIntToDouble  = " + someIntToDouble);

        double someLongTodouble = myLongValue;
        System.out.println("someLongTodouble =" + someLongTodouble);

        long someDoubleToLong = (long) someLongTodouble;
        System.out.println("someDoubleToLong =" + someDoubleToLong);


//        System.out.println("someInt = " + myLongValue);


    }
}
