package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final class onImageProxyAvailable {
    public final String TuitionPaymentFragmentbindingInflater1;
    private final int b;

    public onImageProxyAvailable(String str, int i) {
        this.TuitionPaymentFragmentbindingInflater1 = str;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            onImageProxyAvailable onimageproxyavailable = (onImageProxyAvailable) obj;
            if (this.b != onimageproxyavailable.b) {
                return false;
            }
            String str = this.TuitionPaymentFragmentbindingInflater1;
            String str2 = onimageproxyavailable.TuitionPaymentFragmentbindingInflater1;
            if (str != null) {
                return str.equals(str2);
            }
            if (str2 == null) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.TuitionPaymentFragmentbindingInflater1;
        return ((str != null ? str.hashCode() : 0) * 31) + this.b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ComponentIdentity{componentName='");
        sb.append(this.TuitionPaymentFragmentbindingInflater1);
        sb.append("', uniqueId=");
        sb.append(this.b);
        sb.append('}');
        return sb.toString();
    }
}
