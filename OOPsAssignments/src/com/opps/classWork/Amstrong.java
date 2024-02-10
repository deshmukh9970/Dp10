package com.opps.classWork;

public class Amstrong {
	int num;

	public Amstrong(int num) {
		this.num = num;
	}

	public boolean amstrongNumber() {
		int temp = num;
		int sum = 0;
		int ct = countDigit(num);
		System.out.println(num);
		System.out.println(num + "num");
		while (num != 0) {
			int rem = num % 10;
			sum = sum + power(rem, ct);
			num = num / 10;
		}
		System.out.println(sum);

		return (temp == sum);
	}

	public int countDigit(int num) {
		int count = 0;
		while (num != 0) {
			count++;
			num = num / 10;

		}
		return count;
	}

	public int power(int rem, int digitCount) {
		int result = 1;
		for (int i = 1; i <= digitCount; i++) {
			result = result * rem;

		}
//	       System.out.println(result+"result");
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Amstrong obj = new Amstrong(153);
		// int num=153;

		if (obj.amstrongNumber()) {
			System.out.println(obj.num + " This is amstrong Number");
		} else {
			System.out.println(obj.num + "This is not Amstrong number");
		}
		// System.out.println(obj.power(2, 3));

	}

}
