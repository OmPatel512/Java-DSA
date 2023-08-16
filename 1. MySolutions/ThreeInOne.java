// Stacks

public class ThreeInOne {
  private int numberOfStacks = 3;
  private int stackCapacity;
  private int[] values;
  private int[] sizes;

  public ThreeInOne(int stackSize) {
    // TODO
    this.values = new int[stackSize];
    stackCapacity = stackSize/numberOfStacks;
    this.sizes = new int[stackCapacity];
  }

  // isFull
  public boolean isFull(int stackNum) {
    // TODO
    if(stackNum == 1){
          if(sizes[0] == 3){
              return true;
          }
      } else if (stackNum == 2){
          if(sizes[1] == 3){
              return true;
          }
      } else if (stackNum == 3) {
          if(sizes[2] == 3){
              return true;
          }
      } 
      return false;
    
  }

  // isEmpty
  public boolean isEmpty(int stackNum) {
      // TODO
      if(stackNum == 1){
          if(sizes[0] == 0){
              return false;
          }
      } else if (stackNum == 2){
          if(sizes[1] == 0){
              return false;
          }
      } else if (stackNum == 3) {
          if(sizes[2] == 0){
              return false;
          }
        }
      return true;
  }

  // indexOfTop - this is helper method for push, pop and peek methods

  private int indexOfTop(int stackNum) {
    // TODO
    if(stackNum == 1){
          return sizes[0];
      } else if (stackNum == 2){
          return sizes[1];
          
      } else if (stackNum == 3) {
          return sizes[2];
          
      } else {
          return -1;
      }
  }

  // push
  public void push(int stackNum, int value) {
    // TODO
    if(stackNum == 1){
        if(isFull(stackNum))  {
            return;
        } else {
            values[indexOfTop(stackNum)] = value;
            sizes[0] += 1;
        }
    } else if (stackNum == 2){
        if(isFull(stackNum))  {
            return;
        } else {
            values[indexOfTop(stackNum)+stackCapacity] = value;
            sizes[0] += 1;
        }  
    } else if (stackNum == 3) {
        if(isFull(stackNum))  {
            return;
        } else {
            values[indexOfTop(stackNum)+(2*stackCapacity)] = value;
            sizes[0] += 1;
        }  
    } 
    return;
  }

  // pop
  public int pop(int stackNum) {
    // TODO
    if(stackNum == 1){
        if(isEmpty(stackNum))  {
            return -1;
        } else {
            int ts = values[indexOfTop(stackNum)];
            sizes[0] -= 1;
            return ts;
        }
    } else if (stackNum == 2){
        if(isEmpty(stackNum))  {
            return -1;
        } else {
            int ts = values[indexOfTop(stackNum)+stackCapacity];
            sizes[1] -= 1;
            return ts;
        } 
    } else if (stackNum == 3) {
        if(isEmpty(stackNum))  {
            return -1;
        } else {
            int ts = values[indexOfTop(stackNum)+(2*stackCapacity)];
            sizes[2] -= 1;
            return ts;
        } 
    } else {
          return -1;
    }
  }

  // peek

  public int peek(int stackNum) {
    // TODO
    if(stackNum == 1){
        if(isEmpty(stackNum))  {
            return -1;
        } else {
            int ts = values[indexOfTop(stackNum)];
            return ts;
        }
    } else if (stackNum == 2){
        if(isEmpty(stackNum))  {
            return -1;
        } else {
            int ts = values[indexOfTop(stackNum)+stackCapacity];
            return ts;
        } 
    } else if (stackNum == 3) {
        if(isEmpty(stackNum))  {
            return -1;
        } else {
            int ts = values[indexOfTop(stackNum)+(2*stackCapacity)];
            return ts;
        } 
    } else {
          return -1;
    }
  }

}

