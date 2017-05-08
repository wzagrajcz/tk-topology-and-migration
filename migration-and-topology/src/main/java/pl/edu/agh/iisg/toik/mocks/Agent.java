package pl.edu.agh.iisg.toik.mocks;

import java.util.List;

public class Agent {
    List<String> neighbours;
    String name;
    //...

    public String getNeighbour(){
        if(neighbours != null && neighbours.size()>0){
            return neighbours.get(0);
        }
        return null; //to nie powinno sie wydarzyc, bo kazdy agent ma sasiada
    }

    public boolean sendMessage(String receiver, Message message){
        //wysylanie...
        return true;
    }

    public String getName(){
        return name;
    }
}
