package defpackage;

import android.graphics.Bitmap;
import androidx.collection.LruCache;
import coil.memory.MemoryCache;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class putRating implements MediaMetadataCompatBuilder {
    final putLong TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    private final b TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    public putRating(int i, putLong putlong) {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = putlong;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = new b(i, this);
    }

    public static final class b extends LruCache<MemoryCache.Key, TuitionPaymentFragmentspecialinlinedviewModeldefault2> {
        private /* synthetic */ putRating TuitionPaymentFragmentspecialinlinedviewModeldefault1;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(int i, putRating putrating) {
            super(i);
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = putrating;
        }

        @Override // androidx.collection.LruCache
        public final /* synthetic */ void entryRemoved(boolean z, MemoryCache.Key key, TuitionPaymentFragmentspecialinlinedviewModeldefault2 tuitionPaymentFragmentspecialinlinedviewModeldefault2, TuitionPaymentFragmentspecialinlinedviewModeldefault2 tuitionPaymentFragmentspecialinlinedviewModeldefault3) {
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 tuitionPaymentFragmentspecialinlinedviewModeldefault4 = tuitionPaymentFragmentspecialinlinedviewModeldefault2;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault2(key, tuitionPaymentFragmentspecialinlinedviewModeldefault4.TuitionPaymentFragmentbindingInflater1(), tuitionPaymentFragmentspecialinlinedviewModeldefault4.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), tuitionPaymentFragmentspecialinlinedviewModeldefault4.b());
        }

        @Override // androidx.collection.LruCache
        public final /* synthetic */ int sizeOf(MemoryCache.Key key, TuitionPaymentFragmentspecialinlinedviewModeldefault2 tuitionPaymentFragmentspecialinlinedviewModeldefault2) {
            return b(tuitionPaymentFragmentspecialinlinedviewModeldefault2);
        }

        private static int b(TuitionPaymentFragmentspecialinlinedviewModeldefault2 tuitionPaymentFragmentspecialinlinedviewModeldefault2) {
            return tuitionPaymentFragmentspecialinlinedviewModeldefault2.b();
        }
    }

    private int TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        return this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.maxSize();
    }

    @Override // defpackage.MediaMetadataCompatBuilder
    public final MemoryCache.TuitionPaymentFragmentbindingInflater1 TuitionPaymentFragmentspecialinlinedviewModeldefault3(MemoryCache.Key key) {
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 tuitionPaymentFragmentspecialinlinedviewModeldefault2 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.get(key);
        if (tuitionPaymentFragmentspecialinlinedviewModeldefault2 != null) {
            return new MemoryCache.TuitionPaymentFragmentbindingInflater1(tuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentbindingInflater1(), tuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault1());
        }
        return null;
    }

    @Override // defpackage.MediaMetadataCompatBuilder
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault1(MemoryCache.Key key, Bitmap bitmap, Map<String, ? extends Object> map) {
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = fastForward.TuitionPaymentFragmentspecialinlinedviewModeldefault2(bitmap);
        if (iTuitionPaymentFragmentspecialinlinedviewModeldefault2 <= TuitionPaymentFragmentspecialinlinedviewModeldefault2()) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.put(key, new TuitionPaymentFragmentspecialinlinedviewModeldefault2(bitmap, map, iTuitionPaymentFragmentspecialinlinedviewModeldefault2));
        } else {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.remove(key);
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault2(key, bitmap, map, iTuitionPaymentFragmentspecialinlinedviewModeldefault2);
        }
    }

    static final class TuitionPaymentFragmentspecialinlinedviewModeldefault2 {
        private final int TuitionPaymentFragmentbindingInflater1;
        private final Bitmap TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        private final Map<String, Object> TuitionPaymentFragmentspecialinlinedviewModeldefault3;

        public TuitionPaymentFragmentspecialinlinedviewModeldefault2(Bitmap bitmap, Map<String, ? extends Object> map, int i) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = bitmap;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = map;
            this.TuitionPaymentFragmentbindingInflater1 = i;
        }

        public final Bitmap TuitionPaymentFragmentbindingInflater1() {
            return this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        }

        public final Map<String, Object> TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
            return this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        }

        public final int b() {
            return this.TuitionPaymentFragmentbindingInflater1;
        }
    }

    @Override // defpackage.MediaMetadataCompatBuilder
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault3(int i) {
        if (i >= 40) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.evictAll();
        } else {
            if (10 > i || i >= 20) {
                return;
            }
            b bVar = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            bVar.trimToSize(bVar.size() / 2);
        }
    }
}
