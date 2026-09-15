package com.bpjstku.service;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.PointF;
import android.media.AudioAttributes;
import android.media.AudioTrack;
import android.media.RingtoneManager;
import android.net.Uri;
import android.os.Build;
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
import androidx.core.app.NotificationCompat;
import com.bpjstku.R;
import com.bpjstku.data.lib.PreferenceManager;
import com.bpjstku.presentation.notification.NotificationActivity;
import com.bpjstku.service.BpjstkuFirebaseMessagingService;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.messaging.FirebaseMessaging;
import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.RemoteMessage;
import defpackage.BufferProviderState;
import defpackage.SessionProcessor;
import defpackage.VideoEncoderSession1;
import defpackage.ZoomGestureDetectorOnZoomGestureListener;
import defpackage.acquireBuffer;
import defpackage.appendBackupVideoProfile;
import defpackage.cacheInteropConfig;
import defpackage.dumpAudioCapabilities;
import defpackage.finalizeWithError;
import defpackage.formatInterval;
import defpackage.generateCameraId;
import defpackage.getContentPaddingRight;
import defpackage.getEventTime;
import defpackage.initSession;
import defpackage.isAssociatedWith;
import defpackage.isSamsungJ2;
import defpackage.lambdatryToProvidePreviewSurface1androidxcameraviewTextureViewImplementation;
import defpackage.logToString;
import defpackage.mapPoint;
import defpackage.onScroll;
import defpackage.registerlambda1;
import defpackage.share;
import defpackage.shouldUseFlashModeTorch;
import defpackage.suspend;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Random;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.Reflection;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\f\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\f\u0010\bJ\u000f\u0010\r\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\r\u0010\u0003R\u0015\u0010\u0011\u001a\u00020\u000e8CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u001b\u0010\u000f\u001a\u00020\u00128CX\u0083\u0084\u0002¢\u0006\f\n\u0004\b\u0011\u0010\u0010\u001a\u0004\b\u0013\u0010\u0014R\u0015\u0010\f\u001a\u00020\u00158CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u0016\u0010\u0010"}, d2 = {"Lcom/bpjstku/service/BpjstkuFirebaseMessagingService;", "Lcom/google/firebase/messaging/FirebaseMessagingService;", "<init>", "()V", "", "p0", "", "onNewToken", "(Ljava/lang/String;)V", "Lcom/google/firebase/messaging/RemoteMessage;", "onMessageReceived", "(Lcom/google/firebase/messaging/RemoteMessage;)V", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "onDestroy", "Lregisterlambda1;", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "Lkotlin/Lazy;", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "Lcom/bpjstku/data/lib/PreferenceManager;", "b", "()Lcom/bpjstku/data/lib/PreferenceManager;", "LacquireBuffer;", "TuitionPaymentFragmentbindingInflater1"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class BpjstkuFirebaseMessagingService extends FirebaseMessagingService {

    /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
    private final Lazy TuitionPaymentFragmentspecialinlinedviewModeldefault2;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
    private final Lazy TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
    private final Lazy TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    private static final byte[] $$c = {88, 99, -94, -58};
    private static final int $$f = ModuleDescriptor.MODULE_VERSION;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$j = {107, 48, 57, 107, 2, -21, 2, -11, -6, -11, -24, 4, -5, -28, 6, 9, -43, -6, 3, -4, -11, -11, 10, -28, -21, -13, 7, -23, -10, 59, -58, -22, 1, -23, -6, -3, -4, -29, 12, -7, -21, -1, -22, 8, -11, -21, -12, 4, -20, -11, -6, 3, -11, -23, -9, 1, -14, -2, 11, -43, -6, 3, -4, -11, -11, 23, -40, -12, -7, 56, -22, -42, 3, -20, 2, -15, -8, 21, -26, -33, 3, -1, -18, -15, 37, -53, 8, -15, -15, -1, -18, -15, 9, -16, -14, 1, -14, -14, -2, 21, -46, -1, -15, 2, -28, 6, -22, 56};
    private static final int $$k = 114;
    private static final byte[] $$a = {68, 104, -93, -37, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -54, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, -7, 18, 16, 1, 16, 16, 4, -19, 48, 3, 17, 0, 30, -4, 24, -54, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -56, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -55};
    private static final int $$b = 68;
    private static int asInterface = 0;
    private static int g = 1;
    private static long b = 826640931188938721L;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault2 = -981105359;
    private static char d = 34097;

    public static /* synthetic */ Object TuitionPaymentFragmentbindingInflater1(Object[] objArr, int i, int i2, int i3, int i4, int i5, int i6) {
        int i7 = ~i4;
        int i8 = ~i5;
        int i9 = ~i3;
        int i10 = (~(i8 | i9)) | i7;
        int i11 = ~(i8 | i4 | i3);
        int i12 = (~(i3 | i4)) | (~(i7 | i9)) | i8;
        int i13 = i5 + i4 + i2 + (62936680 * i) + ((-2032430997) * i6);
        int i14 = i13 * i13;
        int i15 = ((-476632153) * i5) + 797966336 + (1756943451 * i4) + (i10 * (-1030695846)) + ((-1030695846) * i11) + (1030695846 * i12) + ((-1507328000) * i2) + ((-264241152) * i) + ((-222822400) * i6) + (2040594432 * i14);
        int i16 = ((i5 * 1175661207) - 43826732) + (i4 * 1175659659) + (i10 * (-774)) + (i11 * (-774)) + (i12 * 774) + (i2 * 1175660433) + (i * 1188219112) + (i6 * (-816965221)) + (i14 * 1798373376);
        return i15 + ((i16 * i16) * 914292736) != 1 ? TuitionPaymentFragmentspecialinlinedviewModeldefault3(objArr) : TuitionPaymentFragmentspecialinlinedviewModeldefault2(objArr);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0023  */
    /* JADX WARN: Code duplicated, block: B:8:0x001b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0023
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void a(int r6, int r7, int r8, java.lang.Object[] r9) {
        /*
            int r8 = r8 * 14
            int r8 = 98 - r8
            int r7 = 144 - r7
            int r0 = r6 + 1
            byte[] r1 = com.bpjstku.service.BpjstkuFirebaseMessagingService.$$a
            byte[] r0 = new byte[r0]
            r2 = 0
            if (r1 != 0) goto L13
            r4 = r8
            r3 = r2
            r8 = r7
            goto L2a
        L13:
            r3 = r2
        L14:
            int r7 = r7 + 1
            byte r4 = (byte) r8
            r0[r3] = r4
            if (r3 != r6) goto L23
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            r9[r2] = r6
            return
        L23:
            int r3 = r3 + 1
            r4 = r1[r7]
            r5 = r8
            r8 = r7
            r7 = r5
        L2a:
            int r7 = r7 + r4
            int r7 = r7 + (-11)
            r5 = r8
            r8 = r7
            r7 = r5
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.service.BpjstkuFirebaseMessagingService.a(int, int, int, java.lang.Object[]):void");
    }

    private static void e(byte b2, short s, byte b3, Object[] objArr) {
        int i = s * 30;
        int i2 = b3 + 4;
        int i3 = 108 - (b2 * 24);
        byte[] bArr = $$j;
        byte[] bArr2 = new byte[68 - i];
        int i4 = 67 - i;
        int i5 = -1;
        if (bArr == null) {
            i3 = (i2 + (-i3)) - 9;
            i5 = -1;
        }
        while (true) {
            int i6 = i2;
            int i7 = i3;
            int i8 = i5 + 1;
            bArr2[i8] = (byte) i7;
            int i9 = i6 + 1;
            if (i8 == i4) {
                objArr[0] = new String(bArr2, 0);
                return;
            } else {
                i2 = i9;
                i3 = (i7 + (-bArr[i9])) - 9;
                i5 = i8;
            }
        }
    }

    public BpjstkuFirebaseMessagingService() {
        final BpjstkuFirebaseMessagingService bpjstkuFirebaseMessagingService = this;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = LazyKt.lazy(new Function0<registerlambda1>() { // from class: com.bpjstku.service.BpjstkuFirebaseMessagingService$special$$inlined$inject$default$1
            final /* synthetic */ mapPoint $qualifier = null;
            final /* synthetic */ Function0 $parameters = null;

            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, registerlambda1] */
            @Override // kotlin.jvm.functions.Function0
            public final registerlambda1 invoke() {
                ComponentCallbacks componentCallbacks = bpjstkuFirebaseMessagingService;
                return (componentCallbacks instanceof getEventTime ? ((getEventTime) componentCallbacks).getKoin() : ZoomGestureDetectorOnZoomGestureListener.TuitionPaymentFragmentbindingInflater1().b).b.b(Reflection.getOrCreateKotlinClass(registerlambda1.class), this.$qualifier, this.$parameters);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }
        });
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = LazyKt.lazy(new Function0<PreferenceManager>() { // from class: com.bpjstku.service.BpjstkuFirebaseMessagingService$special$$inlined$inject$default$2
            final /* synthetic */ mapPoint $qualifier = null;
            final /* synthetic */ Function0 $parameters = null;

            /* JADX WARN: Type inference failed for: r0v5, types: [com.bpjstku.data.lib.PreferenceManager, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            public final PreferenceManager invoke() {
                ComponentCallbacks componentCallbacks = bpjstkuFirebaseMessagingService;
                return (componentCallbacks instanceof getEventTime ? ((getEventTime) componentCallbacks).getKoin() : ZoomGestureDetectorOnZoomGestureListener.TuitionPaymentFragmentbindingInflater1().b).b.b(Reflection.getOrCreateKotlinClass(PreferenceManager.class), this.$qualifier, this.$parameters);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }
        });
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = LazyKt.lazy(new Function0<acquireBuffer>() { // from class: com.bpjstku.service.BpjstkuFirebaseMessagingService$special$$inlined$inject$default$3
            final /* synthetic */ mapPoint $qualifier = null;
            final /* synthetic */ Function0 $parameters = null;

            /* JADX WARN: Type inference failed for: r0v5, types: [acquireBuffer, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            public final acquireBuffer invoke() {
                ComponentCallbacks componentCallbacks = bpjstkuFirebaseMessagingService;
                return (componentCallbacks instanceof getEventTime ? ((getEventTime) componentCallbacks).getKoin() : ZoomGestureDetectorOnZoomGestureListener.TuitionPaymentFragmentbindingInflater1().b).b.b(Reflection.getOrCreateKotlinClass(acquireBuffer.class), this.$qualifier, this.$parameters);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }
        });
    }

    private static void c(char[] cArr, char[] cArr2, char c, int i, char[] cArr3, Object[] objArr) throws Throwable {
        int i2 = 2;
        int i3 = 2 % 2;
        SessionProcessor sessionProcessor = new SessionProcessor();
        int length = cArr2.length;
        char[] cArr4 = new char[length];
        int length2 = cArr.length;
        char[] cArr5 = new char[length2];
        System.arraycopy(cArr2, 0, cArr4, 0, length);
        System.arraycopy(cArr, 0, cArr5, 0, length2);
        cArr4[0] = (char) (cArr4[0] ^ c);
        cArr5[2] = (char) (cArr5[2] + ((char) i));
        int length3 = cArr3.length;
        char[] cArr6 = new char[length3];
        sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 0;
        int i4 = $11 + 63;
        $10 = i4 % 128;
        int i5 = i4 % 2;
        while (sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2 < length3) {
            int i6 = $11 + 85;
            $10 = i6 % 128;
            int i7 = i6 % i2;
            try {
                Object[] objArr2 = {sessionProcessor};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1033601528);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    byte b2 = (byte) 0;
                    byte b3 = b2;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (8328 - (ViewConfiguration.getKeyRepeatTimeout() >> 16)), 1235 - (ViewConfiguration.getScrollBarSize() >> 8), (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 35, -653973969, false, $$i(b2, b3, b3), new Class[]{Object.class});
                }
                int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).intValue();
                Object[] objArr3 = {sessionProcessor};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1120586870);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                    byte b4 = (byte) 0;
                    byte b5 = (byte) (b4 + 2);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) TextUtils.getCapsMode("", 0, 0), (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 2764, Color.blue(0) + 14, 1504416861, false, $$i(b4, b5, (byte) (b5 - 2)), new Class[]{Object.class});
                }
                int iIntValue2 = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).intValue();
                Object[] objArr4 = {sessionProcessor, Integer.valueOf(cArr4[sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2 % 4] * 32718), Integer.valueOf(cArr5[iIntValue])};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(811618268);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (43325 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24)), (Process.myPid() >> 22) + 253, 22 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), -721491957, false, "j", new Class[]{Object.class, Integer.TYPE, Integer.TYPE});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
                Object[] objArr5 = {Integer.valueOf(cArr4[iIntValue2] * 32718), Integer.valueOf(cArr5[iIntValue])};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1821841887);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    byte b6 = (byte) 0;
                    byte b7 = (byte) (b6 + 1);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (KeyEvent.normalizeMetaState(0) + 65200), 2890 - MotionEvent.axisFromString(""), 18 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), 2012627446, false, $$i(b6, b7, (byte) (b7 - 1)), new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr5[iIntValue2] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).charValue();
                cArr4[iIntValue2] = sessionProcessor.b;
                cArr6[sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2] = (char) (((((long) (cArr4[iIntValue2] ^ cArr3[sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2])) ^ (b ^ (-6377398940819159759L))) ^ ((long) ((int) (((long) TuitionPaymentFragmentspecialinlinedviewModeldefault2) ^ (-6377398940819159759L))))) ^ ((long) ((char) (((long) d) ^ (-6377398940819159759L)))));
                sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2++;
                int i8 = $11 + 63;
                $10 = i8 % 128;
                int i9 = i8 % 2;
                i2 = 2;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        objArr[0] = new String(cArr6);
    }

    /* JADX WARN: Code duplicated, block: B:25:0x02da  */
    /* JADX WARN: Code duplicated, block: B:28:0x02ec  */
    private final PreferenceManager b() throws Throwable {
        Object[] objArr;
        int i = 2 % 2;
        int i2 = g + 89;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char edgeSlop = (char) ((ViewConfiguration.getEdgeSlop() >> 16) + 31533);
            int mode = View.MeasureSpec.getMode(0) + 921;
            int i4 = 29 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1));
            byte b2 = $$a[7];
            byte b3 = b2;
            Object[] objArr2 = new Object[1];
            a(b3, (short) (b3 | 141), b2, objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(edgeSlop, mode, i4, -1048449946, false, (String) objArr2[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr3 = new Object[1];
        c(new char[]{4816, 53717, 15615, 44038}, new char[]{64027, 3809, 49848, 4703}, (char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.mandiri_internet_instruction_step2).substring(4, 5).codePointAt(0) - 32), (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), new char[]{29223, 47641, 50327, 18680, 22132, 23283, 51470, 36708, 8193, 46869, 47183, 36712, 20852, 34137, 23304, 42843, 63839, 61827, 3211, 39640, 25020, 3232}, objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        c(new char[]{4816, 53717, 15615, 44038}, new char[]{45581, 33076, 24915, 54192}, (char) ((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 45152), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.hint_indosat_phone_number).substring(0, 20).codePointAt(12) + 1400976461, new char[]{60283, 31924, 48420, 57435, 64343, 7152, 43395, 2127, 15552, 54071, 18244, 62314, 45931, 25873, 42409}, objArr4);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(889369593);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char touchSlop = (char) ((ViewConfiguration.getTouchSlop() >> 8) + 31533);
            int longPressTimeout = 921 - (ViewConfiguration.getLongPressTimeout() >> 16);
            int i5 = 29 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1));
            Object[] objArr5 = new Object[1];
            a((byte) 52, (short) 141, $$a[80], objArr5);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(touchSlop, longPressTimeout, i5, -778300370, false, (String) objArr5[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char gidForName = (char) (31532 - Process.getGidForName(""));
                int i6 = 922 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1));
                int keyRepeatTimeout = (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 28;
                byte[] bArr = $$a;
                Object[] objArr6 = new Object[1];
                a((byte) (-bArr[3]), (short) 89, bArr[80], objArr6);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(gidForName, i6, keyRepeatTimeout, -1142834547, false, (String) objArr6[0], null);
            }
            Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            objArr = new Object[]{new int[1], new int[]{((int[]) objArr7[1])[0]}, (Object[]) objArr7[2], new int[]{((int[]) objArr7[3])[0]}, (String[]) objArr7[4]};
            int iIdentityHashCode = System.identityHashCode(this);
            int i7 = (((~((~iIdentityHashCode) | (-1093681731))) * 130) - 441154459) + (((~(iIdentityHashCode | (-1093681731))) | 344001561) * 130) + 793130203;
            int i8 = (i7 << 13) ^ i7;
            int i9 = i8 ^ (i8 >>> 17);
            ((int[]) objArr[0])[0] = i9 ^ (i9 << 5);
        } else {
            Context baseContext = getBaseContext();
            if (baseContext == null) {
                Object[] objArr8 = new Object[1];
                c(new char[]{4816, 53717, 15615, 44038}, new char[]{45897, 37910, 55622, 337}, (char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.indosat_instruction_step5).substring(3, 4).length() + 20952), Color.argb(0, 0, 0, 0), new char[]{32586, 19700, 32605, 38770, 9127, 25852, 24052, 43599, 63214, 55090, 5646, 28155, 15042, 39150, 16823, 42232, 60660, 37213, 38394, 61125, 51401, 16521, 24679, 40754, 3021, 43386}, objArr8);
                Class<?> cls2 = Class.forName((String) objArr8[0]);
                Object[] objArr9 = new Object[1];
                c(new char[]{4816, 53717, 15615, 44038}, new char[]{8546, 6714, 33444, 13314}, (char) (TextUtils.indexOf("", "") + 642), ViewConfiguration.getKeyRepeatDelay() >> 16, new char[]{24475, 5406, 56763, 13166, 20539, 35257, 26695, 39539, 33862, 52381, 50987, 7549, 55788, 27851, 28718, 34085, 33168, 17784}, objArr9);
                baseContext = (Context) cls2.getMethod((String) objArr9[0], new Class[0]).invoke(null, null);
            }
            if (baseContext != null) {
                int i10 = g + 57;
                int i11 = i10 % 128;
                asInterface = i11;
                if (i10 % 2 != 0) {
                    int i12 = 5 / 0;
                    if (!(!(baseContext instanceof ContextWrapper))) {
                        int i13 = i11 + 49;
                        g = i13 % 128;
                        int i14 = i13 % 2;
                        if (((ContextWrapper) baseContext).getBaseContext() != null) {
                            int i15 = asInterface + 43;
                            g = i15 % 128;
                            int i16 = i15 % 2;
                            baseContext = null;
                        }
                    }
                } else if (baseContext instanceof ContextWrapper) {
                    int i17 = i11 + 49;
                    g = i17 % 128;
                    int i18 = i17 % 2;
                    if (((ContextWrapper) baseContext).getBaseContext() != null) {
                        int i19 = asInterface + 43;
                        g = i19 % 128;
                        int i110 = i19 % 2;
                        baseContext = null;
                    }
                }
                baseContext = baseContext.getApplicationContext();
                int i20 = g + 7;
                asInterface = i20 % 128;
                int i21 = i20 % 2;
            }
            Object[] objArr10 = new Object[1];
            c(new char[]{4816, 53717, 15615, 44038}, new char[]{10569, 43514, 34819, 19880}, (char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 43108), TextUtils.indexOf("", "", 0, 0), new char[]{46254, 23164, 26302, 9583, 41675, 62099, 17489, 46381, 20501, 39273, 39516, 23126, 51064, 14511, 47846, 30958}, objArr10);
            Class<?> cls3 = Class.forName((String) objArr10[0]);
            Object[] objArr11 = new Object[1];
            c(new char[]{4816, 53717, 15615, 44038}, new char[]{62234, 14406, 18679, 35242}, (char) (43592 - Color.blue(0)), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(2) - 109, new char[]{58667, 29074, 33395, 12179, 59940, 28557, 53220, 10750, 64123, 42676, 22407, 62683, 56342, 1918, 24379, 41233}, objArr11);
            try {
                Object[] objArr12 = {baseContext, Integer.valueOf(((Integer) cls3.getMethod((String) objArr11[0], Object.class).invoke(null, this)).intValue()), 0, 793130203};
                byte[] bArr2 = $$j;
                byte b4 = (byte) (bArr2[32] - 1);
                Object[] objArr13 = new Object[1];
                e(b4, b4, bArr2[41], objArr13);
                Class<?> cls4 = Class.forName((String) objArr13[0]);
                byte b5 = bArr2[32];
                Object[] objArr14 = new Object[1];
                e(b5, b5, (byte) ($$k & 463), objArr14);
                Object[] objArr15 = (Object[]) cls4.getMethod((String) objArr14[0], Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr12);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    char packedPositionType = (char) (ExpandableListView.getPackedPositionType(0L) + 31533);
                    int maximumFlingVelocity = 921 - (ViewConfiguration.getMaximumFlingVelocity() >> 16);
                    int iLastIndexOf = 27 - TextUtils.lastIndexOf("", '0', 0);
                    byte[] bArr3 = $$a;
                    Object[] objArr16 = new Object[1];
                    a((byte) (-bArr3[3]), (short) 89, bArr3[80], objArr16);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(packedPositionType, maximumFlingVelocity, iLastIndexOf, -1142834547, false, (String) objArr16[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr15);
                try {
                    Object[] objArr17 = new Object[1];
                    c(new char[]{4816, 53717, 15615, 44038}, new char[]{64027, 3809, 49848, 4703}, (char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() - 11), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() - 11, new char[]{29223, 47641, 50327, 18680, 22132, 23283, 51470, 36708, 8193, 46869, 47183, 36712, 20852, 34137, 23304, 42843, 63839, 61827, 3211, 39640, 25020, 3232}, objArr17);
                    Class<?> cls5 = Class.forName((String) objArr17[0]);
                    Object[] objArr18 = new Object[1];
                    c(new char[]{4816, 53717, 15615, 44038}, new char[]{45581, 33076, 24915, 54192}, (char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.alfamart_instruction_step1).substring(2, 4).codePointAt(0) + 45037), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.bca_klik).substring(0, 11).length() + 1400976551, new char[]{60283, 31924, 48420, 57435, 64343, 7152, 43395, 2127, 15552, 54071, 18244, 62314, 45931, 25873, 42409}, objArr18);
                    long jLongValue2 = ((Long) cls5.getDeclaredMethod((String) objArr18[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue2);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(889369593);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                        char defaultSize = (char) (31533 - View.getDefaultSize(0, 0));
                        int i22 = (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 920;
                        int threadPriority = ((Process.getThreadPriority(0) + 20) >> 6) + 28;
                        Object[] objArr19 = new Object[1];
                        a((byte) 52, (short) 141, $$a[80], objArr19);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(defaultSize, i22, threadPriority, -778300370, false, (String) objArr19[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                        char cIndexOf = (char) (31532 - TextUtils.indexOf((CharSequence) "", '0', 0, 0));
                        int iIndexOf = 921 - TextUtils.indexOf("", "");
                        int scrollBarSize = 28 - (ViewConfiguration.getScrollBarSize() >> 8);
                        byte b6 = $$a[7];
                        byte b7 = b6;
                        Object[] objArr20 = new Object[1];
                        a(b7, (short) (b7 | 141), b6, objArr20);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(cIndexOf, iIndexOf, scrollBarSize, -1048449946, false, (String) objArr20[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf2);
                    objArr = objArr15;
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
        if (((int[]) objArr[3])[0] != ((int[]) objArr[1])[0]) {
            ArrayList arrayList = new ArrayList();
            String[] strArr = (String[]) objArr[4];
            if (strArr == null) {
                throw null;
            }
            for (String str : strArr) {
                arrayList.add(str);
            }
            throw null;
        }
        int i23 = g + 101;
        asInterface = i23 % 128;
        int i24 = i23 % 2;
        int i25 = ((int[]) objArr[0])[0];
        Object[] objArr21 = {new int[1], new int[]{((int[]) objArr[1])[0]}, (Object[]) objArr[2], new int[]{((int[]) objArr[3])[0]}, (String[]) objArr[4]};
        int i26 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().keyboardHidden;
        int i27 = 21526220 + (((~((~i26) | (-909758901))) | 70877456) * (-245));
        int i28 = ~(i26 | (-909758901));
        int i29 = i25 + i27 + (i28 * (-245)) + ((i28 | 864320743) * 245);
        int i30 = (i29 << 13) ^ i29;
        int i31 = i30 ^ (i30 >>> 17);
        ((int[]) objArr21[0])[0] = i31 ^ (i31 << 5);
        return (PreferenceManager) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue();
    }

    /* JADX WARN: Type inference failed for: r3v3, types: [T, java.lang.String] */
    @Override // com.google.firebase.messaging.FirebaseMessagingService
    public final void onNewToken(final String p0) throws IOException {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(p0, "");
        super.onNewToken(p0);
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = ((registerlambda1) this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        getContentPaddingRight.b bVarB = getContentPaddingRight.b("==fcmtoken");
        Intrinsics.checkExpressionValueIsNotNull(bVarB, "");
        Object obj = objectRef.element;
        StringBuilder sb = new StringBuilder();
        sb.append(p0);
        sb.append(" and ");
        sb.append(obj);
        bVarB.TuitionPaymentFragmentbindingInflater1(sb.toString(), new Object[0]);
        if (((CharSequence) objectRef.element).length() == 0) {
            Intrinsics.checkNotNull(FirebaseMessaging.getInstance().getToken().addOnCompleteListener(new OnCompleteListener() { // from class: RequestMonitorRequestCompleteListenerExternalSyntheticLambda0
                @Override // com.google.android.gms.tasks.OnCompleteListener
                public final void onComplete(Task task) throws IOException {
                    BpjstkuFirebaseMessagingService.TuitionPaymentFragmentspecialinlinedviewModeldefault3(objectRef, p0, this, task);
                }
            }));
            return;
        }
        if (((CharSequence) objectRef.element).length() == 0 || !(!Intrinsics.areEqual(p0, objectRef.element))) {
            ((registerlambda1) this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getValue()).TuitionPaymentFragmentbindingInflater1(p0);
            TuitionPaymentFragmentspecialinlinedviewModeldefault2(p0);
            int i2 = asInterface + 77;
            g = i2 % 128;
            int i3 = i2 % 2;
        }
        int i4 = asInterface + 103;
        g = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // com.google.firebase.messaging.FirebaseMessagingService
    public final void onMessageReceived(RemoteMessage p0) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(p0, "");
        super.onMessageReceived(p0);
        RemoteMessage.Notification notification = p0.getNotification();
        String title = p0.getData().get("title");
        String body = null;
        if (title == null) {
            int i2 = g + 33;
            int i3 = i2 % 128;
            asInterface = i3;
            int i4 = i2 % 2;
            if (notification != null) {
                int i5 = i3 + 19;
                g = i5 % 128;
                if (i5 % 2 == 0) {
                    notification.getTitle();
                    throw null;
                }
                title = notification.getTitle();
            } else {
                title = null;
            }
        }
        String str = p0.getData().get("body");
        if (str == null) {
            int i6 = g + 83;
            int i7 = i6 % 128;
            asInterface = i7;
            int i8 = i6 % 2;
            if (notification != null) {
                int i9 = i7 + 125;
                g = i9 % 128;
                if (i9 % 2 == 0) {
                    notification.getBody();
                    body.hashCode();
                    throw null;
                }
                body = notification.getBody();
            }
        } else {
            int i10 = asInterface + 107;
            g = i10 % 128;
            int i11 = i10 % 2;
            body = str;
        }
        if (title == null || body == null) {
            return;
        }
        String str2 = p0.getData().get("navigate_to");
        Uri defaultUri = RingtoneManager.getDefaultUri(2);
        BpjstkuFirebaseMessagingService bpjstkuFirebaseMessagingService = this;
        Intent intent = new Intent(bpjstkuFirebaseMessagingService, (Class<?>) NotificationActivity.class);
        intent.setFlags(603979776);
        intent.putExtra("navigate_to", str2);
        String str3 = title;
        String str4 = body;
        NotificationCompat.Builder style = new NotificationCompat.Builder(bpjstkuFirebaseMessagingService, "bpjstku_channel_id").setSmallIcon(2131231113).setContentTitle(str3).setContentText(str4).setSound(defaultUri).setAutoCancel(true).setContentIntent(PendingIntent.getActivity(bpjstkuFirebaseMessagingService, 1, intent, 201326592)).setStyle(new NotificationCompat.BigTextStyle().bigText(str4).setBigContentTitle(str3));
        Intrinsics.checkNotNullExpressionValue(style, "");
        Object systemService = getSystemService("notification");
        Intrinsics.checkNotNull(systemService, "");
        NotificationManager notificationManager = (NotificationManager) systemService;
        if (Build.VERSION.SDK_INT >= 26) {
            Uri defaultUri2 = RingtoneManager.getDefaultUri(2);
            AudioAttributes audioAttributesBuild = new AudioAttributes.Builder().setContentType(4).setUsage(5).build();
            NotificationChannel notificationChannel = new NotificationChannel("bpjstku_channel_id", "bpjstku", 4);
            notificationChannel.setSound(defaultUri2, audioAttributesBuild);
            notificationChannel.enableLights(true);
            notificationChannel.setLightColor(-16776961);
            notificationChannel.enableVibration(true);
            notificationChannel.setVibrationPattern(new long[]{100, 200, 300, 400, 500, 400, 300, 200, 400});
            notificationChannel.setLockscreenVisibility(1);
            notificationManager.createNotificationChannel(notificationChannel);
        }
        notificationManager.notify((int) System.currentTimeMillis(), style.build());
        lambdatryToProvidePreviewSurface1androidxcameraviewTextureViewImplementation.TuitionPaymentFragmentspecialinlinedviewModeldefault3().b(new shouldUseFlashModeTorch());
        b().saveBoolean("unread_notif", true);
    }

    @Override // com.google.firebase.messaging.EnhancedIntentService, android.app.Service
    public final void onDestroy() {
        int i = 2 % 2;
        int i2 = g + 51;
        asInterface = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            super.onDestroy();
            ((acquireBuffer) this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getValue()).dispose();
            obj.hashCode();
            throw null;
        }
        super.onDestroy();
        ((acquireBuffer) this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getValue()).dispose();
        int i3 = asInterface + 25;
        g = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
    }

    private final void TuitionPaymentFragmentspecialinlinedviewModeldefault2(String p0) {
        int i = 2 % 2;
        VideoEncoderSession1 videoEncoderSession1TuitionPaymentFragmentspecialinlinedviewModeldefault2 = ((registerlambda1) this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault2(p0);
        appendBackupVideoProfile appendbackupvideoprofileB = isSamsungJ2.b();
        Intrinsics.checkExpressionValueIsNotNull(appendbackupvideoprofileB, "");
        appendBackupVideoProfile appendbackupvideoprofileTuitionPaymentFragmentbindingInflater1 = dumpAudioCapabilities.TuitionPaymentFragmentbindingInflater1();
        Intrinsics.checkExpressionValueIsNotNull(appendbackupvideoprofileTuitionPaymentFragmentbindingInflater1, "");
        VideoEncoderSession1 videoEncoderSession1TuitionPaymentFragmentbindingInflater1 = VideoEncoderSession1.TuitionPaymentFragmentbindingInflater1(((finalizeWithError) share.b(new suspend(appendbackupvideoprofileB, appendbackupvideoprofileTuitionPaymentFragmentbindingInflater1), "transformer is null")).TuitionPaymentFragmentspecialinlinedviewModeldefault2(videoEncoderSession1TuitionPaymentFragmentspecialinlinedviewModeldefault2));
        formatInterval formatinterval = new formatInterval() { // from class: RequestMonitorRequestCompleteListener
            @Override // defpackage.formatInterval
            public final void run() {
                int iTuitionPaymentFragmentspecialinlinedviewModeldefault1 = isAssociatedWith.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                BpjstkuFirebaseMessagingService.TuitionPaymentFragmentbindingInflater1(new Object[0], isAssociatedWith.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), isAssociatedWith.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), iTuitionPaymentFragmentspecialinlinedviewModeldefault1, 1911820320, -1911820320, isAssociatedWith.TuitionPaymentFragmentspecialinlinedviewModeldefault1());
            }
        };
        final Function1 function1 = new Function1() { // from class: completeFuture
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int iTuitionPaymentFragmentspecialinlinedviewModeldefault1 = isAssociatedWith.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                return (Unit) BpjstkuFirebaseMessagingService.TuitionPaymentFragmentbindingInflater1(new Object[]{(Throwable) obj}, isAssociatedWith.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), isAssociatedWith.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), iTuitionPaymentFragmentspecialinlinedviewModeldefault1, -1349196911, 1349196912, isAssociatedWith.TuitionPaymentFragmentspecialinlinedviewModeldefault1());
            }
        };
        BufferProviderState bufferProviderStateB = videoEncoderSession1TuitionPaymentFragmentbindingInflater1.b(formatinterval, new logToString() { // from class: insertOrPrioritize
            @Override // defpackage.logToString
            public final void accept(Object obj) {
                BpjstkuFirebaseMessagingService.b(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(bufferProviderStateB, "");
        ((acquireBuffer) this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault3(bufferProviderStateB);
        int i2 = asInterface + 63;
        g = i2 % 128;
        if (i2 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // com.google.firebase.messaging.FirebaseMessagingService, com.google.firebase.messaging.EnhancedIntentService, android.app.Service, android.content.ContextWrapper
    public final void attachBaseContext(Context context) throws Throwable {
        Object[] objArrB$7879113;
        Object[] objArr;
        int i = 2 % 2;
        super.attachBaseContext(context);
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char c = (char) ((AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 29944);
            int iArgb = Color.argb(0, 0, 0, 0) + 1755;
            int iIndexOf = 22 - TextUtils.indexOf((CharSequence) "", '0', 0, 0);
            byte[] bArr = $$a;
            Object[] objArr2 = new Object[1];
            a((byte) (-bArr[3]), (short) 89, bArr[80], objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(c, iArgb, iIndexOf, 986134021, false, (String) objArr2[0], null);
        }
        if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null) != -1) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                char threadPriority = (char) (((Process.getThreadPriority(0) + 20) >> 6) + 29944);
                int tapTimeout = 1755 - (ViewConfiguration.getTapTimeout() >> 16);
                int size = 23 - View.MeasureSpec.getSize(0);
                Object[] objArr3 = new Object[1];
                a((byte) 52, (short) 141, $$a[80], objArr3);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(threadPriority, tapTimeout, size, 1599039318, false, (String) objArr3[0], null);
            }
            Object[] objArr4 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).get(null);
            objArrB$7879113 = new Object[]{new int[]{((int[]) objArr4[0])[0]}, new int[]{((int[]) objArr4[1])[0]}, (Object[]) objArr4[2], new int[1], (String[]) objArr4[4]};
            int i2 = ~new Random().nextInt();
            int i3 = (-251538111) + (((~(i2 | 519331574)) | (~((-306200753) | i2))) * (-184)) + ((212866624 | (~((-519067377) | i2)) | (~(306464950 | i2))) * 184) + 1410065806;
            int i4 = (i3 << 13) ^ i3;
            int i5 = i4 ^ (i4 >>> 17);
            ((int[]) objArrB$7879113[3])[0] = i5 ^ (i5 << 5);
        } else {
            Object[] objArr5 = new Object[1];
            c(new char[]{4816, 53717, 15615, 44038}, new char[]{10569, 43514, 34819, 19880}, (char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.notificationOpenAppToActivateBody).substring(0, 65).codePointAt(58) + 43043), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.save_card_message).substring(0, 1).length() - 1, new char[]{46254, 23164, 26302, 9583, 41675, 62099, 17489, 46381, 20501, 39273, 39516, 23126, 51064, 14511, 47846, 30958}, objArr5);
            Class<?> cls = Class.forName((String) objArr5[0]);
            Object[] objArr6 = new Object[1];
            c(new char[]{4816, 53717, 15615, 44038}, new char[]{62234, 14406, 18679, 35242}, (char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.payment_method_description_indomaret).substring(1, 3).length() + 43590), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() - 11, new char[]{58667, 29074, 33395, 12179, 59940, 28557, 53220, 10750, 64123, 42676, 22407, 62683, 56342, 1918, 24379, 41233}, objArr6);
            int iIntValue = ((Integer) cls.getMethod((String) objArr6[0], Object.class).invoke(null, this)).intValue();
            try {
                Object[] objArr7 = {137220663};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2063193834);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) ((-16735167) - Color.rgb(0, 0, 0)), (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 1726, (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 28, -1637387971, false, null, new Class[]{Integer.TYPE});
                }
                objArrB$7879113 = onScroll.b$7879113(iIntValue, 0, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).newInstance(objArr7), 1458678422, false, true);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    char packedPositionType = (char) (ExpandableListView.getPackedPositionType(0L) + 29944);
                    int offsetBefore = 1755 - TextUtils.getOffsetBefore("", 0);
                    int i6 = (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 23;
                    Object[] objArr8 = new Object[1];
                    a((byte) 52, (short) 141, $$a[80], objArr8);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(packedPositionType, offsetBefore, i6, 1599039318, false, (String) objArr8[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArrB$7879113);
                try {
                    Object[] objArr9 = new Object[1];
                    c(new char[]{4816, 53717, 15615, 44038}, new char[]{64027, 3809, 49848, 4703}, (char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 36), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 36, new char[]{29223, 47641, 50327, 18680, 22132, 23283, 51470, 36708, 8193, 46869, 47183, 36712, 20852, 34137, 23304, 42843, 63839, 61827, 3211, 39640, 25020, 3232}, objArr9);
                    Class<?> cls2 = Class.forName((String) objArr9[0]);
                    Object[] objArr10 = new Object[1];
                    c(new char[]{4816, 53717, 15615, 44038}, new char[]{45581, 33076, 24915, 54192}, (char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.bank_code).substring(4, 5).codePointAt(0) + 45121), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 1400976526, new char[]{60283, 31924, 48420, 57435, 64343, 7152, 43395, 2127, 15552, 54071, 18244, 62314, 45931, 25873, 42409}, objArr10);
                    long jLongValue = ((Long) cls2.getDeclaredMethod((String) objArr10[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1145728641);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                        char scrollBarFadeDuration = (char) (29944 - (ViewConfiguration.getScrollBarFadeDuration() >> 16));
                        int iIndexOf2 = 1755 - TextUtils.indexOf("", "", 0, 0);
                        int i7 = (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 23;
                        byte b2 = (byte) 52;
                        Object[] objArr11 = new Object[1];
                        a(b2, b2, $$a[80], objArr11);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(scrollBarFadeDuration, iIndexOf2, i7, 1596667560, false, (String) objArr11[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                        char offsetAfter = (char) (TextUtils.getOffsetAfter("", 0) + 29944);
                        int iIndexOf3 = 1754 - TextUtils.indexOf((CharSequence) "", '0');
                        int i8 = (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 22;
                        byte[] bArr2 = $$a;
                        Object[] objArr12 = new Object[1];
                        a((byte) (-bArr2[3]), (short) 89, bArr2[80], objArr12);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(offsetAfter, iIndexOf3, i8, 986134021, false, (String) objArr12[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf2);
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
        int i9 = ((int[]) objArrB$7879113[1])[0];
        int i10 = ((int[]) objArrB$7879113[0])[0];
        if (i10 == i9) {
            int i11 = g + 121;
            asInterface = i11 % 128;
            int i12 = i11 % 2;
            int i13 = ((int[]) objArrB$7879113[3])[0];
            Object[] objArr13 = {new int[]{((int[]) objArrB$7879113[0])[0]}, new int[]{((int[]) objArrB$7879113[1])[0]}, (Object[]) objArrB$7879113[2], new int[1], (String[]) objArrB$7879113[4]};
            int i14 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().uiMode;
            int i15 = ~i14;
            int i16 = i13 + 1597467625 + (((~(i15 | 70767944)) | (~((-141834482) | i15)) | 138422449) * 464) + (((-3412033) | i14) * (-464)) + (((~(i14 | 70767944)) | 138422449) * 464);
            int i17 = (i16 << 13) ^ i16;
            int i18 = i17 ^ (i17 >>> 17);
            ((int[]) objArr13[3])[0] = i18 ^ (i18 << 5);
        } else {
            ArrayList arrayList = new ArrayList();
            String[] strArr = (String[]) objArrB$7879113[4];
            if (strArr != null) {
                int i19 = g + 95;
                asInterface = i19 % 128;
                int i20 = 2;
                int i21 = i19 % 2 != 0 ? 1 : 0;
                while (i21 < strArr.length) {
                    int i22 = asInterface + 5;
                    g = i22 % 128;
                    int i23 = i22 % i20;
                    arrayList.add(strArr[i21]);
                    i21++;
                    i20 = 2;
                }
            }
            int[] iArr = new int[i10];
            int i24 = i10 - 1;
            iArr[i24] = 1;
            Toast.makeText((Context) null, iArr[((i10 * i24) % 2) - 1], 1).show();
            int i25 = ((int[]) objArrB$7879113[3])[0];
            Object[] objArr14 = {new int[]{((int[]) objArrB$7879113[0])[0]}, new int[]{((int[]) objArrB$7879113[1])[0]}, (Object[]) objArrB$7879113[2], new int[1], (String[]) objArrB$7879113[4]};
            int iIdentityHashCode = System.identityHashCode(this);
            int i26 = ~iIdentityHashCode;
            int i27 = i25 + (-2027857247) + (((~(146897434 | i26)) | 53117957) * 184) + ((iIdentityHashCode | 134310400) * (-184)) + ((~((-65704992) | i26)) * 184);
            int i28 = (i27 << 13) ^ i27;
            int i29 = i28 ^ (i28 >>> 17);
            ((int[]) objArr14[3])[0] = i29 ^ (i29 << 5);
        }
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
            char cNormalizeMetaState = (char) KeyEvent.normalizeMetaState(0);
            int defaultSize = 1031 - View.getDefaultSize(0, 0);
            int tapTimeout2 = (ViewConfiguration.getTapTimeout() >> 16) + 15;
            byte[] bArr3 = $$a;
            Object[] objArr15 = new Object[1];
            a((byte) 52, bArr3[7], bArr3[80], objArr15);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(cNormalizeMetaState, defaultSize, tapTimeout2, 1357589585, false, (String) objArr15[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).getLong(null);
        Object[] objArr16 = new Object[1];
        c(new char[]{4816, 53717, 15615, 44038}, new char[]{64027, 3809, 49848, 4703}, (char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.vida_error_image_signing_failed).substring(0, 24).length() - 24), View.MeasureSpec.getMode(0), new char[]{29223, 47641, 50327, 18680, 22132, 23283, 51470, 36708, 8193, 46869, 47183, 36712, 20852, 34137, 23304, 42843, 63839, 61827, 3211, 39640, 25020, 3232}, objArr16);
        Class<?> cls3 = Class.forName((String) objArr16[0]);
        Object[] objArr17 = new Object[1];
        c(new char[]{4816, 53717, 15615, 44038}, new char[]{45581, 33076, 24915, 54192}, (char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 45117), 1400976530 + ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.danamon_online_instruction_step1).substring(13, 14).codePointAt(0), new char[]{60283, 31924, 48420, 57435, 64343, 7152, 43395, 2127, 15552, 54071, 18244, 62314, 45931, 25873, 42409}, objArr17);
        long jLongValue2 = ((Long) cls3.getDeclaredMethod((String) objArr17[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault10 == null) {
            char absoluteGravity = (char) Gravity.getAbsoluteGravity(0, 0);
            int doubleTapTimeout = (ViewConfiguration.getDoubleTapTimeout() >> 16) + 1031;
            int iLastIndexOf = 14 - TextUtils.lastIndexOf("", '0');
            Object[] objArr18 = new Object[1];
            a((byte) 52, (short) 141, $$a[80], objArr18);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.b(absoluteGravity, doubleTapTimeout, iLastIndexOf, 1344079056, false, (String) objArr18[0], null);
        }
        if (j == ((jLongValue2 - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault10).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault11 == null) {
                char cLastIndexOf = (char) (TextUtils.lastIndexOf("", '0') + 1);
                int iCombineMeasuredStates = View.combineMeasuredStates(0, 0) + 1031;
                int i30 = 16 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1));
                byte b3 = $$a[7];
                byte b4 = b3;
                Object[] objArr19 = new Object[1];
                a(b4, (short) (b4 | 141), b3, objArr19);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.b(cLastIndexOf, iCombineMeasuredStates, i30, 632103528, false, (String) objArr19[0], null);
            }
            Object[] objArr20 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault11).get(null);
            objArr = new Object[]{strArr, new int[]{i}, new int[1], new int[]{i}};
            int i31 = ((int[]) objArr20[3])[0];
            int i32 = ((int[]) objArr20[1])[0];
            String[] strArr2 = (String[]) objArr20[0];
            int iNextInt = new Random().nextInt(691376646);
            int i33 = ~iNextInt;
            int i34 = (-1983075958) + (((~((-453094399) | i33)) | (-208814229)) * 519) + (((~(i33 | (-134217877))) | (~((-74596353) | iNextInt))) * (-519)) + (((~(iNextInt | (-208814229))) | 453094398) * 519) + 1095486682;
            int i35 = (i34 << 13) ^ i34;
            int i36 = i35 ^ (i35 >>> 17);
            ((int[]) objArr[2])[0] = i36 ^ (i36 << 5);
        } else {
            Object[] objArr21 = new Object[1];
            c(new char[]{4816, 53717, 15615, 44038}, new char[]{10569, 43514, 34819, 19880}, (char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.indomaret_instruction_step1).substring(2, 4).length() + 43142), ExpandableListView.getPackedPositionChild(0L) + 1, new char[]{46254, 23164, 26302, 9583, 41675, 62099, 17489, 46381, 20501, 39273, 39516, 23126, 51064, 14511, 47846, 30958}, objArr21);
            Class<?> cls4 = Class.forName((String) objArr21[0]);
            Object[] objArr22 = new Object[1];
            c(new char[]{4816, 53717, 15615, 44038}, new char[]{62234, 14406, 18679, 35242}, (char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.alfamart).substring(0, 8).length() + 43584), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.bca_mbanking_instruction_step5).substring(3, 4).length() - 1, new char[]{58667, 29074, 33395, 12179, 59940, 28557, 53220, 10750, 64123, 42676, 22407, 62683, 56342, 1918, 24379, 41233}, objArr22);
            int iIntValue2 = ((Integer) cls4.getMethod((String) objArr22[0], Object.class).invoke(null, this)).intValue();
            Object[] objArr23 = {137220663};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-725886332);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault12 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.b((char) (TextUtils.getOffsetAfter("", 0) + 46038), (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 1134, TextUtils.indexOf((CharSequence) "", '0', 0) + 19, 807763283, false, null, new Class[]{Integer.TYPE});
            }
            Object[] objArr24 = {Integer.valueOf(iIntValue2), 0, 1095486682, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault12).newInstance(objArr23), false};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1443305588);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault13 == null) {
                char mode = (char) View.MeasureSpec.getMode(0);
                int i37 = 1032 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1));
                int i38 = 16 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1));
                byte[] bArr4 = $$a;
                Object[] objArr25 = new Object[1];
                a((byte) 52, bArr4[7], bArr4[80], objArr25);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.b(mode, i37, i38, 1298546779, false, (String) objArr25[0], new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) ((PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 45993), 1117 - View.resolveSizeAndState(0, 0, 0), KeyEvent.normalizeMetaState(0) + 17), Boolean.TYPE});
            }
            objArr = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault13).invoke(null, objArr24);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault14 == null) {
                char cNormalizeMetaState2 = (char) KeyEvent.normalizeMetaState(0);
                int mode2 = 1031 - View.MeasureSpec.getMode(0);
                int mode3 = View.MeasureSpec.getMode(0) + 15;
                byte b5 = $$a[7];
                byte b6 = b5;
                Object[] objArr26 = new Object[1];
                a(b6, (short) (b6 | 141), b5, objArr26);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.b(cNormalizeMetaState2, mode2, mode3, 632103528, false, (String) objArr26[0], null);
            }
            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault14).set(null, objArr);
            try {
                Object[] objArr27 = new Object[1];
                c(new char[]{4816, 53717, 15615, 44038}, new char[]{64027, 3809, 49848, 4703}, (char) View.MeasureSpec.getSize(0), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.bni_atm_instruction_6).substring(12, 13).length() - 1, new char[]{29223, 47641, 50327, 18680, 22132, 23283, 51470, 36708, 8193, 46869, 47183, 36712, 20852, 34137, 23304, 42843, 63839, 61827, 3211, 39640, 25020, 3232}, objArr27);
                Class<?> cls5 = Class.forName((String) objArr27[0]);
                Object[] objArr28 = new Object[1];
                c(new char[]{4816, 53717, 15615, 44038}, new char[]{45581, 33076, 24915, 54192}, (char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(5) + 45041), 1400976562 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), new char[]{60283, 31924, 48420, 57435, 64343, 7152, 43395, 2127, 15552, 54071, 18244, 62314, 45931, 25873, 42409}, objArr28);
                long jLongValue3 = ((Long) cls5.getDeclaredMethod((String) objArr28[0], new Class[0]).invoke(null, new Object[0])).longValue();
                Long lValueOf3 = Long.valueOf(jLongValue3);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault15 == null) {
                    char keyRepeatDelay = (char) (ViewConfiguration.getKeyRepeatDelay() >> 16);
                    int iIndexOf4 = 1031 - TextUtils.indexOf("", "", 0, 0);
                    int size2 = 15 - View.MeasureSpec.getSize(0);
                    Object[] objArr29 = new Object[1];
                    a((byte) 52, (short) 141, $$a[80], objArr29);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.b(keyRepeatDelay, iIndexOf4, size2, 1344079056, false, (String) objArr29[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault15).set(null, lValueOf3);
                Long lValueOf4 = Long.valueOf(jLongValue3 >> 12);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault16 == null) {
                    char c2 = (char) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 1);
                    int iLastIndexOf2 = TextUtils.lastIndexOf("", '0', 0) + 1032;
                    int iMyPid = 15 - (Process.myPid() >> 22);
                    byte[] bArr5 = $$a;
                    Object[] objArr30 = new Object[1];
                    a((byte) 52, bArr5[7], bArr5[80], objArr30);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.b(c2, iLastIndexOf2, iMyPid, 1357589585, false, (String) objArr30[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault16).set(null, lValueOf4);
            } catch (Exception unused2) {
                throw new RuntimeException();
            }
        }
        int i39 = ((int[]) objArr[1])[0];
        int i40 = ((int[]) objArr[3])[0];
        if (i40 == i39) {
            Object[] objArr31 = {strArr, new int[]{i}, new int[1], new int[]{i}};
            int i41 = ((int[]) objArr[2])[0];
            int i42 = ((int[]) objArr[3])[0];
            int i43 = ((int[]) objArr[1])[0];
            String[] strArr3 = (String[]) objArr[0];
            int i44 = ~((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getDisplayMetrics().densityDpi;
            int i45 = i41 + (-445599355) + ((~(226420583 | i44)) * 52) + (((~(87475779 | i44)) | (~((-156804391) | i44)) | 138944804) * (-52)) + (((~(i44 | (-87475780))) | 69616193) * 52);
            int i46 = (i45 << 13) ^ i45;
            int i47 = i46 ^ (i46 >>> 17);
            ((int[]) objArr31[2])[0] = i47 ^ (i47 << 5);
            return;
        }
        ArrayList arrayList2 = new ArrayList();
        String[] strArr4 = (String[]) objArr[0];
        if (strArr4 != null) {
            int i48 = 0;
            while (i48 < strArr4.length) {
                int i49 = asInterface + 91;
                g = i49 % 128;
                if (i49 % 2 == 0) {
                    arrayList2.add(strArr4[i48]);
                    i48 += 20;
                } else {
                    arrayList2.add(strArr4[i48]);
                    i48++;
                }
            }
        }
        int[] iArr2 = new int[i40];
        int i50 = i40 - 1;
        iArr2[i50] = 1;
        Toast.makeText((Context) null, iArr2[((i40 * i50) % 2) - 1], 1).show();
        Object[] objArr32 = {strArr, new int[]{i}, new int[1], new int[]{i}};
        int i51 = ((int[]) objArr[2])[0];
        int i52 = ((int[]) objArr[3])[0];
        int i53 = ((int[]) objArr[1])[0];
        String[] strArr5 = (String[]) objArr[0];
        int iNextInt2 = new Random().nextInt(2022665298);
        int i54 = i51 + (-345520047) + (((~((-222079779) | iNextInt2)) | (-22200392)) * (-964)) + (((~((~iNextInt2) | (-222079779))) | 204221216) * (-964));
        int i55 = (i54 << 13) ^ i54;
        int i56 = i55 ^ (i55 >>> 17);
        ((int[]) objArr32[2])[0] = i56 ^ (i56 << 5);
    }

    @Override // com.google.firebase.messaging.FirebaseMessagingService, com.google.firebase.messaging.EnhancedIntentService, android.app.Service
    public final void onCreate() throws Throwable {
        int i = 2 % 2;
        int i2 = asInterface + 1;
        g = i2 % 128;
        int i3 = i2 % 2;
        int i4 = ((Field) cacheInteropConfig.b[0]).getInt(null);
        int iMyUid = Process.myUid();
        int i5 = ~iMyUid;
        if (i4 != 1679164088 + (((~(834049044 | i5)) | (~((-4061502) | iMyUid))) * 1900) + (((~(i5 | 4061501)) | (~(iMyUid | (-834049045)))) * (-950)) + (((~(iMyUid | 4061501)) | (~(i5 | (-834049045)))) * 950)) {
            throw null;
        }
        int i6 = ((Field) generateCameraId.TuitionPaymentFragmentspecialinlinedviewModeldefault1[0]).getInt(null);
        int iCodePointAt = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.tab_bni_mobile).substring(0, 14).codePointAt(1) - 1082626608;
        int i7 = ~iCodePointAt;
        int i8 = (-2033540198) + (((~((-2145649465) | i7)) | 428081168) * (-1188));
        int i9 = (~(iCodePointAt | 2145649464)) | 428081168;
        int i10 = ~(429738133 | i7);
        if (i6 != i8 + ((i9 | i10) * 594) + (((~(2145649464 | i7)) | (-2147306430) | i10) * 594)) {
            throw new RuntimeException("-1412930358");
        }
        super.onCreate();
        int i11 = asInterface + 59;
        g = i11 % 128;
        if (i11 % 2 == 0) {
            int i12 = 62 / 0;
        }
    }

    private static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault3(Object[] objArr) throws IOException {
        int i = 2 % 2;
        int i2 = g + 113;
        asInterface = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 47 / 0;
            if (getContentPaddingRight.TuitionPaymentFragmentbindingInflater1() <= 0) {
                return null;
            }
        } else if (getContentPaddingRight.TuitionPaymentFragmentbindingInflater1() <= 0) {
            return null;
        }
        getContentPaddingRight.b("Success update FCM", new Object[0]);
        int i4 = asInterface + 63;
        g = i4 % 128;
        int i5 = i4 % 2;
        return null;
    }

    /* JADX WARN: Type inference failed for: r8v1, types: [T, java.lang.Object] */
    public static /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault3(Ref.ObjectRef objectRef, String str, BpjstkuFirebaseMessagingService bpjstkuFirebaseMessagingService, Task task) throws IOException {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(task, "");
        getContentPaddingRight.b bVarB = getContentPaddingRight.b("==fcmtoken");
        Intrinsics.checkExpressionValueIsNotNull(bVarB, "");
        boolean zIsSuccessful = task.isSuccessful();
        Object result = task.getResult();
        StringBuilder sb = new StringBuilder();
        sb.append(zIsSuccessful);
        sb.append(" ");
        sb.append(result);
        bVarB.TuitionPaymentFragmentbindingInflater1(sb.toString(), new Object[0]);
        if (!task.isSuccessful()) {
            return;
        }
        int i2 = g + 73;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        CharSequence charSequence = (CharSequence) task.getResult();
        if (charSequence == null || charSequence.length() == 0) {
            return;
        }
        int i4 = g + 89;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
        objectRef.element = task.getResult();
        if (((CharSequence) objectRef.element).length() != 0) {
            int i6 = g + 15;
            asInterface = i6 % 128;
            int i7 = i6 % 2;
            if (!Intrinsics.areEqual(str, objectRef.element)) {
                return;
            }
        }
        ((registerlambda1) bpjstkuFirebaseMessagingService.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getValue()).TuitionPaymentFragmentbindingInflater1(str);
        bpjstkuFirebaseMessagingService.TuitionPaymentFragmentspecialinlinedviewModeldefault2(str);
    }

    public static /* synthetic */ void b(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = g + 45;
        asInterface = i2 % 128;
        if (i2 % 2 == 0) {
            function1.invoke(obj);
        } else {
            function1.invoke(obj);
            throw null;
        }
    }

    private static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault2(Object[] objArr) throws IOException {
        Throwable th = (Throwable) objArr[0];
        int i = 2 % 2;
        int i2 = asInterface + 65;
        g = i2 % 128;
        int i3 = i2 % 2;
        getContentPaddingRight.TuitionPaymentFragmentspecialinlinedviewModeldefault3(th);
        Unit unit = Unit.INSTANCE;
        int i4 = g + 71;
        asInterface = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        throw null;
    }

    public static /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault1 = isAssociatedWith.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        TuitionPaymentFragmentbindingInflater1(new Object[0], isAssociatedWith.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), isAssociatedWith.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), iTuitionPaymentFragmentspecialinlinedviewModeldefault1, 1911820320, -1911820320, isAssociatedWith.TuitionPaymentFragmentspecialinlinedviewModeldefault1());
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentbindingInflater1(Throwable th) {
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault1 = isAssociatedWith.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        return (Unit) TuitionPaymentFragmentbindingInflater1(new Object[]{th}, isAssociatedWith.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), isAssociatedWith.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), iTuitionPaymentFragmentspecialinlinedviewModeldefault1, -1349196911, 1349196912, isAssociatedWith.TuitionPaymentFragmentspecialinlinedviewModeldefault1());
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0023  */
    /* JADX WARN: Code duplicated, block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x0027). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0023
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$i(short r5, short r6, int r7) {
        /*
            int r6 = r6 + 102
            int r5 = r5 * 3
            int r0 = 1 - r5
            byte[] r1 = com.bpjstku.service.BpjstkuFirebaseMessagingService.$$c
            int r7 = r7 * 2
            int r7 = r7 + 4
            byte[] r0 = new byte[r0]
            r2 = 0
            int r5 = 0 - r5
            if (r1 != 0) goto L17
            r4 = r6
            r3 = r2
            r6 = r5
            goto L27
        L17:
            r3 = r2
        L18:
            byte r4 = (byte) r6
            r0[r3] = r4
            if (r3 != r5) goto L23
            java.lang.String r5 = new java.lang.String
            r5.<init>(r0, r2)
            return r5
        L23:
            int r3 = r3 + 1
            r4 = r1[r7]
        L27:
            int r7 = r7 + 1
            int r6 = r6 + r4
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.service.BpjstkuFirebaseMessagingService.$$i(short, short, int):java.lang.String");
    }
}
