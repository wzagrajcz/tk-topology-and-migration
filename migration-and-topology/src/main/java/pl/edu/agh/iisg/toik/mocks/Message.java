package pl.edu.agh.iisg.toik.mocks;


import java.util.Date;
import java.util.List;

//Message moze byc abstrakcyjna generyczna odnosnie typu contentu
public class Message {
    Agent sender;
    Agent receiver;
    Date timeStamp;
    List<Individual> content;
    //...

    public Message(Agent sender, Agent receiver, List<Individual> content, Date timeStamp) {
        this.sender = sender;
        this.receiver = receiver;
        this.content = content;
        this.timeStamp = timeStamp;
    }

    public Agent getSender() {
        return sender;
    }

    public void setSender(Agent sender) {
        this.sender = sender;
    }

    public Agent getReceiver() {
        return receiver;
    }

    public void setReceiver(Agent receiver) {
        this.receiver = receiver;
    }

    public Date getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(Date timeStamp) {
        this.timeStamp = timeStamp;
    }

    public List<Individual> getContent() {
        return content;
    }

    public void setContent(List<Individual> content) {
        this.content = content;
    }

}

