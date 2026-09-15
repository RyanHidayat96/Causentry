package com.google.android.gms.maps.model;

/* JADX INFO: loaded from: classes6.dex */
public final class Gap extends PatternItem {
    public final float length;

    public Gap(float f) {
        super(2, Float.valueOf(Math.max(f, 0.0f)));
        this.length = Math.max(f, 0.0f);
    }

    @Override // com.google.android.gms.maps.model.PatternItem
    public final String toString() {
        StringBuilder sb = new StringBuilder("[Gap: length=");
        sb.append(this.length);
        sb.append("]");
        return sb.toString();
    }
}
