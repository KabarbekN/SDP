package observer;

import observer.models.City;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EventManager implements Subject{
    private Map<City, List<EventListener>> listeners;

    public EventManager(){
        listeners = new HashMap<>();
        this.listeners.put(new City(), new ArrayList<>());
    }
    @Override
    public void subscribe(City city, EventListener observer){
//        listeners.computeIfAbsent(city, k -> new ArrayList<>()).add(observer);
        if (!listeners.containsKey(city)) {
            listeners.put(city, new ArrayList<>());
        }
        listeners.get(city).add(observer);
    }
    @Override
    public void unsubscribe(City city, EventListener observer){
        List<EventListener> existListeners = listeners.get(city);
        if (existListeners != null) {
            existListeners.remove(observer);
        }
    }
    @Override
    public void notify(City city, String message){
        List<EventListener> existListeners = listeners.get(city);
        if (existListeners != null) {
            for (EventListener eventListener : existListeners) {
                eventListener.update(city, message);
            }
        }
    }
}
