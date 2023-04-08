package Bridge;

public class Driver {
    public static void main(String[] args){
        WhatsAppMessagingApp whatsAppText = new WhatsAppMessagingApp(new TextMessage());
        whatsAppText.sendMessageType();

        WhatsAppMessagingApp whatsAppImage = new WhatsAppMessagingApp(new ImageMessage());
        whatsAppImage.sendMessageType();

        TelegramMessagingApp telegramVideo = new TelegramMessagingApp(new VideoMessage());
        telegramVideo.sendMessageType();

        TelegramMessagingApp telegramText = new TelegramMessagingApp(new TextMessage());;
        telegramText.sendMessageType();

        FacebookMessagingApp facebookImage = new FacebookMessagingApp(new ImageMessage());
        facebookImage.sendMessageType();

        FacebookMessagingApp facebookVideo = new FacebookMessagingApp(new VideoMessage());
        facebookVideo.sendMessageType();
    }
}
