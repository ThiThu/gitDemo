package TDD;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TimGiaTriTuyetDoiTest {

    @Test
    void TimTuyetDoi() {
        int number = 0;
        int  expected =0;
        int result = TimGiaTriTuyetDoi.TimTuyetDoi(number);
        assertEquals(expected,result);

    }

    @Test
    void timTuyetDoi() {
        int number = 1;
        int expected =1;
        int result = TimGiaTriTuyetDoi.TimTuyetDoi(number);
        assertEquals(expected,result);
    }

    @Test
    void timTuyetDoi1() {
        int number = -1;
        int expected =1;
        int result = TimGiaTriTuyetDoi.TimTuyetDoi(number);
        assertEquals(expected,result);
    }
}
