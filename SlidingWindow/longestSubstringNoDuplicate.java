class Solution {
    public int lengthOfLongestSubstring(String s) {
        if (s.length() == 0) return 0;  //base cases to return for length < 2
        if (s.length() == 1) return 1;  //

        int left = 0;
        int right = 0;
        int maxLength = 0;
        boolean[] checkExist = new boolean[256];    // array to check for ASCII character's existence 

        while (right < s.length){   //until right exceeds last index position
            if ( checkExist[s.charAt(right)] ){ // if character is checked true(exist) in the array
                while (checkExsit[s.charAt(right)]){

                }
            } else{ // if character is unique
                checkExist[s.charAt(right)] = true;
            }
            right ++;
        }
    }
}