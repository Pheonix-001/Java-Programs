public class newPawan {

    public static void main(String[] args) {

        int arr[] = {-2, 1, -3, 4, -6, 8, 0};
        sortArr(arr);
    }

    static void sortArr(int[] arr) {
        int len = arr.length;
        int negValue = 0;
        for (int i = 0; i < len; i++) {

            if (arr[i] < 0) {
                negValue++;
            }
        }
        System.out.println(negValue);

        int[] arr2 = new int[len];
        int j = 0;
        for (int i = 0; i < arr.length; i++) {

            if (arr[i] < 0) {
                arr2[j] = arr[i];
                j++;
            } else {
                arr2[negValue] = arr[i];
                negValue++;
            }
        }

        printArr(arr2);
    }

    static void printArr(int[] arr) {
        for (int a: arr){
            System.out.println(a);
        }
    }

}
