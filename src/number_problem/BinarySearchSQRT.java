package number_problem;

public class BinarySearchSQRT {
    public static void main(String[] args) {
        int n=40;
        int p=3;
        System.out.printf("%.3f",sqrt(n,p));
    }
    public static double sqrt(int n,int p){
        double root = 0.0;
        int start=0;
        int end=n;
        while(start<=end){
            int mid = start + (end - start)/2;
            if(mid*mid == n){
                return mid;
            }else if(mid*mid >n){
                end = mid - 1;
            }else{
                start = mid + 1;
            }
        }
        System.out.println(end);
        root = end;
        double  incr=0.1;
        for(int i=1;i<=p;i++){
            while(root*root<=n){
                root += incr;
            }
            incr = incr/10;
        }
        return root;
    }
}
