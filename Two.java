public class Two
{
    public static void main(String args[]){
        int term = 1;
        int prevTerm1 = 0;
        int prevTerm2 = 0;
        int sum = 0;
        System.out.println("fibonacci");
        while(term < 4000000){
            if(term % 2 == 0) sum += term;
            prevTerm2 = prevTerm1;
            prevTerm1 = term;
            term = prevTerm1 + prevTerm2;
        }
        System.out.println(sum);
    }
}
