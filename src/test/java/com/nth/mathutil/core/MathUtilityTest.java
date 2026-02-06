package com.nth.mathutil.core;

import org.junit.jupiter.api.Test;

import java.sql.SQLDataException;

import static com.nth.mathutil.core.MathUtility.getFactorial;
import static org.junit.jupiter.api.Assertions.*;

class MathUtilityTest {

    @Test
    public void testFactorialGivenWrongMinus5ThrowException() {
        assertThrows(IllegalArgumentException.class, () -> {getFactorial( -5);});
    }

    @Test
    public void testFactorialGivenWrongMinus25ThrowException() {
        assertThrows(IllegalArgumentException.class, () -> {getFactorial( 25);});
    }

    @Test
    public  void testGetFactorialGivenRightArg5RunsWell() {
        assertEquals( 120, getFactorial( 5));
    }//5! có trả về 120 hay ko


    @Test
    public  void testGetFactorialGivenRightArg1RunsWell() {
        assertEquals( 1, getFactorial( 1));
    }//1! có trả về 1 hay ko





    //framework: ép phải viết code theo 1 quy tắc, cấu trúc, thì mới run
    @Test
    public  void testGetFactorialGivenRightArg0RunsWell(){
        int n = 0;
        long expected = 1;//0! hy vọng là 1, còn thực tế thì
        long actual; //???? gọi hàm mới biết
        actual = getFactorial(n);

        assertEquals(expected, actual);//hàm so sánh này của thư viện JUnit Juputer
        //sẽ so sánh 2 đại lượng, nếu bằng nhau thì ném ra màu xanh, khác biệt ném ra màu đỏ

        //xanh đỏ để passed failed | chuẩn thế giới khi test, khi kiểm thử ta dùng 2 màu xanh đỏ để nói về trạng thái kiểm thử: đèn xanh thông đường, code release
        //                                 đèn đỏ code bug, dừng lại fix

        //System.out.println(n + "!Actual: " + actual + "; Expected: " + expected);

    }
}