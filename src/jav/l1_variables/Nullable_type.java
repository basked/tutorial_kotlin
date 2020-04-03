package jav.l1_variables;

public class Nullable_type {
    private static String name = null;
    private static String name2;

    public static void main(String[] args) {
        //System.out.println(name.length());//        Exception in thread "main" java.lang.NullPointerException at jav.Nullable_type.main(Nullable_type.java:6)
       // System.out.println(name2.length());//       Exception in thread "main" java.lang.NullPointerException at jav.Nullable_type.main(Nullable_type.java:6)


        // эквивалент ? в KOTLIN
        if(name!=null){
            System.out.println(name.length());
        } else
        {
            System.out.println("null");
        }

    }
}
