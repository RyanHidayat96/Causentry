package defpackage;

import android.graphics.Bitmap;
import coil.memory.MemoryCache;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes.dex */
public final class putBitmap implements putLong {
    private final LinkedHashMap<MemoryCache.Key, ArrayList<TuitionPaymentFragmentspecialinlinedviewModeldefault2>> TuitionPaymentFragmentbindingInflater1 = new LinkedHashMap<>();
    private int TuitionPaymentFragmentspecialinlinedviewModeldefault1;

    @Override // defpackage.putLong
    public final MemoryCache.TuitionPaymentFragmentbindingInflater1 b(MemoryCache.Key key) {
        synchronized (this) {
            ArrayList<TuitionPaymentFragmentspecialinlinedviewModeldefault2> arrayList = this.TuitionPaymentFragmentbindingInflater1.get(key);
            MemoryCache.TuitionPaymentFragmentbindingInflater1 tuitionPaymentFragmentbindingInflater1 = null;
            if (arrayList == null) {
                return null;
            }
            ArrayList<TuitionPaymentFragmentspecialinlinedviewModeldefault2> arrayList2 = arrayList;
            int size = arrayList2.size();
            for (int i = 0; i < size; i++) {
                TuitionPaymentFragmentspecialinlinedviewModeldefault2 tuitionPaymentFragmentspecialinlinedviewModeldefault2 = arrayList2.get(i);
                Bitmap bitmap = tuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentbindingInflater1.get();
                MemoryCache.TuitionPaymentFragmentbindingInflater1 tuitionPaymentFragmentbindingInflater2 = bitmap != null ? new MemoryCache.TuitionPaymentFragmentbindingInflater1(bitmap, tuitionPaymentFragmentspecialinlinedviewModeldefault2.b) : null;
                if (tuitionPaymentFragmentbindingInflater2 != null) {
                    tuitionPaymentFragmentbindingInflater1 = tuitionPaymentFragmentbindingInflater2;
                    break;
                }
            }
            int i2 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 + 1;
            if (i2 >= 10) {
                TuitionPaymentFragmentspecialinlinedviewModeldefault2();
            }
            return tuitionPaymentFragmentbindingInflater1;
        }
    }

    @Override // defpackage.putLong
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault2(MemoryCache.Key key, Bitmap bitmap, Map<String, ? extends Object> map, int i) {
        synchronized (this) {
            LinkedHashMap<MemoryCache.Key, ArrayList<TuitionPaymentFragmentspecialinlinedviewModeldefault2>> linkedHashMap = this.TuitionPaymentFragmentbindingInflater1;
            ArrayList<TuitionPaymentFragmentspecialinlinedviewModeldefault2> arrayList = linkedHashMap.get(key);
            if (arrayList == null) {
                arrayList = new ArrayList<>();
                linkedHashMap.put(key, arrayList);
            }
            ArrayList<TuitionPaymentFragmentspecialinlinedviewModeldefault2> arrayList2 = arrayList;
            putBitmap putbitmap = this;
            int iIdentityHashCode = System.identityHashCode(bitmap);
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 tuitionPaymentFragmentspecialinlinedviewModeldefault2 = new TuitionPaymentFragmentspecialinlinedviewModeldefault2(iIdentityHashCode, new WeakReference(bitmap), map, i);
            int size = arrayList2.size();
            int i2 = 0;
            while (true) {
                if (i2 < size) {
                    TuitionPaymentFragmentspecialinlinedviewModeldefault2 tuitionPaymentFragmentspecialinlinedviewModeldefault3 = arrayList2.get(i2);
                    if (i >= tuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault3) {
                        if (tuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault1 == iIdentityHashCode && tuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentbindingInflater1.get() == bitmap) {
                            arrayList2.set(i2, tuitionPaymentFragmentspecialinlinedviewModeldefault2);
                            break;
                        } else {
                            arrayList2.add(i2, tuitionPaymentFragmentspecialinlinedviewModeldefault2);
                            break;
                        }
                    }
                    i2++;
                } else {
                    arrayList2.add(tuitionPaymentFragmentspecialinlinedviewModeldefault2);
                    break;
                }
            }
            int i3 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3 + 1;
            if (i3 >= 10) {
                TuitionPaymentFragmentspecialinlinedviewModeldefault2();
            }
        }
    }

    @Override // defpackage.putLong
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault3(int i) {
        synchronized (this) {
            if (i >= 10 && i != 20) {
                TuitionPaymentFragmentspecialinlinedviewModeldefault2();
            }
        }
    }

    private void TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        WeakReference<Bitmap> weakReference;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
        Iterator<ArrayList<TuitionPaymentFragmentspecialinlinedviewModeldefault2>> it = this.TuitionPaymentFragmentbindingInflater1.values().iterator();
        while (it.hasNext()) {
            ArrayList<TuitionPaymentFragmentspecialinlinedviewModeldefault2> next = it.next();
            if (next.size() <= 1) {
                TuitionPaymentFragmentspecialinlinedviewModeldefault2 tuitionPaymentFragmentspecialinlinedviewModeldefault2 = (TuitionPaymentFragmentspecialinlinedviewModeldefault2) CollectionsKt.firstOrNull((List) next);
                if (((tuitionPaymentFragmentspecialinlinedviewModeldefault2 == null || (weakReference = tuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentbindingInflater1) == null) ? null : weakReference.get()) == null) {
                    it.remove();
                }
            } else {
                ArrayList<TuitionPaymentFragmentspecialinlinedviewModeldefault2> arrayList = next;
                int size = arrayList.size();
                int i = 0;
                for (int i2 = 0; i2 < size; i2++) {
                    int i3 = i2 - i;
                    if (arrayList.get(i3).TuitionPaymentFragmentbindingInflater1.get() == null) {
                        arrayList.remove(i3);
                        i++;
                    }
                }
                if (next.isEmpty()) {
                    it.remove();
                }
            }
        }
    }

    public static final class TuitionPaymentFragmentspecialinlinedviewModeldefault2 {
        final WeakReference<Bitmap> TuitionPaymentFragmentbindingInflater1;
        final int TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        final int TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        final Map<String, Object> b;

        public TuitionPaymentFragmentspecialinlinedviewModeldefault2(int i, WeakReference<Bitmap> weakReference, Map<String, ? extends Object> map, int i2) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i;
            this.TuitionPaymentFragmentbindingInflater1 = weakReference;
            this.b = map;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LputBitmap$b;", "", "<init>", "()V"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        new b(null);
    }
}
