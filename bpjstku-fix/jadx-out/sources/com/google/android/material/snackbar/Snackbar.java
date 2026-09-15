package com.google.android.material.snackbar;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import android.widget.Button;
import android.widget.ExpandableListView;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.constraintlayout.core.widgets.analyzer.BasicMeasure;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.google.android.material.R;
import com.yalantis.ucrop.view.CropImageView;
import defpackage.ViewPortBuilder;
import defpackage.initSession;
import defpackage.setOrVerifyExpectFrameRateRange;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes4.dex */
public class Snackbar extends BaseTransientBottomBar<Snackbar> {
    private static final int[] SNACKBAR_BUTTON_STYLE_ATTR = {R.attr.snackbarButtonStyle};
    private static final int[] SNACKBAR_CONTENT_STYLE_ATTRS = {R.attr.snackbarButtonStyle, R.attr.snackbarTextViewStyle};
    private final AccessibilityManager accessibilityManager;
    private BaseTransientBottomBar.BaseCallback<Snackbar> callback;
    private boolean hasAction;

    public static class Callback extends BaseTransientBottomBar.BaseCallback<Snackbar> {
        public static final int DISMISS_EVENT_ACTION = 1;
        public static final int DISMISS_EVENT_CONSECUTIVE = 4;
        public static final int DISMISS_EVENT_MANUAL = 3;
        public static final int DISMISS_EVENT_SWIPE = 0;
        public static final int DISMISS_EVENT_TIMEOUT = 2;
        private static final byte[] $$c = {113, 29, -123, -97};
        private static final int $$d = 79;
        private static int $10 = 0;
        private static int $11 = 1;
        private static final byte[] $$a = {5, -91, 77, 46};
        private static final int $$b = 240;
        private static int TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 0;
        private static int TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 1;
        private static int b = -83722405;

        private static void c(int i, int i2, short s, Object[] objArr) {
            byte[] bArr = $$a;
            int i3 = (i * 3) + 98;
            int i4 = s * 4;
            int i5 = (i2 * 2) + 4;
            byte[] bArr2 = new byte[i4 + 1];
            int i6 = -1;
            if (bArr == null) {
                int i7 = i5 + i4;
                i5++;
                i3 = i7;
            }
            while (true) {
                i6++;
                bArr2[i6] = (byte) i3;
                if (i6 == i4) {
                    objArr[0] = new String(bArr2, 0);
                    return;
                }
                int i8 = i5;
                i5 = i8 + 1;
                i3 += bArr[i5];
            }
        }

        @Override // com.google.android.material.snackbar.BaseTransientBottomBar.BaseCallback
        public /* bridge */ /* synthetic */ void onDismissed(Snackbar snackbar, int i) {
            int i2 = 2 % 2;
            int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 65;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3 % 128;
            int i4 = i3 % 2;
            onDismissed2(snackbar, i);
            int i5 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 81;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i5 % 128;
            if (i5 % 2 == 0) {
                throw null;
            }
        }

        @Override // com.google.android.material.snackbar.BaseTransientBottomBar.BaseCallback
        public /* bridge */ /* synthetic */ void onShown(Snackbar snackbar) {
            int i = 2 % 2;
            int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 65;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
            int i3 = i2 % 2;
            onShown2(snackbar);
            int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 99;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
            int i5 = i4 % 2;
        }

