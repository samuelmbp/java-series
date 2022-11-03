package mytube;

public class VideoProcessor {
    private final VideoEncoder videoEncoder;
    private final VideoDatabase videoDatabase;
    private final NotificationService emailService;

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

