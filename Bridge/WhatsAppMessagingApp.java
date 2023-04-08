package Bridge;

public class WhatsAppMessagingApp extends MessagingAppType {

    public WhatsAppMessagingApp(MessageType messageType){
        this.messageType = messageType;
    }

    public void sendMessageType(){
        System.out.println("WhatsApp");
        this.messageType.sendMessage();
    }
}
