package Bridge;

public class VideoMessage implements MessageType {
    public VideoMessage() {}
    public void sendMessage() {
        System.out.println("Video sent\n");
    }
}