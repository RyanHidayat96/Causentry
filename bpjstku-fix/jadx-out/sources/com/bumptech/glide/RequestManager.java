package com.bumptech.glide;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.Toast;
import com.bumptech.glide.request.RequestOptions;
import defpackage.AutoValue_SurfaceOutput_Event;
import defpackage.CameraSelector;
import defpackage.ForwardingImageProxyOnImageCloseListener;
import defpackage.ImageAnalysis;
import defpackage.ImageAnalysisBuilder;
import defpackage.getDefaultConfig;
import defpackage.getImageQueueDepth;
import defpackage.getTargetCoordinateSystem;
import defpackage.getUpdatedCropRect;
import defpackage.getUseCaseConfigBuilder;
import defpackage.initSession;
import defpackage.isAutoCancelEnabled;
import defpackage.isOutputImageRotationEnabled;
import defpackage.onSuggestedStreamSpecImplementationOptionsUpdated;
import defpackage.setDefaultResolution;
import defpackage.setRotationDegrees;
import defpackage.setVideoStabilizationMode;
import java.io.File;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes3.dex */
public class RequestManager implements ComponentCallbacks2, getDefaultConfig {
    private static final RequestOptions asBinder;
    private static int notify;
    private static char[] onTransact;
    private final getUseCaseConfigBuilder INotificationSideChannel;
    public final Glide TuitionPaymentFragmentbindingInflater1;
    public final Context TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    final isOutputImageRotationEnabled TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    final CopyOnWriteArrayList<getTargetCoordinateSystem<Object>> TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final onSuggestedStreamSpecImplementationOptionsUpdated f674a;
    private final ImageAnalysis asInterface;
    final getImageQueueDepth b;
    private RequestOptions cancelAll;
    private boolean d;
    private final Runnable g;
    private static final byte[] $$l = {114, -115, 48, 84};
    private static final int $$m = 6;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$j = {113, 29, -123, -97, 45, 28, 0, 17, 10, -33, 42, 28, -24, 50, -6, 24, 5, 0, 35, -34, 32, 35, 1, 17, 10, -27, 44, -17, 49, 5, 12, -4, 19, -13, 31, -18, 32, 35, 1, 17, 10, -35, 49, 0, 17, -6, 30, 7, 29, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -55};
    private static final int $$k = 34;
    private static final byte[] $$d = {68, -119, -76, 97, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 56, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, 7, -18, -16, -1, -16, -16, -4, 19, -48, -3, -17, 0, -30, 4, -24, 54, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 54, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 55};
    private static final int $$e = 252;
    private static int getInterfaceDescriptor = 0;
    private static int RemoteActionCompatParcelizer = 1;
    private static int cancel = 0;

