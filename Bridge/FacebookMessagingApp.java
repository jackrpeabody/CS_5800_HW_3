package Bridge;

public class FacebookMessagingApp extends MessagingAppType {

    public FacebookMessagingApp(MessageType messageType){
        this.messageType = messageType;
    }

    public void sendMessageType(){
        System.out.println("Facebook");
        this.messageType.sendMessage();
    }
}