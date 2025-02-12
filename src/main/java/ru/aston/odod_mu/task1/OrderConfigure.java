package ru.aston.odod_mu.task1;

import java.math.BigDecimal;

interface OrderConfigure {
    enum DISCOUNT_PERCENT{
        DISCOUNT_TRUCK("0.845"),
        DISCOUNT_PASSENGER("0.735");
        private String percent;
        DISCOUNT_PERCENT(String percent){
            this.percent = percent;
        }
        public BigDecimal get_percent(){return new BigDecimal(percent);}
    }
}
