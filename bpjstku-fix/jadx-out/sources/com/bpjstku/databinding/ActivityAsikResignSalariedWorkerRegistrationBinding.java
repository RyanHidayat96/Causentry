package com.bpjstku.databinding;

import android.content.Context;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
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
import android.widget.ExpandableListView;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.bpjstku.R;
import com.google.android.gms.cloudmessaging.zzu;
import defpackage.abortCapture;
import defpackage.deInitSession;
import defpackage.initSession;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.lang.reflect.Method;
import kotlin.text.Typography;
import okhttp3.tls.internal.der.DerHeader;

/* JADX INFO: loaded from: classes3.dex */
public final class ActivityAsikResignSalariedWorkerRegistrationBinding implements ViewBinding {
    private static char TuitionPaymentFragmentbindingInflater1;
    private static char[] TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    public static int TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    private static int asInterface;
    private static long b;
    public final LayoutToolbarBinding layoutToolbar;
    public final LinearLayout llProgress;
    public final FrameLayout nonSalariedWorkerContainer;
    private final ConstraintLayout rootView;
    private static final byte[] $$a = {2, -84, 82, -15};
    private static final int $$b = 198;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int d = 1;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 0;
    private static int asBinder = 1;

    @Override // androidx.viewbinding.ViewBinding
    public final /* bridge */ /* synthetic */ View getRoot() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 119;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        ConstraintLayout root = getRoot();
        int i4 = asBinder + 123;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 25 / 0;
        }
        return root;
    }

    private ActivityAsikResignSalariedWorkerRegistrationBinding(ConstraintLayout constraintLayout, LayoutToolbarBinding layoutToolbarBinding, LinearLayout linearLayout, FrameLayout frameLayout) {
        this.rootView = constraintLayout;
        this.layoutToolbar = layoutToolbarBinding;
        this.llProgress = linearLayout;
        this.nonSalariedWorkerContainer = frameLayout;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final ConstraintLayout getRoot() {
        int i = 2 % 2;
        int i2 = asBinder + 43;
        int i3 = i2 % 128;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i3;
        int i4 = i2 % 2;
        ConstraintLayout constraintLayout = this.rootView;
        int i5 = i3 + 19;
        asBinder = i5 % 128;
        int i6 = i5 % 2;
        return constraintLayout;
    }

    public static ActivityAsikResignSalariedWorkerRegistrationBinding inflate(LayoutInflater layoutInflater) {
        int i = 2 % 2;
        int i2 = asBinder + 83;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        return inflate(layoutInflater, null, false);
    }

    public static ActivityAsikResignSalariedWorkerRegistrationBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 111;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        View viewInflate = layoutInflater.inflate(R.layout.activity_asik_resign_salaried_worker_registration, viewGroup, false);
        if (z) {
            int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 61;
            asBinder = i4 % 128;
            int i5 = i4 % 2;
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    private static void c(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        abortCapture abortcapture = new abortCapture();
        char[] cArrB = abortCapture.b(b ^ (-2687588926731523482L), cArr, i);
        abortcapture.b = 4;
        int i3 = $10 + 1;
        $11 = i3 % 128;
        int i4 = i3 % 2;
        while (abortcapture.b < cArrB.length) {
            int i5 = $10 + 79;
            $11 = i5 % 128;
            int i6 = i5 % 2;
            abortcapture.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = abortcapture.b - 4;
            int i7 = abortcapture.b;
            try {
                Object[] objArr2 = {Long.valueOf(cArrB[abortcapture.b] ^ cArrB[abortcapture.b % 4]), Long.valueOf(abortcapture.TuitionPaymentFragmentspecialinlinedviewModeldefault1), Long.valueOf(b)};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-774687567);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    byte b2 = (byte) (-1);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (64838 - (ViewConfiguration.getFadingEdgeLength() >> 16)), 1356 - View.combineMeasuredStates(0, 0), 37 - Process.getGidForName(""), 894276454, false, $$c((byte) 9, b2, (byte) (b2 + 1)), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                }
                cArrB[i7] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {abortcapture, abortcapture};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-772308768);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (47773 - KeyEvent.normalizeMetaState(0)), TextUtils.getOffsetBefore("", 0) + 468, TextUtils.getOffsetBefore("", 0) + 13, 896083767, false, "n", new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3);
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        objArr[0] = new String(cArrB, 4, cArrB.length - 4);
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0040 A[PHI: r1 r2
  0x0040: PHI (r1v11 com.bpjstku.databinding.LayoutToolbarBinding) = (r1v10 com.bpjstku.databinding.LayoutToolbarBinding), (r1v13 com.bpjstku.databinding.LayoutToolbarBinding) binds: [B:10:0x003e, B:7:0x0031] A[DONT_GENERATE, DONT_INLINE]
  0x0040: PHI (r2v4 android.widget.LinearLayout) = (r2v3 android.widget.LinearLayout), (r2v6 android.widget.LinearLayout) binds: [B:10:0x003e, B:7:0x0031] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:13:0x004b  */
    public static ActivityAsikResignSalariedWorkerRegistrationBinding bind(View view) {
        LayoutToolbarBinding layoutToolbarBindingBind;
        LinearLayout linearLayout;
        FrameLayout frameLayout;
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 69;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        int i4 = R.id.layout_toolbar;
        View viewFindChildViewById = ViewBindings.findChildViewById(view, R.id.layout_toolbar);
        if (viewFindChildViewById != null) {
            int i5 = asBinder + 63;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i5 % 128;
            int i6 = i5 % 2;
            int i7 = R.id.llProgress;
            if (i6 != 0) {
                layoutToolbarBindingBind = LayoutToolbarBinding.bind(viewFindChildViewById);
                linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.llProgress);
                int i8 = 20 / 0;
                if (linearLayout != null) {
                    i7 = R.id.nonSalariedWorkerContainer;
                    frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, R.id.nonSalariedWorkerContainer);
                    if (frameLayout != null) {
                        return new ActivityAsikResignSalariedWorkerRegistrationBinding((ConstraintLayout) view, layoutToolbarBindingBind, linearLayout, frameLayout);
                    }
                }
            } else {
                layoutToolbarBindingBind = LayoutToolbarBinding.bind(viewFindChildViewById);
                linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.llProgress);
                if (linearLayout != null) {
                    i7 = R.id.nonSalariedWorkerContainer;
                    frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, R.id.nonSalariedWorkerContainer);
                    if (frameLayout != null) {
                        return new ActivityAsikResignSalariedWorkerRegistrationBinding((ConstraintLayout) view, layoutToolbarBindingBind, linearLayout, frameLayout);
                    }
                }
            }
            i4 = i7;
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    private static void a(char[] cArr, byte b2, int i, Object[] objArr) throws Throwable {
        int i2;
        int i3 = 2;
        int i4 = 2 % 2;
        deInitSession deinitsession = new deInitSession();
        char[] cArr2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        long j = 0;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i5 = $11 + 21;
            $10 = i5 % 128;
            int i6 = i5 % 2;
            int i7 = 0;
            while (i7 < length) {
                int i8 = $10 + 91;
                $11 = i8 % 128;
                int i9 = i8 % i3;
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i7])};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1770390596);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        char absoluteGravity = (char) Gravity.getAbsoluteGravity(0, 0);
                        int i10 = 2268 - (Process.getElapsedCpuTime() > j ? 1 : (Process.getElapsedCpuTime() == j ? 0 : -1));
                        int iGreen = Color.green(0) + 33;
                        byte b3 = (byte) ($$a[0] + 1);
                        byte b4 = (byte) (b3 - 4);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(absoluteGravity, i10, iGreen, -1927765101, false, $$c(b3, b4, (byte) (b4 + 1)), new Class[]{Integer.TYPE});
                    }
                    cArr3[i7] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                    i7++;
                    i3 = 2;
                    j = 0;
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
        try {
            Object[] objArr3 = {Integer.valueOf(TuitionPaymentFragmentbindingInflater1)};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1770390596);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                char cLastIndexOf = (char) ((-1) - TextUtils.lastIndexOf("", '0', 0, 0));
                int iIndexOf = TextUtils.indexOf("", "") + 2267;
                int maxKeyCode = 33 - (KeyEvent.getMaxKeyCode() >> 16);
                byte b5 = (byte) ($$a[0] + 1);
                byte b6 = (byte) (b5 - 4);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cLastIndexOf, iIndexOf, maxKeyCode, -1927765101, false, $$c(b5, b6, (byte) (b6 + 1)), new Class[]{Integer.TYPE});
            }
            char cCharValue = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).charValue();
            char[] cArr4 = new char[i];
            if (i % 2 != 0) {
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
                        int i11 = $10 + 97;
                        $11 = i11 % 128;
                        int i12 = i11 % 2;
                        cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = (char) (deinitsession.b - b2);
                        cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = (char) (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault2 - b2);
                        int i13 = $11 + 17;
                        $10 = i13 % 128;
                        int i14 = i13 % 2;
                    } else {
                        Object[] objArr4 = {deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(486174475);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                            char cNormalizeMetaState = (char) (KeyEvent.normalizeMetaState(0) + 49267);
                            int packedPositionType = 3261 - ExpandableListView.getPackedPositionType(0L);
                            int iIndexOf2 = TextUtils.indexOf("", "", 0) + 30;
                            byte b7 = $$a[0];
                            byte b8 = (byte) (b7 - 3);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(cNormalizeMetaState, packedPositionType, iIndexOf2, -127612708, false, $$c(b7, b8, (byte) (b8 + 1)), new Class[]{Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class});
                        }
                        if (((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4)).intValue() == deinitsession.asBinder) {
                            int i15 = $10 + 51;
                            $11 = i15 % 128;
                            int i16 = i15 % 2;
                            Object[] objArr5 = {deinitsession, deinitsession, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), deinitsession, Integer.valueOf(cCharValue), deinitsession};
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1187000607);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                                byte b9 = (byte) 0;
                                byte b10 = (byte) (b9 - 1);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) ((ViewConfiguration.getTouchSlop() >> 8) + 22878), (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 594, 17 - (ViewConfiguration.getTouchSlop() >> 8), 1570859318, false, $$c(b9, b10, (byte) (b10 + 1)), new Class[]{Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Integer.TYPE, Object.class});
                            }
                            int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).intValue();
                            int i17 = (deinitsession.TuitionPaymentFragmentbindingInflater1 * cCharValue) + deinitsession.asBinder;
                            cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr2[iIntValue];
                            cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = cArr2[i17];
                        } else if (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault1 == deinitsession.TuitionPaymentFragmentbindingInflater1) {
                            deinitsession.g = ((deinitsession.g + cCharValue) - 1) % cCharValue;
                            deinitsession.asBinder = ((deinitsession.asBinder + cCharValue) - 1) % cCharValue;
                            int i18 = (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault1 * cCharValue) + deinitsession.g;
                            int i19 = (deinitsession.TuitionPaymentFragmentbindingInflater1 * cCharValue) + deinitsession.asBinder;
                            cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr2[i18];
                            cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = cArr2[i19];
                        } else {
                            int i20 = (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault1 * cCharValue) + deinitsession.asBinder;
                            int i21 = (deinitsession.TuitionPaymentFragmentbindingInflater1 * cCharValue) + deinitsession.g;
                            cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr2[i20];
                            cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = cArr2[i21];
                        }
                    }
                    deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 += 2;
                }
            }
            for (int i22 = 0; i22 < i; i22++) {
                cArr4[i22] = (char) (cArr4[i22] ^ 13722);
            }
            objArr[0] = new String(cArr4);
            int i23 = $10 + 61;
            $11 = i23 % 128;
            if (i23 % 2 == 0) {
                throw null;
            }
        } catch (Throwable th2) {
            Throwable cause2 = th2.getCause();
            if (cause2 == null) {
                throw th2;
            }
            throw cause2;
        }
    }

    public static Object[] TuitionPaymentFragmentspecialinlinedviewModeldefault1(Context context, int i, int i2) {
        int i3;
        char c;
        Object obj;
        char[] cArr;
        long packedPositionForGroup;
        long j;
        Object obj2;
        Object[] objArr;
        char c2;
        char[] cArr2;
        int iCombineMeasuredStates;
        int i4;
        int i5;
        Object obj3;
        char[] cArr3;
        int i6;
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault3;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13 = 2;
        int i14 = 2 % 2;
        int i15 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        int i16 = ((i15 | 113) << 1) - (i15 ^ 113);
        asBinder = i16 % 128;
        if (i16 % 2 == 0) {
            throw null;
        }
        if (context != null) {
            try {
                char[] cArr4 = {'\b', 30, 7, 27, 4, 5, 25, 11, 2, 5, 15, 28, 23, 21, 19, 22, '\b', ' ', 7, 27, 4, 5, 25, 11, 2, 5, 0, '\b', 7, 15, 13820};
                int i17 = -(ViewConfiguration.getScrollDefaultDelay() >> 16);
                int iTuitionPaymentFragmentspecialinlinedviewModeldefault4 = zzu.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
                int i18 = (-965) - (~(-(-(i17 * (-963)))));
                int i19 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                int i20 = ((i19 | 109) << 1) - (i19 ^ 109);
                asBinder = i20 % 128;
                int i21 = i20 % 2 == 0 ? i18 * 505937920 : ((i18 | 49215) << 1) - (i18 ^ 49215);
                int i22 = ~i17;
                int i23 = (i19 & 125) + (i19 | 125);
                asBinder = i23 % 128;
                int i24 = i23 % 2;
                int i25 = ~(((-52) & iTuitionPaymentFragmentspecialinlinedviewModeldefault4) | ((-52) ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault4));
                int i26 = (i21 - (~(-(-((-964) * ((i25 & i22) | (i22 ^ i25))))))) - 1;
                int i27 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault4;
                int i28 = ~((i27 & (-52)) | ((-52) ^ i27));
                int i29 = i19 + 29;
                asBinder = i29 % 128;
                int i30 = i29 % 2;
                int i31 = ~((i17 & (-52)) | ((-52) ^ i17));
                Object[] objArr2 = new Object[1];
                a(cArr4, (byte) (i26 + ((-964) * ((i28 & i31) | (i28 ^ i31)))), 30 - (~(-(-(ViewConfiguration.getMaximumDrawingCacheSize() >> 24)))), objArr2);
                String str = (String) objArr2[0];
                int i32 = asBinder;
                int i33 = (i32 ^ 73) + ((i32 & 73) << 1);
                TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i33 % 128;
                int i34 = i33 % 2;
                try {
                    Object[] objArr3 = new Object[1];
                    c(new char[]{40776, 40738, 50114, 57603, 45230, 1903, 31611, 21252, 8765, 64685, 21310, 1795, 1859, 51394, 40947, 54235, 64416, 5138, 43931, 40863, 45037, 24683, 63361, 44004, 25140, 46054, 557, 29734, 22110, 65503, 20068, 'R', 2580, 52203, 39671, 52423, 65158, 5900, 42704, 39050, 45821, 25423}, 0 - (~(-View.MeasureSpec.getSize(0))), objArr3);
                    Object objNewInstance = Class.forName((String) objArr3[0]).getDeclaredConstructor(String.class).newInstance(str);
                    char[] cArr5 = {7, '\n', 16, 7, '\b', ' ', 7, 27, 4, 5, 25, 11, 2, 5, 0, '\b', '!', '\b', 27, 1, 5, 28, '\r', 7, '\n', 22, 28, 21, 21, 19, 13927};
                    byte b2 = (byte) (106 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)));
                    int iKeyCodeFromString = KeyEvent.keyCodeFromString("");
                    int i35 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                    int i36 = i35 + 15;
                    asBinder = i36 % 128;
                    int i37 = i36 % 2;
                    int i38 = ((-501) * iKeyCodeFromString) + 15593;
                    int i39 = ~(((-32) ^ i) | ((-32) & i));
                    int i40 = ~((iKeyCodeFromString ^ 31) | (iKeyCodeFromString & 31));
                    int i41 = -(-(((i39 ^ i40) | (i40 & i39)) * (-502)));
                    int i42 = (i38 ^ i41) + ((i41 & i38) << 1);
                    int i43 = (i35 ^ 95) + ((i35 & 95) << 1);
                    asBinder = i43 % 128;
                    int i44 = i43 % 2;
                    int i45 = ~i;
                    int i46 = i42 + ((-502) * (~(((-32) & i45) | ((-32) ^ i45) | iKeyCodeFromString)));
                    int i47 = ~iKeyCodeFromString;
                    int i48 = ~((i47 & i) | (i47 ^ i));
                    int i49 = (i46 - (~(((i48 & (-32)) | ((-32) ^ i48)) * TypedValues.PositionType.TYPE_DRAWPATH))) - 1;
                    Object[] objArr4 = new Object[1];
                    a(cArr5, b2, i49, objArr4);
                    try {
                        Object[] objArr5 = {(String) objArr4[0]};
                        int i50 = -(ViewConfiguration.getKeyRepeatDelay() >> 16);
                        int iTuitionPaymentFragmentspecialinlinedviewModeldefault5 = zzu.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
                        int i51 = i50 * 236;
                        int i52 = (i51 ^ 471) + ((i51 & 471) << 1);
                        int i53 = ~i50;
                        int i54 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault5;
                        int i55 = ~((i53 ^ i54) | (i54 & i53));
                        int i56 = ((i52 - (~(((i55 ^ 1) | (i55 & 1)) * (-235)))) - 1) + (((~((i53 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault5) | (i53 & iTuitionPaymentFragmentspecialinlinedviewModeldefault5))) | 1) * (-470));
                        int i57 = ~(((-2) ^ i50) | (i50 & (-2)));
                        int i58 = (i53 ^ 1) | (i53 & 1);
                        int i59 = ~((i58 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault5) | (iTuitionPaymentFragmentspecialinlinedviewModeldefault5 & i58));
                        int i60 = (i56 - (~(-(-(((i57 & i59) | (i57 ^ i59)) * 235))))) - 1;
                        Object[] objArr6 = new Object[1];
                        c(new char[]{40776, 40738, 50114, 57603, 45230, 1903, 31611, 21252, 8765, 64685, 21310, 1795, 1859, 51394, 40947, 54235, 64416, 5138, 43931, 40863, 45037, 24683, 63361, 44004, 25140, 46054, 557, 29734, 22110, 65503, 20068, 'R', 2580, 52203, 39671, 52423, 65158, 5900, 42704, 39050, 45821, 25423}, i60, objArr6);
                        Object objNewInstance2 = Class.forName((String) objArr6[0]).getDeclaredConstructor(String.class).newInstance(objArr5);
                        try {
                            Object[] objArr7 = new Object[1];
                            c(new char[]{58627, 58722, 24358, 24617, 11333, 34391, 8618, 10584, 30975, 24590, 53763, 23946, 32008, 21564, 7877, 35076, 33274, 35041, 10987, 50450, 54672, 64660, 30381, 61820, 6242, 12111, 33603}, -ExpandableListView.getPackedPositionChild(0L), objArr7);
                            Class<?> cls = Class.forName((String) objArr7[0]);
                            int jumpTapTimeout = ViewConfiguration.getJumpTapTimeout() >> 16;
                            Object[] objArr8 = new Object[1];
                            c(new char[]{39279, 39176, 14751, 8059, 19191, 63765, 5952, 21818, 20023, 1725, 44382, 27405, 352, 12943, 25012, 49113, 64925, 61015, 21930, 62353, 43469}, (jumpTapTimeout & 1) + (jumpTapTimeout | 1), objArr8);
                            Object objInvoke = cls.getMethod((String) objArr8[0], null).invoke(context, null);
                            int i61 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                            int i62 = ((i61 | 59) << 1) - (i61 ^ 59);
                            asBinder = i62 % 128;
                            int i63 = i62 % 2;
                            try {
                                int i64 = -(ViewConfiguration.getMaximumFlingVelocity() >> 16);
                                int i65 = ((i64 | 1) << 1) - (i64 ^ 1);
                                Object[] objArr9 = new Object[1];
                                c(new char[]{58627, 58722, 24358, 24617, 11333, 34391, 8618, 10584, 30975, 24590, 53763, 23946, 32008, 21564, 7877, 35076, 33274, 35041, 10987, 50450, 54672, 64660, 30381, 61820, 6242, 12111, 33603}, i65, objArr9);
                                Class<?> cls2 = Class.forName((String) objArr9[0]);
                                int i66 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 119;
                                asBinder = i66 % 128;
                                if (i66 % 2 == 0) {
                                    cArr = new char[]{4171, 4140, 15007, 54541, 18935, 13155, 37278, 56350, 51433, 1469, 26408, 60883, 34884, 12687, 43969, 14599, 29882, 60755};
                                    packedPositionForGroup = ExpandableListView.getPackedPositionForGroup(1);
                                    j = 0;
                                } else {
                                    cArr = new char[]{4171, 4140, 15007, 54541, 18935, 13155, 37278, 56350, 51433, 1469, 26408, 60883, 34884, 12687, 43969, 14599, 29882, 60755};
                                    packedPositionForGroup = ExpandableListView.getPackedPositionForGroup(0);
                                    j = 0;
                                }
                                int i67 = -(packedPositionForGroup > j ? 1 : (packedPositionForGroup == j ? 0 : -1));
                                int i68 = (i67 * (-380)) + 382;
                                int i69 = (1 ^ i) | (1 & i);
                                int i70 = ~i67;
                                int i71 = -(-(((i69 ^ i70) | (i69 & i70)) * (-381)));
                                int i72 = ((i68 | i71) << 1) - (i71 ^ i68);
                                int i73 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                                int i74 = ((i73 | 19) << 1) - (i73 ^ 19);
                                int i75 = i74 % 128;
                                asBinder = i75;
                                if (i74 % 2 == 0) {
                                    throw null;
                                }
                                int i76 = ~(i70 | (-2));
                                int i77 = ~i;
                                int i78 = (~((i77 ^ 1) | (i77 & 1))) | i76;
                                int i79 = ~(i67 | 1);
                                int i80 = i72 + (381 * ((i78 & i79) | (i78 ^ i79)));
                                int i81 = i75 + 37;
                                TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i81 % 128;
                                if (i81 % 2 != 0) {
                                    int i82 = -(~((i70 ^ 1) | (i70 & 1)));
                                    Object[] objArr10 = new Object[1];
                                    c(cArr, i80 >>> ((i82 ^ 381) + ((i82 & 381) << 1)), objArr10);
                                    obj2 = objArr10[0];
                                } else {
                                    Object[] objArr11 = new Object[1];
                                    c(cArr, i80 + ((~((i70 ^ 1) | (i70 & 1))) * 381), objArr11);
                                    obj2 = objArr11[0];
                                }
                                Object objInvoke2 = cls2.getMethod((String) obj2, null).invoke(context, null);
                                int i83 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                                int i84 = (i83 & 123) + (i83 | 123);
                                asBinder = i84 % 128;
                                if (i84 % 2 == 0) {
                                    int i85 = 4 / 4;
                                }
                                int i86 = i83 + 9;
                                asBinder = i86 % 128;
                                try {
                                    if (i86 % 2 == 0) {
                                        objArr = new Object[2];
                                        objArr[0] = 64;
                                        objArr[0] = objInvoke2;
                                        cArr2 = new char[]{37923, 37954, 13138, 37466, 16433, 29732, 6065, 22648, 20196, 3194, 8304, 27537, 3112, 14408, 60598, 48927, 61658, 58517, 55448, 62217, 42115, 37090, 33950, 51011, 26950, 17184, 28975, 6318, 23932, 3954, 15685, 27866, 289, 15178, 59835, 40978, 62961};
                                        iCombineMeasuredStates = View.combineMeasuredStates(1, 1);
                                        c2 = 0;
                                        i4 = 0;
                                    } else {
                                        objArr = new Object[]{objInvoke2, 64};
                                        c2 = 0;
                                        cArr2 = new char[]{37923, 37954, 13138, 37466, 16433, 29732, 6065, 22648, 20196, 3194, 8304, 27537, 3112, 14408, 60598, 48927, 61658, 58517, 55448, 62217, 42115, 37090, 33950, 51011, 26950, 17184, 28975, 6318, 23932, 3954, 15685, 27866, 289, 15178, 59835, 40978, 62961};
                                        iCombineMeasuredStates = View.combineMeasuredStates(0, 0);
                                        i4 = 1;
                                    }
                                    Object[] objArr12 = new Object[1];
                                    c(cArr2, (i4 - (~(-iCombineMeasuredStates))) - 1, objArr12);
                                    Class<?> cls3 = Class.forName((String) objArr12[c2]);
                                    char[] cArr6 = {22, 23, '\f', '\r', 1, 30, 0, 1, 22, 23, 27, 0, 25, '\r'};
                                    int i87 = -(ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1));
                                    int iTuitionPaymentFragmentspecialinlinedviewModeldefault6 = zzu.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
                                    int i88 = asBinder + 115;
                                    TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i88 % 128;
                                    if (i88 % 2 != 0) {
                                        int i89 = -i87;
                                        int i90 = -(((i89 | 306) << 1) - (i89 ^ 306));
                                        i5 = (((i90 | TypedValues.MotionType.TYPE_QUANTIZE_MOTIONSTEPS) << 1) - (i90 ^ TypedValues.MotionType.TYPE_QUANTIZE_MOTIONSTEPS)) << 9792;
                                    } else {
                                        i5 = 2139 - (~(i87 * 306));
                                    }
                                    int i91 = ~((i87 ^ 5) | (i87 & 5));
                                    int i92 = ~(i87 | iTuitionPaymentFragmentspecialinlinedviewModeldefault6);
                                    int i93 = 305 * ((i91 ^ i92) | (i91 & i92));
                                    int i94 = (i5 ^ i93) + ((i5 & i93) << 1);
                                    int i95 = ~i;
                                    zzu.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
                                    int i96 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault6;
                                    int i97 = 305 * ((~((i87 & i96) | (i96 ^ i87))) | (-6));
                                    byte b3 = (byte) (((i94 | i97) << 1) - (i94 ^ i97));
                                    int i98 = -(-(CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)));
                                    int i99 = (i98 & 14) + (i98 | 14);
                                    Object[] objArr13 = new Object[1];
                                    a(cArr6, b3, i99, objArr13);
                                    String str2 = (String) objArr13[0];
                                    int i100 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                                    int i101 = ((i100 | 95) << 1) - (i100 ^ 95);
                                    asBinder = i101 % 128;
                                    Object objInvoke3 = i101 % 2 == 0 ? cls3.getMethod(str2, String.class, Integer.TYPE).invoke(objInvoke, objArr) : cls3.getMethod(str2, String.class, Integer.TYPE).invoke(objInvoke, objArr);
                                    char[] cArr7 = {7039, 6942, 2680, 56172, 31003, 15634, 38357, 55076, 52352, 13648, 26950, 59893, 33652, 354, 42368, 15739, 32646, 56767, 37294, 29037, 11231, 43464, 52648, 17703, 58906, 31242, 14361, 39626, 53792, 13912, 29815, 61105, 36469, 622};
                                    int i102 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                                    int i103 = (i102 & 103) + (i102 | 103);
                                    asBinder = i103 % 128;
                                    int i104 = i103 % 2;
                                    Object[] objArr14 = new Object[1];
                                    c(cArr7, (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), objArr14);
                                    Class<?> cls4 = Class.forName((String) objArr14[0]);
                                    Object[] objArr15 = new Object[1];
                                    c(new char[]{61704, 61819, 63386, 64103, 34046, 7194, 60487, 15709, 46350, 51375, 18524, 36903, 26885, 64668}, -ImageFormat.getBitsPerPixel(0), objArr15);
                                    Object[] objArr16 = (Object[]) cls4.getField((String) objArr15[0]).get(objInvoke3);
                                    int length = objArr16.length;
                                    int i105 = 0;
                                    while (i105 < length) {
                                        int i106 = asBinder + 115;
                                        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i106 % 128;
                                        if (i106 % i13 != 0) {
                                            obj3 = objArr16[i105];
                                            cArr3 = new char[]{17, 29, 27, 16, 13757};
                                            i6 = -(ViewConfiguration.getMinimumFlingVelocity() + 68);
                                            iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = zzu.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
                                            i7 = 93;
                                        } else {
                                            obj3 = objArr16[i105];
                                            cArr3 = new char[]{17, 29, 27, 16, 13757};
                                            i6 = -(ViewConfiguration.getMinimumFlingVelocity() >> 16);
                                            iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = zzu.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
                                            i7 = 26;
                                        }
                                        int i107 = i7;
                                        int i108 = asBinder;
                                        int i109 = (i108 ^ 105) + ((i108 & 105) << 1);
                                        Object[] objArr17 = objArr16;
                                        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i109 % 128;
                                        if (i109 % i13 != 0) {
                                            i8 = ((-183) / i6) >> ((-184) - (~(-(-i107))));
                                            int i110 = ~i6;
                                            int i111 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault3;
                                            i9 = i110 ^ i111;
                                            i10 = i111 & i110;
                                        } else {
                                            int i112 = (-183) * i6;
                                            int i113 = -(-(i107 * (-183)));
                                            i8 = ((i112 | i113) << 1) - (i112 ^ i113);
                                            int i114 = ~i6;
                                            int i115 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault3;
                                            i9 = i114 ^ i115;
                                            i10 = i114 & i115;
                                        }
                                        int i116 = i9 | i10;
                                        int i117 = ~((i116 & i107) | (i116 ^ i107));
                                        int i118 = ~i107;
                                        int i119 = length;
                                        int i120 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault3;
                                        int i121 = (i118 ^ i120) | (i118 & i120);
                                        int i122 = (-184) * (i117 | (~((i121 ^ i6) | (i121 & i6))));
                                        int i123 = (i8 & i122) + (i8 | i122);
                                        int i124 = ~i6;
                                        int i125 = ~i107;
                                        int i126 = i105;
                                        int i127 = ~(i124 | i125);
                                        int i128 = ~(i124 | i120);
                                        int i129 = (i128 & i127) | (i127 ^ i128);
                                        int i130 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault3;
                                        int i131 = ~((i130 & i125) | (i125 ^ i130));
                                        int i132 = ((i129 & i131) | (i129 ^ i131)) * 184;
                                        int i133 = (i123 & i132) + (i132 | i123);
                                        int i134 = -(-(((i6 ^ i107) | (i6 & i107)) * 184));
                                        byte b4 = (byte) ((i133 ^ i134) + ((i134 & i133) << 1));
                                        int i135 = (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
                                        int i136 = ~((i135 ^ i) | (i135 & i));
                                        int i137 = (((i135 * 673) - 6715) - (~(-(-(((i136 & 5) | (i136 ^ 5)) * 672))))) - 1;
                                        int i138 = ~((~i135) | i45);
                                        int i139 = ~((i ^ 5) | (i & 5));
                                        int i140 = -(-(((i138 & i139) | (i138 ^ i139)) * (-672)));
                                        int i141 = (i137 & i140) + (i137 | i140);
                                        int i142 = ~((-6) | i95);
                                        int i143 = ~(i135 | (-6));
                                        int i144 = i141 + (((i143 & i142) | (i142 ^ i143)) * 672);
                                        Object[] objArr18 = new Object[1];
                                        a(cArr3, b4, i144, objArr18);
                                        try {
                                            Object[] objArr19 = {(String) objArr18[0]};
                                            char[] cArr8 = {'\f', 2, 6, 2, 22, '#', 19, Typography.quote, 23, 24, 5, '\r', '#', 18, Typography.quote, 19, '#', 23, 18, 11, 23, 28, '\r', 5, 25, 7, 30, 1, 16, 23, 30, 3, '#', '\r', 11, 25, 13808};
                                            int i145 = -(-(ViewConfiguration.getTouchSlop() >> 8));
                                            byte b5 = (byte) (((i145 | 13) << 1) - (i145 ^ 13));
                                            int i146 = (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
                                            int iTuitionPaymentFragmentspecialinlinedviewModeldefault7 = zzu.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
                                            int i147 = (i146 * (-721)) - 26677;
                                            int i148 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault7;
                                            int i149 = ~i146;
                                            int i150 = ~((i149 ^ (-38)) | (i149 & (-38)));
                                            int i151 = (i148 ^ i150) | (i150 & i148);
                                            int i152 = (i146 ^ 37) | (i146 & 37);
                                            int i153 = i45;
                                            int i154 = ~i152;
                                            int i155 = -(-(((i151 ^ i154) | (i151 & i154)) * 1444));
                                            int i156 = (i147 ^ i155) + ((i155 & i147) << 1);
                                            int i157 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                                            int i158 = ((i157 | 99) << 1) - (i157 ^ 99);
                                            asBinder = i158 % 128;
                                            if (i158 % 2 == 0) {
                                                int i159 = (~i152) | (~((i146 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault7) | (i146 & iTuitionPaymentFragmentspecialinlinedviewModeldefault7)));
                                                int i160 = ~((iTuitionPaymentFragmentspecialinlinedviewModeldefault7 & 37) | (iTuitionPaymentFragmentspecialinlinedviewModeldefault7 ^ 37));
                                                i11 = i156 % ((-1444) % ((i159 & i160) | (i159 ^ i160)));
                                                int i161 = ~(i149 | 37);
                                                int i162 = ~(((-38) & i146) | ((-38) ^ i146));
                                                i12 = 722 / ((i161 & i162) | (i161 ^ i162));
                                            } else {
                                                int i163 = ~(i146 | 37);
                                                int i164 = ~(i146 | iTuitionPaymentFragmentspecialinlinedviewModeldefault7);
                                                int i165 = (i163 & i164) | (i163 ^ i164);
                                                int i166 = ~((iTuitionPaymentFragmentspecialinlinedviewModeldefault7 & 37) | (iTuitionPaymentFragmentspecialinlinedviewModeldefault7 ^ 37));
                                                int i167 = ((i165 & i166) | (i165 ^ i166)) * (-1444);
                                                i11 = (i156 & i167) + (i167 | i156);
                                                int i168 = ~i146;
                                                int i169 = ~((i168 & 37) | (i168 ^ 37));
                                                int i170 = ~(((-38) & i146) | ((-38) ^ i146));
                                                i12 = ((i169 & i170) | (i169 ^ i170)) * 722;
                                            }
                                            int i171 = (i11 - (~i12)) - 1;
                                            Object[] objArr20 = new Object[1];
                                            a(cArr8, b5, i171, objArr20);
                                            Class<?> cls5 = Class.forName((String) objArr20[0]);
                                            int i172 = -KeyEvent.keyCodeFromString("");
                                            int iTuitionPaymentFragmentspecialinlinedviewModeldefault8 = zzu.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
                                            int i173 = i172 * 980;
                                            int i174 = ((i173 | (-50856)) << 1) - (i173 ^ (-50856));
                                            int i175 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault8;
                                            int i176 = -(-((~(((-53) & i175) | ((-53) ^ i175))) * 979));
                                            int i177 = ((i174 | i176) << 1) - (i176 ^ i174);
                                            int i178 = -(-((i172 | iTuitionPaymentFragmentspecialinlinedviewModeldefault8) * (-979)));
                                            int i179 = ~((iTuitionPaymentFragmentspecialinlinedviewModeldefault8 & (-53)) | ((-53) ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault8));
                                            int i180 = ~((i172 & i175) | (i175 ^ i172));
                                            byte b6 = (byte) ((i177 ^ i178) + ((i178 & i177) << 1) + (((i180 & i179) | (i179 ^ i180)) * 979));
                                            int i181 = -(ViewConfiguration.getJumpTapTimeout() >> 16);
                                            int i182 = i181 * (-743);
                                            int i183 = (i182 & (-8173)) + (i182 | (-8173));
                                            int i184 = (i181 ^ 11) | (i181 & 11);
                                            int i185 = ~i184;
                                            int i186 = ~((i181 ^ i) | (i181 & i));
                                            int i187 = (i185 & i186) | (i185 ^ i186);
                                            int i188 = ~((i ^ 11) | (i & 11));
                                            int i189 = ~((~i181) | (-12));
                                            int i190 = ((i183 + (((i187 & i188) | (i187 ^ i188)) * (-744))) - (~(((i189 & i95) | (i95 ^ i189)) * 744))) - 1;
                                            int i191 = ((i184 & i) | (i184 ^ i)) * 744;
                                            int i192 = ((i190 | i191) << 1) - (i191 ^ i190);
                                            Object[] objArr21 = new Object[1];
                                            a(new char[]{22, 23, '\f', 29, 4, '!', '\f', 5, 1, '!', 13875}, b6, i192, objArr21);
                                            Object objInvoke4 = cls5.getMethod((String) objArr21[0], String.class).invoke(null, objArr19);
                                            try {
                                                int i193 = -(ViewConfiguration.getMaximumDrawingCacheSize() >> 24);
                                                int i194 = i193 * 592;
                                                int i195 = (i194 & (-590)) + (i194 | (-590));
                                                int i196 = ~i193;
                                                int i197 = -(-((~((i196 ^ 1) | (i196 & 1))) * (-1182)));
                                                int i198 = (i195 & i197) + (i195 | i197);
                                                int i199 = (~i193) | (-2);
                                                int i200 = ~((i199 & i95) | (i199 ^ i95));
                                                int i201 = ~((i193 & 1) | (i193 ^ 1));
                                                int i202 = (i198 - (~(((i201 & i200) | (i200 ^ i201)) * (-591)))) - 1;
                                                int i203 = (i ^ i196) | (i196 & i);
                                                int i204 = ((i203 & (-2)) | (i203 ^ (-2))) * 591;
                                                Object[] objArr22 = new Object[1];
                                                c(new char[]{52642, 52675, 48745, 2103, 52490, 61001, 59656, 505, 45149, 33089, 47645, 38184, 21929, 46451, 30427, 16806, 43355, 27054, 17141, 3504, 64770, 7641, 7923, 14841, 12495, 52767, 60231, 58903, 1262, 33369, 42775, 37479}, (i202 & i204) + (i204 | i202), objArr22);
                                                Class<?> cls6 = Class.forName((String) objArr22[0]);
                                                Object[] objArr23 = new Object[1];
                                                c(new char[]{42413, 42457, 47446, 38201, 51764, 29537, 9102, 27117, 31440, 34418, 10038, 24569, 15799, 45634, 60354}, (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), objArr23);
                                                ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream((byte[]) cls6.getMethod((String) objArr23[0], null).invoke(obj3, null));
                                                int i205 = asBinder;
                                                int i206 = (i205 ^ 63) + ((i205 & 63) << 1);
                                                TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i206 % 128;
                                                int i207 = i206 % 2;
                                                try {
                                                    char[] cArr9 = {'\f', 2, 6, 2, 22, '#', 19, Typography.quote, 23, 24, 5, '\r', '#', 18, Typography.quote, 19, '#', 23, 18, 11, 23, 28, '\r', 5, 25, 7, 30, 1, 16, 23, 30, 3, '#', '\r', 11, 25, 13808};
                                                    int i208 = -(AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
                                                    int i209 = -(AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
                                                    int iTuitionPaymentFragmentspecialinlinedviewModeldefault9 = zzu.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
                                                    int i210 = i209 * 370;
                                                    int i211 = (i210 & 13690) + (i210 | 13690);
                                                    int i212 = ((i209 ^ 37) | (i209 & 37) | (~iTuitionPaymentFragmentspecialinlinedviewModeldefault9)) * (-369);
                                                    int i213 = (i211 & i212) + (i212 | i211);
                                                    int i214 = ~i209;
                                                    int i215 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault9;
                                                    int i216 = ~(i214 | i215);
                                                    int i217 = -(-(((i216 & 37) | (i216 ^ 37)) * (-369)));
                                                    int i218 = (i213 & i217) + (i217 | i213);
                                                    int i219 = ~((-38) | i209);
                                                    int i220 = ~((iTuitionPaymentFragmentspecialinlinedviewModeldefault9 & i209) | (i209 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault9));
                                                    int i221 = (i220 & i219) | (i219 ^ i220);
                                                    int i222 = ~i209;
                                                    int i223 = ~((i222 & i215) | (i222 ^ i215) | 37);
                                                    int i224 = i218 + (((i223 & i221) | (i221 ^ i223)) * 369);
                                                    Object[] objArr24 = new Object[1];
                                                    a(cArr9, (byte) ((i208 & 13) + (i208 | 13)), i224, objArr24);
                                                    Class<?> cls7 = Class.forName((String) objArr24[0]);
                                                    Object[] objArr25 = new Object[1];
                                                    a(new char[]{22, 23, 4, 21, 24, 5, 16, 23, '\n', 18, '#', 23, 7, 25, 7, 1, 5, '\f', 13928}, (byte) (104 - (~(-View.combineMeasuredStates(0, 0)))), (ViewConfiguration.getJumpTapTimeout() >> 16) + 19, objArr25);
                                                    Object objInvoke5 = cls7.getMethod((String) objArr25[0], InputStream.class).invoke(objInvoke4, byteArrayInputStream);
                                                    try {
                                                        Object[] objArr26 = new Object[1];
                                                        c(new char[]{22073, 22099, 64023, 4973, 35195, 62721, 11167, 39459, 29401, 50469, 41286, 22497, 52772, 61712, 28038, 33570, 13020, 11664, 22968, 53119, 26267, 22974, 1449, 64374, 43784, 35382, 61514, 9393, 40804, 50720, 48203, 20719, 49971, 61959, 26760, 39979, 14317, 11999}, (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), objArr26);
                                                        Class<?> cls8 = Class.forName((String) objArr26[0]);
                                                        Object[] objArr27 = new Object[1];
                                                        c(new char[]{4665, 4702, 18762, 15696, 14882, 56126, 55585, 56952, 32853, 30313, 36724, 42347, 35378, 16971, 17290, 29167, 30357, 40659, 30646, 15844, 8832, 60153, 11225, 2507, 61261, 14650, 56866}, (Process.myTid() >> 22) + 1, objArr27);
                                                        if (!objNewInstance.equals(cls8.getMethod((String) objArr27[0], null).invoke(objInvoke5, null))) {
                                                            zzu.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
                                                            try {
                                                                int i225 = -KeyEvent.getDeadChar(0, 0);
                                                                int i226 = (i225 & 1) + (i225 | 1);
                                                                Object[] objArr28 = new Object[1];
                                                                c(new char[]{22073, 22099, 64023, 4973, 35195, 62721, 11167, 39459, 29401, 50469, 41286, 22497, 52772, 61712, 28038, 33570, 13020, 11664, 22968, 53119, 26267, 22974, 1449, 64374, 43784, 35382, 61514, 9393, 40804, 50720, 48203, 20719, 49971, 61959, 26760, 39979, 14317, 11999}, i226, objArr28);
                                                                Class<?> cls9 = Class.forName((String) objArr28[0]);
                                                                Object[] objArr29 = new Object[1];
                                                                c(new char[]{4665, 4702, 18762, 15696, 14882, 56126, 55585, 56952, 32853, 30313, 36724, 42347, 35378, 16971, 17290, 29167, 30357, 40659, 30646, 15844, 8832, 60153, 11225, 2507, 61261, 14650, 56866}, (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), objArr29);
                                                                if (!objNewInstance2.equals(cls9.getMethod((String) objArr29[0], null).invoke(objInvoke5, null))) {
                                                                    i105 = i126 + 1;
                                                                    objArr16 = objArr17;
                                                                    length = i119;
                                                                    i45 = i153;
                                                                    i13 = 2;
                                                                }
                                                            } catch (Throwable th) {
                                                                Throwable cause = th.getCause();
                                                                if (cause != null) {
                                                                    throw cause;
                                                                }
                                                                throw th;
                                                            }
                                                        }
                                                        Object[] objArr30 = {new int[]{i}, new int[]{(i | i) & (~(i & i))}, new int[]{(i & (-2)) | (i95 & 1)}, null};
                                                        int i227 = (~((-651565398) | i)) | 42997845;
                                                        int i228 = 1521273620 + (i227 * 992) + ((i227 | (~((-2687617) | i95))) * (-496)) + (((-611255169) | i) * 496);
                                                        int i229 = (i228 & 16) + (i228 | 16);
                                                        int i230 = ((i229 * 303) - (~(-(-(i2 * (-301)))))) - 1;
                                                        int i231 = (~i229) | i95;
                                                        int i232 = -(-(((~((i231 & i2) | (i231 ^ i2))) | (~((i229 ^ i2) | (i229 & i2) | i))) * (-302)));
                                                        int i233 = ((i230 | i232) << 1) - (i230 ^ i232);
                                                        int i234 = ~i229;
                                                        int i235 = (i234 & i2) | (i234 ^ i2);
                                                        int i236 = (~((i235 & i) | (i235 ^ i))) * (-604);
                                                        int i237 = ((i233 | i236) << 1) - (i236 ^ i233);
                                                        int i238 = ~i2;
                                                        int i239 = ~((i229 & i238) | (i238 ^ i229));
                                                        int i240 = ~(i2 | i);
                                                        int i241 = i237 + (((i239 & i240) | (i239 ^ i240)) * 302);
                                                        int i242 = i241 << 13;
                                                        int i243 = (i242 | i241) & (~(i241 & i242));
                                                        int i244 = i243 >>> 17;
                                                        int i245 = (i243 | i244) & (~(i243 & i244));
                                                        int i246 = i245 << 5;
                                                        return objArr30;
                                                    } catch (Throwable th2) {
                                                        Throwable cause2 = th2.getCause();
                                                        if (cause2 != null) {
                                                            throw cause2;
                                                        }
                                                        throw th2;
                                                    }
                                                } catch (Throwable th3) {
                                                    Throwable cause3 = th3.getCause();
                                                    if (cause3 != null) {
                                                        throw cause3;
                                                    }
                                                    throw th3;
                                                }
                                            } catch (Throwable th4) {
                                                Throwable cause4 = th4.getCause();
                                                if (cause4 != null) {
                                                    throw cause4;
                                                }
                                                throw th4;
                                            }
                                        } catch (Throwable th5) {
                                            Throwable cause5 = th5.getCause();
                                            if (cause5 != null) {
                                                throw cause5;
                                            }
                                            throw th5;
                                        }
                                    }
                                } catch (Throwable th6) {
                                    Throwable cause6 = th6.getCause();
                                    if (cause6 != null) {
                                        throw cause6;
                                    }
                                    throw th6;
                                }
                            } catch (Throwable th7) {
                                Throwable cause7 = th7.getCause();
                                if (cause7 != null) {
                                    throw cause7;
                                }
                                throw th7;
                            }
                        } catch (Throwable th8) {
                            Throwable cause8 = th8.getCause();
                            if (cause8 != null) {
                                throw cause8;
                            }
                            throw th8;
                        }
                    } catch (Throwable th9) {
                        Throwable cause9 = th9.getCause();
                        if (cause9 != null) {
                            throw cause9;
                        }
                        throw th9;
                    }
                } catch (Throwable th10) {
                    Throwable cause10 = th10.getCause();
                    if (cause10 != null) {
                        throw cause10;
                    }
                    throw th10;
                }
            } catch (Throwable unused) {
            }
        }
        Object[] objArr31 = new Object[4];
        int[] iArr = new int[1];
        objArr31[0] = iArr;
        int[] iArr2 = new int[1];
        objArr31[1] = iArr2;
        int i247 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        int i248 = (i247 & 75) + (i247 | 75);
        asBinder = i248 % 128;
        if (i248 % 2 == 0) {
            i3 = 1;
            objArr31[2] = new int[1];
        } else {
            objArr31[2] = new int[1];
            i3 = 0;
        }
        int i249 = (i247 & 61) + (i247 | 61);
        asBinder = i249 % 128;
        if (i249 % 2 == 0) {
            c = 0;
            iArr2[0] = i;
            obj = objArr31[2];
        } else {
            c = 0;
            iArr[0] = i;
            obj = objArr31[2];
        }
        ((int[]) obj)[c] = i;
        objArr31[3] = null;
        int i250 = ~i;
        int i251 = (-810060588) + ((710939008 | i250) * (-192)) + (((~(737951149 | i250)) | 67322370) * (-384)) + (((~(i | (-27012142))) | (~(i250 | 805273519)) | (~((-67322371) | i))) * DerHeader.TAG_CLASS_PRIVATE);
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault10 = zzu.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        int i252 = (i3 * 784) + (i251 * (-782)) + ((~i251) * (-783));
        int i253 = ~i3;
        int i254 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault10;
        int i255 = i253 | i254;
        int i256 = i252 + ((~((i255 & i251) | (i255 ^ i251))) * (-783));
        int i257 = ~((i254 & i251) | (i254 ^ i251));
        int i258 = -(-(i256 + (((i257 & i253) | (i253 ^ i257)) * 783)));
        int i259 = ((i2 | i258) << 1) - (i258 ^ i2);
        int i260 = i259 << 13;
        int i261 = (i260 | i259) & (~(i259 & i260));
        int i262 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        int i263 = (i262 ^ 5) + ((i262 & 5) << 1);
        asBinder = i263 % 128;
        int i264 = i263 % 2;
        int i265 = i261 >>> 17;
        int i266 = ((~i261) & i265) | ((~i265) & i261);
        int i267 = i266 << 5;
        ((int[]) objArr31[1])[0] = (i266 | i267) & (~(i266 & i267));
        return objArr31;
    }

    static {
        asInterface = 0;
        TuitionPaymentFragmentbindingInflater1();
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 1690597342;
        int i = d + 35;
        asInterface = i % 128;
        int i2 = i % 2;
    }

    static void TuitionPaymentFragmentbindingInflater1() {
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = new char[]{60058, 60050, 60119, 60053, 60063, 60048, 60088, 60052, 60045, 60102, 60072, 60067, 60075, 60078, 60049, 60107, 60123, 60047, 60046, 60061, 60057, 60060, 60062, 60117, 60082, 60090, 60084, 60095, 60110, 60041, 60034, 60056, 60085, 60093, 60040, 60098};
        TuitionPaymentFragmentbindingInflater1 = (char) 57191;
        b = -7997179384693679765L;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0020  */
    /* JADX WARN: Code duplicated, block: B:8:0x001a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0020 -> B:11:0x0024). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0020
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$c(int r5, short r6, int r7) {
        /*
            int r7 = r7 * 3
            int r7 = r7 + 1
            int r6 = r6 + 4
            int r5 = 116 - r5
            byte[] r0 = com.bpjstku.databinding.ActivityAsikResignSalariedWorkerRegistrationBinding.$$a
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L12
            r4 = r7
            r3 = r2
            goto L24
        L12:
            r3 = r2
        L13:
            byte r4 = (byte) r5
            r1[r3] = r4
            int r3 = r3 + 1
            if (r3 != r7) goto L20
            java.lang.String r5 = new java.lang.String
            r5.<init>(r1, r2)
            return r5
        L20:
            int r6 = r6 + 1
            r4 = r0[r6]
        L24:
            int r4 = -r4
            int r5 = r5 + r4
            goto L13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.databinding.ActivityAsikResignSalariedWorkerRegistrationBinding.$$c(int, short, int):java.lang.String");
    }
}
