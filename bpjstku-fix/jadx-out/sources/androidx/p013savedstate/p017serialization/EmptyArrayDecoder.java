package androidx.p013savedstate.p017serialization;

import defpackage.PreviewViewImplementationOnSurfaceNotInUseListener;
import defpackage.createImageAnalysis;
import defpackage.isOutputSizeEqual;
import defpackage.waitForNextFrame;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\n\u001a\u00020\t8\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r"}, d2 = {"Landroidx/savedstate/serialization/EmptyArrayDecoder;", "LisOutputSizeEqual;", "<init>", "()V", "LcreateImageAnalysis;", "p0", "", "decodeElementIndex", "(LcreateImageAnalysis;)I", "LPreviewViewImplementationOnSurfaceNotInUseListener;", "serializersModule", "LPreviewViewImplementationOnSurfaceNotInUseListener;", "getSerializersModule", "()LPreviewViewImplementationOnSurfaceNotInUseListener;"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class EmptyArrayDecoder extends isOutputSizeEqual {
    public static final EmptyArrayDecoder INSTANCE = new EmptyArrayDecoder();
    private static final PreviewViewImplementationOnSurfaceNotInUseListener serializersModule = waitForNextFrame.b();

    private EmptyArrayDecoder() {
    }

    @Override // defpackage.setActiveRecording
    public final PreviewViewImplementationOnSurfaceNotInUseListener getSerializersModule() {
        return serializersModule;
    }

    @Override // defpackage.setActiveRecording
    public final int decodeElementIndex(createImageAnalysis p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        return -1;
    }
}
