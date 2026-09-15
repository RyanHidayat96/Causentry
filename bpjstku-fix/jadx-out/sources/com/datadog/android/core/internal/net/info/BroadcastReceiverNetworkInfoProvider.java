package com.datadog.android.core.internal.net.info;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.net.ConnectivityManager;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.TelephonyManager;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.Toast;
import androidx.autofill.HintConstants;
import androidx.compose.runtime.ComposerKt;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.view.ViewCompat;
import com.datadog.android.api.context.NetworkInfo;
import com.datadog.android.core.internal.receiver.ThreadSafeReceiver;
import com.google.android.gms.tasks.zzu;
import defpackage.ImageCaptureMetadata;
import defpackage.SessionConfigValidatingBuilder;
import defpackage.initSession;
import defpackage.isSupportedRotationDegrees;
import defpackage.setFlashType;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Random;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\r\b\u0001\u0018\u0000 \u00112\u00020\u00012\u00020\u0002:\u0001\u0011B\u001f\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0004H\u0017¢\u0006\u0004\b\n\u0010\u000bJ!\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\f2\b\u0010\u0007\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0013\u0010\u0012R\u0014\u0010\u0011\u001a\u00020\u00068\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0016\u0010\u001b\u001a\u00020\u00048\u0002@CX\u0083\f¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a"}, d2 = {"Lcom/datadog/android/core/internal/net/info/BroadcastReceiverNetworkInfoProvider;", "Lcom/datadog/android/core/internal/receiver/ThreadSafeReceiver;", "LsetFlashType;", "LImageCaptureMetadata;", "Lcom/datadog/android/api/context/NetworkInfo;", "p0", "LisSupportedRotationDegrees;", "p1", "<init>", "(LImageCaptureMetadata;LisSupportedRotationDegrees;)V", "TuitionPaymentFragmentbindingInflater1", "()Lcom/datadog/android/api/context/NetworkInfo;", "Landroid/content/Context;", "Landroid/content/Intent;", "", "onReceive", "(Landroid/content/Context;Landroid/content/Intent;)V", "b", "(Landroid/content/Context;)V", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "asInterface", "LisSupportedRotationDegrees;", "a", "LImageCaptureMetadata;", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "d", "Lcom/datadog/android/api/context/NetworkInfo;", "TuitionPaymentFragmentspecialinlinedviewModeldefault1"}, k = 1, mv = {1, 7, 0}, xi = 48)
public final class BroadcastReceiverNetworkInfoProvider extends ThreadSafeReceiver implements setFlashType {
    private static final byte[] $$a;
    private static final int $$b;
    private static final byte[] $$d;
    private static final int $$e;
    private static int INotificationSideChannel;
    private static final Set<Integer> TuitionPaymentFragmentbindingInflater1;
    private static final Set<Integer> TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    private static final Set<Integer> TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    private static final Set<Integer> asBinder;
    private static int cancel;
    private static int cancelAll;
    private static final Set<Integer> g;
    private static int[] notify;
    private static int onTransact;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final ImageCaptureMetadata<NetworkInfo> TuitionPaymentFragmentspecialinlinedviewModeldefault2;

    /* JADX INFO: renamed from: asInterface, reason: from kotlin metadata */
    private final isSupportedRotationDegrees b;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private NetworkInfo TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    private static final byte[] $$c = {25, 31, 20, 1};
    private static final int $$f = 255;
    private static int $10 = 0;
    private static int $11 = 1;

