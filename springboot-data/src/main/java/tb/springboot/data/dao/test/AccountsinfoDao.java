package tb.springboot.data.dao.test;

import org.apache.ibatis.annotations.Param;
import tb.springboot.data.entity.test.Accountsinfo;

import java.util.List;

/**
 * 平台用户信息表(Accountsinfo)表数据库访问层
 *
 * @author makejava
 * @since 2020-11-17 09:40:02
 */
public interface AccountsinfoDao {

    /**
     * 通过ID查询单条数据
     *
     * @param userid 主键
     * @return 实例对象
     */
    Accountsinfo queryById(Integer userid);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<Accountsinfo> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param accountsinfo 实例对象
     * @return 对象列表
     */
    List<Accountsinfo> queryAll(Accountsinfo accountsinfo);

    /**
     * 新增数据
     *
     * @param accountsinfo 实例对象
     * @return 影响行数
     */
    int insert(Accountsinfo accountsinfo);

    /**
     * 修改数据
     *
     * @param accountsinfo 实例对象
     * @return 影响行数
     */
    int update(Accountsinfo accountsinfo);

    /**
     * 通过主键删除数据
     *
     * @param userid 主键
     * @return 影响行数
     */
    int deleteById(Integer userid);

}