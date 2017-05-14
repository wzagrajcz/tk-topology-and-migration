package pl.edu.agh.iisg.toik.migration;

import pl.edu.agh.iisg.toik.mocks.Individual;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class CompetitionEmigrateStrategy implements EmigrateStrategy{
    //@Inject
    int numberOfPairs = 2;

    public List<Individual> selectIndividuals(List<Individual> population) {
        List<Individual> individuals = new ArrayList<Individual>(population);
        List<Individual> contestants = new ArrayList<Individual>();
        List<Individual> selectedIndividuals = new ArrayList<Individual>();
        Random rand = new Random();
        for(int numberOfContestant = 0; numberOfContestant < 2*numberOfPairs; numberOfContestant++){
            int individualIdToCompete = rand.nextInt(individuals.size());
            contestants.add(individuals.get(individualIdToCompete));
            //System.out.println(individuals.get(individualIdToCompete).getFitness());
            individuals.remove(individuals.get(individualIdToCompete));
        }
        System.out.println();
        for(int i = 0; i < 2*numberOfPairs; i+=2){
            if(contestants.get(i).getFitness()<contestants.get(i+1).getFitness()){
                selectedIndividuals.add(contestants.get(i+1));
            }else{
                selectedIndividuals.add(contestants.get(i));
            }
        }

        return selectedIndividuals;
    }

    public static void main( String[] args ) {
        List<Individual> individuals = new ArrayList<Individual>();
        individuals.add(new Individual(35));
        individuals.add(new Individual(40));
        individuals.add(new Individual(45));
        individuals.add(new Individual(50));
        individuals.add(new Individual(55));

        CompetitionEmigrateStrategy competitionEmigrateStrategy = new CompetitionEmigrateStrategy();
        System.out.println("CompetitionEmigrateStrategy");
        for(Individual individual : competitionEmigrateStrategy.selectIndividuals(individuals)){
            System.out.println(individual.getFitness());
        }

    }

}
