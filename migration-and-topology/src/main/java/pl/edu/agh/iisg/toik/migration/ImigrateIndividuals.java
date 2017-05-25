package pl.edu.agh.iisg.toik.migration;

import pl.edu.agh.iisg.toik.mocks.Agent;
import pl.edu.agh.iisg.toik.mocks.Individual;
import pl.edu.agh.iisg.toik.mocks.Message;

import java.util.List;

public class ImigrateIndividuals implements ImigrationService {

    public void process(Agent agent, List<Individual> population) {
        for (Message message : agent.getIncomingMessages()) {
            if(isOurMessage(message)){
                imigrate(population, message);
            }
        }
    }


    //TODO : THIS IS MOCK
    //nie wiadomo jak wyglada klasa message
    private boolean isOurMessage(Message message) {
        return true;
    }


    private void imigrate(List<Individual> population, Message message) {
        List<Individual> imigratedIndividuals = message.getContent();
        population.addAll(imigratedIndividuals);

    }
}
