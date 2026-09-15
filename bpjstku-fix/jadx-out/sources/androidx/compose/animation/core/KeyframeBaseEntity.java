package androidx.compose.animation.core;

import androidx.exifinterface.media.ExifInterface;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\b7\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0019\b\u0004\u0012\u0006\u0010\u0003\u001a\u00028\u0000\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J9\u0010\f\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\u00040\u000b\"\b\b\u0001\u0010\t*\u00020\b2\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\nH\u0001¢\u0006\u0004\b\f\u0010\rR\"\u0010\u000e\u001a\u00020\u00048\u0001@\u0001X\u0081\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0014\u001a\u00028\u00008\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\u0082\u0001\u0001\u0018"}, d2 = {"Landroidx/compose/animation/core/KeyframeBaseEntity;", ExifInterface.GPS_DIRECTION_TRUE, "", "p0", "Landroidx/compose/animation/core/Easing;", "p1", "<init>", "(Ljava/lang/Object;Landroidx/compose/animation/core/Easing;)V", "Landroidx/compose/animation/core/AnimationVector;", ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "Lkotlin/Function1;", "Lkotlin/Pair;", "toPair$animation_core_release", "(Lkotlin/jvm/functions/Function1;)Lkotlin/Pair;", "easing", "Landroidx/compose/animation/core/Easing;", "getEasing$animation_core_release", "()Landroidx/compose/animation/core/Easing;", "setEasing$animation_core_release", "(Landroidx/compose/animation/core/Easing;)V", "value", "Ljava/lang/Object;", "getValue$animation_core_release", "()Ljava/lang/Object;", "Landroidx/compose/animation/core/KeyframesSpec$KeyframeEntity;"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class KeyframeBaseEntity<T> {
    public static final int $stable = 8;
    private Easing easing;
    private final T value;

    private KeyframeBaseEntity(T t, Easing easing) {
        this.value = t;
        this.easing = easing;
    }

    public final T getValue$animation_core_release() {
        return this.value;
    }

    /* JADX INFO: renamed from: getEasing$animation_core_release, reason: from getter */
    public final Easing getEasing() {
        return this.easing;
    }

    public final void setEasing$animation_core_release(Easing easing) {
        this.easing = easing;
    }

    public final <V extends AnimationVector> Pair<V, Easing> toPair$animation_core_release(Function1<? super T, ? extends V> p0) {
        return TuplesKt.to(p0.invoke(this.value), this.easing);
    }

    public /* synthetic */ KeyframeBaseEntity(Object obj, Easing easing, DefaultConstructorMarker defaultConstructorMarker) {
        this(obj, easing);
    }
}
