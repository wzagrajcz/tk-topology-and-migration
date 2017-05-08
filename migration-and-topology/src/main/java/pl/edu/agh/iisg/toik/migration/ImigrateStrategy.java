package pl.edu.agh.iisg.toik.migration;

import pl.edu.agh.iisg.toik.mocks.Individual;

import java.util.List;

public interface ImigrateStrategy {
    List<Individual> removeIndividuals (List<Individual> population, int numberOfIndividualsToRemove);
}
