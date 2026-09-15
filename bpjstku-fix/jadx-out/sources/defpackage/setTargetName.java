package defpackage;

import java.io.InputStream;
import java.net.URL;

/* JADX INFO: loaded from: classes3.dex */
public final class setTargetName implements getSchedulerHandler<URL, InputStream> {
    private final getSchedulerHandler<getCameraFactoryProvider, InputStream> b;

    @Override // defpackage.getSchedulerHandler
    public final /* bridge */ /* synthetic */ getSchedulerHandler.TuitionPaymentFragmentbindingInflater1<InputStream> TuitionPaymentFragmentbindingInflater1(URL url, int i, int i2, getTargetRotation gettargetrotation) {
        return this.b.TuitionPaymentFragmentbindingInflater1(new getCameraFactoryProvider(url), i, i2, gettargetrotation);
    }

    @Override // defpackage.getSchedulerHandler
    public final /* synthetic */ boolean TuitionPaymentFragmentbindingInflater1(URL url) {
        return true;
    }

    public setTargetName(getSchedulerHandler<getCameraFactoryProvider, InputStream> getschedulerhandler) {
        this.b = getschedulerhandler;
    }

    public static class TuitionPaymentFragmentspecialinlinedviewModeldefault3 implements getDeviceSurfaceManagerProvider<URL, InputStream> {
        @Override // defpackage.getDeviceSurfaceManagerProvider
        public final getSchedulerHandler<URL, InputStream> TuitionPaymentFragmentspecialinlinedviewModeldefault3(setCameraExecutor setcameraexecutor) {
            return new setTargetName(setcameraexecutor.TuitionPaymentFragmentspecialinlinedviewModeldefault3(getCameraFactoryProvider.class, InputStream.class));
        }
    }
}
