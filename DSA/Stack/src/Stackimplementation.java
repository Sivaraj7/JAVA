public class Stackimplementation
{
  int stack[]=new int[10];
  int top;

  Stackimplementation()
  {
      top=-1;
  }
  void push(int val){
      if(top==10)
      {
          System.out.println("Stack is full");
      }
      stack[++top]=val;
  }
  int pop()
  {
      if(top>=0)
      {
          return stack[top--];
      }
      return -1;
  }
  void peak()
  {
      System.out.println("Top element is "+stack[top]);
  }
  void display(){
      for(int i=0;i<=top;i++){
          System.out.println(stack[i]+" ");
      }
  }
  public static void main(String []args)
  //static-->constant || (String[]args)-->Parameter passing argumnents
  {
      Stackimplementation obj=new Stackimplementation();
      obj.push(10);
      obj.peak();
      obj.display();
      obj.push(5);
      obj.peak();
      obj.display();
      obj.push(10);
      obj.peak();
      obj.display();
      obj.push(10);
      obj.peak();
      obj.display();
      obj.push(10);
      obj.peak();
      obj.pop();

  }
}
