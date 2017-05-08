package pl.edu.agh.iisg.toik.migration;

import pl.edu.agh.iisg.toik.mocks.Individual;

import java.util.List;

public interface EmigrateStrategy {
    List<Individual> selectIndividuals(List<Individual> individuals);
}
