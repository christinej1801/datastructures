/* TODO - write the methods below.
 * FlexibleCounter.java
 */

package hw1;

/** Class for a counter with flexible starting and incrementing values. */
public class FlexibleCounter implements ResetableCounter {

    /**
     * Construct a new FlexibleCounter.
     * @param initialValue The value to start at.
     * @param incrementValue The value to increment the counter by.
     * @throws IllegalArgumentException If incrementValue is negative.
     */
    private int counterVal;
    private int initialVal;
    private int incrementVal;

    public FlexibleCounter(int initialValue, int incrementValue) {
        if (incrementValue < 0) {
            throw new IllegalArgumentException();
        }
        this.initialVal = initialValue;
        this.counterVal = this.initialVal;
        this.incrementVal = incrementValue;

    }

    @Override
    public void reset() {
        this.counterVal = this.initialVal;
    }

    @Override
    public int value() {
        return this.counterVal;
    }

    @Override
    public void up() {
        this.counterVal += incrementVal;

    }

    @Override
    public void down() {
        this.counterVal -= incrementVal;

    }
}
