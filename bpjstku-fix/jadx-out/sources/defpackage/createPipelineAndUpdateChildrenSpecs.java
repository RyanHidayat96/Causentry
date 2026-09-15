package defpackage;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.ExpandableListView;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.recyclerview.widget.RecyclerView;
import com.bpjstku.R;
import com.midtrans.sdk.corekit.core.Logger;
import com.midtrans.sdk.corekit.models.promo.Promo;
import com.midtrans.sdk.uikit.abstracts.BasePaymentActivity;
import com.midtrans.sdk.uikit.widgets.DefaultTextView;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import kotlin.io.encoding.Base64;

/* JADX INFO: loaded from: classes4.dex */
public final class createPipelineAndUpdateChildrenSpecs extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    private static final String TuitionPaymentFragmentspecialinlinedviewModeldefault2 = "PromosAdapter";
    public List<Promo> TuitionPaymentFragmentbindingInflater1 = new ArrayList();
    private final String TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    private final int TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    public final TuitionPaymentFragmentspecialinlinedviewModeldefault1 b;

    public interface TuitionPaymentFragmentspecialinlinedviewModeldefault1 {
        void TuitionPaymentFragmentbindingInflater1(Promo promo);

        void TuitionPaymentFragmentspecialinlinedviewModeldefault3();
    }

    public class b extends RecyclerView.ViewHolder implements CompoundButton.OnCheckedChangeListener {
        DefaultTextView TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        AppCompatCheckBox TuitionPaymentFragmentspecialinlinedviewModeldefault3;

        public b(View view) {
            super(view);
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = (AppCompatCheckBox) view.findViewById(R.id.check_promo_name);
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = (DefaultTextView) view.findViewById(R.id.text_promo_amount);
            if (view.getContext() instanceof BasePaymentActivity) {
                try {
                    ((BasePaymentActivity) view.getContext()).TuitionPaymentFragmentspecialinlinedviewModeldefault1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
                } catch (RuntimeException e2) {
                    String str = createPipelineAndUpdateChildrenSpecs.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                    StringBuilder sb = new StringBuilder("renderCheckbox");
                    sb.append(e2.getMessage());
                    Logger.e(str, sb.toString());
                }
            }
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            Promo promo = (Promo) createPipelineAndUpdateChildrenSpecs.this.TuitionPaymentFragmentbindingInflater1.get(getAdapterPosition());
            createPipelineAndUpdateChildrenSpecs.TuitionPaymentFragmentspecialinlinedviewModeldefault2(createPipelineAndUpdateChildrenSpecs.this, promo, z);
            new Handler().post(new Runnable() { // from class: createPipelineAndUpdateChildrenSpecs.b.5
                private static final byte[] $$c = {90, 46, 113, 8};
                private static final int $$f = 157;
                private static int $10 = 0;
                private static int $11 = 1;
                private static final byte[] $$d = {32, 1, 70, -122, 16, 2, -59, Base64.padSymbol, 12, 4, -4, 9, -3, -51, 55, 17, -6, 18, 1, -2, -1, -50, 67, -8, 23, -11, 17, -5, -4, 15, -58, 57, 16, 1, 7, 7, -64, 75, 3, -7, 7, 1, 15, -7, 0, 18, -65, 35, 24, 23, -11, 17, -5, -4, 15, -36, 57, -7, -9, 16, 0, -2, -28, 48, 1, 7, 7, 5, -75, 4, 37, 55, 0, -11, 17, 0, -9, 15, -21, 42, -7, 10, -8, 1, 19, -7, -2, -19, 25, 16, -7, 6, 1, -44, 9, -1, 37, -8, 15, -7, 10, 3, -26, 21, 28, -8, -4, 13, 10, -42, 48, -13, 10, 10, -4, 13, 10, 3, 1, -7, 2, 10, -4, 15, 1, 9, 2, 1, 9, -5, 3, 22, -9, 0, 22, -38, 38, -7, 5, 11, -4, 5, 5, -1, 24, -5, 12, -62};
                private static final int $$e = 82;
                private static final byte[] $$a = {48, -110, 22, 55, 43, -2, 21, -1, 16, 9, -20, 27, 34, -2, 2, 19, 16, -36, 54, -7, 16, 16, 2, 19, 16, 9, 7, -1, 8, 16, 2, 21, 7, 15, 8, 7, 15, 1, 9, 28, -3, 6, 28, -32, 44, -1, 11, 17, 2, 11, 11, 5, 30, 1, 18, -55, 43, -2, 21, -1, 16, 9, -20, 27, 34, -2, 2, 19, 16, -36, 54, -7, 16, 16, 2, 19, 16, -8, 17, 15, 0, 15, 15, 3, -20, 47, 2, 16, -1, 29, -5, 23, -55};
                private static final int $$b = 36;
                private static int TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
                private static int TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 1;
                private static int TuitionPaymentFragmentbindingInflater1 = -83722454;

                /* JADX WARN: Code duplicated, block: B:10:0x0027  */
                /* JADX WARN: Code duplicated, block: B:8:0x001f  */
                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x002d). Please report as a decompilation issue!!! */
                /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                    jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0027
                    	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                    	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                    	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                    */
                private static void a(byte r7, byte r8, short r9, java.lang.Object[] r10) {
                    /*
                        int r9 = r9 * 52
                        int r9 = r9 + 4
                        int r8 = 53 - r8
                        int r7 = r7 * 14
                        int r7 = r7 + 84
                        byte[] r0 = createPipelineAndUpdateChildrenSpecs.b.AnonymousClass5.$$a
                        byte[] r1 = new byte[r8]
                        r2 = 0
                        if (r0 != 0) goto L14
                        r3 = r9
                        r4 = r2
                        goto L2d
                    L14:
                        r3 = r2
                    L15:
                        r6 = r9
                        r9 = r7
                        r7 = r6
                        int r4 = r3 + 1
                        byte r5 = (byte) r9
                        r1[r3] = r5
                        if (r4 != r8) goto L27
                        java.lang.String r7 = new java.lang.String
                        r7.<init>(r1, r2)
                        r10[r2] = r7
                        return
                    L27:
                        r3 = r0[r7]
                        r6 = r9
                        r9 = r7
                        r7 = r3
                        r3 = r6
                    L2d:
                        int r9 = r9 + 1
                        int r3 = r3 + r7
                        int r7 = r3 + (-10)
                        r3 = r4
                        goto L15
                    */
                    throw new UnsupportedOperationException("Method not decompiled: createPipelineAndUpdateChildrenSpecs.b.AnonymousClass5.a(byte, byte, short, java.lang.Object[]):void");
                }

                private static void d(short s, byte b, short s2, Object[] objArr) {
                    int i = (b * 15) + 84;
                    byte[] bArr = $$d;
                    int i2 = 96 - (s2 * 92);
                    int i3 = s * 40;
                    byte[] bArr2 = new byte[93 - i3];
                    int i4 = 92 - i3;
                    int i5 = -1;
                    if (bArr == null) {
                        i2++;
                        i = (i + i2) - 4;
                    }
                    while (true) {
                        i5++;
                        bArr2[i5] = (byte) i;
                        if (i5 == i4) {
                            objArr[0] = new String(bArr2, 0);
                            return;
                        } else {
                            byte b2 = bArr[i2];
                            i2++;
                            i = (i + b2) - 4;
                        }
                    }
                }

                /* JADX WARN: Code duplicated, block: B:34:0x0170  */
                /* JADX WARN: Code duplicated, block: B:35:0x0171  */
                private static void c(boolean z2, int i, int i2, int i3, char[] cArr, Object[] objArr) throws Throwable {
                    long j;
                    Throwable cause;
                    int i4 = 2 % 2;
                    setOrVerifyExpectFrameRateRange setorverifyexpectframeraterange = new setOrVerifyExpectFrameRateRange();
                    char[] cArr2 = new char[i2];
                    setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
                    int i5 = $11 + 67;
                    $10 = i5 % 128;
                    if (i5 % 2 != 0) {
                        int i6 = 2 / 5;
                    }
                    while (true) {
                        j = 0;
                        if (setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3 >= i2) {
                            break;
                        }
                        setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = cArr[setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3];
                        cArr2[setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = (char) (i + setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
                        int i7 = setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                        try {
                            Object[] objArr2 = {Integer.valueOf(cArr2[i7]), Integer.valueOf(TuitionPaymentFragmentbindingInflater1)};
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1545221423);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                                byte b = (byte) 0;
                                byte b2 = b;
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) Color.red(0), 3292 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 31, 1199271174, false, $$g(b, b2, b2), new Class[]{Integer.TYPE, Integer.TYPE});
                            }
                            cArr2[i7] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                            Object[] objArr3 = {setorverifyexpectframeraterange, setorverifyexpectframeraterange};
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(29209604);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                char c = (char) (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1));
                                int iAxisFromString = MotionEvent.axisFromString("") + 652;
                                int iKeyCodeFromString = KeyEvent.keyCodeFromString("") + 44;
                                byte b3 = (byte) ($$f & 3);
                                byte b4 = (byte) (b3 - 1);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(c, iAxisFromString, iKeyCodeFromString, -450685997, false, $$g(b3, b4, b4), new Class[]{Object.class, Object.class});
                            }
                            ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3);
                        } catch (Throwable th) {
                            cause = th.getCause();
                            if (cause != null) {
                                throw th;
                            }
                            throw cause;
                        }
                        cause = th.getCause();
                        if (cause != null) {
                            throw th;
                        }
                        throw cause;
                    }
                    if (i3 > 0) {
                        int i8 = $11 + 99;
                        $10 = i8 % 128;
                        int i9 = i8 % 2;
                        setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1 = i3;
                        char[] cArr3 = new char[i2];
                        System.arraycopy(cArr2, 0, cArr3, 0, i2);
                        System.arraycopy(cArr3, 0, cArr2, i2 - setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1, setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1);
                        System.arraycopy(cArr3, setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1, cArr2, 0, i2 - setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1);
                    }
                    if (z2) {
                        char[] cArr4 = new char[i2];
                        setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
                        while (setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3 < i2) {
                            cArr4[setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr2[(i2 - setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3) - 1];
                            Object[] objArr4 = {setorverifyexpectframeraterange, setorverifyexpectframeraterange};
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(29209604);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                                char offsetAfter = (char) TextUtils.getOffsetAfter("", 0);
                                int scrollBarSize = (ViewConfiguration.getScrollBarSize() >> 8) + 651;
                                int i10 = 45 - (ViewConfiguration.getGlobalActionKeyTimeout() > j ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == j ? 0 : -1));
                                byte b5 = (byte) ($$f & 3);
                                byte b6 = (byte) (b5 - 1);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(offsetAfter, scrollBarSize, i10, -450685997, false, $$g(b5, b6, b6), new Class[]{Object.class, Object.class});
                            }
                            ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
                            j = 0;
                        }
                        cArr2 = cArr4;
                    }
                    objArr[0] = new String(cArr2);
                    int i11 = $11 + 59;
                    $10 = i11 % 128;
                    int i12 = i11 % 2;
                }

                @Override // java.lang.Runnable
                public final void run() throws Throwable {
                    Object[] objArr;
                    int i = 2 % 2;
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        char cIndexOf = (char) (TextUtils.indexOf("", "") + 31533);
                        int iResolveOpacity = 921 - Drawable.resolveOpacity(0, 0);
                        int i2 = 29 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1));
                        byte[] bArr = $$a;
                        Object[] objArr2 = new Object[1];
                        a(bArr[37], (byte) ($$b | 16), bArr[80], objArr2);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cIndexOf, iResolveOpacity, i2, -1048449946, false, (String) objArr2[0], null);
                    }
                    long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
                    Object[] objArr3 = new Object[1];
                    c(false, 171 - (Process.myTid() >> 22), 22 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), KeyEvent.keyCodeFromString("") + 7, new char[]{2, '\n', 65504, '\t', '\f', 0, '\b', 65534, 11, 1, 15, '\f', 6, 1, 65483, '\f', 16, 65483, 65520, 22, 16, 17}, objArr3);
                    Class<?> cls = Class.forName((String) objArr3[0]);
                    Object[] objArr4 = new Object[1];
                    c(false, Color.green(0) + 175, 15 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), 4 - TextUtils.getOffsetBefore("", 0), new char[]{'\r', 2, 6, 65534, 65534, 5, 65530, '\t', '\f', 65534, 65533, 65515, 65534, 65530, 5}, objArr4);
                    long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(889369593);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                        char modifierMetaStateMask = (char) (((byte) KeyEvent.getModifierMetaStateMask()) + 31534);
                        int iKeyCodeFromString = KeyEvent.keyCodeFromString("") + 921;
                        int iIndexOf = 27 - TextUtils.indexOf((CharSequence) "", '0', 0);
                        byte b = $$a[80];
                        byte b2 = b;
                        Object[] objArr5 = new Object[1];
                        a(b, b2, b2, objArr5);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(modifierMetaStateMask, iKeyCodeFromString, iIndexOf, -778300370, false, (String) objArr5[0], null);
                    }
                    if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
                        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 105;
                        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i3 % 128;
                        int i4 = i3 % 2;
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                            char cRed = (char) (Color.red(0) + 31533);
                            int iAxisFromString = MotionEvent.axisFromString("") + 922;
                            int iAlpha = 28 - Color.alpha(0);
                            byte[] bArr2 = $$a;
                            Object[] objArr6 = new Object[1];
                            a(bArr2[80], bArr2[33], bArr2[37], objArr6);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(cRed, iAxisFromString, iAlpha, -1142834547, false, (String) objArr6[0], null);
                        }
                        Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
                        objArr = new Object[]{new int[1], new int[]{((int[]) objArr7[1])[0]}, (Object[]) objArr7[2], new int[]{((int[]) objArr7[3])[0]}, (String[]) objArr7[4]};
                        int i5 = ~((int) Runtime.getRuntime().freeMemory());
                        int i6 = (-370332825) + ((~(1073474927 | i5)) * 52) + (((~(1072850222 | i5)) | (~((-701229422) | i5)) | 624705) * (-52)) + (((~(i5 | (-1072850223))) | 372245506) * 52) + 937943383;
                        int i7 = (i6 << 13) ^ i6;
                        int i8 = i7 ^ (i7 >>> 17);
                        ((int[]) objArr[0])[0] = i8 ^ (i8 << 5);
                    } else {
                        Object[] objArr8 = new Object[1];
                        c(false, 171 - ExpandableListView.getPackedPositionGroup(0L), 25 - TextUtils.lastIndexOf("", '0', 0, 0), 18 - TextUtils.lastIndexOf("", '0', 0, 0), new char[]{65483, 65534, '\r', '\r', 65483, 65502, 0, 17, 6, 19, 6, 17, 22, 65521, 5, 15, 2, 65534, 1, 65534, 11, 1, 15, '\f', 6, 1}, objArr8);
                        Class<?> cls2 = Class.forName((String) objArr8[0]);
                        Object[] objArr9 = new Object[1];
                        c(false, (ViewConfiguration.getLongPressTimeout() >> 16) + 178, (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 17, 15 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), new char[]{65531, 4, '\n', 65495, 6, 6, 2, 65535, 65529, 65527, '\n', 65535, 5, 4, 65529, 11, '\b', '\b'}, objArr9);
                        Context applicationContext = (Context) cls2.getMethod((String) objArr9[0], new Class[0]).invoke(null, null);
                        if (applicationContext != null) {
                            applicationContext = ((applicationContext instanceof ContextWrapper) && ((ContextWrapper) applicationContext).getBaseContext() == null) ? null : applicationContext.getApplicationContext();
                        }
                        Object[] objArr10 = new Object[1];
                        c(true, (ViewConfiguration.getEdgeSlop() >> 16) + 170, 17 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 10, new char[]{5, '\f', 65535, '\n', 65484, 65535, 20, 65535, '\b', 11, 3, 18, 17, 23, 65521, 65484}, objArr10);
                        Class<?> cls3 = Class.forName((String) objArr10[0]);
                        Object[] objArr11 = new Object[1];
                        c(true, View.combineMeasuredStates(0, 0) + 174, 17 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), Color.alpha(0) + 11, new char[]{'\r', 65531, 65506, 19, 14, 3, 14, '\b', 65535, 65534, 3, 65535, 65534, '\t', 65501, 2}, objArr11);
                        int iIntValue = ((Integer) cls3.getMethod((String) objArr11[0], Object.class).invoke(null, this)).intValue();
                        int i9 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 21;
                        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i9 % 128;
                        int i10 = i9 % 2;
                        try {
                            Object[] objArr12 = {applicationContext, Integer.valueOf(iIntValue), 0, 937943383};
                            byte[] bArr3 = $$d;
                            byte b3 = bArr3[44];
                            byte b4 = bArr3[1];
                            Object[] objArr13 = new Object[1];
                            d(b3, b4, b4, objArr13);
                            Class<?> cls4 = Class.forName((String) objArr13[0]);
                            byte b5 = bArr3[1];
                            byte b6 = bArr3[44];
                            Object[] objArr14 = new Object[1];
                            d(b5, b6, b6, objArr14);
                            Object[] objArr15 = (Object[]) cls4.getMethod((String) objArr14[0], Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr12);
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                                char maximumDrawingCacheSize = (char) (31533 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24));
                                int iLastIndexOf = 920 - TextUtils.lastIndexOf("", '0');
                                int iCombineMeasuredStates = 28 - View.combineMeasuredStates(0, 0);
                                byte[] bArr4 = $$a;
                                Object[] objArr16 = new Object[1];
                                a(bArr4[80], bArr4[33], bArr4[37], objArr16);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(maximumDrawingCacheSize, iLastIndexOf, iCombineMeasuredStates, -1142834547, false, (String) objArr16[0], null);
                            }
                            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr15);
                            try {
                                Object[] objArr17 = new Object[1];
                                c(false, 170 - MotionEvent.axisFromString(""), (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 22, 8 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), new char[]{2, '\n', 65504, '\t', '\f', 0, '\b', 65534, 11, 1, 15, '\f', 6, 1, 65483, '\f', 16, 65483, 65520, 22, 16, 17}, objArr17);
                                Class<?> cls5 = Class.forName((String) objArr17[0]);
                                Object[] objArr18 = new Object[1];
                                c(false, 174 - ImageFormat.getBitsPerPixel(0), 16 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), Color.argb(0, 0, 0, 0) + 4, new char[]{'\r', 2, 6, 65534, 65534, 5, 65530, '\t', '\f', 65534, 65533, 65515, 65534, 65530, 5}, objArr18);
                                long jLongValue2 = ((Long) cls5.getDeclaredMethod((String) objArr18[0], new Class[0]).invoke(null, new Object[0])).longValue();
                                Long lValueOf = Long.valueOf(jLongValue2);
                                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(889369593);
                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                                    char doubleTapTimeout = (char) (31533 - (ViewConfiguration.getDoubleTapTimeout() >> 16));
                                    int iResolveSize = 921 - View.resolveSize(0, 0);
                                    int iIndexOf2 = 27 - TextUtils.indexOf((CharSequence) "", '0', 0);
                                    byte b7 = $$a[80];
                                    byte b8 = b7;
                                    Object[] objArr19 = new Object[1];
                                    a(b7, b8, b8, objArr19);
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(doubleTapTimeout, iResolveSize, iIndexOf2, -778300370, false, (String) objArr19[0], null);
                                }
                                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                                Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                                    char jumpTapTimeout = (char) ((ViewConfiguration.getJumpTapTimeout() >> 16) + 31533);
                                    int i11 = (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 920;
                                    int i12 = (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 27;
                                    byte[] bArr5 = $$a;
                                    Object[] objArr20 = new Object[1];
                                    a(bArr5[37], (byte) ($$b | 16), bArr5[80], objArr20);
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(jumpTapTimeout, i11, i12, -1048449946, false, (String) objArr20[0], null);
                                }
                                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf2);
                                int i13 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 87;
                                TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i13 % 128;
                                int i14 = i13 % 2;
                                objArr = objArr15;
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
                    int i15 = ((int[]) objArr[1])[0];
                    int i16 = ((int[]) objArr[3])[0];
                    if (i16 != i15) {
                        ArrayList arrayList = new ArrayList();
                        String[] strArr = (String[]) objArr[4];
                        if (strArr != null) {
                            for (String str : strArr) {
                                arrayList.add(str);
                            }
                        }
                        throw new RuntimeException(String.valueOf(i16));
                    }
                    int i17 = ((int[]) objArr[0])[0];
                    Object[] objArr21 = {new int[1], new int[]{((int[]) objArr[1])[0]}, (Object[]) objArr[2], new int[]{((int[]) objArr[3])[0]}, (String[]) objArr[4]};
                    int elapsedCpuTime = (int) Process.getElapsedCpuTime();
                    int i18 = ~elapsedCpuTime;
                    int i19 = i17 + (-990743049) + (((~((-1467150792) | i18)) | (-306928853) | (~(1467150791 | elapsedCpuTime))) * (-564)) + ((~(elapsedCpuTime | (-592913))) * 1128) + (((~((-306928853) | i18)) | (-1467743704)) * 564);
                    int i20 = (i19 << 13) ^ i19;
                    int i21 = i20 ^ (i20 >>> 17);
                    ((int[]) objArr21[0])[0] = i21 ^ (i21 << 5);
                    createPipelineAndUpdateChildrenSpecs.this.notifyDataSetChanged();
                }

                private static String $$g(byte b, short s, byte b2) {
                    int i = 3 - (s * 3);
                    byte[] bArr = $$c;
                    int i2 = b2 * 4;
                    int i3 = 120 - b;
                    byte[] bArr2 = new byte[i2 + 1];
                    int i4 = -1;
                    if (bArr == null) {
                        i3 = (-i3) + i;
                        i4 = -1;
                    }
                    while (true) {
                        int i5 = i;
                        int i6 = i3;
                        int i7 = i4 + 1;
                        int i8 = i5 + 1;
                        bArr2[i7] = (byte) i6;
                        if (i7 == i2) {
                            return new String(bArr2, 0);
                        }
                        i = i8;
                        i3 = (-bArr[i8]) + i6;
                        i4 = i7;
                    }
                }
            });
            if (createPipelineAndUpdateChildrenSpecs.this.b != null) {
                createPipelineAndUpdateChildrenSpecs.this.b.TuitionPaymentFragmentbindingInflater1(promo);
            }
        }
    }

    public createPipelineAndUpdateChildrenSpecs(int i, String str, TuitionPaymentFragmentspecialinlinedviewModeldefault1 tuitionPaymentFragmentspecialinlinedviewModeldefault1) {
        this.b = tuitionPaymentFragmentspecialinlinedviewModeldefault1;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = str;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.TuitionPaymentFragmentbindingInflater1.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        b bVar = (b) viewHolder;
        Promo promo = this.TuitionPaymentFragmentbindingInflater1.get(i);
        bVar.TuitionPaymentFragmentspecialinlinedviewModeldefault3.setOnCheckedChangeListener(null);
        bVar.TuitionPaymentFragmentspecialinlinedviewModeldefault3.setText(promo.getName());
        bVar.TuitionPaymentFragmentspecialinlinedviewModeldefault2.setText(onConnectionFailed.TuitionPaymentFragmentbindingInflater1(bVar.itemView.getContext(), promo.getCalculatedDiscountAmount(), createPipelineAndUpdateChildrenSpecs.this.TuitionPaymentFragmentspecialinlinedviewModeldefault1));
        if (promo.isSelected()) {
            bVar.TuitionPaymentFragmentspecialinlinedviewModeldefault3.setChecked(true);
        } else {
            bVar.TuitionPaymentFragmentspecialinlinedviewModeldefault3.setChecked(false);
        }
        bVar.TuitionPaymentFragmentspecialinlinedviewModeldefault3.setOnCheckedChangeListener(bVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new b(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.layout_row_promos, viewGroup, false));
    }

    public static /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault2(createPipelineAndUpdateChildrenSpecs createpipelineandupdatechildrenspecs, Promo promo, boolean z) {
        for (Promo promo2 : createpipelineandupdatechildrenspecs.TuitionPaymentFragmentbindingInflater1) {
            if (promo2.getId() == promo.getId()) {
                promo2.setSelected(z);
            } else {
                promo2.setSelected(false);
            }
        }
    }
}
