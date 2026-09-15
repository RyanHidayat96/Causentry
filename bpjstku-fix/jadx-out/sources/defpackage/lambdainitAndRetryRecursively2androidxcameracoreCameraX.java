package defpackage;

import android.content.res.AssetFileDescriptor;
import android.content.res.AssetManager;
import android.net.Uri;
import java.io.InputStream;

/* JADX INFO: loaded from: classes3.dex */
public final class lambdainitAndRetryRecursively2androidxcameracoreCameraX<Data> implements getSchedulerHandler<Uri, Data> {
    private static final int TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 22;
    private final AssetManager TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    private final TuitionPaymentFragmentspecialinlinedviewModeldefault2<Data> b;

    public interface TuitionPaymentFragmentspecialinlinedviewModeldefault2<Data> {
        isUseCasesCombinationSupportedByFramework<Data> TuitionPaymentFragmentspecialinlinedviewModeldefault3(AssetManager assetManager, String str);
    }

    @Override // defpackage.getSchedulerHandler
    public final /* synthetic */ getSchedulerHandler.TuitionPaymentFragmentbindingInflater1 TuitionPaymentFragmentbindingInflater1(Uri uri, int i, int i2, getTargetRotation gettargetrotation) {
        Uri uri2 = uri;
        return new getSchedulerHandler.TuitionPaymentFragmentbindingInflater1(new setResolutionSelector(uri2), this.b.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, uri2.toString().substring(TuitionPaymentFragmentspecialinlinedviewModeldefault1)));
    }

    @Override // defpackage.getSchedulerHandler
    public final /* synthetic */ boolean TuitionPaymentFragmentbindingInflater1(Uri uri) {
        Uri uri2 = uri;
        return "file".equals(uri2.getScheme()) && !uri2.getPathSegments().isEmpty() && "android_asset".equals(uri2.getPathSegments().get(0));
    }

    public lambdainitAndRetryRecursively2androidxcameracoreCameraX(AssetManager assetManager, TuitionPaymentFragmentspecialinlinedviewModeldefault2<Data> tuitionPaymentFragmentspecialinlinedviewModeldefault2) {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = assetManager;
        this.b = tuitionPaymentFragmentspecialinlinedviewModeldefault2;
    }

    public static class TuitionPaymentFragmentspecialinlinedviewModeldefault3 implements getDeviceSurfaceManagerProvider<Uri, InputStream>, TuitionPaymentFragmentspecialinlinedviewModeldefault2<InputStream> {
        private final AssetManager b;

        public TuitionPaymentFragmentspecialinlinedviewModeldefault3(AssetManager assetManager) {
            this.b = assetManager;
        }

        @Override // defpackage.getDeviceSurfaceManagerProvider
        public final getSchedulerHandler<Uri, InputStream> TuitionPaymentFragmentspecialinlinedviewModeldefault3(setCameraExecutor setcameraexecutor) {
            return new lambdainitAndRetryRecursively2androidxcameracoreCameraX(this.b, this);
        }

        @Override // lambdainitAndRetryRecursively2androidxcameracoreCameraX.TuitionPaymentFragmentspecialinlinedviewModeldefault2
        public final isUseCasesCombinationSupportedByFramework<InputStream> TuitionPaymentFragmentspecialinlinedviewModeldefault3(AssetManager assetManager, String str) {
            return new CameraEffectOutputOptions(assetManager, str);
        }
    }

    public static class b implements getDeviceSurfaceManagerProvider<Uri, AssetFileDescriptor>, TuitionPaymentFragmentspecialinlinedviewModeldefault2<AssetFileDescriptor> {
        private final AssetManager TuitionPaymentFragmentbindingInflater1;

        public b(AssetManager assetManager) {
            this.TuitionPaymentFragmentbindingInflater1 = assetManager;
        }

        @Override // defpackage.getDeviceSurfaceManagerProvider
        public final getSchedulerHandler<Uri, AssetFileDescriptor> TuitionPaymentFragmentspecialinlinedviewModeldefault3(setCameraExecutor setcameraexecutor) {
            return new lambdainitAndRetryRecursively2androidxcameracoreCameraX(this.TuitionPaymentFragmentbindingInflater1, this);
        }

        @Override // lambdainitAndRetryRecursively2androidxcameracoreCameraX.TuitionPaymentFragmentspecialinlinedviewModeldefault2
        public final isUseCasesCombinationSupportedByFramework<AssetFileDescriptor> TuitionPaymentFragmentspecialinlinedviewModeldefault3(AssetManager assetManager, String str) {
            return new createSurfaceProcessorInternal(assetManager, str);
        }
    }
}
