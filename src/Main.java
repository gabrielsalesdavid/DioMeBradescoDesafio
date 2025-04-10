import domain.ParametrosInvalidosException;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        int number01, number02;

        try {
            number01 = scn.nextInt();
            number02 = scn.nextInt();

            count(number01, number02);
        } catch (ParametrosInvalidosException e) {

            System.out.println("Error: " + e.getMessage());
        }
    }

    public static void count(int num01, int num02) throws ParametrosInvalidosException {

        int sum, count01;
        count01 = 0;
        if(num01 > num02) {

            throw new ParametrosInvalidosException();
        }

        sum = num01 - num02;
        if(sum <= 0) {

            sum = num02 - num01;
            for (int i = 0; i < sum; i++) {

                System.out.println(count01 += 1);
            }
        }
    }
}