package com.qbao.newim.model.message;

import com.qbao.newim.constdef.MsgConstDef;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.Property;
import org.greenrobot.greendao.annotation.Generated;

/**
 * Created by shiyunjie on 2017/9/27.
 */

@Entity
public class GcDBMessageModel
{

    @Id
    public String primary_key;

    /**
     * 服务器基础字段
     */
    @Property(nameInDb = "message_id")
    public long message_id = 0;                                        // 消息唯一ID
    @Property(nameInDb = "send_user_name")
    public String send_user_name = "";                                 // 发送者名字
    @Property(nameInDb = "is_self")
    public boolean is_self = false;                                    // 是否自己发送
    @Property(nameInDb = "b_id")
    public long b_id = 0;                                              // 只是一个id类型，可以代表：商家id或者其他的id
    @Property(nameInDb = "w_id")
    public long w_id = 0;                                              // 只是一个id类型，可以代表：小二id或者其他的id
    @Property(nameInDb = "c_id")
    public long c_id = 0;                                              // 只是一个id类型，可以代表：客户id或者其他的id
    @Property(nameInDb = "app_id")
    public short app_id = 0;                                           // 子公司id
    @Property(nameInDb = "session_id")
    public int session_id = 0;                                         // 保留字段 会话id
    @Property(nameInDb = "chat_type")
    public short chat_type = MsgConstDef.MSG_CHAT_TYPE.INVALID;        // 聊天类型（单聊、群聊等）
    @Property(nameInDb = "m_type")
    public int m_type = MsgConstDef.MSG_M_TYPE.INVALID;                // 消息类型（文本、图片、地图等）
    @Property(nameInDb = "s_type")
    public int s_type = MsgConstDef.MSG_S_TYPE.INVALID;                // 消息类型扩展（红包、订单、名片等）
    @Property(nameInDb = "ext_type")
    public int ext_type = MsgConstDef.MSG_EXT_TYPE.INVALID;            // 保留字段 以后扩展
    @Property(nameInDb = "msg_content")
    public String msg_content = "";                                    // 消息内容
    @Property(nameInDb = "msg_time")
    public long msg_time = 0;                                          // 消息发送的时间
    @Property(nameInDb = "msg_status")
    public short msg_status = MsgConstDef.MSG_STATUS.INVALID;          // 消息发送状态

    @Property(nameInDb = "audio_path")
    public String audio_path;                                          // 语音本地地址
    @Property(nameInDb = "pic_path")
    public String pic_path;                                            // 图片原图本地地址
    @Property(nameInDb = "compress_path")
    public String compress_path;                                       // 图片压缩后地址

    @Property(nameInDb = "group_id")
    public long group_id = 0;                                          // 群id
    @Property(nameInDb = "user_id")
    public long user_id = 0;                                           // 发消息的id
    @Property(nameInDb = "big_msg_type")
    public int big_msg_type = 0;                                       // 操作类型
    @Property(nameInDb = "message_old_id")
    public long message_old_id = 0;                                    // 在群操作是会有值

    @Property(nameInDb = "operate_user_name")
    public String operate_user_name = "";
    @Property(nameInDb = "group_modify_content")
    public String group_modify_content = "";

    @Property(nameInDb = "str_user_list")
    public String str_user_list = "";

    @Generated(hash = 209879541)
    public GcDBMessageModel(String primary_key, long message_id, String send_user_name, boolean is_self,
            long b_id, long w_id, long c_id, short app_id, int session_id, short chat_type, int m_type,
            int s_type, int ext_type, String msg_content, long msg_time, short msg_status,
            String audio_path, String pic_path, String compress_path, long group_id, long user_id,
            int big_msg_type, long message_old_id, String operate_user_name,
            String group_modify_content, String str_user_list) {
        this.primary_key = primary_key;
        this.message_id = message_id;
        this.send_user_name = send_user_name;
        this.is_self = is_self;
        this.b_id = b_id;
        this.w_id = w_id;
        this.c_id = c_id;
        this.app_id = app_id;
        this.session_id = session_id;
        this.chat_type = chat_type;
        this.m_type = m_type;
        this.s_type = s_type;
        this.ext_type = ext_type;
        this.msg_content = msg_content;
        this.msg_time = msg_time;
        this.msg_status = msg_status;
        this.audio_path = audio_path;
        this.pic_path = pic_path;
        this.compress_path = compress_path;
        this.group_id = group_id;
        this.user_id = user_id;
        this.big_msg_type = big_msg_type;
        this.message_old_id = message_old_id;
        this.operate_user_name = operate_user_name;
        this.group_modify_content = group_modify_content;
        this.str_user_list = str_user_list;
    }

