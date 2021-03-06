package org.scu_db.demo.Repository;

import org.scu_db.demo.model.Title;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TitleRepository extends JpaRepository<Title, String> {

    @Query(value = "select * from title where name in (select name from title where name = ?1 or name = ?2)", nativeQuery = true)
    List<Title> findTitlesByName(String name1, String name2);

}
