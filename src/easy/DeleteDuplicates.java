package easy;

public class DeleteDuplicates {
	
	 public ListNode deleteDuplicates(ListNode head) {
			ListNode sort = head;
			while(sort != null) {
	            if (sort.next != null){
	                if (sort.next.val == sort.val) {
					    sort.next = sort.next.next;
				    }else{
	                    sort = sort.next;
	                }
	            }else{
	                break;
	            }
			}
			return head;
		}
}
