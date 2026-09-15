package androidx.compose.ui.node;

import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.Actual_jvmKt;
import androidx.compose.ui.CombinedModifier;
import androidx.compose.ui.Modifier;
import androidx.exifinterface.media.ExifInterface;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u001f\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a+\u0010\n\u001a\u00020\t\"\b\b\u0000\u0010\u0007*\u00020\u0006*\b\u0012\u0004\u0012\u00028\u00000\b2\u0006\u0010\u0001\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\n\u0010\u000b\u001a5\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00000\r*\u00020\f2\f\u0010\u0001\u001a\b\u0012\u0004\u0012\u00020\u00000\r2\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\f0\rH\u0002¢\u0006\u0004\b\u000e\u0010\u000f\"\u0014\u0010\u0010\u001a\u00020\u00038\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011\"\u0014\u0010\u0012\u001a\u00020\u00038\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0011\"\u0014\u0010\u0013\u001a\u00020\u00038\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0011"}, d2 = {"Landroidx/compose/ui/Modifier$Element;", "p0", "p1", "", "actionForModifiers", "(Landroidx/compose/ui/Modifier$Element;Landroidx/compose/ui/Modifier$Element;)I", "Landroidx/compose/ui/Modifier$Node;", ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/compose/ui/node/ModifierNodeElement;", "", "updateUnsafe", "(Landroidx/compose/ui/node/ModifierNodeElement;Landroidx/compose/ui/Modifier$Node;)V", "Landroidx/compose/ui/Modifier;", "Landroidx/compose/runtime/collection/MutableVector;", "fillVector", "(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/collection/MutableVector;Landroidx/compose/runtime/collection/MutableVector;)Landroidx/compose/runtime/collection/MutableVector;", "ActionReplace", "I", "ActionUpdate", "ActionReuse"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class NodeChainKt {
    private static final int ActionReplace = 0;
    private static final int ActionReuse = 2;
    private static final int ActionUpdate = 1;

    public static final int actionForModifiers(Modifier.Element element, Modifier.Element element2) {
        if (Intrinsics.areEqual(element, element2)) {
            return 2;
        }
        return Actual_jvmKt.areObjectsOfSameType(element, element2) ? 1 : 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T extends Modifier.Node> void updateUnsafe(ModifierNodeElement<T> modifierNodeElement, Modifier.Node node) {
        Intrinsics.checkNotNull(node, "");
        modifierNodeElement.update(node);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final MutableVector<Modifier.Element> fillVector(Modifier modifier, final MutableVector<Modifier.Element> mutableVector, MutableVector<Modifier> mutableVector2) {
        mutableVector2.add(modifier);
        Function1<Modifier.Element, Boolean> function1 = null;
        while (mutableVector2.getSize() != 0) {
            Modifier modifierRemoveAt = mutableVector2.removeAt(mutableVector2.getSize() - 1);
            if (modifierRemoveAt instanceof CombinedModifier) {
                CombinedModifier combinedModifier = (CombinedModifier) modifierRemoveAt;
                mutableVector2.add(combinedModifier.getInner());
                mutableVector2.add(combinedModifier.getOuter());
            } else if (modifierRemoveAt instanceof Modifier.Element) {
                mutableVector.add(modifierRemoveAt);
            } else {
                if (function1 == null) {
                    function1 = new Function1<Modifier.Element, Boolean>() { // from class: androidx.compose.ui.node.NodeChainKt.fillVector.1
                        @Override // kotlin.jvm.functions.Function1
                        public final Boolean invoke(Modifier.Element element) {
                            mutableVector.add(element);
                            return Boolean.TRUE;
                        }

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }
                    };
                }
                modifierRemoveAt.all(function1);
            }
        }
        return mutableVector;
    }
}
