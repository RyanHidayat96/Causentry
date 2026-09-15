package com.bumptech.glide.request;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.Toast;
import androidx.collection.SimpleArrayMap;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.view.ViewCompat;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.Transformation;
import com.bumptech.glide.load.resource.bitmap.DownsampleStrategy;
import com.bumptech.glide.request.BaseRequestOptions;
import com.google.android.libraries.places.internal.zzrf;
import defpackage.CameraSelector;
import defpackage.DisplayOrientedMeteringPointFactory;
import defpackage.ExtendableBuilder;
import defpackage.addPoint;
import defpackage.getCameraControl;
import defpackage.getLifecycleOwner;
import defpackage.getMeteringPointsAf;
import defpackage.getRealtimeCaptureLatency;
import defpackage.getTargetRotation;
import defpackage.getUpdatedCropRect;
import defpackage.getUseCaseGroup;
import defpackage.initSession;
import defpackage.isAutoCancelEnabled;
import defpackage.isMirroring;
import defpackage.onCaptureSuccess;
import defpackage.onImageSaved;
import defpackage.setOrVerifyExpectFrameRateRange;
import defpackage.setSessionOptionUnpacker;
import defpackage.setSurfaceOccupancyPriority;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Random;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;

/* JADX INFO: loaded from: classes3.dex */
public abstract class BaseRequestOptions<T extends BaseRequestOptions<T>> implements Cloneable {
    boolean INotificationSideChannelDefault;
    boolean INotificationSideChannelStub;
    private int RemoteActionCompatParcelizer;
    int TuitionPaymentFragmentbindingInflater1;
    Drawable TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    Drawable TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    boolean f676a;
    int b;
    private boolean connect;
    boolean g;
    Resources.Theme getInterfaceDescriptor;
    Drawable notify;
    int onTransact;
    private boolean write;
    private static final byte[] $$u = {83, -4, -55, -17};
    private static final int $$v = 176;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$s = {29, 88, -118, 32, 45, 28, 0, 17, 10, -33, 42, 28, -24, 50, -6, 24, 5, 0, 35, -34, 32, 35, 1, 17, 10, -27, 44, -17, 49, 5, 12, -4, 19, -13, 31, -18, 32, 35, 1, 17, 10, -35, 49, 0, 17, -6, 30, 7, 29, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -55};
    private static final int $$t = 51;
    private static final byte[] $$j = {65, -122, -65, 2, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -54, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -55, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, -7, 18, 16, 1, 16, 16, 4, -19, 48, 3, 17, 0, 30, -4, 24, -54, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -56};
    private static final int $$k = 19;
    private static final byte[] $$a = {55, -47, -47, 67, -2, -5, -32, 32, 1, -20, 8, -20, -3, 6, -1, -10, -2};
    private static final int $$b = 15;
    private static int getItem = 0;
    private static int getExtras = 1;
    private static long disconnect = -1056141964053818486L;
    private static int getRoot = -83722375;
    float cancelAll = 1.0f;
    CameraSelector TuitionPaymentFragmentspecialinlinedviewModeldefault1 = CameraSelector.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    private Priority getNotifyChildrenChangedOptions = Priority.NORMAL;
    public boolean asBinder = true;
    private int IconCompatParcelizer = -1;
    private int MediaBrowserCompat = -1;
    getCameraControl INotificationSideChannel = setSessionOptionUnpacker.TuitionPaymentFragmentbindingInflater1();
    private boolean read = true;
    getTargetRotation d = new getTargetRotation();
    Map<Class<?>, Transformation<?>> INotificationSideChannelStubProxy = new setSurfaceOccupancyPriority();
    Class<?> cancel = Object.class;
    boolean asInterface = true;

