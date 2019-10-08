package easy;

import java.util.ArrayList;

public class LinkedListCycle {
	public boolean hasCycle(ListNode head) {
        if (head == null) {return false;}
        ListNode current = head;
        ArrayList<ListNode> visited = new ArrayList<ListNode>();
        while(current != null){
            if (visited.contains(current)){
                return true;
            }else{
                visited.add(current);
            }
            current = current.next;
        }
        return false;
    }
}
