package uz.bakhromjon.aop.announcement;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Announcement {
    private Long id;

    private String target;
    private String address;
    private Double longitude;
    private Double latitude;
    private EAnnouncementStatus status;

}
