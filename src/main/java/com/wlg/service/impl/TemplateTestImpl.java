package com.wlg.service.impl;

import com.wlg.service.TemplateTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 * Created by Administrator on 2018/2/24.
 */
public class TemplateTestImpl implements TemplateTest{
//    @Autowired
//    @Qualifier("primaryDataSource")
    protected JdbcTemplate jdbcTemplate1;

//    @Autowired
//    @Qualifier("secondaryDataSource")
    protected JdbcTemplate jdbcTemplate2;


    @Override
    public void create(String name, Integer age) {
        jdbcTemplate1.update("insert into USER(NAME, AGE) values(?, ?)", name, age);
    }

    @Override
    public void deleteByName(String name) {
        jdbcTemplate1.update("delete from USER where NAME = ?", name);
    }

    @Override
    public Integer getAllUsers() {
        return jdbcTemplate1.queryForObject("select count(1) from USER", Integer.class);
    }

    @Override
    public void deleteAllUsers() {
        jdbcTemplate1.update("delete from USER");
    }
}
