package pl.edu.agh.iisg.toik.migration;


import pl.edu.agh.iisg.toik.mocks.Agent;
import pl.edu.agh.iisg.toik.mocks.Individual;
import pl.edu.agh.iisg.toik.mocks.Message;
import pl.edu.agh.iisg.toik.mocks.MessageService;

import java.util.Date;
import java.util.List;

public class MigrationIndividuals implements MigrationService {
    //@Inject
    Agent agent;

    //@Inject
    MessageService messageService;

    public void emigrate(List<Individual> population) {
        EmigrateStrategy emigrateStrategy = new BinaryStrategy();
        List<Individual> selectedIndividuals = emigrateStrategy.selectIndividuals(population);
        Message message = createMessage(selectedIndividuals);
        messageService.sendMessage(message);

    }

    public void imigrate(List<Individual> population, Message message) {
        List<Individual> imigratedIndividuals = message.getContent();
        population.addAll(imigratedIndividuals);

    }

    private Message createMessage(List<Individual> individuals){
        return new Message(agent, agent.getNeighbour(),individuals, new Date());
    }
}
