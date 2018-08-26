package com.dev.hacknit.Database;

import java.util.ArrayList;
import java.util.List;

public class Ano{

    public int index;

    public List<Bimestre> bimestreList;

    public int getIndex() {
        return index;
    }

    public List<Bimestre> getBimestreList() {

        return bimestreList;
    }

    public Ano() {
        this.bimestreList = new ArrayList<Bimestre>();
    }

}
