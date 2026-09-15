package com.google.android.material.sidesheet;

import android.content.Context;
import android.content.ContextWrapper;
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
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.ExpandableListView;
import android.widget.FrameLayout;
import android.widget.Toast;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.google.android.material.R;
import defpackage.SessionConfigValidatingBuilderExternalSyntheticLambda0;
import defpackage.initSession;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import kotlin.io.encoding.Base64;

/* JADX INFO: loaded from: classes6.dex */
public class SideSheetDialog extends SheetDialog<SideSheetCallback> {
    private static final int SIDE_SHEET_DIALOG_DEFAULT_THEME_RES;
    private static final int SIDE_SHEET_DIALOG_THEME_ATTR;
    private static int TuitionPaymentFragmentbindingInflater1;
    private static byte[] TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    private static int asInterface;
    private static short[] b;
    private static final byte[] $$c = {5, 11, -122, -94};
    private static final int $$f = 136;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$d = {5, -91, 77, 46, -16, -2, 59, -56, -18, 2, -13, -5, 5, -14, 67, -58, -1, -23, 15, 47, -73, 6, -8, -12, 5, 7, -23, 7, -10, -3, 60, -67, -6, 7, -5, -11, 58, -72, 9, -18, -1, -3, -3, -9, 10, 51, -41, -26, -8, -12, 5, 7, -22, 6, 27, -42, -37, 8, -15, 7, -10, -3, 26, -21, -28, 8, 4, -13, -10, 42, -48, 13, -10, -10, 4, -13, -10, -3, -1, 7, -2, -10, 4, -15, -1, -9, -2, -1, -9, 5, -3, -22, 9, 0, -22, 38, -38, 7, -5, -11, 4, -5, -5, 1, -24, 5, -12, 63, -16, -2, 59, -65, -8, -10, -2, 7, -5, -6, 3, -21, -3, -4, 15, 47, -55, -22, -10, 7, 7, 49, -23, -54, -10, 7, 7, 12, -22, -17, -8, 13, -17, 74, -21, 13, -21, -37, 8, -15, 7, -10, -3, 26, -21, -28, 8, 4, -13, -10, 42, -48, 13, -10, -10, 4, -13, -10, -3, -1, 7, -2, -10, 4, -15, -1, -9, -2, -1, -9, 5, -3, -22, 9, 0, -22, 38, -38, 7, -5, -11, 4, -5, -5, 1, -24, 5, -12, 62};
    private static final int $$e = 24;
    private static final byte[] $$a = {119, -103, 14, -22, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 56, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 54, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, 7, -18, -16, -1, -16, -16, -4, 19, -48, -3, -17, 0, -30, 4, -24, 54};
    private static final int $$b = 231;
    private static int g = 0;
    private static int asBinder = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f806a = 1;

    /* JADX WARN: Code duplicated, block: B:10:0x0024  */
    /* JADX WARN: Code duplicated, block: B:8:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x0029). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0024
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void c(byte r6, int r7, short r8, java.lang.Object[] r9) {
        /*
            int r0 = 53 - r8
            byte[] r1 = com.google.android.material.sidesheet.SideSheetDialog.$$a
            int r7 = r7 + 84
            int r6 = r6 * 52
            int r6 = 108 - r6
            byte[] r0 = new byte[r0]
            int r8 = 52 - r8
            r2 = 0
            if (r1 != 0) goto L14
            r3 = r8
            r4 = r2
            goto L29
        L14:
            r3 = r2
        L15:
            byte r4 = (byte) r7
            r0[r3] = r4
            int r4 = r3 + 1
            if (r3 != r8) goto L24
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            r9[r2] = r6
            return
        L24:
            r3 = r1[r6]
            r5 = r3
            r3 = r7
            r7 = r5
        L29:
            int r7 = -r7
            int r6 = r6 + 1
            int r3 = r3 + r7
            int r7 = r3 + (-11)
            r3 = r4
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.sidesheet.SideSheetDialog.c(byte, int, short, java.lang.Object[]):void");
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0025  */
    /* JADX WARN: Code duplicated, block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002d). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0025
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void e(short r6, short r7, short r8, java.lang.Object[] r9) {
        /*
            int r7 = r7 + 4
            byte[] r0 = com.google.android.material.sidesheet.SideSheetDialog.$$d
            int r8 = r8 * 15
            int r1 = 53 - r8
            int r6 = r6 * 15
            int r6 = 99 - r6
            byte[] r1 = new byte[r1]
            int r8 = 52 - r8
            r2 = 0
            if (r0 != 0) goto L17
            r3 = r7
            r6 = r8
            r4 = r2
            goto L2d
        L17:
            r3 = r2
        L18:
            byte r4 = (byte) r6
            r1[r3] = r4
            if (r3 != r8) goto L25
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L25:
            int r3 = r3 + 1
            r4 = r0[r7]
            r5 = r3
            r3 = r7
            r7 = r4
            r4 = r5
        L2d:
            int r7 = -r7
            int r6 = r6 + r7
            int r7 = r3 + 1
            int r6 = r6 + (-4)
            r3 = r4
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.sidesheet.SideSheetDialog.e(short, short, short, java.lang.Object[]):void");
    }

    @Override // com.google.android.material.sidesheet.SheetDialog, android.app.Dialog, android.content.DialogInterface
    public /* bridge */ /* synthetic */ void cancel() {
        int i = 2 % 2;
        int i2 = g + 5;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        super.cancel();
        if (i3 == 0) {
            int i4 = 3 / 0;
        }
    }

