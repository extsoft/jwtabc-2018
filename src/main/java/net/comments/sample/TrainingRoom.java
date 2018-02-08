package net.comments.sample;

/**
 * @author Dmytro Serdiuk (dmytro.serdiuk@gmail.com)
 * @version $Id$
 * @since ?????
 */
public class TrainingRoom implements Room {

    private final String number;

    public TrainingRoom(String number) {
        this.number = number;
    }

    public void accept(Person person) {
        System.out.println(person.name() + " went into the training room #" + this.number);
    }
}
