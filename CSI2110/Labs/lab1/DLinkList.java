/** 
 * Builds a singly linked list of size 5 and prints it to the console.
 * 
 * @author Jochen Lang
 */

class DLinkList {
	DNode head;
	DNode tail;

    DLinkList( int sz ) {
	if ( sz <= 0 ) {
	    head = null;
	}
	else {
		// make head be a dummy node to be at the beginning of the list
		head = new DNode( null, null, null);
	    // start with list of size 1
	    head.setNext(new DNode( "0", head, null )); 
	    DNode current = head.getNext(); // temp node for loop
	    // add further nodes
	    for ( int i=1; i<sz; ++i ) {
		// create node and attach it to the list
		DNode node2Add = new DNode( Integer.toString(i), current, null);
		current.setNext(node2Add);   // add first node
		current=node2Add;
	    }
		// make tail be a dummy node at the end of the list
		tail = new DNode( current, null, null);
	}
    }
    
    /**
     * Print all the elements of the list assuming that they are Strings
     */
    public void print() {
	/* Print the list */
	DNode current = head; // point to the first node
	while (current != null) {
	    System.out.print((String)current.getElement() + " ");	
	    current = current.getNext(); // move to the next
	}
	System.out.println();	
    }

    public void deleteFirst() {
		if ( head.getNext() != tail) {
			//Make the dummy node head's next node be the node after
			//what it is currently pointing to.
			head.setNext(head.getNext().getNext());
			// make the node that is now after head be pointing back to head.
			head.getNext().setPrevious(head);
		}
    }

    public void deleteLast() {
	if ( tail.getPrevious() != head ) {
			//Make the dummy node tail's previous node be the node before
			//what it is currently pointing to.
			tail.setPrevious(tail.getPrevious().getPrevious());
			// make the node that is now before previous be pointing back to tail.
			tail.getPrevious().setNext(tail);
		}
    }

    // create and display a linked list
    public static void main(String [] args){
	/* Create the list */
	LinkList llist = new LinkList( 5 );
	/* Print the list */
	llist.print();
	/* delete first and print */
	llist.deleteFirst();
	llist.print();
	/* delete last and print 5 times */
	for ( int i=0; i< 5; ++i ) {
	    llist.deleteLast();
	    llist.print();
	}
    }
}
