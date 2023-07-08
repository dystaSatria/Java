class HelloWorld {
    public static void main(String[] args) {
        String[] ahha = new String[4];
        ahha[0] = "Suka";
        ahha[1] = "duka";
        
        for(int i = 0 ; i < ahha.length; i++){
            System.out.println(ahha[i] + " \n");
        }
        
        //Second Technique
        
        for(String a:ahha){
    System.out.println(a );

        }
    }
}
