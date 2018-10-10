public class Review5{


    // 4. Array recursion
    public int sumOfArray(int[] a, int n) {
        if (n == 0)
            return a[n];
        else
            return a[n] + sumOfArray(a, n-1);
    }

    // 3. Output Recurion
    public int fact(int n){
        int result;

        if(n==1){
           return 1;
        }

        result = fact(n-1) * n;
        return result;
    }

    // 2. Numeric Recursion
    public int sumUp(int n){

        if (n==1){
            return 1;
        }else{
            return sumUp(n-1)+n;
        }
    }


}