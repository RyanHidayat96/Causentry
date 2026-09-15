package defpackage;

import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;

/* JADX INFO: loaded from: classes3.dex */
public final class setCameraOpenRetryMaxTimeoutInMillisWhileResuming<Model> implements getSchedulerHandler<Model, Model> {
    private static final setCameraOpenRetryMaxTimeoutInMillisWhileResuming<?> TuitionPaymentFragmentspecialinlinedviewModeldefault1 = new setCameraOpenRetryMaxTimeoutInMillisWhileResuming<>();

    @Override // defpackage.getSchedulerHandler
    public final boolean TuitionPaymentFragmentbindingInflater1(Model model) {
        return true;
    }

    public static <T> setCameraOpenRetryMaxTimeoutInMillisWhileResuming<T> TuitionPaymentFragmentbindingInflater1() {
        return (setCameraOpenRetryMaxTimeoutInMillisWhileResuming<T>) TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    }

    @Deprecated
    public setCameraOpenRetryMaxTimeoutInMillisWhileResuming() {
    }

    @Override // defpackage.getSchedulerHandler
    public final getSchedulerHandler.TuitionPaymentFragmentbindingInflater1<Model> TuitionPaymentFragmentbindingInflater1(Model model, int i, int i2, getTargetRotation gettargetrotation) {
        return new getSchedulerHandler.TuitionPaymentFragmentbindingInflater1<>(new setResolutionSelector(model), new TuitionPaymentFragmentspecialinlinedviewModeldefault2(model));
    }

    static class TuitionPaymentFragmentspecialinlinedviewModeldefault2<Model> implements isUseCasesCombinationSupportedByFramework<Model> {
        private final Model TuitionPaymentFragmentbindingInflater1;

        @Override // defpackage.isUseCasesCombinationSupportedByFramework
        public final void TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        }

        @Override // defpackage.isUseCasesCombinationSupportedByFramework
        public final void b() {
        }

        TuitionPaymentFragmentspecialinlinedviewModeldefault2(Model model) {
            this.TuitionPaymentFragmentbindingInflater1 = model;
        }

        @Override // defpackage.isUseCasesCombinationSupportedByFramework
        public final void TuitionPaymentFragmentspecialinlinedviewModeldefault2(Priority priority, isUseCasesCombinationSupportedByFramework.TuitionPaymentFragmentspecialinlinedviewModeldefault1<? super Model> tuitionPaymentFragmentspecialinlinedviewModeldefault1) {
            tuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault1(this.TuitionPaymentFragmentbindingInflater1);
        }

        @Override // defpackage.isUseCasesCombinationSupportedByFramework
        public final Class<Model> TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
            return (Class<Model>) this.TuitionPaymentFragmentbindingInflater1.getClass();
        }

        @Override // defpackage.isUseCasesCombinationSupportedByFramework
        public final DataSource TuitionPaymentFragmentbindingInflater1() {
            return DataSource.LOCAL;
        }
    }

    public static class b<Model> implements getDeviceSurfaceManagerProvider<Model, Model> {
        private static final b<?> TuitionPaymentFragmentspecialinlinedviewModeldefault2 = new b<>();

        public static <T> b<T> b() {
            return (b<T>) TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        }

        @Deprecated
        public b() {
        }

        @Override // defpackage.getDeviceSurfaceManagerProvider
        public final getSchedulerHandler<Model, Model> TuitionPaymentFragmentspecialinlinedviewModeldefault3(setCameraExecutor setcameraexecutor) {
            return setCameraOpenRetryMaxTimeoutInMillisWhileResuming.TuitionPaymentFragmentbindingInflater1();
        }
    }
}
