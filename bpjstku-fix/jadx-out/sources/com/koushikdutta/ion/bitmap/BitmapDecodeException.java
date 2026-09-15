package com.koushikdutta.ion.bitmap;

/* JADX INFO: loaded from: classes4.dex */
public class BitmapDecodeException extends Exception {
    public final int height;
    public final int width;

    public BitmapDecodeException(int i, int i2) {
        this.width = i;
        this.height = i2;
    }

    @Override // java.lang.Throwable
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(" size=");
        sb.append(this.width);
        sb.append('x');
        sb.append(this.height);
        return sb.toString();
    }
}
