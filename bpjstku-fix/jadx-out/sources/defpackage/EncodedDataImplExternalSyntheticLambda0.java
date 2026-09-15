package defpackage;

import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.exifinterface.media.ExifInterface;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0087@\u0018\u0000 \u0006*\u0006\b\u0000\u0010\u0001 \u00012\u00020\u0002:\u0003\u0014\u0004\u0006B\u0013\b\u0001\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0006\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b\u0006\u0010\u0005J\u000f\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\u000b\u001a\u00020\n2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÖ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0000X\u0080\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0010R\u0011\u0010\b\u001a\u00020\n8G¢\u0006\u0006\u001a\u0004\b\u0011\u0010\fR\u0011\u0010\u0013\u001a\u00020\n8G¢\u0006\u0006\u001a\u0004\b\u0012\u0010\fR\u0011\u0010\u0014\u001a\u00020\n8G¢\u0006\u0006\u001a\u0004\b\u0014\u0010\f\u0088\u0001\u0015\u0092\u0001\u0004\u0018\u00010\u0002"}, d2 = {"LEncodedDataImplExternalSyntheticLambda0;", ExifInterface.GPS_DIRECTION_TRUE, "", "p0", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "(Ljava/lang/Object;)Ljava/lang/Object;", "b", "", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "(Ljava/lang/Object;)Ljava/lang/Throwable;", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Ljava/lang/Object;", "asInterface", "asBinder", "TuitionPaymentFragmentbindingInflater1", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "holder"}, k = 1, mv = {2, 0, 0}, xi = 48)
@JvmInline
public final class EncodedDataImplExternalSyntheticLambda0<T> {

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
    public final Object TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final TuitionPaymentFragmentspecialinlinedviewModeldefault1 TuitionPaymentFragmentspecialinlinedviewModeldefault3 = new TuitionPaymentFragmentspecialinlinedviewModeldefault1();

    public static <T> Object TuitionPaymentFragmentspecialinlinedviewModeldefault3(Object obj) {
        return obj;
    }

    public static class TuitionPaymentFragmentspecialinlinedviewModeldefault1 {
        private static final byte[] $$c = {92, 126, -38, -95};
        private static final int $$d = 18;
        private static int $10 = 0;
        private static int $11 = 1;
        private static final byte[] $$a = {109, 84, -87, -114, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -55};
        private static final int $$b = 199;
        private static int TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
        private static int TuitionPaymentFragmentbindingInflater1 = 1;
        private static long TuitionPaymentFragmentspecialinlinedviewModeldefault1 = -6377398940819159759L;
        private static int b = -981105359;
        private static char TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 48710;

        /* JADX WARN: Code duplicated, block: B:10:0x0029  */
        /* JADX WARN: Code duplicated, block: B:8:0x0021  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0029 -> B:11:0x0032). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0029
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        private static void c(byte r6, int r7, short r8, java.lang.Object[] r9) {
            /*
                int r8 = r8 * 2
                int r8 = 84 - r8
                byte[] r0 = EncodedDataImplExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1.$$a
                int r6 = r6 * 2
                int r6 = 3 - r6
                int r7 = r7 * 2
                int r1 = 53 - r7
                byte[] r1 = new byte[r1]
                int r7 = 52 - r7
                r2 = 0
                if (r0 != 0) goto L19
                r8 = r6
                r3 = r7
                r4 = r2
                goto L32
            L19:
                r3 = r2
            L1a:
                int r6 = r6 + 1
                byte r4 = (byte) r8
                r1[r3] = r4
                if (r3 != r7) goto L29
                java.lang.String r6 = new java.lang.String
                r6.<init>(r1, r2)
                r9[r2] = r6
                return
            L29:
                r4 = r0[r6]
                int r3 = r3 + 1
                r5 = r8
                r8 = r6
                r6 = r4
                r4 = r3
                r3 = r5
            L32:
                int r3 = r3 + r6
                int r6 = r3 + (-11)
                r3 = r4
                r5 = r8
                r8 = r6
                r6 = r5
                goto L1a
            */
            throw new UnsupportedOperationException("Method not decompiled: EncodedDataImplExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1.c(byte, int, short, java.lang.Object[]):void");
        }

