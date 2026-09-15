package defpackage;

import android.content.Context;
import android.graphics.Color;
import android.media.AudioTrack;
import android.os.Process;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.Toast;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
public final class lambdarelease1androidxcameracoreprocessingconcurrentDualSurfaceProcessorNode implements DualSurfaceProcessorNode1 {
    private static final byte[] $$a = {83, -4, -55, -17, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, 7, -18, -16, -1, -16, -16, -4, 19, -48, -3, -17, 0, -30, 4, -24, 54, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 56, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 54};
    private static final int $$b = 180;
    chooseSurfaceAttrib TuitionPaymentFragmentspecialinlinedviewModeldefault2 = new chooseSurfaceAttrib();

    /* JADX WARN: Code duplicated, block: B:10:0x0025  */
    /* JADX WARN: Code duplicated, block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002c). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0025
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void a(int r6, int r7, short r8, java.lang.Object[] r9) {
        /*
            int r6 = r6 + 4
            int r8 = r8 * 15
            int r8 = 53 - r8
            int r7 = r7 * 2
            int r7 = r7 + 84
            byte[] r0 = defpackage.lambdarelease1androidxcameracoreprocessingconcurrentDualSurfaceProcessorNode.$$a
            byte[] r1 = new byte[r8]
            r2 = 0
            if (r0 != 0) goto L15
            r7 = r6
            r3 = r8
            r4 = r2
            goto L2c
        L15:
            r3 = r2
        L16:
            byte r4 = (byte) r7
            r1[r3] = r4
            int r3 = r3 + 1
            if (r3 != r8) goto L25
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L25:
            r4 = r0[r6]
            r5 = r7
            r7 = r6
            r6 = r4
            r4 = r3
            r3 = r5
        L2c:
            int r6 = -r6
            int r3 = r3 + r6
            int r6 = r3 + (-11)
            int r7 = r7 + 1
            r3 = r4
            r5 = r7
            r7 = r6
            r6 = r5
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lambdarelease1androidxcameracoreprocessingconcurrentDualSurfaceProcessorNode.a(int, int, short, java.lang.Object[]):void");
    }

    @Override // defpackage.DualSurfaceProcessorNode1
    public final chooseSurfaceAttrib TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        return this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    }

    @Override // defpackage.DualSurfaceProcessorNode1
    public final DualSurfaceProcessorNode1 TuitionPaymentFragmentspecialinlinedviewModeldefault2(String str) throws Throwable {
        Object[] objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$5f1425da;
        checkGlErrorOrThrow checkglerrororthrowB = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.b();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char mirror = (char) (AndroidCharacter.getMirror('0') + 29896);
            int packedPositionGroup = ExpandableListView.getPackedPositionGroup(0L) + 1755;
            int iLastIndexOf = TextUtils.lastIndexOf("", '0', 0) + 24;
            byte[] bArr = $$a;
            byte b = bArr[7];
            Object[] objArr = new Object[1];
            a(b, b, bArr[5], objArr);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(mirror, packedPositionGroup, iLastIndexOf, 986134021, false, (String) objArr[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        long jLongValue = ((Long) Class.forName("android.os.SystemClock").getDeclaredMethod("elapsedRealtime", new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1145728641);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char c = (char) (29944 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)));
            int iIndexOf = TextUtils.indexOf("", "") + 1755;
            int iLastIndexOf2 = TextUtils.lastIndexOf("", '0') + 24;
            byte b2 = $$a[7];
            Object[] objArr2 = new Object[1];
            a((byte) 37, b2, b2, objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(c, iIndexOf, iLastIndexOf2, 1596667560, false, (String) objArr2[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char c2 = (char) (29945 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)));
                int threadPriority = 1755 - ((Process.getThreadPriority(0) + 20) >> 6);
                int size = View.MeasureSpec.getSize(0) + 23;
                byte b3 = $$a[7];
                Object[] objArr3 = new Object[1];
                a((byte) 89, b3, b3, objArr3);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(c2, threadPriority, size, 1599039318, false, (String) objArr3[0], null);
            }
            Object[] objArr4 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$5f1425da = new Object[]{new int[]{((int[]) objArr4[0])[0]}, new int[]{((int[]) objArr4[1])[0]}, (Object[]) objArr4[2], new int[1], (String[]) objArr4[4]};
            int startUptimeMillis = (int) Process.getStartUptimeMillis();
            int i = ((((~((-8940674) | startUptimeMillis)) * 521) + 501567744) + (((~((~startUptimeMillis) | (-8940674))) | (-1039957712)) * 521)) - 1809342880;
            int i2 = (i << 13) ^ i;
            int i3 = i2 ^ (i2 >>> 17);
            ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$5f1425da[3])[0] = i3 ^ (i3 << 5);
        } else {
            int length = str != null ? str.length() : 0;
            try {
                Object[] objArr5 = {-383017276};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2063193834);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (42049 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24)), View.resolveSizeAndState(0, 0, 0) + 1726, 28 - TextUtils.lastIndexOf("", '0'), -1637387971, false, null, new Class[]{Integer.TYPE});
                }
                objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$5f1425da = DecorContentParent.TuitionPaymentFragmentspecialinlinedviewModeldefault1$5f1425da(length, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).newInstance(objArr5), -1809342880);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                    char doubleTapTimeout = (char) (29944 - (ViewConfiguration.getDoubleTapTimeout() >> 16));
                    int iIndexOf2 = TextUtils.indexOf("", "", 0) + 1755;
                    int iIndexOf3 = 23 - TextUtils.indexOf("", "", 0, 0);
                    byte b4 = $$a[7];
                    Object[] objArr6 = new Object[1];
                    a((byte) 89, b4, b4, objArr6);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(doubleTapTimeout, iIndexOf2, iIndexOf3, 1599039318, false, (String) objArr6[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$5f1425da);
                try {
                    long jLongValue2 = ((Long) Class.forName("android.os.SystemClock").getDeclaredMethod("elapsedRealtime", new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue2);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1145728641);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                        char windowTouchSlop = (char) (29944 - (ViewConfiguration.getWindowTouchSlop() >> 8));
                        int iRgb = Color.rgb(0, 0, 0) + 16778971;
                        int i4 = 24 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1));
                        byte b5 = $$a[7];
                        Object[] objArr7 = new Object[1];
                        a((byte) 37, b5, b5, objArr7);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(windowTouchSlop, iRgb, i4, 1596667560, false, (String) objArr7[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
                        char c3 = (char) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 29943);
                        int iRgb2 = (-16775461) - Color.rgb(0, 0, 0);
                        int jumpTapTimeout = (ViewConfiguration.getJumpTapTimeout() >> 16) + 23;
                        byte[] bArr2 = $$a;
                        byte b6 = bArr2[7];
                        Object[] objArr8 = new Object[1];
                        a(b6, b6, bArr2[5], objArr8);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(c3, iRgb2, jumpTapTimeout, 986134021, false, (String) objArr8[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).set(null, lValueOf2);
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
        int i5 = ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$5f1425da[1])[0];
        int i6 = ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$5f1425da[0])[0];
        if (i6 == i5) {
            int i7 = ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$5f1425da[3])[0];
            Object[] objArr9 = {new int[]{((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$5f1425da[0])[0]}, new int[]{((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$5f1425da[1])[0]}, (Object[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$5f1425da[2], new int[1], (String[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$5f1425da[4]};
            int iIdentityHashCode = System.identityHashCode(this);
            int i8 = ~iIdentityHashCode;
            int i9 = ~((-85946859) | i8);
            int i10 = ~((-126655568) | iIdentityHashCode);
            int i11 = i7 + (-1774707662) + ((i9 | i10) * 1150) + (((~(126655567 | i8)) | i10) * (-575)) + (((~(iIdentityHashCode | (-85946859))) | (~(i8 | 85946858))) * 575);
            int i12 = (i11 << 13) ^ i11;
            int i13 = i12 ^ (i12 >>> 17);
            ((int[]) objArr9[3])[0] = i13 ^ (i13 << 5);
        } else {
            ArrayList arrayList = new ArrayList();
            String[] strArr = (String[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$5f1425da[4];
            if (strArr != null) {
                for (String str2 : strArr) {
                    arrayList.add(str2);
                }
            }
            Toast.makeText((Context) null, i6 / (((i6 - 1) * i6) % 2), 0).show();
            int i14 = ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$5f1425da[3])[0];
            Object[] objArr10 = {new int[]{((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$5f1425da[0])[0]}, new int[]{((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$5f1425da[1])[0]}, (Object[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$5f1425da[2], new int[1], (String[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$5f1425da[4]};
            int iIdentityHashCode2 = System.identityHashCode(this);
            int i15 = ~iIdentityHashCode2;
            int i16 = i14 + (-344143540) + ((378269584 | i15) * (-757)) + ((~(534769622 | iIdentityHashCode2)) * 1514) + (((~(iIdentityHashCode2 | (-156500039))) | (~(i15 | 165667158)) | 369102464) * 757);
            int i17 = (i16 << 13) ^ i16;
            int i18 = i17 ^ (i17 >>> 17);
            ((int[]) objArr10[3])[0] = i18 ^ (i18 << 5);
        }
        checkglerrororthrowB.asInterface = str;
        return this;
    }

    @Override // defpackage.DualSurfaceProcessorNode1
    public final DualSurfaceProcessorNode1 TuitionPaymentFragmentspecialinlinedviewModeldefault2(Throwable th) throws Throwable {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.b().TuitionPaymentFragmentspecialinlinedviewModeldefault3 = new checkEglErrorOrLog(th);
        return this;
    }

    @Override // defpackage.DualSurfaceProcessorNode1
    public final DualSurfaceProcessorNode1 TuitionPaymentFragmentbindingInflater1() throws Throwable {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.b().TuitionPaymentFragmentspecialinlinedviewModeldefault2 = new shouldRespectInputCropRect();
        return this;
    }

    @Override // defpackage.DualSurfaceProcessorNode1
    public final DualSurfaceProcessorNode1 b(String str) {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.b().notify = str;
        return this;
    }

    @Override // defpackage.DualSurfaceProcessorNode1
    public final DualSurfaceProcessorNode1 TuitionPaymentFragmentspecialinlinedviewModeldefault1(String str) throws Throwable {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.b().b = new GLUtils(null);
        return this;
    }

    @Override // defpackage.DualSurfaceProcessorNode1
    public final DualSurfaceProcessorNode1 b(Context context) throws Throwable {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.b().d = new AutoValue_GraphicDeviceInfo(context);
        return this;
    }
}
