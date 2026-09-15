package defpackage;

import androidx.core.util.Pair;

/* JADX INFO: loaded from: classes6.dex */
public final class MediaControllerCompatTransportControls<T> {
    public T TuitionPaymentFragmentbindingInflater1;
    public T b;

    public final boolean equals(Object obj) {
        if (!(obj instanceof Pair)) {
            return false;
        }
        Pair pair = (Pair) obj;
        Object obj2 = pair.first;
        Object obj3 = this.TuitionPaymentFragmentbindingInflater1;
        if (obj2 == obj3 || (obj2 != null && obj2.equals(obj3))) {
            Object obj4 = pair.second;
            Object obj5 = this.b;
            if (obj4 == obj5) {
                return true;
            }
            if (obj4 != null && obj4.equals(obj5)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        T t = this.TuitionPaymentFragmentbindingInflater1;
        int iHashCode = t == null ? 0 : t.hashCode();
        T t2 = this.b;
        return iHashCode ^ (t2 != null ? t2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Pair{");
        sb.append(String.valueOf(this.TuitionPaymentFragmentbindingInflater1));
        sb.append(" ");
        sb.append(String.valueOf(this.b));
        sb.append("}");
        return sb.toString();
    }
}
