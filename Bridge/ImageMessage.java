package Bridge;

public class ImageMessage implements MessageType {
    public ImageMessage() {}
    public void sendMessage() {
        System.out.println("Image sent\n");
    }
}

