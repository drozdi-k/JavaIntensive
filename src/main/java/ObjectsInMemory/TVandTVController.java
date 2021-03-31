package ObjectsInMemory;

public class TVandTVController {
    private TV tv;

    public void setTv(TV tv) {
        this.tv = tv;
    }

    public void nextChannelController(){
        tv.nextChannel();
    }
    public void  previousChannelController(){
        tv.previousChannel();
    }
    public void  moreVolumeController(){
        tv.moreVolume();
    }
    public void  lessVolumeController(){
        tv.lessVolume();
    }
    public void  turnTvOnController(){
        tv.turnTvOn();
    }
    public void  turnTvOfController(){
        tv.turnTvOf();
    }

}
