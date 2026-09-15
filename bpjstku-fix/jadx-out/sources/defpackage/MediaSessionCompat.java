package defpackage;

import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class MediaSessionCompat implements toLegacyStreamType {
    public final String TuitionPaymentFragmentbindingInflater1;
    public final List<toLegacyStreamType> TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    public final boolean b;

    public MediaSessionCompat(String str, List<toLegacyStreamType> list, boolean z) {
        this.TuitionPaymentFragmentbindingInflater1 = str;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = list;
        this.b = z;
    }

    @Override // defpackage.toLegacyStreamType
    public final setRepeatMode TuitionPaymentFragmentspecialinlinedviewModeldefault2(prepare prepareVar, fromMediaSession frommediasession) {
        return new skipToQueueItem(prepareVar, frommediasession, this);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ShapeGroup{name='");
        sb.append(this.TuitionPaymentFragmentbindingInflater1);
        sb.append("' Shapes: ");
        sb.append(Arrays.toString(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.toArray()));
        sb.append('}');
        return sb.toString();
    }
}