    /* JADX WARN: Code duplicated, block: B:10:0x0022  */
    /* JADX WARN: Code duplicated, block: B:8:0x001a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:11:0x0024). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0022
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void e(int r6, byte r7, short r8, java.lang.Object[] r9) {
        /*
            int r6 = 103 - r6
            int r7 = r7 + 1
            byte[] r0 = com.datadog.android.core.internal.net.info.BroadcastReceiverNetworkInfoProvider.$$a
            int r8 = r8 + 4
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L10
            r3 = r7
            r4 = r2
            goto L24
        L10:
            r3 = r2
        L11:
            int r8 = r8 + 1
            int r4 = r3 + 1
            byte r5 = (byte) r6
            r1[r3] = r5
            if (r4 != r7) goto L22
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L22:
            r3 = r0[r8]
        L24:
            int r3 = -r3
            int r6 = r6 + r3
            int r6 = r6 + (-11)
            r3 = r4
            goto L11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.datadog.android.core.internal.net.info.BroadcastReceiverNetworkInfoProvider.e(int, byte, short, java.lang.Object[]):void");
    }

    /* JADX WARN: Code duplicated, block: B:10:0x001e  */
    /* JADX WARN: Code duplicated, block: B:8:0x0016  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x001e -> B:11:0x0022). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x001e
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void f(short r5, int r6, int r7, java.lang.Object[] r8) {
        /*
            int r0 = r5 + 1
            int r6 = 495 - r6
            byte[] r1 = com.datadog.android.core.internal.net.info.BroadcastReceiverNetworkInfoProvider.$$d
            int r7 = r7 + 84
            byte[] r0 = new byte[r0]
            r2 = 0
            if (r1 != 0) goto L10
            r4 = r6
            r3 = r2
            goto L22
        L10:
            r3 = r2
        L11:
            byte r4 = (byte) r7
            r0[r3] = r4
            if (r3 != r5) goto L1e
            java.lang.String r5 = new java.lang.String
            r5.<init>(r0, r2)
            r8[r2] = r5
            return
        L1e:
            r4 = r1[r6]
            int r3 = r3 + 1
        L22:
            int r6 = r6 + 1
            int r7 = r7 + r4
            int r7 = r7 + (-2)
            goto L11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.datadog.android.core.internal.net.info.BroadcastReceiverNetworkInfoProvider.f(short, int, int, java.lang.Object[]):void");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ BroadcastReceiverNetworkInfoProvider(ImageCaptureMetadata imageCaptureMetadata, isSupportedRotationDegrees issupportedrotationdegrees, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 2) != 0) {
            int i2 = cancelAll + 57;
            INotificationSideChannel = i2 % 128;
            if (i2 % 2 != 0) {
                isSupportedRotationDegrees.Companion companion = isSupportedRotationDegrees.INSTANCE;
                isSupportedRotationDegrees.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            isSupportedRotationDegrees.Companion companion2 = isSupportedRotationDegrees.INSTANCE;
            issupportedrotationdegrees = isSupportedRotationDegrees.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
            int i3 = 2 % 2;
        }
        this(imageCaptureMetadata, issupportedrotationdegrees);
    }

    private BroadcastReceiverNetworkInfoProvider(ImageCaptureMetadata<NetworkInfo> imageCaptureMetadata, isSupportedRotationDegrees issupportedrotationdegrees) {
        Intrinsics.checkNotNullParameter(imageCaptureMetadata, "");
        Intrinsics.checkNotNullParameter(issupportedrotationdegrees, "");
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = imageCaptureMetadata;
        this.b = issupportedrotationdegrees;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = new NetworkInfo(null, null, null, null, null, null, null, 127, null);
    }

    private static void c(int[] iArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2;
        int i3 = 2 % 2;
        SessionConfigValidatingBuilder sessionConfigValidatingBuilder = new SessionConfigValidatingBuilder();
        char[] cArr = new char[4];
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr2 = notify;
        int i4 = -1870535734;
        int i5 = 0;
        int i6 = 1;
        if (iArr2 != null) {
            int length = iArr2.length;
            int[] iArr3 = new int[length];
            int i7 = 0;
            while (i7 < length) {
                int i8 = $10 + 65;
                $11 = i8 % 128;
                int i9 = i8 % i2;
                try {
                    Object[] objArr2 = new Object[1];
                    objArr2[i5] = Integer.valueOf(iArr2[i7]);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(i4);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        char maximumDrawingCacheSize = (char) (ViewConfiguration.getMaximumDrawingCacheSize() >> 24);
                        int packedPositionChild = ExpandableListView.getPackedPositionChild(0L) + 3292;
                        int iIndexOf = TextUtils.indexOf((CharSequence) "", '0', i5) + 32;
                        byte b = (byte) ($$c[3] - 1);
                        byte b2 = b;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(maximumDrawingCacheSize, packedPositionChild, iIndexOf, 1948206109, false, $$g(b, b2, b2), new Class[]{Integer.TYPE});
                    }
                    iArr3[i7] = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).intValue();
                    i7++;
                    i2 = 2;
                    i4 = -1870535734;
                    i5 = 0;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            iArr2 = iArr3;
        }
        int length2 = iArr2.length;
        int[] iArr4 = new int[length2];
        int[] iArr5 = notify;
        if (iArr5 != null) {
            int length3 = iArr5.length;
            int[] iArr6 = new int[length3];
            int i10 = 0;
            while (i10 < length3) {
                int i11 = $11 + 65;
                $10 = i11 % 128;
                int i12 = i11 % 2;
                Object[] objArr3 = new Object[i6];
                objArr3[0] = Integer.valueOf(iArr5[i10]);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1870535734);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                    char cResolveOpacity = (char) Drawable.resolveOpacity(0, 0);
                    int i13 = (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 3291;
                    int iLastIndexOf = TextUtils.lastIndexOf("", '0') + 32;
                    byte b3 = (byte) ($$c[3] - 1);
                    byte b4 = b3;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cResolveOpacity, i13, iLastIndexOf, 1948206109, false, $$g(b3, b4, b4), new Class[]{Integer.TYPE});
                }
                iArr6[i10] = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).intValue();
                i10++;
                iArr5 = iArr5;
                i6 = 1;
            }
            iArr5 = iArr6;
        }
        System.arraycopy(iArr5, 0, iArr4, 0, length2);
        sessionConfigValidatingBuilder.b = 2;
        while (sessionConfigValidatingBuilder.b < iArr.length) {
            cArr[0] = (char) (iArr[sessionConfigValidatingBuilder.b] >> 16);
            cArr[1] = (char) iArr[sessionConfigValidatingBuilder.b];
            cArr[2] = (char) (iArr[sessionConfigValidatingBuilder.b + 1] >> 16);
            cArr[3] = (char) iArr[sessionConfigValidatingBuilder.b + 1];
            sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 = (cArr[0] << 16) + cArr[1];
            sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = (cArr[2] << 16) + cArr[3];
            int i14 = $11 + 63;
            $10 = i14 % 128;
            int i15 = 2;
            int i16 = i14 % 2;
            int i17 = 17;
            while (i17 > 1) {
                int i18 = $10 + 51;
                $11 = i18 % 128;
                if (i18 % i15 == 0) {
                    sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 ^= iArr4[i17];
                    Object[] objArr4 = {sessionConfigValidatingBuilder, Integer.valueOf(SessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1)), sessionConfigValidatingBuilder, sessionConfigValidatingBuilder};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-869811764);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                        char packedPositionType = (char) ExpandableListView.getPackedPositionType(0L);
                        int size = View.MeasureSpec.getSize(0) + 2559;
                        int touchSlop = (ViewConfiguration.getTouchSlop() >> 8) + 29;
                        byte b5 = $$c[3];
                        byte b6 = (byte) (b5 - 1);
                        byte b7 = b5;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(packedPositionType, size, touchSlop, 683220507, false, $$g(b6, b7, (byte) (b7 - 1)), new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                    }
                    int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4)).intValue();
                    sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 = sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                    sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = iIntValue;
                    i17 += 89;
                } else {
                    sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 ^= iArr4[i17];
                    Object[] objArr5 = {sessionConfigValidatingBuilder, Integer.valueOf(SessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1)), sessionConfigValidatingBuilder, sessionConfigValidatingBuilder};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-869811764);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        char c = (char) (1 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)));
                        int i19 = 2560 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1));
                        int gidForName = 28 - Process.getGidForName("");
                        byte b8 = $$c[3];
                        byte b9 = (byte) (b8 - 1);
                        byte b10 = b8;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(c, i19, gidForName, 683220507, false, $$g(b9, b10, (byte) (b10 - 1)), new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                    }
                    int iIntValue2 = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).intValue();
                    sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 = sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                    sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = iIntValue2;
                    i17--;
                }
                i15 = 2;
            }
            int i20 = sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1;
            sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 = sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i20;
            sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 ^= iArr4[1];
            sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 ^= iArr4[0];
            sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 ^= iArr[sessionConfigValidatingBuilder.b - 2];
            int i21 = sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            Object[] objArr6 = {sessionConfigValidatingBuilder};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(447797990);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b((char) (28879 - View.resolveSize(0, 0)), 348 - (ViewConfiguration.getScrollDefaultDelay() >> 16), 25 - (ViewConfiguration.getEdgeSlop() >> 16), -30507727, false, "G", new Class[]{Object.class});
            }
            sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i21 ^ iArr[((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr6)).intValue()];
            cArr[0] = (char) (sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 >>> 16);
            cArr[1] = (char) sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1;
            cArr[2] = (char) (sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 >>> 16);
            cArr[3] = (char) sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            cArr2[(sessionConfigValidatingBuilder.b - 2) * 2] = cArr[0];
            cArr2[((sessionConfigValidatingBuilder.b - 2) * 2) + 1] = cArr[1];
            cArr2[((sessionConfigValidatingBuilder.b - 2) * 2) + 2] = cArr[2];
            cArr2[((sessionConfigValidatingBuilder.b - 2) * 2) + 3] = cArr[3];
            sessionConfigValidatingBuilder.b += 2;
        }
        objArr[0] = new String(cArr2, 0, i);
    }

    /* JADX WARN: Code duplicated, block: B:338:0x2331  */
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context p0, Intent p1) throws Throwable {
        Object[] objArr;
        Object[] objArr2;
        int i;
        Object[] objArr3;
        Object[] objArr4;
        Object[] objArr5;
        Object[] objArr6;
        String str;
        Object[] objArr7;
        String str2;
        Object[] objArr8;
        Object[] objArr9;
        int i2;
        Object obj;
        Context applicationContext;
        String str3;
        Object[] objArr10;
        int i3;
        Object[] objArr11;
        Context applicationContext2;
        Object[] objArr12;
        NetworkInfo networkInfo;
        NetworkInfo.Connectivity connectivity;
        String str4;
        String str5;
        String simCarrierIdName;
        int i4 = 2 % 2;
        Object[] objArr13 = new Object[1];
        c(new int[]{658866445, 1456611010, 936663392, -1427040103, 1137982919, 1720262540, -1434323118, 2114762659, -987289482, -323872669, -1972389666, -2124360551, 123255614, 1079480685}, 22 - (ViewConfiguration.getKeyRepeatDelay() >> 16), objArr13);
        String str6 = (String) objArr13[0];
        Object[] objArr14 = new Object[1];
        c(new int[]{2015538425, 693826114, 1590844218, -538273346, 1549497743, 581620105, 1654002031, -1709720135, -1513186903, 1475430792}, (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 15, objArr14);
        String str7 = (String) objArr14[0];
        Object[] objArr15 = new Object[1];
        c(new int[]{-320739460, -1554773153, -790572390, 2136010031, -442007715, 1439367875, 2124501645, -560624000, 1263497138, -841462181}, 16 - TextUtils.indexOf("", "", 0), objArr15);
        String str8 = (String) objArr15[0];
        Object[] objArr16 = new Object[1];
        c(new int[]{1199830672, 800984724, 1329273626, -444415211, 1133382855, 714018329, -2076299704, 1197911705, -1237857373, 1181304632}, 15 - TextUtils.lastIndexOf("", '0'), objArr16);
        String str9 = (String) objArr16[0];
        Intrinsics.checkNotNullParameter(p0, "");
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1545400921);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char cBlue = (char) Color.blue(0);
            int capsMode = 876 - TextUtils.getCapsMode("", 0, 0);
            int iLastIndexOf = TextUtils.lastIndexOf("", '0', 0, 0) + 11;
            byte[] bArr = $$a;
            Object[] objArr17 = new Object[1];
            e(bArr[36], (byte) (-bArr[26]), bArr[18], objArr17);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cBlue, capsMode, iLastIndexOf, -1199417970, false, (String) objArr17[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        long jLongValue = ((Long) Class.forName(str6).getDeclaredMethod(str7, new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-340665130);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char scrollBarSize = (char) (ViewConfiguration.getScrollBarSize() >> 8);
            int iArgb = 876 - Color.argb(0, 0, 0, 0);
            int iResolveSizeAndState = 10 - View.resolveSizeAndState(0, 0, 0);
            byte[] bArr2 = $$a;
            Object[] objArr18 = new Object[1];
            e((byte) (-bArr2[31]), bArr2[24], (short) (-bArr2[45]), objArr18);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(scrollBarSize, iArgb, iResolveSizeAndState, 254769921, false, (String) objArr18[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1435299656);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char cMyTid = (char) (Process.myTid() >> 22);
                int iIndexOf = 875 - TextUtils.indexOf((CharSequence) "", '0', 0);
                int iRgb = Color.rgb(0, 0, 0) + 16777226;
                byte[] bArr3 = $$a;
                Object[] objArr19 = new Object[1];
                e(bArr3[36], bArr3[94], (short) (-bArr3[45]), objArr19);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(cMyTid, iIndexOf, iRgb, 1324201839, false, (String) objArr19[0], null);
            }
            Object[] objArr20 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            objArr = new Object[]{new int[]{((int[]) objArr20[0])[0]}, new int[1], new int[]{((int[]) objArr20[2])[0]}, (String[]) objArr20[3]};
            int iIdentityHashCode = System.identityHashCode(this);
            int i5 = ~((-193193850) | iIdentityHashCode);
            int i6 = ~iIdentityHashCode;
            int i7 = (-638269500) + ((i5 | (~((-152883621) | i6))) * (-1808)) + (((~((-42149466) | iIdentityHashCode)) | (~(i6 | (-1839237)))) * TypedValues.Custom.TYPE_BOOLEAN) + (((~(iIdentityHashCode | 152883620)) | 151044384 | (~(193193849 | i6))) * TypedValues.Custom.TYPE_BOOLEAN) + 1212135996;
            int i8 = (i7 << 13) ^ i7;
            int i9 = i8 ^ (i8 >>> 17);
            ((int[]) objArr[1])[0] = i9 ^ (i9 << 5);
        } else {
            try {
                Object[] objArr21 = {Integer.valueOf(((Integer) Class.forName(str8).getMethod(str9, Object.class).invoke(null, this)).intValue()), 1212135996};
                byte[] bArr4 = $$d;
                Object[] objArr22 = new Object[1];
                f(bArr4[281], (short) 491, bArr4[15], objArr22);
                Class<?> cls = Class.forName((String) objArr22[0]);
                byte b = bArr4[5];
                Object[] objArr23 = new Object[1];
                f(b, (short) (b | 443), bArr4[4], objArr23);
                Object[] objArr24 = (Object[]) cls.getMethod((String) objArr23[0], Integer.TYPE, Integer.TYPE).invoke(null, objArr21);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1435299656);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    char c = (char) (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1));
                    int iLastIndexOf2 = 875 - TextUtils.lastIndexOf("", '0');
                    int capsMode2 = 10 - TextUtils.getCapsMode("", 0, 0);
                    byte[] bArr5 = $$a;
                    Object[] objArr25 = new Object[1];
                    e(bArr5[36], bArr5[94], (short) (-bArr5[45]), objArr25);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(c, iLastIndexOf2, capsMode2, 1324201839, false, (String) objArr25[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr24);
                try {
                    long jLongValue2 = ((Long) Class.forName(str6).getDeclaredMethod(str7, new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue2);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-340665130);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                        char cNormalizeMetaState = (char) KeyEvent.normalizeMetaState(0);
                        int iIndexOf2 = 875 - TextUtils.indexOf((CharSequence) "", '0', 0);
                        int offsetBefore = 10 - TextUtils.getOffsetBefore("", 0);
                        byte[] bArr6 = $$a;
                        Object[] objArr26 = new Object[1];
                        e((byte) (-bArr6[31]), bArr6[24], (short) (-bArr6[45]), objArr26);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(cNormalizeMetaState, iIndexOf2, offsetBefore, 254769921, false, (String) objArr26[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1545400921);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                        char cMyPid = (char) (Process.myPid() >> 22);
                        int scrollDefaultDelay = (ViewConfiguration.getScrollDefaultDelay() >> 16) + 876;
                        int deadChar = 10 - KeyEvent.getDeadChar(0, 0);
                        byte[] bArr7 = $$a;
                        Object[] objArr27 = new Object[1];
                        e(bArr7[36], (byte) (-bArr7[26]), bArr7[18], objArr27);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(cMyPid, scrollDefaultDelay, deadChar, -1199417970, false, (String) objArr27[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf2);
                    objArr = objArr24;
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
        int i10 = ((int[]) objArr[2])[0];
        int i11 = ((int[]) objArr[0])[0];
        if (i11 == i10) {
            int i12 = ((int[]) objArr[1])[0];
            objArr2 = new Object[]{new int[]{((int[]) objArr[0])[0]}, new int[1], new int[]{((int[]) objArr[2])[0]}, (String[]) objArr[3]};
            int iIdentityHashCode2 = System.identityHashCode(this);
            int i13 = i12 + (-1870817444) + (((-541213185) | iIdentityHashCode2) * (-381)) + (((~((~iIdentityHashCode2) | (-636179970))) | 230243799) * 381) + 43792896;
            int i14 = (i13 << 13) ^ i13;
            int i15 = i14 ^ (i14 >>> 17);
            i = 0;
            ((int[]) objArr2[1])[0] = i15 ^ (i15 << 5);
        } else {
            ArrayList arrayList = new ArrayList();
            String[] strArr = (String[]) objArr[3];
            if (strArr != null) {
                for (String str10 : strArr) {
                    arrayList.add(str10);
                }
            }
            int[] iArr = new int[i11];
            int i16 = i11 - 1;
            iArr[i16] = 1;
            Toast.makeText((Context) null, iArr[((i11 * i16) % 2) - 1], 1).show();
            int i17 = ((int[]) objArr[1])[0];
            objArr2 = new Object[]{new int[]{((int[]) objArr[0])[0]}, new int[1], new int[]{((int[]) objArr[2])[0]}, (String[]) objArr[3]};
            int iIdentityHashCode3 = System.identityHashCode(this);
            int i18 = (~(947708263 | iIdentityHashCode3)) | 42145304;
            int i19 = ~iIdentityHashCode3;
            int i20 = i17 + 613320468 + ((i18 | (~((-1835076) | i19))) * 886) + (((~(i19 | (-947708264))) | 988018492) * (-1772)) + ((~(i19 | 988018492)) * 886);
            int i21 = (i20 << 13) ^ i20;
            int i22 = i21 ^ (i21 >>> 17);
            i = 0;
            ((int[]) objArr2[1])[0] = i22 ^ (i22 << 5);
        }
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(797565291);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
            char c2 = (char) (CdmaCellLocation.convertQuartSecToDecDegrees(i) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(i) == 0.0d ? 0 : -1));
            int size = 2267 - View.MeasureSpec.getSize(i);
            int edgeSlop = 33 - (ViewConfiguration.getEdgeSlop() >> 16);
            byte[] bArr8 = $$a;
            Object[] objArr28 = new Object[1];
            e(bArr8[27], (byte) 52, (short) (-bArr8[17]), objArr28);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(c2, size, edgeSlop, -887667012, false, (String) objArr28[0], null);
        }
        if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).getLong(null) != -1) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1013250600);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault10 == null) {
                char jumpTapTimeout = (char) (ViewConfiguration.getJumpTapTimeout() >> 16);
                int packedPositionGroup = ExpandableListView.getPackedPositionGroup(0L) + 2267;
                int iRgb2 = Color.rgb(0, 0, 0) + 16777249;
                byte[] bArr9 = $$a;
                Object[] objArr29 = new Object[1];
                e(bArr9[27], (byte) (bArr9[15] - 1), (short) 68, objArr29);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.b(jumpTapTimeout, packedPositionGroup, iRgb2, -654680577, false, (String) objArr29[0], null);
            }
            Object[] objArr30 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault10).get(null);
            objArr3 = new Object[]{new int[]{i}, strArr, new int[1], new int[]{i}};
            int i23 = ((int[]) objArr30[0])[0];
            int i24 = ((int[]) objArr30[3])[0];
            String[] strArr2 = (String[]) objArr30[1];
            int iElapsedRealtime = (int) SystemClock.elapsedRealtime();
            int i25 = (~((-669526961) | iElapsedRealtime)) | 4718768;
            int i26 = ((((-881132397) + (i25 * 992)) + ((i25 | (~((~iElapsedRealtime) | 803994547))) * (-496))) + ((iElapsedRealtime | 139186355) * 496)) - 478898990;
            int i27 = (i26 << 13) ^ i26;
            int i28 = i27 ^ (i27 >>> 17);
            ((int[]) objArr3[2])[0] = i28 ^ (i28 << 5);
        } else {
            Context applicationContext3 = p0 != null ? ((p0 instanceof ContextWrapper) && ((ContextWrapper) p0).getBaseContext() == null) ? null : p0.getApplicationContext() : p0;
            Object[] objArr31 = {applicationContext3, Integer.valueOf(((Integer) Class.forName(str8).getMethod(str9, Object.class).invoke(null, this)).intValue()), 0, -478898990};
            byte[] bArr10 = $$d;
            Object[] objArr32 = new Object[1];
            f((byte) (-bArr10[109]), (short) 443, bArr10[39], objArr32);
            Class<?> cls2 = Class.forName((String) objArr32[0]);
            Object[] objArr33 = new Object[1];
            f((byte) (-bArr10[21]), (short) 399, bArr10[5], objArr33);
            Object[] objArr34 = (Object[]) cls2.getMethod((String) objArr33[0], Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr31);
            if (applicationContext3 != null) {
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1013250600);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault11 == null) {
                    char c3 = (char) (1 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)));
                    int i29 = (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 2266;
                    int offsetBefore2 = TextUtils.getOffsetBefore("", 0) + 33;
                    byte[] bArr11 = $$a;
                    Object[] objArr35 = new Object[1];
                    e(bArr11[27], (byte) (bArr11[15] - 1), (short) 68, objArr35);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.b(c3, i29, offsetBefore2, -654680577, false, (String) objArr35[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault11).set(null, objArr34);
                try {
                    long jLongValue3 = ((Long) Class.forName(str6).getDeclaredMethod(str7, new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf3 = Long.valueOf(jLongValue3);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(796641770);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault12 == null) {
                        char cMyPid2 = (char) (Process.myPid() >> 22);
                        int keyRepeatDelay = 2267 - (ViewConfiguration.getKeyRepeatDelay() >> 16);
                        int iRgb3 = Color.rgb(0, 0, 0) + 16777249;
                        Object[] objArr36 = new Object[1];
                        e($$a[27], (byte) 52, (short) ($$b & 367), objArr36);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.b(cMyPid2, keyRepeatDelay, iRgb3, -874156483, false, (String) objArr36[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault12).set(null, lValueOf3);
                    Long lValueOf4 = Long.valueOf(jLongValue3 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(797565291);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault13 == null) {
                        char c4 = (char) ((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) - 1);
                        int mode = 2267 - View.MeasureSpec.getMode(0);
                        int iAlpha = 33 - Color.alpha(0);
                        byte[] bArr12 = $$a;
                        Object[] objArr37 = new Object[1];
                        e(bArr12[27], (byte) 52, (short) (-bArr12[17]), objArr37);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.b(c4, mode, iAlpha, -887667012, false, (String) objArr37[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault13).set(null, lValueOf4);
                } catch (Exception unused2) {
                    throw new RuntimeException();
                }
            } else {
                objArr34 = objArr34;
            }
            objArr3 = objArr34;
        }
        int i30 = ((int[]) objArr3[3])[0];
        int i31 = ((int[]) objArr3[0])[0];
        if (i31 != i30) {
            ArrayList arrayList2 = new ArrayList();
            String[] strArr3 = (String[]) objArr3[1];
            if (strArr3 != null) {
                int i32 = cancelAll + 125;
                INotificationSideChannel = i32 % 128;
                int i33 = i32 % 2;
                for (String str11 : strArr3) {
                    arrayList2.add(str11);
                }
            }
            throw new RuntimeException(String.valueOf(i31));
        }
        Object[] objArr38 = {new int[]{i}, strArr, new int[1], new int[]{i}};
        int i34 = ((int[]) objArr3[2])[0];
        int i35 = ((int[]) objArr3[0])[0];
        int i36 = ((int[]) objArr3[3])[0];
        String[] strArr4 = (String[]) objArr3[1];
        int iMaxMemory = (int) Runtime.getRuntime().maxMemory();
        int i37 = i34 + ((~((-547495946) | iMaxMemory)) * 521) + 452539888 + (((~((~iMaxMemory) | (-547495946))) | 252826514) * 521);
        int i38 = (i37 << 13) ^ i37;
        int i39 = i38 ^ (i38 >>> 17);
        ((int[]) objArr38[2])[0] = i39 ^ (i39 << 5);
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault14 == null) {
            char cMyTid2 = (char) ((Process.myTid() >> 22) + 29944);
            int mirror = 1803 - AndroidCharacter.getMirror('0');
            int iIndexOf3 = 23 - TextUtils.indexOf("", "", 0, 0);
            byte[] bArr13 = $$a;
            Object[] objArr39 = new Object[1];
            e(bArr13[27], (byte) (bArr13[15] - 1), (short) 68, objArr39);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.b(cMyTid2, mirror, iIndexOf3, 986134021, false, (String) objArr39[0], null);
        }
        if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault14).getLong(null) != -1) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault15 == null) {
                char cAlpha = (char) (Color.alpha(0) + 29944);
                int maximumDrawingCacheSize = 1755 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24);
                int pressedStateDuration = (ViewConfiguration.getPressedStateDuration() >> 16) + 23;
                byte[] bArr14 = $$a;
                Object[] objArr40 = new Object[1];
                e(bArr14[27], (byte) 52, (short) (-bArr14[17]), objArr40);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.b(cAlpha, maximumDrawingCacheSize, pressedStateDuration, 1599039318, false, (String) objArr40[0], null);
            }
            Object[] objArr41 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault15).get(null);
            objArr4 = new Object[]{new int[]{((int[]) objArr41[0])[0]}, new int[]{((int[]) objArr41[1])[0]}, (Object[]) objArr41[2], new int[1], (String[]) objArr41[4]};
            int iIdentityHashCode4 = System.identityHashCode(this);
            int i40 = (((1878469249 + (((-203681078) | iIdentityHashCode4) * 376)) + (((~((~iIdentityHashCode4) | 4464006)) | (-208141752)) * (-376))) + (((~(iIdentityHashCode4 | (-4464007))) | 208138419) * 376)) - 1273541163;
            int i41 = (i40 << 13) ^ i40;
            int i42 = i41 ^ (i41 >>> 17);
            ((int[]) objArr4[3])[0] = i42 ^ (i42 << 5);
            objArr38 = objArr38;
        } else {
            int iIntValue = ((Integer) Class.forName(str8).getMethod(str9, Object.class).invoke(null, this)).intValue();
            try {
                Object[] objArr42 = {1479435007};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2063193834);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault16 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.b((char) (Gravity.getAbsoluteGravity(0, 0) + 42049), Drawable.resolveOpacity(0, 0) + 1726, 29 - Color.green(0), -1637387971, false, null, new Class[]{Integer.TYPE});
                }
                Object[] objArrTuitionPaymentFragmentbindingInflater1$7879113 = zzu.TuitionPaymentFragmentbindingInflater1$7879113(iIntValue, 0, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault16).newInstance(objArr42), -1273541163, false, true);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault17 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault17 == null) {
                    char touchSlop = (char) ((ViewConfiguration.getTouchSlop() >> 8) + 29944);
                    int longPressTimeout = 1755 - (ViewConfiguration.getLongPressTimeout() >> 16);
                    int scrollBarFadeDuration = (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 23;
                    byte[] bArr15 = $$a;
                    Object[] objArr43 = new Object[1];
                    e(bArr15[27], (byte) 52, (short) (-bArr15[17]), objArr43);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault17 = initSession.b(touchSlop, longPressTimeout, scrollBarFadeDuration, 1599039318, false, (String) objArr43[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault17).set(null, objArrTuitionPaymentFragmentbindingInflater1$7879113);
                try {
                    long jLongValue4 = ((Long) Class.forName(str6).getDeclaredMethod(str7, new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf5 = Long.valueOf(jLongValue4);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault18 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1145728641);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault18 == null) {
                        char c5 = (char) ((PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 29944);
                        int offsetAfter = 1755 - TextUtils.getOffsetAfter("", 0);
                        int iRgb4 = Color.rgb(0, 0, 0) + 16777239;
                        Object[] objArr44 = new Object[1];
                        e($$a[27], (byte) 52, (short) 157, objArr44);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault18 = initSession.b(c5, offsetAfter, iRgb4, 1596667560, false, (String) objArr44[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault18).set(null, lValueOf5);
                    Long lValueOf6 = Long.valueOf(jLongValue4 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault19 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault19 == null) {
                        char bitsPerPixel = (char) (ImageFormat.getBitsPerPixel(0) + 29945);
                        int trimmedLength = TextUtils.getTrimmedLength("") + 1755;
                        int trimmedLength2 = 23 - TextUtils.getTrimmedLength("");
                        byte[] bArr16 = $$a;
                        Object[] objArr45 = new Object[1];
                        e(bArr16[27], (byte) (bArr16[15] - 1), (short) 68, objArr45);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault19 = initSession.b(bitsPerPixel, trimmedLength, trimmedLength2, 986134021, false, (String) objArr45[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault19).set(null, lValueOf6);
                    objArr4 = objArrTuitionPaymentFragmentbindingInflater1$7879113;
                } catch (Exception unused3) {
                    throw new RuntimeException();
                }
            } catch (Throwable th2) {
                Throwable cause2 = th2.getCause();
                if (cause2 == null) {
                    throw th2;
                }
                throw cause2;
            }
        }
        int i43 = ((int[]) objArr4[1])[0];
        int i44 = ((int[]) objArr4[0])[0];
        if (i44 != i43) {
            ArrayList arrayList3 = new ArrayList();
            String[] strArr5 = (String[]) objArr4[4];
            if (strArr5 != null) {
                for (String str12 : strArr5) {
                    arrayList3.add(str12);
                }
            }
            throw new RuntimeException(String.valueOf(i44));
        }
        int i45 = ((int[]) objArr4[3])[0];
        Object[] objArr46 = {new int[]{((int[]) objArr4[0])[0]}, new int[]{((int[]) objArr4[1])[0]}, (Object[]) objArr4[2], new int[1], (String[]) objArr4[4]};
        int iFreeMemory = (int) Runtime.getRuntime().freeMemory();
        int i46 = i45 + 510068770 + ((~((~iFreeMemory) | (-39022593))) * 433) + (((~((-86806522) | iFreeMemory)) | (-125795905)) * (-433)) + (((~(iFreeMemory | (-125795905))) | (-125829114)) * 433);
        int i47 = (i46 << 13) ^ i46;
        int i48 = i47 ^ (i47 >>> 17);
        ((int[]) objArr46[3])[0] = i48 ^ (i48 << 5);
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault20 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1354724972);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault20 == null) {
            char offsetBefore3 = (char) (TextUtils.getOffsetBefore("", 0) + 43042);
            int iMyPid = 3111 - (Process.myPid() >> 22);
            int iMyPid2 = 22 - (Process.myPid() >> 22);
            Object[] objArr47 = new Object[1];
            e($$a[27], (byte) 52, (short) ($$b & 367), objArr47);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault20 = initSession.b(offsetBefore3, iMyPid, iMyPid2, -1272852037, false, (String) objArr47[0], null);
        }
        if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault20).getLong(null) != -1) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault21 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-308143642);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault21 == null) {
                char pressedStateDuration2 = (char) (43042 - (ViewConfiguration.getPressedStateDuration() >> 16));
                int i49 = (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 3111;
                int minimumFlingVelocity = (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 22;
                byte[] bArr17 = $$a;
                Object[] objArr48 = new Object[1];
                e(bArr17[27], (byte) (bArr17[15] - 1), (short) 68, objArr48);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault21 = initSession.b(pressedStateDuration2, i49, minimumFlingVelocity, 154975793, false, (String) objArr48[0], null);
            }
            Object[] objArr49 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault21).get(null);
            int i50 = ((int[]) objArr49[2])[0];
            int i51 = ((int[]) objArr49[1])[0];
            String[] strArr6 = (String[]) objArr49[3];
            int[] iArr2 = {i51};
            int iIdentityHashCode5 = System.identityHashCode(this);
            int i52 = ~iIdentityHashCode5;
            int i53 = ((((-163371470) + (((-1343103069) | iIdentityHashCode5) * (-676))) + (((~(250727843 | i52)) | 1343103068) * 676)) + (((~(iIdentityHashCode5 | 1593830911)) | ((~(i52 | (-1454303616))) | 111200547)) * 676)) - 993433382;
            int i54 = (i53 << 13) ^ i53;
            int i55 = i54 ^ (i54 >>> 17);
            ((int[]) objArr5[0])[0] = i55 ^ (i55 << 5);
            objArr5 = new Object[]{new int[1], iArr2, new int[]{i50}, strArr6};
            objArr46 = objArr46;
        } else {
            Object[] objArr50 = {null, Integer.valueOf(((Integer) Class.forName(str8).getMethod(str9, Object.class).invoke(null, this)).intValue()), 0, -993433382};
            byte[] bArr18 = $$d;
            Object[] objArr51 = new Object[1];
            f((byte) (bArr18[0] - 1), (short) 347, bArr18[15], objArr51);
            Class<?> cls3 = Class.forName((String) objArr51[0]);
            byte b2 = bArr18[5];
            Object[] objArr52 = new Object[1];
            f(b2, (short) (b2 | 443), bArr18[4], objArr52);
            Object[] objArr53 = (Object[]) cls3.getMethod((String) objArr52[0], Class.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr50);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault22 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-308143642);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault22 == null) {
                char cMakeMeasureSpec = (char) (43042 - View.MeasureSpec.makeMeasureSpec(0, 0));
                int scrollBarFadeDuration2 = (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 3111;
                int scrollBarFadeDuration3 = 22 - (ViewConfiguration.getScrollBarFadeDuration() >> 16);
                byte[] bArr19 = $$a;
                Object[] objArr54 = new Object[1];
                e(bArr19[27], (byte) (bArr19[15] - 1), (short) 68, objArr54);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault22 = initSession.b(cMakeMeasureSpec, scrollBarFadeDuration2, scrollBarFadeDuration3, 154975793, false, (String) objArr54[0], null);
            }
            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault22).set(null, objArr53);
            try {
                long jLongValue5 = ((Long) Class.forName(str6).getDeclaredMethod(str7, new Class[0]).invoke(null, new Object[0])).longValue();
                Long lValueOf7 = Long.valueOf(jLongValue5);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault23 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1355648493);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault23 == null) {
                    char longPressTimeout2 = (char) ((ViewConfiguration.getLongPressTimeout() >> 16) + 43042);
                    int longPressTimeout3 = 3111 - (ViewConfiguration.getLongPressTimeout() >> 16);
                    int iNormalizeMetaState = KeyEvent.normalizeMetaState(0) + 22;
                    byte[] bArr20 = $$a;
                    Object[] objArr55 = new Object[1];
                    e(bArr20[27], (byte) 52, (short) (-bArr20[17]), objArr55);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault23 = initSession.b(longPressTimeout2, longPressTimeout3, iNormalizeMetaState, -1269618118, false, (String) objArr55[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault23).set(null, lValueOf7);
                Long lValueOf8 = Long.valueOf(jLongValue5 >> 12);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault24 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1354724972);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault24 == null) {
                    char offsetAfter2 = (char) (43042 - TextUtils.getOffsetAfter("", 0));
                    int threadPriority = ((Process.getThreadPriority(0) + 20) >> 6) + 3111;
                    int iLastIndexOf3 = TextUtils.lastIndexOf("", '0', 0, 0) + 23;
                    Object[] objArr56 = new Object[1];
                    e($$a[27], (byte) 52, (short) ($$b & 367), objArr56);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault24 = initSession.b(offsetAfter2, threadPriority, iLastIndexOf3, -1272852037, false, (String) objArr56[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault24).set(null, lValueOf8);
                objArr5 = objArr53;
            } catch (Exception unused4) {
                throw new RuntimeException();
            }
        }
        if (((int[]) objArr5[2])[0] != ((int[]) objArr5[1])[0]) {
            ArrayList arrayList4 = new ArrayList();
            String[] strArr7 = (String[]) objArr5[3];
            if (strArr7 != null) {
                for (String str13 : strArr7) {
                    arrayList4.add(str13);
                }
            }
            throw null;
        }
        int i56 = ((int[]) objArr5[0])[0];
        int i57 = ((int[]) objArr5[2])[0];
        int i58 = ((int[]) objArr5[1])[0];
        String[] strArr8 = (String[]) objArr5[3];
        int[] iArr3 = {i57};
        int[] iArr4 = {i58};
        int iIdentityHashCode6 = System.identityHashCode(this);
        int i59 = ~((-920796113) | iIdentityHashCode6);
        int i60 = (-651297782) + ((272629888 | i59) * (-280)) + ((i59 | (~((-784235347) | iIdentityHashCode6))) * 140);
        int i61 = ~((-648166225) | iIdentityHashCode6);
        int i62 = ~iIdentityHashCode6;
        int i63 = i56 + i60 + (((~(i62 | (-136069123))) | i61 | (~((-272629889) | i62))) * 140);
        int i64 = (i63 << 13) ^ i63;
        int i65 = i64 ^ (i64 >>> 17);
        ((int[]) objArr[0])[0] = i65 ^ (i65 << 5);
        Object[] objArr57 = {new int[1], iArr4, iArr3, strArr8};
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault25 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault25 == null) {
            char cAxisFromString = (char) (MotionEvent.axisFromString("") + 1);
            int i66 = 1031 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
            int i67 = (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 14;
            Object[] objArr58 = new Object[1];
            e($$a[27], (byte) 52, (short) ($$b & 367), objArr58);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault25 = initSession.b(cAxisFromString, i66, i67, 1357589585, false, (String) objArr58[0], null);
        }
        long j2 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault25).getLong(null);
        long jLongValue6 = ((Long) Class.forName(str6).getDeclaredMethod(str7, new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault26 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault26 == null) {
            char scrollDefaultDelay2 = (char) (ViewConfiguration.getScrollDefaultDelay() >> 16);
            int mode2 = View.MeasureSpec.getMode(0) + 1031;
            int iIndexOf4 = 15 - TextUtils.indexOf("", "");
            byte[] bArr21 = $$a;
            Object[] objArr59 = new Object[1];
            e(bArr21[27], (byte) 52, (short) (-bArr21[17]), objArr59);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault26 = initSession.b(scrollDefaultDelay2, mode2, iIndexOf4, 1344079056, false, (String) objArr59[0], null);
        }
        if (j2 == ((jLongValue6 - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault26).getLong(null) << 52) >>> 52)) >> 12)) {
            int i68 = INotificationSideChannel + 119;
            cancelAll = i68 % 128;
            int i69 = i68 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault27 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault27 == null) {
                char deadChar2 = (char) KeyEvent.getDeadChar(0, 0);
                int threadPriority2 = ((Process.getThreadPriority(0) + 20) >> 6) + 1031;
                int trimmedLength3 = TextUtils.getTrimmedLength("") + 15;
                byte[] bArr22 = $$a;
                byte b3 = (byte) (bArr22[36] - 1);
                byte b4 = bArr22[24];
                Object[] objArr60 = new Object[1];
                e(b3, b4, (short) (b4 | 209), objArr60);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault27 = initSession.b(deadChar2, threadPriority2, trimmedLength3, 632103528, false, (String) objArr60[0], null);
            }
            Object[] objArr61 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault27).get(null);
            objArr6 = new Object[]{strArr, new int[]{i}, new int[1], new int[]{i}};
            int i70 = ((int[]) objArr61[3])[0];
            int i71 = ((int[]) objArr61[1])[0];
            String[] strArr9 = (String[]) objArr61[0];
            int iIdentityHashCode7 = System.identityHashCode(this);
            int i72 = ~iIdentityHashCode7;
            int i73 = (-843547980) + ((~(342336543 | i72)) * 979) + ((iIdentityHashCode7 | 586616713) * (-979)) + (((~(iIdentityHashCode7 | 342336543)) | (~(i72 | 586616713))) * 979) + 57063417;
            int i74 = (i73 << 13) ^ i73;
            int i75 = i74 ^ (i74 >>> 17);
            ((int[]) objArr6[2])[0] = i75 ^ (i75 << 5);
        } else {
            int iIntValue2 = ((Integer) Class.forName(str8).getMethod(str9, Object.class).invoke(null, this)).intValue();
            Object[] objArr62 = {1479435007};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault28 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-725886332);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault28 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault28 = initSession.b((char) (46038 - (KeyEvent.getMaxKeyCode() >> 16)), (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 1134, 17 - Process.getGidForName(""), 807763283, false, null, new Class[]{Integer.TYPE});
            }
            Object[] objArr63 = {Integer.valueOf(iIntValue2), 0, 57063417, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault28).newInstance(objArr62), false};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault29 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1443305588);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault29 == null) {
                char cAxisFromString2 = (char) ((-1) - MotionEvent.axisFromString(""));
                int maxKeyCode = 1031 - (KeyEvent.getMaxKeyCode() >> 16);
                int modifierMetaStateMask = 14 - ((byte) KeyEvent.getModifierMetaStateMask());
                Object[] objArr64 = new Object[1];
                e($$a[27], (byte) 52, (short) ($$b & 367), objArr64);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault29 = initSession.b(cAxisFromString2, maxKeyCode, modifierMetaStateMask, 1298546779, false, (String) objArr64[0], new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 45992), 1117 - Color.alpha(0), 16 - MotionEvent.axisFromString("")), Boolean.TYPE});
            }
            objArr6 = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault29).invoke(null, objArr63);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault30 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault30 == null) {
                char scrollBarFadeDuration4 = (char) (ViewConfiguration.getScrollBarFadeDuration() >> 16);
                int packedPositionType = 1031 - ExpandableListView.getPackedPositionType(0L);
                int i76 = (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 14;
                byte[] bArr23 = $$a;
                byte b5 = (byte) (bArr23[36] - 1);
                byte b6 = bArr23[24];
                Object[] objArr65 = new Object[1];
                e(b5, b6, (short) (b6 | 209), objArr65);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault30 = initSession.b(scrollBarFadeDuration4, packedPositionType, i76, 632103528, false, (String) objArr65[0], null);
            }
            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault30).set(null, objArr6);
            try {
                long jLongValue7 = ((Long) Class.forName(str6).getDeclaredMethod(str7, new Class[0]).invoke(null, new Object[0])).longValue();
                Long lValueOf9 = Long.valueOf(jLongValue7);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault31 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault31 == null) {
                    char c6 = (char) ((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) - 1);
                    int i77 = (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 1030;
                    int iIndexOf5 = 15 - TextUtils.indexOf("", "", 0, 0);
                    byte[] bArr24 = $$a;
                    Object[] objArr66 = new Object[1];
                    e(bArr24[27], (byte) 52, (short) (-bArr24[17]), objArr66);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault31 = initSession.b(c6, i77, iIndexOf5, 1344079056, false, (String) objArr66[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault31).set(null, lValueOf9);
                Long lValueOf10 = Long.valueOf(jLongValue7 >> 12);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault32 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault32 == null) {
                    char c7 = (char) ((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) - 1);
                    int doubleTapTimeout = (ViewConfiguration.getDoubleTapTimeout() >> 16) + 1031;
                    int packedPositionGroup2 = 15 - ExpandableListView.getPackedPositionGroup(0L);
                    Object[] objArr67 = new Object[1];
                    e($$a[27], (byte) 52, (short) ($$b & 367), objArr67);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault32 = initSession.b(c7, doubleTapTimeout, packedPositionGroup2, 1357589585, false, (String) objArr67[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault32).set(null, lValueOf10);
            } catch (Exception unused5) {
                throw new RuntimeException();
            }
        }
        int i78 = ((int[]) objArr6[1])[0];
        int i79 = ((int[]) objArr6[3])[0];
        if (i79 != i78) {
            ArrayList arrayList5 = new ArrayList();
            String[] strArr10 = (String[]) objArr6[0];
            if (strArr10 != null) {
                for (String str14 : strArr10) {
                    arrayList5.add(str14);
                }
            }
            throw new RuntimeException(String.valueOf(i79));
        }
        Object[] objArr68 = {strArr, new int[]{i}, new int[1], new int[]{i}};
        int i80 = ((int[]) objArr6[2])[0];
        int i81 = ((int[]) objArr6[3])[0];
        int i82 = ((int[]) objArr6[1])[0];
        String[] strArr11 = (String[]) objArr6[0];
        int iIdentityHashCode8 = System.identityHashCode(this);
        int i83 = ~iIdentityHashCode8;
        int i84 = i80 + 1500168597 + (((~((-562598293) | i83)) | 806878462) * (-328)) + ((iIdentityHashCode8 | 806878462) * 164) + (((~(iIdentityHashCode8 | 562598292)) | 269970538 | (~(i83 | (-25690369)))) * 164);
        int i85 = (i84 << 13) ^ i84;
        int i86 = i85 ^ (i85 >>> 17);
        Object obj2 = objArr68[2];
        ((int[]) obj2)[0] = i86 ^ (i86 << 5);
        int i87 = ((int[]) objArr2[1])[0];
        int i88 = i87 * i87;
        int i89 = -(694972182 * i87);
        int i90 = ((((i88 | i89) << 1) - (i88 ^ i89)) - (~(-(i87 * 66009458)))) - 1;
        int i91 = (i90 ^ 1139323408) + ((1139323408 & i90) << 1);
        int i92 = i91 >> 29;
        int i93 = (((i92 | (-15)) << 1) - (i92 ^ (-15))) / 8;
        int i94 = (i91 - (~(((i93 | 1) << 1) - (i93 ^ 1)))) - 1;
        int i95 = ((i91 >> 28) - 31) / 16;
        int i96 = -(i94 ^ ((i95 & 1) + (i95 | 1)));
        int i97 = (i96 & 6) + (i96 | 6);
        int i98 = ((i97 >> 19) - 16383) / 8192;
        int i99 = (i98 & 1) + (i98 | 1);
        int i100 = 1984500 / (((-((i99 ^ 1) + ((i99 & 1) << 1))) & i97) * 735);
        int i101 = ((int[]) objArr38[2])[0];
        int i102 = i101 * i101;
        int i103 = -(1015983999 * i101);
        int i104 = (i102 ^ i103) + ((i102 & i103) << 1);
        int i105 = -(i101 * 2143015893);
        int i106 = (((i104 | i105) << 1) - (i105 ^ i104)) - 470039324;
        int i107 = i106 >> 19;
        int i108 = ((i107 ^ (-16383)) + ((i107 & (-16383)) << 1)) / 8192;
        int i109 = ((i108 | 1) << 1) - (i108 ^ 1);
        int i110 = (i106 ^ i109) + ((i109 & i106) << 1);
        int i111 = i106 >> 29;
        int i112 = ((i111 ^ (-15)) + ((i111 & (-15)) << 1)) / 8;
        int i113 = -((((i112 | 1) << 1) - (i112 ^ 1)) ^ i110);
        int i114 = ((i113 | 2) << 1) - (i113 ^ 2);
        int i115 = i114 >> 26;
        int i116 = ((i115 ^ ComposerKt.defaultsKey) + ((i115 & ComposerKt.defaultsKey) << 1)) / 64;
        int i117 = ((i116 | 1) << 1) - (i116 ^ 1);
        int i118 = i100 + (2303220 / (((-((i117 ^ 1) + ((i117 & 1) << 1))) & i114) * 1669));
        int i119 = ((int[]) objArr46[3])[0];
        int i120 = i119 * i119;
        int i121 = -(156549391 * i119);
        int i122 = (i120 & i121) + (i120 | i121);
        int i123 = -(i119 * 840231289);
        int i124 = ((i122 | i123) << 1) - (i123 ^ i122);
        int i125 = ((i124 | 21641744) << 1) - (21641744 ^ i124);
        int i126 = ((i125 >> 27) - 63) / 32;
        int i127 = ((i126 | 1) << 1) - (i126 ^ 1);
        int i128 = (i125 & i127) + (i127 | i125);
        int i129 = i125 >> 29;
        int i130 = (-(i128 ^ (((((i129 | (-15)) << 1) - (i129 ^ (-15))) / 8) + 1))) + 8;
        int i131 = i130 >> 23;
        int i132 = (((i131 & (-1023)) + (i131 | (-1023))) / 512) + 1;
        int i133 = i118 + (5203296 / ((i130 & (-((i132 ^ 1) + ((i132 & 1) << 1)))) * 801));
        int i134 = ((int[]) objArr57[0])[0];
        int i135 = ((i134 * i134) - (~(-(749476876 * i134)))) - 1;
        int i136 = -(i134 * (-875654138));
        int i137 = (i135 ^ i136) + ((i135 & i136) << 1);
        int i138 = (i137 ^ (-896520111)) + (((-896520111) & i137) << 1);
        int i139 = i138 >> 18;
        int i140 = (i139 - 32767) / 16384;
        int i141 = -(((i138 - (~(((i140 | 1) << 1) - (i140 ^ 1)))) - 1) ^ ((((i139 & (-32767)) + (i139 | (-32767))) / 16384) + 1));
        int i142 = (i141 ^ 5) + ((i141 & 5) << 1);
        int i143 = i142 >> 19;
        int i144 = ((i143 & (-16383)) + (i143 | (-16383))) / 8192;
        int i145 = (i144 ^ 1) + ((i144 & 1) << 1);
        int i146 = i133 + (6194640 / (((-(((i145 | 1) << 1) - (i145 ^ 1))) & i142) * 1461));
        int i147 = ((int[]) obj2)[0];
        int i148 = i147 * i147;
        int i149 = -(1072118270 * i147);
        int i150 = ((i148 | i149) << 1) - (i148 ^ i149);
        int i151 = -(i147 * (-462456466));
        int i152 = ((i150 | i151) << 1) - (i151 ^ i150);
        int i153 = (i152 ^ (-627831452)) + (((-627831452) & i152) << 1);
        int i154 = i153 >> 15;
        int i155 = ((((-262143) | i154) << 1) - (i154 ^ (-262143))) / 131072;
        int i156 = (i155 & 1) + (i155 | 1);
        int i157 = (i153 ^ i156) + ((i156 & i153) << 1);
        int i158 = i153 >> 18;
        int i159 = (((i158 | (-32767)) << 1) - (i158 ^ (-32767))) / 16384;
        int i160 = -((((i159 | 1) << 1) - (i159 ^ 1)) ^ i157);
        int i161 = (i160 & 3) + (i160 | 3);
        int i162 = i161 >> 28;
        int i163 = (((i162 | (-31)) << 1) - (i162 ^ (-31))) / 16;
        Object systemService = p0.getSystemService("23,22,8,11,connectivity".substring(i146 + ((-15395280) / (((-((((i163 | 1) << 1) - (i163 ^ 1)) + 1)) & i161) * 1840))));
        ConnectivityManager connectivityManager = systemService instanceof ConnectivityManager ? (ConnectivityManager) systemService : null;
        android.net.NetworkInfo activeNetworkInfo = connectivityManager != null ? connectivityManager.getActiveNetworkInfo() : null;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault33 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2030658839);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault33 == null) {
            char cMakeMeasureSpec2 = (char) View.MeasureSpec.makeMeasureSpec(0, 0);
            int bitsPerPixel2 = 875 - ImageFormat.getBitsPerPixel(0);
            int packedPositionChild = 9 - ExpandableListView.getPackedPositionChild(0L);
            byte[] bArr25 = $$a;
            Object[] objArr69 = new Object[1];
            e(bArr25[27], (byte) (bArr25[15] - 1), (short) 68, objArr69);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault33 = initSession.b(cMakeMeasureSpec2, bitsPerPixel2, packedPositionChild, -1650998592, false, (String) objArr69[0], null);
        }
        long j3 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault33).getLong(null);
        long jLongValue8 = ((Long) Class.forName(str6).getDeclaredMethod(str7, new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault34 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1821222244);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault34 == null) {
            char c8 = (char) (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
            int iGreen = 876 - Color.green(0);
            int maxKeyCode2 = 10 - (KeyEvent.getMaxKeyCode() >> 16);
            byte[] bArr26 = $$a;
            Object[] objArr70 = new Object[1];
            e(bArr26[27], (byte) 52, (short) (-bArr26[17]), objArr70);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault34 = initSession.b(c8, iGreen, maxKeyCode2, 2012020043, false, (String) objArr70[0], null);
        }
        if (j3 == ((jLongValue8 - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault34).getLong(null) << 52) >>> 52)) >> 12)) {
            int i164 = cancelAll + 39;
            INotificationSideChannel = i164 % 128;
            int i165 = i164 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault35 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1822145765);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault35 == null) {
                char cMyTid3 = (char) (Process.myTid() >> 22);
                int iIndexOf6 = TextUtils.indexOf((CharSequence) "", '0') + 877;
                int scrollDefaultDelay3 = (ViewConfiguration.getScrollDefaultDelay() >> 16) + 10;
                Object[] objArr71 = new Object[1];
                e($$a[27], (byte) 52, (short) ($$b & 367), objArr71);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault35 = initSession.b(cMyTid3, iIndexOf6, scrollDefaultDelay3, 2012931276, false, (String) objArr71[0], null);
            }
            Object[] objArr72 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault35).get(null);
            objArr7 = new Object[]{new int[]{((int[]) objArr72[0])[0]}, new int[1], new int[]{((int[]) objArr72[2])[0]}, (String[]) objArr72[3]};
            int iIdentityHashCode9 = System.identityHashCode(this);
            int i166 = (((-115511476) + (((-67837953) | (~iIdentityHashCode9)) * (-490))) + (((~(iIdentityHashCode9 | 435478331)) | (-503316284)) * 490)) - 992482887;
            int i167 = (i166 << 13) ^ i166;
            int i168 = i167 ^ (i167 >>> 17);
            ((int[]) objArr7[1])[0] = i168 ^ (i168 << 5);
            str = str7;
        } else {
            Context applicationContext4 = p0 != null ? ((p0 instanceof ContextWrapper) && ((ContextWrapper) p0).getBaseContext() == null) ? null : p0.getApplicationContext() : p0;
            Object[] objArr73 = {applicationContext4, Integer.valueOf(((Integer) Class.forName(str8).getMethod(str9, Object.class).invoke(null, this)).intValue()), 0, 215678019};
            byte[] bArr27 = $$d;
            byte b7 = bArr27[375];
            Object[] objArr74 = new Object[1];
            f(b7, (short) (b7 | 199), bArr27[15], objArr74);
            Class<?> cls4 = Class.forName((String) objArr74[0]);
            Object[] objArr75 = new Object[1];
            f((byte) (-bArr27[21]), (short) ($$e | 129), bArr27[5], objArr75);
            Object[] objArr76 = (Object[]) cls4.getMethod((String) objArr75[0], Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr73);
            if (applicationContext4 != null) {
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault36 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1822145765);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault36 == null) {
                    char maximumDrawingCacheSize2 = (char) (ViewConfiguration.getMaximumDrawingCacheSize() >> 24);
                    int iAlpha2 = 876 - Color.alpha(0);
                    int i169 = (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 10;
                    Object[] objArr77 = new Object[1];
                    e($$a[27], (byte) 52, (short) ($$b & 367), objArr77);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault36 = initSession.b(maximumDrawingCacheSize2, iAlpha2, i169, 2012931276, false, (String) objArr77[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault36).set(null, objArr76);
                try {
                    str = str7;
                    long jLongValue9 = ((Long) Class.forName(str6).getDeclaredMethod(str, new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf11 = Long.valueOf(jLongValue9);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault37 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1821222244);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault37 == null) {
                        char absoluteGravity = (char) Gravity.getAbsoluteGravity(0, 0);
                        int iLastIndexOf4 = 875 - TextUtils.lastIndexOf("", '0');
                        int iResolveSize = View.resolveSize(0, 0) + 10;
                        byte[] bArr28 = $$a;
                        Object[] objArr78 = new Object[1];
                        e(bArr28[27], (byte) 52, (short) (-bArr28[17]), objArr78);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault37 = initSession.b(absoluteGravity, iLastIndexOf4, iResolveSize, 2012020043, false, (String) objArr78[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault37).set(null, lValueOf11);
                    Long lValueOf12 = Long.valueOf(jLongValue9 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault38 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2030658839);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault38 == null) {
                        char c9 = (char) (1 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)));
                        int i170 = (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 876;
                        int maximumFlingVelocity = 10 - (ViewConfiguration.getMaximumFlingVelocity() >> 16);
                        byte[] bArr29 = $$a;
                        Object[] objArr79 = new Object[1];
                        e(bArr29[27], (byte) (bArr29[15] - 1), (short) 68, objArr79);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault38 = initSession.b(c9, i170, maximumFlingVelocity, -1650998592, false, (String) objArr79[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault38).set(null, lValueOf12);
                } catch (Exception unused6) {
                    throw new RuntimeException();
                }
            } else {
                str = str7;
                objArr76 = objArr76;
            }
            objArr7 = objArr76;
        }
        int i171 = ((int[]) objArr7[2])[0];
        int i172 = ((int[]) objArr7[0])[0];
        if (i172 != i171) {
            throw new RuntimeException(String.valueOf(i172));
        }
        int i173 = INotificationSideChannel + 3;
        cancelAll = i173 % 128;
        int i174 = i173 % 2;
        int i175 = ((int[]) objArr7[1])[0];
        Object[] objArr80 = {new int[]{((int[]) objArr7[0])[0]}, new int[1], new int[]{((int[]) objArr7[2])[0]}, (String[]) objArr7[3]};
        int iIdentityHashCode10 = System.identityHashCode(this);
        int i176 = ~iIdentityHashCode10;
        int i177 = i175 + 510984164 + (((~(10531348 | i176)) | 21381568) * (-108)) + (((~(i176 | 29778880)) | (~((-29778881) | iIdentityHashCode10)) | 2134036) * 54) + ((iIdentityHashCode10 | 2134036) * 54);
        int i178 = (i177 << 13) ^ i177;
        int i179 = i178 ^ (i178 >>> 17);
        ((int[]) objArr80[1])[0] = i179 ^ (i179 << 5);
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault39 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-342512172);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault39 == null) {
            char jumpTapTimeout2 = (char) (ViewConfiguration.getJumpTapTimeout() >> 16);
            int threadPriority3 = ((Process.getThreadPriority(0) + 20) >> 6) + 876;
            int maximumFlingVelocity2 = 10 - (ViewConfiguration.getMaximumFlingVelocity() >> 16);
            byte[] bArr30 = $$a;
            byte b8 = (byte) (bArr30[36] - 1);
            byte b9 = bArr30[24];
            Object[] objArr81 = new Object[1];
            e(b8, b9, (short) (b9 | 209), objArr81);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault39 = initSession.b(jumpTapTimeout2, threadPriority3, maximumFlingVelocity2, 252381699, false, (String) objArr81[0], null);
        }
        long j4 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault39).getLong(null);
        long jLongValue10 = ((Long) Class.forName(str6).getDeclaredMethod(str, new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault40 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1823069286);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault40 == null) {
            char edgeSlop2 = (char) (ViewConfiguration.getEdgeSlop() >> 16);
            int iRed = Color.red(0) + 876;
            int iIndexOf7 = TextUtils.indexOf((CharSequence) "", '0') + 11;
            Object[] objArr82 = new Object[1];
            e($$a[27], (byte) 52, (short) 157, objArr82);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault40 = initSession.b(edgeSlop2, iRed, iIndexOf7, 2009631821, false, (String) objArr82[0], null);
        }
        if (j4 == ((jLongValue10 - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault40).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault41 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-337894567);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault41 == null) {
                char cCombineMeasuredStates = (char) View.combineMeasuredStates(0, 0);
                int iBlue = Color.blue(0) + 876;
                int iResolveSizeAndState2 = View.resolveSizeAndState(0, 0, 0) + 10;
                byte b10 = $$a[24];
                byte b11 = b10;
                Object[] objArr83 = new Object[1];
                e(b10, b11, (short) (b11 | 209), objArr83);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault41 = initSession.b(cCombineMeasuredStates, iBlue, iResolveSizeAndState2, 256017550, false, (String) objArr83[0], null);
            }
            Object[] objArr84 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault41).get(null);
            objArr8 = new Object[]{new int[]{((int[]) objArr84[0])[0]}, new int[1], new int[]{((int[]) objArr84[2])[0]}, (String[]) objArr84[3]};
            int iIdentityHashCode11 = System.identityHashCode(this);
            int i180 = (-1703544620) + (((~(19869369 | iIdentityHashCode11)) | 43008006) * 576) + (((~((~iIdentityHashCode11) | 62877375)) | 17171592) * 576) + 10047326;
            int i181 = (i180 << 13) ^ i180;
            int i182 = i181 ^ (i181 >>> 17);
            ((int[]) objArr8[1])[0] = i182 ^ (i182 << 5);
            str2 = str;
        } else {
            Context applicationContext5 = p0 != null ? ((p0 instanceof ContextWrapper) && ((ContextWrapper) p0).getBaseContext() == null) ? null : p0.getApplicationContext() : p0;
            Object[] objArr85 = {applicationContext5, Integer.valueOf(((Integer) Class.forName(str8).getMethod(str9, Object.class).invoke(null, this)).intValue()), 1007239646};
            byte[] bArr31 = $$d;
            Object[] objArr86 = new Object[1];
            f(bArr31[375], (short) 147, bArr31[15], objArr86);
            Class<?> cls5 = Class.forName((String) objArr86[0]);
            Object[] objArr87 = new Object[1];
            f((byte) (-bArr31[21]), (short) ($$e | 129), bArr31[5], objArr87);
            Object[] objArr88 = (Object[]) cls5.getMethod((String) objArr87[0], Context.class, Integer.TYPE, Integer.TYPE).invoke(null, objArr85);
            if (applicationContext5 != null) {
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault42 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-337894567);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault42 == null) {
                    char modifierMetaStateMask2 = (char) ((-1) - ((byte) KeyEvent.getModifierMetaStateMask()));
                    int iAxisFromString = 875 - MotionEvent.axisFromString("");
                    int iResolveOpacity = 10 - Drawable.resolveOpacity(0, 0);
                    byte b12 = $$a[24];
                    byte b13 = b12;
                    Object[] objArr89 = new Object[1];
                    e(b12, b13, (short) (b13 | 209), objArr89);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault42 = initSession.b(modifierMetaStateMask2, iAxisFromString, iResolveOpacity, 256017550, false, (String) objArr89[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault42).set(null, objArr88);
                try {
                    str2 = str;
                    long jLongValue11 = ((Long) Class.forName(str6).getDeclaredMethod(str2, new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf13 = Long.valueOf(jLongValue11);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault43 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1823069286);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault43 == null) {
                        char cIndexOf = (char) TextUtils.indexOf("", "", 0, 0);
                        int trimmedLength4 = 876 - TextUtils.getTrimmedLength("");
                        int iLastIndexOf5 = TextUtils.lastIndexOf("", '0', 0, 0) + 11;
                        Object[] objArr90 = new Object[1];
                        e($$a[27], (byte) 52, (short) 157, objArr90);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault43 = initSession.b(cIndexOf, trimmedLength4, iLastIndexOf5, 2009631821, false, (String) objArr90[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault43).set(null, lValueOf13);
                    Long lValueOf14 = Long.valueOf(jLongValue11 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault44 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-342512172);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault44 == null) {
                        char cLastIndexOf = (char) ((-1) - TextUtils.lastIndexOf("", '0', 0));
                        int threadPriority4 = ((Process.getThreadPriority(0) + 20) >> 6) + 876;
                        int iAxisFromString2 = 9 - MotionEvent.axisFromString("");
                        byte[] bArr32 = $$a;
                        byte b14 = (byte) (bArr32[36] - 1);
                        byte b15 = bArr32[24];
                        Object[] objArr91 = new Object[1];
                        e(b14, b15, (short) (b15 | 209), objArr91);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault44 = initSession.b(cLastIndexOf, threadPriority4, iAxisFromString2, 252381699, false, (String) objArr91[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault44).set(null, lValueOf14);
                } catch (Exception unused7) {
                    throw new RuntimeException();
                }
            } else {
                objArr88 = objArr88;
                str2 = str;
            }
            objArr8 = objArr88;
        }
        if (((int[]) objArr8[0])[0] != ((int[]) objArr8[2])[0]) {
            throw null;
        }
        int i183 = ((int[]) objArr8[1])[0];
        Object[] objArr92 = {new int[]{((int[]) objArr8[0])[0]}, new int[1], new int[]{((int[]) objArr8[2])[0]}, (String[]) objArr8[3]};
        int iIdentityHashCode12 = System.identityHashCode(this);
        int i184 = (~((-6799054) | iIdentityHashCode12)) | 6755845;
        int i185 = ~((~iIdentityHashCode12) | 33554383);
        int i186 = i183 + (-1079409918) + ((i184 | i185) * (-470)) + (((~(iIdentityHashCode12 | (-43209))) | i185) * 470);
        int i187 = (i186 << 13) ^ i186;
        int i188 = i187 ^ (i187 >>> 17);
        ((int[]) objArr92[1])[0] = i188 ^ (i188 << 5);
        int i189 = cancelAll + 89;
        INotificationSideChannel = i189 % 128;
        int i190 = i189 % 2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault45 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(650054);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault45 == null) {
            char cIndexOf2 = (char) (TextUtils.indexOf((CharSequence) "", '0') + 1);
            int scrollBarFadeDuration5 = 651 - (ViewConfiguration.getScrollBarFadeDuration() >> 16);
            int iIndexOf8 = TextUtils.indexOf("", "") + 44;
            Object[] objArr93 = new Object[1];
            e($$a[27], (byte) 52, (short) 157, objArr93);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault45 = initSession.b(cIndexOf2, scrollBarFadeDuration5, iIndexOf8, -459846511, false, (String) objArr93[0], null);
        }
        long j5 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault45).getLong(null);
        long jLongValue12 = ((Long) Class.forName(str6).getDeclaredMethod(str2, new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault46 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(795782016);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault46 == null) {
            char absoluteGravity2 = (char) Gravity.getAbsoluteGravity(0, 0);
            int trimmedLength5 = TextUtils.getTrimmedLength("") + 651;
            int pressedStateDuration3 = (ViewConfiguration.getPressedStateDuration() >> 16) + 44;
            byte[] bArr33 = $$a;
            byte b16 = (byte) (bArr33[36] - 1);
            byte b17 = bArr33[24];
            Object[] objArr94 = new Object[1];
            e(b16, b17, (short) (b17 | 209), objArr94);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault46 = initSession.b(absoluteGravity2, trimmedLength5, pressedStateDuration3, -873460649, false, (String) objArr94[0], null);
        }
        if (j5 == ((jLongValue12 - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault46).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault47 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1148961515);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault47 == null) {
                char c10 = (char) (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                int i191 = 652 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1));
                int i192 = (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 44;
                byte[] bArr34 = $$a;
                Object[] objArr95 = new Object[1];
                e(bArr34[27], (byte) (bArr34[15] - 1), (short) 68, objArr95);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault47 = initSession.b(c10, i191, i192, -1595579076, false, (String) objArr95[0], null);
            }
            Object[] objArr96 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault47).get(null);
            objArr9 = new Object[]{new int[]{i}, new String[0], new int[]{i}, new int[1]};
            int i193 = ((int[]) objArr96[2])[0];
            int i194 = ((int[]) objArr96[0])[0];
            int i195 = (int) Runtime.getRuntime().totalMemory();
            int i196 = 1176521921 + (((~(211533437 | i195)) | (-214964248)) * (-964)) + (((~((~i195) | 211533437)) | (-215727744)) * (-964)) + 1810793502;
            int i197 = (i196 << 13) ^ i196;
            int i198 = i197 ^ (i197 >>> 17);
            ((int[]) objArr9[3])[0] = i198 ^ (i198 << 5);
            i2 = 0;
        } else {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault48 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1686493381);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault48 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault48 = initSession.b((char) View.MeasureSpec.getMode(0), 1610 - (ViewConfiguration.getFadingEdgeLength() >> 16), 26 - View.MeasureSpec.getMode(0), 2145681644, false, null, new Class[0]);
            }
            Object[] objArr97 = {null, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault48).newInstance(null), 1810793502, 0};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault49 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1625117732);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault49 == null) {
                char cRgb = (char) (ViewCompat.MEASURED_STATE_MASK - Color.rgb(0, 0, 0));
                int offsetBefore4 = TextUtils.getOffsetBefore("", 0) + 651;
                int iRgb5 = Color.rgb(0, 0, 0) + 16777260;
                byte[] bArr35 = $$a;
                byte b18 = (byte) (bArr35[36] - 1);
                byte b19 = bArr35[24];
                Object[] objArr98 = new Object[1];
                e(b18, b19, (short) (b19 | 209), objArr98);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault49 = initSession.b(cRgb, offsetBefore4, iRgb5, 2075921419, false, (String) objArr98[0], new Class[]{(Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) TextUtils.getCapsMode("", 0, 0), (ViewConfiguration.getTouchSlop() >> 8) + 695, 98 - View.getDefaultSize(0, 0)), (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) ((ViewConfiguration.getTapTimeout() >> 16) + 63406), View.resolveSize(0, 0) + 793, 83 - Color.alpha(0)), Integer.TYPE, Integer.TYPE});
            }
            objArr9 = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault49).invoke(null, objArr97);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault50 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1148961515);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault50 == null) {
                char cMyTid4 = (char) (Process.myTid() >> 22);
                int iLastIndexOf6 = 650 - TextUtils.lastIndexOf("", '0', 0);
                int i199 = (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 43;
                byte[] bArr36 = $$a;
                Object[] objArr99 = new Object[1];
                e(bArr36[27], (byte) (bArr36[15] - 1), (short) 68, objArr99);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault50 = initSession.b(cMyTid4, iLastIndexOf6, i199, -1595579076, false, (String) objArr99[0], null);
            }
            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault50).set(null, objArr9);
            try {
                long jLongValue13 = ((Long) Class.forName(str6).getDeclaredMethod(str2, new Class[0]).invoke(null, new Object[0])).longValue();
                Long lValueOf15 = Long.valueOf(jLongValue13);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault51 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(795782016);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault51 == null) {
                    char cMyTid5 = (char) (Process.myTid() >> 22);
                    int edgeSlop3 = 651 - (ViewConfiguration.getEdgeSlop() >> 16);
                    int maxKeyCode3 = (KeyEvent.getMaxKeyCode() >> 16) + 44;
                    byte[] bArr37 = $$a;
                    byte b20 = (byte) (bArr37[36] - 1);
                    byte b21 = bArr37[24];
                    Object[] objArr100 = new Object[1];
                    e(b20, b21, (short) (b21 | 209), objArr100);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault51 = initSession.b(cMyTid5, edgeSlop3, maxKeyCode3, -873460649, false, (String) objArr100[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault51).set(null, lValueOf15);
                Long lValueOf16 = Long.valueOf(jLongValue13 >> 12);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault52 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(650054);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault52 == null) {
                    char jumpTapTimeout3 = (char) (ViewConfiguration.getJumpTapTimeout() >> 16);
                    int tapTimeout = (ViewConfiguration.getTapTimeout() >> 16) + 651;
                    int pressedStateDuration4 = 44 - (ViewConfiguration.getPressedStateDuration() >> 16);
                    Object[] objArr101 = new Object[1];
                    e($$a[27], (byte) 52, (short) 157, objArr101);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault52 = initSession.b(jumpTapTimeout3, tapTimeout, pressedStateDuration4, -459846511, false, (String) objArr101[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault52).set(null, lValueOf16);
                i2 = 0;
            } catch (Exception unused8) {
                throw new RuntimeException();
            }
        }
        int i200 = ((int[]) objArr9[i2])[i2];
        int i201 = ((int[]) objArr9[2])[i2];
        if (i201 == i200) {
            Object[] objArr102 = new Object[4];
            int[] iArr5 = new int[1];
            objArr102[i2] = iArr5;
            int[] iArr6 = new int[1];
            objArr102[2] = iArr6;
            objArr102[3] = new int[1];
            int i202 = ((int[]) objArr9[3])[i2];
            int i203 = ((int[]) objArr9[2])[i2];
            int i204 = ((int[]) objArr9[i2])[i2];
            iArr6[i2] = i203;
            iArr5[i2] = i204;
            objArr102[1] = new String[i2];
            int i205 = ~((~System.identityHashCode(this)) | (-386722153));
            int i206 = i202 + ((((-390982507) | i205) * (-970)) - 1130055017) + ((i205 | 4260354) * 970);
            int i207 = (i206 << 13) ^ i206;
            int i208 = i207 ^ (i207 >>> 17);
            ((int[]) objArr102[3])[0] = i208 ^ (i208 << 5);
        } else {
            ArrayList arrayList6 = new ArrayList();
            String[] strArr12 = (String[]) objArr9[1];
            if (strArr12 != null) {
                for (String str15 : strArr12) {
                    arrayList6.add(str15);
                }
            }
            int[] iArr7 = new int[i201];
            int i209 = i201 - 1;
            iArr7[i209] = 1;
            Toast.makeText((Context) null, iArr7[((i201 * i209) % 2) - 1], 1).show();
            Object[] objArr103 = {new int[]{i}, new String[0], new int[]{i}, new int[1]};
            int i210 = ((int[]) objArr9[3])[0];
            int i211 = ((int[]) objArr9[2])[0];
            int i212 = ((int[]) objArr9[0])[0];
            int i213 = ~new Random().nextInt();
            int i214 = i210 + 889157360 + ((~((-117571865) | i213)) * (-783)) + (((~(i213 | (-118376351))) | (-121807161)) * 783);
            int i215 = (i214 << 13) ^ i214;
            int i216 = i215 ^ (i215 >>> 17);
            ((int[]) objArr103[3])[0] = i216 ^ (i216 << 5);
        }
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault53 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(118372281);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault53 == null) {
            char minimumFlingVelocity2 = (char) (37567 - (ViewConfiguration.getMinimumFlingVelocity() >> 16));
            int scrollBarSize2 = (ViewConfiguration.getScrollBarSize() >> 8) + 625;
            int mirror2 = '>' - AndroidCharacter.getMirror('0');
            byte[] bArr38 = $$a;
            byte b22 = (byte) (bArr38[36] - 1);
            byte b23 = bArr38[24];
            Object[] objArr104 = new Object[1];
            e(b22, b23, (short) (b23 | 209), objArr104);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault53 = initSession.b(minimumFlingVelocity2, scrollBarSize2, mirror2, -477065106, false, (String) objArr104[0], null);
        }
        long j6 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault53).getLong(null);
        long jLongValue14 = ((Long) Class.forName(str6).getDeclaredMethod(str2, new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault54 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(559617152);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault54 == null) {
            char cKeyCodeFromString = (char) (37567 - KeyEvent.keyCodeFromString(""));
            int iIndexOf9 = TextUtils.indexOf((CharSequence) "", '0') + 626;
            int iMyPid3 = (Process.myPid() >> 22) + 14;
            Object[] objArr105 = new Object[1];
            e($$a[27], (byte) 52, (short) ($$b & 367), objArr105);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault54 = initSession.b(cKeyCodeFromString, iIndexOf9, iMyPid3, -976899241, false, (String) objArr105[0], null);
        }
        if (j6 == ((jLongValue14 - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault54).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault55 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(560540673);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault55 == null) {
                char gidForName = (char) (37566 - Process.getGidForName(""));
                int deadChar3 = KeyEvent.getDeadChar(0, 0) + 625;
                int pressedStateDuration5 = 14 - (ViewConfiguration.getPressedStateDuration() >> 16);
                byte[] bArr39 = $$a;
                Object[] objArr106 = new Object[1];
                e(bArr39[27], (byte) 52, (short) (-bArr39[17]), objArr106);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault55 = initSession.b(gidForName, deadChar3, pressedStateDuration5, -973632554, false, (String) objArr106[0], null);
            }
            Object[] objArr107 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault55).get(null);
            int i217 = ((int[]) objArr107[2])[0];
            int i218 = ((int[]) objArr107[0])[0];
            String[] strArr13 = (String[]) objArr107[3];
            int[] iArr8 = {i217};
            int iIdentityHashCode13 = System.identityHashCode(this);
            int i219 = ~iIdentityHashCode13;
            int i220 = (((656245128 + (((~(838669884 | i219)) | 167960768) * 184)) + ((iIdentityHashCode13 | 21562416) * (-184))) + ((~((-985068237) | i219)) * 184)) - 590348000;
            int i221 = (i220 << 13) ^ i220;
            int i222 = i221 ^ (i221 >>> 17);
            ((int[]) objArr10[1])[0] = i222 ^ (i222 << 5);
            objArr10 = new Object[]{new int[]{i218}, new int[1], iArr8, strArr13};
            str3 = str9;
        } else {
            if (p0 == null) {
                obj = null;
                applicationContext = p0;
            } else if (p0 instanceof ContextWrapper) {
                int i223 = INotificationSideChannel + 65;
                cancelAll = i223 % 128;
                if (i223 % 2 == 0) {
                    ((ContextWrapper) p0).getBaseContext();
                    Object obj3 = null;
                    obj3.hashCode();
                    throw null;
                }
                if (((ContextWrapper) p0).getBaseContext() != null) {
                    obj = null;
                    applicationContext = p0.getApplicationContext();
                } else {
                    obj = null;
                    applicationContext = null;
                }
            } else {
                obj = null;
                applicationContext = p0.getApplicationContext();
            }
            str3 = str9;
            int iIntValue3 = ((Integer) Class.forName(str8).getMethod(str3, Object.class).invoke(obj, this)).intValue();
            Object[] objArr108 = new Object[1];
            c(new int[]{173351706, 1067829024, -27310142, -872699834, -1058084733, -925008975, -1678606242, -190771974, -543363017, -398628230, -777495411, -1357685578, 45244855, 423564436, -667538931, 259312075, -2064134820, -111358447, 971918118, -166215136, 293970904, 1980011591, -463954673, 1940977329, -1462372155, 944218655, 1268695805, 1232062102, -1657741138, -1365986721, -479958019, 1364206257, -2123052590, 557455586}, 64 - TextUtils.indexOf("", ""), objArr108);
            String str16 = (String) objArr108[0];
            Object[] objArr109 = new Object[1];
            c(new int[]{-1401254843, -1178729697, 352588148, -1581704554, 1408229918, -578173504, -1222838924, 1990579276, 1547657590, 819955537, -1983901907, 1071909869, -1183330526, 2063756184, 1403982586, 288812160, 1856216853, -1667155705, 338761714, -1933673445, -475490335, 1348244269, -1274175450, -1044686455, -1559949935, 1807997713, 1132256416, 1825287613, -2001132780, -421657714, -414697837, -1440478840, -1182628997, 432282160}, TextUtils.indexOf("", "", 0) + 64, objArr109);
            Object[] objArr110 = {applicationContext, new String[]{str16, (String) objArr109[0]}, Integer.valueOf(iIntValue3), 17, -590348000};
            byte[] bArr40 = $$d;
            Object[] objArr111 = new Object[1];
            f(bArr40[198], (short) 91, bArr40[15], objArr111);
            Class<?> cls6 = Class.forName((String) objArr111[0]);
            byte b24 = (byte) (-bArr40[21]);
            Object[] objArr112 = new Object[1];
            f(b24, b24, bArr40[5], objArr112);
            Object[] objArr113 = (Object[]) cls6.getMethod((String) objArr112[0], Context.class, String[].class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr110);
            int i224 = ((int[]) objArr113[0])[0];
            int i225 = ((int[]) objArr113[2])[0];
            if (applicationContext != null) {
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault56 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(560540673);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault56 == null) {
                    char c11 = (char) (37568 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)));
                    int threadPriority5 = ((Process.getThreadPriority(0) + 20) >> 6) + 625;
                    int iResolveOpacity2 = Drawable.resolveOpacity(0, 0) + 14;
                    byte[] bArr41 = $$a;
                    Object[] objArr114 = new Object[1];
                    e(bArr41[27], (byte) 52, (short) (-bArr41[17]), objArr114);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault56 = initSession.b(c11, threadPriority5, iResolveOpacity2, -973632554, false, (String) objArr114[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault56).set(null, objArr113);
                try {
                    long jLongValue15 = ((Long) Class.forName(str6).getDeclaredMethod(str2, new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf17 = Long.valueOf(jLongValue15);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault57 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(559617152);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault57 == null) {
                        char cAlpha2 = (char) (Color.alpha(0) + 37567);
                        int iAlpha3 = 625 - Color.alpha(0);
                        int iIndexOf10 = TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 15;
                        Object[] objArr115 = new Object[1];
                        e($$a[27], (byte) 52, (short) ($$b & 367), objArr115);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault57 = initSession.b(cAlpha2, iAlpha3, iIndexOf10, -976899241, false, (String) objArr115[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault57).set(null, lValueOf17);
                    Long lValueOf18 = Long.valueOf(jLongValue15 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault58 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(118372281);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault58 == null) {
                        char c12 = (char) (37567 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)));
                        int jumpTapTimeout4 = (ViewConfiguration.getJumpTapTimeout() >> 16) + 625;
                        int i226 = (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 13;
                        byte[] bArr42 = $$a;
                        byte b25 = (byte) (bArr42[36] - 1);
                        byte b26 = bArr42[24];
                        Object[] objArr116 = new Object[1];
                        e(b25, b26, (short) (b26 | 209), objArr116);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault58 = initSession.b(c12, jumpTapTimeout4, i226, -477065106, false, (String) objArr116[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault58).set(null, lValueOf18);
                } catch (Exception unused9) {
                    throw new RuntimeException();
                }
            } else {
                objArr113 = objArr113;
            }
            objArr10 = objArr113;
        }
        int i227 = ((int[]) objArr10[0])[0];
        int i228 = ((int[]) objArr10[2])[0];
        if (i228 == i227) {
            int i229 = ((int[]) objArr10[1])[0];
            int i230 = ((int[]) objArr10[2])[0];
            int i231 = ((int[]) objArr10[0])[0];
            String[] strArr14 = (String[]) objArr10[3];
            int iIdentityHashCode14 = System.identityHashCode(this);
            int i232 = i229 + 213563058 + (((~((~iIdentityHashCode14) | 605480620)) | (-1822418685)) * 529) + (((~(iIdentityHashCode14 | 605480620)) | (-1218257501)) * 529);
            int i233 = (i232 << 13) ^ i232;
            int i234 = i233 ^ (i233 >>> 17);
            ((int[]) objArr[1])[0] = i234 ^ (i234 << 5);
            Object[] objArr117 = {new int[]{i231}, new int[1], new int[]{i230}, strArr14};
            i3 = 0;
        } else {
            ArrayList arrayList7 = new ArrayList();
            String[] strArr15 = (String[]) objArr10[3];
            if (strArr15 != null) {
                for (String str17 : strArr15) {
                    arrayList7.add(str17);
                }
            }
            int[] iArr9 = new int[i228];
            int i235 = i228 - 1;
            iArr9[i235] = 1;
            Toast.makeText((Context) null, iArr9[((i228 * i235) % 2) - 1], 1).show();
            int i236 = ((int[]) objArr10[1])[0];
            int i237 = ((int[]) objArr10[2])[0];
            int i238 = ((int[]) objArr10[0])[0];
            String[] strArr16 = (String[]) objArr10[3];
            int[] iArr10 = {i237};
            int iIdentityHashCode15 = System.identityHashCode(this);
            int i239 = ~iIdentityHashCode15;
            int i240 = (~((-1142313661) | i239)) | 1140998320 | (~(681424460 | i239));
            int i241 = i236 + (-1129540824) + (((~(iIdentityHashCode15 | (-680109121))) | i240) * 590) + (i240 * (-1180)) + (((~((-681424461) | i239)) | (~(i239 | 1142313660))) * 590);
            int i242 = (i241 << 13) ^ i241;
            int i243 = i242 ^ (i242 >>> 17);
            i3 = 0;
            ((int[]) objArr[1])[0] = i243 ^ (i243 << 5);
            Object[] objArr118 = {new int[]{i238}, new int[1], iArr10, strArr16};
        }
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault59 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault59 == null) {
            char absoluteGravity3 = (char) (Gravity.getAbsoluteGravity(i3, i3) + 31533);
            int maximumFlingVelocity3 = (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 921;
            int i244 = 28 - (TypedValue.complexToFloat(i3) > 0.0f ? 1 : (TypedValue.complexToFloat(i3) == 0.0f ? 0 : -1));
            byte[] bArr43 = $$a;
            byte b27 = (byte) (bArr43[36] - 1);
            byte b28 = bArr43[24];
            Object[] objArr119 = new Object[1];
            e(b27, b28, (short) (b28 | 209), objArr119);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault59 = initSession.b(absoluteGravity3, maximumFlingVelocity3, i244, -1048449946, false, (String) objArr119[0], null);
        }
        if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault59).getLong(null) != -1) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault60 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault60 == null) {
                char trimmedLength6 = (char) (31533 - TextUtils.getTrimmedLength(""));
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0) + 921;
                int tapTimeout2 = (ViewConfiguration.getTapTimeout() >> 16) + 28;
                byte[] bArr44 = $$a;
                Object[] objArr120 = new Object[1];
                e(bArr44[27], (byte) (bArr44[15] - 1), (short) 68, objArr120);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault60 = initSession.b(trimmedLength6, iMakeMeasureSpec, tapTimeout2, -1142834547, false, (String) objArr120[0], null);
            }
            Object[] objArr121 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault60).get(null);
            objArr11 = new Object[]{new int[1], new int[]{((int[]) objArr121[1])[0]}, (Object[]) objArr121[2], new int[]{((int[]) objArr121[3])[0]}, (String[]) objArr121[4]};
            int iNextInt = new Random().nextInt();
            int i245 = (-893950133) + (((~((-715295772) | iNextInt)) | 704806912) * 1504) + ((~(iNextInt | (-10488860))) * (-1504)) + 146086833;
            int i246 = (i245 << 13) ^ i245;
            int i247 = i246 ^ (i246 >>> 17);
            ((int[]) objArr11[0])[0] = i247 ^ (i247 << 5);
        } else {
            Object[] objArr122 = {p0 != null ? ((p0 instanceof ContextWrapper) && ((ContextWrapper) p0).getBaseContext() == null) ? null : p0.getApplicationContext() : p0, Integer.valueOf(((Integer) Class.forName(str8).getMethod(str3, Object.class).invoke(null, this)).intValue()), 0, 945697889};
            byte[] bArr45 = $$d;
            Object[] objArr123 = new Object[1];
            f((byte) (bArr45[281] + 1), bArr45[5], bArr45[15], objArr123);
            Class<?> cls7 = Class.forName((String) objArr123[0]);
            byte b29 = bArr45[5];
            Object[] objArr124 = new Object[1];
            f(b29, (short) (b29 | 443), bArr45[4], objArr124);
            Object[] objArr125 = (Object[]) cls7.getMethod((String) objArr124[0], Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr122);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault61 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault61 == null) {
                char size2 = (char) (View.MeasureSpec.getSize(0) + 31533);
                int iNormalizeMetaState2 = KeyEvent.normalizeMetaState(0) + 921;
                int deadChar4 = 28 - KeyEvent.getDeadChar(0, 0);
                byte[] bArr46 = $$a;
                Object[] objArr126 = new Object[1];
                e(bArr46[27], (byte) (bArr46[15] - 1), (short) 68, objArr126);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault61 = initSession.b(size2, iNormalizeMetaState2, deadChar4, -1142834547, false, (String) objArr126[0], null);
            }
            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault61).set(null, objArr125);
            try {
                long jLongValue16 = ((Long) Class.forName(str6).getDeclaredMethod(str2, new Class[0]).invoke(null, new Object[0])).longValue();
                Long lValueOf19 = Long.valueOf(jLongValue16);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault62 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(889369593);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault62 == null) {
                    char c13 = (char) ((AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 31533);
                    int tapTimeout3 = (ViewConfiguration.getTapTimeout() >> 16) + 921;
                    int i248 = (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 28;
                    byte[] bArr47 = $$a;
                    Object[] objArr127 = new Object[1];
                    e(bArr47[27], (byte) 52, (short) (-bArr47[17]), objArr127);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault62 = initSession.b(c13, tapTimeout3, i248, -778300370, false, (String) objArr127[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault62).set(null, lValueOf19);
                Long lValueOf20 = Long.valueOf(jLongValue16 >> 12);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault63 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault63 == null) {
                    char trimmedLength7 = (char) (31533 - TextUtils.getTrimmedLength(""));
                    int mirror3 = 969 - AndroidCharacter.getMirror('0');
                    int i249 = (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 27;
                    byte[] bArr48 = $$a;
                    byte b30 = (byte) (bArr48[36] - 1);
                    byte b31 = bArr48[24];
                    Object[] objArr128 = new Object[1];
                    e(b30, b31, (short) (b31 | 209), objArr128);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault63 = initSession.b(trimmedLength7, mirror3, i249, -1048449946, false, (String) objArr128[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault63).set(null, lValueOf20);
                objArr11 = objArr125;
            } catch (Exception unused10) {
                throw new RuntimeException();
            }
        }
        if (((int[]) objArr11[3])[0] != ((int[]) objArr11[1])[0]) {
            ArrayList arrayList8 = new ArrayList();
            String[] strArr17 = (String[]) objArr11[4];
            if (strArr17 != null) {
                for (String str18 : strArr17) {
                    int i250 = cancelAll + 109;
                    INotificationSideChannel = i250 % 128;
                    int i251 = i250 % 2;
                    arrayList8.add(str18);
                }
            }
            throw null;
        }
        int i252 = ((int[]) objArr11[0])[0];
        Object[] objArr129 = {new int[1], new int[]{((int[]) objArr11[1])[0]}, (Object[]) objArr11[2], new int[]{((int[]) objArr11[3])[0]}, (String[]) objArr11[4]};
        int iIdentityHashCode16 = System.identityHashCode(this);
        int i253 = ~iIdentityHashCode16;
        int i254 = i252 + (((~((-790206284) | i253)) | (~((-983873361) | iIdentityHashCode16)) | (~(i253 | 983873360))) * 959) + 294107546 + (((~(iIdentityHashCode16 | 983873360)) | (~(i253 | (-983873361))) | (~((-790206284) | iIdentityHashCode16))) * 959);
        int i255 = (i254 << 13) ^ i254;
        int i256 = i255 ^ (i255 >>> 17);
        ((int[]) objArr129[0])[0] = i256 ^ (i256 << 5);
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault64 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1309309962);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault64 == null) {
            char jumpTapTimeout5 = (char) ((ViewConfiguration.getJumpTapTimeout() >> 16) + 53893);
            int iResolveOpacity3 = Drawable.resolveOpacity(0, 0) + 1320;
            int threadPriority6 = 36 - ((Process.getThreadPriority(0) + 20) >> 6);
            byte[] bArr49 = $$a;
            byte b32 = (byte) (bArr49[36] - 1);
            byte b33 = bArr49[24];
            Object[] objArr130 = new Object[1];
            e(b32, b33, (short) (b33 | 209), objArr130);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault64 = initSession.b(jumpTapTimeout5, iResolveOpacity3, threadPriority6, -1433084963, false, (String) objArr130[0], null);
        }
        if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault64).getLong(null) != -1) {
            int i257 = cancelAll + 7;
            INotificationSideChannel = i257 % 128;
            int i258 = i257 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault65 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1763547602);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault65 == null) {
                char maximumDrawingCacheSize3 = (char) (53893 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24));
                int iIndexOf11 = TextUtils.indexOf("", "") + 1320;
                int packedPositionGroup3 = ExpandableListView.getPackedPositionGroup(0L) + 36;
                byte[] bArr50 = $$a;
                Object[] objArr131 = new Object[1];
                e(bArr50[27], (byte) 52, (short) (-bArr50[17]), objArr131);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault65 = initSession.b(maximumDrawingCacheSize3, iIndexOf11, packedPositionGroup3, -1920778747, false, (String) objArr131[0], null);
            }
            Object[] objArr132 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault65).get(null);
            objArr12 = new Object[]{new int[]{i}, new int[1], strArr, new int[]{i}};
            int i259 = ((int[]) objArr132[0])[0];
            int i260 = ((int[]) objArr132[3])[0];
            String[] strArr18 = (String[]) objArr132[2];
            int iUptimeMillis = (int) SystemClock.uptimeMillis();
            int i261 = (((((~((-797449022) | iUptimeMillis)) | 226498572) * (-566)) + 719800696) + ((~(iUptimeMillis | (-570950450))) * 566)) - 1515685643;
            int i262 = (i261 << 13) ^ i261;
            int i263 = i262 ^ (i262 >>> 17);
            ((int[]) objArr12[1])[0] = i263 ^ (i263 << 5);
        } else {
            if (p0 != null) {
                int i264 = cancelAll + 9;
                INotificationSideChannel = i264 % 128;
                int i265 = i264 % 2;
                applicationContext2 = ((p0 instanceof ContextWrapper) && ((ContextWrapper) p0).getBaseContext() == null) ? null : p0.getApplicationContext();
            } else {
                applicationContext2 = p0;
            }
            int iIntValue4 = ((Integer) Class.forName(str8).getMethod(str3, Object.class).invoke(null, this)).intValue();
            Object[] objArr133 = {-1694137346};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault66 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(41341784);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault66 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault66 = initSession.b((char) (MotionEvent.axisFromString("") + 47978), 1300 - TextUtils.indexOf("", ""), (ViewConfiguration.getPressedStateDuration() >> 16) + 20, -420973425, false, null, new Class[]{Integer.TYPE});
            }
            Object[] objArr134 = {applicationContext2, "com.bpjstku", -1515685643, Integer.valueOf(iIntValue4), 643, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault66).newInstance(objArr133), false};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault67 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-733829592);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault67 == null) {
                char cIndexOf3 = (char) (53892 - TextUtils.indexOf((CharSequence) "", '0', 0, 0));
                int iRgb6 = Color.rgb(0, 0, 0) + 16778536;
                int longPressTimeout4 = 36 - (ViewConfiguration.getLongPressTimeout() >> 16);
                byte[] bArr51 = $$a;
                Object[] objArr135 = new Object[1];
                e(bArr51[27], (byte) 52, (short) (-bArr51[17]), objArr135);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault67 = initSession.b(cIndexOf3, iRgb6, longPressTimeout4, 819724799, false, (String) objArr135[0], new Class[]{Context.class, String.class, Integer.TYPE, Integer.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) ((ViewConfiguration.getMaximumFlingVelocity() >> 16) + 57878), View.MeasureSpec.getSize(0) + 1394, (ViewConfiguration.getJumpTapTimeout() >> 16) + 75), Boolean.TYPE});
            }
            objArr12 = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault67).invoke(null, objArr134);
            if (applicationContext2 != null) {
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault68 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1763547602);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault68 == null) {
                    char cIndexOf4 = (char) (53893 - TextUtils.indexOf("", ""));
                    int iIndexOf12 = 1319 - TextUtils.indexOf((CharSequence) "", '0');
                    int keyRepeatDelay2 = (ViewConfiguration.getKeyRepeatDelay() >> 16) + 36;
                    byte[] bArr52 = $$a;
                    Object[] objArr136 = new Object[1];
                    e(bArr52[27], (byte) 52, (short) (-bArr52[17]), objArr136);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault68 = initSession.b(cIndexOf4, iIndexOf12, keyRepeatDelay2, -1920778747, false, (String) objArr136[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault68).set(null, objArr12);
                try {
                    long jLongValue17 = ((Long) Class.forName(str6).getDeclaredMethod(str2, new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf21 = Long.valueOf(jLongValue17);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault69 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1351245985);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault69 == null) {
                        char c14 = (char) (53893 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)));
                        int iAlpha4 = 1320 - Color.alpha(0);
                        int size3 = View.MeasureSpec.getSize(0) + 36;
                        byte[] bArr53 = $$a;
                        Object[] objArr137 = new Object[1];
                        e(bArr53[27], (byte) (bArr53[15] - 1), (short) 68, objArr137);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault69 = initSession.b(c14, iAlpha4, size3, -1273706634, false, (String) objArr137[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault69).set(null, lValueOf21);
                    Long lValueOf22 = Long.valueOf(jLongValue17 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault70 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1309309962);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault70 == null) {
                        char cResolveSize = (char) (53893 - View.resolveSize(0, 0));
                        int threadPriority7 = ((Process.getThreadPriority(0) + 20) >> 6) + 1320;
                        int modifierMetaStateMask3 = ((byte) KeyEvent.getModifierMetaStateMask()) + 37;
                        byte[] bArr54 = $$a;
                        byte b34 = (byte) (bArr54[36] - 1);
                        byte b35 = bArr54[24];
                        Object[] objArr138 = new Object[1];
                        e(b34, b35, (short) (b35 | 209), objArr138);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault70 = initSession.b(cResolveSize, threadPriority7, modifierMetaStateMask3, -1433084963, false, (String) objArr138[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault70).set(null, lValueOf22);
                } catch (Exception unused11) {
                    throw new RuntimeException();
                }
            }
        }
        int i266 = ((int[]) objArr12[3])[0];
        int i267 = ((int[]) objArr12[0])[0];
        if (i267 != i266) {
            throw new RuntimeException(String.valueOf(i267));
        }
        Object[] objArr139 = {new int[]{i}, new int[1], strArr, new int[]{i}};
        int i268 = ((int[]) objArr12[1])[0];
        int i269 = ((int[]) objArr12[0])[0];
        int i270 = ((int[]) objArr12[3])[0];
        String[] strArr19 = (String[]) objArr12[2];
        int iUptimeMillis2 = (int) SystemClock.uptimeMillis();
        int i271 = ~iUptimeMillis2;
        int i272 = i268 + 522733851 + (((~(i271 | 1263996903)) | (-1331630064) | (~((-38997762) | iUptimeMillis2))) * 717) + (((~(iUptimeMillis2 | 1263996903)) | (~(i271 | (-38997762))) | (-1331630064)) * 717);
        int i273 = (i272 << 13) ^ i272;
        int i274 = i273 ^ (i273 >>> 17);
        ((int[]) objArr139[1])[0] = i274 ^ (i274 << 5);
        if (activeNetworkInfo == 0 || !activeNetworkInfo.isConnected()) {
            this = this;
            networkInfo = new NetworkInfo(NetworkInfo.Connectivity.NETWORK_NOT_CONNECTED, null, null, null, null, null, null, 126, null);
        } else {
            if (activeNetworkInfo.getType() == 1) {
                networkInfo = new NetworkInfo(NetworkInfo.Connectivity.NETWORK_WIFI, null, null, null, null, null, null, 126, null);
            } else if (activeNetworkInfo.getType() == 9) {
                networkInfo = new NetworkInfo(NetworkInfo.Connectivity.NETWORK_ETHERNET, null, null, null, null, null, null, 126, null);
            } else if (g.contains(Integer.valueOf(activeNetworkInfo.getType()))) {
                int subtype = activeNetworkInfo.getSubtype();
                if (TuitionPaymentFragmentspecialinlinedviewModeldefault1.contains(Integer.valueOf(subtype))) {
                    int i275 = cancelAll + 123;
                    INotificationSideChannel = i275 % 128;
                    if (i275 % 2 != 0) {
                        NetworkInfo.Connectivity connectivity2 = NetworkInfo.Connectivity.NETWORK_2G;
                        throw null;
                    }
                    connectivity = NetworkInfo.Connectivity.NETWORK_2G;
                } else if (TuitionPaymentFragmentbindingInflater1.contains(Integer.valueOf(subtype))) {
                    connectivity = NetworkInfo.Connectivity.NETWORK_3G;
                } else if (TuitionPaymentFragmentspecialinlinedviewModeldefault2.contains(Integer.valueOf(subtype))) {
                    connectivity = NetworkInfo.Connectivity.NETWORK_4G;
                } else {
                    connectivity = asBinder.contains(Integer.valueOf(subtype)) ? NetworkInfo.Connectivity.NETWORK_5G : NetworkInfo.Connectivity.NETWORK_MOBILE_OTHER;
                }
                NetworkInfo.Connectivity connectivity3 = connectivity;
                switch (subtype) {
                    case 1:
                        str4 = "GPRS";
                        str5 = str4;
                        break;
                    case 2:
                        str4 = "Edge";
                        str5 = str4;
                        break;
                    case 3:
                        str4 = "UMTS";
                        str5 = str4;
                        break;
                    case 4:
                        str4 = "CDMA";
                        str5 = str4;
                        break;
                    case 5:
                        str4 = "CDMAEVDORev0";
                        str5 = str4;
                        break;
                    case 6:
                        str4 = "CDMAEVDORevA";
                        str5 = str4;
                        break;
                    case 7:
                        str4 = "CDMA1x";
                        str5 = str4;
                        break;
                    case 8:
                        str4 = "HSDPA";
                        str5 = str4;
                        break;
                    case 9:
                        str4 = "HSUPA";
                        str5 = str4;
                        break;
                    case 10:
                        str4 = "HSPA";
                        str5 = str4;
                        break;
                    case 11:
                        str4 = "iDen";
                        str5 = str4;
                        break;
                    case 12:
                        str4 = "CDMAEVDORevB";
                        str5 = str4;
                        break;
                    case 13:
                        str4 = "LTE";
                        str5 = str4;
                        break;
                    case 14:
                        str4 = "eHRPD";
                        str5 = str4;
                        break;
                    case 15:
                        str4 = "HSPA+";
                        str5 = str4;
                        break;
                    case 16:
                        str4 = "GSM";
                        str5 = str4;
                        break;
                    case 17:
                        str4 = "TD_SCDMA";
                        str5 = str4;
                        break;
                    case 18:
                        str4 = "IWLAN";
                        str5 = str4;
                        break;
                    case 19:
                        str4 = "LTE_CA";
                        str5 = str4;
                        break;
                    case 20:
                        str4 = "New Radio";
                        str5 = str4;
                        break;
                    default:
                        str5 = null;
                        break;
                }
                if (this.b.b() >= 28) {
                    Object systemService2 = p0.getSystemService(HintConstants.AUTOFILL_HINT_PHONE);
                    TelephonyManager telephonyManager = systemService2 instanceof TelephonyManager ? (TelephonyManager) systemService2 : null;
                    if (telephonyManager == null || (simCarrierIdName = telephonyManager.getSimCarrierIdName()) == null) {
                    }
                    networkInfo = new NetworkInfo(connectivity3, simCarrierIdName.toString(), telephonyManager != null ? Long.valueOf(telephonyManager.getSimCarrierId()) : null, null, null, null, str5, 56, null);
                } else {
                    networkInfo = new NetworkInfo(connectivity3, null, null, null, null, null, str5, 62, null);
                }
            } else {
                this = this;
                networkInfo = new NetworkInfo(NetworkInfo.Connectivity.NETWORK_OTHER, null, null, null, null, null, null, 126, null);
            }
            this = this;
        }
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = networkInfo;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault3(networkInfo);
    }

    @Override // defpackage.setFlashType
    public final void b(Context p0) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(p0, "");
        onReceive(p0, TuitionPaymentFragmentspecialinlinedviewModeldefault2(p0, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE")));
        int i2 = INotificationSideChannel + 69;
        cancelAll = i2 % 128;
        if (i2 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // defpackage.setFlashType
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault3(Context p0) {
        int i = 2 % 2;
        int i2 = cancelAll + 59;
        INotificationSideChannel = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(p0, "");
            TuitionPaymentFragmentbindingInflater1(p0);
        } else {
            Intrinsics.checkNotNullParameter(p0, "");
            TuitionPaymentFragmentbindingInflater1(p0);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    @Override // defpackage.setFlashType
    /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1 */
    public final NetworkInfo getTuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        int i = 2 % 2;
        int i2 = cancelAll + 83;
        INotificationSideChannel = i2 % 128;
        if (i2 % 2 == 0) {
            return this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static {
        byte[] bArr = new byte[544];
        System.arraycopy("]\u0086éè\u000e\u0000Ã;\n\u0002ú\u0007ûË5\u000fø\u0010ÿüýÌAö\u0015ó\u000fùú\rÄ5\u0011\u0002ô\u0001\u0013¾\u001c\u001fþ\u0005\u0003\u000fÒ%\u0005û\u0017õ\b\u0005\u0004ý\u0002\u0001\u0005\u0004Ó5þ\u0000ñí\u001b\u0013ñ\tÉ\u0012.\u0001ú\u0005\u0000\u0010ÿñ\u0015÷\b\u0001\u0007â\u0010\u000e\b\u0004ûûß#\u0013õü\u0004#ö\r÷\b\u0001ä\u0013\u001aöú\u000b\bÔ.ñ\b\bú\u000b\b\u0001ÿ÷\u0000\bú\rÿ\u0007\u0000ÿ\u0007ù\u0001\u0014õþ\u0014Ø$÷\u0003\tú\u0003\u0003ý\u0016ù\nÀ\u000e\u0000Ã;\n\u0002ú\u0007ûË5\u000fø\u0010ÿüýÌ;\b\b½5\u0016\u0001öÈ5\u0011ûÇ=ý\u0003\u000b\b÷\r\u0007·\u0016%\u0004\u0004\u0007ç\u0018\u0000\tÝ'æ\u0015\u000e\u0006ò\u0010\u0003².\u0013\u0014\u0002úü\u0016Ó+þ\u0001æ\u0015\u000e\u0006ò\u0010\u0003Ý#\u0006÷\b\u0001\u0007³ 5ö\u0005ú\u0003\u000f\u000e\u0000Ã;\n\u0002ú\u0007ûË5\u000fø\u0010ÿüýÌAö\u0015ó\u000fùú\rÄ=\u0007\bó\u000fþõ\rÄ(\u0013\u0015þÒ0ñ\u0018ì\u0003\fûå\u001f\t\u0006÷\u000f´\u000f#ö\r÷\b\u0001ä\u0013\u001aöú\u000b\bÔ.ñ\b\bú\u000b\b\u0001ÿ÷\u0000\bú\rÿ\u0007\u0000ÿ\u0007ù\u0001\u0014õþ\u0014Ø$÷\u0003\tú\u0003\u0003ý\u0016ù\nÁ\u000e\u0000Ã;\n\u0002ú\u0007ûË5\u000fø\u0010ÿüýÌAö\u0015ó\u000fùú\rÄ8ÿ\u0015ó\rûü\nü\u000f¾!\u0016\u0015ó\u000fùú\rÙ \rû\u000bøÿ\u0013´\u0016\u000e\u0000Ã5\u0011\u0002\u0005õ\b\u000fî\u000f¾=\u0007\bó\u000fþõ\rÄ\u0015\u0007!ÎKÛó\tÛ\u001f\u0007\u001dÒJÜó\t#ö\r÷\b\u0001ä\u0013\u001aöú\u000b\bÔ.ñ\b\bú\u000b\b\u0001ÿ÷\u0000\bú\rÿ\u0007\u0000ÿ\u0007ù\u0001\u0014õþ\u0014Ø$÷\u0003\tú\u0003\u0003ý\u0016ù\n¿\u000e\u0000Ã;\n\u0002ú\u0007ûË5\u000fø\u0010ÿüýÌ@ÿû\u0012ñ\u0013ùþ\u0010½Dþ÷\u0004\u0004\u0010½5\u0011ûÇA\u0004÷\u0003\tÄN\u0002ë\u0011".getBytes("ISO-8859-1"), 0, bArr, 0, 544);
        $$d = bArr;
        $$e = 70;
        $$a = new byte[]{49, 89, 41, 48, -29, 31, -48, -17, 4, -24, 1, -6, -13, -13, -29, 38, -50, -16, -1, -12, -24, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 54, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, 7, -18, -16, -1, -16, -16, -4, 19, -48, -3, -17, 0, -30, 4, -24, 54, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 55, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 56};
        $$b = 249;
        INotificationSideChannel = 0;
        cancelAll = 1;
        cancel = 0;
        onTransact = 1;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        INSTANCE = new Companion(null);
        g = SetsKt.setOf((Object[]) new Integer[]{0, 4, 5, 2, 3});
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = SetsKt.setOf((Object[]) new Integer[]{1, 2, 4, 7, 11, 16});
        TuitionPaymentFragmentbindingInflater1 = SetsKt.setOf((Object[]) new Integer[]{3, 5, 6, 8, 9, 10, 12, 14, 15, 17});
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = SetsKt.setOf((Object[]) new Integer[]{13, 18, 19});
        asBinder = SetsKt.setOf(20);
        int i = onTransact + 11;
        cancel = i % 128;
        int i2 = i % 2;
    }

    static void TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        notify = new int[]{-856189578, 910668712, -158274638, 1073167367, 610486091, -1643063777, -1150956091, -1695878176, 1148045045, -1899892604, -387853106, 1900318441, 361328915, 589375839, 193570870, -1376279819, -670425921, 188941456};
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0022  */
    /* JADX WARN: Code duplicated, block: B:8:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:11:0x0026). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0022
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$g(byte r5, byte r6, int r7) {
        /*
            int r7 = r7 * 2
            int r7 = 4 - r7
            int r6 = r6 * 56
            int r6 = r6 + 66
            int r5 = r5 * 4
            int r0 = r5 + 1
            byte[] r1 = com.datadog.android.core.internal.net.info.BroadcastReceiverNetworkInfoProvider.$$c
            byte[] r0 = new byte[r0]
            r2 = 0
            if (r1 != 0) goto L16
            r4 = r5
            r3 = r2
            goto L26
        L16:
            r3 = r2
        L17:
            byte r4 = (byte) r6
            r0[r3] = r4
            if (r3 != r5) goto L22
            java.lang.String r5 = new java.lang.String
            r5.<init>(r0, r2)
            return r5
        L22:
            r4 = r1[r7]
            int r3 = r3 + 1
        L26:
            int r7 = r7 + 1
            int r6 = r6 + r4
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: com.datadog.android.core.internal.net.info.BroadcastReceiverNetworkInfoProvider.$$g(byte, byte, int):java.lang.String");
    }
}
