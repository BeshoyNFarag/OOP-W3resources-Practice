


public class SelectionSort implements Sortable{

    @Override
    public void sort(int [] arr){
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            int minIdx = i;

            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIdx]) {
                    minIdx = j;
                }
            }

            // Swap only if needed
            if (minIdx != i) {
                int temp = arr[i];
                arr[i] = arr[minIdx];
                arr[minIdx] = temp;
            }
        }


        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
