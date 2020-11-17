package tb.springboot.data.entity.test;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import tb.springboot.data.entity.BaseEntity;

@Data
@TableName("guser")
public class GuserEntity3 extends BaseEntity {
    private String name;

    private Integer age;

    private Long deptId;
}
