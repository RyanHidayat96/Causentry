package defpackage;

import android.content.Context;
import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Build;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.view.ViewCompat;
import com.datadog.android.core.internal.persistence.file.FileExtKt$readLinesSafe$1;
import com.koushikdutta.async.AsyncServer;
import com.koushikdutta.async.http.Protocol;
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Locale;
import java.util.Set;
import render.TuitionPaymentFragmentspecialinlinedviewModeldefault3.AnonymousClass5;

/* JADX INFO: loaded from: classes4.dex */
public final class Operation extends unregisterOutputSurface {
    @Override // defpackage.unregisterOutputSurface, defpackage.OpenGlRenderer
    public final boolean b(final OpenGlRenderer.b bVar) {
        executeSafely executesafely;
        final getExif getexif;
        Protocol protocolTuitionPaymentFragmentbindingInflater1 = Protocol.TuitionPaymentFragmentbindingInflater1(bVar.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
        if (protocolTuitionPaymentFragmentbindingInflater1 != null && protocolTuitionPaymentFragmentbindingInflater1 != Protocol.HTTP_1_0 && protocolTuitionPaymentFragmentbindingInflater1 != Protocol.HTTP_1_1) {
            return super.b(bVar);
        }
        Node node = bVar.f189a;
        ShaderProvider shaderProvider = bVar.f189a.TuitionPaymentFragmentbindingInflater1;
        if (shaderProvider != null) {
            if (shaderProvider.b() >= 0) {
                node.g.b("Content-Length", String.valueOf(shaderProvider.b()));
                bVar.d.b(bVar.asBinder);
            } else if ("close".equals(node.g.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentbindingInflater1("Connection".toLowerCase(Locale.US)))) {
                bVar.d.b(bVar.asBinder);
            } else {
                node.g.b("Transfer-Encoding", "Chunked");
                bVar.d.b(new addTransformationUpdateListener(bVar.asBinder));
            }
        }
        String strTuitionPaymentFragmentspecialinlinedviewModeldefault2 = node.g.TuitionPaymentFragmentspecialinlinedviewModeldefault2(new Object() { // from class: Node.5
            private static final byte[] $$c = {88, 99, -94, -58};
            private static final int $$d = 54;
            private static int $10 = 0;
            private static int $11 = 1;
            private static final byte[] $$a = {41, 2, 45, -60, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -56, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -55, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, -7, 18, 16, 1, 16, 16, 4, -19, 48, 3, 17, 0, 30, -4, 24, -54};
            private static final int $$b = 110;
            private static int TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 0;

            /* JADX INFO: renamed from: a */
            private static int f187a = 1;
            private static long b = -6377398940819159759L;
            private static int TuitionPaymentFragmentspecialinlinedviewModeldefault1 = -23647866;
            private static char TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 34097;

            private static void d(short s, int i, short s2, Object[] objArr) {
                int i2 = s + 4;
                int i3 = 98 - (i * 14);
                byte[] bArr = $$a;
                byte[] bArr2 = new byte[53 - s2];
                int i4 = 52 - s2;
                int i5 = -1;
                if (bArr == null) {
                    i2++;
                    i3 = (i4 + i3) - 11;
                }
                while (true) {
                    i5++;
                    bArr2[i5] = (byte) i3;
                    if (i5 == i4) {
                        objArr[0] = new String(bArr2, 0);
                        return;
                    } else {
                        i2++;
                        i3 = (i3 + bArr[i2]) - 11;
                    }
                }
            }

            AnonymousClass5() {
            }

            public String toString() {
                int i = 2 % 2;
                if (Node.this.f186a != null) {
                    int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 85;
                    f187a = i2 % 128;
                    int i3 = i2 % 2;
                    return String.format(Locale.ENGLISH, "%s %s %s", Node.this.asBinder, Node.this.INotificationSideChannel, Node.this.notify);
                }
                String encodedPath = Node.this.INotificationSideChannel.getEncodedPath();
                if (encodedPath == null || encodedPath.length() == 0) {
                    int i4 = f187a + 87;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
                    if (i4 % 2 != 0) {
                        int i5 = 3 / 4;
                    }
                    encodedPath = "/";
                }
                String encodedQuery = Node.this.INotificationSideChannel.getEncodedQuery();
                if (encodedQuery != null) {
                    int i6 = f187a + 7;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i6 % 128;
                    if (i6 % 2 != 0) {
                        encodedQuery.length();
                        throw null;
                    }
                    if (encodedQuery.length() != 0) {
                        StringBuilder sb = new StringBuilder();
                        sb.append(encodedPath);
                        sb.append("?");
                        sb.append(encodedQuery);
                        encodedPath = sb.toString();
                        int i7 = f187a + 25;
                        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i7 % 128;
                        int i8 = i7 % 2;
                    }
                }
                return String.format(Locale.ENGLISH, "%s %s %s", Node.this.asBinder, encodedPath, Node.this.notify);
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
                    int i4 = $10 + 95;
                    $11 = i4 % 128;
                    int i5 = i4 % i2;
                    try {
                        Object[] objArr2 = {sessionProcessor};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1033601528);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                            byte b2 = (byte) 0;
                            byte b3 = (byte) (b2 + 2);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (View.MeasureSpec.makeMeasureSpec(0, 0) + 8328), 1235 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), 35 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), -653973969, false, $$e(b2, b3, (byte) (b3 - 2)), new Class[]{Object.class});
                        }
                        int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).intValue();
                        try {
                            Object[] objArr3 = {sessionProcessor};
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1120586870);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                byte b4 = (byte) 0;
                                byte b5 = b4;
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (ViewConfiguration.getKeyRepeatTimeout() >> 16), (-16774452) - Color.rgb(0, 0, 0), (ViewConfiguration.getFadingEdgeLength() >> 16) + 14, 1504416861, false, $$e(b4, b5, b5), new Class[]{Object.class});
                            }
                            int iIntValue2 = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).intValue();
                            try {
                                Object[] objArr4 = {sessionProcessor, Integer.valueOf(cArr4[sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2 % 4] * 32718), Integer.valueOf(cArr5[iIntValue])};
                                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(811618268);
                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (43325 - Color.red(0)), 252 - TextUtils.lastIndexOf("", '0', 0, 0), View.getDefaultSize(0, 0) + 22, -721491957, false, "j", new Class[]{Object.class, Integer.TYPE, Integer.TYPE});
                                }
                                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
                                try {
                                    Object[] objArr5 = {Integer.valueOf(cArr4[iIntValue2] * 32718), Integer.valueOf(cArr5[iIntValue])};
                                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1821841887);
                                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                                        byte b6 = (byte) 0;
                                        byte b7 = (byte) (b6 + 1);
                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (65200 - KeyEvent.normalizeMetaState(0)), TextUtils.indexOf((CharSequence) "", '0', 0) + 2892, 17 - View.getDefaultSize(0, 0), 2012627446, false, $$e(b6, b7, (byte) (b7 - 1)), new Class[]{Integer.TYPE, Integer.TYPE});
                                    }
                                    cArr5[iIntValue2] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).charValue();
                                    cArr4[iIntValue2] = sessionProcessor.b;
                                    cArr6[sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2] = (char) (((((long) (cArr3[sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2] ^ cArr4[iIntValue2])) ^ (b ^ (-6377398940819159759L))) ^ ((long) ((int) (((long) TuitionPaymentFragmentspecialinlinedviewModeldefault1) ^ (-6377398940819159759L))))) ^ ((long) ((char) (((long) TuitionPaymentFragmentspecialinlinedviewModeldefault3) ^ (-6377398940819159759L)))));
                                    sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2++;
                                    int i6 = $11 + 19;
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
            }

            /* JADX WARN: Code duplicated, block: B:30:0x02b8  */
            /* JADX WARN: Code duplicated, block: B:32:0x02be  */
            /* JADX WARN: Code duplicated, block: B:34:0x02ce  */
            /* JADX WARN: Code duplicated, block: B:35:0x02d1  */
            /* JADX WARN: Code duplicated, block: B:37:0x02d3  */
            /* JADX WARN: Code duplicated, block: B:40:0x02db A[Catch: Exception -> 0x05c1, TRY_LEAVE, TryCatch #4 {Exception -> 0x05c1, blocks: (B:38:0x02d5, B:40:0x02db, B:47:0x03e9, B:49:0x03ef, B:50:0x03f0, B:51:0x03f1, B:53:0x0454, B:57:0x04fc, B:59:0x0528, B:64:0x05b0, B:68:0x05b9, B:70:0x05bf, B:71:0x05c0, B:58:0x0508, B:60:0x0558, B:62:0x0565, B:63:0x05a9, B:41:0x030e, B:43:0x031b, B:44:0x035d), top: B:92:0x02d5, inners: #0, #1 }] */
            /* JADX WARN: Code duplicated, block: B:43:0x031b A[Catch: all -> 0x03e8, TryCatch #1 {all -> 0x03e8, blocks: (B:41:0x030e, B:43:0x031b, B:44:0x035d), top: B:86:0x030e, outer: #4 }] */
            /* JADX WARN: Code duplicated, block: B:51:0x03f1 A[Catch: Exception -> 0x05c1, TRY_LEAVE, TryCatch #4 {Exception -> 0x05c1, blocks: (B:38:0x02d5, B:40:0x02db, B:47:0x03e9, B:49:0x03ef, B:50:0x03f0, B:51:0x03f1, B:53:0x0454, B:57:0x04fc, B:59:0x0528, B:64:0x05b0, B:68:0x05b9, B:70:0x05bf, B:71:0x05c0, B:58:0x0508, B:60:0x0558, B:62:0x0565, B:63:0x05a9, B:41:0x030e, B:43:0x031b, B:44:0x035d), top: B:92:0x02d5, inners: #0, #1 }] */
            /* JADX WARN: Code duplicated, block: B:56:0x04ed  */
            /* JADX WARN: Code duplicated, block: B:58:0x0508 A[Catch: Exception -> 0x05c1, TryCatch #4 {Exception -> 0x05c1, blocks: (B:38:0x02d5, B:40:0x02db, B:47:0x03e9, B:49:0x03ef, B:50:0x03f0, B:51:0x03f1, B:53:0x0454, B:57:0x04fc, B:59:0x0528, B:64:0x05b0, B:68:0x05b9, B:70:0x05bf, B:71:0x05c0, B:58:0x0508, B:60:0x0558, B:62:0x0565, B:63:0x05a9, B:41:0x030e, B:43:0x031b, B:44:0x035d), top: B:92:0x02d5, inners: #0, #1 }] */
            /* JADX WARN: Code duplicated, block: B:62:0x0565 A[Catch: all -> 0x05b8, TryCatch #0 {all -> 0x05b8, blocks: (B:60:0x0558, B:62:0x0565, B:63:0x05a9), top: B:84:0x0558, outer: #4 }] */
            /* JADX WARN: Code duplicated, block: B:66:0x05b6  */
            /* JADX WARN: Code duplicated, block: B:72:0x05c1  */
            public static Object[] TuitionPaymentFragmentspecialinlinedviewModeldefault3(Context context, int i, int i2, int i3) throws Throwable {
                int i4;
                int i5;
                int i6;
                int i7;
                String str;
                int scrollBarSize;
                int iTuitionPaymentFragmentspecialinlinedviewModeldefault3;
                int i8;
                int i9;
                int i10;
                Object[] objArr;
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3;
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4;
                int i11 = 2 % 2;
                int i12 = f187a;
                int i13 = (i12 ^ 63) + ((i12 & 63) << 1);
                TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i13 % 128;
                Object obj = null;
                if (i13 % 2 != 0) {
                    obj.hashCode();
                    throw null;
                }
                if (context != null) {
                    int i14 = (i12 & 31) + (i12 | 31);
                    TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i14 % 128;
                    int i15 = i14 % 2;
                    try {
                        char cIndexOf = (char) TextUtils.indexOf("", "", 0);
                        int i16 = (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1));
                        Object[] objArr2 = new Object[1];
                        c(new char[]{0, 0, 0, 0}, new char[]{52010, 62597, 54569, 19054}, cIndexOf, (i16 & 703890890) + (i16 | 703890890), new char[]{37331, 61851, 261, 33109, 52942, 11690, 62461, 62444, 41580, 25944, 59318, 64046, 38291, 23946, 47478, 16149, 44382, 50889, 23570, 5301, 60313, 23979, 9533}, objArr2);
                        Class<?> cls = Class.forName((String) objArr2[0]);
                        Object[] objArr3 = new Object[1];
                        c(new char[]{0, 0, 0, 0}, new char[]{56649, 7962, 26453, 63790}, (char) (11878 - (~(-(Process.myPid() >> 22)))), TextUtils.getOffsetAfter("", 0), new char[]{22203, 54283, 21159, 36688, 63822, 57529, 64366, 55341, 60340, 6645, 42462, 62069, 7971, 19549, 8373, 7096, 26944, 5606}, objArr3);
                        Object objInvoke = cls.getMethod((String) objArr3[0], null).invoke(context, null);
                        int i17 = -Color.rgb(0, 0, 0);
                        int i18 = ~i17;
                        int i19 = ~i;
                        int i20 = ~(i18 | i19);
                        int i21 = ~((16777215 ^ i19) | (16777215 & i19));
                        int i22 = ((i17 * 868) - 1677721600) + (((i20 ^ i21) | (i21 & i20)) * (-867));
                        int i23 = ~i17;
                        int i24 = ~(i23 | ViewCompat.MEASURED_SIZE_MASK);
                        int i25 = ~((i18 ^ i) | (i18 & i));
                        int i26 = (i24 ^ i25) | (i25 & i24);
                        int i27 = ~(16777215 | i);
                        int i28 = -(-(((i26 ^ i27) | (i26 & i27)) * (-1734)));
                        int i29 = (i22 & i28) + (i28 | i22);
                        int i30 = (i23 ^ ViewCompat.MEASURED_SIZE_MASK) | (i23 & ViewCompat.MEASURED_SIZE_MASK);
                        int i31 = ~((i30 & i19) | (i30 ^ i19));
                        int i32 = (-16777216) | i18;
                        int i33 = ~((i32 & i) | (i32 ^ i));
                        int i34 = (16777215 & i17) | (16777215 ^ i17);
                        int i35 = ((i31 & i33) | (i31 ^ i33) | (~((i34 & i) | (i34 ^ i)))) * 867;
                        Object[] objArr4 = new Object[1];
                        c(new char[]{0, 0, 0, 0}, new char[]{21722, 45331, 49661, 51675}, (char) ((i29 ^ i35) + ((i35 & i29) << 1)), Color.argb(0, 0, 0, 0), new char[]{15134, 2990, 35608, 21464, 54254, 46369, 54173, 54861, 21597, 3340, 57405, 7203, 24166, 12598, 45466, 38143, 58047, 57514, 52108, 20117, 63670, 5199, 29443, 62290, 28225, 19822, 20152, 58130, 9899, 47848, 44625, 34658, 61832, 60575}, objArr4);
                        Class<?> cls2 = Class.forName((String) objArr4[0]);
                        int size = View.MeasureSpec.getSize(0);
                        int iTuitionPaymentFragmentspecialinlinedviewModeldefault4 = FileExtKt$readLinesSafe$1.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
                        int i36 = size * 284;
                        int i37 = ((i36 | (-11237136)) << 1) - (i36 ^ (-11237136));
                        int i38 = ~size;
                        int i39 = ~(39848 | i38);
                        int i40 = ~((i38 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault4) | (i38 & iTuitionPaymentFragmentspecialinlinedviewModeldefault4));
                        int i41 = i37 + (((i39 ^ i40) | (i40 & i39)) * (-283)) + ((~((size & (-39849)) | ((-39849) ^ size))) * 283);
                        int i42 = i38 | (-39849);
                        char c = (char) (i41 + ((~((i42 & iTuitionPaymentFragmentspecialinlinedviewModeldefault4) | (i42 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault4))) * 283));
                        int i43 = -Drawable.resolveOpacity(0, 0);
                        Object[] objArr5 = new Object[1];
                        c(new char[]{0, 0, 0, 0}, new char[]{54630, 28508, 43017, 39323}, c, ((i43 | 158293205) << 1) - (i43 ^ 158293205), new char[]{45856, 26763, 34220, 9896, 62082}, objArr5);
                        int i44 = cls2.getField((String) objArr5[0]).getInt(objInvoke) & 2;
                        int i45 = (i44 | (-i44)) >> 31;
                        int i46 = (~i45) & i;
                        int i47 = i45 & ((i & (-2)) | (i19 & 1));
                        int i48 = (i47 & i46) | (i46 ^ i47);
                        int i49 = f187a;
                        int i50 = (i49 ^ 49) + ((i49 & 49) << 1);
                        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i50 % 128;
                        int i51 = i50 % 2;
                        i4 = i48;
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
                        char c2 = (char) ((PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 16949);
                        int offsetAfter = 2739 - TextUtils.getOffsetAfter("", 0);
                        int iResolveOpacity = Drawable.resolveOpacity(0, 0) + 13;
                        byte[] bArr = $$a;
                        byte b2 = bArr[7];
                        Object[] objArr6 = new Object[1];
                        d(b2, bArr[132], b2, objArr6);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(c2, offsetAfter, iResolveOpacity, 1501733736, false, (String) objArr6[0], new Class[0]);
                    }
                    Set set = (Set) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, null);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-431688923);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        char mirror = (char) (16997 - AndroidCharacter.getMirror('0'));
                        int iBlue = 2739 - Color.blue(0);
                        int maximumDrawingCacheSize = (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 13;
                        byte[] bArr2 = $$a;
                        Object[] objArr7 = new Object[1];
                        d((short) 52, bArr2[132], bArr2[7], objArr7);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(mirror, iBlue, maximumDrawingCacheSize, 47863026, false, (String) objArr7[0], null);
                    }
                    if (!set.contains(((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).get(null))) {
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1056710067);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                            char capsMode = (char) (TextUtils.getCapsMode("", 0, 0) + 16949);
                            int iAlpha = 2739 - Color.alpha(0);
                            int iNormalizeMetaState = 13 - KeyEvent.normalizeMetaState(0);
                            short s = (short) ($$b & TypedValues.PositionType.TYPE_PERCENT_HEIGHT);
                            byte b3 = $$a[132];
                            Object[] objArr8 = new Object[1];
                            d(s, b3, (byte) (b3 | 14), objArr8);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(capsMode, iAlpha, iNormalizeMetaState, 631063962, false, (String) objArr8[0], null);
                        }
                        if (!set.contains(((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).get(null))) {
                            if (Build.VERSION.SDK_INT > 33) {
                                int i52 = -MotionEvent.axisFromString("");
                                Object[] objArr9 = new Object[1];
                                c(new char[]{0, 0, 0, 0}, new char[]{10558, 57630, 9412, 34502}, (char) (((i52 | 50723) << 1) - (i52 ^ 50723)), ViewConfiguration.getTapTimeout() >> 16, new char[]{26834, 5917, 63409, 55098, 60712, 8124, 52223, 54988, 8842, 33350, 4640, 40093, 32807, 30088, 27977, 32788, 15365, 45271, 59586, 29637, 1826, 36500, 51093, 20062, 25415, 13434, 26867, 16071}, objArr9);
                                Object[] objArr10 = {(String) objArr9[0]};
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-52092531);
                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                    char cKeyCodeFromString = (char) KeyEvent.keyCodeFromString("");
                                    int i53 = (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 992;
                                    int longPressTimeout = (ViewConfiguration.getLongPressTimeout() >> 16) + 8;
                                    byte b4 = $$a[7];
                                    Object[] objArr11 = new Object[1];
                                    d((short) 141, b4, (byte) (b4 | 52), objArr11);
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cKeyCodeFromString, i53, longPressTimeout, 410748506, false, (String) objArr11[0], new Class[]{String.class});
                                }
                                long jLongValue = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr10)).longValue();
                                long j = 931040814;
                                long j2 = -115;
                                long j3 = i;
                                long j4 = -1;
                                long j5 = (j2 * j) + (j2 * jLongValue) + (((long) (-116)) * ((((j3 ^ j4) | j) | jLongValue) ^ j4));
                                long j6 = 116;
                                long j7 = jLongValue ^ j4;
                                long j8 = j5 + ((j | j3) * j6) + (j6 * (((j7 | j3) ^ j4) | (((j ^ j4) | j7) ^ j4))) + ((long) (-1131959051));
                                int i54 = ~i;
                                i7 = (((int) (j8 >> 32)) & (((((~((-1265845742) | i54)) | (~(171380669 | i))) * 959) - 182756455) + (((~((-1265845742) | i)) | (~(171380669 | i54))) * 959))) | (((int) j8) & ((-635053948) + ((1784643567 | i) * (-627)) + (((~((-173741510) | i)) | (-1610967920)) * (-627)) + (((~(173741509 | i54)) | (~((-1610967920) | i))) * 627)));
                            } else {
                                char[] cArr = {0, 0, 0, 0};
                                char[] cArr2 = {56043, 25578, 19724, 8119};
                                int packedPositionChild = ExpandableListView.getPackedPositionChild(0L);
                                int i55 = packedPositionChild * (-103);
                                int i56 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                                int i57 = (i56 & 51) + (i56 | 51);
                                f187a = i57 % 128;
                                int i58 = i57 % 2;
                                int i59 = ((i55 | (-4833378)) << 1) - (i55 ^ (-4833378));
                                int i60 = ~packedPositionChild;
                                int i61 = ~((i60 & (-46927)) | (i60 ^ (-46927)));
                                int i62 = ~(((-46927) & i) | ((-46927) ^ i));
                                int i63 = ((i61 & i62) | (i61 ^ i62)) * 104;
                                int i64 = (i59 ^ i63) + ((i63 & i59) << 1);
                                int i65 = ~i;
                                int i66 = -(-((~((i65 & packedPositionChild) | (i65 ^ packedPositionChild) | 46926)) * (-104)));
                                char c3 = (char) ((((i64 ^ i66) + ((i66 & i64) << 1)) - (~(-(-(((packedPositionChild & i) | (packedPositionChild ^ i)) * 104))))) - 1);
                                int tapTimeout = ViewConfiguration.getTapTimeout() >> 16;
                                int iTuitionPaymentFragmentspecialinlinedviewModeldefault5 = FileExtKt$readLinesSafe$1.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
                                int i67 = tapTimeout * 866;
                                int i68 = ((i67 | 784818240) << 1) - (i67 ^ 784818240);
                                int i69 = ~((~tapTimeout) | (~iTuitionPaymentFragmentspecialinlinedviewModeldefault5));
                                int i70 = -(-(((i69 & (-207874779)) | ((-207874779) ^ i69)) * (-865)));
                                int i71 = (i68 ^ i70) + ((i70 & i68) << 1);
                                int i72 = (~((tapTimeout ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault5) | (tapTimeout & iTuitionPaymentFragmentspecialinlinedviewModeldefault5))) * 865;
                                int i73 = ((i71 | i72) << 1) - (i72 ^ i71);
                                int i74 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault5;
                                int i75 = ~(((-207874779) & i74) | ((-207874779) ^ i74));
                                int i76 = ~((tapTimeout & i74) | (i74 ^ tapTimeout));
                                int i77 = -(-(((i76 & i75) | (i75 ^ i76)) * 865));
                                Object[] objArr12 = new Object[1];
                                c(cArr, cArr2, c3, (i73 ^ i77) + ((i77 & i73) << 1), new char[]{7082}, objArr12);
                                str = (String) objArr12[0];
                                char[] cArr3 = {0, 0, 0, 0};
                                char[] cArr4 = {52616, 3534, 63193, 32942};
                                char c4 = (char) (44791 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)));
                                scrollBarSize = ViewConfiguration.getScrollBarSize() >> 8;
                                iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = FileExtKt$readLinesSafe$1.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
                                int i78 = f187a;
                                i8 = ((i78 | 51) << 1) - (i78 ^ 51);
                                TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i8 % 128;
                                if (i8 % 2 != 0) {
                                    i9 = ((217 << scrollBarSize) >> (-1251520043)) % ((~((scrollBarSize ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault3) | (scrollBarSize & iTuitionPaymentFragmentspecialinlinedviewModeldefault3))) + 216);
                                    int i79 = 653406514 | scrollBarSize;
                                    int i80 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault3;
                                    i10 = (i79 ^ i80) | (i79 & i80);
                                } else {
                                    int i81 = scrollBarSize * 217;
                                    int i82 = (i81 & (-1251520043)) + (i81 | (-1251520043));
                                    int i83 = (~(scrollBarSize | iTuitionPaymentFragmentspecialinlinedviewModeldefault3)) * 216;
                                    i9 = ((i82 | i83) << 1) - (i83 ^ i82);
                                    i10 = (653406514 & scrollBarSize) | (scrollBarSize ^ 653406514) | (~iTuitionPaymentFragmentspecialinlinedviewModeldefault3);
                                }
                                int i84 = (-216) * i10;
                                int i85 = ~(scrollBarSize | (~iTuitionPaymentFragmentspecialinlinedviewModeldefault3));
                                Object[] objArr13 = new Object[1];
                                c(cArr3, cArr4, c4, ((((i9 | i84) << 1) - (i9 ^ i84)) - (~(-(-(((i85 & (-653406515)) | ((-653406515) ^ i85)) * 216))))) - 1, new char[]{15640, 14398, 23071, 65119, 7284, 12652, 63734, 65032, 34050, 48325, 58687, 48956, 8574}, objArr13);
                                objArr = new Object[]{(String) objArr13[0]};
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1333629456);
                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                                    char cIndexOf2 = (char) (TextUtils.indexOf("", "", 0) + 33602);
                                    int doubleTapTimeout = (ViewConfiguration.getDoubleTapTimeout() >> 16) + 3085;
                                    int threadPriority = 26 - ((Process.getThreadPriority(0) + 20) >> 6);
                                    byte b5 = $$a[7];
                                    Object[] objArr14 = new Object[1];
                                    d((short) 141, b5, (byte) (b5 | 52), objArr14);
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cIndexOf2, doubleTapTimeout, threadPriority, 1411172903, false, (String) objArr14[0], new Class[]{String.class});
                                }
                                if (str.equals(((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr))) {
                                    i7 = 1;
                                } else {
                                    i7 = 0;
                                }
                            }
                            int i86 = (i & (-11)) | ((~i) & 10);
                            int i87 = (i7 | (-i7)) >> 31;
                            int i88 = (~i87) & i;
                            int i89 = f187a;
                            int i90 = (i89 & 83) + (i89 | 83);
                            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i90 % 128;
                            int i91 = i90 % 2;
                            int i92 = i87 & i86;
                            int i93 = (i92 & i88) | (i88 ^ i92);
                            int i94 = i2 & 32;
                            int i95 = i89 + 71;
                            int i96 = i95 % 128;
                            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i96;
                            int i97 = i95 % 2;
                            int i98 = -i94;
                            int i99 = ((i94 & i98) | (i94 ^ i98)) >> 31;
                            int i100 = i96 + 49;
                            f187a = i100 % 128;
                            int i101 = i100 % 2;
                            int i102 = i93 & (~i99);
                            int i103 = i99 & i;
                            i6 = (i102 & i103) | (i102 ^ i103);
                        } else if (Build.VERSION.SDK_INT == 30) {
                            int i104 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                            i5 = ((i104 | 81) << 1) - (i104 ^ 81);
                            f187a = i5 % 128;
                            if (i5 % 2 != 0) {
                                throw null;
                            }
                            i6 = i;
                        } else {
                            if (Build.VERSION.SDK_INT > 33) {
                                int i510 = -MotionEvent.axisFromString("");
                                Object[] objArr15 = new Object[1];
                                c(new char[]{0, 0, 0, 0}, new char[]{10558, 57630, 9412, 34502}, (char) (((i510 | 50723) << 1) - (i510 ^ 50723)), ViewConfiguration.getTapTimeout() >> 16, new char[]{26834, 5917, 63409, 55098, 60712, 8124, 52223, 54988, 8842, 33350, 4640, 40093, 32807, 30088, 27977, 32788, 15365, 45271, 59586, 29637, 1826, 36500, 51093, 20062, 25415, 13434, 26867, 16071}, objArr15);
                                Object[] objArr16 = {(String) objArr15[0]};
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-52092531);
                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                    char cKeyCodeFromString2 = (char) KeyEvent.keyCodeFromString("");
                                    int i511 = (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 992;
                                    int longPressTimeout2 = (ViewConfiguration.getLongPressTimeout() >> 16) + 8;
                                    byte b6 = $$a[7];
                                    Object[] objArr17 = new Object[1];
                                    d((short) 141, b6, (byte) (b6 | 52), objArr17);
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cKeyCodeFromString2, i511, longPressTimeout2, 410748506, false, (String) objArr17[0], new Class[]{String.class});
                                }
                                long jLongValue2 = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr16)).longValue();
                                long j9 = 931040814;
                                long j10 = -115;
                                long j11 = i;
                                long j12 = -1;
                                long j13 = (j10 * j9) + (j10 * jLongValue2) + (((long) (-116)) * ((((j11 ^ j12) | j9) | jLongValue2) ^ j12));
                                long j14 = 116;
                                long j15 = jLongValue2 ^ j12;
                                long j16 = j13 + ((j9 | j11) * j14) + (j14 * (((j15 | j11) ^ j12) | (((j9 ^ j12) | j15) ^ j12))) + ((long) (-1131959051));
                                int i512 = ~i;
                                i7 = (((int) (j16 >> 32)) & (((((~((-1265845742) | i512)) | (~(171380669 | i))) * 959) - 182756455) + (((~((-1265845742) | i)) | (~(171380669 | i512))) * 959))) | (((int) j16) & ((-635053948) + ((1784643567 | i) * (-627)) + (((~((-173741510) | i)) | (-1610967920)) * (-627)) + (((~(173741509 | i512)) | (~((-1610967920) | i))) * 627)));
                            } else {
                                char[] cArr5 = {0, 0, 0, 0};
                                char[] cArr6 = {56043, 25578, 19724, 8119};
                                int packedPositionChild2 = ExpandableListView.getPackedPositionChild(0L);
                                int i513 = packedPositionChild2 * (-103);
                                int i514 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                                int i515 = (i514 & 51) + (i514 | 51);
                                f187a = i515 % 128;
                                int i516 = i515 % 2;
                                int i517 = ((i513 | (-4833378)) << 1) - (i513 ^ (-4833378));
                                int i610 = ~packedPositionChild2;
                                int i611 = ~((i610 & (-46927)) | (i610 ^ (-46927)));
                                int i612 = ~(((-46927) & i) | ((-46927) ^ i));
                                int i613 = ((i611 & i612) | (i611 ^ i612)) * 104;
                                int i614 = (i517 ^ i613) + ((i613 & i517) << 1);
                                int i615 = ~i;
                                int i616 = -(-((~((i615 & packedPositionChild2) | (i615 ^ packedPositionChild2) | 46926)) * (-104)));
                                char c5 = (char) ((((i614 ^ i616) + ((i616 & i614) << 1)) - (~(-(-(((packedPositionChild2 & i) | (packedPositionChild2 ^ i)) * 104))))) - 1);
                                int tapTimeout2 = ViewConfiguration.getTapTimeout() >> 16;
                                int iTuitionPaymentFragmentspecialinlinedviewModeldefault6 = FileExtKt$readLinesSafe$1.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
                                int i617 = tapTimeout2 * 866;
                                int i618 = ((i617 | 784818240) << 1) - (i617 ^ 784818240);
                                int i619 = ~((~tapTimeout2) | (~iTuitionPaymentFragmentspecialinlinedviewModeldefault6));
                                int i710 = -(-(((i619 & (-207874779)) | ((-207874779) ^ i619)) * (-865)));
                                int i711 = (i618 ^ i710) + ((i710 & i618) << 1);
                                int i712 = (~((tapTimeout2 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault6) | (tapTimeout2 & iTuitionPaymentFragmentspecialinlinedviewModeldefault6))) * 865;
                                int i713 = ((i711 | i712) << 1) - (i712 ^ i711);
                                int i714 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault6;
                                int i715 = ~(((-207874779) & i714) | ((-207874779) ^ i714));
                                int i716 = ~((tapTimeout2 & i714) | (i714 ^ tapTimeout2));
                                int i717 = -(-(((i716 & i715) | (i715 ^ i716)) * 865));
                                Object[] objArr18 = new Object[1];
                                c(cArr5, cArr6, c5, (i713 ^ i717) + ((i717 & i713) << 1), new char[]{7082}, objArr18);
                                str = (String) objArr18[0];
                                char[] cArr7 = {0, 0, 0, 0};
                                char[] cArr8 = {52616, 3534, 63193, 32942};
                                char c6 = (char) (44791 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)));
                                scrollBarSize = ViewConfiguration.getScrollBarSize() >> 8;
                                iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = FileExtKt$readLinesSafe$1.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
                                int i718 = f187a;
                                i8 = ((i718 | 51) << 1) - (i718 ^ 51);
                                TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i8 % 128;
                                if (i8 % 2 != 0) {
                                    i9 = ((217 << scrollBarSize) >> (-1251520043)) % ((~((scrollBarSize ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault3) | (scrollBarSize & iTuitionPaymentFragmentspecialinlinedviewModeldefault3))) + 216);
                                    int i719 = 653406514 | scrollBarSize;
                                    int i810 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault3;
                                    i10 = (i719 ^ i810) | (i719 & i810);
                                } else {
                                    int i811 = scrollBarSize * 217;
                                    int i812 = (i811 & (-1251520043)) + (i811 | (-1251520043));
                                    int i813 = (~(scrollBarSize | iTuitionPaymentFragmentspecialinlinedviewModeldefault3)) * 216;
                                    i9 = ((i812 | i813) << 1) - (i813 ^ i812);
                                    i10 = (653406514 & scrollBarSize) | (scrollBarSize ^ 653406514) | (~iTuitionPaymentFragmentspecialinlinedviewModeldefault3);
                                }
                                int i814 = (-216) * i10;
                                int i815 = ~(scrollBarSize | (~iTuitionPaymentFragmentspecialinlinedviewModeldefault3));
                                Object[] objArr19 = new Object[1];
                                c(cArr7, cArr8, c6, ((((i9 | i814) << 1) - (i9 ^ i814)) - (~(-(-(((i815 & (-653406515)) | ((-653406515) ^ i815)) * 216))))) - 1, new char[]{15640, 14398, 23071, 65119, 7284, 12652, 63734, 65032, 34050, 48325, 58687, 48956, 8574}, objArr19);
                                objArr = new Object[]{(String) objArr19[0]};
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1333629456);
                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                                    char cIndexOf3 = (char) (TextUtils.indexOf("", "", 0) + 33602);
                                    int doubleTapTimeout2 = (ViewConfiguration.getDoubleTapTimeout() >> 16) + 3085;
                                    int threadPriority2 = 26 - ((Process.getThreadPriority(0) + 20) >> 6);
                                    byte b7 = $$a[7];
                                    Object[] objArr110 = new Object[1];
                                    d((short) 141, b7, (byte) (b7 | 52), objArr110);
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cIndexOf3, doubleTapTimeout2, threadPriority2, 1411172903, false, (String) objArr110[0], new Class[]{String.class});
                                }
                                if (str.equals(((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr))) {
                                    i7 = 1;
                                } else {
                                    i7 = 0;
                                }
                            }
                            int i816 = (i & (-11)) | ((~i) & 10);
                            int i817 = (i7 | (-i7)) >> 31;
                            int i818 = (~i817) & i;
                            int i819 = f187a;
                            int i910 = (i819 & 83) + (i819 | 83);
                            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i910 % 128;
                            int i911 = i910 % 2;
                            int i912 = i817 & i816;
                            int i913 = (i912 & i818) | (i818 ^ i912);
                            int i914 = i2 & 32;
                            int i915 = i819 + 71;
                            int i916 = i915 % 128;
                            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i916;
                            int i917 = i915 % 2;
                            int i918 = -i914;
                            int i919 = ((i914 & i918) | (i914 ^ i918)) >> 31;
                            int i105 = i916 + 49;
                            f187a = i105 % 128;
                            int i106 = i105 % 2;
                            int i107 = i913 & (~i919);
                            int i108 = i919 & i;
                            i6 = (i107 & i108) | (i107 ^ i108);
                        }
                    } else if (Build.VERSION.SDK_INT == 30) {
                        int i109 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                        i5 = ((i109 | 81) << 1) - (i109 ^ 81);
                        f187a = i5 % 128;
                        if (i5 % 2 != 0) {
                            throw null;
                        }
                        i6 = i;
                    } else {
                        try {
                            if (Build.VERSION.SDK_INT > 33) {
                                int i518 = -MotionEvent.axisFromString("");
                                Object[] objArr111 = new Object[1];
                                c(new char[]{0, 0, 0, 0}, new char[]{10558, 57630, 9412, 34502}, (char) (((i518 | 50723) << 1) - (i518 ^ 50723)), ViewConfiguration.getTapTimeout() >> 16, new char[]{26834, 5917, 63409, 55098, 60712, 8124, 52223, 54988, 8842, 33350, 4640, 40093, 32807, 30088, 27977, 32788, 15365, 45271, 59586, 29637, 1826, 36500, 51093, 20062, 25415, 13434, 26867, 16071}, objArr111);
                                try {
                                    Object[] objArr112 = {(String) objArr111[0]};
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-52092531);
                                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                        char cKeyCodeFromString3 = (char) KeyEvent.keyCodeFromString("");
                                        int i519 = (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 992;
                                        int longPressTimeout3 = (ViewConfiguration.getLongPressTimeout() >> 16) + 8;
                                        byte b8 = $$a[7];
                                        Object[] objArr113 = new Object[1];
                                        d((short) 141, b8, (byte) (b8 | 52), objArr113);
                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cKeyCodeFromString3, i519, longPressTimeout3, 410748506, false, (String) objArr113[0], new Class[]{String.class});
                                    }
                                    long jLongValue3 = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr112)).longValue();
                                    long j17 = 931040814;
                                    long j18 = -115;
                                    long j19 = i;
                                    long j110 = -1;
                                    long j111 = (j18 * j17) + (j18 * jLongValue3) + (((long) (-116)) * ((((j19 ^ j110) | j17) | jLongValue3) ^ j110));
                                    long j112 = 116;
                                    long j113 = jLongValue3 ^ j110;
                                    long j114 = j111 + ((j17 | j19) * j112) + (j112 * (((j113 | j19) ^ j110) | (((j17 ^ j110) | j113) ^ j110))) + ((long) (-1131959051));
                                    int i5110 = ~i;
                                    i7 = (((int) (j114 >> 32)) & (((((~((-1265845742) | i5110)) | (~(171380669 | i))) * 959) - 182756455) + (((~((-1265845742) | i)) | (~(171380669 | i5110))) * 959))) | (((int) j114) & ((-635053948) + ((1784643567 | i) * (-627)) + (((~((-173741510) | i)) | (-1610967920)) * (-627)) + (((~(173741509 | i5110)) | (~((-1610967920) | i))) * 627)));
                                } catch (Throwable th2) {
                                    Throwable cause2 = th2.getCause();
                                    if (cause2 != null) {
                                        throw cause2;
                                    }
                                    throw th2;
                                }
                            } else {
                                char[] cArr9 = {0, 0, 0, 0};
                                char[] cArr10 = {56043, 25578, 19724, 8119};
                                int packedPositionChild3 = ExpandableListView.getPackedPositionChild(0L);
                                int i5111 = packedPositionChild3 * (-103);
                                int i5112 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                                int i5113 = (i5112 & 51) + (i5112 | 51);
                                f187a = i5113 % 128;
                                int i5114 = i5113 % 2;
                                int i5115 = ((i5111 | (-4833378)) << 1) - (i5111 ^ (-4833378));
                                int i6110 = ~packedPositionChild3;
                                int i6111 = ~((i6110 & (-46927)) | (i6110 ^ (-46927)));
                                int i6112 = ~(((-46927) & i) | ((-46927) ^ i));
                                int i6113 = ((i6111 & i6112) | (i6111 ^ i6112)) * 104;
                                int i6114 = (i5115 ^ i6113) + ((i6113 & i5115) << 1);
                                int i6115 = ~i;
                                int i6116 = -(-((~((i6115 & packedPositionChild3) | (i6115 ^ packedPositionChild3) | 46926)) * (-104)));
                                char c7 = (char) ((((i6114 ^ i6116) + ((i6116 & i6114) << 1)) - (~(-(-(((packedPositionChild3 & i) | (packedPositionChild3 ^ i)) * 104))))) - 1);
                                int tapTimeout3 = ViewConfiguration.getTapTimeout() >> 16;
                                int iTuitionPaymentFragmentspecialinlinedviewModeldefault7 = FileExtKt$readLinesSafe$1.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
                                int i6117 = tapTimeout3 * 866;
                                int i6118 = ((i6117 | 784818240) << 1) - (i6117 ^ 784818240);
                                int i6119 = ~((~tapTimeout3) | (~iTuitionPaymentFragmentspecialinlinedviewModeldefault7));
                                int i7110 = -(-(((i6119 & (-207874779)) | ((-207874779) ^ i6119)) * (-865)));
                                int i7111 = (i6118 ^ i7110) + ((i7110 & i6118) << 1);
                                int i7112 = (~((tapTimeout3 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault7) | (tapTimeout3 & iTuitionPaymentFragmentspecialinlinedviewModeldefault7))) * 865;
                                int i7113 = ((i7111 | i7112) << 1) - (i7112 ^ i7111);
                                int i7114 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault7;
                                int i7115 = ~(((-207874779) & i7114) | ((-207874779) ^ i7114));
                                int i7116 = ~((tapTimeout3 & i7114) | (i7114 ^ tapTimeout3));
                                int i7117 = -(-(((i7116 & i7115) | (i7115 ^ i7116)) * 865));
                                Object[] objArr114 = new Object[1];
                                c(cArr9, cArr10, c7, (i7113 ^ i7117) + ((i7117 & i7113) << 1), new char[]{7082}, objArr114);
                                str = (String) objArr114[0];
                                char[] cArr11 = {0, 0, 0, 0};
                                char[] cArr12 = {52616, 3534, 63193, 32942};
                                char c8 = (char) (44791 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)));
                                scrollBarSize = ViewConfiguration.getScrollBarSize() >> 8;
                                iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = FileExtKt$readLinesSafe$1.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
                                int i7118 = f187a;
                                i8 = ((i7118 | 51) << 1) - (i7118 ^ 51);
                                TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i8 % 128;
                                if (i8 % 2 != 0) {
                                    i9 = ((217 << scrollBarSize) >> (-1251520043)) % ((~((scrollBarSize ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault3) | (scrollBarSize & iTuitionPaymentFragmentspecialinlinedviewModeldefault3))) + 216);
                                    int i7119 = 653406514 | scrollBarSize;
                                    int i8110 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault3;
                                    i10 = (i7119 ^ i8110) | (i7119 & i8110);
                                } else {
                                    int i8111 = scrollBarSize * 217;
                                    int i8112 = (i8111 & (-1251520043)) + (i8111 | (-1251520043));
                                    int i8113 = (~(scrollBarSize | iTuitionPaymentFragmentspecialinlinedviewModeldefault3)) * 216;
                                    i9 = ((i8112 | i8113) << 1) - (i8113 ^ i8112);
                                    i10 = (653406514 & scrollBarSize) | (scrollBarSize ^ 653406514) | (~iTuitionPaymentFragmentspecialinlinedviewModeldefault3);
                                }
                                int i8114 = (-216) * i10;
                                int i8115 = ~(scrollBarSize | (~iTuitionPaymentFragmentspecialinlinedviewModeldefault3));
                                Object[] objArr115 = new Object[1];
                                c(cArr11, cArr12, c8, ((((i9 | i8114) << 1) - (i9 ^ i8114)) - (~(-(-(((i8115 & (-653406515)) | ((-653406515) ^ i8115)) * 216))))) - 1, new char[]{15640, 14398, 23071, 65119, 7284, 12652, 63734, 65032, 34050, 48325, 58687, 48956, 8574}, objArr115);
                                try {
                                    objArr = new Object[]{(String) objArr115[0]};
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1333629456);
                                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                                        char cIndexOf4 = (char) (TextUtils.indexOf("", "", 0) + 33602);
                                        int doubleTapTimeout3 = (ViewConfiguration.getDoubleTapTimeout() >> 16) + 3085;
                                        int threadPriority3 = 26 - ((Process.getThreadPriority(0) + 20) >> 6);
                                        byte b9 = $$a[7];
                                        Object[] objArr116 = new Object[1];
                                        d((short) 141, b9, (byte) (b9 | 52), objArr116);
                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cIndexOf4, doubleTapTimeout3, threadPriority3, 1411172903, false, (String) objArr116[0], new Class[]{String.class});
                                    }
                                    if (str.equals(((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr))) {
                                        i7 = 1;
                                    } else {
                                        i7 = 0;
                                    }
                                } catch (Throwable th3) {
                                    Throwable cause3 = th3.getCause();
                                    if (cause3 != null) {
                                        throw cause3;
                                    }
                                    throw th3;
                                }
                            }
                        } catch (Exception unused) {
                        }
                        int i8116 = (i & (-11)) | ((~i) & 10);
                        int i8117 = (i7 | (-i7)) >> 31;
                        int i8118 = (~i8117) & i;
                        int i8119 = f187a;
                        int i9110 = (i8119 & 83) + (i8119 | 83);
                        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i9110 % 128;
                        int i9111 = i9110 % 2;
                        int i9112 = i8117 & i8116;
                        int i9113 = (i9112 & i8118) | (i8118 ^ i9112);
                        int i9114 = i2 & 32;
                        int i9115 = i8119 + 71;
                        int i9116 = i9115 % 128;
                        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i9116;
                        int i9117 = i9115 % 2;
                        int i9118 = -i9114;
                        int i9119 = ((i9114 & i9118) | (i9114 ^ i9118)) >> 31;
                        int i1010 = i9116 + 49;
                        f187a = i1010 % 128;
                        int i1011 = i1010 % 2;
                        int i1012 = i9113 & (~i9119);
                        int i1013 = i9119 & i;
                        i6 = (i1012 & i1013) | (i1012 ^ i1013);
                    }
                    int i110 = (~i4) & i;
                    int i111 = ~i;
                    int i112 = i110 | (i4 & i111);
                    int i113 = -i112;
                    int i114 = ((i112 & i113) | (i112 ^ i113)) >> 31;
                    int i115 = i6 & (~i114);
                    int i116 = i4 & i114;
                    int i117 = (i115 & i116) | (i115 ^ i116);
                    int i118 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                    int i119 = (i118 ^ 19) + ((i118 & 19) << 1);
                    f187a = i119 % 128;
                    int i120 = i119 % 2;
                    int i121 = (~(i & i117)) & (i | i117);
                    int i122 = -i121;
                    int i123 = (((i121 & i122) | (i121 ^ i122)) >> 31) & 16;
                    Object[] objArr20 = {new int[]{i}, new int[1], new int[]{i117}, null};
                    int iFreeMemory = (int) Runtime.getRuntime().freeMemory();
                    int i124 = ~iFreeMemory;
                    int i125 = (-360937194) + (((~(440076790 | i124)) | (~((-35192885) | iFreeMemory))) * (-831)) + ((~(515579903 | iFreeMemory)) * (-1662)) + (((~(iFreeMemory | (-440076791))) | (~(i124 | (-480387020))) | (~(480387019 | iFreeMemory))) * 831);
                    int i126 = -(-i123);
                    int i127 = (i125 & i126) + (i126 | i125);
                    int i128 = f187a + 33;
                    int i129 = i128 % 128;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i129;
                    int i130 = i128 % 2;
                    int i131 = i127 * (-661);
                    int i132 = i3 * (-661);
                    int i133 = ((i131 | i132) << 1) - (i131 ^ i132);
                    int i134 = ~i127;
                    int i135 = ~i3;
                    int i136 = i133 + ((i111 | (~((i134 ^ i135) | (i134 & i135)))) * 1324);
                    int i137 = i129 + 7;
                    f187a = i137 % 128;
                    int i138 = i137 % 2;
                    int i139 = ~((i127 ^ i) | (i127 & i));
                    int i140 = ~((i & i3) | (i3 ^ i));
                    int i141 = (i136 - (~(-(-((-1324) * ((i140 & i139) | (i139 ^ i140))))))) - 1;
                    int i142 = ~(i134 | i3);
                    int i143 = (i129 ^ 7) + ((7 & i129) << 1);
                    f187a = i143 % 128;
                    int i144 = i143 % 2;
                    int i145 = ~(i135 | i127);
                    int i146 = i141 + (662 * ((i142 & i145) | (i142 ^ i145)));
                    int i147 = (i146 << 13) ^ i146;
                    int i148 = i147 >>> 17;
                    int i149 = ((~i147) & i148) | ((~i148) & i147);
                    ((int[]) objArr20[1])[0] = i149 ^ (i149 << 5);
                    return objArr20;
                } catch (Throwable th4) {
                    Throwable cause4 = th4.getCause();
                    if (cause4 != null) {
                        throw cause4;
                    }
                    throw th4;
                }
            }

            /* JADX WARN: Code duplicated, block: B:10:0x0022  */
            /* JADX WARN: Code duplicated, block: B:8:0x001c  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:11:0x0024). Please report as a decompilation issue!!! */
            /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0022
                	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                */
            private static java.lang.String $$e(byte r5, byte r6, short r7) {
                /*
                    int r5 = r5 * 4
                    int r0 = r5 + 1
                    int r6 = 104 - r6
                    byte[] r1 = defpackage.Node.AnonymousClass5.$$c
                    int r7 = r7 * 2
                    int r7 = r7 + 4
                    byte[] r0 = new byte[r0]
                    r2 = 0
                    if (r1 != 0) goto L14
                    r3 = r5
                    r4 = r2
                    goto L24
                L14:
                    r3 = r2
                L15:
                    byte r4 = (byte) r6
                    r0[r3] = r4
                    int r4 = r3 + 1
                    if (r3 != r5) goto L22
                    java.lang.String r5 = new java.lang.String
                    r5.<init>(r0, r2)
                    return r5
                L22:
                    r3 = r1[r7]
                L24:
                    int r6 = r6 + r3
                    int r7 = r7 + 1
                    r3 = r4
                    goto L15
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.Node.AnonymousClass5.$$e(byte, byte, short):java.lang.String");
            }
        }.toString());
        byte[] bytes = strTuitionPaymentFragmentspecialinlinedviewModeldefault2.getBytes();
        if (shaderProvider != null && shaderProvider.b() >= 0 && shaderProvider.b() + bytes.length < 1024) {
            getexif = new getExif(bVar.d.g());
            getexif.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = true;
            bVar.d.b(getexif);
            executesafely = getexif;
        } else {
            executesafely = bVar.asBinder;
            getexif = null;
        }
        String strConcat = "\n".concat(String.valueOf(strTuitionPaymentFragmentspecialinlinedviewModeldefault2));
        if (node.TuitionPaymentFragmentspecialinlinedviewModeldefault1 != null && node.TuitionPaymentFragmentspecialinlinedviewModeldefault2 <= 2) {
            node.TuitionPaymentFragmentbindingInflater1(strConcat);
        }
        final lambdainitGlRenderer9androidxcameracoreprocessingDefaultSurfaceProcessor lambdainitglrenderer9androidxcameracoreprocessingdefaultsurfaceprocessor = bVar.g;
        lambdainitGlRenderer10androidxcameracoreprocessingDefaultSurfaceProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault1(executesafely, bytes, new lambdainitGlRenderer9androidxcameracoreprocessingDefaultSurfaceProcessor() { // from class: Operation.3
            @Override // defpackage.lambdainitGlRenderer9androidxcameracoreprocessingDefaultSurfaceProcessor
            public final void b(Exception exc) {
                lambdainitGlRenderer9androidxcameracoreprocessingDefaultSurfaceProcessor lambdainitglrenderer9androidxcameracoreprocessingdefaultsurfaceprocessor2 = lambdainitglrenderer9androidxcameracoreprocessingdefaultsurfaceprocessor;
                if (lambdainitglrenderer9androidxcameracoreprocessingdefaultsurfaceprocessor2 != null) {
                    lambdainitglrenderer9androidxcameracoreprocessingdefaultsurfaceprocessor2.b(exc);
                }
                getExif getexif2 = getexif;
                if (getexif2 != null) {
                    getexif2.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = false;
                    getexif2.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                    getexif.b = 0;
                }
            }
        });
        lambdaexecuteSafely12androidxcameracoreprocessingDefaultSurfaceProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2 tuitionPaymentFragmentspecialinlinedviewModeldefault2 = new lambdaexecuteSafely12androidxcameracoreprocessingDefaultSurfaceProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2() { // from class: Operation.2
            private getOutSurfaceOrThrow TuitionPaymentFragmentspecialinlinedviewModeldefault2 = new getOutSurfaceOrThrow();
            private String b;

            @Override // lambdaexecuteSafely12androidxcameracoreprocessingDefaultSurfaceProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2
            public final void TuitionPaymentFragmentspecialinlinedviewModeldefault3(String str) {
                checkReadyToRelease checkreadytoreleaseTuitionPaymentFragmentspecialinlinedviewModeldefault2;
                try {
                    String strTrim = str.trim();
                    if (this.b == null) {
                        this.b = strTrim;
                        return;
                    }
                    if (!TextUtils.isEmpty(strTrim)) {
                        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault1(strTrim);
                        return;
                    }
                    String[] strArrSplit = this.b.split(" ", 3);
                    if (strArrSplit.length < 2) {
                        throw new Exception(new IOException("Not HTTP"));
                    }
                    bVar.d.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
                    String str2 = strArrSplit[0];
                    bVar.d.TuitionPaymentFragmentspecialinlinedviewModeldefault2(str2);
                    bVar.d.TuitionPaymentFragmentbindingInflater1(Integer.parseInt(strArrSplit[1]));
                    bVar.d.b(strArrSplit.length == 3 ? strArrSplit[2] : "");
                    bVar.b.b(null);
                    getAbsolutePathFromUri getabsolutepathfromuriA = bVar.d.a();
                    if (getabsolutepathfromuriA != null) {
                        Node node2 = bVar.f189a;
                        int iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = bVar.d.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                        if ((iTuitionPaymentFragmentspecialinlinedviewModeldefault2 >= 100 && iTuitionPaymentFragmentspecialinlinedviewModeldefault2 <= 199) || iTuitionPaymentFragmentspecialinlinedviewModeldefault2 == 204 || iTuitionPaymentFragmentspecialinlinedviewModeldefault2 == 304) {
                            AsyncServer asyncServerTuitionPaymentFragmentspecialinlinedviewModeldefault3 = getabsolutepathfromuriA.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
                            render.TuitionPaymentFragmentspecialinlinedviewModeldefault3 tuitionPaymentFragmentspecialinlinedviewModeldefault3 = new render.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
                            asyncServerTuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentbindingInflater1(tuitionPaymentFragmentspecialinlinedviewModeldefault3.new AnonymousClass5(null), 0L);
                            checkreadytoreleaseTuitionPaymentFragmentspecialinlinedviewModeldefault2 = tuitionPaymentFragmentspecialinlinedviewModeldefault3;
                        } else {
                            Protocol.TuitionPaymentFragmentbindingInflater1(str2);
                            checkreadytoreleaseTuitionPaymentFragmentspecialinlinedviewModeldefault2 = render.TuitionPaymentFragmentspecialinlinedviewModeldefault2(getabsolutepathfromuriA, this.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
                        }
                        bVar.d.TuitionPaymentFragmentspecialinlinedviewModeldefault1(checkreadytoreleaseTuitionPaymentFragmentspecialinlinedviewModeldefault2);
                    }
                } catch (Exception e2) {
                    bVar.b.b(e2);
                }
            }
        };
        lambdaexecuteSafely12androidxcameracoreprocessingDefaultSurfaceProcessor lambdaexecutesafely12androidxcameracoreprocessingdefaultsurfaceprocessor = new lambdaexecuteSafely12androidxcameracoreprocessingDefaultSurfaceProcessor();
        bVar.asBinder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(lambdaexecutesafely12androidxcameracoreprocessingdefaultsurfaceprocessor);
        lambdaexecutesafely12androidxcameracoreprocessingdefaultsurfaceprocessor.b = tuitionPaymentFragmentspecialinlinedviewModeldefault2;
        return true;
    }

    @Override // defpackage.unregisterOutputSurface, defpackage.OpenGlRenderer
    public final void b(OpenGlRenderer.g gVar) {
        Protocol protocolTuitionPaymentFragmentbindingInflater1 = Protocol.TuitionPaymentFragmentbindingInflater1(gVar.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
        if ((protocolTuitionPaymentFragmentbindingInflater1 == null || protocolTuitionPaymentFragmentbindingInflater1 == Protocol.HTTP_1_0 || protocolTuitionPaymentFragmentbindingInflater1 == Protocol.HTTP_1_1) && (gVar.d.g() instanceof addTransformationUpdateListener)) {
            gVar.d.g().b();
        }
    }
}
