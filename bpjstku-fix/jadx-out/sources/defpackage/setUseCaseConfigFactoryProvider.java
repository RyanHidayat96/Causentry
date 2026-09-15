package defpackage;

import android.content.Context;
import android.net.Uri;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.io.InputStream;

/* JADX INFO: loaded from: classes3.dex */
public final class setUseCaseConfigFactoryProvider implements getSchedulerHandler<Uri, InputStream> {
    private final Context TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    @Override // defpackage.getSchedulerHandler
    public final /* synthetic */ getSchedulerHandler.TuitionPaymentFragmentbindingInflater1<InputStream> TuitionPaymentFragmentbindingInflater1(Uri uri, int i, int i2, getTargetRotation gettargetrotation) {
        Uri uri2 = uri;
        if (i == Integer.MIN_VALUE || i2 == Integer.MIN_VALUE || i > 512 || i2 > 384) {
            return null;
        }
        setResolutionSelector setresolutionselector = new setResolutionSelector(uri2);
        Context context = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        return new getSchedulerHandler.TuitionPaymentFragmentbindingInflater1<>(setresolutionselector, lambdacreateExecutor0.TuitionPaymentFragmentspecialinlinedviewModeldefault3(context, uri2, new lambdacreateExecutor0.TuitionPaymentFragmentspecialinlinedviewModeldefault1(context.getContentResolver())));
    }

    @Override // defpackage.getSchedulerHandler
    public final /* synthetic */ boolean TuitionPaymentFragmentbindingInflater1(Uri uri) {
        Uri uri2 = uri;
        return uri2 != null && FirebaseAnalytics.Param.CONTENT.equals(uri2.getScheme()) && "media".equals(uri2.getAuthority()) && !uri2.getPathSegments().contains("video");
    }

    public setUseCaseConfigFactoryProvider(Context context) {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = context.getApplicationContext();
    }

    public static class TuitionPaymentFragmentspecialinlinedviewModeldefault2 implements getDeviceSurfaceManagerProvider<Uri, InputStream> {
        private final Context TuitionPaymentFragmentbindingInflater1;

        public TuitionPaymentFragmentspecialinlinedviewModeldefault2(Context context) {
            this.TuitionPaymentFragmentbindingInflater1 = context;
        }

        @Override // defpackage.getDeviceSurfaceManagerProvider
        public final getSchedulerHandler<Uri, InputStream> TuitionPaymentFragmentspecialinlinedviewModeldefault3(setCameraExecutor setcameraexecutor) {
            return new setUseCaseConfigFactoryProvider(this.TuitionPaymentFragmentbindingInflater1);
        }
    }
}
