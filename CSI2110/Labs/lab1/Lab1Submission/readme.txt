Zuhair Zubair - 300378419
Abdul Based Abdul Rahim - 300379200

DNode:
The initial java file Node was modified by us to make a Node class that supports a doubly linked list instead of a singly linked list. To do this, we just added an instance variable "previous" and made that represent the node right before the current one. After that, we just added getters and setters for previous.

DLinkList:
The original LinkList file was made to be a doubly linked list and renamed to DLinkList. The class used DNodes that linked multiple Nodes together that pointed at both the node before and after it. We had two instance variables head and tail that functioned as dummy nodes. We chose to use dummy nodes in our implementation due to us believing that it would be simpler to change the remove last method. We made a few mistakes by forgetting to use the previous variable to point back to the previous nodes and leaving them as null during the loop, leading to the removeLast method not working. We also had to change the way the list printed to make sure that the elements inside of the dummy nodes weren't being printed. We also edited the no element case to update it in the context of having dummy nodes.

GNode:
Unchanged from the given file "GNODE"

GLinkList:
The original LinkList file was made to support the GNODE class using generics. To do this, we made the generic linked list use Integer types by making the nodes of type GNODE<Integer>. We also just made it so that the loop sent Integers into the list instead of Strings and edited the print function to deal with the generic linked list.

Note:
While completing the Lab we did not realize that we had to submit it 24 hours after the lab is due because we read the submission date written on the brightspace which was listed as due on Saturday at 4:00. If possible can we have an exception for this lab alone since we were not aware of the real submission date? If arrangements can be made please emails us at zzuba024@uottawa.ca, or aabdu252@uottawa.ca