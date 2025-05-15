/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode() : val(0), next(nullptr) {}
 *     ListNode(int x) : val(x), next(nullptr) {}
 *     ListNode(int x, ListNode *next) : val(x), next(next) {}
 * };
 */
class Solution {
public:
    ListNode* deleteDuplicates(ListNode* head) {
        if(head == NULL || head -> next == NULL) {
            return head;
        }
        ListNode* p = head;
        ListNode* temp = head->next;
        while(temp != NULL) {
            if(p-> val == temp -> val) {
                temp = temp -> next;
            }
            else {
                p->next = temp;
                p = temp;
                temp = temp->next;
            }
        }
        p->next = temp;
        p = temp;
        return head;
    }
};