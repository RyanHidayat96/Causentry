package defpackage;

import android.content.Context;
import com.google.android.datatransport.runtime.backends.BackendResponse;
import com.google.android.datatransport.runtime.firebase.transport.LogEventDropped;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes3.dex */
public final class getHdrFormat {
    final getZslDisabled TuitionPaymentFragmentbindingInflater1;
    final Context TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    final AutoValue_StreamSpec1 TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    final CameraConfigs TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final CameraConfigProviderExternalSyntheticLambda0 f939a;
    private final CameraConfigs asBinder;
    public final Executor b;
    final getExpectedFrameRateRange d;
    private final lambdaonResult1androidxcameracoreimagecaptureTakePictureRequest g;

    @isSamsungJ6
    public getHdrFormat(Context context, lambdaonResult1androidxcameracoreimagecaptureTakePictureRequest lambdaonresult1androidxcameracoreimagecapturetakepicturerequest, AutoValue_StreamSpec1 autoValue_StreamSpec1, getExpectedFrameRateRange getexpectedframeraterange, Executor executor, CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0, CameraConfigs cameraConfigs, CameraConfigs cameraConfigs2, getZslDisabled getzsldisabled) {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = context;
        this.g = lambdaonresult1androidxcameracoreimagecapturetakepicturerequest;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = autoValue_StreamSpec1;
        this.d = getexpectedframeraterange;
        this.b = executor;
        this.f939a = cameraConfigProviderExternalSyntheticLambda0;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = cameraConfigs;
        this.asBinder = cameraConfigs2;
        this.TuitionPaymentFragmentbindingInflater1 = getzsldisabled;
    }

