package pl.edu.agh.iisg.toik.mocks;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;


public class Agent {

    private List<Individual> population;
    private LinkedList<Message> incomingMessages = new LinkedList<Message>();
    private LinkedList<Message> outgoingMessages = new LinkedList<Message>();
    private String name = null;
    private List<Agent> neighbours;

    public void receiveMessage(Message message){
        incomingMessages.add(message);
    }

    public void sendMessage(Message message){
        outgoingMessages.add(message);
    }

    public List<Message> getOutgoingMessages(){
        return Collections.unmodifiableList(outgoingMessages);
    }

    public boolean consumeOutgoingMessage(Message message){
        return outgoingMessages.remove(message);
    }

    public List<Message> getIncomingMessages(){
        return Collections.unmodifiableList(incomingMessages);
    }

    public boolean consumeIncomingMessage(Message message){
        return incomingMessages.remove(message);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Agent> getNeighbours() {
        return neighbours;
    }

    public void setNeighbours(List<Agent> neighbours) {
        this.neighbours = neighbours;
    }

}