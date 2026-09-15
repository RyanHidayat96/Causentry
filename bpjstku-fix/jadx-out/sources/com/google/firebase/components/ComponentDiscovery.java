package com.google.firebase.components;

import android.app.Service;
import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.Toast;
import com.google.firebase.inject.Provider;
import defpackage.SessionConfigValidatingBuilderExternalSyntheticLambda0;
import defpackage.initSession;
import defpackage.setOrVerifyExpectFrameRateRange;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

/* JADX INFO: loaded from: classes4.dex */
public final class ComponentDiscovery<T> {
    private static final String COMPONENT_KEY_PREFIX = "com.google.firebase.components:";
    private static final String COMPONENT_SENTINEL_VALUE = "com.google.firebase.components.ComponentRegistrar";
    static final String TAG = "ComponentDiscovery";
    private final T context;
    private final RegistrarNameRetriever<T> retriever;
    private static final byte[] $$c = {42, -104, -68, 105};
    private static final int $$d = 90;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$a = {55, -47, -47, 67, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -56, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, -7, 18, 16, 1, 16, 16, 4, -19, 48, 3, 17, 0, 30, -4, 24, -54};
    private static final int $$b = 219;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 1;
    private static int TuitionPaymentFragmentbindingInflater1 = -83722263;

    /* JADX INFO: loaded from: classes6.dex */
    interface RegistrarNameRetriever<T> {
        List<String> retrieve(T t);
    }

    private static void a(int i, int i2, int i3, Object[] objArr) {
        int i4 = (i2 * 14) + 84;
        int i5 = (i3 * 52) + 4;
        byte[] bArr = $$a;
        byte[] bArr2 = new byte[i + 1];
        int i6 = -1;
        if (bArr == null) {
            i4 = (i + i5) - 11;
            i5++;
            i6 = -1;
        }
        while (true) {
            int i7 = i6 + 1;
            bArr2[i7] = (byte) i4;
            if (i7 == i) {
                objArr[0] = new String(bArr2, 0);
                return;
            }
            int i8 = i5;
            i4 = (i4 + bArr[i5]) - 11;
            i5 = i8 + 1;
            i6 = i7;
        }
    }

