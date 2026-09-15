package defpackage;

import android.app.ActivityManager;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.ColorSpace;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;
import android.net.Uri;
import android.os.Build;
import android.os.Looper;
import android.view.View;
import android.webkit.MimeTypeMap;
import android.widget.ImageView;
import androidx.collection.SieveCacheKt;
import androidx.core.content.ContextCompat;
import androidx.vectordrawable.graphics.drawable.VectorDrawableCompat;
import coil.decode.DataSource;
import coil.size.Scale;
import com.bpjstku.R;
import java.io.Closeable;
import java.io.File;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import okhttp3.Headers;
import okhttp3.Response;
import okhttp3.ResponseBody;

/* JADX INFO: loaded from: classes.dex */
public final class getRatingType {
    private static final Headers TuitionPaymentFragmentbindingInflater1;
    private static final Bitmap.Config[] TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    private static final Bitmap.Config TuitionPaymentFragmentspecialinlinedviewModeldefault2;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;

        static {
            int[] iArr = new int[DataSource.values().length];
            try {
                iArr[DataSource.MEMORY_CACHE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[DataSource.MEMORY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[DataSource.DISK.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[DataSource.NETWORK.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[ImageView.ScaleType.values().length];
            try {
                iArr2[ImageView.ScaleType.FIT_START.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[ImageView.ScaleType.FIT_CENTER.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[ImageView.ScaleType.FIT_END.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[ImageView.ScaleType.CENTER_INSIDE.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[Scale.values().length];
            try {
                iArr3[Scale.FILL.ordinal()] = 1;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr3[Scale.FIT.ordinal()] = 2;
            } catch (NoSuchFieldError unused10) {
            }
            $EnumSwitchMapping$2 = iArr3;
        }
    }

    public static final boolean TuitionPaymentFragmentspecialinlinedviewModeldefault2(int i) {
        return i == Integer.MIN_VALUE || i == Integer.MAX_VALUE;
    }

    public static final ColorSpace y_() {
        return null;
    }

    public static final onPlaybackStateChanged b(View view) {
        onPlaybackStateChanged onplaybackstatechanged;
        Object tag = view.getTag(R.id.coil_request_manager);
        onPlaybackStateChanged onplaybackstatechanged2 = tag instanceof onPlaybackStateChanged ? (onPlaybackStateChanged) tag : null;
        if (onplaybackstatechanged2 != null) {
            return onplaybackstatechanged2;
        }
        synchronized (view) {
            Object tag2 = view.getTag(R.id.coil_request_manager);
            onplaybackstatechanged = tag2 instanceof onPlaybackStateChanged ? (onPlaybackStateChanged) tag2 : null;
            if (onplaybackstatechanged == null) {
                onplaybackstatechanged = new onPlaybackStateChanged(view);
                view.addOnAttachStateChangeListener(onplaybackstatechanged);
                view.setTag(R.id.coil_request_manager, onplaybackstatechanged);
            }
        }
        return onplaybackstatechanged;
    }

    public static final String TuitionPaymentFragmentspecialinlinedviewModeldefault1(DataSource dataSource) {
        int i = WhenMappings.$EnumSwitchMapping$0[dataSource.ordinal()];
        if (i == 1 || i == 2) {
            return "🧠";
        }
        if (i == 3) {
            return "💾";
        }
        if (i != 4) {
            throw new NoWhenBranchMatchedException();
        }
        return "☁️ ";
    }

    public static final int TuitionPaymentFragmentspecialinlinedviewModeldefault2(Drawable drawable) {
        Bitmap bitmap;
        BitmapDrawable bitmapDrawable = drawable instanceof BitmapDrawable ? (BitmapDrawable) drawable : null;
        return (bitmapDrawable == null || (bitmap = bitmapDrawable.getBitmap()) == null) ? drawable.getIntrinsicWidth() : bitmap.getWidth();
    }

    public static final int TuitionPaymentFragmentbindingInflater1(Drawable drawable) {
        Bitmap bitmap;
        BitmapDrawable bitmapDrawable = drawable instanceof BitmapDrawable ? (BitmapDrawable) drawable : null;
        return (bitmapDrawable == null || (bitmap = bitmapDrawable.getBitmap()) == null) ? drawable.getIntrinsicHeight() : bitmap.getHeight();
    }

    public static final boolean b(Drawable drawable) {
        return (drawable instanceof VectorDrawable) || (drawable instanceof VectorDrawableCompat);
    }

    public static final void b(Closeable closeable) {
        try {
            closeable.close();
        } catch (RuntimeException e2) {
            throw e2;
        } catch (Exception unused) {
        }
    }

    public static final Scale TuitionPaymentFragmentbindingInflater1(ImageView imageView) {
        ImageView.ScaleType scaleType = imageView.getScaleType();
        int i = scaleType == null ? -1 : WhenMappings.$EnumSwitchMapping$1[scaleType.ordinal()];
        if (i == 1 || i == 2 || i == 3 || i == 4) {
            return Scale.FIT;
        }
        return Scale.FILL;
    }

    public static final String TuitionPaymentFragmentspecialinlinedviewModeldefault2(MimeTypeMap mimeTypeMap, String str) {
        String str2 = str;
        if (str2 == null || StringsKt.isBlank(str2)) {
            return null;
        }
        return mimeTypeMap.getMimeTypeFromExtension(StringsKt.substringAfterLast(StringsKt.substringAfterLast$default(StringsKt.substringBeforeLast$default(StringsKt.substringBeforeLast$default(str, '#', (String) null, 2, (Object) null), '?', (String) null, 2, (Object) null), '/', (String) null, 2, (Object) null), '.', ""));
    }

    public static final String TuitionPaymentFragmentspecialinlinedviewModeldefault1(Uri uri) {
        return (String) CollectionsKt.firstOrNull((List) uri.getPathSegments());
    }

    public static final int TuitionPaymentFragmentspecialinlinedviewModeldefault3(Configuration configuration) {
        return configuration.uiMode & 48;
    }

    static {
        Bitmap.Config[] configArr;
        Bitmap.Config config;
        if (Build.VERSION.SDK_INT >= 26) {
            configArr = new Bitmap.Config[]{Bitmap.Config.ARGB_8888, Bitmap.Config.RGBA_F16};
        } else {
            configArr = new Bitmap.Config[]{Bitmap.Config.ARGB_8888};
        }
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = configArr;
        if (Build.VERSION.SDK_INT >= 26) {
            config = Bitmap.Config.HARDWARE;
        } else {
            config = Bitmap.Config.ARGB_8888;
        }
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = config;
        TuitionPaymentFragmentbindingInflater1 = new Headers.Builder().build();
    }

    public static final Bitmap.Config[] TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        return TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    }

    public static final Bitmap.Config TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        return TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    }

    public static final Headers TuitionPaymentFragmentbindingInflater1() {
        return TuitionPaymentFragmentbindingInflater1;
    }

    public static final Headers TuitionPaymentFragmentspecialinlinedviewModeldefault1(Headers headers) {
        return headers == null ? TuitionPaymentFragmentbindingInflater1 : headers;
    }

    public static final IMediaControllerCallback TuitionPaymentFragmentspecialinlinedviewModeldefault1(IMediaControllerCallback iMediaControllerCallback) {
        return iMediaControllerCallback == null ? IMediaControllerCallback.b : iMediaControllerCallback;
    }

    public static final getRatingStyle TuitionPaymentFragmentbindingInflater1(getRatingStyle getratingstyle) {
        return getratingstyle == null ? getRatingStyle.TuitionPaymentFragmentbindingInflater1 : getratingstyle;
    }

    public static final boolean b() {
        return Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper());
    }

    public static final File TuitionPaymentFragmentbindingInflater1(Context context) {
        File cacheDir = context.getCacheDir();
        if (cacheDir == null) {
            throw new IllegalStateException("cacheDir == null".toString());
        }
        cacheDir.mkdirs();
        return cacheDir;
    }

    public static final int TuitionPaymentFragmentbindingInflater1(String str) {
        Long longOrNull = StringsKt.toLongOrNull(str);
        if (longOrNull == null) {
            return -1;
        }
        long jLongValue = longOrNull.longValue();
        if (jLongValue > SieveCacheKt.NodeLinkMask) {
            return Integer.MAX_VALUE;
        }
        if (jLongValue < 0) {
            return 0;
        }
        return (int) jLongValue;
    }

    public static final void TuitionPaymentFragmentbindingInflater1(fromMediaDescription.TuitionPaymentFragmentspecialinlinedviewModeldefault2 tuitionPaymentFragmentspecialinlinedviewModeldefault2) {
        try {
            tuitionPaymentFragmentspecialinlinedviewModeldefault2.b();
        } catch (Exception unused) {
        }
    }

    public static final boolean TuitionPaymentFragmentspecialinlinedviewModeldefault3(fromParcel.TuitionPaymentFragmentspecialinlinedviewModeldefault2 tuitionPaymentFragmentspecialinlinedviewModeldefault2) {
        return (tuitionPaymentFragmentspecialinlinedviewModeldefault2 instanceof MediaDescriptionCompatApi21) && ((MediaDescriptionCompatApi21) tuitionPaymentFragmentspecialinlinedviewModeldefault2).getTuitionPaymentFragmentbindingInflater1();
    }

    public static final getMediaId TuitionPaymentFragmentspecialinlinedviewModeldefault2(fromParcel.TuitionPaymentFragmentspecialinlinedviewModeldefault2 tuitionPaymentFragmentspecialinlinedviewModeldefault2) {
        return tuitionPaymentFragmentspecialinlinedviewModeldefault2 instanceof MediaDescriptionCompatApi21 ? ((MediaDescriptionCompatApi21) tuitionPaymentFragmentspecialinlinedviewModeldefault2).getTuitionPaymentFragmentspecialinlinedviewModeldefault2() : getMediaId.TuitionPaymentFragmentbindingInflater1;
    }

    public static final boolean b(Uri uri) {
        return Intrinsics.areEqual(uri.getScheme(), "file") && Intrinsics.areEqual((String) CollectionsKt.firstOrNull((List) uri.getPathSegments()), "android_asset");
    }

    public static final Headers.Builder TuitionPaymentFragmentspecialinlinedviewModeldefault3(Headers.Builder builder, String str) {
        int iIndexOf$default = StringsKt.indexOf$default((CharSequence) str, ':', 0, false, 6, (Object) null);
        if (iIndexOf$default == -1) {
            throw new IllegalArgumentException("Unexpected header: ".concat(String.valueOf(str)).toString());
        }
        String strSubstring = str.substring(0, iIndexOf$default);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "");
        String string = StringsKt.trim((CharSequence) strSubstring).toString();
        String strSubstring2 = str.substring(iIndexOf$default + 1);
        Intrinsics.checkNotNullExpressionValue(strSubstring2, "");
        builder.addUnsafeNonAscii(string, strSubstring2);
        return builder;
    }

    public static final ResponseBody b(Response response) {
        ResponseBody responseBodyBody = response.body();
        if (responseBodyBody != null) {
            return responseBodyBody;
        }
        throw new IllegalStateException("response body == null".toString());
    }

    public static final int TuitionPaymentFragmentspecialinlinedviewModeldefault3(onEvent onevent, Scale scale) {
        if (onevent instanceof onEvent.TuitionPaymentFragmentspecialinlinedviewModeldefault3) {
            return ((onEvent.TuitionPaymentFragmentspecialinlinedviewModeldefault3) onevent).b;
        }
        int i = WhenMappings.$EnumSwitchMapping$2[scale.ordinal()];
        if (i == 1) {
            return Integer.MIN_VALUE;
        }
        if (i == 2) {
            return Integer.MAX_VALUE;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final double TuitionPaymentFragmentspecialinlinedviewModeldefault3(Context context) {
        try {
            Object systemService = ContextCompat.getSystemService(context, ActivityManager.class);
            Intrinsics.checkNotNull(systemService);
            return ((ActivityManager) systemService).isLowRamDevice() ? 0.15d : 0.2d;
        } catch (Exception unused) {
        }
    }

    public static final int b(Context context, double d) {
        int largeMemoryClass;
        try {
            Object systemService = ContextCompat.getSystemService(context, ActivityManager.class);
            Intrinsics.checkNotNull(systemService);
            ActivityManager activityManager = (ActivityManager) systemService;
            largeMemoryClass = (context.getApplicationInfo().flags & 1048576) != 0 ? activityManager.getLargeMemoryClass() : activityManager.getMemoryClass();
        } catch (Exception unused) {
            largeMemoryClass = 256;
        }
        return (int) (d * ((double) largeMemoryClass) * 1024.0d * 1024.0d);
    }
}
