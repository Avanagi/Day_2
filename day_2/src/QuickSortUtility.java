public class QuickSortUtility {

    /**
     * @param vector отвечает за массив, который отправляется на обработку
     * @param left с какого индекса сортировать
     * @param right по какой индекс сортировать
     */
    public static void quickSort( int[] vector, int left, int right ) {

        if (left >= right) {
            return;
        }
        int part = partition (vector, left, right);
        quickSort (vector, left, part - 1);
        quickSort (vector, part + 1, right);
    }

    public static int partition( int []vector, int left, int right ) {
        int counter = left;
        for (int i = left; i < right; i++) {
            if (vector[i] < vector[right]) {
                int temp = vector[counter];
                vector[counter] = vector[i];
                vector[i] = temp;
                counter++;
            }
        }
        int temp = vector[right];
        vector[right] = vector[counter];
        vector[counter] = temp;
        return counter;
    }

}
