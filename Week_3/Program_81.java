package Week_3;

public class Program_81 {


    public static void countFreq(int arr[], int n) {


        boolean visited[] = new boolean[n];

        for (int i = 0; i < n; i++) {

            if (visited[i] == true)
                continue;

            int count = 1;
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    visited[j] = true;
                    count++;
                }
            }
            System.out.println(arr[i] + " \t" + count);
        }
    }

    public static void main(String[] args) {

        int[] arr = {10, 5, 10, 15, 10, 5, 15, 20};
        int n = arr.length;
        countFreq(arr, n);
    }
}