    @Override // com.google.android.material.sidesheet.SheetDialog
    public /* bridge */ /* synthetic */ Sheet getBehavior() {
        SideSheetBehavior<? extends View> behavior;
        int i = 2 % 2;
        int i2 = asBinder + 121;
        g = i2 % 128;
        if (i2 % 2 != 0) {
            behavior = getBehavior();
            int i3 = 99 / 0;
        } else {
            behavior = getBehavior();
        }
        int i4 = asBinder + 43;
        g = i4 % 128;
        int i5 = i4 % 2;
        return behavior;
    }

    @Override // com.google.android.material.sidesheet.SheetDialog
    public /* bridge */ /* synthetic */ boolean isDismissWithSheetAnimationEnabled() {
        int i = 2 % 2;
        int i2 = g + 119;
        asBinder = i2 % 128;
        if (i2 % 2 == 0) {
            super.isDismissWithSheetAnimationEnabled();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        boolean zIsDismissWithSheetAnimationEnabled = super.isDismissWithSheetAnimationEnabled();
        int i3 = asBinder + 7;
        g = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 59 / 0;
        }
        return zIsDismissWithSheetAnimationEnabled;
    }

    @Override // com.google.android.material.sidesheet.SheetDialog, android.app.Dialog, android.view.Window.Callback
    public /* bridge */ /* synthetic */ void onAttachedToWindow() {
        int i = 2 % 2;
        int i2 = asBinder + 3;
        g = i2 % 128;
        int i3 = i2 % 2;
        super.onAttachedToWindow();
        int i4 = g + 73;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // com.google.android.material.sidesheet.SheetDialog, android.app.Dialog, android.view.Window.Callback
    public /* bridge */ /* synthetic */ void onDetachedFromWindow() {
        int i = 2 % 2;
        int i2 = asBinder + 15;
        g = i2 % 128;
        int i3 = i2 % 2;
        super.onDetachedFromWindow();
        int i4 = asBinder + 11;
        g = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    @Override // com.google.android.material.sidesheet.SheetDialog, android.app.Dialog
    public /* bridge */ /* synthetic */ void setCancelable(boolean z) {
        int i = 2 % 2;
        int i2 = g + 75;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        super.setCancelable(z);
        if (i3 == 0) {
            throw null;
        }
    }

    @Override // com.google.android.material.sidesheet.SheetDialog, android.app.Dialog
    public /* bridge */ /* synthetic */ void setCanceledOnTouchOutside(boolean z) {
        int i = 2 % 2;
        int i2 = g + 99;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        super.setCanceledOnTouchOutside(z);
        if (i3 == 0) {
            throw null;
        }
    }

    @Override // com.google.android.material.sidesheet.SheetDialog, androidx.appcompat.app.AppCompatDialog, androidx.view.ComponentDialog, android.app.Dialog
    public /* bridge */ /* synthetic */ void setContentView(int i) {
        int i2 = 2 % 2;
        int i3 = asBinder + 45;
        g = i3 % 128;
        int i4 = i3 % 2;
        super.setContentView(i);
        int i5 = g + 109;
        asBinder = i5 % 128;
        int i6 = i5 % 2;
    }

    /* JADX WARN: Code duplicated, block: B:42:0x01b5 A[PHI: r0
  0x01b5: PHI (r0v9 int) = (r0v8 int), (r0v35 int) binds: [B:41:0x01b3, B:38:0x01a1] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:43:0x01b7 A[PHI: r0
  0x01b7: PHI (r0v32 int) = (r0v8 int), (r0v35 int) binds: [B:41:0x01b3, B:38:0x01a1] A[DONT_GENERATE, DONT_INLINE]] */
    private static void d(int i, int i2, short s, byte b2, int i3, Object[] objArr) throws Throwable {
        boolean z;
        int i4;
        int i5;
        int length;
        byte[] bArr;
        int i6;
        int i7 = 2 % 2;
        SessionConfigValidatingBuilderExternalSyntheticLambda0 sessionConfigValidatingBuilderExternalSyntheticLambda0 = new SessionConfigValidatingBuilderExternalSyntheticLambda0();
        StringBuilder sb = new StringBuilder();
        try {
            Object[] objArr2 = {Integer.valueOf(i2), Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault2)};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1238528667);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                byte b3 = (byte) 0;
                byte b4 = b3;
                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) Drawable.resolveOpacity(0, 0), 2268 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), (ViewConfiguration.getPressedStateDuration() >> 16) + 33, 1387473586, false, $$g(b3, b4, b4), new Class[]{Integer.TYPE, Integer.TYPE});
            }
            int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).intValue();
            if (iIntValue == -1) {
                z = true;
            } else {
                int i8 = $11 + 59;
                $10 = i8 % 128;
                int i9 = i8 % 2;
                z = false;
            }
            if (z) {
                int i10 = $11 + 29;
                int i11 = i10 % 128;
                $10 = i11;
                int i12 = i10 % 2;
                byte[] bArr2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                if (bArr2 != null) {
                    int i13 = i11 + 115;
                    $11 = i13 % 128;
                    if (i13 % 2 == 0) {
                        length = bArr2.length;
                        bArr = new byte[length];
                        i6 = 1;
                    } else {
                        length = bArr2.length;
                        bArr = new byte[length];
                        i6 = 0;
                    }
                    while (i6 < length) {
                        Object[] objArr3 = {Integer.valueOf(bArr2[i6])};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(632534666);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                            byte b5 = (byte) 0;
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) Color.green(0), 3358 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), 18 - View.MeasureSpec.getSize(0), -1054011043, false, $$g(b5, b5, (byte) $$c.length), new Class[]{Integer.TYPE});
                        }
                        bArr[i6] = ((Byte) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).byteValue();
                        i6++;
                    }
                    bArr2 = bArr;
                }
                if (bArr2 != null) {
                    byte[] bArr3 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                    Object[] objArr4 = {Integer.valueOf(i3), Integer.valueOf(TuitionPaymentFragmentbindingInflater1)};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1238528667);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                        byte b6 = (byte) 0;
                        byte b7 = b6;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (ViewConfiguration.getTouchSlop() >> 8), View.resolveSize(0, 0) + 2267, 33 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), 1387473586, false, $$g(b6, b7, b7), new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    iIntValue = (byte) (((byte) (((long) bArr3[((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4)).intValue()]) ^ 3046761265686732006L)) + ((int) (((long) TuitionPaymentFragmentspecialinlinedviewModeldefault2) ^ 3046761265686732006L)));
                } else {
                    iIntValue = (short) (((short) (((long) b[i3 + ((int) (((long) TuitionPaymentFragmentbindingInflater1) ^ 3046761265686732006L))]) ^ 3046761265686732006L)) + ((int) (((long) TuitionPaymentFragmentspecialinlinedviewModeldefault2) ^ 3046761265686732006L)));
                }
            }
            if (iIntValue > 0) {
                int i14 = $11 + 123;
                $10 = i14 % 128;
                if (i14 % 2 != 0) {
                    i4 = ((i3 >> iIntValue) - 4) << ((int) (((long) TuitionPaymentFragmentbindingInflater1) + 3046761265686732006L));
                    if (z) {
                        i5 = 1;
                    } else {
                        i5 = 0;
                    }
                } else {
                    i4 = ((i3 + iIntValue) - 2) + ((int) (((long) TuitionPaymentFragmentbindingInflater1) ^ 3046761265686732006L));
                    if (z) {
                        i5 = 1;
                    } else {
                        i5 = 0;
                    }
                }
                sessionConfigValidatingBuilderExternalSyntheticLambda0.b = i4 + i5;
                try {
                    Object[] objArr5 = {sessionConfigValidatingBuilderExternalSyntheticLambda0, Integer.valueOf(i), Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault3), sb};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1079014435);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        byte b8 = (byte) 0;
                        byte b9 = b8;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (55905 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))), (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 2854, ((Process.getThreadPriority(0) + 20) >> 6) + 13, -1529949196, false, $$g(b8, b9, (byte) (b9 + 1)), new Class[]{Object.class, Integer.TYPE, Integer.TYPE, Object.class});
                    }
                    ((StringBuilder) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).append(sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
                    sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                    byte[] bArr4 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                    if (bArr4 != null) {
                        int length2 = bArr4.length;
                        byte[] bArr5 = new byte[length2];
                        for (int i15 = 0; i15 < length2; i15++) {
                            bArr5[i15] = (byte) (((long) bArr4[i15]) ^ 3046761265686732006L);
                        }
                        bArr4 = bArr5;
                    }
                    boolean z2 = bArr4 != null;
                    sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 1;
                    while (sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3 < iIntValue) {
                        if (z2) {
                            int i16 = $11 + 11;
                            $10 = i16 % 128;
                            int i17 = i16 % 2;
                            byte[] bArr6 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                            int i18 = sessionConfigValidatingBuilderExternalSyntheticLambda0.b;
                            sessionConfigValidatingBuilderExternalSyntheticLambda0.b = i18 - 1;
                            sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = (char) (sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2 + (((byte) (((byte) (((long) bArr6[i18]) ^ 3046761265686732006L)) + s)) ^ b2));
                            int i19 = $11 + 117;
                            $10 = i19 % 128;
                            if (i19 % 2 != 0) {
                                int i20 = 4 / 3;
                            }
                        } else {
                            short[] sArr = b;
                            int i21 = sessionConfigValidatingBuilderExternalSyntheticLambda0.b;
                            sessionConfigValidatingBuilderExternalSyntheticLambda0.b = i21 - 1;
                            sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = (char) (sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2 + (((short) (((short) (((long) sArr[i21]) ^ 3046761265686732006L)) + s)) ^ b2));
                        }
                        sb.append(sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
                        sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                        sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3++;
                    }
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
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

    /* JADX WARN: Code duplicated, block: B:26:0x027b  */
    /* JADX WARN: Code duplicated, block: B:27:0x0280  */
    @Override // com.google.android.material.sidesheet.SheetDialog, androidx.appcompat.app.AppCompatDialog, androidx.view.ComponentDialog, android.app.Dialog
    public /* bridge */ /* synthetic */ void setContentView(View view) throws Throwable {
        Object[] objArr;
        int i = 2 % 2;
        int i2 = asBinder + 89;
        g = i2 % 128;
        int i3 = i2 % 2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char deadChar = (char) (31533 - KeyEvent.getDeadChar(0, 0));
            int tapTimeout = (ViewConfiguration.getTapTimeout() >> 16) + 921;
            int touchSlop = (ViewConfiguration.getTouchSlop() >> 8) + 28;
            byte[] bArr = $$a;
            Object[] objArr2 = new Object[1];
            c(bArr[40], bArr[2], (byte) 52, objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(deadChar, tapTimeout, touchSlop, -1048449946, false, (String) objArr2[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr3 = new Object[1];
        d(421095299 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), (-81) - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), (short) TextUtils.getOffsetAfter("", 0), (byte) ((-1) - TextUtils.indexOf((CharSequence) "", '0', 0, 0)), (-252466244) - View.resolveSize(0, 0), objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        d(Color.argb(0, 0, 0, 0) + 421095303, (-81) - (ViewConfiguration.getKeyRepeatDelay() >> 16), (short) Color.red(0), (byte) (Process.myTid() >> 22), Process.getGidForName("") - 252466221, objArr4);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(889369593);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char cAxisFromString = (char) (31532 - MotionEvent.axisFromString(""));
            int iCombineMeasuredStates = 921 - View.combineMeasuredStates(0, 0);
            int iResolveSize = View.resolveSize(0, 0) + 28;
            byte[] bArr2 = $$a;
            byte b2 = bArr2[5];
            byte b3 = bArr2[7];
            Object[] objArr5 = new Object[1];
            c(b2, b3, b3, objArr5);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cAxisFromString, iCombineMeasuredStates, iResolveSize, -778300370, false, (String) objArr5[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            int i4 = asBinder + 47;
            g = i4 % 128;
            int i5 = i4 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char cResolveOpacity = (char) (31533 - Drawable.resolveOpacity(0, 0));
                int i6 = (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 921;
                int iNormalizeMetaState = 28 - KeyEvent.normalizeMetaState(0);
                byte b4 = $$a[7];
                byte b5 = b4;
                Object[] objArr6 = new Object[1];
                c(b4, b5, (byte) (b5 | 15), objArr6);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(cResolveOpacity, i6, iNormalizeMetaState, -1142834547, false, (String) objArr6[0], null);
            }
            Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            objArr = new Object[]{new int[1], new int[]{((int[]) objArr7[1])[0]}, (Object[]) objArr7[2], new int[]{((int[]) objArr7[3])[0]}, (String[]) objArr7[4]};
            int iIdentityHashCode = System.identityHashCode(this);
            int i7 = ((~(iIdentityHashCode | 1740238235)) * TypedValues.CycleType.TYPE_EASING) + 1311309451 + (((~((~iIdentityHashCode) | 1740238235)) | 33579264) * TypedValues.CycleType.TYPE_EASING) + 1356595362;
            int i8 = (i7 << 13) ^ i7;
            int i9 = i8 ^ (i8 >>> 17);
            ((int[]) objArr[0])[0] = i9 ^ (i9 << 5);
        } else {
            Object[] objArr8 = new Object[1];
            d(421095300 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), (-81) - (ViewConfiguration.getFadingEdgeLength() >> 16), (short) (TextUtils.lastIndexOf("", '0') + 1), (byte) (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), TextUtils.getCapsMode("", 0, 0) - 252466207, objArr8);
            Class<?> cls2 = Class.forName((String) objArr8[0]);
            Object[] objArr9 = new Object[1];
            d(421095301 - View.MeasureSpec.getSize(0), (ViewConfiguration.getFadingEdgeLength() >> 16) - 81, (short) View.MeasureSpec.getMode(0), (byte) (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), Color.green(0) - 252466181, objArr9);
            Context applicationContext = (Context) cls2.getMethod((String) objArr9[0], new Class[0]).invoke(null, null);
            if (applicationContext != null) {
                if (!(applicationContext instanceof ContextWrapper)) {
                    applicationContext = applicationContext.getApplicationContext();
                } else {
                    int i10 = asBinder + 19;
                    g = i10 % 128;
                    if (i10 % 2 != 0) {
                        int i11 = 84 / 0;
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
                }
            }
            Object[] objArr10 = new Object[1];
            d(421095307 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), (-81) - View.resolveSize(0, 0), (short) KeyEvent.getDeadChar(0, 0), (byte) View.MeasureSpec.makeMeasureSpec(0, 0), (-252466162) - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), objArr10);
            Class<?> cls3 = Class.forName((String) objArr10[0]);
            Object[] objArr11 = new Object[1];
            d(TextUtils.indexOf("", "") + 421095307, (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) - 81, (short) (ViewConfiguration.getTouchSlop() >> 8), (byte) (ViewConfiguration.getPressedStateDuration() >> 16), MotionEvent.axisFromString("") - 252466146, objArr11);
            int iIntValue = ((Integer) cls3.getMethod((String) objArr11[0], Object.class).invoke(null, this)).intValue();
            int i12 = g + 29;
            asBinder = i12 % 128;
            int i13 = i12 % 2;
            try {
                Object[] objArr12 = {applicationContext, Integer.valueOf(iIntValue), 0, 1356595362};
                byte[] bArr3 = $$d;
                byte b6 = bArr3[93];
                Object[] objArr13 = new Object[1];
                e(b6, (short) (b6 | 104), bArr3[103], objArr13);
                Class<?> cls4 = Class.forName((String) objArr13[0]);
                byte b7 = bArr3[103];
                Object[] objArr14 = new Object[1];
                e(b7, (short) (b7 | 140), bArr3[93], objArr14);
                objArr = (Object[]) cls4.getMethod((String) objArr14[0], Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr12);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    char c = (char) (31533 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)));
                    int i14 = (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 920;
                    int i15 = 29 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1));
                    byte b8 = $$a[7];
                    byte b9 = b8;
                    Object[] objArr15 = new Object[1];
                    c(b8, b9, (byte) (b9 | 15), objArr15);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(c, i14, i15, -1142834547, false, (String) objArr15[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr);
                try {
                    Object[] objArr16 = new Object[1];
                    d((ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 421095299, (ViewConfiguration.getPressedStateDuration() >> 16) - 81, (short) (Process.myTid() >> 22), (byte) ((-1) - MotionEvent.axisFromString("")), (-252466245) - TextUtils.lastIndexOf("", '0', 0), objArr16);
                    Class<?> cls5 = Class.forName((String) objArr16[0]);
                    Object[] objArr17 = new Object[1];
                    d(421095303 - ((Process.getThreadPriority(0) + 20) >> 6), TextUtils.indexOf((CharSequence) "", '0', 0, 0) - 80, (short) Color.alpha(0), (byte) Color.green(0), (ViewConfiguration.getScrollBarFadeDuration() >> 16) - 252466222, objArr17);
                    long jLongValue2 = ((Long) cls5.getDeclaredMethod((String) objArr17[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue2);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(889369593);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                        char c2 = (char) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 31532);
                        int iResolveOpacity = 921 - Drawable.resolveOpacity(0, 0);
                        int iIndexOf = 27 - TextUtils.indexOf((CharSequence) "", '0', 0, 0);
                        byte[] bArr4 = $$a;
                        byte b10 = bArr4[5];
                        byte b11 = bArr4[7];
                        Object[] objArr18 = new Object[1];
                        c(b10, b11, b11, objArr18);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(c2, iResolveOpacity, iIndexOf, -778300370, false, (String) objArr18[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                        char c3 = (char) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 31532);
                        int i16 = 922 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1));
                        int windowTouchSlop = 28 - (ViewConfiguration.getWindowTouchSlop() >> 8);
                        byte[] bArr5 = $$a;
                        Object[] objArr19 = new Object[1];
                        c(bArr5[40], bArr5[2], (byte) 52, objArr19);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(c3, i16, windowTouchSlop, -1048449946, false, (String) objArr19[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf2);
                    int i17 = asBinder + 49;
                    g = i17 % 128;
                    int i18 = i17 % 2;
                } catch (Exception unused) {
                    throw new RuntimeException();
                }
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        int i19 = ((int[]) objArr[1])[0];
        int i20 = ((int[]) objArr[3])[0];
        if (i20 == i19) {
            int i21 = ((int[]) objArr[0])[0];
            Object[] objArr20 = {new int[1], new int[]{((int[]) objArr[1])[0]}, (Object[]) objArr[2], new int[]{((int[]) objArr[3])[0]}, (String[]) objArr[4]};
            int iUptimeMillis = (int) SystemClock.uptimeMillis();
            int i22 = ~iUptimeMillis;
            int i23 = i21 + 629391503 + (((~(890059439 | i22)) | 11534656) * (-108)) + (((~(i22 | 884020204)) | (~((-884020205) | iUptimeMillis)) | 17573891) * 54) + ((iUptimeMillis | 17573891) * 54);
            int i24 = (i23 << 13) ^ i23;
            int i25 = i24 ^ (i24 >>> 17);
            ((int[]) objArr20[0])[0] = i25 ^ (i25 << 5);
            int i26 = asBinder + 1;
            g = i26 % 128;
            int i27 = i26 % 2;
        } else {
            ArrayList arrayList = new ArrayList();
            String[] strArr = (String[]) objArr[4];
            if (strArr != null) {
                for (String str : strArr) {
                    arrayList.add(str);
                }
            }
            int[] iArr = new int[i20];
            int i28 = i20 - 1;
            iArr[i28] = 1;
            Toast.makeText((Context) null, iArr[((i20 * i28) % 2) - 1], 1).show();
            int i29 = ((int[]) objArr[0])[0];
            Object[] objArr21 = {new int[1], new int[]{((int[]) objArr[1])[0]}, (Object[]) objArr[2], new int[]{((int[]) objArr[3])[0]}, (String[]) objArr[4]};
            int iIdentityHashCode2 = System.identityHashCode(this);
            int i30 = (-403930261) + (((~((-337531577) | iIdentityHashCode2)) | 337531552 | (~((-1436548068) | iIdentityHashCode2))) * (-880));
            int i31 = (~((-337531577) | (~iIdentityHashCode2))) | 1436548067;
            int i32 = ~(iIdentityHashCode2 | 337531576);
            int i33 = i29 + i30 + ((i31 | i32) * (-880)) + (i32 * 880);
            int i34 = (i33 << 13) ^ i33;
            int i35 = i34 ^ (i34 >>> 17);
            ((int[]) objArr21[0])[0] = i35 ^ (i35 << 5);
        }
        super.setContentView(view);
    }

    @Override // com.google.android.material.sidesheet.SheetDialog, androidx.appcompat.app.AppCompatDialog, androidx.view.ComponentDialog, android.app.Dialog
    public /* bridge */ /* synthetic */ void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        int i = 2 % 2;
        int i2 = asBinder + 51;
        g = i2 % 128;
        int i3 = i2 % 2;
        super.setContentView(view, layoutParams);
        if (i3 != 0) {
            throw null;
        }
    }

    @Override // com.google.android.material.sidesheet.SheetDialog
    public /* bridge */ /* synthetic */ void setDismissWithSheetAnimationEnabled(boolean z) {
        int i = 2 % 2;
        int i2 = asBinder + 9;
        g = i2 % 128;
        int i3 = i2 % 2;
        super.setDismissWithSheetAnimationEnabled(z);
        int i4 = asBinder + 85;
        g = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // com.google.android.material.sidesheet.SheetDialog
    public /* bridge */ /* synthetic */ void setSheetEdge(int i) {
        int i2 = 2 % 2;
        int i3 = asBinder + 31;
        g = i3 % 128;
        int i4 = i3 % 2;
        super.setSheetEdge(i);
        int i5 = g + 37;
        asBinder = i5 % 128;
        int i6 = i5 % 2;
    }

    static {
        asInterface = 0;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        SIDE_SHEET_DIALOG_THEME_ATTR = R.attr.sideSheetDialogTheme;
        SIDE_SHEET_DIALOG_DEFAULT_THEME_RES = R.style.Theme_Material3_Light_SideSheetDialog;
        int i = f806a + 15;
        asInterface = i % 128;
        if (i % 2 != 0) {
            int i2 = 98 / 0;
        }
    }

    public SideSheetDialog(Context context) {
        this(context, 0);
    }

    public SideSheetDialog(Context context, int i) {
        super(context, i, SIDE_SHEET_DIALOG_THEME_ATTR, SIDE_SHEET_DIALOG_DEFAULT_THEME_RES);
    }

    @Override // com.google.android.material.sidesheet.SheetDialog
    void addSheetCancelOnHideCallback(Sheet<SideSheetCallback> sheet) {
        int i = 2 % 2;
        sheet.addCallback(new SideSheetCallback() { // from class: com.google.android.material.sidesheet.SideSheetDialog.1
            @Override // com.google.android.material.sidesheet.SideSheetCallback, com.google.android.material.sidesheet.SheetCallback
            public void onSlide(View view, float f) {
            }

            @Override // com.google.android.material.sidesheet.SideSheetCallback, com.google.android.material.sidesheet.SheetCallback
            public void onStateChanged(View view, int i2) {
                if (i2 == 5) {
                    SideSheetDialog.this.cancel();
                }
            }
        });
        int i2 = asBinder + 17;
        g = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    @Override // com.google.android.material.sidesheet.SheetDialog
    int getLayoutResId() {
        int i = 2 % 2;
        int i2 = asBinder + 27;
        g = i2 % 128;
        int i3 = i2 % 2;
        int i4 = R.layout.m3_side_sheet_dialog;
        if (i3 == 0) {
            return i4;
        }
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0273  */
    @Override // com.google.android.material.sidesheet.SheetDialog
    int getDialogId() throws Throwable {
        Object[] objArr;
        int i = 2 % 2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-342512172);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char c = (char) (1 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)));
            int iIndexOf = 876 - TextUtils.indexOf("", "", 0);
            int i2 = 11 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1));
            byte[] bArr = $$a;
            Object[] objArr2 = new Object[1];
            c(bArr[40], bArr[2], (byte) 52, objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(c, iIndexOf, i2, 252381699, false, (String) objArr2[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr3 = new Object[1];
        d(TextUtils.indexOf("", "") + 421095299, (-81) - TextUtils.getOffsetAfter("", 0), (short) TextUtils.indexOf("", "", 0, 0), (byte) (1 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))), View.combineMeasuredStates(0, 0) - 252466244, objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        d(((byte) KeyEvent.getModifierMetaStateMask()) + 421095304, View.MeasureSpec.makeMeasureSpec(0, 0) - 81, (short) (ViewConfiguration.getDoubleTapTimeout() >> 16), (byte) TextUtils.indexOf("", ""), ExpandableListView.getPackedPositionGroup(0L) - 252466222, objArr4);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1823069286);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char fadingEdgeLength = (char) (ViewConfiguration.getFadingEdgeLength() >> 16);
            int i3 = (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 875;
            int absoluteGravity = Gravity.getAbsoluteGravity(0, 0) + 10;
            byte[] bArr2 = $$a;
            byte b2 = bArr2[40];
            byte b3 = bArr2[7];
            Object[] objArr5 = new Object[1];
            c(b2, b3, b3, objArr5);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(fadingEdgeLength, i3, absoluteGravity, 2009631821, false, (String) objArr5[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            int i4 = asBinder + 103;
            g = i4 % 128;
            int i5 = i4 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-337894567);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char gidForName = (char) (Process.getGidForName("") + 1);
                int iLastIndexOf = TextUtils.lastIndexOf("", '0', 0) + 877;
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0) + 10;
                byte[] bArr3 = $$a;
                Object[] objArr6 = new Object[1];
                c(bArr3[5], bArr3[10], (byte) 52, objArr6);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(gidForName, iLastIndexOf, iMakeMeasureSpec, 256017550, false, (String) objArr6[0], null);
            }
            Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            objArr = new Object[]{new int[]{((int[]) objArr7[0])[0]}, new int[1], new int[]{((int[]) objArr7[2])[0]}, (String[]) objArr7[3]};
            int i6 = ~System.identityHashCode(this);
            int i7 = ((1529962914 + (((~(872730822 | i6)) | (-913041052)) * (-983))) + (((~(i6 | (-913041052))) | 872464514) * 983)) - 1365484801;
            int i8 = (i7 << 13) ^ i7;
            int i9 = i8 ^ (i8 >>> 17);
            ((int[]) objArr[1])[0] = i9 ^ (i9 << 5);
        } else {
            Object[] objArr8 = new Object[1];
            d(421095299 - TextUtils.indexOf("", "", 0, 0), TextUtils.getTrimmedLength("") - 81, (short) View.resolveSize(0, 0), (byte) TextUtils.indexOf("", "", 0), (-252466208) - Process.getGidForName(""), objArr8);
            Class<?> cls2 = Class.forName((String) objArr8[0]);
            Object[] objArr9 = new Object[1];
            d(421095301 - (ViewConfiguration.getLongPressTimeout() >> 16), (ViewConfiguration.getFadingEdgeLength() >> 16) - 81, (short) (AndroidCharacter.getMirror('0') - '0'), (byte) View.combineMeasuredStates(0, 0), KeyEvent.getDeadChar(0, 0) - 252466181, objArr9);
            Context applicationContext = (Context) cls2.getMethod((String) objArr9[0], new Class[0]).invoke(null, null);
            if (applicationContext != null) {
                int i10 = g;
                int i11 = i10 + 109;
                asBinder = i11 % 128;
                if (i11 % 2 == 0) {
                    boolean z = applicationContext instanceof ContextWrapper;
                    throw null;
                }
                if (applicationContext instanceof ContextWrapper) {
                    int i12 = i10 + 79;
                    asBinder = i12 % 128;
                    int i13 = i12 % 2;
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
            d((ViewConfiguration.getScrollDefaultDelay() >> 16) + 421095308, (-81) - TextUtils.getOffsetAfter("", 0), (short) (ViewConfiguration.getKeyRepeatDelay() >> 16), (byte) (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), (-252466163) - ((Process.getThreadPriority(0) + 20) >> 6), objArr10);
            Class<?> cls3 = Class.forName((String) objArr10[0]);
            Object[] objArr11 = new Object[1];
            d(421095308 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), (ViewConfiguration.getScrollBarSize() >> 8) - 81, (short) (ViewConfiguration.getScrollBarSize() >> 8), (byte) TextUtils.getTrimmedLength(""), (ViewConfiguration.getScrollDefaultDelay() >> 16) - 252466147, objArr11);
            try {
                Object[] objArr12 = {applicationContext, Integer.valueOf(((Integer) cls3.getMethod((String) objArr11[0], Object.class).invoke(null, this)).intValue()), -1365484801};
                byte[] bArr4 = $$d;
                byte b4 = bArr4[93];
                short s = b4;
                Object[] objArr13 = new Object[1];
                e(b4, s, (byte) s, objArr13);
                Class<?> cls4 = Class.forName((String) objArr13[0]);
                Object[] objArr14 = new Object[1];
                e(bArr4[103], (short) (bArr4[45] + 1), bArr4[93], objArr14);
                Object[] objArr15 = (Object[]) cls4.getMethod((String) objArr14[0], Context.class, Integer.TYPE, Integer.TYPE).invoke(null, objArr12);
                if (applicationContext != null) {
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-337894567);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        char tapTimeout = (char) (ViewConfiguration.getTapTimeout() >> 16);
                        int iLastIndexOf2 = 875 - TextUtils.lastIndexOf("", '0');
                        int iIndexOf2 = 9 - TextUtils.indexOf((CharSequence) "", '0');
                        byte[] bArr5 = $$a;
                        Object[] objArr16 = new Object[1];
                        c(bArr5[5], bArr5[10], (byte) 52, objArr16);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(tapTimeout, iLastIndexOf2, iIndexOf2, 256017550, false, (String) objArr16[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr15);
                    try {
                        Object[] objArr17 = new Object[1];
                        d(View.MeasureSpec.getMode(0) + 421095299, TextUtils.lastIndexOf("", '0') - 80, (short) (1 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))), (byte) (((byte) KeyEvent.getModifierMetaStateMask()) + 1), (-252466244) - (ViewConfiguration.getWindowTouchSlop() >> 8), objArr17);
                        Class<?> cls5 = Class.forName((String) objArr17[0]);
                        Object[] objArr18 = new Object[1];
                        d(421095302 - TextUtils.lastIndexOf("", '0', 0, 0), (-81) - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), (short) (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), (byte) Color.green(0), (-252466223) - TextUtils.lastIndexOf("", '0', 0), objArr18);
                        long jLongValue2 = ((Long) cls5.getDeclaredMethod((String) objArr18[0], new Class[0]).invoke(null, new Object[0])).longValue();
                        Long lValueOf = Long.valueOf(jLongValue2);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1823069286);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                            char keyRepeatDelay = (char) (ViewConfiguration.getKeyRepeatDelay() >> 16);
                            int gidForName2 = 875 - Process.getGidForName("");
                            int gidForName3 = Process.getGidForName("") + 11;
                            byte[] bArr6 = $$a;
                            byte b5 = bArr6[40];
                            byte b6 = bArr6[7];
                            Object[] objArr19 = new Object[1];
                            c(b5, b6, b6, objArr19);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(keyRepeatDelay, gidForName2, gidForName3, 2009631821, false, (String) objArr19[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                        Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-342512172);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                            char cResolveSize = (char) View.resolveSize(0, 0);
                            int iLastIndexOf3 = TextUtils.lastIndexOf("", '0', 0) + 877;
                            int iGreen = 10 - Color.green(0);
                            byte[] bArr7 = $$a;
                            Object[] objArr20 = new Object[1];
                            c(bArr7[40], bArr7[2], (byte) 52, objArr20);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(cResolveSize, iLastIndexOf3, iGreen, 252381699, false, (String) objArr20[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf2);
                    } catch (Exception unused) {
                        throw new RuntimeException();
                    }
                }
                objArr = objArr15;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            }
        }
        int i14 = ((int[]) objArr[2])[0];
        int i15 = ((int[]) objArr[0])[0];
        if (i15 != i14) {
            throw new RuntimeException(String.valueOf(i15));
        }
        int i16 = ((int[]) objArr[1])[0];
        Object[] objArr21 = {new int[]{((int[]) objArr[0])[0]}, new int[1], new int[]{((int[]) objArr[2])[0]}, (String[]) objArr[3]};
        int iIdentityHashCode = System.identityHashCode(this);
        int i17 = i16 + ((((-208210156) + (((~((-672395551) | iIdentityHashCode)) | 135471126) * 1504)) + ((~(iIdentityHashCode | (-536924425))) * (-1504))) - 1636590208);
        int i18 = (i17 << 13) ^ i17;
        int i19 = i18 ^ (i18 >>> 17);
        ((int[]) objArr21[1])[0] = i19 ^ (i19 << 5);
        int i20 = R.id.m3_side_sheet;
        int i21 = g + 3;
        asBinder = i21 % 128;
        int i22 = i21 % 2;
        return i20;
    }

    @Override // com.google.android.material.sidesheet.SheetDialog
    Sheet<SideSheetCallback> getBehaviorFromSheet(FrameLayout frameLayout) {
        int i = 2 % 2;
        int i2 = g + 103;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        SideSheetBehavior sideSheetBehaviorFrom = SideSheetBehavior.from(frameLayout);
        int i4 = g + 79;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
        return sideSheetBehaviorFrom;
    }

    @Override // com.google.android.material.sidesheet.SheetDialog
    public SideSheetBehavior<? extends View> getBehavior() {
        int i = 2 % 2;
        Sheet behavior = super.getBehavior();
        if (!(behavior instanceof SideSheetBehavior)) {
            throw new IllegalStateException("The view is not associated with SideSheetBehavior");
        }
        int i2 = g;
        int i3 = i2 + 3;
        asBinder = i3 % 128;
        int i4 = i3 % 2;
        SideSheetBehavior<? extends View> sideSheetBehavior = (SideSheetBehavior) behavior;
        int i5 = i2 + 3;
        asBinder = i5 % 128;
        if (i5 % 2 != 0) {
            return sideSheetBehavior;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // com.google.android.material.sidesheet.SheetDialog
    int getStateOnStart() {
        int i = 2 % 2;
        int i2 = asBinder + 29;
        g = i2 % 128;
        return i2 % 2 != 0 ? 5 : 3;
    }

    static void TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        TuitionPaymentFragmentbindingInflater1 = -2086598494;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = -1934795594;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 1783350328;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = new byte[]{32, -18, 18, -27, -49, 48, -18, 23, -25, 28, -64, -61, 93, -30, -89, 44, 29, 28, 27, -24, 16, -21, 89, 30, -30, 19, -18, -19, 26, -11, 8, 25, 20, -27, -23, 19, -31, 44, -27, 26, 21, -20, -14, Base64.padSymbol, -29, -19, 21, -21, 19, -9, -60, -11, 88, -26, -23, -43, 44, 29, 28, 27, -24, 16, -21, 36, 25, -32, 19, -11, 24, 28, 27, 26, -26, -55, 43, -32, -17, 21, -26, 27, -12, 38, -18, 23, -25, 28, -64, -61, 33, 31, -21, 19, -40, 43, 13, -13, 17, 38, -25, 19, -54, Base64.padSymbol, 19, -12, -1, 41, -29, -19, 19, -32, -17, -25, 29};
    }

    private static String $$g(byte b2, int i, int i2) {
        int i3 = i2 + 117;
        int i4 = b2 * 4;
        int i5 = 3 - (i * 4);
        byte[] bArr = $$c;
        byte[] bArr2 = new byte[i4 + 1];
        int i6 = -1;
        if (bArr == null) {
            i3 = i5 + (-i3);
            i5 = i5;
        }
        while (true) {
            i6++;
            bArr2[i6] = (byte) i3;
            int i7 = i5 + 1;
            if (i6 == i4) {
                return new String(bArr2, 0);
            }
            i3 += -bArr[i7];
            i5 = i7;
        }
    }
}
