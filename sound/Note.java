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
    public final static int ElectPiano  =   4;
    /**Midi-instrument Program Number for Harpsichord.*/
    public final static int Harpsichord =   6;
    /**Midi-instrument Program Number for Vibes.*/
    public final static int Vibes       =  11;
    /**Midi-instrument Program Number for Organ.*/
    public final static int Organ       =  19;
    /**Midi-instrument Program Number for Accordian.*/
    public final static int Accordian   =  23;
    /**Midi-instrument Program Number for Banjo.*/
    public final static int Banjo       =  25;
    /**Midi-instrument Program Number for Pizzacatto.*/
    public final static int Pizzacatto  =  45;
    /**Midi-instrument Program Number for Violin.*/
    public final static int Violin      =  52;
    /**Midi-instrument Program Number for Trumpet.*/
    public final static int Trumpet     =  56;
    /**Midi-instrument Program Number for Trombone.*/
    public final static int Trombone    =  57;
    /**Midi-instrument Program Number for Violin2.*/
    public final static int Violin2     =  59;
    /**Midi-instrument Program Number for Violin3.*/
    public final static int Violin3     =  65;
    /**Midi-instrument Program Number for TenorSax.*/
    public final static int TenorSax    =  66;
    /**Midi-instrument Program Number for Flute.*/
    public final static int Flute       =  73;
    /**Midi-instrument Program Number for PanFlute.*/
    public final static int PanFlute    =  75;
    /**Midi-instrument Program Number for Piano1.*/
    public final static int Piano1      =  80;
    /**Midi-instrument Program Number for SynVoice.*/
    public final static int SynVoice    =  85;
    /**Midi-instrument Program Number for BassDrum.*/
    public final static int BassDrum    = 116;
    /**Midi-instrument Program Number for MelodicTom.*/
    public final static int MelodicTom  = 117;
    /**Midi-instrument Program Number for SnareDrum.*/
    public final static int SnareDrum   = 120;
    /** Midi Note Middle-C.*/
    public final static int C  = 60;
    /** Midi Minimum Note Pitch.*/
    public final static int LOW = 25;
    /** Midi Maximum Note Pitch.*/
    public final static int HIGH = 120;
    /** Midi Note Pitch Range.*/
    public final static int RANGE = HIGH - LOW;
    /** Whole-Note Duration (in milliseconds).*/
    public final static int DW = 2400;
    /** Eighth-Note Duration (in milliseconds).*/
    public final static int DE = DW / 8;
    /** Quarter-Note Duration.*/
    public final static int DQ = DW / 4;
    /** Half-Note Duration.*/
    public final static int DH = DW / 2;
    /** Midi Minimum Note-On Velocity - Pianissimo.*/
    public final static int VPP = 25;
    /** Midi Maximum Note-On Velocity - Fortissimo.*/
    public final static int VFF = 120;
    /** Midi Note-On Velocity Range.*/
    public final static int VRANGE = VFF - VPP;
    /** Special Note that represents the Null Note.*/
    public final static Note NULL_NOTE = new Note(-1,-1,-1,-1);

    // Instance Data
    private int channel;    // 0 to 15
    private int pitch;      // 0 to 127; 60 = Middle C
    private int duration;   // in milliseconds
    private int velocityOn; // 0 to 127 (Note-On Velocity)
    
    /**
     * Construct a specific Note.
     * @param c channel
     * @param p pitch
     * @param d duration
     * @param v velocityOn
     */
    public Note(int c, int p, int d, int v) {
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
    public Note(int c, Integer p, int d, int v) {
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

    public String toString() {
        return "[Channel " + channel +
               "; Pitch " + pitch +
               "; Duration " + duration +
               "; velocityOn " + velocityOn + "]";
    }
}
