package com.javaq.construct;

/**
 * @author Vivek Mittal <vivek.mittal@flipkart.com>
 */
public enum JoinType {
    INNER_JOIN("INNER JOIN"),
    LEFT_JOIN("LEFT JOIN");

    private String type;

    private JoinType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }
}
