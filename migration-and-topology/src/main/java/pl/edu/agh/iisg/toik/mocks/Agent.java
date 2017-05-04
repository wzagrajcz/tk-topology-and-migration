package pl.edu.agh.iisg.toik.mocks;

import java.util.List;

public class Agent {
    List<Agent> neighbours;
    String name;
    //...

    public Agent getNeighbour(){
        if(neighbours != null && neighbours.size()>0){
            return neighbours.get(0);
        }
        return null; //to nie powinno sie wydarzyc, bo kazdy agent ma sasiada
    }
}
