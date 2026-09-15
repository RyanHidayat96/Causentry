package com.google.android.gms.common;

import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.app.FragmentManager;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Color;
import android.os.Bundle;
import android.os.Process;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.google.android.gms.common.internal.Preconditions;
import defpackage.SessionConfigValidatingBuilder;
import defpackage.initSession;
import java.lang.reflect.Method;
import kotlin.UByte;
import kotlin.io.encoding.Base64;

/* JADX INFO: loaded from: classes3.dex */
public class ErrorDialogFragment extends DialogFragment {
    private Dialog zaa;
    private DialogInterface.OnCancelListener zab;
    private Dialog zac;
    private static final byte[] $$c = {23, -73, 107, 5};
    private static final int $$f = 119;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$d = {64, 73, -26, 82, -14, 0, Base64.padSymbol, -59, -10, -2, 6, -7, 5, 53, -58, -5, -11, 11, 1, -1, -20, 12, 53, -65, 6, -16, -2, 16, -8, -4, -7, 5, 55, -39, -23, 5, -19, 11, -1, 18, -36, 11, -3, -1, -15, 11, -11, 9, -4, -16, 32, -38, 14, -18, 14, -14, 0, Base64.padSymbol, -53, -15, 8, -16, 1, 4, 3, 52, -74, 5, 1, -2, 5, -22, 73, -72, 3, -2, 1, 8, -15, -11, 72, -29, -38, 10, -8, 0, 23, -37, 12, -5, -3, -15, 76, -17, -35, 10, -13, 9, -8, -1, 28, -19, -26, 10, 6, -11, -8, 44, -46, 15, -8, -8, 6, -11, -8, -1, 1, 9, 0, -8, 6, -13, 1, -7, 0, 1, -7, 7, -1, -20, 11, 2, -20, 40, -36, 9, -3, -9, 6, -3, -3, 3, -22, 7, -10, 64, -14, 0, Base64.padSymbol, -59, -10, -2, 6, -7, 5, 53, -53, -15, 8, -16, 1, 4, 3, 52, -59, -8, -8, 67, -61, -7, -8, 13, -15, 2, 11, -13, 60, -65, 6, 2, -20, -4, 1, 11, -10, 6, -11, -8, 68, -78, -2, 10, 10, -35, 10, -13, 9, -8, -1, 28, -19, -26, 10, 6, -11, -8, 44, -46, 15, -8, -8, 6, -11, -8, -1, 1, 9, 0, -8, 6, -13, 1, -7, 0, 1, -7, 7, -1, -20, 11, 2, -20, 40, -36, 9, -3, -9, 6, -3, -3, 3, -22, 7, -10, 65, -32, -14, 6, -15, 15, 18, -22, -15, 11, -8, 0, -15, 45, -46, 0, -5, 13, -21, 49, -55, 19, -10, -5, 9, -3, -9, -5, 1, -13, -7, 52, -32, -13, -2, 8, -1, -4, -10, 36, -53, 17, 0, -20, -1, 3, -5, 25, -29, 15, -17, -2, 9, -15, 43, -53, 2, 13, -15, 2, 11, -13, 23, -40, 9, -8, 10, 1, -17, 9, 4, 21, -23, -14, 9, -4, 1, 47, -35, 10, -13, 9, -8, -1, 28, -19, -26, 10, 6, -11, -8, 44, -46, 15, -8, -8, 6, -11, -8, 16, -9, -7, 8, -7, -7, 5, 28, -39, 6, -8, 9, -21, 13, -15, 63, -14, 0, Base64.padSymbol, -59, -10, -2, 6, -7, 5, 53, -53, -15, 8, -16, 1, 4, 3, 52, -65, 10, -21, 13, -15, 7, 6, -13, 60, -55, -14, 1, -5, -5, 66, -73, -1, 9, -5, 1, -13, 9, 2, -16, 67, -37, -38, 18, -15, -8, 9, -19, 19, -15, 25, -32, 79, -33, -49, 11, 2, -21, 13, 33, -47, -11, 17, -16, 31, -21, -16, -4, 7, -10, 12, -17, 46, -39, -12, 1, 2, 9, -26, 42, -36, 9, -3, -14, 0, Base64.padSymbol, -59, -10, -2, 6, -7, 5, 53, -53, -15, 8, -16, 1, 4, 3, 52, -64, 1, 5, -18, 15, -19, 7, 2, -16, 67, -68, 2, 9, -4, -4, -16, 67, -38, 44, -71, 3};
    private static final int $$e = 221;
    private static final byte[] $$a = {55, -64, 35, -71, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 56, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, 7, -18, -16, -1, -16, -16, -4, 19, -48, -3, -17, 0, -30, 4, -24, 54, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 55, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 54, -29, 31, -48, -17, 4, -24, 1, -6, -13, -13, -29, 38, -50, -16, -1, -12, -24};
    private static final int $$b = 141;
    private static int b = 0;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 1;
    private static int[] TuitionPaymentFragmentspecialinlinedviewModeldefault1 = {1496239542, 930981669, -1725467314, -2022242731, -1682600309, 644679668, -608802910, 1569695837, -302346349, -586154089, -773744248, 1527257756, -488055404, -641455270, -2051868730, 1168436698, -696704991, 1546540284};