    public final BackendResponse TuitionPaymentFragmentspecialinlinedviewModeldefault2(final retryRequest retryrequest, int i) {
        TakePictureRequestExternalSyntheticLambda4 takePictureRequestExternalSyntheticLambda4TuitionPaymentFragmentbindingInflater1 = this.g.TuitionPaymentFragmentbindingInflater1(retryrequest.TuitionPaymentFragmentspecialinlinedviewModeldefault2());
        BackendResponse incrementretrycounter = new incrementRetryCounter(BackendResponse.Status.OK, 0L);
        final long j = 0;
        while (((Boolean) this.f939a.TuitionPaymentFragmentspecialinlinedviewModeldefault2(new CameraConfigProviderExternalSyntheticLambda0.TuitionPaymentFragmentbindingInflater1() { // from class: AutoValue_OutputSurfaceConfiguration
            @Override // CameraConfigProviderExternalSyntheticLambda0.TuitionPaymentFragmentbindingInflater1
            public final Object b() {
                getHdrFormat gethdrformat = this.TuitionPaymentFragmentbindingInflater1;
                return Boolean.valueOf(gethdrformat.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault3(retryrequest));
            }
        })).booleanValue()) {
            final Iterable iterable = (Iterable) this.f939a.TuitionPaymentFragmentspecialinlinedviewModeldefault2(new CameraConfigProviderExternalSyntheticLambda0.TuitionPaymentFragmentbindingInflater1() { // from class: getImageAnalysisOutputSurface
                @Override // CameraConfigProviderExternalSyntheticLambda0.TuitionPaymentFragmentbindingInflater1
                public final Object b() {
                    getHdrFormat gethdrformat = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                    return gethdrformat.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault1(retryrequest);
                }
            });
            if (!iterable.iterator().hasNext()) {
                return incrementretrycounter;
            }
            if (takePictureRequestExternalSyntheticLambda4TuitionPaymentFragmentbindingInflater1 == null) {
                sdkVersion.TuitionPaymentFragmentbindingInflater1("Uploader", retryrequest);
                incrementretrycounter = new incrementRetryCounter(BackendResponse.Status.FATAL_ERROR, -1L);
            } else {
                ArrayList arrayList = new ArrayList();
                Iterator it = iterable.iterator();
                while (it.hasNext()) {
                    arrayList.add(((AutoValue_SurfaceSizeDefinition) it.next()).b());
                }
                if (retryrequest.TuitionPaymentFragmentspecialinlinedviewModeldefault1() != null) {
                    CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0 = this.f939a;
                    final getZslDisabled getzsldisabled = this.TuitionPaymentFragmentbindingInflater1;
                    Objects.requireNonNull(getzsldisabled);
                    AutoValue_Config_Option autoValue_Config_Option = (AutoValue_Config_Option) cameraConfigProviderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2(new CameraConfigProviderExternalSyntheticLambda0.TuitionPaymentFragmentbindingInflater1() { // from class: getPostviewOutputSurface
                        @Override // CameraConfigProviderExternalSyntheticLambda0.TuitionPaymentFragmentbindingInflater1
                        public final Object b() {
                            return getzsldisabled.TuitionPaymentFragmentbindingInflater1();
                        }
                    });
                    abortRequests.TuitionPaymentFragmentbindingInflater1 tuitionPaymentFragmentbindingInflater1 = new abortRequests.TuitionPaymentFragmentbindingInflater1();
                    tuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = new HashMap();
                    arrayList.add(takePictureRequestExternalSyntheticLambda4TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1(tuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentbindingInflater1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault1()).TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.asBinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1()).TuitionPaymentFragmentbindingInflater1("GDT_CLIENT_METRICS").b(new issueNextRequest(new ProcessingNodeExternalSyntheticLambda7("proto"), offerRequest.TuitionPaymentFragmentspecialinlinedviewModeldefault1.encode(autoValue_Config_Option))).b()));
                }
                incrementretrycounter = takePictureRequestExternalSyntheticLambda4TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault3(new lambdaonCaptureProcessProgressed3androidxcameracoreimagecaptureTakePictureRequest.TuitionPaymentFragmentspecialinlinedviewModeldefault1().b(arrayList).b(retryrequest.TuitionPaymentFragmentspecialinlinedviewModeldefault1()).TuitionPaymentFragmentspecialinlinedviewModeldefault3());
            }
            if (incrementretrycounter.TuitionPaymentFragmentbindingInflater1() == BackendResponse.Status.TRANSIENT_ERROR) {
                this.f939a.TuitionPaymentFragmentspecialinlinedviewModeldefault2(new CameraConfigProviderExternalSyntheticLambda0.TuitionPaymentFragmentbindingInflater1() { // from class: getImageCaptureOutputSurface
                    @Override // CameraConfigProviderExternalSyntheticLambda0.TuitionPaymentFragmentbindingInflater1
                    public final Object b() {
                        getHdrFormat gethdrformat = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                        Iterable<AutoValue_SurfaceSizeDefinition> iterable2 = iterable;
                        retryRequest retryrequest2 = retryrequest;
                        long j2 = j;
                        gethdrformat.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentbindingInflater1(iterable2);
                        gethdrformat.TuitionPaymentFragmentspecialinlinedviewModeldefault2.b(retryrequest2, gethdrformat.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault1() + j2);
                        return null;
                    }
                });
                this.d.TuitionPaymentFragmentspecialinlinedviewModeldefault2(retryrequest, i + 1, true);
                return incrementretrycounter;
            }
            this.f939a.TuitionPaymentFragmentspecialinlinedviewModeldefault2(new CameraConfigProviderExternalSyntheticLambda0.TuitionPaymentFragmentbindingInflater1() { // from class: AutoValue_SessionConfig_OutputConfig1
                @Override // CameraConfigProviderExternalSyntheticLambda0.TuitionPaymentFragmentbindingInflater1
                public final Object b() {
                    getHdrFormat gethdrformat = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                    gethdrformat.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault1(iterable);
                    return null;
                }
            });
            if (incrementretrycounter.TuitionPaymentFragmentbindingInflater1() == BackendResponse.Status.OK) {
                long jMax = Math.max(j, incrementretrycounter.TuitionPaymentFragmentspecialinlinedviewModeldefault2());
                if (retryrequest.TuitionPaymentFragmentspecialinlinedviewModeldefault1() != null) {
                    this.f939a.TuitionPaymentFragmentspecialinlinedviewModeldefault2(new CameraConfigProviderExternalSyntheticLambda0.TuitionPaymentFragmentbindingInflater1() { // from class: getPreviewOutputSurface
                        @Override // CameraConfigProviderExternalSyntheticLambda0.TuitionPaymentFragmentbindingInflater1
                        public final Object b() {
                            this.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                            return null;
                        }
                    });
                }
                j = jMax;
            } else if (incrementretrycounter.TuitionPaymentFragmentbindingInflater1() == BackendResponse.Status.INVALID_PAYLOAD) {
                final HashMap map = new HashMap();
                Iterator it2 = iterable.iterator();
                while (it2.hasNext()) {
                    String strA = ((AutoValue_SurfaceSizeDefinition) it2.next()).b().a();
                    if (!map.containsKey(strA)) {
                        map.put(strA, 1);
                    } else {
                        map.put(strA, Integer.valueOf(((Integer) map.get(strA)).intValue() + 1));
                    }
                }
                this.f939a.TuitionPaymentFragmentspecialinlinedviewModeldefault2(new CameraConfigProviderExternalSyntheticLambda0.TuitionPaymentFragmentbindingInflater1() { // from class: AutoValue_EncoderProfilesProxy_VideoProfileProxy
                    @Override // CameraConfigProviderExternalSyntheticLambda0.TuitionPaymentFragmentbindingInflater1
                    public final Object b() {
                        getHdrFormat gethdrformat = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                        for (Map.Entry entry : map.entrySet()) {
                            gethdrformat.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentbindingInflater1(((Integer) entry.getValue()).intValue(), LogEventDropped.Reason.INVALID_PAYLOD, (String) entry.getKey());
                        }
                        return null;
                    }
                });
            }
        }
        this.f939a.TuitionPaymentFragmentspecialinlinedviewModeldefault2(new CameraConfigProviderExternalSyntheticLambda0.TuitionPaymentFragmentbindingInflater1() { // from class: AutoValue_Identifier
            @Override // CameraConfigProviderExternalSyntheticLambda0.TuitionPaymentFragmentbindingInflater1
            public final Object b() {
                getHdrFormat gethdrformat = this.TuitionPaymentFragmentbindingInflater1;
                gethdrformat.TuitionPaymentFragmentspecialinlinedviewModeldefault2.b(retryrequest, gethdrformat.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault1() + j);
                return null;
            }
        });
        return incrementretrycounter;
    }
}
