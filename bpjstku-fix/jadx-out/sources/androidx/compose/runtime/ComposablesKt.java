package androidx.compose.runtime;

import androidx.exifinterface.media.ExifInterface;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.NotImplementedError;
import kotlin.ReplaceWith;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0086\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a+\u0010\u0004\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00002\u0013\b\u0004\u0010\u0003\u001a\r\u0012\u0004\u0012\u00028\u00000\u0001¢\u0006\u0002\b\u0002H\u0087\b¢\u0006\u0004\b\u0004\u0010\u0005\u001a5\u0010\u0004\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u00062\u0013\b\u0004\u0010\u0007\u001a\r\u0012\u0004\u0012\u00028\u00000\u0001¢\u0006\u0002\b\u0002H\u0087\b¢\u0006\u0004\b\u0004\u0010\b\u001a?\u0010\u0004\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0013\b\u0004\u0010\t\u001a\r\u0012\u0004\u0012\u00028\u00000\u0001¢\u0006\u0002\b\u0002H\u0087\b¢\u0006\u0004\b\u0004\u0010\n\u001aI\u0010\u0004\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\u00062\u0013\b\u0004\u0010\u000b\u001a\r\u0012\u0004\u0012\u00028\u00000\u0001¢\u0006\u0002\b\u0002H\u0087\b¢\u0006\u0004\b\u0004\u0010\f\u001aC\u0010\u0004\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00002\u0016\u0010\u0003\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00060\r\"\u0004\u0018\u00010\u00062\u0013\b\u0004\u0010\u0007\u001a\r\u0012\u0004\u0012\u00028\u00000\u0001¢\u0006\u0002\b\u0002H\u0087\b¢\u0006\u0004\b\u0004\u0010\u000e\u001aA\u0010\u0010\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00002\u0016\u0010\u0003\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00060\r\"\u0004\u0018\u00010\u00062\u0011\u0010\u0007\u001a\r\u0012\u0004\u0012\u00028\u00000\u0001¢\u0006\u0002\b\u000fH\u0087\b¢\u0006\u0004\b\u0010\u0010\u0011\u001a-\u0010\u0013\u001a\u00020\u00122\b\u0010\u0003\u001a\u0004\u0018\u00010\u00062\u0011\u0010\u0007\u001a\r\u0012\u0004\u0012\u00020\u00120\u0001¢\u0006\u0002\b\u000fH\u0087\b¢\u0006\u0004\b\u0013\u0010\u0014\u001a-\u0010\u0016\u001a\u00020\u00122\u0006\u0010\u0003\u001a\u00020\u00152\u0013\b\u0004\u0010\u0007\u001a\r\u0012\u0004\u0012\u00020\u00120\u0001¢\u0006\u0002\b\u000fH\u0087\b¢\u0006\u0004\b\u0016\u0010\u0017\u001a^\u0010\u001d\u001a\u00020\u0012\"\b\b\u0000\u0010\u0000*\u00020\u0006\"\u000e\b\u0001\u0010\u0019\u0018\u0001*\u0006\u0012\u0002\b\u00030\u00182\u000e\b\b\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00012\"\u0010\u0007\u001a\u001e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u001b\u0012\u0004\u0012\u00020\u00120\u001a¢\u0006\u0002\b\u0002¢\u0006\u0002\b\u001cH\u0087\b¢\u0006\u0004\b\u001d\u0010\u001e\u001a^\u0010\u001f\u001a\u00020\u0012\"\b\b\u0000\u0010\u0000*\u00020\u0006\"\u000e\b\u0001\u0010\u0019\u0018\u0001*\u0006\u0012\u0002\b\u00030\u00182\u000e\b\b\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00012\"\u0010\u0007\u001a\u001e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u001b\u0012\u0004\u0012\u00020\u00120\u001a¢\u0006\u0002\b\u0002¢\u0006\u0002\b\u001cH\u0087\b¢\u0006\u0004\b\u001f\u0010\u001e\u001as\u0010\u001d\u001a\u00020\u0012\"\n\b\u0000\u0010\u0000*\u0004\u0018\u00010\u0006\"\u000e\b\u0001\u0010\u0019\u0018\u0001*\u0006\u0012\u0002\b\u00030\u00182\u000e\b\b\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00012\"\u0010\u0007\u001a\u001e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u001b\u0012\u0004\u0012\u00020\u00120\u001a¢\u0006\u0002\b\u0002¢\u0006\u0002\b\u001c2\u0011\u0010\t\u001a\r\u0012\u0004\u0012\u00020\u00120\u0001¢\u0006\u0002\b\u000fH\u0087\b¢\u0006\u0004\b\u001d\u0010 \u001as\u0010\u001f\u001a\u00020\u0012\"\n\b\u0000\u0010\u0000*\u0004\u0018\u00010\u0006\"\u000e\b\u0001\u0010\u0019\u0018\u0001*\u0006\u0012\u0002\b\u00030\u00182\u000e\b\b\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00012\"\u0010\u0007\u001a\u001e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u001b\u0012\u0004\u0012\u00020\u00120\u001a¢\u0006\u0002\b\u0002¢\u0006\u0002\b\u001c2\u0011\u0010\t\u001a\r\u0012\u0004\u0012\u00020\u00120\u0001¢\u0006\u0002\b\u000fH\u0087\b¢\u0006\u0004\b\u001f\u0010 \u001a\u0093\u0001\u0010\u001d\u001a\u00020\u0012\"\u0004\b\u0000\u0010\u0000\"\u000e\b\u0001\u0010\u0019\u0018\u0001*\u0006\u0012\u0002\b\u00030\u00182\u000e\b\b\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00012\"\u0010\u0007\u001a\u001e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u001b\u0012\u0004\u0012\u00020\u00120\u001a¢\u0006\u0002\b\u0002¢\u0006\u0002\b\u001c2$\b\b\u0010\t\u001a\u001e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000!\u0012\u0004\u0012\u00020\u00120\u001a¢\u0006\u0002\b\u000f¢\u0006\u0002\b\u001c2\u0011\u0010\u000b\u001a\r\u0012\u0004\u0012\u00020\u00120\u0001¢\u0006\u0002\b\u000fH\u0087\b¢\u0006\u0004\b\u001d\u0010\"\u001a\u0093\u0001\u0010\u001f\u001a\u00020\u0012\"\u0004\b\u0000\u0010\u0000\"\u000e\b\u0001\u0010\u0019\u0018\u0001*\u0006\u0012\u0002\b\u00030\u00182\u000e\b\b\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00012\"\u0010\u0007\u001a\u001e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u001b\u0012\u0004\u0012\u00020\u00120\u001a¢\u0006\u0002\b\u0002¢\u0006\u0002\b\u001c2$\b\b\u0010\t\u001a\u001e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000!\u0012\u0004\u0012\u00020\u00120\u001a¢\u0006\u0002\b\u000f¢\u0006\u0002\b\u001c2\u0011\u0010\u000b\u001a\r\u0012\u0004\u0012\u00020\u00120\u0001¢\u0006\u0002\b\u000fH\u0087\b¢\u0006\u0004\b\u001f\u0010\"\u001a\u000f\u0010#\u001a\u00020\u0012H\u0001¢\u0006\u0004\b#\u0010$\u001a\u000f\u0010&\u001a\u00020%H\u0007¢\u0006\u0004\b&\u0010'\"\u0011\u0010+\u001a\u00020(8G¢\u0006\u0006\u001a\u0004\b)\u0010*\"\u001a\u0010.\u001a\u00020%8GX\u0087\u0004¢\u0006\f\u0012\u0004\b-\u0010$\u001a\u0004\b,\u0010'\"\u0011\u00102\u001a\u00020/8G¢\u0006\u0006\u001a\u0004\b0\u00101\"\u0017\u00107\u001a\u0002038G¢\u0006\f\u0012\u0004\b6\u0010$\u001a\u0004\b4\u00105\"\u001a\u0010<\u001a\u0002088GX\u0087\u0004¢\u0006\f\u0012\u0004\b;\u0010$\u001a\u0004\b9\u0010:\"\u0015\u0010A\u001a\u00060=j\u0002`>8G¢\u0006\u0006\u001a\u0004\b?\u0010@"}, d2 = {ExifInterface.GPS_DIRECTION_TRUE, "Lkotlin/Function0;", "Landroidx/compose/runtime/DisallowComposableCalls;", "p0", "remember", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)Ljava/lang/Object;", "", "p1", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)Ljava/lang/Object;", "p2", "(Ljava/lang/Object;Ljava/lang/Object;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)Ljava/lang/Object;", "p3", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)Ljava/lang/Object;", "", "([Ljava/lang/Object;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)Ljava/lang/Object;", "Landroidx/compose/runtime/Composable;", "key", "([Ljava/lang/Object;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)Ljava/lang/Object;", "", "ReusableContent", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "", "ReusableContentHost", "(ZLkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "Landroidx/compose/runtime/Applier;", ExifInterface.LONGITUDE_EAST, "Lkotlin/Function1;", "Landroidx/compose/runtime/Updater;", "Lkotlin/ExtensionFunctionType;", "ComposeNode", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "ReusableComposeNode", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "Landroidx/compose/runtime/SkippableUpdater;", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "invalidApplier", "()V", "Landroidx/compose/runtime/CompositionContext;", "rememberCompositionContext", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/CompositionContext;", "Landroidx/compose/runtime/Composer;", "getCurrentComposer", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/Composer;", "currentComposer", "getCurrentCompositionContext", "getCurrentCompositionContext$annotations", "currentCompositionContext", "Landroidx/compose/runtime/RecomposeScope;", "getCurrentRecomposeScope", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/RecomposeScope;", "currentRecomposeScope", "Landroidx/compose/runtime/CompositionLocalContext;", "getCurrentCompositionLocalContext", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/CompositionLocalContext;", "getCurrentCompositionLocalContext$annotations", "currentCompositionLocalContext", "", "getCurrentCompositeKeyHash", "(Landroidx/compose/runtime/Composer;I)I", "getCurrentCompositeKeyHash$annotations", "currentCompositeKeyHash", "", "Landroidx/compose/runtime/CompositeKeyHashCode;", "getCurrentCompositeKeyHashCode", "(Landroidx/compose/runtime/Composer;I)J", "currentCompositeKeyHashCode"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class ComposablesKt {
    @Deprecated(message = "Prefer the higher-precision currentCompositeKeyHashCode", replaceWith = @ReplaceWith(expression = "currentCompositeKeyHashCode", imports = {}))
    public static /* synthetic */ void getCurrentCompositeKeyHash$annotations() {
    }

    public static /* synthetic */ void getCurrentCompositionContext$annotations() {
    }

    public static /* synthetic */ void getCurrentCompositionLocalContext$annotations() {
    }

    public static final <T> T remember(Object obj, Function0<? extends T> function0, Composer composer, int i) {
        boolean zChanged = composer.changed(obj);
        T t = (T) composer.rememberedValue();
        if (!zChanged && t != Composer.INSTANCE.getEmpty()) {
            return t;
        }
        T tInvoke = function0.invoke();
        composer.updateRememberedValue(tInvoke);
        return tInvoke;
    }

    public static final <T> T remember(Object obj, Object obj2, Function0<? extends T> function0, Composer composer, int i) {
        boolean zChanged = composer.changed(obj);
        boolean zChanged2 = composer.changed(obj2);
        T t = (T) composer.rememberedValue();
        if ((!zChanged && !zChanged2) && t != Composer.INSTANCE.getEmpty()) {
            return t;
        }
        T tInvoke = function0.invoke();
        composer.updateRememberedValue(tInvoke);
        return tInvoke;
    }

    public static final <T> T remember(Object obj, Object obj2, Object obj3, Function0<? extends T> function0, Composer composer, int i) {
        boolean zChanged = composer.changed(obj);
        boolean zChanged2 = composer.changed(obj2);
        boolean zChanged3 = composer.changed(obj3);
        T t = (T) composer.rememberedValue();
        if ((!(zChanged | zChanged2) && !zChanged3) && t != Composer.INSTANCE.getEmpty()) {
            return t;
        }
        T tInvoke = function0.invoke();
        composer.updateRememberedValue(tInvoke);
        return tInvoke;
    }

    public static final <T> T remember(Object[] objArr, Function0<? extends T> function0, Composer composer, int i) {
        boolean zChanged = false;
        for (Object obj : objArr) {
            zChanged |= composer.changed(obj);
        }
        T t = (T) composer.rememberedValue();
        if (!zChanged && t != Composer.INSTANCE.getEmpty()) {
            return t;
        }
        T tInvoke = function0.invoke();
        composer.updateRememberedValue(tInvoke);
        return tInvoke;
    }

    public static final <T> T key(Object[] objArr, Function2<? super Composer, ? super Integer, ? extends T> function2, Composer composer, int i) {
        return function2.invoke(composer, Integer.valueOf((i >> 3) & 14));
    }

    public static final void ReusableContent(Object obj, Function2<? super Composer, ? super Integer, Unit> function2, Composer composer, int i) {
        composer.startReusableGroup(207, obj);
        function2.invoke(composer, Integer.valueOf((i >> 3) & 14));
        composer.endReusableGroup();
    }

    public static final void ReusableContentHost(boolean z, Function2<? super Composer, ? super Integer, Unit> function2, Composer composer, int i) {
        composer.startReusableGroup(207, Boolean.valueOf(z));
        boolean zChanged = composer.changed(z);
        if (z) {
            function2.invoke(composer, Integer.valueOf((i >> 3) & 14));
        } else {
            composer.deactivateToEndGroup(zChanged);
        }
        composer.endReusableGroup();
    }

    public static final Composer getCurrentComposer(Composer composer, int i) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-554250212, i, -1, "androidx.compose.runtime.<get-currentComposer> (Composables.kt:180)");
        }
        throw new NotImplementedError("Implemented as an intrinsic");
    }

    public static final CompositionContext getCurrentCompositionContext(Composer composer, int i) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1645225943, i, -1, "androidx.compose.runtime.<get-currentCompositionContext> (Composables.kt:195)");
        }
        ControlledComposition composition = composer.getComposition();
        Intrinsics.checkNotNull(composition, "");
        CompositionContext parent = ((CompositionImpl) composition).getParent();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return parent;
    }

    public static final RecomposeScope getCurrentRecomposeScope(Composer composer, int i) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(394957799, i, -1, "androidx.compose.runtime.<get-currentRecomposeScope> (Composables.kt:205)");
        }
        RecomposeScope recomposeScope = composer.getRecomposeScope();
        if (recomposeScope == null) {
            throw new IllegalStateException("no recompose scope found".toString());
        }
        composer.recordUsed(recomposeScope);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return recomposeScope;
    }

    public static final CompositionLocalContext getCurrentCompositionLocalContext(Composer composer, int i) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-43352356, i, -1, "androidx.compose.runtime.<get-currentCompositionLocalContext> (Composables.kt:220)");
        }
        CompositionLocalContext compositionLocalContext = new CompositionLocalContext(composer.buildContext().getCompositionLocalScope$runtime());
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return compositionLocalContext;
    }

    public static final int getCurrentCompositeKeyHash(Composer composer, int i) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(524444915, i, -1, "androidx.compose.runtime.<get-currentCompositeKeyHash> (Composables.kt:241)");
        }
        int compoundKeyHash = composer.getCompoundKeyHash();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return compoundKeyHash;
    }

    public static final long getCurrentCompositeKeyHashCode(Composer composer, int i) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-168259424, i, -1, "androidx.compose.runtime.<get-currentCompositeKeyHashCode> (Composables.kt:257)");
        }
        long compositeKeyHashCode = composer.getCompositeKeyHashCode();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return compositeKeyHashCode;
    }

    public static final /* synthetic */ <T, E extends Applier<?>> void ComposeNode(Function0<? extends T> function0, Function1<? super Updater<T>, Unit> function1, Composer composer, int i) {
        Applier<?> applier = composer.getApplier();
        Intrinsics.reifiedOperationMarker(3, ExifInterface.LONGITUDE_EAST);
        if (!(applier instanceof Applier)) {
            invalidApplier();
        }
        composer.startNode();
        if (composer.getInserting()) {
            composer.createNode(function0);
        } else {
            composer.useNode();
        }
        function1.invoke(Updater.m3535boximpl(Updater.m3536constructorimpl(composer)));
        composer.endNode();
    }

    public static final /* synthetic */ <T, E extends Applier<?>> void ReusableComposeNode(Function0<? extends T> function0, Function1<? super Updater<T>, Unit> function1, Composer composer, int i) {
        Applier<?> applier = composer.getApplier();
        Intrinsics.reifiedOperationMarker(3, ExifInterface.LONGITUDE_EAST);
        if (!(applier instanceof Applier)) {
            invalidApplier();
        }
        composer.startReusableNode();
        if (composer.getInserting()) {
            composer.createNode(function0);
        } else {
            composer.useNode();
        }
        function1.invoke(Updater.m3535boximpl(Updater.m3536constructorimpl(composer)));
        composer.endNode();
    }

    public static final /* synthetic */ <T, E extends Applier<?>> void ComposeNode(Function0<? extends T> function0, Function1<? super Updater<T>, Unit> function1, Function2<? super Composer, ? super Integer, Unit> function2, Composer composer, int i) {
        Applier<?> applier = composer.getApplier();
        Intrinsics.reifiedOperationMarker(3, ExifInterface.LONGITUDE_EAST);
        if (!(applier instanceof Applier)) {
            invalidApplier();
        }
        composer.startNode();
        if (composer.getInserting()) {
            composer.createNode(function0);
        } else {
            composer.useNode();
        }
        function1.invoke(Updater.m3535boximpl(Updater.m3536constructorimpl(composer)));
        function2.invoke(composer, Integer.valueOf((i >> 6) & 14));
        composer.endNode();
    }

    public static final /* synthetic */ <T, E extends Applier<?>> void ReusableComposeNode(Function0<? extends T> function0, Function1<? super Updater<T>, Unit> function1, Function2<? super Composer, ? super Integer, Unit> function2, Composer composer, int i) {
        Applier<?> applier = composer.getApplier();
        Intrinsics.reifiedOperationMarker(3, ExifInterface.LONGITUDE_EAST);
        if (!(applier instanceof Applier)) {
            invalidApplier();
        }
        composer.startReusableNode();
        if (composer.getInserting()) {
            composer.createNode(function0);
        } else {
            composer.useNode();
        }
        function1.invoke(Updater.m3535boximpl(Updater.m3536constructorimpl(composer)));
        function2.invoke(composer, Integer.valueOf((i >> 6) & 14));
        composer.endNode();
    }

    public static final /* synthetic */ <T, E extends Applier<?>> void ComposeNode(Function0<? extends T> function0, Function1<? super Updater<T>, Unit> function1, Function3<? super SkippableUpdater<T>, ? super Composer, ? super Integer, Unit> function3, Function2<? super Composer, ? super Integer, Unit> function2, Composer composer, int i) {
        Applier<?> applier = composer.getApplier();
        Intrinsics.reifiedOperationMarker(3, ExifInterface.LONGITUDE_EAST);
        if (!(applier instanceof Applier)) {
            invalidApplier();
        }
        composer.startNode();
        if (composer.getInserting()) {
            composer.createNode(function0);
        } else {
            composer.useNode();
        }
        function1.invoke(Updater.m3535boximpl(Updater.m3536constructorimpl(composer)));
        function3.invoke(SkippableUpdater.m3506boximpl(SkippableUpdater.m3507constructorimpl(composer)), composer, Integer.valueOf((i >> 3) & 112));
        composer.startReplaceableGroup(2058660585);
        function2.invoke(composer, Integer.valueOf((i >> 9) & 14));
        composer.endReplaceableGroup();
        composer.endNode();
    }

    public static final /* synthetic */ <T, E extends Applier<?>> void ReusableComposeNode(Function0<? extends T> function0, Function1<? super Updater<T>, Unit> function1, Function3<? super SkippableUpdater<T>, ? super Composer, ? super Integer, Unit> function3, Function2<? super Composer, ? super Integer, Unit> function2, Composer composer, int i) {
        Applier<?> applier = composer.getApplier();
        Intrinsics.reifiedOperationMarker(3, ExifInterface.LONGITUDE_EAST);
        if (!(applier instanceof Applier)) {
            invalidApplier();
        }
        composer.startReusableNode();
        if (composer.getInserting()) {
            composer.createNode(function0);
        } else {
            composer.useNode();
        }
        function1.invoke(Updater.m3535boximpl(Updater.m3536constructorimpl(composer)));
        function3.invoke(SkippableUpdater.m3506boximpl(SkippableUpdater.m3507constructorimpl(composer)), composer, Integer.valueOf((i >> 3) & 112));
        composer.startReplaceableGroup(2058660585);
        function2.invoke(composer, Integer.valueOf((i >> 9) & 14));
        composer.endReplaceableGroup();
        composer.endNode();
    }

    public static final void invalidApplier() {
        throw new IllegalStateException("Invalid applier".toString());
    }

    public static final CompositionContext rememberCompositionContext(Composer composer, int i) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1165786124, i, -1, "androidx.compose.runtime.rememberCompositionContext (Composables.kt:505)");
        }
        CompositionContext compositionContextBuildContext = composer.buildContext();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return compositionContextBuildContext;
    }

    public static final <T> T remember(Function0<? extends T> function0, Composer composer, int i) {
        T t = (T) composer.rememberedValue();
        if (t != Composer.INSTANCE.getEmpty()) {
            return t;
        }
        T tInvoke = function0.invoke();
        composer.updateRememberedValue(tInvoke);
        return tInvoke;
    }
}
