package com.google.android.material.color;

/* JADX INFO: loaded from: classes4.dex */
public final class ColorRoles {
    private final int accent;
    private final int accentContainer;
    private final int onAccent;
    private final int onAccentContainer;

    ColorRoles(int i, int i2, int i3, int i4) {
        this.accent = i;
        this.onAccent = i2;
        this.accentContainer = i3;
        this.onAccentContainer = i4;
    }

    public final int getAccent() {
        return this.accent;
    }

    public final int getOnAccent() {
        return this.onAccent;
    }

    public final int getAccentContainer() {
        return this.accentContainer;
    }

    public final int getOnAccentContainer() {
        return this.onAccentContainer;
    }
}
