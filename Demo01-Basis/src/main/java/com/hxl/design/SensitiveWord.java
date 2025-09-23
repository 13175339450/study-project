package com.hxl.design;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * 敏感词信息
 * @author hengxiaoliang
 */

@Data
@Table("t_sensitive_word")
public class SensitiveWord implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column("id")
    private Long id;

    @Column("company_Id")
    private Long companyID;

    // 敏感词 空格分隔
    @Column("words")
    private String words;

    @Column("create_time")
    private LocalDateTime createTime;

    @Column("update_time")
    private LocalDateTime updateTime;
}
