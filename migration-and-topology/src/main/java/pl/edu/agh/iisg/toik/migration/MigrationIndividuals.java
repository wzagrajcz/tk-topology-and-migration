package pl.edu.agh.iisg.toik.migration;


import pl.edu.agh.iisg.toik.mocks.Agent;
import pl.edu.agh.iisg.toik.mocks.Individual;
import pl.edu.agh.iisg.toik.mocks.Message;

import java.util.Date;
import java.util.List;

public class MigrationIndividuals implements MigrationService {
    //@Inject
    Agent agent;


    public void emigrate(List<Individual> population) {
        //od czego zalezy, ktora strategia wyboru osobnikow zostanie wykorzystana?
        //jak maja zostac przeslane parametry uzyte w strategiach emigracji?
        EmigrateStrategy emigrateStrategy = new BestIndividualsEmigrateStrategy();
        List<Individual> selectedIndividuals = emigrateStrategy.selectIndividuals(population);
        Message message = createMessage(selectedIndividuals);
        agent.sendMessage(agent.getNeighbour(),message);

    }

    public void imigrate(List<Individual> population, Message message) {
        List<Individual> imigratedIndividuals = message.getContent();
        population.addAll(imigratedIndividuals);

    }

    private Message createMessage(List<Individual> individuals){
        return new Message(agent.getName(), agent.getNeighbour(),individuals, new Date());
    }
}
