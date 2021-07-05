class Main {
    public static void main(String[] args) {
       java.util.Scanner scanner = new java.util.Scanner(System.in);
       int a= scanner.nextInt();
       int b = scanner.nextInt();
       int n= scanner.nextInt();
       int count=0;
       for(int i=a;i<=b;i++){
           if(i%n==0){
               count++;
           }
       }
       System.out.println(count);
           }
}
