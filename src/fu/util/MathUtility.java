
package fu.util;

public class MathUtility {
    //class nay chua cac ham tien ich dung chung cho moi noi
    //do do no phai nen la static
    public static final double PI=3.1415;
    //ham tinh n giai thua n>=0 &&n<=20
    //neu qua 20 tran kieu long
    //0!=1;1!=1;n!=1.2.3...n
//    public static long getFactorial(int n){
//        if(n<0||n>20){
//            throw new IllegalArgumentException("n must be >=0 & <=20");
//            //dua dau vao sai,minh ko tra ve 1 gia tri am chi sai roi
//        }
//        if(n==0||n==1){
//            return 1;//0!=1!=1
//        }
//        long result=1;
//        for (int i = 2; i <= n; i++) {
//            result*=i;
//        }
//        return result;
//    }
    public static long getFactorial(int n){
        if(n<0||n>20){
            throw new IllegalArgumentException("n must be >=0 & <=20");
            //dua dau vao sai,minh ko tra ve 1 gia tri am chi sai roi
        }
        if(n==0||n==1){
            return 1;//0!=1!=1
        }
        return n* getFactorial(n-1);//de quy do em
                                    //goi lai chinh minh voi quy mo nho hon
                                    //5! =5 *4!
                                    //4! =4 *3!
                                    //3! =3 *2!
                                    //2! =2 *1!
                                    //n! =n *(n-1)!
    }
}
