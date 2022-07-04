package p002;

public class WelcomeToTheCity {
    /*Create a method sayHello/say_hello/SayHello that takes as input a name, city, and state to
    welcome a person. Note that name will be an array consisting of one or more values that should be
    joined together with one space between each, and the length of the name array in test cases will vary.
    Example:
    sayHello(new String[]{"John", "Smith"}, "Phoenix", "Arizona")
    This example will return the string Hello, John Smith! Welcome to Phoenix, Arizona!*/
    public static void main(String[] args) {
        String[] name = {"John", "Smith", "qq"};

        System.out.println(sayHello(name, "Phoenix", "Arizona"));
    }

    public static String sayHello(String [] name, String city, String state){
        return String.format("Hello, %s! Welcome to %s, %s!", String.join(" ", name), city, state);
//        return "Hello, " + String.join(" ", name) + "!" + " Welcome to " + city  + ", "  + state + "!";
    }
}
