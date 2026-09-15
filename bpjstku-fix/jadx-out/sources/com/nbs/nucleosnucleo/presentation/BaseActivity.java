package com.nbs.nucleosnucleo.presentation;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Bundle;
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
import android.widget.ExpandableListView;
import android.widget.Toast;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.bpjstku.R;
import defpackage.CaptureSession1;
import defpackage.LifecycleCameraRepository;
import defpackage.SessionConfigValidatingBuilderExternalSyntheticLambda0;
import defpackage.getLifecycleCamera;
import defpackage.hasUseCaseBound;
import defpackage.initSession;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.io.encoding.Base64;
import kotlin.jvm.internal.ByteCompanionObject;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.tls.internal.der.DerHeader;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b&\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\u0005J\u000f\u0010\b\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\b\u0010\u0005J\u000f\u0010\t\u001a\u00020\u0006H$¢\u0006\u0004\b\t\u0010\u0005J\u000f\u0010\n\u001a\u00020\u0006H$¢\u0006\u0004\b\n\u0010\u0005J\u000f\u0010\u000b\u001a\u00020\u0006H\u0015¢\u0006\u0004\b\u000b\u0010\u0005J\u000f\u0010\f\u001a\u00020\u0006H$¢\u0006\u0004\b\f\u0010\u0005J\u000f\u0010\r\u001a\u00020\u0006H$¢\u0006\u0004\b\r\u0010\u0005J\u000f\u0010\u000e\u001a\u00020\u0006H$¢\u0006\u0004\b\u000e\u0010\u0005J\u0019\u0010\u0011\u001a\u00020\u00062\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0014¢\u0006\u0004\b\u0011\u0010\u0012J!\u0010\u0016\u001a\u00020\u00062\b\u0010\u0010\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J)\u0010\u001a\u001a\u00020\u00062\b\u0010\u0010\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0015\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u001c\u0010\u0005R\u0014\u0010\u0016\u001a\u00020\u001d8%X¤\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001eR\u0018\u0010\u000b\u001a\u0004\u0018\u00010\u001f8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\n\u0010 "}, d2 = {"Lcom/nbs/nucleosnucleo/presentation/BaseActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "LgetLifecycleCamera;", "LLifecycleCameraRepository$b;", "<init>", "()V", "", "d_", "IconCompatParcelizer", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "b", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "a", "asInterface", "asBinder", "Landroid/os/Bundle;", "p0", "onCreate", "(Landroid/os/Bundle;)V", "Landroidx/appcompat/widget/Toolbar;", "", "p1", "TuitionPaymentFragmentbindingInflater1", "(Landroidx/appcompat/widget/Toolbar;Z)V", "", "p2", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "(Landroidx/appcompat/widget/Toolbar;Ljava/lang/String;Z)V", "MediaBrowserCompat", "", "()I", "Landroid/app/ProgressDialog;", "Landroid/app/ProgressDialog;"}, k = 1, mv = {2, 3, 0})
public abstract class BaseActivity extends AppCompatActivity implements getLifecycleCamera, LifecycleCameraRepository.b {
    private static short[] d;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private ProgressDialog TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    private static final byte[] $$s = {89, 92, -72, 43};
    private static final int $$t = 40;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$p = {77, -106, 83, 4, 1, -16, 38, -21, -24, 54, -55, 20, 15, -20, -3, -3, -7, 0, 42, -45, -7, 6, -7, -34, 11, -12, 10, -7, 0, 29, -18, -25, 11, 7, -10, -7, 45, -45, 16, -7, -7, 7, -10, -7, 17, -8, -6, 9, -6, -6, 6, 29, -38, 7, -7, 10, -20, 14, -14, 64, -13, 1, 62, -58, -9, -1, 7, -6, 6, 54, -52, -14, 9, -15, 2, 5, 4, 53, -58, -7, -7, 68, -64, 7, 3, -19, -3, 2, 12, -9, 7, -10, -7, 69, -60, -6, -7, 14, -14, 3, 12, -12, Base64.padSymbol, -77, -1, 23, -5, -13, 1, 62, -53, -15, 5, -10, -2, 8, -11, 70, -55, 2, -20, 18, 50, -69, 12, -12, 0, -4, -3, 69, -64, -3, 10, -2, -8, Base64.padSymbol, -69, 12, -13, -5, 15, -15, -2, 69, -35, -35, 12, -8, -4, 13, -4, 31, -30, -20, 18, 14, -20, -13, -5, 15, -15, -2, -7, 64, -69, 12, 3, -3, -18, 10, -14, 16, -20, 73, -60, -6, -7, 14, -14, 3, 12, -12, Base64.padSymbol, -57, -16, 6, 10, -18, 10, -7, 0, -6, 68, -25, -48, 6, 10, -18, 10, -7, 0, -6, 78, -47, -20, -9, -3, -6, 14, 35, -35, -18, 10, -7, 0, 42, -45, 1, -4, 14, -20, 35, -18, -18, 14, -3, -8, 2, -18, 20, -14, -44, 6, -14, -3, 48, -45, 0, -7, 1, 2, 2, -1, 6, -14, 48, -44, 6, -14, -3, 35, -18, -18, 16, -13, -7, 63, -13, 1, 62, -58, -9, -1, 7, -6, 6, 54, -57, -4, -10, 12, 2, 0, -19, 13, 54, -54, -16, 16, -19, 10, -5, -14, 4, 10, 5, -17, 68, -25, -36, -10, 12, 2, 0, -19, 13, 33, -48, 16, -19, 10, -5, -14, 4, 10, 5, -17, 39, -42, -5, 37, -20, -3, -3, -11, -2, 1, 16, -18, 77, -32, -45, 1, -4, 14, -14, 4, -7, 0, -13, 1, 62, -53, -15, 5, -10, -2, 8, -11, 70, -55, 2, -20, 18, 50, -69, 12, -3, -3, -11, -2, 1, 16, -20, 10, -7, 0, 63, -53, -15, -6, 70, -21, -15, -6, 2, -20, -3, -3, -11, -2, 1, 16, -20, 10, -7, 0, 41, -30, -20, 18, 13, -34, 4, -4, 12, 64, -1, -34, -52, 3, 14, -14, 3, 12, -12, 24, -39, 10, -7, 11, 2, -16, 10, 5, 22, -22, -13, 10, -3, 2, 42};
    private static final int $$q = 35;
    private static final byte[] $$g = {7, 15, 25, 25, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 54, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 55, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, 7, -18, -16, -1, -16, -16, -4, 19, -48, -3, -17, 0, -30, 4, -24, 54, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 56, -29, 31, -48, -17, 4, -24, 1, -6, -13, -13, -29, 38, -50, -16, -1, -12, -24};
    private static final int $$h = 184;
    private static int asBinder = 0;
    private static int g = 1;
    private static int TuitionPaymentFragmentbindingInflater1 = 1279429749;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault2 = -1934795538;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault3 = -1243222022;
    private static byte[] TuitionPaymentFragmentspecialinlinedviewModeldefault1 = {-24, 125, 97, 112, 90, -113, 125, 98, 114, 107, 95, 94, -88, 113, 50, -69, 104, 107, 118, 71, 111, 70, -31, 47, 51, 32, 63, 58, 43, 2, 89, 54, 37, 50, 6, 32, 62, -12, 91, 80, 75, 34, 40, 115, 89, 35, 75, 33, 73, 45, 58, 43, -98, 92, 47, 11, 98, 83, 82, 81, 46, 86, 33, -20, -85, -78, -91, -121, -86, -82, -83, -84, -88, -101, -3, -78, -79, -89, -88, -83, -122, -18, 33, 86, 38, 95, 3, 2, 96, 94, 42, 82, 27, 106, 76, 50, 80, -18, -64, -4, -73, -26, -4, -47, -40, 18, -52, -42, -4, -51, -56, -64, -58, -34, 31, 115, 43, 47, 17, 35, 46, 70, 31, 37, 43, 122, 20, 55, 126, 19, 45, 113, 46, 17, 43, 46, 126, 40, 20, 54, 47, 39, 54, 124, 23, 47, 40, ByteCompanionObject.MAX_VALUE, 28, 45, 126, 18, 125, 42, 18, 47, 45, ByteCompanionObject.MAX_VALUE, 30, 40, 37, 45, 123, 35, 47, 31, 126, 47, 16, 42, ByteCompanionObject.MAX_VALUE, 43, 44, 47, 34, 44, 26, -34, -93, -3, 2, -92, -15, 7, -2, -96, -14, -14, 1, -40, -13, 13, -39, -3, -13, -14, -12, -16, 3, -16, -82, -13, 0, -9, -96, -2, -9, 14, -40, -16, -14, -13, -3, -23, 10, -91, 1, -89, 3, -94, -15, -15, -12, -2, -16, -11, 5, -81, 4, -2, -95, 57, -16, -91, 12, -92, -4, -23, 1, -2, -11};

