package com.bpjstku.databinding;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.Toast;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.SearchView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.bpjstku.R;
import com.kennyc.view.MultiStateView;
import defpackage.SessionConfigValidatingBuilder;
import defpackage.initSession;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes3.dex */
public final class FragmentBranchOfficeDirectoryBinding implements ViewBinding {
    public final AppCompatImageView imgBack;
    public final AppCompatImageView imgCollapseBottomSheetDirectory;
    public final MultiStateView msvRegionalBranchOffice;
    private final RelativeLayout rootView;
    public final RecyclerView rvBranchOfficeDirectory;
    public final SearchView svSearchItem;
    public final AppCompatTextView tvNameRegionalOffice;
    public final AppCompatTextView tvTitleBottomSheet;
    public final View viewLineBody;
    public final View viewLineHeader;
    private static final byte[] $$c = {104, 27, -72, 120};
    private static final int $$f = 120;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$d = {36, -74, -79, -21, -17, -3, 58, -68, -1, 0, -21, -3, 12, -18, -10, 64, -74, 10, -12, 56, -58, -17, -8, 8, -11, -3, -16, 65, -68, -7, 6, -6, -12, -12, 64, -32, -42, 5, -16, -9, 13, -24, 43, -48, -3, -8, 6, -20, 4, -15, 30, -24, -17, -9, 11, -19, -6, 75, -42, -42, 5, -16, -9, 13, -24, 43, -48, -3, -8, 6, -20, 4, -15, 43, -46, -11, 6, -16, -10, -38, 7, -16, 6, -11, -4, 25, -22, -29, 7, 3, -14, -11, 41, -49, 12, -11, -11, 3, -14, -11, 13, -12, -10, 5, -10, -10, 2, 25, -42, 3, -11, 6, -24, 10, -18, 60};
    private static final int $$e = 161;
    private static final byte[] $$a = {15, -9, 64, -81, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 56};
    private static final int $$b = 222;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 1;
    private static int[] TuitionPaymentFragmentspecialinlinedviewModeldefault2 = {-1744146116, 1480791990, 1967506061, -1536081471, 1161342611, -36340817, 734204965, 1731549560, 1878809534, -1064154989, 34117240, 1072588419, -1816119510, -172846165, -391043629, 374646415, 1532765662, 1039330289};

    /* JADX WARN: Code duplicated, block: B:10:0x0024  */
    /* JADX WARN: Code duplicated, block: B:8:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x0028). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0024
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void a(int r5, short r6, int r7, java.lang.Object[] r8) {
        /*
            int r5 = r5 * 52
            int r0 = 53 - r5
            byte[] r1 = com.bpjstku.databinding.FragmentBranchOfficeDirectoryBinding.$$a
            int r6 = 103 - r6
            int r7 = r7 * 52
            int r7 = 56 - r7
            byte[] r0 = new byte[r0]
            int r5 = 52 - r5
            r2 = 0
            if (r1 != 0) goto L16
            r4 = r5
            r3 = r2
            goto L28
        L16:
            r3 = r2
        L17:
            byte r4 = (byte) r6
            r0[r3] = r4
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
            int r7 = r7 + 1
            int r6 = r6 + r4
            int r6 = r6 + (-11)
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.databinding.FragmentBranchOfficeDirectoryBinding.a(int, short, int, java.lang.Object[]):void");
    }

    private static void c(int i, int i2, short s, Object[] objArr) {
        int i3 = i * 38;
        byte[] bArr = $$d;
        int i4 = i2 + 4;
        int i5 = (s * 15) + 84;
        byte[] bArr2 = new byte[i3 + 38];
        int i6 = i3 + 37;
        int i7 = -1;
        if (bArr == null) {
            i5 = (i4 + (-i6)) - 5;
            i4 = i4;
        }
        while (true) {
            i7++;
            int i8 = i4 + 1;
            bArr2[i7] = (byte) i5;
            if (i7 == i6) {
                objArr[0] = new String(bArr2, 0);
                return;
            } else {
                i5 = (i5 + (-bArr[i8])) - 5;
                i4 = i8;
            }
        }
    }

    @Override // androidx.viewbinding.ViewBinding
    public final /* bridge */ /* synthetic */ View getRoot() throws Throwable {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 55;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
        RelativeLayout root = getRoot();
        if (i3 == 0) {
            int i4 = 83 / 0;
        }
        return root;
    }

