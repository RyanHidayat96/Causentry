package com.datadog.android.core.internal.system;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.PowerManager;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.Toast;
import androidx.compose.runtime.ComposerKt;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.app.NotificationCompat;
import androidx.core.view.PointerIconCompat;
import androidx.core.view.ViewCompat;
import com.datadog.android.api.InternalLogger;
import com.datadog.android.core.internal.receiver.ThreadSafeReceiver;
import com.google.firebase.analytics.FirebaseAnalytics;
import defpackage.SessionProcessor;
import defpackage.initSession;
import defpackage.lambdarotateYUV1;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Random;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;
import org.koin.core.error.ScopeAlreadyCreatedException;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\b\u0001\u0018\u0000 \u00162\u00020\u00012\u00020\u0002:\u0001\u0016B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0017¢\u0006\u0004\b\b\u0010\tJ!\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0004\u001a\u00020\n2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\r2\u0006\u0010\u0004\u001a\u00020\nH\u0017¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\b\u001a\u00020\r2\u0006\u0010\u0004\u001a\u00020\nH\u0016¢\u0006\u0004\b\b\u0010\u0011R\u0014\u0010\u0013\u001a\u00020\u00038\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0012R\u0016\u0010\u0015\u001a\u00020\u00078\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\b\u0010\u0014"}, d2 = {"Lcom/datadog/android/core/internal/system/BroadcastReceiverSystemInfoProvider;", "Lcom/datadog/android/core/internal/receiver/ThreadSafeReceiver;", "LlambdarotateYUV1;", "Lcom/datadog/android/api/InternalLogger;", "p0", "<init>", "(Lcom/datadog/android/api/InternalLogger;)V", "Lcom/datadog/android/core/internal/system/SystemInfo;", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "()Lcom/datadog/android/core/internal/system/SystemInfo;", "Landroid/content/Context;", "Landroid/content/Intent;", "p1", "", "onReceive", "(Landroid/content/Context;Landroid/content/Intent;)V", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "(Landroid/content/Context;)V", "Lcom/datadog/android/api/InternalLogger;", "b", "Lcom/datadog/android/core/internal/system/SystemInfo;", "TuitionPaymentFragmentbindingInflater1", "TuitionPaymentFragmentspecialinlinedviewModeldefault3_"}, k = 1, mv = {1, 7, 0}, xi = 48)
public final class BroadcastReceiverSystemInfoProvider extends ThreadSafeReceiver implements lambdarotateYUV1 {
    private static final byte[] $$a;
    private static final int $$b;
    private static final byte[] $$d;
    private static final int $$e;
    private static final Set<SystemInfo.BatteryStatus> TuitionPaymentFragmentbindingInflater1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static long f687a;
    private static char asBinder;
    private static int asInterface;
    private static final Set<Integer> b;
    private static int cancel;
    private static int d;
    private static int g;
    private static int onTransact;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
    private final InternalLogger b;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
    private SystemInfo TuitionPaymentFragmentbindingInflater1;
    private static final byte[] $$c = {33, -59, 107, -108};
    private static final int $$f = 183;
    private static int $10 = 0;
    private static int $11 = 1;

