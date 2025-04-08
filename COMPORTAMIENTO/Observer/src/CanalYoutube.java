import java.util.ArrayList;
import java.util.List;

public class CanalYoutube {
    private List<Subscriber> subscribers = new ArrayList<>();
private String channelName;

public CanalYoutube(String channelName) {
    this.channelName = channelName;
}

public void subscribe(Subscriber subscriber) {
    subscribers.add(subscriber);
}

public void unsubscribe(Subscriber subscriber) {
    subscribers.remove(subscriber);
}

public void uploadVideo(String videoTitle) {
    System.out.println("\n" + channelName + " subio un nuevo video: " + videoTitle);
    notifySubscribers(videoTitle);
}

private void notifySubscribers(String videoTitle) {
    for (Subscriber subscriber : subscribers) {
        subscriber.Update(videoTitle);
    }
}
}
