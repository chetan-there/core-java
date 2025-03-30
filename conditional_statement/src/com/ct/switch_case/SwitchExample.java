package com.ct.switch_case;

// switch(expression) {
//     case value1:
//         // Code to execute when expression matches value1
//         break;
//     case value2:
//         // Code to execute when expression matches value2
//         break;
//     ...
//     default:
//         // Code to execute if no case matches
// }

public class SwitchExample {
    public static void main(String[] args) {
        int day = 3;

        switch(day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            default:
                System.out.println("Weekend");
        }
    }
}
