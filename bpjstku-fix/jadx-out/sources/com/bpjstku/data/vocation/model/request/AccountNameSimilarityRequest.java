package com.bpjstku.data.vocation.model.request;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.core.view.ViewCompat;
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
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\t\u0010\bJ$\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÇ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\u0003\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b\u0013\u0010\bR\u001a\u0010\u0014\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\bR\u001a\u0010\u0017\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0015\u001a\u0004\b\u0018\u0010\b"}, d2 = {"Lcom/bpjstku/data/vocation/model/request/AccountNameSimilarityRequest;", "Lcom/bpjstku/data/lib/model/BaseRequest;", "", "p0", "p1", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/bpjstku/data/vocation/model/request/AccountNameSimilarityRequest;", "", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "name", "Ljava/lang/String;", "getName", "accountName", "getAccountName"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class AccountNameSimilarityRequest extends BaseRequest {
    public static final int $stable = 0;
    private static long TuitionPaymentFragmentbindingInflater1;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    private static char TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    private static int b;

    @SerializedName("namaRekening")
    private final String accountName;

    @SerializedName("nama")
    private final String name;
    private static final byte[] $$c = {36, -74, -79, -21};
    private static final int $$f = 35;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$d = {25, -93, -120, -48, -11, 3, 64, -56, -7, 1, 9, -4, 8, 56, -55, -2, -8, 14, 4, 2, -17, 15, 56, -67, 14, -7, -1, -4, 16, 3, -11, 2, 9, -2, 3, 58, -20, -43, 2, 9, -2, 3, 19, -26, 13, 4, -18, 16, -32, 13, -10, 12, -5, 2, 31, -16, -23, 13, 9, -8, -5, 47, -43, 18, -5, -5, 9, -8, -5, 2, 4, 12, 3, -5, 9, -10, 4, -4, 3, 4, -4, 10, 2, -17, 14, 5, -17, 43, -33, 12, 0, -6, 9, 0, 0, 6, -19, 10, -7, 66};
    private static final int $$e = 15;
    private static final byte[] $$a = {1, -81, 2, 79, -43, 2, -21, 1, -16, -9, 20, -27, -34, 2, -2, -19, -16, 36, -54, 7, -16, -16, -2, -19, -16, -9, -7, 1, -8, -16, -2, -21, -7, -15, -8, -7, -15, -1, -9, -28, 3, -6, -28, 32, -44, 1, -11, -17, -2, -11, -11, -5, -30, -1, -18, 55, -43, 2, -21, 1, -16, -9, 20, -27, -34, 2, -2, -19, -16, 36, -54, 7, -16, -16, -2, -19, -16, 8, -17, -15, 0, -15, -15, -3, 20, -47, -2, -16, 1, -29, 5, -23, 55};
    private static final int $$b = 67;
    private static int d = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f415a = 1;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 0;

    /* JADX WARN: Code duplicated, block: B:10:0x0023  */
    /* JADX WARN: Code duplicated, block: B:8:0x001b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x002e). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0023
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void c(short r6, short r7, short r8, java.lang.Object[] r9) {
        /*
            int r8 = r8 * 52
            int r8 = 55 - r8
            int r0 = r6 + 1
            int r7 = r7 * 14
            int r7 = r7 + 84
            byte[] r1 = com.bpjstku.data.vocation.model.request.AccountNameSimilarityRequest.$$a
            byte[] r0 = new byte[r0]
            r2 = 0
            if (r1 != 0) goto L15
            r3 = r8
            r4 = r2
            r8 = r6
            goto L2e
        L15:
            r3 = r2
        L16:
            byte r4 = (byte) r7
            r0[r3] = r4
            if (r3 != r6) goto L23
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            r9[r2] = r6
            return
        L23:
            int r8 = r8 + 1
            int r3 = r3 + 1
            r4 = r1[r8]
            r5 = r8
            r8 = r7
            r7 = r4
            r4 = r3
            r3 = r5
        L2e:
            int r7 = -r7
            int r8 = r8 + r7
            int r7 = r8 + (-10)
            r8 = r3
            r3 = r4
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.data.vocation.model.request.AccountNameSimilarityRequest.c(short, short, short, java.lang.Object[]):void");
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0029  */
    /* JADX WARN: Code duplicated, block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0029 -> B:11:0x002e). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0029
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void f(short r7, short r8, short r9, java.lang.Object[] r10) {
        /*
            int r8 = r8 * 44
            int r8 = 48 - r8
            byte[] r0 = com.bpjstku.data.vocation.model.request.AccountNameSimilarityRequest.$$d
            int r7 = r7 * 15
            int r7 = r7 + 84
            int r9 = r9 * 8
            int r9 = 53 - r9
            byte[] r1 = new byte[r9]
            r2 = 0
            if (r0 != 0) goto L16
            r3 = r8
            r5 = r2
            goto L2e
        L16:
            r3 = r2
            r6 = r8
            r8 = r7
            r7 = r6
        L1a:
            byte r4 = (byte) r8
            int r5 = r3 + 1
            r1[r3] = r4
            if (r5 != r9) goto L29
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            r10[r2] = r7
            return
        L29:
            r3 = r0[r7]
            r6 = r3
            r3 = r7
            r7 = r6
        L2e:
            int r7 = -r7
            int r8 = r8 + r7
            int r8 = r8 + 1
            int r7 = r3 + 1
            r3 = r5
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.data.vocation.model.request.AccountNameSimilarityRequest.f(short, short, short, java.lang.Object[]):void");
    }

    public final String getName() {
        int i = 2 % 2;
        int i2 = d;
        int i3 = i2 + 47;
        f415a = i3 % 128;
        int i4 = i3 % 2;
        String str = this.name;
        int i5 = i2 + 25;
        f415a = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public AccountNameSimilarityRequest(String str, String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.name = str;
        this.accountName = str2;
    }

    private static void e(char[] cArr, char[] cArr2, char c, int i, char[] cArr3, Object[] objArr) throws Throwable {
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
        while (sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2 < length3) {
            try {
                Object[] objArr2 = {sessionProcessor};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1033601528);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    char maximumFlingVelocity = (char) ((ViewConfiguration.getMaximumFlingVelocity() >> 16) + 8328);
                    int size = 1235 - View.MeasureSpec.getSize(i3);
                    int iIndexOf = TextUtils.indexOf((CharSequence) "", '0', i3) + 36;
                    byte b2 = (byte) i3;
                    byte b3 = b2;
                    String str$$g = $$g(b2, b3, b3);
                    Class[] clsArr = new Class[1];
                    clsArr[i3] = Object.class;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(maximumFlingVelocity, size, iIndexOf, -653973969, false, str$$g, clsArr);
                }
                int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).intValue();
                Object[] objArr3 = {sessionProcessor};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1120586870);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                    byte b4 = (byte) i3;
                    byte b5 = b4;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) TextUtils.getOffsetBefore("", i3), TextUtils.getTrimmedLength("") + 2764, 13 - TextUtils.lastIndexOf("", '0', i3), 1504416861, false, $$g(b4, b5, (byte) (b5 + 2)), new Class[]{Object.class});
                }
                int iIntValue2 = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).intValue();
                Object[] objArr4 = {sessionProcessor, Integer.valueOf(cArr4[sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2 % 4] * 32718), Integer.valueOf(cArr5[iIntValue])};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(811618268);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (43324 - TextUtils.lastIndexOf("", '0')), (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 252, 22 - (ViewConfiguration.getLongPressTimeout() >> 16), -721491957, false, "j", new Class[]{Object.class, Integer.TYPE, Integer.TYPE});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
                Object[] objArr5 = {Integer.valueOf(cArr4[iIntValue2] * 32718), Integer.valueOf(cArr5[iIntValue])};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1821841887);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    byte b6 = (byte) 0;
                    byte b7 = b6;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (ExpandableListView.getPackedPositionGroup(0L) + 65200), 2891 - View.getDefaultSize(0, 0), KeyEvent.normalizeMetaState(0) + 17, 2012627446, false, $$g(b6, b7, (byte) (b7 + 1)), new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr5[iIntValue2] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).charValue();
                cArr4[iIntValue2] = sessionProcessor.b;
                cArr6[sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2] = (char) (((((long) (cArr4[iIntValue2] ^ cArr3[sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2])) ^ (TuitionPaymentFragmentbindingInflater1 ^ (-6377398940819159759L))) ^ ((long) ((int) (((long) TuitionPaymentFragmentspecialinlinedviewModeldefault1) ^ (-6377398940819159759L))))) ^ ((long) ((char) (((long) TuitionPaymentFragmentspecialinlinedviewModeldefault3) ^ (-6377398940819159759L)))));
                sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2++;
                int i4 = $11 + 99;
                $10 = i4 % 128;
                int i5 = i4 % 2;
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
        int i6 = $11 + 23;
        $10 = i6 % 128;
        int i7 = i6 % 2;
    }

    public final String getAccountName() throws Throwable {
        Object[] objArr;
        int i = 2 % 2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char c = (char) (31534 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)));
            int threadPriority = 921 - ((Process.getThreadPriority(0) + 20) >> 6);
            int iGreen = 28 - Color.green(0);
            byte[] bArr = $$a;
            byte b2 = bArr[80];
            byte b3 = bArr[0];
            Object[] objArr2 = new Object[1];
            c(b2, b3, b3, objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(c, threadPriority, iGreen, -1048449946, false, (String) objArr2[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr3 = new Object[1];
        e(new char[]{0, 0, 0, 0}, new char[]{9453, 26659, 21753, 18783}, (char) (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), ViewConfiguration.getScrollDefaultDelay() >> 16, new char[]{41631, 32637, 55942, 7274, 60563, 21057, 6485, 61810, 32419, 53132, 11087, 53685, 31202, 4857, 34972, 48391, 6923, 5641, 8991, 45183, 22304, 26683}, objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        e(new char[]{0, 0, 0, 0}, new char[]{17862, 9520, 11988, 31842}, (char) (TextUtils.getCapsMode("", 0, 0) + 25134), (-735760314) - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), new char[]{34399, 62461, 64351, 52316, 31527, 26158, 21866, 20793, 26565, 30310, 44343, 54988, 8099, 55782, 2968}, objArr4);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(889369593);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char longPressTimeout = (char) ((ViewConfiguration.getLongPressTimeout() >> 16) + 31533);
            int mirror = 969 - AndroidCharacter.getMirror('0');
            int keyRepeatDelay = (ViewConfiguration.getKeyRepeatDelay() >> 16) + 28;
            byte[] bArr2 = $$a;
            Object[] objArr5 = new Object[1];
            c((byte) 52, bArr2[80], bArr2[0], objArr5);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(longPressTimeout, mirror, keyRepeatDelay, -778300370, false, (String) objArr5[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            int i2 = f415a + 121;
            d = i2 % 128;
            int i3 = i2 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char packedPositionType = (char) (31533 - ExpandableListView.getPackedPositionType(0L));
                int scrollBarFadeDuration = 921 - (ViewConfiguration.getScrollBarFadeDuration() >> 16);
                int iKeyCodeFromString = 28 - KeyEvent.keyCodeFromString("");
                byte[] bArr3 = $$a;
                byte b4 = (byte) (bArr3[17] + 1);
                byte b5 = bArr3[80];
                Object[] objArr6 = new Object[1];
                c(b4, b5, b5, objArr6);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(packedPositionType, scrollBarFadeDuration, iKeyCodeFromString, -1142834547, false, (String) objArr6[0], null);
            }
            Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            objArr = new Object[]{new int[1], new int[]{((int[]) objArr7[1])[0]}, (Object[]) objArr7[2], new int[]{((int[]) objArr7[3])[0]}, (String[]) objArr7[4]};
            int iElapsedRealtime = (int) SystemClock.elapsedRealtime();
            int i4 = ~iElapsedRealtime;
            int i5 = ((((~(i4 | 1322069719)) | ((~((-452009925) | i4)) | 271585536)) * (-397)) - 487550684) + ((iElapsedRealtime | 1413230867) * 397) + 244105020;
            int i6 = (i5 << 13) ^ i5;
            int i7 = i6 ^ (i6 >>> 17);
            ((int[]) objArr[0])[0] = i7 ^ (i7 << 5);
        } else {
            Object[] objArr8 = new Object[1];
            e(new char[]{0, 0, 0, 0}, new char[]{21631, 24128, 18892, 3085}, (char) (((byte) KeyEvent.getModifierMetaStateMask()) + 3402), ViewCompat.MEASURED_STATE_MASK - Color.rgb(0, 0, 0), new char[]{16711, 12836, 6455, 29141, 59410, 25682, 22836, 60559, 43918, 56166, 17436, 9459, 50324, 28346, 5156, 56773, 27383, 48220, 4852, 15158, 56876, 59641, 5004, 22730, 60907, 19402}, objArr8);
            Class<?> cls2 = Class.forName((String) objArr8[0]);
            Object[] objArr9 = new Object[1];
            e(new char[]{0, 0, 0, 0}, new char[]{10450, 1902, 29906, 59462}, (char) (View.MeasureSpec.getSize(0) + 18036), Color.blue(0), new char[]{25705, 64158, 24101, 27268, 38327, 48300, 9705, 58190, 64691, 12695, 41676, 64358, 537, 24970, 47193, 10859, 50614, 15157}, objArr9);
            Context applicationContext = (Context) cls2.getMethod((String) objArr9[0], new Class[0]).invoke(null, null);
            if (applicationContext != null) {
                int i8 = d + 83;
                f415a = i8 % 128;
                int i9 = i8 % 2;
                applicationContext = (!((applicationContext instanceof ContextWrapper) ^ true) && ((ContextWrapper) applicationContext).getBaseContext() == null) ? null : applicationContext.getApplicationContext();
            }
            Object[] objArr10 = new Object[1];
            e(new char[]{0, 0, 0, 0}, new char[]{43128, 46477, 45874, 12102}, (char) ((ViewConfiguration.getScrollDefaultDelay() >> 16) + 18099), Color.red(0), new char[]{44320, 33288, 11844, 19635, 49670, 47669, 45019, 57841, 59150, 7401, 59407, 52754, 43438, 53018, 63599, 51507}, objArr10);
            Class<?> cls3 = Class.forName((String) objArr10[0]);
            Object[] objArr11 = new Object[1];
            e(new char[]{0, 0, 0, 0}, new char[]{37221, 60691, 63784, 40921}, (char) ((ViewConfiguration.getScrollDefaultDelay() >> 16) + 55801), AndroidCharacter.getMirror('0') - '0', new char[]{2933, 1741, 2157, 36484, 35974, 48650, 46293, 5780, 19185, 11490, 50969, 47787, 14681, 19709, 49389, 618}, objArr11);
            try {
                Object[] objArr12 = {applicationContext, Integer.valueOf(((Integer) cls3.getMethod((String) objArr11[0], Object.class).invoke(null, this)).intValue()), 0, 244105020};
                byte[] bArr4 = $$d;
                byte b6 = bArr4[9];
                byte b7 = b6;
                Object[] objArr13 = new Object[1];
                f(b6, b7, b7, objArr13);
                Class<?> cls4 = Class.forName((String) objArr13[0]);
                byte b8 = bArr4[90];
                byte b9 = b8;
                Object[] objArr14 = new Object[1];
                f(b8, b9, b9, objArr14);
                objArr = (Object[]) cls4.getMethod((String) objArr14[0], Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr12);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    char packedPositionGroup = (char) (ExpandableListView.getPackedPositionGroup(0L) + 31533);
                    int threadPriority2 = 921 - ((Process.getThreadPriority(0) + 20) >> 6);
                    int iIndexOf = 28 - TextUtils.indexOf("", "", 0);
                    byte[] bArr5 = $$a;
                    byte b10 = (byte) (bArr5[17] + 1);
                    byte b11 = bArr5[80];
                    Object[] objArr15 = new Object[1];
                    c(b10, b11, b11, objArr15);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(packedPositionGroup, threadPriority2, iIndexOf, -1142834547, false, (String) objArr15[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr);
                try {
                    Object[] objArr16 = new Object[1];
                    e(new char[]{0, 0, 0, 0}, new char[]{9453, 26659, 21753, 18783}, (char) ((-1) - ((byte) KeyEvent.getModifierMetaStateMask())), Drawable.resolveOpacity(0, 0), new char[]{41631, 32637, 55942, 7274, 60563, 21057, 6485, 61810, 32419, 53132, 11087, 53685, 31202, 4857, 34972, 48391, 6923, 5641, 8991, 45183, 22304, 26683}, objArr16);
                    Class<?> cls5 = Class.forName((String) objArr16[0]);
                    Object[] objArr17 = new Object[1];
                    e(new char[]{0, 0, 0, 0}, new char[]{17862, 9520, 11988, 31842}, (char) (Color.rgb(0, 0, 0) + 16802350), TextUtils.getOffsetBefore("", 0) - 735760315, new char[]{34399, 62461, 64351, 52316, 31527, 26158, 21866, 20793, 26565, 30310, 44343, 54988, 8099, 55782, 2968}, objArr17);
                    long jLongValue2 = ((Long) cls5.getDeclaredMethod((String) objArr17[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue2);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(889369593);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                        char cIndexOf = (char) (31533 - TextUtils.indexOf("", ""));
                        int i10 = (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 921;
                        int iGreen2 = 28 - Color.green(0);
                        byte[] bArr6 = $$a;
                        Object[] objArr18 = new Object[1];
                        c((byte) 52, bArr6[80], bArr6[0], objArr18);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(cIndexOf, i10, iGreen2, -778300370, false, (String) objArr18[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                        char cAlpha = (char) (Color.alpha(0) + 31533);
                        int iBlue = 921 - Color.blue(0);
                        int iLastIndexOf = 27 - TextUtils.lastIndexOf("", '0', 0);
                        byte[] bArr7 = $$a;
                        byte b12 = bArr7[80];
                        byte b13 = bArr7[0];
                        Object[] objArr19 = new Object[1];
                        c(b12, b13, b13, objArr19);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(cAlpha, iBlue, iLastIndexOf, -1048449946, false, (String) objArr19[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf2);
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
        int i11 = ((int[]) objArr[0])[0];
        Object[] objArr20 = {new int[1], new int[]{((int[]) objArr[1])[0]}, (Object[]) objArr[2], new int[]{((int[]) objArr[3])[0]}, (String[]) objArr[4]};
        int iIdentityHashCode = System.identityHashCode(this);
        int i12 = ~iIdentityHashCode;
        int i13 = i11 + ((((~((-1773122623) | i12)) | (~(iIdentityHashCode | 957021))) * 959) - 1220648837) + (((~(iIdentityHashCode | (-1773122623))) | (~(i12 | 957021))) * 959);
        int i14 = (i13 << 13) ^ i13;
        int i15 = i14 ^ (i14 >>> 17);
        ((int[]) objArr20[0])[0] = i15 ^ (i15 << 5);
        int i16 = d + 27;
        f415a = i16 % 128;
        int i17 = i16 % 2;
        return this.accountName;
    }

    static {
        b = 1;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        int i = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 71;
        b = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    public static /* synthetic */ AccountNameSimilarityRequest copy$default(AccountNameSimilarityRequest accountNameSimilarityRequest, String str, String str2, int i, Object obj) {
        int i2 = 2 % 2;
        if ((i & 1) != 0) {
            str = accountNameSimilarityRequest.name;
            int i3 = f415a + 125;
            d = i3 % 128;
            int i4 = i3 % 2;
        }
        if ((i & 2) != 0) {
            int i5 = d + 69;
            f415a = i5 % 128;
            if (i5 % 2 == 0) {
                String str3 = accountNameSimilarityRequest.accountName;
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
            str2 = accountNameSimilarityRequest.accountName;
        }
        return accountNameSimilarityRequest.copy(str, str2);
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = f415a + 11;
        int i3 = i2 % 128;
        d = i3;
        if (i2 % 2 != 0) {
            throw null;
        }
        String str = this.name;
        int i4 = i3 + 65;
        f415a = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 55 / 0;
        }
        return str;
    }

    public final String component2() {
        int i = 2 % 2;
        int i2 = f415a;
        int i3 = i2 + 25;
        d = i3 % 128;
        if (i3 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.accountName;
        int i4 = i2 + 101;
        d = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final AccountNameSimilarityRequest copy(String p0, String p1) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(p0, "");
        Intrinsics.checkNotNullParameter(p1, "");
        AccountNameSimilarityRequest accountNameSimilarityRequest = new AccountNameSimilarityRequest(p0, p1);
        int i2 = f415a + 23;
        d = i2 % 128;
        if (i2 % 2 == 0) {
            return accountNameSimilarityRequest;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final boolean equals(Object p0) {
        int i = 2 % 2;
        int i2 = d;
        int i3 = i2 + 39;
        f415a = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof AccountNameSimilarityRequest)) {
            int i4 = i2 + 45;
            f415a = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        AccountNameSimilarityRequest accountNameSimilarityRequest = (AccountNameSimilarityRequest) p0;
        if (!(!Intrinsics.areEqual(this.name, accountNameSimilarityRequest.name))) {
            if (!(!Intrinsics.areEqual(this.accountName, accountNameSimilarityRequest.accountName))) {
                return true;
            }
            int i6 = d + 119;
            f415a = i6 % 128;
            int i7 = i6 % 2;
        }
        return false;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = d + 57;
        f415a = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (this.name.hashCode() * 31) + this.accountName.hashCode();
        int i4 = f415a + 55;
        d = i4 % 128;
        if (i4 % 2 == 0) {
            return iHashCode;
        }
        throw null;
    }

    public final String toString() {
        int i = 2 % 2;
        String str = this.name;
        String str2 = this.accountName;
        StringBuilder sb = new StringBuilder("AccountNameSimilarityRequest(name=");
        sb.append(str);
        sb.append(", accountName=");
        sb.append(str2);
        sb.append(")");
        String string = sb.toString();
        int i2 = f415a + 43;
        d = i2 % 128;
        int i3 = i2 % 2;
        return string;
    }

    static void TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        TuitionPaymentFragmentbindingInflater1 = -6377398940819159759L;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = -981105359;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = (char) 31722;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0025  */
    /* JADX WARN: Code duplicated, block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x0027). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0025
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$g(int r5, byte r6, short r7) {
        /*
            byte[] r0 = com.bpjstku.data.vocation.model.request.AccountNameSimilarityRequest.$$c
            int r7 = r7 + 102
            int r6 = r6 * 3
            int r6 = r6 + 4
            int r5 = r5 * 3
            int r1 = 1 - r5
            byte[] r1 = new byte[r1]
            r2 = 0
            int r5 = 0 - r5
            if (r0 != 0) goto L17
            r3 = r7
            r4 = r2
            r7 = r5
            goto L27
        L17:
            r3 = r2
        L18:
            byte r4 = (byte) r7
            r1[r3] = r4
            int r4 = r3 + 1
            if (r3 != r5) goto L25
            java.lang.String r5 = new java.lang.String
            r5.<init>(r1, r2)
            return r5
        L25:
            r3 = r0[r6]
        L27:
            int r7 = r7 + r3
            int r6 = r6 + 1
            r3 = r4
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.data.vocation.model.request.AccountNameSimilarityRequest.$$g(int, byte, short):java.lang.String");
    }
}
