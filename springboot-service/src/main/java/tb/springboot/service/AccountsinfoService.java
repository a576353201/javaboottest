package tb.springboot.service;

import tb.springboot.data.entity.test.Accountsinfo;

import java.util.List;

/**
 * 平台用户信息表(Accountsinfo)表服务接口
 *
 * @author makejava
 * @since 2020-11-17 09:40:02
 */
public interface AccountsinfoService {

    /**
     * 通过ID查询单条数据
     *
     * @param userid 主键
     * @return 实例对象
     */
    Accountsinfo queryById(Integer userid);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<Accountsinfo> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param accountsinfo 实例对象
     * @return 实例对象
     */
    Accountsinfo insert(Accountsinfo accountsinfo);

    /**
     * 修改数据
     *
     * @param accountsinfo 实例对象
     * @return 实例对象
     */
    Accountsinfo update(Accountsinfo accountsinfo);

    /**
     * 通过主键删除数据
     *
     * @param userid 主键
     * @return 是否成功
     */
    boolean deleteById(Integer userid);

}