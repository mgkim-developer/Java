 class Tv { // 멤버 5개
    boolean power;      // 전원상태(on/off)
    int channel;        // 채널

     void power()   {power = !power;}
     void channelUp() {channel = channel + 1;}
     void channelDown() {channel = channel - 1;}
 }

 class SmartTv extends Tv { // SmartTv는 Tv에 캡션(자막)을 보여주는 기능을 제공 // 멤버 5개 + 2개 = 7개
    boolean caption;        // 캡션상태(on/off)
     void displayCaption(String text) {
         if (caption) {     // 캡션 상태가 on(true)일 때만 text를 보여준다)
             System.out.println(text);
         }
     }
 }

public class Ex7_1 {
    public static void main(String[] args) {
        SmartTv stv = new SmartTv();
        stv.channel = 10;       // 조상 클래스로부터 상속받은 멤버
        stv.channelUp();        // 조상 클래스로부터 상속받은 멤버
        System.out.println(stv.channel);
//        stv.displayCaption("Hello, world");
        stv.caption = true;     // 캡션(자막) 기능을 켠다.
        stv.displayCaption("Hello, world");
    }
}
