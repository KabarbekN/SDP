package observer;

import observer.models.City;

public interface  EventListener {
    void update(City city, String weatherUpdate);
}
