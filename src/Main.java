import decorator.BasicSecuritySystem;
import decorator.FirewallDecorator;
import decorator.IntrusionDetectionDecorator;
import decorator.SecuritySystem;
import observer.models.City;
import observer.EventManager;
import observer.Observer;
import observer.models.Person;
import strategy2.EmailNotificationStrategy;
import strategy2.NotificationStrategy;
import strategy2.Notifier;
import strategy2.SMSNotificationStrategy;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

//        Sorter sorter = new Sorter();
//
//        int[] array = {9, 8, 7, 6 , 5 , 4 , -20 , 42, 56};
//
//        sorter.setSortingStrategy(new BubbleSortStrategy());
//
//        for (int i: array){
//            System.out.print(i + " ");
//        }
//        System.out.println();
//        sorter.performSort(array, Constants.ASC);
//
//        for (int i: array){
//            System.out.print(i + " ");
//        }
//        System.out.println();
//        sorter.performSort(array, Constants.DESC);
//        for (int i: array){
//            System.out.print(i + " ");
//        }


//        EventManager eventManager = new EventManager();
//
//        Observer observer = new Observer(new Person("Nurgissa", "nkabarbek@gmail.com", "+777626284156"));
//        Observer observer1 = new Observer(new Person("Asan", "nkabarbek@gmail.com", "+777626284156"));
//        Observer observer2 = new Observer(new Person("Olzhas", "nkabarbek@gmail.com", "+777626284156"));
//        City taraz = new City("Taraz", "Hot");
//        City almaty = new City("Almaty", "Sunny");
//        eventManager.subscribe(taraz, observer1);
//        eventManager.subscribe(almaty, observer1);
//
//        eventManager.subscribe(taraz, observer2);
//        eventManager.subscribe(taraz, observer);
//
//        eventManager.notify(taraz, "Its a message for taraz");
//
//        eventManager.notify(almaty, " for almaty");

//        Notifier notifier = new Notifier();
//
//        NotificationStrategy smsNotificationStrategy = new SMSNotificationStrategy();
//        notifier.setNotificationStrategy(smsNotificationStrategy);
//        notifier.makeNotification("+7776628454", "Hello");
//
//        NotificationStrategy emailNotificationStrategy = new EmailNotificationStrategy();
//        notifier.setNotificationStrategy(emailNotificationStrategy);
//        notifier.makeNotification("nkabarbek", " jdshfkjsdjfn");
//
        SecuritySystem basicSecuritySystem = new BasicSecuritySystem();

        // Decorate the basic security system with additional security layers
        SecuritySystem firewallSecuritySystem = new FirewallDecorator(basicSecuritySystem);
        SecuritySystem intrusionDetectionSystem = new IntrusionDetectionDecorator(basicSecuritySystem);

        System.out.println("Activating and deactivating Basic Security System:");
        basicSecuritySystem.activate();
        basicSecuritySystem.deactivate();

        System.out.println("\nActivating and deactivating Security System with Firewall:");
        firewallSecuritySystem.activate();
        firewallSecuritySystem.deactivate();

        System.out.println("\nActivating and deactivating Security System with Intrusion Detection:");
        intrusionDetectionSystem.activate();
        intrusionDetectionSystem.deactivate();

    }
}