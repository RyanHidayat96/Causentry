package defpackage;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import com.bumptech.glide.Glide;
import com.bumptech.glide.Registry;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.data.ParcelFileDescriptorRewinder;
import com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool;
import com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser;
import com.bumptech.glide.load.resource.bitmap.VideoDecoder;
import java.io.File;
import java.io.InputStream;
import java.net.URL;
import java.nio.ByteBuffer;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes3.dex */
public final class AutoValue_ResolutionInfo_ResolutionInfoInternalBuilder {
    static Registry TuitionPaymentFragmentspecialinlinedviewModeldefault3(Glide glide, List<ImageAnalysisExternalSyntheticLambda2> list, onSuggestedStreamSpecUpdated onsuggestedstreamspecupdated) {
        Camera getcapturestages;
        Camera is10bithdr;
        BitmapPool bitmapPool = glide.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        CameraUnavailableException cameraUnavailableException = glide.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        Context applicationContext = glide.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getApplicationContext();
        setResolution setresolution = glide.TuitionPaymentFragmentspecialinlinedviewModeldefault1.asInterface;
        Registry registry = new Registry();
        registry.TuitionPaymentFragmentspecialinlinedviewModeldefault2(new DefaultImageHeaderParser());
        if (Build.VERSION.SDK_INT >= 27) {
            registry.TuitionPaymentFragmentspecialinlinedviewModeldefault2(new onPostviewBitmapAvailable());
        }
        Resources resources = applicationContext.getResources();
        List<ImageHeaderParser> listTuitionPaymentFragmentspecialinlinedviewModeldefault1 = registry.b.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        if (!listTuitionPaymentFragmentspecialinlinedviewModeldefault1.isEmpty()) {
            ExposureState exposureState = new ExposureState(applicationContext, listTuitionPaymentFragmentspecialinlinedviewModeldefault1, bitmapPool, cameraUnavailableException);
            Camera<ParcelFileDescriptor, Bitmap> cameraTuitionPaymentFragmentspecialinlinedviewModeldefault3 = VideoDecoder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(bitmapPool);
            List<ImageHeaderParser> listTuitionPaymentFragmentspecialinlinedviewModeldefault2 = registry.b.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
            if (!listTuitionPaymentFragmentspecialinlinedviewModeldefault2.isEmpty()) {
                getLayoutSettings getlayoutsettings = new getLayoutSettings(listTuitionPaymentFragmentspecialinlinedviewModeldefault2, resources.getDisplayMetrics(), bitmapPool, cameraUnavailableException);
                if (Build.VERSION.SDK_INT >= 28 && setresolution.TuitionPaymentFragmentspecialinlinedviewModeldefault3.containsKey(AutoValue_SurfaceOutput_CameraInputInfo.b.class)) {
                    is10bithdr = new DynamicRange();
                    getcapturestages = new DelegatingImageCapturedCallback();
                } else {
                    getcapturestages = new getCaptureStages(getlayoutsettings);
                    is10bithdr = new is10BitHdr(getlayoutsettings, cameraUnavailableException);
                }
                if (Build.VERSION.SDK_INT >= 28) {
                    registry.TuitionPaymentFragmentspecialinlinedviewModeldefault1("Animation", InputStream.class, Drawable.class, new ExperimentalRetryPolicy.TuitionPaymentFragmentspecialinlinedviewModeldefault1(new ExperimentalRetryPolicy(listTuitionPaymentFragmentspecialinlinedviewModeldefault1, cameraUnavailableException)));
                    registry.TuitionPaymentFragmentspecialinlinedviewModeldefault1("Animation", ByteBuffer.class, Drawable.class, new ExperimentalRetryPolicy.TuitionPaymentFragmentspecialinlinedviewModeldefault3(new ExperimentalRetryPolicy(listTuitionPaymentFragmentspecialinlinedviewModeldefault1, cameraUnavailableException)));
                }
                ExtendableBuilder extendableBuilder = new ExtendableBuilder(applicationContext);
                ConcurrentCamera concurrentCamera = new ConcurrentCamera(cameraUnavailableException);
                FocusMeteringActionMeteringMode focusMeteringActionMeteringMode = new FocusMeteringActionMeteringMode();
                isFocusSuccessful isfocussuccessful = new isFocusSuccessful();
                ContentResolver contentResolver = applicationContext.getContentResolver();
                registry.TuitionPaymentFragmentspecialinlinedviewModeldefault1(ByteBuffer.class, new CameraXInternalInitState()).TuitionPaymentFragmentspecialinlinedviewModeldefault1(InputStream.class, new setDeviceSurfaceManagerProvider(cameraUnavailableException)).TuitionPaymentFragmentspecialinlinedviewModeldefault1("Bitmap", ByteBuffer.class, Bitmap.class, getcapturestages).TuitionPaymentFragmentspecialinlinedviewModeldefault1("Bitmap", InputStream.class, Bitmap.class, is10bithdr);
                if (!"robolectric".equals(Build.FINGERPRINT)) {
                    registry.TuitionPaymentFragmentspecialinlinedviewModeldefault1("Bitmap", ParcelFileDescriptor.class, Bitmap.class, new getEncodingLabel(getlayoutsettings));
                }
                Registry registryTuitionPaymentFragmentspecialinlinedviewModeldefault1 = registry.TuitionPaymentFragmentspecialinlinedviewModeldefault1("Bitmap", ParcelFileDescriptor.class, Bitmap.class, cameraTuitionPaymentFragmentspecialinlinedviewModeldefault3).TuitionPaymentFragmentspecialinlinedviewModeldefault1("Bitmap", AssetFileDescriptor.class, Bitmap.class, VideoDecoder.TuitionPaymentFragmentspecialinlinedviewModeldefault1(bitmapPool)).TuitionPaymentFragmentbindingInflater1(Bitmap.class, Bitmap.class, setCameraOpenRetryMaxTimeoutInMillisWhileResuming.b.b()).TuitionPaymentFragmentspecialinlinedviewModeldefault1("Bitmap", Bitmap.class, Bitmap.class, new DynamicRangeBitDepth()).TuitionPaymentFragmentspecialinlinedviewModeldefault2(Bitmap.class, concurrentCamera).TuitionPaymentFragmentspecialinlinedviewModeldefault1("BitmapDrawable", ByteBuffer.class, BitmapDrawable.class, new singleDefaultCaptureBundle(resources, getcapturestages)).TuitionPaymentFragmentspecialinlinedviewModeldefault1("BitmapDrawable", InputStream.class, BitmapDrawable.class, new singleDefaultCaptureBundle(resources, is10bithdr)).TuitionPaymentFragmentspecialinlinedviewModeldefault1("BitmapDrawable", ParcelFileDescriptor.class, BitmapDrawable.class, new singleDefaultCaptureBundle(resources, cameraTuitionPaymentFragmentspecialinlinedviewModeldefault3)).TuitionPaymentFragmentspecialinlinedviewModeldefault2(BitmapDrawable.class, new CameraXThreads(bitmapPool, concurrentCamera)).TuitionPaymentFragmentspecialinlinedviewModeldefault1("Animation", InputStream.class, isAutoCancelEnabled.class, new removePoints(listTuitionPaymentFragmentspecialinlinedviewModeldefault1, exposureState, cameraUnavailableException)).TuitionPaymentFragmentspecialinlinedviewModeldefault1("Animation", ByteBuffer.class, isAutoCancelEnabled.class, exposureState).TuitionPaymentFragmentspecialinlinedviewModeldefault2(isAutoCancelEnabled.class, new getMeteringPointsAe()).TuitionPaymentFragmentbindingInflater1(getMirroring.class, getMirroring.class, setCameraOpenRetryMaxTimeoutInMillisWhileResuming.b.b()).TuitionPaymentFragmentspecialinlinedviewModeldefault1("Bitmap", getMirroring.class, Bitmap.class, new FocusMeteringActionBuilder(bitmapPool));
                registryTuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault1("legacy_append", Uri.class, Drawable.class, extendableBuilder);
                registryTuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault1("legacy_append", Uri.class, Bitmap.class, new getBitDepth(extendableBuilder, bitmapPool));
                Registry registryTuitionPaymentFragmentbindingInflater1 = registryTuitionPaymentFragmentspecialinlinedviewModeldefault1.b((getOutputOption.TuitionPaymentFragmentspecialinlinedviewModeldefault1<?>) new DynamicRangeDynamicRangeEncoding.b()).TuitionPaymentFragmentbindingInflater1(File.class, ByteBuffer.class, new CameraXExternalSyntheticLambda2.TuitionPaymentFragmentbindingInflater1()).TuitionPaymentFragmentbindingInflater1(File.class, InputStream.class, new getCameraOpenRetryMaxTimeoutInMillisWhileResuming.TuitionPaymentFragmentbindingInflater1());
                registryTuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1("legacy_append", File.class, File.class, new FocusMeteringAction());
                registryTuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentbindingInflater1(File.class, ParcelFileDescriptor.class, new getCameraOpenRetryMaxTimeoutInMillisWhileResuming.TuitionPaymentFragmentspecialinlinedviewModeldefault2()).TuitionPaymentFragmentbindingInflater1(File.class, File.class, setCameraOpenRetryMaxTimeoutInMillisWhileResuming.b.b()).b((getOutputOption.TuitionPaymentFragmentspecialinlinedviewModeldefault1<?>) new CameraEffectTargets.TuitionPaymentFragmentbindingInflater1(cameraUnavailableException));
                if (!"robolectric".equals(Build.FINGERPRINT)) {
                    registry.b((getOutputOption.TuitionPaymentFragmentspecialinlinedviewModeldefault1<?>) new ParcelFileDescriptorRewinder.TuitionPaymentFragmentspecialinlinedviewModeldefault3());
                }
                CameraXExternalSyntheticLambda1.b bVar = new CameraXExternalSyntheticLambda1.b(applicationContext);
                CameraXExternalSyntheticLambda1.TuitionPaymentFragmentbindingInflater1 tuitionPaymentFragmentbindingInflater1 = new CameraXExternalSyntheticLambda1.TuitionPaymentFragmentbindingInflater1(applicationContext);
                CameraXExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault3 tuitionPaymentFragmentspecialinlinedviewModeldefault3 = new CameraXExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault3(applicationContext);
                registry.TuitionPaymentFragmentbindingInflater1(Integer.TYPE, InputStream.class, bVar).TuitionPaymentFragmentbindingInflater1(Integer.class, InputStream.class, bVar).TuitionPaymentFragmentbindingInflater1(Integer.TYPE, AssetFileDescriptor.class, tuitionPaymentFragmentbindingInflater1).TuitionPaymentFragmentbindingInflater1(Integer.class, AssetFileDescriptor.class, tuitionPaymentFragmentbindingInflater1).TuitionPaymentFragmentbindingInflater1(Integer.TYPE, Drawable.class, tuitionPaymentFragmentspecialinlinedviewModeldefault3).TuitionPaymentFragmentbindingInflater1(Integer.class, Drawable.class, tuitionPaymentFragmentspecialinlinedviewModeldefault3).TuitionPaymentFragmentbindingInflater1(Uri.class, InputStream.class, new fromConfig.TuitionPaymentFragmentspecialinlinedviewModeldefault1(applicationContext)).TuitionPaymentFragmentbindingInflater1(Uri.class, AssetFileDescriptor.class, new fromConfig.b(applicationContext));
                setAvailableCamerasLimiter.TuitionPaymentFragmentbindingInflater1 tuitionPaymentFragmentbindingInflater2 = new setAvailableCamerasLimiter.TuitionPaymentFragmentbindingInflater1(resources);
                setAvailableCamerasLimiter.b bVar2 = new setAvailableCamerasLimiter.b(resources);
                setAvailableCamerasLimiter.TuitionPaymentFragmentspecialinlinedviewModeldefault2 tuitionPaymentFragmentspecialinlinedviewModeldefault2 = new setAvailableCamerasLimiter.TuitionPaymentFragmentspecialinlinedviewModeldefault2(resources);
                registry.TuitionPaymentFragmentbindingInflater1(Integer.class, Uri.class, tuitionPaymentFragmentbindingInflater2).TuitionPaymentFragmentbindingInflater1(Integer.TYPE, Uri.class, tuitionPaymentFragmentbindingInflater2).TuitionPaymentFragmentbindingInflater1(Integer.class, AssetFileDescriptor.class, bVar2).TuitionPaymentFragmentbindingInflater1(Integer.TYPE, AssetFileDescriptor.class, bVar2).TuitionPaymentFragmentbindingInflater1(Integer.class, InputStream.class, tuitionPaymentFragmentspecialinlinedviewModeldefault2).TuitionPaymentFragmentbindingInflater1(Integer.TYPE, InputStream.class, tuitionPaymentFragmentspecialinlinedviewModeldefault2);
                registry.TuitionPaymentFragmentbindingInflater1(String.class, InputStream.class, new CameraXExternalSyntheticLambda3.TuitionPaymentFragmentspecialinlinedviewModeldefault1()).TuitionPaymentFragmentbindingInflater1(Uri.class, InputStream.class, new CameraXExternalSyntheticLambda3.TuitionPaymentFragmentspecialinlinedviewModeldefault1()).TuitionPaymentFragmentbindingInflater1(String.class, InputStream.class, new setCameraFactoryProvider.TuitionPaymentFragmentspecialinlinedviewModeldefault1()).TuitionPaymentFragmentbindingInflater1(String.class, ParcelFileDescriptor.class, new setCameraFactoryProvider.TuitionPaymentFragmentbindingInflater1()).TuitionPaymentFragmentbindingInflater1(String.class, AssetFileDescriptor.class, new setCameraFactoryProvider.b()).TuitionPaymentFragmentbindingInflater1(Uri.class, InputStream.class, new lambdainitAndRetryRecursively2androidxcameracoreCameraX.TuitionPaymentFragmentspecialinlinedviewModeldefault3(applicationContext.getAssets())).TuitionPaymentFragmentbindingInflater1(Uri.class, AssetFileDescriptor.class, new lambdainitAndRetryRecursively2androidxcameracoreCameraX.b(applicationContext.getAssets())).TuitionPaymentFragmentbindingInflater1(Uri.class, InputStream.class, new setUseCaseConfigFactoryProvider.TuitionPaymentFragmentspecialinlinedviewModeldefault2(applicationContext)).TuitionPaymentFragmentbindingInflater1(Uri.class, InputStream.class, new setQuirkSettings.TuitionPaymentFragmentspecialinlinedviewModeldefault3(applicationContext));
                if (Build.VERSION.SDK_INT >= 29) {
                    registry.TuitionPaymentFragmentbindingInflater1(Uri.class, InputStream.class, new setTargetClass.TuitionPaymentFragmentspecialinlinedviewModeldefault3(applicationContext));
                    registry.TuitionPaymentFragmentbindingInflater1(Uri.class, ParcelFileDescriptor.class, new setTargetClass.TuitionPaymentFragmentspecialinlinedviewModeldefault2(applicationContext));
                }
                Registry registryTuitionPaymentFragmentbindingInflater2 = registry.TuitionPaymentFragmentbindingInflater1(Uri.class, InputStream.class, new setMinimumLoggingLevel.TuitionPaymentFragmentspecialinlinedviewModeldefault1(contentResolver)).TuitionPaymentFragmentbindingInflater1(Uri.class, ParcelFileDescriptor.class, new setMinimumLoggingLevel.TuitionPaymentFragmentbindingInflater1(contentResolver)).TuitionPaymentFragmentbindingInflater1(Uri.class, AssetFileDescriptor.class, new setMinimumLoggingLevel.b(contentResolver)).TuitionPaymentFragmentbindingInflater1(Uri.class, InputStream.class, new setCameraProviderInitRetryPolicy.TuitionPaymentFragmentbindingInflater1()).TuitionPaymentFragmentbindingInflater1(URL.class, InputStream.class, new setTargetName.TuitionPaymentFragmentspecialinlinedviewModeldefault3()).TuitionPaymentFragmentbindingInflater1(Uri.class, File.class, new getCameraProviderInitRetryPolicy.TuitionPaymentFragmentspecialinlinedviewModeldefault3(applicationContext)).TuitionPaymentFragmentbindingInflater1(getCameraFactoryProvider.class, InputStream.class, new setSchedulerHandler.TuitionPaymentFragmentspecialinlinedviewModeldefault2()).TuitionPaymentFragmentbindingInflater1(byte[].class, ByteBuffer.class, new CameraXExternalSyntheticLambda4.b()).TuitionPaymentFragmentbindingInflater1(byte[].class, InputStream.class, new CameraXExternalSyntheticLambda4.TuitionPaymentFragmentspecialinlinedviewModeldefault3()).TuitionPaymentFragmentbindingInflater1(Uri.class, Uri.class, setCameraOpenRetryMaxTimeoutInMillisWhileResuming.b.b()).TuitionPaymentFragmentbindingInflater1(Drawable.class, Drawable.class, setCameraOpenRetryMaxTimeoutInMillisWhileResuming.b.b());
                registryTuitionPaymentFragmentbindingInflater2.TuitionPaymentFragmentspecialinlinedviewModeldefault1("legacy_append", Drawable.class, Drawable.class, new ExperimentalUseCaseApi());
                registryTuitionPaymentFragmentbindingInflater2.TuitionPaymentFragmentspecialinlinedviewModeldefault2(Bitmap.class, BitmapDrawable.class, new addOnImageCloseListener(resources)).TuitionPaymentFragmentspecialinlinedviewModeldefault2(Bitmap.class, byte[].class, focusMeteringActionMeteringMode).TuitionPaymentFragmentspecialinlinedviewModeldefault2(Drawable.class, byte[].class, new FocusMeteringResult(bitmapPool, focusMeteringActionMeteringMode, isfocussuccessful)).TuitionPaymentFragmentspecialinlinedviewModeldefault2(isAutoCancelEnabled.class, byte[].class, isfocussuccessful);
                Camera<ByteBuffer, Bitmap> cameraTuitionPaymentFragmentbindingInflater1 = VideoDecoder.TuitionPaymentFragmentbindingInflater1(bitmapPool);
                registry.TuitionPaymentFragmentspecialinlinedviewModeldefault1("legacy_append", ByteBuffer.class, Bitmap.class, cameraTuitionPaymentFragmentbindingInflater1);
                registry.TuitionPaymentFragmentspecialinlinedviewModeldefault1("legacy_append", ByteBuffer.class, BitmapDrawable.class, new singleDefaultCaptureBundle(resources, cameraTuitionPaymentFragmentbindingInflater1));
                for (ImageAnalysisExternalSyntheticLambda2 imageAnalysisExternalSyntheticLambda2 : list) {
                    try {
                        imageAnalysisExternalSyntheticLambda2.TuitionPaymentFragmentspecialinlinedviewModeldefault1(applicationContext, glide, registry);
                    } catch (AbstractMethodError e2) {
                        StringBuilder sb = new StringBuilder("Attempting to register a Glide v3 module. If you see this, you or one of your dependencies may be including Glide v3 even though you're using Glide v4. You'll need to find and remove (or update) the offending dependency. The v3 module name is: ");
                        sb.append(imageAnalysisExternalSyntheticLambda2.getClass().getName());
                        throw new IllegalStateException(sb.toString(), e2);
                    }
                }
                if (onsuggestedstreamspecupdated != null) {
                    onsuggestedstreamspecupdated.TuitionPaymentFragmentspecialinlinedviewModeldefault1(applicationContext, glide, registry);
                }
                return registry;
            }
            throw new Registry.NoImageHeaderParserException();
        }
        throw new Registry.NoImageHeaderParserException();
    }
}
