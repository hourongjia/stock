package com.ssmm.model;

import java.util.Date;

/**
 * Created by M.j on 2016/7/24.
 */
public class KLine extends BaseEntity{
    private Integer volume;
    private float open;
    private float close;
    private float high;
    private float low;
    private float chg;
    private float percent;
    private float turnrate;
    private float ma5;
    private float ma10;
    private float ma20;
    private float ma30;
    private float dea;
    private float dif;
    private float macd;
    private Date time;

    public Integer getVolume() {
        return volume;
    }

    public void setVolume(Integer volume) {
        this.volume = volume;
    }

    public float getOpen() {
        return open;
    }

    public void setOpen(float open) {
        this.open = open;
    }

    public float getClose() {
        return close;
    }

    public void setClose(float close) {
        this.close = close;
    }

    public float getHigh() {
        return high;
    }

    public void setHigh(float high) {
        this.high = high;
    }

    public float getLow() {
        return low;
    }

    public void setLow(float low) {
        this.low = low;
    }

    public float getChg() {
        return chg;
    }

    public void setChg(float chg) {
        this.chg = chg;
    }

    public float getPercent() {
        return percent;
    }

    public void setPercent(float percent) {
        this.percent = percent;
    }

    public float getTurnrate() {
        return turnrate;
    }

    public void setTurnrate(float turnrate) {
        this.turnrate = turnrate;
    }

    public float getMa5() {
        return ma5;
    }

    public void setMa5(float ma5) {
        this.ma5 = ma5;
    }

    public float getMa10() {
        return ma10;
    }

    public void setMa10(float ma10) {
        this.ma10 = ma10;
    }

    public float getMa20() {
        return ma20;
    }

    public void setMa20(float ma20) {
        this.ma20 = ma20;
    }

    public float getMa30() {
        return ma30;
    }

    public void setMa30(float ma30) {
        this.ma30 = ma30;
    }

    public float getDea() {
        return dea;
    }

    public void setDea(float dea) {
        this.dea = dea;
    }

    public float getDif() {
        return dif;
    }

    public void setDif(float dif) {
        this.dif = dif;
    }

    public float getMacd() {
        return macd;
    }

    public void setMacd(float macd) {
        this.macd = macd;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }
}
