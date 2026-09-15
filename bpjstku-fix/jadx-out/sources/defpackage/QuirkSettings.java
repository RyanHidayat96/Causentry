package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
final class QuirkSettings {
    final List<emptyBundle> TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    final int TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    private final boolean b = false;

    QuirkSettings(List<emptyBundle> list, int i, boolean z) {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = new ArrayList(list);
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("{ ");
        sb.append(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
        sb.append(" }");
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof QuirkSettings)) {
            return false;
        }
        QuirkSettings quirkSettings = (QuirkSettings) obj;
        return this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.equals(quirkSettings.TuitionPaymentFragmentspecialinlinedviewModeldefault1) && this.b == quirkSettings.b;
    }

    public final int hashCode() {
        return this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.hashCode() ^ Boolean.valueOf(this.b).hashCode();
    }
}
