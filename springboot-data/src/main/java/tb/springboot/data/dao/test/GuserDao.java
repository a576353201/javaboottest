package tb.springboot.data.dao.test;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.apache.ibatis.annotations.Param;
import tb.springboot.data.entity.test.GuserEntity3;

import java.util.List;
import java.util.Map;

public interface GuserDao extends BaseMapper<GuserEntity3> {
    List<Map<String, Object>> queryPage(@Param("page") Page page, @Param("params") Map<String, Object> params);
}
