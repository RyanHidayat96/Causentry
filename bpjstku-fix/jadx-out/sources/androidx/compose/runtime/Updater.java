package androidx.compose.runtime;

import androidx.exifinterface.media.ExifInterface;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmInline;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0087@\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0011\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J>\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00020\u00072$\b\b\u0010\f\u001a\u001e\u0012\u0004\u0012\u00028\u0000\u0012\t\u0012\u00070\u0007¢\u0006\u0002\b\t\u0012\u0004\u0012\u00020\n0\b¢\u0006\u0002\b\u000bH\u0086\b¢\u0006\u0004\b\r\u0010\u000eJ?\u0010\u000f\u001a\u00020\n\"\u0004\b\u0001\u0010\u00102\u0006\u0010\u0004\u001a\u00028\u00012\"\u0010\f\u001a\u001e\u0012\u0004\u0012\u00028\u0000\u0012\t\u0012\u00078\u0001¢\u0006\u0002\b\t\u0012\u0004\u0012\u00020\n0\b¢\u0006\u0002\b\u000b¢\u0006\u0004\b\r\u0010\u0011J>\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00020\u00072$\b\b\u0010\f\u001a\u001e\u0012\u0004\u0012\u00028\u0000\u0012\t\u0012\u00070\u0007¢\u0006\u0002\b\t\u0012\u0004\u0012\u00020\n0\b¢\u0006\u0002\b\u000bH\u0086\b¢\u0006\u0004\b\u0012\u0010\u000eJ?\u0010\u0013\u001a\u00020\n\"\u0004\b\u0001\u0010\u00102\u0006\u0010\u0004\u001a\u00028\u00012\"\u0010\f\u001a\u001e\u0012\u0004\u0012\u00028\u0000\u0012\t\u0012\u00078\u0001¢\u0006\u0002\b\t\u0012\u0004\u0012\u00020\n0\b¢\u0006\u0002\b\u000b¢\u0006\u0004\b\u0012\u0010\u0011J&\u0010\u0017\u001a\u00020\n2\u0017\u0010\u0004\u001a\u0013\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\n0\u0014¢\u0006\u0002\b\u000b¢\u0006\u0004\b\u0015\u0010\u0016J&\u0010\u0019\u001a\u00020\n2\u0017\u0010\u0004\u001a\u0013\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\n0\u0014¢\u0006\u0002\b\u000b¢\u0006\u0004\b\u0018\u0010\u0016J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010 \u001a\u00020\u001fHÖ\u0001¢\u0006\u0004\b \u0010!R\u001a\u0010\"\u001a\u00020\u00038\u0000X\u0081\u0004¢\u0006\f\n\u0004\b\"\u0010#\u0012\u0004\b$\u0010%\u0088\u0001\"\u0092\u0001\u00020\u0003"}, d2 = {"Landroidx/compose/runtime/Updater;", ExifInterface.GPS_DIRECTION_TRUE, "", "Landroidx/compose/runtime/Composer;", "p0", "constructor-impl", "(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;", "", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "", "Lkotlin/ExtensionFunctionType;", "p1", "set-impl", "(Landroidx/compose/runtime/Composer;ILkotlin/jvm/functions/Function2;)V", "set", ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V", "update-impl", "update", "Lkotlin/Function1;", "init-impl", "(Landroidx/compose/runtime/Composer;Lkotlin/jvm/functions/Function1;)V", "init", "reconcile-impl", "reconcile", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "composer", "Landroidx/compose/runtime/Composer;", "getComposer$annotations", "()V"}, k = 1, mv = {2, 0, 0}, xi = 48)
@JvmInline
public final class Updater<T> {
    private final Composer composer;

    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    public static <T> Composer m3536constructorimpl(Composer composer) {
        return composer;
    }

    public static /* synthetic */ void getComposer$annotations() {
    }

    private /* synthetic */ Updater(Composer composer) {
        this.composer = composer;
    }

    /* JADX INFO: renamed from: set-impl, reason: not valid java name */
    public static final void m3542setimpl(Composer composer, int i, Function2<? super T, ? super Integer, Unit> function2) {
        if (composer.getInserting() || !Intrinsics.areEqual(composer.rememberedValue(), Integer.valueOf(i))) {
            composer.updateRememberedValue(Integer.valueOf(i));
            composer.apply(Integer.valueOf(i), function2);
        }
    }

    /* JADX INFO: renamed from: set-impl, reason: not valid java name */
    public static final <V> void m3543setimpl(Composer composer, V v, Function2<? super T, ? super V, Unit> function2) {
        if (composer.getInserting() || !Intrinsics.areEqual(composer.rememberedValue(), v)) {
            composer.updateRememberedValue(v);
            composer.apply(v, function2);
        }
    }

    /* JADX INFO: renamed from: update-impl, reason: not valid java name */
    public static final void m3545updateimpl(Composer composer, int i, Function2<? super T, ? super Integer, Unit> function2) {
        boolean inserting = composer.getInserting();
        if (inserting || !Intrinsics.areEqual(composer.rememberedValue(), Integer.valueOf(i))) {
            composer.updateRememberedValue(Integer.valueOf(i));
            if (inserting) {
                return;
            }
            composer.apply(Integer.valueOf(i), function2);
        }
    }

    /* JADX INFO: renamed from: update-impl, reason: not valid java name */
    public static final <V> void m3546updateimpl(Composer composer, V v, Function2<? super T, ? super V, Unit> function2) {
        boolean inserting = composer.getInserting();
        if (inserting || !Intrinsics.areEqual(composer.rememberedValue(), v)) {
            composer.updateRememberedValue(v);
            if (inserting) {
                return;
            }
            composer.apply(v, function2);
        }
    }

    /* JADX INFO: renamed from: init-impl, reason: not valid java name */
    public static final void m3540initimpl(Composer composer, final Function1<? super T, Unit> function1) {
        if (composer.getInserting()) {
            composer.apply(Unit.INSTANCE, new Function2() { // from class: androidx.compose.runtime.Updater$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return Updater.init_impl$lambda$4(function1, obj, (Unit) obj2);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit init_impl$lambda$4(Function1 function1, Object obj, Unit unit) {
        function1.invoke(obj);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: reconcile-impl, reason: not valid java name */
    public static final void m3541reconcileimpl(Composer composer, final Function1<? super T, Unit> function1) {
        composer.apply(Unit.INSTANCE, new Function2() { // from class: androidx.compose.runtime.Updater$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return Updater.reconcile_impl$lambda$5(function1, obj, (Unit) obj2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit reconcile_impl$lambda$5(Function1 function1, Object obj, Unit unit) {
        function1.invoke(obj);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ Updater m3535boximpl(Composer composer) {
        return new Updater(composer);
    }

    /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
    public static boolean m3537equalsimpl(Composer composer, Object obj) {
        return (obj instanceof Updater) && Intrinsics.areEqual(composer, ((Updater) obj).getComposer());
    }

    /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m3538equalsimpl0(Composer composer, Composer composer2) {
        return Intrinsics.areEqual(composer, composer2);
    }

    /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
    public static int m3539hashCodeimpl(Composer composer) {
        return composer.hashCode();
    }

    /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
    public static String m3544toStringimpl(Composer composer) {
        StringBuilder sb = new StringBuilder("Updater(composer=");
        sb.append(composer);
        sb.append(')');
        return sb.toString();
    }

    public final boolean equals(Object p0) {
        return m3537equalsimpl(this.composer, p0);
    }

    public final int hashCode() {
        return m3539hashCodeimpl(this.composer);
    }

    public final String toString() {
        return m3544toStringimpl(this.composer);
    }

    /* JADX INFO: renamed from: unbox-impl, reason: not valid java name and from getter */
    public final /* synthetic */ Composer getComposer() {
        return this.composer;
    }
}
