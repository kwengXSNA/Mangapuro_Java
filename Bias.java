public class Bias implements Interface {
    String screen_name, band, nickname;
    int jersey_number;
    String queeing = "Christina Mangauro";

    //setter and getter in encapsulation
    public void setScreenName(String screen_name) {
        this.screen_name = screen_name;
    }

    public String getScreenName() {
        return screen_name;
    }

    public void setBand(String band){
        this.band = band;
    }

    public String getBand(){
        return band;
    }

    public void setNickname(String nickname){
        this.nickname = nickname;
    }

    public String getNickname(){
        return nickname;
    }

    public void setJerseyNumber (int jersey_number) {
        this.jersey_number = jersey_number;
    } 

    public int getJerseyNumber() {
        return jersey_number;
    } 

    //Java Constructors
    public Bias(){
        System.out.println("Yā. Kurisutīna Mangapuro no Java akutibitidesu.!");
    }

    //Java Constructors with Parameters
    public Bias(String screen_name, String band, String nickname, int jersey_number){
        this.screen_name = screen_name;
        this.band = band;
        this.nickname = nickname;
        this.jersey_number = jersey_number;
    }

    public void show (){
        System.out.println("Inside the method of the parent class");
        System.out.println("Inside the method of the parent class");
    }

}

