package pl.edu.agh.iisg.toik.migration;


import pl.edu.agh.iisg.toik.mocks.Agent;
import pl.edu.agh.iisg.toik.mocks.Individual;
import pl.edu.agh.iisg.toik.mocks.Message;

import java.util.Date;
import java.util.List;

public class EmigrationIndividuals implements EmigrationService {
    //@Inject
    Agent agent;


    private void emigrate(Agent agent, List<Individual> population) {
        EmigrateStrategy emigrateStrategy = new BestIndividualsEmigrateStrategy();
        List<Individual> selectedIndividuals = emigrateStrategy.selectIndividuals(population);
        Message message = createMessage(selectedIndividuals);
        agent.sendMessage(message);

    }

    private Message createMessage(List<Individual> individuals){
        return new Message(agent.getName(), agent.getNeighbours(), individuals, new Date());
    }

    public void process(Agent agent, List<Individual> population) {
        emigrate(agent, population);
    }
}
