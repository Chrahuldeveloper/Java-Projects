import java.util.Arrays;

class NumberofTriangles {
    static int findNumberofTriangles(int arr[]) {

        Arrays.sort(arr);

        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                for (int k = 0; k < arr.length; k++) {
                    if (arr[i] + arr[j] > arr[k])
                        count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int arr[] = { 10, 21, 22, 100, 101, 200, 300 };
        int size = arr.length;
        System.out.println(findNumberofTriangles(arr));
    }
}