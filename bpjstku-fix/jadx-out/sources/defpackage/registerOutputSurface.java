package defpackage;

import android.text.TextUtils;

/* JADX INFO: loaded from: classes4.dex */
public final class registerOutputSurface implements useAndConfigureProgramWithTexture, Cloneable {
    private final String TuitionPaymentFragmentbindingInflater1;
    private final String b;

    public registerOutputSurface(String str, String str2) {
        if (str == null) {
            throw new IllegalArgumentException("Name may not be null");
        }
        this.b = str;
        this.TuitionPaymentFragmentbindingInflater1 = str2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.b);
        sb.append("=");
        sb.append(this.TuitionPaymentFragmentbindingInflater1);
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof useAndConfigureProgramWithTexture) {
            registerOutputSurface registeroutputsurface = (registerOutputSurface) obj;
            if (this.b.equals(registeroutputsurface.b) && TextUtils.equals(this.TuitionPaymentFragmentbindingInflater1, registeroutputsurface.TuitionPaymentFragmentbindingInflater1)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode() ^ this.TuitionPaymentFragmentbindingInflater1.hashCode();
    }

    public final Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
