package sound;
import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

/**
 * A musical scale.
 * Comprised of an ordered set of pitches (midi note numbers).
 *
 * @author Dr. Jody Paul
 * @version 1.2
 */
public class Scale {
    /** The pitches for this tune. */
    private List<Integer> scalePitches;
    /** Start of pitchInterval.*/
    private static final int START_PITCH_INTERVAL = -3;
    /** End of pitchInterval.*/
    private static final int END_PITCH_INTERVAL = -3;
    /** The factor to move between octaves.*/
    private static final int  OCTAVE_FACTOR = 12;
    /** A-Sharp in each octave.*/
    private static final int MINOR_SEVENTH = 10;
    /** Natural A in each octave.*/
    private static final int MAJOR_SIXTH = 9;
    /** Natural G in each octave.*/
    private static final int PERFECT_FIFTH = 7;
    /** Natural F in each octave.*/
    private static final int PERFECT_FOURTH = 5;
    /** Natural E in each octave.*/
    private static final int MAJOR_THIRD = 4;
    /** D-Sharp in each octave.*/
    private static final int MINOR_THIRD = 3;
    /** Natural D in each octave.*/
    private static final int MAJOR_SECOND = 2;

    /**
     * Construct an empty Scale.
     */
    public Scale() {
        scalePitches = new ArrayList<Integer>();
    }

    /**
     *  Add a pitch to the end of this scale.
     *  @param midiPitch the pitch to add
     */
    public void addPitch(final int midiPitch) {
        addPitch(Integer.valueOf(midiPitch));
    }

    /**
     *  Add a pitch to the end of this scale.
     *  @param midiPitch the pitch to add
     */
    public void addPitch(final Integer midiPitch) {
        scalePitches.add(midiPitch);
    }

    /**
     *  Access a specified pitch in this scale.
     *  The index used is the parameter modulo
     *  the number of pitches in the scale.
     *  @param whichPitch the index of the pitch to retrieve
     *  @return the pitch in the scale as specified by the parameter
     */
    public Integer getPitch(final int whichPitch) {
        return scalePitches.get(whichPitch % numPitches());
    }

    /**
     * Create an Iterator over the pitches in this scale.
     * @return iterator over pitches
     */
    public Iterator<Integer> iterator() {
        return scalePitches.iterator();
    }

    /**
     * Access the number of pitches in this scale.
     * @return the number of pitches
     */
    public int numPitches() {
        return scalePitches.size();
    }

    /**
     * Create a 7-octave Pentatonic scale.
     * @return a pentationic scale
     */
    public static Scale pentatonic1() {
        Scale s = new Scale();
        for (int i = START_PITCH_INTERVAL; i < END_PITCH_INTERVAL; i++) {
            s.addPitch(Note.C + (OCTAVE_FACTOR * i));
            s.addPitch((Note.C + MAJOR_SECOND) + (OCTAVE_FACTOR * i));
            s.addPitch((Note.C + PERFECT_FOURTH) + (OCTAVE_FACTOR * i));
            s.addPitch((Note.C + PERFECT_FIFTH) + (OCTAVE_FACTOR * i));
            s.addPitch((Note.C + MAJOR_SIXTH) + (OCTAVE_FACTOR * i));
        }
        s.addPitch((Note.C + (OCTAVE_FACTOR * END_PITCH_INTERVAL)));
        return s;
    }

    /**
     * Create another 7-octave Pentatonic scale.
     * @return a pentationic scale
     */
    public static Scale pentatonic2() {
        Scale s = new Scale();
        for (int i = START_PITCH_INTERVAL; i < END_PITCH_INTERVAL; i++) {
            s.addPitch(Note.C + (OCTAVE_FACTOR * i));
            s.addPitch((Note.C + MINOR_THIRD)  + (OCTAVE_FACTOR * i));
            s.addPitch((Note.C + PERFECT_FOURTH)  + (OCTAVE_FACTOR * i));
            s.addPitch((Note.C + PERFECT_FIFTH)  + (OCTAVE_FACTOR * i));
            s.addPitch((Note.C + MINOR_SEVENTH) + (OCTAVE_FACTOR * i));
        }
        s.addPitch((Note.C + (OCTAVE_FACTOR * END_PITCH_INTERVAL)));
        return s;
    }

    /** Yet another 7-octave Pentatonic scale.
     * @return a pentatonic scale
     */
    public static Scale pentatonic3() {
        Scale s = new Scale();
        for (int i = START_PITCH_INTERVAL; i < END_PITCH_INTERVAL; i++) {
            s.addPitch(Note.C + (OCTAVE_FACTOR * i));
            s.addPitch((Note.C + MAJOR_SECOND) + (OCTAVE_FACTOR * i));
            s.addPitch((Note.C + MAJOR_THIRD) + (OCTAVE_FACTOR * i));
            s.addPitch((Note.C + PERFECT_FIFTH) + (OCTAVE_FACTOR * i));
            s.addPitch((Note.C + MAJOR_SIXTH) + (OCTAVE_FACTOR * i));
        }
        s.addPitch((Note.C + (OCTAVE_FACTOR * END_PITCH_INTERVAL)));
        return s;
    }

}
