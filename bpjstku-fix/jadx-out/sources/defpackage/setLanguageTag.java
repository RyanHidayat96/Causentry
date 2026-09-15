package defpackage;

import android.content.Context;
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
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.ExpandableListView;
import android.widget.LinearLayout;
import com.bpjstku.databinding.BottomSheetKtpGuidanceBinding;
import com.bpjstku.util.custom.WrapContentLinearLayoutManager;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.lang.reflect.Method;
import java.util.Random;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J+\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0017¢\u0006\u0004\b\u000b\u0010\fJ!\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\n2\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0003R\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u001e\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u00158\u0006@\u0006X\u0086\f¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017"}, d2 = {"LsetLanguageTag;", "Lcom/google/android/material/bottomsheet/BottomSheetDialogFragment;", "<init>", "()V", "Landroid/view/LayoutInflater;", "p0", "Landroid/view/ViewGroup;", "p1", "Landroid/os/Bundle;", "p2", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "onDestroyView", "Lcom/bpjstku/databinding/BottomSheetKtpGuidanceBinding;", "b", "Lcom/bpjstku/databinding/BottomSheetKtpGuidanceBinding;", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "Lkotlin/Function0;", "TuitionPaymentFragmentbindingInflater1", "Lkotlin/jvm/functions/Function0;", "TuitionPaymentFragmentspecialinlinedviewModeldefault3"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class setLanguageTag extends BottomSheetDialogFragment {

    /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
    public Function0<Unit> TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private BottomSheetKtpGuidanceBinding TuitionPaymentFragmentspecialinlinedviewModeldefault2;

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater p0, ViewGroup p1, Bundle p2) {
        Intrinsics.checkNotNullParameter(p0, "");
        BottomSheetKtpGuidanceBinding bottomSheetKtpGuidanceBindingInflate = BottomSheetKtpGuidanceBinding.inflate(p0, p1, false);
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = bottomSheetKtpGuidanceBindingInflate;
        Intrinsics.checkNotNull(bottomSheetKtpGuidanceBindingInflate);
        LinearLayout root = bottomSheetKtpGuidanceBindingInflate.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "");
        return root;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View p0, Bundle p1) {
        Intrinsics.checkNotNullParameter(p0, "");
        super.onViewCreated(p0, p1);
        BottomSheetKtpGuidanceBinding bottomSheetKtpGuidanceBinding = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        Intrinsics.checkNotNull(bottomSheetKtpGuidanceBinding);
        bottomSheetKtpGuidanceBinding.btnMulaiFoto.setOnClickListener(new View.OnClickListener() { // from class: CustomTabsIntentApi23Impl
            private static short[] asInterface;
            private static final byte[] $$a = {94, -1, 37, -59};
            private static final int $$b = 139;
            private static int $10 = 0;
            private static int $11 = 1;
            private static int g = 0;
            private static int d = 1;
            private static int[] TuitionPaymentFragmentspecialinlinedviewModeldefault3 = {-292065752, 2011980265, 1577375340, 890041403, 1337866629, 950558015, 939347793, 1873988877, 57489515, 1819001184, -206882174, -1907994376, 612187297, 1649704927, 808755077, 1300123308, 1581696055, 1281754297};
            private static int b = 1995896995;
            private static int TuitionPaymentFragmentspecialinlinedviewModeldefault2 = -1934795543;
            private static int TuitionPaymentFragmentbindingInflater1 = -2145101908;

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private static byte[] f121a = {-74, 28, -94, -93, 16, -96, 18, -49, -51, -83, -26, -8, -41, 27, -83, -26, 88, 119, -29, 17, 26, -79, -34, 80, -96, -74, 18, 24, -65, 27, 31, 96, 83, -78, 22, -80, 18, 13, 90, 56, 87, 14, 125, 36, -61, 87, 80, 56, 87, 14, 93, 68, 19, 2, 3, 12, 95, 7, 92, 7, -88, 0, -75, 7, 30, -38, -88, 0, -80, 58, 4, 19, -42, 57, -88, 10, 6, 55, 29, 8, 0, 16, 58, 4, 53, -10, 59, 8, -84, 125, -91, 126, -84, -41, 75, 125, -91, 117, -85, -95, -48, -127, 96, 124, -31, 57, -91, -88, 112, -91, 122, -81, -76, 105, 70, 121, 124, -83, 117, -84, 24, -87, -60, -123, -85, -29, -77, 25, -17, 16, -49, -96, -84, 47, 119, -29, 24, -80, -29, -86, 29, -12, -89, -74, -73, -84, 27, -77, 28, 53, 110, 100, 48, 14, 110, 58, 101, 109, -49, -53, -13, -35, -54, -45, -19, -3, -37, -10, -14, -53, -23, -15, -54, -7, -86, -47, 50, -54, -7, -54, -79, 49, -63, -61, -1, -23, -38, -10, -6, -127, 57, -29, -47, -1, -62, -65, -38, -19, -114, -83, -93, -9, -117, -93, -26, -26, -26, -26, -26, -26, -26, -26, -26};

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i = 2 % 2;
                int i2 = d + 95;
                g = i2 % 128;
                int i3 = i2 % 2;
                setLanguageTag.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, view);
                int i4 = g + 117;
                d = i4 % 128;
                int i5 = i4 % 2;
            }

            private static void c(int[] iArr, int i, Object[] objArr) throws Throwable {
                int i2 = 2 % 2;
                SessionConfigValidatingBuilder sessionConfigValidatingBuilder = new SessionConfigValidatingBuilder();
                char[] cArr = new char[4];
                char[] cArr2 = new char[iArr.length * 2];
                int[] iArr2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                int i3 = -1870535734;
                int i4 = 0;
                int i5 = 1;
                if (iArr2 != null) {
                    int i6 = $10 + 105;
                    $11 = i6 % 128;
                    int i7 = i6 % 2;
                    int length = iArr2.length;
                    int[] iArr3 = new int[length];
                    int i8 = 0;
                    while (i8 < length) {
                        try {
                            Object[] objArr2 = {Integer.valueOf(iArr2[i8])};
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(i3);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                                char maximumFlingVelocity = (char) (ViewConfiguration.getMaximumFlingVelocity() >> 16);
                                int keyRepeatDelay = 3291 - (ViewConfiguration.getKeyRepeatDelay() >> 16);
                                int packedPositionType = 31 - ExpandableListView.getPackedPositionType(0L);
                                byte b2 = (byte) ($$a[1] + 1);
                                byte b3 = b2;
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(maximumFlingVelocity, keyRepeatDelay, packedPositionType, 1948206109, false, $$c(b2, b3, b3), new Class[]{Integer.TYPE});
                            }
                            iArr3[i8] = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).intValue();
                            i8++;
                            i3 = -1870535734;
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
                int[] iArr5 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                if (iArr5 != null) {
                    int length3 = iArr5.length;
                    int[] iArr6 = new int[length3];
                    int i9 = 0;
                    while (i9 < length3) {
                        try {
                            Object[] objArr3 = new Object[i5];
                            objArr3[i4] = Integer.valueOf(iArr5[i9]);
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1870535734);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                char bitsPerPixel = (char) ((-1) - ImageFormat.getBitsPerPixel(i4));
                                int longPressTimeout = 3291 - (ViewConfiguration.getLongPressTimeout() >> 16);
                                int threadPriority = 31 - ((Process.getThreadPriority(i4) + 20) >> 6);
                                byte b4 = (byte) ($$a[i5] + 1);
                                byte b5 = b4;
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(bitsPerPixel, longPressTimeout, threadPriority, 1948206109, false, $$c(b4, b5, b5), new Class[]{Integer.TYPE});
                            }
                            iArr6[i9] = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).intValue();
                            i9++;
                            i4 = 0;
                            i5 = 1;
                        } catch (Throwable th2) {
                            Throwable cause2 = th2.getCause();
                            if (cause2 == null) {
                                throw th2;
                            }
                            throw cause2;
                        }
                    }
                    iArr5 = iArr6;
                }
                int i10 = i4;
                System.arraycopy(iArr5, i10, iArr4, i10, length2);
                sessionConfigValidatingBuilder.b = 2;
                while (sessionConfigValidatingBuilder.b < iArr.length) {
                    int i11 = $11 + 101;
                    $10 = i11 % 128;
                    int i12 = i11 % 2;
                    cArr[0] = (char) (iArr[sessionConfigValidatingBuilder.b] >> 16);
                    cArr[1] = (char) iArr[sessionConfigValidatingBuilder.b];
                    cArr[2] = (char) (iArr[sessionConfigValidatingBuilder.b + 1] >> 16);
                    cArr[3] = (char) iArr[sessionConfigValidatingBuilder.b + 1];
                    sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 = (cArr[0] << 16) + cArr[1];
                    sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = (cArr[2] << 16) + cArr[3];
                    int i13 = 17;
                    for (int i14 = 1; i13 > i14; i14 = 1) {
                        int i15 = $11 + 73;
                        $10 = i15 % 128;
                        int i16 = i15 % 2;
                        sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 ^= iArr4[i13];
                        Object[] objArr4 = {sessionConfigValidatingBuilder, Integer.valueOf(SessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1)), sessionConfigValidatingBuilder, sessionConfigValidatingBuilder};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-869811764);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                            char scrollDefaultDelay = (char) (ViewConfiguration.getScrollDefaultDelay() >> 16);
                            int jumpTapTimeout = 2559 - (ViewConfiguration.getJumpTapTimeout() >> 16);
                            int iResolveOpacity = Drawable.resolveOpacity(0, 0) + 29;
                            byte b6 = (byte) ($$a[1] + 1);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(scrollDefaultDelay, jumpTapTimeout, iResolveOpacity, 683220507, false, $$c((byte) 56, b6, b6), new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                        }
                        int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4)).intValue();
                        sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 = sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                        sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = iIntValue;
                        i13--;
                    }
                    int i17 = sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1;
                    sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 = sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                    sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i17;
                    sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 ^= iArr4[1];
                    sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 ^= iArr4[0];
                    sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 ^= iArr[sessionConfigValidatingBuilder.b - 2];
                    int i18 = sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                    Object[] objArr5 = {sessionConfigValidatingBuilder};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(447797990);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) ((ViewConfiguration.getTouchSlop() >> 8) + 28879), Color.alpha(0) + 348, 'I' - AndroidCharacter.getMirror('0'), -30507727, false, "G", new Class[]{Object.class});
                    }
                    sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i18 ^ iArr[((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).intValue()];
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

            private static void e(int i, int i2, short s, int i3, byte b2, Object[] objArr) throws Throwable {
                int i4;
                int i5;
                int i6 = 2 % 2;
                SessionConfigValidatingBuilderExternalSyntheticLambda0 sessionConfigValidatingBuilderExternalSyntheticLambda0 = new SessionConfigValidatingBuilderExternalSyntheticLambda0();
                StringBuilder sb = new StringBuilder();
                try {
                    Object[] objArr2 = {Integer.valueOf(i3), Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault2)};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1238528667);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        char c = (char) (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                        int iGreen = Color.green(0) + 2267;
                        int offsetBefore = TextUtils.getOffsetBefore("", 0) + 33;
                        byte b3 = (byte) ($$a[1] + 1);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(c, iGreen, offsetBefore, 1387473586, false, $$c((byte) 51, b3, b3), new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).intValue();
                    int i7 = iIntValue == -1 ? 1 : 0;
                    if (i7 != 0) {
                        byte[] bArr = f121a;
                        if (bArr != null) {
                            int length = bArr.length;
                            byte[] bArr2 = new byte[length];
                            int i8 = $11 + 105;
                            $10 = i8 % 128;
                            if (i8 % 2 != 0) {
                                int i9 = 3 / 5;
                            }
                            for (int i10 = 0; i10 < length; i10++) {
                                Object[] objArr3 = {Integer.valueOf(bArr[i10])};
                                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(632534666);
                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                    char cKeyCodeFromString = (char) KeyEvent.keyCodeFromString("");
                                    int iGreen2 = 3358 - Color.green(0);
                                    int iAxisFromString = MotionEvent.axisFromString("") + 19;
                                    byte b4 = (byte) ($$a[1] + 1);
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cKeyCodeFromString, iGreen2, iAxisFromString, -1054011043, false, $$c((byte) 55, b4, b4), new Class[]{Integer.TYPE});
                                }
                                bArr2[i10] = ((Byte) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).byteValue();
                            }
                            int i11 = $10 + 85;
                            $11 = i11 % 128;
                            i5 = 2;
                            int i12 = i11 % 2;
                            bArr = bArr2;
                        } else {
                            i5 = 2;
                        }
                        if (bArr != null) {
                            int i13 = $10 + 117;
                            $11 = i13 % 128;
                            int i14 = i13 % i5;
                            byte[] bArr3 = f121a;
                            Object[] objArr4 = new Object[i5];
                            objArr4[1] = Integer.valueOf(b);
                            objArr4[0] = Integer.valueOf(i);
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1238528667);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                                char cAlpha = (char) Color.alpha(0);
                                int keyRepeatDelay = 2267 - (ViewConfiguration.getKeyRepeatDelay() >> 16);
                                int iLastIndexOf = TextUtils.lastIndexOf("", '0', 0) + 34;
                                byte b5 = (byte) ($$a[1] + 1);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(cAlpha, keyRepeatDelay, iLastIndexOf, 1387473586, false, $$c((byte) 51, b5, b5), new Class[]{Integer.TYPE, Integer.TYPE});
                            }
                            iIntValue = (byte) (((byte) (((long) bArr3[((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4)).intValue()]) ^ 3046761265686732006L)) + ((int) (((long) TuitionPaymentFragmentspecialinlinedviewModeldefault2) ^ 3046761265686732006L)));
                            i4 = 2;
                        } else {
                            iIntValue = (short) (((short) (((long) asInterface[i + ((int) (((long) b) ^ 3046761265686732006L))]) ^ 3046761265686732006L)) + ((int) (((long) TuitionPaymentFragmentspecialinlinedviewModeldefault2) ^ 3046761265686732006L)));
                            int i15 = $11 + 65;
                            $10 = i15 % 128;
                            i4 = 2;
                            int i16 = i15 % 2;
                        }
                    } else {
                        i4 = 2;
                    }
                    if (iIntValue > 0) {
                        sessionConfigValidatingBuilderExternalSyntheticLambda0.b = ((i + iIntValue) - i4) + ((int) (((long) b) ^ 3046761265686732006L)) + i7;
                        Object[] objArr5 = {sessionConfigValidatingBuilderExternalSyntheticLambda0, Integer.valueOf(i2), Integer.valueOf(TuitionPaymentFragmentbindingInflater1), sb};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1079014435);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                            char c2 = (char) (55905 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)));
                            int offsetBefore2 = TextUtils.getOffsetBefore("", 0) + 2855;
                            int iCombineMeasuredStates = 13 - View.combineMeasuredStates(0, 0);
                            byte b6 = (byte) ($$a[1] + 1);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(c2, offsetBefore2, iCombineMeasuredStates, -1529949196, false, $$c((byte) 52, b6, b6), new Class[]{Object.class, Integer.TYPE, Integer.TYPE, Object.class});
                        }
                        ((StringBuilder) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).append(sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
                        sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                        byte[] bArr4 = f121a;
                        if (bArr4 != null) {
                            int length2 = bArr4.length;
                            byte[] bArr5 = new byte[length2];
                            for (int i17 = 0; i17 < length2; i17++) {
                                int i18 = $11 + 43;
                                $10 = i18 % 128;
                                int i19 = i18 % 2;
                                bArr5[i17] = (byte) (((long) bArr4[i17]) ^ 3046761265686732006L);
                            }
                            bArr4 = bArr5;
                        }
                        boolean z = bArr4 != null;
                        sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 1;
                        while (sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3 < iIntValue) {
                            if (z) {
                                byte[] bArr6 = f121a;
                                int i20 = sessionConfigValidatingBuilderExternalSyntheticLambda0.b;
                                sessionConfigValidatingBuilderExternalSyntheticLambda0.b = i20 - 1;
                                sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = (char) (sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2 + (((byte) (((byte) (((long) bArr6[i20]) ^ 3046761265686732006L)) + s)) ^ b2));
                                int i21 = $11 + 47;
                                $10 = i21 % 128;
                                int i22 = i21 % 2;
                            } else {
                                short[] sArr = asInterface;
                                int i23 = sessionConfigValidatingBuilderExternalSyntheticLambda0.b;
                                sessionConfigValidatingBuilderExternalSyntheticLambda0.b = i23 - 1;
                                sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = (char) (sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2 + (((short) (((short) (((long) sArr[i23]) ^ 3046761265686732006L)) + s)) ^ b2));
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

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r2v0 */
            /* JADX WARN: Type inference failed for: r2v1, types: [int] */
            /* JADX WARN: Type inference failed for: r2v105 */
            /* JADX WARN: Type inference failed for: r2v106 */
            /* JADX WARN: Type inference failed for: r2v14 */
            /* JADX WARN: Type inference failed for: r2v15 */
            /* JADX WARN: Type inference failed for: r2v50 */
            /* JADX WARN: Type inference failed for: r2v51 */
            /* JADX WARN: Type inference failed for: r2v53, types: [java.lang.Object[]] */
            /* JADX WARN: Type inference failed for: r2v58 */
            /* JADX WARN: Type inference failed for: r2v81 */
            /* JADX WARN: Type inference failed for: r3v63, types: [java.lang.reflect.Method] */
            /* JADX WARN: Type inference failed for: r5v11 */
            /* JADX WARN: Type inference failed for: r7v12 */
            public static Object[] TuitionPaymentFragmentspecialinlinedviewModeldefault1(Context context, int i, int i2) {
                int i3;
                int i4;
                Object obj;
                int iResolveSizeAndState;
                int scrollBarSize;
                int iTuitionPaymentFragmentbindingInflater1;
                int i5;
                int i6;
                int i7;
                int i8;
                Object[] objArr;
                Method method;
                short s;
                int i9;
                Class<?> cls;
                int[] iArr;
                int i10;
                int i11;
                int i12;
                int i13;
                int i14;
                short sAxisFromString;
                int i15;
                Class<?> cls2;
                int[] iArr2;
                int doubleTapTimeout;
                int i16;
                int[] iArr3;
                int threadPriority;
                int i17;
                int i18;
                int i19;
                int i20;
                ?? r2 = i2;
                String str = "";
                int i21 = 2 % 2;
                if (context != null) {
                    int i22 = ~(((-547360273) & i) | ((-547360273) ^ i));
                    int i23 = ~(((-1331302406) & i) | ((-1331302406) ^ i));
                    int i24 = -(-(((i22 & i23) | (i22 ^ i23)) * 69));
                    int i25 = (42288760 ^ i24) + ((i24 & 42288760) << 1);
                    int i26 = (~(1599778991 | i)) | (-2147139264);
                    int i27 = ~((815836858 & i) | (815836858 ^ i));
                    int i28 = (i25 - (~(-(-(((i26 & i27) | (i26 ^ i27)) * (-69)))))) - 1;
                    int i29 = ((i28 | 1345015250) << 1) - (1345015250 ^ i28);
                    int i30 = ~WrapContentLinearLayoutManager.TuitionPaymentFragmentbindingInflater1();
                    int i31 = -(-(((~(909666994 | i30)) | (-599772175)) * (-933)));
                    int i32 = (132633590 ^ i31) + ((i31 & 132633590) << 1);
                    int i33 = ~((i30 & (-599772175)) | ((-599772175) ^ i30));
                    int i34 = ((i33 & 574113794) | (i33 ^ 574113794)) * 933;
                    try {
                        if (i29 > ((i32 & i34) + (i32 | i34)) - 461477008) {
                            ViewConfiguration.getKeyRepeatTimeout();
                            Object[] objArr2 = new Object[1];
                            c(new int[]{-1032074984, -1419053838, -742980672, -342425696, -1278283685, -1392651882, -1505578753, 850303453, 1041317219, -145176365, -2111826895, -880501627, -1981646590, -647537208, 1113421105, 1518811163, 1694944422, -2067410047}, 0, objArr2);
                            obj = objArr2[0];
                        } else {
                            Object[] objArr3 = new Object[1];
                            c(new int[]{-1032074984, -1419053838, -742980672, -342425696, -1278283685, -1392651882, -1505578753, 850303453, 1041317219, -145176365, -2111826895, -880501627, -1981646590, -647537208, 1113421105, 1518811163, 1694944422, -2067410047}, 31 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), objArr3);
                            obj = objArr3[0];
                        }
                        try {
                            int i35 = (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1));
                            int i36 = (i35 & 94657466) + (i35 | 94657466);
                            int i37 = -(-ExpandableListView.getPackedPositionGroup(0L));
                            int i38 = (i37 & (-210307808)) + (i37 | (-210307808));
                            short s2 = (short) ((-36) - (~(-(ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)))));
                            int i39 = 22 - (~(-(-Color.blue(0))));
                            int keyRepeatTimeout = ViewConfiguration.getKeyRepeatTimeout() >> 16;
                            Object[] objArr4 = new Object[1];
                            e(i36, i38, s2, i39, (byte) ((keyRepeatTimeout & 39) + (keyRepeatTimeout | 39)), objArr4);
                            Object objNewInstance = Class.forName((String) objArr4[0]).getDeclaredConstructor(String.class).newInstance((String) obj);
                            Object[] objArr5 = new Object[1];
                            c(new int[]{1937229955, 1545824770, -1861130241, 117857147, -150266707, -928096047, 1559539515, -1900275406, 200528733, -1962135850, -1913329930, 155756072, -324560679, -584831544, 2037036445, 225826306, -9087609, 866253156}, Process.getGidForName("") + 32, objArr5);
                            String str2 = (String) objArr5[0];
                            int i40 = d;
                            int i41 = ((i40 | 75) << 1) - (i40 ^ 75);
                            g = i41 % 128;
                            int i42 = i41 % 2;
                            try {
                                int i43 = (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1));
                                int iTuitionPaymentFragmentbindingInflater2 = WrapContentLinearLayoutManager.TuitionPaymentFragmentbindingInflater1();
                                int i44 = i43 * 569;
                                int i45 = (i44 ^ (-1974476694)) + ((i44 & (-1974476694)) << 1);
                                int i46 = ~i43;
                                int i47 = ~((i46 ^ (-94657467)) | (i46 & (-94657467)));
                                int i48 = ~iTuitionPaymentFragmentbindingInflater2;
                                int i49 = ~((i46 ^ i48) | (i46 & i48));
                                int i50 = (i47 ^ i49) | (i49 & i47);
                                int i51 = ~iTuitionPaymentFragmentbindingInflater2;
                                int i52 = ~(((-94657467) ^ i51) | ((-94657467) & i51));
                                int i53 = -(-(((i50 ^ i52) | (i50 & i52)) * (-1136)));
                                int i54 = (i45 ^ i53) + ((i45 & i53) << 1);
                                int i55 = ~(i46 | iTuitionPaymentFragmentbindingInflater2);
                                int i56 = ~(((-94657467) ^ iTuitionPaymentFragmentbindingInflater2) | ((-94657467) & iTuitionPaymentFragmentbindingInflater2));
                                int i57 = ((i55 ^ i56) | (i56 & i55) | (~(i48 | i43 | 94657466))) * (-568);
                                int i58 = (i54 & i57) + (i57 | i54);
                                int i59 = ~((i51 ^ i43) | (i51 & i43));
                                int i60 = ~(94657466 | i51);
                                int i61 = (i59 & i60) | (i59 ^ i60);
                                int i62 = ~(iTuitionPaymentFragmentbindingInflater2 | (-94657467) | i46);
                                int i63 = ((i61 & i62) | (i61 ^ i62)) * 568;
                                int i64 = ((i58 | i63) << 1) - (i63 ^ i58);
                                int gidForName = Process.getGidForName("");
                                int iTuitionPaymentFragmentbindingInflater3 = WrapContentLinearLayoutManager.TuitionPaymentFragmentbindingInflater1();
                                int i65 = gidForName * (-112);
                                int i66 = (i65 & 2079637904) + (i65 | 2079637904);
                                int i67 = ~iTuitionPaymentFragmentbindingInflater3;
                                int i68 = ~((i67 & 210307806) | (210307806 ^ i67));
                                int i69 = ((i68 & gidForName) | (gidForName ^ i68)) * 226;
                                int i70 = (i66 ^ i69) + ((i69 & i66) << 1);
                                int i71 = ~gidForName;
                                int i72 = ~(((-210307807) & i71) | (i71 ^ (-210307807)));
                                int i73 = ~((i71 & iTuitionPaymentFragmentbindingInflater3) | (i71 ^ iTuitionPaymentFragmentbindingInflater3));
                                int i74 = (i73 & i72) | (i72 ^ i73);
                                int i75 = (~iTuitionPaymentFragmentbindingInflater3) | 210307806;
                                int i76 = ~((gidForName & i75) | (i75 ^ gidForName));
                                int i77 = -(-(((i76 & i74) | (i74 ^ i76)) * (-113)));
                                int i78 = (i70 & i77) + (i77 | i70);
                                int i79 = (~((210307806 ^ iTuitionPaymentFragmentbindingInflater3) | (iTuitionPaymentFragmentbindingInflater3 & 210307806))) * 113;
                                int i80 = ((i78 | i79) << 1) - (i79 ^ i78);
                                short s3 = (short) ((-37) - (~(-(ViewConfiguration.getTouchSlop() >> 8))));
                                int i81 = -(ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1));
                                int iTuitionPaymentFragmentbindingInflater4 = WrapContentLinearLayoutManager.TuitionPaymentFragmentbindingInflater1();
                                int i82 = i81 * (-112);
                                int i83 = ((i82 | (-2688)) << 1) - (i82 ^ (-2688));
                                int i84 = ~iTuitionPaymentFragmentbindingInflater4;
                                int i85 = (i83 - (~(-(-(((~(((-25) & i84) | ((-25) ^ i84))) | i81) * 226))))) - 1;
                                int i86 = ~i81;
                                int i87 = ~((i86 ^ 24) | (i86 & 24));
                                int i88 = ~((i86 ^ iTuitionPaymentFragmentbindingInflater4) | (i86 & iTuitionPaymentFragmentbindingInflater4));
                                int i89 = (i87 ^ i88) | (i88 & i87);
                                int i90 = ~(i81 | i84 | (-25));
                                int i91 = -(-(((i90 & i89) | (i89 ^ i90)) * (-113)));
                                int i92 = (i85 & i91) + (i91 | i85);
                                int i93 = -(-((~(((-25) & iTuitionPaymentFragmentbindingInflater4) | ((-25) ^ iTuitionPaymentFragmentbindingInflater4))) * 113));
                                Object[] objArr6 = new Object[1];
                                e(i64, i80, s3, (i92 ^ i93) + ((i93 & i92) << 1), (byte) (TextUtils.indexOf("", "", 0, 0) + 39), objArr6);
                                Object objNewInstance2 = Class.forName((String) objArr6[0]).getDeclaredConstructor(String.class).newInstance(str2);
                                int i94 = d + 73;
                                g = i94 % 128;
                                try {
                                    if (i94 % 2 != 0) {
                                        iResolveSizeAndState = View.resolveSizeAndState(1, 1, 1) + 94657504;
                                        scrollBarSize = ViewConfiguration.getScrollBarSize() / 79;
                                        iTuitionPaymentFragmentbindingInflater1 = WrapContentLinearLayoutManager.TuitionPaymentFragmentbindingInflater1();
                                        i5 = (70 >>> scrollBarSize) % 210307749;
                                    } else {
                                        int iResolveSizeAndState2 = View.resolveSizeAndState(0, 0, 0);
                                        iResolveSizeAndState = ((iResolveSizeAndState2 | 94657504) << 1) - (iResolveSizeAndState2 ^ 94657504);
                                        scrollBarSize = ViewConfiguration.getScrollBarSize() >> 8;
                                        iTuitionPaymentFragmentbindingInflater1 = WrapContentLinearLayoutManager.TuitionPaymentFragmentbindingInflater1();
                                        i5 = (scrollBarSize * 70) - (-1416029668);
                                    }
                                    int i95 = ~scrollBarSize;
                                    int i96 = iResolveSizeAndState;
                                    int i97 = d;
                                    int i98 = i97 + 29;
                                    g = i98 % 128;
                                    if (i98 % 2 != 0) {
                                        i6 = i5 >> (((~(((i95 & 210307816) | (i95 ^ 210307816)) | iTuitionPaymentFragmentbindingInflater1)) | (~(((scrollBarSize ^ (-210307817)) | (scrollBarSize & (-210307817))) | iTuitionPaymentFragmentbindingInflater1))) * 69);
                                        int i99 = ~scrollBarSize;
                                        int i100 = ~(i99 | (-210307817));
                                        int i101 = ~(i99 | iTuitionPaymentFragmentbindingInflater1);
                                        i7 = (i100 ^ i101) | (i101 & i100);
                                        i8 = ((-210307817) & iTuitionPaymentFragmentbindingInflater1) | ((-210307817) ^ iTuitionPaymentFragmentbindingInflater1);
                                    } else {
                                        int i102 = i95 | 210307816;
                                        int i103 = (scrollBarSize ^ (-210307817)) | (scrollBarSize & (-210307817));
                                        int i104 = ((~((i102 & iTuitionPaymentFragmentbindingInflater1) | (i102 ^ iTuitionPaymentFragmentbindingInflater1))) | (~((i103 ^ iTuitionPaymentFragmentbindingInflater1) | (i103 & iTuitionPaymentFragmentbindingInflater1)))) * 69;
                                        i6 = (i5 | i104) + (i5 & i104);
                                        int i105 = ~scrollBarSize;
                                        int i106 = ~((i105 & (-210307817)) | (i105 ^ (-210307817)));
                                        int i107 = ~((~scrollBarSize) | iTuitionPaymentFragmentbindingInflater1);
                                        i7 = (i106 ^ i107) | (i106 & i107);
                                        i8 = (-210307817) | iTuitionPaymentFragmentbindingInflater1;
                                    }
                                    int i108 = i97 + 33;
                                    g = i108 % 128;
                                    int i109 = i108 % 2;
                                    int i110 = i8 ^ (-1);
                                    int i111 = -(-((-69) * ((i7 ^ i110) | (i110 & i7))));
                                    int i112 = ((i6 | i111) << 1) - (i111 ^ i6);
                                    int i113 = (~((210307816 ^ scrollBarSize) | (scrollBarSize & 210307816))) * 69;
                                    int i114 = (i112 & i113) + (i113 | i112);
                                    int i115 = -(ViewConfiguration.getMaximumDrawingCacheSize() >> 24);
                                    int i116 = (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 7;
                                    int size = View.MeasureSpec.getSize(0);
                                    int i117 = size * (-716);
                                    int i118 = (i117 & (-41615)) + (i117 | (-41615));
                                    int i119 = ~size;
                                    int i120 = ~i;
                                    int i121 = ~(i120 | (-29));
                                    int i122 = ~((size ^ (-29)) | (size & (-29)));
                                    int i123 = (i121 ^ i122) | (i122 & i121);
                                    int i124 = ~((i119 ^ 28) | (i119 & 28) | i);
                                    int i125 = i118 + ((i119 | (-29)) * (-1434)) + (((i123 ^ i124) | (i123 & i124)) * 717);
                                    int i126 = (i119 ^ 28) | (i119 & 28);
                                    int i127 = ~((i126 & i120) | (i126 ^ i120));
                                    int i128 = ~(size | (-29));
                                    int i129 = (i127 & i128) | (i127 ^ i128);
                                    int i130 = ~(i | (-29));
                                    byte b2 = (byte) (i125 + (((i129 & i130) | (i129 ^ i130)) * 717));
                                    Object[] objArr7 = new Object[1];
                                    e(i96, i114, (short) ((i115 ^ 52) + ((i115 & 52) << 1)), i116, b2, objArr7);
                                    Class<?> cls3 = Class.forName((String) objArr7[0]);
                                    int i131 = -TextUtils.lastIndexOf("", '0', 0);
                                    int i132 = ((i131 | 94657525) << 1) - (i131 ^ 94657525);
                                    int i133 = (-210307812) - (~(-View.MeasureSpec.getSize(0)));
                                    int i134 = -TextUtils.lastIndexOf("", '0');
                                    int i135 = (-7653) - (~(i134 * 306));
                                    int i136 = ~((i134 ^ (-27)) | (i134 & (-27)));
                                    int i137 = ~((i134 ^ i) | (i134 & i));
                                    int i138 = ((i136 ^ i137) | (i136 & i137)) * 305;
                                    int i139 = ((i135 | i138) << 1) - (i135 ^ i138);
                                    int i140 = g;
                                    int i141 = (i140 & 13) + (i140 | 13);
                                    d = i141 % 128;
                                    if (i141 % 2 == 0) {
                                        int i142 = ~((i134 & i120) | (i120 ^ i134));
                                        Object[] objArr8 = new Object[1];
                                        e(i132, i133, (short) (i139 >> (305 % ((26 & i142) | (26 ^ i142)))), 0 % (AudioTrack.getMaxVolume() > 2.0f ? 1 : (AudioTrack.getMaxVolume() == 2.0f ? 0 : -1)), (byte) (122 << (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))), objArr8);
                                        objArr = null;
                                        method = cls3.getMethod((String) objArr8[0], null);
                                    } else {
                                        int i143 = ~(i134 | (~i));
                                        int i144 = (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1));
                                        int i145 = ((i144 | 1) << 1) - (i144 ^ 1);
                                        int i146 = -(-(SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)));
                                        Object[] objArr9 = new Object[1];
                                        e(i132, i133, (short) (i139 + (((26 & i143) | (26 ^ i143)) * 305)), i145, (byte) (((i146 | (-55)) << 1) - (i146 ^ (-55))), objArr9);
                                        objArr = null;
                                        method = cls3.getMethod((String) objArr9[0], null);
                                    }
                                    Object objInvoke = method.invoke(context, objArr);
                                    try {
                                        int i147 = -(ViewConfiguration.getMinimumFlingVelocity() >> 16);
                                        int i148 = i147 * 569;
                                        int i149 = (i148 ^ (-1974455072)) + ((i148 & (-1974455072)) << 1);
                                        int i150 = ~i147;
                                        int i151 = ~((-94657505) | i150);
                                        int i152 = ~i;
                                        int i153 = ~((i150 ^ i152) | (i150 & i152));
                                        int i154 = (i151 ^ i153) | (i153 & i151);
                                        int i155 = ~(((-94657505) ^ i120) | ((-94657505) & i120));
                                        int i156 = -(-(((i154 ^ i155) | (i154 & i155)) * (-1136)));
                                        int i157 = (i149 ^ i156) + ((i156 & i149) << 1);
                                        int i158 = ~((i150 ^ i) | (i150 & i));
                                        int i159 = ~(((-94657505) ^ i) | ((-94657505) & i));
                                        int i160 = (i147 & i120) | (i120 ^ i147);
                                        int i161 = i157 + (((i158 ^ i159) | (i158 & i159) | (~((i160 ^ 94657504) | (i160 & 94657504)))) * (-568));
                                        int i162 = (~i160) | (~((i152 ^ 94657504) | (i152 & 94657504)));
                                        int i163 = i150 | (-94657505);
                                        int i164 = ~((i163 & i) | (i163 ^ i));
                                        int i165 = ((i162 & i164) | (i162 ^ i164)) * 568;
                                        int i166 = ((i161 | i165) << 1) - (i165 ^ i161);
                                        int i167 = -TextUtils.getOffsetAfter("", 0);
                                        int i168 = (i167 ^ (-210307817)) + ((i167 & (-210307817)) << 1);
                                        int i169 = -(ViewConfiguration.getPressedStateDuration() >> 16);
                                        int i170 = i169 * 784;
                                        int i171 = ((i170 | (-40664)) << 1) - (i170 ^ (-40664));
                                        int i172 = ~i169;
                                        int i173 = (i172 & i152) | (i172 ^ i152);
                                        int i174 = (((i171 ^ 41499) + ((41499 & i171) << 1)) - (~(-(-((~((i173 & 52) | (i173 ^ 52))) * (-783)))))) - 1;
                                        int i175 = ~i169;
                                        int i176 = ~(i120 | 52);
                                        int i177 = -(-(((i175 & i176) | (i175 ^ i176)) * 783));
                                        int i178 = (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1));
                                        int i179 = ((i178 | 7) << 1) - (i178 ^ 7);
                                        int i180 = -(TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                                        Object[] objArr10 = new Object[1];
                                        e(i166, i168, (short) (((i174 | i177) << 1) - (i177 ^ i174)), i179, (byte) ((i180 ^ (-29)) + ((i180 & (-29)) << 1)), objArr10);
                                        Class<?> cls4 = Class.forName((String) objArr10[0]);
                                        int i181 = (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1));
                                        int i182 = ~(i152 | 94657542);
                                        int i183 = ((i181 * 165) - (-1750689838)) + (((i182 & i181) | (i181 ^ i182)) * (-328));
                                        int i184 = (i181 | i) * 164;
                                        int i185 = (i183 ^ i184) + ((i183 & i184) << 1);
                                        int i186 = ~i181;
                                        int i187 = (~((i186 & (-94657543)) | (i186 ^ (-94657543)))) | (~(((-94657543) & i) | ((-94657543) ^ i)));
                                        int i188 = (i181 & i152) | (i152 ^ i181);
                                        int i189 = ~((i188 & 94657542) | (i188 ^ 94657542));
                                        int i190 = (i185 - (~(-(-(((i189 & i187) | (i187 ^ i189)) * 164))))) - 1;
                                        int i191 = -TextUtils.indexOf((CharSequence) "", '0', 0);
                                        int i192 = ((i191 | (-210307812)) << 1) - (i191 ^ (-210307812));
                                        int i193 = -(SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1));
                                        int iTuitionPaymentFragmentbindingInflater5 = WrapContentLinearLayoutManager.TuitionPaymentFragmentbindingInflater1();
                                        int i194 = (i193 * (-432)) - 45136;
                                        int i195 = ~i193;
                                        int i196 = ~iTuitionPaymentFragmentbindingInflater5;
                                        int i197 = (i196 & i195) | (i195 ^ i196);
                                        int i198 = (~((i197 & (-104)) | (i197 ^ (-104)))) * 433;
                                        int i199 = (i194 ^ i198) + ((i194 & i198) << 1);
                                        int i200 = ~((103 & iTuitionPaymentFragmentbindingInflater5) | (103 ^ iTuitionPaymentFragmentbindingInflater5));
                                        int i201 = -(-(((i200 & i195) | (i195 ^ i200)) * (-433)));
                                        int i202 = (i199 & i201) + (i201 | i199);
                                        int i203 = ~((iTuitionPaymentFragmentbindingInflater5 & i195) | (i195 ^ iTuitionPaymentFragmentbindingInflater5));
                                        int i204 = ~((i193 & (-104)) | (i193 ^ (-104)));
                                        int i205 = ((i204 & i203) | (i203 ^ i204)) * 433;
                                        int bitsPerPixel = ImageFormat.getBitsPerPixel(0);
                                        int i206 = -(-(SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)));
                                        Object[] objArr11 = new Object[1];
                                        e(i190, i192, (short) ((i202 & i205) + (i205 | i202)), bitsPerPixel, (byte) (((i206 | 122) << 1) - (i206 ^ 122)), objArr11);
                                        try {
                                            Object[] objArr12 = {cls4.getMethod((String) objArr11[0], null).invoke(context, null), 64};
                                            int i207 = -(-Color.blue(0));
                                            int i208 = (i207 ^ 94657555) + ((i207 & 94657555) << 1);
                                            int i209 = (-210307816) - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1));
                                            short sLastIndexOf = (short) (TextUtils.lastIndexOf("", '0', 0) + 16);
                                            int i210 = (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 19;
                                            int jumpTapTimeout = ViewConfiguration.getJumpTapTimeout() >> 16;
                                            int iTuitionPaymentFragmentbindingInflater6 = WrapContentLinearLayoutManager.TuitionPaymentFragmentbindingInflater1();
                                            int i211 = jumpTapTimeout * (-432);
                                            int i212 = (i211 & 36456) + (i211 | 36456);
                                            int i213 = ~jumpTapTimeout;
                                            int i214 = ~iTuitionPaymentFragmentbindingInflater6;
                                            int i215 = (i213 & i214) | (i213 ^ i214);
                                            int i216 = (~((i215 & 84) | (i215 ^ 84))) * 433;
                                            int i217 = ((i212 | i216) << 1) - (i216 ^ i212);
                                            int i218 = ~jumpTapTimeout;
                                            int i219 = ~((-85) | iTuitionPaymentFragmentbindingInflater6);
                                            int i220 = ((i219 & i218) | (i218 ^ i219)) * (-433);
                                            int i221 = ~(iTuitionPaymentFragmentbindingInflater6 | i218);
                                            int i222 = ~((jumpTapTimeout & 84) | (jumpTapTimeout ^ 84));
                                            Object[] objArr13 = new Object[1];
                                            e(i208, i209, sLastIndexOf, i210, (byte) ((i217 ^ i220) + ((i217 & i220) << 1) + (((i221 & i222) | (i221 ^ i222)) * 433)), objArr13);
                                            Class<?> cls5 = Class.forName((String) objArr13[0]);
                                            Object[] objArr14 = new Object[1];
                                            c(new int[]{-874796749, 1960875224, 243681583, -368345692, 851581366, 618052286, -1654319782, -609486614, -91028895, 1331732416}, 13 - (~(-(ViewConfiguration.getPressedStateDuration() >> 16))), objArr14);
                                            Object objInvoke2 = cls5.getMethod((String) objArr14[0], String.class, Integer.TYPE).invoke(objInvoke, objArr12);
                                            int i223 = (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1));
                                            int i224 = (i223 * 866) - 179775680;
                                            int i225 = ~i223;
                                            int i226 = ~((i225 & i120) | (i225 ^ i120));
                                            int i227 = -(-(((i226 & (-94657587)) | ((-94657587) ^ i226)) * (-865)));
                                            int i228 = (i224 ^ i227) + ((i224 & i227) << 1) + ((~((i223 ^ i) | (i223 & i))) * 865);
                                            int i229 = ~(((-94657587) ^ i120) | ((-94657587) & i120));
                                            int i230 = ~((i223 & i152) | (i152 ^ i223));
                                            int i231 = (i228 - (~(-(-(((i230 & i229) | (i229 ^ i230)) * 865))))) - 1;
                                            int iIndexOf = TextUtils.indexOf("", "", 0);
                                            int iTuitionPaymentFragmentbindingInflater7 = WrapContentLinearLayoutManager.TuitionPaymentFragmentbindingInflater1();
                                            int i232 = iIndexOf * 1773;
                                            int i233 = ((i232 | 1438824317) << 1) - (i232 ^ 1438824317);
                                            int i234 = ~iIndexOf;
                                            int i235 = ~((i234 & 210307816) | (i234 ^ 210307816));
                                            int i236 = ~((210307816 & iTuitionPaymentFragmentbindingInflater7) | (210307816 ^ iTuitionPaymentFragmentbindingInflater7));
                                            int i237 = (i235 & i236) | (i235 ^ i236);
                                            int i238 = ~iTuitionPaymentFragmentbindingInflater7;
                                            int i239 = (i238 ^ iIndexOf) | (i238 & iIndexOf);
                                            int i240 = ~((i239 & (-210307817)) | (i239 ^ (-210307817)));
                                            int i241 = i233 + (((i237 & i240) | (i237 ^ i240)) * 886);
                                            int i242 = ((~((i238 ^ (-210307817)) | (i238 & (-210307817)))) | iIndexOf) * (-1772);
                                            int i243 = ((i241 | i242) << 1) - (i242 ^ i241);
                                            int i244 = ~iTuitionPaymentFragmentbindingInflater7;
                                            int i245 = -(-((~((i244 & iIndexOf) | (i244 ^ iIndexOf))) * 886));
                                            int i246 = ((i243 | i245) << 1) - (i245 ^ i243);
                                            int i247 = -(SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1));
                                            Object[] objArr15 = new Object[1];
                                            e(i231, i246, (short) (((i247 | 87) << 1) - (i247 ^ 87)), 15 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), (byte) (92 - (~(-KeyEvent.normalizeMetaState(0)))), objArr15);
                                            Class<?> cls6 = Class.forName((String) objArr15[0]);
                                            int i248 = -TextUtils.indexOf((CharSequence) "", '0', 0);
                                            int i249 = (i248 & 94657615) + (i248 | 94657615);
                                            int i250 = (-210307800) - (~(TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)));
                                            short s4 = (short) ((AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) - 45);
                                            int i251 = -(-(TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)));
                                            int i252 = (i251 ^ (-5)) + ((i251 & (-5)) << 1);
                                            int i253 = -(ViewConfiguration.getPressedStateDuration() >> 16);
                                            Object[] objArr16 = new Object[1];
                                            e(i249, i250, s4, i252, (byte) (((i253 | (-88)) << 1) - (i253 ^ (-88))), objArr16);
                                            Object[] objArr17 = (Object[]) cls6.getField((String) objArr16[0]).get(objInvoke2);
                                            int length = objArr17.length;
                                            int i254 = 0;
                                            r2 = r2;
                                            while (true) {
                                                if (i254 < length) {
                                                    int i255 = d + 109;
                                                    g = i255 % 128;
                                                    int i256 = i255 % 2;
                                                    Object obj2 = objArr17[i254];
                                                    int i257 = -TextUtils.indexOf(str, str);
                                                    Object[] objArr18 = new Object[1];
                                                    c(new int[]{-107513239, 990653987, 712987288, 888163654, 1853223996, 2057863495}, (i257 & 5) + (i257 | 5), objArr18);
                                                    String str3 = (String) objArr18[0];
                                                    int i258 = d;
                                                    int i259 = (i258 ^ 97) + ((i258 & 97) << 1);
                                                    g = i259 % 128;
                                                    int i260 = i259 % 2;
                                                    try {
                                                        Object[] objArr19 = {str3};
                                                        int scrollBarFadeDuration = ViewConfiguration.getScrollBarFadeDuration() >> 16;
                                                        int i261 = ((scrollBarFadeDuration | 94657625) << 1) - (scrollBarFadeDuration ^ 94657625);
                                                        int iKeyCodeFromString = KeyEvent.keyCodeFromString(str);
                                                        int i262 = ((iKeyCodeFromString | (-210307808)) << 1) - (iKeyCodeFromString ^ (-210307808));
                                                        int i263 = g + 55;
                                                        d = i263 % 128;
                                                        if (i263 % 2 == 0) {
                                                            i9 = 118;
                                                            s = (short) (98 << (PointF.length(2.0f, 1.0f) > 2.0f ? 1 : (PointF.length(2.0f, 1.0f) == 2.0f ? 0 : -1)));
                                                        } else {
                                                            s = (short) (97 - (~(PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1))));
                                                            i9 = 22;
                                                        }
                                                        int i264 = -(-TextUtils.indexOf(str, str, 0, 0));
                                                        int i265 = (i9 ^ i264) + ((i9 & i264) << 1);
                                                        int gidForName2 = Process.getGidForName(str);
                                                        int i266 = (gidForName2 ^ (-115)) + ((gidForName2 & (-115)) << 1);
                                                        int i267 = d;
                                                        int i268 = (i267 & 7) + (i267 | 7);
                                                        g = i268 % 128;
                                                        byte b3 = (byte) i266;
                                                        if (i268 % 2 != 0) {
                                                            Object[] objArr20 = new Object[1];
                                                            e(i261, i262, s, i265, b3, objArr20);
                                                            cls = Class.forName((String) objArr20[0]);
                                                            iArr = new int[]{1207928029, 1500108086, 605718913, -1958529630, -925680278, -606289036, -3838929, 668932374};
                                                            i10 = 74;
                                                        } else {
                                                            Object[] objArr21 = new Object[1];
                                                            e(i261, i262, s, i265, b3, objArr21);
                                                            cls = Class.forName((String) objArr21[0]);
                                                            iArr = new int[]{1207928029, 1500108086, 605718913, -1958529630, -925680278, -606289036, -3838929, 668932374};
                                                            i10 = 11;
                                                        }
                                                        Object[] objArr22 = objArr17;
                                                        Object[] objArr23 = new Object[1];
                                                        c(iArr, (i10 - (~(-(-TextUtils.getTrimmedLength(str))))) - 1, objArr23);
                                                        Object objInvoke3 = cls.getMethod((String) objArr23[0], String.class).invoke(null, objArr19);
                                                        try {
                                                            int packedPositionChild = ExpandableListView.getPackedPositionChild(0L);
                                                            int i269 = (packedPositionChild ^ 29) + ((packedPositionChild & 29) << 1);
                                                            Object[] objArr24 = new Object[1];
                                                            c(new int[]{2142811415, 942762324, 1874843350, 664430085, -1577412189, 1845637462, 1281608193, -175404078, -544518043, -647610853, 303605481, 59778581, 736645953, 315799564, -235370584, -990224578}, i269, objArr24);
                                                            Class<?> cls7 = Class.forName((String) objArr24[0]);
                                                            int i270 = -(ViewConfiguration.getKeyRepeatTimeout() >> 16);
                                                            int iTuitionPaymentFragmentbindingInflater8 = WrapContentLinearLayoutManager.TuitionPaymentFragmentbindingInflater1();
                                                            int i271 = i270 * 370;
                                                            int i272 = ((i271 | 663596202) << 1) - (i271 ^ 663596202);
                                                            int i273 = i270 | 94657661;
                                                            int i274 = ~iTuitionPaymentFragmentbindingInflater8;
                                                            int i275 = length;
                                                            int i276 = (i272 - (~(((i273 ^ i274) | (i273 & i274)) * (-369)))) - 1;
                                                            int i277 = d + 89;
                                                            g = i277 % 128;
                                                            int i278 = i277 % 2;
                                                            int i279 = ~i270;
                                                            if (i278 != 0) {
                                                                int i280 = ~iTuitionPaymentFragmentbindingInflater8;
                                                                int i281 = -((-370) - (~((~((i279 ^ i280) | (i279 & i280))) | 94657661)));
                                                                i11 = ((i276 | i281) << 1) - (i276 ^ i281);
                                                                i12 = ((-94657662) ^ i270) | ((-94657662) & i270);
                                                            } else {
                                                                int i282 = ~((i279 & i274) | (i279 ^ i274));
                                                                i11 = (i276 - (~(((i282 ^ 94657661) | (i282 & 94657661)) * (-369)))) - 1;
                                                                i12 = (-94657662) | i270;
                                                            }
                                                            int i283 = ~i12;
                                                            int i284 = ~((i270 ^ iTuitionPaymentFragmentbindingInflater8) | (iTuitionPaymentFragmentbindingInflater8 & i270));
                                                            int i285 = (i283 ^ i284) | (i283 & i284);
                                                            int i286 = ~i270;
                                                            int i287 = (i286 & i274) | (i286 ^ i274);
                                                            int i288 = ~((i287 & 94657661) | (i287 ^ 94657661));
                                                            int iTuitionPaymentFragmentbindingInflater9 = WrapContentLinearLayoutManager.TuitionPaymentFragmentbindingInflater1();
                                                            int i289 = ~((1270602607 ^ iTuitionPaymentFragmentbindingInflater9) | (1270602607 & iTuitionPaymentFragmentbindingInflater9));
                                                            int i290 = 2130153644 + ((((-1451909828) ^ i289) | ((-1451909828) & i289)) * (-366));
                                                            int i291 = ~(iTuitionPaymentFragmentbindingInflater9 | (-335552641));
                                                            int i292 = -(-(((154245420 ^ i291) | (i291 & 154245420)) * 366));
                                                            int i293 = ((i290 | i292) << 1) - (i290 ^ i292);
                                                            int i294 = i254;
                                                            int i295 = ~((-1944545524) | i);
                                                            int i296 = -(-(((540717454 ^ i295) | (540717454 & i295)) * (-964)));
                                                            int i297 = ((605586728 | i296) << 1) - (605586728 ^ i296);
                                                            int i298 = ~(((-1944545524) ^ i120) | ((-1944545524) & i120));
                                                            int i299 = ((i298 ^ 539107458) | (i298 & 539107458)) * (-964);
                                                            if (i293 <= (i297 & i299) + (i297 | i299)) {
                                                                int i300 = -(-(369 << ((i285 & i288) | (i285 ^ i288))));
                                                                i13 = (i11 & i300) + (i300 | i11);
                                                                try {
                                                                    int iMyTid = Process.myTid();
                                                                    i14 = (-210307798) / ((iMyTid ^ 111) + ((iMyTid & 111) << 1));
                                                                    sAxisFromString = (short) (MotionEvent.axisFromString(str) * 16);
                                                                    i15 = 100;
                                                                } catch (Throwable th) {
                                                                    th = th;
                                                                    Throwable cause = th.getCause();
                                                                    if (cause != null) {
                                                                        throw cause;
                                                                    }
                                                                    throw th;
                                                                }
                                                            } else {
                                                                i13 = (369 * ((i285 & i288) | (i285 ^ i288))) + i11;
                                                                int i301 = -(-(Process.myTid() >> 22));
                                                                i14 = ((i301 | (-210307798)) << 1) - (i301 ^ (-210307798));
                                                                int iAxisFromString = MotionEvent.axisFromString(str);
                                                                sAxisFromString = (short) ((iAxisFromString & 62) + (iAxisFromString | 62));
                                                                i15 = -4;
                                                            }
                                                            short s5 = sAxisFromString;
                                                            int i302 = i13;
                                                            int iIndexOf2 = TextUtils.indexOf(str, str, 0);
                                                            Object[] objArr25 = new Object[1];
                                                            e(i302, i14, s5, (i15 & iIndexOf2) + (iIndexOf2 | i15), (byte) (120 - (~(-TextUtils.getTrimmedLength(str)))), objArr25);
                                                            r2 = 0;
                                                            try {
                                                                try {
                                                                    r2 = new Object[]{new ByteArrayInputStream((byte[]) cls7.getMethod((String) objArr25[0], null).invoke(obj2, null))};
                                                                    int defaultSize = View.getDefaultSize(0, 0) + 94657625;
                                                                    int i303 = -(ViewConfiguration.getTouchSlop() >> 8);
                                                                    int i304 = ((i303 | (-210307808)) << 1) - (i303 ^ (-210307808));
                                                                    short s6 = (short) (98 - (~(-(-TextUtils.lastIndexOf(str, '0', 0, 0)))));
                                                                    int i305 = 22 - (~(-(Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1))));
                                                                    int i306 = d;
                                                                    int i307 = ((i306 | 117) << 1) - (i306 ^ 117);
                                                                    g = i307 % 128;
                                                                    if (i307 % 2 != 0) {
                                                                        int i308 = -View.resolveSize(0, 0);
                                                                        Object[] objArr26 = new Object[1];
                                                                        e(defaultSize, i304, s6, i305, (byte) (((i308 | (-116)) << 1) - (i308 ^ (-116))), objArr26);
                                                                        cls2 = Class.forName((String) objArr26[0]);
                                                                        iArr2 = new int[]{-1955167477, -598507947, -269779436, -364895921, -380502361, -400607154, -1292737746, 369223255, -239749311, 2123249156, -34391369, 1884315972};
                                                                        int doubleTapTimeout2 = ViewConfiguration.getDoubleTapTimeout();
                                                                        doubleTapTimeout = (doubleTapTimeout2 & (-88)) + (doubleTapTimeout2 | (-88));
                                                                        i16 = 86;
                                                                    } else {
                                                                        Object[] objArr27 = new Object[1];
                                                                        e(defaultSize, i304, s6, i305, (byte) (View.resolveSize(0, 0) - 116), objArr27);
                                                                        cls2 = Class.forName((String) objArr27[0]);
                                                                        iArr2 = new int[]{-1955167477, -598507947, -269779436, -364895921, -380502361, -400607154, -1292737746, 369223255, -239749311, 2123249156, -34391369, 1884315972};
                                                                        doubleTapTimeout = ViewConfiguration.getDoubleTapTimeout() >> 16;
                                                                        i16 = 19;
                                                                    }
                                                                    int iTuitionPaymentFragmentbindingInflater10 = WrapContentLinearLayoutManager.TuitionPaymentFragmentbindingInflater1();
                                                                    int i309 = doubleTapTimeout * 69;
                                                                    int i310 = -(-(i16 * (-67)));
                                                                    int i311 = (i309 & i310) + (i310 | i309);
                                                                    int i312 = g;
                                                                    int i313 = ((i312 | 31) << 1) - (i312 ^ 31);
                                                                    d = i313 % 128;
                                                                    int i314 = i313 % 2;
                                                                    int i315 = ~doubleTapTimeout;
                                                                    int i316 = ~i16;
                                                                    String str4 = str;
                                                                    int i317 = ~iTuitionPaymentFragmentbindingInflater10;
                                                                    int i318 = ~((i315 ^ i316) | (i315 & i316) | i317);
                                                                    Object obj3 = objNewInstance2;
                                                                    int i319 = ~((doubleTapTimeout ^ i16) | (doubleTapTimeout & i16));
                                                                    int i320 = i312 + 63;
                                                                    d = i320 % 128;
                                                                    int i321 = i320 % 2;
                                                                    int i322 = i311 + ((-68) * ((i318 ^ i319) | (i319 & i318) | (~((i16 ^ iTuitionPaymentFragmentbindingInflater10) | (i16 & iTuitionPaymentFragmentbindingInflater10)))));
                                                                    int i323 = ~doubleTapTimeout;
                                                                    int i324 = ~iTuitionPaymentFragmentbindingInflater10;
                                                                    int i325 = (i324 & i323) | (i323 ^ i324);
                                                                    int i326 = i322 + ((~((i325 & i16) | (i325 ^ i16))) * (-68));
                                                                    int i327 = ~((i317 & i316) | (i316 ^ i317));
                                                                    int i328 = ((i327 & i323) | (i323 ^ i327)) * 68;
                                                                    int i329 = ((i326 | i328) << 1) - (i326 ^ i328);
                                                                    Object[] objArr28 = new Object[1];
                                                                    c(iArr2, i329, objArr28);
                                                                    Object objInvoke4 = cls2.getMethod((String) objArr28[0], InputStream.class).invoke(objInvoke3, r2);
                                                                    int i330 = d;
                                                                    int i331 = (i330 & 5) + (i330 | 5);
                                                                    g = i331 % 128;
                                                                    r2 = 20;
                                                                    r2 = 20;
                                                                    if (i331 % 2 != 0) {
                                                                        try {
                                                                            iArr3 = new int[]{1935951005, 404675165, -1819328086, 512620774, -629161656, -919763039, -1717395463, -1857533379, -1782025404, 652172823, -1453201019, -1371233037, 12743228, -680924472, 1467560068, -645378257, 158972266, -589924000, 2082167951, 1139876010};
                                                                            threadPriority = Process.getThreadPriority(1);
                                                                            i17 = 81;
                                                                            i18 = 72;
                                                                            i19 = 0;
                                                                        } catch (Throwable th2) {
                                                                            Throwable cause2 = th2.getCause();
                                                                            if (cause2 != null) {
                                                                                throw cause2;
                                                                            }
                                                                            throw th2;
                                                                        }
                                                                    } else {
                                                                        iArr3 = new int[]{1935951005, 404675165, -1819328086, 512620774, -629161656, -919763039, -1717395463, -1857533379, -1782025404, 652172823, -1453201019, -1371233037, 12743228, -680924472, 1467560068, -645378257, 158972266, -589924000, 2082167951, 1139876010};
                                                                        threadPriority = Process.getThreadPriority(0);
                                                                        i17 = 34;
                                                                        i19 = 1100;
                                                                        i18 = 20;
                                                                    }
                                                                    int i332 = ~i18;
                                                                    int i333 = ~((i332 ^ threadPriority) | (i332 & threadPriority));
                                                                    int i334 = ~((i120 ^ threadPriority) | (i120 & threadPriority));
                                                                    int i335 = ((i19 + ((-107) * threadPriority)) - (~(((i333 & i334) | (i333 ^ i334)) * (-108)))) - 1;
                                                                    int i336 = g;
                                                                    int i337 = (i336 & 79) + (i336 | 79);
                                                                    d = i337 % 128;
                                                                    int i338 = i337 % 2;
                                                                    int i339 = ~((i332 & i) | (i332 ^ i));
                                                                    int i340 = ~threadPriority;
                                                                    if (i338 == 0) {
                                                                        int i341 = ~((i340 & i18) | (i340 ^ i18));
                                                                        int i342 = (i339 & i341) | (i339 ^ i341);
                                                                        int i343 = ~((i152 ^ i18) | (i152 & i18));
                                                                        i20 = ((i342 & i343) | (i342 ^ i343)) + 54;
                                                                    } else {
                                                                        int i344 = ~((i340 & i18) | (i340 ^ i18));
                                                                        i20 = ((i339 & i344) | (i339 ^ i344) | (~((i152 ^ i18) | (i152 & i18)))) * 54;
                                                                    }
                                                                    int i345 = -(-i20);
                                                                    int i346 = (i335 ^ i345) + ((i335 & i345) << 1);
                                                                    int i347 = ~threadPriority;
                                                                    int i348 = ~((i347 & i18) | (i347 ^ i18));
                                                                    int i349 = -(-(((i348 & i) | (i ^ i348)) * 54));
                                                                    int i350 = -(((i346 & i349) + (i349 | i346)) >> 6);
                                                                    int iTuitionPaymentFragmentbindingInflater11 = WrapContentLinearLayoutManager.TuitionPaymentFragmentbindingInflater1();
                                                                    int i351 = d;
                                                                    int i352 = ((i351 | 17) << 1) - (i351 ^ 17);
                                                                    g = i352 % 128;
                                                                    int i353 = i352 % 2;
                                                                    int i354 = i350 * (-167);
                                                                    int i355 = -(-(i17 * (-167)));
                                                                    int i356 = (i354 & i355) + (i354 | i355);
                                                                    int i357 = ~i350;
                                                                    int i358 = ~i17;
                                                                    int i359 = ~((i357 & i358) | (i357 ^ i358));
                                                                    int i360 = ~i17;
                                                                    int i361 = i356 + ((i359 | (~((i360 & iTuitionPaymentFragmentbindingInflater11) | (i360 ^ iTuitionPaymentFragmentbindingInflater11)))) * 336);
                                                                    int i362 = -(-(((~((i17 & i350) | (i350 ^ i17))) | (~(i350 | iTuitionPaymentFragmentbindingInflater11))) * (-168)));
                                                                    int i363 = (i361 & i362) + (i362 | i361);
                                                                    int i364 = ~iTuitionPaymentFragmentbindingInflater11;
                                                                    int i365 = ~((i364 & i350) | (i364 ^ i350));
                                                                    int i366 = ((i365 & i358) | (i358 ^ i365)) * 168;
                                                                    int i367 = ((i363 | i366) << 1) - (i366 ^ i363);
                                                                    Object[] objArr29 = new Object[1];
                                                                    c(iArr3, i367, objArr29);
                                                                    Class<?> cls8 = Class.forName((String) objArr29[0]);
                                                                    int[] iArr4 = {-1665195429, 1092917691, 1576089980, 2049054034, 1386773423, -842338017, 961465972, -1057878282, -561658917, -1929483895, -1976680044, 977567661, -491223059, 1505439548};
                                                                    int iBlue = Color.blue(0);
                                                                    WrapContentLinearLayoutManager.TuitionPaymentFragmentbindingInflater1();
                                                                    Object[] objArr30 = new Object[1];
                                                                    c(iArr4, 23 - iBlue, objArr30);
                                                                    if (!objNewInstance.equals(cls8.getMethod((String) objArr30[0], null).invoke(objInvoke4, null))) {
                                                                        try {
                                                                            Object[] objArr31 = new Object[1];
                                                                            c(new int[]{1935951005, 404675165, -1819328086, 512620774, -629161656, -919763039, -1717395463, -1857533379, -1782025404, 652172823, -1453201019, -1371233037, 12743228, -680924472, 1467560068, -645378257, 158972266, -589924000, 2082167951, 1139876010}, 34 - (Process.myTid() >> 22), objArr31);
                                                                            Class<?> cls9 = Class.forName((String) objArr31[0]);
                                                                            int i368 = d;
                                                                            int i369 = ((i368 | 115) << 1) - (i368 ^ 115);
                                                                            g = i369 % 128;
                                                                            int i370 = i369 % 2;
                                                                            Object[] objArr32 = new Object[1];
                                                                            c(new int[]{-1665195429, 1092917691, 1576089980, 2049054034, 1386773423, -842338017, 961465972, -1057878282, -561658917, -1929483895, -1976680044, 977567661, -491223059, 1505439548}, 22 - (~(ViewConfiguration.getEdgeSlop() >> 16)), objArr32);
                                                                            if (!obj3.equals(cls9.getMethod((String) objArr32[0], null).invoke(objInvoke4, null))) {
                                                                                i254 = i294 + 1;
                                                                                objArr17 = objArr22;
                                                                                objNewInstance2 = obj3;
                                                                                str = str4;
                                                                                length = i275;
                                                                                r2 = i2;
                                                                            }
                                                                        } catch (Throwable th3) {
                                                                            Throwable cause3 = th3.getCause();
                                                                            if (cause3 != null) {
                                                                                throw cause3;
                                                                            }
                                                                            throw th3;
                                                                        }
                                                                    }
                                                                    int i371 = (i & (-2)) | (i120 & 1);
                                                                    Object[] objArr33 = new Object[4];
                                                                    objArr33[0] = new int[]{i};
                                                                    objArr33[1] = new int[1];
                                                                    int[] iArr5 = new int[1];
                                                                    objArr33[2] = iArr5;
                                                                    int i372 = d;
                                                                    int i373 = (i372 & 83) + (i372 | 83);
                                                                    g = i373 % 128;
                                                                    if (i373 % 2 != 0) {
                                                                        ((int[]) objArr33[3])[1] = i371;
                                                                    } else {
                                                                        iArr5[0] = i371;
                                                                    }
                                                                    objArr33[3] = null;
                                                                    int iNextInt = new Random().nextInt();
                                                                    int i374 = ~iNextInt;
                                                                    int i375 = -(-((-352093690) + (((~(i374 | (-869787815))) | 910098043) * (-1042)) + (((-869787815) | iNextInt) * 521) + (((~(iNextInt | (-910098044))) | 69736025 | (~(i374 | (-29425797)))) * 521) + 16));
                                                                    int i376 = (i2 ^ i375) + ((i375 & i2) << 1);
                                                                    int i377 = i376 << 13;
                                                                    int i378 = (i377 & (~i376)) | ((~i377) & i376);
                                                                    int i379 = i378 >>> 17;
                                                                    int i380 = ((~i378) & i379) | ((~i379) & i378);
                                                                    int i381 = i380 << 5;
                                                                    int i382 = d;
                                                                    int i383 = ((i382 | 35) << 1) - (i382 ^ 35);
                                                                    g = i383 % 128;
                                                                    int i384 = i383 % 2;
                                                                    int i385 = (i380 | i381) & (~(i380 & i381));
                                                                    if (i384 != 0) {
                                                                        ((int[]) objArr33[0])[0] = i385;
                                                                        return objArr33;
                                                                    }
                                                                    ((int[]) objArr33[1])[0] = i385;
                                                                    return objArr33;
                                                                } catch (Throwable th4) {
                                                                    Throwable cause4 = th4.getCause();
                                                                    if (cause4 != null) {
                                                                        throw cause4;
                                                                    }
                                                                    throw th4;
                                                                }
                                                            } catch (Throwable unused) {
                                                                r2 = i2;
                                                            }
                                                        } catch (Throwable th5) {
                                                            th = th5;
                                                        }
                                                    } catch (Throwable th6) {
                                                        Throwable cause5 = th6.getCause();
                                                        if (cause5 != null) {
                                                            throw cause5;
                                                        }
                                                        throw th6;
                                                    }
                                                }
                                            }
                                        } catch (Throwable th7) {
                                            Throwable cause6 = th7.getCause();
                                            if (cause6 != null) {
                                                throw cause6;
                                            }
                                            throw th7;
                                        }
                                    } catch (Throwable th8) {
                                        Throwable cause7 = th8.getCause();
                                        if (cause7 != null) {
                                            throw cause7;
                                        }
                                        throw th8;
                                    }
                                } catch (Throwable th9) {
                                    Throwable cause8 = th9.getCause();
                                    if (cause8 != null) {
                                        throw cause8;
                                    }
                                    throw th9;
                                }
                            } catch (Throwable th10) {
                                Throwable cause9 = th10.getCause();
                                if (cause9 != null) {
                                    throw cause9;
                                }
                                throw th10;
                            }
                        } catch (Throwable th11) {
                            Throwable cause10 = th11.getCause();
                            if (cause10 != null) {
                                throw cause10;
                            }
                            throw th11;
                        }
                    } catch (Throwable unused2) {
                    }
                }
                Object[] objArr34 = {new int[]{i}, new int[1], new int[]{i}, null};
                int iMaxMemory = (int) Runtime.getRuntime().maxMemory();
                int i386 = ~((-143147011) | iMaxMemory);
                int i387 = ~iMaxMemory;
                int i388 = (-389416670) + ((i386 | (~(1072429695 | i387))) * 497) + (((~(iMaxMemory | 1072429695)) | (~((-969592915) | i387)) | 826445904) * 497);
                int i389 = d;
                int i390 = (i389 & 85) + (i389 | 85);
                g = i390 % 128;
                if (i390 % 2 != 0) {
                    int i391 = (-109) << (111 / i388);
                    int i392 = ~(i388 | i);
                    int i393 = -((-220) >> (i392 | ((-1) ^ i392)));
                    i3 = ((i391 | i393) << 1) - (i391 ^ i393);
                } else {
                    int i394 = i388 * 111;
                    i3 = (i394 & 220) + (i394 | 220);
                }
                int i395 = ~i388;
                int i396 = ~i;
                int i397 = ((i396 & 121701120) | (i396 ^ 121701120)) * 1324;
                int i398 = (627435733 ^ i397) + ((i397 & 627435733) << 1);
                int i399 = ~((-951735502) | i);
                int i400 = ~((1061246861 & i) | (1061246861 ^ i));
                int i401 = i398 + (((i399 & i400) | (i399 ^ i400)) * (-1324));
                int i402 = (i401 & 1558549994) + (1558549994 | i401);
                int i403 = (183343404 & i) | (183343404 ^ i);
                int i404 = ~i403;
                int i405 = ((i404 & 731759485) | (731759485 ^ i404)) * (-658);
                int i406 = (1346994787 & i405) + (i405 | 1346994787);
                int i407 = ((i406 | (-70618062)) << 1) - ((-70618062) ^ i406);
                int i408 = ~i403;
                int i409 = -(-(((i408 & 554713681) | (554713681 ^ i408)) * 658));
                if (i402 > (i407 ^ i409) + ((i409 & i407) << 1)) {
                    int i410 = ~(i | i388);
                    int i411 = i3 * (220 / ((i410 & i395) | (i395 ^ i410)));
                    int i412 = ~(((-1) ^ i388) | i388);
                    int i413 = ~(~i388);
                    i4 = (i411 - (~(110 >> ((i412 & i413) | (i412 ^ i413))))) - 1;
                } else {
                    int i414 = ~((i & i388) | (i388 ^ i));
                    int i415 = -(-(220 * ((i414 & i395) | (i395 ^ i414))));
                    int i416 = (i3 & i415) + (i415 | i3);
                    int i417 = ~(((-1) ^ i388) | i388);
                    int i418 = ~(~i388);
                    int i419 = -(-(((i417 & i418) | (i417 ^ i418)) * 110));
                    i4 = (i416 & i419) + (i419 | i416);
                }
                int iTuitionPaymentFragmentbindingInflater12 = WrapContentLinearLayoutManager.TuitionPaymentFragmentbindingInflater1();
                int i420 = (-51) * i4;
                int i421 = -(-(r2 * 53));
                int i422 = (i420 & i421) + (i420 | i421);
                int i423 = ~iTuitionPaymentFragmentbindingInflater12;
                int i424 = (i423 ^ i4) | (i423 & i4);
                int i425 = (i422 - (~(-(-((~((i424 & r2) | ((i424 ^ r2) == true ? 1 : 0))) * 52))))) - 1;
                int i426 = ~r2;
                int i427 = (i423 & i426) | (i426 ^ i423);
                int i428 = g;
                int i429 = (i428 & 71) + (i428 | 71);
                d = i429 % 128;
                int i430 = i429 % 2;
                int i431 = ~i427;
                int i432 = ~((~r2) | i4);
                int i433 = ~iTuitionPaymentFragmentbindingInflater12;
                int i434 = (-52) * ((i431 & i432) | (i431 ^ i432) | (~((i433 ^ i4) | (i433 & i4))));
                int i435 = (i425 & i434) + (i434 | i425);
                int i436 = ~i4;
                int i437 = -(-(((~((i433 & i436) | (i436 ^ i433))) | (~((r2 & i436) | ((i436 ^ r2) == true ? 1 : 0)))) * 52));
                int i438 = ((i435 | i437) << 1) - (i437 ^ i435);
                int i439 = i438 << 13;
                int i440 = (i439 & (~i438)) | ((~i439) & i438);
                int i441 = i440 >>> 17;
                int i442 = ((~i440) & i441) | ((~i441) & i440);
                ((int[]) objArr34[1])[0] = i442 ^ (i442 << 5);
                return objArr34;
            }

            /* JADX WARN: Code duplicated, block: B:10:0x0025  */
            /* JADX WARN: Code duplicated, block: B:8:0x001f  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002a). Please report as a decompilation issue!!! */
            /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0025
                	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                */
            private static java.lang.String $$c(byte r7, short r8, byte r9) {
                /*
                    int r8 = r8 * 3
                    int r8 = r8 + 4
                    int r9 = r9 * 3
                    int r9 = r9 + 1
                    byte[] r0 = defpackage.CustomTabsIntentApi23Impl.$$a
                    int r7 = r7 + 66
                    byte[] r1 = new byte[r9]
                    r2 = 0
                    if (r0 != 0) goto L14
                    r3 = r8
                    r5 = r2
                    goto L2a
                L14:
                    r3 = r2
                    r6 = r8
                    r8 = r7
                    r7 = r6
                L18:
                    byte r4 = (byte) r8
                    int r5 = r3 + 1
                    r1[r3] = r4
                    if (r5 != r9) goto L25
                    java.lang.String r7 = new java.lang.String
                    r7.<init>(r1, r2)
                    return r7
                L25:
                    r3 = r0[r7]
                    r6 = r3
                    r3 = r7
                    r7 = r6
                L2a:
                    int r7 = -r7
                    int r8 = r8 + r7
                    int r7 = r3 + 1
                    r3 = r5
                    goto L18
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.CustomTabsIntentApi23Impl.$$c(byte, short, byte):java.lang.String");
            }
        });
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = null;
    }

    public static /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault2(setLanguageTag setlanguagetag, View view) {
        ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(view);
        try {
            Function0<Unit> function0 = setlanguagetag.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            setlanguagetag.dismiss();
        } finally {
            ViewPortBuilder.b();
        }
    }
}
