package com.library.common.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.library.common.domain.entity.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper extends BaseMapper<User> {

}