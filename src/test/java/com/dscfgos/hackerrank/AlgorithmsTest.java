package com.dscfgos.hackerrank;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class AlgorithmsTest {

    @Test
    void betweenTwoSetsTest(){
        BetweenTwoSets betweenTwoSets = new BetweenTwoSets();

        assertEquals(0,betweenTwoSets.getTotalX(
                List.of(91, 92, 93, 94, 95, 96, 97, 98, 99, 100),
                List.of(1, 2, 3, 4, 4, 5, 6, 7, 8, 9,10)));

    }
}