import java.util.Scanner;

public class Mean_Mode {

   
    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);
        
        int n;
        int sum = 0;
        float average;
        
        System.out.println("Input data set: ");
        
        int set = sc.nextInt();
        int i,num=0;
        float test[] = new float[set];
        
        for(i=0;i<set;i++){
            System.out.print("Enter Number ["+i+"] =");
            test[i]=sc.nextFloat();
            
        }
            System.out.println("Mean is: " + getMean(test));
              
    }

    private static float getMean(float[] set1) {
    double sum = 0;
    
        for (int i = 0; i < set1.length; i++) {
            sum += set1[i];
        }

        return (float) (sum / set1.length);
    }
    public static int mode(int a[]) {
    int maxValue = 0, maxCount = 0;

    for (int i = 0; i < a.length; ++i) {
        int count = 0;
        for (int j = 0; j < a.length; ++j) {
            if (a[j] == a[i]) ++count;
        }
        if (count > maxCount) {
            maxCount = count;
            maxValue = a[i];
        }
    }

    return maxValue;
}

}
