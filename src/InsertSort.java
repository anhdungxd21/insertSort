public class InsertSort {
    static double[] list = {1, 9, 4.5, 6.6, 5.7, -4.5};

    public static void main(String[] args) {
        for(double d: list){
            System.out.printf("%-10.1f", d);
        }
        insertSort(list);
        System.out.println();
        for(double d: list){
            System.out.printf("%-10.1f", d);
        }
    }
    public static void insertSort(double[] list) {
        for (int i = 1; i < list.length; i++) {
            double temp = list[i];
            int j;
            for (j = i -1; j>=0 &&  temp < list[j]; j--) {
                list[j+1] = list[j];
            }
            list[j+1] = temp;
        }
    }
}
