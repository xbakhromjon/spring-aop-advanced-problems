package uz.bakhromjon.aop;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import uz.bakhromjon.aop.announcement.Announcement;
import uz.bakhromjon.aop.announcement.AnnouncementService;
import uz.bakhromjon.aop.announcement.EAnnouncementStatus;

@SpringBootApplication
public class AopApplication implements CommandLineRunner {
    @Autowired
    private AnnouncementService announcementService;

    public static void main(String[] args) {
        SpringApplication.run(AopApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        announcementService.changeStatus(new Announcement(1L, "TARGET", "ADDRESS", 0.12, 0.12, EAnnouncementStatus.ARCHIVED));
    }
}
