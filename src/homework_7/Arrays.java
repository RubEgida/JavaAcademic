package homework_7;


public class Arrays {
    /**
     * Print positive numbers in array.Task 1.
     * @param n array
     */
    public static void positiveNums(int[] n) {
        for (int i : n) {
            if (i > 0) {
                System.out.print(i + ", ");
            }
        }
    }

    /**
     * Array elements reversed printing.Task 2.
     * @param s array
     */
    public static void reverseArrayElements(short[] s) {
        for (int i = s.length - 1; i >= 0 ; i--) {
            System.out.print(s[i] + ", ");
        }
    }

    /**
     * Find and return largest element in array.Task 3.
     * @param l array
     * @return largest element in array
     */
    public static long largestElementInArray(long[] l) {
        long largest = 0;
        for (long num : l) {
            if (num > largest) {
                largest = num;
            }
        }
        return largest;
    }

    /**
     * Find and return smaller element in array.Task 4.
     * @param f array
     * @return smaller element
     */
    public static float smallerElementInArray(float[] f) {
        float smaller = 0;
        for (float i : f) {
            if (smaller == 0) {
                smaller = i;
            }
            if (i < smaller) {
                smaller = i;
            }
        }
        return smaller;
    }

    /**
     * Clone and print array m.Task 5.
     * @param n array
     */
    public static void arrayClone(int[] n) {
        int[] m = new int[n.length];
        for (int i = 0; i < n.length; i++) {
            m[i] = n[i];
            System.out.print(m[i] + ", ");
        }
    }

    /**
     * Third array elements give the sum of elements first and second.Task 6.
     * @param one first array
     * @param two second array
     */
    public static void twoArraysAdding(int[] one, int[] two) {
        int[] tree = new int[one.length];
        for (int i = 0, j = 0; i < one.length && j < two.length; i++, j++) {
            tree[i] = one[i] + two[j];
            System.out.print(tree[i] + ", ");
        }
    }

    /**
     * Calculate how many elements in array equal at number k.Task 7.
     * @param array array
     * @param k given number
     * @return count of element equals at k number
     */
    public static int givenNumInArray(int[] array, int k) {
        int count = 0;
        for (int num : array) {
            if (num == k) {
                count++;
            }
        }
        return count;
    }

    /**
     * Printing the not same 3 array elements.Task 8.
     * @param n array
     */
    public static void treeElementsArray(int[] n) {
        int[] sub;
        String intArray;
        for (int k : n) {
            for (int j = 0; j < n.length - 1; j++) {
                if (k != n[j] && k != n[j + 1]) {
                    sub = new int[]{k, n[j], n[j + 1]};
                    intArray = java.util.Arrays.toString(sub);
                    System.out.println(intArray);
                }
            }
        }
    }

    /**
     * Print array changed elements at largest to smaller.Task 9.
     * @param n array
     */
    public static void atLargestToSmaller(int[] n) {
        int num;
        boolean b = false;
        while (!b) {
            b = true;
            for (int i = 0; i < n.length - 1; i++) {
                if (n[i] < n[i + 1]) {
                    num = n[i];
                    n[i] = n[i + 1];
                    n[i + 1] = num;
                    b = false;
                }
            }
        }
        for (int m : n) {
            System.out.print(m + ", ");
        }
    }

    /**
     * Odd elements print the last.Task 10.
     * @param n array
     */
    public static void oddElements(int[] n) {
        int num;
        boolean b = true;
        while (b) {
            b = false;
            for (int i = 0; i < n.length - 1; i++) {
                if (n[i] % 2 != 0 && n[i + 1] % 2 == 0) {
                    num = n[i];
                    n[i] = n[i + 1];
                    n[i + 1] = num;
                    b = true;
                }
            }
        }
        for (int i : n) {
            System.out.print(i + ", ");
        }
    }

    /**
     * Print numbers without number zeros.Task 11.
     * @param n array
     */
    public static void arrayPrintWithoutZero(int[] n) {
        for (int i : n) {
            if (i != 0) {
                System.out.print(i + ", ");
            }
        }
    }

    /**
     * Find and print the largest increasing subsequence in array.Task 12.
     * @param n array
     */
    public static void longestIncreasingSubsequence(int[] n) {
        int count = 0;
        int subsequence = 0;
        int tmp = 0,  min = 0 , max = 0;
        for (int i = 0; i < n.length - 1; i++) {
            if (n[i] <= n[i + 1] & i != n.length - 2) {
                count++;
                if (count == 1) {
                    tmp = i;
                }
            } else {
                if (i == n.length - 2) {
                    count++;
                }
                if (subsequence <= count) {
                    subsequence = count;
                    min = tmp;
                    max = i;
                    if(i == n.length - 2) {
                        max = i + 1;
                    }
                }
                count = 0;
            }
        }
        for (int i = min; i <= max; i++) {
            System.out.print(n[i] + ", ");
        }
    }

