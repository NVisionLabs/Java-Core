public class Loader {
    public static void main(String[] args) {
        int[] exampleArray = {3, 9, 11, 15};
        swap(exampleArray, 2,3);

        for (int value : exampleArray) {
            System.out.println(value);
        }
    }

    public static void swap(int[] array, int index1, int index2) {
        boolean checkZeroIndex = index1 >= 0 && index2 >= 0;
        boolean checkLastIndex = index1 < array.length && index2 < array.length;

        if (checkZeroIndex && checkLastIndex) {
            int temp = array[index1];
            array[index1] = array[index2];
            array[index2] = temp;
        } else  {
            System.out.println("Bad index!");
        }
                
    }


    }


