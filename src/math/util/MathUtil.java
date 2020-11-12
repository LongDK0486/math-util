//code viet ra dep phai test trc
//co vai hinh thuc test code khac nhau
//1. TDD:Test Driven Development
//Viet dan khung cu ham getFactorial(int n)
//sau do dung ham test()
//chay thu coi xanh do, do nghia la loi,xanh nghai la on
//cu lien tuc xanh do nhu the trong qua trinh viet code
//va sua code ng ta goi la lap trinh huong theo thoa man
//viec test,TDD
//2.sout(ham kem data)de coi ket qua ra sao ,do dung nhu minh ki vong
//no phai tra ve nhu the hay ko->xem ket qua test=mat
//3.JOptionPane cua ben JavaDesktop de popup ket qua len man hing,
//van xem=mat
//4.viet 1 trang wed goi ham xu li...,ton suc
//ta choi cach 1 va 2

package math.util;

import javafx.scene.paint.Color;

public class MathUtil {
    public static void main(String[] args) {
        //2.test ham=mat
        System.out.println("5!:"+fu.util.MathUtility.getFactorial(5));
        //expected:120    actual:120 ok
        System.out.println("5!:"+fu.util.MathUtility.getFactorial(0));
         //expected:1    actual:1 ok
         //e: nem ve ngoai le IllegalArgumentException neu giai thua -5
         System.out.println("-5!:"+fu.util.MathUtility.getFactorial(-5));
    }
    
}
