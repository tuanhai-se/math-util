package com.nth.mathutil.tester;

import com.nth.mathutil.core.MathUtility;

import static com.nth.mathutil.core.MathUtility.getFactorial;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //XÀI THỬ HÀM TÍNH GIAI THỪA
        System.out.println("5! = " + MathUtility.getFactorial(5));
        System.out.println("6! = " + MathUtility.getFactorial(6));

//        testGetFactorialGivenRightArg0RunsWell();
//        testGetFactorialGivenRightArg1RunsWell();
//        testGetFactorialGivenRightArg5RunsWell();
//        //testGetFactorialGivenWrongArgMinus5ThrowsException();
//        testGetFactorialGivenWrongArg25ThrowsException();
    }

    public static void testGetFactorialGivenRightArg0RunsWell(){
        int n = 0;
        long expected = 1;//0! hy vọng là 1, còn thực tế thì
        long actual; //???? gọi hàm mới biết
        actual = getFactorial(n);
        System.out.println(n + "!Actual: " + actual + "; Expected: " + expected);

    }
    //TEST CASE #2:
    //DESC: CHECK GETF() WITH VALID BOUNDARY NUMBER, E.G N = 1
    //STEP: N = 1
    //          CALL GETF(N)
    //EXPECTED 1 AS THE RESULT OF 1!
    //STATUS
    public static void testGetFactorialGivenRightArg1RunsWell(){
        int n = 1;
        long expected = 1;//0! hy vọng là 1, còn thực tế thì
        long actual; //???? gọi hàm mới biết
        actual = getFactorial(n);
        System.out.println(n + "! Actual: " + actual + "; Expected: " + expected);

    }


    //TEST CASE #3:
    //DESC: CHECK GETF() WITH VALID BOUNDARY NUMBER, E.G N = 5
    //STEP: N = 5
    //          CALL GETF(N)
    //EXPECTED 120 AS THE RESULT OF 5!
    //STATUS
    public static void testGetFactorialGivenRightArg5RunsWell(){

        System.out.println("5! Expected 120; Actual: " + getFactorial(5));

    }


    //TEST CASE #4:
    //DESC: CHECK GETF() WITH VALID BOUNDARY NUMBER, E.G N = 5
    //STEP: N = -5
    //          CALL GETF(-5)
    //EXPECTED: 1 NGOẠI LỆ PHAI XUAT HIEN, VÌ DATA ĐẦU VÀO CÀ CHỚN, BẤT ỔN, KO TÍNH DC
    //          KO CÓ GIÁ TRỊ TRẢ VỀ: THROW NEW EXCEPTION("CÂU THÔNG BÁO")
    //                                 THROW NEW ILLegalArgumentException("CÂU THÔNG BÁO LỖI")
    //STATUS
    public static void testGetFactorialGivenWrongArgMinus5ThrowsException(){

        System.out.println("-5! Expected Exception; Actual: ");
        getFactorial(-5);
    }//thấy ngoại lệ khi đưa n = -5; => hàm mlem với n âm, ít nhất với -5, CODE Đúng!!
    //ĐÚNG VÌ -5 PHẢI NÉM RA NGOẠI LỆ, VÀ THỰC TẾ NÓ ĐÃ NÉM


    //TEST CASE #5:
    //DESC: CHECK GETF() WITH VALID BOUNDARY NUMBER, E.G N = 25
    //STEP: N = -25
    //          CALL GETF(25)
    //EXPECTED: 1 NGOẠI LỆ PHAI XUAT HIEN, VÌ DATA ĐẦU VÀO CÀ CHỚN, BẤT ỔN, KO TÍNH DC
    //          KO CÓ GIÁ TRỊ TRẢ VỀ: THROW NEW EXCEPTION("CÂU THÔNG BÁO")
    //                                 THROW NEW ILLegalArgumentException("CÂU THÔNG BÁO LỖI")
    //STATUS
    public static void testGetFactorialGivenWrongArg25ThrowsException(){

        System.out.println("25! Expected Exception; Actual: ");
        getFactorial(25);
    }//thấy ngoại lệ khi đưa n = 25;
    //ĐÚNG VÌ 25 PHẢI NÉM RA NGOẠI LỆ, VÀ THỰC TẾ NÓ ĐÃ NÉM


    //TEST CASE #1: (CÂU SỒ 2, SỐ 3 LÀ VIẾT TEST CASE ĐÓ EM!!!
    //RAG: KĨ THUẬT CHO CON CHAT TRỎ VỀ DATABASE MÌNH
    //ID, TEST CASE DESCRIPTION | DATA | STEPS | PROCEDURE | EXPECTED | RESULT
    //(PASSED | FAILED) | TEST DATE | TEST BY
    //ID  | DESC                  | DATA | STEPS | EXPECTED RESULT | STATUS      | DATE    | BY
    //TC01| VERIFY getFactorial() | n = 0| n = 0                     chờ chạy      23/1/06 | GL
    //      CHECK                       call getF(0) 1 as the result    moi biet
    //      TEST                                            of 0!
    //      with valid n

    //CÁCH VIẾT CHIỀU DỌC CHO DỄ ĐỌC
    //Test ID: TC01
    //DESC: CHECK getFactorial() with a valid n (boundary value) e.g 0, 20
    //DATA: n = 0
    //STEPS (CÁC BƯỚC KIỂM THỬ - NẾU TEST CHỨC NĂNG MÀN HÌNH GIỐNG NHƯ USER GUIDE
    //      STEP1: CLICK...
    //      STEP2: INPUT...)
    //      prepare n = 0 (a boundary value)
    //
}