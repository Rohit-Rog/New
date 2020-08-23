public class MyClass {
    public static void main(String args[]) {
      System.out.println(BinaryToString(110010));
    }
    public static String BinaryToString(int N){
        String s="";
        for(int n=N; n>0; n/=10){
            int m = n%10;
            s+=m;
        }
        String rev="";
        for(int i=s.length()-1;i>=0;i--){
            rev+=s.charAt(i);
        }
        return rev;
    }
}