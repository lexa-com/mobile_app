package test.example.betgurus;

public class Courses {

    // variables for storing our data.
    private String date, league, games, ko, predict, result, odds, logo, verdict;

    public Courses() {
        // empty constructor
        // required for Firebase.
    }

    // Constructor for all variables.
    public Courses(String verdict, String date, String league, String games, String ko, String predict, String result, String odds) {
        this.date = date;
        this.league = league;
        this.games = games;
        this.odds = odds;
        this.predict = predict;
        this.ko = ko;
        this.result = result;
        this.verdict = verdict;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getLeague() {
        return league;
    }

    public void setLeague(String league) {
        this.league = league;
    }

    public String getGames() {
        return games;
    }

    public void setGames(String games) {
        this.games = games;
    }

    public String getKo() {
        return ko;
    }

    public void setKo(String ko) {
        this.ko = ko;
    }

    public String getPredict() {
        return predict;
    }

    public void setPredict(String predict) {
        this.predict = predict;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public String getOdds() {
        return odds;
    }

    public void setOdds(String odds) {
        this.odds = odds;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public String getVerdict() {
        return verdict;
    }

    public void setVerdict(String verdict) {
        this.verdict = verdict;
    }
}