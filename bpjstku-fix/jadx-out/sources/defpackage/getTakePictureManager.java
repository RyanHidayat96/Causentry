package defpackage;

import android.app.Application;
import android.content.Context;
import androidx.exifinterface.media.ExifInterface;
import com.datadog.android.api.InternalLogger;
import defpackage.ImageAnalysisNonBlockingAnalyzer;
import java.io.File;
import java.util.Arrays;
import java.util.Collections;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.OkHttpClient;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000¾\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\r\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0019\u0010\r\u001a\u00020\f2\b\u0010\u0003\u001a\u0004\u0018\u00010\u000fH\u0002¢\u0006\u0004\b\r\u0010\u0010J;\u0010\u0017\u001a\u00020\u00162\b\u0010\u0003\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0005\u001a\u00020\u00122\u0006\u0010\u0007\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\u000b2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001a\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ'\u0010\u001e\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u00122\u0006\u0010\u0005\u001a\u00020\u001c2\u0006\u0010\u0007\u001a\u00020\u001dH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\r\u0010\u001e\u001a\u00020\f¢\u0006\u0004\b\u001e\u0010 J\u0019\u0010\u0017\u001a\u00028\u0000\"\b\b\u0000\u0010!*\u00020\u0004H\u0017¢\u0006\u0004\b\u0017\u0010\"J1\u0010'\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020#2\u0018\u0010\u0005\u001a\u0014\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020\f0$H\u0016¢\u0006\u0004\b'\u0010(R,\u0010\u001a\u001a\u001a\u0012\b\u0012\u0006*\u00020*0**\f\u0012\b\u0012\u0006*\u00020*0*0+0)8\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010,R\u0014\u0010\u001e\u001a\u00020\u00028\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u0016\u0010\u0017\u001a\u00020/8\u0017@\u0017X\u0097\f¢\u0006\u0006\n\u0004\b'\u00100R\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u000202018\u0001X\u0081\u0004¢\u0006\u0006\n\u0004\b\r\u00103R\u0016\u0010'\u001a\u0002048\u0000@\u0000X\u0081\f¢\u0006\u0006\n\u0004\b\u001e\u00105R\u0014\u00109\u001a\u0002068\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b7\u00108R\u0014\u0010<\u001a\u00020\u00068\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b:\u0010;R\u0016\u0010?\u001a\u00020=8\u0000@\u0000X\u0081\f¢\u0006\u0006\n\u0004\b<\u0010>R\u0018\u0010C\u001a\u0004\u0018\u00010@8\u0000@\u0000X\u0081\f¢\u0006\u0006\n\u0004\bA\u0010BR\u0016\u0010A\u001a\u00020\u00168\u0001@\u0000X\u0081\f¢\u0006\u0006\n\u0004\b?\u0010DR\u0016\u00107\u001a\u00020E8\u0000@\u0000X\u0081\f¢\u0006\u0006\n\u0004\b9\u0010FR\u0016\u0010-\u001a\u00020G8\u0001@\u0000X\u0081\f¢\u0006\u0006\n\u0004\bC\u0010HR\u0014\u0010:\u001a\u00020\u00048\u0001X\u0081\u0004¢\u0006\u0006\n\u0004\bI\u0010J"}, d2 = {"LgetTakePictureManager;", "LImageAnalysisAbstractAnalyzerExternalSyntheticLambda1;", "LlambdasubmitStillCaptureRequest4;", "p0", "Ldetach;", "p1", "Lcom/datadog/android/api/InternalLogger;", "p2", "<init>", "(LlambdasubmitStillCaptureRequest4;Ldetach;Lcom/datadog/android/api/InternalLogger;)V", "Landroid/content/Context;", "", "", "TuitionPaymentFragmentbindingInflater1", "(Landroid/content/Context;Ljava/lang/String;)V", "LonOutputSurface;", "(LonOutputSurface;)V", "LgetSupportedEffectTargets;", "LImageAnalysisAbstractAnalyzerExternalSyntheticLambda0;", "p3", "LImageProxyDownsamplerForwardingImageProxyImpl$b;", "p4", "LImageCaptureOnImageSavedCallback;", "b", "(LgetSupportedEffectTargets;LImageAnalysisAbstractAnalyzerExternalSyntheticLambda0;Landroid/content/Context;Ljava/lang/String;LImageProxyDownsamplerForwardingImageProxyImpl$b;)LImageCaptureOnImageSavedCallback;", "", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "(Ljava/lang/Object;)V", "LgetJpegQualityInternal;", "", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "(LImageAnalysisAbstractAnalyzerExternalSyntheticLambda0;LgetJpegQualityInternal;I)V", "()V", ExifInterface.GPS_DIRECTION_TRUE, "()Ldetach;", "", "Lkotlin/Function2;", "LrecalculateTransformMatrixAndCropRect;", "LImageAnalysisNonBlockingAnalyzer;", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "(ZLkotlin/jvm/functions/Function2;)V", "", "LclearCache;", "", "Ljava/util/Set;", "cancel", "LlambdasubmitStillCaptureRequest4;", "LImageAnalysisNonBlockingAnalyzerCacheAnalyzingImageProxyExternalSyntheticLambda1;", "LImageAnalysisNonBlockingAnalyzerCacheAnalyzingImageProxyExternalSyntheticLambda1;", "Ljava/util/concurrent/atomic/AtomicReference;", "LsetRelativeRotation;", "Ljava/util/concurrent/atomic/AtomicReference;", "LImageCaptureOutputFileOptionsBuilder;", "LImageCaptureOutputFileOptionsBuilder;", "Ljava/util/concurrent/atomic/AtomicBoolean;", "notify", "Ljava/util/concurrent/atomic/AtomicBoolean;", "g", "cancelAll", "Lcom/datadog/android/api/InternalLogger;", "asInterface", "LImageCaptureExternalSyntheticLambda5;", "LImageCaptureExternalSyntheticLambda5;", "asBinder", "LImageCaptureExternalSyntheticLambda3;", "a", "LImageCaptureExternalSyntheticLambda3;", "d", "LImageCaptureOnImageSavedCallback;", "LonCameraControlReady;", "LonCameraControlReady;", "LlambdacreatePipeline3androidxcameracoreImageCapture;", "LlambdacreatePipeline3androidxcameracoreImageCapture;", "onTransact", "Ldetach;"}, k = 1, mv = {1, 7, 0}, xi = 48)
public final class getTakePictureManager implements ImageAnalysisAbstractAnalyzerExternalSyntheticLambda1 {
    final AtomicReference<setRelativeRotation> TuitionPaymentFragmentbindingInflater1;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
    ImageAnalysisNonBlockingAnalyzerCacheAnalyzingImageProxyExternalSyntheticLambda1 b;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
    public ImageCaptureOutputFileOptionsBuilder TuitionPaymentFragmentspecialinlinedviewModeldefault1;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public ImageCaptureExternalSyntheticLambda3 d;