        private static void a(char[] cArr, char[] cArr2, char c, int i, char[] cArr3, Object[] objArr) throws Throwable {
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
                int i4 = $11 + 1;
                $10 = i4 % 128;
                int i5 = i4 % i2;
                try {
                    Object[] objArr2 = {sessionProcessor};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1033601528);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        byte b2 = (byte) 0;
                        byte b3 = b2;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (8327 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))), (ViewConfiguration.getTouchSlop() >> 8) + 1235, 36 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), -653973969, false, $$e(b2, b3, (byte) (b3 + 2)), new Class[]{Object.class});
                    }
                    int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).intValue();
                    try {
                        Object[] objArr3 = {sessionProcessor};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1120586870);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                            byte b4 = (byte) 0;
                            byte b5 = b4;
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) Drawable.resolveOpacity(0, 0), 2764 - TextUtils.getOffsetBefore("", 0), TextUtils.indexOf((CharSequence) "", '0', 0) + 15, 1504416861, false, $$e(b4, b5, b5), new Class[]{Object.class});
                        }
                        int iIntValue2 = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).intValue();
                        try {
                            Object[] objArr4 = {sessionProcessor, Integer.valueOf(cArr4[sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2 % 4] * 32718), Integer.valueOf(cArr5[iIntValue])};
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(811618268);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (Color.argb(0, 0, 0, 0) + 43325), View.MeasureSpec.makeMeasureSpec(0, 0) + 253, ExpandableListView.getPackedPositionType(0L) + 22, -721491957, false, "j", new Class[]{Object.class, Integer.TYPE, Integer.TYPE});
                            }
                            ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
                            try {
                                Object[] objArr5 = {Integer.valueOf(cArr4[iIntValue2] * 32718), Integer.valueOf(cArr5[iIntValue])};
                                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1821841887);
                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                                    byte b6 = (byte) 0;
                                    byte b7 = b6;
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (65200 - (Process.myPid() >> 22)), (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 2890, 'A' - AndroidCharacter.getMirror('0'), 2012627446, false, $$e(b6, b7, (byte) (b7 + 1)), new Class[]{Integer.TYPE, Integer.TYPE});
                                }
                                cArr5[iIntValue2] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).charValue();
                                cArr4[iIntValue2] = sessionProcessor.b;
                                cArr6[sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2] = (char) (((((long) (cArr4[iIntValue2] ^ cArr3[sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2])) ^ (TuitionPaymentFragmentspecialinlinedviewModeldefault1 ^ (-6377398940819159759L))) ^ ((long) ((int) (((long) b) ^ (-6377398940819159759L))))) ^ ((long) ((char) (((long) TuitionPaymentFragmentspecialinlinedviewModeldefault2) ^ (-6377398940819159759L)))));
                                sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2++;
                                i2 = 2;
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
                } catch (Throwable th4) {
                    Throwable cause4 = th4.getCause();
                    if (cause4 == null) {
                        throw th4;
                    }
                    throw cause4;
                }
            }
            objArr[0] = new String(cArr6);
            int i6 = $11 + 65;
            $10 = i6 % 128;
            int i7 = i6 % 2;
        }

        public String toString() throws Throwable {
            int i = 2 % 2;
            int i2 = TuitionPaymentFragmentbindingInflater1 + 91;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
            int i3 = i2 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1552861273);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (46400 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1))), (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 40, View.getDefaultSize(0, 0) + 19, -1206882418, false, "TuitionPaymentFragmentspecialinlinedviewModeldefault3", null);
            }
            int i4 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getInt(null);
            long j = 0;
            Object[] objArr = new Object[1];
            a(new char[]{0, 0, 0, 0}, new char[]{58883, 38958, 14283, 53614}, (char) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) - 1), (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), new char[]{15657, 49298, 4633, 44495, 50001, 10425, 28283, 43382, 50528, 49987, 32452, 52505, 64542, 45606, 26107, 40464, 52699, 15727, 26472, 50175, 44243, 8703}, objArr);
            Class<?> cls = Class.forName((String) objArr[0]);
            Object[] objArr2 = new Object[1];
            a(new char[]{0, 0, 0, 0}, new char[]{56001, 54225, 3479, 12021}, (char) (62733 - (ViewConfiguration.getKeyRepeatDelay() >> 16)), (ViewConfiguration.getKeyRepeatTimeout() >> 16) - 1747725862, new char[]{43213, 39236, 52272, 26883, 6735, 17627, 20009, 45177, 51305, 24263, 30333, 40205, 11912, 47452, 11282}, objArr2);
            long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr2[0], new Class[0]).invoke(null, new Object[0])).longValue() & (-1024);
            int i5 = i4;
            long j2 = -1;
            long j3 = j2 ^ (-850268654946590286L);
            long jMaxMemory = (int) Runtime.getRuntime().maxMemory();
            long j4 = ((j3 | 2947525829688549273L) | jMaxMemory) ^ j2;
            long j5 = (((long) 477) * 2947525829688549273L) + (((long) (-475)) * (-850268654946590286L)) + (((long) (-476)) * ((((j2 ^ 2947525829688549273L) | (-850268654946590286L)) ^ j2) | j4)) + (((long) 952) * j4) + (((long) 476) * (j2 ^ ((j3 | (jMaxMemory ^ j2)) | 2947525829688549273L)));
            int i6 = 0;
            long j6 = jLongValue;
            while (i6 != 10) {
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-638037654);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) ((ViewConfiguration.getTapTimeout() >> 16) + 37836), 60 - (ViewConfiguration.getGlobalActionKeyTimeout() > j ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == j ? 0 : -1)), 18 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), 1030158013, false, "TuitionPaymentFragmentspecialinlinedviewModeldefault3", null);
                }
                int i7 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getInt(null);
                int i8 = 0;
                long j7 = j6;
                while (true) {
                    int i9 = 0;
                    while (i9 != 8) {
                        int i10 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 113;
                        TuitionPaymentFragmentbindingInflater1 = i10 % 128;
                        if (i10 % 2 == 0) {
                            i7 *= ((((int) (j7 << i9)) & 21999) << (i7 << 75)) >> (i7 - 44);
                            i9 += 89;
                        } else {
                            i7 = (((((int) (j7 >> i9)) & 255) + (i7 << 6)) + (i7 << 16)) - i7;
                            i9++;
                        }
                    }
                    if (i8 != 0) {
                        break;
                    }
                    i8++;
                    j7 = j5;
                }
                int i11 = i5;
                if (i7 == i11) {
                    return "Failed";
                }
                int i12 = TuitionPaymentFragmentbindingInflater1 + 101;
                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i12 % 128;
                int i13 = i12 % 2;
                j6 -= 1024;
                i6++;
                i5 = i11;
                j = 0;
            }
            Object[] objArr3 = new Object[1];
            a(new char[]{0, 0, 0, 0}, new char[]{3486, 53893, 35696, 40623}, (char) (44939 - Color.red(0)), (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), new char[]{5068, 8526, 25001, 16319, 5837, 47049, 40289, 26114, 64652, 24007, 65190, 33092, 28126, 2525, 5850, 44153}, objArr3);
            Class<?> cls2 = Class.forName((String) objArr3[0]);
            Object[] objArr4 = new Object[1];
            a(new char[]{0, 0, 0, 0}, new char[]{55959, 10009, 9925, 16943}, (char) (TextUtils.indexOf("", "", 0) + 12070), ViewConfiguration.getScrollDefaultDelay() >> 16, new char[]{50440, 10942, 16536, 51467, 4967, 41100, 298, 21825, 24382, 28199, 16970, 32219, 1340, 34392, 16519, 1765}, objArr4);
            int iIntValue = ((Integer) cls2.getMethod((String) objArr4[0], Object.class).invoke(null, this)).intValue();
            try {
                Object[] objArr5 = {-411066694};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-725886332);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (46038 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1))), (KeyEvent.getMaxKeyCode() >> 16) + 1134, (ViewConfiguration.getJumpTapTimeout() >> 16) + 18, 807763283, false, null, new Class[]{Integer.TYPE});
                }
                Object[] objArr6 = {Integer.valueOf(iIntValue), 0, 885199132, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).newInstance(objArr5), false};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1443305588);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    char offsetAfter = (char) TextUtils.getOffsetAfter("", 0);
                    int i14 = 1032 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1));
                    int size = View.MeasureSpec.getSize(0) + 15;
                    byte b2 = $$a[7];
                    byte b3 = b2;
                    Object[] objArr7 = new Object[1];
                    c(b2, b3, b3, objArr7);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(offsetAfter, i14, size, 1298546779, false, (String) objArr7[0], new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (45993 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1))), Color.argb(0, 0, 0, 0) + 1117, 17 - View.MeasureSpec.makeMeasureSpec(0, 0)), Boolean.TYPE});
                }
                Object[] objArr8 = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr6);
                if (((int[]) objArr8[3])[0] == ((int[]) objArr8[1])[0]) {
                    return "Failed";
                }
                ArrayList arrayList = new ArrayList();
                String[] strArr = (String[]) objArr8[0];
                if (strArr != null) {
                    int i15 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 15;
                    TuitionPaymentFragmentbindingInflater1 = i15 % 128;
                    for (int i16 = i15 % 2 == 0 ? 1 : 0; i16 < strArr.length; i16++) {
                        arrayList.add(strArr[i16]);
                    }
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

        /* JADX WARN: Code duplicated, block: B:10:0x0023  */
        /* JADX WARN: Code duplicated, block: B:8:0x001d  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x0029). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0023
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        private static java.lang.String $$e(int r7, short r8, byte r9) {
            /*
                int r8 = r8 * 4
                int r8 = 4 - r8
                int r9 = 104 - r9
                int r7 = r7 * 2
                int r7 = 1 - r7
                byte[] r0 = EncodedDataImplExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1.$$c
                byte[] r1 = new byte[r7]
                r2 = 0
                if (r0 != 0) goto L15
                r3 = r7
                r9 = r8
                r4 = r2
                goto L29
            L15:
                r3 = r2
            L16:
                int r4 = r3 + 1
                byte r5 = (byte) r9
                r1[r3] = r5
                if (r4 != r7) goto L23
                java.lang.String r7 = new java.lang.String
                r7.<init>(r1, r2)
                return r7
            L23:
                r3 = r0[r8]
                r6 = r9
                r9 = r8
                r8 = r3
                r3 = r6
            L29:
                int r8 = -r8
                int r8 = r8 + r3
                int r9 = r9 + 1
                r3 = r4
                r6 = r9
                r9 = r8
                r8 = r6
                goto L16
            */
            throw new UnsupportedOperationException("Method not decompiled: EncodedDataImplExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1.$$e(int, short, byte):java.lang.String");
        }
    }

    private /* synthetic */ EncodedDataImplExternalSyntheticLambda0(Object obj) {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = obj;
    }

    public static final boolean asInterface(Object obj) {
        return !(obj instanceof TuitionPaymentFragmentspecialinlinedviewModeldefault1);
    }

    public static final boolean asBinder(Object obj) {
        return obj instanceof TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    }

    public static final boolean TuitionPaymentFragmentspecialinlinedviewModeldefault1(Object obj) {
        return obj instanceof TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final T b(Object obj) {
        if (obj instanceof TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
            return null;
        }
        return obj;
    }

    public static final Throwable TuitionPaymentFragmentspecialinlinedviewModeldefault2(Object obj) {
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 tuitionPaymentFragmentspecialinlinedviewModeldefault3 = obj instanceof TuitionPaymentFragmentspecialinlinedviewModeldefault3 ? (TuitionPaymentFragmentspecialinlinedviewModeldefault3) obj : null;
        if (tuitionPaymentFragmentspecialinlinedviewModeldefault3 != null) {
            return tuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        }
        return null;
    }

    public static final class TuitionPaymentFragmentspecialinlinedviewModeldefault3 extends TuitionPaymentFragmentspecialinlinedviewModeldefault1 {
        public final Throwable TuitionPaymentFragmentspecialinlinedviewModeldefault2;

        public TuitionPaymentFragmentspecialinlinedviewModeldefault3(Throwable th) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = th;
        }

        public final boolean equals(Object obj) {
            return (obj instanceof TuitionPaymentFragmentspecialinlinedviewModeldefault3) && Intrinsics.areEqual(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, ((TuitionPaymentFragmentspecialinlinedviewModeldefault3) obj).TuitionPaymentFragmentspecialinlinedviewModeldefault2);
        }

        public final int hashCode() {
            Throwable th = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            if (th != null) {
                return th.hashCode();
            }
            return 0;
        }

        @Override // EncodedDataImplExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1
        public final String toString() {
            StringBuilder sb = new StringBuilder("Closed(");
            sb.append(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
            sb.append(')');
            return sb.toString();
        }
    }

    /* JADX INFO: renamed from: EncodedDataImplExternalSyntheticLambda0$b, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J#\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00010\u0006\"\u0004\b\u0001\u0010\u00042\u0006\u0010\u0005\u001a\u00028\u0001H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u001b\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00010\u0006\"\u0004\b\u0001\u0010\u0004H\u0007¢\u0006\u0004\b\t\u0010\nJ%\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00010\u0006\"\u0004\b\u0001\u0010\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u000bH\u0007¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0007\u001a\u00020\u000e8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u000f"}, d2 = {"LEncodedDataImplExternalSyntheticLambda0$b;", "", "<init>", "()V", ExifInterface.LONGITUDE_EAST, "p0", "LEncodedDataImplExternalSyntheticLambda0;", "b", "(Ljava/lang/Object;)Ljava/lang/Object;", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "()Ljava/lang/Object;", "", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "(Ljava/lang/Throwable;)Ljava/lang/Object;", "LEncodedDataImplExternalSyntheticLambda0$TuitionPaymentFragmentspecialinlinedviewModeldefault1;", "LEncodedDataImplExternalSyntheticLambda0$TuitionPaymentFragmentspecialinlinedviewModeldefault1;"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public static <E> Object b(E p0) {
            return EncodedDataImplExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3(p0);
        }

        public static <E> Object TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
            return EncodedDataImplExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3(EncodedDataImplExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
        }

        public static <E> Object TuitionPaymentFragmentspecialinlinedviewModeldefault1(Throwable p0) {
            return EncodedDataImplExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3(new TuitionPaymentFragmentspecialinlinedviewModeldefault3(p0));
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final String toString() {
        Object obj = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        if (obj instanceof TuitionPaymentFragmentspecialinlinedviewModeldefault3) {
            return ((TuitionPaymentFragmentspecialinlinedviewModeldefault3) obj).toString();
        }
        StringBuilder sb = new StringBuilder("Value(");
        sb.append(obj);
        sb.append(')');
        return sb.toString();
    }

    public final boolean equals(Object p0) {
        return (p0 instanceof EncodedDataImplExternalSyntheticLambda0) && Intrinsics.areEqual(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, ((EncodedDataImplExternalSyntheticLambda0) p0).TuitionPaymentFragmentspecialinlinedviewModeldefault3);
    }

    public final int hashCode() {
        Object obj = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public static final /* synthetic */ EncodedDataImplExternalSyntheticLambda0 TuitionPaymentFragmentbindingInflater1(Object obj) {
        return new EncodedDataImplExternalSyntheticLambda0(obj);
    }
}
