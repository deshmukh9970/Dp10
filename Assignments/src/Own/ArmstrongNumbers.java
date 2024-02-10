package Own;

public class ArmstrongNumbers {

   public static boolean armstrong(int num) {
        int originalNum = num;
        int sum = 0;
        int digitCount = countDigits(num);

        while (num > 0) {
            int digit = num % 10;
            sum =sum+ power(digit, digitCount);
            num =num/ 10;
        }

        return (originalNum == sum);
    }

    
   public static int power(int digit, int digitCount) {
        int result = 1;
        for (int i = 0; i < digitCount; i++) {
            result =result*digit;
        }
        return result;
    }

   public static int countDigits(int num) {
        int count = 0;
        while (num > 0) {
            count++;
            num = num/10;
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println("Armstrong numbers from 1 to 5000:");

        for (int i = 1; i <= 5000; i++) {
            if (armstrong(i)) {
                System.out.println(i);
            }
        }
    }
}
