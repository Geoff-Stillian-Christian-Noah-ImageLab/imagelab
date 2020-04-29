package sound;

/**
 * A single midi note.
 * @author Jody Paul
 * @version 1.2
 */
public class Note {
    // Apple-OSX-Midi-instrument:int associations
    /**Midi-instrument Program Number for Piano.*/
    public static final int Piano       =   1;
    /**Midi-instrument Program Number for ElecPiano.*/
    public static final int ElectPiano  =   4;
    /**Midi-instrument Program Number for Harpsichord.*/
    public static final int Harpsichord =   6;
    /**Midi-instrument Program Number for Vibes.*/
    public static final int Vibes       =  11;
    /**Midi-instrument Program Number for Organ.*/
    public static final int Organ       =  19;
    /**Midi-instrument Program Number for Accordian.*/
    public static final int Accordian   =  23;
    /**Midi-instrument Program Number for Banjo.*/
    public static final int Banjo       =  25;
    /**Midi-instrument Program Number for Pizzacatto.*/
    public static final int Pizzacatto  =  45;
    /**Midi-instrument Program Number for Violin.*/
    public static final int Violin      =  52;
    /**Midi-instrument Program Number for Trumpet.*/
    public static final int Trumpet     =  56;
    /**Midi-instrument Program Number for Trombone.*/
    public static final int Trombone    =  57;
    /**Midi-instrument Program Number for Violin2.*/
    public static final int Violin2     =  59;
    /**Midi-instrument Program Number for Violin3.*/
    public static final int Violin3     =  65;
    /**Midi-instrument Program Number for TenorSax.*/
    public static final int TenorSax    =  66;
    /**Midi-instrument Program Number for Flute.*/
    public static final int Flute       =  73;
    /**Midi-instrument Program Number for PanFlute.*/
    public static final int PanFlute    =  75;
    /**Midi-instrument Program Number for Piano1.*/
    public static final int Piano1      =  80;
    /**Midi-instrument Program Number for SynVoice.*/
    public static final int SynVoice    =  85;
    /**Midi-instrument Program Number for BassDrum.*/
    public static final int BassDrum    = 116;
    /**Midi-instrument Program Number for MelodicTom.*/
    public static final int MelodicTom  = 117;
    /**Midi-instrument Program Number for SnareDrum.*/
    public static final int SnareDrum   = 120;
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
