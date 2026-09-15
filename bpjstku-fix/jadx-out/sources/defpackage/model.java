package defpackage;

import java.util.concurrent.Executor;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes3.dex */
public final class model implements getSampleRate {
    static final Logger b = Logger.getLogger(TakePictureManager1.class.getName());
    final CameraConfigProviderExternalSyntheticLambda0 TuitionPaymentFragmentbindingInflater1;
    final lambdaonResult1androidxcameracoreimagecaptureTakePictureRequest TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    final AutoValue_StreamSpec1 TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    final getExpectedFrameRateRange TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Executor f1276a;

    @isSamsungJ6
    public model(Executor executor, lambdaonResult1androidxcameracoreimagecaptureTakePictureRequest lambdaonresult1androidxcameracoreimagecapturetakepicturerequest, getExpectedFrameRateRange getexpectedframeraterange, AutoValue_StreamSpec1 autoValue_StreamSpec1, CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0) {
        this.f1276a = executor;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = lambdaonresult1androidxcameracoreimagecapturetakepicturerequest;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = getexpectedframeraterange;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = autoValue_StreamSpec1;
        this.TuitionPaymentFragmentbindingInflater1 = cameraConfigProviderExternalSyntheticLambda0;
    }

    @Override // defpackage.getSampleRate
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault3(final retryRequest retryrequest, final resume resumeVar, final getTagBundleKey gettagbundlekey) {
        this.f1276a.execute(new Runnable() { // from class: manufacturer
            @Override // java.lang.Runnable
            public final void run() {
                final model modelVar = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                final retryRequest retryrequest2 = retryrequest;
                getTagBundleKey gettagbundlekey2 = gettagbundlekey;
                resume resumeVar2 = resumeVar;
                try {
                    TakePictureRequestExternalSyntheticLambda4 takePictureRequestExternalSyntheticLambda4TuitionPaymentFragmentbindingInflater1 = modelVar.TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentbindingInflater1(retryrequest2.TuitionPaymentFragmentspecialinlinedviewModeldefault2());
                    if (takePictureRequestExternalSyntheticLambda4TuitionPaymentFragmentbindingInflater1 == null) {
                        String str = String.format("Transport backend '%s' is not registered", retryrequest2.TuitionPaymentFragmentspecialinlinedviewModeldefault2());
                        model.b.warning(str);
                        gettagbundlekey2.onSchedule(new IllegalArgumentException(str));
                    } else {
                        final resume resumeVarTuitionPaymentFragmentspecialinlinedviewModeldefault1 = takePictureRequestExternalSyntheticLambda4TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1(resumeVar2);
                        modelVar.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault2(new CameraConfigProviderExternalSyntheticLambda0.TuitionPaymentFragmentbindingInflater1() { // from class: getProfile
                            @Override // CameraConfigProviderExternalSyntheticLambda0.TuitionPaymentFragmentbindingInflater1
                            public final Object b() {
                                model modelVar2 = modelVar;
                                retryRequest retryrequest3 = retryrequest2;
                                modelVar2.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault3(retryrequest3, resumeVarTuitionPaymentFragmentspecialinlinedviewModeldefault1);
                                modelVar2.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault2(retryrequest3, 1);
                                return null;
                            }
                        });
                        gettagbundlekey2.onSchedule(null);
                    }
                } catch (Exception e2) {
                    Logger logger = model.b;
                    StringBuilder sb = new StringBuilder("Error scheduling event ");
                    sb.append(e2.getMessage());
                    logger.warning(sb.toString());
                    gettagbundlekey2.onSchedule(e2);
                }
            }
        });
    }
}
