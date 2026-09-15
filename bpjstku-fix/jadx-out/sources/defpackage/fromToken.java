package defpackage;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class fromToken<V, O> implements MediaControllerCompatApi21<V, O> {
    public final List<onSkipToNext<V>> b;

    fromToken(V v) {
        this(Collections.singletonList(new onSkipToNext(v)));
    }

    fromToken(List<onSkipToNext<V>> list) {
        this.b = list;
    }

    @Override // defpackage.MediaControllerCompatApi21
    public List<onSkipToNext<V>> TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        return this.b;
    }

    @Override // defpackage.MediaControllerCompatApi21
    public boolean TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        return this.b.isEmpty() || (this.b.size() == 1 && this.b.get(0).asBinder == null);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (!this.b.isEmpty()) {
            sb.append("values=");
            sb.append(Arrays.toString(this.b.toArray()));
        }
        return sb.toString();
    }
}
