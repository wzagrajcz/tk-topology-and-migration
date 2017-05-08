package pl.edu.agh.iisg.toik.migration;

import pl.edu.agh.iisg.toik.mocks.Individual;

import java.util.ArrayList;
import java.util.List;

public class BinaryEmigrateStrategy implements EmigrateStrategy {

    public List<Individual> selectIndividuals(List<Individual> individuals) {
        List<Individual> individualList = new ArrayList<Individual>();
        for(int i = 0; i < individualList.size(); i++){
            if(i%2 == 0){
                individualList.add(individuals.get(i));
            }
        }
        return individualList;
    }
}
