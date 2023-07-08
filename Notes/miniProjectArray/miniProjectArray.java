class HelloWorld {
    public static void main(String[] args) {
        double [] myList = {1.2,1.4,1.7,2.9,50.9,8.4};
        double max = myList[0];
        double total = 0;
        for( double number:myList){
            if (max < number){
               max = number;
            }
            total = total + number;
        }
         System.out.println("Total is "+ total);
        System.out.println("Biggest is "+ max);

    }
}
