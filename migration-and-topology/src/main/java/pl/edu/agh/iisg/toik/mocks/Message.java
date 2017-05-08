package pl.edu.agh.iisg.toik.mocks;


import java.util.Date;
import java.util.List;

//Message moze byc abstrakcyjna generyczna odnosnie typu contentu
public class Message {
    String sender;
    String receiver;
    Date timeStamp;
    List<Individual> content;
    //...

    public Message(String sender, String receiver, List<Individual> content, Date timeStamp) {
        this.sender = sender;
        this.receiver = receiver;
        this.content = content;
        this.timeStamp = timeStamp;
    }

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public String getReceiver() {
        return receiver;
    }

    public void setReceiver(String receiver) {
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

