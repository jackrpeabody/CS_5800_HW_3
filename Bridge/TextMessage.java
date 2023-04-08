package Bridge;

public class TextMessage implements MessageType {
    public TextMessage() {}
    public void sendMessage() {
        System.out.println("Text sent\n");
    }
}
