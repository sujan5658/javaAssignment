public class Assignment2 {
    public static void main(String[] args){
        //Type Conversion 
        System.out.println("# Type conversion");
        byte b1;
        short s1;
        int in1;
        long ln1;
        float fn1;
        double db1;
        b1 = 6;
        s1 = b1;
        in1 = s1;
        ln1 = in1;
        fn1 = ln1;
        db1 = fn1;
        System.out.println("Here the conversion happens automatically and the double value is : "+db1);
        System.out.println("");
        
        //Type casting
        System.out.println("# Type casting");
        db1 = 125.6879;
        fn1 = (float) db1;
        ln1 = (long) fn1;
        in1 = (int) ln1;
        s1 = (short) in1;
        b1 = (byte) s1;
        System.out.println("Here the upper datatype is typecast into lower datatype. Result( Byte value of Double) :"+b1);
        System.out.println("");
        
        //String to Numeric Conversion.
        System.out.println("# Conversion of String value to Numeric value");
        String str1;
        str1 = "123";
        System.out.println("Here the string before conversion is : "+str1);
        b1 = Byte.parseByte(str1);   //Conversion of string into the byte value
        System.out.println("String after conversion to byte value : "+b1);
        s1 = Short.parseShort(str1);   //Conversion of string into the short value
        System.out.println("String after conversion to short value : "+s1);
        in1 = Integer.parseInt(str1);   //Conversion of string into the integer value
        System.out.println("String after conversion to integer value : "+in1);
        fn1 = Float.parseFloat(str1);   //Conversion of string into the float value
        System.out.println("String after conversion to float value : "+fn1);
        db1 = Double.parseDouble(str1);   //Conversion of string into the double value
        System.out.println("String after conversion to double value : "+db1);
        System.out.println("");
        
        //Conversion of numeric value into string value
        System.out.println("# Conversion of Numeric Value to String value");
        String st;
        b1=5;
        s1 = 20;
        in1 = 25556;
        ln1 = 2656868;
        fn1 = 546521.235F;
        db1 = 254651.23565678;
        System.out.println("byte value Before conversion : "+b1);
        st = Byte.toString(b1);
        System.out.println("byte value after conversion to sring : "+st);
        System.out.println("short value Before conversion : "+s1);
        st = Short.toString(s1);
        System.out.println("short value after conversion to sring : "+st);
        System.out.println("int value Before conversion : "+in1);
        st = Integer.toString(in1);
        System.out.println("int value after conversion to sring : "+st);
        System.out.println("float value Before conversion : "+fn1);
        st = Float.toString(fn1);
        System.out.println("float value after conversion to sring : "+st);
        System.out.println("double value Before conversion : "+db1);
        st = Double.toString(db1);
        System.out.println("double value after conversion to sring : "+st);
        System.out.println("");
        
        //Basic to object type conversion
        System.out.println("# Basic type to Object type conversion");
        b1=5;
        s1 = 20;
        in1 = 25556;
        ln1 = 2656868;
        fn1 = 546521.235F;
        db1 = 254651.23565678;
        Byte byte_num;
        Integer int_num;
        Short short_num;
        Long long_num;
        Float float_num;
        Double double_num;
        System.out.println("Basic byte type before conversion : "+b1);
        byte_num = new Byte(b1);
        System.out.println("After conversion to Object type : "+byte_num);
         System.out.println("Basic short type before conversion : "+s1);
        short_num = new Short(s1);
        System.out.println("After conversion to Object type : "+short_num);
         System.out.println("Basic int type before conversion : "+in1);
        int_num = new Integer(in1);
        System.out.println("After conversion to Object type : "+int_num);
         System.out.println("Basic long type before conversion : "+ln1);
        long_num = new Long(ln1);
        System.out.println("After conversion to Object type : "+long_num);
         System.out.println("Basic float type before conversion : "+fn1);
        float_num = new Float(fn1);
        System.out.println("After conversion to Object type : "+float_num);
         System.out.println("Basic double type before conversion : "+db1);
        double_num = new Double(db1);
        System.out.println("After conversion to Object type : "+double_num);
        System.out.println("");
        //object to basic type conversion
        System.out.println("# Object to basic type conversion");
        b1 = (byte) byte_num;
        System.out.println("Object type byte before conversion : "+byte_num);
        System.out.println("After conversion to basic type : "+b1);
        s1 = (short) short_num;
        System.out.println("Object type short before conversion : "+short_num);
        System.out.println("After conversion to basic type : "+s1);
        in1 = (int) int_num;
        System.out.println("Object type int before conversion : "+int_num);
        System.out.println("After conversion to basic type : "+in1);
        ln1 = (long) long_num;
        System.out.println("Object type int before conversion : "+int_num);
        System.out.println("After conversion to basic type : "+in1);
        fn1 = (float) float_num;
        System.out.println("Object type float before conversion : "+float_num);
        System.out.println("After conversion to basic type : "+fn1);
        db1 = (double) double_num;
        System.out.println("Object type int before conversion : "+double_num);
        System.out.println("After conversion to basic type : "+db1);
    }
}
