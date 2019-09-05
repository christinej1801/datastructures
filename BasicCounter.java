/* TODO - write the methods below.
 * BasicCounter.java
 */

package hw1;

/** A counter that increments and decrements by 1. */
public class BasicCounter implements ResetableCounter {

    private int counterVar;

    /** Construct a new BasicCounter. */
    public BasicCounter() {
        // TODO
        this.counterVar = 0;

    }

    @Override
    public void reset() {
        // TODO
        this.counterVar = 0;
    }

    @Override
    public int value() {
        // TODO
        return this.counterVar;
    }

    @Override
    public void up() {
        // TODO
        this.counterVar++;
    }

    @Override
    public void down() {
        // TODO
        this.counterVar--;
    }
}
