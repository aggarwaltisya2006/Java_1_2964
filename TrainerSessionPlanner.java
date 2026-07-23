package DAY13;

class Session {
    String topic;
    String duration;
    String trainer;
    String room;

    // Complete constructor
    Session(String topic, String duration, String trainer, String room) {
        this.topic = topic;
        this.duration = duration;
        this.trainer = trainer;
        this.room = room;
    }

    Session(String topic, String duration) {
        this(topic, duration, "TBD", "TBD");
    }

    Session(String topic) {
        this(topic, "TBD");
    }

    void displaySession() {
        System.out.println("SESSION DETAILS");
        System.out.println("Topic: " + topic);
        System.out.println("Duration: " + duration);
        System.out.println("Trainer: " + trainer);
        System.out.println("Room: " + room);
    }
}

public class TrainerSessionPlanner {
    public static void main(String[] args) {
        Session fullSession = new Session("Java Arrays", "2 hours", "Mahendra Yadav", "Lab 3");
        Session partialSession = new Session("Java Loops", "1 hour");
        Session minimalSession = new Session("Java Basics");

        System.out.println();
        fullSession.displaySession();
        System.out.println();
        partialSession.displaySession();
        System.out.println();
        minimalSession.displaySession();
    }
}
