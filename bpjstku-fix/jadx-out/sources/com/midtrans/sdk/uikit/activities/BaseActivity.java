package com.midtrans.sdk.uikit.activities;

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
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.akexorcist.localizationactivity.ui.LocalizationActivity;
import com.appsflyer.internal.AFg1xSDK;
import com.bpjstku.R;
import com.midtrans.sdk.corekit.core.Currency;
import com.midtrans.sdk.corekit.core.Logger;
import com.midtrans.sdk.corekit.core.MidtransSDK;
import com.midtrans.sdk.corekit.models.MerchantPreferences;
import com.midtrans.sdk.corekit.models.snap.ItemDetails;
import com.midtrans.sdk.corekit.models.snap.MerchantData;
import com.midtrans.sdk.corekit.models.snap.Transaction;
import com.midtrans.sdk.corekit.utilities.Utils;
import com.midtrans.sdk.uikit.widgets.BoldTextView;
import com.midtrans.sdk.uikit.widgets.DefaultTextView;
import com.midtrans.sdk.uikit.widgets.FancyButton;
import defpackage.MediaBrowserCompatCallbackHandler;
import defpackage.ViewPortBuilder;
import defpackage.calculateInvertedTextureTransform;
import defpackage.getCameraSupportedResolutions;
import defpackage.getRccTransportControlFlagsFromActions;
import defpackage.initSession;
import defpackage.setSessionImpl;
import defpackage.setVideoStabilizationMode;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import kotlin.io.encoding.Base64;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public class BaseActivity extends LocalizationActivity implements getCameraSupportedResolutions {
    private static final String TuitionPaymentFragmentbindingInflater1 = "BaseActivity";
    public BoldTextView TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    public boolean b;
    private static final byte[] $$l = {94, -56, 58, -24};
    private static final int $$o = 77;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$j = {93, -77, 2, Base64.padSymbol, -13, 1, 62, -52, -14, 9, -15, 2, 5, 4, 53, -73, 6, 2, -1, 6, -21, 74, -20, -51, -7, 10, 10, 16, -20, -13, -5, 15, -15, -2, 34, -37, 15, -17, 15, -34, 11, -12, 10, -7, 0, 29, -18, -25, 11, 7, -10, -7, 45, -45, 16, -7, -7, 7, -10, -7, 0, 2, 10, 1, -7, 7, -12, 2, -6, 1, 2, -6, 8, 0, -19, 12, 3, -19, 41, -35, 10, -2, -8, 7, -2, -2, 4, -21, 8, -9, 65};
    private static final int $$k = 74;
    private static final byte[] $$d = {118, 35, -100, -35, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, -7, 18, 16, 1, 16, 16, 4, -19, 48, 3, 17, 0, 30, -4, 24, -54, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -54, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -56, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -55};
    private static final int $$e = 154;
    private static int asInterface = 0;
    private static int asBinder = 1;
    private static char[] d = {59785, 59892, 59406, 59406, 59882, 59884, 59403, 59402, 59407, 59887, 59857, 59403, 59419, 59398, 59405, 59400, 59711, 59756, 59759, 59746, 59730, 59742, 59750, 59745, 59743, 59755, 59773, 59749, 59749, 59770, 59746, 59759, 59708, 59770, 59739, 59723, 59757, 59773, 59768, 59751, 59746, 59731, 59740, 59750, 59746, 59756, 59757, 59756, 59746, 59744, 59771, 59751, 59757, 59714, 59743, 59808, 59810, 59808, 59839, 59812, 59820, 59797, 59797, 59821, 59810, 59832, 59834, 59813, 59815, 59743, 59821, 59820, 59812, 59834, 59817, 59809, 59825, 59833, 59832, 59832, 59833, 59812, 59805, 59760, 59800, 59839, 59815, 59776, 59782, 59809, 59835, 59839, 59812, 59814, 59808, 59729, 59839, 59833, 59839, 59835, 59811, 59815, 59835, 59839, 59837, 59797, 59819, 59836, 59812, 59834, 59827, 59826, 59833};
    private Fragment TuitionPaymentFragmentspecialinlinedviewModeldefault2 = null;
    private boolean g = false;
    private int TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f851a = false;

    public class TuitionPaymentFragmentspecialinlinedviewModeldefault1 implements View.OnClickListener {
        public TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(view);
            try {
                BaseActivity.this.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
            } finally {
                ViewPortBuilder.b();
            }
        }
    }

    public class TuitionPaymentFragmentspecialinlinedviewModeldefault3 implements View.OnClickListener {
        public TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(view);
            try {
                BaseActivity.this.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
            } finally {
                ViewPortBuilder.b();
            }
        }
    }

    private String b() {
        int i = 2 % 2;
        int i2 = asInterface + 13;
        asBinder = i2 % 128;
        if (i2 % 2 == 0) {
            MidtransSDK.getInstance();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        MidtransSDK midtransSDK = MidtransSDK.getInstance();
        if (midtransSDK == null || midtransSDK.isSdkNotAvailable()) {
            setResult(-999);
            finish();
        } else {
            int i3 = asInterface + 81;
            asBinder = i3 % 128;
            int i4 = i3 % 2;
        }
        return midtransSDK.getLanguageCode();
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0025  */
    /* JADX WARN: Code duplicated, block: B:8:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002b). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0025
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void h(int r5, byte r6, short r7, java.lang.Object[] r8) {
        /*
            int r7 = 197 - r7
            byte[] r0 = com.midtrans.sdk.uikit.activities.BaseActivity.$$d
            int r5 = r5 * 14
            int r5 = 98 - r5
            int r1 = r6 + 1
            byte[] r1 = new byte[r1]
            r2 = -1
            if (r0 != 0) goto L12
            r3 = r2
            r2 = r7
            goto L2b
        L12:
            r4 = r7
            r7 = r5
            r5 = r4
        L15:
            int r2 = r2 + 1
            byte r3 = (byte) r7
            r1[r2] = r3
            if (r2 != r6) goto L25
            java.lang.String r5 = new java.lang.String
            r6 = 0
            r5.<init>(r1, r6)
            r8[r6] = r5
            return
        L25:
            r3 = r0[r5]
            r4 = r2
            r2 = r5
            r5 = r3
            r3 = r4
        L2b:
            int r7 = r7 + r5
            int r7 = r7 + (-11)
            int r5 = r2 + 1
            r2 = r3
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.midtrans.sdk.uikit.activities.BaseActivity.h(int, byte, short, java.lang.Object[]):void");
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0027  */
    /* JADX WARN: Code duplicated, block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x002b). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0027
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void j(int r5, int r6, byte r7, java.lang.Object[] r8) {
        /*
            int r6 = r6 * 15
            int r6 = 99 - r6
            int r7 = r7 * 17
            int r0 = 53 - r7
            byte[] r1 = com.midtrans.sdk.uikit.activities.BaseActivity.$$j
            int r5 = r5 * 35
            int r5 = r5 + 4
            byte[] r0 = new byte[r0]
            int r7 = 52 - r7
            r2 = 0
            if (r1 != 0) goto L19
            r4 = r5
            r6 = r7
            r3 = r2
            goto L2b
        L19:
            r3 = r2
        L1a:
            byte r4 = (byte) r6
            r0[r3] = r4
            if (r3 != r7) goto L27
            java.lang.String r5 = new java.lang.String
            r5.<init>(r0, r2)
            r8[r2] = r5
            return
        L27:
            int r3 = r3 + 1
            r4 = r1[r5]
        L2b:
            int r5 = r5 + 1
            int r4 = -r4
            int r6 = r6 + r4
            int r6 = r6 + (-1)
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.midtrans.sdk.uikit.activities.BaseActivity.j(int, int, byte, java.lang.Object[]):void");
    }

    private static void i(byte[] bArr, int[] iArr, boolean z, Object[] objArr) throws Throwable {
        int i;
        int i2;
        int i3 = 2;
        int i4 = 2 % 2;
        setVideoStabilizationMode setvideostabilizationmode = new setVideoStabilizationMode();
        int i5 = 0;
        int i6 = iArr[0];
        int i7 = 1;
        int i8 = iArr[1];
        int i9 = iArr[2];
        int i10 = iArr[3];
        char[] cArr = d;
        if (cArr != null) {
            int i11 = $11 + 121;
            $10 = i11 % 128;
            int i12 = i11 % 2;
            int length = cArr.length;
            char[] cArr2 = new char[length];
            int i13 = 0;
            while (i13 < length) {
                int i14 = $11 + 105;
                $10 = i14 % 128;
                if (i14 % i3 != 0) {
                    try {
                        Object[] objArr2 = new Object[i7];
                        objArr2[i5] = Integer.valueOf(cArr[i13]);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-52690717);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                            byte b = (byte) i5;
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (ViewConfiguration.getJumpTapTimeout() >> 16), (ExpandableListView.getPackedPositionForChild(i5, i5) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(i5, i5) == 0L ? 0 : -1)) + 1271, 18 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), 407021364, false, $$r(b, (byte) (b + 5), (byte) (-1)), new Class[]{Integer.TYPE});
                        }
                        cArr2[i13] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                        length = length;
                        i3 = 2;
                        i5 = 0;
                        i7 = 1;
                        i13 = 0;
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                } else {
                    int i15 = length;
                    try {
                        Object[] objArr3 = {Integer.valueOf(cArr[i13])};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-52690717);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                            byte b2 = (byte) 0;
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (ViewConfiguration.getEdgeSlop() >> 16), 1270 - Color.blue(0), 18 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), 407021364, false, $$r(b2, (byte) (b2 + 5), (byte) (-1)), new Class[]{Integer.TYPE});
                        }
                        cArr2[i13] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).charValue();
                        i13++;
                        length = i15;
                        i3 = 2;
                        i5 = 0;
                        i7 = 1;
                    } catch (Throwable th2) {
                        Throwable cause2 = th2.getCause();
                        if (cause2 == null) {
                            throw th2;
                        }
                        throw cause2;
                    }
                }
            }
            cArr = cArr2;
        }
        char[] cArr3 = new char[i8];
        System.arraycopy(cArr, i6, cArr3, 0, i8);
        if (bArr != null) {
            char[] cArr4 = new char[i8];
            setvideostabilizationmode.b = 0;
            char c = 0;
            while (setvideostabilizationmode.b < i8) {
                if (bArr[setvideostabilizationmode.b] == 1) {
                    int i16 = setvideostabilizationmode.b;
                    try {
                        Object[] objArr4 = {Integer.valueOf(cArr3[setvideostabilizationmode.b]), Integer.valueOf(c)};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1683071655);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                            byte b3 = (byte) 0;
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (ViewConfiguration.getEdgeSlop() >> 16), KeyEvent.normalizeMetaState(0) + 3225, Gravity.getAbsoluteGravity(0, 0) + 13, 2133916302, false, $$r(b3, (byte) (b3 | 6), (byte) (-1)), new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        cArr4[i16] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4)).charValue();
                    } catch (Throwable th3) {
                        Throwable cause3 = th3.getCause();
                        if (cause3 == null) {
                            throw th3;
                        }
                        throw cause3;
                    }
                } else {
                    int i17 = setvideostabilizationmode.b;
                    Object[] objArr5 = {Integer.valueOf(cArr3[setvideostabilizationmode.b]), Integer.valueOf(c)};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-209040917);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        char longPressTimeout = (char) ((ViewConfiguration.getLongPressTimeout() >> 16) + 29944);
                        int iIndexOf = 1755 - TextUtils.indexOf("", "", 0);
                        int pressedStateDuration = 23 - (ViewConfiguration.getPressedStateDuration() >> 16);
                        byte length2 = (byte) $$l.length;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(longPressTimeout, iIndexOf, pressedStateDuration, 387247676, false, $$r((byte) 0, length2, (byte) (length2 - 5)), new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[i17] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).charValue();
                }
                c = cArr4[setvideostabilizationmode.b];
                Object[] objArr6 = {setvideostabilizationmode, setvideostabilizationmode};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1323373940);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                    byte b4 = (byte) 0;
                    byte b5 = b4;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b((char) ((ViewConfiguration.getEdgeSlop() >> 16) + 41241), (-16775511) - Color.rgb(0, 0, 0), (ViewConfiguration.getTapTimeout() >> 16) + 21, -1434471773, false, $$r(b4, b5, (byte) (b5 - 1)), new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr6);
            }
            cArr3 = cArr4;
        }
        if (i10 > 0) {
            char[] cArr5 = new char[i8];
            i = 0;
            System.arraycopy(cArr3, 0, cArr5, 0, i8);
            int i18 = i8 - i10;
            System.arraycopy(cArr5, 0, cArr3, i18, i10);
            System.arraycopy(cArr5, i10, cArr3, 0, i18);
        } else {
            i = 0;
        }
        if (!z) {
            i2 = 2;
        } else {
            char[] cArr6 = new char[i8];
            setvideostabilizationmode.b = i;
            while (setvideostabilizationmode.b < i8) {
                int i19 = $11 + 15;
                $10 = i19 % 128;
                int i20 = i19 % 2;
                cArr6[setvideostabilizationmode.b] = cArr3[(i8 - setvideostabilizationmode.b) - 1];
                setvideostabilizationmode.b++;
                int i21 = $10 + 121;
                $11 = i21 % 128;
                if (i21 % 2 == 0) {
                    int i22 = 5 / 4;
                }
            }
            int i23 = $11 + 93;
            $10 = i23 % 128;
            i2 = 2;
            int i24 = i23 % 2;
            cArr3 = cArr6;
        }
        if (i9 > 0) {
            int i25 = $10 + 119;
            $11 = i25 % 128;
            if (i25 % i2 == 0) {
                setvideostabilizationmode.b = 0;
            } else {
                setvideostabilizationmode.b = 0;
            }
            while (setvideostabilizationmode.b < i8) {
                cArr3[setvideostabilizationmode.b] = (char) (cArr3[setvideostabilizationmode.b] - iArr[i2]);
                setvideostabilizationmode.b++;
            }
        }
        objArr[0] = new String(cArr3);
    }

    @Override // com.akexorcist.localizationactivity.ui.LocalizationActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        String str;
        Object[] objArrTuitionPaymentFragmentbindingInflater1$7879113;
        Object[] objArr;
        int i = 2 % 2;
        new setSessionImpl();
        String strB = b();
        if (!b().equals("id")) {
            str = "US";
        } else {
            int i2 = asInterface + 61;
            asBinder = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 68 / 0;
                str = "ID";
            } else {
                str = "ID";
            }
        }
        setSessionImpl.TuitionPaymentFragmentspecialinlinedviewModeldefault3(context, strB, str);
        Intrinsics.checkNotNullParameter(context, "");
        super.attachBaseContext(getRccTransportControlFlagsFromActions.INSTANCE.b(context));
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char scrollBarFadeDuration = (char) (29944 - (ViewConfiguration.getScrollBarFadeDuration() >> 16));
            int iCombineMeasuredStates = View.combineMeasuredStates(0, 0) + 1755;
            int i4 = 24 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1));
            byte b = $$d[28];
            Object[] objArr2 = new Object[1];
            h(b, (byte) (b | 36), (short) 193, objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(scrollBarFadeDuration, iCombineMeasuredStates, i4, 986134021, false, (String) objArr2[0], null);
        }
        if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null) != -1) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                char tapTimeout = (char) ((ViewConfiguration.getTapTimeout() >> 16) + 29944);
                int packedPositionType = 1755 - ExpandableListView.getPackedPositionType(0L);
                int i5 = 23 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                Object[] objArr3 = new Object[1];
                h($$d[28], (byte) 52, (short) ($$e + 2), objArr3);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(tapTimeout, packedPositionType, i5, 1599039318, false, (String) objArr3[0], null);
            }
            Object[] objArr4 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).get(null);
            objArrTuitionPaymentFragmentbindingInflater1$7879113 = new Object[]{new int[]{((int[]) objArr4[0])[0]}, new int[]{((int[]) objArr4[1])[0]}, (Object[]) objArr4[2], new int[1], (String[]) objArr4[4]};
            int i6 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().screenLayout;
            int i7 = ~i6;
            int i8 = (((1958332176 + (((~(82422757 | i7)) | 295025183) * 226)) + (((~(i7 | 368950271)) | (8497669 | (~((-295025184) | i6)))) * (-113))) + ((~(i6 | 82422757)) * 113)) - 462815032;
            int i9 = (i8 << 13) ^ i8;
            int i10 = i9 ^ (i9 >>> 17);
            ((int[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[3])[0] = i10 ^ (i10 << 5);
        } else {
            Object[] objArr5 = new Object[1];
            i(new byte[]{0, 1, 1, 1, 1, 0, 1, 1, 1, 1, 1, 0, 0, 1, 1, 0}, new int[]{0, 16, 154, 0}, false, objArr5);
            Class<?> cls = Class.forName((String) objArr5[0]);
            Object[] objArr6 = new Object[1];
            i(new byte[]{1, 0, 1, 1, 0, 1, 1, 0, 1, 1, 1, 1, 1, 0, 1, 1}, new int[]{16, 16, 0, 1}, true, objArr6);
            int iIntValue = ((Integer) cls.getMethod((String) objArr6[0], Object.class).invoke(null, this)).intValue();
            try {
                Object[] objArr7 = {-1744965757};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2063193834);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (TextUtils.indexOf("", "") + 42049), Process.getGidForName("") + 1727, (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 28, -1637387971, false, null, new Class[]{Integer.TYPE});
                }
                objArrTuitionPaymentFragmentbindingInflater1$7879113 = AFg1xSDK.TuitionPaymentFragmentbindingInflater1$7879113(iIntValue, 0, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).newInstance(objArr7), -462815032, false, true);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    char jumpTapTimeout = (char) ((ViewConfiguration.getJumpTapTimeout() >> 16) + 29944);
                    int scrollDefaultDelay = (ViewConfiguration.getScrollDefaultDelay() >> 16) + 1755;
                    int iIndexOf = 22 - TextUtils.indexOf((CharSequence) "", '0');
                    Object[] objArr8 = new Object[1];
                    h($$d[28], (byte) 52, (short) ($$e + 2), objArr8);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(jumpTapTimeout, scrollDefaultDelay, iIndexOf, 1599039318, false, (String) objArr8[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArrTuitionPaymentFragmentbindingInflater1$7879113);
                try {
                    Object[] objArr9 = new Object[1];
                    i(new byte[]{1, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 0, 1, 0, 0, 1, 0, 1, 0}, new int[]{32, 22, 0, 14}, false, objArr9);
                    Class<?> cls2 = Class.forName((String) objArr9[0]);
                    Object[] objArr10 = new Object[1];
                    i(new byte[]{0, 1, 1, 1, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 0}, new int[]{54, 15, 67, 0}, false, objArr10);
                    long jLongValue = ((Long) cls2.getDeclaredMethod((String) objArr10[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1145728641);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                        char packedPositionChild = (char) (29943 - ExpandableListView.getPackedPositionChild(0L));
                        int iLastIndexOf = 1754 - TextUtils.lastIndexOf("", '0', 0, 0);
                        int i11 = (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 23;
                        byte b2 = (byte) 52;
                        Object[] objArr11 = new Object[1];
                        h($$d[28], b2, (short) (b2 << 1), objArr11);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(packedPositionChild, iLastIndexOf, i11, 1596667560, false, (String) objArr11[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                        char cKeyCodeFromString = (char) (29944 - KeyEvent.keyCodeFromString(""));
                        int i12 = (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 1754;
                        int i13 = 23 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                        byte b3 = $$d[28];
                        Object[] objArr12 = new Object[1];
                        h(b3, (byte) (b3 | 36), (short) 193, objArr12);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(cKeyCodeFromString, i12, i13, 986134021, false, (String) objArr12[0], null);
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
        int i14 = ((int[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[1])[0];
        int i15 = ((int[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[0])[0];
        if (i15 == i14) {
            int i16 = ((int[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[3])[0];
            Object[] objArr13 = {new int[]{((int[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[0])[0]}, new int[]{((int[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[1])[0]}, (Object[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[2], new int[1], (String[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[4]};
            int i17 = ~(System.identityHashCode(this) | 164313476);
            int i18 = i16 + ((187428145 | i17) * (-658)) + 1264283705 + ((i17 | 35701809) * 658);
            int i19 = (i18 << 13) ^ i18;
            int i20 = i19 ^ (i19 >>> 17);
            ((int[]) objArr13[3])[0] = i20 ^ (i20 << 5);
        } else {
            ArrayList arrayList = new ArrayList();
            String[] strArr = (String[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[4];
            if (strArr != null) {
                for (String str2 : strArr) {
                    int i21 = asBinder + 99;
                    asInterface = i21 % 128;
                    int i22 = i21 % 2;
                    arrayList.add(str2);
                }
            }
            int[] iArr = new int[i15];
            int i23 = i15 - 1;
            iArr[i23] = 1;
            Toast.makeText((Context) null, iArr[((i15 * i23) % 2) - 1], 1).show();
            int i24 = ((int[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[3])[0];
            Object[] objArr14 = {new int[]{((int[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[0])[0]}, new int[]{((int[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[1])[0]}, (Object[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[2], new int[1], (String[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[4]};
            int iCodePointAt = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(6) - 400616537;
            int i25 = ~iCodePointAt;
            int i26 = 1968155361 + (((~(185571671 | i25)) | 9462944) * (-1188));
            int i27 = (~(iCodePointAt | (-185571672))) | 9462944;
            int i28 = ~(27030754 | i25);
            int i29 = i24 + i26 + ((i27 | i28) * 594) + (((~((-185571672) | i25)) | 168003861 | i28) * 594);
            int i30 = (i29 << 13) ^ i29;
            int i31 = i30 ^ (i30 >>> 17);
            ((int[]) objArr14[3])[0] = i31 ^ (i31 << 5);
        }
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
            char cGreen = (char) Color.green(0);
            int maxKeyCode = (KeyEvent.getMaxKeyCode() >> 16) + 1031;
            int packedPositionChild2 = ExpandableListView.getPackedPositionChild(0L) + 16;
            byte b4 = (byte) 52;
            Object[] objArr15 = new Object[1];
            h($$d[28], b4, b4, objArr15);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(cGreen, maxKeyCode, packedPositionChild2, 1357589585, false, (String) objArr15[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).getLong(null);
        Object[] objArr16 = new Object[1];
        i(new byte[]{1, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 0, 1, 0, 0, 1, 0, 1, 0}, new int[]{32, 22, 0, 14}, false, objArr16);
        Class<?> cls3 = Class.forName((String) objArr16[0]);
        Object[] objArr17 = new Object[1];
        i(new byte[]{0, 1, 1, 1, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 0}, new int[]{54, 15, 67, 0}, false, objArr17);
        long jLongValue2 = ((Long) cls3.getDeclaredMethod((String) objArr17[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault10 == null) {
            char c = (char) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) - 1);
            int jumpTapTimeout2 = (ViewConfiguration.getJumpTapTimeout() >> 16) + 1031;
            int iIndexOf2 = 14 - TextUtils.indexOf((CharSequence) "", '0', 0);
            Object[] objArr18 = new Object[1];
            h($$d[28], (byte) 52, (short) ($$e + 2), objArr18);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.b(c, jumpTapTimeout2, iIndexOf2, 1344079056, false, (String) objArr18[0], null);
        }
        if (j == ((jLongValue2 - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault10).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault11 == null) {
                char cMyPid = (char) (Process.myPid() >> 22);
                int i32 = (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 1031;
                int maxKeyCode2 = 15 - (KeyEvent.getMaxKeyCode() >> 16);
                byte b5 = $$d[7];
                byte b6 = b5;
                Object[] objArr19 = new Object[1];
                h(b5, b6, b6, objArr19);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.b(cMyPid, i32, maxKeyCode2, 632103528, false, (String) objArr19[0], null);
            }
            Object[] objArr20 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault11).get(null);
            objArr = new Object[]{strArr, new int[]{i}, new int[1], new int[]{i}};
            int i33 = ((int[]) objArr20[3])[0];
            int i34 = ((int[]) objArr20[1])[0];
            String[] strArr2 = (String[]) objArr20[0];
            int i35 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 16543328;
            int i36 = ((((~((~i35) | 1069526015)) * 130) - 673940009) + (((~(i35 | 1069526015)) | 151519369) * 130)) - 1040563992;
            int i37 = (i36 << 13) ^ i36;
            int i38 = i37 ^ (i37 >>> 17);
            ((int[]) objArr[2])[0] = i38 ^ (i38 << 5);
        } else {
            Object[] objArr21 = new Object[1];
            i(new byte[]{0, 1, 1, 1, 1, 0, 1, 1, 1, 1, 1, 0, 0, 1, 1, 0}, new int[]{0, 16, 154, 0}, false, objArr21);
            Class<?> cls4 = Class.forName((String) objArr21[0]);
            Object[] objArr22 = new Object[1];
            i(new byte[]{1, 0, 1, 1, 0, 1, 1, 0, 1, 1, 1, 1, 1, 0, 1, 1}, new int[]{16, 16, 0, 1}, true, objArr22);
            int iIntValue2 = ((Integer) cls4.getMethod((String) objArr22[0], Object.class).invoke(null, this)).intValue();
            Object[] objArr23 = {-1744965757};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-725886332);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault12 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.b((char) (46039 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))), 1134 - Color.blue(0), 18 - (Process.myTid() >> 22), 807763283, false, null, new Class[]{Integer.TYPE});
            }
            Object[] objArr24 = {Integer.valueOf(iIntValue2), 0, -1040563992, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault12).newInstance(objArr23), false};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1443305588);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault13 == null) {
                char c2 = (char) (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1));
                int touchSlop = 1031 - (ViewConfiguration.getTouchSlop() >> 8);
                int offsetBefore = 15 - TextUtils.getOffsetBefore("", 0);
                byte b7 = (byte) 52;
                Object[] objArr25 = new Object[1];
                h($$d[28], b7, b7, objArr25);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.b(c2, touchSlop, offsetBefore, 1298546779, false, (String) objArr25[0], new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (45993 - View.resolveSize(0, 0)), (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 1117, 17 - (ViewConfiguration.getEdgeSlop() >> 16)), Boolean.TYPE});
            }
            Object[] objArr26 = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault13).invoke(null, objArr24);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault14 == null) {
                char threadPriority = (char) ((Process.getThreadPriority(0) + 20) >> 6);
                int bitsPerPixel = ImageFormat.getBitsPerPixel(0) + 1032;
                int packedPositionType2 = ExpandableListView.getPackedPositionType(0L) + 15;
                byte b8 = $$d[7];
                byte b9 = b8;
                Object[] objArr27 = new Object[1];
                h(b8, b9, b9, objArr27);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.b(threadPriority, bitsPerPixel, packedPositionType2, 632103528, false, (String) objArr27[0], null);
            }
            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault14).set(null, objArr26);
            try {
                Object[] objArr28 = new Object[1];
                i(new byte[]{1, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 0, 1, 0, 0, 1, 0, 1, 0}, new int[]{32, 22, 0, 14}, false, objArr28);
                Class<?> cls5 = Class.forName((String) objArr28[0]);
                Object[] objArr29 = new Object[1];
                i(new byte[]{0, 1, 1, 1, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 0}, new int[]{54, 15, 67, 0}, false, objArr29);
                long jLongValue3 = ((Long) cls5.getDeclaredMethod((String) objArr29[0], new Class[0]).invoke(null, new Object[0])).longValue();
                Long lValueOf3 = Long.valueOf(jLongValue3);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault15 == null) {
                    char cGreen2 = (char) Color.green(0);
                    int i39 = (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 1031;
                    int iLastIndexOf2 = 14 - TextUtils.lastIndexOf("", '0', 0, 0);
                    Object[] objArr30 = new Object[1];
                    h($$d[28], (byte) 52, (short) ($$e + 2), objArr30);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.b(cGreen2, i39, iLastIndexOf2, 1344079056, false, (String) objArr30[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault15).set(null, lValueOf3);
                Long lValueOf4 = Long.valueOf(jLongValue3 >> 12);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault16 == null) {
                    char scrollBarSize = (char) (ViewConfiguration.getScrollBarSize() >> 8);
                    int i40 = (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 1030;
                    int keyRepeatDelay = 15 - (ViewConfiguration.getKeyRepeatDelay() >> 16);
                    byte b10 = (byte) 52;
                    Object[] objArr31 = new Object[1];
                    h($$d[28], b10, b10, objArr31);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.b(scrollBarSize, i40, keyRepeatDelay, 1357589585, false, (String) objArr31[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault16).set(null, lValueOf4);
                objArr = objArr26;
            } catch (Exception unused2) {
                throw new RuntimeException();
            }
        }
        int i41 = ((int[]) objArr[1])[0];
        int i42 = ((int[]) objArr[3])[0];
        if (i42 == i41) {
            Object[] objArr32 = {strArr, new int[]{i}, new int[1], new int[]{i}};
            int i43 = ((int[]) objArr[2])[0];
            int i44 = ((int[]) objArr[3])[0];
            int i45 = ((int[]) objArr[1])[0];
            String[] strArr3 = (String[]) objArr[0];
            int i46 = ~System.identityHashCode(this);
            int i47 = i43 + (-1411667695) + (((-90204674) | i46) * 184) + (((~(i46 | 144146620)) | (-224422418)) * 184);
            int i48 = (i47 << 13) ^ i47;
            int i49 = i48 ^ (i48 >>> 17);
            ((int[]) objArr32[2])[0] = i49 ^ (i49 << 5);
            return;
        }
        ArrayList arrayList2 = new ArrayList();
        String[] strArr4 = (String[]) objArr[0];
        if (strArr4 != null) {
            for (String str3 : strArr4) {
                arrayList2.add(str3);
            }
        }
        Toast.makeText((Context) null, i42 / (((i42 - 1) * i42) % 2), 0).show();
        Object[] objArr33 = {strArr, new int[]{i}, new int[1], new int[]{i}};
        int i50 = ((int[]) objArr[2])[0];
        int i51 = ((int[]) objArr[3])[0];
        int i52 = ((int[]) objArr[1])[0];
        String[] strArr5 = (String[]) objArr[0];
        int i53 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().smallestScreenWidthDp;
        int i54 = i50 + (((~((-650722727) | i53)) | 593956) * (-566)) + 580459265 + ((~(i53 | (-650128771))) * 566);
        int i55 = (i54 << 13) ^ i54;
        int i56 = i55 ^ (i55 >>> 17);
        ((int[]) objArr33[2])[0] = i56 ^ (i56 << 5);
    }

    public final String TuitionPaymentFragmentspecialinlinedviewModeldefault1(double d2, String str) {
        int i = 2 % 2;
        if (!TextUtils.isEmpty(str)) {
            str.hashCode();
            if (!str.equals(Currency.SGD)) {
                String string = getString(R.string.prefix_money, Utils.getFormattedAmount(d2));
                int i2 = asBinder + 117;
                asInterface = i2 % 128;
                int i3 = i2 % 2;
                return string;
            }
            String string2 = getString(R.string.prefix_money_sgd, Utils.getFormattedAmount(d2));
            int i4 = asBinder + 87;
            asInterface = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 1 / 0;
            }
            return string2;
        }
        int i6 = asBinder + 73;
        asInterface = i6 % 128;
        return i6 % 2 != 0 ? getString(R.string.prefix_money, Utils.getFormattedAmount(d2)) : getString(R.string.prefix_money, Utils.getFormattedAmount(d2));
    }

    /* JADX WARN: Code duplicated, block: B:12:0x003b  */
    /* JADX WARN: Code duplicated, block: B:13:0x0050  */
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        int i = 2 % 2;
        int i2 = asBinder + 29;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.rv_transaction_detail);
        View viewFindViewById = findViewById(R.id.background_dim);
        if (recyclerView == null || viewFindViewById == null) {
            return;
        }
        int i4 = asBinder + 77;
        asInterface = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 76 / 0;
            if (this.f851a) {
                recyclerView.setVisibility(8);
                ((TextView) findViewById(R.id.text_amount)).setCompoundDrawablesWithIntrinsicBounds(0, 0, 2131231080, 0);
                viewFindViewById.setVisibility(8);
            } else {
                recyclerView.setVisibility(0);
                ((TextView) findViewById(R.id.text_amount)).setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
                viewFindViewById.setVisibility(0);
            }
        } else if (this.f851a) {
            recyclerView.setVisibility(8);
            ((TextView) findViewById(R.id.text_amount)).setCompoundDrawablesWithIntrinsicBounds(0, 0, 2131231080, 0);
            viewFindViewById.setVisibility(8);
        } else {
            recyclerView.setVisibility(0);
            ((TextView) findViewById(R.id.text_amount)).setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
            viewFindViewById.setVisibility(0);
        }
        this.f851a = !this.f851a;
    }

    @Override // defpackage.getCameraSupportedResolutions
    public final void TuitionPaymentFragmentbindingInflater1() {
        int i = 2 % 2;
        int i2 = asInterface + 81;
        asBinder = i2 % 128;
        if (i2 % 2 == 0) {
            setResult(31991);
        } else {
            setResult(-999);
        }
        finish();
    }

    /* JADX WARN: Code duplicated, block: B:24:0x020a  */
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        Object[] objArr;
        BoldTextView boldTextView;
        FancyButton fancyButton;
        int i = 2 % 2;
        int i2 = asBinder + 67;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
        int i4 = 0;
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char c = (char) ((TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 31533);
            int offsetAfter = 921 - TextUtils.getOffsetAfter("", 0);
            int i5 = 29 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1));
            byte b = $$d[7];
            byte b2 = b;
            Object[] objArr2 = new Object[1];
            h(b, b2, b2, objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(c, offsetAfter, i5, -1048449946, false, (String) objArr2[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr3 = new Object[1];
        i(new byte[]{1, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 0, 1, 0, 0, 1, 0, 1, 0}, new int[]{32, 22, 0, 14}, false, objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        i(new byte[]{0, 1, 1, 1, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 0}, new int[]{54, 15, 67, 0}, false, objArr4);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(889369593);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char scrollBarFadeDuration = (char) ((ViewConfiguration.getScrollBarFadeDuration() >> 16) + 31533);
            int i6 = (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 921;
            int iNormalizeMetaState = KeyEvent.normalizeMetaState(0) + 28;
            Object[] objArr5 = new Object[1];
            h($$d[28], (byte) 52, (short) ($$e + 2), objArr5);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(scrollBarFadeDuration, i6, iNormalizeMetaState, -778300370, false, (String) objArr5[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char cResolveSize = (char) (View.resolveSize(0, 0) + 31533);
                int iBlue = Color.blue(0) + 921;
                int iArgb = Color.argb(0, 0, 0, 0) + 28;
                byte b3 = $$d[28];
                Object[] objArr6 = new Object[1];
                h(b3, (byte) (b3 | 36), (short) 193, objArr6);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(cResolveSize, iBlue, iArgb, -1142834547, false, (String) objArr6[0], null);
            }
            Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            objArr = new Object[]{new int[1], new int[]{((int[]) objArr7[1])[0]}, (Object[]) objArr7[2], new int[]{((int[]) objArr7[3])[0]}, (String[]) objArr7[4]};
            int iIdentityHashCode = System.identityHashCode(this);
            int i7 = (((~(iIdentityHashCode | 934461820)) * TypedValues.CycleType.TYPE_EASING) - 1092096577) + (((~((~iIdentityHashCode) | 934461820)) | 839024924) * TypedValues.CycleType.TYPE_EASING) + 1011075662;
            int i8 = (i7 << 13) ^ i7;
            int i9 = i8 ^ (i8 >>> 17);
            ((int[]) objArr[0])[0] = i9 ^ (i9 << 5);
        } else {
            Context baseContext = getBaseContext();
            if (baseContext == null) {
                Object[] objArr8 = new Object[1];
                i(new byte[]{0, 1, 0, 1, 0, 0, 1, 1, 1, 1, 1, 1, 1, 0, 1, 0, 0, 1, 1, 0, 1, 0, 1, 0, 0, 1}, new int[]{69, 26, 68, 0}, true, objArr8);
                Class<?> cls2 = Class.forName((String) objArr8[0]);
                Object[] objArr9 = new Object[1];
                i(new byte[]{0, 1, 0, 1, 1, 0, 0, 1, 0, 0, 1, 1, 0, 1, 1, 0, 1, 0}, new int[]{95, 18, 70, 0}, true, objArr9);
                baseContext = (Context) cls2.getMethod((String) objArr9[0], new Class[0]).invoke(null, null);
                int i10 = asInterface + 15;
                asBinder = i10 % 128;
                int i11 = i10 % 2;
            }
            if (baseContext != null) {
                if (baseContext instanceof ContextWrapper) {
                    int i12 = asInterface + 99;
                    asBinder = i12 % 128;
                    int i13 = i12 % 2;
                    if (((ContextWrapper) baseContext).getBaseContext() != null) {
                        baseContext = baseContext.getApplicationContext();
                    } else {
                        baseContext = null;
                    }
                } else {
                    baseContext = baseContext.getApplicationContext();
                }
            }
            Object[] objArr10 = new Object[1];
            i(new byte[]{0, 1, 1, 1, 1, 0, 1, 1, 1, 1, 1, 0, 0, 1, 1, 0}, new int[]{0, 16, 154, 0}, false, objArr10);
            Class<?> cls3 = Class.forName((String) objArr10[0]);
            Object[] objArr11 = new Object[1];
            i(new byte[]{1, 0, 1, 1, 0, 1, 1, 0, 1, 1, 1, 1, 1, 0, 1, 1}, new int[]{16, 16, 0, 1}, true, objArr11);
            try {
                Object[] objArr12 = {baseContext, Integer.valueOf(((Integer) cls3.getMethod((String) objArr11[0], Object.class).invoke(null, this)).intValue()), 0, 1011075662};
                byte[] bArr = $$j;
                byte b4 = bArr[44];
                Object[] objArr13 = new Object[1];
                j(b4, b4, bArr[5], objArr13);
                Class<?> cls4 = Class.forName((String) objArr13[0]);
                byte b5 = bArr[5];
                Object[] objArr14 = new Object[1];
                j(b5, b5, bArr[44], objArr14);
                objArr = (Object[]) cls4.getMethod((String) objArr14[0], Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr12);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    char deadChar = (char) (KeyEvent.getDeadChar(0, 0) + 31533);
                    int size = 921 - View.MeasureSpec.getSize(0);
                    int iKeyCodeFromString = 28 - KeyEvent.keyCodeFromString("");
                    byte b6 = $$d[28];
                    Object[] objArr15 = new Object[1];
                    h(b6, (byte) (b6 | 36), (short) 193, objArr15);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(deadChar, size, iKeyCodeFromString, -1142834547, false, (String) objArr15[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr);
                try {
                    Object[] objArr16 = new Object[1];
                    i(new byte[]{1, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 0, 1, 0, 0, 1, 0, 1, 0}, new int[]{32, 22, 0, 14}, false, objArr16);
                    Class<?> cls5 = Class.forName((String) objArr16[0]);
                    Object[] objArr17 = new Object[1];
                    i(new byte[]{0, 1, 1, 1, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 0}, new int[]{54, 15, 67, 0}, false, objArr17);
                    long jLongValue2 = ((Long) cls5.getDeclaredMethod((String) objArr17[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue2);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(889369593);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                        char cArgb = (char) (Color.argb(0, 0, 0, 0) + 31533);
                        int i14 = 921 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
                        int i15 = (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 28;
                        Object[] objArr18 = new Object[1];
                        h($$d[28], (byte) 52, (short) ($$e + 2), objArr18);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(cArgb, i14, i15, -778300370, false, (String) objArr18[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                        char cMakeMeasureSpec = (char) (View.MeasureSpec.makeMeasureSpec(0, 0) + 31533);
                        int iResolveOpacity = Drawable.resolveOpacity(0, 0) + 921;
                        int minimumFlingVelocity = (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 28;
                        byte b7 = $$d[7];
                        byte b8 = b7;
                        Object[] objArr19 = new Object[1];
                        h(b7, b8, b8, objArr19);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(cMakeMeasureSpec, iResolveOpacity, minimumFlingVelocity, -1048449946, false, (String) objArr19[0], null);
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
        int i16 = ((int[]) objArr[1])[0];
        int i17 = ((int[]) objArr[3])[0];
        if (i17 != i16) {
            ArrayList arrayList = new ArrayList();
            String[] strArr = (String[]) objArr[4];
            if (strArr != null) {
                while (i4 < strArr.length) {
                    int i18 = asBinder + 97;
                    asInterface = i18 % 128;
                    if (i18 % 2 != 0) {
                        arrayList.add(strArr[i4]);
                        i4 += 33;
                    } else {
                        arrayList.add(strArr[i4]);
                        i4++;
                    }
                }
            }
            throw new RuntimeException(String.valueOf(i17));
        }
        int i19 = ((int[]) objArr[0])[0];
        Object[] objArr20 = {new int[1], new int[]{((int[]) objArr[1])[0]}, (Object[]) objArr[2], new int[]{((int[]) objArr[3])[0]}, (String[]) objArr[4]};
        int i20 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().screenWidthDp;
        int i21 = ~i20;
        int i22 = i19 + 1976700224 + (((~((-827724764) | i21)) | (~(964574171 | i20))) * (-831)) + ((~((-18219292) | i20)) * (-1662)) + (((~(i20 | 827724763)) | (~(i21 | (-946354881))) | (~(946354880 | i20))) * 831);
        int i23 = (i22 << 13) ^ i22;
        int i24 = i23 ^ (i23 >>> 17);
        ((int[]) objArr20[0])[0] = i24 ^ (i24 << 5);
        MidtransSDK midtransSDK = MidtransSDK.getInstance();
        if (midtransSDK == null || midtransSDK.isSdkNotAvailable()) {
            setResult(-999);
            finish();
        }
        try {
            if (midtransSDK.getColorTheme() != null) {
                int primaryColor = midtransSDK.getColorTheme().getPrimaryColor();
                int primaryDarkColor = midtransSDK.getColorTheme().getPrimaryDarkColor();
                if (primaryColor != 0 && (fancyButton = (FancyButton) findViewById(R.id.button_primary)) != null) {
                    int i25 = asBinder + 109;
                    asInterface = i25 % 128;
                    int i26 = i25 % 2;
                    fancyButton.setBackgroundColor(primaryColor);
                }
                if (primaryDarkColor != 0 && (boldTextView = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1) != null) {
                    boldTextView.setTextColor(primaryDarkColor);
                    return;
                }
            }
        } catch (Exception e2) {
            StringBuilder sb = new StringBuilder("init:");
            sb.append(e2.getMessage());
            Logger.e("themes", sb.toString());
        }
        int i27 = asBinder + 101;
        asInterface = i27 % 128;
        int i28 = i27 % 2;
    }

    @Override // androidx.view.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        int i = 2 % 2;
        int i2 = asInterface + 67;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        super.onBackPressed();
        if (MidtransSDK.getInstance().getUIKitCustomSetting() == null || !MidtransSDK.getInstance().getUIKitCustomSetting().isEnabledAnimation()) {
            return;
        }
        int i4 = asBinder + 67;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
        overridePendingTransition(R.anim.slide_in_back, R.anim.slide_out_back);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.view.ComponentActivity, android.app.Activity
    public void setContentView(int i) {
        int i2 = 2 % 2;
        int i3 = asBinder + 115;
        asInterface = i3 % 128;
        int i4 = i3 % 2;
        super.setContentView(i);
        try {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = (BoldTextView) findViewById(R.id.text_amount);
            ImageView imageView = (ImageView) findViewById(R.id.merchant_logo);
            DefaultTextView defaultTextView = (DefaultTextView) findViewById(R.id.text_page_merchant_name);
            MerchantData merchantData = MidtransSDK.getInstance().getMerchantData();
            Object obj = null;
            if (merchantData != null) {
                int i5 = asBinder + 57;
                asInterface = i5 % 128;
                if (i5 % 2 != 0) {
                    merchantData.getPreference();
                    throw null;
                }
                MerchantPreferences preference = merchantData.getPreference();
                if (preference != null) {
                    int i6 = asBinder + 73;
                    asInterface = i6 % 128;
                    int i7 = i6 % 2;
                    String displayName = preference.getDisplayName();
                    String logoUrl = preference.getLogoUrl();
                    if (!(!TextUtils.isEmpty(logoUrl))) {
                        if (displayName != null && defaultTextView != null && !TextUtils.isEmpty(displayName)) {
                            this.b = true;
                            defaultTextView.setVisibility(0);
                            defaultTextView.setText(displayName);
                            if (imageView != null) {
                                imageView.setVisibility(8);
                            }
                        }
                    } else if (imageView != null) {
                        int i8 = asInterface + 3;
                        asBinder = i8 % 128;
                        int i9 = i8 % 2;
                        this.b = true;
                        calculateInvertedTextureTransform.TuitionPaymentFragmentspecialinlinedviewModeldefault2(imageView).TuitionPaymentFragmentbindingInflater1(logoUrl);
                        imageView.setVisibility(0);
                    }
                }
            }
            if (findViewById(R.id.container_item_details) != null) {
                Transaction transaction = MidtransSDK.getInstance().getTransaction();
                if (transaction.getTransactionDetails() != null) {
                    String strTuitionPaymentFragmentspecialinlinedviewModeldefault1 = TuitionPaymentFragmentspecialinlinedviewModeldefault1(transaction.getTransactionDetails().getAmount(), transaction.getTransactionDetails().getCurrency());
                    BoldTextView boldTextView = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                    if (boldTextView != null) {
                        int i10 = asBinder + 1;
                        asInterface = i10 % 128;
                        if (i10 % 2 != 0) {
                            boldTextView.setText(strTuitionPaymentFragmentspecialinlinedviewModeldefault1);
                            obj.hashCode();
                            throw null;
                        }
                        boldTextView.setText(strTuitionPaymentFragmentspecialinlinedviewModeldefault1);
                        int i11 = asInterface + 29;
                        asBinder = i11 % 128;
                        int i12 = i11 % 2;
                    }
                }
                List<ItemDetails> itemDetails = MidtransSDK.getInstance().getTransaction().getItemDetails();
                RecyclerView recyclerView = (RecyclerView) findViewById(R.id.rv_transaction_detail);
                if (recyclerView != null) {
                    recyclerView.setHasFixedSize(true);
                    recyclerView.setLayoutManager(new LinearLayoutManager(this));
                    recyclerView.setAdapter(new MediaBrowserCompatCallbackHandler(itemDetails));
                }
                findViewById(R.id.background_dim).setOnClickListener(new TuitionPaymentFragmentspecialinlinedviewModeldefault1());
                ((LinearLayout) findViewById(R.id.container_item_details)).setOnClickListener(new TuitionPaymentFragmentspecialinlinedviewModeldefault3());
            }
            TuitionPaymentFragmentspecialinlinedviewModeldefault2(b(), b().equals("id") ? "ID" : "US");
        } catch (Exception e2) {
            String str = TuitionPaymentFragmentbindingInflater1;
            StringBuilder sb = new StringBuilder("appbar:");
            sb.append(e2.getMessage());
            Logger.e(str, sb.toString());
        }
    }

    @Override // com.akexorcist.localizationactivity.ui.LocalizationActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        int i = 2 % 2;
        int i2 = asInterface + 21;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        super.onCreate(bundle);
        int i4 = asBinder + 45;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // com.akexorcist.localizationactivity.ui.LocalizationActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onStart() {
        int i = 2 % 2;
        int i2 = asBinder + 111;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        super.onStart();
        int i4 = asInterface + 71;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // com.akexorcist.localizationactivity.ui.LocalizationActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onResume() {
        int i = 2 % 2;
        int i2 = asBinder + 23;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        super.onResume();
        int i4 = asBinder + 65;
        asInterface = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // com.akexorcist.localizationactivity.ui.LocalizationActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onPause() {
        int i = 2 % 2;
        int i2 = asInterface + 71;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        super.onPause();
        int i4 = asInterface + 5;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
    }

    private static String $$r(byte b, short s, int i) {
        byte[] bArr = $$l;
        int i2 = i + 4;
        int i3 = 105 - s;
        int i4 = b * 3;
        byte[] bArr2 = new byte[1 - i4];
        int i5 = 0 - i4;
        int i6 = -1;
        if (bArr == null) {
            i3 += -i5;
        }
        while (true) {
            i6++;
            bArr2[i6] = (byte) i3;
            i2++;
            if (i6 == i5) {
                return new String(bArr2, 0);
            }
            i3 += -bArr[i2];
        }
    }
}
