package practice;

public class ends {
    public static void main(String[] args) {
       
        int count = 100/7;
        System.out.println(count);
        int count1 = 100/10;
        System.out.println(count1);    

        int ans=1, i=1;
        int count2=0;
        while(ans<=100){
            ans = 7*i;
            i+=10;
            if(ans<=100){
                count2++;
            }
        }

        System.out.println(count+count1-count2);
    }
}