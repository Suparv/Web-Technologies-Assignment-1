class Main {
  public static void main(String[] args) {

    int a=101;
    int b=2;
    int temp;
    System.out.println("Original a = "+a+", Original b = "+b);
    temp = a;
    a = b;
    b = temp;
System.out.println("After swapping using third variable");
    System.out.println("a = "+a+",b = "+b);

    a = 101;
    b=2;

    a=a+b;
    b=a-b;
    a=a-b;
System.out.println("After swapping without using third variable");
    System.out.println("Original a = "+a+", Original b = "+b);
    
  }
}
