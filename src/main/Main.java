package main;

import java.util.Arrays;

class main {
    public  int countLeastBoat(Integer []nums,int maxLoad){
        Arrays.sort(nums);
        int count = 0;
        int i = 0;
        int j = nums.length-1;;
        while(i<j) {
            if(nums[i]+nums[j] <= maxLoad) {
                i++;
                j--;
            } else {
                j--;
            }
            count++;
        }
        return count + (j==i?1:0);
    }

}