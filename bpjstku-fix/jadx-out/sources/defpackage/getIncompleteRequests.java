package defpackage;

import android.content.Context;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes3.dex */
final class getIncompleteRequests {

    static final class TuitionPaymentFragmentspecialinlinedviewModeldefault3 implements decrementRetryCounter.TuitionPaymentFragmentbindingInflater1 {
        private Context TuitionPaymentFragmentspecialinlinedviewModeldefault2;

        private TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        }

        /* synthetic */ TuitionPaymentFragmentspecialinlinedviewModeldefault3(byte b) {
            this();
        }

        @Override // decrementRetryCounter.TuitionPaymentFragmentbindingInflater1
        public final decrementRetryCounter TuitionPaymentFragmentbindingInflater1() {
            Context context = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            if (context != null) {
                return new TuitionPaymentFragmentbindingInflater1(context, (byte) 0);
            }
            StringBuilder sb = new StringBuilder();
            sb.append(Context.class.getCanonicalName());
            sb.append(" must be set");
            throw new IllegalStateException(sb.toString());
        }

        @Override // decrementRetryCounter.TuitionPaymentFragmentbindingInflater1
        public final /* synthetic */ decrementRetryCounter.TuitionPaymentFragmentbindingInflater1 TuitionPaymentFragmentspecialinlinedviewModeldefault2(Context context) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = context;
            return this;
        }
    }

    static final class TuitionPaymentFragmentbindingInflater1 extends decrementRetryCounter {
        private ExtraSupportedResolutionQuirk<model> TuitionPaymentFragmentbindingInflater1;
        private ExtraSupportedResolutionQuirk<Executor> TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        private ExtraSupportedResolutionQuirk<SchedulerConfig> TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        private ExtraSupportedResolutionQuirk TuitionPaymentFragmentspecialinlinedviewModeldefault3;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private ExtraSupportedResolutionQuirk<Context> f944a;
        private ExtraSupportedResolutionQuirk<String> asBinder;
        private ExtraSupportedResolutionQuirk asInterface;
        private ExtraSupportedResolutionQuirk b;
        private ExtraSupportedResolutionQuirk<getHdrFormat> cancel;
        private ExtraSupportedResolutionQuirk<getExpectedFrameRateRange> cancelAll;
        private ExtraSupportedResolutionQuirk<getConfigType> d;
        private final TuitionPaymentFragmentbindingInflater1 g;
        private ExtraSupportedResolutionQuirk<getSharedSurfaces> notify;
        private ExtraSupportedResolutionQuirk<TakePictureManager1> onTransact;

        /* synthetic */ TuitionPaymentFragmentbindingInflater1(Context context, byte b) {
            this(context);
        }

        private TuitionPaymentFragmentbindingInflater1(Context context) {
            this.g = this;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = new TakePictureRequestRetryControl(lambdatrackCurrentRequests0androidxcameracoreimagecaptureTakePictureManager.TuitionPaymentFragmentspecialinlinedviewModeldefault3.b);
            if (context != null) {
                AttachedSurfaceInfo attachedSurfaceInfo = new AttachedSurfaceInfo(context);
                this.f944a = attachedSurfaceInfo;
                TakePictureRequestExternalSyntheticLambda1 takePictureRequestExternalSyntheticLambda1 = new TakePictureRequestExternalSyntheticLambda1(attachedSurfaceInfo, CameraConfigsDefaultCameraConfig.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault1, CameraConfigProvider.TuitionPaymentFragmentspecialinlinedviewModeldefault1.b);
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = takePictureRequestExternalSyntheticLambda1;
                this.b = new TakePictureRequestRetryControl(new getImplementationOptions(this.f944a, takePictureRequestExternalSyntheticLambda1));
                this.asInterface = new CameraControlInternal(this.f944a, toBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault2, getConfigSize.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
                this.asBinder = new TakePictureRequestRetryControl(new AutoValue_StreamSpecBuilder(this.f944a));
                this.d = new TakePictureRequestRetryControl(new getUseCaseConfigFactory(CameraConfigsDefaultCameraConfig.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault1, CameraConfigProvider.TuitionPaymentFragmentspecialinlinedviewModeldefault1.b, setImplementationOptions.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault2, this.asInterface, this.asBinder));
                getChannels getchannels = new getChannels(CameraConfigsDefaultCameraConfig.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = getchannels;
                getBitrate getbitrate = new getBitrate(this.f944a, this.d, getchannels, CameraConfigProvider.TuitionPaymentFragmentspecialinlinedviewModeldefault1.b);
                this.cancelAll = getbitrate;
                ExtraSupportedResolutionQuirk<Executor> extraSupportedResolutionQuirk = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                ExtraSupportedResolutionQuirk extraSupportedResolutionQuirk2 = this.b;
                ExtraSupportedResolutionQuirk<getConfigType> extraSupportedResolutionQuirk3 = this.d;
                this.TuitionPaymentFragmentbindingInflater1 = new getCodec(extraSupportedResolutionQuirk, extraSupportedResolutionQuirk2, getbitrate, extraSupportedResolutionQuirk3, extraSupportedResolutionQuirk3);
                ExtraSupportedResolutionQuirk<Context> extraSupportedResolutionQuirk4 = this.f944a;
                ExtraSupportedResolutionQuirk extraSupportedResolutionQuirk5 = this.b;
                ExtraSupportedResolutionQuirk<getConfigType> extraSupportedResolutionQuirk6 = this.d;
                this.cancel = new AutoValue_SessionConfig_OutputConfigBuilder(extraSupportedResolutionQuirk4, extraSupportedResolutionQuirk5, extraSupportedResolutionQuirk6, this.cancelAll, this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, extraSupportedResolutionQuirk6, CameraConfigsDefaultCameraConfig.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault1, CameraConfigProvider.TuitionPaymentFragmentspecialinlinedviewModeldefault1.b, this.d);
                ExtraSupportedResolutionQuirk<Executor> extraSupportedResolutionQuirk7 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                ExtraSupportedResolutionQuirk<getConfigType> extraSupportedResolutionQuirk8 = this.d;
                this.notify = new AutoValue_StateObservable_ErrorWrapper(extraSupportedResolutionQuirk7, extraSupportedResolutionQuirk8, this.cancelAll, extraSupportedResolutionQuirk8);
                this.onTransact = new TakePictureRequestRetryControl(new getRemainingRetries(CameraConfigsDefaultCameraConfig.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault1, CameraConfigProvider.TuitionPaymentFragmentspecialinlinedviewModeldefault1.b, this.TuitionPaymentFragmentbindingInflater1, this.cancel, this.notify));
                return;
            }
            throw new NullPointerException("instance cannot be null");
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // defpackage.decrementRetryCounter
        public final TakePictureManager1 TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
            return this.onTransact.get();
        }

        @Override // defpackage.decrementRetryCounter
        final AutoValue_StreamSpec1 TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
            return this.d.get();
        }
    }
}
