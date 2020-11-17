package tb.springboot.data.service.impl;

import tb.springboot.data.entity.Accountsinfo;
import tb.springboot.data.dao.AccountsinfoDao;
import tb.springboot.data.service.AccountsinfoService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 平台用户信息表(Accountsinfo)表服务实现类
 *
 * @author makejava
 * @since 2020-11-16 19:37:37
 */
@Service("accountsinfoService")
public class AccountsinfoServiceImpl implements AccountsinfoService {
    @Resource
    private AccountsinfoDao accountsinfoDao;

    /**
     * 通过ID查询单条数据
     *
     * @param userid 主键
     * @return 实例对象
     */
    @Override
    public Accountsinfo queryById(Integer userid) {
        return this.accountsinfoDao.queryById(userid);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<Accountsinfo> queryAllByLimit(int offset, int limit) {
        return this.accountsinfoDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param accountsinfo 实例对象
     * @return 实例对象
     */
    @Override
    public Accountsinfo insert(Accountsinfo accountsinfo) {
        this.accountsinfoDao.insert(accountsinfo);
        return accountsinfo;
    }

    /**
     * 修改数据
     *
     * @param accountsinfo 实例对象
     * @return 实例对象
     */
    @Override
    public Accountsinfo update(Accountsinfo accountsinfo) {
        this.accountsinfoDao.update(accountsinfo);
        return this.queryById(accountsinfo.getUserid());
    }

    /**
     * 通过主键删除数据
     *
     * @param userid 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer userid) {
        return this.accountsinfoDao.deleteById(userid) > 0;
    }
}