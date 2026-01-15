public class conditional {
    public static void main(String[] args) {
    int day = 3;

    //marks >= 90 A
    // marks >= 75 B
    // marks >= 60 C
    //D
        int marks = 89;
        if(marks>=90){
            System.out.println("A grade");
        } else if (marks>=75 ) {
            System.out.println("Grade B");
        } else if (marks>=60) {
            System.out.println("Grade C");
        }
        else {
            System.out.println("Failed");
        }

        switch (day) {
            case 1: {
                System.out.println("Monday");
                break;
            }

            case 2: {
                System.out.println("Tuesday");
                break;
            }
            case 3: {
                System.out.println("Wednesday");
                break;
            }
            case 4: {
                System.out.println("Thursday");
                break;
            }
            case 5: {
                System.out.println("Friday");
                break;

            }
            case 6: {
                System.out.println("Saturday");
                break;

            }
            case 7: {
                System.out.println("Sunday");
                break;

            }
            default: {
                System.out.println("Inavlid day");
                break;

            }
        }
    }

}

