package individualproject1;

/**
 * @author Nadia Konadu Afriyie
 *
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class FileReadAndWrite {

    /**
     * Constructor:
     * Building an object of class FileReadAndWrite
     */
    FileReadAndWrite(){}

    static HashMap<String, ArrayList<String>> map = new HashMap<String, ArrayList<String>>();
    static ArrayList<String> newAirlineValues = new ArrayList<String>();
    public static HashMap<String, ArrayList<String>> AirlineReadAndWrite() throws FileNotFoundException {
        /**This method reads from the airline csv file and splits each line at the comma,
        *appending the individual entries into an array, then creates a hashmap,
        *with
         */
        Scanner airlinesFile = new Scanner(new File("C:\\Users\\SWIFT 3\\OneDrive - Ashesi University\\Nadia\\Academic\\Year2\\Year 2 Sem 2\\Intermediate Computer Programming\\Java Code\\Airlines.csv"));

        while (airlinesFile.hasNext()) {
            String[] airlineArray = airlinesFile.nextLine().split(",");

            newAirlineValues.add(airlineArray[1]);
            newAirlineValues.add(airlineArray[2]);
            newAirlineValues.add(airlineArray[3]);

            //making the airlineID the key of the map, with an arraylist of the remaining entries the values
            map.put(airlineArray[0], newAirlineValues);

        }



        airlinesFile.close();
        return map;
    }

/*
Read and write method for airports class
* */
    static HashMap<String, ArrayList<String>> generalMap = new HashMap<String, ArrayList<String>>();
    static ArrayList<String> newAirportValues = new ArrayList<String>();
    static HashMap<String, String> cityAirportMap = new HashMap<String, String>();
    static String[] airportArray = new String[14];
    public static HashMap<String, ArrayList<String>> AirportReadAndWrite() throws FileNotFoundException {
        Scanner airportsFile = new Scanner(new File("C:\\Users\\SWIFT 3\\OneDrive - Ashesi University\\Nadia\\Academic\\Year2\\Year 2 Sem 2\\Intermediate Computer Programming\\Java Code\\Airports.csv"));


        while (airportsFile.hasNext()) {
            String[] airportArray = airportsFile.nextLine().split(",");
//            System.out.println(Arrays.toString(airportArray));
//            System.out.print(airportsFile.next());
//            Airports airportObj = new Airports(airportArray[0],airportArray[1],airportArray[2],airportArray[3],airportArray[4],airportArray[5],(Double.parseDouble(airportArray[6])),(Double.parseDouble(airportArray[7])),airportArray[8],airportArray[9],airportArray[10],airportArray[11],airportArray[12],airportArray[13]);

            newAirportValues.add(airportArray[0]);
            newAirportValues.add(airportArray[1]);
            newAirportValues.add(airportArray[4]);
            newAirportValues.add(airportArray[5]);
            newAirportValues.add(airportArray[6]);
            newAirportValues.add(airportArray[7]);
            newAirportValues.add(airportArray[8]);
            newAirportValues.add(airportArray[9]);
            newAirportValues.add(airportArray[10]);
            newAirportValues.add(airportArray[11]);
            newAirportValues.add(airportArray[12]);
            newAirportValues.add(airportArray[13]);


            generalMap.put(airportArray[2]+", "+airportArray[3], newAirportValues);
            ;

            cityAirportMap.put(airportArray[2]+", "+airportArray[3], newAirportValues.get(4));

        }

//        System.out.println(map.size());
//        System.out.println(Arrays.asList(map));
        System.out.println(generalMap);
        airportsFile.close();
        return generalMap;
    }


    /*/
    * file read and write method for routes class
    * */

    static HashMap<String, String[]> genericMap = new HashMap<String, String[]>();
    static HashMap<String, List<String>> startDestMap = new HashMap<String, List<String>>();
    static ArrayList<String> destAirports = new ArrayList<String>();
    static HashMap<String, ArrayList<Routes>> routeMap = new HashMap<String, ArrayList<Routes>>();
    static String[] routeArray;

    static String[] detailsArray = new String[10];
    public static HashMap<String, List<String>> RouteReadAndWrite() throws FileNotFoundException {
        Scanner routesFile = new Scanner(new File("C:\\Users\\SWIFT 3\\OneDrive - Ashesi University\\Nadia\\Academic\\Year2\\Year 2 Sem 2\\Intermediate Computer Programming\\Java Code\\Routes.csv"));


        while (routesFile.hasNext()) {
            String[] routeArray = routesFile.nextLine().split(",");
//            System.out.println(Arrays.toString(routeArray));
//            System.out.print(routesFile.next());

            Routes routeObj = new Routes(routeArray[0],routeArray[1],routeArray[4],routeArray[7]);

            //checking to see if the key is already in the hashmap
            ArrayList<Routes> newRoutesList = routeMap.get(routeArray);
            if (newRoutesList == null) {
                ArrayList<Routes> routeList = new ArrayList<Routes>();
                routeList.add(routeObj);
                routeMap.put(routeArray[2], routeList);
            }else{
                newRoutesList.add(routeObj);
                routeMap.put(routeArray[2], newRoutesList);
            }

            detailsArray[0] = routeArray[1];
            detailsArray[1] = routeArray[2];
            detailsArray[2] = routeArray[3];
            detailsArray[3] = routeArray[4];
            detailsArray[4] = routeArray[5];
            detailsArray[5] = routeArray[6];
            detailsArray[6] = routeArray[7];
            detailsArray[7] = routeArray[8];

            genericMap.put(routeArray[0], detailsArray);

            // putting start and destination airport ids into the map
            startDestMap.put(airportArray[0], destAirports);

            if(startDestMap.containsKey(detailsArray[2])){
                startDestMap.get(detailsArray[2]).add(detailsArray[4]);
            }
            else{
                destAirports = new ArrayList<String>();
                destAirports.add(detailsArray[4]);
                startDestMap.put(detailsArray[2], destAirports);

            }

        }

        System.out.println(startDestMap);

        routesFile.close();
        return startDestMap;
    }

    public static void main(String[] args) throws FileNotFoundException {
//        AirlineReadAndWrite();
        AirportReadAndWrite();
//        RouteReadAndWrite();
    }
}
