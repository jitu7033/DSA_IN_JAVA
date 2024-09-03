import java.util.ArrayList;
import java.util.Collections;

public class bucketSort{

    static void bucketShort(float arr[]){
        int n = arr.length;
        ArrayList<Float>[] bucket = new ArrayList[n];
        //create empty bucket;
        for(int i=0; i<n; i++){
            bucket[i] = new ArrayList<Float>();
        }
        // add element into our bucket;

        for(int i=0; i<n; i++){
            int bucketIndex = (int) arr[i] * n;
            bucket[bucketIndex].add(arr[i]);

        }

        // sort each bucket individually

        for(int i=0; i<bucket.length; i++){
            Collections.sort(bucket[i]);
        }

        //  merge all bucket to get final;
        int  index = 0;
        for(int i=0; i<bucket.length; i++){
            ArrayList<Float>currentBucket = bucket[i];
            for(int j=0; j<currentBucket.size(); j++){
                arr[index++] = currentBucket.get(j);
            }
        }
    }

    public static void main(String[] args) {
        float arr[] = {1.2f,3.4f,4.5f,2.3f};
        bucketShort(arr);
         for(int  i=0; i<arr.length; i++){
             System.out.println(arr[i]+" ");

        }

    }
}