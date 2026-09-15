package com.google.firebase;

import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
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
import androidx.camera.view.PreviewView$1$$ExternalSyntheticBackportWithForwarding0;
import androidx.collection.ArrayMap;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.os.UserManagerCompat;
import com.appsflyer.internal.AFg1xSDK;
import com.google.android.gms.common.api.internal.BackgroundDetector;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Base64Utils;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.common.util.ProcessUtils;
import com.google.firebase.components.Component;
import com.google.firebase.components.ComponentDiscovery;
import com.google.firebase.components.ComponentDiscoveryService;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.components.ComponentRuntime;
import com.google.firebase.components.Lazy;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import com.google.firebase.concurrent.UiExecutor;
import com.google.firebase.events.Publisher;
import com.google.firebase.heartbeatinfo.DefaultHeartBeatController;
import com.google.firebase.inject.Provider;
import com.google.firebase.internal.DataCollectionConfigStorage;
import com.google.firebase.provider.FirebaseInitProvider;
import com.google.firebase.tracing.ComponentMonitor;
import com.google.firebase.tracing.FirebaseTrace;
import defpackage.abortCapture;
import defpackage.getRealtimeCaptureLatency;
import defpackage.initSession;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.io.encoding.Base64;

/* JADX INFO: loaded from: classes4.dex */
public class FirebaseApp {
    public static final String DEFAULT_APP_NAME = "[DEFAULT]";
    static final Map<String, FirebaseApp> INSTANCES;
    private static final Object LOCK;
    private static final String LOG_TAG = "FirebaseApp";
    private static int TuitionPaymentFragmentbindingInflater1;
    private static long b;
    private final Context applicationContext;
    private final ComponentRuntime componentRuntime;
    private final Lazy<DataCollectionConfigStorage> dataCollectionConfigStorage;
    private final Provider<DefaultHeartBeatController> defaultHeartBeatController;
    private final String name;
    private final FirebaseOptions options;
    private static final byte[] $$c = {83, -44, 103, 46};
    private static final int $$f = 231;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$d = {93, -77, 2, Base64.padSymbol, 4, 32, 15, 14, 8, 20, 28, -49, 13, 50, 45, -18, Base64.padSymbol, 17, 13, -28, 47, 28, 17, -55, 50, 68, -4, 19, 28, 21, 6, 23, 16, -26, 47, 36, 0, 22, 18, 22, 10, -4, 36, 31, 14, 16, 16, 22, 3, -18, 62, 6, 38, -68, 30, 50, 5, 28, 6, 23, 16, -13, 34, 41, 5, 9, 26, 23, -29, Base64.padSymbol, 0, 23, 23, 9, 26, 23, -1, 24, 22, 7, 22, 22, 10, -13, 54, 9, 23, 6, 36, 2, 30, -48};
    private static final int $$e = 90;
    private static final byte[] $$a = {12, -88, 33, 118, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -56};
    private static final int $$b = 237;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 0;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 1;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 1;
    private final AtomicBoolean automaticResourceManagementEnabled = new AtomicBoolean(false);
    private final AtomicBoolean deleted = new AtomicBoolean();
    private final List<BackgroundStateChangeListener> backgroundStateChangeListeners = new CopyOnWriteArrayList();
    private final List<FirebaseAppLifecycleListener> lifecycleListeners = new CopyOnWriteArrayList();

