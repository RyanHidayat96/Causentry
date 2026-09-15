package com.bumptech.glide;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.net.Uri;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.ImageView;
import android.widget.Toast;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.bumptech.glide.request.BaseRequestOptions;
import com.bumptech.glide.request.RequestCoordinator;
import com.bumptech.glide.request.RequestOptions;
import com.bumptech.glide.request.SingleRequest;
import com.bumptech.glide.request.target.ViewTarget;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.google.android.libraries.places.internal.zzrf;
import defpackage.AutoValue_SurfaceOutput_Event;
import defpackage.CameraSelector;
import defpackage.ImageAnalysisBuilder;
import defpackage.deInitSession;
import defpackage.getAvailableCameraInfos;
import defpackage.getDefaultTargetResolution;
import defpackage.getTargetCoordinateSystem;
import defpackage.getUpdatedCropRect;
import defpackage.initSession;
import defpackage.isOutputImageRotationEnabled;
import defpackage.setBackgroundExecutor;
import defpackage.setBackpressureStrategy;
import defpackage.setCaptureType;
import defpackage.setCustomOrderedResolutions;
import defpackage.setDefaultResolution;
import defpackage.setDefaultSessionConfig;
import defpackage.setImageReaderProxyProvider;
import defpackage.setMaxResolution;
import defpackage.setRotationDegrees;
import defpackage.setTargetAspectRatio;
import java.io.File;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Executor;
import kotlin.text.Typography;

/* JADX INFO: loaded from: classes3.dex */
public class RequestBuilder<TranscodeType> extends BaseRequestOptions<RequestBuilder<TranscodeType>> implements Cloneable {
    private static char[] getSessionToken;
    private static char isConnected;
    private static int unsubscribe;
    private boolean IconCompatParcelizer = true;
    private final setRotationDegrees MediaBrowserCompat;
    private final Context RemoteActionCompatParcelizer;
    private final Glide connect;
    private Float disconnect;
    private final RequestManager getExtras;
    private List<getTargetCoordinateSystem<TranscodeType>> getItem;
    private Object getNotifyChildrenChangedOptions;
    private boolean getRoot;
    private AutoValue_SurfaceOutput_Event<?, ? super TranscodeType> getServiceComponent;
    private boolean read;
    private RequestBuilder<TranscodeType> search;
    private final Class<TranscodeType> sendCustomAction;
    private RequestBuilder<TranscodeType> write;
    private static final byte[] $$l = {90, 46, 113, 8};
    private static final int $$o = 176;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$p = {89, 107, -36, -112, -9, 5, 66, -54, -5, 3, 11, -2, 10, 58, -48, -10, 13, -11, 6, 9, 8, 57, -54, -3, -3, 72, -56, -2, -3, 18, -10, 7, 16, -8, 65, -60, 4, 4, 5, -8, 24, -1, -9, 5, 3, 1, 4, 67, -73, 3, 18, -3, -30, 15, -8, 14, -3, 4, 33, -14, -21, 15, 11, -6, -3, 49, -41, 20, -3, -3, 11, -6, -3, 4, 6, 14, 5, -3, 11, -8, 6, -2, 5, 6, -2, 12, 4, -15, 16, 7, -15, 45, -31, 14, 2, -4, 11, 2, 2, 8, -17, 12, -5, 68, -30, 15, -8, 14, -3, 4, 33, -14, -21, 15, 11, -6, -3, 49, -41, 20, -3, -3, 11, -6, -3, 4, 6, 14, 5, -3, 11, -8, 6, -2, 5, 6, -2, 12, 4, -15, 16, 7, -15, 45, -31, 14, 2, -4, 11, 2, 2, 8, -17, 12, -5, 69};
    private static final int $$q = 34;
    private static final byte[] $$g = {53, -70, 9, -72, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 56, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 54, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 55, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, 7, -18, -16, -1, -16, -16, -4, 19, -48, -3, -17, 0, -30, 4, -24, 54};
    private static final int $$h = 54;
    private static int setCallbacksMessenger = 0;
    private static int subscribe = 1;
    private static int MediaBrowserCompatCallbackHandler = 0;

    /* JADX WARN: Code duplicated, block: B:10:0x0023  */
    /* JADX WARN: Code duplicated, block: B:8:0x001b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0023
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void h(short r6, byte r7, byte r8, java.lang.Object[] r9) {
        /*
            int r8 = 53 - r8
            int r7 = 103 - r7
            int r6 = r6 + 4
            byte[] r0 = com.bumptech.glide.RequestBuilder.$$g
            byte[] r1 = new byte[r8]
            r2 = 0
            if (r0 != 0) goto L11
            r7 = r6
            r3 = r8
            r4 = r2
            goto L2a
        L11:
            r3 = r2
        L12:
            byte r4 = (byte) r7
            r1[r3] = r4
            int r3 = r3 + 1
            int r6 = r6 + 1
            if (r3 != r8) goto L23
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L23:
            r4 = r0[r6]
            r5 = r7
            r7 = r6
            r6 = r4
            r4 = r3
            r3 = r5
        L2a:
            int r6 = -r6
            int r3 = r3 + r6
            int r6 = r3 + (-11)
            r3 = r4
            r5 = r7
            r7 = r6
            r6 = r5
            goto L12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.RequestBuilder.h(short, byte, byte, java.lang.Object[]):void");
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0025  */
    /* JADX WARN: Code duplicated, block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002b). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0025
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void j(byte r7, short r8, int r9, java.lang.Object[] r10) {
        /*
            int r9 = 99 - r9
            int r8 = r8 * 4
            int r8 = r8 + 4
            byte[] r0 = com.bumptech.glide.RequestBuilder.$$p
            int r7 = r7 * 4
            int r7 = 53 - r7
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L15
            r3 = r9
            r4 = r2
            r9 = r8
            goto L2b
        L15:
            r3 = r2
        L16:
            int r4 = r3 + 1
            byte r5 = (byte) r9
            r1[r3] = r5
            if (r4 != r7) goto L25
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            r10[r2] = r7
            return
        L25:
            r3 = r0[r8]
            r6 = r9
            r9 = r8
            r8 = r3
            r3 = r6
        L2b:
            int r8 = -r8
            int r3 = r3 + r8
            int r8 = r9 + 1
            int r9 = r3 + 3
            r3 = r4
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.RequestBuilder.j(byte, short, int, java.lang.Object[]):void");
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    public /* synthetic */ BaseRequestOptions TuitionPaymentFragmentspecialinlinedviewModeldefault1(BaseRequestOptions baseRequestOptions) {
        int i = 2 % 2;
        int i2 = setCallbacksMessenger + 27;
        subscribe = i2 % 128;
        int i3 = i2 % 2;
        RequestBuilder<TranscodeType> requestBuilderApply = apply(baseRequestOptions);
        int i4 = setCallbacksMessenger + 89;
        subscribe = i4 % 128;
        if (i4 % 2 != 0) {
            return requestBuilderApply;
        }
        throw null;
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    public /* synthetic */ BaseRequestOptions TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        int i = 2 % 2;
        int i2 = setCallbacksMessenger + 27;
        subscribe = i2 % 128;
        if (i2 % 2 != 0) {
            return INotificationSideChannel();
        }
        INotificationSideChannel();
        throw null;
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    public /* synthetic */ Object clone() throws CloneNotSupportedException {
        int i = 2 % 2;
        int i2 = subscribe + 105;
        setCallbacksMessenger = i2 % 128;
        int i3 = i2 % 2;
        RequestBuilder<TranscodeType> requestBuilderINotificationSideChannel = INotificationSideChannel();
        int i4 = subscribe + 3;
        setCallbacksMessenger = i4 % 128;
        int i5 = i4 % 2;
        return requestBuilderINotificationSideChannel;
    }

    static {
        unsubscribe = 1;
        cancel();
        new RequestOptions().b(CameraSelector.TuitionPaymentFragmentbindingInflater1).b(Priority.LOW).TuitionPaymentFragmentbindingInflater1(true);
        int i = MediaBrowserCompatCallbackHandler + 33;
        unsubscribe = i % 128;
        int i2 = i % 2;
    }

    public RequestBuilder(Glide glide, RequestManager requestManager, Class<TranscodeType> cls, Context context) {
        this.connect = glide;
        this.getExtras = requestManager;
        this.sendCustomAction = cls;
        this.RemoteActionCompatParcelizer = context;
        this.getServiceComponent = requestManager.TuitionPaymentFragmentspecialinlinedviewModeldefault3((Class) cls);
        this.MediaBrowserCompat = glide.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        Iterator<getTargetCoordinateSystem<Object>> it = requestManager.TuitionPaymentFragmentspecialinlinedviewModeldefault3.iterator();
        while (!(!it.hasNext())) {
            TuitionPaymentFragmentspecialinlinedviewModeldefault2((getTargetCoordinateSystem) it.next());
            int i = setCallbacksMessenger + 15;
            subscribe = i % 128;
            if (i % 2 != 0) {
                int i2 = 2 % 2;
            }
        }
        apply(requestManager.TuitionPaymentFragmentspecialinlinedviewModeldefault2());
        int i3 = subscribe + 79;
        setCallbacksMessenger = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
    }

    public RequestBuilder<TranscodeType> apply(BaseRequestOptions<?> baseRequestOptions) {
        int i = 2 % 2;
        int i2 = setCallbacksMessenger + 1;
        subscribe = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
        if (baseRequestOptions == null) {
            throw new NullPointerException("Argument must not be null");
        }
        RequestBuilder<TranscodeType> requestBuilder = (RequestBuilder) super.TuitionPaymentFragmentspecialinlinedviewModeldefault1(baseRequestOptions);
        int i3 = setCallbacksMessenger + 95;
        subscribe = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 29 / 0;
        }
        return requestBuilder;
    }