    public static ComponentDiscovery<Context> forContext(Context context, Class<? extends Service> cls) {
        int i = 2 % 2;
        ComponentDiscovery<Context> componentDiscovery = new ComponentDiscovery<>(context, new MetadataRegistrarNameRetriever(cls));
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 5;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 84 / 0;
        }
        return componentDiscovery;
    }

    ComponentDiscovery(T t, RegistrarNameRetriever<T> registrarNameRetriever) {
        this.context = t;
        this.retriever = registrarNameRetriever;
    }

    @Deprecated
    public final List<ComponentRegistrar> discover() {
        int i = 2 % 2;
        ArrayList arrayList = new ArrayList();
        Iterator<String> it = this.retriever.retrieve(this.context).iterator();
        while (it.hasNext()) {
            try {
                ComponentRegistrar componentRegistrarInstantiate = instantiate(it.next());
                if (componentRegistrarInstantiate != null) {
                    int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 27;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
                    int i3 = i2 % 2;
                    arrayList.add(componentRegistrarInstantiate);
                    int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 27;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
                    int i5 = i4 % 2;
                }
            } catch (InvalidRegistrarException unused) {
            }
        }
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0179  */
    /* JADX WARN: Code duplicated, block: B:35:0x017a  */
    private static void b(boolean z, int i, int i2, int i3, char[] cArr, Object[] objArr) throws Throwable {
        int i4;
        char c;
        Throwable cause;
        int i5 = 2 % 2;
        setOrVerifyExpectFrameRateRange setorverifyexpectframeraterange = new setOrVerifyExpectFrameRateRange();
        char[] cArr2 = new char[i2];
        setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
        while (true) {
            i4 = 29209604;
            c = '0';
            if (setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3 >= i2) {
                break;
            }
            int i6 = $10 + 33;
            $11 = i6 % 128;
            int i7 = i6 % 2;
            setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = cArr[setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3];
            cArr2[setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = (char) (i + setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
            int i8 = setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr2[i8]), Integer.valueOf(TuitionPaymentFragmentbindingInflater1)};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1545221423);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    byte b = (byte) 0;
                    byte b2 = (byte) (b - 1);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (Process.myTid() >> 22), 3290 - TextUtils.lastIndexOf("", '0', 0, 0), (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 32, 1199271174, false, $$e(b, b2, (byte) (b2 + 1)), new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr2[i8] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {setorverifyexpectframeraterange, setorverifyexpectframeraterange};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(29209604);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                    byte b3 = (byte) 1;
                    byte b4 = (byte) (-b3);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (ViewConfiguration.getKeyRepeatTimeout() >> 16), 651 - View.getDefaultSize(0, 0), (ViewConfiguration.getDoubleTapTimeout() >> 16) + 44, -450685997, false, $$e(b3, b4, (byte) (b4 + 1)), new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3);
            } catch (Throwable th) {
                cause = th.getCause();
                if (cause != null) {
                    throw th;
                }
                throw cause;
            }
            cause = th.getCause();
            if (cause != null) {
                throw th;
            }
            throw cause;
        }
        if (i3 > 0) {
            int i9 = $10 + 95;
            $11 = i9 % 128;
            int i10 = i9 % 2;
            setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1 = i3;
            char[] cArr3 = new char[i2];
            System.arraycopy(cArr2, 0, cArr3, 0, i2);
            System.arraycopy(cArr3, 0, cArr2, i2 - setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1, setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1);
            System.arraycopy(cArr3, setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1, cArr2, 0, i2 - setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1);
        }
        if (z) {
            int i11 = $11 + 73;
            $10 = i11 % 128;
            int i12 = i11 % 2;
            char[] cArr4 = new char[i2];
            setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
            while (setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3 < i2) {
                cArr4[setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr2[(i2 - setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3) - 1];
                Object[] objArr4 = {setorverifyexpectframeraterange, setorverifyexpectframeraterange};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(i4);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    byte b5 = (byte) 1;
                    byte b6 = (byte) (-b5);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (TextUtils.indexOf("", c, 0) + 1), ((Process.getThreadPriority(0) + 20) >> 6) + 651, (ViewConfiguration.getWindowTouchSlop() >> 8) + 44, -450685997, false, $$e(b5, b6, (byte) (b6 + 1)), new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
                i4 = 29209604;
                c = '0';
            }
            cArr2 = cArr4;
        }
        objArr[0] = new String(cArr2);
    }

    /* JADX INFO: loaded from: classes6.dex */
    static class MetadataRegistrarNameRetriever implements RegistrarNameRetriever<Context> {
        private static short[] TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        private final Class<? extends Service> discoveryService;
        private static final byte[] $$c = {38, 31, -70, -1};
        private static final int $$f = 62;
        private static int $10 = 0;
        private static int $11 = 1;
        private static final byte[] $$d = {55, -64, 35, -71, -20, -6, 55, -69, -12, -14, -6, 3, -9, -10, -1, -25, -7, -8, 11, 43, -59, -26, -14, 3, 3, 45, -27, -58, -14, 3, 3, 8, -26, -21, -12, 9, -21, 70, -25, 9, -25, -41, 4, -19, 3, -14, -7, 22, -25, -32, 4, 0, -17, -14, 38, -52, 9, -14, -14, 0, -17, -14, -7, -5, 3, -6, -14, 0, -19, -5, -13, -6, -5, -13, 1, -7, -26, 5, -4, -26, 34, -42, 3, -9, -15, 0, -9, -9, -3, -28, 1, -16, 58};
        private static final int $$e = 210;
        private static final byte[] $$a = {83, -4, -55, -17, -43, 2, -21, 1, -16, -9, 20, -27, -34, 2, -2, -19, -16, 36, -54, 7, -16, -16, -2, -19, -16, -9, -7, 1, -8, -16, -2, -21, -7, -15, -8, -7, -15, -1, -9, -28, 3, -6, -28, 32, -44, 1, -11, -17, -2, -11, -11, -5, -30, -1, -18, 55, -43, 2, -21, 1, -16, -9, 20, -27, -34, 2, -2, -19, -16, 36, -54, 7, -16, -16, -2, -19, -16, 8, -17, -15, 0, -15, -15, -3, 20, -47, -2, -16, 1, -29, 5, -23, 55};
        private static final int $$b = 193;
        private static int asBinder = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static int f817a = 1;
        private static int TuitionPaymentFragmentbindingInflater1 = 1717440221;
        private static int TuitionPaymentFragmentspecialinlinedviewModeldefault2 = -1934795561;
        private static int TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 2133369690;
        private static byte[] b = {3, 67, 119, 70, 32, -107, 67, 104, 120, 113, 37, 36, -66, 71, 56, -127, 126, 113, 124, 77, 117, 76, 56, 8, 28, 13, 24, -25, 20, -17, 2, 19, 14, 31, -29, 13, 27, 57, -74, -33, -81, -92, -120, -117, -23, -89, -77, -37, 96, -13, -43, -69, -39, 57, 0, 60, -9, 38, 60, 17, 24, 82, 12, 22, 60, 13, 8, 0, 6};

        /* JADX WARN: Code duplicated, block: B:10:0x0027  */
        /* JADX WARN: Code duplicated, block: B:8:0x001f  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x002c). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0027
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        private static void c(short r6, short r7, short r8, java.lang.Object[] r9) {
            /*
                int r8 = r8 * 14
                int r8 = r8 + 84
                int r0 = r7 + 1
                int r6 = r6 * 52
                int r6 = 55 - r6
                byte[] r1 = com.google.firebase.components.ComponentDiscovery.MetadataRegistrarNameRetriever.$$a
                byte[] r0 = new byte[r0]
                r2 = 0
                if (r1 != 0) goto L15
                r3 = r8
                r4 = r2
                r8 = r6
                goto L2c
            L15:
                r3 = r2
            L16:
                byte r4 = (byte) r8
                r0[r3] = r4
                int r4 = r3 + 1
                int r6 = r6 + 1
                if (r3 != r7) goto L27
                java.lang.String r6 = new java.lang.String
                r6.<init>(r0, r2)
                r9[r2] = r6
                return
            L27:
                r3 = r1[r6]
                r5 = r8
                r8 = r6
                r6 = r5
            L2c:
                int r3 = -r3
                int r6 = r6 + r3
                int r6 = r6 + (-10)
                r3 = r4
                r5 = r8
                r8 = r6
                r6 = r5
                goto L16
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.components.ComponentDiscovery.MetadataRegistrarNameRetriever.c(short, short, short, java.lang.Object[]):void");
        }

        /* JADX WARN: Code duplicated, block: B:10:0x0027  */
        /* JADX WARN: Code duplicated, block: B:8:0x001f  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x002d). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0027
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        private static void e(short r7, short r8, int r9, java.lang.Object[] r10) {
            /*
                byte[] r0 = com.google.firebase.components.ComponentDiscovery.MetadataRegistrarNameRetriever.$$d
                int r9 = r9 * 15
                int r9 = 99 - r9
                int r8 = r8 * 15
                int r8 = r8 + 38
                int r7 = r7 * 37
                int r7 = r7 + 4
                byte[] r1 = new byte[r8]
                r2 = 0
                if (r0 != 0) goto L17
                r3 = r9
                r4 = r2
                r9 = r7
                goto L2d
            L17:
                r3 = r2
            L18:
                int r4 = r3 + 1
                byte r5 = (byte) r9
                r1[r3] = r5
                if (r4 != r8) goto L27
                java.lang.String r7 = new java.lang.String
                r7.<init>(r1, r2)
                r10[r2] = r7
                return
            L27:
                r3 = r0[r7]
                r6 = r9
                r9 = r7
                r7 = r3
                r3 = r6
            L2d:
                int r7 = -r7
                int r9 = r9 + 1
                int r3 = r3 + r7
                int r7 = r3 + (-8)
                r3 = r4
                r6 = r9
                r9 = r7
                r7 = r6
                goto L18
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.components.ComponentDiscovery.MetadataRegistrarNameRetriever.e(short, short, int, java.lang.Object[]):void");
        }

        @Override // com.google.firebase.components.ComponentDiscovery.RegistrarNameRetriever
        public /* bridge */ /* synthetic */ List retrieve(Context context) throws Throwable {
            int i = 2 % 2;
            int i2 = f817a + 77;
            asBinder = i2 % 128;
            int i3 = i2 % 2;
            List<String> listRetrieve2 = retrieve2(context);
            int i4 = f817a + 121;
            asBinder = i4 % 128;
            int i5 = i4 % 2;
            return listRetrieve2;
        }

        private MetadataRegistrarNameRetriever(Class<? extends Service> cls) {
            this.discoveryService = cls;
        }

        private static void d(int i, int i2, short s, byte b2, int i3, Object[] objArr) throws Throwable {
            boolean z;
            int i4 = 2 % 2;
            SessionConfigValidatingBuilderExternalSyntheticLambda0 sessionConfigValidatingBuilderExternalSyntheticLambda0 = new SessionConfigValidatingBuilderExternalSyntheticLambda0();
            StringBuilder sb = new StringBuilder();
            try {
                Object[] objArr2 = {Integer.valueOf(i2), Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault2)};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1238528667);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    char c = (char) (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                    int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0) + 2267;
                    int pressedStateDuration = 33 - (ViewConfiguration.getPressedStateDuration() >> 16);
                    byte b3 = (byte) ($$c[3] + 1);
                    byte b4 = b3;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(c, iMakeMeasureSpec, pressedStateDuration, 1387473586, false, $$g(b3, b4, b4), new Class[]{Integer.TYPE, Integer.TYPE});
                }
                int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).intValue();
                if (iIntValue == -1) {
                    z = true;
                } else {
                    int i5 = $11 + 43;
                    $10 = i5 % 128;
                    if (i5 % 2 != 0) {
                        int i6 = 4 % 2;
                    }
                    z = false;
                }
                if (z) {
                    int i7 = $11 + 31;
                    $10 = i7 % 128;
                    int i8 = i7 % 2;
                    byte[] bArr = b;
                    long j = 0;
                    if (bArr != null) {
                        int length = bArr.length;
                        byte[] bArr2 = new byte[length];
                        int i9 = 0;
                        while (i9 < length) {
                            Object[] objArr3 = {Integer.valueOf(bArr[i9])};
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(632534666);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                char absoluteGravity = (char) Gravity.getAbsoluteGravity(0, 0);
                                int minimumFlingVelocity = (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 3358;
                                int packedPositionChild = 17 - ExpandableListView.getPackedPositionChild(j);
                                byte length2 = (byte) $$c.length;
                                byte b5 = (byte) (length2 - 4);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(absoluteGravity, minimumFlingVelocity, packedPositionChild, -1054011043, false, $$g(length2, b5, b5), new Class[]{Integer.TYPE});
                            }
                            bArr2[i9] = ((Byte) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).byteValue();
                            i9++;
                            j = 0;
                        }
                        bArr = bArr2;
                    }
                    if (bArr != null) {
                        byte[] bArr3 = b;
                        Object[] objArr4 = {Integer.valueOf(i3), Integer.valueOf(TuitionPaymentFragmentbindingInflater1)};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1238528667);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                            char c2 = (char) (1 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)));
                            int trimmedLength = 2267 - TextUtils.getTrimmedLength("");
                            int i10 = 34 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1));
                            byte b6 = (byte) ($$c[3] + 1);
                            byte b7 = b6;
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(c2, trimmedLength, i10, 1387473586, false, $$g(b6, b7, b7), new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        iIntValue = (byte) (((byte) (((long) bArr3[((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4)).intValue()]) ^ 3046761265686732006L)) + ((int) (((long) TuitionPaymentFragmentspecialinlinedviewModeldefault2) ^ 3046761265686732006L)));
                    } else {
                        iIntValue = (short) (((short) (((long) TuitionPaymentFragmentspecialinlinedviewModeldefault1[i3 + ((int) (((long) TuitionPaymentFragmentbindingInflater1) ^ 3046761265686732006L))]) ^ 3046761265686732006L)) + ((int) (((long) TuitionPaymentFragmentspecialinlinedviewModeldefault2) ^ 3046761265686732006L)));
                    }
                }
                if (iIntValue > 0) {
                    sessionConfigValidatingBuilderExternalSyntheticLambda0.b = ((i3 + iIntValue) - 2) + ((int) (((long) TuitionPaymentFragmentbindingInflater1) ^ 3046761265686732006L)) + (!z ? 0 : 1);
                    Object[] objArr5 = {sessionConfigValidatingBuilderExternalSyntheticLambda0, Integer.valueOf(i), Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault3), sb};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1079014435);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        char cIndexOf = (char) (55903 - TextUtils.indexOf((CharSequence) "", '0'));
                        int doubleTapTimeout = 2855 - (ViewConfiguration.getDoubleTapTimeout() >> 16);
                        int i11 = 13 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
                        byte b8 = (byte) (-$$c[3]);
                        byte b9 = (byte) (b8 - 1);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(cIndexOf, doubleTapTimeout, i11, -1529949196, false, $$g(b8, b9, b9), new Class[]{Object.class, Integer.TYPE, Integer.TYPE, Object.class});
                    }
                    ((StringBuilder) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).append(sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
                    sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                    byte[] bArr4 = b;
                    if (bArr4 != null) {
                        int length3 = bArr4.length;
                        byte[] bArr5 = new byte[length3];
                        for (int i12 = 0; i12 < length3; i12++) {
                            bArr5[i12] = (byte) (((long) bArr4[i12]) ^ 3046761265686732006L);
                        }
                        bArr4 = bArr5;
                    }
                    boolean z2 = bArr4 != null;
                    sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 1;
                    while (sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3 < iIntValue) {
                        int i13 = $11 + 107;
                        $10 = i13 % 128;
                        int i14 = i13 % 2;
                        if (z2) {
                            byte[] bArr6 = b;
                            int i15 = sessionConfigValidatingBuilderExternalSyntheticLambda0.b;
                            sessionConfigValidatingBuilderExternalSyntheticLambda0.b = i15 - 1;
                            sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = (char) (sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2 + (((byte) (((byte) (((long) bArr6[i15]) ^ 3046761265686732006L)) + s)) ^ b2));
                        } else {
                            short[] sArr = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                            int i16 = sessionConfigValidatingBuilderExternalSyntheticLambda0.b;
                            sessionConfigValidatingBuilderExternalSyntheticLambda0.b = i16 - 1;
                            sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = (char) (sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2 + (((short) (((short) (((long) sArr[i16]) ^ 3046761265686732006L)) + s)) ^ b2));
                        }
                        sb.append(sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
                        sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                        sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3++;
                    }
                }
                objArr[0] = sb.toString();
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }

        /* JADX INFO: renamed from: retrieve, reason: avoid collision after fix types in other method */
        public List<String> retrieve2(Context context) throws Throwable {
            Object[] objArr;
            Object[] objArr2;
            int i = 2 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                char cIndexOf = (char) (31532 - TextUtils.indexOf((CharSequence) "", '0'));
                int iIndexOf = 921 - TextUtils.indexOf("", "", 0, 0);
                int iArgb = Color.argb(0, 0, 0, 0) + 28;
                byte[] bArr = $$a;
                byte b2 = bArr[7];
                Object[] objArr3 = new Object[1];
                c(b2, bArr[80], b2, objArr3);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cIndexOf, iIndexOf, iArgb, -1048449946, false, (String) objArr3[0], null);
            }
            long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
            Object[] objArr4 = new Object[1];
            d(209322150 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), Drawable.resolveOpacity(0, 0) - 50, (short) (98 - ImageFormat.getBitsPerPixel(0)), (byte) View.combineMeasuredStates(0, 0), View.combineMeasuredStates(0, 0) + 353152453, objArr4);
            Class<?> cls = Class.forName((String) objArr4[0]);
            Object[] objArr5 = new Object[1];
            d(209322153 - TextUtils.getTrimmedLength(""), TextUtils.getOffsetAfter("", 0) - 50, (short) (((byte) KeyEvent.getModifierMetaStateMask()) + 11), (byte) Gravity.getAbsoluteGravity(0, 0), 353152475 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), objArr5);
            long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr5[0], new Class[0]).invoke(null, new Object[0])).longValue();
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(889369593);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                char scrollBarFadeDuration = (char) (31533 - (ViewConfiguration.getScrollBarFadeDuration() >> 16));
                int iResolveOpacity = 921 - Drawable.resolveOpacity(0, 0);
                int i2 = 29 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1));
                byte[] bArr2 = $$a;
                Object[] objArr6 = new Object[1];
                c(bArr2[7], (byte) 52, bArr2[80], objArr6);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(scrollBarFadeDuration, iResolveOpacity, i2, -778300370, false, (String) objArr6[0], null);
            }
            if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    char jumpTapTimeout = (char) ((ViewConfiguration.getJumpTapTimeout() >> 16) + 31533);
                    int keyRepeatDelay = (ViewConfiguration.getKeyRepeatDelay() >> 16) + 921;
                    int edgeSlop = 28 - (ViewConfiguration.getEdgeSlop() >> 16);
                    byte b3 = $$a[80];
                    byte b4 = b3;
                    Object[] objArr7 = new Object[1];
                    c(b4, (byte) (b4 | 37), b3, objArr7);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(jumpTapTimeout, keyRepeatDelay, edgeSlop, -1142834547, false, (String) objArr7[0], null);
                }
                Object[] objArr8 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
                objArr = new Object[]{new int[1], new int[]{((int[]) objArr8[1])[0]}, (Object[]) objArr8[2], new int[]{((int[]) objArr8[3])[0]}, (String[]) objArr8[4]};
                int iMyUid = Process.myUid();
                int i3 = (((1687304392 + ((~(1606270415 | iMyUid)) * (-301))) + (((~((-1578941903) | iMyUid)) | (~((~iMyUid) | 195137741))) * (-301))) + (((~(iMyUid | (-195137742))) | (-1578941903)) * 301)) - 1354219574;
                int i4 = (i3 << 13) ^ i3;
                int i5 = i4 ^ (i4 >>> 17);
                ((int[]) objArr[0])[0] = i5 ^ (i5 << 5);
            } else {
                Context applicationContext = context != null ? (!((context instanceof ContextWrapper) ^ true) && ((ContextWrapper) context).getBaseContext() == null) ? null : context.getApplicationContext() : context;
                Object[] objArr9 = new Object[1];
                d(209322158 - (ViewConfiguration.getPressedStateDuration() >> 16), ExpandableListView.getPackedPositionChild(0L) - 49, (short) ((-72) - (ViewConfiguration.getEdgeSlop() >> 16)), (byte) View.resolveSizeAndState(0, 0, 0), (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 353152489, objArr9);
                Class<?> cls2 = Class.forName((String) objArr9[0]);
                Object[] objArr10 = new Object[1];
                d((AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 209322157, (-49) - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), (short) (27 - Color.alpha(0)), (byte) ((-1) - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))), TextUtils.getOffsetAfter("", 0) + 353152506, objArr10);
                try {
                    Object[] objArr11 = {applicationContext, Integer.valueOf(((Integer) cls2.getMethod((String) objArr10[0], Object.class).invoke(null, this)).intValue()), 0, -1354219574};
                    byte[] bArr3 = $$d;
                    byte b5 = bArr3[51];
                    byte b6 = b5;
                    Object[] objArr12 = new Object[1];
                    e(b5, b6, b6, objArr12);
                    Class<?> cls3 = Class.forName((String) objArr12[0]);
                    byte b7 = bArr3[74];
                    byte b8 = b7;
                    Object[] objArr13 = new Object[1];
                    e(b7, b8, b8, objArr13);
                    Object[] objArr14 = (Object[]) cls3.getMethod((String) objArr13[0], Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr11);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        char c = (char) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 31532);
                        int i6 = (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 920;
                        int deadChar = KeyEvent.getDeadChar(0, 0) + 28;
                        byte b9 = $$a[80];
                        byte b10 = b9;
                        Object[] objArr15 = new Object[1];
                        c(b10, (byte) (b10 | 37), b9, objArr15);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(c, i6, deadChar, -1142834547, false, (String) objArr15[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr14);
                    try {
                        Object[] objArr16 = new Object[1];
                        d((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 209322148, (-50) - (ViewConfiguration.getPressedStateDuration() >> 16), (short) (99 - TextUtils.getOffsetBefore("", 0)), (byte) View.MeasureSpec.makeMeasureSpec(0, 0), 353152452 - TextUtils.lastIndexOf("", '0', 0), objArr16);
                        Class<?> cls4 = Class.forName((String) objArr16[0]);
                        Object[] objArr17 = new Object[1];
                        d(209322152 - TextUtils.indexOf((CharSequence) "", '0', 0), (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) - 49, (short) ((Process.myTid() >> 22) + 10), (byte) TextUtils.indexOf("", "", 0, 0), 353152475 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), objArr17);
                        long jLongValue2 = ((Long) cls4.getDeclaredMethod((String) objArr17[0], new Class[0]).invoke(null, new Object[0])).longValue();
                        Long lValueOf = Long.valueOf(jLongValue2);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(889369593);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                            char cIndexOf2 = (char) (TextUtils.indexOf("", "") + 31533);
                            int i7 = (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 921;
                            int trimmedLength = 28 - TextUtils.getTrimmedLength("");
                            byte[] bArr4 = $$a;
                            Object[] objArr18 = new Object[1];
                            c(bArr4[7], (byte) 52, bArr4[80], objArr18);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(cIndexOf2, i7, trimmedLength, -778300370, false, (String) objArr18[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                        Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                            char cIndexOf3 = (char) (31532 - TextUtils.indexOf((CharSequence) "", '0'));
                            int i8 = (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 920;
                            int i9 = (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 29;
                            byte[] bArr5 = $$a;
                            byte b11 = bArr5[7];
                            Object[] objArr19 = new Object[1];
                            c(b11, bArr5[80], b11, objArr19);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(cIndexOf3, i8, i9, -1048449946, false, (String) objArr19[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf2);
                        objArr = objArr14;
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
            int i10 = ((int[]) objArr[1])[0];
            int i11 = ((int[]) objArr[3])[0];
            if (i11 == i10) {
                int i12 = f817a + 123;
                asBinder = i12 % 128;
                int i13 = i12 % 2;
                int i14 = ((int[]) objArr[0])[0];
                objArr2 = new Object[]{new int[1], new int[]{((int[]) objArr[1])[0]}, (Object[]) objArr[2], new int[]{((int[]) objArr[3])[0]}, (String[]) objArr[4]};
                int iNextInt = new Random().nextInt(1407502845);
                int i15 = i14 + 1546792017 + (((~((~iNextInt) | (-69732449))) | (~(1476242303 | iNextInt))) * (-302)) + ((~((-69732449) | iNextInt)) * (-604)) + (((~(iNextInt | 1406509855)) | 1108672515) * 302);
                int i16 = (i15 << 13) ^ i15;
                int i17 = i16 ^ (i16 >>> 17);
                ((int[]) objArr2[0])[0] = i17 ^ (i17 << 5);
            } else {
                ArrayList arrayList = new ArrayList();
                String[] strArr = (String[]) objArr[4];
                if (strArr != null) {
                    int i18 = 0;
                    while (i18 < strArr.length) {
                        int i19 = asBinder + 63;
                        f817a = i19 % 128;
                        if (i19 % 2 == 0) {
                            arrayList.add(strArr[i18]);
                            i18 += 89;
                        } else {
                            arrayList.add(strArr[i18]);
                            i18++;
                        }
                    }
                }
                int[] iArr = new int[i11];
                int i20 = i11 - 1;
                iArr[i20] = 1;
                Toast.makeText((Context) null, iArr[((i11 * i20) % 2) - 1], 1).show();
                int i21 = ((int[]) objArr[0])[0];
                objArr2 = new Object[]{new int[1], new int[]{((int[]) objArr[1])[0]}, (Object[]) objArr[2], new int[]{((int[]) objArr[3])[0]}, (String[]) objArr[4]};
                int iIdentityHashCode = System.identityHashCode(this);
                int i22 = ~iIdentityHashCode;
                int i23 = i21 + 763445515 + ((~(780567991 | i22)) * (-560)) + ((~(iIdentityHashCode | (-288442433))) * (-560)) + (((~(993511652 | i22)) | 75498771) * 560);
                int i24 = (i23 << 13) ^ i23;
                int i25 = i24 ^ (i24 >>> 17);
                ((int[]) objArr2[0])[0] = i25 ^ (i25 << 5);
            }
            Bundle metadata = getMetadata(context);
            if (metadata != null) {
                ArrayList arrayList2 = new ArrayList();
                for (String str : metadata.keySet()) {
                    if (ComponentDiscovery.COMPONENT_SENTINEL_VALUE.equals(metadata.get(str))) {
                        int i26 = asBinder + 87;
                        f817a = i26 % 128;
                        if (i26 % 2 == 0) {
                            int i27 = 55 / 0;
                            if (str.startsWith(ComponentDiscovery.COMPONENT_KEY_PREFIX)) {
                                arrayList2.add(str.substring(31));
                            }
                        } else if (str.startsWith(ComponentDiscovery.COMPONENT_KEY_PREFIX)) {
                            arrayList2.add(str.substring(31));
                        }
                    }
                }
                return arrayList2;
            }
            int i28 = f817a + 11;
            asBinder = i28 % 128;
            int i29 = i28 % 2;
            int i30 = ((int[]) objArr2[0])[0];
            int i31 = i30 * i30;
            int i32 = -(865182682 * i30);
            int i33 = (((i31 & i32) + (i31 | i32)) - (~(-(i30 * 9873930)))) - 1;
            int i34 = (i33 & 1136442564) + (1136442564 | i33);
            int i35 = i34 >> 27;
            int i36 = ((i35 ^ (-63)) + ((i35 & (-63)) << 1)) / 32;
            int i37 = (i34 - (~((i36 ^ 1) + ((i36 & 1) << 1)))) - 1;
            int i38 = i34 >> 19;
            int i39 = ((i38 & (-16383)) + (i38 | (-16383))) / 8192;
            int i40 = -(i37 ^ ((i39 ^ 1) + ((i39 & 1) << 1)));
            int i41 = (i40 ^ 3) + ((i40 & 3) << 1);
            int i42 = i41 >> 28;
            int i43 = ((i42 ^ (-31)) + ((i42 & (-31)) << 1)) / 16;
            int i44 = ((i43 | 1) << 1) - (i43 ^ 1);
            int i45 = 65520 / (((-((i44 ^ 1) + ((i44 & 1) << 1))) & i41) * 1820);
            return Collections.emptyList();
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x0020, code lost:
        
            return null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:11:0x0021, code lost:
        
            r6 = r1.getServiceInfo(new android.content.ComponentName(r6, r5.discoveryService), 128);
         */
        /* JADX WARN: Code restructure failed: missing block: B:12:0x002e, code lost:
        
            if (r6 != null) goto L15;
         */
        /* JADX WARN: Code restructure failed: missing block: B:13:0x0030, code lost:
        
            java.util.Objects.toString(r5.discoveryService);
         */
        /* JADX WARN: Code restructure failed: missing block: B:14:0x0035, code lost:
        
            return null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:15:0x0036, code lost:
        
            r6 = ((android.content.pm.PackageItemInfo) r6).metaData;
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x0038, code lost:
        
            r1 = com.google.firebase.components.ComponentDiscovery.MetadataRegistrarNameRetriever.asBinder + 19;
            com.google.firebase.components.ComponentDiscovery.MetadataRegistrarNameRetriever.f817a = r1 % 128;
         */
        /* JADX WARN: Code restructure failed: missing block: B:17:0x0041, code lost:
        
            if ((r1 % 2) == 0) goto L19;
         */
        /* JADX WARN: Code restructure failed: missing block: B:18:0x0043, code lost:
        
            return r6;
         */
        /* JADX WARN: Code restructure failed: missing block: B:19:0x0044, code lost:
        
            throw null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:6:0x0017, code lost:
        
            if (r1 == null) goto L10;
         */
        /* JADX WARN: Code restructure failed: missing block: B:9:0x001e, code lost:
        
            if (r1 == null) goto L10;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private android.os.Bundle getMetadata(android.content.Context r6) {
            /*
                r5 = this;
                r0 = 2
                int r1 = r0 % r0
                int r1 = com.google.firebase.components.ComponentDiscovery.MetadataRegistrarNameRetriever.asBinder
                int r1 = r1 + 121
                int r2 = r1 % 128
                com.google.firebase.components.ComponentDiscovery.MetadataRegistrarNameRetriever.f817a = r2
                int r1 = r1 % r0
                r2 = 0
                if (r1 != 0) goto L1a
                android.content.pm.PackageManager r1 = r6.getPackageManager()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L45
                r3 = 12
                int r3 = r3 / 0
                if (r1 != 0) goto L21
                goto L20
            L1a:
                android.content.pm.PackageManager r1 = r6.getPackageManager()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L45
                if (r1 != 0) goto L21
            L20:
                return r2
            L21:
                android.content.ComponentName r3 = new android.content.ComponentName     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L45
                java.lang.Class<? extends android.app.Service> r4 = r5.discoveryService     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L45
                r3.<init>(r6, r4)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L45
                r6 = 128(0x80, float:1.8E-43)
                android.content.pm.ServiceInfo r6 = r1.getServiceInfo(r3, r6)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L45
                if (r6 != 0) goto L36
                java.lang.Class<? extends android.app.Service> r6 = r5.discoveryService     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L45
                java.util.Objects.toString(r6)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L45
                return r2
            L36:
                android.os.Bundle r6 = r6.metaData     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L45
                int r1 = com.google.firebase.components.ComponentDiscovery.MetadataRegistrarNameRetriever.asBinder
                int r1 = r1 + 19
                int r3 = r1 % 128
                com.google.firebase.components.ComponentDiscovery.MetadataRegistrarNameRetriever.f817a = r3
                int r1 = r1 % r0
                if (r1 == 0) goto L44
                return r6
            L44:
                throw r2
            L45:
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.components.ComponentDiscovery.MetadataRegistrarNameRetriever.getMetadata(android.content.Context):android.os.Bundle");
        }

        /* JADX WARN: Code duplicated, block: B:10:0x0026  */
        /* JADX WARN: Code duplicated, block: B:8:0x0020  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x002b). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0026
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        private static java.lang.String $$g(int r6, byte r7, int r8) {
            /*
                int r8 = r8 * 3
                int r0 = 1 - r8
                int r7 = r7 * 4
                int r7 = 3 - r7
                byte[] r1 = com.google.firebase.components.ComponentDiscovery.MetadataRegistrarNameRetriever.$$c
                int r6 = r6 + 117
                byte[] r0 = new byte[r0]
                r2 = 0
                int r8 = 0 - r8
                if (r1 != 0) goto L16
                r3 = r7
                r4 = r2
                goto L2b
            L16:
                r3 = r2
            L17:
                byte r4 = (byte) r6
                int r7 = r7 + 1
                r0[r3] = r4
                int r4 = r3 + 1
                if (r3 != r8) goto L26
                java.lang.String r6 = new java.lang.String
                r6.<init>(r0, r2)
                return r6
            L26:
                r3 = r1[r7]
                r5 = r3
                r3 = r7
                r7 = r5
            L2b:
                int r6 = r6 + r7
                r7 = r3
                r3 = r4
                goto L17
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.components.ComponentDiscovery.MetadataRegistrarNameRetriever.$$g(int, byte, int):java.lang.String");
        }
    }

    static /* synthetic */ ComponentRegistrar lambda$discoverLazy$0(String str) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 75;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        ComponentRegistrar componentRegistrarInstantiate = instantiate(str);
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 7;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
        int i5 = i4 % 2;
        return componentRegistrarInstantiate;
    }

    public final List<Provider<ComponentRegistrar>> discoverLazy() {
        Object[] objArr;
        int i = 2 % 2;
        ArrayList arrayList = new ArrayList();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(650054);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char cCombineMeasuredStates = (char) View.combineMeasuredStates(0, 0);
            int iBlue = Color.blue(0) + 651;
            int iResolveSizeAndState = View.resolveSizeAndState(0, 0, 0) + 44;
            byte b = $$a[7];
            Object[] objArr2 = new Object[1];
            a((byte) 52, b, b, objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cCombineMeasuredStates, iBlue, iResolveSizeAndState, -459846511, false, (String) objArr2[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr3 = new Object[1];
        b(true, View.resolveSizeAndState(0, 0, 0) + 238, Color.red(0) + 22, 5 - (Process.myTid() >> 22), new char[]{'\f', 15, 1, 11, 65534, '\b', 0, '\f', '\t', 65504, '\n', 2, 17, 16, 22, 65520, 65483, 16, '\f', 65483, 1, 6}, objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        b(false, Color.blue(0) + 242, 15 - View.MeasureSpec.makeMeasureSpec(0, 0), (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 6, new char[]{65534, 65530, 5, '\r', 2, 6, 65534, 65534, 5, 65530, '\t', '\f', 65534, 65533, 65515}, objArr4);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(795782016);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char cIndexOf = (char) TextUtils.indexOf("", "", 0, 0);
            int iRed = Color.red(0) + 651;
            int packedPositionGroup = 44 - ExpandableListView.getPackedPositionGroup(0L);
            byte[] bArr = $$a;
            byte b2 = bArr[7];
            byte b3 = bArr[80];
            Object[] objArr5 = new Object[1];
            a(b2, b3, b3, objArr5);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cIndexOf, iRed, packedPositionGroup, -873460649, false, (String) objArr5[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1148961515);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char cResolveSizeAndState = (char) View.resolveSizeAndState(0, 0, 0);
                int i2 = 652 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1));
                int offsetBefore = 44 - TextUtils.getOffsetBefore("", 0);
                byte[] bArr2 = $$a;
                Object[] objArr6 = new Object[1];
                a((byte) 37, bArr2[7], bArr2[80], objArr6);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(cResolveSizeAndState, i2, offsetBefore, -1595579076, false, (String) objArr6[0], null);
            }
            Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            objArr = new Object[]{new int[]{i}, new String[0], new int[]{i}, new int[1]};
            int i3 = ((int[]) objArr7[2])[0];
            int i4 = ((int[]) objArr7[0])[0];
            int iIdentityHashCode = System.identityHashCode(this);
            int i5 = ~iIdentityHashCode;
            int i6 = ((((((~(198524080 | i5)) | (~((-201954891) | iIdentityHashCode))) | (~(i5 | 201954890))) * 959) - 464238046) + (((~(iIdentityHashCode | 201954890)) | ((~(i5 | (-201954891))) | (~(198524080 | iIdentityHashCode)))) * 959)) - 1055639445;
            int i7 = (i6 << 13) ^ i6;
            int i8 = i7 ^ (i7 >>> 17);
            ((int[]) objArr[3])[0] = i8 ^ (i8 << 5);
        } else {
            try {
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1686493381);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) ((-1) - TextUtils.lastIndexOf("", '0', 0)), View.resolveSize(0, 0) + 1610, ImageFormat.getBitsPerPixel(0) + 27, 2145681644, false, null, new Class[0]);
                }
                Object[] objArr8 = {null, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).newInstance(null), -1055639445, 0};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1625117732);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                    char trimmedLength = (char) TextUtils.getTrimmedLength("");
                    int iRed2 = Color.red(0) + 651;
                    int longPressTimeout = 44 - (ViewConfiguration.getLongPressTimeout() >> 16);
                    byte[] bArr3 = $$a;
                    byte b4 = bArr3[7];
                    byte b5 = bArr3[80];
                    Object[] objArr9 = new Object[1];
                    a(b4, b5, b5, objArr9);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(trimmedLength, iRed2, longPressTimeout, 2075921419, false, (String) objArr9[0], new Class[]{(Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) Color.blue(0), 695 - (ViewConfiguration.getScrollDefaultDelay() >> 16), Drawable.resolveOpacity(0, 0) + 98), (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (KeyEvent.normalizeMetaState(0) + 63406), KeyEvent.keyCodeFromString("") + 793, (ViewConfiguration.getPressedStateDuration() >> 16) + 83), Integer.TYPE, Integer.TYPE});
                }
                objArr = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr8);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1148961515);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                    char scrollBarFadeDuration = (char) (ViewConfiguration.getScrollBarFadeDuration() >> 16);
                    int iIndexOf = TextUtils.indexOf((CharSequence) "", '0') + 652;
                    int packedPositionChild = 43 - ExpandableListView.getPackedPositionChild(0L);
                    byte[] bArr4 = $$a;
                    Object[] objArr10 = new Object[1];
                    a((byte) 37, bArr4[7], bArr4[80], objArr10);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(scrollBarFadeDuration, iIndexOf, packedPositionChild, -1595579076, false, (String) objArr10[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, objArr);
                try {
                    Object[] objArr11 = new Object[1];
                    b(true, View.resolveSize(0, 0) + 238, 23 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), 5 - (ViewConfiguration.getLongPressTimeout() >> 16), new char[]{'\f', 15, 1, 11, 65534, '\b', 0, '\f', '\t', 65504, '\n', 2, 17, 16, 22, 65520, 65483, 16, '\f', 65483, 1, 6}, objArr11);
                    Class<?> cls2 = Class.forName((String) objArr11[0]);
                    Object[] objArr12 = new Object[1];
                    b(false, 242 - Color.alpha(0), 16 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 6, new char[]{65534, 65530, 5, '\r', 2, 6, 65534, 65534, 5, 65530, '\t', '\f', 65534, 65533, 65515}, objArr12);
                    long jLongValue2 = ((Long) cls2.getDeclaredMethod((String) objArr12[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue2);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(795782016);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
                        char cIndexOf2 = (char) TextUtils.indexOf("", "", 0, 0);
                        int defaultSize = View.getDefaultSize(0, 0) + 651;
                        int maxKeyCode = (KeyEvent.getMaxKeyCode() >> 16) + 44;
                        byte[] bArr5 = $$a;
                        byte b6 = bArr5[7];
                        byte b7 = bArr5[80];
                        Object[] objArr13 = new Object[1];
                        a(b6, b7, b7, objArr13);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(cIndexOf2, defaultSize, maxKeyCode, -873460649, false, (String) objArr13[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(650054);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault10 == null) {
                        char doubleTapTimeout = (char) (ViewConfiguration.getDoubleTapTimeout() >> 16);
                        int iKeyCodeFromString = KeyEvent.keyCodeFromString("") + 651;
                        int iIndexOf2 = 44 - TextUtils.indexOf("", "");
                        byte b8 = $$a[7];
                        Object[] objArr14 = new Object[1];
                        a((byte) 52, b8, b8, objArr14);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.b(doubleTapTimeout, iKeyCodeFromString, iIndexOf2, -459846511, false, (String) objArr14[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault10).set(null, lValueOf2);
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
        if (((int[]) objArr[2])[0] == ((int[]) objArr[0])[0]) {
            Object[] objArr15 = {new int[]{i}, new String[0], new int[]{i}, new int[1]};
            int i9 = ((int[]) objArr[3])[0];
            int i10 = ((int[]) objArr[2])[0];
            int i11 = ((int[]) objArr[0])[0];
            int i12 = (int) Runtime.getRuntime().totalMemory();
            int i13 = ~(343914938 | i12);
            int i14 = i9 + 1365896397 + ((335675424 | i13) * (-476)) + (i13 * 952) + ((~((~i12) | 343914938)) * 476);
            int i15 = (i14 << 13) ^ i14;
            int i16 = i15 ^ (i15 >>> 17);
            ((int[]) objArr15[3])[0] = i16 ^ (i16 << 5);
            for (final String str : this.retriever.retrieve(this.context)) {
                arrayList.add(new Provider() { // from class: com.google.firebase.components.ComponentDiscovery$$ExternalSyntheticLambda0
                    @Override // com.google.firebase.inject.Provider
                    public final Object get() {
                        return ComponentDiscovery.lambda$discoverLazy$0(str);
                    }
                });
            }
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList();
        String[] strArr = (String[]) objArr[1];
        if (strArr == null) {
            throw null;
        }
        int i17 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        int i18 = i17 + 85;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i18 % 128;
        int i19 = i18 % 2;
        int i20 = i17 + 59;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i20 % 128;
        int i21 = i20 % 2;
        for (String str2 : strArr) {
            int i22 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 123;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i22 % 128;
            int i23 = i22 % 2;
            arrayList2.add(str2);
        }
        throw null;
    }

    private static ComponentRegistrar instantiate(String str) {
        int i = 2 % 2;
        try {
            Class<?> cls = Class.forName(str);
            if (!ComponentRegistrar.class.isAssignableFrom(cls)) {
                throw new InvalidRegistrarException(String.format("Class %s is not an instance of %s", str, COMPONENT_SENTINEL_VALUE));
            }
            int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 29;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
            int i3 = i2 % 2;
            ComponentRegistrar componentRegistrar = (ComponentRegistrar) cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
            int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 23;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
            int i5 = i4 % 2;
            return componentRegistrar;
        } catch (ClassNotFoundException unused) {
            new Object[]{str};
            return null;
        } catch (IllegalAccessException e2) {
            throw new InvalidRegistrarException(String.format("Could not instantiate %s.", str), e2);
        } catch (InstantiationException e3) {
            throw new InvalidRegistrarException(String.format("Could not instantiate %s.", str), e3);
        } catch (NoSuchMethodException e4) {
            throw new InvalidRegistrarException(String.format("Could not instantiate %s", str), e4);
        } catch (InvocationTargetException e5) {
            throw new InvalidRegistrarException(String.format("Could not instantiate %s", str), e5);
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0022  */
    /* JADX WARN: Code duplicated, block: B:8:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:11:0x0024). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0022
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$e(short r5, int r6, short r7) {
        /*
            int r6 = r6 + 4
            int r7 = r7 * 2
            int r7 = r7 + 1
            byte[] r0 = com.google.firebase.components.ComponentDiscovery.$$c
            int r5 = 120 - r5
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L12
            r4 = r7
            r3 = r2
            goto L24
        L12:
            r3 = r2
        L13:
            byte r4 = (byte) r5
            r1[r3] = r4
            int r3 = r3 + 1
            int r6 = r6 + 1
            if (r3 != r7) goto L22
            java.lang.String r5 = new java.lang.String
            r5.<init>(r1, r2)
            return r5
        L22:
            r4 = r0[r6]
        L24:
            int r5 = r5 + r4
            goto L13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.components.ComponentDiscovery.$$e(short, int, short):java.lang.String");
    }
}
