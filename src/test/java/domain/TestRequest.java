package domain;

import org.junit.Test;

import static org.fest.assertions.Assertions.assertThat;

/**
 * Created by fabricejeannet on 09/07/2016.
 */
public class TestRequest {

    @Test
    public void testDefaultUrl(){
        Request request = new Request();
        assertThat(request.url).isEqualTo(Request.BASE_URL);
    }

    @Test
    public void addsTheRightParameterForSeniorCompetitions(){
        Request request = new Request();
        request.senior();
        assertThat(request.url).contains(Request.CATEGORY + Request.SENIOR);
    }

    @Test
    public void addsTheRightParameterForJuniorCompetitions(){
        Request request = new Request();
        request.junior();
        assertThat(request.url).contains(Request.CATEGORY + Request.JUNIOR);
    }

    @Test
    public void addsTheRightParameterForCadetCompetitions(){
        Request request = new Request();
        request.cadet();
        assertThat(request.url).contains(Request.CATEGORY + Request.CADET);
    }

    @Test
    public void addsTheRightParameterForVeteranCompetitions(){
        Request request = new Request();
        request.veteran();
        assertThat(request.url).contains(Request.CATEGORY + Request.VETERAN);
    }

    @Test
    public void addsTheRightParameterForEpeeCompetitions(){
        Request request = new Request();
        request.epee();
        assertThat(request.url).contains(Request.WEAPON + Request.EPEE);
    }

    @Test
    public void addsTheRightParameterForFoilCompetitions(){
        Request request = new Request();
        request.foil();
        assertThat(request.url).contains(Request.WEAPON + Request.FOIL);
    }

    @Test
    public void addsTheRightParameterForSabreCompetitions(){
        Request request = new Request();
        request.sabre();
        assertThat(request.url).contains(Request.WEAPON + Request.SABRE);
    }


    @Test
    public void addsTheRightParameterForMenCompetitions(){
        Request request = new Request();
        request.men();
        assertThat(request.url).contains(Request.GENDER + Request.MEN);
    }

    @Test
    public void addsTheRightParameterForWomenCompetitions(){
        Request request = new Request();
        request.women();
        assertThat(request.url).contains(Request.GENDER + Request.WOMEN);
    }

    @Test
    public void addsTheRightParameterForIndividualCompetitions(){
        Request request = new Request();
        request.individual();
        assertThat(request.url).contains(Request.COMPETITION_TYPE + Request.INDIVIDUAL);
    }

    @Test
    public void addsTheRightParameterForTeamCompetitions(){
        Request request = new Request();
        request.team();
        assertThat(request.url).contains(Request.COMPETITION_TYPE + Request.TEAM);
    }

    @Test
    public void addsTheRightParameterForWorldChampionships(){
        Request request = new Request();
        request.worldChampionships();
        assertThat(request.url).contains(Request.COMPETITION_CAT + Request.WORLD_CHAMPIONSHIPS);
    }

    @Test
    public void addsTheRightParameterForGrandPrix(){
        Request request = new Request();
        request.grandPrix();
        assertThat(request.url).contains(Request.COMPETITION_CAT + Request.GRAND_PRIX);
    }

    @Test
    public void addsTheRightParameterForWorldCup(){
        Request request = new Request();
        request.worldCup();
        assertThat(request.url).contains(Request.COMPETITION_CAT + Request.WORLD_CUP);
    }

    @Test
    public void addsTheRightParameterForSatellite(){
        Request request = new Request();
        request.satellite();
        assertThat(request.url).contains(Request.COMPETITION_CAT + Request.SATELLITE);
    }

    @Test
    public void addsTheRightParameterForZoneChampionships(){
        Request request = new Request();
        request.zoneChampionships();
        assertThat(request.url).contains(Request.COMPETITION_CAT + Request.ZONE_CHAMPIONSHIPS);
    }

    @Test
    public void addsTheRightParameterForOfficial(){
        Request request = new Request();
        request.official();
        assertThat(request.url).contains(Request.COMPETITION_CAT + Request.OFFICIAL);
    }

    @Test
    public void addsTheRightParameterForNonOfficial(){
        Request request = new Request();
        request.nonOfficial();
        assertThat(request.url).contains(Request.COMPETITION_CAT + Request.NON_OFFICIAL);
    }

    @Test
    public void addsTheRightParameterForYear(){
        Request request = new Request();
        request.year(2016);
        assertThat(request.url).contains(Request.YEAR + "2016");
    }

    @Test
    public void addsTheRightParameterForCountryCode(){
        Request request = new Request();
        request.countryCode("FRA");
        assertThat(request.url).contains(Request.COUNTRY_CODE + "FRA");
    }

    @Test
    public void addsTheRightParameterForStartDate(){
        Request request = new Request();
        request.startDate("2016-01-01");
        assertThat(request.url).contains(Request.START_DATE + "2016-01-01");
    }

    @Test
    public void addsTheRightParameterForEndDate(){
        Request request = new Request();
        request.endDate("2016-01-01");
        assertThat(request.url).contains(Request.END_DATE + "2016-01-01");
    }
}
