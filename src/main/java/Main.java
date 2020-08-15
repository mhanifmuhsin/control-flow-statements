public class Main {
    public static void main(String[] args) {
        defaultSwitchStatement();
        challengeSwitchStatement(7);
    }

    public static void defaultSwitchStatement() {
        char switchValue = 'D';
        switch (switchValue) {
            case 'A':
                System.out.println("Value is A");
                break;
            case 'B':
                System.out.println("Value is B");
                break;
            case 'C':
                System.out.println("Value is C");
                break;
            case 'D':
            case 'E':
                System.out.println("Value is D or E");
                break;
            default:
                System.out.println("Not Found");
                break;
        }
    }

    public static void challengeSwitchStatement(int day) {
        String nameDay;
        switch (day) {
            case 0:
                nameDay = "Sunday";
                break;
            case 1:
                nameDay = "Monday";
                break;
            case 2:
                nameDay = "Tuesday";
                break;
            case 3:
                nameDay = "Wednesday";
                break;
            case 4:
                nameDay = "Thuesday";
                break;
            case 5:
                nameDay = "Friday";
                break;
            case 6:
                nameDay = "Saturday";
                break;
            default:
                nameDay = "Invalid day";
                break;
        }
        System.out.print(nameDay);
    }
}

