public class FindCommonElementsBtwTwoelements {
    public static void main(String[] args) {
        int arr1[] = {1, 2, 3};
        int arr2[] = {2, 3, 4};

        String common = commonElements(arr1, arr2);
        System.out.println("Common elements: " + common);
    }

    public static String commonElements(int[] array1, int[] array2) {
        String result = ""; // Declare result outside the loop

        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array2.length; j++) {
                if (array1[i] == array2[j]) {
                    result += array1[i] + ", ";
                }
            }
        }

        return result;
    }
}
