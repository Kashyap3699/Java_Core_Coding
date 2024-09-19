package Week_4;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Program_169<T>{
    ArrayList<T> arrayList = new ArrayList<>();

    public void push(T item) {
        arrayList.add(item);
    }

    public T pop() {
        if (arrayList.isEmpty())
            throw new RuntimeException("Stack is empty");
        return arrayList.remove(arrayList.size() - 1);
    }

    public void printStack() {
        System.out.println("Stack elements : ");
        arrayList.forEach(System.out::println);
    }
    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {
            Program_169<Integer> genericStack = new Program_169<>();
            int choice;
            while (true) {
                System.out.println("Choose Action to perform");
                System.out.println("1.push element");
                System.out.println("2.pop element");
                System.out.println("3.All elements in stack");
                System.out.println("4.exit");
                System.out.print("Enter choice No : ");
                choice = sc.nextInt();
                switch (choice) {
                    case 1:
                        System.out.println("Enter element to push : ");
                        int item = sc.nextInt();
                        genericStack.push(item);
                        break;
                    case 2:
                        int popped = genericStack.pop();
                        System.out.println("Popped : " + popped);
                        break;
                    case 3:
                        genericStack.printStack();
                        break;
                    case 4:
                        return;
                    default:
                        System.out.println("Enter valid choice..!");
                }

            }
        } catch (InputMismatchException e) {
            System.out.println("Enter valid input..!");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
