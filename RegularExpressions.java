package RegularExpressions;

public class RegularExpressions {

	public static void main(String[] args) {
		String integer = "0|((-|\\+)?[1-9][0-9]*)";
		
		System.out.println("0".matches(integer));
		System.out.println("-70571039".matches(integer));
		
		String variable = "(_|[a-zA-Z])(_?[a-zA-Z]?[0-9]?)*";
		System.out.println("x".matches(variable));
		System.out.println("x_123_CADMPAFOIDSJFASDKJFAPSDKFAPSDFKASDJCAMDENDJFADSLKFJASKDFUC___jasdkfJFUKKJK____".matches(variable));
	}

}
