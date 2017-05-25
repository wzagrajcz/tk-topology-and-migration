package pl.edu.agh.iisg.toik.mocks;

import java.util.List;

public interface AlgorithmStep {

    void process(Agent agent, List<Individual> population);

}
