package com.javaq.mixins;

import com.javaq.construct.OrderBy;

/**
 * @author Vivek Mittal <vivek.mittal@flipkart.com>
 */
public interface Orderable extends JavaQContext {
    public enum Order {
        DESC, ASC
    }

    public default OrderBy orderBy(String variable, Order order) {
        return new OrderBy(this, variable, order);
    }
}
