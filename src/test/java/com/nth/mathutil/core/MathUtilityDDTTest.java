package com.nth.mathutil.core;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import static com.nth.mathutil.core.MathUtility.getFactorial;
import static org.junit.jupiter.api.Assertions.*;

class MathUtilityDDTTest {
    //hàm trả về mảng 2 chiều - mảng 2 chiều như chung cu hình chữ nhật tầng x số phòng
    //trên một tầng
    //chung cư 20 x 10 nghĩa là: 20 tầng, mỗi tuầng 10 phòng
    //      [20][10] nghĩa là 20 dãy biến, mỗi dãy là 10 biến
    //      20 cái mảng 1 chiều, mảng 1 chiều 10 phần tử
    //      mảng của các mảng khác

    //hàm này dùng để trả về tập data dùng để test hàm tính giai thừa!!
    //mảng 2 chiều [?][2]
    //chuẩn bị data đưa vào, nhồi vào hàm test, data driven
    public static Object[][] initData() {
        Object dataSet[][] = { {0, 1},
                               {1, 1},
                               {2, 2},
                               {3, 6},
                               {4, 24},
                              {5, 120}
                              };
        return  dataSet;
    }

    @ParameterizedTest
    @MethodSource("initData")
    public  void testGetFactorialGivenRightArg1RunsWell(int n, long expected) {
        assertEquals( expected, getFactorial( n ));
    }//1! có trả về 1 hay ko


}