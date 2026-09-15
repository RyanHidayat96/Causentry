package com.google.android.gms.common.images;

/* JADX INFO: loaded from: classes6.dex */
public final class Size {
    private final int zaa;
    private final int zab;

    private static NumberFormatException zaa(String str) {
        StringBuilder sb = new StringBuilder("Invalid Size: \"");
        sb.append(str);
        sb.append("\"");
        throw new NumberFormatException(sb.toString());
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof Size) {
            Size size = (Size) obj;
            if (this.zaa == size.zaa && this.zab == size.zab) {
                return true;
            }
        }
        return false;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.zaa);
        sb.append("x");
        sb.append(this.zab);
        return sb.toString();
    }

    public static Size parseSize(String str) throws NumberFormatException {
        if (str == null) {
            throw new IllegalArgumentException("string must not be null");
        }
        int iIndexOf = str.indexOf(42);
        if (iIndexOf < 0) {
            iIndexOf = str.indexOf(120);
        }
        if (iIndexOf < 0) {
            throw zaa(str);
        }
        try {
            return new Size(Integer.parseInt(str.substring(0, iIndexOf)), Integer.parseInt(str.substring(iIndexOf + 1)));
        } catch (NumberFormatException unused) {
            throw zaa(str);
        }
    }

    public Size(int i, int i2) {
        this.zaa = i;
        this.zab = i2;
    }

    public final int getHeight() {
        return this.zab;
    }

    public final int getWidth() {
        return this.zaa;
    }

    public final int hashCode() {
        int i = this.zaa;
        return ((i << 16) | (i >>> 16)) ^ this.zab;
    }
}
