public class JavaArray {
    //get the max of the array;
    public static void main(String[] args) {
        int testArray[] = new int[]{1,2,34,56,676};
        System.out.println(getArray(testArray));
        for (int x = 0; x< testArray.length; x++){
            System.out.println(sortArray(testArray)[x]);
        }
        sortArray(testArray);
    }

    public static int getArray(int[] array){
        int x = array[0];
        for (int i= 0;i<array.length ; i++) {
            if (x < array[i]) {
                x = array[i];
            }
        }
        return x;
    };

    public static int[] sortArray(int[] array){
//        int z = 0;
        // sort the array ;
        for (int x = 0; x<array.length; x++) {
            for (int y = 0; y < array.length; y++) {
                if(x < y){
                    if (array[x] > array[y]) {
                        int z = array[x];
                        array[x] = array[y];
                        array[y] = z;
                    }
                }

            }
        }
        return array;
    };
}
