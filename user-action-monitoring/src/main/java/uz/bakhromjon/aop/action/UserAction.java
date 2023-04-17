package uz.bakhromjon.aop.action;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class UserAction {
    private Long userId;
    private LocalDateTime occurredAt;

    private String message;

    private UserActionType type;
}
