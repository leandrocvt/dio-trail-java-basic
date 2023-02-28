public class SmartTV {

    Boolean on = false;
    Integer channel = 1;
    Integer volume = 25;

    public void connect(){
        on = true;
    }

    public void disconnect(){
        on = false;
    }

    public void upVolume(){
        System.out.println("Increasing the volume to " + volume);
        volume ++;
    }

    public void decreaseVolume(){
        System.out.println("Turning down the volume to " + volume);
        volume --;
    }

    public void increaseChannel(){
        channel++;
    }

    public void decreaseChannel(){
        channel--;
    }

    public void changeChannel(int newChannel){
        channel = newChannel;
    }
}
