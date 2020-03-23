package cn.fastboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import cn.fastboot.entity.SysUser;
/**
 * <p>
 *  Repository 接口
 * </p>
 *
 * @author houqj
 * @since 2020-01-03
 */
public interface SysUserRepository extends JpaRepository<SysUser, String>{
	 
}