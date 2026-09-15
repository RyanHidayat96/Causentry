package defpackage;

import com.google.firebase.dynamiclinks.DynamicLink;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B5\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0016\b\u0002\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007j\u0004\u0018\u0001`\t¢\u0006\u0002\u0010\nR\u001c\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007j\u0004\u0018\u0001`\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\r\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lorg/koin/core/instance/InstanceContext;", "", "koin", "Lorg/koin/core/Koin;", "scope", "Lorg/koin/core/scope/Scope;", "_parameters", "Lkotlin/Function0;", "Lorg/koin/core/parameter/DefinitionParameters;", "Lorg/koin/core/parameter/ParametersDefinition;", "(Lorg/koin/core/Koin;Lorg/koin/core/scope/Scope;Lkotlin/jvm/functions/Function0;)V", "getKoin", "()Lorg/koin/core/Koin;", DynamicLink.Builder.KEY_DYNAMIC_LINK_PARAMETERS, "getParameters", "()Lorg/koin/core/parameter/DefinitionParameters;", "getScope", "()Lorg/koin/core/scope/Scope;", "koin-core"}, k = 1, mv = {1, 1, 15})
public final class ScreenFlashUiInfo {
    private final Function0<CoordinateTransform> TuitionPaymentFragmentbindingInflater1;
    final FileTransformFactory TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    final CoordinateTransform TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    final ZoomGestureDetectorZoomEvent b;

    public ScreenFlashUiInfo(ZoomGestureDetectorZoomEvent zoomGestureDetectorZoomEvent, FileTransformFactory fileTransformFactory, Function0<CoordinateTransform> function0) {
        CoordinateTransform coordinateTransformInvoke;
        this.b = zoomGestureDetectorZoomEvent;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = fileTransformFactory;
        this.TuitionPaymentFragmentbindingInflater1 = function0;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = (function0 == null || (coordinateTransformInvoke = function0.invoke()) == null) ? new CoordinateTransform(new Object[0]) : coordinateTransformInvoke;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ ScreenFlashUiInfo(ZoomGestureDetectorZoomEvent zoomGestureDetectorZoomEvent, FileTransformFactory fileTransformFactory, Function0 function0, int i, DefaultConstructorMarker defaultConstructorMarker) {
        zoomGestureDetectorZoomEvent = (i & 1) != 0 ? null : zoomGestureDetectorZoomEvent;
        if ((i & 2) != 0) {
            fileTransformFactory = zoomGestureDetectorZoomEvent != null ? zoomGestureDetectorZoomEvent.b : null;
        }
        this(zoomGestureDetectorZoomEvent, fileTransformFactory, (i & 4) != 0 ? null : function0);
    }

    public ScreenFlashUiInfo() {
        this(null, null, null, 7, null);
    }
}
