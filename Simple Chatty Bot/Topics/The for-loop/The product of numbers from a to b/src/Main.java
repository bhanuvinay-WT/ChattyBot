class Main {
    public static void main(String[] args) {
        // put your code here
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        int a=scanner.nextInt();
        int b=scanner.nextInt();
        long product =1;
        for(int i=a;i<b;i++){
            product=product * i;
        }
        System.out.println(product);
         
    }
   
}
