package com.bpjstku.data.jht.model.request;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Color;
import android.graphics.PointF;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.bpjstku.data.lib.model.BaseRequest;
import com.google.gson.annotations.SerializedName;
import defpackage.SessionProcessor;
import defpackage.initSession;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÇ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\u0003\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b\u0011\u0010\u0007R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/bpjstku/data/jht/model/request/JhtBenefitDetailRequest;", "Lcom/bpjstku/data/lib/model/BaseRequest;", "", "p0", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/bpjstku/data/jht/model/request/JhtBenefitDetailRequest;", "", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "email", "Ljava/lang/String;", "getEmail"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class JhtBenefitDetailRequest extends BaseRequest {
    public static final int $stable = 0;
    private static int TuitionPaymentFragmentbindingInflater1;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    private static long TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    private static char b;

    @SerializedName("email")
    private final String email;
    private static final byte[] $$c = {55, -64, 35, -71};
    private static final int $$f = 28;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$d = {0, -94, -62, -97, -9, 5, 66, -54, -5, 3, 11, -2, 10, 58, -60, 4, 4, 5, -8, 73, -50, -9, 5, 3, 1, 4, 67, -66, 18, -4, 5, -2, -3, 18, -10, 7, 16, -8, 65, -73, 3, 16, -30, 15, -8, 14, -3, 4, 33, -14, -21, 15, 11, -6, -3, 49, -41, 20, -3, -3, 11, -6, -3, 4, 6, 14, 5, -3, 11, -8, 6, -2, 5, 6, -2, 12, 4, -15, 16, 7, -15, 45, -31, 14, 2, -4, 11, 2, 2, 8, -17, 12, -5, 69};
    private static final int $$e = 46;
    private static final byte[] $$a = {59, -124, -78, 46, 43, -2, 21, -1, 16, 9, -20, 27, 34, -2, 2, 19, 16, -36, 54, -7, 16, 16, 2, 19, 16, 9, 7, -1, 8, 16, 2, 21, 7, 15, 8, 7, 15, 1, 9, 28, -3, 6, 28, -32, 44, -1, 11, 17, 2, 11, 11, 5, 30, 1, 18, -55, 43, -2, 21, -1, 16, 9, -20, 27, 34, -2, 2, 19, 16, -36, 54, -7, 16, 16, 2, 19, 16, -8, 17, 15, 0, 15, 15, 3, -20, 47, 2, 16, -1, 29, -5, 23, -55};
    private static final int $$b = 128;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f388a = 0;
    private static int d = 1;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;

    private static void c(byte b2, byte b3, byte b4, Object[] objArr) {
        int i = (b4 * 14) + 84;
        int i2 = 55 - (b2 * 52);
        byte[] bArr = $$a;
        byte[] bArr2 = new byte[b3 + 1];
        int i3 = -1;
        if (bArr == null) {
            i3 = -1;
            i = (i + i2) - 10;
            i2 = i2;
        }
        while (true) {
            int i4 = i3 + 1;
            int i5 = i2 + 1;
            bArr2[i4] = (byte) i;
            if (i4 == b3) {
                objArr[0] = new String(bArr2, 0);
                return;
            }
            i3 = i4;
            i = (i + bArr[i5]) - 10;
            i2 = i5;
        }
    }

    private static void f(byte b2, int i, short s, Object[] objArr) {
        byte[] bArr = $$d;
        int i2 = i * 14;
        int i3 = s + 4;
        int i4 = (b2 * 15) + 84;
        byte[] bArr2 = new byte[i2 + 39];
        int i5 = i2 + 38;
        int i6 = -1;
        if (bArr == null) {
            i4 = i5 + (-i3) + 3;
            i3 = i3;
            i6 = -1;
        }
        while (true) {
            int i7 = i6 + 1;
            bArr2[i7] = (byte) i4;
            int i8 = i3 + 1;
            if (i7 == i5) {
                objArr[0] = new String(bArr2, 0);
                return;
            } else {
                i4 = i4 + (-bArr[i8]) + 3;
                i3 = i8;
                i6 = i7;
            }
        }
    }

    public final String getEmail() {
        int i = 2 % 2;
        int i2 = d + 109;
        int i3 = i2 % 128;
        f388a = i3;
        int i4 = i2 % 2;
        String str = this.email;
        int i5 = i3 + 13;
        d = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public JhtBenefitDetailRequest(String str) {
        this.email = str;
    }

    private static void e(char[] cArr, char[] cArr2, char c, int i, char[] cArr3, Object[] objArr) throws Throwable {
        char c2;
        int i2 = 2 % 2;
        SessionProcessor sessionProcessor = new SessionProcessor();
        int length = cArr2.length;
        char[] cArr4 = new char[length];
        int length2 = cArr.length;
        char[] cArr5 = new char[length2];
        int i3 = 0;
        System.arraycopy(cArr2, 0, cArr4, 0, length);
        System.arraycopy(cArr, 0, cArr5, 0, length2);
        cArr4[0] = (char) (cArr4[0] ^ c);
        cArr5[2] = (char) (cArr5[2] + ((char) i));
        int length3 = cArr3.length;
        char[] cArr6 = new char[length3];
        sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 0;
        int i4 = $10 + 29;
        $11 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 2 / 2;
        }
        while (sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2 < length3) {
            int i6 = $10 + 79;
            $11 = i6 % 128;
            int i7 = i6 % 2;
            try {
                Object[] objArr2 = {sessionProcessor};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1033601528);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    char defaultSize = (char) (8328 - View.getDefaultSize(i3, i3));
                    int iLastIndexOf = TextUtils.lastIndexOf("", '0', i3, i3) + 1236;
                    int fadingEdgeLength = (ViewConfiguration.getFadingEdgeLength() >> 16) + 35;
                    byte b2 = (byte) i3;
                    byte b3 = (byte) (b2 + 2);
                    String str$$g = $$g(b2, b3, (byte) (b3 - 2));
                    Class[] clsArr = new Class[1];
                    clsArr[i3] = Object.class;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(defaultSize, iLastIndexOf, fadingEdgeLength, -653973969, false, str$$g, clsArr);
                }
                int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).intValue();
                Object[] objArr3 = {sessionProcessor};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1120586870);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                    byte b4 = (byte) i3;
                    byte b5 = b4;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) View.MeasureSpec.getMode(i3), 2764 - (ViewConfiguration.getFadingEdgeLength() >> 16), (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 14, 1504416861, false, $$g(b4, b5, b5), new Class[]{Object.class});
                }
                int iIntValue2 = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).intValue();
                Object[] objArr4 = {sessionProcessor, Integer.valueOf(cArr4[sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2 % 4] * 32718), Integer.valueOf(cArr5[iIntValue])};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(811618268);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (43324 - TextUtils.indexOf((CharSequence) "", '0', 0)), 254 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), KeyEvent.getDeadChar(0, 0) + 22, -721491957, false, "j", new Class[]{Object.class, Integer.TYPE, Integer.TYPE});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
                Object[] objArr5 = {Integer.valueOf(cArr4[iIntValue2] * 32718), Integer.valueOf(cArr5[iIntValue])};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1821841887);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    char cIndexOf = (char) (TextUtils.indexOf("", "") + 65200);
                    int keyRepeatTimeout = 2891 - (ViewConfiguration.getKeyRepeatTimeout() >> 16);
                    int iNormalizeMetaState = KeyEvent.normalizeMetaState(0) + 17;
                    byte b6 = (byte) 0;
                    byte b7 = (byte) (b6 + 1);
                    String str$$g2 = $$g(b6, b7, (byte) (b7 - 1));
                    c2 = 2;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(cIndexOf, keyRepeatTimeout, iNormalizeMetaState, 2012627446, false, str$$g2, new Class[]{Integer.TYPE, Integer.TYPE});
                } else {
                    c2 = 2;
                }
                cArr5[iIntValue2] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).charValue();
                cArr4[iIntValue2] = sessionProcessor.b;
                cArr6[sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2] = (char) (((((long) (cArr4[iIntValue2] ^ cArr3[sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2])) ^ (TuitionPaymentFragmentspecialinlinedviewModeldefault3 ^ (-6377398940819159759L))) ^ ((long) ((int) (((long) TuitionPaymentFragmentspecialinlinedviewModeldefault2) ^ (-6377398940819159759L))))) ^ ((long) ((char) (((long) b) ^ (-6377398940819159759L)))));
                sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2++;
                i3 = 0;
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

    /* JADX WARN: Code duplicated, block: B:26:0x0281  */
    /* JADX WARN: Code duplicated, block: B:27:0x0283  */
    public final String toString() throws Throwable {
        Object[] objArr;
        int i = 2 % 2;
        String str = this.email;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char jumpTapTimeout = (char) (31533 - (ViewConfiguration.getJumpTapTimeout() >> 16));
            int iLastIndexOf = TextUtils.lastIndexOf("", '0', 0) + 922;
            int keyRepeatTimeout = 28 - (ViewConfiguration.getKeyRepeatTimeout() >> 16);
            byte[] bArr = $$a;
            byte b2 = bArr[37];
            Object[] objArr2 = new Object[1];
            c(b2, bArr[80], b2, objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(jumpTapTimeout, iLastIndexOf, keyRepeatTimeout, -1048449946, false, (String) objArr2[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr3 = new Object[1];
        e(new char[]{0, 0, 0, 0}, new char[]{12182, 46899, 33008, 50130}, (char) (ViewConfiguration.getJumpTapTimeout() >> 16), 1 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), new char[]{23925, 58444, 47172, 50108, 33498, 31473, 11425, 44633, 39290, 53145, 53838, 11535, 50836, 7787, 55382, 41684, 36597, 4112, 54227, 58601, 36760, 45302}, objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        e(new char[]{0, 0, 0, 0}, new char[]{18853, 9365, 38036, 63831}, (char) (22420 - View.combineMeasuredStates(0, 0)), TextUtils.indexOf("", "") - 1809541815, new char[]{45006, 30889, 50520, 32566, 36312, 16704, 30446, 2100, 41107, 10049, 49164, 52248, 8121, 32268, 19939}, objArr4);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(889369593);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char pressedStateDuration = (char) (31533 - (ViewConfiguration.getPressedStateDuration() >> 16));
            int iMyPid = 921 - (Process.myPid() >> 22);
            int iIndexOf = TextUtils.indexOf((CharSequence) "", '0', 0) + 29;
            byte[] bArr2 = $$a;
            Object[] objArr5 = new Object[1];
            c(bArr2[37], (byte) 52, bArr2[80], objArr5);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(pressedStateDuration, iMyPid, iIndexOf, -778300370, false, (String) objArr5[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char cIndexOf = (char) (TextUtils.indexOf("", "", 0) + 31533);
                int iAlpha = 921 - Color.alpha(0);
                int capsMode = TextUtils.getCapsMode("", 0, 0) + 28;
                byte b3 = $$a[80];
                byte b4 = b3;
                Object[] objArr6 = new Object[1];
                c(b4, (byte) (b4 | 37), b3, objArr6);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(cIndexOf, iAlpha, capsMode, -1142834547, false, (String) objArr6[0], null);
            }
            Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            int i2 = ((int[]) objArr7[3])[0];
            objArr = new Object[]{new int[1], new int[]{((int[]) objArr7[1])[0]}, (Object[]) objArr7[2], new int[]{i2}, (String[]) objArr7[4]};
            int iElapsedRealtime = (int) SystemClock.elapsedRealtime();
            int i3 = (((((~((-556878114) | iElapsedRealtime)) | 1216348226) * TypedValues.PositionType.TYPE_TRANSITION_EASING) - 1849053220) + ((~((~iElapsedRealtime) | (-556878114))) * TypedValues.PositionType.TYPE_TRANSITION_EASING)) - 1709301896;
            int i4 = (i3 << 13) ^ i3;
            int i5 = i4 ^ (i4 >>> 17);
            ((int[]) objArr[0])[0] = i5 ^ (i5 << 5);
        } else {
            Object[] objArr8 = new Object[1];
            e(new char[]{0, 0, 0, 0}, new char[]{53764, 16321, 30937, 4794}, (char) (Color.rgb(0, 0, 0) + 16824952), View.resolveSizeAndState(0, 0, 0), new char[]{23281, 42100, 50969, 41344, 62476, 11870, 42808, 12873, 35322, 42118, 18604, 55287, 58758, 58176, 65290, 20364, 39522, 65056, 41807, 61120, 25072, 55374, 60978, 39897, 1418, 62015}, objArr8);
            Class<?> cls2 = Class.forName((String) objArr8[0]);
            Object[] objArr9 = new Object[1];
            e(new char[]{0, 0, 0, 0}, new char[]{36237, 56219, 21295, 9573}, (char) (25939 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1))), KeyEvent.getDeadChar(0, 0), new char[]{27111, 36124, 20360, 23608, 11505, 24593, 29459, 42302, 22499, 15248, 62852, 27117, 12528, 58305, 9650, 28878, 23252, 29539}, objArr9);
            Context applicationContext = (Context) cls2.getMethod((String) objArr9[0], new Class[0]).invoke(null, null);
            if (applicationContext != null) {
                int i6 = f388a;
                int i7 = i6 + 69;
                d = i7 % 128;
                int i8 = i7 % 2;
                if (applicationContext instanceof ContextWrapper) {
                    int i9 = i6 + 85;
                    d = i9 % 128;
                    if (i9 % 2 == 0) {
                        int i10 = 51 / 0;
                        if (((ContextWrapper) applicationContext).getBaseContext() != null) {
                            applicationContext = applicationContext.getApplicationContext();
                        } else {
                            applicationContext = null;
                        }
                    } else if (((ContextWrapper) applicationContext).getBaseContext() != null) {
                        applicationContext = applicationContext.getApplicationContext();
                    } else {
                        applicationContext = null;
                    }
                } else {
                    applicationContext = applicationContext.getApplicationContext();
                }
            }
            Object[] objArr10 = new Object[1];
            e(new char[]{0, 0, 0, 0}, new char[]{45080, 28339, 7228, 53829}, (char) (17692 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1))), ViewConfiguration.getJumpTapTimeout() >> 16, new char[]{3713, 4167, 38307, 52470, 8075, 63450, 33895, 63064, 23879, 12952, 9922, 39662, 38007, 17912, 37053, 16839}, objArr10);
            Class<?> cls3 = Class.forName((String) objArr10[0]);
            Object[] objArr11 = new Object[1];
            e(new char[]{0, 0, 0, 0}, new char[]{50338, 1110, 60357, 65117}, (char) (View.resolveSizeAndState(0, 0, 0) + 24043), ViewConfiguration.getScrollDefaultDelay() >> 16, new char[]{19788, 14686, 42182, 64470, 63214, 39394, 47638, 61089, 60735, 62412, 17158, 34345, 46108, 4066, 10651, 42073}, objArr11);
            try {
                Object[] objArr12 = {applicationContext, Integer.valueOf(((Integer) cls3.getMethod((String) objArr11[0], Object.class).invoke(null, this)).intValue()), 0, -1709301896};
                byte[] bArr3 = $$d;
                byte b5 = bArr3[24];
                Object[] objArr13 = new Object[1];
                f(b5, bArr3[0], (byte) (-b5), objArr13);
                Class<?> cls4 = Class.forName((String) objArr13[0]);
                byte b6 = bArr3[0];
                byte b7 = bArr3[24];
                Object[] objArr14 = new Object[1];
                f(b6, b7, (byte) (b7 | 36), objArr14);
                Object[] objArr15 = (Object[]) cls4.getMethod((String) objArr14[0], Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr12);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    char scrollBarSize = (char) ((ViewConfiguration.getScrollBarSize() >> 8) + 31533);
                    int keyRepeatTimeout2 = 921 - (ViewConfiguration.getKeyRepeatTimeout() >> 16);
                    int scrollBarSize2 = 28 - (ViewConfiguration.getScrollBarSize() >> 8);
                    byte b8 = $$a[80];
                    byte b9 = b8;
                    Object[] objArr16 = new Object[1];
                    c(b9, (byte) (b9 | 37), b8, objArr16);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(scrollBarSize, keyRepeatTimeout2, scrollBarSize2, -1142834547, false, (String) objArr16[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr15);
                try {
                    Object[] objArr17 = new Object[1];
                    e(new char[]{0, 0, 0, 0}, new char[]{12182, 46899, 33008, 50130}, (char) ((Process.getThreadPriority(0) + 20) >> 6), View.MeasureSpec.getMode(0), new char[]{23925, 58444, 47172, 50108, 33498, 31473, 11425, 44633, 39290, 53145, 53838, 11535, 50836, 7787, 55382, 41684, 36597, 4112, 54227, 58601, 36760, 45302}, objArr17);
                    Class<?> cls5 = Class.forName((String) objArr17[0]);
                    Object[] objArr18 = new Object[1];
                    e(new char[]{0, 0, 0, 0}, new char[]{18853, 9365, 38036, 63831}, (char) (Color.blue(0) + 22420), (-1809541815) - (ViewConfiguration.getLongPressTimeout() >> 16), new char[]{45006, 30889, 50520, 32566, 36312, 16704, 30446, 2100, 41107, 10049, 49164, 52248, 8121, 32268, 19939}, objArr18);
                    long jLongValue2 = ((Long) cls5.getDeclaredMethod((String) objArr18[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue2);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(889369593);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                        char cIndexOf2 = (char) (31532 - TextUtils.indexOf((CharSequence) "", '0', 0));
                        int packedPositionGroup = ExpandableListView.getPackedPositionGroup(0L) + 921;
                        int gidForName = 27 - Process.getGidForName("");
                        byte[] bArr4 = $$a;
                        Object[] objArr19 = new Object[1];
                        c(bArr4[37], (byte) 52, bArr4[80], objArr19);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(cIndexOf2, packedPositionGroup, gidForName, -778300370, false, (String) objArr19[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                        char gidForName2 = (char) (Process.getGidForName("") + 31534);
                        int i11 = 921 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1));
                        int pressedStateDuration2 = (ViewConfiguration.getPressedStateDuration() >> 16) + 28;
                        byte[] bArr5 = $$a;
                        byte b10 = bArr5[37];
                        Object[] objArr20 = new Object[1];
                        c(b10, bArr5[80], b10, objArr20);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(gidForName2, i11, pressedStateDuration2, -1048449946, false, (String) objArr20[0], null);
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
        int i12 = ((int[]) objArr[1])[0];
        int i13 = ((int[]) objArr[3])[0];
        if (i13 != i12) {
            ArrayList arrayList = new ArrayList();
            String[] strArr = (String[]) objArr[4];
            if (strArr != null) {
                int i14 = f388a + 81;
                int i15 = i14 % 128;
                d = i15;
                int i16 = i14 % 2;
                int i17 = i15 + 5;
                f388a = i17 % 128;
                int i18 = i17 % 2;
                for (int i19 = 0; i19 < strArr.length; i19++) {
                    int i20 = f388a + 117;
                    d = i20 % 128;
                    if (i20 % 2 == 0) {
                        arrayList.add(strArr[i19]);
                    } else {
                        arrayList.add(strArr[i19]);
                    }
                }
            }
            throw new RuntimeException(String.valueOf(i13));
        }
        int i21 = d + 41;
        f388a = i21 % 128;
        int i22 = i21 % 2;
        int i23 = ((int[]) objArr[0])[0];
        int i24 = ((int[]) objArr[3])[0];
        Object[] objArr21 = {new int[1], new int[]{((int[]) objArr[1])[0]}, (Object[]) objArr[2], new int[]{i24}, (String[]) objArr[4]};
        int iElapsedRealtime2 = (int) SystemClock.elapsedRealtime();
        int i25 = ~iElapsedRealtime2;
        int i26 = 699744531 + (((~(960722581 | i25)) | 3704834) * (-1188));
        int i27 = (~(iElapsedRealtime2 | (-960722582))) | 3704834;
        int i28 = ~(813357062 | i25);
        int i29 = i23 + i26 + ((i27 | i28) * 594) + (((~((-960722582) | i25)) | 151070353 | i28) * 594);
        int i30 = (i29 << 13) ^ i29;
        int i31 = i30 ^ (i30 >>> 17);
        ((int[]) objArr21[0])[0] = i31 ^ (i31 << 5);
        StringBuilder sb = new StringBuilder("JhtBenefitDetailRequest(email=");
        sb.append(str);
        int i32 = ((int[]) objArr21[0])[0];
        int i33 = i32 * i32;
        int i34 = -(605301542 * i32);
        int i35 = (i33 & i34) + (i33 | i34);
        int i36 = -(i32 * 161267254);
        int i37 = ((i35 | i36) << 1) - (i36 ^ i35);
        int i38 = (i37 & 47064644) + (47064644 | i37);
        int i39 = i38 >> 19;
        int i40 = ((i39 ^ (-16383)) + ((i39 & (-16383)) << 1)) / 8192;
        int i41 = (i40 & 1) + (i40 | 1);
        int i42 = (i38 & i41) + (i41 | i38);
        int i43 = i38 >> 24;
        int i44 = ((i43 & (-511)) + (i43 | (-511))) / 256;
        int i45 = -(((i44 & 1) + (i44 | 1)) ^ i42);
        int i46 = (i45 & 6) + (i45 | 6);
        int i47 = i46 >> 23;
        int i48 = ((((i47 | (-1023)) << 1) - (i47 ^ (-1023))) / 512) + 1;
        sb.append("17\\31\\0\\28\\21\\)".substring(165564 / (((-(((i48 | 1) << 1) - (i48 ^ 1))) & i46) * 1971)));
        return sb.toString();
    }

    static {
        TuitionPaymentFragmentbindingInflater1 = 1;
        TuitionPaymentFragmentbindingInflater1();
        int i = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 37;
        TuitionPaymentFragmentbindingInflater1 = i % 128;
        int i2 = i % 2;
    }

    public static /* synthetic */ JhtBenefitDetailRequest copy$default(JhtBenefitDetailRequest jhtBenefitDetailRequest, String str, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = f388a;
        int i4 = i3 + 103;
        d = i4 % 128;
        int i5 = i4 % 2;
        if ((i & 1) != 0) {
            str = jhtBenefitDetailRequest.email;
            int i6 = i3 + 33;
            d = i6 % 128;
            int i7 = i6 % 2;
        }
        return jhtBenefitDetailRequest.copy(str);
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = f388a + 101;
        d = i2 % 128;
        if (i2 % 2 != 0) {
            return this.email;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final JhtBenefitDetailRequest copy(String p0) {
        int i = 2 % 2;
        JhtBenefitDetailRequest jhtBenefitDetailRequest = new JhtBenefitDetailRequest(p0);
        int i2 = f388a + 95;
        d = i2 % 128;
        if (i2 % 2 != 0) {
            return jhtBenefitDetailRequest;
        }
        throw null;
    }

    public final boolean equals(Object p0) {
        int i = 2 % 2;
        if (this == p0) {
            int i2 = f388a + 107;
            d = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        if (p0 instanceof JhtBenefitDetailRequest) {
            return Intrinsics.areEqual(this.email, ((JhtBenefitDetailRequest) p0).email);
        }
        int i4 = f388a + 13;
        d = i4 % 128;
        int i5 = i4 % 2;
        return false;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = d + 105;
        int i3 = i2 % 128;
        f388a = i3;
        int i4 = i2 % 2;
        String str = this.email;
        if (str != null) {
            return str.hashCode();
        }
        int i5 = i3 + 59;
        d = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 44 / 0;
        }
        return 0;
    }

    static void TuitionPaymentFragmentbindingInflater1() {
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = -6377398940819159759L;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = -981105359;
        b = (char) 5200;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0022  */
    /* JADX WARN: Code duplicated, block: B:8:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0022
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$g(byte r6, int r7, byte r8) {
        /*
            int r7 = 104 - r7
            byte[] r0 = com.bpjstku.data.jht.model.request.JhtBenefitDetailRequest.$$c
            int r6 = r6 * 3
            int r1 = r6 + 1
            int r8 = r8 * 3
            int r8 = 3 - r8
            byte[] r1 = new byte[r1]
            r2 = 0
            if (r0 != 0) goto L14
            r3 = r8
            r4 = r2
            goto L2a
        L14:
            r3 = r2
        L15:
            byte r4 = (byte) r7
            r1[r3] = r4
            int r8 = r8 + 1
            if (r3 != r6) goto L22
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L22:
            int r3 = r3 + 1
            r4 = r0[r8]
            r5 = r3
            r3 = r8
            r8 = r4
            r4 = r5
        L2a:
            int r7 = r7 + r8
            r8 = r3
            r3 = r4
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.data.jht.model.request.JhtBenefitDetailRequest.$$g(byte, int, byte):java.lang.String");
    }
}
