package defpackage;

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
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
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
import androidx.compose.runtime.ComposerKt;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.bpjstku.databinding.ItemProgramChosenBinding;
import com.squareup.picasso.MemoryPolicy;
import com.squareup.picasso.NetworkPolicy;
import com.squareup.picasso.NetworkRequestHandler;
import com.squareup.picasso.Picasso;
import java.lang.ref.Reference;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.ExecutorService;
import okhttp3.tls.internal.der.DerHeader;

/* JADX INFO: loaded from: classes4.dex */
public final class lowerQualityThan {
    final boolean INotificationSideChannel;
    private FileOutputOptionsBuilder INotificationSideChannelStubProxy;
    boolean TuitionPaymentFragmentbindingInflater1;
    final Context TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    final List<ExperimentalAudioApi> TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    public final higherQualityOrLowerThan TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final Handler f1273a;
    final Map<Object, findNearestHigherSupportedEncoderProfilesFor> asBinder;
    public final Handler asInterface;
    final isQualitySupported b;
    final Set<Object> cancel;
    private b cancelAll;
    final Map<Object, findNearestHigherSupportedEncoderProfilesFor> d;
    final Map<String, ExperimentalAudioApi> g;
    private TuitionPaymentFragmentspecialinlinedviewModeldefault3 notify;
    final ExecutorService onTransact;

    public lowerQualityThan(Context context, ExecutorService executorService, Handler handler, higherQualityOrLowerThan higherqualityorlowerthan, isQualitySupported isqualitysupported, FileOutputOptionsBuilder fileOutputOptionsBuilder) {
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 tuitionPaymentFragmentspecialinlinedviewModeldefault3 = new TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        this.notify = tuitionPaymentFragmentspecialinlinedviewModeldefault3;
        tuitionPaymentFragmentspecialinlinedviewModeldefault3.start();
        outputFormatToMuxerFormat.b(tuitionPaymentFragmentspecialinlinedviewModeldefault3.getLooper());
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = context;
        this.onTransact = executorService;
        this.g = new LinkedHashMap();
        this.asBinder = new WeakHashMap();
        this.d = new WeakHashMap();
        this.cancel = new LinkedHashSet();
        this.asInterface = new TuitionPaymentFragmentspecialinlinedviewModeldefault1(tuitionPaymentFragmentspecialinlinedviewModeldefault3.getLooper(), this);
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = higherqualityorlowerthan;
        this.f1273a = handler;
        this.b = isqualitysupported;
        this.INotificationSideChannelStubProxy = fileOutputOptionsBuilder;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = new ArrayList(4);
        this.TuitionPaymentFragmentbindingInflater1 = outputFormatToMuxerFormat.TuitionPaymentFragmentspecialinlinedviewModeldefault3(context);
        this.INotificationSideChannel = outputFormatToMuxerFormat.b(context, "android.permission.ACCESS_NETWORK_STATE");
        b bVar = new b(this);
        this.cancelAll = bVar;
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.AIRPLANE_MODE");
        if (bVar.TuitionPaymentFragmentspecialinlinedviewModeldefault2.INotificationSideChannel) {
            intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
        }
        bVar.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault1.registerReceiver(bVar, intentFilter);
    }

    static class b extends BroadcastReceiver {
        private static final byte[] $$a;
        private static final int $$b;
        private static final byte[] $$d;
        private static final int $$e;
        private static int TuitionPaymentFragmentbindingInflater1;
        private static int TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        private static int b;
        final lowerQualityThan TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        private static final byte[] $$c = {53, -70, 9, -72};
        private static final int $$f = 172;
        private static int $10 = 0;
        private static int $11 = 1;

        /* JADX WARN: Code duplicated, block: B:10:0x0021  */
        /* JADX WARN: Code duplicated, block: B:8:0x0019  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0021 -> B:11:0x0028). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0021
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        private static void c(int r7, byte r8, int r9, java.lang.Object[] r10) {
            /*
                byte[] r0 = lowerQualityThan.b.$$a
                int r9 = r9 + 84
                int r7 = r7 + 4
                int r8 = r8 + 1
                byte[] r1 = new byte[r8]
                r2 = 0
                if (r0 != 0) goto L11
                r9 = r7
                r3 = r8
                r4 = r2
                goto L28
            L11:
                r3 = r2
            L12:
                int r4 = r3 + 1
                byte r5 = (byte) r9
                r1[r3] = r5
                if (r4 != r8) goto L21
                java.lang.String r7 = new java.lang.String
                r7.<init>(r1, r2)
                r10[r2] = r7
                return
            L21:
                int r7 = r7 + 1
                r3 = r0[r7]
                r6 = r9
                r9 = r7
                r7 = r6
            L28:
                int r3 = -r3
                int r7 = r7 + r3
                int r7 = r7 + (-11)
                r3 = r4
                r6 = r9
                r9 = r7
                r7 = r6
                goto L12
            */
            throw new UnsupportedOperationException("Method not decompiled: lowerQualityThan.b.c(int, byte, int, java.lang.Object[]):void");
        }

