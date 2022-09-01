package geico.bdd.unit.test;

public class UnitTests {

	public static void main(String[] args) {
		String g = "Let[’]s get started.";
		System.out.println(g.replaceAll("[^a-z A-Z]", ""));
		String numbersMix = "[Somethin123g!](){}";
		System.out.println(numbersMix.replaceAll("[a-zA-Z]",""));
		System.out.println(numbersMix.replaceAll("[^0-9]",""));
		System.out.println(numbersMix.replaceAll("[^\\[{()}\\]]",""));
		//[{()}] [{(){}[]}] {} - valid
		//}()[] [)] - invalid
	}
}
