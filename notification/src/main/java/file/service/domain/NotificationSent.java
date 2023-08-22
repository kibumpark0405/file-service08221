package file.service.domain;

import file.service.domain.*;
import file.service.infra.AbstractEvent;
import java.time.LocalDate;
import java.util.*;
import lombok.*;

//<<< DDD / Domain Event
@Data
@ToString
public class NotificationSent extends AbstractEvent {

    public NotificationSent(Notification aggregate) {
        super(aggregate);
    }

    public NotificationSent() {
        super();
    }
}
//>>> DDD / Domain Event
