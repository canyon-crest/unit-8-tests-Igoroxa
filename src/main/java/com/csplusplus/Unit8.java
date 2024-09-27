package com.csplusplus;

public class Unit8 {

    // 1. Method to calculate the sum of all elements in a 2D array
    // Instructions: Traverse the 2D array and calculate the sum of all elements.
    public static int sumOfElements(int[][] array) {
    	int sum = 0;
    	for (int[] row: array) {
    		for(int value: row) {
    			sum += value;
    		}
    	}
        // TODO: Implement this method
        return sum;  // Placeholder return value
    }

    // 2. Method to count how many times a specific number appears in a 2D array
    // Instructions: Traverse the 2D array and count the number of times a specified value appears.
    public static int countOccurrences(int[][] array, int value) {
    	int count = 0;
    	for (int[] row: array) {
    		for(int value2: row) {
    			if (value2 == value) {
    				count++;
    			}
    		}
    	}
        // TODO: Implement this method
        return count;  // Placeholder return value
    }

    // 3. Method to find the maximum element in a 2D array
    // Instructions: Traverse the 2D array and find the maximum element.
    public static int findMax(int[][] array) {
    	int max = -10000;
    	for (int[] row: array) {
    		for(int value2: row) {
    			if (value2 > max) {
    				max = value2;
    			}
    		}
    	}
        // TODO: Implement this method
        return max;  // Placeholder return value
    }

    // 4. Method to reverse the rows of the 2D array
    // Instructions: Reverse the rows of the 2D array (e.g., the first row becomes the last, etc.).
    public static void reverseRows(int[][] array) {
    	
    	int start = 0;
    	for (int i = array.length-1; i >= array.length/2; i--) {
    		int[] temp = array[start];
    		array[start] = array[i];
    		array[i] = temp;
    		start++;
    	}
        // TODO: Implement this method
    }

    // 5. Method to transpose a 2D array (swap rows and columns)
    // Instructions: Create and return a new 2D array that is the transpose of the input array.
    public static int[][] transpose(int[][] array) {
    	int[][] transposed = new int[array[0].length][array.length];
    	for (int i = 0; i < transposed.length; i++) {
    		for (int j = 0; j < transposed[0].length; j++) {
    			transposed[i][j] = array[j][i];
    		}
    	}
        // TODO: Implement this method
        return transposed;  // Placeholder return value
    }

    // 6. Method to fill a 2D array with random integers
    // Instructions: Create a 2D array of size numRows x numCols and fill it with random integers between min and max.
    public static int[][] fillWithRandom(int min, int max, int numRows, int numCols) {
    	int[][] random = new int[numRows][numCols];
    	for(int i = 0; i < numRows; i++) {
    		for (int j = 0; j < numCols; j++) {
    			random[i][j] = (int) (Math.random() * max + min);
    		}
    	}
        // TODO: Implement this method
        return random;  // Placeholder return value
    }
}