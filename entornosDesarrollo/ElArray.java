
public class ElArray {
	public static void main(String[] args) {
		int[] numeros = new int[100];
		int var1 = 0;
		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = i + 1;
			var1 += numeros[i];
		}
		System.out.println(var1);

	}
}
