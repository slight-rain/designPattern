package com.design.create.impl;

import com.design.create.Direction;
import com.design.create.MapSite;

public class Room implements MapSite {
    private int id;
    private MapSite[] sides=new MapSite[4];
    @Override
    public void enter() {

    }
    public MapSite getSide(Direction direction){
        return sides[direction.ordinal()];
    }
    public void setSides(Direction direction,MapSite mapSite){
        sides[direction.ordinal()]=mapSite;
    }
}
