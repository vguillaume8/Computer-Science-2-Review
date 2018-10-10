public class Review2{

    // 1. declare variable for array
    int[] array = new int[]{1,2,3,4};


    // 3. input arrays
    public void inputArray(){

        Scanner input = new Scanner(System.in);

        //allow user  input;
        System.out.println("How many numbers do you want to enter?");
        int num = input.nextInt();

        int array[] = new int[num];

        System.out.println("Enter the " + num + " numbers now.");

        for (int i = 0 ; i < array.length; i++ ) {
           array[i] = input.nextInt();
        }

        //you notice that now the elements have been stored in the array .. array[]

        System.out.println("These are the numbers you have entered.");
        printArray(array);


    }

    // 10. Reverse Array
    public static void reverseArray(String[] array){

        int middle = array.length / 2;

        String temp;
        int j = array.length -1;

        for (int i = 0 ; i < middle; i++) {
            temp = array[i];
            array[i] = array[j];
            array[j] = temp;
            j--;
        }

        System.out.println(Arrays.toString(array));
    }   
}