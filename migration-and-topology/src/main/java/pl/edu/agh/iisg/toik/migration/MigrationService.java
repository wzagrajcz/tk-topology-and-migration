package pl.edu.agh.iisg.toik.migration;

import pl.edu.agh.iisg.toik.mocks.Agent;
import pl.edu.agh.iisg.toik.mocks.Individual;
import pl.edu.agh.iisg.toik.mocks.Message;

import java.util.List;

public interface MigrationService {

    public void emigrate(List<Individual> population);
    public void imigrate(List<Individual> population, Message message);
}
