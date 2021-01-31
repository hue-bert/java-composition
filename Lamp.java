/*
 * Composition has a similar idea to Inheritance such that there are relations between Classes but the overall concept
 * is very different. Inheritance has a parent and child relationship, whereas Composition has a central Class that
 * does not have relationships with its' partner Classes aside from borrow those partner's methods and variables.
 *
 * An example of Inheritance. Animal (parent of Mammals) -> Mammals (parent of Dog/ child of Animal) -> Dog (child of Mammal)
 *
 * An example of Composition.
 * -> Computer (central Class)
 * -> Motherboard (partner Class of Computer Class)
 * -> Ram (partner Class of Computer Class)
 * -> Case (partner Class of Computer Class)
 * **Notice Motherboard, Ram and Case are not children of Computer, they do not share the traits of Computer, these Classes
 *   are simply the components of Computer (Computer's 'composition')
 *
 * The program below is an example of Tim's composition of a room.
 */


// Main Class

// Room Class

// Wall Class

// Ceiling Class

// Bed Class

// Lamp Class

public class Lamp {
    private String style;
    private boolean battery;
    private int globRating;

    public String getStyle() {
        return style;
    }

    public void turnOn() {
        System.out.println("Lamp -> Turning on");
    }

    public boolean isBattery() {
        return battery;
    }

    public int getGlobRating() {
        return globRating;
    }

    public Lamp(String style, boolean battery, int globRating) {
        this.style = style;
        this.battery = battery;
        this.globRating = globRating;
    }
}
