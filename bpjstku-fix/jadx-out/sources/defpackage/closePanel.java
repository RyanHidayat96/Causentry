package defpackage;

import android.content.pm.PackageManager;
import android.graphics.Color;
import android.graphics.PointF;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.core.view.ViewCompat;
import com.bpjstku.presentation.membership.login.LoginActivity;
import com.google.android.material.textfield.TextInputEditText;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.List;
import kotlin.io.encoding.Base64;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class closePanel implements View.OnClickListener {
    private /* synthetic */ TextInputEditText TuitionPaymentFragmentbindingInflater1;
    private /* synthetic */ attachToWindow TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    private static final byte[] $$c = {43, 23, 22, -14};
    private static final int $$f = 191;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$d = {94, 6, -99, -107, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -56};
    private static final int $$e = 143;
    private static final byte[] $$a = {21, -108, 100, 114, -15, 8, -16, 1, 4, 3, 52, -55, -14, -1, -8, 13, -11, -8, 68, -68, 1, Base64.padSymbol, -36, -19, -4, -10, 8, -8, 0, 22, -22, -15, 11, -8, 0, -15, 0, -17, 34, -19, -4, -10, 8, -8, 0, 26, -39, 6, -11};
    private static final int $$b = 197;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 0;
    private static int b = 1;
    private static int[] TuitionPaymentFragmentspecialinlinedviewModeldefault1 = {-1620241180, 1150013976, 358854580, -436599796, 1306117987, -1516049693, -845004738, -1093079697, -703778595, -1091416885, -1088632546, -324785148, -1464282529, 2037990742, -1579070747, 356469581, -923411509, 1973352126};

    public /* synthetic */ closePanel(attachToWindow attachtowindow, TextInputEditText textInputEditText) {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = attachtowindow;
        this.TuitionPaymentFragmentbindingInflater1 = textInputEditText;
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
    private static void a(byte r6, short r7, int r8, java.lang.Object[] r9) {
        /*
            int r6 = r6 * 6
            int r6 = r6 + 97
            byte[] r0 = defpackage.closePanel.$$a
            int r8 = r8 * 32
            int r8 = 36 - r8
            int r7 = r7 * 19
            int r1 = r7 + 14
            byte[] r1 = new byte[r1]
            int r7 = r7 + 13
            r2 = 0
            if (r0 != 0) goto L19
            r4 = r7
            r6 = r8
            r3 = r2
            goto L2e
        L19:
            r3 = r2
        L1a:
            byte r4 = (byte) r6
            r1[r3] = r4
            if (r3 != r7) goto L27
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L27:
            r4 = r0[r8]
            int r3 = r3 + 1
            r5 = r8
            r8 = r6
            r6 = r5
        L2e:
            int r4 = -r4
            int r8 = r8 + r4
            int r8 = r8 + (-2)
            int r6 = r6 + 1
            r5 = r8
            r8 = r6
            r6 = r5
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.closePanel.a(byte, short, int, java.lang.Object[]):void");
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0025  */
    /* JADX WARN: Code duplicated, block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002e). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0025
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void c(byte r6, short r7, short r8, java.lang.Object[] r9) {
        /*
            int r7 = r7 * 52
            int r0 = 53 - r7
            int r8 = 103 - r8
            int r6 = r6 * 52
            int r6 = r6 + 4
            byte[] r1 = defpackage.closePanel.$$d
            byte[] r0 = new byte[r0]
            int r7 = 52 - r7
            r2 = 0
            if (r1 != 0) goto L17
            r8 = r6
            r3 = r7
            r4 = r2
            goto L2e
        L17:
            r3 = r2
        L18:
            byte r4 = (byte) r8
            r0[r3] = r4
            if (r3 != r7) goto L25
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            r9[r2] = r6
            return
        L25:
            int r3 = r3 + 1
            r4 = r1[r6]
            r5 = r8
            r8 = r6
            r6 = r4
            r4 = r3
            r3 = r5
        L2e:
            int r3 = r3 + r6
            int r6 = r3 + (-11)
            int r8 = r8 + 1
            r3 = r4
            r5 = r8
            r8 = r6
            r6 = r5
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.closePanel.c(byte, short, short, java.lang.Object[]):void");
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 53;
        b = i2 % 128;
        int i3 = i2 % 2;
        attachToWindow attachtowindow = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        if (i3 != 0) {
            attachToWindow.b(attachtowindow, this.TuitionPaymentFragmentbindingInflater1, view);
        } else {
            attachToWindow.b(attachtowindow, this.TuitionPaymentFragmentbindingInflater1, view);
            int i4 = 32 / 0;
        }
    }

    private static void d(int[] iArr, int i, Object[] objArr) throws Throwable {
        int length;
        int[] iArr2;
        int i2 = 2 % 2;
        SessionConfigValidatingBuilder sessionConfigValidatingBuilder = new SessionConfigValidatingBuilder();
        char[] cArr = new char[4];
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr3 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        char c = '0';
        int i3 = -1870535734;
        int i4 = 1;
        int i5 = 0;
        if (iArr3 != null) {
            int i6 = $11 + 115;
            $10 = i6 % 128;
            if (i6 % 2 != 0) {
                length = iArr3.length;
                iArr2 = new int[length];
            } else {
                length = iArr3.length;
                iArr2 = new int[length];
            }
            int i7 = 0;
            while (i7 < length) {
                int i8 = $11 + 21;
                $10 = i8 % 128;
                if (i8 % 2 != 0) {
                    try {
                        Object[] objArr2 = new Object[1];
                        objArr2[i5] = Integer.valueOf(iArr3[i7]);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(i3);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                            char c2 = (char) (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
                            int tapTimeout = 3291 - (ViewConfiguration.getTapTimeout() >> 16);
                            int iLastIndexOf = 30 - TextUtils.lastIndexOf("", c, i5);
                            byte b2 = (byte) ($$f & 1);
                            byte b3 = (byte) (b2 - 1);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(c2, tapTimeout, iLastIndexOf, 1948206109, false, $$g(b2, b3, (byte) (b3 - 1)), new Class[]{Integer.TYPE});
                        }
                        iArr2[i7] = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).intValue();
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                } else {
                    try {
                        Object[] objArr3 = {Integer.valueOf(iArr3[i7])};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1870535734);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                            char mode = (char) View.MeasureSpec.getMode(0);
                            int iRed = Color.red(0) + 3291;
                            int jumpTapTimeout = 31 - (ViewConfiguration.getJumpTapTimeout() >> 16);
                            byte b4 = (byte) ($$f & 1);
                            byte b5 = (byte) (b4 - 1);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(mode, iRed, jumpTapTimeout, 1948206109, false, $$g(b4, b5, (byte) (b5 - 1)), new Class[]{Integer.TYPE});
                        }
                        iArr2[i7] = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).intValue();
                        i7++;
                    } catch (Throwable th2) {
                        Throwable cause2 = th2.getCause();
                        if (cause2 == null) {
                            throw th2;
                        }
                        throw cause2;
                    }
                }
                c = '0';
                i3 = -1870535734;
                i5 = 0;
            }
            iArr3 = iArr2;
        }
        int length2 = iArr3.length;
        int[] iArr4 = new int[length2];
        int[] iArr5 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        if (iArr5 != null) {
            int length3 = iArr5.length;
            int[] iArr6 = new int[length3];
            int i9 = 0;
            while (i9 < length3) {
                try {
                    Object[] objArr4 = new Object[i4];
                    objArr4[0] = Integer.valueOf(iArr5[i9]);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1870535734);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                        char cKeyCodeFromString = (char) KeyEvent.keyCodeFromString("");
                        int iLastIndexOf2 = 3290 - TextUtils.lastIndexOf("", '0', 0);
                        int absoluteGravity = Gravity.getAbsoluteGravity(0, 0) + 31;
                        byte b6 = (byte) ($$f & 1);
                        byte b7 = (byte) (b6 - 1);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(cKeyCodeFromString, iLastIndexOf2, absoluteGravity, 1948206109, false, $$g(b6, b7, (byte) (b7 - 1)), new Class[]{Integer.TYPE});
                    }
                    iArr6[i9] = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4)).intValue();
                    i9++;
                    iArr5 = iArr5;
                    i4 = 1;
                } catch (Throwable th3) {
                    Throwable cause3 = th3.getCause();
                    if (cause3 == null) {
                        throw th3;
                    }
                    throw cause3;
                }
            }
            iArr5 = iArr6;
        }
        char c3 = 0;
        System.arraycopy(iArr5, 0, iArr4, 0, length2);
        sessionConfigValidatingBuilder.b = 2;
        while (sessionConfigValidatingBuilder.b < iArr.length) {
            cArr[c3] = (char) (iArr[sessionConfigValidatingBuilder.b] >> 16);
            cArr[1] = (char) iArr[sessionConfigValidatingBuilder.b];
            cArr[2] = (char) (iArr[sessionConfigValidatingBuilder.b + 1] >> 16);
            cArr[3] = (char) iArr[sessionConfigValidatingBuilder.b + 1];
            sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 = (cArr[0] << 16) + cArr[1];
            sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = (cArr[2] << 16) + cArr[3];
            int i10 = $11 + 57;
            $10 = i10 % 128;
            int i11 = 2;
            int i12 = i10 % 2;
            int i13 = 17;
            while (i13 > 1) {
                int i14 = $11 + 21;
                $10 = i14 % 128;
                int i15 = i14 % i11;
                sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 ^= iArr4[i13];
                Object[] objArr5 = {sessionConfigValidatingBuilder, Integer.valueOf(SessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1)), sessionConfigValidatingBuilder, sessionConfigValidatingBuilder};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-869811764);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    byte b8 = (byte) 0;
                    byte b9 = b8;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) ExpandableListView.getPackedPositionType(0L), 2559 - TextUtils.getOffsetAfter("", 0), 30 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), 683220507, false, $$g(b8, b9, (byte) (b9 - 1)), new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                }
                int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).intValue();
                sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 = sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = iIntValue;
                i13--;
                i11 = 2;
            }
            int i16 = sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1;
            sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 = sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i16;
            sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 ^= iArr4[1];
            sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 ^= iArr4[0];
            sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 ^= iArr[sessionConfigValidatingBuilder.b - 2];
            int i17 = sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            Object[] objArr6 = {sessionConfigValidatingBuilder};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(447797990);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b((char) (28878 - TextUtils.lastIndexOf("", '0', 0, 0)), 348 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), 25 - TextUtils.getCapsMode("", 0, 0), -30507727, false, "G", new Class[]{Object.class});
            }
            sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i17 ^ iArr[((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr6)).intValue()];
            cArr[0] = (char) (sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 >>> 16);
            cArr[1] = (char) sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1;
            cArr[2] = (char) (sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 >>> 16);
            cArr[3] = (char) sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            cArr2[(sessionConfigValidatingBuilder.b - 2) * 2] = cArr[0];
            cArr2[((sessionConfigValidatingBuilder.b - 2) * 2) + 1] = cArr[1];
            cArr2[((sessionConfigValidatingBuilder.b - 2) * 2) + 2] = cArr[2];
            cArr2[((sessionConfigValidatingBuilder.b - 2) * 2) + 3] = cArr[3];
            sessionConfigValidatingBuilder.b += 2;
            c3 = 0;
        }
        objArr[0] = new String(cArr2, 0, i);
    }

    /* JADX WARN: Code duplicated, block: B:125:0x08d7  */
    /* JADX WARN: Code duplicated, block: B:127:0x08e6 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:128:0x08e8  */
    /* JADX WARN: Code duplicated, block: B:130:0x08f6  */
    /* JADX WARN: Code duplicated, block: B:132:0x0903  */
    /* JADX WARN: Code duplicated, block: B:133:0x0908  */
    /* JADX WARN: Code duplicated, block: B:135:0x090d  */
    /* JADX WARN: Code duplicated, block: B:148:0x054f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:151:0x066a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:152:0x066a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:153:0x066a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:154:0x066a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:155:0x066a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:33:0x02e3  */
    /* JADX WARN: Code duplicated, block: B:35:0x02ed A[Catch: all -> 0x0674, TRY_LEAVE, TryCatch #1 {all -> 0x0674, blocks: (B:10:0x00e5, B:14:0x0181, B:17:0x01ec, B:20:0x0216, B:24:0x029a, B:30:0x02cc, B:34:0x02e5, B:38:0x032f, B:40:0x034c, B:42:0x0372, B:48:0x038e, B:53:0x03cb, B:59:0x0416, B:61:0x046e, B:63:0x04b8, B:60:0x043d, B:49:0x03a3, B:35:0x02ed, B:27:0x02b2, B:21:0x024e, B:16:0x01ac), top: B:145:0x00e5 }] */
    /* JADX WARN: Code duplicated, block: B:45:0x0380  */
    /* JADX WARN: Code duplicated, block: B:47:0x038c  */
    /* JADX WARN: Code duplicated, block: B:49:0x03a3 A[Catch: all -> 0x0674, TRY_LEAVE, TryCatch #1 {all -> 0x0674, blocks: (B:10:0x00e5, B:14:0x0181, B:17:0x01ec, B:20:0x0216, B:24:0x029a, B:30:0x02cc, B:34:0x02e5, B:38:0x032f, B:40:0x034c, B:42:0x0372, B:48:0x038e, B:53:0x03cb, B:59:0x0416, B:61:0x046e, B:63:0x04b8, B:60:0x043d, B:49:0x03a3, B:35:0x02ed, B:27:0x02b2, B:21:0x024e, B:16:0x01ac), top: B:145:0x00e5 }] */
    /* JADX WARN: Code duplicated, block: B:53:0x03cb A[Catch: all -> 0x0674, TRY_ENTER, TRY_LEAVE, TryCatch #1 {all -> 0x0674, blocks: (B:10:0x00e5, B:14:0x0181, B:17:0x01ec, B:20:0x0216, B:24:0x029a, B:30:0x02cc, B:34:0x02e5, B:38:0x032f, B:40:0x034c, B:42:0x0372, B:48:0x038e, B:53:0x03cb, B:59:0x0416, B:61:0x046e, B:63:0x04b8, B:60:0x043d, B:49:0x03a3, B:35:0x02ed, B:27:0x02b2, B:21:0x024e, B:16:0x01ac), top: B:145:0x00e5 }] */
    /* JADX WARN: Code duplicated, block: B:55:0x03db  */
    /* JADX WARN: Code duplicated, block: B:58:0x040b  */
    /* JADX WARN: Code duplicated, block: B:60:0x043d A[Catch: all -> 0x0674, TryCatch #1 {all -> 0x0674, blocks: (B:10:0x00e5, B:14:0x0181, B:17:0x01ec, B:20:0x0216, B:24:0x029a, B:30:0x02cc, B:34:0x02e5, B:38:0x032f, B:40:0x034c, B:42:0x0372, B:48:0x038e, B:53:0x03cb, B:59:0x0416, B:61:0x046e, B:63:0x04b8, B:60:0x043d, B:49:0x03a3, B:35:0x02ed, B:27:0x02b2, B:21:0x024e, B:16:0x01ac), top: B:145:0x00e5 }] */
    /* JADX WARN: Code duplicated, block: B:66:0x04d1  */
    /* JADX WARN: Code duplicated, block: B:68:0x04dc  */
    /* JADX WARN: Code duplicated, block: B:71:0x04e7  */
    /* JADX WARN: Code duplicated, block: B:73:0x04f2  */
    /* JADX WARN: Code duplicated, block: B:77:0x0562  */
    /* JADX WARN: Code duplicated, block: B:80:0x05af  */
    /* JADX WARN: Code duplicated, block: B:84:0x0608 A[Catch: all -> 0x0931, TryCatch #0 {all -> 0x0931, blocks: (B:82:0x05f2, B:84:0x0608, B:85:0x064b, B:101:0x06cf, B:103:0x06dc, B:104:0x071e, B:106:0x073c, B:107:0x0787), top: B:143:0x05f2 }] */
    /* JADX WARN: Code duplicated, block: B:89:0x0668  */
    public static int TuitionPaymentFragmentspecialinlinedviewModeldefault3(List list) throws Throwable {
        int i;
        int i2;
        int i3;
        int i4;
        String string;
        int i5;
        int i6;
        int i7;
        Method method;
        int i8;
        Class<?> cls;
        String str;
        Class<?> cls2;
        String str2;
        Class<?>[] clsArr;
        Class cls3;
        long jCurrentThreadTimeMillis;
        int i9;
        int i10;
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault2;
        int i11;
        Class<?> cls4;
        String str3;
        int i12;
        int[] iArr;
        int i13;
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault3;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int[] iArr2;
        Class<?> cls5;
        int i22;
        Object[] objArr;
        int i23;
        Object[] objArr2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5;
        int i24;
        int i25 = 2;
        int i26 = 2 % 2;
        byte[] bArr = $$a;
        byte b2 = bArr[28];
        byte b3 = bArr[7];
        Object[] objArr3 = new Object[1];
        a(b2, b3, b3, objArr3);
        Class<?> cls6 = Class.forName((String) objArr3[0]);
        byte b4 = bArr[7];
        byte b5 = bArr[28];
        Object[] objArr4 = new Object[1];
        a(b4, b5, b5, objArr4);
        Method method2 = cls6.getMethod((String) objArr4[0], String.class, PackageManager.PackageInfoFlags.class);
        Class<?> cls7 = Class.forName("android.app.ApplicationPackageManager");
        byte b6 = bArr[7];
        byte b7 = bArr[28];
        Object[] objArr5 = new Object[1];
        a(b6, b7, b7, objArr5);
        Method[] methodArr = {method2, cls7.getMethod((String) objArr5[0], String.class, PackageManager.PackageInfoFlags.class)};
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
        int i27 = 16;
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
            char gidForName = (char) ((-1) - Process.getGidForName(""));
            int i28 = (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 2822;
            int keyRepeatDelay = 22 - (ViewConfiguration.getKeyRepeatDelay() >> 16);
            byte[] bArr2 = $$d;
            byte b8 = bArr2[7];
            Object[] objArr6 = new Object[1];
            c(b8, b8, bArr2[54], objArr6);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(gidForName, i28, keyRepeatDelay, 1814927978, false, (String) objArr6[0], null);
        }
        if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).get(null) == null) {
            Method[] declaredMethods = ((Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) ((-1) - TextUtils.indexOf((CharSequence) "", '0', 0, 0)), 2823 - Color.argb(0, 0, 0, 0), 22 - (ViewConfiguration.getKeyRepeatTimeout() >> 16))).getDeclaredMethods();
            int length = declaredMethods.length;
            int i29 = 0;
            while (i29 < length) {
                Method method3 = declaredMethods[i29];
                int i30 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                int i31 = (i30 & 79) + (i30 | 79);
                b = i31 % 128;
                int i32 = i31 % i25;
                try {
                    int[] iArr3 = {1736691213, -281941402, -1636591443, 1433608027, -305359514, -1677775803, 236594644, 638474648, -1500206541, -1494617590, 353045593, 1082411269, 1498468645, 301340540};
                    int tapTimeout = ViewConfiguration.getTapTimeout() >> i27;
                    int iTuitionPaymentFragmentspecialinlinedviewModeldefault4 = LoginActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                    int i33 = (tapTimeout * (-1529)) - 18336;
                    int i34 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                    int i35 = (i34 & 63) + (i34 | 63);
                    b = i35 % 128;
                    int i36 = i35 % i25;
                    int i37 = ~tapTimeout;
                    int i38 = (i37 ^ (-25)) | (i37 & (-25));
                    int i39 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault4;
                    int i40 = ~((i38 ^ i39) | (i39 & i38));
                    int i41 = (i37 ^ 24) | (i37 & 24);
                    int i42 = ~((i41 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault4) | (i41 & iTuitionPaymentFragmentspecialinlinedviewModeldefault4));
                    int i43 = (i40 ^ i42) | (i40 & i42);
                    int i44 = (-25) | tapTimeout;
                    int i45 = ~((i44 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault4) | (i44 & iTuitionPaymentFragmentspecialinlinedviewModeldefault4));
                    int i46 = ((i43 ^ i45) | (i43 & i45)) * 765;
                    int i47 = (i33 & i46) + (i46 | i33);
                    int i48 = ~(i37 | (-25));
                    int i49 = ((i34 | 65) << 1) - (i34 ^ 65);
                    int i50 = i49 % 128;
                    b = i50;
                    int i51 = i49 % i25;
                    int i52 = ~tapTimeout;
                    int i53 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault4;
                    int i54 = ~(i52 | i53);
                    int i55 = 1530 * ((i48 ^ i54) | (i54 & i48));
                    int i56 = ((i47 | i55) << 1) - (i55 ^ i47);
                    int i57 = ~((i52 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault4) | (i52 & iTuitionPaymentFragmentspecialinlinedviewModeldefault4));
                    int i58 = ((i50 | 29) << 1) - (i50 ^ 29);
                    TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i58 % 128;
                    if (i58 % 2 != 0) {
                        int i59 = (i53 & (-25)) | ((-25) ^ i53);
                        int i60 = ~((i59 & tapTimeout) | (i59 ^ tapTimeout));
                        int i61 = -(-((i60 & i57) | (i57 ^ i60)));
                        int i62 = i56 * ((i61 & 765) + (i61 | 765));
                        Object[] objArr7 = new Object[1];
                        d(iArr3, i62, objArr7);
                        cls = Class.forName((String) objArr7[0]);
                        Object[] objArr8 = new Object[1];
                        d(new int[]{242057151, 350203296, -1925123523, 1116982916, -1799750195, 1113568715, 1946395944, -603334652}, 100 >>> TextUtils.lastIndexOf("", 'M', 1), objArr8);
                        str = (String) objArr8[0];
                    } else {
                        int i63 = (i53 & (-25)) | ((-25) ^ i53);
                        int i64 = ~((i63 & tapTimeout) | (i63 ^ tapTimeout));
                        int i65 = ((i64 & i57) | (i57 ^ i64)) * 765;
                        int i66 = ((i56 | i65) << 1) - (i56 ^ i65);
                        Object[] objArr9 = new Object[1];
                        d(iArr3, i66, objArr9);
                        cls = Class.forName((String) objArr9[0]);
                        Object[] objArr10 = new Object[1];
                        d(new int[]{242057151, 350203296, -1925123523, 1116982916, -1799750195, 1113568715, 1946395944, -603334652}, 12 - (~(-(-TextUtils.lastIndexOf("", '0', 0)))), objArr10);
                        str = (String) objArr10[0];
                    }
                    Object[] objArr11 = {Integer.valueOf(((Integer) cls.getMethod(str, null).invoke(method3, null)).intValue())};
                    int[] iArr4 = {-73168071, -952306948, -2118890611, 1095845742, -86329845, 1818414648, -1641744448, 28316643, 1113354285, 910838438, 183381352, -504257163, 856321626, 329733923, -1685242753, 1894126947};
                    int i67 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 19;
                    b = i67 % 128;
                    if (i67 % 2 == 0) {
                        Object[] objArr12 = new Object[1];
                        d(iArr4, 24 - (~(-(-(ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))))), objArr12);
                        cls2 = Class.forName((String) objArr12[0]);
                        Object[] objArr13 = new Object[1];
                        d(new int[]{2069679184, 237089465, -1939256520, 1908238245, 1594202782, -2094356739}, 5 << (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), objArr13);
                        str2 = (String) objArr13[0];
                        clsArr = new Class[0];
                    } else {
                        int i68 = (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1));
                        int i69 = ((i68 | 25) << 1) - (i68 ^ 25);
                        Object[] objArr14 = new Object[1];
                        d(iArr4, i69, objArr14);
                        cls2 = Class.forName((String) objArr14[0]);
                        int i70 = -(AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1));
                        int i71 = ((i70 | 9) << 1) - (i70 ^ 9);
                        Object[] objArr15 = new Object[1];
                        d(new int[]{2069679184, 237089465, -1939256520, 1908238245, 1594202782, -2094356739}, i71, objArr15);
                        str2 = (String) objArr15[0];
                        clsArr = new Class[1];
                    }
                    int i72 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                    int i73 = (i72 ^ 59) + ((i72 & 59) << 1);
                    b = i73 % 128;
                    if (i73 % 2 == 0) {
                        clsArr[0] = Integer.TYPE;
                        if (!(!((Boolean) cls2.getMethod(str2, clsArr).invoke(null, objArr11)).booleanValue())) {
                            cls3 = Long.TYPE;
                            int[] iArr5 = {1736691213, -281941402, -1636591443, 1433608027, -305359514, -1677775803, 236594644, 638474648, -1500206541, -1494617590, 353045593, 1082411269, 1498468645, 301340540};
                            jCurrentThreadTimeMillis = SystemClock.currentThreadTimeMillis();
                            i9 = b + 113;
                            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i9 % 128;
                            if (i9 % 2 != 0) {
                                i10 = (jCurrentThreadTimeMillis > (-1L) ? 1 : (jCurrentThreadTimeMillis == (-1L) ? 0 : -1));
                                iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = LoginActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                                i11 = (-115) % i10;
                            } else {
                                i10 = (jCurrentThreadTimeMillis > (-1L) ? 1 : (jCurrentThreadTimeMillis == (-1L) ? 0 : -1));
                                iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = LoginActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                                i11 = i10 * (-115);
                            }
                            int i74 = (i11 & (-2645)) + (i11 | (-2645));
                            int i75 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault2;
                            int i76 = (~((i75 & i10) | (i75 ^ i10) | 23)) * (-116);
                            int i77 = (i74 & i76) + (i76 | i74) + ((i10 | iTuitionPaymentFragmentspecialinlinedviewModeldefault2) * 116);
                            int i78 = ~i10;
                            int i79 = ~((i78 & (-24)) | (i78 ^ (-24)));
                            int i80 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                            int i81 = (i80 ^ 75) + ((i80 & 75) << 1);
                            b = i81 % 128;
                            int i82 = i81 % 2;
                            int i83 = (i77 - (~(116 * (i79 | (~((iTuitionPaymentFragmentspecialinlinedviewModeldefault2 & (-24)) | ((-24) ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault2))))))) - 1;
                            Object[] objArr16 = new Object[1];
                            d(iArr5, i83, objArr16);
                            cls4 = Class.forName((String) objArr16[0]);
                            int i84 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                            int i85 = (i84 & 87) + (i84 | 87);
                            b = i85 % 128;
                            int i86 = i85 % 2;
                            int iMyTid = Process.myTid() >> 22;
                            int i87 = (iMyTid ^ 13) + ((iMyTid & 13) << 1);
                            Object[] objArr17 = new Object[1];
                            d(new int[]{3181649, -1497818388, -2020031420, 382973087, 1877463275, 798965074, -1205385169, 533860561, -1517345668, -1756192146}, i87, objArr17);
                            str3 = (String) objArr17[0];
                            int i88 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 109;
                            b = i88 % 128;
                            int i89 = i88 % 2;
                            if (cls3.equals(cls4.getMethod(str3, null).invoke(method3, null))) {
                                i12 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 93;
                                b = i12 % 128;
                                if (i12 % 2 == 0) {
                                    iArr = new int[]{1736691213, -281941402, -1636591443, 1433608027, -305359514, -1677775803, 236594644, 638474648, -1500206541, -1494617590, 353045593, 1082411269, 1498468645, 301340540};
                                    i13 = -(Process.getElapsedCpuTime() > 1L ? 1 : (Process.getElapsedCpuTime() == 1L ? 0 : -1));
                                    iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = LoginActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                                    i14 = 59;
                                } else {
                                    iArr = new int[]{1736691213, -281941402, -1636591443, 1433608027, -305359514, -1677775803, 236594644, 638474648, -1500206541, -1494617590, 353045593, 1082411269, 1498468645, 301340540};
                                    i13 = -(Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1));
                                    iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = LoginActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                                    i14 = 25;
                                }
                                int i90 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                                i15 = (i90 ^ 75) + ((i90 & 75) << 1);
                                b = i15 % 128;
                                if (i15 % 2 == 0) {
                                    i16 = (((367 / i13) - (~(-(i14 * 367)))) - 1) % (((i13 ^ i14) | (i13 & i14)) - 366);
                                } else {
                                    int i91 = 367 * i13;
                                    int i92 = i14 * 367;
                                    i16 = (((i91 & i92) + (i92 | i91)) - (~((i13 | i14) * (-366)))) - 1;
                                }
                                int i93 = ~((~i14) | iTuitionPaymentFragmentspecialinlinedviewModeldefault3);
                                i17 = i16 + ((-366) * ((i93 & i13) | (i13 ^ i93)));
                                i18 = ~((~i13) | i14);
                                int i94 = ~i14;
                                i19 = (i13 & i94) | (i94 ^ i13);
                                i20 = ((i90 | 63) << 1) - (i90 ^ 63);
                                b = i20 % 128;
                                if (i20 % 2 == 0) {
                                    int i95 = -(((~(i19 | iTuitionPaymentFragmentspecialinlinedviewModeldefault3)) | i18) * 366);
                                    int i96 = ((i17 | i95) << 1) - (i95 ^ i17);
                                    Object[] objArr18 = new Object[1];
                                    d(iArr, i96, objArr18);
                                    cls5 = Class.forName((String) objArr18[0]);
                                    i22 = 40;
                                    i21 = (SystemClock.uptimeMillis() > 1L ? 1 : (SystemClock.uptimeMillis() == 1L ? 0 : -1));
                                    iArr2 = new int[]{552849327, -271449536, 1023112749, -1146245096, 1935453147, 526773307, -1151537097, -15951108, -221999367, 2110948347, 17253159, -1755595528};
                                } else {
                                    int i97 = -(-(((~((i19 & iTuitionPaymentFragmentspecialinlinedviewModeldefault3) | (i19 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault3))) | i18) * 366));
                                    int i98 = (i17 ^ i97) + ((i97 & i17) << 1);
                                    Object[] objArr19 = new Object[1];
                                    d(iArr, i98, objArr19);
                                    Class<?> cls8 = Class.forName((String) objArr19[0]);
                                    i21 = (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1));
                                    iArr2 = new int[]{552849327, -271449536, 1023112749, -1146245096, 1935453147, 526773307, -1151537097, -15951108, -221999367, 2110948347, 17253159, -1755595528};
                                    cls5 = cls8;
                                    i22 = 16;
                                }
                                int iTuitionPaymentFragmentspecialinlinedviewModeldefault5 = LoginActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                                int i99 = i21 * 221;
                                int i100 = -(-(i22 * (-219)));
                                int i101 = ((i99 | i100) << 1) - (i99 ^ i100);
                                int i102 = ~((~i21) | (~i22));
                                int i103 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault5;
                                int i104 = (i103 ^ i21) | (i103 & i21);
                                int i105 = i101 + ((i102 | (~((i104 ^ i22) | (i104 & i22)))) * 220);
                                int i106 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault5;
                                int i107 = -(-(((~((i106 & i22) | (i106 ^ i22))) | i21) * (-440)));
                                int i108 = (i105 & i107) + (i107 | i105);
                                int i109 = -(-((i22 | i21 | iTuitionPaymentFragmentspecialinlinedviewModeldefault5) * 220));
                                int i110 = (i108 & i109) + (i109 | i108);
                                int i111 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                                int i112 = ((i111 | 105) << 1) - (i111 ^ 105);
                                b = i112 % 128;
                                int i113 = i112 % 2;
                                Object[] objArr20 = new Object[1];
                                d(iArr2, i110, objArr20);
                                objArr = (Object[]) cls5.getMethod((String) objArr20[0], null).invoke(method3, null);
                                if (objArr.length == 2) {
                                    i23 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 103;
                                    b = i23 % 128;
                                    if (i23 % 2 == 0) {
                                        if (Long.TYPE.equals(objArr[1])) {
                                            int touchSlop = ViewConfiguration.getTouchSlop() >> 8;
                                            int iTuitionPaymentFragmentspecialinlinedviewModeldefault6 = LoginActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                                            int i114 = (touchSlop * (-159)) - 3816;
                                            int i115 = ~touchSlop;
                                            int i116 = -(-(((i115 & 24) | (i115 ^ 24)) * 160));
                                            int i117 = (i114 & i116) + (i114 | i116);
                                            int i118 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault6;
                                            int i119 = -(-(((~((i118 ^ touchSlop) | (i118 & touchSlop))) | (~(touchSlop | 24))) * (-160)));
                                            int i120 = (i117 & i119) + (i119 | i117);
                                            int i121 = ~((i118 & (-25)) | ((-25) ^ i118));
                                            int i122 = -(-(((touchSlop & i121) | (touchSlop ^ i121)) * 160));
                                            int i123 = (i120 & i122) + (i122 | i120);
                                            objArr2 = new Object[1];
                                            d(new int[]{1736691213, -281941402, -1636591443, 1433608027, -305359514, -1677775803, 236594644, 638474648, -1500206541, -1494617590, 353045593, 1082411269, 1498468645, 301340540}, i123, objArr2);
                                            if (Class.forName((String) objArr2[0]).equals(objArr[1])) {
                                                int i124 = b + 23;
                                                TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i124 % 128;
                                                int i125 = i124 % 2;
                                                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
                                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                                                    char scrollDefaultDelay = (char) (ViewConfiguration.getScrollDefaultDelay() >> 16);
                                                    int iNormalizeMetaState = KeyEvent.normalizeMetaState(0) + 2823;
                                                    int edgeSlop = 22 - (ViewConfiguration.getEdgeSlop() >> 16);
                                                    byte[] bArr3 = $$d;
                                                    byte b9 = bArr3[7];
                                                    Object[] objArr21 = new Object[1];
                                                    c(b9, b9, bArr3[54], objArr21);
                                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(scrollDefaultDelay, iNormalizeMetaState, edgeSlop, 1814927978, false, (String) objArr21[0], null);
                                                }
                                                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).set(null, method3);
                                                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
                                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                                    char cCombineMeasuredStates = (char) View.combineMeasuredStates(0, 0);
                                                    int packedPositionType = 2823 - ExpandableListView.getPackedPositionType(0L);
                                                    int iResolveSizeAndState = View.resolveSizeAndState(0, 0, 0) + 22;
                                                    byte[] bArr4 = $$d;
                                                    byte b10 = bArr4[7];
                                                    Object[] objArr22 = new Object[1];
                                                    c(b10, b10, bArr4[54], objArr22);
                                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cCombineMeasuredStates, packedPositionType, iResolveSizeAndState, 1814927978, false, (String) objArr22[0], null);
                                                }
                                                try {
                                                    Object[] objArr23 = {0L, ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).get(null)};
                                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1678062333);
                                                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                                                        char size = (char) View.MeasureSpec.getSize(0);
                                                        int trimmedLength = 2823 - TextUtils.getTrimmedLength("");
                                                        int absoluteGravity = 22 - Gravity.getAbsoluteGravity(0, 0);
                                                        byte[] bArr5 = $$d;
                                                        byte b11 = (byte) (-bArr5[5]);
                                                        Object[] objArr24 = new Object[1];
                                                        c(b11, b11, bArr5[7], objArr24);
                                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(size, trimmedLength, absoluteGravity, -2137287382, false, (String) objArr24[0], new Class[]{Long.TYPE, Method.class});
                                                    }
                                                    ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr23)).longValue();
                                                    int i126 = b;
                                                    i24 = (i126 ^ 107) + ((i126 & 107) << 1);
                                                    TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i24 % 128;
                                                    if (i24 % 2 != 0) {
                                                        break;
                                                    }
                                                    throw null;
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
                                    } else if (Long.TYPE.equals(objArr[0])) {
                                        int touchSlop2 = ViewConfiguration.getTouchSlop() >> 8;
                                        int iTuitionPaymentFragmentspecialinlinedviewModeldefault7 = LoginActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                                        int i1110 = (touchSlop2 * (-159)) - 3816;
                                        int i1111 = ~touchSlop2;
                                        int i1112 = -(-(((i1111 & 24) | (i1111 ^ 24)) * 160));
                                        int i1113 = (i1110 & i1112) + (i1110 | i1112);
                                        int i1114 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault7;
                                        int i1115 = -(-(((~((i1114 ^ touchSlop2) | (i1114 & touchSlop2))) | (~(touchSlop2 | 24))) * (-160)));
                                        int i127 = (i1113 & i1115) + (i1115 | i1113);
                                        int i128 = ~((i1114 & (-25)) | ((-25) ^ i1114));
                                        int i129 = -(-(((touchSlop2 & i128) | (touchSlop2 ^ i128)) * 160));
                                        int i1210 = (i127 & i129) + (i129 | i127);
                                        objArr2 = new Object[1];
                                        d(new int[]{1736691213, -281941402, -1636591443, 1433608027, -305359514, -1677775803, 236594644, 638474648, -1500206541, -1494617590, 353045593, 1082411269, 1498468645, 301340540}, i1210, objArr2);
                                        if (Class.forName((String) objArr2[0]).equals(objArr[1])) {
                                            int i1211 = b + 23;
                                            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i1211 % 128;
                                            int i1212 = i1211 % 2;
                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
                                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                                                char scrollDefaultDelay2 = (char) (ViewConfiguration.getScrollDefaultDelay() >> 16);
                                                int iNormalizeMetaState2 = KeyEvent.normalizeMetaState(0) + 2823;
                                                int edgeSlop2 = 22 - (ViewConfiguration.getEdgeSlop() >> 16);
                                                byte[] bArr6 = $$d;
                                                byte b12 = bArr6[7];
                                                Object[] objArr25 = new Object[1];
                                                c(b12, b12, bArr6[54], objArr25);
                                                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(scrollDefaultDelay2, iNormalizeMetaState2, edgeSlop2, 1814927978, false, (String) objArr25[0], null);
                                            }
                                            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).set(null, method3);
                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
                                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                                char cCombineMeasuredStates2 = (char) View.combineMeasuredStates(0, 0);
                                                int packedPositionType2 = 2823 - ExpandableListView.getPackedPositionType(0L);
                                                int iResolveSizeAndState2 = View.resolveSizeAndState(0, 0, 0) + 22;
                                                byte[] bArr7 = $$d;
                                                byte b13 = bArr7[7];
                                                Object[] objArr26 = new Object[1];
                                                c(b13, b13, bArr7[54], objArr26);
                                                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cCombineMeasuredStates2, packedPositionType2, iResolveSizeAndState2, 1814927978, false, (String) objArr26[0], null);
                                            }
                                            Object[] objArr27 = {0L, ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).get(null)};
                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1678062333);
                                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                                                char size2 = (char) View.MeasureSpec.getSize(0);
                                                int trimmedLength2 = 2823 - TextUtils.getTrimmedLength("");
                                                int absoluteGravity2 = 22 - Gravity.getAbsoluteGravity(0, 0);
                                                byte[] bArr8 = $$d;
                                                byte b14 = (byte) (-bArr8[5]);
                                                Object[] objArr28 = new Object[1];
                                                c(b14, b14, bArr8[7], objArr28);
                                                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(size2, trimmedLength2, absoluteGravity2, -2137287382, false, (String) objArr28[0], new Class[]{Long.TYPE, Method.class});
                                            }
                                            ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr27)).longValue();
                                            int i1213 = b;
                                            i24 = (i1213 ^ 107) + ((i1213 & 107) << 1);
                                            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i24 % 128;
                                            if (i24 % 2 != 0) {
                                                break;
                                            }
                                            throw null;
                                        }
                                    } else {
                                        continue;
                                    }
                                } else {
                                    continue;
                                }
                            } else {
                                continue;
                            }
                        } else {
                            continue;
                        }
                    } else {
                        clsArr[0] = Integer.TYPE;
                        if (((Boolean) cls2.getMethod(str2, clsArr).invoke(null, objArr11)).booleanValue()) {
                            cls3 = Long.TYPE;
                            int[] iArr6 = {1736691213, -281941402, -1636591443, 1433608027, -305359514, -1677775803, 236594644, 638474648, -1500206541, -1494617590, 353045593, 1082411269, 1498468645, 301340540};
                            jCurrentThreadTimeMillis = SystemClock.currentThreadTimeMillis();
                            i9 = b + 113;
                            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i9 % 128;
                            if (i9 % 2 != 0) {
                                i10 = (jCurrentThreadTimeMillis > (-1L) ? 1 : (jCurrentThreadTimeMillis == (-1L) ? 0 : -1));
                                iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = LoginActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                                i11 = (-115) % i10;
                            } else {
                                i10 = (jCurrentThreadTimeMillis > (-1L) ? 1 : (jCurrentThreadTimeMillis == (-1L) ? 0 : -1));
                                iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = LoginActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                                i11 = i10 * (-115);
                            }
                            int i710 = (i11 & (-2645)) + (i11 | (-2645));
                            int i711 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault2;
                            int i712 = (~((i711 & i10) | (i711 ^ i10) | 23)) * (-116);
                            int i713 = (i710 & i712) + (i712 | i710) + ((i10 | iTuitionPaymentFragmentspecialinlinedviewModeldefault2) * 116);
                            int i714 = ~i10;
                            int i715 = ~((i714 & (-24)) | (i714 ^ (-24)));
                            int i810 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                            int i811 = (i810 ^ 75) + ((i810 & 75) << 1);
                            b = i811 % 128;
                            int i812 = i811 % 2;
                            int i813 = (i713 - (~(116 * (i715 | (~((iTuitionPaymentFragmentspecialinlinedviewModeldefault2 & (-24)) | ((-24) ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault2))))))) - 1;
                            Object[] objArr110 = new Object[1];
                            d(iArr6, i813, objArr110);
                            cls4 = Class.forName((String) objArr110[0]);
                            int i814 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                            int i815 = (i814 & 87) + (i814 | 87);
                            b = i815 % 128;
                            int i816 = i815 % 2;
                            int iMyTid2 = Process.myTid() >> 22;
                            int i817 = (iMyTid2 ^ 13) + ((iMyTid2 & 13) << 1);
                            Object[] objArr111 = new Object[1];
                            d(new int[]{3181649, -1497818388, -2020031420, 382973087, 1877463275, 798965074, -1205385169, 533860561, -1517345668, -1756192146}, i817, objArr111);
                            str3 = (String) objArr111[0];
                            int i818 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 109;
                            b = i818 % 128;
                            int i819 = i818 % 2;
                            if (cls3.equals(cls4.getMethod(str3, null).invoke(method3, null))) {
                                i12 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 93;
                                b = i12 % 128;
                                if (i12 % 2 == 0) {
                                    iArr = new int[]{1736691213, -281941402, -1636591443, 1433608027, -305359514, -1677775803, 236594644, 638474648, -1500206541, -1494617590, 353045593, 1082411269, 1498468645, 301340540};
                                    i13 = -(Process.getElapsedCpuTime() > 1L ? 1 : (Process.getElapsedCpuTime() == 1L ? 0 : -1));
                                    iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = LoginActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                                    i14 = 59;
                                } else {
                                    iArr = new int[]{1736691213, -281941402, -1636591443, 1433608027, -305359514, -1677775803, 236594644, 638474648, -1500206541, -1494617590, 353045593, 1082411269, 1498468645, 301340540};
                                    i13 = -(Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1));
                                    iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = LoginActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                                    i14 = 25;
                                }
                                int i910 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                                i15 = (i910 ^ 75) + ((i910 & 75) << 1);
                                b = i15 % 128;
                                if (i15 % 2 == 0) {
                                    i16 = (((367 / i13) - (~(-(i14 * 367)))) - 1) % (((i13 ^ i14) | (i13 & i14)) - 366);
                                } else {
                                    int i911 = 367 * i13;
                                    int i912 = i14 * 367;
                                    i16 = (((i911 & i912) + (i912 | i911)) - (~((i13 | i14) * (-366)))) - 1;
                                }
                                int i913 = ~((~i14) | iTuitionPaymentFragmentspecialinlinedviewModeldefault3);
                                i17 = i16 + ((-366) * ((i913 & i13) | (i13 ^ i913)));
                                i18 = ~((~i13) | i14);
                                int i914 = ~i14;
                                i19 = (i13 & i914) | (i914 ^ i13);
                                i20 = ((i910 | 63) << 1) - (i910 ^ 63);
                                b = i20 % 128;
                                if (i20 % 2 == 0) {
                                    int i915 = -(((~(i19 | iTuitionPaymentFragmentspecialinlinedviewModeldefault3)) | i18) * 366);
                                    int i916 = ((i17 | i915) << 1) - (i915 ^ i17);
                                    Object[] objArr112 = new Object[1];
                                    d(iArr, i916, objArr112);
                                    cls5 = Class.forName((String) objArr112[0]);
                                    i22 = 40;
                                    i21 = (SystemClock.uptimeMillis() > 1L ? 1 : (SystemClock.uptimeMillis() == 1L ? 0 : -1));
                                    iArr2 = new int[]{552849327, -271449536, 1023112749, -1146245096, 1935453147, 526773307, -1151537097, -15951108, -221999367, 2110948347, 17253159, -1755595528};
                                } else {
                                    int i917 = -(-(((~((i19 & iTuitionPaymentFragmentspecialinlinedviewModeldefault3) | (i19 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault3))) | i18) * 366));
                                    int i918 = (i17 ^ i917) + ((i917 & i17) << 1);
                                    Object[] objArr113 = new Object[1];
                                    d(iArr, i918, objArr113);
                                    Class<?> cls9 = Class.forName((String) objArr113[0]);
                                    i21 = (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1));
                                    iArr2 = new int[]{552849327, -271449536, 1023112749, -1146245096, 1935453147, 526773307, -1151537097, -15951108, -221999367, 2110948347, 17253159, -1755595528};
                                    cls5 = cls9;
                                    i22 = 16;
                                }
                                int iTuitionPaymentFragmentspecialinlinedviewModeldefault8 = LoginActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                                int i919 = i21 * 221;
                                int i1010 = -(-(i22 * (-219)));
                                int i1011 = ((i919 | i1010) << 1) - (i919 ^ i1010);
                                int i1012 = ~((~i21) | (~i22));
                                int i1013 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault8;
                                int i1014 = (i1013 ^ i21) | (i1013 & i21);
                                int i1015 = i1011 + ((i1012 | (~((i1014 ^ i22) | (i1014 & i22)))) * 220);
                                int i1016 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault8;
                                int i1017 = -(-(((~((i1016 & i22) | (i1016 ^ i22))) | i21) * (-440)));
                                int i1018 = (i1015 & i1017) + (i1017 | i1015);
                                int i1019 = -(-((i22 | i21 | iTuitionPaymentFragmentspecialinlinedviewModeldefault8) * 220));
                                int i1116 = (i1018 & i1019) + (i1019 | i1018);
                                int i1117 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                                int i1118 = ((i1117 | 105) << 1) - (i1117 ^ 105);
                                b = i1118 % 128;
                                int i1119 = i1118 % 2;
                                Object[] objArr29 = new Object[1];
                                d(iArr2, i1116, objArr29);
                                objArr = (Object[]) cls5.getMethod((String) objArr29[0], null).invoke(method3, null);
                                if (objArr.length == 2) {
                                    i23 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 103;
                                    b = i23 % 128;
                                    if (i23 % 2 == 0) {
                                        if (Long.TYPE.equals(objArr[1])) {
                                            int touchSlop3 = ViewConfiguration.getTouchSlop() >> 8;
                                            int iTuitionPaymentFragmentspecialinlinedviewModeldefault9 = LoginActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                                            int i11110 = (touchSlop3 * (-159)) - 3816;
                                            int i11111 = ~touchSlop3;
                                            int i11112 = -(-(((i11111 & 24) | (i11111 ^ 24)) * 160));
                                            int i11113 = (i11110 & i11112) + (i11110 | i11112);
                                            int i11114 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault9;
                                            int i11115 = -(-(((~((i11114 ^ touchSlop3) | (i11114 & touchSlop3))) | (~(touchSlop3 | 24))) * (-160)));
                                            int i1214 = (i11113 & i11115) + (i11115 | i11113);
                                            int i1215 = ~((i11114 & (-25)) | ((-25) ^ i11114));
                                            int i1216 = -(-(((touchSlop3 & i1215) | (touchSlop3 ^ i1215)) * 160));
                                            int i1217 = (i1214 & i1216) + (i1216 | i1214);
                                            objArr2 = new Object[1];
                                            d(new int[]{1736691213, -281941402, -1636591443, 1433608027, -305359514, -1677775803, 236594644, 638474648, -1500206541, -1494617590, 353045593, 1082411269, 1498468645, 301340540}, i1217, objArr2);
                                            if (Class.forName((String) objArr2[0]).equals(objArr[1])) {
                                                int i1218 = b + 23;
                                                TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i1218 % 128;
                                                int i1219 = i1218 % 2;
                                                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
                                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                                                    char scrollDefaultDelay3 = (char) (ViewConfiguration.getScrollDefaultDelay() >> 16);
                                                    int iNormalizeMetaState3 = KeyEvent.normalizeMetaState(0) + 2823;
                                                    int edgeSlop3 = 22 - (ViewConfiguration.getEdgeSlop() >> 16);
                                                    byte[] bArr9 = $$d;
                                                    byte b15 = bArr9[7];
                                                    Object[] objArr210 = new Object[1];
                                                    c(b15, b15, bArr9[54], objArr210);
                                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(scrollDefaultDelay3, iNormalizeMetaState3, edgeSlop3, 1814927978, false, (String) objArr210[0], null);
                                                }
                                                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).set(null, method3);
                                                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
                                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                                    char cCombineMeasuredStates3 = (char) View.combineMeasuredStates(0, 0);
                                                    int packedPositionType3 = 2823 - ExpandableListView.getPackedPositionType(0L);
                                                    int iResolveSizeAndState3 = View.resolveSizeAndState(0, 0, 0) + 22;
                                                    byte[] bArr10 = $$d;
                                                    byte b16 = bArr10[7];
                                                    Object[] objArr211 = new Object[1];
                                                    c(b16, b16, bArr10[54], objArr211);
                                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cCombineMeasuredStates3, packedPositionType3, iResolveSizeAndState3, 1814927978, false, (String) objArr211[0], null);
                                                }
                                                Object[] objArr212 = {0L, ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).get(null)};
                                                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1678062333);
                                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                                                    char size3 = (char) View.MeasureSpec.getSize(0);
                                                    int trimmedLength3 = 2823 - TextUtils.getTrimmedLength("");
                                                    int absoluteGravity3 = 22 - Gravity.getAbsoluteGravity(0, 0);
                                                    byte[] bArr11 = $$d;
                                                    byte b17 = (byte) (-bArr11[5]);
                                                    Object[] objArr213 = new Object[1];
                                                    c(b17, b17, bArr11[7], objArr213);
                                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(size3, trimmedLength3, absoluteGravity3, -2137287382, false, (String) objArr213[0], new Class[]{Long.TYPE, Method.class});
                                                }
                                                ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr212)).longValue();
                                                int i12110 = b;
                                                i24 = (i12110 ^ 107) + ((i12110 & 107) << 1);
                                                TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i24 % 128;
                                                if (i24 % 2 != 0) {
                                                    break;
                                                }
                                                throw null;
                                            }
                                        } else {
                                            continue;
                                        }
                                    } else if (Long.TYPE.equals(objArr[0])) {
                                        int touchSlop4 = ViewConfiguration.getTouchSlop() >> 8;
                                        int iTuitionPaymentFragmentspecialinlinedviewModeldefault10 = LoginActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                                        int i11116 = (touchSlop4 * (-159)) - 3816;
                                        int i11117 = ~touchSlop4;
                                        int i11118 = -(-(((i11117 & 24) | (i11117 ^ 24)) * 160));
                                        int i11119 = (i11116 & i11118) + (i11116 | i11118);
                                        int i111110 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault10;
                                        int i111111 = -(-(((~((i111110 ^ touchSlop4) | (i111110 & touchSlop4))) | (~(touchSlop4 | 24))) * (-160)));
                                        int i12111 = (i11119 & i111111) + (i111111 | i11119);
                                        int i12112 = ~((i111110 & (-25)) | ((-25) ^ i111110));
                                        int i12113 = -(-(((touchSlop4 & i12112) | (touchSlop4 ^ i12112)) * 160));
                                        int i12114 = (i12111 & i12113) + (i12113 | i12111);
                                        objArr2 = new Object[1];
                                        d(new int[]{1736691213, -281941402, -1636591443, 1433608027, -305359514, -1677775803, 236594644, 638474648, -1500206541, -1494617590, 353045593, 1082411269, 1498468645, 301340540}, i12114, objArr2);
                                        if (Class.forName((String) objArr2[0]).equals(objArr[1])) {
                                            int i12115 = b + 23;
                                            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i12115 % 128;
                                            int i12116 = i12115 % 2;
                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
                                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                                                char scrollDefaultDelay4 = (char) (ViewConfiguration.getScrollDefaultDelay() >> 16);
                                                int iNormalizeMetaState4 = KeyEvent.normalizeMetaState(0) + 2823;
                                                int edgeSlop4 = 22 - (ViewConfiguration.getEdgeSlop() >> 16);
                                                byte[] bArr12 = $$d;
                                                byte b18 = bArr12[7];
                                                Object[] objArr214 = new Object[1];
                                                c(b18, b18, bArr12[54], objArr214);
                                                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(scrollDefaultDelay4, iNormalizeMetaState4, edgeSlop4, 1814927978, false, (String) objArr214[0], null);
                                            }
                                            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).set(null, method3);
                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
                                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                                char cCombineMeasuredStates4 = (char) View.combineMeasuredStates(0, 0);
                                                int packedPositionType4 = 2823 - ExpandableListView.getPackedPositionType(0L);
                                                int iResolveSizeAndState4 = View.resolveSizeAndState(0, 0, 0) + 22;
                                                byte[] bArr13 = $$d;
                                                byte b19 = bArr13[7];
                                                Object[] objArr215 = new Object[1];
                                                c(b19, b19, bArr13[54], objArr215);
                                                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cCombineMeasuredStates4, packedPositionType4, iResolveSizeAndState4, 1814927978, false, (String) objArr215[0], null);
                                            }
                                            Object[] objArr216 = {0L, ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).get(null)};
                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1678062333);
                                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                                                char size4 = (char) View.MeasureSpec.getSize(0);
                                                int trimmedLength4 = 2823 - TextUtils.getTrimmedLength("");
                                                int absoluteGravity4 = 22 - Gravity.getAbsoluteGravity(0, 0);
                                                byte[] bArr14 = $$d;
                                                byte b110 = (byte) (-bArr14[5]);
                                                Object[] objArr217 = new Object[1];
                                                c(b110, b110, bArr14[7], objArr217);
                                                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(size4, trimmedLength4, absoluteGravity4, -2137287382, false, (String) objArr217[0], new Class[]{Long.TYPE, Method.class});
                                            }
                                            ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr216)).longValue();
                                            int i12117 = b;
                                            i24 = (i12117 ^ 107) + ((i12117 & 107) << 1);
                                            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i24 % 128;
                                            if (i24 % 2 != 0) {
                                                break;
                                            }
                                            throw null;
                                        }
                                    } else {
                                        continue;
                                    }
                                } else {
                                    continue;
                                }
                            } else {
                                continue;
                            }
                        } else {
                            continue;
                        }
                    }
                    i29++;
                    i27 = 16;
                    i25 = 2;
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
            char touchSlop5 = (char) (ViewConfiguration.getTouchSlop() >> 8);
            int i130 = (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 2823;
            int i131 = 22 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1));
            byte[] bArr15 = $$d;
            byte b20 = bArr15[7];
            Object[] objArr30 = new Object[1];
            c(b20, b20, bArr15[54], objArr30);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(touchSlop5, i130, i131, 1814927978, false, (String) objArr30[0], null);
        }
        Object[] objArr31 = {((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).get(null)};
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-645763082);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
            char mode = (char) View.MeasureSpec.getMode(0);
            int i132 = (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 2822;
            int iResolveSizeAndState5 = 22 - View.resolveSizeAndState(0, 0, 0);
            byte b21 = (byte) (-$$d[5]);
            byte b22 = b21;
            Object[] objArr32 = new Object[1];
            c(b21, b22, (byte) (b22 + 4), objArr32);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(mode, i132, iResolveSizeAndState5, 1025296417, false, (String) objArr32[0], new Class[]{Object.class});
        }
        ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).invoke(null, objArr31);
        Object[] objArr33 = {0, methodArr, null};
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1189131659);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
            char cIndexOf = (char) (37657 - TextUtils.indexOf("", "", 0, 0));
            int gidForName2 = Process.getGidForName("") + 2721;
            int offsetBefore = TextUtils.getOffsetBefore("", 0) + 19;
            byte b23 = (byte) (-$$d[5]);
            byte b24 = b23;
            Object[] objArr34 = new Object[1];
            c(b23, b24, (byte) (b24 + 4), objArr34);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(cIndexOf, gidForName2, offsetBefore, -1568796068, false, (String) objArr34[0], new Class[]{Integer.TYPE, Method[].class, List.class});
        }
        long jLongValue = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).invoke(null, objArr33)).longValue();
        long j = -694035275;
        long j2 = 370;
        long j3 = (j2 * j) + (j2 * jLongValue);
        long j4 = -369;
        long jMyUid = Process.myUid();
        long j5 = -1;
        long j6 = jMyUid ^ j5;
        long j7 = (j ^ j5) | j6;
        long j8 = j3 + ((j | jLongValue | j6) * j4) + (j4 * (jLongValue | (j7 ^ j5))) + (((long) 369) * (((jLongValue | j7) ^ j5) | (((jLongValue ^ j5) | j) ^ j5) | ((j | jMyUid) ^ j5))) + ((long) (-1116370570));
        int i133 = b;
        int i134 = (i133 & 87) + (i133 | 87);
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i134 % 128;
        if (i134 % 2 != 0) {
            int startElapsedRealtime = (int) Process.getStartElapsedRealtime();
            i = ((int) (j8 << 78)) & ((((-1771464918) + (((~(610758786 | startElapsedRealtime)) | 1511032365) * 576)) + (((~((~startElapsedRealtime) | 2121791151)) | 536952832) * 576)) - 1523718848);
            i2 = (int) j8;
            int i135 = (int) Runtime.getRuntime().totalMemory();
            i3 = (-319859561) + (((~(1727672629 | i135)) | 16861184) * (-140)) + ((~(1744533813 | i135)) * 70) + (((~(i135 | 1130068256)) | 631326741) * 70);
        } else {
            int i136 = (int) Runtime.getRuntime().totalMemory();
            int i137 = ~i136;
            i = ((int) (j8 >> 32)) & (1972008040 + (((~((-1335694528) | i137)) | (~((-101531884) | i137))) * (-867)) + (((~((-1335694528) | i136)) | 101515435 | (~((-101531884) | i136))) * (-1734)) + (((~(i136 | (-16449))) | (~(i137 | (-101515436))) | (~((-1234179093) | i136))) * 867));
            i2 = (int) j8;
            int i138 = ~((int) Runtime.getRuntime().totalMemory());
            i3 = 3551381 + (((~(i138 | 1163159034)) | (-1700095484)) * (-160)) + (((~(i138 | (-1694581852))) | 1163159034) * 160);
        }
        int i139 = i | (i2 & i3);
        int i140 = i139 >>> 24;
        int i141 = i139 & ViewCompat.MEASURED_SIZE_MASK;
        boolean z = i140 != 0;
        int i142 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        if (z) {
            int i143 = (i142 & 37) + (i142 | 37);
            b = i143 % 128;
            if (i143 % 2 != 0) {
                i4 = 1;
            }
            if (z) {
                int i144 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                i5 = (i144 & 77) + (i144 | 77);
                i6 = i5 % 128;
                b = i6;
                if (i5 % 2 != 0) {
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                if (i141 < 2) {
                    int i145 = (i6 & 29) + (i6 | 29);
                    i7 = i145 % 128;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i7;
                    int i146 = i145 % 2;
                    method = methodArr[i141];
                    if (method != null) {
                        int i147 = i7 + 95;
                        b = i147 % 128;
                        i8 = i147 % 2;
                        string = method.toString();
                        if (i8 == 0) {
                            int i148 = 65 / 0;
                        }
                    } else {
                        string = null;
                    }
                } else {
                    string = null;
                }
            } else {
                string = null;
            }
            list.add(string);
            int i149 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            int i150 = (i149 ^ 13) + ((i149 & 13) << 1);
            int i151 = i150 % 128;
            b = i151;
            int i152 = i150 % 2;
            int i153 = (i140 + 6) * i4;
            int i154 = (i151 & 65) + (i151 | 65);
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i154 % 128;
            int i155 = i154 % 2;
            return i153;
        }
        int i156 = (i142 & 31) + (i142 | 31);
        b = i156 % 128;
        int i157 = i156 % 2;
        i4 = 0;
        if (z) {
            int i1410 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            i5 = (i1410 & 77) + (i1410 | 77);
            i6 = i5 % 128;
            b = i6;
            if (i5 % 2 != 0) {
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
            if (i141 < 2) {
                int i1411 = (i6 & 29) + (i6 | 29);
                i7 = i1411 % 128;
                TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i7;
                int i1412 = i1411 % 2;
                method = methodArr[i141];
                if (method != null) {
                    int i1413 = i7 + 95;
                    b = i1413 % 128;
                    i8 = i1413 % 2;
                    string = method.toString();
                    if (i8 == 0) {
                        int i1414 = 65 / 0;
                    }
                } else {
                    string = null;
                }
            } else {
                string = null;
            }
        } else {
            string = null;
        }
        list.add(string);
        int i1415 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        int i158 = (i1415 ^ 13) + ((i1415 & 13) << 1);
        int i159 = i158 % 128;
        b = i159;
        int i1510 = i158 % 2;
        int i1511 = (i140 + 6) * i4;
        int i1512 = (i159 & 65) + (i159 | 65);
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i1512 % 128;
        int i1513 = i1512 % 2;
        return i1511;
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
    private static java.lang.String $$g(byte r6, short r7, int r8) {
        /*
            int r8 = r8 + 4
            byte[] r0 = defpackage.closePanel.$$c
            int r6 = r6 * 56
            int r6 = 122 - r6
            int r7 = r7 * 4
            int r1 = 1 - r7
            byte[] r1 = new byte[r1]
            r2 = 0
            int r7 = 0 - r7
            if (r0 != 0) goto L16
            r3 = r8
            r4 = r2
            goto L2b
        L16:
            r3 = r2
        L17:
            int r8 = r8 + 1
            byte r4 = (byte) r6
            r1[r3] = r4
            int r4 = r3 + 1
            if (r3 != r7) goto L26
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L26:
            r3 = r0[r8]
            r5 = r3
            r3 = r8
            r8 = r5
        L2b:
            int r6 = r6 + r8
            r8 = r3
            r3 = r4
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.closePanel.$$g(byte, short, int):java.lang.String");
    }
}
