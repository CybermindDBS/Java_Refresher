public class TypeCasting_DataTypeSize_WrapperClasses {
    public static void main(String[] args) {
//         DATA TYPES AND THEIR SIZE:-
//
//         DataType Size:
//         boolean(1) = byte(1) < char(2) = short(2) < int(4) = float(4) < long(8) = double(8)
//
//         DataType Range:
//         byte: -128 to 127
//         char: 0 to 65535
//         short: -32768 to 32767
//         and so on... it's basically -(2^(sizeof(datatype)*8))/2 to (2^(sizeof(datatype)*8))/2 - 1
//
//
//         TYPE CASTING:-
//
//         Implicit Typecasting:
//         Converting smaller datatype to larger one (when the smaller datatype is within range of the larger one),
//         It is done automatically.
//         Ex. int to long, float to double

            int i = 1;
            long l;
            l = i;


//        Explicit Typecasting

//        The below conversion is not possible because the range of char does not accept negative values (out of range).
//        byte b = 1;
//        char c = b;
//        However this is possible (Explicit Typecasting),

            byte b = 1;
            char c = (char) b;

            double d = 1.0d;
            float f = (float) d;


//        WRAPPER CLASSES:-

        Integer in = 1;
        in = Integer.valueOf(1);
        in = Integer.MAX_VALUE;
        in = Integer.MIN_VALUE;
        in = Integer.parseInt("1");

        // All Type Conversion methods available for Integer class
        in.intValue();
        in.byteValue();
        in.shortValue();
        in.longValue();
        in.floatValue();
        in.doubleValue();


        Character ch = 'c';
        ch = Character.MAX_VALUE;
        ch = Character.MIN_VALUE;
        ch = Character.valueOf('c');

        // All Type Conversion methods available for Character class
        ch.charValue();
        int ii = (int) ch.charValue();


        Float fl = 1.0f;
        fl = Float.valueOf(1.0f);
        fl = Float.MIN_VALUE;
        fl = Float.MAX_VALUE;
        fl = Float.parseFloat("1.0f");

        // All Type Conversion methods available for Float class
        fl.floatValue();
        fl.doubleValue();
        fl.byteValue();
        fl.shortValue();
        fl.intValue();
        fl.longValue();
    }
}
