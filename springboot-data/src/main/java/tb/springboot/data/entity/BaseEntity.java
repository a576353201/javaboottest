package tb.springboot.data.entity;

import cn.hutool.core.date.DateTime;
import lombok.Data;

import java.util.Date;

@Data
public class BaseEntity {
    private Long id;

    private Long createUser;

    private Date createDate;

    private Long updateUser;

    private Date updateDate;

    public Object getId() {
        return null;
    }

    public void setCreateUser(long l) {
    }

    public void setCreateDate(DateTime now) {
    }

    public void setUpdateUser(long l) {
    }

    public void setUpdateDate(DateTime now) {
    }
}
