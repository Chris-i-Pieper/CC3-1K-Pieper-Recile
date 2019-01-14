 package act1;
import java.util.Scanner;

public class Act1 {

   
    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);
        
        int n;
        int sum = 0;
        float average;
        
        
        System.out.println("Enter the size of data set: ");
        
        int set = sc.nextInt();
        int i,num=0;
        float test[] = new float[set];
        
        for(i=0;i<set;i++){
            System.out.print("Enter Number "+i+":");
            test[i]=sc.nextFloat();
            
        }
            System.out.println("Mean is: " + getMean(test));
            System.out.println("Mode is: "+ mode(test));
        

    }

    private static float getMean(float[] set1) {
    double sum = 0;
    
        for (int i = 0; i < set1.length; i++) {
            sum += set1[i];
        }

        return (float) (sum / set1.length);
    }
    public static float mode(float set2[]) {

    float maxValue = 0, maxCount = 0;

    for (int i = 0; i < set2.length; ++i) {
        int count = 0;
        for (int j = 0; j < set2.length; ++j) {
            if (set2[j] == set2[i]) ++count;
        }
        if (count > maxCount) {
            maxCount = count;
            maxValue = set2[i];
        }
    }

    return maxValue;
}

}
