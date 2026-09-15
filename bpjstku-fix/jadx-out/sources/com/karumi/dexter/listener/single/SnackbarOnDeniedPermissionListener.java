package com.karumi.dexter.listener.single;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.PointF;
import android.net.Uri;
import android.os.Process;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.android.material.snackbar.Snackbar;
import com.karumi.dexter.listener.PermissionDeniedResponse;
import defpackage.ViewPortBuilder;
import defpackage.deInitSession;
import defpackage.initSession;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import kotlin.text.Typography;

/* JADX INFO: loaded from: classes6.dex */
public class SnackbarOnDeniedPermissionListener extends BasePermissionListener {
    private final String buttonText;
    private final int duration;
    private final View.OnClickListener onButtonClickListener;
    private final Snackbar.Callback snackbarCallback;
    private final String text;
    private final View view;

    private SnackbarOnDeniedPermissionListener(View view, String str, String str2, View.OnClickListener onClickListener, Snackbar.Callback callback, int i) {
        this.view = view;
        this.text = str;
        this.buttonText = str2;
        this.onButtonClickListener = onClickListener;
        this.snackbarCallback = callback;
        this.duration = i;
    }

    @Override // com.karumi.dexter.listener.single.BasePermissionListener, com.karumi.dexter.listener.single.PermissionListener
    public void onPermissionDenied(PermissionDeniedResponse permissionDeniedResponse) {
        View.OnClickListener onClickListener;
        super.onPermissionDenied(permissionDeniedResponse);
        Snackbar snackbarMake = Snackbar.make(this.view, this.text, this.duration);
        String str = this.buttonText;
        if (str != null && (onClickListener = this.onButtonClickListener) != null) {
            snackbarMake.setAction(str, onClickListener);
        }
        Snackbar.Callback callback = this.snackbarCallback;
        if (callback != null) {
            snackbarMake.addCallback(callback);
        }
        snackbarMake.show();
    }

    public static class Builder {
        private String buttonText;
        private int duration = 0;
        private View.OnClickListener onClickListener;
        private Snackbar.Callback snackbarCallback;
        private final String text;
        private final View view;
        private static final byte[] $$c = {14, 70, 6, -35};
        private static final int $$f = 241;
        private static int $10 = 0;
        private static int $11 = 1;
        private static final byte[] $$d = {36, -74, -79, -21, -22, -8, 53, -67, -18, -10, -2, -15, -3, 45, -66, -13, -19, 3, -7, -9, -28, 4, 45, -63, -25, 7, -28, 1, -14, -23, -5, 1, -4, -26, 59, -34, -45, -19, 3, -7, -9, -28, 4, 24, -57, 7, -28, 1, -14, -23, -5, 1, -4, -26, 30, -51, -14, 28, -29, -12, -12, -20, -11, -8, 7, -27, 68, -41, -54, -8, -13, 5, -23, -5, -16, -9};
        private static final int $$e = 14;
        private static final byte[] $$a = {58, -51, 54, -115, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 55, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 54};
        private static final int $$b = 135;
        private static int TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 0;
        private static int TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 1;
        private static char[] b = {60052, 60047, 60053, 60098, 60072, 60056, 60079, 60105, 60057, 60061, 60051, 60106, 60058, 60099, 60088, 60107, 60062, 60110, 60109, 60055, 60111, 60048, 60034, 60050, 60090, 60045, 60043, 60054, 60104, 60046, 60040, 60117, 60108, 60073, 60063, 60041};
        private static char TuitionPaymentFragmentbindingInflater1 = 57191;

