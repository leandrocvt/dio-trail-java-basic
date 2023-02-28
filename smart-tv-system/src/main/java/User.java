public class User {

    public static void main(String[] args) {

        SmartTV smartTV = new SmartTV();

        smartTV.decreaseVolume();
        smartTV.decreaseVolume();
        smartTV.decreaseVolume();
        smartTV.upVolume();

        System.out.println("Current channel: " + smartTV.channel);

        smartTV.changeChannel(13);
        System.out.println("Current channel: " + smartTV.channel);

        System.out.println("Current volume: " + smartTV.volume);

        System.out.println("Tv on? " + smartTV.on);
        System.out.println("Current volume: "+ smartTV.volume);

        smartTV.connect();
        System.out.println("New status -> Tv on? " + smartTV.on);

        smartTV.disconnect();
        System.out.println("New status -> Tv on? " + smartTV.on);
    }
}
