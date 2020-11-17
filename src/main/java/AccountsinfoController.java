package tb.springboot.data.controller;

import tb.springboot.data.entity.Accountsinfo;
import tb.springboot.data.service.AccountsinfoService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * 平台用户信息表(Accountsinfo)表控制层
 *
 * @author makejava
 * @since 2020-11-16 19:37:38
 */
@RestController
@RequestMapping("accountsinfo")
public class AccountsinfoController {
    /**
     * 服务对象
     */
    @Resource
    private AccountsinfoService accountsinfoService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public Accountsinfo selectOne(Integer id) {
        return this.accountsinfoService.queryById(id);
    }

}