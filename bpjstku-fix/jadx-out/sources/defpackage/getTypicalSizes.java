package defpackage;

import android.content.Context;
import android.graphics.Color;
import android.graphics.PointF;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.Toast;
import androidx.core.view.ViewCompat;
import getEventListener.b;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import okhttp3.OkHttpClient;
import okhttp3.Request;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0003R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b"}, d2 = {"LgetTypicalSizes;", "", "<init>", "()V", "", "TuitionPaymentFragmentbindingInflater1", "LgetRecordingId;", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "LgetRecordingId;"}, k = 1, mv = {2, 3, 0})
public final class getTypicalSizes {
    private static final byte[] $$a = {58, 66, -14, -31, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -56};
    private static final int $$b = 30;
    public static final getTypicalSizes INSTANCE = new getTypicalSizes();
    private static final getRecordingId TuitionPaymentFragmentspecialinlinedviewModeldefault3 = new getRecordingId("1.0.19");

    /* JADX WARN: Code duplicated, block: B:10:0x0028  */
    /* JADX WARN: Code duplicated, block: B:8:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:11:0x002d). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0028
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void a(int r6, byte r7, byte r8, java.lang.Object[] r9) {
        /*
            int r7 = r7 * 52
            int r7 = 56 - r7
            int r6 = 103 - r6
            byte[] r0 = defpackage.getTypicalSizes.$$a
            int r8 = r8 * 52
            int r8 = 53 - r8
            byte[] r1 = new byte[r8]
            r2 = 0
            if (r0 != 0) goto L15
            r6 = r7
            r4 = r8
            r3 = r2
            goto L2d
        L15:
            r3 = r2
        L16:
            r5 = r7
            r7 = r6
            r6 = r5
            byte r4 = (byte) r7
            r1[r3] = r4
            int r3 = r3 + 1
            if (r3 != r8) goto L28
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L28:
            r4 = r0[r6]
            r5 = r7
            r7 = r6
            r6 = r5
        L2d:
            int r7 = r7 + 1
            int r6 = r6 + r4
            int r6 = r6 + (-11)
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.getTypicalSizes.a(int, byte, byte, java.lang.Object[]):void");
    }

    private getTypicalSizes() {
    }

    public static void TuitionPaymentFragmentbindingInflater1() throws Throwable {
        boolean z;
        Method method;
        getEventListener geteventlistener = new getEventListener("sofakingforever/kotlin-analytics");
        getOutputOptions getoutputoptions = new getOutputOptions(TuitionPaymentFragmentspecialinlinedviewModeldefault3);
        ArrayList arrayList = new ArrayList();
        Class<?>[] clsArr = null;
        int iIntValue = ((Integer) Class.forName("java.lang.System").getMethod("identityHashCode", Object.class).invoke(null, geteventlistener)).intValue();
        char c = 0;
        Method[] methodArr = {OkHttpClient.Builder.class.getMethod("build", new Class[0])};
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char windowTouchSlop = (char) (ViewConfiguration.getWindowTouchSlop() >> 8);
            int maximumDrawingCacheSize = (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 2823;
            int pressedStateDuration = (ViewConfiguration.getPressedStateDuration() >> 16) + 22;
            byte[] bArr = $$a;
            Object[] objArr = new Object[1];
            a(bArr[54], (byte) (-bArr[5]), bArr[7], objArr);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(windowTouchSlop, maximumDrawingCacheSize, pressedStateDuration, 1814927978, false, (String) objArr[0], null);
        }
        if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).get(null) == null) {
            Method[] declaredMethods = ((Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) Color.alpha(0), 2824 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), 22 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)))).getDeclaredMethods();
            int length = declaredMethods.length;
            int i = 0;
            while (i < length) {
                Method method2 = declaredMethods[i];
                try {
                    Object[] objArr2 = new Object[1];
                    objArr2[c] = Integer.valueOf(((Integer) Class.forName("java.lang.reflect.Method").getMethod("getModifiers", clsArr).invoke(method2, clsArr)).intValue());
                    if (((Boolean) Class.forName("java.lang.reflect.Modifier").getMethod("isNative", Integer.TYPE).invoke(null, objArr2)).booleanValue() && Long.TYPE.equals(Class.forName("java.lang.reflect.Method").getMethod("getReturnType", null).invoke(method2, null))) {
                        Object[] objArr3 = (Object[]) Class.forName("java.lang.reflect.Method").getMethod("getParameterTypes", null).invoke(method2, null);
                        if (objArr3.length == 2 && Long.TYPE.equals(objArr3[0]) && Class.forName("java.lang.reflect.Method").equals(objArr3[1])) {
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                char maximumFlingVelocity = (char) (ViewConfiguration.getMaximumFlingVelocity() >> 16);
                                int iCombineMeasuredStates = 2823 - View.combineMeasuredStates(0, 0);
                                int i2 = 22 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1));
                                byte[] bArr2 = $$a;
                                Object[] objArr4 = new Object[1];
                                a(bArr2[54], (byte) (-bArr2[5]), bArr2[7], objArr4);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(maximumFlingVelocity, iCombineMeasuredStates, i2, 1814927978, false, (String) objArr4[0], null);
                            }
                            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).set(null, method2);
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                                char cLastIndexOf = (char) (TextUtils.lastIndexOf("", '0', 0, 0) + 1);
                                int defaultSize = 2823 - View.getDefaultSize(0, 0);
                                int minimumFlingVelocity = 22 - (ViewConfiguration.getMinimumFlingVelocity() >> 16);
                                byte[] bArr3 = $$a;
                                Object[] objArr5 = new Object[1];
                                a(bArr3[54], (byte) (-bArr3[5]), bArr3[7], objArr5);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(cLastIndexOf, defaultSize, minimumFlingVelocity, 1814927978, false, (String) objArr5[0], null);
                            }
                            try {
                                Object[] objArr6 = {0L, ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null)};
                                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1678062333);
                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                                    char cResolveSizeAndState = (char) View.resolveSizeAndState(0, 0, 0);
                                    int fadingEdgeLength = 2823 - (ViewConfiguration.getFadingEdgeLength() >> 16);
                                    int iLastIndexOf = TextUtils.lastIndexOf("", '0', 0, 0) + 23;
                                    byte[] bArr4 = $$a;
                                    byte b = bArr4[7];
                                    Object[] objArr7 = new Object[1];
                                    a(b, b, (byte) (-bArr4[5]), objArr7);
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(cResolveSizeAndState, fadingEdgeLength, iLastIndexOf, -2137287382, false, (String) objArr7[0], new Class[]{Long.TYPE, Method.class});
                                }
                                ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr6)).longValue();
                                break;
                            } catch (Throwable th) {
                                Throwable cause = th.getCause();
                                if (cause == null) {
                                    throw th;
                                }
                                throw cause;
                            }
                        }
                    }
                    i++;
                    clsArr = null;
                    c = 0;
                } catch (Throwable th2) {
                    Throwable cause2 = th2.getCause();
                    if (cause2 == null) {
                        throw th2;
                    }
                    throw cause2;
                }
            }
        }
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
            char c2 = (char) (1 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)));
            int iResolveSize = View.resolveSize(0, 0) + 2823;
            int iIndexOf = 21 - TextUtils.indexOf((CharSequence) "", '0', 0);
            byte[] bArr5 = $$a;
            Object[] objArr8 = new Object[1];
            a(bArr5[54], (byte) (-bArr5[5]), bArr5[7], objArr8);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(c2, iResolveSize, iIndexOf, 1814927978, false, (String) objArr8[0], null);
        }
        Object[] objArr9 = {((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).get(null)};
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-645763082);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
            char cIndexOf = (char) TextUtils.indexOf("", "", 0, 0);
            int iIndexOf2 = 2823 - TextUtils.indexOf("", "");
            int i3 = (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 22;
            byte[] bArr6 = $$a;
            Object[] objArr10 = new Object[1];
            a((byte) (bArr6[51] - 1), bArr6[7], (byte) (-bArr6[5]), objArr10);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(cIndexOf, iIndexOf2, i3, 1025296417, false, (String) objArr10[0], new Class[]{Object.class});
        }
        ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).invoke(null, objArr9);
        Object[] objArr11 = {0, methodArr, null};
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1189131659);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
            char keyRepeatTimeout = (char) ((ViewConfiguration.getKeyRepeatTimeout() >> 16) + 37657);
            int iLastIndexOf2 = 2719 - TextUtils.lastIndexOf("", '0');
            int packedPositionGroup = 19 - ExpandableListView.getPackedPositionGroup(0L);
            byte[] bArr7 = $$a;
            Object[] objArr12 = new Object[1];
            a((byte) (bArr7[51] - 1), bArr7[7], (byte) (-bArr7[5]), objArr12);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(keyRepeatTimeout, iLastIndexOf2, packedPositionGroup, -1568796068, false, (String) objArr12[0], new Class[]{Integer.TYPE, Method[].class, List.class});
        }
        long jLongValue = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).invoke(null, objArr11)).longValue();
        long j = 81423749;
        long jMyUid = Process.myUid();
        long j2 = -1;
        long j3 = jMyUid ^ j2;
        long j4 = jLongValue ^ j2;
        long j5 = (((long) 758) * j) + (((long) (-756)) * jLongValue) + (((long) (-757)) * (j | j3)) + (((long) 1514) * (((j4 | j) | jMyUid) ^ j2)) + (((long) 757) * ((((j ^ j2) | j4) ^ j2) | ((j4 | j3) ^ j2) | (j2 ^ ((jLongValue | j) | jMyUid)))) + ((long) (-1891829594));
        int i4 = ~(((int) SystemClock.uptimeMillis()) | (-341561283));
        int iMyUid = Process.myUid();
        int i5 = ~iMyUid;
        int i6 = (((int) (j5 >> 32)) & (((127073034 + (((-1778787694) | i4) * (-220))) + ((i4 | 341428866) * 220)) - 1281021856)) | (((int) j5) & ((((-635053777) + (((~(1729332863 | i5)) | (~((-292106454) | iMyUid))) * (-370))) + ((((~(iMyUid | 1729332863)) | (~(i5 | (-292106454)))) | 1712490026) * (-370))) - 2033850188));
        int i7 = i6 >>> 24;
        int i8 = i6 & ViewCompat.MEASURED_SIZE_MASK;
        int i9 = i7 != 0 ? 1 : 0;
        arrayList.add((i9 == 0 || i8 >= 1 || (method = methodArr[i8]) == null) ? null : method.toString());
        if ((i7 + 6) * i9 != 0) {
            int[] iArr = new int[iIntValue];
            int i10 = iIntValue - 1;
            z = true;
            iArr[i10] = 1;
            Toast.makeText((Context) null, iArr[((iIntValue * i10) % 2) - 1], 1).show();
        } else {
            z = true;
        }
        OkHttpClient okHttpClientBuild = new OkHttpClient.Builder().followRedirects(z).build();
        Request.Builder builder = new Request.Builder();
        StringBuilder sb = new StringBuilder("https://github.com/");
        sb.append(geteventlistener.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
        sb.append("/releases/latest");
        AutoValue_Bitmap2JpegBytes_In.b(okHttpClientBuild.newCall(builder.url(sb.toString()).get().build()), geteventlistener.new b(getoutputoptions));
    }
}