    /* JADX INFO: renamed from: asBinder, reason: from kotlin metadata */
    public ImageCaptureOnImageSavedCallback a;

    /* JADX INFO: renamed from: asInterface, reason: from kotlin metadata */
    public ImageCaptureExternalSyntheticLambda5 asBinder;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    final Set<clearCache> TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    /* JADX INFO: renamed from: cancel, reason: from kotlin metadata */
    private final lambdasubmitStillCaptureRequest4 TuitionPaymentFragmentspecialinlinedviewModeldefault2;

    /* JADX INFO: renamed from: cancelAll, reason: from kotlin metadata */
    private final InternalLogger asInterface;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public lambdacreatePipeline3androidxcameracoreImageCapture cancel;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public onCameraControlReady notify;

    /* JADX INFO: renamed from: notify, reason: from kotlin metadata */
    private final AtomicBoolean g;

    /* JADX INFO: renamed from: onTransact, reason: from kotlin metadata */
    public final detach cancelAll;

    public getTakePictureManager(lambdasubmitStillCaptureRequest4 lambdasubmitstillcapturerequest4, detach detachVar, InternalLogger internalLogger) {
        Intrinsics.checkNotNullParameter(lambdasubmitstillcapturerequest4, "");
        Intrinsics.checkNotNullParameter(detachVar, "");
        Intrinsics.checkNotNullParameter(internalLogger, "");
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = lambdasubmitstillcapturerequest4;
        this.cancelAll = detachVar;
        this.asInterface = internalLogger;
        this.b = new getOutputStream();
        this.g = new AtomicBoolean(false);
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = Collections.newSetFromMap(new ConcurrentHashMap());
        this.TuitionPaymentFragmentbindingInflater1 = new AtomicReference<>(null);
        this.a = new setReversedHorizontal();
        this.cancel = new lockFlashMode();
        this.notify = new onStateDetached();
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = new ImageCaptureScreenFlash();
        this.asBinder = new ImageCapture1();
    }

