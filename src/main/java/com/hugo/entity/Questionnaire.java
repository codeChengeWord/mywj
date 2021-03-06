package com.hugo.entity;

import com.hugo.myenum.ChoiceType;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by lxs on 2019/4/4.
 */
@Data
@Entity
//创建的数据库表名称
@Table(name = "fa_questionnaire")
public class Questionnaire{
    @Id
    @GeneratedValue
    private Integer id;
    private String number;
    private String name;
    private String describes;
    private Integer user;
    private Integer state;
    private Integer qtstate;
    private String createtime;
    private String updatetime;
    private String modifier;
    private Integer dr =0;
}
