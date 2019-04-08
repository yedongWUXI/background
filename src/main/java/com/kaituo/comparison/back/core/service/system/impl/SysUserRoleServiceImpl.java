package com.kaituo.comparison.back.core.service.system.impl;

import com.kaituo.comparison.back.core.entity.system.SysUserRole;
import com.kaituo.comparison.back.core.mapper.system.SysUserRoleMapper;
import com.kaituo.comparison.back.core.service.system.SysUserRoleService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @version 2018/4/16/11:32
 */
@Service
@Transactional
public class SysUserRoleServiceImpl extends ServiceImpl<SysUserRoleMapper,SysUserRole> implements SysUserRoleService {
}
