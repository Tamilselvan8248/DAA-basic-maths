public class Armstrong{
    public static void main(String[] args){
        int num=153,n=num,n1=num;
        int count=0,lastDigit=0,revNum=0;
        while(num>0){
            lastDigit=num%10;
            num=num/10;
            count=count+1;            
        } 
        while(n>0){
            int pov=1;
        lastDigit=num%10;
        num=num/10;
        for(int i=0;i<count;i++){
            pov=pov*pov;
        }
        revNum=revNum+pov;
        }                                                                       

        System.out.println(count);
       System.out.println(revNum);
    }
}