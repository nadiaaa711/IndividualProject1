package individualproject1;

/**
 * @author Nadia Konadu Afriyie
 *
 */

import java.util.Objects;

public class Node {

    /**
     * @param args
     */

    /**
     * Instance variables/Fields
     */

    private String airportCode;
    private Node parent;
    private String airlineCode;
    private int stops;

    public Node(Node parent, String airportCode, String airlineCode, int stops) {
        this.airportCode = airportCode;
        this.parent = parent;
        this.airlineCode = airlineCode;
        this.stops = stops;
    }

    public String getAirportCode() {
        return airportCode;
    }

    public void setAirportCode(String airportCode) {
        this.airportCode = airportCode;
    }

    public Node getParent() {
        return parent;
    }

    public void setParent(Node parent) {
        this.parent = parent;
    }

    public String getAirlineCode() {
        return airlineCode;
    }

    public void setAirlineCode(String airlineCode) {
        this.airlineCode = airlineCode;
    }

    public int getStops() {
        return stops;
    }

    public void setStops(int stops) {
        this.stops = stops;
    }

    public String toString(){
        return null;
    }

    public String solutionPath(String child){
        return null;
    }

}
