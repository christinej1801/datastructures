/* TODO - write the methods below.
 * TenCounter.java
 */

package hw1;

/** A counter for powers of 10. */
public class TenCounter implements ResetableCounter {

    int tCountVar;

    /** Construct a new TenCounter. */
    public TenCounter() {

        this.tCountVar = 1;
    }

    @Override
    public void reset() {

        this.tCountVar = 1;
    }

    @Override
    public int value() {

        return this.tCountVar;
    }

    /** Increase the value by a factor of 10.
     */
    public void up() {

        this.tCountVar = this.tCountVar * 10;
    }

    /** Decrease the value by a factor of 10, rounding up
        to the nearest integer. Do not go below 1.
     */
    public void down() {

        this.tCountVar = (int) Math.ceil(this.tCountVar / 10);

    }
}
