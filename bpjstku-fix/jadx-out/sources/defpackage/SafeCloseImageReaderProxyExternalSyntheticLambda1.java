package defpackage;

import android.app.Activity;
import android.content.Context;
import androidx.fragment.app.Fragment;
import com.datadog.android.api.SdkCore;
import com.datadog.android.rum.tracking.ViewTrackingStrategy;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\b\u0018\u00002\u00020\u00012\u00020\u0002BA\b\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0005\u0012\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u0005¢\u0006\u0004\b\f\u0010\rB\u0019\b\u0000\u0012\u0006\u0010\u0004\u001a\u00020\u000e\u0012\u0006\u0010\u0007\u001a\u00020\u000f¢\u0006\u0004\b\f\u0010\u0010J\u001a\u0010\u0012\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0011H\u0096\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u001f\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0004\u001a\u00020\u00172\u0006\u0010\u0007\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u0019\u0010\u001c\u001a\u00020\u00192\b\u0010\u0004\u001a\u0004\u0018\u00010\u0018H\u0016¢\u0006\u0004\b\u001c\u0010\u001dR\u0014\u0010\u001f\u001a\u00020\u000e8\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001eR\u0014\u0010!\u001a\u00020\u000f8\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010 "}, d2 = {"LSafeCloseImageReaderProxyExternalSyntheticLambda1;", "LSafeCloseImageReaderProxyExternalSyntheticLambda0;", "Lcom/datadog/android/rum/tracking/ViewTrackingStrategy;", "", "p0", "LSingleCloseImageProxy;", "Landroid/app/Activity;", "p1", "Landroidx/fragment/app/Fragment;", "p2", "Landroid/app/Fragment;", "p3", "<init>", "(ZLSingleCloseImageProxy;LSingleCloseImageProxy;LSingleCloseImageProxy;)V", "LsafeClose;", "LSurfaceOrientedMeteringPointFactory;", "(LsafeClose;LSurfaceOrientedMeteringPointFactory;)V", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Lcom/datadog/android/api/SdkCore;", "Landroid/content/Context;", "", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "(Lcom/datadog/android/api/SdkCore;Landroid/content/Context;)V", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "(Landroid/content/Context;)V", "LsafeClose;", "b", "LSurfaceOrientedMeteringPointFactory;", "TuitionPaymentFragmentbindingInflater1"}, k = 1, mv = {1, 7, 0}, xi = 48)
public final class SafeCloseImageReaderProxyExternalSyntheticLambda1 extends SafeCloseImageReaderProxyExternalSyntheticLambda0 implements ViewTrackingStrategy {

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
    private final SurfaceOrientedMeteringPointFactory TuitionPaymentFragmentbindingInflater1;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
    private final safeClose b;

    private SafeCloseImageReaderProxyExternalSyntheticLambda1(safeClose safeclose, SurfaceOrientedMeteringPointFactory surfaceOrientedMeteringPointFactory) {
        Intrinsics.checkNotNullParameter(safeclose, "");
        Intrinsics.checkNotNullParameter(surfaceOrientedMeteringPointFactory, "");
        this.b = safeclose;
        this.TuitionPaymentFragmentbindingInflater1 = surfaceOrientedMeteringPointFactory;
    }

    public /* synthetic */ SafeCloseImageReaderProxyExternalSyntheticLambda1(boolean z, isClosed isclosed, lambdanew0androidxcameracoreSafeCloseImageReaderProxy lambdanew0androidxcameracoresafecloseimagereaderproxy, lambdasetOnImageAvailableListener1androidxcameracoreSafeCloseImageReaderProxy lambdasetonimageavailablelistener1androidxcameracoresafecloseimagereaderproxy, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(z, (i & 2) != 0 ? new isClosed() : isclosed, (i & 4) != 0 ? new lambdanew0androidxcameracoreSafeCloseImageReaderProxy() : lambdanew0androidxcameracoresafecloseimagereaderproxy, (i & 8) != 0 ? new lambdasetOnImageAvailableListener1androidxcameracoreSafeCloseImageReaderProxy() : lambdasetonimageavailablelistener1androidxcameracoresafecloseimagereaderproxy);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    private SafeCloseImageReaderProxyExternalSyntheticLambda1(boolean z, SingleCloseImageProxy<Activity> singleCloseImageProxy, SingleCloseImageProxy<Fragment> singleCloseImageProxy2, SingleCloseImageProxy<android.app.Fragment> singleCloseImageProxy3) {
        this(new safeClose(z, singleCloseImageProxy), new SurfaceOrientedMeteringPointFactory(z, singleCloseImageProxy2, singleCloseImageProxy3));
        Intrinsics.checkNotNullParameter(singleCloseImageProxy, "");
        Intrinsics.checkNotNullParameter(singleCloseImageProxy2, "");
        Intrinsics.checkNotNullParameter(singleCloseImageProxy3, "");
    }

    @Override // defpackage.SafeCloseImageReaderProxyExternalSyntheticLambda0, defpackage.SurfaceOutputEventEventCode
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault3(SdkCore p0, Context p1) {
        Intrinsics.checkNotNullParameter(p0, "");
        Intrinsics.checkNotNullParameter(p1, "");
        super.TuitionPaymentFragmentspecialinlinedviewModeldefault3(p0, p1);
        this.b.TuitionPaymentFragmentspecialinlinedviewModeldefault3(p0, p1);
        this.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault3(p0, p1);
    }

    @Override // defpackage.SafeCloseImageReaderProxyExternalSyntheticLambda0, defpackage.SurfaceOutputEventEventCode
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault1(Context p0) {
        this.b.TuitionPaymentFragmentspecialinlinedviewModeldefault1(p0);
        this.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1(p0);
        super.TuitionPaymentFragmentspecialinlinedviewModeldefault1(p0);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!Intrinsics.areEqual(getClass(), p0 != null ? p0.getClass() : null)) {
            return false;
        }
        Intrinsics.checkNotNull(p0, "");
        SafeCloseImageReaderProxyExternalSyntheticLambda1 safeCloseImageReaderProxyExternalSyntheticLambda1 = (SafeCloseImageReaderProxyExternalSyntheticLambda1) p0;
        return Intrinsics.areEqual(this.b, safeCloseImageReaderProxyExternalSyntheticLambda1.b) && Intrinsics.areEqual(this.TuitionPaymentFragmentbindingInflater1, safeCloseImageReaderProxyExternalSyntheticLambda1.TuitionPaymentFragmentbindingInflater1);
    }

    public final int hashCode() {
        return (this.b.hashCode() * 31) + this.TuitionPaymentFragmentbindingInflater1.hashCode();
    }
}
