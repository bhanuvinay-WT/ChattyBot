class Main {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        int n = scanner.nextInt();
        int a[] = new int[n];
        int d=0,b=0,c=0;
        for(int i=0;i<n;i++){
            a[i]=scanner.nextInt();
        }
        for(int i=0;i<n;i++){
            if(a[i]==-1){
                d++;
                
            }
            else if(a[i]==1){
                b++;
            }
            else{
                c++; 
            } 
    }
    System.out.println(c+" "+b+" "+d);

}
}