    @Generated(hash = 961594240)
    public GcDBMessageModel() {
    }

    public String getPrimary_key() {
        return this.primary_key;
    }

    public void setPrimary_key(String primary_key) {
        this.primary_key = primary_key;
    }

    public long getMessage_id() {
        return this.message_id;
    }

    public void setMessage_id(long message_id) {
        this.message_id = message_id;
    }

    public String getSend_user_name() {
        return this.send_user_name;
    }

    public void setSend_user_name(String send_user_name) {
        this.send_user_name = send_user_name;
    }

    public boolean getIs_self() {
        return this.is_self;
    }

    public void setIs_self(boolean is_self) {
        this.is_self = is_self;
    }

    public long getB_id() {
        return this.b_id;
    }

    public void setB_id(long b_id) {
        this.b_id = b_id;
    }

    public long getW_id() {
        return this.w_id;
    }

    public void setW_id(long w_id) {
        this.w_id = w_id;
    }

    public long getC_id() {
        return this.c_id;
    }

    public void setC_id(long c_id) {
        this.c_id = c_id;
    }

    public short getApp_id() {
        return this.app_id;
    }

    public void setApp_id(short app_id) {
        this.app_id = app_id;
    }

    public int getSession_id() {
        return this.session_id;
    }

    public void setSession_id(int session_id) {
        this.session_id = session_id;
    }

    public short getChat_type() {
        return this.chat_type;
    }

    public void setChat_type(short chat_type) {
        this.chat_type = chat_type;
    }

    public int getM_type() {
        return this.m_type;
    }

    public void setM_type(int m_type) {
        this.m_type = m_type;
    }

    public int getS_type() {
        return this.s_type;
    }

    public void setS_type(int s_type) {
        this.s_type = s_type;
    }

    public int getExt_type() {
        return this.ext_type;
    }

    public void setExt_type(int ext_type) {
        this.ext_type = ext_type;
    }

    public String getMsg_content() {
        return this.msg_content;
    }

    public void setMsg_content(String msg_content) {
        this.msg_content = msg_content;
    }

    public long getMsg_time() {
        return this.msg_time;
    }

    public void setMsg_time(long msg_time) {
        this.msg_time = msg_time;
    }

    public short getMsg_status() {
        return this.msg_status;
    }

    public void setMsg_status(short msg_status) {
        this.msg_status = msg_status;
    }

    public String getAudio_path() {
        return this.audio_path;
    }

    public void setAudio_path(String audio_path) {
        this.audio_path = audio_path;
    }

    public String getPic_path() {
        return this.pic_path;
    }

    public void setPic_path(String pic_path) {
        this.pic_path = pic_path;
    }

    public String getCompress_path() {
        return this.compress_path;
    }

    public void setCompress_path(String compress_path) {
        this.compress_path = compress_path;
    }

    public long getGroup_id() {
        return this.group_id;
    }

    public void setGroup_id(long group_id) {
        this.group_id = group_id;
    }

    public long getUser_id() {
        return this.user_id;
    }

    public void setUser_id(long user_id) {
        this.user_id = user_id;
    }

    public int getBig_msg_type() {
        return this.big_msg_type;
    }

    public void setBig_msg_type(int big_msg_type) {
        this.big_msg_type = big_msg_type;
    }

    public long getMessage_old_id() {
        return this.message_old_id;
    }

    public void setMessage_old_id(long message_old_id) {
        this.message_old_id = message_old_id;
    }

    public String getOperate_user_name() {
        return this.operate_user_name;
    }

    public void setOperate_user_name(String operate_user_name) {
        this.operate_user_name = operate_user_name;
    }

    public String getGroup_modify_content() {
        return this.group_modify_content;
    }

    public void setGroup_modify_content(String group_modify_content) {
        this.group_modify_content = group_modify_content;
    }

    public String getStr_user_list() {
        return this.str_user_list;
    }

    public void setStr_user_list(String str_user_list) {
        this.str_user_list = str_user_list;
    }
}
