package org.revamp;

public class ArraysCollectionsDataStructures {

    /**
     * Write a program that checks whether the two given arrays are equal.
     *
     * @param a Object[]
     * @param b Object[]
     *
     * @return boolean
     */
    public boolean areEqualArrays(Object[] a, Object[] b) {
        if (a == null || b == null) {
            return false;
        } else if (a.length != b.length) {
            return false;
        } else if (a == b) {
            return true;
        } else {
            int i = 0;
            while (i < a.length) {
                if (!(a[i].equals(b[i]))) {
                    return false;
                }
                i++;
            }
        }
        return true;
    }
}
