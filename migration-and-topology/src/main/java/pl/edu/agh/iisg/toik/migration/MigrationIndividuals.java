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
        EmigrateStrategy emigrateStrategy = new BinaryEmigrateStrategy();
        List<Individual> selectedIndividuals = emigrateStrategy.selectIndividuals(population);
        Message message = createMessage(selectedIndividuals);
        agent.sendMessage(agent.getNeighbour(),message);

    }

    public void imigrate(List<Individual> population, Message message) {
        List<Individual> imigratedIndividuals = message.getContent();
        int numberOfIndividualsToImigrate = imigratedIndividuals.size();
        ImigrateStrategy imigrateStrategy = new RandomImigrateStrategy();
        population = imigrateStrategy.removeIndividuals(population, numberOfIndividualsToImigrate);
        population.addAll(imigratedIndividuals);

    }

    private Message createMessage(List<Individual> individuals){
        return new Message(agent.getName(), agent.getNeighbour(),individuals, new Date());
    }
}
