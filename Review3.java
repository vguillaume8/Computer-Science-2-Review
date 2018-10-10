public class Review3{


    // Selection Sort
    public static String SelectionSort(int[] data) {
        
        int n = data.length;
        for (int i = 0; i < n-1; i++) {
            //Selection
            int min = i;
            for (int j = i + 1; j < n; j++) {
                
                if (data[j] < data[min]) {
                    min = j;
                }
            }
            int temp = data[min];
            data[min] = data[i];
            data[i] = temp;
        }
            return Arrays.toString(data);
            
    }


    // Insertion Sort
     public static String InsertionSort(int[] data) {
        
        for(int i = 0; i < data.length; i++) {
            int entry = data[i];
            int j = i -1;
            while(j > -1 && data[j] > entry) {
                
                data[j+1] = data[j];
                j = j-1;
            }
            data[j+1] = entry;
             
        }
            
            return Arrays.toString(data);
    }

    // Bubble Sort
    public void bubbleSort(int arr[]) 
    { 
        int n = arr.length; 
        for (int i = 0; i < n-1; i++) 
            for (int j = 0; j < n-i-1; j++) 
                if (arr[j] > arr[j+1]) 
                { 
                    // swap temp and arr[i] 
                    int temp = arr[j]; 
                    arr[j] = arr[j+1]; 
                    arr[j+1] = temp; 
                } 
    } 
}