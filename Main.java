public class Main {
    public static void main(String[] tines) {

        //instantiate bias class
        Bias a = new Bias();
        Bias constructor = new Bias("Chanyeol", "EXO","HappyVirus",61);
        
        //setting and displaying the values of the variables thru the set and get methods
        a.setScreenName("Chanyeol");
        a.setNickname("HappyVirus");
        a.setBand("EXO");
        a.setJerseyNumber(61);

        System.out.println("Name: " + a.getScreenName());
        System.out.println("Band: " + a.getBand());
        System.out.println("Nickame: " + a.getNickname());
        System.out.println("Jersey: " + a.getJerseyNumber());

        //constructor with parameter
        System.out.println("Name: " + constructor.screen_name);
        System.out.println("Band: " + constructor.band);
        System.out.println("Nickame: " + constructor.nickname);
        System.out.println("Jersey: " + constructor.jersey_number);

        //instantiation: inheritance
        student s = new student();
        System.out.println("I am " + s.queeing);

        //parent class override
        Bias a = new Bias;
        a.show();

        //child class override
        Bias a2 = new Wrecker();
        a2.show();

    } 
} 
