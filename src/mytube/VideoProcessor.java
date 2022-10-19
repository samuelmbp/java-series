package mytube;

public class VideoProcessor {
    // Use Constructor Dependency
    private VideoEncoder videoEncoder;
    private VideoDatabase videoDatabase;
    private NotificationService emailService;

    public VideoProcessor(VideoEncoder videoEncoder, VideoDatabase videoDatabase, NotificationService emailService) {
        this.videoEncoder = videoEncoder;
        this.videoDatabase = videoDatabase;
        this.emailService = emailService;
    }

    public void process(Video video) {
        videoEncoder.encode(video);
        videoDatabase.store(video);
        emailService.sendEmail(video.getUser());
    }
}