        private static void a(boolean z, int i, int i2, int i3, char[] cArr, Object[] objArr) throws Throwable {
            int i4 = 2 % 2;
            setOrVerifyExpectFrameRateRange setorverifyexpectframeraterange = new setOrVerifyExpectFrameRateRange();
            char[] cArr2 = new char[i2];
            setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
            while (setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3 < i2) {
                setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = cArr[setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3];
                cArr2[setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = (char) (i + setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
                int i5 = setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i5]), Integer.valueOf(b)};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1545221423);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        char size = (char) View.MeasureSpec.getSize(0);
                        int i6 = (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 3291;
                        int i7 = (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 31;
                        byte b2 = (byte) ($$d & 1);
                        byte b3 = (byte) (b2 - 1);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(size, i6, i7, 1199271174, false, $$e(b2, b3, b3), new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr2[i5] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                    Object[] objArr3 = {setorverifyexpectframeraterange, setorverifyexpectframeraterange};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(29209604);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                        byte b4 = (byte) 0;
                        byte b5 = b4;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (ViewConfiguration.getTapTimeout() >> 16), (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 651, 44 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), -450685997, false, $$e(b4, b5, b5), new Class[]{Object.class, Object.class});
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
            if (i3 > 0) {
                int i8 = $11 + 19;
                $10 = i8 % 128;
                int i9 = i8 % 2;
                setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1 = i3;
                char[] cArr3 = new char[i2];
                System.arraycopy(cArr2, 0, cArr3, 0, i2);
                System.arraycopy(cArr3, 0, cArr2, i2 - setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1, setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1);
                System.arraycopy(cArr3, setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1, cArr2, 0, i2 - setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1);
            }
            if (z) {
                char[] cArr4 = new char[i2];
                setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
                int i10 = $10 + 55;
                $11 = i10 % 128;
                int i11 = i10 % 2;
                while (setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3 < i2) {
                    int i12 = $10 + 97;
                    $11 = i12 % 128;
                    int i13 = i12 % 2;
                    cArr4[setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr2[(i2 - setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3) - 1];
                    Object[] objArr4 = {setorverifyexpectframeraterange, setorverifyexpectframeraterange};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(29209604);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                        byte b6 = (byte) 0;
                        byte b7 = b6;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (Process.getGidForName("") + 1), (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 651, 44 - TextUtils.getTrimmedLength(""), -450685997, false, $$e(b6, b7, b7), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
                }
                cArr2 = cArr4;
            }
            objArr[0] = new String(cArr2);
            int i14 = $10 + 103;
            $11 = i14 % 128;
            if (i14 % 2 == 0) {
                throw null;
            }
        }

        /* JADX INFO: renamed from: onDismissed, reason: avoid collision after fix types in other method */
        public void onDismissed2(Snackbar snackbar, int i) {
            int i2 = 2 % 2;
            int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 69;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = 80 / 0;
            }
        }

        /* JADX INFO: renamed from: onShown, reason: avoid collision after fix types in other method */
        public void onShown2(Snackbar snackbar) {
            int i = 2 % 2;
            int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 3;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
            int i3 = i2 % 2;
        }

        /* JADX WARN: Code duplicated, block: B:102:0x099c  */
        /* JADX WARN: Code duplicated, block: B:104:0x09c8  */
        /* JADX WARN: Code duplicated, block: B:71:0x05ea  */
        /* JADX WARN: Code duplicated, block: B:72:0x05f6 A[Catch: Exception -> 0x084f, TRY_ENTER, TRY_LEAVE, TryCatch #0 {Exception -> 0x084f, blocks: (B:69:0x05ac, B:72:0x05f6, B:74:0x067b, B:76:0x0683, B:79:0x078c, B:81:0x0804, B:86:0x0840, B:87:0x0846, B:89:0x0848, B:90:0x084e, B:73:0x0600, B:80:0x0796), top: B:113:0x05ac, inners: #5, #7 }] */
        /* JADX WARN: Code duplicated, block: B:76:0x0683 A[Catch: Exception -> 0x084f, TryCatch #0 {Exception -> 0x084f, blocks: (B:69:0x05ac, B:72:0x05f6, B:74:0x067b, B:76:0x0683, B:79:0x078c, B:81:0x0804, B:86:0x0840, B:87:0x0846, B:89:0x0848, B:90:0x084e, B:73:0x0600, B:80:0x0796), top: B:113:0x05ac, inners: #5, #7 }] */
        /* JADX WARN: Code duplicated, block: B:78:0x078a  */
        /* JADX WARN: Code duplicated, block: B:79:0x078c A[Catch: Exception -> 0x084f, TRY_LEAVE, TryCatch #0 {Exception -> 0x084f, blocks: (B:69:0x05ac, B:72:0x05f6, B:74:0x067b, B:76:0x0683, B:79:0x078c, B:81:0x0804, B:86:0x0840, B:87:0x0846, B:89:0x0848, B:90:0x084e, B:73:0x0600, B:80:0x0796), top: B:113:0x05ac, inners: #5, #7 }] */
        /* JADX WARN: Code duplicated, block: B:94:0x0889  */
        /* JADX WARN: Code duplicated, block: B:95:0x08a4  */
        /* JADX WARN: Code duplicated, block: B:98:0x08e7  */
        /* JADX WARN: Code duplicated, block: B:99:0x0903  */
        public static Object[] TuitionPaymentFragmentspecialinlinedviewModeldefault1(int i, int i2) throws Throwable {
            int i3;
            String str;
            Object[] objArr;
            Object obj;
            int i4;
            int i5;
            int i6;
            int i7;
            String[] strArr;
            int i8;
            int i9;
            int i10;
            Object[] objArr2;
            int i11;
            Object[] objArr3;
            int i12;
            int i13;
            int i14;
            int i15;
            int i16;
            File file;
            FileReader fileReader;
            BufferedReader bufferedReader;
            boolean zEquals;
            File file2;
            FileReader fileReader2;
            BufferedReader bufferedReader2;
            boolean zEquals2;
            int i17;
            int i18;
            int i19;
            int deadChar;
            int i20;
            int i21;
            int i22;
            int i23;
            Object obj2;
            int i24 = 2 % 2;
            int i25 = 0;
            try {
                int iResolveSizeAndState = View.resolveSizeAndState(0, 0, 0) + 159;
                int packedPositionGroup = ExpandableListView.getPackedPositionGroup(0L);
                int iTuitionPaymentFragmentspecialinlinedviewModeldefault1 = CropImageView.ZoomImageToPosition.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                int i26 = (packedPositionGroup * (-523)) + 4997;
                int i27 = ~packedPositionGroup;
                int i28 = ~((i27 ^ 19) | (i27 & 19));
                int i29 = ((-20) ^ packedPositionGroup) | ((-20) & packedPositionGroup);
                int i30 = ~i29;
                int i31 = (i28 ^ i30) | (i30 & i28);
                int i32 = ~((-20) | iTuitionPaymentFragmentspecialinlinedviewModeldefault1);
                int i33 = i26 + (((i31 ^ i32) | (i32 & i31)) * 262);
                int i34 = ~i29;
                int i35 = i34 * (-786);
                int i36 = ((i33 | i35) << 1) - (i35 ^ i33);
                int i37 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault1;
                int i38 = ~(((-20) & i37) | ((-20) ^ i37));
                int i39 = (i36 - (~(-(-((i34 | ((i38 & i28) | (i38 ^ i28))) * 262))))) - 1;
                int i40 = -(SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1));
                int iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = CropImageView.ZoomImageToPosition.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                int i41 = i40 * (-300);
                int i42 = (i41 & 6040) + (i41 | 6040);
                int i43 = -(-((~((i40 ^ 20) | (i40 & 20) | iTuitionPaymentFragmentspecialinlinedviewModeldefault2)) * (-301)));
                int i44 = (i42 ^ i43) + ((i43 & i42) << 1);
                int i45 = ~(((-21) ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault2) | ((-21) & iTuitionPaymentFragmentspecialinlinedviewModeldefault2));
                int i46 = ~((~iTuitionPaymentFragmentspecialinlinedviewModeldefault2) | i40);
                int i47 = (i44 - (~(((i45 ^ i46) | (i45 & i46)) * (-301)))) - 1;
                int i48 = ~i40;
                int i49 = ~((i48 & iTuitionPaymentFragmentspecialinlinedviewModeldefault2) | (i48 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault2));
                int i50 = (-21) ^ i49;
                Object[] objArr4 = new Object[1];
                a(false, iResolveSizeAndState, i39, i47 + (((i49 & (-21)) | i50) * 301), new char[]{3, '\r', 65502, 65535, 65532, 15, 1, 1, 65535, '\f', 65501, '\t', '\b', '\b', 65535, 65533, 14, 65535, 65534}, objArr4);
                int edgeSlop = 160 - (ViewConfiguration.getEdgeSlop() >> 16);
                int i51 = (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1));
                int i52 = ~i51;
                int i53 = ~((i52 ^ (-18)) | (i52 & (-18)));
                int i54 = ~i;
                int i55 = ~(((-18) ^ i54) | (i54 & (-18)));
                int i56 = (((i51 * (-167)) - 2839) - (~(-(-(((i53 & i55) | (i53 ^ i55)) * 168))))) - 1;
                int i57 = ~i51;
                int i58 = (i57 ^ (-18)) | (i57 & (-18));
                int i59 = -(-((~((i58 & i) | (i58 ^ i))) * 168));
                int i60 = ((i56 | i59) << 1) - (i56 ^ i59);
                int i61 = ~i;
                int i62 = ~((i52 & i61) | (i52 ^ i61));
                int i63 = ~((i57 & 17) | (i57 ^ 17));
                int i64 = (i62 & i63) | (i62 ^ i63);
                int i65 = (i51 & (-18)) | ((-18) ^ i51);
                int i66 = ~((i65 & i) | (i65 ^ i));
                int i67 = -(-(((i66 & i64) | (i64 ^ i66)) * 168));
                int i68 = ((i60 | i67) << 1) - (i67 ^ i60);
                int i69 = (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1));
                int i70 = i69 * 677;
                int i71 = (i70 ^ (-5400)) + ((i70 & (-5400)) << 1);
                int i72 = i69 | i;
                int i73 = i71 + (((i72 & (-9)) | (i72 ^ (-9))) * (-676));
                int i74 = ~(((-9) ^ i69) | ((-9) & i69));
                int i75 = ~((i61 ^ i69) | (i61 & i69));
                int i76 = i73 + (((i74 ^ i75) | (i74 & i75)) * 676);
                int i77 = ~i69;
                int i78 = ~((i77 & (-9)) | (i77 ^ (-9)));
                int i79 = ~((-9) | i61);
                int i80 = (i78 ^ i79) | (i78 & i79);
                int i81 = (i69 & 8) | (i69 ^ 8);
                int i82 = ~((i81 & i) | (i81 ^ i));
                int i83 = i80 ^ i82;
                Object[] objArr5 = new Object[1];
                a(true, edgeSlop, i68, (i76 - (~(((i82 & i80) | i83) * 676))) - 1, new char[]{'\b', 65503, 0, 7, 2, '\r', 2, 65530, 16, 11, 65534, 0, 0, 14, 65531, 65534, 65501, 11}, objArr5);
                String[] strArr2 = {(String) objArr4[0], (String) objArr5[0]};
                int i84 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 61;
                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i84 % 128;
                int i85 = 2;
                int i86 = i84 % 2;
                int i87 = 0;
                while (true) {
                    if (i87 >= i85) {
                        int i88 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                        int i89 = (i88 ^ 77) + ((i88 & 77) << 1);
                        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i89 % 128;
                        int i90 = i89 % 2;
                        i3 = i;
                        break;
                    }
                    String str2 = strArr2[i87];
                    int scrollDefaultDelay = 153 - (ViewConfiguration.getScrollDefaultDelay() >> 16);
                    int iIndexOf = TextUtils.indexOf("", "", i25, i25);
                    int i91 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                    int i92 = (i91 & 99) + (i91 | 99);
                    int i93 = i92 % 128;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i93;
                    int i94 = i92 % 2;
                    int i95 = iIndexOf * 398;
                    int i96 = ((i95 | (-6336)) << 1) - (i95 ^ (-6336));
                    int i97 = ~iIndexOf;
                    int i98 = ~(i97 | i61);
                    int i99 = (i97 ^ 16) | (i97 & 16);
                    int i100 = ~i99;
                    int i101 = (i98 ^ i100) | (i98 & i100);
                    int i102 = ~((i61 ^ 16) | (i61 & 16));
                    int i103 = (i96 - (~(-(-(((i101 ^ i102) | (i101 & i102)) * (-397)))))) - 1;
                    int i104 = i93 + 93;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i104 % 128;
                    if (i104 % 2 == 0) {
                        i22 = i103 % ((-397) >>> (~i99));
                        int i105 = ~iIndexOf;
                        i23 = (i105 & 16) | (i105 ^ 16);
                    } else {
                        int i106 = ~iIndexOf;
                        i22 = i103 + ((~((i106 ^ 16) | (i106 & 16))) * (-397));
                        i23 = (i106 ^ 16) | (i106 & 16);
                    }
                    int i107 = ~i23;
                    int i108 = (i107 & i) | (i ^ i107);
                    int i109 = ~(((-17) & iIndexOf) | ((-17) ^ iIndexOf));
                    int i110 = 397 * ((i108 & i109) | (i108 ^ i109));
                    int i111 = (i22 & i110) + (i22 | i110);
                    int i112 = -MotionEvent.axisFromString("");
                    int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = CropImageView.ZoomImageToPosition.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                    int i113 = i112 * 217;
                    int i114 = (i113 & (-430)) + (i113 | (-430)) + ((~(i112 | iTuitionPaymentFragmentspecialinlinedviewModeldefault3)) * 216);
                    int i115 = (i112 ^ (-3)) | (i112 & (-3));
                    int i116 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                    int i117 = (i116 & 65) + (i116 | 65);
                    TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i117 % 128;
                    if (i117 % 2 != 0) {
                        int i118 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault3;
                        int i119 = i114 >>> ((-216) / (i115 | i118));
                        int i120 = ~(i112 | i118);
                        int i121 = -(216 << ((i120 & 2) | (i120 ^ 2)));
                        Object[] objArr6 = new Object[1];
                        a(false, scrollDefaultDelay, i111, (i119 & i121) + (i121 | i119), new char[]{2, 21, 7, 1, 14, 4, 18, 15, '\t', 4, 65486, 15, 19, 65486, 65508, 5}, objArr6);
                        obj2 = objArr6[0];
                    } else {
                        int i122 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault3;
                        int i123 = -(-(((i115 ^ i122) | (i115 & i122)) * (-216)));
                        int i124 = (i114 & i123) + (i123 | i114);
                        int i125 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault3;
                        int i126 = ~((i112 & i125) | (i125 ^ i112));
                        int i127 = ((i126 & 2) | (i126 ^ 2)) * 216;
                        Object[] objArr7 = new Object[1];
                        a(false, scrollDefaultDelay, i111, (i124 ^ i127) + ((i127 & i124) << 1), new char[]{2, 21, 7, 1, 14, 4, 18, 15, '\t', 4, 65486, 15, 19, 65486, 65508, 5}, objArr7);
                        obj2 = objArr7[0];
                    }
                    Class<?> cls = Class.forName((String) obj2);
                    int i128 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 11;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i128 % 128;
                    if (i128 % 2 != 0) {
                        if (!(!((Boolean) cls.getMethod(str2, new Class[1]).invoke(cls, null)).booleanValue())) {
                            i3 = (~(i & 1)) & (i | 1);
                            CropImageView.ZoomImageToPosition.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                            break;
                        }
                        int i129 = ((i87 | 91) << 1) - (i87 ^ 91);
                        i87 = ((i129 | (-90)) << 1) - (i129 ^ (-90));
                        i25 = 0;
                        i85 = 2;
                    } else {
                        if (((Boolean) cls.getMethod(str2, new Class[0]).invoke(cls, null)).booleanValue()) {
                            i3 = (~(i & 1)) & (i | 1);
                            CropImageView.ZoomImageToPosition.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                            break;
                        }
                        int i1210 = ((i87 | 91) << 1) - (i87 ^ 91);
                        i87 = ((i1210 | (-90)) << 1) - (i1210 ^ (-90));
                        i25 = 0;
                        i85 = 2;
                    }
                }
            } catch (Exception unused) {
                i3 = i ^ 2;
            }
            try {
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(109138771);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    char cNormalizeMetaState = (char) (KeyEvent.normalizeMetaState(0) + 2419);
                    int scrollBarSize = (ViewConfiguration.getScrollBarSize() >> 8) + 2845;
                    int mirror = AndroidCharacter.getMirror('0') - '+';
                    byte b2 = (byte) 0;
                    byte b3 = b2;
                    Object[] objArr8 = new Object[1];
                    c(b2, b3, b3, objArr8);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cNormalizeMetaState, scrollBarSize, mirror, -501222268, false, (String) objArr8[0], new Class[0]);
                }
                long jLongValue = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, null)).longValue();
                long j = 274950379;
                long j2 = 253;
                long j3 = (j2 * j) + (j2 * jLongValue);
                long j4 = -252;
                long j5 = -1;
                long j6 = jLongValue ^ j5;
                long j7 = ((j ^ j5) | j6) ^ j5;
                long startElapsedRealtime = (int) Process.getStartElapsedRealtime();
                long j8 = j6 | (startElapsedRealtime ^ j5);
                long j9 = jLongValue | j;
                long j10 = (j9 | startElapsedRealtime) ^ j5;
                long j11 = j3 + ((j7 | (j8 ^ j5) | j10) * j4) + (j4 * j9) + (((long) 252) * (((j8 | j) ^ j5) | j10)) + ((long) (-1434137065));
                int iElapsedRealtime = (int) SystemClock.elapsedRealtime();
                int i130 = ((int) (j11 >> 32)) & ((((-1320242614) + (((~((-1094242882) | iElapsedRealtime)) | 3179073) * 1504)) + ((~(iElapsedRealtime | (-1091063809))) * (-1504))) - 2023856768);
                int i131 = ~i;
                int i132 = (~((-114741963) | i131)) | 39244426;
                int i133 = ~((-1476470837) | i);
                int i134 = ((int) j11) & ((((i132 | i133) * (-252)) - 137565651) + ((i133 | (~((-75497537) | i131))) * 252));
                int i135 = (i130 & i134) | (i130 ^ i134);
                int i136 = (i135 | 1) & (~(i135 & 1));
                int i137 = (i136 | (-i136)) >> 31;
                int i138 = ((i & (-11)) | (i131 & 10)) & (~i137);
                int i139 = i137 & i;
                int i140 = (i139 & i138) | (i138 ^ i139);
                int i141 = (~(i & i3)) & (i | i3);
                int i142 = (i141 | (-i141)) >> 31;
                int i143 = i140 & (~i142);
                int i144 = i3 & i142;
                int i145 = (i143 ^ i144) | (i144 & i143);
                try {
                    try {
                        int i146 = -(-View.combineMeasuredStates(0, 0));
                        int i147 = ((i146 | 156) << 1) - (i146 ^ 156);
                        int i148 = -(Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1));
                        int iTuitionPaymentFragmentspecialinlinedviewModeldefault4 = CropImageView.ZoomImageToPosition.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                        int i149 = i148 * 592;
                        int i150 = ((i149 | (-24190)) << 1) - (i149 ^ (-24190));
                        int i151 = ~i148;
                        int i152 = i150 + ((~((i151 ^ 41) | (i151 & 41))) * (-1182));
                        int i153 = i151 | (-42);
                        int i154 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault4;
                        int i155 = -(-(((~((i153 & i154) | (i153 ^ i154))) | (~((i148 ^ 41) | (i148 & 41)))) * (-591)));
                        int i156 = ~i148;
                        int i157 = (((i152 ^ i155) + ((i155 & i152) << 1)) - (~((((i156 & iTuitionPaymentFragmentspecialinlinedviewModeldefault4) | (iTuitionPaymentFragmentspecialinlinedviewModeldefault4 ^ i156)) | (-42)) * 591))) - 1;
                        int i158 = -Color.red(0);
                        Object[] objArr9 = new Object[1];
                        a(false, i147, i157, (i158 & 22) + (i158 | 22), new char[]{17, 15, 65534, 0, 6, 11, 4, 65484, 0, 18, 15, 15, 2, 11, 17, 65532, 17, 15, 65534, 0, 2, 15, 65484, 16, 22, 16, 65484, '\b', 2, 15, 11, 2, '\t', 65484, 1, 2, 65535, 18, 4, 65484}, objArr9);
                        File file3 = new File((String) objArr9[0]);
                        if (file3.canRead()) {
                            FileReader fileReader3 = new FileReader(file3);
                            BufferedReader bufferedReader3 = new BufferedReader(fileReader3);
                            try {
                                String line = bufferedReader3.readLine();
                                int i159 = -Color.blue(0);
                                CropImageView.ZoomImageToPosition.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                                int iTuitionPaymentFragmentspecialinlinedviewModeldefault5 = CropImageView.ZoomImageToPosition.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                                int i160 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 53;
                                int i161 = i160 % 128;
                                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i161;
                                int i162 = i160 % 2;
                                int i163 = (i159 * (-1939)) + 163128;
                                int i164 = ~(((-169) ^ i159) | ((-169) & i159));
                                int i165 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault5;
                                int i166 = (i161 & 73) + (i161 | 73);
                                int i167 = i166 % 128;
                                TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i167;
                                if (i166 % 2 != 0) {
                                    int i168 = ~((i165 & 168) | (i165 ^ 168));
                                    int i169 = -(-((i168 & i164) | (i164 ^ i168)));
                                    i17 = i163 >> ((i169 ^ (-970)) + ((i169 & (-970)) << 1));
                                    int i170 = ~i159;
                                    i18 = 1940 >> (~((i170 & 168) | (i170 ^ 168)));
                                } else {
                                    int i171 = ~((i165 & 168) | (i165 ^ 168));
                                    i17 = (((i171 & i164) | (i164 ^ i171)) * (-970)) + i163;
                                    int i172 = ~i159;
                                    i18 = (~((i172 & 168) | (i172 ^ 168))) * 1940;
                                }
                                int i173 = (i17 - (~i18)) - 1;
                                int i174 = ~i159;
                                int i175 = ~((i174 & (-169)) | (i174 ^ (-169)));
                                int i176 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault5;
                                int i177 = i167 + 87;
                                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i177 % 128;
                                if (i177 % 2 == 0) {
                                    int i178 = ~((i176 ^ 168) | (i176 & 168));
                                    i19 = i173 * (970 >>> ((i178 & i175) | (i175 ^ i178)));
                                    int i179 = -KeyEvent.getDeadChar(0, 0);
                                    i20 = (i179 ^ 5) + ((i179 & 5) << 1);
                                    deadChar = KeyEvent.getDeadChar(0, 0);
                                    i21 = 4;
                                } else {
                                    int i180 = ~((i176 ^ 168) | (i176 & 168));
                                    int i181 = ((i180 & i175) | (i175 ^ i180)) * 970;
                                    int i182 = ((i173 | i181) << 1) - (i173 ^ i181);
                                    int i183 = 2 - (~KeyEvent.getDeadChar(0, 0));
                                    i19 = i182;
                                    deadChar = KeyEvent.getDeadChar(0, 0);
                                    i20 = i183;
                                    i21 = 3;
                                }
                                Object[] objArr10 = new Object[1];
                                a(true, i19, i20, (i21 ^ deadChar) + ((i21 & deadChar) << 1), new char[]{1, 0, 65535}, objArr10);
                                if (line.equals((String) objArr10[0])) {
                                    fileReader3.close();
                                    bufferedReader3.close();
                                    int i184 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                                    int i185 = ((i184 | 125) << 1) - (i184 ^ 125);
                                    TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i185 % 128;
                                    int i186 = i185 % 2;
                                } else {
                                    fileReader3.close();
                                    bufferedReader3.close();
                                    str = line;
                                }
                                int i187 = -TextUtils.lastIndexOf("", '0', 0);
                                Object[] objArr11 = new Object[1];
                                a(false, (i187 & 154) + (i187 | 154), 30 - (~(-View.getDefaultSize(0, 0))), (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 15, new char[]{65485, 4, 18, 16, 65535, 1, 3, 65533, 3, '\f', 65535, 0, '\n', 3, 2, 65485, 14, 16, '\r', 1, 65485, 17, 23, 17, 65485, '\t', 3, 16, '\f', 3, '\n'}, objArr11);
                                file = new File((String) objArr11[0]);
                                if (!file.canRead()) {
                                    fileReader = new FileReader(file);
                                    bufferedReader = new BufferedReader(fileReader);
                                    try {
                                        String line2 = bufferedReader.readLine();
                                        int iCombineMeasuredStates = View.combineMeasuredStates(0, 0);
                                        int i188 = (iCombineMeasuredStates * (-495)) - 52470;
                                        int i189 = ~iCombineMeasuredStates;
                                        int i190 = ~((i189 ^ (-107)) | (i189 & (-107)));
                                        int i191 = ~iCombineMeasuredStates;
                                        int i192 = ~((i191 ^ i) | (i191 & i));
                                        int i193 = -(-(((i190 ^ i192) | (i190 & i192)) * 992));
                                        int i194 = ((i188 | i193) << 1) - (i188 ^ i193);
                                        int i195 = ~((i191 ^ (-107)) | (i191 & (-107)));
                                        int i196 = ~(i189 | i);
                                        int i197 = (i195 & i196) | (i195 ^ i196);
                                        int i198 = ~i;
                                        int i199 = (iCombineMeasuredStates & i198) | (i198 ^ iCombineMeasuredStates);
                                        int i200 = ~((i199 & 106) | (i199 ^ 106));
                                        int i201 = ((i194 - (~(((i197 & i200) | (i197 ^ i200)) * (-496)))) - 1) + ((i | 106) * 496);
                                        int i202 = -ImageFormat.getBitsPerPixel(0);
                                        int i203 = -(TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                                        Object[] objArr12 = new Object[1];
                                        a(true, i201, i202, (i203 & 1) + (i203 | 1), new char[]{0}, objArr12);
                                        zEquals = line2.equals((String) objArr12[0]);
                                        fileReader.close();
                                        bufferedReader.close();
                                        if (zEquals) {
                                            int deadChar2 = KeyEvent.getDeadChar(0, 0);
                                            int iTuitionPaymentFragmentspecialinlinedviewModeldefault6 = CropImageView.ZoomImageToPosition.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                                            int i204 = ~deadChar2;
                                            int i205 = ((deadChar2 * 141) - 21545) + (((~(i204 | ModuleDescriptor.MODULE_VERSION)) | (~((i204 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault6) | (i204 & iTuitionPaymentFragmentspecialinlinedviewModeldefault6)))) * (-280));
                                            int i206 = ~deadChar2;
                                            int i207 = ~((i206 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault6) | (i206 & iTuitionPaymentFragmentspecialinlinedviewModeldefault6));
                                            int i208 = ~(((-156) & iTuitionPaymentFragmentspecialinlinedviewModeldefault6) | ((-156) ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault6));
                                            int i209 = ((i207 & i208) | (i207 ^ i208)) * 140;
                                            int i210 = (i205 & i209) + (i205 | i209);
                                            int i211 = (i206 ^ (-156)) | (i206 & (-156));
                                            int i212 = ~((i211 & iTuitionPaymentFragmentspecialinlinedviewModeldefault6) | (i211 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault6));
                                            int i213 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault6;
                                            int i214 = i204 | i213;
                                            int i215 = i212 | (~((i214 & ModuleDescriptor.MODULE_VERSION) | (i214 ^ ModuleDescriptor.MODULE_VERSION)));
                                            int i216 = (i213 & (-156)) | ((-156) ^ i213);
                                            int i217 = ~((i216 & deadChar2) | (i216 ^ deadChar2));
                                            int i218 = i210 + (((i217 & i215) | (i215 ^ i217)) * 140);
                                            int i219 = -View.resolveSize(0, 0);
                                            int i220 = (i219 * (-1965)) + 35424;
                                            int i221 = -(-((i219 | (-37)) * 983));
                                            int i222 = (i220 & i221) + (i220 | i221);
                                            int i223 = ~i219;
                                            int i224 = ~(((-37) & i131) | ((-37) ^ i131));
                                            int i225 = -(-(((i224 & i223) | (i223 ^ i224)) * (-983)));
                                            int i226 = ((i222 | i225) << 1) - (i225 ^ i222);
                                            int i227 = ~i;
                                            int i228 = ~((i223 ^ i227) | (i223 & i227));
                                            int i229 = ~((i223 & 36) | (i223 ^ 36));
                                            int i230 = i226 + (((i229 & i228) | (i228 ^ i229)) * 983);
                                            int threadPriority = Process.getThreadPriority(0);
                                            int i231 = ~(i227 | (-21));
                                            int i232 = ~(((-21) ^ i) | ((-21) & i));
                                            int i233 = (((4720 + (threadPriority * 471)) + (((i231 & threadPriority) | (threadPriority ^ i231)) * (-235))) - (~(-(-(((i232 & threadPriority) | (threadPriority ^ i232)) * (-470)))))) - 1;
                                            int i234 = ~threadPriority;
                                            int i235 = ~((i234 & 20) | (i234 ^ 20));
                                            int i236 = ((-21) & threadPriority) | ((-21) ^ threadPriority);
                                            int i237 = ~((i236 & i) | (i236 ^ i));
                                            int i238 = -(-(((i235 & i237) | (i235 ^ i237)) * 235));
                                            int i239 = -(-((((i233 | i238) << 1) - (i238 ^ i233)) >> 6));
                                            Object[] objArr13 = new Object[1];
                                            a(false, i218, i230, ((i239 | 5) << 1) - (i239 ^ 5), new char[]{'\f', 5, 65533, '\r', '\f', 65485, 17, 23, 17, 65485, '\t', 3, 16, '\f', 3, '\n', 65485, 2, 3, 0, 19, 5, 65485, 18, 16, 65535, 1, 7, '\f', 5, 65485, 18, 16, 65535, 1, 7}, objArr13);
                                            file2 = new File((String) objArr13[0]);
                                            if (!file2.canRead()) {
                                                fileReader2 = new FileReader(file2);
                                                bufferedReader2 = new BufferedReader(fileReader2);
                                                try {
                                                    String line3 = bufferedReader2.readLine();
                                                    int packedPositionGroup2 = ExpandableListView.getPackedPositionGroup(0L);
                                                    int packedPositionType = ExpandableListView.getPackedPositionType(0L) + 1;
                                                    int i240 = -TextUtils.getOffsetAfter("", 0);
                                                    int iTuitionPaymentFragmentspecialinlinedviewModeldefault7 = CropImageView.ZoomImageToPosition.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                                                    int i241 = (i240 * 934) - 932;
                                                    int i242 = ~i240;
                                                    int i243 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault7;
                                                    int i244 = ((-2) | (~((i242 ^ i243) | (i242 & i243)))) * (-933);
                                                    int i245 = (i241 & i244) + (i241 | i244);
                                                    int i246 = ~((i243 & (-2)) | ((-2) ^ i243));
                                                    int i247 = ~((-2) | i240);
                                                    int i248 = ((i246 & i247) | (i246 ^ i247)) * 933;
                                                    int i249 = ((i245 | i248) << 1) - (i245 ^ i248);
                                                    int i250 = -(-((~(i240 | 1)) * 933));
                                                    Object[] objArr14 = new Object[1];
                                                    a(true, ((packedPositionGroup2 | 106) << 1) - (packedPositionGroup2 ^ 106), packedPositionType, (i249 & i250) + (i250 | i249), new char[]{0}, objArr14);
                                                    zEquals2 = line3.equals((String) objArr14[0]);
                                                    fileReader2.close();
                                                    bufferedReader2.close();
                                                    if (!zEquals2 && str != null) {
                                                        int i251 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                                                        int i252 = (i251 & 13) + (i251 | 13);
                                                        int i253 = i252 % 128;
                                                        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i253;
                                                        int i254 = i252 % 2;
                                                        int i255 = (i253 & 95) + (i253 | 95);
                                                        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i255 % 128;
                                                        int i256 = i255 % 2;
                                                        objArr = new Object[]{new int[]{(i & (-21)) | (i131 & 20)}, new String[]{str}};
                                                    }
                                                } catch (Throwable th) {
                                                    fileReader2.close();
                                                    bufferedReader2.close();
                                                    throw th;
                                                }
                                            }
                                        }
                                        obj = objArr[0];
                                        i4 = ((int[]) obj)[0];
                                        int i257 = i ^ i145;
                                        int i258 = -i257;
                                        i5 = ((i257 & i258) | (i257 ^ i258)) >> 31;
                                        i6 = (~i5) & i4;
                                        i7 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 25;
                                        int i259 = i7 % 128;
                                        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i259;
                                        if (i7 % 2 != 0) {
                                            int i260 = i145 & i5;
                                            i11 = (i260 & i6) | (i6 ^ i260);
                                            strArr = (String[]) obj;
                                            objArr2 = new Object[3];
                                            int i261 = ((~i4) & i) | (i4 & i131);
                                            int i262 = -i261;
                                            i10 = (~(((i261 & i262) | (i261 ^ i262)) / 85)) & 1;
                                            i8 = 31;
                                            i9 = 0;
                                        } else {
                                            int i263 = i145 & i5;
                                            int i264 = (i263 & i6) | (i6 ^ i263);
                                            strArr = (String[]) objArr[1];
                                            int i265 = i ^ i4;
                                            int i266 = -i265;
                                            int i267 = (i265 & i266) | (i265 ^ i266);
                                            i8 = 31;
                                            i9 = (i267 >> 31) & 1;
                                            i10 = 0;
                                            objArr2 = new Object[2];
                                            i11 = i264;
                                        }
                                        int i268 = i10 | i9;
                                        int i269 = -i268;
                                        int i270 = (~(((i269 & i268) | (i268 ^ i269)) >> i8)) & 1;
                                        objArr2[i268] = null;
                                        objArr2[i270] = strArr;
                                        String[] strArr3 = (String[]) objArr2[0];
                                        objArr3 = new Object[4];
                                        i12 = ((i259 | 31) << 1) - (i259 ^ 31);
                                        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i12 % 128;
                                        if (i12 % 2 == 0) {
                                            objArr3[0] = new int[1];
                                            objArr3[1] = new int[1];
                                            objArr3[2] = new int[0];
                                            int i271 = ((~i11) & i) | (i11 & i131);
                                            int i272 = -i271;
                                            i13 = (((i271 & i272) | (i271 ^ i272)) * 58) & 13;
                                        } else {
                                            objArr3[0] = new int[1];
                                            objArr3[1] = new int[1];
                                            objArr3[2] = new int[1];
                                            int i273 = ((~i11) & i) | (i11 & i131);
                                            int i274 = -i273;
                                            i13 = (((i273 & i274) | (i273 ^ i274)) >> 31) & 16;
                                        }
                                        ((int[]) objArr3[0])[0] = i;
                                        ((int[]) objArr3[2])[0] = i11;
                                        int i275 = i259 + 71;
                                        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i275 % 128;
                                        int i276 = i275 % 2;
                                        objArr3[3] = strArr3;
                                        int elapsedCpuTime = (int) Process.getElapsedCpuTime();
                                        int i277 = ~elapsedCpuTime;
                                        i14 = ((((~(969465924 | i277)) | (~(elapsedCpuTime | 1009776153))) * 959) - 242080843) + (((~(elapsedCpuTime | 969465924)) | (~(i277 | 1009776153))) * 959);
                                        int i278 = ((i13 * 477) - (~(i14 * (-475)))) - 1;
                                        int i279 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 125;
                                        int i280 = i279 % 128;
                                        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i280;
                                        int i281 = i279 % 2;
                                        int i282 = ~i13;
                                        int i283 = ~((i282 & i14) | (i282 ^ i14));
                                        int i284 = ~i14;
                                        int i285 = (i284 & i13) | (i284 ^ i13);
                                        int i286 = ~((i285 ^ i) | (i285 & i));
                                        int i287 = (i278 - (~((-476) * ((i283 & i286) | (i283 ^ i286))))) - 1;
                                        int i288 = (~(i285 | i)) * 952;
                                        i15 = (i287 & i288) + (i287 | i288);
                                        i16 = ((i280 | 11) << 1) - (i280 ^ 11);
                                        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i16 % 128;
                                        if (i16 % 2 != 0) {
                                            int i289 = -(-(~((~i14) | (~i) | i13)));
                                            int i290 = -(i15 % ((i289 & 476) + (i289 | 476)));
                                            int i291 = (i2 & i290) + (i2 | i290);
                                            int i292 = i291 / 63;
                                            int i293 = (i292 & (~i291)) | ((~i292) & i291);
                                            int i294 = i293 >>> 88;
                                            int i295 = ((~i293) & i294) | ((~i294) & i293);
                                            ((int[]) objArr3[0])[0] = i295 ^ (i295 % 4);
                                            return objArr3;
                                        }
                                        int i296 = (~i14) | i131;
                                        int i297 = i2 + ((i15 - (~((~((i296 & i13) | (i296 ^ i13))) * 476))) - 1);
                                        int i298 = i297 << 13;
                                        int i299 = ((~i297) & i298) | ((~i298) & i297);
                                        int i300 = i299 >>> 17;
                                        int i301 = ((~i299) & i300) | ((~i300) & i299);
                                        int i302 = i301 << 5;
                                        ((int[]) objArr3[1])[0] = ((~i301) & i302) | ((~i302) & i301);
                                        return objArr3;
                                    } catch (Throwable th2) {
                                        fileReader.close();
                                        bufferedReader.close();
                                        throw th2;
                                    }
                                }
                                int i303 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 47;
                                TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i303 % 128;
                                int i304 = i303 % 2;
                                objArr = new Object[]{new int[]{i}, new String[0]};
                                int i305 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 67;
                                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i305 % 128;
                                int i306 = i305 % 2;
                                obj = objArr[0];
                                i4 = ((int[]) obj)[0];
                                int i2510 = i ^ i145;
                                int i2511 = -i2510;
                                i5 = ((i2510 & i2511) | (i2510 ^ i2511)) >> 31;
                                i6 = (~i5) & i4;
                                i7 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 25;
                                int i2512 = i7 % 128;
                                TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2512;
                                if (i7 % 2 != 0) {
                                    int i2610 = i145 & i5;
                                    i11 = (i2610 & i6) | (i6 ^ i2610);
                                    strArr = (String[]) obj;
                                    objArr2 = new Object[3];
                                    int i2611 = ((~i4) & i) | (i4 & i131);
                                    int i2612 = -i2611;
                                    i10 = (~(((i2611 & i2612) | (i2611 ^ i2612)) / 85)) & 1;
                                    i8 = 31;
                                    i9 = 0;
                                } else {
                                    int i2613 = i145 & i5;
                                    int i2614 = (i2613 & i6) | (i6 ^ i2613);
                                    strArr = (String[]) objArr[1];
                                    int i2615 = i ^ i4;
                                    int i2616 = -i2615;
                                    int i2617 = (i2615 & i2616) | (i2615 ^ i2616);
                                    i8 = 31;
                                    i9 = (i2617 >> 31) & 1;
                                    i10 = 0;
                                    objArr2 = new Object[2];
                                    i11 = i2614;
                                }
                                int i2618 = i10 | i9;
                                int i2619 = -i2618;
                                int i2710 = (~(((i2619 & i2618) | (i2618 ^ i2619)) >> i8)) & 1;
                                objArr2[i2618] = null;
                                objArr2[i2710] = strArr;
                                String[] strArr4 = (String[]) objArr2[0];
                                objArr3 = new Object[4];
                                i12 = ((i2512 | 31) << 1) - (i2512 ^ 31);
                                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i12 % 128;
                                if (i12 % 2 == 0) {
                                    objArr3[0] = new int[1];
                                    objArr3[1] = new int[1];
                                    objArr3[2] = new int[0];
                                    int i2711 = ((~i11) & i) | (i11 & i131);
                                    int i2712 = -i2711;
                                    i13 = (((i2711 & i2712) | (i2711 ^ i2712)) * 58) & 13;
                                } else {
                                    objArr3[0] = new int[1];
                                    objArr3[1] = new int[1];
                                    objArr3[2] = new int[1];
                                    int i2713 = ((~i11) & i) | (i11 & i131);
                                    int i2714 = -i2713;
                                    i13 = (((i2713 & i2714) | (i2713 ^ i2714)) >> 31) & 16;
                                }
                                ((int[]) objArr3[0])[0] = i;
                                ((int[]) objArr3[2])[0] = i11;
                                int i2715 = i2512 + 71;
                                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2715 % 128;
                                int i2716 = i2715 % 2;
                                objArr3[3] = strArr4;
                                int elapsedCpuTime2 = (int) Process.getElapsedCpuTime();
                                int i2717 = ~elapsedCpuTime2;
                                i14 = ((((~(969465924 | i2717)) | (~(elapsedCpuTime2 | 1009776153))) * 959) - 242080843) + (((~(elapsedCpuTime2 | 969465924)) | (~(i2717 | 1009776153))) * 959);
                                int i2718 = ((i13 * 477) - (~(i14 * (-475)))) - 1;
                                int i2719 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 125;
                                int i2810 = i2719 % 128;
                                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2810;
                                int i2811 = i2719 % 2;
                                int i2812 = ~i13;
                                int i2813 = ~((i2812 & i14) | (i2812 ^ i14));
                                int i2814 = ~i14;
                                int i2815 = (i2814 & i13) | (i2814 ^ i13);
                                int i2816 = ~((i2815 ^ i) | (i2815 & i));
                                int i2817 = (i2718 - (~((-476) * ((i2813 & i2816) | (i2813 ^ i2816))))) - 1;
                                int i2818 = (~(i2815 | i)) * 952;
                                i15 = (i2817 & i2818) + (i2817 | i2818);
                                i16 = ((i2810 | 11) << 1) - (i2810 ^ 11);
                                TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i16 % 128;
                                if (i16 % 2 != 0) {
                                    int i2819 = -(-(~((~i14) | (~i) | i13)));
                                    int i2910 = -(i15 % ((i2819 & 476) + (i2819 | 476)));
                                    int i2911 = (i2 & i2910) + (i2 | i2910);
                                    int i2912 = i2911 / 63;
                                    int i2913 = (i2912 & (~i2911)) | ((~i2912) & i2911);
                                    int i2914 = i2913 >>> 88;
                                    int i2915 = ((~i2913) & i2914) | ((~i2914) & i2913);
                                    ((int[]) objArr3[0])[0] = i2915 ^ (i2915 % 4);
                                    return objArr3;
                                }
                                int i2916 = (~i14) | i131;
                                int i2917 = i2 + ((i15 - (~((~((i2916 & i13) | (i2916 ^ i13))) * 476))) - 1);
                                int i2918 = i2917 << 13;
                                int i2919 = ((~i2917) & i2918) | ((~i2918) & i2917);
                                int i307 = i2919 >>> 17;
                                int i308 = ((~i2919) & i307) | ((~i307) & i2919);
                                int i309 = i308 << 5;
                                ((int[]) objArr3[1])[0] = ((~i308) & i309) | ((~i309) & i308);
                                return objArr3;
                            } catch (Throwable th3) {
                                fileReader3.close();
                                bufferedReader3.close();
                                throw th3;
                            }
                        }
                        int i310 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                        int i311 = (i310 & 55) + (i310 | 55);
                        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i311 % 128;
                        if (i311 % 2 == 0) {
                            throw null;
                        }
                    } catch (Exception unused2) {
                    }
                    int i1810 = -TextUtils.lastIndexOf("", '0', 0);
                    Object[] objArr15 = new Object[1];
                    a(false, (i1810 & 154) + (i1810 | 154), 30 - (~(-View.getDefaultSize(0, 0))), (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 15, new char[]{65485, 4, 18, 16, 65535, 1, 3, 65533, 3, '\f', 65535, 0, '\n', 3, 2, 65485, 14, 16, '\r', 1, 65485, 17, 23, 17, 65485, '\t', 3, 16, '\f', 3, '\n'}, objArr15);
                    file = new File((String) objArr15[0]);
                    if (!file.canRead()) {
                        fileReader = new FileReader(file);
                        bufferedReader = new BufferedReader(fileReader);
                        String line4 = bufferedReader.readLine();
                        int iCombineMeasuredStates2 = View.combineMeasuredStates(0, 0);
                        int i1811 = (iCombineMeasuredStates2 * (-495)) - 52470;
                        int i1812 = ~iCombineMeasuredStates2;
                        int i1910 = ~((i1812 ^ (-107)) | (i1812 & (-107)));
                        int i1911 = ~iCombineMeasuredStates2;
                        int i1912 = ~((i1911 ^ i) | (i1911 & i));
                        int i1913 = -(-(((i1910 ^ i1912) | (i1910 & i1912)) * 992));
                        int i1914 = ((i1811 | i1913) << 1) - (i1811 ^ i1913);
                        int i1915 = ~((i1911 ^ (-107)) | (i1911 & (-107)));
                        int i1916 = ~(i1812 | i);
                        int i1917 = (i1915 & i1916) | (i1915 ^ i1916);
                        int i1918 = ~i;
                        int i1919 = (iCombineMeasuredStates2 & i1918) | (i1918 ^ iCombineMeasuredStates2);
                        int i2010 = ~((i1919 & 106) | (i1919 ^ 106));
                        int i2011 = ((i1914 - (~(((i1917 & i2010) | (i1917 ^ i2010)) * (-496)))) - 1) + ((i | 106) * 496);
                        int i2012 = -ImageFormat.getBitsPerPixel(0);
                        int i2013 = -(TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                        Object[] objArr16 = new Object[1];
                        a(true, i2011, i2012, (i2013 & 1) + (i2013 | 1), new char[]{0}, objArr16);
                        zEquals = line4.equals((String) objArr16[0]);
                        fileReader.close();
                        bufferedReader.close();
                        if (zEquals) {
                            int deadChar3 = KeyEvent.getDeadChar(0, 0);
                            int iTuitionPaymentFragmentspecialinlinedviewModeldefault8 = CropImageView.ZoomImageToPosition.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                            int i2014 = ~deadChar3;
                            int i2015 = ((deadChar3 * 141) - 21545) + (((~(i2014 | ModuleDescriptor.MODULE_VERSION)) | (~((i2014 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault8) | (i2014 & iTuitionPaymentFragmentspecialinlinedviewModeldefault8)))) * (-280));
                            int i2016 = ~deadChar3;
                            int i2017 = ~((i2016 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault8) | (i2016 & iTuitionPaymentFragmentspecialinlinedviewModeldefault8));
                            int i2018 = ~(((-156) & iTuitionPaymentFragmentspecialinlinedviewModeldefault8) | ((-156) ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault8));
                            int i2019 = ((i2017 & i2018) | (i2017 ^ i2018)) * 140;
                            int i2110 = (i2015 & i2019) + (i2015 | i2019);
                            int i2111 = (i2016 ^ (-156)) | (i2016 & (-156));
                            int i2112 = ~((i2111 & iTuitionPaymentFragmentspecialinlinedviewModeldefault8) | (i2111 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault8));
                            int i2113 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault8;
                            int i2114 = i2014 | i2113;
                            int i2115 = i2112 | (~((i2114 & ModuleDescriptor.MODULE_VERSION) | (i2114 ^ ModuleDescriptor.MODULE_VERSION)));
                            int i2116 = (i2113 & (-156)) | ((-156) ^ i2113);
                            int i2117 = ~((i2116 & deadChar3) | (i2116 ^ deadChar3));
                            int i2118 = i2110 + (((i2117 & i2115) | (i2115 ^ i2117)) * 140);
                            int i2119 = -View.resolveSize(0, 0);
                            int i2210 = (i2119 * (-1965)) + 35424;
                            int i2211 = -(-((i2119 | (-37)) * 983));
                            int i2212 = (i2210 & i2211) + (i2210 | i2211);
                            int i2213 = ~i2119;
                            int i2214 = ~(((-37) & i131) | ((-37) ^ i131));
                            int i2215 = -(-(((i2214 & i2213) | (i2213 ^ i2214)) * (-983)));
                            int i2216 = ((i2212 | i2215) << 1) - (i2215 ^ i2212);
                            int i2217 = ~i;
                            int i2218 = ~((i2213 ^ i2217) | (i2213 & i2217));
                            int i2219 = ~((i2213 & 36) | (i2213 ^ 36));
                            int i2310 = i2216 + (((i2219 & i2218) | (i2218 ^ i2219)) * 983);
                            int threadPriority2 = Process.getThreadPriority(0);
                            int i2311 = ~(i2217 | (-21));
                            int i2312 = ~(((-21) ^ i) | ((-21) & i));
                            int i2313 = (((4720 + (threadPriority2 * 471)) + (((i2311 & threadPriority2) | (threadPriority2 ^ i2311)) * (-235))) - (~(-(-(((i2312 & threadPriority2) | (threadPriority2 ^ i2312)) * (-470)))))) - 1;
                            int i2314 = ~threadPriority2;
                            int i2315 = ~((i2314 & 20) | (i2314 ^ 20));
                            int i2316 = ((-21) & threadPriority2) | ((-21) ^ threadPriority2);
                            int i2317 = ~((i2316 & i) | (i2316 ^ i));
                            int i2318 = -(-(((i2315 & i2317) | (i2315 ^ i2317)) * 235));
                            int i2319 = -(-((((i2313 | i2318) << 1) - (i2318 ^ i2313)) >> 6));
                            Object[] objArr17 = new Object[1];
                            a(false, i2118, i2310, ((i2319 | 5) << 1) - (i2319 ^ 5), new char[]{'\f', 5, 65533, '\r', '\f', 65485, 17, 23, 17, 65485, '\t', 3, 16, '\f', 3, '\n', 65485, 2, 3, 0, 19, 5, 65485, 18, 16, 65535, 1, 7, '\f', 5, 65485, 18, 16, 65535, 1, 7}, objArr17);
                            file2 = new File((String) objArr17[0]);
                            if (!file2.canRead()) {
                                fileReader2 = new FileReader(file2);
                                bufferedReader2 = new BufferedReader(fileReader2);
                                String line5 = bufferedReader2.readLine();
                                int packedPositionGroup3 = ExpandableListView.getPackedPositionGroup(0L);
                                int packedPositionType2 = ExpandableListView.getPackedPositionType(0L) + 1;
                                int i2410 = -TextUtils.getOffsetAfter("", 0);
                                int iTuitionPaymentFragmentspecialinlinedviewModeldefault9 = CropImageView.ZoomImageToPosition.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                                int i2411 = (i2410 * 934) - 932;
                                int i2412 = ~i2410;
                                int i2413 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault9;
                                int i2414 = ((-2) | (~((i2412 ^ i2413) | (i2412 & i2413)))) * (-933);
                                int i2415 = (i2411 & i2414) + (i2411 | i2414);
                                int i2416 = ~((i2413 & (-2)) | ((-2) ^ i2413));
                                int i2417 = ~((-2) | i2410);
                                int i2418 = ((i2416 & i2417) | (i2416 ^ i2417)) * 933;
                                int i2419 = ((i2415 | i2418) << 1) - (i2415 ^ i2418);
                                int i2513 = -(-((~(i2410 | 1)) * 933));
                                Object[] objArr18 = new Object[1];
                                a(true, ((packedPositionGroup3 | 106) << 1) - (packedPositionGroup3 ^ 106), packedPositionType2, (i2419 & i2513) + (i2513 | i2419), new char[]{0}, objArr18);
                                zEquals2 = line5.equals((String) objArr18[0]);
                                fileReader2.close();
                                bufferedReader2.close();
                                if (!zEquals2) {
                                }
                            }
                        }
                        obj = objArr[0];
                        i4 = ((int[]) obj)[0];
                        int i2514 = i ^ i145;
                        int i2515 = -i2514;
                        i5 = ((i2514 & i2515) | (i2514 ^ i2515)) >> 31;
                        i6 = (~i5) & i4;
                        i7 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 25;
                        int i2516 = i7 % 128;
                        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2516;
                        if (i7 % 2 != 0) {
                            int i26110 = i145 & i5;
                            i11 = (i26110 & i6) | (i6 ^ i26110);
                            strArr = (String[]) obj;
                            objArr2 = new Object[3];
                            int i26111 = ((~i4) & i) | (i4 & i131);
                            int i26112 = -i26111;
                            i10 = (~(((i26111 & i26112) | (i26111 ^ i26112)) / 85)) & 1;
                            i8 = 31;
                            i9 = 0;
                        } else {
                            int i26113 = i145 & i5;
                            int i26114 = (i26113 & i6) | (i6 ^ i26113);
                            strArr = (String[]) objArr[1];
                            int i26115 = i ^ i4;
                            int i26116 = -i26115;
                            int i26117 = (i26115 & i26116) | (i26115 ^ i26116);
                            i8 = 31;
                            i9 = (i26117 >> 31) & 1;
                            i10 = 0;
                            objArr2 = new Object[2];
                            i11 = i26114;
                        }
                        int i26118 = i10 | i9;
                        int i26119 = -i26118;
                        int i27110 = (~(((i26119 & i26118) | (i26118 ^ i26119)) >> i8)) & 1;
                        objArr2[i26118] = null;
                        objArr2[i27110] = strArr;
                        String[] strArr5 = (String[]) objArr2[0];
                        objArr3 = new Object[4];
                        i12 = ((i2516 | 31) << 1) - (i2516 ^ 31);
                        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i12 % 128;
                        if (i12 % 2 == 0) {
                            objArr3[0] = new int[1];
                            objArr3[1] = new int[1];
                            objArr3[2] = new int[0];
                            int i27111 = ((~i11) & i) | (i11 & i131);
                            int i27112 = -i27111;
                            i13 = (((i27111 & i27112) | (i27111 ^ i27112)) * 58) & 13;
                        } else {
                            objArr3[0] = new int[1];
                            objArr3[1] = new int[1];
                            objArr3[2] = new int[1];
                            int i27113 = ((~i11) & i) | (i11 & i131);
                            int i27114 = -i27113;
                            i13 = (((i27113 & i27114) | (i27113 ^ i27114)) >> 31) & 16;
                        }
                        ((int[]) objArr3[0])[0] = i;
                        ((int[]) objArr3[2])[0] = i11;
                        int i27115 = i2516 + 71;
                        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i27115 % 128;
                        int i27116 = i27115 % 2;
                        objArr3[3] = strArr5;
                        int elapsedCpuTime3 = (int) Process.getElapsedCpuTime();
                        int i27117 = ~elapsedCpuTime3;
                        i14 = ((((~(969465924 | i27117)) | (~(elapsedCpuTime3 | 1009776153))) * 959) - 242080843) + (((~(elapsedCpuTime3 | 969465924)) | (~(i27117 | 1009776153))) * 959);
                        int i27118 = ((i13 * 477) - (~(i14 * (-475)))) - 1;
                        int i27119 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 125;
                        int i28110 = i27119 % 128;
                        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i28110;
                        int i28111 = i27119 % 2;
                        int i28112 = ~i13;
                        int i28113 = ~((i28112 & i14) | (i28112 ^ i14));
                        int i28114 = ~i14;
                        int i28115 = (i28114 & i13) | (i28114 ^ i13);
                        int i28116 = ~((i28115 ^ i) | (i28115 & i));
                        int i28117 = (i27118 - (~((-476) * ((i28113 & i28116) | (i28113 ^ i28116))))) - 1;
                        int i28118 = (~(i28115 | i)) * 952;
                        i15 = (i28117 & i28118) + (i28117 | i28118);
                        i16 = ((i28110 | 11) << 1) - (i28110 ^ 11);
                        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i16 % 128;
                        if (i16 % 2 != 0) {
                            int i28119 = -(-(~((~i14) | (~i) | i13)));
                            int i29110 = -(i15 % ((i28119 & 476) + (i28119 | 476)));
                            int i29111 = (i2 & i29110) + (i2 | i29110);
                            int i29112 = i29111 / 63;
                            int i29113 = (i29112 & (~i29111)) | ((~i29112) & i29111);
                            int i29114 = i29113 >>> 88;
                            int i29115 = ((~i29113) & i29114) | ((~i29114) & i29113);
                            ((int[]) objArr3[0])[0] = i29115 ^ (i29115 % 4);
                            return objArr3;
                        }
                        int i29116 = (~i14) | i131;
                        int i29117 = i2 + ((i15 - (~((~((i29116 & i13) | (i29116 ^ i13))) * 476))) - 1);
                        int i29118 = i29117 << 13;
                        int i29119 = ((~i29117) & i29118) | ((~i29118) & i29117);
                        int i3010 = i29119 >>> 17;
                        int i3011 = ((~i29119) & i3010) | ((~i3010) & i29119);
                        int i3012 = i3011 << 5;
                        ((int[]) objArr3[1])[0] = ((~i3011) & i3012) | ((~i3012) & i3011);
                        return objArr3;
                    }
                    int i3013 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 47;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i3013 % 128;
                    int i3014 = i3013 % 2;
                } catch (Exception unused3) {
                }
                str = null;
                objArr = new Object[]{new int[]{i}, new String[0]};
                int i3015 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 67;
                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3015 % 128;
                int i3016 = i3015 % 2;
                obj = objArr[0];
                i4 = ((int[]) obj)[0];
                int i2517 = i ^ i145;
                int i2518 = -i2517;
                i5 = ((i2517 & i2518) | (i2517 ^ i2518)) >> 31;
                i6 = (~i5) & i4;
                i7 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 25;
                int i2519 = i7 % 128;
                TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2519;
                if (i7 % 2 != 0) {
                    int i261110 = i145 & i5;
                    i11 = (i261110 & i6) | (i6 ^ i261110);
                    strArr = (String[]) obj;
                    objArr2 = new Object[3];
                    int i261111 = ((~i4) & i) | (i4 & i131);
                    int i261112 = -i261111;
                    i10 = (~(((i261111 & i261112) | (i261111 ^ i261112)) / 85)) & 1;
                    i8 = 31;
                    i9 = 0;
                } else {
                    int i261113 = i145 & i5;
                    int i261114 = (i261113 & i6) | (i6 ^ i261113);
                    strArr = (String[]) objArr[1];
                    int i261115 = i ^ i4;
                    int i261116 = -i261115;
                    int i261117 = (i261115 & i261116) | (i261115 ^ i261116);
                    i8 = 31;
                    i9 = (i261117 >> 31) & 1;
                    i10 = 0;
                    objArr2 = new Object[2];
                    i11 = i261114;
                }
                int i261118 = i10 | i9;
                int i261119 = -i261118;
                int i271110 = (~(((i261119 & i261118) | (i261118 ^ i261119)) >> i8)) & 1;
                objArr2[i261118] = null;
                objArr2[i271110] = strArr;
                String[] strArr6 = (String[]) objArr2[0];
                objArr3 = new Object[4];
                i12 = ((i2519 | 31) << 1) - (i2519 ^ 31);
                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i12 % 128;
                if (i12 % 2 == 0) {
                    objArr3[0] = new int[1];
                    objArr3[1] = new int[1];
                    objArr3[2] = new int[0];
                    int i271111 = ((~i11) & i) | (i11 & i131);
                    int i271112 = -i271111;
                    i13 = (((i271111 & i271112) | (i271111 ^ i271112)) * 58) & 13;
                } else {
                    objArr3[0] = new int[1];
                    objArr3[1] = new int[1];
                    objArr3[2] = new int[1];
                    int i271113 = ((~i11) & i) | (i11 & i131);
                    int i271114 = -i271113;
                    i13 = (((i271113 & i271114) | (i271113 ^ i271114)) >> 31) & 16;
                }
                ((int[]) objArr3[0])[0] = i;
                ((int[]) objArr3[2])[0] = i11;
                int i271115 = i2519 + 71;
                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i271115 % 128;
                int i271116 = i271115 % 2;
                objArr3[3] = strArr6;
                int elapsedCpuTime4 = (int) Process.getElapsedCpuTime();
                int i271117 = ~elapsedCpuTime4;
                i14 = ((((~(969465924 | i271117)) | (~(elapsedCpuTime4 | 1009776153))) * 959) - 242080843) + (((~(elapsedCpuTime4 | 969465924)) | (~(i271117 | 1009776153))) * 959);
                int i271118 = ((i13 * 477) - (~(i14 * (-475)))) - 1;
                int i271119 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 125;
                int i281110 = i271119 % 128;
                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i281110;
                int i281111 = i271119 % 2;
                int i281112 = ~i13;
                int i281113 = ~((i281112 & i14) | (i281112 ^ i14));
                int i281114 = ~i14;
                int i281115 = (i281114 & i13) | (i281114 ^ i13);
                int i281116 = ~((i281115 ^ i) | (i281115 & i));
                int i281117 = (i271118 - (~((-476) * ((i281113 & i281116) | (i281113 ^ i281116))))) - 1;
                int i281118 = (~(i281115 | i)) * 952;
                i15 = (i281117 & i281118) + (i281117 | i281118);
                i16 = ((i281110 | 11) << 1) - (i281110 ^ 11);
                TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i16 % 128;
                if (i16 % 2 != 0) {
                    int i281119 = -(-(~((~i14) | (~i) | i13)));
                    int i291110 = -(i15 % ((i281119 & 476) + (i281119 | 476)));
                    int i291111 = (i2 & i291110) + (i2 | i291110);
                    int i291112 = i291111 / 63;
                    int i291113 = (i291112 & (~i291111)) | ((~i291112) & i291111);
                    int i291114 = i291113 >>> 88;
                    int i291115 = ((~i291113) & i291114) | ((~i291114) & i291113);
                    ((int[]) objArr3[0])[0] = i291115 ^ (i291115 % 4);
                    return objArr3;
                }
                int i291116 = (~i14) | i131;
                int i291117 = i2 + ((i15 - (~((~((i291116 & i13) | (i291116 ^ i13))) * 476))) - 1);
                int i291118 = i291117 << 13;
                int i291119 = ((~i291117) & i291118) | ((~i291118) & i291117);
                int i3017 = i291119 >>> 17;
                int i3018 = ((~i291119) & i3017) | ((~i3017) & i291119);
                int i3019 = i3018 << 5;
                ((int[]) objArr3[1])[0] = ((~i3018) & i3019) | ((~i3019) & i3018);
                return objArr3;
            } catch (Throwable th4) {
                Throwable cause = th4.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th4;
            }
        }

        /* JADX WARN: Code duplicated, block: B:10:0x0025  */
        /* JADX WARN: Code duplicated, block: B:8:0x001f  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002b). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0025
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        private static java.lang.String $$e(short r7, byte r8, short r9) {
            /*
                int r9 = r9 * 2
                int r9 = 3 - r9
                byte[] r0 = com.google.android.material.snackbar.Snackbar.Callback.$$c
                int r7 = r7 + 119
                int r8 = r8 * 3
                int r8 = 1 - r8
                byte[] r1 = new byte[r8]
                r2 = 0
                if (r0 != 0) goto L15
                r3 = r9
                r4 = r2
                r9 = r8
                goto L2b
            L15:
                r3 = r2
            L16:
                int r4 = r3 + 1
                byte r5 = (byte) r7
                int r9 = r9 + 1
                r1[r3] = r5
                if (r4 != r8) goto L25
                java.lang.String r7 = new java.lang.String
                r7.<init>(r1, r2)
                return r7
            L25:
                r3 = r0[r9]
                r6 = r9
                r9 = r7
                r7 = r3
                r3 = r6
            L2b:
                int r7 = -r7
                int r7 = r7 + r9
                r9 = r3
                r3 = r4
                goto L16
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.snackbar.Snackbar.Callback.$$e(short, byte, short):java.lang.String");
        }
    }

    private Snackbar(Context context, ViewGroup viewGroup, View view, ContentViewCallback contentViewCallback) {
        super(context, viewGroup, view, contentViewCallback);
        this.accessibilityManager = (AccessibilityManager) viewGroup.getContext().getSystemService("accessibility");
    }

    @Override // com.google.android.material.snackbar.BaseTransientBottomBar
    public void show() {
        super.show();
    }

    @Override // com.google.android.material.snackbar.BaseTransientBottomBar
    public void dismiss() {
        super.dismiss();
    }

    @Override // com.google.android.material.snackbar.BaseTransientBottomBar
    public boolean isShown() {
        return super.isShown();
    }

    public static Snackbar make(View view, CharSequence charSequence, int i) {
        return makeInternal(null, view, charSequence, i);
    }

    public static Snackbar make(Context context, View view, CharSequence charSequence, int i) {
        return makeInternal(context, view, charSequence, i);
    }

    private static Snackbar makeInternal(Context context, View view, CharSequence charSequence, int i) {
        int i2;
        ViewGroup viewGroupFindSuitableParent = findSuitableParent(view);
        if (viewGroupFindSuitableParent == null) {
            throw new IllegalArgumentException("No suitable parent found from the given view. Please provide a valid view.");
        }
        if (context == null) {
            context = viewGroupFindSuitableParent.getContext();
        }
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
        if (hasSnackbarContentStyleAttrs(context)) {
            i2 = R.layout.mtrl_layout_snackbar_include;
        } else {
            i2 = R.layout.design_layout_snackbar_include;
        }
        SnackbarContentLayout snackbarContentLayout = (SnackbarContentLayout) layoutInflaterFrom.inflate(i2, viewGroupFindSuitableParent, false);
        Snackbar snackbar = new Snackbar(context, viewGroupFindSuitableParent, snackbarContentLayout, snackbarContentLayout);
        snackbar.setText(charSequence);
        snackbar.setDuration(i);
        return snackbar;
    }

    @Deprecated
    protected static boolean hasSnackbarButtonStyleAttr(Context context) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(SNACKBAR_BUTTON_STYLE_ATTR);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, -1);
        typedArrayObtainStyledAttributes.recycle();
        return resourceId != -1;
    }

    private static boolean hasSnackbarContentStyleAttrs(Context context) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(SNACKBAR_CONTENT_STYLE_ATTRS);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, -1);
        int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(1, -1);
        typedArrayObtainStyledAttributes.recycle();
        return (resourceId == -1 || resourceId2 == -1) ? false : true;
    }

    public static Snackbar make(View view, int i, int i2) {
        return make(view, view.getResources().getText(i), i2);
    }

    private static ViewGroup findSuitableParent(View view) {
        ViewGroup viewGroup = null;
        while (!(view instanceof CoordinatorLayout)) {
            if (view instanceof FrameLayout) {
                if (view.getId() == 16908290) {
                    return (ViewGroup) view;
                }
                viewGroup = (ViewGroup) view;
            }
            if (view != null) {
                Object parent = view.getParent();
                view = parent instanceof View ? (View) parent : null;
            }
            if (view == null) {
                return viewGroup;
            }
        }
        return (ViewGroup) view;
    }

    public Snackbar setText(CharSequence charSequence) {
        getMessageView().setText(charSequence);
        return this;
    }

    public Snackbar setText(int i) {
        return setText(getContext().getText(i));
    }

    public Snackbar setAction(int i, View.OnClickListener onClickListener) {
        return setAction(getContext().getText(i), onClickListener);
    }

    public Snackbar setAction(CharSequence charSequence, final View.OnClickListener onClickListener) {
        Button actionView = getActionView();
        if (TextUtils.isEmpty(charSequence) || onClickListener == null) {
            actionView.setVisibility(8);
            actionView.setOnClickListener(null);
            this.hasAction = false;
            return this;
        }
        this.hasAction = true;
        actionView.setVisibility(0);
        actionView.setText(charSequence);
        actionView.setOnClickListener(new View.OnClickListener() { // from class: com.google.android.material.snackbar.Snackbar$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Snackbar.m7893x7644152b(this.f$0, onClickListener, view);
            }
        });
        return this;
    }

    private /* synthetic */ void lambda$setAction$0(View.OnClickListener onClickListener, View view) {
        onClickListener.onClick(view);
        dispatchDismiss(1);
    }

    @Override // com.google.android.material.snackbar.BaseTransientBottomBar
    public int getDuration() {
        int duration = super.getDuration();
        if (duration == -2) {
            return -2;
        }
        if (Build.VERSION.SDK_INT >= 29) {
            return this.accessibilityManager.getRecommendedTimeoutMillis(duration, (this.hasAction ? 4 : 0) | 3);
        }
        if (this.hasAction && this.accessibilityManager.isTouchExplorationEnabled()) {
            return -2;
        }
        return duration;
    }

    public Snackbar setTextColor(ColorStateList colorStateList) {
        getMessageView().setTextColor(colorStateList);
        return this;
    }

    public Snackbar setTextColor(int i) {
        getMessageView().setTextColor(i);
        return this;
    }

    public Snackbar setTextMaxLines(int i) {
        getMessageView().setMaxLines(i);
        return this;
    }

    public Snackbar setActionTextColor(ColorStateList colorStateList) {
        getActionView().setTextColor(colorStateList);
        return this;
    }

    public Snackbar setMaxInlineActionWidth(int i) {
        getContentLayout().setMaxInlineActionWidth(i);
        return this;
    }

    public Snackbar setActionTextColor(int i) {
        getActionView().setTextColor(i);
        return this;
    }

    public Snackbar setBackgroundTint(int i) {
        return setBackgroundTintList(ColorStateList.valueOf(i));
    }

    public Snackbar setBackgroundTintList(ColorStateList colorStateList) {
        this.view.setBackgroundTintList(colorStateList);
        return this;
    }

    public Snackbar setBackgroundTintMode(PorterDuff.Mode mode) {
        this.view.setBackgroundTintMode(mode);
        return this;
    }

    @Deprecated
    public Snackbar setCallback(Callback callback) {
        BaseTransientBottomBar.BaseCallback<Snackbar> baseCallback = this.callback;
        if (baseCallback != null) {
            removeCallback(baseCallback);
        }
        if (callback != null) {
            addCallback(callback);
        }
        this.callback = callback;
        return this;
    }

    public static final class SnackbarLayout extends BaseTransientBottomBar.SnackbarBaseLayout {
        @Override // com.google.android.material.snackbar.BaseTransientBottomBar.SnackbarBaseLayout, android.view.View
        public final /* bridge */ /* synthetic */ void setBackground(Drawable drawable) {
            super.setBackground(drawable);
        }

        @Override // com.google.android.material.snackbar.BaseTransientBottomBar.SnackbarBaseLayout, android.view.View
        public final /* bridge */ /* synthetic */ void setBackgroundDrawable(Drawable drawable) {
            super.setBackgroundDrawable(drawable);
        }

        @Override // com.google.android.material.snackbar.BaseTransientBottomBar.SnackbarBaseLayout, android.view.View
        public final /* bridge */ /* synthetic */ void setBackgroundTintList(ColorStateList colorStateList) {
            super.setBackgroundTintList(colorStateList);
        }

        @Override // com.google.android.material.snackbar.BaseTransientBottomBar.SnackbarBaseLayout, android.view.View
        public final /* bridge */ /* synthetic */ void setBackgroundTintMode(PorterDuff.Mode mode) {
            super.setBackgroundTintMode(mode);
        }

        @Override // com.google.android.material.snackbar.BaseTransientBottomBar.SnackbarBaseLayout, android.view.View
        public final /* bridge */ /* synthetic */ void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
            super.setLayoutParams(layoutParams);
        }

        @Override // com.google.android.material.snackbar.BaseTransientBottomBar.SnackbarBaseLayout, android.view.View
        public final /* bridge */ /* synthetic */ void setOnClickListener(View.OnClickListener onClickListener) {
            super.setOnClickListener(onClickListener);
        }

        public SnackbarLayout(Context context) {
            super(context);
        }

        public SnackbarLayout(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        @Override // com.google.android.material.snackbar.BaseTransientBottomBar.SnackbarBaseLayout, android.widget.FrameLayout, android.view.View
        protected final void onMeasure(int i, int i2) {
            super.onMeasure(i, i2);
            int childCount = getChildCount();
            int measuredWidth = getMeasuredWidth();
            int paddingLeft = getPaddingLeft();
            int paddingRight = getPaddingRight();
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt = getChildAt(i3);
                if (childAt.getLayoutParams().width == -1) {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec((measuredWidth - paddingLeft) - paddingRight, BasicMeasure.EXACTLY), View.MeasureSpec.makeMeasureSpec(childAt.getMeasuredHeight(), BasicMeasure.EXACTLY));
                }
            }
        }
    }

    private TextView getMessageView() {
        return getContentLayout().getMessageView();
    }

    private Button getActionView() {
        return getContentLayout().getActionView();
    }

    private SnackbarContentLayout getContentLayout() {
        return (SnackbarContentLayout) this.view.getChildAt(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: instrumented$0$setAction$-Ljava-lang-CharSequence-Landroid-view-View$OnClickListener--Lcom-google-android-material-snackbar-Snackbar-, reason: not valid java name */
    public static /* synthetic */ void m7893x7644152b(Snackbar snackbar, View.OnClickListener onClickListener, View view) {
        ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(view);
        try {
            snackbar.lambda$setAction$0(onClickListener, view);
        } finally {
            ViewPortBuilder.b();
        }
    }
}
