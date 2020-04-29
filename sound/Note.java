package sound;

/**
 * A single midi note.
 * @author Jody Paul
 * @version 1.2
 */
public class Note {
    // Apple-OSX-Midi-instrument:int associations
    /**Midi-instrument Program Number for piano.*/
    public static final int piano = 1;
    /**Midi-instrument Program Number for elecPiano.*/
    public static final int electPiano  =   4;
    /**Midi-instrument Program Number for harpsichord.*/
    public static final int harpsichord =   6;
    /**Midi-instrument Program Number for vibes.*/
    public static final int vibes       =  11;
    /**Midi-instrument Program Number for organ.*/
    public static final int organ       =  19;
    /**Midi-instrument Program Number for accordian.*/
    public static final int accordian   =  23;
    /**Midi-instrument Program Number for banjo.*/
    public static final int banjo       =  25;
    /**Midi-instrument Program Number for pizzacatto.*/
    public static final int pizzacatto  =  45;
    /**Midi-instrument Program Number for violin.*/
    public static final int violin      =  52;
    /**Midi-instrument Program Number for trumpet.*/
    public static final int trumpet     =  56;
    /**Midi-instrument Program Number for trombone.*/
    public static final int trombone    =  57;
    /**Midi-instrument Program Number for violin2.*/
    public static final int violin2     =  59;
    /**Midi-instrument Program Number for violin3.*/
    public static final int violin3     =  65;
    /**Midi-instrument Program Number for tenorSax.*/
    public static final int tenorSax    =  66;
    /**Midi-instrument Program Number for flute.*/
    public static final int flute       =  73;
    /**Midi-instrument Program Number for panFlute.*/
    public static final int panFlute    =  75;
    /**Midi-instrument Program Number for piano1.*/
    public static final int piano1      =  80;
    /**Midi-instrument Program Number for synVoice.*/
    public static final int synVoice    =  85;
    /**Midi-instrument Program Number for bassDrum.*/
    public static final int bassDrum    = 116;
    /**Midi-instrument Program Number for melodicTom.*/
    public static final int melodicTom  = 117;
    /**Midi-instrument Program Number for snareDrum.*/
    public static final int snareDrum   = 120;
    /** Midi Note Middle-C.*/
    public static final int C  = 60;
    /** Midi Minimum Note Pitch.*/
    public static final int LOW = 25;
    /** Midi Maximum Note Pitch.*/
    public static final int HIGH = 120;
    /** Midi Note Pitch Range.*/
    public static final int RANGE = HIGH - LOW;
    /** Whole-Note Duration (in milliseconds).*/
    public static final int DW = 2400;
    /** Eighth-Note Duration (in milliseconds).*/
    public static final int DE = DW / 8;
    /** Quarter-Note Duration.*/
    public static final int DQ = DW / 4;
    /** Half-Note Duration.*/
    public static final int DH = DW / 2;
    /** Midi Minimum Note-On Velocity - Pianissimo.*/
    public static final int VPP = 25;
    /** Midi Maximum Note-On Velocity - Fortissimo.*/
    public static final int VFF = 120;
    /** Midi Note-On Velocity Range.*/
    public static final int VRANGE = VFF - VPP;
    /** Special Note that represents the Null Note.*/
    public static final Note NULL_NOTE = new Note(-1, -1, -1, -1);

    //Instance Data
    /**Midi channel through
     *which instrument will
     *be received.*/
    private int channel;    // 0 to 15
    /**The pitch of the note.*/
    private int pitch;      // 0 to 127; 60 = Middle C
    /**The duration of the note.*/
    private int duration;   // in milliseconds
    /**The audible range of the note.*/
    private int velocityOn; // 0 to 127 (Note-On Velocity)

    /**
     * Construct a specific Note.
     * @param c channel
     * @param p pitch
     * @param d duration
     * @param v velocityOn
     */
    public Note(final int c, final int p, final int d, final int v) {
        channel = c;
        pitch = p;
        duration = d;
        velocityOn = v;
    }
    /**
     * Construct a specific Note.
     * @param c channel
     * @param p pitch
     * @param d duration
     * @param v velocityOn
     */
    public Note(final int c, final Integer p, final int d, final int v) {
        channel = c;
        pitch = p.intValue();
        duration = d;
        velocityOn = v;
    }

    /**
     * Access this note's channel.
     * @return the channel
     */
    public int channel() {
        return channel;
    }

    /**
     * Access this note's pitch.
     * @return the pitch
     */
    public int pitch() {
        return pitch;
    }

    /**
     * Access this note's duration.
     * @return the channel
     */
    public int duration() {
        return duration;
    }

    /**
     * Access this note's velocity.
     * @return the velocity
     */
    public int velocityOn() {
        return velocityOn;
    }

    /**To string print method
     *for components of a Note.
     *@return toString for Note instance
     *variables.*/
    public String toString() {
        return "[Channel " + channel
         + "; Pitch " + pitch
         + "; Duration " + duration
         + "; velocityOn " + velocityOn + "]";
    }
}
