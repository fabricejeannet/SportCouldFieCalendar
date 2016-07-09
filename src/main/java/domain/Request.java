package domain;


/**
 * Created by fabricejeannet on 09/07/2016.
 */
public class Request {
    public void senior(){
        addParameter(CATEGORY, SENIOR);
    }

    public void junior() {
        addParameter(CATEGORY, JUNIOR);
    }

    public void cadet() {
        addParameter(CATEGORY, CADET);
    }

    public void veteran() {
        addParameter(CATEGORY, VETERAN);
    }

    public void epee() {
        addParameter(WEAPON, EPEE);
    }

    public void foil() {
        addParameter(WEAPON, FOIL);
    }

    public void sabre() {
        addParameter(WEAPON, SABRE);
    }

    public void men() {
        addParameter(GENDER, MEN);
    }

    public void women() {
        addParameter(GENDER, WOMEN);
    }

    public void individual() {
        addParameter(COMPETITION_TYPE, INDIVIDUAL);
    }

    public void team() {
        addParameter(COMPETITION_TYPE, TEAM);
    }

    public void worldChampionships() {
        addParameter(COMPETITION_CAT, WORLD_CHAMPIONSHIPS);
    }

    public void grandPrix() {
        addParameter(COMPETITION_CAT, GRAND_PRIX);
    }

    public void worldCup() {
        addParameter(COMPETITION_CAT, WORLD_CUP);
    }

    public void satellite() {
        addParameter(COMPETITION_CAT, SATELLITE);
    }

    public void zoneChampionships() {
        addParameter(COMPETITION_CAT, ZONE_CHAMPIONSHIPS);
    }

    public void official() {
        addParameter(COMPETITION_CAT, OFFICIAL);
    }

    public void nonOfficial() {
        addParameter(COMPETITION_CAT, NON_OFFICIAL);
    }

    public void year(int year) {
        addParameter(YEAR, "" + year);
    }

    public void countryCode(String countryCode) {
        addParameter(COUNTRY_CODE, countryCode);
    }

    public void startDate(String startDate) {
        addParameter(START_DATE, startDate);
    }

    public void endDate(String endDate) {
        addParameter(END_DATE, endDate);
    }

    private void addParameter(String param, String value){
        if(!url.endsWith("?") && !url.endsWith("&")){
            url = url.concat("&");
        }
        url = url.concat(param);
        url = url.concat(value);
    }


    public String url= BASE_URL;

    public final static String BASE_URL = "http://fie.org/results-statistic/result?";
    public final static String CATEGORY= "calendar_models_CalendarsCompetition%5BFencCatId%5D=";
    public final static String WEAPON = "calendar_models_CalendarsCompetition%5BWeaponId%5D=";
    public final static String GENDER = "calendar_models_CalendarsCompetition%5BGenderId%5D=";
    public final static String COMPETITION_TYPE = "calendar_models_CalendarsCompetition%5BCompTypeId%5D=";
    public final static String COMPETITION_CAT = "calendar_models_CalendarsCompetition%5BCompCatId%5D=";
    public final static String YEAR = "calendar_models_CalendarsCompetition%5BCPYear%5D=";
    public final static String COUNTRY_CODE = "calendar_models_CalendarsCompetition%5BFedId%5D=";
    public final static String START_DATE = "calendar_models_CalendarsCompetition%5BDateBegin%5D=";
    public static final String END_DATE = "calendar_models_CalendarsCompetition%5BDateEnd%5D=";

    public static final String WORLD_CHAMPIONSHIPS = "CHM";
    public static final String GRAND_PRIX = "GP";
    public static final String WORLD_CUP = "A";
    public static final String SATELLITE = "SA";
    public static final String ZONE_CHAMPIONSHIPS = "CHZ";
    public static final String OFFICIAL = "OF";
    public static final String NON_OFFICIAL = "NF";

    public static final String INDIVIDUAL = "I";
    public static final String TEAM = "T";

    public static final String MEN = "M";
    public static final String WOMEN = "F";

    public static final String EPEE = "E";
    public static final String FOIL = "F";
    public static final String SABRE = "S";

    public final static String SENIOR= "S";
    public static final String JUNIOR = "J";
    public static final String CADET = "C";
    public static final String VETERAN = "V";

}
