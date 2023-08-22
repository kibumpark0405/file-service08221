package file.service.domain;

import file.service.domain.*;
import file.service.infra.AbstractEvent;
import java.time.LocalDate;
import java.util.*;
import lombok.*;

//<<< DDD / Domain Event
@Data
@ToString
public class VideoFileUploaded extends AbstractEvent {

    public VideoFileUploaded(Video aggregate) {
        super(aggregate);
    }

    public VideoFileUploaded() {
        super();
    }
}
//>>> DDD / Domain Event
