package observer;

import observer.models.City;
import observer.models.Person;

public class Observer implements EventListener {
    private Person person;

    public Observer(){
    }

    public Observer(Person person) {
        this.person = person;
    }


    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }


    @Override
    public void update(City city, String weatherUpdate) {
        sendEmail(city, weatherUpdate);
    }

    public void sendEmail(City city, String weatherUpdate){
        System.out.println("Today in " + city.toString() + " will be " + weatherUpdate);
    }
}
