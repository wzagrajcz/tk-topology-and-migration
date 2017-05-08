package pl.edu.agh.iisg.toik.topology;

import java.util.*;

abstract class AbstractTopology {
    protected Map<String, List<String>> getEmptyTopology(List<String> agentList){
        Map<String, List<String>> topology = new HashMap<String, List<String>>();

        for (String agent : agentList) {
            topology.put(agent, new ArrayList<String>());
        }

        return topology;
    }
}
