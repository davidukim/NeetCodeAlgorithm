class Solution {
    public int lengthOfLongestSubstring(String s) {
        if (s.length() == 0) return 0;  //base cases to return for length < 2
        if (s.length() == 1) return 1;  //

        int left = 0;
        int right = 0;
        int maxLength = 0;
        boolean[] checkExist = new boolean[256];    // array to check for ASCII character's existence 
        
        System.out.println(s);
        while (right < s.length()){   //until right exceeds last index position
            System.out.println("Beginning outer loop..");
            if ( checkExist[s.charAt(right)] ){ // if char exists in the array
                System.out.println(s.charAt(right) + "exists in the array");
                while (checkExist[s.charAt(right)]){ // while char exists
                    System.out.println("Setting " + s.charAt(left) + " to false");
                    checkExist[s.charAt(left)] = false;
                    left ++;                         // move left to + 1
                    
                }
            } else{ // if character doesn't exist in the array
                System.out.println(s.charAt(right) + " doesn't exist in the array");
                System.out.println("Setting " + s.charAt(right) + " to true");
                checkExist[s.charAt(right)] = true;
            }
            maxLength = Math.max(maxLength, right-left+1);
            checkExist[s.charAt(right)] = true;
            right ++;
        }
        return maxLength;
    }
}
