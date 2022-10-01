package individualproject1;

/**
 * @author Nadia Konadu Afriyie
 *
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Airports {

    /**
     * @param args
     */

    /**
     * Instance variables/Fields
     */

    private String airportID;
    private String name;
    private String city;
    private String country;
    private String IATACode;
    private String ICAOCode;
    private double latitude;
    private double longitude;
    private String altitude;
    private String timezone;
    private String dST;
    private String tzDTZ;
    private String type;
    private String dataSource;

//    public Airports(String airportID, String name,
//                    String city, String country,
//                    String IATACode, String ICAOCode,
//                    double latitude, double longitude,
//                    String altitude, String timezone,
//                    String dST, String tzDTZ,
//                    String type, String dataSource){
//        this.airportID = airportID;
//        this.name = name;
//        this.city = city;
//        this.country = country;
//        this.IATACode = IATACode;
//        this.ICAOCode = ICAOCode;
//        this.latitude = latitude;
//        this.longitude = longitude;
//        this.altitude = altitude;
//        this.timezone = timezone;
//        this.dST = dST;
//        this.tzDTZ = tzDTZ;
//        this.type = type;
//        this.dataSource = dataSource;
//    }

    /**
     * accessor method for AirportID
     * @return
     */
    public String getAirportID() {
        return airportID;
    }

    public void setAirportID(String airportID) {
        this.airportID = airportID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getIATACode() {
        return IATACode;
    }

    public void setIATACode(String IATACode) {
        this.IATACode = IATACode;
    }

    public String getICAOCode() {
        return ICAOCode;
    }

    public void setICAOCode(String ICAOCode) {
        this.ICAOCode = ICAOCode;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public String getAltitude() {
        return altitude;
    }

    public void setAltitude(String altitude) {
        this.altitude = altitude;
    }

    public String getTimezone() {
        return timezone;
    }

    public void setTimezone(String timezone) {
        this.timezone = timezone;
    }

    public String getdST() {
        return dST;
    }

    public void setdST(String dST) {
        this.dST = dST;
    }

    public String getTzDTZ() {
        return tzDTZ;
    }

    public void setTzDTZ(String tzDTZ) {
        this.tzDTZ = tzDTZ;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDataSource() {
        return dataSource;
    }

    public void setDataSource(String dataSource) {
        this.dataSource = dataSource;
    }

    public static void main(String[] args) throws FileNotFoundException {


    }
}
