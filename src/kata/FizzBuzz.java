public class FizzBuzz {

	public static String fizzbuzz(int number) {
    	String text;
    	
    	if (number % 3 == 0 && number % 5 == 0) {
    		text = "FizzBuzz";
    	} else if (number % 3 == 0) {
    		text = "Fizz";
    	} else if (number % 5 == 0) {
    		text = "Buzz";
    	} else {
//    		text = Integer.toString(number);
    		text = String.valueOf(number);
    	}
    	
    	return text;
		
	}
}