    public RequestBuilder<TranscodeType> b(AutoValue_SurfaceOutput_Event<?, ? super TranscodeType> autoValue_SurfaceOutput_Event) {
        int i = 2 % 2;
        int i2 = setCallbacksMessenger + 81;
        subscribe = i2 % 128;
        if (i2 % 2 == 0) {
            getInterfaceDescriptor();
            throw null;
        }
        if (getInterfaceDescriptor()) {
            return INotificationSideChannel().b(autoValue_SurfaceOutput_Event);
        }
        if (autoValue_SurfaceOutput_Event == null) {
            throw new NullPointerException("Argument must not be null");
        }
        int i3 = setCallbacksMessenger + 21;
        subscribe = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        this.getServiceComponent = autoValue_SurfaceOutput_Event;
        this.IconCompatParcelizer = false;
        return read();
    }

    private static void i(int i, char[] cArr, byte b, Object[] objArr) throws Throwable {
        int i2;
        int i3 = 2 % 2;
        deInitSession deinitsession = new deInitSession();
        char[] cArr2 = getSessionToken;
        char c = '0';
        long j = 0;
        int i4 = 1770390596;
        if (cArr2 != null) {
            int i5 = $11 + 111;
            $10 = i5 % 128;
            int i6 = i5 % 2;
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i7 = 0;
            while (i7 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i7])};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(i4);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        char absoluteGravity = (char) Gravity.getAbsoluteGravity(0, 0);
                        int iLastIndexOf = TextUtils.lastIndexOf("", c, 0) + 2268;
                        int i8 = 33 - (ExpandableListView.getPackedPositionForGroup(0) > j ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == j ? 0 : -1));
                        byte b2 = (byte) 0;
                        byte b3 = (byte) (b2 + 3);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(absoluteGravity, iLastIndexOf, i8, -1927765101, false, $$r(b2, b3, (byte) (b3 - 4)), new Class[]{Integer.TYPE});
                    }
                    cArr3[i7] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                    i7++;
                    c = '0';
                    j = 0;
                    i4 = 1770390596;
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
        Object[] objArr3 = {Integer.valueOf(isConnected)};
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1770390596);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            byte b4 = (byte) 0;
            byte b5 = (byte) (b4 + 3);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), TextUtils.getOffsetBefore("", 0) + 2267, 33 - ExpandableListView.getPackedPositionType(0L), -1927765101, false, $$r(b4, b5, (byte) (b5 - 4)), new Class[]{Integer.TYPE});
        }
        char cCharValue = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).charValue();
        char[] cArr4 = new char[i];
        if (i % 2 != 0) {
            i2 = i - 1;
            cArr4[i2] = (char) (cArr[i2] - b);
        } else {
            i2 = i;
        }
        if (i2 > 1) {
            int i9 = $11 + 119;
            $10 = i9 % 128;
            if (i9 % 2 != 0) {
                deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
            } else {
                deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
            }
            while (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 < i2) {
                deinitsession.b = cArr[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3];
                deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = cArr[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1];
                if (deinitsession.b == deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                    cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = (char) (deinitsession.b - b);
                    cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = (char) (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault2 - b);
                } else {
                    Object[] objArr4 = {deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(486174475);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                        byte b6 = (byte) 0;
                        byte b7 = (byte) (b6 + 2);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (TextUtils.getOffsetAfter("", 0) + 49267), 3261 - View.resolveSize(0, 0), 31 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), -127612708, false, $$r(b6, b7, (byte) (b7 - 3)), new Class[]{Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class});
                    }
                    if (((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4)).intValue() == deinitsession.asBinder) {
                        Object[] objArr5 = {deinitsession, deinitsession, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), deinitsession, Integer.valueOf(cCharValue), deinitsession};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1187000607);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                            byte b8 = (byte) 0;
                            byte b9 = b8;
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (22878 - KeyEvent.keyCodeFromString("")), MotionEvent.axisFromString("") + 595, TextUtils.indexOf((CharSequence) "", '0') + 18, 1570859318, false, $$r(b8, b9, (byte) (b9 - 1)), new Class[]{Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Integer.TYPE, Object.class});
                        }
                        int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).intValue();
                        int i10 = (deinitsession.TuitionPaymentFragmentbindingInflater1 * cCharValue) + deinitsession.asBinder;
                        cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr2[iIntValue];
                        cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = cArr2[i10];
                    } else if (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault1 == deinitsession.TuitionPaymentFragmentbindingInflater1) {
                        deinitsession.g = ((deinitsession.g + cCharValue) - 1) % cCharValue;
                        deinitsession.asBinder = ((deinitsession.asBinder + cCharValue) - 1) % cCharValue;
                        int i11 = (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault1 * cCharValue) + deinitsession.g;
                        int i12 = (deinitsession.TuitionPaymentFragmentbindingInflater1 * cCharValue) + deinitsession.asBinder;
                        cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr2[i11];
                        cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = cArr2[i12];
                    } else {
                        int i13 = (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault1 * cCharValue) + deinitsession.asBinder;
                        int i14 = (deinitsession.TuitionPaymentFragmentbindingInflater1 * cCharValue) + deinitsession.g;
                        cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr2[i13];
                        cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = cArr2[i14];
                    }
                }
                deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 += 2;
            }
        }
        int i15 = 0;
        while (i15 < i) {
            cArr4[i15] = (char) (cArr4[i15] ^ 13722);
            i15++;
            int i16 = $11 + 51;
            $10 = i16 % 128;
            int i17 = i16 % 2;
        }
        objArr[0] = new String(cArr4);
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0033  */
    public RequestBuilder<TranscodeType> TuitionPaymentFragmentspecialinlinedviewModeldefault2(getTargetCoordinateSystem<TranscodeType> gettargetcoordinatesystem) {
        int i = 2 % 2;
        if (getInterfaceDescriptor()) {
            int i2 = setCallbacksMessenger + 31;
            subscribe = i2 % 128;
            int i3 = i2 % 2;
            return INotificationSideChannel().TuitionPaymentFragmentspecialinlinedviewModeldefault2(gettargetcoordinatesystem);
        }
        if (gettargetcoordinatesystem != null) {
            int i4 = setCallbacksMessenger + 97;
            subscribe = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 2 / 0;
                if (this.getItem == null) {
                    this.getItem = new ArrayList();
                }
            } else if (this.getItem == null) {
                this.getItem = new ArrayList();
            }
            this.getItem.add(gettargetcoordinatesystem);
            int i6 = subscribe + 41;
            setCallbacksMessenger = i6 % 128;
            int i7 = i6 % 2;
        }
        return read();
    }

    public RequestBuilder<TranscodeType> TuitionPaymentFragmentspecialinlinedviewModeldefault1(Object obj) {
        int i = 2 % 2;
        int i2 = setCallbacksMessenger + 85;
        subscribe = i2 % 128;
        int i3 = i2 % 2;
        RequestBuilder<TranscodeType> requestBuilderTuitionPaymentFragmentspecialinlinedviewModeldefault3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3(obj);
        if (i3 == 0) {
            int i4 = 19 / 0;
        }
        int i5 = subscribe + 9;
        setCallbacksMessenger = i5 % 128;
        if (i5 % 2 == 0) {
            return requestBuilderTuitionPaymentFragmentspecialinlinedviewModeldefault3;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    private RequestBuilder<TranscodeType> TuitionPaymentFragmentspecialinlinedviewModeldefault3(Object obj) {
        int i = 2 % 2;
        RequestBuilder<TranscodeType> requestBuilderINotificationSideChannel = this;
        while (requestBuilderINotificationSideChannel.getInterfaceDescriptor()) {
            int i2 = subscribe + 43;
            setCallbacksMessenger = i2 % 128;
            int i3 = i2 % 2;
            requestBuilderINotificationSideChannel = requestBuilderINotificationSideChannel.INotificationSideChannel();
        }
        requestBuilderINotificationSideChannel.getNotifyChildrenChangedOptions = obj;
        requestBuilderINotificationSideChannel.read = true;
        RequestBuilder<TranscodeType> requestBuilder = requestBuilderINotificationSideChannel.read();
        int i4 = subscribe + 21;
        setCallbacksMessenger = i4 % 128;
        int i5 = i4 % 2;
        return requestBuilder;
    }

    public RequestBuilder<TranscodeType> TuitionPaymentFragmentspecialinlinedviewModeldefault1(Bitmap bitmap) {
        int i = 2 % 2;
        int i2 = subscribe + 23;
        setCallbacksMessenger = i2 % 128;
        int i3 = i2 % 2;
        RequestBuilder<TranscodeType> requestBuilderApply = TuitionPaymentFragmentspecialinlinedviewModeldefault3(bitmap).apply(RequestOptions.TuitionPaymentFragmentspecialinlinedviewModeldefault2(CameraSelector.b));
        int i4 = setCallbacksMessenger + 31;
        subscribe = i4 % 128;
        if (i4 % 2 != 0) {
            return requestBuilderApply;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public RequestBuilder<TranscodeType> TuitionPaymentFragmentspecialinlinedviewModeldefault3(String str) {
        int i = 2 % 2;
        int i2 = setCallbacksMessenger + 67;
        subscribe = i2 % 128;
        int i3 = i2 % 2;
        RequestBuilder<TranscodeType> requestBuilderTuitionPaymentFragmentspecialinlinedviewModeldefault3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3((Object) str);
        int i4 = subscribe + 89;
        setCallbacksMessenger = i4 % 128;
        int i5 = i4 % 2;
        return requestBuilderTuitionPaymentFragmentspecialinlinedviewModeldefault3;
    }

    public RequestBuilder<TranscodeType> TuitionPaymentFragmentbindingInflater1(Uri uri) {
        int i = 2 % 2;
        int i2 = subscribe + 23;
        setCallbacksMessenger = i2 % 128;
        int i3 = i2 % 2;
        RequestBuilder<TranscodeType> requestBuilderTuitionPaymentFragmentspecialinlinedviewModeldefault3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3(uri);
        if (uri != null) {
            int i4 = subscribe + 1;
            setCallbacksMessenger = i4 % 128;
            int i5 = i4 % 2;
            if ("android.resource".equals(uri.getScheme())) {
                int i6 = subscribe + 85;
                setCallbacksMessenger = i6 % 128;
                int i7 = i6 % 2;
                return TuitionPaymentFragmentspecialinlinedviewModeldefault3((RequestBuilder) requestBuilderTuitionPaymentFragmentspecialinlinedviewModeldefault3);
            }
        }
        int i8 = setCallbacksMessenger + 125;
        subscribe = i8 % 128;
        int i9 = i8 % 2;
        return requestBuilderTuitionPaymentFragmentspecialinlinedviewModeldefault3;
    }

    private RequestBuilder<TranscodeType> TuitionPaymentFragmentspecialinlinedviewModeldefault3(RequestBuilder<TranscodeType> requestBuilder) {
        int i = 2 % 2;
        int i2 = subscribe + 41;
        setCallbacksMessenger = i2 % 128;
        if (i2 % 2 == 0) {
            return requestBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1(this.RemoteActionCompatParcelizer.getTheme()).TuitionPaymentFragmentspecialinlinedviewModeldefault2(setImageReaderProxyProvider.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.RemoteActionCompatParcelizer));
        }
        int i3 = 65 / 0;
        return requestBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1(this.RemoteActionCompatParcelizer.getTheme()).TuitionPaymentFragmentspecialinlinedviewModeldefault2(setImageReaderProxyProvider.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.RemoteActionCompatParcelizer));
    }

    public RequestBuilder<TranscodeType> TuitionPaymentFragmentspecialinlinedviewModeldefault3(File file) {
        int i = 2 % 2;
        int i2 = setCallbacksMessenger + 115;
        subscribe = i2 % 128;
        if (i2 % 2 != 0) {
            return TuitionPaymentFragmentspecialinlinedviewModeldefault3((Object) file);
        }
        TuitionPaymentFragmentspecialinlinedviewModeldefault3((Object) file);
        throw null;
    }

    public RequestBuilder<TranscodeType> TuitionPaymentFragmentbindingInflater1(Integer num) {
        int i = 2 % 2;
        int i2 = subscribe + 13;
        setCallbacksMessenger = i2 % 128;
        int i3 = i2 % 2;
        RequestBuilder<TranscodeType> requestBuilderTuitionPaymentFragmentspecialinlinedviewModeldefault3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3((RequestBuilder) TuitionPaymentFragmentspecialinlinedviewModeldefault3(num));
        if (i3 != 0) {
            int i4 = 17 / 0;
        }
        int i5 = subscribe + 25;
        setCallbacksMessenger = i5 % 128;
        int i6 = i5 % 2;
        return requestBuilderTuitionPaymentFragmentspecialinlinedviewModeldefault3;
    }

    public RequestBuilder<TranscodeType> INotificationSideChannel() {
        int i = 2 % 2;
        int i2 = subscribe + 33;
        setCallbacksMessenger = i2 % 128;
        int i3 = i2 % 2;
        RequestBuilder<TranscodeType> requestBuilder = (RequestBuilder) super.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        requestBuilder.getServiceComponent = requestBuilder.getServiceComponent.clone();
        if (requestBuilder.getItem != null) {
            requestBuilder.getItem = new ArrayList(requestBuilder.getItem);
        }
        RequestBuilder<TranscodeType> requestBuilder2 = requestBuilder.search;
        if (requestBuilder2 != null) {
            int i4 = subscribe + 3;
            setCallbacksMessenger = i4 % 128;
            int i5 = i4 % 2;
            requestBuilder.search = requestBuilder2.INotificationSideChannel();
        }
        RequestBuilder<TranscodeType> requestBuilder3 = requestBuilder.write;
        if (requestBuilder3 != null) {
            requestBuilder.write = requestBuilder3.INotificationSideChannel();
        }
        return requestBuilder;
    }

    /* JADX INFO: renamed from: com.bumptech.glide.RequestBuilder$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] TuitionPaymentFragmentbindingInflater1;
        static final /* synthetic */ int[] TuitionPaymentFragmentspecialinlinedviewModeldefault3;

        static {
            int[] iArr = new int[Priority.values().length];
            TuitionPaymentFragmentbindingInflater1 = iArr;
            try {
                iArr[Priority.LOW.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                TuitionPaymentFragmentbindingInflater1[Priority.NORMAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                TuitionPaymentFragmentbindingInflater1[Priority.HIGH.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                TuitionPaymentFragmentbindingInflater1[Priority.IMMEDIATE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr2 = new int[ImageView.ScaleType.values().length];
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = iArr2;
            try {
                iArr2[ImageView.ScaleType.CENTER_CROP.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                TuitionPaymentFragmentspecialinlinedviewModeldefault3[ImageView.ScaleType.CENTER_INSIDE.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                TuitionPaymentFragmentspecialinlinedviewModeldefault3[ImageView.ScaleType.FIT_CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                TuitionPaymentFragmentspecialinlinedviewModeldefault3[ImageView.ScaleType.FIT_START.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                TuitionPaymentFragmentspecialinlinedviewModeldefault3[ImageView.ScaleType.FIT_END.ordinal()] = 5;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                TuitionPaymentFragmentspecialinlinedviewModeldefault3[ImageView.ScaleType.FIT_XY.ordinal()] = 6;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                TuitionPaymentFragmentspecialinlinedviewModeldefault3[ImageView.ScaleType.CENTER.ordinal()] = 7;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                TuitionPaymentFragmentspecialinlinedviewModeldefault3[ImageView.ScaleType.MATRIX.ordinal()] = 8;
            } catch (NoSuchFieldError unused12) {
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:27:0x022d  */
    public ViewTarget<ImageView, TranscodeType> into(ImageView imageView) {
        Object[] objArr;
        BaseRequestOptions baseRequestOptionsG;
        setBackpressureStrategy setcapturetype;
        int i = 2 % 2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(797565291);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char cBlue = (char) Color.blue(0);
            int maxKeyCode = 2267 - (KeyEvent.getMaxKeyCode() >> 16);
            int i2 = 33 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1));
            short s = (short) ($$h - 3);
            byte[] bArr = $$g;
            Object[] objArr2 = new Object[1];
            h(s, bArr[10], bArr[7], objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cBlue, maxKeyCode, i2, -887667012, false, (String) objArr2[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr3 = new Object[1];
        i(22 - TextUtils.getTrimmedLength(""), new char[]{'\t', 30, 18, '#', 30, ' ', 20, 17, 31, 29, 15, 14, 27, 26, 11, 2, 28, 16, 17, 30, 3, 18}, (byte) (12 - TextUtils.getOffsetBefore("", 0)), objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        i(15 - (ViewConfiguration.getDoubleTapTimeout() >> 16), new char[]{0, 17, 7, 0, 29, 1, 29, '#', 0, 11, 14, 6, Typography.quote, 19, 13904}, (byte) (81 - TextUtils.getOffsetAfter("", 0)), objArr4);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(796641770);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char cLastIndexOf = (char) (TextUtils.lastIndexOf("", '0') + 1);
            int i3 = 2266 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1));
            int iRgb = (-16777183) - Color.rgb(0, 0, 0);
            byte[] bArr2 = $$g;
            Object[] objArr5 = new Object[1];
            h((short) 103, bArr2[10], bArr2[7], objArr5);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cLastIndexOf, i3, iRgb, -874156483, false, (String) objArr5[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1013250600);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char c = (char) (1 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)));
                int iGreen = Color.green(0) + 2267;
                int mode = View.MeasureSpec.getMode(0) + 33;
                short s2 = (short) ModuleDescriptor.MODULE_VERSION;
                byte b = $$g[10];
                Object[] objArr6 = new Object[1];
                h(s2, b, (byte) (b - 4), objArr6);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(c, iGreen, mode, -654680577, false, (String) objArr6[0], null);
            }
            Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            objArr = new Object[]{new int[]{i}, strArr, new int[1], new int[]{i}};
            int i4 = ((int[]) objArr7[0])[0];
            int i5 = ((int[]) objArr7[3])[0];
            String[] strArr = (String[]) objArr7[1];
            int iIdentityHashCode = System.identityHashCode(this);
            int i6 = 401381474 + ((~((~iIdentityHashCode) | (-118104915))) * 433) + (((~((-418764938) | iIdentityHashCode)) | (-389948379)) * (-433)) + (((~(iIdentityHashCode | (-389948379))) | (-536869852)) * 433) + 1486327595;
            int i7 = (i6 << 13) ^ i6;
            int i8 = i7 ^ (i7 >>> 17);
            ((int[]) objArr[2])[0] = i8 ^ (i8 << 5);
        } else {
            Object[] objArr8 = new Object[1];
            i(TextUtils.getOffsetBefore("", 0) + 26, new char[]{'\t', 30, 18, '#', 30, ' ', 20, 17, 7, 0, 2, '\r', 6, 3, 7, ' ', 19, 30, 14, ' ', 21, 14, '#', 0, 11, 18}, (byte) (122 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))), objArr8);
            Class<?> cls2 = Class.forName((String) objArr8[0]);
            Object[] objArr9 = new Object[1];
            i((ViewConfiguration.getKeyRepeatTimeout() >> 16) + 18, new char[]{2, 30, 13825, 13825, 3, '#', '\t', '\n', 13827, 13827, '\r', 30, 6, '\f', 7, ' ', 30, Typography.quote}, (byte) ((ViewConfiguration.getFadingEdgeLength() >> 16) + 25), objArr9);
            Context applicationContext = (Context) cls2.getMethod((String) objArr9[0], new Class[0]).invoke(null, null);
            if (applicationContext != null) {
                if (applicationContext instanceof ContextWrapper) {
                    int i9 = setCallbacksMessenger + 81;
                    subscribe = i9 % 128;
                    if (i9 % 2 == 0) {
                        ((ContextWrapper) applicationContext).getBaseContext();
                        Object obj = null;
                        obj.hashCode();
                        throw null;
                    }
                    if (((ContextWrapper) applicationContext).getBaseContext() != null) {
                        applicationContext = applicationContext.getApplicationContext();
                    } else {
                        applicationContext = null;
                    }
                } else {
                    applicationContext = applicationContext.getApplicationContext();
                }
            }
            Object[] objArr10 = new Object[1];
            i(15 - ExpandableListView.getPackedPositionChild(0L), new char[]{6, 7, 24, '\f', 15, '\r', '\t', 30, 26, 15, 14, 25, 26, 7, 4, 23}, (byte) ((ViewConfiguration.getFadingEdgeLength() >> 16) + 124), objArr10);
            Class<?> cls3 = Class.forName((String) objArr10[0]);
            Object[] objArr11 = new Object[1];
            i((ViewConfiguration.getKeyRepeatDelay() >> 16) + 16, new char[]{'#', 19, 3, '#', 7, ' ', 14, ' ', 0, '\b', 27, '\r', 11, Typography.quote, 29, 11}, (byte) (TextUtils.indexOf("", "") + 91), objArr11);
            try {
                Object[] objArr12 = {applicationContext, Integer.valueOf(((Integer) cls3.getMethod((String) objArr11[0], Object.class).invoke(null, this)).intValue()), 0, 1486327595};
                byte[] bArr3 = $$p;
                Object[] objArr13 = new Object[1];
                j(bArr3[16], (byte) (bArr3[40] + 1), (byte) (bArr3[67] - 1), objArr13);
                Class<?> cls4 = Class.forName((String) objArr13[0]);
                byte b2 = (byte) (bArr3[45] - 1);
                Object[] objArr14 = new Object[1];
                j(b2, (byte) (b2 | 25), bArr3[53], objArr14);
                Object[] objArr15 = (Object[]) cls4.getMethod((String) objArr14[0], Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr12);
                if (applicationContext != null) {
                    int i10 = subscribe + 115;
                    setCallbacksMessenger = i10 % 128;
                    int i11 = i10 % 2;
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1013250600);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        char edgeSlop = (char) (ViewConfiguration.getEdgeSlop() >> 16);
                        int packedPositionGroup = 2267 - ExpandableListView.getPackedPositionGroup(0L);
                        int gidForName = 32 - Process.getGidForName("");
                        short s3 = (short) ModuleDescriptor.MODULE_VERSION;
                        byte b3 = $$g[10];
                        Object[] objArr16 = new Object[1];
                        h(s3, b3, (byte) (b3 - 4), objArr16);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(edgeSlop, packedPositionGroup, gidForName, -654680577, false, (String) objArr16[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr15);
                    try {
                        Object[] objArr17 = new Object[1];
                        i(TextUtils.indexOf((CharSequence) "", '0') + 23, new char[]{'\t', 30, 18, '#', 30, ' ', 20, 17, 31, 29, 15, 14, 27, 26, 11, 2, 28, 16, 17, 30, 3, 18}, (byte) (12 - Color.red(0)), objArr17);
                        Class<?> cls5 = Class.forName((String) objArr17[0]);
                        Object[] objArr18 = new Object[1];
                        i(View.combineMeasuredStates(0, 0) + 15, new char[]{0, 17, 7, 0, 29, 1, 29, '#', 0, 11, 14, 6, Typography.quote, 19, 13904}, (byte) (ExpandableListView.getPackedPositionType(0L) + 81), objArr18);
                        long jLongValue2 = ((Long) cls5.getDeclaredMethod((String) objArr18[0], new Class[0]).invoke(null, new Object[0])).longValue();
                        Long lValueOf = Long.valueOf(jLongValue2);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(796641770);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                            char cMyTid = (char) (Process.myTid() >> 22);
                            int iResolveOpacity = 2267 - Drawable.resolveOpacity(0, 0);
                            int iKeyCodeFromString = KeyEvent.keyCodeFromString("") + 33;
                            byte[] bArr4 = $$g;
                            Object[] objArr19 = new Object[1];
                            h((short) 103, bArr4[10], bArr4[7], objArr19);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(cMyTid, iResolveOpacity, iKeyCodeFromString, -874156483, false, (String) objArr19[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                        Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(797565291);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                            char c2 = (char) ((-1) - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)));
                            int iAlpha = Color.alpha(0) + 2267;
                            int size = View.MeasureSpec.getSize(0) + 33;
                            short s4 = (short) ($$h - 3);
                            byte[] bArr5 = $$g;
                            Object[] objArr20 = new Object[1];
                            h(s4, bArr5[10], bArr5[7], objArr20);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(c2, iAlpha, size, -887667012, false, (String) objArr20[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf2);
                    } catch (Exception unused) {
                        throw new RuntimeException();
                    }
                }
                objArr = objArr15;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            }
        }
        int i12 = ((int[]) objArr[3])[0];
        int i13 = ((int[]) objArr[0])[0];
        if (i13 == i12) {
            Object[] objArr21 = {new int[]{i}, strArr, new int[1], new int[]{i}};
            int i14 = ((int[]) objArr[2])[0];
            int i15 = ((int[]) objArr[0])[0];
            int i16 = ((int[]) objArr[3])[0];
            String[] strArr2 = (String[]) objArr[1];
            int iMyTid = Process.myTid();
            int i17 = ~iMyTid;
            int i18 = i14 + 172719378 + (((~((-495846714) | i17)) | (-312866603)) * (-865)) + ((~(iMyTid | 495846713)) * 865) + (((~((-312866603) | i17)) | (~(i17 | 495846713))) * 865);
            int i19 = (i18 << 13) ^ i18;
            int i20 = i19 ^ (i19 >>> 17);
            ((int[]) objArr21[2])[0] = i20 ^ (i20 << 5);
        } else {
            ArrayList arrayList = new ArrayList();
            String[] strArr3 = (String[]) objArr[1];
            if (strArr3 != null) {
                int i21 = subscribe + 25;
                setCallbacksMessenger = i21 % 128;
                int i22 = i21 % 2;
                for (String str : strArr3) {
                    arrayList.add(str);
                }
            }
            Toast.makeText((Context) null, i13 / (((i13 - 1) * i13) % 2), 0).show();
            Object[] objArr22 = {new int[]{i}, strArr, new int[1], new int[]{i}};
            int i23 = ((int[]) objArr[2])[0];
            int i24 = ((int[]) objArr[0])[0];
            int i25 = ((int[]) objArr[3])[0];
            String[] strArr4 = (String[]) objArr[1];
            int iElapsedRealtime = (int) SystemClock.elapsedRealtime();
            int i26 = i23 + (-341590612) + (((~(iElapsedRealtime | (-39610972))) | (-848324288)) * (-465)) + (((-39610972) | (~((-848324288) | iElapsedRealtime))) * 930) + ((iElapsedRealtime | (-34628124)) * 465);
            int i27 = (i26 << 13) ^ i26;
            int i28 = i27 ^ (i27 >>> 17);
            ((int[]) objArr22[2])[0] = i28 ^ (i28 << 5);
        }
        getUpdatedCropRect.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        if (imageView == null) {
            throw new NullPointerException("Argument must not be null");
        }
        if (!RemoteActionCompatParcelizer()) {
            if (((Boolean) BaseRequestOptions.TuitionPaymentFragmentspecialinlinedviewModeldefault1(new Object[]{this}, -81499774, zzrf.b(), zzrf.b(), 81499775, zzrf.b(), zzrf.b())).booleanValue() && imageView.getScaleType() != null) {
                switch (AnonymousClass1.TuitionPaymentFragmentspecialinlinedviewModeldefault3[imageView.getScaleType().ordinal()]) {
                    case 1:
                        baseRequestOptionsG = TuitionPaymentFragmentspecialinlinedviewModeldefault3().g();
                        break;
                    case 2:
                        baseRequestOptionsG = TuitionPaymentFragmentspecialinlinedviewModeldefault3().a();
                        break;
                    case 3:
                    case 4:
                    case 5:
                        baseRequestOptionsG = TuitionPaymentFragmentspecialinlinedviewModeldefault3().asInterface();
                        int i29 = subscribe + 67;
                        setCallbacksMessenger = i29 % 128;
                        int i30 = i29 % 2;
                        break;
                    case 6:
                        baseRequestOptionsG = TuitionPaymentFragmentspecialinlinedviewModeldefault3().a();
                        break;
                    default:
                        baseRequestOptionsG = this;
                        break;
                }
            } else {
                baseRequestOptionsG = this;
            }
        } else {
            baseRequestOptionsG = this;
        }
        setRotationDegrees setrotationdegrees = this.MediaBrowserCompat;
        Class<TranscodeType> cls6 = this.sendCustomAction;
        setDefaultSessionConfig setdefaultsessionconfig = setrotationdegrees.asBinder;
        if (Bitmap.class.equals(cls6)) {
            setcapturetype = new setBackgroundExecutor(imageView);
        } else {
            if (!Drawable.class.isAssignableFrom(cls6)) {
                StringBuilder sb = new StringBuilder("Unhandled class: ");
                sb.append(cls6);
                sb.append(", try .as*(Class).transcode(ResourceTranscoder)");
                throw new IllegalArgumentException(sb.toString());
            }
            setcapturetype = new setCaptureType(imageView);
        }
        return (ViewTarget) TuitionPaymentFragmentspecialinlinedviewModeldefault2(setcapturetype, null, baseRequestOptionsG, setTargetAspectRatio.TuitionPaymentFragmentspecialinlinedviewModeldefault2());
    }

    /* JADX WARN: Code duplicated, block: B:10:0x002a  */
    /* JADX WARN: Code duplicated, block: B:9:0x0020  */
    private ImageAnalysisBuilder TuitionPaymentFragmentspecialinlinedviewModeldefault3(Object obj, setDefaultResolution<TranscodeType> setdefaultresolution, getTargetCoordinateSystem<TranscodeType> gettargetcoordinatesystem, RequestCoordinator requestCoordinator, AutoValue_SurfaceOutput_Event<?, ? super TranscodeType> autoValue_SurfaceOutput_Event, Priority priority, int i, int i2, BaseRequestOptions<?> baseRequestOptions, Executor executor) throws Throwable {
        RequestCoordinator getdefaulttargetresolution;
        RequestCoordinator requestCoordinator2;
        ImageAnalysisBuilder imageAnalysisBuilderB;
        Priority priorityINotificationSideChannelStub;
        int i3 = 2 % 2;
        int i4 = setCallbacksMessenger + 83;
        subscribe = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 18 / 0;
            if (this.write != null) {
                getdefaulttargetresolution = new getDefaultTargetResolution(obj, requestCoordinator);
                requestCoordinator2 = getdefaulttargetresolution;
            } else {
                getdefaulttargetresolution = requestCoordinator;
                requestCoordinator2 = null;
            }
        } else if (this.write != null) {
            getdefaulttargetresolution = new getDefaultTargetResolution(obj, requestCoordinator);
            requestCoordinator2 = getdefaulttargetresolution;
        } else {
            getdefaulttargetresolution = requestCoordinator;
            requestCoordinator2 = null;
        }
        RequestBuilder<TranscodeType> requestBuilder = this.search;
        if (requestBuilder != null) {
            int i6 = setCallbacksMessenger + 125;
            subscribe = i6 % 128;
            int i7 = i6 % 2;
            if (this.getRoot) {
                throw new IllegalStateException("You cannot use a request as both the main request and a thumbnail, consider using clone() on the request(s) passed to thumbnail()");
            }
            AutoValue_SurfaceOutput_Event<?, ? super TranscodeType> autoValue_SurfaceOutput_Event2 = requestBuilder.IconCompatParcelizer ? autoValue_SurfaceOutput_Event : requestBuilder.getServiceComponent;
            if (requestBuilder.INotificationSideChannelStubProxy()) {
                priorityINotificationSideChannelStub = this.search.INotificationSideChannelStub();
            } else {
                int i8 = AnonymousClass1.TuitionPaymentFragmentbindingInflater1[priority.ordinal()];
                if (i8 != 1) {
                    int i9 = setCallbacksMessenger + 83;
                    subscribe = i9 % 128;
                    int i10 = i9 % 2;
                    if (i8 == 2) {
                        priorityINotificationSideChannelStub = Priority.HIGH;
                    } else {
                        if (i8 != 3 && i8 != 4) {
                            StringBuilder sb = new StringBuilder("unknown priority: ");
                            sb.append(INotificationSideChannelStub());
                            throw new IllegalArgumentException(sb.toString());
                        }
                        priorityINotificationSideChannelStub = Priority.IMMEDIATE;
                    }
                } else {
                    priorityINotificationSideChannelStub = Priority.NORMAL;
                }
            }
            Priority priority2 = priorityINotificationSideChannelStub;
            int iCancelAll = this.search.cancelAll();
            int iOnTransact = this.search.onTransact();
            if (getUpdatedCropRect.TuitionPaymentFragmentspecialinlinedviewModeldefault2(i, i2)) {
                int i11 = subscribe + 115;
                setCallbacksMessenger = i11 % 128;
                if (i11 % 2 != 0) {
                    this.search.connect();
                    throw null;
                }
                if (!this.search.connect()) {
                    iCancelAll = baseRequestOptions.cancelAll();
                    iOnTransact = baseRequestOptions.onTransact();
                    int i12 = subscribe + 33;
                    setCallbacksMessenger = i12 % 128;
                    int i13 = i12 % 2;
                }
            }
            setCustomOrderedResolutions setcustomorderedresolutions = new setCustomOrderedResolutions(obj, getdefaulttargetresolution);
            ImageAnalysisBuilder imageAnalysisBuilderB2 = b(obj, setdefaultresolution, gettargetcoordinatesystem, baseRequestOptions, setcustomorderedresolutions, autoValue_SurfaceOutput_Event, priority, i, i2, executor);
            this.getRoot = true;
            RequestBuilder<TranscodeType> requestBuilder2 = this.search;
            ImageAnalysisBuilder imageAnalysisBuilderTuitionPaymentFragmentspecialinlinedviewModeldefault3 = requestBuilder2.TuitionPaymentFragmentspecialinlinedviewModeldefault3(obj, setdefaultresolution, gettargetcoordinatesystem, setcustomorderedresolutions, autoValue_SurfaceOutput_Event2, priority2, iCancelAll, iOnTransact, requestBuilder2, executor);
            this.getRoot = false;
            setcustomorderedresolutions.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = imageAnalysisBuilderB2;
            setcustomorderedresolutions.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = imageAnalysisBuilderTuitionPaymentFragmentspecialinlinedviewModeldefault3;
            imageAnalysisBuilderB = setcustomorderedresolutions;
        } else {
            imageAnalysisBuilderB = b(obj, setdefaultresolution, gettargetcoordinatesystem, baseRequestOptions, getdefaulttargetresolution, autoValue_SurfaceOutput_Event, priority, i, i2, executor);
        }
        if (requestCoordinator2 == 0) {
            return imageAnalysisBuilderB;
        }
        int iCancelAll2 = this.write.cancelAll();
        int iOnTransact2 = this.write.onTransact();
        if (getUpdatedCropRect.TuitionPaymentFragmentspecialinlinedviewModeldefault2(i, i2)) {
            int i14 = setCallbacksMessenger + 43;
            subscribe = i14 % 128;
            if (i14 % 2 == 0) {
                this.write.connect();
                throw null;
            }
            if (!this.write.connect()) {
                int i15 = subscribe + 35;
                setCallbacksMessenger = i15 % 128;
                int i16 = i15 % 2;
                iCancelAll2 = baseRequestOptions.cancelAll();
                iOnTransact2 = baseRequestOptions.onTransact();
            }
        }
        RequestBuilder<TranscodeType> requestBuilder3 = this.write;
        ImageAnalysisBuilder imageAnalysisBuilderTuitionPaymentFragmentspecialinlinedviewModeldefault4 = requestBuilder3.TuitionPaymentFragmentspecialinlinedviewModeldefault3(obj, setdefaultresolution, gettargetcoordinatesystem, requestCoordinator2, requestBuilder3.getServiceComponent, requestBuilder3.INotificationSideChannelStub(), iCancelAll2, iOnTransact2, this.write, executor);
        requestCoordinator2.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = imageAnalysisBuilderB;
        requestCoordinator2.b = imageAnalysisBuilderTuitionPaymentFragmentspecialinlinedviewModeldefault4;
        return requestCoordinator2;
    }

    private ImageAnalysisBuilder b(Object obj, setDefaultResolution<TranscodeType> setdefaultresolution, getTargetCoordinateSystem<TranscodeType> gettargetcoordinatesystem, BaseRequestOptions<?> baseRequestOptions, RequestCoordinator requestCoordinator, AutoValue_SurfaceOutput_Event<?, ? super TranscodeType> autoValue_SurfaceOutput_Event, Priority priority, int i, int i2, Executor executor) throws Throwable {
        Object[] objArr;
        int i3 = 2 % 2;
        Context context = this.RemoteActionCompatParcelizer;
        setRotationDegrees setrotationdegrees = this.MediaBrowserCompat;
        Object obj2 = this.getNotifyChildrenChangedOptions;
        Class<TranscodeType> cls = this.sendCustomAction;
        List<getTargetCoordinateSystem<TranscodeType>> list = this.getItem;
        getAvailableCameraInfos getavailablecamerainfos = setrotationdegrees.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        setMaxResolution<? super Object> setmaxresolution = autoValue_SurfaceOutput_Event.TuitionPaymentFragmentbindingInflater1;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-342512172);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char cLastIndexOf = (char) ((-1) - TextUtils.lastIndexOf("", '0', 0));
            int i4 = (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 875;
            int gidForName = 9 - Process.getGidForName("");
            short s = $$g[184];
            Object[] objArr2 = new Object[1];
            h(s, (byte) (s & 5), (byte) ($$h - 2), objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cLastIndexOf, i4, gidForName, 252381699, false, (String) objArr2[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr3 = new Object[1];
        i(22 - TextUtils.indexOf("", ""), new char[]{'\t', 30, 18, '#', 30, ' ', 20, 17, 31, 29, 15, 14, 27, 26, 11, 2, 28, 16, 17, 30, 3, 18}, (byte) (TextUtils.lastIndexOf("", '0') + 13), objArr3);
        Class<?> cls2 = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        i((Process.myPid() >> 22) + 15, new char[]{0, 17, 7, 0, 29, 1, 29, '#', 0, 11, 14, 6, Typography.quote, 19, 13904}, (byte) (Color.green(0) + 81), objArr4);
        long jLongValue = ((Long) cls2.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1823069286);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char cIndexOf = (char) TextUtils.indexOf("", "");
            int maximumFlingVelocity = (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 876;
            int iBlue = Color.blue(0) + 10;
            byte[] bArr = $$g;
            Object[] objArr5 = new Object[1];
            h(bArr[184], bArr[10], bArr[7], objArr5);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cIndexOf, maximumFlingVelocity, iBlue, 2009631821, false, (String) objArr5[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            int i5 = subscribe + 109;
            setCallbacksMessenger = i5 % 128;
            int i6 = i5 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-337894567);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char c = (char) (1 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)));
                int minimumFlingVelocity = 876 - (ViewConfiguration.getMinimumFlingVelocity() >> 16);
                int iGreen = 10 - Color.green(0);
                short s2 = (short) ($$h - 3);
                byte b = $$g[7];
                Object[] objArr6 = new Object[1];
                h(s2, b, (byte) (b | 52), objArr6);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(c, minimumFlingVelocity, iGreen, 256017550, false, (String) objArr6[0], null);
            }
            Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            objArr = new Object[]{new int[]{((int[]) objArr7[0])[0]}, new int[]{i ^ (i << 5)}, new int[]{((int[]) objArr7[2])[0]}, (String[]) objArr7[3]};
            int i7 = (-937011096) + ((~((~i) | (-16786561))) * 433) + (((~(50407083 | i)) | (-90717313)) * (-433)) + (((~((-90717313) | i)) | 33620523) * 433) + 2014497761;
            int i8 = (i7 << 13) ^ i7;
            int i9 = i8 ^ (i8 >>> 17);
        } else {
            Object[] objArr8 = new Object[1];
            i(26 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), new char[]{'\t', 30, 18, '#', 30, ' ', 20, 17, 7, 0, 2, '\r', 6, 3, 7, ' ', 19, 30, 14, ' ', 21, 14, '#', 0, 11, 18}, (byte) (View.resolveSizeAndState(0, 0, 0) + 121), objArr8);
            Class<?> cls3 = Class.forName((String) objArr8[0]);
            Object[] objArr9 = new Object[1];
            i(18 - Color.green(0), new char[]{2, 30, 13825, 13825, 3, '#', '\t', '\n', 13827, 13827, '\r', 30, 6, '\f', 7, ' ', 30, Typography.quote}, (byte) (TextUtils.getOffsetBefore("", 0) + 25), objArr9);
            Context applicationContext = (Context) cls3.getMethod((String) objArr9[0], new Class[0]).invoke(null, null);
            if (applicationContext != null) {
                applicationContext = ((applicationContext instanceof ContextWrapper) && ((ContextWrapper) applicationContext).getBaseContext() == null) ? null : applicationContext.getApplicationContext();
            }
            int i10 = setCallbacksMessenger + 15;
            subscribe = i10 % 128;
            int i11 = i10 % 2;
            try {
                Object[] objArr10 = {applicationContext, Integer.valueOf(i), 2014497761};
                byte[] bArr2 = $$p;
                byte b2 = bArr2[45];
                byte b3 = (byte) (b2 - 1);
                Object[] objArr11 = new Object[1];
                j(b2, b3, b3, objArr11);
                Class<?> cls4 = Class.forName((String) objArr11[0]);
                Object[] objArr12 = new Object[1];
                j((byte) (bArr2[45] - 1), bArr2[85], bArr2[53], objArr12);
                objArr = (Object[]) cls4.getMethod((String) objArr12[0], Context.class, Integer.TYPE, Integer.TYPE).invoke(null, objArr10);
                if (applicationContext != null) {
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-337894567);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        char jumpTapTimeout = (char) (ViewConfiguration.getJumpTapTimeout() >> 16);
                        int iAlpha = Color.alpha(0) + 876;
                        int iLastIndexOf = TextUtils.lastIndexOf("", '0', 0, 0) + 11;
                        short s3 = (short) ($$h - 3);
                        byte b4 = $$g[7];
                        Object[] objArr13 = new Object[1];
                        h(s3, b4, (byte) (b4 | 52), objArr13);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(jumpTapTimeout, iAlpha, iLastIndexOf, 256017550, false, (String) objArr13[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr);
                    try {
                        Object[] objArr14 = new Object[1];
                        i((ViewConfiguration.getScrollBarSize() >> 8) + 22, new char[]{'\t', 30, 18, '#', 30, ' ', 20, 17, 31, 29, 15, 14, 27, 26, 11, 2, 28, 16, 17, 30, 3, 18}, (byte) (12 - Color.red(0)), objArr14);
                        Class<?> cls5 = Class.forName((String) objArr14[0]);
                        Object[] objArr15 = new Object[1];
                        i(15 - (ViewConfiguration.getKeyRepeatDelay() >> 16), new char[]{0, 17, 7, 0, 29, 1, 29, '#', 0, 11, 14, 6, Typography.quote, 19, 13904}, (byte) (81 - Color.alpha(0)), objArr15);
                        long jLongValue2 = ((Long) cls5.getDeclaredMethod((String) objArr15[0], new Class[0]).invoke(null, new Object[0])).longValue();
                        Long lValueOf = Long.valueOf(jLongValue2);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1823069286);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                            char minimumFlingVelocity2 = (char) (ViewConfiguration.getMinimumFlingVelocity() >> 16);
                            int offsetBefore = TextUtils.getOffsetBefore("", 0) + 876;
                            int absoluteGravity = Gravity.getAbsoluteGravity(0, 0) + 10;
                            byte[] bArr3 = $$g;
                            Object[] objArr16 = new Object[1];
                            h(bArr3[184], bArr3[10], bArr3[7], objArr16);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(minimumFlingVelocity2, offsetBefore, absoluteGravity, 2009631821, false, (String) objArr16[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                        Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-342512172);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                            char cResolveSizeAndState = (char) View.resolveSizeAndState(0, 0, 0);
                            int i12 = (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 876;
                            int i13 = (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 10;
                            short s4 = $$g[184];
                            Object[] objArr17 = new Object[1];
                            h(s4, (byte) (s4 & 5), (byte) ($$h - 2), objArr17);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(cResolveSizeAndState, i12, i13, 252381699, false, (String) objArr17[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf2);
                    } catch (Exception unused) {
                        throw new RuntimeException();
                    }
                }
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            }
        }
        int i14 = ((int[]) objArr[2])[0];
        int i15 = ((int[]) objArr[0])[0];
        if (i15 == i14) {
            int i16 = ((int[]) objArr[1])[0];
            Object[] objArr18 = {new int[]{((int[]) objArr[0])[0]}, new int[1], new int[]{((int[]) objArr[2])[0]}, (String[]) objArr[3]};
            int startUptimeMillis = (int) Process.getStartUptimeMillis();
            int i17 = i16 + (-1131231856) + (((~(822515621 | startUptimeMillis)) | (-862825851)) * (-964)) + (((~((~startUptimeMillis) | 822515621)) | (-862961664)) * (-964));
            int i18 = (i17 << 13) ^ i17;
            int i19 = i18 ^ (i18 >>> 17);
            ((int[]) objArr18[1])[0] = i19 ^ (i19 << 5);
        } else {
            int[] iArr = new int[i15];
            int i20 = i15 - 1;
            iArr[i20] = 1;
            Toast.makeText((Context) null, iArr[((i15 * i20) % 2) - 1], 1).show();
            int i21 = ((int[]) objArr[1])[0];
            Object[] objArr19 = {new int[]{((int[]) objArr[0])[0]}, new int[1], new int[]{((int[]) objArr[2])[0]}, (String[]) objArr[3]};
            int iIdentityHashCode = System.identityHashCode(this);
            int i22 = i21 + 1491957688 + (((~((-73933314) | iIdentityHashCode)) | (~((~iIdentityHashCode) | (-33623085)))) * (-318)) + (((~(92156675 | iIdentityHashCode)) | (-125779760)) * (-318)) + (((~(iIdentityHashCode | (-92156676))) | 51846446) * TypedValues.AttributesType.TYPE_PIVOT_TARGET);
            int i23 = (i22 << 13) ^ i22;
            int i24 = i23 ^ (i23 >>> 17);
            ((int[]) objArr19[1])[0] = i24 ^ (i24 << 5);
        }
        return SingleRequest.TuitionPaymentFragmentspecialinlinedviewModeldefault2(context, setrotationdegrees, obj, obj2, cls, baseRequestOptions, i, i2, priority, setdefaultresolution, gettargetcoordinatesystem, list, requestCoordinator, getavailablecamerainfos, setmaxresolution, executor);
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0052  */
    /* JADX WARN: Code duplicated, block: B:27:0x0081  */
    /* JADX WARN: Code duplicated, block: B:30:0x0089  */
    /* JADX WARN: Code duplicated, block: B:32:0x008d  */
    /* JADX WARN: Code duplicated, block: B:34:0x0093 A[RETURN] */
    @Override // com.bumptech.glide.request.BaseRequestOptions
    public boolean equals(Object obj) {
        int i;
        boolean z;
        int i2 = 2 % 2;
        if (obj instanceof RequestBuilder) {
            RequestBuilder requestBuilder = (RequestBuilder) obj;
            if (super.equals(requestBuilder) && Objects.equals(this.sendCustomAction, requestBuilder.sendCustomAction)) {
                int i3 = setCallbacksMessenger + 31;
                subscribe = i3 % 128;
                if (i3 % 2 == 0) {
                    this.getServiceComponent.equals(requestBuilder.getServiceComponent);
                    Object obj2 = null;
                    obj2.hashCode();
                    throw null;
                }
                if (this.getServiceComponent.equals(requestBuilder.getServiceComponent)) {
                    int i4 = subscribe + 121;
                    setCallbacksMessenger = i4 % 128;
                    if (i4 % 2 != 0) {
                        int i5 = 14 / 0;
                        if (Objects.equals(this.getNotifyChildrenChangedOptions, requestBuilder.getNotifyChildrenChangedOptions)) {
                            if (Objects.equals(this.getItem, requestBuilder.getItem) && !(!Objects.equals(this.search, requestBuilder.search)) && Objects.equals(this.write, requestBuilder.write)) {
                                Float f = requestBuilder.disconnect;
                                int i6 = subscribe + 45;
                                setCallbacksMessenger = i6 % 128;
                                i = i6 % 2;
                                z = this.IconCompatParcelizer;
                                if (i != 0) {
                                    int i7 = 9 / 0;
                                    if (z == requestBuilder.IconCompatParcelizer) {
                                        if (this.read == requestBuilder.read) {
                                            return true;
                                        }
                                    }
                                } else if (z == requestBuilder.IconCompatParcelizer) {
                                    if (this.read == requestBuilder.read) {
                                        return true;
                                    }
                                }
                            }
                        }
                    } else if (Objects.equals(this.getNotifyChildrenChangedOptions, requestBuilder.getNotifyChildrenChangedOptions)) {
                        if (Objects.equals(this.getItem, requestBuilder.getItem)) {
                            Float f2 = requestBuilder.disconnect;
                            int i8 = subscribe + 45;
                            setCallbacksMessenger = i8 % 128;
                            i = i8 % 2;
                            z = this.IconCompatParcelizer;
                            if (i != 0) {
                                int i9 = 9 / 0;
                                if (z == requestBuilder.IconCompatParcelizer) {
                                    if (this.read == requestBuilder.read) {
                                        return true;
                                    }
                                }
                            } else if (z == requestBuilder.IconCompatParcelizer) {
                                if (this.read == requestBuilder.read) {
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

    @Override // com.bumptech.glide.request.BaseRequestOptions
    public int hashCode() {
        int i = 2 % 2;
        int i2 = setCallbacksMessenger + 95;
        subscribe = i2 % 128;
        int i3 = i2 % 2;
        int iTuitionPaymentFragmentbindingInflater1 = getUpdatedCropRect.TuitionPaymentFragmentbindingInflater1(this.read, getUpdatedCropRect.TuitionPaymentFragmentbindingInflater1(this.IconCompatParcelizer, getUpdatedCropRect.TuitionPaymentFragmentspecialinlinedviewModeldefault1(this.disconnect, getUpdatedCropRect.TuitionPaymentFragmentspecialinlinedviewModeldefault1(this.write, getUpdatedCropRect.TuitionPaymentFragmentspecialinlinedviewModeldefault1(this.search, getUpdatedCropRect.TuitionPaymentFragmentspecialinlinedviewModeldefault1(this.getItem, getUpdatedCropRect.TuitionPaymentFragmentspecialinlinedviewModeldefault1(this.getNotifyChildrenChangedOptions, getUpdatedCropRect.TuitionPaymentFragmentspecialinlinedviewModeldefault1(this.getServiceComponent, getUpdatedCropRect.TuitionPaymentFragmentspecialinlinedviewModeldefault1(this.sendCustomAction, super.hashCode())))))))));
        int i4 = setCallbacksMessenger + 35;
        subscribe = i4 % 128;
        int i5 = i4 % 2;
        return iTuitionPaymentFragmentbindingInflater1;
    }

    public final <Y extends setDefaultResolution<TranscodeType>> Y TuitionPaymentFragmentspecialinlinedviewModeldefault2(Y y, getTargetCoordinateSystem<TranscodeType> gettargetcoordinatesystem, BaseRequestOptions<?> baseRequestOptions, Executor executor) {
        if (y != null) {
            if (!this.read) {
                throw new IllegalArgumentException("You must call #load() before calling #into()");
            }
            ImageAnalysisBuilder imageAnalysisBuilderTuitionPaymentFragmentspecialinlinedviewModeldefault3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3(new Object(), y, null, null, this.getServiceComponent, baseRequestOptions.INotificationSideChannelStub(), baseRequestOptions.cancelAll(), baseRequestOptions.onTransact(), baseRequestOptions, executor);
            ImageAnalysisBuilder request = y.getRequest();
            if (imageAnalysisBuilderTuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentbindingInflater1(request) && (baseRequestOptions.asBinder || !request.a())) {
                if (request == null) {
                    throw new NullPointerException("Argument must not be null");
                }
                if (!request.asBinder()) {
                    request.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                }
                return y;
            }
            this.getExtras.b((setDefaultResolution<?>) y);
            y.setRequest(imageAnalysisBuilderTuitionPaymentFragmentspecialinlinedviewModeldefault3);
            RequestManager requestManager = this.getExtras;
            synchronized (requestManager) {
                requestManager.f674a.b.add(y);
                isOutputImageRotationEnabled isoutputimagerotationenabled = requestManager.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                isoutputimagerotationenabled.TuitionPaymentFragmentbindingInflater1.add(imageAnalysisBuilderTuitionPaymentFragmentspecialinlinedviewModeldefault3);
                if (!isoutputimagerotationenabled.b) {
                    imageAnalysisBuilderTuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                } else {
                    imageAnalysisBuilderTuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
                    isoutputimagerotationenabled.TuitionPaymentFragmentspecialinlinedviewModeldefault3.add(imageAnalysisBuilderTuitionPaymentFragmentspecialinlinedviewModeldefault3);
                }
            }
            return y;
        }
        throw new NullPointerException("Argument must not be null");
    }

    static void cancel() {
        getSessionToken = new char[]{60056, 60043, 60083, 59749, 59745, 60062, 60058, 59746, 60047, 60090, 60088, 60049, 60055, 60072, 60117, 60051, 59747, 59744, 60045, 59748, 60079, 60048, 60054, 60063, 59751, 60040, 60034, 60060, 60059, 60073, 60041, 60050, 60046, 60053, 60061, 60052};
        isConnected = (char) 57191;
    }

    private static String $$r(short s, int i, short s2) {
        int i2 = s2 + 4;
        byte[] bArr = $$l;
        int i3 = s * 4;
        int i4 = 116 - i;
        byte[] bArr2 = new byte[1 - i3];
        int i5 = 0 - i3;
        int i6 = -1;
        if (bArr == null) {
            int i7 = i2 + i5;
            i2 = i2;
            i4 = i7;
        }
        while (true) {
            int i8 = i2 + 1;
            i6++;
            bArr2[i6] = (byte) i4;
            if (i6 == i5) {
                return new String(bArr2, 0);
            }
            i2 = i8;
            i4 += bArr[i8];
        }
    }
}
