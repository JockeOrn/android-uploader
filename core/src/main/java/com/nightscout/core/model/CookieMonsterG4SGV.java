// Code generated by Wire protocol buffer compiler, do not edit.
// Source file: /Users/klee/Projects/Nightscout/android-uploader/core/src/main/java/com/nightscout/core/protobuf/G4Download.proto
package com.nightscout.core.model;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

import static com.squareup.wire.Message.Datatype.ENUM;
import static com.squareup.wire.Message.Datatype.UINT32;
import static com.squareup.wire.Message.Datatype.UINT64;
import static com.squareup.wire.Message.Label.REQUIRED;

public final class CookieMonsterG4SGV extends Message {

    public static final Integer DEFAULT_SGV_MGDL = 0;
    public static final Long DEFAULT_SYS_TIMESTAMP_SEC = 0L;
    public static final Long DEFAULT_DISP_TIMESTAMP_SEC = 0L;
    public static final Trend DEFAULT_TREND = Trend.TREND_NONE;
    public static final Noise DEFAULT_NOISE = Noise.NOISE_NONE;

    @ProtoField(tag = 1, type = UINT32, label = REQUIRED)
    public final Integer sgv_mgdl;

    /**
     * Glucose value
     */
    @ProtoField(tag = 2, type = UINT64)
    public final Long sys_timestamp_sec;

    /**
     * system timestamp of the record
     */
    @ProtoField(tag = 3, type = UINT64)
    public final Long disp_timestamp_sec;

    /**
     * system timestamp of the record
     */
    @ProtoField(tag = 4, type = ENUM)
    public final Trend trend;

    /**
     * Trend arrow
     */
    @ProtoField(tag = 5, type = ENUM)
    public final Noise noise;

    public CookieMonsterG4SGV(Integer sgv_mgdl, Long sys_timestamp_sec, Long disp_timestamp_sec, Trend trend, Noise noise) {
        this.sgv_mgdl = sgv_mgdl;
        this.sys_timestamp_sec = sys_timestamp_sec;
        this.disp_timestamp_sec = disp_timestamp_sec;
        this.trend = trend;
        this.noise = noise;
    }

    private CookieMonsterG4SGV(Builder builder) {
        this(builder.sgv_mgdl, builder.sys_timestamp_sec, builder.disp_timestamp_sec, builder.trend, builder.noise);
        setBuilder(builder);
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) return true;
        if (!(other instanceof CookieMonsterG4SGV)) return false;
        CookieMonsterG4SGV o = (CookieMonsterG4SGV) other;
        return equals(sgv_mgdl, o.sgv_mgdl)
                && equals(sys_timestamp_sec, o.sys_timestamp_sec)
                && equals(disp_timestamp_sec, o.disp_timestamp_sec)
                && equals(trend, o.trend)
                && equals(noise, o.noise);
    }

    @Override
    public int hashCode() {
        int result = hashCode;
        if (result == 0) {
            result = sgv_mgdl != null ? sgv_mgdl.hashCode() : 0;
            result = result * 37 + (sys_timestamp_sec != null ? sys_timestamp_sec.hashCode() : 0);
            result = result * 37 + (disp_timestamp_sec != null ? disp_timestamp_sec.hashCode() : 0);
            result = result * 37 + (trend != null ? trend.hashCode() : 0);
            result = result * 37 + (noise != null ? noise.hashCode() : 0);
            hashCode = result;
        }
        return result;
    }

    public static final class Builder extends Message.Builder<CookieMonsterG4SGV> {

        public Integer sgv_mgdl;
        public Long sys_timestamp_sec;
        public Long disp_timestamp_sec;
        public Trend trend;
        public Noise noise;

        public Builder() {
        }

        public Builder(CookieMonsterG4SGV message) {
            super(message);
            if (message == null) return;
            this.sgv_mgdl = message.sgv_mgdl;
            this.sys_timestamp_sec = message.sys_timestamp_sec;
            this.disp_timestamp_sec = message.disp_timestamp_sec;
            this.trend = message.trend;
            this.noise = message.noise;
        }

        public Builder sgv_mgdl(Integer sgv_mgdl) {
            this.sgv_mgdl = sgv_mgdl;
            return this;
        }

        /**
         * Glucose value
         */
        public Builder sys_timestamp_sec(Long sys_timestamp_sec) {
            this.sys_timestamp_sec = sys_timestamp_sec;
            return this;
        }

        /**
         * system timestamp of the record
         */
        public Builder disp_timestamp_sec(Long disp_timestamp_sec) {
            this.disp_timestamp_sec = disp_timestamp_sec;
            return this;
        }

        /**
         * system timestamp of the record
         */
        public Builder trend(Trend trend) {
            this.trend = trend;
            return this;
        }

        /**
         * Trend arrow
         */
        public Builder noise(Noise noise) {
            this.noise = noise;
            return this;
        }

        @Override
        public CookieMonsterG4SGV build() {
            checkRequiredFields();
            return new CookieMonsterG4SGV(this);
        }
    }
}
