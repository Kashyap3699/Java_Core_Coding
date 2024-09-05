package week_2;

public class P_42_NestedClass {
    static int data=30;
    static class Nested{
        void msg(){System.out.println("data is "+data);}
    }
    public static void main(String args[]){
        P_42_NestedClass.Nested obj=new P_42_NestedClass.Nested();
        obj.msg();
    }
}
