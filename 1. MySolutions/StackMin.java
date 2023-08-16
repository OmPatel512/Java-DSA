
public class StackMin {
    Node top;
    Node min;

  public StackMin() {
    // TODO
    min.value = Integer.MAX_VALUE;
    top = null;
    min = null;
  }

  public int min() {
    // TODO
    return min.value;
  }

  public void push(int value) {
    // TODO
    Node n = new Node();
    n.value = value;
    if(top == null){
        top = n;
        min = n;
    }
    if(value < min.value) {
        top.next = top;
        top = n;
        min.next = min;
        min = n;
    } else {
        top.next = top;
        top = n;
    }
  }

  public int pop() {
    // TODO
    Node t = top;
    if (top == null) {
        return -1;
    } else if (top.value <= min.value) {
        top = top.next;
        min = min.next;
    } else {
        top = top.next;
    }
    return t.value;
  }
}
