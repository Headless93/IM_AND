package com.qbao.newim.adapter.adapterhelper;

import java.util.List;

/**
 * Created by chenjian on 2017/3/22.
 */

public interface IExpandable<T> {
    boolean isExpanded();
    void setExpanded(boolean expanded);
    List<T> getSubItems();

    /**
     * Get the level of this item. The level start from 0.
     * If you don't care about the level, just return a negative.
     */
    int getLevel();
}
