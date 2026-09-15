package defpackage;

import android.content.Context;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
@getExtraEncoderProfiles
public class TakePictureManager1 implements TakePictureRequest {
    public static volatile decrementRetryCounter TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    private final getSampleRate TuitionPaymentFragmentbindingInflater1;
    public final getHdrFormat TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    private final CameraConfigs TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    private final CameraConfigs b;

    @isSamsungJ6
    TakePictureManager1(CameraConfigs cameraConfigs, CameraConfigs cameraConfigs2, getSampleRate getsamplerate, getHdrFormat gethdrformat, final getSharedSurfaces getsharedsurfaces) {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = cameraConfigs;
        this.b = cameraConfigs2;
        this.TuitionPaymentFragmentbindingInflater1 = getsamplerate;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = gethdrformat;
        getsharedsurfaces.TuitionPaymentFragmentspecialinlinedviewModeldefault1.execute(new Runnable() { // from class: AutoValue_SessionConfig_OutputConfig
            @Override // java.lang.Runnable
            public final void run() {
                final getSharedSurfaces getsharedsurfaces2 = getsharedsurfaces;
                getsharedsurfaces2.b.TuitionPaymentFragmentspecialinlinedviewModeldefault2(new CameraConfigProviderExternalSyntheticLambda0.TuitionPaymentFragmentbindingInflater1() { // from class: setSharedSurfaces
                    @Override // CameraConfigProviderExternalSyntheticLambda0.TuitionPaymentFragmentbindingInflater1
                    public final Object b() {
                        getSharedSurfaces getsharedsurfaces3 = getsharedsurfaces2;
                        Iterator<retryRequest> it = getsharedsurfaces3.TuitionPaymentFragmentspecialinlinedviewModeldefault2.b().iterator();
                        while (it.hasNext()) {
                            getsharedsurfaces3.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault2(it.next(), 1);
                        }
                        return null;
                    }
                });
            }
        });
    }

    public static void TuitionPaymentFragmentbindingInflater1(Context context) {
        if (TuitionPaymentFragmentspecialinlinedviewModeldefault1 == null) {
            synchronized (TakePictureManager1.class) {
                if (TuitionPaymentFragmentspecialinlinedviewModeldefault1 == null) {
                    TuitionPaymentFragmentspecialinlinedviewModeldefault1 = new getIncompleteRequests.TuitionPaymentFragmentspecialinlinedviewModeldefault3((byte) 0).TuitionPaymentFragmentspecialinlinedviewModeldefault2(context).TuitionPaymentFragmentbindingInflater1();
                }
            }
        }
    }

