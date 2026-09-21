class Post {
    String username;
    String content;

    Post(String username, String content) {
        this.username = username;
        this.content = content;
    }

    void display() {
        System.out.println("Username: " + username);
        System.out.println("Content: " + content);
    }
}

class VideoPost extends Post {
    int durationSeconds;

    VideoPost(String username, String content, int durationSeconds) {
        super(username, content);
        this.durationSeconds = durationSeconds;
    }

    @Override
    void display() {
        System.out.println("Username: " + username);
        System.out.println("Content: " + content);
        System.out.println("Duration: " + durationSeconds + " seconds");
    }
}

public class Media {
    public static void main(String[] args) {
        VideoPost video = new VideoPost(
            "dellibabu",
            "My first Java video!",
            45
        );

        video.display();
    }
}