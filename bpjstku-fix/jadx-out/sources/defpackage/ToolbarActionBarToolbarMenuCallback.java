package defpackage;

import android.app.Activity;
import com.bpjstku.di.ApiModuleKt;
import id.vida.liveness.VIDAException;
import id.vida.liveness.VidaLiveness;
import id.vida.liveness.config.VidaFaceDetectionOption;
import id.vida.liveness.config.VidaUICustomizationOption;
import id.vida.liveness.constants.Gestures;
import id.vida.liveness.dto.VidaLivenessRequest;
import id.vida.liveness.dto.VidaLivenessResponse;
import id.vida.liveness.listeners.VidaLivenessListener;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.Locale;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class ToolbarActionBarToolbarMenuCallback {
    VidaLiveness TuitionPaymentFragmentspecialinlinedviewModeldefault1;

    public final VideoRecordEventStart<TwilightManager> TuitionPaymentFragmentbindingInflater1(final Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "");
        VideoRecordEventStart<TwilightManager> videoRecordEventStartDoFinally = VideoRecordEventStart.create(new getVideoOutput() { // from class: onMenuItemClick
            @Override // defpackage.getVideoOutput
            public final void subscribe(getDefaultAudioProfile getdefaultaudioprofile) {
                Activity activity2 = activity;
                ToolbarActionBarToolbarMenuCallback toolbarActionBarToolbarMenuCallback = this;
                Intrinsics.checkNotNullParameter(getdefaultaudioprofile, "");
                VidaLivenessRequest vidaLivenessRequest = new VidaLivenessRequest();
                vidaLivenessRequest.setApiKey(ApiModuleKt.getApikeyVida());
                vidaLivenessRequest.setLicenseKey(ApiModuleKt.getLicenseVida());
                try {
                    VidaLiveness vidaLivenessBuild = VidaLiveness.VidaLivenessBuilder.newInstance(new WeakReference(activity2), vidaLivenessRequest, new ToolbarActionBarToolbarMenuCallback.TuitionPaymentFragmentspecialinlinedviewModeldefault1(getdefaultaudioprofile, toolbarActionBarToolbarMenuCallback)).setDetectionOptions(VidaFaceDetectionOption.VidaFaceDetectionOptionBuilder.newInstance().setEnableActiveLiveness(true).setAllowedGestures(SetsKt.hashSetOf(Gestures.BLINK, Gestures.SMILE, Gestures.SHAKE_HEAD)).build()).setUICustomizationOptions(VidaUICustomizationOption.VidaUICustomizationOptionBuilder.newInstance().setCameraOverlayStrokeWidth(6).setMaxRetryAttempt(3).setLocal(new Locale("in", "ID")).setShowTutorialScreen(false).setShowReviewScreen(false).build()).build();
                    toolbarActionBarToolbarMenuCallback.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = vidaLivenessBuild;
                    if (vidaLivenessBuild != null) {
                        vidaLivenessBuild.initialize();
                    }
                } catch (VIDAException e2) {
                    if (getdefaultaudioprofile.isDisposed()) {
                        return;
                    }
                    getdefaultaudioprofile.TuitionPaymentFragmentbindingInflater1((Throwable) e2);
                }
            }
        }).doFinally(new formatInterval() { // from class: ToolbarActionBarMenuBuilderCallback
            @Override // defpackage.formatInterval
            public final void run() {
                VidaLiveness vidaLiveness = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                if (vidaLiveness != null) {
                    vidaLiveness.release();
                }
            }
        });
        Intrinsics.checkNotNullExpressionValue(videoRecordEventStartDoFinally, "");
        return videoRecordEventStartDoFinally;
    }

    public static final class TuitionPaymentFragmentspecialinlinedviewModeldefault1 implements VidaLivenessListener {
        private /* synthetic */ ToolbarActionBarToolbarMenuCallback TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        private /* synthetic */ getDefaultAudioProfile<TwilightManager> TuitionPaymentFragmentspecialinlinedviewModeldefault3;

        TuitionPaymentFragmentspecialinlinedviewModeldefault1(getDefaultAudioProfile<TwilightManager> getdefaultaudioprofile, ToolbarActionBarToolbarMenuCallback toolbarActionBarToolbarMenuCallback) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = getdefaultaudioprofile;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = toolbarActionBarToolbarMenuCallback;
        }

        @Override // id.vida.liveness.listeners.VidaLivenessListener
        public final void onSuccess(VidaLivenessResponse vidaLivenessResponse) {
            List listEmptyList;
            Intrinsics.checkNotNullParameter(vidaLivenessResponse, "");
            if (!this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.isDisposed()) {
                List<byte[]> additionalImages = vidaLivenessResponse.getAdditionalImages();
                if (additionalImages == null || (listEmptyList = CollectionsKt.toList(additionalImages)) == null) {
                    listEmptyList = CollectionsKt.emptyList();
                }
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentbindingInflater1(new TwilightManager.TuitionPaymentFragmentspecialinlinedviewModeldefault1(vidaLivenessResponse, listEmptyList));
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
            }
            VidaLiveness vidaLiveness = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            if (vidaLiveness != null) {
                vidaLiveness.release();
            }
        }

        @Override // id.vida.liveness.listeners.VidaLivenessListener
        public final void onError(int i, String str, VidaLivenessResponse vidaLivenessResponse) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(vidaLivenessResponse, "");
            if (!this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.isDisposed()) {
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentbindingInflater1(new TwilightManager.TuitionPaymentFragmentbindingInflater1(i, str, vidaLivenessResponse));
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
            }
            VidaLiveness vidaLiveness = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            if (vidaLiveness != null) {
                vidaLiveness.release();
            }
        }

        @Override // id.vida.liveness.listeners.VidaLivenessListener
        public final void onInitialized() {
            VidaLiveness vidaLiveness = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            if (vidaLiveness != null) {
                vidaLiveness.startDetection();
            }
        }
    }
}
