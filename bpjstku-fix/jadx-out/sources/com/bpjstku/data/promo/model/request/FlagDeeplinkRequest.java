package com.bpjstku.data.promo.model.request;

import android.content.Context;
import android.graphics.Color;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.Toast;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.android.volley.ExecutorDelivery;
import com.bpjstku.data.lib.model.BaseRequest;
import com.google.gson.annotations.SerializedName;
import defpackage.SessionConfigValidatingBuilderExternalSyntheticLambda0;
import defpackage.SessionProcessor;
import defpackage.initSession;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Random;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\t\u0010\bJ$\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÇ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\u0003\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b\u0013\u0010\bR\u001a\u0010\u0014\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\bR\u001a\u0010\u0017\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0015\u001a\u0004\b\u0018\u0010\b"}, d2 = {"Lcom/bpjstku/data/promo/model/request/FlagDeeplinkRequest;", "Lcom/bpjstku/data/lib/model/BaseRequest;", "", "p0", "p1", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/bpjstku/data/promo/model/request/FlagDeeplinkRequest;", "", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "idTrx", "Ljava/lang/String;", "getIdTrx", "email", "getEmail"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class FlagDeeplinkRequest extends BaseRequest {
    public static final int $stable = 0;
    private static char TuitionPaymentFragmentbindingInflater1;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    private static long TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static short[] f400a;
    private static byte[] asBinder;
    private static int asInterface;
    private static int b;
    private static int d;

    @SerializedName("email")
    private final String email;

    @SerializedName("idTrx")
    private final String idTrx;
    private static final byte[] $$c = {104, 27, -72, 120};
    private static final int $$d = 9;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$a = {12, -88, 33, 118, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 55};
    private static final int $$b = 176;
    private static int notify = 0;
    private static int cancelAll = 1;
    private static int g = 0;

    /* JADX WARN: Code duplicated, block: B:10:0x0026  */
    /* JADX WARN: Code duplicated, block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x002e). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0026
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void f(short r6, int r7, int r8, java.lang.Object[] r9) {
        /*
            int r6 = r6 * 14
            int r6 = r6 + 84
            int r7 = r7 * 52
            int r0 = 53 - r7
            int r8 = r8 * 52
            int r8 = 56 - r8
            byte[] r1 = com.bpjstku.data.promo.model.request.FlagDeeplinkRequest.$$a
            byte[] r0 = new byte[r0]
            int r7 = 52 - r7
            r2 = 0
            if (r1 != 0) goto L18
            r3 = r8
            r4 = r2
            goto L2e
        L18:
            r3 = r2
        L19:
            byte r4 = (byte) r6
            r0[r3] = r4
            if (r3 != r7) goto L26
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            r9[r2] = r6
            return
        L26:
            int r3 = r3 + 1
            r4 = r1[r8]
            r5 = r3
            r3 = r8
            r8 = r4
            r4 = r5
        L2e:
            int r8 = -r8
            int r6 = r6 + r8
            int r6 = r6 + (-11)
            int r8 = r3 + 1
            r3 = r4
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.data.promo.model.request.FlagDeeplinkRequest.f(short, int, int, java.lang.Object[]):void");
    }

    public final String getIdTrx() {
        int i = 2 % 2;
        int i2 = notify + 117;
        cancelAll = i2 % 128;
        if (i2 % 2 != 0) {
            return this.idTrx;
        }
        throw null;
    }

    public final String getEmail() {
        int i = 2 % 2;
        int i2 = cancelAll + 109;
        notify = i2 % 128;
        int i3 = i2 % 2;
        String str = this.email;
        if (i3 != 0) {
            int i4 = 58 / 0;
        }
        return str;
    }

    public FlagDeeplinkRequest(String str, String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.idTrx = str;
        this.email = str2;
    }

    public final String toString() throws Throwable {
        int iIntValue;
        int i = 2 % 2;
        String str = this.idTrx;
        String str2 = this.email;
        StringBuilder sb = new StringBuilder("FlagDeeplinkRequest(idTrx=");
        sb.append(str);
        sb.append(", email=");
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1552861273);
        int i2 = 0;
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) ((ViewConfiguration.getPressedStateDuration() >> 16) + 46400), 39 - TextUtils.lastIndexOf("", '0', 0, 0), Color.alpha(0) + 19, -1206882418, false, "TuitionPaymentFragmentspecialinlinedviewModeldefault3", null);
        }
        Object obj = null;
        int i3 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getInt(null);
        Object[] objArr = new Object[1];
        c(new char[]{0, 0, 0, 0}, new char[]{61528, 15744, 15069, 29642}, (char) ((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) - 1), ViewConfiguration.getTapTimeout() >> 16, new char[]{20404, 40180, 24394, 17564, 24024, 65231, 32511, 49725, 46816, 34600, 45063, 59032, 43550, 39370, 44752, 46626, 51674, 60389, 52798, 22660, 20136, 24309}, objArr);
        Class<?> cls = Class.forName((String) objArr[0]);
        Object[] objArr2 = new Object[1];
        e(ExpandableListView.getPackedPositionChild(0L) - 283774122, (-1492946605) - ((Process.getThreadPriority(0) + 20) >> 6), (short) (((byte) KeyEvent.getModifierMetaStateMask()) + 1), (ViewConfiguration.getKeyRepeatDelay() >> 16) - 17, (byte) ExpandableListView.getPackedPositionGroup(0L), objArr2);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr2[0], new Class[0]).invoke(null, new Object[0])).longValue() & (-1024);
        long j = -183;
        long j2 = jLongValue;
        long j3 = -1;
        long j4 = j3 ^ 3284286868929981880L;
        long jIdentityHashCode = ((long) System.identityHashCode(this)) ^ j3;
        long j5 = j4 | jIdentityHashCode;
        long j6 = j3 ^ (-1187029694188022893L);
        long j7 = j6 | jIdentityHashCode;
        long j8 = (j * 3284286868929981880L) + (j * (-1187029694188022893L)) + (((long) (-184)) * (((j5 | (-1187029694188022893L)) ^ j3) | ((3284286868929981880L | j7) ^ j3)));
        long j9 = 184;
        long j10 = j8 + (((j7 ^ j3) | ((j4 | j6) ^ j3) | (j5 ^ j3)) * j9) + (j9 * (-1182489803646746693L));
        int i4 = 0;
        try {
            while (i4 != 10) {
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-638037654);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (37836 - (ViewConfiguration.getLongPressTimeout() >> 16)), TextUtils.indexOf((CharSequence) "", '0', i2) + 60, 19 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), 1030158013, false, "TuitionPaymentFragmentspecialinlinedviewModeldefault3", null);
                }
                int i5 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getInt(obj);
                int i6 = i2;
                long j11 = j2;
                while (true) {
                    int i7 = cancelAll + 37;
                    notify = i7 % 128;
                    int i8 = 2;
                    int i9 = i7 % 2;
                    int i10 = i2;
                    while (i10 != 8) {
                        int i11 = cancelAll + 95;
                        notify = i11 % 128;
                        int i12 = i11 % i8;
                        i5 = (((((int) (j11 >> i10)) & 255) + (i5 << 6)) + (i5 << 16)) - i5;
                        i10++;
                        i8 = 2;
                    }
                    if (i6 != 0) {
                        break;
                    }
                    i6++;
                    j11 = j10;
                    i2 = 0;
                }
                if (i5 == i3) {
                    sb.append(str2);
                    sb.append(")");
                    return sb.toString();
                }
                int i13 = cancelAll + 61;
                notify = i13 % 128;
                if (i13 % 2 != 0) {
                    j2 |= 1024;
                    i4 += 11;
                } else {
                    j2 -= 1024;
                    i4++;
                }
                i2 = 0;
                obj = null;
            }
            Object[] objArr3 = {244570541};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-725886332);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) ((TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 46038), TextUtils.getCapsMode("", 0, 0) + 1134, 18 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), 807763283, false, null, new Class[]{Integer.TYPE});
            }
            Object[] objArr4 = {Integer.valueOf(iIntValue), 0, 535806997, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).newInstance(objArr3), false};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1443305588);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                char touchSlop = (char) (ViewConfiguration.getTouchSlop() >> 8);
                int edgeSlop = (ViewConfiguration.getEdgeSlop() >> 16) + 1031;
                int maximumFlingVelocity = 15 - (ViewConfiguration.getMaximumFlingVelocity() >> 16);
                byte[] bArr = $$a;
                byte b2 = bArr[7];
                Object[] objArr5 = new Object[1];
                f(b2, b2, bArr[5], objArr5);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(touchSlop, edgeSlop, maximumFlingVelocity, 1298546779, false, (String) objArr5[0], new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (45994 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))), 1165 - AndroidCharacter.getMirror('0'), ExpandableListView.getPackedPositionType(0L) + 17), Boolean.TYPE});
            }
            Object[] objArr6 = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr4);
            int i14 = ((int[]) objArr6[1])[0];
            int i15 = ((int[]) objArr6[3])[0];
            if (i15 != i14) {
                ArrayList arrayList = new ArrayList();
                String[] strArr = (String[]) objArr6[0];
                if (strArr != null) {
                    int i16 = notify + 47;
                    cancelAll = i16 % 128;
                    for (int i17 = i16 % 2 == 0 ? 1 : 0; i17 < strArr.length; i17++) {
                        arrayList.add(strArr[i17]);
                    }
                }
                Toast.makeText((Context) null, i15 / (((i15 - 1) * i15) % 2), 0).show();
            }
            sb.append(str2);
            sb.append(")");
            return sb.toString();
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
        Object[] objArr7 = new Object[1];
        c(new char[]{0, 0, 0, 0}, new char[]{65145, 13067, 35114, 44765}, (char) (56713 - (ViewConfiguration.getTouchSlop() >> 8)), (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) - 1, new char[]{50275, 12760, 17753, 56278, 30750, 41148, 38463, 52692, 23660, 9571, 34352, 5415, 1753, 42360, 5940, 14319}, objArr7);
        Class<?> cls2 = Class.forName((String) objArr7[0]);
        Object[] objArr8 = new Object[1];
        c(new char[]{0, 0, 0, 0}, new char[]{15682, 10357, 7159, 53591}, (char) (22300 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))), TextUtils.lastIndexOf("", '0', 0, 0) + 1, new char[]{9924, 56480, 34221, 62450, 6795, 21524, 29492, 25700, 59200, 43227, 37008, 48535, 48160, 63890, 56449, 15601}, objArr8);
        iIntValue = ((Integer) cls2.getMethod((String) objArr8[0], Object.class).invoke(null, this)).intValue();
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
        while (sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2 < length3) {
            int i4 = $10 + 57;
            $11 = i4 % 128;
            int i5 = i4 % i2;
            try {
                Object[] objArr2 = {sessionProcessor};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1033601528);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    byte b2 = (byte) 0;
                    byte b3 = b2;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (Color.rgb(0, 0, 0) + 16785544), (-16775981) - Color.rgb(0, 0, 0), TextUtils.indexOf("", "", 0, 0) + 35, -653973969, false, $$e(b2, b3, b3), new Class[]{Object.class});
                }
                int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).intValue();
                Object[] objArr3 = {sessionProcessor};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1120586870);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                    byte b4 = (byte) 0;
                    byte b5 = b4;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) - 1), 2765 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), TextUtils.indexOf((CharSequence) "", '0', 0) + 15, 1504416861, false, $$e(b4, b5, (byte) (b5 + 2)), new Class[]{Object.class});
                }
                int iIntValue2 = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).intValue();
                Object[] objArr4 = {sessionProcessor, Integer.valueOf(cArr4[sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2 % 4] * 32718), Integer.valueOf(cArr5[iIntValue])};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(811618268);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (KeyEvent.keyCodeFromString("") + 43325), 254 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 22, -721491957, false, "j", new Class[]{Object.class, Integer.TYPE, Integer.TYPE});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
                Object[] objArr5 = {Integer.valueOf(cArr4[iIntValue2] * 32718), Integer.valueOf(cArr5[iIntValue])};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1821841887);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    byte b6 = (byte) 0;
                    byte b7 = b6;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (65199 - Process.getGidForName("")), ExpandableListView.getPackedPositionChild(0L) + 2892, ExpandableListView.getPackedPositionChild(0L) + 18, 2012627446, false, $$e(b6, b7, (byte) (b7 + 1)), new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr5[iIntValue2] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).charValue();
                cArr4[iIntValue2] = sessionProcessor.b;
                cArr6[sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2] = (char) (((((long) (cArr4[iIntValue2] ^ cArr3[sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2])) ^ (TuitionPaymentFragmentspecialinlinedviewModeldefault3 ^ (-6377398940819159759L))) ^ ((long) ((int) (((long) b) ^ (-6377398940819159759L))))) ^ ((long) ((char) (((long) TuitionPaymentFragmentbindingInflater1) ^ (-6377398940819159759L)))));
                sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2++;
                int i6 = $11 + 29;
                $10 = i6 % 128;
                int i7 = i6 % 2;
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

    private static void e(int i, int i2, short s, int i3, byte b2, Object[] objArr) throws Throwable {
        int i4;
        long j;
        int i5 = 2 % 2;
        SessionConfigValidatingBuilderExternalSyntheticLambda0 sessionConfigValidatingBuilderExternalSyntheticLambda0 = new SessionConfigValidatingBuilderExternalSyntheticLambda0();
        StringBuilder sb = new StringBuilder();
        try {
            Object[] objArr2 = {Integer.valueOf(i3), Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault2)};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1238528667);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                byte b3 = (byte) 0;
                byte b4 = b3;
                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) ExpandableListView.getPackedPositionGroup(0L), 2267 - (ViewConfiguration.getWindowTouchSlop() >> 8), 'Q' - AndroidCharacter.getMirror('0'), 1387473586, false, $$e(b3, b4, (byte) (b4 | 15)), new Class[]{Integer.TYPE, Integer.TYPE});
            }
            int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).intValue();
            if (iIntValue == -1) {
                int i6 = $10 + 37;
                $11 = i6 % 128;
                int i7 = i6 % 2;
                i4 = 1;
            } else {
                i4 = 0;
            }
            if (i4 == 0) {
                j = 3046761265686732006L;
            } else {
                byte[] bArr = asBinder;
                if (bArr != null) {
                    int length = bArr.length;
                    byte[] bArr2 = new byte[length];
                    for (int i8 = 0; i8 < length; i8++) {
                        try {
                            Object[] objArr3 = {Integer.valueOf(bArr[i8])};
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(632534666);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                byte b5 = (byte) 0;
                                byte b6 = b5;
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (ViewConfiguration.getEdgeSlop() >> 16), View.MeasureSpec.makeMeasureSpec(0, 0) + 3358, View.MeasureSpec.getSize(0) + 18, -1054011043, false, $$e(b5, b6, (byte) (b6 | 19)), new Class[]{Integer.TYPE});
                            }
                            bArr2[i8] = ((Byte) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).byteValue();
                        } catch (Throwable th) {
                            Throwable cause = th.getCause();
                            if (cause == null) {
                                throw th;
                            }
                            throw cause;
                        }
                    }
                    bArr = bArr2;
                }
                if (bArr != null) {
                    byte[] bArr3 = asBinder;
                    Object[] objArr4 = {Integer.valueOf(i), Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault1)};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1238528667);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                        byte b7 = (byte) 0;
                        byte b8 = b7;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (ViewConfiguration.getScrollBarSize() >> 8), TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 2268, TextUtils.lastIndexOf("", '0', 0) + 34, 1387473586, false, $$e(b7, b8, (byte) (b8 | 15)), new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    iIntValue = (byte) (((byte) (((long) bArr3[((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4)).intValue()]) ^ 3046761265686732006L)) + ((int) (((long) TuitionPaymentFragmentspecialinlinedviewModeldefault2) ^ 3046761265686732006L)));
                    j = 3046761265686732006L;
                } else {
                    j = 3046761265686732006L;
                    iIntValue = (short) (((short) (((long) f400a[i + ((int) (((long) TuitionPaymentFragmentspecialinlinedviewModeldefault1) ^ 3046761265686732006L))]) ^ 3046761265686732006L)) + ((int) (((long) TuitionPaymentFragmentspecialinlinedviewModeldefault2) ^ 3046761265686732006L)));
                }
            }
            if (iIntValue > 0) {
                sessionConfigValidatingBuilderExternalSyntheticLambda0.b = ((i + iIntValue) - 2) + ((int) (((long) TuitionPaymentFragmentspecialinlinedviewModeldefault1) ^ j)) + i4;
                Object[] objArr5 = {sessionConfigValidatingBuilderExternalSyntheticLambda0, Integer.valueOf(i2), Integer.valueOf(asInterface), sb};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1079014435);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    byte b9 = (byte) 0;
                    byte b10 = b9;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) ((AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 55904), 2855 - (ViewConfiguration.getWindowTouchSlop() >> 8), 13 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), -1529949196, false, $$e(b9, b10, (byte) (b10 | 16)), new Class[]{Object.class, Integer.TYPE, Integer.TYPE, Object.class});
                }
                ((StringBuilder) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).append(sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
                sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                byte[] bArr4 = asBinder;
                if (bArr4 != null) {
                    int length2 = bArr4.length;
                    byte[] bArr5 = new byte[length2];
                    for (int i9 = 0; i9 < length2; i9++) {
                        bArr5[i9] = (byte) (((long) bArr4[i9]) ^ 3046761265686732006L);
                    }
                    bArr4 = bArr5;
                }
                boolean z = bArr4 != null;
                sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 1;
                while (sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3 < iIntValue) {
                    if (!z) {
                        short[] sArr = f400a;
                        int i10 = sessionConfigValidatingBuilderExternalSyntheticLambda0.b;
                        sessionConfigValidatingBuilderExternalSyntheticLambda0.b = i10 - 1;
                        sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = (char) (sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2 + (((short) (((short) (((long) sArr[i10]) ^ 3046761265686732006L)) + s)) ^ b2));
                    } else {
                        int i11 = $10 + 27;
                        $11 = i11 % 128;
                        if (i11 % 2 == 0) {
                            byte[] bArr6 = asBinder;
                            int i12 = sessionConfigValidatingBuilderExternalSyntheticLambda0.b;
                            sessionConfigValidatingBuilderExternalSyntheticLambda0.b = i12 + 1;
                            sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = (char) (sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2 / (((byte) (((byte) (((long) bArr6[i12]) + 3046761265686732006L)) >> s)) ^ b2));
                        } else {
                            byte[] bArr7 = asBinder;
                            int i13 = sessionConfigValidatingBuilderExternalSyntheticLambda0.b;
                            sessionConfigValidatingBuilderExternalSyntheticLambda0.b = i13 - 1;
                            sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = (char) (sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2 + (((byte) (((byte) (((long) bArr7[i13]) ^ 3046761265686732006L)) + s)) ^ b2));
                        }
                        sb.append(sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
                        sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                        sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3++;
                    }
                    sb.append(sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
                    sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                    sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3++;
                }
            }
            objArr[0] = sb.toString();
        } catch (Throwable th2) {
            Throwable cause2 = th2.getCause();
            if (cause2 == null) {
                throw th2;
            }
            throw cause2;
        }
    }

    static {
        d = 1;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        int i = g + 45;
        d = i % 128;
        if (i % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ FlagDeeplinkRequest copy$default(FlagDeeplinkRequest flagDeeplinkRequest, String str, String str2, int i, Object obj) {
        int i2 = 2 % 2;
        if ((i & 1) != 0) {
            int i3 = notify + 107;
            cancelAll = i3 % 128;
            if (i3 % 2 == 0) {
                String str3 = flagDeeplinkRequest.idTrx;
                throw null;
            }
            str = flagDeeplinkRequest.idTrx;
        }
        if ((i & 2) != 0) {
            int i4 = cancelAll + 77;
            notify = i4 % 128;
            if (i4 % 2 != 0) {
                String str4 = flagDeeplinkRequest.email;
                throw null;
            }
            str2 = flagDeeplinkRequest.email;
        }
        FlagDeeplinkRequest flagDeeplinkRequestCopy = flagDeeplinkRequest.copy(str, str2);
        int i5 = cancelAll + 85;
        notify = i5 % 128;
        int i6 = i5 % 2;
        return flagDeeplinkRequestCopy;
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = notify;
        int i3 = i2 + 33;
        cancelAll = i3 % 128;
        int i4 = i3 % 2;
        String str = this.idTrx;
        int i5 = i2 + 43;
        cancelAll = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component2() {
        int i = 2 % 2;
        int i2 = notify + 85;
        cancelAll = i2 % 128;
        if (i2 % 2 != 0) {
            return this.email;
        }
        throw null;
    }

    public final FlagDeeplinkRequest copy(String p0, String p1) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(p0, "");
        Intrinsics.checkNotNullParameter(p1, "");
        FlagDeeplinkRequest flagDeeplinkRequest = new FlagDeeplinkRequest(p0, p1);
        int i2 = cancelAll + 17;
        notify = i2 % 128;
        int i3 = i2 % 2;
        return flagDeeplinkRequest;
    }

    public final boolean equals(Object p0) {
        int i = 2 % 2;
        int i2 = notify + 71;
        cancelAll = i2 % 128;
        int i3 = i2 % 2;
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof FlagDeeplinkRequest)) {
            return false;
        }
        FlagDeeplinkRequest flagDeeplinkRequest = (FlagDeeplinkRequest) p0;
        if (!Intrinsics.areEqual(this.idTrx, flagDeeplinkRequest.idTrx)) {
            return false;
        }
        if (Intrinsics.areEqual(this.email, flagDeeplinkRequest.email)) {
            return true;
        }
        int i4 = notify;
        int i5 = i4 + 81;
        cancelAll = i5 % 128;
        int i6 = i5 % 2;
        int i7 = i4 + 53;
        cancelAll = i7 % 128;
        if (i7 % 2 == 0) {
            int i8 = 39 / 0;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        String str;
        int i2 = 2 % 2;
        int i3 = notify + 21;
        cancelAll = i3 % 128;
        int i4 = i3 % 2;
        int iHashCode = this.idTrx.hashCode();
        if (i4 == 0) {
            i = iHashCode >>> 99;
            str = this.email;
        } else {
            i = iHashCode * 31;
            str = this.email;
        }
        return i + str.hashCode();
    }

    public static Object[] TuitionPaymentFragmentspecialinlinedviewModeldefault1(int i, int i2) throws Throwable {
        int i3;
        int i4;
        String line;
        Object[] objArr;
        char c;
        int longPressTimeout;
        int i5;
        int i6;
        int i7;
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault1;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16 = 2 % 2;
        int i17 = 4;
        try {
            String[] strArr = new String[2];
            int i18 = (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1));
            int i19 = (i18 & (-283774109)) + (i18 | (-283774109));
            int i20 = -Color.argb(0, 0, 0, 0);
            int i21 = notify;
            int i22 = (i21 & 81) + (i21 | 81);
            cancelAll = i22 % 128;
            if (i22 % 2 == 0) {
                int i23 = -i20;
                int i24 = (i23 ^ 236) + ((i23 & 236) << 1);
                int i25 = ((i24 | 1492947072) << 1) - (i24 ^ 1492947072);
                int i26 = ~i20;
                int i27 = ~i;
                i12 = i25 << ((-235) / ((~((i26 ^ i27) | (i26 & i27))) | (-1492946601)));
            } else {
                int i28 = ~((~i) | (~i20));
                i12 = (((i20 * 236) - (-1196787473)) - (~(((i28 & (-1492946601)) | (i28 ^ (-1492946601))) * (-235)))) - 1;
            }
            int i29 = ~((~i20) | i);
            int i30 = (i12 - (~(-(-((-470) * (((-1492946601) & i29) | ((-1492946601) ^ i29))))))) - 1;
            int i31 = ~((1492946600 & i20) | (1492946600 ^ i20));
            int i32 = ~i20;
            int i33 = (i32 & (-1492946601)) | (i32 ^ (-1492946601));
            int i34 = ~((i33 & i) | (i33 ^ i));
            int i35 = ((i31 & i34) | (i31 ^ i34)) * 235;
            int i36 = (i30 & i35) + (i35 | i30);
            byte modifierMetaStateMask = (byte) KeyEvent.getModifierMetaStateMask();
            int i37 = -(SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1));
            Object[] objArr2 = new Object[1];
            e(i19, i36, (short) ((modifierMetaStateMask ^ 1) + ((modifierMetaStateMask & 1) << 1)), (i37 ^ (-12)) + ((i37 & (-12)) << 1), (byte) ((-2) - ((-(ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))) ^ (-1))), objArr2);
            strArr[0] = (String) objArr2[0];
            int scrollBarSize = ViewConfiguration.getScrollBarSize();
            int i38 = notify;
            int i39 = i38 + 47;
            cancelAll = i39 % 128;
            int i40 = i39 % 2;
            int i41 = scrollBarSize >> 8;
            int i42 = i41 * (-721);
            int i43 = ((i42 | (-1557310597)) << 1) - (i42 ^ (-1557310597));
            int i44 = ~i;
            int i45 = ~i41;
            int i46 = ((i38 | 29) << 1) - (i38 ^ 29);
            cancelAll = i46 % 128;
            if (i46 % 2 == 0) {
                int i47 = ~((i45 ^ 283774090) | (i45 & 283774090));
                int i48 = (i44 ^ i47) | (i47 & i44);
                int i49 = ~((i41 ^ (-283774091)) | (i41 & (-283774091)));
                i13 = i43 >> (1444 / (i48 | i49));
                int i50 = ~((i41 ^ i) | (i41 & i));
                i14 = (i49 & i50) | (i49 ^ i50);
                i15 = (i ^ (-283774091)) | (i & (-283774091));
            } else {
                int i51 = ~(i45 | 283774090);
                int i52 = (i51 & i44) | (i44 ^ i51);
                int i53 = ~(i41 | (-283774091));
                i13 = (i43 - (~(((i52 & i53) | (i52 ^ i53)) * 1444))) - 1;
                int i54 = ~((i41 ^ (-283774091)) | (i41 & (-283774091)));
                int i55 = ~((i41 ^ i) | (i41 & i));
                i14 = (i54 & i55) | (i54 ^ i55);
                i15 = i | (-283774091);
            }
            int i56 = -(-((-1444) * (i14 | (~i15))));
            int i57 = ((i13 | i56) << 1) - (i13 ^ i56);
            int i58 = ((~((i45 ^ (-283774091)) | (i45 & (-283774091)))) | (~((283774090 ^ i41) | (i41 & 283774090)))) * 722;
            int i59 = (i57 & i58) + (i58 | i57);
            int iIndexOf = TextUtils.indexOf("", "") - 1492946587;
            float fComplexToFloat = TypedValue.complexToFloat(0);
            int i60 = notify;
            int i61 = (i60 ^ 35) + ((i60 & 35) << 1);
            cancelAll = i61 % 128;
            short s = (short) (fComplexToFloat > 0.0f ? 1 : (fComplexToFloat == 0.0f ? 0 : -1));
            if (i61 % 2 == 0) {
                int i62 = -TextUtils.indexOf("", "", 1);
                Object[] objArr3 = new Object[1];
                e(i59, iIndexOf, s, ((i62 | 120) << 1) - (i62 ^ 120), (byte) (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), objArr3);
                strArr[1] = (String) objArr3[0];
            } else {
                Object[] objArr4 = new Object[1];
                e(i59, iIndexOf, s, (-15) - (~(-TextUtils.indexOf("", "", 0))), (byte) (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), objArr4);
                strArr[1] = (String) objArr4[0];
            }
            int i63 = notify;
            int i64 = ((i63 | 83) << 1) - (i63 ^ 83);
            cancelAll = i64 % 128;
            int i65 = i64 % 2;
            int i66 = 0;
            while (true) {
                if (i66 >= 2) {
                    i3 = i;
                    break;
                }
                int i67 = notify;
                int i68 = (i67 ^ 71) + ((i67 & 71) << 1);
                cancelAll = i68 % 128;
                int i69 = i68 % 2;
                String str = strArr[i66];
                char[] cArr = new char[i17];
                // fill-array-data instruction
                cArr[0] = 0;
                cArr[1] = 0;
                cArr[2] = 0;
                cArr[3] = 0;
                char[] cArr2 = new char[i17];
                // fill-array-data instruction
                cArr2[0] = 35629;
                cArr2[1] = 43947;
                cArr2[2] = 601;
                cArr2[3] = 8167;
                int i70 = -(ViewConfiguration.getMinimumFlingVelocity() >> 16);
                int i71 = i70 * 398;
                int i72 = ((i71 | (-23418648)) << 1) - (i71 ^ (-23418648));
                int i73 = ~i70;
                int i74 = ~((i73 ^ i44) | (i73 & i44));
                int i75 = ~((i73 ^ 59138) | (i73 & 59138));
                int i76 = (i74 ^ i75) | (i74 & i75);
                int i77 = ~((i44 ^ 59138) | (i44 & 59138));
                int i78 = ((i76 ^ i77) | (i77 & i76)) * (-397);
                int i79 = (i72 ^ i78) + ((i78 & i72) << 1);
                int i80 = i75 * (-397);
                int i81 = ((i79 | i80) << 1) - (i80 ^ i79);
                int i82 = ~i70;
                int i83 = ~((i82 & 59138) | (i82 ^ 59138));
                int i84 = (i83 & i) | (i ^ i83);
                int i85 = ~((i70 & (-59139)) | ((-59139) ^ i70));
                char c2 = (char) (i81 + (((i85 & i84) | (i84 ^ i85)) * 397));
                int i86 = (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1));
                ExecutorDelivery.ResponseDeliveryRunnable.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                int i87 = i86 * (-520);
                int i88 = ((i87 | (-522)) << 1) - (i87 ^ (-522));
                int i89 = (i88 << 1) - i88;
                int i90 = -(-((~i86) * (-1042)));
                Object[] objArr5 = new Object[1];
                c(cArr, cArr2, c2, ((((i89 | i90) << 1) - (i89 ^ i90)) - (~((~i86) * 521))) - 1, new char[]{23981, 38733, 34992, 18419, 33222, 22591, 54566, 23463, 59383, 25014, 47187, 55554, 60205, 25443, 58224, 24418}, objArr5);
                Class<?> cls = Class.forName((String) objArr5[0]);
                if (!(!((Boolean) cls.getMethod(str, new Class[0]).invoke(cls, null)).booleanValue())) {
                    i3 = i ^ 1;
                    break;
                }
                int i91 = ((i66 | 79) << 1) - (i66 ^ 79);
                i66 = (i91 & (-78)) + (i91 | (-78));
                i17 = 4;
            }
        } catch (Exception unused) {
            i3 = i ^ 2;
        }
        try {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(109138771);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                char mirror = (char) (AndroidCharacter.getMirror('0') + 2371);
                int iAlpha = Color.alpha(0) + 2845;
                int fadingEdgeLength = 5 - (ViewConfiguration.getFadingEdgeLength() >> 16);
                byte[] bArr = $$a;
                byte b2 = bArr[5];
                Object[] objArr6 = new Object[1];
                f(b2, b2, bArr[7], objArr6);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(mirror, iAlpha, fadingEdgeLength, -501222268, false, (String) objArr6[0], new Class[0]);
            }
            long jLongValue = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, null)).longValue();
            long j = -847118785;
            int iMaxMemory = (int) Runtime.getRuntime().maxMemory();
            long j2 = TypedValues.CycleType.TYPE_EASING;
            long j3 = iMaxMemory;
            long j4 = -1;
            int i92 = i3;
            long j5 = j ^ j4;
            long j6 = (((long) (-419)) * j) + (((long) 421) * jLongValue) + (((jLongValue | j3) ^ j4) * j2) + (((long) (-420)) * (jLongValue | j5)) + (j2 * ((((jLongValue ^ j4) | j5) ^ j4) | (((j3 ^ j4) | jLongValue) ^ j4))) + ((long) (-312067901));
            int iNextInt = new Random().nextInt();
            int i93 = ~iNextInt;
            int i94 = ((int) (j6 >> 32)) & (1663889373 + (((~((-381982788) | i93)) | (~((-134283557) | iNextInt)) | (~((-538977281) | iNextInt))) * 765) + (((~((-516266344) | i93)) | 381982787) * 1530) + (((~(iNextInt | (-516266344))) | (~(i93 | (-538977281)))) * 765));
            int i95 = cancelAll + 117;
            notify = i95 % 128;
            int i96 = i95 % 2;
            int iMyPid = Process.myPid();
            int i97 = (-91348217) + (((-232708021) | iMyPid) * (-50));
            int i98 = ~(1340080117 | iMyPid);
            int i99 = ~iMyPid;
            int i100 = ((int) j6) & (i97 + ((i98 | (~((-135561729) | i99))) * 50) + (((~(i99 | (-232708021))) | (~(1204518389 | i99)) | 135561728) * 50));
            int i101 = (i94 & i100) | (i94 ^ i100);
            int i102 = i ^ 10;
            int i103 = notify;
            int i104 = ((i103 | 125) << 1) - (i103 ^ 125);
            cancelAll = i104 % 128;
            if (i104 % 2 == 0) {
                int i105 = (i101 & (-2)) | ((~i101) & 1);
                int i106 = -i105;
                i4 = ((i105 & i106) | (i105 ^ i106)) * 87;
            } else {
                int i107 = i101 ^ 1;
                int i108 = -i107;
                i4 = ((i107 & i108) | (i107 ^ i108)) >> 31;
            }
            int i109 = i102 & (~i4);
            int i110 = i4 & i;
            int i111 = (~i92) & i;
            int i112 = ~i;
            int i113 = i111 | (i92 & i112);
            int i114 = -i113;
            int i115 = ((i113 & i114) | (i113 ^ i114)) >> 31;
            int i116 = ((i110 & i109) | (i109 ^ i110)) & (~i115);
            int i117 = i92 & i115;
            int i118 = (i116 ^ i117) | (i116 & i117);
            try {
                int i119 = -(ViewConfiguration.getScrollDefaultDelay() >> 16);
                Object[] objArr7 = new Object[1];
                c(new char[]{0, 0, 0, 0}, new char[]{61550, 30410, 52521, 31090}, (char) (((i119 | 29389) << 1) - (i119 ^ 29389)), (-2) - (~(-TextUtils.indexOf((CharSequence) "", '0', 0, 0))), new char[]{62549, 36112, 56514, 38308, 24992, 42735, 31082, 14355, 20707, 3819, 53200, 60491, 10650, 51851, 60761, 20417, 34779, 14924, 16113, 5166, 26557, 3916, 31180, 31201, 21457, 25509, 29915, 42516, 38311, 27598, 36432, 9603, 3517, 8789, 14024, 23955, 52061, 15009, 61028, 56513}, objArr7);
                File file = new File((String) objArr7[0]);
                if (file.canRead()) {
                    FileReader fileReader = new FileReader(file);
                    BufferedReader bufferedReader = new BufferedReader(fileReader);
                    try {
                        line = bufferedReader.readLine();
                        int absoluteGravity = Gravity.getAbsoluteGravity(0, 0) - 283774074;
                        int i120 = -Color.red(0);
                        int i121 = ((i120 * (-559)) - 24417636) + ((~(i112 | i120)) * (-560));
                        int i122 = (1492946595 & i120) | (1492946595 ^ i120);
                        int i123 = -(-((~((i122 & i) | (i122 ^ i))) * (-560)));
                        int i124 = ((i121 | i123) << 1) - (i121 ^ i123);
                        int i125 = ~((~i120) | (-1492946596));
                        int i126 = ~(((-1492946596) & i112) | (i112 ^ (-1492946596)));
                        int i127 = (i124 - (~(((i125 & i126) | (i125 ^ i126)) * 560))) - 1;
                        short defaultSize = (short) View.getDefaultSize(0, 0);
                        int packedPositionChild = ExpandableListView.getPackedPositionChild(0L);
                        int i128 = notify + 11;
                        cancelAll = i128 % 128;
                        int i129 = i128 % 2;
                        int iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = ExecutorDelivery.ResponseDeliveryRunnable.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                        int i130 = packedPositionChild * 615;
                        int i131 = ((i130 | 17164) << 1) - (i130 ^ 17164);
                        int i132 = ~packedPositionChild;
                        int i133 = ~(i132 | (-28));
                        int i134 = notify;
                        int i135 = i134 + 103;
                        cancelAll = i135 % 128;
                        int i136 = i135 % 2;
                        int i137 = i133 | iTuitionPaymentFragmentspecialinlinedviewModeldefault2;
                        int i138 = ~((27 ^ packedPositionChild) | (27 & packedPositionChild));
                        int i139 = 614 * ((i137 ^ i138) | (i137 & i138));
                        int i140 = (i131 ^ i139) + ((i131 & i139) << 1);
                        int i141 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault2;
                        int i142 = ~((i132 & i141) | (i132 ^ i141));
                        int i143 = ~packedPositionChild;
                        int i144 = ~((i143 ^ (-28)) | (i143 & (-28)));
                        int i145 = (i142 ^ i144) | (i144 & i142);
                        int i146 = ~(i141 | (-28));
                        int i147 = i140 + (((i145 ^ i146) | (i145 & i146)) * (-1228));
                        int i148 = (i143 ^ 27) | (i143 & 27);
                        int i149 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault2;
                        int i150 = ~((i148 & i149) | (i148 ^ i149));
                        int i151 = i134 + 13;
                        cancelAll = i151 % 128;
                        if (i151 % 2 == 0) {
                            int i152 = i149 | packedPositionChild;
                            Object[] objArr8 = new Object[1];
                            e(absoluteGravity, i127, defaultSize, i147 >>> (614 / ((~((i152 & (-28)) | (i152 ^ (-28)))) | i150)), (byte) (ViewConfiguration.getMaximumDrawingCacheSize() / 38), objArr8);
                            if (!line.equals((String) objArr8[0])) {
                                fileReader.close();
                                bufferedReader.close();
                            }
                            fileReader.close();
                            bufferedReader.close();
                            int i153 = notify;
                            int i154 = (i153 & 43) + (i153 | 43);
                            cancelAll = i154 % 128;
                            int i155 = i154 % 2;
                        } else {
                            int i156 = ~(packedPositionChild | i141 | (-28));
                            int i157 = -(-(((i150 & i156) | (i150 ^ i156)) * 614));
                            Object[] objArr9 = new Object[1];
                            e(absoluteGravity, i127, defaultSize, (i147 ^ i157) + ((i147 & i157) << 1), (byte) (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), objArr9);
                            if (line.equals((String) objArr9[0])) {
                                fileReader.close();
                                bufferedReader.close();
                                int i158 = notify;
                                int i159 = (i158 & 43) + (i158 | 43);
                                cancelAll = i159 % 128;
                                int i1510 = i159 % 2;
                            } else {
                                fileReader.close();
                                bufferedReader.close();
                            }
                        }
                        line = null;
                    } catch (Throwable th) {
                        fileReader.close();
                        bufferedReader.close();
                        throw th;
                    }
                } else {
                    line = null;
                }
            } catch (Exception unused2) {
            }
            try {
                int iLastIndexOf = TextUtils.lastIndexOf("", '0', 0, 0);
                char c3 = (char) ((iLastIndexOf & 36193) + (36193 | iLastIndexOf));
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                int i160 = iMakeMeasureSpec * (-711);
                int i161 = (i160 ^ (-786905414)) + ((i160 & (-786905414)) << 1);
                int i162 = ~((1699814421 ^ iMakeMeasureSpec) | (1699814421 & iMakeMeasureSpec));
                int i163 = ~((i112 ^ iMakeMeasureSpec) | (i112 & iMakeMeasureSpec));
                int i164 = -(-((i162 | i163) * (-712)));
                int i165 = (i161 & i164) + (i164 | i161);
                int i166 = (1699814421 & i112) | (1699814421 ^ i112);
                int i167 = ~((i166 & iMakeMeasureSpec) | (i166 ^ iMakeMeasureSpec));
                int i168 = iMakeMeasureSpec | (-1699814422);
                int i169 = -(-((i167 | (~((i168 & i) | (i168 ^ i)))) * (-712)));
                Object[] objArr10 = new Object[1];
                c(new char[]{0, 0, 0, 0}, new char[]{59921, 44771, 24730, 62605}, c3, (((i165 ^ i169) + ((i165 & i169) << 1)) - (~((i163 | 1699814421) * 712))) - 1, new char[]{43594, 57466, 19616, 21479, 63052, 39477, 63712, 16637, 35164, 49682, 17631, 59248, 21603, 29255, 22398, 41002, 44520, 35277, 13534, 34011, 63624, 60731, 21497, 40898, 60703, 61756, 7721, 36176, 33196, 47477, 9361}, objArr10);
                File file2 = new File((String) objArr10[0]);
                int i170 = cancelAll;
                int i171 = (i170 ^ 119) + ((i170 & 119) << 1);
                notify = i171 % 128;
                int i172 = i171 % 2;
                if (!(!file2.canRead())) {
                    FileReader fileReader2 = new FileReader(file2);
                    BufferedReader bufferedReader2 = new BufferedReader(fileReader2);
                    try {
                        String line2 = bufferedReader2.readLine();
                        char[] cArr3 = {0, 0, 0, 0};
                        char[] cArr4 = {56383, 55733, 55534, 40051};
                        int i173 = cancelAll;
                        int i174 = ((i173 | 55) << 1) - (i173 ^ 55);
                        notify = i174 % 128;
                        if (i174 % 2 != 0) {
                            longPressTimeout = ViewConfiguration.getLongPressTimeout() / 13;
                            i5 = (-755) % longPressTimeout;
                            i6 = 32102;
                        } else {
                            longPressTimeout = ViewConfiguration.getLongPressTimeout() >> 16;
                            i5 = longPressTimeout * (-755);
                            i6 = 29656;
                        }
                        int i175 = i6;
                        int i176 = -(-((-755) * i175));
                        int i177 = ((i5 | i176) << 1) - (i176 ^ i5);
                        int i178 = ~longPressTimeout;
                        int i179 = ~i175;
                        int i180 = i177 + ((~((i178 ^ i179) | (i179 & i178))) * 1512);
                        int i181 = ~i175;
                        int i182 = ~((i178 ^ i181) | (i178 & i181));
                        int i183 = (i175 & longPressTimeout) | (longPressTimeout ^ i175);
                        int i184 = ~((i183 ^ i) | (i183 & i));
                        int i185 = ((i182 & i184) | (i182 ^ i184)) * (-756);
                        int i186 = (i180 & i185) + (i180 | i185);
                        int i187 = ~i;
                        int i188 = ((i187 & i183) | (i183 ^ i187)) * 756;
                        char c4 = (char) ((i186 ^ i188) + ((i188 & i186) << 1));
                        int i189 = -TextUtils.indexOf("", "");
                        int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = ExecutorDelivery.ResponseDeliveryRunnable.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                        int i190 = i189 * (-1939);
                        int i191 = (i190 ^ (-205207180)) + ((i190 & (-205207180)) << 1);
                        int i192 = ~(287722019 | i189);
                        int i193 = ~((~iTuitionPaymentFragmentspecialinlinedviewModeldefault3) | (-287722020));
                        int i194 = -(-(((i192 ^ i193) | (i193 & i192)) * (-970)));
                        int i195 = ((i191 | i194) << 1) - (i191 ^ i194);
                        int i196 = ~i189;
                        int i197 = i195 + ((~((i196 ^ (-287722020)) | (i196 & (-287722020)))) * 1940);
                        int i198 = ~((~i189) | 287722019);
                        int i199 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault3;
                        int i200 = ~((i199 & (-287722020)) | (i199 ^ (-287722020)));
                        int i201 = ((i198 & i200) | (i198 ^ i200)) * 970;
                        Object[] objArr11 = new Object[1];
                        c(cArr3, cArr4, c4, (i197 & i201) + (i201 | i197), new char[]{64441}, objArr11);
                        boolean zEquals = line2.equals((String) objArr11[0]);
                        fileReader2.close();
                        bufferedReader2.close();
                        if (zEquals) {
                            int i202 = -TextUtils.getCapsMode("", 0, 0);
                            int i203 = (i202 * (-300)) - (-199576176);
                            int i204 = (-283774072) | i202;
                            int i205 = (~((i204 & i) | (i204 ^ i))) * (-301);
                            int i206 = (i203 ^ i205) + ((i203 & i205) << 1);
                            int i207 = -(-(((~((283774071 & i) | (283774071 ^ i))) | (~((i112 ^ i202) | (i112 & i202)))) * (-301)));
                            int i208 = (i206 & i207) + (i207 | i206);
                            int i209 = ~i202;
                            int i210 = ~((i209 & i) | (i209 ^ i));
                            int i211 = ((i210 & 283774071) | (283774071 ^ i210)) * 301;
                            int i212 = ((i208 | i211) << 1) - (i211 ^ i208);
                            int iIndexOf2 = TextUtils.indexOf((CharSequence) "", '0');
                            int iTuitionPaymentFragmentspecialinlinedviewModeldefault4 = ExecutorDelivery.ResponseDeliveryRunnable.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                            int i213 = iIndexOf2 * 755;
                            int i214 = (i213 & (-1092598078)) + (i213 | (-1092598078));
                            int i215 = ~iIndexOf2;
                            int i216 = ~((i215 & (-1492946658)) | (i215 ^ (-1492946658)));
                            int i217 = ~iIndexOf2;
                            int i218 = i216 | (~((i217 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault4) | (i217 & iTuitionPaymentFragmentspecialinlinedviewModeldefault4)));
                            int i219 = ~((iTuitionPaymentFragmentspecialinlinedviewModeldefault4 ^ (-1492946658)) | (iTuitionPaymentFragmentspecialinlinedviewModeldefault4 & (-1492946658)));
                            int i220 = i214 + (((i218 & i219) | (i218 ^ i219)) * (-754));
                            int i221 = (i217 ^ (-1492946658)) | (i217 & (-1492946658));
                            int i222 = ~((i221 & iTuitionPaymentFragmentspecialinlinedviewModeldefault4) | (i221 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault4));
                            int i223 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault4;
                            int i224 = (iIndexOf2 & i223) | (i223 ^ iIndexOf2);
                            int i225 = ((~((i224 & (-1492946658)) | (i224 ^ (-1492946658)))) | i222) * (-754);
                            int i226 = (i220 & i225) + (i225 | i220);
                            int i227 = -(-(((i217 ^ i223) | (i223 & i217)) * 754));
                            int i228 = -(SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1));
                            short s2 = (short) (((i228 | 1) << 1) - (i228 ^ 1));
                            int i229 = -(-(ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)));
                            Object[] objArr12 = new Object[1];
                            e(i212, ((i226 | i227) << 1) - (i227 ^ i226), s2, (i229 ^ 3) + ((i229 & 3) << 1), (byte) Color.red(0), objArr12);
                            File file3 = new File((String) objArr12[0]);
                            if (!(!file3.canRead())) {
                                FileReader fileReader3 = new FileReader(file3);
                                BufferedReader bufferedReader3 = new BufferedReader(fileReader3);
                                try {
                                    String line3 = bufferedReader3.readLine();
                                    char[] cArr5 = {0, 0, 0, 0};
                                    char[] cArr6 = {56383, 55733, 55534, 40051};
                                    int i230 = cancelAll;
                                    int i231 = ((i230 | 121) << 1) - (i230 ^ 121);
                                    notify = i231 % 128;
                                    if (i231 % 2 != 0) {
                                        i7 = -View.combineMeasuredStates(1, 1);
                                        iTuitionPaymentFragmentspecialinlinedviewModeldefault1 = ExecutorDelivery.ResponseDeliveryRunnable.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                                        i8 = i7 * (-661);
                                        i9 = 18867;
                                        i10 = 0;
                                    } else {
                                        i7 = -View.combineMeasuredStates(0, 0);
                                        iTuitionPaymentFragmentspecialinlinedviewModeldefault1 = ExecutorDelivery.ResponseDeliveryRunnable.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                                        i8 = i7 * (-661);
                                        i9 = 29656;
                                        i10 = -19602616;
                                    }
                                    int i232 = -(-i10);
                                    int i233 = (i8 & i232) + (i232 | i8);
                                    int i234 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault1;
                                    int i235 = ~i7;
                                    int i236 = ~i9;
                                    int i237 = ~((i235 ^ i236) | (i236 & i235));
                                    int i238 = -(-(((i234 ^ i237) | (i234 & i237)) * 1324));
                                    int i239 = (i233 & i238) + (i233 | i238);
                                    int i240 = (i7 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault1) | (i7 & iTuitionPaymentFragmentspecialinlinedviewModeldefault1);
                                    int i241 = notify + 65;
                                    cancelAll = i241 % 128;
                                    if (i241 % 2 == 0) {
                                        int i242 = ~i240;
                                        int i243 = ~((iTuitionPaymentFragmentspecialinlinedviewModeldefault1 & i9) | (i9 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault1));
                                        int i244 = (i242 & i243) | (i242 ^ i243);
                                        i11 = i239 / ((i244 ^ (-1324)) + ((i244 & (-1324)) << 1));
                                    } else {
                                        int i245 = ~i240;
                                        int i246 = ~((iTuitionPaymentFragmentspecialinlinedviewModeldefault1 & i9) | (i9 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault1));
                                        int i247 = -(-(((i245 & i246) | (i245 ^ i246)) * (-1324)));
                                        i11 = (i239 ^ i247) + ((i247 & i239) << 1);
                                    }
                                    int i248 = ~((i235 ^ i9) | (i235 & i9));
                                    int i249 = ~i9;
                                    int i250 = ~((i7 & i249) | (i249 ^ i7));
                                    int i251 = -(-(662 * ((i250 & i248) | (i248 ^ i250))));
                                    char c5 = (char) ((i11 & i251) + (i251 | i11));
                                    int mode = View.MeasureSpec.getMode(0);
                                    int iTuitionPaymentFragmentspecialinlinedviewModeldefault5 = ExecutorDelivery.ResponseDeliveryRunnable.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                                    int i252 = mode * 567;
                                    int i253 = cancelAll + 101;
                                    notify = i253 % 128;
                                    int i254 = i253 % 2;
                                    int i255 = (i252 & (-645815948)) + (i252 | (-645815948));
                                    int i256 = ~mode;
                                    int i257 = ~((i256 ^ (-287722020)) | ((-287722020) & i256));
                                    int i258 = ~((i256 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault5) | (i256 & iTuitionPaymentFragmentspecialinlinedviewModeldefault5));
                                    int i259 = -(-(((i257 ^ i258) | (i258 & i257)) * (-566)));
                                    int i260 = (i255 & i259) + (i255 | i259);
                                    int i261 = (~((287722019 ^ mode) | (mode & 287722019))) * 566;
                                    int i262 = ((i260 | i261) << 1) - (i261 ^ i260);
                                    int i263 = (287722019 & i256) | (i256 ^ 287722019);
                                    int i264 = -(-((~((i263 & iTuitionPaymentFragmentspecialinlinedviewModeldefault5) | (i263 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault5))) * 566));
                                    Object[] objArr13 = new Object[1];
                                    c(cArr5, cArr6, c5, ((i262 | i264) << 1) - (i262 ^ i264), new char[]{64441}, objArr13);
                                    boolean zEquals2 = line3.equals((String) objArr13[0]);
                                    fileReader3.close();
                                    bufferedReader3.close();
                                    if (zEquals2 && line != null) {
                                        int i265 = cancelAll;
                                        int i266 = (i265 & 85) + (i265 | 85);
                                        int i267 = i266 % 128;
                                        notify = i267;
                                        int i268 = i266 % 2;
                                        int i269 = (~(i & 20)) & (i | 20);
                                        int i270 = i267 + 53;
                                        int i271 = i270 % 128;
                                        cancelAll = i271;
                                        int i272 = i270 % 2;
                                        String[] strArr2 = {line};
                                        int i273 = (i271 ^ 23) + ((i271 & 23) << 1);
                                        int i274 = i273 % 128;
                                        notify = i274;
                                        int i275 = i273 % 2;
                                        int[] iArr = (int[]) objArr[0];
                                        int i276 = i274 + 101;
                                        cancelAll = i276 % 128;
                                        int i277 = i276 % 2;
                                        iArr[0] = i269;
                                        objArr = new Object[]{new int[1], strArr2};
                                        c = 0;
                                    }
                                } catch (Throwable th2) {
                                    fileReader3.close();
                                    bufferedReader3.close();
                                    throw th2;
                                }
                            }
                        }
                        int i278 = ((int[]) objArr[c])[c];
                        int i279 = ((~i118) & i) | (i118 & i112);
                        int i280 = -i279;
                        int i281 = ((i279 & i280) | (i279 ^ i280)) >> 31;
                        int i282 = (i281 & i118) | ((~i281) & i278);
                        String[] strArr3 = (String[]) objArr[1];
                        Object[] objArr14 = new Object[2];
                        int i283 = (i278 & i112) | ((~i278) & i);
                        int i284 = -i283;
                        int i285 = (((i283 & i284) | (i283 ^ i284)) >> 31) & 1;
                        int i286 = -i285;
                        int i287 = (~(((i286 & i285) | (i285 ^ i286)) >> 31)) & 1;
                        objArr14[i285] = null;
                        objArr14[i287] = strArr3;
                        String[] strArr4 = (String[]) objArr14[0];
                        int i288 = notify + 27;
                        cancelAll = i288 % 128;
                        int i289 = i288 % 2;
                        int i290 = i ^ i282;
                        int i291 = -i290;
                        Object[] objArr15 = {new int[]{i}, new int[1], new int[]{i282}, strArr4};
                        int startElapsedRealtime = (int) Process.getStartElapsedRealtime();
                        int i292 = ~startElapsedRealtime;
                        int i293 = (i2 - (~(((((400299292 + (((~(492557524 | i292)) | (~((-532867754) | startElapsedRealtime))) * 1900)) + (((~(i292 | 532867753)) | (~(startElapsedRealtime | (-492557525)))) * (-950))) + (((~(startElapsedRealtime | 532867753)) | (~(i292 | (-492557525)))) * 950)) - (~(-(-((((i290 & i291) | (i290 ^ i291)) >> 31) & 16))))) - 1))) - 1;
                        int i294 = i293 << 13;
                        int i295 = (i293 | i294) & (~(i293 & i294));
                        int i296 = i295 >>> 17;
                        int i297 = (i295 | i296) & (~(i295 & i296));
                        int i298 = i297 << 5;
                        ((int[]) objArr15[1])[0] = ((~i297) & i298) | ((~i298) & i297);
                        return objArr15;
                    } catch (Throwable th3) {
                        fileReader2.close();
                        bufferedReader2.close();
                        throw th3;
                    }
                }
                int i299 = cancelAll + 25;
                notify = i299 % 128;
                int i300 = i299 % 2;
            } catch (Exception unused3) {
            }
            int i301 = notify;
            int i302 = (i301 & 83) + (i301 | 83);
            cancelAll = i302 % 128;
            int i303 = i302 % 2;
            int i304 = (i301 & 61) + (i301 | 61);
            cancelAll = i304 % 128;
            int i305 = i304 % 2;
            c = 0;
            objArr = new Object[]{new int[]{i}, new String[0]};
            int i2710 = ((int[]) objArr[c])[c];
            int i2711 = ((~i118) & i) | (i118 & i112);
            int i2810 = -i2711;
            int i2811 = ((i2711 & i2810) | (i2711 ^ i2810)) >> 31;
            int i2812 = (i2811 & i118) | ((~i2811) & i2710);
            String[] strArr5 = (String[]) objArr[1];
            Object[] objArr16 = new Object[2];
            int i2813 = (i2710 & i112) | ((~i2710) & i);
            int i2814 = -i2813;
            int i2815 = (((i2813 & i2814) | (i2813 ^ i2814)) >> 31) & 1;
            int i2816 = -i2815;
            int i2817 = (~(((i2816 & i2815) | (i2815 ^ i2816)) >> 31)) & 1;
            objArr16[i2815] = null;
            objArr16[i2817] = strArr5;
            String[] strArr6 = (String[]) objArr16[0];
            int i2818 = notify + 27;
            cancelAll = i2818 % 128;
            int i2819 = i2818 % 2;
            int i2910 = i ^ i2812;
            int i2911 = -i2910;
            Object[] objArr17 = {new int[]{i}, new int[1], new int[]{i2812}, strArr6};
            int startElapsedRealtime2 = (int) Process.getStartElapsedRealtime();
            int i2912 = ~startElapsedRealtime2;
            int i2913 = (i2 - (~(((((400299292 + (((~(492557524 | i2912)) | (~((-532867754) | startElapsedRealtime2))) * 1900)) + (((~(i2912 | 532867753)) | (~(startElapsedRealtime2 | (-492557525)))) * (-950))) + (((~(startElapsedRealtime2 | 532867753)) | (~(i2912 | (-492557525)))) * 950)) - (~(-(-((((i2910 & i2911) | (i2910 ^ i2911)) >> 31) & 16))))) - 1))) - 1;
            int i2914 = i2913 << 13;
            int i2915 = (i2913 | i2914) & (~(i2913 & i2914));
            int i2916 = i2915 >>> 17;
            int i2917 = (i2915 | i2916) & (~(i2915 & i2916));
            int i2918 = i2917 << 5;
            ((int[]) objArr17[1])[0] = ((~i2917) & i2918) | ((~i2918) & i2917);
            return objArr17;
        } catch (Throwable th4) {
            Throwable cause = th4.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th4;
        }
    }

    static void TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = -6377398940819159759L;
        b = -981105359;
        TuitionPaymentFragmentbindingInflater1 = (char) 19497;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = -1673047987;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = -1934795578;
        asInterface = -732834828;
        asBinder = new byte[]{30, -30, 19, -18, -19, 26, -11, 8, 25, 20, -27, -23, 19, -31, 25, 23, -9, 24, 17, -26, 25, -54, 55, -21, 24, -26, 20, -11, 27, -57, 55, -20, -21, 24, -26, 20, -11, 27, -57, 52, -27, -49, 57, 31, -29, 19, -19, -18, 12, -25, -25, 25, -10, 30, 31, -29, -32, -28, 9, 24, -93, 46, 31, -29, -32, -28, 9, 24, -93, 46, 20, -11, 27, -25, -45, 37, -31, 17, 26, -21, 28, -38, 90, 28, -32, -94, -26, -26, -26, -26, -26};
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
    private static java.lang.String $$e(byte r5, byte r6, int r7) {
        /*
            int r6 = r6 * 4
            int r0 = 1 - r6
            int r5 = r5 * 4
            int r5 = 4 - r5
            byte[] r1 = com.bpjstku.data.promo.model.request.FlagDeeplinkRequest.$$c
            int r7 = r7 + 102
            byte[] r0 = new byte[r0]
            r2 = 0
            int r6 = 0 - r6
            if (r1 != 0) goto L17
            r4 = r5
            r7 = r6
            r3 = r2
            goto L27
        L17:
            r3 = r2
        L18:
            byte r4 = (byte) r7
            r0[r3] = r4
            if (r3 != r6) goto L23
            java.lang.String r5 = new java.lang.String
            r5.<init>(r0, r2)
            return r5
        L23:
            int r3 = r3 + 1
            r4 = r1[r5]
        L27:
            int r5 = r5 + 1
            int r7 = r7 + r4
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.data.promo.model.request.FlagDeeplinkRequest.$$e(byte, byte, int):java.lang.String");
    }
}
