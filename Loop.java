public class Loop {


    public static void main(String[] args) {
        int count1 = 0;                           // PART A: Question 1
        while (count1 <= 30) {
            System.out.println(count1);
            count1 += 1;
        }

        int count2 = 30;                        // PART A: Question 2
        while (count2 >= 0) {
            System.out.println(count2);
            count2 = count2 - 1;
        }

        int count3 = 0;                       // PART A: Question 3
        while (count3 <= 18) {
            System.out.println(count3);
            count3 = count3 + 3;
        }

        int count4 = 10;

        while (count4 >= 0) {
            System.out.println(count4);       //PART B: Question 4
            count4 = count4 - 2;
        }


        for (int i = 1; i <= 5; i++) {               // PART B: Question 5
            for (int a = 1; a <= i; a++) {
                System.out.print("*");
            }
            System.out.println();
        }


        for (int i = 1; i <= 5; i++) {                  //PART B: Question 6
            for (int a = 1; a <= (6 - i); a++) {
                System.out.print("*");
            }
            System.out.println();
        }



        for (int i = 1; i <= 5; i++) {                //PART B:Question 7
            for (int a = 1; a <= 5; a++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

}

