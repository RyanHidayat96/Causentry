package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Handler;
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
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.view.InputDeviceCompat;
import androidx.work.PeriodicWorkRequest;
import com.bpjstku.data.promo.model.response.ProvinceItem;
import com.google.android.material.R;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Random;
import kotlin.text.Typography;
import okhttp3.tls.internal.der.DerHeader;

/* JADX INFO: loaded from: classes6.dex */
public final class ForwardingCameraInfo {
    public final Context TuitionPaymentFragmentbindingInflater1;
    public Runnable TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    public boolean b;
    public boolean asInterface = false;
    public final BroadcastReceiver TuitionPaymentFragmentspecialinlinedviewModeldefault2 = new TuitionPaymentFragmentspecialinlinedviewModeldefault2(this, 0);
    public Handler TuitionPaymentFragmentspecialinlinedviewModeldefault1 = new Handler();

    public ForwardingCameraInfo(Context context, Runnable runnable) {
        this.TuitionPaymentFragmentbindingInflater1 = context;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = runnable;
    }

    final class TuitionPaymentFragmentspecialinlinedviewModeldefault2 extends BroadcastReceiver {
        private static final byte[] $$a;
        private static final int $$b;
        private static final byte[] $$d;
        private static final int $$e;
        private static long TuitionPaymentFragmentbindingInflater1;
        private static int TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        private static char TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        private static int TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        private static int asBinder;
        private static final byte[] $$c = {106, -22, 107, 95};
        private static final int $$f = 215;
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
        private static void c(short r6, short r7, short r8, java.lang.Object[] r9) {
            /*
                int r8 = r8 + 4
                int r7 = 103 - r7
                int r6 = 53 - r6
                byte[] r0 = ForwardingCameraInfo.TuitionPaymentFragmentspecialinlinedviewModeldefault2.$$a
                byte[] r1 = new byte[r6]
                r2 = 0
                if (r0 != 0) goto L10
                r3 = r6
                r5 = r2
                goto L24
            L10:
                r3 = r2
            L11:
                byte r4 = (byte) r7
                int r5 = r3 + 1
                r1[r3] = r4
                int r8 = r8 + 1
                if (r5 != r6) goto L22
                java.lang.String r6 = new java.lang.String
                r6.<init>(r1, r2)
                r9[r2] = r6
                return
            L22:
                r3 = r0[r8]
            L24:
                int r7 = r7 + r3
                int r7 = r7 + (-11)
                r3 = r5
                goto L11
            */
            throw new UnsupportedOperationException("Method not decompiled: ForwardingCameraInfo.TuitionPaymentFragmentspecialinlinedviewModeldefault2.c(short, short, short, java.lang.Object[]):void");
        }

        /* JADX WARN: Code duplicated, block: B:10:0x0023  */
        /* JADX WARN: Code duplicated, block: B:8:0x001b  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x0029). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0023
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        private static void d(int r7, short r8, byte r9, java.lang.Object[] r10) {
            /*
                int r7 = r7 + 1
                int r9 = r9 + 84
                int r8 = 476 - r8
                byte[] r0 = ForwardingCameraInfo.TuitionPaymentFragmentspecialinlinedviewModeldefault2.$$d
                byte[] r1 = new byte[r7]
                r2 = 0
                if (r0 != 0) goto L11
                r3 = r7
                r9 = r8
                r4 = r2
                goto L29
            L11:
                r3 = r2
            L12:
                int r4 = r3 + 1
                byte r5 = (byte) r9
                int r8 = r8 + 1
                r1[r3] = r5
                if (r4 != r7) goto L23
                java.lang.String r7 = new java.lang.String
                r7.<init>(r1, r2)
                r10[r2] = r7
                return
            L23:
                r3 = r0[r8]
                r6 = r9
                r9 = r8
                r8 = r3
                r3 = r6
            L29:
                int r8 = -r8
                int r3 = r3 + r8
                int r8 = r3 + (-2)
                r3 = r4
                r6 = r9
                r9 = r8
                r8 = r6
                goto L12
            */
            throw new UnsupportedOperationException("Method not decompiled: ForwardingCameraInfo.TuitionPaymentFragmentspecialinlinedviewModeldefault2.d(int, short, byte, java.lang.Object[]):void");
        }

