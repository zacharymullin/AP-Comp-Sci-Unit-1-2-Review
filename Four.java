public class Four
{
    public static void main(String args[]){
        for(int c = 1; c < 997; c++){
            for(int b = 1; b < c; b++){
                for(int a = 1; a < b; a++){
                    if((a*a) + (b*b) == (c*c) && a + b + c == 1000) {
                        System.out.println("a = " + a + " b = " + b + " c = " + c);
                        System.out.println("Product abc = " + (a*b*c));
                    }
                }
            }
        }
    }
}
