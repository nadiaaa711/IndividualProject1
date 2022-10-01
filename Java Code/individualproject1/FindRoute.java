package individualproject1;

/**
 * @author Nadia Konadu Afriyie
 *
 */

import java.io.FileNotFoundException;
import java.util.*;

public class FindRoute {

//    @Override
//    public boolean equals(Node stateNode) {
//        return super.equals(stateNode);
//    }

    public static String breadthFirstSearch(String startState, String goalState) throws FileNotFoundException {
        System.out.println("Performing a Breadth First Search");

//        FileReadAndWrite b = new FileReadAndWrite();

//        Node stateNode = new Node();

//        if (stateNode.equals(goalState))
//            return "We have found the goal state:";

        Queue<Node> frontierQueue = new LinkedList<>();
        HashSet<String> exploredSet = new HashSet<String>();

        HashMap<String, ArrayList<String>> generalMap = FileReadAndWrite.AirlineReadAndWrite();

        ArrayList<String> airportCodesList = generalMap.get(startState);

        //loop through airport codes, add
        for (String airportCodes : airportCodesList) {
            frontierQueue.add(new Node(null,airportCodes, null, 0));

            while (frontierQueue.size() > 0) {
                Node stateNode = frontierQueue.remove();
                exploredSet.add(stateNode.getAirportCode());
                System.out.println("Popped node" + stateNode);

                ArrayList<Routes> actions = FileReadAndWrite.routeMap.get(stateNode.getAirportCode());

                for(Routes action: actions){
                    Node nodeObj = new Node(stateNode, action.getDestinationAirportCode(), action.getAirlineCode(),action.getStops());
                }
            }


            return null;
        }
        return null;
    }


    public static void main(String[] args) {
//        breadthFirstSearch();
    }

}
