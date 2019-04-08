package com.kaituo.comparison.back.core.mapper.system;

import com.kaituo.comparison.back.core.entity.system.SysLog;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 *
 * @version 2018/4/28/9:56
 */
@Mapper
@Repository
public interface SysLogMapper extends BaseMapper<SysLog> {
}
