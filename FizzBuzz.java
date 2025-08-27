public class FizzBuzz {
	public static void main(String[] args) {
		for (int i = 1; i <= 100; i++) {
			String result = (i % 3 == 0 ? "Fizz" : "") + (i % 5 == 0 ? "Buzz" : "");
			System.out.println(result.isEmpty() ? i : result);
		}
	}
}