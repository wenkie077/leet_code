package easy;

import java.util.ArrayList;

public class IntersectionLinkedLists {
	public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode currentA = headA;
        ArrayList<ListNode> visitedA = new ArrayList<ListNode>();
        while(currentA != null){
            visitedA.add(currentA);
            currentA = currentA.next;
        }
        ListNode currentB = headB;
        while(currentB != null){
            if(visitedA.contains(currentB)){
                return currentB;
            }
            currentB = currentB.next;
        }
        return null;
    }
}
