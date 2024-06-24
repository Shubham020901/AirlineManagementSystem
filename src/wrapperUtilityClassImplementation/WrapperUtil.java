package wrapperUtilityClassImplementation;

public class WrapperUtil {
	
	public static int findMax(Integer[] numbers) {
		int max = numbers[0];
		for(int i=1 ;i<numbers.length; i++) {
			if(numbers[i] > max) {
				max =numbers[i];
			}
		}
		return max;
	}
	
	public static double calculateAverage(Double[] numbers) {
		double sum = 0;
        for (double number : numbers) {
            sum = sum + number;
        }
        return sum/numbers.length;
    }

	 public static Boolean[] convertToBooleanArray(String binaryString) {
	        Boolean[] booleanArray = new Boolean[binaryString.length()];
	        for (int i = 0; i < binaryString.length(); i++) {
	            booleanArray[i] = binaryString.charAt(i) == '1';
	        }
	        return booleanArray;
	    }

	    public static String convertToBinaryString(Boolean[] booleanArray) {
	        String binaryString = "";
	        for (Boolean bool : booleanArray) {
	            binaryString += bool ? "1" : "0";
	        }
	        return binaryString;
	    }
}
