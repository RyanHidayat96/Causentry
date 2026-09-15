package defpackage;

import androidx.exifinterface.media.ExifInterface;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.koin.core.error.InstanceCreationException;
import org.koin.core.logger.Level;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b&\u0018\u0000 \b*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0001\bB\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001d\u0010\b\u001a\u00028\u0001\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0004\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\n\u001a\u00028\u0001\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0004\u001a\u00020\u0007H&¢\u0006\u0004\b\n\u0010\tR \u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r"}, d2 = {"LSurfaceViewStretchedQuirk;", ExifInterface.GPS_DIRECTION_TRUE, "", "LZoomGestureDetectorZoomEventMove;", "p0", "<init>", "(LZoomGestureDetectorZoomEventMove;)V", "LScreenFlashUiInfo;", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "(LScreenFlashUiInfo;)Ljava/lang/Object;", "b", "LZoomGestureDetectorZoomEventMove;", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "()LZoomGestureDetectorZoomEventMove;", "TuitionPaymentFragmentbindingInflater1"}, k = 1, mv = {2, 3, 0})
public abstract class SurfaceViewStretchedQuirk<T> {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final ZoomGestureDetectorZoomEventMove<T> TuitionPaymentFragmentbindingInflater1;

    public abstract <T> T b(ScreenFlashUiInfo p0);

    public SurfaceViewStretchedQuirk(ZoomGestureDetectorZoomEventMove<T> zoomGestureDetectorZoomEventMove) {
        this.TuitionPaymentFragmentbindingInflater1 = zoomGestureDetectorZoomEventMove;
    }

    public final ZoomGestureDetectorZoomEventMove<T> TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        return this.TuitionPaymentFragmentbindingInflater1;
    }

    public final <T> T TuitionPaymentFragmentspecialinlinedviewModeldefault2(ScreenFlashUiInfo p0) throws InstanceCreationException {
        getFocusX.Companion companion = getFocusX.INSTANCE;
        if (getFocusX.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2().TuitionPaymentFragmentbindingInflater1.compareTo(Level.DEBUG) <= 0) {
            getFocusX.Companion companion2 = getFocusX.INSTANCE;
            isSamsungFold2OrFold3 issamsungfold2orfold3TuitionPaymentFragmentspecialinlinedviewModeldefault2 = getFocusX.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
            StringBuilder sb = new StringBuilder("| create instance for ");
            sb.append(this.TuitionPaymentFragmentbindingInflater1);
            issamsungfold2orfold3TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault1(Level.DEBUG, sb.toString());
        }
        try {
            CoordinateTransform coordinateTransform = p0.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            Function2<? super FileTransformFactory, ? super CoordinateTransform, ? extends T> function2 = this.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            if (function2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
            }
            FileTransformFactory fileTransformFactory = p0.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            if (fileTransformFactory != null) {
                return function2.invoke(fileTransformFactory, coordinateTransform);
            }
            throw new IllegalStateException("Can't execute definition instance while this context is not registered against any Koin instance".toString());
        } catch (Exception e2) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(e2.toString());
            sb2.append("\n\t");
            StackTraceElement[] stackTrace = e2.getStackTrace();
            Intrinsics.checkExpressionValueIsNotNull(stackTrace, "");
            ArrayList arrayList = new ArrayList();
            for (StackTraceElement stackTraceElement : stackTrace) {
                Intrinsics.checkExpressionValueIsNotNull(stackTraceElement, "");
                String className = stackTraceElement.getClassName();
                Intrinsics.checkExpressionValueIsNotNull(className, "");
                if (StringsKt.contains$default((CharSequence) className, (CharSequence) "sun.reflect", false, 2, (Object) null)) {
                    break;
                }
                arrayList.add(stackTraceElement);
            }
            sb2.append(CollectionsKt.joinToString$default(arrayList, "\n\t", null, null, 0, null, null, 62, null));
            String string = sb2.toString();
            getFocusX.Companion companion3 = getFocusX.INSTANCE;
            isSamsungFold2OrFold3 issamsungfold2orfold3TuitionPaymentFragmentspecialinlinedviewModeldefault3 = getFocusX.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
            StringBuilder sb3 = new StringBuilder("Instance creation error : could not create instance for ");
            sb3.append(this.TuitionPaymentFragmentbindingInflater1);
            sb3.append(": ");
            sb3.append(string);
            issamsungfold2orfold3TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault1(Level.ERROR, sb3.toString());
            StringBuilder sb4 = new StringBuilder("Could not create instance for ");
            sb4.append(this.TuitionPaymentFragmentbindingInflater1);
            throw new InstanceCreationException(sb4.toString(), e2);
        }
    }
}
