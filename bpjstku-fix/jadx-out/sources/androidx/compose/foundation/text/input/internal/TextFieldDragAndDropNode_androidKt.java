package androidx.compose.foundation.text.input.internal;

import android.content.ClipDescription;
import android.view.DragEvent;
import androidx.compose.foundation.content.MediaType;
import androidx.compose.ui.draganddrop.DragAndDropEvent;
import androidx.compose.ui.draganddrop.DragAndDropModifierNode;
import androidx.compose.ui.draganddrop.DragAndDropNodeKt;
import androidx.compose.ui.draganddrop.DragAndDropTarget;
import androidx.compose.ui.draganddrop.DragAndDrop_androidKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.platform.AndroidClipboardManager_androidKt;
import androidx.compose.ui.platform.ClipEntry;
import androidx.compose.ui.platform.ClipMetadata;
import java.util.Collection;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0089\u0002\u0010\u0016\u001a\u00020\u00152\u0012\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u00002\"\u0010\t\u001a\u001e\u0012\t\u0012\u00070\u0005¢\u0006\u0002\b\u0006\u0012\t\u0012\u00070\u0007¢\u0006\u0002\b\u0006\u0012\u0004\u0012\u00020\b0\u00042\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n2\u001b\b\u0002\u0010\u000e\u001a\u0015\u0012\t\u0012\u00070\u000b¢\u0006\u0002\b\u0006\u0012\u0004\u0012\u00020\f\u0018\u00010\n2\u001b\b\u0002\u0010\u000f\u001a\u0015\u0012\t\u0012\u00070\u000b¢\u0006\u0002\b\u0006\u0012\u0004\u0012\u00020\f\u0018\u00010\n2\u001b\b\u0002\u0010\u0011\u001a\u0015\u0012\t\u0012\u00070\u0010¢\u0006\u0002\b\u0006\u0012\u0004\u0012\u00020\f\u0018\u00010\n2\u001b\b\u0002\u0010\u0012\u001a\u0015\u0012\t\u0012\u00070\u000b¢\u0006\u0002\b\u0006\u0012\u0004\u0012\u00020\f\u0018\u00010\n2\u001b\b\u0002\u0010\u0013\u001a\u0015\u0012\t\u0012\u00070\u000b¢\u0006\u0002\b\u0006\u0012\u0004\u0012\u00020\f\u0018\u00010\n2\u001b\b\u0002\u0010\u0014\u001a\u0015\u0012\t\u0012\u00070\u000b¢\u0006\u0002\b\u0006\u0012\u0004\u0012\u00020\f\u0018\u00010\nH\u0001¢\u0006\u0004\b\u0016\u0010\u0017"}, d2 = {"Lkotlin/Function0;", "", "Landroidx/compose/foundation/content/MediaType;", "p0", "Lkotlin/Function2;", "Landroidx/compose/ui/platform/ClipEntry;", "Lkotlin/ParameterName;", "Landroidx/compose/ui/platform/ClipMetadata;", "", "p1", "Lkotlin/Function1;", "Landroidx/compose/ui/draganddrop/DragAndDropEvent;", "", "p2", "p3", "p4", "Landroidx/compose/ui/geometry/Offset;", "p5", "p6", "p7", "p8", "Landroidx/compose/ui/draganddrop/DragAndDropModifierNode;", "textFieldDragAndDropNode", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/draganddrop/DragAndDropModifierNode;"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class TextFieldDragAndDropNode_androidKt {
    public static final DragAndDropModifierNode textFieldDragAndDropNode(final Function0<? extends Set<MediaType>> function0, final Function2<? super ClipEntry, ? super ClipMetadata, Boolean> function2, final Function1<? super DragAndDropEvent, Unit> function1, final Function1<? super DragAndDropEvent, Unit> function3, final Function1<? super DragAndDropEvent, Unit> function4, final Function1<? super Offset, Unit> function5, final Function1<? super DragAndDropEvent, Unit> function6, final Function1<? super DragAndDropEvent, Unit> function7, final Function1<? super DragAndDropEvent, Unit> function8) {
        return DragAndDropNodeKt.DragAndDropModifierNode(new Function1<DragAndDropEvent, Boolean>() { // from class: androidx.compose.foundation.text.input.internal.TextFieldDragAndDropNode_androidKt.textFieldDragAndDropNode.1
            @Override // kotlin.jvm.functions.Function1
            public final Boolean invoke(DragAndDropEvent dragAndDropEvent) {
                ClipDescription clipDescription = DragAndDrop_androidKt.toAndroidDragEvent(dragAndDropEvent).getClipDescription();
                Set<MediaType> setInvoke = function0.invoke();
                boolean z = false;
                if (!(setInvoke instanceof Collection) || !setInvoke.isEmpty()) {
                    for (MediaType mediaType : setInvoke) {
                        if (Intrinsics.areEqual(mediaType, MediaType.INSTANCE.getAll()) || clipDescription.hasMimeType(mediaType.getRepresentation())) {
                            z = true;
                            break;
                        }
                    }
                }
                return Boolean.valueOf(z);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }
        }, new DragAndDropTarget() { // from class: androidx.compose.foundation.text.input.internal.TextFieldDragAndDropNode_androidKt.textFieldDragAndDropNode.2
            @Override // androidx.compose.ui.draganddrop.DragAndDropTarget
            public final boolean onDrop(DragAndDropEvent p0) {
                function1.invoke(p0);
                return function2.invoke(AndroidClipboardManager_androidKt.toClipEntry(DragAndDrop_androidKt.toAndroidDragEvent(p0).getClipData()), AndroidClipboardManager_androidKt.toClipMetadata(DragAndDrop_androidKt.toAndroidDragEvent(p0).getClipDescription())).booleanValue();
            }

            @Override // androidx.compose.ui.draganddrop.DragAndDropTarget
            public final void onStarted(DragAndDropEvent p0) {
                Function1<DragAndDropEvent, Unit> function9 = function3;
                if (function9 != null) {
                    function9.invoke(p0);
                    Unit unit = Unit.INSTANCE;
                }
            }

            @Override // androidx.compose.ui.draganddrop.DragAndDropTarget
            public final void onEntered(DragAndDropEvent p0) {
                Function1<DragAndDropEvent, Unit> function9 = function4;
                if (function9 != null) {
                    function9.invoke(p0);
                    Unit unit = Unit.INSTANCE;
                }
            }

            @Override // androidx.compose.ui.draganddrop.DragAndDropTarget
            public final void onMoved(DragAndDropEvent p0) {
                DragEvent androidDragEvent = DragAndDrop_androidKt.toAndroidDragEvent(p0);
                Function1<Offset, Unit> function9 = function5;
                if (function9 != null) {
                    function9.invoke(Offset.m3963boximpl(OffsetKt.Offset(androidDragEvent.getX(), androidDragEvent.getY())));
                    Unit unit = Unit.INSTANCE;
                }
            }

            @Override // androidx.compose.ui.draganddrop.DragAndDropTarget
            public final void onExited(DragAndDropEvent p0) {
                Function1<DragAndDropEvent, Unit> function9 = function7;
                if (function9 != null) {
                    function9.invoke(p0);
                    Unit unit = Unit.INSTANCE;
                }
            }

            @Override // androidx.compose.ui.draganddrop.DragAndDropTarget
            public final void onChanged(DragAndDropEvent p0) {
                Function1<DragAndDropEvent, Unit> function9 = function6;
                if (function9 != null) {
                    function9.invoke(p0);
                    Unit unit = Unit.INSTANCE;
                }
            }

            @Override // androidx.compose.ui.draganddrop.DragAndDropTarget
            public final void onEnded(DragAndDropEvent p0) {
                Function1<DragAndDropEvent, Unit> function9 = function8;
                if (function9 != null) {
                    function9.invoke(p0);
                    Unit unit = Unit.INSTANCE;
                }
            }
        });
    }
}
