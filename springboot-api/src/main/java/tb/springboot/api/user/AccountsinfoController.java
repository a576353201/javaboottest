package tb.springboot.api.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tb.springboot.data.entity.test.Accountsinfo;
import tb.springboot.service.AccountsinfoService;

import javax.annotation.Resource;

/**
 * 平台用户信息表(Accountsinfo)表控制层
 *
 * @author makejava
 * @since 2020-11-17 09:40:03
 */
@RestController
@RequestMapping("accountsinfo")
public class AccountsinfoController {
    /**
     * 服务对象
     */
   // @Resource

    private AccountsinfoService accountsinfoService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
   // @RequestMapping(value = "selectOne",method = RequestMethod.GET,produces = "text/html;charset=UTF-8")

    public Accountsinfo selectOne(Integer id) {
        return this.accountsinfoService.queryById(id);
    }

}