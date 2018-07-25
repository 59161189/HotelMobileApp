package com.example.suppa.android1;

import java.util.ArrayList;
import java.util.List;

public class RecieveCustomerData {
    private static List<String> CTZ = new ArrayList<String>();
    private static List<String> PH = new ArrayList<String>();
    public RecieveCustomerData(){

    }
    public void Add(String a,String b){
        this.CTZ.add(a);
        this.PH.add(b);
    }
}
