package com.baizhi.zh.dao;


import ch.qos.logback.core.net.SyslogOutputStream;
import com.baizhi.zh.entity.User;
import org.springframework.jdbc.core.SqlOutParameter;
import tk.mybatis.mapper.common.Mapper;

import java.sql.SQLOutput;

public interface UserMapper extends Mapper<User> {



}
