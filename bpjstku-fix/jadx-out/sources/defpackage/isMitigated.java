package defpackage;

import android.content.Context;
import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.exifinterface.media.ExifInterface;
import androidx.work.WorkInfo;
import com.bpjstku.data.version.VersionDataStore;
import com.bpjstku.data.version.VersionRepository;
import com.bpjstku.data.version.remote.VersionApi;
import com.bpjstku.data.version.remote.VersionApiClient;
import com.datadog.android.core.internal.persistence.file.FileExtKt$readLinesSafe$1;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import kotlin.TypeCastException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okhttp3.OkHttpClient;
import org.koin.core.definition.Kind;

/* JADX INFO: loaded from: classes3.dex */
public final class isMitigated {
    private static final isLenovoTablet TuitionPaymentFragmentspecialinlinedviewModeldefault1;

    static {
        Function1 function1 = new Function1() { // from class: getVector
            private static final byte[] $$a = {5, -91, 77, 46};
            private static final int $$b = 128;
            private static int $10 = 0;
            private static int $11 = 1;
            private static int g = 0;
            private static int asInterface = 1;
            private static long TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 8812220100955896334L;
            private static char TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 63815;
            private static char TuitionPaymentFragmentbindingInflater1 = 64667;
            private static char TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 45058;
            private static char b = 30617;

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int i = 2 % 2;
                int i2 = g + 45;
                asInterface = i2 % 128;
                int i3 = i2 % 2;
                Unit unitTuitionPaymentFragmentspecialinlinedviewModeldefault2 = isMitigated.TuitionPaymentFragmentspecialinlinedviewModeldefault2((isLenovoTablet) obj);
                int i4 = g + 11;
                asInterface = i4 % 128;
                if (i4 % 2 != 0) {
                    return unitTuitionPaymentFragmentspecialinlinedviewModeldefault2;
                }
                throw null;
            }

            private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
                int i2 = 2 % 2;
                getRealtimeCaptureLatency getrealtimecapturelatency = new getRealtimeCaptureLatency();
                getrealtimecapturelatency.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i;
                int length = cArr.length;
                long[] jArr = new long[length];
                getrealtimecapturelatency.b = 0;
                int i3 = $10 + 65;
                $11 = i3 % 128;
                int i4 = i3 % 2;
                while (getrealtimecapturelatency.b < cArr.length) {
                    int i5 = getrealtimecapturelatency.b;
                    try {
                        Object[] objArr2 = {Integer.valueOf(cArr[getrealtimecapturelatency.b]), getrealtimecapturelatency, getrealtimecapturelatency};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1177060190);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (19472 - View.MeasureSpec.makeMeasureSpec(0, 0)), 2624 - View.MeasureSpec.getMode(0), (ViewConfiguration.getScrollBarSize() >> 8) + 13, -1565121399, false, "F", new Class[]{Integer.TYPE, Object.class, Object.class});
                        }
                        jArr[i5] = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).longValue() ^ (TuitionPaymentFragmentspecialinlinedviewModeldefault3 ^ 9053247990562531611L);
                        Object[] objArr3 = {getrealtimecapturelatency, getrealtimecapturelatency};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1900663072);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (Color.blue(0) + 39422), 481 - TextUtils.getCapsMode("", 0, 0), 38 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), 1781041463, false, "I", new Class[]{Object.class, Object.class});
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
                char[] cArr2 = new char[length];
                getrealtimecapturelatency.b = 0;
                while (getrealtimecapturelatency.b < cArr.length) {
                    int i6 = $11 + 83;
                    $10 = i6 % 128;
                    if (i6 % 2 != 0) {
                        cArr2[getrealtimecapturelatency.b] = (char) jArr[getrealtimecapturelatency.b];
                        Object[] objArr4 = {getrealtimecapturelatency, getrealtimecapturelatency};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1900663072);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (39422 - Drawable.resolveOpacity(0, 0)), 481 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), 37 - (ViewConfiguration.getTouchSlop() >> 8), 1781041463, false, "I", new Class[]{Object.class, Object.class});
                        }
                        ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
                        int i7 = 87 / 0;
                    } else {
                        cArr2[getrealtimecapturelatency.b] = (char) jArr[getrealtimecapturelatency.b];
                        Object[] objArr5 = {getrealtimecapturelatency, getrealtimecapturelatency};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1900663072);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (TextUtils.indexOf("", "", 0) + 39422), 481 - Color.green(0), 37 - (ViewConfiguration.getPressedStateDuration() >> 16), 1781041463, false, "I", new Class[]{Object.class, Object.class});
                        }
                        ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5);
                    }
                }
                objArr[0] = new String(cArr2);
            }

            private static void c(char[] cArr, int i, Object[] objArr) throws Throwable {
                int i2;
                CharSequence charSequence;
                int i3 = 2;
                int i4 = 2 % 2;
                onCaptureSessionEnd oncapturesessionend = new onCaptureSessionEnd();
                char[] cArr2 = new char[cArr.length - 2];
                oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 2;
                char[] cArr3 = new char[2];
                while (true) {
                    int i5 = 0;
                    if (oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 >= cArr.length) {
                        objArr[0] = new String(cArr2, 0, i);
                        int i6 = $10 + 93;
                        $11 = i6 % 128;
                        int i7 = i6 % 2;
                        return;
                    }
                    int i8 = $10 + 31;
                    $11 = i8 % 128;
                    int i9 = 58224;
                    if (i8 % i3 == 0) {
                        cArr3[1] = cArr[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3];
                        cArr3[0] = cArr[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 % 0];
                        i2 = 1;
                    } else {
                        cArr3[0] = cArr[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3];
                        cArr3[1] = cArr[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1];
                        i2 = 0;
                    }
                    while (i2 < 16) {
                        char c = cArr3[1];
                        char c2 = cArr3[i5];
                        int i10 = (c2 + i9) ^ ((c2 << 4) + ((char) (((long) TuitionPaymentFragmentspecialinlinedviewModeldefault1) ^ 8611973335120459638L)));
                        int i11 = c2 >>> 5;
                        try {
                            Object[] objArr2 = new Object[4];
                            objArr2[3] = Integer.valueOf(b);
                            objArr2[i3] = Integer.valueOf(i11);
                            objArr2[1] = Integer.valueOf(i10);
                            objArr2[i5] = Integer.valueOf(c);
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1824600641);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                                charSequence = "";
                                char cLastIndexOf = (char) (TextUtils.lastIndexOf(charSequence, '0', i5) + 47774);
                                int defaultSize = 468 - View.getDefaultSize(i5, i5);
                                int iAlpha = Color.alpha(i5) + 13;
                                Class[] clsArr = new Class[4];
                                clsArr[i5] = Integer.TYPE;
                                clsArr[1] = Integer.TYPE;
                                clsArr[i3] = Integer.TYPE;
                                clsArr[3] = Integer.TYPE;
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cLastIndexOf, defaultSize, iAlpha, -2007001706, false, "o", clsArr);
                            } else {
                                charSequence = "";
                            }
                            char cCharValue = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                            cArr3[1] = cCharValue;
                            onCaptureSessionEnd oncapturesessionend2 = oncapturesessionend;
                            Object[] objArr3 = {Integer.valueOf(cArr3[i5]), Integer.valueOf((cCharValue + i9) ^ ((cCharValue << 4) + ((char) (((long) TuitionPaymentFragmentspecialinlinedviewModeldefault2) ^ 8611973335120459638L)))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(TuitionPaymentFragmentbindingInflater1)};
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1824600641);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (TextUtils.indexOf(charSequence, charSequence) + 47773), 468 - View.getDefaultSize(0, 0), (Process.myTid() >> 22) + 13, -2007001706, false, "o", new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                            }
                            cArr3[0] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).charValue();
                            i9 -= 40503;
                            i2++;
                            oncapturesessionend = oncapturesessionend2;
                            i3 = 2;
                            i5 = 0;
                        } catch (Throwable th) {
                            Throwable cause = th.getCause();
                            if (cause == null) {
                                throw th;
                            }
                            throw cause;
                        }
                    }
                    onCaptureSessionEnd oncapturesessionend3 = oncapturesessionend;
                    cArr2[oncapturesessionend3.TuitionPaymentFragmentspecialinlinedviewModeldefault3 - 2] = (char) (cArr[oncapturesessionend3.TuitionPaymentFragmentspecialinlinedviewModeldefault3 - 2] ^ cArr3[0]);
                    cArr2[oncapturesessionend3.TuitionPaymentFragmentspecialinlinedviewModeldefault3 - 1] = (char) (cArr3[1] ^ cArr[oncapturesessionend3.TuitionPaymentFragmentspecialinlinedviewModeldefault3 - 1]);
                    Object[] objArr4 = {oncapturesessionend3, oncapturesessionend3};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1431906448);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                        byte b2 = (byte) 0;
                        byte b3 = b2;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) TextUtils.indexOf("", ""), 2323 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), View.MeasureSpec.getMode(0) + 44, -1312321721, false, $$c(b2, b3, b3), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
                    int i12 = $11 + 85;
                    $10 = i12 % 128;
                    int i13 = i12 % 2;
                    oncapturesessionend = oncapturesessionend3;
                    i3 = 2;
                }
            }

            /* JADX WARN: Code duplicated, block: B:138:0x0989 A[Catch: all -> 0x09c5, TryCatch #4 {all -> 0x09c5, blocks: (B:112:0x0945, B:115:0x094e, B:117:0x0956, B:118:0x0957, B:126:0x096d, B:128:0x0973, B:129:0x0974, B:131:0x0976, B:133:0x097e, B:134:0x097f, B:136:0x0983, B:138:0x0989, B:139:0x098a, B:141:0x098c, B:143:0x0993, B:144:0x0994, B:146:0x0996, B:148:0x099d, B:149:0x099e, B:152:0x09a2, B:154:0x09a8, B:155:0x09a9, B:157:0x09ab, B:159:0x09b2, B:160:0x09b3, B:162:0x09b5, B:164:0x09bc, B:165:0x09bd, B:166:0x09be, B:167:0x09c3, B:21:0x012e, B:33:0x01af, B:35:0x01e5, B:34:0x01c5, B:52:0x0309, B:97:0x0733, B:16:0x00cc, B:18:0x00f1, B:84:0x0616, B:88:0x065a, B:90:0x066a, B:89:0x065c, B:50:0x02b3, B:38:0x01fe, B:47:0x026f, B:49:0x028d, B:40:0x020e), top: B:184:0x0065, inners: #7, #8, #9, #11, #12, #13, #14 }] */
            /* JADX WARN: Code duplicated, block: B:139:0x098a A[Catch: all -> 0x09c5, TryCatch #4 {all -> 0x09c5, blocks: (B:112:0x0945, B:115:0x094e, B:117:0x0956, B:118:0x0957, B:126:0x096d, B:128:0x0973, B:129:0x0974, B:131:0x0976, B:133:0x097e, B:134:0x097f, B:136:0x0983, B:138:0x0989, B:139:0x098a, B:141:0x098c, B:143:0x0993, B:144:0x0994, B:146:0x0996, B:148:0x099d, B:149:0x099e, B:152:0x09a2, B:154:0x09a8, B:155:0x09a9, B:157:0x09ab, B:159:0x09b2, B:160:0x09b3, B:162:0x09b5, B:164:0x09bc, B:165:0x09bd, B:166:0x09be, B:167:0x09c3, B:21:0x012e, B:33:0x01af, B:35:0x01e5, B:34:0x01c5, B:52:0x0309, B:97:0x0733, B:16:0x00cc, B:18:0x00f1, B:84:0x0616, B:88:0x065a, B:90:0x066a, B:89:0x065c, B:50:0x02b3, B:38:0x01fe, B:47:0x026f, B:49:0x028d, B:40:0x020e), top: B:184:0x0065, inners: #7, #8, #9, #11, #12, #13, #14 }] */
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r5v1 */
            /* JADX WARN: Type inference failed for: r5v2, types: [int] */
            /* JADX WARN: Type inference failed for: r5v24, types: [java.lang.Object, java.lang.String] */
            /* JADX WARN: Type inference failed for: r5v27, types: [java.lang.Object] */
            /* JADX WARN: Type inference failed for: r5v33 */
            /* JADX WARN: Type inference failed for: r5v6, types: [int] */
            /* JADX WARN: Type inference failed for: r5v7 */
            public static Object[] TuitionPaymentFragmentbindingInflater1(Context context, int i, int i2) {
                ?? NewInstance;
                int i3;
                int i4;
                int i5;
                Class<?>[] clsArr;
                Class<?> cls;
                char c;
                char[] cArr;
                int i6;
                int i7;
                int i8;
                int i9;
                Object[] objArr;
                char[] cArr2;
                int maxKeyCode;
                Throwable th;
                Throwable cause;
                int i10;
                int i11;
                int i12 = i2;
                int i13 = 2 % 2;
                if (context != null) {
                    try {
                        char[] cArr3 = {54102, 18734, 59330, 7179, 47791, 55096, 19929, 59977, 212, 48492, 56231, 28758, 60940, 1158, 41222, 57257, 29801, 37535, 3858, 42491, 49759, 30952, 38249, 13305, 43396, 50716, 31963, 39169, 14308, 44033, 51952};
                        int i14 = -Color.alpha(0);
                        int iB = attachPreviewSurface.b();
                        int i15 = asInterface;
                        int i16 = ((i15 | 87) << 1) - (i15 ^ 87);
                        g = i16 % 128;
                        int i17 = i16 % 2;
                        int i18 = i14 * 471;
                        int i19 = (i18 ^ 18623811) + ((i18 & 18623811) << 1);
                        int i20 = -(-(((i14 ^ 39541) | (i14 & 39541)) * (-470)));
                        int i21 = ((i19 | i20) << 1) - (i19 ^ i20);
                        int i22 = ~i14;
                        int i23 = ~((i22 ^ (-39542)) | (i22 & (-39542)));
                        int i24 = (i15 ^ 99) + ((i15 & 99) << 1);
                        g = i24 % 128;
                        NewInstance = i24 % 2;
                        try {
                            if (NewInstance != 0) {
                                Object obj = null;
                                obj.hashCode();
                                throw null;
                            }
                            int i25 = ~(((-39542) ^ iB) | ((-39542) & iB));
                            int i26 = (i23 ^ i25) | (i25 & i23);
                            int i27 = ~iB;
                            int i28 = (i27 ^ i14) | (i27 & i14);
                            int i29 = (i28 ^ 39541) | (i28 & 39541);
                            int i30 = (i15 & 3) + (i15 | 3);
                            g = i30 % 128;
                            if (i30 % 2 != 0) {
                                int i31 = ~i29;
                                i4 = i21 >>> ((-470) % ((i26 & i31) | (i26 ^ i31)));
                                i5 = (-39542) | i14;
                            } else {
                                i4 = i21 + (((i29 ^ (-1)) | i26) * (-470));
                                i5 = (-39542) | i14;
                            }
                            int i32 = i15 + 69;
                            g = i32 % 128;
                            int i33 = i32 % 2;
                            int i34 = ~(i5 | iB);
                            int i35 = ~iB;
                            int i36 = (i35 & i14) | (i35 ^ i14);
                            int i37 = ~((39541 & i36) | (i36 ^ 39541));
                            int i38 = -(-(470 * ((i34 & i37) | (i34 ^ i37))));
                            int i39 = (i4 & i38) + (i38 | i4);
                            Object[] objArr2 = new Object[1];
                            a(cArr3, i39, objArr2);
                            NewInstance = (String) objArr2[0];
                            try {
                                Object[] objArr3 = {NewInstance};
                                char[] cArr4 = {54143, 983, 29221, 41629, 37345, 49172, 12468, 26373, 22126, 34523, 62777, 9341, 5317, 19243, 48081, 60153, 55632, 2482, 30731, 44834, 40913, 52863, 15655, 28032, 23667, 36006, 58286, 53780, 753, 28978, 41085, 37057, 50971, 13941, 26330, 21804, 34200, 62710};
                                int jumpTapTimeout = ViewConfiguration.getJumpTapTimeout();
                                int i40 = asInterface;
                                int i41 = ((i40 | 109) << 1) - (i40 ^ 109);
                                g = i41 % 128;
                                int i42 = i41 % 2;
                                int i43 = 53410 - (~(-(jumpTapTimeout >> 16)));
                                Object[] objArr4 = new Object[1];
                                a(cArr4, i43, objArr4);
                                NewInstance = Class.forName((String) objArr4[0]).getDeclaredConstructor(String.class).newInstance(objArr3);
                                int i44 = -(SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1));
                                int i45 = (i44 & 37140) + (i44 | 37140);
                                Object[] objArr5 = new Object[1];
                                a(new char[]{54102, 16955, 61798, 24703, 38773, 1541, 46426, 9425, 23523, 51930, 31193, 59563, 8088, 36486, 15411, 21323, 49771, 29035, 57346, 5906, 34317, 13800, 42200, 56265, 19129, 63982, 26815, 40561, 3427, 48199, 54088}, i45, objArr5);
                                try {
                                    Object[] objArr6 = {(String) objArr5[0]};
                                    char[] cArr5 = {54143, 983, 29221, 41629, 37345, 49172, 12468, 26373, 22126, 34523, 62777, 9341, 5317, 19243, 48081, 60153, 55632, 2482, 30731, 44834, 40913, 52863, 15655, 28032, 23667, 36006, 58286, 53780, 753, 28978, 41085, 37057, 50971, 13941, 26330, 21804, 34200, 62710};
                                    int iIndexOf = TextUtils.indexOf((CharSequence) "", '0');
                                    int i46 = asInterface + 5;
                                    int i47 = i46 % 128;
                                    g = i47;
                                    int i48 = i46 % 2 != 0 ? (-575) >> iIndexOf : iIndexOf * (-575);
                                    int i49 = i47 + 47;
                                    asInterface = i49 % 128;
                                    int i50 = i49 % 2 == 0 ? i48 * (-575) : i48 - 30711900;
                                    int i51 = ~((~iIndexOf) | (-53413));
                                    int i52 = ~((-53413) | i);
                                    int i53 = -(-(((i51 ^ i52) | (i51 & i52)) * 576));
                                    int i54 = ((i50 | i53) << 1) - (i53 ^ i50);
                                    int i55 = ~iIndexOf;
                                    int i56 = ~(53412 | i55);
                                    int i57 = ~i;
                                    int i58 = ((-53413) ^ i57) | ((-53413) & i57);
                                    int i59 = i47 + 15;
                                    int i60 = i59 % 128;
                                    asInterface = i60;
                                    int i61 = i59 % 2;
                                    int i62 = ~((iIndexOf & i58) | (i58 ^ iIndexOf));
                                    int i63 = i54 + (((i62 & i56) | (i56 ^ i62)) * 576);
                                    int i64 = ((i60 | 33) << 1) - (i60 ^ 33);
                                    g = i64 % 128;
                                    if (i64 % 2 != 0) {
                                        Object[] objArr7 = new Object[1];
                                        a(cArr5, i63 * (576 % (~(((-53413) & i55) | (i55 ^ (-53413))))), objArr7);
                                        cls = Class.forName((String) objArr7[0]);
                                        clsArr = new Class[0];
                                        c = 1;
                                    } else {
                                        int i65 = -(-((~(((-53413) & i55) | (i55 ^ (-53413)))) * 576));
                                        Object[] objArr8 = new Object[1];
                                        a(cArr5, (i63 & i65) + (i63 | i65), objArr8);
                                        clsArr = new Class[1];
                                        cls = Class.forName((String) objArr8[0]);
                                        c = 0;
                                    }
                                    clsArr[c] = String.class;
                                    Object objNewInstance = cls.getDeclaredConstructor(clsArr).newInstance(objArr6);
                                    int i66 = asInterface + 11;
                                    g = i66 % 128;
                                    try {
                                        if (i66 % 2 != 0) {
                                            cArr = new char[]{54132, 53808, 53735, 53382, 54870, 54539, 54451, 55862, 55598, 55513, 57237, 56664, 56564, 50100, 49531, 49246, 51174, 50817, 50237, 52208, 51884, 51274, 53011};
                                            i6 = -TextUtils.indexOf("", "");
                                            i7 = 2064;
                                        } else {
                                            cArr = new char[]{54132, 53808, 53735, 53382, 54870, 54539, 54451, 55862, 55598, 55513, 57237, 56664, 56564, 50100, 49531, 49246, 51174, 50817, 50237, 52208, 51884, 51274, 53011};
                                            i6 = -TextUtils.indexOf("", "");
                                            i7 = 331;
                                        }
                                        int i67 = asInterface;
                                        int i68 = ((i67 | 21) << 1) - (i67 ^ 21);
                                        g = i68 % 128;
                                        if (i68 % 2 != 0) {
                                            int i69 = -(-i6);
                                            i8 = ((i69 | (-391)) << 1) - (i69 ^ (-391));
                                        } else {
                                            i8 = i6 * (-391);
                                        }
                                        int i70 = -(-((-195) * i7));
                                        int i71 = (i8 & i70) + (i70 | i8);
                                        int i72 = ~((~i7) | i6);
                                        int i73 = ~((i7 ^ i) | (i7 & i));
                                        int i74 = ((i72 & i73) | (i72 ^ i73)) * (-196);
                                        int i75 = (i71 ^ i74) + ((i74 & i71) << 1);
                                        int i76 = -(-((i6 | i7) * 392));
                                        int i77 = (i75 & i76) + (i76 | i75);
                                        int i78 = ~i6;
                                        int i79 = ~i7;
                                        int i80 = ~((i78 & i79) | (i78 ^ i79));
                                        Object[] objArr9 = new Object[1];
                                        a(cArr, (i77 - (~(((i80 & i73) | (i80 ^ i73)) * 196))) - 1, objArr9);
                                        Class<?> cls2 = Class.forName((String) objArr9[0]);
                                        int i81 = asInterface;
                                        int i82 = ((i81 | 97) << 1) - (i81 ^ 97);
                                        g = i82 % 128;
                                        int i83 = i82 % 2;
                                        int i84 = -(-Color.red(0));
                                        int i85 = ((i84 | 17) << 1) - (i84 ^ 17);
                                        Object[] objArr10 = new Object[1];
                                        c(new char[]{4262, 37943, 12224, 57984, 59532, 26193, 27103, 46498, 59293, 45313, 31466, 20872, 14452, 20056, 18931, 9198, 5485, 39199, 47377, 32358}, i85, objArr10);
                                        Object objInvoke = cls2.getMethod((String) objArr10[0], null).invoke(context, null);
                                        try {
                                            Object[] objArr11 = new Object[1];
                                            a(new char[]{54132, 53808, 53735, 53382, 54870, 54539, 54451, 55862, 55598, 55513, 57237, 56664, 56564, 50100, 49531, 49246, 51174, 50817, 50237, 52208, 51884, 51274, 53011}, 331 - (ViewConfiguration.getWindowTouchSlop() >> 8), objArr11);
                                            Class<?> cls3 = Class.forName((String) objArr11[0]);
                                            int i86 = -(SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1));
                                            int i87 = (i86 ^ 43314) + ((i86 & 43314) << 1);
                                            Object[] objArr12 = new Object[1];
                                            a(new char[]{54130, 31297, 33027, 10454, 30640, 40579, 9304, 29475, 39674, 8649, 18609, 38511, 15668, 17421}, i87, objArr12);
                                            Object objInvoke2 = cls3.getMethod((String) objArr12[0], null).invoke(context, null);
                                            int i88 = g;
                                            int i89 = (i88 ^ 83) + ((i88 & 83) << 1);
                                            asInterface = i89 % 128;
                                            int i90 = i89 % 2;
                                            try {
                                                Object[] objArr13 = {objInvoke2, 64};
                                                int trimmedLength = TextUtils.getTrimmedLength("");
                                                int i91 = trimmedLength * (-515);
                                                int i92 = (i91 & 17061) + (i91 | 17061);
                                                int i93 = ~(((-34) & i) | ((-34) ^ i));
                                                int i94 = ~((i57 ^ trimmedLength) | (i57 & trimmedLength));
                                                int i95 = (i93 & i94) | (i93 ^ i94);
                                                int i96 = ~((i57 ^ 33) | (i57 & 33));
                                                int i97 = -(-(((i95 & i96) | (i95 ^ i96)) * (-516)));
                                                int i98 = (i92 & i97) + (i97 | i92);
                                                int i99 = ~trimmedLength;
                                                int i100 = i99 | (-34);
                                                int i101 = ~((i100 & i) | (i100 ^ i));
                                                int i102 = ~trimmedLength;
                                                int i103 = ~((i102 & i57) | (i102 ^ i57) | 33);
                                                int i104 = i98 + (((i103 & i101) | (i101 ^ i103)) * 516);
                                                int i105 = ~((i99 ^ 33) | (i99 & 33));
                                                int i106 = ~i;
                                                int i107 = ~(i106 | 33);
                                                int i108 = (i104 - (~(((i105 & i107) | (i105 ^ i107)) * 516))) - 1;
                                                Object[] objArr14 = new Object[1];
                                                c(new char[]{12852, 49624, 13151, 38172, 19665, 39986, 50534, 6772, 37876, 61405, 25714, 596, 13991, 39270, 51340, 63969, 48388, 16310, 20841, 35109, 43306, 32211, 40992, 36104, 8192, 21914, 490, 40410, 40209, 17268, 7968, 38912, 47213, 45638, 7769, 20817}, i108, objArr14);
                                                Class<?> cls4 = Class.forName((String) objArr14[0]);
                                                Object[] objArr15 = new Object[1];
                                                c(new char[]{56262, 31650, 65044, 64512, 41803, 14970, 58606, 48259, 61124, 52863, 42648, 61536, 11969, 39008, 50194, 26867}, 15 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), objArr15);
                                                Object objInvoke3 = cls4.getMethod((String) objArr15[0], String.class, Integer.TYPE).invoke(objInvoke, objArr13);
                                                int i109 = (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                                                Object[] objArr16 = new Object[1];
                                                a(new char[]{54132, 45348, 6095, 62586, 23046, 14503, 40267, 25506, 49550, 42541, 1229, 59764, 20228, 11688, 45651, 4266, 63125, 23351, 14741, 40520, 31768, 49853, 42836, 1533, 60314, 18487, 12026, 45950, 4375, 63417}, (i109 & 25183) + (i109 | 25183), objArr16);
                                                Class<?> cls5 = Class.forName((String) objArr16[0]);
                                                char[] cArr6 = {19864, 38615, 42265, 48817, 59709, 13205, 60965, 5731, 7785, 55266, 64882, 48711};
                                                int i110 = -Color.rgb(0, 0, 0);
                                                int i111 = i110 * (-344);
                                                int i112 = ((i111 | 1476391568) << 1) - (i111 ^ 1476391568);
                                                int i113 = ~i110;
                                                int i114 = g;
                                                int i115 = ((i114 | 31) << 1) - (i114 ^ 31);
                                                asInterface = i115 % 128;
                                                int i116 = i115 % 2;
                                                int i117 = ~(i113 | 16777205);
                                                int i118 = ~((i113 ^ i) | (i113 & i));
                                                int i119 = i112 + (345 * ((i117 ^ i118) | (i118 & i117)));
                                                int i120 = ~((i113 ^ i57) | (i113 & i57));
                                                int i121 = ~((i110 & 16777205) | (16777205 ^ i110));
                                                int i122 = ((i121 & i120) | (i120 ^ i121)) * 345;
                                                int i123 = ((i119 | i122) << 1) - (i119 ^ i122);
                                                int i124 = (16777205 & i113) | (i113 ^ 16777205);
                                                int i125 = -(-((~((i124 & i) | (i124 ^ i))) * 345));
                                                int i126 = (i123 ^ i125) + ((i125 & i123) << 1);
                                                Object[] objArr17 = new Object[1];
                                                c(cArr6, i126, objArr17);
                                                Object[] objArr18 = (Object[]) cls5.getField((String) objArr17[0]).get(objInvoke3);
                                                int length = objArr18.length;
                                                int i127 = 0;
                                                while (true) {
                                                    if (i127 < length) {
                                                        Object obj2 = objArr18[i127];
                                                        char[] cArr7 = {54093, 9486, 16202, 12730, 3064};
                                                        int i128 = -(ViewConfiguration.getMinimumFlingVelocity() >> 16);
                                                        int iB2 = attachPreviewSurface.b();
                                                        int i129 = i128 * (-317);
                                                        int i130 = (i129 ^ 20106251) + ((i129 & 20106251) << 1);
                                                        int i131 = ~i128;
                                                        int i132 = (i131 ^ (-63030)) | (i131 & (-63030));
                                                        int i133 = ~((i132 ^ iB2) | (i132 & iB2));
                                                        int i134 = ~iB2;
                                                        int i135 = (i134 ^ i128) | (i134 & i128);
                                                        int i136 = ~((i135 ^ 63029) | (i135 & 63029));
                                                        int i137 = -(-(((i133 ^ i136) | (i136 & i133)) * (-318)));
                                                        int i138 = ((i130 | i137) << 1) - (i130 ^ i137);
                                                        int i139 = asInterface + 105;
                                                        Object[] objArr19 = objArr18;
                                                        g = i139 % 128;
                                                        int i140 = length;
                                                        if (i139 % 2 != 0) {
                                                            i9 = (-318) % ((~((i128 ^ iB2) | (i128 & iB2))) | (~(((-63030) ^ i128) | ((-63030) & i128))));
                                                        } else {
                                                            int i141 = ~(((-63030) ^ i128) | ((-63030) & i128));
                                                            int i142 = ~((i128 ^ iB2) | (i128 & iB2));
                                                            i9 = (-318) * ((i141 ^ i142) | (i141 & i142));
                                                        }
                                                        int i143 = i138 + i9;
                                                        int i144 = ~((~i128) | iB2);
                                                        int i145 = -(-(((i144 & (-63030)) | ((-63030) ^ i144)) * TypedValues.AttributesType.TYPE_PIVOT_TARGET));
                                                        int i146 = (i143 & i145) + (i145 | i143);
                                                        Object[] objArr20 = new Object[1];
                                                        a(cArr7, i146, objArr20);
                                                        String str = (String) objArr20[0];
                                                        int i147 = asInterface + 19;
                                                        g = i147 % 128;
                                                        if (i147 % 2 != 0) {
                                                            try {
                                                                objArr = new Object[0];
                                                                objArr[1] = str;
                                                                cArr2 = new char[]{54143, 14967, 357, 26749, 30519, 24169, 42338, 35939, 39800, 57980, 51554, 53312, 16200, 1564, 27996, 29789, 17239, 43602, 45325, 39023, 59212, 52824, 54563, 15417, 2875, 4663, 31032, 16421, 44853, 46631, 40201, 58409, 62230, 55810, 8476, 2062, 5888};
                                                                maxKeyCode = KeyEvent.getMaxKeyCode() % 3;
                                                            } catch (Throwable th2) {
                                                                th = th2;
                                                                cause = th.getCause();
                                                                if (cause != null) {
                                                                    throw cause;
                                                                }
                                                                throw th;
                                                            }
                                                        } else {
                                                            objArr = new Object[]{str};
                                                            cArr2 = new char[]{54143, 14967, 357, 26749, 30519, 24169, 42338, 35939, 39800, 57980, 51554, 53312, 16200, 1564, 27996, 29789, 17239, 43602, 45325, 39023, 59212, 52824, 54563, 15417, 2875, 4663, 31032, 16421, 44853, 46631, 40201, 58409, 62230, 55810, 8476, 2062, 5888};
                                                            maxKeyCode = KeyEvent.getMaxKeyCode() >> 16;
                                                        }
                                                        int i148 = -maxKeyCode;
                                                        int i149 = ((59651 | i148) << 1) - (i148 ^ 59651);
                                                        Object[] objArr21 = new Object[1];
                                                        a(cArr2, i149, objArr21);
                                                        Class<?> cls6 = Class.forName((String) objArr21[0]);
                                                        char[] cArr8 = {54130, 7009, 17219, 35695, 62271, 15155, 25351, 43779, 37875, 56303, 986};
                                                        int keyRepeatTimeout = ViewConfiguration.getKeyRepeatTimeout() >> 16;
                                                        int iB3 = attachPreviewSurface.b();
                                                        int i150 = keyRepeatTimeout * 673;
                                                        int i151 = asInterface;
                                                        int i152 = ((i151 | 91) << 1) - (i151 ^ 91);
                                                        int i153 = i127;
                                                        g = i152 % 128;
                                                        if (i152 % 2 != 0) {
                                                            try {
                                                                int i154 = i150 % (-68784431);
                                                                int i155 = ~((keyRepeatTimeout ^ iB3) | (keyRepeatTimeout & iB3));
                                                                i10 = i154 << (672 << ((i155 ^ 51217) | (i155 & 51217)));
                                                            } catch (Throwable th3) {
                                                                th = th3;
                                                                cause = th.getCause();
                                                                if (cause != null) {
                                                                    throw cause;
                                                                }
                                                                throw th;
                                                            }
                                                        } else {
                                                            int i156 = (i150 ^ (-68784431)) + ((i150 & (-68784431)) << 1);
                                                            int i157 = ~((keyRepeatTimeout ^ iB3) | (keyRepeatTimeout & iB3));
                                                            i10 = i156 + (((i157 ^ 51217) | (i157 & 51217)) * 672);
                                                        }
                                                        int i158 = ~keyRepeatTimeout;
                                                        int i159 = ~iB3;
                                                        int i160 = ~((i158 ^ i159) | (i158 & i159));
                                                        int i161 = ~((51217 ^ iB3) | (51217 & iB3));
                                                        int i162 = i151 + 35;
                                                        g = i162 % 128;
                                                        int i163 = i162 % 2;
                                                        int i164 = i10 + ((-672) * ((i160 ^ i161) | (i160 & i161)));
                                                        int i165 = ~((-51218) | (~iB3));
                                                        int i166 = ~(keyRepeatTimeout | (-51218));
                                                        int i167 = ((i165 & i166) | (i165 ^ i166)) * 672;
                                                        int i168 = (i164 ^ i167) + ((i164 & i167) << 1);
                                                        Object[] objArr22 = new Object[1];
                                                        a(cArr8, i168, objArr22);
                                                        Object objInvoke4 = cls6.getMethod((String) objArr22[0], String.class).invoke(null, objArr);
                                                        try {
                                                            try {
                                                                char[] cArr9 = {64800, 10761, 48683, 19533, 28602, 25382, 36789, 17414, 39027, 33773, 28173, 6378, 28386, 1765, 28686, 65278, 43085, 35048, 22034, 48391, 58516, 33530, 21765, 23288, 11203, 42386, 11515, 35829, 4452, 16966};
                                                                int i169 = -TextUtils.indexOf((CharSequence) "", '0', 0, 0);
                                                                int i170 = i169 * 677;
                                                                int i171 = ((i170 | (-18225)) << 1) - (i170 ^ (-18225));
                                                                int i172 = i169 | i;
                                                                int i173 = -(-(((i172 & (-28)) | (i172 ^ (-28))) * (-676)));
                                                                int i174 = ((i171 | i173) << 1) - (i173 ^ i171);
                                                                int i175 = asInterface + 115;
                                                                g = i175 % 128;
                                                                if (i175 % 2 != 0) {
                                                                    int i176 = ~(((-28) ^ i169) | ((-28) & i169));
                                                                    int i177 = ~(i106 | i169);
                                                                    i11 = i174 % (676 >> ((i176 & i177) | (i176 ^ i177)));
                                                                } else {
                                                                    int i178 = ~(((-28) ^ i169) | ((-28) & i169));
                                                                    int i179 = ~(i106 | i169);
                                                                    i11 = i174 + (((i178 & i179) | (i178 ^ i179)) * 676);
                                                                }
                                                                int i180 = ~i169;
                                                                int i181 = (~((i180 & (-28)) | (i180 ^ (-28)))) | (~(((-28) & i106) | ((-28) ^ i106)));
                                                                int i182 = (i169 & 27) | (i169 ^ 27);
                                                                int i183 = ~((i182 & i) | (i182 ^ i));
                                                                int i184 = -(-(676 * ((i183 & i181) | (i181 ^ i183))));
                                                                int i185 = ((i11 | i184) << 1) - (i184 ^ i11);
                                                                Object[] objArr23 = new Object[1];
                                                                c(cArr9, i185, objArr23);
                                                                Class<?> cls7 = Class.forName((String) objArr23[0]);
                                                                Object[] objArr24 = new Object[1];
                                                                a(new char[]{54113, 5435, 24533, 33199, 51813, 3125, 30418, 47264, 57711, 11069, 28134}, 50752 - TextUtils.indexOf((CharSequence) "", '0'), objArr24);
                                                                try {
                                                                    Object[] objArr25 = {new ByteArrayInputStream((byte[]) cls7.getMethod((String) objArr24[0], null).invoke(obj2, null))};
                                                                    int iRgb = Color.rgb(0, 0, 0);
                                                                    int i186 = ((iRgb | 16836867) << 1) - (iRgb ^ 16836867);
                                                                    Object[] objArr26 = new Object[1];
                                                                    a(new char[]{54143, 14967, 357, 26749, 30519, 24169, 42338, 35939, 39800, 57980, 51554, 53312, 16200, 1564, 27996, 29789, 17239, 43602, 45325, 39023, 59212, 52824, 54563, 15417, 2875, 4663, 31032, 16421, 44853, 46631, 40201, 58409, 62230, 55810, 8476, 2062, 5888}, i186, objArr26);
                                                                    Class<?> cls8 = Class.forName((String) objArr26[0]);
                                                                    Object[] objArr27 = new Object[1];
                                                                    c(new char[]{49559, 30251, 31435, 50697, 60068, 63399, 19085, 43892, 404, 37410, 38646, 39458, 2315, 54228, 58464, 27548, 35077, 17904, 41593, 19304, 37615, 63881}, 20 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), objArr27);
                                                                    String str2 = (String) objArr27[0];
                                                                    Class<?>[] clsArr2 = new Class[1];
                                                                    int i187 = g + 83;
                                                                    asInterface = i187 % 128;
                                                                    if (i187 % 2 != 0) {
                                                                        clsArr2[0] = InputStream.class;
                                                                        Object objInvoke5 = cls8.getMethod(str2, clsArr2).invoke(objInvoke4, objArr25);
                                                                        int i188 = asInterface + 9;
                                                                        g = i188 % 128;
                                                                        int i189 = i188 % 2;
                                                                        try {
                                                                            Object[] objArr28 = new Object[1];
                                                                            a(new char[]{54143, 50067, 62125, 57793, 37031, 34789, 46618, 42279, 21592, 19320, 31354, 27276, 6584, 2176, 16340, 12025, 56599, 52278, 58117, 37480, 33068, 45526, 41206, 22423, 18136, 30184, 25623, 6945, 2615, 14679, 10340, 55437, 53121, 65207}, 4327 - View.MeasureSpec.makeMeasureSpec(0, 0), objArr28);
                                                                            Class<?> cls9 = Class.forName((String) objArr28[0]);
                                                                            int i190 = (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1));
                                                                            int i191 = i190 * 141;
                                                                            int i192 = (i191 & (-3129029)) + (i191 | (-3129029));
                                                                            int i193 = ~i190;
                                                                            int i194 = ~(i193 | 22511);
                                                                            int i195 = ~((i193 ^ i) | (i193 & i));
                                                                            int i196 = ((i194 & i195) | (i194 ^ i195)) * (-280);
                                                                            int i197 = (i192 & i196) + (i196 | i192);
                                                                            int i198 = ~((i193 ^ i) | (i193 & i));
                                                                            int i199 = ~(((-22512) ^ i) | ((-22512) & i));
                                                                            int i200 = i197 + (((i198 ^ i199) | (i198 & i199)) * 140);
                                                                            int i201 = (i193 & (-22512)) | (i193 ^ (-22512));
                                                                            int i202 = ~((i201 & i) | (i201 ^ i));
                                                                            int i203 = ~i190;
                                                                            int i204 = (i203 & i106) | (i203 ^ i106);
                                                                            int i205 = ~((i204 & 22511) | (i204 ^ 22511));
                                                                            int i206 = (i202 & i205) | (i202 ^ i205);
                                                                            int i207 = (-22512) | i57;
                                                                            int i208 = ~((i190 & i207) | (i207 ^ i190));
                                                                            int i209 = ((i208 & i206) | (i206 ^ i208)) * 140;
                                                                            int i210 = (i200 ^ i209) + ((i209 & i200) << 1);
                                                                            Object[] objArr29 = new Object[1];
                                                                            a(new char[]{54130, 33951, 31935, 54411, 36060, 25820, 56549, 46329, 27662, 50182, 48155, 5221, 52241, 41990, 7255, 62566, 44428, 1444, 64952, 21953, 3529, 58863, 24051}, i210, objArr29);
                                                                            if (!NewInstance.equals(cls9.getMethod((String) objArr29[0], null).invoke(objInvoke5, null))) {
                                                                                int i211 = asInterface + 81;
                                                                                g = i211 % 128;
                                                                                int i212 = i211 % 2;
                                                                                try {
                                                                                    int i213 = (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
                                                                                    int i214 = ~i213;
                                                                                    int i215 = i214 | (-4328);
                                                                                    int i216 = ~((i215 & i106) | (i215 ^ i106));
                                                                                    int i217 = ~((i213 ^ 4327) | (i213 & 4327));
                                                                                    int i218 = ((i213 * 69) - 289909) + (((i216 & i217) | (i216 ^ i217) | (~(i | 4327))) * (-68));
                                                                                    int i219 = i214 | i106;
                                                                                    int i220 = (~((i219 & 4327) | (i219 ^ 4327))) * (-68);
                                                                                    int i221 = (i218 ^ i220) + ((i218 & i220) << 1);
                                                                                    int i222 = ~i213;
                                                                                    int i223 = ~(((-4328) & i106) | ((-4328) ^ i106));
                                                                                    int i224 = -(-(((i222 & i223) | (i222 ^ i223)) * 68));
                                                                                    Object[] objArr30 = new Object[1];
                                                                                    a(new char[]{54143, 50067, 62125, 57793, 37031, 34789, 46618, 42279, 21592, 19320, 31354, 27276, 6584, 2176, 16340, 12025, 56599, 52278, 58117, 37480, 33068, 45526, 41206, 22423, 18136, 30184, 25623, 6945, 2615, 14679, 10340, 55437, 53121, 65207}, (i221 & i224) + (i224 | i221), objArr30);
                                                                                    Class<?> cls10 = Class.forName((String) objArr30[0]);
                                                                                    Object[] objArr31 = new Object[1];
                                                                                    a(new char[]{54130, 33951, 31935, 54411, 36060, 25820, 56549, 46329, 27662, 50182, 48155, 5221, 52241, 41990, 7255, 62566, 44428, 1444, 64952, 21953, 3529, 58863, 24051}, 22510 - (~(CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1))), objArr31);
                                                                                    if (!objNewInstance.equals(cls10.getMethod((String) objArr31[0], null).invoke(objInvoke5, null))) {
                                                                                        int i225 = (i153 & 8) + (i153 | 8);
                                                                                        i12 = i2;
                                                                                        i127 = ((i225 & (-7)) << 1) + (i225 ^ (-7));
                                                                                        objArr18 = objArr19;
                                                                                        length = i140;
                                                                                    }
                                                                                } catch (Throwable th4) {
                                                                                    Throwable cause2 = th4.getCause();
                                                                                    if (cause2 != null) {
                                                                                        throw cause2;
                                                                                    }
                                                                                    throw th4;
                                                                                }
                                                                            }
                                                                            Object[] objArr32 = {new int[]{i}, new int[1], new int[]{i ^ 1}, null};
                                                                            int elapsedCpuTime = (int) Process.getElapsedCpuTime();
                                                                            int i226 = ~elapsedCpuTime;
                                                                            int i227 = 594138376 + (((~((-174507255) | i226)) | (-134197026)) * 519) + (((~(i226 | (-40272929))) | (~((-93924098) | elapsedCpuTime))) * (-519)) + (((~(elapsedCpuTime | (-134197026))) | 174507254) * 519) + 16;
                                                                            int iB4 = attachPreviewSurface.b();
                                                                            int i228 = ((i227 * 253) - (~(-(-(i2 * 253))))) - 1;
                                                                            int i229 = ~i227;
                                                                            int i230 = ~i2;
                                                                            int i231 = ~((i229 & i230) | (i229 ^ i230));
                                                                            int i232 = ~i2;
                                                                            int i233 = ~iB4;
                                                                            int i234 = ~((i232 & i233) | (i232 ^ i233));
                                                                            int i235 = (i231 & i234) | (i231 ^ i234);
                                                                            int i236 = (i227 ^ i2) | (i227 & i2);
                                                                            int i237 = -(-((i235 | (~((i236 ^ iB4) | (i236 & iB4)))) * (-252)));
                                                                            int i238 = (i228 & i237) + (i228 | i237);
                                                                            int i239 = -(-(i236 * (-252)));
                                                                            int i240 = ((i238 | i239) << 1) - (i239 ^ i238);
                                                                            int i241 = ~iB4;
                                                                            int i242 = (i241 & i230) | (i230 ^ i241);
                                                                            int i243 = -(-(((~(iB4 | i227 | i2)) | (~((i242 & i227) | (i242 ^ i227)))) * 252));
                                                                            int i244 = (i240 & i243) + (i243 | i240);
                                                                            int i245 = i244 << 13;
                                                                            int i246 = (i245 & (~i244)) | ((~i245) & i244);
                                                                            int i247 = i246 >>> 17;
                                                                            int i248 = ((~i246) & i247) | ((~i247) & i246);
                                                                            int i249 = i248 << 5;
                                                                            ((int[]) objArr32[1])[0] = ((~i248) & i249) | ((~i249) & i248);
                                                                            return objArr32;
                                                                        } catch (Throwable th5) {
                                                                            Throwable cause3 = th5.getCause();
                                                                            if (cause3 != null) {
                                                                                throw cause3;
                                                                            }
                                                                            throw th5;
                                                                        }
                                                                    }
                                                                    try {
                                                                        clsArr2[0] = InputStream.class;
                                                                        cls8.getMethod(str2, clsArr2).invoke(objInvoke4, objArr25);
                                                                        throw null;
                                                                    } catch (Throwable th6) {
                                                                        th = th6;
                                                                    }
                                                                } catch (Throwable th7) {
                                                                    th = th7;
                                                                }
                                                                Throwable cause4 = th.getCause();
                                                                if (cause4 != null) {
                                                                    throw cause4;
                                                                }
                                                                throw th;
                                                            } catch (Throwable th8) {
                                                                Throwable cause5 = th8.getCause();
                                                                if (cause5 != null) {
                                                                    throw cause5;
                                                                }
                                                                throw th8;
                                                            }
                                                        } catch (Throwable unused) {
                                                            NewInstance = i2;
                                                        }
                                                    } else {
                                                        NewInstance = i12;
                                                    }
                                                }
                                            } catch (Throwable th9) {
                                                Throwable cause6 = th9.getCause();
                                                if (cause6 != null) {
                                                    throw cause6;
                                                }
                                                throw th9;
                                            }
                                        } catch (Throwable th10) {
                                            Throwable cause7 = th10.getCause();
                                            if (cause7 != null) {
                                                throw cause7;
                                            }
                                            throw th10;
                                        }
                                    } catch (Throwable th11) {
                                        Throwable cause8 = th11.getCause();
                                        if (cause8 != null) {
                                            throw cause8;
                                        }
                                        throw th11;
                                    }
                                } catch (Throwable th12) {
                                    Throwable cause9 = th12.getCause();
                                    if (cause9 != null) {
                                        throw cause9;
                                    }
                                    throw th12;
                                }
                            } catch (Throwable th13) {
                                Throwable cause10 = th13.getCause();
                                if (cause10 != null) {
                                    throw cause10;
                                }
                                throw th13;
                            }
                        } catch (Throwable unused2) {
                        }
                    } catch (Throwable unused3) {
                    }
                } else {
                    NewInstance = i12;
                }
                int i250 = asInterface + 7;
                g = i250 % 128;
                int i251 = i250 % 2;
                Object[] objArr33 = {new int[]{i}, new int[1], new int[]{i}, null};
                int i252 = ~i;
                int i253 = 1490394244 + (((~((-900874748) | i252)) | 941184976) * (-328)) + ((i | 941184976) * 164) + (((~(900874747 | i)) | 134813184 | (~((-94502956) | i252))) * 164);
                int i254 = -(-(i253 * (-1343)));
                int i255 = (i254 << 1) - i254;
                int i256 = ~i;
                int i257 = ((i256 & i253) | (i253 ^ i256)) * 672;
                int i258 = (i255 ^ i257) + ((i257 & i255) << 1);
                int i259 = -(-((~((i & i253) | (i253 ^ i))) * (-672)));
                int i260 = (i258 ^ i259) + ((i259 & i258) << 1);
                int i261 = ~i253;
                int i262 = -(-(((~i261) | (~(i252 | i261))) * 672));
                int i263 = (i260 & i262) + (i262 | i260);
                int iB5 = attachPreviewSurface.b();
                int i264 = i263 * (-300);
                int i265 = -(-(NewInstance * 302));
                int i266 = ((i264 | i265) << 1) - (i264 ^ i265);
                int i267 = i263 | NewInstance;
                int i268 = ~((i267 & iB5) | (i267 ^ iB5));
                int i269 = g;
                int i270 = i269 + 121;
                asInterface = i270 % 128;
                if (i270 % 2 == 0) {
                    int i271 = -(-i268);
                    int i272 = (i266 - (~(-((i271 ^ (-301)) + ((i271 & (-301)) << 1))))) - 1;
                    int i273 = ~NewInstance;
                    int i274 = ~((i273 & iB5) | (i273 ^ iB5));
                    int i275 = ~iB5;
                    int i276 = ~((i275 & i263) | (i275 ^ i263));
                    i3 = i272 >>> ((-301) << ((i274 & i276) | (i274 ^ i276)));
                } else {
                    int i277 = i268 * (-301);
                    int i278 = (i266 ^ i277) + ((i277 & i266) << 1);
                    int i279 = ~((~NewInstance) | iB5);
                    int i280 = ~iB5;
                    int i281 = ~((i280 & i263) | (i280 ^ i263));
                    i3 = (((i279 & i281) | (i279 ^ i281)) * (-301)) + i278;
                }
                int i282 = ~NewInstance;
                int i283 = ~i263;
                int i284 = 301 * ((~((iB5 & i283) | (i283 ^ iB5))) | i282);
                int i285 = ((i3 | i284) << 1) - (i284 ^ i3);
                int i286 = i285 << 13;
                int i287 = (i285 | i286) & (~(i285 & i286));
                int i288 = i287 >>> 17;
                int i289 = ((~i287) & i288) | ((~i288) & i287);
                ((int[]) objArr33[1])[0] = i289 ^ (i289 << 5);
                int i290 = i269 + 105;
                asInterface = i290 % 128;
                int i291 = i290 % 2;
                return objArr33;
            }

            /* JADX WARN: Code duplicated, block: B:10:0x0024  */
            /* JADX WARN: Code duplicated, block: B:8:0x001e  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x002e). Please report as a decompilation issue!!! */
            /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0024
                	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                */
            private static java.lang.String $$c(int r6, int r7, int r8) {
                /*
                    int r7 = r7 * 4
                    int r7 = r7 + 108
                    byte[] r0 = defpackage.getVector.$$a
                    int r8 = r8 * 2
                    int r1 = 1 - r8
                    int r6 = r6 * 3
                    int r6 = 3 - r6
                    byte[] r1 = new byte[r1]
                    r2 = 0
                    int r8 = 0 - r8
                    if (r0 != 0) goto L18
                    r3 = r8
                    r4 = r2
                    goto L2e
                L18:
                    r3 = r2
                L19:
                    byte r4 = (byte) r7
                    r1[r3] = r4
                    if (r3 != r8) goto L24
                    java.lang.String r6 = new java.lang.String
                    r6.<init>(r1, r2)
                    return r6
                L24:
                    int r6 = r6 + 1
                    r4 = r0[r6]
                    int r3 = r3 + 1
                    r5 = r3
                    r3 = r7
                    r7 = r4
                    r4 = r5
                L2e:
                    int r7 = -r7
                    int r7 = r7 + r3
                    r3 = r4
                    goto L19
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.getVector.$$c(int, int, int):java.lang.String");
            }
        };
        isLenovoTablet islenovotablet = new isLenovoTablet(false, false);
        function1.invoke(islenovotablet);
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = islenovotablet;
    }

    public static final isLenovoTablet TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        return TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    }

    public static /* synthetic */ VersionApiClient TuitionPaymentFragmentspecialinlinedviewModeldefault1(FileTransformFactory fileTransformFactory, CoordinateTransform coordinateTransform) {
        Intrinsics.checkNotNullParameter(fileTransformFactory, "");
        Intrinsics.checkNotNullParameter(coordinateTransform, "");
        notifyStateDetached notifystatedetached = notifyStateDetached.INSTANCE;
        return (VersionApiClient) notifyStateDetached.b(VersionApiClient.class, (OkHttpClient) fileTransformFactory.b(Reflection.getOrCreateKotlinClass(OkHttpClient.class), null, null), (String) fileTransformFactory.b(Reflection.getOrCreateKotlinClass(String.class), new setUsingExifOrientation("baseUrl"), null));
    }

    public static /* synthetic */ VersionApi b(FileTransformFactory fileTransformFactory, CoordinateTransform coordinateTransform) {
        Intrinsics.checkNotNullParameter(fileTransformFactory, "");
        Intrinsics.checkNotNullParameter(coordinateTransform, "");
        return new VersionApi((VersionApiClient) fileTransformFactory.b(Reflection.getOrCreateKotlinClass(VersionApiClient.class), null, null));
    }

    public static /* synthetic */ VersionRepository TuitionPaymentFragmentspecialinlinedviewModeldefault2(FileTransformFactory fileTransformFactory, CoordinateTransform coordinateTransform) {
        Intrinsics.checkNotNullParameter(fileTransformFactory, "");
        Intrinsics.checkNotNullParameter(coordinateTransform, "");
        return new VersionDataStore((VersionApi) fileTransformFactory.b(Reflection.getOrCreateKotlinClass(VersionApi.class), null, null));
    }

    public static /* synthetic */ ApiCompatApi29Impl TuitionPaymentFragmentspecialinlinedviewModeldefault3(FileTransformFactory fileTransformFactory, CoordinateTransform coordinateTransform) {
        Intrinsics.checkNotNullParameter(fileTransformFactory, "");
        Intrinsics.checkNotNullParameter(coordinateTransform, "");
        return new ApiCompatApi29Impl((IntentSenderRequestBuilder) fileTransformFactory.b(Reflection.getOrCreateKotlinClass(IntentSenderRequestBuilder.class), null, null), (registerlambda1) fileTransformFactory.b(Reflection.getOrCreateKotlinClass(registerlambda1.class), null, null), (acquireBuffer) fileTransformFactory.b(Reflection.getOrCreateKotlinClass(acquireBuffer.class), null, null));
    }

    public static /* synthetic */ IntentSenderRequestBuilder TuitionPaymentFragmentbindingInflater1(FileTransformFactory fileTransformFactory, CoordinateTransform coordinateTransform) {
        Intrinsics.checkNotNullParameter(fileTransformFactory, "");
        Intrinsics.checkNotNullParameter(coordinateTransform, "");
        return new getFillInIntent((VersionRepository) fileTransformFactory.b(Reflection.getOrCreateKotlinClass(VersionRepository.class), null, null));
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault2(isLenovoTablet islenovotablet) {
        Intrinsics.checkNotNullParameter(islenovotablet, "");
        Function2<? super FileTransformFactory, ? super CoordinateTransform, ? extends T> function2 = new Function2() { // from class: getUrl
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return isMitigated.TuitionPaymentFragmentspecialinlinedviewModeldefault1((FileTransformFactory) obj, (CoordinateTransform) obj2);
            }
        };
        ZoomGestureDetectorZoomEventEnd zoomGestureDetectorZoomEventEnd = ZoomGestureDetectorZoomEventEnd.INSTANCE;
        Kind kind = Kind.Single;
        ZoomGestureDetectorZoomEventMove<?> zoomGestureDetectorZoomEventMove = new ZoomGestureDetectorZoomEventMove<>(null, null, Reflection.getOrCreateKotlinClass(VersionApiClient.class));
        zoomGestureDetectorZoomEventMove.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = function2;
        zoomGestureDetectorZoomEventMove.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = kind;
        islenovotablet.TuitionPaymentFragmentbindingInflater1(zoomGestureDetectorZoomEventMove, new ZoomGestureDetectorgestureDetector1(false, false));
        islenovotablet.TuitionPaymentFragmentspecialinlinedviewModeldefault1.add(zoomGestureDetectorZoomEventMove);
        Function2<? super FileTransformFactory, ? super CoordinateTransform, ? extends T> function3 = new Function2() { // from class: i0ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return isMitigated.b((FileTransformFactory) obj, (CoordinateTransform) obj2);
            }
        };
        ZoomGestureDetectorZoomEventEnd zoomGestureDetectorZoomEventEnd2 = ZoomGestureDetectorZoomEventEnd.INSTANCE;
        Kind kind2 = Kind.Single;
        ZoomGestureDetectorZoomEventMove<?> zoomGestureDetectorZoomEventMove2 = new ZoomGestureDetectorZoomEventMove<>(null, null, Reflection.getOrCreateKotlinClass(VersionApi.class));
        zoomGestureDetectorZoomEventMove2.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = function3;
        zoomGestureDetectorZoomEventMove2.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = kind2;
        islenovotablet.TuitionPaymentFragmentbindingInflater1(zoomGestureDetectorZoomEventMove2, new ZoomGestureDetectorgestureDetector1(false, false));
        islenovotablet.TuitionPaymentFragmentspecialinlinedviewModeldefault1.add(zoomGestureDetectorZoomEventMove2);
        Function2<? super FileTransformFactory, ? super CoordinateTransform, ? extends T> function4 = new Function2() { // from class: i0
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return isMitigated.TuitionPaymentFragmentspecialinlinedviewModeldefault2((FileTransformFactory) obj, (CoordinateTransform) obj2);
            }
        };
        ZoomGestureDetectorZoomEventEnd zoomGestureDetectorZoomEventEnd3 = ZoomGestureDetectorZoomEventEnd.INSTANCE;
        Kind kind3 = Kind.Single;
        ZoomGestureDetectorZoomEventMove<?> zoomGestureDetectorZoomEventMove3 = new ZoomGestureDetectorZoomEventMove<>(null, null, Reflection.getOrCreateKotlinClass(VersionRepository.class));
        zoomGestureDetectorZoomEventMove3.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = function4;
        zoomGestureDetectorZoomEventMove3.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = kind3;
        islenovotablet.TuitionPaymentFragmentbindingInflater1(zoomGestureDetectorZoomEventMove3, new ZoomGestureDetectorgestureDetector1(false, false));
        islenovotablet.TuitionPaymentFragmentspecialinlinedviewModeldefault1.add(zoomGestureDetectorZoomEventMove3);
        Function2<? super FileTransformFactory, ? super CoordinateTransform, ? extends T> function5 = new Function2() { // from class: g0ExternalSyntheticLambda0
            private static final byte[] $$c = {12, -88, 33, 118};
            private static final int $$d = 165;
            private static int $10 = 0;
            private static int $11 = 1;
            private static final byte[] $$a = {12, -88, 33, 118, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 56, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 55, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, 7, -18, -16, -1, -16, -16, -4, 19, -48, -3, -17, 0, -30, 4, -24, 54};
            private static final int $$b = 104;
            private static int TuitionPaymentFragmentbindingInflater1 = 0;
            private static int d = 1;
            private static char[] TuitionPaymentFragmentspecialinlinedviewModeldefault2 = {47339, 47390, 47336, 47386, 47389, 47331, 47326, 47337, 47384, 47335, 47305, 47380, 47333, 47307, 47388, 47328, 47299, 47334, 47391, 47385, 47325, 47329, 47327, 47338, 47383, 47323};
            private static int TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 2047719564;
            private static boolean b = true;
            private static boolean TuitionPaymentFragmentspecialinlinedviewModeldefault3 = true;

            /* JADX WARN: Code duplicated, block: B:10:0x0024  */
            /* JADX WARN: Code duplicated, block: B:8:0x001c  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x0026). Please report as a decompilation issue!!! */
            /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0024
                	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                */
            private static void c(byte r5, byte r6, short r7, java.lang.Object[] r8) {
                /*
                    int r7 = 145 - r7
                    int r6 = r6 * 14
                    int r6 = 98 - r6
                    int r0 = 53 - r5
                    byte[] r1 = defpackage.g0ExternalSyntheticLambda0.$$a
                    byte[] r0 = new byte[r0]
                    int r5 = 52 - r5
                    r2 = 0
                    if (r1 != 0) goto L14
                    r3 = r5
                    r4 = r2
                    goto L26
                L14:
                    r3 = r2
                L15:
                    byte r4 = (byte) r6
                    r0[r3] = r4
                    int r4 = r3 + 1
                    if (r3 != r5) goto L24
                    java.lang.String r5 = new java.lang.String
                    r5.<init>(r0, r2)
                    r8[r2] = r5
                    return
                L24:
                    r3 = r1[r7]
                L26:
                    int r3 = -r3
                    int r7 = r7 + 1
                    int r6 = r6 + r3
                    int r6 = r6 + (-11)
                    r3 = r4
                    goto L15
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.g0ExternalSyntheticLambda0.c(byte, byte, short, java.lang.Object[]):void");
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                int i = 2 % 2;
                int i2 = TuitionPaymentFragmentbindingInflater1 + 105;
                d = i2 % 128;
                int i3 = i2 % 2;
                IntentSenderRequestBuilder intentSenderRequestBuilderTuitionPaymentFragmentbindingInflater1 = isMitigated.TuitionPaymentFragmentbindingInflater1((FileTransformFactory) obj, (CoordinateTransform) obj2);
                int i4 = TuitionPaymentFragmentbindingInflater1 + 105;
                d = i4 % 128;
                int i5 = i4 % 2;
                return intentSenderRequestBuilderTuitionPaymentFragmentbindingInflater1;
            }

            private static void a(char[] cArr, int[] iArr, int i, byte[] bArr, Object[] objArr) throws Throwable {
                char[] cArr2;
                int i2 = 2 % 2;
                getSupportedPostviewSize getsupportedpostviewsize = new getSupportedPostviewSize();
                char[] cArr3 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                long j = 0;
                if (cArr3 != null) {
                    int length = cArr3.length;
                    char[] cArr4 = new char[length];
                    int i3 = 0;
                    while (i3 < length) {
                        try {
                            Object[] objArr2 = {Integer.valueOf(cArr3[i3])};
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1561626312);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                                char c = (char) ((SystemClock.elapsedRealtime() > j ? 1 : (SystemClock.elapsedRealtime() == j ? 0 : -1)) + 31338);
                                int mirror = 3042 - AndroidCharacter.getMirror('0');
                                int iLastIndexOf = 16 - TextUtils.lastIndexOf("", '0');
                                byte b2 = (byte) ($$d & 3);
                                byte b3 = (byte) (b2 - 1);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(c, mirror, iLastIndexOf, 1182129903, false, $$e(b2, b3, b3), new Class[]{Integer.TYPE});
                            }
                            cArr4[i3] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                            i3++;
                            j = 0;
                        } catch (Throwable th) {
                            Throwable cause = th.getCause();
                            if (cause == null) {
                                throw th;
                            }
                            throw cause;
                        }
                    }
                    cArr3 = cArr4;
                }
                Object[] objArr3 = {Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault1)};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-499324958);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (Color.alpha(0) + 43325), (ViewConfiguration.getDoubleTapTimeout() >> 16) + 253, (-16777194) - Color.rgb(0, 0, 0), 111296565, false, ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, new Class[]{Integer.TYPE});
                }
                int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).intValue();
                int i4 = 33602;
                int i5 = 1687675375;
                if (!(!TuitionPaymentFragmentspecialinlinedviewModeldefault3)) {
                    int i6 = $10 + 95;
                    $11 = i6 % 128;
                    if (i6 % 2 == 0) {
                        getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 = bArr.length;
                        cArr2 = new char[getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1];
                        getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
                    } else {
                        getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 = bArr.length;
                        cArr2 = new char[getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1];
                        getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
                    }
                    while (getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 < getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1) {
                        int i7 = $11 + 11;
                        $10 = i7 % 128;
                        if (i7 % 2 != 0) {
                            cArr2[getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) (cArr3[bArr[(getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 >>> 1) - getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] - i] * iIntValue);
                            Object[] objArr4 = {getsupportedpostviewsize, getsupportedpostviewsize};
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1687675375);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                                byte b4 = (byte) 0;
                                byte b5 = b4;
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) ((ViewConfiguration.getLongPressTimeout() >> 16) + 33602), Color.alpha(0) + 3085, (-16777190) - Color.rgb(0, 0, 0), -2146875848, false, $$e(b4, b5, b5), new Class[]{Object.class, Object.class});
                            }
                            ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
                        } else {
                            cArr2[getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) (cArr3[bArr[(getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 - 1) - getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] + i] - iIntValue);
                            Object[] objArr5 = {getsupportedpostviewsize, getsupportedpostviewsize};
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1687675375);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                                byte b6 = (byte) 0;
                                byte b7 = b6;
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (33602 - (ViewConfiguration.getMinimumFlingVelocity() >> 16)), Color.argb(0, 0, 0, 0) + 3085, (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 26, -2146875848, false, $$e(b6, b7, b7), new Class[]{Object.class, Object.class});
                            }
                            ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5);
                        }
                    }
                    objArr[0] = new String(cArr2);
                    return;
                }
                if (b) {
                    getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 = cArr.length;
                    char[] cArr5 = new char[getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1];
                    getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
                    while (getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 < getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1) {
                        cArr5[getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) (cArr3[cArr[(getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 - 1) - getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] - i] - iIntValue);
                        Object[] objArr6 = {getsupportedpostviewsize, getsupportedpostviewsize};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(i5);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                            byte b8 = (byte) 0;
                            byte b9 = b8;
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b((char) (i4 - (ViewConfiguration.getPressedStateDuration() >> 16)), (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 3084, 27 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), -2146875848, false, $$e(b8, b9, b9), new Class[]{Object.class, Object.class});
                        }
                        ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr6);
                        i4 = 33602;
                        i5 = 1687675375;
                    }
                    objArr[0] = new String(cArr5);
                    return;
                }
                getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 = iArr.length;
                char[] cArr6 = new char[getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1];
                getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
                int i8 = $10 + 95;
                $11 = i8 % 128;
                int i9 = i8 % 2;
                while (getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 < getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1) {
                    int i10 = $11 + 1;
                    $10 = i10 % 128;
                    if (i10 % 2 != 0) {
                        cArr6[getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) (cArr3[iArr[(getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 - 1) - getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] >>> i] - iIntValue);
                        getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                    } else {
                        cArr6[getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) (cArr3[iArr[(getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 - 1) - getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] - i] - iIntValue);
                        getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1++;
                    }
                }
                objArr[0] = new String(cArr6);
            }

            /* JADX WARN: Code duplicated, block: B:106:0x0720  */
            /* JADX WARN: Code duplicated, block: B:127:0x028f A[EXC_TOP_SPLITTER, PHI: r17
  0x028f: PHI (r17v3 int) = (r17v2 int), (r17v15 int) binds: [B:36:0x027c, B:34:0x0276] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:35:0x0278 A[PHI: r17
  0x0278: PHI (r17v2 int) = (r17v1 int), (r17v15 int) binds: [B:29:0x021f, B:34:0x0276] A[DONT_GENERATE, DONT_INLINE]] */
            /* JADX WARN: Code duplicated, block: B:37:0x027e  */
            /* JADX WARN: Code duplicated, block: B:41:0x0295  */
            /* JADX WARN: Code duplicated, block: B:45:0x02c2 A[Catch: all -> 0x03d1, TryCatch #1 {all -> 0x03d1, blocks: (B:43:0x02b5, B:45:0x02c2, B:46:0x0301), top: B:116:0x02b5, outer: #0 }] */
            /* JADX WARN: Code duplicated, block: B:59:0x03e0 A[Catch: Exception -> 0x0580, TRY_LEAVE, TryCatch #0 {Exception -> 0x0580, blocks: (B:50:0x036a, B:54:0x03d4, B:56:0x03da, B:57:0x03db, B:59:0x03e0, B:65:0x0491, B:43:0x02b5, B:45:0x02c2, B:46:0x0301), top: B:115:0x0293, inners: #1 }] */
            /* JADX WARN: Code duplicated, block: B:62:0x042b  */
            /* JADX WARN: Code duplicated, block: B:63:0x0449  */
            /* JADX WARN: Code duplicated, block: B:70:0x0505 A[Catch: all -> 0x0577, TryCatch #4 {all -> 0x0577, blocks: (B:68:0x04f8, B:70:0x0505, B:71:0x054a), top: B:122:0x04f8, outer: #5 }] */
            /* JADX WARN: Code duplicated, block: B:74:0x0557  */
            /* JADX WARN: Code duplicated, block: B:75:0x0563  */
            /* JADX WARN: Code duplicated, block: B:77:0x0574  */
            /* JADX WARN: Code duplicated, block: B:88:0x05b0  */
            /* JADX WARN: Code duplicated, block: B:90:0x05c1  */
            /* JADX WARN: Code duplicated, block: B:91:0x05c4  */
            /* JADX WARN: Code duplicated, block: B:94:0x05d7  */
            /* JADX WARN: Code duplicated, block: B:95:0x05e3  */
            /* JADX WARN: Code duplicated, block: B:98:0x05f9  */
            public static Object[] TuitionPaymentFragmentspecialinlinedviewModeldefault1(Context context, int i, int i2, int i3) throws Throwable {
                int i4;
                int i5;
                int i6;
                int i7;
                int i8;
                int i9;
                Object[] objArr;
                int i10;
                int i11;
                int i12;
                int i13;
                int i14;
                int i15;
                int i16;
                int i17;
                int i18;
                int i19;
                int i20;
                int i21;
                int iTuitionPaymentFragmentspecialinlinedviewModeldefault3;
                int i22;
                int i23;
                int i24;
                int i25;
                String str;
                Object[] objArr2;
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3;
                int i26;
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4;
                Class<?> cls;
                int maxKeyCode;
                int i27;
                int i28;
                Class<?> cls2;
                int deadChar;
                int i29;
                int i30 = 2 % 2;
                int i31 = TuitionPaymentFragmentbindingInflater1;
                int i32 = i31 + 81;
                d = i32 % 128;
                int i33 = i32 % 2;
                if (context != null) {
                    int i34 = (i31 ^ 15) + ((i31 & 15) << 1);
                    int i35 = i34 % 128;
                    d = i35;
                    int i36 = i34 % 2;
                    int i37 = i35 + 25;
                    TuitionPaymentFragmentbindingInflater1 = i37 % 128;
                    try {
                        if (i37 % 2 != 0) {
                            Object[] objArr3 = new Object[1];
                            a(null, null, 117 >>> TextUtils.indexOf("", ""), new byte[]{-119, -116, -118, -119, -126, -123, -117, -121, -119, -126, -118, -119, -126, -123, -120, -121, -125, -122, -123, -124, -125, -126, -127}, objArr3);
                            cls = Class.forName((String) objArr3[0]);
                            maxKeyCode = KeyEvent.getMaxKeyCode();
                            i28 = 69;
                            i27 = 85;
                        } else {
                            int i38 = -(-TextUtils.indexOf("", ""));
                            Object[] objArr4 = new Object[1];
                            a(null, null, (i38 ^ 127) + ((i38 & 127) << 1), new byte[]{-119, -116, -118, -119, -126, -123, -117, -121, -119, -126, -118, -119, -126, -123, -120, -121, -125, -122, -123, -124, -125, -126, -127}, objArr4);
                            cls = Class.forName((String) objArr4[0]);
                            maxKeyCode = KeyEvent.getMaxKeyCode();
                            i27 = 16;
                            i28 = 127;
                        }
                        Object[] objArr5 = new Object[1];
                        a(null, null, i28 + (maxKeyCode >> i27), new byte[]{-123, -110, -126, -111, -126, -123, -122, -119, -127, -120, -122, -112, -113, -113, -114, -119, -118, -115}, objArr5);
                        Object objInvoke = cls.getMethod((String) objArr5[0], null).invoke(context, null);
                        int i39 = -(-MotionEvent.axisFromString(""));
                        int i40 = ((i39 | 128) << 1) - (i39 ^ 128);
                        byte[] bArr = {-123, -110, -126, -111, -126, -123, -122, -119, -127, -120, -122, -112, -113, -113, -114, -121, -109, -113, -121, -119, -126, -118, -119, -126, -123, -120, -121, -125, -122, -123, -124, -125, -126, -127};
                        int i41 = TuitionPaymentFragmentbindingInflater1 + 61;
                        d = i41 % 128;
                        if (i41 % 2 == 0) {
                            Object[] objArr6 = new Object[1];
                            a(null, null, i40, bArr, objArr6);
                            cls2 = Class.forName((String) objArr6[0]);
                            deadChar = KeyEvent.getDeadChar(0, 0);
                            i29 = 66;
                        } else {
                            Object[] objArr7 = new Object[1];
                            a(null, null, i40, bArr, objArr7);
                            cls2 = Class.forName((String) objArr7[0]);
                            deadChar = KeyEvent.getDeadChar(0, 0);
                            i29 = 127;
                        }
                        int i42 = TuitionPaymentFragmentbindingInflater1;
                        int i43 = (i42 ^ 15) + ((i42 & 15) << 1);
                        d = i43 % 128;
                        int i44 = i43 % 2;
                        int i45 = (((-665) * deadChar) - (~(-(-(i29 * 334))))) - 1;
                        int i46 = ~deadChar;
                        int i47 = i45 + (i46 * (-333));
                        int i48 = ~deadChar;
                        int i49 = ~i;
                        int i50 = i42 + 41;
                        d = i50 % 128;
                        int i51 = i50 % 2;
                        int i52 = -(-(333 * ((~((i48 ^ i49) | (i48 & i49))) | (~((i29 ^ i) | (i29 & i))))));
                        int i53 = ((i47 | i52) << 1) - (i52 ^ i47);
                        int i54 = ~(i46 | i);
                        int i55 = ((i42 | 41) << 1) - (i42 ^ 41);
                        d = i55 % 128;
                        int i56 = i55 % 2;
                        int i57 = ~((i49 ^ i29) | (i29 & i49));
                        int i58 = i54 ^ i57;
                        Object[] objArr8 = new Object[1];
                        a(null, null, (i53 - (~(-(-(333 * ((i54 & i57) | i58)))))) - 1, new byte[]{-108, -115, -127, -112, -110}, objArr8);
                        int i59 = cls2.getField((String) objArr8[0]).getInt(objInvoke) & 2;
                        int i60 = d;
                        int i61 = (i60 ^ 31) + ((i60 & 31) << 1);
                        TuitionPaymentFragmentbindingInflater1 = i61 % 128;
                        int i62 = i61 % 2;
                        int i63 = (i59 | (-i59)) >> 31;
                        int i64 = (~i63) & i;
                        int i65 = i63 & ((i & (-2)) | (i49 & 1));
                        i4 = (i65 & i64) | (i64 ^ i65);
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause != null) {
                            throw cause;
                        }
                        throw th;
                    }
                } else {
                    i4 = i;
                }
                try {
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1122237249);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                        char cLastIndexOf = (char) (16948 - TextUtils.lastIndexOf("", '0', 0));
                        int i66 = 2739 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                        int iLastIndexOf = TextUtils.lastIndexOf("", '0', 0) + 14;
                        byte[] bArr2 = $$a;
                        byte b2 = bArr2[7];
                        byte b3 = bArr2[5];
                        Object[] objArr9 = new Object[1];
                        c(b2, b3, (short) (b3 | 140), objArr9);
                        i5 = cLastIndexOf;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(i5 == true ? (char) 1 : (char) 0, i66, iLastIndexOf, 1501733736, false, (String) objArr9[0], new Class[0]);
                    }
                    Set set = (Set) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, null);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-431688923);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        char cKeyCodeFromString = (char) (16949 - KeyEvent.keyCodeFromString(""));
                        int i67 = 2738 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1));
                        int mode = View.MeasureSpec.getMode(0) + 13;
                        byte[] bArr3 = $$a;
                        byte b4 = bArr3[7];
                        byte b5 = bArr3[5];
                        Object[] objArr10 = new Object[1];
                        c(b4, b5, (short) (b5 | 88), objArr10);
                        i5 = cKeyCodeFromString;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(i5 == true ? (char) 1 : (char) 0, i67, mode, 47863026, false, (String) objArr10[0], null);
                    }
                    if (!set.contains(((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).get(null))) {
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1056710067);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                            char c = (char) (16949 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)));
                            int tapTimeout = (ViewConfiguration.getTapTimeout() >> 16) + 2739;
                            int iResolveSizeAndState = 13 - View.resolveSizeAndState(0, 0, 0);
                            byte b6 = $$a[5];
                            Object[] objArr11 = new Object[1];
                            c((byte) 15, b6, (short) (b6 | 36), objArr11);
                            i5 = c;
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(i5 == true ? (char) 1 : (char) 0, tapTimeout, iResolveSizeAndState, 631063962, false, (String) objArr11[0], null);
                        }
                        if (!set.contains(((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).get(null))) {
                            if (Build.VERSION.SDK_INT > 33) {
                                Object[] objArr12 = new Object[1];
                                a(null, null, 127 - (~(-(-TextUtils.lastIndexOf("", '0', 0)))), new byte[]{-120, -124, -121, -118, -112, -104, -127, -115, -115, -103, -104, -118, -125, -105, -125, -106, -112, -112, -107, -119, -122, -126, -122, -107, -120, -119, -118, -107}, objArr12);
                                Object[] objArr13 = {(String) objArr12[0]};
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-52092531);
                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                    char cResolveSize = (char) View.resolveSize(0, 0);
                                    int mode2 = 993 - View.MeasureSpec.getMode(0);
                                    int i68 = 8 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1));
                                    byte b7 = (byte) ($$b >>> 1);
                                    byte b8 = $$a[7];
                                    Object[] objArr14 = new Object[1];
                                    c(b7, b8, b8, objArr14);
                                    i5 = cResolveSize;
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(i5 == true ? (char) 1 : (char) 0, mode2, i68, 410748506, false, (String) objArr14[0], new Class[]{String.class});
                                }
                                long jLongValue = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr13)).longValue();
                                long j = 1191383536;
                                long j2 = 46;
                                i5 = i4;
                                long j3 = -1;
                                long j4 = jLongValue ^ j3;
                                long jMyUid = Process.myUid();
                                long j5 = jMyUid ^ j3;
                                long j6 = (j2 * j) + (j2 * jLongValue) + (((long) (-90)) * (j | ((j4 | j5) ^ j3))) + (((long) (-45)) * (((j4 | jMyUid) ^ j3) | ((jLongValue | j) ^ j3))) + (((long) 45) * ((j3 ^ (j5 | j)) | j4 | (((j ^ j3) | jMyUid) ^ j3))) + ((long) (-1392301773));
                                int i69 = (int) (j6 >> 32);
                                int i70 = d;
                                int i71 = ((i70 | 45) << 1) - (i70 ^ 45);
                                TuitionPaymentFragmentbindingInflater1 = i71 % 128;
                                int i72 = i71 % 2;
                                int iNextInt = new Random().nextInt(550549894);
                                int i73 = i69 & (1496113770 + (((~((-1249952419) | iNextInt)) | (-1607788467)) * (-756)) + (((~iNextInt) | (-1249952419)) * 756));
                                int i74 = (int) j6;
                                int elapsedCpuTime = (int) Process.getElapsedCpuTime();
                                int i75 = ~elapsedCpuTime;
                                int i76 = i74 & (2059660457 + ((elapsedCpuTime | (-2143289216)) * 988) + (((~((-2126369578) | i75)) | 672223529) * (-1976)) + (((~(elapsedCpuTime | (-689143168))) | (-2143289216) | (~(689143167 | i75))) * 988));
                                i10 = (i73 & i76) | (i73 ^ i76);
                                int i77 = TuitionPaymentFragmentbindingInflater1;
                                int i78 = (i77 ^ 67) + ((i77 & 67) << 1);
                                d = i78 % 128;
                                int i79 = i78 % 2;
                                i7 = i;
                            } else {
                                i5 = i4;
                                i21 = -ExpandableListView.getPackedPositionType(0L);
                                iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = FileExtKt$readLinesSafe$1.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
                                int i80 = i21 * TypedValues.Custom.TYPE_DIMENSION;
                                int i81 = d;
                                int i82 = (i81 ^ 117) + ((i81 & 117) << 1);
                                TuitionPaymentFragmentbindingInflater1 = i82 % 128;
                                int i83 = i82 % 2;
                                int i84 = ~i21;
                                int i85 = ~((i84 & iTuitionPaymentFragmentspecialinlinedviewModeldefault3) | (i84 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault3));
                                int i86 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault3;
                                int i87 = ~((i86 & 127) | (i86 ^ 127));
                                i22 = ((i80 - 114681) - (~(-(-(((i85 & i87) | (i85 ^ i87)) * (-1808)))))) - 1;
                                int i88 = ((i81 | 69) << 1) - (i81 ^ 69);
                                int i89 = i88 % 128;
                                TuitionPaymentFragmentbindingInflater1 = i89;
                                i23 = i88 % 2;
                                i24 = ~i21;
                                if (i23 != 0) {
                                    int i90 = ~((i24 & WorkInfo.STOP_REASON_FOREGROUND_SERVICE_TIMEOUT) | (i24 ^ WorkInfo.STOP_REASON_FOREGROUND_SERVICE_TIMEOUT) | iTuitionPaymentFragmentspecialinlinedviewModeldefault3);
                                    int i91 = (~iTuitionPaymentFragmentspecialinlinedviewModeldefault3) | i21;
                                    int i92 = ~((i91 & 127) | (i91 ^ 127));
                                    int i93 = 903 - (~((i90 & i92) | (i90 ^ i92)));
                                    i25 = ((i22 | i93) << 1) - (i22 ^ i93);
                                } else {
                                    int i94 = (i24 & WorkInfo.STOP_REASON_FOREGROUND_SERVICE_TIMEOUT) | (i24 ^ WorkInfo.STOP_REASON_FOREGROUND_SERVICE_TIMEOUT);
                                    int i95 = ~((i94 & iTuitionPaymentFragmentspecialinlinedviewModeldefault3) | (i94 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault3));
                                    int i96 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault3;
                                    int i97 = -(-((i95 | (~((i96 & i21) | (i96 ^ i21) | 127))) * TypedValues.Custom.TYPE_BOOLEAN));
                                    i25 = (i22 ^ i97) + ((i22 & i97) << 1);
                                }
                                int i98 = ~i21;
                                int i99 = ~((i98 & 127) | (i98 ^ 127));
                                int i100 = ~(((-128) ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault3) | ((-128) & iTuitionPaymentFragmentspecialinlinedviewModeldefault3));
                                int i101 = (i99 & i100) | (i99 ^ i100);
                                int i102 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault3;
                                int i103 = ~((i21 & i102) | (i102 ^ i21));
                                int i104 = i89 + 7;
                                d = i104 % 128;
                                int i105 = i104 % 2;
                                int i106 = i25 + (TypedValues.Custom.TYPE_BOOLEAN * ((i103 & i101) | (i101 ^ i103)));
                                Object[] objArr15 = new Object[1];
                                a(null, null, i106, new byte[]{-102}, objArr15);
                                str = (String) objArr15[0];
                                int i107 = -View.MeasureSpec.getMode(0);
                                int i108 = i107 * 960;
                                int i109 = (i108 & (-243459)) + (i108 | (-243459));
                                i7 = i;
                                int i110 = ~i7;
                                int i111 = ((~(((-128) & i110) | ((-128) ^ i110))) | (~((i107 ^ i7) | (i107 & i7)))) * 959;
                                int i112 = ((i109 | i111) << 1) - (i109 ^ i111);
                                int i113 = ~(((-128) & i7) | ((-128) ^ i7));
                                int i114 = ~((i107 & i110) | (i110 ^ i107));
                                int i115 = (((i112 & 122752) + (122752 | i112)) - (~(-(-(((i114 & i113) | (i113 ^ i114)) * 959))))) - 1;
                                Object[] objArr16 = new Object[1];
                                a(null, null, i115, new byte[]{-118, -112, -104, -127, -115, -115, -103, -104, -118, -125, -121, -123, -124}, objArr16);
                                objArr2 = new Object[]{(String) objArr16[0]};
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1333629456);
                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                                    char cGreen = (char) (Color.green(0) + 33602);
                                    int i116 = 3086 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1));
                                    int packedPositionGroup = 26 - ExpandableListView.getPackedPositionGroup(0L);
                                    byte b9 = (byte) ($$b >>> 1);
                                    byte b10 = $$a[7];
                                    Object[] objArr17 = new Object[1];
                                    c(b9, b10, b10, objArr17);
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cGreen, i116, packedPositionGroup, 1411172903, false, (String) objArr17[0], new Class[]{String.class});
                                }
                                if (str.equals(((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2))) {
                                    int i117 = TuitionPaymentFragmentbindingInflater1 + 105;
                                    d = i117 % 128;
                                    int i118 = i117 % 2;
                                    i10 = 1;
                                } else {
                                    int i119 = d;
                                    i26 = (i119 ^ 115) + ((i119 & 115) << 1);
                                    TuitionPaymentFragmentbindingInflater1 = i26 % 128;
                                    if (i26 % 2 != 0) {
                                        int i120 = 5 / 4;
                                    }
                                    i10 = 0;
                                }
                            }
                            i11 = (i7 & (-11)) | ((~i7) & 10);
                            int i121 = -i10;
                            int i122 = TuitionPaymentFragmentbindingInflater1;
                            int i123 = (i122 & 81) + (i122 | 81);
                            int i124 = i123 % 128;
                            d = i124;
                            int i125 = i123 % 2;
                            i12 = ((i10 & i121) | (i10 ^ i121)) >> 31;
                            i13 = ((i124 | 55) << 1) - (i124 ^ 55);
                            i14 = i13 % 128;
                            TuitionPaymentFragmentbindingInflater1 = i14;
                            if (i13 % 2 != 0) {
                                Object obj = null;
                                obj.hashCode();
                                throw null;
                            }
                            int i126 = (~i12) & i7;
                            int i127 = i12 & i11;
                            i15 = (i127 & i126) | (i126 ^ i127);
                            i16 = i14 + 95;
                            int i128 = i16 % 128;
                            d = i128;
                            if (i16 % 2 == 0) {
                                i17 = i2 & 76;
                            } else {
                                i17 = i2 & 32;
                            }
                            int i129 = -i17;
                            i18 = ((i17 & i129) | (i17 ^ i129)) >> 31;
                            i19 = i128 + 29;
                            TuitionPaymentFragmentbindingInflater1 = i19 % 128;
                            if (i19 % 2 != 0) {
                                int i130 = i15 & (~i18);
                                int i131 = i18 & i7;
                                i6 = (i130 & i131) | (i130 ^ i131);
                                int i132 = 89 / 0;
                            } else {
                                int i133 = i15 & (~i18);
                                int i134 = i18 & i7;
                                i6 = (i133 & i134) | (i133 ^ i134);
                            }
                            i20 = (i128 ^ 55) + ((i128 & 55) << 1);
                            TuitionPaymentFragmentbindingInflater1 = i20 % 128;
                            if (i20 % 2 != 0) {
                                int i135 = 4 % 2;
                            }
                            i8 = i5;
                        } else if (Build.VERSION.SDK_INT == 30) {
                            int i136 = TuitionPaymentFragmentbindingInflater1;
                            int i137 = (i136 & 3) + (i136 | 3);
                            d = i137 % 128;
                            int i138 = i137 % 2;
                            i6 = i;
                            i7 = i6;
                            i8 = i4;
                        } else {
                            if (Build.VERSION.SDK_INT > 33) {
                                Object[] objArr18 = new Object[1];
                                a(null, null, 127 - (~(-(-TextUtils.lastIndexOf("", '0', 0)))), new byte[]{-120, -124, -121, -118, -112, -104, -127, -115, -115, -103, -104, -118, -125, -105, -125, -106, -112, -112, -107, -119, -122, -126, -122, -107, -120, -119, -118, -107}, objArr18);
                                Object[] objArr19 = {(String) objArr18[0]};
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-52092531);
                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                    char cResolveSize2 = (char) View.resolveSize(0, 0);
                                    int mode3 = 993 - View.MeasureSpec.getMode(0);
                                    int i610 = 8 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1));
                                    byte b11 = (byte) ($$b >>> 1);
                                    byte b12 = $$a[7];
                                    Object[] objArr110 = new Object[1];
                                    c(b11, b12, b12, objArr110);
                                    i5 = cResolveSize2;
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(i5 == true ? (char) 1 : (char) 0, mode3, i610, 410748506, false, (String) objArr110[0], new Class[]{String.class});
                                }
                                long jLongValue2 = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr19)).longValue();
                                long j7 = 1191383536;
                                long j8 = 46;
                                i5 = i4;
                                long j9 = -1;
                                long j10 = jLongValue2 ^ j9;
                                long jMyUid2 = Process.myUid();
                                long j11 = jMyUid2 ^ j9;
                                long j12 = (j8 * j7) + (j8 * jLongValue2) + (((long) (-90)) * (j7 | ((j10 | j11) ^ j9))) + (((long) (-45)) * (((j10 | jMyUid2) ^ j9) | ((jLongValue2 | j7) ^ j9))) + (((long) 45) * ((j9 ^ (j11 | j7)) | j10 | (((j7 ^ j9) | jMyUid2) ^ j9))) + ((long) (-1392301773));
                                int i611 = (int) (j12 >> 32);
                                int i710 = d;
                                int i711 = ((i710 | 45) << 1) - (i710 ^ 45);
                                TuitionPaymentFragmentbindingInflater1 = i711 % 128;
                                int i712 = i711 % 2;
                                int iNextInt2 = new Random().nextInt(550549894);
                                int i713 = i611 & (1496113770 + (((~((-1249952419) | iNextInt2)) | (-1607788467)) * (-756)) + (((~iNextInt2) | (-1249952419)) * 756));
                                int i714 = (int) j12;
                                int elapsedCpuTime2 = (int) Process.getElapsedCpuTime();
                                int i715 = ~elapsedCpuTime2;
                                int i716 = i714 & (2059660457 + ((elapsedCpuTime2 | (-2143289216)) * 988) + (((~((-2126369578) | i715)) | 672223529) * (-1976)) + (((~(elapsedCpuTime2 | (-689143168))) | (-2143289216) | (~(689143167 | i715))) * 988));
                                i10 = (i713 & i716) | (i713 ^ i716);
                                int i717 = TuitionPaymentFragmentbindingInflater1;
                                int i718 = (i717 ^ 67) + ((i717 & 67) << 1);
                                d = i718 % 128;
                                int i719 = i718 % 2;
                                i7 = i;
                            } else {
                                i5 = i4;
                                i21 = -ExpandableListView.getPackedPositionType(0L);
                                iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = FileExtKt$readLinesSafe$1.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
                                int i810 = i21 * TypedValues.Custom.TYPE_DIMENSION;
                                int i811 = d;
                                int i812 = (i811 ^ 117) + ((i811 & 117) << 1);
                                TuitionPaymentFragmentbindingInflater1 = i812 % 128;
                                int i813 = i812 % 2;
                                int i814 = ~i21;
                                int i815 = ~((i814 & iTuitionPaymentFragmentspecialinlinedviewModeldefault3) | (i814 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault3));
                                int i816 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault3;
                                int i817 = ~((i816 & 127) | (i816 ^ 127));
                                i22 = ((i810 - 114681) - (~(-(-(((i815 & i817) | (i815 ^ i817)) * (-1808)))))) - 1;
                                int i818 = ((i811 | 69) << 1) - (i811 ^ 69);
                                int i819 = i818 % 128;
                                TuitionPaymentFragmentbindingInflater1 = i819;
                                i23 = i818 % 2;
                                i24 = ~i21;
                                if (i23 != 0) {
                                    int i910 = ~((i24 & WorkInfo.STOP_REASON_FOREGROUND_SERVICE_TIMEOUT) | (i24 ^ WorkInfo.STOP_REASON_FOREGROUND_SERVICE_TIMEOUT) | iTuitionPaymentFragmentspecialinlinedviewModeldefault3);
                                    int i911 = (~iTuitionPaymentFragmentspecialinlinedviewModeldefault3) | i21;
                                    int i912 = ~((i911 & 127) | (i911 ^ 127));
                                    int i913 = 903 - (~((i910 & i912) | (i910 ^ i912)));
                                    i25 = ((i22 | i913) << 1) - (i22 ^ i913);
                                } else {
                                    int i914 = (i24 & WorkInfo.STOP_REASON_FOREGROUND_SERVICE_TIMEOUT) | (i24 ^ WorkInfo.STOP_REASON_FOREGROUND_SERVICE_TIMEOUT);
                                    int i915 = ~((i914 & iTuitionPaymentFragmentspecialinlinedviewModeldefault3) | (i914 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault3));
                                    int i916 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault3;
                                    int i917 = -(-((i915 | (~((i916 & i21) | (i916 ^ i21) | 127))) * TypedValues.Custom.TYPE_BOOLEAN));
                                    i25 = (i22 ^ i917) + ((i22 & i917) << 1);
                                }
                                int i918 = ~i21;
                                int i919 = ~((i918 & 127) | (i918 ^ 127));
                                int i1010 = ~(((-128) ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault3) | ((-128) & iTuitionPaymentFragmentspecialinlinedviewModeldefault3));
                                int i1011 = (i919 & i1010) | (i919 ^ i1010);
                                int i1012 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault3;
                                int i1013 = ~((i21 & i1012) | (i1012 ^ i21));
                                int i1014 = i819 + 7;
                                d = i1014 % 128;
                                int i1015 = i1014 % 2;
                                int i1016 = i25 + (TypedValues.Custom.TYPE_BOOLEAN * ((i1013 & i1011) | (i1011 ^ i1013)));
                                Object[] objArr111 = new Object[1];
                                a(null, null, i1016, new byte[]{-102}, objArr111);
                                str = (String) objArr111[0];
                                int i1017 = -View.MeasureSpec.getMode(0);
                                int i1018 = i1017 * 960;
                                int i1019 = (i1018 & (-243459)) + (i1018 | (-243459));
                                i7 = i;
                                int i1110 = ~i7;
                                int i1111 = ((~(((-128) & i1110) | ((-128) ^ i1110))) | (~((i1017 ^ i7) | (i1017 & i7)))) * 959;
                                int i1112 = ((i1019 | i1111) << 1) - (i1019 ^ i1111);
                                int i1113 = ~(((-128) & i7) | ((-128) ^ i7));
                                int i1114 = ~((i1017 & i1110) | (i1110 ^ i1017));
                                int i1115 = (((i1112 & 122752) + (122752 | i1112)) - (~(-(-(((i1114 & i1113) | (i1113 ^ i1114)) * 959))))) - 1;
                                Object[] objArr112 = new Object[1];
                                a(null, null, i1115, new byte[]{-118, -112, -104, -127, -115, -115, -103, -104, -118, -125, -121, -123, -124}, objArr112);
                                objArr2 = new Object[]{(String) objArr112[0]};
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1333629456);
                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                                    char cGreen2 = (char) (Color.green(0) + 33602);
                                    int i1116 = 3086 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1));
                                    int packedPositionGroup2 = 26 - ExpandableListView.getPackedPositionGroup(0L);
                                    byte b13 = (byte) ($$b >>> 1);
                                    byte b14 = $$a[7];
                                    Object[] objArr113 = new Object[1];
                                    c(b13, b14, b14, objArr113);
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cGreen2, i1116, packedPositionGroup2, 1411172903, false, (String) objArr113[0], new Class[]{String.class});
                                }
                                if (str.equals(((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2))) {
                                    int i1117 = TuitionPaymentFragmentbindingInflater1 + 105;
                                    d = i1117 % 128;
                                    int i1118 = i1117 % 2;
                                    i10 = 1;
                                } else {
                                    int i1119 = d;
                                    i26 = (i1119 ^ 115) + ((i1119 & 115) << 1);
                                    TuitionPaymentFragmentbindingInflater1 = i26 % 128;
                                    if (i26 % 2 != 0) {
                                        int i1210 = 5 / 4;
                                    }
                                    i10 = 0;
                                }
                            }
                            i11 = (i7 & (-11)) | ((~i7) & 10);
                            int i1211 = -i10;
                            int i1212 = TuitionPaymentFragmentbindingInflater1;
                            int i1213 = (i1212 & 81) + (i1212 | 81);
                            int i1214 = i1213 % 128;
                            d = i1214;
                            int i1215 = i1213 % 2;
                            i12 = ((i10 & i1211) | (i10 ^ i1211)) >> 31;
                            i13 = ((i1214 | 55) << 1) - (i1214 ^ 55);
                            i14 = i13 % 128;
                            TuitionPaymentFragmentbindingInflater1 = i14;
                            if (i13 % 2 != 0) {
                                Object obj2 = null;
                                obj2.hashCode();
                                throw null;
                            }
                            int i1216 = (~i12) & i7;
                            int i1217 = i12 & i11;
                            i15 = (i1217 & i1216) | (i1216 ^ i1217);
                            i16 = i14 + 95;
                            int i1218 = i16 % 128;
                            d = i1218;
                            if (i16 % 2 == 0) {
                                i17 = i2 & 76;
                            } else {
                                i17 = i2 & 32;
                            }
                            int i1219 = -i17;
                            i18 = ((i17 & i1219) | (i17 ^ i1219)) >> 31;
                            i19 = i1218 + 29;
                            TuitionPaymentFragmentbindingInflater1 = i19 % 128;
                            if (i19 % 2 != 0) {
                                int i139 = i15 & (~i18);
                                int i1310 = i18 & i7;
                                i6 = (i139 & i1310) | (i139 ^ i1310);
                                int i1311 = 89 / 0;
                            } else {
                                int i1312 = i15 & (~i18);
                                int i1313 = i18 & i7;
                                i6 = (i1312 & i1313) | (i1312 ^ i1313);
                            }
                            i20 = (i1218 ^ 55) + ((i1218 & 55) << 1);
                            TuitionPaymentFragmentbindingInflater1 = i20 % 128;
                            if (i20 % 2 != 0) {
                                int i1314 = 4 % 2;
                            }
                            i8 = i5;
                        }
                    } else if (Build.VERSION.SDK_INT == 30) {
                        int i1315 = TuitionPaymentFragmentbindingInflater1;
                        int i1316 = (i1315 & 3) + (i1315 | 3);
                        d = i1316 % 128;
                        int i1317 = i1316 % 2;
                        i6 = i;
                        i7 = i6;
                        i8 = i4;
                    } else {
                        try {
                            try {
                                if (Build.VERSION.SDK_INT > 33) {
                                    try {
                                        Object[] objArr114 = new Object[1];
                                        a(null, null, 127 - (~(-(-TextUtils.lastIndexOf("", '0', 0)))), new byte[]{-120, -124, -121, -118, -112, -104, -127, -115, -115, -103, -104, -118, -125, -105, -125, -106, -112, -112, -107, -119, -122, -126, -122, -107, -120, -119, -118, -107}, objArr114);
                                        try {
                                            Object[] objArr115 = {(String) objArr114[0]};
                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-52092531);
                                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                                char cResolveSize3 = (char) View.resolveSize(0, 0);
                                                int mode4 = 993 - View.MeasureSpec.getMode(0);
                                                int i612 = 8 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1));
                                                byte b15 = (byte) ($$b >>> 1);
                                                byte b16 = $$a[7];
                                                Object[] objArr116 = new Object[1];
                                                c(b15, b16, b16, objArr116);
                                                i5 = cResolveSize3;
                                                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(i5 == true ? (char) 1 : (char) 0, mode4, i612, 410748506, false, (String) objArr116[0], new Class[]{String.class});
                                            }
                                            long jLongValue3 = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr115)).longValue();
                                            long j13 = 1191383536;
                                            long j14 = 46;
                                            i5 = i4;
                                            long j15 = -1;
                                            long j16 = jLongValue3 ^ j15;
                                            long jMyUid3 = Process.myUid();
                                            long j17 = jMyUid3 ^ j15;
                                            long j18 = (j14 * j13) + (j14 * jLongValue3) + (((long) (-90)) * (j13 | ((j16 | j17) ^ j15))) + (((long) (-45)) * (((j16 | jMyUid3) ^ j15) | ((jLongValue3 | j13) ^ j15))) + (((long) 45) * ((j15 ^ (j17 | j13)) | j16 | (((j13 ^ j15) | jMyUid3) ^ j15))) + ((long) (-1392301773));
                                            int i613 = (int) (j18 >> 32);
                                            int i7110 = d;
                                            int i7111 = ((i7110 | 45) << 1) - (i7110 ^ 45);
                                            TuitionPaymentFragmentbindingInflater1 = i7111 % 128;
                                            int i7112 = i7111 % 2;
                                            int iNextInt3 = new Random().nextInt(550549894);
                                            int i7113 = i613 & (1496113770 + (((~((-1249952419) | iNextInt3)) | (-1607788467)) * (-756)) + (((~iNextInt3) | (-1249952419)) * 756));
                                            int i7114 = (int) j18;
                                            int elapsedCpuTime3 = (int) Process.getElapsedCpuTime();
                                            int i7115 = ~elapsedCpuTime3;
                                            int i7116 = i7114 & (2059660457 + ((elapsedCpuTime3 | (-2143289216)) * 988) + (((~((-2126369578) | i7115)) | 672223529) * (-1976)) + (((~(elapsedCpuTime3 | (-689143168))) | (-2143289216) | (~(689143167 | i7115))) * 988));
                                            i10 = (i7113 & i7116) | (i7113 ^ i7116);
                                            int i7117 = TuitionPaymentFragmentbindingInflater1;
                                            int i7118 = (i7117 ^ 67) + ((i7117 & 67) << 1);
                                            d = i7118 % 128;
                                            int i7119 = i7118 % 2;
                                            i7 = i;
                                        } catch (Throwable th2) {
                                            Throwable cause2 = th2.getCause();
                                            if (cause2 != null) {
                                                throw cause2;
                                            }
                                            throw th2;
                                        }
                                    } catch (Exception unused) {
                                        i5 = i4;
                                        i7 = i;
                                        i10 = 0;
                                    }
                                } else {
                                    i5 = i4;
                                    i21 = -ExpandableListView.getPackedPositionType(0L);
                                    iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = FileExtKt$readLinesSafe$1.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
                                    int i8110 = i21 * TypedValues.Custom.TYPE_DIMENSION;
                                    int i8111 = d;
                                    int i8112 = (i8111 ^ 117) + ((i8111 & 117) << 1);
                                    TuitionPaymentFragmentbindingInflater1 = i8112 % 128;
                                    int i8113 = i8112 % 2;
                                    int i8114 = ~i21;
                                    int i8115 = ~((i8114 & iTuitionPaymentFragmentspecialinlinedviewModeldefault3) | (i8114 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault3));
                                    int i8116 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault3;
                                    int i8117 = ~((i8116 & 127) | (i8116 ^ 127));
                                    i22 = ((i8110 - 114681) - (~(-(-(((i8115 & i8117) | (i8115 ^ i8117)) * (-1808)))))) - 1;
                                    int i8118 = ((i8111 | 69) << 1) - (i8111 ^ 69);
                                    int i8119 = i8118 % 128;
                                    TuitionPaymentFragmentbindingInflater1 = i8119;
                                    i23 = i8118 % 2;
                                    i24 = ~i21;
                                    if (i23 != 0) {
                                        int i9110 = ~((i24 & WorkInfo.STOP_REASON_FOREGROUND_SERVICE_TIMEOUT) | (i24 ^ WorkInfo.STOP_REASON_FOREGROUND_SERVICE_TIMEOUT) | iTuitionPaymentFragmentspecialinlinedviewModeldefault3);
                                        int i9111 = (~iTuitionPaymentFragmentspecialinlinedviewModeldefault3) | i21;
                                        int i9112 = ~((i9111 & 127) | (i9111 ^ 127));
                                        int i9113 = 903 - (~((i9110 & i9112) | (i9110 ^ i9112)));
                                        i25 = ((i22 | i9113) << 1) - (i22 ^ i9113);
                                    } else {
                                        int i9114 = (i24 & WorkInfo.STOP_REASON_FOREGROUND_SERVICE_TIMEOUT) | (i24 ^ WorkInfo.STOP_REASON_FOREGROUND_SERVICE_TIMEOUT);
                                        int i9115 = ~((i9114 & iTuitionPaymentFragmentspecialinlinedviewModeldefault3) | (i9114 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault3));
                                        int i9116 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault3;
                                        int i9117 = -(-((i9115 | (~((i9116 & i21) | (i9116 ^ i21) | 127))) * TypedValues.Custom.TYPE_BOOLEAN));
                                        i25 = (i22 ^ i9117) + ((i22 & i9117) << 1);
                                    }
                                    int i9118 = ~i21;
                                    int i9119 = ~((i9118 & 127) | (i9118 ^ 127));
                                    int i10110 = ~(((-128) ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault3) | ((-128) & iTuitionPaymentFragmentspecialinlinedviewModeldefault3));
                                    int i10111 = (i9119 & i10110) | (i9119 ^ i10110);
                                    int i10112 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault3;
                                    int i10113 = ~((i21 & i10112) | (i10112 ^ i21));
                                    int i10114 = i8119 + 7;
                                    d = i10114 % 128;
                                    int i10115 = i10114 % 2;
                                    int i10116 = i25 + (TypedValues.Custom.TYPE_BOOLEAN * ((i10113 & i10111) | (i10111 ^ i10113)));
                                    Object[] objArr117 = new Object[1];
                                    a(null, null, i10116, new byte[]{-102}, objArr117);
                                    str = (String) objArr117[0];
                                    int i10117 = -View.MeasureSpec.getMode(0);
                                    int i10118 = i10117 * 960;
                                    int i10119 = (i10118 & (-243459)) + (i10118 | (-243459));
                                    i7 = i;
                                    int i11110 = ~i7;
                                    int i11111 = ((~(((-128) & i11110) | ((-128) ^ i11110))) | (~((i10117 ^ i7) | (i10117 & i7)))) * 959;
                                    int i11112 = ((i10119 | i11111) << 1) - (i10119 ^ i11111);
                                    int i11113 = ~(((-128) & i7) | ((-128) ^ i7));
                                    int i11114 = ~((i10117 & i11110) | (i11110 ^ i10117));
                                    int i11115 = (((i11112 & 122752) + (122752 | i11112)) - (~(-(-(((i11114 & i11113) | (i11113 ^ i11114)) * 959))))) - 1;
                                    try {
                                        Object[] objArr118 = new Object[1];
                                        a(null, null, i11115, new byte[]{-118, -112, -104, -127, -115, -115, -103, -104, -118, -125, -121, -123, -124}, objArr118);
                                        try {
                                            objArr2 = new Object[]{(String) objArr118[0]};
                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1333629456);
                                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                                                char cGreen3 = (char) (Color.green(0) + 33602);
                                                int i11116 = 3086 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1));
                                                int packedPositionGroup3 = 26 - ExpandableListView.getPackedPositionGroup(0L);
                                                byte b17 = (byte) ($$b >>> 1);
                                                byte b18 = $$a[7];
                                                Object[] objArr119 = new Object[1];
                                                c(b17, b18, b18, objArr119);
                                                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cGreen3, i11116, packedPositionGroup3, 1411172903, false, (String) objArr119[0], new Class[]{String.class});
                                            }
                                            if (str.equals(((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2))) {
                                                int i11117 = TuitionPaymentFragmentbindingInflater1 + 105;
                                                d = i11117 % 128;
                                                int i11118 = i11117 % 2;
                                                i10 = 1;
                                            } else {
                                                int i11119 = d;
                                                i26 = (i11119 ^ 115) + ((i11119 & 115) << 1);
                                                TuitionPaymentFragmentbindingInflater1 = i26 % 128;
                                                if (i26 % 2 != 0) {
                                                    int i12110 = 5 / 4;
                                                }
                                                i10 = 0;
                                            }
                                        } catch (Throwable th3) {
                                            Throwable cause3 = th3.getCause();
                                            if (cause3 != null) {
                                                throw cause3;
                                            }
                                            throw th3;
                                        }
                                    } catch (Exception unused2) {
                                    }
                                }
                            } catch (Exception unused3) {
                            }
                        } catch (Exception unused4) {
                            i7 = i;
                            i5 = i4;
                        }
                        i11 = (i7 & (-11)) | ((~i7) & 10);
                        int i12111 = -i10;
                        int i12112 = TuitionPaymentFragmentbindingInflater1;
                        int i12113 = (i12112 & 81) + (i12112 | 81);
                        int i12114 = i12113 % 128;
                        d = i12114;
                        int i12115 = i12113 % 2;
                        i12 = ((i10 & i12111) | (i10 ^ i12111)) >> 31;
                        i13 = ((i12114 | 55) << 1) - (i12114 ^ 55);
                        i14 = i13 % 128;
                        TuitionPaymentFragmentbindingInflater1 = i14;
                        if (i13 % 2 != 0) {
                            Object obj3 = null;
                            obj3.hashCode();
                            throw null;
                        }
                        int i12116 = (~i12) & i7;
                        int i12117 = i12 & i11;
                        i15 = (i12117 & i12116) | (i12116 ^ i12117);
                        i16 = i14 + 95;
                        int i12118 = i16 % 128;
                        d = i12118;
                        if (i16 % 2 == 0) {
                            i17 = i2 & 76;
                        } else {
                            i17 = i2 & 32;
                        }
                        int i12119 = -i17;
                        i18 = ((i17 & i12119) | (i17 ^ i12119)) >> 31;
                        i19 = i12118 + 29;
                        TuitionPaymentFragmentbindingInflater1 = i19 % 128;
                        if (i19 % 2 != 0) {
                            int i1318 = i15 & (~i18);
                            int i1319 = i18 & i7;
                            i6 = (i1318 & i1319) | (i1318 ^ i1319);
                            int i13110 = 89 / 0;
                        } else {
                            int i13111 = i15 & (~i18);
                            int i13112 = i18 & i7;
                            i6 = (i13111 & i13112) | (i13111 ^ i13112);
                        }
                        i20 = (i12118 ^ 55) + ((i12118 & 55) << 1);
                        TuitionPaymentFragmentbindingInflater1 = i20 % 128;
                        if (i20 % 2 != 0) {
                            int i13113 = 4 % 2;
                        }
                        i8 = i5;
                    }
                    int i140 = (~i8) & i7;
                    int i141 = ~i7;
                    int i142 = i140 | (i8 & i141);
                    int i143 = -i142;
                    int i144 = ((i142 & i143) | (i142 ^ i143)) >> 31;
                    int i145 = TuitionPaymentFragmentbindingInflater1;
                    int i146 = ((i145 | 121) << 1) - (i145 ^ 121);
                    d = i146 % 128;
                    if (i146 % 2 == 0) {
                        int i147 = i6 & (~i144);
                        int i148 = i8 & i144;
                        i9 = (i147 & i148) | (i147 ^ i148);
                        objArr = new Object[3];
                        objArr[0] = new int[0];
                        objArr[0] = new int[1];
                        objArr[4] = new int[1];
                    } else {
                        int i149 = i6 & (~i144);
                        int i150 = i8 & i144;
                        i9 = (i149 & i150) | (i149 ^ i150);
                        objArr = new Object[4];
                        objArr[0] = new int[1];
                        objArr[1] = new int[1];
                        objArr[2] = new int[1];
                    }
                    int i151 = ((~i9) & i7) | (i141 & i9);
                    int i152 = -i151;
                    ((int[]) objArr[0])[0] = i7;
                    ((int[]) objArr[2])[0] = i9;
                    objArr[3] = null;
                    int i153 = ((i145 | 25) << 1) - (i145 ^ 25);
                    d = i153 % 128;
                    int i154 = i153 % 2;
                    int startElapsedRealtime = (int) Process.getStartElapsedRealtime();
                    int i155 = 1451768000 + (((~(startElapsedRealtime | 716268639)) | 675958410) * (-668)) + ((716268639 | (~(675958410 | startElapsedRealtime))) * 1336) + ((startElapsedRealtime | 721120991) * 668) + ((((i151 & i152) | (i151 ^ i152)) >> 31) & 16);
                    int iTuitionPaymentFragmentspecialinlinedviewModeldefault4 = FileExtKt$readLinesSafe$1.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
                    int i156 = i155 * (-716);
                    int i157 = -(-(i3 * 1435));
                    int i158 = ((i156 | i157) << 1) - (i156 ^ i157);
                    int i159 = TuitionPaymentFragmentbindingInflater1 + 83;
                    d = i159 % 128;
                    int i160 = i159 % 2;
                    int i161 = ~i155;
                    int i162 = (i158 - (~(-(-((-1434) * ((i3 ^ i161) | (i3 & i161))))))) - 1;
                    int i163 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault4;
                    int i164 = ~((i163 & i3) | (i163 ^ i3));
                    int i165 = (i155 ^ i3) | (i155 & i3);
                    int i166 = ~i165;
                    int i167 = (i164 & i166) | (i164 ^ i166);
                    int i168 = ~i3;
                    int i169 = (i161 ^ i168) | (i161 & i168);
                    int i170 = ~((i169 & iTuitionPaymentFragmentspecialinlinedviewModeldefault4) | (i169 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault4));
                    int i171 = ((i167 & i170) | (i167 ^ i170)) * 717;
                    int i172 = (i162 & i171) + (i171 | i162);
                    int i173 = i161 | i168;
                    int i174 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault4;
                    int i175 = ~((i173 & i174) | (i173 ^ i174));
                    int i176 = ~i165;
                    int i177 = (i175 & i176) | (i175 ^ i176);
                    int i178 = ~((iTuitionPaymentFragmentspecialinlinedviewModeldefault4 & i3) | (i3 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault4));
                    int i179 = (i172 - (~(((i178 & i177) | (i177 ^ i178)) * 717))) - 1;
                    int i180 = (i179 << 13) ^ i179;
                    int i181 = i180 >>> 17;
                    int i182 = (i180 | i181) & (~(i180 & i181));
                    int i183 = i182 << 5;
                    ((int[]) objArr[1])[0] = ((~i182) & i183) | ((~i183) & i182);
                    return objArr;
                } catch (Throwable th4) {
                    Throwable cause4 = th4.getCause();
                    if (cause4 != null) {
                        throw cause4;
                    }
                    throw th4;
                }
            }

            /* JADX WARN: Code duplicated, block: B:10:0x0023  */
            /* JADX WARN: Code duplicated, block: B:8:0x001d  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x0028). Please report as a decompilation issue!!! */
            /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0023
                	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                */
            private static java.lang.String $$e(short r6, byte r7, int r8) {
                /*
                    byte[] r0 = defpackage.g0ExternalSyntheticLambda0.$$c
                    int r6 = r6 + 67
                    int r7 = r7 * 4
                    int r1 = r7 + 1
                    int r8 = r8 * 2
                    int r8 = 4 - r8
                    byte[] r1 = new byte[r1]
                    r2 = 0
                    if (r0 != 0) goto L15
                    r6 = r7
                    r3 = r8
                    r4 = r2
                    goto L28
                L15:
                    r3 = r2
                L16:
                    byte r4 = (byte) r6
                    r1[r3] = r4
                    int r4 = r3 + 1
                    if (r3 != r7) goto L23
                    java.lang.String r6 = new java.lang.String
                    r6.<init>(r1, r2)
                    return r6
                L23:
                    r3 = r0[r8]
                    r5 = r3
                    r3 = r8
                    r8 = r5
                L28:
                    int r8 = -r8
                    int r6 = r6 + r8
                    int r8 = r3 + 1
                    r3 = r4
                    goto L16
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.g0ExternalSyntheticLambda0.$$e(short, byte, int):java.lang.String");
            }
        };
        ZoomGestureDetectorZoomEventEnd zoomGestureDetectorZoomEventEnd4 = ZoomGestureDetectorZoomEventEnd.INSTANCE;
        Kind kind4 = Kind.Single;
        ZoomGestureDetectorZoomEventMove<?> zoomGestureDetectorZoomEventMove4 = new ZoomGestureDetectorZoomEventMove<>(null, null, Reflection.getOrCreateKotlinClass(IntentSenderRequestBuilder.class));
        zoomGestureDetectorZoomEventMove4.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = function5;
        zoomGestureDetectorZoomEventMove4.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = kind4;
        islenovotablet.TuitionPaymentFragmentbindingInflater1(zoomGestureDetectorZoomEventMove4, new ZoomGestureDetectorgestureDetector1(false, false));
        islenovotablet.TuitionPaymentFragmentspecialinlinedviewModeldefault1.add(zoomGestureDetectorZoomEventMove4);
        Function2<? super FileTransformFactory, ? super CoordinateTransform, ? extends T> function6 = new Function2() { // from class: h0
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return isMitigated.TuitionPaymentFragmentspecialinlinedviewModeldefault3((FileTransformFactory) obj, (CoordinateTransform) obj2);
            }
        };
        ZoomGestureDetectorZoomEventEnd zoomGestureDetectorZoomEventEnd5 = ZoomGestureDetectorZoomEventEnd.INSTANCE;
        Kind kind5 = Kind.Factory;
        ZoomGestureDetectorZoomEventMove<?> zoomGestureDetectorZoomEventMove5 = new ZoomGestureDetectorZoomEventMove<>(null, null, Reflection.getOrCreateKotlinClass(ApiCompatApi29Impl.class));
        zoomGestureDetectorZoomEventMove5.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = function6;
        zoomGestureDetectorZoomEventMove5.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = kind5;
        islenovotablet.TuitionPaymentFragmentbindingInflater1(zoomGestureDetectorZoomEventMove5, new ZoomGestureDetectorgestureDetector1(false, false, 1, null));
        islenovotablet.TuitionPaymentFragmentspecialinlinedviewModeldefault1.add(zoomGestureDetectorZoomEventMove5);
        ZoomGestureDetectorZoomEventBegin zoomGestureDetectorZoomEventBegin = zoomGestureDetectorZoomEventMove5.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        Boolean bool = Boolean.TRUE;
        Map<String, Object> map = zoomGestureDetectorZoomEventBegin.TuitionPaymentFragmentbindingInflater1;
        if (bool == null) {
            throw new TypeCastException("null cannot be cast to non-null type kotlin.Any");
        }
        map.put("isViewModel", bool);
        return Unit.INSTANCE;
    }
}
