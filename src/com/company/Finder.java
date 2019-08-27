package com.company;

public class Finder {

    public static void main(String[] args) {
        int array[] = [1, 5, -3, 2];
        findMax(array);
    }

    public static Integer findMax(int[] intArray) {
	    if (intArray != null && intArray.length > 0) {
	        int max = intArray[0];
	        for (int i = 0; i < intArray.length; i++) {
	            if (intArray[i] > max) {
	                max = intArray[i];
                }
            }
	        return max;
        } else {
	        return null;
        }

    }

    public static Integer findMin(int[] intArray) {
        if (intArray != null && intArray.length > 0) {
            int min = intArray[0];
            for (int i = 0; i < intArray.length; i++) {
                if (intArray[i] < min) {
                    min = intArray[i];
                }
            }
            return min;
        } else {
            return null;
        }

    }


}
