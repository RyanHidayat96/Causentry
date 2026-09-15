package defpackage;

import com.android.volley.DefaultRetryPolicy;
import java.io.InputStream;

/* JADX INFO: loaded from: classes3.dex */
public final class setSchedulerHandler implements getSchedulerHandler<getCameraFactoryProvider, InputStream> {
    private static isMirroring<Integer> TuitionPaymentFragmentspecialinlinedviewModeldefault2 = isMirroring.TuitionPaymentFragmentbindingInflater1("com.bumptech.glide.load.model.stream.HttpGlideUrlLoader.Timeout", Integer.valueOf(DefaultRetryPolicy.DEFAULT_TIMEOUT_MS));
    private final getQuirkSettings<getCameraFactoryProvider, getCameraFactoryProvider> b;

    @Override // defpackage.getSchedulerHandler
    public final /* bridge */ /* synthetic */ getSchedulerHandler.TuitionPaymentFragmentbindingInflater1<InputStream> TuitionPaymentFragmentbindingInflater1(getCameraFactoryProvider getcamerafactoryprovider, int i, int i2, getTargetRotation gettargetrotation) {
        getCameraFactoryProvider getcamerafactoryprovider2 = getcamerafactoryprovider;
        getQuirkSettings<getCameraFactoryProvider, getCameraFactoryProvider> getquirksettings = this.b;
        if (getquirksettings != null) {
            getCameraFactoryProvider getcamerafactoryproviderTuitionPaymentFragmentbindingInflater1 = getquirksettings.TuitionPaymentFragmentbindingInflater1(getcamerafactoryprovider2);
            if (getcamerafactoryproviderTuitionPaymentFragmentbindingInflater1 == null) {
                this.b.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault3(getQuirkSettings.b.TuitionPaymentFragmentbindingInflater1(getcamerafactoryprovider2, 0, 0), getcamerafactoryprovider2);
            } else {
                getcamerafactoryprovider2 = getcamerafactoryproviderTuitionPaymentFragmentbindingInflater1;
            }
        }
        isMirroring<Integer> ismirroring = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        return new getSchedulerHandler.TuitionPaymentFragmentbindingInflater1<>(getcamerafactoryprovider2, new getTargets(getcamerafactoryprovider2, ((Integer) (gettargetrotation.TuitionPaymentFragmentspecialinlinedviewModeldefault1.containsKey(ismirroring) ? gettargetrotation.TuitionPaymentFragmentspecialinlinedviewModeldefault1.get(ismirroring) : ismirroring.b)).intValue()));
    }

    @Override // defpackage.getSchedulerHandler
    public final /* synthetic */ boolean TuitionPaymentFragmentbindingInflater1(getCameraFactoryProvider getcamerafactoryprovider) {
        return true;
    }

    public setSchedulerHandler() {
        this(null);
    }

    public setSchedulerHandler(getQuirkSettings<getCameraFactoryProvider, getCameraFactoryProvider> getquirksettings) {
        this.b = getquirksettings;
    }

    public static class TuitionPaymentFragmentspecialinlinedviewModeldefault2 implements getDeviceSurfaceManagerProvider<getCameraFactoryProvider, InputStream> {
        private final getQuirkSettings<getCameraFactoryProvider, getCameraFactoryProvider> TuitionPaymentFragmentspecialinlinedviewModeldefault3 = new getQuirkSettings<>(500);

        @Override // defpackage.getDeviceSurfaceManagerProvider
        public final getSchedulerHandler<getCameraFactoryProvider, InputStream> TuitionPaymentFragmentspecialinlinedviewModeldefault3(setCameraExecutor setcameraexecutor) {
            return new setSchedulerHandler(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
        }
    }
}
