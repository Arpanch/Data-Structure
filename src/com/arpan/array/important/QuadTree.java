package com.arpan.array.important;



public class QuadTree {
public static void main(String[] args) {
	System.out.println(new Solution().construct(new int[][]{{1,1,1,1,0,0,0,0},{1,1,1,1,0,0,0,0},{1,1,1,1,1,1,1,1},{1,1,1,1,1,1,1,1},{1,1,1,1,0,0,0,0},{1,1,1,1,0,0,0,0},{1,1,1,1,0,0,0,0},{1,1,1,1,0,0,0,0}}));
}
}


class Node {
 public boolean val;
 public boolean isLeaf;
 public Node topLeft;
 public Node topRight;
 public Node bottomLeft;
 public Node bottomRight;

 
 public Node() {
     this.val = false;
     this.isLeaf = false;
     this.topLeft = null;
     this.topRight = null;
     this.bottomLeft = null;
     this.bottomRight = null;
 }
 
 public Node(boolean val, boolean isLeaf) {
     this.val = val;
     this.isLeaf = isLeaf;
     this.topLeft = null;
     this.topRight = null;
     this.bottomLeft = null;
     this.bottomRight = null;
 }
 
 public Node(boolean val, boolean isLeaf, Node topLeft, Node topRight, Node bottomLeft, Node bottomRight) {
     this.val = val;
     this.isLeaf = isLeaf;
     this.topLeft = topLeft;
     this.topRight = topRight;
     this.bottomLeft = bottomLeft;
     this.bottomRight = bottomRight;
 }
};


class Solution {
 public Node construct(int[][] grid) {
   return   construct(grid,0,grid.length-1,0,grid.length-1);
 }
 
 public Node construct(int[][] grid,int rs,int re, int cs,int ce ){
     
     if(rs<=re && cs<=ce){
         Node node;
      if(isGridHavingSameValue(grid,rs,re,cs,ce)){
          boolean val=(grid[rs][cs]==0)?false:true;
             node=new Node(val,false);
             if(rs!=re && cs!=ce){
             node.topLeft=new Node(val,true);
             node.topRight=new Node(val,true);
             node.bottomLeft=new Node(val,true);
             node.bottomRight=new Node(val,true);
             }else{
                node.isLeaf=true; 
             }
         }else{
            int rowMid= rs+(re-rs)/2;
            int colMid=cs+(ce-cs)/2;
             node=new Node(true,false);
             node.topLeft=construct(grid,rs,rowMid,cs,colMid);
             node.topRight=construct(grid,rs,rowMid,colMid+1,ce);
             node.bottomLeft=construct(grid,rowMid+1,re,cs,colMid);
             node.bottomRight=construct(grid,rowMid+1,re,colMid+1,ce);
         }
         return node;
     }  
     return null;
 }
 
 boolean isGridHavingSameValue(int[][] grid,int rs,int re, int cs,int ce){
    int x=grid[rs][cs];
     for(int i=rs;i<=re;i++){
         for(int j=cs;j<=ce;j++){
             if(x!=grid[i][j]){
                 return false;
             }
         }
     }
     return true;
 }
 
}