package com.arpan.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SumArray {
	 public static List<List<Integer>> combinationSum(int[] candidates, int target) {
	        
	        List<List<Integer>> comSum=new ArrayList<>();
	        Arrays.sort(candidates);
	        combinationSum(candidates,target,new ArrayList<>(),comSum,0);
	        return comSum;
	    }
	    
	 static void combinationSum(int[] candidates, int target,List<Integer> sums,List<List<Integer>> allCom,int index){
	     
	        if(target<0){
	            return;
	        }
	        if(target==0){
	            allCom.add(sums);
	            return ;
	        }
	        
	        for(int i=index;i<candidates.length;i++){
	            sums.add(candidates[i]);
	            combinationSum(candidates,target-candidates[i],sums,allCom,index);
	            sums.remove(sums.size()-1);
	        }
	    }
	    public static void main(String[] args) {
	    	int[] a= {2,3,6,7};
	    	int target=7;
	    	List<List<Integer>> all=combinationSum(a,target);
	    	System.out.println(all);
		}
	    
}