    public static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault1(Object[] objArr, int i, int i2, int i3, int i4, int i5, int i6) {
        int i7 = ~i4;
        int i8 = ~i6;
        int i9 = (~(i7 | i8)) | i;
        int i10 = i6 | i7;
        int i11 = (~(i6 | i)) | (~(i7 | (~i) | i8)) | (~(i | i4));
        int i12 = i + i4 + i3 + (764943627 * i2) + (189947931 * i5);
        int i13 = i12 * i12;
        int i14 = ((i * (-973936384)) - 801505280) + ((-973936384) * i4) + (1838296578 * i9) + (1228335359 * i10) + ((-1228335359) * i11) + (2092695552 * i3) + ((-1475084288) * i2) + ((-1479278592) * i5) + ((-626393088) * i13);
        int i15 = (i * 1860537600) + 224780607 + (i4 * 1860537600) + (i9 * 1034) + (i10 * (-517)) + (i11 * 517) + (i3 * 1860538117) + (i2 * (-1861700041)) + (i5 * (-831392377)) + (i13 * 995229696);
        return i14 + ((i15 * i15) * 1053163520) != 1 ? TuitionPaymentFragmentspecialinlinedviewModeldefault2(objArr) : TuitionPaymentFragmentspecialinlinedviewModeldefault1(objArr);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0025  */
    /* JADX WARN: Code duplicated, block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x0027). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0025
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void k(int r5, byte r6, int r7, java.lang.Object[] r8) {
        /*
            int r5 = r5 + 84
            byte[] r0 = com.bumptech.glide.request.BaseRequestOptions.$$j
            int r7 = 196 - r7
            int r1 = 53 - r6
            byte[] r1 = new byte[r1]
            int r6 = 52 - r6
            r2 = 0
            if (r0 != 0) goto L13
            r3 = r5
            r5 = r6
            r4 = r2
            goto L27
        L13:
            r3 = r2
        L14:
            byte r4 = (byte) r5
            r1[r3] = r4
            int r7 = r7 + 1
            int r4 = r3 + 1
            if (r3 != r6) goto L25
            java.lang.String r5 = new java.lang.String
            r5.<init>(r1, r2)
            r8[r2] = r5
            return
        L25:
            r3 = r0[r7]
        L27:
            int r5 = r5 + r3
            int r5 = r5 + (-11)
            r3 = r4
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.request.BaseRequestOptions.k(int, byte, int, java.lang.Object[]):void");
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0027  */
    /* JADX WARN: Code duplicated, block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x0029). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0027
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void n(short r6, short r7, int r8, java.lang.Object[] r9) {
        /*
            int r6 = r6 * 19
            int r6 = r6 + 65
            byte[] r0 = com.bumptech.glide.request.BaseRequestOptions.$$s
            int r8 = r8 * 7
            int r8 = r8 + 46
            int r7 = r7 * 45
            int r7 = 49 - r7
            byte[] r1 = new byte[r8]
            r2 = 0
            if (r0 != 0) goto L17
            r6 = r7
            r3 = r8
            r4 = r2
            goto L29
        L17:
            r3 = r2
        L18:
            int r4 = r3 + 1
            byte r5 = (byte) r6
            r1[r3] = r5
            if (r4 != r8) goto L27
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L27:
            r3 = r0[r7]
        L29:
            int r7 = r7 + 1
            int r6 = r6 + r3
            int r6 = r6 + (-11)
            r3 = r4
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.request.BaseRequestOptions.n(short, short, int, java.lang.Object[]):void");
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0029  */
    /* JADX WARN: Code duplicated, block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0029 -> B:11:0x0030). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0029
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void o(int r6, byte r7, byte r8, java.lang.Object[] r9) {
        /*
            int r8 = r8 * 2
            int r0 = 14 - r8
            byte[] r1 = com.bumptech.glide.request.BaseRequestOptions.$$a
            int r6 = r6 * 4
            int r6 = r6 + 97
            int r7 = r7 * 2
            int r7 = 3 - r7
            byte[] r0 = new byte[r0]
            int r8 = 13 - r8
            r2 = 0
            if (r1 != 0) goto L19
            r6 = r7
            r4 = r8
            r3 = r2
            goto L30
        L19:
            r3 = r2
        L1a:
            byte r4 = (byte) r6
            int r7 = r7 + 1
            r0[r3] = r4
            if (r3 != r8) goto L29
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            r9[r2] = r6
            return
        L29:
            int r3 = r3 + 1
            r4 = r1[r7]
            r5 = r7
            r7 = r6
            r6 = r5
        L30:
            int r7 = r7 + r4
            int r7 = r7 + 5
            r5 = r7
            r7 = r6
            r6 = r5
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.request.BaseRequestOptions.o(int, byte, byte, java.lang.Object[]):void");
    }

    public /* synthetic */ Object clone() throws CloneNotSupportedException {
        int i = 2 % 2;
        int i2 = getExtras + 81;
        getItem = i2 % 128;
        int i3 = i2 % 2;
        BaseRequestOptions baseRequestOptionsTuitionPaymentFragmentspecialinlinedviewModeldefault3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        int i4 = getItem + 7;
        getExtras = i4 % 128;
        int i5 = i4 % 2;
        return baseRequestOptionsTuitionPaymentFragmentspecialinlinedviewModeldefault3;
    }

    private static void l(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        getRealtimeCaptureLatency getrealtimecapturelatency = new getRealtimeCaptureLatency();
        getrealtimecapturelatency.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i;
        int length = cArr.length;
        long[] jArr = new long[length];
        getrealtimecapturelatency.b = 0;
        while (getrealtimecapturelatency.b < cArr.length) {
            int i3 = $11 + 89;
            $10 = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = getrealtimecapturelatency.b;
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr[getrealtimecapturelatency.b]), getrealtimecapturelatency, getrealtimecapturelatency};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1177060190);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) ((ViewConfiguration.getKeyRepeatTimeout() >> 16) + 19472), (ViewConfiguration.getKeyRepeatDelay() >> 16) + 2624, Gravity.getAbsoluteGravity(0, 0) + 13, -1565121399, false, "F", new Class[]{Integer.TYPE, Object.class, Object.class});
                    }
                    jArr[i4] = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).longValue() ^ (disconnect / 9053247990562531611L);
                    Object[] objArr3 = {getrealtimecapturelatency, getrealtimecapturelatency};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1900663072);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (Gravity.getAbsoluteGravity(0, 0) + 39422), 481 - (ViewConfiguration.getKeyRepeatDelay() >> 16), 37 - (ViewConfiguration.getTouchSlop() >> 8), 1781041463, false, "I", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3);
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            } else {
                int i5 = getrealtimecapturelatency.b;
                Object[] objArr4 = {Integer.valueOf(cArr[getrealtimecapturelatency.b]), getrealtimecapturelatency, getrealtimecapturelatency};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1177060190);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (19472 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1))), 2624 - View.MeasureSpec.makeMeasureSpec(0, 0), MotionEvent.axisFromString("") + 14, -1565121399, false, "F", new Class[]{Integer.TYPE, Object.class, Object.class});
                }
                jArr[i5] = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4)).longValue() ^ (9053247990562531611L ^ disconnect);
                Object[] objArr5 = {getrealtimecapturelatency, getrealtimecapturelatency};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1900663072);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (39422 - Color.alpha(0)), 481 - Color.blue(0), TextUtils.indexOf("", "") + 37, 1781041463, false, "I", new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5);
            }
        }
        char[] cArr2 = new char[length];
        getrealtimecapturelatency.b = 0;
        while (getrealtimecapturelatency.b < cArr.length) {
            int i6 = $10 + 89;
            $11 = i6 % 128;
            if (i6 % 2 == 0) {
                cArr2[getrealtimecapturelatency.b] = (char) jArr[getrealtimecapturelatency.b];
                Object[] objArr6 = {getrealtimecapturelatency, getrealtimecapturelatency};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1900663072);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b((char) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 39423), (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 480, TextUtils.lastIndexOf("", '0', 0) + 38, 1781041463, false, "I", new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr6);
                throw null;
            }
            cArr2[getrealtimecapturelatency.b] = (char) jArr[getrealtimecapturelatency.b];
            Object[] objArr7 = {getrealtimecapturelatency, getrealtimecapturelatency};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1900663072);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b((char) (MotionEvent.axisFromString("") + 39423), ExpandableListView.getPackedPositionChild(0L) + 482, 36 - MotionEvent.axisFromString(""), 1781041463, false, "I", new Class[]{Object.class, Object.class});
            }
            ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).invoke(null, objArr7);
        }
        objArr[0] = new String(cArr2);
    }

    private static void m(char[] cArr, boolean z, int i, int i2, int i3, Object[] objArr) throws Throwable {
        int i4 = 2 % 2;
        setOrVerifyExpectFrameRateRange setorverifyexpectframeraterange = new setOrVerifyExpectFrameRateRange();
        char[] cArr2 = new char[i];
        setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
        while (setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3 < i) {
            int i5 = $10 + 105;
            $11 = i5 % 128;
            int i6 = i5 % 2;
            setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = cArr[setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3];
            cArr2[setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = (char) (i2 + setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
            int i7 = setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr2[i7]), Integer.valueOf(getRoot)};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1545221423);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    byte b = (byte) (-1);
                    byte b2 = (byte) (b + 1);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) ((-1) - ImageFormat.getBitsPerPixel(0)), 3291 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), 31 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), 1199271174, false, $$w(b, b2, b2), new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr2[i7] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                try {
                    Object[] objArr3 = {setorverifyexpectframeraterange, setorverifyexpectframeraterange};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(29209604);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                        byte b3 = (byte) (-1);
                        byte b4 = (byte) (b3 + 1);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (ViewConfiguration.getJumpTapTimeout() >> 16), ((byte) KeyEvent.getModifierMetaStateMask()) + 652, View.MeasureSpec.getSize(0) + 44, -450685997, false, $$w(b3, b4, (byte) (b4 + 1)), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3);
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            } catch (Throwable th2) {
                Throwable cause2 = th2.getCause();
                if (cause2 == null) {
                    throw th2;
                }
                throw cause2;
            }
        }
        if (i3 > 0) {
            int i8 = $11 + 67;
            $10 = i8 % 128;
            int i9 = i8 % 2;
            setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1 = i3;
            char[] cArr3 = new char[i];
            System.arraycopy(cArr2, 0, cArr3, 0, i);
            System.arraycopy(cArr3, 0, cArr2, i - setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1, setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1);
            System.arraycopy(cArr3, setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1, cArr2, 0, i - setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1);
        }
        if (z) {
            int i10 = $11 + 59;
            $10 = i10 % 128;
            int i11 = i10 % 2;
            char[] cArr4 = new char[i];
            setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
            while (setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3 < i) {
                cArr4[setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr2[(i - setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3) - 1];
                Object[] objArr4 = {setorverifyexpectframeraterange, setorverifyexpectframeraterange};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(29209604);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    byte b5 = (byte) (-1);
                    byte b6 = (byte) (b5 + 1);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) TextUtils.getCapsMode("", 0, 0), (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 651, TextUtils.indexOf("", "", 0) + 44, -450685997, false, $$w(b5, b6, (byte) (b6 + 1)), new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
                int i12 = $11 + 101;
                $10 = i12 % 128;
                int i13 = i12 % 2;
            }
            cArr2 = cArr4;
        }
        objArr[0] = new String(cArr2);
        int i14 = $10 + 21;
        $11 = i14 % 128;
        int i15 = i14 % 2;
    }

    public T TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        int i = 2 % 2;
        try {
            T t = (T) super.clone();
            getTargetRotation gettargetrotation = new getTargetRotation();
            t.d = gettargetrotation;
            gettargetrotation.TuitionPaymentFragmentspecialinlinedviewModeldefault1.putAll((SimpleArrayMap<? extends isMirroring<?>, ? extends Object>) this.d.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
            setSurfaceOccupancyPriority setsurfaceoccupancypriority = new setSurfaceOccupancyPriority();
            t.INotificationSideChannelStubProxy = setsurfaceoccupancypriority;
            setsurfaceoccupancypriority.putAll(this.INotificationSideChannelStubProxy);
            t.connect = false;
            t.write = false;
            int i2 = getExtras + 99;
            getItem = i2 % 128;
            int i3 = i2 % 2;
            return t;
        } catch (CloneNotSupportedException e2) {
            throw new RuntimeException(e2);
        }
    }

    private static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault1(Object[] objArr) {
        BaseRequestOptions baseRequestOptions = (BaseRequestOptions) objArr[0];
        int i = 2 % 2;
        int i2 = getItem + 117;
        getExtras = i2 % 128;
        int i3 = i2 % 2;
        boolean z = baseRequestOptions.read;
        if (i3 != 0) {
            return Boolean.valueOf(z);
        }
        throw null;
    }

    public final boolean RemoteActionCompatParcelizer() {
        int i = 2 % 2;
        int i2 = getItem;
        int i3 = i2 + 93;
        getExtras = i3 % 128;
        if (i3 % 2 == 0) {
            if ((this.RemoteActionCompatParcelizer & 9881) != 0) {
                return true;
            }
        } else if ((this.RemoteActionCompatParcelizer & 2048) != 0) {
            return true;
        }
        int i4 = i2 + 51;
        getExtras = i4 % 128;
        if (i4 % 2 != 0) {
            return false;
        }
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002f, code lost:
    
        if (r3 == 0) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0031, code lost:
    
        r0 = 86 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0035, code lost:
    
        return r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0036, code lost:
    
        r1 = r1;
        r1 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x003d, code lost:
    
        throw new java.lang.NullPointerException("Argument must not be null");
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0014, code lost:
    
        if (r5 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0019, code lost:
    
        if (r5 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001b, code lost:
    
        r1 = r1;
        r1 = r1;
        r2 = com.bumptech.glide.request.BaseRequestOptions.getItem + 17;
        r3 = r2 % 128;
        com.bumptech.glide.request.BaseRequestOptions.getExtras = r3;
        r2 = r2 % 2;
        r3 = r3 + 97;
        com.bumptech.glide.request.BaseRequestOptions.getItem = r3 % 128;
        r3 = r3 % 2;
        r5 = (T) TuitionPaymentFragmentspecialinlinedviewModeldefault3(r1, r5);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public T TuitionPaymentFragmentspecialinlinedviewModeldefault3(com.bumptech.glide.load.resource.bitmap.DownsampleStrategy r5) {
        /*
            r4 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.bumptech.glide.request.BaseRequestOptions.getItem
            int r1 = r1 + 27
            int r2 = r1 % 128
            com.bumptech.glide.request.BaseRequestOptions.getExtras = r2
            int r1 = r1 % r0
            if (r1 != 0) goto L17
            isMirroring<com.bumptech.glide.load.resource.bitmap.DownsampleStrategy> r1 = com.bumptech.glide.load.resource.bitmap.DownsampleStrategy.asInterface
            r2 = 48
            int r2 = r2 / 0
            if (r5 == 0) goto L36
            goto L1b
        L17:
            isMirroring<com.bumptech.glide.load.resource.bitmap.DownsampleStrategy> r1 = com.bumptech.glide.load.resource.bitmap.DownsampleStrategy.asInterface
            if (r5 == 0) goto L36
        L1b:
            int r2 = com.bumptech.glide.request.BaseRequestOptions.getItem
            int r2 = r2 + 17
            int r3 = r2 % 128
            com.bumptech.glide.request.BaseRequestOptions.getExtras = r3
            int r2 = r2 % r0
            int r3 = r3 + 97
            int r2 = r3 % 128
            com.bumptech.glide.request.BaseRequestOptions.getItem = r2
            int r3 = r3 % r0
            com.bumptech.glide.request.BaseRequestOptions r5 = r4.TuitionPaymentFragmentspecialinlinedviewModeldefault3(r1, r5)
            if (r3 == 0) goto L35
            r0 = 86
            int r0 = r0 / 0
        L35:
            return r5
        L36:
            java.lang.NullPointerException r5 = new java.lang.NullPointerException
            java.lang.String r0 = "Argument must not be null"
            r5.<init>(r0)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.request.BaseRequestOptions.TuitionPaymentFragmentspecialinlinedviewModeldefault3(com.bumptech.glide.load.resource.bitmap.DownsampleStrategy):com.bumptech.glide.request.BaseRequestOptions");
    }

    public T g() {
        int i = 2 % 2;
        DownsampleStrategy downsampleStrategy = DownsampleStrategy.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        onCaptureSuccess oncapturesuccess = new onCaptureSuccess();
        if (!this.write) {
            TuitionPaymentFragmentspecialinlinedviewModeldefault3(downsampleStrategy);
            int iB = zzrf.b();
            T t = (T) TuitionPaymentFragmentspecialinlinedviewModeldefault1(new Object[]{this, oncapturesuccess, false}, -661265818, zzrf.b(), zzrf.b(), 661265818, zzrf.b(), iB);
            int i2 = getExtras + 119;
            getItem = i2 % 128;
            int i3 = i2 % 2;
            return t;
        }
        BaseRequestOptions baseRequestOptionsTuitionPaymentFragmentspecialinlinedviewModeldefault3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        while (baseRequestOptionsTuitionPaymentFragmentspecialinlinedviewModeldefault3.write) {
            int i4 = getItem + 55;
            getExtras = i4 % 128;
            if (i4 % 2 == 0) {
                baseRequestOptionsTuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
                throw null;
            }
            baseRequestOptionsTuitionPaymentFragmentspecialinlinedviewModeldefault3 = baseRequestOptionsTuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        }
        baseRequestOptionsTuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault3(downsampleStrategy);
        int iB2 = zzrf.b();
        return (T) TuitionPaymentFragmentspecialinlinedviewModeldefault1(new Object[]{baseRequestOptionsTuitionPaymentFragmentspecialinlinedviewModeldefault3, oncapturesuccess, false}, -661265818, zzrf.b(), zzrf.b(), 661265818, zzrf.b(), iB2);
    }

    public T TuitionPaymentFragmentbindingInflater1() {
        int i = 2 % 2;
        DownsampleStrategy downsampleStrategy = DownsampleStrategy.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        onCaptureSuccess oncapturesuccess = new onCaptureSuccess();
        if (!this.write) {
            TuitionPaymentFragmentspecialinlinedviewModeldefault3(downsampleStrategy);
            return (T) TuitionPaymentFragmentspecialinlinedviewModeldefault1(oncapturesuccess);
        }
        int i2 = getExtras + 123;
        getItem = i2 % 128;
        int i3 = i2 % 2;
        BaseRequestOptions baseRequestOptionsTuitionPaymentFragmentspecialinlinedviewModeldefault3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        while (baseRequestOptionsTuitionPaymentFragmentspecialinlinedviewModeldefault3.write) {
            int i4 = getExtras + 81;
            getItem = i4 % 128;
            int i5 = i4 % 2;
            baseRequestOptionsTuitionPaymentFragmentspecialinlinedviewModeldefault3 = baseRequestOptionsTuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        }
        baseRequestOptionsTuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault3(downsampleStrategy);
        T t = (T) baseRequestOptionsTuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault1(oncapturesuccess);
        int i6 = getExtras + 57;
        getItem = i6 % 128;
        int i7 = i6 % 2;
        return t;
    }

    public T asInterface() {
        int i = 2 % 2;
        T t = (T) TuitionPaymentFragmentspecialinlinedviewModeldefault2(DownsampleStrategy.TuitionPaymentFragmentspecialinlinedviewModeldefault3, new DisplayOrientedMeteringPointFactory(), false);
        int i2 = getItem + 75;
        getExtras = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 83 / 0;
        }
        return t;
    }

    public T d() {
        int i = 2 % 2;
        T t = (T) TuitionPaymentFragmentspecialinlinedviewModeldefault2(DownsampleStrategy.TuitionPaymentFragmentspecialinlinedviewModeldefault3, new DisplayOrientedMeteringPointFactory(), true);
        int i2 = getExtras + 121;
        getItem = i2 % 128;
        int i3 = i2 % 2;
        return t;
    }

    public T a() {
        int i = 2 % 2;
        T t = (T) TuitionPaymentFragmentspecialinlinedviewModeldefault2(DownsampleStrategy.TuitionPaymentFragmentbindingInflater1, new getLifecycleOwner(), false);
        int i2 = getItem + 21;
        getExtras = i2 % 128;
        int i3 = i2 % 2;
        return t;
    }

    public T TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        int i = 2 % 2;
        DownsampleStrategy downsampleStrategy = DownsampleStrategy.TuitionPaymentFragmentbindingInflater1;
        getUseCaseGroup getusecasegroup = new getUseCaseGroup();
        if (!(!this.write)) {
            int i2 = getExtras + 125;
            getItem = i2 % 128;
            int i3 = i2 % 2;
            BaseRequestOptions baseRequestOptionsTuitionPaymentFragmentspecialinlinedviewModeldefault3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3();
            while (baseRequestOptionsTuitionPaymentFragmentspecialinlinedviewModeldefault3.write) {
                baseRequestOptionsTuitionPaymentFragmentspecialinlinedviewModeldefault3 = baseRequestOptionsTuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
            }
            baseRequestOptionsTuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault3(downsampleStrategy);
            T t = (T) baseRequestOptionsTuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault1(getusecasegroup);
            int i4 = getItem + 11;
            getExtras = i4 % 128;
            int i5 = i4 % 2;
            return t;
        }
        TuitionPaymentFragmentspecialinlinedviewModeldefault3(downsampleStrategy);
        return (T) TuitionPaymentFragmentspecialinlinedviewModeldefault1(getusecasegroup);
    }

    /* JADX WARN: Code duplicated, block: B:43:0x02b6  */
    /* JADX WARN: Type inference failed for: r3v49, types: [boolean, int] */
    private T TuitionPaymentFragmentspecialinlinedviewModeldefault2(DownsampleStrategy downsampleStrategy, Transformation<Bitmap> transformation, boolean z) throws Throwable {
        T t;
        Object[] objArr;
        char c;
        Object[] objArr2;
        char c2;
        int i = 2 % 2;
        Object obj = null;
        if (z) {
            if (this.write) {
                BaseRequestOptions baseRequestOptionsTuitionPaymentFragmentspecialinlinedviewModeldefault3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3();
                while (!(!baseRequestOptionsTuitionPaymentFragmentspecialinlinedviewModeldefault3.write)) {
                    int i2 = getItem + 97;
                    getExtras = i2 % 128;
                    if (i2 % 2 == 0) {
                        baseRequestOptionsTuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
                        obj.hashCode();
                        throw null;
                    }
                    baseRequestOptionsTuitionPaymentFragmentspecialinlinedviewModeldefault3 = baseRequestOptionsTuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
                }
                baseRequestOptionsTuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault3(downsampleStrategy);
                t = (T) baseRequestOptionsTuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault1(transformation);
                int i3 = getExtras + 9;
                getItem = i3 % 128;
                int i4 = i3 % 2;
            } else {
                TuitionPaymentFragmentspecialinlinedviewModeldefault3(downsampleStrategy);
                t = (T) TuitionPaymentFragmentspecialinlinedviewModeldefault1(transformation);
            }
        } else if (this.write) {
            int i5 = getExtras + 103;
            getItem = i5 % 128;
            int i6 = i5 % 2;
            BaseRequestOptions baseRequestOptionsTuitionPaymentFragmentspecialinlinedviewModeldefault4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3();
            while (baseRequestOptionsTuitionPaymentFragmentspecialinlinedviewModeldefault4.write) {
                baseRequestOptionsTuitionPaymentFragmentspecialinlinedviewModeldefault4 = baseRequestOptionsTuitionPaymentFragmentspecialinlinedviewModeldefault4.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
            }
            baseRequestOptionsTuitionPaymentFragmentspecialinlinedviewModeldefault4.TuitionPaymentFragmentspecialinlinedviewModeldefault3(downsampleStrategy);
            t = (T) TuitionPaymentFragmentspecialinlinedviewModeldefault1(new Object[]{baseRequestOptionsTuitionPaymentFragmentspecialinlinedviewModeldefault4, transformation, false}, -661265818, zzrf.b(), zzrf.b(), 661265818, zzrf.b(), zzrf.b());
        } else {
            TuitionPaymentFragmentspecialinlinedviewModeldefault3(downsampleStrategy);
            t = (T) TuitionPaymentFragmentspecialinlinedviewModeldefault1(new Object[]{this, transformation, false}, -661265818, zzrf.b(), zzrf.b(), 661265818, zzrf.b(), zzrf.b());
        }
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(797565291);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char capsMode = (char) TextUtils.getCapsMode("", 0, 0);
            int i7 = (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 2266;
            int i8 = (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 33;
            byte b = $$j[7];
            byte b2 = b;
            Object[] objArr3 = new Object[1];
            k(b, b2, (short) (b2 | 193), objArr3);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(capsMode, i7, i8, -887667012, false, (String) objArr3[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr4 = new Object[1];
        l(new char[]{64240, 53166, 36951, 25872, 12218, 61549, 50451, 36744, 20598, 9531, 61333, 45241, 34084, 20479, 4235, 58699, 45036, 28851, 17743, 4093, 53414, 42335}, 13649 - Gravity.getAbsoluteGravity(0, 0), objArr4);
        Class<?> cls = Class.forName((String) objArr4[0]);
        Object[] objArr5 = new Object[1];
        m(new char[]{65515, 65533, 65534, '\f', '\t', 65530, 5, 65534, 65534, 6, 2, '\r', 5, 65530, 65534}, true, 15 - TextUtils.indexOf("", ""), KeyEvent.keyCodeFromString("") + 130, KeyEvent.getDeadChar(0, 0) + 8, objArr5);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr5[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(796641770);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char fadingEdgeLength = (char) (ViewConfiguration.getFadingEdgeLength() >> 16);
            int iLastIndexOf = 2266 - TextUtils.lastIndexOf("", '0');
            int iRgb = Color.rgb(0, 0, 0) + 16777249;
            byte b3 = $$j[7];
            byte b4 = b3;
            Object[] objArr6 = new Object[1];
            k(b3, b4, (short) (b4 | 141), objArr6);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(fadingEdgeLength, iLastIndexOf, iRgb, -874156483, false, (String) objArr6[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1013250600);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char cResolveSize = (char) View.resolveSize(0, 0);
                int iAlpha = 2267 - Color.alpha(0);
                int iLastIndexOf2 = 32 - TextUtils.lastIndexOf("", '0', 0);
                byte b5 = $$j[7];
                Object[] objArr7 = new Object[1];
                k(b5, (byte) (b5 | 15), (short) 89, objArr7);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(cResolveSize, iAlpha, iLastIndexOf2, -654680577, false, (String) objArr7[0], null);
            }
            Object[] objArr8 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            objArr = new Object[]{new int[]{i}, strArr, new int[1], new int[]{i}};
            int i9 = ((int[]) objArr8[0])[0];
            int i10 = ((int[]) objArr8[3])[0];
            String[] strArr = (String[]) objArr8[1];
            int iNextInt = new Random().nextInt();
            int i11 = ~iNextInt;
            int i12 = (-722615433) + ((iNextInt | 92529216) * 988) + (((~(96202432 | i11)) | 708837667) * (-1976)) + (((~(iNextInt | (-712510884))) | 92529216 | (~(712510883 | i11))) * 988) + 666225313;
            int i13 = (i12 << 13) ^ i12;
            int i14 = i13 ^ (i13 >>> 17);
            ((int[]) objArr[2])[0] = i14 ^ (i14 << 5);
            c = 3;
        } else {
            Object[] objArr9 = new Object[1];
            l(new char[]{64240, 41202, 20207, 62660, 37578, 14521, 59067, 36068, 10904, 53396, 32355, 9264, 49740, 26715, 5715, 48187, 23095, '%', 44559, 21535, 62401, 39400, 18429, 60895, 35784, 12720}, 23053 - TextUtils.indexOf("", "", 0), objArr9);
            Class<?> cls2 = Class.forName((String) objArr9[0]);
            Object[] objArr10 = new Object[1];
            l(new char[]{64242, 53809, 43849, 32924, 22944, 14038, 3611, 59139, 48201, 38300, 25263, 15327, 4878, 59425, 49475, 40579, 30638, 19674}, (ViewConfiguration.getEdgeSlop() >> 16) + 10453, objArr10);
            Context applicationContext = (Context) cls2.getMethod((String) objArr10[0], new Class[0]).invoke(null, null);
            if (applicationContext != null) {
                if (!(applicationContext instanceof ContextWrapper)) {
                    applicationContext = applicationContext.getApplicationContext();
                } else {
                    int i15 = getExtras + 35;
                    getItem = i15 % 128;
                    int i16 = i15 % 2;
                    if (((ContextWrapper) applicationContext).getBaseContext() != null) {
                        applicationContext = applicationContext.getApplicationContext();
                    } else {
                        applicationContext = null;
                    }
                }
            }
            Object[] objArr11 = new Object[1];
            l(new char[]{64251, 44047, 22297, 65037, 41283, 18438, 62218, 39430, 19726, 62536, 40756, 17949, 59670, 36886, 15110, 57869}, 22271 - (KeyEvent.getMaxKeyCode() >> 16), objArr11);
            Class<?> cls3 = Class.forName((String) objArr11[0]);
            Object[] objArr12 = new Object[1];
            l(new char[]{64248, 59184, 49534, 41904, 36337, 28193, 18555, 10891, 5361, 61725, 54096, 48526, 40942, 31231, 23091, 17535}, (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 7620, objArr12);
            int iIntValue = ((Integer) cls3.getMethod((String) objArr12[0], Object.class).invoke(null, this)).intValue();
            int i17 = getItem + 97;
            getExtras = i17 % 128;
            int i18 = i17 % 2;
            try {
                Object[] objArr13 = {applicationContext, Integer.valueOf(iIntValue), 0, 666225313};
                byte[] bArr = $$s;
                byte b6 = bArr[6];
                Object[] objArr14 = new Object[1];
                n(b6, bArr[22], b6, objArr14);
                Class<?> cls4 = Class.forName((String) objArr14[0]);
                byte b7 = bArr[22];
                byte b8 = b7;
                Object[] objArr15 = new Object[1];
                n(b7, bArr[6], b8, objArr15);
                objArr = (Object[]) cls4.getMethod((String) objArr15[0], Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr13);
                if (applicationContext != null) {
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1013250600);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        char capsMode2 = (char) TextUtils.getCapsMode("", 0, 0);
                        int size = View.MeasureSpec.getSize(0) + 2267;
                        int touchSlop = (ViewConfiguration.getTouchSlop() >> 8) + 33;
                        byte b9 = $$j[7];
                        Object[] objArr16 = new Object[1];
                        k(b9, (byte) (b9 | 15), (short) 89, objArr16);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(capsMode2, size, touchSlop, -654680577, false, (String) objArr16[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr);
                    try {
                        Object[] objArr17 = new Object[1];
                        l(new char[]{64240, 53166, 36951, 25872, 12218, 61549, 50451, 36744, 20598, 9531, 61333, 45241, 34084, 20479, 4235, 58699, 45036, 28851, 17743, 4093, 53414, 42335}, TextUtils.lastIndexOf("", '0', 0) + 13650, objArr17);
                        Class<?> cls5 = Class.forName((String) objArr17[0]);
                        Object[] objArr18 = new Object[1];
                        m(new char[]{65515, 65533, 65534, '\f', '\t', 65530, 5, 65534, 65534, 6, 2, '\r', 5, 65530, 65534}, true, (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 14, TextUtils.indexOf("", "", 0) + 130, 8 - View.MeasureSpec.makeMeasureSpec(0, 0), objArr18);
                        long jLongValue2 = ((Long) cls5.getDeclaredMethod((String) objArr18[0], new Class[0]).invoke(null, new Object[0])).longValue();
                        Long lValueOf = Long.valueOf(jLongValue2);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(796641770);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                            char modifierMetaStateMask = (char) ((-1) - ((byte) KeyEvent.getModifierMetaStateMask()));
                            int i19 = (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 2267;
                            int i20 = (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 32;
                            byte b10 = $$j[7];
                            byte b11 = b10;
                            Object[] objArr19 = new Object[1];
                            k(b10, b11, (short) (b11 | 141), objArr19);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(modifierMetaStateMask, i19, i20, -874156483, false, (String) objArr19[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                        Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(797565291);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                            char c3 = (char) (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1));
                            int fadingEdgeLength2 = 2267 - (ViewConfiguration.getFadingEdgeLength() >> 16);
                            int packedPositionChild = ExpandableListView.getPackedPositionChild(0L) + 34;
                            byte b12 = $$j[7];
                            byte b13 = b12;
                            Object[] objArr20 = new Object[1];
                            k(b12, b13, (short) (b13 | 193), objArr20);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(c3, fadingEdgeLength2, packedPositionChild, -887667012, false, (String) objArr20[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf2);
                    } catch (Exception unused) {
                        throw new RuntimeException();
                    }
                }
                c = 3;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            }
        }
        int i21 = ((int[]) objArr[c])[0];
        int i22 = ((int[]) objArr[0])[0];
        if (i22 == i21) {
            objArr2 = new Object[]{new int[]{i}, strArr, new int[1], new int[]{i}};
            int i23 = ((int[]) objArr[2])[0];
            int i24 = ((int[]) objArr[0])[0];
            int i25 = ((int[]) objArr[3])[0];
            String[] strArr2 = (String[]) objArr[1];
            int iElapsedRealtime = (int) SystemClock.elapsedRealtime();
            int i26 = ~iElapsedRealtime;
            int i27 = i23 + 551288866 + ((63766499 | i26) * (-757)) + ((~((-740425729) | iElapsedRealtime)) * 1514) + (((~(iElapsedRealtime | 804192227)) | (~(i26 | (-744946817))) | 4521088) * 757);
            int i28 = (i27 << 13) ^ i27;
            int i29 = i28 ^ (i28 >>> 17);
            ((int[]) objArr2[2])[0] = i29 ^ (i29 << 5);
            c2 = 2;
        } else {
            ArrayList arrayList = new ArrayList();
            String[] strArr3 = (String[]) objArr[1];
            if (strArr3 != null) {
                int i30 = getExtras + 99;
                getItem = i30 % 128;
                int i31 = i30 % 2;
                for (String str : strArr3) {
                    arrayList.add(str);
                }
            }
            int[] iArr = new int[i22];
            int i32 = i22 - 1;
            iArr[i32] = 1;
            Toast.makeText((Context) null, iArr[((i22 * i32) % 2) - 1], 1).show();
            objArr2 = new Object[]{new int[]{i}, strArr, new int[1], new int[]{i}};
            int i33 = ((int[]) objArr[2])[0];
            int i34 = ((int[]) objArr[0])[0];
            int i35 = ((int[]) objArr[3])[0];
            String[] strArr4 = (String[]) objArr[1];
            int iUptimeMillis = (int) SystemClock.uptimeMillis();
            int i36 = ~iUptimeMillis;
            int i37 = i33 + 1222911479 + (((~(160965751 | i36)) | 637784968) * (-108)) + (((~(i36 | 647747564)) | (~((-647747565) | iUptimeMillis)) | 151003155) * 54) + ((iUptimeMillis | 151003155) * 54);
            int i38 = (i37 << 13) ^ i37;
            int i39 = i38 ^ (i38 >>> 17);
            c2 = 2;
            ((int[]) objArr2[2])[0] = i39 ^ (i39 << 5);
        }
        int i40 = ((int[]) objArr2[c2])[0];
        int i41 = i40 * i40;
        int i42 = -(1640428312 * i40);
        int i43 = ((i41 | i42) << 1) - (i41 ^ i42);
        int i44 = -(i40 * 2022979816);
        int i45 = ((i43 | i44) << 1) - (i44 ^ i43);
        int i46 = (i45 & 333709312) + (333709312 | i45);
        int i47 = ((i46 >> 22) - 2047) / 1024;
        int i48 = (i47 & 1) + (i47 | 1);
        int i49 = (i46 & i48) + (i48 | i46);
        int i50 = i46 >> 18;
        int i51 = -(i49 ^ ((((i50 & (-32767)) + (i50 | (-32767))) / 16384) + 1));
        int i52 = (i51 & 1) + (i51 | 1);
        int i53 = ((i52 >> 27) - 63) / 32;
        int i54 = ((i53 | 1) << 1) - (i53 ^ 1);
        t.asInterface = 1041 / (((-((i54 & 1) + (i54 | 1))) & i52) * 1041);
        return t;
    }

    public T TuitionPaymentFragmentspecialinlinedviewModeldefault1(Transformation<Bitmap> transformation) {
        int i = 2 % 2;
        int i2 = getExtras + 115;
        getItem = i2 % 128;
        int i3 = i2 % 2;
        int iB = zzrf.b();
        T t = (T) TuitionPaymentFragmentspecialinlinedviewModeldefault1(new Object[]{this, transformation, true}, -661265818, zzrf.b(), zzrf.b(), 661265818, zzrf.b(), iB);
        int i4 = getExtras + 91;
        getItem = i4 % 128;
        if (i4 % 2 == 0) {
            return t;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public T b() {
        int i = 2 % 2;
        int i2 = getItem + 79;
        getExtras = i2 % 128;
        int i3 = i2 % 2;
        T t = (T) TuitionPaymentFragmentspecialinlinedviewModeldefault3(addPoint.TuitionPaymentFragmentbindingInflater1, Boolean.TRUE);
        int i4 = getItem + 35;
        getExtras = i4 % 128;
        int i5 = i4 % 2;
        return t;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0038  */
    /* JADX WARN: Code duplicated, block: B:23:0x006b  */
    /* JADX WARN: Code duplicated, block: B:31:0x0093  */
    /* JADX WARN: Code duplicated, block: B:33:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:51:0x0106  */
    /* JADX WARN: Code duplicated, block: B:53:0x0110 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:55:0x0112  */
    public boolean equals(Object obj) {
        int i;
        int i2;
        int i3 = 2 % 2;
        int i4 = getExtras + 35;
        getItem = i4 % 128;
        int i5 = i4 % 2;
        if (obj instanceof BaseRequestOptions) {
            BaseRequestOptions baseRequestOptions = (BaseRequestOptions) obj;
            if (Float.compare(baseRequestOptions.cancelAll, this.cancelAll) == 0) {
                int i6 = getExtras + 117;
                getItem = i6 % 128;
                if (i6 % 2 != 0) {
                    int i7 = 56 / 0;
                    if (this.TuitionPaymentFragmentbindingInflater1 == baseRequestOptions.TuitionPaymentFragmentbindingInflater1) {
                        if (getUpdatedCropRect.TuitionPaymentFragmentbindingInflater1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, baseRequestOptions.TuitionPaymentFragmentspecialinlinedviewModeldefault2) && this.onTransact == baseRequestOptions.onTransact && getUpdatedCropRect.TuitionPaymentFragmentbindingInflater1(this.notify, baseRequestOptions.notify) && this.b == baseRequestOptions.b) {
                            int i8 = getExtras + 107;
                            getItem = i8 % 128;
                            int i9 = i8 % 2;
                            if (getUpdatedCropRect.TuitionPaymentFragmentbindingInflater1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, baseRequestOptions.TuitionPaymentFragmentspecialinlinedviewModeldefault3)) {
                                int i10 = getItem + 65;
                                i = i10 % 128;
                                getExtras = i;
                                int i11 = i10 % 2;
                                if (this.asBinder == baseRequestOptions.asBinder && this.IconCompatParcelizer == baseRequestOptions.IconCompatParcelizer && this.MediaBrowserCompat == baseRequestOptions.MediaBrowserCompat) {
                                    int i12 = i + 105;
                                    getItem = i12 % 128;
                                    int i13 = i12 % 2;
                                    if (this.f676a == baseRequestOptions.f676a) {
                                        int i14 = i + 9;
                                        getItem = i14 % 128;
                                        int i15 = i14 % 2;
                                        if (this.read == baseRequestOptions.read) {
                                            int i16 = i + 55;
                                            getItem = i16 % 128;
                                            int i17 = i16 % 2;
                                            if (this.INotificationSideChannelStub == baseRequestOptions.INotificationSideChannelStub && this.g == baseRequestOptions.g) {
                                                int i18 = i + 47;
                                                getItem = i18 % 128;
                                                int i19 = i18 % 2;
                                                if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.equals(baseRequestOptions.TuitionPaymentFragmentspecialinlinedviewModeldefault1) && this.getNotifyChildrenChangedOptions == baseRequestOptions.getNotifyChildrenChangedOptions && this.d.equals(baseRequestOptions.d)) {
                                                    int i20 = getItem + 85;
                                                    getExtras = i20 % 128;
                                                    int i21 = i20 % 2;
                                                    if (this.INotificationSideChannelStubProxy.equals(baseRequestOptions.INotificationSideChannelStubProxy) && this.cancel.equals(baseRequestOptions.cancel) && getUpdatedCropRect.TuitionPaymentFragmentbindingInflater1(this.INotificationSideChannel, baseRequestOptions.INotificationSideChannel)) {
                                                        i2 = getItem + 37;
                                                        getExtras = i2 % 128;
                                                        if (i2 % 2 != 0) {
                                                            getUpdatedCropRect.TuitionPaymentFragmentbindingInflater1(this.getInterfaceDescriptor, baseRequestOptions.getInterfaceDescriptor);
                                                            Object obj2 = null;
                                                            obj2.hashCode();
                                                            throw null;
                                                        }
                                                        if (getUpdatedCropRect.TuitionPaymentFragmentbindingInflater1(this.getInterfaceDescriptor, baseRequestOptions.getInterfaceDescriptor)) {
                                                            return true;
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                } else if (this.TuitionPaymentFragmentbindingInflater1 == baseRequestOptions.TuitionPaymentFragmentbindingInflater1) {
                    if (getUpdatedCropRect.TuitionPaymentFragmentbindingInflater1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, baseRequestOptions.TuitionPaymentFragmentspecialinlinedviewModeldefault2)) {
                        int i22 = getExtras + 107;
                        getItem = i22 % 128;
                        int i23 = i22 % 2;
                        if (getUpdatedCropRect.TuitionPaymentFragmentbindingInflater1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, baseRequestOptions.TuitionPaymentFragmentspecialinlinedviewModeldefault3)) {
                            int i110 = getItem + 65;
                            i = i110 % 128;
                            getExtras = i;
                            int i111 = i110 % 2;
                            if (this.asBinder == baseRequestOptions.asBinder) {
                                int i112 = i + 105;
                                getItem = i112 % 128;
                                int i113 = i112 % 2;
                                if (this.f676a == baseRequestOptions.f676a) {
                                    int i114 = i + 9;
                                    getItem = i114 % 128;
                                    int i115 = i114 % 2;
                                    if (this.read == baseRequestOptions.read) {
                                        int i116 = i + 55;
                                        getItem = i116 % 128;
                                        int i117 = i116 % 2;
                                        if (this.INotificationSideChannelStub == baseRequestOptions.INotificationSideChannelStub) {
                                            int i118 = i + 47;
                                            getItem = i118 % 128;
                                            int i119 = i118 % 2;
                                            if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.equals(baseRequestOptions.TuitionPaymentFragmentspecialinlinedviewModeldefault1)) {
                                                int i24 = getItem + 85;
                                                getExtras = i24 % 128;
                                                int i25 = i24 % 2;
                                                if (this.INotificationSideChannelStubProxy.equals(baseRequestOptions.INotificationSideChannelStubProxy)) {
                                                    i2 = getItem + 37;
                                                    getExtras = i2 % 128;
                                                    if (i2 % 2 != 0) {
                                                        getUpdatedCropRect.TuitionPaymentFragmentbindingInflater1(this.getInterfaceDescriptor, baseRequestOptions.getInterfaceDescriptor);
                                                        Object obj3 = null;
                                                        obj3.hashCode();
                                                        throw null;
                                                    }
                                                    if (getUpdatedCropRect.TuitionPaymentFragmentbindingInflater1(this.getInterfaceDescriptor, baseRequestOptions.getInterfaceDescriptor)) {
                                                        return true;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = getItem + 67;
        getExtras = i2 % 128;
        int i3 = i2 % 2;
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault1 = getUpdatedCropRect.TuitionPaymentFragmentspecialinlinedviewModeldefault1(this.getInterfaceDescriptor, getUpdatedCropRect.TuitionPaymentFragmentspecialinlinedviewModeldefault1(this.INotificationSideChannel, getUpdatedCropRect.TuitionPaymentFragmentspecialinlinedviewModeldefault1(this.cancel, getUpdatedCropRect.TuitionPaymentFragmentspecialinlinedviewModeldefault1(this.INotificationSideChannelStubProxy, getUpdatedCropRect.TuitionPaymentFragmentspecialinlinedviewModeldefault1(this.d, getUpdatedCropRect.TuitionPaymentFragmentspecialinlinedviewModeldefault1(this.getNotifyChildrenChangedOptions, getUpdatedCropRect.TuitionPaymentFragmentspecialinlinedviewModeldefault1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, getUpdatedCropRect.TuitionPaymentFragmentbindingInflater1(this.g, getUpdatedCropRect.TuitionPaymentFragmentbindingInflater1(this.INotificationSideChannelStub, getUpdatedCropRect.TuitionPaymentFragmentbindingInflater1(this.read, getUpdatedCropRect.TuitionPaymentFragmentbindingInflater1(this.f676a, getUpdatedCropRect.TuitionPaymentFragmentbindingInflater1(this.MediaBrowserCompat, getUpdatedCropRect.TuitionPaymentFragmentbindingInflater1(this.IconCompatParcelizer, getUpdatedCropRect.TuitionPaymentFragmentbindingInflater1(this.asBinder, getUpdatedCropRect.TuitionPaymentFragmentspecialinlinedviewModeldefault1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, getUpdatedCropRect.TuitionPaymentFragmentbindingInflater1(this.b, getUpdatedCropRect.TuitionPaymentFragmentspecialinlinedviewModeldefault1(this.notify, getUpdatedCropRect.TuitionPaymentFragmentbindingInflater1(this.onTransact, getUpdatedCropRect.TuitionPaymentFragmentspecialinlinedviewModeldefault1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, getUpdatedCropRect.TuitionPaymentFragmentbindingInflater1(this.TuitionPaymentFragmentbindingInflater1, getUpdatedCropRect.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.cancelAll)))))))))))))))))))));
        int i4 = getExtras + 11;
        getItem = i4 % 128;
        if (i4 % 2 == 0) {
            return iTuitionPaymentFragmentspecialinlinedviewModeldefault1;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public T asBinder() {
        int i = 2 % 2;
        int i2 = getExtras + 87;
        getItem = i2 % 128;
        if (i2 % 2 != 0) {
            this.connect = false;
        } else {
            this.connect = true;
        }
        return this;
    }

    public T TuitionPaymentFragmentspecialinlinedviewModeldefault1() throws Throwable {
        int i = 2 % 2;
        int i2 = getExtras;
        int i3 = i2 + 55;
        getItem = i3 % 128;
        int i4 = i3 % 2;
        if (!(!this.connect)) {
            int i5 = i2 + 61;
            getItem = i5 % 128;
            if (i5 % 2 != 0) {
                throw null;
            }
            if (!this.write) {
                Object[] objArr = new Object[1];
                l(new char[]{64200, 42081, 18394, 57708, 32910, 9195, 52549, 27814, 3590, 43378, 18567, 59941, 38288, 13558, 54860, 29152, 4877, 45681, 24028, 65335, 40669, 14843, 56149, 31480, 9240, 51066, 26309, '1', 41876, 17142, 60490, 36848, 10525, 51329, 27628, 5447, 46248, 22030, 61739, 37063, 12857, 56722, 31982, 7755, 47531, 23313, 64035, 42447, 18211, 59028, 33274, 9055, 49833, 27734, 3899, 44748, 18475, 60303, 35511, 13399, 55225, 28957, 4221, 46037, 23929, 64743, 40527, 14698, 55492, 31288, 9624, 50428}, 24223 - (Process.myTid() >> 22), objArr);
                throw new IllegalStateException((String) objArr[0]);
            }
        }
        this.write = true;
        return (T) asBinder();
    }

    protected final T read() throws Throwable {
        int i = 2 % 2;
        int i2 = getExtras;
        int i3 = i2 + 9;
        getItem = i3 % 128;
        int i4 = i3 % 2;
        if (this.connect) {
            Object[] objArr = new Object[1];
            l(new char[]{64200, 40277, 13746, 52656, 25694, 64679, 38141, 12114, 51110, 24550, 63007, 36517, 9978, 47450, 20898, 59890, 32856, 6378, 45307, 19279, 58286, 31741, 4678, 43688, 17081, 58742, 32227, 5560, 44102, 17569, 56565, 30551, 3992, 43006, 15938, 54914, 28349, 325, 39327, 12787, 51271, 24727, 63671, 37633}, 26539 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), objArr);
            throw new IllegalStateException((String) objArr[0]);
        }
        int i5 = i2 + 3;
        getItem = i5 % 128;
        if (i5 % 2 == 0) {
            return this;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    protected final boolean getInterfaceDescriptor() {
        int i = 2 % 2;
        int i2 = getExtras + 63;
        int i3 = i2 % 128;
        getItem = i3;
        int i4 = i2 % 2;
        boolean z = this.write;
        int i5 = i3 + 91;
        getExtras = i5 % 128;
        int i6 = i5 % 2;
        return z;
    }

    public final boolean INotificationSideChannelStubProxy() {
        int i = 2 % 2;
        if ((this.RemoteActionCompatParcelizer & 8) != 0) {
            int i2 = getItem + 53;
            getExtras = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        int i4 = getItem + 39;
        getExtras = i4 % 128;
        if (i4 % 2 != 0) {
            return false;
        }
        throw null;
    }

    public final Priority INotificationSideChannelStub() {
        int i = 2 % 2;
        int i2 = getExtras + 51;
        int i3 = i2 % 128;
        getItem = i3;
        if (i2 % 2 != 0) {
            throw null;
        }
        Priority priority = this.getNotifyChildrenChangedOptions;
        int i4 = i3 + 91;
        getExtras = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 56 / 0;
        }
        return priority;
    }

    public final int cancelAll() {
        int i = 2 % 2;
        int i2 = getItem;
        int i3 = i2 + 59;
        getExtras = i3 % 128;
        int i4 = i3 % 2;
        int i5 = this.MediaBrowserCompat;
        int i6 = i2 + 97;
        getExtras = i6 % 128;
        int i7 = i6 % 2;
        return i5;
    }

    public final boolean connect() {
        int i = 2 % 2;
        int i2 = getItem + 29;
        getExtras = i2 % 128;
        int i3 = i2 % 2;
        boolean zTuitionPaymentFragmentspecialinlinedviewModeldefault2 = getUpdatedCropRect.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.MediaBrowserCompat, this.IconCompatParcelizer);
        int i4 = getItem + 117;
        getExtras = i4 % 128;
        if (i4 % 2 != 0) {
            return zTuitionPaymentFragmentspecialinlinedviewModeldefault2;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final int onTransact() {
        int i = 2 % 2;
        int i2 = getExtras + 11;
        getItem = i2 % 128;
        if (i2 % 2 == 0) {
            return this.IconCompatParcelizer;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public T TuitionPaymentFragmentspecialinlinedviewModeldefault1(BaseRequestOptions<?> baseRequestOptions) throws Throwable {
        int i = 2 % 2;
        int i2 = getExtras + 101;
        int i3 = i2 % 128;
        getItem = i3;
        int i4 = i2 % 2;
        if (this.write) {
            return (T) TuitionPaymentFragmentspecialinlinedviewModeldefault3().TuitionPaymentFragmentspecialinlinedviewModeldefault1(baseRequestOptions);
        }
        int i5 = baseRequestOptions.RemoteActionCompatParcelizer;
        if ((i5 & 2) != 0) {
            int i6 = i3 + 27;
            getExtras = i6 % 128;
            int i7 = i6 % 2;
            this.cancelAll = baseRequestOptions.cancelAll;
        }
        if ((262144 & i5) != 0) {
            this.INotificationSideChannelStub = baseRequestOptions.INotificationSideChannelStub;
        }
        if ((1048576 & i5) != 0) {
            this.INotificationSideChannelDefault = baseRequestOptions.INotificationSideChannelDefault;
        }
        if ((i5 & 4) != 0) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = baseRequestOptions.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            int i8 = i3 + 93;
            getExtras = i8 % 128;
            int i9 = i8 % 2;
        }
        if ((i5 & 8) != 0) {
            this.getNotifyChildrenChangedOptions = baseRequestOptions.getNotifyChildrenChangedOptions;
        }
        if ((i5 & 16) != 0) {
            int i10 = getExtras + 67;
            getItem = i10 % 128;
            if (i10 % 2 == 0) {
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = baseRequestOptions.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                this.TuitionPaymentFragmentbindingInflater1 = 0;
                this.RemoteActionCompatParcelizer &= -33;
            }
        }
        if ((baseRequestOptions.RemoteActionCompatParcelizer & 32) != 0) {
            int i11 = getExtras + 113;
            getItem = i11 % 128;
            int i12 = i11 % 2;
            this.TuitionPaymentFragmentbindingInflater1 = baseRequestOptions.TuitionPaymentFragmentbindingInflater1;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = null;
            this.RemoteActionCompatParcelizer &= -17;
        }
        if ((baseRequestOptions.RemoteActionCompatParcelizer & 64) != 0) {
            int i13 = getExtras;
            int i14 = i13 + 1;
            getItem = i14 % 128;
            int i15 = i14 % 2;
            int i16 = i13 + 5;
            getItem = i16 % 128;
            if (i16 % 2 != 0) {
                this.notify = baseRequestOptions.notify;
                this.onTransact = 0;
                this.RemoteActionCompatParcelizer &= 3899;
            } else {
                this.notify = baseRequestOptions.notify;
                this.onTransact = 0;
                this.RemoteActionCompatParcelizer &= -129;
            }
        }
        if ((baseRequestOptions.RemoteActionCompatParcelizer & 128) != 0) {
            this.onTransact = baseRequestOptions.onTransact;
            this.notify = null;
            this.RemoteActionCompatParcelizer &= -65;
        }
        int i17 = baseRequestOptions.RemoteActionCompatParcelizer;
        if ((i17 & 256) != 0) {
            this.asBinder = baseRequestOptions.asBinder;
        }
        if ((i17 & 512) != 0) {
            this.MediaBrowserCompat = baseRequestOptions.MediaBrowserCompat;
            this.IconCompatParcelizer = baseRequestOptions.IconCompatParcelizer;
        }
        if ((i17 & 1024) != 0) {
            this.INotificationSideChannel = baseRequestOptions.INotificationSideChannel;
        }
        if ((i17 & 4096) != 0) {
            this.cancel = baseRequestOptions.cancel;
        }
        if ((i17 & 8192) != 0) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = baseRequestOptions.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            this.b = 0;
            this.RemoteActionCompatParcelizer &= -16385;
        }
        if ((baseRequestOptions.RemoteActionCompatParcelizer & 16384) != 0) {
            this.b = baseRequestOptions.b;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = null;
            this.RemoteActionCompatParcelizer &= -8193;
        }
        int i18 = baseRequestOptions.RemoteActionCompatParcelizer;
        if ((32768 & i18) != 0) {
            int i19 = getExtras + 47;
            getItem = i19 % 128;
            int i20 = i19 % 2;
            this.getInterfaceDescriptor = baseRequestOptions.getInterfaceDescriptor;
        }
        if (!(!((65536 & i18) != 0))) {
            this.read = baseRequestOptions.read;
        }
        if ((131072 & i18) != 0) {
            int i21 = getExtras + 115;
            getItem = i21 % 128;
            int i22 = i21 % 2;
            this.f676a = baseRequestOptions.f676a;
        }
        if ((i18 & 2048) != 0) {
            this.INotificationSideChannelStubProxy.putAll(baseRequestOptions.INotificationSideChannelStubProxy);
            this.asInterface = baseRequestOptions.asInterface;
        }
        if ((baseRequestOptions.RemoteActionCompatParcelizer & 524288) != 0) {
            int i23 = getExtras + 49;
            getItem = i23 % 128;
            int i24 = i23 % 2;
            this.g = baseRequestOptions.g;
        }
        if (!this.read) {
            this.INotificationSideChannelStubProxy.clear();
            int i25 = this.RemoteActionCompatParcelizer;
            this.f676a = false;
            this.RemoteActionCompatParcelizer = i25 & (-133121);
            this.asInterface = true;
        }
        this.RemoteActionCompatParcelizer |= baseRequestOptions.RemoteActionCompatParcelizer;
        this.d.TuitionPaymentFragmentspecialinlinedviewModeldefault1.putAll((SimpleArrayMap<? extends isMirroring<?>, ? extends Object>) baseRequestOptions.d.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
        if (!this.connect) {
            return this;
        }
        Object[] objArr = new Object[1];
        l(new char[]{64200, 40277, 13746, 52656, 25694, 64679, 38141, 12114, 51110, 24550, 63007, 36517, 9978, 47450, 20898, 59890, 32856, 6378, 45307, 19279, 58286, 31741, 4678, 43688, 17081, 58742, 32227, 5560, 44102, 17569, 56565, 30551, 3992, 43006, 15938, 54914, 28349, 325, 39327, 12787, 51271, 24727, 63671, 37633}, ((byte) KeyEvent.getModifierMetaStateMask()) + 26540, objArr);
        throw new IllegalStateException((String) objArr[0]);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0032, code lost:
    
        if (r4.connect != true) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0042, code lost:
    
        if (r4.connect == false) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0044, code lost:
    
        return r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0045, code lost:
    
        r0 = new java.lang.Object[1];
        l(new char[]{64200, 40277, 13746, 52656, 25694, 64679, 38141, 12114, 51110, 24550, 63007, 36517, 9978, 47450, 20898, 59890, 32856, 6378, 45307, 19279, 58286, 31741, 4678, 43688, 17081, 58742, 32227, 5560, 44102, 17569, 56565, 30551, 3992, 43006, 15938, 54914, 28349, 325, 39327, 12787, 51271, 24727, 63671, 37633}, android.text.TextUtils.getCapsMode("", 0, 0) + 26539, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0063, code lost:
    
        throw new java.lang.IllegalStateException((java.lang.String) r0[0]);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public T TuitionPaymentFragmentspecialinlinedviewModeldefault3(java.lang.Class<?> r5) throws java.lang.Throwable {
        /*
            r4 = this;
            r0 = 2
            int r1 = r0 % r0
            boolean r1 = r4.write
            if (r1 == 0) goto L10
            com.bumptech.glide.request.BaseRequestOptions r0 = r4.TuitionPaymentFragmentspecialinlinedviewModeldefault3()
            com.bumptech.glide.request.BaseRequestOptions r5 = r0.TuitionPaymentFragmentspecialinlinedviewModeldefault3(r5)
            return r5
        L10:
            if (r5 == 0) goto L64
            int r1 = com.bumptech.glide.request.BaseRequestOptions.getExtras
            int r2 = r1 + 103
            int r3 = r2 % 128
            com.bumptech.glide.request.BaseRequestOptions.getItem = r3
            int r2 = r2 % r0
            int r1 = r1 + 123
            int r2 = r1 % 128
            com.bumptech.glide.request.BaseRequestOptions.getItem = r2
            int r1 = r1 % r0
            r0 = 1
            if (r1 == 0) goto L35
            r1 = r5
            java.lang.Class r1 = (java.lang.Class) r1
            r4.cancel = r5
            int r5 = r4.RemoteActionCompatParcelizer
            r5 = r5 | 31243(0x7a0b, float:4.3781E-41)
            r4.RemoteActionCompatParcelizer = r5
            boolean r5 = r4.connect
            if (r5 == r0) goto L45
            goto L44
        L35:
            r1 = r5
            java.lang.Class r1 = (java.lang.Class) r1
            r4.cancel = r5
            int r5 = r4.RemoteActionCompatParcelizer
            r5 = r5 | 4096(0x1000, float:5.74E-42)
            r4.RemoteActionCompatParcelizer = r5
            boolean r5 = r4.connect
            if (r5 != 0) goto L45
        L44:
            return r4
        L45:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            r1 = 44
            char[] r1 = new char[r1]
            r1 = {x006c: FILL_ARRAY_DATA , data: [-1336, -25259, 13746, -12880, 25694, -857, -27395, 12114, -14426, 24550, -2529, -29019, 9978, -18086, 20898, -5646, -32680, 6378, -20229, 19279, -7250, 31741, 4678, -21848, 17081, -6794, 32227, 5560, -21434, 17569, -8971, 30551, 3992, -22530, 15938, -10622, 28349, 325, -26209, 12787, -14265, 24727, -1865, -27903} // fill-array
            java.lang.String r2 = ""
            r3 = 0
            int r2 = android.text.TextUtils.getCapsMode(r2, r3, r3)
            int r2 = r2 + 26539
            java.lang.Object[] r0 = new java.lang.Object[r0]
            l(r1, r2, r0)
            r0 = r0[r3]
            java.lang.String r0 = (java.lang.String) r0
            r5.<init>(r0)
            throw r5
        L64:
            java.lang.NullPointerException r5 = new java.lang.NullPointerException
            java.lang.String r0 = "Argument must not be null"
            r5.<init>(r0)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.request.BaseRequestOptions.TuitionPaymentFragmentspecialinlinedviewModeldefault3(java.lang.Class):com.bumptech.glide.request.BaseRequestOptions");
    }

    public T b(CameraSelector cameraSelector) throws Throwable {
        int i = 2 % 2;
        int i2 = getItem;
        int i3 = i2 + 1;
        getExtras = i3 % 128;
        if (i3 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (this.write) {
            return (T) TuitionPaymentFragmentspecialinlinedviewModeldefault3().b(cameraSelector);
        }
        if (cameraSelector == null) {
            throw new NullPointerException("Argument must not be null");
        }
        int i4 = i2 + 57;
        getExtras = i4 % 128;
        int i5 = i4 % 2;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = cameraSelector;
        this.RemoteActionCompatParcelizer |= 4;
        if (!this.connect) {
            return this;
        }
        Object[] objArr = new Object[1];
        l(new char[]{64200, 40277, 13746, 52656, 25694, 64679, 38141, 12114, 51110, 24550, 63007, 36517, 9978, 47450, 20898, 59890, 32856, 6378, 45307, 19279, 58286, 31741, 4678, 43688, 17081, 58742, 32227, 5560, 44102, 17569, 56565, 30551, 3992, 43006, 15938, 54914, 28349, 325, 39327, 12787, 51271, 24727, 63671, 37633}, (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 26539, objArr);
        throw new IllegalStateException((String) objArr[0]);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002e, code lost:
    
        if ((r1 % 2) != 0) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0030, code lost:
    
        r0 = 11 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0033, code lost:
    
        return r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0034, code lost:
    
        r8.TuitionPaymentFragmentbindingInflater1 = r9;
        r9 = r8.RemoteActionCompatParcelizer;
        r8.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = null;
        r8.RemoteActionCompatParcelizer = (r9 | 32) & (-17);
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0043, code lost:
    
        if (r8.connect != false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0045, code lost:
    
        return r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0046, code lost:
    
        r2 = new java.lang.Object[1];
        l(new char[]{64200, 40277, 13746, 52656, 25694, 64679, 38141, 12114, 51110, 24550, 63007, 36517, 9978, 47450, 20898, 59890, 32856, 6378, 45307, 19279, 58286, 31741, 4678, 43688, 17081, 58742, 32227, 5560, 44102, 17569, 56565, 30551, 3992, 43006, 15938, 54914, 28349, 325, 39327, 12787, 51271, 24727, 63671, 37633}, (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0 ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0 ? 0 : -1)) + 26539, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0065, code lost:
    
        throw new java.lang.IllegalStateException((java.lang.String) r2[0]);
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0016, code lost:
    
        if ((!r8.write) != true) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001b, code lost:
    
        if (r8.write != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001d, code lost:
    
        r9 = (T) TuitionPaymentFragmentspecialinlinedviewModeldefault3().TuitionPaymentFragmentspecialinlinedviewModeldefault2(r9);
        r1 = com.bumptech.glide.request.BaseRequestOptions.getItem + 111;
        com.bumptech.glide.request.BaseRequestOptions.getExtras = r1 % 128;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public T TuitionPaymentFragmentspecialinlinedviewModeldefault2(int r9) throws java.lang.Throwable {
        /*
            r8 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.bumptech.glide.request.BaseRequestOptions.getExtras
            int r1 = r1 + 29
            int r2 = r1 % 128
            com.bumptech.glide.request.BaseRequestOptions.getItem = r2
            int r1 = r1 % r0
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L19
            boolean r1 = r8.write
            r4 = 77
            int r4 = r4 / r3
            r1 = r1 ^ r2
            if (r1 == r2) goto L34
            goto L1d
        L19:
            boolean r1 = r8.write
            if (r1 == 0) goto L34
        L1d:
            com.bumptech.glide.request.BaseRequestOptions r1 = r8.TuitionPaymentFragmentspecialinlinedviewModeldefault3()
            com.bumptech.glide.request.BaseRequestOptions r9 = r1.TuitionPaymentFragmentspecialinlinedviewModeldefault2(r9)
            int r1 = com.bumptech.glide.request.BaseRequestOptions.getItem
            int r1 = r1 + 111
            int r2 = r1 % 128
            com.bumptech.glide.request.BaseRequestOptions.getExtras = r2
            int r1 = r1 % r0
            if (r1 != 0) goto L33
            r0 = 11
            int r0 = r0 / r3
        L33:
            return r9
        L34:
            r8.TuitionPaymentFragmentbindingInflater1 = r9
            int r9 = r8.RemoteActionCompatParcelizer
            r0 = 0
            r8.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = r0
            r9 = r9 | 32
            r9 = r9 & (-17)
            r8.RemoteActionCompatParcelizer = r9
            boolean r9 = r8.connect
            if (r9 != 0) goto L46
            return r8
        L46:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            r0 = 44
            char[] r0 = new char[r0]
            r0 = {x0066: FILL_ARRAY_DATA , data: [-1336, -25259, 13746, -12880, 25694, -857, -27395, 12114, -14426, 24550, -2529, -29019, 9978, -18086, 20898, -5646, -32680, 6378, -20229, 19279, -7250, 31741, 4678, -21848, 17081, -6794, 32227, 5560, -21434, 17569, -8971, 30551, 3992, -22530, 15938, -10622, 28349, 325, -26209, 12787, -14265, 24727, -1865, -27903} // fill-array
            long r4 = android.widget.ExpandableListView.getPackedPositionForGroup(r3)
            r6 = 0
            int r1 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            int r1 = r1 + 26539
            java.lang.Object[] r2 = new java.lang.Object[r2]
            l(r0, r1, r2)
            r0 = r2[r3]
            java.lang.String r0 = (java.lang.String) r0
            r9.<init>(r0)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.request.BaseRequestOptions.TuitionPaymentFragmentspecialinlinedviewModeldefault2(int):com.bumptech.glide.request.BaseRequestOptions");
    }

    public T TuitionPaymentFragmentbindingInflater1(Drawable drawable) throws Throwable {
        int i = 2 % 2;
        int i2 = getItem;
        int i3 = i2 + 67;
        getExtras = i3 % 128;
        int i4 = i3 % 2;
        if (this.write) {
            return (T) TuitionPaymentFragmentspecialinlinedviewModeldefault3().TuitionPaymentFragmentbindingInflater1(drawable);
        }
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = drawable;
        int i5 = this.RemoteActionCompatParcelizer;
        this.TuitionPaymentFragmentbindingInflater1 = 0;
        this.RemoteActionCompatParcelizer = (i5 | 16) & (-33);
        if (this.connect) {
            Object[] objArr = new Object[1];
            l(new char[]{64200, 40277, 13746, 52656, 25694, 64679, 38141, 12114, 51110, 24550, 63007, 36517, 9978, 47450, 20898, 59890, 32856, 6378, 45307, 19279, 58286, 31741, 4678, 43688, 17081, 58742, 32227, 5560, 44102, 17569, 56565, 30551, 3992, 43006, 15938, 54914, 28349, 325, 39327, 12787, 51271, 24727, 63671, 37633}, 26540 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), objArr);
            throw new IllegalStateException((String) objArr[0]);
        }
        int i6 = i2 + 95;
        getExtras = i6 % 128;
        int i7 = i6 % 2;
        return this;
    }

    public T TuitionPaymentFragmentspecialinlinedviewModeldefault2(int i, int i2) throws Throwable {
        int i3 = 2 % 2;
        int i4 = getItem + 91;
        int i5 = i4 % 128;
        getExtras = i5;
        if (i4 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (!(!this.write)) {
            return (T) TuitionPaymentFragmentspecialinlinedviewModeldefault3().TuitionPaymentFragmentspecialinlinedviewModeldefault2(i, i2);
        }
        this.MediaBrowserCompat = i;
        this.IconCompatParcelizer = i2;
        this.RemoteActionCompatParcelizer |= 512;
        if (this.connect) {
            Object[] objArr = new Object[1];
            l(new char[]{64200, 40277, 13746, 52656, 25694, 64679, 38141, 12114, 51110, 24550, 63007, 36517, 9978, 47450, 20898, 59890, 32856, 6378, 45307, 19279, 58286, 31741, 4678, 43688, 17081, 58742, 32227, 5560, 44102, 17569, 56565, 30551, 3992, 43006, 15938, 54914, 28349, 325, 39327, 12787, 51271, 24727, 63671, 37633}, 26538 - MotionEvent.axisFromString(""), objArr);
            throw new IllegalStateException((String) objArr[0]);
        }
        int i6 = i5 + 71;
        getItem = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 83 / 0;
        }
        return this;
    }

    public T TuitionPaymentFragmentbindingInflater1(int i) throws Throwable {
        int i2 = 2 % 2;
        int i3 = getExtras + 85;
        int i4 = i3 % 128;
        getItem = i4;
        int i5 = i3 % 2;
        if (this.write) {
            int i6 = i4 + 49;
            getExtras = i6 % 128;
            int i7 = i6 % 2;
            T t = (T) TuitionPaymentFragmentspecialinlinedviewModeldefault3().TuitionPaymentFragmentbindingInflater1(i);
            int i8 = getExtras + 113;
            getItem = i8 % 128;
            if (i8 % 2 != 0) {
                int i9 = 71 / 0;
            }
            return t;
        }
        this.onTransact = i;
        int i10 = this.RemoteActionCompatParcelizer;
        this.notify = null;
        this.RemoteActionCompatParcelizer = (i10 | 128) & (-65);
        if (this.connect) {
            Object[] objArr = new Object[1];
            l(new char[]{64200, 40277, 13746, 52656, 25694, 64679, 38141, 12114, 51110, 24550, 63007, 36517, 9978, 47450, 20898, 59890, 32856, 6378, 45307, 19279, 58286, 31741, 4678, 43688, 17081, 58742, 32227, 5560, 44102, 17569, 56565, 30551, 3992, 43006, 15938, 54914, 28349, 325, 39327, 12787, 51271, 24727, 63671, 37633}, 26538 - Process.getGidForName(""), objArr);
            throw new IllegalStateException((String) objArr[0]);
        }
        int i11 = i4 + 27;
        getExtras = i11 % 128;
        if (i11 % 2 != 0) {
            return this;
        }
        throw null;
    }

    public T TuitionPaymentFragmentspecialinlinedviewModeldefault1(Drawable drawable) throws Throwable {
        int i = 2 % 2;
        int i2 = getExtras;
        int i3 = i2 + 99;
        getItem = i3 % 128;
        int i4 = i3 % 2;
        if (!this.write) {
            this.notify = drawable;
            int i5 = this.RemoteActionCompatParcelizer;
            this.onTransact = 0;
            this.RemoteActionCompatParcelizer = (i5 | 64) & (-129);
            if (!(!this.connect)) {
                Object[] objArr = new Object[1];
                l(new char[]{64200, 40277, 13746, 52656, 25694, 64679, 38141, 12114, 51110, 24550, 63007, 36517, 9978, 47450, 20898, 59890, 32856, 6378, 45307, 19279, 58286, 31741, 4678, 43688, 17081, 58742, 32227, 5560, 44102, 17569, 56565, 30551, 3992, 43006, 15938, 54914, 28349, 325, 39327, 12787, 51271, 24727, 63671, 37633}, (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 26538, objArr);
                throw new IllegalStateException((String) objArr[0]);
            }
            int i6 = i2 + 53;
            getItem = i6 % 128;
            if (i6 % 2 == 0) {
                return this;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i7 = i2 + 33;
        getItem = i7 % 128;
        int i8 = i7 % 2;
        return (T) TuitionPaymentFragmentspecialinlinedviewModeldefault3().TuitionPaymentFragmentspecialinlinedviewModeldefault1(drawable);
    }

    public T b(Priority priority) throws Throwable {
        int i = 2 % 2;
        int i2 = getItem;
        int i3 = i2 + 91;
        getExtras = i3 % 128;
        if (i3 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (this.write) {
            return (T) TuitionPaymentFragmentspecialinlinedviewModeldefault3().b(priority);
        }
        if (priority == null) {
            throw new NullPointerException("Argument must not be null");
        }
        int i4 = i2 + 73;
        getExtras = i4 % 128;
        int i5 = i4 % 2;
        int i6 = i2 + 115;
        getExtras = i6 % 128;
        int i7 = i6 % 2;
        this.getNotifyChildrenChangedOptions = priority;
        this.RemoteActionCompatParcelizer |= 8;
        if (!this.connect) {
            return this;
        }
        Object[] objArr = new Object[1];
        l(new char[]{64200, 40277, 13746, 52656, 25694, 64679, 38141, 12114, 51110, 24550, 63007, 36517, 9978, 47450, 20898, 59890, 32856, 6378, 45307, 19279, 58286, 31741, 4678, 43688, 17081, 58742, 32227, 5560, 44102, 17569, 56565, 30551, 3992, 43006, 15938, 54914, 28349, 325, 39327, 12787, 51271, 24727, 63671, 37633}, 26538 - ((byte) KeyEvent.getModifierMetaStateMask()), objArr);
        throw new IllegalStateException((String) objArr[0]);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002c, code lost:
    
        return r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x002f, code lost:
    
        if (r5 == null) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0031, code lost:
    
        if (r6 == null) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0033, code lost:
    
        r4.d.TuitionPaymentFragmentspecialinlinedviewModeldefault1.put(r5, r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x003e, code lost:
    
        if ((!r4.connect) != true) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0040, code lost:
    
        return r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0041, code lost:
    
        r6 = new java.lang.Object[1];
        l(new char[]{64200, 40277, 13746, 52656, 25694, 64679, 38141, 12114, 51110, 24550, 63007, 36517, 9978, 47450, 20898, 59890, 32856, 6378, 45307, 19279, 58286, 31741, 4678, 43688, 17081, 58742, 32227, 5560, 44102, 17569, 56565, 30551, 3992, 43006, 15938, 54914, 28349, 325, 39327, 12787, 51271, 24727, 63671, 37633}, android.graphics.Color.green(0) + 26539, r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x005c, code lost:
    
        throw new java.lang.IllegalStateException((java.lang.String) r6[0]);
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0062, code lost:
    
        throw new java.lang.NullPointerException("Argument must not be null");
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0068, code lost:
    
        throw new java.lang.NullPointerException("Argument must not be null");
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0014, code lost:
    
        if (r4.write != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0019, code lost:
    
        if (r4.write != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001b, code lost:
    
        r5 = (T) TuitionPaymentFragmentspecialinlinedviewModeldefault3().TuitionPaymentFragmentspecialinlinedviewModeldefault3(r5, r6);
        r6 = com.bumptech.glide.request.BaseRequestOptions.getExtras + 81;
        com.bumptech.glide.request.BaseRequestOptions.getItem = r6 % 128;
        r6 = r6 % 2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public <Y> T TuitionPaymentFragmentspecialinlinedviewModeldefault3(defpackage.isMirroring<Y> r5, Y r6) throws java.lang.Throwable {
        /*
            r4 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.bumptech.glide.request.BaseRequestOptions.getItem
            int r1 = r1 + 85
            int r2 = r1 % 128
            com.bumptech.glide.request.BaseRequestOptions.getExtras = r2
            int r1 = r1 % r0
            r2 = 0
            if (r1 != 0) goto L17
            boolean r1 = r4.write
            r3 = 99
            int r3 = r3 / r2
            if (r1 == 0) goto L2d
            goto L1b
        L17:
            boolean r1 = r4.write
            if (r1 == 0) goto L2d
        L1b:
            com.bumptech.glide.request.BaseRequestOptions r1 = r4.TuitionPaymentFragmentspecialinlinedviewModeldefault3()
            com.bumptech.glide.request.BaseRequestOptions r5 = r1.TuitionPaymentFragmentspecialinlinedviewModeldefault3(r5, r6)
            int r6 = com.bumptech.glide.request.BaseRequestOptions.getExtras
            int r6 = r6 + 81
            int r1 = r6 % 128
            com.bumptech.glide.request.BaseRequestOptions.getItem = r1
            int r6 = r6 % r0
            return r5
        L2d:
            java.lang.String r0 = "Argument must not be null"
            if (r5 == 0) goto L63
            if (r6 == 0) goto L5d
            getTargetRotation r0 = r4.d
            androidx.collection.ArrayMap<isMirroring<?>, java.lang.Object> r0 = r0.TuitionPaymentFragmentspecialinlinedviewModeldefault1
            r0.put(r5, r6)
            boolean r5 = r4.connect
            r6 = 1
            r5 = r5 ^ r6
            if (r5 != r6) goto L41
            return r4
        L41:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            r0 = 44
            char[] r0 = new char[r0]
            r0 = {x006a: FILL_ARRAY_DATA , data: [-1336, -25259, 13746, -12880, 25694, -857, -27395, 12114, -14426, 24550, -2529, -29019, 9978, -18086, 20898, -5646, -32680, 6378, -20229, 19279, -7250, 31741, 4678, -21848, 17081, -6794, 32227, 5560, -21434, 17569, -8971, 30551, 3992, -22530, 15938, -10622, 28349, 325, -26209, 12787, -14265, 24727, -1865, -27903} // fill-array
            int r1 = android.graphics.Color.green(r2)
            int r1 = r1 + 26539
            java.lang.Object[] r6 = new java.lang.Object[r6]
            l(r0, r1, r6)
            r6 = r6[r2]
            java.lang.String r6 = (java.lang.String) r6
            r5.<init>(r6)
            throw r5
        L5d:
            java.lang.NullPointerException r5 = new java.lang.NullPointerException
            r5.<init>(r0)
            throw r5
        L63:
            java.lang.NullPointerException r5 = new java.lang.NullPointerException
            r5.<init>(r0)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.request.BaseRequestOptions.TuitionPaymentFragmentspecialinlinedviewModeldefault3(isMirroring, java.lang.Object):com.bumptech.glide.request.BaseRequestOptions");
    }

    public T TuitionPaymentFragmentspecialinlinedviewModeldefault2(getCameraControl getcameracontrol) throws Throwable {
        int i = 2 % 2;
        if (this.write) {
            T t = (T) TuitionPaymentFragmentspecialinlinedviewModeldefault3().TuitionPaymentFragmentspecialinlinedviewModeldefault2(getcameracontrol);
            int i2 = getExtras + 9;
            getItem = i2 % 128;
            int i3 = i2 % 2;
            return t;
        }
        if (getcameracontrol != null) {
            int i4 = getItem + 11;
            getExtras = i4 % 128;
            int i5 = i4 % 2;
            this.INotificationSideChannel = getcameracontrol;
            this.RemoteActionCompatParcelizer |= 1024;
            if (!this.connect) {
                return this;
            }
            Object[] objArr = new Object[1];
            l(new char[]{64200, 40277, 13746, 52656, 25694, 64679, 38141, 12114, 51110, 24550, 63007, 36517, 9978, 47450, 20898, 59890, 32856, 6378, 45307, 19279, 58286, 31741, 4678, 43688, 17081, 58742, 32227, 5560, 44102, 17569, 56565, 30551, 3992, 43006, 15938, 54914, 28349, 325, 39327, 12787, 51271, 24727, 63671, 37633}, 26539 - ((Process.getThreadPriority(0) + 20) >> 6), objArr);
            throw new IllegalStateException((String) objArr[0]);
        }
        throw new NullPointerException("Argument must not be null");
    }

    public T TuitionPaymentFragmentbindingInflater1(boolean z) {
        int i = 2 % 2;
        int i2 = getItem + 7;
        int i3 = i2 % 128;
        getExtras = i3;
        if (i2 % 2 == 0) {
            throw null;
        }
        if (this.write) {
            return (T) TuitionPaymentFragmentspecialinlinedviewModeldefault3().TuitionPaymentFragmentbindingInflater1(true);
        }
        this.asBinder = !z;
        this.RemoteActionCompatParcelizer |= 256;
        if (this.connect) {
            Object[] objArr = new Object[1];
            l(new char[]{64200, 40277, 13746, 52656, 25694, 64679, 38141, 12114, 51110, 24550, 63007, 36517, 9978, 47450, 20898, 59890, 32856, 6378, 45307, 19279, 58286, 31741, 4678, 43688, 17081, 58742, 32227, 5560, 44102, 17569, 56565, 30551, 3992, 43006, 15938, 54914, 28349, 325, 39327, 12787, 51271, 24727, 63671, 37633}, 26539 - (Process.myPid() >> 22), objArr);
            throw new IllegalStateException((String) objArr[0]);
        }
        int i4 = i3 + 47;
        int i5 = i4 % 128;
        getItem = i5;
        if (i4 % 2 != 0) {
            throw null;
        }
        int i6 = i5 + 97;
        getExtras = i6 % 128;
        int i7 = i6 % 2;
        return this;
    }

    public T TuitionPaymentFragmentspecialinlinedviewModeldefault1(Resources.Theme theme) throws Throwable {
        int i = 2 % 2;
        if (this.write) {
            return (T) TuitionPaymentFragmentspecialinlinedviewModeldefault3().TuitionPaymentFragmentspecialinlinedviewModeldefault1(theme);
        }
        this.getInterfaceDescriptor = theme;
        Object obj = null;
        if (theme != null) {
            int i2 = getItem + 15;
            getExtras = i2 % 128;
            if (i2 % 2 != 0) {
                this.RemoteActionCompatParcelizer = 32768 | this.RemoteActionCompatParcelizer;
                return (T) TuitionPaymentFragmentspecialinlinedviewModeldefault3(ExtendableBuilder.b, theme);
            }
            this.RemoteActionCompatParcelizer = 32768 | this.RemoteActionCompatParcelizer;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3(ExtendableBuilder.b, theme);
            obj.hashCode();
            throw null;
        }
        this.RemoteActionCompatParcelizer &= -32769;
        isMirroring<Resources.Theme> ismirroring = ExtendableBuilder.b;
        int i3 = getExtras + 3;
        getItem = i3 % 128;
        int i4 = i3 % 2;
        BaseRequestOptions<T> baseRequestOptionsTuitionPaymentFragmentspecialinlinedviewModeldefault3 = this;
        while (baseRequestOptionsTuitionPaymentFragmentspecialinlinedviewModeldefault3.write) {
            int i5 = getExtras + 3;
            getItem = i5 % 128;
            if (i5 % 2 != 0) {
                baseRequestOptionsTuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
                throw null;
            }
            baseRequestOptionsTuitionPaymentFragmentspecialinlinedviewModeldefault3 = baseRequestOptionsTuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        }
        baseRequestOptionsTuitionPaymentFragmentspecialinlinedviewModeldefault3.d.TuitionPaymentFragmentspecialinlinedviewModeldefault1.remove(ismirroring);
        if (baseRequestOptionsTuitionPaymentFragmentspecialinlinedviewModeldefault3.connect) {
            Object[] objArr = new Object[1];
            l(new char[]{64200, 40277, 13746, 52656, 25694, 64679, 38141, 12114, 51110, 24550, 63007, 36517, 9978, 47450, 20898, 59890, 32856, 6378, 45307, 19279, 58286, 31741, 4678, 43688, 17081, 58742, 32227, 5560, 44102, 17569, 56565, 30551, 3992, 43006, 15938, 54914, 28349, 325, 39327, 12787, 51271, 24727, 63671, 37633}, 26539 - TextUtils.getTrimmedLength(""), objArr);
            throw new IllegalStateException((String) objArr[0]);
        }
        int i6 = getExtras + 77;
        getItem = i6 % 128;
        if (i6 % 2 == 0) {
            return baseRequestOptionsTuitionPaymentFragmentspecialinlinedviewModeldefault3;
        }
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault2(Object[] objArr) throws Throwable {
        BaseRequestOptions baseRequestOptionsTuitionPaymentFragmentspecialinlinedviewModeldefault3 = (BaseRequestOptions) objArr[0];
        Transformation transformation = (Transformation) objArr[1];
        boolean zBooleanValue = ((Boolean) objArr[2]).booleanValue();
        int i = 2 % 2;
        while (!(!baseRequestOptionsTuitionPaymentFragmentspecialinlinedviewModeldefault3.write)) {
            int i2 = getItem + 29;
            getExtras = i2 % 128;
            int i3 = i2 % 2;
            baseRequestOptionsTuitionPaymentFragmentspecialinlinedviewModeldefault3 = baseRequestOptionsTuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        }
        onImageSaved onimagesaved = new onImageSaved(transformation, zBooleanValue);
        baseRequestOptionsTuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault3(Bitmap.class, transformation, zBooleanValue);
        baseRequestOptionsTuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault3(Drawable.class, onimagesaved, zBooleanValue);
        baseRequestOptionsTuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault3(BitmapDrawable.class, onimagesaved, zBooleanValue);
        baseRequestOptionsTuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault3(isAutoCancelEnabled.class, new getMeteringPointsAf(transformation), zBooleanValue);
        if (baseRequestOptionsTuitionPaymentFragmentspecialinlinedviewModeldefault3.connect) {
            Object[] objArr2 = new Object[1];
            l(new char[]{64200, 40277, 13746, 52656, 25694, 64679, 38141, 12114, 51110, 24550, 63007, 36517, 9978, 47450, 20898, 59890, 32856, 6378, 45307, 19279, 58286, 31741, 4678, 43688, 17081, 58742, 32227, 5560, 44102, 17569, 56565, 30551, 3992, 43006, 15938, 54914, 28349, 325, 39327, 12787, 51271, 24727, 63671, 37633}, 26540 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), objArr2);
            throw new IllegalStateException((String) objArr2[0]);
        }
        int i4 = getItem + 91;
        getExtras = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 83 / 0;
        }
        return baseRequestOptionsTuitionPaymentFragmentspecialinlinedviewModeldefault3;
    }

    private <Y> T TuitionPaymentFragmentspecialinlinedviewModeldefault3(Class<Y> cls, Transformation<Y> transformation, boolean z) throws Throwable {
        int i = 2 % 2;
        BaseRequestOptions<T> baseRequestOptionsTuitionPaymentFragmentspecialinlinedviewModeldefault3 = this;
        while (baseRequestOptionsTuitionPaymentFragmentspecialinlinedviewModeldefault3.write) {
            int i2 = getExtras + 87;
            getItem = i2 % 128;
            if (i2 % 2 != 0) {
                baseRequestOptionsTuitionPaymentFragmentspecialinlinedviewModeldefault3 = baseRequestOptionsTuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
                int i3 = 34 / 0;
            } else {
                baseRequestOptionsTuitionPaymentFragmentspecialinlinedviewModeldefault3 = baseRequestOptionsTuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
            }
        }
        if (transformation != null) {
            baseRequestOptionsTuitionPaymentFragmentspecialinlinedviewModeldefault3.INotificationSideChannelStubProxy.put(cls, transformation);
            int i4 = baseRequestOptionsTuitionPaymentFragmentspecialinlinedviewModeldefault3.RemoteActionCompatParcelizer;
            baseRequestOptionsTuitionPaymentFragmentspecialinlinedviewModeldefault3.read = true;
            baseRequestOptionsTuitionPaymentFragmentspecialinlinedviewModeldefault3.RemoteActionCompatParcelizer = 67584 | i4;
            baseRequestOptionsTuitionPaymentFragmentspecialinlinedviewModeldefault3.asInterface = false;
            if (z) {
                baseRequestOptionsTuitionPaymentFragmentspecialinlinedviewModeldefault3.RemoteActionCompatParcelizer = i4 | 198656;
                baseRequestOptionsTuitionPaymentFragmentspecialinlinedviewModeldefault3.f676a = true;
            }
            if (!(!baseRequestOptionsTuitionPaymentFragmentspecialinlinedviewModeldefault3.connect)) {
                Object[] objArr = new Object[1];
                l(new char[]{64200, 40277, 13746, 52656, 25694, 64679, 38141, 12114, 51110, 24550, 63007, 36517, 9978, 47450, 20898, 59890, 32856, 6378, 45307, 19279, 58286, 31741, 4678, 43688, 17081, 58742, 32227, 5560, 44102, 17569, 56565, 30551, 3992, 43006, 15938, 54914, 28349, 325, 39327, 12787, 51271, 24727, 63671, 37633}, 26539 - (ViewConfiguration.getTapTimeout() >> 16), objArr);
                throw new IllegalStateException((String) objArr[0]);
            }
            int i5 = getExtras + 17;
            getItem = i5 % 128;
            int i6 = i5 % 2;
            return baseRequestOptionsTuitionPaymentFragmentspecialinlinedviewModeldefault3;
        }
        throw new NullPointerException("Argument must not be null");
    }

    public T TuitionPaymentFragmentspecialinlinedviewModeldefault1(boolean z) throws Throwable {
        int i = 2 % 2;
        int i2 = getItem;
        int i3 = i2 + 57;
        getExtras = i3 % 128;
        int i4 = i3 % 2;
        if (!(!this.write)) {
            T t = (T) TuitionPaymentFragmentspecialinlinedviewModeldefault3().TuitionPaymentFragmentspecialinlinedviewModeldefault1(z);
            int i5 = getItem + 97;
            getExtras = i5 % 128;
            int i6 = i5 % 2;
            return t;
        }
        this.INotificationSideChannelDefault = z;
        this.RemoteActionCompatParcelizer |= 1048576;
        if (this.connect) {
            Object[] objArr = new Object[1];
            l(new char[]{64200, 40277, 13746, 52656, 25694, 64679, 38141, 12114, 51110, 24550, 63007, 36517, 9978, 47450, 20898, 59890, 32856, 6378, 45307, 19279, 58286, 31741, 4678, 43688, 17081, 58742, 32227, 5560, 44102, 17569, 56565, 30551, 3992, 43006, 15938, 54914, 28349, 325, 39327, 12787, 51271, 24727, 63671, 37633}, View.MeasureSpec.getSize(0) + 26539, objArr);
            throw new IllegalStateException((String) objArr[0]);
        }
        int i7 = i2 + 69;
        getExtras = i7 % 128;
        int i8 = i7 % 2;
        return this;
    }

    public final boolean INotificationSideChannelDefault() {
        int iB = zzrf.b();
        return ((Boolean) TuitionPaymentFragmentspecialinlinedviewModeldefault1(new Object[]{this}, -81499774, zzrf.b(), zzrf.b(), 81499775, zzrf.b(), iB)).booleanValue();
    }

    private T TuitionPaymentFragmentspecialinlinedviewModeldefault2(Transformation<Bitmap> transformation, boolean z) {
        Object[] objArr = {this, transformation, Boolean.valueOf(z)};
        int iB = zzrf.b();
        return (T) TuitionPaymentFragmentspecialinlinedviewModeldefault1(objArr, -661265818, zzrf.b(), zzrf.b(), 661265818, zzrf.b(), iB);
    }

    /* JADX WARN: Code duplicated, block: B:118:0x0b74 A[PHI: r0
  0x0b74: PHI (r0v36 java.lang.reflect.Method) = (r0v35 java.lang.reflect.Method), (r0v37 java.lang.reflect.Method) binds: [B:117:0x0b72, B:114:0x0b6d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:119:0x0b79  */
    /* JADX WARN: Code duplicated, block: B:134:0x0804 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:138:0x08ff A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:139:0x08ff A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:51:0x06d4 A[PHI: r0
  0x06d4: PHI (r0v152 java.lang.Object[]) = (r0v151 java.lang.Object[]), (r0v202 java.lang.Object[]) binds: [B:50:0x06d2, B:45:0x0697] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:53:0x06df  */
    /* JADX WARN: Code duplicated, block: B:55:0x06eb  */
    /* JADX WARN: Code duplicated, block: B:56:0x0711  */
    /* JADX WARN: Code duplicated, block: B:59:0x0798  */
    /* JADX WARN: Code duplicated, block: B:60:0x07a6  */
    /* JADX WARN: Code duplicated, block: B:65:0x080d  */
    /* JADX WARN: Code duplicated, block: B:68:0x0855  */
    /* JADX WARN: Code duplicated, block: B:72:0x08ab A[Catch: all -> 0x0b88, TryCatch #1 {all -> 0x0b88, blocks: (B:70:0x0894, B:72:0x08ab, B:73:0x08f2, B:85:0x095f, B:87:0x096c, B:88:0x09ac, B:90:0x09cb, B:91:0x0a16), top: B:131:0x0894 }] */
    public static int TuitionPaymentFragmentbindingInflater1(List list) throws Throwable {
        int i;
        int i2;
        boolean z;
        int i3;
        int i4;
        String string;
        Method method;
        int iIndexOf;
        int i5;
        int i6;
        int i7;
        int i8;
        int iB;
        int i9;
        int i10;
        char[] cArr;
        int i11;
        boolean z2;
        int iB2;
        int i12;
        Object[] objArr;
        int i13;
        int i14;
        int iB3;
        int i15;
        int i16;
        char[] cArr2;
        boolean z3;
        int fadingEdgeLength;
        int i17;
        int i18;
        int iB4;
        int i19;
        Object[] objArr2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5;
        int i20 = 2;
        int i21 = 2 % 2;
        int i22 = getItem + 113;
        getExtras = i22 % 128;
        int i23 = i22 % 2;
        int i24 = 1;
        byte b = (byte) ($$a[8] - 1);
        byte b2 = b;
        Object[] objArr3 = new Object[1];
        o(b, b2, b2, objArr3);
        int i25 = 0;
        Method[] methodArr = {OkHttpClient.Builder.class.getMethod((String) objArr3[0], Interceptor.class)};
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
            char fadingEdgeLength2 = (char) (ViewConfiguration.getFadingEdgeLength() >> 16);
            int iAlpha = 2823 - Color.alpha(0);
            int gidForName = 21 - Process.getGidForName("");
            byte b3 = $$j[7];
            byte b4 = b3;
            Object[] objArr4 = new Object[1];
            k(b3, b4, (short) (b4 | 52), objArr4);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(fadingEdgeLength2, iAlpha, gidForName, 1814927978, false, (String) objArr4[0], null);
        }
        int i26 = 24;
        if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).get(null) == null) {
            zzrf.b();
            zzrf.b();
            Method[] declaredMethods = ((Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (ViewConfiguration.getDoubleTapTimeout() >> 16), 2823 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), 22 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)))).getDeclaredMethods();
            int length = declaredMethods.length;
            int i27 = 0;
            while (i27 < length) {
                Method method2 = declaredMethods[i27];
                try {
                    char[] cArr3 = new char[i26];
                    // fill-array-data instruction
                    cArr3[0] = 20;
                    cArr3[1] = '\b';
                    cArr3[2] = 15;
                    cArr3[3] = 4;
                    cArr3[4] = '\n';
                    cArr3[5] = 1;
                    cArr3[6] = 22;
                    cArr3[7] = 1;
                    cArr3[8] = 65486;
                    cArr3[9] = '\f';
                    cArr3[10] = 1;
                    cArr3[11] = 14;
                    cArr3[12] = 7;
                    cArr3[13] = 65486;
                    cArr3[14] = 18;
                    cArr3[15] = 5;
                    cArr3[16] = 6;
                    cArr3[17] = '\f';
                    cArr3[18] = 5;
                    cArr3[19] = 3;
                    cArr3[20] = 20;
                    cArr3[21] = 65486;
                    cArr3[22] = 65517;
                    cArr3[23] = 5;
                    int iIndexOf2 = 24 - TextUtils.indexOf("", "");
                    int touchSlop = ViewConfiguration.getTouchSlop() >> 8;
                    int iB5 = zzrf.b();
                    int i28 = ~touchSlop;
                    int i29 = (((touchSlop * (-520)) - (-64206)) - (~(-(-((~(((i28 ^ 123) | (i28 & 123)) | iB5)) * 521))))) - i24;
                    int i30 = ~((-124) | touchSlop);
                    int i31 = i29 + (i30 * (-1042));
                    int i32 = ~touchSlop;
                    int i33 = getItem + 55;
                    getExtras = i33 % 128;
                    int i34 = i33 % i20;
                    int i35 = ~iB5;
                    int i36 = ~((i32 & i35) | (i32 ^ i35) | 123);
                    int i37 = -(-(521 * ((i36 & i30) | (i30 ^ i36))));
                    int i38 = (i31 & i37) + (i37 | i31);
                    Object[] objArr5 = new Object[i24];
                    m(cArr3, false, iIndexOf2, i38, (-16777213) - (~(-Color.rgb(i25, i25, i25))), objArr5);
                    Class<?> cls = Class.forName((String) objArr5[i25]);
                    int capsMode = TextUtils.getCapsMode("", i25, i25);
                    int iB6 = zzrf.b();
                    int i39 = capsMode * 659;
                    int i40 = (i39 ^ (-7884)) + ((i39 & (-7884)) << i24);
                    int i41 = ~capsMode;
                    int i42 = ~((i41 ^ 12) | (i41 & 12));
                    int i43 = ~((-13) | capsMode);
                    int i44 = (i42 ^ i43) | (i43 & i42);
                    int i45 = ~((capsMode ^ iB6) | (capsMode & iB6));
                    int i46 = ((i40 + (((i44 ^ i45) | (i44 & i45)) * (-658))) - (~((~(((-13) ^ capsMode) | ((-13) & capsMode))) * 658))) - i24;
                    int i47 = ~(((-13) & capsMode) | ((-13) ^ capsMode));
                    int i48 = ~(capsMode | iB6);
                    int i49 = ((i47 & i48) | (i47 ^ i48)) * 658;
                    int i50 = ((i46 | i49) << i24) - (i49 ^ i46);
                    int i51 = 130 - (~(-(-TextUtils.getOffsetAfter("", i25))));
                    int i52 = -(SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1));
                    int iB7 = zzrf.b();
                    int i53 = (i52 * 398) - 4752;
                    int i54 = ~i52;
                    int i55 = ~iB7;
                    int i56 = ~((i54 ^ i55) | (i54 & i55));
                    int i57 = ~i52;
                    int i58 = ~((i57 ^ 12) | (i57 & 12));
                    int i59 = (i56 ^ i58) | (i56 & i58);
                    int i60 = ~((i55 & 12) | (i55 ^ 12));
                    int i61 = -(-(((i60 & i59) | (i59 ^ i60)) * (-397)));
                    int i62 = ((((i53 | i61) << 1) - (i61 ^ i53)) - (~(i58 * (-397)))) - 1;
                    int i63 = iB7 | i58;
                    int i64 = ~(((-13) & i52) | ((-13) ^ i52));
                    int i65 = ((i63 & i64) | (i63 ^ i64)) * 397;
                    Object[] objArr6 = new Object[1];
                    m(new char[]{'\n', 65533, 1, 65534, 1, 65532, 7, 65509, '\f', 65533, 65535, 11}, true, i50, i51, (i62 & i65) + (i65 | i62), objArr6);
                    Object[] objArr7 = {Integer.valueOf(((Integer) cls.getMethod((String) objArr6[0], null).invoke(method2, null)).intValue())};
                    char[] cArr4 = {64251, 48217, 30645, 10507, 57371, 39856, 23814, 5216, 53182, 33102, 14457, 62391, 46363, 27752, 10186, 55573, 36981, 19334, 3390, 50293, 32705, 12581, 59505, 41943, 25900, 7266};
                    int scrollBarFadeDuration = ViewConfiguration.getScrollBarFadeDuration();
                    int i66 = getItem + 67;
                    getExtras = i66 % 128;
                    int i67 = i66 % 2;
                    int i68 = scrollBarFadeDuration >> 16;
                    int iB8 = zzrf.b();
                    int i69 = i68 * (-496);
                    int i70 = ((i69 | (-8972144)) << 1) - (i69 ^ (-8972144));
                    int i71 = ~i68;
                    int i72 = (i70 - (~((~(i71 | (-18090))) * 497))) - 1;
                    int i73 = ~(i71 | (-18090) | iB8);
                    int i74 = ~iB8;
                    int i75 = (i74 & (-18090)) | ((-18090) ^ i74);
                    int i76 = i72 + ((i73 | (~((i75 & i68) | (i75 ^ i68)))) * 497);
                    int i77 = ~iB8;
                    int i78 = ~((i77 & i71) | (i71 ^ i77));
                    int i79 = getItem + 97;
                    getExtras = i79 % 128;
                    int i80 = i79 % 2;
                    int i81 = ~((i71 & 18089) | (i71 ^ 18089));
                    int i82 = (i81 & i78) | (i78 ^ i81);
                    int i83 = (i68 & (-18090)) | ((-18090) ^ i68);
                    int i84 = ~((i83 & iB8) | (i83 ^ iB8));
                    Object[] objArr8 = new Object[1];
                    l(cArr4, (i76 - (~(497 * ((i84 & i82) | (i82 ^ i84))))) - 1, objArr8);
                    Class<?> cls2 = Class.forName((String) objArr8[0]);
                    int edgeSlop = ViewConfiguration.getEdgeSlop() >> 16;
                    int iB9 = zzrf.b();
                    int i85 = (((edgeSlop * 471) + 3768) - (~(-(-(((edgeSlop ^ 8) | (edgeSlop & 8)) * (-470)))))) - 1;
                    int i86 = ~edgeSlop;
                    int i87 = ~((i86 & (-9)) | (i86 ^ (-9)));
                    int i88 = ~(((-9) ^ iB9) | ((-9) & iB9));
                    int i89 = (i87 & i88) | (i87 ^ i88);
                    int i90 = ~iB9;
                    int i91 = (i90 & edgeSlop) | (i90 ^ edgeSlop);
                    int i92 = ~((i91 & 8) | (i91 ^ 8));
                    int i93 = ((i89 & i92) | (i89 ^ i92)) * (-470);
                    int i94 = ((i85 | i93) << 1) - (i85 ^ i93);
                    int i95 = ~(((-9) & edgeSlop) | ((-9) ^ edgeSlop) | iB9);
                    int i96 = edgeSlop | (~iB9);
                    int i97 = ~((i96 & 8) | (i96 ^ 8));
                    int i98 = -(-(((i97 & i95) | (i95 ^ i97)) * 470));
                    int i99 = (i94 & i98) + (i98 | i94);
                    int iGreen = 131 - Color.green(0);
                    int maximumDrawingCacheSize = ViewConfiguration.getMaximumDrawingCacheSize() >> 24;
                    int iB10 = zzrf.b();
                    int i100 = (maximumDrawingCacheSize * 398) - 1188;
                    int i101 = ~maximumDrawingCacheSize;
                    int i102 = ~iB10;
                    int i103 = ~((i102 & i101) | (i101 ^ i102));
                    int i104 = ~maximumDrawingCacheSize;
                    Method[] methodArr2 = declaredMethods;
                    int i105 = ~((i104 ^ 3) | (i104 & 3));
                    int i106 = (i103 ^ i105) | (i105 & i103);
                    int i107 = ~iB10;
                    int i108 = ~((i107 ^ 3) | (i107 & 3));
                    int i109 = -(-(((i106 ^ i108) | (i106 & i108)) * (-397)));
                    int i110 = (i100 ^ i109) + ((i109 & i100) << 1) + ((~(i101 | 3)) * (-397));
                    int i111 = ~(i104 | 3);
                    int i112 = (i111 & iB10) | (iB10 ^ i111);
                    int i113 = ~((maximumDrawingCacheSize & (-4)) | ((-4) ^ maximumDrawingCacheSize));
                    int i114 = i110 + (((i112 & i113) | (i112 ^ i113)) * 397);
                    Object[] objArr9 = new Object[1];
                    m(new char[]{65510, 11, 1, 65533, 14, 1, '\f', 65529}, true, i99, iGreen, i114, objArr9);
                    if (((Boolean) cls2.getMethod((String) objArr9[0], Integer.TYPE).invoke(null, objArr7)).booleanValue()) {
                        int i115 = getExtras + 117;
                        getItem = i115 % 128;
                        int i116 = i115 % 2;
                        Class cls3 = Long.TYPE;
                        char[] cArr5 = {20, '\b', 15, 4, '\n', 1, 22, 1, 65486, '\f', 1, 14, 7, 65486, 18, 5, 6, '\f', 5, 3, 20, 65486, 65517, 5};
                        int i117 = -View.MeasureSpec.makeMeasureSpec(0, 0);
                        int iB11 = zzrf.b();
                        int i118 = (i117 * 677) - 16200;
                        int i119 = getItem + 121;
                        int i120 = i119 % 128;
                        getExtras = i120;
                        int i121 = i119 % 2;
                        int i122 = (i117 ^ iB11) | (i117 & iB11);
                        int i123 = -(-((-676) * ((i122 & (-25)) | (i122 ^ (-25)))));
                        int i124 = (i118 ^ i123) + ((i118 & i123) << 1);
                        int i125 = ~((-25) | i117);
                        int i126 = i120 + 11;
                        getItem = i126 % 128;
                        int i127 = i126 % 2;
                        int i128 = ~iB11;
                        int i129 = ~((i128 ^ i117) | (i128 & i117));
                        int i130 = 676 * ((i125 & i129) | (i125 ^ i129));
                        int i131 = (i124 ^ i130) + ((i124 & i130) << 1);
                        int i132 = ~i117;
                        int i133 = ~(((-25) & i132) | (i132 ^ (-25)));
                        int i134 = ~((i128 & (-25)) | ((-25) ^ i128));
                        int i135 = (i133 & i134) | (i133 ^ i134);
                        int i136 = (i117 & 24) | (i117 ^ 24);
                        int i137 = (i136 & iB11) | (i136 ^ iB11);
                        int iB12 = zzrf.b();
                        int i138 = (~((-1814363784) | iB12)) * 216;
                        int i139 = ~iB12;
                        int i140 = ((((((-294544896) ^ i138) + ((i138 & (-294544896)) << 1)) - (~(-(-(((-671126017) | i139) * (-216)))))) - 1) - (~(((~((i139 & (-1814363784)) | (i139 ^ (-1814363784)))) | (-1190620664)) * 216))) - 1;
                        int iB13 = zzrf.b();
                        int i141 = ~(((-979992166) ^ iB13) | ((-979992166) & iB13));
                        int i142 = (-1017191214) + (((i141 & 275323425) | (275323425 ^ i141)) * 305);
                        int i143 = ~iB13;
                        int i144 = ~((i143 & (-979992166)) | (i143 ^ (-979992166)));
                        int i145 = ((i144 & (-780166239)) | ((-780166239) ^ i144)) * 305;
                        int i146 = (i142 ^ i145) + ((i145 & i142) << 1);
                        int i147 = ~i137;
                        if (i140 <= i146) {
                            int i148 = i131 << (676 >> ((i147 & i135) | (i135 ^ i147)));
                            int jumpTapTimeout = ViewConfiguration.getJumpTapTimeout() * 103;
                            int i149 = ((jumpTapTimeout | 80) << 1) - (jumpTapTimeout ^ 80);
                            iIndexOf = TextUtils.indexOf((CharSequence) "", (char) 23, 0);
                            i6 = i148;
                            i5 = i149;
                            i7 = 3;
                        } else {
                            int i150 = i131 + (((i147 & i135) | (i135 ^ i147)) * 676);
                            int i151 = 122 - (~(-(ViewConfiguration.getJumpTapTimeout() >> 16)));
                            iIndexOf = TextUtils.indexOf((CharSequence) "", '0', 0);
                            i5 = i151;
                            i6 = i150;
                            i7 = 5;
                        }
                        int i152 = -(-iIndexOf);
                        int i153 = ((i7 | i152) << 1) - (i7 ^ i152);
                        Object[] objArr10 = new Object[1];
                        m(cArr5, false, i6, i5, i153, objArr10);
                        Class<?> cls4 = Class.forName((String) objArr10[0]);
                        int defaultSize = View.getDefaultSize(0, 0);
                        Object[] objArr11 = new Object[1];
                        l(new char[]{64246, 21247, 43763, 738, 23256, 45778, 2726, 25262, 47783, 4774, 27270, 49816, 6768}, (defaultSize & 43019) + (defaultSize | 43019), objArr11);
                        if (!cls3.equals(cls4.getMethod((String) objArr11[0], null).invoke(method2, null))) {
                            continue;
                        } else {
                            int i154 = getItem;
                            int i155 = (i154 ^ 65) + ((i154 & 65) << 1);
                            getExtras = i155 % 128;
                            if (i155 % 2 == 0) {
                                i8 = -KeyEvent.keyCodeFromString("");
                                iB = zzrf.b();
                                i9 = (765 / i8) - (-164916);
                                i10 = ~iB;
                                i11 = 108;
                                cArr = new char[]{20, '\b', 15, 4, '\n', 1, 22, 1, 65486, '\f', 1, 14, 7, 65486, 18, 5, 6, '\f', 5, 3, 20, 65486, 65517, 5};
                                z2 = true;
                            } else {
                                char[] cArr6 = {20, '\b', 15, 4, '\n', 1, 22, 1, 65486, '\f', 1, 14, 7, 65486, 18, 5, 6, '\f', 5, 3, 20, 65486, 65517, 5};
                                i8 = -KeyEvent.keyCodeFromString("");
                                iB = zzrf.b();
                                i9 = (i8 * 765) - 36648;
                                i10 = ~iB;
                                cArr = cArr6;
                                i11 = 24;
                                z2 = false;
                            }
                            int i156 = -(-(764 * ((~((i10 ^ i8) | (i10 & i8))) | i11)));
                            int i157 = ((i9 | i156) << 1) - (i156 ^ i9);
                            int i158 = ~i8;
                            int i159 = ~(i158 | i11);
                            int i160 = ~iB;
                            int i161 = i157 + ((i159 | (~(i160 | i11))) * (-1528));
                            int i162 = ~((i158 & i11) | (i158 ^ i11));
                            int i163 = getItem;
                            int i164 = (i163 ^ 39) + ((i163 & 39) << 1);
                            getExtras = i164 % 128;
                            int i165 = i164 % 2;
                            int i166 = ~i11;
                            int i167 = ~((i166 & i8) | (i166 ^ i8));
                            int i168 = (i162 & i167) | (i162 ^ i167);
                            int i169 = ~((i8 & i160) | (i160 ^ i8));
                            int i170 = -(-(764 * ((i169 & i168) | (i168 ^ i169))));
                            int i171 = (i161 ^ i170) + ((i170 & i161) << 1);
                            int iAxisFromString = MotionEvent.axisFromString("");
                            int iB14 = zzrf.b();
                            int i172 = ~iAxisFromString;
                            int i173 = ~((i172 & (-125)) | (i172 ^ (-125)));
                            int i174 = ~((-125) | iB14);
                            int i175 = (i173 & i174) | (i173 ^ i174);
                            int i176 = ~iB14;
                            int i177 = i176 | iAxisFromString;
                            int i178 = ~((i177 & 124) | (i177 ^ 124));
                            int i179 = ((((iAxisFromString * 471) - (-58404)) + (((iAxisFromString ^ 124) | (iAxisFromString & 124)) * (-470))) - (~(-(-(((i175 & i178) | (i175 ^ i178)) * (-470)))))) - 1;
                            int i180 = ((-125) ^ iAxisFromString) | ((-125) & iAxisFromString);
                            int i181 = ~((iB14 & i180) | (i180 ^ iB14));
                            int i182 = ~((iAxisFromString & i176) | (i176 ^ iAxisFromString) | 124);
                            int i183 = ((i182 & i181) | (i181 ^ i182)) * 470;
                            int i184 = (i179 ^ i183) + ((i183 & i179) << 1);
                            int i185 = -View.combineMeasuredStates(0, 0);
                            int i186 = getExtras;
                            int i187 = (i186 ^ 15) + ((i186 & 15) << 1);
                            getItem = i187 % 128;
                            if (i187 % 2 != 0) {
                                iB2 = zzrf.b();
                                int i188 = ~iB2;
                                i12 = (((-559) % i185) - 35) >> ((-561) - (~(-(~((i188 & i185) | (i188 ^ i185))))));
                            } else {
                                iB2 = zzrf.b();
                                int i189 = i185 * (-559);
                                int i190 = (i189 & 2244) + (i189 | 2244);
                                int i191 = ~iB2;
                                i12 = ((~((i191 & i185) | (i191 ^ i185))) * (-560)) + i190;
                            }
                            int i192 = (-560) * (((((-5) & i185) | ((-5) ^ i185)) | iB2) ^ (-1));
                            int i193 = ((i12 | i192) << 1) - (i12 ^ i192);
                            int i194 = ~i185;
                            int i195 = ~((i194 & 4) | (i194 ^ 4));
                            int i196 = ~iB2;
                            int i197 = ~((i196 & 4) | (i196 ^ 4));
                            int i198 = ((i195 & i197) | (i195 ^ i197)) * 560;
                            int i199 = (i193 ^ i198) + ((i198 & i193) << 1);
                            Object[] objArr12 = new Object[1];
                            m(cArr, z2, i171, i184, i199, objArr12);
                            Class<?> cls5 = Class.forName((String) objArr12[0]);
                            char[] cArr7 = {5, 65529, '\n', 65529, 65512, '\f', 65533, 65535, 11, 65533, '\b', 17, 65516, '\n', 65533, '\f', 65533};
                            int i200 = -View.MeasureSpec.getMode(0);
                            int i201 = ((i200 | 17) << 1) - (i200 ^ 17);
                            int i202 = getExtras;
                            int i203 = ((i202 | 33) << 1) - (i202 ^ 33);
                            getItem = i203 % 128;
                            if (i203 % 2 != 0) {
                                Object[] objArr13 = new Object[1];
                                m(cArr7, true, i201, 131 >> (ExpandableListView.getPackedPositionForGroup(1) > 1L ? 1 : (ExpandableListView.getPackedPositionForGroup(1) == 1L ? 0 : -1)), 21 >>> (Process.myPid() % 52), objArr13);
                                objArr = (Object[]) cls5.getMethod((String) objArr13[0], null).invoke(method2, null);
                                if (objArr.length != 2) {
                                    continue;
                                } else if (Long.TYPE.equals(objArr[0])) {
                                    i13 = getItem + 75;
                                    getExtras = i13 % 128;
                                    if (i13 % 2 == 0) {
                                        int iIndexOf3 = 58 >>> TextUtils.indexOf((CharSequence) "", (char) 25);
                                        i14 = (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1));
                                        iB3 = zzrf.b();
                                        i15 = 76;
                                        i16 = iIndexOf3;
                                        cArr2 = new char[]{20, '\b', 15, 4, '\n', 1, 22, 1, 65486, '\f', 1, 14, 7, 65486, 18, 5, 6, '\f', 5, 3, 20, 65486, 65517, 5};
                                        z3 = true;
                                    } else {
                                        int iIndexOf4 = 23 - TextUtils.indexOf((CharSequence) "", '0');
                                        i14 = (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1));
                                        iB3 = zzrf.b();
                                        i15 = 122;
                                        i16 = iIndexOf4;
                                        cArr2 = new char[]{20, '\b', 15, 4, '\n', 1, 22, 1, 65486, '\f', 1, 14, 7, 65486, 18, 5, 6, '\f', 5, 3, 20, 65486, 65517, 5};
                                        z3 = false;
                                    }
                                    int i204 = (i14 * (-500)) + (i15 * (-500));
                                    int i205 = ~i15;
                                    int i206 = ~((i205 ^ i14) | (i205 & i14));
                                    int i207 = getItem;
                                    int i208 = ((i207 | 121) << 1) - (i207 ^ 121);
                                    getExtras = i208 % 128;
                                    int i209 = i208 % 2;
                                    int i210 = ~i14;
                                    int i211 = i210 | i15;
                                    int i212 = ~((i211 & iB3) | (i211 ^ iB3));
                                    int i213 = TypedValues.PositionType.TYPE_TRANSITION_EASING * ((i206 & i212) | (i206 ^ i212));
                                    int i214 = ((i204 | i213) << 1) - (i204 ^ i213);
                                    int i215 = -(-((~((i210 ^ i205) | (i205 & i210))) * 1002));
                                    int i216 = (i214 ^ i215) + ((i215 & i214) << 1);
                                    int i217 = ~i14;
                                    int i218 = ~iB3;
                                    int i219 = (~((i217 & i218) | (i217 ^ i218) | i15)) * TypedValues.PositionType.TYPE_TRANSITION_EASING;
                                    int i220 = (i216 ^ i219) + ((i219 & i216) << 1);
                                    fadingEdgeLength = ViewConfiguration.getFadingEdgeLength();
                                    int i221 = getItem;
                                    i17 = ((i221 | 41) << 1) - (i221 ^ 41);
                                    getExtras = i17 % 128;
                                    if (i17 % 2 == 0) {
                                        i18 = fadingEdgeLength % 29;
                                        iB4 = zzrf.b();
                                        i19 = (i18 & (-375)) + (i18 | (-375)) + 6000;
                                    } else {
                                        i18 = fadingEdgeLength >> 16;
                                        iB4 = zzrf.b();
                                        int i222 = i18 * (-375);
                                        i19 = ((i222 & (-1500)) << 1) + (i222 ^ (-1500));
                                    }
                                    int i223 = ~i18;
                                    int i224 = (~((i223 ^ (-5)) | (i223 & (-5)))) | iB4;
                                    int i225 = ~((i18 ^ 4) | (i18 & 4));
                                    int i226 = (i19 - (~(376 * ((i224 & i225) | (i224 ^ i225))))) - 1;
                                    int i227 = ((~(i18 | (~iB4))) | i225) * (-376);
                                    int i228 = ((i226 | i227) << 1) - (i227 ^ i226);
                                    int i229 = ~((i223 ^ iB4) | (iB4 & i223));
                                    int i230 = ((i229 & 4) | (i229 ^ 4)) * 376;
                                    int i231 = (i228 ^ i230) + ((i230 & i228) << 1);
                                    objArr2 = new Object[1];
                                    m(cArr2, z3, i16, i220, i231, objArr2);
                                    if (Class.forName((String) objArr2[0]).equals(objArr[1])) {
                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
                                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                                            char fadingEdgeLength3 = (char) (ViewConfiguration.getFadingEdgeLength() >> 16);
                                            int iIndexOf5 = TextUtils.indexOf((CharSequence) "", '0', 0) + 2824;
                                            int i232 = 23 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1));
                                            byte b5 = $$j[7];
                                            byte b6 = b5;
                                            Object[] objArr14 = new Object[1];
                                            k(b5, b6, (short) (b6 | 52), objArr14);
                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(fadingEdgeLength3, iIndexOf5, i232, 1814927978, false, (String) objArr14[0], null);
                                        }
                                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).set(null, method2);
                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
                                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                            char packedPositionType = (char) ExpandableListView.getPackedPositionType(0L);
                                            int iRgb = (-16774393) - Color.rgb(0, 0, 0);
                                            int modifierMetaStateMask = 21 - ((byte) KeyEvent.getModifierMetaStateMask());
                                            byte b7 = $$j[7];
                                            byte b8 = b7;
                                            Object[] objArr15 = new Object[1];
                                            k(b7, b8, (short) (b8 | 52), objArr15);
                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(packedPositionType, iRgb, modifierMetaStateMask, 1814927978, false, (String) objArr15[0], null);
                                        }
                                        try {
                                            Object[] objArr16 = {0L, ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).get(null)};
                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1678062333);
                                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                                                char c = (char) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) - 1);
                                                int i233 = 2824 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1));
                                                int iMakeMeasureSpec = 22 - View.MeasureSpec.makeMeasureSpec(0, 0);
                                                Object[] objArr17 = new Object[1];
                                                k((byte) $$k, (byte) 52, $$j[7], objArr17);
                                                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(c, i233, iMakeMeasureSpec, -2137287382, false, (String) objArr17[0], new Class[]{Long.TYPE, Method.class});
                                            }
                                            ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr16)).longValue();
                                            break;
                                        } catch (Throwable th) {
                                            Throwable cause = th.getCause();
                                            if (cause != null) {
                                                throw cause;
                                            }
                                            throw th;
                                        }
                                    }
                                } else {
                                    continue;
                                }
                            } else {
                                int i234 = (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
                                int i235 = -(Process.myPid() >> 22);
                                Object[] objArr18 = new Object[1];
                                m(cArr7, true, i201, (i234 & 131) + (131 | i234), (i235 & 8) + (i235 | 8), objArr18);
                                objArr = (Object[]) cls5.getMethod((String) objArr18[0], null).invoke(method2, null);
                                if (objArr.length != 2) {
                                    continue;
                                } else if (Long.TYPE.equals(objArr[0])) {
                                    i13 = getItem + 75;
                                    getExtras = i13 % 128;
                                    if (i13 % 2 == 0) {
                                        int iIndexOf6 = 58 >>> TextUtils.indexOf((CharSequence) "", (char) 25);
                                        i14 = (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1));
                                        iB3 = zzrf.b();
                                        i15 = 76;
                                        i16 = iIndexOf6;
                                        cArr2 = new char[]{20, '\b', 15, 4, '\n', 1, 22, 1, 65486, '\f', 1, 14, 7, 65486, 18, 5, 6, '\f', 5, 3, 20, 65486, 65517, 5};
                                        z3 = true;
                                    } else {
                                        int iIndexOf7 = 23 - TextUtils.indexOf((CharSequence) "", '0');
                                        i14 = (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1));
                                        iB3 = zzrf.b();
                                        i15 = 122;
                                        i16 = iIndexOf7;
                                        cArr2 = new char[]{20, '\b', 15, 4, '\n', 1, 22, 1, 65486, '\f', 1, 14, 7, 65486, 18, 5, 6, '\f', 5, 3, 20, 65486, 65517, 5};
                                        z3 = false;
                                    }
                                    int i2010 = (i14 * (-500)) + (i15 * (-500));
                                    int i2011 = ~i15;
                                    int i2012 = ~((i2011 ^ i14) | (i2011 & i14));
                                    int i2013 = getItem;
                                    int i2014 = ((i2013 | 121) << 1) - (i2013 ^ 121);
                                    getExtras = i2014 % 128;
                                    int i2015 = i2014 % 2;
                                    int i2110 = ~i14;
                                    int i2111 = i2110 | i15;
                                    int i2112 = ~((i2111 & iB3) | (i2111 ^ iB3));
                                    int i2113 = TypedValues.PositionType.TYPE_TRANSITION_EASING * ((i2012 & i2112) | (i2012 ^ i2112));
                                    int i2114 = ((i2010 | i2113) << 1) - (i2010 ^ i2113);
                                    int i2115 = -(-((~((i2110 ^ i2011) | (i2011 & i2110))) * 1002));
                                    int i2116 = (i2114 ^ i2115) + ((i2115 & i2114) << 1);
                                    int i2117 = ~i14;
                                    int i2118 = ~iB3;
                                    int i2119 = (~((i2117 & i2118) | (i2117 ^ i2118) | i15)) * TypedValues.PositionType.TYPE_TRANSITION_EASING;
                                    int i2210 = (i2116 ^ i2119) + ((i2119 & i2116) << 1);
                                    fadingEdgeLength = ViewConfiguration.getFadingEdgeLength();
                                    int i2211 = getItem;
                                    i17 = ((i2211 | 41) << 1) - (i2211 ^ 41);
                                    getExtras = i17 % 128;
                                    if (i17 % 2 == 0) {
                                        i18 = fadingEdgeLength % 29;
                                        iB4 = zzrf.b();
                                        i19 = (i18 & (-375)) + (i18 | (-375)) + 6000;
                                    } else {
                                        i18 = fadingEdgeLength >> 16;
                                        iB4 = zzrf.b();
                                        int i2212 = i18 * (-375);
                                        i19 = ((i2212 & (-1500)) << 1) + (i2212 ^ (-1500));
                                    }
                                    int i2213 = ~i18;
                                    int i2214 = (~((i2213 ^ (-5)) | (i2213 & (-5)))) | iB4;
                                    int i2215 = ~((i18 ^ 4) | (i18 & 4));
                                    int i2216 = (i19 - (~(376 * ((i2214 & i2215) | (i2214 ^ i2215))))) - 1;
                                    int i2217 = ((~(i18 | (~iB4))) | i2215) * (-376);
                                    int i2218 = ((i2216 | i2217) << 1) - (i2217 ^ i2216);
                                    int i2219 = ~((i2213 ^ iB4) | (iB4 & i2213));
                                    int i236 = ((i2219 & 4) | (i2219 ^ 4)) * 376;
                                    int i237 = (i2218 ^ i236) + ((i236 & i2218) << 1);
                                    objArr2 = new Object[1];
                                    m(cArr2, z3, i16, i2210, i237, objArr2);
                                    if (Class.forName((String) objArr2[0]).equals(objArr[1])) {
                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
                                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                                            char fadingEdgeLength4 = (char) (ViewConfiguration.getFadingEdgeLength() >> 16);
                                            int iIndexOf8 = TextUtils.indexOf((CharSequence) "", '0', 0) + 2824;
                                            int i238 = 23 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1));
                                            byte b9 = $$j[7];
                                            byte b10 = b9;
                                            Object[] objArr19 = new Object[1];
                                            k(b9, b10, (short) (b10 | 52), objArr19);
                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(fadingEdgeLength4, iIndexOf8, i238, 1814927978, false, (String) objArr19[0], null);
                                        }
                                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).set(null, method2);
                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
                                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                            char packedPositionType2 = (char) ExpandableListView.getPackedPositionType(0L);
                                            int iRgb2 = (-16774393) - Color.rgb(0, 0, 0);
                                            int modifierMetaStateMask2 = 21 - ((byte) KeyEvent.getModifierMetaStateMask());
                                            byte b11 = $$j[7];
                                            byte b12 = b11;
                                            Object[] objArr110 = new Object[1];
                                            k(b11, b12, (short) (b12 | 52), objArr110);
                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(packedPositionType2, iRgb2, modifierMetaStateMask2, 1814927978, false, (String) objArr110[0], null);
                                        }
                                        Object[] objArr111 = {0L, ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).get(null)};
                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1678062333);
                                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                                            char c2 = (char) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) - 1);
                                            int i239 = 2824 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1));
                                            int iMakeMeasureSpec2 = 22 - View.MeasureSpec.makeMeasureSpec(0, 0);
                                            Object[] objArr112 = new Object[1];
                                            k((byte) $$k, (byte) 52, $$j[7], objArr112);
                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(c2, i239, iMakeMeasureSpec2, -2137287382, false, (String) objArr112[0], new Class[]{Long.TYPE, Method.class});
                                        }
                                        ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr111)).longValue();
                                        break;
                                    }
                                } else {
                                    continue;
                                }
                            }
                        }
                    }
                    i27 = (i27 & 1) + (i27 | 1);
                    declaredMethods = methodArr2;
                    i20 = 2;
                    i25 = 0;
                    i24 = 1;
                    i26 = 24;
                } catch (Throwable th2) {
                    Throwable cause2 = th2.getCause();
                    if (cause2 != null) {
                        throw cause2;
                    }
                    throw th2;
                }
            }
        }
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
            char trimmedLength = (char) TextUtils.getTrimmedLength("");
            int maximumDrawingCacheSize2 = (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 2823;
            int iMakeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(0, 0) + 22;
            byte b13 = $$j[7];
            byte b14 = b13;
            Object[] objArr20 = new Object[1];
            k(b13, b14, (short) (b14 | 52), objArr20);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(trimmedLength, maximumDrawingCacheSize2, iMakeMeasureSpec3, 1814927978, false, (String) objArr20[0], null);
        }
        Object[] objArr21 = {((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).get(null)};
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-645763082);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
            char windowTouchSlop = (char) (ViewConfiguration.getWindowTouchSlop() >> 8);
            int fadingEdgeLength5 = (ViewConfiguration.getFadingEdgeLength() >> 16) + 2823;
            int doubleTapTimeout = 22 - (ViewConfiguration.getDoubleTapTimeout() >> 16);
            Object[] objArr22 = new Object[1];
            k((byte) ($$k - 5), (byte) 52, $$j[7], objArr22);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(windowTouchSlop, fadingEdgeLength5, doubleTapTimeout, 1025296417, false, (String) objArr22[0], new Class[]{Object.class});
        }
        ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).invoke(null, objArr21);
        Object[] objArr23 = {0, methodArr, null};
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1189131659);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
            char tapTimeout = (char) (37657 - (ViewConfiguration.getTapTimeout() >> 16));
            int iResolveSizeAndState = 2720 - View.resolveSizeAndState(0, 0, 0);
            int offsetBefore = 19 - TextUtils.getOffsetBefore("", 0);
            Object[] objArr24 = new Object[1];
            k((byte) ($$k - 5), (byte) 52, $$j[7], objArr24);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(tapTimeout, iResolveSizeAndState, offsetBefore, -1568796068, false, (String) objArr24[0], new Class[]{Integer.TYPE, Method[].class, List.class});
        }
        long jLongValue = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).invoke(null, objArr23)).longValue();
        long j = -1289263955;
        long j2 = -1;
        long j3 = jLongValue ^ j2;
        long jUptimeMillis = (int) SystemClock.uptimeMillis();
        long j4 = TypedValues.AttributesType.TYPE_PIVOT_TARGET;
        long j5 = jUptimeMillis ^ j2;
        long j6 = (((long) 319) * j) + (((long) (-317)) * jLongValue) + (((long) (-318)) * ((((j ^ j2) | jUptimeMillis) ^ j2) | j3)) + ((((j3 | jUptimeMillis) ^ j2) | (((j5 | j) | jLongValue) ^ j2)) * j4) + (j4 * (((jUptimeMillis | (jLongValue | j)) ^ j2) | (((j3 | j5) | j) ^ j2))) + ((long) (-521141890));
        int iNextInt = new Random().nextInt();
        int i240 = ((int) (j6 >> 32)) & (1078706574 + (((~((-1056813) | iNextInt)) | (~((~iNextInt) | 1436169598))) * (-318)) + (((~(1083843950 | iNextInt)) | 352325648) * (-318)) + (((~(iNextInt | (-1083843951))) | (-353382461)) * TypedValues.AttributesType.TYPE_PIVOT_TARGET));
        int i241 = getExtras + 31;
        getItem = i241 % 128;
        if (i241 % 2 != 0) {
            int iNextInt2 = new Random().nextInt();
            int i242 = ~iNextInt2;
            i = i240 | (((int) j6) & ((-1871736089) + (((~((-1821389141) | i242)) | (~((-1036351746) | iNextInt2))) * 1900) + (((~(i242 | 1036351745)) | (~(1821389140 | iNextInt2))) * (-950)) + (((~(iNextInt2 | 1036351745)) | (~(i242 | 1821389140))) * 950)));
            i2 = (i & 35) + (i | 35);
        } else {
            int iUptimeMillis = (int) SystemClock.uptimeMillis();
            int i243 = ~iUptimeMillis;
            int i244 = ((int) j6) & (2123545465 + (((~(3817882 | i243)) | (-1441044293)) * (-328)) + (((-1441044293) | iUptimeMillis) * 164) + (((~(iUptimeMillis | (-3817883))) | 1720474 | (~(i243 | (-1438946885)))) * 164));
            i = (i240 & i244) | (i240 ^ i244);
            i2 = i >>> 24;
        }
        int i245 = getItem + 121;
        int i246 = i245 % 128;
        getExtras = i246;
        if (i245 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i247 = i & ViewCompat.MEASURED_SIZE_MASK;
        if (i2 != 0) {
            int i248 = (i246 & 119) + (i246 | 119);
            getItem = i248 % 128;
            int i249 = i248 % 2;
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            i4 = 0;
            i3 = 1;
        } else {
            int i250 = getItem;
            i3 = 1;
            int i251 = (i250 ^ 99) + ((i250 & 99) << 1);
            getExtras = i251 % 128;
            i4 = i251 % 2 == 0 ? 0 : 1;
        }
        if (!z || i247 >= i3) {
            string = null;
        } else {
            int i252 = getExtras + 35;
            getItem = i252 % 128;
            if (i252 % 2 != 0) {
                method = methodArr[i247];
                int i253 = 11 / 0;
                if (method != null) {
                    string = method.toString();
                } else {
                    string = null;
                }
            } else {
                method = methodArr[i247];
                if (method != null) {
                    string = method.toString();
                } else {
                    string = null;
                }
            }
        }
        list.add(string);
        return (i2 + 6) * i4;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0023  */
    /* JADX WARN: Code duplicated, block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x002d). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0023
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$w(short r6, short r7, int r8) {
        /*
            int r7 = r7 * 2
            int r0 = 1 - r7
            int r6 = r6 + 4
            byte[] r1 = com.bumptech.glide.request.BaseRequestOptions.$$u
            int r8 = 120 - r8
            byte[] r0 = new byte[r0]
            r2 = 0
            int r7 = 0 - r7
            if (r1 != 0) goto L14
            r3 = r6
            r4 = r2
            goto L2d
        L14:
            r3 = r2
            r5 = r8
            r8 = r6
            r6 = r5
        L18:
            byte r4 = (byte) r6
            r0[r3] = r4
            if (r3 != r7) goto L23
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            return r6
        L23:
            int r8 = r8 + 1
            int r3 = r3 + 1
            r4 = r1[r8]
            r5 = r3
            r3 = r8
            r8 = r4
            r4 = r5
        L2d:
            int r8 = -r8
            int r6 = r6 + r8
            r8 = r3
            r3 = r4
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.request.BaseRequestOptions.$$w(short, short, int):java.lang.String");
    }
}
