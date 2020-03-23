package cn.fastboot.controller;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import cn.fastboot.base.result.Result;
import io.swagger.annotations.Api;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import cn.fastboot.repository.SysUserRepository;
import cn.fastboot.entity.SysUser;
import io.swagger.annotations.ApiOperation;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import cn.fastboot.service.ISysUserService;

import java.util.List;

import org.springframework.web.bind.annotation.RestController;
import cn.fastboot.base.BaseController;

/**
 * <p>
 * 前端控制器
 * </p>
 *
 * @author HOU
 * @since 2020-03-23
 */
@Slf4j
@Api(tags = {" 前端控制器"})
@RestController
@RequestMapping("/sys-user")
@AllArgsConstructor
public class SysUserController extends BaseController<ISysUserService, SysUser, String> {

    private final ISysUserService SysUserService;
    private final SysUserRepository SysUserRepository;

    /**
     * 根据id查询
     *
     * @return
     */
    @GetMapping(value = "/get/{id}")
    @ApiOperation(value = "通过id获取")
    public Result<SysUser> getById(@PathVariable(name = "id") String id) {
        return Result.success(SysUserService.getById(id));
    }

    /**
     * 分页列表
     *
     * @param current
     * @param size
     * @return
     */
    @GetMapping(value = "/page/{current}/{size}")
    @ApiOperation(value = "分页获取")
    public Result<IPage<SysUser>> page(@PathVariable(name = "current") Long current, @PathVariable(name = "size") Long size) {
        IPage<SysUser> page = new Page<SysUser>(current, size);
        return Result.success(SysUserService.page(page));
    }

    /**
     * 添加数据
     *
     * @param entity
     * @return Result
     */
    @PostMapping(value = "/add")
    @ApiOperation(value = "保存数据")
    public Result addSysUser(@RequestBody SysUser entity) {
        return Result.success(SysUserService.save(entity));
    }

    /**
     * 修改数据
     *
     * @return
     */
    @PostMapping(value = "/modify")
    @ApiOperation(value = "更新数据")
    public Result modifySysUser(@RequestBody SysUser entity) {
        return Result.success(SysUserService.updateById(entity));
    }

    @DeleteMapping(value = "/delById/{id}")
    public Result delById(@PathVariable(name = "id") String id) {
        return Result.success(SysUserService.removeById(id));
    }
}
