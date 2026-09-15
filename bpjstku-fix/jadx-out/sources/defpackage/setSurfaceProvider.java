package defpackage;

import android.content.Context;
import androidx.core.view.GestureDetectorCompat;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\tR\u0014\u0010\f\u001a\u00020\b8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\u000f\u001a\u00020\u00048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e"}, d2 = {"LsetSurfaceProvider;", "", "Landroid/content/Context;", "p0", "LlambdaaddCameraSurfaceAndErrorListener1androidxcameracorePreview;", "p1", "<init>", "(Landroid/content/Context;LlambdaaddCameraSurfaceAndErrorListener1androidxcameracorePreview;)V", "Landroidx/core/view/GestureDetectorCompat;", "(LlambdaaddCameraSurfaceAndErrorListener1androidxcameracorePreview;Landroidx/core/view/GestureDetectorCompat;)V", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "Landroidx/core/view/GestureDetectorCompat;", "b", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "LlambdaaddCameraSurfaceAndErrorListener1androidxcameracorePreview;", "TuitionPaymentFragmentbindingInflater1"}, k = 1, mv = {1, 7, 0}, xi = 48)
public final class setSurfaceProvider {

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
    final GestureDetectorCompat b;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
    final lambdaaddCameraSurfaceAndErrorListener1androidxcameracorePreview TuitionPaymentFragmentbindingInflater1;

    private setSurfaceProvider(lambdaaddCameraSurfaceAndErrorListener1androidxcameracorePreview lambdaaddcamerasurfaceanderrorlistener1androidxcameracorepreview, GestureDetectorCompat gestureDetectorCompat) {
        Intrinsics.checkNotNullParameter(lambdaaddcamerasurfaceanderrorlistener1androidxcameracorepreview, "");
        Intrinsics.checkNotNullParameter(gestureDetectorCompat, "");
        this.TuitionPaymentFragmentbindingInflater1 = lambdaaddcamerasurfaceanderrorlistener1androidxcameracorepreview;
        this.b = gestureDetectorCompat;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public setSurfaceProvider(Context context, lambdaaddCameraSurfaceAndErrorListener1androidxcameracorePreview lambdaaddcamerasurfaceanderrorlistener1androidxcameracorepreview) {
        this(lambdaaddcamerasurfaceanderrorlistener1androidxcameracorepreview, new GestureDetectorCompat(context, lambdaaddcamerasurfaceanderrorlistener1androidxcameracorepreview));
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(lambdaaddcamerasurfaceanderrorlistener1androidxcameracorepreview, "");
    }
}