    public final void TuitionPaymentFragmentbindingInflater1(Context p0, String p1) {
        Intrinsics.checkNotNullParameter(p0, "");
        Intrinsics.checkNotNullParameter(p1, "");
        if (this.g.get()) {
            return;
        }
        detach detachVar = this.cancelAll;
        if (detachVar instanceof ImageAnalysisAbstractAnalyzerExternalSyntheticLambda0) {
            getSupportedEffectTargets getsupportedeffecttargets = new getSupportedEffectTargets(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.subscribe, this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getMaxBatchesPerUploadJob());
            lambdatakePicture2androidxcameracoreImageCapture lambdatakepicture2androidxcameracoreimagecapture = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.d;
            if (lambdatakepicture2androidxcameracoreimagecapture == null) {
                lambdatakepicture2androidxcameracoreimagecapture = new lambdatakePicture2androidxcameracoreImageCapture(getsupportedeffecttargets);
            }
            this.a = b(getsupportedeffecttargets, (ImageAnalysisAbstractAnalyzerExternalSyntheticLambda0) this.cancelAll, p0, p1, this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.disconnect);
            this.cancelAll.b(p0);
            TuitionPaymentFragmentspecialinlinedviewModeldefault2((ImageAnalysisAbstractAnalyzerExternalSyntheticLambda0) this.cancelAll, lambdatakepicture2androidxcameracoreimagecapture, getsupportedeffecttargets.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
        } else {
            detachVar.b(p0);
        }
        if (this.cancelAll instanceof isInfoEnabled) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.handleMessage.TuitionPaymentFragmentspecialinlinedviewModeldefault3((isInfoEnabled) this.cancelAll);
        }
        TuitionPaymentFragmentbindingInflater1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.write);
        this.g.set(true);
        this.notify.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
    }

    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        if (this.g.get()) {
            this.cancelAll.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
            if (this.cancelAll instanceof isInfoEnabled) {
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.handleMessage.TuitionPaymentFragmentspecialinlinedviewModeldefault1((isInfoEnabled) this.cancelAll);
            }
            this.notify.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
            this.notify = new onStateDetached();
            this.a = new setReversedHorizontal();
            getOutputStream getoutputstream = new getOutputStream();
            Intrinsics.checkNotNullParameter(getoutputstream, "");
            this.b = getoutputstream;
            this.cancel = new lockFlashMode();
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = new ImageCaptureScreenFlash();
            this.asBinder = new ImageCapture1();
            Context context = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.a.get();
            Application application = context instanceof Application ? (Application) context : null;
            if (application != null) {
                application.unregisterActivityLifecycleCallbacks(this.d);
            }
            this.d = null;
            this.g.set(false);
        }
    }

    @Override // defpackage.ImageAnalysisAbstractAnalyzerExternalSyntheticLambda1
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault1(boolean p0, final Function2<? super recalculateTransformMatrixAndCropRect, ? super ImageAnalysisNonBlockingAnalyzer, Unit> p1) {
        Intrinsics.checkNotNullParameter(p1, "");
        isSessionProcessorEnabledInCurrentCamera issessionprocessorenabledincurrentcamera = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.asInterface;
        if (issessionprocessorenabledincurrentcamera instanceof getOutputFormat) {
            return;
        }
        final recalculateTransformMatrixAndCropRect recalculatetransformmatrixandcroprectTuitionPaymentFragmentspecialinlinedviewModeldefault2 = issessionprocessorenabledincurrentcamera.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        this.a.TuitionPaymentFragmentspecialinlinedviewModeldefault2(recalculatetransformmatrixandcroprectTuitionPaymentFragmentspecialinlinedviewModeldefault2, false, new Function1<ImageAnalysisNonBlockingAnalyzer, Unit>() { // from class: com.datadog.android.core.internal.SdkFeature$withWriteContext$1
            public final void b(ImageAnalysisNonBlockingAnalyzer imageAnalysisNonBlockingAnalyzer) {
                Intrinsics.checkNotNullParameter(imageAnalysisNonBlockingAnalyzer, "");
                p1.invoke(recalculatetransformmatrixandcroprectTuitionPaymentFragmentspecialinlinedviewModeldefault2, imageAnalysisNonBlockingAnalyzer);
            }

            @Override // kotlin.jvm.functions.Function1
            public final /* synthetic */ Unit invoke(ImageAnalysisNonBlockingAnalyzer imageAnalysisNonBlockingAnalyzer) {
                b(imageAnalysisNonBlockingAnalyzer);
                return Unit.INSTANCE;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }
        });
    }

    @Override // defpackage.ImageAnalysisAbstractAnalyzerExternalSyntheticLambda1
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault3(Object p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        setRelativeRotation setrelativerotation = this.TuitionPaymentFragmentbindingInflater1.get();
        if (setrelativerotation != null) {
            setrelativerotation.TuitionPaymentFragmentspecialinlinedviewModeldefault3(p0);
        } else {
            this.asInterface.TuitionPaymentFragmentspecialinlinedviewModeldefault3(InternalLogger.Level.INFO, InternalLogger.Target.USER, new Function0<String>() { // from class: com.datadog.android.core.internal.SdkFeature$sendEvent$1
                @Override // kotlin.jvm.functions.Function0
                /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                public final String invoke() {
                    String str = String.format(Locale.US, "Feature \"%s\" has no event receiver registered, ignoring event.", Arrays.copyOf(new Object[]{this.this$0.cancelAll.getINotificationSideChannelDefault()}, 1));
                    Intrinsics.checkNotNullExpressionValue(str, "");
                    return str;
                }

                {
                    super(0);
                }
            }, null, false, null);
        }
    }

    @Override // defpackage.ImageAnalysisAbstractAnalyzerExternalSyntheticLambda1
    public final <T extends detach> T b() {
        T t = (T) this.cancelAll;
        Intrinsics.checkNotNull(t, "");
        return t;
    }

    private final void TuitionPaymentFragmentspecialinlinedviewModeldefault2(ImageAnalysisAbstractAnalyzerExternalSyntheticLambda0 p0, getJpegQualityInternal p1, int p2) {
        onStateDetached onstatedetached;
        convertYuvToJpegBytesIntoSurface convertyuvtojpegbytesintosurface;
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor;
        if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.INotificationSideChannelDefault) {
            ImageAnalysisBlockingAnalyzer1 imageAnalysisBlockingAnalyzer1TuitionPaymentFragmentspecialinlinedviewModeldefault1 = p0.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
            InternalLogger internalLogger = this.asInterface;
            OkHttpClient okHttpClient = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.connect;
            if (okHttpClient == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                okHttpClient = null;
            }
            OkHttpClient okHttpClient2 = okHttpClient;
            String str = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getServiceComponent;
            convertYuvToJpegBytesIntoSurface convertyuvtojpegbytesintosurface2 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            if (convertyuvtojpegbytesintosurface2 != null) {
                convertyuvtojpegbytesintosurface = convertyuvtojpegbytesintosurface2;
            } else {
                Intrinsics.throwUninitializedPropertyAccessException("");
                convertyuvtojpegbytesintosurface = null;
            }
            this.cancel = new isPostviewEnabled(imageAnalysisBlockingAnalyzer1TuitionPaymentFragmentspecialinlinedviewModeldefault1, internalLogger, okHttpClient2, str, convertyuvtojpegbytesintosurface);
            String strTuitionPaymentFragmentbindingInflater1 = p0.getINotificationSideChannelDefault();
            ImageCaptureOnImageSavedCallback imageCaptureOnImageSavedCallback = this.a;
            lambdacreatePipeline3androidxcameracoreImageCapture lambdacreatepipeline3androidxcameracoreimagecapture = this.cancel;
            isSessionProcessorEnabledInCurrentCamera issessionprocessorenabledincurrentcamera = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.asInterface;
            setFlashType setflashtype = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.read;
            lambdarotateYUV1 lambdarotateyuv1 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.unsubscribe;
            ScheduledThreadPoolExecutor scheduledThreadPoolExecutor2 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.setCallbacksMessenger;
            if (scheduledThreadPoolExecutor2 != null) {
                scheduledThreadPoolExecutor = scheduledThreadPoolExecutor2;
            } else {
                Intrinsics.throwUninitializedPropertyAccessException("");
                scheduledThreadPoolExecutor = null;
            }
            onstatedetached = new lambdatakePicture1androidxcameracoreImageCapture(strTuitionPaymentFragmentbindingInflater1, imageCaptureOnImageSavedCallback, lambdacreatepipeline3androidxcameracoreimagecapture, issessionprocessorenabledincurrentcamera, setflashtype, lambdarotateyuv1, p1, p2, scheduledThreadPoolExecutor, this.asInterface);
        } else {
            onstatedetached = new onStateDetached();
        }
        this.notify = onstatedetached;
    }

    private final ImageCaptureOnImageSavedCallback b(getSupportedEffectTargets p0, ImageAnalysisAbstractAnalyzerExternalSyntheticLambda0 p1, Context p2, String p3, ImageProxyDownsamplerForwardingImageProxyImpl.b p4) {
        File file;
        analyzeCachedImage connect = p1.getConnect();
        ImageReaderProxys imageReaderProxys = null;
        if (p4 == null) {
            getSaveCollection getsavecollectionB = getSaveCollection.b(new getSaveCollection(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.asBinder.getWindowDurationMs(), 0L, 0L, 0, 0L, 0L, 0L, 126, null), this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.asBinder.getWindowDurationMs(), connect.b, connect.TuitionPaymentFragmentbindingInflater1, connect.TuitionPaymentFragmentspecialinlinedviewModeldefault1, connect.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
            setBufferFormat setbufferformat = new setBufferFormat(this.cancelAll.getINotificationSideChannelDefault(), p0, getsavecollectionB, this.asInterface, this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.MediaBrowserCompatCallbackHandler, null, 32, null);
            if (p2 instanceof Application) {
                ImageCaptureExternalSyntheticLambda3 imageCaptureExternalSyntheticLambda3 = new ImageCaptureExternalSyntheticLambda3(setbufferformat);
                this.d = imageCaptureExternalSyntheticLambda3;
                ((Application) p2).registerActivityLifecycleCallbacks(imageCaptureExternalSyntheticLambda3);
            }
            this.asBinder = setbufferformat;
            String strTuitionPaymentFragmentbindingInflater1 = p1.getINotificationSideChannelDefault();
            convertYUVToRGBInternal convertyuvtorgbinternal = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.handleMessage;
            File file2 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.isConnected;
            if (file2 != null) {
                file = file2;
            } else {
                Intrinsics.throwUninitializedPropertyAccessException("");
                file = null;
            }
            ImageReaderProxys imageReaderProxys2 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getNotifyChildrenChangedOptions;
            if (imageReaderProxys2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                imageReaderProxys2 = null;
            }
            getTakePictureRequest gettakepicturerequest = new getTakePictureRequest(convertyuvtorgbinternal, file, strTuitionPaymentFragmentbindingInflater1, imageReaderProxys2, getsavecollectionB, this.asInterface, this.asBinder);
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = gettakepicturerequest;
            ImageReaderProxys imageReaderProxys3 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getNotifyChildrenChangedOptions;
            if (imageReaderProxys3 != null) {
                imageReaderProxys = imageReaderProxys3;
            } else {
                Intrinsics.throwUninitializedPropertyAccessException("");
            }
            ImageReaderProxys imageReaderProxys4 = imageReaderProxys;
            ImageCaptureOutputFileOptionsBuilder imageCaptureOutputFileOptionsBuilder = gettakepicturerequest.TuitionPaymentFragmentbindingInflater1;
            ImageCaptureOutputFileOptionsBuilder imageCaptureOutputFileOptionsBuilder2 = gettakepicturerequest.d;
            ImageInfo.Companion companion = ImageInfo.INSTANCE;
            ImageInfo imageInfoB = ImageInfo.Companion.b(this.asInterface, this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.write);
            getImageCaptureError.Companion companion2 = getImageCaptureError.INSTANCE;
            return new ImageCaptureImageCaptureError(imageReaderProxys4, imageCaptureOutputFileOptionsBuilder, imageCaptureOutputFileOptionsBuilder2, imageInfoB, getImageCaptureError.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.asInterface, this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.write), new getSavedUri(this.asInterface), this.asInterface, getsavecollectionB, this.asBinder);
        }
        String strTuitionPaymentFragmentbindingInflater2 = p1.getINotificationSideChannelDefault();
        ImageReaderProxys imageReaderProxys5 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getNotifyChildrenChangedOptions;
        if (imageReaderProxys5 != null) {
            imageReaderProxys = imageReaderProxys5;
        } else {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        return new ImageCaptureFlashMode(p3, strTuitionPaymentFragmentbindingInflater2, p4, imageReaderProxys, this.asInterface, connect, this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.handleMessage);
    }

    private final void TuitionPaymentFragmentbindingInflater1(onOutputSurface p0) {
        File file;
        getImageCaptureError.Companion companion = getImageCaptureError.INSTANCE;
        getImageCaptureError getimagecaptureerrorTuitionPaymentFragmentspecialinlinedviewModeldefault3 = getImageCaptureError.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.asInterface, p0);
        getFile getfile = new getFile(this.asInterface);
        String iNotificationSideChannelDefault = this.cancelAll.getINotificationSideChannelDefault();
        File file2 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.isConnected;
        ImageReaderProxys imageReaderProxys = null;
        if (file2 != null) {
            file = file2;
        } else {
            Intrinsics.throwUninitializedPropertyAccessException("");
            file = null;
        }
        getContentValues getcontentvalues = new getContentValues(getfile, iNotificationSideChannelDefault, file, this.asInterface, new convertYUVToRGB(this.asInterface, getimagecaptureerrorTuitionPaymentFragmentspecialinlinedviewModeldefault3));
        getContentResolver getcontentresolver = new getContentResolver(getfile, iNotificationSideChannelDefault, file, this.asInterface, getimagecaptureerrorTuitionPaymentFragmentspecialinlinedviewModeldefault3);
        ImageReaderProxys imageReaderProxys2 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getNotifyChildrenChangedOptions;
        if (imageReaderProxys2 != null) {
            imageReaderProxys = imageReaderProxys2;
        } else {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        ImageCaptureOnImageCapturedCallback imageCaptureOnImageCapturedCallback = new ImageCaptureOnImageCapturedCallback(imageReaderProxys, this.asInterface, getcontentvalues, getcontentresolver);
        Intrinsics.checkNotNullParameter(imageCaptureOnImageCapturedCallback, "");
        this.b = imageCaptureOnImageCapturedCallback;
    }
}
