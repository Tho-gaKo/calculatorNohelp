import com.sun.security.jgss.GSSUtil;

import java.lang.runtime.SwitchBootstraps;
import java.math.BigDecimal;
import java.math.MathContext;
import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Welche Operation möchtest Du verwenden?:  ");
        String input =sc.next();


        BigDecimal finNum;
        BigDecimal tempNum;
        BigDecimal tempNum2;
        int tempIntNum;

        switch (input) {
            case "^":
                System.out.print("Gib deine Basis an:   ");
                tempNum = sc.nextBigDecimal();
                System.out.print("Gib deinen Exponenten an:  ");
                tempIntNum = sc.nextInt();
                for(int i = tempIntNum - 1; i > 0; i--){
                tempNum = tempNum.multiply(BigDecimal.valueOf(tempIntNum));
                }
                finNum = tempNum;
                System.out.print("Ergebnis:  " + finNum);
                break;
            case "^2":
                System.out.print("Gib deine Zahl an: ");
                tempNum = sc.nextBigDecimal();
                finNum = tempNum.multiply(tempNum);
                System.out.print("Ergebnis:  " + finNum);
                break;
            case "+":
                System.out.print("Erste Zahl:  ");
                tempNum = sc.nextBigDecimal();
                System.out.print("Zweite Zahl:  ");
                tempNum2 = sc.nextBigDecimal();
                finNum = tempNum.add(tempNum2);
                System.out.print("Ergebnis:  " + finNum);
                break;
            case "-":
                System.out.print("Gib deine erste Zahl an: ");
                tempNum = sc.nextBigDecimal();
                System.out.println("Gib deine zweite Zahl an:  ");
                tempNum2 = sc.nextBigDecimal();
                finNum = tempNum.subtract(tempNum2);
                System.out.print("Ergebnis:  " + finNum);
                break;
            case "/":
                System.out.print("Gib deine erste Zahl an:  ");
                tempNum = sc.nextBigDecimal();
                System.out.print("Gib deine zweite Zahl an:  ");
                tempNum2 = sc.nextBigDecimal();
                finNum = tempNum.divide(tempNum2);
                System.out.print("Ergebnis:  " + finNum);
                break;
            case "*":
                System.out.print("Gib deine erste Zahkl an:  ");
                tempNum = sc.nextBigDecimal();
                System.out.print("Gib deine zweite Zahl an:  ");
                tempNum2 = sc.nextBigDecimal();
                finNum = tempNum.multiply(tempNum2);
                System.out.print("Ergebnis:  " + finNum);
                break;
            case "v":
                System.out.print("Gib eine Zahl an:  ");
                tempNum = sc.nextBigDecimal();
                System.out.print("Präzision: ");
                int precision = sc.nextInt();
                finNum = tempNum.sqrt(new MathContext(precision));
                System.out.print("Ergebnis:  " + finNum);
                break;
            case "!":
                System.out.print("Gib eine Zahl an: ");
                tempIntNum = sc.nextInt();
                //nummer bekommen (rizz == false);
                finNum = BigDecimal.valueOf(1);
                //finnum definieren (1)
                for (int i = tempIntNum; i > 0; i--){
                    finNum = finNum.multiply(BigDecimal.valueOf(i));
                }
                System.out.print(finNum);
                break;

        }

    }
}
