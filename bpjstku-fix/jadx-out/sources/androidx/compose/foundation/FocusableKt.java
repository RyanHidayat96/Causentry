package androidx.compose.foundation;

import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusModifierKt;
import androidx.compose.ui.focus.FocusProperties;
import androidx.compose.ui.focus.FocusPropertiesKt;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectableModifier;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.platform.InspectorInfo;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0013\u0010\u0001\u001a\u00020\u0000*\u00020\u0000H\u0007¢\u0006\u0004\b\u0001\u0010\u0002\u001a)\u0010\u0007\u001a\u00020\u0000*\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0007¢\u0006\u0004\b\u0007\u0010\b\u001a%\u0010\t\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0001¢\u0006\u0004\b\t\u0010\b\"\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f\"\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f"}, d2 = {"Landroidx/compose/ui/Modifier;", "focusGroup", "(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;", "", "p0", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "p1", "focusable", "(Landroidx/compose/ui/Modifier;ZLandroidx/compose/foundation/interaction/MutableInteractionSource;)Landroidx/compose/ui/Modifier;", "focusableInNonTouchMode", "Landroidx/compose/foundation/FocusableKt$FocusableInNonTouchModeElement$1;", "FocusableInNonTouchModeElement", "Landroidx/compose/foundation/FocusableKt$FocusableInNonTouchModeElement$1;", "Landroidx/compose/ui/platform/InspectableModifier;", "focusGroupInspectorInfo", "Landroidx/compose/ui/platform/InspectableModifier;"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class FocusableKt {
    private static final FocusableKt$FocusableInNonTouchModeElement$1 FocusableInNonTouchModeElement;
    private static final InspectableModifier focusGroupInspectorInfo;

    public static /* synthetic */ Modifier focusable$default(Modifier modifier, boolean z, MutableInteractionSource mutableInteractionSource, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        if ((i & 2) != 0) {
            mutableInteractionSource = null;
        }
        return focusable(modifier, z, mutableInteractionSource);
    }

    public static final Modifier focusable(Modifier modifier, boolean z, MutableInteractionSource mutableInteractionSource) {
        Modifier.Companion focusableElement;
        if (z) {
            focusableElement = new FocusableElement(mutableInteractionSource);
        } else {
            focusableElement = Modifier.INSTANCE;
        }
        return modifier.then(focusableElement);
    }

    public static final Modifier focusGroup(Modifier modifier) {
        return FocusModifierKt.focusTarget(FocusPropertiesKt.focusProperties(modifier.then(focusGroupInspectorInfo), new Function1<FocusProperties, Unit>() { // from class: androidx.compose.foundation.FocusableKt.focusGroup.1
            @Override // kotlin.jvm.functions.Function1
            public final /* bridge */ /* synthetic */ Unit invoke(FocusProperties focusProperties) {
                invoke2(focusProperties);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(FocusProperties focusProperties) {
                focusProperties.setCanFocus(false);
            }
        }));
    }

    public static final Modifier focusableInNonTouchMode(Modifier modifier, boolean z, MutableInteractionSource mutableInteractionSource) {
        return focusable(modifier.then(z ? FocusableInNonTouchModeElement : Modifier.INSTANCE), z, mutableInteractionSource);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [androidx.compose.foundation.FocusableKt$FocusableInNonTouchModeElement$1] */
    static {
        focusGroupInspectorInfo = new InspectableModifier(InspectableValueKt.isDebugInspectorInfoEnabled() ? new Function1<InspectorInfo, Unit>() { // from class: androidx.compose.foundation.FocusableKt$special$$inlined$debugInspectorInfo$1
            @Override // kotlin.jvm.functions.Function1
            public final /* bridge */ /* synthetic */ Unit invoke(InspectorInfo inspectorInfo) {
                invoke2(inspectorInfo);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(InspectorInfo inspectorInfo) {
                inspectorInfo.setName("focusGroup");
            }
        } : InspectableValueKt.getNoInspectorInfo());
        FocusableInNonTouchModeElement = new ModifierNodeElement<FocusableInNonTouchMode>() { // from class: androidx.compose.foundation.FocusableKt$FocusableInNonTouchModeElement$1
            @Override // androidx.compose.ui.node.ModifierNodeElement
            public final boolean equals(Object p0) {
                return this == p0;
            }

            @Override // androidx.compose.ui.node.ModifierNodeElement
            public final void update(FocusableInNonTouchMode p0) {
            }

            @Override // androidx.compose.ui.node.ModifierNodeElement
            /* JADX INFO: renamed from: create */
            public final FocusableInNonTouchMode getNode() {
                return new FocusableInNonTouchMode();
            }

            @Override // androidx.compose.ui.node.ModifierNodeElement
            public final int hashCode() {
                return Focusable_androidKt.identityHashCode(this);
            }

            @Override // androidx.compose.ui.node.ModifierNodeElement
            public final void inspectableProperties(InspectorInfo inspectorInfo) {
                inspectorInfo.setName("focusableInNonTouchMode");
            }
        };
    }
}
