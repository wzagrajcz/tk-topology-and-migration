package pl.edu.agh.iisg.toik.topology;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class StarTopology extends AbstractTopology implements Topology {

    private Map<String, List<String>> topology;

    public StarTopology(List<String> actorsNames){
        this.topology = getEmptyTopology(actorsNames);

        String root = actorsNames.get(0);
        List<String> neigthbours = topology.get(root);

        for(int idx = 1; idx < actorsNames.size(); idx++) {
            String neightbourName = actorsNames.get(idx);
            neigthbours.add(neightbourName);
            topology.get(neightbourName).add(root);
        }
    }

    void printTopology(){
        for (String agent : this.topology.keySet()) {
            System.out.println(agent + " -> " + Arrays.toString(this.topology.get(agent).toArray()));
        }
    }

    public List<String> getNeightbours(String name) {
        return this.topology.get(name);
    }

//    public static void main(String[] args) {
//        StarTopology tp = new StarTopology(Arrays.asList("a", "b", "c", "d", "e", "f"));
//        tp.printTopology();
//    }
}
