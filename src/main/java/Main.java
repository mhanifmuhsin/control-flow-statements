public class Main {
    public static void main(String[] args) {
        char switchValue = 'D';

        switch (switchValue){
            case 'A' :
                System.out.println("Value is A");
                break;
            case 'B'  :
                System.out.println("Value is B");
                break;
            case 'C':
                System.out.println("Value is C");
                break;
            case 'D': case 'E' :
                System.out.println("Value is D or E");
                break;
            default:
                System.out.println("Not Found");
                break;
        }
    }
}