        /* JADX WARN: Code duplicated, block: B:10:0x0027  */
        /* JADX WARN: Code duplicated, block: B:8:0x001f  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x002e). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0027
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        private static void a(int r6, int r7, int r8, java.lang.Object[] r9) {
            /*
                byte[] r0 = com.karumi.dexter.listener.single.SnackbarOnDeniedPermissionListener.Builder.$$a
                int r6 = r6 * 52
                int r6 = r6 + 4
                int r8 = r8 * 14
                int r8 = 98 - r8
                int r7 = r7 * 52
                int r7 = 53 - r7
                byte[] r1 = new byte[r7]
                r2 = 0
                if (r0 != 0) goto L17
                r8 = r6
                r3 = r7
                r4 = r2
                goto L2e
            L17:
                r3 = r2
            L18:
                byte r4 = (byte) r8
                r1[r3] = r4
                int r3 = r3 + 1
                if (r3 != r7) goto L27
                java.lang.String r6 = new java.lang.String
                r6.<init>(r1, r2)
                r9[r2] = r6
                return
            L27:
                r4 = r0[r6]
                r5 = r8
                r8 = r6
                r6 = r4
                r4 = r3
                r3 = r5
            L2e:
                int r6 = -r6
                int r8 = r8 + 1
                int r3 = r3 + r6
                int r6 = r3 + (-11)
                r3 = r4
                r5 = r8
                r8 = r6
                r6 = r5
                goto L18
            */
            throw new UnsupportedOperationException("Method not decompiled: com.karumi.dexter.listener.single.SnackbarOnDeniedPermissionListener.Builder.a(int, int, int, java.lang.Object[]):void");
        }

