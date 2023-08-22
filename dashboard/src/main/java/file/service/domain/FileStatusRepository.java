package file.service.domain;

import file.service.domain.*;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

//<<< PoEAA / Repository
@RepositoryRestResource(
    collectionResourceRel = "fileStatuses",
    path = "fileStatuses"
)
public interface FileStatusRepository
    extends PagingAndSortingRepository<FileStatus, String> {}
