package pl.edu.agh.iisg.toik.migration;

import pl.edu.agh.iisg.toik.mocks.Agent;
import pl.edu.agh.iisg.toik.mocks.Individual;
import pl.edu.agh.iisg.toik.mocks.Message;

import java.util.List;

public interface MigrationService {

    void emigrate(List<Individual> population);
    void imigrate(List<Individual> population, Message message);
}
