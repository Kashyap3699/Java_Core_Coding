package week_2;

//Create a class with a static counter variable that tracks the number of instances created.


public class P_34_InstanceCounter {

    private static int instanceCount = 0;

    public P_34_InstanceCounter() {
        instanceCount++;
    }

    public static void main(String[] args) {
        // Create instances of InstanceCounter
        P_34_InstanceCounter obj1 = new P_34_InstanceCounter();
        P_34_InstanceCounter obj2 = new P_34_InstanceCounter();
        P_34_InstanceCounter obj3 = new P_34_InstanceCounter();
        P_34_InstanceCounter obj4 = new P_34_InstanceCounter();


        System.out.println("Number of instances created: " + P_34_InstanceCounter.instanceCount);
    }
}




