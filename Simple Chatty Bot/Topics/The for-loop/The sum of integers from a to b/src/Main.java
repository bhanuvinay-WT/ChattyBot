class Main {
    public static void main(String[] args) {
    java.util.Scanner scanner = new java.util.Scanner(System.in);
      int a=scanner.nextInt();
      int b=scanner.nextInt();
      int sum=0;  // put your code here
      for(int i=a;i<=b;i++){
          sum +=i;
      }
      System.out.println(sum);
    }
}