    /* JADX WARN: Code duplicated, block: B:10:0x001f  */
    /* JADX WARN: Code duplicated, block: B:8:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x001f -> B:11:0x0028). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x001f
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void c(short r6, short r7, short r8, java.lang.Object[] r9) {
        /*
            byte[] r0 = com.google.android.gms.common.ErrorDialogFragment.$$a
            int r6 = 103 - r6
            int r8 = r8 + 4
            int r1 = r7 + 1
            byte[] r1 = new byte[r1]
            r2 = 0
            if (r0 != 0) goto L11
            r3 = r8
            r4 = r2
            r8 = r7
            goto L28
        L11:
            r3 = r2
        L12:
            byte r4 = (byte) r6
            r1[r3] = r4
            if (r3 != r7) goto L1f
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L1f:
            int r3 = r3 + 1
            r4 = r0[r8]
            r5 = r8
            r8 = r6
            r6 = r4
            r4 = r3
            r3 = r5
        L28:
            int r6 = -r6
            int r8 = r8 + r6
            int r6 = r8 + (-11)
            int r8 = r3 + 1
            r3 = r4
            goto L12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.ErrorDialogFragment.c(short, short, short, java.lang.Object[]):void");
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0021  */
    /* JADX WARN: Code duplicated, block: B:8:0x0019  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0021 -> B:11:0x002b). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0021
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void d(short r6, byte r7, short r8, java.lang.Object[] r9) {
        /*
            int r8 = r8 + 4
            int r6 = r6 + 67
            int r0 = 78 - r7
            byte[] r1 = com.google.android.gms.common.ErrorDialogFragment.$$d
            byte[] r0 = new byte[r0]
            int r7 = 77 - r7
            r2 = 0
            if (r1 != 0) goto L13
            r6 = r7
            r3 = r8
            r4 = r2
            goto L2b
        L13:
            r3 = r2
        L14:
            byte r4 = (byte) r6
            r0[r3] = r4
            if (r3 != r7) goto L21
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            r9[r2] = r6
            return
        L21:
            int r8 = r8 + 1
            r4 = r1[r8]
            int r3 = r3 + 1
            r5 = r3
            r3 = r8
            r8 = r4
            r4 = r5
        L2b:
            int r8 = -r8
            int r6 = r6 + r8
            int r6 = r6 + (-2)
            r8 = r3
            r3 = r4
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.ErrorDialogFragment.d(short, byte, short, java.lang.Object[]):void");
    }

    public static ErrorDialogFragment newInstance(Dialog dialog) {
        int i = 2 % 2;
        int i2 = b + 61;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        ErrorDialogFragment errorDialogFragmentNewInstance = newInstance(dialog, null);
        if (i3 == 0) {
            int i4 = 78 / 0;
        }
        return errorDialogFragmentNewInstance;
    }

    @Override // android.app.DialogFragment, android.content.DialogInterface.OnCancelListener
    public void onCancel(DialogInterface dialogInterface) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 15;
        b = i2 % 128;
        int i3 = i2 % 2;
        DialogInterface.OnCancelListener onCancelListener = this.zab;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 119;
        b = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // android.app.DialogFragment
    public void show(FragmentManager fragmentManager, String str) {
        int i = 2 % 2;
        int i2 = b + 63;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        super.show(fragmentManager, str);
        int i4 = b + 23;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 34 / 0;
        }
    }

    @Override // android.app.DialogFragment
    public Dialog onCreateDialog(Bundle bundle) {
        int i = 2 % 2;
        int i2 = b + 29;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            throw null;
        }
        Dialog dialog = this.zaa;
        if (dialog == null) {
            setShowsDialog(false);
            if (this.zac == null) {
                this.zac = new AlertDialog.Builder((Context) Preconditions.checkNotNull(getActivity())).create();
            }
            dialog = this.zac;
        }
        int i3 = b + 95;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i3 % 128;
        if (i3 % 2 != 0) {
            return dialog;
        }
        obj.hashCode();
        throw null;
    }

    public static ErrorDialogFragment newInstance(Dialog dialog, DialogInterface.OnCancelListener onCancelListener) {
        int i = 2 % 2;
        ErrorDialogFragment errorDialogFragment = new ErrorDialogFragment();
        Dialog dialog2 = (Dialog) Preconditions.checkNotNull(dialog, "Cannot display null dialog");
        dialog2.setOnCancelListener(null);
        dialog2.setOnDismissListener(null);
        errorDialogFragment.zaa = dialog2;
        if (onCancelListener != null) {
            int i2 = b + 11;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
            int i3 = i2 % 2;
            errorDialogFragment.zab = onCancelListener;
            if (i3 == 0) {
                int i4 = 90 / 0;
            }
        }
        int i5 = b + 89;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i5 % 128;
        if (i5 % 2 != 0) {
            return errorDialogFragment;
        }
        throw null;
    }

    private static void a(int[] iArr, int i, Object[] objArr) throws Throwable {
        int length;
        int[] iArr2;
        int i2 = 2 % 2;
        SessionConfigValidatingBuilder sessionConfigValidatingBuilder = new SessionConfigValidatingBuilder();
        char[] cArr = new char[4];
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr3 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        int i3 = -1870535734;
        int i4 = 1;
        int i5 = 0;
        if (iArr3 != null) {
            int i6 = $11;
            int i7 = i6 + 67;
            $10 = i7 % 128;
            if (i7 % 2 != 0) {
                length = iArr3.length;
                iArr2 = new int[length];
            } else {
                length = iArr3.length;
                iArr2 = new int[length];
            }
            int i8 = i6 + 67;
            $10 = i8 % 128;
            int i9 = i8 % 2;
            int i10 = 0;
            while (i10 < length) {
                try {
                    Object[] objArr2 = new Object[1];
                    objArr2[i5] = Integer.valueOf(iArr3[i10]);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(i3);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        char size = (char) View.MeasureSpec.getSize(i5);
                        int fadingEdgeLength = 3291 - (ViewConfiguration.getFadingEdgeLength() >> 16);
                        int offsetAfter = 31 - TextUtils.getOffsetAfter("", i5);
                        byte b2 = (byte) ($$f & 1);
                        byte b3 = (byte) (b2 - 1);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(size, fadingEdgeLength, offsetAfter, 1948206109, false, $$g(b2, b3, b3), new Class[]{Integer.TYPE});
                    }
                    iArr2[i10] = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).intValue();
                    i10++;
                    i3 = -1870535734;
                    i5 = 0;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            int i11 = $11 + 53;
            $10 = i11 % 128;
            int i12 = i11 % 2;
            iArr3 = iArr2;
        }
        int length2 = iArr3.length;
        int[] iArr4 = new int[length2];
        int[] iArr5 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        if (iArr5 != null) {
            int length3 = iArr5.length;
            int[] iArr6 = new int[length3];
            int i13 = 0;
            while (i13 < length3) {
                int i14 = $10 + 61;
                $11 = i14 % 128;
                if (i14 % 2 == 0) {
                    try {
                        Object[] objArr3 = new Object[i4];
                        objArr3[0] = Integer.valueOf(iArr5[i13]);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1870535734);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                            char cNormalizeMetaState = (char) KeyEvent.normalizeMetaState(0);
                            int threadPriority = ((Process.getThreadPriority(0) + 20) >> 6) + 3291;
                            int i15 = 31 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1));
                            byte b4 = (byte) ($$f & 1);
                            byte b5 = (byte) (b4 - 1);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cNormalizeMetaState, threadPriority, i15, 1948206109, false, $$g(b4, b5, b5), new Class[]{Integer.TYPE});
                        }
                        iArr6[i13] = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).intValue();
                        i13 >>= 1;
                    } catch (Throwable th2) {
                        Throwable cause2 = th2.getCause();
                        if (cause2 == null) {
                            throw th2;
                        }
                        throw cause2;
                    }
                } else {
                    length3 = length3;
                    try {
                        Object[] objArr4 = {Integer.valueOf(iArr5[i13])};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1870535734);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                            char c = (char) (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1));
                            int iIndexOf = TextUtils.indexOf("", "") + 3291;
                            int i16 = (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 31;
                            byte b6 = (byte) ($$f & 1);
                            byte b7 = (byte) (b6 - 1);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(c, iIndexOf, i16, 1948206109, false, $$g(b6, b7, b7), new Class[]{Integer.TYPE});
                        }
                        iArr6[i13] = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4)).intValue();
                        i13++;
                    } catch (Throwable th3) {
                        Throwable cause3 = th3.getCause();
                        if (cause3 == null) {
                            throw th3;
                        }
                        throw cause3;
                    }
                }
                length3 = length3;
                i4 = 1;
            }
            iArr5 = iArr6;
        }
        char c2 = 0;
        System.arraycopy(iArr5, 0, iArr4, 0, length2);
        sessionConfigValidatingBuilder.b = 2;
        while (sessionConfigValidatingBuilder.b < iArr.length) {
            cArr[c2] = (char) (iArr[sessionConfigValidatingBuilder.b] >> 16);
            cArr[1] = (char) iArr[sessionConfigValidatingBuilder.b];
            cArr[2] = (char) (iArr[sessionConfigValidatingBuilder.b + 1] >> 16);
            cArr[3] = (char) iArr[sessionConfigValidatingBuilder.b + 1];
            sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 = (cArr[0] << 16) + cArr[1];
            sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = (cArr[2] << 16) + cArr[3];
            int i17 = 17;
            for (int i18 = 1; i17 > i18; i18 = 1) {
                sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 ^= iArr4[i17];
                Object[] objArr5 = {sessionConfigValidatingBuilder, Integer.valueOf(SessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1)), sessionConfigValidatingBuilder, sessionConfigValidatingBuilder};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-869811764);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    byte b8 = (byte) 0;
                    byte b9 = b8;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) View.resolveSize(0, 0), ((byte) KeyEvent.getModifierMetaStateMask()) + UByte.MIN_VALUE, 29 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), 683220507, false, $$g(b8, b9, b9), new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                }
                int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).intValue();
                sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 = sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = iIntValue;
                i17--;
            }
            int i19 = sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1;
            sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 = sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i19;
            sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 ^= iArr4[1];
            sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 ^= iArr4[0];
            sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 ^= iArr[sessionConfigValidatingBuilder.b - 2];
            int i20 = sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            Object[] objArr6 = {sessionConfigValidatingBuilder};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(447797990);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b((char) (28879 - (ViewConfiguration.getScrollBarFadeDuration() >> 16)), 347 - MotionEvent.axisFromString(""), Color.red(0) + 25, -30507727, false, "G", new Class[]{Object.class});
            }
            sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i20 ^ iArr[((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr6)).intValue()];
            cArr[0] = (char) (sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 >>> 16);
            cArr[1] = (char) sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1;
            cArr[2] = (char) (sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 >>> 16);
            cArr[3] = (char) sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            cArr2[(sessionConfigValidatingBuilder.b - 2) * 2] = cArr[0];
            cArr2[((sessionConfigValidatingBuilder.b - 2) * 2) + 1] = cArr[1];
            cArr2[((sessionConfigValidatingBuilder.b - 2) * 2) + 2] = cArr[2];
            cArr2[((sessionConfigValidatingBuilder.b - 2) * 2) + 3] = cArr[3];
            sessionConfigValidatingBuilder.b += 2;
            c2 = 0;
        }
        objArr[0] = new String(cArr2, 0, i);
    }

    /*  JADX ERROR: IllegalArgumentException in pass: ReplaceNewArray
        java.lang.IllegalArgumentException: Illegal Capacity: -1252113230
        	at java.base/java.util.ArrayList.<init>(ArrayList.java:160)
        	at jadx.core.dex.nodes.InsnNode.<init>(InsnNode.java:36)
        	at jadx.core.dex.instructions.FilledNewArrayNode.<init>(FilledNewArrayNode.java:13)
        	at jadx.core.dex.visitors.ReplaceNewArray.processNewArray(ReplaceNewArray.java:144)
        	at jadx.core.dex.visitors.ReplaceNewArray.processInsn(ReplaceNewArray.java:72)
        	at jadx.core.dex.visitors.ReplaceNewArray.visit(ReplaceNewArray.java:53)
        */
    @Override // android.app.DialogFragment, android.app.Fragment
    public void onCreate(android.os.Bundle r44) {
        /*
            Method dump skipped, instruction units count: 12524
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.ErrorDialogFragment.onCreate(android.os.Bundle):void");
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0026  */
    /* JADX WARN: Code duplicated, block: B:8:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0026
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$g(int r6, int r7, int r8) {
        /*
            byte[] r0 = com.google.android.gms.common.ErrorDialogFragment.$$c
            int r7 = r7 * 3
            int r7 = 4 - r7
            int r6 = r6 * 56
            int r6 = 122 - r6
            int r8 = r8 * 3
            int r1 = r8 + 1
            byte[] r1 = new byte[r1]
            r2 = 0
            if (r0 != 0) goto L17
            r6 = r7
            r4 = r8
            r3 = r2
            goto L2a
        L17:
            r3 = r2
            r5 = r7
            r7 = r6
            r6 = r5
        L1b:
            byte r4 = (byte) r7
            r1[r3] = r4
            if (r3 != r8) goto L26
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L26:
            int r3 = r3 + 1
            r4 = r0[r6]
        L2a:
            int r7 = r7 + r4
            int r6 = r6 + 1
            goto L1b
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.ErrorDialogFragment.$$g(int, int, int):java.lang.String");
    }
}
