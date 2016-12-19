package org.andy.pay.enums;

/**
 * @version 1.0
 * @author andy
 * @description: 逻辑是否删除标识,该枚举中的数据与数据库列中的is_use保持一致
 * @email andytohome@gmai.com
 */
public enum IsUse {
    /**
     * 逻辑已删除
     */
    DELETE(0),

    /**
     * 默认为使用
     */
    USE(1);

    private  int status;

    IsUse(int status) {
        this.status = status;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
}
