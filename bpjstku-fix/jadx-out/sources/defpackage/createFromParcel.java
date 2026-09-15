package defpackage;

import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.unit.Constraints;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import coil.compose.ContentPainterElement;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class createFromParcel {
    static final void TuitionPaymentFragmentspecialinlinedviewModeldefault2(final MediaBrowserCompatSubscription mediaBrowserCompatSubscription, final String str, final Modifier modifier, final Function1<? super MediaBrowserCompatServiceBinderWrapper.TuitionPaymentFragmentspecialinlinedviewModeldefault3, ? extends MediaBrowserCompatServiceBinderWrapper.TuitionPaymentFragmentspecialinlinedviewModeldefault3> function1, final Function1<? super MediaBrowserCompatServiceBinderWrapper.TuitionPaymentFragmentspecialinlinedviewModeldefault3, Unit> function2, final Alignment alignment, final ContentScale contentScale, final float f, final ColorFilter colorFilter, final int i, final boolean z, Composer composer, final int i2, final int i3) throws Throwable {
        int i4;
        int i5;
        Composer composerStartRestartGroup = composer.startRestartGroup(-421592773);
        if ((i2 & 14) == 0) {
            i4 = (composerStartRestartGroup.changed(mediaBrowserCompatSubscription) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 112) == 0) {
            i4 |= composerStartRestartGroup.changed(str) ? 32 : 16;
        }
        if ((i2 & 896) == 0) {
            i4 |= composerStartRestartGroup.changed(modifier) ? 256 : 128;
        }
        if ((i2 & 7168) == 0) {
            i4 |= composerStartRestartGroup.changedInstance(function1) ? 2048 : 1024;
        }
        if ((i2 & 57344) == 0) {
            i4 |= composerStartRestartGroup.changedInstance(function2) ? 16384 : 8192;
        }
        if ((i2 & 458752) == 0) {
            i4 |= composerStartRestartGroup.changed(alignment) ? 131072 : 65536;
        }
        if ((i2 & 3670016) == 0) {
            i4 |= composerStartRestartGroup.changed(contentScale) ? 1048576 : 524288;
        }
        if ((i2 & 29360128) == 0) {
            i4 |= composerStartRestartGroup.changed(f) ? 8388608 : 4194304;
        }
        if ((234881024 & i2) == 0) {
            i4 |= composerStartRestartGroup.changed(colorFilter) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
        }
        if ((1879048192 & i2) == 0) {
            i4 |= composerStartRestartGroup.changed(i) ? 536870912 : 268435456;
        }
        int i6 = i4;
        if ((i3 & 14) == 0) {
            i5 = i3 | (composerStartRestartGroup.changed(z) ? 4 : 2);
        } else {
            i5 = i3;
        }
        if ((i6 & 1533916891) != 306783378 || (i5 & 11) != 2 || !composerStartRestartGroup.getSkipping()) {
            newUnratedRating newunratedratingTuitionPaymentFragmentspecialinlinedviewModeldefault2 = setSubscription.TuitionPaymentFragmentspecialinlinedviewModeldefault2(mediaBrowserCompatSubscription.b(), contentScale, composerStartRestartGroup);
            int i7 = i6 >> 6;
            int i8 = i7 & 57344;
            MediaBrowserCompatServiceBinderWrapper mediaBrowserCompatServiceBinderWrapperB = sendRequest.b(newunratedratingTuitionPaymentFragmentspecialinlinedviewModeldefault2, mediaBrowserCompatSubscription.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), function1, function2, contentScale, i, mediaBrowserCompatSubscription.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), composerStartRestartGroup);
            onSessionReady isConnected = newunratedratingTuitionPaymentFragmentspecialinlinedviewModeldefault2.getIsConnected();
            TuitionPaymentFragmentbindingInflater1(isConnected instanceof getCallback ? modifier.then((Modifier) isConnected) : modifier, mediaBrowserCompatServiceBinderWrapperB, str, alignment, contentScale, f, colorFilter, z, composerStartRestartGroup, (i7 & 3670016) | ((i6 << 3) & 896) | (i7 & 7168) | i8 | (i7 & 458752) | ((i5 << 21) & 29360128));
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: newArray
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) throws Throwable {
                    createFromParcel.TuitionPaymentFragmentspecialinlinedviewModeldefault2(mediaBrowserCompatSubscription, str, modifier, function1, function2, alignment, contentScale, f, colorFilter, i, z, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), RecomposeScopeImplKt.updateChangedFlags(i3));
                    return Unit.INSTANCE;
                }
            });
        }
    }

    static final void TuitionPaymentFragmentbindingInflater1(final Modifier modifier, final MediaBrowserCompatServiceBinderWrapper mediaBrowserCompatServiceBinderWrapper, final String str, final Alignment alignment, final ContentScale contentScale, final float f, final ColorFilter colorFilter, final boolean z, Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(777774312);
        if ((i & 14) == 0) {
            i2 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            i2 |= composerStartRestartGroup.changed(mediaBrowserCompatServiceBinderWrapper) ? 32 : 16;
        }
        if ((i & 896) == 0) {
            i2 |= composerStartRestartGroup.changed(str) ? 256 : 128;
        }
        if ((i & 7168) == 0) {
            i2 |= composerStartRestartGroup.changed(alignment) ? 2048 : 1024;
        }
        if ((57344 & i) == 0) {
            i2 |= composerStartRestartGroup.changed(contentScale) ? 16384 : 8192;
        }
        if ((458752 & i) == 0) {
            i2 |= composerStartRestartGroup.changed(f) ? 131072 : 65536;
        }
        if ((3670016 & i) == 0) {
            i2 |= composerStartRestartGroup.changed(colorFilter) ? 1048576 : 524288;
        }
        if ((29360128 & i) == 0) {
            i2 |= composerStartRestartGroup.changed(z) ? 8388608 : 4194304;
        }
        if ((i2 & 23967451) != 4793490 || !composerStartRestartGroup.getSkipping()) {
            Modifier modifierTuitionPaymentFragmentspecialinlinedviewModeldefault1 = setSubscription.TuitionPaymentFragmentspecialinlinedviewModeldefault1(modifier, str);
            if (z) {
                modifierTuitionPaymentFragmentspecialinlinedviewModeldefault1 = ClipKt.clipToBounds(modifierTuitionPaymentFragmentspecialinlinedviewModeldefault1);
            }
            Modifier modifierThen = modifierTuitionPaymentFragmentspecialinlinedviewModeldefault1.then(new ContentPainterElement(mediaBrowserCompatServiceBinderWrapper, alignment, contentScale, f, colorFilter));
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 tuitionPaymentFragmentspecialinlinedviewModeldefault1 = TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentbindingInflater1;
            composerStartRestartGroup.startReplaceableGroup(544976794);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierThen);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            final Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
            composerStartRestartGroup.startReplaceableGroup(1405779621);
            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(new Function0<ComposeUiNode>() { // from class: coil.compose.AsyncImageKt$Content$$inlined$Layout$1
                    /* JADX WARN: Type inference failed for: r0v1, types: [androidx.compose.ui.node.ComposeUiNode, java.lang.Object] */
                    @Override // kotlin.jvm.functions.Function0
                    public final ComposeUiNode invoke() {
                        return constructor.invoke();
                    }

                    {
                        super(0);
                    }
                });
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM3536constructorimpl = Updater.m3536constructorimpl(composerStartRestartGroup);
            Updater.m3543setimpl(composerM3536constructorimpl, tuitionPaymentFragmentspecialinlinedviewModeldefault1, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m3543setimpl(composerM3536constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Updater.m3543setimpl(composerM3536constructorimpl, modifierMaterializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (composerM3536constructorimpl.getInserting() || !Intrinsics.areEqual(composerM3536constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM3536constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM3536constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            composerStartRestartGroup.endNode();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceableGroup();
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: onSearchResult
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    createFromParcel.TuitionPaymentFragmentbindingInflater1(modifier, mediaBrowserCompatServiceBinderWrapper, str, alignment, contentScale, f, colorFilter, z, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                    return Unit.INSTANCE;
                }
            });
        }
    }

    static final class TuitionPaymentFragmentspecialinlinedviewModeldefault1 implements MeasurePolicy {
        public static final TuitionPaymentFragmentspecialinlinedviewModeldefault1 TuitionPaymentFragmentbindingInflater1 = new TuitionPaymentFragmentspecialinlinedviewModeldefault1();

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit TuitionPaymentFragmentbindingInflater1() {
            return Unit.INSTANCE;
        }

        @Override // androidx.compose.ui.layout.MeasurePolicy
        /* JADX INFO: renamed from: measure-3p2s80s */
        public final MeasureResult mo359measure3p2s80s(MeasureScope measureScope, List<? extends Measurable> list, long j) {
            return MeasureScope.layout$default(measureScope, Constraints.m6890getMinWidthimpl(j), Constraints.m6889getMinHeightimpl(j), null, new Function1() { // from class: addSubscription
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return createFromParcel.TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentbindingInflater1();
                }
            }, 4, null);
        }

        TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        }
    }
}
