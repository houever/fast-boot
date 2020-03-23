package cn.fastboot.service.impl;
import javax.annotation.Resource;
import cn.fastboot.base.BaseServiceImpl;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import cn.fastboot.repository.SysUserRepository;
import cn.fastboot.entity.SysUser;
import cn.fastboot.service.ISysUserService;
import cn.fastboot.mapper.ISysUserMapper;
/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author HOU
 * @since 2020-03-23
 */
@Slf4j
@Service
@AllArgsConstructor
public class SysUserServiceImpl extends BaseServiceImpl<ISysUserMapper,SysUser> implements ISysUserService{

    private ISysUserMapper SysUserMapper;
    private SysUserRepository SysUserRepository;

}