        private TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        }

        /* synthetic */ TuitionPaymentFragmentspecialinlinedviewModeldefault2(ForwardingCameraInfo forwardingCameraInfo, byte b) {
            this();
        }

        private static void a(char[] cArr, char[] cArr2, char c, int i, char[] cArr3, Object[] objArr) throws Throwable {
            int i2;
            int i3 = 2;
            int i4 = 2 % 2;
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
                int i5 = $10 + 123;
                $11 = i5 % 128;
                int i6 = i5 % i3;
                try {
                    Object[] objArr2 = {sessionProcessor};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1033601528);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        byte b = (byte) (-1);
                        byte b2 = (byte) (b + 1);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (8328 - ExpandableListView.getPackedPositionType(0L)), 1235 - (ViewConfiguration.getScrollDefaultDelay() >> 16), (ViewConfiguration.getScrollDefaultDelay() >> 16) + 35, -653973969, false, $$g(b, b2, b2), new Class[]{Object.class});
                    }
                    int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).intValue();
                    Object[] objArr3 = {sessionProcessor};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1120586870);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                        byte b3 = (byte) (-1);
                        byte b4 = (byte) (b3 + 3);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) TextUtils.getTrimmedLength(""), 2764 - KeyEvent.keyCodeFromString(""), ExpandableListView.getPackedPositionType(0L) + 14, 1504416861, false, $$g(b3, b4, (byte) (b4 - 2)), new Class[]{Object.class});
                    }
                    int iIntValue2 = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).intValue();
                    Object[] objArr4 = {sessionProcessor, Integer.valueOf(cArr4[sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2 % 4] * 32718), Integer.valueOf(cArr5[iIntValue])};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(811618268);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (43326 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))), (ViewConfiguration.getFadingEdgeLength() >> 16) + 253, (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 21, -721491957, false, "j", new Class[]{Object.class, Integer.TYPE, Integer.TYPE});
                    }
                    ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
                    Object[] objArr5 = {Integer.valueOf(cArr4[iIntValue2] * 32718), Integer.valueOf(cArr5[iIntValue])};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1821841887);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        char defaultSize = (char) (View.getDefaultSize(0, 0) + 65200);
                        int i7 = 2892 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1));
                        int iIndexOf = TextUtils.indexOf("", "") + 17;
                        byte b5 = (byte) (-1);
                        byte b6 = (byte) (-b5);
                        String str$$g = $$g(b5, b6, (byte) (b6 - 1));
                        i2 = 2;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(defaultSize, i7, iIndexOf, 2012627446, false, str$$g, new Class[]{Integer.TYPE, Integer.TYPE});
                    } else {
                        i2 = 2;
                    }
                    cArr5[iIntValue2] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).charValue();
                    cArr4[iIntValue2] = sessionProcessor.b;
                    cArr6[sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2] = (char) (((((long) (cArr4[iIntValue2] ^ cArr3[sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2])) ^ (TuitionPaymentFragmentbindingInflater1 ^ (-6377398940819159759L))) ^ ((long) ((int) (((long) TuitionPaymentFragmentspecialinlinedviewModeldefault1) ^ (-6377398940819159759L))))) ^ ((long) ((char) (((long) TuitionPaymentFragmentspecialinlinedviewModeldefault2) ^ (-6377398940819159759L)))));
                    sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2++;
                    int i8 = $11 + 87;
                    $10 = i8 % 128;
                    int i9 = i8 % 2;
                    i3 = i2;
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

        /* JADX WARN: Code duplicated, block: B:22:0x026c  */
        /* JADX WARN: Code duplicated, block: B:261:0x1c32  */
        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) throws Throwable {
            Context applicationContext;
            Object[] objArr;
            Object[] objArr2;
            Context applicationContext2;
            String str;
            Object[] objArr3;
            Object[] objArr4;
            int i;
            String str2;
            Object[] objArr5;
            Object[] objArr6;
            Object[] objArr7;
            Context applicationContext3;
            Context applicationContext4;
            Object[] objArr8;
            Object[] objArr9;
            Object[] objArr10;
            Object[] objArr11;
            Object[] objArr12;
            int i2 = 2 % 2;
            Object[] objArr13 = new Object[1];
            a(new char[]{0, 0, 0, 0}, new char[]{13049, 'k', 35470, 5815}, (char) TextUtils.indexOf("", ""), TextUtils.getOffsetAfter("", 0), new char[]{16381, 60804, 54730, 47843, 51423, 35491, 46546, 29044, 13912, 36786, 24114, 38678, 24736, 46145, 44474, 42536, 19514, 26724, 20696, 39031, 5691, 25071}, objArr13);
            String str3 = (String) objArr13[0];
            Object[] objArr14 = new Object[1];
            a(new char[]{0, 0, 0, 0}, new char[]{59048, 29825, 19062, 60248}, (char) ((ViewConfiguration.getTouchSlop() >> 8) + 22602), TextUtils.indexOf("", "", 0, 0) + 1987346918, new char[]{551, 62807, 25153, 15083, 53803, 35582, 61660, 49159, 50847, 57236, 28832, 35866, 63629, 15994, 12830}, objArr14);
            String str4 = (String) objArr14[0];
            Object[] objArr15 = new Object[1];
            a(new char[]{0, 0, 0, 0}, new char[]{55476, 62744, 29248, 53038}, (char) (11889 - TextUtils.lastIndexOf("", '0', 0, 0)), MotionEvent.axisFromString("") + 1, new char[]{54177, 38966, 63623, 28441, 33843, 49206, 21090, 14521, 17980, 14806, 37374, 48982, 16639, 18661, 21287, 7298}, objArr15);
            String str5 = (String) objArr15[0];
            Object[] objArr16 = new Object[1];
            a(new char[]{0, 0, 0, 0}, new char[]{37547, 44102, 62947, 29475}, (char) (ImageFormat.getBitsPerPixel(0) + 9206), (-1) - ((byte) KeyEvent.getModifierMetaStateMask()), new char[]{12053, 29432, 55249, 58805, 57317, 60631, 57672, 52881, 38613, 61068, 14245, 35344, 30471, 15839, 31759, 10584}, objArr16);
            String str6 = (String) objArr16[0];
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2030658839);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                char maximumFlingVelocity = (char) (ViewConfiguration.getMaximumFlingVelocity() >> 16);
                int modifierMetaStateMask = ((byte) KeyEvent.getModifierMetaStateMask()) + 877;
                int iIndexOf = 9 - TextUtils.indexOf((CharSequence) "", '0');
                byte[] bArr = $$a;
                Object[] objArr17 = new Object[1];
                c((byte) (bArr[27] - 1), bArr[91], bArr[5], objArr17);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(maximumFlingVelocity, modifierMetaStateMask, iIndexOf, -1650998592, false, (String) objArr17[0], null);
            }
            long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
            long jLongValue = ((Long) Class.forName(str3).getDeclaredMethod(str4, new Class[0]).invoke(null, new Object[0])).longValue();
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1821222244);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                char edgeSlop = (char) (ViewConfiguration.getEdgeSlop() >> 16);
                int doubleTapTimeout = (ViewConfiguration.getDoubleTapTimeout() >> 16) + 876;
                int i3 = (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 9;
                byte[] bArr2 = $$a;
                Object[] objArr18 = new Object[1];
                c(bArr2[7], bArr2[91], (short) (bArr2[12] + 1), objArr18);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(edgeSlop, doubleTapTimeout, i3, 2012020043, false, (String) objArr18[0], null);
            }
            if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1822145765);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    char c = (char) (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
                    int i4 = 877 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1));
                    int gidForName = 9 - Process.getGidForName("");
                    byte[] bArr3 = $$a;
                    Object[] objArr19 = new Object[1];
                    c(bArr3[7], bArr3[91], (short) 88, objArr19);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(c, i4, gidForName, 2012931276, false, (String) objArr19[0], null);
                }
                Object[] objArr20 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
                objArr = new Object[]{new int[]{((int[]) objArr20[0])[0]}, new int[1], new int[]{((int[]) objArr20[2])[0]}, (String[]) objArr20[3]};
                int iUptimeMillis = (int) SystemClock.uptimeMillis();
                int i5 = ~iUptimeMillis;
                int i6 = ((((~(771452917 | i5)) | (~((-27339537) | iUptimeMillis))) * 988) - 1628534352) + (((~(iUptimeMillis | 703803152)) | 67649765 | (~(i5 | (-27339537)))) * 988) + 1559602789;
                int i7 = (i6 << 13) ^ i6;
                int i8 = i7 ^ (i7 >>> 17);
                ((int[]) objArr[1])[0] = i8 ^ (i8 << 5);
            } else {
                if (context == null) {
                    applicationContext = context;
                } else if (context instanceof ContextWrapper) {
                    int i9 = asBinder + 71;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i9 % 128;
                    int i10 = i9 % 2;
                    if (((ContextWrapper) context).getBaseContext() != null) {
                        applicationContext = context.getApplicationContext();
                    } else {
                        applicationContext = null;
                    }
                } else {
                    applicationContext = context.getApplicationContext();
                }
                try {
                    Object[] objArr21 = {applicationContext, Integer.valueOf(((Integer) Class.forName(str5).getMethod(str6, Object.class).invoke(null, this)).intValue()), 0, 1559602789};
                    byte[] bArr4 = $$d;
                    Object[] objArr22 = new Object[1];
                    d((byte) (bArr4[39] + 1), (short) 473, bArr4[414], objArr22);
                    Class<?> cls = Class.forName((String) objArr22[0]);
                    byte b = bArr4[91];
                    Object[] objArr23 = new Object[1];
                    d(b, (short) (b | 392), bArr4[4], objArr23);
                    Object[] objArr24 = (Object[]) cls.getMethod((String) objArr23[0], Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr21);
                    if (applicationContext != null) {
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1822145765);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                            char cIndexOf = (char) ((-1) - TextUtils.indexOf((CharSequence) "", '0', 0, 0));
                            int longPressTimeout = 876 - (ViewConfiguration.getLongPressTimeout() >> 16);
                            int scrollBarFadeDuration = (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 10;
                            byte[] bArr5 = $$a;
                            Object[] objArr25 = new Object[1];
                            c(bArr5[7], bArr5[91], (short) 88, objArr25);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(cIndexOf, longPressTimeout, scrollBarFadeDuration, 2012931276, false, (String) objArr25[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr24);
                        try {
                            long jLongValue2 = ((Long) Class.forName(str3).getDeclaredMethod(str4, new Class[0]).invoke(null, new Object[0])).longValue();
                            Long lValueOf = Long.valueOf(jLongValue2);
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1821222244);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                                char cResolveSizeAndState = (char) View.resolveSizeAndState(0, 0, 0);
                                int i11 = 877 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1));
                                int i12 = 11 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1));
                                byte[] bArr6 = $$a;
                                Object[] objArr26 = new Object[1];
                                c(bArr6[7], bArr6[91], (short) (bArr6[12] + 1), objArr26);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(cResolveSizeAndState, i11, i12, 2012020043, false, (String) objArr26[0], null);
                            }
                            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                            Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2030658839);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                                char packedPositionChild = (char) ((-1) - ExpandableListView.getPackedPositionChild(0L));
                                int iLastIndexOf = 875 - TextUtils.lastIndexOf("", '0', 0, 0);
                                int scrollBarFadeDuration2 = (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 10;
                                byte[] bArr7 = $$a;
                                Object[] objArr27 = new Object[1];
                                c((byte) (bArr7[27] - 1), bArr7[91], bArr7[5], objArr27);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(packedPositionChild, iLastIndexOf, scrollBarFadeDuration2, -1650998592, false, (String) objArr27[0], null);
                            }
                            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf2);
                        } catch (Exception unused) {
                            throw new RuntimeException();
                        }
                    } else {
                        objArr24 = objArr24;
                    }
                    objArr = objArr24;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            int i13 = ((int[]) objArr[2])[0];
            int i14 = ((int[]) objArr[0])[0];
            if (i14 == i13) {
                int i15 = ((int[]) objArr[1])[0];
                objArr2 = new Object[]{new int[]{((int[]) objArr[0])[0]}, new int[1], new int[]{((int[]) objArr[2])[0]}, (String[]) objArr[3]};
                int i16 = ~(System.identityHashCode(this) | 646729279);
                int i17 = i15 + ((((-44660310) | i16) * (-658)) - 1799089720) + ((i16 | (-648904320)) * 658);
                int i18 = (i17 << 13) ^ i17;
                int i19 = i18 ^ (i18 >>> 17);
                ((int[]) objArr2[1])[0] = i19 ^ (i19 << 5);
            } else {
                Toast.makeText((Context) null, i14 / (((i14 - 1) * i14) % 2), 0).show();
                int i20 = ((int[]) objArr[1])[0];
                objArr2 = new Object[]{new int[]{((int[]) objArr[0])[0]}, new int[1], new int[]{((int[]) objArr[2])[0]}, (String[]) objArr[3]};
                int iIdentityHashCode = System.identityHashCode(this);
                int i21 = ~iIdentityHashCode;
                int i22 = i20 + (-622380354) + (((~(188752316 | i21)) | (~((-229062546) | iIdentityHashCode))) * 210) + (((~(iIdentityHashCode | 266811325)) | (~(i21 | (-151003537)))) * 210);
                int i23 = i22 ^ (i22 << 13);
                int i24 = i23 ^ (i23 >>> 17);
                ((int[]) objArr2[1])[0] = i24 ^ (i24 << 5);
            }
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-342512172);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
                char c2 = (char) (1 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)));
                int i25 = 877 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1));
                int keyRepeatDelay = 10 - (ViewConfiguration.getKeyRepeatDelay() >> 16);
                Object[] objArr28 = new Object[1];
                c((byte) 52, (byte) ($$a[88] - 1), (short) 140, objArr28);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(c2, i25, keyRepeatDelay, 252381699, false, (String) objArr28[0], null);
            }
            long j2 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).getLong(null);
            long jLongValue3 = ((Long) Class.forName(str3).getDeclaredMethod(str4, new Class[0]).invoke(null, new Object[0])).longValue();
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1823069286);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault10 == null) {
                char cMyTid = (char) (Process.myTid() >> 22);
                int iIndexOf2 = TextUtils.indexOf((CharSequence) "", '0') + 877;
                int longPressTimeout2 = 10 - (ViewConfiguration.getLongPressTimeout() >> 16);
                byte[] bArr8 = $$a;
                Object[] objArr29 = new Object[1];
                c(bArr8[7], bArr8[91], (short) 140, objArr29);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.b(cMyTid, iIndexOf2, longPressTimeout2, 2009631821, false, (String) objArr29[0], null);
            }
            if (j2 == ((jLongValue3 - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault10).getLong(null) << 52) >>> 52)) >> 12)) {
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-337894567);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault11 == null) {
                    char c3 = (char) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 1);
                    int iArgb = Color.argb(0, 0, 0, 0) + 876;
                    int modifierMetaStateMask2 = 9 - ((byte) KeyEvent.getModifierMetaStateMask());
                    byte b2 = $$a[7];
                    Object[] objArr30 = new Object[1];
                    c((byte) 52, b2, (short) (b2 | 192), objArr30);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.b(c3, iArgb, modifierMetaStateMask2, 256017550, false, (String) objArr30[0], null);
                }
                Object[] objArr31 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault11).get(null);
                objArr3 = new Object[]{new int[]{((int[]) objArr31[0])[0]}, new int[1], new int[]{((int[]) objArr31[2])[0]}, (String[]) objArr31[3]};
                int i26 = ~System.identityHashCode(this);
                int i27 = 1213162868 + (((~(i26 | 1056915423)) | (~((-948308361) | i26))) * (-184)) + ((74458646 | (~((-1022767007) | i26)) | (~(982456777 | i26))) * 184) + 1595731086;
                int i28 = (i27 << 13) ^ i27;
                int i29 = i28 ^ (i28 >>> 17);
                ((int[]) objArr3[1])[0] = i29 ^ (i29 << 5);
                str = str4;
            } else {
                if (context != null) {
                    int i30 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 103;
                    asBinder = i30 % 128;
                    int i31 = i30 % 2;
                    applicationContext2 = ((context instanceof ContextWrapper) && ((ContextWrapper) context).getBaseContext() == null) ? null : context.getApplicationContext();
                } else {
                    applicationContext2 = context;
                }
                Object[] objArr32 = {applicationContext2, Integer.valueOf(((Integer) Class.forName(str5).getMethod(str6, Object.class).invoke(null, this)).intValue()), -710894594};
                byte[] bArr9 = $$d;
                Object[] objArr33 = new Object[1];
                d(bArr9[138], (short) 392, bArr9[27], objArr33);
                Class<?> cls2 = Class.forName((String) objArr33[0]);
                Object[] objArr34 = new Object[1];
                d(bArr9[91], (short) 314, bArr9[4], objArr34);
                Object[] objArr35 = (Object[]) cls2.getMethod((String) objArr34[0], Context.class, Integer.TYPE, Integer.TYPE).invoke(null, objArr32);
                if (applicationContext2 != null) {
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-337894567);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault12 == null) {
                        char offsetAfter = (char) TextUtils.getOffsetAfter("", 0);
                        int iLastIndexOf2 = TextUtils.lastIndexOf("", '0', 0) + 877;
                        int doubleTapTimeout2 = (ViewConfiguration.getDoubleTapTimeout() >> 16) + 10;
                        byte b3 = $$a[7];
                        Object[] objArr36 = new Object[1];
                        c((byte) 52, b3, (short) (b3 | 192), objArr36);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.b(offsetAfter, iLastIndexOf2, doubleTapTimeout2, 256017550, false, (String) objArr36[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault12).set(null, objArr35);
                    try {
                        str = str4;
                        long jLongValue4 = ((Long) Class.forName(str3).getDeclaredMethod(str, new Class[0]).invoke(null, new Object[0])).longValue();
                        Long lValueOf3 = Long.valueOf(jLongValue4);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1823069286);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault13 == null) {
                            char cCombineMeasuredStates = (char) View.combineMeasuredStates(0, 0);
                            int deadChar = 876 - KeyEvent.getDeadChar(0, 0);
                            int windowTouchSlop = 10 - (ViewConfiguration.getWindowTouchSlop() >> 8);
                            byte[] bArr10 = $$a;
                            Object[] objArr37 = new Object[1];
                            c(bArr10[7], bArr10[91], (short) 140, objArr37);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.b(cCombineMeasuredStates, deadChar, windowTouchSlop, 2009631821, false, (String) objArr37[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault13).set(null, lValueOf3);
                        Long lValueOf4 = Long.valueOf(jLongValue4 >> 12);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-342512172);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault14 == null) {
                            char mirror = (char) ('0' - AndroidCharacter.getMirror('0'));
                            int iNormalizeMetaState = 876 - KeyEvent.normalizeMetaState(0);
                            int mirror2 = ':' - AndroidCharacter.getMirror('0');
                            Object[] objArr38 = new Object[1];
                            c((byte) 52, (byte) ($$a[88] - 1), (short) 140, objArr38);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.b(mirror, iNormalizeMetaState, mirror2, 252381699, false, (String) objArr38[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault14).set(null, lValueOf4);
                    } catch (Exception unused2) {
                        throw new RuntimeException();
                    }
                } else {
                    str = str4;
                    objArr35 = objArr35;
                }
                objArr3 = objArr35;
            }
            if (((int[]) objArr3[0])[0] != ((int[]) objArr3[2])[0]) {
                throw null;
            }
            int i32 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1;
            asBinder = i32 % 128;
            int i33 = i32 % 2;
            int i34 = ((int[]) objArr3[1])[0];
            Object[] objArr39 = {new int[]{((int[]) objArr3[0])[0]}, new int[1], new int[]{((int[]) objArr3[2])[0]}, (String[]) objArr3[3]};
            int iIdentityHashCode2 = System.identityHashCode(this);
            int i35 = ~((-318412513) | iIdentityHashCode2);
            int i36 = ~iIdentityHashCode2;
            int i37 = i34 + (-1876193484) + ((i35 | (~((-278102284) | i36))) * (-1808)) + (((~((-40376033) | iIdentityHashCode2)) | (~(i36 | (-65804)))) * TypedValues.Custom.TYPE_BOOLEAN) + (((~(iIdentityHashCode2 | 278102283)) | 278036480 | (~(318412512 | i36))) * TypedValues.Custom.TYPE_BOOLEAN);
            int i38 = (i37 << 13) ^ i37;
            int i39 = i38 ^ (i38 >>> 17);
            ((int[]) objArr39[1])[0] = i39 ^ (i39 << 5);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(650054);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault15 == null) {
                char cIndexOf2 = (char) TextUtils.indexOf("", "");
                int iIndexOf3 = 650 - TextUtils.indexOf((CharSequence) "", '0');
                int iBlue = Color.blue(0) + 44;
                byte[] bArr11 = $$a;
                Object[] objArr40 = new Object[1];
                c(bArr11[7], bArr11[91], (short) 140, objArr40);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.b(cIndexOf2, iIndexOf3, iBlue, -459846511, false, (String) objArr40[0], null);
            }
            long j3 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault15).getLong(null);
            long jLongValue5 = ((Long) Class.forName(str3).getDeclaredMethod(str, new Class[0]).invoke(null, new Object[0])).longValue();
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(795782016);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault16 == null) {
                char maximumFlingVelocity2 = (char) (ViewConfiguration.getMaximumFlingVelocity() >> 16);
                int trimmedLength = 651 - TextUtils.getTrimmedLength("");
                int mode = 44 - View.MeasureSpec.getMode(0);
                Object[] objArr41 = new Object[1];
                c((byte) 52, (byte) ($$a[88] - 1), (short) 140, objArr41);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.b(maximumFlingVelocity2, trimmedLength, mode, -873460649, false, (String) objArr41[0], null);
            }
            if (j3 == ((jLongValue5 - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault16).getLong(null) << 52) >>> 52)) >> 12)) {
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault17 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1148961515);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault17 == null) {
                    char cIndexOf3 = (char) ((-1) - TextUtils.indexOf((CharSequence) "", '0'));
                    int i40 = (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 650;
                    int iResolveOpacity = Drawable.resolveOpacity(0, 0) + 44;
                    byte[] bArr12 = $$a;
                    Object[] objArr42 = new Object[1];
                    c((byte) (bArr12[27] - 1), bArr12[91], bArr12[5], objArr42);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault17 = initSession.b(cIndexOf3, i40, iResolveOpacity, -1595579076, false, (String) objArr42[0], null);
                }
                Object[] objArr43 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault17).get(null);
                objArr4 = new Object[]{new int[]{i}, new String[0], new int[]{i}, new int[1]};
                int i41 = ((int[]) objArr43[2])[0];
                int i42 = ((int[]) objArr43[0])[0];
                int iIdentityHashCode3 = System.identityHashCode(this);
                int i43 = ~((-292499607) | iIdentityHashCode3);
                int i44 = ~iIdentityHashCode3;
                int i45 = (((1755257009 + ((i43 | (~((-289068797) | i44))) * (-1808))) + (((~((-4530179) | iIdentityHashCode3)) | (~(i44 | (-1099369)))) * TypedValues.Custom.TYPE_BOOLEAN)) + ((((~(iIdentityHashCode3 | 289068796)) | 287969428) | (~(292499606 | i44))) * TypedValues.Custom.TYPE_BOOLEAN)) - 1032489916;
                int i46 = (i45 << 13) ^ i45;
                int i47 = i46 ^ (i46 >>> 17);
                ((int[]) objArr4[3])[0] = i47 ^ (i47 << 5);
                i = 0;
            } else {
                try {
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault18 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1686493381);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault18 == null) {
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault18 = initSession.b((char) ((-1) - TextUtils.lastIndexOf("", '0', 0)), 1610 - View.resolveSizeAndState(0, 0, 0), KeyEvent.normalizeMetaState(0) + 26, 2145681644, false, null, new Class[0]);
                    }
                    Object[] objArr44 = {null, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault18).newInstance(null), -1032489916, 0};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault19 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1625117732);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault19 == null) {
                        char gidForName2 = (char) ((-1) - Process.getGidForName(""));
                        int packedPositionChild2 = 650 - ExpandableListView.getPackedPositionChild(0L);
                        int bitsPerPixel = ImageFormat.getBitsPerPixel(0) + 45;
                        Object[] objArr45 = new Object[1];
                        c((byte) 52, (byte) ($$a[88] - 1), (short) 140, objArr45);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault19 = initSession.b(gidForName2, packedPositionChild2, bitsPerPixel, 2075921419, false, (String) objArr45[0], new Class[]{(Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) ((-1) - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))), Process.getGidForName("") + 696, 98 - TextUtils.indexOf("", "")), (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (63406 - (ViewConfiguration.getFadingEdgeLength() >> 16)), TextUtils.getCapsMode("", 0, 0) + 793, 83 - KeyEvent.keyCodeFromString("")), Integer.TYPE, Integer.TYPE});
                    }
                    objArr4 = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault19).invoke(null, objArr44);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault20 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1148961515);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault20 == null) {
                        char c4 = (char) ((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) - 1);
                        int size = 651 - View.MeasureSpec.getSize(0);
                        int size2 = 44 - View.MeasureSpec.getSize(0);
                        byte[] bArr13 = $$a;
                        Object[] objArr46 = new Object[1];
                        c((byte) (bArr13[27] - 1), bArr13[91], bArr13[5], objArr46);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault20 = initSession.b(c4, size, size2, -1595579076, false, (String) objArr46[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault20).set(null, objArr4);
                    try {
                        long jLongValue6 = ((Long) Class.forName(str3).getDeclaredMethod(str, new Class[0]).invoke(null, new Object[0])).longValue();
                        Long lValueOf5 = Long.valueOf(jLongValue6);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault21 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(795782016);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault21 == null) {
                            char deadChar2 = (char) KeyEvent.getDeadChar(0, 0);
                            int offsetBefore = TextUtils.getOffsetBefore("", 0) + 651;
                            int absoluteGravity = 44 - Gravity.getAbsoluteGravity(0, 0);
                            Object[] objArr47 = new Object[1];
                            c((byte) 52, (byte) ($$a[88] - 1), (short) 140, objArr47);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault21 = initSession.b(deadChar2, offsetBefore, absoluteGravity, -873460649, false, (String) objArr47[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault21).set(null, lValueOf5);
                        Long lValueOf6 = Long.valueOf(jLongValue6 >> 12);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault22 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(650054);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault22 == null) {
                            char c5 = (char) (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
                            int iLastIndexOf3 = 650 - TextUtils.lastIndexOf("", '0');
                            int i48 = (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 44;
                            byte[] bArr14 = $$a;
                            Object[] objArr48 = new Object[1];
                            c(bArr14[7], bArr14[91], (short) 140, objArr48);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault22 = initSession.b(c5, iLastIndexOf3, i48, -459846511, false, (String) objArr48[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault22).set(null, lValueOf6);
                        i = 0;
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
            if (((int[]) objArr4[2])[i] != ((int[]) objArr4[i])[i]) {
                ArrayList arrayList = new ArrayList();
                String[] strArr = (String[]) objArr4[1];
                if (strArr != null) {
                    for (int i49 = i; i49 < strArr.length; i49++) {
                        arrayList.add(strArr[i49]);
                    }
                }
                throw null;
            }
            Object[] objArr49 = new Object[4];
            int[] iArr = new int[1];
            objArr49[i] = iArr;
            int[] iArr2 = new int[1];
            objArr49[2] = iArr2;
            objArr49[3] = new int[1];
            int i50 = ((int[]) objArr4[3])[i];
            int i51 = ((int[]) objArr4[2])[i];
            int i52 = ((int[]) objArr4[i])[i];
            iArr2[i] = i51;
            iArr[i] = i52;
            objArr49[1] = new String[i];
            int i53 = ~System.identityHashCode(this);
            int i54 = i50 + (-104069444) + ((~((-236978177) | i53)) * (-783)) + (((~(i53 | (-237783827))) | (-241214637)) * 783);
            int i55 = (i54 << 13) ^ i54;
            int i56 = i55 ^ (i55 >>> 17);
            ((int[]) objArr49[3])[0] = i56 ^ (i56 << 5);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault23 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault23 == null) {
                char cMakeMeasureSpec = (char) (31533 - View.MeasureSpec.makeMeasureSpec(0, 0));
                int packedPositionGroup = 921 - ExpandableListView.getPackedPositionGroup(0L);
                int i57 = (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 27;
                Object[] objArr50 = new Object[1];
                c((byte) 52, (byte) ($$a[88] - 1), (short) 140, objArr50);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault23 = initSession.b(cMakeMeasureSpec, packedPositionGroup, i57, -1048449946, false, (String) objArr50[0], null);
            }
            if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault23).getLong(null) != -1) {
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault24 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault24 == null) {
                    char c6 = (char) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 31534);
                    int fadingEdgeLength = 921 - (ViewConfiguration.getFadingEdgeLength() >> 16);
                    int iLastIndexOf4 = 27 - TextUtils.lastIndexOf("", '0', 0);
                    byte[] bArr15 = $$a;
                    Object[] objArr51 = new Object[1];
                    c((byte) (bArr15[27] - 1), bArr15[91], bArr15[5], objArr51);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault24 = initSession.b(c6, fadingEdgeLength, iLastIndexOf4, -1142834547, false, (String) objArr51[0], null);
                }
                Object[] objArr52 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault24).get(null);
                objArr5 = new Object[]{new int[1], new int[]{((int[]) objArr52[1])[0]}, (Object[]) objArr52[2], new int[]{((int[]) objArr52[3])[0]}, (String[]) objArr52[4]};
                int i58 = (int) Runtime.getRuntime().totalMemory();
                int i59 = ~i58;
                int i60 = 134002307 + (((~((-1035440886) | i59)) | 738628260 | (~((-738638759) | i59))) * (-1136)) + (((~((-1035440886) | i58)) | (~((-738638759) | i58)) | (~(1035451383 | i59))) * (-568)) + (((~(i58 | (-738628261))) | (~(i59 | 738638758)) | (~(1035440885 | i59))) * 568) + 1626884391;
                int i61 = (i60 << 13) ^ i60;
                int i62 = i61 ^ (i61 >>> 17);
                ((int[]) objArr5[0])[0] = i62 ^ (i62 << 5);
                str2 = str6;
            } else {
                str2 = str6;
                Object[] objArr53 = {context != null ? ((context instanceof ContextWrapper) && ((ContextWrapper) context).getBaseContext() == null) ? null : context.getApplicationContext() : context, Integer.valueOf(((Integer) Class.forName(str5).getMethod(str2, Object.class).invoke(null, this)).intValue()), 0, 1626884391};
                byte[] bArr16 = $$d;
                Object[] objArr54 = new Object[1];
                d(bArr16[108], (short) 262, bArr16[48], objArr54);
                Class<?> cls3 = Class.forName((String) objArr54[0]);
                byte b4 = bArr16[4];
                Object[] objArr55 = new Object[1];
                d(b4, (short) (b4 | 213), bArr16[329], objArr55);
                Object[] objArr56 = (Object[]) cls3.getMethod((String) objArr55[0], Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr53);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault25 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault25 == null) {
                    char scrollBarSize = (char) (31533 - (ViewConfiguration.getScrollBarSize() >> 8));
                    int deadChar3 = KeyEvent.getDeadChar(0, 0) + 921;
                    int packedPositionType = ExpandableListView.getPackedPositionType(0L) + 28;
                    byte[] bArr17 = $$a;
                    Object[] objArr57 = new Object[1];
                    c((byte) (bArr17[27] - 1), bArr17[91], bArr17[5], objArr57);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault25 = initSession.b(scrollBarSize, deadChar3, packedPositionType, -1142834547, false, (String) objArr57[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault25).set(null, objArr56);
                try {
                    long jLongValue7 = ((Long) Class.forName(str3).getDeclaredMethod(str, new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf7 = Long.valueOf(jLongValue7);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault26 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(889369593);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault26 == null) {
                        char size3 = (char) (31533 - View.MeasureSpec.getSize(0));
                        int scrollBarSize2 = 921 - (ViewConfiguration.getScrollBarSize() >> 8);
                        int gidForName3 = 27 - Process.getGidForName("");
                        byte[] bArr18 = $$a;
                        Object[] objArr58 = new Object[1];
                        c(bArr18[7], bArr18[91], (short) (bArr18[12] + 1), objArr58);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault26 = initSession.b(size3, scrollBarSize2, gidForName3, -778300370, false, (String) objArr58[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault26).set(null, lValueOf7);
                    Long lValueOf8 = Long.valueOf(jLongValue7 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault27 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault27 == null) {
                        char cGreen = (char) (Color.green(0) + 31533);
                        int iIndexOf4 = 920 - TextUtils.indexOf((CharSequence) "", '0', 0);
                        int mirror3 = AndroidCharacter.getMirror('0') - 20;
                        Object[] objArr59 = new Object[1];
                        c((byte) 52, (byte) ($$a[88] - 1), (short) 140, objArr59);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault27 = initSession.b(cGreen, iIndexOf4, mirror3, -1048449946, false, (String) objArr59[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault27).set(null, lValueOf8);
                    objArr5 = objArr56;
                } catch (Exception unused4) {
                    throw new RuntimeException();
                }
            }
            int i63 = ((int[]) objArr5[1])[0];
            int i64 = ((int[]) objArr5[3])[0];
            if (i64 != i63) {
                ArrayList arrayList2 = new ArrayList();
                String[] strArr2 = (String[]) objArr5[4];
                if (strArr2 != null) {
                    for (String str7 : strArr2) {
                        arrayList2.add(str7);
                    }
                }
                throw new RuntimeException(String.valueOf(i64));
            }
            int i65 = ((int[]) objArr5[0])[0];
            Object[] objArr60 = {new int[1], new int[]{((int[]) objArr5[1])[0]}, (Object[]) objArr5[2], new int[]{((int[]) objArr5[3])[0]}, (String[]) objArr5[4]};
            int iMyTid = Process.myTid();
            int i66 = i65 + (-742678135) + (((~((-704794401) | iMyTid)) | (~((~iMyTid) | 1069285243))) * (-318)) + (((~(722169657 | iMyTid)) | 347115586) * (-318)) + (((~(iMyTid | (-722169658))) | (-1051909987)) * TypedValues.AttributesType.TYPE_PIVOT_TARGET);
            int i67 = (i66 << 13) ^ i66;
            int i68 = i67 ^ (i67 >>> 17);
            Object obj = objArr60[0];
            ((int[]) obj)[0] = i68 ^ (i68 << 5);
            int i69 = ((int[]) objArr2[1])[0];
            int i70 = i69 * i69;
            int i71 = -(1711153370 * i69);
            int i72 = ((i70 | i71) << 1) - (i70 ^ i71);
            int i73 = -(i69 * 41709166);
            int i74 = ((i72 | i73) << 1) - (i73 ^ i72);
            int i75 = (i74 & (-667655920)) + ((-667655920) | i74);
            int i76 = i75 >> 20;
            int i77 = (((i76 | (-8191)) << 1) - (i76 ^ (-8191))) / 4096;
            int i78 = (i77 & 1) + (i77 | 1);
            int i79 = ((i75 | i78) << 1) - (i78 ^ i75);
            int i80 = i75 >> 16;
            int i81 = ((((-131071) | i80) << 1) - (i80 ^ (-131071))) / 65536;
            int i82 = -(i79 ^ ((i81 & 1) + (i81 | 1)));
            int i83 = (i82 ^ 7) + ((i82 & 7) << 1);
            int i84 = i83 >> 19;
            int i85 = (((i84 | (-16383)) << 1) - (i84 ^ (-16383))) / 8192;
            int i86 = (i85 ^ 1) + ((i85 & 1) << 1);
            int i87 = 4897032 / (((-((i86 & 1) + (i86 | 1))) & i83) * 1132);
            int i88 = ((int[]) objArr39[1])[0];
            int i89 = i88 * i88;
            int i90 = -(1498706570 * i88);
            int i91 = ((i89 | i90) << 1) - (i89 ^ i90);
            int i92 = -(i88 * 943503362);
            int i93 = ((i91 | i92) << 1) - (i92 ^ i91);
            int i94 = ((i93 | (-194343132)) << 1) - ((-194343132) ^ i93);
            int i95 = i94 >> 16;
            int i96 = ((((-131071) | i95) << 1) - (i95 ^ (-131071))) / 65536;
            int i97 = (i94 - (~((i96 & 1) + (i96 | 1)))) - 1;
            int i98 = i94 >> 23;
            int i99 = ((i98 ^ (-1023)) + ((i98 & (-1023)) << 1)) / 512;
            int i100 = (-(i97 ^ (((i99 | 1) << 1) - (i99 ^ 1)))) + 4;
            int i101 = ((i100 >> 22) - 2047) / 1024;
            int i102 = ((i101 | 1) << 1) - (i101 ^ 1);
            int i103 = i87 + (607936 / ((i100 & (-(((i102 | 1) << 1) - (i102 ^ 1)))) * 1357));
            int i104 = ((int[]) objArr49[3])[0];
            int i105 = i104 * i104;
            int i106 = -(1335710571 * i104);
            int i107 = (i105 ^ i106) + ((i105 & i106) << 1);
            int i108 = -(i104 * (-1664683481));
            int i109 = (((i107 | i108) << 1) - (i108 ^ i107)) - 415366703;
            int i110 = i109 >> 21;
            int i111 = ((i110 ^ (-4095)) + ((i110 & (-4095)) << 1)) / 2048;
            int i112 = (i111 ^ 1) + ((i111 & 1) << 1);
            int i113 = (i109 ^ i112) + ((i112 & i109) << 1);
            int i114 = i109 >> 15;
            int i115 = -(i113 ^ ((((((-262143) | i114) << 1) - (i114 ^ (-262143))) / 131072) - (-1)));
            int i116 = (i115 & 5) + (i115 | 5);
            int i117 = i116 >> 16;
            int i118 = (((-131071) ^ i117) + ((i117 & (-131071)) << 1)) / 65536;
            int i119 = (i118 & 1) + (i118 | 1);
            int i120 = i103 + (3074550 / (((-((i119 ^ 1) + ((i119 & 1) << 1))) & i116) * 1990));
            int i121 = ((int[]) obj)[0];
            int i122 = i121 * i121;
            int i123 = -(1644738097 * i121);
            int i124 = ((i122 | i123) << 1) - (i122 ^ i123);
            int i125 = -(i121 * 236549565);
            int i126 = (i124 ^ i125) + ((i125 & i124) << 1);
            int i127 = (i126 & (-55544751)) + ((-55544751) | i126);
            int i128 = i127 >> 15;
            int i129 = (((-262143) & i128) + (i128 | (-262143))) / 131072;
            int i130 = (i129 ^ 1) + ((i129 & 1) << 1);
            int i131 = -(((i127 ^ i130) + ((i130 & i127) << 1)) ^ ((((i127 >> 16) - 131071) / 65536) - (-1)));
            int i132 = (i131 & 5) + (i131 | 5);
            int i133 = i132 >> 28;
            int i134 = ((i133 & (-31)) + (i133 | (-31))) / 16;
            if ("8,14,12,20,android.intent.action.BATTERY_CHANGED".substring(i120 + ((-4646560) / (((-(((i134 & 1) + (i134 | 1)) - (-1))) & i132) * TypedValues.Custom.TYPE_BOOLEAN))).equals(intent.getAction())) {
                int i135 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 101;
                asBinder = i135 % 128;
                if (i135 % 2 == 0) {
                    intent.getIntExtra("plugged", -1);
                    throw null;
                }
                final boolean z = intent.getIntExtra("plugged", -1) <= 0;
                ForwardingCameraInfo.this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.post(new Runnable() { // from class: ForwardingCameraInfo.TuitionPaymentFragmentspecialinlinedviewModeldefault2.3
                    private static final byte[] $$a = {15, -9, 64, -81};
                    private static final int $$b = 11;
                    private static int $10 = 0;
                    private static int $11 = 1;
                    private static int asBinder = 0;

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    private static int f146a = 1;
                    private static char[] b = {57189, 60050, 60117, 60089, 57186, 57184, 60057, 60040, 60095, 60052, 60102, 60048, 60053, 60107, 60046, 60084, 60041, 57194, 60062, 60047, 60110, 60123, 60060, 60072, 60034, 60054, 60067, 57187, 60082, 60045, 60063, 57193, 57191, 60119, 57188, 57192, 60090, 60056, 60088, 57195, 57190, 60085, 60086, 60078, 60098, 60075, 60049, 60061, 60058};
                    private static char TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 57190;
                    private static char TuitionPaymentFragmentbindingInflater1 = 22522;
                    private static char g = 41290;
                    private static char asInterface = 53078;
                    private static char d = 59088;

                    @Override // java.lang.Runnable
                    public void run() {
                        int i136 = 2 % 2;
                        ForwardingCameraInfo forwardingCameraInfo = ForwardingCameraInfo.this;
                        forwardingCameraInfo.b = z;
                        if (forwardingCameraInfo.asInterface) {
                            int i137 = asBinder + 23;
                            f146a = i137 % 128;
                            Object obj2 = null;
                            if (i137 % 2 == 0) {
                                forwardingCameraInfo.TuitionPaymentFragmentspecialinlinedviewModeldefault1.removeCallbacksAndMessages(null);
                                boolean z2 = forwardingCameraInfo.b;
                                obj2.hashCode();
                                throw null;
                            }
                            forwardingCameraInfo.TuitionPaymentFragmentspecialinlinedviewModeldefault1.removeCallbacksAndMessages(null);
                            if (forwardingCameraInfo.b) {
                                forwardingCameraInfo.TuitionPaymentFragmentspecialinlinedviewModeldefault1.postDelayed(forwardingCameraInfo.TuitionPaymentFragmentspecialinlinedviewModeldefault3, PeriodicWorkRequest.MIN_PERIODIC_FLEX_MILLIS);
                                int i138 = asBinder + 113;
                                f146a = i138 % 128;
                                int i139 = i138 % 2;
                            }
                        }
                    }

                    private static void e(char[] cArr, int i136, Object[] objArr61) throws Throwable {
                        int i137 = 2 % 2;
                        onCaptureSessionEnd oncapturesessionend = new onCaptureSessionEnd();
                        char[] cArr2 = new char[cArr.length - 2];
                        oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 2;
                        char[] cArr3 = new char[2];
                        while (true) {
                            int i138 = 0;
                            if (oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 >= cArr.length) {
                                objArr61[0] = new String(cArr2, 0, i136);
                                return;
                            }
                            cArr3[0] = cArr[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3];
                            cArr3[1] = cArr[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1];
                            int i139 = 58224;
                            int i140 = 0;
                            while (i140 < 16) {
                                int i141 = $10 + 105;
                                $11 = i141 % 128;
                                int i142 = i141 % 2;
                                char c7 = cArr3[1];
                                char c8 = cArr3[i138];
                                int i143 = (c8 + i139) ^ ((c8 << 4) + ((char) (((long) asInterface) ^ 8611973335120459638L)));
                                int i144 = c8 >>> 5;
                                try {
                                    Object[] objArr62 = new Object[4];
                                    objArr62[3] = Integer.valueOf(d);
                                    objArr62[2] = Integer.valueOf(i144);
                                    objArr62[1] = Integer.valueOf(i143);
                                    objArr62[i138] = Integer.valueOf(c7);
                                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault28 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1824600641);
                                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault28 == null) {
                                        char cRed = (char) (47773 - Color.red(i138));
                                        int absoluteGravity2 = Gravity.getAbsoluteGravity(i138, i138) + 468;
                                        int longPressTimeout3 = (ViewConfiguration.getLongPressTimeout() >> 16) + 13;
                                        Class[] clsArr = new Class[4];
                                        clsArr[i138] = Integer.TYPE;
                                        clsArr[1] = Integer.TYPE;
                                        clsArr[2] = Integer.TYPE;
                                        clsArr[3] = Integer.TYPE;
                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault28 = initSession.b(cRed, absoluteGravity2, longPressTimeout3, -2007001706, false, "o", clsArr);
                                    }
                                    char cCharValue = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault28).invoke(null, objArr62)).charValue();
                                    cArr3[1] = cCharValue;
                                    int i145 = i140;
                                    Object[] objArr63 = {Integer.valueOf(cArr3[i138]), Integer.valueOf((cCharValue + i139) ^ ((cCharValue << 4) + ((char) (((long) TuitionPaymentFragmentbindingInflater1) ^ 8611973335120459638L)))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(g)};
                                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault29 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1824600641);
                                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault29 == null) {
                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault29 = initSession.b((char) (47773 - ExpandableListView.getPackedPositionGroup(0L)), 469 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), Drawable.resolveOpacity(0, 0) + 13, -2007001706, false, "o", new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                                    }
                                    cArr3[0] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault29).invoke(null, objArr63)).charValue();
                                    i139 -= 40503;
                                    i140 = i145 + 1;
                                    int i146 = $10 + 1;
                                    $11 = i146 % 128;
                                    int i147 = i146 % 2;
                                    i138 = 0;
                                } catch (Throwable th3) {
                                    Throwable cause3 = th3.getCause();
                                    if (cause3 == null) {
                                        throw th3;
                                    }
                                    throw cause3;
                                }
                            }
                            cArr2[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 - 2] = (char) (cArr[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 - 2] ^ cArr3[0]);
                            cArr2[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 - 1] = (char) (cArr3[1] ^ cArr[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 - 1]);
                            Object[] objArr64 = {oncapturesessionend, oncapturesessionend};
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault30 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1431906448);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault30 == null) {
                                byte b5 = (byte) 0;
                                byte b6 = b5;
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault30 = initSession.b((char) ((-1) - MotionEvent.axisFromString("")), (ViewConfiguration.getTouchSlop() >> 8) + 2323, TextUtils.getOffsetAfter("", 0) + 44, -1312321721, false, $$c(b5, b6, b6), new Class[]{Object.class, Object.class});
                            }
                            ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault30).invoke(null, objArr64);
                            int i148 = $10 + 109;
                            $11 = i148 % 128;
                            int i149 = i148 % 2;
                        }
                    }

                    private static void c(char[] cArr, byte b5, int i136, Object[] objArr61) throws Throwable {
                        int i137;
                        Object obj2;
                        int i138 = 2;
                        int i139 = 2 % 2;
                        deInitSession deinitsession = new deInitSession();
                        char[] cArr2 = b;
                        int i140 = 1770390596;
                        Object obj3 = null;
                        if (cArr2 != null) {
                            int length = cArr2.length;
                            char[] cArr3 = new char[length];
                            int i141 = $10 + 87;
                            $11 = i141 % 128;
                            int i142 = i141 % 2;
                            int i143 = 0;
                            while (i143 < length) {
                                int i144 = $11 + 93;
                                $10 = i144 % 128;
                                int i145 = i144 % i138;
                                try {
                                    Object[] objArr62 = {Integer.valueOf(cArr2[i143])};
                                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault28 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(i140);
                                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault28 == null) {
                                        byte b6 = (byte) 0;
                                        byte b7 = (byte) (b6 + 5);
                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault28 = initSession.b((char) (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), (Process.myTid() >> 22) + 2267, 33 - TextUtils.indexOf("", "", 0), -1927765101, false, $$c(b6, b7, (byte) (b7 - 5)), new Class[]{Integer.TYPE});
                                    }
                                    cArr3[i143] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault28).invoke(null, objArr62)).charValue();
                                    i143++;
                                    i138 = 2;
                                    i140 = 1770390596;
                                } catch (Throwable th3) {
                                    Throwable cause3 = th3.getCause();
                                    if (cause3 == null) {
                                        throw th3;
                                    }
                                    throw cause3;
                                }
                            }
                            cArr2 = cArr3;
                        }
                        try {
                            Object[] objArr63 = {Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault1)};
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault29 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1770390596);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault29 == null) {
                                byte b8 = (byte) 0;
                                byte b9 = (byte) (b8 + 5);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault29 = initSession.b((char) ((-1) - Process.getGidForName("")), 2267 - TextUtils.getTrimmedLength(""), (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 32, -1927765101, false, $$c(b8, b9, (byte) (b9 - 5)), new Class[]{Integer.TYPE});
                            }
                            char cCharValue = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault29).invoke(null, objArr63)).charValue();
                            char[] cArr4 = new char[i136];
                            if (i136 % 2 != 0) {
                                i137 = i136 - 1;
                                cArr4[i137] = (char) (cArr[i137] - b5);
                            } else {
                                i137 = i136;
                            }
                            if (i137 > 1) {
                                deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
                                while (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 < i137) {
                                    deinitsession.b = cArr[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3];
                                    deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = cArr[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1];
                                    if (deinitsession.b == deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                                        int i146 = $10 + 1;
                                        $11 = i146 % 128;
                                        if (i146 % 2 == 0) {
                                            cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = (char) (deinitsession.b + b5);
                                            cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = (char) (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault2 >> b5);
                                        } else {
                                            cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = (char) (deinitsession.b - b5);
                                            cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = (char) (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault2 - b5);
                                        }
                                        obj2 = obj3;
                                    } else {
                                        try {
                                            Object[] objArr64 = {deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession};
                                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault30 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(486174475);
                                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault30 == null) {
                                                byte b10 = (byte) 0;
                                                objTuitionPaymentFragmentspecialinlinedviewModeldefault30 = initSession.b((char) (TextUtils.indexOf((CharSequence) "", '0') + 49268), ExpandableListView.getPackedPositionChild(0L) + 3262, 30 - TextUtils.indexOf("", "", 0, 0), -127612708, false, $$c(b10, (byte) (b10 | 6), b10), new Class[]{Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class});
                                            }
                                            if (((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault30).invoke(null, objArr64)).intValue() == deinitsession.asBinder) {
                                                int i147 = $10 + 9;
                                                $11 = i147 % 128;
                                                int i148 = i147 % 2;
                                                Object[] objArr65 = {deinitsession, deinitsession, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), deinitsession, Integer.valueOf(cCharValue), deinitsession};
                                                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault31 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1187000607);
                                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault31 == null) {
                                                    byte b11 = (byte) 0;
                                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault31 = initSession.b((char) (22877 - TextUtils.indexOf((CharSequence) "", '0', 0, 0)), 594 - ExpandableListView.getPackedPositionType(0L), (ViewConfiguration.getJumpTapTimeout() >> 16) + 17, 1570859318, false, $$c(b11, (byte) (b11 | 8), b11), new Class[]{Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Integer.TYPE, Object.class});
                                                }
                                                obj2 = null;
                                                int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault31).invoke(null, objArr65)).intValue();
                                                int i149 = (deinitsession.TuitionPaymentFragmentbindingInflater1 * cCharValue) + deinitsession.asBinder;
                                                cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr2[iIntValue];
                                                cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = cArr2[i149];
                                            } else {
                                                obj2 = null;
                                                if (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault1 == deinitsession.TuitionPaymentFragmentbindingInflater1) {
                                                    int i150 = $10 + 75;
                                                    $11 = i150 % 128;
                                                    int i151 = i150 % 2;
                                                    deinitsession.g = ((deinitsession.g + cCharValue) - 1) % cCharValue;
                                                    deinitsession.asBinder = ((deinitsession.asBinder + cCharValue) - 1) % cCharValue;
                                                    int i152 = (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault1 * cCharValue) + deinitsession.g;
                                                    int i153 = (deinitsession.TuitionPaymentFragmentbindingInflater1 * cCharValue) + deinitsession.asBinder;
                                                    cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr2[i152];
                                                    cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = cArr2[i153];
                                                } else {
                                                    int i154 = (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault1 * cCharValue) + deinitsession.asBinder;
                                                    int i155 = (deinitsession.TuitionPaymentFragmentbindingInflater1 * cCharValue) + deinitsession.g;
                                                    cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr2[i154];
                                                    cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = cArr2[i155];
                                                }
                                            }
                                        } catch (Throwable th4) {
                                            Throwable cause4 = th4.getCause();
                                            if (cause4 == null) {
                                                throw th4;
                                            }
                                            throw cause4;
                                        }
                                    }
                                    deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 += 2;
                                    obj3 = obj2;
                                }
                            }
                            for (int i156 = 0; i156 < i136; i156++) {
                                cArr4[i156] = (char) (cArr4[i156] ^ 13722);
                            }
                            objArr61[0] = new String(cArr4);
                        } catch (Throwable th5) {
                            Throwable cause5 = th5.getCause();
                            if (cause5 == null) {
                                throw th5;
                            }
                            throw cause5;
                        }
                    }

                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.String] */
                    /* JADX WARN: Type inference failed for: r3v1 */
                    /* JADX WARN: Type inference failed for: r3v18 */
                    /* JADX WARN: Type inference failed for: r3v2, types: [int] */
                    /* JADX WARN: Type inference failed for: r4v20 */
                    public static Object[] TuitionPaymentFragmentspecialinlinedviewModeldefault2(Context context2, int i136, int i137) {
                        int i138;
                        int i139;
                        int i140;
                        Object[] objArr61;
                        int length;
                        int i141;
                        int i142;
                        int i143;
                        byte bIndexOf;
                        int i144;
                        int i145;
                        Object[] objArr62;
                        Method method;
                        char[] cArr;
                        int doubleTapTimeout3;
                        int i146;
                        int i147;
                        int i148;
                        Object[] objArr63;
                        Method method2;
                        ?? r3 = "";
                        int i149 = 2 % 2;
                        if (context2 != null) {
                            try {
                                char[] cArr2 = {'\'', '#', '\b', Typography.amp, '\t', '!', 23, 16, 2, 29, 22, 7, 20, 4, 15, 21, 29, 19, '\b', Typography.amp, '\t', '!', 23, 16, 2, 29, 31, '(', '\b', '-', 13829};
                                int doubleTapTimeout4 = ViewConfiguration.getDoubleTapTimeout() >> 16;
                                int iTuitionPaymentFragmentspecialinlinedviewModeldefault1 = R.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                                int i150 = ~i136;
                                int i151 = ~i136;
                                int i152 = (doubleTapTimeout4 * 860) - 51480;
                                int i153 = -(-((doubleTapTimeout4 | iTuitionPaymentFragmentspecialinlinedviewModeldefault1) * (-859)));
                                int i154 = (i152 ^ i153) + ((i152 & i153) << 1);
                                int i155 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault1;
                                int i156 = ~((i155 ^ doubleTapTimeout4) | (i155 & doubleTapTimeout4));
                                int i157 = ~doubleTapTimeout4;
                                int i158 = (i157 ^ (-61)) | (i157 & (-61));
                                int i159 = ~((i158 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault1) | (i158 & iTuitionPaymentFragmentspecialinlinedviewModeldefault1));
                                int i160 = i154 + (((i159 & i156) | (i156 ^ i159)) * 859);
                                int i161 = ~((-61) | i155);
                                int i162 = ((-61) & doubleTapTimeout4) | ((-61) ^ doubleTapTimeout4);
                                int i163 = asBinder + 29;
                                f146a = i163 % 128;
                                int i164 = i163 % 2;
                                int i165 = ~i162;
                                int i166 = -(-(859 * ((i165 & i161) | (i161 ^ i165))));
                                byte b5 = (byte) ((i160 & i166) + (i166 | i160));
                                int iResolveOpacity2 = Drawable.resolveOpacity(0, 0);
                                int i167 = (iResolveOpacity2 * (-589)) + 18321;
                                int i168 = ~(((-32) & i150) | ((-32) ^ i150));
                                int i169 = ~(((-32) & iResolveOpacity2) | ((-32) ^ iResolveOpacity2));
                                int i170 = (i168 & i169) | (i168 ^ i169);
                                int i171 = ~((i150 ^ iResolveOpacity2) | (i150 & iResolveOpacity2));
                                int i172 = (i170 & i171) | (i170 ^ i171);
                                int i173 = ~iResolveOpacity2;
                                int i174 = -(-((i172 | (~((i173 ^ 31) | (i173 & 31) | i136))) * 590));
                                int i175 = (i167 ^ i174) + ((i167 & i174) << 1);
                                int i176 = (~((-32) | iResolveOpacity2)) | (~(((-32) ^ i150) | ((-32) & i150)));
                                int i177 = ~(iResolveOpacity2 | i150);
                                int i178 = ((i177 & i176) | (i176 ^ i177)) * (-1180);
                                int i179 = (i175 ^ i178) + ((i178 & i175) << 1);
                                int i180 = f146a;
                                int i181 = ((i180 | 33) << 1) - (i180 ^ 33);
                                asBinder = i181 % 128;
                                int i182 = i181 % 2;
                                int i183 = ~((i173 ^ i150) | (i173 & i150));
                                int i184 = ~((i151 ^ 31) | (i151 & 31));
                                int i185 = 590 * ((i183 & i184) | (i183 ^ i184));
                                int i186 = ((i179 | i185) << 1) - (i179 ^ i185);
                                Object[] objArr64 = new Object[1];
                                c(cArr2, b5, i186, objArr64);
                                try {
                                    try {
                                        Object[] objArr65 = {(String) objArr64[0]};
                                        int i187 = -KeyEvent.keyCodeFromString("");
                                        int iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = R.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                                        int i188 = i187 * 980;
                                        int i189 = (i188 & (-37164)) + (i188 | (-37164));
                                        int i190 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault2;
                                        int i191 = i189 + ((~((-39) | i190)) * 979);
                                        int i192 = -(-(((i187 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault2) | (i187 & iTuitionPaymentFragmentspecialinlinedviewModeldefault2)) * (-979)));
                                        int i193 = (i191 & i192) + (i192 | i191);
                                        int i194 = ~((iTuitionPaymentFragmentspecialinlinedviewModeldefault2 & (-39)) | ((-39) ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault2));
                                        int i195 = ~((i187 & i190) | (i190 ^ i187));
                                        int i196 = ((i195 & i194) | (i194 ^ i195)) * 979;
                                        int i197 = ((i193 | i196) << 1) - (i193 ^ i196);
                                        Object[] objArr66 = new Object[1];
                                        e(new char[]{29836, 1882, 47955, 23778, 40711, 47707, 9173, 27467, 27522, 11054, 399, 25608, 47432, 41691, 26582, 29344, 19588, 54172, 30433, 997, 54194, 52892, 18365, 50613, 46204, 57933, 29794, 62399, 60153, 54510, 31758, 30634, 2696, 12973, 21875, 50233, 64088, 20127, 54576, 18057}, i197, objArr66);
                                        Object objNewInstance = Class.forName((String) objArr66[0]).getDeclaredConstructor(String.class).newInstance(objArr65);
                                        Object[] objArr67 = new Object[1];
                                        e(new char[]{42375, 47028, 9987, 20136, 63826, 31854, 40683, 22650, 22325, 52957, 15761, 24110, 17594, 30758, 35579, 20313, 34791, 61971, 65438, 25171, 49281, 49053, 50748, 20492, 11313, 58736, 31204, 11155, 57467, 52331, 53332, 12348, 18055, 26330}, 30 - (~(-(-(ViewConfiguration.getTapTimeout() >> 16)))), objArr67);
                                        try {
                                            Object[] objArr68 = {(String) objArr67[0]};
                                            Object[] objArr69 = new Object[1];
                                            e(new char[]{29836, 1882, 47955, 23778, 40711, 47707, 9173, 27467, 27522, 11054, 399, 25608, 47432, 41691, 26582, 29344, 19588, 54172, 30433, 997, 54194, 52892, 18365, 50613, 46204, 57933, 29794, 62399, 60153, 54510, 31758, 30634, 2696, 12973, 21875, 50233, 64088, 20127, 54576, 18057}, (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 38, objArr69);
                                            Object objNewInstance2 = Class.forName((String) objArr69[0]).getDeclaredConstructor(String.class).newInstance(objArr68);
                                            try {
                                                int i198 = -TextUtils.getCapsMode("", 0, 0);
                                                int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = R.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                                                int i199 = i198 * (-495);
                                                int i200 = (i199 & (-11385)) + (i199 | (-11385));
                                                int i201 = ~i198;
                                                int i202 = ~((i201 ^ (-24)) | (i201 & (-24)));
                                                int i203 = ~((i201 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault3) | (i201 & iTuitionPaymentFragmentspecialinlinedviewModeldefault3));
                                                int i204 = ((i202 ^ i203) | (i202 & i203)) * 992;
                                                int i205 = ((i200 | i204) << 1) - (i204 ^ i200);
                                                int i206 = ~((i201 ^ (-24)) | (i201 & (-24)));
                                                int i207 = ~i198;
                                                int i208 = ~((i207 & iTuitionPaymentFragmentspecialinlinedviewModeldefault3) | (i207 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault3));
                                                int i209 = (i206 & i208) | (i206 ^ i208);
                                                int i210 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault3;
                                                int i211 = (i210 & i198) | (i210 ^ i198);
                                                int i212 = (i209 | (~((i211 & 23) | (i211 ^ 23)))) * (-496);
                                                int i213 = (((i205 ^ i212) + ((i212 & i205) << 1)) - (~((iTuitionPaymentFragmentspecialinlinedviewModeldefault3 | 23) * 496))) - 1;
                                                Object[] objArr70 = new Object[1];
                                                e(new char[]{46650, 25277, 28474, 12952, 18504, 56396, 35120, 550, 36581, 41048, 45494, 23213, 26018, 15028, 4517, 261, 35991, 55936, 15847, 34087, 18739, 57852, 14831, 63946, 24306, 36605}, i213, objArr70);
                                                Class<?> cls4 = Class.forName((String) objArr70[0]);
                                                int i214 = -(ViewConfiguration.getTouchSlop() >> 8);
                                                int threadPriority = Process.getThreadPriority(0);
                                                int iTuitionPaymentFragmentspecialinlinedviewModeldefault4 = R.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                                                int i215 = (-8380) + (threadPriority * 421);
                                                int i216 = (~((threadPriority ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault4) | (threadPriority & iTuitionPaymentFragmentspecialinlinedviewModeldefault4))) * TypedValues.CycleType.TYPE_EASING;
                                                int i217 = (i215 & i216) + (i215 | i216) + (((threadPriority ^ (-21)) | (threadPriority & (-21))) * (-420));
                                                int i218 = ~threadPriority;
                                                int i219 = ~(((-21) ^ i218) | ((-21) & i218));
                                                int i220 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault4;
                                                int i221 = ~((i220 ^ threadPriority) | (i220 & threadPriority));
                                                int i222 = -(-(((i221 & i219) | (i219 ^ i221)) * TypedValues.CycleType.TYPE_EASING));
                                                int i223 = -(((i217 & i222) + (i217 | i222)) >> 6);
                                                int i224 = i223 * (-501);
                                                int i225 = (i224 ^ 8551) + ((i224 & 8551) << 1);
                                                int i226 = ~(((-18) ^ i136) | ((-18) & i136));
                                                int i227 = ~((i223 ^ 17) | (i223 & 17));
                                                int i228 = ((i226 ^ i227) | (i226 & i227)) * (-502);
                                                int i229 = (i225 ^ i228) + ((i228 & i225) << 1);
                                                int i230 = (-18) | i150;
                                                int i231 = i229 + ((~((i230 & i223) | (i230 ^ i223))) * (-502));
                                                int i232 = ~i223;
                                                int i233 = (i231 - (~(-(-(((~((i232 & i136) | (i232 ^ i136))) | (-18)) * TypedValues.PositionType.TYPE_DRAWPATH))))) - 1;
                                                Object[] objArr71 = new Object[1];
                                                c(new char[]{25, 15, 17, '/', ',', ')', '\r', '.', 25, 15, '+', '*', '\r', '/', 25, 15, 13849}, (byte) ((i214 & 49) + (i214 | 49)), i233, objArr71);
                                                Object objInvoke = cls4.getMethod((String) objArr71[0], null).invoke(context2, null);
                                                try {
                                                    int iResolveSizeAndState = View.resolveSizeAndState(0, 0, 0);
                                                    int i234 = iResolveSizeAndState * (-1939);
                                                    int i235 = ((i234 | 22333) << 1) - (i234 ^ 22333);
                                                    int i236 = ~((-24) | iResolveSizeAndState);
                                                    int i237 = ~((i150 ^ 23) | (i150 & 23));
                                                    int i238 = ((i236 & i237) | (i236 ^ i237)) * (-970);
                                                    int i239 = ((i235 | i238) << 1) - (i238 ^ i235);
                                                    int i240 = ~iResolveSizeAndState;
                                                    int i241 = -(-((~((i240 ^ 23) | (i240 & 23))) * 1940));
                                                    int i242 = (i239 & i241) + (i241 | i239);
                                                    int i243 = ~((i240 & (-24)) | (i240 ^ (-24)));
                                                    int i244 = -(-(((i243 & i237) | (i243 ^ i237)) * 970));
                                                    int i245 = ((i242 | i244) << 1) - (i244 ^ i242);
                                                    Object[] objArr72 = new Object[1];
                                                    e(new char[]{46650, 25277, 28474, 12952, 18504, 56396, 35120, 550, 36581, 41048, 45494, 23213, 26018, 15028, 4517, 261, 35991, 55936, 15847, 34087, 18739, 57852, 14831, 63946, 24306, 36605}, i245, objArr72);
                                                    Class<?> cls5 = Class.forName((String) objArr72[0]);
                                                    char[] cArr3 = {25, 15, 17, '/', ',', ')', '\r', '.', 25, 15, '0', 6, ' ', 25};
                                                    byte b6 = (byte) (20 - (~(-ImageFormat.getBitsPerPixel(0))));
                                                    int trimmedLength2 = TextUtils.getTrimmedLength("");
                                                    int i246 = (trimmedLength2 * 868) + 12152;
                                                    int i247 = ~trimmedLength2;
                                                    int i248 = ~(i247 | i150);
                                                    int i249 = ~((-15) | i151);
                                                    int i250 = ((i248 ^ i249) | (i249 & i248)) * (-867);
                                                    int i251 = asBinder;
                                                    int i252 = (i251 ^ 117) + ((i251 & 117) << 1);
                                                    Object obj2 = objNewInstance2;
                                                    int i253 = i252 % 128;
                                                    f146a = i253;
                                                    int i254 = i252 % 2;
                                                    int i255 = (i246 & i250) + (i250 | i246);
                                                    int i256 = ~trimmedLength2;
                                                    int i257 = ~((i256 ^ (-15)) | (i256 & (-15)));
                                                    Object obj3 = objNewInstance;
                                                    int i258 = ~((i256 ^ i136) | (i256 & i136));
                                                    int i259 = (i257 ^ i258) | (i258 & i257) | (~(((-15) ^ i136) | ((-15) & i136)));
                                                    int i260 = ((i253 | 75) << 1) - (i253 ^ 75);
                                                    asBinder = i260 % 128;
                                                    if (i260 % 2 != 0) {
                                                        i138 = i255 * ((-1734) >>> i259);
                                                        int i261 = (i256 ^ (-15)) | (i256 & (-15));
                                                        int i262 = ~((i261 & i151) | (i261 ^ i151));
                                                        int i263 = (i256 & 14) | (i256 ^ 14);
                                                        int i264 = ~((i263 & i136) | (i263 ^ i136));
                                                        i139 = i262 ^ i264;
                                                        i140 = i264 & i262;
                                                    } else {
                                                        int i265 = -(-(i259 * (-1734)));
                                                        i138 = (i255 ^ i265) + ((i265 & i255) << 1);
                                                        int i266 = (i256 & (-15)) | (i256 ^ (-15));
                                                        int i267 = ~((i266 & i151) | (i266 ^ i151));
                                                        int i268 = (i247 ^ 14) | (i247 & 14);
                                                        int i269 = ~((i268 & i136) | (i268 ^ i136));
                                                        i139 = i267 ^ i269;
                                                        i140 = i267 & i269;
                                                    }
                                                    int i270 = i140 | i139;
                                                    int i271 = ((-15) ^ trimmedLength2) | ((-15) & trimmedLength2);
                                                    int i272 = ~((i271 & i136) | (i271 ^ i136));
                                                    int i273 = (i138 - (~(867 * ((i270 & i272) | (i270 ^ i272))))) - 1;
                                                    try {
                                                        Object[] objArr73 = new Object[1];
                                                        c(cArr3, b6, i273, objArr73);
                                                        try {
                                                            Object[] objArr74 = {cls5.getMethod((String) objArr73[0], null).invoke(context2, null), 64};
                                                            int keyRepeatDelay2 = ViewConfiguration.getKeyRepeatDelay() >> 16;
                                                            int i274 = ((keyRepeatDelay2 | 33) << 1) - (keyRepeatDelay2 ^ 33);
                                                            Object[] objArr75 = new Object[1];
                                                            e(new char[]{9471, 23143, 37909, 38799, 64177, 42205, 22290, 23442, 35600, 31360, 14017, 45157, 32936, 8623, 23460, 56580, 3867, 38448, 14445, 60284, 54577, 16155, 26178, 30063, 3214, 45621, 7873, 33727, 43488, 53455, 5528, 51166, 54533, 15494, 20199, 59122}, i274, objArr75);
                                                            Class<?> cls6 = Class.forName((String) objArr75[0]);
                                                            char[] cArr4 = {25, 15, 17, '/', ',', ')', '\r', '.', 25, 15, '!', 7, ',', '\f'};
                                                            int modifierMetaStateMask3 = KeyEvent.getModifierMetaStateMask();
                                                            int i275 = f146a;
                                                            int i276 = ((i275 | 79) << 1) - (i275 ^ 79);
                                                            asBinder = i276 % 128;
                                                            int i277 = i276 % 2;
                                                            int i278 = -((byte) modifierMetaStateMask3);
                                                            byte b7 = (byte) ((56 ^ i278) + ((i278 & 56) << 1));
                                                            int i279 = (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
                                                            int i280 = (i279 * (-751)) - 10514;
                                                            int i281 = ~i279;
                                                            int i282 = ~((i281 ^ (-15)) | (i281 & (-15)));
                                                            int i283 = ~(i281 | i136);
                                                            int i284 = -(-(((i283 & i282) | (i282 ^ i283)) * 1504));
                                                            int i285 = (i280 ^ i284) + ((i280 & i284) << 1);
                                                            int i286 = ~i279;
                                                            int i287 = (i286 & 14) | (i286 ^ 14);
                                                            int i288 = -(-((~((i287 ^ i136) | (i287 & i136))) * (-1504)));
                                                            int i289 = (i285 ^ i288) + ((i288 & i285) << 1) + (((~((i279 & (-15)) | ((-15) ^ i279))) | (~i287)) * 752);
                                                            Object[] objArr76 = new Object[1];
                                                            c(cArr4, b7, i289, objArr76);
                                                            Object objInvoke2 = cls6.getMethod((String) objArr76[0], String.class, Integer.TYPE).invoke(objInvoke, objArr74);
                                                            try {
                                                                int i290 = -(-AndroidCharacter.getMirror('0'));
                                                                int i291 = (i290 ^ (-18)) + ((i290 & (-18)) << 1);
                                                                Object[] objArr77 = new Object[1];
                                                                e(new char[]{43625, 46150, 40339, 21453, 41813, 37608, 10404, 19123, 29341, 8973, 5858, 39984, 55486, 1590, 61879, 39453, 56996, 37073, 49552, 36950, 58971, 19810, 8465, 7277, 3021, 2998, 59885, 23779, 9313, 39338, 49744, 3290}, i291, objArr77);
                                                                Class<?> cls7 = Class.forName((String) objArr77[0]);
                                                                char[] cArr5 = {'\b', 0, 26, '\b', '/', 20, 15, 17, 14, 11};
                                                                int longPressTimeout3 = ViewConfiguration.getLongPressTimeout() >> 16;
                                                                byte b8 = (byte) ((longPressTimeout3 ^ 87) + ((longPressTimeout3 & 87) << 1));
                                                                int i292 = -TextUtils.getOffsetBefore("", 0);
                                                                int i293 = i292 * 765;
                                                                int i294 = (i293 & (-15270)) + (i293 | (-15270));
                                                                int i295 = (i151 ^ i292) | (i151 & i292);
                                                                int i296 = (i294 - (~(-(-(((~i295) | 10) * 764))))) - 1;
                                                                int i297 = asBinder + 71;
                                                                int i298 = i297 % 128;
                                                                f146a = i298;
                                                                int i299 = i297 % 2;
                                                                int i300 = ~i292;
                                                                int i301 = ~((i300 ^ 10) | (i300 & 10));
                                                                int i302 = ~(i150 | 10);
                                                                int i303 = ((i301 & i302) | (i301 ^ i302)) * (-1528);
                                                                int i304 = ((i296 | i303) << 1) - (i296 ^ i303);
                                                                int i305 = ~((i300 ^ 10) | (i300 & 10));
                                                                int i306 = (i298 & 11) + (i298 | 11);
                                                                asBinder = i306 % 128;
                                                                if (i306 % 2 != 0) {
                                                                    int i307 = (~(((-11) ^ i292) | ((-11) & i292))) | i305;
                                                                    int i308 = ~((i292 & i150) | (i150 ^ i292));
                                                                    Object[] objArr78 = new Object[1];
                                                                    c(cArr5, b8, i304 << (((i308 & i307) | (i307 ^ i308)) * 764), objArr78);
                                                                    objArr61 = (Object[]) cls7.getField((String) objArr78[0]).get(objInvoke2);
                                                                    length = objArr61.length;
                                                                    i141 = 1;
                                                                } else {
                                                                    int i309 = ~((i292 & (-11)) | ((-11) ^ i292));
                                                                    int i310 = (i309 & i305) | (i305 ^ i309);
                                                                    int i311 = ~i295;
                                                                    int i312 = -(-(((i310 & i311) | (i310 ^ i311)) * 764));
                                                                    int i313 = (i304 ^ i312) + ((i312 & i304) << 1);
                                                                    Object[] objArr79 = new Object[1];
                                                                    c(cArr5, b8, i313, objArr79);
                                                                    objArr61 = (Object[]) cls7.getField((String) objArr79[0]).get(objInvoke2);
                                                                    length = objArr61.length;
                                                                    i141 = 0;
                                                                }
                                                                while (true) {
                                                                    if (i141 < length) {
                                                                        Object obj4 = objArr61[i141];
                                                                        int i314 = -(-(ViewConfiguration.getScrollBarFadeDuration() >> 16));
                                                                        Object[] objArr80 = new Object[1];
                                                                        e(new char[]{9353, 670, 59010, 52889, 37889, 2015, 42077, 50217}, (i314 & 5) + (i314 | 5), objArr80);
                                                                        try {
                                                                            Object[] objArr81 = {(String) objArr80[0]};
                                                                            char[] cArr6 = {54057, 16981, 30175, 27491, 2172, 39308, 53753, 64623, 56138, 58977, 31965, 19151, 39244, 16705, 8286, 48251, 8346, 2808, 62490, 25514, 19758, 44070, 34974, 39746, 6122, 41954, 27148, 39057, 37800, 705, 53244, 47544, 13623, 4251, 44482, 19297, 41947, 16904, 6618, 14764};
                                                                            int i315 = -(SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1));
                                                                            int iTuitionPaymentFragmentspecialinlinedviewModeldefault5 = R.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                                                                            int i316 = asBinder + 9;
                                                                            f146a = i316 % 128;
                                                                            if (i316 % 2 == 0) {
                                                                                i142 = ((-575) / i315) / (-36800);
                                                                                int i317 = ~i315;
                                                                                i143 = ~((i317 & (-39)) | (i317 ^ (-39)));
                                                                            } else {
                                                                                i142 = (i315 * (-575)) - 21850;
                                                                                int i318 = ~i315;
                                                                                i143 = ~((i318 & (-39)) | (i318 ^ (-39)));
                                                                            }
                                                                            int i319 = 576 * (i143 | (~(((-39) ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault5) | ((-39) & iTuitionPaymentFragmentspecialinlinedviewModeldefault5))));
                                                                            int i320 = (i142 ^ i319) + ((i142 & i319) << 1);
                                                                            int i321 = ~i315;
                                                                            int i322 = ~((i321 ^ 38) | (i321 & 38));
                                                                            int i323 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault5;
                                                                            int i324 = ~(i315 | ((-39) ^ i323) | ((-39) & i323));
                                                                            Object[] objArr82 = new Object[1];
                                                                            e(cArr6, i320 + (((i324 & i322) | (i322 ^ i324)) * 576) + ((~((i321 ^ (-39)) | (i321 & (-39)))) * 576), objArr82);
                                                                            Class<?> cls8 = Class.forName((String) objArr82[0]);
                                                                            char[] cArr7 = {25, 15, 14, '!', '\r', '\b', 20, '/', '\t', '(', 13944};
                                                                            int i325 = asBinder;
                                                                            int i326 = ((i325 | 105) << 1) - (i325 ^ 105);
                                                                            f146a = i326 % 128;
                                                                            if (i326 % 2 == 0) {
                                                                                bIndexOf = (byte) (2 >>> TextUtils.indexOf("", ""));
                                                                                i144 = (TypedValue.complexToFloat(1) > 2.0f ? 1 : (TypedValue.complexToFloat(1) == 2.0f ? 0 : -1));
                                                                                i145 = 37;
                                                                            } else {
                                                                                bIndexOf = (byte) (121 - TextUtils.indexOf("", ""));
                                                                                i144 = (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1));
                                                                                i145 = 11;
                                                                            }
                                                                            int i327 = i144 * (-419);
                                                                            int i328 = -(-(i145 * 421));
                                                                            int i329 = ((i327 | i328) << 1) - (i328 ^ i327);
                                                                            int i330 = (~((i145 ^ i136) | (i145 & i136))) * TypedValues.CycleType.TYPE_EASING;
                                                                            int i331 = ((i329 | i330) << 1) - (i329 ^ i330);
                                                                            int i332 = ~i144;
                                                                            int i333 = -(-(((i145 ^ i332) | (i332 & i145)) * (-420)));
                                                                            int i334 = ((i331 | i333) << 1) - (i333 ^ i331);
                                                                            int i335 = ~i144;
                                                                            int i336 = ~i145;
                                                                            int i337 = ~((i335 & i336) | (i335 ^ i336));
                                                                            int i338 = ~((i151 ^ i145) | (i145 & i151));
                                                                            int i339 = -(-(((i337 & i338) | (i337 ^ i338)) * TypedValues.CycleType.TYPE_EASING));
                                                                            int i340 = (i334 ^ i339) + ((i334 & i339) << 1);
                                                                            Object[] objArr83 = new Object[1];
                                                                            c(cArr7, bIndexOf, i340, objArr83);
                                                                            Object objInvoke3 = cls8.getMethod((String) objArr83[0], String.class).invoke(null, objArr81);
                                                                            try {
                                                                                Object[] objArr84 = new Object[1];
                                                                                e(new char[]{20505, 3333, 11142, 29317, 39252, 48642, 5314, 61764, 28493, 33158, 59956, 37397, 25824, 54042, 61191, 14228, 1220, 13993, 27261, 34111, 27624, 26009, 34581, 25212, 7116, 53401, 20490, 30633, 39106, 17804}, 26 - (~(SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1))), objArr84);
                                                                                Class<?> cls9 = Class.forName((String) objArr84[0]);
                                                                                char[] cArr8 = {16, '\f', '\n', 31, 20, 19, '%', 15, 20, ',', 13834};
                                                                                int tapTimeout = ViewConfiguration.getTapTimeout() >> 16;
                                                                                int i341 = tapTimeout * 567;
                                                                                int i342 = (i341 ^ (-22035)) + ((i341 & (-22035)) << 1);
                                                                                int i343 = f146a;
                                                                                int i344 = (i343 & 75) + (i343 | 75);
                                                                                Object[] objArr85 = objArr61;
                                                                                asBinder = i344 % 128;
                                                                                if (i344 % 2 != 0) {
                                                                                    try {
                                                                                        throw null;
                                                                                    } catch (Throwable th3) {
                                                                                        th = th3;
                                                                                        Throwable cause3 = th.getCause();
                                                                                        if (cause3 != null) {
                                                                                            throw cause3;
                                                                                        }
                                                                                        throw th;
                                                                                    }
                                                                                }
                                                                                int i345 = ~tapTimeout;
                                                                                int i346 = -(-((-566) * ((~(i345 | i136)) | (~((i345 ^ 39) | (i345 & 39))))));
                                                                                int i347 = ((((i342 | i346) << 1) - (i346 ^ i342)) - (~(-(-((~(((-40) & tapTimeout) | ((-40) ^ tapTimeout))) * 566))))) - 1;
                                                                                int i348 = ~tapTimeout;
                                                                                int i349 = (i348 & (-40)) | (i348 ^ (-40));
                                                                                int i350 = (~((i349 & i136) | (i349 ^ i136))) * 566;
                                                                                byte b9 = (byte) ((i347 ^ i350) + ((i350 & i347) << 1));
                                                                                int i351 = i343 + 125;
                                                                                asBinder = i351 % 128;
                                                                                if (i351 % 2 != 0) {
                                                                                    int i352 = -KeyEvent.keyCodeFromString("");
                                                                                    int i353 = ((i352 | 11) << 1) - (i352 ^ 11);
                                                                                    Object[] objArr86 = new Object[1];
                                                                                    c(cArr8, b9, i353, objArr86);
                                                                                    objArr62 = null;
                                                                                    method = cls9.getMethod((String) objArr86[0], null);
                                                                                } else {
                                                                                    Object[] objArr87 = new Object[1];
                                                                                    c(cArr8, b9, 10 - (~(-(-KeyEvent.keyCodeFromString("")))), objArr87);
                                                                                    objArr62 = null;
                                                                                    method = cls9.getMethod((String) objArr87[0], null);
                                                                                }
                                                                                ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream((byte[]) method.invoke(obj4, objArr62));
                                                                                int i354 = f146a + 9;
                                                                                asBinder = i354 % 128;
                                                                                int i355 = i354 % 2;
                                                                                try {
                                                                                    Object[] objArr88 = {byteArrayInputStream};
                                                                                    int i356 = -Color.alpha(0);
                                                                                    int iTuitionPaymentFragmentspecialinlinedviewModeldefault6 = R.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                                                                                    int i357 = i356 * (-159);
                                                                                    int i358 = (i357 & (-5883)) + (i357 | (-5883));
                                                                                    int i359 = ~i356;
                                                                                    int i360 = ((i359 & 37) | (i359 ^ 37)) * 160;
                                                                                    int i361 = (i358 ^ i360) + ((i360 & i358) << 1);
                                                                                    int i362 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault6;
                                                                                    int i363 = ~(i362 | i356);
                                                                                    int i364 = ~((i356 ^ 37) | (i356 & 37));
                                                                                    int i365 = i361 + (((i363 & i364) | (i363 ^ i364)) * (-160));
                                                                                    int i366 = ~((i362 & (-38)) | ((-38) ^ i362));
                                                                                    int i367 = -(-(((i356 & i366) | (i356 ^ i366)) * 160));
                                                                                    int i368 = ((i365 | i367) << 1) - (i367 ^ i365);
                                                                                    Object[] objArr89 = new Object[1];
                                                                                    e(new char[]{54057, 16981, 30175, 27491, 2172, 39308, 53753, 64623, 56138, 58977, 31965, 19151, 39244, 16705, 8286, 48251, 8346, 2808, 62490, 25514, 19758, 44070, 34974, 39746, 6122, 41954, 27148, 39057, 37800, 705, 53244, 47544, 13623, 4251, 44482, 19297, 41947, 16904, 6618, 14764}, i368, objArr89);
                                                                                    Class<?> cls10 = Class.forName((String) objArr89[0]);
                                                                                    int i369 = -Drawable.resolveOpacity(0, 0);
                                                                                    int i370 = i369 * (-183);
                                                                                    int i371 = (i370 ^ 3515) + ((i370 & 3515) << 1);
                                                                                    int i372 = ~i369;
                                                                                    int i373 = i369 | (-20);
                                                                                    int i374 = i371 + (((i372 ^ 19) | (i372 & 19)) * (-368)) + (((i373 & i150) | (i373 ^ i150)) * 184);
                                                                                    int i375 = (~((i372 & (-20)) | (i372 ^ (-20)))) | (~((i151 ^ i369) | (i151 & i369)));
                                                                                    int i376 = ~((i369 & 19) | (i369 ^ 19));
                                                                                    int i377 = -(-(((i376 & i375) | (i375 ^ i376)) * 184));
                                                                                    int i378 = (i374 ^ i377) + ((i377 & i374) << 1);
                                                                                    Object[] objArr90 = new Object[1];
                                                                                    e(new char[]{43738, 33843, 1017, 31402, 12160, 22703, 51091, 63539, 46861, 19469, 745, 11786, 35861, 30672, 47240, 9662, 54781, 43252, 56268, 12795, 40402, 56743}, i378, objArr90);
                                                                                    Object objInvoke4 = cls10.getMethod((String) objArr90[0], InputStream.class).invoke(objInvoke3, objArr88);
                                                                                    int i379 = asBinder;
                                                                                    int i380 = (i379 & 11) + (i379 | 11);
                                                                                    f146a = i380 % 128;
                                                                                    if (i380 % 2 == 0) {
                                                                                        try {
                                                                                            cArr = new char[]{'/', '*', Typography.quote, '+', 0, '\t', 16, '\'', 15, 17, 5, 15, 23, 3, '\'', 16, 17, 20, 5, 23, 27, 20, '-', '%', 19, 17, 15, 5, '+', 5, ')', ',', 20, 19};
                                                                                            doubleTapTimeout3 = ViewConfiguration.getDoubleTapTimeout() >> 74;
                                                                                            i146 = 119;
                                                                                        } catch (Throwable th4) {
                                                                                            Throwable cause4 = th4.getCause();
                                                                                            if (cause4 != null) {
                                                                                                throw cause4;
                                                                                            }
                                                                                            throw th4;
                                                                                        }
                                                                                    } else {
                                                                                        cArr = new char[]{'/', '*', Typography.quote, '+', 0, '\t', 16, '\'', 15, 17, 5, 15, 23, 3, '\'', 16, 17, 20, 5, 23, 27, 20, '-', '%', 19, 17, 15, 5, '+', 5, ')', ',', 20, 19};
                                                                                        doubleTapTimeout3 = ViewConfiguration.getDoubleTapTimeout() >> 16;
                                                                                        i146 = 36;
                                                                                    }
                                                                                    int i381 = asBinder;
                                                                                    int i382 = (i381 & 69) + (i381 | 69);
                                                                                    f146a = i382 % 128;
                                                                                    if (i382 % 2 == 0) {
                                                                                        i147 = (934 << doubleTapTimeout3) << ((-932) >> i146);
                                                                                    } else {
                                                                                        int i383 = doubleTapTimeout3 * 934;
                                                                                        int i384 = i146 * (-932);
                                                                                        i147 = ((i383 & i384) << 1) + (i383 ^ i384);
                                                                                    }
                                                                                    int i385 = ~i146;
                                                                                    int i386 = ~((~doubleTapTimeout3) | i150);
                                                                                    int i387 = (-933) * ((i386 & i385) | (i385 ^ i386));
                                                                                    int i388 = ((i147 | i387) << 1) - (i147 ^ i387);
                                                                                    int i389 = i381 + 71;
                                                                                    f146a = i389 % 128;
                                                                                    int i390 = i389 % 2;
                                                                                    int i391 = ~((~i146) | i151);
                                                                                    int i392 = ~((i385 & doubleTapTimeout3) | (i385 ^ doubleTapTimeout3));
                                                                                    int i393 = i388 + (((i391 & i392) | (i391 ^ i392)) * 933);
                                                                                    int i394 = ~((doubleTapTimeout3 & i146) | (doubleTapTimeout3 ^ i146));
                                                                                    int i395 = (i381 & 53) + (i381 | 53);
                                                                                    f146a = i395 % 128;
                                                                                    int i396 = i395 % 2;
                                                                                    Object[] objArr91 = new Object[1];
                                                                                    c(cArr, (byte) ((i393 - (~(933 * i394))) - 1), 33 - (~(-TextUtils.getTrimmedLength(""))), objArr91);
                                                                                    Class<?> cls11 = Class.forName((String) objArr91[0]);
                                                                                    Object[] objArr92 = new Object[1];
                                                                                    e(new char[]{25369, 3937, 39345, 63706, 39130, 38163, 45097, 771, 33983, 7882, 61693, 42509, 41512, 15444, 60298, 23152, 65134, 58224, 44611, 63363, 52220, 25641, 47219, 19402, 32265, 62634}, (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 22, objArr92);
                                                                                    Object obj5 = obj3;
                                                                                    if (!obj5.equals(cls11.getMethod((String) objArr92[0], null).invoke(objInvoke4, null))) {
                                                                                        try {
                                                                                            char[] cArr9 = {'/', '*', Typography.quote, '+', 0, '\t', 16, '\'', 15, 17, 5, 15, 23, 3, '\'', 16, 17, 20, 5, 23, 27, 20, '-', '%', 19, 17, 15, 5, '+', 5, ')', ',', 20, 19};
                                                                                            int i397 = (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
                                                                                            Object[] objArr93 = new Object[1];
                                                                                            c(cArr9, (byte) ((i397 & 36) + (i397 | 36)), View.MeasureSpec.makeMeasureSpec(0, 0) + 34, objArr93);
                                                                                            Class<?> cls12 = Class.forName((String) objArr93[0]);
                                                                                            char[] cArr10 = {25369, 3937, 39345, 63706, 39130, 38163, 45097, 771, 33983, 7882, 61693, 42509, 41512, 15444, 60298, 23152, 65134, 58224, 44611, 63363, 52220, 25641, 47219, 19402, 32265, 62634};
                                                                                            int i398 = asBinder + 35;
                                                                                            f146a = i398 % 128;
                                                                                            if (i398 % 2 != 0) {
                                                                                                int gidForName4 = Process.getGidForName("");
                                                                                                int iTuitionPaymentFragmentspecialinlinedviewModeldefault7 = R.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                                                                                                int i399 = asBinder + 99;
                                                                                                int i400 = i399 % 128;
                                                                                                f146a = i400;
                                                                                                if (i399 % 2 == 0) {
                                                                                                    int i401 = -(-gidForName4);
                                                                                                    i148 = (((-559) ^ i401) + ((i401 & (-559)) << 1)) << 9;
                                                                                                } else {
                                                                                                    i148 = ((-559) * gidForName4) + 13464;
                                                                                                }
                                                                                                int i402 = (-560) * (~((~iTuitionPaymentFragmentspecialinlinedviewModeldefault7) | gidForName4));
                                                                                                int i403 = (i148 ^ i402) + ((i148 & i402) << 1);
                                                                                                int i404 = ((-25) ^ gidForName4) | ((-25) & gidForName4);
                                                                                                int i405 = (~((i404 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault7) | (i404 & iTuitionPaymentFragmentspecialinlinedviewModeldefault7))) * (-560);
                                                                                                int i406 = ((i403 | i405) << 1) - (i405 ^ i403);
                                                                                                int i407 = ~gidForName4;
                                                                                                int i408 = ~((i407 & 24) | (i407 ^ 24));
                                                                                                int i409 = (i400 ^ 17) + ((i400 & 17) << 1);
                                                                                                asBinder = i409 % 128;
                                                                                                int i410 = i409 % 2;
                                                                                                int i411 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault7;
                                                                                                if (i410 != 0) {
                                                                                                    int i412 = ~((i411 & 24) | (i411 ^ 24));
                                                                                                    Object[] objArr94 = new Object[1];
                                                                                                    e(cArr10, i406 % (560 % ((i408 & i412) | (i408 ^ i412))), objArr94);
                                                                                                    method2 = cls12.getMethod((String) objArr94[0], null);
                                                                                                    objArr63 = null;
                                                                                                } else {
                                                                                                    int i413 = ~(i411 | 24);
                                                                                                    Object[] objArr95 = new Object[1];
                                                                                                    e(cArr10, (i406 - (~(((i408 & i413) | (i408 ^ i413)) * 560))) - 1, objArr95);
                                                                                                    objArr63 = null;
                                                                                                    method2 = cls12.getMethod((String) objArr95[0], null);
                                                                                                }
                                                                                                int i414 = f146a + 19;
                                                                                                asBinder = i414 % 128;
                                                                                                int i415 = i414 % 2;
                                                                                                Object objInvoke5 = method2.invoke(objInvoke4, objArr63);
                                                                                                Object obj6 = obj2;
                                                                                                if (!obj6.equals(objInvoke5)) {
                                                                                                    i141++;
                                                                                                    int i416 = asBinder + 55;
                                                                                                    f146a = i416 % 128;
                                                                                                    int i417 = i416 % 2;
                                                                                                    objArr61 = objArr85;
                                                                                                    obj2 = obj6;
                                                                                                    obj3 = obj5;
                                                                                                }
                                                                                            } else {
                                                                                                Process.getGidForName("");
                                                                                                R.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                                                                                                throw null;
                                                                                            }
                                                                                        } catch (Throwable th5) {
                                                                                            Throwable cause5 = th5.getCause();
                                                                                            if (cause5 != null) {
                                                                                                throw cause5;
                                                                                            }
                                                                                            throw th5;
                                                                                        }
                                                                                    }
                                                                                    Object[] objArr96 = {new int[]{i136}, new int[1], new int[]{(~(i136 & 1)) & (i136 | 1)}, null};
                                                                                    int iMyUid = Process.myUid();
                                                                                    int i418 = (-158976548) + (((-133773292) | iMyUid) * 614);
                                                                                    int i419 = ~iMyUid;
                                                                                    int i420 = i418 + (((~((-355755745) | i419)) | 268713984 | (~((-315445516) | i419))) * (-1228)) + (((~(i419 | (-46731532))) | (~((-87041761) | i419))) * 614);
                                                                                    int i421 = (i137 - (~(-(-((i420 & 16) + (i420 | 16)))))) - 1;
                                                                                    int i422 = i421 << 13;
                                                                                    int i423 = (i421 | i422) & (~(i421 & i422));
                                                                                    int i424 = i423 >>> 17;
                                                                                    int i425 = (i423 | i424) & (~(i423 & i424));
                                                                                    int i426 = i425 << 5;
                                                                                    ((int[]) objArr96[1])[0] = ((~i425) & i426) | ((~i426) & i425);
                                                                                    return objArr96;
                                                                                } catch (Throwable th6) {
                                                                                    Throwable cause6 = th6.getCause();
                                                                                    if (cause6 != null) {
                                                                                        throw cause6;
                                                                                    }
                                                                                    throw th6;
                                                                                }
                                                                            } catch (Throwable th7) {
                                                                                th = th7;
                                                                            }
                                                                        } catch (Throwable th8) {
                                                                            Throwable cause7 = th8.getCause();
                                                                            if (cause7 != null) {
                                                                                throw cause7;
                                                                            }
                                                                            throw th8;
                                                                        }
                                                                    }
                                                                    r3 = i137;
                                                                }
                                                            } catch (Throwable unused5) {
                                                            }
                                                        } catch (Throwable th9) {
                                                            Throwable cause8 = th9.getCause();
                                                            if (cause8 != null) {
                                                                throw cause8;
                                                            }
                                                            throw th9;
                                                        }
                                                    } catch (Throwable th10) {
                                                        th = th10;
                                                        Throwable cause9 = th.getCause();
                                                        if (cause9 != null) {
                                                            throw cause9;
                                                        }
                                                        throw th;
                                                    }
                                                } catch (Throwable th11) {
                                                    th = th11;
                                                }
                                            } catch (Throwable th12) {
                                                Throwable cause10 = th12.getCause();
                                                if (cause10 != null) {
                                                    throw cause10;
                                                }
                                                throw th12;
                                            }
                                        } catch (Throwable th13) {
                                            Throwable cause11 = th13.getCause();
                                            if (cause11 != null) {
                                                throw cause11;
                                            }
                                            throw th13;
                                        }
                                    } catch (Throwable th14) {
                                        Throwable cause12 = th14.getCause();
                                        if (cause12 != null) {
                                            throw cause12;
                                        }
                                        throw th14;
                                    }
                                } catch (Throwable unused6) {
                                }
                            } catch (Throwable unused7) {
                                r3 = i137;
                            }
                        } else {
                            r3 = i137;
                        }
                        Object[] objArr97 = new Object[4];
                        int[] iArr3 = new int[1];
                        objArr97[0] = iArr3;
                        objArr97[1] = new int[1];
                        int[] iArr4 = new int[1];
                        objArr97[2] = iArr4;
                        int i427 = ~i136;
                        int i428 = -(-((((-29851939) & i427) | ((-29851939) ^ i427)) * (-757)));
                        int i429 = (1028098622 ^ i428) + ((i428 & 1028098622) << 1);
                        int i430 = (~(((-29818913) & i136) | ((-29818913) ^ i136))) * 1514;
                        int i431 = (i429 ^ i430) + ((i430 & i429) << 1);
                        int i432 = ~((i427 & 536915287) | (536915287 ^ i427));
                        int i433 = (i432 & (-566734200)) | ((-566734200) ^ i432);
                        int i434 = ~((-33027) | i136);
                        int i435 = (i431 - (~(-(-(((i433 & i434) | (i433 ^ i434)) * 757))))) - 1;
                        int i436 = ~i136;
                        int i437 = ~(((-428082274) & i436) | ((-428082274) ^ i436));
                        int i438 = -(-(((i437 & 641270272) | (i437 ^ 641270272)) * (-591)));
                        int i439 = ((413974174 | i438) << 1) - (i438 ^ 413974174);
                        int i440 = 1715059586 | i136;
                        int i441 = ((i440 & (-1501871588)) | (i440 ^ (-1501871588))) * 591;
                        if (i435 > (i439 & i441) + (i441 | i439)) {
                            iArr3[0] = i136;
                            ((int[]) objArr97[3])[0] = i136;
                        } else {
                            iArr3[0] = i136;
                            iArr4[0] = i136;
                        }
                        objArr97[3] = null;
                        int i442 = 110950452 + (((~((-33772371) | i136)) | (-6537859)) * (-318)) + (((~((-6537859) | i136)) | (~(40096722 | i436))) * TypedValues.AttributesType.TYPE_PIVOT_TARGET) + (((~(i136 | 40096722)) | (~(i436 | (-6324353)))) * TypedValues.AttributesType.TYPE_PIVOT_TARGET);
                        int iTuitionPaymentFragmentspecialinlinedviewModeldefault8 = R.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                        int i443 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault8;
                        int i444 = (i442 * 758) + (r3 * (-756)) + (((i442 ^ i443) | (i442 & i443)) * (-757));
                        int i445 = ~r3;
                        int i446 = (i445 & i442) | (i445 ^ i442);
                        int i447 = (~((i446 & iTuitionPaymentFragmentspecialinlinedviewModeldefault8) | (i446 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault8))) * 1514;
                        int i448 = ((i444 | i447) << 1) - (i444 ^ i447);
                        int i449 = ~i442;
                        int i450 = ~r3;
                        int i451 = ~((i449 & i450) | (i449 ^ i450));
                        int i452 = asBinder;
                        int i453 = ((i452 | 27) << 1) - (i452 ^ 27);
                        f146a = i453 % 128;
                        int i454 = i453 % 2;
                        int i455 = ~((i443 & i450) | (i450 ^ i443));
                        int i456 = (i451 & i455) | (i451 ^ i455);
                        int i457 = (r3 & i442) | ((i442 ^ r3) == true ? 1 : 0);
                        int i458 = ~((iTuitionPaymentFragmentspecialinlinedviewModeldefault8 & i457) | (i457 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault8));
                        int i459 = -(-(757 * ((i458 & i456) | (i456 ^ i458))));
                        int i460 = ((i448 | i459) << 1) - (i459 ^ i448);
                        int i461 = i460 << 13;
                        int i462 = (i461 | i460) & (~(i460 & i461));
                        int i463 = i462 >>> 17;
                        int i464 = (i462 | i463) & (~(i462 & i463));
                        ((int[]) objArr97[1])[0] = i464 ^ (i464 << 5);
                        return objArr97;
                    }

                    /* JADX WARN: Code duplicated, block: B:10:0x0025  */
                    /* JADX WARN: Code duplicated, block: B:8:0x001f  */
                    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002d). Please report as a decompilation issue!!! */
                    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0025
                        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                        */
                    private static java.lang.String $$c(short r7, byte r8, short r9) {
                        /*
                            int r9 = r9 * 2
                            int r9 = 3 - r9
                            byte[] r0 = ForwardingCameraInfo.TuitionPaymentFragmentspecialinlinedviewModeldefault2.AnonymousClass3.$$a
                            int r8 = r8 + 108
                            int r7 = r7 * 3
                            int r7 = 1 - r7
                            byte[] r1 = new byte[r7]
                            r2 = 0
                            if (r0 != 0) goto L14
                            r3 = r9
                            r4 = r2
                            goto L2d
                        L14:
                            r3 = r2
                        L15:
                            r6 = r9
                            r9 = r8
                            r8 = r6
                            int r4 = r3 + 1
                            byte r5 = (byte) r9
                            r1[r3] = r5
                            if (r4 != r7) goto L25
                            java.lang.String r7 = new java.lang.String
                            r7.<init>(r1, r2)
                            return r7
                        L25:
                            int r8 = r8 + 1
                            r3 = r0[r8]
                            r6 = r9
                            r9 = r8
                            r8 = r3
                            r3 = r6
                        L2d:
                            int r8 = -r8
                            int r8 = r8 + r3
                            r3 = r4
                            goto L15
                        */
                        throw new UnsupportedOperationException("Method not decompiled: ForwardingCameraInfo.TuitionPaymentFragmentspecialinlinedviewModeldefault2.AnonymousClass3.$$c(short, byte, short):java.lang.String");
                    }
                });
            }
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault28 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1545400921);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault28 == null) {
                char cGreen2 = (char) Color.green(0);
                int maximumFlingVelocity3 = 876 - (ViewConfiguration.getMaximumFlingVelocity() >> 16);
                int edgeSlop2 = 10 - (ViewConfiguration.getEdgeSlop() >> 16);
                Object[] objArr61 = new Object[1];
                c((byte) 42, $$a[88], (short) DerHeader.TAG_CLASS_PRIVATE, objArr61);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault28 = initSession.b(cGreen2, maximumFlingVelocity3, edgeSlop2, -1199417970, false, (String) objArr61[0], null);
            }
            long j4 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault28).getLong(null);
            long jLongValue8 = ((Long) Class.forName(str3).getDeclaredMethod(str, new Class[0]).invoke(null, new Object[0])).longValue();
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault29 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-340665130);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault29 == null) {
                char cLastIndexOf = (char) (TextUtils.lastIndexOf("", '0') + 1);
                int absoluteGravity2 = Gravity.getAbsoluteGravity(0, 0) + 876;
                int i136 = 10 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
                Object[] objArr62 = new Object[1];
                c((byte) 52, $$a[14], (short) 202, objArr62);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault29 = initSession.b(cLastIndexOf, absoluteGravity2, i136, 254769921, false, (String) objArr62[0], null);
            }
            if (j4 == ((jLongValue8 - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault29).getLong(null) << 52) >>> 52)) >> 12)) {
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault30 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1435299656);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault30 == null) {
                    char size4 = (char) View.MeasureSpec.getSize(0);
                    int iResolveSizeAndState = View.resolveSizeAndState(0, 0, 0) + 876;
                    int maxKeyCode = 10 - (KeyEvent.getMaxKeyCode() >> 16);
                    byte[] bArr19 = $$a;
                    Object[] objArr63 = new Object[1];
                    c(bArr19[81], bArr19[88], (short) 202, objArr63);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault30 = initSession.b(size4, iResolveSizeAndState, maxKeyCode, 1324201839, false, (String) objArr63[0], null);
                }
                Object[] objArr64 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault30).get(null);
                objArr6 = new Object[]{new int[]{((int[]) objArr64[0])[0]}, new int[1], new int[]{((int[]) objArr64[2])[0]}, (String[]) objArr64[3]};
                int startUptimeMillis = (int) Process.getStartUptimeMillis();
                int i137 = ~((-606502211) | startUptimeMillis);
                int i138 = 1008739860 + ((539387200 | i137) * (-280)) + ((i137 | (~(566191981 | startUptimeMillis))) * 140);
                int i139 = ~((-67115011) | startUptimeMillis);
                int i140 = ~startUptimeMillis;
                int i141 = (i138 + (((~(i140 | 633306991)) | (i139 | (~((-539387201) | i140)))) * 140)) - 875778723;
                int i142 = (i141 << 13) ^ i141;
                int i143 = i142 ^ (i142 >>> 17);
                ((int[]) objArr6[1])[0] = i143 ^ (i143 << 5);
            } else {
                Object[] objArr65 = {Integer.valueOf(((Integer) Class.forName(str5).getMethod(str2, Object.class).invoke(null, this)).intValue()), -875778723};
                byte[] bArr20 = $$d;
                Object[] objArr66 = new Object[1];
                d((byte) ($$e - 3), (short) 213, bArr20[48], objArr66);
                Class<?> cls4 = Class.forName((String) objArr66[0]);
                byte b5 = bArr20[4];
                Object[] objArr67 = new Object[1];
                d(b5, (short) (b5 | 213), bArr20[329], objArr67);
                objArr6 = (Object[]) cls4.getMethod((String) objArr67[0], Integer.TYPE, Integer.TYPE).invoke(null, objArr65);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault31 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1435299656);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault31 == null) {
                    char c7 = (char) (1 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)));
                    int iIndexOf5 = TextUtils.indexOf("", "", 0, 0) + 876;
                    int iResolveOpacity2 = 10 - Drawable.resolveOpacity(0, 0);
                    byte[] bArr21 = $$a;
                    Object[] objArr68 = new Object[1];
                    c(bArr21[81], bArr21[88], (short) 202, objArr68);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault31 = initSession.b(c7, iIndexOf5, iResolveOpacity2, 1324201839, false, (String) objArr68[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault31).set(null, objArr6);
                try {
                    long jLongValue9 = ((Long) Class.forName(str3).getDeclaredMethod(str, new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf9 = Long.valueOf(jLongValue9);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault32 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-340665130);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault32 == null) {
                        char cIndexOf4 = (char) ((-1) - TextUtils.indexOf((CharSequence) "", '0', 0));
                        int i144 = 877 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1));
                        int keyRepeatTimeout = (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 10;
                        Object[] objArr69 = new Object[1];
                        c((byte) 52, $$a[14], (short) 202, objArr69);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault32 = initSession.b(cIndexOf4, i144, keyRepeatTimeout, 254769921, false, (String) objArr69[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault32).set(null, lValueOf9);
                    Long lValueOf10 = Long.valueOf(jLongValue9 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault33 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1545400921);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault33 == null) {
                        char cIndexOf5 = (char) TextUtils.indexOf("", "");
                        int size5 = 876 - View.MeasureSpec.getSize(0);
                        int i145 = (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 10;
                        Object[] objArr70 = new Object[1];
                        c((byte) 42, $$a[88], (short) DerHeader.TAG_CLASS_PRIVATE, objArr70);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault33 = initSession.b(cIndexOf5, size5, i145, -1199417970, false, (String) objArr70[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault33).set(null, lValueOf10);
                } catch (Exception unused5) {
                    throw new RuntimeException();
                }
            }
            int i146 = ((int[]) objArr6[2])[0];
            int i147 = ((int[]) objArr6[0])[0];
            if (i147 != i146) {
                ArrayList arrayList3 = new ArrayList();
                String[] strArr3 = (String[]) objArr6[3];
                if (strArr3 != null) {
                    int i148 = 0;
                    while (i148 < strArr3.length) {
                        arrayList3.add(strArr3[i148]);
                        i148++;
                        int i149 = asBinder + 15;
                        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i149 % 128;
                        int i150 = i149 % 2;
                    }
                }
                throw new RuntimeException(String.valueOf(i147));
            }
            int i151 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 121;
            asBinder = i151 % 128;
            int i152 = i151 % 2;
            int i153 = ((int[]) objArr6[1])[0];
            Object[] objArr71 = {new int[]{((int[]) objArr6[0])[0]}, new int[1], new int[]{((int[]) objArr6[2])[0]}, (String[]) objArr6[3]};
            int iUptimeMillis2 = (int) SystemClock.uptimeMillis();
            int i154 = ~iUptimeMillis2;
            int i155 = i153 + (-743486415) + (((~((-933133064) | i154)) | (~(892822834 | iUptimeMillis2))) * 217) + (((~(iUptimeMillis2 | (-933133064))) | 42473989) * 217) + (((~(892822834 | i154)) | 933133063) * 217);
            int i156 = i155 ^ (i155 << 13);
            int i157 = i156 ^ (i156 >>> 17);
            ((int[]) objArr71[1])[0] = i157 ^ (i157 << 5);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault34 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault34 == null) {
                char c8 = (char) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) - 1);
                int iKeyCodeFromString = KeyEvent.keyCodeFromString("") + 1031;
                int deadChar4 = 15 - KeyEvent.getDeadChar(0, 0);
                byte[] bArr22 = $$a;
                Object[] objArr72 = new Object[1];
                c(bArr22[7], bArr22[91], (short) 88, objArr72);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault34 = initSession.b(c8, iKeyCodeFromString, deadChar4, 1357589585, false, (String) objArr72[0], null);
            }
            long j5 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault34).getLong(null);
            long jLongValue10 = ((Long) Class.forName(str3).getDeclaredMethod(str, new Class[0]).invoke(null, new Object[0])).longValue();
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault35 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault35 == null) {
                char c9 = (char) ((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) - 1);
                int iBlue2 = Color.blue(0) + 1031;
                int defaultSize = 15 - View.getDefaultSize(0, 0);
                byte[] bArr23 = $$a;
                Object[] objArr73 = new Object[1];
                c(bArr23[7], bArr23[91], (short) (bArr23[12] + 1), objArr73);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault35 = initSession.b(c9, iBlue2, defaultSize, 1344079056, false, (String) objArr73[0], null);
            }
            if (j5 == ((jLongValue10 - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault35).getLong(null) << 52) >>> 52)) >> 12)) {
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault36 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault36 == null) {
                    char maximumDrawingCacheSize = (char) (ViewConfiguration.getMaximumDrawingCacheSize() >> 24);
                    int offsetBefore2 = TextUtils.getOffsetBefore("", 0) + 1031;
                    int offsetAfter2 = TextUtils.getOffsetAfter("", 0) + 15;
                    Object[] objArr74 = new Object[1];
                    c((byte) 52, (byte) ($$a[88] - 1), (short) 140, objArr74);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault36 = initSession.b(maximumDrawingCacheSize, offsetBefore2, offsetAfter2, 632103528, false, (String) objArr74[0], null);
                }
                Object[] objArr75 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault36).get(null);
                objArr7 = new Object[]{strArr, new int[]{i}, new int[1], new int[]{i}};
                int i158 = ((int[]) objArr75[3])[0];
                int i159 = ((int[]) objArr75[1])[0];
                String[] strArr4 = (String[]) objArr75[0];
                int elapsedCpuTime = (int) Process.getElapsedCpuTime();
                int i160 = ((1272823593 + (((~(443261957 | elapsedCpuTime)) | 546311018) * 576)) + (((~((~elapsedCpuTime) | 989572975)) | 141231109) * 576)) - 380349263;
                int i161 = (i160 << 13) ^ i160;
                int i162 = i161 ^ (i161 >>> 17);
                ((int[]) objArr7[2])[0] = i162 ^ (i162 << 5);
            } else {
                int iIntValue = ((Integer) Class.forName(str5).getMethod(str2, Object.class).invoke(null, this)).intValue();
                Object[] objArr76 = {-119170917};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault37 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-725886332);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault37 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault37 = initSession.b((char) (46037 - MotionEvent.axisFromString("")), Color.green(0) + 1134, 18 - (Process.myTid() >> 22), 807763283, false, null, new Class[]{Integer.TYPE});
                }
                Object[] objArr77 = {Integer.valueOf(iIntValue), 0, -1522883023, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault37).newInstance(objArr76), false};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault38 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1443305588);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault38 == null) {
                    char cNormalizeMetaState = (char) KeyEvent.normalizeMetaState(0);
                    int iIndexOf6 = 1031 - TextUtils.indexOf("", "", 0, 0);
                    int packedPositionType2 = ExpandableListView.getPackedPositionType(0L) + 15;
                    byte[] bArr24 = $$a;
                    Object[] objArr78 = new Object[1];
                    c(bArr24[7], bArr24[91], (short) 88, objArr78);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault38 = initSession.b(cNormalizeMetaState, iIndexOf6, packedPositionType2, 1298546779, false, (String) objArr78[0], new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (45993 - Color.argb(0, 0, 0, 0)), 1117 - (Process.myPid() >> 22), (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 18), Boolean.TYPE});
                }
                objArr7 = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault38).invoke(null, objArr77);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault39 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault39 == null) {
                    char scrollBarFadeDuration3 = (char) (ViewConfiguration.getScrollBarFadeDuration() >> 16);
                    int iLastIndexOf5 = TextUtils.lastIndexOf("", '0', 0) + 1032;
                    int edgeSlop3 = 15 - (ViewConfiguration.getEdgeSlop() >> 16);
                    Object[] objArr79 = new Object[1];
                    c((byte) 52, (byte) ($$a[88] - 1), (short) 140, objArr79);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault39 = initSession.b(scrollBarFadeDuration3, iLastIndexOf5, edgeSlop3, 632103528, false, (String) objArr79[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault39).set(null, objArr7);
                try {
                    long jLongValue11 = ((Long) Class.forName(str3).getDeclaredMethod(str, new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf11 = Long.valueOf(jLongValue11);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault40 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault40 == null) {
                        char offsetAfter3 = (char) TextUtils.getOffsetAfter("", 0);
                        int iAxisFromString = 1030 - MotionEvent.axisFromString("");
                        int pressedStateDuration = 15 - (ViewConfiguration.getPressedStateDuration() >> 16);
                        byte[] bArr25 = $$a;
                        Object[] objArr80 = new Object[1];
                        c(bArr25[7], bArr25[91], (short) (bArr25[12] + 1), objArr80);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault40 = initSession.b(offsetAfter3, iAxisFromString, pressedStateDuration, 1344079056, false, (String) objArr80[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault40).set(null, lValueOf11);
                    Long lValueOf12 = Long.valueOf(jLongValue11 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault41 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault41 == null) {
                        char packedPositionChild3 = (char) ((-1) - ExpandableListView.getPackedPositionChild(0L));
                        int i163 = 1031 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1));
                        int gidForName4 = 14 - Process.getGidForName("");
                        byte[] bArr26 = $$a;
                        Object[] objArr81 = new Object[1];
                        c(bArr26[7], bArr26[91], (short) 88, objArr81);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault41 = initSession.b(packedPositionChild3, i163, gidForName4, 1357589585, false, (String) objArr81[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault41).set(null, lValueOf12);
                } catch (Exception unused6) {
                    throw new RuntimeException();
                }
            }
            int i164 = ((int[]) objArr7[1])[0];
            int i165 = ((int[]) objArr7[3])[0];
            if (i165 != i164) {
                ArrayList arrayList4 = new ArrayList();
                String[] strArr5 = (String[]) objArr7[0];
                if (strArr5 != null) {
                    for (String str8 : strArr5) {
                        arrayList4.add(str8);
                    }
                }
                throw new RuntimeException(String.valueOf(i165));
            }
            Object[] objArr82 = {strArr, new int[]{i}, new int[1], new int[]{i}};
            int i166 = ((int[]) objArr7[2])[0];
            int i167 = ((int[]) objArr7[3])[0];
            int i168 = ((int[]) objArr7[1])[0];
            String[] strArr6 = (String[]) objArr7[0];
            int iNextInt = new Random().nextInt(1632080647);
            int i169 = ~iNextInt;
            int i170 = i166 + (-98567639) + ((172491332 | i169) * (-192)) + (((~((-69596444) | i169)) | 2192394) * (-384)) + (((~(iNextInt | 242087775)) | (~(i169 | (-67404050))) | (~((-2192395) | iNextInt))) * DerHeader.TAG_CLASS_PRIVATE);
            int i171 = (i170 << 13) ^ i170;
            int i172 = i171 ^ (i171 >>> 17);
            ((int[]) objArr82[2])[0] = i172 ^ (i172 << 5);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault42 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(118372281);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault42 == null) {
                char maximumDrawingCacheSize2 = (char) ((ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 37567);
                int i173 = (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 625;
                int i174 = (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 14;
                Object[] objArr83 = new Object[1];
                c((byte) 52, (byte) ($$a[88] - 1), (short) 140, objArr83);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault42 = initSession.b(maximumDrawingCacheSize2, i173, i174, -477065106, false, (String) objArr83[0], null);
            }
            long j6 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault42).getLong(null);
            long jLongValue12 = ((Long) Class.forName(str3).getDeclaredMethod(str, new Class[0]).invoke(null, new Object[0])).longValue();
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault43 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(559617152);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault43 == null) {
                char cRed = (char) (Color.red(0) + 37567);
                int packedPositionGroup2 = ExpandableListView.getPackedPositionGroup(0L) + 625;
                int i175 = (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 13;
                byte[] bArr27 = $$a;
                Object[] objArr84 = new Object[1];
                c(bArr27[7], bArr27[91], (short) 88, objArr84);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault43 = initSession.b(cRed, packedPositionGroup2, i175, -976899241, false, (String) objArr84[0], null);
            }
            if (j6 == ((jLongValue12 - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault43).getLong(null) << 52) >>> 52)) >> 12)) {
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault44 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(560540673);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault44 == null) {
                    char scrollBarFadeDuration4 = (char) (37567 - (ViewConfiguration.getScrollBarFadeDuration() >> 16));
                    int tapTimeout = (ViewConfiguration.getTapTimeout() >> 16) + 625;
                    int keyRepeatDelay2 = 14 - (ViewConfiguration.getKeyRepeatDelay() >> 16);
                    byte[] bArr28 = $$a;
                    Object[] objArr85 = new Object[1];
                    c(bArr28[7], bArr28[91], (short) (bArr28[12] + 1), objArr85);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault44 = initSession.b(scrollBarFadeDuration4, tapTimeout, keyRepeatDelay2, -973632554, false, (String) objArr85[0], null);
                }
                Object[] objArr86 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault44).get(null);
                int i176 = ((int[]) objArr86[2])[0];
                int i177 = ((int[]) objArr86[0])[0];
                String[] strArr7 = (String[]) objArr86[3];
                int[] iArr3 = {i176};
                int iIdentityHashCode4 = System.identityHashCode(this);
                int i178 = (((1877681684 + (((~(880805411 | iIdentityHashCode4)) | 137625796) * (-140))) + ((~(1018431207 | iIdentityHashCode4)) * 70)) + (((~(iIdentityHashCode4 | 942932709)) | 213124294) * 70)) - 1953120258;
                int i179 = (i178 << 13) ^ i178;
                int i180 = i179 ^ (i179 >>> 17);
                ((int[]) objArr8[1])[0] = i180 ^ (i180 << 5);
                objArr8 = new Object[]{new int[]{i177}, new int[1], iArr3, strArr7};
                applicationContext3 = context;
            } else {
                applicationContext3 = context;
                if (applicationContext3 == null) {
                    applicationContext4 = applicationContext3;
                } else if (applicationContext3 instanceof ContextWrapper) {
                    int i181 = asBinder + 3;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i181 % 128;
                    int i182 = i181 % 2;
                    if (((ContextWrapper) applicationContext3).getBaseContext() != null) {
                        applicationContext4 = context.getApplicationContext();
                    } else {
                        applicationContext4 = null;
                    }
                } else {
                    applicationContext4 = context.getApplicationContext();
                }
                int iIntValue2 = ((Integer) Class.forName(str5).getMethod(str2, Object.class).invoke(null, this)).intValue();
                Object[] objArr87 = new Object[1];
                a(new char[]{0, 0, 0, 0}, new char[]{48286, 50549, 1331, 51094}, (char) TextUtils.indexOf("", ""), ViewConfiguration.getFadingEdgeLength() >> 16, new char[]{7216, 11895, 18406, 41928, 27626, 2753, 16659, 50408, 65505, 23855, 21799, 24889, 65201, 16803, 25702, 23198, 41068, 52987, 62896, 2399, 19501, 10784, 17343, 3913, 59082, 6667, 48554, 4038, 55721, 22371, 25889, 48569, 53997, 59866, 32506, 57212, 50168, 22775, 2798, 20449, 51592, 40887, 42876, 54586, 59213, 5446, 17726, 5258, 34728, 24354, 27383, 61461, 54515, 16461, 15838, 3085, 51874, 29905, 12136, 39712, 61424, 52362, 61329, 23503}, objArr87);
                String str9 = (String) objArr87[0];
                Object[] objArr88 = new Object[1];
                a(new char[]{0, 0, 0, 0}, new char[]{59295, 19131, 14540, 46874}, (char) (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), View.MeasureSpec.getSize(0), new char[]{11707, 62239, 58126, 19703, 28135, 33999, 40246, 38824, 53967, 54867, 36474, 8748, 4187, 36681, 64396, 34977, 26824, 3597, 10471, 35615, 48953, 42454, 47907, 52287, 62083, 64301, 9295, 48003, 36976, 10286, 19445, 10070, 31053, 12210, 25515, 12645, 60120, 53004, 60747, 6349, 5325, 51395, 43494, 27289, 40074, 60985, 32558, 35646, 55279, 50446, 3713, 14675, 53127, 48139, 20474, 63329, 43776, 2377, 12512, 897, 64663, 29603, 44968, 56329}, objArr88);
                Object[] objArr89 = {applicationContext4, new String[]{str9, (String) objArr88[0]}, Integer.valueOf(iIntValue2), 17, -1953120258};
                byte[] bArr29 = $$d;
                Object[] objArr90 = new Object[1];
                d((byte) (bArr29[482] - 1), (short) 165, bArr29[48], objArr90);
                Class<?> cls5 = Class.forName((String) objArr90[0]);
                byte b6 = bArr29[91];
                Object[] objArr91 = new Object[1];
                d(b6, (short) (b6 | 392), bArr29[4], objArr91);
                Object[] objArr92 = (Object[]) cls5.getMethod((String) objArr91[0], Context.class, String[].class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr89);
                int i183 = ((int[]) objArr92[0])[0];
                int i184 = ((int[]) objArr92[2])[0];
                if (applicationContext4 != null) {
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault45 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(560540673);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault45 == null) {
                        char cAlpha = (char) (37567 - Color.alpha(0));
                        int iLastIndexOf6 = TextUtils.lastIndexOf("", '0', 0, 0) + 626;
                        int iAlpha = 14 - Color.alpha(0);
                        byte[] bArr30 = $$a;
                        Object[] objArr93 = new Object[1];
                        c(bArr30[7], bArr30[91], (short) (bArr30[12] + 1), objArr93);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault45 = initSession.b(cAlpha, iLastIndexOf6, iAlpha, -973632554, false, (String) objArr93[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault45).set(null, objArr92);
                    try {
                        long jLongValue13 = ((Long) Class.forName(str3).getDeclaredMethod(str, new Class[0]).invoke(null, new Object[0])).longValue();
                        Long lValueOf13 = Long.valueOf(jLongValue13);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault46 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(559617152);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault46 == null) {
                            char cRed2 = (char) (Color.red(0) + 37567);
                            int iIndexOf7 = TextUtils.indexOf("", "", 0, 0) + 625;
                            int offsetBefore3 = 14 - TextUtils.getOffsetBefore("", 0);
                            byte[] bArr31 = $$a;
                            Object[] objArr94 = new Object[1];
                            c(bArr31[7], bArr31[91], (short) 88, objArr94);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault46 = initSession.b(cRed2, iIndexOf7, offsetBefore3, -976899241, false, (String) objArr94[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault46).set(null, lValueOf13);
                        Long lValueOf14 = Long.valueOf(jLongValue13 >> 12);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault47 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(118372281);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault47 == null) {
                            char cResolveSizeAndState2 = (char) (View.resolveSizeAndState(0, 0, 0) + 37567);
                            int keyRepeatTimeout2 = (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 625;
                            int i185 = 14 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1));
                            Object[] objArr95 = new Object[1];
                            c((byte) 52, (byte) ($$a[88] - 1), (short) 140, objArr95);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault47 = initSession.b(cResolveSizeAndState2, keyRepeatTimeout2, i185, -477065106, false, (String) objArr95[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault47).set(null, lValueOf14);
                    } catch (Exception unused7) {
                        throw new RuntimeException();
                    }
                } else {
                    objArr92 = objArr92;
                }
                objArr8 = objArr92;
            }
            if (((int[]) objArr8[2])[0] != ((int[]) objArr8[0])[0]) {
                ArrayList arrayList5 = new ArrayList();
                String[] strArr8 = (String[]) objArr8[3];
                if (strArr8 != null) {
                    for (String str10 : strArr8) {
                        arrayList5.add(str10);
                    }
                }
                throw null;
            }
            int i186 = ((int[]) objArr8[1])[0];
            int i187 = ((int[]) objArr8[2])[0];
            int i188 = ((int[]) objArr8[0])[0];
            String[] strArr9 = (String[]) objArr8[3];
            int[] iArr4 = {i187};
            int[] iArr5 = {i188};
            int iIdentityHashCode5 = System.identityHashCode(this);
            int i189 = ~iIdentityHashCode5;
            int i190 = 865814196 + (((~(1608681142 | i189)) | 1114176) * (-1188));
            int i191 = (~(iIdentityHashCode5 | (-1608681143))) | 1114176;
            int i192 = ~(215056978 | i189);
            int i193 = i186 + i190 + ((i191 | i192) * 594) + (((~((-1608681143) | i189)) | 1394738340 | i192) * 594);
            int i194 = (i193 << 13) ^ i193;
            int i195 = i194 ^ (i194 >>> 17);
            ((int[]) objArr[1])[0] = i195 ^ (i195 << 5);
            Object[] objArr96 = {iArr5, new int[1], iArr4, strArr9};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault48 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1309309962);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault48 == null) {
                char c10 = (char) (53893 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)));
                int offsetAfter4 = TextUtils.getOffsetAfter("", 0) + 1320;
                int iKeyCodeFromString2 = 36 - KeyEvent.keyCodeFromString("");
                Object[] objArr97 = new Object[1];
                c((byte) 52, (byte) ($$a[88] - 1), (short) 140, objArr97);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault48 = initSession.b(c10, offsetAfter4, iKeyCodeFromString2, -1433084963, false, (String) objArr97[0], null);
            }
            if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault48).getLong(null) != -1) {
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault49 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1763547602);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault49 == null) {
                    char offsetAfter5 = (char) (TextUtils.getOffsetAfter("", 0) + 53893);
                    int scrollBarSize3 = (ViewConfiguration.getScrollBarSize() >> 8) + 1320;
                    int iLastIndexOf7 = TextUtils.lastIndexOf("", '0') + 37;
                    byte[] bArr32 = $$a;
                    Object[] objArr98 = new Object[1];
                    c(bArr32[7], bArr32[91], (short) (bArr32[12] + 1), objArr98);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault49 = initSession.b(offsetAfter5, scrollBarSize3, iLastIndexOf7, -1920778747, false, (String) objArr98[0], null);
                }
                Object[] objArr99 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault49).get(null);
                objArr9 = new Object[]{new int[]{i}, new int[1], strArr, new int[]{i}};
                int i196 = ((int[]) objArr99[0])[0];
                int i197 = ((int[]) objArr99[3])[0];
                String[] strArr10 = (String[]) objArr99[2];
                int iMyUid = Process.myUid();
                int i198 = ~iMyUid;
                int i199 = ((((~(i198 | 1215860504)) | ((~((-154767321) | i198)) | android.R.attr.taskToFrontEnterAnimation)) * (-397)) - 1368252688) + ((iMyUid | 1094779072) * 397) + 556060994;
                int i200 = (i199 << 13) ^ i199;
                int i201 = i200 ^ (i200 >>> 17);
                ((int[]) objArr9[1])[0] = i201 ^ (i201 << 5);
            } else {
                Context applicationContext5 = applicationContext3 != null ? ((applicationContext3 instanceof ContextWrapper) && ((ContextWrapper) applicationContext3).getBaseContext() == null) ? null : context.getApplicationContext() : applicationContext3;
                int iIntValue3 = ((Integer) Class.forName(str5).getMethod(str2, Object.class).invoke(null, this)).intValue();
                Object[] objArr100 = {-119170917};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault50 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(41341784);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault50 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault50 = initSession.b((char) (KeyEvent.keyCodeFromString("") + 47977), View.MeasureSpec.makeMeasureSpec(0, 0) + 1300, 20 - View.resolveSize(0, 0), -420973425, false, null, new Class[]{Integer.TYPE});
                }
                Object[] objArr101 = {applicationContext5, "com.bpjstku", 556060994, Integer.valueOf(iIntValue3), 643, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault50).newInstance(objArr100), false};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault51 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-733829592);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault51 == null) {
                    char c11 = (char) ((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 53892);
                    int iIndexOf8 = TextUtils.indexOf((CharSequence) "", '0') + 1321;
                    int iKeyCodeFromString3 = 36 - KeyEvent.keyCodeFromString("");
                    byte[] bArr33 = $$a;
                    Object[] objArr102 = new Object[1];
                    c(bArr33[7], bArr33[91], (short) (bArr33[12] + 1), objArr102);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault51 = initSession.b(c11, iIndexOf8, iKeyCodeFromString3, 819724799, false, (String) objArr102[0], new Class[]{Context.class, String.class, Integer.TYPE, Integer.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (57878 - (ViewConfiguration.getScrollDefaultDelay() >> 16)), 1394 - KeyEvent.normalizeMetaState(0), (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 75), Boolean.TYPE});
                }
                Object[] objArr103 = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault51).invoke(null, objArr101);
                if (applicationContext5 != null) {
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault52 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1763547602);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault52 == null) {
                        char modifierMetaStateMask3 = (char) (53892 - ((byte) KeyEvent.getModifierMetaStateMask()));
                        int iLastIndexOf8 = 1319 - TextUtils.lastIndexOf("", '0', 0);
                        int i202 = (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 36;
                        byte[] bArr34 = $$a;
                        Object[] objArr104 = new Object[1];
                        c(bArr34[7], bArr34[91], (short) (bArr34[12] + 1), objArr104);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault52 = initSession.b(modifierMetaStateMask3, iLastIndexOf8, i202, -1920778747, false, (String) objArr104[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault52).set(null, objArr103);
                    try {
                        long jLongValue14 = ((Long) Class.forName(str3).getDeclaredMethod(str, new Class[0]).invoke(null, new Object[0])).longValue();
                        Long lValueOf15 = Long.valueOf(jLongValue14);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault53 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1351245985);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault53 == null) {
                            char maxKeyCode2 = (char) (53893 - (KeyEvent.getMaxKeyCode() >> 16));
                            int iBlue3 = 1320 - Color.blue(0);
                            int i203 = 36 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
                            byte[] bArr35 = $$a;
                            Object[] objArr105 = new Object[1];
                            c((byte) (bArr35[27] - 1), bArr35[91], bArr35[5], objArr105);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault53 = initSession.b(maxKeyCode2, iBlue3, i203, -1273706634, false, (String) objArr105[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault53).set(null, lValueOf15);
                        Long lValueOf16 = Long.valueOf(jLongValue14 >> 12);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault54 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1309309962);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault54 == null) {
                            char cMyPid = (char) (53893 - (Process.myPid() >> 22));
                            int iAlpha2 = Color.alpha(0) + 1320;
                            int windowTouchSlop2 = 36 - (ViewConfiguration.getWindowTouchSlop() >> 8);
                            Object[] objArr106 = new Object[1];
                            c((byte) 52, (byte) ($$a[88] - 1), (short) 140, objArr106);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault54 = initSession.b(cMyPid, iAlpha2, windowTouchSlop2, -1433084963, false, (String) objArr106[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault54).set(null, lValueOf16);
                    } catch (Exception unused8) {
                        throw new RuntimeException();
                    }
                } else {
                    objArr103 = objArr103;
                }
                objArr9 = objArr103;
            }
            if (((int[]) objArr9[0])[0] != ((int[]) objArr9[3])[0]) {
                throw null;
            }
            Object[] objArr107 = {new int[]{i}, new int[1], strArr, new int[]{i}};
            int i204 = ((int[]) objArr9[1])[0];
            int i205 = ((int[]) objArr9[0])[0];
            int i206 = ((int[]) objArr9[3])[0];
            String[] strArr11 = (String[]) objArr9[2];
            int iMyPid = Process.myPid();
            int i207 = ~iMyPid;
            int i208 = i204 + 1073304871 + (((~((-430666350) | i207)) | 939961475) * (-602)) + (((~(iMyPid | (-430666350))) | 402792449 | (~(967835375 | i207))) * (-301)) + ((~(i207 | 939961475)) * 301);
            int i209 = (i208 << 13) ^ i208;
            int i210 = i209 ^ (i209 >>> 17);
            ((int[]) objArr107[1])[0] = i210 ^ (i210 << 5);
            int i211 = asBinder + 93;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i211 % 128;
            int i212 = i211 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault55 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault55 == null) {
                char jumpTapTimeout = (char) (29944 - (ViewConfiguration.getJumpTapTimeout() >> 16));
                int scrollBarSize4 = 1755 - (ViewConfiguration.getScrollBarSize() >> 8);
                int longPressTimeout3 = 23 - (ViewConfiguration.getLongPressTimeout() >> 16);
                byte[] bArr36 = $$a;
                Object[] objArr108 = new Object[1];
                c((byte) (bArr36[27] - 1), bArr36[91], bArr36[5], objArr108);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault55 = initSession.b(jumpTapTimeout, scrollBarSize4, longPressTimeout3, 986134021, false, (String) objArr108[0], null);
            }
            if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault55).getLong(null) != -1) {
                int i213 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 105;
                asBinder = i213 % 128;
                int i214 = i213 % 2;
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault56 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault56 == null) {
                    char mode2 = (char) (29944 - View.MeasureSpec.getMode(0));
                    int iMakeMeasureSpec = 1755 - View.MeasureSpec.makeMeasureSpec(0, 0);
                    int doubleTapTimeout3 = 23 - (ViewConfiguration.getDoubleTapTimeout() >> 16);
                    byte[] bArr37 = $$a;
                    Object[] objArr109 = new Object[1];
                    c(bArr37[7], bArr37[91], (short) (bArr37[12] + 1), objArr109);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault56 = initSession.b(mode2, iMakeMeasureSpec, doubleTapTimeout3, 1599039318, false, (String) objArr109[0], null);
                }
                Object[] objArr110 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault56).get(null);
                objArr10 = new Object[]{new int[]{((int[]) objArr110[0])[0]}, new int[]{((int[]) objArr110[1])[0]}, (Object[]) objArr110[2], new int[1], (String[]) objArr110[4]};
                int i215 = ~Process.myPid();
                int i216 = ~(48507638 | i215);
                int i217 = 1283968121 + ((i216 | 164094787) * 764) + (((~(i215 | 164094787)) | 35653812) * (-1528)) + ((186894773 | i216) * 764) + 380003284;
                int i218 = (i217 << 13) ^ i217;
                int i219 = i218 ^ (i218 >>> 17);
                ((int[]) objArr10[3])[0] = i219 ^ (i219 << 5);
            } else {
                int iIntValue4 = ((Integer) Class.forName(str5).getMethod(str2, Object.class).invoke(null, this)).intValue();
                Object[] objArr111 = {-119170917};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault57 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2063193834);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault57 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault57 = initSession.b((char) (Drawable.resolveOpacity(0, 0) + 42049), TextUtils.getCapsMode("", 0, 0) + 1726, TextUtils.getOffsetBefore("", 0) + 29, -1637387971, false, null, new Class[]{Integer.TYPE});
                }
                Object[] objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$7879113 = ProvinceItem.TuitionPaymentFragmentspecialinlinedviewModeldefault3$7879113(iIntValue4, 0, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault57).newInstance(objArr111), 380003284, false, true);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault58 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault58 == null) {
                    char cResolveSize = (char) (29944 - View.resolveSize(0, 0));
                    int iArgb2 = 1755 - Color.argb(0, 0, 0, 0);
                    int packedPositionGroup3 = ExpandableListView.getPackedPositionGroup(0L) + 23;
                    byte[] bArr38 = $$a;
                    Object[] objArr112 = new Object[1];
                    c(bArr38[7], bArr38[91], (short) (bArr38[12] + 1), objArr112);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault58 = initSession.b(cResolveSize, iArgb2, packedPositionGroup3, 1599039318, false, (String) objArr112[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault58).set(null, objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$7879113);
                try {
                    long jLongValue15 = ((Long) Class.forName(str3).getDeclaredMethod(str, new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf17 = Long.valueOf(jLongValue15);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault59 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1145728641);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault59 == null) {
                        char c12 = (char) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 29943);
                        int pressedStateDuration2 = 1755 - (ViewConfiguration.getPressedStateDuration() >> 16);
                        int packedPositionType3 = ExpandableListView.getPackedPositionType(0L) + 23;
                        byte[] bArr39 = $$a;
                        Object[] objArr113 = new Object[1];
                        c(bArr39[7], bArr39[91], (short) 140, objArr113);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault59 = initSession.b(c12, pressedStateDuration2, packedPositionType3, 1596667560, false, (String) objArr113[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault59).set(null, lValueOf17);
                    Long lValueOf18 = Long.valueOf(jLongValue15 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault60 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault60 == null) {
                        char c13 = (char) ((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 29943);
                        int iCombineMeasuredStates = 1755 - View.combineMeasuredStates(0, 0);
                        int iRgb = (-16777193) - Color.rgb(0, 0, 0);
                        byte[] bArr40 = $$a;
                        Object[] objArr114 = new Object[1];
                        c((byte) (bArr40[27] - 1), bArr40[91], bArr40[5], objArr114);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault60 = initSession.b(c13, iCombineMeasuredStates, iRgb, 986134021, false, (String) objArr114[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault60).set(null, lValueOf18);
                    objArr10 = objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$7879113;
                } catch (Exception unused9) {
                    throw new RuntimeException();
                }
            }
            if (((int[]) objArr10[0])[0] != ((int[]) objArr10[1])[0]) {
                ArrayList arrayList6 = new ArrayList();
                String[] strArr12 = (String[]) objArr10[4];
                if (strArr12 != null) {
                    for (String str11 : strArr12) {
                        int i220 = asBinder + 61;
                        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i220 % 128;
                        int i221 = i220 % 2;
                        arrayList6.add(str11);
                    }
                }
                throw null;
            }
            int i222 = ((int[]) objArr10[3])[0];
            Object[] objArr115 = {new int[]{((int[]) objArr10[0])[0]}, new int[]{((int[]) objArr10[1])[0]}, (Object[]) objArr10[2], new int[1], (String[]) objArr10[4]};
            int iIdentityHashCode6 = System.identityHashCode(this);
            int i223 = ~iIdentityHashCode6;
            int i224 = i222 + (-1128470084) + ((746540008 | i223) * (-757)) + ((~(1073709038 | iIdentityHashCode6)) * 1514) + (((~(iIdentityHashCode6 | (-327169031))) | (~(i223 | 533937582)) | 539771456) * 757);
            int i225 = (i224 << 13) ^ i224;
            int i226 = i225 ^ (i225 >>> 17);
            ((int[]) objArr115[3])[0] = i226 ^ (i226 << 5);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault61 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1354724972);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault61 == null) {
                char cIndexOf6 = (char) (43041 - TextUtils.indexOf((CharSequence) "", '0', 0));
                int i227 = 3111 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1));
                int iMyPid2 = (Process.myPid() >> 22) + 22;
                byte[] bArr41 = $$a;
                Object[] objArr116 = new Object[1];
                c(bArr41[7], bArr41[91], (short) 88, objArr116);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault61 = initSession.b(cIndexOf6, i227, iMyPid2, -1272852037, false, (String) objArr116[0], null);
            }
            if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault61).getLong(null) != -1) {
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault62 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-308143642);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault62 == null) {
                    char cLastIndexOf2 = (char) (TextUtils.lastIndexOf("", '0', 0, 0) + 43043);
                    int iIndexOf9 = 3110 - TextUtils.indexOf((CharSequence) "", '0', 0, 0);
                    int i228 = (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 22;
                    byte[] bArr42 = $$a;
                    Object[] objArr117 = new Object[1];
                    c((byte) (bArr42[27] - 1), bArr42[91], bArr42[5], objArr117);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault62 = initSession.b(cLastIndexOf2, iIndexOf9, i228, 154975793, false, (String) objArr117[0], null);
                }
                Object[] objArr118 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault62).get(null);
                int i229 = ((int[]) objArr118[2])[0];
                int i230 = ((int[]) objArr118[1])[0];
                String[] strArr13 = (String[]) objArr118[3];
                int[] iArr6 = {i230};
                int iMaxMemory = (int) Runtime.getRuntime().maxMemory();
                int i231 = ~iMaxMemory;
                int i232 = ((((-2124858816) + (((~((-1690081603) | i231)) | (~(1694277090 | iMaxMemory))) * (-831))) + ((~((-1679327235) | iMaxMemory)) * (-1662))) + (((~(iMaxMemory | 1690081602)) | ((~(i231 | (-14949857))) | (~(14949856 | iMaxMemory)))) * 831)) - 27245618;
                int i233 = (i232 << 13) ^ i232;
                int i234 = i233 ^ (i233 >>> 17);
                ((int[]) objArr11[0])[0] = i234 ^ (i234 << 5);
                objArr11 = new Object[]{new int[1], iArr6, new int[]{i229}, strArr13};
            } else {
                Object[] objArr119 = {null, Integer.valueOf(((Integer) Class.forName(str5).getMethod(str2, Object.class).invoke(null, this)).intValue()), 0, -27245618};
                byte[] bArr43 = $$d;
                Object[] objArr120 = new Object[1];
                d((byte) (-bArr43[346]), (short) 107, bArr43[48], objArr120);
                Class<?> cls6 = Class.forName((String) objArr120[0]);
                byte b7 = bArr43[421];
                Object[] objArr121 = new Object[1];
                d(b7, b7, bArr43[4], objArr121);
                Object[] objArr122 = (Object[]) cls6.getMethod((String) objArr121[0], Class.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr119);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault63 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-308143642);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault63 == null) {
                    char pressedStateDuration3 = (char) ((ViewConfiguration.getPressedStateDuration() >> 16) + 43042);
                    int i235 = (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 3110;
                    int packedPositionGroup4 = 22 - ExpandableListView.getPackedPositionGroup(0L);
                    byte[] bArr44 = $$a;
                    Object[] objArr123 = new Object[1];
                    c((byte) (bArr44[27] - 1), bArr44[91], bArr44[5], objArr123);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault63 = initSession.b(pressedStateDuration3, i235, packedPositionGroup4, 154975793, false, (String) objArr123[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault63).set(null, objArr122);
                try {
                    long jLongValue16 = ((Long) Class.forName(str3).getDeclaredMethod(str, new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf19 = Long.valueOf(jLongValue16);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault64 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1355648493);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault64 == null) {
                        char cResolveSizeAndState3 = (char) (View.resolveSizeAndState(0, 0, 0) + 43042);
                        int fadingEdgeLength2 = (ViewConfiguration.getFadingEdgeLength() >> 16) + 3111;
                        int iNormalizeMetaState2 = 22 - KeyEvent.normalizeMetaState(0);
                        byte[] bArr45 = $$a;
                        Object[] objArr124 = new Object[1];
                        c(bArr45[7], bArr45[91], (short) (bArr45[12] + 1), objArr124);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault64 = initSession.b(cResolveSizeAndState3, fadingEdgeLength2, iNormalizeMetaState2, -1269618118, false, (String) objArr124[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault64).set(null, lValueOf19);
                    Long lValueOf20 = Long.valueOf(jLongValue16 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault65 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1354724972);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault65 == null) {
                        char c14 = (char) (43043 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)));
                        int iResolveOpacity3 = Drawable.resolveOpacity(0, 0) + 3111;
                        int i236 = (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 22;
                        byte[] bArr46 = $$a;
                        Object[] objArr125 = new Object[1];
                        c(bArr46[7], bArr46[91], (short) 88, objArr125);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault65 = initSession.b(c14, iResolveOpacity3, i236, -1272852037, false, (String) objArr125[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault65).set(null, lValueOf20);
                    objArr11 = objArr122;
                } catch (Exception unused10) {
                    throw new RuntimeException();
                }
            }
            int i237 = ((int[]) objArr11[1])[0];
            int i238 = ((int[]) objArr11[2])[0];
            if (i238 == i237) {
                int i239 = ((int[]) objArr11[0])[0];
                int i240 = ((int[]) objArr11[2])[0];
                int i241 = ((int[]) objArr11[1])[0];
                String[] strArr14 = (String[]) objArr11[3];
                int[] iArr7 = {i241};
                int startUptimeMillis2 = (int) Process.getStartUptimeMillis();
                int i242 = i239 + (-963839700) + (((~((-690371640) | startUptimeMillis2)) | 1014659819) * (-366)) + (((~(startUptimeMillis2 | (-17040405))) | 341328584) * 366);
                int i243 = (i242 << 13) ^ i242;
                int i244 = i243 ^ (i243 >>> 17);
                ((int[]) objArr[0])[0] = i244 ^ (i244 << 5);
                Object[] objArr126 = {new int[1], iArr7, new int[]{i240}, strArr14};
            } else {
                ArrayList arrayList7 = new ArrayList();
                String[] strArr15 = (String[]) objArr11[3];
                if (strArr15 != null) {
                    for (String str12 : strArr15) {
                        arrayList7.add(str12);
                    }
                }
                Toast.makeText((Context) null, i238 / (((i238 - 1) * i238) % 2), 0).show();
                int i245 = ((int[]) objArr11[0])[0];
                int i246 = ((int[]) objArr11[2])[0];
                int i247 = ((int[]) objArr11[1])[0];
                String[] strArr16 = (String[]) objArr11[3];
                int[] iArr8 = {i247};
                int elapsedCpuTime2 = (int) Process.getElapsedCpuTime();
                int i248 = i245 + ((((-1744362186) + (((~elapsedCpuTime2) | 807682339) * 1324)) + (((~(elapsedCpuTime2 | 824468795)) | (~(880562663 | elapsedCpuTime2))) * (-1324))) - 770133784);
                int i249 = (i248 << 13) ^ i248;
                int i250 = i249 ^ (i249 >>> 17);
                ((int[]) objArr[0])[0] = i250 ^ (i250 << 5);
                Object[] objArr127 = {new int[1], iArr8, new int[]{i246}, strArr16};
            }
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault66 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(797565291);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault66 == null) {
                char cMyTid2 = (char) (Process.myTid() >> 22);
                int touchSlop = 2267 - (ViewConfiguration.getTouchSlop() >> 8);
                int iNormalizeMetaState3 = KeyEvent.normalizeMetaState(0) + 33;
                byte[] bArr47 = $$a;
                Object[] objArr128 = new Object[1];
                c(bArr47[7], bArr47[91], (short) (bArr47[12] + 1), objArr128);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault66 = initSession.b(cMyTid2, touchSlop, iNormalizeMetaState3, -887667012, false, (String) objArr128[0], null);
            }
            if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault66).getLong(null) != -1) {
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault67 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1013250600);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault67 == null) {
                    char c15 = (char) (1 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)));
                    int iIndexOf10 = TextUtils.indexOf("", "", 0, 0) + 2267;
                    int packedPositionGroup5 = 33 - ExpandableListView.getPackedPositionGroup(0L);
                    byte[] bArr48 = $$a;
                    Object[] objArr129 = new Object[1];
                    c((byte) (bArr48[27] - 1), bArr48[91], bArr48[5], objArr129);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault67 = initSession.b(c15, iIndexOf10, packedPositionGroup5, -654680577, false, (String) objArr129[0], null);
                }
                Object[] objArr130 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault67).get(null);
                objArr12 = new Object[]{new int[]{i}, strArr, new int[1], new int[]{i}};
                int i251 = ((int[]) objArr130[0])[0];
                int i252 = ((int[]) objArr130[3])[0];
                String[] strArr17 = (String[]) objArr130[1];
                int iMaxMemory2 = (int) Runtime.getRuntime().maxMemory();
                int i253 = 1830259779 + (((~(28343299 | iMaxMemory2)) | 780370016) * 672);
                int i254 = ~iMaxMemory2;
                int i255 = ((i253 + (((~(iMaxMemory2 | 780370016)) | (~((-28343300) | i254))) * (-672))) + (((~((-780370017) | i254)) | 771981408) * 672)) - 1932033384;
                int i256 = (i255 << 13) ^ i255;
                int i257 = i256 ^ (i256 >>> 17);
                ((int[]) objArr12[2])[0] = i257 ^ (i257 << 5);
            } else {
                if (applicationContext3 != null) {
                    applicationContext3 = ((applicationContext3 instanceof ContextWrapper) && ((ContextWrapper) applicationContext3).getBaseContext() == null) ? null : context.getApplicationContext();
                }
                Object[] objArr131 = {applicationContext3, Integer.valueOf(((Integer) Class.forName(str5).getMethod(str2, Object.class).invoke(null, this)).intValue()), 0, -1932033384};
                byte[] bArr49 = $$d;
                byte b8 = (byte) (-bArr49[73]);
                short s = bArr49[4];
                Object[] objArr132 = new Object[1];
                d(b8, s, (byte) (s | 27), objArr132);
                Class<?> cls7 = Class.forName((String) objArr132[0]);
                byte b9 = bArr49[4];
                Object[] objArr133 = new Object[1];
                d(b9, (short) (b9 | 213), bArr49[329], objArr133);
                objArr12 = (Object[]) cls7.getMethod((String) objArr133[0], Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr131);
                if (applicationContext3 != null) {
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault68 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1013250600);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault68 == null) {
                        char cAlpha2 = (char) Color.alpha(0);
                        int packedPositionGroup6 = 2267 - ExpandableListView.getPackedPositionGroup(0L);
                        int maximumFlingVelocity4 = (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 33;
                        byte[] bArr50 = $$a;
                        Object[] objArr134 = new Object[1];
                        c((byte) (bArr50[27] - 1), bArr50[91], bArr50[5], objArr134);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault68 = initSession.b(cAlpha2, packedPositionGroup6, maximumFlingVelocity4, -654680577, false, (String) objArr134[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault68).set(null, objArr12);
                    try {
                        long jLongValue17 = ((Long) Class.forName(str3).getDeclaredMethod(str, new Class[0]).invoke(null, new Object[0])).longValue();
                        Long lValueOf21 = Long.valueOf(jLongValue17);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault69 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(796641770);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault69 == null) {
                            char fadingEdgeLength3 = (char) (ViewConfiguration.getFadingEdgeLength() >> 16);
                            int scrollBarSize5 = (ViewConfiguration.getScrollBarSize() >> 8) + 2267;
                            int i258 = 34 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1));
                            byte[] bArr51 = $$a;
                            Object[] objArr135 = new Object[1];
                            c(bArr51[7], bArr51[91], (short) 88, objArr135);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault69 = initSession.b(fadingEdgeLength3, scrollBarSize5, i258, -874156483, false, (String) objArr135[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault69).set(null, lValueOf21);
                        Long lValueOf22 = Long.valueOf(jLongValue17 >> 12);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault70 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(797565291);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault70 == null) {
                            char c16 = (char) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 1);
                            int iAlpha3 = 2267 - Color.alpha(0);
                            int i259 = 33 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
                            byte[] bArr52 = $$a;
                            Object[] objArr136 = new Object[1];
                            c(bArr52[7], bArr52[91], (short) (bArr52[12] + 1), objArr136);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault70 = initSession.b(c16, iAlpha3, i259, -887667012, false, (String) objArr136[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault70).set(null, lValueOf22);
                    } catch (Exception unused11) {
                        throw new RuntimeException();
                    }
                }
            }
            int i260 = ((int[]) objArr12[3])[0];
            int i261 = ((int[]) objArr12[0])[0];
            if (i261 == i260) {
                Object[] objArr137 = {new int[]{i}, strArr, new int[1], new int[]{i}};
                int i262 = ((int[]) objArr12[2])[0];
                int i263 = ((int[]) objArr12[0])[0];
                int i264 = ((int[]) objArr12[3])[0];
                String[] strArr18 = (String[]) objArr12[1];
                int iIdentityHashCode7 = System.identityHashCode(this);
                int i265 = (-2109594341) + ((~(iIdentityHashCode7 | 357833100)) * 216);
                int i266 = ~iIdentityHashCode7;
                int i267 = i262 + i265 + (((-176939604) | i266) * (-216)) + (((~(i266 | 357833100)) | 450880215) * 216);
                int i268 = (i267 << 13) ^ i267;
                int i269 = i268 ^ (i268 >>> 17);
                ((int[]) objArr137[2])[0] = i269 ^ (i269 << 5);
                return;
            }
            ArrayList arrayList8 = new ArrayList();
            String[] strArr19 = (String[]) objArr12[1];
            if (strArr19 != null) {
                for (String str13 : strArr19) {
                    arrayList8.add(str13);
                }
            }
            Toast.makeText((Context) null, i261 / (((i261 - 1) * i261) % 2), 0).show();
            Object[] objArr138 = {new int[]{i}, strArr, new int[1], new int[]{i}};
            int i270 = ((int[]) objArr12[2])[0];
            int i271 = ((int[]) objArr12[0])[0];
            int i272 = ((int[]) objArr12[3])[0];
            String[] strArr20 = (String[]) objArr12[1];
            int iElapsedRealtime = (int) SystemClock.elapsedRealtime();
            int i273 = i270 + 110749425 + (((~((-403193093) | iElapsedRealtime)) | (~((~iElapsedRealtime) | 405520223))) * (-318)) + (((~(405454085 | iElapsedRealtime)) | 66138) * (-318)) + (((~(iElapsedRealtime | (-405454086))) | (-403259231)) * TypedValues.AttributesType.TYPE_PIVOT_TARGET);
            int i274 = i273 ^ (i273 << 13);
            int i275 = i274 ^ (i274 >>> 17);
            ((int[]) objArr138[2])[0] = i275 ^ (i275 << 5);
        }

        static {
            byte[] bArr = new byte[InputDeviceCompat.SOURCE_DPAD];
            System.arraycopy("8^wí\u0000ï/Ùýû\u0006 Ñø\u0005\bï\u001aìó\nýù\u0019ì\u0002í\rù\u0010ë\u0002ìÝ\nó\tøÿ\u001cíæ\n\u0006õø,Ò\u000føø\u0006õøÿ\u0001\t\u0000ø\u0006ó\u0001ù\u0000\u0001ù\u0007ÿì\u000b\u0002ì(Ü\tý÷\u0006ýý\u0003ê\u0007ö?ñ\bð\u0001\u0004\u00034¹ü\u0003þÿûüD¶@\u0004¿\u0006ÿù\u00061¹\fðþ\bøÿ>ßæÿù\u0006\u001cÒÿø\u0000\u0001\u0001þ\u0005ñ-Ò\u0000û\rëNÕæÿù\u0006\u001cÒÿø\u0000\u0001\u0001þ\u0005ñ'Úû\u0002)Ï\u00055üÝ\nó\tøÿ\u001cíæ\n\u0006õø,Ò\u000føø\u0006õøÿ\u0001\t\u0000ø\u0006ó\u0001ù\u0000\u0001ù\u0007ÿì\u000b\u0002ì(Ü\tý÷\u0006ýý\u0003ê\u0007öAò\u0000=Åöþ\u0006ù\u00055Ëñ\bð\u0001\u0004\u00034À\u0001\u0005î\u000fí\u0007\u0002ðC¼\u0002\tüüðCËï\u00059¿ü\tý÷<²þ\u0015ïò\u0000=Åöþ\u0006ù\u00055Ëñ\bð\u0001\u0004\u00034¿\në\rñ\u0007\u0006ó<Ëïþ\fÿíBäá\u0002ûýñ.Ûû\u0005é\u000bøûò\u0000=Êð\u0004õý\u0007ôEÈ\u0001ë\u00111¹\u000eù÷\u0001\tíý\tý÷@¿ü\tý÷<º\u000bð\u0001ÿÿù\f5éÒÿ\u0006ûõ\u0003\u0019ëð\u0001ÿÿù\fò\u0000=Êð\u0004õý\u0007ôEÈ\u0001ë\u00111¼\ræ\n\u0006õøD¿ü\tý÷<º\u000bòú\u000eðýDéÏ\u000b\u0002ë\r\u0013íæ\n\u0006õø%æï\n÷\t\u000bìó\n\"Ý\u0001÷ó/àí\fÝ\nó\tøÿ\u001cíæ\n\u0006õø,Ò\u000føø\u0006õø\u0010÷ù\bùù\u0005\u001cÙ\u0006ø\të\rñ?\u0002\u0001òþ\u0002;\u0003Ãùø\rñ\u0002\u000bó<Éòÿ\tì\u0001þ\u000bõøDØñì\u0006\u0018Ú\u000eî\u000e".getBytes("ISO-8859-1"), 0, bArr, 0, InputDeviceCompat.SOURCE_DPAD);
            $$d = bArr;
            $$e = 51;
            $$a = new byte[]{39, 27, 2, 54, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, -7, 18, 16, 1, 16, 16, 4, -19, 48, 3, 17, 0, 30, -4, 24, -54, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -54, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -55, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -56, 29, -31, 48, 17, -4, 24, -1, 6, 13, 13, 29, -38, 50, 16, 1, 12, 24};
            $$b = 152;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
            asBinder = 1;
            TuitionPaymentFragmentbindingInflater1 = -6377398940819159759L;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = -981105359;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = (char) 7805;
        }

        /* JADX WARN: Code duplicated, block: B:10:0x0023  */
        /* JADX WARN: Code duplicated, block: B:8:0x001d  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x0029). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0023
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        private static java.lang.String $$g(short r7, short r8, short r9) {
            /*
                int r8 = r8 + 102
                int r7 = r7 + 4
                byte[] r0 = ForwardingCameraInfo.TuitionPaymentFragmentspecialinlinedviewModeldefault2.$$c
                int r9 = r9 * 2
                int r9 = 1 - r9
                byte[] r1 = new byte[r9]
                r2 = 0
                if (r0 != 0) goto L13
                r3 = r8
                r4 = r2
                r8 = r7
                goto L29
            L13:
                r3 = r2
            L14:
                int r7 = r7 + 1
                int r4 = r3 + 1
                byte r5 = (byte) r8
                r1[r3] = r5
                if (r4 != r9) goto L23
                java.lang.String r7 = new java.lang.String
                r7.<init>(r1, r2)
                return r7
            L23:
                r3 = r0[r7]
                r6 = r8
                r8 = r7
                r7 = r3
                r3 = r6
            L29:
                int r7 = -r7
                int r7 = r7 + r3
                r3 = r4
                r6 = r8
                r8 = r7
                r7 = r6
                goto L14
            */
            throw new UnsupportedOperationException("Method not decompiled: ForwardingCameraInfo.TuitionPaymentFragmentspecialinlinedviewModeldefault2.$$g(short, short, short):java.lang.String");
        }
    }

    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.removeCallbacksAndMessages(null);
        if (this.asInterface) {
            this.TuitionPaymentFragmentbindingInflater1.unregisterReceiver(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
            this.asInterface = false;
        }
    }
}
