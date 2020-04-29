package sound;

/**
 * A single midi note.
 * @author Jody Paul
 * @version 1.2
 */
public class Note {
    // Apple-OSX-Midi-instrument:int associations
    /**Midi-instrument Program Number for PIANO.*/
    public static final int PIANO = 1;
    /**Midi-instrument Program Number for ELECPIANO.*/
    public static final int ELECPIANO  =   4;
    /**Midi-instrument Program Number for HARPSICHORD.*/
    public static final int HARPSICHORD =   6;
    /**Midi-instrument Program Number for VIBES.*/
    public static final int VIBES       =  11;
    /**Midi-instrument Program Number for ORGAN.*/
    public static final int ORGAN       =  19;
    /**Midi-instrument Program Number for ACCORDIAN.*/
    public static final int ACCORDIAN   =  23;
    /**Midi-instrument Program Number for BANJO.*/
    public static final int BANJO       =  25;
    /**Midi-instrument Program Number for PIZZACATTO.*/
    public static final int PIZZACATTO  =  45;
    /**Midi-instrument Program Number for VIOLIN.*/
    public static final int VIOLIN      =  52;
    /**Midi-instrument Program Number for TRUMPET.*/
    public static final int TRUMPET     =  56;
    /**Midi-instrument Program Number for TROMBONE.*/
    public static final int TROMBONE    =  57;
    /**Midi-instrument Program Number for VIOLIN2.*/
    public static final int VIOLIN2     =  59;
    /**Midi-instrument Program Number for VIOLIN3.*/
    public static final int VIOLIN3     =  65;
    /**Midi-instrument Program Number for TENORSAX.*/
    public static final int TENORSAX    =  66;
    /**Midi-instrument Program Number for FLUTE.*/
    public static final int FLUTE       =  73;
    /**Midi-instrument Program Number for PANFLUTE.*/
    public static final int PANFLUTE    =  75;
    /**Midi-instrument Program Number for PIANO1.*/
    public static final int PIANO1      =  80;
    /**Midi-instrument Program Number for SYNVOICE.*/
    public static final int SYNVOICE    =  85;
    /**Midi-instrument Program Number for BASSDRUM.*/
    public static final int BASSDRUM    = 116;
    /**Midi-instrument Program Number for MELODICTOM.*/
    public static final int MELODICTOM  = 117;
    /**Midi-instrument Program Number for SNAREDRUM.*/
    public static final int SNAREDRUM   = 120;
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
