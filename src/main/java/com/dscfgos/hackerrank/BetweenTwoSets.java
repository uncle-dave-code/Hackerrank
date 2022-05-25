package com.dscfgos.hackerrank;

import java.util.List;

public class BetweenTwoSets {
    public int getTotalX(List<Integer> a, List<Integer> b) {

        int result = 0;
        int lcm = 0;
        int gcd = 0;
        if (a != null && !a.isEmpty() && b != null && !b.isEmpty()) {
            a.sort(Integer::compareTo);
            b.sort(Integer::compareTo);

            List<Integer> lstLowers = null;
            List<Integer> lstHigher = null;
            if(a.get(a.size()-1)< b.get(0)){
                lstLowers = a;
                lstHigher = b;
            }else{
                lstLowers = b;
                lstHigher = a;
            }

            lcm = lstLowers.get(0);

            if (lstLowers.size() > 1) {
                for (int i = 1; i < lstLowers.size(); i++) {
                    lcm = getLessCommunMultiple(lcm, lstLowers.get(i));
                }
            }

            gcd = lstHigher.get(0);

            if (lstHigher.size() > 1) {
                for (int i = 1; i < lstHigher.size(); i++) {
                    gcd = getGreatestCommonDivisor(gcd, lstHigher.get(i));
                }
            }

            for (int i = lcm; i <= gcd; i++) {
                if (i % lcm == 0 && gcd % i == 0) {
                    result++;
                }
            }
        }

        return result;
    }

    private int getLessCommunMultiple(int numberA, int numberB) {
        return (numberA * numberB) / getGreatestCommonDivisor(numberA, numberB);
    }

    private int getGreatestCommonDivisor(int numberA, int numberB) {
        if (numberB == 0) {
            return numberA;
        }
        return getGreatestCommonDivisor(numberB, numberA % numberB);
    }
}
