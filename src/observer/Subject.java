package observer;

import observer.models.City;

public interface Subject {
    void subscribe(City city, EventListener observer);
    void unsubscribe(City city, EventListener observer);
    void notify(City city, String message);
}
