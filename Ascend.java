// Generates three integer random numbers in a given range,
// and prints them in increasing order.
public class Ascend {
	public static void main(String[] args) {
        int lim = Integer.parseInt(args[0]);
        int num1 = (int) (Math.random() * lim);
        int num2 = (int) (Math.random() * lim);
        int num3 = (int) (Math.random() * lim);
        System.out.println(num1 + " " + num2 + " " + num3);
		int first = Math.min(Math.min(num1, num2), num3);
		int last = Math.max(Math.max(num1, num2), num3);
		int mid = num1 + num2 + num3 - first - last;
		System.out.println(first + " " + mid + " " + last);
	}
}