    public interface BackgroundStateChangeListener {
        void onBackgroundStateChanged(boolean z);
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
    private static void a(short r6, short r7, short r8, java.lang.Object[] r9) {
        /*
            int r7 = r7 * 52
            int r7 = 55 - r7
            int r8 = 103 - r8
            byte[] r0 = com.google.firebase.FirebaseApp.$$a
            int r6 = r6 * 52
            int r1 = r6 + 1
            byte[] r1 = new byte[r1]
            r2 = 0
            if (r0 != 0) goto L15
            r3 = r8
            r4 = r2
            r8 = r7
            goto L2d
        L15:
            r3 = r2
        L16:
            int r7 = r7 + 1
            byte r4 = (byte) r8
            r1[r3] = r4
            int r4 = r3 + 1
            if (r3 != r6) goto L27
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L27:
            r3 = r0[r7]
            r5 = r8
            r8 = r7
            r7 = r3
            r3 = r5
        L2d:
            int r3 = r3 + r7
            int r7 = r3 + (-11)
            r3 = r4
            r5 = r8
            r8 = r7
            r7 = r5
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.FirebaseApp.a(short, short, short, java.lang.Object[]):void");
    }

    private static void d(byte b2, byte b3, int i, Object[] objArr) {
        byte[] bArr = $$d;
        int i2 = 114 - (i * 30);
        int i3 = b2 * 14;
        int i4 = 54 - (b3 * 51);
        byte[] bArr2 = new byte[52 - i3];
        int i5 = 51 - i3;
        int i6 = -1;
        if (bArr == null) {
            i2 = (i4 + i2) - 17;
            i4 = i4;
        }
        while (true) {
            i6++;
            int i7 = i4 + 1;
            bArr2[i6] = (byte) i2;
            if (i6 == i5) {
                objArr[0] = new String(bArr2, 0);
                return;
            } else {
                i2 = (i2 + bArr[i7]) - 17;
                i4 = i7;
            }
        }
    }

    private static void c(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        abortCapture abortcapture = new abortCapture();
        char[] cArrB = abortCapture.b(b ^ (-2687588926731523482L), cArr, i);
        abortcapture.b = 4;
        int i3 = $10 + 125;
        $11 = i3 % 128;
        int i4 = i3 % 2;
        while (abortcapture.b < cArrB.length) {
            int i5 = $11 + 101;
            $10 = i5 % 128;
            int i6 = i5 % 2;
            abortcapture.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = abortcapture.b - 4;
            int i7 = abortcapture.b;
            try {
                Object[] objArr2 = {Long.valueOf(cArrB[abortcapture.b] ^ cArrB[abortcapture.b % 4]), Long.valueOf(abortcapture.TuitionPaymentFragmentspecialinlinedviewModeldefault1), Long.valueOf(b)};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-774687567);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    byte b2 = (byte) 0;
                    byte b3 = b2;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (64838 - (ViewConfiguration.getJumpTapTimeout() >> 16)), 1356 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 38, 894276454, false, $$g(b2, b3, b3), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                }
                cArrB[i7] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {abortcapture, abortcapture};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-772308768);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (47773 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1))), 467 - TextUtils.indexOf((CharSequence) "", '0', 0), (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 12, 896083767, false, "n", new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3);
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

    static class UserUnlockReceiver extends BroadcastReceiver {
        private static final byte[] $$a;
        private static final int $$b;
        private static final byte[] $$d;
        private static final int $$e;
        private static int $10 = 0;
        private static int $11 = 1;
        private static AtomicReference<UserUnlockReceiver> INSTANCE;
        private static int TuitionPaymentFragmentbindingInflater1;
        private static int TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        private static int TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        private static long TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        private static int b;
        private final Context applicationContext;

        /* JADX WARN: Code duplicated, block: B:10:0x001f  */
        /* JADX WARN: Code duplicated, block: B:8:0x0017  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x001f -> B:11:0x0026). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x001f
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        private static void c(short r6, int r7, byte r8, java.lang.Object[] r9) {
            /*
                byte[] r0 = com.google.firebase.FirebaseApp.UserUnlockReceiver.$$a
                int r8 = r8 + 84
                int r7 = r7 + 4
                int r1 = r6 + 1
                byte[] r1 = new byte[r1]
                r2 = 0
                if (r0 != 0) goto L11
                r4 = r6
                r8 = r7
                r3 = r2
                goto L26
            L11:
                r3 = r2
            L12:
                byte r4 = (byte) r8
                r1[r3] = r4
                if (r3 != r6) goto L1f
                java.lang.String r6 = new java.lang.String
                r6.<init>(r1, r2)
                r9[r2] = r6
                return
            L1f:
                int r3 = r3 + 1
                r4 = r0[r7]
                r5 = r8
                r8 = r7
                r7 = r5
            L26:
                int r4 = -r4
                int r7 = r7 + r4
                int r7 = r7 + (-11)
                int r8 = r8 + 1
                r5 = r8
                r8 = r7
                r7 = r5
                goto L12
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.FirebaseApp.UserUnlockReceiver.c(short, int, byte, java.lang.Object[]):void");
        }

        private static void d(int i, byte b2, int i2, Object[] objArr) {
            int i3 = i + 4;
            int i4 = 105 - i2;
            byte[] bArr = $$d;
            byte[] bArr2 = new byte[b2 + 1];
            int i5 = -1;
            if (bArr == null) {
                i4 = (i4 + (-b2)) - 3;
            }
            while (true) {
                i5++;
                i3++;
                bArr2[i5] = (byte) i4;
                if (i5 == b2) {
                    objArr[0] = new String(bArr2, 0);
                    return;
                }
                i4 = (i4 + (-bArr[i3])) - 3;
            }
        }

        private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
            int i2 = 2 % 2;
            getRealtimeCaptureLatency getrealtimecapturelatency = new getRealtimeCaptureLatency();
            getrealtimecapturelatency.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i;
            int length = cArr.length;
            long[] jArr = new long[length];
            getrealtimecapturelatency.b = 0;
            while (getrealtimecapturelatency.b < cArr.length) {
                int i3 = $11 + 113;
                $10 = i3 % 128;
                int i4 = i3 % 2;
                int i5 = getrealtimecapturelatency.b;
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr[getrealtimecapturelatency.b]), getrealtimecapturelatency, getrealtimecapturelatency};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1177060190);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (View.MeasureSpec.getMode(0) + 19472), ((byte) KeyEvent.getModifierMetaStateMask()) + 2625, TextUtils.getOffsetBefore("", 0) + 13, -1565121399, false, "F", new Class[]{Integer.TYPE, Object.class, Object.class});
                    }
                    jArr[i5] = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).longValue() ^ (TuitionPaymentFragmentspecialinlinedviewModeldefault3 ^ 9053247990562531611L);
                    Object[] objArr3 = {getrealtimecapturelatency, getrealtimecapturelatency};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1900663072);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) ((ViewConfiguration.getWindowTouchSlop() >> 8) + 39422), 482 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), 37 - TextUtils.getOffsetBefore("", 0), 1781041463, false, "I", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3);
                    int i6 = $10 + 95;
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
            char[] cArr2 = new char[length];
            getrealtimecapturelatency.b = 0;
            while (getrealtimecapturelatency.b < cArr.length) {
                cArr2[getrealtimecapturelatency.b] = (char) jArr[getrealtimecapturelatency.b];
                try {
                    Object[] objArr4 = {getrealtimecapturelatency, getrealtimecapturelatency};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1900663072);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) ((ViewConfiguration.getLongPressTimeout() >> 16) + 39422), 481 - ExpandableListView.getPackedPositionGroup(0L), 36 - Process.getGidForName(""), 1781041463, false, "I", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
                    int i8 = $10 + 43;
                    $11 = i8 % 128;
                    int i9 = i8 % 2;
                } catch (Throwable th2) {
                    Throwable cause2 = th2.getCause();
                    if (cause2 == null) {
                        throw th2;
                    }
                    throw cause2;
                }
            }
            objArr[0] = new String(cArr2);
        }

        static /* synthetic */ void access$100(Context context) {
            int i = 2 % 2;
            int i2 = b + 55;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
            int i3 = i2 % 2;
            Object obj = null;
            ensureReceiverRegistered(context);
            if (i3 == 0) {
                obj.hashCode();
                throw null;
            }
            int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 121;
            b = i4 % 128;
            if (i4 % 2 != 0) {
                throw null;
            }
        }

        static {
            byte[] bArr = new byte[563];
            System.arraycopy("eY^·ñÿ<Éï\u0003ôü\u0006óD»û\nï\u000bô÷\u0010ê\b÷þ=»û\u0000ÿû>çÜî\u0010õú\u0019Û\u0000ÿû+Ûì\bð\nòøR®\u0000\bÿ÷\u0005òEý¸øÿ\u0000ø\u0006þ=¸ø\u0001\u0002ÿìM½üü\u0002é\u0006õMðÜ\tò\b÷þ\u001bìå\t\u0005ô÷+Ñ\u000e÷÷\u0005ô÷\u000föø\u0007øø\u0004\u001bØ\u0005÷\bê\fð>÷>¹\n\u0001ûì\bð\u000eêGÂø÷\fð\u0001\nò;¼ü\bð\u000eê\u0002úüB¼\nì\u000bðù\u0012üó\u00044Üêì\u000bðù\u0012üó\u0004\u000bëø\u0007òõ2Ð÷\u0004\u0007\u0000ìöRÍÜ\tò\b÷þ\u001bìå\t\u0005ô÷+Ñ\u000e÷÷\u0005ô÷\u000föø\u0007øø\u0004\u001bØ\u0005÷\bê\fð>Ü\tò\b÷þ\u001bìå\t\u0005ô÷+Ñ\u000e÷÷\u0005ô÷þ\u0000\bÿ÷\u0005ò\u0000øÿ\u0000ø\u0006þë\n\u0001ë'Û\büö\u0005üü\u0002é\u0006õ>×ú\u000bê\u001fîð\u0004ÿñÿ<Äõý\u0005ø\u00044Êð\u0007ï\u0000\u0003\u00023¿\u0000\u0004í\u000eì\u0006\u0001ïB»\u0001\bûûïB´\u000b\u0002úÿîC±ý\u0011ñÿ<Äõý\u0005ø\u00044Êð\u0007ï\u0000\u0003\u00023Ä÷÷BÊéþ\t7Êî\u00048¸\u0007ÿö\u0002ø=Ùêì\u0004\tÿê\b÷þ)Ð÷\u0004\u0007\u000eëðù\n\u0003ûÜ\tò\b÷þ\u001bìå\t\u0005ô÷+Ñ\u000e÷÷\u0005ô÷þ\u0000\bÿ÷\u0005ò\u0000øÿ\u0000ø\u0006þë\n\u0001ë'Û\büö\u0005üü\u0002é\u0006õ@ÿî\u001fîê\bø\u0004\u0011Üø\n\u0004>ÍÜ\tò\b÷þ\u001bìå\t\u0005ô÷+Ñ\u000e÷÷\u0005ô÷\u000föø\u0007øø\u0004\u001bØ\u0005÷\bê\fð>ñÿ<¸\u0001\u0006\u0002óÿø\u0004þôú\nì\u000eðAÊð\nòð\u0002\b\u0003íBÆê\u0012ûòù\b÷þøBæÌ\u000eô÷#Üø\u001dß\u000eûõ\u0003þ\u001cÊ\u0012ûòù\b÷þ".getBytes("ISO-8859-1"), 0, bArr, 0, 563);
            $$d = bArr;
            $$e = 241;
            $$a = new byte[]{109, 7, 114, -90, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 55, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, 7, -18, -16, -1, -16, -16, -4, 19, -48, -3, -17, 0, -30, 4, -24, 54, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 54, -29, 31, -48, -17, 4, -24, 1, -6, -13, -13, -29, 38, -50, -16, -1, -12, -24, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 56};
            $$b = 98;
            b = 0;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 1;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
            TuitionPaymentFragmentbindingInflater1 = 1;
            TuitionPaymentFragmentbindingInflater1();
            INSTANCE = new AtomicReference<>();
            int i = TuitionPaymentFragmentbindingInflater1 + 73;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i % 128;
            if (i % 2 != 0) {
                throw null;
            }
        }

        public UserUnlockReceiver(Context context) {
            this.applicationContext = context;
        }

        private static void ensureReceiverRegistered(Context context) {
            int i = 2 % 2;
            int i2 = b + 1;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
            Object obj = null;
            if (i2 % 2 == 0) {
                INSTANCE.get();
                obj.hashCode();
                throw null;
            }
            if (INSTANCE.get() == null) {
                UserUnlockReceiver userUnlockReceiver = new UserUnlockReceiver(context);
                if (PreviewView$1$$ExternalSyntheticBackportWithForwarding0.m(INSTANCE, null, userUnlockReceiver)) {
                    context.registerReceiver(userUnlockReceiver, new IntentFilter("android.intent.action.USER_UNLOCKED"));
                }
            }
            int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 83;
            b = i3 % 128;
            int i4 = i3 % 2;
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) throws Throwable {
            Object[] objArr;
            int i;
            int i2;
            String str;
            Object[] objArr2;
            int i3;
            Object[] objArr3;
            int i4;
            Object[] objArr4;
            int i5;
            Object[] objArr5;
            int i6;
            int i7;
            Object[] objArr6;
            Object[] objArr7;
            Object[] objArr8;
            int i8;
            Object[] objArr9;
            Object[] objArr10;
            Object[] objArrTuitionPaymentFragmentbindingInflater1$7879113;
            Context applicationContext = context;
            Object[] objArr11 = new Object[1];
            a(new char[]{48234, 2896, 53765, 39398, 24752, 10347, 63313, 48726, 1484, 52389, 37943, 25375, 10766, 61897, 47257, 'u', 53046, 38605, 24029, 9355, 60492, 47929}, 46901 - (KeyEvent.getMaxKeyCode() >> 16), objArr11);
            Boolean bool = false;
            String str2 = (String) objArr11[0];
            Object[] objArr12 = new Object[1];
            a(new char[]{48238, 45782, 41224, 36968, 34492, 62747, 58441, 55950, 51686, 14419, 11917, 7652, 3118, 667, 29120}, 3762 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), objArr12);
            String str3 = (String) objArr12[0];
            Object[] objArr13 = new Object[1];
            a(new char[]{48225, 58811, 4063, 45337, 56161, 32114, 42636, 51410, 29412, 38012, 15986, 26505, 35252, 13282, 21760, 65369}, 22993 - (ViewConfiguration.getWindowTouchSlop() >> 8), objArr13);
            String str4 = (String) objArr13[0];
            Object[] objArr14 = new Object[1];
            a(new char[]{48226, 4432, 58896, 48088, 2179, 56921, 45829, 203, 54715, 43869, 30734, 52694, 41660, 28759, 50461, 39647}, (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 44350, objArr14);
            String str5 = (String) objArr14[0];
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1354724972);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                char mode = (char) (43042 - View.MeasureSpec.getMode(0));
                int doubleTapTimeout = 3111 - (ViewConfiguration.getDoubleTapTimeout() >> 16);
                int i9 = (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 21;
                short s = $$a[7];
                Object[] objArr15 = new Object[1];
                c((byte) 52, s, (byte) s, objArr15);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(mode, doubleTapTimeout, i9, -1272852037, false, (String) objArr15[0], null);
            }
            if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null) != -1) {
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-308143642);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                    char offsetBefore = (char) (TextUtils.getOffsetBefore("", 0) + 43042);
                    int iResolveSize = 3111 - View.resolveSize(0, 0);
                    int edgeSlop = (ViewConfiguration.getEdgeSlop() >> 16) + 22;
                    byte[] bArr = $$a;
                    Object[] objArr16 = new Object[1];
                    c((byte) (bArr[156] - 1), (short) 52, bArr[7], objArr16);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(offsetBefore, iResolveSize, edgeSlop, 154975793, false, (String) objArr16[0], null);
                }
                Object[] objArr17 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).get(null);
                int i10 = ((int[]) objArr17[2])[0];
                int i11 = ((int[]) objArr17[1])[0];
                String[] strArr = (String[]) objArr17[3];
                int[] iArr = {i10};
                int iMyPid = Process.myPid();
                int i12 = ~iMyPid;
                int i13 = 1789384114 + (((-1615873293) | iMyPid) * (-676)) + ((1615873292 | (~(86981139 | i12))) * 676) + (((~(iMyPid | 1702854431)) | (~(i12 | (-1618050320))) | 2177027) * 676) + 1944864885;
                int i14 = (i13 << 13) ^ i13;
                int i15 = i14 ^ (i14 >>> 17);
                ((int[]) objArr[0])[0] = i15 ^ (i15 << 5);
                objArr = new Object[]{new int[1], new int[]{i11}, iArr, strArr};
                i = 1;
                bool = bool;
            } else {
                try {
                    Object[] objArr18 = {null, Integer.valueOf(((Integer) Class.forName(str4).getMethod(str5, Object.class).invoke(null, this)).intValue()), 0, 1944864885};
                    byte[] bArr2 = $$d;
                    short s2 = bArr2[5];
                    Object[] objArr19 = new Object[1];
                    d(s2, (byte) (s2 & 83), bArr2[12], objArr19);
                    Class<?> cls = Class.forName((String) objArr19[0]);
                    Object[] objArr20 = new Object[1];
                    d(bArr2[53], (byte) (-bArr2[41]), (byte) (-bArr2[177]), objArr20);
                    Object[] objArr21 = (Object[]) cls.getMethod((String) objArr20[0], Class.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr18);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-308143642);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                        char cNormalizeMetaState = (char) (KeyEvent.normalizeMetaState(0) + 43042);
                        int iIndexOf = 3111 - TextUtils.indexOf("", "", 0, 0);
                        int iRgb = Color.rgb(0, 0, 0) + 16777238;
                        byte[] bArr3 = $$a;
                        Object[] objArr22 = new Object[1];
                        c((byte) (bArr3[156] - 1), (short) 52, bArr3[7], objArr22);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(cNormalizeMetaState, iIndexOf, iRgb, 154975793, false, (String) objArr22[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).set(null, objArr21);
                    try {
                        long jLongValue = ((Long) Class.forName(str2).getDeclaredMethod(str3, new Class[0]).invoke(null, new Object[0])).longValue();
                        Long lValueOf = Long.valueOf(jLongValue);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1355648493);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                            char cIndexOf = (char) (43042 - TextUtils.indexOf("", "", 0, 0));
                            int maximumDrawingCacheSize = 3111 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24);
                            int iKeyCodeFromString = KeyEvent.keyCodeFromString("") + 22;
                            Object[] objArr23 = new Object[1];
                            c((byte) 52, (short) 89, $$a[7], objArr23);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(cIndexOf, maximumDrawingCacheSize, iKeyCodeFromString, -1269618118, false, (String) objArr23[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, lValueOf);
                        Long lValueOf2 = Long.valueOf(jLongValue >> 12);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1354724972);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                            char c = (char) (43043 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)));
                            int i16 = 3112 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1));
                            int packedPositionGroup = 22 - ExpandableListView.getPackedPositionGroup(0L);
                            short s3 = $$a[7];
                            Object[] objArr24 = new Object[1];
                            c((byte) 52, s3, (byte) s3, objArr24);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(c, i16, packedPositionGroup, -1272852037, false, (String) objArr24[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf2);
                        objArr = objArr21;
                        i = 1;
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
            int i17 = ((int[]) objArr[i])[0];
            int i18 = ((int[]) objArr[2])[0];
            if (i18 == i17) {
                Object[] objArr25 = new Object[4];
                objArr25[0] = new int[i];
                int[] iArr2 = new int[i];
                objArr25[i] = iArr2;
                int[] iArr3 = new int[i];
                objArr25[2] = iArr3;
                int i19 = ((int[]) objArr[0])[0];
                int i20 = ((int[]) objArr[2])[0];
                int i21 = ((int[]) objArr[i])[0];
                String[] strArr2 = (String[]) objArr[3];
                iArr3[0] = i20;
                iArr2[0] = i21;
                int iNextInt = new Random().nextInt(688171573);
                int i22 = ~iNextInt;
                int i23 = i19 + 410875624 + (((~(655868867 | i22)) | 411578396) * (-108)) + (((~(i22 | 1049162591)) | (~((-1049162592) | iNextInt)) | 18284672) * 54) + ((iNextInt | 18284672) * 54);
                int i24 = (i23 << 13) ^ i23;
                int i25 = i24 ^ (i24 >>> 17);
                ((int[]) objArr25[0])[0] = i25 ^ (i25 << 5);
                objArr25[3] = strArr2;
                i2 = 0;
            } else {
                ArrayList arrayList = new ArrayList();
                String[] strArr3 = (String[]) objArr[3];
                if (strArr3 != null) {
                    for (String str6 : strArr3) {
                        arrayList.add(str6);
                    }
                }
                int[] iArr4 = new int[i18];
                int i26 = i18 - 1;
                iArr4[i26] = 1;
                Toast.makeText((Context) null, iArr4[((i18 * i26) % 2) - 1], 1).show();
                int i27 = ((int[]) objArr[0])[0];
                int i28 = ((int[]) objArr[2])[0];
                int i29 = ((int[]) objArr[1])[0];
                String[] strArr4 = (String[]) objArr[3];
                int[] iArr5 = {i28};
                int iIdentityHashCode = System.identityHashCode(this);
                int i30 = i27 + (-1140544862) + (((~((-891902146) | iIdentityHashCode)) | 807491649) * 576) + (((~((~iIdentityHashCode) | (-84410497))) | 5637664) * 576) + 1258721856;
                int i31 = (i30 << 13) ^ i30;
                int i32 = i31 ^ (i31 >>> 17);
                i2 = 0;
                ((int[]) objArr[0])[0] = i32 ^ (i32 << 5);
                Object[] objArr26 = {new int[1], new int[]{i29}, iArr5, strArr4};
            }
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2030658839);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                char packedPositionGroup2 = (char) ExpandableListView.getPackedPositionGroup(0L);
                int absoluteGravity = 876 - Gravity.getAbsoluteGravity(i2, i2);
                int iCombineMeasuredStates = 10 - View.combineMeasuredStates(i2, i2);
                byte[] bArr4 = $$a;
                Object[] objArr27 = new Object[1];
                c((byte) (bArr4[156] - 1), (short) 52, bArr4[7], objArr27);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(packedPositionGroup2, absoluteGravity, iCombineMeasuredStates, -1650998592, false, (String) objArr27[0], null);
            }
            long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).getLong(null);
            long jLongValue2 = ((Long) Class.forName(str2).getDeclaredMethod(str3, new Class[0]).invoke(null, new Object[0])).longValue();
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1821222244);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
                char mirror = (char) ('0' - AndroidCharacter.getMirror('0'));
                int capsMode = TextUtils.getCapsMode("", 0, 0) + 876;
                int iAxisFromString = 9 - MotionEvent.axisFromString("");
                Object[] objArr28 = new Object[1];
                c((byte) 52, (short) 89, $$a[7], objArr28);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(mirror, capsMode, iAxisFromString, 2012020043, false, (String) objArr28[0], null);
            }
            if (j == ((jLongValue2 - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).getLong(null) << 52) >>> 52)) >> 12)) {
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1822145765);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault10 == null) {
                    char packedPositionGroup3 = (char) ExpandableListView.getPackedPositionGroup(0L);
                    int iIndexOf2 = 875 - TextUtils.indexOf((CharSequence) "", '0', 0);
                    int edgeSlop2 = 10 - (ViewConfiguration.getEdgeSlop() >> 16);
                    short s4 = $$a[7];
                    Object[] objArr29 = new Object[1];
                    c((byte) 52, s4, (byte) s4, objArr29);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.b(packedPositionGroup3, iIndexOf2, edgeSlop2, 2012931276, false, (String) objArr29[0], null);
                }
                Object[] objArr30 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault10).get(null);
                objArr2 = new Object[]{new int[]{((int[]) objArr30[0])[0]}, new int[1], new int[]{((int[]) objArr30[2])[0]}, (String[]) objArr30[3]};
                int i33 = ~((int) Runtime.getRuntime().totalMemory());
                int i34 = (((-198842921) + ((~((-542151109) | i33)) * (-783))) + (((~(i33 | (-787660280))) | (-827970509)) * 783)) - 402729215;
                int i35 = (i34 << 13) ^ i34;
                int i36 = i35 ^ (i35 >>> 17);
                ((int[]) objArr2[1])[0] = i36 ^ (i36 << 5);
                str = str3;
            } else {
                Context applicationContext2 = applicationContext != null ? ((applicationContext instanceof ContextWrapper) && ((ContextWrapper) applicationContext).getBaseContext() == null) ? null : context.getApplicationContext() : applicationContext;
                Object[] objArr31 = {applicationContext2, Integer.valueOf(((Integer) Class.forName(str4).getMethod(str5, Object.class).invoke(null, this)).intValue()), 0, -402729215};
                byte[] bArr5 = $$d;
                Object[] objArr32 = new Object[1];
                d((short) 119, (byte) 105, bArr5[30], objArr32);
                Class<?> cls2 = Class.forName((String) objArr32[0]);
                Object[] objArr33 = new Object[1];
                d((short) ($$e & 1000), bArr5[165], (byte) (-bArr5[177]), objArr33);
                Object[] objArr34 = (Object[]) cls2.getMethod((String) objArr33[0], Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr31);
                if (applicationContext2 != null) {
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1822145765);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault11 == null) {
                        char c2 = (char) (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
                        int maximumFlingVelocity = (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 876;
                        int minimumFlingVelocity = (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 10;
                        short s5 = $$a[7];
                        Object[] objArr35 = new Object[1];
                        c((byte) 52, s5, (byte) s5, objArr35);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.b(c2, maximumFlingVelocity, minimumFlingVelocity, 2012931276, false, (String) objArr35[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault11).set(null, objArr34);
                    try {
                        str = str3;
                        long jLongValue3 = ((Long) Class.forName(str2).getDeclaredMethod(str, new Class[0]).invoke(null, new Object[0])).longValue();
                        Long lValueOf3 = Long.valueOf(jLongValue3);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1821222244);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault12 == null) {
                            char packedPositionType = (char) ExpandableListView.getPackedPositionType(0L);
                            int i37 = 877 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1));
                            int keyRepeatTimeout = 10 - (ViewConfiguration.getKeyRepeatTimeout() >> 16);
                            Object[] objArr36 = new Object[1];
                            c((byte) 52, (short) 89, $$a[7], objArr36);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.b(packedPositionType, i37, keyRepeatTimeout, 2012020043, false, (String) objArr36[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault12).set(null, lValueOf3);
                        Long lValueOf4 = Long.valueOf(jLongValue3 >> 12);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2030658839);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault13 == null) {
                            char fadingEdgeLength = (char) (ViewConfiguration.getFadingEdgeLength() >> 16);
                            int i38 = 876 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
                            int i39 = 10 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1));
                            byte[] bArr6 = $$a;
                            Object[] objArr37 = new Object[1];
                            c((byte) (bArr6[156] - 1), (short) 52, bArr6[7], objArr37);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.b(fadingEdgeLength, i38, i39, -1650998592, false, (String) objArr37[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault13).set(null, lValueOf4);
                    } catch (Exception unused2) {
                        throw new RuntimeException();
                    }
                } else {
                    objArr34 = objArr34;
                    str = str3;
                }
                objArr2 = objArr34;
            }
            int i40 = ((int[]) objArr2[2])[0];
            int i41 = ((int[]) objArr2[0])[0];
            if (i41 == i40) {
                int i42 = ((int[]) objArr2[1])[0];
                Object[] objArr38 = {new int[]{((int[]) objArr2[0])[0]}, new int[1], new int[]{((int[]) objArr2[2])[0]}, (String[]) objArr2[3]};
                int iIdentityHashCode2 = System.identityHashCode(this);
                int i43 = ~((-18607108) | iIdentityHashCode2);
                int i44 = (-393131732) + ((1098754 | i43) * (-280)) + ((i43 | (~((-21703122) | iIdentityHashCode2))) * 140);
                int i45 = ~((-17508354) | iIdentityHashCode2);
                int i46 = ~iIdentityHashCode2;
                int i47 = i42 + i44 + (((~(i46 | (-4194769))) | i45 | (~((-1098755) | i46))) * 140);
                int i48 = (i47 << 13) ^ i47;
                int i49 = i48 ^ (i48 >>> 17);
                i3 = 0;
                ((int[]) objArr38[1])[0] = i49 ^ (i49 << 5);
            } else {
                Toast.makeText((Context) null, i41 / (((i41 - 1) * i41) % 2), 0).show();
                int i50 = ((int[]) objArr2[1])[0];
                Object[] objArr39 = {new int[]{((int[]) objArr2[0])[0]}, new int[1], new int[]{((int[]) objArr2[2])[0]}, (String[]) objArr2[3]};
                int iElapsedRealtime = (int) SystemClock.elapsedRealtime();
                int i51 = i50 + ((((~((-709280905) | iElapsedRealtime)) | (-803204864)) * TypedValues.PositionType.TYPE_TRANSITION_EASING) - 148426068) + ((~((~iElapsedRealtime) | (-709280905))) * TypedValues.PositionType.TYPE_TRANSITION_EASING);
                int i52 = i51 ^ (i51 << 13);
                int i53 = i52 ^ (i52 >>> 17);
                i3 = 0;
                ((int[]) objArr39[1])[0] = i53 ^ (i53 << 5);
            }
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1545400921);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault14 == null) {
                char jumpTapTimeout = (char) (ViewConfiguration.getJumpTapTimeout() >> 16);
                int i54 = (ExpandableListView.getPackedPositionForChild(i3, i3) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(i3, i3) == 0L ? 0 : -1)) + 877;
                int packedPositionType2 = ExpandableListView.getPackedPositionType(0L) + 10;
                byte[] bArr7 = $$a;
                Object[] objArr40 = new Object[1];
                c((byte) (-bArr7[9]), (short) 141, (byte) (-bArr7[153]), objArr40);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.b(jumpTapTimeout, i54, packedPositionType2, -1199417970, false, (String) objArr40[0], null);
            }
            long j2 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault14).getLong(null);
            long jLongValue4 = ((Long) Class.forName(str2).getDeclaredMethod(str, new Class[0]).invoke(null, new Object[0])).longValue();
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-340665130);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault15 == null) {
                char cAlpha = (char) Color.alpha(0);
                int maxKeyCode = (KeyEvent.getMaxKeyCode() >> 16) + 876;
                int i55 = (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 9;
                byte[] bArr8 = $$a;
                byte b2 = bArr8[7];
                Object[] objArr41 = new Object[1];
                c(b2, (short) (b2 | 151), (byte) (-bArr8[33]), objArr41);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.b(cAlpha, maxKeyCode, i55, 254769921, false, (String) objArr41[0], null);
            }
            if (j2 == ((jLongValue4 - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault15).getLong(null) << 52) >>> 52)) >> 12)) {
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1435299656);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault16 == null) {
                    char cGreen = (char) Color.green(0);
                    int deadChar = KeyEvent.getDeadChar(0, 0) + 876;
                    int touchSlop = 10 - (ViewConfiguration.getTouchSlop() >> 8);
                    byte[] bArr9 = $$a;
                    byte b3 = bArr9[1];
                    Object[] objArr42 = new Object[1];
                    c(b3, (short) (b3 | 144), (byte) (-bArr9[153]), objArr42);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.b(cGreen, deadChar, touchSlop, 1324201839, false, (String) objArr42[0], null);
                }
                Object[] objArr43 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault16).get(null);
                objArr3 = new Object[]{new int[]{((int[]) objArr43[0])[0]}, new int[1], new int[]{((int[]) objArr43[2])[0]}, (String[]) objArr43[3]};
                int iMyTid = Process.myTid();
                int i56 = (((1858126516 + (((~(709847959 | iMyTid)) | 78676072) * 336)) + (((~(iMyTid | 750158188)) | 38365843) * (-168))) + (((~((~iMyTid) | 750158188)) | 709847959) * 168)) - 1451176860;
                int i57 = (i56 << 13) ^ i56;
                int i58 = i57 ^ (i57 >>> 17);
                ((int[]) objArr3[1])[0] = i58 ^ (i58 << 5);
            } else {
                Object[] objArr44 = {Integer.valueOf(((Integer) Class.forName(str4).getMethod(str5, Object.class).invoke(null, this)).intValue()), -1451176860};
                byte[] bArr10 = $$d;
                Object[] objArr45 = new Object[1];
                d((short) 276, bArr10[88], bArr10[544], objArr45);
                Class<?> cls3 = Class.forName((String) objArr45[0]);
                Object[] objArr46 = new Object[1];
                d(bArr10[53], (byte) (-bArr10[41]), (byte) (-bArr10[177]), objArr46);
                objArr3 = (Object[]) cls3.getMethod((String) objArr46[0], Integer.TYPE, Integer.TYPE).invoke(null, objArr44);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault17 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1435299656);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault17 == null) {
                    char cAlpha2 = (char) Color.alpha(0);
                    int minimumFlingVelocity2 = 876 - (ViewConfiguration.getMinimumFlingVelocity() >> 16);
                    int keyRepeatTimeout2 = 10 - (ViewConfiguration.getKeyRepeatTimeout() >> 16);
                    byte[] bArr11 = $$a;
                    byte b4 = bArr11[1];
                    Object[] objArr47 = new Object[1];
                    c(b4, (short) (b4 | 144), (byte) (-bArr11[153]), objArr47);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault17 = initSession.b(cAlpha2, minimumFlingVelocity2, keyRepeatTimeout2, 1324201839, false, (String) objArr47[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault17).set(null, objArr3);
                try {
                    long jLongValue5 = ((Long) Class.forName(str2).getDeclaredMethod(str, new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf5 = Long.valueOf(jLongValue5);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault18 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-340665130);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault18 == null) {
                        char scrollDefaultDelay = (char) (ViewConfiguration.getScrollDefaultDelay() >> 16);
                        int gidForName = 875 - Process.getGidForName("");
                        int iIndexOf3 = TextUtils.indexOf("", "") + 10;
                        byte[] bArr12 = $$a;
                        byte b5 = bArr12[7];
                        Object[] objArr48 = new Object[1];
                        c(b5, (short) (b5 | 151), (byte) (-bArr12[33]), objArr48);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault18 = initSession.b(scrollDefaultDelay, gidForName, iIndexOf3, 254769921, false, (String) objArr48[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault18).set(null, lValueOf5);
                    Long lValueOf6 = Long.valueOf(jLongValue5 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault19 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1545400921);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault19 == null) {
                        char cKeyCodeFromString = (char) KeyEvent.keyCodeFromString("");
                        int windowTouchSlop = (ViewConfiguration.getWindowTouchSlop() >> 8) + 876;
                        int i59 = 9 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1));
                        byte[] bArr13 = $$a;
                        Object[] objArr49 = new Object[1];
                        c((byte) (-bArr13[9]), (short) 141, (byte) (-bArr13[153]), objArr49);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault19 = initSession.b(cKeyCodeFromString, windowTouchSlop, i59, -1199417970, false, (String) objArr49[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault19).set(null, lValueOf6);
                } catch (Exception unused3) {
                    throw new RuntimeException();
                }
            }
            int i60 = ((int[]) objArr3[2])[0];
            int i61 = ((int[]) objArr3[0])[0];
            if (i61 == i60) {
                int i62 = ((int[]) objArr3[1])[0];
                Object[] objArr50 = {new int[]{((int[]) objArr3[0])[0]}, new int[1], new int[]{((int[]) objArr3[2])[0]}, (String[]) objArr3[3]};
                int i63 = ~new Random().nextInt();
                int i64 = i62 + (-651225356) + ((~((-340018187) | i63)) * (-783)) + (((~(i63 | (-342775563))) | (-383085792)) * 783);
                int i65 = (i64 << 13) ^ i64;
                int i66 = i65 ^ (i65 >>> 17);
                i4 = 0;
                ((int[]) objArr50[1])[0] = i66 ^ (i66 << 5);
            } else {
                ArrayList arrayList2 = new ArrayList();
                String[] strArr5 = (String[]) objArr3[3];
                if (strArr5 != null) {
                    for (String str7 : strArr5) {
                        arrayList2.add(str7);
                    }
                }
                Toast.makeText((Context) null, i61 / (((i61 - 1) * i61) % 2), 0).show();
                int i67 = ((int[]) objArr3[1])[0];
                Object[] objArr51 = {new int[]{((int[]) objArr3[0])[0]}, new int[1], new int[]{((int[]) objArr3[2])[0]}, (String[]) objArr3[3]};
                int elapsedCpuTime = (int) Process.getElapsedCpuTime();
                int i68 = i67 + (-454980592) + (((-393281) | elapsedCpuTime) * (-627)) + (((~(505376884 | elapsedCpuTime)) | 545687113) * (-627)) + (((~(elapsedCpuTime | 545687113)) | (~((~elapsedCpuTime) | (-505376885)))) * 627);
                int i69 = i68 ^ (i68 << 13);
                int i70 = i69 ^ (i69 >>> 17);
                i4 = 0;
                ((int[]) objArr51[1])[0] = i70 ^ (i70 << 5);
            }
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault20 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-342512172);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault20 == null) {
                char cRed = (char) Color.red(i4);
                int i71 = 877 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1));
                int iIndexOf4 = 10 - TextUtils.indexOf("", "");
                byte b6 = $$a[7];
                short s6 = (short) (b6 | 158);
                Object[] objArr52 = new Object[1];
                c(b6, s6, (byte) (s6 & 47), objArr52);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault20 = initSession.b(cRed, i71, iIndexOf4, 252381699, false, (String) objArr52[0], null);
            }
            long j3 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault20).getLong(null);
            long jLongValue6 = ((Long) Class.forName(str2).getDeclaredMethod(str, new Class[0]).invoke(null, new Object[0])).longValue();
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault21 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1823069286);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault21 == null) {
                char tapTimeout = (char) (ViewConfiguration.getTapTimeout() >> 16);
                int iIndexOf5 = 875 - TextUtils.indexOf((CharSequence) "", '0', 0);
                int scrollBarSize = 10 - (ViewConfiguration.getScrollBarSize() >> 8);
                Object[] objArr53 = new Object[1];
                c((byte) 52, (short) 158, $$a[7], objArr53);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault21 = initSession.b(tapTimeout, iIndexOf5, scrollBarSize, 2009631821, false, (String) objArr53[0], null);
            }
            if (j3 == ((jLongValue6 - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault21).getLong(null) << 52) >>> 52)) >> 12)) {
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault22 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-337894567);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault22 == null) {
                    char cNormalizeMetaState2 = (char) KeyEvent.normalizeMetaState(0);
                    int iIndexOf6 = TextUtils.indexOf("", "") + 876;
                    int longPressTimeout = (ViewConfiguration.getLongPressTimeout() >> 16) + 10;
                    byte[] bArr14 = $$a;
                    byte b7 = bArr14[7];
                    Object[] objArr54 = new Object[1];
                    c(b7, (short) (b7 | 210), bArr14[10], objArr54);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault22 = initSession.b(cNormalizeMetaState2, iIndexOf6, longPressTimeout, 256017550, false, (String) objArr54[0], null);
                }
                Object[] objArr55 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault22).get(null);
                objArr4 = new Object[]{new int[]{((int[]) objArr55[0])[0]}, new int[1], new int[]{((int[]) objArr55[2])[0]}, (String[]) objArr55[3]};
                int iIdentityHashCode3 = System.identityHashCode(this);
                int i72 = ((1663844024 + (((-956358673) | iIdentityHashCode3) * (-381))) + (((~((~iIdentityHashCode3) | (-992273468))) | 112139819) * 381)) - 1865418478;
                int i73 = (i72 << 13) ^ i72;
                int i74 = i73 ^ (i73 >>> 17);
                ((int[]) objArr4[1])[0] = i74 ^ (i74 << 5);
            } else {
                Context applicationContext3 = applicationContext != null ? ((applicationContext instanceof ContextWrapper) && ((ContextWrapper) applicationContext).getBaseContext() == null) ? null : context.getApplicationContext() : applicationContext;
                Object[] objArr56 = {applicationContext3, Integer.valueOf(((Integer) Class.forName(str4).getMethod(str5, Object.class).invoke(null, this)).intValue()), -1165852350};
                byte[] bArr15 = $$d;
                Object[] objArr57 = new Object[1];
                d((short) 285, (byte) 45, bArr15[12], objArr57);
                Class<?> cls4 = Class.forName((String) objArr57[0]);
                Object[] objArr58 = new Object[1];
                d(bArr15[53], (byte) (-bArr15[41]), (byte) (-bArr15[177]), objArr58);
                Object[] objArr59 = (Object[]) cls4.getMethod((String) objArr58[0], Context.class, Integer.TYPE, Integer.TYPE).invoke(null, objArr56);
                if (applicationContext3 != null) {
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault23 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-337894567);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault23 == null) {
                        char threadPriority = (char) ((Process.getThreadPriority(0) + 20) >> 6);
                        int iIndexOf7 = 875 - TextUtils.indexOf((CharSequence) "", '0', 0);
                        int offsetBefore2 = 10 - TextUtils.getOffsetBefore("", 0);
                        byte[] bArr16 = $$a;
                        byte b8 = bArr16[7];
                        Object[] objArr60 = new Object[1];
                        c(b8, (short) (b8 | 210), bArr16[10], objArr60);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault23 = initSession.b(threadPriority, iIndexOf7, offsetBefore2, 256017550, false, (String) objArr60[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault23).set(null, objArr59);
                    try {
                        long jLongValue7 = ((Long) Class.forName(str2).getDeclaredMethod(str, new Class[0]).invoke(null, new Object[0])).longValue();
                        Long lValueOf7 = Long.valueOf(jLongValue7);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault24 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1823069286);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault24 == null) {
                            char c3 = (char) (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                            int iMyPid2 = 876 - (Process.myPid() >> 22);
                            int offsetAfter = TextUtils.getOffsetAfter("", 0) + 10;
                            Object[] objArr61 = new Object[1];
                            c((byte) 52, (short) 158, $$a[7], objArr61);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault24 = initSession.b(c3, iMyPid2, offsetAfter, 2009631821, false, (String) objArr61[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault24).set(null, lValueOf7);
                        Long lValueOf8 = Long.valueOf(jLongValue7 >> 12);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault25 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-342512172);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault25 == null) {
                            char cIndexOf2 = (char) TextUtils.indexOf("", "");
                            int threadPriority2 = ((Process.getThreadPriority(0) + 20) >> 6) + 876;
                            int offsetAfter2 = TextUtils.getOffsetAfter("", 0) + 10;
                            byte b9 = $$a[7];
                            short s7 = (short) (b9 | 158);
                            Object[] objArr62 = new Object[1];
                            c(b9, s7, (byte) (s7 & 47), objArr62);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault25 = initSession.b(cIndexOf2, threadPriority2, offsetAfter2, 252381699, false, (String) objArr62[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault25).set(null, lValueOf8);
                    } catch (Exception unused4) {
                        throw new RuntimeException();
                    }
                } else {
                    objArr59 = objArr59;
                }
                objArr4 = objArr59;
            }
            int i75 = ((int[]) objArr4[2])[0];
            int i76 = ((int[]) objArr4[0])[0];
            if (i76 == i75) {
                int i77 = ((int[]) objArr4[1])[0];
                Object[] objArr63 = {new int[]{((int[]) objArr4[0])[0]}, new int[1], new int[]{((int[]) objArr4[2])[0]}, (String[]) objArr4[3]};
                int iNextInt2 = new Random().nextInt(815726947);
                int i78 = i77 + (-1582203624) + ((~((-96469036) | iNextInt2)) * (-301)) + (((~(667451819 | iNextInt2)) | (~((~iNextInt2) | 707762048))) * (-301)) + (((~(iNextInt2 | (-707762049))) | 667451819) * 301);
                int i79 = (i78 << 13) ^ i78;
                int i80 = i79 ^ (i79 >>> 17);
                ((int[]) objArr63[1])[0] = i80 ^ (i80 << 5);
                i5 = 0;
            } else {
                int[] iArr6 = new int[i76];
                int i81 = i76 - 1;
                iArr6[i81] = 1;
                Toast.makeText((Context) null, iArr6[((i76 * i81) % 2) - 1], 1).show();
                int i82 = ((int[]) objArr4[1])[0];
                Object[] objArr64 = {new int[]{((int[]) objArr4[0])[0]}, new int[1], new int[]{((int[]) objArr4[2])[0]}, (String[]) objArr4[3]};
                int i83 = (~System.identityHashCode(this)) | 29799320;
                int i84 = i82 + 178596699 + (i83 * 495) + (((~i83) | 8397336) * 495);
                int i85 = (i84 << 13) ^ i84;
                int i86 = i85 ^ (i85 >>> 17);
                i5 = 0;
                ((int[]) objArr64[1])[0] = i86 ^ (i86 << 5);
            }
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault26 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(650054);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault26 == null) {
                char keyRepeatTimeout3 = (char) (ViewConfiguration.getKeyRepeatTimeout() >> 16);
                int iIndexOf8 = TextUtils.indexOf("", "", i5) + 651;
                int i87 = 45 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1));
                Object[] objArr65 = new Object[1];
                c((byte) 52, (short) 158, $$a[7], objArr65);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault26 = initSession.b(keyRepeatTimeout3, iIndexOf8, i87, -459846511, false, (String) objArr65[0], null);
            }
            long j4 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault26).getLong(null);
            long jLongValue8 = ((Long) Class.forName(str2).getDeclaredMethod(str, new Class[0]).invoke(null, new Object[0])).longValue();
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault27 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(795782016);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault27 == null) {
                char defaultSize = (char) View.getDefaultSize(0, 0);
                int iLastIndexOf = 650 - TextUtils.lastIndexOf("", '0', 0);
                int iLastIndexOf2 = 43 - TextUtils.lastIndexOf("", '0');
                byte b10 = $$a[7];
                short s8 = (short) (b10 | 158);
                Object[] objArr66 = new Object[1];
                c(b10, s8, (byte) (s8 & 47), objArr66);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault27 = initSession.b(defaultSize, iLastIndexOf, iLastIndexOf2, -873460649, false, (String) objArr66[0], null);
            }
            if (j4 == ((jLongValue8 - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault27).getLong(null) << 52) >>> 52)) >> 12)) {
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault28 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1148961515);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault28 == null) {
                    char threadPriority3 = (char) ((Process.getThreadPriority(0) + 20) >> 6);
                    int iKeyCodeFromString2 = KeyEvent.keyCodeFromString("") + 651;
                    int iIndexOf9 = 44 - TextUtils.indexOf("", "");
                    byte[] bArr17 = $$a;
                    Object[] objArr67 = new Object[1];
                    c((byte) (bArr17[156] - 1), (short) 52, bArr17[7], objArr67);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault28 = initSession.b(threadPriority3, iKeyCodeFromString2, iIndexOf9, -1595579076, false, (String) objArr67[0], null);
                }
                Object[] objArr68 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault28).get(null);
                objArr5 = new Object[]{new int[]{i}, new String[0], new int[]{i}, new int[1]};
                int i88 = ((int[]) objArr68[2])[0];
                int i89 = ((int[]) objArr68[0])[0];
                int i90 = (int) Runtime.getRuntime().totalMemory();
                int i91 = 1745876209 + (((~(838604144 | i90)) | 240262 | (~((-835173335) | i90))) * (-744)) + (((~i90) | 3671072) * 744) + ((i90 | (-240263)) * 744) + 1389669817;
                int i92 = (i91 << 13) ^ i91;
                int i93 = i92 ^ (i92 >>> 17);
                ((int[]) objArr5[3])[0] = i93 ^ (i93 << 5);
                i6 = 0;
            } else {
                try {
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault29 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1686493381);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault29 == null) {
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault29 = initSession.b((char) (ViewConfiguration.getDoubleTapTimeout() >> 16), Color.green(0) + 1610, 26 - (ViewConfiguration.getTouchSlop() >> 8), 2145681644, false, null, new Class[0]);
                    }
                    Object[] objArr69 = {null, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault29).newInstance(null), 1389669817, r6};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault30 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1625117732);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault30 == null) {
                        char cResolveSize = (char) View.resolveSize(0, 0);
                        int iLastIndexOf3 = 650 - TextUtils.lastIndexOf("", '0', 0, 0);
                        int iResolveSizeAndState = View.resolveSizeAndState(0, 0, 0) + 44;
                        byte b11 = $$a[7];
                        short s9 = (short) (b11 | 158);
                        Object[] objArr70 = new Object[1];
                        c(b11, s9, (byte) (s9 & 47), objArr70);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault30 = initSession.b(cResolveSize, iLastIndexOf3, iResolveSizeAndState, 2075921419, false, (String) objArr70[0], new Class[]{(Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) ((-1) - TextUtils.lastIndexOf("", '0', 0, 0)), (KeyEvent.getMaxKeyCode() >> 16) + 695, 97 - MotionEvent.axisFromString("")), (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (View.MeasureSpec.makeMeasureSpec(0, 0) + 63406), TextUtils.getOffsetAfter("", 0) + 793, 83 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1))), Integer.TYPE, Integer.TYPE});
                    }
                    objArr5 = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault30).invoke(null, objArr69);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault31 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1148961515);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault31 == null) {
                        char c4 = (char) (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
                        int i94 = 651 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
                        int offsetBefore3 = 44 - TextUtils.getOffsetBefore("", 0);
                        byte[] bArr18 = $$a;
                        Object[] objArr71 = new Object[1];
                        c((byte) (bArr18[156] - 1), (short) 52, bArr18[7], objArr71);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault31 = initSession.b(c4, i94, offsetBefore3, -1595579076, false, (String) objArr71[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault31).set(null, objArr5);
                    try {
                        long jLongValue9 = ((Long) Class.forName(str2).getDeclaredMethod(str, new Class[0]).invoke(null, new Object[0])).longValue();
                        Long lValueOf9 = Long.valueOf(jLongValue9);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault32 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(795782016);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault32 == null) {
                            char c5 = (char) ((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) - 1);
                            int iIndexOf10 = 651 - TextUtils.indexOf("", "", 0);
                            int i95 = (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 43;
                            byte b12 = $$a[7];
                            short s10 = (short) (b12 | 158);
                            Object[] objArr72 = new Object[1];
                            c(b12, s10, (byte) (s10 & 47), objArr72);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault32 = initSession.b(c5, iIndexOf10, i95, -873460649, false, (String) objArr72[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault32).set(null, lValueOf9);
                        Long lValueOf10 = Long.valueOf(jLongValue9 >> 12);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault33 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(650054);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault33 == null) {
                            char offsetAfter3 = (char) TextUtils.getOffsetAfter("", 0);
                            int packedPositionType3 = 651 - ExpandableListView.getPackedPositionType(0L);
                            int maxKeyCode2 = 44 - (KeyEvent.getMaxKeyCode() >> 16);
                            Object[] objArr73 = new Object[1];
                            c((byte) 52, (short) 158, $$a[7], objArr73);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault33 = initSession.b(offsetAfter3, packedPositionType3, maxKeyCode2, -459846511, false, (String) objArr73[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault33).set(null, lValueOf10);
                        i6 = 0;
                    } catch (Exception unused5) {
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
            int i96 = ((int[]) objArr5[i6])[i6];
            int i97 = ((int[]) objArr5[2])[i6];
            if (i97 == i96) {
                Object[] objArr74 = new Object[4];
                int[] iArr7 = new int[1];
                objArr74[i6] = iArr7;
                int[] iArr8 = new int[1];
                objArr74[2] = iArr8;
                objArr74[3] = new int[1];
                int i98 = ((int[]) objArr5[3])[i6];
                int i99 = ((int[]) objArr5[2])[i6];
                int i100 = ((int[]) objArr5[i6])[i6];
                iArr8[i6] = i99;
                iArr7[i6] = i100;
                objArr74[1] = new String[i6];
                int iMyTid2 = Process.myTid();
                int i101 = i98 + 1033355131 + (((~((-4260357) | iMyTid2)) | (~((~iMyTid2) | (-829547)))) * (-318)) + (((~(736183189 | iMyTid2)) | (-737012736)) * (-318)) + (((~(iMyTid2 | (-736183190))) | 732752379) * TypedValues.AttributesType.TYPE_PIVOT_TARGET);
                int i102 = (i101 << 13) ^ i101;
                int i103 = i102 ^ (i102 >>> 17);
                i7 = 0;
                ((int[]) objArr74[3])[0] = i103 ^ (i103 << 5);
            } else {
                ArrayList arrayList3 = new ArrayList();
                String[] strArr6 = (String[]) objArr5[1];
                if (strArr6 != null) {
                    for (String str8 : strArr6) {
                        arrayList3.add(str8);
                    }
                }
                Toast.makeText((Context) null, i97 / (((i97 - 1) * i97) % 2), 0).show();
                Object[] objArr75 = {new int[]{i}, new String[0], new int[]{i}, new int[1]};
                int i104 = ((int[]) objArr5[3])[0];
                int i105 = ((int[]) objArr5[2])[0];
                int i106 = ((int[]) objArr5[0])[0];
                int startUptimeMillis = (int) Process.getStartUptimeMillis();
                int i107 = ~startUptimeMillis;
                int i108 = ~(746776491 | i107);
                int i109 = i104 + (-106634255) + (((-751759292) | i108) * (-712)) + (((~(startUptimeMillis | (-4982801))) | (~(i107 | 751759291))) * (-712)) + ((743345681 | i108) * 712);
                int i110 = i109 ^ (i109 << 13);
                int i111 = i110 ^ (i110 >>> 17);
                i7 = 0;
                ((int[]) objArr75[3])[0] = i111 ^ (i111 << 5);
            }
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault34 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault34 == null) {
                char cArgb = (char) (31533 - Color.argb(i7, i7, i7, i7));
                int mirror2 = 969 - AndroidCharacter.getMirror('0');
                int iIndexOf11 = 28 - TextUtils.indexOf("", "", i7, i7);
                byte b13 = $$a[7];
                short s11 = (short) (b13 | 158);
                Object[] objArr76 = new Object[1];
                c(b13, s11, (byte) (s11 & 47), objArr76);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault34 = initSession.b(cArgb, mirror2, iIndexOf11, -1048449946, false, (String) objArr76[0], null);
            }
            if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault34).getLong(null) != -1) {
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault35 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault35 == null) {
                    char jumpTapTimeout2 = (char) ((ViewConfiguration.getJumpTapTimeout() >> 16) + 31533);
                    int size = 921 - View.MeasureSpec.getSize(0);
                    int iAlpha = Color.alpha(0) + 28;
                    byte[] bArr19 = $$a;
                    Object[] objArr77 = new Object[1];
                    c((byte) (bArr19[156] - 1), (short) 52, bArr19[7], objArr77);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault35 = initSession.b(jumpTapTimeout2, size, iAlpha, -1142834547, false, (String) objArr77[0], null);
                }
                Object[] objArr78 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault35).get(null);
                objArr6 = new Object[]{new int[1], new int[]{((int[]) objArr78[1])[0]}, (Object[]) objArr78[2], new int[]{((int[]) objArr78[3])[0]}, (String[]) objArr78[4]};
                int startUptimeMillis2 = (int) Process.getStartUptimeMillis();
                int i112 = (((480126502 + (((~(startUptimeMillis2 | 1313690314)) | (-460389330)) * (-465))) + ((1313690314 | (~((-460389330) | startUptimeMillis2))) * 930)) + ((startUptimeMillis2 | (-288401682)) * 465)) - 807726501;
                int i113 = (i112 << 13) ^ i112;
                int i114 = i113 ^ (i113 >>> 17);
                ((int[]) objArr6[0])[0] = i114 ^ (i114 << 5);
            } else {
                Object[] objArr79 = {applicationContext != null ? ((applicationContext instanceof ContextWrapper) && ((ContextWrapper) applicationContext).getBaseContext() == null) ? null : context.getApplicationContext() : applicationContext, Integer.valueOf(((Integer) Class.forName(str4).getMethod(str5, Object.class).invoke(null, this)).intValue()), r6, -807726501};
                byte[] bArr20 = $$d;
                Object[] objArr80 = new Object[1];
                d((short) 330, bArr20[6], bArr20[12], objArr80);
                Class<?> cls5 = Class.forName((String) objArr80[0]);
                Object[] objArr81 = new Object[1];
                d((short) 390, bArr20[165], (byte) (-bArr20[177]), objArr81);
                objArr6 = (Object[]) cls5.getMethod((String) objArr81[0], Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr79);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault36 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault36 == null) {
                    char maxKeyCode3 = (char) ((KeyEvent.getMaxKeyCode() >> 16) + 31533);
                    int iResolveOpacity = Drawable.resolveOpacity(0, 0) + 921;
                    int bitsPerPixel = 27 - ImageFormat.getBitsPerPixel(0);
                    byte[] bArr21 = $$a;
                    Object[] objArr82 = new Object[1];
                    c((byte) (bArr21[156] - 1), (short) 52, bArr21[7], objArr82);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault36 = initSession.b(maxKeyCode3, iResolveOpacity, bitsPerPixel, -1142834547, false, (String) objArr82[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault36).set(null, objArr6);
                try {
                    long jLongValue10 = ((Long) Class.forName(str2).getDeclaredMethod(str, new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf11 = Long.valueOf(jLongValue10);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault37 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(889369593);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault37 == null) {
                        char cCombineMeasuredStates = (char) (View.combineMeasuredStates(0, 0) + 31533);
                        int iLastIndexOf4 = 920 - TextUtils.lastIndexOf("", '0', 0, 0);
                        int i115 = 28 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1));
                        Object[] objArr83 = new Object[1];
                        c((byte) 52, (short) 89, $$a[7], objArr83);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault37 = initSession.b(cCombineMeasuredStates, iLastIndexOf4, i115, -778300370, false, (String) objArr83[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault37).set(null, lValueOf11);
                    Long lValueOf12 = Long.valueOf(jLongValue10 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault38 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault38 == null) {
                        char cResolveSizeAndState = (char) (31533 - View.resolveSizeAndState(0, 0, 0));
                        int scrollBarFadeDuration = 921 - (ViewConfiguration.getScrollBarFadeDuration() >> 16);
                        int i116 = 29 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1));
                        byte b14 = $$a[7];
                        short s12 = (short) (b14 | 158);
                        Object[] objArr84 = new Object[1];
                        c(b14, s12, (byte) (s12 & 47), objArr84);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault38 = initSession.b(cResolveSizeAndState, scrollBarFadeDuration, i116, -1048449946, false, (String) objArr84[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault38).set(null, lValueOf12);
                } catch (Exception unused6) {
                    throw new RuntimeException();
                }
            }
            if (((int[]) objArr6[3])[0] != ((int[]) objArr6[1])[0]) {
                ArrayList arrayList4 = new ArrayList();
                String[] strArr7 = (String[]) objArr6[4];
                if (strArr7 != null) {
                    for (String str9 : strArr7) {
                        arrayList4.add(str9);
                    }
                }
                throw null;
            }
            int i117 = ((int[]) objArr6[0])[0];
            Object[] objArr85 = {new int[1], new int[]{((int[]) objArr6[1])[0]}, (Object[]) objArr6[2], new int[]{((int[]) objArr6[3])[0]}, (String[]) objArr6[4]};
            int iIdentityHashCode4 = System.identityHashCode(this);
            int i118 = ~((-33628243) | iIdentityHashCode4);
            int i119 = i117 + 548294367 + ((67145225 | i118) * (-476)) + (i118 * 952) + ((~((~iIdentityHashCode4) | (-33628243))) * 476);
            int i120 = (i119 << 13) ^ i119;
            int i121 = i120 ^ (i120 >>> 17);
            ((int[]) objArr85[0])[0] = i121 ^ (i121 << 5);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault39 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(797565291);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault39 == null) {
                char c6 = (char) (1 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)));
                int i122 = 2268 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1));
                int fadingEdgeLength2 = (ViewConfiguration.getFadingEdgeLength() >> 16) + 33;
                Object[] objArr86 = new Object[1];
                c((byte) 52, (short) 89, $$a[7], objArr86);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault39 = initSession.b(c6, i122, fadingEdgeLength2, -887667012, false, (String) objArr86[0], null);
            }
            if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault39).getLong(null) != -1) {
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault40 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1013250600);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault40 == null) {
                    char c7 = (char) ((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) - 1);
                    int iNormalizeMetaState = KeyEvent.normalizeMetaState(0) + 2267;
                    int i123 = (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 32;
                    byte[] bArr22 = $$a;
                    Object[] objArr87 = new Object[1];
                    c((byte) (bArr22[156] - 1), (short) 52, bArr22[7], objArr87);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault40 = initSession.b(c7, iNormalizeMetaState, i123, -654680577, false, (String) objArr87[0], null);
                }
                Object[] objArr88 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault40).get(null);
                objArr7 = new Object[]{new int[]{i}, strArr, new int[1], new int[]{i}};
                int i124 = ((int[]) objArr88[0])[0];
                int i125 = ((int[]) objArr88[3])[0];
                String[] strArr8 = (String[]) objArr88[1];
                int iMyPid3 = Process.myPid();
                int i126 = (-1753310829) + (((~((-864433572) | iMyPid3)) | 813958272) * 1504) + ((~(iMyPid3 | (-50475300))) * (-1504)) + 1236386207;
                int i127 = (i126 << 13) ^ i126;
                int i128 = i127 ^ (i127 >>> 17);
                ((int[]) objArr7[2])[0] = i128 ^ (i128 << 5);
            } else {
                Context applicationContext4 = applicationContext != null ? ((applicationContext instanceof ContextWrapper) && ((ContextWrapper) applicationContext).getBaseContext() == null) ? null : context.getApplicationContext() : applicationContext;
                Object[] objArr89 = {applicationContext4, Integer.valueOf(((Integer) Class.forName(str4).getMethod(str5, Object.class).invoke(null, this)).intValue()), r6, -1198076209};
                byte[] bArr23 = $$d;
                Object[] objArr90 = new Object[1];
                d((short) 442, bArr23[165], bArr23[74], objArr90);
                Class<?> cls6 = Class.forName((String) objArr90[0]);
                Object[] objArr91 = new Object[1];
                d((short) 494, bArr23[30], bArr23[111], objArr91);
                objArr7 = (Object[]) cls6.getMethod((String) objArr91[0], Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr89);
                if (applicationContext4 != null) {
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault41 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1013250600);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault41 == null) {
                        char cKeyCodeFromString2 = (char) KeyEvent.keyCodeFromString("");
                        int threadPriority4 = ((Process.getThreadPriority(0) + 20) >> 6) + 2267;
                        int i129 = 34 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1));
                        byte[] bArr24 = $$a;
                        Object[] objArr92 = new Object[1];
                        c((byte) (bArr24[156] - 1), (short) 52, bArr24[7], objArr92);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault41 = initSession.b(cKeyCodeFromString2, threadPriority4, i129, -654680577, false, (String) objArr92[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault41).set(null, objArr7);
                    try {
                        long jLongValue11 = ((Long) Class.forName(str2).getDeclaredMethod(str, new Class[0]).invoke(null, new Object[0])).longValue();
                        Long lValueOf13 = Long.valueOf(jLongValue11);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault42 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(796641770);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault42 == null) {
                            char cGreen2 = (char) Color.green(0);
                            int capsMode2 = 2267 - TextUtils.getCapsMode("", 0, 0);
                            int iIndexOf12 = 32 - TextUtils.indexOf((CharSequence) "", '0', 0);
                            short s13 = $$a[7];
                            Object[] objArr93 = new Object[1];
                            c((byte) 52, s13, (byte) s13, objArr93);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault42 = initSession.b(cGreen2, capsMode2, iIndexOf12, -874156483, false, (String) objArr93[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault42).set(null, lValueOf13);
                        Long lValueOf14 = Long.valueOf(jLongValue11 >> 12);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault43 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(797565291);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault43 == null) {
                            char c8 = (char) (1 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)));
                            int i130 = 2267 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
                            int longPressTimeout2 = (ViewConfiguration.getLongPressTimeout() >> 16) + 33;
                            Object[] objArr94 = new Object[1];
                            c((byte) 52, (short) 89, $$a[7], objArr94);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault43 = initSession.b(c8, i130, longPressTimeout2, -887667012, false, (String) objArr94[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault43).set(null, lValueOf14);
                    } catch (Exception unused7) {
                        throw new RuntimeException();
                    }
                }
            }
            int i131 = ((int[]) objArr7[3])[0];
            int i132 = ((int[]) objArr7[0])[0];
            if (i132 == i131) {
                Object[] objArr95 = {new int[]{i}, strArr, new int[1], new int[]{i}};
                int i133 = ((int[]) objArr7[2])[0];
                int i134 = ((int[]) objArr7[0])[0];
                int i135 = ((int[]) objArr7[3])[0];
                String[] strArr9 = (String[]) objArr7[1];
                int iElapsedRealtime2 = (int) SystemClock.elapsedRealtime();
                int i136 = ~iElapsedRealtime2;
                int i137 = i133 + ((((~(1055882740 | i136)) | (~((-4997185) | iElapsedRealtime2))) * 988) - 1085531649) + (((~(iElapsedRealtime2 | 242172240)) | 813710500 | (~(i136 | (-4997185)))) * 988);
                int i138 = (i137 << 13) ^ i137;
                int i139 = i138 ^ (i138 >>> 17);
                ((int[]) objArr95[2])[0] = i139 ^ (i139 << 5);
            } else {
                ArrayList arrayList5 = new ArrayList();
                String[] strArr10 = (String[]) objArr7[1];
                if (strArr10 != null) {
                    for (String str10 : strArr10) {
                        arrayList5.add(str10);
                    }
                }
                int[] iArr9 = new int[i132];
                int i140 = i132 - 1;
                iArr9[i140] = 1;
                Toast.makeText((Context) null, iArr9[((i132 * i140) % 2) - 1], 1).show();
                Object[] objArr96 = {new int[]{i}, strArr, new int[1], new int[]{i}};
                int i141 = ((int[]) objArr7[2])[0];
                int i142 = ((int[]) objArr7[0])[0];
                int i143 = ((int[]) objArr7[3])[0];
                String[] strArr11 = (String[]) objArr7[1];
                int iIdentityHashCode5 = System.identityHashCode(this);
                int i144 = 1868902621 + ((iIdentityHashCode5 | 1016253972) * (-50));
                int i145 = ~((-813698565) | iIdentityHashCode5);
                int i146 = ~iIdentityHashCode5;
                int i147 = i141 + i144 + ((i145 | (~(1021239220 | i146))) * 50) + (((~(i146 | 1016253972)) | (~(207540656 | i146)) | (-1021239221)) * 50);
                int i148 = (i147 << 13) ^ i147;
                int i149 = i148 ^ (i148 >>> 17);
                ((int[]) objArr96[2])[0] = i149 ^ (i149 << 5);
            }
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault44 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault44 == null) {
                char longPressTimeout3 = (char) (ViewConfiguration.getLongPressTimeout() >> 16);
                int modifierMetaStateMask = ((byte) KeyEvent.getModifierMetaStateMask()) + 1032;
                int i150 = (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 15;
                short s14 = $$a[7];
                Object[] objArr97 = new Object[1];
                c((byte) 52, s14, (byte) s14, objArr97);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault44 = initSession.b(longPressTimeout3, modifierMetaStateMask, i150, 1357589585, false, (String) objArr97[0], null);
            }
            long j5 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault44).getLong(null);
            long jLongValue12 = ((Long) Class.forName(str2).getDeclaredMethod(str, new Class[0]).invoke(null, new Object[0])).longValue();
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault45 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault45 == null) {
                char scrollBarSize2 = (char) (ViewConfiguration.getScrollBarSize() >> 8);
                int i151 = 1032 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1));
                int i152 = 16 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1));
                Object[] objArr98 = new Object[1];
                c((byte) 52, (short) 89, $$a[7], objArr98);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault45 = initSession.b(scrollBarSize2, i151, i152, 1344079056, false, (String) objArr98[0], null);
            }
            if (j5 == ((jLongValue12 - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault45).getLong(null) << 52) >>> 52)) >> 12)) {
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault46 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault46 == null) {
                    char cIndexOf3 = (char) TextUtils.indexOf("", "", 0, 0);
                    int iIndexOf13 = TextUtils.indexOf("", "", 0, 0) + 1031;
                    int iArgb = Color.argb(0, 0, 0, 0) + 15;
                    byte b15 = $$a[7];
                    short s15 = (short) (b15 | 158);
                    Object[] objArr99 = new Object[1];
                    c(b15, s15, (byte) (s15 & 47), objArr99);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault46 = initSession.b(cIndexOf3, iIndexOf13, iArgb, 632103528, false, (String) objArr99[0], null);
                }
                Object[] objArr100 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault46).get(null);
                objArr8 = new Object[]{strArr, new int[]{i}, new int[1], new int[]{i}};
                int i153 = ((int[]) objArr100[3])[0];
                int i154 = ((int[]) objArr100[1])[0];
                String[] strArr12 = (String[]) objArr100[0];
                int iIdentityHashCode6 = System.identityHashCode(this);
                int i155 = ~iIdentityHashCode6;
                int i156 = (-944087717) + (((~((-77875798) | i155)) | (~((-166404373) | iIdentityHashCode6))) * 217) + (((~(iIdentityHashCode6 | (-77875798))) | 10485780) * 217) + (((~((-166404373) | i155)) | 77875797) * 217) + 401730604;
                int i157 = (i156 << 13) ^ i156;
                int i158 = i157 ^ (i157 >>> 17);
                ((int[]) objArr8[2])[0] = i158 ^ (i158 << 5);
            } else {
                int iIntValue = ((Integer) Class.forName(str4).getMethod(str5, Object.class).invoke(null, this)).intValue();
                Object[] objArr101 = {-1850554587};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault47 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-725886332);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault47 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault47 = initSession.b((char) (46039 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1))), (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 1134, View.resolveSize(0, 0) + 18, 807763283, false, null, new Class[]{Integer.TYPE});
                }
                Object[] objArr102 = {Integer.valueOf(iIntValue), 0, 401730604, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault47).newInstance(objArr101), bool};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault48 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1443305588);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault48 == null) {
                    char cBlue = (char) Color.blue(0);
                    int i159 = (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 1030;
                    int keyRepeatDelay = 15 - (ViewConfiguration.getKeyRepeatDelay() >> 16);
                    short s16 = $$a[7];
                    Object[] objArr103 = new Object[1];
                    c((byte) 52, s16, (byte) s16, objArr103);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault48 = initSession.b(cBlue, i159, keyRepeatDelay, 1298546779, false, (String) objArr103[0], new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (45993 - (ViewConfiguration.getScrollBarFadeDuration() >> 16)), Color.blue(0) + 1117, 17 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1))), Boolean.TYPE});
                }
                objArr8 = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault48).invoke(null, objArr102);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault49 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault49 == null) {
                    char c9 = (char) ((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) - 1);
                    int longPressTimeout4 = (ViewConfiguration.getLongPressTimeout() >> 16) + 1031;
                    int deadChar2 = 15 - KeyEvent.getDeadChar(0, 0);
                    byte b16 = $$a[7];
                    short s17 = (short) (b16 | 158);
                    Object[] objArr104 = new Object[1];
                    c(b16, s17, (byte) (s17 & 47), objArr104);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault49 = initSession.b(c9, longPressTimeout4, deadChar2, 632103528, false, (String) objArr104[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault49).set(null, objArr8);
                try {
                    long jLongValue13 = ((Long) Class.forName(str2).getDeclaredMethod(str, new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf15 = Long.valueOf(jLongValue13);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault50 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault50 == null) {
                        char c10 = (char) (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
                        int packedPositionType4 = 1031 - ExpandableListView.getPackedPositionType(0L);
                        int i160 = (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 15;
                        Object[] objArr105 = new Object[1];
                        c((byte) 52, (short) 89, $$a[7], objArr105);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault50 = initSession.b(c10, packedPositionType4, i160, 1344079056, false, (String) objArr105[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault50).set(null, lValueOf15);
                    Long lValueOf16 = Long.valueOf(jLongValue13 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault51 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault51 == null) {
                        char absoluteGravity2 = (char) Gravity.getAbsoluteGravity(0, 0);
                        int iMyPid4 = 1031 - (Process.myPid() >> 22);
                        int iIndexOf14 = TextUtils.indexOf("", "") + 15;
                        short s18 = $$a[7];
                        Object[] objArr106 = new Object[1];
                        c((byte) 52, s18, (byte) s18, objArr106);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault51 = initSession.b(absoluteGravity2, iMyPid4, iIndexOf14, 1357589585, false, (String) objArr106[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault51).set(null, lValueOf16);
                } catch (Exception unused8) {
                    throw new RuntimeException();
                }
            }
            int i161 = ((int[]) objArr8[1])[0];
            int i162 = ((int[]) objArr8[3])[0];
            if (i162 == i161) {
                Object[] objArr107 = {strArr, new int[]{i}, new int[1], new int[]{i}};
                int i163 = ((int[]) objArr8[2])[0];
                int i164 = ((int[]) objArr8[3])[0];
                int i165 = ((int[]) objArr8[1])[0];
                String[] strArr13 = (String[]) objArr8[0];
                int iUptimeMillis = (int) SystemClock.uptimeMillis();
                int i166 = i163 + (((~((-84478049) | iUptimeMillis)) * 521) - 686748672) + (((~((~iUptimeMillis) | (-84478049))) | (-395951615)) * 521);
                int i167 = (i166 << 13) ^ i166;
                int i168 = i167 ^ (i167 >>> 17);
                i8 = 0;
                ((int[]) objArr107[2])[0] = i168 ^ (i168 << 5);
            } else {
                ArrayList arrayList6 = new ArrayList();
                String[] strArr14 = (String[]) objArr8[0];
                if (strArr14 != null) {
                    for (String str11 : strArr14) {
                        arrayList6.add(str11);
                    }
                }
                Toast.makeText((Context) null, i162 / (((i162 - 1) * i162) % 2), 0).show();
                Object[] objArr108 = {strArr, new int[]{i}, new int[1], new int[]{i}};
                int i169 = ((int[]) objArr8[2])[0];
                int i170 = ((int[]) objArr8[3])[0];
                int i171 = ((int[]) objArr8[1])[0];
                String[] strArr15 = (String[]) objArr8[0];
                int iIdentityHashCode7 = System.identityHashCode(this);
                int i172 = ~iIdentityHashCode7;
                int i173 = i169 + (-843210411) + (((~((-212558281) | i172)) | (-31721890) | (~(212558280 | iIdentityHashCode7))) * (-564)) + ((~(iIdentityHashCode7 | (-21235746))) * 1128) + (((~((-31721890) | i172)) | (-233794026)) * 564);
                int i174 = (i173 << 13) ^ i173;
                int i175 = i174 ^ (i174 >>> 17);
                i8 = 0;
                ((int[]) objArr108[2])[0] = i175 ^ (i175 << 5);
            }
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault52 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(118372281);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault52 == null) {
                char cGreen3 = (char) (Color.green(i8) + 37567);
                int gidForName2 = 624 - Process.getGidForName("");
                int i176 = 13 - (ExpandableListView.getPackedPositionForChild(i8, i8) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(i8, i8) == 0L ? 0 : -1));
                byte b17 = $$a[7];
                short s19 = (short) (b17 | 158);
                Object[] objArr109 = new Object[1];
                c(b17, s19, (byte) (s19 & 47), objArr109);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault52 = initSession.b(cGreen3, gidForName2, i176, -477065106, false, (String) objArr109[0], null);
            }
            long j6 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault52).getLong(null);
            long jLongValue14 = ((Long) Class.forName(str2).getDeclaredMethod(str, new Class[0]).invoke(null, new Object[0])).longValue();
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault53 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(559617152);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault53 == null) {
                char cLastIndexOf = (char) (37566 - TextUtils.lastIndexOf("", '0', 0));
                int iLastIndexOf5 = 624 - TextUtils.lastIndexOf("", '0');
                int i177 = 15 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1));
                short s20 = $$a[7];
                Object[] objArr110 = new Object[1];
                c((byte) 52, s20, (byte) s20, objArr110);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault53 = initSession.b(cLastIndexOf, iLastIndexOf5, i177, -976899241, false, (String) objArr110[0], null);
            }
            if (j6 == ((jLongValue14 - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault53).getLong(null) << 52) >>> 52)) >> 12)) {
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault54 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(560540673);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault54 == null) {
                    char absoluteGravity3 = (char) (Gravity.getAbsoluteGravity(0, 0) + 37567);
                    int mirror3 = 673 - AndroidCharacter.getMirror('0');
                    int bitsPerPixel2 = ImageFormat.getBitsPerPixel(0) + 15;
                    Object[] objArr111 = new Object[1];
                    c((byte) 52, (short) 89, $$a[7], objArr111);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault54 = initSession.b(absoluteGravity3, mirror3, bitsPerPixel2, -973632554, false, (String) objArr111[0], null);
                }
                Object[] objArr112 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault54).get(null);
                int i178 = ((int[]) objArr112[2])[0];
                int i179 = ((int[]) objArr112[0])[0];
                String[] strArr16 = (String[]) objArr112[3];
                int[] iArr10 = {i178};
                int iIdentityHashCode8 = System.identityHashCode(this);
                int i180 = (((-1850045364) + (((~((-218368579) | (~iIdentityHashCode8))) | (-1605369543)) * (-591))) + ((iIdentityHashCode8 | (-218368579)) * 591)) - 1010436025;
                int i181 = (i180 << 13) ^ i180;
                int i182 = i181 ^ (i181 >>> 17);
                ((int[]) objArr9[1])[0] = i182 ^ (i182 << 5);
                objArr9 = new Object[]{new int[]{i179}, new int[1], iArr10, strArr16};
            } else {
                Context applicationContext5 = applicationContext != null ? ((applicationContext instanceof ContextWrapper) && ((ContextWrapper) applicationContext).getBaseContext() == null) ? null : context.getApplicationContext() : applicationContext;
                int iIntValue2 = ((Integer) Class.forName(str4).getMethod(str5, Object.class).invoke(null, this)).intValue();
                Object[] objArr113 = new Object[1];
                a(new char[]{48185, 24775, 1343, 10641, 52942, 62244, 38811, 46242, 22906, 32156, 8951, 51069, 60290, 35067, 44372, 20953, 30380, 6915, 16351, 56549, 33034, 42465, 19130, 28486, 5046, 12477, 54595, 63977, 40516, 17226, 26609, 1093, 10514, 52643, 62027, 38697, 48126, 22615, 32037, 8661, 50693, 60207, 36741, 44112, 20833, 30171, 6758, 16185, 58330, 32866, 42289, 18881, 28267, 4814, 14239, 54310, 63690, 40338, 17013, 26266, 3061, 10280, 52439, 61950}, 56489 - ExpandableListView.getPackedPositionGroup(0L), objArr113);
                String str12 = (String) objArr113[0];
                Object[] objArr114 = new Object[1];
                a(new char[]{48232, 34421, 51281, 4704, 21575, 40613, 57555, 10981, 27798, 46970, 63757, 49980, 1306, 20394, 37343, 56302, 7625, 24631, 43539, 60533, 13906, 30903, 17095, 34036, 52865, 4408, 23375, 40311, 59228, 10673, 29584, 46578, 65490, 49558, 1056, 19975, 36963, 55829, 7408, 26240, 43233, 62105, 13691, 32520, 16744, 35660, 52650, 6025, 23010, 41863, 58940, 10271, 29221, 46164, 65202, 49296, 2720, 19594, 38719, 55578, 9006, 25944, 44991, 61900}, (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 14878, objArr114);
                Object[] objArr115 = {applicationContext5, new String[]{str12, (String) objArr114[0]}, Integer.valueOf(iIntValue2), 17, -1010436025};
                byte[] bArr25 = $$d;
                Object[] objArr116 = new Object[1];
                d((short) 494, bArr25[446], bArr25[12], objArr116);
                Class<?> cls7 = Class.forName((String) objArr116[0]);
                Object[] objArr117 = new Object[1];
                d(bArr25[53], (byte) (-bArr25[41]), (byte) (-bArr25[177]), objArr117);
                objArr9 = (Object[]) cls7.getMethod((String) objArr117[0], Context.class, String[].class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr115);
                int i183 = ((int[]) objArr9[0])[0];
                int i184 = ((int[]) objArr9[2])[0];
                if (applicationContext5 != null) {
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault55 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(560540673);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault55 == null) {
                        char cCombineMeasuredStates2 = (char) (37567 - View.combineMeasuredStates(0, 0));
                        int maximumFlingVelocity2 = (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 625;
                        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0) + 14;
                        Object[] objArr118 = new Object[1];
                        c((byte) 52, (short) 89, $$a[7], objArr118);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault55 = initSession.b(cCombineMeasuredStates2, maximumFlingVelocity2, iMakeMeasureSpec, -973632554, false, (String) objArr118[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault55).set(null, objArr9);
                    try {
                        long jLongValue15 = ((Long) Class.forName(str2).getDeclaredMethod(str, new Class[0]).invoke(null, new Object[0])).longValue();
                        Long lValueOf17 = Long.valueOf(jLongValue15);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault56 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(559617152);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault56 == null) {
                            char keyRepeatDelay2 = (char) (37567 - (ViewConfiguration.getKeyRepeatDelay() >> 16));
                            int capsMode3 = TextUtils.getCapsMode("", 0, 0) + 625;
                            int iIndexOf15 = 14 - TextUtils.indexOf("", "", 0);
                            short s21 = $$a[7];
                            Object[] objArr119 = new Object[1];
                            c((byte) 52, s21, (byte) s21, objArr119);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault56 = initSession.b(keyRepeatDelay2, capsMode3, iIndexOf15, -976899241, false, (String) objArr119[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault56).set(null, lValueOf17);
                        Long lValueOf18 = Long.valueOf(jLongValue15 >> 12);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault57 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(118372281);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault57 == null) {
                            char cResolveSize2 = (char) (37567 - View.resolveSize(0, 0));
                            int iArgb2 = Color.argb(0, 0, 0, 0) + 625;
                            int threadPriority5 = 14 - ((Process.getThreadPriority(0) + 20) >> 6);
                            byte b18 = $$a[7];
                            short s22 = (short) (b18 | 158);
                            Object[] objArr120 = new Object[1];
                            c(b18, s22, (byte) (s22 & 47), objArr120);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault57 = initSession.b(cResolveSize2, iArgb2, threadPriority5, -477065106, false, (String) objArr120[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault57).set(null, lValueOf18);
                    } catch (Exception unused9) {
                        throw new RuntimeException();
                    }
                }
            }
            int i185 = ((int[]) objArr9[0])[0];
            int i186 = ((int[]) objArr9[2])[0];
            if (i186 != i185) {
                ArrayList arrayList7 = new ArrayList();
                String[] strArr17 = (String[]) objArr9[3];
                if (strArr17 != null) {
                    for (String str13 : strArr17) {
                        arrayList7.add(str13);
                    }
                }
                throw new RuntimeException(String.valueOf(i186));
            }
            int i187 = ((int[]) objArr9[1])[0];
            int i188 = ((int[]) objArr9[2])[0];
            int i189 = ((int[]) objArr9[0])[0];
            String[] strArr18 = (String[]) objArr9[3];
            int[] iArr11 = {i188};
            int iIdentityHashCode9 = System.identityHashCode(this);
            int i190 = ~iIdentityHashCode9;
            int i191 = i187 + 1930906888 + (((~(iIdentityHashCode9 | 1005822980)) | (~((-817898501) | i190)) | (-1005839621)) * (-68)) + ((~(i190 | (-16641))) * (-68)) + (((~((-1005822981) | i190)) | (-817915141)) * 68);
            int i192 = (i191 << 13) ^ i191;
            int i193 = i192 ^ (i192 >>> 17);
            ((int[]) objArr[1])[0] = i193 ^ (i193 << 5);
            Object[] objArr121 = {new int[]{i189}, new int[1], iArr11, strArr18};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault58 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1309309962);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault58 == null) {
                char keyRepeatTimeout4 = (char) ((ViewConfiguration.getKeyRepeatTimeout() >> 16) + 53893);
                int iIndexOf16 = 1319 - TextUtils.indexOf((CharSequence) "", '0');
                int i194 = (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 35;
                byte b19 = $$a[7];
                short s23 = (short) (b19 | 158);
                Object[] objArr122 = new Object[1];
                c(b19, s23, (byte) (s23 & 47), objArr122);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault58 = initSession.b(keyRepeatTimeout4, iIndexOf16, i194, -1433084963, false, (String) objArr122[0], null);
            }
            if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault58).getLong(null) != -1) {
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault59 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1763547602);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault59 == null) {
                    char packedPositionChild = (char) (ExpandableListView.getPackedPositionChild(0L) + 53894);
                    int size2 = 1320 - View.MeasureSpec.getSize(0);
                    int gidForName3 = Process.getGidForName("") + 37;
                    Object[] objArr123 = new Object[1];
                    c((byte) 52, (short) 89, $$a[7], objArr123);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault59 = initSession.b(packedPositionChild, size2, gidForName3, -1920778747, false, (String) objArr123[0], null);
                }
                Object[] objArr124 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault59).get(null);
                objArr10 = new Object[]{new int[]{i}, new int[1], strArr, new int[]{i}};
                int i195 = ((int[]) objArr124[0])[0];
                int i196 = ((int[]) objArr124[3])[0];
                String[] strArr19 = (String[]) objArr124[2];
                int iIdentityHashCode10 = System.identityHashCode(this);
                int i197 = ~iIdentityHashCode10;
                int i198 = (~((-1120994474) | i197)) | 46202881;
                int i199 = ~(iIdentityHashCode10 | 1324424943);
                int i200 = ((((i198 | i199) * (-252)) + 128851948) + ((i199 | (~(i197 | (-1074791593)))) * 252)) - 1055138960;
                int i201 = (i200 << 13) ^ i200;
                int i202 = i201 ^ (i201 >>> 17);
                ((int[]) objArr10[1])[0] = i202 ^ (i202 << 5);
            } else {
                if (applicationContext != null) {
                    applicationContext = ((applicationContext instanceof ContextWrapper) && ((ContextWrapper) applicationContext).getBaseContext() == null) ? null : context.getApplicationContext();
                }
                int iIntValue3 = ((Integer) Class.forName(str4).getMethod(str5, Object.class).invoke(null, this)).intValue();
                Object[] objArr125 = {-1850554587};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault60 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(41341784);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault60 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault60 = initSession.b((char) (47977 - View.resolveSizeAndState(0, 0, 0)), (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 1300, (KeyEvent.getMaxKeyCode() >> 16) + 20, -420973425, false, null, new Class[]{Integer.TYPE});
                }
                Object[] objArr126 = {applicationContext, "com.bpjstku", -1055138960, Integer.valueOf(iIntValue3), 643, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault60).newInstance(objArr125), bool};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault61 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-733829592);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault61 == null) {
                    char mode2 = (char) (53893 - View.MeasureSpec.getMode(0));
                    int tapTimeout2 = (ViewConfiguration.getTapTimeout() >> 16) + 1320;
                    int iResolveSizeAndState2 = View.resolveSizeAndState(0, 0, 0) + 36;
                    Object[] objArr127 = new Object[1];
                    c((byte) 52, (short) 89, $$a[7], objArr127);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault61 = initSession.b(mode2, tapTimeout2, iResolveSizeAndState2, 819724799, false, (String) objArr127[0], new Class[]{Context.class, String.class, Integer.TYPE, Integer.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (((Process.getThreadPriority(0) + 20) >> 6) + 57878), (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 1394, (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 75), Boolean.TYPE});
                }
                objArr10 = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault61).invoke(null, objArr126);
                if (applicationContext != null) {
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault62 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1763547602);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault62 == null) {
                        char c11 = (char) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 53892);
                        int iMyTid3 = 1320 - (Process.myTid() >> 22);
                        int i203 = 35 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1));
                        Object[] objArr128 = new Object[1];
                        c((byte) 52, (short) 89, $$a[7], objArr128);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault62 = initSession.b(c11, iMyTid3, i203, -1920778747, false, (String) objArr128[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault62).set(null, objArr10);
                    try {
                        long jLongValue16 = ((Long) Class.forName(str2).getDeclaredMethod(str, new Class[0]).invoke(null, new Object[0])).longValue();
                        Long lValueOf19 = Long.valueOf(jLongValue16);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault63 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1351245985);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault63 == null) {
                            char maxKeyCode4 = (char) (53893 - (KeyEvent.getMaxKeyCode() >> 16));
                            int iIndexOf17 = 1320 - TextUtils.indexOf("", "", 0);
                            int i204 = (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 36;
                            byte[] bArr26 = $$a;
                            Object[] objArr129 = new Object[1];
                            c((byte) (bArr26[156] - 1), (short) 52, bArr26[7], objArr129);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault63 = initSession.b(maxKeyCode4, iIndexOf17, i204, -1273706634, false, (String) objArr129[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault63).set(null, lValueOf19);
                        Long lValueOf20 = Long.valueOf(jLongValue16 >> 12);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault64 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1309309962);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault64 == null) {
                            char cResolveSizeAndState2 = (char) (View.resolveSizeAndState(0, 0, 0) + 53893);
                            int iCombineMeasuredStates2 = 1320 - View.combineMeasuredStates(0, 0);
                            int iKeyCodeFromString3 = 36 - KeyEvent.keyCodeFromString("");
                            byte b20 = $$a[7];
                            short s24 = (short) (b20 | 158);
                            Object[] objArr130 = new Object[1];
                            c(b20, s24, (byte) (s24 & 47), objArr130);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault64 = initSession.b(cResolveSizeAndState2, iCombineMeasuredStates2, iKeyCodeFromString3, -1433084963, false, (String) objArr130[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault64).set(null, lValueOf20);
                    } catch (Exception unused10) {
                        throw new RuntimeException();
                    }
                }
            }
            if (((int[]) objArr10[0])[0] != ((int[]) objArr10[3])[0]) {
                throw null;
            }
            Object[] objArr131 = {new int[]{i}, new int[1], strArr, new int[]{i}};
            int i205 = ((int[]) objArr10[1])[0];
            int i206 = ((int[]) objArr10[0])[0];
            int i207 = ((int[]) objArr10[3])[0];
            String[] strArr20 = (String[]) objArr10[2];
            int iMyPid5 = Process.myPid();
            int i208 = ~((-663733496) | iMyPid5);
            int i209 = (-376921640) + ((93160454 | i208) * (-280)) + ((i208 | (~((-706894330) | iMyPid5))) * 140);
            int i210 = ~((-570573042) | iMyPid5);
            int i211 = ~iMyPid5;
            int i212 = i205 + i209 + (((~(i211 | (-136321289))) | i210 | (~((-93160455) | i211))) * 140);
            int i213 = (i212 << 13) ^ i212;
            int i214 = i213 ^ (i213 >>> 17);
            ((int[]) objArr131[1])[0] = i214 ^ (i214 << 5);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault65 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault65 == null) {
                char cMakeMeasureSpec = (char) (View.MeasureSpec.makeMeasureSpec(0, 0) + 29944);
                int iIndexOf18 = 1754 - TextUtils.indexOf((CharSequence) "", '0');
                int fadingEdgeLength3 = 23 - (ViewConfiguration.getFadingEdgeLength() >> 16);
                byte[] bArr27 = $$a;
                Object[] objArr132 = new Object[1];
                c((byte) (bArr27[156] - 1), (short) 52, bArr27[7], objArr132);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault65 = initSession.b(cMakeMeasureSpec, iIndexOf18, fadingEdgeLength3, 986134021, false, (String) objArr132[0], null);
            }
            if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault65).getLong(null) != -1) {
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault66 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault66 == null) {
                    char cIndexOf4 = (char) (29943 - TextUtils.indexOf((CharSequence) "", '0', 0));
                    int iNormalizeMetaState2 = KeyEvent.normalizeMetaState(0) + 1755;
                    int iResolveSize2 = View.resolveSize(0, 0) + 23;
                    Object[] objArr133 = new Object[1];
                    c((byte) 52, (short) 89, $$a[7], objArr133);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault66 = initSession.b(cIndexOf4, iNormalizeMetaState2, iResolveSize2, 1599039318, false, (String) objArr133[0], null);
                }
                Object[] objArr134 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault66).get(null);
                objArrTuitionPaymentFragmentbindingInflater1$7879113 = new Object[]{new int[]{((int[]) objArr134[0])[0]}, new int[]{((int[]) objArr134[1])[0]}, (Object[]) objArr134[2], new int[1], (String[]) objArr134[4]};
                int i215 = ~((int) Runtime.getRuntime().maxMemory());
                int i216 = 1161565505 + ((1039588927 | i215) * 184) + (((~(i215 | 961731135)) | 368318010) * 184) + 2029937729;
                int i217 = (i216 << 13) ^ i216;
                int i218 = i217 ^ (i217 >>> 17);
                ((int[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[3])[0] = i218 ^ (i218 << 5);
            } else {
                int iIntValue4 = ((Integer) Class.forName(str4).getMethod(str5, Object.class).invoke(null, this)).intValue();
                Object[] objArr135 = {-1850554587};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault67 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2063193834);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault67 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault67 = initSession.b((char) ((ViewConfiguration.getTapTimeout() >> 16) + 42049), 1725 - ((byte) KeyEvent.getModifierMetaStateMask()), (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 29, -1637387971, false, null, new Class[]{Integer.TYPE});
                }
                objArrTuitionPaymentFragmentbindingInflater1$7879113 = AFg1xSDK.TuitionPaymentFragmentbindingInflater1$7879113(iIntValue4, 0, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault67).newInstance(objArr135), 2029937729, false, true);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault68 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault68 == null) {
                    char cResolveSize3 = (char) (29944 - View.resolveSize(0, 0));
                    int iIndexOf19 = TextUtils.indexOf("", "", 0, 0) + 1755;
                    int i219 = 24 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1));
                    Object[] objArr136 = new Object[1];
                    c((byte) 52, (short) 89, $$a[7], objArr136);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault68 = initSession.b(cResolveSize3, iIndexOf19, i219, 1599039318, false, (String) objArr136[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault68).set(null, objArrTuitionPaymentFragmentbindingInflater1$7879113);
                try {
                    long jLongValue17 = ((Long) Class.forName(str2).getDeclaredMethod(str, new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf21 = Long.valueOf(jLongValue17);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault69 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1145728641);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault69 == null) {
                        char cIndexOf5 = (char) (TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 29945);
                        int iRed = 1755 - Color.red(0);
                        int iLastIndexOf6 = TextUtils.lastIndexOf("", '0', 0, 0) + 24;
                        Object[] objArr137 = new Object[1];
                        c((byte) 52, (short) 158, $$a[7], objArr137);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault69 = initSession.b(cIndexOf5, iRed, iLastIndexOf6, 1596667560, false, (String) objArr137[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault69).set(null, lValueOf21);
                    Long lValueOf22 = Long.valueOf(jLongValue17 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault70 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault70 == null) {
                        char maximumDrawingCacheSize2 = (char) ((ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 29944);
                        int iRed2 = 1755 - Color.red(0);
                        int offsetBefore4 = TextUtils.getOffsetBefore("", 0) + 23;
                        byte[] bArr28 = $$a;
                        Object[] objArr138 = new Object[1];
                        c((byte) (bArr28[156] - 1), (short) 52, bArr28[7], objArr138);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault70 = initSession.b(maximumDrawingCacheSize2, iRed2, offsetBefore4, 986134021, false, (String) objArr138[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault70).set(null, lValueOf22);
                } catch (Exception unused11) {
                    throw new RuntimeException();
                }
            }
            if (((int[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[0])[0] != ((int[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[1])[0]) {
                ArrayList arrayList8 = new ArrayList();
                String[] strArr21 = (String[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[4];
                if (strArr21 != null) {
                    for (String str14 : strArr21) {
                        arrayList8.add(str14);
                    }
                }
                throw null;
            }
            int i220 = ((int[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[3])[0];
            Object[] objArr139 = {new int[]{((int[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[0])[0]}, new int[]{((int[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[1])[0]}, (Object[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[2], new int[1], (String[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[4]};
            int i221 = ~System.identityHashCode(this);
            int i222 = i220 + ((((-251538111) + (((~(i221 | 938400222)) | (~((-54708245) | i221))) * (-184))) + (((548147202 | (~((-602855447) | i221))) | (~(390253020 | i221))) * 184)) - 1610696824);
            int i223 = (i222 << 13) ^ i222;
            int i224 = i223 ^ (i223 >>> 17);
            ((int[]) objArr139[3])[0] = i224 ^ (i224 << 5);
            synchronized (FirebaseApp.access$200()) {
                Iterator<FirebaseApp> it = FirebaseApp.INSTANCES.values().iterator();
                while (it.hasNext()) {
                    FirebaseApp.access$300(it.next());
                }
            }
            unregister();
        }

        public void unregister() {
            int i = 2 % 2;
            int i2 = b + 113;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
            int i3 = i2 % 2;
            this.applicationContext.unregisterReceiver(this);
            if (i3 == 0) {
                int i4 = 86 / 0;
            }
        }

        static void TuitionPaymentFragmentbindingInflater1() {
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = -185135891422112496L;
        }
    }

    static /* synthetic */ Object access$200() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 113;
        int i3 = i2 % 128;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i3;
        int i4 = i2 % 2;
        Object obj = LOCK;
        int i5 = i3 + 47;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i5 % 128;
        if (i5 % 2 != 0) {
            return obj;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    static /* synthetic */ void access$300(FirebaseApp firebaseApp) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 89;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        firebaseApp.initializeAllApis();
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 51;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    static /* synthetic */ AtomicBoolean access$400(FirebaseApp firebaseApp) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 9;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
        AtomicBoolean atomicBoolean = firebaseApp.automaticResourceManagementEnabled;
        if (i3 == 0) {
            int i4 = 11 / 0;
        }
        return atomicBoolean;
    }

    static /* synthetic */ void access$500(FirebaseApp firebaseApp, boolean z) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 43;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
        firebaseApp.notifyBackgroundStateChangeListeners(z);
        if (i3 == 0) {
            throw null;
        }
    }

    static {
        TuitionPaymentFragmentbindingInflater1 = 0;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        LOCK = new Object();
        INSTANCES = new ArrayMap();
        int i = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 119;
        TuitionPaymentFragmentbindingInflater1 = i % 128;
        int i2 = i % 2;
    }

    public Context getApplicationContext() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 93;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
        checkNotDeleted();
        Context context = this.applicationContext;
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 109;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
        int i5 = i4 % 2;
        return context;
    }

    public String getName() {
        String str;
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 81;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        if (i2 % 2 == 0) {
            checkNotDeleted();
            str = this.name;
            int i3 = 62 / 0;
        } else {
            checkNotDeleted();
            str = this.name;
        }
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 7;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public FirebaseOptions getOptions() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 117;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        if (i2 % 2 != 0) {
            checkNotDeleted();
            return this.options;
        }
        checkNotDeleted();
        int i3 = 12 / 0;
        return this.options;
    }

    public boolean equals(Object obj) {
        int i = 2 % 2;
        if (!(obj instanceof FirebaseApp)) {
            int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 107;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
            int i3 = i2 % 2;
            return false;
        }
        boolean zEquals = this.name.equals(((FirebaseApp) obj).getName());
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 29;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 35 / 0;
        }
        return zEquals;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 121;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        String str = this.name;
        if (i3 == 0) {
            return str.hashCode();
        }
        str.hashCode();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public String toString() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 13;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
        String string = Objects.toStringHelper(this).add("name", this.name).add("options", this.options).toString();
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 97;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
        int i5 = i4 % 2;
        return string;
    }

    public static List<FirebaseApp> getApps(Context context) {
        ArrayList arrayList;
        synchronized (LOCK) {
            arrayList = new ArrayList(INSTANCES.values());
        }
        return arrayList;
    }

    public static FirebaseApp getInstance() {
        FirebaseApp firebaseApp;
        synchronized (LOCK) {
            firebaseApp = INSTANCES.get(DEFAULT_APP_NAME);
            if (firebaseApp == null) {
                StringBuilder sb = new StringBuilder("Default FirebaseApp is not initialized in this process ");
                sb.append(ProcessUtils.getMyProcessName());
                sb.append(". Make sure to call FirebaseApp.initializeApp(Context) first.");
                throw new IllegalStateException(sb.toString());
            }
            firebaseApp.defaultHeartBeatController.get().registerHeartBeat();
        }
        return firebaseApp;
    }

    public static FirebaseApp getInstance(String str) {
        FirebaseApp firebaseApp;
        String string;
        synchronized (LOCK) {
            firebaseApp = INSTANCES.get(normalize(str));
            if (firebaseApp != null) {
                firebaseApp.defaultHeartBeatController.get().registerHeartBeat();
            } else {
                List<String> allAppNames = getAllAppNames();
                if (allAppNames.isEmpty()) {
                    string = "";
                } else {
                    StringBuilder sb = new StringBuilder("Available app names: ");
                    sb.append(TextUtils.join(", ", allAppNames));
                    string = sb.toString();
                }
                throw new IllegalStateException(String.format("FirebaseApp with name %s doesn't exist. %s", str, string));
            }
        }
        return firebaseApp;
    }

    public static FirebaseApp initializeApp(Context context) {
        synchronized (LOCK) {
            if (INSTANCES.containsKey(DEFAULT_APP_NAME)) {
                return getInstance();
            }
            FirebaseOptions firebaseOptionsFromResource = FirebaseOptions.fromResource(context);
            if (firebaseOptionsFromResource == null) {
                return null;
            }
            return initializeApp(context, firebaseOptionsFromResource);
        }
    }

    public static FirebaseApp initializeApp(Context context, FirebaseOptions firebaseOptions) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 121;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        FirebaseApp firebaseAppInitializeApp = initializeApp(context, firebaseOptions, DEFAULT_APP_NAME);
        if (i3 != 0) {
            int i4 = 97 / 0;
        }
        int i5 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i5 % 128;
        int i6 = i5 % 2;
        return firebaseAppInitializeApp;
    }

    public static FirebaseApp initializeApp(Context context, FirebaseOptions firebaseOptions, String str) {
        FirebaseApp firebaseApp;
        GlobalBackgroundStateListener.ensureBackgroundStateListenerRegistered(context);
        String strNormalize = normalize(str);
        if (context.getApplicationContext() != null) {
            context = context.getApplicationContext();
        }
        synchronized (LOCK) {
            Map<String, FirebaseApp> map = INSTANCES;
            boolean zContainsKey = map.containsKey(strNormalize);
            StringBuilder sb = new StringBuilder("FirebaseApp name ");
            sb.append(strNormalize);
            sb.append(" already exists!");
            Preconditions.checkState(!zContainsKey, sb.toString());
            Preconditions.checkNotNull(context, "Application context cannot be null.");
            firebaseApp = new FirebaseApp(context, strNormalize, firebaseOptions);
            map.put(strNormalize, firebaseApp);
        }
        firebaseApp.initializeAllApis();
        return firebaseApp;
    }

    public void delete() throws Throwable {
        if (this.deleted.compareAndSet(false, true)) {
            synchronized (LOCK) {
                INSTANCES.remove(this.name);
            }
            notifyOnAppDeleted();
        }
    }

    public <T> T get(Class<T> cls) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 3;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        if (i2 % 2 != 0) {
            checkNotDeleted();
            return (T) this.componentRuntime.get(cls);
        }
        checkNotDeleted();
        this.componentRuntime.get(cls);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void setAutomaticResourceManagementEnabled(boolean z) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 63;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        if (i2 % 2 == 0) {
            checkNotDeleted();
            if (!this.automaticResourceManagementEnabled.compareAndSet(z, z)) {
                return;
            }
        } else {
            checkNotDeleted();
            if (!this.automaticResourceManagementEnabled.compareAndSet(!z, z)) {
                return;
            }
        }
        boolean zIsInBackground = BackgroundDetector.getInstance().isInBackground();
        if (!(!z) && zIsInBackground) {
            notifyBackgroundStateChangeListeners(true);
            return;
        }
        if (z) {
            return;
        }
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 5;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i3 % 128;
        int i4 = i3 % 2;
        if (zIsInBackground) {
            notifyBackgroundStateChangeListeners(false);
        }
    }

    public boolean isDataCollectionDefaultEnabled() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 81;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        checkNotDeleted();
        boolean zIsEnabled = this.dataCollectionConfigStorage.get().isEnabled();
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 89;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
        if (i4 % 2 != 0) {
            return zIsEnabled;
        }
        throw null;
    }

    public void setDataCollectionDefaultEnabled(Boolean bool) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 31;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        if (i2 % 2 != 0) {
            checkNotDeleted();
            this.dataCollectionConfigStorage.get().setEnabled(bool);
        } else {
            checkNotDeleted();
            this.dataCollectionConfigStorage.get().setEnabled(bool);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    @Deprecated
    public void setDataCollectionDefaultEnabled(boolean z) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 67;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
        setDataCollectionDefaultEnabled(Boolean.valueOf(z));
        if (i3 == 0) {
            int i4 = 7 / 0;
        }
        int i5 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 65;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i5 % 128;
        int i6 = i5 % 2;
    }

    protected FirebaseApp(final Context context, String str, FirebaseOptions firebaseOptions) {
        this.applicationContext = (Context) Preconditions.checkNotNull(context);
        this.name = Preconditions.checkNotEmpty(str);
        this.options = (FirebaseOptions) Preconditions.checkNotNull(firebaseOptions);
        StartupTime startupTime = FirebaseInitProvider.getStartupTime();
        FirebaseTrace.pushTrace("Firebase");
        FirebaseTrace.pushTrace("ComponentDiscovery");
        List<Provider<ComponentRegistrar>> listDiscoverLazy = ComponentDiscovery.forContext(context, ComponentDiscoveryService.class).discoverLazy();
        FirebaseTrace.popTrace();
        FirebaseTrace.pushTrace("Runtime");
        ComponentRuntime.Builder processor = ComponentRuntime.builder(UiExecutor.INSTANCE).addLazyComponentRegistrars(listDiscoverLazy).addComponentRegistrar(new FirebaseCommonRegistrar()).addComponentRegistrar(new ExecutorsRegistrar()).addComponent(Component.of(context, (Class<Context>) Context.class, (Class<? super Context>[]) new Class[0])).addComponent(Component.of(this, (Class<FirebaseApp>) FirebaseApp.class, (Class<? super FirebaseApp>[]) new Class[0])).addComponent(Component.of(firebaseOptions, (Class<FirebaseOptions>) FirebaseOptions.class, (Class<? super FirebaseOptions>[]) new Class[0])).setProcessor(new ComponentMonitor());
        if (UserManagerCompat.isUserUnlocked(context) && FirebaseInitProvider.isCurrentlyInitializing()) {
            processor.addComponent(Component.of(startupTime, (Class<StartupTime>) StartupTime.class, (Class<? super StartupTime>[]) new Class[0]));
            int i = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 35;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i % 128;
            int i2 = i % 2;
            int i3 = 2 % 2;
        }
        ComponentRuntime componentRuntimeBuild = processor.build();
        this.componentRuntime = componentRuntimeBuild;
        FirebaseTrace.popTrace();
        this.dataCollectionConfigStorage = new Lazy<>(new Provider() { // from class: com.google.firebase.FirebaseApp$$ExternalSyntheticLambda0
            @Override // com.google.firebase.inject.Provider
            public final Object get() {
                return this.f$0.m7914lambda$new$0$comgooglefirebaseFirebaseApp(context);
            }
        });
        this.defaultHeartBeatController = componentRuntimeBuild.getProvider(DefaultHeartBeatController.class);
        addBackgroundStateChangeListener(new BackgroundStateChangeListener() { // from class: com.google.firebase.FirebaseApp$$ExternalSyntheticLambda1
            @Override // com.google.firebase.FirebaseApp.BackgroundStateChangeListener
            public final void onBackgroundStateChanged(boolean z) {
                this.f$0.m7915lambda$new$1$comgooglefirebaseFirebaseApp(z);
            }
        });
        FirebaseTrace.popTrace();
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 3;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX INFO: renamed from: lambda$new$0$com-google-firebase-FirebaseApp, reason: not valid java name */
    /* synthetic */ DataCollectionConfigStorage m7914lambda$new$0$comgooglefirebaseFirebaseApp(Context context) {
        int i = 2 % 2;
        DataCollectionConfigStorage dataCollectionConfigStorage = new DataCollectionConfigStorage(context, getPersistenceKey(), (Publisher) this.componentRuntime.get(Publisher.class));
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 89;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        if (i2 % 2 != 0) {
            return dataCollectionConfigStorage;
        }
        throw null;
    }

    /* JADX INFO: renamed from: lambda$new$1$com-google-firebase-FirebaseApp, reason: not valid java name */
    /* synthetic */ void m7915lambda$new$1$comgooglefirebaseFirebaseApp(boolean z) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 45;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        if (i2 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (z) {
            return;
        }
        this.defaultHeartBeatController.get().registerHeartBeat();
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 33;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3 % 128;
        int i4 = i3 % 2;
    }

    private void checkNotDeleted() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 105;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
        Preconditions.checkState(!this.deleted.get(), "FirebaseApp was deleted");
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 85;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
        int i5 = i4 % 2;
    }

    public boolean isDefaultApp() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 49;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        if (i2 % 2 == 0) {
            DEFAULT_APP_NAME.equals(getName());
            throw null;
        }
        boolean zEquals = DEFAULT_APP_NAME.equals(getName());
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 27;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i3 % 128;
        int i4 = i3 % 2;
        return zEquals;
    }

    void initializeAllComponents() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 29;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        if (i2 % 2 != 0) {
            this.componentRuntime.initializeAllComponentsForTests();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        this.componentRuntime.initializeAllComponentsForTests();
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 119;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3 % 128;
        int i4 = i3 % 2;
    }

    private void notifyBackgroundStateChangeListeners(boolean z) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 5;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        if (i2 % 2 != 0) {
            this.backgroundStateChangeListeners.iterator();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Iterator<BackgroundStateChangeListener> it = this.backgroundStateChangeListeners.iterator();
        while (it.hasNext()) {
            int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 109;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3 % 128;
            int i4 = i3 % 2;
            it.next().onBackgroundStateChanged(z);
            int i5 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 55;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 2 / 3;
            }
        }
    }

    public void addBackgroundStateChangeListener(BackgroundStateChangeListener backgroundStateChangeListener) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 113;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            checkNotDeleted();
            this.automaticResourceManagementEnabled.get();
            obj.hashCode();
            throw null;
        }
        checkNotDeleted();
        if (this.automaticResourceManagementEnabled.get() && BackgroundDetector.getInstance().isInBackground()) {
            backgroundStateChangeListener.onBackgroundStateChanged(true);
        }
        this.backgroundStateChangeListeners.add(backgroundStateChangeListener);
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 39;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i3 % 128;
        if (i3 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    public void removeBackgroundStateChangeListener(BackgroundStateChangeListener backgroundStateChangeListener) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 17;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        checkNotDeleted();
        this.backgroundStateChangeListeners.remove(backgroundStateChangeListener);
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 69;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
        int i5 = i4 % 2;
    }

    public String getPersistenceKey() {
        int i = 2 % 2;
        StringBuilder sb = new StringBuilder();
        sb.append(Base64Utils.encodeUrlSafeNoPadding(getName().getBytes(Charset.defaultCharset())));
        sb.append("+");
        sb.append(Base64Utils.encodeUrlSafeNoPadding(getOptions().getApplicationId().getBytes(Charset.defaultCharset())));
        String string = sb.toString();
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 101;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        return string;
    }

    public void addLifecycleEventListener(FirebaseAppLifecycleListener firebaseAppLifecycleListener) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 59;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        if (i2 % 2 == 0) {
            checkNotDeleted();
            Preconditions.checkNotNull(firebaseAppLifecycleListener);
            this.lifecycleListeners.add(firebaseAppLifecycleListener);
            int i3 = 77 / 0;
        } else {
            checkNotDeleted();
            Preconditions.checkNotNull(firebaseAppLifecycleListener);
            this.lifecycleListeners.add(firebaseAppLifecycleListener);
        }
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 49;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    public void removeLifecycleEventListener(FirebaseAppLifecycleListener firebaseAppLifecycleListener) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 91;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        checkNotDeleted();
        Preconditions.checkNotNull(firebaseAppLifecycleListener);
        this.lifecycleListeners.remove(firebaseAppLifecycleListener);
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 45;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
        int i5 = i4 % 2;
    }

    static class GlobalBackgroundStateListener implements BackgroundDetector.BackgroundStateChangeListener {
        private static AtomicReference<GlobalBackgroundStateListener> INSTANCE = new AtomicReference<>();

        private GlobalBackgroundStateListener() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static void ensureBackgroundStateListenerRegistered(Context context) {
            if (PlatformVersion.isAtLeastIceCreamSandwich() && (context.getApplicationContext() instanceof Application)) {
                Application application = (Application) context.getApplicationContext();
                if (INSTANCE.get() == null) {
                    GlobalBackgroundStateListener globalBackgroundStateListener = new GlobalBackgroundStateListener();
                    if (PreviewView$1$$ExternalSyntheticBackportWithForwarding0.m(INSTANCE, null, globalBackgroundStateListener)) {
                        BackgroundDetector.initialize(application);
                        BackgroundDetector.getInstance().addListener(globalBackgroundStateListener);
                    }
                }
            }
        }

        @Override // com.google.android.gms.common.api.internal.BackgroundDetector.BackgroundStateChangeListener
        public void onBackgroundStateChanged(boolean z) {
            synchronized (FirebaseApp.access$200()) {
                for (FirebaseApp firebaseApp : new ArrayList(FirebaseApp.INSTANCES.values())) {
                    if (FirebaseApp.access$400(firebaseApp).get()) {
                        FirebaseApp.access$500(firebaseApp, z);
                    }
                }
            }
        }
    }

    private void notifyOnAppDeleted() throws Throwable {
        Object[] objArr;
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 123;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-342512172);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char c = (char) (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
            int iLastIndexOf = TextUtils.lastIndexOf("", '0', 0, 0) + 877;
            int pressedStateDuration = 10 - (ViewConfiguration.getPressedStateDuration() >> 16);
            byte[] bArr = $$a;
            byte b2 = bArr[7];
            byte b3 = (byte) (-bArr[5]);
            Object[] objArr2 = new Object[1];
            a(b2, b3, (byte) (b3 + 4), objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(c, iLastIndexOf, pressedStateDuration, 252381699, false, (String) objArr2[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr3 = new Object[1];
        c(new char[]{25542, 25511, 25375, 15752, 18549, 49042, 62947, 41739, 6221, 59196, 29127, 10099, 37985, 27450, 64993, 43890, 4115, 61278, 31135, 12128, 35899, 29506, 58779, 45958, 2257, 63374}, View.MeasureSpec.getSize(0) + 1, objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        c(new char[]{54819, 54854, 20261, 4528, 16638, 8784, 64877, 16075, 44468, 51976, 31052, 47821, 8590, 18192, 62760, 13975, 42470, 50040, 28933}, (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), objArr4);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1823069286);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char cMyTid = (char) (Process.myTid() >> 22);
            int iIndexOf = TextUtils.indexOf((CharSequence) "", '0') + 877;
            int tapTimeout = (ViewConfiguration.getTapTimeout() >> 16) + 10;
            byte[] bArr2 = $$a;
            byte b4 = (byte) (-bArr2[5]);
            Object[] objArr5 = new Object[1];
            a(b4, b4, bArr2[54], objArr5);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cMyTid, iIndexOf, tapTimeout, 2009631821, false, (String) objArr5[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 117;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
            int i5 = i4 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-337894567);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char defaultSize = (char) View.getDefaultSize(0, 0);
                int i6 = 877 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1));
                int iMakeMeasureSpec = 10 - View.MeasureSpec.makeMeasureSpec(0, 0);
                byte b5 = $$a[7];
                byte b6 = b5;
                Object[] objArr6 = new Object[1];
                a(b5, b6, b6, objArr6);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(defaultSize, i6, iMakeMeasureSpec, 256017550, false, (String) objArr6[0], null);
            }
            Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            objArr = new Object[]{new int[]{((int[]) objArr7[0])[0]}, new int[1], new int[]{((int[]) objArr7[2])[0]}, (String[]) objArr7[3]};
            int iIdentityHashCode = System.identityHashCode(this);
            int i7 = ~iIdentityHashCode;
            int i8 = (-219778240) + (((~((-12091462) | i7)) | 28218767) * 226) + (((~(i7 | (-1048641))) | (~((-28218768) | iIdentityHashCode)) | 17175946) * (-113)) + ((~(iIdentityHashCode | (-12091462))) * 113) + 862957540;
            int i9 = (i8 << 13) ^ i8;
            int i10 = i9 ^ (i9 >>> 17);
            ((int[]) objArr[1])[0] = i10 ^ (i10 << 5);
        } else {
            Object[] objArr8 = new Object[1];
            c(new char[]{25688, 25657, 28169, 12446, 31648, 55097, 50742, 52128, 8147, 59946, 16914, 20440, 37873, 26159, 52842, 50084, 6069, 57944, 19018, 18375, 35774, 32382, 54870, 56123, 3960, 64155, 21172, 24323, 33633, 30379}, 1 - (ViewConfiguration.getScrollDefaultDelay() >> 16), objArr8);
            Class<?> cls2 = Class.forName((String) objArr8[0]);
            Object[] objArr9 = new Object[1];
            c(new char[]{19450, 19353, 20514, 3758, 6007, 7726, 43767, 695, 12411, 54301, 11989, 34464, 48194, 22559, 41633, 2804, 14389, 56426, 9885, 36560, 41989, 16457}, 1 - (ViewConfiguration.getTouchSlop() >> 8), objArr9);
            Context applicationContext = (Context) cls2.getMethod((String) objArr9[0], new Class[0]).invoke(null, null);
            if (applicationContext != null) {
                applicationContext = ((applicationContext instanceof ContextWrapper) && ((ContextWrapper) applicationContext).getBaseContext() == null) ? null : applicationContext.getApplicationContext();
            }
            Object[] objArr10 = new Object[1];
            c(new char[]{65168, 65274, 52646, 37694, 8039, 21794, 41699, 18856, 34138, 18831, 9936, 52611, 2367, 50641, 43662, 16872, 36175, 16879, 11932, 50648}, (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), objArr10);
            Class<?> cls3 = Class.forName((String) objArr10[0]);
            Object[] objArr11 = new Object[1];
            c(new char[]{50639, 50598, 13805, 27504, 61631, 58755, 19752, 63750, 48735, 45508, 51485, 32053, 12879, 15824, 17782, 61784, 46624, 47546, 49477, 30065}, 1 - TextUtils.getCapsMode("", 0, 0), objArr11);
            int iIntValue = ((Integer) cls3.getMethod((String) objArr11[0], Object.class).invoke(null, this)).intValue();
            int i11 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 83;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i11 % 128;
            int i12 = i11 % 2;
            try {
                Object[] objArr12 = {applicationContext, Integer.valueOf(iIntValue), 862957540};
                byte[] bArr3 = $$d;
                byte b7 = bArr3[36];
                Object[] objArr13 = new Object[1];
                d(b7, (byte) (-bArr3[76]), b7, objArr13);
                Class<?> cls4 = Class.forName((String) objArr13[0]);
                byte b8 = bArr3[76];
                Object[] objArr14 = new Object[1];
                d((byte) (-b8), bArr3[36], (byte) (-b8), objArr14);
                Object[] objArr15 = (Object[]) cls4.getMethod((String) objArr14[0], Context.class, Integer.TYPE, Integer.TYPE).invoke(null, objArr12);
                if (applicationContext != null) {
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-337894567);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        char maximumDrawingCacheSize = (char) (ViewConfiguration.getMaximumDrawingCacheSize() >> 24);
                        int capsMode = TextUtils.getCapsMode("", 0, 0) + 876;
                        int i13 = 10 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
                        byte b9 = $$a[7];
                        byte b10 = b9;
                        Object[] objArr16 = new Object[1];
                        a(b9, b10, b10, objArr16);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(maximumDrawingCacheSize, capsMode, i13, 256017550, false, (String) objArr16[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr15);
                    try {
                        Object[] objArr17 = new Object[1];
                        c(new char[]{25542, 25511, 25375, 15752, 18549, 49042, 62947, 41739, 6221, 59196, 29127, 10099, 37985, 27450, 64993, 43890, 4115, 61278, 31135, 12128, 35899, 29506, 58779, 45958, 2257, 63374}, (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), objArr17);
                        Class<?> cls5 = Class.forName((String) objArr17[0]);
                        Object[] objArr18 = new Object[1];
                        c(new char[]{54819, 54854, 20261, 4528, 16638, 8784, 64877, 16075, 44468, 51976, 31052, 47821, 8590, 18192, 62760, 13975, 42470, 50040, 28933}, View.MeasureSpec.makeMeasureSpec(0, 0) + 1, objArr18);
                        long jLongValue2 = ((Long) cls5.getDeclaredMethod((String) objArr18[0], new Class[0]).invoke(null, new Object[0])).longValue();
                        Long lValueOf = Long.valueOf(jLongValue2);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1823069286);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                            char cResolveOpacity = (char) Drawable.resolveOpacity(0, 0);
                            int i14 = 876 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1));
                            int jumpTapTimeout = 10 - (ViewConfiguration.getJumpTapTimeout() >> 16);
                            byte[] bArr4 = $$a;
                            byte b11 = (byte) (-bArr4[5]);
                            Object[] objArr19 = new Object[1];
                            a(b11, b11, bArr4[54], objArr19);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(cResolveOpacity, i14, jumpTapTimeout, 2009631821, false, (String) objArr19[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                        Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-342512172);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                            char packedPositionGroup = (char) ExpandableListView.getPackedPositionGroup(0L);
                            int offsetBefore = 876 - TextUtils.getOffsetBefore("", 0);
                            int size = 10 - View.MeasureSpec.getSize(0);
                            byte[] bArr5 = $$a;
                            byte b12 = bArr5[7];
                            byte b13 = (byte) (-bArr5[5]);
                            Object[] objArr20 = new Object[1];
                            a(b12, b13, (byte) (b13 + 4), objArr20);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(packedPositionGroup, offsetBefore, size, 252381699, false, (String) objArr20[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf2);
                    } catch (Exception unused) {
                        throw new RuntimeException();
                    }
                }
                objArr = objArr15;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        int i15 = ((int[]) objArr[2])[0];
        int i16 = ((int[]) objArr[0])[0];
        if (i16 == i15) {
            int i17 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 41;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i17 % 128;
            int i18 = i17 % 2;
            int i19 = ((int[]) objArr[1])[0];
            Object[] objArr21 = {new int[]{((int[]) objArr[0])[0]}, new int[1], new int[]{((int[]) objArr[2])[0]}, (String[]) objArr[3]};
            int elapsedCpuTime = (int) Process.getElapsedCpuTime();
            int i20 = ~elapsedCpuTime;
            int i21 = i19 + 555414738 + (((~(36769229 | i20)) | 393218) * (-108)) + (((~(i20 | 3540999)) | (~((-3541000) | elapsedCpuTime)) | 33621448) * 54) + ((elapsedCpuTime | 33621448) * 54);
            int i22 = (i21 << 13) ^ i21;
            int i23 = i22 ^ (i22 >>> 17);
            ((int[]) objArr21[1])[0] = i23 ^ (i23 << 5);
        } else {
            Toast.makeText((Context) null, i16 / (((i16 - 1) * i16) % 2), 0).show();
            int i24 = ((int[]) objArr[1])[0];
            Object[] objArr22 = {new int[]{((int[]) objArr[0])[0]}, new int[1], new int[]{((int[]) objArr[2])[0]}, (String[]) objArr[3]};
            int iIdentityHashCode2 = System.identityHashCode(this);
            int i25 = i24 + (((1535678392 + (((-74131926) | (~iIdentityHashCode2)) * (-490))) + (((~(iIdentityHashCode2 | 445928458)) | (-520060384)) * 490)) - 2033755840);
            int i26 = (i25 << 13) ^ i25;
            int i27 = i26 ^ (i26 >>> 17);
            ((int[]) objArr22[1])[0] = i27 ^ (i27 << 5);
        }
        Iterator<FirebaseAppLifecycleListener> it = this.lifecycleListeners.iterator();
        while (it.hasNext()) {
            it.next().onDeleted(this.name, this.options);
            int i28 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 25;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i28 % 128;
            int i29 = i28 % 2;
        }
    }

    public static void clearInstancesForTest() {
        synchronized (LOCK) {
            INSTANCES.clear();
        }
    }

    public static String getPersistenceKey(String str, FirebaseOptions firebaseOptions) {
        int i = 2 % 2;
        StringBuilder sb = new StringBuilder();
        sb.append(Base64Utils.encodeUrlSafeNoPadding(str.getBytes(Charset.defaultCharset())));
        sb.append("+");
        sb.append(Base64Utils.encodeUrlSafeNoPadding(firebaseOptions.getApplicationId().getBytes(Charset.defaultCharset())));
        String string = sb.toString();
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 99;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        if (i2 % 2 != 0) {
            return string;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static List<String> getAllAppNames() {
        ArrayList arrayList = new ArrayList();
        synchronized (LOCK) {
            Iterator<FirebaseApp> it = INSTANCES.values().iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().getName());
            }
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    private void initializeAllApis() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 71;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        if (i2 % 2 == 0) {
            UserManagerCompat.isUserUnlocked(this.applicationContext);
            throw null;
        }
        if (!UserManagerCompat.isUserUnlocked(this.applicationContext)) {
            getName();
            UserUnlockReceiver.access$100(this.applicationContext);
            int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 63;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = 48 / 0;
                return;
            }
            return;
        }
        getName();
        this.componentRuntime.initializeEagerComponents(isDefaultApp());
        this.defaultHeartBeatController.get().registerHeartBeat();
    }

    private static String normalize(String str) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 65;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        String strTrim = str.trim();
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 15;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
        int i5 = i4 % 2;
        return strTrim;
    }

    static void TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        b = -8055390928301083489L;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0025  */
    /* JADX WARN: Code duplicated, block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002e). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0025
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$g(byte r6, int r7, int r8) {
        /*
            int r8 = r8 * 3
            int r8 = 4 - r8
            int r6 = r6 * 3
            int r6 = 107 - r6
            int r7 = r7 * 2
            int r0 = 1 - r7
            byte[] r1 = com.google.firebase.FirebaseApp.$$c
            byte[] r0 = new byte[r0]
            r2 = 0
            int r7 = 0 - r7
            if (r1 != 0) goto L19
            r3 = r8
            r4 = r2
            r8 = r7
            goto L2e
        L19:
            r3 = r2
        L1a:
            byte r4 = (byte) r6
            r0[r3] = r4
            if (r3 != r7) goto L25
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            return r6
        L25:
            r4 = r1[r8]
            int r3 = r3 + 1
            r5 = r8
            r8 = r6
            r6 = r4
            r4 = r3
            r3 = r5
        L2e:
            int r3 = r3 + 1
            int r6 = -r6
            int r6 = r6 + r8
            r8 = r3
            r3 = r4
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.FirebaseApp.$$g(byte, int, int):java.lang.String");
    }
}
