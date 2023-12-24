//{ Driver Code Starts
/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;

class Driverclass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            int k = sc.nextInt();

            System.out.println(new Solution().countOccurence(arr, n, k));
        }
    }
}

// } Driver Code Ends


class Solution 
{
    //Function to find all elements in array that appear more than n/k times.
    public int countOccurence(int[] arr, int n, int k) 
    {
        // your code here,return the answer
        
        HashMap<Integer, Integer> map = new HashMap<>();
        
        int count = n/k;
        
        //  return Arrays.stream(arr)
        //         .boxed()
        //         .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
        //         .stream().filter(value -> value > count)
        //         .count();

        // Count the number of occurrences greater than count
        
        for(int i=0;i<n;i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i],map.get(arr[i])+1);
            }
            
            else{
                map.put(arr[i],1);
            }
        }
        
        int answer=0;
        for (Integer value : map.values()) {
            if(value>count)
                answer++;
            //System.out.println("Value: " + value);
        }
        return answer;
        
        //return (int)map.entrySet().stream()
        //        .filter(entry -> entry.getValue() > count)
        //        .count();
        
    }
}