    private FragmentBranchOfficeDirectoryBinding(RelativeLayout relativeLayout, AppCompatImageView appCompatImageView, AppCompatImageView appCompatImageView2, MultiStateView multiStateView, RecyclerView recyclerView, SearchView searchView, AppCompatTextView appCompatTextView, AppCompatTextView appCompatTextView2, View view, View view2) {
        this.rootView = relativeLayout;
        this.imgBack = appCompatImageView;
        this.imgCollapseBottomSheetDirectory = appCompatImageView2;
        this.msvRegionalBranchOffice = multiStateView;
        this.rvBranchOfficeDirectory = recyclerView;
        this.svSearchItem = searchView;
        this.tvNameRegionalOffice = appCompatTextView;
        this.tvTitleBottomSheet = appCompatTextView2;
        this.viewLineBody = view;
        this.viewLineHeader = view2;
    }

    private static void b(int[] iArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2;
        int i3 = 2 % 2;
        SessionConfigValidatingBuilder sessionConfigValidatingBuilder = new SessionConfigValidatingBuilder();
        char[] cArr = new char[4];
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        long j = 0;
        int i4 = -1870535734;
        int i5 = 1;
        int i6 = 0;
        if (iArr2 != null) {
            int length = iArr2.length;
            int[] iArr3 = new int[length];
            int i7 = 0;
            while (i7 < length) {
                int i8 = $10 + 67;
                $11 = i8 % 128;
                int i9 = i8 % i2;
                try {
                    Object[] objArr2 = {Integer.valueOf(iArr2[i7])};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(i4);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        byte b = (byte) 0;
                        byte b2 = b;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) ((Process.getElapsedCpuTime() > j ? 1 : (Process.getElapsedCpuTime() == j ? 0 : -1)) - 1), Color.blue(0) + 3291, 31 - View.MeasureSpec.getMode(0), 1948206109, false, $$g(b, b2, b2), new Class[]{Integer.TYPE});
                    }
                    iArr3[i7] = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).intValue();
                    i7++;
                    i2 = 2;
                    j = 0;
                    i4 = -1870535734;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            iArr2 = iArr3;
        }
        int length2 = iArr2.length;
        int[] iArr4 = new int[length2];
        int[] iArr5 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        float f = 0.0f;
        if (iArr5 != null) {
            int length3 = iArr5.length;
            int[] iArr6 = new int[length3];
            int i10 = 0;
            while (i10 < length3) {
                Object[] objArr3 = new Object[i5];
                objArr3[i6] = Integer.valueOf(iArr5[i10]);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1870535734);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                    char c = (char) (PointF.length(f, f) > f ? 1 : (PointF.length(f, f) == f ? 0 : -1));
                    int iBlue = 3291 - Color.blue(i6);
                    int i11 = (AudioTrack.getMaxVolume() > f ? 1 : (AudioTrack.getMaxVolume() == f ? 0 : -1)) + 30;
                    byte b3 = (byte) i6;
                    byte b4 = b3;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(c, iBlue, i11, 1948206109, false, $$g(b3, b4, b4), new Class[]{Integer.TYPE});
                }
                iArr6[i10] = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).intValue();
                i10++;
                f = 0.0f;
                i5 = 1;
                i6 = 0;
            }
            iArr5 = iArr6;
        }
        int i12 = i6;
        System.arraycopy(iArr5, i12, iArr4, i12, length2);
        sessionConfigValidatingBuilder.b = 2;
        int i13 = $11 + 33;
        $10 = i13 % 128;
        int i14 = i13 % 2;
        while (sessionConfigValidatingBuilder.b < iArr.length) {
            cArr[0] = (char) (iArr[sessionConfigValidatingBuilder.b] >> 16);
            cArr[1] = (char) iArr[sessionConfigValidatingBuilder.b];
            cArr[2] = (char) (iArr[sessionConfigValidatingBuilder.b + 1] >> 16);
            cArr[3] = (char) iArr[sessionConfigValidatingBuilder.b + 1];
            sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 = (cArr[0] << 16) + cArr[1];
            sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = (cArr[2] << 16) + cArr[3];
            int i15 = 17;
            for (int i16 = 1; i15 > i16; i16 = 1) {
                int i17 = $11 + 29;
                $10 = i17 % 128;
                if (i17 % 2 != 0) {
                    sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 ^= iArr4[i15];
                    try {
                        Object[] objArr4 = {sessionConfigValidatingBuilder, Integer.valueOf(SessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1)), sessionConfigValidatingBuilder, sessionConfigValidatingBuilder};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-869811764);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                            byte b5 = (byte) 1;
                            byte b6 = (byte) (b5 - 1);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) View.combineMeasuredStates(0, 0), 2559 - TextUtils.getCapsMode("", 0, 0), (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 28, 683220507, false, $$g(b5, b6, b6), new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                        }
                        int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4)).intValue();
                        sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 = sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                        sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = iIntValue;
                        i15 += 66;
                    } catch (Throwable th2) {
                        Throwable cause2 = th2.getCause();
                        if (cause2 == null) {
                            throw th2;
                        }
                        throw cause2;
                    }
                } else {
                    sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 ^= iArr4[i15];
                    Object[] objArr5 = {sessionConfigValidatingBuilder, Integer.valueOf(SessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1)), sessionConfigValidatingBuilder, sessionConfigValidatingBuilder};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-869811764);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        byte b7 = (byte) 1;
                        byte b8 = (byte) (b7 - 1);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (ViewConfiguration.getMinimumFlingVelocity() >> 16), 2559 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), 29 - TextUtils.getOffsetAfter("", 0), 683220507, false, $$g(b7, b8, b8), new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                    }
                    int iIntValue2 = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).intValue();
                    sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 = sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                    sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = iIntValue2;
                    i15--;
                }
            }
            int i18 = sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1;
            sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 = sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i18;
            sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 ^= iArr4[1];
            sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 ^= iArr4[0];
            sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 ^= iArr[sessionConfigValidatingBuilder.b - 2];
            int i19 = sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            Object[] objArr6 = {sessionConfigValidatingBuilder};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(447797990);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b((char) (KeyEvent.normalizeMetaState(0) + 28879), 348 - ((Process.getThreadPriority(0) + 20) >> 6), 26 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), -30507727, false, "G", new Class[]{Object.class});
            }
            sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i19 ^ iArr[((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr6)).intValue()];
            cArr[0] = (char) (sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 >>> 16);
            cArr[1] = (char) sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1;
            cArr[2] = (char) (sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 >>> 16);
            cArr[3] = (char) sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            cArr2[(sessionConfigValidatingBuilder.b - 2) * 2] = cArr[0];
            cArr2[((sessionConfigValidatingBuilder.b - 2) * 2) + 1] = cArr[1];
            cArr2[((sessionConfigValidatingBuilder.b - 2) * 2) + 2] = cArr[2];
            cArr2[((sessionConfigValidatingBuilder.b - 2) * 2) + 3] = cArr[3];
            sessionConfigValidatingBuilder.b += 2;
        }
        objArr[0] = new String(cArr2, 0, i);
    }

    /* JADX WARN: Code duplicated, block: B:25:0x01e8  */
    /* JADX WARN: Code duplicated, block: B:27:0x01f2  */
    /* JADX WARN: Code duplicated, block: B:30:0x0200  */
    /* JADX WARN: Code duplicated, block: B:31:0x0202  */
    @Override // androidx.viewbinding.ViewBinding
    public final RelativeLayout getRoot() throws Throwable {
        Object[] objArr;
        int i;
        int i2 = 2 % 2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-342512172);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char longPressTimeout = (char) (ViewConfiguration.getLongPressTimeout() >> 16);
            int iArgb = Color.argb(0, 0, 0, 0) + 876;
            int bitsPerPixel = ImageFormat.getBitsPerPixel(0) + 11;
            byte b = $$a[5];
            byte b2 = b;
            Object[] objArr2 = new Object[1];
            a(b2, (byte) (b2 + 4), b, objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(longPressTimeout, iArgb, bitsPerPixel, 252381699, false, (String) objArr2[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr3 = new Object[1];
        b(new int[]{152328219, 1792798698, 632099201, 2013312250, -417884059, -2147451027, -845572835, -839179179, -2122881101, -1390935209, -1129389858, -669445695, -1881175362, 413111651}, 22 - View.MeasureSpec.getSize(0), objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        b(new int[]{687002395, -2118594433, 743299836, 1313996466, -852459673, 77825038, -570084803, -174150979, -1647826541, -558954835}, View.MeasureSpec.getMode(0) + 15, objArr4);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1823069286);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char cArgb = (char) Color.argb(0, 0, 0, 0);
            int iResolveSize = View.resolveSize(0, 0) + 876;
            int offsetBefore = TextUtils.getOffsetBefore("", 0) + 10;
            byte[] bArr = $$a;
            Object[] objArr5 = new Object[1];
            a(bArr[7], bArr[10], bArr[5], objArr5);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cArgb, iResolveSize, offsetBefore, 2009631821, false, (String) objArr5[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-337894567);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char c = (char) (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                int absoluteGravity = Gravity.getAbsoluteGravity(0, 0) + 876;
                int offsetAfter = 10 - TextUtils.getOffsetAfter("", 0);
                byte[] bArr2 = $$a;
                byte b3 = bArr2[5];
                byte b4 = bArr2[7];
                Object[] objArr6 = new Object[1];
                a(b3, b4, b4, objArr6);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(c, absoluteGravity, offsetAfter, 256017550, false, (String) objArr6[0], null);
            }
            Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            objArr = new Object[]{new int[]{((int[]) objArr7[0])[0]}, new int[1], new int[]{((int[]) objArr7[2])[0]}, (String[]) objArr7[3]};
            int iIdentityHashCode = System.identityHashCode(this);
            int i3 = ~iIdentityHashCode;
            int i4 = (((1207380940 + (((~((-965483965) | i3)) | 1005794193) * (-328))) + ((iIdentityHashCode | 1005794193) * 164)) + ((((~(iIdentityHashCode | 965483964)) | 41099777) | (~(i3 | (-789549)))) * 164)) - 2048895751;
            int i5 = (i4 << 13) ^ i4;
            int i6 = i5 ^ (i5 >>> 17);
            ((int[]) objArr[1])[0] = i6 ^ (i6 << 5);
        } else {
            Object[] objArr8 = new Object[1];
            b(new int[]{1858370438, -325030662, -1121083823, 636304136, 1871132548, -519139968, -840847628, -750346442, 1148669285, -795514823, 1610755948, 1354801229, 769006388, -1118847418, -1018868857, 1854680757}, 27 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), objArr8);
            Class<?> cls2 = Class.forName((String) objArr8[0]);
            Object[] objArr9 = new Object[1];
            b(new int[]{-333816959, 1774664751, -1032372498, 562532010, 891329384, 1466003758, -817642419, 984327677, 908781116, 589124332, -1428414082, 902830787}, 18 - View.MeasureSpec.getSize(0), objArr9);
            Context applicationContext = (Context) cls2.getMethod((String) objArr9[0], new Class[0]).invoke(null, null);
            if (applicationContext != null) {
                int i7 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 117;
                int i8 = i7 % 128;
                TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i8;
                if (i7 % 2 != 0) {
                    int i9 = 69 / 0;
                    if (applicationContext instanceof ContextWrapper) {
                        i = i8 + 59;
                        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i % 128;
                        if (i % 2 != 0) {
                            ((ContextWrapper) applicationContext).getBaseContext();
                            throw null;
                        }
                        if (((ContextWrapper) applicationContext).getBaseContext() != null) {
                            applicationContext = null;
                        }
                    }
                } else if (!(!(applicationContext instanceof ContextWrapper))) {
                    i = i8 + 59;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i % 128;
                    if (i % 2 != 0) {
                        ((ContextWrapper) applicationContext).getBaseContext();
                        throw null;
                    }
                    if (((ContextWrapper) applicationContext).getBaseContext() != null) {
                        applicationContext = null;
                    }
                }
                applicationContext = applicationContext.getApplicationContext();
            }
            Object[] objArr10 = new Object[1];
            b(new int[]{1732219938, 1332411487, 2045465055, 1750343030, 488970950, -371603750, 1435567077, 2115810110, -374041675, -866780047}, Drawable.resolveOpacity(0, 0) + 16, objArr10);
            Class<?> cls3 = Class.forName((String) objArr10[0]);
            Object[] objArr11 = new Object[1];
            b(new int[]{-1700620575, 2138071824, 90030637, 1625298329, -1177811053, 298951130, 577156183, 1316800311, 894141849, 1428146309}, 16 - TextUtils.getOffsetAfter("", 0), objArr11);
            int iIntValue = ((Integer) cls3.getMethod((String) objArr11[0], Object.class).invoke(null, this)).intValue();
            int i10 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 117;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i10 % 128;
            int i11 = i10 % 2;
            try {
                Object[] objArr12 = {applicationContext, Integer.valueOf(iIntValue), -2048895751};
                byte[] bArr3 = $$d;
                byte b5 = bArr3[8];
                byte b6 = (byte) (-b5);
                byte b7 = b5;
                Object[] objArr13 = new Object[1];
                c(b6, b7, (byte) (-b7), objArr13);
                Class<?> cls4 = Class.forName((String) objArr13[0]);
                byte b8 = bArr3[9];
                Object[] objArr14 = new Object[1];
                c(b8, (byte) (-bArr3[1]), b8, objArr14);
                Object[] objArr15 = (Object[]) cls4.getMethod((String) objArr14[0], Context.class, Integer.TYPE, Integer.TYPE).invoke(null, objArr12);
                if (applicationContext != null) {
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-337894567);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        char c2 = (char) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) - 1);
                        int gidForName = 875 - Process.getGidForName("");
                        int i12 = (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 9;
                        byte[] bArr4 = $$a;
                        byte b9 = bArr4[5];
                        byte b10 = bArr4[7];
                        Object[] objArr16 = new Object[1];
                        a(b9, b10, b10, objArr16);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(c2, gidForName, i12, 256017550, false, (String) objArr16[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr15);
                    try {
                        Object[] objArr17 = new Object[1];
                        b(new int[]{152328219, 1792798698, 632099201, 2013312250, -417884059, -2147451027, -845572835, -839179179, -2122881101, -1390935209, -1129389858, -669445695, -1881175362, 413111651}, 22 - Color.blue(0), objArr17);
                        Class<?> cls5 = Class.forName((String) objArr17[0]);
                        Object[] objArr18 = new Object[1];
                        b(new int[]{687002395, -2118594433, 743299836, 1313996466, -852459673, 77825038, -570084803, -174150979, -1647826541, -558954835}, 15 - (ViewConfiguration.getJumpTapTimeout() >> 16), objArr18);
                        long jLongValue2 = ((Long) cls5.getDeclaredMethod((String) objArr18[0], new Class[0]).invoke(null, new Object[0])).longValue();
                        Long lValueOf = Long.valueOf(jLongValue2);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1823069286);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                            char defaultSize = (char) View.getDefaultSize(0, 0);
                            int threadPriority = ((Process.getThreadPriority(0) + 20) >> 6) + 876;
                            int i13 = 10 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                            byte[] bArr5 = $$a;
                            Object[] objArr19 = new Object[1];
                            a(bArr5[7], bArr5[10], bArr5[5], objArr19);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(defaultSize, threadPriority, i13, 2009631821, false, (String) objArr19[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                        Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-342512172);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                            char deadChar = (char) KeyEvent.getDeadChar(0, 0);
                            int iIndexOf = 875 - TextUtils.indexOf((CharSequence) "", '0', 0, 0);
                            int iMyPid = 10 - (Process.myPid() >> 22);
                            byte b11 = $$a[5];
                            byte b12 = b11;
                            Object[] objArr20 = new Object[1];
                            a(b12, (byte) (b12 + 4), b11, objArr20);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(deadChar, iIndexOf, iMyPid, 252381699, false, (String) objArr20[0], null);
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
        if (i15 == i14) {
            int i16 = ((int[]) objArr[1])[0];
            Object[] objArr21 = {new int[]{((int[]) objArr[0])[0]}, new int[1], new int[]{((int[]) objArr[2])[0]}, (String[]) objArr[3]};
            int iIdentityHashCode2 = System.identityHashCode(this);
            int i17 = ~((-141107734) | iIdentityHashCode2);
            int i18 = ~iIdentityHashCode2;
            int i19 = i16 + (-1402937339) + ((i17 | (~(1056702423 | i18))) * 497) + (((~(iIdentityHashCode2 | 1056702423)) | (~((-955904920) | i18)) | 814797186) * 497);
            int i20 = (i19 << 13) ^ i19;
            int i21 = i20 ^ (i20 >>> 17);
            ((int[]) objArr21[1])[0] = i21 ^ (i21 << 5);
            int i22 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 59;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i22 % 128;
            int i23 = i22 % 2;
        } else {
            int[] iArr = new int[i15];
            int i24 = i15 - 1;
            iArr[i24] = 1;
            Toast.makeText((Context) null, iArr[((i15 * i24) % 2) - 1], 1).show();
            int i25 = ((int[]) objArr[1])[0];
            Object[] objArr22 = {new int[]{((int[]) objArr[0])[0]}, new int[1], new int[]{((int[]) objArr[2])[0]}, (String[]) objArr[3]};
            int iIdentityHashCode3 = System.identityHashCode(this);
            int i26 = ~iIdentityHashCode3;
            int i27 = i25 + 1235493236 + (((~(iIdentityHashCode3 | (-620245834))) | (~((-50808855) | i26)) | 10498625) * (-68)) + ((~((-609747209) | i26)) * (-68)) + (((~(620245833 | i26)) | (-660556063)) * 68);
            int i28 = (i27 << 13) ^ i27;
            int i29 = i28 ^ (i28 >>> 17);
            ((int[]) objArr22[1])[0] = i29 ^ (i29 << 5);
        }
        RelativeLayout relativeLayout = this.rootView;
        int i30 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 39;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i30 % 128;
        int i31 = i30 % 2;
        return relativeLayout;
    }

    public static FragmentBranchOfficeDirectoryBinding inflate(LayoutInflater layoutInflater) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 111;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
        FragmentBranchOfficeDirectoryBinding fragmentBranchOfficeDirectoryBindingInflate = inflate(layoutInflater, null, false);
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 107;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i4 % 128;
        int i5 = i4 % 2;
        return fragmentBranchOfficeDirectoryBindingInflate;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0022 A[PHI: r4
  0x0022: PHI (r4v2 android.view.View) = (r4v1 android.view.View), (r4v5 android.view.View) binds: [B:8:0x001f, B:5:0x0017] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:12:0x0030  */
    public static FragmentBranchOfficeDirectoryBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate;
        int i;
        int i2 = 2 % 2;
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 83;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3 % 128;
        if (i3 % 2 != 0) {
            viewInflate = layoutInflater.inflate(R.layout.fragment_branch_office_directory, viewGroup, true);
            if (!(!z)) {
                viewGroup.addView(viewInflate);
                i = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 65;
                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i % 128;
                if (i % 2 == 0) {
                    int i4 = 2 % 5;
                }
            }
        } else {
            viewInflate = layoutInflater.inflate(R.layout.fragment_branch_office_directory, viewGroup, false);
            if (z) {
                viewGroup.addView(viewInflate);
                i = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 65;
                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i % 128;
                if (i % 2 == 0) {
                    int i5 = 2 % 5;
                }
            }
        }
        return bind(viewInflate);
    }

    public static FragmentBranchOfficeDirectoryBinding bind(View view) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 93;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        int i4 = R.id.imgBack;
        if (i3 != 0) {
            obj.hashCode();
            throw null;
        }
        AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(view, R.id.imgBack);
        if (appCompatImageView != null) {
            i4 = R.id.imgCollapseBottomSheetDirectory;
            AppCompatImageView appCompatImageView2 = (AppCompatImageView) ViewBindings.findChildViewById(view, R.id.imgCollapseBottomSheetDirectory);
            if (appCompatImageView2 != null) {
                i4 = R.id.msvRegionalBranchOffice;
                MultiStateView multiStateView = (MultiStateView) ViewBindings.findChildViewById(view, R.id.msvRegionalBranchOffice);
                if (multiStateView != null) {
                    int i5 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 85;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i5 % 128;
                    int i6 = i5 % 2;
                    i4 = R.id.rvBranchOfficeDirectory;
                    RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, R.id.rvBranchOfficeDirectory);
                    if (recyclerView != null) {
                        i4 = R.id.svSearchItem;
                        SearchView searchView = (SearchView) ViewBindings.findChildViewById(view, R.id.svSearchItem);
                        if (searchView != null) {
                            i4 = R.id.tvNameRegionalOffice;
                            AppCompatTextView appCompatTextView = (AppCompatTextView) ViewBindings.findChildViewById(view, R.id.tvNameRegionalOffice);
                            if (appCompatTextView != null) {
                                int i7 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 87;
                                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i7 % 128;
                                int i8 = i7 % 2;
                                i4 = R.id.tvTitleBottomSheet;
                                if (i8 == 0) {
                                    throw null;
                                }
                                AppCompatTextView appCompatTextView2 = (AppCompatTextView) ViewBindings.findChildViewById(view, R.id.tvTitleBottomSheet);
                                if (appCompatTextView2 != null) {
                                    i4 = R.id.viewLineBody;
                                    View viewFindChildViewById = ViewBindings.findChildViewById(view, R.id.viewLineBody);
                                    if (viewFindChildViewById != null) {
                                        i4 = R.id.viewLineHeader;
                                        View viewFindChildViewById2 = ViewBindings.findChildViewById(view, R.id.viewLineHeader);
                                        if (viewFindChildViewById2 != null) {
                                            return new FragmentBranchOfficeDirectoryBinding((RelativeLayout) view, appCompatImageView, appCompatImageView2, multiStateView, recyclerView, searchView, appCompatTextView, appCompatTextView2, viewFindChildViewById, viewFindChildViewById2);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0027  */
    /* JADX WARN: Code duplicated, block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x0029). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0027
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$g(byte r5, int r6, byte r7) {
        /*
            byte[] r0 = com.bpjstku.databinding.FragmentBranchOfficeDirectoryBinding.$$c
            int r5 = r5 * 56
            int r5 = r5 + 66
            int r7 = r7 * 3
            int r7 = 4 - r7
            int r6 = r6 * 2
            int r1 = 1 - r6
            byte[] r1 = new byte[r1]
            r2 = 0
            int r6 = 0 - r6
            if (r0 != 0) goto L19
            r5 = r6
            r3 = r7
            r4 = r2
            goto L29
        L19:
            r3 = r2
        L1a:
            byte r4 = (byte) r5
            r1[r3] = r4
            int r4 = r3 + 1
            if (r3 != r6) goto L27
            java.lang.String r5 = new java.lang.String
            r5.<init>(r1, r2)
            return r5
        L27:
            r3 = r0[r7]
        L29:
            int r7 = r7 + 1
            int r5 = r5 + r3
            r3 = r4
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.databinding.FragmentBranchOfficeDirectoryBinding.$$g(byte, int, byte):java.lang.String");
    }
}
