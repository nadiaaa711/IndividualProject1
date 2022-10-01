package individualproject1;

/**
 * @author Nadia Konadu Afriyie
 *
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Routes {

    /**
     * @param args
     */

    /**
     * Instance variables/Fields
     */

    private String airlineCode;
    private String airlineID;
    private String destinationAirportCode;
    private String stops;

    //constructor
    public Routes(String airlineCode, String airlineID,
                  String destinationAirportCode, String stops){
        this.airlineCode = airlineCode;
        this.airlineID = airlineID;

        this.destinationAirportCode = destinationAirportCode;

        this.stops = stops;

    }

    /**
     * accessor method for AirlineCode
     * @return
     */
    public String getAirlineCode() {
        return airlineCode;
    }

    public void setAirlineCode(String airlineCode) {
        this.airlineCode = airlineCode;
    }

    public String getAirlineID() {
        return airlineID;
    }

    public void setAirlineID(String airlineID) {
        this.airlineID = airlineID;
    }

    public String getDestinationAirportCode() {
        return destinationAirportCode;
    }

    public void setDestinationAirportCode(String destinationAirportCode) {
        this.destinationAirportCode = destinationAirportCode;
    }

    public String getStops() {
        return stops;
    }

    public static void main(String[] args) throws FileNotFoundException {

    }
}
