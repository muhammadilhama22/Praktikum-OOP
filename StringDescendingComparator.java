/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.StripBandunk.BelajarTreeSet.Comparator;

import java.util.Comparator;

/**
 *
 * @author Muhammad Ilham
 */
public class StringDescendingComparator implements Comparator<String> {

    @Override
    public int compare(String o1, String o2) {
        return o1.compareTo(o2)* -1;
    }
    
}
