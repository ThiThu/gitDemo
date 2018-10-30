package TDD;

import TDD.ViDu;

import static org.junit.jupiter.api.Assertions.*;

class ViDuTest {

    @org.junit.jupiter.api.Test
    void ADD() {
        ViDu vd= new ViDu();
        int tong =vd.ADD(3,4);
        assertEquals(7,tong);
    }
}