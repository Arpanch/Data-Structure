package com.arpan.array.important;

public class PredictWinner {
public static void main(String[] args) {
	System.out.println(PredictTheWinner(new int[] {1,5,2}));
	List<>
}



    public static boolean PredictTheWinner(int[] nums) {
       return  predictTheWinner(nums,0,nums.length-1,0,0);
    }
    
    public static boolean predictTheWinner(int[] nums,int i,int j,int s1,int s2){
;        if(i>j){
            return s1>=s2;
        }
        
        boolean a,b,c,d;
        a=b=c=d=false;
        
        
        if(i+1<j){
        a=predictTheWinner(nums,i+2,j,s1+nums[i],s2+nums[i+1]);
        }
        
        b=predictTheWinner(nums,i+1,j-1,s1+nums[i],s2+nums[j]);
        
        if(i<j-1){
        c=predictTheWinner(nums,i,j-2,s1+nums[j],s2+nums[j-1]);
        }
        
        d=predictTheWinner(nums,i+1,j-1,s1+nums[j],s2+nums[i]);
        
        return a || b || c || d;
    }
    
   
    }
