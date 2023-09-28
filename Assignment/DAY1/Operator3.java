package DAY1;

public class Operator3 {
	public static void main(String[] args) {
		int intVal = 100;
		byte byteVal = 	(byte)intVal;
		byte min = -128;
		byte max = 127;
		byte sum = (byte) (min + max);
		System.out.println("Sum = "+sum);
	}
}