    public static TakePictureManager1 TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        decrementRetryCounter decrementretrycounter = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        if (decrementretrycounter == null) {
            throw new IllegalStateException("Not initialized!");
        }
        return decrementretrycounter.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
    }

    public final getCaptureFuture TuitionPaymentFragmentspecialinlinedviewModeldefault2(getCapturingRequest getcapturingrequest) {
        return new TakePictureManagerExternalSyntheticLambda2(b(getcapturingrequest), retryRequest.b().TuitionPaymentFragmentbindingInflater1(getcapturingrequest.TuitionPaymentFragmentbindingInflater1()).TuitionPaymentFragmentbindingInflater1(getcapturingrequest.TuitionPaymentFragmentspecialinlinedviewModeldefault3()).TuitionPaymentFragmentspecialinlinedviewModeldefault2(), this);
    }

    public static Set<ProcessingNodeExternalSyntheticLambda7> b(getCapturingRequest getcapturingrequest) {
        if (getcapturingrequest instanceof lambdatrackCurrentRequests1androidxcameracoreimagecaptureTakePictureManager) {
            return Collections.unmodifiableSet(((lambdatrackCurrentRequests1androidxcameracoreimagecaptureTakePictureManager) getcapturingrequest).TuitionPaymentFragmentspecialinlinedviewModeldefault1());
        }
        return Collections.singleton(new ProcessingNodeExternalSyntheticLambda7("proto"));
    }

    @Override // defpackage.TakePictureRequest
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault2(setImagePipeline setimagepipeline, getTagBundleKey gettagbundlekey) {
        getSampleRate getsamplerate = this.TuitionPaymentFragmentbindingInflater1;
        retryRequest retryrequestTuitionPaymentFragmentspecialinlinedviewModeldefault1 = setimagepipeline.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        retryRequest retryrequestTuitionPaymentFragmentspecialinlinedviewModeldefault2 = retryRequest.b().TuitionPaymentFragmentbindingInflater1(retryrequestTuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault2()).TuitionPaymentFragmentspecialinlinedviewModeldefault2(setimagepipeline.TuitionPaymentFragmentspecialinlinedviewModeldefault2().TuitionPaymentFragmentspecialinlinedviewModeldefault2()).TuitionPaymentFragmentbindingInflater1(retryrequestTuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault1()).TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        abortRequests.TuitionPaymentFragmentbindingInflater1 tuitionPaymentFragmentbindingInflater1 = new abortRequests.TuitionPaymentFragmentbindingInflater1();
        tuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = new HashMap();
        resume.TuitionPaymentFragmentspecialinlinedviewModeldefault2 tuitionPaymentFragmentspecialinlinedviewModeldefault2TuitionPaymentFragmentspecialinlinedviewModeldefault3 = tuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentbindingInflater1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault1()).TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.b.TuitionPaymentFragmentspecialinlinedviewModeldefault1()).TuitionPaymentFragmentbindingInflater1(setimagepipeline.TuitionPaymentFragmentbindingInflater1()).b(new issueNextRequest(setimagepipeline.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), setimagepipeline.b().apply(setimagepipeline.TuitionPaymentFragmentspecialinlinedviewModeldefault2().TuitionPaymentFragmentbindingInflater1()))).TuitionPaymentFragmentspecialinlinedviewModeldefault3(setimagepipeline.TuitionPaymentFragmentspecialinlinedviewModeldefault2().b());
        if (setimagepipeline.TuitionPaymentFragmentspecialinlinedviewModeldefault2().TuitionPaymentFragmentspecialinlinedviewModeldefault3() != null && setimagepipeline.TuitionPaymentFragmentspecialinlinedviewModeldefault2().TuitionPaymentFragmentspecialinlinedviewModeldefault3().TuitionPaymentFragmentspecialinlinedviewModeldefault2() != null) {
            tuitionPaymentFragmentspecialinlinedviewModeldefault2TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault1(setimagepipeline.TuitionPaymentFragmentspecialinlinedviewModeldefault2().TuitionPaymentFragmentspecialinlinedviewModeldefault3().TuitionPaymentFragmentspecialinlinedviewModeldefault2());
        }
        if (setimagepipeline.TuitionPaymentFragmentspecialinlinedviewModeldefault2().TuitionPaymentFragmentspecialinlinedviewModeldefault1() != null) {
            ProcessingNodeExternalSyntheticLambda5 processingNodeExternalSyntheticLambda5TuitionPaymentFragmentspecialinlinedviewModeldefault1 = setimagepipeline.TuitionPaymentFragmentspecialinlinedviewModeldefault2().TuitionPaymentFragmentspecialinlinedviewModeldefault1();
            if (processingNodeExternalSyntheticLambda5TuitionPaymentFragmentspecialinlinedviewModeldefault1.b() != null) {
                tuitionPaymentFragmentspecialinlinedviewModeldefault2TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault1(processingNodeExternalSyntheticLambda5TuitionPaymentFragmentspecialinlinedviewModeldefault1.b());
            }
            if (processingNodeExternalSyntheticLambda5TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault3() != null) {
                tuitionPaymentFragmentspecialinlinedviewModeldefault2TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentbindingInflater1(processingNodeExternalSyntheticLambda5TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault3());
            }
            if (processingNodeExternalSyntheticLambda5TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentbindingInflater1() != null) {
                tuitionPaymentFragmentspecialinlinedviewModeldefault2TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault1(processingNodeExternalSyntheticLambda5TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentbindingInflater1());
            }
        }
        getsamplerate.TuitionPaymentFragmentspecialinlinedviewModeldefault3(retryrequestTuitionPaymentFragmentspecialinlinedviewModeldefault2, tuitionPaymentFragmentspecialinlinedviewModeldefault2TuitionPaymentFragmentspecialinlinedviewModeldefault3.b(), gettagbundlekey);
    }
}
