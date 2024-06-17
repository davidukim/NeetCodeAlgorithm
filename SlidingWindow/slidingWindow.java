package SlidingWindow;
class Solution {
    public int maxProfit(int[] prices) {
        int left, right, max;
        left = 0;
        right = 1;
        max = 0;

        while (right < prices.length){  //while right index hasn't reached end of array
            if (prices[left] < prices[right]){  // profit generated
                if (max < (prices[right] - prices[left])){  //and profit > max
                    max = (prices[right] - prices[left]);   //max = profit
                }
            } else {
                left = right;
            }
            right ++;
        }
        return max;
    }
}