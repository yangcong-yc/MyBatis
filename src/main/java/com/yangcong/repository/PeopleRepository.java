package com.yangcong.repository;

import com.yangcong.entity.People;

import java.util.List;

/**
 * @ClassName PeopleRepository
 * @Description TODO
 * @date 2023/7/17 13:41
 * @Version 1.0
 */
public interface PeopleRepository {

    public int savePeople(People people);

    public int deletePeople(Integer id);

    public int updatePeople(People people);

    public People findById(Integer id);

    public List<People> findAll();


}
