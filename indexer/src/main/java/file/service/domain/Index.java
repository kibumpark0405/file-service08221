package file.service.domain;

import file.service.IndexerApplication;
import file.service.domain.FileIndexed;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;

@Entity
@Table(name = "Index_table")
@Data
//<<< DDD / Aggregate Root
public class Index {

    @Id
    private String fileName;

    private String filePath;

    @PostPersist
    public void onPostPersist() {
        FileIndexed fileIndexed = new FileIndexed(this);
        fileIndexed.publishAfterCommit();
    }

    @PrePersist
    public void onPrePersist() {}

    public static IndexRepository repository() {
        IndexRepository indexRepository = IndexerApplication.applicationContext.getBean(
            IndexRepository.class
        );
        return indexRepository;
    }
}
//>>> DDD / Aggregate Root
