package defpackage;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.os.Build;
import coil.decode.BitmapFactoryDecoder$decode$1;
import coil.decode.ExifOrientationPolicy;
import com.google.android.gms.internal.mlkit_vision_face.zzbr;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.io.CloseableKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.InterruptibleKt$runInterruptible$2;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\b\b\u0007\u0018\u0000 \u00182\u00020\u0001:\u0003\u001b\u000f\u0018B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bB\u0019\b\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\n\u0010\fB#\b\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\n\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eH\u0096@¢\u0006\u0004\b\u000f\u0010\u0010J\u0013\u0010\u0012\u001a\u00020\u000e*\u00020\u0011H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u001b\u0010\u0016\u001a\u00020\u0015*\u00020\u00112\u0006\u0010\u0003\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u001b\u0010\u0018\u001a\u00020\u0015*\u00020\u00112\u0006\u0010\u0003\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0018\u0010\u0017R\u0014\u0010\u0016\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0019R\u0014\u0010\u001b\u001a\u00020\u00048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u001aR\u0014\u0010\u0012\u001a\u00020\u00068\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\u0018\u001a\u00020\b8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u001d"}, d2 = {"LMediaBrowserCompatApi21;", "LMediaBrowserCompatApi21MediaItem;", "LMediaBrowserCompatApi23ItemCallback;", "p0", "LgetStarRating;", "p1", "LVideoEncoderInfoImplExternalSyntheticLambda0;", "p2", "Lcoil/decode/ExifOrientationPolicy;", "p3", "<init>", "(LMediaBrowserCompatApi23ItemCallback;LgetStarRating;LVideoEncoderInfoImplExternalSyntheticLambda0;Lcoil/decode/ExifOrientationPolicy;)V", "(LMediaBrowserCompatApi23ItemCallback;LgetStarRating;)V", "(LMediaBrowserCompatApi23ItemCallback;LgetStarRating;LVideoEncoderInfoImplExternalSyntheticLambda0;)V", "LcreateSubscriptionCallback;", "b", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroid/graphics/BitmapFactory$Options;", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "(Landroid/graphics/BitmapFactory$Options;)LcreateSubscriptionCallback;", "LMediaBrowserCompatApi21SubscriptionCallbackProxy;", "", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "(Landroid/graphics/BitmapFactory$Options;LMediaBrowserCompatApi21SubscriptionCallbackProxy;)V", "TuitionPaymentFragmentbindingInflater1", "LMediaBrowserCompatApi23ItemCallback;", "LgetStarRating;", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "LVideoEncoderInfoImplExternalSyntheticLambda0;", "Lcoil/decode/ExifOrientationPolicy;"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class MediaBrowserCompatApi21 implements MediaBrowserCompatApi21MediaItem {

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
    private final ExifOrientationPolicy TuitionPaymentFragmentbindingInflater1;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
    private final getStarRating TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
    private final VideoEncoderInfoImplExternalSyntheticLambda0 TuitionPaymentFragmentspecialinlinedviewModeldefault2;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final MediaBrowserCompatApi23ItemCallback TuitionPaymentFragmentspecialinlinedviewModeldefault1;

    public MediaBrowserCompatApi21(MediaBrowserCompatApi23ItemCallback mediaBrowserCompatApi23ItemCallback, getStarRating getstarrating, VideoEncoderInfoImplExternalSyntheticLambda0 videoEncoderInfoImplExternalSyntheticLambda0, ExifOrientationPolicy exifOrientationPolicy) {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = mediaBrowserCompatApi23ItemCallback;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = getstarrating;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = videoEncoderInfoImplExternalSyntheticLambda0;
        this.TuitionPaymentFragmentbindingInflater1 = exifOrientationPolicy;
    }

    public /* synthetic */ MediaBrowserCompatApi21(MediaBrowserCompatApi23ItemCallback mediaBrowserCompatApi23ItemCallback, getStarRating getstarrating, VideoEncoderInfoImplExternalSyntheticLambda0 videoEncoderInfoImplExternalSyntheticLambda0, ExifOrientationPolicy exifOrientationPolicy, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(mediaBrowserCompatApi23ItemCallback, getstarrating, (i & 4) != 0 ? dynamicRangeToCodecProfileLevelForMime.b(Integer.MAX_VALUE) : videoEncoderInfoImplExternalSyntheticLambda0, (i & 8) != 0 ? ExifOrientationPolicy.RESPECT_PERFORMANCE : exifOrientationPolicy);
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Kept for binary compatibility.")
    public /* synthetic */ MediaBrowserCompatApi21(MediaBrowserCompatApi23ItemCallback mediaBrowserCompatApi23ItemCallback, getStarRating getstarrating) {
        this(mediaBrowserCompatApi23ItemCallback, getstarrating, null, null, 12, null);
    }

    public /* synthetic */ MediaBrowserCompatApi21(MediaBrowserCompatApi23ItemCallback mediaBrowserCompatApi23ItemCallback, getStarRating getstarrating, VideoEncoderInfoImplExternalSyntheticLambda0 videoEncoderInfoImplExternalSyntheticLambda0, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(mediaBrowserCompatApi23ItemCallback, getstarrating, (i & 4) != 0 ? dynamicRangeToCodecProfileLevelForMime.b(Integer.MAX_VALUE) : videoEncoderInfoImplExternalSyntheticLambda0);
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Kept for binary compatibility.")
    public /* synthetic */ MediaBrowserCompatApi21(MediaBrowserCompatApi23ItemCallback mediaBrowserCompatApi23ItemCallback, getStarRating getstarrating, VideoEncoderInfoImplExternalSyntheticLambda0 videoEncoderInfoImplExternalSyntheticLambda0) {
        this(mediaBrowserCompatApi23ItemCallback, getstarrating, videoEncoderInfoImplExternalSyntheticLambda0, null, 8, null);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0014  */
    @Override // defpackage.MediaBrowserCompatApi21MediaItem
    public final Object b(Continuation<? super createSubscriptionCallback> continuation) throws Throwable {
        BitmapFactoryDecoder$decode$1 bitmapFactoryDecoder$decode$1;
        VideoEncoderInfoImplExternalSyntheticLambda0 videoEncoderInfoImplExternalSyntheticLambda0;
        final MediaBrowserCompatApi21 mediaBrowserCompatApi21;
        VideoEncoderInfoImplExternalSyntheticLambda0 videoEncoderInfoImplExternalSyntheticLambda1;
        if (continuation instanceof BitmapFactoryDecoder$decode$1) {
            bitmapFactoryDecoder$decode$1 = (BitmapFactoryDecoder$decode$1) continuation;
            if ((bitmapFactoryDecoder$decode$1.label & Integer.MIN_VALUE) != 0) {
                bitmapFactoryDecoder$decode$1.label -= Integer.MIN_VALUE;
            } else {
                bitmapFactoryDecoder$decode$1 = new BitmapFactoryDecoder$decode$1(this, continuation);
            }
        } else {
            bitmapFactoryDecoder$decode$1 = new BitmapFactoryDecoder$decode$1(this, continuation);
        }
        Object objTuitionPaymentFragmentbindingInflater1 = bitmapFactoryDecoder$decode$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = bitmapFactoryDecoder$decode$1.label;
        try {
            if (i == 0) {
                ResultKt.throwOnFailure(objTuitionPaymentFragmentbindingInflater1);
                videoEncoderInfoImplExternalSyntheticLambda0 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                bitmapFactoryDecoder$decode$1.L$0 = this;
                bitmapFactoryDecoder$decode$1.L$1 = videoEncoderInfoImplExternalSyntheticLambda0;
                bitmapFactoryDecoder$decode$1.label = 1;
                if (videoEncoderInfoImplExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3(bitmapFactoryDecoder$decode$1) != coroutine_suspended) {
                    mediaBrowserCompatApi21 = this;
                }
                return coroutine_suspended;
            }
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                videoEncoderInfoImplExternalSyntheticLambda1 = (VideoEncoderInfoImplExternalSyntheticLambda0) bitmapFactoryDecoder$decode$1.L$0;
                try {
                    ResultKt.throwOnFailure(objTuitionPaymentFragmentbindingInflater1);
                    createSubscriptionCallback createsubscriptioncallback = (createSubscriptionCallback) objTuitionPaymentFragmentbindingInflater1;
                    videoEncoderInfoImplExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
                    return createsubscriptioncallback;
                } catch (Throwable th) {
                    th = th;
                    videoEncoderInfoImplExternalSyntheticLambda0 = videoEncoderInfoImplExternalSyntheticLambda1;
                    videoEncoderInfoImplExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
                    throw th;
                }
            }
            videoEncoderInfoImplExternalSyntheticLambda0 = (VideoEncoderInfoImplExternalSyntheticLambda0) bitmapFactoryDecoder$decode$1.L$1;
            mediaBrowserCompatApi21 = (MediaBrowserCompatApi21) bitmapFactoryDecoder$decode$1.L$0;
            ResultKt.throwOnFailure(objTuitionPaymentFragmentbindingInflater1);
            Function0 function0 = new Function0() { // from class: createConnectionCallback
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return MediaBrowserCompatApi21.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
                }
            };
            bitmapFactoryDecoder$decode$1.L$0 = videoEncoderInfoImplExternalSyntheticLambda0;
            bitmapFactoryDecoder$decode$1.L$1 = null;
            bitmapFactoryDecoder$decode$1.label = 2;
            objTuitionPaymentFragmentbindingInflater1 = BuildersKt.TuitionPaymentFragmentbindingInflater1(EmptyCoroutineContext.INSTANCE, new InterruptibleKt$runInterruptible$2(function0, null), bitmapFactoryDecoder$decode$1);
            if (objTuitionPaymentFragmentbindingInflater1 != coroutine_suspended) {
                videoEncoderInfoImplExternalSyntheticLambda1 = videoEncoderInfoImplExternalSyntheticLambda0;
                createSubscriptionCallback createsubscriptioncallback2 = (createSubscriptionCallback) objTuitionPaymentFragmentbindingInflater1;
                videoEncoderInfoImplExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
                return createsubscriptioncallback2;
            }
            return coroutine_suspended;
        } catch (Throwable th2) {
            th = th2;
            videoEncoderInfoImplExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final createSubscriptionCallback TuitionPaymentFragmentspecialinlinedviewModeldefault3(MediaBrowserCompatApi21 mediaBrowserCompatApi21) {
        return mediaBrowserCompatApi21.TuitionPaymentFragmentspecialinlinedviewModeldefault2(new BitmapFactory.Options());
    }

    private final createSubscriptionCallback TuitionPaymentFragmentspecialinlinedviewModeldefault2(BitmapFactory.Options options) throws Exception {
        b bVar = new b(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentbindingInflater1());
        RotationProvider1 rotationProvider1TuitionPaymentFragmentspecialinlinedviewModeldefault3 = SurfaceViewImplementation.TuitionPaymentFragmentspecialinlinedviewModeldefault3(bVar);
        boolean z = true;
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeStream(rotationProvider1TuitionPaymentFragmentspecialinlinedviewModeldefault3.g().a(), null, options);
        Exception excTuitionPaymentFragmentspecialinlinedviewModeldefault1 = bVar.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        if (excTuitionPaymentFragmentspecialinlinedviewModeldefault1 != null) {
            throw excTuitionPaymentFragmentspecialinlinedviewModeldefault1;
        }
        options.inJustDecodeBounds = false;
        MediaBrowserCompatApi21ConnectionCallbackProxy mediaBrowserCompatApi21ConnectionCallbackProxy = MediaBrowserCompatApi21ConnectionCallbackProxy.INSTANCE;
        MediaBrowserCompatApi21SubscriptionCallbackProxy mediaBrowserCompatApi21SubscriptionCallbackProxyTuitionPaymentFragmentbindingInflater1 = MediaBrowserCompatApi21ConnectionCallbackProxy.TuitionPaymentFragmentbindingInflater1(options.outMimeType, rotationProvider1TuitionPaymentFragmentspecialinlinedviewModeldefault3, this.TuitionPaymentFragmentbindingInflater1);
        Exception excTuitionPaymentFragmentspecialinlinedviewModeldefault2 = bVar.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        if (excTuitionPaymentFragmentspecialinlinedviewModeldefault2 != null) {
            throw excTuitionPaymentFragmentspecialinlinedviewModeldefault2;
        }
        options.inMutable = false;
        if (Build.VERSION.SDK_INT >= 26 && this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.x_() != null) {
            options.inPreferredColorSpace = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.x_();
        }
        options.inPremultiplied = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.g();
        TuitionPaymentFragmentspecialinlinedviewModeldefault1(options, mediaBrowserCompatApi21SubscriptionCallbackProxyTuitionPaymentFragmentbindingInflater1);
        TuitionPaymentFragmentbindingInflater1(options, mediaBrowserCompatApi21SubscriptionCallbackProxyTuitionPaymentFragmentbindingInflater1);
        RotationProvider1 rotationProvider1 = rotationProvider1TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        try {
            Bitmap bitmapDecodeStream = BitmapFactory.decodeStream(rotationProvider1.a(), null, options);
            CloseableKt.closeFinally(rotationProvider1, null);
            Exception excTuitionPaymentFragmentspecialinlinedviewModeldefault3 = bVar.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
            if (excTuitionPaymentFragmentspecialinlinedviewModeldefault3 != null) {
                throw excTuitionPaymentFragmentspecialinlinedviewModeldefault3;
            }
            if (bitmapDecodeStream == null) {
                throw new IllegalStateException("BitmapFactory returned a null bitmap. Often this means BitmapFactory could not decode the image data read from the input source (e.g. network, disk, or memory) as it's not encoded as a valid image format.".toString());
            }
            bitmapDecodeStream.setDensity(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault2().getResources().getDisplayMetrics().densityDpi);
            MediaBrowserCompatApi21ConnectionCallbackProxy mediaBrowserCompatApi21ConnectionCallbackProxy2 = MediaBrowserCompatApi21ConnectionCallbackProxy.INSTANCE;
            BitmapDrawable bitmapDrawable = new BitmapDrawable(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault2().getResources(), MediaBrowserCompatApi21ConnectionCallbackProxy.TuitionPaymentFragmentspecialinlinedviewModeldefault1(bitmapDecodeStream, mediaBrowserCompatApi21SubscriptionCallbackProxyTuitionPaymentFragmentbindingInflater1));
            if (options.inSampleSize <= 1 && !options.inScaled) {
                z = false;
            }
            return new createSubscriptionCallback(bitmapDrawable, z);
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                CloseableKt.closeFinally(rotationProvider1, th);
                throw th2;
            }
        }
    }

    private final void TuitionPaymentFragmentspecialinlinedviewModeldefault1(BitmapFactory.Options options, MediaBrowserCompatApi21SubscriptionCallbackProxy mediaBrowserCompatApi21SubscriptionCallbackProxy) {
        Bitmap.Config configTuitionPaymentFragmentspecialinlinedviewModeldefault3 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        if ((mediaBrowserCompatApi21SubscriptionCallbackProxy.getB() || MediaBrowserCompatApi26.TuitionPaymentFragmentspecialinlinedviewModeldefault1(mediaBrowserCompatApi21SubscriptionCallbackProxy)) && (configTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null || fastForward.TuitionPaymentFragmentspecialinlinedviewModeldefault3(configTuitionPaymentFragmentspecialinlinedviewModeldefault3))) {
            configTuitionPaymentFragmentspecialinlinedviewModeldefault3 = Bitmap.Config.ARGB_8888;
        }
        if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault1() && configTuitionPaymentFragmentspecialinlinedviewModeldefault3 == Bitmap.Config.ARGB_8888 && Intrinsics.areEqual(options.outMimeType, "image/jpeg")) {
            configTuitionPaymentFragmentspecialinlinedviewModeldefault3 = Bitmap.Config.RGB_565;
        }
        if (Build.VERSION.SDK_INT >= 26 && options.outConfig == Bitmap.Config.RGBA_F16 && configTuitionPaymentFragmentspecialinlinedviewModeldefault3 != Bitmap.Config.HARDWARE) {
            configTuitionPaymentFragmentspecialinlinedviewModeldefault3 = Bitmap.Config.RGBA_F16;
        }
        options.inPreferredConfig = configTuitionPaymentFragmentspecialinlinedviewModeldefault3;
    }

    private final void TuitionPaymentFragmentbindingInflater1(BitmapFactory.Options options, MediaBrowserCompatApi21SubscriptionCallbackProxy mediaBrowserCompatApi21SubscriptionCallbackProxy) {
        MediaBrowserCompatApi23ItemCallback.TuitionPaymentFragmentbindingInflater1 tuitionPaymentFragmentbindingInflater1B = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.b();
        if ((tuitionPaymentFragmentbindingInflater1B instanceof getIconBitmap) && onExtrasChanged.TuitionPaymentFragmentspecialinlinedviewModeldefault1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.cancel())) {
            options.inSampleSize = 1;
            options.inScaled = true;
            options.inDensity = ((getIconBitmap) tuitionPaymentFragmentbindingInflater1B).TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            options.inTargetDensity = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault2().getResources().getDisplayMetrics().densityDpi;
            return;
        }
        if (options.outWidth <= 0 || options.outHeight <= 0) {
            options.inSampleSize = 1;
            options.inScaled = false;
            return;
        }
        int i = MediaBrowserCompatApi26.b(mediaBrowserCompatApi21SubscriptionCallbackProxy) ? options.outHeight : options.outWidth;
        int i2 = MediaBrowserCompatApi26.b(mediaBrowserCompatApi21SubscriptionCallbackProxy) ? options.outWidth : options.outHeight;
        onQueueTitleChanged onqueuetitlechangedCancel = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.cancel();
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = onExtrasChanged.TuitionPaymentFragmentspecialinlinedviewModeldefault1(onqueuetitlechangedCancel) ? i : getRatingType.TuitionPaymentFragmentspecialinlinedviewModeldefault3(onqueuetitlechangedCancel.getTuitionPaymentFragmentspecialinlinedviewModeldefault1(), this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.cancelAll());
        onQueueTitleChanged onqueuetitlechangedCancel2 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.cancel();
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault4 = onExtrasChanged.TuitionPaymentFragmentspecialinlinedviewModeldefault1(onqueuetitlechangedCancel2) ? i2 : getRatingType.TuitionPaymentFragmentspecialinlinedviewModeldefault3(onqueuetitlechangedCancel2.getTuitionPaymentFragmentspecialinlinedviewModeldefault3(), this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.cancelAll());
        options.inSampleSize = MediaBrowserCompatApi23.TuitionPaymentFragmentspecialinlinedviewModeldefault1(i, i2, iTuitionPaymentFragmentspecialinlinedviewModeldefault3, iTuitionPaymentFragmentspecialinlinedviewModeldefault4, this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.cancelAll());
        double dTuitionPaymentFragmentspecialinlinedviewModeldefault2 = MediaBrowserCompatApi23.TuitionPaymentFragmentspecialinlinedviewModeldefault2(((double) i) / ((double) options.inSampleSize), ((double) i2) / ((double) options.inSampleSize), iTuitionPaymentFragmentspecialinlinedviewModeldefault3, iTuitionPaymentFragmentspecialinlinedviewModeldefault4, this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.cancelAll());
        if (((Boolean) getStarRating.TuitionPaymentFragmentspecialinlinedviewModeldefault2(-1007128350, zzbr.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), zzbr.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), zzbr.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), 1007128351, new Object[]{this.TuitionPaymentFragmentspecialinlinedviewModeldefault3}, zzbr.TuitionPaymentFragmentspecialinlinedviewModeldefault3())).booleanValue()) {
            dTuitionPaymentFragmentspecialinlinedviewModeldefault2 = RangesKt.coerceAtMost(dTuitionPaymentFragmentspecialinlinedviewModeldefault2, 1.0d);
        }
        options.inScaled = !(dTuitionPaymentFragmentspecialinlinedviewModeldefault2 == 1.0d);
        if (options.inScaled) {
            if (dTuitionPaymentFragmentspecialinlinedviewModeldefault2 > 1.0d) {
                options.inDensity = MathKt.roundToInt(2.147483647E9d / dTuitionPaymentFragmentspecialinlinedviewModeldefault2);
                options.inTargetDensity = Integer.MAX_VALUE;
            } else {
                options.inDensity = Integer.MAX_VALUE;
                options.inTargetDensity = MathKt.roundToInt(dTuitionPaymentFragmentspecialinlinedviewModeldefault2 * 2.147483647E9d);
            }
        }
    }

    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\t\b\u0017¢\u0006\u0004\b\u0006\u0010\bB\u0013\b\u0017\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\tJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\fH\u0017¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0003\u001a\u0004\u0018\u00010\u0011H\u0096\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0017\u001a\u00020\u00048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001b\u001a\u00020\u00198\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u001a"}, d2 = {"LMediaBrowserCompatApi21$TuitionPaymentFragmentspecialinlinedviewModeldefault3;", "LMediaBrowserCompatApi21MediaItem$TuitionPaymentFragmentspecialinlinedviewModeldefault2;", "", "p0", "Lcoil/decode/ExifOrientationPolicy;", "p1", "<init>", "(ILcoil/decode/ExifOrientationPolicy;)V", "()V", "(I)V", "LMediaDescriptionCompatApi21Builder;", "LgetStarRating;", "LwriteToParcel;", "p2", "LMediaBrowserCompatApi21MediaItem;", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "(LMediaDescriptionCompatApi21Builder;LgetStarRating;)LMediaBrowserCompatApi21MediaItem;", "", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "Lcoil/decode/ExifOrientationPolicy;", "LVideoEncoderInfoImplExternalSyntheticLambda0;", "LVideoEncoderInfoImplExternalSyntheticLambda0;", "b"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class TuitionPaymentFragmentspecialinlinedviewModeldefault3 implements MediaBrowserCompatApi21MediaItem.TuitionPaymentFragmentspecialinlinedviewModeldefault2 {
        private final ExifOrientationPolicy TuitionPaymentFragmentspecialinlinedviewModeldefault1;

        /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
        private final VideoEncoderInfoImplExternalSyntheticLambda0 b;

        public TuitionPaymentFragmentspecialinlinedviewModeldefault3(int i, ExifOrientationPolicy exifOrientationPolicy) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = exifOrientationPolicy;
            this.b = dynamicRangeToCodecProfileLevelForMime.b(i);
        }

        public /* synthetic */ TuitionPaymentFragmentspecialinlinedviewModeldefault3(int i, ExifOrientationPolicy exifOrientationPolicy, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? 4 : i, (i2 & 2) != 0 ? ExifOrientationPolicy.RESPECT_PERFORMANCE : exifOrientationPolicy);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
            this(0, null, 3, 0 == true ? 1 : 0);
        }

        public /* synthetic */ TuitionPaymentFragmentspecialinlinedviewModeldefault3(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? 4 : i);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Deprecated(level = DeprecationLevel.HIDDEN, message = "Kept for binary compatibility.")
        public /* synthetic */ TuitionPaymentFragmentspecialinlinedviewModeldefault3(int i) {
            this(i, null, 2, 0 == true ? 1 : 0);
        }

        @Override // MediaBrowserCompatApi21MediaItem.TuitionPaymentFragmentspecialinlinedviewModeldefault2
        public final MediaBrowserCompatApi21MediaItem TuitionPaymentFragmentspecialinlinedviewModeldefault3(MediaDescriptionCompatApi21Builder mediaDescriptionCompatApi21Builder, getStarRating getstarrating) {
            return new MediaBrowserCompatApi21(mediaDescriptionCompatApi21Builder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), getstarrating, this.b, this.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
        }

        public final boolean equals(Object p0) {
            return p0 instanceof TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        }

        public final int hashCode() {
            return getClass().hashCode();
        }
    }

    static final class b extends RotationProviderListenerWrapperExternalSyntheticLambda0 {
        private Exception b;

        public b(tryToComplete trytocomplete) {
            super(trytocomplete);
        }

        public final Exception TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
            return this.b;
        }

        @Override // defpackage.RotationProviderListenerWrapperExternalSyntheticLambda0, defpackage.tryToComplete
        public final long read(RotationProviderListenerWrapper rotationProviderListenerWrapper, long j) throws Exception {
            try {
                return super.read(rotationProviderListenerWrapper, j);
            } catch (Exception e2) {
                this.b = e2;
                throw e2;
            }
        }
    }
}
