class MyLinkedList {
    SLLNode head;
    int size;
      class SLLNode {
        int val;
        SLLNode next;
        SLLNode(int val){
            this.val = val;
            this.next = null;
        }
      }
    public MyLinkedList() {
        head = null;
         size=0;
    }
    
    public int get(int index) {
        if(index<0 || index>=size) return -1;
        SLLNode temp = head;
        if(index<size){
            for(int i=0;i<index;i++){
                temp = temp.next;
            }
            return temp.val;
        }
        return 0;
    }
    
    public void addAtHead(int val) {
        SLLNode nn = new SLLNode(val);
        nn.next = head;
        head = nn;
        size++;
    }
    
    public void addAtTail(int val) {
        if(size==0) {
            addAtHead(val);
            return;
        }
        SLLNode temp = head;
        while(temp.next!=null){
            temp = temp.next;
        }
        SLLNode nn = new SLLNode(val);
        temp.next = nn;
        size++;
    }
    
    public void addAtIndex(int index, int val) {
        if(index>size) return;
        if(index<=0){
            addAtHead(val);
            return;
        }
        if(index==size){
            addAtTail(val);
            return;
        }
        SLLNode temp = head;
        SLLNode nn = new SLLNode(val);
        for(int i=0;i<index-1;i++){
              temp = temp.next;
        }
        nn.next = temp.next;
        temp.next  = nn;
          size++;
        }
    
    public void deleteAtIndex(int index) {
        if(index<0 || index>=size){
            return;
        }
        if(index==0){
            head = head.next;
            size--;
            return;
        }
        SLLNode temp = head;
            for(int i=0;i<index-1;i++){ 
              temp = temp.next;
        }
    temp.next = temp.next.next;
    size--;
}
}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */