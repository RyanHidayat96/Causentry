package androidx.core.util;

import android.util.LruCache;
import androidx.exifinterface.media.ExifInterface;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a¹\u0001\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u000e\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032$\b\u0006\u0010\u0007\u001a\u001e\u0012\t\u0012\u00078\u0000¢\u0006\u0002\b\u0006\u0012\t\u0012\u00078\u0001¢\u0006\u0002\b\u0006\u0012\u0004\u0012\u00020\u00030\u00052\u001b\b\u0006\u0010\t\u001a\u0015\u0012\t\u0012\u00078\u0000¢\u0006\u0002\b\u0006\u0012\u0006\u0012\u0004\u0018\u00018\u00010\b2<\b\u0006\u0010\r\u001a6\u0012\t\u0012\u00070\u000b¢\u0006\u0002\b\u0006\u0012\t\u0012\u00078\u0000¢\u0006\u0002\b\u0006\u0012\t\u0012\u00078\u0001¢\u0006\u0002\b\u0006\u0012\u000b\u0012\t\u0018\u00018\u0001¢\u0006\u0002\b\u0006\u0012\u0004\u0012\u00020\f0\nH\u0087\b¢\u0006\u0004\b\u000f\u0010\u0010"}, d2 = {"", "K", ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "", "p0", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "p1", "Lkotlin/Function1;", "p2", "Lkotlin/Function4;", "", "", "p3", "Landroid/util/LruCache;", "lruCache", "(ILkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function4;)Landroid/util/LruCache;"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class LruCacheKt {
    public static /* synthetic */ LruCache lruCache$default(int i, Function2 function2, Function1 function1, Function4 function4, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            function2 = new Function2<K, V, Integer>() { // from class: androidx.core.util.LruCacheKt.lruCache.1
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // kotlin.jvm.functions.Function2
                public final Integer invoke(K k, V v) {
                    return 1;
                }
            };
        }
        if ((i2 & 4) != 0) {
            function1 = new Function1<K, V>() { // from class: androidx.core.util.LruCacheKt.lruCache.2
                @Override // kotlin.jvm.functions.Function1
                public final V invoke(K k) {
                    return null;
                }
            };
        }
        if ((i2 & 8) != 0) {
            function4 = new Function4<Boolean, K, V, V, Unit>() { // from class: androidx.core.util.LruCacheKt.lruCache.3
                public final void invoke(boolean z, K k, V v, V v2) {
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // kotlin.jvm.functions.Function4
                public final /* bridge */ /* synthetic */ Unit invoke(Boolean bool, Object obj2, Object obj3, Object obj4) {
                    invoke(bool.booleanValue(), obj2, obj3, obj4);
                    return Unit.INSTANCE;
                }
            };
        }
        return new AnonymousClass4(i, function2, function1, function4);
    }

    /* JADX INFO: Add missing generic type declarations: [V, K] */
    /* JADX INFO: renamed from: androidx.core.util.LruCacheKt$lruCache$4, reason: invalid class name */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u000b\u0018\u00002\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0001J\u001f\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0002\u001a\u00028\u00002\u0006\u0010\u0003\u001a\u00028\u0001H\u0014¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\u0007\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u0014¢\u0006\u0004\b\u0007\u0010\bJ1\u0010\r\u001a\u00020\f2\u0006\u0010\u0002\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00028\u00002\u0006\u0010\n\u001a\u00028\u00012\b\u0010\u000b\u001a\u0004\u0018\u00018\u0001H\u0014¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Landroidx/core/util/LruCacheKt$lruCache$4;", "Landroid/util/LruCache;", "p0", "p1", "", "sizeOf", "(Ljava/lang/Object;Ljava/lang/Object;)I", "create", "(Ljava/lang/Object;)Ljava/lang/Object;", "", "p2", "p3", "", "entryRemoved", "(ZLjava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V"}, k = 1, mv = {2, 1, 0}, xi = 176)
    public static final class AnonymousClass4<K, V> extends LruCache<K, V> {
        final /* synthetic */ Function1<K, V> $create;
        final /* synthetic */ Function4<Boolean, K, V, V, Unit> $onEntryRemoved;
        final /* synthetic */ Function2<K, V, Integer> $sizeOf;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass4(int i, Function2<? super K, ? super V, Integer> function2, Function1<? super K, ? extends V> function1, Function4<? super Boolean, ? super K, ? super V, ? super V, Unit> function4) {
            super(i);
            this.$sizeOf = function2;
            this.$create = function1;
            this.$onEntryRemoved = function4;
        }

        @Override // android.util.LruCache
        protected final int sizeOf(K p0, V p1) {
            return this.$sizeOf.invoke(p0, p1).intValue();
        }

        @Override // android.util.LruCache
        protected final V create(K p0) {
            return this.$create.invoke(p0);
        }

        @Override // android.util.LruCache
        protected final void entryRemoved(boolean p0, K p1, V p2, V p3) {
            this.$onEntryRemoved.invoke(Boolean.valueOf(p0), p1, p2, p3);
        }
    }

    public static final <K, V> LruCache<K, V> lruCache(int i, Function2<? super K, ? super V, Integer> function2, Function1<? super K, ? extends V> function1, Function4<? super Boolean, ? super K, ? super V, ? super V, Unit> function4) {
        return new AnonymousClass4(i, function2, function1, function4);
    }
}
