package individualproject1;

/**
 * @author Nadia Konadu Afriyie
 *
 */

public class Airlines {

    /**
     * @param args
     */

    /**
     * Instance variables/Fields
     */

    private String airlineID;
    private String name;
    private String alias;
    private String IATACode;
    private String ICAOCode;
    private String callSign;
    private String country;
    private String active;

    /**
     * Constructor:
     * Building an object of class Music
     * @param airlineID
     * @param name
     * @param alias
     * @param IATACode
     * @param ICAOCode
     * @param callSign
     * @param country
     * @param active
     */

    public Airlines(String airlineID, String name,
                    String alias, String IATACode,
                    String ICAOCode, String callSign,
                    String country, String active) {
        this.airlineID = airlineID;
        this.name = name;
        this.alias = alias;
        this.IATACode = IATACode;
        this.ICAOCode = ICAOCode;
        this.callSign = callSign;
        this.country = country;
        this.active = active;
    }
    /**
     * accessor method for airlineID
     * @return
     */

    public String getAirlineID() {
        return airlineID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public String getIATACode() {
        return IATACode;
    }

    public void setIATACode(String iATACode) {
        this.IATACode = iATACode;
    }

    public String getICAOCode() {
        return ICAOCode;
    }

    public void setICAOCode(String iCAOCode) {
        this.ICAOCode = iCAOCode;
    }

    public String getCallSign() {
        return callSign;
    }

    public void setCallSign(String callSign) {
        this.callSign = callSign;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getActive() {
        return active;
    }

    public void setActive(String active) {
        this.active = active;
    }

    public String toString() {
        return null;
    }

    public static void main(String[] args){

    }
}
