package com.project.course.entities.enums;

public enum OrderStatus {

    WAITING_PAYMENT(1),
    PAID(2),
    PACKING(3),
    SHIPPED(4),
    DELIVERED(5),
    CANCELLED(6);

    private int code;

    private OrderStatus(int code) {
        this.code = code;
    }

    public int getCode() {
        return code;
    }

    public static OrderStatus valueOf(int code) {
        for (OrderStatus value : OrderStatus.values()) {
            if (value.getCode() == code) {
                return value;
            }
        }
        throw new IllegalArgumentException("No OrderStatus with code " + code);
    }
}
