public class Test {

  public void t1(int n){
    if ( n > 0)
    if (n  <  5)
      System.out.println("I am in double if");
    else
      System.out.println("I am in else");
  }

  public static void main(String args[]){

    Test t = new Test();

    System.out.println("1");
    t.t1(4); // first+second if correct

    System.out.println("2");
    t.t1(8); // first correct, second wrong

    System.out.println("3");
    t.t1(-2);// both wrong
  }

}
