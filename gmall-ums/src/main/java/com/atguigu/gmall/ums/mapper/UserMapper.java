package com.atguigu.gmall.ums.mapper;

import com.atguigu.gmall.ums.entity.UserEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 用户表
 * 
 * @author lin
 * @email 2684773169@qq.com
 * @date 2020-10-28 13:46:15
 */
@Mapper
public interface UserMapper extends BaseMapper<UserEntity> {
	
}
