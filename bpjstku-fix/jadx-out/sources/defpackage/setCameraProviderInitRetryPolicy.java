package defpackage;

import android.net.Uri;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class setCameraProviderInitRetryPolicy<Data> implements getSchedulerHandler<Uri, Data> {
    private static final Set<String> TuitionPaymentFragmentbindingInflater1 = Collections.unmodifiableSet(new HashSet(Arrays.asList("http", "https")));
    private final getSchedulerHandler<getCameraFactoryProvider, Data> TuitionPaymentFragmentspecialinlinedviewModeldefault2;

    @Override // defpackage.getSchedulerHandler
    public final /* bridge */ /* synthetic */ getSchedulerHandler.TuitionPaymentFragmentbindingInflater1 TuitionPaymentFragmentbindingInflater1(Uri uri, int i, int i2, getTargetRotation gettargetrotation) {
        return this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentbindingInflater1(new getCameraFactoryProvider(uri.toString()), i, i2, gettargetrotation);
    }

    @Override // defpackage.getSchedulerHandler
    public final /* synthetic */ boolean TuitionPaymentFragmentbindingInflater1(Uri uri) {
        return TuitionPaymentFragmentbindingInflater1.contains(uri.getScheme());
    }

    public setCameraProviderInitRetryPolicy(getSchedulerHandler<getCameraFactoryProvider, Data> getschedulerhandler) {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = getschedulerhandler;
    }

    public static class TuitionPaymentFragmentbindingInflater1 implements getDeviceSurfaceManagerProvider<Uri, InputStream> {
        @Override // defpackage.getDeviceSurfaceManagerProvider
        public final getSchedulerHandler<Uri, InputStream> TuitionPaymentFragmentspecialinlinedviewModeldefault3(setCameraExecutor setcameraexecutor) {
            return new setCameraProviderInitRetryPolicy(setcameraexecutor.TuitionPaymentFragmentspecialinlinedviewModeldefault3(getCameraFactoryProvider.class, InputStream.class));
        }
    }
}
