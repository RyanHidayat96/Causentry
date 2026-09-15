package defpackage;

import android.graphics.Color;
import android.graphics.Path;
import android.graphics.PointF;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class requestExtraBinder extends binderDied<MediaControllerCompatApi23, Path> {
    private static final byte[] $$a = {119, -103, 14, -22, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 56, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, 7, -18, -16, -1, -16, -16, -4, 19, -48, -3, -17, 0, -30, 4, -24, 54};
    private static final int $$b = 215;
    private final Path TuitionPaymentFragmentbindingInflater1;
    private final MediaControllerCompatApi23 d;

    /* JADX WARN: Code duplicated, block: B:10:0x0024  */
    /* JADX WARN: Code duplicated, block: B:8:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0024
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void c(short r5, byte r6, byte r7, java.lang.Object[] r8) {
        /*
            byte[] r0 = defpackage.requestExtraBinder.$$a
            int r7 = r7 * 14
            int r7 = r7 + 84
            int r6 = r6 * 52
            int r6 = 55 - r6
            int r1 = 53 - r5
            byte[] r1 = new byte[r1]
            int r5 = 52 - r5
            r2 = 0
            if (r0 != 0) goto L16
            r4 = r5
            r3 = r2
            goto L2a
        L16:
            r3 = r2
        L17:
            byte r4 = (byte) r7
            r1[r3] = r4
            if (r3 != r5) goto L24
            java.lang.String r5 = new java.lang.String
            r5.<init>(r1, r2)
            r8[r2] = r5
            return
        L24:
            int r3 = r3 + 1
            int r6 = r6 + 1
            r4 = r0[r6]
        L2a:
            int r4 = -r4
            int r7 = r7 + r4
            int r7 = r7 + (-11)
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.requestExtraBinder.c(short, byte, byte, java.lang.Object[]):void");
    }

    public requestExtraBinder(List<onSkipToNext<MediaControllerCompatApi23>> list) {
        super(list);
        this.d = new MediaControllerCompatApi23();
        this.TuitionPaymentFragmentbindingInflater1 = new Path();
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // defpackage.binderDied
    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: merged with bridge method [inline-methods] */
    public Path TuitionPaymentFragmentspecialinlinedviewModeldefault1(onSkipToNext<MediaControllerCompatApi23> onskiptonext, float f) throws Throwable {
        Object[] objArr;
        int i;
        MediaControllerCompatApi23 mediaControllerCompatApi23 = onskiptonext.d;
        MediaControllerCompatApi23 mediaControllerCompatApi24 = onskiptonext.b;
        MediaControllerCompatApi23 mediaControllerCompatApi25 = this.d;
        if (mediaControllerCompatApi25.TuitionPaymentFragmentbindingInflater1 == null) {
            mediaControllerCompatApi25.TuitionPaymentFragmentbindingInflater1 = new PointF();
        }
        mediaControllerCompatApi25.b = mediaControllerCompatApi23.b || mediaControllerCompatApi24.b;
        if (mediaControllerCompatApi23.TuitionPaymentFragmentspecialinlinedviewModeldefault2.size() != mediaControllerCompatApi24.TuitionPaymentFragmentspecialinlinedviewModeldefault2.size()) {
            StringBuilder sb = new StringBuilder("Curves must have the same number of control points. Shape 1: ");
            sb.append(mediaControllerCompatApi23.TuitionPaymentFragmentspecialinlinedviewModeldefault2.size());
            sb.append("\tShape 2: ");
            sb.append(mediaControllerCompatApi24.TuitionPaymentFragmentspecialinlinedviewModeldefault2.size());
            onSetCaptioningEnabled.b(sb.toString());
        }
        int iMin = Math.min(mediaControllerCompatApi23.TuitionPaymentFragmentspecialinlinedviewModeldefault2.size(), mediaControllerCompatApi24.TuitionPaymentFragmentspecialinlinedviewModeldefault2.size());
        if (mediaControllerCompatApi25.TuitionPaymentFragmentspecialinlinedviewModeldefault2.size() < iMin) {
            for (int size = mediaControllerCompatApi25.TuitionPaymentFragmentspecialinlinedviewModeldefault2.size(); size < iMin; size++) {
                mediaControllerCompatApi25.TuitionPaymentFragmentspecialinlinedviewModeldefault2.add(new MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver());
            }
        } else if (mediaControllerCompatApi25.TuitionPaymentFragmentspecialinlinedviewModeldefault2.size() > iMin) {
            for (int size2 = mediaControllerCompatApi25.TuitionPaymentFragmentspecialinlinedviewModeldefault2.size() - 1; size2 >= iMin; size2--) {
                List<MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver> list = mediaControllerCompatApi25.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                list.remove(list.size() - 1);
            }
        }
        PointF pointF = mediaControllerCompatApi23.TuitionPaymentFragmentbindingInflater1;
        PointF pointF2 = mediaControllerCompatApi24.TuitionPaymentFragmentbindingInflater1;
        float fTuitionPaymentFragmentspecialinlinedviewModeldefault3 = onSetRepeatMode.TuitionPaymentFragmentspecialinlinedviewModeldefault3(pointF.x, pointF2.x, f);
        float f2 = pointF.y;
        float f3 = pointF2.y;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(650054);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char keyRepeatTimeout = (char) (ViewConfiguration.getKeyRepeatTimeout() >> 16);
            int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0) + 651;
            int iRed = 44 - Color.red(0);
            byte[] bArr = $$a;
            byte b = bArr[7];
            Object[] objArr2 = new Object[1];
            c(b, bArr[5], b, objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(keyRepeatTimeout, iMakeMeasureSpec, iRed, -459846511, false, (String) objArr2[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        long jLongValue = ((Long) Class.forName("android.os.SystemClock").getDeclaredMethod("elapsedRealtime", new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(795782016);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char cMyPid = (char) (Process.myPid() >> 22);
            int iLastIndexOf = TextUtils.lastIndexOf("", '0') + 652;
            int iIndexOf = 44 - TextUtils.indexOf("", "");
            byte[] bArr2 = $$a;
            Object[] objArr3 = new Object[1];
            c((byte) 52, bArr2[7], bArr2[5], objArr3);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cMyPid, iLastIndexOf, iIndexOf, -873460649, false, (String) objArr3[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1148961515);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char tapTimeout = (char) (ViewConfiguration.getTapTimeout() >> 16);
                int windowTouchSlop = 651 - (ViewConfiguration.getWindowTouchSlop() >> 8);
                int iRed2 = Color.red(0) + 44;
                byte[] bArr3 = $$a;
                byte b2 = (byte) (bArr3[2] + 1);
                byte b3 = bArr3[7];
                Object[] objArr4 = new Object[1];
                c(b2, b3, b3, objArr4);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(tapTimeout, windowTouchSlop, iRed2, -1595579076, false, (String) objArr4[0], null);
            }
            Object[] objArr5 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            objArr = new Object[]{new int[]{i}, new String[0], new int[]{i}, new int[1]};
            int i2 = ((int[]) objArr5[2])[0];
            int i3 = ((int[]) objArr5[0])[0];
            int i4 = (int) Runtime.getRuntime().totalMemory();
            int i5 = (~((-196726877) | i4)) | 3702812;
            int i6 = ((((-1698250455) + (i5 * 992)) + ((i5 | (~((~i4) | (-272003)))) * (-496))) + ((i4 | (-193296067)) * 496)) - 1579639948;
            int i7 = (i6 << 13) ^ i6;
            int i8 = i7 ^ (i7 >>> 17);
            ((int[]) objArr[3])[0] = i8 ^ (i8 << 5);
            i = 0;
        } else {
            try {
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1686493381);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (ViewConfiguration.getScrollBarSize() >> 8), (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 1610, 26 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), 2145681644, false, null, new Class[0]);
                }
                Object[] objArr6 = {null, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).newInstance(null), -1579639948, 0};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1625117732);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                    char pressedStateDuration = (char) (ViewConfiguration.getPressedStateDuration() >> 16);
                    int iAlpha = Color.alpha(0) + 651;
                    int offsetAfter = TextUtils.getOffsetAfter("", 0) + 44;
                    byte[] bArr4 = $$a;
                    Object[] objArr7 = new Object[1];
                    c((byte) 52, bArr4[7], bArr4[5], objArr7);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(pressedStateDuration, iAlpha, offsetAfter, 2075921419, false, (String) objArr7[0], new Class[]{(Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (TextUtils.indexOf((CharSequence) "", '0') + 1), KeyEvent.normalizeMetaState(0) + 695, 98 - Color.blue(0)), (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (63407 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1))), (ViewConfiguration.getTapTimeout() >> 16) + 793, 82 - TextUtils.indexOf((CharSequence) "", '0', 0)), Integer.TYPE, Integer.TYPE});
                }
                objArr = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr6);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1148961515);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                    char cIndexOf = (char) TextUtils.indexOf("", "");
                    int iLastIndexOf2 = 650 - TextUtils.lastIndexOf("", '0', 0);
                    int keyRepeatDelay = (ViewConfiguration.getKeyRepeatDelay() >> 16) + 44;
                    byte[] bArr5 = $$a;
                    byte b4 = (byte) (bArr5[2] + 1);
                    byte b5 = bArr5[7];
                    Object[] objArr8 = new Object[1];
                    c(b4, b5, b5, objArr8);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(cIndexOf, iLastIndexOf2, keyRepeatDelay, -1595579076, false, (String) objArr8[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, objArr);
                try {
                    long jLongValue2 = ((Long) Class.forName("android.os.SystemClock").getDeclaredMethod("elapsedRealtime", new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue2);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(795782016);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
                        char cIndexOf2 = (char) (TextUtils.indexOf((CharSequence) "", '0') + 1);
                        int iRgb = (-16776565) - Color.rgb(0, 0, 0);
                        int scrollBarFadeDuration = 44 - (ViewConfiguration.getScrollBarFadeDuration() >> 16);
                        byte[] bArr6 = $$a;
                        Object[] objArr9 = new Object[1];
                        c((byte) 52, bArr6[7], bArr6[5], objArr9);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(cIndexOf2, iRgb, scrollBarFadeDuration, -873460649, false, (String) objArr9[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(650054);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault10 == null) {
                        char keyRepeatTimeout2 = (char) (ViewConfiguration.getKeyRepeatTimeout() >> 16);
                        int pressedStateDuration2 = 651 - (ViewConfiguration.getPressedStateDuration() >> 16);
                        int packedPositionGroup = ExpandableListView.getPackedPositionGroup(0L) + 44;
                        byte[] bArr7 = $$a;
                        byte b6 = bArr7[7];
                        Object[] objArr10 = new Object[1];
                        c(b6, bArr7[5], b6, objArr10);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.b(keyRepeatTimeout2, pressedStateDuration2, packedPositionGroup, -459846511, false, (String) objArr10[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault10).set(null, lValueOf2);
                    i = 0;
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
        int i9 = ((int[]) objArr[i])[i];
        int i10 = ((int[]) objArr[2])[i];
        if (i10 == i9) {
            Object[] objArr11 = new Object[4];
            int[] iArr = new int[1];
            objArr11[i] = iArr;
            int[] iArr2 = new int[1];
            objArr11[2] = iArr2;
            objArr11[3] = new int[1];
            int i11 = ((int[]) objArr[3])[i];
            int i12 = ((int[]) objArr[2])[i];
            int i13 = ((int[]) objArr[i])[i];
            iArr2[i] = i12;
            iArr[i] = i13;
            objArr11[1] = new String[i];
            int iIdentityHashCode = System.identityHashCode(this);
            int i14 = ~iIdentityHashCode;
            int i15 = i11 + (-1304508958) + (((~(i14 | (-602941268))) | 606372077) * (-1042)) + (((-602941268) | iIdentityHashCode) * 521) + (((~(iIdentityHashCode | (-606372078))) | 67403948 | (~(i14 | (-63973139)))) * 521);
            int i16 = (i15 << 13) ^ i15;
            int i17 = i16 ^ (i16 >>> 17);
            ((int[]) objArr11[3])[0] = i17 ^ (i17 << 5);
            float fTuitionPaymentFragmentspecialinlinedviewModeldefault4 = onSetRepeatMode.TuitionPaymentFragmentspecialinlinedviewModeldefault3(f2, f3, f);
            if (mediaControllerCompatApi25.TuitionPaymentFragmentbindingInflater1 == null) {
                mediaControllerCompatApi25.TuitionPaymentFragmentbindingInflater1 = new PointF();
            }
            mediaControllerCompatApi25.TuitionPaymentFragmentbindingInflater1.set(fTuitionPaymentFragmentspecialinlinedviewModeldefault3, fTuitionPaymentFragmentspecialinlinedviewModeldefault4);
            int size3 = mediaControllerCompatApi25.TuitionPaymentFragmentspecialinlinedviewModeldefault2.size();
            int i18 = ((int[]) objArr11[3])[0];
            int i19 = i18 * i18;
            int i20 = -(2147455725 * i18);
            int i21 = ((((i19 | i20) << 1) - (i19 ^ i20)) - (~(-(i18 * 1286622717)))) - 1;
            int i22 = (i21 ^ (-1922984583)) + (((-1922984583) & i21) << 1);
            int i23 = i22 >> 25;
            int i24 = (((i23 | (-255)) << 1) - (i23 ^ (-255))) / 128;
            int i25 = (i24 ^ 1) + ((i24 & 1) << 1);
            int i26 = ((i22 | i25) << 1) - (i25 ^ i22);
            int i27 = ((i22 >> 21) - 4095) / 2048;
            int i28 = (-(i26 ^ ((i27 & 1) + (i27 | 1)))) + 4;
            int i29 = i28 >> 15;
            int i30 = (((-262143) & i29) + (i29 | (-262143))) / 131072;
            int i31 = (i30 & 1) + (i30 | 1);
            for (int i32 = size3 - (676 / ((i28 & (-((i31 & 1) + (i31 | 1)))) * 169)); i32 >= 0; i32--) {
                MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = mediaControllerCompatApi23.TuitionPaymentFragmentspecialinlinedviewModeldefault2.get(i32);
                MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver2 = mediaControllerCompatApi24.TuitionPaymentFragmentspecialinlinedviewModeldefault2.get(i32);
                PointF pointF3 = mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.b;
                PointF pointF4 = mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                PointF pointF5 = mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.TuitionPaymentFragmentbindingInflater1;
                PointF pointF6 = mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver2.b;
                PointF pointF7 = mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver2.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                PointF pointF8 = mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver2.TuitionPaymentFragmentbindingInflater1;
                mediaControllerCompatApi25.TuitionPaymentFragmentspecialinlinedviewModeldefault2.get(i32).b.set(onSetRepeatMode.TuitionPaymentFragmentspecialinlinedviewModeldefault3(pointF3.x, pointF6.x, f), onSetRepeatMode.TuitionPaymentFragmentspecialinlinedviewModeldefault3(pointF3.y, pointF6.y, f));
                mediaControllerCompatApi25.TuitionPaymentFragmentspecialinlinedviewModeldefault2.get(i32).TuitionPaymentFragmentspecialinlinedviewModeldefault3.set(onSetRepeatMode.TuitionPaymentFragmentspecialinlinedviewModeldefault3(pointF4.x, pointF7.x, f), onSetRepeatMode.TuitionPaymentFragmentspecialinlinedviewModeldefault3(pointF4.y, pointF7.y, f));
                mediaControllerCompatApi25.TuitionPaymentFragmentspecialinlinedviewModeldefault2.get(i32).TuitionPaymentFragmentbindingInflater1.set(onSetRepeatMode.TuitionPaymentFragmentspecialinlinedviewModeldefault3(pointF5.x, pointF8.x, f), onSetRepeatMode.TuitionPaymentFragmentspecialinlinedviewModeldefault3(pointF5.y, pointF8.y, f));
            }
            onSetRepeatMode.b(this.d, this.TuitionPaymentFragmentbindingInflater1);
            return this.TuitionPaymentFragmentbindingInflater1;
        }
        int i33 = i;
        ArrayList arrayList = new ArrayList();
        String[] strArr = (String[]) objArr[1];
        if (strArr != null) {
            for (int i34 = i33; i34 < strArr.length; i34++) {
                arrayList.add(strArr[i34]);
            }
        }
        throw new RuntimeException(String.valueOf(i10));
    }
}
