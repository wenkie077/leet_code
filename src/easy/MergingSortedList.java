package easy;

public class MergingSortedList {
	
	public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
		int smallerVal;
		if (l1 == null) {return l2;}
		if (l2 == null) {return l1;}
		if (l1.val <= l2.val) {
			smallerVal = l1.val;
			l1 = l1.next;
		}else {
			smallerVal = l2.val;
			l2 = l2.next;
		}
        ListNode l3 = new ListNode(smallerVal);
        ListNode position = l3;
        while(l1 != null || l2 != null) {
        	if (l1 == null) {
        		smallerVal = l2.val;
    			l2 = l2.next;
        	}else if(l2 == null) {
        		smallerVal = l1.val;
    			l1 = l1.next;
        	}else {
        		if (l1.val <= l2.val) {
        			smallerVal = l1.val;
        			l1 = l1.next;
        		}else {
        			smallerVal = l2.val;
        			l2 = l2.next;
        		}
        	}
        	position.next = new ListNode(smallerVal);
        	position = position.next;
        }
		return l3;
    }
	
}