    /* JADX WARN: Code duplicated, block: B:10:0x0022  */
    /* JADX WARN: Code duplicated, block: B:8:0x001a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:11:0x0029). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0022
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void e(byte r6, short r7, byte r8, java.lang.Object[] r9) {
        /*
            int r7 = 162 - r7
            byte[] r0 = com.datadog.android.core.internal.system.BroadcastReceiverSystemInfoProvider.$$a
            int r1 = r8 + 1
            int r6 = r6 + 84
            byte[] r1 = new byte[r1]
            r2 = 0
            if (r0 != 0) goto L11
            r6 = r7
            r4 = r8
            r3 = r2
            goto L29
        L11:
            r3 = r2
        L12:
            r5 = r7
            r7 = r6
            r6 = r5
            byte r4 = (byte) r7
            r1[r3] = r4
            if (r3 != r8) goto L22
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L22:
            int r3 = r3 + 1
            r4 = r0[r6]
            r5 = r7
            r7 = r6
            r6 = r5
        L29:
            int r7 = r7 + 1
            int r4 = -r4
            int r6 = r6 + r4
            int r6 = r6 + (-11)
            goto L12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.datadog.android.core.internal.system.BroadcastReceiverSystemInfoProvider.e(byte, short, byte, java.lang.Object[]):void");
    }

    private static void f(short s, short s2, short s3, Object[] objArr) {
        byte[] bArr = $$d;
        int i = s2 + 4;
        int i2 = s3 + 84;
        byte[] bArr2 = new byte[s + 14];
        int i3 = s + 13;
        int i4 = -1;
        if (bArr == null) {
            i4 = -1;
            i2 = (i2 + i) - 2;
            i++;
        }
        while (true) {
            int i5 = i4 + 1;
            bArr2[i5] = (byte) i2;
            if (i5 == i3) {
                objArr[0] = new String(bArr2, 0);
                return;
            }
            int i6 = i2;
            int i7 = i + 1;
            i4 = i5;
            i2 = (i6 + bArr[i]) - 2;
            i = i7;
        }
    }

    public BroadcastReceiverSystemInfoProvider(InternalLogger internalLogger) {
        Intrinsics.checkNotNullParameter(internalLogger, "");
        this.b = internalLogger;
        this.TuitionPaymentFragmentbindingInflater1 = new SystemInfo(false, 0, false, false, 15, null);
    }

    private static void c(char[] cArr, char[] cArr2, char c, int i, char[] cArr3, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
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
        while (sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2 < length3) {
            try {
                Object[] objArr2 = {sessionProcessor};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1033601528);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    byte b2 = (byte) 0;
                    byte b3 = b2;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (Process.getGidForName("") + 8329), 1236 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), 35 - Gravity.getAbsoluteGravity(0, 0), -653973969, false, $$g(b2, b3, (byte) (b3 + 2)), new Class[]{Object.class});
                }
                int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).intValue();
                try {
                    Object[] objArr3 = {sessionProcessor};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1120586870);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                        byte b4 = (byte) 0;
                        byte b5 = b4;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (ImageFormat.getBitsPerPixel(0) + 1), (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 2763, 13 - ExpandableListView.getPackedPositionChild(0L), 1504416861, false, $$g(b4, b5, b5), new Class[]{Object.class});
                    }
                    int iIntValue2 = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).intValue();
                    try {
                        Object[] objArr4 = {sessionProcessor, Integer.valueOf(cArr4[sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2 % 4] * 32718), Integer.valueOf(cArr5[iIntValue])};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(811618268);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (43325 - ExpandableListView.getPackedPositionGroup(0L)), 253 - (Process.myTid() >> 22), TextUtils.getOffsetBefore("", 0) + 22, -721491957, false, "j", new Class[]{Object.class, Integer.TYPE, Integer.TYPE});
                        }
                        ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
                        Object[] objArr5 = {Integer.valueOf(cArr4[iIntValue2] * 32718), Integer.valueOf(cArr5[iIntValue])};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1821841887);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                            byte b6 = (byte) 0;
                            byte b7 = b6;
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) ((-16712016) - Color.rgb(0, 0, 0)), (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 2891, ExpandableListView.getPackedPositionChild(0L) + 18, 2012627446, false, $$g(b6, b7, (byte) (b7 + 1)), new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        cArr5[iIntValue2] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).charValue();
                        cArr4[iIntValue2] = sessionProcessor.b;
                        cArr6[sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2] = (char) (((((long) (cArr4[iIntValue2] ^ cArr3[sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2])) ^ (f687a ^ (-6377398940819159759L))) ^ ((long) ((int) (((long) asInterface) ^ (-6377398940819159759L))))) ^ ((long) ((char) (((long) asBinder) ^ (-6377398940819159759L)))));
                        sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2++;
                        int i3 = $11 + 27;
                        $10 = i3 % 128;
                        int i4 = i3 % 2;
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
            } catch (Throwable th3) {
                Throwable cause3 = th3.getCause();
                if (cause3 == null) {
                    throw th3;
                }
                throw cause3;
            }
        }
        objArr[0] = new String(cArr6);
        int i5 = $11 + 87;
        $10 = i5 % 128;
        int i6 = i5 % 2;
    }

    /* JADX WARN: Code duplicated, block: B:172:0x1226  */
    /* JADX WARN: Code duplicated, block: B:173:0x1228  */
    /* JADX WARN: Code duplicated, block: B:323:0x2290  */
    /* JADX WARN: Code duplicated, block: B:324:0x2292  */
    /* JADX WARN: Code duplicated, block: B:407:0x2a08  */
    /* JADX WARN: Code duplicated, block: B:409:0x2a11  */
    /* JADX WARN: Code duplicated, block: B:412:0x2abd  */
    /* JADX WARN: Code duplicated, block: B:414:0x2ac0  */
    /* JADX WARN: Code duplicated, block: B:416:0x2ac5  */
    /* JADX WARN: Code duplicated, block: B:418:0x2ad1  */
    /* JADX WARN: Code duplicated, block: B:421:0x2adf  */
    /* JADX WARN: Code duplicated, block: B:424:0x2ae9  */
    /* JADX WARN: Code duplicated, block: B:425:0x2aeb  */
    /* JADX WARN: Code duplicated, block: B:426:0x2af0  */
    /* JADX WARN: Code duplicated, block: B:430:0x2b26 A[Catch: all -> 0x31ed, TryCatch #12 {all -> 0x31ed, blocks: (B:428:0x2b11, B:430:0x2b26, B:431:0x2b5a, B:433:0x2b97, B:434:0x2c18, B:283:0x1d50, B:285:0x1d65, B:286:0x1d9c, B:251:0x19aa, B:253:0x19b0, B:254:0x19dc, B:256:0x1a07, B:257:0x1a93, B:129:0x0e55, B:131:0x0e6a, B:132:0x0e9b, B:134:0x0ecf, B:135:0x0f4a), top: B:583:0x0e55 }] */
    /* JADX WARN: Code duplicated, block: B:433:0x2b97 A[Catch: all -> 0x31ed, TryCatch #12 {all -> 0x31ed, blocks: (B:428:0x2b11, B:430:0x2b26, B:431:0x2b5a, B:433:0x2b97, B:434:0x2c18, B:283:0x1d50, B:285:0x1d65, B:286:0x1d9c, B:251:0x19aa, B:253:0x19b0, B:254:0x19dc, B:256:0x1a07, B:257:0x1a93, B:129:0x0e55, B:131:0x0e6a, B:132:0x0e9b, B:134:0x0ecf, B:135:0x0f4a), top: B:583:0x0e55 }] */
    /* JADX WARN: Code duplicated, block: B:436:0x2c24  */
    /* JADX WARN: Code duplicated, block: B:438:0x2c2d  */
    /* JADX WARN: Code duplicated, block: B:443:0x2c96  */
    /* JADX WARN: Code duplicated, block: B:446:0x2ce7  */
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context p0, Intent p1) throws Throwable {
        Object[] objArr;
        Object[] objArr2;
        Object[] objArr3;
        int i;
        Object[] objArr4;
        Object[] objArr5;
        int i2;
        Object[] objArr6;
        Context context;
        Context applicationContext;
        Object[] objArr7;
        String str;
        Object[] objArr8;
        Object[] objArr9;
        int i3;
        Object[] objArr10;
        Context applicationContext2;
        Object[] objArr11;
        String str2;
        Object[] objArr12;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3;
        Object[] objArr13;
        Context applicationContext3;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8;
        int i4;
        int i5 = 2 % 2;
        Object[] objArr14 = new Object[1];
        c(new char[]{45561, 48463, 4492, 27613}, new char[]{47638, 20081, 42983, 36179}, (char) ((Process.getThreadPriority(0) + 20) >> 6), TextUtils.getTrimmedLength(""), new char[]{42943, 10802, 54273, 61201, 2779, 54465, 45894, 51941, 42603, 57763, 53637, 27734, 35844, 56710, 35373, 64152, 15352, 9856, 1289, 59473, 22020, 59740}, objArr14);
        String str3 = (String) objArr14[0];
        Object[] objArr15 = new Object[1];
        c(new char[]{45561, 48463, 4492, 27613}, new char[]{3456, 6450, 52619, 22886}, (char) (26318 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))), (-1961283059) - (ViewConfiguration.getWindowTouchSlop() >> 8), new char[]{46525, 64740, 18064, 29112, 23742, 35912, 52375, 11315, 56053, 63869, 5198, 18436, 1991, 4659, 54698}, objArr15);
        String str4 = (String) objArr15[0];
        Object[] objArr16 = new Object[1];
        c(new char[]{45561, 48463, 4492, 27613}, new char[]{4043, 42479, 14057, 10801}, (char) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 12599), (-1) - TextUtils.indexOf((CharSequence) "", '0'), new char[]{53767, 52897, 45269, 41022, 45083, 24411, 25727, 5678, 27221, 38214, 14712, 56159, 28705, 18568, 22929, 57356}, objArr16);
        String str5 = (String) objArr16[0];
        Object[] objArr17 = new Object[1];
        c(new char[]{45561, 48463, 4492, 27613}, new char[]{55297, 1981, 16903, 23000}, (char) ((ViewConfiguration.getTapTimeout() >> 16) + 55362), Drawable.resolveOpacity(0, 0), new char[]{13575, 40016, 2597, 20743, 29764, 50263, 6996, 11956, 39866, 26687, 50090, 1459, 2108, 45601, 9838, 59633}, objArr17);
        String str6 = (String) objArr17[0];
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1545400921);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
            char c = (char) (1 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)));
            int maximumFlingVelocity = (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 876;
            int minimumFlingVelocity = (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 10;
            byte[] bArr = $$a;
            Object[] objArr18 = new Object[1];
            e((byte) (-bArr[12]), (short) 158, (byte) (-bArr[26]), objArr18);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(c, maximumFlingVelocity, minimumFlingVelocity, -1199417970, false, (String) objArr18[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).getLong(null);
        long jLongValue = ((Long) Class.forName(str3).getDeclaredMethod(str4, new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-340665130);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault10 == null) {
            char cKeyCodeFromString = (char) KeyEvent.keyCodeFromString("");
            int iBlue = Color.blue(0) + 876;
            int iAlpha = Color.alpha(0) + 10;
            byte[] bArr2 = $$a;
            byte b2 = (byte) (-bArr2[17]);
            Object[] objArr19 = new Object[1];
            e(b2, (short) (b2 | 132), bArr2[24], objArr19);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.b(cKeyCodeFromString, iBlue, iAlpha, 254769921, false, (String) objArr19[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault10).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1435299656);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault11 == null) {
                char c2 = (char) (1 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)));
                int iLastIndexOf = TextUtils.lastIndexOf("", '0', 0) + 877;
                int iIndexOf = 10 - TextUtils.indexOf("", "", 0, 0);
                byte[] bArr3 = $$a;
                Object[] objArr20 = new Object[1];
                e((byte) (-bArr3[12]), (short) 148, bArr3[146], objArr20);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.b(c2, iLastIndexOf, iIndexOf, 1324201839, false, (String) objArr20[0], null);
            }
            Object[] objArr21 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault11).get(null);
            objArr = new Object[]{new int[]{((int[]) objArr21[0])[0]}, new int[1], new int[]{((int[]) objArr21[2])[0]}, (String[]) objArr21[3]};
            int iIdentityHashCode = System.identityHashCode(this);
            int i6 = ~iIdentityHashCode;
            int i7 = (((629539536 + (((~((-507025764) | i6)) | (~(466715534 | i6))) * (-867))) + ((((~((-507025764) | iIdentityHashCode)) | 69736545) | (~(466715534 | iIdentityHashCode))) * (-1734))) + (((~(iIdentityHashCode | 536452079)) | ((~(i6 | (-69736546))) | (~((-437289219) | iIdentityHashCode)))) * 867)) - 1660157782;
            int i8 = (i7 << 13) ^ i7;
            int i9 = i8 ^ (i8 >>> 17);
            ((int[]) objArr[1])[0] = i9 ^ (i9 << 5);
        } else {
            try {
                Object[] objArr22 = {Integer.valueOf(((Integer) Class.forName(str5).getMethod(str6, Object.class).invoke(null, this)).intValue()), -1660157782};
                byte[] bArr4 = $$d;
                Object[] objArr23 = new Object[1];
                f((byte) 89, bArr4[5], bArr4[16], objArr23);
                Class<?> cls = Class.forName((String) objArr23[0]);
                Object[] objArr24 = new Object[1];
                f(bArr4[420], (short) 102, bArr4[5], objArr24);
                objArr = (Object[]) cls.getMethod((String) objArr24[0], Integer.TYPE, Integer.TYPE).invoke(null, objArr22);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1435299656);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault12 == null) {
                    char c3 = (char) (1 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)));
                    int minimumFlingVelocity2 = (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 876;
                    int iIndexOf2 = TextUtils.indexOf((CharSequence) "", '0', 0) + 11;
                    byte[] bArr5 = $$a;
                    Object[] objArr25 = new Object[1];
                    e((byte) (-bArr5[12]), (short) 148, bArr5[146], objArr25);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.b(c3, minimumFlingVelocity2, iIndexOf2, 1324201839, false, (String) objArr25[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault12).set(null, objArr);
                try {
                    long jLongValue2 = ((Long) Class.forName(str3).getDeclaredMethod(str4, new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue2);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-340665130);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault13 == null) {
                        char touchSlop = (char) (ViewConfiguration.getTouchSlop() >> 8);
                        int size = 876 - View.MeasureSpec.getSize(0);
                        int iLastIndexOf2 = 9 - TextUtils.lastIndexOf("", '0', 0, 0);
                        byte[] bArr6 = $$a;
                        byte b3 = (byte) (-bArr6[17]);
                        Object[] objArr26 = new Object[1];
                        e(b3, (short) (b3 | 132), bArr6[24], objArr26);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.b(touchSlop, size, iLastIndexOf2, 254769921, false, (String) objArr26[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault13).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1545400921);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault14 == null) {
                        char pressedStateDuration = (char) (ViewConfiguration.getPressedStateDuration() >> 16);
                        int tapTimeout = (ViewConfiguration.getTapTimeout() >> 16) + 876;
                        int iCombineMeasuredStates = View.combineMeasuredStates(0, 0) + 10;
                        byte[] bArr7 = $$a;
                        Object[] objArr27 = new Object[1];
                        e((byte) (-bArr7[12]), (short) 158, (byte) (-bArr7[26]), objArr27);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.b(pressedStateDuration, tapTimeout, iCombineMeasuredStates, -1199417970, false, (String) objArr27[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault14).set(null, lValueOf2);
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
        if (i11 != i10) {
            ArrayList arrayList = new ArrayList();
            String[] strArr = (String[]) objArr[3];
            if (strArr != null) {
                for (String str7 : strArr) {
                    arrayList.add(str7);
                }
            }
            throw new RuntimeException(String.valueOf(i11));
        }
        int i12 = ((int[]) objArr[1])[0];
        Object[] objArr28 = {new int[]{((int[]) objArr[0])[0]}, new int[1], new int[]{((int[]) objArr[2])[0]}, (String[]) objArr[3]};
        int iNextInt = new Random().nextInt();
        int i13 = 709477472 + (((~((-608726376) | iNextInt)) | 568416146) * (-318));
        int i14 = ~(568416146 | iNextInt);
        int i15 = ~iNextInt;
        int i16 = i12 + i13 + ((i14 | (~((-27333265) | i15))) * TypedValues.AttributesType.TYPE_PIVOT_TARGET) + (((~(iNextInt | (-27333265))) | (~(636059639 | i15))) * TypedValues.AttributesType.TYPE_PIVOT_TARGET);
        int i17 = (i16 << 13) ^ i16;
        int i18 = i17 ^ (i17 >>> 17);
        ((int[]) objArr28[1])[0] = i18 ^ (i18 << 5);
        int i19 = onTransact + 23;
        cancel = i19 % 128;
        int i20 = i19 % 2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-342512172);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault15 == null) {
            char packedPositionType = (char) ExpandableListView.getPackedPositionType(0L);
            int bitsPerPixel = 875 - ImageFormat.getBitsPerPixel(0);
            int i21 = 11 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1));
            Object[] objArr29 = new Object[1];
            e((byte) ($$b >>> 2), (short) 141, $$a[24], objArr29);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.b(packedPositionType, bitsPerPixel, i21, 252381699, false, (String) objArr29[0], null);
        }
        long j2 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault15).getLong(null);
        long jLongValue3 = ((Long) Class.forName(str3).getDeclaredMethod(str4, new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1823069286);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault16 == null) {
            char cMakeMeasureSpec = (char) View.MeasureSpec.makeMeasureSpec(0, 0);
            int i22 = 876 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
            int mirror = ':' - AndroidCharacter.getMirror('0');
            byte b4 = $$a[24];
            Object[] objArr30 = new Object[1];
            e(b4, (short) (b4 | 141), (byte) ($$b - 5), objArr30);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.b(cMakeMeasureSpec, i22, mirror, 2009631821, false, (String) objArr30[0], null);
        }
        if (j2 == ((jLongValue3 - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault16).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault17 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-337894567);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault17 == null) {
                char edgeSlop = (char) (ViewConfiguration.getEdgeSlop() >> 16);
                int iIndexOf3 = TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 877;
                int i23 = (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 9;
                byte[] bArr8 = $$a;
                Object[] objArr31 = new Object[1];
                e(bArr8[27], (short) 89, bArr8[24], objArr31);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault17 = initSession.b(edgeSlop, iIndexOf3, i23, 256017550, false, (String) objArr31[0], null);
            }
            Object[] objArr32 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault17).get(null);
            objArr2 = new Object[]{new int[]{((int[]) objArr32[0])[0]}, new int[1], new int[]{((int[]) objArr32[2])[0]}, (String[]) objArr32[3]};
            int iIdentityHashCode2 = System.identityHashCode(this);
            int i24 = ((((-340708924) + ((~((~iIdentityHashCode2) | (-4194350))) * (-116))) + ((801095250 | iIdentityHashCode2) * 116)) + (((~(iIdentityHashCode2 | 760785021)) | 44504578) * 116)) - 1396484505;
            int i25 = (i24 << 13) ^ i24;
            int i26 = i25 ^ (i25 >>> 17);
            ((int[]) objArr2[1])[0] = i26 ^ (i26 << 5);
        } else {
            Context applicationContext4 = p0 != null ? ((p0 instanceof ContextWrapper) && ((ContextWrapper) p0).getBaseContext() == null) ? null : p0.getApplicationContext() : p0;
            Object[] objArr33 = {applicationContext4, Integer.valueOf(((Integer) Class.forName(str5).getMethod(str6, Object.class).invoke(null, this)).intValue()), -1396484505};
            byte[] bArr9 = $$d;
            Object[] objArr34 = new Object[1];
            f(bArr9[71], (short) ($$e | 10), bArr9[16], objArr34);
            Class<?> cls2 = Class.forName((String) objArr34[0]);
            Object[] objArr35 = new Object[1];
            f(bArr9[420], (short) 202, bArr9[5], objArr35);
            Object[] objArr36 = (Object[]) cls2.getMethod((String) objArr35[0], Context.class, Integer.TYPE, Integer.TYPE).invoke(null, objArr33);
            if (applicationContext4 != null) {
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault18 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-337894567);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault18 == null) {
                    char cGreen = (char) Color.green(0);
                    int i27 = (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 875;
                    int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0) + 10;
                    byte[] bArr10 = $$a;
                    Object[] objArr37 = new Object[1];
                    e(bArr10[27], (short) 89, bArr10[24], objArr37);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault18 = initSession.b(cGreen, i27, iMakeMeasureSpec, 256017550, false, (String) objArr37[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault18).set(null, objArr36);
                try {
                    long jLongValue4 = ((Long) Class.forName(str3).getDeclaredMethod(str4, new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf3 = Long.valueOf(jLongValue4);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault19 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1823069286);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault19 == null) {
                        char c4 = (char) (1 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)));
                        int modifierMetaStateMask = ((byte) KeyEvent.getModifierMetaStateMask()) + 877;
                        int maximumFlingVelocity2 = 10 - (ViewConfiguration.getMaximumFlingVelocity() >> 16);
                        byte b5 = $$a[24];
                        Object[] objArr38 = new Object[1];
                        e(b5, (short) (b5 | 141), (byte) ($$b - 5), objArr38);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault19 = initSession.b(c4, modifierMetaStateMask, maximumFlingVelocity2, 2009631821, false, (String) objArr38[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault19).set(null, lValueOf3);
                    Long lValueOf4 = Long.valueOf(jLongValue4 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault20 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-342512172);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault20 == null) {
                        char keyRepeatDelay = (char) (ViewConfiguration.getKeyRepeatDelay() >> 16);
                        int i28 = 876 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
                        int iNormalizeMetaState = KeyEvent.normalizeMetaState(0) + 10;
                        Object[] objArr39 = new Object[1];
                        e((byte) ($$b >>> 2), (short) 141, $$a[24], objArr39);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault20 = initSession.b(keyRepeatDelay, i28, iNormalizeMetaState, 252381699, false, (String) objArr39[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault20).set(null, lValueOf4);
                } catch (Exception unused2) {
                    throw new RuntimeException();
                }
            } else {
                objArr36 = objArr36;
            }
            objArr2 = objArr36;
        }
        int i29 = ((int[]) objArr2[2])[0];
        int i30 = ((int[]) objArr2[0])[0];
        if (i30 == i29) {
            int i31 = ((int[]) objArr2[1])[0];
            objArr3 = new Object[]{new int[]{((int[]) objArr2[0])[0]}, new int[1], new int[]{((int[]) objArr2[2])[0]}, (String[]) objArr2[3]};
            int iFreeMemory = (int) Runtime.getRuntime().freeMemory();
            int i32 = ~(268384119 | iFreeMemory);
            int i33 = i31 + 1940902004 + ((6299936 | i32) * (-476)) + (i32 * 952) + ((~((~iFreeMemory) | 268384119)) * 476);
            int i34 = (i33 << 13) ^ i33;
            int i35 = i34 ^ (i34 >>> 17);
            ((int[]) objArr3[1])[0] = i35 ^ (i35 << 5);
            i = 0;
        } else {
            Toast.makeText((Context) null, i30 / (((i30 - 1) * i30) % 2), 0).show();
            int i36 = ((int[]) objArr2[1])[0];
            objArr3 = new Object[]{new int[]{((int[]) objArr2[0])[0]}, new int[1], new int[]{((int[]) objArr2[2])[0]}, (String[]) objArr2[3]};
            int iIdentityHashCode3 = System.identityHashCode(this);
            int i37 = ~iIdentityHashCode3;
            int i38 = i36 + (((~(701301058 | i37)) | (~((-741611288) | iIdentityHashCode3)) | (~(i37 | 741611287))) * 959) + 1380212968 + (((~(iIdentityHashCode3 | 741611287)) | (~(i37 | (-741611288))) | (~(701301058 | iIdentityHashCode3))) * 959);
            int i39 = i38 ^ (i38 << 13);
            int i40 = i39 ^ (i39 >>> 17);
            i = 0;
            ((int[]) objArr3[1])[0] = i40 ^ (i40 << 5);
        }
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault21 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1354724972);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault21 == null) {
            char cKeyCodeFromString2 = (char) (KeyEvent.keyCodeFromString("") + 43042);
            int deadChar = 3111 - KeyEvent.getDeadChar(i, i);
            int iArgb = 22 - Color.argb(i, i, i, i);
            byte b6 = $$a[24];
            Object[] objArr40 = new Object[1];
            e(b6, (short) (b6 | 89), (byte) ($$b - 5), objArr40);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault21 = initSession.b(cKeyCodeFromString2, deadChar, iArgb, -1272852037, false, (String) objArr40[0], null);
        }
        if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault21).getLong(null) != -1) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault22 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-308143642);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault22 == null) {
                char absoluteGravity = (char) (43042 - Gravity.getAbsoluteGravity(0, 0));
                int iAlpha2 = Color.alpha(0) + 3111;
                int scrollDefaultDelay = 22 - (ViewConfiguration.getScrollDefaultDelay() >> 16);
                byte b7 = $$a[24];
                short s = (short) (b7 | 37);
                Object[] objArr41 = new Object[1];
                e(b7, s, (byte) s, objArr41);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault22 = initSession.b(absoluteGravity, iAlpha2, scrollDefaultDelay, 154975793, false, (String) objArr41[0], null);
            }
            Object[] objArr42 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault22).get(null);
            int i41 = ((int[]) objArr42[2])[0];
            int i42 = ((int[]) objArr42[1])[0];
            String[] strArr2 = (String[]) objArr42[3];
            int[] iArr = {i41};
            int[] iArr2 = {i42};
            int iElapsedRealtime = (int) SystemClock.elapsedRealtime();
            int i43 = ~iElapsedRealtime;
            int i44 = 1953793838 + (((~((-1063683928) | i43)) | (-641347532)) * (-865)) + ((~(iElapsedRealtime | 1063683927)) * 865) + (((~((-641347532) | i43)) | (~(i43 | 1063683927))) * 865) + 937143733;
            int i45 = (i44 << 13) ^ i44;
            int i46 = i45 ^ (i45 >>> 17);
            ((int[]) objArr4[0])[0] = i46 ^ (i46 << 5);
            objArr4 = new Object[]{new int[1], iArr2, iArr, strArr2};
            objArr3 = objArr3;
        } else {
            Object[] objArr43 = {null, Integer.valueOf(((Integer) Class.forName(str5).getMethod(str6, Object.class).invoke(null, this)).intValue()), 0, 937143733};
            short s2 = (short) ($$e | 110);
            byte[] bArr11 = $$d;
            Object[] objArr44 = new Object[1];
            f((byte) 105, s2, bArr11[16], objArr44);
            Class<?> cls3 = Class.forName((String) objArr44[0]);
            Object[] objArr45 = new Object[1];
            f(bArr11[420], (short) 102, bArr11[5], objArr45);
            Object[] objArr46 = (Object[]) cls3.getMethod((String) objArr45[0], Class.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr43);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault23 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-308143642);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault23 == null) {
                char cNormalizeMetaState = (char) (43042 - KeyEvent.normalizeMetaState(0));
                int iIndexOf4 = TextUtils.indexOf((CharSequence) "", '0') + 3112;
                int minimumFlingVelocity3 = (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 22;
                byte b8 = $$a[24];
                short s3 = (short) (b8 | 37);
                Object[] objArr47 = new Object[1];
                e(b8, s3, (byte) s3, objArr47);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault23 = initSession.b(cNormalizeMetaState, iIndexOf4, minimumFlingVelocity3, 154975793, false, (String) objArr47[0], null);
            }
            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault23).set(null, objArr46);
            try {
                long jLongValue5 = ((Long) Class.forName(str3).getDeclaredMethod(str4, new Class[0]).invoke(null, new Object[0])).longValue();
                Long lValueOf5 = Long.valueOf(jLongValue5);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault24 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1355648493);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault24 == null) {
                    char pressedStateDuration2 = (char) (43042 - (ViewConfiguration.getPressedStateDuration() >> 16));
                    int i47 = 3110 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1));
                    int i48 = (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 22;
                    byte b9 = $$a[24];
                    short s4 = b9;
                    Object[] objArr48 = new Object[1];
                    e(b9, s4, (byte) (s4 | 52), objArr48);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault24 = initSession.b(pressedStateDuration2, i47, i48, -1269618118, false, (String) objArr48[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault24).set(null, lValueOf5);
                Long lValueOf6 = Long.valueOf(jLongValue5 >> 12);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault25 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1354724972);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault25 == null) {
                    char c5 = (char) (43043 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)));
                    int i49 = 3112 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1));
                    int scrollBarFadeDuration = (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 22;
                    byte b10 = $$a[24];
                    Object[] objArr49 = new Object[1];
                    e(b10, (short) (b10 | 89), (byte) ($$b - 5), objArr49);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault25 = initSession.b(c5, i49, scrollBarFadeDuration, -1272852037, false, (String) objArr49[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault25).set(null, lValueOf6);
                objArr4 = objArr46;
            } catch (Exception unused3) {
                throw new RuntimeException();
            }
        }
        int i50 = ((int[]) objArr4[1])[0];
        int i51 = ((int[]) objArr4[2])[0];
        if (i51 == i50) {
            int i52 = ((int[]) objArr4[0])[0];
            int i53 = ((int[]) objArr4[2])[0];
            int i54 = ((int[]) objArr4[1])[0];
            String[] strArr3 = (String[]) objArr4[3];
            int[] iArr3 = {i53};
            int[] iArr4 = {i54};
            int startElapsedRealtime = (int) Process.getStartElapsedRealtime();
            int i55 = (-923554914) + (((~((-816595177) | startElapsedRealtime)) | 524480 | (~(888436282 | startElapsedRealtime))) * (-754));
            int i56 = ~((-524481) | startElapsedRealtime);
            int i57 = ~startElapsedRealtime;
            int i58 = i52 + i55 + ((i56 | (~(888960762 | i57))) * (-754)) + ((i57 | (-816595177)) * 754);
            int i59 = (i58 << 13) ^ i58;
            int i60 = i59 ^ (i59 >>> 17);
            ((int[]) objArr5[0])[0] = i60 ^ (i60 << 5);
            objArr5 = new Object[]{new int[1], iArr4, iArr3, strArr3};
            i2 = 0;
        } else {
            ArrayList arrayList2 = new ArrayList();
            String[] strArr4 = (String[]) objArr4[3];
            if (strArr4 != null) {
                for (String str8 : strArr4) {
                    arrayList2.add(str8);
                }
            }
            int[] iArr5 = new int[i51];
            int i61 = i51 - 1;
            iArr5[i61] = 1;
            Toast.makeText((Context) null, iArr5[((i51 * i61) % 2) - 1], 1).show();
            int i62 = ((int[]) objArr4[0])[0];
            int i63 = ((int[]) objArr4[2])[0];
            int i64 = ((int[]) objArr4[1])[0];
            String[] strArr5 = (String[]) objArr4[3];
            int[] iArr6 = {i63};
            int[] iArr7 = {i64};
            int iMaxMemory = (int) Runtime.getRuntime().maxMemory();
            int i65 = ~iMaxMemory;
            int i66 = i62 + (-158443254) + ((iMaxMemory | 910242380) * 140) + (((~(910242380 | i65)) | 152994962) * (-280)) + (((~(iMaxMemory | (-152994963))) | (~(794789078 | i65)) | 268448264) * 140);
            int i67 = (i66 << 13) ^ i66;
            int i68 = i67 ^ (i67 >>> 17);
            i2 = 0;
            ((int[]) objArr5[0])[0] = i68 ^ (i68 << 5);
            objArr5 = new Object[]{new int[1], iArr7, iArr6, strArr5};
        }
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault26 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault26 == null) {
            char cGreen2 = (char) Color.green(i2);
            int bitsPerPixel2 = 1030 - ImageFormat.getBitsPerPixel(i2);
            int iLastIndexOf3 = 14 - TextUtils.lastIndexOf("", '0');
            byte b11 = $$a[24];
            Object[] objArr50 = new Object[1];
            e(b11, (short) (b11 | 89), (byte) ($$b - 5), objArr50);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault26 = initSession.b(cGreen2, bitsPerPixel2, iLastIndexOf3, 1357589585, false, (String) objArr50[0], null);
        }
        long j3 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault26).getLong(null);
        long jLongValue6 = ((Long) Class.forName(str3).getDeclaredMethod(str4, new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault27 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault27 == null) {
            char cRgb = (char) (ViewCompat.MEASURED_STATE_MASK - Color.rgb(0, 0, 0));
            int iIndexOf5 = 1030 - TextUtils.indexOf((CharSequence) "", '0');
            int iIndexOf6 = TextUtils.indexOf("", "", 0) + 15;
            byte b12 = $$a[24];
            short s5 = b12;
            Object[] objArr51 = new Object[1];
            e(b12, s5, (byte) (s5 | 52), objArr51);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault27 = initSession.b(cRgb, iIndexOf5, iIndexOf6, 1344079056, false, (String) objArr51[0], null);
        }
        if (j3 == ((jLongValue6 - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault27).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault28 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault28 == null) {
                char maxKeyCode = (char) (KeyEvent.getMaxKeyCode() >> 16);
                int doubleTapTimeout = 1031 - (ViewConfiguration.getDoubleTapTimeout() >> 16);
                int iIndexOf7 = 14 - TextUtils.indexOf((CharSequence) "", '0');
                Object[] objArr52 = new Object[1];
                e((byte) ($$b >>> 2), (short) 141, $$a[24], objArr52);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault28 = initSession.b(maxKeyCode, doubleTapTimeout, iIndexOf7, 632103528, false, (String) objArr52[0], null);
            }
            Object[] objArr53 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault28).get(null);
            objArr6 = new Object[]{strArr, new int[]{i}, new int[1], new int[]{i}};
            int i69 = ((int[]) objArr53[3])[0];
            int i70 = ((int[]) objArr53[1])[0];
            String[] strArr6 = (String[]) objArr53[0];
            int i71 = ~System.identityHashCode(this);
            int i72 = ((325801462 + (((~((-9400602) | i71)) | (-234879569)) * (-933))) + (((~(i71 | (-234879569))) | 225479232) * 933)) - 1628681444;
            int i73 = (i72 << 13) ^ i72;
            int i74 = i73 ^ (i73 >>> 17);
            ((int[]) objArr6[2])[0] = i74 ^ (i74 << 5);
        } else {
            int iIntValue = ((Integer) Class.forName(str5).getMethod(str6, Object.class).invoke(null, this)).intValue();
            try {
                Object[] objArr54 = {1486222946};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault29 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-725886332);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault29 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault29 = initSession.b((char) (46038 - (ViewConfiguration.getEdgeSlop() >> 16)), TextUtils.getOffsetBefore("", 0) + 1134, View.MeasureSpec.getMode(0) + 18, 807763283, false, null, new Class[]{Integer.TYPE});
                }
                Object[] objArr55 = {Integer.valueOf(iIntValue), 0, -1529128418, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault29).newInstance(objArr54), false};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault30 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1443305588);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault30 == null) {
                    char cIndexOf = (char) TextUtils.indexOf("", "", 0, 0);
                    int longPressTimeout = 1031 - (ViewConfiguration.getLongPressTimeout() >> 16);
                    int scrollDefaultDelay2 = 15 - (ViewConfiguration.getScrollDefaultDelay() >> 16);
                    byte b13 = $$a[24];
                    Object[] objArr56 = new Object[1];
                    e(b13, (short) (b13 | 89), (byte) ($$b - 5), objArr56);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault30 = initSession.b(cIndexOf, longPressTimeout, scrollDefaultDelay2, 1298546779, false, (String) objArr56[0], new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) ((Process.myPid() >> 22) + 45993), 1118 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), 17 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1))), Boolean.TYPE});
                }
                objArr6 = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault30).invoke(null, objArr55);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault31 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault31 == null) {
                    char maximumDrawingCacheSize = (char) (ViewConfiguration.getMaximumDrawingCacheSize() >> 24);
                    int i75 = (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 1030;
                    int i76 = (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 16;
                    Object[] objArr57 = new Object[1];
                    e((byte) ($$b >>> 2), (short) 141, $$a[24], objArr57);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault31 = initSession.b(maximumDrawingCacheSize, i75, i76, 632103528, false, (String) objArr57[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault31).set(null, objArr6);
                try {
                    long jLongValue7 = ((Long) Class.forName(str3).getDeclaredMethod(str4, new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf7 = Long.valueOf(jLongValue7);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault32 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault32 == null) {
                        char gidForName = (char) ((-1) - Process.getGidForName(""));
                        int minimumFlingVelocity4 = 1031 - (ViewConfiguration.getMinimumFlingVelocity() >> 16);
                        int iMyPid = (Process.myPid() >> 22) + 15;
                        byte b14 = $$a[24];
                        short s6 = b14;
                        Object[] objArr58 = new Object[1];
                        e(b14, s6, (byte) (s6 | 52), objArr58);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault32 = initSession.b(gidForName, minimumFlingVelocity4, iMyPid, 1344079056, false, (String) objArr58[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault32).set(null, lValueOf7);
                    Long lValueOf8 = Long.valueOf(jLongValue7 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault33 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault33 == null) {
                        char trimmedLength = (char) TextUtils.getTrimmedLength("");
                        int iMakeMeasureSpec2 = 1031 - View.MeasureSpec.makeMeasureSpec(0, 0);
                        int maximumFlingVelocity3 = 15 - (ViewConfiguration.getMaximumFlingVelocity() >> 16);
                        byte b15 = $$a[24];
                        Object[] objArr59 = new Object[1];
                        e(b15, (short) (b15 | 89), (byte) ($$b - 5), objArr59);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault33 = initSession.b(trimmedLength, iMakeMeasureSpec2, maximumFlingVelocity3, 1357589585, false, (String) objArr59[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault33).set(null, lValueOf8);
                } catch (Exception unused4) {
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
        int i77 = ((int[]) objArr6[1])[0];
        int i78 = ((int[]) objArr6[3])[0];
        if (i78 != i77) {
            ArrayList arrayList3 = new ArrayList();
            String[] strArr7 = (String[]) objArr6[0];
            if (strArr7 != null) {
                for (String str9 : strArr7) {
                    arrayList3.add(str9);
                }
            }
            throw new RuntimeException(String.valueOf(i78));
        }
        Object[] objArr60 = {strArr, new int[]{i}, new int[1], new int[]{i}};
        int i79 = ((int[]) objArr6[2])[0];
        int i80 = ((int[]) objArr6[3])[0];
        int i81 = ((int[]) objArr6[1])[0];
        String[] strArr8 = (String[]) objArr6[0];
        int startUptimeMillis = (int) Process.getStartUptimeMillis();
        int i82 = ~startUptimeMillis;
        int i83 = i79 + 213952754 + (((~(i82 | (-368528826))) | 292635800 | (~((-536915971) | startUptimeMillis))) * 717) + (((~(startUptimeMillis | (-368528826))) | (~(i82 | (-536915971))) | 292635800) * 717);
        int i84 = (i83 << 13) ^ i83;
        int i85 = i84 ^ (i84 >>> 17);
        ((int[]) objArr60[2])[0] = i85 ^ (i85 << 5);
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault34 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault34 == null) {
            char scrollBarFadeDuration2 = (char) (31533 - (ViewConfiguration.getScrollBarFadeDuration() >> 16));
            int trimmedLength2 = TextUtils.getTrimmedLength("") + 921;
            int keyRepeatTimeout = (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 28;
            Object[] objArr61 = new Object[1];
            e((byte) ($$b >>> 2), (short) 141, $$a[24], objArr61);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault34 = initSession.b(scrollBarFadeDuration2, trimmedLength2, keyRepeatTimeout, -1048449946, false, (String) objArr61[0], null);
        }
        if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault34).getLong(null) != -1) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault35 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault35 == null) {
                char cAlpha = (char) (31533 - Color.alpha(0));
                int iMakeMeasureSpec3 = 921 - View.MeasureSpec.makeMeasureSpec(0, 0);
                int windowTouchSlop = 28 - (ViewConfiguration.getWindowTouchSlop() >> 8);
                byte b16 = $$a[24];
                short s7 = (short) (b16 | 37);
                Object[] objArr62 = new Object[1];
                e(b16, s7, (byte) s7, objArr62);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault35 = initSession.b(cAlpha, iMakeMeasureSpec3, windowTouchSlop, -1142834547, false, (String) objArr62[0], null);
            }
            Object[] objArr63 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault35).get(null);
            objArr7 = new Object[]{new int[1], new int[]{((int[]) objArr63[1])[0]}, (Object[]) objArr63[2], new int[]{((int[]) objArr63[3])[0]}, (String[]) objArr63[4]};
            int iIdentityHashCode4 = System.identityHashCode(this);
            int i86 = ((((-1737551355) + (((~((~iIdentityHashCode4) | (-285224468))) | (~(1064304279 | iIdentityHashCode4))) * (-302))) + ((~((-285224468) | iIdentityHashCode4)) * (-604))) + (((~(iIdentityHashCode4 | 779079812)) | 69304448) * 302)) - 1063259697;
            int i87 = (i86 << 13) ^ i86;
            int i88 = i87 ^ (i87 >>> 17);
            ((int[]) objArr7[0])[0] = i88 ^ (i88 << 5);
            context = p0;
            objArr60 = objArr60;
        } else {
            context = p0;
            if (context == null) {
                applicationContext = context;
            } else if (context instanceof ContextWrapper) {
                int i89 = onTransact + 51;
                cancel = i89 % 128;
                if (i89 % 2 == 0) {
                    int i90 = 16 / 0;
                    if (((ContextWrapper) context).getBaseContext() != null) {
                        applicationContext = p0.getApplicationContext();
                    } else {
                        applicationContext = null;
                    }
                } else if (((ContextWrapper) context).getBaseContext() != null) {
                    applicationContext = p0.getApplicationContext();
                } else {
                    applicationContext = null;
                }
            } else {
                applicationContext = p0.getApplicationContext();
            }
            Object[] objArr64 = {applicationContext, Integer.valueOf(((Integer) Class.forName(str5).getMethod(str6, Object.class).invoke(null, this)).intValue()), 0, -1063259697};
            byte[] bArr12 = $$d;
            Object[] objArr65 = new Object[1];
            f(bArr12[420], (short) 372, (byte) (bArr12[337] - 1), objArr65);
            Class<?> cls4 = Class.forName((String) objArr65[0]);
            Object[] objArr66 = new Object[1];
            f(bArr12[420], (short) 102, bArr12[5], objArr66);
            Object[] objArr67 = (Object[]) cls4.getMethod((String) objArr66[0], Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr64);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault36 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault36 == null) {
                char c6 = (char) ((TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 31533);
                int maximumDrawingCacheSize2 = 921 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24);
                int iRgb = (-16777188) - Color.rgb(0, 0, 0);
                byte b17 = $$a[24];
                short s8 = (short) (b17 | 37);
                Object[] objArr68 = new Object[1];
                e(b17, s8, (byte) s8, objArr68);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault36 = initSession.b(c6, maximumDrawingCacheSize2, iRgb, -1142834547, false, (String) objArr68[0], null);
            }
            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault36).set(null, objArr67);
            try {
                long jLongValue8 = ((Long) Class.forName(str3).getDeclaredMethod(str4, new Class[0]).invoke(null, new Object[0])).longValue();
                Long lValueOf9 = Long.valueOf(jLongValue8);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault37 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(889369593);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault37 == null) {
                    char deadChar2 = (char) (KeyEvent.getDeadChar(0, 0) + 31533);
                    int trimmedLength3 = TextUtils.getTrimmedLength("") + 921;
                    int modifierMetaStateMask2 = 27 - ((byte) KeyEvent.getModifierMetaStateMask());
                    byte b18 = $$a[24];
                    short s9 = b18;
                    Object[] objArr69 = new Object[1];
                    e(b18, s9, (byte) (s9 | 52), objArr69);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault37 = initSession.b(deadChar2, trimmedLength3, modifierMetaStateMask2, -778300370, false, (String) objArr69[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault37).set(null, lValueOf9);
                Long lValueOf10 = Long.valueOf(jLongValue8 >> 12);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault38 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault38 == null) {
                    char bitsPerPixel3 = (char) (ImageFormat.getBitsPerPixel(0) + 31534);
                    int absoluteGravity2 = 921 - Gravity.getAbsoluteGravity(0, 0);
                    int scrollDefaultDelay3 = (ViewConfiguration.getScrollDefaultDelay() >> 16) + 28;
                    Object[] objArr70 = new Object[1];
                    e((byte) ($$b >>> 2), (short) 141, $$a[24], objArr70);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault38 = initSession.b(bitsPerPixel3, absoluteGravity2, scrollDefaultDelay3, -1048449946, false, (String) objArr70[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault38).set(null, lValueOf10);
                objArr7 = objArr67;
            } catch (Exception unused5) {
                throw new RuntimeException();
            }
        }
        int i91 = ((int[]) objArr7[1])[0];
        int i92 = ((int[]) objArr7[3])[0];
        if (i92 != i91) {
            ArrayList arrayList4 = new ArrayList();
            String[] strArr9 = (String[]) objArr7[4];
            if (strArr9 != null) {
                for (String str10 : strArr9) {
                    int i93 = cancel + 79;
                    onTransact = i93 % 128;
                    int i94 = i93 % 2;
                    arrayList4.add(str10);
                }
            }
            throw new RuntimeException(String.valueOf(i92));
        }
        int i95 = ((int[]) objArr7[0])[0];
        Object[] objArr71 = {new int[1], new int[]{((int[]) objArr7[1])[0]}, (Object[]) objArr7[2], new int[]{((int[]) objArr7[3])[0]}, (String[]) objArr7[4]};
        int i96 = ~System.identityHashCode(this);
        int i97 = i95 + 713466227 + (((-1360135683) | i96) * 184) + (((~(i96 | 212617337)) | (-1371426396)) * 184);
        int i98 = (i97 << 13) ^ i97;
        int i99 = i98 ^ (i98 >>> 17);
        ((int[]) objArr71[0])[0] = i99 ^ (i99 << 5);
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault39 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2030658839);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault39 == null) {
            char cArgb = (char) Color.argb(0, 0, 0, 0);
            int i100 = 876 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
            int iIndexOf8 = TextUtils.indexOf((CharSequence) "", '0') + 11;
            byte b19 = $$a[24];
            short s10 = (short) (b19 | 37);
            Object[] objArr72 = new Object[1];
            e(b19, s10, (byte) s10, objArr72);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault39 = initSession.b(cArgb, i100, iIndexOf8, -1650998592, false, (String) objArr72[0], null);
        }
        long j4 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault39).getLong(null);
        long jLongValue9 = ((Long) Class.forName(str3).getDeclaredMethod(str4, new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault40 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1821222244);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault40 == null) {
            char capsMode = (char) TextUtils.getCapsMode("", 0, 0);
            int i101 = (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 875;
            int offsetBefore = 10 - TextUtils.getOffsetBefore("", 0);
            byte b20 = $$a[24];
            short s11 = b20;
            Object[] objArr73 = new Object[1];
            e(b20, s11, (byte) (s11 | 52), objArr73);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault40 = initSession.b(capsMode, i101, offsetBefore, 2012020043, false, (String) objArr73[0], null);
        }
        if (j4 == ((jLongValue9 - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault40).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault41 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1822145765);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault41 == null) {
                char c7 = (char) (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                int packedPositionType2 = 876 - ExpandableListView.getPackedPositionType(0L);
                int iKeyCodeFromString = KeyEvent.keyCodeFromString("") + 10;
                byte b21 = $$a[24];
                Object[] objArr74 = new Object[1];
                e(b21, (short) (b21 | 89), (byte) ($$b - 5), objArr74);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault41 = initSession.b(c7, packedPositionType2, iKeyCodeFromString, 2012931276, false, (String) objArr74[0], null);
            }
            Object[] objArr75 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault41).get(null);
            objArr8 = new Object[]{new int[]{((int[]) objArr75[0])[0]}, new int[1], new int[]{((int[]) objArr75[2])[0]}, (String[]) objArr75[3]};
            int i102 = ~System.identityHashCode(this);
            int i103 = (((~((-105583466) | i102)) | 67633769) * (-241)) + 1125996747 + (((~(i102 | (-37949697))) | (-132907006)) * 241) + 1666681904;
            int i104 = (i103 << 13) ^ i103;
            int i105 = i104 ^ (i104 >>> 17);
            ((int[]) objArr8[1])[0] = i105 ^ (i105 << 5);
            str = str4;
        } else {
            Context applicationContext5 = context != null ? ((context instanceof ContextWrapper) && ((ContextWrapper) context).getBaseContext() == null) ? null : p0.getApplicationContext() : context;
            Object[] objArr76 = {applicationContext5, Integer.valueOf(((Integer) Class.forName(str5).getMethod(str6, Object.class).invoke(null, this)).intValue()), 0, 1666681904};
            byte[] bArr13 = $$d;
            Object[] objArr77 = new Object[1];
            f((byte) (-bArr13[112]), (short) TypedValues.CycleType.TYPE_WAVE_OFFSET, bArr13[5], objArr77);
            Class<?> cls5 = Class.forName((String) objArr77[0]);
            Object[] objArr78 = new Object[1];
            f(bArr13[420], (short) ($$e | 321), bArr13[5], objArr78);
            Object[] objArr79 = (Object[]) cls5.getMethod((String) objArr78[0], Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr76);
            if (applicationContext5 != null) {
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault42 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1822145765);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault42 == null) {
                    char edgeSlop2 = (char) (ViewConfiguration.getEdgeSlop() >> 16);
                    int iResolveSizeAndState = View.resolveSizeAndState(0, 0, 0) + 876;
                    int absoluteGravity3 = Gravity.getAbsoluteGravity(0, 0) + 10;
                    byte b22 = $$a[24];
                    Object[] objArr80 = new Object[1];
                    e(b22, (short) (b22 | 89), (byte) ($$b - 5), objArr80);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault42 = initSession.b(edgeSlop2, iResolveSizeAndState, absoluteGravity3, 2012931276, false, (String) objArr80[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault42).set(null, objArr79);
                try {
                    str = str4;
                    long jLongValue10 = ((Long) Class.forName(str3).getDeclaredMethod(str, new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf11 = Long.valueOf(jLongValue10);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault43 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1821222244);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault43 == null) {
                        char jumpTapTimeout = (char) (ViewConfiguration.getJumpTapTimeout() >> 16);
                        int iIndexOf9 = 876 - TextUtils.indexOf("", "");
                        int iIndexOf10 = TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 11;
                        byte b23 = $$a[24];
                        short s12 = b23;
                        Object[] objArr81 = new Object[1];
                        e(b23, s12, (byte) (s12 | 52), objArr81);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault43 = initSession.b(jumpTapTimeout, iIndexOf9, iIndexOf10, 2012020043, false, (String) objArr81[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault43).set(null, lValueOf11);
                    Long lValueOf12 = Long.valueOf(jLongValue10 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault44 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2030658839);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault44 == null) {
                        char maxKeyCode2 = (char) (KeyEvent.getMaxKeyCode() >> 16);
                        int i106 = 875 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1));
                        int offsetBefore2 = 10 - TextUtils.getOffsetBefore("", 0);
                        byte b24 = $$a[24];
                        short s13 = (short) (b24 | 37);
                        Object[] objArr82 = new Object[1];
                        e(b24, s13, (byte) s13, objArr82);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault44 = initSession.b(maxKeyCode2, i106, offsetBefore2, -1650998592, false, (String) objArr82[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault44).set(null, lValueOf12);
                } catch (Exception unused6) {
                    throw new RuntimeException();
                }
            } else {
                str = str4;
                objArr79 = objArr79;
            }
            objArr8 = objArr79;
        }
        int i107 = ((int[]) objArr8[2])[0];
        int i108 = ((int[]) objArr8[0])[0];
        if (i108 != i107) {
            throw new RuntimeException(String.valueOf(i108));
        }
        int i109 = ((int[]) objArr8[1])[0];
        Object[] objArr83 = {new int[]{((int[]) objArr8[0])[0]}, new int[1], new int[]{((int[]) objArr8[2])[0]}, (String[]) objArr8[3]};
        int i110 = ~(System.identityHashCode(this) | 133978090);
        int i111 = i109 + (((-40441344) | i110) * (-658)) + 1501084116 + ((i110 | (-134043648)) * 658);
        int i112 = (i111 << 13) ^ i111;
        int i113 = i112 ^ (i112 >>> 17);
        ((int[]) objArr83[1])[0] = i113 ^ (i113 << 5);
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault45 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(650054);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault45 == null) {
            char absoluteGravity4 = (char) Gravity.getAbsoluteGravity(0, 0);
            int i114 = (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 650;
            int i115 = (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 43;
            byte b25 = $$a[24];
            Object[] objArr84 = new Object[1];
            e(b25, (short) (b25 | 141), (byte) ($$b - 5), objArr84);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault45 = initSession.b(absoluteGravity4, i114, i115, -459846511, false, (String) objArr84[0], null);
        }
        long j5 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault45).getLong(null);
        long jLongValue11 = ((Long) Class.forName(str3).getDeclaredMethod(str, new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault46 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(795782016);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault46 == null) {
            char c8 = (char) (1 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)));
            int i116 = (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 650;
            int iLastIndexOf4 = TextUtils.lastIndexOf("", '0', 0, 0) + 45;
            Object[] objArr85 = new Object[1];
            e((byte) ($$b >>> 2), (short) 141, $$a[24], objArr85);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault46 = initSession.b(c8, i116, iLastIndexOf4, -873460649, false, (String) objArr85[0], null);
        }
        if (j5 == ((jLongValue11 - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault46).getLong(null) << 52) >>> 52)) >> 12)) {
            int i117 = cancel + 97;
            onTransact = i117 % 128;
            int i118 = i117 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault47 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1148961515);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault47 == null) {
                char c9 = (char) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) - 1);
                int i119 = (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 651;
                int i120 = 45 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1));
                byte b26 = $$a[24];
                short s14 = (short) (b26 | 37);
                Object[] objArr86 = new Object[1];
                e(b26, s14, (byte) s14, objArr86);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault47 = initSession.b(c9, i119, i120, -1595579076, false, (String) objArr86[0], null);
            }
            Object[] objArr87 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault47).get(null);
            objArr9 = new Object[]{new int[]{i}, new String[0], new int[]{i}, new int[1]};
            int i121 = ((int[]) objArr87[2])[0];
            int i122 = ((int[]) objArr87[0])[0];
            int iMyUid = Process.myUid();
            int i123 = ~iMyUid;
            int i124 = 291618765 + (((~((-344645964) | i123)) | 8937546 | (~(341215153 | i123)) | (~((-5506737) | iMyUid))) * (-84));
            int i125 = (~(iMyUid | 341215153)) | 344645963;
            int i126 = ~(i123 | (-341215154));
            int i127 = i124 + ((i125 | i126) * (-84)) + ((5506736 | i126) * 84) + 1108472277;
            int i128 = (i127 << 13) ^ i127;
            int i129 = i128 ^ (i128 >>> 17);
            ((int[]) objArr9[3])[0] = i129 ^ (i129 << 5);
            i3 = 0;
        } else {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault48 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1686493381);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault48 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault48 = initSession.b((char) View.MeasureSpec.getSize(0), 1611 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), 26 - (ViewConfiguration.getScrollDefaultDelay() >> 16), 2145681644, false, null, new Class[0]);
            }
            Object[] objArr88 = {null, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault48).newInstance(null), 1108472277, 0};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault49 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1625117732);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault49 == null) {
                char c10 = (char) (1 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)));
                int i130 = 651 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
                int iBlue2 = Color.blue(0) + 44;
                Object[] objArr89 = new Object[1];
                e((byte) ($$b >>> 2), (short) 141, $$a[24], objArr89);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault49 = initSession.b(c10, i130, iBlue2, 2075921419, false, (String) objArr89[0], new Class[]{(Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) View.resolveSizeAndState(0, 0, 0), 695 - TextUtils.getTrimmedLength(""), TextUtils.indexOf("", "") + 98), (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (63406 - KeyEvent.getDeadChar(0, 0)), 793 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 83), Integer.TYPE, Integer.TYPE});
            }
            objArr9 = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault49).invoke(null, objArr88);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault50 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1148961515);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault50 == null) {
                char minimumFlingVelocity5 = (char) (ViewConfiguration.getMinimumFlingVelocity() >> 16);
                int mode = 651 - View.MeasureSpec.getMode(0);
                int mode2 = 44 - View.MeasureSpec.getMode(0);
                byte b27 = $$a[24];
                short s15 = (short) (b27 | 37);
                Object[] objArr90 = new Object[1];
                e(b27, s15, (byte) s15, objArr90);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault50 = initSession.b(minimumFlingVelocity5, mode, mode2, -1595579076, false, (String) objArr90[0], null);
            }
            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault50).set(null, objArr9);
            try {
                long jLongValue12 = ((Long) Class.forName(str3).getDeclaredMethod(str, new Class[0]).invoke(null, new Object[0])).longValue();
                Long lValueOf13 = Long.valueOf(jLongValue12);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault51 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(795782016);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault51 == null) {
                    char c11 = (char) ((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) - 1);
                    int i131 = (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 650;
                    int keyRepeatDelay2 = 44 - (ViewConfiguration.getKeyRepeatDelay() >> 16);
                    Object[] objArr91 = new Object[1];
                    e((byte) ($$b >>> 2), (short) 141, $$a[24], objArr91);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault51 = initSession.b(c11, i131, keyRepeatDelay2, -873460649, false, (String) objArr91[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault51).set(null, lValueOf13);
                Long lValueOf14 = Long.valueOf(jLongValue12 >> 12);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault52 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(650054);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault52 == null) {
                    char cNormalizeMetaState2 = (char) KeyEvent.normalizeMetaState(0);
                    int i132 = (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 650;
                    int bitsPerPixel4 = ImageFormat.getBitsPerPixel(0) + 45;
                    byte b28 = $$a[24];
                    Object[] objArr92 = new Object[1];
                    e(b28, (short) (b28 | 141), (byte) ($$b - 5), objArr92);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault52 = initSession.b(cNormalizeMetaState2, i132, bitsPerPixel4, -459846511, false, (String) objArr92[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault52).set(null, lValueOf14);
                i3 = 0;
            } catch (Exception unused7) {
                throw new RuntimeException();
            }
        }
        int i133 = ((int[]) objArr9[i3])[i3];
        int i134 = ((int[]) objArr9[2])[i3];
        if (i134 != i133) {
            ArrayList arrayList5 = new ArrayList();
            String[] strArr10 = (String[]) objArr9[1];
            if (strArr10 != null) {
                for (String str11 : strArr10) {
                    arrayList5.add(str11);
                }
            }
            throw new RuntimeException(String.valueOf(i134));
        }
        Object[] objArr93 = new Object[4];
        int[] iArr8 = new int[1];
        objArr93[i3] = iArr8;
        int[] iArr9 = new int[1];
        objArr93[2] = iArr9;
        objArr93[3] = new int[1];
        int i135 = ((int[]) objArr9[3])[i3];
        int i136 = ((int[]) objArr9[2])[i3];
        int i137 = ((int[]) objArr9[i3])[i3];
        iArr9[i3] = i136;
        iArr8[i3] = i137;
        objArr93[1] = new String[i3];
        int i138 = ~Process.myTid();
        int i139 = ~(709039623 | i138);
        int i140 = i135 + 677299981 + ((i139 | (-705608814)) * 764) + (((~(i138 | (-705608814))) | 704779269) * (-1528)) + (((-5089899) | i139) * 764);
        int i141 = (i140 << 13) ^ i140;
        int i142 = i141 ^ (i141 >>> 17);
        ((int[]) objArr93[3])[0] = i142 ^ (i142 << 5);
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault53 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault53 == null) {
            char absoluteGravity5 = (char) (29944 - Gravity.getAbsoluteGravity(0, 0));
            int fadingEdgeLength = 1755 - (ViewConfiguration.getFadingEdgeLength() >> 16);
            int absoluteGravity6 = Gravity.getAbsoluteGravity(0, 0) + 23;
            byte b29 = $$a[24];
            short s16 = (short) (b29 | 37);
            Object[] objArr94 = new Object[1];
            e(b29, s16, (byte) s16, objArr94);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault53 = initSession.b(absoluteGravity5, fadingEdgeLength, absoluteGravity6, 986134021, false, (String) objArr94[0], null);
        }
        if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault53).getLong(null) != -1) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault54 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault54 == null) {
                char packedPositionGroup = (char) (29944 - ExpandableListView.getPackedPositionGroup(0L));
                int iRed = 1755 - Color.red(0);
                int i143 = 24 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1));
                byte b30 = $$a[24];
                short s17 = b30;
                Object[] objArr95 = new Object[1];
                e(b30, s17, (byte) (s17 | 52), objArr95);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault54 = initSession.b(packedPositionGroup, iRed, i143, 1599039318, false, (String) objArr95[0], null);
            }
            Object[] objArr96 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault54).get(null);
            objArr10 = new Object[]{new int[]{((int[]) objArr96[0])[0]}, new int[]{((int[]) objArr96[1])[0]}, (Object[]) objArr96[2], new int[1], (String[]) objArr96[4]};
            int iIdentityHashCode5 = System.identityHashCode(this);
            int i144 = (((1320524901 + ((~((~iIdentityHashCode5) | (-90178059))) * (-116))) + ((974043237 | iIdentityHashCode5) * 116)) + (((~(iIdentityHashCode5 | 761440811)) | 302780484) * 116)) - 1451981638;
            int i145 = (i144 << 13) ^ i144;
            int i146 = i145 ^ (i145 >>> 17);
            ((int[]) objArr10[3])[0] = i146 ^ (i146 << 5);
        } else {
            int iIntValue2 = ((Integer) Class.forName(str5).getMethod(str6, Object.class).invoke(null, this)).intValue();
            Object[] objArr97 = {1503000565};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault55 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2063193834);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault55 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault55 = initSession.b((char) ((Process.myTid() >> 22) + 42049), (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 1726, 30 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), -1637387971, false, null, new Class[]{Integer.TYPE});
            }
            Object[] objArrB$7879113 = ScopeAlreadyCreatedException.b$7879113(iIntValue2, 0, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault55).newInstance(objArr97), -1451981638, false, true);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault56 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault56 == null) {
                char cLastIndexOf = (char) (29943 - TextUtils.lastIndexOf("", '0'));
                int offsetBefore3 = TextUtils.getOffsetBefore("", 0) + 1755;
                int deadChar3 = KeyEvent.getDeadChar(0, 0) + 23;
                byte b31 = $$a[24];
                short s18 = b31;
                Object[] objArr98 = new Object[1];
                e(b31, s18, (byte) (s18 | 52), objArr98);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault56 = initSession.b(cLastIndexOf, offsetBefore3, deadChar3, 1599039318, false, (String) objArr98[0], null);
            }
            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault56).set(null, objArrB$7879113);
            try {
                long jLongValue13 = ((Long) Class.forName(str3).getDeclaredMethod(str, new Class[0]).invoke(null, new Object[0])).longValue();
                Long lValueOf15 = Long.valueOf(jLongValue13);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault57 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1145728641);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault57 == null) {
                    char modifierMetaStateMask3 = (char) (29943 - ((byte) KeyEvent.getModifierMetaStateMask()));
                    int i147 = 1756 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1));
                    int i148 = 23 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
                    byte b32 = $$a[24];
                    Object[] objArr99 = new Object[1];
                    e(b32, (short) (b32 | 141), (byte) ($$b - 5), objArr99);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault57 = initSession.b(modifierMetaStateMask3, i147, i148, 1596667560, false, (String) objArr99[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault57).set(null, lValueOf15);
                Long lValueOf16 = Long.valueOf(jLongValue13 >> 12);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault58 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault58 == null) {
                    char cIndexOf2 = (char) (TextUtils.indexOf((CharSequence) "", '0', 0) + 29945);
                    int iIndexOf11 = TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 1756;
                    int scrollDefaultDelay4 = 23 - (ViewConfiguration.getScrollDefaultDelay() >> 16);
                    byte b33 = $$a[24];
                    short s19 = (short) (b33 | 37);
                    Object[] objArr100 = new Object[1];
                    e(b33, s19, (byte) s19, objArr100);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault58 = initSession.b(cIndexOf2, iIndexOf11, scrollDefaultDelay4, 986134021, false, (String) objArr100[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault58).set(null, lValueOf16);
                objArr10 = objArrB$7879113;
            } catch (Exception unused8) {
                throw new RuntimeException();
            }
        }
        if (((int[]) objArr10[0])[0] != ((int[]) objArr10[1])[0]) {
            ArrayList arrayList6 = new ArrayList();
            String[] strArr11 = (String[]) objArr10[4];
            if (strArr11 != null) {
                for (String str12 : strArr11) {
                    arrayList6.add(str12);
                }
            }
            throw null;
        }
        int i149 = ((int[]) objArr10[3])[0];
        Object[] objArr101 = {new int[]{((int[]) objArr10[0])[0]}, new int[]{((int[]) objArr10[1])[0]}, (Object[]) objArr10[2], new int[1], (String[]) objArr10[4]};
        int iMyUid2 = Process.myUid();
        int i150 = (-1637049415) + (((~(577557690 | iMyUid2)) | (-364955265)) * 672);
        int i151 = ~iMyUid2;
        int i152 = i149 + i150 + (((~(iMyUid2 | (-364955265))) | (~((-577557691) | i151))) * (-672)) + (((~(364955264 | i151)) | (-938268347)) * 672);
        int i153 = (i152 << 13) ^ i152;
        int i154 = i153 ^ (i153 >>> 17);
        ((int[]) objArr101[3])[0] = i154 ^ (i154 << 5);
        int i155 = ((int[]) objArr28[1])[0];
        int i156 = i155 * i155;
        int i157 = -(940530707 * i155);
        int i158 = (i156 & i157) + (i156 | i157);
        int i159 = -(i155 * (-502048541));
        int i160 = ((i158 ^ i159) + ((i159 & i158) << 1)) - 1571768551;
        int i161 = i160 >> 21;
        int i162 = ((i161 ^ (-4095)) + ((i161 & (-4095)) << 1)) / 2048;
        int i163 = (i162 ^ 1) + ((i162 & 1) << 1);
        int i164 = (i160 ^ i163) + ((i163 & i160) << 1);
        int i165 = i160 >> 15;
        int i166 = ((((-262143) | i165) << 1) - (i165 ^ (-262143))) / 131072;
        int i167 = -(((i166 ^ 1) + ((i166 & 1) << 1)) ^ i164);
        int i168 = (i167 & 5) + (i167 | 5);
        int i169 = i168 >> 16;
        int i170 = (((-131071) ^ i169) + ((i169 & (-131071)) << 1)) / 65536;
        int i171 = ((i170 | 1) << 1) - (i170 ^ 1);
        int i172 = 1812880 / (((-((i171 & 1) + (i171 | 1))) & i168) * 496);
        int i173 = ((int[]) objArr3[1])[0];
        int i174 = i173 * i173;
        int i175 = -(1179439845 * i173);
        int i176 = (((i174 ^ i175) + ((i174 & i175) << 1)) - (~(-(i173 * 499991641)))) - 1;
        int i177 = ((i176 | 1252854977) << 1) - (1252854977 ^ i176);
        int i178 = i177 >> 29;
        int i179 = (((i178 | (-15)) << 1) - (i178 ^ (-15))) / 8;
        int i180 = ((i179 | 1) << 1) - (i179 ^ 1);
        int i181 = ((i177 | i180) << 1) - (i180 ^ i177);
        int i182 = i177 >> 20;
        int i183 = -(i181 ^ ((((i182 & (-8191)) + (i182 | (-8191))) / 4096) - (-1)));
        int i184 = (i183 & 2) + (i183 | 2);
        int i185 = i184 >> 15;
        int i186 = ((((-262143) | i185) << 1) - (i185 ^ (-262143))) / 131072;
        int i187 = (i186 ^ 1) + ((i186 & 1) << 1);
        int i188 = i172 + (1305472 / (((-((i187 & 1) + (i187 | 1))) & i184) * 992));
        int i189 = ((int[]) objArr5[0])[0];
        int i190 = i189 * i189;
        int i191 = -(2018416374 * i189);
        int i192 = (((i190 ^ i191) + ((i190 & i191) << 1)) - (~(-(i189 * 155138028)))) - 1;
        int i193 = (i192 ^ 1409884129) + ((1409884129 & i192) << 1);
        int i194 = i193 >> 20;
        int i195 = (((i194 & (-8191)) + (i194 | (-8191))) / 4096) - (-1);
        int i196 = (i194 - 8191) / 4096;
        int i197 = -((((i193 | i195) << 1) - (i193 ^ i195)) ^ ((i196 ^ 1) + ((i196 & 1) << 1)));
        int i198 = (i197 & 1) + (i197 | 1);
        int i199 = i198 >> 29;
        int i200 = (((i199 | (-15)) << 1) - (i199 ^ (-15))) / 8;
        int i201 = (i200 & 1) + (i200 | 1);
        int i202 = i188 + (101830 / (((-((i201 ^ 1) + ((i201 & 1) << 1))) & i198) * 170));
        int i203 = ((int[]) objArr71[0])[0];
        int i204 = i203 * i203;
        int i205 = -(767744314 * i203);
        int i206 = ((i204 | i205) << 1) - (i204 ^ i205);
        int i207 = -(i203 * 1531644726);
        int i208 = (i206 & i207) + (i207 | i206);
        int i209 = (i208 & 936242240) + (936242240 | i208);
        int i210 = i209 >> 21;
        int i211 = ((((i210 | (-4095)) << 1) - (i210 ^ (-4095))) / 2048) - (-1);
        int i212 = ((i209 | i211) << 1) - (i211 ^ i209);
        int i213 = ((i209 >> 22) - 2047) / 1024;
        int i214 = (-(i212 ^ ((i213 ^ 1) + ((i213 & 1) << 1)))) + 3;
        int i215 = i214 >> 28;
        int i216 = ((((i215 | (-31)) << 1) - (i215 ^ (-31))) / 16) - (-1);
        int i217 = i202 + (74391 / ((i214 & (-(((i216 | 1) << 1) - (i216 ^ 1)))) * 181));
        int i218 = ((int[]) objArr83[1])[0];
        int i219 = ((i218 * i218) - (~(-(2123941422 * i218)))) - 1;
        int i220 = -(i218 * 1408646716);
        int i221 = (i219 & i220) + (i220 | i219);
        int i222 = (i221 ^ (-174072071)) + (((-174072071) & i221) << 1);
        int i223 = ((i222 >> 21) - 4095) / 2048;
        int i224 = (i223 ^ 1) + ((i223 & 1) << 1);
        int i225 = ((i222 | i224) << 1) - (i224 ^ i222);
        int i226 = i222 >> 26;
        int i227 = ((i226 & ComposerKt.defaultsKey) + (i226 | ComposerKt.defaultsKey)) / 64;
        int i228 = -(i225 ^ ((i227 ^ 1) + ((i227 & 1) << 1)));
        int i229 = ((i228 | 9) << 1) - (i228 ^ 9);
        int i230 = i229 >> 26;
        int i231 = ((i230 & ComposerKt.defaultsKey) + (i230 | ComposerKt.defaultsKey)) / 64;
        Intrinsics.checkNotNullParameter(p0, "4/context".substring(i217 + ((-18304506) / (((-(((i231 ^ 1) + ((i231 & 1) << 1)) - (-1))) & i229) * 958))));
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault59 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(797565291);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault59 == null) {
            char cCombineMeasuredStates = (char) View.combineMeasuredStates(0, 0);
            int keyRepeatDelay3 = 2267 - (ViewConfiguration.getKeyRepeatDelay() >> 16);
            int mode3 = View.MeasureSpec.getMode(0) + 33;
            byte b34 = $$a[24];
            short s20 = b34;
            Object[] objArr102 = new Object[1];
            e(b34, s20, (byte) (s20 | 52), objArr102);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault59 = initSession.b(cCombineMeasuredStates, keyRepeatDelay3, mode3, -887667012, false, (String) objArr102[0], null);
        }
        if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault59).getLong(null) != -1) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault60 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1013250600);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault60 == null) {
                char scrollDefaultDelay5 = (char) (ViewConfiguration.getScrollDefaultDelay() >> 16);
                int keyRepeatTimeout2 = (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 2267;
                int offsetAfter = 33 - TextUtils.getOffsetAfter("", 0);
                byte b35 = $$a[24];
                short s21 = (short) (b35 | 37);
                Object[] objArr103 = new Object[1];
                e(b35, s21, (byte) s21, objArr103);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault60 = initSession.b(scrollDefaultDelay5, keyRepeatTimeout2, offsetAfter, -654680577, false, (String) objArr103[0], null);
            }
            Object[] objArr104 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault60).get(null);
            objArr11 = new Object[]{new int[]{i}, strArr, new int[1], new int[]{i}};
            int i232 = ((int[]) objArr104[0])[0];
            int i233 = ((int[]) objArr104[3])[0];
            String[] strArr12 = (String[]) objArr104[1];
            int iIdentityHashCode6 = System.identityHashCode(this);
            int i234 = (-1765765115) + ((738980635 | iIdentityHashCode6) * 614);
            int i235 = ~iIdentityHashCode6;
            int i236 = i234 + (((~((-706545320) | i235)) | 671678979 | (~(102167996 | i235))) * (-1228)) + (((~(i235 | 773846975)) | (~((-34866341) | i235))) * 614) + 1642215403;
            int i237 = (i236 << 13) ^ i236;
            int i238 = i237 ^ (i237 >>> 17);
            ((int[]) objArr11[2])[0] = i238 ^ (i238 << 5);
            objArr93 = objArr93;
            objArr101 = objArr101;
        } else {
            if (p0 == null) {
                applicationContext2 = p0;
            } else if (p0 instanceof ContextWrapper) {
                int i239 = cancel + 93;
                onTransact = i239 % 128;
                if (i239 % 2 != 0) {
                    int i240 = 54 / 0;
                    if (((ContextWrapper) p0).getBaseContext() != null) {
                        applicationContext2 = p0.getApplicationContext();
                    } else {
                        applicationContext2 = null;
                    }
                } else if (((ContextWrapper) p0).getBaseContext() != null) {
                    applicationContext2 = p0.getApplicationContext();
                } else {
                    applicationContext2 = null;
                }
            } else {
                applicationContext2 = p0.getApplicationContext();
            }
            Object[] objArr105 = {applicationContext2, Integer.valueOf(((Integer) Class.forName(str5).getMethod(str6, Object.class).invoke(null, this)).intValue()), 0, 1642215403};
            byte[] bArr14 = $$d;
            byte b36 = bArr14[5];
            Object[] objArr106 = new Object[1];
            f(b36, (short) (b36 | 517), bArr14[58], objArr106);
            Class<?> cls6 = Class.forName((String) objArr106[0]);
            Object[] objArr107 = new Object[1];
            f(bArr14[420], (short) 202, bArr14[5], objArr107);
            Object[] objArr108 = (Object[]) cls6.getMethod((String) objArr107[0], Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr105);
            if (applicationContext2 != null) {
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault61 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1013250600);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault61 == null) {
                    char maxKeyCode3 = (char) (KeyEvent.getMaxKeyCode() >> 16);
                    int i241 = (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 2266;
                    int doubleTapTimeout2 = 33 - (ViewConfiguration.getDoubleTapTimeout() >> 16);
                    byte b37 = $$a[24];
                    short s22 = (short) (b37 | 37);
                    Object[] objArr109 = new Object[1];
                    e(b37, s22, (byte) s22, objArr109);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault61 = initSession.b(maxKeyCode3, i241, doubleTapTimeout2, -654680577, false, (String) objArr109[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault61).set(null, objArr108);
                try {
                    long jLongValue14 = ((Long) Class.forName(str3).getDeclaredMethod(str, new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf17 = Long.valueOf(jLongValue14);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault62 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(796641770);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault62 == null) {
                        char c12 = (char) (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                        int touchSlop2 = 2267 - (ViewConfiguration.getTouchSlop() >> 8);
                        int offsetAfter2 = TextUtils.getOffsetAfter("", 0) + 33;
                        byte b38 = $$a[24];
                        Object[] objArr110 = new Object[1];
                        e(b38, (short) (b38 | 89), (byte) ($$b - 5), objArr110);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault62 = initSession.b(c12, touchSlop2, offsetAfter2, -874156483, false, (String) objArr110[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault62).set(null, lValueOf17);
                    Long lValueOf18 = Long.valueOf(jLongValue14 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault63 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(797565291);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault63 == null) {
                        char minimumFlingVelocity6 = (char) (ViewConfiguration.getMinimumFlingVelocity() >> 16);
                        int jumpTapTimeout2 = 2267 - (ViewConfiguration.getJumpTapTimeout() >> 16);
                        int iIndexOf12 = TextUtils.indexOf((CharSequence) "", '0', 0) + 34;
                        byte b39 = $$a[24];
                        short s23 = b39;
                        Object[] objArr111 = new Object[1];
                        e(b39, s23, (byte) (s23 | 52), objArr111);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault63 = initSession.b(minimumFlingVelocity6, jumpTapTimeout2, iIndexOf12, -887667012, false, (String) objArr111[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault63).set(null, lValueOf18);
                } catch (Exception unused9) {
                    throw new RuntimeException();
                }
            } else {
                objArr108 = objArr108;
                objArr93 = objArr93;
                objArr101 = objArr101;
            }
            objArr11 = objArr108;
        }
        if (((int[]) objArr11[0])[0] != ((int[]) objArr11[3])[0]) {
            ArrayList arrayList7 = new ArrayList();
            String[] strArr13 = (String[]) objArr11[1];
            if (strArr13 != null) {
                for (String str13 : strArr13) {
                    arrayList7.add(str13);
                }
            }
            throw null;
        }
        Object[] objArr112 = {new int[]{i}, strArr, new int[1], new int[]{i}};
        int i242 = ((int[]) objArr11[2])[0];
        int i243 = ((int[]) objArr11[0])[0];
        int i244 = ((int[]) objArr11[3])[0];
        String[] strArr14 = (String[]) objArr11[1];
        int iIdentityHashCode7 = System.identityHashCode(this);
        int i245 = 960779205 + (((~((-526151434) | iIdentityHashCode7)) | (-282561883)) * (-318));
        int i246 = ~((-282561883) | iIdentityHashCode7);
        int i247 = ~iIdentityHashCode7;
        int i248 = i242 + i245 + ((i246 | (~(534769499 | i247))) * TypedValues.AttributesType.TYPE_PIVOT_TARGET) + (((~(iIdentityHashCode7 | 534769499)) | (~((-8618067) | i247))) * TypedValues.AttributesType.TYPE_PIVOT_TARGET);
        int i249 = (i248 << 13) ^ i248;
        int i250 = i249 ^ (i249 >>> 17);
        ((int[]) objArr112[2])[0] = i250 ^ (i250 << 5);
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault64 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(118372281);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault64 == null) {
            char c13 = (char) (37568 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)));
            int modifierMetaStateMask4 = 624 - ((byte) KeyEvent.getModifierMetaStateMask());
            int scrollBarSize = 14 - (ViewConfiguration.getScrollBarSize() >> 8);
            Object[] objArr113 = new Object[1];
            e((byte) ($$b >>> 2), (short) 141, $$a[24], objArr113);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault64 = initSession.b(c13, modifierMetaStateMask4, scrollBarSize, -477065106, false, (String) objArr113[0], null);
        }
        long j6 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault64).getLong(null);
        long jLongValue15 = ((Long) Class.forName(str3).getDeclaredMethod(str, new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault65 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(559617152);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault65 == null) {
            char longPressTimeout2 = (char) (37567 - (ViewConfiguration.getLongPressTimeout() >> 16));
            int maximumDrawingCacheSize3 = (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 625;
            int i251 = (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 13;
            byte b40 = $$a[24];
            Object[] objArr114 = new Object[1];
            e(b40, (short) (b40 | 89), (byte) ($$b - 5), objArr114);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault65 = initSession.b(longPressTimeout2, maximumDrawingCacheSize3, i251, -976899241, false, (String) objArr114[0], null);
        }
        if (j6 == ((jLongValue15 - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault65).getLong(null) << 52) >>> 52)) >> 12)) {
            int i252 = cancel + 109;
            onTransact = i252 % 128;
            int i253 = i252 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault66 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(560540673);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault66 == null) {
                char packedPositionGroup2 = (char) (37567 - ExpandableListView.getPackedPositionGroup(0L));
                int iKeyCodeFromString2 = 625 - KeyEvent.keyCodeFromString("");
                int iRgb2 = Color.rgb(0, 0, 0) + 16777230;
                byte b41 = $$a[24];
                short s24 = b41;
                Object[] objArr115 = new Object[1];
                e(b41, s24, (byte) (s24 | 52), objArr115);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault66 = initSession.b(packedPositionGroup2, iKeyCodeFromString2, iRgb2, -973632554, false, (String) objArr115[0], null);
            }
            Object[] objArr116 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault66).get(null);
            int i254 = ((int[]) objArr116[2])[0];
            int i255 = ((int[]) objArr116[0])[0];
            String[] strArr15 = (String[]) objArr116[3];
            int[] iArr10 = {i254};
            int[] iArr11 = {i255};
            int iMyPid2 = Process.myPid();
            int i256 = ~iMyPid2;
            int i257 = (((353156310 + (((~(i256 | 806112277)) | 1017625843) * (-1042))) + ((806112277 | iMyPid2) * 521)) + ((((~(iMyPid2 | (-1017625844))) | 805571601) | (~(i256 | 1018166519))) * 521)) - 1224538871;
            int i258 = (i257 << 13) ^ i257;
            int i259 = i258 ^ (i258 >>> 17);
            ((int[]) objArr12[1])[0] = i259 ^ (i259 << 5);
            objArr12 = new Object[]{iArr11, new int[1], iArr10, strArr15};
            str2 = str;
        } else {
            Context applicationContext6 = p0 != null ? ((p0 instanceof ContextWrapper) && ((ContextWrapper) p0).getBaseContext() == null) ? null : p0.getApplicationContext() : p0;
            int iIntValue3 = ((Integer) Class.forName(str5).getMethod(str6, Object.class).invoke(null, this)).intValue();
            Object[] objArr117 = new Object[1];
            c(new char[]{45561, 48463, 4492, 27613}, new char[]{45407, 48978, 5518, 34155}, (char) View.getDefaultSize(0, 0), Color.red(0), new char[]{62528, 62855, 39947, 56462, 61157, 58122, 48053, 37324, 3739, 35092, 51458, 13593, 4243, 15497, 23912, 9853, 52072, 52762, 49239, 3717, 9547, 63375, 32155, 45540, 63572, 63070, 15135, 36865, 38931, 60841, 43675, 7273, 36222, 31269, 43122, 65308, 49335, 5312, 38879, 11050, 36781, 26648, 55574, 48529, 40716, 59708, 47756, 815, 21179, 22781, 42230, 11191, 61534, 26367, 38386, 27910, 8082, 11889, 62242, 60547, 15591, 21596, 65096, 29775}, objArr117);
            String str14 = (String) objArr117[0];
            Object[] objArr118 = new Object[1];
            c(new char[]{45561, 48463, 4492, 27613}, new char[]{37640, 27402, 23969, 33746}, (char) KeyEvent.normalizeMetaState(0), View.MeasureSpec.getMode(0), new char[]{4857, 16083, 7982, 44131, 18536, 47128, 15193, 9131, 39372, 6557, 34701, 51293, 32014, 9252, 30304, 15737, 3900, 35814, 42046, 18235, 46974, 4342, 27870, 3656, 65358, 2774, 30247, 503, 11, 14746, 31588, 13570, 19383, 39034, 43400, 50992, 6387, 31356, 41541, 58292, 32422, 19618, 17334, 57312, 32847, 42431, 392, 55201, 62259, 45640, 3504, 21556, 51101, 'R', 15047, 14872, 11254, 26194, 32398, 55462, 47641, 2257, 14519, 8089}, objArr118);
            Object[] objArr119 = {applicationContext6, new String[]{str14, (String) objArr118[0]}, Integer.valueOf(iIntValue3), 17, -1224538871};
            byte[] bArr15 = $$d;
            Object[] objArr120 = new Object[1];
            f(bArr15[16], (short) 530, bArr15[9], objArr120);
            Class<?> cls7 = Class.forName((String) objArr120[0]);
            Object[] objArr121 = new Object[1];
            f(bArr15[420], (short) 202, bArr15[5], objArr121);
            Object[] objArr122 = (Object[]) cls7.getMethod((String) objArr121[0], Context.class, String[].class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr119);
            int i260 = ((int[]) objArr122[0])[0];
            int i261 = ((int[]) objArr122[2])[0];
            if (applicationContext6 != null) {
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault67 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(560540673);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault67 == null) {
                    char offsetBefore4 = (char) (37567 - TextUtils.getOffsetBefore("", 0));
                    int iLastIndexOf5 = 624 - TextUtils.lastIndexOf("", '0', 0);
                    int keyRepeatDelay4 = (ViewConfiguration.getKeyRepeatDelay() >> 16) + 14;
                    byte b42 = $$a[24];
                    short s25 = b42;
                    Object[] objArr123 = new Object[1];
                    e(b42, s25, (byte) (s25 | 52), objArr123);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault67 = initSession.b(offsetBefore4, iLastIndexOf5, keyRepeatDelay4, -973632554, false, (String) objArr123[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault67).set(null, objArr122);
                try {
                    str2 = str;
                    long jLongValue16 = ((Long) Class.forName(str3).getDeclaredMethod(str2, new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf19 = Long.valueOf(jLongValue16);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault68 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(559617152);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault68 == null) {
                        char cResolveSizeAndState = (char) (37567 - View.resolveSizeAndState(0, 0, 0));
                        int iAlpha3 = Color.alpha(0) + 625;
                        int i262 = (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 13;
                        byte b43 = $$a[24];
                        Object[] objArr124 = new Object[1];
                        e(b43, (short) (b43 | 89), (byte) ($$b - 5), objArr124);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault68 = initSession.b(cResolveSizeAndState, iAlpha3, i262, -976899241, false, (String) objArr124[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault68).set(null, lValueOf19);
                    Long lValueOf20 = Long.valueOf(jLongValue16 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault69 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(118372281);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault69 == null) {
                        char c14 = (char) ((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 37566);
                        int iIndexOf13 = TextUtils.indexOf((CharSequence) "", '0', 0) + 626;
                        int iResolveSize = 14 - View.resolveSize(0, 0);
                        Object[] objArr125 = new Object[1];
                        e((byte) ($$b >>> 2), (short) 141, $$a[24], objArr125);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault69 = initSession.b(c14, iIndexOf13, iResolveSize, -477065106, false, (String) objArr125[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault69).set(null, lValueOf20);
                } catch (Exception unused10) {
                    throw new RuntimeException();
                }
            } else {
                objArr122 = objArr122;
                str2 = str;
            }
            objArr12 = objArr122;
        }
        int i263 = ((int[]) objArr12[0])[0];
        int i264 = ((int[]) objArr12[2])[0];
        if (i264 != i263) {
            ArrayList arrayList8 = new ArrayList();
            String[] strArr16 = (String[]) objArr12[3];
            if (strArr16 != null) {
                for (String str15 : strArr16) {
                    arrayList8.add(str15);
                }
            }
            throw new RuntimeException(String.valueOf(i264));
        }
        int i265 = ((int[]) objArr12[1])[0];
        int i266 = ((int[]) objArr12[2])[0];
        int i267 = ((int[]) objArr12[0])[0];
        String[] strArr17 = (String[]) objArr12[3];
        int iIdentityHashCode8 = System.identityHashCode(this);
        int i268 = i265 + (((~((-79381292) | iIdentityHashCode8)) | 197154) * (-566)) + 1935327284 + ((~(iIdentityHashCode8 | (-79184138))) * 566);
        int i269 = (i268 << 13) ^ i268;
        int i270 = i269 ^ (i269 >>> 17);
        ((int[]) objArr[1])[0] = i270 ^ (i270 << 5);
        Object[] objArr126 = {new int[]{i267}, new int[1], new int[]{i266}, strArr17};
        int i271 = onTransact + 73;
        cancel = i271 % 128;
        if (i271 % 2 == 0) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault70 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1309309962);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault70 == null) {
                char defaultSize = (char) (View.getDefaultSize(0, 0) + 53893);
                int scrollBarSize2 = 1320 - (ViewConfiguration.getScrollBarSize() >> 8);
                int iIndexOf14 = 36 - TextUtils.indexOf("", "", 0, 0);
                Object[] objArr127 = new Object[1];
                e((byte) ($$b >>> 2), (short) 141, $$a[24], objArr127);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault70 = initSession.b(defaultSize, scrollBarSize2, iIndexOf14, -1433084963, false, (String) objArr127[0], null);
            }
            int i272 = 19 / 0;
            if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault70).getLong(null) != -1) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1763547602);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    char trimmedLength4 = (char) (53893 - TextUtils.getTrimmedLength(""));
                    int doubleTapTimeout3 = (ViewConfiguration.getDoubleTapTimeout() >> 16) + 1320;
                    int i273 = (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 35;
                    byte b44 = $$a[24];
                    short s26 = b44;
                    Object[] objArr128 = new Object[1];
                    e(b44, s26, (byte) (s26 | 52), objArr128);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(trimmedLength4, doubleTapTimeout3, i273, -1920778747, false, (String) objArr128[0], null);
                }
                Object[] objArr129 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).get(null);
                objArr13 = new Object[]{new int[]{i}, new int[1], strArr, new int[]{i}};
                int i274 = ((int[]) objArr129[0])[0];
                int i275 = ((int[]) objArr129[3])[0];
                String[] strArr18 = (String[]) objArr129[2];
                int iIdentityHashCode9 = System.identityHashCode(this);
                int i276 = (~((-710588733) | iIdentityHashCode9)) | 575807796;
                int i277 = (((144059888 + (i276 * 992)) + ((i276 | (~((~iIdentityHashCode9) | 794820028))) * (-496))) + ((iIdentityHashCode9 | 660039092) * 496)) - 28844914;
                int i278 = (i277 << 13) ^ i277;
                int i279 = i278 ^ (i278 >>> 17);
                ((int[]) objArr13[1])[0] = i279 ^ (i279 << 5);
            } else {
                if (p0 != null) {
                    applicationContext3 = p0;
                } else if (!(!(p0 instanceof ContextWrapper))) {
                    i4 = cancel + 73;
                    onTransact = i4 % 128;
                    if (i4 % 2 != 0) {
                        int i280 = 10 / 0;
                        if (((ContextWrapper) p0).getBaseContext() != null) {
                            applicationContext3 = p0.getApplicationContext();
                        } else {
                            applicationContext3 = null;
                        }
                    } else if (((ContextWrapper) p0).getBaseContext() != null) {
                        applicationContext3 = p0.getApplicationContext();
                    } else {
                        applicationContext3 = null;
                    }
                } else {
                    applicationContext3 = p0.getApplicationContext();
                }
                int iIntValue4 = ((Integer) Class.forName(str5).getMethod(str6, Object.class).invoke(null, this)).intValue();
                Object[] objArr130 = {-586110796};
                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(41341784);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (47976 - ((byte) KeyEvent.getModifierMetaStateMask())), (ViewConfiguration.getJumpTapTimeout() >> 16) + 1300, 20 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), -420973425, false, null, new Class[]{Integer.TYPE});
                }
                Object[] objArr131 = {applicationContext3, "com.bpjstku", -28844914, Integer.valueOf(iIntValue4), 643, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).newInstance(objArr130), false};
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-733829592);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    char scrollBarSize3 = (char) (53893 - (ViewConfiguration.getScrollBarSize() >> 8));
                    int iNormalizeMetaState2 = 1320 - KeyEvent.normalizeMetaState(0);
                    int doubleTapTimeout4 = (ViewConfiguration.getDoubleTapTimeout() >> 16) + 36;
                    byte b45 = $$a[24];
                    short s27 = b45;
                    Object[] objArr132 = new Object[1];
                    e(b45, s27, (byte) (s27 | 52), objArr132);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(scrollBarSize3, iNormalizeMetaState2, doubleTapTimeout4, 819724799, false, (String) objArr132[0], new Class[]{Context.class, String.class, Integer.TYPE, Integer.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) ((-16719338) - Color.rgb(0, 0, 0)), 1394 - TextUtils.getTrimmedLength(""), (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 75), Boolean.TYPE});
                }
                objArr13 = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr131);
                if (applicationContext3 != null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1763547602);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        char scrollBarFadeDuration3 = (char) (53893 - (ViewConfiguration.getScrollBarFadeDuration() >> 16));
                        int iIndexOf15 = TextUtils.indexOf("", "", 0, 0) + 1320;
                        int keyRepeatDelay5 = 36 - (ViewConfiguration.getKeyRepeatDelay() >> 16);
                        byte b46 = $$a[24];
                        short s28 = b46;
                        Object[] objArr133 = new Object[1];
                        e(b46, s28, (byte) (s28 | 52), objArr133);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(scrollBarFadeDuration3, iIndexOf15, keyRepeatDelay5, -1920778747, false, (String) objArr133[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr13);
                    try {
                        long jLongValue17 = ((Long) Class.forName(str3).getDeclaredMethod(str2, new Class[0]).invoke(null, new Object[0])).longValue();
                        Long lValueOf21 = Long.valueOf(jLongValue17);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1351245985);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                            char offsetAfter3 = (char) (53893 - TextUtils.getOffsetAfter("", 0));
                            int iIndexOf16 = 1320 - TextUtils.indexOf("", "");
                            int iKeyCodeFromString3 = KeyEvent.keyCodeFromString("") + 36;
                            byte b47 = $$a[24];
                            short s29 = (short) (b47 | 37);
                            Object[] objArr134 = new Object[1];
                            e(b47, s29, (byte) s29, objArr134);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(offsetAfter3, iIndexOf16, iKeyCodeFromString3, -1273706634, false, (String) objArr134[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf21);
                        Long lValueOf22 = Long.valueOf(jLongValue17 >> 12);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1309309962);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                            char trimmedLength5 = (char) (TextUtils.getTrimmedLength("") + 53893);
                            int scrollBarSize4 = 1320 - (ViewConfiguration.getScrollBarSize() >> 8);
                            int tapTimeout2 = (ViewConfiguration.getTapTimeout() >> 16) + 36;
                            Object[] objArr135 = new Object[1];
                            e((byte) ($$b >>> 2), (short) 141, $$a[24], objArr135);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(trimmedLength5, scrollBarSize4, tapTimeout2, -1433084963, false, (String) objArr135[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf22);
                    } catch (Exception unused11) {
                        throw new RuntimeException();
                    }
                }
            }
        } else {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault71 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1309309962);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault71 == null) {
                char c15 = (char) (53893 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)));
                int jumpTapTimeout3 = 1320 - (ViewConfiguration.getJumpTapTimeout() >> 16);
                int i281 = (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 35;
                Object[] objArr136 = new Object[1];
                e((byte) ($$b >>> 2), (short) 141, $$a[24], objArr136);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault71 = initSession.b(c15, jumpTapTimeout3, i281, -1433084963, false, (String) objArr136[0], null);
            }
            if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault71).getLong(null) != -1) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1763547602);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    char trimmedLength6 = (char) (53893 - TextUtils.getTrimmedLength(""));
                    int doubleTapTimeout5 = (ViewConfiguration.getDoubleTapTimeout() >> 16) + 1320;
                    int i2710 = (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 35;
                    byte b48 = $$a[24];
                    short s210 = b48;
                    Object[] objArr1210 = new Object[1];
                    e(b48, s210, (byte) (s210 | 52), objArr1210);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(trimmedLength6, doubleTapTimeout5, i2710, -1920778747, false, (String) objArr1210[0], null);
                }
                Object[] objArr1211 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).get(null);
                objArr13 = new Object[]{new int[]{i274}, new int[1], strArr18, new int[]{i275}};
                int i2711 = ((int[]) objArr1211[0])[0];
                int i2712 = ((int[]) objArr1211[3])[0];
                String[] strArr19 = (String[]) objArr1211[2];
                int iIdentityHashCode10 = System.identityHashCode(this);
                int i2713 = (~((-710588733) | iIdentityHashCode10)) | 575807796;
                int i2714 = (((144059888 + (i2713 * 992)) + ((i2713 | (~((~iIdentityHashCode10) | 794820028))) * (-496))) + ((iIdentityHashCode10 | 660039092) * 496)) - 28844914;
                int i2715 = (i2714 << 13) ^ i2714;
                int i2716 = i2715 ^ (i2715 >>> 17);
                ((int[]) objArr13[1])[0] = i2716 ^ (i2716 << 5);
            } else {
                if (p0 != null) {
                    applicationContext3 = p0;
                } else if (!(!(p0 instanceof ContextWrapper))) {
                    i4 = cancel + 73;
                    onTransact = i4 % 128;
                    if (i4 % 2 != 0) {
                        int i282 = 10 / 0;
                        if (((ContextWrapper) p0).getBaseContext() != null) {
                            applicationContext3 = p0.getApplicationContext();
                        } else {
                            applicationContext3 = null;
                        }
                    } else if (((ContextWrapper) p0).getBaseContext() != null) {
                        applicationContext3 = p0.getApplicationContext();
                    } else {
                        applicationContext3 = null;
                    }
                } else {
                    applicationContext3 = p0.getApplicationContext();
                }
                int iIntValue5 = ((Integer) Class.forName(str5).getMethod(str6, Object.class).invoke(null, this)).intValue();
                Object[] objArr137 = {-586110796};
                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(41341784);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (47976 - ((byte) KeyEvent.getModifierMetaStateMask())), (ViewConfiguration.getJumpTapTimeout() >> 16) + 1300, 20 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), -420973425, false, null, new Class[]{Integer.TYPE});
                }
                Object[] objArr138 = {applicationContext3, "com.bpjstku", -28844914, Integer.valueOf(iIntValue5), 643, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).newInstance(objArr137), false};
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-733829592);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    char scrollBarSize5 = (char) (53893 - (ViewConfiguration.getScrollBarSize() >> 8));
                    int iNormalizeMetaState3 = 1320 - KeyEvent.normalizeMetaState(0);
                    int doubleTapTimeout6 = (ViewConfiguration.getDoubleTapTimeout() >> 16) + 36;
                    byte b49 = $$a[24];
                    short s211 = b49;
                    Object[] objArr139 = new Object[1];
                    e(b49, s211, (byte) (s211 | 52), objArr139);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(scrollBarSize5, iNormalizeMetaState3, doubleTapTimeout6, 819724799, false, (String) objArr139[0], new Class[]{Context.class, String.class, Integer.TYPE, Integer.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) ((-16719338) - Color.rgb(0, 0, 0)), 1394 - TextUtils.getTrimmedLength(""), (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 75), Boolean.TYPE});
                }
                objArr13 = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr138);
                if (applicationContext3 != null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1763547602);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        char scrollBarFadeDuration4 = (char) (53893 - (ViewConfiguration.getScrollBarFadeDuration() >> 16));
                        int iIndexOf17 = TextUtils.indexOf("", "", 0, 0) + 1320;
                        int keyRepeatDelay6 = 36 - (ViewConfiguration.getKeyRepeatDelay() >> 16);
                        byte b410 = $$a[24];
                        short s212 = b410;
                        Object[] objArr1310 = new Object[1];
                        e(b410, s212, (byte) (s212 | 52), objArr1310);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(scrollBarFadeDuration4, iIndexOf17, keyRepeatDelay6, -1920778747, false, (String) objArr1310[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr13);
                    long jLongValue18 = ((Long) Class.forName(str3).getDeclaredMethod(str2, new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf23 = Long.valueOf(jLongValue18);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1351245985);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                        char offsetAfter4 = (char) (53893 - TextUtils.getOffsetAfter("", 0));
                        int iIndexOf18 = 1320 - TextUtils.indexOf("", "");
                        int iKeyCodeFromString4 = KeyEvent.keyCodeFromString("") + 36;
                        byte b411 = $$a[24];
                        short s213 = (short) (b411 | 37);
                        Object[] objArr1311 = new Object[1];
                        e(b411, s213, (byte) s213, objArr1311);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(offsetAfter4, iIndexOf18, iKeyCodeFromString4, -1273706634, false, (String) objArr1311[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf23);
                    Long lValueOf24 = Long.valueOf(jLongValue18 >> 12);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1309309962);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                        char trimmedLength7 = (char) (TextUtils.getTrimmedLength("") + 53893);
                        int scrollBarSize6 = 1320 - (ViewConfiguration.getScrollBarSize() >> 8);
                        int tapTimeout3 = (ViewConfiguration.getTapTimeout() >> 16) + 36;
                        Object[] objArr1312 = new Object[1];
                        e((byte) ($$b >>> 2), (short) 141, $$a[24], objArr1312);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(trimmedLength7, scrollBarSize6, tapTimeout3, -1433084963, false, (String) objArr1312[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf24);
                }
            }
        }
        if (((int[]) objArr13[0])[0] != ((int[]) objArr13[3])[0]) {
            throw null;
        }
        int i283 = onTransact + 35;
        cancel = i283 % 128;
        int i284 = i283 % 2;
        Object[] objArr140 = {new int[]{i}, new int[1], strArr, new int[]{i}};
        int i285 = ((int[]) objArr13[1])[0];
        int i286 = ((int[]) objArr13[0])[0];
        int i287 = ((int[]) objArr13[3])[0];
        String[] strArr20 = (String[]) objArr13[2];
        int iIdentityHashCode11 = System.identityHashCode(this);
        int i288 = ~((-67753483) | iIdentityHashCode11);
        int i289 = i285 + 888697032 + ((698353860 | i288) * (-476)) + (i288 * 952) + ((~((~iIdentityHashCode11) | (-67753483))) * 476);
        int i290 = i289 ^ (i289 << 13);
        int i291 = i290 ^ (i290 >>> 17);
        ((int[]) objArr140[1])[0] = i291 ^ (i291 << 5);
        final String action = p1 != null ? p1.getAction() : null;
        int i292 = ((int[]) objArr60[2])[0];
        int i293 = i292 * i292;
        int i294 = -(1014087197 * i292);
        int i295 = ((((i293 | i294) << 1) - (i293 ^ i294)) - (~(-(i292 * 319558733)))) - 1;
        int i296 = (i295 & 622691577) + (622691577 | i295);
        int i297 = i296 >> 27;
        int i298 = (((i297 | (-63)) << 1) - (i297 ^ (-63))) / 32;
        int i299 = (i298 ^ 1) + ((i298 & 1) << 1);
        int i300 = (i296 & i299) + (i299 | i296);
        int i301 = ((i296 >> 18) - 32767) / 16384;
        int i302 = -(i300 ^ ((i301 ^ 1) + ((i301 & 1) << 1)));
        int i303 = (i302 ^ 6) + ((i302 & 6) << 1);
        int i304 = i303 >> 23;
        int i305 = (((i304 | (-1023)) << 1) - (i304 ^ (-1023))) / 512;
        int i306 = (i305 & 1) + (i305 | 1);
        int i307 = 2407590 / (((-((i306 & 1) + (i306 | 1))) & i303) * 1205);
        int i308 = ((int[]) objArr93[3])[0];
        int i309 = i308 * i308;
        int i310 = -(1738634998 * i308);
        int i311 = (i309 & i310) + (i309 | i310);
        int i312 = -(i308 * 1482542482);
        int i313 = ((i311 ^ i312) + ((i312 & i311) << 1)) - (-575808016);
        int i314 = i313 >> 17;
        int i315 = (((-65535) & i314) + (i314 | (-65535))) / 32768;
        int i316 = ((i315 | 1) << 1) - (i315 ^ 1);
        int i317 = (i313 ^ i316) + ((i316 & i313) << 1);
        int i318 = i313 >> 29;
        int i319 = (((i318 | (-15)) << 1) - (i318 ^ (-15))) / 8;
        int i320 = (-(((i319 ^ 1) + ((i319 & 1) << 1)) ^ i317)) + 9;
        int i321 = i320 >> 28;
        int i322 = ((i321 ^ (-31)) + ((i321 & (-31)) << 1)) / 16;
        int i323 = (i322 & 1) + (i322 | 1);
        int i324 = i307 + (5375862 / ((i320 & (-(((i323 | 1) << 1) - (i323 ^ 1)))) * 1762));
        int i325 = ((int[]) objArr101[3])[0];
        int i326 = i325 * i325;
        int i327 = -(1653206521 * i325);
        int i328 = (((i326 & i327) + (i326 | i327)) - (~(-(i325 * (-2042631117))))) - (-79805923);
        int i329 = i328 >> 21;
        int i330 = (((i329 & (-4095)) + (i329 | (-4095))) / 2048) - (-1);
        int i331 = (i328 ^ i330) + ((i330 & i328) << 1);
        int i332 = i328 >> 22;
        int i333 = (((i332 | (-2047)) << 1) - (i332 ^ (-2047))) / 1024;
        int i334 = -(i331 ^ ((i333 & 1) + (i333 | 1)));
        int i335 = (i334 ^ 1) + ((i334 & 1) << 1);
        int i336 = i335 >> 17;
        int i337 = ((((-65535) | i336) << 1) - (i336 ^ (-65535))) / 32768;
        int i338 = ((i337 | 1) << 1) - (i337 ^ 1);
        int i339 = i324 + (482171 / (((-(((i338 | 1) << 1) - (i338 ^ 1))) & i335) * 1921));
        int i340 = ((int[]) objArr112[2])[0];
        int i341 = ((((i340 * i340) - (~(-(1880482640 * i340)))) - 1) - (~(-(i340 * 1804867184)))) - 1;
        int i342 = (i341 ^ (-1932934144)) + ((i341 & (-1932934144)) << 1);
        int i343 = i342 >> 29;
        int i344 = ((i343 ^ (-15)) + ((i343 & (-15)) << 1)) / 8;
        int i345 = ((i344 | 1) << 1) - (i344 ^ 1);
        int i346 = (i342 ^ i345) + ((i345 & i342) << 1);
        int i347 = i342 >> 16;
        int i348 = (((-131071) ^ i347) + ((i347 & (-131071)) << 1)) / 65536;
        int i349 = -(i346 ^ (((i348 | 1) << 1) - (i348 ^ 1)));
        int i350 = ((i349 | 3) << 1) - (i349 ^ 3);
        int i351 = i350 >> 21;
        int i352 = ((((i351 | (-4095)) << 1) - (i351 ^ (-4095))) / 2048) - (-1);
        int i353 = i339 + (1041450 / (((-(((i352 | 1) << 1) - (i352 ^ 1))) & i350) * 530));
        int i354 = ((int[]) objArr126[1])[0];
        int i355 = ((((i354 * i354) - (~(-(475533201 * i354)))) - 1) - (~(-(i354 * 84169547)))) - 1;
        int i356 = ((i355 | (-82621628)) << 1) - ((-82621628) ^ i355);
        int i357 = ((i356 >> 28) - 31) / 16;
        int i358 = ((i357 | 1) << 1) - (i357 ^ 1);
        int i359 = ((i356 | i358) << 1) - (i358 ^ i356);
        int i360 = i356 >> 16;
        int i361 = ((((-131071) | i360) << 1) - (i360 ^ (-131071))) / 65536;
        int i362 = (-(i359 ^ ((i361 & 1) + (i361 | 1)))) + 2;
        int i363 = i362 >> 18;
        int i364 = ((i363 & (-32767)) + (i363 | (-32767))) / 16384;
        int i365 = (i364 ^ 1) + ((i364 & 1) << 1);
        int i366 = i353 + (85008 / ((i362 & (-((i365 & 1) + (i365 | 1)))) * PointerIconCompat.TYPE_NO_DROP));
        int i367 = ((int[]) objArr140[1])[0];
        int i368 = i367 * i367;
        int i369 = -(1480142733 * i367);
        int i370 = ((((i368 | i369) << 1) - (i368 ^ i369)) - (~(-(i367 * 385101893)))) - 1;
        int i371 = (i370 ^ (-1142136303)) + (((-1142136303) & i370) << 1);
        int i372 = i371 >> 19;
        int i373 = (((i372 | (-16383)) << 1) - (i372 ^ (-16383))) / 8192;
        int i374 = (i371 - (~((i373 ^ 1) + ((i373 & 1) << 1)))) - 1;
        int i375 = ((i371 >> 17) - 65535) / 32768;
        int i376 = -(i374 ^ ((i375 & 1) + (i375 | 1)));
        int i377 = ((i376 | 4) << 1) - (i376 ^ 4);
        int i378 = i377 >> 29;
        int i379 = ((i378 & (-15)) + (i378 | (-15))) / 8;
        if (Intrinsics.areEqual(action, "27/30/30/android.intent.action.BATTERY_CHANGED".substring(i366 + ((-1578780) / (((-((((i379 | 1) << 1) - (i379 ^ 1)) - (-1))) & i377) * 245))))) {
            int intExtra = p1.getIntExtra(NotificationCompat.CATEGORY_STATUS, 1);
            int intExtra2 = p1.getIntExtra(FirebaseAnalytics.Param.LEVEL, -1);
            int intExtra3 = p1.getIntExtra("scale", 100);
            int intExtra4 = p1.getIntExtra("plugged", -1);
            SystemInfo.BatteryStatus.Companion companion = SystemInfo.BatteryStatus.INSTANCE;
            this.TuitionPaymentFragmentbindingInflater1 = SystemInfo.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.TuitionPaymentFragmentbindingInflater1, TuitionPaymentFragmentbindingInflater1.contains(SystemInfo.BatteryStatus.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault3(intExtra)), MathKt.roundToInt((intExtra2 * 100.0f) / intExtra3), false, b.contains(Integer.valueOf(intExtra4)) || !p1.getBooleanExtra("present", true), 4);
            return;
        }
        if (!Intrinsics.areEqual(action, "android.os.action.POWER_SAVE_MODE_CHANGED")) {
            this.b.TuitionPaymentFragmentspecialinlinedviewModeldefault1(InternalLogger.Level.DEBUG, CollectionsKt.listOf((Object[]) new InternalLogger.Target[]{InternalLogger.Target.MAINTAINER, InternalLogger.Target.TELEMETRY}), new Function0<String>() { // from class: com.datadog.android.core.internal.system.BroadcastReceiverSystemInfoProvider.onReceive.1
                @Override // kotlin.jvm.functions.Function0
                /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                public final String invoke() {
                    String str16 = action;
                    StringBuilder sb = new StringBuilder("Received unknown broadcast intent: [");
                    sb.append(str16);
                    sb.append("]");
                    return sb.toString();
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }
            }, null, false, null);
            return;
        }
        int i380 = onTransact + 91;
        cancel = i380 % 128;
        int i381 = i380 % 2;
        Object systemService = p0.getSystemService("power");
        PowerManager powerManager = systemService instanceof PowerManager ? (PowerManager) systemService : null;
        this.TuitionPaymentFragmentbindingInflater1 = SystemInfo.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.TuitionPaymentFragmentbindingInflater1, false, 0, powerManager != null ? powerManager.isPowerSaveMode() : false, false, 11);
    }

    @Override // defpackage.lambdarotateYUV1
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault1(Context p0) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(p0, "");
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.BATTERY_CHANGED");
        Intent intentTuitionPaymentFragmentspecialinlinedviewModeldefault2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2(p0, intentFilter);
        if (intentTuitionPaymentFragmentspecialinlinedviewModeldefault2 != null) {
            int i2 = cancel + 93;
            onTransact = i2 % 128;
            if (i2 % 2 != 0) {
                onReceive(p0, intentTuitionPaymentFragmentspecialinlinedviewModeldefault2);
                throw null;
            }
            onReceive(p0, intentTuitionPaymentFragmentspecialinlinedviewModeldefault2);
        }
        IntentFilter intentFilter2 = new IntentFilter();
        intentFilter2.addAction("android.os.action.POWER_SAVE_MODE_CHANGED");
        Intent intentTuitionPaymentFragmentspecialinlinedviewModeldefault3 = TuitionPaymentFragmentspecialinlinedviewModeldefault2(p0, intentFilter2);
        if (intentTuitionPaymentFragmentspecialinlinedviewModeldefault3 != null) {
            int i3 = cancel + 71;
            onTransact = i3 % 128;
            if (i3 % 2 == 0) {
                onReceive(p0, intentTuitionPaymentFragmentspecialinlinedviewModeldefault3);
            } else {
                onReceive(p0, intentTuitionPaymentFragmentspecialinlinedviewModeldefault3);
                int i4 = 10 / 0;
            }
        }
    }

    @Override // defpackage.lambdarotateYUV1
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault2(Context p0) {
        int i = 2 % 2;
        int i2 = onTransact + 59;
        cancel = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(p0, "");
            TuitionPaymentFragmentbindingInflater1(p0);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(p0, "");
        TuitionPaymentFragmentbindingInflater1(p0);
        int i3 = cancel + 27;
        onTransact = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 53 / 0;
        }
    }

    @Override // defpackage.lambdarotateYUV1
    public final SystemInfo TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        SystemInfo systemInfo;
        int i = 2 % 2;
        int i2 = onTransact + 121;
        int i3 = i2 % 128;
        cancel = i3;
        if (i2 % 2 == 0) {
            systemInfo = this.TuitionPaymentFragmentbindingInflater1;
            int i4 = 91 / 0;
        } else {
            systemInfo = this.TuitionPaymentFragmentbindingInflater1;
        }
        int i5 = i3 + 97;
        onTransact = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 43 / 0;
        }
        return systemInfo;
    }

    static {
        byte[] bArr = new byte[562];
        System.arraycopy("A\u0086¿\u0002\u000e\u0000Ã8ÿ\u0015ï\u0005\rúÉ5\u000fø\u0010ÿüýÌF\u0005úÃ=\u0007\bó\u000fþõ\rÄ=\u0007\u0007\u0003\u0000\u0005úú\u000b\bï\u0015÷\b\u0001Â) ô\u000fÑ$\u0013÷\b\u0001è ñ\u0004\n\u0000\u0007ûî#\u0000ñ\u0015ó\u0004\u0014Ê1ûË\tíM\u0001Õ$\u0013÷\u000fõ\r\u0007Ù$õà1õþ\u0015ó\u0001Â\u000f#ö\r÷\b\u0001ä\u0013\u001aöú\u000b\bÔ.ñ\b\bú\u000b\b\u0001ÿ÷\u0000\bú\rÿ\u0007\u0000ÿ\u0007ù\u0001\u0014õþ\u0014Ø$÷\u0003\tú\u0003\u0003ý\u0016ù\nÀ\u000e\u0000Ã;\n\u0002ú\u0007ûË5\u000fø\u0010ÿüýÌ;\b\b½=\u0007\bó\u000fþõ\rÄA\u0001\u0001\u0000\rí\u0006\u000e\u0000\u0002\u0004\u0001ÂN\u0002ô\u0002#ö\r÷\b\u0001ä\u0013\u001aöú\u000b\bÔ.ñ\b\bú\u000b\b\u0001ÿ÷\u0000\bú\rÿ\u0007\u0000ÿ\u0007ù\u0001\u0014õþ\u0014Ø$÷\u0003\tú\u0003\u0003ý\u0016ù\n¿\u000e\u0000Ã;\n\u0002ú\u0007ûË:\u0005\u000bõÿ\u0001\u0014ôË7\u0011ñ\u0014÷\u0006\u000fý÷ü\u0012½=\u0007\bó\u000fþõ\rÄA\u0004÷\u0003\tÄ\u00171ñ\u0014÷\u0006\u000fý÷ü\u0012á\u0015\r\u0001\u0005\u0004²1\u0014\u0010\u0002ø\b\u0001¸#3ñ\u000b\b²0\u001fÿ\u0002\u0005\b\u0001Ï4\u0002ø\u0000\t\u0001ú\u000b\b²0\u001fÿ\u0002\u0005\b\u0001ä\r\u0013ùú\u000f\b² 5ö\u0005ú\u0003\u000fõ\u0004\u0004\f\u0003ó\u000fÓ \u000eú\u000fñÅ2#ö\r÷\b\u0001ä\u0013\u001aöú\u000b\bÔ.ñ\b\bú\u000b\bð\t\u0007ø\u0007\u0007ûä'ú\b÷\u0015ó\u000fÁ\u000f\füí\u001bü\u0013\u0003ÿõê\u0016\u000fõ\b\u0000\u000fÕ5þó\u000fþõ\ré(÷\böÿ\u0011÷üë\u0017\u000e÷\u0004ÿÓ#ö\r÷\b\u0001ä\u0013\u001aöú\u000b\bÔ.ñ\b\bú\u000b\b\u0001ÿ÷\u0000\bú\rÿ\u0007\u0000ÿ\u0007ù\u0001\u0014õþ\u0014Ø$÷\u0003\tú\u0003\u0003ý\u0016ù\nÁ\u0000\u0011Ñ+\u0005\u0006ôã1\u0001\u0003ÿõ\fÓ0ñ\u0018ð\u000fã\u001bÿý\u0003Þ/ý\u0006ö\u0015÷\b\u0001Ù+õ\u0003\fû\u0001".getBytes("ISO-8859-1"), 0, bArr, 0, 562);
        $$d = bArr;
        $$e = 144;
        $$a = new byte[]{81, -102, -70, -91, -29, 31, -48, -17, 4, -24, 1, -6, -13, -13, -29, 38, -50, -16, -1, -12, -24, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 56, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 55, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, 7, -18, -16, -1, -16, -16, -4, 19, -48, -3, -17, 0, -30, 4, -24, 54, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 54};
        $$b = 57;
        onTransact = 0;
        cancel = 1;
        d = 0;
        g = 1;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        INSTANCE = new Companion(null);
        TuitionPaymentFragmentbindingInflater1 = SetsKt.setOf((Object[]) new SystemInfo.BatteryStatus[]{SystemInfo.BatteryStatus.CHARGING, SystemInfo.BatteryStatus.FULL});
        b = SetsKt.setOf((Object[]) new Integer[]{1, 4, 2});
        int i = d + 5;
        g = i % 128;
        int i2 = i % 2;
    }

    static void TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        f687a = -3700836294595038008L;
        asInterface = -981105359;
        asBinder = (char) 34097;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0027  */
    /* JADX WARN: Code duplicated, block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x0029). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0027
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$g(byte r5, int r6, int r7) {
        /*
            int r5 = r5 * 4
            int r5 = 3 - r5
            byte[] r0 = com.datadog.android.core.internal.system.BroadcastReceiverSystemInfoProvider.$$c
            int r7 = 104 - r7
            int r6 = r6 * 3
            int r1 = 1 - r6
            byte[] r1 = new byte[r1]
            r2 = 0
            int r6 = 0 - r6
            if (r0 != 0) goto L17
            r3 = r7
            r4 = r2
            r7 = r6
            goto L29
        L17:
            r3 = r2
        L18:
            int r5 = r5 + 1
            byte r4 = (byte) r7
            r1[r3] = r4
            int r4 = r3 + 1
            if (r3 != r6) goto L27
            java.lang.String r5 = new java.lang.String
            r5.<init>(r1, r2)
            return r5
        L27:
            r3 = r0[r5]
        L29:
            int r7 = r7 + r3
            r3 = r4
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: com.datadog.android.core.internal.system.BroadcastReceiverSystemInfoProvider.$$g(byte, int, int):java.lang.String");
    }
}
