package Week_4;

import java.util.Scanner;

public class Program_173 {
    public enum IsWeekends{
        SATURDAY("saturday"),
        SUNDAY("sunday");

        private final String day;

        IsWeekends(String day){
            this.day = day;
        }

        public String getDay(){
            return day;
        }
    }

    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            String today;
            System.out.println("Enter today's Day: ");
            today = sc.nextLine();

            if(today.trim().isEmpty()){
                System.out.println("Cannot be empty!");
                return;
            }

            IsWeekends sat = IsWeekends.SATURDAY;
            IsWeekends sun = IsWeekends.SUNDAY;

            if(today.toLowerCase().equals(sat.getDay()) || today.toLowerCase().equals(sun.getDay())){
                System.out.println("Day is Weekend!");
            }else{
                System.out.println("Not a weekend");
            }

        }catch (Exception e){
            System.out.println(e.getMessage());
        }

    }
}
