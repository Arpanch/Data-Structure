package com.arpan.array;

public class ListNode {
	int val;
	ListNode next;

	ListNode() {
	}

	ListNode(int val) {
		this.val = val;
	}

	ListNode(int val, ListNode next) {
		this.val = val;
		this.next = next;
	}
	
	public static void main(String[] args) {
		ListNode list1=new ListNode(1,new ListNode(4,new ListNode(5)));
		ListNode list2=new ListNode(1,new ListNode(3,new ListNode(4)));
		ListNode list3=new ListNode(2,new ListNode(6,new ListNode(10)));
		ListNode[] lists = {list1,list2,list3};
		ListNode listNode=Solution.mergeKLists(lists);
		while(listNode!=null) {
			System.out.print(listNode.val+"-->");
			listNode=listNode.next;
		}
		
	}
}

class Solution {
    public static ListNode mergeKLists(ListNode[] lists) {
    	if(lists.length==0) {
    		return null;
    	}
    	
    	ListNode listNode=lists[0];
    	if(lists.length==1) {
    		return listNode;
    	}
    	for(int i=1;i<lists.length;i++) {
    		listNode=merge(listNode,lists[i]);
    	}
    	
        return listNode;
    }

	private static ListNode merge(ListNode listNode, ListNode listNode2) {
		
		ListNode start=null;
		ListNode current1=listNode;
		ListNode prev1=null;
		ListNode current2=listNode2;
		
		while(current1!=null && current2!=null) {
			if(current1.val>=current2.val) {//1,5,6   2
				ListNode temp = current2.next;
				current2.next=current1;
				if(prev1==null) {
					start=current2;
				}
				if(prev1!=null) {
					prev1.next=current2;
				}
				current1=current2;
				current2=temp;
				
			}else if(current1.val<current2.val) {
				if(prev1==null) {
					start=current1;
				}
				prev1=current1;
				current1=current1.next;
			}
		}
		if(current2!=null) {
			prev1.next=current2;
		}
		return start;
	}
}
