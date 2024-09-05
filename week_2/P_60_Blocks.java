package week_2;

public class P_60_Blocks {
    static{
        System.out.println("static block will execute only for once and before object is created");
    }

    //instance blocks are mostly used to initialize instance variables or perform other setup tasks when an object is created.
    {
        System.out.println("instance block will execute everytime there is an object created");
    }

    //constructors are used to get instance of the class
    P_60_Blocks(){
        System.out.println("This executes everytime and object is created");
    }

    public static void main(String[] args) {

        //static block will execute as soon as program is loaded in the memory
        //first the instance block executes then constructor
        P_60_Blocks p = new P_60_Blocks();
        P_60_Blocks p1 = new P_60_Blocks();
    }
}
