package defpackage;

import coil.memory.MemoryCache;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class getText implements MemoryCache {
    private final MediaMetadataCompatBuilder TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    private final putLong TuitionPaymentFragmentspecialinlinedviewModeldefault2;

    public getText(MediaMetadataCompatBuilder mediaMetadataCompatBuilder, putLong putlong) {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = mediaMetadataCompatBuilder;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = putlong;
    }

    @Override // coil.memory.MemoryCache
    public final MemoryCache.TuitionPaymentFragmentbindingInflater1 TuitionPaymentFragmentspecialinlinedviewModeldefault2(MemoryCache.Key key) {
        MemoryCache.TuitionPaymentFragmentbindingInflater1 tuitionPaymentFragmentbindingInflater1TuitionPaymentFragmentspecialinlinedviewModeldefault3 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault3(key);
        return tuitionPaymentFragmentbindingInflater1TuitionPaymentFragmentspecialinlinedviewModeldefault3 == null ? this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.b(key) : tuitionPaymentFragmentbindingInflater1TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    }

    @Override // coil.memory.MemoryCache
    public final void b(MemoryCache.Key key, MemoryCache.TuitionPaymentFragmentbindingInflater1 tuitionPaymentFragmentbindingInflater1) {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault1(MemoryCache.Key.TuitionPaymentFragmentspecialinlinedviewModeldefault3(key.b, (Map<String, String>) getPackageName.TuitionPaymentFragmentbindingInflater1(key.TuitionPaymentFragmentspecialinlinedviewModeldefault3())), tuitionPaymentFragmentbindingInflater1.getTuitionPaymentFragmentspecialinlinedviewModeldefault1(), getPackageName.TuitionPaymentFragmentbindingInflater1(tuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentbindingInflater1()));
    }

    @Override // coil.memory.MemoryCache
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault2(int i) {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault3(i);
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault3(i);
    }
}
