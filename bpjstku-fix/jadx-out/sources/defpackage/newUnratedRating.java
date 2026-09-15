package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.ColorSpace;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Build;
import android.os.Process;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.ImageView;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.p002lifecycle.Lifecycle;
import coil.memory.MemoryCache;
import coil.request.CachePolicy;
import coil.size.Precision;
import coil.size.Scale;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.dynamiclinks.DynamicLink;
import com.google.firebase.messaging.Constants;
import com.google.firebase.remoteconfig.RemoteConfigComponent;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import okhttp3.Headers;
import okhttp3.tls.internal.der.DerHeader;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000Â\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\bD\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0004\u008d\u0001\u008e\u0001B÷\u0002\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0001\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0012\u0012\u001c\u0010\u0013\u001a\u0018\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0015\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0016\u0018\u00010\u0014\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018\u0012\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a\u0012\u0006\u0010\u001c\u001a\u00020\u001d\u0012\u0006\u0010\u001e\u001a\u00020\u001f\u0012\u0006\u0010 \u001a\u00020!\u0012\u0006\u0010\"\u001a\u00020#\u0012\u0006\u0010$\u001a\u00020#\u0012\u0006\u0010%\u001a\u00020#\u0012\u0006\u0010&\u001a\u00020#\u0012\u0006\u0010'\u001a\u00020(\u0012\u0006\u0010)\u001a\u00020(\u0012\u0006\u0010*\u001a\u00020(\u0012\u0006\u0010+\u001a\u00020,\u0012\u0006\u0010-\u001a\u00020,\u0012\u0006\u0010.\u001a\u00020,\u0012\u0006\u0010/\u001a\u00020,\u0012\u0006\u00100\u001a\u000201\u0012\u0006\u00102\u001a\u000203\u0012\u0006\u00104\u001a\u000205\u0012\u0006\u00106\u001a\u000207\u0012\b\u00108\u001a\u0004\u0018\u00010\n\u0012\b\u00109\u001a\u0004\u0018\u00010:\u0012\b\u0010;\u001a\u0004\u0018\u00010<\u0012\b\u0010=\u001a\u0004\u0018\u00010:\u0012\b\u0010>\u001a\u0004\u0018\u00010<\u0012\b\u0010?\u001a\u0004\u0018\u00010:\u0012\b\u0010@\u001a\u0004\u0018\u00010<\u0012\u0006\u0010A\u001a\u00020B\u0012\u0006\u0010C\u001a\u00020D¢\u0006\u0004\bE\u0010FJ\u0014\u0010\u0088\u0001\u001a\u00030\u0089\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u0007J\u0015\u0010\u008a\u0001\u001a\u00020#2\t\u0010\u008b\u0001\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\t\u0010\u008c\u0001\u001a\u00020:H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bG\u0010HR\u0011\u0010\u0004\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\bI\u0010JR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\bK\u0010LR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\bM\u0010NR\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\bO\u0010PR\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\bQ\u0010RR\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\bS\u0010TR\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\b\n\u0000\u001a\u0004\bU\u0010VR\u0011\u0010\u0011\u001a\u00020\u0012¢\u0006\b\n\u0000\u001a\u0004\bW\u0010XR'\u0010\u0013\u001a\u0018\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0015\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0016\u0018\u00010\u0014¢\u0006\b\n\u0000\u001a\u0004\bY\u0010ZR\u0013\u0010\u0017\u001a\u0004\u0018\u00010\u0018¢\u0006\b\n\u0000\u001a\u0004\b[\u0010\\R\u0017\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a¢\u0006\b\n\u0000\u001a\u0004\b]\u0010^R\u0011\u0010\u001c\u001a\u00020\u001d¢\u0006\b\n\u0000\u001a\u0004\b_\u0010`R\u0011\u0010\u001e\u001a\u00020\u001f¢\u0006\b\n\u0000\u001a\u0004\ba\u0010bR\u0011\u0010 \u001a\u00020!¢\u0006\b\n\u0000\u001a\u0004\bc\u0010dR\u0011\u0010\"\u001a\u00020#¢\u0006\b\n\u0000\u001a\u0004\be\u0010fR\u0011\u0010$\u001a\u00020#¢\u0006\b\n\u0000\u001a\u0004\bg\u0010fR\u0011\u0010%\u001a\u00020#¢\u0006\b\n\u0000\u001a\u0004\bh\u0010fR\u0011\u0010&\u001a\u00020#¢\u0006\b\n\u0000\u001a\u0004\bi\u0010fR\u0011\u0010'\u001a\u00020(¢\u0006\b\n\u0000\u001a\u0004\bj\u0010kR\u0011\u0010)\u001a\u00020(¢\u0006\b\n\u0000\u001a\u0004\bl\u0010kR\u0011\u0010*\u001a\u00020(¢\u0006\b\n\u0000\u001a\u0004\bm\u0010kR\u0011\u0010+\u001a\u00020,¢\u0006\b\n\u0000\u001a\u0004\bn\u0010oR\u0011\u0010-\u001a\u00020,¢\u0006\b\n\u0000\u001a\u0004\bp\u0010oR\u0011\u0010.\u001a\u00020,¢\u0006\b\n\u0000\u001a\u0004\bq\u0010oR\u0011\u0010/\u001a\u00020,¢\u0006\b\n\u0000\u001a\u0004\br\u0010oR\u0011\u00100\u001a\u000201¢\u0006\b\n\u0000\u001a\u0004\bs\u0010tR\u0011\u00102\u001a\u000203¢\u0006\b\n\u0000\u001a\u0004\bu\u0010vR\u0011\u00104\u001a\u000205¢\u0006\b\n\u0000\u001a\u0004\bw\u0010xR\u0011\u00106\u001a\u000207¢\u0006\b\n\u0000\u001a\u0004\by\u0010zR\u0013\u00108\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b{\u0010PR\u0012\u00109\u001a\u0004\u0018\u00010:X\u0082\u0004¢\u0006\u0004\n\u0002\u0010|R\u0010\u0010;\u001a\u0004\u0018\u00010<X\u0082\u0004¢\u0006\u0002\n\u0000R\u0012\u0010=\u001a\u0004\u0018\u00010:X\u0082\u0004¢\u0006\u0004\n\u0002\u0010|R\u0010\u0010>\u001a\u0004\u0018\u00010<X\u0082\u0004¢\u0006\u0002\n\u0000R\u0012\u0010?\u001a\u0004\u0018\u00010:X\u0082\u0004¢\u0006\u0004\n\u0002\u0010|R\u0010\u0010@\u001a\u0004\u0018\u00010<X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010A\u001a\u00020B¢\u0006\b\n\u0000\u001a\u0004\b}\u0010~R\u0012\u0010C\u001a\u00020D¢\u0006\t\n\u0000\u001a\u0005\b\u007f\u0010\u0080\u0001R\u0016\u0010\u0081\u0001\u001a\u0004\u0018\u00010<8F¢\u0006\b\u001a\u0006\b\u0082\u0001\u0010\u0083\u0001R\u0016\u0010\u0084\u0001\u001a\u0004\u0018\u00010<8F¢\u0006\b\u001a\u0006\b\u0085\u0001\u0010\u0083\u0001R\u0016\u0010\u0086\u0001\u001a\u0004\u0018\u00010<8F¢\u0006\b\u001a\u0006\b\u0087\u0001\u0010\u0083\u0001¨\u0006\u008f\u0001"}, d2 = {"Lcoil/request/ImageRequest;", "", "context", "Landroid/content/Context;", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, TypedValues.AttributesType.S_TARGET, "Lcoil/target/Target;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lcoil/request/ImageRequest$Listener;", "memoryCacheKey", "Lcoil/memory/MemoryCache$Key;", "diskCacheKey", "", "bitmapConfig", "Landroid/graphics/Bitmap$Config;", "colorSpace", "Landroid/graphics/ColorSpace;", "precision", "Lcoil/size/Precision;", "fetcherFactory", "Lkotlin/Pair;", "Lcoil/fetch/Fetcher$Factory;", "Ljava/lang/Class;", "decoderFactory", "Lcoil/decode/Decoder$Factory;", "transformations", "", "Lcoil/transform/Transformation;", "transitionFactory", "Lcoil/transition/Transition$Factory;", "headers", "Lokhttp3/Headers;", "tags", "Lcoil/request/Tags;", "allowConversionToBitmap", "", "allowHardware", "allowRgb565", "premultipliedAlpha", "memoryCachePolicy", "Lcoil/request/CachePolicy;", "diskCachePolicy", "networkCachePolicy", "interceptorDispatcher", "Lkotlinx/coroutines/CoroutineDispatcher;", "fetcherDispatcher", "decoderDispatcher", "transformationDispatcher", "lifecycle", "Landroidx/lifecycle/Lifecycle;", "sizeResolver", "Lcoil/size/SizeResolver;", "scale", "Lcoil/size/Scale;", DynamicLink.Builder.KEY_DYNAMIC_LINK_PARAMETERS, "Lcoil/request/Parameters;", "placeholderMemoryCacheKey", "placeholderResId", "", "placeholderDrawable", "Landroid/graphics/drawable/Drawable;", "errorResId", "errorDrawable", "fallbackResId", "fallbackDrawable", "defined", "Lcoil/request/DefinedRequestOptions;", RemoteConfigComponent.DEFAULTS_FILE_NAME, "Lcoil/request/DefaultRequestOptions;", "<init>", "(Landroid/content/Context;Ljava/lang/Object;Lcoil/target/Target;Lcoil/request/ImageRequest$Listener;Lcoil/memory/MemoryCache$Key;Ljava/lang/String;Landroid/graphics/Bitmap$Config;Landroid/graphics/ColorSpace;Lcoil/size/Precision;Lkotlin/Pair;Lcoil/decode/Decoder$Factory;Ljava/util/List;Lcoil/transition/Transition$Factory;Lokhttp3/Headers;Lcoil/request/Tags;ZZZZLcoil/request/CachePolicy;Lcoil/request/CachePolicy;Lcoil/request/CachePolicy;Lkotlinx/coroutines/CoroutineDispatcher;Lkotlinx/coroutines/CoroutineDispatcher;Lkotlinx/coroutines/CoroutineDispatcher;Lkotlinx/coroutines/CoroutineDispatcher;Landroidx/lifecycle/Lifecycle;Lcoil/size/SizeResolver;Lcoil/size/Scale;Lcoil/request/Parameters;Lcoil/memory/MemoryCache$Key;Ljava/lang/Integer;Landroid/graphics/drawable/Drawable;Ljava/lang/Integer;Landroid/graphics/drawable/Drawable;Ljava/lang/Integer;Landroid/graphics/drawable/Drawable;Lcoil/request/DefinedRequestOptions;Lcoil/request/DefaultRequestOptions;)V", "getContext", "()Landroid/content/Context;", "getData", "()Ljava/lang/Object;", "getTarget", "()Lcoil/target/Target;", "getListener", "()Lcoil/request/ImageRequest$Listener;", "getMemoryCacheKey", "()Lcoil/memory/MemoryCache$Key;", "getDiskCacheKey", "()Ljava/lang/String;", "getBitmapConfig", "()Landroid/graphics/Bitmap$Config;", "getColorSpace", "()Landroid/graphics/ColorSpace;", "getPrecision", "()Lcoil/size/Precision;", "getFetcherFactory", "()Lkotlin/Pair;", "getDecoderFactory", "()Lcoil/decode/Decoder$Factory;", "getTransformations", "()Ljava/util/List;", "getTransitionFactory", "()Lcoil/transition/Transition$Factory;", "getHeaders", "()Lokhttp3/Headers;", "getTags", "()Lcoil/request/Tags;", "getAllowConversionToBitmap", "()Z", "getAllowHardware", "getAllowRgb565", "getPremultipliedAlpha", "getMemoryCachePolicy", "()Lcoil/request/CachePolicy;", "getDiskCachePolicy", "getNetworkCachePolicy", "getInterceptorDispatcher", "()Lkotlinx/coroutines/CoroutineDispatcher;", "getFetcherDispatcher", "getDecoderDispatcher", "getTransformationDispatcher", "getLifecycle", "()Landroidx/lifecycle/Lifecycle;", "getSizeResolver", "()Lcoil/size/SizeResolver;", "getScale", "()Lcoil/size/Scale;", "getParameters", "()Lcoil/request/Parameters;", "getPlaceholderMemoryCacheKey", "Ljava/lang/Integer;", "getDefined", "()Lcoil/request/DefinedRequestOptions;", "getDefaults", "()Lcoil/request/DefaultRequestOptions;", "placeholder", "getPlaceholder", "()Landroid/graphics/drawable/Drawable;", Constants.IPC_BUNDLE_KEY_SEND_ERROR, "getError", "fallback", "getFallback", "newBuilder", "Lcoil/request/ImageRequest$Builder;", "equals", "other", "hashCode", "Listener", "Builder", "coil-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class newUnratedRating {
    private final Context INotificationSideChannel;
    private final String INotificationSideChannelDefault;
    private final Pair<setMediaId.TuitionPaymentFragmentspecialinlinedviewModeldefault1<?>, Class<?>> INotificationSideChannelStub;
    private final CachePolicy INotificationSideChannelStubProxy;
    private final MemoryCache.Key IconCompatParcelizer;
    private final Headers MediaBrowserCompat;
    private final adjustVolume.TuitionPaymentFragmentbindingInflater1 MediaBrowserCompatCallbackHandler;
    private final RatingCompat RemoteActionCompatParcelizer;
    final Integer TuitionPaymentFragmentbindingInflater1;
    final MediaMetadataCompatApi21Builder TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    final Drawable TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    final Integer TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f1280a;
    private final Bitmap.Config asBinder;
    public final CoroutineDispatcher asInterface;
    final Drawable b;
    private final MediaBrowserCompatApi21MediaItem.TuitionPaymentFragmentspecialinlinedviewModeldefault2 cancel;
    private final ColorSpace cancelAll;
    private final b connect;
    private final boolean d;
    private final CachePolicy disconnect;
    private final boolean g;
    private final CachePolicy getExtras;
    private final CoroutineDispatcher getInterfaceDescriptor;
    private final Drawable getItem;
    private final MemoryCache.Key getNotifyChildrenChangedOptions;
    private final getRatingStyle getRoot;
    private final Integer getServiceComponent;
    private final Precision getSessionToken;
    private final List<IMediaControllerCallbackStub> handleMessage;
    private final onSessionReady isConnected;
    private final CoroutineDispatcher notify;
    private final Object onTransact;
    private final CoroutineDispatcher read;
    private final Scale search;
    private final boolean sendCustomAction;
    private final onShuffleModeChangedRemoved subscribe;
    private final IMediaControllerCallback unsubscribe;
    private final Lifecycle write;

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\bf\u0018\u00002\u00020\u0001ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0003"}, d2 = {"LnewUnratedRating$b;", ""}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface b {
    }

    /* JADX WARN: Multi-variable type inference failed */
    private newUnratedRating(Context context, Object obj, onShuffleModeChangedRemoved onshufflemodechangedremoved, b bVar, MemoryCache.Key key, String str, Bitmap.Config config, ColorSpace colorSpace, Precision precision, Pair<? extends setMediaId.TuitionPaymentFragmentspecialinlinedviewModeldefault1<?>, ? extends Class<?>> pair, MediaBrowserCompatApi21MediaItem.TuitionPaymentFragmentspecialinlinedviewModeldefault2 tuitionPaymentFragmentspecialinlinedviewModeldefault2, List<? extends IMediaControllerCallbackStub> list, adjustVolume.TuitionPaymentFragmentbindingInflater1 tuitionPaymentFragmentbindingInflater1, Headers headers, IMediaControllerCallback iMediaControllerCallback, boolean z, boolean z2, boolean z3, boolean z4, CachePolicy cachePolicy, CachePolicy cachePolicy2, CachePolicy cachePolicy3, CoroutineDispatcher coroutineDispatcher, CoroutineDispatcher coroutineDispatcher2, CoroutineDispatcher coroutineDispatcher3, CoroutineDispatcher coroutineDispatcher4, Lifecycle lifecycle, onSessionReady onsessionready, Scale scale, getRatingStyle getratingstyle, MemoryCache.Key key2, Integer num, Drawable drawable, Integer num2, Drawable drawable2, Integer num3, Drawable drawable3, RatingCompat ratingCompat, MediaMetadataCompatApi21Builder mediaMetadataCompatApi21Builder) {
        this.INotificationSideChannel = context;
        this.onTransact = obj;
        this.subscribe = onshufflemodechangedremoved;
        this.connect = bVar;
        this.IconCompatParcelizer = key;
        this.INotificationSideChannelDefault = str;
        this.asBinder = config;
        this.cancelAll = colorSpace;
        this.getSessionToken = precision;
        this.INotificationSideChannelStub = pair;
        this.cancel = tuitionPaymentFragmentspecialinlinedviewModeldefault2;
        this.handleMessage = list;
        this.MediaBrowserCompatCallbackHandler = tuitionPaymentFragmentbindingInflater1;
        this.MediaBrowserCompat = headers;
        this.unsubscribe = iMediaControllerCallback;
        this.g = z;
        this.f1280a = z2;
        this.d = z3;
        this.sendCustomAction = z4;
        this.disconnect = cachePolicy;
        this.INotificationSideChannelStubProxy = cachePolicy2;
        this.getExtras = cachePolicy3;
        this.read = coroutineDispatcher;
        this.getInterfaceDescriptor = coroutineDispatcher2;
        this.notify = coroutineDispatcher3;
        this.asInterface = coroutineDispatcher4;
        this.write = lifecycle;
        this.isConnected = onsessionready;
        this.search = scale;
        this.getRoot = getratingstyle;
        this.getNotifyChildrenChangedOptions = key2;
        this.getServiceComponent = num;
        this.getItem = drawable;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = num2;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = drawable2;
        this.TuitionPaymentFragmentbindingInflater1 = num3;
        this.b = drawable3;
        this.RemoteActionCompatParcelizer = ratingCompat;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = mediaMetadataCompatApi21Builder;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final Context getINotificationSideChannel() {
        return this.INotificationSideChannel;
    }

    @Metadata(d1 = {"\u0000Ü\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u001b\b\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\bJ\u0019\u0010\t\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001H\u0007¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\f\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u000bH\u0007¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\t\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u000eH\u0007¢\u0006\u0004\b\t\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\f\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\f\u0010\u0013J\u000f\u0010\t\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\t\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001b\u001a\u00020\u001aH\u0002¢\u0006\u0004\b\u001b\u0010\u001cR\u0014\u0010\t\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0016\u0010\u001b\u001a\u00020\u000e8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u00018\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b!\u0010\"R\u0018\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b#\u0010$R\u0018\u0010\u0015\u001a\u0004\u0018\u00010%8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b&\u0010'R\u0018\u0010+\u001a\u0004\u0018\u00010(8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b)\u0010*R\u0018\u0010!\u001a\u0004\u0018\u00010,8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b-\u0010.R\u0018\u00101\u001a\u0004\u0018\u00010/8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0018\u00100R\u0018\u0010\u0018\u001a\u0004\u0018\u0001028\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b+\u00103R\u0018\u0010\u001d\u001a\u0004\u0018\u0001048\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\f\u00105R,\u0010;\u001a\u0018\u0012\b\u0012\u0006\u0012\u0002\b\u000307\u0012\b\u0012\u0006\u0012\u0002\b\u000308\u0018\u0001068\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b9\u0010:R\u0018\u0010\u001f\u001a\u0004\u0018\u00010<8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b;\u0010=R\u001c\u0010B\u001a\b\u0012\u0004\u0012\u00020?0>8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b@\u0010AR\u0018\u0010-\u001a\u0004\u0018\u00010C8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bD\u0010ER\u0018\u0010I\u001a\u0004\u0018\u00010F8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bG\u0010HR(\u0010M\u001a\u0014\u0012\b\u0012\u0006\u0012\u0002\b\u000308\u0012\u0004\u0012\u00020\u0001\u0018\u00010J8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bK\u0010LR\u0016\u0010P\u001a\u00020N8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010OR\u0018\u0010R\u001a\u0004\u0018\u00010N8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\t\u0010QR\u0018\u0010S\u001a\u0004\u0018\u00010N8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b1\u0010QR\u0016\u0010U\u001a\u00020N8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bT\u0010OR\u0018\u0010&\u001a\u0004\u0018\u00010V8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bW\u0010XR\u0018\u00109\u001a\u0004\u0018\u00010V8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bI\u0010XR\u0018\u0010G\u001a\u0004\u0018\u00010V8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bY\u0010XR\u0018\u0010[\u001a\u0004\u0018\u00010Z8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b[\u0010\\R\u0018\u0010]\u001a\u0004\u0018\u00010Z8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bM\u0010\\R\u0018\u0010W\u001a\u0004\u0018\u00010Z8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bB\u0010\\R\u0018\u0010Y\u001a\u0004\u0018\u00010Z8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b^\u0010\\R\u0018\u0010)\u001a\u0004\u0018\u00010_8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b`\u0010aR\u0018\u0010c\u001a\u0004\u0018\u00010(8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bb\u0010*R\u0018\u0010`\u001a\u0004\u0018\u00010d8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\be\u0010fR\u0018\u0010b\u001a\u0004\u0018\u00010g8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bc\u0010hR\u0018\u0010i\u001a\u0004\u0018\u00010d8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bS\u0010fR\u0018\u0010T\u001a\u0004\u0018\u00010g8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bR\u0010hR\u0018\u0010e\u001a\u0004\u0018\u00010d8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bP\u0010fR\u0018\u0010j\u001a\u0004\u0018\u00010g8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bU\u0010hR\u0018\u0010@\u001a\u0004\u0018\u00010\u00148\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b]\u0010kR\u0018\u0010#\u001a\u0004\u0018\u00010\u00178\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010lR\u0018\u0010^\u001a\u0004\u0018\u00010\u001a8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010mR\u0018\u0010n\u001a\u0004\u0018\u00010\u00148\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bi\u0010kR\u0018\u0010K\u001a\u0004\u0018\u00010\u00178\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bn\u0010lR\u0018\u0010o\u001a\u0004\u0018\u00010\u001a8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bj\u0010m"}, d2 = {"LnewUnratedRating$TuitionPaymentFragmentspecialinlinedviewModeldefault1;", "", "Landroid/content/Context;", "p0", "<init>", "(Landroid/content/Context;)V", "LnewUnratedRating;", "p1", "(LnewUnratedRating;Landroid/content/Context;)V", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "(Ljava/lang/Object;)LnewUnratedRating$TuitionPaymentFragmentspecialinlinedviewModeldefault1;", "LonShuffleModeChangedRemoved;", "TuitionPaymentFragmentbindingInflater1", "(LonShuffleModeChangedRemoved;)LnewUnratedRating$TuitionPaymentFragmentspecialinlinedviewModeldefault1;", "LMediaMetadataCompatApi21Builder;", "(LMediaMetadataCompatApi21Builder;)LnewUnratedRating$TuitionPaymentFragmentspecialinlinedviewModeldefault1;", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "()LnewUnratedRating;", "", "()V", "Landroidx/lifecycle/Lifecycle;", "b", "()Landroidx/lifecycle/Lifecycle;", "LonSessionReady;", "a", "()LonSessionReady;", "Lcoil/size/Scale;", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "()Lcoil/size/Scale;", "g", "Landroid/content/Context;", "notify", "LMediaMetadataCompatApi21Builder;", "d", "Ljava/lang/Object;", "handleMessage", "LonShuffleModeChangedRemoved;", "LnewUnratedRating$b;", "read", "LnewUnratedRating$b;", "Lcoil/memory/MemoryCache$Key;", "getItem", "Lcoil/memory/MemoryCache$Key;", "asBinder", "", "INotificationSideChannel", "Ljava/lang/String;", "Landroid/graphics/Bitmap$Config;", "Landroid/graphics/Bitmap$Config;", "asInterface", "Landroid/graphics/ColorSpace;", "Landroid/graphics/ColorSpace;", "Lcoil/size/Precision;", "Lcoil/size/Precision;", "Lkotlin/Pair;", "LsetMediaId$TuitionPaymentFragmentspecialinlinedviewModeldefault1;", "Ljava/lang/Class;", "MediaBrowserCompat", "Lkotlin/Pair;", "onTransact", "LMediaBrowserCompatApi21MediaItem$TuitionPaymentFragmentspecialinlinedviewModeldefault2;", "LMediaBrowserCompatApi21MediaItem$TuitionPaymentFragmentspecialinlinedviewModeldefault2;", "", "LIMediaControllerCallbackStub;", "subscribe", "Ljava/util/List;", "cancel", "LadjustVolume$TuitionPaymentFragmentbindingInflater1;", "onConnectionSuspended", "LadjustVolume$TuitionPaymentFragmentbindingInflater1;", "Lokhttp3/Headers$Builder;", "connect", "Lokhttp3/Headers$Builder;", "cancelAll", "", "unsubscribe", "Ljava/util/Map;", "INotificationSideChannelStub", "", "Z", "getInterfaceDescriptor", "Ljava/lang/Boolean;", "RemoteActionCompatParcelizer", "INotificationSideChannelDefault", "getSessionToken", "INotificationSideChannelStubProxy", "Lcoil/request/CachePolicy;", "disconnect", "Lcoil/request/CachePolicy;", "getRoot", "Lkotlinx/coroutines/CoroutineDispatcher;", "write", "Lkotlinx/coroutines/CoroutineDispatcher;", "IconCompatParcelizer", "MediaBrowserCompatCallbackHandler", "LgetRatingStyle$TuitionPaymentFragmentbindingInflater1;", "getNotifyChildrenChangedOptions", "LgetRatingStyle$TuitionPaymentFragmentbindingInflater1;", "isConnected", "getExtras", "", "getServiceComponent", "Ljava/lang/Integer;", "Landroid/graphics/drawable/Drawable;", "Landroid/graphics/drawable/Drawable;", "sendCustomAction", FirebaseAnalytics.Event.SEARCH, "Landroidx/lifecycle/Lifecycle;", "LonSessionReady;", "Lcoil/size/Scale;", "setCallbacksMessenger", "onConnected"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class TuitionPaymentFragmentspecialinlinedviewModeldefault1 {

        /* JADX INFO: renamed from: INotificationSideChannel, reason: from kotlin metadata */
        private String d;

        /* JADX INFO: renamed from: INotificationSideChannelDefault, reason: from kotlin metadata */
        private Integer sendCustomAction;

        /* JADX INFO: renamed from: INotificationSideChannelStub, reason: from kotlin metadata */
        private CoroutineDispatcher IconCompatParcelizer;

        /* JADX INFO: renamed from: INotificationSideChannelStubProxy, reason: from kotlin metadata */
        private Drawable search;

        /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
        private Lifecycle subscribe;

        /* JADX INFO: renamed from: MediaBrowserCompat, reason: from kotlin metadata */
        private Pair<? extends setMediaId.TuitionPaymentFragmentspecialinlinedviewModeldefault1<?>, ? extends Class<?>> onTransact;

        /* JADX INFO: renamed from: MediaBrowserCompatCallbackHandler, reason: from kotlin metadata */
        private CoroutineDispatcher getRoot;

        /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
        private Drawable getSessionToken;

        /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
        public Precision g;

        /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
        private boolean getInterfaceDescriptor;

        /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
        private Boolean RemoteActionCompatParcelizer;

        /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
        public Scale MediaBrowserCompatCallbackHandler;

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private Bitmap.Config asInterface;

        /* JADX INFO: renamed from: asBinder, reason: from kotlin metadata */
        private ColorSpace a;

        /* JADX INFO: renamed from: asInterface, reason: from kotlin metadata */
        private Boolean INotificationSideChannelDefault;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        public onSessionReady handleMessage;

        /* JADX INFO: renamed from: cancel, reason: from kotlin metadata */
        private CoroutineDispatcher disconnect;

        /* JADX INFO: renamed from: cancelAll, reason: from kotlin metadata */
        private CachePolicy MediaBrowserCompat;

        /* JADX INFO: renamed from: connect, reason: from kotlin metadata */
        private Headers.Builder cancelAll;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private Object TuitionPaymentFragmentspecialinlinedviewModeldefault1;

        /* JADX INFO: renamed from: disconnect, reason: from kotlin metadata */
        private CachePolicy read;

        /* JADX INFO: renamed from: g, reason: from kotlin metadata */
        private final Context TuitionPaymentFragmentspecialinlinedviewModeldefault2;

        /* JADX INFO: renamed from: getExtras, reason: from kotlin metadata */
        private Drawable isConnected;

        /* JADX INFO: renamed from: getInterfaceDescriptor, reason: from kotlin metadata */
        private Integer getServiceComponent;

        /* JADX INFO: renamed from: getItem, reason: from kotlin metadata */
        private MemoryCache.Key asBinder;

        /* JADX INFO: renamed from: getNotifyChildrenChangedOptions, reason: from kotlin metadata */
        private getRatingStyle.TuitionPaymentFragmentbindingInflater1 getItem;

        /* JADX INFO: renamed from: getRoot, reason: from kotlin metadata */
        private CachePolicy connect;

        /* JADX INFO: renamed from: getServiceComponent, reason: from kotlin metadata */
        private Integer getNotifyChildrenChangedOptions;

        /* JADX INFO: renamed from: getSessionToken, reason: from kotlin metadata */
        private boolean INotificationSideChannelStubProxy;

        /* JADX INFO: renamed from: handleMessage, reason: from kotlin metadata */
        private onShuffleModeChangedRemoved TuitionPaymentFragmentbindingInflater1;

        /* JADX INFO: renamed from: isConnected, reason: from kotlin metadata */
        private MemoryCache.Key getExtras;

        /* JADX INFO: renamed from: notify, reason: from kotlin metadata */
        private MediaMetadataCompatApi21Builder TuitionPaymentFragmentspecialinlinedviewModeldefault3;

        /* JADX INFO: renamed from: onConnectionSuspended, reason: from kotlin metadata */
        private adjustVolume.TuitionPaymentFragmentbindingInflater1 INotificationSideChannel;

        /* JADX INFO: renamed from: onTransact, reason: from kotlin metadata */
        private MediaBrowserCompatApi21MediaItem.TuitionPaymentFragmentspecialinlinedviewModeldefault2 notify;

        /* JADX INFO: renamed from: read, reason: from kotlin metadata */
        private b b;

        /* JADX INFO: renamed from: search, reason: from kotlin metadata */
        private Scale onConnected;

        /* JADX INFO: renamed from: sendCustomAction, reason: from kotlin metadata */
        private Lifecycle setCallbacksMessenger;

        /* JADX INFO: renamed from: setCallbacksMessenger, reason: from kotlin metadata */
        private onSessionReady unsubscribe;

        /* JADX INFO: renamed from: subscribe, reason: from kotlin metadata */
        private List<? extends IMediaControllerCallbackStub> cancel;

        /* JADX INFO: renamed from: unsubscribe, reason: from kotlin metadata */
        private Map<Class<?>, Object> INotificationSideChannelStub;
        private CoroutineDispatcher write;
        private static final byte[] $$c = {29, -5, -24, -13};
        private static final int $$f = 25;
        private static int $10 = 0;
        private static int $11 = 1;
        private static final byte[] $$d = {30, 17, -35, 104, 39, -36, 39, 10, 16, -19, 42, -5, 22, 8, -6, 7, -25, 38, 19, 8, -2, 7, 10, 16, -20, 39, -36, 39, 10, 16, -19, 42, -5, 22, 8, -6, 7, -23, 57, -9, 17, 14, -36, 33, 21, -2, 16, 1, 21, 41, -4, 19, -3, 14, 7, -22, 25, 32, -4, 0, 17, 14, -38, 52, -9, 14, 14, 0, 17, 14, -10, 15, 13, -2, 13, 13, 1, -22, 45, 0, 14, -3, 27, -7, 21, -57};
        private static final int $$e = 111;
        private static final byte[] $$a = {21, -108, 100, 114, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -55, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -54, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, -7, 18, 16, 1, 16, 16, 4, -19, 48, 3, 17, 0, 30, -4, 24, -54};
        private static final int $$b = 242;
        private static int onConnectionFailed = 0;
        private static int setInternalConnectionCallback = 1;
        private static long MediaBrowserCompatConnectionCallback = -2680613623514443294L;

        /* JADX WARN: Code duplicated, block: B:10:0x0028  */
        /* JADX WARN: Code duplicated, block: B:8:0x0020  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:11:0x0031). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0028
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        private static void c(int r6, short r7, byte r8, java.lang.Object[] r9) {
            /*
                byte[] r0 = newUnratedRating.TuitionPaymentFragmentspecialinlinedviewModeldefault1.$$a
                int r6 = r6 * 2
                int r6 = r6 + 84
                int r8 = r8 * 15
                int r1 = r8 + 38
                int r7 = r7 * 52
                int r7 = 107 - r7
                byte[] r1 = new byte[r1]
                int r8 = r8 + 37
                r2 = 0
                if (r0 != 0) goto L18
                r3 = r7
                r4 = r2
                goto L31
            L18:
                r3 = r2
            L19:
                byte r4 = (byte) r6
                r1[r3] = r4
                int r7 = r7 + 1
                if (r3 != r8) goto L28
                java.lang.String r6 = new java.lang.String
                r6.<init>(r1, r2)
                r9[r2] = r6
                return
            L28:
                int r3 = r3 + 1
                r4 = r0[r7]
                r5 = r7
                r7 = r6
                r6 = r4
                r4 = r3
                r3 = r5
            L31:
                int r7 = r7 + r6
                int r6 = r7 + (-11)
                r7 = r3
                r3 = r4
                goto L19
            */
            throw new UnsupportedOperationException("Method not decompiled: newUnratedRating.TuitionPaymentFragmentspecialinlinedviewModeldefault1.c(int, short, byte, java.lang.Object[]):void");
        }

        /* JADX WARN: Code duplicated, block: B:10:0x0027  */
        /* JADX WARN: Code duplicated, block: B:8:0x001f  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x0030). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0027
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        private static void f(byte r6, byte r7, byte r8, java.lang.Object[] r9) {
            /*
                int r6 = r6 * 5
                int r6 = 84 - r6
                byte[] r0 = newUnratedRating.TuitionPaymentFragmentspecialinlinedviewModeldefault1.$$d
                int r7 = r7 * 45
                int r7 = 48 - r7
                int r8 = r8 * 8
                int r1 = 46 - r8
                byte[] r1 = new byte[r1]
                int r8 = 45 - r8
                r2 = 0
                if (r0 != 0) goto L19
                r6 = r7
                r4 = r8
                r3 = r2
                goto L30
            L19:
                r3 = r2
            L1a:
                byte r4 = (byte) r6
                r1[r3] = r4
                if (r3 != r8) goto L27
                java.lang.String r6 = new java.lang.String
                r6.<init>(r1, r2)
                r9[r2] = r6
                return
            L27:
                int r7 = r7 + 1
                int r3 = r3 + 1
                r4 = r0[r7]
                r5 = r7
                r7 = r6
                r6 = r5
            L30:
                int r7 = r7 + r4
                int r7 = r7 + (-8)
                r5 = r7
                r7 = r6
                r6 = r5
                goto L1a
            */
            throw new UnsupportedOperationException("Method not decompiled: newUnratedRating.TuitionPaymentFragmentspecialinlinedviewModeldefault1.f(byte, byte, byte, java.lang.Object[]):void");
        }

        private static void e(char[] cArr, int i, Object[] objArr) throws Throwable {
            int i2 = 2 % 2;
            abortCapture abortcapture = new abortCapture();
            char[] cArrB = abortCapture.b(MediaBrowserCompatConnectionCallback ^ (-2687588926731523482L), cArr, i);
            abortcapture.b = 4;
            while (abortcapture.b < cArrB.length) {
                int i3 = $10 + 45;
                $11 = i3 % 128;
                int i4 = i3 % 2;
                abortcapture.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = abortcapture.b - 4;
                int i5 = abortcapture.b;
                try {
                    Object[] objArr2 = {Long.valueOf(cArrB[abortcapture.b] ^ cArrB[abortcapture.b % 4]), Long.valueOf(abortcapture.TuitionPaymentFragmentspecialinlinedviewModeldefault1), Long.valueOf(MediaBrowserCompatConnectionCallback)};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-774687567);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        byte b = (byte) 0;
                        byte b2 = b;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (64838 - (ViewConfiguration.getWindowTouchSlop() >> 8)), 1356 - (ViewConfiguration.getScrollDefaultDelay() >> 16), (ViewConfiguration.getPressedStateDuration() >> 16) + 38, 894276454, false, $$g(b, b2, b2), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                    }
                    cArrB[i5] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                    Object[] objArr3 = {abortcapture, abortcapture};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-772308768);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (TextUtils.lastIndexOf("", '0') + 47774), 468 - ExpandableListView.getPackedPositionType(0L), Color.alpha(0) + 13, 896083767, false, "n", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3);
                    int i6 = $10 + 103;
                    $11 = i6 % 128;
                    int i7 = i6 % 2;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            objArr[0] = new String(cArrB, 4, cArrB.length - 4);
        }

        public TuitionPaymentFragmentspecialinlinedviewModeldefault1(Context context) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = context;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = getQueueTitle.TuitionPaymentFragmentbindingInflater1();
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = null;
            this.TuitionPaymentFragmentbindingInflater1 = null;
            this.b = null;
            this.asBinder = null;
            this.d = null;
            this.asInterface = null;
            if (Build.VERSION.SDK_INT >= 26) {
                this.a = null;
                int i = onConnectionFailed + 7;
                setInternalConnectionCallback = i % 128;
                if (i % 2 != 0) {
                    int i2 = 2 % 2;
                }
            }
            this.g = null;
            this.onTransact = null;
            this.notify = null;
            this.cancel = CollectionsKt.emptyList();
            this.INotificationSideChannel = null;
            this.cancelAll = null;
            this.INotificationSideChannelStub = null;
            this.getInterfaceDescriptor = true;
            this.RemoteActionCompatParcelizer = null;
            this.INotificationSideChannelDefault = null;
            this.INotificationSideChannelStubProxy = true;
            this.read = null;
            this.MediaBrowserCompat = null;
            this.connect = null;
            this.write = null;
            this.IconCompatParcelizer = null;
            this.disconnect = null;
            this.getRoot = null;
            this.getItem = null;
            this.getExtras = null;
            this.getNotifyChildrenChangedOptions = null;
            this.isConnected = null;
            this.sendCustomAction = null;
            this.getSessionToken = null;
            this.getServiceComponent = null;
            this.search = null;
            this.subscribe = null;
            this.handleMessage = null;
            this.MediaBrowserCompatCallbackHandler = null;
            this.setCallbacksMessenger = null;
            this.unsubscribe = null;
            this.onConnected = null;
            int i3 = setInternalConnectionCallback + 51;
            onConnectionFailed = i3 % 128;
            if (i3 % 2 != 0) {
                throw null;
            }
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public /* synthetic */ TuitionPaymentFragmentspecialinlinedviewModeldefault1(newUnratedRating newunratedrating, Context context, int i, DefaultConstructorMarker defaultConstructorMarker) {
            if ((i & 2) != 0) {
                int i2 = setInternalConnectionCallback + 77;
                onConnectionFailed = i2 % 128;
                if (i2 % 2 != 0) {
                    newunratedrating.getINotificationSideChannel();
                    throw null;
                }
                context = newunratedrating.getINotificationSideChannel();
                int i3 = onConnectionFailed + 77;
                setInternalConnectionCallback = i3 % 128;
                int i4 = i3 % 2;
                int i5 = 2 % 2;
            }
            this(newunratedrating, context);
        }

        public TuitionPaymentFragmentspecialinlinedviewModeldefault1(newUnratedRating newunratedrating, Context context) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = context;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = newunratedrating.getTuitionPaymentFragmentspecialinlinedviewModeldefault1();
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = newunratedrating.getOnTransact();
            this.TuitionPaymentFragmentbindingInflater1 = newunratedrating.getSubscribe();
            this.b = newunratedrating.getConnect();
            this.asBinder = newunratedrating.getIconCompatParcelizer();
            this.d = newunratedrating.getINotificationSideChannelDefault();
            this.asInterface = newunratedrating.getRemoteActionCompatParcelizer().getG();
            if (Build.VERSION.SDK_INT >= 26) {
                this.a = newunratedrating.getCancelAll();
                int i = onConnectionFailed + 125;
                setInternalConnectionCallback = i % 128;
                if (i % 2 != 0) {
                    int i2 = 2 % 2;
                }
            }
            this.g = newunratedrating.getRemoteActionCompatParcelizer().getD();
            this.onTransact = newunratedrating.INotificationSideChannelStub();
            this.notify = newunratedrating.getCancel();
            this.cancel = newunratedrating.sendCustomAction();
            this.INotificationSideChannel = newunratedrating.getRemoteActionCompatParcelizer().getA();
            this.cancelAll = newunratedrating.getMediaBrowserCompat().newBuilder();
            this.INotificationSideChannelStub = MapsKt.toMutableMap(newunratedrating.getUnsubscribe().b());
            this.getInterfaceDescriptor = newunratedrating.getG();
            this.RemoteActionCompatParcelizer = newunratedrating.getRemoteActionCompatParcelizer().getCancel();
            this.INotificationSideChannelDefault = newunratedrating.getRemoteActionCompatParcelizer().getCancelAll();
            this.INotificationSideChannelStubProxy = newunratedrating.getSendCustomAction();
            this.read = newunratedrating.getRemoteActionCompatParcelizer().getNotify();
            this.MediaBrowserCompat = newunratedrating.getRemoteActionCompatParcelizer().getINotificationSideChannel();
            this.connect = newunratedrating.getRemoteActionCompatParcelizer().getOnTransact();
            this.write = newunratedrating.getRemoteActionCompatParcelizer().getTuitionPaymentFragmentbindingInflater1();
            this.IconCompatParcelizer = newunratedrating.getRemoteActionCompatParcelizer().getTuitionPaymentFragmentspecialinlinedviewModeldefault2();
            this.disconnect = newunratedrating.getRemoteActionCompatParcelizer().getAsBinder();
            this.getRoot = newunratedrating.getRemoteActionCompatParcelizer().getAsInterface();
            this.getItem = newunratedrating.getGetRoot().TuitionPaymentFragmentspecialinlinedviewModeldefault2();
            this.getExtras = newunratedrating.getGetNotifyChildrenChangedOptions();
            this.getNotifyChildrenChangedOptions = newunratedrating.getServiceComponent;
            this.isConnected = newunratedrating.getItem;
            this.sendCustomAction = newunratedrating.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            this.getSessionToken = newunratedrating.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            this.getServiceComponent = newunratedrating.TuitionPaymentFragmentbindingInflater1;
            this.search = newunratedrating.b;
            this.subscribe = newunratedrating.getRemoteActionCompatParcelizer().getB();
            this.handleMessage = newunratedrating.getRemoteActionCompatParcelizer().getTuitionPaymentFragmentspecialinlinedviewModeldefault3();
            this.MediaBrowserCompatCallbackHandler = newunratedrating.getRemoteActionCompatParcelizer().getTuitionPaymentFragmentspecialinlinedviewModeldefault1();
            if (newunratedrating.getINotificationSideChannel() != context) {
                this.setCallbacksMessenger = null;
                this.unsubscribe = null;
                this.onConnected = null;
                return;
            }
            int i3 = onConnectionFailed + 37;
            setInternalConnectionCallback = i3 % 128;
            if (i3 % 2 != 0) {
                this.setCallbacksMessenger = newunratedrating.getWrite();
                this.unsubscribe = newunratedrating.getIsConnected();
                this.onConnected = newunratedrating.getSearch();
            } else {
                this.setCallbacksMessenger = newunratedrating.getWrite();
                this.unsubscribe = newunratedrating.getIsConnected();
                this.onConnected = newunratedrating.getSearch();
                int i4 = 44 / 0;
            }
        }

        public final TuitionPaymentFragmentspecialinlinedviewModeldefault1 TuitionPaymentFragmentspecialinlinedviewModeldefault2(Object p0) {
            int i = 2 % 2;
            int i2 = onConnectionFailed + 15;
            int i3 = i2 % 128;
            setInternalConnectionCallback = i3;
            if (i2 % 2 == 0) {
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = p0;
                int i4 = 1 / 0;
            } else {
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = p0;
            }
            int i5 = i3 + 1;
            onConnectionFailed = i5 % 128;
            int i6 = i5 % 2;
            return this;
        }

        public final TuitionPaymentFragmentspecialinlinedviewModeldefault1 TuitionPaymentFragmentbindingInflater1(onShuffleModeChangedRemoved p0) {
            int i = 2 % 2;
            int i2 = setInternalConnectionCallback + 101;
            onConnectionFailed = i2 % 128;
            if (i2 % 2 != 0) {
                this.TuitionPaymentFragmentbindingInflater1 = p0;
                TuitionPaymentFragmentbindingInflater1();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            this.TuitionPaymentFragmentbindingInflater1 = p0;
            TuitionPaymentFragmentbindingInflater1();
            int i3 = setInternalConnectionCallback + 95;
            onConnectionFailed = i3 % 128;
            int i4 = i3 % 2;
            return this;
        }

        public final TuitionPaymentFragmentspecialinlinedviewModeldefault1 TuitionPaymentFragmentspecialinlinedviewModeldefault2(MediaMetadataCompatApi21Builder p0) {
            int i = 2 % 2;
            int i2 = setInternalConnectionCallback + 119;
            onConnectionFailed = i2 % 128;
            int i3 = i2 % 2;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = p0;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2();
            int i4 = setInternalConnectionCallback + 111;
            onConnectionFailed = i4 % 128;
            if (i4 % 2 == 0) {
                return this;
            }
            throw null;
        }

        public final newUnratedRating TuitionPaymentFragmentspecialinlinedviewModeldefault1() throws Throwable {
            Object[] objArr;
            IMediaControllerCallback iMediaControllerCallbackTuitionPaymentFragmentspecialinlinedviewModeldefault1;
            getRatingStyle getratingstyle;
            boolean zTuitionPaymentFragmentspecialinlinedviewModeldefault1;
            int i = 2 % 2;
            Context context = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            Object obj = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            Object obj2 = null;
            if (obj == null) {
                int i2 = setInternalConnectionCallback + 17;
                onConnectionFailed = i2 % 128;
                if (i2 % 2 != 0) {
                    hasHeart hasheart = hasHeart.INSTANCE;
                    obj2.hashCode();
                    throw null;
                }
                obj = hasHeart.INSTANCE;
            }
            Object obj3 = obj;
            onShuffleModeChangedRemoved onshufflemodechangedremoved = this.TuitionPaymentFragmentbindingInflater1;
            b bVar = this.b;
            MemoryCache.Key key = this.asBinder;
            String str = this.d;
            Bitmap.Config configTuitionPaymentFragmentspecialinlinedviewModeldefault2 = this.asInterface;
            if (configTuitionPaymentFragmentspecialinlinedviewModeldefault2 == null) {
                int i3 = onConnectionFailed + 51;
                setInternalConnectionCallback = i3 % 128;
                if (i3 % 2 == 0) {
                    this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getD();
                    obj2.hashCode();
                    throw null;
                }
                configTuitionPaymentFragmentspecialinlinedviewModeldefault2 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getD();
            }
            Bitmap.Config config = configTuitionPaymentFragmentspecialinlinedviewModeldefault2;
            ColorSpace colorSpace = this.a;
            Precision precisionCancelAll = this.g;
            if (precisionCancelAll == null) {
                precisionCancelAll = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getA();
            }
            Precision precision = precisionCancelAll;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1354724972);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                char c = (char) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 43041);
                int doubleTapTimeout = 3111 - (ViewConfiguration.getDoubleTapTimeout() >> 16);
                int i4 = 22 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                byte[] bArr = $$a;
                Object[] objArr2 = new Object[1];
                c(bArr[7], bArr[37], bArr[132], objArr2);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(c, doubleTapTimeout, i4, -1272852037, false, (String) objArr2[0], null);
            }
            long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
            Object[] objArr3 = new Object[1];
            e(new char[]{63357, 34662, 63260, 31531, 50144, 15500, 3143, 61726, 6402, 11931, 7767, 58194, 11058, 4273, 10285, 52511, 15668, 673, 14951, 16185, 20304, 62689, 21519, 10563, 20814, 59097}, 1 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), objArr3);
            Class<?> cls = Class.forName((String) objArr3[0]);
            Object[] objArr4 = new Object[1];
            e(new char[]{16525, 37265, 16616, 5630, 49286, 10873, 25239, 62074, 44782, 14432, 28802, 57416, 40136, 1620, 18106, 52830, 35540, 5192, 21667}, ViewConfiguration.getMaximumDrawingCacheSize() >> 24, objArr4);
            long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1355648493);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                char cLastIndexOf = (char) (TextUtils.lastIndexOf("", '0', 0, 0) + 43043);
                int maximumFlingVelocity = (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 3111;
                int gidForName = 21 - Process.getGidForName("");
                byte[] bArr2 = $$a;
                byte b = bArr2[7];
                byte b2 = bArr2[132];
                Object[] objArr5 = new Object[1];
                c(b, b2, b2, objArr5);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cLastIndexOf, maximumFlingVelocity, gidForName, -1269618118, false, (String) objArr5[0], null);
            }
            if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-308143642);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    char offsetAfter = (char) (43042 - TextUtils.getOffsetAfter("", 0));
                    int i5 = 3112 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1));
                    int iAxisFromString = MotionEvent.axisFromString("") + 23;
                    byte b3 = $$a[7];
                    byte b4 = b3;
                    Object[] objArr6 = new Object[1];
                    c(b3, b4, b4, objArr6);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(offsetAfter, i5, iAxisFromString, 154975793, false, (String) objArr6[0], null);
                }
                Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
                int i6 = ((int[]) objArr7[2])[0];
                int i7 = ((int[]) objArr7[1])[0];
                String[] strArr = (String[]) objArr7[3];
                int[] iArr = {i7};
                int i8 = ~System.identityHashCode(this);
                int i9 = (((1950674762 + ((~(1033891578 | i8)) * 52)) + (((~(1015344824 | i8)) | ((~((-689686635) | i8)) | 18546754)) * (-52))) + (((~(i8 | (-1015344825))) | 344204944) * 52)) - 27206408;
                int i10 = (i9 << 13) ^ i9;
                int i11 = i10 ^ (i10 >>> 17);
                ((int[]) objArr[0])[0] = i11 ^ (i11 << 5);
                objArr = new Object[]{new int[1], iArr, new int[]{i6}, strArr};
            } else {
                Object[] objArr8 = new Object[1];
                e(new char[]{4158, 26204, 4180, 33874, 17482, 56761, 62252, 30375, 65024, 53156, 57643, 25784, 52345, 61910, 55081, 19103, 55933, 58268, 50447, 47259}, View.MeasureSpec.makeMeasureSpec(0, 0), objArr8);
                Class<?> cls2 = Class.forName((String) objArr8[0]);
                Object[] objArr9 = new Object[1];
                e(new char[]{22125, 28848, 22020, 61652, 24620, 52048, 34745, 21198, 47113, 55629, 38328, 16585, 35333, 59253, 41871, 28392, 39966, 62827, 45448, 40181}, '0' - AndroidCharacter.getMirror('0'), objArr9);
                try {
                    Object[] objArr10 = {null, Integer.valueOf(((Integer) cls2.getMethod((String) objArr9[0], Object.class).invoke(null, this)).intValue()), 0, -27206408};
                    byte[] bArr3 = $$d;
                    byte b5 = bArr3[47];
                    Object[] objArr11 = new Object[1];
                    f(b5, b5, bArr3[59], objArr11);
                    Class<?> cls3 = Class.forName((String) objArr11[0]);
                    byte b6 = bArr3[59];
                    Object[] objArr12 = new Object[1];
                    f(b6, b6, bArr3[47], objArr12);
                    Object[] objArr13 = (Object[]) cls3.getMethod((String) objArr12[0], Class.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr10);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-308143642);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        char jumpTapTimeout = (char) ((ViewConfiguration.getJumpTapTimeout() >> 16) + 43042);
                        int offsetBefore = 3111 - TextUtils.getOffsetBefore("", 0);
                        int i12 = 22 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                        byte b7 = $$a[7];
                        byte b8 = b7;
                        Object[] objArr14 = new Object[1];
                        c(b7, b8, b8, objArr14);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(jumpTapTimeout, offsetBefore, i12, 154975793, false, (String) objArr14[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr13);
                    try {
                        Object[] objArr15 = new Object[1];
                        e(new char[]{63357, 34662, 63260, 31531, 50144, 15500, 3143, 61726, 6402, 11931, 7767, 58194, 11058, 4273, 10285, 52511, 15668, 673, 14951, 16185, 20304, 62689, 21519, 10563, 20814, 59097}, (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), objArr15);
                        Class<?> cls4 = Class.forName((String) objArr15[0]);
                        Object[] objArr16 = new Object[1];
                        e(new char[]{16525, 37265, 16616, 5630, 49286, 10873, 25239, 62074, 44782, 14432, 28802, 57416, 40136, 1620, 18106, 52830, 35540, 5192, 21667}, ViewConfiguration.getWindowTouchSlop() >> 8, objArr16);
                        long jLongValue2 = ((Long) cls4.getDeclaredMethod((String) objArr16[0], new Class[0]).invoke(null, new Object[0])).longValue();
                        Long lValueOf = Long.valueOf(jLongValue2);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1355648493);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                            char windowTouchSlop = (char) ((ViewConfiguration.getWindowTouchSlop() >> 8) + 43042);
                            int i13 = 3112 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1));
                            int iRgb = (-16777194) - Color.rgb(0, 0, 0);
                            byte[] bArr4 = $$a;
                            byte b9 = bArr4[7];
                            byte b10 = bArr4[132];
                            Object[] objArr17 = new Object[1];
                            c(b9, b10, b10, objArr17);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(windowTouchSlop, i13, iRgb, -1269618118, false, (String) objArr17[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                        Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1354724972);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                            char cLastIndexOf2 = (char) (TextUtils.lastIndexOf("", '0', 0) + 43043);
                            int jumpTapTimeout2 = (ViewConfiguration.getJumpTapTimeout() >> 16) + 3111;
                            int keyRepeatDelay = 22 - (ViewConfiguration.getKeyRepeatDelay() >> 16);
                            byte[] bArr5 = $$a;
                            Object[] objArr18 = new Object[1];
                            c(bArr5[7], bArr5[37], bArr5[132], objArr18);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(cLastIndexOf2, jumpTapTimeout2, keyRepeatDelay, -1272852037, false, (String) objArr18[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf2);
                        objArr = objArr13;
                    } catch (Exception unused) {
                        throw new RuntimeException();
                    }
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause != null) {
                        throw cause;
                    }
                    throw th;
                }
            }
            int i14 = ((int[]) objArr[1])[0];
            int i15 = ((int[]) objArr[2])[0];
            if (i15 != i14) {
                ArrayList arrayList = new ArrayList();
                String[] strArr2 = (String[]) objArr[3];
                if (strArr2 != null) {
                    for (String str2 : strArr2) {
                        arrayList.add(str2);
                    }
                }
                throw new RuntimeException(String.valueOf(i15));
            }
            int i16 = onConnectionFailed + 35;
            setInternalConnectionCallback = i16 % 128;
            int i17 = i16 % 2;
            int i18 = ((int[]) objArr[0])[0];
            int i19 = ((int[]) objArr[2])[0];
            int i20 = ((int[]) objArr[1])[0];
            String[] strArr3 = (String[]) objArr[3];
            int[] iArr2 = {i19};
            int[] iArr3 = {i20};
            int iMyUid = Process.myUid();
            int i21 = ~iMyUid;
            int i22 = i18 + (-1641410398) + ((290996376 | i21) * (-192)) + (((~((-1310998344) | i21)) | 103036739) * (-384)) + (((~(iMyUid | 1601994719)) | (~(i21 | (-1207961605))) | (~((-103036740) | iMyUid))) * DerHeader.TAG_CLASS_PRIVATE);
            int i23 = (i22 << 13) ^ i22;
            int i24 = i23 ^ (i23 >>> 17);
            ((int[]) objArr[0])[0] = i24 ^ (i24 << 5);
            Object[] objArr19 = {new int[1], iArr3, iArr2, strArr3};
            int i25 = setInternalConnectionCallback;
            int i26 = i25 + 47;
            onConnectionFailed = i26 % 128;
            int i27 = i26 % 2;
            int i28 = i25 + 87;
            onConnectionFailed = i28 % 128;
            int i29 = i28 % 2;
            Pair<? extends setMediaId.TuitionPaymentFragmentspecialinlinedviewModeldefault1<?>, ? extends Class<?>> pair = this.onTransact;
            MediaBrowserCompatApi21MediaItem.TuitionPaymentFragmentspecialinlinedviewModeldefault2 tuitionPaymentFragmentspecialinlinedviewModeldefault2 = this.notify;
            List<? extends IMediaControllerCallbackStub> list = this.cancel;
            adjustVolume.TuitionPaymentFragmentbindingInflater1 tuitionPaymentFragmentbindingInflater1Cancel = this.INotificationSideChannel;
            if (tuitionPaymentFragmentbindingInflater1Cancel == null) {
                tuitionPaymentFragmentbindingInflater1Cancel = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getTuitionPaymentFragmentspecialinlinedviewModeldefault1();
            }
            adjustVolume.TuitionPaymentFragmentbindingInflater1 tuitionPaymentFragmentbindingInflater1 = tuitionPaymentFragmentbindingInflater1Cancel;
            Headers.Builder builder = this.cancelAll;
            Headers headersTuitionPaymentFragmentspecialinlinedviewModeldefault1 = getRatingType.TuitionPaymentFragmentspecialinlinedviewModeldefault1(builder != null ? builder.build() : null);
            Map<Class<?>, Object> map = this.INotificationSideChannelStub;
            if (map != null) {
                IMediaControllerCallback.Companion tuitionPaymentFragmentspecialinlinedviewModeldefault1 = IMediaControllerCallback.INSTANCE;
                iMediaControllerCallbackTuitionPaymentFragmentspecialinlinedviewModeldefault1 = IMediaControllerCallback.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1(map);
            } else {
                iMediaControllerCallbackTuitionPaymentFragmentspecialinlinedviewModeldefault1 = null;
            }
            IMediaControllerCallback iMediaControllerCallbackTuitionPaymentFragmentspecialinlinedviewModeldefault2 = getRatingType.TuitionPaymentFragmentspecialinlinedviewModeldefault1(iMediaControllerCallbackTuitionPaymentFragmentspecialinlinedviewModeldefault1);
            boolean z = this.getInterfaceDescriptor;
            Boolean bool = this.RemoteActionCompatParcelizer;
            if (bool != null) {
                int i30 = setInternalConnectionCallback + 9;
                onConnectionFailed = i30 % 128;
                if (i30 % 2 != 0) {
                    bool.booleanValue();
                    throw null;
                }
                zTuitionPaymentFragmentspecialinlinedviewModeldefault1 = bool.booleanValue();
                getratingstyle = null;
            } else {
                getratingstyle = null;
                zTuitionPaymentFragmentspecialinlinedviewModeldefault1 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getG();
            }
            Boolean bool2 = this.INotificationSideChannelDefault;
            boolean zBooleanValue = bool2 != null ? bool2.booleanValue() : this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getAsInterface();
            boolean z2 = this.INotificationSideChannelStubProxy;
            CachePolicy cachePolicyG = this.read;
            if (cachePolicyG == null) {
                int i31 = setInternalConnectionCallback + 101;
                onConnectionFailed = i31 % 128;
                if (i31 % 2 != 0) {
                    cachePolicyG = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getCancelAll();
                    int i32 = 88 / 0;
                } else {
                    cachePolicyG = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getCancelAll();
                }
            }
            CachePolicy cachePolicy = cachePolicyG;
            CachePolicy cachePolicyB = this.MediaBrowserCompat;
            if (cachePolicyB == null) {
                cachePolicyB = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getINotificationSideChannel();
            }
            CachePolicy cachePolicy2 = cachePolicyB;
            CachePolicy cachePolicyA = this.connect;
            if (cachePolicyA == null) {
                int i33 = setInternalConnectionCallback + 83;
                onConnectionFailed = i33 % 128;
                int i34 = i33 % 2;
                cachePolicyA = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getNotify();
            }
            CachePolicy cachePolicy3 = cachePolicyA;
            CoroutineDispatcher coroutineDispatcherAsInterface = this.write;
            if (coroutineDispatcherAsInterface == null) {
                coroutineDispatcherAsInterface = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getTuitionPaymentFragmentbindingInflater1();
            }
            CoroutineDispatcher coroutineDispatcher = coroutineDispatcherAsInterface;
            CoroutineDispatcher coroutineDispatcherAsBinder = this.IconCompatParcelizer;
            if (coroutineDispatcherAsBinder == null) {
                coroutineDispatcherAsBinder = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getTuitionPaymentFragmentspecialinlinedviewModeldefault3();
                int i35 = onConnectionFailed + 47;
                setInternalConnectionCallback = i35 % 128;
                int i36 = i35 % 2;
            }
            CoroutineDispatcher coroutineDispatcher2 = coroutineDispatcherAsBinder;
            CoroutineDispatcher coroutineDispatcherTuitionPaymentFragmentspecialinlinedviewModeldefault3 = this.disconnect;
            if (coroutineDispatcherTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                coroutineDispatcherTuitionPaymentFragmentspecialinlinedviewModeldefault3 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getTuitionPaymentFragmentspecialinlinedviewModeldefault2();
            }
            CoroutineDispatcher coroutineDispatcher3 = coroutineDispatcherTuitionPaymentFragmentspecialinlinedviewModeldefault3;
            CoroutineDispatcher coroutineDispatcherINotificationSideChannel = this.getRoot;
            if (coroutineDispatcherINotificationSideChannel == null) {
                coroutineDispatcherINotificationSideChannel = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getB();
            }
            CoroutineDispatcher coroutineDispatcher4 = coroutineDispatcherINotificationSideChannel;
            Lifecycle lifecycleB = this.subscribe;
            if (lifecycleB == null && (lifecycleB = this.setCallbacksMessenger) == null) {
                lifecycleB = b();
            }
            Lifecycle lifecycle = lifecycleB;
            onSessionReady onsessionreadyA = this.handleMessage;
            if (onsessionreadyA == null && (onsessionreadyA = this.unsubscribe) == null) {
                onsessionreadyA = a();
            }
            onSessionReady onsessionready = onsessionreadyA;
            Scale scaleTuitionPaymentFragmentspecialinlinedviewModeldefault3 = this.MediaBrowserCompatCallbackHandler;
            if (scaleTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null && (scaleTuitionPaymentFragmentspecialinlinedviewModeldefault3 = this.onConnected) == null) {
                scaleTuitionPaymentFragmentspecialinlinedviewModeldefault3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3();
            }
            Scale scale = scaleTuitionPaymentFragmentspecialinlinedviewModeldefault3;
            getRatingStyle.TuitionPaymentFragmentbindingInflater1 tuitionPaymentFragmentbindingInflater2 = this.getItem;
            return new newUnratedRating(context, obj3, onshufflemodechangedremoved, bVar, key, str, config, colorSpace, precision, pair, tuitionPaymentFragmentspecialinlinedviewModeldefault2, list, tuitionPaymentFragmentbindingInflater1, headersTuitionPaymentFragmentspecialinlinedviewModeldefault1, iMediaControllerCallbackTuitionPaymentFragmentspecialinlinedviewModeldefault2, z, zTuitionPaymentFragmentspecialinlinedviewModeldefault1, zBooleanValue, z2, cachePolicy, cachePolicy2, cachePolicy3, coroutineDispatcher, coroutineDispatcher2, coroutineDispatcher3, coroutineDispatcher4, lifecycle, onsessionready, scale, getRatingType.TuitionPaymentFragmentbindingInflater1(tuitionPaymentFragmentbindingInflater2 != null ? tuitionPaymentFragmentbindingInflater2.TuitionPaymentFragmentspecialinlinedviewModeldefault2() : getratingstyle), this.getExtras, this.getNotifyChildrenChangedOptions, this.isConnected, this.sendCustomAction, this.getSessionToken, this.getServiceComponent, this.search, new RatingCompat(this.subscribe, this.handleMessage, this.MediaBrowserCompatCallbackHandler, this.write, this.IconCompatParcelizer, this.disconnect, this.getRoot, this.INotificationSideChannel, this.g, this.asInterface, this.RemoteActionCompatParcelizer, this.INotificationSideChannelDefault, this.read, this.MediaBrowserCompat, this.connect), this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, null);
        }

        public final void TuitionPaymentFragmentbindingInflater1() {
            int i = 2 % 2;
            int i2 = onConnectionFailed + 95;
            setInternalConnectionCallback = i2 % 128;
            Object obj = null;
            if (i2 % 2 != 0) {
                this.setCallbacksMessenger = null;
                this.unsubscribe = null;
                this.onConnected = null;
            } else {
                this.setCallbacksMessenger = null;
                this.unsubscribe = null;
                this.onConnected = null;
                obj.hashCode();
                throw null;
            }
        }

        private final void TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
            int i = 2 % 2;
            int i2 = onConnectionFailed;
            int i3 = i2 + 29;
            setInternalConnectionCallback = i3 % 128;
            int i4 = i3 % 2;
            this.onConnected = null;
            if (i4 == 0) {
                int i5 = 93 / 0;
            }
            int i6 = i2 + 89;
            setInternalConnectionCallback = i6 % 128;
            if (i6 % 2 == 0) {
                throw null;
            }
        }

        private final Lifecycle b() {
            Context context;
            int i = 2 % 2;
            onShuffleModeChangedRemoved onshufflemodechangedremoved = this.TuitionPaymentFragmentbindingInflater1;
            if (onshufflemodechangedremoved instanceof onShuffleModeChanged) {
                int i2 = onConnectionFailed + 3;
                setInternalConnectionCallback = i2 % 128;
                if (i2 % 2 == 0) {
                    ((onShuffleModeChanged) onshufflemodechangedremoved).TuitionPaymentFragmentspecialinlinedviewModeldefault2().getContext();
                    throw null;
                }
                context = ((onShuffleModeChanged) onshufflemodechangedremoved).TuitionPaymentFragmentspecialinlinedviewModeldefault2().getContext();
            } else {
                Context context2 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                int i3 = setInternalConnectionCallback + 37;
                onConnectionFailed = i3 % 128;
                int i4 = i3 % 2;
                context = context2;
            }
            Lifecycle lifecycleTuitionPaymentFragmentspecialinlinedviewModeldefault1 = getLaunchPendingIntent.TuitionPaymentFragmentspecialinlinedviewModeldefault1(context);
            return lifecycleTuitionPaymentFragmentspecialinlinedviewModeldefault1 == null ? newThumbRating.INSTANCE : lifecycleTuitionPaymentFragmentspecialinlinedviewModeldefault1;
        }

        private final onSessionReady a() {
            ImageView.ScaleType scaleType;
            int i = 2 % 2;
            onShuffleModeChangedRemoved onshufflemodechangedremoved = this.TuitionPaymentFragmentbindingInflater1;
            Object obj = null;
            if (!(onshufflemodechangedremoved instanceof onShuffleModeChanged)) {
                onCaptioningEnabledChanged oncaptioningenabledchanged = new onCaptioningEnabledChanged(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
                int i2 = setInternalConnectionCallback + 37;
                onConnectionFailed = i2 % 128;
                if (i2 % 2 == 0) {
                    return oncaptioningenabledchanged;
                }
                obj.hashCode();
                throw null;
            }
            int i3 = onConnectionFailed + 53;
            setInternalConnectionCallback = i3 % 128;
            if (i3 % 2 == 0) {
                boolean z = ((onShuffleModeChanged) onshufflemodechangedremoved).TuitionPaymentFragmentspecialinlinedviewModeldefault2() instanceof ImageView;
                throw null;
            }
            View viewTuitionPaymentFragmentspecialinlinedviewModeldefault2 = ((onShuffleModeChanged) onshufflemodechangedremoved).TuitionPaymentFragmentspecialinlinedviewModeldefault2();
            if (!(viewTuitionPaymentFragmentspecialinlinedviewModeldefault2 instanceof ImageView) || ((scaleType = ((ImageView) viewTuitionPaymentFragmentspecialinlinedviewModeldefault2).getScaleType()) != ImageView.ScaleType.CENTER && scaleType != ImageView.ScaleType.MATRIX)) {
                return IMediaControllerCallbackStubProxy.b(viewTuitionPaymentFragmentspecialinlinedviewModeldefault2, true);
            }
            onRepeatModeChanged onrepeatmodechanged = new onRepeatModeChanged(onQueueTitleChanged.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
            int i4 = onConnectionFailed + 47;
            setInternalConnectionCallback = i4 % 128;
            int i5 = i4 % 2;
            return onrepeatmodechanged;
        }

        /* JADX WARN: Code duplicated, block: B:11:0x0029  */
        /* JADX WARN: Code duplicated, block: B:13:0x002f  */
        /* JADX WARN: Code duplicated, block: B:14:0x003b  */
        /* JADX WARN: Code duplicated, block: B:16:0x003e  */
        private final Scale TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
            onShuffleModeChangedRemoved onshufflemodechangedremoved;
            onShuffleModeChanged onshufflemodechanged;
            int i = 2 % 2;
            int i2 = setInternalConnectionCallback + 75;
            int i3 = i2 % 128;
            onConnectionFailed = i3;
            int i4 = i2 % 2;
            onSessionReady onsessionready = this.handleMessage;
            View viewTuitionPaymentFragmentspecialinlinedviewModeldefault2 = null;
            onSessionDestroyed onsessiondestroyed = onsessionready instanceof onSessionDestroyed ? (onSessionDestroyed) onsessionready : null;
            if (onsessiondestroyed != null) {
                int i5 = i3 + 117;
                setInternalConnectionCallback = i5 % 128;
                int i6 = i5 % 2;
                View viewTuitionPaymentFragmentbindingInflater1 = onsessiondestroyed.TuitionPaymentFragmentbindingInflater1();
                if (viewTuitionPaymentFragmentbindingInflater1 == null) {
                    onshufflemodechangedremoved = this.TuitionPaymentFragmentbindingInflater1;
                    if (onshufflemodechangedremoved instanceof onShuffleModeChanged) {
                        onshufflemodechanged = (onShuffleModeChanged) onshufflemodechangedremoved;
                        int i7 = onConnectionFailed + 119;
                        setInternalConnectionCallback = i7 % 128;
                        int i8 = i7 % 2;
                    } else {
                        onshufflemodechanged = null;
                    }
                    if (onshufflemodechanged != null) {
                        int i9 = setInternalConnectionCallback + 121;
                        onConnectionFailed = i9 % 128;
                        int i10 = i9 % 2;
                        viewTuitionPaymentFragmentspecialinlinedviewModeldefault2 = onshufflemodechanged.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                        int i11 = onConnectionFailed + 31;
                        setInternalConnectionCallback = i11 % 128;
                        int i12 = i11 % 2;
                    }
                } else {
                    viewTuitionPaymentFragmentspecialinlinedviewModeldefault2 = viewTuitionPaymentFragmentbindingInflater1;
                }
            } else {
                onshufflemodechangedremoved = this.TuitionPaymentFragmentbindingInflater1;
                if (onshufflemodechangedremoved instanceof onShuffleModeChanged) {
                    onshufflemodechanged = (onShuffleModeChanged) onshufflemodechangedremoved;
                    int i13 = onConnectionFailed + 119;
                    setInternalConnectionCallback = i13 % 128;
                    int i14 = i13 % 2;
                } else {
                    onshufflemodechanged = null;
                }
                if (onshufflemodechanged != null) {
                    int i15 = setInternalConnectionCallback + 121;
                    onConnectionFailed = i15 % 128;
                    int i16 = i15 % 2;
                    viewTuitionPaymentFragmentspecialinlinedviewModeldefault2 = onshufflemodechanged.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                    int i17 = onConnectionFailed + 31;
                    setInternalConnectionCallback = i17 % 128;
                    int i18 = i17 % 2;
                }
            }
            return viewTuitionPaymentFragmentspecialinlinedviewModeldefault2 instanceof ImageView ? getRatingType.TuitionPaymentFragmentbindingInflater1((ImageView) viewTuitionPaymentFragmentspecialinlinedviewModeldefault2) : Scale.FIT;
        }

        /* JADX WARN: Code duplicated, block: B:10:0x0025  */
        /* JADX WARN: Code duplicated, block: B:8:0x001f  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x0029). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0025
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        private static java.lang.String $$g(byte r5, short r6, short r7) {
            /*
                byte[] r0 = newUnratedRating.TuitionPaymentFragmentspecialinlinedviewModeldefault1.$$c
                int r7 = r7 * 4
                int r7 = 4 - r7
                int r6 = r6 * 4
                int r1 = 1 - r6
                int r5 = r5 * 2
                int r5 = r5 + 107
                byte[] r1 = new byte[r1]
                r2 = 0
                int r6 = 0 - r6
                if (r0 != 0) goto L19
                r4 = r5
                r5 = r6
                r3 = r2
                goto L29
            L19:
                r3 = r2
            L1a:
                byte r4 = (byte) r5
                r1[r3] = r4
                if (r3 != r6) goto L25
                java.lang.String r5 = new java.lang.String
                r5.<init>(r1, r2)
                return r5
            L25:
                int r3 = r3 + 1
                r4 = r0[r7]
            L29:
                int r7 = r7 + 1
                int r5 = r5 + r4
                goto L1a
            */
            throw new UnsupportedOperationException("Method not decompiled: newUnratedRating.TuitionPaymentFragmentspecialinlinedviewModeldefault1.$$g(byte, short, short):java.lang.String");
        }
    }

    /* JADX INFO: renamed from: asBinder, reason: from getter */
    public final Object getOnTransact() {
        return this.onTransact;
    }

    /* JADX INFO: renamed from: getServiceComponent, reason: from getter */
    public final onShuffleModeChangedRemoved getSubscribe() {
        return this.subscribe;
    }

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from getter */
    public final b getConnect() {
        return this.connect;
    }

    /* JADX INFO: renamed from: read, reason: from getter */
    public final MemoryCache.Key getIconCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    /* JADX INFO: renamed from: cancelAll, reason: from getter */
    public final String getINotificationSideChannelDefault() {
        return this.INotificationSideChannelDefault;
    }

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from getter */
    public final Bitmap.Config getAsBinder() {
        return this.asBinder;
    }

    /* JADX INFO: renamed from: v_, reason: from getter */
    public final ColorSpace getCancelAll() {
        return this.cancelAll;
    }

    /* JADX INFO: renamed from: getNotifyChildrenChangedOptions, reason: from getter */
    public final Precision getGetSessionToken() {
        return this.getSessionToken;
    }

    public final Pair<setMediaId.TuitionPaymentFragmentspecialinlinedviewModeldefault1<?>, Class<?>> INotificationSideChannelStub() {
        return this.INotificationSideChannelStub;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final MediaBrowserCompatApi21MediaItem.TuitionPaymentFragmentspecialinlinedviewModeldefault2 getCancel() {
        return this.cancel;
    }

    public final List<IMediaControllerCallbackStub> sendCustomAction() {
        return this.handleMessage;
    }

    /* JADX INFO: renamed from: search, reason: from getter */
    public final adjustVolume.TuitionPaymentFragmentbindingInflater1 getMediaBrowserCompatCallbackHandler() {
        return this.MediaBrowserCompatCallbackHandler;
    }

    /* JADX INFO: renamed from: getInterfaceDescriptor, reason: from getter */
    public final Headers getMediaBrowserCompat() {
        return this.MediaBrowserCompat;
    }

    /* JADX INFO: renamed from: isConnected, reason: from getter */
    public final IMediaControllerCallback getUnsubscribe() {
        return this.unsubscribe;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final boolean getG() {
        return this.g;
    }

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from getter */
    public final boolean getF1280a() {
        return this.f1280a;
    }

    /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from getter */
    public final boolean getD() {
        return this.d;
    }

    /* JADX INFO: renamed from: getRoot, reason: from getter */
    public final boolean getSendCustomAction() {
        return this.sendCustomAction;
    }

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from getter */
    public final CachePolicy getDisconnect() {
        return this.disconnect;
    }

    /* JADX INFO: renamed from: INotificationSideChannel, reason: from getter */
    public final CachePolicy getINotificationSideChannelStubProxy() {
        return this.INotificationSideChannelStubProxy;
    }

    /* JADX INFO: renamed from: write, reason: from getter */
    public final CachePolicy getGetExtras() {
        return this.getExtras;
    }

    /* JADX INFO: renamed from: INotificationSideChannelDefault, reason: from getter */
    public final CoroutineDispatcher getRead() {
        return this.read;
    }

    /* JADX INFO: renamed from: onTransact, reason: from getter */
    public final CoroutineDispatcher getGetInterfaceDescriptor() {
        return this.getInterfaceDescriptor;
    }

    /* JADX INFO: renamed from: asInterface, reason: from getter */
    public final CoroutineDispatcher getNotify() {
        return this.notify;
    }

    /* JADX INFO: renamed from: INotificationSideChannelStubProxy, reason: from getter */
    public final Lifecycle getWrite() {
        return this.write;
    }

    /* JADX INFO: renamed from: getExtras, reason: from getter */
    public final onSessionReady getIsConnected() {
        return this.isConnected;
    }

    /* JADX INFO: renamed from: getItem, reason: from getter */
    public final Scale getSearch() {
        return this.search;
    }

    /* JADX INFO: renamed from: connect, reason: from getter */
    public final getRatingStyle getGetRoot() {
        return this.getRoot;
    }

    /* JADX INFO: renamed from: disconnect, reason: from getter */
    public final MemoryCache.Key getGetNotifyChildrenChangedOptions() {
        return this.getNotifyChildrenChangedOptions;
    }

    /* JADX INFO: renamed from: cancel, reason: from getter */
    public final RatingCompat getRemoteActionCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final MediaMetadataCompatApi21Builder getTuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        return this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    }

    public final Drawable MediaBrowserCompat() {
        return getQueueTitle.TuitionPaymentFragmentbindingInflater1(this, this.getItem, this.getServiceComponent, this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getAsBinder());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public TuitionPaymentFragmentspecialinlinedviewModeldefault1 b(Context context) {
        return new TuitionPaymentFragmentspecialinlinedviewModeldefault1(this, context);
    }

    public final boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof newUnratedRating)) {
            return false;
        }
        newUnratedRating newunratedrating = (newUnratedRating) other;
        if (Intrinsics.areEqual(this.INotificationSideChannel, newunratedrating.INotificationSideChannel) && Intrinsics.areEqual(this.onTransact, newunratedrating.onTransact) && Intrinsics.areEqual(this.subscribe, newunratedrating.subscribe) && Intrinsics.areEqual(this.connect, newunratedrating.connect) && Intrinsics.areEqual(this.IconCompatParcelizer, newunratedrating.IconCompatParcelizer) && Intrinsics.areEqual(this.INotificationSideChannelDefault, newunratedrating.INotificationSideChannelDefault) && this.asBinder == newunratedrating.asBinder) {
            return (Build.VERSION.SDK_INT < 26 || Intrinsics.areEqual(this.cancelAll, newunratedrating.cancelAll)) && this.getSessionToken == newunratedrating.getSessionToken && Intrinsics.areEqual(this.INotificationSideChannelStub, newunratedrating.INotificationSideChannelStub) && Intrinsics.areEqual(this.cancel, newunratedrating.cancel) && Intrinsics.areEqual(this.handleMessage, newunratedrating.handleMessage) && Intrinsics.areEqual(this.MediaBrowserCompatCallbackHandler, newunratedrating.MediaBrowserCompatCallbackHandler) && Intrinsics.areEqual(this.MediaBrowserCompat, newunratedrating.MediaBrowserCompat) && Intrinsics.areEqual(this.unsubscribe, newunratedrating.unsubscribe) && this.g == newunratedrating.g && this.f1280a == newunratedrating.f1280a && this.d == newunratedrating.d && this.sendCustomAction == newunratedrating.sendCustomAction && this.disconnect == newunratedrating.disconnect && this.INotificationSideChannelStubProxy == newunratedrating.INotificationSideChannelStubProxy && this.getExtras == newunratedrating.getExtras && Intrinsics.areEqual(this.read, newunratedrating.read) && Intrinsics.areEqual(this.getInterfaceDescriptor, newunratedrating.getInterfaceDescriptor) && Intrinsics.areEqual(this.notify, newunratedrating.notify) && Intrinsics.areEqual(this.asInterface, newunratedrating.asInterface) && Intrinsics.areEqual(this.getNotifyChildrenChangedOptions, newunratedrating.getNotifyChildrenChangedOptions) && Intrinsics.areEqual(this.getServiceComponent, newunratedrating.getServiceComponent) && Intrinsics.areEqual(this.getItem, newunratedrating.getItem) && Intrinsics.areEqual(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, newunratedrating.TuitionPaymentFragmentspecialinlinedviewModeldefault3) && Intrinsics.areEqual(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, newunratedrating.TuitionPaymentFragmentspecialinlinedviewModeldefault2) && Intrinsics.areEqual(this.TuitionPaymentFragmentbindingInflater1, newunratedrating.TuitionPaymentFragmentbindingInflater1) && Intrinsics.areEqual(this.b, newunratedrating.b) && Intrinsics.areEqual(this.write, newunratedrating.write) && Intrinsics.areEqual(this.isConnected, newunratedrating.isConnected) && this.search == newunratedrating.search && Intrinsics.areEqual(this.getRoot, newunratedrating.getRoot) && Intrinsics.areEqual(this.RemoteActionCompatParcelizer, newunratedrating.RemoteActionCompatParcelizer) && Intrinsics.areEqual(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, newunratedrating.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.INotificationSideChannel.hashCode();
        int iHashCode2 = this.onTransact.hashCode();
        onShuffleModeChangedRemoved onshufflemodechangedremoved = this.subscribe;
        int iHashCode3 = onshufflemodechangedremoved != null ? onshufflemodechangedremoved.hashCode() : 0;
        b bVar = this.connect;
        int iHashCode4 = bVar != null ? bVar.hashCode() : 0;
        MemoryCache.Key key = this.IconCompatParcelizer;
        int iHashCode5 = key != null ? key.hashCode() : 0;
        String str = this.INotificationSideChannelDefault;
        int iHashCode6 = str != null ? str.hashCode() : 0;
        int iHashCode7 = this.asBinder.hashCode();
        ColorSpace colorSpace = this.cancelAll;
        int iHashCode8 = colorSpace != null ? colorSpace.hashCode() : 0;
        int iHashCode9 = this.getSessionToken.hashCode();
        Pair<setMediaId.TuitionPaymentFragmentspecialinlinedviewModeldefault1<?>, Class<?>> pair = this.INotificationSideChannelStub;
        int iHashCode10 = pair != null ? pair.hashCode() : 0;
        MediaBrowserCompatApi21MediaItem.TuitionPaymentFragmentspecialinlinedviewModeldefault2 tuitionPaymentFragmentspecialinlinedviewModeldefault2 = this.cancel;
        int iHashCode11 = tuitionPaymentFragmentspecialinlinedviewModeldefault2 != null ? tuitionPaymentFragmentspecialinlinedviewModeldefault2.hashCode() : 0;
        int iHashCode12 = this.handleMessage.hashCode();
        int iHashCode13 = this.MediaBrowserCompatCallbackHandler.hashCode();
        int iHashCode14 = this.MediaBrowserCompat.hashCode();
        int iHashCode15 = this.unsubscribe.hashCode();
        int iHashCode16 = Boolean.hashCode(this.g);
        int iHashCode17 = Boolean.hashCode(this.f1280a);
        int iHashCode18 = Boolean.hashCode(this.d);
        int iHashCode19 = Boolean.hashCode(this.sendCustomAction);
        int iHashCode20 = this.disconnect.hashCode();
        int iHashCode21 = this.INotificationSideChannelStubProxy.hashCode();
        int iHashCode22 = this.getExtras.hashCode();
        int iHashCode23 = this.read.hashCode();
        int iHashCode24 = this.getInterfaceDescriptor.hashCode();
        int iHashCode25 = this.notify.hashCode();
        int iHashCode26 = this.asInterface.hashCode();
        int iHashCode27 = this.write.hashCode();
        int iHashCode28 = this.isConnected.hashCode();
        int iHashCode29 = this.search.hashCode();
        int iHashCode30 = this.getRoot.hashCode();
        MemoryCache.Key key2 = this.getNotifyChildrenChangedOptions;
        int iHashCode31 = key2 != null ? key2.hashCode() : 0;
        Integer num = this.getServiceComponent;
        int iHashCode32 = num != null ? num.hashCode() : 0;
        Drawable drawable = this.getItem;
        int iHashCode33 = drawable != null ? drawable.hashCode() : 0;
        Integer num2 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        int iHashCode34 = num2 != null ? num2.hashCode() : 0;
        Drawable drawable2 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        int iHashCode35 = drawable2 != null ? drawable2.hashCode() : 0;
        Integer num3 = this.TuitionPaymentFragmentbindingInflater1;
        int iHashCode36 = num3 != null ? num3.hashCode() : 0;
        Drawable drawable3 = this.b;
        return (((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + iHashCode14) * 31) + iHashCode15) * 31) + iHashCode16) * 31) + iHashCode17) * 31) + iHashCode18) * 31) + iHashCode19) * 31) + iHashCode20) * 31) + iHashCode21) * 31) + iHashCode22) * 31) + iHashCode23) * 31) + iHashCode24) * 31) + iHashCode25) * 31) + iHashCode26) * 31) + iHashCode27) * 31) + iHashCode28) * 31) + iHashCode29) * 31) + iHashCode30) * 31) + iHashCode31) * 31) + iHashCode32) * 31) + iHashCode33) * 31) + iHashCode34) * 31) + iHashCode35) * 31) + iHashCode36) * 31) + (drawable3 != null ? drawable3.hashCode() : 0)) * 31) + this.RemoteActionCompatParcelizer.hashCode()) * 31) + this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.hashCode();
    }

    public /* synthetic */ newUnratedRating(Context context, Object obj, onShuffleModeChangedRemoved onshufflemodechangedremoved, b bVar, MemoryCache.Key key, String str, Bitmap.Config config, ColorSpace colorSpace, Precision precision, Pair pair, MediaBrowserCompatApi21MediaItem.TuitionPaymentFragmentspecialinlinedviewModeldefault2 tuitionPaymentFragmentspecialinlinedviewModeldefault2, List list, adjustVolume.TuitionPaymentFragmentbindingInflater1 tuitionPaymentFragmentbindingInflater1, Headers headers, IMediaControllerCallback iMediaControllerCallback, boolean z, boolean z2, boolean z3, boolean z4, CachePolicy cachePolicy, CachePolicy cachePolicy2, CachePolicy cachePolicy3, CoroutineDispatcher coroutineDispatcher, CoroutineDispatcher coroutineDispatcher2, CoroutineDispatcher coroutineDispatcher3, CoroutineDispatcher coroutineDispatcher4, Lifecycle lifecycle, onSessionReady onsessionready, Scale scale, getRatingStyle getratingstyle, MemoryCache.Key key2, Integer num, Drawable drawable, Integer num2, Drawable drawable2, Integer num3, Drawable drawable3, RatingCompat ratingCompat, MediaMetadataCompatApi21Builder mediaMetadataCompatApi21Builder, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, obj, onshufflemodechangedremoved, bVar, key, str, config, colorSpace, precision, pair, tuitionPaymentFragmentspecialinlinedviewModeldefault2, list, tuitionPaymentFragmentbindingInflater1, headers, iMediaControllerCallback, z, z2, z3, z4, cachePolicy, cachePolicy2, cachePolicy3, coroutineDispatcher, coroutineDispatcher2, coroutineDispatcher3, coroutineDispatcher4, lifecycle, onsessionready, scale, getratingstyle, key2, num, drawable, num2, drawable2, num3, drawable3, ratingCompat, mediaMetadataCompatApi21Builder);
    }
}
