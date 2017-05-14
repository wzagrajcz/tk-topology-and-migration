package pl.edu.agh.iisg.toik.mocks;


public class Individual {
    //jeszcze jakies parametry nas interesuja?
    int fitness;

    public Individual(int fitness){
        this.fitness = fitness;
    }

    public int getFitness() {
        return fitness;
    }

    public void setFitness(int fitness) {
        this.fitness = fitness;
    }

}
