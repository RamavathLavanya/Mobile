package SlidingWindow;

import java.util.HashMap;

public class MaximumSubArraySumOfK {
	
	 public static void main(String[] args) {
		 
	        int[] arr = {2, 5, 1, 8, 2, 9, 1};
		// int arr[] = { 1, 4, 2, 10, 2, 3, 1, 0, 20 };
	        
	        int ans = maxSubarraySumOfSizeK(arr, 3);
	        System.out.println("Max subarray sum of size 3 is : " + ans);
	        
	        String str = "forxxorfghjkaofr";
	        String pattern = "for";
	        System.out.println("Count Anagrams : " + countAnagrams(str, pattern));
	    }
	    
	    public static int maxSubarraySumOfSizeK(int[] arr, int k){
	        int i = 0, j = 0;
	        int sum = 0;
	        int maxSum = 0;
	        while(j < arr.length){
	            sum += arr[j];
	            
	            // window is less than k 
	            if(j - i+1 < k){
	                j++;
	            }
	            
	            // window is equal to k
	            else {
	                maxSum = Math.max(maxSum, sum);
	                sum -= arr[i];
	                i++;
	                j++;
	            }
	        }
	        
	        return maxSum;
	    }
	    
	    public static int countAnagrams(String str, String ptrn){
	        // create Hashmap for pattern
	        HashMap<Character, Integer> map = new HashMap<>();
	        for(int i = 0; i < ptrn.length(); i++){
	            if(map.containsKey(ptrn.charAt(i))){
	                map.put(ptrn.charAt(i), map.get(ptrn.charAt(i)) + 1);
	            }
	            else{
	                map.put(ptrn.charAt(i), 1);
	            }
	        }
	        
	        int i = 0, j = 0;
	        HashMap<Character, Integer> helperMap = new HashMap<>();
	        int count = 0;
	        
	        while(j < str.length()){
	            
	            if(helperMap.containsKey(str.charAt(j))){
	                helperMap.put(str.charAt(j), helperMap.get(str.charAt(j)) + 1);
	            }
	            else{
	                helperMap.put(str.charAt(j), 1);
	            }
	            
	            if(j - i + 1 < ptrn.length()){
	                j++;
	            }
	            else if(j - i + 1 == ptrn.length()){
	                if(map.equals(helperMap)){
	                    count++;
	                }
	                
	                // remove calculation for i
	                int freq = helperMap.get(str.charAt(i));
	                freq--;
	                if(freq == 0){
	                    helperMap.remove(str.charAt(i));
	                }
	                else{
	                    helperMap.put(str.charAt(i), freq);
	                }
	                
	                // increment i
	                i++;
	                
	                // increment j
	                j++;
	            }
	        }
	        
	        return count;
	    }
	    
	}


	// string: forxxorfghjkaofr
	// pattern : for

	// anagram: for,fro,ofr,orf,rof,rfo ->
	// length of string, characters ka count

	// freqMap -> f-1, o-1, r-1
	
















	











