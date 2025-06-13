package com.lbytech.usercenter.model.domain;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;

@TableName(value = "invite_code")
@Data
public class InviteCode implements Serializable {

    /**
     * 邀请码
     */
    @TableField("invite_code")
    @TableId("invite_code")
    private String inviteCode;

    /**
     * 0没被用过，1被用过
     */
    @TableField("is_used")
    private int isUsed;
}
