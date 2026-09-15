package defpackage;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.ColorSpace;
import android.graphics.ImageFormat;
import android.media.AudioTrack;
import android.os.Build;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import coil.request.CachePolicy;
import coil.size.Scale;
import com.google.android.gms.internal.mlkit_vision_face.zzbr;
import com.google.firebase.dynamiclinks.DynamicLink;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Random;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Headers;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\"\n\u0002\u0010\b\n\u0000\u0018\u00002\u00020\u0001B\u009f\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\r\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\b\b\u0002\u0010\u000f\u001a\u00020\r\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0013\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0015\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0017\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0019\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u0019\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u0019¢\u0006\u0004\b\u001c\u0010\u001dJ \u0001\u00108\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u000f\u001a\u00020\r2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u00152\b\b\u0002\u0010\u0016\u001a\u00020\u00172\b\b\u0002\u0010\u0018\u001a\u00020\u00192\b\b\u0002\u0010\u001a\u001a\u00020\u00192\b\b\u0002\u0010\u001b\u001a\u00020\u0019J\u0013\u00109\u001a\u00020\r2\b\u0010:\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010;\u001a\u00020<H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'R\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b(\u0010)R\u0011\u0010\u000e\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b*\u0010)R\u0011\u0010\u000f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b+\u0010)R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\b\n\u0000\u001a\u0004\b,\u0010-R\u0011\u0010\u0012\u001a\u00020\u0013¢\u0006\b\n\u0000\u001a\u0004\b.\u0010/R\u0011\u0010\u0014\u001a\u00020\u0015¢\u0006\b\n\u0000\u001a\u0004\b0\u00101R\u0011\u0010\u0016\u001a\u00020\u0017¢\u0006\b\n\u0000\u001a\u0004\b2\u00103R\u0011\u0010\u0018\u001a\u00020\u0019¢\u0006\b\n\u0000\u001a\u0004\b4\u00105R\u0011\u0010\u001a\u001a\u00020\u0019¢\u0006\b\n\u0000\u001a\u0004\b6\u00105R\u0011\u0010\u001b\u001a\u00020\u0019¢\u0006\b\n\u0000\u001a\u0004\b7\u00105¨\u0006="}, d2 = {"Lcoil/request/Options;", "", "context", "Landroid/content/Context;", "config", "Landroid/graphics/Bitmap$Config;", "colorSpace", "Landroid/graphics/ColorSpace;", "size", "Lcoil/size/Size;", "scale", "Lcoil/size/Scale;", "allowInexactSize", "", "allowRgb565", "premultipliedAlpha", "diskCacheKey", "", "headers", "Lokhttp3/Headers;", "tags", "Lcoil/request/Tags;", DynamicLink.Builder.KEY_DYNAMIC_LINK_PARAMETERS, "Lcoil/request/Parameters;", "memoryCachePolicy", "Lcoil/request/CachePolicy;", "diskCachePolicy", "networkCachePolicy", "<init>", "(Landroid/content/Context;Landroid/graphics/Bitmap$Config;Landroid/graphics/ColorSpace;Lcoil/size/Size;Lcoil/size/Scale;ZZZLjava/lang/String;Lokhttp3/Headers;Lcoil/request/Tags;Lcoil/request/Parameters;Lcoil/request/CachePolicy;Lcoil/request/CachePolicy;Lcoil/request/CachePolicy;)V", "getContext", "()Landroid/content/Context;", "getConfig", "()Landroid/graphics/Bitmap$Config;", "getColorSpace", "()Landroid/graphics/ColorSpace;", "getSize", "()Lcoil/size/Size;", "getScale", "()Lcoil/size/Scale;", "getAllowInexactSize", "()Z", "getAllowRgb565", "getPremultipliedAlpha", "getDiskCacheKey", "()Ljava/lang/String;", "getHeaders", "()Lokhttp3/Headers;", "getTags", "()Lcoil/request/Tags;", "getParameters", "()Lcoil/request/Parameters;", "getMemoryCachePolicy", "()Lcoil/request/CachePolicy;", "getDiskCachePolicy", "getNetworkCachePolicy", "copy", "equals", "other", "hashCode", "", "coil-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class getStarRating {
    private final getRatingStyle INotificationSideChannel;
    private final ColorSpace TuitionPaymentFragmentbindingInflater1;
    private final Context TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    private final boolean TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    private final boolean TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final CachePolicy f985a;
    private final CachePolicy asBinder;
    private final CachePolicy asInterface;
    private final Bitmap.Config b;
    private final boolean cancel;
    private final Scale cancelAll;
    private final Headers d;
    private final String g;
    private final IMediaControllerCallback notify;
    private final onQueueTitleChanged onTransact;
    private static final byte[] $$c = {5, -91, 77, 46};
    private static final int $$f = 106;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$d = {80, -8, 43, 65, -20, -6, 55, -69, -12, -14, -6, 3, -9, -10, -1, -25, -7, -8, 11, 43, -59, -26, -14, 3, 3, 45, -27, -58, -14, 3, 3, 8, -26, -21, -12, 9, -21, 70, -25, 9, -25, -41, 4, -19, 3, -14, -7, 22, -25, -32, 4, 0, -17, -14, 38, -52, 9, -14, -14, 0, -17, -14, -7, -5, 3, -6, -14, 0, -19, -5, -13, -6, -5, -13, 1, -7, -26, 5, -4, -26, 34, -42, 3, -9, -15, 0, -9, -9, -3, -28, 1, -16, 58};
    private static final int $$e = 103;
    private static final byte[] $$a = {48, -110, 22, 55, 43, -2, 21, -1, 16, 9, -20, 27, 34, -2, 2, 19, 16, -36, 54, -7, 16, 16, 2, 19, 16, 9, 7, -1, 8, 16, 2, 21, 7, 15, 8, 7, 15, 1, 9, 28, -3, 6, 28, -32, 44, -1, 11, 17, 2, 11, 11, 5, 30, 1, 18, -55, 43, -2, 21, -1, 16, 9, -20, 27, 34, -2, 2, 19, 16, -36, 54, -7, 16, 16, 2, 19, 16, -8, 17, 15, 0, 15, 15, 3, -20, 47, 2, 16, -1, 29, -5, 23, -55};
    private static final int $$b = 214;
    private static int getInterfaceDescriptor = 0;
    private static int INotificationSideChannelDefault = 1;
    private static char[] INotificationSideChannelStub = {57184, 60063, 60047, 57189, 57187, 60072, 60052, 60056, 60117, 60058, 57186, 57191, 60041, 60034, 60055, 60050, 60088, 60043, 60053, 57188, 60048, 60054, 60040, 60062, 60073};
    private static char INotificationSideChannelStubProxy = 57188;

    public static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault2(int i, int i2, int i3, int i4, int i5, Object[] objArr, int i6) {
        int i7 = ~i5;
        int i8 = ~i;
        int i9 = (~(i7 | i8 | (~i4))) | (~(i5 | i | i4));
        int i10 = (~(i8 | i4)) | (~(i8 | i5));
        int i11 = (~(i4 | i)) | i5;
        int i12 = i5 + i + i3 + (1661237432 * i6) + (961048624 * i2);
        int i13 = i12 * i12;
        int i14 = ((119520104 * i5) - 281083904) + ((-1329838950) * i) + (i9 * 724679527) + (724679527 * i10) + ((-724679527) * i11) + ((-605159424) * i3) + ((-1559232512) * i6) + (1553989632 * i2) + (2020540416 * i13);
        int i15 = (i5 * (-2040814728)) + 92927091 + (i * (-2040813538)) + (i9 * (-595)) + (i10 * (-595)) + (i11 * 595) + (i3 * (-2040814133)) + (i6 * (-1614655000)) + (i2 * 500164112) + (i13 * 184877056);
        int i16 = i14 + (i15 * i15 * 1800994816);
        if (i16 != 1) {
            return i16 != 2 ? TuitionPaymentFragmentspecialinlinedviewModeldefault2(objArr) : b(objArr);
        }
        return TuitionPaymentFragmentspecialinlinedviewModeldefault3(objArr);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0025  */
    /* JADX WARN: Code duplicated, block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x0029). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0025
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void c(int r5, byte r6, byte r7, java.lang.Object[] r8) {
        /*
            byte[] r0 = defpackage.getStarRating.$$a
            int r1 = 53 - r6
            int r5 = r5 * 14
            int r5 = r5 + 84
            int r7 = r7 * 52
            int r7 = 56 - r7
            byte[] r1 = new byte[r1]
            int r6 = 52 - r6
            r2 = 0
            if (r0 != 0) goto L17
            r4 = r6
            r5 = r7
            r3 = r2
            goto L29
        L17:
            r3 = r2
        L18:
            byte r4 = (byte) r5
            r1[r3] = r4
            if (r3 != r6) goto L25
            java.lang.String r5 = new java.lang.String
            r5.<init>(r1, r2)
            r8[r2] = r5
            return
        L25:
            int r3 = r3 + 1
            r4 = r0[r7]
        L29:
            int r7 = r7 + 1
            int r5 = r5 + r4
            int r5 = r5 + (-10)
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.getStarRating.c(int, byte, byte, java.lang.Object[]):void");
    }

    /* JADX WARN: Code duplicated, block: B:10:0x002a  */
    /* JADX WARN: Code duplicated, block: B:8:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002a -> B:11:0x002e). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x002a
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void f(int r6, int r7, short r8, java.lang.Object[] r9) {
        /*
            int r6 = r6 * 15
            int r0 = 53 - r6
            byte[] r1 = defpackage.getStarRating.$$d
            int r8 = r8 * 37
            int r8 = r8 + 4
            int r7 = r7 * 15
            int r7 = r7 + 84
            byte[] r0 = new byte[r0]
            int r6 = 52 - r6
            r2 = 0
            if (r1 != 0) goto L19
            r4 = r6
            r7 = r8
            r3 = r2
            goto L2e
        L19:
            r3 = r2
            r5 = r8
            r8 = r7
            r7 = r5
        L1d:
            byte r4 = (byte) r8
            r0[r3] = r4
            if (r3 != r6) goto L2a
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            r9[r2] = r6
            return
        L2a:
            int r3 = r3 + 1
            r4 = r1[r7]
        L2e:
            int r4 = -r4
            int r8 = r8 + r4
            int r8 = r8 + (-8)
            int r7 = r7 + 1
            goto L1d
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.getStarRating.f(int, int, short, java.lang.Object[]):void");
    }

    public getStarRating(Context context, Bitmap.Config config, ColorSpace colorSpace, onQueueTitleChanged onqueuetitlechanged, Scale scale, boolean z, boolean z2, boolean z3, String str, Headers headers, IMediaControllerCallback iMediaControllerCallback, getRatingStyle getratingstyle, CachePolicy cachePolicy, CachePolicy cachePolicy2, CachePolicy cachePolicy3) {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = context;
        this.b = config;
        this.TuitionPaymentFragmentbindingInflater1 = colorSpace;
        this.onTransact = onqueuetitlechanged;
        this.cancelAll = scale;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = z;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = z2;
        this.cancel = z3;
        this.g = str;
        this.d = headers;
        this.notify = iMediaControllerCallback;
        this.INotificationSideChannel = getratingstyle;
        this.asBinder = cachePolicy;
        this.f985a = cachePolicy2;
        this.asInterface = cachePolicy3;
    }

    public final Context TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        int i = 2 % 2;
        int i2 = INotificationSideChannelDefault + 15;
        getInterfaceDescriptor = i2 % 128;
        if (i2 % 2 == 0) {
            return this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ getStarRating(Context context, Bitmap.Config config, ColorSpace colorSpace, onQueueTitleChanged onqueuetitlechanged, Scale scale, boolean z, boolean z2, boolean z3, String str, Headers headers, IMediaControllerCallback iMediaControllerCallback, getRatingStyle getratingstyle, CachePolicy cachePolicy, CachePolicy cachePolicy2, CachePolicy cachePolicy3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        Bitmap.Config config2;
        ColorSpace colorSpaceY_;
        onQueueTitleChanged onqueuetitlechanged2;
        Scale scale2;
        boolean z4;
        boolean z5;
        Headers headersTuitionPaymentFragmentbindingInflater1;
        IMediaControllerCallback iMediaControllerCallback2;
        CachePolicy cachePolicy4;
        if ((i & 2) != 0) {
            config2 = Bitmap.Config.ARGB_8888;
            int i2 = 2 % 2;
        } else {
            config2 = config;
        }
        if ((i & 4) != 0) {
            int i3 = getInterfaceDescriptor + 105;
            INotificationSideChannelDefault = i3 % 128;
            int i4 = i3 % 2;
            colorSpaceY_ = getRatingType.y_();
            int i5 = INotificationSideChannelDefault + 33;
            getInterfaceDescriptor = i5 % 128;
            int i6 = i5 % 2;
            int i7 = 2 % 2;
        } else {
            colorSpaceY_ = colorSpace;
        }
        if ((i & 8) != 0) {
            int i8 = getInterfaceDescriptor + 7;
            INotificationSideChannelDefault = i8 % 128;
            if (i8 % 2 == 0) {
                onQueueTitleChanged onqueuetitlechanged3 = onQueueTitleChanged.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                throw null;
            }
            onqueuetitlechanged2 = onQueueTitleChanged.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        } else {
            onqueuetitlechanged2 = onqueuetitlechanged;
        }
        if ((i & 16) != 0) {
            int i9 = INotificationSideChannelDefault + 77;
            getInterfaceDescriptor = i9 % 128;
            int i10 = i9 % 2;
            scale2 = Scale.FIT;
        } else {
            scale2 = scale;
        }
        boolean z6 = false;
        if ((i & 32) != 0) {
            int i11 = getInterfaceDescriptor;
            int i12 = i11 + 19;
            INotificationSideChannelDefault = i12 % 128;
            int i13 = i12 % 2;
            int i14 = i11 + 53;
            INotificationSideChannelDefault = i14 % 128;
            int i15 = i14 % 2;
            int i16 = 2 % 2;
            z4 = false;
        } else {
            z4 = z;
        }
        if ((i & 64) != 0) {
            int i17 = getInterfaceDescriptor + 65;
            INotificationSideChannelDefault = i17 % 128;
            int i18 = i17 % 2;
        } else {
            z6 = z2;
        }
        if ((i & 128) != 0) {
            int i19 = getInterfaceDescriptor + 97;
            INotificationSideChannelDefault = i19 % 128;
            int i20 = i19 % 2;
            z5 = true;
        } else {
            z5 = z3;
        }
        String str2 = (i & 256) != 0 ? null : str;
        if ((i & 512) != 0) {
            headersTuitionPaymentFragmentbindingInflater1 = getRatingType.TuitionPaymentFragmentbindingInflater1();
            int i21 = 2 % 2;
        } else {
            headersTuitionPaymentFragmentbindingInflater1 = headers;
        }
        if ((i & 1024) != 0) {
            iMediaControllerCallback2 = IMediaControllerCallback.b;
            int i22 = INotificationSideChannelDefault + 111;
            getInterfaceDescriptor = i22 % 128;
            if (i22 % 2 == 0) {
                int i23 = 2 % 2;
            }
        } else {
            iMediaControllerCallback2 = iMediaControllerCallback;
        }
        getRatingStyle getratingstyle2 = (i & 2048) != 0 ? getRatingStyle.TuitionPaymentFragmentbindingInflater1 : getratingstyle;
        CachePolicy cachePolicy5 = (i & 4096) != 0 ? CachePolicy.ENABLED : cachePolicy;
        CachePolicy cachePolicy6 = (i & 8192) != 0 ? CachePolicy.ENABLED : cachePolicy2;
        if ((i & 16384) != 0) {
            int i24 = INotificationSideChannelDefault + 47;
            getInterfaceDescriptor = i24 % 128;
            if (i24 % 2 != 0) {
                CachePolicy cachePolicy7 = CachePolicy.ENABLED;
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            cachePolicy4 = CachePolicy.ENABLED;
        } else {
            cachePolicy4 = cachePolicy3;
        }
        this(context, config2, colorSpaceY_, onqueuetitlechanged2, scale2, z4, z6, z5, str2, headersTuitionPaymentFragmentbindingInflater1, iMediaControllerCallback2, getratingstyle2, cachePolicy5, cachePolicy6, cachePolicy4);
    }

    public final Bitmap.Config TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        int i = 2 % 2;
        int i2 = INotificationSideChannelDefault;
        int i3 = i2 + 15;
        getInterfaceDescriptor = i3 % 128;
        int i4 = i3 % 2;
        Bitmap.Config config = this.b;
        int i5 = i2 + 93;
        getInterfaceDescriptor = i5 % 128;
        int i6 = i5 % 2;
        return config;
    }

    public final ColorSpace x_() {
        int i = 2 % 2;
        int i2 = INotificationSideChannelDefault;
        int i3 = i2 + 99;
        getInterfaceDescriptor = i3 % 128;
        int i4 = i3 % 2;
        ColorSpace colorSpace = this.TuitionPaymentFragmentbindingInflater1;
        int i5 = i2 + 79;
        getInterfaceDescriptor = i5 % 128;
        int i6 = i5 % 2;
        return colorSpace;
    }

    public final onQueueTitleChanged cancel() {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 121;
        int i3 = i2 % 128;
        INotificationSideChannelDefault = i3;
        Object obj = null;
        if (i2 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        onQueueTitleChanged onqueuetitlechanged = this.onTransact;
        int i4 = i3 + 115;
        getInterfaceDescriptor = i4 % 128;
        if (i4 % 2 == 0) {
            return onqueuetitlechanged;
        }
        throw null;
    }

    public final Scale cancelAll() {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 13;
        int i3 = i2 % 128;
        INotificationSideChannelDefault = i3;
        int i4 = i2 % 2;
        Scale scale = this.cancelAll;
        int i5 = i3 + 17;
        getInterfaceDescriptor = i5 % 128;
        if (i5 % 2 == 0) {
            return scale;
        }
        throw null;
    }

    private static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault3(Object[] objArr) {
        getStarRating getstarrating = (getStarRating) objArr[0];
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 15;
        int i3 = i2 % 128;
        INotificationSideChannelDefault = i3;
        int i4 = i2 % 2;
        boolean z = getstarrating.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        int i5 = i3 + 87;
        getInterfaceDescriptor = i5 % 128;
        if (i5 % 2 == 0) {
            return Boolean.valueOf(z);
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final boolean TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor;
        int i3 = i2 + 19;
        INotificationSideChannelDefault = i3 % 128;
        int i4 = i3 % 2;
        boolean z = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        int i5 = i2 + 119;
        INotificationSideChannelDefault = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 72 / 0;
        }
        return z;
    }

    public final boolean g() {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor;
        int i3 = i2 + 125;
        INotificationSideChannelDefault = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        boolean z = this.cancel;
        int i4 = i2 + 63;
        INotificationSideChannelDefault = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 14 / 0;
        }
        return z;
    }

    public final String a() {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor;
        int i3 = i2 + 97;
        INotificationSideChannelDefault = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        String str = this.g;
        int i4 = i2 + 105;
        INotificationSideChannelDefault = i4 % 128;
        if (i4 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public final Headers d() {
        int i = 2 % 2;
        int i2 = INotificationSideChannelDefault;
        int i3 = i2 + 57;
        getInterfaceDescriptor = i3 % 128;
        int i4 = i3 % 2;
        Headers headers = this.d;
        int i5 = i2 + 3;
        getInterfaceDescriptor = i5 % 128;
        int i6 = i5 % 2;
        return headers;
    }

    private static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault2(Object[] objArr) {
        getStarRating getstarrating = (getStarRating) objArr[0];
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor;
        int i3 = i2 + 45;
        INotificationSideChannelDefault = i3 % 128;
        int i4 = i3 % 2;
        IMediaControllerCallback iMediaControllerCallback = getstarrating.notify;
        if (i4 == 0) {
            int i5 = 52 / 0;
        }
        int i6 = i2 + 13;
        INotificationSideChannelDefault = i6 % 128;
        int i7 = i6 % 2;
        return iMediaControllerCallback;
    }

    public final CachePolicy asBinder() {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 3;
        INotificationSideChannelDefault = i2 % 128;
        int i3 = i2 % 2;
        CachePolicy cachePolicy = this.f985a;
        if (i3 == 0) {
            int i4 = 27 / 0;
        }
        return cachePolicy;
    }

    public final CachePolicy asInterface() {
        int i = 2 % 2;
        int i2 = INotificationSideChannelDefault + 67;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        CachePolicy cachePolicy = this.asInterface;
        if (i3 != 0) {
            int i4 = 91 / 0;
        }
        return cachePolicy;
    }

    public static /* synthetic */ getStarRating TuitionPaymentFragmentspecialinlinedviewModeldefault2(getStarRating getstarrating, Bitmap.Config config, CachePolicy cachePolicy) {
        int i = 2 % 2;
        int i2 = INotificationSideChannelDefault + 57;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        Context context = getstarrating.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        ColorSpace colorSpace = getstarrating.TuitionPaymentFragmentbindingInflater1;
        onQueueTitleChanged onqueuetitlechanged = getstarrating.onTransact;
        Scale scale = getstarrating.cancelAll;
        boolean z = getstarrating.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        boolean z2 = getstarrating.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        boolean z3 = getstarrating.cancel;
        Object[] objArr = {context, config, colorSpace, onqueuetitlechanged, scale, Boolean.valueOf(z), Boolean.valueOf(z2), Boolean.valueOf(z3), getstarrating.g, getstarrating.d, getstarrating.notify, getstarrating.INotificationSideChannel, getstarrating.asBinder, getstarrating.f985a, cachePolicy};
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = zzbr.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        getStarRating getstarrating2 = (getStarRating) TuitionPaymentFragmentspecialinlinedviewModeldefault2(25317109, zzbr.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), zzbr.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), iTuitionPaymentFragmentspecialinlinedviewModeldefault3, -25317107, objArr, zzbr.TuitionPaymentFragmentspecialinlinedviewModeldefault3());
        int i4 = getInterfaceDescriptor + 1;
        INotificationSideChannelDefault = i4 % 128;
        if (i4 % 2 != 0) {
            return getstarrating2;
        }
        throw null;
    }

    private static void e(char[] cArr, byte b, int i, Object[] objArr) throws Throwable {
        int i2;
        char c;
        int length;
        char[] cArr2;
        int i3;
        int i4 = 2;
        int i5 = 2 % 2;
        deInitSession deinitsession = new deInitSession();
        char[] cArr3 = INotificationSideChannelStub;
        int i6 = 1770390596;
        Object obj = null;
        if (cArr3 != null) {
            int i7 = $10 + 87;
            $11 = i7 % 128;
            if (i7 % 2 == 0) {
                length = cArr3.length;
                cArr2 = new char[length];
                i3 = 1;
            } else {
                length = cArr3.length;
                cArr2 = new char[length];
                i3 = 0;
            }
            while (i3 < length) {
                int i8 = $10 + 97;
                $11 = i8 % 128;
                if (i8 % i4 == 0) {
                    try {
                        Object[] objArr2 = {Integer.valueOf(cArr3[i3])};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(i6);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                            byte b2 = (byte) 0;
                            byte b3 = (byte) (b2 + 3);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (ImageFormat.getBitsPerPixel(0) + 1), ((byte) KeyEvent.getModifierMetaStateMask()) + 2268, 33 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), -1927765101, false, $$g(b2, b3, (byte) (b3 - 3)), new Class[]{Integer.TYPE});
                        }
                        cArr2[i3] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(obj, objArr2)).charValue();
                        i4 = 2;
                        i6 = 1770390596;
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                } else {
                    try {
                        Object[] objArr3 = {Integer.valueOf(cArr3[i3])};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1770390596);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                            byte b4 = (byte) 0;
                            byte b5 = (byte) (b4 + 3);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) Color.blue(0), 2267 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), (ViewConfiguration.getEdgeSlop() >> 16) + 33, -1927765101, false, $$g(b4, b5, (byte) (b5 - 3)), new Class[]{Integer.TYPE});
                        }
                        cArr2[i3] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).charValue();
                        i3++;
                        i4 = 2;
                        i6 = 1770390596;
                        obj = null;
                    } catch (Throwable th2) {
                        Throwable cause2 = th2.getCause();
                        if (cause2 == null) {
                            throw th2;
                        }
                        throw cause2;
                    }
                }
            }
            int i9 = $11 + 39;
            $10 = i9 % 128;
            int i10 = i9 % 2;
            cArr3 = cArr2;
        }
        Object[] objArr4 = {Integer.valueOf(INotificationSideChannelStubProxy)};
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1770390596);
        char c2 = '0';
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
            byte b6 = (byte) 0;
            byte b7 = (byte) (b6 + 3);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (ViewConfiguration.getScrollBarSize() >> 8), 2268 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), 32 - TextUtils.indexOf((CharSequence) "", '0', 0), -1927765101, false, $$g(b6, b7, (byte) (b7 - 3)), new Class[]{Integer.TYPE});
        }
        char cCharValue = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4)).charValue();
        char[] cArr4 = new char[i];
        if (i % 2 != 0) {
            int i11 = $11 + 123;
            int i12 = i11 % 128;
            $10 = i12;
            int i13 = i11 % 2;
            i2 = i - 1;
            cArr4[i2] = (char) (cArr[i2] - b);
            int i14 = i12 + 117;
            $11 = i14 % 128;
            int i15 = i14 % 2;
        } else {
            i2 = i;
        }
        if (i2 > 1) {
            deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
            while (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 < i2) {
                deinitsession.b = cArr[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3];
                deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = cArr[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1];
                if (deinitsession.b == deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                    cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = (char) (deinitsession.b - b);
                    cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = (char) (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault2 - b);
                    c = c2;
                } else {
                    Object[] objArr5 = {deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(486174475);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        byte b8 = (byte) 0;
                        byte b9 = (byte) (b8 + 2);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (49267 - ExpandableListView.getPackedPositionType(0L)), 3261 - KeyEvent.normalizeMetaState(0), 30 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), -127612708, false, $$g(b8, b9, (byte) (b9 - 2)), new Class[]{Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class});
                    }
                    if (((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).intValue() == deinitsession.asBinder) {
                        Object[] objArr6 = {deinitsession, deinitsession, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), deinitsession, Integer.valueOf(cCharValue), deinitsession};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1187000607);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                            c = '0';
                            byte b10 = (byte) 0;
                            byte b11 = b10;
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b((char) (22926 - AndroidCharacter.getMirror('0')), (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 593, (ViewConfiguration.getLongPressTimeout() >> 16) + 17, 1570859318, false, $$g(b10, b11, b11), new Class[]{Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Integer.TYPE, Object.class});
                        } else {
                            c = '0';
                        }
                        int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr6)).intValue();
                        int i16 = (deinitsession.TuitionPaymentFragmentbindingInflater1 * cCharValue) + deinitsession.asBinder;
                        cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr3[iIntValue];
                        cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = cArr3[i16];
                    } else {
                        c = '0';
                        if (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault1 == deinitsession.TuitionPaymentFragmentbindingInflater1) {
                            deinitsession.g = ((deinitsession.g + cCharValue) - 1) % cCharValue;
                            deinitsession.asBinder = ((deinitsession.asBinder + cCharValue) - 1) % cCharValue;
                            int i17 = (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault1 * cCharValue) + deinitsession.g;
                            int i18 = (deinitsession.TuitionPaymentFragmentbindingInflater1 * cCharValue) + deinitsession.asBinder;
                            cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr3[i17];
                            cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = cArr3[i18];
                        } else {
                            int i19 = (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault1 * cCharValue) + deinitsession.asBinder;
                            int i20 = (deinitsession.TuitionPaymentFragmentbindingInflater1 * cCharValue) + deinitsession.g;
                            cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr3[i19];
                            cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = cArr3[i20];
                        }
                    }
                }
                deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 += 2;
                c2 = c;
            }
        }
        for (int i21 = 0; i21 < i; i21++) {
            cArr4[i21] = (char) (cArr4[i21] ^ 13722);
        }
        objArr[0] = new String(cArr4);
    }

    /* JADX WARN: Code duplicated, block: B:26:0x024e  */
    private static /* synthetic */ Object b(Object[] objArr) throws Throwable {
        Context applicationContext;
        int length;
        Object[] objArr2;
        Context context = (Context) objArr[0];
        Bitmap.Config config = (Bitmap.Config) objArr[1];
        ColorSpace colorSpace = (ColorSpace) objArr[2];
        onQueueTitleChanged onqueuetitlechanged = (onQueueTitleChanged) objArr[3];
        Scale scale = (Scale) objArr[4];
        boolean zBooleanValue = ((Boolean) objArr[5]).booleanValue();
        boolean zBooleanValue2 = ((Boolean) objArr[6]).booleanValue();
        boolean zBooleanValue3 = ((Boolean) objArr[7]).booleanValue();
        String str = (String) objArr[8];
        Headers headers = (Headers) objArr[9];
        IMediaControllerCallback iMediaControllerCallback = (IMediaControllerCallback) objArr[10];
        getRatingStyle getratingstyle = (getRatingStyle) objArr[11];
        CachePolicy cachePolicy = (CachePolicy) objArr[12];
        CachePolicy cachePolicy2 = (CachePolicy) objArr[13];
        CachePolicy cachePolicy3 = (CachePolicy) objArr[14];
        int i = 2 % 2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char windowTouchSlop = (char) ((ViewConfiguration.getWindowTouchSlop() >> 8) + 31533);
            int threadPriority = ((Process.getThreadPriority(0) + 20) >> 6) + 921;
            int i2 = (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 29;
            byte b = $$a[37];
            Object[] objArr3 = new Object[1];
            c(b, (byte) 52, b, objArr3);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(windowTouchSlop, threadPriority, i2, -1048449946, false, (String) objArr3[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr4 = new Object[1];
        e(new char[]{'\b', 19, 2, 11, 5, 16, 3, 6, 7, 21, '\t', 6, '\f', 23, 3, 22, 1, 21, 11, '\t', 5, 22}, (byte) ((ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 92), (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 21, objArr4);
        Class<?> cls = Class.forName((String) objArr4[0]);
        Object[] objArr5 = new Object[1];
        e(new char[]{24, '\r', 7, 19, 23, 24, 4, 21, 24, '\b', '\f', 4, 16, 20, 13829}, (byte) (6 - Color.green(0)), KeyEvent.keyCodeFromString("") + 15, objArr5);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr5[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(889369593);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char doubleTapTimeout = (char) ((ViewConfiguration.getDoubleTapTimeout() >> 16) + 31533);
            int packedPositionType = 921 - ExpandableListView.getPackedPositionType(0L);
            int keyRepeatTimeout = 28 - (ViewConfiguration.getKeyRepeatTimeout() >> 16);
            byte[] bArr = $$a;
            byte b2 = bArr[80];
            Object[] objArr6 = new Object[1];
            c(b2, b2, bArr[37], objArr6);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(doubleTapTimeout, packedPositionType, keyRepeatTimeout, -778300370, false, (String) objArr6[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char scrollDefaultDelay = (char) (31533 - (ViewConfiguration.getScrollDefaultDelay() >> 16));
                int edgeSlop = 921 - (ViewConfiguration.getEdgeSlop() >> 16);
                int iMyTid = (Process.myTid() >> 22) + 28;
                byte[] bArr2 = $$a;
                byte b3 = bArr2[80];
                Object[] objArr7 = new Object[1];
                c(b3, bArr2[33], b3, objArr7);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(scrollDefaultDelay, edgeSlop, iMyTid, -1142834547, false, (String) objArr7[0], null);
            }
            Object[] objArr8 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            objArr2 = new Object[]{new int[1], new int[]{((int[]) objArr8[1])[0]}, (Object[]) objArr8[2], new int[]{((int[]) objArr8[3])[0]}, (String[]) objArr8[4]};
            int iElapsedRealtime = (int) SystemClock.elapsedRealtime();
            int i3 = 1702492072 + (((~(iElapsedRealtime | 660590153)) | (-1734331996)) * 305) + (((~((~iElapsedRealtime) | 660590153)) | (-1113489491)) * 305) + 1321043987;
            int i4 = (i3 << 13) ^ i3;
            int i5 = i4 ^ (i4 >>> 17);
            ((int[]) objArr2[0])[0] = i5 ^ (i5 << 5);
            zBooleanValue3 = zBooleanValue3;
        } else {
            if (context == null) {
                applicationContext = context;
            } else if (context instanceof ContextWrapper) {
                int i6 = getInterfaceDescriptor + 27;
                INotificationSideChannelDefault = i6 % 128;
                if (i6 % 2 == 0) {
                    ((ContextWrapper) context).getBaseContext();
                    throw null;
                }
                if (((ContextWrapper) context).getBaseContext() != null) {
                    applicationContext = context.getApplicationContext();
                } else {
                    applicationContext = null;
                }
            } else {
                applicationContext = context.getApplicationContext();
            }
            if (str != null) {
                int i7 = getInterfaceDescriptor + 97;
                INotificationSideChannelDefault = i7 % 128;
                if (i7 % 2 == 0) {
                    str.length();
                    throw null;
                }
                length = str.length();
            } else {
                length = 0;
            }
            try {
                Object[] objArr9 = {applicationContext, Integer.valueOf(length), 0, 1321043987};
                byte[] bArr3 = $$d;
                byte b4 = bArr3[74];
                Object[] objArr10 = new Object[1];
                f(b4, b4, bArr3[51], objArr10);
                Class<?> cls2 = Class.forName((String) objArr10[0]);
                byte b5 = bArr3[51];
                Object[] objArr11 = new Object[1];
                f(b5, b5, bArr3[74], objArr11);
                Object[] objArr12 = (Object[]) cls2.getMethod((String) objArr11[0], Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr9);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    char c = (char) (31534 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)));
                    int mirror = 969 - AndroidCharacter.getMirror('0');
                    int i8 = (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 27;
                    byte[] bArr4 = $$a;
                    byte b6 = bArr4[80];
                    Object[] objArr13 = new Object[1];
                    c(b6, bArr4[33], b6, objArr13);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(c, mirror, i8, -1142834547, false, (String) objArr13[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr12);
                try {
                    Object[] objArr14 = new Object[1];
                    e(new char[]{'\b', 19, 2, 11, 5, 16, 3, 6, 7, 21, '\t', 6, '\f', 23, 3, 22, 1, 21, 11, '\t', 5, 22}, (byte) ((ViewConfiguration.getKeyRepeatDelay() >> 16) + 92), 22 - TextUtils.indexOf("", "", 0, 0), objArr14);
                    Class<?> cls3 = Class.forName((String) objArr14[0]);
                    Object[] objArr15 = new Object[1];
                    e(new char[]{24, '\r', 7, 19, 23, 24, 4, 21, 24, '\b', '\f', 4, 16, 20, 13829}, (byte) (ExpandableListView.getPackedPositionGroup(0L) + 6), 16 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), objArr15);
                    long jLongValue2 = ((Long) cls3.getDeclaredMethod((String) objArr15[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue2);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(889369593);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                        char c2 = (char) (31534 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)));
                        int doubleTapTimeout2 = (ViewConfiguration.getDoubleTapTimeout() >> 16) + 921;
                        int offsetBefore = TextUtils.getOffsetBefore("", 0) + 28;
                        byte[] bArr5 = $$a;
                        byte b7 = bArr5[80];
                        Object[] objArr16 = new Object[1];
                        c(b7, b7, bArr5[37], objArr16);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(c2, doubleTapTimeout2, offsetBefore, -778300370, false, (String) objArr16[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                        char longPressTimeout = (char) (31533 - (ViewConfiguration.getLongPressTimeout() >> 16));
                        int iAlpha = Color.alpha(0) + 921;
                        int iRed = Color.red(0) + 28;
                        byte b8 = $$a[37];
                        Object[] objArr17 = new Object[1];
                        c(b8, (byte) 52, b8, objArr17);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(longPressTimeout, iAlpha, iRed, -1048449946, false, (String) objArr17[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf2);
                    objArr2 = objArr12;
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
        int i9 = ((int[]) objArr2[1])[0];
        int i10 = ((int[]) objArr2[3])[0];
        if (i10 != i9) {
            ArrayList arrayList = new ArrayList();
            String[] strArr = (String[]) objArr2[4];
            if (strArr != null) {
                int i11 = getInterfaceDescriptor + 5;
                INotificationSideChannelDefault = i11 % 128;
                for (int i12 = i11 % 2 != 0 ? 0 : 1; i12 < strArr.length; i12++) {
                    arrayList.add(strArr[i12]);
                }
            }
            throw new RuntimeException(String.valueOf(i10));
        }
        int i13 = getInterfaceDescriptor + 91;
        INotificationSideChannelDefault = i13 % 128;
        int i14 = i13 % 2;
        int i15 = ((int[]) objArr2[0])[0];
        Object[] objArr18 = {new int[1], new int[]{((int[]) objArr2[1])[0]}, (Object[]) objArr2[2], new int[]{((int[]) objArr2[3])[0]}, (String[]) objArr2[4]};
        int iNextInt = new Random().nextInt(776584007);
        int i16 = ~iNextInt;
        int i17 = i15 + (-720528378) + ((1493023611 | i16) * (-369)) + (((~((-283489081) | i16)) | 1490590563) * (-369)) + (((~(iNextInt | 283489080)) | 1209534531 | (~(i16 | (-2433049)))) * 369);
        int i18 = (i17 << 13) ^ i17;
        int i19 = i18 ^ (i18 >>> 17);
        ((int[]) objArr18[0])[0] = i19 ^ (i19 << 5);
        return new getStarRating(context, config, colorSpace, onqueuetitlechanged, scale, zBooleanValue, zBooleanValue2, zBooleanValue3, str, headers, iMediaControllerCallback, getratingstyle, cachePolicy, cachePolicy2, cachePolicy3);
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0076  */
    /* JADX WARN: Code duplicated, block: B:44:0x00af  */
    /* JADX WARN: Code duplicated, block: B:50:0x00c8 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:51:0x00c9  */
    public final boolean equals(Object other) {
        int i;
        int i2;
        int i3 = 2 % 2;
        if (this == other) {
            int i4 = getInterfaceDescriptor + 95;
            INotificationSideChannelDefault = i4 % 128;
            int i5 = i4 % 2;
            return true;
        }
        if (other instanceof getStarRating) {
            getStarRating getstarrating = (getStarRating) other;
            if (!(!Intrinsics.areEqual(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, getstarrating.TuitionPaymentFragmentspecialinlinedviewModeldefault1))) {
                int i6 = getInterfaceDescriptor + 5;
                INotificationSideChannelDefault = i6 % 128;
                Object obj = null;
                if (i6 % 2 == 0) {
                    Bitmap.Config config = getstarrating.b;
                    obj.hashCode();
                    throw null;
                }
                if (this.b == getstarrating.b && ((Build.VERSION.SDK_INT < 26 || Intrinsics.areEqual(this.TuitionPaymentFragmentbindingInflater1, getstarrating.TuitionPaymentFragmentbindingInflater1)) && Intrinsics.areEqual(this.onTransact, getstarrating.onTransact) && this.cancelAll == getstarrating.cancelAll && this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 == getstarrating.TuitionPaymentFragmentspecialinlinedviewModeldefault3)) {
                    int i7 = getInterfaceDescriptor + 1;
                    INotificationSideChannelDefault = i7 % 128;
                    if (i7 % 2 == 0) {
                        int i8 = 96 / 0;
                        if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 == getstarrating.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                            if (this.cancel == getstarrating.cancel && Intrinsics.areEqual(this.g, getstarrating.g) && Intrinsics.areEqual(this.d, getstarrating.d) && Intrinsics.areEqual(this.notify, getstarrating.notify) && Intrinsics.areEqual(this.INotificationSideChannel, getstarrating.INotificationSideChannel)) {
                                i = getInterfaceDescriptor + 29;
                                i2 = i % 128;
                                INotificationSideChannelDefault = i2;
                                if (i % 2 != 0) {
                                    CachePolicy cachePolicy = getstarrating.asBinder;
                                    obj.hashCode();
                                    throw null;
                                }
                                if (this.asBinder == getstarrating.asBinder && this.f985a == getstarrating.f985a) {
                                    int i9 = i2 + 71;
                                    getInterfaceDescriptor = i9 % 128;
                                    int i10 = i9 % 2;
                                    if (this.asInterface == getstarrating.asInterface) {
                                        return true;
                                    }
                                }
                            }
                        }
                    } else if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 == getstarrating.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                        if (this.cancel == getstarrating.cancel) {
                            i = getInterfaceDescriptor + 29;
                            i2 = i % 128;
                            INotificationSideChannelDefault = i2;
                            if (i % 2 != 0) {
                                CachePolicy cachePolicy2 = getstarrating.asBinder;
                                obj.hashCode();
                                throw null;
                            }
                            if (this.asBinder == getstarrating.asBinder) {
                                int i11 = i2 + 71;
                                getInterfaceDescriptor = i11 % 128;
                                int i12 = i11 % 2;
                                if (this.asInterface == getstarrating.asInterface) {
                                    return true;
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int iHashCode2 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.hashCode();
        int iHashCode3 = this.b.hashCode();
        ColorSpace colorSpace = this.TuitionPaymentFragmentbindingInflater1;
        int iHashCode4 = 0;
        Object obj = null;
        if (colorSpace != null) {
            int i2 = getInterfaceDescriptor + 117;
            INotificationSideChannelDefault = i2 % 128;
            if (i2 % 2 == 0) {
                colorSpace.hashCode();
                obj.hashCode();
                throw null;
            }
            iHashCode = colorSpace.hashCode();
        } else {
            iHashCode = 0;
        }
        int iHashCode5 = this.onTransact.hashCode();
        int iHashCode6 = this.cancelAll.hashCode();
        int iHashCode7 = Boolean.hashCode(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
        int iHashCode8 = Boolean.hashCode(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
        int iHashCode9 = Boolean.hashCode(this.cancel);
        String str = this.g;
        if (str != null) {
            int i3 = INotificationSideChannelDefault + 1;
            getInterfaceDescriptor = i3 % 128;
            if (i3 % 2 != 0) {
                str.hashCode();
                throw null;
            }
            iHashCode4 = str.hashCode();
        }
        int iHashCode10 = this.d.hashCode();
        int iHashCode11 = this.notify.hashCode();
        int iHashCode12 = (((((((((((((((((((((((((((iHashCode2 * 31) + iHashCode3) * 31) + iHashCode) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode4) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + this.INotificationSideChannel.hashCode()) * 31) + this.asBinder.hashCode()) * 31) + this.f985a.hashCode()) * 31) + this.asInterface.hashCode();
        int i4 = getInterfaceDescriptor + 111;
        INotificationSideChannelDefault = i4 % 128;
        int i5 = i4 % 2;
        return iHashCode12;
    }

    private static getStarRating w_(Context context, Bitmap.Config config, ColorSpace colorSpace, onQueueTitleChanged onqueuetitlechanged, Scale scale, boolean z, boolean z2, boolean z3, String str, Headers headers, IMediaControllerCallback iMediaControllerCallback, getRatingStyle getratingstyle, CachePolicy cachePolicy, CachePolicy cachePolicy2, CachePolicy cachePolicy3) {
        Object[] objArr = {context, config, colorSpace, onqueuetitlechanged, scale, Boolean.valueOf(z), Boolean.valueOf(z2), Boolean.valueOf(z3), str, headers, iMediaControllerCallback, getratingstyle, cachePolicy, cachePolicy2, cachePolicy3};
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = zzbr.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        return (getStarRating) TuitionPaymentFragmentspecialinlinedviewModeldefault2(25317109, zzbr.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), zzbr.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), iTuitionPaymentFragmentspecialinlinedviewModeldefault3, -25317107, objArr, zzbr.TuitionPaymentFragmentspecialinlinedviewModeldefault3());
    }

    public final boolean b() {
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = zzbr.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault4 = zzbr.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault5 = zzbr.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        return ((Boolean) TuitionPaymentFragmentspecialinlinedviewModeldefault2(-1007128350, zzbr.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), iTuitionPaymentFragmentspecialinlinedviewModeldefault4, iTuitionPaymentFragmentspecialinlinedviewModeldefault3, 1007128351, new Object[]{this}, iTuitionPaymentFragmentspecialinlinedviewModeldefault5)).booleanValue();
    }

    public final IMediaControllerCallback INotificationSideChannel() {
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = zzbr.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault4 = zzbr.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault5 = zzbr.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        return (IMediaControllerCallback) TuitionPaymentFragmentspecialinlinedviewModeldefault2(1785821996, zzbr.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), iTuitionPaymentFragmentspecialinlinedviewModeldefault4, iTuitionPaymentFragmentspecialinlinedviewModeldefault3, -1785821996, new Object[]{this}, iTuitionPaymentFragmentspecialinlinedviewModeldefault5);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0024  */
    /* JADX WARN: Code duplicated, block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x0026). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0024
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$g(byte r6, byte r7, short r8) {
        /*
            int r8 = r8 * 2
            int r8 = 3 - r8
            int r7 = 116 - r7
            int r6 = r6 * 4
            int r6 = 1 - r6
            byte[] r0 = defpackage.getStarRating.$$c
            byte[] r1 = new byte[r6]
            r2 = 0
            if (r0 != 0) goto L14
            r3 = r6
            r4 = r2
            goto L26
        L14:
            r3 = r2
        L15:
            int r4 = r3 + 1
            byte r5 = (byte) r7
            r1[r3] = r5
            int r8 = r8 + 1
            if (r4 != r6) goto L24
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L24:
            r3 = r0[r8]
        L26:
            int r3 = -r3
            int r7 = r7 + r3
            r3 = r4
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.getStarRating.$$g(byte, byte, short):java.lang.String");
    }
}