        /* JADX WARN: Code duplicated, block: B:10:0x0021  */
        /* JADX WARN: Code duplicated, block: B:8:0x0019  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0021 -> B:11:0x0023). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0021
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        private static void d(int r5, byte r6, short r7, java.lang.Object[] r8) {
            /*
                int r5 = 572 - r5
                int r7 = 105 - r7
                int r6 = 99 - r6
                byte[] r0 = lowerQualityThan.b.$$d
                byte[] r1 = new byte[r6]
                r2 = 0
                if (r0 != 0) goto L11
                r4 = r7
                r3 = r2
                r7 = r6
                goto L23
            L11:
                r3 = r2
            L12:
                byte r4 = (byte) r7
                r1[r3] = r4
                int r3 = r3 + 1
                if (r3 != r6) goto L21
                java.lang.String r5 = new java.lang.String
                r5.<init>(r1, r2)
                r8[r2] = r5
                return
            L21:
                r4 = r0[r5]
            L23:
                int r5 = r5 + 1
                int r7 = r7 + r4
                int r7 = r7 + (-1)
                goto L12
            */
            throw new UnsupportedOperationException("Method not decompiled: lowerQualityThan.b.d(int, byte, short, java.lang.Object[]):void");
        }

        private static void a(boolean z, int i, int i2, int i3, char[] cArr, Object[] objArr) throws Throwable {
            char[] cArr2;
            int i4 = 2 % 2;
            setOrVerifyExpectFrameRateRange setorverifyexpectframeraterange = new setOrVerifyExpectFrameRateRange();
            char[] cArr3 = new char[i2];
            setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
            while (setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3 < i2) {
                int i5 = $11 + 107;
                $10 = i5 % 128;
                int i6 = i5 % 2;
                setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = cArr[setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3];
                cArr3[setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = (char) (i + setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
                int i7 = setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr3[i7]), Integer.valueOf(TuitionPaymentFragmentbindingInflater1)};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1545221423);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        byte b2 = (byte) 1;
                        byte b3 = (byte) (b2 - 1);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) - 1), 3291 - TextUtils.indexOf("", ""), TextUtils.getOffsetBefore("", 0) + 31, 1199271174, false, $$g(b2, b3, (byte) (b3 - 1)), new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr3[i7] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                    try {
                        Object[] objArr3 = {setorverifyexpectframeraterange, setorverifyexpectframeraterange};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(29209604);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                            byte b4 = (byte) 0;
                            byte b5 = b4;
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (TextUtils.lastIndexOf("", '0', 0) + 1), ((byte) KeyEvent.getModifierMetaStateMask()) + 652, 44 - TextUtils.getCapsMode("", 0, 0), -450685997, false, $$g(b4, b5, (byte) (b5 - 1)), new Class[]{Object.class, Object.class});
                        }
                        ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3);
                        int i8 = $10 + 3;
                        $11 = i8 % 128;
                        int i9 = i8 % 2;
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
                setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1 = i3;
                char[] cArr4 = new char[i2];
                System.arraycopy(cArr3, 0, cArr4, 0, i2);
                System.arraycopy(cArr4, 0, cArr3, i2 - setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1, setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1);
                System.arraycopy(cArr4, setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1, cArr3, 0, i2 - setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1);
            }
            if (z) {
                int i10 = $10 + 75;
                $11 = i10 % 128;
                if (i10 % 2 == 0) {
                    cArr2 = new char[i2];
                    setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
                } else {
                    cArr2 = new char[i2];
                    setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
                }
                while (setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3 < i2) {
                    int i11 = $11 + 65;
                    $10 = i11 % 128;
                    int i12 = i11 % 2;
                    cArr2[setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr3[(i2 - setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3) - 1];
                    Object[] objArr4 = {setorverifyexpectframeraterange, setorverifyexpectframeraterange};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(29209604);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                        byte b6 = (byte) 0;
                        byte b7 = b6;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) Drawable.resolveOpacity(0, 0), TextUtils.indexOf("", "", 0) + 651, 44 - ExpandableListView.getPackedPositionGroup(0L), -450685997, false, $$g(b6, b7, (byte) (b7 - 1)), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
                    int i13 = $10 + 89;
                    $11 = i13 % 128;
                    int i14 = i13 % 2;
                }
                int i15 = $10 + 9;
                $11 = i15 % 128;
                int i16 = i15 % 2;
                cArr3 = cArr2;
            }
            objArr[0] = new String(cArr3);
        }

        b(lowerQualityThan lowerqualitythan) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = lowerqualitythan;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r3v445, types: [boolean, int] */
        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) throws Throwable {
            Object[] objArr;
            Object[] objArr2;
            Context context2;
            Context applicationContext;
            Object[] objArr3;
            Object[] objArr4;
            Object[] objArr5;
            Object[] objArr6;
            String str;
            Object[] objArr7;
            Object[] objArr8;
            String str2;
            Object[] objArr9;
            Object[] objArr10;
            int i;
            Object[] objArr11;
            Context context3;
            Object[] objArr12;
            Object[] objArr13;
            int i2;
            Object[] objArr14;
            char c;
            int i3 = 2 % 2;
            int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 105;
            b = i4 % 128;
            int i5 = i4 % 2;
            Object[] objArr15 = new Object[1];
            a(false, ExpandableListView.getPackedPositionChild(0L) + 103, (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 21, 17 - ExpandableListView.getPackedPositionChild(0L), new char[]{'\f', 6, 1, 65483, '\f', 16, 65483, 65520, 22, 16, 17, 2, '\n', 65504, '\t', '\f', 0, '\b', 65534, 11, 1, 15}, objArr15);
            String str3 = (String) objArr15[0];
            Object[] objArr16 = new Object[1];
            a(false, Color.alpha(0) + 106, TextUtils.indexOf("", "") + 15, (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 9, new char[]{65534, 65533, 65515, 65534, 65530, 5, '\r', 2, 6, 65534, 65534, 5, 65530, '\t', '\f'}, objArr16);
            String str4 = (String) objArr16[0];
            Object[] objArr17 = new Object[1];
            a(true, 101 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), 16 - KeyEvent.getDeadChar(0, 0), 16 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), new char[]{3, 18, 17, 23, 65521, 65484, 5, '\f', 65535, '\n', 65484, 65535, 20, 65535, '\b', 11}, objArr17);
            String str5 = (String) objArr17[0];
            Object[] objArr18 = new Object[1];
            a(true, TextUtils.getCapsMode("", 0, 0) + 105, AndroidCharacter.getMirror('0') - ' ', View.MeasureSpec.getMode(0) + 6, new char[]{3, 14, '\b', 65535, 65534, 3, 65535, 65534, '\t', 65501, 2, '\r', 65531, 65506, 19, 14}, objArr18);
            String str6 = (String) objArr18[0];
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                char windowTouchSlop = (char) (ViewConfiguration.getWindowTouchSlop() >> 8);
                int i6 = (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 1030;
                int doubleTapTimeout = (ViewConfiguration.getDoubleTapTimeout() >> 16) + 15;
                byte[] bArr = $$a;
                short s = bArr[132];
                Object[] objArr19 = new Object[1];
                c(s, (byte) (s & 52), bArr[7], objArr19);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(windowTouchSlop, i6, doubleTapTimeout, 1357589585, false, (String) objArr19[0], null);
            }
            long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
            long jLongValue = ((Long) Class.forName(str3).getDeclaredMethod(str4, new Class[0]).invoke(null, new Object[0])).longValue();
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                char c2 = (char) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) - 1);
                int trimmedLength = TextUtils.getTrimmedLength("") + 1031;
                int iResolveOpacity = Drawable.resolveOpacity(0, 0) + 15;
                short s2 = (short) ($$b >>> 1);
                Object[] objArr20 = new Object[1];
                c(s2, (byte) (s2 + 1), $$a[7], objArr20);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(c2, trimmedLength, iResolveOpacity, 1344079056, false, (String) objArr20[0], null);
            }
            if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
                int i7 = b + 97;
                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i7 % 128;
                int i8 = i7 % 2;
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    char absoluteGravity = (char) Gravity.getAbsoluteGravity(0, 0);
                    int i9 = (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 1030;
                    int scrollDefaultDelay = 15 - (ViewConfiguration.getScrollDefaultDelay() >> 16);
                    short s3 = (short) ($$b + 1);
                    byte b2 = $$a[7];
                    Object[] objArr21 = new Object[1];
                    c(s3, b2, (byte) (b2 | 14), objArr21);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(absoluteGravity, i9, scrollDefaultDelay, 632103528, false, (String) objArr21[0], null);
                }
                Object[] objArr22 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
                objArr = new Object[]{strArr, new int[]{i}, new int[1], new int[]{i}};
                int i10 = ((int[]) objArr22[3])[0];
                int i11 = ((int[]) objArr22[1])[0];
                String[] strArr = (String[]) objArr22[0];
                int iIdentityHashCode = System.identityHashCode(this);
                int i12 = ((1229186809 + (((~((-518968487) | iIdentityHashCode)) | 245404802) * 1504)) + ((~(iIdentityHashCode | (-273563685))) * (-1504))) - 1520481142;
                int i13 = (i12 << 13) ^ i12;
                int i14 = i13 ^ (i13 >>> 17);
                ((int[]) objArr[2])[0] = i14 ^ (i14 << 5);
            } else {
                int iIntValue = ((Integer) Class.forName(str5).getMethod(str6, Object.class).invoke(null, this)).intValue();
                try {
                    Object[] objArr23 = {1120606692};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-725886332);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (46038 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1))), (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 1134, 17 - TextUtils.lastIndexOf("", '0', 0), 807763283, false, null, new Class[]{Integer.TYPE});
                    }
                    Object[] objArr24 = {Integer.valueOf(iIntValue), 0, -813939750, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).newInstance(objArr23), false};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1443305588);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                        char mirror = (char) ('0' - AndroidCharacter.getMirror('0'));
                        int iLastIndexOf = TextUtils.lastIndexOf("", '0') + 1032;
                        int iIndexOf = 14 - TextUtils.indexOf((CharSequence) "", '0', 0, 0);
                        byte[] bArr2 = $$a;
                        short s4 = bArr2[132];
                        Object[] objArr25 = new Object[1];
                        c(s4, (byte) (s4 & 52), bArr2[7], objArr25);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(mirror, iLastIndexOf, iIndexOf, 1298546779, false, (String) objArr25[0], new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (45992 - TextUtils.indexOf((CharSequence) "", '0', 0)), 1117 - TextUtils.getTrimmedLength(""), (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 16), Boolean.TYPE});
                    }
                    objArr = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr24);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                        char cIndexOf = (char) TextUtils.indexOf("", "", 0, 0);
                        int iIndexOf2 = TextUtils.indexOf((CharSequence) "", '0', 0) + 1032;
                        int longPressTimeout = 15 - (ViewConfiguration.getLongPressTimeout() >> 16);
                        short s5 = (short) ($$b + 1);
                        byte b3 = $$a[7];
                        Object[] objArr26 = new Object[1];
                        c(s5, b3, (byte) (b3 | 14), objArr26);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(cIndexOf, iIndexOf2, longPressTimeout, 632103528, false, (String) objArr26[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, objArr);
                    try {
                        long jLongValue2 = ((Long) Class.forName(str3).getDeclaredMethod(str4, new Class[0]).invoke(null, new Object[0])).longValue();
                        Long lValueOf = Long.valueOf(jLongValue2);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
                            char fadingEdgeLength = (char) (ViewConfiguration.getFadingEdgeLength() >> 16);
                            int iIndexOf3 = TextUtils.indexOf("", "", 0, 0) + 1031;
                            int scrollBarFadeDuration = 15 - (ViewConfiguration.getScrollBarFadeDuration() >> 16);
                            short s6 = (short) ($$b >>> 1);
                            Object[] objArr27 = new Object[1];
                            c(s6, (byte) (s6 + 1), $$a[7], objArr27);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(fadingEdgeLength, iIndexOf3, scrollBarFadeDuration, 1344079056, false, (String) objArr27[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).set(null, lValueOf);
                        Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault10 == null) {
                            char packedPositionType = (char) ExpandableListView.getPackedPositionType(0L);
                            int size = 1031 - View.MeasureSpec.getSize(0);
                            int i15 = (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 15;
                            byte[] bArr3 = $$a;
                            short s7 = bArr3[132];
                            Object[] objArr28 = new Object[1];
                            c(s7, (byte) (s7 & 52), bArr3[7], objArr28);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.b(packedPositionType, size, i15, 1357589585, false, (String) objArr28[0], null);
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
            int i16 = ((int[]) objArr[1])[0];
            int i17 = ((int[]) objArr[3])[0];
            if (i17 == i16) {
                objArr2 = new Object[]{strArr, new int[]{i}, new int[1], new int[]{i}};
                int i18 = ((int[]) objArr[2])[0];
                int i19 = ((int[]) objArr[3])[0];
                int i20 = ((int[]) objArr[1])[0];
                String[] strArr2 = (String[]) objArr[0];
                int iIdentityHashCode2 = System.identityHashCode(this);
                int i21 = i18 + 518898905 + (((~(265333820 | iIdentityHashCode2)) | (-509613991)) * (-964)) + (((~((~iIdentityHashCode2) | 265333820)) | (-535871423)) * (-964));
                int i22 = (i21 << 13) ^ i21;
                int i23 = i22 ^ (i22 >>> 17);
                ((int[]) objArr2[2])[0] = i23 ^ (i23 << 5);
            } else {
                ArrayList arrayList = new ArrayList();
                String[] strArr3 = (String[]) objArr[0];
                if (strArr3 != null) {
                    int i24 = b + 117;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i24 % 128;
                    int i25 = i24 % 2;
                    for (String str7 : strArr3) {
                        arrayList.add(str7);
                    }
                }
                Toast.makeText((Context) null, i17 / (((i17 - 1) * i17) % 2), 0).show();
                objArr2 = new Object[]{strArr, new int[]{i}, new int[1], new int[]{i}};
                int i26 = ((int[]) objArr[2])[0];
                int i27 = ((int[]) objArr[3])[0];
                int i28 = ((int[]) objArr[1])[0];
                String[] strArr4 = (String[]) objArr[0];
                int iMyTid = Process.myTid();
                int i29 = i26 + (((509228611 + (((-546341249) | (~iMyTid)) * (-490))) + (((~(iMyTid | 373366295)) | (-919707544)) * 490)) - 1999057620);
                int i30 = (i29 << 13) ^ i29;
                int i31 = i30 ^ (i30 >>> 17);
                ((int[]) objArr2[2])[0] = i31 ^ (i31 << 5);
            }
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(797565291);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault11 == null) {
                char keyRepeatDelay = (char) (ViewConfiguration.getKeyRepeatDelay() >> 16);
                int longPressTimeout2 = (ViewConfiguration.getLongPressTimeout() >> 16) + 2267;
                int iCombineMeasuredStates = View.combineMeasuredStates(0, 0) + 33;
                short s8 = (short) ($$b >>> 1);
                Object[] objArr29 = new Object[1];
                c(s8, (byte) (s8 + 1), $$a[7], objArr29);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.b(keyRepeatDelay, longPressTimeout2, iCombineMeasuredStates, -887667012, false, (String) objArr29[0], null);
            }
            if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault11).getLong(null) != -1) {
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1013250600);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault12 == null) {
                    char scrollBarFadeDuration2 = (char) (ViewConfiguration.getScrollBarFadeDuration() >> 16);
                    int iKeyCodeFromString = 2267 - KeyEvent.keyCodeFromString("");
                    int i32 = 33 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                    short s9 = (short) ($$b + 1);
                    Object[] objArr30 = new Object[1];
                    c(s9, (byte) (s9 & 189), $$a[7], objArr30);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.b(scrollBarFadeDuration2, iKeyCodeFromString, i32, -654680577, false, (String) objArr30[0], null);
                }
                Object[] objArr31 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault12).get(null);
                objArr3 = new Object[]{new int[]{i}, strArr, new int[1], new int[]{i}};
                int i33 = ((int[]) objArr31[0])[0];
                int i34 = ((int[]) objArr31[3])[0];
                String[] strArr5 = (String[]) objArr31[1];
                int iIdentityHashCode3 = System.identityHashCode(this);
                int i35 = (-1983556511) + (((~iIdentityHashCode3) | 4195492) * 1324) + (((~(iIdentityHashCode3 | 55670180)) | (~(753043135 | iIdentityHashCode3))) * (-1324)) + 385886021;
                int i36 = (i35 << 13) ^ i35;
                int i37 = i36 ^ (i36 >>> 17);
                ((int[]) objArr3[2])[0] = i37 ^ (i37 << 5);
                context2 = context;
                objArr2 = objArr2;
            } else {
                context2 = context;
                if (context2 != null) {
                    int i38 = b + 61;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i38 % 128;
                    int i39 = i38 % 2;
                    applicationContext = ((context2 instanceof ContextWrapper) && ((ContextWrapper) context2).getBaseContext() == null) ? null : context.getApplicationContext();
                } else {
                    applicationContext = context2;
                }
                try {
                    Object[] objArr32 = {applicationContext, Integer.valueOf(((Integer) Class.forName(str5).getMethod(str6, Object.class).invoke(null, this)).intValue()), 0, -1146519693};
                    byte[] bArr4 = $$d;
                    Object[] objArr33 = new Object[1];
                    d((short) 568, bArr4[26], bArr4[29], objArr33);
                    Class<?> cls = Class.forName((String) objArr33[0]);
                    Object[] objArr34 = new Object[1];
                    d((short) 470, (byte) (bArr4[116] + 1), bArr4[97], objArr34);
                    Object[] objArr35 = (Object[]) cls.getMethod((String) objArr34[0], Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr32);
                    if (applicationContext != null) {
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1013250600);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault13 == null) {
                            char cAlpha = (char) Color.alpha(0);
                            int iRgb = Color.rgb(0, 0, 0) + 16779483;
                            int iAxisFromString = 32 - MotionEvent.axisFromString("");
                            short s10 = (short) ($$b + 1);
                            Object[] objArr36 = new Object[1];
                            c(s10, (byte) (s10 & 189), $$a[7], objArr36);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.b(cAlpha, iRgb, iAxisFromString, -654680577, false, (String) objArr36[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault13).set(null, objArr35);
                        try {
                            long jLongValue3 = ((Long) Class.forName(str3).getDeclaredMethod(str4, new Class[0]).invoke(null, new Object[0])).longValue();
                            Long lValueOf3 = Long.valueOf(jLongValue3);
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(796641770);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault14 == null) {
                                char cArgb = (char) Color.argb(0, 0, 0, 0);
                                int absoluteGravity2 = 2267 - Gravity.getAbsoluteGravity(0, 0);
                                int tapTimeout = (ViewConfiguration.getTapTimeout() >> 16) + 33;
                                byte[] bArr5 = $$a;
                                short s11 = bArr5[132];
                                Object[] objArr37 = new Object[1];
                                c(s11, (byte) (s11 & 52), bArr5[7], objArr37);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.b(cArgb, absoluteGravity2, tapTimeout, -874156483, false, (String) objArr37[0], null);
                            }
                            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault14).set(null, lValueOf3);
                            Long lValueOf4 = Long.valueOf(jLongValue3 >> 12);
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(797565291);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault15 == null) {
                                char defaultSize = (char) View.getDefaultSize(0, 0);
                                int iGreen = 2267 - Color.green(0);
                                int iMyPid = 33 - (Process.myPid() >> 22);
                                short s12 = (short) ($$b >>> 1);
                                Object[] objArr38 = new Object[1];
                                c(s12, (byte) (s12 + 1), $$a[7], objArr38);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.b(defaultSize, iGreen, iMyPid, -887667012, false, (String) objArr38[0], null);
                            }
                            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault15).set(null, lValueOf4);
                        } catch (Exception unused2) {
                            throw new RuntimeException();
                        }
                    } else {
                        objArr35 = objArr35;
                        objArr2 = objArr2;
                    }
                    objArr3 = objArr35;
                } catch (Throwable th2) {
                    Throwable cause2 = th2.getCause();
                    if (cause2 == null) {
                        throw th2;
                    }
                    throw cause2;
                }
            }
            if (((int[]) objArr3[0])[0] != ((int[]) objArr3[3])[0]) {
                ArrayList arrayList2 = new ArrayList();
                String[] strArr6 = (String[]) objArr3[1];
                if (strArr6 != null) {
                    for (String str8 : strArr6) {
                        arrayList2.add(str8);
                    }
                }
                throw null;
            }
            Object[] objArr39 = {new int[]{i}, strArr, new int[1], new int[]{i}};
            int i40 = ((int[]) objArr3[2])[0];
            int i41 = ((int[]) objArr3[0])[0];
            int i42 = ((int[]) objArr3[3])[0];
            String[] strArr7 = (String[]) objArr3[1];
            int iIdentityHashCode4 = System.identityHashCode(this);
            int i43 = ~iIdentityHashCode4;
            int i44 = i40 + 1601727707 + (((~(79720598 | i43)) | 724798281) * 184) + ((iIdentityHashCode4 | 75526162) * (-184)) + ((~((-728992718) | i43)) * 184);
            int i45 = (i44 << 13) ^ i44;
            int i46 = i45 ^ (i45 >>> 17);
            ((int[]) objArr39[2])[0] = i46 ^ (i46 << 5);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault16 == null) {
                char c3 = (char) (29945 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)));
                int touchSlop = 1755 - (ViewConfiguration.getTouchSlop() >> 8);
                int packedPositionChild = ExpandableListView.getPackedPositionChild(0L) + 24;
                short s13 = (short) ($$b + 1);
                Object[] objArr40 = new Object[1];
                c(s13, (byte) (s13 & 189), $$a[7], objArr40);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.b(c3, touchSlop, packedPositionChild, 986134021, false, (String) objArr40[0], null);
            }
            if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault16).getLong(null) != -1) {
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault17 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault17 == null) {
                    char cAlpha2 = (char) (29944 - Color.alpha(0));
                    int deadChar = 1755 - KeyEvent.getDeadChar(0, 0);
                    int scrollBarFadeDuration3 = 23 - (ViewConfiguration.getScrollBarFadeDuration() >> 16);
                    short s14 = (short) ($$b >>> 1);
                    Object[] objArr41 = new Object[1];
                    c(s14, (byte) (s14 + 1), $$a[7], objArr41);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault17 = initSession.b(cAlpha2, deadChar, scrollBarFadeDuration3, 1599039318, false, (String) objArr41[0], null);
                }
                Object[] objArr42 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault17).get(null);
                objArr4 = new Object[]{new int[]{((int[]) objArr42[0])[0]}, new int[]{((int[]) objArr42[1])[0]}, (Object[]) objArr42[2], new int[1], (String[]) objArr42[4]};
                int i47 = (int) Runtime.getRuntime().totalMemory();
                int i48 = (((638745033 + (((~((-4353) | (~i47))) | (~(212598073 | i47))) * (-272))) + (((~((-75503922) | i47)) | 75499569) * (-272))) + (((~(i47 | 75503921)) | 137098504) * 272)) - 706233087;
                int i49 = (i48 << 13) ^ i48;
                int i50 = i49 ^ (i49 >>> 17);
                ((int[]) objArr4[3])[0] = i50 ^ (i50 << 5);
                objArr39 = objArr39;
            } else {
                int iIntValue2 = ((Integer) Class.forName(str5).getMethod(str6, Object.class).invoke(null, this)).intValue();
                Object[] objArr43 = {1120606692};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault18 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2063193834);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault18 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault18 = initSession.b((char) (Color.green(0) + 42049), (ViewConfiguration.getWindowTouchSlop() >> 8) + 1726, 29 - TextUtils.indexOf("", "", 0), -1637387971, false, null, new Class[]{Integer.TYPE});
                }
                Object[] objArrB$5f1425da = ItemProgramChosenBinding.b$5f1425da(iIntValue2, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault18).newInstance(objArr43), -706233087);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault19 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault19 == null) {
                    char cIndexOf2 = (char) (29943 - TextUtils.indexOf((CharSequence) "", '0'));
                    int offsetBefore = 1755 - TextUtils.getOffsetBefore("", 0);
                    int trimmedLength2 = TextUtils.getTrimmedLength("") + 23;
                    short s15 = (short) ($$b >>> 1);
                    Object[] objArr44 = new Object[1];
                    c(s15, (byte) (s15 + 1), $$a[7], objArr44);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault19 = initSession.b(cIndexOf2, offsetBefore, trimmedLength2, 1599039318, false, (String) objArr44[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault19).set(null, objArrB$5f1425da);
                try {
                    long jLongValue4 = ((Long) Class.forName(str3).getDeclaredMethod(str4, new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf5 = Long.valueOf(jLongValue4);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault20 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1145728641);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault20 == null) {
                        char modifierMetaStateMask = (char) (((byte) KeyEvent.getModifierMetaStateMask()) + 29945);
                        int i51 = 1756 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1));
                        int i52 = (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 22;
                        Object[] objArr45 = new Object[1];
                        c((short) 140, (byte) 52, $$a[7], objArr45);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault20 = initSession.b(modifierMetaStateMask, i51, i52, 1596667560, false, (String) objArr45[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault20).set(null, lValueOf5);
                    Long lValueOf6 = Long.valueOf(jLongValue4 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault21 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault21 == null) {
                        char maxKeyCode = (char) ((KeyEvent.getMaxKeyCode() >> 16) + 29944);
                        int iIndexOf4 = 1755 - TextUtils.indexOf("", "", 0);
                        int scrollBarSize = (ViewConfiguration.getScrollBarSize() >> 8) + 23;
                        short s16 = (short) ($$b + 1);
                        Object[] objArr46 = new Object[1];
                        c(s16, (byte) (s16 & 189), $$a[7], objArr46);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault21 = initSession.b(maxKeyCode, iIndexOf4, scrollBarSize, 986134021, false, (String) objArr46[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault21).set(null, lValueOf6);
                    objArr4 = objArrB$5f1425da;
                } catch (Exception unused3) {
                    throw new RuntimeException();
                }
            }
            if (((int[]) objArr4[0])[0] != ((int[]) objArr4[1])[0]) {
                ArrayList arrayList3 = new ArrayList();
                String[] strArr8 = (String[]) objArr4[4];
                if (strArr8 != null) {
                    int i53 = b + 69;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i53 % 128;
                    int i54 = i53 % 2;
                    for (String str9 : strArr8) {
                        arrayList3.add(str9);
                    }
                }
                throw null;
            }
            int i55 = ((int[]) objArr4[3])[0];
            Object[] objArr47 = {new int[]{((int[]) objArr4[0])[0]}, new int[]{((int[]) objArr4[1])[0]}, (Object[]) objArr4[2], new int[1], (String[]) objArr4[4]};
            int iIdentityHashCode5 = System.identityHashCode(this);
            int i56 = i55 + (((~((-25787564) | iIdentityHashCode5)) | 9006113) * (-566)) + 1015095087 + ((~(iIdentityHashCode5 | (-16781451))) * 566);
            int i57 = (i56 << 13) ^ i56;
            int i58 = i57 ^ (i57 >>> 17);
            ((int[]) objArr47[3])[0] = i58 ^ (i58 << 5);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault22 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1309309962);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault22 == null) {
                char scrollDefaultDelay2 = (char) (53893 - (ViewConfiguration.getScrollDefaultDelay() >> 16));
                int maximumFlingVelocity = (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 1320;
                int absoluteGravity3 = 36 - Gravity.getAbsoluteGravity(0, 0);
                short s17 = (short) ($$b + 1);
                byte b4 = $$a[7];
                Object[] objArr48 = new Object[1];
                c(s17, b4, (byte) (b4 | 14), objArr48);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault22 = initSession.b(scrollDefaultDelay2, maximumFlingVelocity, absoluteGravity3, -1433084963, false, (String) objArr48[0], null);
            }
            if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault22).getLong(null) != -1) {
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault23 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1763547602);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault23 == null) {
                    char maximumDrawingCacheSize = (char) ((ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 53893);
                    int deadChar2 = KeyEvent.getDeadChar(0, 0) + 1320;
                    int deadChar3 = KeyEvent.getDeadChar(0, 0) + 36;
                    short s18 = (short) ($$b >>> 1);
                    Object[] objArr49 = new Object[1];
                    c(s18, (byte) (s18 + 1), $$a[7], objArr49);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault23 = initSession.b(maximumDrawingCacheSize, deadChar2, deadChar3, -1920778747, false, (String) objArr49[0], null);
                }
                Object[] objArr50 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault23).get(null);
                objArr5 = new Object[]{new int[]{i}, new int[1], strArr, new int[]{i}};
                int i59 = ((int[]) objArr50[0])[0];
                int i60 = ((int[]) objArr50[3])[0];
                String[] strArr9 = (String[]) objArr50[2];
                int iIdentityHashCode6 = System.identityHashCode(this);
                int i61 = ~iIdentityHashCode6;
                int i62 = ((((-1721581340) + (((~((-1319170559) | i61)) | (~(1337064958 | iIdentityHashCode6))) * (-831))) + ((~((-1285607693) | iIdentityHashCode6)) * (-1662))) + (((~(iIdentityHashCode6 | 1319170558)) | ((~(i61 | (-51457267))) | (~(51457266 | iIdentityHashCode6)))) * 831)) - 1875594677;
                int i63 = (i62 << 13) ^ i62;
                int i64 = i63 ^ (i63 >>> 17);
                ((int[]) objArr5[1])[0] = i64 ^ (i64 << 5);
                objArr47 = objArr47;
            } else {
                Context applicationContext2 = context2 != null ? ((context2 instanceof ContextWrapper) && ((ContextWrapper) context2).getBaseContext() == null) ? null : context.getApplicationContext() : context2;
                int iIntValue3 = ((Integer) Class.forName(str5).getMethod(str6, Object.class).invoke(null, this)).intValue();
                Object[] objArr51 = {1120606692};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault24 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(41341784);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault24 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault24 = initSession.b((char) ((ViewConfiguration.getScrollBarSize() >> 8) + 47977), 1300 - View.MeasureSpec.getSize(0), 20 - Gravity.getAbsoluteGravity(0, 0), -420973425, false, null, new Class[]{Integer.TYPE});
                }
                Object[] objArr52 = {applicationContext2, "com.bpjstku", -1875594677, Integer.valueOf(iIntValue3), 643, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault24).newInstance(objArr51), false};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault25 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-733829592);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault25 == null) {
                    char c4 = (char) (53894 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)));
                    int iCombineMeasuredStates2 = View.combineMeasuredStates(0, 0) + 1320;
                    int pressedStateDuration = (ViewConfiguration.getPressedStateDuration() >> 16) + 36;
                    short s19 = (short) ($$b >>> 1);
                    Object[] objArr53 = new Object[1];
                    c(s19, (byte) (s19 + 1), $$a[7], objArr53);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault25 = initSession.b(c4, iCombineMeasuredStates2, pressedStateDuration, 819724799, false, (String) objArr53[0], new Class[]{Context.class, String.class, Integer.TYPE, Integer.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (57879 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))), 1394 - (Process.myPid() >> 22), ImageFormat.getBitsPerPixel(0) + 76), Boolean.TYPE});
                }
                Object[] objArr54 = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault25).invoke(null, objArr52);
                if (applicationContext2 != null) {
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault26 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1763547602);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault26 == null) {
                        char offsetAfter = (char) (53893 - TextUtils.getOffsetAfter("", 0));
                        int iAxisFromString2 = MotionEvent.axisFromString("") + 1321;
                        int i65 = 37 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1));
                        short s20 = (short) ($$b >>> 1);
                        Object[] objArr55 = new Object[1];
                        c(s20, (byte) (s20 + 1), $$a[7], objArr55);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault26 = initSession.b(offsetAfter, iAxisFromString2, i65, -1920778747, false, (String) objArr55[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault26).set(null, objArr54);
                    try {
                        long jLongValue5 = ((Long) Class.forName(str3).getDeclaredMethod(str4, new Class[0]).invoke(null, new Object[0])).longValue();
                        Long lValueOf7 = Long.valueOf(jLongValue5);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault27 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1351245985);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault27 == null) {
                            char cGreen = (char) (53893 - Color.green(0));
                            int packedPositionType2 = 1320 - ExpandableListView.getPackedPositionType(0L);
                            int iIndexOf5 = 36 - TextUtils.indexOf("", "");
                            short s21 = (short) ($$b + 1);
                            Object[] objArr56 = new Object[1];
                            c(s21, (byte) (s21 & 189), $$a[7], objArr56);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault27 = initSession.b(cGreen, packedPositionType2, iIndexOf5, -1273706634, false, (String) objArr56[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault27).set(null, lValueOf7);
                        Long lValueOf8 = Long.valueOf(jLongValue5 >> 12);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault28 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1309309962);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault28 == null) {
                            char c5 = (char) ((PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 53893);
                            int maximumFlingVelocity2 = (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 1320;
                            int tapTimeout2 = (ViewConfiguration.getTapTimeout() >> 16) + 36;
                            short s22 = (short) ($$b + 1);
                            byte b5 = $$a[7];
                            Object[] objArr57 = new Object[1];
                            c(s22, b5, (byte) (b5 | 14), objArr57);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault28 = initSession.b(c5, maximumFlingVelocity2, tapTimeout2, -1433084963, false, (String) objArr57[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault28).set(null, lValueOf8);
                    } catch (Exception unused4) {
                        throw new RuntimeException();
                    }
                } else {
                    objArr54 = objArr54;
                    objArr47 = objArr47;
                }
                objArr5 = objArr54;
            }
            if (((int[]) objArr5[0])[0] != ((int[]) objArr5[3])[0]) {
                throw null;
            }
            Object[] objArr58 = {new int[]{i}, new int[1], strArr, new int[]{i}};
            int i66 = ((int[]) objArr5[1])[0];
            int i67 = ((int[]) objArr5[0])[0];
            int i68 = ((int[]) objArr5[3])[0];
            String[] strArr10 = (String[]) objArr5[2];
            int iIdentityHashCode7 = System.identityHashCode(this);
            int i69 = ~iIdentityHashCode7;
            int i70 = i66 + (-38200764) + ((iIdentityHashCode7 | 481995414) * (-859)) + (((~(iIdentityHashCode7 | (-347217939))) | (~(481995414 | i69))) * 859) + (((~((-888632411) | i69)) | 541414472) * 859);
            int i71 = (i70 << 13) ^ i70;
            int i72 = i71 ^ (i71 >>> 17);
            ((int[]) objArr58[1])[0] = i72 ^ (i72 << 5);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault29 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1354724972);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault29 == null) {
                char pressedStateDuration2 = (char) (43042 - (ViewConfiguration.getPressedStateDuration() >> 16));
                int iIndexOf6 = TextUtils.indexOf((CharSequence) "", '0') + 3112;
                int iResolveSizeAndState = 22 - View.resolveSizeAndState(0, 0, 0);
                byte[] bArr6 = $$a;
                short s23 = bArr6[132];
                Object[] objArr59 = new Object[1];
                c(s23, (byte) (s23 & 52), bArr6[7], objArr59);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault29 = initSession.b(pressedStateDuration2, iIndexOf6, iResolveSizeAndState, -1272852037, false, (String) objArr59[0], null);
            }
            if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault29).getLong(null) != -1) {
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault30 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-308143642);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault30 == null) {
                    char c6 = (char) (43043 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)));
                    int mode = View.MeasureSpec.getMode(0) + 3111;
                    int iLastIndexOf2 = TextUtils.lastIndexOf("", '0') + 23;
                    short s24 = (short) ($$b + 1);
                    Object[] objArr60 = new Object[1];
                    c(s24, (byte) (s24 & 189), $$a[7], objArr60);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault30 = initSession.b(c6, mode, iLastIndexOf2, 154975793, false, (String) objArr60[0], null);
                }
                Object[] objArr61 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault30).get(null);
                int i73 = ((int[]) objArr61[2])[0];
                int i74 = ((int[]) objArr61[1])[0];
                String[] strArr11 = (String[]) objArr61[3];
                int[] iArr = {i74};
                int iIdentityHashCode8 = System.identityHashCode(this);
                int i75 = ~iIdentityHashCode8;
                int i76 = ((((-446427305) + ((((~((-807455046) | i75)) | (~((-84149249) | iIdentityHashCode8))) | (~((-5972121) | iIdentityHashCode8))) * 765)) + (((~((-891604294) | i75)) | 807455045) * 1530)) + (((~(iIdentityHashCode8 | (-891604294))) | (~(i75 | (-5972121)))) * 765)) - 1255193578;
                int i77 = (i76 << 13) ^ i76;
                int i78 = i77 ^ (i77 >>> 17);
                ((int[]) objArr6[0])[0] = i78 ^ (i78 << 5);
                objArr6 = new Object[]{new int[1], iArr, new int[]{i73}, strArr11};
                objArr58 = objArr58;
            } else {
                Object[] objArr62 = {null, Integer.valueOf(((Integer) Class.forName(str5).getMethod(str6, Object.class).invoke(null, this)).intValue()), 0, -1255193578};
                byte[] bArr7 = $$d;
                Object[] objArr63 = new Object[1];
                d((short) 418, (byte) (-bArr7[333]), bArr7[29], objArr63);
                Class<?> cls2 = Class.forName((String) objArr63[0]);
                Object[] objArr64 = new Object[1];
                d((short) 370, (byte) (bArr7[116] + 1), bArr7[97], objArr64);
                Object[] objArr65 = (Object[]) cls2.getMethod((String) objArr64[0], Class.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr62);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault31 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-308143642);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault31 == null) {
                    char cAlpha3 = (char) (43042 - Color.alpha(0));
                    int i79 = (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 3110;
                    int scrollDefaultDelay3 = (ViewConfiguration.getScrollDefaultDelay() >> 16) + 22;
                    short s25 = (short) ($$b + 1);
                    Object[] objArr66 = new Object[1];
                    c(s25, (byte) (s25 & 189), $$a[7], objArr66);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault31 = initSession.b(cAlpha3, i79, scrollDefaultDelay3, 154975793, false, (String) objArr66[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault31).set(null, objArr65);
                try {
                    long jLongValue6 = ((Long) Class.forName(str3).getDeclaredMethod(str4, new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf9 = Long.valueOf(jLongValue6);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault32 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1355648493);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault32 == null) {
                        char minimumFlingVelocity = (char) (43042 - (ViewConfiguration.getMinimumFlingVelocity() >> 16));
                        int iIndexOf7 = 3110 - TextUtils.indexOf((CharSequence) "", '0', 0, 0);
                        int jumpTapTimeout = (ViewConfiguration.getJumpTapTimeout() >> 16) + 22;
                        short s26 = (short) ($$b >>> 1);
                        Object[] objArr67 = new Object[1];
                        c(s26, (byte) (s26 + 1), $$a[7], objArr67);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault32 = initSession.b(minimumFlingVelocity, iIndexOf7, jumpTapTimeout, -1269618118, false, (String) objArr67[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault32).set(null, lValueOf9);
                    Long lValueOf10 = Long.valueOf(jLongValue6 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault33 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1354724972);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault33 == null) {
                        char c7 = (char) ((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 43041);
                        int i80 = 3111 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
                        int i81 = 22 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1));
                        byte[] bArr8 = $$a;
                        short s27 = bArr8[132];
                        Object[] objArr68 = new Object[1];
                        c(s27, (byte) (s27 & 52), bArr8[7], objArr68);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault33 = initSession.b(c7, i80, i81, -1272852037, false, (String) objArr68[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault33).set(null, lValueOf10);
                    objArr6 = objArr65;
                } catch (Exception unused5) {
                    throw new RuntimeException();
                }
            }
            int i82 = ((int[]) objArr6[1])[0];
            int i83 = ((int[]) objArr6[2])[0];
            if (i83 != i82) {
                ArrayList arrayList4 = new ArrayList();
                String[] strArr12 = (String[]) objArr6[3];
                if (strArr12 != null) {
                    for (String str10 : strArr12) {
                        arrayList4.add(str10);
                    }
                }
                throw new RuntimeException(String.valueOf(i83));
            }
            int i84 = ((int[]) objArr6[0])[0];
            int i85 = ((int[]) objArr6[2])[0];
            int i86 = ((int[]) objArr6[1])[0];
            String[] strArr13 = (String[]) objArr6[3];
            int[] iArr2 = {i86};
            int iIdentityHashCode9 = System.identityHashCode(this);
            int i87 = ~iIdentityHashCode9;
            int i88 = i84 + 2115621899 + (((~(i87 | 1464542639)) | (-1600108032) | (~((-104923428) | iIdentityHashCode9))) * 717) + (((~(iIdentityHashCode9 | 1464542639)) | (~(i87 | (-104923428))) | (-1600108032)) * 717);
            int i89 = (i88 << 13) ^ i88;
            int i90 = i89 ^ (i89 >>> 17);
            ((int[]) objArr[0])[0] = i90 ^ (i90 << 5);
            Object[] objArr69 = {new int[1], iArr2, new int[]{i85}, strArr13};
            int i91 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 99;
            b = i91 % 128;
            int i92 = i91 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault34 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(118372281);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault34 == null) {
                char packedPositionChild2 = (char) (37566 - ExpandableListView.getPackedPositionChild(0L));
                int keyRepeatDelay2 = (ViewConfiguration.getKeyRepeatDelay() >> 16) + 625;
                int edgeSlop = 14 - (ViewConfiguration.getEdgeSlop() >> 16);
                short s28 = (short) ($$b + 1);
                byte b6 = $$a[7];
                Object[] objArr70 = new Object[1];
                c(s28, b6, (byte) (b6 | 14), objArr70);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault34 = initSession.b(packedPositionChild2, keyRepeatDelay2, edgeSlop, -477065106, false, (String) objArr70[0], null);
            }
            long j2 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault34).getLong(null);
            long jLongValue7 = ((Long) Class.forName(str3).getDeclaredMethod(str4, new Class[0]).invoke(null, new Object[0])).longValue();
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault35 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(559617152);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault35 == null) {
                char windowTouchSlop2 = (char) ((ViewConfiguration.getWindowTouchSlop() >> 8) + 37567);
                int fadingEdgeLength2 = 625 - (ViewConfiguration.getFadingEdgeLength() >> 16);
                int i93 = (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 13;
                byte[] bArr9 = $$a;
                short s29 = bArr9[132];
                Object[] objArr71 = new Object[1];
                c(s29, (byte) (s29 & 52), bArr9[7], objArr71);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault35 = initSession.b(windowTouchSlop2, fadingEdgeLength2, i93, -976899241, false, (String) objArr71[0], null);
            }
            if (j2 == ((jLongValue7 - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault35).getLong(null) << 52) >>> 52)) >> 12)) {
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault36 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(560540673);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault36 == null) {
                    char size2 = (char) (37567 - View.MeasureSpec.getSize(0));
                    int scrollDefaultDelay4 = 625 - (ViewConfiguration.getScrollDefaultDelay() >> 16);
                    int i94 = (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 13;
                    short s30 = (short) ($$b >>> 1);
                    Object[] objArr72 = new Object[1];
                    c(s30, (byte) (s30 + 1), $$a[7], objArr72);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault36 = initSession.b(size2, scrollDefaultDelay4, i94, -973632554, false, (String) objArr72[0], null);
                }
                Object[] objArr73 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault36).get(null);
                int i95 = ((int[]) objArr73[2])[0];
                int i96 = ((int[]) objArr73[0])[0];
                String[] strArr14 = (String[]) objArr73[3];
                int[] iArr3 = {i95};
                int iIdentityHashCode10 = System.identityHashCode(this);
                int i97 = ~iIdentityHashCode10;
                int i98 = (~((-866324818) | i97)) | 822087953;
                int i99 = ~(iIdentityHashCode10 | 1001650167);
                int i100 = (((i98 | i99) * (-252)) - 1463495228) + ((i99 | (~(i97 | (-44236865)))) * 252) + 92337131;
                int i101 = (i100 << 13) ^ i100;
                int i102 = i101 ^ (i101 >>> 17);
                ((int[]) objArr7[1])[0] = i102 ^ (i102 << 5);
                objArr7 = new Object[]{new int[]{i96}, new int[1], iArr3, strArr14};
                str = str4;
            } else {
                Context applicationContext3 = context2 != null ? ((context2 instanceof ContextWrapper) && ((ContextWrapper) context2).getBaseContext() == null) ? null : context.getApplicationContext() : context2;
                int iIntValue4 = ((Integer) Class.forName(str5).getMethod(str6, Object.class).invoke(null, this)).intValue();
                Object[] objArr74 = new Object[1];
                a(false, (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 76, AndroidCharacter.getMirror('0') + 16, 2 - TextUtils.indexOf("", ""), new char[]{65513, 25, 65513, 28, 29, 24, 24, 25, 29, 65517, 65520, 29, 29, 65516, 28, 28, 24, 65516, 65518, 65512, 65517, 28, 65516, 65518, 65518, 25, 28, 65518, 25, 65512, 65514, 27, 65515, 65520, 65520, 24, 65513, 65520, 65512, 65512, 65519, 24, 29, 65516, 65515, 65519, 29, 28, 65514, 65516, 24, 65511, 65519, 24, 65515, 65519, 65513, 25, 65520, 65519, 65515, 25, 25, 29}, objArr74);
                String str11 = (String) objArr74[0];
                Object[] objArr75 = new Object[1];
                a(true, Color.blue(0) + 72, 64 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), 15 - TextUtils.getOffsetBefore("", 0), new char[]{'!', 65517, ' ', 29, 65515, '!', ' ', 65522, 29, 65520, 65515, 65521, 31, 28, 30, '!', 65521, 65515, 28, 65519, 65517, '!', 30, 65517, 65518, 65519, 29, 65524, 65524, 30, 65524, 65518, 65518, 65519, 65522, 65521, '!', ' ', 65517, 65517, 28, ' ', 65519, 65516, 65520, 29, 65524, 65523, 65524, 65524, 65518, 65524, 29, 65519, 29, 65521, '!', 65522, 65520, 65518, 65521, 65518, 65517, 65519}, objArr75);
                Object[] objArr76 = {applicationContext3, new String[]{str11, (String) objArr75[0]}, Integer.valueOf(iIntValue4), 17, 92337131};
                short s31 = (short) TypedValues.AttributesType.TYPE_PIVOT_TARGET;
                byte[] bArr10 = $$d;
                Object[] objArr77 = new Object[1];
                d(s31, (byte) (s31 & 235), bArr10[26], objArr77);
                Class<?> cls3 = Class.forName((String) objArr77[0]);
                Object[] objArr78 = new Object[1];
                d((short) 470, (byte) (bArr10[116] + 1), bArr10[97], objArr78);
                Object[] objArr79 = (Object[]) cls3.getMethod((String) objArr78[0], Context.class, String[].class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr76);
                int i103 = ((int[]) objArr79[0])[0];
                int i104 = ((int[]) objArr79[2])[0];
                if (applicationContext3 != null) {
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault37 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(560540673);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault37 == null) {
                        char c8 = (char) (37568 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)));
                        int packedPositionChild3 = 624 - ExpandableListView.getPackedPositionChild(0L);
                        int iGreen2 = Color.green(0) + 14;
                        short s32 = (short) ($$b >>> 1);
                        Object[] objArr80 = new Object[1];
                        c(s32, (byte) (s32 + 1), $$a[7], objArr80);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault37 = initSession.b(c8, packedPositionChild3, iGreen2, -973632554, false, (String) objArr80[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault37).set(null, objArr79);
                    try {
                        str = str4;
                        long jLongValue8 = ((Long) Class.forName(str3).getDeclaredMethod(str, new Class[0]).invoke(null, new Object[0])).longValue();
                        Long lValueOf11 = Long.valueOf(jLongValue8);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault38 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(559617152);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault38 == null) {
                            char cMyTid = (char) ((Process.myTid() >> 22) + 37567);
                            int i105 = 625 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1));
                            int iResolveSizeAndState2 = 14 - View.resolveSizeAndState(0, 0, 0);
                            byte[] bArr11 = $$a;
                            short s33 = bArr11[132];
                            Object[] objArr81 = new Object[1];
                            c(s33, (byte) (s33 & 52), bArr11[7], objArr81);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault38 = initSession.b(cMyTid, i105, iResolveSizeAndState2, -976899241, false, (String) objArr81[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault38).set(null, lValueOf11);
                        Long lValueOf12 = Long.valueOf(jLongValue8 >> 12);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault39 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(118372281);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault39 == null) {
                            char tapTimeout3 = (char) ((ViewConfiguration.getTapTimeout() >> 16) + 37567);
                            int iMyTid2 = 625 - (Process.myTid() >> 22);
                            int mode2 = 14 - View.MeasureSpec.getMode(0);
                            short s34 = (short) ($$b + 1);
                            byte b7 = $$a[7];
                            Object[] objArr82 = new Object[1];
                            c(s34, b7, (byte) (b7 | 14), objArr82);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault39 = initSession.b(tapTimeout3, iMyTid2, mode2, -477065106, false, (String) objArr82[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault39).set(null, lValueOf12);
                    } catch (Exception unused6) {
                        throw new RuntimeException();
                    }
                } else {
                    str = str4;
                    objArr79 = objArr79;
                }
                objArr7 = objArr79;
            }
            int i106 = ((int[]) objArr7[0])[0];
            int i107 = ((int[]) objArr7[2])[0];
            if (i107 != i106) {
                ArrayList arrayList5 = new ArrayList();
                String[] strArr15 = (String[]) objArr7[3];
                if (strArr15 != null) {
                    for (String str12 : strArr15) {
                        arrayList5.add(str12);
                    }
                }
                throw new RuntimeException(String.valueOf(i107));
            }
            int i108 = b + 95;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i108 % 128;
            int i109 = i108 % 2;
            int i110 = ((int[]) objArr7[1])[0];
            int i111 = ((int[]) objArr7[2])[0];
            int i112 = ((int[]) objArr7[0])[0];
            String[] strArr16 = (String[]) objArr7[3];
            int[] iArr4 = {i111};
            int i113 = (~new Random().nextInt(1566879804)) | 264192704;
            int i114 = i110 + (-601362121) + (i113 * 495) + (((~i113) | 213140032) * 495);
            int i115 = i114 ^ (i114 << 13);
            int i116 = i115 ^ (i115 >>> 17);
            ((int[]) objArr[1])[0] = i116 ^ (i116 << 5);
            Object[] objArr83 = {new int[]{i112}, new int[1], iArr4, strArr16};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault40 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault40 == null) {
                char windowTouchSlop3 = (char) ((ViewConfiguration.getWindowTouchSlop() >> 8) + 31533);
                int defaultSize2 = View.getDefaultSize(0, 0) + 921;
                int iMakeMeasureSpec = 28 - View.MeasureSpec.makeMeasureSpec(0, 0);
                short s35 = (short) ($$b + 1);
                byte b8 = $$a[7];
                Object[] objArr84 = new Object[1];
                c(s35, b8, (byte) (b8 | 14), objArr84);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault40 = initSession.b(windowTouchSlop3, defaultSize2, iMakeMeasureSpec, -1048449946, false, (String) objArr84[0], null);
            }
            if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault40).getLong(null) != -1) {
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault41 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault41 == null) {
                    char c9 = (char) (31533 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)));
                    int i117 = (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 920;
                    int longPressTimeout3 = 28 - (ViewConfiguration.getLongPressTimeout() >> 16);
                    short s36 = (short) ($$b + 1);
                    Object[] objArr85 = new Object[1];
                    c(s36, (byte) (s36 & 189), $$a[7], objArr85);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault41 = initSession.b(c9, i117, longPressTimeout3, -1142834547, false, (String) objArr85[0], null);
                }
                Object[] objArr86 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault41).get(null);
                objArr8 = new Object[]{new int[1], new int[]{((int[]) objArr86[1])[0]}, (Object[]) objArr86[2], new int[]{((int[]) objArr86[3])[0]}, (String[]) objArr86[4]};
                int iIdentityHashCode11 = System.identityHashCode(this);
                int i118 = ~iIdentityHashCode11;
                int i119 = (-1128424400) + (((~((-1603456198) | i118)) | 170623446) * 226) + (((~(i118 | (-1435520002))) | (~((-170623447) | iIdentityHashCode11)) | 2687250) * (-113)) + ((~(iIdentityHashCode11 | (-1603456198))) * 113) + 2120963890;
                int i120 = (i119 << 13) ^ i119;
                int i121 = i120 ^ (i120 >>> 17);
                ((int[]) objArr8[0])[0] = i121 ^ (i121 << 5);
                objArr83 = objArr83;
            } else {
                Object[] objArr87 = {context2 != null ? ((context2 instanceof ContextWrapper) && ((ContextWrapper) context2).getBaseContext() == null) ? null : context.getApplicationContext() : context2, Integer.valueOf(((Integer) Class.forName(str5).getMethod(str6, Object.class).invoke(null, this)).intValue()), 0, 2120963890};
                byte[] bArr12 = $$d;
                Object[] objArr88 = new Object[1];
                d((short) 262, bArr12[189], bArr12[91], objArr88);
                Class<?> cls4 = Class.forName((String) objArr88[0]);
                Object[] objArr89 = new Object[1];
                d((short) ($$e & 992), (byte) (bArr12[116] + 1), bArr12[97], objArr89);
                Object[] objArr90 = (Object[]) cls4.getMethod((String) objArr89[0], Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr87);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault42 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault42 == null) {
                    char c10 = (char) (31533 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)));
                    int iAlpha = 921 - Color.alpha(0);
                    int i122 = (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 27;
                    short s37 = (short) ($$b + 1);
                    Object[] objArr91 = new Object[1];
                    c(s37, (byte) (s37 & 189), $$a[7], objArr91);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault42 = initSession.b(c10, iAlpha, i122, -1142834547, false, (String) objArr91[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault42).set(null, objArr90);
                try {
                    long jLongValue9 = ((Long) Class.forName(str3).getDeclaredMethod(str, new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf13 = Long.valueOf(jLongValue9);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault43 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(889369593);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault43 == null) {
                        char gidForName = (char) (31532 - Process.getGidForName(""));
                        int i123 = (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 920;
                        int size3 = View.MeasureSpec.getSize(0) + 28;
                        short s38 = (short) ($$b >>> 1);
                        Object[] objArr92 = new Object[1];
                        c(s38, (byte) (s38 + 1), $$a[7], objArr92);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault43 = initSession.b(gidForName, i123, size3, -778300370, false, (String) objArr92[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault43).set(null, lValueOf13);
                    Long lValueOf14 = Long.valueOf(jLongValue9 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault44 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault44 == null) {
                        char cLastIndexOf = (char) (31532 - TextUtils.lastIndexOf("", '0'));
                        int iCombineMeasuredStates3 = 921 - View.combineMeasuredStates(0, 0);
                        int i124 = 28 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
                        short s39 = (short) ($$b + 1);
                        byte b9 = $$a[7];
                        Object[] objArr93 = new Object[1];
                        c(s39, b9, (byte) (b9 | 14), objArr93);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault44 = initSession.b(cLastIndexOf, iCombineMeasuredStates3, i124, -1048449946, false, (String) objArr93[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault44).set(null, lValueOf14);
                    objArr8 = objArr90;
                } catch (Exception unused7) {
                    throw new RuntimeException();
                }
            }
            int i125 = ((int[]) objArr8[1])[0];
            int i126 = ((int[]) objArr8[3])[0];
            if (i126 != i125) {
                ArrayList arrayList6 = new ArrayList();
                String[] strArr17 = (String[]) objArr8[4];
                if (strArr17 != null) {
                    for (String str13 : strArr17) {
                        arrayList6.add(str13);
                    }
                }
                throw new RuntimeException(String.valueOf(i126));
            }
            int i127 = ((int[]) objArr8[0])[0];
            Object[] objArr94 = {new int[1], new int[]{((int[]) objArr8[1])[0]}, (Object[]) objArr8[2], new int[]{((int[]) objArr8[3])[0]}, (String[]) objArr8[4]};
            int iIdentityHashCode12 = System.identityHashCode(this);
            int i128 = ~((-387818077) | iIdentityHashCode12);
            int i129 = (-569055625) + ((85787200 | i128) * (-280)) + ((i128 | (~((-1386261568) | iIdentityHashCode12))) * 140);
            int i130 = ~((-302030877) | iIdentityHashCode12);
            int i131 = ~iIdentityHashCode12;
            int i132 = i127 + i129 + (((~(i131 | (-1084230692))) | i130 | (~((-85787201) | i131))) * 140);
            int i133 = (i132 << 13) ^ i132;
            int i134 = i133 ^ (i133 >>> 17);
            ((int[]) objArr94[0])[0] = i134 ^ (i134 << 5);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault45 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2030658839);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault45 == null) {
                char pressedStateDuration3 = (char) (ViewConfiguration.getPressedStateDuration() >> 16);
                int maxKeyCode2 = 876 - (KeyEvent.getMaxKeyCode() >> 16);
                int scrollDefaultDelay5 = (ViewConfiguration.getScrollDefaultDelay() >> 16) + 10;
                short s40 = (short) ($$b + 1);
                Object[] objArr95 = new Object[1];
                c(s40, (byte) (s40 & 189), $$a[7], objArr95);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault45 = initSession.b(pressedStateDuration3, maxKeyCode2, scrollDefaultDelay5, -1650998592, false, (String) objArr95[0], null);
            }
            long j3 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault45).getLong(null);
            long jLongValue10 = ((Long) Class.forName(str3).getDeclaredMethod(str, new Class[0]).invoke(null, new Object[0])).longValue();
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault46 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1821222244);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault46 == null) {
                char cMyTid2 = (char) (Process.myTid() >> 22);
                int keyRepeatTimeout = (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 876;
                int maxKeyCode3 = 10 - (KeyEvent.getMaxKeyCode() >> 16);
                short s41 = (short) ($$b >>> 1);
                Object[] objArr96 = new Object[1];
                c(s41, (byte) (s41 + 1), $$a[7], objArr96);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault46 = initSession.b(cMyTid2, keyRepeatTimeout, maxKeyCode3, 2012020043, false, (String) objArr96[0], null);
            }
            if (j3 == ((jLongValue10 - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault46).getLong(null) << 52) >>> 52)) >> 12)) {
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault47 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1822145765);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault47 == null) {
                    char tapTimeout4 = (char) (ViewConfiguration.getTapTimeout() >> 16);
                    int iAxisFromString3 = 875 - MotionEvent.axisFromString("");
                    int packedPositionGroup = 10 - ExpandableListView.getPackedPositionGroup(0L);
                    byte[] bArr13 = $$a;
                    short s42 = bArr13[132];
                    Object[] objArr97 = new Object[1];
                    c(s42, (byte) (s42 & 52), bArr13[7], objArr97);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault47 = initSession.b(tapTimeout4, iAxisFromString3, packedPositionGroup, 2012931276, false, (String) objArr97[0], null);
                }
                Object[] objArr98 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault47).get(null);
                objArr9 = new Object[]{new int[]{((int[]) objArr98[0])[0]}, new int[1], new int[]{((int[]) objArr98[2])[0]}, (String[]) objArr98[3]};
                int iMaxMemory = (int) Runtime.getRuntime().maxMemory();
                int i135 = ((1322757248 + (((-44573194) | (~iMaxMemory)) * (-490))) + (((~(iMaxMemory | 156458292)) | (-201031486)) * 490)) - 1803426252;
                int i136 = (i135 << 13) ^ i135;
                int i137 = i136 ^ (i136 >>> 17);
                ((int[]) objArr9[1])[0] = i137 ^ (i137 << 5);
                str2 = str;
            } else {
                Context applicationContext4 = context2 != null ? ((context2 instanceof ContextWrapper) && ((ContextWrapper) context2).getBaseContext() == null) ? null : context.getApplicationContext() : context2;
                Object[] objArr99 = {applicationContext4, Integer.valueOf(((Integer) Class.forName(str5).getMethod(str6, Object.class).invoke(null, this)).intValue()), 0, 123869016};
                byte[] bArr14 = $$d;
                Object[] objArr100 = new Object[1];
                d((short) 172, bArr14[40], bArr14[29], objArr100);
                Class<?> cls5 = Class.forName((String) objArr100[0]);
                Object[] objArr101 = new Object[1];
                d((short) ($$e & 359), (byte) (-bArr14[197]), bArr14[97], objArr101);
                Object[] objArr102 = (Object[]) cls5.getMethod((String) objArr101[0], Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr99);
                if (applicationContext4 != null) {
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault48 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1822145765);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault48 == null) {
                        char capsMode = (char) TextUtils.getCapsMode("", 0, 0);
                        int i138 = 877 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1));
                        int mirror2 = ':' - AndroidCharacter.getMirror('0');
                        byte[] bArr15 = $$a;
                        short s43 = bArr15[132];
                        Object[] objArr103 = new Object[1];
                        c(s43, (byte) (s43 & 52), bArr15[7], objArr103);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault48 = initSession.b(capsMode, i138, mirror2, 2012931276, false, (String) objArr103[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault48).set(null, objArr102);
                    try {
                        str2 = str;
                        long jLongValue11 = ((Long) Class.forName(str3).getDeclaredMethod(str2, new Class[0]).invoke(null, new Object[0])).longValue();
                        Long lValueOf15 = Long.valueOf(jLongValue11);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault49 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1821222244);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault49 == null) {
                            char cNormalizeMetaState = (char) KeyEvent.normalizeMetaState(0);
                            int iBlue = 876 - Color.blue(0);
                            int i139 = 10 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1));
                            short s44 = (short) ($$b >>> 1);
                            Object[] objArr104 = new Object[1];
                            c(s44, (byte) (s44 + 1), $$a[7], objArr104);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault49 = initSession.b(cNormalizeMetaState, iBlue, i139, 2012020043, false, (String) objArr104[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault49).set(null, lValueOf15);
                        Long lValueOf16 = Long.valueOf(jLongValue11 >> 12);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault50 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2030658839);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault50 == null) {
                            char offsetAfter2 = (char) TextUtils.getOffsetAfter("", 0);
                            int edgeSlop2 = 876 - (ViewConfiguration.getEdgeSlop() >> 16);
                            int iNormalizeMetaState = 10 - KeyEvent.normalizeMetaState(0);
                            short s45 = (short) ($$b + 1);
                            Object[] objArr105 = new Object[1];
                            c(s45, (byte) (s45 & 189), $$a[7], objArr105);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault50 = initSession.b(offsetAfter2, edgeSlop2, iNormalizeMetaState, -1650998592, false, (String) objArr105[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault50).set(null, lValueOf16);
                    } catch (Exception unused8) {
                        throw new RuntimeException();
                    }
                } else {
                    str2 = str;
                    objArr102 = objArr102;
                }
                objArr9 = objArr102;
            }
            int i140 = ((int[]) objArr9[2])[0];
            int i141 = ((int[]) objArr9[0])[0];
            if (i141 == i140) {
                int i142 = b + 111;
                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i142 % 128;
                int i143 = i142 % 2;
                int i144 = ((int[]) objArr9[1])[0];
                objArr10 = new Object[]{new int[]{((int[]) objArr9[0])[0]}, new int[1], new int[]{((int[]) objArr9[2])[0]}, (String[]) objArr9[3]};
                int iIdentityHashCode13 = System.identityHashCode(this);
                int i145 = ~iIdentityHashCode13;
                int i146 = i144 + 2029882472 + (((-505508428) | i145) * (-369)) + (((~((-562990117) | i145)) | (-522679888)) * (-369)) + (((~(iIdentityHashCode13 | 562990116)) | (-1068498544) | (~(i145 | (-17171461)))) * 369);
                int i147 = i146 ^ (i146 << 13);
                int i148 = i147 ^ (i147 >>> 17);
                ((int[]) objArr10[1])[0] = i148 ^ (i148 << 5);
                i = 0;
            } else {
                int[] iArr5 = new int[i141];
                int i149 = i141 - 1;
                iArr5[i149] = 1;
                Toast.makeText((Context) null, iArr5[((i141 * i149) % 2) - 1], 1).show();
                int i150 = ((int[]) objArr9[1])[0];
                objArr10 = new Object[]{new int[]{((int[]) objArr9[0])[0]}, new int[1], new int[]{((int[]) objArr9[2])[0]}, (String[]) objArr9[3]};
                int iIdentityHashCode14 = System.identityHashCode(this);
                int i151 = (-308224120) + (((~((~iIdentityHashCode14) | 1006089187)) | (-1073740796)) * (-245));
                int i152 = ~(iIdentityHashCode14 | 1006089187);
                int i153 = i150 + i151 + (i152 * (-245)) + ((i152 | 1046399416) * 245);
                int i154 = (i153 << 13) ^ i153;
                int i155 = i154 ^ (i154 >>> 17);
                i = 0;
                ((int[]) objArr10[1])[0] = i155 ^ (i155 << 5);
            }
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault51 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1545400921);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault51 == null) {
                char cMyPid = (char) (Process.myPid() >> 22);
                int i156 = 876 - (CdmaCellLocation.convertQuartSecToDecDegrees(i) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(i) == 0.0d ? 0 : -1));
                int iMyPid2 = (Process.myPid() >> 22) + 10;
                short s46 = (short) DerHeader.TAG_CLASS_PRIVATE;
                byte[] bArr16 = $$a;
                Object[] objArr106 = new Object[1];
                c(s46, (byte) (-bArr16[9]), (byte) (-bArr16[205]), objArr106);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault51 = initSession.b(cMyPid, i156, iMyPid2, -1199417970, false, (String) objArr106[0], null);
            }
            long j4 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault51).getLong(null);
            long jLongValue12 = ((Long) Class.forName(str3).getDeclaredMethod(str2, new Class[0]).invoke(null, new Object[0])).longValue();
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault52 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-340665130);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault52 == null) {
                char defaultSize3 = (char) View.getDefaultSize(0, 0);
                int size4 = View.MeasureSpec.getSize(0) + 876;
                int i157 = (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 9;
                byte[] bArr17 = $$a;
                Object[] objArr107 = new Object[1];
                c((short) 202, bArr17[7], (byte) (-bArr17[33]), objArr107);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault52 = initSession.b(defaultSize3, size4, i157, 254769921, false, (String) objArr107[0], null);
            }
            if (j4 == ((jLongValue12 - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault52).getLong(null) << 52) >>> 52)) >> 12)) {
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault53 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1435299656);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault53 == null) {
                    char cResolveOpacity = (char) Drawable.resolveOpacity(0, 0);
                    int iGreen3 = Color.green(0) + 876;
                    int scrollBarFadeDuration4 = 10 - (ViewConfiguration.getScrollBarFadeDuration() >> 16);
                    byte[] bArr18 = $$a;
                    Object[] objArr108 = new Object[1];
                    c((short) 202, bArr18[129], (byte) (-bArr18[205]), objArr108);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault53 = initSession.b(cResolveOpacity, iGreen3, scrollBarFadeDuration4, 1324201839, false, (String) objArr108[0], null);
                }
                Object[] objArr109 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault53).get(null);
                objArr11 = new Object[]{new int[]{((int[]) objArr109[0])[0]}, new int[1], new int[]{((int[]) objArr109[2])[0]}, (String[]) objArr109[3]};
                int iIdentityHashCode15 = System.identityHashCode(this);
                int i158 = ~((-211944012) | iIdentityHashCode15);
                int i159 = (-2093373460) + ((136446018 | i158) * (-280)) + ((i158 | (~(171633782 | iIdentityHashCode15))) * 140);
                int i160 = ~((-75497994) | iIdentityHashCode15);
                int i161 = ~iIdentityHashCode15;
                int i162 = (i159 + (((~(i161 | 247131775)) | (i160 | (~((-136446019) | i161)))) * 140)) - 633460512;
                int i163 = (i162 << 13) ^ i162;
                int i164 = i163 ^ (i163 >>> 17);
                ((int[]) objArr11[1])[0] = i164 ^ (i164 << 5);
            } else {
                Object[] objArr110 = {Integer.valueOf(((Integer) Class.forName(str5).getMethod(str6, Object.class).invoke(null, this)).intValue()), -633460512};
                byte[] bArr19 = $$d;
                Object[] objArr111 = new Object[1];
                d(bArr19[189], bArr19[47], bArr19[29], objArr111);
                Class<?> cls6 = Class.forName((String) objArr111[0]);
                Object[] objArr112 = new Object[1];
                d((short) ($$e & 992), (byte) (bArr19[116] + 1), bArr19[97], objArr112);
                objArr11 = (Object[]) cls6.getMethod((String) objArr112[0], Integer.TYPE, Integer.TYPE).invoke(null, objArr110);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault54 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1435299656);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault54 == null) {
                    char gidForName2 = (char) ((-1) - Process.getGidForName(""));
                    int capsMode2 = TextUtils.getCapsMode("", 0, 0) + 876;
                    int bitsPerPixel = ImageFormat.getBitsPerPixel(0) + 11;
                    byte[] bArr20 = $$a;
                    Object[] objArr113 = new Object[1];
                    c((short) 202, bArr20[129], (byte) (-bArr20[205]), objArr113);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault54 = initSession.b(gidForName2, capsMode2, bitsPerPixel, 1324201839, false, (String) objArr113[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault54).set(null, objArr11);
                try {
                    long jLongValue13 = ((Long) Class.forName(str3).getDeclaredMethod(str2, new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf17 = Long.valueOf(jLongValue13);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault55 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-340665130);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault55 == null) {
                        char tapTimeout5 = (char) (ViewConfiguration.getTapTimeout() >> 16);
                        int iAxisFromString4 = MotionEvent.axisFromString("") + 877;
                        int gidForName3 = Process.getGidForName("") + 11;
                        byte[] bArr21 = $$a;
                        Object[] objArr114 = new Object[1];
                        c((short) 202, bArr21[7], (byte) (-bArr21[33]), objArr114);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault55 = initSession.b(tapTimeout5, iAxisFromString4, gidForName3, 254769921, false, (String) objArr114[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault55).set(null, lValueOf17);
                    Long lValueOf18 = Long.valueOf(jLongValue13 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault56 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1545400921);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault56 == null) {
                        char c11 = (char) ((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) - 1);
                        int iIndexOf8 = 876 - TextUtils.indexOf("", "", 0);
                        int jumpTapTimeout2 = 10 - (ViewConfiguration.getJumpTapTimeout() >> 16);
                        short s47 = (short) DerHeader.TAG_CLASS_PRIVATE;
                        byte[] bArr22 = $$a;
                        Object[] objArr115 = new Object[1];
                        c(s47, (byte) (-bArr22[9]), (byte) (-bArr22[205]), objArr115);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault56 = initSession.b(c11, iIndexOf8, jumpTapTimeout2, -1199417970, false, (String) objArr115[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault56).set(null, lValueOf18);
                } catch (Exception unused9) {
                    throw new RuntimeException();
                }
            }
            int i165 = ((int[]) objArr11[2])[0];
            int i166 = ((int[]) objArr11[0])[0];
            if (i166 != i165) {
                ArrayList arrayList7 = new ArrayList();
                String[] strArr18 = (String[]) objArr11[3];
                if (strArr18 != null) {
                    for (String str14 : strArr18) {
                        arrayList7.add(str14);
                    }
                }
                throw new RuntimeException(String.valueOf(i166));
            }
            int i167 = ((int[]) objArr11[1])[0];
            Object[] objArr116 = {new int[]{((int[]) objArr11[0])[0]}, new int[1], new int[]{((int[]) objArr11[2])[0]}, (String[]) objArr11[3]};
            int iIdentityHashCode16 = System.identityHashCode(this);
            int i168 = i167 + (-758182276) + (((~((~iIdentityHashCode16) | 405394336)) | 43001941) * 446) + (((~(iIdentityHashCode16 | 448396277)) | 402702624) * 446) + 1998996502;
            int i169 = (i168 << 13) ^ i168;
            int i170 = i169 ^ (i169 >>> 17);
            ((int[]) objArr116[1])[0] = i170 ^ (i170 << 5);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault57 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-342512172);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault57 == null) {
                char edgeSlop3 = (char) (ViewConfiguration.getEdgeSlop() >> 16);
                int pressedStateDuration4 = 876 - (ViewConfiguration.getPressedStateDuration() >> 16);
                int deadChar4 = KeyEvent.getDeadChar(0, 0) + 10;
                short s48 = (short) ($$b + 1);
                byte b10 = $$a[7];
                Object[] objArr117 = new Object[1];
                c(s48, b10, (byte) (b10 | 14), objArr117);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault57 = initSession.b(edgeSlop3, pressedStateDuration4, deadChar4, 252381699, false, (String) objArr117[0], null);
            }
            long j5 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault57).getLong(null);
            long jLongValue14 = ((Long) Class.forName(str3).getDeclaredMethod(str2, new Class[0]).invoke(null, new Object[0])).longValue();
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault58 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1823069286);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault58 == null) {
                char cLastIndexOf2 = (char) ((-1) - TextUtils.lastIndexOf("", '0', 0));
                int absoluteGravity4 = 876 - Gravity.getAbsoluteGravity(0, 0);
                int capsMode3 = TextUtils.getCapsMode("", 0, 0) + 10;
                Object[] objArr118 = new Object[1];
                c((short) 140, (byte) 52, $$a[7], objArr118);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault58 = initSession.b(cLastIndexOf2, absoluteGravity4, capsMode3, 2009631821, false, (String) objArr118[0], null);
            }
            if (j5 == ((jLongValue14 - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault58).getLong(null) << 52) >>> 52)) >> 12)) {
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault59 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-337894567);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault59 == null) {
                    char c12 = (char) (1 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)));
                    int scrollBarFadeDuration5 = (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 876;
                    int gidForName4 = Process.getGidForName("") + 11;
                    byte[] bArr23 = $$a;
                    Object[] objArr119 = new Object[1];
                    c((short) 209, bArr23[7], bArr23[10], objArr119);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault59 = initSession.b(c12, scrollBarFadeDuration5, gidForName4, 256017550, false, (String) objArr119[0], null);
                }
                Object[] objArr120 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault59).get(null);
                objArr12 = new Object[]{new int[]{((int[]) objArr120[0])[0]}, new int[1], new int[]{((int[]) objArr120[2])[0]}, (String[]) objArr120[3]};
                int iIdentityHashCode17 = System.identityHashCode(this);
                int i171 = 10414950 + (((~((~iIdentityHashCode17) | 654829328)) | (-795869174)) * (-245));
                int i172 = ~(iIdentityHashCode17 | 654829328);
                int i173 = ((i171 + (i172 * (-245))) + ((i172 | 695139557) * 245)) - 245301461;
                int i174 = (i173 << 13) ^ i173;
                int i175 = i174 ^ (i174 >>> 17);
                ((int[]) objArr12[1])[0] = i175 ^ (i175 << 5);
                context3 = context;
            } else {
                context3 = context;
                Context applicationContext5 = context3 != null ? ((context3 instanceof ContextWrapper) && ((ContextWrapper) context3).getBaseContext() == null) ? null : context.getApplicationContext() : context3;
                Object[] objArr121 = {applicationContext5, Integer.valueOf(((Integer) Class.forName(str5).getMethod(str6, Object.class).invoke(null, this)).intValue()), -245301461};
                byte[] bArr24 = $$d;
                Object[] objArr122 = new Object[1];
                d(bArr24[26], bArr24[608], bArr24[29], objArr122);
                Class<?> cls7 = Class.forName((String) objArr122[0]);
                Object[] objArr123 = new Object[1];
                d((short) 370, (byte) (bArr24[116] + 1), bArr24[97], objArr123);
                objArr12 = (Object[]) cls7.getMethod((String) objArr123[0], Context.class, Integer.TYPE, Integer.TYPE).invoke(null, objArr121);
                if (applicationContext5 != null) {
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault60 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-337894567);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault60 == null) {
                        char longPressTimeout4 = (char) (ViewConfiguration.getLongPressTimeout() >> 16);
                        int iMyTid3 = (Process.myTid() >> 22) + 876;
                        int i176 = 11 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1));
                        byte[] bArr25 = $$a;
                        Object[] objArr124 = new Object[1];
                        c((short) 209, bArr25[7], bArr25[10], objArr124);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault60 = initSession.b(longPressTimeout4, iMyTid3, i176, 256017550, false, (String) objArr124[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault60).set(null, objArr12);
                    try {
                        long jLongValue15 = ((Long) Class.forName(str3).getDeclaredMethod(str2, new Class[0]).invoke(null, new Object[0])).longValue();
                        Long lValueOf19 = Long.valueOf(jLongValue15);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault61 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1823069286);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault61 == null) {
                            char cResolveSizeAndState = (char) View.resolveSizeAndState(0, 0, 0);
                            int modifierMetaStateMask2 = 875 - ((byte) KeyEvent.getModifierMetaStateMask());
                            int iIndexOf9 = 10 - TextUtils.indexOf("", "", 0);
                            Object[] objArr125 = new Object[1];
                            c((short) 140, (byte) 52, $$a[7], objArr125);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault61 = initSession.b(cResolveSizeAndState, modifierMetaStateMask2, iIndexOf9, 2009631821, false, (String) objArr125[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault61).set(null, lValueOf19);
                        Long lValueOf20 = Long.valueOf(jLongValue15 >> 12);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault62 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-342512172);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault62 == null) {
                            char capsMode4 = (char) TextUtils.getCapsMode("", 0, 0);
                            int maxKeyCode4 = 876 - (KeyEvent.getMaxKeyCode() >> 16);
                            int scrollDefaultDelay6 = (ViewConfiguration.getScrollDefaultDelay() >> 16) + 10;
                            short s49 = (short) ($$b + 1);
                            byte b11 = $$a[7];
                            Object[] objArr126 = new Object[1];
                            c(s49, b11, (byte) (b11 | 14), objArr126);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault62 = initSession.b(capsMode4, maxKeyCode4, scrollDefaultDelay6, 252381699, false, (String) objArr126[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault62).set(null, lValueOf20);
                    } catch (Exception unused10) {
                        throw new RuntimeException();
                    }
                }
            }
            int i177 = ((int[]) objArr12[2])[0];
            int i178 = ((int[]) objArr12[0])[0];
            if (i178 != i177) {
                throw new RuntimeException(String.valueOf(i178));
            }
            int i179 = b + 119;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i179 % 128;
            int i180 = i179 % 2;
            int i181 = ((int[]) objArr12[1])[0];
            Object[] objArr127 = {new int[]{((int[]) objArr12[0])[0]}, new int[1], new int[]{((int[]) objArr12[2])[0]}, (String[]) objArr12[3]};
            int iMyUid = Process.myUid();
            int i182 = ~iMyUid;
            int i183 = (~(836977017 | i182)) | 67638790;
            int i184 = ~(iMyUid | (-27328562));
            int i185 = i181 + (((i183 | i184) * (-252)) - 94583876) + ((i184 | (~(i182 | 904615807))) * 252);
            int i186 = i185 ^ (i185 << 13);
            int i187 = i186 ^ (i186 >>> 17);
            ((int[]) objArr127[1])[0] = i187 ^ (i187 << 5);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault63 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(650054);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault63 == null) {
                char offsetAfter3 = (char) TextUtils.getOffsetAfter("", 0);
                int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0) + 651;
                int keyRepeatDelay3 = (ViewConfiguration.getKeyRepeatDelay() >> 16) + 44;
                Object[] objArr128 = new Object[1];
                c((short) 140, (byte) 52, $$a[7], objArr128);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault63 = initSession.b(offsetAfter3, iMakeMeasureSpec2, keyRepeatDelay3, -459846511, false, (String) objArr128[0], null);
            }
            long j6 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault63).getLong(null);
            long jLongValue16 = ((Long) Class.forName(str3).getDeclaredMethod(str2, new Class[0]).invoke(null, new Object[0])).longValue();
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault64 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(795782016);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault64 == null) {
                char cRed = (char) Color.red(0);
                int iNormalizeMetaState2 = 651 - KeyEvent.normalizeMetaState(0);
                int size5 = View.MeasureSpec.getSize(0) + 44;
                short s50 = (short) ($$b + 1);
                byte b12 = $$a[7];
                Object[] objArr129 = new Object[1];
                c(s50, b12, (byte) (b12 | 14), objArr129);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault64 = initSession.b(cRed, iNormalizeMetaState2, size5, -873460649, false, (String) objArr129[0], null);
            }
            if (j6 == ((jLongValue16 - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault64).getLong(null) << 52) >>> 52)) >> 12)) {
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault65 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1148961515);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault65 == null) {
                    char cMyTid3 = (char) (Process.myTid() >> 22);
                    int iResolveSize = 651 - View.resolveSize(0, 0);
                    int iResolveSize2 = View.resolveSize(0, 0) + 44;
                    short s51 = (short) ($$b + 1);
                    Object[] objArr130 = new Object[1];
                    c(s51, (byte) (s51 & 189), $$a[7], objArr130);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault65 = initSession.b(cMyTid3, iResolveSize, iResolveSize2, -1595579076, false, (String) objArr130[0], null);
                }
                Object[] objArr131 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault65).get(null);
                objArr13 = new Object[]{new int[]{i}, new String[0], new int[]{i}, new int[1]};
                int i188 = ((int[]) objArr131[2])[0];
                int i189 = ((int[]) objArr131[0])[0];
                int iIdentityHashCode18 = System.identityHashCode(this);
                int i190 = ~iIdentityHashCode18;
                int i191 = (((157817214 + (((~(787237147 | i190)) | 790667957) * (-90))) + (((~(787237147 | iIdentityHashCode18)) | 13388042) * (-45))) + ((((~(iIdentityHashCode18 | (-790667958))) | 787237147) | (~(i190 | 790667957))) * 45)) - 1702900224;
                int i192 = (i191 << 13) ^ i191;
                int i193 = i192 ^ (i192 >>> 17);
                ((int[]) objArr13[3])[0] = i193 ^ (i193 << 5);
                i2 = 0;
            } else {
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault66 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1686493381);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault66 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault66 = initSession.b((char) Drawable.resolveOpacity(0, 0), 1610 - Color.alpha(0), MotionEvent.axisFromString("") + 27, 2145681644, false, null, new Class[0]);
                }
                Object[] objArr132 = {null, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault66).newInstance(null), -1702900224, 0};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault67 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1625117732);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault67 == null) {
                    char maximumFlingVelocity3 = (char) (ViewConfiguration.getMaximumFlingVelocity() >> 16);
                    int tapTimeout6 = (ViewConfiguration.getTapTimeout() >> 16) + 651;
                    int i194 = (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 44;
                    short s52 = (short) ($$b + 1);
                    byte b13 = $$a[7];
                    Object[] objArr133 = new Object[1];
                    c(s52, b13, (byte) (b13 | 14), objArr133);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault67 = initSession.b(maximumFlingVelocity3, tapTimeout6, i194, 2075921419, false, (String) objArr133[0], new Class[]{(Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (TextUtils.indexOf((CharSequence) "", '0') + 1), (ViewConfiguration.getJumpTapTimeout() >> 16) + 695, 98 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1))), (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (63405 - TextUtils.indexOf((CharSequence) "", '0')), (KeyEvent.getMaxKeyCode() >> 16) + 793, 83 - KeyEvent.getDeadChar(0, 0)), Integer.TYPE, Integer.TYPE});
                }
                objArr13 = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault67).invoke(null, objArr132);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault68 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1148961515);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault68 == null) {
                    char c13 = (char) (1 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)));
                    int edgeSlop4 = (ViewConfiguration.getEdgeSlop() >> 16) + 651;
                    int i195 = (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 44;
                    short s53 = (short) ($$b + 1);
                    Object[] objArr134 = new Object[1];
                    c(s53, (byte) (s53 & 189), $$a[7], objArr134);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault68 = initSession.b(c13, edgeSlop4, i195, -1595579076, false, (String) objArr134[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault68).set(null, objArr13);
                try {
                    long jLongValue17 = ((Long) Class.forName(str3).getDeclaredMethod(str2, new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf21 = Long.valueOf(jLongValue17);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault69 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(795782016);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault69 == null) {
                        char cAlpha4 = (char) Color.alpha(0);
                        int iNormalizeMetaState3 = 651 - KeyEvent.normalizeMetaState(0);
                        int capsMode5 = TextUtils.getCapsMode("", 0, 0) + 44;
                        short s54 = (short) ($$b + 1);
                        byte b14 = $$a[7];
                        Object[] objArr135 = new Object[1];
                        c(s54, b14, (byte) (b14 | 14), objArr135);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault69 = initSession.b(cAlpha4, iNormalizeMetaState3, capsMode5, -873460649, false, (String) objArr135[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault69).set(null, lValueOf21);
                    Long lValueOf22 = Long.valueOf(jLongValue17 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault70 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(650054);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault70 == null) {
                        char cIndexOf3 = (char) (TextUtils.indexOf((CharSequence) "", '0') + 1);
                        int doubleTapTimeout2 = (ViewConfiguration.getDoubleTapTimeout() >> 16) + 651;
                        int iRed = 44 - Color.red(0);
                        Object[] objArr136 = new Object[1];
                        c((short) 140, (byte) 52, $$a[7], objArr136);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault70 = initSession.b(cIndexOf3, doubleTapTimeout2, iRed, -459846511, false, (String) objArr136[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault70).set(null, lValueOf22);
                    i2 = 0;
                } catch (Exception unused11) {
                    throw new RuntimeException();
                }
            }
            int i196 = ((int[]) objArr13[i2])[i2];
            int i197 = ((int[]) objArr13[2])[i2];
            if (i197 == i196) {
                objArr14 = new Object[4];
                int[] iArr6 = new int[1];
                objArr14[i2] = iArr6;
                int[] iArr7 = new int[1];
                objArr14[2] = iArr7;
                objArr14[3] = new int[1];
                int i198 = ((int[]) objArr13[3])[i2];
                int i199 = ((int[]) objArr13[2])[i2];
                int i200 = ((int[]) objArr13[i2])[i2];
                iArr7[i2] = i199;
                iArr6[i2] = i200;
                objArr14[1] = new String[i2];
                int startUptimeMillis = (int) Process.getStartUptimeMillis();
                int i201 = i198 + 1821354007 + (((~startUptimeMillis) | 4053950) * 1444) + (((~(startUptimeMillis | (-88531283))) | (~(91962092 | startUptimeMillis)) | 311570) * (-1444)) + 1368014674;
                int i202 = (i201 << 13) ^ i201;
                int i203 = i202 ^ (i202 >>> 17);
                c = 0;
                ((int[]) objArr14[3])[0] = i203 ^ (i203 << 5);
            } else {
                ArrayList arrayList8 = new ArrayList();
                String[] strArr19 = (String[]) objArr13[1];
                if (strArr19 != null) {
                    int i204 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 79;
                    b = i204 % 128;
                    int i205 = i204 % 2;
                    for (String str15 : strArr19) {
                        arrayList8.add(str15);
                    }
                }
                int[] iArr8 = new int[i197];
                int i206 = i197 - 1;
                iArr8[i206] = 1;
                Toast.makeText((Context) null, iArr8[((i197 * i206) % 2) - 1], 1).show();
                objArr14 = new Object[]{new int[]{i}, new String[0], new int[]{i}, new int[1]};
                int i207 = ((int[]) objArr13[3])[0];
                int i208 = ((int[]) objArr13[2])[0];
                int i209 = ((int[]) objArr13[0])[0];
                int iIdentityHashCode19 = System.identityHashCode(this);
                int i210 = i207 + (((1821354007 + (((~iIdentityHashCode19) | 13626094) * 1444)) + (((~(iIdentityHashCode19 | (-106809772))) | ((~(110240581 | iIdentityHashCode19)) | 5097642)) * (-1444))) - 1248105998);
                int i211 = (i210 << 13) ^ i210;
                int i212 = i211 ^ (i211 >>> 17);
                c = 0;
                ((int[]) objArr14[3])[0] = i212 ^ (i212 << 5);
            }
            if (intent != 0) {
                String action = intent.getAction();
                if (!"android.intent.action.AIRPLANE_MODE".equals(action)) {
                    int i213 = ((int[]) objArr2[2])[c];
                    int i214 = ((i213 * i213) - (~(-(1257926833 * i213)))) - 1;
                    int i215 = -(i213 * 1034023275);
                    int i216 = (i214 ^ i215) + ((i215 & i214) << 1);
                    int i217 = ((i216 | 1575902404) << 1) - (1575902404 ^ i216);
                    int i218 = i217 >> 17;
                    int i219 = (((-65535) ^ i218) + ((i218 & (-65535)) << 1)) / 32768;
                    int i220 = (i217 - (~(((i219 | 1) << 1) - (i219 ^ 1)))) - 1;
                    int i221 = i217 >> 24;
                    int i222 = ((i221 & (-511)) + (i221 | (-511))) / 256;
                    int i223 = -(i220 ^ (((i222 | 1) << 1) - (i222 ^ 1)));
                    int i224 = ((i223 | 3) << 1) - (i223 ^ 3);
                    int i225 = i224 >> 23;
                    int i226 = ((i225 ^ (-1023)) + ((i225 & (-1023)) << 1)) / 512;
                    int i227 = (i226 & 1) + (i226 | 1);
                    int i228 = 1578954 / (((-((i227 & 1) + (i227 | 1))) & i224) * 1306);
                    int i229 = ((int[]) objArr39[2])[0];
                    int i230 = i229 * i229;
                    int i231 = -(1772394252 * i229);
                    int i232 = ((i230 | i231) << 1) - (i230 ^ i231);
                    int i233 = -(i229 * (-1133239524));
                    int i234 = (i232 & i233) + (i233 | i232);
                    int i235 = ((i234 | (-742946416)) << 1) - ((-742946416) ^ i234);
                    int i236 = i235 >> 22;
                    int i237 = (((i236 | (-2047)) << 1) - (i236 ^ (-2047))) / 1024;
                    int i238 = (i237 ^ 1) + ((i237 & 1) << 1);
                    int i239 = ((i235 | i238) << 1) - (i238 ^ i235);
                    int i240 = i235 >> 19;
                    int i241 = ((i240 & (-16383)) + (i240 | (-16383))) / 8192;
                    int i242 = -(((i241 & 1) + (i241 | 1)) ^ i239);
                    int i243 = (i242 & 4) + (i242 | 4);
                    int i244 = i243 >> 20;
                    int i245 = (((i244 | (-8191)) << 1) - (i244 ^ (-8191))) / 4096;
                    int i246 = (i245 ^ 1) + ((i245 & 1) << 1);
                    int i247 = i228 + (3551540 / (((-(((i246 | 1) << 1) - (i246 ^ 1))) & i243) * 1195));
                    int i248 = ((int[]) objArr58[1])[0];
                    int i249 = ((i248 * i248) - (~(-(133683823 * i248)))) - 1;
                    int i250 = -(i248 * 1512610869);
                    int i251 = ((i249 | i250) << 1) - (i250 ^ i249);
                    int i252 = (i251 & (-604051900)) + ((-604051900) | i251);
                    int i253 = i252 >> 21;
                    int i254 = ((i253 ^ (-4095)) + ((i253 & (-4095)) << 1)) / 2048;
                    int i255 = ((i254 | 1) << 1) - (i254 ^ 1);
                    int i256 = ((i252 | i255) << 1) - (i255 ^ i252);
                    int i257 = i252 >> 27;
                    int i258 = (((i257 | (-63)) << 1) - (i257 ^ (-63))) / 32;
                    int i259 = -(((i258 ^ 1) + ((i258 & 1) << 1)) ^ i256);
                    int i260 = (i259 & 3) + (i259 | 3);
                    int i261 = i260 >> 23;
                    int i262 = (((i261 | (-1023)) << 1) - (i261 ^ (-1023))) / 512;
                    int i263 = (i262 & 1) + (i262 | 1);
                    if (!"6|13|1|9|android.net.conn.CONNECTIVITY_CHANGE".substring(i247 + ((-5358681) / (((-((i263 ^ 1) + ((i263 & 1) << 1))) & i260) * 1571))).equals(action)) {
                        return;
                    }
                    int i264 = ((int[]) objArr116[1])[0];
                    int i265 = i264 * i264;
                    int i266 = -(820645132 * i264);
                    int i267 = (((i265 ^ i266) + ((i265 & i266) << 1)) - (~(-(i264 * 1566624108)))) - (-1950561807);
                    int i268 = i267 >> 18;
                    int i269 = i267 >> 17;
                    int i270 = ((((-65535) | i269) << 1) - (i269 ^ (-65535))) / 32768;
                    int i271 = -(((i267 - (~(((((i268 | (-32767)) << 1) - (i268 ^ (-32767))) / 16384) + 1))) - 1) ^ ((i270 ^ 1) + ((i270 & 1) << 1)));
                    int i272 = (i271 & 1) + (i271 | 1);
                    int i273 = i272 >> 28;
                    int i274 = ((i273 ^ (-31)) + ((i273 & (-31)) << 1)) / 16;
                    int i275 = (i274 ^ 1) + ((i274 & 1) << 1);
                    ConnectivityManager connectivityManager = (ConnectivityManager) outputFormatToMuxerFormat.TuitionPaymentFragmentbindingInflater1(context3, "9/13/29/13/28/connectivity".substring(24038 / (((-((i275 & 1) + (i275 | 1))) & i272) * 1717)));
                    lowerQualityThan lowerqualitythan = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                    NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
                    Handler handler = lowerqualitythan.asInterface;
                    handler.sendMessage(handler.obtainMessage(9, activeNetworkInfo));
                    return;
                }
                int i276 = ((int[]) objArr83[1])[c];
                int i277 = i276 * i276;
                int i278 = -(1399534907 * i276);
                int i279 = (i277 ^ i278) + ((i277 & i278) << 1);
                int i280 = -(i276 * 1606195343);
                int i281 = (i279 & i280) + (i280 | i279);
                int i282 = (i281 & 893274329) + (893274329 | i281);
                int i283 = i282 >> 18;
                int i284 = ((i283 & (-32767)) + (i283 | (-32767))) / 16384;
                int i285 = (i284 & 1) + (i284 | 1);
                int i286 = (i282 ^ i285) + ((i285 & i282) << 1);
                int i287 = i282 >> 28;
                int i288 = ((i287 ^ (-31)) + ((i287 & (-31)) << 1)) / 16;
                int i289 = (-((((i288 | 1) << 1) - (i288 ^ 1)) ^ i286)) + 3;
                int i290 = i289 >> 16;
                int i291 = (((-131071) ^ i290) + ((i290 & (-131071)) << 1)) / 65536;
                int i292 = (i291 ^ 1) + ((i291 & 1) << 1);
                int i293 = 56028 / ((i289 & (-((i292 ^ 1) + ((i292 & 1) << 1)))) * 1334);
                int i294 = ((int[]) objArr127[1])[0];
                int i295 = i294 * i294;
                int i296 = -(1901824970 * i294);
                int i297 = (((i295 & i296) + (i295 | i296)) - (~(-(i294 * 735924734)))) - (-1172880143);
                int i298 = i297 >> 26;
                int i299 = (((i298 | ComposerKt.defaultsKey) << 1) - (i298 ^ ComposerKt.defaultsKey)) / 64;
                int i300 = (i297 - (~((i299 & 1) + (i299 | 1)))) - 1;
                int i301 = i297 >> 16;
                int i302 = -(i300 ^ (((((-131071) & i301) + (i301 | (-131071))) / 65536) + 1));
                int i303 = ((i302 | 6) << 1) - (i302 ^ 6);
                int i304 = i303 >> 23;
                int i305 = ((i304 ^ (-1023)) + ((i304 & (-1023)) << 1)) / 512;
                int i306 = i293 + (4750332 / (((-(((i305 & 1) + (i305 | 1)) + 1)) & i303) * 1574));
                int i307 = ((int[]) objArr14[3])[0];
                int i308 = i307 * i307;
                int i309 = -(2062970792 * i307);
                int i310 = (i308 & i309) + (i308 | i309);
                int i311 = -(i307 * (-825261210));
                int i312 = ((i310 | i311) << 1) - (i311 ^ i310);
                int i313 = (i312 & 2106844465) + (2106844465 | i312);
                int i314 = i313 >> 27;
                int i315 = ((i314 & (-63)) + (i314 | (-63))) / 32;
                int i316 = (i315 ^ 1) + ((i315 & 1) << 1);
                int i317 = (i313 ^ i316) + ((i316 & i313) << 1);
                int i318 = i313 >> 15;
                int i319 = ((((-262143) | i318) << 1) - (i318 ^ (-262143))) / 131072;
                int i320 = -((((i319 | 1) << 1) - (i319 ^ 1)) ^ i317);
                int i321 = ((i320 | 1) << 1) - (i320 ^ 1);
                int i322 = i321 >> 17;
                int i323 = ((((-65535) ^ i322) + ((i322 & (-65535)) << 1)) / 32768) + 1;
                if (intent.hasExtra("5/20/2/31/state".substring(i306 + ((-389883) / (((-((i323 ^ 1) + ((i323 & 1) << 1))) & i321) * 769))))) {
                    lowerQualityThan lowerqualitythan2 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                    int i324 = ((int[]) objArr47[3])[0];
                    int i325 = i324 * i324;
                    int i326 = -(1478773711 * i324);
                    int i327 = (((i325 ^ i326) + ((i325 & i326) << 1)) - (~(-(i324 * (-1230056155))))) - 1;
                    int i328 = ((i327 | (-2120386012)) << 1) - ((-2120386012) ^ i327);
                    int i329 = i328 >> 25;
                    int i330 = ((i329 & (-255)) + (i329 | (-255))) / 128;
                    int i331 = (i330 & 1) + (i330 | 1);
                    int i332 = ((i328 | i331) << 1) - (i331 ^ i328);
                    int i333 = i328 >> 18;
                    int i334 = (((i333 | (-32767)) << 1) - (i333 ^ (-32767))) / 16384;
                    int i335 = -(((i334 & 1) + (i334 | 1)) ^ i332);
                    int i336 = (i335 & 9) + (i335 | 9);
                    int i337 = i336 >> 26;
                    int i338 = (((i337 | ComposerKt.defaultsKey) << 1) - (i337 ^ ComposerKt.defaultsKey)) / 64;
                    int i339 = ((i338 | 1) << 1) - (i338 ^ 1);
                    int i340 = 11495925 / (((-(((i339 | 1) << 1) - (i339 ^ 1))) & i336) * 1575);
                    int i341 = ((int[]) objArr69[0])[0];
                    int i342 = ((i341 * i341) - (~(-(1955708309 * i341)))) - 1;
                    int i343 = -(i341 * (-938447519));
                    int i344 = (i342 & i343) + (i342 | i343);
                    int i345 = (i344 ^ 1839425817) + ((1839425817 & i344) << 1);
                    int i346 = ((i345 >> 20) - 8191) / 4096;
                    int i347 = (i346 ^ 1) + ((i346 & 1) << 1);
                    int i348 = (i345 & i347) + (i347 | i345);
                    int i349 = i345 >> 24;
                    int i350 = ((i349 ^ (-511)) + ((i349 & (-511)) << 1)) / 256;
                    int i351 = -(i348 ^ ((i350 & 1) + (i350 | 1)));
                    int i352 = (i351 & 1) + (i351 | 1);
                    int i353 = ((i352 >> 23) - 1023) / 512;
                    int i354 = i340 + (259370 / (((-(((i353 & 1) + (i353 | 1)) + 1)) & i352) * TypedValues.TransitionType.TYPE_FROM));
                    int i355 = ((int[]) objArr10[1])[0];
                    int i356 = i355 * i355;
                    int i357 = -(613228549 * i355);
                    int i358 = (((i356 & i357) + (i356 | i357)) - (~(-(i355 * 1980562101)))) - 1;
                    int i359 = ((i358 | (-56323127)) << 1) - ((-56323127) ^ i358);
                    int i360 = i359 >> 18;
                    int i361 = (((i360 | (-32767)) << 1) - (i360 ^ (-32767))) / 16384;
                    int i362 = (i361 ^ 1) + ((i361 & 1) << 1);
                    int i363 = (i359 ^ i362) + ((i362 & i359) << 1);
                    int i364 = i359 >> 27;
                    int i365 = (((i364 | (-63)) << 1) - (i364 ^ (-63))) / 32;
                    int i366 = (-((((i365 | 1) << 1) - (i365 ^ 1)) ^ i363)) + 8;
                    int i367 = i366 >> 17;
                    String strSubstring = "0/19/18/22/state".substring(i354 + ((-9584640) / (((-((((((-65535) | i367) << 1) - ((-65535) ^ i367)) / 32768) + 2)) & i366) * 1024)));
                    int i368 = ((int[]) objArr94[0])[0];
                    int i369 = i368 * i368;
                    int i370 = -(1410336351 * i368);
                    int i371 = ((i369 | i370) << 1) - (i369 ^ i370);
                    int i372 = -(i368 * (-1644768189));
                    int i373 = ((i371 | i372) << 1) - (i372 ^ i371);
                    int i374 = (i373 ^ 1351881633) + ((1351881633 & i373) << 1);
                    int i375 = i374 >> 22;
                    int i376 = ((i375 & (-2047)) + (i375 | (-2047))) / 1024;
                    int i377 = (i376 ^ 1) + ((i376 & 1) << 1);
                    int i378 = (i374 ^ i377) + ((i377 & i374) << 1);
                    int i379 = i374 >> 27;
                    int i380 = ((i379 ^ (-63)) + ((i379 & (-63)) << 1)) / 32;
                    int i381 = -((((i380 | 1) << 1) - (i380 ^ 1)) ^ i378);
                    int i382 = (i381 ^ 3) + ((i381 & 3) << 1);
                    int i383 = ((i382 >> 29) - 15) / 8;
                    int i384 = ((i383 | 1) << 1) - (i383 ^ 1);
                    boolean booleanExtra = intent.getBooleanExtra(strSubstring, 0 / (((-(((i384 | 1) << 1) - (i384 ^ 1))) & i382) * 1726));
                    Handler handler2 = lowerqualitythan2.asInterface;
                    handler2.sendMessage(handler2.obtainMessage(10, booleanExtra ? 1 : 0, 0));
                }
            }
        }

        static {
            byte[] bArr = new byte[621];
            System.arraycopy("{þ\u009b\u0098\rÿÂ5\u000fû\n\u0002ø\u000bºC\u0003ô\u000fó\n\u0007î\u0014ö\u0007\u0000Á7\u0006ÿ\u0003\fî\føÿ\u0012óË\u0017\"\u0010î\t\u0004Ù&ÿ\u0003\fî\fØ\u001f\u0012óÞ#\u0012ö\u000eô\f\u0006¬Pþöÿ\u0007ù\f¹\u0001F\u0006ÿþ\u0006ø\u0000ÁSôý\u0013×#ö\u0002\b¹A\u0002\u0002ü\u0015ø\t±\u0010\"õ\fö\u0007\u0000ã\u0012\u0019õù\n\u0007Ó-ð\u0007\u0007ù\n\u0007\u0000þöÿ\u0007ù\fþ\u0006ÿþ\u0006ø\u0000\u0013ôý\u0013×#ö\u0002\bù\u0002\u0002ü\u0015ø\tÀ\rÿÂ:\t\u0001ù\u0006úÊ4\u000e÷\u000fþûüË?þú\u0011ð\u0012øý\u000f¼Cýö\u0003\u0003\u000f¼<\u0006\u0007ò\u000eýô\fÃM\u0001óø\"õ\fö\u0007\u0000ã\u0012\u0019õù\n\u0007Ó-ð\u0007\u0007ù\n\u0007\u0000þöÿ\u0007ù\fþ\u0006ÿþ\u0006ø\u0000\u0013ôý\u0013×#ö\u0002\bù\u0002\u0002ü\u0015ø\t¾\u0007ÀEôý\u0003\u0012ö\u000eð\u0014·<\u0006\u0007ò\u000eýô\fÃ9\u0010úö\u0012ö\u0007\u0000\u0006¼\u00190úö\u0012ö\u0007\u0000\u0006²Dÿ\u0010à\u0013\u000f\u0001÷\u0007\u0000ç\u001cýû\n\u000e÷\u000fþûüËF\u0003ü\u0001\u0000\u0004\u0003»I¿û@ù\u0000\u0006ùÎ%\u0010\u0014ö\u0006úÝ-ÿ\u0004ò\u0014±\u000e\"õ\fö\u0007\u0000ã\u0012\u0019õù\n\u0007Ó-ð\u0007\u0007ù\n\u0007\u0000þöÿ\u0007ù\fþ\u0006ÿþ\u0006ø\u0000\u0013ôý\u0013×#ö\u0002\bù\u0002\u0002ü\u0015ø\t¿\rÿÂ:\t\u0001ù\u0006úÊ4\u000e÷\u000fþûüË@õ\u0014ò\u000eøù\fÃ6ÿ\u0012þ\u0007ÿó\bÃ\u0016\u001f\u0012þ\u0007ÿó\bá\u0016\u0019÷\u0007\u0000Ú\u0015\u000eô\u0007ÿ\u000e³ &\u0002\u0004ùà\u001f\fø\u0013øö\u0014ö\u0007\u0000\u0006\"õ\fö\u0007\u0000ã\u0012\u0019õù\n\u0007Ó-ð\u0007\u0007ù\n\u0007ï\b\u0006÷\u0006\u0006úã&ù\u0007ö\u0014ò\u000eÀ\rÿÂ5\u000fû\n\u0002ø\u000bº7þ\u0014î\u0002\b\u0006÷\u0006\u0006úÈ\u0014#\u0012ö\u000eô\f\u0006É3÷\u0003ì\u0010\u000eøþ\u0014×&ý×-þÿÙ)õ\t\u0004×(\u0006÷\u0006\u0006ú\rÿÂ4\u000e÷\u000fþûüËIúþ\u0001ú\u0015¶\u00143\u0007ööð\u0014\r\u0005ñ\u000f\u0002Þ%ñ\u0011ñÀ1\u0015\u000bþ\tó\u0006úÝ\u001f\u0003\u0006þ".getBytes("ISO-8859-1"), 0, bArr, 0, 621);
            $$d = bArr;
            $$e = 249;
            $$a = new byte[]{30, 17, -35, 104, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 55, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 54, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, 7, -18, -16, -1, -16, -16, -4, 19, -48, -3, -17, 0, -30, 4, -24, 54, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 56, -29, 31, -48, -17, 4, -24, 1, -6, -13, -13, -29, 38, -50, -16, -1, -12, -24};
            $$b = 102;
            b = 0;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 1;
            TuitionPaymentFragmentbindingInflater1 = -83722399;
        }

        private static String $$g(short s, short s2, short s3) {
            int i = s3 + 4;
            int i2 = s2 * 2;
            byte[] bArr = $$c;
            int i3 = s + 119;
            byte[] bArr2 = new byte[i2 + 1];
            int i4 = -1;
            if (bArr == null) {
                i3 += -i2;
            }
            while (true) {
                i4++;
                i++;
                bArr2[i4] = (byte) i3;
                if (i4 == i2) {
                    return new String(bArr2, 0);
                }
                i3 += -bArr[i];
            }
        }
    }

    final void TuitionPaymentFragmentspecialinlinedviewModeldefault1(findNearestHigherSupportedEncoderProfilesFor findnearesthighersupportedencoderprofilesfor, boolean z) {
        if (this.cancel.contains(findnearesthighersupportedencoderprofilesfor.asInterface)) {
            Map<Object, findNearestHigherSupportedEncoderProfilesFor> map = this.d;
            Reference reference = findnearesthighersupportedencoderprofilesfor.onTransact;
            map.put(reference != null ? reference.get() : null, findnearesthighersupportedencoderprofilesfor);
            if (findnearesthighersupportedencoderprofilesfor.f902a.d) {
                String strB = findnearesthighersupportedencoderprofilesfor.d.b();
                StringBuilder sb = new StringBuilder("because tag '");
                sb.append(findnearesthighersupportedencoderprofilesfor.asInterface);
                sb.append("' is paused");
                outputFormatToMuxerFormat.TuitionPaymentFragmentspecialinlinedviewModeldefault3("Dispatcher", "paused", strB, sb.toString());
                return;
            }
            return;
        }
        ExperimentalAudioApi experimentalAudioApi = this.g.get(findnearesthighersupportedencoderprofilesfor.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
        if (experimentalAudioApi != null) {
            experimentalAudioApi.TuitionPaymentFragmentspecialinlinedviewModeldefault1(findnearesthighersupportedencoderprofilesfor);
            return;
        }
        if (this.onTransact.isShutdown()) {
            if (findnearesthighersupportedencoderprofilesfor.f902a.d) {
                outputFormatToMuxerFormat.TuitionPaymentFragmentspecialinlinedviewModeldefault3("Dispatcher", "ignored", findnearesthighersupportedencoderprofilesfor.d.b(), "because shut down");
                return;
            }
            return;
        }
        ExperimentalAudioApi experimentalAudioApiTuitionPaymentFragmentspecialinlinedviewModeldefault1 = ExperimentalAudioApi.TuitionPaymentFragmentspecialinlinedviewModeldefault1(findnearesthighersupportedencoderprofilesfor.f902a, this, this.b, this.INotificationSideChannelStubProxy, findnearesthighersupportedencoderprofilesfor);
        experimentalAudioApiTuitionPaymentFragmentspecialinlinedviewModeldefault1.b = this.onTransact.submit(experimentalAudioApiTuitionPaymentFragmentspecialinlinedviewModeldefault1);
        this.g.put(findnearesthighersupportedencoderprofilesfor.TuitionPaymentFragmentspecialinlinedviewModeldefault1, experimentalAudioApiTuitionPaymentFragmentspecialinlinedviewModeldefault1);
        if (z) {
            Map<Object, findNearestHigherSupportedEncoderProfilesFor> map2 = this.asBinder;
            Reference reference2 = findnearesthighersupportedencoderprofilesfor.onTransact;
            map2.remove(reference2 != null ? reference2.get() : null);
        }
        if (findnearesthighersupportedencoderprofilesfor.f902a.d) {
            outputFormatToMuxerFormat.TuitionPaymentFragmentspecialinlinedviewModeldefault2("Dispatcher", "enqueued", findnearesthighersupportedencoderprofilesfor.d.b());
        }
    }

    final void TuitionPaymentFragmentspecialinlinedviewModeldefault2(ExperimentalAudioApi experimentalAudioApi) {
        if (experimentalAudioApi.b()) {
            return;
        }
        if (experimentalAudioApi.INotificationSideChannel != null) {
            experimentalAudioApi.INotificationSideChannel.prepareToDraw();
        }
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.add(experimentalAudioApi);
        if (this.asInterface.hasMessages(7)) {
            return;
        }
        this.asInterface.sendEmptyMessageDelayed(7, 200L);
    }

    static class TuitionPaymentFragmentspecialinlinedviewModeldefault1 extends Handler {
        private final lowerQualityThan b;

        TuitionPaymentFragmentspecialinlinedviewModeldefault1(Looper looper, lowerQualityThan lowerqualitythan) {
            super(looper);
            this.b = lowerqualitythan;
        }

        /* JADX WARN: Code duplicated, block: B:90:0x0196  */
        @Override // android.os.Handler
        public final void handleMessage(final Message message) {
            switch (message.what) {
                case 1:
                    this.b.TuitionPaymentFragmentspecialinlinedviewModeldefault1((findNearestHigherSupportedEncoderProfilesFor) message.obj, true);
                    break;
                case 2:
                    findNearestHigherSupportedEncoderProfilesFor findnearesthighersupportedencoderprofilesfor = (findNearestHigherSupportedEncoderProfilesFor) message.obj;
                    lowerQualityThan lowerqualitythan = this.b;
                    String str = findnearesthighersupportedencoderprofilesfor.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                    ExperimentalAudioApi experimentalAudioApi = lowerqualitythan.g.get(str);
                    if (experimentalAudioApi != null) {
                        experimentalAudioApi.TuitionPaymentFragmentspecialinlinedviewModeldefault2(findnearesthighersupportedencoderprofilesfor);
                        if (experimentalAudioApi.TuitionPaymentFragmentspecialinlinedviewModeldefault1()) {
                            lowerqualitythan.g.remove(str);
                            if (findnearesthighersupportedencoderprofilesfor.f902a.d) {
                                outputFormatToMuxerFormat.TuitionPaymentFragmentspecialinlinedviewModeldefault2("Dispatcher", "canceled", findnearesthighersupportedencoderprofilesfor.d.b());
                            }
                        }
                    }
                    if (lowerqualitythan.cancel.contains(findnearesthighersupportedencoderprofilesfor.asInterface)) {
                        Map<Object, findNearestHigherSupportedEncoderProfilesFor> map = lowerqualitythan.d;
                        Reference reference = findnearesthighersupportedencoderprofilesfor.onTransact;
                        map.remove(reference == null ? null : reference.get());
                        if (findnearesthighersupportedencoderprofilesfor.f902a.d) {
                            outputFormatToMuxerFormat.TuitionPaymentFragmentspecialinlinedviewModeldefault3("Dispatcher", "canceled", findnearesthighersupportedencoderprofilesfor.d.b(), "because paused request got canceled");
                        }
                    }
                    Map<Object, findNearestHigherSupportedEncoderProfilesFor> map2 = lowerqualitythan.asBinder;
                    Reference reference2 = findnearesthighersupportedencoderprofilesfor.onTransact;
                    findNearestHigherSupportedEncoderProfilesFor findnearesthighersupportedencoderprofilesforRemove = map2.remove(reference2 == null ? null : reference2.get());
                    if (findnearesthighersupportedencoderprofilesforRemove != null && findnearesthighersupportedencoderprofilesforRemove.f902a.d) {
                        outputFormatToMuxerFormat.TuitionPaymentFragmentspecialinlinedviewModeldefault3("Dispatcher", "canceled", findnearesthighersupportedencoderprofilesforRemove.d.b(), "from replaying");
                        break;
                    }
                    break;
                case 3:
                case 8:
                default:
                    Picasso.TuitionPaymentFragmentspecialinlinedviewModeldefault3.post(new Runnable() { // from class: lowerQualityThan.TuitionPaymentFragmentspecialinlinedviewModeldefault1.5
                        @Override // java.lang.Runnable
                        public final void run() {
                            StringBuilder sb = new StringBuilder("Unknown handler message received: ");
                            sb.append(message.what);
                            throw new AssertionError(sb.toString());
                        }
                    });
                    break;
                case 4:
                    ExperimentalAudioApi experimentalAudioApi2 = (ExperimentalAudioApi) message.obj;
                    lowerQualityThan lowerqualitythan2 = this.b;
                    if (MemoryPolicy.TuitionPaymentFragmentspecialinlinedviewModeldefault1(experimentalAudioApi2.asBinder)) {
                        lowerqualitythan2.b.TuitionPaymentFragmentspecialinlinedviewModeldefault3(experimentalAudioApi2.g, experimentalAudioApi2.INotificationSideChannel);
                    }
                    lowerqualitythan2.g.remove(experimentalAudioApi2.g);
                    lowerqualitythan2.TuitionPaymentFragmentspecialinlinedviewModeldefault2(experimentalAudioApi2);
                    if (experimentalAudioApi2.d.d) {
                        outputFormatToMuxerFormat.TuitionPaymentFragmentspecialinlinedviewModeldefault3("Dispatcher", "batched", outputFormatToMuxerFormat.TuitionPaymentFragmentspecialinlinedviewModeldefault2(experimentalAudioApi2), "for completion");
                    }
                    break;
                case 5:
                    ExperimentalAudioApi experimentalAudioApi3 = (ExperimentalAudioApi) message.obj;
                    lowerQualityThan lowerqualitythan3 = this.b;
                    if (!experimentalAudioApi3.b()) {
                        if (lowerqualitythan3.onTransact.isShutdown()) {
                            lowerqualitythan3.b(experimentalAudioApi3, false);
                        } else {
                            NetworkInfo activeNetworkInfo = lowerqualitythan3.INotificationSideChannel ? ((ConnectivityManager) outputFormatToMuxerFormat.TuitionPaymentFragmentbindingInflater1(lowerqualitythan3.TuitionPaymentFragmentspecialinlinedviewModeldefault1, "connectivity")).getActiveNetworkInfo() : null;
                            boolean z = lowerqualitythan3.TuitionPaymentFragmentbindingInflater1;
                            int i = experimentalAudioApi3.cancelAll;
                            if (i > 0) {
                                experimentalAudioApi3.cancelAll = i - 1;
                                if (experimentalAudioApi3.notify.b(activeNetworkInfo)) {
                                    if (experimentalAudioApi3.d.d) {
                                        outputFormatToMuxerFormat.TuitionPaymentFragmentspecialinlinedviewModeldefault2("Dispatcher", "retrying", outputFormatToMuxerFormat.TuitionPaymentFragmentspecialinlinedviewModeldefault2(experimentalAudioApi3));
                                    }
                                    if (experimentalAudioApi3.TuitionPaymentFragmentspecialinlinedviewModeldefault1 instanceof NetworkRequestHandler.ContentLengthException) {
                                        experimentalAudioApi3.f139a |= NetworkPolicy.NO_CACHE.index;
                                    }
                                    experimentalAudioApi3.b = lowerqualitythan3.onTransact.submit(experimentalAudioApi3);
                                }
                            }
                            boolean z2 = lowerqualitythan3.INotificationSideChannel && experimentalAudioApi3.notify.b();
                            lowerqualitythan3.b(experimentalAudioApi3, z2);
                            if (z2) {
                                findNearestHigherSupportedEncoderProfilesFor findnearesthighersupportedencoderprofilesfor2 = experimentalAudioApi3.TuitionPaymentFragmentbindingInflater1;
                                if (findnearesthighersupportedencoderprofilesfor2 != null) {
                                    lowerqualitythan3.TuitionPaymentFragmentbindingInflater1(findnearesthighersupportedencoderprofilesfor2);
                                }
                                List<findNearestHigherSupportedEncoderProfilesFor> list = experimentalAudioApi3.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                                if (list != null) {
                                    int size = list.size();
                                    for (int i2 = 0; i2 < size; i2++) {
                                        lowerqualitythan3.TuitionPaymentFragmentbindingInflater1(list.get(i2));
                                    }
                                }
                            }
                        }
                    }
                    break;
                case 6:
                    this.b.b((ExperimentalAudioApi) message.obj, false);
                    break;
                case 7:
                    lowerQualityThan lowerqualitythan4 = this.b;
                    ArrayList<ExperimentalAudioApi> arrayList = new ArrayList(lowerqualitythan4.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
                    lowerqualitythan4.TuitionPaymentFragmentspecialinlinedviewModeldefault2.clear();
                    Handler handler = lowerqualitythan4.f1273a;
                    handler.sendMessage(handler.obtainMessage(8, arrayList));
                    if (!arrayList.isEmpty() && ((ExperimentalAudioApi) arrayList.get(0)).d.d) {
                        StringBuilder sb = new StringBuilder();
                        for (ExperimentalAudioApi experimentalAudioApi4 : arrayList) {
                            if (sb.length() > 0) {
                                sb.append(", ");
                            }
                            sb.append(outputFormatToMuxerFormat.TuitionPaymentFragmentspecialinlinedviewModeldefault2(experimentalAudioApi4));
                        }
                        outputFormatToMuxerFormat.TuitionPaymentFragmentspecialinlinedviewModeldefault2("Dispatcher", "delivered", sb.toString());
                        break;
                    }
                    break;
                case 9:
                    NetworkInfo networkInfo = (NetworkInfo) message.obj;
                    lowerQualityThan lowerqualitythan5 = this.b;
                    ExecutorService executorService = lowerqualitythan5.onTransact;
                    if (executorService instanceof FileDescriptorOutputOptionsBuilder) {
                        FileDescriptorOutputOptionsBuilder fileDescriptorOutputOptionsBuilder = (FileDescriptorOutputOptionsBuilder) executorService;
                        if (networkInfo != null && networkInfo.isConnectedOrConnecting()) {
                            int type = networkInfo.getType();
                            if (type == 0) {
                                int subtype = networkInfo.getSubtype();
                                switch (subtype) {
                                    case 1:
                                    case 2:
                                        fileDescriptorOutputOptionsBuilder.setCorePoolSize(1);
                                        fileDescriptorOutputOptionsBuilder.setMaximumPoolSize(1);
                                        break;
                                    default:
                                        switch (subtype) {
                                            case 12:
                                                break;
                                            case 13:
                                            case 14:
                                            case 15:
                                                fileDescriptorOutputOptionsBuilder.setCorePoolSize(3);
                                                fileDescriptorOutputOptionsBuilder.setMaximumPoolSize(3);
                                                break;
                                            default:
                                                fileDescriptorOutputOptionsBuilder.setCorePoolSize(3);
                                                fileDescriptorOutputOptionsBuilder.setMaximumPoolSize(3);
                                                break;
                                        }
                                    case 3:
                                    case 4:
                                    case 5:
                                    case 6:
                                        fileDescriptorOutputOptionsBuilder.setCorePoolSize(2);
                                        fileDescriptorOutputOptionsBuilder.setMaximumPoolSize(2);
                                        break;
                                }
                            } else if (type == 1 || type == 6 || type == 9) {
                                fileDescriptorOutputOptionsBuilder.setCorePoolSize(4);
                                fileDescriptorOutputOptionsBuilder.setMaximumPoolSize(4);
                            } else {
                                fileDescriptorOutputOptionsBuilder.setCorePoolSize(3);
                                fileDescriptorOutputOptionsBuilder.setMaximumPoolSize(3);
                            }
                        } else {
                            fileDescriptorOutputOptionsBuilder.setCorePoolSize(3);
                            fileDescriptorOutputOptionsBuilder.setMaximumPoolSize(3);
                        }
                    }
                    if (networkInfo != null && networkInfo.isConnected() && !lowerqualitythan5.asBinder.isEmpty()) {
                        Iterator<findNearestHigherSupportedEncoderProfilesFor> it = lowerqualitythan5.asBinder.values().iterator();
                        while (it.hasNext()) {
                            findNearestHigherSupportedEncoderProfilesFor next = it.next();
                            it.remove();
                            if (next.f902a.d) {
                                outputFormatToMuxerFormat.TuitionPaymentFragmentspecialinlinedviewModeldefault2("Dispatcher", "replaying", next.d.b());
                            }
                            lowerqualitythan5.TuitionPaymentFragmentspecialinlinedviewModeldefault1(next, false);
                        }
                        break;
                    }
                    break;
                case 10:
                    this.b.TuitionPaymentFragmentbindingInflater1 = message.arg1 == 1;
                    break;
                case 11:
                    Object obj = message.obj;
                    lowerQualityThan lowerqualitythan6 = this.b;
                    if (lowerqualitythan6.cancel.add(obj)) {
                        Iterator<ExperimentalAudioApi> it2 = lowerqualitythan6.g.values().iterator();
                        while (it2.hasNext()) {
                            ExperimentalAudioApi next2 = it2.next();
                            boolean z3 = next2.d.d;
                            findNearestHigherSupportedEncoderProfilesFor findnearesthighersupportedencoderprofilesfor3 = next2.TuitionPaymentFragmentbindingInflater1;
                            List<findNearestHigherSupportedEncoderProfilesFor> list2 = next2.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                            boolean z4 = (list2 == null || list2.isEmpty()) ? false : true;
                            if (findnearesthighersupportedencoderprofilesfor3 != null || z4) {
                                if (findnearesthighersupportedencoderprofilesfor3 != null && findnearesthighersupportedencoderprofilesfor3.asInterface.equals(obj)) {
                                    next2.TuitionPaymentFragmentspecialinlinedviewModeldefault2(findnearesthighersupportedencoderprofilesfor3);
                                    Map<Object, findNearestHigherSupportedEncoderProfilesFor> map3 = lowerqualitythan6.d;
                                    Reference reference3 = findnearesthighersupportedencoderprofilesfor3.onTransact;
                                    map3.put(reference3 == null ? null : reference3.get(), findnearesthighersupportedencoderprofilesfor3);
                                    if (z3) {
                                        String strB = findnearesthighersupportedencoderprofilesfor3.d.b();
                                        StringBuilder sb2 = new StringBuilder("because tag '");
                                        sb2.append(obj);
                                        sb2.append("' was paused");
                                        outputFormatToMuxerFormat.TuitionPaymentFragmentspecialinlinedviewModeldefault3("Dispatcher", "paused", strB, sb2.toString());
                                    }
                                }
                                if (z4) {
                                    for (int size2 = list2.size() - 1; size2 >= 0; size2--) {
                                        findNearestHigherSupportedEncoderProfilesFor findnearesthighersupportedencoderprofilesfor4 = list2.get(size2);
                                        if (findnearesthighersupportedencoderprofilesfor4.asInterface.equals(obj)) {
                                            next2.TuitionPaymentFragmentspecialinlinedviewModeldefault2(findnearesthighersupportedencoderprofilesfor4);
                                            Map<Object, findNearestHigherSupportedEncoderProfilesFor> map4 = lowerqualitythan6.d;
                                            Reference reference4 = findnearesthighersupportedencoderprofilesfor4.onTransact;
                                            map4.put(reference4 == null ? null : reference4.get(), findnearesthighersupportedencoderprofilesfor4);
                                            if (z3) {
                                                String strB2 = findnearesthighersupportedencoderprofilesfor4.d.b();
                                                StringBuilder sb3 = new StringBuilder("because tag '");
                                                sb3.append(obj);
                                                sb3.append("' was paused");
                                                outputFormatToMuxerFormat.TuitionPaymentFragmentspecialinlinedviewModeldefault3("Dispatcher", "paused", strB2, sb3.toString());
                                            }
                                        }
                                    }
                                }
                                if (next2.TuitionPaymentFragmentspecialinlinedviewModeldefault1()) {
                                    it2.remove();
                                    if (z3) {
                                        outputFormatToMuxerFormat.TuitionPaymentFragmentspecialinlinedviewModeldefault3("Dispatcher", "canceled", outputFormatToMuxerFormat.TuitionPaymentFragmentspecialinlinedviewModeldefault2(next2), "all actions paused");
                                    }
                                }
                            }
                        }
                    }
                    break;
                case 12:
                    Object obj2 = message.obj;
                    lowerQualityThan lowerqualitythan7 = this.b;
                    if (lowerqualitythan7.cancel.remove(obj2)) {
                        Iterator<findNearestHigherSupportedEncoderProfilesFor> it3 = lowerqualitythan7.d.values().iterator();
                        ArrayList arrayList2 = null;
                        while (it3.hasNext()) {
                            findNearestHigherSupportedEncoderProfilesFor next3 = it3.next();
                            if (next3.asInterface.equals(obj2)) {
                                if (arrayList2 == null) {
                                    arrayList2 = new ArrayList();
                                }
                                arrayList2.add(next3);
                                it3.remove();
                            }
                        }
                        if (arrayList2 != null) {
                            Handler handler2 = lowerqualitythan7.f1273a;
                            handler2.sendMessage(handler2.obtainMessage(13, arrayList2));
                        }
                    }
                    break;
            }
        }
    }

    static class TuitionPaymentFragmentspecialinlinedviewModeldefault3 extends HandlerThread {
        TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
            super("Picasso-Dispatcher", 10);
        }
    }

    final void TuitionPaymentFragmentbindingInflater1(findNearestHigherSupportedEncoderProfilesFor findnearesthighersupportedencoderprofilesfor) {
        Reference reference = findnearesthighersupportedencoderprofilesfor.onTransact;
        Object obj = reference == null ? null : reference.get();
        if (obj != null) {
            findnearesthighersupportedencoderprofilesfor.cancel = true;
            this.asBinder.put(obj, findnearesthighersupportedencoderprofilesfor);
        }
    }

    final void b(ExperimentalAudioApi experimentalAudioApi, boolean z) {
        if (experimentalAudioApi.d.d) {
            outputFormatToMuxerFormat.TuitionPaymentFragmentspecialinlinedviewModeldefault3("Dispatcher", "batched", outputFormatToMuxerFormat.TuitionPaymentFragmentspecialinlinedviewModeldefault2(experimentalAudioApi), "for error".concat(z ? " (will replay)" : ""));
        }
        this.g.remove(experimentalAudioApi.g);
        TuitionPaymentFragmentspecialinlinedviewModeldefault2(experimentalAudioApi);
    }
}
