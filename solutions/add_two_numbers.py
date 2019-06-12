# Accepted
# Runtime: 88ms, faster than 49.04% of python3 submissions
# Memory: 13.3MB, less than 33.14% of python3 submissions

class ListNode:
    def __init__(self, x):
        self.val = x
        self.next = None
        
def addTwoNumbers(l1, l2):
    soln = ListNode(0)
    curr = soln
    sum = 0
    while l1 or l2:
        sum //= 10
        if l1 and l2:
            sum += (l1.val + l2.val)
            l1 = l1.next
            l2 = l2.next
        elif l1:
            sum += l1.val
            l1 = l1.next
        elif l2:
            sum += l2.val
            l2 = l2.next
        curr.next = ListNode(sum % 10)
        curr = curr.next
    if sum // 10 == 1:
        curr.next = ListNode(1)
    return soln.next