package uz.bakhromjon.aop.announcement;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import uz.bakhromjon.aop.action.Action;
import uz.bakhromjon.aop.action.UserActionType;

@Service
@RequiredArgsConstructor
@Slf4j
public class AnnouncementService {
    private final AnnouncementRepository announcementRepository;

    @Action(type = UserActionType.PUBLISH_ANNOUNCEMENT, message = "E'lon statusi PUBLISHED qilindi")
    public void publish(Announcement announcement) {
        announcement.setStatus(EAnnouncementStatus.PUBLISHED);
        announcementRepository.save(announcement);
        log.info("Announcement status changed");
    }

    @Action(type = UserActionType.CHANGE_STATUS_ANNOUNECMENT, message = "E'lon statusi o'zgartirildi")
    public Boolean changeStatus(Announcement announcement) {
        announcementRepository.save(announcement);
        log.info("Announcement status changed");
        return true;
    }
}
