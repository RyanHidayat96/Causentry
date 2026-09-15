package defpackage;

import com.datadog.android.DatadogSite;
import com.datadog.android.api.context.DeviceType;
import com.datadog.android.api.context.NetworkInfo;
import com.datadog.android.privacy.TrackingConsent;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class setScreenFlashToCameraControl implements isSessionProcessorEnabledInCurrentCamera {
    private final lambdasubmitStillCaptureRequest4 TuitionPaymentFragmentspecialinlinedviewModeldefault1;

    public setScreenFlashToCameraControl(lambdasubmitStillCaptureRequest4 lambdasubmitstillcapturerequest4) {
        Intrinsics.checkNotNullParameter(lambdasubmitstillcapturerequest4, "");
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = lambdasubmitstillcapturerequest4;
    }

    @Override // defpackage.isSessionProcessorEnabledInCurrentCamera
    public final recalculateTransformMatrixAndCropRect TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        DatadogSite datadogSite = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.com.google.firebase.analytics.FirebaseAnalytics.Event.SEARCH java.lang.String;
        String str = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.g;
        String str2 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.sendCustomAction;
        String str3 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.INotificationSideChannel;
        String strB = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getRoot.b();
        String str4 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.onConnected;
        String str5 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getServiceComponent;
        String str6 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getSessionToken;
        getInputImage getinputimage = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.MediaBrowserCompatCallbackHandler;
        long jTuitionPaymentFragmentspecialinlinedviewModeldefault1 = getinputimage.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        long jB = getinputimage.b();
        long nanos = TimeUnit.MILLISECONDS.toNanos(jTuitionPaymentFragmentspecialinlinedviewModeldefault1);
        long nanos2 = TimeUnit.MILLISECONDS.toNanos(jB);
        long j = jB - jTuitionPaymentFragmentspecialinlinedviewModeldefault1;
        onValidImageAvailable onvalidimageavailable = new onValidImageAvailable(nanos, nanos2, TimeUnit.MILLISECONDS.toNanos(j), j);
        lambdaanalyzeImage0androidxcameracoreImageAnalysisAbstractAnalyzer lambdaanalyzeimage0androidxcameracoreimageanalysisabstractanalyzer = new lambdaanalyzeImage0androidxcameracoreImageAnalysisAbstractAnalyzer(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.INotificationSideChannelDefault);
        NetworkInfo tuitionPaymentFragmentspecialinlinedviewModeldefault2 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.read.getTuitionPaymentFragmentspecialinlinedviewModeldefault2();
        convertYuvToJpegBytesIntoSurface convertyuvtojpegbytesintosurface = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        if (convertyuvtojpegbytesintosurface == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            convertyuvtojpegbytesintosurface = null;
        }
        String strTuitionPaymentFragmentspecialinlinedviewModeldefault1 = convertyuvtojpegbytesintosurface.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        String strB2 = convertyuvtojpegbytesintosurface.b();
        DeviceType deviceTypeG = convertyuvtojpegbytesintosurface.g();
        acquireImage acquireimage = new acquireImage(strTuitionPaymentFragmentspecialinlinedviewModeldefault1, strB2, convertyuvtojpegbytesintosurface.TuitionPaymentFragmentbindingInflater1(), deviceTypeG, convertyuvtojpegbytesintosurface.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), convertyuvtojpegbytesintosurface.asBinder(), convertyuvtojpegbytesintosurface.a(), convertyuvtojpegbytesintosurface.d(), convertyuvtojpegbytesintosurface.TuitionPaymentFragmentspecialinlinedviewModeldefault2());
        lambdaanalyzeImage1androidxcameracoreImageAnalysisAbstractAnalyzer lambdaanalyzeimage1androidxcameracoreimageanalysisabstractanalyzerTuitionPaymentFragmentspecialinlinedviewModeldefault3 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.MediaBrowserCompatConnectionCallback.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        TrackingConsent trackingConsentTuitionPaymentFragmentspecialinlinedviewModeldefault3 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.handleMessage.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        String str7 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Iterator<Map.Entry<String, Map<String, Object>>> it = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.notify.entrySet().iterator(); it.hasNext(); it = it) {
            Map.Entry<String, Map<String, Object>> next = it.next();
            linkedHashMap.put(next.getKey(), MapsKt.toMap(next.getValue()));
        }
        return new recalculateTransformMatrixAndCropRect(datadogSite, str, str2, str3, strB, str4, str6, str5, onvalidimageavailable, lambdaanalyzeimage0androidxcameracoreimageanalysisabstractanalyzer, tuitionPaymentFragmentspecialinlinedviewModeldefault2, acquireimage, lambdaanalyzeimage1androidxcameracoreimageanalysisabstractanalyzerTuitionPaymentFragmentspecialinlinedviewModeldefault3, trackingConsentTuitionPaymentFragmentspecialinlinedviewModeldefault3, str7, linkedHashMap);
    }

    @Override // defpackage.isSessionProcessorEnabledInCurrentCamera
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault1(String str, Map<String, ? extends Object> map) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(map, "");
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.notify.put(str, map);
    }

    @Override // defpackage.isSessionProcessorEnabledInCurrentCamera
    public final Map<String, Object> b(String str) {
        Map<String, Object> map;
        Intrinsics.checkNotNullParameter(str, "");
        Map<String, Object> map2 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.notify.get(str);
        return (map2 == null || (map = MapsKt.toMap(map2)) == null) ? MapsKt.emptyMap() : map;
    }
}
