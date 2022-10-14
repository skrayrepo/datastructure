public class SwitchStatement {
    public static void main(String[] args) {
        String input = "weekdays";
        switch (input){
            case "weekdays" :
                System.out.println("weekdays started");
                break;
            case "Weekend" :
                System.out.println("Weekend started");
            default:
                System.out.println("Holiday started");

        }
        //Java 14 modified switch statement
        /*switch (input) {
            case "weekdays" -> System.out.println("weekdays started");
            case "Weekend" -> System.out.println("Weekend started");
            default -> System.out.println("Holiday started");
        }*/

        }
}
