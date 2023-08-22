package file.service.domain;

import file.service.DashboardApplication;
import file.service.domain.DashboardDisplayed;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;

@Entity
@Table(name = "FileStatus_table")
@Data
//<<< DDD / Aggregate Root
public class FileStatus {

    @Id
    private String fileName;

    private String fileSize;

    private Boolean indexed;

    private Boolean uploaded;

    private String videoUrl;

    @PostPersist
    public void onPostPersist() {
        DashboardDisplayed dashboardDisplayed = new DashboardDisplayed(this);
        dashboardDisplayed.publishAfterCommit();
    }

    @PrePersist
    public void onPrePersist() {}

    public static FileStatusRepository repository() {
        FileStatusRepository fileStatusRepository = DashboardApplication.applicationContext.getBean(
            FileStatusRepository.class
        );
        return fileStatusRepository;
    }
}
//>>> DDD / Aggregate Root
