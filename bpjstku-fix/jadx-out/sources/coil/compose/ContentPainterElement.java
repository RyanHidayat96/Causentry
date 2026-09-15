package coil.compose;

import androidx.compose.ui.Alignment;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.node.DrawModifierNodeKt;
import androidx.compose.ui.node.LayoutModifierNodeKt;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import com.google.android.libraries.places.api.model.PlaceTypes;
import com.google.firebase.analytics.FirebaseAnalytics;
import defpackage.unregisterCallbackMessenger;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\b\u0081\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B1\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0004\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0013\u0010\u0015\u001a\u00020\u0011*\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0004\u001a\u0004\u0018\u00010\u0017HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001f\u001a\u00020\u001eH×\u0001¢\u0006\u0004\b\u001f\u0010 R\u0014\u0010!\u001a\u00020\u00038\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010%\u001a\u00020\u00058\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010#\u001a\u00020\u00078\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010&R\u0014\u0010\u000f\u001a\u00020\t8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010'R\u0016\u0010\u0012\u001a\u0004\u0018\u00010\u000b8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b%\u0010("}, d2 = {"Lcoil/compose/ContentPainterElement;", "Landroidx/compose/ui/node/ModifierNodeElement;", "LunregisterCallbackMessenger;", "Landroidx/compose/ui/graphics/painter/Painter;", "p0", "Landroidx/compose/ui/Alignment;", "p1", "Landroidx/compose/ui/layout/ContentScale;", "p2", "", "p3", "Landroidx/compose/ui/graphics/ColorFilter;", "p4", "<init>", "(Landroidx/compose/ui/graphics/painter/Painter;Landroidx/compose/ui/Alignment;Landroidx/compose/ui/layout/ContentScale;FLandroidx/compose/ui/graphics/ColorFilter;)V", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "()LunregisterCallbackMessenger;", "", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "(LunregisterCallbackMessenger;)V", "Landroidx/compose/ui/platform/InspectorInfo;", "inspectableProperties", "(Landroidx/compose/ui/platform/InspectorInfo;)V", "", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "TuitionPaymentFragmentbindingInflater1", "Landroidx/compose/ui/graphics/painter/Painter;", "b", "Landroidx/compose/ui/Alignment;", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "Landroidx/compose/ui/layout/ContentScale;", "F", "Landroidx/compose/ui/graphics/ColorFilter;"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class ContentPainterElement extends ModifierNodeElement<unregisterCallbackMessenger> {
    private final Painter TuitionPaymentFragmentbindingInflater1;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
    private final float TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
    private final ColorFilter TuitionPaymentFragmentspecialinlinedviewModeldefault1;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
    private final ContentScale b;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final Alignment TuitionPaymentFragmentspecialinlinedviewModeldefault2;

    public ContentPainterElement(Painter painter, Alignment alignment, ContentScale contentScale, float f, ColorFilter colorFilter) {
        this.TuitionPaymentFragmentbindingInflater1 = painter;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = alignment;
        this.b = contentScale;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = f;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = colorFilter;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // androidx.compose.ui.node.ModifierNodeElement
    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: merged with bridge method [inline-methods] */
    public unregisterCallbackMessenger getNode() {
        return new unregisterCallbackMessenger(this.TuitionPaymentFragmentbindingInflater1, this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, this.b, this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, this.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // androidx.compose.ui.node.ModifierNodeElement
    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: merged with bridge method [inline-methods] */
    public void update(unregisterCallbackMessenger p0) {
        boolean zM4039equalsimpl0 = Size.m4039equalsimpl0(p0.TuitionPaymentFragmentspecialinlinedviewModeldefault3().getIntrinsicSize(), this.TuitionPaymentFragmentbindingInflater1.getIntrinsicSize());
        p0.TuitionPaymentFragmentspecialinlinedviewModeldefault1(this.TuitionPaymentFragmentbindingInflater1);
        p0.TuitionPaymentFragmentbindingInflater1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
        p0.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.b);
        p0.TuitionPaymentFragmentspecialinlinedviewModeldefault1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
        p0.TuitionPaymentFragmentspecialinlinedviewModeldefault1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
        if (!zM4039equalsimpl0) {
            LayoutModifierNodeKt.invalidateMeasurement(p0);
        }
        DrawModifierNodeKt.invalidateDraw(p0);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void inspectableProperties(InspectorInfo inspectorInfo) {
        inspectorInfo.setName(FirebaseAnalytics.Param.CONTENT);
        inspectorInfo.getProperties().set(PlaceTypes.PAINTER, this.TuitionPaymentFragmentbindingInflater1);
        inspectorInfo.getProperties().set("alignment", this.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
        inspectorInfo.getProperties().set("contentScale", this.b);
        inspectorInfo.getProperties().set("alpha", Float.valueOf(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3));
        inspectorInfo.getProperties().set("colorFilter", this.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof ContentPainterElement)) {
            return false;
        }
        ContentPainterElement contentPainterElement = (ContentPainterElement) p0;
        return Intrinsics.areEqual(this.TuitionPaymentFragmentbindingInflater1, contentPainterElement.TuitionPaymentFragmentbindingInflater1) && Intrinsics.areEqual(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, contentPainterElement.TuitionPaymentFragmentspecialinlinedviewModeldefault2) && Intrinsics.areEqual(this.b, contentPainterElement.b) && Float.compare(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, contentPainterElement.TuitionPaymentFragmentspecialinlinedviewModeldefault3) == 0 && Intrinsics.areEqual(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, contentPainterElement.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final int hashCode() {
        int iHashCode = this.TuitionPaymentFragmentbindingInflater1.hashCode();
        int iHashCode2 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.hashCode();
        int iHashCode3 = this.b.hashCode();
        int iHashCode4 = Float.hashCode(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
        ColorFilter colorFilter = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        return (((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + (colorFilter == null ? 0 : colorFilter.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ContentPainterElement(TuitionPaymentFragmentbindingInflater1=");
        sb.append(this.TuitionPaymentFragmentbindingInflater1);
        sb.append(", TuitionPaymentFragmentspecialinlinedviewModeldefault2=");
        sb.append(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
        sb.append(", b=");
        sb.append(this.b);
        sb.append(", TuitionPaymentFragmentspecialinlinedviewModeldefault3=");
        sb.append(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
        sb.append(", TuitionPaymentFragmentspecialinlinedviewModeldefault1=");
        sb.append(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
        sb.append(')');
        return sb.toString();
    }
}
