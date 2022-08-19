
	public static LinkedListNode<Integer> reverseLinkedListRec(LinkedListNode<Integer> head) {
		//Your code goes here
      //  return helper(head,head);
        if(head==null||head.next==null)
            return head;
        LinkedListNode<Integer> ans=reverseLinkedListRec(head.next);
        head.next.next=head;
        head.next=null;
        
        return ans;
	}
