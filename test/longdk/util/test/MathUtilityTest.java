/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package longdk.util.test;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author DELL
 */
public class MathUtilityTest {
    //minh se test cac tinh huong xai ham getFactorial() o day
    //tinh huong la tham so dua vao:duong ,am,duong trong khoang 0..20,ngoai
    // thuong ta co tinh huong thanh cong va that bai
    // that bai dua vao am >20.bi an don
    //ham phai bat cac tinh huong nay ,va gio la test thu coi ham xu li dung ko
    //quy tac dat ten ham danh cho ham test
    //ten hang bao gom ngu nghia ket qua tra ve, tinh trang tes
    //minh dang viet code de test app
    // minh muon test ham tra ve ngon neu dua tham so ngon
    @Test //bien ham nay thanh public static void main()
    public void getFactorial_RunWell_IfValidArgument(){
        assertEquals(120, fu.util.MathUtility.getFactorial(5));
        //tui muon check coi co dung la goi ham 5! co dung la 120 hay ko
        //co xanh ko
        assertEquals(720, fu.util.MathUtility.getFactorial(6));
        assertEquals(24, fu.util.MathUtility.getFactorial(4));
        assertEquals(6, fu.util.MathUtility.getFactorial(3));
        assertEquals(1, fu.util.MathUtility.getFactorial(0));
        assertEquals(1, fu.util.MathUtility.getFactorial(1));
        assertEquals(6, fu.util.MathUtility.getFactorial(3));
        //t muon thay xanh tren Git ,ko xem o day
    }
}
//mac ding code test doc lap voi code chinh doc lap voi qua tring clean and build 
//tuc la code ban xanh hay do
//ban luon dong goi build ra duoc file .jar  .war (Chap xanh do)

//Hop logic thi mau xanh tuc lam ham chuan thi moi nen ra dc .jar .war
//vay ta can co 1 cach gai xanh do vao quy trinh build .jar .war
//Cach khac: Neu Code test dang mau do thi disable cai nut bam clean&build