    private static void m(short s, byte b, int i, Object[] objArr) {
        int i2 = b + 84;
        byte[] bArr = $$g;
        int i3 = s + 4;
        byte[] bArr2 = new byte[i + 1];
        int i4 = -1;
        if (bArr == null) {
            i3++;
            i2 = (i2 + (-i)) - 11;
        }
        while (true) {
            i4++;
            bArr2[i4] = (byte) i2;
            if (i4 == i) {
                objArr[0] = new String(bArr2, 0);
                return;
            } else {
                i3++;
                i2 = (i2 + (-bArr[i3])) - 11;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0025  */
    /* JADX WARN: Code duplicated, block: B:8:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0025
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void n(short r6, short r7, short r8, java.lang.Object[] r9) {
        /*
            int r6 = r6 + 4
            int r0 = r7 + 1
            byte[] r1 = com.nbs.nucleosnucleo.presentation.BaseActivity.$$p
            int r8 = r8 + 65
            byte[] r0 = new byte[r0]
            r2 = -1
            if (r1 != 0) goto L11
            r8 = r6
            r4 = r7
            r3 = r2
            goto L2a
        L11:
            r3 = r2
        L12:
            r5 = r8
            r8 = r6
            r6 = r5
            int r3 = r3 + 1
            byte r4 = (byte) r6
            r0[r3] = r4
            if (r3 != r7) goto L25
            java.lang.String r6 = new java.lang.String
            r7 = 0
            r6.<init>(r0, r7)
            r9[r7] = r6
            return
        L25:
            r4 = r1[r8]
            r5 = r8
            r8 = r6
            r6 = r5
        L2a:
            int r4 = -r4
            int r6 = r6 + 1
            int r8 = r8 + r4
            int r8 = r8 + r2
            goto L12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nbs.nucleosnucleo.presentation.BaseActivity.n(short, short, short, java.lang.Object[]):void");
    }

    protected abstract void TuitionPaymentFragmentspecialinlinedviewModeldefault2();

    protected abstract int TuitionPaymentFragmentspecialinlinedviewModeldefault3();

    protected abstract void a();

    protected abstract void asBinder();

    protected abstract void asInterface();

    protected abstract void b();

    /* JADX WARN: Code duplicated, block: B:40:0x01a5 A[PHI: r0
  0x01a5: PHI (r0v35 int) = (r0v8 int), (r0v38 int) binds: [B:39:0x01a3, B:36:0x0191] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:41:0x01a7 A[PHI: r0
  0x01a7: PHI (r0v9 int) = (r0v8 int), (r0v38 int) binds: [B:39:0x01a3, B:36:0x0191] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:61:0x0268  */
    private static void l(byte b, short s, int i, int i2, int i3, Object[] objArr) throws Throwable {
        int i4;
        int i5;
        boolean z;
        int i6 = 2 % 2;
        SessionConfigValidatingBuilderExternalSyntheticLambda0 sessionConfigValidatingBuilderExternalSyntheticLambda0 = new SessionConfigValidatingBuilderExternalSyntheticLambda0();
        StringBuilder sb = new StringBuilder();
        try {
            Object[] objArr2 = {Integer.valueOf(i2), Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault2)};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1238528667);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                char defaultSize = (char) View.getDefaultSize(0, 0);
                int iNormalizeMetaState = KeyEvent.normalizeMetaState(0) + 2267;
                int longPressTimeout = (ViewConfiguration.getLongPressTimeout() >> 16) + 33;
                byte length = (byte) $$s.length;
                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(defaultSize, iNormalizeMetaState, longPressTimeout, 1387473586, false, $$u((byte) 0, length, (byte) (length - 4)), new Class[]{Integer.TYPE, Integer.TYPE});
            }
            int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).intValue();
            boolean z2 = iIntValue == -1;
            char c = '0';
            if (z2) {
                byte[] bArr = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                if (bArr != null) {
                    int length2 = bArr.length;
                    byte[] bArr2 = new byte[length2];
                    int i7 = 0;
                    while (i7 < length2) {
                        Object[] objArr3 = {Integer.valueOf(bArr[i7])};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(632534666);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                            char minimumFlingVelocity = (char) (ViewConfiguration.getMinimumFlingVelocity() >> 16);
                            int iMyPid = (Process.myPid() >> 22) + 3358;
                            int iLastIndexOf = 17 - TextUtils.lastIndexOf("", c, 0);
                            byte b2 = (byte) 0;
                            byte b3 = b2;
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(minimumFlingVelocity, iMyPid, iLastIndexOf, -1054011043, false, $$u(b2, b3, b3), new Class[]{Integer.TYPE});
                        }
                        bArr2[i7] = ((Byte) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).byteValue();
                        i7++;
                        c = '0';
                    }
                    bArr = bArr2;
                }
                if (bArr != null) {
                    byte[] bArr3 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                    Object[] objArr4 = {Integer.valueOf(i), Integer.valueOf(TuitionPaymentFragmentbindingInflater1)};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1238528667);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                        char cIndexOf = (char) ((-1) - TextUtils.indexOf((CharSequence) "", '0'));
                        int touchSlop = (ViewConfiguration.getTouchSlop() >> 8) + 2267;
                        int iAxisFromString = MotionEvent.axisFromString("") + 34;
                        byte length3 = (byte) $$s.length;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(cIndexOf, touchSlop, iAxisFromString, 1387473586, false, $$u((byte) 0, length3, (byte) (length3 - 4)), new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    iIntValue = (byte) (((byte) (((long) bArr3[((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4)).intValue()]) ^ 3046761265686732006L)) + ((int) (((long) TuitionPaymentFragmentspecialinlinedviewModeldefault2) ^ 3046761265686732006L)));
                } else {
                    iIntValue = (short) (((short) (((long) d[i + ((int) (((long) TuitionPaymentFragmentbindingInflater1) ^ 3046761265686732006L))]) ^ 3046761265686732006L)) + ((int) (((long) TuitionPaymentFragmentspecialinlinedviewModeldefault2) ^ 3046761265686732006L)));
                }
            }
            if (iIntValue > 0) {
                int i8 = $10 + 21;
                $11 = i8 % 128;
                if (i8 % 2 == 0) {
                    i4 = ((i + iIntValue) << 4) * ((int) (((long) TuitionPaymentFragmentbindingInflater1) ^ 3046761265686732006L));
                    if (!z2) {
                        i5 = 0;
                    } else {
                        i5 = 1;
                    }
                } else {
                    i4 = ((i + iIntValue) - 2) + ((int) (((long) TuitionPaymentFragmentbindingInflater1) ^ 3046761265686732006L));
                    if (z2) {
                        i5 = 1;
                    } else {
                        i5 = 0;
                    }
                }
                sessionConfigValidatingBuilderExternalSyntheticLambda0.b = i4 + i5;
                Object[] objArr5 = {sessionConfigValidatingBuilderExternalSyntheticLambda0, Integer.valueOf(i3), Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault3), sb};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1079014435);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    byte b4 = (byte) 0;
                    byte b5 = (byte) (b4 + 3);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (View.resolveSize(0, 0) + 55904), 2855 - Color.blue(0), 12 - TextUtils.indexOf((CharSequence) "", '0', 0), -1529949196, false, $$u(b4, b5, (byte) (b5 - 3)), new Class[]{Object.class, Integer.TYPE, Integer.TYPE, Object.class});
                }
                ((StringBuilder) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).append(sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
                sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                byte[] bArr4 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                if (bArr4 != null) {
                    int length4 = bArr4.length;
                    byte[] bArr5 = new byte[length4];
                    int i9 = 0;
                    while (i9 < length4) {
                        int i10 = $11 + 31;
                        $10 = i10 % 128;
                        if (i10 % 2 != 0) {
                            bArr5[i9] = (byte) (((long) bArr4[i9]) | 3046761265686732006L);
                            i9 >>>= 1;
                        } else {
                            bArr5[i9] = (byte) (((long) bArr4[i9]) ^ 3046761265686732006L);
                            i9++;
                        }
                    }
                    bArr4 = bArr5;
                }
                if (bArr4 != null) {
                    int i11 = $10 + 29;
                    $11 = i11 % 128;
                    if (i11 % 2 == 0) {
                        z = false;
                    } else {
                        z = true;
                    }
                } else {
                    z = false;
                }
                sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 1;
                int i12 = $10 + 69;
                $11 = i12 % 128;
                int i13 = i12 % 2;
                while (sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3 < iIntValue) {
                    if (z) {
                        byte[] bArr6 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                        int i14 = sessionConfigValidatingBuilderExternalSyntheticLambda0.b;
                        sessionConfigValidatingBuilderExternalSyntheticLambda0.b = i14 - 1;
                        sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = (char) (sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2 + (((byte) (((byte) (((long) bArr6[i14]) ^ 3046761265686732006L)) + s)) ^ b));
                    } else {
                        short[] sArr = d;
                        int i15 = sessionConfigValidatingBuilderExternalSyntheticLambda0.b;
                        sessionConfigValidatingBuilderExternalSyntheticLambda0.b = i15 - 1;
                        sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = (char) (sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2 + (((short) (((short) (((long) sArr[i15]) ^ 3046761265686732006L)) + s)) ^ b));
                    }
                    sb.append(sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
                    sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                    sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3++;
                }
            }
            objArr[0] = sb.toString();
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }

    /* JADX WARN: Code duplicated, block: B:191:0x1798  */
    /* JADX WARN: Code duplicated, block: B:194:0x17a2  */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle p0) throws Throwable {
        String str;
        Object[] objArr;
        String str2;
        int i;
        Object[] objArr2;
        Object[] objArr3;
        Object[] objArrTuitionPaymentFragmentbindingInflater1$5f1425da;
        int i2;
        String str3;
        Object[] objArr4;
        Object[] objArr5;
        String str4;
        Object[] objArr6;
        Object[] objArr7;
        int i3;
        String str5;
        Object[] objArr8;
        char c;
        String str6;
        Object[] objArr9;
        Object[] objArr10;
        int i4 = 2 % 2;
        Object[] objArr11 = new Object[1];
        l((byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.btn_save_card).substring(1, 2).codePointAt(0) - 101), (short) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.bri_internet_instruction_4).substring(3, 4).length() + 108), 1058025289 + ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 45, (-961065768) + ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(2), objArr11);
        String str7 = (String) objArr11[0];
        Object[] objArr12 = new Object[1];
        l((byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.permata_instruction_step5).substring(8, 9).codePointAt(0) - 32), (short) ((ViewConfiguration.getPressedStateDuration() >> 16) + 47), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 1058025311, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.validation_shippingcity_empty).substring(18, 19).codePointAt(0) - 114, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.complete_payment_at_atm).substring(4, 5).length() - 961065656, objArr12);
        String str8 = (String) objArr12[0];
        Object[] objArr13 = new Object[1];
        l((byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() - 11), (short) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(4) - 33), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.mandiri_instruction_step2).substring(13, 14).length() + 1058025405, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.indomaret_instruction_step6).substring(20, 21).codePointAt(0) - 124, (-961065649) - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), objArr13);
        String str9 = (String) objArr13[0];
        Object[] objArr14 = new Object[1];
        l((byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 36), (short) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.instruction_klikbca2).substring(15, 16).length() - 38), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.tnc_bni_point_2).substring(10, 11).codePointAt(0) + 1058025319, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.pay_with_mandiri_point).substring(1, 3).codePointAt(0) - 106, KeyEvent.keyCodeFromString("") - 961065651, objArr14);
        String str10 = (String) objArr14[0];
        Object[] objArr15 = new Object[1];
        l((byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.try_again).substring(6, 7).codePointAt(0) - 97), (short) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 59), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(0) + 1058025263, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() - 20, (-961065659) - Gravity.getAbsoluteGravity(0, 0), objArr15);
        String str11 = (String) objArr15[0];
        Object[] objArr16 = new Object[1];
        l((byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 36), (short) (View.MeasureSpec.makeMeasureSpec(0, 0) - 78), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.vida_camera_screen_instructions_text_face_too_far).substring(0, 25).length() + 1058025363, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.hint_address).substring(0, 6).codePointAt(1) - 117, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.tnc_bni_point_4).substring(4, 5).codePointAt(0) - 961065689, objArr16);
        String str12 = (String) objArr16[0];
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(797565291);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char c2 = (char) (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1));
            int packedPositionGroup = ExpandableListView.getPackedPositionGroup(0L) + 2267;
            int iLastIndexOf = TextUtils.lastIndexOf("", '0') + 34;
            short s = $$g[7];
            byte b = (byte) s;
            Object[] objArr17 = new Object[1];
            m(s, b, (byte) (b | 52), objArr17);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(c2, packedPositionGroup, iLastIndexOf, -887667012, false, (String) objArr17[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        long jLongValue = ((Long) Class.forName(str7).getDeclaredMethod(str8, new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(796641770);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char keyRepeatTimeout = (char) (ViewConfiguration.getKeyRepeatTimeout() >> 16);
            int windowTouchSlop = 2267 - (ViewConfiguration.getWindowTouchSlop() >> 8);
            int i5 = 34 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1));
            byte b2 = $$g[7];
            Object[] objArr18 = new Object[1];
            m((short) 52, b2, (byte) (b2 | 52), objArr18);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(keyRepeatTimeout, windowTouchSlop, i5, -874156483, false, (String) objArr18[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1013250600);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char c3 = (char) (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1));
                int i6 = 2268 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1));
                int i7 = (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 32;
                byte b3 = $$g[7];
                Object[] objArr19 = new Object[1];
                m((short) 104, b3, (byte) (b3 | 37), objArr19);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(c3, i6, i7, -654680577, false, (String) objArr19[0], null);
            }
            Object[] objArr20 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            objArr = new Object[]{new int[]{i}, strArr, new int[1], new int[]{i}};
            int i8 = ((int[]) objArr20[0])[0];
            int i9 = ((int[]) objArr20[3])[0];
            String[] strArr = (String[]) objArr20[1];
            int elapsedCpuTime = (int) Process.getElapsedCpuTime();
            int i10 = (((-1641828168) + (((~(elapsedCpuTime | 996169501)) | 788640) * 305)) + (((~((~elapsedCpuTime) | 996169501)) | 187456185) * 305)) - 900736328;
            int i11 = (i10 << 13) ^ i10;
            int i12 = i11 ^ (i11 >>> 17);
            ((int[]) objArr[2])[0] = i12 ^ (i12 << 5);
            str = str8;
        } else {
            Context baseContext = getBaseContext();
            if (baseContext == null) {
                baseContext = (Context) Class.forName(str11).getMethod(str12, new Class[0]).invoke(null, null);
            }
            if (baseContext != null) {
                baseContext = ((baseContext instanceof ContextWrapper) && ((ContextWrapper) baseContext).getBaseContext() == null) ? null : baseContext.getApplicationContext();
            }
            try {
                Object[] objArr21 = {baseContext, Integer.valueOf(((Integer) Class.forName(str9).getMethod(str10, Object.class).invoke(null, this)).intValue()), 0, -900736328};
                byte[] bArr = $$p;
                Object[] objArr22 = new Object[1];
                n(bArr[17], (byte) (-bArr[85]), bArr[6], objArr22);
                Class<?> cls = Class.forName((String) objArr22[0]);
                byte b4 = bArr[85];
                Object[] objArr23 = new Object[1];
                n((short) (-b4), bArr[310], (byte) (-b4), objArr23);
                Object[] objArr24 = (Object[]) cls.getMethod((String) objArr23[0], Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr21);
                if (baseContext != null) {
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1013250600);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        char cAxisFromString = (char) ((-1) - MotionEvent.axisFromString(""));
                        int iCombineMeasuredStates = View.combineMeasuredStates(0, 0) + 2267;
                        int i13 = 34 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1));
                        byte b5 = $$g[7];
                        Object[] objArr25 = new Object[1];
                        m((short) 104, b5, (byte) (b5 | 37), objArr25);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(cAxisFromString, iCombineMeasuredStates, i13, -654680577, false, (String) objArr25[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr24);
                    try {
                        str = str8;
                        long jLongValue2 = ((Long) Class.forName(str7).getDeclaredMethod(str, new Class[0]).invoke(null, new Object[0])).longValue();
                        Long lValueOf = Long.valueOf(jLongValue2);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(796641770);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                            char cCombineMeasuredStates = (char) View.combineMeasuredStates(0, 0);
                            int maxKeyCode = (KeyEvent.getMaxKeyCode() >> 16) + 2267;
                            int iIndexOf = TextUtils.indexOf((CharSequence) "", '0', 0) + 34;
                            byte b6 = $$g[7];
                            Object[] objArr26 = new Object[1];
                            m((short) 52, b6, (byte) (b6 | 52), objArr26);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(cCombineMeasuredStates, maxKeyCode, iIndexOf, -874156483, false, (String) objArr26[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                        Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(797565291);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                            char cIndexOf = (char) (TextUtils.indexOf((CharSequence) "", '0') + 1);
                            int scrollDefaultDelay = (ViewConfiguration.getScrollDefaultDelay() >> 16) + 2267;
                            int iLastIndexOf2 = 32 - TextUtils.lastIndexOf("", '0', 0, 0);
                            short s2 = $$g[7];
                            byte b7 = (byte) s2;
                            Object[] objArr27 = new Object[1];
                            m(s2, b7, (byte) (b7 | 52), objArr27);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(cIndexOf, scrollDefaultDelay, iLastIndexOf2, -887667012, false, (String) objArr27[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf2);
                    } catch (Exception unused) {
                        throw new RuntimeException();
                    }
                } else {
                    objArr24 = objArr24;
                    str = str8;
                }
                objArr = objArr24;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        int i14 = ((int[]) objArr[3])[0];
        int i15 = ((int[]) objArr[0])[0];
        if (i15 == i14) {
            int i16 = asBinder + 55;
            g = i16 % 128;
            int i17 = i16 % 2;
            Object[] objArr28 = {new int[]{i}, strArr, new int[1], new int[]{i}};
            int i18 = ((int[]) objArr[2])[0];
            int i19 = ((int[]) objArr[0])[0];
            int i20 = ((int[]) objArr[3])[0];
            String[] strArr2 = (String[]) objArr[1];
            str2 = "currentApplication";
            int i21 = ~(((Context) Class.forName("android.app.ActivityThread").getMethod(str2, new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.validation_phone_no_invalid).substring(28, 30).codePointAt(0) + 1175145448);
            int i22 = ~(1039148839 | i21);
            int i23 = i18 + 67638951 + ((i22 | (-230435524)) * 764) + (((~(i21 | (-230435524))) | 229646851) * (-1528)) + (((-810290661) | i22) * 764);
            int i24 = (i23 << 13) ^ i23;
            int i25 = i24 ^ (i24 >>> 17);
            i = 0;
            ((int[]) objArr28[2])[0] = i25 ^ (i25 << 5);
        } else {
            str2 = r5;
            ArrayList arrayList = new ArrayList();
            String[] strArr3 = (String[]) objArr[1];
            if (strArr3 != null) {
                int i26 = 0;
                while (i26 < strArr3.length) {
                    int i27 = asBinder + 43;
                    g = i27 % 128;
                    if (i27 % 2 == 0) {
                        arrayList.add(strArr3[i26]);
                        i26 += 78;
                    } else {
                        arrayList.add(strArr3[i26]);
                        i26++;
                    }
                }
            }
            int[] iArr = new int[i15];
            int i28 = i15 - 1;
            iArr[i28] = 1;
            Toast.makeText((Context) null, iArr[((i15 * i28) % 2) - 1], 1).show();
            Object[] objArr29 = {new int[]{i}, strArr, new int[1], new int[]{i}};
            int i29 = ((int[]) objArr[2])[0];
            int i30 = ((int[]) objArr[0])[0];
            int i31 = ((int[]) objArr[3])[0];
            String[] strArr4 = (String[]) objArr[1];
            int elapsedCpuTime2 = (int) Process.getElapsedCpuTime();
            int i32 = 1100458925 + ((elapsedCpuTime2 | 1051519208) * (-50));
            int i33 = ~((-813957225) | elapsedCpuTime2);
            int i34 = ~elapsedCpuTime2;
            int i35 = i29 + i32 + ((i33 | (~(1056763116 | i34))) * 50) + (((~(i34 | 1051519208)) | (~(242805892 | i34)) | (-1056763117)) * 50);
            int i36 = (i35 << 13) ^ i35;
            int i37 = i36 ^ (i36 >>> 17);
            i = 0;
            ((int[]) objArr29[2])[0] = i37 ^ (i37 << 5);
        }
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
            char capsMode = (char) TextUtils.getCapsMode("", i, i);
            int iIndexOf2 = 1030 - TextUtils.indexOf((CharSequence) "", '0');
            int iIndexOf3 = 15 - TextUtils.indexOf("", "", i);
            byte b8 = $$g[7];
            Object[] objArr30 = new Object[1];
            m((short) 52, b8, (byte) (b8 | 52), objArr30);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(capsMode, iIndexOf2, iIndexOf3, 1357589585, false, (String) objArr30[0], null);
        }
        long j2 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).getLong(null);
        long jLongValue3 = ((Long) Class.forName(str7).getDeclaredMethod(str, new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault10 == null) {
            char c4 = (char) (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
            int maxKeyCode2 = 1031 - (KeyEvent.getMaxKeyCode() >> 16);
            int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0) + 15;
            short s3 = $$g[7];
            byte b9 = (byte) s3;
            Object[] objArr31 = new Object[1];
            m(s3, b9, (byte) (b9 | 52), objArr31);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.b(c4, maxKeyCode2, iMakeMeasureSpec, 1344079056, false, (String) objArr31[0], null);
        }
        if (j2 == ((jLongValue3 - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault10).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault11 == null) {
                char cLastIndexOf = (char) ((-1) - TextUtils.lastIndexOf("", '0'));
                int pressedStateDuration = 1031 - (ViewConfiguration.getPressedStateDuration() >> 16);
                int gidForName = Process.getGidForName("") + 16;
                byte[] bArr2 = $$g;
                Object[] objArr32 = new Object[1];
                m((short) 141, (byte) (bArr2[1] - 1), bArr2[7], objArr32);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.b(cLastIndexOf, pressedStateDuration, gidForName, 632103528, false, (String) objArr32[0], null);
            }
            Object[] objArr33 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault11).get(null);
            objArr2 = new Object[]{strArr, new int[]{i}, new int[1], new int[]{i}};
            int i38 = ((int[]) objArr33[3])[0];
            int i39 = ((int[]) objArr33[1])[0];
            String[] strArr5 = (String[]) objArr33[0];
            int i40 = ((Context) Class.forName(r1).getMethod(str2, new Class[0]).invoke(null, null)).getResources().getConfiguration().screenLayout;
            int i41 = ~((-901783395) | i40);
            int i42 = (-498925267) + ((620761952 | i41) * (-280)) + ((i41 | (~(657503224 | i40))) * 140);
            int i43 = ~((-281021443) | i40);
            int i44 = ~i40;
            int i45 = (i42 + (((~(i44 | 938524666)) | (i43 | (~((-620761953) | i44)))) * 140)) - 423992887;
            int i46 = (i45 << 13) ^ i45;
            int i47 = i46 ^ (i46 >>> 17);
            ((int[]) objArr2[2])[0] = i47 ^ (i47 << 5);
        } else {
            int iIntValue = ((Integer) Class.forName(str9).getMethod(str10, Object.class).invoke(null, this)).intValue();
            try {
                Object[] objArr34 = {1624662004};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-725886332);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault12 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.b((char) (((Process.getThreadPriority(0) + 20) >> 6) + 46038), (ViewConfiguration.getFadingEdgeLength() >> 16) + 1134, 18 - (ViewConfiguration.getDoubleTapTimeout() >> 16), 807763283, false, null, new Class[]{Integer.TYPE});
                }
                Object[] objArr35 = {Integer.valueOf(iIntValue), 0, -423992887, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault12).newInstance(objArr34), false};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1443305588);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault13 == null) {
                    char cIndexOf2 = (char) TextUtils.indexOf("", "", 0);
                    int threadPriority = ((Process.getThreadPriority(0) + 20) >> 6) + 1031;
                    int i48 = 16 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1));
                    byte b10 = $$g[7];
                    Object[] objArr36 = new Object[1];
                    m((short) 52, b10, (byte) (b10 | 52), objArr36);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.b(cIndexOf2, threadPriority, i48, 1298546779, false, (String) objArr36[0], new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (Color.green(0) + 45993), Color.green(0) + 1117, 18 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))), Boolean.TYPE});
                }
                objArr2 = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault13).invoke(null, objArr35);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault14 == null) {
                    char cKeyCodeFromString = (char) KeyEvent.keyCodeFromString("");
                    int iAxisFromString = 1030 - MotionEvent.axisFromString("");
                    int modifierMetaStateMask = 14 - ((byte) KeyEvent.getModifierMetaStateMask());
                    byte[] bArr3 = $$g;
                    Object[] objArr37 = new Object[1];
                    m((short) 141, (byte) (bArr3[1] - 1), bArr3[7], objArr37);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.b(cKeyCodeFromString, iAxisFromString, modifierMetaStateMask, 632103528, false, (String) objArr37[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault14).set(null, objArr2);
                try {
                    long jLongValue4 = ((Long) Class.forName(str7).getDeclaredMethod(str, new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf3 = Long.valueOf(jLongValue4);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault15 == null) {
                        char trimmedLength = (char) TextUtils.getTrimmedLength("");
                        int iBlue = 1031 - Color.blue(0);
                        int iMyTid = 15 - (Process.myTid() >> 22);
                        short s4 = $$g[7];
                        byte b11 = (byte) s4;
                        Object[] objArr38 = new Object[1];
                        m(s4, b11, (byte) (b11 | 52), objArr38);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.b(trimmedLength, iBlue, iMyTid, 1344079056, false, (String) objArr38[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault15).set(null, lValueOf3);
                    Long lValueOf4 = Long.valueOf(jLongValue4 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault16 == null) {
                        char cGreen = (char) Color.green(0);
                        int i49 = 1031 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
                        int doubleTapTimeout = 15 - (ViewConfiguration.getDoubleTapTimeout() >> 16);
                        byte b12 = $$g[7];
                        Object[] objArr39 = new Object[1];
                        m((short) 52, b12, (byte) (b12 | 52), objArr39);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.b(cGreen, i49, doubleTapTimeout, 1357589585, false, (String) objArr39[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault16).set(null, lValueOf4);
                } catch (Exception unused2) {
                    throw new RuntimeException();
                }
            } catch (Throwable th2) {
                Throwable cause2 = th2.getCause();
                if (cause2 == null) {
                    throw th2;
                }
                throw cause2;
            }
        }
        if (((int[]) objArr2[3])[0] != ((int[]) objArr2[1])[0]) {
            ArrayList arrayList2 = new ArrayList();
            String[] strArr6 = (String[]) objArr2[0];
            if (strArr6 != null) {
                int i50 = asBinder + 103;
                g = i50 % 128;
                int i51 = i50 % 2;
                for (String str13 : strArr6) {
                    arrayList2.add(str13);
                }
            }
            throw null;
        }
        Object[] objArr40 = {strArr, new int[]{i}, new int[1], new int[]{i}};
        int i52 = ((int[]) objArr2[2])[0];
        int i53 = ((int[]) objArr2[3])[0];
        int i54 = ((int[]) objArr2[1])[0];
        String[] strArr7 = (String[]) objArr2[0];
        int iMaxMemory = (int) Runtime.getRuntime().maxMemory();
        int i55 = i52 + ((((-32342713) + (((~iMaxMemory) | (-206520906)) * 1444)) + (((~(iMaxMemory | 19027608)) | ((~(225252561 | iMaxMemory)) | (-225400538))) * (-1444))) - 1215761950);
        int i56 = (i55 << 13) ^ i55;
        int i57 = i56 ^ (i56 >>> 17);
        ((int[]) objArr40[2])[0] = i57 ^ (i57 << 5);
        int i58 = asBinder + 79;
        g = i58 % 128;
        int i59 = i58 % 2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault17 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1354724972);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault17 == null) {
            char c5 = (char) (43043 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)));
            int i60 = 3111 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
            int i61 = (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 21;
            byte b13 = $$g[7];
            Object[] objArr41 = new Object[1];
            m((short) 52, b13, (byte) (b13 | 52), objArr41);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault17 = initSession.b(c5, i60, i61, -1272852037, false, (String) objArr41[0], null);
        }
        long j3 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault17).getLong(null);
        long jLongValue5 = ((Long) Class.forName(str7).getDeclaredMethod(str, new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault18 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1355648493);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault18 == null) {
            char threadPriority2 = (char) (43042 - ((Process.getThreadPriority(0) + 20) >> 6));
            int i62 = 3110 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1));
            int i63 = 23 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1));
            short s5 = $$g[7];
            byte b14 = (byte) s5;
            Object[] objArr42 = new Object[1];
            m(s5, b14, (byte) (b14 | 52), objArr42);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault18 = initSession.b(threadPriority2, i62, i63, -1269618118, false, (String) objArr42[0], null);
        }
        if (j3 == ((jLongValue5 - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault18).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault19 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-308143642);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault19 == null) {
                char longPressTimeout = (char) (43042 - (ViewConfiguration.getLongPressTimeout() >> 16));
                int size = 3111 - View.MeasureSpec.getSize(0);
                int iLastIndexOf3 = 21 - TextUtils.lastIndexOf("", '0', 0, 0);
                byte b15 = $$g[7];
                Object[] objArr43 = new Object[1];
                m((short) 104, b15, (byte) (b15 | 37), objArr43);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault19 = initSession.b(longPressTimeout, size, iLastIndexOf3, 154975793, false, (String) objArr43[0], null);
            }
            Object[] objArr44 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault19).get(null);
            int i64 = ((int[]) objArr44[2])[0];
            int i65 = ((int[]) objArr44[1])[0];
            String[] strArr8 = (String[]) objArr44[3];
            int[] iArr2 = {i65};
            int layoutDirection = ((Context) Class.forName(r1).getMethod(str2, new Class[0]).invoke(null, null)).getResources().getConfiguration().getLayoutDirection();
            int i66 = 2048583942 + (((~(layoutDirection | 255178649)) | (-1602224026)) * 305) + (((~((~layoutDirection) | 255178649)) | (-1449852810)) * 305) + 758841914;
            int i67 = (i66 << 13) ^ i66;
            int i68 = i67 ^ (i67 >>> 17);
            ((int[]) objArr3[0])[0] = i68 ^ (i68 << 5);
            objArr3 = new Object[]{new int[1], iArr2, new int[]{i64}, strArr8};
        } else {
            Object[] objArr45 = {null, Integer.valueOf(((Integer) Class.forName(str9).getMethod(str10, Object.class).invoke(null, this)).intValue()), 0, 758841914};
            byte[] bArr4 = $$p;
            Object[] objArr46 = new Object[1];
            n((short) 56, (byte) (-bArr4[203]), (byte) (-bArr4[23]), objArr46);
            Class<?> cls2 = Class.forName((String) objArr46[0]);
            Object[] objArr47 = new Object[1];
            n((short) ($$q | 68), bArr4[17], bArr4[296], objArr47);
            objArr3 = (Object[]) cls2.getMethod((String) objArr47[0], Class.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr45);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault20 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-308143642);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault20 == null) {
                char cGreen2 = (char) (43042 - Color.green(0));
                int iResolveSize = 3111 - View.resolveSize(0, 0);
                int i69 = (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 22;
                byte b16 = $$g[7];
                Object[] objArr48 = new Object[1];
                m((short) 104, b16, (byte) (b16 | 37), objArr48);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault20 = initSession.b(cGreen2, iResolveSize, i69, 154975793, false, (String) objArr48[0], null);
            }
            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault20).set(null, objArr3);
            try {
                long jLongValue6 = ((Long) Class.forName(str7).getDeclaredMethod(str, new Class[0]).invoke(null, new Object[0])).longValue();
                Long lValueOf5 = Long.valueOf(jLongValue6);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault21 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1355648493);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault21 == null) {
                    char cLastIndexOf2 = (char) (TextUtils.lastIndexOf("", '0', 0) + 43043);
                    int i70 = 3110 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1));
                    int iGreen = Color.green(0) + 22;
                    short s6 = $$g[7];
                    byte b17 = (byte) s6;
                    Object[] objArr49 = new Object[1];
                    m(s6, b17, (byte) (b17 | 52), objArr49);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault21 = initSession.b(cLastIndexOf2, i70, iGreen, -1269618118, false, (String) objArr49[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault21).set(null, lValueOf5);
                Long lValueOf6 = Long.valueOf(jLongValue6 >> 12);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault22 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1354724972);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault22 == null) {
                    char cCombineMeasuredStates2 = (char) (View.combineMeasuredStates(0, 0) + 43042);
                    int i71 = 3112 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1));
                    int maximumDrawingCacheSize = (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 22;
                    byte b18 = $$g[7];
                    Object[] objArr50 = new Object[1];
                    m((short) 52, b18, (byte) (b18 | 52), objArr50);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault22 = initSession.b(cCombineMeasuredStates2, i71, maximumDrawingCacheSize, -1272852037, false, (String) objArr50[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault22).set(null, lValueOf6);
            } catch (Exception unused3) {
                throw new RuntimeException();
            }
        }
        int i72 = ((int[]) objArr3[1])[0];
        int i73 = ((int[]) objArr3[2])[0];
        if (i73 != i72) {
            ArrayList arrayList3 = new ArrayList();
            String[] strArr9 = (String[]) objArr3[3];
            if (strArr9 != null) {
                for (String str14 : strArr9) {
                    arrayList3.add(str14);
                }
            }
            throw new RuntimeException(String.valueOf(i73));
        }
        int i74 = ((int[]) objArr3[0])[0];
        int i75 = ((int[]) objArr3[2])[0];
        int i76 = ((int[]) objArr3[1])[0];
        String[] strArr10 = (String[]) objArr3[3];
        int[] iArr3 = {i75};
        int[] iArr4 = {i76};
        int length = ((Context) Class.forName(r1).getMethod(str2, new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() - 1129880563;
        int i77 = (-363070666) + (((~((-677408895) | length)) | 2109530 | (~(1027622564 | length))) * (-754));
        int i78 = ~((-2109531) | length);
        int i79 = ~length;
        int i80 = i74 + i77 + ((i78 | (~(1029732094 | i79))) * (-754)) + ((i79 | (-677408895)) * 754);
        int i81 = (i80 << 13) ^ i80;
        int i82 = i81 ^ (i81 >>> 17);
        ((int[]) objArr[0])[0] = i82 ^ (i82 << 5);
        Object[] objArr51 = {new int[1], iArr4, iArr3, strArr10};
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault23 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault23 == null) {
            char threadPriority3 = (char) (29944 - ((Process.getThreadPriority(0) + 20) >> 6));
            int iArgb = Color.argb(0, 0, 0, 0) + 1755;
            int iResolveOpacity = Drawable.resolveOpacity(0, 0) + 23;
            byte b19 = $$g[7];
            Object[] objArr52 = new Object[1];
            m((short) 104, b19, (byte) (b19 | 37), objArr52);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault23 = initSession.b(threadPriority3, iArgb, iResolveOpacity, 986134021, false, (String) objArr52[0], null);
        }
        long j4 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault23).getLong(null);
        long jLongValue7 = ((Long) Class.forName(str7).getDeclaredMethod(str, new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault24 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1145728641);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault24 == null) {
            char doubleTapTimeout2 = (char) ((ViewConfiguration.getDoubleTapTimeout() >> 16) + 29944);
            int scrollBarSize = (ViewConfiguration.getScrollBarSize() >> 8) + 1755;
            int iLastIndexOf4 = 22 - TextUtils.lastIndexOf("", '0', 0);
            byte b20 = $$g[7];
            Object[] objArr53 = new Object[1];
            m((short) 141, b20, (byte) (b20 | 52), objArr53);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault24 = initSession.b(doubleTapTimeout2, scrollBarSize, iLastIndexOf4, 1596667560, false, (String) objArr53[0], null);
        }
        if (j4 == ((jLongValue7 - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault24).getLong(null) << 52) >>> 52)) >> 12)) {
            int i83 = asBinder + 41;
            g = i83 % 128;
            int i84 = i83 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault25 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault25 == null) {
                char mode = (char) (View.MeasureSpec.getMode(0) + 29944);
                int i85 = (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 1755;
                int i86 = (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 23;
                short s7 = $$g[7];
                byte b21 = (byte) s7;
                Object[] objArr54 = new Object[1];
                m(s7, b21, (byte) (b21 | 52), objArr54);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault25 = initSession.b(mode, i85, i86, 1599039318, false, (String) objArr54[0], null);
            }
            Object[] objArr55 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault25).get(null);
            objArrTuitionPaymentFragmentbindingInflater1$5f1425da = new Object[]{new int[]{((int[]) objArr55[0])[0]}, new int[]{((int[]) objArr55[1])[0]}, (Object[]) objArr55[2], new int[1], (String[]) objArr55[4]};
            int iIdentityHashCode = System.identityHashCode(this);
            int i87 = ~iIdentityHashCode;
            int i88 = 513303210 + (((~((-755843183) | i87)) | (~(543240756 | iIdentityHashCode))) * 217) + (((~(iIdentityHashCode | (-755843183))) | 218906698) * 217) + (((~(543240756 | i87)) | 755843182) * 217) + 1711781887;
            int i89 = (i88 << 13) ^ i88;
            int i90 = i89 ^ (i89 >>> 17);
            ((int[]) objArrTuitionPaymentFragmentbindingInflater1$5f1425da[3])[0] = i90 ^ (i90 << 5);
        } else {
            int iIntValue2 = ((Integer) Class.forName(str9).getMethod(str10, Object.class).invoke(null, this)).intValue();
            Object[] objArr56 = {1624662004};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault26 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2063193834);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault26 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault26 = initSession.b((char) (42050 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1))), 1726 - View.MeasureSpec.getSize(0), 29 - (ViewConfiguration.getPressedStateDuration() >> 16), -1637387971, false, null, new Class[]{Integer.TYPE});
            }
            objArrTuitionPaymentFragmentbindingInflater1$5f1425da = com.google.firebase.abt.R.layout.TuitionPaymentFragmentbindingInflater1$5f1425da(iIntValue2, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault26).newInstance(objArr56), 1711781887);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault27 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault27 == null) {
                char cIndexOf3 = (char) (29944 - TextUtils.indexOf("", "", 0));
                int i91 = (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 1754;
                int deadChar = 23 - KeyEvent.getDeadChar(0, 0);
                short s8 = $$g[7];
                byte b22 = (byte) s8;
                Object[] objArr57 = new Object[1];
                m(s8, b22, (byte) (b22 | 52), objArr57);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault27 = initSession.b(cIndexOf3, i91, deadChar, 1599039318, false, (String) objArr57[0], null);
            }
            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault27).set(null, objArrTuitionPaymentFragmentbindingInflater1$5f1425da);
            try {
                long jLongValue8 = ((Long) Class.forName(str7).getDeclaredMethod(str, new Class[0]).invoke(null, new Object[0])).longValue();
                Long lValueOf7 = Long.valueOf(jLongValue8);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault28 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1145728641);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault28 == null) {
                    char c6 = (char) ((CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 29944);
                    int windowTouchSlop2 = 1755 - (ViewConfiguration.getWindowTouchSlop() >> 8);
                    int i92 = 23 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
                    byte b23 = $$g[7];
                    Object[] objArr58 = new Object[1];
                    m((short) 141, b23, (byte) (b23 | 52), objArr58);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault28 = initSession.b(c6, windowTouchSlop2, i92, 1596667560, false, (String) objArr58[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault28).set(null, lValueOf7);
                Long lValueOf8 = Long.valueOf(jLongValue8 >> 12);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault29 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault29 == null) {
                    char scrollBarFadeDuration = (char) (29944 - (ViewConfiguration.getScrollBarFadeDuration() >> 16));
                    int pressedStateDuration2 = (ViewConfiguration.getPressedStateDuration() >> 16) + 1755;
                    int minimumFlingVelocity = 23 - (ViewConfiguration.getMinimumFlingVelocity() >> 16);
                    byte b24 = $$g[7];
                    Object[] objArr59 = new Object[1];
                    m((short) 104, b24, (byte) (b24 | 37), objArr59);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault29 = initSession.b(scrollBarFadeDuration, pressedStateDuration2, minimumFlingVelocity, 986134021, false, (String) objArr59[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault29).set(null, lValueOf8);
            } catch (Exception unused4) {
                throw new RuntimeException();
            }
        }
        int i93 = ((int[]) objArrTuitionPaymentFragmentbindingInflater1$5f1425da[1])[0];
        int i94 = ((int[]) objArrTuitionPaymentFragmentbindingInflater1$5f1425da[0])[0];
        if (i94 == i93) {
            int i95 = ((int[]) objArrTuitionPaymentFragmentbindingInflater1$5f1425da[3])[0];
            Object[] objArr60 = {new int[]{((int[]) objArrTuitionPaymentFragmentbindingInflater1$5f1425da[0])[0]}, new int[]{((int[]) objArrTuitionPaymentFragmentbindingInflater1$5f1425da[1])[0]}, (Object[]) objArrTuitionPaymentFragmentbindingInflater1$5f1425da[2], new int[1], (String[]) objArrTuitionPaymentFragmentbindingInflater1$5f1425da[4]};
            int iIdentityHashCode2 = System.identityHashCode(this);
            int i96 = 1280385495 + ((189992245 | iIdentityHashCode2) * 614);
            int i97 = ~iIdentityHashCode2;
            int i98 = i95 + i96 + (((~((-166628760) | i97)) | 155323669 | (~(45973666 | i97))) * (-1228)) + (((~(i97 | 201297335)) | (~((-11305091) | i97))) * 614);
            int i99 = (i98 << 13) ^ i98;
            int i100 = i99 ^ (i99 >>> 17);
            ((int[]) objArr60[3])[0] = i100 ^ (i100 << 5);
            i2 = 0;
        } else {
            ArrayList arrayList4 = new ArrayList();
            String[] strArr11 = (String[]) objArrTuitionPaymentFragmentbindingInflater1$5f1425da[4];
            if (strArr11 != null) {
                for (String str15 : strArr11) {
                    arrayList4.add(str15);
                }
            }
            int[] iArr5 = new int[i94];
            int i101 = i94 - 1;
            iArr5[i101] = 1;
            Toast.makeText((Context) null, iArr5[((i94 * i101) % 2) - 1], 1).show();
            int i102 = ((int[]) objArrTuitionPaymentFragmentbindingInflater1$5f1425da[3])[0];
            Object[] objArr61 = {new int[]{((int[]) objArrTuitionPaymentFragmentbindingInflater1$5f1425da[0])[0]}, new int[]{((int[]) objArrTuitionPaymentFragmentbindingInflater1$5f1425da[1])[0]}, (Object[]) objArrTuitionPaymentFragmentbindingInflater1$5f1425da[2], new int[1], (String[]) objArrTuitionPaymentFragmentbindingInflater1$5f1425da[4]};
            int i103 = ((Context) Class.forName(r1).getMethod(str2, new Class[0]).invoke(null, null)).getResources().getConfiguration().orientation;
            int i104 = i102 + 614943193 + (((~(i103 | (-274920116))) | 487522541) * 191) + (((~((~i103) | (-274920116))) | 268566689) * 191);
            int i105 = (i104 << 13) ^ i104;
            int i106 = i105 ^ (i105 >>> 17);
            i2 = 0;
            ((int[]) objArr61[3])[0] = i106 ^ (i106 << 5);
        }
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault30 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2030658839);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault30 == null) {
            char cNormalizeMetaState = (char) KeyEvent.normalizeMetaState(i2);
            int iIndexOf4 = 875 - TextUtils.indexOf((CharSequence) "", '0');
            int i107 = 10 - (CdmaCellLocation.convertQuartSecToDecDegrees(i2) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(i2) == 0.0d ? 0 : -1));
            byte b25 = $$g[7];
            Object[] objArr62 = new Object[1];
            m((short) 104, b25, (byte) (b25 | 37), objArr62);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault30 = initSession.b(cNormalizeMetaState, iIndexOf4, i107, -1650998592, false, (String) objArr62[0], null);
        }
        long j5 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault30).getLong(null);
        long jLongValue9 = ((Long) Class.forName(str7).getDeclaredMethod(str, new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault31 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1821222244);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault31 == null) {
            char scrollBarFadeDuration2 = (char) (ViewConfiguration.getScrollBarFadeDuration() >> 16);
            int threadPriority4 = 876 - ((Process.getThreadPriority(0) + 20) >> 6);
            int tapTimeout = (ViewConfiguration.getTapTimeout() >> 16) + 10;
            short s9 = $$g[7];
            byte b26 = (byte) s9;
            Object[] objArr63 = new Object[1];
            m(s9, b26, (byte) (b26 | 52), objArr63);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault31 = initSession.b(scrollBarFadeDuration2, threadPriority4, tapTimeout, 2012020043, false, (String) objArr63[0], null);
        }
        if (j5 == ((jLongValue9 - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault31).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault32 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1822145765);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault32 == null) {
                char minimumFlingVelocity2 = (char) (ViewConfiguration.getMinimumFlingVelocity() >> 16);
                int i108 = 876 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                int touchSlop = 10 - (ViewConfiguration.getTouchSlop() >> 8);
                byte b27 = $$g[7];
                Object[] objArr64 = new Object[1];
                m((short) 52, b27, (byte) (b27 | 52), objArr64);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault32 = initSession.b(minimumFlingVelocity2, i108, touchSlop, 2012931276, false, (String) objArr64[0], null);
            }
            Object[] objArr65 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault32).get(null);
            objArr4 = new Object[]{new int[]{((int[]) objArr65[0])[0]}, new int[1], new int[]{((int[]) objArr65[2])[0]}, (String[]) objArr65[3]};
            int length2 = ((Context) Class.forName(r1).getMethod(str2, new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.vida_camera_screen_instructions_text_eye_occlude).substring(0, 28).length() - 1135062876;
            int i109 = ~length2;
            int i110 = ((2070192700 + (((~(49015233 | i109)) | (~((-89325463) | length2))) * (-370))) + ((((~(length2 | 49015233)) | (~(i109 | (-89325463)))) | 44630081) * (-370))) - 1054497611;
            int i111 = (i110 << 13) ^ i110;
            int i112 = i111 ^ (i111 >>> 17);
            ((int[]) objArr4[1])[0] = i112 ^ (i112 << 5);
            str3 = str12;
        } else {
            Context baseContext2 = getBaseContext();
            if (baseContext2 == null) {
                baseContext2 = (Context) Class.forName(str11).getMethod(str3, new Class[0]).invoke(null, null);
            }
            if (baseContext2 != null) {
                str3 = str12;
                int i113 = asBinder + 73;
                g = i113 % 128;
                if (i113 % 2 == 0) {
                    int i114 = 25 / 0;
                    if (baseContext2 instanceof ContextWrapper) {
                        str3 = str12;
                        str3 = str12;
                        if (((ContextWrapper) baseContext2).getBaseContext() != null) {
                            baseContext2 = null;
                        }
                    }
                } else if (baseContext2 instanceof ContextWrapper) {
                    str3 = str12;
                    str3 = str12;
                    if (((ContextWrapper) baseContext2).getBaseContext() != null) {
                        baseContext2 = null;
                    }
                }
                str3 = str12;
                str3 = str12;
                baseContext2 = baseContext2.getApplicationContext();
            }
            str3 = str12;
            str3 = str12;
            Object[] objArr66 = {baseContext2, Integer.valueOf(((Integer) Class.forName(str9).getMethod(str10, Object.class).invoke(null, this)).intValue()), 0, -387758397};
            short s10 = (short) ($$q | 68);
            byte[] bArr5 = $$p;
            Object[] objArr67 = new Object[1];
            n(s10, (byte) (-bArr5[10]), (byte) (-bArr5[23]), objArr67);
            Class<?> cls3 = Class.forName((String) objArr67[0]);
            byte b28 = bArr5[85];
            Object[] objArr68 = new Object[1];
            n((short) (-b28), bArr5[310], (byte) (-b28), objArr68);
            Object[] objArr69 = (Object[]) cls3.getMethod((String) objArr68[0], Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr66);
            if (baseContext2 != null) {
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault33 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1822145765);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault33 == null) {
                    char offsetBefore = (char) TextUtils.getOffsetBefore("", 0);
                    int gidForName2 = Process.getGidForName("") + 877;
                    int modifierMetaStateMask2 = 9 - ((byte) KeyEvent.getModifierMetaStateMask());
                    byte b29 = $$g[7];
                    Object[] objArr70 = new Object[1];
                    m((short) 52, b29, (byte) (b29 | 52), objArr70);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault33 = initSession.b(offsetBefore, gidForName2, modifierMetaStateMask2, 2012931276, false, (String) objArr70[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault33).set(null, objArr69);
                try {
                    long jLongValue10 = ((Long) Class.forName(str7).getDeclaredMethod(str, new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf9 = Long.valueOf(jLongValue10);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault34 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1821222244);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault34 == null) {
                        char mode2 = (char) View.MeasureSpec.getMode(0);
                        int packedPositionType = ExpandableListView.getPackedPositionType(0L) + 876;
                        int iIndexOf5 = 9 - TextUtils.indexOf((CharSequence) "", '0', 0, 0);
                        short s11 = $$g[7];
                        byte b30 = (byte) s11;
                        Object[] objArr71 = new Object[1];
                        m(s11, b30, (byte) (b30 | 52), objArr71);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault34 = initSession.b(mode2, packedPositionType, iIndexOf5, 2012020043, false, (String) objArr71[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault34).set(null, lValueOf9);
                    Long lValueOf10 = Long.valueOf(jLongValue10 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault35 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2030658839);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault35 == null) {
                        char c7 = (char) (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
                        int keyRepeatTimeout2 = (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 876;
                        int modifierMetaStateMask3 = ((byte) KeyEvent.getModifierMetaStateMask()) + 11;
                        byte b31 = $$g[7];
                        Object[] objArr72 = new Object[1];
                        m((short) 104, b31, (byte) (b31 | 37), objArr72);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault35 = initSession.b(c7, keyRepeatTimeout2, modifierMetaStateMask3, -1650998592, false, (String) objArr72[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault35).set(null, lValueOf10);
                } catch (Exception unused5) {
                    throw new RuntimeException();
                }
            } else {
                objArr69 = objArr69;
            }
            objArr4 = objArr69;
        }
        int i115 = ((int[]) objArr4[2])[0];
        int i116 = ((int[]) objArr4[0])[0];
        if (i116 != i115) {
            throw new RuntimeException(String.valueOf(i116));
        }
        int i117 = ((int[]) objArr4[1])[0];
        Object[] objArr73 = {new int[]{((int[]) objArr4[0])[0]}, new int[1], new int[]{((int[]) objArr4[2])[0]}, (String[]) objArr4[3]};
        int iMaxMemory2 = (int) Runtime.getRuntime().maxMemory();
        int i118 = ~iMaxMemory2;
        int i119 = 1237497844 + (((~((-691011988) | i118)) | 688914688) * (-1188));
        int i120 = (~(iMaxMemory2 | 691011987)) | 688914688;
        int i121 = ~(731322216 | i118);
        int i122 = i117 + i119 + ((i120 | i121) * 594) + (((~(691011987 | i118)) | (-733419516) | i121) * 594);
        int i123 = (i122 << 13) ^ i122;
        int i124 = i123 ^ (i123 >>> 17);
        ((int[]) objArr73[1])[0] = i124 ^ (i124 << 5);
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault36 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1545400921);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault36 == null) {
            char gidForName3 = (char) ((-1) - Process.getGidForName(""));
            int packedPositionGroup2 = ExpandableListView.getPackedPositionGroup(0L) + 876;
            int i125 = 10 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1));
            byte[] bArr6 = $$g;
            Object[] objArr74 = new Object[1];
            m((short) 193, (byte) (-bArr6[205]), (byte) (-bArr6[9]), objArr74);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault36 = initSession.b(gidForName3, packedPositionGroup2, i125, -1199417970, false, (String) objArr74[0], null);
        }
        long j6 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault36).getLong(null);
        long jLongValue11 = ((Long) Class.forName(str7).getDeclaredMethod(str, new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault37 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-340665130);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault37 == null) {
            char deadChar2 = (char) KeyEvent.getDeadChar(0, 0);
            int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0) + 876;
            int modifierMetaStateMask4 = ((byte) KeyEvent.getModifierMetaStateMask()) + 11;
            byte[] bArr7 = $$g;
            Object[] objArr75 = new Object[1];
            m((short) 203, (byte) (-bArr7[33]), bArr7[7], objArr75);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault37 = initSession.b(deadChar2, iMakeMeasureSpec2, modifierMetaStateMask4, 254769921, false, (String) objArr75[0], null);
        }
        if (j6 == ((jLongValue11 - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault37).getLong(null) << 52) >>> 52)) >> 12)) {
            int i126 = g + 111;
            asBinder = i126 % 128;
            int i127 = i126 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault38 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1435299656);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault38 == null) {
                char c8 = (char) (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
                int modifierMetaStateMask5 = ((byte) KeyEvent.getModifierMetaStateMask()) + 877;
                int fadingEdgeLength = 10 - (ViewConfiguration.getFadingEdgeLength() >> 16);
                byte[] bArr8 = $$g;
                Object[] objArr76 = new Object[1];
                m((short) 203, (byte) (-bArr8[205]), bArr8[0], objArr76);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault38 = initSession.b(c8, modifierMetaStateMask5, fadingEdgeLength, 1324201839, false, (String) objArr76[0], null);
            }
            Object[] objArr77 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault38).get(null);
            objArr5 = new Object[]{new int[]{((int[]) objArr77[0])[0]}, new int[1], new int[]{((int[]) objArr77[2])[0]}, (String[]) objArr77[3]};
            int i128 = ((Context) Class.forName(r1).getMethod(str2, new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 871976191;
            int i129 = ~i128;
            int i130 = ((((((~(909260102 | i129)) | (~((-949570332) | i128))) | (~(i129 | 949570331))) * 959) + 135955948) + (((~(i128 | 949570331)) | ((~(i129 | (-949570332))) | (~(909260102 | i128)))) * 959)) - 1458519421;
            int i131 = (i130 << 13) ^ i130;
            int i132 = i131 ^ (i131 >>> 17);
            ((int[]) objArr5[1])[0] = i132 ^ (i132 << 5);
        } else {
            Object[] objArr78 = {Integer.valueOf(((Integer) Class.forName(str9).getMethod(str10, Object.class).invoke(null, this)).intValue()), -1458519421};
            byte[] bArr9 = $$p;
            byte b32 = bArr9[93];
            int i133 = $$q;
            Object[] objArr79 = new Object[1];
            n((short) 158, b32, (byte) (i133 + 5), objArr79);
            Class<?> cls4 = Class.forName((String) objArr79[0]);
            Object[] objArr80 = new Object[1];
            n((short) (i133 | 68), bArr9[17], bArr9[296], objArr80);
            objArr5 = (Object[]) cls4.getMethod((String) objArr80[0], Integer.TYPE, Integer.TYPE).invoke(null, objArr78);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault39 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1435299656);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault39 == null) {
                char packedPositionChild = (char) ((-1) - ExpandableListView.getPackedPositionChild(0L));
                int scrollBarSize2 = (ViewConfiguration.getScrollBarSize() >> 8) + 876;
                int threadPriority5 = 10 - ((Process.getThreadPriority(0) + 20) >> 6);
                byte[] bArr10 = $$g;
                Object[] objArr81 = new Object[1];
                m((short) 203, (byte) (-bArr10[205]), bArr10[0], objArr81);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault39 = initSession.b(packedPositionChild, scrollBarSize2, threadPriority5, 1324201839, false, (String) objArr81[0], null);
            }
            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault39).set(null, objArr5);
            try {
                long jLongValue12 = ((Long) Class.forName(str7).getDeclaredMethod(str, new Class[0]).invoke(null, new Object[0])).longValue();
                Long lValueOf11 = Long.valueOf(jLongValue12);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault40 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-340665130);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault40 == null) {
                    char windowTouchSlop3 = (char) (ViewConfiguration.getWindowTouchSlop() >> 8);
                    int capsMode2 = 876 - TextUtils.getCapsMode("", 0, 0);
                    int i134 = 10 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1));
                    byte[] bArr11 = $$g;
                    Object[] objArr82 = new Object[1];
                    m((short) 203, (byte) (-bArr11[33]), bArr11[7], objArr82);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault40 = initSession.b(windowTouchSlop3, capsMode2, i134, 254769921, false, (String) objArr82[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault40).set(null, lValueOf11);
                Long lValueOf12 = Long.valueOf(jLongValue12 >> 12);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault41 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1545400921);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault41 == null) {
                    char cKeyCodeFromString2 = (char) KeyEvent.keyCodeFromString("");
                    int threadPriority6 = ((Process.getThreadPriority(0) + 20) >> 6) + 876;
                    int maximumFlingVelocity = 10 - (ViewConfiguration.getMaximumFlingVelocity() >> 16);
                    byte[] bArr12 = $$g;
                    Object[] objArr83 = new Object[1];
                    m((short) 193, (byte) (-bArr12[205]), (byte) (-bArr12[9]), objArr83);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault41 = initSession.b(cKeyCodeFromString2, threadPriority6, maximumFlingVelocity, -1199417970, false, (String) objArr83[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault41).set(null, lValueOf12);
            } catch (Exception unused6) {
                throw new RuntimeException();
            }
        }
        int i135 = ((int[]) objArr5[2])[0];
        int i136 = ((int[]) objArr5[0])[0];
        if (i136 != i135) {
            ArrayList arrayList5 = new ArrayList();
            String[] strArr12 = (String[]) objArr5[3];
            if (strArr12 != null) {
                for (String str16 : strArr12) {
                    arrayList5.add(str16);
                }
            }
            throw new RuntimeException(String.valueOf(i136));
        }
        int i137 = ((int[]) objArr5[1])[0];
        Object[] objArr84 = {new int[]{((int[]) objArr5[0])[0]}, new int[1], new int[]{((int[]) objArr5[2])[0]}, (String[]) objArr5[3]};
        int iIdentityHashCode3 = System.identityHashCode(this);
        int i138 = ~(23817362 | iIdentityHashCode3);
        int i139 = ~iIdentityHashCode3;
        int i140 = i137 + (-1305602728) + ((i138 | (~((-2714769) | i139))) * (-406)) + ((~(66842359 | i139)) * (-406)) + (((~(iIdentityHashCode3 | (-64127592))) | (~((-23817363) | i139))) * 406);
        int i141 = (i140 << 13) ^ i140;
        int i142 = i141 ^ (i141 >>> 17);
        ((int[]) objArr84[1])[0] = i142 ^ (i142 << 5);
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault42 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1551014231);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault42 == null) {
            objTuitionPaymentFragmentspecialinlinedviewModeldefault42 = initSession.b((char) (46400 - KeyEvent.keyCodeFromString("")), 39 - TextUtils.lastIndexOf("", '0'), 18 - TextUtils.lastIndexOf("", '0', 0, 0), -1192477056, false, "TuitionPaymentFragmentspecialinlinedviewModeldefault1", null);
        }
        Object obj = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault42).get(null);
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault43 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-159278412);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault43 == null) {
            objTuitionPaymentFragmentspecialinlinedviewModeldefault43 = initSession.b((char) ((ViewConfiguration.getTouchSlop() >> 8) + 46400), (ViewConfiguration.getFadingEdgeLength() >> 16) + 40, 19 - TextUtils.indexOf("", "", 0, 0), 304037219, false, "TuitionPaymentFragmentspecialinlinedviewModeldefault3", new Class[0]);
        }
        ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault43).invoke(obj, null);
        super.onCreate(p0);
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault44 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault44 == null) {
            char c9 = (char) ((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 31532);
            int iAxisFromString2 = 920 - MotionEvent.axisFromString("");
            int maximumFlingVelocity2 = (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 28;
            byte[] bArr13 = $$g;
            Object[] objArr85 = new Object[1];
            m((short) 141, (byte) (bArr13[1] - 1), bArr13[7], objArr85);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault44 = initSession.b(c9, iAxisFromString2, maximumFlingVelocity2, -1048449946, false, (String) objArr85[0], null);
        }
        long j7 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault44).getLong(null);
        long jLongValue13 = ((Long) Class.forName(str7).getDeclaredMethod(str, new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault45 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(889369593);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault45 == null) {
            char cCombineMeasuredStates3 = (char) (View.combineMeasuredStates(0, 0) + 31533);
            int iRgb = (-16776295) - Color.rgb(0, 0, 0);
            int i143 = 29 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1));
            short s12 = $$g[7];
            byte b33 = (byte) s12;
            Object[] objArr86 = new Object[1];
            m(s12, b33, (byte) (b33 | 52), objArr86);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault45 = initSession.b(cCombineMeasuredStates3, iRgb, i143, -778300370, false, (String) objArr86[0], null);
        }
        if (j7 == ((jLongValue13 - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault45).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault46 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault46 == null) {
                char c10 = (char) (31534 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)));
                int defaultSize = View.getDefaultSize(0, 0) + 921;
                int deadChar3 = 28 - KeyEvent.getDeadChar(0, 0);
                byte b34 = $$g[7];
                Object[] objArr87 = new Object[1];
                m((short) 104, b34, (byte) (b34 | 37), objArr87);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault46 = initSession.b(c10, defaultSize, deadChar3, -1142834547, false, (String) objArr87[0], null);
            }
            Object[] objArr88 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault46).get(null);
            objArr6 = new Object[]{new int[1], new int[]{((int[]) objArr88[1])[0]}, (Object[]) objArr88[2], new int[]{((int[]) objArr88[3])[0]}, (String[]) objArr88[4]};
            int i144 = ((Context) Class.forName(r1).getMethod(str2, new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 1282406832;
            int i145 = (((1821454701 + (((~((-780140612) | i144)) | (-1069436508)) * (-502))) + ((~((~i144) | (-75497476))) * (-502))) + (((~(i144 | (-993939033))) | (-780140612)) * TypedValues.PositionType.TYPE_DRAWPATH)) - 833876072;
            int i146 = (i145 << 13) ^ i145;
            int i147 = i146 ^ (i146 >>> 17);
            ((int[]) objArr6[0])[0] = i147 ^ (i147 << 5);
            str4 = str3;
        } else {
            Context baseContext3 = getBaseContext();
            if (baseContext3 == null) {
                baseContext3 = (Context) Class.forName(str11).getMethod(str4, new Class[0]).invoke(null, null);
            }
            if (baseContext3 != null) {
                str4 = str3;
                if ((baseContext3 instanceof ContextWrapper) && ((ContextWrapper) baseContext3).getBaseContext() == null) {
                    str4 = str3;
                    baseContext3 = null;
                } else {
                    str4 = str3;
                    str4 = str3;
                    baseContext3 = baseContext3.getApplicationContext();
                }
            }
            str4 = str3;
            str4 = str3;
            Object[] objArr89 = {baseContext3, Integer.valueOf(((Integer) Class.forName(str9).getMethod(str10, Object.class).invoke(null, this)).intValue()), 0, -833876072};
            byte[] bArr14 = $$p;
            Object[] objArr90 = new Object[1];
            n((short) ($$q | DerHeader.TAG_CLASS_PRIVATE), (byte) 26, bArr14[17], objArr90);
            Class<?> cls5 = Class.forName((String) objArr90[0]);
            byte b35 = bArr14[85];
            Object[] objArr91 = new Object[1];
            n((short) (-b35), bArr14[310], (byte) (-b35), objArr91);
            Object[] objArr92 = (Object[]) cls5.getMethod((String) objArr91[0], Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr89);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault47 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault47 == null) {
                char trimmedLength2 = (char) (TextUtils.getTrimmedLength("") + 31533);
                int size2 = 921 - View.MeasureSpec.getSize(0);
                int iLastIndexOf5 = TextUtils.lastIndexOf("", '0', 0, 0) + 29;
                byte b36 = $$g[7];
                Object[] objArr93 = new Object[1];
                m((short) 104, b36, (byte) (b36 | 37), objArr93);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault47 = initSession.b(trimmedLength2, size2, iLastIndexOf5, -1142834547, false, (String) objArr93[0], null);
            }
            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault47).set(null, objArr92);
            try {
                long jLongValue14 = ((Long) Class.forName(str7).getDeclaredMethod(str, new Class[0]).invoke(null, new Object[0])).longValue();
                Long lValueOf13 = Long.valueOf(jLongValue14);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault48 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(889369593);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault48 == null) {
                    char tapTimeout2 = (char) (31533 - (ViewConfiguration.getTapTimeout() >> 16));
                    int edgeSlop = 921 - (ViewConfiguration.getEdgeSlop() >> 16);
                    int i148 = (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 28;
                    short s13 = $$g[7];
                    byte b37 = (byte) s13;
                    Object[] objArr94 = new Object[1];
                    m(s13, b37, (byte) (b37 | 52), objArr94);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault48 = initSession.b(tapTimeout2, edgeSlop, i148, -778300370, false, (String) objArr94[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault48).set(null, lValueOf13);
                Long lValueOf14 = Long.valueOf(jLongValue14 >> 12);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault49 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault49 == null) {
                    char c11 = (char) ((PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 31533);
                    int size3 = View.MeasureSpec.getSize(0) + 921;
                    int scrollBarFadeDuration3 = 28 - (ViewConfiguration.getScrollBarFadeDuration() >> 16);
                    byte[] bArr15 = $$g;
                    Object[] objArr95 = new Object[1];
                    m((short) 141, (byte) (bArr15[1] - 1), bArr15[7], objArr95);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault49 = initSession.b(c11, size3, scrollBarFadeDuration3, -1048449946, false, (String) objArr95[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault49).set(null, lValueOf14);
                objArr6 = objArr92;
            } catch (Exception unused7) {
                throw new RuntimeException();
            }
        }
        int i149 = ((int[]) objArr6[1])[0];
        int i150 = ((int[]) objArr6[3])[0];
        if (i150 == i149) {
            int i151 = ((int[]) objArr6[0])[0];
            Object[] objArr96 = {new int[1], new int[]{((int[]) objArr6[1])[0]}, (Object[]) objArr6[2], new int[]{((int[]) objArr6[3])[0]}, (String[]) objArr6[4]};
            int i152 = ~(((Context) Class.forName(r1).getMethod(str2, new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.tnc_bni_point_6).substring(0, 1).length() - 731638266);
            int i153 = i151 + 1572363035 + (((~(i152 | 92976116)) | (-1706802168)) * (-160)) + (((~(i152 | (-1681103528))) | 92976116) * 160);
            int i154 = (i153 << 13) ^ i153;
            int i155 = i154 ^ (i154 >>> 17);
            ((int[]) objArr96[0])[0] = i155 ^ (i155 << 5);
        } else {
            ArrayList arrayList6 = new ArrayList();
            String[] strArr13 = (String[]) objArr6[4];
            if (strArr13 != null) {
                for (String str17 : strArr13) {
                    arrayList6.add(str17);
                }
            }
            Toast.makeText((Context) null, i150 / (((i150 - 1) * i150) % 2), 0).show();
            int i156 = ((int[]) objArr6[0])[0];
            Object[] objArr97 = {new int[1], new int[]{((int[]) objArr6[1])[0]}, (Object[]) objArr6[2], new int[]{((int[]) objArr6[3])[0]}, (String[]) objArr6[4]};
            int i157 = ((Context) Class.forName(r1).getMethod(str2, new Class[0]).invoke(null, null)).getResources().getConfiguration().densityDpi;
            int i158 = ~((-1157980067) | i157);
            int i159 = ~i157;
            int i160 = i156 + (-1560741215) + ((i158 | (~(1706950651 | i159))) * (-406)) + ((~((-1090851075) | i159)) * (-406)) + (((~(i157 | (-616099578))) | (~(1157980066 | i159))) * 406);
            int i161 = (i160 << 13) ^ i160;
            int i162 = i161 ^ (i161 >>> 17);
            ((int[]) objArr97[0])[0] = i162 ^ (i162 << 5);
        }
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault50 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(650054);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault50 == null) {
            char pressedStateDuration3 = (char) (ViewConfiguration.getPressedStateDuration() >> 16);
            int i163 = (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 651;
            int i164 = (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 44;
            byte b38 = $$g[7];
            Object[] objArr98 = new Object[1];
            m((short) 141, b38, (byte) (b38 | 52), objArr98);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault50 = initSession.b(pressedStateDuration3, i163, i164, -459846511, false, (String) objArr98[0], null);
        }
        long j8 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault50).getLong(null);
        long jLongValue15 = ((Long) Class.forName(str7).getDeclaredMethod(str, new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault51 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(795782016);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault51 == null) {
            char edgeSlop2 = (char) (ViewConfiguration.getEdgeSlop() >> 16);
            int gidForName4 = 650 - Process.getGidForName("");
            int iRed = Color.red(0) + 44;
            byte[] bArr16 = $$g;
            Object[] objArr99 = new Object[1];
            m((short) 141, (byte) (bArr16[1] - 1), bArr16[7], objArr99);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault51 = initSession.b(edgeSlop2, gidForName4, iRed, -873460649, false, (String) objArr99[0], null);
        }
        if (j8 == ((jLongValue15 - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault51).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault52 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1148961515);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault52 == null) {
                char cRed = (char) Color.red(0);
                int iLastIndexOf6 = 650 - TextUtils.lastIndexOf("", '0', 0);
                int defaultSize2 = View.getDefaultSize(0, 0) + 44;
                byte b39 = $$g[7];
                Object[] objArr100 = new Object[1];
                m((short) 104, b39, (byte) (b39 | 37), objArr100);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault52 = initSession.b(cRed, iLastIndexOf6, defaultSize2, -1595579076, false, (String) objArr100[0], null);
            }
            Object[] objArr101 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault52).get(null);
            objArr7 = new Object[]{new int[]{i}, new String[0], new int[]{i}, new int[1]};
            int i165 = ((int[]) objArr101[2])[0];
            int i166 = ((int[]) objArr101[0])[0];
            int i167 = ((Context) Class.forName(r1).getMethod(str2, new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 1968691145;
            int i168 = 2027202547 + (((~i167) | 4489258) * 1324) + (((~(i167 | (-429027025))) | (~(432457834 | i167))) * (-1324)) + 534198234;
            int i169 = (i168 << 13) ^ i168;
            int i170 = i169 ^ (i169 >>> 17);
            ((int[]) objArr7[3])[0] = i170 ^ (i170 << 5);
            i3 = 0;
        } else {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault53 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1686493381);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault53 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault53 = initSession.b((char) Drawable.resolveOpacity(0, 0), (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 1609, TextUtils.lastIndexOf("", '0') + 27, 2145681644, false, null, new Class[0]);
            }
            Object[] objArr102 = {null, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault53).newInstance(null), -88187028, 0};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault54 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1625117732);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault54 == null) {
                char c12 = (char) ((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) - 1);
                int i171 = 652 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1));
                int threadPriority7 = ((Process.getThreadPriority(0) + 20) >> 6) + 44;
                byte[] bArr17 = $$g;
                Object[] objArr103 = new Object[1];
                m((short) 141, (byte) (bArr17[1] - 1), bArr17[7], objArr103);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault54 = initSession.b(c12, i171, threadPriority7, 2075921419, false, (String) objArr103[0], new Class[]{(Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) Color.green(0), TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 696, 98 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1))), (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (View.MeasureSpec.getSize(0) + 63406), 793 - TextUtils.getCapsMode("", 0, 0), 82 - ImageFormat.getBitsPerPixel(0)), Integer.TYPE, Integer.TYPE});
            }
            objArr7 = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault54).invoke(null, objArr102);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault55 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1148961515);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault55 == null) {
                char c13 = (char) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 1);
                int packedPositionGroup3 = ExpandableListView.getPackedPositionGroup(0L) + 651;
                int scrollBarSize3 = 44 - (ViewConfiguration.getScrollBarSize() >> 8);
                byte b40 = $$g[7];
                Object[] objArr104 = new Object[1];
                m((short) 104, b40, (byte) (b40 | 37), objArr104);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault55 = initSession.b(c13, packedPositionGroup3, scrollBarSize3, -1595579076, false, (String) objArr104[0], null);
            }
            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault55).set(null, objArr7);
            try {
                long jLongValue16 = ((Long) Class.forName(str7).getDeclaredMethod(str, new Class[0]).invoke(null, new Object[0])).longValue();
                Long lValueOf15 = Long.valueOf(jLongValue16);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault56 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(795782016);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault56 == null) {
                    char cBlue = (char) Color.blue(0);
                    int iLastIndexOf7 = 650 - TextUtils.lastIndexOf("", '0');
                    int bitsPerPixel = ImageFormat.getBitsPerPixel(0) + 45;
                    byte[] bArr18 = $$g;
                    Object[] objArr105 = new Object[1];
                    m((short) 141, (byte) (bArr18[1] - 1), bArr18[7], objArr105);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault56 = initSession.b(cBlue, iLastIndexOf7, bitsPerPixel, -873460649, false, (String) objArr105[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault56).set(null, lValueOf15);
                Long lValueOf16 = Long.valueOf(jLongValue16 >> 12);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault57 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(650054);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault57 == null) {
                    char maxKeyCode3 = (char) (KeyEvent.getMaxKeyCode() >> 16);
                    int iNormalizeMetaState = KeyEvent.normalizeMetaState(0) + 651;
                    int iResolveOpacity2 = 44 - Drawable.resolveOpacity(0, 0);
                    byte b41 = $$g[7];
                    Object[] objArr106 = new Object[1];
                    m((short) 141, b41, (byte) (b41 | 52), objArr106);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault57 = initSession.b(maxKeyCode3, iNormalizeMetaState, iResolveOpacity2, -459846511, false, (String) objArr106[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault57).set(null, lValueOf16);
                i3 = 0;
            } catch (Exception unused8) {
                throw new RuntimeException();
            }
        }
        int i172 = ((int[]) objArr7[i3])[i3];
        int i173 = ((int[]) objArr7[2])[i3];
        if (i173 != i172) {
            ArrayList arrayList7 = new ArrayList();
            String[] strArr14 = (String[]) objArr7[1];
            if (strArr14 != null) {
                for (String str18 : strArr14) {
                    int i174 = asBinder + 89;
                    g = i174 % 128;
                    int i175 = i174 % 2;
                    arrayList7.add(str18);
                }
            }
            throw new RuntimeException(String.valueOf(i173));
        }
        Object[] objArr107 = new Object[4];
        int[] iArr6 = new int[1];
        objArr107[i3] = iArr6;
        int[] iArr7 = new int[1];
        objArr107[2] = iArr7;
        objArr107[3] = new int[1];
        int i176 = ((int[]) objArr7[3])[i3];
        int i177 = ((int[]) objArr7[2])[i3];
        int i178 = ((int[]) objArr7[i3])[i3];
        iArr7[i3] = i177;
        iArr6[i3] = i178;
        objArr107[1] = new String[i3];
        int i179 = ~((int) Runtime.getRuntime().totalMemory());
        int i180 = ~(778844785 | i179);
        int i181 = i176 + 1756941333 + ((i180 | (-775413976)) * 764) + (((~(i179 | (-775413976))) | 774119505) * (-1528)) + (((-6019751) | i180) * 764);
        int i182 = (i181 << 13) ^ i181;
        int i183 = i182 ^ (i182 >>> 17);
        ((int[]) objArr107[3])[0] = i183 ^ (i183 << 5);
        setContentView(TuitionPaymentFragmentspecialinlinedviewModeldefault3());
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault58 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(118372281);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault58 == null) {
            char cMyPid = (char) ((Process.myPid() >> 22) + 37567);
            int scrollBarFadeDuration4 = 625 - (ViewConfiguration.getScrollBarFadeDuration() >> 16);
            int maxKeyCode4 = 14 - (KeyEvent.getMaxKeyCode() >> 16);
            byte[] bArr19 = $$g;
            Object[] objArr108 = new Object[1];
            m((short) 141, (byte) (bArr19[1] - 1), bArr19[7], objArr108);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault58 = initSession.b(cMyPid, scrollBarFadeDuration4, maxKeyCode4, -477065106, false, (String) objArr108[0], null);
        }
        long j9 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault58).getLong(null);
        long jLongValue17 = ((Long) Class.forName(str7).getDeclaredMethod(str, new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault59 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(559617152);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault59 == null) {
            char offsetAfter = (char) (37567 - TextUtils.getOffsetAfter("", 0));
            int iAxisFromString3 = MotionEvent.axisFromString("") + 626;
            int trimmedLength3 = TextUtils.getTrimmedLength("") + 14;
            byte b42 = $$g[7];
            Object[] objArr109 = new Object[1];
            m((short) 52, b42, (byte) (b42 | 52), objArr109);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault59 = initSession.b(offsetAfter, iAxisFromString3, trimmedLength3, -976899241, false, (String) objArr109[0], null);
        }
        if (j9 == ((jLongValue17 - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault59).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault60 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(560540673);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault60 == null) {
                char cMyTid = (char) ((Process.myTid() >> 22) + 37567);
                int iResolveOpacity3 = 625 - Drawable.resolveOpacity(0, 0);
                int i184 = 13 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1));
                short s14 = $$g[7];
                byte b43 = (byte) s14;
                Object[] objArr110 = new Object[1];
                m(s14, b43, (byte) (b43 | 52), objArr110);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault60 = initSession.b(cMyTid, iResolveOpacity3, i184, -973632554, false, (String) objArr110[0], null);
            }
            Object[] objArr111 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault60).get(null);
            int i185 = ((int[]) objArr111[2])[0];
            int i186 = ((int[]) objArr111[0])[0];
            String[] strArr15 = (String[]) objArr111[3];
            int[] iArr8 = {i185};
            int iIdentityHashCode4 = System.identityHashCode(this);
            int i187 = ~iIdentityHashCode4;
            int i188 = (((473238928 + ((1735392500 | i187) * (-369))) + (((~((-627563541) | i187)) | 1196174580) * (-369))) + ((((~(iIdentityHashCode4 | 627563540)) | 1107828960) | (~(i187 | (-539217921)))) * 369)) - 1229672670;
            int i189 = (i188 << 13) ^ i188;
            int i190 = i189 ^ (i189 >>> 17);
            ((int[]) objArr8[1])[0] = i190 ^ (i190 << 5);
            objArr8 = new Object[]{new int[]{i186}, new int[1], iArr8, strArr15};
            c = 0;
            str5 = str10;
        } else {
            Context baseContext4 = getBaseContext();
            if (baseContext4 == null) {
                baseContext4 = (Context) Class.forName(str11).getMethod(str4, new Class[0]).invoke(null, null);
            }
            if (baseContext4 != null) {
                baseContext4 = ((baseContext4 instanceof ContextWrapper) && ((ContextWrapper) baseContext4).getBaseContext() == null) ? null : baseContext4.getApplicationContext();
            }
            str5 = str10;
            int iIntValue3 = ((Integer) Class.forName(str9).getMethod(str5, Object.class).invoke(null, this)).intValue();
            Object[] objArr112 = new Object[1];
            l((byte) (((Context) Class.forName(r1).getMethod(str2, new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() - 11), (short) (((Context) Class.forName(r1).getMethod(str2, new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 19), ((Context) Class.forName(r1).getMethod(str2, new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.j1772_ev_connector_type).substring(0, 5).codePointAt(1) + 1058025389, ((Context) Class.forName(r1).getMethod(str2, new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 45, ((Context) Class.forName(r1).getMethod(str2, new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 961065742, objArr112);
            String str19 = (String) objArr112[0];
            Object[] objArr113 = new Object[1];
            l((byte) TextUtils.indexOf("", "", 0), (short) (((Context) Class.forName(r1).getMethod(str2, new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(0) - 120), ((Context) Class.forName(r1).getMethod(str2, new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.bca_klik_pay_instruction_step5).substring(37, 38).codePointAt(0) + 1058025405, ((Context) Class.forName(r1).getMethod(str2, new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(4) - 107, Color.blue(0) - 961065657, objArr113);
            Object[] objArr114 = {baseContext4, new String[]{str19, (String) objArr113[0]}, Integer.valueOf(iIntValue3), 17, -1229672670};
            short s15 = (short) 253;
            byte[] bArr20 = $$p;
            Object[] objArr115 = new Object[1];
            n(s15, (byte) (s15 & 330), (byte) (-bArr20[23]), objArr115);
            Class<?> cls6 = Class.forName((String) objArr115[0]);
            Object[] objArr116 = new Object[1];
            n((short) ($$q | 68), bArr20[17], bArr20[296], objArr116);
            Object[] objArr117 = (Object[]) cls6.getMethod((String) objArr116[0], Context.class, String[].class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr114);
            int i191 = ((int[]) objArr117[0])[0];
            int i192 = ((int[]) objArr117[2])[0];
            if (baseContext4 != null) {
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault61 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(560540673);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault61 == null) {
                    char cRed2 = (char) (37567 - Color.red(0));
                    int edgeSlop3 = (ViewConfiguration.getEdgeSlop() >> 16) + 625;
                    int i193 = (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 14;
                    short s16 = $$g[7];
                    byte b44 = (byte) s16;
                    Object[] objArr118 = new Object[1];
                    m(s16, b44, (byte) (b44 | 52), objArr118);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault61 = initSession.b(cRed2, edgeSlop3, i193, -973632554, false, (String) objArr118[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault61).set(null, objArr117);
                try {
                    long jLongValue18 = ((Long) Class.forName(str7).getDeclaredMethod(str, new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf17 = Long.valueOf(jLongValue18);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault62 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(559617152);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault62 == null) {
                        char deadChar4 = (char) (37567 - KeyEvent.getDeadChar(0, 0));
                        int tapTimeout3 = 625 - (ViewConfiguration.getTapTimeout() >> 16);
                        int i194 = (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 14;
                        byte b45 = $$g[7];
                        Object[] objArr119 = new Object[1];
                        m((short) 52, b45, (byte) (b45 | 52), objArr119);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault62 = initSession.b(deadChar4, tapTimeout3, i194, -976899241, false, (String) objArr119[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault62).set(null, lValueOf17);
                    Long lValueOf18 = Long.valueOf(jLongValue18 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault63 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(118372281);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault63 == null) {
                        char touchSlop2 = (char) ((ViewConfiguration.getTouchSlop() >> 8) + 37567);
                        int iMyTid2 = (Process.myTid() >> 22) + 625;
                        int iCombineMeasuredStates2 = 14 - View.combineMeasuredStates(0, 0);
                        byte[] bArr21 = $$g;
                        Object[] objArr120 = new Object[1];
                        m((short) 141, (byte) (bArr21[1] - 1), bArr21[7], objArr120);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault63 = initSession.b(touchSlop2, iMyTid2, iCombineMeasuredStates2, -477065106, false, (String) objArr120[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault63).set(null, lValueOf18);
                } catch (Exception unused9) {
                    throw new RuntimeException();
                }
            } else {
                objArr117 = objArr117;
            }
            objArr8 = objArr117;
            c = 0;
        }
        if (((int[]) objArr8[2])[c] != ((int[]) objArr8[c])[c]) {
            ArrayList arrayList8 = new ArrayList();
            String[] strArr16 = (String[]) objArr8[3];
            if (strArr16 != null) {
                for (String str20 : strArr16) {
                    arrayList8.add(str20);
                }
            }
            throw null;
        }
        Object[] objArr121 = new Object[4];
        int[] iArr9 = new int[1];
        objArr121[c] = iArr9;
        objArr121[1] = new int[1];
        int[] iArr10 = new int[1];
        objArr121[2] = iArr10;
        int i195 = ((int[]) objArr8[1])[c];
        int i196 = ((int[]) objArr8[2])[c];
        int i197 = ((int[]) objArr8[c])[c];
        String[] strArr17 = (String[]) objArr8[3];
        iArr10[c] = i196;
        iArr9[c] = i197;
        int i198 = ~((int) Runtime.getRuntime().freeMemory());
        int i199 = i195 + 411484056 + (((-270635237) | i198) * 494) + (((~(i198 | 1317957147)) | (-1353446647)) * 494);
        int i200 = (i199 << 13) ^ i199;
        int i201 = i200 ^ (i200 >>> 17);
        ((int[]) objArr121[1])[0] = i201 ^ (i201 << 5);
        objArr121[3] = strArr17;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault64 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1309309962);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault64 == null) {
            char c14 = (char) ((TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 53893);
            int i202 = (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 1320;
            int iKeyCodeFromString = KeyEvent.keyCodeFromString("") + 36;
            byte[] bArr22 = $$g;
            Object[] objArr122 = new Object[1];
            m((short) 141, (byte) (bArr22[1] - 1), bArr22[7], objArr122);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault64 = initSession.b(c14, i202, iKeyCodeFromString, -1433084963, false, (String) objArr122[0], null);
        }
        long j10 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault64).getLong(null);
        long jLongValue19 = ((Long) Class.forName(str7).getDeclaredMethod(str, new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault65 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1351245985);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault65 == null) {
            char jumpTapTimeout = (char) ((ViewConfiguration.getJumpTapTimeout() >> 16) + 53893);
            int absoluteGravity = 1320 - Gravity.getAbsoluteGravity(0, 0);
            int iLastIndexOf8 = TextUtils.lastIndexOf("", '0', 0) + 37;
            byte b46 = $$g[7];
            Object[] objArr123 = new Object[1];
            m((short) 104, b46, (byte) (b46 | 37), objArr123);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault65 = initSession.b(jumpTapTimeout, absoluteGravity, iLastIndexOf8, -1273706634, false, (String) objArr123[0], null);
        }
        if (j10 == ((jLongValue19 - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault65).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault66 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1763547602);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault66 == null) {
                char cResolveSizeAndState = (char) (View.resolveSizeAndState(0, 0, 0) + 53893);
                int iIndexOf6 = TextUtils.indexOf((CharSequence) "", '0', 0) + 1321;
                int mirror = 'T' - AndroidCharacter.getMirror('0');
                short s17 = $$g[7];
                byte b47 = (byte) s17;
                Object[] objArr124 = new Object[1];
                m(s17, b47, (byte) (b47 | 52), objArr124);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault66 = initSession.b(cResolveSizeAndState, iIndexOf6, mirror, -1920778747, false, (String) objArr124[0], null);
            }
            Object[] objArr125 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault66).get(null);
            objArr9 = new Object[]{new int[]{i}, new int[1], strArr, new int[]{i}};
            int i203 = ((int[]) objArr125[0])[0];
            int i204 = ((int[]) objArr125[3])[0];
            String[] strArr18 = (String[]) objArr125[2];
            int i205 = ((Context) Class.forName(r1).getMethod(str2, new Class[0]).invoke(null, null)).getResources().getConfiguration().touchscreen;
            int i206 = (((-1385637520) + (((~(1064934888 | i205)) | 305692936) * (-756))) + (((~i205) | 1064934888) * 756)) - 1868271020;
            int i207 = (i206 << 13) ^ i206;
            int i208 = i207 ^ (i207 >>> 17);
            ((int[]) objArr9[1])[0] = i208 ^ (i208 << 5);
            str6 = str;
        } else {
            Context baseContext5 = getBaseContext();
            if (baseContext5 == null) {
                baseContext5 = (Context) Class.forName(str11).getMethod(str4, new Class[0]).invoke(null, null);
            }
            if (baseContext5 != null) {
                baseContext5 = ((baseContext5 instanceof ContextWrapper) && ((ContextWrapper) baseContext5).getBaseContext() == null) ? null : baseContext5.getApplicationContext();
            }
            int iIntValue4 = ((Integer) Class.forName(str9).getMethod(str5, Object.class).invoke(null, this)).intValue();
            Object[] objArr126 = {-1199845796};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault67 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(41341784);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault67 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault67 = initSession.b((char) (47977 - KeyEvent.keyCodeFromString("")), (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 1299, KeyEvent.getDeadChar(0, 0) + 20, -420973425, false, null, new Class[]{Integer.TYPE});
            }
            Object[] objArr127 = {baseContext5, "com.bpjstku", -1868271020, Integer.valueOf(iIntValue4), 643, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault67).newInstance(objArr126), false};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault68 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-733829592);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault68 == null) {
                char cAlpha = (char) (53893 - Color.alpha(0));
                int edgeSlop4 = (ViewConfiguration.getEdgeSlop() >> 16) + 1320;
                int maximumFlingVelocity3 = 36 - (ViewConfiguration.getMaximumFlingVelocity() >> 16);
                short s18 = $$g[7];
                byte b48 = (byte) s18;
                Object[] objArr128 = new Object[1];
                m(s18, b48, (byte) (b48 | 52), objArr128);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault68 = initSession.b(cAlpha, edgeSlop4, maximumFlingVelocity3, 819724799, false, (String) objArr128[0], new Class[]{Context.class, String.class, Integer.TYPE, Integer.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (57878 - (ViewConfiguration.getJumpTapTimeout() >> 16)), 1442 - AndroidCharacter.getMirror('0'), 75 - View.MeasureSpec.makeMeasureSpec(0, 0)), Boolean.TYPE});
            }
            Object[] objArr129 = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault68).invoke(null, objArr127);
            if (baseContext5 != null) {
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault69 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1763547602);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault69 == null) {
                    char offsetAfter2 = (char) (TextUtils.getOffsetAfter("", 0) + 53893);
                    int absoluteGravity2 = Gravity.getAbsoluteGravity(0, 0) + 1320;
                    int gidForName5 = Process.getGidForName("") + 37;
                    short s19 = $$g[7];
                    byte b49 = (byte) s19;
                    Object[] objArr130 = new Object[1];
                    m(s19, b49, (byte) (b49 | 52), objArr130);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault69 = initSession.b(offsetAfter2, absoluteGravity2, gidForName5, -1920778747, false, (String) objArr130[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault69).set(null, objArr129);
                try {
                    str6 = str;
                    long jLongValue20 = ((Long) Class.forName(str7).getDeclaredMethod(str6, new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf19 = Long.valueOf(jLongValue20);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault70 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1351245985);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault70 == null) {
                        char longPressTimeout2 = (char) ((ViewConfiguration.getLongPressTimeout() >> 16) + 53893);
                        int i209 = (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 1320;
                        int iIndexOf7 = TextUtils.indexOf("", "", 0) + 36;
                        byte b50 = $$g[7];
                        Object[] objArr131 = new Object[1];
                        m((short) 104, b50, (byte) (b50 | 37), objArr131);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault70 = initSession.b(longPressTimeout2, i209, iIndexOf7, -1273706634, false, (String) objArr131[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault70).set(null, lValueOf19);
                    Long lValueOf20 = Long.valueOf(jLongValue20 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault71 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1309309962);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault71 == null) {
                        char c15 = (char) ((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 53892);
                        int absoluteGravity3 = 1320 - Gravity.getAbsoluteGravity(0, 0);
                        int iIndexOf8 = 35 - TextUtils.indexOf((CharSequence) "", '0', 0);
                        byte[] bArr23 = $$g;
                        Object[] objArr132 = new Object[1];
                        m((short) 141, (byte) (bArr23[1] - 1), bArr23[7], objArr132);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault71 = initSession.b(c15, absoluteGravity3, iIndexOf8, -1433084963, false, (String) objArr132[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault71).set(null, lValueOf20);
                } catch (Exception unused10) {
                    throw new RuntimeException();
                }
            } else {
                objArr129 = objArr129;
                str6 = str;
            }
            objArr9 = objArr129;
        }
        if (((int[]) objArr9[0])[0] != ((int[]) objArr9[3])[0]) {
            throw null;
        }
        int i210 = g + 33;
        asBinder = i210 % 128;
        int i211 = i210 % 2;
        Object[] objArr133 = {new int[]{i}, new int[1], strArr, new int[]{i}};
        int i212 = ((int[]) objArr9[1])[0];
        int i213 = ((int[]) objArr9[0])[0];
        int i214 = ((int[]) objArr9[3])[0];
        String[] strArr19 = (String[]) objArr9[2];
        int startUptimeMillis = (int) Process.getStartUptimeMillis();
        int i215 = i212 + (-932499367) + (((~((~startUptimeMillis) | (-722369510))) | 648258315) * (-235)) + (((~((-722369510) | startUptimeMillis)) | 648258315) * (-470)) + (((~(startUptimeMillis | (-151804133))) | 77692938) * 235);
        int i216 = i215 ^ (i215 << 13);
        int i217 = i216 ^ (i216 >>> 17);
        ((int[]) objArr133[1])[0] = i217 ^ (i217 << 5);
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault72 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-342512172);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault72 == null) {
            char cLastIndexOf3 = (char) (TextUtils.lastIndexOf("", '0', 0) + 1);
            int i218 = 877 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1));
            int scrollDefaultDelay2 = 10 - (ViewConfiguration.getScrollDefaultDelay() >> 16);
            byte[] bArr24 = $$g;
            Object[] objArr134 = new Object[1];
            m((short) 141, (byte) (bArr24[1] - 1), bArr24[7], objArr134);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault72 = initSession.b(cLastIndexOf3, i218, scrollDefaultDelay2, 252381699, false, (String) objArr134[0], null);
        }
        long j11 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault72).getLong(null);
        long jLongValue21 = ((Long) Class.forName(str7).getDeclaredMethod(str6, new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault73 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1823069286);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault73 == null) {
            char packedPositionChild2 = (char) ((-1) - ExpandableListView.getPackedPositionChild(0L));
            int iRgb2 = Color.rgb(0, 0, 0) + 16778092;
            int i219 = (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 10;
            byte b51 = $$g[7];
            Object[] objArr135 = new Object[1];
            m((short) 141, b51, (byte) (b51 | 52), objArr135);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault73 = initSession.b(packedPositionChild2, iRgb2, i219, 2009631821, false, (String) objArr135[0], null);
        }
        if (j11 == ((jLongValue21 - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault73).getLong(null) << 52) >>> 52)) >> 12)) {
            int i220 = g + 43;
            asBinder = i220 % 128;
            int i221 = i220 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault74 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-337894567);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault74 == null) {
                char cAxisFromString2 = (char) ((-1) - MotionEvent.axisFromString(""));
                int trimmedLength4 = TextUtils.getTrimmedLength("") + 876;
                int fadingEdgeLength2 = 10 - (ViewConfiguration.getFadingEdgeLength() >> 16);
                byte[] bArr25 = $$g;
                Object[] objArr136 = new Object[1];
                m((short) 210, bArr25[10], bArr25[7], objArr136);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault74 = initSession.b(cAxisFromString2, trimmedLength4, fadingEdgeLength2, 256017550, false, (String) objArr136[0], null);
            }
            Object[] objArr137 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault74).get(null);
            objArr10 = new Object[]{new int[]{((int[]) objArr137[0])[0]}, new int[1], new int[]{((int[]) objArr137[2])[0]}, (String[]) objArr137[3]};
            int iIdentityHashCode5 = System.identityHashCode(this);
            int i222 = 143013812 + (((~(104959364 | iIdentityHashCode5)) | 145236569) * 104) + ((~((~iIdentityHashCode5) | (-104926341))) * (-104)) + ((iIdentityHashCode5 | 145269593) * 104) + 1175978729;
            int i223 = (i222 << 13) ^ i222;
            int i224 = i223 ^ (i223 >>> 17);
            ((int[]) objArr10[1])[0] = i224 ^ (i224 << 5);
        } else {
            Context baseContext6 = getBaseContext();
            Context applicationContext = baseContext6 == null ? (Context) Class.forName(str11).getMethod(str4, new Class[0]).invoke(null, null) : baseContext6;
            if (applicationContext != null) {
                applicationContext = ((applicationContext instanceof ContextWrapper) && ((ContextWrapper) applicationContext).getBaseContext() == null) ? null : applicationContext.getApplicationContext();
            }
            Object[] objArr138 = {applicationContext, Integer.valueOf(((Integer) Class.forName(str9).getMethod(str5, Object.class).invoke(null, this)).intValue()), 1175978729};
            byte[] bArr26 = $$p;
            Object[] objArr139 = new Object[1];
            n((short) 325, bArr26[2], (byte) (-bArr26[23]), objArr139);
            Class<?> cls7 = Class.forName((String) objArr139[0]);
            byte b52 = bArr26[85];
            Object[] objArr140 = new Object[1];
            n((short) (-b52), bArr26[310], (byte) (-b52), objArr140);
            objArr10 = (Object[]) cls7.getMethod((String) objArr140[0], Context.class, Integer.TYPE, Integer.TYPE).invoke(null, objArr138);
            if (applicationContext != null) {
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault75 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-337894567);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault75 == null) {
                    char mirror2 = (char) (AndroidCharacter.getMirror('0') - '0');
                    int trimmedLength5 = 876 - TextUtils.getTrimmedLength("");
                    int maximumDrawingCacheSize2 = (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 10;
                    byte[] bArr27 = $$g;
                    Object[] objArr141 = new Object[1];
                    m((short) 210, bArr27[10], bArr27[7], objArr141);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault75 = initSession.b(mirror2, trimmedLength5, maximumDrawingCacheSize2, 256017550, false, (String) objArr141[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault75).set(null, objArr10);
                try {
                    long jLongValue22 = ((Long) Class.forName(str7).getDeclaredMethod(str6, new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf21 = Long.valueOf(jLongValue22);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault76 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1823069286);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault76 == null) {
                        char c16 = (char) (1 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)));
                        int absoluteGravity4 = Gravity.getAbsoluteGravity(0, 0) + 876;
                        int defaultSize3 = View.getDefaultSize(0, 0) + 10;
                        byte b53 = $$g[7];
                        Object[] objArr142 = new Object[1];
                        m((short) 141, b53, (byte) (b53 | 52), objArr142);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault76 = initSession.b(c16, absoluteGravity4, defaultSize3, 2009631821, false, (String) objArr142[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault76).set(null, lValueOf21);
                    Long lValueOf22 = Long.valueOf(jLongValue22 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault77 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-342512172);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault77 == null) {
                        char scrollBarSize4 = (char) (ViewConfiguration.getScrollBarSize() >> 8);
                        int iResolveSize2 = View.resolveSize(0, 0) + 876;
                        int i225 = 11 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1));
                        byte[] bArr28 = $$g;
                        Object[] objArr143 = new Object[1];
                        m((short) 141, (byte) (bArr28[1] - 1), bArr28[7], objArr143);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault77 = initSession.b(scrollBarSize4, iResolveSize2, i225, 252381699, false, (String) objArr143[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault77).set(null, lValueOf22);
                } catch (Exception unused11) {
                    throw new RuntimeException();
                }
            }
        }
        int i226 = ((int[]) objArr10[2])[0];
        int i227 = ((int[]) objArr10[0])[0];
        if (i227 == i226) {
            int i228 = ((int[]) objArr10[1])[0];
            Object[] objArr144 = {new int[]{((int[]) objArr10[0])[0]}, new int[1], new int[]{((int[]) objArr10[2])[0]}, (String[]) objArr10[3]};
            int length3 = ((Context) Class.forName(r1).getMethod(str2, new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() - 780414372;
            int i229 = i228 + ((((~(665567653 | length3)) | (-230233824)) * 262) - 657782728) + (((~((~length3) | 665567653)) | (-230233824)) * 262);
            int i230 = (i229 << 13) ^ i229;
            int i231 = i230 ^ (i230 >>> 17);
            ((int[]) objArr144[1])[0] = i231 ^ (i231 << 5);
        } else {
            int[] iArr11 = new int[i227];
            int i232 = i227 - 1;
            iArr11[i232] = 1;
            Toast.makeText((Context) null, iArr11[((i227 * i232) % 2) - 1], 1).show();
            int i233 = ((int[]) objArr10[1])[0];
            Object[] objArr145 = {new int[]{((int[]) objArr10[0])[0]}, new int[1], new int[]{((int[]) objArr10[2])[0]}, (String[]) objArr10[3]};
            int i234 = ~(System.identityHashCode(this) | 301219685);
            int i235 = i233 + ((((-511252214) | i234) * (-658)) - 401049644) + ((i234 | (-536690678)) * 658);
            int i236 = (i235 << 13) ^ i235;
            int i237 = i236 ^ (i236 >>> 17);
            ((int[]) objArr145[1])[0] = i237 ^ (i237 << 5);
        }
        TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        b();
        asBinder();
        TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        asInterface();
        a();
    }

    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault3(Toolbar p0, String p1, boolean p2) {
        int i = 2 % 2;
        if (p0 != null) {
            int i2 = asBinder + 71;
            g = i2 % 128;
            int i3 = i2 % 2;
            setSupportActionBar(p0);
        }
        if (getSupportActionBar() != null) {
            int i4 = asBinder + 1;
            g = i4 % 128;
            int i5 = i4 % 2;
            ActionBar supportActionBar = getSupportActionBar();
            if (supportActionBar == null) {
                Intrinsics.throwNpe();
            }
            Intrinsics.checkExpressionValueIsNotNull(supportActionBar, "");
            supportActionBar.setTitle(p1);
            ActionBar supportActionBar2 = getSupportActionBar();
            if (supportActionBar2 == null) {
                Intrinsics.throwNpe();
            }
            supportActionBar2.setDisplayHomeAsUpEnabled(p2);
        }
    }

    public final void TuitionPaymentFragmentbindingInflater1(Toolbar p0, boolean p1) {
        int i = 2 % 2;
        if (p0 != null) {
            int i2 = g + 3;
            asBinder = i2 % 128;
            if (i2 % 2 != 0) {
                setSupportActionBar(p0);
                int i3 = 58 / 0;
            } else {
                setSupportActionBar(p0);
            }
        }
        if (getSupportActionBar() != null) {
            ActionBar supportActionBar = getSupportActionBar();
            if (supportActionBar == null) {
                Intrinsics.throwNpe();
                int i4 = g + 39;
                asBinder = i4 % 128;
                int i5 = i4 % 2;
            }
            supportActionBar.setDisplayHomeAsUpEnabled(p1);
            int i6 = asBinder + 51;
            g = i6 % 128;
            int i7 = i6 % 2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x003a  */
    /* JADX WARN: Code duplicated, block: B:14:0x004e  */
    /* JADX WARN: Code duplicated, block: B:17:0x0061  */
    /* JADX WARN: Code duplicated, block: B:9:0x0021  */
    public final void MediaBrowserCompat() {
        ProgressDialog progressDialog;
        ProgressDialog progressDialog2;
        ProgressDialog progressDialog3;
        int i = 2 % 2;
        int i2 = asBinder + 71;
        g = i2 % 128;
        if (i2 % 2 == 0) {
            IconCompatParcelizer();
            int i3 = 59 / 0;
            if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 == null) {
                ProgressDialog progressDialog4 = new ProgressDialog(this);
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = progressDialog4;
                progressDialog4.setMessage(getString(hasUseCaseBound.b.TuitionPaymentFragmentbindingInflater1));
                progressDialog = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                if (progressDialog == null) {
                    int i4 = g + 19;
                    asBinder = i4 % 128;
                    int i5 = i4 % 2;
                    Intrinsics.throwNpe();
                }
                progressDialog.setIndeterminate(true);
                progressDialog2 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                if (progressDialog2 == null) {
                    int i6 = g + 63;
                    asBinder = i6 % 128;
                    int i7 = i6 % 2;
                    Intrinsics.throwNpe();
                }
                progressDialog2.setCancelable(false);
                progressDialog3 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                if (progressDialog3 == null) {
                    Intrinsics.throwNpe();
                }
                progressDialog3.setCanceledOnTouchOutside(false);
            }
        } else {
            IconCompatParcelizer();
            if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 == null) {
                ProgressDialog progressDialog5 = new ProgressDialog(this);
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = progressDialog5;
                progressDialog5.setMessage(getString(hasUseCaseBound.b.TuitionPaymentFragmentbindingInflater1));
                progressDialog = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                if (progressDialog == null) {
                    int i8 = g + 19;
                    asBinder = i8 % 128;
                    int i9 = i8 % 2;
                    Intrinsics.throwNpe();
                }
                progressDialog.setIndeterminate(true);
                progressDialog2 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                if (progressDialog2 == null) {
                    int i10 = g + 63;
                    asBinder = i10 % 128;
                    int i11 = i10 % 2;
                    Intrinsics.throwNpe();
                }
                progressDialog2.setCancelable(false);
                progressDialog3 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                if (progressDialog3 == null) {
                    Intrinsics.throwNpe();
                }
                progressDialog3.setCanceledOnTouchOutside(false);
            }
        }
        ProgressDialog progressDialog6 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        if (progressDialog6 == null) {
            Intrinsics.throwNpe();
        }
        progressDialog6.show();
    }

    public final void IconCompatParcelizer() {
        int i = 2 % 2;
        ProgressDialog progressDialog = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        if (progressDialog != null) {
            if (progressDialog == null) {
                int i2 = g + 65;
                asBinder = i2 % 128;
                int i3 = i2 % 2;
                Intrinsics.throwNpe();
                int i4 = g + 101;
                asBinder = i4 % 128;
                int i5 = i4 % 2;
            }
            if (!progressDialog.isShowing()) {
                return;
            }
            ProgressDialog progressDialog2 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            if (progressDialog2 == null) {
                Intrinsics.throwNpe();
                int i6 = asBinder + 27;
                g = i6 % 128;
                int i7 = i6 % 2;
            }
            progressDialog2.cancel();
        }
    }

    public void d_() {
        int i = 2 % 2;
        int i2 = asBinder + 31;
        g = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        finish();
        if (i3 == 0) {
            obj.hashCode();
            throw null;
        }
        int i4 = g + 25;
        asBinder = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onResume() throws Throwable {
        int i = 2 % 2;
        int i2 = g + 95;
        asBinder = i2 % 128;
        if (i2 % 2 != 0) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1551014231);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (46400 - (ViewConfiguration.getScrollDefaultDelay() >> 16)), Color.argb(0, 0, 0, 0) + 40, 19 - View.MeasureSpec.makeMeasureSpec(0, 0), -1192477056, false, "TuitionPaymentFragmentspecialinlinedviewModeldefault1", null);
            }
            Object obj = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).get(null);
            try {
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-159278412);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (46400 - View.resolveSize(0, 0)), 40 - (ViewConfiguration.getScrollDefaultDelay() >> 16), 19 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), 304037219, false, "TuitionPaymentFragmentspecialinlinedviewModeldefault3", new Class[0]);
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(obj, null);
                super.onResume();
                throw null;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1551014231);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
            objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (46400 - ExpandableListView.getPackedPositionType(0L)), 40 - ExpandableListView.getPackedPositionGroup(0L), 19 - KeyEvent.normalizeMetaState(0), -1192477056, false, "TuitionPaymentFragmentspecialinlinedviewModeldefault1", null);
        }
        Object obj2 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
        try {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-159278412);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (View.resolveSize(0, 0) + 46400), 39 - Process.getGidForName(""), (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 18, 304037219, false, "TuitionPaymentFragmentspecialinlinedviewModeldefault3", new Class[0]);
            }
            ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(obj2, null);
            super.onResume();
        } catch (Throwable th2) {
            Throwable cause2 = th2.getCause();
            if (cause2 == null) {
                throw th2;
            }
            throw cause2;
        }
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onPause() throws Throwable {
        int i = 2 % 2;
        int i2 = g + 5;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1551014231);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (46399 - ImageFormat.getBitsPerPixel(0)), (Process.myTid() >> 22) + 40, 19 - (ViewConfiguration.getWindowTouchSlop() >> 8), -1192477056, false, "TuitionPaymentFragmentspecialinlinedviewModeldefault1", null);
        }
        Object obj = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).get(null);
        try {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-421253012);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (46400 - TextUtils.getCapsMode("", 0, 0)), TextUtils.indexOf("", "", 0, 0) + 40, (Process.myPid() >> 22) + 19, 41588667, false, "b", new Class[0]);
            }
            ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(obj, null);
            super.onPause();
            int i4 = g + 59;
            asBinder = i4 % 128;
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
    public void attachBaseContext(Context context) throws Throwable {
        Object[] objArrTuitionPaymentFragmentbindingInflater1$5f1425da;
        Object[] objArr;
        int i = 2 % 2;
        int i2 = asBinder + 95;
        g = i2 % 128;
        int i3 = i2 % 2;
        super.attachBaseContext(context);
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char cIndexOf = (char) (TextUtils.indexOf("", "") + 29944);
            int absoluteGravity = Gravity.getAbsoluteGravity(0, 0) + 1755;
            int maximumFlingVelocity = 23 - (ViewConfiguration.getMaximumFlingVelocity() >> 16);
            byte b = $$g[7];
            Object[] objArr2 = new Object[1];
            m((short) 104, b, (byte) (b | 37), objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cIndexOf, absoluteGravity, maximumFlingVelocity, 986134021, false, (String) objArr2[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr3 = new Object[1];
        l((byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.vida_review_screen_guideline_message_link).substring(0, 22).length() - 22), (short) ((Process.myPid() >> 22) + 109), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.uikit_confirm_shopeepay_deeplink).substring(1, 2).codePointAt(0) + 1058025228, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 45, (-961065660) - TextUtils.indexOf((CharSequence) "", '0'), objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        l((byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 36), (short) ((-16777169) - Color.rgb(0, 0, 0)), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 1058025336, (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) - 10, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 961065691, objArr4);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1145728641);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char size = (char) (29944 - View.MeasureSpec.getSize(0));
            int scrollBarSize = 1755 - (ViewConfiguration.getScrollBarSize() >> 8);
            int iIndexOf = TextUtils.indexOf("", "", 0) + 23;
            byte b2 = $$g[7];
            Object[] objArr5 = new Object[1];
            m((short) 141, b2, (byte) (b2 | 52), objArr5);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(size, scrollBarSize, iIndexOf, 1596667560, false, (String) objArr5[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char capsMode = (char) (TextUtils.getCapsMode("", 0, 0) + 29944);
                int i4 = 1756 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1));
                int iIndexOf2 = 23 - TextUtils.indexOf("", "");
                short s = $$g[7];
                byte b3 = (byte) s;
                Object[] objArr6 = new Object[1];
                m(s, b3, (byte) (b3 | 52), objArr6);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(capsMode, i4, iIndexOf2, 1599039318, false, (String) objArr6[0], null);
            }
            Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            objArrTuitionPaymentFragmentbindingInflater1$5f1425da = new Object[]{new int[]{((int[]) objArr7[0])[0]}, new int[]{((int[]) objArr7[1])[0]}, (Object[]) objArr7[2], new int[1], (String[]) objArr7[4]};
            int startUptimeMillis = (int) Process.getStartUptimeMillis();
            int i5 = ~((-347082843) | startUptimeMillis);
            int i6 = ~startUptimeMillis;
            int i7 = (-1670107062) + ((i5 | (~(1035418494 | i6))) * 497) + (((~(startUptimeMillis | 1035418494)) | (~((-900938079) | i6)) | 553855236) * 497) + 883086395;
            int i8 = (i7 << 13) ^ i7;
            int i9 = i8 ^ (i8 >>> 17);
            ((int[]) objArrTuitionPaymentFragmentbindingInflater1$5f1425da[3])[0] = i9 ^ (i9 << 5);
        } else {
            Object[] objArr8 = new Object[1];
            l((byte) (ViewConfiguration.getDoubleTapTimeout() >> 16), (short) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 29), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 1058025395, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.vida_review_screen_backend_error_message).substring(0, 25).codePointAt(16) - 110, (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) - 961065650, objArr8);
            Class<?> cls2 = Class.forName((String) objArr8[0]);
            Object[] objArr9 = new Object[1];
            l((byte) ((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) - 1), (short) ((-37) - KeyEvent.normalizeMetaState(0)), Color.alpha(0) + 1058025422, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.instruction_atm_bersama5).substring(12, 13).codePointAt(0) - 117, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 961065687, objArr9);
            int iIntValue = ((Integer) cls2.getMethod((String) objArr9[0], Object.class).invoke(null, this)).intValue();
            try {
                Object[] objArr10 = {-1290906673};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2063193834);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (42049 - TextUtils.getCapsMode("", 0, 0)), 1726 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), 30 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), -1637387971, false, null, new Class[]{Integer.TYPE});
                }
                objArrTuitionPaymentFragmentbindingInflater1$5f1425da = CaptureSession1.Companion.TuitionPaymentFragmentbindingInflater1$5f1425da(iIntValue, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).newInstance(objArr10), 883086395);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                    char cIndexOf2 = (char) (TextUtils.indexOf("", "", 0) + 29944);
                    int maxKeyCode = (KeyEvent.getMaxKeyCode() >> 16) + 1755;
                    int trimmedLength = 23 - TextUtils.getTrimmedLength("");
                    short s2 = $$g[7];
                    byte b4 = (byte) s2;
                    Object[] objArr11 = new Object[1];
                    m(s2, b4, (byte) (b4 | 52), objArr11);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(cIndexOf2, maxKeyCode, trimmedLength, 1599039318, false, (String) objArr11[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, objArrTuitionPaymentFragmentbindingInflater1$5f1425da);
                try {
                    Object[] objArr12 = new Object[1];
                    l((byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 36), (short) (109 - (ViewConfiguration.getPressedStateDuration() >> 16)), (ViewConfiguration.getTapTimeout() >> 16) + 1058025325, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 45, Color.rgb(0, 0, 0) - 944288443, objArr12);
                    Class<?> cls3 = Class.forName((String) objArr12[0]);
                    Object[] objArr13 = new Object[1];
                    l((byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 36), (short) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 11), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 1058025311, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 45, (-961065655) - (ViewConfiguration.getTapTimeout() >> 16), objArr13);
                    long jLongValue2 = ((Long) cls3.getDeclaredMethod((String) objArr13[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue2);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1145728641);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                        char c = (char) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 29945);
                        int i10 = (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 1754;
                        int capsMode2 = TextUtils.getCapsMode("", 0, 0) + 23;
                        byte b5 = $$g[7];
                        Object[] objArr14 = new Object[1];
                        m((short) 141, b5, (byte) (b5 | 52), objArr14);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(c, i10, capsMode2, 1596667560, false, (String) objArr14[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
                        char keyRepeatTimeout = (char) (29944 - (ViewConfiguration.getKeyRepeatTimeout() >> 16));
                        int iNormalizeMetaState = 1755 - KeyEvent.normalizeMetaState(0);
                        int scrollBarFadeDuration = 23 - (ViewConfiguration.getScrollBarFadeDuration() >> 16);
                        byte b6 = $$g[7];
                        Object[] objArr15 = new Object[1];
                        m((short) 104, b6, (byte) (b6 | 37), objArr15);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(keyRepeatTimeout, iNormalizeMetaState, scrollBarFadeDuration, 986134021, false, (String) objArr15[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).set(null, lValueOf2);
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
        int i11 = ((int[]) objArrTuitionPaymentFragmentbindingInflater1$5f1425da[1])[0];
        int i12 = ((int[]) objArrTuitionPaymentFragmentbindingInflater1$5f1425da[0])[0];
        if (i12 == i11) {
            int i13 = ((int[]) objArrTuitionPaymentFragmentbindingInflater1$5f1425da[3])[0];
            Object[] objArr16 = {new int[]{((int[]) objArrTuitionPaymentFragmentbindingInflater1$5f1425da[0])[0]}, new int[]{((int[]) objArrTuitionPaymentFragmentbindingInflater1$5f1425da[1])[0]}, (Object[]) objArrTuitionPaymentFragmentbindingInflater1$5f1425da[2], new int[1], (String[]) objArrTuitionPaymentFragmentbindingInflater1$5f1425da[4]};
            int length = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() - 1002145822;
            int i14 = i13 + (-1144866607) + (((~(852600372 | length)) | 220991562) * 336) + (((~(length | 1065202798)) | 8389136) * (-168)) + (((~((~length) | 1065202798)) | 852600372) * 168);
            int i15 = (i14 << 13) ^ i14;
            int i16 = i15 ^ (i15 >>> 17);
            ((int[]) objArr16[3])[0] = i16 ^ (i16 << 5);
        } else {
            ArrayList arrayList = new ArrayList();
            String[] strArr = (String[]) objArrTuitionPaymentFragmentbindingInflater1$5f1425da[4];
            if (strArr != null) {
                for (String str : strArr) {
                    arrayList.add(str);
                }
            }
            int[] iArr = new int[i12];
            int i17 = i12 - 1;
            iArr[i17] = 1;
            Toast.makeText((Context) null, iArr[((i12 * i17) % 2) - 1], 1).show();
            int i18 = ((int[]) objArrTuitionPaymentFragmentbindingInflater1$5f1425da[3])[0];
            Object[] objArr17 = {new int[]{((int[]) objArrTuitionPaymentFragmentbindingInflater1$5f1425da[0])[0]}, new int[]{((int[]) objArrTuitionPaymentFragmentbindingInflater1$5f1425da[1])[0]}, (Object[]) objArrTuitionPaymentFragmentbindingInflater1$5f1425da[2], new int[1], (String[]) objArrTuitionPaymentFragmentbindingInflater1$5f1425da[4]};
            int i19 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 1632652575;
            int i20 = ~i19;
            int i21 = i18 + 647473673 + (((~(i20 | 37346861)) | (~((-175255565) | i20)) | 138551296) * 464) + (((-36704269) | i19) * (-464)) + (((~(i19 | 37346861)) | 138551296) * 464);
            int i22 = (i21 << 13) ^ i21;
            int i23 = i22 ^ (i22 >>> 17);
            ((int[]) objArr17[3])[0] = i23 ^ (i23 << 5);
        }
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault10 == null) {
            char capsMode3 = (char) TextUtils.getCapsMode("", 0, 0);
            int iGreen = Color.green(0) + 1031;
            int deadChar = KeyEvent.getDeadChar(0, 0) + 15;
            byte b7 = $$g[7];
            Object[] objArr18 = new Object[1];
            m((short) 52, b7, (byte) (b7 | 52), objArr18);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.b(capsMode3, iGreen, deadChar, 1357589585, false, (String) objArr18[0], null);
        }
        long j2 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault10).getLong(null);
        Object[] objArr19 = new Object[1];
        l((byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(6) - 106), (short) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 73), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.payment_challenged).substring(23, 25).length() + 1058025323, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.btn_save_card).substring(1, 2).length() - 10, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 961065695, objArr19);
        Class<?> cls4 = Class.forName((String) objArr19[0]);
        Object[] objArr20 = new Object[1];
        l((byte) (ViewConfiguration.getKeyRepeatTimeout() >> 16), (short) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.uikit_uob_app_instruction_3).substring(2, 3).codePointAt(0) - 61), 1058025346 - MotionEvent.axisFromString(""), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.status_message_not_enabled).substring(17, 18).codePointAt(0) - 41, (-977842871) - Color.rgb(0, 0, 0), objArr20);
        long jLongValue3 = ((Long) cls4.getDeclaredMethod((String) objArr20[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault11 == null) {
            char doubleTapTimeout = (char) (ViewConfiguration.getDoubleTapTimeout() >> 16);
            int iKeyCodeFromString = 1031 - KeyEvent.keyCodeFromString("");
            int iMyPid = 15 - (Process.myPid() >> 22);
            short s3 = $$g[7];
            byte b8 = (byte) s3;
            Object[] objArr21 = new Object[1];
            m(s3, b8, (byte) (b8 | 52), objArr21);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.b(doubleTapTimeout, iKeyCodeFromString, iMyPid, 1344079056, false, (String) objArr21[0], null);
        }
        if (j2 == ((jLongValue3 - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault11).getLong(null) << 52) >>> 52)) >> 12)) {
            int i24 = g + 13;
            asBinder = i24 % 128;
            int i25 = i24 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault12 == null) {
                char packedPositionType = (char) ExpandableListView.getPackedPositionType(0L);
                int doubleTapTimeout2 = (ViewConfiguration.getDoubleTapTimeout() >> 16) + 1031;
                int maximumFlingVelocity2 = 15 - (ViewConfiguration.getMaximumFlingVelocity() >> 16);
                byte[] bArr = $$g;
                Object[] objArr22 = new Object[1];
                m((short) 141, (byte) (bArr[1] - 1), bArr[7], objArr22);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.b(packedPositionType, doubleTapTimeout2, maximumFlingVelocity2, 632103528, false, (String) objArr22[0], null);
            }
            Object[] objArr23 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault12).get(null);
            objArr = new Object[]{strArr, new int[]{i}, new int[1], new int[]{i}};
            int i26 = ((int[]) objArr23[3])[0];
            int i27 = ((int[]) objArr23[1])[0];
            String[] strArr2 = (String[]) objArr23[0];
            int iMyTid = Process.myTid();
            int i28 = ~iMyTid;
            int i29 = (((1875898325 + ((((~((-13166297) | i28)) | (-231113874)) | (~(13166296 | iMyTid))) * (-564))) + ((~(iMyTid | (-218497026))) * 1128)) + (((~((-231113874) | i28)) | (-231663322)) * 564)) - 808740272;
            int i30 = (i29 << 13) ^ i29;
            int i31 = i30 ^ (i30 >>> 17);
            ((int[]) objArr[2])[0] = i31 ^ (i31 << 5);
        } else {
            Object[] objArr24 = new Object[1];
            l((byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.notification_gojek_app).substring(4, 5).length() - 1), (short) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(3) + 19), Color.red(0) + 1058025406, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 45, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.copied_company_code).substring(1, 2).codePointAt(0) - 961065761, objArr24);
            Class<?> cls5 = Class.forName((String) objArr24[0]);
            Object[] objArr25 = new Object[1];
            l((byte) (ViewConfiguration.getScrollDefaultDelay() >> 16), (short) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() - 48), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(7) + 1058025307, (-8) - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 961065687, objArr25);
            int iIntValue2 = ((Integer) cls5.getMethod((String) objArr25[0], Object.class).invoke(null, this)).intValue();
            Object[] objArr26 = {-1290906673};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-725886332);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault13 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.b((char) (46038 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1))), 1134 - ExpandableListView.getPackedPositionType(0L), Color.blue(0) + 18, 807763283, false, null, new Class[]{Integer.TYPE});
            }
            Object[] objArr27 = {Integer.valueOf(iIntValue2), 0, -808740272, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault13).newInstance(objArr26), false};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1443305588);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault14 == null) {
                char cCombineMeasuredStates = (char) View.combineMeasuredStates(0, 0);
                int iIndexOf3 = 1030 - TextUtils.indexOf((CharSequence) "", '0', 0, 0);
                int maxKeyCode2 = (KeyEvent.getMaxKeyCode() >> 16) + 15;
                byte b9 = $$g[7];
                Object[] objArr28 = new Object[1];
                m((short) 52, b9, (byte) (b9 | 52), objArr28);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.b(cCombineMeasuredStates, iIndexOf3, maxKeyCode2, 1298546779, false, (String) objArr28[0], new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (KeyEvent.keyCodeFromString("") + 45993), KeyEvent.normalizeMetaState(0) + 1117, 17 - (KeyEvent.getMaxKeyCode() >> 16)), Boolean.TYPE});
            }
            objArr = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault14).invoke(null, objArr27);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault15 == null) {
                char defaultSize = (char) View.getDefaultSize(0, 0);
                int tapTimeout = (ViewConfiguration.getTapTimeout() >> 16) + 1031;
                int packedPositionGroup = 15 - ExpandableListView.getPackedPositionGroup(0L);
                byte[] bArr2 = $$g;
                Object[] objArr29 = new Object[1];
                m((short) 141, (byte) (bArr2[1] - 1), bArr2[7], objArr29);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.b(defaultSize, tapTimeout, packedPositionGroup, 632103528, false, (String) objArr29[0], null);
            }
            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault15).set(null, objArr);
            try {
                Object[] objArr30 = new Object[1];
                l((byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.uikit_error_shopeepay_transaction).substring(0, 6).codePointAt(3) - 110), (short) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 73), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(7) + 1058025210, (KeyEvent.getMaxKeyCode() >> 16) - 9, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.uikit_uob_web_instruction_4).substring(51, 53).length() - 961065661, objArr30);
                Class<?> cls6 = Class.forName((String) objArr30[0]);
                Object[] objArr31 = new Object[1];
                l((byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 36), (short) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 11), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.vida_tutorial_screen_primary_cta_text).substring(0, 6).length() + 1058025341, (-9) - TextUtils.getOffsetAfter("", 0), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.currency_invalid).substring(15, 16).codePointAt(0) - 961065687, objArr31);
                long jLongValue4 = ((Long) cls6.getDeclaredMethod((String) objArr31[0], new Class[0]).invoke(null, new Object[0])).longValue();
                Long lValueOf3 = Long.valueOf(jLongValue4);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault16 == null) {
                    char c2 = (char) ((-1) - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)));
                    int bitsPerPixel = 1030 - ImageFormat.getBitsPerPixel(0);
                    int mirror = AndroidCharacter.getMirror('0') - '!';
                    short s4 = $$g[7];
                    byte b10 = (byte) s4;
                    Object[] objArr32 = new Object[1];
                    m(s4, b10, (byte) (b10 | 52), objArr32);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.b(c2, bitsPerPixel, mirror, 1344079056, false, (String) objArr32[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault16).set(null, lValueOf3);
                Long lValueOf4 = Long.valueOf(jLongValue4 >> 12);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault17 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault17 == null) {
                    char offsetBefore = (char) TextUtils.getOffsetBefore("", 0);
                    int iIndexOf4 = TextUtils.indexOf("", "", 0, 0) + 1031;
                    int iMyPid2 = (Process.myPid() >> 22) + 15;
                    byte b11 = $$g[7];
                    Object[] objArr33 = new Object[1];
                    m((short) 52, b11, (byte) (b11 | 52), objArr33);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault17 = initSession.b(offsetBefore, iIndexOf4, iMyPid2, 1357589585, false, (String) objArr33[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault17).set(null, lValueOf4);
            } catch (Exception unused2) {
                throw new RuntimeException();
            }
        }
        int i32 = ((int[]) objArr[1])[0];
        int i33 = ((int[]) objArr[3])[0];
        if (i33 != i32) {
            ArrayList arrayList2 = new ArrayList();
            String[] strArr3 = (String[]) objArr[0];
            if (strArr3 != null) {
                for (String str2 : strArr3) {
                    arrayList2.add(str2);
                }
            }
            throw new RuntimeException(String.valueOf(i33));
        }
        Object[] objArr34 = {strArr, new int[]{i}, new int[1], new int[]{i}};
        int i34 = ((int[]) objArr[2])[0];
        int i35 = ((int[]) objArr[3])[0];
        int i36 = ((int[]) objArr[1])[0];
        String[] strArr4 = (String[]) objArr[0];
        int iIdentityHashCode = System.identityHashCode(this);
        int i37 = ~iIdentityHashCode;
        int i38 = i34 + (-1589575152) + (((~((-30746563) | i37)) | 213533607) * 226) + (((~(i37 | (-21308481))) | (~((-213533608) | iIdentityHashCode)) | 204095525) * (-113)) + ((~(iIdentityHashCode | (-30746563))) * 113);
        int i39 = (i38 << 13) ^ i38;
        int i40 = i39 ^ (i39 >>> 17);
        ((int[]) objArr34[2])[0] = i40 ^ (i40 << 5);
    }

    @Deprecated(message = "Soon will be removed")
    protected void TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        int i = 2 % 2;
        int i2 = asBinder + 81;
        g = i2 % 128;
        int i3 = i2 % 2;
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onStart() {
        int i = 2 % 2;
        int i2 = asBinder + 5;
        g = i2 % 128;
        int i3 = i2 % 2;
        super.onStart();
        if (i3 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0026  */
    /* JADX WARN: Code duplicated, block: B:8:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x002b). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0026
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$u(short r6, int r7, byte r8) {
        /*
            int r6 = r6 * 3
            int r6 = r6 + 4
            byte[] r0 = com.nbs.nucleosnucleo.presentation.BaseActivity.$$s
            int r8 = r8 * 2
            int r1 = r8 + 1
            int r7 = 121 - r7
            byte[] r1 = new byte[r1]
            r2 = 0
            if (r0 != 0) goto L15
            r7 = r6
            r3 = r8
            r4 = r2
            goto L2b
        L15:
            r3 = r2
        L16:
            r5 = r7
            r7 = r6
            r6 = r5
            byte r4 = (byte) r6
            r1[r3] = r4
            int r4 = r3 + 1
            if (r3 != r8) goto L26
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L26:
            r3 = r0[r7]
            r5 = r7
            r7 = r6
            r6 = r5
        L2b:
            int r6 = r6 + 1
            int r3 = -r3
            int r7 = r7 + r3
            r3 = r4
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nbs.nucleosnucleo.presentation.BaseActivity.$$u(short, int, byte):java.lang.String");
    }
}
