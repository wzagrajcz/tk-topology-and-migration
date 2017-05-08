package pl.edu.agh.iisg.toik.migration;

import pl.edu.agh.iisg.toik.mocks.Individual;

import java.util.List;
import java.util.Random;

public class RandomImigrateStrategy implements ImigrateStrategy{

    public List<Individual> removeIndividuals(List<Individual> population, int numberOfIndividualsToRemove) {
        if(population.size() < numberOfIndividualsToRemove) {
            // 1. Co jesli imigrujemy np. 10 osobnikow, gdy populacja ma ich 5?
            // 2. Czy kazda populacja ma tyle samo osobnikow?
        }else{
            Random rand = new Random();
            for(int numberOfRemovals = 0; numberOfRemovals < numberOfIndividualsToRemove; numberOfRemovals++){
                int individualIdToRemove = rand.nextInt(population.size());
                population.remove(individualIdToRemove);
            }
        }
        return population;
    }
}