        /* JADX WARN: Code duplicated, block: B:10:0x0024  */
        /* JADX WARN: Code duplicated, block: B:8:0x001c  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x0028). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0024
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        private static void d(byte r5, byte r6, byte r7, java.lang.Object[] r8) {
            /*
                int r5 = r5 * 72
                int r0 = 73 - r5
                int r6 = 99 - r6
                int r7 = r7 + 4
                byte[] r1 = com.karumi.dexter.listener.single.SnackbarOnDeniedPermissionListener.Builder.$$d
                byte[] r0 = new byte[r0]
                int r5 = 72 - r5
                r2 = 0
                if (r1 != 0) goto L14
                r4 = r5
                r3 = r2
                goto L28
            L14:
                r3 = r2
            L15:
                byte r4 = (byte) r6
                r0[r3] = r4
                int r7 = r7 + 1
                if (r3 != r5) goto L24
                java.lang.String r5 = new java.lang.String
                r5.<init>(r0, r2)
                r8[r2] = r5
                return
            L24:
                r4 = r1[r7]
                int r3 = r3 + 1
            L28:
                int r4 = -r4
                int r6 = r6 + r4
                int r6 = r6 + (-10)
                goto L15
            */
            throw new UnsupportedOperationException("Method not decompiled: com.karumi.dexter.listener.single.SnackbarOnDeniedPermissionListener.Builder.d(byte, byte, byte, java.lang.Object[]):void");
        }

        /* JADX WARN: Code duplicated, block: B:26:0x0221  */
        public Builder withDuration(int i) throws Throwable {
            Object[] objArr;
            int i2 = 2 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(118372281);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                char packedPositionType = (char) (37567 - ExpandableListView.getPackedPositionType(0L));
                int scrollBarFadeDuration = 625 - (ViewConfiguration.getScrollBarFadeDuration() >> 16);
                int iArgb = Color.argb(0, 0, 0, 0) + 14;
                byte[] bArr = $$a;
                byte b2 = bArr[7];
                Object[] objArr2 = new Object[1];
                a(b2, bArr[5], b2, objArr2);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(packedPositionType, scrollBarFadeDuration, iArgb, -477065106, false, (String) objArr2[0], null);
            }
            long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
            Object[] objArr3 = new Object[1];
            c(new char[]{14, 0, '#', 30, 5, 18, '#', ' ', 6, 0, Typography.quote, 1, 18, Typography.quote, 4, '\r', 26, 15, 18, 1, 3, 23}, (byte) (View.resolveSize(0, 0) + 21), TextUtils.lastIndexOf("", '0') + 23, objArr3);
            Class<?> cls = Class.forName((String) objArr3[0]);
            Object[] objArr4 = new Object[1];
            c(new char[]{'\r', 22, 14, 24, Typography.quote, '\f', '#', Typography.quote, 17, '\r', 25, 7, 21, 29, 13842}, (byte) (19 - Color.red(0)), 15 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), objArr4);
            long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(559617152);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                char tapTimeout = (char) (37567 - (ViewConfiguration.getTapTimeout() >> 16));
                int iResolveSizeAndState = 625 - View.resolveSizeAndState(0, 0, 0);
                int trimmedLength = 14 - TextUtils.getTrimmedLength("");
                byte[] bArr2 = $$a;
                byte b3 = bArr2[7];
                Object[] objArr5 = new Object[1];
                a(b3, b3, bArr2[5], objArr5);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(tapTimeout, iResolveSizeAndState, trimmedLength, -976899241, false, (String) objArr5[0], null);
            }
            if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(560540673);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    char c = (char) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 37566);
                    int iIndexOf = 624 - TextUtils.indexOf((CharSequence) "", '0', 0, 0);
                    int touchSlop = 14 - (ViewConfiguration.getTouchSlop() >> 8);
                    byte[] bArr3 = $$a;
                    byte b4 = bArr3[5];
                    Object[] objArr6 = new Object[1];
                    a(b4, bArr3[7], b4, objArr6);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(c, iIndexOf, touchSlop, -973632554, false, (String) objArr6[0], null);
                }
                Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
                int i3 = ((int[]) objArr7[2])[0];
                int i4 = ((int[]) objArr7[0])[0];
                String[] strArr = (String[]) objArr7[3];
                int i5 = ~i;
                int i6 = (-1997990248) + (((~((-1088289025) | i5)) | (~((-735449097) | i))) * (-370)) + (((~(i5 | (-735449097))) | (~((-1088289025) | i)) | (-1809840393)) * (-370)) + 1026134449;
                int i7 = (i6 << 13) ^ i6;
                int i8 = i7 ^ (i7 >>> 17);
                objArr = new Object[]{new int[]{i4}, new int[]{i8 ^ (i8 << 5)}, new int[]{i3}, strArr};
            } else {
                Object[] objArr8 = new Object[1];
                c(new char[]{14, 0, '#', 30, 5, 18, '#', ' ', 14, 24, 25, ' ', 29, 0, 5, 19, 29, 19, 4, 19, 7, 11, Typography.quote, 17, 16, 30}, (byte) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 72), (ViewConfiguration.getJumpTapTimeout() >> 16) + 26, objArr8);
                Class<?> cls2 = Class.forName((String) objArr8[0]);
                Object[] objArr9 = new Object[1];
                c(new char[]{11, '#', 13924, 13924, 14, 4, 0, 25, 13926, 13926, 20, 18, 0, 17, 5, 19, 1, 3}, (byte) (TextUtils.indexOf("", "") + 124), (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 18, objArr9);
                Context applicationContext = (Context) cls2.getMethod((String) objArr9[0], new Class[0]).invoke(null, null);
                if (applicationContext != null) {
                    if (applicationContext instanceof ContextWrapper) {
                        int i9 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 63;
                        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i9 % 128;
                        if (i9 % 2 == 0) {
                            ((ContextWrapper) applicationContext).getBaseContext();
                            throw null;
                        }
                        if (((ContextWrapper) applicationContext).getBaseContext() != null) {
                            applicationContext = applicationContext.getApplicationContext();
                        } else {
                            applicationContext = null;
                        }
                    } else {
                        applicationContext = applicationContext.getApplicationContext();
                    }
                }
                Object[] objArr10 = new Object[1];
                c(new char[]{'\n', '\r', 6, 15, 14, 6, 6, 21, '\t', 15, 11, 15, 13905, 13905, '\r', '\f', '#', '\b', 22, '\f', 14, '#', 2, 14, 14, Typography.quote, '\t', 6, Typography.quote, 4, 21, 2, 0, 15, '\t', 1, 13821, 13821, 14, '\r', 11, 15, 19, 14, '\n', 15, 29, 16, '\r', 16, 14, '\r', 19, 14, '\b', '\t', 1, 15, 26, 14, '\t', '\n', '\b', '\t'}, (byte) (Color.blue(0) + 82), TextUtils.indexOf("", "") + 64, objArr10);
                String str = (String) objArr10[0];
                Object[] objArr11 = new Object[1];
                c(new char[]{0, 17, 30, 22, 16, '\f', 14, 2, 15, '\n', 14, '\t', '\r', '\n', '\b', 21, '\n', 25, 22, 24, 14, '#', 6, 21, 14, 26, '\t', 2, 27, 4, 1, 15, 2, '\t', 23, 17, 22, 14, '\r', 6, '\n', '\r', 6, 21, 2, 26, 13771, 13771, 4, 0, 13765, 13765, 14, 26, 25, '\n', 3, 11, '\b', 19, '\r', 16, 21, 6}, (byte) (34 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1))), TextUtils.indexOf((CharSequence) "", '0') + 65, objArr11);
                String[] strArr2 = {str, (String) objArr11[0]};
                int i10 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 9;
                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i10 % 128;
                int i11 = i10 % 2;
                try {
                    Object[] objArr12 = {applicationContext, strArr2, Integer.valueOf(i), 17, 652181683};
                    byte[] bArr4 = $$d;
                    byte b5 = bArr4[27];
                    byte b6 = (byte) (b5 - 1);
                    Object[] objArr13 = new Object[1];
                    d(b6, b6, (byte) (-b5), objArr13);
                    Class<?> cls3 = Class.forName((String) objArr13[0]);
                    byte b7 = bArr4[27];
                    byte b8 = b7;
                    Object[] objArr14 = new Object[1];
                    d(b7, b8, (byte) (b8 | 70), objArr14);
                    objArr = (Object[]) cls3.getMethod((String) objArr14[0], Context.class, String[].class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr12);
                    int i12 = ((int[]) objArr[0])[0];
                    int i13 = ((int[]) objArr[2])[0];
                    if (applicationContext != null) {
                        int i14 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 59;
                        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i14 % 128;
                        int i15 = i14 % 2;
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(560540673);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                            char cMyPid = (char) (37567 - (Process.myPid() >> 22));
                            int i16 = (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 624;
                            int i17 = 14 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
                            byte[] bArr5 = $$a;
                            byte b9 = bArr5[5];
                            Object[] objArr15 = new Object[1];
                            a(b9, bArr5[7], b9, objArr15);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(cMyPid, i16, i17, -973632554, false, (String) objArr15[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr);
                        try {
                            Object[] objArr16 = new Object[1];
                            c(new char[]{14, 0, '#', 30, 5, 18, '#', ' ', 6, 0, Typography.quote, 1, 18, Typography.quote, 4, '\r', 26, 15, 18, 1, 3, 23}, (byte) (ExpandableListView.getPackedPositionGroup(0L) + 21), 22 - View.combineMeasuredStates(0, 0), objArr16);
                            Class<?> cls4 = Class.forName((String) objArr16[0]);
                            Object[] objArr17 = new Object[1];
                            c(new char[]{'\r', 22, 14, 24, Typography.quote, '\f', '#', Typography.quote, 17, '\r', 25, 7, 21, 29, 13842}, (byte) ((-16777197) - Color.rgb(0, 0, 0)), 15 - Color.argb(0, 0, 0, 0), objArr17);
                            long jLongValue2 = ((Long) cls4.getDeclaredMethod((String) objArr17[0], new Class[0]).invoke(null, new Object[0])).longValue();
                            Long lValueOf = Long.valueOf(jLongValue2);
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(559617152);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                                char deadChar = (char) (37567 - KeyEvent.getDeadChar(0, 0));
                                int i18 = 626 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1));
                                int pressedStateDuration = (ViewConfiguration.getPressedStateDuration() >> 16) + 14;
                                byte[] bArr6 = $$a;
                                byte b10 = bArr6[7];
                                Object[] objArr18 = new Object[1];
                                a(b10, b10, bArr6[5], objArr18);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(deadChar, i18, pressedStateDuration, -976899241, false, (String) objArr18[0], null);
                            }
                            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                            Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(118372281);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                                char jumpTapTimeout = (char) ((ViewConfiguration.getJumpTapTimeout() >> 16) + 37567);
                                int iResolveSize = View.resolveSize(0, 0) + 625;
                                int offsetAfter = 14 - TextUtils.getOffsetAfter("", 0);
                                byte[] bArr7 = $$a;
                                byte b11 = bArr7[7];
                                Object[] objArr19 = new Object[1];
                                a(b11, bArr7[5], b11, objArr19);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(jumpTapTimeout, iResolveSize, offsetAfter, -477065106, false, (String) objArr19[0], null);
                            }
                            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf2);
                        } catch (Exception unused) {
                            throw new RuntimeException();
                        }
                    }
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause != null) {
                        throw cause;
                    }
                    throw th;
                }
            }
            if (((int[]) objArr[2])[0] != ((int[]) objArr[0])[0]) {
                ArrayList arrayList = new ArrayList();
                String[] strArr3 = (String[]) objArr[3];
                if (strArr3 == null) {
                    throw null;
                }
                for (String str2 : strArr3) {
                    arrayList.add(str2);
                }
                throw null;
            }
            int i19 = ((int[]) objArr[1])[0];
            int i20 = ((int[]) objArr[2])[0];
            int i21 = ((int[]) objArr[0])[0];
            String[] strArr4 = (String[]) objArr[3];
            int[] iArr = {i20};
            int i22 = ~((~((int) Process.getElapsedCpuTime())) | 809638599);
            int i23 = i19 + (((135302 | i22) * (-374)) - 232181290) + ((i22 | 809503297) * 374);
            int i24 = (i23 << 13) ^ i23;
            int i25 = i24 ^ (i24 >>> 17);
            ((int[]) objArr[1])[0] = i25 ^ (i25 << 5);
            Object[] objArr20 = {new int[]{i21}, new int[1], iArr, strArr4};
            this.duration = i;
            return this;
        }

        private static void c(char[] cArr, byte b2, int i, Object[] objArr) throws Throwable {
            int i2;
            Object obj;
            int i3 = 2 % 2;
            deInitSession deinitsession = new deInitSession();
            char[] cArr2 = b;
            int i4 = 1770390596;
            float f = 0.0f;
            Object obj2 = null;
            if (cArr2 != null) {
                int i5 = $10 + 79;
                $11 = i5 % 128;
                int i6 = i5 % 2;
                int length = cArr2.length;
                char[] cArr3 = new char[length];
                int i7 = 0;
                while (i7 < length) {
                    try {
                        Object[] objArr2 = {Integer.valueOf(cArr2[i7])};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(i4);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                            byte b3 = (byte) 0;
                            byte b4 = (byte) (b3 + 3);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (MotionEvent.axisFromString("") + 1), 2267 - (TypedValue.complexToFloat(0) > f ? 1 : (TypedValue.complexToFloat(0) == f ? 0 : -1)), KeyEvent.getDeadChar(0, 0) + 33, -1927765101, false, $$g(b3, b4, (byte) (b4 - 3)), new Class[]{Integer.TYPE});
                        }
                        cArr3[i7] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                        i7++;
                        i4 = 1770390596;
                        f = 0.0f;
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                }
                cArr2 = cArr3;
            }
            Object[] objArr3 = {Integer.valueOf(TuitionPaymentFragmentbindingInflater1)};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1770390596);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                byte b5 = (byte) 0;
                byte b6 = (byte) (b5 + 3);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (ViewConfiguration.getKeyRepeatDelay() >> 16), 2267 - (ViewConfiguration.getEdgeSlop() >> 16), (ViewConfiguration.getJumpTapTimeout() >> 16) + 33, -1927765101, false, $$g(b5, b6, (byte) (b6 - 3)), new Class[]{Integer.TYPE});
            }
            char cCharValue = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).charValue();
            char[] cArr4 = new char[i];
            if (i % 2 != 0) {
                int i8 = $10 + 79;
                $11 = i8 % 128;
                int i9 = i8 % 2;
                i2 = i - 1;
                cArr4[i2] = (char) (cArr[i2] - b2);
            } else {
                i2 = i;
            }
            if (i2 > 1) {
                deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
                while (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 < i2) {
                    deinitsession.b = cArr[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3];
                    deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = cArr[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1];
                    if (deinitsession.b == deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                        int i10 = $10 + 33;
                        $11 = i10 % 128;
                        if (i10 % 2 == 0) {
                            cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = (char) (deinitsession.b + b2);
                            cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 / 0] = (char) (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault2 % b2);
                        } else {
                            cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = (char) (deinitsession.b - b2);
                            cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = (char) (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault2 - b2);
                        }
                        obj = obj2;
                    } else {
                        try {
                            Object[] objArr4 = {deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession};
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(486174475);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                                byte b7 = (byte) 0;
                                byte b8 = (byte) (b7 + 2);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (49267 - TextUtils.indexOf("", "")), 3261 - TextUtils.indexOf("", "", 0, 0), 30 - View.MeasureSpec.makeMeasureSpec(0, 0), -127612708, false, $$g(b7, b8, (byte) (b8 - 2)), new Class[]{Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class});
                            }
                            if (((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4)).intValue() == deinitsession.asBinder) {
                                Object[] objArr5 = {deinitsession, deinitsession, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), deinitsession, Integer.valueOf(cCharValue), deinitsession};
                                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1187000607);
                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                                    byte b9 = (byte) 0;
                                    byte b10 = b9;
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (22878 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1))), (ViewConfiguration.getPressedStateDuration() >> 16) + 594, 17 - Color.red(0), 1570859318, false, $$g(b9, b10, b10), new Class[]{Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Integer.TYPE, Object.class});
                                }
                                obj = null;
                                int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).intValue();
                                int i11 = (deinitsession.TuitionPaymentFragmentbindingInflater1 * cCharValue) + deinitsession.asBinder;
                                cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr2[iIntValue];
                                cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = cArr2[i11];
                            } else {
                                obj = null;
                                if (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault1 == deinitsession.TuitionPaymentFragmentbindingInflater1) {
                                    deinitsession.g = ((deinitsession.g + cCharValue) - 1) % cCharValue;
                                    deinitsession.asBinder = ((deinitsession.asBinder + cCharValue) - 1) % cCharValue;
                                    int i12 = (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault1 * cCharValue) + deinitsession.g;
                                    int i13 = (deinitsession.TuitionPaymentFragmentbindingInflater1 * cCharValue) + deinitsession.asBinder;
                                    cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr2[i12];
                                    cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = cArr2[i13];
                                } else {
                                    int i14 = (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault1 * cCharValue) + deinitsession.asBinder;
                                    int i15 = (deinitsession.TuitionPaymentFragmentbindingInflater1 * cCharValue) + deinitsession.g;
                                    cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr2[i14];
                                    cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = cArr2[i15];
                                }
                            }
                        } catch (Throwable th2) {
                            Throwable cause2 = th2.getCause();
                            if (cause2 == null) {
                                throw th2;
                            }
                            throw cause2;
                        }
                    }
                    deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 += 2;
                    obj2 = obj;
                }
            }
            for (int i16 = 0; i16 < i; i16++) {
                int i17 = $11 + 31;
                $10 = i17 % 128;
                int i18 = i17 % 2;
                cArr4[i16] = (char) (cArr4[i16] ^ 13722);
            }
            objArr[0] = new String(cArr4);
        }

        private Builder(View view, String str) {
            this.view = view;
            this.text = str;
        }

        static /* synthetic */ View access$000(Builder builder) {
            int i = 2 % 2;
            int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            int i3 = i2 + 67;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i3 % 128;
            int i4 = i3 % 2;
            View view = builder.view;
            if (i4 != 0) {
                int i5 = 38 / 0;
            }
            int i6 = i2 + 97;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i6 % 128;
            if (i6 % 2 == 0) {
                return view;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public static Builder with(View view, int i) {
            int i2 = 2 % 2;
            int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 23;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3 % 128;
            int i4 = i3 % 2;
            String string = view.getContext().getString(i);
            if (i4 != 0) {
                return with(view, string);
            }
            with(view, string);
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public static Builder with(View view, String str) {
            int i = 2 % 2;
            Builder builder = new Builder(view, str);
            int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 7;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
            if (i2 % 2 == 0) {
                return builder;
            }
            throw null;
        }

        public SnackbarOnDeniedPermissionListener build() {
            int i = 2 % 2;
            SnackbarOnDeniedPermissionListener snackbarOnDeniedPermissionListener = new SnackbarOnDeniedPermissionListener(this.view, this.text, this.buttonText, this.onClickListener, this.snackbarCallback, this.duration);
            int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 95;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
            if (i2 % 2 != 0) {
                return snackbarOnDeniedPermissionListener;
            }
            throw null;
        }

        public Builder withButton(int i, View.OnClickListener onClickListener) {
            int i2 = 2 % 2;
            int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i3 % 128;
            int i4 = i3 % 2;
            Builder builderWithButton = withButton(this.view.getContext().getString(i), onClickListener);
            int i5 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 73;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i5 % 128;
            int i6 = i5 % 2;
            return builderWithButton;
        }

        public Builder withButton(String str, View.OnClickListener onClickListener) {
            int i = 2 % 2;
            int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 119;
            int i3 = i2 % 128;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i3;
            int i4 = i2 % 2;
            this.buttonText = str;
            this.onClickListener = onClickListener;
            if (i4 != 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            int i5 = i3 + 45;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i5 % 128;
            int i6 = i5 % 2;
            return this;
        }

        public Builder withCallback(Snackbar.Callback callback) {
            int i = 2 % 2;
            int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            int i3 = i2 + 45;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3 % 128;
            int i4 = i3 % 2;
            this.snackbarCallback = callback;
            if (i4 == 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            int i5 = i2 + 15;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i5 % 128;
            int i6 = i5 % 2;
            return this;
        }

        public Builder withOpenSettingsButton(int i) {
            int i2 = 2 % 2;
            int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 65;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3 % 128;
            int i4 = i3 % 2;
            Builder builderWithOpenSettingsButton = withOpenSettingsButton(this.view.getContext().getString(i));
            int i5 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 39;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i5 % 128;
            int i6 = i5 % 2;
            return builderWithOpenSettingsButton;
        }

        public Builder withOpenSettingsButton(String str) {
            int i = 2 % 2;
            this.buttonText = str;
            this.onClickListener = new View.OnClickListener() { // from class: com.karumi.dexter.listener.single.SnackbarOnDeniedPermissionListener.Builder.1
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(view);
                    try {
                        Context context = Builder.access$000(Builder.this).getContext();
                        StringBuilder sb = new StringBuilder("package:");
                        sb.append(context.getPackageName());
                        Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS", Uri.parse(sb.toString()));
                        intent.addCategory("android.intent.category.DEFAULT");
                        intent.setFlags(268435456);
                        context.startActivity(intent);
                    } finally {
                        ViewPortBuilder.b();
                    }
                }
            };
            int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 67;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 4 / 0;
            }
            return this;
        }

        /* JADX WARN: Code duplicated, block: B:10:0x0024  */
        /* JADX WARN: Code duplicated, block: B:8:0x001e  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x0026). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0024
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        private static java.lang.String $$g(short r6, byte r7, short r8) {
            /*
                byte[] r0 = com.karumi.dexter.listener.single.SnackbarOnDeniedPermissionListener.Builder.$$c
                int r6 = r6 * 2
                int r6 = 3 - r6
                int r7 = 116 - r7
                int r8 = r8 * 3
                int r8 = 1 - r8
                byte[] r1 = new byte[r8]
                r2 = 0
                if (r0 != 0) goto L14
                r3 = r8
                r4 = r2
                goto L26
            L14:
                r3 = r2
            L15:
                int r6 = r6 + 1
                int r4 = r3 + 1
                byte r5 = (byte) r7
                r1[r3] = r5
                if (r4 != r8) goto L24
                java.lang.String r6 = new java.lang.String
                r6.<init>(r1, r2)
                return r6
            L24:
                r3 = r0[r6]
            L26:
                int r3 = -r3
                int r7 = r7 + r3
                r3 = r4
                goto L15
            */
            throw new UnsupportedOperationException("Method not decompiled: com.karumi.dexter.listener.single.SnackbarOnDeniedPermissionListener.Builder.$$g(short, byte, short):java.lang.String");
        }
    }
}
