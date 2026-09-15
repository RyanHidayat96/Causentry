package defpackage;

import androidx.collection.SieveCacheKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.StringCompanionObject;
import kotlinx.serialization.json.internal.JsonDecodingException;

/* JADX INFO: loaded from: classes7.dex */
public final class getRotatedViewportSize {
    private static final createImageAnalysis TuitionPaymentFragmentspecialinlinedviewModeldefault1;

    public static final shouldReuseImplementation b(String str) {
        if (str == null) {
            return PreviewView.INSTANCE;
        }
        return new setTransformationInfo(str, true, null, 4, null);
    }

    public static final createImageAnalysis TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        return TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    }

    static {
        Intrinsics.checkNotNullParameter(StringCompanionObject.INSTANCE, "");
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = lambdasetCameraSelector3androidxcameraviewCameraController.TuitionPaymentFragmentspecialinlinedviewModeldefault1("kotlinx.serialization.json.JsonUnquotedLiteral", CameraControllerUseCases.INSTANCE);
    }

    public static final shouldReuseImplementation TuitionPaymentFragmentspecialinlinedviewModeldefault3(isTransformationInfoReady istransformationinfoready) {
        Intrinsics.checkNotNullParameter(istransformationinfoready, "");
        shouldReuseImplementation shouldreuseimplementation = istransformationinfoready instanceof shouldReuseImplementation ? (shouldReuseImplementation) istransformationinfoready : null;
        if (shouldreuseimplementation != null) {
            return shouldreuseimplementation;
        }
        StringBuilder sb = new StringBuilder("Element ");
        sb.append(Reflection.getOrCreateKotlinClass(istransformationinfoready.getClass()));
        sb.append(" is not a ");
        sb.append("JsonPrimitive");
        throw new IllegalArgumentException(sb.toString());
    }

    public static final int TuitionPaymentFragmentbindingInflater1(shouldReuseImplementation shouldreuseimplementation) {
        Intrinsics.checkNotNullParameter(shouldreuseimplementation, "");
        try {
            long jTuitionPaymentFragmentbindingInflater1 = new PreviewViewImplementationMode(shouldreuseimplementation.getB()).TuitionPaymentFragmentbindingInflater1();
            if (SieveCacheKt.NodeMetaAndPreviousMask <= jTuitionPaymentFragmentbindingInflater1 && jTuitionPaymentFragmentbindingInflater1 <= SieveCacheKt.NodeLinkMask) {
                return (int) jTuitionPaymentFragmentbindingInflater1;
            }
            StringBuilder sb = new StringBuilder();
            sb.append(shouldreuseimplementation.getB());
            sb.append(" is not an Int");
            throw new NumberFormatException(sb.toString());
        } catch (JsonDecodingException e2) {
            throw new NumberFormatException(e2.getMessage());
        }
    }

    public static final long asBinder(shouldReuseImplementation shouldreuseimplementation) {
        Intrinsics.checkNotNullParameter(shouldreuseimplementation, "");
        try {
            return new PreviewViewImplementationMode(shouldreuseimplementation.getB()).TuitionPaymentFragmentbindingInflater1();
        } catch (JsonDecodingException e2) {
            throw new NumberFormatException(e2.getMessage());
        }
    }

    public static final double TuitionPaymentFragmentspecialinlinedviewModeldefault2(shouldReuseImplementation shouldreuseimplementation) {
        Intrinsics.checkNotNullParameter(shouldreuseimplementation, "");
        return Double.parseDouble(shouldreuseimplementation.getB());
    }

    public static final float TuitionPaymentFragmentspecialinlinedviewModeldefault3(shouldReuseImplementation shouldreuseimplementation) {
        Intrinsics.checkNotNullParameter(shouldreuseimplementation, "");
        return Float.parseFloat(shouldreuseimplementation.getB());
    }

    public static final Boolean b(shouldReuseImplementation shouldreuseimplementation) {
        Intrinsics.checkNotNullParameter(shouldreuseimplementation, "");
        return getPreviewBitmap.TuitionPaymentFragmentspecialinlinedviewModeldefault2(shouldreuseimplementation.getB());
    }

    public static final String TuitionPaymentFragmentspecialinlinedviewModeldefault1(shouldReuseImplementation shouldreuseimplementation) {
        Intrinsics.checkNotNullParameter(shouldreuseimplementation, "");
        if (shouldreuseimplementation instanceof PreviewView) {
            return null;
        }
        return shouldreuseimplementation.getB();
    }
}
