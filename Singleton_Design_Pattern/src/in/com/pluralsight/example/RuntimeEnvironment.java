package in.com.pluralsight.example;

public class RuntimeEnvironment {

	public static void main(String[] args) {
		Runtime runtime1 = Runtime.getRuntime();

		System.out.println(runtime1);

		Runtime runtime2 = Runtime.getRuntime();

		System.out.println(runtime2);

		if (runtime1 == runtime2) {
			System.out.println("both are same.");
		}

	}

}
