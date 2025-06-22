// Type Conversion and Casting
//explicit conversion = Casting in java
class TypeCastCon {
public static void main(String args[])
 {
    // byte y = 127;
    // int x = 12;
    // y = (byte) x ;
    // x = y;
    // System.out.println(x);
    // float f = 5.6f;
    // int x = (int) f;
    // System.out.println(x);
    
    /*type promotion  - when we perform the operation on datatype and if  the result exceeded the limit of that datatype it will automatically promoted to datatype which is in limit*/
    byte a =10; 
    byte b = 30;
    int result = a*b;
    System.out.println( ((Object)result).getClass().getName());
}
}

