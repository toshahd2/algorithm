import java.util.Arrays;

public class lesson2_hw {
    public static void main(String[] args) {
        int[] array = new int[] {1, 3, 1, 5, 7, 7, 3, 2, 5, 7};
        System.out.println("Исходный список:" + Arrays.toString(array));
        sort(array);
        System.out.println("Отстортированный список:" + Arrays.toString(array));
    }
    public static void sort(int[] array){
        final int max = 11;
        int[] count = new int[max];
        for (int i = 0; i < array.length; i++){
            count[array[i]]++;
        }

        int index = 0;
        for (int i = 0; i < count.length; i++){
            for (int j = 0; j < count[i]; j++){
                array[index] = i;
                index++;
            }
        }

    }
}
