package ObjectsInMemory;
import org.apache.log4j.Logger;
import java.util.Objects;

public class TV {
    public static final int MAX_CHANNEL = 120;
    public static final int MIN_CHANNEL = 0;
    public static final int MAX_VOLUME = 100;
    public static final int MIN_VOLUME = 1;

    private int currentChannel;
    private int currentVolume;
    private String producer;
    private boolean isOn;

    public TV(int currentChannel, int currentVolume, String producer, boolean isOn) {
        this.currentChannel = currentChannel;
        this.currentVolume = currentVolume;
        this.producer = producer;
        this.isOn = isOn;
    }

    public int getCurrentChannel() {
        return currentChannel;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public String getProducer() {
        return producer;
    }

    public boolean isOn() {
        return isOn;
    }

    @Override
    public String toString() {
        return "TV{" +
                "currentChannel='" + currentChannel + '\'' +
                ", currentVolume=" + currentVolume +
                ", producer='" + producer + '\'' +
                ", isOn=" + isOn +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TV tv = (TV) o;
        return currentVolume == tv.currentVolume && isOn == tv.isOn && Objects.equals(currentChannel, tv.currentChannel) && Objects.equals(producer, tv.producer);
    }

    @Override
    public int hashCode() {
        return Objects.hash(currentChannel, currentVolume, producer, isOn);
    }

    static Logger logger = Logger.getLogger(TV.class);

    public void nextChannel() throws ExceptionTV{
        if(isOn) {
            if(currentChannel>=MIN_CHANNEL && currentChannel<MAX_CHANNEL) currentChannel++;
            else throw new ExceptionTV("Wrong channel!");
        }
        else throw new ExceptionTV("Turn TV on!");
    }
    public void  previousChannel()throws ExceptionTV{
        if(isOn) {
            if(currentChannel>MIN_CHANNEL && currentChannel<=MAX_CHANNEL) currentChannel--;
            else throw new ExceptionTV("Wrong channel!");
        }
        else throw new ExceptionTV("Turn TV on!");
    }
    public void  moreVolume()throws ExceptionTV{
        if(isOn) {
            if(currentVolume>=MIN_VOLUME && currentVolume<MAX_VOLUME) currentVolume++;
            else throw new ExceptionTV("Wrong volume!");
        }
        else throw new ExceptionTV("Turn TV on!");
    }
    public void  lessVolume()throws ExceptionTV{
        if(isOn) {
            if(currentVolume>MIN_VOLUME && currentVolume<=MAX_VOLUME) currentVolume--;
            else throw new ExceptionTV("Wrong volume!");
        }
        else throw new ExceptionTV("Turn TV on!");
    }
    public void  turnTvOn(){
        isOn=true;
    }
    public void  turnTvOf(){
        isOn=false;
    }

}
