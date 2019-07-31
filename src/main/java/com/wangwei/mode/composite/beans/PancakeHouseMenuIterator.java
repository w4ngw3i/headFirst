package com.wangwei.mode.composite.beans;

import java.util.List;

/**
 * @author: wangwei
 * @date: 2019-07-30 14:01
 */
public class PancakeHouseMenuIterator<T> implements Iterator {

    private List<T> list;
    private int position;

    public PancakeHouseMenuIterator(List<T> list) {
        this.list = list;
    }

    @Override
    public boolean hasNext() {
        if (position >= list.size() || list.get(position) == null){
            return false;
        }else {
            return true;
        }
    }

    @Override
    public Object next() {
        T t = list.get(position);
        position++;
        return t;
    }
}
