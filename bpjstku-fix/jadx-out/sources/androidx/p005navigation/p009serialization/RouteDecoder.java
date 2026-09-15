package androidx.p005navigation.p009serialization;

import android.os.Bundle;
import androidx.exifinterface.media.ExifInterface;
import androidx.p002lifecycle.SavedStateHandle;
import androidx.p005navigation.NavType;
import com.google.android.libraries.places.api.model.PlaceTypes;
import defpackage.PreviewViewImplementationOnSurfaceNotInUseListener;
import defpackage.createImageAnalysis;
import defpackage.isBitDepthMatched;
import defpackage.isOutputSizeEqual;
import defpackage.stopListeningToRotationEvents;
import defpackage.waitForNextFrame;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u0001B-\b\u0016\u0012\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003\u0012\u0016\u0010\b\u001a\u0012\u0012\u0004\u0012\u00020\u0006\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00070\u0005¢\u0006\u0004\b\t\u0010\nB)\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u000b\u0012\u0016\u0010\b\u001a\u0012\u0012\u0004\u0012\u00020\u0006\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00070\u0005¢\u0006\u0004\b\t\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0004\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0017¢\u0006\u0004\b\u0012\u0010\u0013J\u0011\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0004\u001a\u00020\rH\u0017¢\u0006\u0004\b\u001b\u0010\u001cJ#\u0010\u001f\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u001d2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u001eH\u0000¢\u0006\u0004\b\u001f\u0010 J#\u0010!\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u001d2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u001eH\u0016¢\u0006\u0004\b!\u0010 J\u000f\u0010\"\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\"\u0010\u0013R\u0014\u0010$\u001a\u00020#8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0016\u0010&\u001a\u00020\u000e8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b&\u0010'R\u0016\u0010(\u001a\u00020\u00068\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b(\u0010)R \u0010+\u001a\u00020*8\u0017X\u0096\u0004¢\u0006\u0012\n\u0004\b+\u0010,\u0012\u0004\b/\u00100\u001a\u0004\b-\u0010."}, d2 = {"Landroidx/navigation/serialization/RouteDecoder;", "LisOutputSizeEqual;", "Landroid/os/Bundle;", "Landroidx/savedstate/b;", "p0", "", "", "Landroidx/navigation/NavType;", "p1", "<init>", "(Landroid/os/Bundle;Ljava/util/Map;)V", "Landroidx/lifecycle/SavedStateHandle;", "(Landroidx/lifecycle/SavedStateHandle;Ljava/util/Map;)V", "LcreateImageAnalysis;", "", "decodeElementIndex", "(LcreateImageAnalysis;)I", "", "decodeValue", "()Ljava/lang/Object;", "", "decodeNull", "()Ljava/lang/Void;", "", "decodeNotNullMark", "()Z", "LstopListeningToRotationEvents;", "decodeInline", "(LcreateImageAnalysis;)LstopListeningToRotationEvents;", ExifInterface.GPS_DIRECTION_TRUE, "LisBitDepthMatched;", "decodeRouteWithArgs$navigation_common_release", "(LisBitDepthMatched;)Ljava/lang/Object;", "decodeSerializableValue", "internalDecodeValue", "Landroidx/navigation/serialization/ArgStore;", PlaceTypes.STORE, "Landroidx/navigation/serialization/ArgStore;", "elementIndex", "I", "elementName", "Ljava/lang/String;", "LPreviewViewImplementationOnSurfaceNotInUseListener;", "serializersModule", "LPreviewViewImplementationOnSurfaceNotInUseListener;", "getSerializersModule", "()LPreviewViewImplementationOnSurfaceNotInUseListener;", "getSerializersModule$annotations", "()V"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class RouteDecoder extends isOutputSizeEqual {
    private int elementIndex;
    private String elementName;
    private final PreviewViewImplementationOnSurfaceNotInUseListener serializersModule;
    private final ArgStore store;

    public static /* synthetic */ void getSerializersModule$annotations() {
    }

    @Override // defpackage.isOutputSizeEqual, defpackage.stopListeningToRotationEvents
    public final Void decodeNull() {
        return null;
    }

    public RouteDecoder(Bundle bundle, Map<String, ? extends NavType<?>> map) {
        Intrinsics.checkNotNullParameter(bundle, "");
        Intrinsics.checkNotNullParameter(map, "");
        this.elementIndex = -1;
        this.elementName = "";
        this.serializersModule = waitForNextFrame.b();
        this.store = new SavedStateArgStore(bundle, map);
    }

    public RouteDecoder(SavedStateHandle savedStateHandle, Map<String, ? extends NavType<?>> map) {
        Intrinsics.checkNotNullParameter(savedStateHandle, "");
        Intrinsics.checkNotNullParameter(map, "");
        this.elementIndex = -1;
        this.elementName = "";
        this.serializersModule = waitForNextFrame.b();
        this.store = new SavedStateHandleArgStore(savedStateHandle, map);
    }

    @Override // defpackage.setActiveRecording
    public final PreviewViewImplementationOnSurfaceNotInUseListener getSerializersModule() {
        return this.serializersModule;
    }

    @Override // defpackage.setActiveRecording
    public final int decodeElementIndex(createImageAnalysis p0) {
        String strTuitionPaymentFragmentbindingInflater1;
        Intrinsics.checkNotNullParameter(p0, "");
        int i = this.elementIndex;
        do {
            i++;
            if (i >= p0.getTuitionPaymentFragmentspecialinlinedviewModeldefault1()) {
                return -1;
            }
            strTuitionPaymentFragmentbindingInflater1 = p0.TuitionPaymentFragmentbindingInflater1(i);
        } while (!this.store.contains(strTuitionPaymentFragmentbindingInflater1));
        this.elementIndex = i;
        this.elementName = strTuitionPaymentFragmentbindingInflater1;
        return i;
    }

    @Override // defpackage.isOutputSizeEqual
    public final Object decodeValue() {
        return internalDecodeValue();
    }

    @Override // defpackage.isOutputSizeEqual, defpackage.stopListeningToRotationEvents
    public final boolean decodeNotNullMark() {
        return this.store.get(this.elementName) != null;
    }

    @Override // defpackage.isOutputSizeEqual, defpackage.stopListeningToRotationEvents
    public final stopListeningToRotationEvents decodeInline(createImageAnalysis p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        if (RouteSerializerKt.isValueClass(p0)) {
            this.elementName = p0.TuitionPaymentFragmentbindingInflater1(0);
            this.elementIndex = 0;
        }
        return super.decodeInline(p0);
    }

    public final <T> T decodeRouteWithArgs$navigation_common_release(isBitDepthMatched<? extends T> p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        return (T) super.decodeSerializableValue(p0);
    }

    @Override // defpackage.isOutputSizeEqual, defpackage.stopListeningToRotationEvents
    public final <T> T decodeSerializableValue(isBitDepthMatched<? extends T> p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        return (T) internalDecodeValue();
    }

    private final Object internalDecodeValue() {
        Object obj = this.store.get(this.elementName);
        if (obj != null) {
            return obj;
        }
        StringBuilder sb = new StringBuilder("Unexpected null value for non-nullable argument ");
        sb.append(this.elementName);
        throw new IllegalStateException(sb.toString().toString());
    }
}
