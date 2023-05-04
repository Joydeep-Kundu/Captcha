import java.util.Random;
public class design {
    Random r=new Random();
    String c=new String("abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTWXYZ");
    String spc=new String("@#$%&*+/|><~'");
    public char randChar(){
        char a=c.charAt(r.nextInt(c.length()));
        System.out.println(a);
        return a;
    }
    public int randInt(){
        int a=r.nextInt(10);
        System.out.println(a);
        return a;
    }
    public char  randSpacialChar(){
        char a=spc.charAt(r.nextInt(spc.length()));
        System.out.println(a);
        return  a;
    }
    String genStrCap(){
        char[] c=new char[5];
        int ch=2,n=2,s=1,l=0,pp;
        while (l<5){
            pp=r.nextInt(3);
            if (pp==0 && ch>0){
                c[l]=randChar();
                ch--;
                l+=1;
            } else if (pp ==1 && s>0) {
                c[l]=randSpacialChar();
                s--;
                l+=1;
            } else if (n>0) {
                c[l]=(char)(randInt()+'0');
                n--;
                l+=1;
            }
        }
        return new String (c);
    }
}
