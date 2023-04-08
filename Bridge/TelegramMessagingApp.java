package Bridge;

public class TelegramMessagingApp extends MessagingAppType {

    public TelegramMessagingApp(MessageType messageType){
        this.messageType = messageType;
    }

    public void sendMessageType(){
        System.out.println("Telegram");
        this.messageType.sendMessage();
    }
}