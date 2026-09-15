package com.google.android.material.color.utilities;

/* JADX INFO: loaded from: classes6.dex */
public final class ToneDeltaPair {
    private final double delta;
    private final TonePolarity polarity;
    private final DynamicColor roleA;
    private final DynamicColor roleB;
    private final boolean stayTogether;

    public ToneDeltaPair(DynamicColor dynamicColor, DynamicColor dynamicColor2, double d, TonePolarity tonePolarity, boolean z) {
        this.roleA = dynamicColor;
        this.roleB = dynamicColor2;
        this.delta = d;
        this.polarity = tonePolarity;
        this.stayTogether = z;
    }

    public final DynamicColor getRoleA() {
        return this.roleA;
    }

    public final DynamicColor getRoleB() {
        return this.roleB;
    }

    public final double getDelta() {
        return this.delta;
    }

    public final TonePolarity getPolarity() {
        return this.polarity;
    }

    public final boolean getStayTogether() {
        return this.stayTogether;
    }
}
