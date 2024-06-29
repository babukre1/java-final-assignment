public class FindDuplicateElementAndDelete {
    public static void main(String[] args) {
        int arr[] = {1, 1, 2, 4, 5, 4, 6, 7, 8, 9, 1, 3};
        int[] newArray = removeDuplicatedArray(arr);
        for (int num : newArray) {
            System.out.print(num + " ");
        }

    }

    public static int[] removeDuplicatedArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            boolean isDuplicate = false;
            int count = 0;
            for (int j = 0; j < array.length; j++) {
                if (array[i] == array[j]) {
                    count++;
                }
                if (count > 1) {
                    isDuplicate = true;
                    array = remove(array, array[i]);
                }
            }
        }
        return array;

    }

    public static int[] remove(int[] symbols, int c) {
        for (int i = 0; i < symbols.length; i++) {
            if (symbols[i] == c) {
                int[] copy = new int[symbols.length - 1];
                System.arraycopy(symbols, 0, copy, 0, i);
                System.arraycopy(symbols, i + 1, copy, i, symbols.length - i - 1);
                return copy;
            }
        }
        return symbols;
    }
}
