package org.scu_db.demo.service;

import org.scu_db.demo.model.Title;

import java.util.List;

public interface TitleService {

    List<Title> findTitlesByName(String name1, String name2);

}
