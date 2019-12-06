package com.launchcode.java;

public interface Tree<D extends Comparable> {
    /*
    * Signatures
    * */

    public boolean isEmpty();
    public int cardinality();   //size of tree; 0 for empty or non-0 to indicate size
    public boolean member(D elt);
    public NonEmptyBST<D> add(D elt);
}
