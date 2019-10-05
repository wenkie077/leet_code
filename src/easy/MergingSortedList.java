package easy;

public class MergingSortedList {

	ListNode finalNode;
	
	public MergingSortedList(ListNode l1, ListNode l2) {
		this.finalNode = mergeTwoLists(l1,l2);
	}
	
	public String toString() {
		ListNode node = this.finalNode;
		String output = "";
		while (node != null) {
			output += node.val;
			if (node.next != null) {
				output += "->";
			}
			node = node.next;
		}
		return output;
	}
	
	
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
	
	
	public static void main(String[] args) {
		ListNode test1 = new ListNode(1);
		test1.next = new ListNode(2);
		test1.next.next = new ListNode(4);
		ListNode test2 = new ListNode(1);
		test2.next = new ListNode(3);
		test2.next.next = new ListNode(4);
		MergingSortedList testCase = new MergingSortedList(test1, test2);
		System.out.println(testCase);
	}

}