    /* JADX WARN: Code duplicated, block: B:10:0x0023  */
    /* JADX WARN: Code duplicated, block: B:8:0x001b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x0027). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0023
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void h(short r5, byte r6, byte r7, java.lang.Object[] r8) {
        /*
            byte[] r0 = com.bumptech.glide.RequestManager.$$d
            int r1 = 53 - r6
            int r7 = r7 * 14
            int r7 = r7 + 84
            int r5 = 145 - r5
            byte[] r1 = new byte[r1]
            int r6 = 52 - r6
            r2 = 0
            if (r0 != 0) goto L15
            r7 = r5
            r4 = r6
            r3 = r2
            goto L27
        L15:
            r3 = r2
        L16:
            byte r4 = (byte) r7
            r1[r3] = r4
            if (r3 != r6) goto L23
            java.lang.String r5 = new java.lang.String
            r5.<init>(r1, r2)
            r8[r2] = r5
            return
        L23:
            int r3 = r3 + 1
            r4 = r0[r5]
        L27:
            int r4 = -r4
            int r5 = r5 + 1
            int r7 = r7 + r4
            int r7 = r7 + (-11)
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.RequestManager.h(short, byte, byte, java.lang.Object[]):void");
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0027  */
    /* JADX WARN: Code duplicated, block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x002e). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0027
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void j(byte r7, byte r8, short r9, java.lang.Object[] r10) {
        /*
            byte[] r0 = com.bumptech.glide.RequestManager.$$j
            int r9 = r9 * 45
            int r9 = 48 - r9
            int r7 = r7 * 7
            int r7 = r7 + 46
            int r8 = r8 * 19
            int r8 = 84 - r8
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L17
            r8 = r7
            r3 = r9
            r4 = r2
            goto L2e
        L17:
            r3 = r2
        L18:
            int r4 = r3 + 1
            byte r5 = (byte) r8
            r1[r3] = r5
            if (r4 != r7) goto L27
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            r10[r2] = r7
            return
        L27:
            int r9 = r9 + 1
            r3 = r0[r9]
            r6 = r3
            r3 = r9
            r9 = r6
        L2e:
            int r8 = r8 + r9
            int r8 = r8 + (-11)
            r9 = r3
            r3 = r4
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.RequestManager.j(byte, byte, short, java.lang.Object[]):void");
    }

    static {
        notify = 1;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        asBinder = RequestOptions.TuitionPaymentFragmentspecialinlinedviewModeldefault1((Class<?>) Bitmap.class).asBinder();
        RequestOptions.TuitionPaymentFragmentspecialinlinedviewModeldefault1((Class<?>) isAutoCancelEnabled.class).asBinder();
        RequestOptions.TuitionPaymentFragmentspecialinlinedviewModeldefault2(CameraSelector.TuitionPaymentFragmentbindingInflater1).b(Priority.LOW).TuitionPaymentFragmentbindingInflater1(true);
        int i = cancel + 17;
        notify = i % 128;
        if (i % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public RequestManager(Glide glide, getImageQueueDepth getimagequeuedepth, getUseCaseConfigBuilder getusecaseconfigbuilder, Context context) {
        this(glide, getimagequeuedepth, getusecaseconfigbuilder, new isOutputImageRotationEnabled(), glide.TuitionPaymentFragmentbindingInflater1, context);
    }

    private RequestManager(Glide glide, getImageQueueDepth getimagequeuedepth, getUseCaseConfigBuilder getusecaseconfigbuilder, isOutputImageRotationEnabled isoutputimagerotationenabled, ForwardingImageProxyOnImageCloseListener forwardingImageProxyOnImageCloseListener, Context context) {
        this.f674a = new onSuggestedStreamSpecImplementationOptionsUpdated();
        Runnable runnable = new Runnable() { // from class: com.bumptech.glide.RequestManager.2
            @Override // java.lang.Runnable
            public final void run() {
                RequestManager.this.b.TuitionPaymentFragmentbindingInflater1(RequestManager.this);
            }
        };
        this.g = runnable;
        this.TuitionPaymentFragmentbindingInflater1 = glide;
        this.b = getimagequeuedepth;
        this.INotificationSideChannel = getusecaseconfigbuilder;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = isoutputimagerotationenabled;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = context;
        ImageAnalysis imageAnalysisTuitionPaymentFragmentspecialinlinedviewModeldefault3 = forwardingImageProxyOnImageCloseListener.TuitionPaymentFragmentspecialinlinedviewModeldefault3(context.getApplicationContext(), new TuitionPaymentFragmentspecialinlinedviewModeldefault3(isoutputimagerotationenabled));
        this.asInterface = imageAnalysisTuitionPaymentFragmentspecialinlinedviewModeldefault3;
        synchronized (glide.b) {
            if (glide.b.contains(this)) {
                throw new IllegalStateException("Cannot register already registered manager");
            }
            glide.b.add(this);
        }
        if (getUpdatedCropRect.b()) {
            getUpdatedCropRect.TuitionPaymentFragmentbindingInflater1(runnable);
        } else {
            getimagequeuedepth.TuitionPaymentFragmentbindingInflater1(this);
        }
        getimagequeuedepth.TuitionPaymentFragmentbindingInflater1(imageAnalysisTuitionPaymentFragmentspecialinlinedviewModeldefault3);
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = new CopyOnWriteArrayList<>(glide.TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentbindingInflater1);
        TuitionPaymentFragmentspecialinlinedviewModeldefault2(glide.TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault2());
    }

    public void TuitionPaymentFragmentspecialinlinedviewModeldefault2(RequestOptions requestOptions) {
        synchronized (this) {
            this.cancelAll = requestOptions.TuitionPaymentFragmentspecialinlinedviewModeldefault3().TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        }
    }

    private static void i(byte[] bArr, int[] iArr, boolean z, Object[] objArr) throws Throwable {
        char[] cArr;
        int i = 2 % 2;
        setVideoStabilizationMode setvideostabilizationmode = new setVideoStabilizationMode();
        int i2 = 0;
        int i3 = iArr[0];
        int i4 = iArr[1];
        int i5 = iArr[2];
        int i6 = iArr[3];
        char[] cArr2 = onTransact;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i7 = 0;
            while (i7 < length) {
                try {
                    Object[] objArr2 = new Object[1];
                    objArr2[i2] = Integer.valueOf(cArr2[i7]);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-52690717);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        byte b = (byte) i2;
                        byte b2 = (byte) (b - 1);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (ViewConfiguration.getWindowTouchSlop() >> 8), (ViewConfiguration.getKeyRepeatDelay() >> 16) + 1270, (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 18, 407021364, false, $$n(b, b2, (byte) (b2 & 5)), new Class[]{Integer.TYPE});
                    }
                    cArr3[i7] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                    i7++;
                    i2 = 0;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr2 = cArr3;
        }
        char[] cArr4 = new char[i4];
        System.arraycopy(cArr2, i3, cArr4, 0, i4);
        if (bArr != null) {
            char[] cArr5 = new char[i4];
            setvideostabilizationmode.b = 0;
            char c = 0;
            while (setvideostabilizationmode.b < i4) {
                int i8 = $11 + 27;
                $10 = i8 % 128;
                int i9 = i8 % 2;
                if (bArr[setvideostabilizationmode.b] == 1) {
                    int i10 = $10 + 63;
                    $11 = i10 % 128;
                    int i11 = i10 % 2;
                    int i12 = setvideostabilizationmode.b;
                    Object[] objArr3 = {Integer.valueOf(cArr4[setvideostabilizationmode.b]), Integer.valueOf(c)};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1683071655);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                        byte b3 = (byte) 0;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (ViewConfiguration.getWindowTouchSlop() >> 8), (KeyEvent.getMaxKeyCode() >> 16) + 3225, (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 13, 2133916302, false, $$n(b3, (byte) (b3 - 1), (byte) $$m), new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr5[i12] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).charValue();
                } else {
                    int i13 = setvideostabilizationmode.b;
                    Object[] objArr4 = {Integer.valueOf(cArr4[setvideostabilizationmode.b]), Integer.valueOf(c)};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-209040917);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                        byte b4 = (byte) 0;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (29992 - AndroidCharacter.getMirror('0')), ExpandableListView.getPackedPositionGroup(0L) + 1755, (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 22, 387247676, false, $$n(b4, (byte) (b4 - 1), (byte) $$l.length), new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr5[i13] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4)).charValue();
                }
                c = cArr5[setvideostabilizationmode.b];
                Object[] objArr5 = {setvideostabilizationmode, setvideostabilizationmode};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1323373940);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    byte b5 = (byte) 0;
                    byte b6 = (byte) (b5 - 1);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) ((ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 41241), ExpandableListView.getPackedPositionChild(0L) + 1706, 22 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), -1434471773, false, $$n(b5, b6, (byte) (b6 + 1)), new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5);
            }
            cArr4 = cArr5;
        }
        if (i6 > 0) {
            char[] cArr6 = new char[i4];
            System.arraycopy(cArr4, 0, cArr6, 0, i4);
            int i14 = i4 - i6;
            System.arraycopy(cArr6, 0, cArr4, i14, i6);
            System.arraycopy(cArr6, i6, cArr4, 0, i14);
        }
        if (z) {
            int i15 = $11 + 93;
            $10 = i15 % 128;
            if (i15 % 2 != 0) {
                cArr = new char[i4];
                setvideostabilizationmode.b = 0;
            } else {
                cArr = new char[i4];
                setvideostabilizationmode.b = 0;
            }
            while (setvideostabilizationmode.b < i4) {
                int i16 = $11 + 75;
                $10 = i16 % 128;
                if (i16 % 2 != 0) {
                    cArr[setvideostabilizationmode.b] = cArr4[i4 % setvideostabilizationmode.b];
                    setvideostabilizationmode.b = setvideostabilizationmode.b;
                } else {
                    cArr[setvideostabilizationmode.b] = cArr4[(i4 - setvideostabilizationmode.b) - 1];
                    setvideostabilizationmode.b++;
                }
                int i17 = $11 + 39;
                $10 = i17 % 128;
                int i18 = i17 % 2;
            }
            cArr4 = cArr;
        }
        if (i5 > 0) {
            int i19 = 0;
            loop3: while (true) {
                setvideostabilizationmode.b = i19;
                while (true) {
                    if (setvideostabilizationmode.b >= i4) {
                        break loop3;
                    }
                    int i20 = $10 + 11;
                    $11 = i20 % 128;
                    if (i20 % 2 == 0) {
                        cArr4[setvideostabilizationmode.b] = (char) (cArr4[setvideostabilizationmode.b] % iArr[4]);
                        setvideostabilizationmode.b--;
                    }
                }
                cArr4[setvideostabilizationmode.b] = (char) (cArr4[setvideostabilizationmode.b] - iArr[2]);
                i19 = setvideostabilizationmode.b + 1;
            }
        }
        objArr[0] = new String(cArr4);
        int i21 = $10 + 37;
        $11 = i21 % 128;
        int i22 = i21 % 2;
    }

    @Override // defpackage.getDefaultConfig
    public void onStart() {
        synchronized (this) {
            synchronized (this) {
                isOutputImageRotationEnabled isoutputimagerotationenabled = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                isoutputimagerotationenabled.b = false;
                for (ImageAnalysisBuilder imageAnalysisBuilder : getUpdatedCropRect.TuitionPaymentFragmentspecialinlinedviewModeldefault3(isoutputimagerotationenabled.TuitionPaymentFragmentbindingInflater1)) {
                    if (!imageAnalysisBuilder.a() && !imageAnalysisBuilder.asBinder()) {
                        imageAnalysisBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                    }
                }
                isoutputimagerotationenabled.TuitionPaymentFragmentspecialinlinedviewModeldefault3.clear();
            }
        }
        this.f674a.onStart();
    }

    @Override // defpackage.getDefaultConfig
    public void onStop() {
        synchronized (this) {
            synchronized (this) {
                isOutputImageRotationEnabled isoutputimagerotationenabled = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                isoutputimagerotationenabled.b = true;
                for (ImageAnalysisBuilder imageAnalysisBuilder : getUpdatedCropRect.TuitionPaymentFragmentspecialinlinedviewModeldefault3(isoutputimagerotationenabled.TuitionPaymentFragmentbindingInflater1)) {
                    if (imageAnalysisBuilder.asBinder()) {
                        imageAnalysisBuilder.g();
                        isoutputimagerotationenabled.TuitionPaymentFragmentspecialinlinedviewModeldefault3.add(imageAnalysisBuilder);
                    }
                }
            }
        }
        this.f674a.onStop();
    }

    @Override // defpackage.getDefaultConfig
    public void onDestroy() {
        synchronized (this) {
            this.f674a.onDestroy();
            Iterator it = getUpdatedCropRect.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.f674a.b).iterator();
            while (it.hasNext()) {
                b((setDefaultResolution<?>) it.next());
            }
            this.f674a.b.clear();
            isOutputImageRotationEnabled isoutputimagerotationenabled = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            Iterator it2 = getUpdatedCropRect.TuitionPaymentFragmentspecialinlinedviewModeldefault3(isoutputimagerotationenabled.TuitionPaymentFragmentbindingInflater1).iterator();
            while (it2.hasNext()) {
                isoutputimagerotationenabled.TuitionPaymentFragmentbindingInflater1((ImageAnalysisBuilder) it2.next());
            }
            isoutputimagerotationenabled.TuitionPaymentFragmentspecialinlinedviewModeldefault3.clear();
            this.b.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this);
            this.b.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.asInterface);
            getUpdatedCropRect.TuitionPaymentFragmentspecialinlinedviewModeldefault1(this.g);
            Glide glide = this.TuitionPaymentFragmentbindingInflater1;
            synchronized (glide.b) {
                if (!glide.b.contains(this)) {
                    throw new IllegalStateException("Cannot unregister not yet registered manager");
                }
                glide.b.remove(this);
            }
        }
    }

    public RequestBuilder<Bitmap> TuitionPaymentFragmentbindingInflater1() {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 19;
        RemoteActionCompatParcelizer = i2 % 128;
        int i3 = i2 % 2;
        RequestBuilder<Bitmap> requestBuilderApply = TuitionPaymentFragmentbindingInflater1(Bitmap.class).apply(asBinder);
        int i4 = RemoteActionCompatParcelizer + 23;
        getInterfaceDescriptor = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 16 / 0;
        }
        return requestBuilderApply;
    }

    public RequestBuilder<Drawable> TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 95;
        RemoteActionCompatParcelizer = i2 % 128;
        if (i2 % 2 != 0) {
            return TuitionPaymentFragmentbindingInflater1(Drawable.class);
        }
        TuitionPaymentFragmentbindingInflater1(Drawable.class);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public RequestBuilder<Drawable> load(Bitmap bitmap) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 13;
        RemoteActionCompatParcelizer = i2 % 128;
        int i3 = i2 % 2;
        RequestBuilder<Drawable> requestBuilderTuitionPaymentFragmentspecialinlinedviewModeldefault1 = TuitionPaymentFragmentspecialinlinedviewModeldefault1().TuitionPaymentFragmentspecialinlinedviewModeldefault1(bitmap);
        int i4 = getInterfaceDescriptor + 83;
        RemoteActionCompatParcelizer = i4 % 128;
        int i5 = i4 % 2;
        return requestBuilderTuitionPaymentFragmentspecialinlinedviewModeldefault1;
    }

    public RequestBuilder<Drawable> TuitionPaymentFragmentspecialinlinedviewModeldefault2(String str) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 83;
        RemoteActionCompatParcelizer = i2 % 128;
        int i3 = i2 % 2;
        RequestBuilder<Drawable> requestBuilderTuitionPaymentFragmentspecialinlinedviewModeldefault3 = TuitionPaymentFragmentspecialinlinedviewModeldefault1().TuitionPaymentFragmentspecialinlinedviewModeldefault3(str);
        int i4 = getInterfaceDescriptor + 113;
        RemoteActionCompatParcelizer = i4 % 128;
        int i5 = i4 % 2;
        return requestBuilderTuitionPaymentFragmentspecialinlinedviewModeldefault3;
    }

    public RequestBuilder<Drawable> b(File file) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 75;
        RemoteActionCompatParcelizer = i2 % 128;
        int i3 = i2 % 2;
        RequestBuilder<Drawable> requestBuilderTuitionPaymentFragmentspecialinlinedviewModeldefault1 = TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        if (i3 != 0) {
            return requestBuilderTuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault3(file);
        }
        requestBuilderTuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault3(file);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public RequestBuilder<Drawable> load(Integer num) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 21;
        RemoteActionCompatParcelizer = i2 % 128;
        int i3 = i2 % 2;
        RequestBuilder<Drawable> requestBuilderTuitionPaymentFragmentbindingInflater1 = TuitionPaymentFragmentspecialinlinedviewModeldefault1().TuitionPaymentFragmentbindingInflater1(num);
        int i4 = RemoteActionCompatParcelizer + 105;
        getInterfaceDescriptor = i4 % 128;
        int i5 = i4 % 2;
        return requestBuilderTuitionPaymentFragmentbindingInflater1;
    }

    public RequestBuilder<Drawable> TuitionPaymentFragmentspecialinlinedviewModeldefault3(Object obj) {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 15;
        getInterfaceDescriptor = i2 % 128;
        if (i2 % 2 != 0) {
            TuitionPaymentFragmentspecialinlinedviewModeldefault1().TuitionPaymentFragmentspecialinlinedviewModeldefault1(obj);
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        RequestBuilder<Drawable> requestBuilderTuitionPaymentFragmentspecialinlinedviewModeldefault1 = TuitionPaymentFragmentspecialinlinedviewModeldefault1().TuitionPaymentFragmentspecialinlinedviewModeldefault1(obj);
        int i3 = RemoteActionCompatParcelizer + 113;
        getInterfaceDescriptor = i3 % 128;
        int i4 = i3 % 2;
        return requestBuilderTuitionPaymentFragmentspecialinlinedviewModeldefault1;
    }

    public <ResourceType> RequestBuilder<ResourceType> TuitionPaymentFragmentbindingInflater1(Class<ResourceType> cls) {
        int i = 2 % 2;
        RequestBuilder<ResourceType> requestBuilder = new RequestBuilder<>(this.TuitionPaymentFragmentbindingInflater1, this, cls, this.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
        int i2 = getInterfaceDescriptor + 123;
        RemoteActionCompatParcelizer = i2 % 128;
        int i3 = i2 % 2;
        return requestBuilder;
    }

    class TuitionPaymentFragmentspecialinlinedviewModeldefault3 implements ImageAnalysis.TuitionPaymentFragmentbindingInflater1 {
        private final isOutputImageRotationEnabled b;

        TuitionPaymentFragmentspecialinlinedviewModeldefault3(isOutputImageRotationEnabled isoutputimagerotationenabled) {
            this.b = isoutputimagerotationenabled;
        }

        @Override // ImageAnalysis.TuitionPaymentFragmentbindingInflater1
        public final void b(boolean z) {
            if (z) {
                synchronized (RequestManager.this) {
                    isOutputImageRotationEnabled isoutputimagerotationenabled = this.b;
                    for (ImageAnalysisBuilder imageAnalysisBuilder : getUpdatedCropRect.TuitionPaymentFragmentspecialinlinedviewModeldefault3(isoutputimagerotationenabled.TuitionPaymentFragmentbindingInflater1)) {
                        if (!imageAnalysisBuilder.a() && !imageAnalysisBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault2()) {
                            imageAnalysisBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
                            if (!isoutputimagerotationenabled.b) {
                                imageAnalysisBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                            } else {
                                isoutputimagerotationenabled.TuitionPaymentFragmentspecialinlinedviewModeldefault3.add(imageAnalysisBuilder);
                            }
                        }
                    }
                }
            }
        }
    }

    public final void b(setDefaultResolution<?> setdefaultresolution) {
        Object[] objArr;
        int i = 2 % 2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(650054);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char gidForName = (char) (Process.getGidForName("") + 1);
            int packedPositionChild = ExpandableListView.getPackedPositionChild(0L) + 652;
            int iCombineMeasuredStates = View.combineMeasuredStates(0, 0) + 44;
            byte b = $$d[7];
            Object[] objArr2 = new Object[1];
            h((short) 141, b, b, objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(gidForName, packedPositionChild, iCombineMeasuredStates, -459846511, false, (String) objArr2[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr3 = new Object[1];
        i(new byte[]{1, 0, 0, 1, 0, 0, 1, 0, 1, 0, 1, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1}, new int[]{0, 22, 194, 2}, false, objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        i(new byte[]{0, 0, 1, 0, 0, 0, 1, 1, 1, 1, 0, 1, 0, 1, 0}, new int[]{22, 15, 194, 5}, false, objArr4);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(795782016);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char gidForName2 = (char) ((-1) - Process.getGidForName(""));
            int mirror = AndroidCharacter.getMirror('0') + 603;
            int keyRepeatDelay = (ViewConfiguration.getKeyRepeatDelay() >> 16) + 44;
            Object[] objArr5 = new Object[1];
            h((short) 89, (byte) ($$e & 55), $$d[5], objArr5);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(gidForName2, mirror, keyRepeatDelay, -873460649, false, (String) objArr5[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            int i2 = getInterfaceDescriptor + 33;
            RemoteActionCompatParcelizer = i2 % 128;
            int i3 = i2 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1148961515);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char c = (char) (1 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)));
                int fadingEdgeLength = 651 - (ViewConfiguration.getFadingEdgeLength() >> 16);
                int defaultSize = View.getDefaultSize(0, 0) + 44;
                Object[] objArr6 = new Object[1];
                h((short) 89, (byte) 15, $$d[7], objArr6);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(c, fadingEdgeLength, defaultSize, -1595579076, false, (String) objArr6[0], null);
            }
            Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            objArr = new Object[]{new int[]{i}, new String[0], new int[]{i}, new int[1]};
            int i4 = ((int[]) objArr7[2])[0];
            int i5 = ((int[]) objArr7[0])[0];
            int iMyPid = Process.myPid();
            int i6 = ~iMyPid;
            int i7 = ((((-1618141908) + (((~((-303660167) | i6)) | 300229356) * (-865))) + ((~(iMyPid | 303660166)) * 865)) + (((~(300229356 | i6)) | (~(i6 | 303660166))) * 865)) - 970849520;
            int i8 = (i7 << 13) ^ i7;
            int i9 = i8 ^ (i8 >>> 17);
            ((int[]) objArr[3])[0] = i9 ^ (i9 << 5);
        } else {
            try {
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1686493381);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) Color.blue(0), 1610 - TextUtils.getOffsetAfter("", 0), TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 27, 2145681644, false, null, new Class[0]);
                }
                Object[] objArr8 = {null, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).newInstance(null), -970849520, 0};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1625117732);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                    char deadChar = (char) KeyEvent.getDeadChar(0, 0);
                    int iIndexOf = TextUtils.indexOf("", "") + 651;
                    int modifierMetaStateMask = 43 - ((byte) KeyEvent.getModifierMetaStateMask());
                    Object[] objArr9 = new Object[1];
                    h((short) 89, (byte) ($$e & 55), $$d[5], objArr9);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(deadChar, iIndexOf, modifierMetaStateMask, 2075921419, false, (String) objArr9[0], new Class[]{(Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) Color.green(0), View.MeasureSpec.getSize(0) + 695, 98 - TextUtils.getTrimmedLength("")), (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (63407 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1))), KeyEvent.keyCodeFromString("") + 793, TextUtils.indexOf((CharSequence) "", '0', 0) + 84), Integer.TYPE, Integer.TYPE});
                }
                objArr = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr8);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1148961515);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                    char cIndexOf = (char) (TextUtils.indexOf((CharSequence) "", '0') + 1);
                    int iResolveSize = View.resolveSize(0, 0) + 651;
                    int iMyPid2 = (Process.myPid() >> 22) + 44;
                    Object[] objArr10 = new Object[1];
                    h((short) 89, (byte) 15, $$d[7], objArr10);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(cIndexOf, iResolveSize, iMyPid2, -1595579076, false, (String) objArr10[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, objArr);
                try {
                    Object[] objArr11 = new Object[1];
                    i(new byte[]{1, 0, 0, 1, 0, 0, 1, 0, 1, 0, 1, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1}, new int[]{0, 22, 194, 2}, false, objArr11);
                    Class<?> cls2 = Class.forName((String) objArr11[0]);
                    Object[] objArr12 = new Object[1];
                    i(new byte[]{0, 0, 1, 0, 0, 0, 1, 1, 1, 1, 0, 1, 0, 1, 0}, new int[]{22, 15, 194, 5}, false, objArr12);
                    long jLongValue2 = ((Long) cls2.getDeclaredMethod((String) objArr12[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue2);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(795782016);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
                        char c2 = (char) (1 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)));
                        int iGreen = Color.green(0) + 651;
                        int i10 = (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 44;
                        Object[] objArr13 = new Object[1];
                        h((short) 89, (byte) ($$e & 55), $$d[5], objArr13);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(c2, iGreen, i10, -873460649, false, (String) objArr13[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(650054);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault10 == null) {
                        char edgeSlop = (char) (ViewConfiguration.getEdgeSlop() >> 16);
                        int size = 651 - View.MeasureSpec.getSize(0);
                        int jumpTapTimeout = 44 - (ViewConfiguration.getJumpTapTimeout() >> 16);
                        byte b2 = $$d[7];
                        Object[] objArr14 = new Object[1];
                        h((short) 141, b2, b2, objArr14);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.b(edgeSlop, size, jumpTapTimeout, -459846511, false, (String) objArr14[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault10).set(null, lValueOf2);
                } catch (Exception unused) {
                    throw new RuntimeException();
                }
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        int i11 = ((int[]) objArr[0])[0];
        int i12 = ((int[]) objArr[2])[0];
        if (i12 == i11) {
            int i13 = RemoteActionCompatParcelizer + 33;
            getInterfaceDescriptor = i13 % 128;
            int i14 = i13 % 2;
            Object[] objArr15 = {new int[]{i}, new String[0], new int[]{i}, new int[1]};
            int i15 = ((int[]) objArr[3])[0];
            int i16 = ((int[]) objArr[2])[0];
            int i17 = ((int[]) objArr[0])[0];
            int iFreeMemory = (int) Runtime.getRuntime().freeMemory();
            int i18 = i15 + 1821354007 + (((~iFreeMemory) | 5044710) * 1444) + (((~(iFreeMemory | (-950947887))) | (~(954378696 | iFreeMemory)) | 806950) * (-1444)) + 652685954;
            int i19 = (i18 << 13) ^ i18;
            int i20 = i19 ^ (i19 >>> 17);
            ((int[]) objArr15[3])[0] = i20 ^ (i20 << 5);
        } else {
            ArrayList arrayList = new ArrayList();
            String[] strArr = (String[]) objArr[1];
            if (strArr != null) {
                int i21 = getInterfaceDescriptor + 49;
                RemoteActionCompatParcelizer = i21 % 128;
                int i22 = i21 % 2;
                for (String str : strArr) {
                    arrayList.add(str);
                }
            }
            Toast.makeText((Context) null, i12 / (((i12 - 1) * i12) % 2), 0).show();
            Object[] objArr16 = {new int[]{i}, new String[0], new int[]{i}, new int[1]};
            int i23 = ((int[]) objArr[3])[0];
            int i24 = ((int[]) objArr[2])[0];
            int i25 = ((int[]) objArr[0])[0];
            int iIdentityHashCode = System.identityHashCode(this);
            int i26 = ~(409705785 | iIdentityHashCode);
            int i27 = ~iIdentityHashCode;
            int i28 = i26 | (~(413136595 | i27));
            int i29 = ~((-409705786) | i27);
            int i30 = i23 + 618524517 + ((i28 | i29) * (-516)) + (((~(iIdentityHashCode | (-9724611))) | (~((-403411986) | i27))) * 516) + ((403411985 | i29) * 516);
            int i31 = (i30 << 13) ^ i30;
            int i32 = i31 ^ (i31 >>> 17);
            ((int[]) objArr16[3])[0] = i32 ^ (i32 << 5);
        }
        if (setdefaultresolution == null) {
            return;
        }
        TuitionPaymentFragmentspecialinlinedviewModeldefault1(setdefaultresolution);
    }

    private void TuitionPaymentFragmentspecialinlinedviewModeldefault1(setDefaultResolution<?> setdefaultresolution) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 113;
        RemoteActionCompatParcelizer = i2 % 128;
        if (i2 % 2 == 0) {
            TuitionPaymentFragmentspecialinlinedviewModeldefault3(setdefaultresolution);
            setdefaultresolution.getRequest();
            throw null;
        }
        boolean zTuitionPaymentFragmentspecialinlinedviewModeldefault3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3(setdefaultresolution);
        ImageAnalysisBuilder request = setdefaultresolution.getRequest();
        if (zTuitionPaymentFragmentspecialinlinedviewModeldefault3 || this.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault3(setdefaultresolution)) {
            return;
        }
        int i3 = getInterfaceDescriptor + 11;
        RemoteActionCompatParcelizer = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        if (request != null) {
            setdefaultresolution.setRequest(null);
            request.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        }
    }

    final boolean TuitionPaymentFragmentspecialinlinedviewModeldefault3(setDefaultResolution<?> setdefaultresolution) {
        Object[] objArr;
        char c;
        synchronized (this) {
            ImageAnalysisBuilder request = setdefaultresolution.getRequest();
            if (request == null) {
                return true;
            }
            if (!this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentbindingInflater1(request)) {
                return false;
            }
            onSuggestedStreamSpecImplementationOptionsUpdated onsuggestedstreamspecimplementationoptionsupdated = this.f674a;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(797565291);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                char c2 = (char) (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                int modifierMetaStateMask = ((byte) KeyEvent.getModifierMetaStateMask()) + 2268;
                int packedPositionType = ExpandableListView.getPackedPositionType(0L) + 33;
                short s = (short) ($$e & 55);
                byte b = $$d[7];
                Object[] objArr2 = new Object[1];
                h(s, b, b, objArr2);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(c2, modifierMetaStateMask, packedPositionType, -887667012, false, (String) objArr2[0], null);
            }
            long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
            Object[] objArr3 = new Object[1];
            i(new byte[]{1, 0, 0, 1, 0, 0, 1, 0, 1, 0, 1, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1}, new int[]{0, 22, 194, 2}, false, objArr3);
            Class<?> cls = Class.forName((String) objArr3[0]);
            Object[] objArr4 = new Object[1];
            i(new byte[]{0, 0, 1, 0, 0, 0, 1, 1, 1, 1, 0, 1, 0, 1, 0}, new int[]{22, 15, 194, 5}, false, objArr4);
            long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(796641770);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                char cIndexOf = (char) TextUtils.indexOf("", "", 0, 0);
                int packedPositionGroup = 2267 - ExpandableListView.getPackedPositionGroup(0L);
                int iCombineMeasuredStates = 33 - View.combineMeasuredStates(0, 0);
                short s2 = $$d[7];
                byte b2 = (byte) s2;
                Object[] objArr5 = new Object[1];
                h(s2, b2, b2, objArr5);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cIndexOf, packedPositionGroup, iCombineMeasuredStates, -874156483, false, (String) objArr5[0], null);
            }
            if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1013250600);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    char cKeyCodeFromString = (char) KeyEvent.keyCodeFromString("");
                    int scrollBarSize = 2267 - (ViewConfiguration.getScrollBarSize() >> 8);
                    int threadPriority = 33 - ((Process.getThreadPriority(0) + 20) >> 6);
                    Object[] objArr6 = new Object[1];
                    h((short) 89, (byte) 15, $$d[7], objArr6);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(cKeyCodeFromString, scrollBarSize, threadPriority, -654680577, false, (String) objArr6[0], null);
                }
                Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
                objArr = new Object[]{new int[]{i}, strArr, new int[1], new int[]{i}};
                int i = ((int[]) objArr7[0])[0];
                int i2 = ((int[]) objArr7[3])[0];
                String[] strArr = (String[]) objArr7[1];
                int startElapsedRealtime = (int) Process.getStartElapsedRealtime();
                int i3 = ((((-2036226540) + (((~((~startElapsedRealtime) | (-807092212))) | 1621104) * (-235))) + (((~((-807092212) | startElapsedRealtime)) | 1621104) * (-470))) + (((~(startElapsedRealtime | (-805503876))) | 32768) * 235)) - 581844409;
                int i4 = (i3 << 13) ^ i3;
                int i5 = i4 ^ (i4 >>> 17);
                ((int[]) objArr[2])[0] = i5 ^ (i5 << 5);
                c = 3;
            } else {
                Context applicationContext = (Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null);
                if (applicationContext != null) {
                    applicationContext = ((applicationContext instanceof ContextWrapper) && ((ContextWrapper) applicationContext).getBaseContext() == null) ? null : applicationContext.getApplicationContext();
                }
                try {
                    Object[] objArr8 = {applicationContext, Integer.valueOf(((Integer) Class.forName("java.lang.System").getMethod("identityHashCode", Object.class).invoke(null, onsuggestedstreamspecimplementationoptionsupdated)).intValue()), 0, -581844409};
                    byte[] bArr = $$j;
                    byte b3 = bArr[6];
                    byte b4 = bArr[22];
                    Object[] objArr9 = new Object[1];
                    j(b3, b4, b4, objArr9);
                    Class<?> cls2 = Class.forName((String) objArr9[0]);
                    byte b5 = bArr[22];
                    byte b6 = bArr[6];
                    Object[] objArr10 = new Object[1];
                    j(b5, b6, b6, objArr10);
                    objArr = (Object[]) cls2.getMethod((String) objArr10[0], Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr8);
                    if (applicationContext != null) {
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1013250600);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                            char cNormalizeMetaState = (char) KeyEvent.normalizeMetaState(0);
                            int iMyPid = 2267 - (Process.myPid() >> 22);
                            int maximumDrawingCacheSize = 33 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24);
                            Object[] objArr11 = new Object[1];
                            h((short) 89, (byte) 15, $$d[7], objArr11);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(cNormalizeMetaState, iMyPid, maximumDrawingCacheSize, -654680577, false, (String) objArr11[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr);
                        try {
                            Object[] objArr12 = new Object[1];
                            i(new byte[]{1, 0, 0, 1, 0, 0, 1, 0, 1, 0, 1, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1}, new int[]{0, 22, 194, 2}, false, objArr12);
                            Class<?> cls3 = Class.forName((String) objArr12[0]);
                            Object[] objArr13 = new Object[1];
                            i(new byte[]{0, 0, 1, 0, 0, 0, 1, 1, 1, 1, 0, 1, 0, 1, 0}, new int[]{22, 15, 194, 5}, false, objArr13);
                            long jLongValue2 = ((Long) cls3.getDeclaredMethod((String) objArr13[0], new Class[0]).invoke(null, new Object[0])).longValue();
                            Long lValueOf = Long.valueOf(jLongValue2);
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(796641770);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                                char cLastIndexOf = (char) ((-1) - TextUtils.lastIndexOf("", '0', 0));
                                int windowTouchSlop = 2267 - (ViewConfiguration.getWindowTouchSlop() >> 8);
                                int iKeyCodeFromString = 33 - KeyEvent.keyCodeFromString("");
                                short s3 = $$d[7];
                                byte b7 = (byte) s3;
                                Object[] objArr14 = new Object[1];
                                h(s3, b7, b7, objArr14);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(cLastIndexOf, windowTouchSlop, iKeyCodeFromString, -874156483, false, (String) objArr14[0], null);
                            }
                            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                            Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(797565291);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                                char maxKeyCode = (char) (KeyEvent.getMaxKeyCode() >> 16);
                                int iMakeMeasureSpec = 2267 - View.MeasureSpec.makeMeasureSpec(0, 0);
                                int iRgb = 16777249 + Color.rgb(0, 0, 0);
                                short s4 = (short) ($$e & 55);
                                byte b8 = $$d[7];
                                Object[] objArr15 = new Object[1];
                                h(s4, b8, b8, objArr15);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(maxKeyCode, iMakeMeasureSpec, iRgb, -887667012, false, (String) objArr15[0], null);
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
            int i6 = ((int[]) objArr[c])[0];
            int i7 = ((int[]) objArr[0])[0];
            if (i7 == i6) {
                Object[] objArr16 = {new int[]{i}, strArr, new int[1], new int[]{i}};
                int i8 = ((int[]) objArr[2])[0];
                int i9 = ((int[]) objArr[0])[0];
                int i10 = ((int[]) objArr[3])[0];
                String[] strArr2 = (String[]) objArr[1];
                int iElapsedRealtime = (int) SystemClock.elapsedRealtime();
                int i11 = ~((-775681733) | (~iElapsedRealtime));
                int i12 = i8 + ((29360411 | i11 | (~(775681732 | iElapsedRealtime))) * (-338)) + 2142597641 + (((~(iElapsedRealtime | 805042143)) | i11) * 338);
                int i13 = (i12 << 13) ^ i12;
                int i14 = i13 ^ (i13 >>> 17);
                ((int[]) objArr16[2])[0] = i14 ^ (i14 << 5);
            } else {
                ArrayList arrayList = new ArrayList();
                String[] strArr3 = (String[]) objArr[1];
                if (strArr3 != null) {
                    for (String str : strArr3) {
                        arrayList.add(str);
                    }
                }
                Toast.makeText((Context) null, i7 / (((i7 - 1) * i7) % 2), 0).show();
                Object[] objArr17 = {new int[]{i}, strArr, new int[1], new int[]{i}};
                int i15 = ((int[]) objArr[2])[0];
                int i16 = ((int[]) objArr[0])[0];
                int i17 = ((int[]) objArr[3])[0];
                String[] strArr4 = (String[]) objArr[1];
                int iIdentityHashCode = System.identityHashCode(this);
                int i18 = ~iIdentityHashCode;
                int i19 = i15 + (-1212835243) + (((~(255537656 | i18)) | 549505539) * (-108)) + (((~(i18 | 553175659)) | (~((-553175660) | iIdentityHashCode)) | 251867536) * 54) + ((iIdentityHashCode | 251867536) * 54);
                int i20 = (i19 << 13) ^ i19;
                int i21 = i20 ^ (i20 >>> 17);
                ((int[]) objArr17[2])[0] = i21 ^ (i21 << 5);
            }
            onsuggestedstreamspecimplementationoptionsupdated.b.remove(setdefaultresolution);
            setdefaultresolution.setRequest(null);
            return true;
        }
    }

    final RequestOptions TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        RequestOptions requestOptions;
        synchronized (this) {
            requestOptions = this.cancelAll;
        }
        return requestOptions;
    }

    final <T> AutoValue_SurfaceOutput_Event<?, T> TuitionPaymentFragmentspecialinlinedviewModeldefault3(Class<T> cls) {
        int i = 2 % 2;
        setRotationDegrees setrotationdegrees = this.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        AutoValue_SurfaceOutput_Event<?, T> autoValue_SurfaceOutput_Event = (AutoValue_SurfaceOutput_Event) setrotationdegrees.TuitionPaymentFragmentspecialinlinedviewModeldefault2.get(cls);
        if (autoValue_SurfaceOutput_Event == null) {
            Iterator<Map.Entry<Class<?>, AutoValue_SurfaceOutput_Event<?, ?>>> it = setrotationdegrees.TuitionPaymentFragmentspecialinlinedviewModeldefault2.entrySet().iterator();
            while (!(!it.hasNext())) {
                Map.Entry<Class<?>, AutoValue_SurfaceOutput_Event<?, ?>> next = it.next();
                if (!(!next.getKey().isAssignableFrom(cls))) {
                    int i2 = getInterfaceDescriptor + 61;
                    RemoteActionCompatParcelizer = i2 % 128;
                    if (i2 % 2 == 0) {
                        next.getValue();
                        throw null;
                    }
                    autoValue_SurfaceOutput_Event = (AutoValue_SurfaceOutput_Event) next.getValue();
                }
            }
        }
        if (autoValue_SurfaceOutput_Event == null) {
            return (AutoValue_SurfaceOutput_Event<?, T>) setRotationDegrees.b;
        }
        int i3 = RemoteActionCompatParcelizer + 69;
        getInterfaceDescriptor = i3 % 128;
        if (i3 % 2 == 0) {
            return autoValue_SurfaceOutput_Event;
        }
        throw null;
    }

    public String toString() {
        String string;
        synchronized (this) {
            StringBuilder sb = new StringBuilder();
            sb.append(super.toString());
            sb.append("{tracker=");
            sb.append(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
            sb.append(", treeNode=");
            sb.append(this.INotificationSideChannel);
            sb.append("}");
            string = sb.toString();
        }
        return string;
    }

    @Override // android.content.ComponentCallbacks2
    public void onTrimMemory(int i) {
        int i2 = 2 % 2;
        int i3 = getInterfaceDescriptor + 17;
        int i4 = i3 % 128;
        RemoteActionCompatParcelizer = i4;
        int i5 = i3 % 2;
        if (i == 60) {
            int i6 = i4 + 85;
            getInterfaceDescriptor = i6 % 128;
            if (i6 % 2 != 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            int i7 = i4 + 11;
            getInterfaceDescriptor = i7 % 128;
            int i8 = i7 % 2;
        }
    }

    @Override // android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 123;
        RemoteActionCompatParcelizer = i2 % 128;
        int i3 = i2 % 2;
    }

    @Override // android.content.ComponentCallbacks
    public void onLowMemory() {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 71;
        RemoteActionCompatParcelizer = i2 % 128;
        int i3 = i2 % 2;
    }

    static void TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        onTransact = new char[]{59801, 59426, 59427, 59426, 59424, 59430, 59449, 59429, 59427, 59392, 59419, 59448, 59417, 59401, 59427, 59443, 59454, 59429, 59424, 59409, 59410, 59428, 59804, 59449, 59451, 59430, 59424, 59436, 59425, 59427, 59425, 59448, 59429, 59437, 59414, 59414, 59438};
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0025  */
    /* JADX WARN: Code duplicated, block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0025
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$n(byte r6, byte r7, short r8) {
        /*
            int r6 = r6 * 2
            int r0 = r6 + 1
            byte[] r1 = com.bumptech.glide.RequestManager.$$l
            int r7 = r7 + 4
            int r8 = 105 - r8
            byte[] r0 = new byte[r0]
            r2 = 0
            if (r1 != 0) goto L12
            r3 = r7
            r4 = r2
            goto L2a
        L12:
            r3 = r2
            r5 = r8
            r8 = r7
            r7 = r5
        L16:
            byte r4 = (byte) r7
            r0[r3] = r4
            int r4 = r3 + 1
            int r8 = r8 + 1
            if (r3 != r6) goto L25
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            return r6
        L25:
            r3 = r1[r8]
            r5 = r3
            r3 = r8
            r8 = r5
        L2a:
            int r7 = r7 + r8
            r8 = r3
            r3 = r4
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.RequestManager.$$n(byte, byte, short):java.lang.String");
    }
}
