// Code generated by Wire protocol buffer compiler, do not edit.
// Source file: /Users/klee/Projects/Nightscout/android-uploader/core/src/main/java/com/nightscout/core/model/Download.proto
package com.nightscout.core.model;

import com.squareup.wire.ProtoEnum;

public enum G4Noise
        implements ProtoEnum {
    NOISE_NONE(0),
    CLEAN(1),
    LIGHT(2),
    MEDIUM(3),
    HEAVY(4),
    NOT_COMPUTED(5),
    MAX(6);

    private final int value;

    private G4Noise(int value) {
        this.value = value;
    }

    @Override
    public int getValue() {
        return value;
    }
}
