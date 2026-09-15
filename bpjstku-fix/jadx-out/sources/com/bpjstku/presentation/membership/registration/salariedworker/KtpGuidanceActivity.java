package com.bpjstku.presentation.membership.registration.salariedworker;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.support.v4.media.session.MediaSessionCompat;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.bpjstku.R;
import com.bpjstku.databinding.ActivityKtpGuidanceBinding;
import defpackage.ViewPortBuilder;
import defpackage.abortCapture;
import defpackage.initSession;
import defpackage.onCaptureSessionEnd;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Random;
import kotlin.Metadata;
import kotlin.io.encoding.Base64;
import kotlin.jvm.internal.ByteCompanionObject;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \r2\u00020\u0001:\u0001\rB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0014¢\u0006\u0004\b\u0007\u0010\bR\u0016\u0010\f\u001a\u00020\t8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\n\u0010\u000b"}, d2 = {"Lcom/bpjstku/presentation/membership/registration/salariedworker/KtpGuidanceActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "<init>", "()V", "Landroid/os/Bundle;", "p0", "", "onCreate", "(Landroid/os/Bundle;)V", "Lcom/bpjstku/databinding/ActivityKtpGuidanceBinding;", "b", "Lcom/bpjstku/databinding/ActivityKtpGuidanceBinding;", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "TuitionPaymentFragmentspecialinlinedviewModeldefault2"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class KtpGuidanceActivity extends AppCompatActivity {
    private static long TuitionPaymentFragmentbindingInflater1;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static int asInterface;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private ActivityKtpGuidanceBinding TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    private static final byte[] $$c = {5, 11, -122, -94};
    private static final int $$f = 53;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$d = {8, -36, 87, -65, -10, 4, 65, -50, -12, 8, -7, 1, 11, -8, 73, -52, 5, -17, 21, 53, -66, 15, 0, 0, -8, 1, 4, 19, -17, 13, -4, 3, 66, -64, 5, 6, Base64.padSymbol, -61, 0, 13, 1, -5, 64, -66, 15, -12, 5, 3, 3, -3, 16, 57, -18, -46, 19, -11, 13, -3, 27, -21, 2, -1, 8, 0, 27, -33, 14, 4, -17, 13, -4, 3, -3, 44, -41, 17, -6, -31, 14, -9, 13, -4, 3, 32, -15, -22, 14, 10, -7, -4, 48, -42, 19, -4, -4, 10, -7, -4, 20, -5, -3, 12, -3, -3, 9, 32, -35, 10, -4, 13, -17, 17, -11, 67, -10, 4, 65, -55, -6, 2, 10, -3, 9, 57, -49, -11, 12, -12, 5, 8, 7, 56, -55, -4, -4, 71, -57, -3, -4, 17, -11, 6, 15, -9, 64, -61, 3, 3, 4, -9, 23, -2, -10, 4, 2, 0, 3, 66, -74, 2, 26, -14, -31, 14, -9, 13, -4, 3, 32, -15, -22, 14, 10, -7, -4, 48, -42, 19, -4, -4, 10, -7, -4, 3, 5, 13, 4, -4, 10, -9, 5, -3, 4, 5, -3, 11, 3, -16, 15, 6, -16, 44, -32, 13, 1, -5, 10, 1, 1, 7, -18, 11, -6, 68, 13, -10, 13, 0, 5, 0, -13, 15, 6, -17, 17, 20, -32, 5, 14, 7, 0, 0, 21, -17, -10, -2, 18, -12, 1, 70, -47, -11, 12, -12, 5, 8, 7, -18, 23, 4, -10, 10, -11, 19, 0, -10, -1, 15, -9, 0, 5, 14, 0, -12, 2, 12, -3, 9, 22, -32, 5, 14, 7, 0, 0, 34, -29, -1, 4, 67, -11, 4, -13, 52, -29, -16, 16, 49, 4, -29, -20, 4, -5, 15, -17, 1, 5, 15, -31, 14, -9, 13, -4, 3, 32, -15, -22, 14, 10, -7, -4, 48, -42, 19, -4, -4, 10, -7, -4, 3, 5, 13, 4, -4, 10, -9, 5, -3, 4, 5, -3, 11, 3, -16, 15, 6, -16, 44, -32, 13, 1, -5, 10, 1, 1, 7, -18, 11, -6, 67, -22, -1, 9, 8, -11, 32, -18, -8, 15, 6, -1, -10, 4, 65, -55, -6, 2, 10, -3, 9, 57, -49, -11, 12, -12, 5, 8, 7, 56, -55, -4, -4, 71, -51, -10, 4, 2, 0, 3, 66, -49, -13, 9, Base64.padSymbol, -17, -45, 9, 71, -29, -39, 5, 6, -7, -4, 43, -24, -18, -10, 4, 65, -50, -12, 8, -7, 1, 11, -8, 73, -52, 5, -17, 21, 53, -67, 12, -2, -6, 11, 13, -17, 13, -4, 3, 66, -61, 0, 13, 1, -5, 64, -66, 15, -12, 5, 3, 3, -3, 16, 57, -35, -20, -2, -6, 11, 13, -16, 12, 33, -36, -31, 14, -9, 13, -4, 3, 32, -15, -22, 14, 10, -7, -4, 48, -42, 19, -4, -4, 10, -7, -4, 3, 5, 13, 4, -4, 10, -9, 5, -3, 4, 5, -3, 11, 3, -16, 15, 6, -16, 44, -32, 13, 1, -5, 10, 1, 1, 7, -18, 11, -6, 69};
    private static final int $$e = 79;
    private static final byte[] $$a = {86, -48, ByteCompanionObject.MIN_VALUE, 88, 29, -31, 48, 17, -4, 24, -1, 6, 13, 13, 29, -38, 50, 16, 1, 12, 24, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -56, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, -7, 18, 16, 1, 16, 16, 4, -19, 48, 3, 17, 0, 30, -4, 24, -54, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -55, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -54};
    private static final int $$b = 133;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f567a = 0;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 1;

    /* JADX WARN: Code duplicated, block: B:10:0x0022  */
    /* JADX WARN: Code duplicated, block: B:8:0x001a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:11:0x0027). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0022
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void d(int r7, int r8, int r9, java.lang.Object[] r10) {
        /*
            byte[] r0 = com.bpjstku.presentation.membership.registration.salariedworker.KtpGuidanceActivity.$$a
            int r9 = 53 - r9
            int r8 = 213 - r8
            int r7 = r7 + 84
            byte[] r1 = new byte[r9]
            r2 = 0
            if (r0 != 0) goto L10
            r3 = r8
            r4 = r2
            goto L27
        L10:
            r3 = r2
        L11:
            int r8 = r8 + 1
            int r4 = r3 + 1
            byte r5 = (byte) r7
            r1[r3] = r5
            if (r4 != r9) goto L22
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            r10[r2] = r7
            return
        L22:
            r3 = r0[r8]
            r6 = r3
            r3 = r8
            r8 = r6
        L27:
            int r7 = r7 + r8
            int r7 = r7 + (-11)
            r8 = r3
            r3 = r4
            goto L11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.membership.registration.salariedworker.KtpGuidanceActivity.d(int, int, int, java.lang.Object[]):void");
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0021  */
    /* JADX WARN: Code duplicated, block: B:8:0x0019  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0021 -> B:11:0x0027). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0021
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void e(short r6, byte r7, short r8, java.lang.Object[] r9) {
        /*
            int r6 = r6 + 84
            byte[] r0 = com.bpjstku.presentation.membership.registration.salariedworker.KtpGuidanceActivity.$$d
            int r7 = 74 - r7
            int r8 = 459 - r8
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L11
            r6 = r7
            r3 = r8
            r4 = r2
            goto L27
        L11:
            r3 = r2
        L12:
            byte r4 = (byte) r6
            r1[r3] = r4
            int r3 = r3 + 1
            if (r3 != r7) goto L21
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L21:
            r4 = r0[r8]
            r5 = r3
            r3 = r8
            r8 = r4
            r4 = r5
        L27:
            int r8 = -r8
            int r6 = r6 + r8
            int r6 = r6 + 2
            int r8 = r3 + 1
            r3 = r4
            goto L12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.membership.registration.salariedworker.KtpGuidanceActivity.e(short, byte, short, java.lang.Object[]):void");
    }

    /* JADX INFO: renamed from: com.bpjstku.presentation.membership.registration.salariedworker.KtpGuidanceActivity$TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/bpjstku/presentation/membership/registration/salariedworker/KtpGuidanceActivity$TuitionPaymentFragmentspecialinlinedviewModeldefault2;", "", "<init>", "()V", "Landroid/content/Context;", "p0", "Landroid/content/Intent;", "TuitionPaymentFragmentbindingInflater1", "(Landroid/content/Context;)Landroid/content/Intent;"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private static final byte[] $$c = {106, -66, 28, 119};
        private static final int $$f = 165;
        private static int $10 = 0;
        private static int $11 = 1;
        private static final byte[] $$d = {8, -36, 87, -65, -6, 23, -41, 38, 20, 0, 21, -9, -19, 35, 10, 25, 3, 11, 15, -33, 42, 5, 15, -5, 3, 9, 21, -70, 70, 41, -4, 19, -3, 14, 7, -22, 25, 32, -4, 0, 17, 14, -38, 52, -9, 14, 14, 0, 17, 14, 7, 5, -3, 6, 14, 0, 19, 5, 13, 6, 5, 13, -1, 7, 26, -5, 4, 26, -34, 42, -3, 9, 15, 0, 9, 9, 3, 28, -1, 16, -57};
        private static final int $$e = 60;
        private static final byte[] $$a = {5, 11, -122, -94, -43, 2, -21, 1, -16, -9, 20, -27, -34, 2, -2, -19, -16, 36, -54, 7, -16, -16, -2, -19, -16, -9, -7, 1, -8, -16, -2, -21, -7, -15, -8, -7, -15, -1, -9, -28, 3, -6, -28, 32, -44, 1, -11, -17, -2, -11, -11, -5, -30, -1, -18, 55, -43, 2, -21, 1, -16, -9, 20, -27, -34, 2, -2, -19, -16, 36, -54, 7, -16, -16, -2, -19, -16, 8, -17, -15, 0, -15, -15, -3, 20, -47, -2, -16, 1, -29, 5, -23, 55};
        private static final int $$b = 49;
        private static int b = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static int f568a = 1;
        private static char TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 26792;
        private static char TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 14929;
        private static char TuitionPaymentFragmentbindingInflater1 = 9997;
        private static char TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 53899;

        private static void c(int i, int i2, byte b2, Object[] objArr) {
            byte[] bArr = $$a;
            int i3 = i2 + 4;
            int i4 = (b2 * 14) + 84;
            byte[] bArr2 = new byte[53 - i];
            int i5 = 52 - i;
            int i6 = -1;
            if (bArr == null) {
                i6 = -1;
                i4 = (i5 + (-i3)) - 10;
                i3 = i3;
            }
            while (true) {
                int i7 = i3 + 1;
                int i8 = i6 + 1;
                bArr2[i8] = (byte) i4;
                if (i8 == i5) {
                    objArr[0] = new String(bArr2, 0);
                    return;
                }
                i6 = i8;
                i4 = (i4 + (-bArr[i7])) - 10;
                i3 = i7;
            }
        }

        /* JADX WARN: Code duplicated, block: B:10:0x0026  */
        /* JADX WARN: Code duplicated, block: B:8:0x001e  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x002a). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0026
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        private static void e(short r5, int r6, short r7, java.lang.Object[] r8) {
            /*
                int r7 = r7 * 25
                int r7 = 29 - r7
                byte[] r0 = com.bpjstku.presentation.membership.registration.salariedworker.KtpGuidanceActivity.Companion.$$d
                int r6 = r6 * 27
                int r1 = 53 - r6
                int r5 = r5 * 31
                int r5 = 115 - r5
                byte[] r1 = new byte[r1]
                int r6 = 52 - r6
                r2 = 0
                if (r0 != 0) goto L18
                r4 = r6
                r3 = r2
                goto L2a
            L18:
                r3 = r2
            L19:
                byte r4 = (byte) r5
                r1[r3] = r4
                if (r3 != r6) goto L26
                java.lang.String r5 = new java.lang.String
                r5.<init>(r1, r2)
                r8[r2] = r5
                return
            L26:
                int r3 = r3 + 1
                r4 = r0[r7]
            L2a:
                int r5 = r5 + r4
                int r5 = r5 + (-8)
                int r7 = r7 + 1
                goto L19
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.membership.registration.salariedworker.KtpGuidanceActivity.Companion.e(short, int, short, java.lang.Object[]):void");
        }

        private Companion() {
        }

        private static void d(char[] cArr, int i, Object[] objArr) throws Throwable {
            int i2 = 2 % 2;
            onCaptureSessionEnd oncapturesessionend = new onCaptureSessionEnd();
            char[] cArr2 = new char[cArr.length - 2];
            oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 2;
            char[] cArr3 = new char[2];
            while (true) {
                int i3 = 0;
                if (oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 >= cArr.length) {
                    objArr[0] = new String(cArr2, 0, i);
                    return;
                }
                int i4 = $10 + 83;
                $11 = i4 % 128;
                int i5 = i4 % 2;
                cArr3[0] = cArr[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3];
                cArr3[1] = cArr[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1];
                int i6 = 58224;
                int i7 = 0;
                while (i7 < 16) {
                    char c = cArr3[1];
                    char c2 = cArr3[i3];
                    int i8 = (c2 + i6) ^ ((c2 << 4) + ((char) (((long) TuitionPaymentFragmentbindingInflater1) ^ 8611973335120459638L)));
                    int i9 = c2 >>> 5;
                    try {
                        Object[] objArr2 = new Object[4];
                        objArr2[3] = Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault3);
                        objArr2[2] = Integer.valueOf(i9);
                        objArr2[1] = Integer.valueOf(i8);
                        objArr2[i3] = Integer.valueOf(c);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1824600641);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                            char maxKeyCode = (char) (47773 - (KeyEvent.getMaxKeyCode() >> 16));
                            int iRgb = (-16776748) - Color.rgb(i3, i3, i3);
                            int iNormalizeMetaState = KeyEvent.normalizeMetaState(i3) + 13;
                            Class[] clsArr = new Class[4];
                            clsArr[i3] = Integer.TYPE;
                            clsArr[1] = Integer.TYPE;
                            clsArr[2] = Integer.TYPE;
                            clsArr[3] = Integer.TYPE;
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(maxKeyCode, iRgb, iNormalizeMetaState, -2007001706, false, "o", clsArr);
                        }
                        char cCharValue = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                        cArr3[1] = cCharValue;
                        int i10 = i7;
                        Object[] objArr3 = {Integer.valueOf(cArr3[i3]), Integer.valueOf((cCharValue + i6) ^ ((cCharValue << 4) + ((char) (((long) TuitionPaymentFragmentspecialinlinedviewModeldefault1) ^ 8611973335120459638L)))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault2)};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1824600641);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (Process.getGidForName("") + 47774), 469 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), ExpandableListView.getPackedPositionChild(0L) + 14, -2007001706, false, "o", new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                        }
                        cArr3[0] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).charValue();
                        i6 -= 40503;
                        i7 = i10 + 1;
                        i3 = 0;
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                }
                cArr2[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 - 2] = (char) (cArr[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 - 2] ^ cArr3[0]);
                cArr2[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 - 1] = (char) (cArr3[1] ^ cArr[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 - 1]);
                Object[] objArr4 = {oncapturesessionend, oncapturesessionend};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1431906448);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    byte b2 = (byte) 0;
                    byte b3 = b2;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) ExpandableListView.getPackedPositionType(0L), 2323 - TextUtils.indexOf("", "", 0, 0), ExpandableListView.getPackedPositionGroup(0L) + 44, -1312321721, false, $$g(b2, b3, b3), new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
                int i11 = $11 + 71;
                $10 = i11 % 128;
                int i12 = i11 % 2;
            }
        }

        public final Intent TuitionPaymentFragmentbindingInflater1(Context p0) throws Throwable {
            Context applicationContext;
            Object[] objArr;
            int i = 2 % 2;
            int i2 = b + 43;
            f568a = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(p0, "");
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                char cLastIndexOf = (char) (TextUtils.lastIndexOf("", '0', 0, 0) + 31534);
                int capsMode = 921 - TextUtils.getCapsMode("", 0, 0);
                int i4 = (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 28;
                byte b2 = (byte) ($$b + 3);
                byte[] bArr = $$a;
                Object[] objArr2 = new Object[1];
                c(b2, bArr[37], bArr[7], objArr2);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cLastIndexOf, capsMode, i4, -1048449946, false, (String) objArr2[0], null);
            }
            long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
            Object[] objArr3 = new Object[1];
            d(new char[]{64418, 8114, 35583, 40001, 59577, 49650, 2219, 13548, 9561, 48173, 37788, 22333, 42004, 47598, 32149, 21836, 47738, 20472, 9760, 10111, 36687, 56677, 3882, 5468}, 21 - TextUtils.lastIndexOf("", '0', 0, 0), objArr3);
            Class<?> cls = Class.forName((String) objArr3[0]);
            Object[] objArr4 = new Object[1];
            d(new char[]{63889, 2383, 54969, 10138, 34772, 10100, 28449, 8174, 25626, 29581, 42332, 20667, 37541, 56122, 18974, 59180, 11878, 55299}, 14 - ImageFormat.getBitsPerPixel(0), objArr4);
            long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(889369593);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                char mirror = (char) (AndroidCharacter.getMirror('0') + 31485);
                int mirror2 = AndroidCharacter.getMirror('0') + 873;
                int minimumFlingVelocity = 28 - (ViewConfiguration.getMinimumFlingVelocity() >> 16);
                byte[] bArr2 = $$a;
                byte b3 = bArr2[80];
                Object[] objArr5 = new Object[1];
                c(b3, bArr2[37], b3, objArr5);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(mirror, mirror2, minimumFlingVelocity, -778300370, false, (String) objArr5[0], null);
            }
            if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    char minimumFlingVelocity2 = (char) (31533 - (ViewConfiguration.getMinimumFlingVelocity() >> 16));
                    int iRgb = (-16776295) - Color.rgb(0, 0, 0);
                    int i5 = (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 28;
                    byte[] bArr3 = $$a;
                    Object[] objArr6 = new Object[1];
                    c((byte) (-bArr3[33]), (byte) ($$b + 2), bArr3[80], objArr6);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(minimumFlingVelocity2, iRgb, i5, -1142834547, false, (String) objArr6[0], null);
                }
                Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
                objArr = new Object[]{new int[1], new int[]{((int[]) objArr7[1])[0]}, (Object[]) objArr7[2], new int[]{((int[]) objArr7[3])[0]}, (String[]) objArr7[4]};
                int iNextInt = new Random().nextInt(1464849207);
                int i6 = ~iNextInt;
                int i7 = ~(314901606 | i6);
                int i8 = 455112275 + ((1144539665 | i7) * (-712)) + (((~(iNextInt | 1459441271)) | (~(i6 | (-1144539666)))) * (-712)) + (((-1459178038) | i7) * 712) + 1461335005;
                int i9 = (i8 << 13) ^ i8;
                int i10 = i9 ^ (i9 >>> 17);
                ((int[]) objArr[0])[0] = i10 ^ (i10 << 5);
            } else {
                if (p0 == null) {
                    applicationContext = p0;
                } else if ((p0 instanceof ContextWrapper) && ((ContextWrapper) p0).getBaseContext() == null) {
                    applicationContext = null;
                } else {
                    applicationContext = p0.getApplicationContext();
                    int i11 = b + 7;
                    f568a = i11 % 128;
                    int i12 = i11 % 2;
                }
                Object[] objArr8 = new Object[1];
                d(new char[]{54210, 46024, 15475, 53683, 42794, 45924, 16925, 59527, 29702, 31151, 36937, 48853, 7215, 24407, 41329, 2666, 33331, 29772}, 16 - (ViewConfiguration.getTouchSlop() >> 8), objArr8);
                Class<?> cls2 = Class.forName((String) objArr8[0]);
                Object[] objArr9 = new Object[1];
                d(new char[]{54469, 60769, 21022, 12080, 49704, 13094, 10923, 23826, 46681, 13691, 20681, 555, 62290, 17695, 20773, 51425, 50026, 43806}, 16 - (ViewConfiguration.getTapTimeout() >> 16), objArr9);
                try {
                    Object[] objArr10 = {applicationContext, Integer.valueOf(((Integer) cls2.getMethod((String) objArr9[0], Object.class).invoke(null, this)).intValue()), 0, 1461335005};
                    byte[] bArr4 = $$d;
                    byte b4 = bArr4[9];
                    byte b5 = (byte) (-bArr4[62]);
                    Object[] objArr11 = new Object[1];
                    e(b4, b5, b5, objArr11);
                    Class<?> cls3 = Class.forName((String) objArr11[0]);
                    byte b6 = (byte) (-bArr4[62]);
                    byte b7 = bArr4[9];
                    Object[] objArr12 = new Object[1];
                    e(b6, b7, b7, objArr12);
                    Object[] objArr13 = (Object[]) cls3.getMethod((String) objArr12[0], Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr10);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        char defaultSize = (char) (View.getDefaultSize(0, 0) + 31533);
                        int longPressTimeout = 921 - (ViewConfiguration.getLongPressTimeout() >> 16);
                        int iNormalizeMetaState = KeyEvent.normalizeMetaState(0) + 28;
                        byte[] bArr5 = $$a;
                        Object[] objArr14 = new Object[1];
                        c((byte) (-bArr5[33]), (byte) ($$b + 2), bArr5[80], objArr14);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(defaultSize, longPressTimeout, iNormalizeMetaState, -1142834547, false, (String) objArr14[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr13);
                    try {
                        Object[] objArr15 = new Object[1];
                        d(new char[]{64418, 8114, 35583, 40001, 59577, 49650, 2219, 13548, 9561, 48173, 37788, 22333, 42004, 47598, 32149, 21836, 47738, 20472, 9760, 10111, 36687, 56677, 3882, 5468}, Process.getGidForName("") + 23, objArr15);
                        Class<?> cls4 = Class.forName((String) objArr15[0]);
                        Object[] objArr16 = new Object[1];
                        d(new char[]{63889, 2383, 54969, 10138, 34772, 10100, 28449, 8174, 25626, 29581, 42332, 20667, 37541, 56122, 18974, 59180, 11878, 55299}, Gravity.getAbsoluteGravity(0, 0) + 15, objArr16);
                        long jLongValue2 = ((Long) cls4.getDeclaredMethod((String) objArr16[0], new Class[0]).invoke(null, new Object[0])).longValue();
                        Long lValueOf = Long.valueOf(jLongValue2);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(889369593);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                            char cIndexOf = (char) (31533 - TextUtils.indexOf("", "", 0, 0));
                            int maxKeyCode = (KeyEvent.getMaxKeyCode() >> 16) + 921;
                            int iAxisFromString = 27 - MotionEvent.axisFromString("");
                            byte[] bArr6 = $$a;
                            byte b8 = bArr6[80];
                            Object[] objArr17 = new Object[1];
                            c(b8, bArr6[37], b8, objArr17);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(cIndexOf, maxKeyCode, iAxisFromString, -778300370, false, (String) objArr17[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                        Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                            char c = (char) ((CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 31533);
                            int iResolveSizeAndState = View.resolveSizeAndState(0, 0, 0) + 921;
                            int touchSlop = 28 - (ViewConfiguration.getTouchSlop() >> 8);
                            byte b9 = (byte) ($$b + 3);
                            byte[] bArr7 = $$a;
                            Object[] objArr18 = new Object[1];
                            c(b9, bArr7[37], bArr7[7], objArr18);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(c, iResolveSizeAndState, touchSlop, -1048449946, false, (String) objArr18[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf2);
                        int i13 = f568a + 99;
                        b = i13 % 128;
                        int i14 = i13 % 2;
                        objArr = objArr13;
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
            if (((int[]) objArr[3])[0] != ((int[]) objArr[1])[0]) {
                ArrayList arrayList = new ArrayList();
                String[] strArr = (String[]) objArr[4];
                if (strArr == null) {
                    throw null;
                }
                for (String str : strArr) {
                    arrayList.add(str);
                }
                throw null;
            }
            int i15 = ((int[]) objArr[0])[0];
            Object[] objArr19 = {new int[1], new int[]{((int[]) objArr[1])[0]}, (Object[]) objArr[2], new int[]{((int[]) objArr[3])[0]}, (String[]) objArr[4]};
            int i16 = ~(Process.myPid() | 438394060);
            int i17 = i15 + (((1438493955 | i16) * (-658)) - 558946661) + ((i16 | 1167892739) * 658);
            int i18 = (i17 << 13) ^ i17;
            int i19 = i18 ^ (i18 >>> 17);
            ((int[]) objArr19[0])[0] = i19 ^ (i19 << 5);
            return new Intent(p0, (Class<?>) KtpGuidanceActivity.class);
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Code duplicated, block: B:10:0x0027  */
        /* JADX WARN: Code duplicated, block: B:8:0x0021  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x002d). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0027
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        private static java.lang.String $$g(byte r6, byte r7, short r8) {
            /*
                int r8 = r8 * 3
                int r8 = r8 + 108
                int r7 = r7 * 3
                int r7 = r7 + 4
                int r6 = r6 * 3
                int r0 = 1 - r6
                byte[] r1 = com.bpjstku.presentation.membership.registration.salariedworker.KtpGuidanceActivity.Companion.$$c
                byte[] r0 = new byte[r0]
                r2 = 0
                int r6 = 0 - r6
                if (r1 != 0) goto L19
                r3 = r6
                r8 = r7
                r4 = r2
                goto L2d
            L19:
                r3 = r2
            L1a:
                byte r4 = (byte) r8
                r0[r3] = r4
                int r4 = r3 + 1
                if (r3 != r6) goto L27
                java.lang.String r6 = new java.lang.String
                r6.<init>(r0, r2)
                return r6
            L27:
                r3 = r1[r7]
                r5 = r8
                r8 = r7
                r7 = r3
                r3 = r5
            L2d:
                int r7 = -r7
                int r7 = r7 + r3
                int r8 = r8 + 1
                r3 = r4
                r5 = r8
                r8 = r7
                r7 = r5
                goto L1a
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.membership.registration.salariedworker.KtpGuidanceActivity.Companion.$$g(byte, byte, short):java.lang.String");
        }
    }

    private static void c(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        abortCapture abortcapture = new abortCapture();
        char[] cArrB = abortCapture.b(TuitionPaymentFragmentbindingInflater1 ^ (-2687588926731523482L), cArr, i);
        abortcapture.b = 4;
        int i3 = $10 + 75;
        $11 = i3 % 128;
        while (true) {
            int i4 = i3 % 2;
            if (abortcapture.b >= cArrB.length) {
                objArr[0] = new String(cArrB, 4, cArrB.length - 4);
                return;
            }
            int i5 = $11 + 17;
            $10 = i5 % 128;
            int i6 = i5 % 2;
            abortcapture.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = abortcapture.b - 4;
            int i7 = abortcapture.b;
            try {
                Object[] objArr2 = {Long.valueOf(cArrB[abortcapture.b] ^ cArrB[abortcapture.b % 4]), Long.valueOf(abortcapture.TuitionPaymentFragmentspecialinlinedviewModeldefault1), Long.valueOf(TuitionPaymentFragmentbindingInflater1)};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-774687567);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    byte b = (byte) 0;
                    byte b2 = b;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (TextUtils.getOffsetBefore("", 0) + 64838), (Process.myTid() >> 22) + 1356, 38 - View.MeasureSpec.getSize(0), 894276454, false, $$g(b, b2, b2), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                }
                cArrB[i7] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {abortcapture, abortcapture};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-772308768);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) ((ViewConfiguration.getJumpTapTimeout() >> 16) + 47773), 468 - View.getDefaultSize(0, 0), (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 12, 896083767, false, "n", new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3);
                i3 = $11 + 15;
                $10 = i3 % 128;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r3v213 shouldAlwaysUseBrowserUI, still in use, count: 2, list:
          (r3v213 shouldAlwaysUseBrowserUI) from 0x18e4: MOVE (r39v8 shouldAlwaysUseBrowserUI) = (r3v213 shouldAlwaysUseBrowserUI)
          (r3v213 shouldAlwaysUseBrowserUI) from 0x18e6: PHI (r39v4 shouldAlwaysUseBrowserUI) = (r3v213 shouldAlwaysUseBrowserUI), (r39v8 shouldAlwaysUseBrowserUI) binds: [B:248:0x1a7a, B:229:0x1871] A[DONT_GENERATE, DONT_INLINE]
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
        	at jadx.core.utils.InsnRemover.addAndUnbind(InsnRemover.java:59)
        	at jadx.core.dex.visitors.ModVisitor.removeStep(ModVisitor.java:463)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:97)
        */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(android.os.Bundle r46) {
        /*
            Method dump skipped, instruction units count: 13524
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.membership.registration.salariedworker.KtpGuidanceActivity.onCreate(android.os.Bundle):void");
    }

    /*  JADX ERROR: IllegalArgumentException in pass: ReplaceNewArray
        java.lang.IllegalArgumentException: Illegal Capacity: -109032098
        	at java.base/java.util.ArrayList.<init>(ArrayList.java:160)
        	at jadx.core.dex.nodes.InsnNode.<init>(InsnNode.java:36)
        	at jadx.core.dex.instructions.FilledNewArrayNode.<init>(FilledNewArrayNode.java:13)
        	at jadx.core.dex.visitors.ReplaceNewArray.processNewArray(ReplaceNewArray.java:144)
        	at jadx.core.dex.visitors.ReplaceNewArray.processInsn(ReplaceNewArray.java:72)
        	at jadx.core.dex.visitors.ReplaceNewArray.visit(ReplaceNewArray.java:53)
        */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onResume() {
        /*
            Method dump skipped, instruction units count: 1026
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.membership.registration.salariedworker.KtpGuidanceActivity.onResume():void");
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onPause() throws Throwable {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 35;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1551014231);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (46400 - View.combineMeasuredStates(0, 0)), 40 - KeyEvent.getDeadChar(0, 0), ((Process.getThreadPriority(0) + 20) >> 6) + 19, -1192477056, false, "TuitionPaymentFragmentspecialinlinedviewModeldefault1", null);
        }
        Object obj = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).get(null);
        try {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-421253012);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (46400 - (ViewConfiguration.getDoubleTapTimeout() >> 16)), (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 40, 19 - (ViewConfiguration.getWindowTouchSlop() >> 8), 41588667, false, "b", new Class[0]);
            }
            ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(obj, null);
            super.onPause();
            int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 59;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i4 % 128;
            int i5 = i4 % 2;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public final void attachBaseContext(Context context) throws Throwable {
        Object[] objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da;
        Object[] objArr;
        int i = 2 % 2;
        super.attachBaseContext(context);
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char jumpTapTimeout = (char) ((ViewConfiguration.getJumpTapTimeout() >> 16) + 29944);
            int i2 = (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 1754;
            int tapTimeout = 23 - (ViewConfiguration.getTapTimeout() >> 16);
            byte[] bArr = $$a;
            byte b = bArr[24];
            Object[] objArr2 = new Object[1];
            d(b, (short) (b | 141), (byte) (bArr[17] - 1), objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(jumpTapTimeout, i2, tapTimeout, 986134021, false, (String) objArr2[0], null);
        }
        if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null) != -1) {
            int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 117;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3 % 128;
            int i4 = i3 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                char fadingEdgeLength = (char) ((ViewConfiguration.getFadingEdgeLength() >> 16) + 29944);
                int iAlpha = 1755 - Color.alpha(0);
                int size = View.MeasureSpec.getSize(0) + 23;
                byte b2 = $$a[24];
                byte b3 = b2;
                Object[] objArr3 = new Object[1];
                d(b3, (short) (b3 | 52), b2, objArr3);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(fadingEdgeLength, iAlpha, size, 1599039318, false, (String) objArr3[0], null);
            }
            Object[] objArr4 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).get(null);
            objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da = new Object[]{new int[]{((int[]) objArr4[0])[0]}, new int[]{((int[]) objArr4[1])[0]}, (Object[]) objArr4[2], new int[1], (String[]) objArr4[4]};
            int iIdentityHashCode = System.identityHashCode(this);
            int i5 = ~iIdentityHashCode;
            int i6 = (-68524769) + (((~((-457640048) | i5)) | 54722601) * (-108)) + (((~(i5 | 670242473)) | (~((-670242474) | iIdentityHashCode)) | (-1073159920)) * 54) + ((iIdentityHashCode | (-1073159920)) * 54) + 642324797;
            int i7 = (i6 << 13) ^ i6;
            int i8 = i7 ^ (i7 >>> 17);
            ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da[3])[0] = i8 ^ (i8 << 5);
        } else {
            Object[] objArr5 = new Object[1];
            c(new char[]{41041, 41019, 64819, 49853, 32547, 50729, 34650, 'h', 43451, 62330, 51438, 5667, 46014, 60148, 56848, 7672, 48494, 57578, 58466, 9128}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 35, objArr5);
            Class<?> cls = Class.forName((String) objArr5[0]);
            Object[] objArr6 = new Object[1];
            c(new char[]{19846, 19951, 48417, 32557, 16180, 31658, 2111, 36610, 17462, 45928, 30072, 39249, 24134, 43692, 25523, 37516, 20617, 41190, 23008, 44229}, (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), objArr6);
            int iIntValue = ((Integer) cls.getMethod((String) objArr6[0], Object.class).invoke(null, this)).intValue();
            try {
                Object[] objArr7 = {-721556304};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2063193834);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (42049 - KeyEvent.keyCodeFromString("")), ((byte) KeyEvent.getModifierMetaStateMask()) + 1727, 29 - View.MeasureSpec.getSize(0), -1637387971, false, null, new Class[]{Integer.TYPE});
                }
                objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da = MediaSessionCompat.MediaSessionImplBase.AnonymousClass1.TuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da(iIntValue, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).newInstance(objArr7), 642324797);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    char modifierMetaStateMask = (char) (29943 - ((byte) KeyEvent.getModifierMetaStateMask()));
                    int iIndexOf = 1755 - TextUtils.indexOf("", "", 0);
                    int iAlpha2 = Color.alpha(0) + 23;
                    byte b4 = $$a[24];
                    byte b5 = b4;
                    Object[] objArr8 = new Object[1];
                    d(b5, (short) (b5 | 52), b4, objArr8);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(modifierMetaStateMask, iIndexOf, iAlpha2, 1599039318, false, (String) objArr8[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da);
                try {
                    Object[] objArr9 = new Object[1];
                    c(new char[]{38975, 39006, 15357, 25280, 47586, 26182, 35880, 2825, 37268, 13758, 26756, 7441, 35800, 11368, 32258, 5792, 34058, 9772, 17436, 10450, 48962, 4128, 19928, 8740, 43144, 2764}, (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 1, objArr9);
                    Class<?> cls2 = Class.forName((String) objArr9[0]);
                    Object[] objArr10 = new Object[1];
                    c(new char[]{18221, 18248, 3939, 7167, 36222, 8060, 14293, 45302, 20122, 302, 4542, 42640, 21696, 6374, 1914, 44410, 23048, 4782, 15671}, -TextUtils.indexOf((CharSequence) "", '0', 0), objArr10);
                    long jLongValue = ((Long) cls2.getDeclaredMethod((String) objArr10[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1145728641);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                        char c = (char) (29944 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)));
                        int i9 = 1755 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
                        int maximumFlingVelocity = 23 - (ViewConfiguration.getMaximumFlingVelocity() >> 16);
                        byte b6 = $$a[24];
                        byte b7 = b6;
                        Object[] objArr11 = new Object[1];
                        d(b7, (short) (b7 | 193), b6, objArr11);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(c, i9, maximumFlingVelocity, 1596667560, false, (String) objArr11[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                        char maximumDrawingCacheSize = (char) ((ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 29944);
                        int pressedStateDuration = (ViewConfiguration.getPressedStateDuration() >> 16) + 1755;
                        int iNormalizeMetaState = 23 - KeyEvent.normalizeMetaState(0);
                        byte[] bArr2 = $$a;
                        byte b8 = bArr2[24];
                        Object[] objArr12 = new Object[1];
                        d(b8, (short) (b8 | 141), (byte) (bArr2[17] - 1), objArr12);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(maximumDrawingCacheSize, pressedStateDuration, iNormalizeMetaState, 986134021, false, (String) objArr12[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf2);
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
        int i10 = ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da[1])[0];
        int i11 = ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da[0])[0];
        if (i11 != i10) {
            ArrayList arrayList = new ArrayList();
            String[] strArr = (String[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da[4];
            if (strArr != null) {
                for (String str : strArr) {
                    arrayList.add(str);
                }
            }
            throw new RuntimeException(String.valueOf(i11));
        }
        int i12 = ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da[3])[0];
        Object[] objArr13 = {new int[]{((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da[0])[0]}, new int[]{((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da[1])[0]}, (Object[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da[2], new int[1], (String[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da[4]};
        int layoutDirection = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().getLayoutDirection();
        int i13 = ~((-53504687) | layoutDirection);
        int i14 = ~layoutDirection;
        int i15 = i12 + (-754236975) + ((i13 | (~(159097739 | i14))) * (-1808)) + (((~((-19931787) | layoutDirection)) | (~(i14 | 192670639))) * TypedValues.Custom.TYPE_BOOLEAN) + (((~(layoutDirection | (-159097740))) | 33572900 | (~(53504686 | i14))) * TypedValues.Custom.TYPE_BOOLEAN);
        int i16 = (i15 << 13) ^ i15;
        int i17 = i16 ^ (i16 >>> 17);
        ((int[]) objArr13[3])[0] = i17 ^ (i17 << 5);
        int i18 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 125;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i18 % 128;
        int i19 = i18 % 2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
            char defaultSize = (char) View.getDefaultSize(0, 0);
            int i20 = 1032 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1));
            int scrollBarFadeDuration = 15 - (ViewConfiguration.getScrollBarFadeDuration() >> 16);
            byte b9 = $$a[24];
            byte b10 = b9;
            Object[] objArr14 = new Object[1];
            d(b10, (short) (b10 | 104), b9, objArr14);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(defaultSize, i20, scrollBarFadeDuration, 1357589585, false, (String) objArr14[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).getLong(null);
        Object[] objArr15 = new Object[1];
        c(new char[]{38975, 39006, 15357, 25280, 47586, 26182, 35880, 2825, 37268, 13758, 26756, 7441, 35800, 11368, 32258, 5792, 34058, 9772, 17436, 10450, 48962, 4128, 19928, 8740, 43144, 2764}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.save_card_dialog).substring(24, 25).codePointAt(0) - 116, objArr15);
        Class<?> cls3 = Class.forName((String) objArr15[0]);
        Object[] objArr16 = new Object[1];
        c(new char[]{18221, 18248, 3939, 7167, 36222, 8060, 14293, 45302, 20122, 302, 4542, 42640, 21696, 6374, 1914, 44410, 23048, 4782, 15671}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(0) - 98, objArr16);
        long jLongValue2 = ((Long) cls3.getDeclaredMethod((String) objArr16[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault10 == null) {
            char doubleTapTimeout = (char) (ViewConfiguration.getDoubleTapTimeout() >> 16);
            int iIndexOf2 = 1031 - TextUtils.indexOf("", "", 0);
            int mode = 15 - View.MeasureSpec.getMode(0);
            byte b11 = $$a[24];
            byte b12 = b11;
            Object[] objArr17 = new Object[1];
            d(b12, (short) (b12 | 52), b11, objArr17);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.b(doubleTapTimeout, iIndexOf2, mode, 1344079056, false, (String) objArr17[0], null);
        }
        if (j == ((jLongValue2 - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault10).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault11 == null) {
                char mirror = (char) (AndroidCharacter.getMirror('0') - '0');
                int longPressTimeout = (ViewConfiguration.getLongPressTimeout() >> 16) + 1031;
                int i21 = 16 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1));
                Object[] objArr18 = new Object[1];
                d((byte) ($$a[12] + 1), (short) ($$b | 8), (byte) 52, objArr18);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.b(mirror, longPressTimeout, i21, 632103528, false, (String) objArr18[0], null);
            }
            Object[] objArr19 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault11).get(null);
            objArr = new Object[]{strArr, new int[]{i}, new int[1], new int[]{i}};
            int i22 = ((int[]) objArr19[3])[0];
            int i23 = ((int[]) objArr19[1])[0];
            String[] strArr2 = (String[]) objArr19[0];
            int iIdentityHashCode2 = System.identityHashCode(this);
            int i24 = 1375679171 + (((~((-1001821135) | iIdentityHashCode2)) | 757540964) * (-318));
            int i25 = ~(757540964 | iIdentityHashCode2);
            int i26 = ~iIdentityHashCode2;
            int i27 = i24 + ((i25 | (~((-67184673) | i26))) * TypedValues.AttributesType.TYPE_PIVOT_TARGET) + (((~(iIdentityHashCode2 | (-67184673))) | (~(1069005806 | i26))) * TypedValues.AttributesType.TYPE_PIVOT_TARGET) + 1793411583;
            int i28 = (i27 << 13) ^ i27;
            int i29 = i28 ^ (i28 >>> 17);
            ((int[]) objArr[2])[0] = i29 ^ (i29 << 5);
        } else {
            Object[] objArr20 = new Object[1];
            c(new char[]{41041, 41019, 64819, 49853, 32547, 50729, 34650, 'h', 43451, 62330, 51438, 5667, 46014, 60148, 56848, 7672, 48494, 57578, 58466, 9128}, (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), objArr20);
            Class<?> cls4 = Class.forName((String) objArr20[0]);
            Object[] objArr21 = new Object[1];
            c(new char[]{19846, 19951, 48417, 32557, 16180, 31658, 2111, 36610, 17462, 45928, 30072, 39249, 24134, 43692, 25523, 37516, 20617, 41190, 23008, 44229}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.instruction_alto5_bni).substring(12, 13).codePointAt(0) - 107, objArr21);
            int iIntValue2 = ((Integer) cls4.getMethod((String) objArr21[0], Object.class).invoke(null, this)).intValue();
            Object[] objArr22 = {-721556304};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-725886332);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault12 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.b((char) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 46039), (-16776082) - Color.rgb(0, 0, 0), TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 19, 807763283, false, null, new Class[]{Integer.TYPE});
            }
            Object[] objArr23 = {Integer.valueOf(iIntValue2), 0, 1793411583, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault12).newInstance(objArr22), false};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1443305588);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault13 == null) {
                char cLastIndexOf = (char) (TextUtils.lastIndexOf("", '0', 0, 0) + 1);
                int iIndexOf3 = TextUtils.indexOf((CharSequence) "", '0') + 1032;
                int i30 = 15 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
                byte b13 = $$a[24];
                byte b14 = b13;
                Object[] objArr24 = new Object[1];
                d(b14, (short) (b14 | 104), b13, objArr24);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.b(cLastIndexOf, iIndexOf3, i30, 1298546779, false, (String) objArr24[0], new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (46041 - AndroidCharacter.getMirror('0')), 1117 - (ViewConfiguration.getPressedStateDuration() >> 16), (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 17), Boolean.TYPE});
            }
            Object[] objArr25 = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault13).invoke(null, objArr23);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault14 == null) {
                char offsetBefore = (char) TextUtils.getOffsetBefore("", 0);
                int scrollBarFadeDuration2 = (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 1031;
                int scrollBarFadeDuration3 = (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 15;
                Object[] objArr26 = new Object[1];
                d((byte) ($$a[12] + 1), (short) ($$b | 8), (byte) 52, objArr26);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.b(offsetBefore, scrollBarFadeDuration2, scrollBarFadeDuration3, 632103528, false, (String) objArr26[0], null);
            }
            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault14).set(null, objArr25);
            try {
                Object[] objArr27 = new Object[1];
                c(new char[]{38975, 39006, 15357, 25280, 47586, 26182, 35880, 2825, 37268, 13758, 26756, 7441, 35800, 11368, 32258, 5792, 34058, 9772, 17436, 10450, 48962, 4128, 19928, 8740, 43144, 2764}, TextUtils.getOffsetBefore("", 0) + 1, objArr27);
                Class<?> cls5 = Class.forName((String) objArr27[0]);
                Object[] objArr28 = new Object[1];
                c(new char[]{18221, 18248, 3939, 7167, 36222, 8060, 14293, 45302, 20122, 302, 4542, 42640, 21696, 6374, 1914, 44410, 23048, 4782, 15671}, (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), objArr28);
                long jLongValue3 = ((Long) cls5.getDeclaredMethod((String) objArr28[0], new Class[0]).invoke(null, new Object[0])).longValue();
                Long lValueOf3 = Long.valueOf(jLongValue3);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault15 == null) {
                    char cResolveSize = (char) View.resolveSize(0, 0);
                    int offsetAfter = TextUtils.getOffsetAfter("", 0) + 1031;
                    int modifierMetaStateMask2 = 14 - ((byte) KeyEvent.getModifierMetaStateMask());
                    byte b15 = $$a[24];
                    byte b16 = b15;
                    Object[] objArr29 = new Object[1];
                    d(b16, (short) (b16 | 52), b15, objArr29);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.b(cResolveSize, offsetAfter, modifierMetaStateMask2, 1344079056, false, (String) objArr29[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault15).set(null, lValueOf3);
                Long lValueOf4 = Long.valueOf(jLongValue3 >> 12);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault16 == null) {
                    char cMyTid = (char) (Process.myTid() >> 22);
                    int iCombineMeasuredStates = 1031 - View.combineMeasuredStates(0, 0);
                    int i31 = (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 14;
                    byte b17 = $$a[24];
                    byte b18 = b17;
                    Object[] objArr30 = new Object[1];
                    d(b18, (short) (b18 | 104), b17, objArr30);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.b(cMyTid, iCombineMeasuredStates, i31, 1357589585, false, (String) objArr30[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault16).set(null, lValueOf4);
                objArr = objArr25;
            } catch (Exception unused2) {
                throw new RuntimeException();
            }
        }
        int i32 = ((int[]) objArr[1])[0];
        int i33 = ((int[]) objArr[3])[0];
        if (i33 == i32) {
            Object[] objArr31 = {strArr, new int[]{i}, new int[1], new int[]{i}};
            int i34 = ((int[]) objArr[2])[0];
            int i35 = ((int[]) objArr[3])[0];
            int i36 = ((int[]) objArr[1])[0];
            String[] strArr3 = (String[]) objArr[0];
            int i37 = ~System.identityHashCode(this);
            int i38 = i34 + (-2055101962) + ((~((-539496481) | i37)) * (-783)) + (((~(i37 | (-548147513))) | (-792427683)) * 783);
            int i39 = (i38 << 13) ^ i38;
            int i40 = i39 ^ (i39 >>> 17);
            ((int[]) objArr31[2])[0] = i40 ^ (i40 << 5);
            return;
        }
        ArrayList arrayList2 = new ArrayList();
        String[] strArr4 = (String[]) objArr[0];
        if (strArr4 != null) {
            for (String str2 : strArr4) {
                int i41 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 61;
                TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i41 % 128;
                int i42 = i41 % 2;
                arrayList2.add(str2);
            }
        }
        Toast.makeText((Context) null, i33 / (((i33 - 1) * i33) % 2), 0).show();
        Object[] objArr32 = {strArr, new int[]{i}, new int[1], new int[]{i}};
        int i43 = ((int[]) objArr[2])[0];
        int i44 = ((int[]) objArr[3])[0];
        int i45 = ((int[]) objArr[1])[0];
        String[] strArr5 = (String[]) objArr[0];
        int iFreeMemory = (int) Runtime.getRuntime().freeMemory();
        int i46 = (-720942185) + (((~((-721647738) | iFreeMemory)) | 477367567) * (-318));
        int i47 = ~(477367567 | iFreeMemory);
        int i48 = ~iFreeMemory;
        int i49 = i43 + i46 + ((i47 | (~((-343147783) | i48))) * TypedValues.AttributesType.TYPE_PIVOT_TARGET) + (((~(iFreeMemory | (-343147783))) | (~(1064795519 | i48))) * TypedValues.AttributesType.TYPE_PIVOT_TARGET);
        int i50 = (i49 << 13) ^ i49;
        int i51 = i50 ^ (i50 >>> 17);
        ((int[]) objArr32[2])[0] = i51 ^ (i51 << 5);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x00e4, code lost:
    
        if (r1 != ((((415236097 | r6) * (-374)) + 1367819833) + ((r6 | 591159440) * 374))) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x00e6, code lost:
    
        r1 = ((java.lang.reflect.Field) defpackage.SequentialExecutor1.TuitionPaymentFragmentbindingInflater1[0]).getInt(null);
        r6 = ((android.content.Context) java.lang.Class.forName("android.app.ActivityThread").getMethod("currentApplication", new java.lang.Class[0]).invoke(null, null)).getResources().getConfiguration().smallestScreenWidthDp;
        r7 = ~r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0134, code lost:
    
        if (r1 != ((((-888722679) + (((~((-1499188318) | r7)) | 738388) * 168)) + ((~((-738389) | r6)) * 168)) + (((~(r6 | (-1498449930))) | ((~(r7 | (-537884373))) | 537145984)) * 168))) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0136, code lost:
    
        r1 = ((java.lang.reflect.Field) defpackage.putUninterruptibly.TuitionPaymentFragmentspecialinlinedviewModeldefault3[0]).getInt(null);
        r6 = java.lang.System.identityHashCode(r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0163, code lost:
    
        if (r1 != (((1385943927 + ((~((~r6) | (-1242185841))) * (-116))) + ((829787278 | r6) * 116)) + (((~(r6 | 1514094714)) | 557878404) * 116))) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0165, code lost:
    
        r1 = ((java.lang.reflect.Field) defpackage.transformAsync.TuitionPaymentFragmentbindingInflater1[0]).getInt(null);
        r6 = ((android.content.Context) java.lang.Class.forName("android.app.ActivityThread").getMethod("currentApplication", new java.lang.Class[0]).invoke(null, null)).getResources().getConfiguration().uiMode;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x01a4, code lost:
    
        if (r1 != (((1094889835 + (((~((-588723947) | r6)) | 554710720) * 1504)) + ((~(r6 | (-34013227))) * (-1504))) - 2077549232)) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x01a6, code lost:
    
        r1 = ((java.lang.reflect.Field) defpackage.getUninterruptibly.TuitionPaymentFragmentspecialinlinedviewModeldefault3[0]).getInt(null);
        r6 = java.lang.System.identityHashCode(r13);
        r7 = ~r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x01e2, code lost:
    
        if (r1 != (((1072878416 + ((((~((-213395969) | r7)) | (~((-587251977) | r6))) | (~((-1342242823) | r6))) * 765)) + (((~((-800647945) | r7)) | 213395968) * 1530)) + (((~(r6 | (-800647945))) | (~(r7 | (-1342242823)))) * 765))) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x01e4, code lost:
    
        r1 = ((java.lang.reflect.Field) defpackage.allAsList.b[0]).getInt(null);
        r6 = java.lang.System.identityHashCode(r13);
        r8 = ~((-273285221) | r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x020b, code lost:
    
        if (r1 != ((((-593090234) + ((33891344 | r8) * (-476))) + (r8 * 952)) + ((~((~r6) | (-273285221))) * 476))) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x020d, code lost:
    
        r1 = ((java.lang.reflect.Field) defpackage.lambdamakeTimeoutFuture2.b[0]).getInt(null);
        r6 = ((android.content.Context) java.lang.Class.forName("android.app.ActivityThread").getMethod("currentApplication", new java.lang.Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(com.bpjstku.R.string.formatted_installment_month).substring(16, 17).codePointAt(0) + 564310535;
        r9 = (-1386483875) + ((((~((-940158790) | r6)) | 134327616) | (~(849105559 | r6))) * (-880));
        r7 = (~((-940158790) | (~r6))) | (-849105560);
        r6 = ~(r6 | 940158789);
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x026f, code lost:
    
        if (r1 != ((r9 + ((r7 | r6) * (-880))) + (r6 * 880))) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0271, code lost:
    
        r1 = ((java.lang.reflect.Field) defpackage.cacheInteropConfig.b[0]).getInt(null);
        r2 = ((android.content.Context) java.lang.Class.forName("android.app.ActivityThread").getMethod("currentApplication", new java.lang.Class[0]).invoke(null, null)).getResources().getConfiguration().uiMode;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x02b3, code lost:
    
        if (r1 != (((1424084004 + (((~(r2 | 890909103)) | 1720896646) * (-668))) + ((890909103 | (~(1720896646 | r2))) * 1336)) + ((r2 | 2006646191) * 668))) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x02b5, code lost:
    
        r1 = ((java.lang.reflect.Field) defpackage.generateCameraId.TuitionPaymentFragmentspecialinlinedviewModeldefault1[0]).getInt(null);
        r2 = java.lang.System.identityHashCode(r13);
        r6 = (-1149920984) + ((r2 | 67280928) * 988);
        r4 = ~r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x02ea, code lost:
    
        if (r1 != ((r6 + (((~(637790589 | r4)) | 1370755714) * (-1976))) + ((((~(r2 | (-1941265376))) | 67280928) | (~(1941265375 | r4))) * 988))) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x02ec, code lost:
    
        super.onStart();
        r1 = com.bpjstku.presentation.membership.registration.salariedworker.KtpGuidanceActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 27;
        com.bpjstku.presentation.membership.registration.salariedworker.KtpGuidanceActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = r1 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x02f8, code lost:
    
        if ((r1 % 2) == 0) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x02fa, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x02fb, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x02fc, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0304, code lost:
    
        throw new java.lang.RuntimeException("2139811587");
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x030c, code lost:
    
        throw new java.lang.RuntimeException("-1215739396");
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x030d, code lost:
    
        r1 = (-530213320) % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0316, code lost:
    
        throw new java.lang.ArithmeticException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0317, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x031f, code lost:
    
        throw new java.lang.RuntimeException("-1392414656");
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0327, code lost:
    
        throw new java.lang.RuntimeException("679680420");
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0328, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0330, code lost:
    
        throw new java.lang.RuntimeException("1592467403");
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0331, code lost:
    
        r1 = 1601163298 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x033a, code lost:
    
        throw new java.lang.ArithmeticException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x007b, code lost:
    
        if (r1 == (((655361508 + ((827396160 | r7) * (-192))) + (((~((-1252959908) | r7)) | 170664961) * (-384))) + (((~(r6 | 2080356067)) | ((~(r7 | (-1082294947))) | (~((-170664962) | r6)))) * okhttp3.tls.internal.der.DerHeader.TAG_CLASS_PRIVATE))) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x00a4, code lost:
    
        if (r1 == (((((~((-1734632175) | r6)) | 2040730904) * 398) - 1866169680) + (((~((~r6) | (-1734632175))) | 2040730904) * 398))) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x00a6, code lost:
    
        r1 = ((java.lang.reflect.Field) defpackage.IoExecutor.TuitionPaymentFragmentspecialinlinedviewModeldefault1[0]).getInt(null);
        r7 = (java.lang.Object[]) null;
        r6 = ~((~((android.content.Context) java.lang.Class.forName("android.app.ActivityThread").getMethod("currentApplication", new java.lang.Class[0]).invoke(null, null)).getResources().getConfiguration().uiMode) | 1006395537);
     */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onStart() throws java.lang.IllegalAccessException, java.lang.NoSuchMethodException {
        /*
            Method dump skipped, instruction units count: 827
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.membership.registration.salariedworker.KtpGuidanceActivity.onStart():void");
    }

    public static /* synthetic */ void TuitionPaymentFragmentbindingInflater1(KtpGuidanceActivity ktpGuidanceActivity, View view) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 83;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
        ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(view);
        try {
            ktpGuidanceActivity.finish();
            ViewPortBuilder.b();
            int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 9;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i4 % 128;
            int i5 = i4 % 2;
        } catch (Throwable th) {
            ViewPortBuilder.b();
            throw th;
        }
    }

    public static /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault2(KtpGuidanceActivity ktpGuidanceActivity, View view) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 39;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
        ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(view);
        try {
            ktpGuidanceActivity.setResult(-1);
            ktpGuidanceActivity.finish();
            ViewPortBuilder.b();
            int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 71;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i4 % 128;
            int i5 = i4 % 2;
        } catch (Throwable th) {
            ViewPortBuilder.b();
            throw th;
        }
    }

    static {
        asInterface = 1;
        TuitionPaymentFragmentbindingInflater1();
        INSTANCE = new Companion(null);
        int i = f567a + 83;
        asInterface = i % 128;
        int i2 = i % 2;
    }

    static void TuitionPaymentFragmentbindingInflater1() {
        TuitionPaymentFragmentbindingInflater1 = -4706633715698407401L;
    }

    private static String $$g(short s, short s2, short s3) {
        byte[] bArr = $$c;
        int i = 107 - (s * 4);
        int i2 = s2 * 4;
        int i3 = 4 - (s3 * 3);
        byte[] bArr2 = new byte[1 - i2];
        int i4 = 0 - i2;
        int i5 = -1;
        if (bArr == null) {
            i = i4 + i3;
            i3++;
            i5 = -1;
        }
        while (true) {
            int i6 = i5 + 1;
            bArr2[i6] = (byte) i;
            if (i6 == i4) {
                return new String(bArr2, 0);
            }
            int i7 = i3;
            i += bArr[i3];
            i3 = i7 + 1;
            i5 = i6;
        }
    }
}
