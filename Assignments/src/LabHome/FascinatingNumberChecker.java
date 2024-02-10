package LabHome;

public class FascinatingNumberChecker {
	
	public static boolean checkFascinating(int num) {
	        int r1 = num * 2;
	        int r2 = num * 3;
	        String n1 = num + ""+ r1 + r2;
	        System.out.println(n1+" number string");
	        int n = Integer.parseInt(n1);

	        for (int i = 1; i <= 9; i++) {
	            int count = countFrequency(n, i);
	            if (count != 1) {
	                return false;
	            }
	        }
	        return true;
	    }

	  public static int countFrequency(int num, int i) {
	        int count = 0;

	        while (num != 0) {
	            int rem = num % 10;
	            if (rem == i) {
	                count++;
	            }
	            num = num / 10;
	        }

	        return count;
	    }

	   public static int countDigits(int num) {
	        int count = 0;

	        while (num != 0) {
	            num = num / 10;
	            count++;
	        }

	        return count;
	    }

	

	public static void main(String[] args) {
        int num = 327;
        int digits = countDigits(num);

        if (digits >= 3) {
            if (checkFascinating(num)) {
                System.out.println("Number Is Fascinating Number");
            } else {
                System.out.println("Number is Not Fascinating Number");
            }
        } else {
            System.out.println("Number is Not Grater then or equal 3");
        }
    }

   
}
