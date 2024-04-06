public class PhoneInterface {
    public static void main(String[] args){
        SmartPhone s=new SmartPhone();
        s.click();
        s.pause();
        s.play();
        s.sms();
        s.call();
        s.record();
    }
}
class Phone{
    void call(){
        System.out.println("Calling phone");
    }
    void sms(){
        System.out.println("sms from phone");
    }
}
interface Camera{
    void click();
    void record();
}
interface MusicPlayer{
    void play();
    void pause();
}
class SmartPhone extends Phone implements Camera, MusicPlayer{
    @Override
    public void click() {
        System.out.println("Smartphone Camera clicked");
    }
    @Override
    public  void record(){
        System.out.println("Recording in Smartphone");
    }

    @Override
    public void pause() {
        System.out.println("Pause in SmartPhone");
    }

    @Override
    public void play() {
        System.out.println("Play in SmartPhone");
    }


}