    /**
     * Second version.Task 12.
     * @param arr array
     */
    public static void arrayOdd(int[] arr) {
        int[] expArr = new int[arr.length];
        int lastElem = arr.length - 1;
        int firstElem = 0;
        for (int j : arr) {
            if (j % 2 == 0) {
                expArr[firstElem] = j;
                firstElem++;
            } else {
                expArr[lastElem] = j;
                lastElem--;
            }
        }
        for(int i = 0; i < arr.length; i++) {
            System.out.print(expArr[i] + "  ");
        }
    }

    /**
     * Binary array change to decimal number.Task 13.
     * @param n array
     */
    public static void binaryArray(int[] n) {
        int sum = 0;
        for (int i : n) {
            if (i != 0 & i != 1) {
                System.out.println("Enter only 0 or 1 in array!!!");
                return;
            }
        }
        for (int i = 0; i < n.length; i++) {
            sum += n[i] * Math.pow(2, n.length - 1 - i);
        }
        System.out.print(sum);
    }

    /**
     * Print the matrix main diagonal higher elements.Task 14.
     * @param n matrix
     */
    public static void mainDiagonal(int[][] n) {
        System.out.println("Matrix display >>> ");
        for (int[] ints : n) {
            for (int anInt : ints) {
                if (n.length != ints.length) {
                    System.out.println("This matrix have not main diagonal!!!");
                    return;
                }
                System.out.print(anInt + " ");
            }
            System.out.println();
        }
        System.out.print("Diagonal higher elements is : ");
        for (int i = 0; i < n.length; i++) {
            for (int j = 0; j < n[i].length; j++) {
                if (n.length == n[i].length && j > i) {
                    System.out.print(n[i][j] + ", ");
                }
            }
        }
    }

    /**
     * Reversed matrix elements with main diagonal.Task 15.
     * @param n matrix
     */
    public static void mainDiagonalRevers(int[][] n) {
        int iElem;
        int jElem;
        System.out.println("Matrix display >>> ");
        for (int[] ints : n) {
            for (int anInt : ints) {
                if (n.length != ints.length) {
                    System.out.println("This matrix have not main diagonal!!!");
                    return;
                }
                System.out.print(anInt + " ");
            }
            System.out.println();
        }
        System.out.println("Main diagonal reversed elements matrix display >>> ");
        for (int i = 0; i < n.length; i++) {
            for (int j = 0; j < n[i].length; j++) {
                if (i != j) {
                    iElem = j;
                    jElem = i;
                    System.out.print(n[iElem][jElem] + " ");
                } else {
                    System.out.print(n[i][j] + " ");
                }
            }
            System.out.println();
        }
    }

    /**
     * Calculate line elements sum and return is true or false.Task 16.
     * @param n matrix
     * @return elements are even
     */
    public static String matrixLineElementsSumEven(int[][] n) {
        int sum = 0;
        for (int[] ints : n) {
            for (int anInt : ints) {
                sum += anInt;
            }
        }
        if (sum %2 == 0) {
            return "Yes";
        } else {
            return "No";
        }
    }
    /**
     * Working method.
     * @param args .
     */
    public static void main(String[] args) {
        System.out.print("In array positive numbers is : ");
        positiveNums(new int[]{3, 3, -9, 0, 4});

        System.out.print('\n' + "Array elements reversed is : ");
        reverseArrayElements(new short[] {1,2,3,4,5});

        System.out.print('\n' + "Largest element in array is : ");
        System.out.print(largestElementInArray(new long[]{2,43,7,8768,45}));

        System.out.print('\n' + "Smaller element in array is : ");
        System.out.print(smallerElementInArray(new float[]{2.3f,45.0f,34.555f}));

        System.out.print('\n' + "Array clone : ");
        arrayClone(new int[]{4, 5, 3, 56, 5});

        System.out.print('\n' + "Third array elements is : ");
        twoArraysAdding(new int[]{2,3,4,5,6}, new int[]{1,1,1,1,1});

        System.out.print('\n' + "We find k number in array " + givenNumInArray(new int[]{2,3,4,2,55,43,2}, 2) + " times");

        System.out.println("Array not same tree elements printing!");
        treeElementsArray(new int[]{2,34,3,2,45,67,4});

        System.out.print("Array elements at largest to smaller : ");
        atLargestToSmaller(new int[]{2, 3, 54, 45, 32, 7});

        System.out.print("Array odd elements go back in array : ");
        oddElements(new int[]{3,2,45,64,545,3342,4});
        arrayOdd(new int[]{3,2,45,64,545,3342,4});

        System.out.print("Array without zeros : ");
        arrayPrintWithoutZero(new int[]{2,12,34,56,64,0,45,0});

        System.out.print("Largest increasing subsequence is : ");
        longestIncreasingSubsequence(new int[]{80,2,43,32,32,43,45,45,0,1,0,2,3,4,56});

        System.out.print("Binary array changing at decimal number is : ");
        binaryArray(new int[]{1,1,0,0,1,1});

        mainDiagonal(new int[][]{{1,2,3},{4,5,6},{7,8,9}});

        mainDiagonalRevers(new int[][]{{1,2,3},{4,5,6},{7,8,9}});

        System.out.print("Matrix line elements sum is even? : ");
        System.out.print(matrixLineElementsSumEven(new int[][]{{1,2,3},{4,5,6},{7,8,9}}));
    }
}
