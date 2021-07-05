class Main {
    public static void main(String[] args) {
      java.util.Scanner scanner = new java.util.Scanner(System.in);
      int a=scanner.nextInt();
      int b=scanner.nextInt();  // put your code here
        for(int i=a;i<=b;i++){
            if(i%3==0 && i%5==0){
                System.out.println("FizzBuzz");
            }
            else if(i%5==0){
                System.out.println("Buzz");
            }
            else if(i%3==0){
            System.out.println("Fizz");
            }
            else{
            System.out.println(i);
            }
        }
    }
}
