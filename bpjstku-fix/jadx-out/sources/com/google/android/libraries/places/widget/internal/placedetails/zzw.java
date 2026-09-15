package com.google.android.libraries.places.widget.internal.placedetails;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;
import androidx.exifinterface.media.ExifInterface;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.libraries.places.R;
import com.google.android.libraries.places.api.model.FuelPrice;
import defpackage.getSupportedPostviewSize;
import defpackage.initSession;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Currency;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.ByteCompanionObject;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;

/* JADX INFO: loaded from: classes3.dex */
public final class zzw extends RecyclerView.Adapter {
    private final List zza;
    private final Instant zzb;
    private static final byte[] $$c = {43, 23, 22, -14};
    private static final int $$f = 182;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$d = {110, -73, -111, 99, 9, -5, -66, 54, 5, -3, -11, 2, -10, -58, 48, 10, -13, 11, -6, -9, -8, -57, 54, 3, 3, -72, 56, 2, 3, -18, 10, -7, -16, 8, -65, 59, 0, -15, -5, 16, -14, 3, -4, -67, 73, -3, -24, -4, 30, -15, 8, -14, 3, -4, -33, 14, 21, -15, -11, 6, 3, -49, 41, -20, 3, 3, -11, 6, 3, -4, -6, -14, -5, 3, -11, 8, -6, 2, -5, -6, 2, -12, -4, 15, -16, -7, 15, -45, 31, -14, -2, 4, -11, -2, -2, -8, 17, -12, 5, -70};
    private static final int $$e = 241;
    private static final byte[] $$a = {39, 27, 2, 54, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 54, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 55, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, 7, -18, -16, -1, -16, -16, -4, 19, -48, -3, -17, 0, -30, 4, -24, 54};
    private static final int $$b = 211;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f797a = 1;
    private static char[] b = {47413, 47400, 47410, 47396, 47399, 47405, 47336, 47395, 47363, 47453, 47394, 47409, 47401, 47379, 47402, 47411, 47403, 47398, 47364, 47381, 47392, 47362, 47406, 47393};
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 2047719638;
    private static boolean TuitionPaymentFragmentspecialinlinedviewModeldefault3 = true;
    private static boolean TuitionPaymentFragmentbindingInflater1 = true;

    public zzw(List list, Instant instant) {
        Intrinsics.checkNotNullParameter(list, "");
        this.zza = list;
        this.zzb = instant;
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
    private static void c(int r7, int r8, int r9, java.lang.Object[] r10) {
        /*
            int r9 = r9 * 4
            int r9 = r9 + 84
            byte[] r0 = com.google.android.libraries.places.widget.internal.placedetails.zzw.$$a
            int r8 = r8 + 4
            int r7 = r7 * 15
            int r7 = r7 + 38
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L15
            r3 = r9
            r4 = r2
            r9 = r8
            goto L2d
        L15:
            r3 = r2
        L16:
            int r4 = r3 + 1
            byte r5 = (byte) r9
            r1[r3] = r5
            if (r4 != r7) goto L25
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            r10[r2] = r7
            return
        L25:
            int r8 = r8 + 1
            r3 = r0[r8]
            r6 = r9
            r9 = r8
            r8 = r3
            r3 = r6
        L2d:
            int r8 = -r8
            int r3 = r3 + r8
            int r8 = r3 + (-11)
            r3 = r4
            r6 = r9
            r9 = r8
            r8 = r6
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.places.widget.internal.placedetails.zzw.c(int, int, int, java.lang.Object[]):void");
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0026  */
    /* JADX WARN: Code duplicated, block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x002c). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0026
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void e(int r5, int r6, byte r7, java.lang.Object[] r8) {
        /*
            int r5 = r5 * 15
            int r5 = 99 - r5
            byte[] r0 = com.google.android.libraries.places.widget.internal.placedetails.zzw.$$d
            int r6 = r6 * 8
            int r1 = r6 + 45
            int r7 = r7 * 44
            int r7 = 47 - r7
            byte[] r1 = new byte[r1]
            int r6 = r6 + 44
            r2 = 0
            if (r0 != 0) goto L18
            r4 = r6
            r3 = r2
            goto L2c
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
            int r7 = r7 + 1
            r4 = r0[r7]
            int r3 = r3 + 1
        L2c:
            int r5 = r5 + r4
            int r5 = r5 + 3
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.places.widget.internal.placedetails.zzw.e(int, int, byte, java.lang.Object[]):void");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 37;
        f797a = i2 % 128;
        int i3 = i2 % 2;
        int size = this.zza.size();
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 97;
        f797a = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 25 / 0;
        }
        return size;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final /* synthetic */ void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        String string;
        String string2;
        int i2 = 2 % 2;
        zzv zzvVar = (zzv) viewHolder;
        Intrinsics.checkNotNullParameter(zzvVar, "");
        FuelPrice fuelPrice = (FuelPrice) this.zza.get(i);
        Context context = zzvVar.itemView.getContext();
        TextView textViewZza = zzvVar.zza();
        FuelPrice.FuelType type = fuelPrice.getType();
        Intrinsics.checkNotNullExpressionValue(type, "");
        Intrinsics.checkNotNull(context);
        Intrinsics.checkNotNullParameter(type, "");
        Intrinsics.checkNotNullParameter(context, "");
        int iOrdinal = type.ordinal();
        if (iOrdinal == 1) {
            string = context.getString(R.string.fuel_type_diesel);
            Intrinsics.checkNotNullExpressionValue(string, "");
        } else if (iOrdinal != 2) {
            int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 107;
            f797a = i3 % 128;
            if (i3 % 2 != 0 ? iOrdinal == 3 : iOrdinal == 4) {
                string = context.getString(R.string.fuel_type_midgrade);
                Intrinsics.checkNotNullExpressionValue(string, "");
            } else if (iOrdinal != 4) {
                string = "";
            } else {
                string = context.getString(R.string.fuel_type_premium);
                Intrinsics.checkNotNullExpressionValue(string, "");
            }
        } else {
            string = context.getString(R.string.fuel_type_regular);
            Intrinsics.checkNotNullExpressionValue(string, "");
        }
        textViewZza.setText(string);
        TextView textViewZzb = zzvVar.zzb();
        Instant instant = this.zzb;
        Intrinsics.checkNotNullParameter(fuelPrice, "");
        Intrinsics.checkNotNullParameter(context, "");
        Locale locale = Locale.getDefault();
        Intrinsics.checkNotNullExpressionValue(locale, "");
        Currency currency = Currency.getInstance(fuelPrice.getPrice().getCurrencyCode());
        Intrinsics.checkNotNullExpressionValue(currency, "");
        String symbol = currency.getSymbol(locale);
        Intrinsics.checkNotNullExpressionValue(symbol, "");
        double dLongValue = fuelPrice.getPrice().getUnits().longValue();
        double dIntValue = fuelPrice.getPrice().getNanos().intValue();
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String str = String.format(locale, "%.2f", Arrays.copyOf(new Object[]{Double.valueOf(dLongValue + (dIntValue / 1.0E9d))}, 1));
        Intrinsics.checkNotNullExpressionValue(str, "");
        if (zzx.zzb(fuelPrice, instant)) {
            string2 = context.getString(R.string.stale_fuel_price, symbol, str);
            Intrinsics.checkNotNull(string2);
        } else {
            string2 = context.getString(R.string.fuel_price, symbol, str);
            Intrinsics.checkNotNull(string2);
            int i4 = f797a + 47;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i4 % 128;
            int i5 = i4 % 2;
        }
        textViewZzb.setText(string2);
    }

    private static void d(char[] cArr, int[] iArr, int i, byte[] bArr, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        getSupportedPostviewSize getsupportedpostviewsize = new getSupportedPostviewSize();
        char[] cArr2 = b;
        char c = 0;
        if (cArr2 != null) {
            int i3 = $10 + 95;
            $11 = i3 % 128;
            int i4 = i3 % 2;
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i5 = 0;
            while (i5 < length) {
                try {
                    Object[] objArr2 = new Object[1];
                    objArr2[c] = Integer.valueOf(cArr2[i5]);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1561626312);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        byte b2 = (byte) 1;
                        byte b3 = (byte) (b2 - 1);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (TextUtils.getTrimmedLength("") + 31339), 2994 - (ViewConfiguration.getFadingEdgeLength() >> 16), (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 17, 1182129903, false, $$g(b2, b3, b3), new Class[]{Integer.TYPE});
                    }
                    cArr3[i5] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                    i5++;
                    c = 0;
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
        Object[] objArr3 = {Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault2)};
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-499324958);
        char c2 = '0';
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (43325 - (ViewConfiguration.getFadingEdgeLength() >> 16)), (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 253, AndroidCharacter.getMirror('0') - 26, 111296565, false, ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, new Class[]{Integer.TYPE});
        }
        int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).intValue();
        int i6 = 33602;
        int i7 = 1687675375;
        if (!(!TuitionPaymentFragmentbindingInflater1)) {
            getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 = bArr.length;
            char[] cArr4 = new char[getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1];
            getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
            while (getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 < getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1) {
                int i8 = $11 + 103;
                $10 = i8 % 128;
                int i9 = i8 % 2;
                cArr4[getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) (cArr2[bArr[(getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 - 1) - getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] + i] - iIntValue);
                Object[] objArr4 = {getsupportedpostviewsize, getsupportedpostviewsize};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1687675375);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    byte b4 = (byte) 0;
                    byte b5 = b4;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (Gravity.getAbsoluteGravity(0, 0) + 33602), (Process.myPid() >> 22) + 3085, Color.argb(0, 0, 0, 0) + 26, -2146875848, false, $$g(b4, b5, b5), new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
            }
            objArr[0] = new String(cArr4);
            return;
        }
        if (TuitionPaymentFragmentspecialinlinedviewModeldefault3) {
            getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 = cArr.length;
            char[] cArr5 = new char[getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1];
            getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
            while (getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 < getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1) {
                cArr5[getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) (cArr2[cArr[(getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 - 1) - getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] - i] - iIntValue);
                try {
                    Object[] objArr5 = {getsupportedpostviewsize, getsupportedpostviewsize};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(i7);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        byte b6 = (byte) 0;
                        byte b7 = b6;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (((Process.getThreadPriority(0) + 20) >> 6) + i6), TextUtils.lastIndexOf("", c2) + 3086, 26 - Color.argb(0, 0, 0, 0), -2146875848, false, $$g(b6, b7, b7), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5);
                    c2 = '0';
                    i6 = 33602;
                    i7 = 1687675375;
                } catch (Throwable th2) {
                    Throwable cause2 = th2.getCause();
                    if (cause2 == null) {
                        throw th2;
                    }
                    throw cause2;
                }
            }
            objArr[0] = new String(cArr5);
            return;
        }
        int i10 = 0;
        getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 = iArr.length;
        char[] cArr6 = new char[getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1];
        while (true) {
            getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i10;
            if (getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 >= getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1) {
                objArr[0] = new String(cArr6);
                int i11 = $10 + 103;
                $11 = i11 % 128;
                int i12 = i11 % 2;
                return;
            }
            cArr6[getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) (cArr2[iArr[(getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 - 1) - getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] - i] - iIntValue);
            i10 = getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 1;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v1, types: [boolean, int] */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final /* synthetic */ RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) throws Throwable {
        Object[] objArr;
        char c;
        Object[] objArr2;
        char c2;
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(viewGroup, "");
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(viewGroup.getContext());
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(797565291);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char cAlpha = (char) Color.alpha(0);
            int i3 = 2268 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1));
            int absoluteGravity = Gravity.getAbsoluteGravity(0, 0) + 33;
            byte[] bArr = $$a;
            Object[] objArr3 = new Object[1];
            c(bArr[5], bArr[132], bArr[7], objArr3);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cAlpha, i3, absoluteGravity, -887667012, false, (String) objArr3[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr4 = new Object[1];
        d(null, null, ((byte) KeyEvent.getModifierMetaStateMask()) + ByteCompanionObject.MIN_VALUE, new byte[]{-111, -112, -123, -113, -114, -115, -116, -117, -120, -118, -119, -121, -120, -123, -121, -125, -122, -123, -124, -125, -126, -127}, objArr4);
        Class<?> cls = Class.forName((String) objArr4[0]);
        Object[] objArr5 = new Object[1];
        d(null, null, 127 - Color.green(0), new byte[]{-116, -115, -122, -117, -113, -127, -116, -109, -125, -116, -120, -110, -127, -113, -116}, objArr5);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr5[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(796641770);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char capsMode = (char) TextUtils.getCapsMode("", 0, 0);
            int pressedStateDuration = (ViewConfiguration.getPressedStateDuration() >> 16) + 2267;
            int iResolveSize = View.resolveSize(0, 0) + 33;
            byte[] bArr2 = $$a;
            byte b2 = bArr2[5];
            Object[] objArr6 = new Object[1];
            c(b2, (byte) (b2 | 50), bArr2[7], objArr6);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(capsMode, pressedStateDuration, iResolveSize, -874156483, false, (String) objArr6[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1013250600);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char scrollDefaultDelay = (char) (ViewConfiguration.getScrollDefaultDelay() >> 16);
                int scrollDefaultDelay2 = 2267 - (ViewConfiguration.getScrollDefaultDelay() >> 16);
                int i4 = (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 33;
                byte b3 = $$a[7];
                byte b4 = b3;
                Object[] objArr7 = new Object[1];
                c(b4, (byte) (b4 | 103), b3, objArr7);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(scrollDefaultDelay, scrollDefaultDelay2, i4, -654680577, false, (String) objArr7[0], null);
            }
            Object[] objArr8 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            objArr = new Object[]{new int[]{i}, strArr, new int[]{i ^ (i << 5)}, new int[]{i}};
            int i5 = ((int[]) objArr8[0])[0];
            int i6 = ((int[]) objArr8[3])[0];
            String[] strArr = (String[]) objArr8[1];
            int i7 = ~((-744778296) | i);
            int i8 = ~i;
            int i9 = (-1941791275) + ((i7 | (~(804256319 | i8))) * (-406)) + ((~((-740321300) | i8)) * (-406)) + (((~((-63935021) | i)) | (~(i8 | 744778295))) * 406) + 1525482241;
            int i10 = (i9 << 13) ^ i9;
            int i11 = i10 ^ (i10 >>> 17);
            c = 3;
        } else {
            Object[] objArr9 = new Object[1];
            d(null, null, (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 127, new byte[]{-125, -127, -116, -124, -105, -106, -118, -117, -122, -107, -122, -117, -112, -108, -121, -110, -110, -127, -121, -125, -122, -123, -124, -125, -126, -127}, objArr9);
            Class<?> cls2 = Class.forName((String) objArr9[0]);
            Object[] objArr10 = new Object[1];
            d(null, null, 127 - Color.red(0), new byte[]{-126, -123, -122, -117, -127, -112, -122, -113, -110, -110, -108, -117, -126, -116, -124, -124, -104, -112}, objArr10);
            Context applicationContext = (Context) cls2.getMethod((String) objArr10[0], new Class[0]).invoke(null, null);
            if (applicationContext != null) {
                applicationContext = ((applicationContext instanceof ContextWrapper) && ((ContextWrapper) applicationContext).getBaseContext() == null) ? null : applicationContext.getApplicationContext();
            }
            try {
                Object[] objArr11 = {applicationContext, Integer.valueOf(i), 0, 1525482241};
                byte[] bArr3 = $$d;
                byte b5 = bArr3[36];
                byte b6 = b5;
                Object[] objArr12 = new Object[1];
                e(b5, b6, (byte) (b6 + 1), objArr12);
                Class<?> cls3 = Class.forName((String) objArr12[0]);
                byte b7 = (byte) ($$e & 7);
                Object[] objArr13 = new Object[1];
                e(b7, b7, bArr3[36], objArr13);
                Object[] objArr14 = (Object[]) cls3.getMethod((String) objArr13[0], Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr11);
                if (applicationContext != null) {
                    int i12 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 61;
                    f797a = i12 % 128;
                    int i13 = i12 % 2;
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1013250600);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        char keyRepeatTimeout = (char) (ViewConfiguration.getKeyRepeatTimeout() >> 16);
                        int maximumDrawingCacheSize = 2267 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24);
                        int defaultSize = 33 - View.getDefaultSize(0, 0);
                        byte b8 = $$a[7];
                        byte b9 = b8;
                        Object[] objArr15 = new Object[1];
                        c(b9, (byte) (b9 | 103), b8, objArr15);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(keyRepeatTimeout, maximumDrawingCacheSize, defaultSize, -654680577, false, (String) objArr15[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr14);
                    try {
                        Object[] objArr16 = new Object[1];
                        d(null, null, 127 - (Process.myPid() >> 22), new byte[]{-111, -112, -123, -113, -114, -115, -116, -117, -120, -118, -119, -121, -120, -123, -121, -125, -122, -123, -124, -125, -126, -127}, objArr16);
                        Class<?> cls4 = Class.forName((String) objArr16[0]);
                        Object[] objArr17 = new Object[1];
                        d(null, null, (ViewConfiguration.getLongPressTimeout() >> 16) + 127, new byte[]{-116, -115, -122, -117, -113, -127, -116, -109, -125, -116, -120, -110, -127, -113, -116}, objArr17);
                        long jLongValue2 = ((Long) cls4.getDeclaredMethod((String) objArr17[0], new Class[0]).invoke(null, new Object[0])).longValue();
                        Long lValueOf = Long.valueOf(jLongValue2);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(796641770);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                            char maxKeyCode = (char) (KeyEvent.getMaxKeyCode() >> 16);
                            int i14 = 2268 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1));
                            int i15 = 33 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
                            byte[] bArr4 = $$a;
                            byte b10 = bArr4[5];
                            Object[] objArr18 = new Object[1];
                            c(b10, (byte) (b10 | 50), bArr4[7], objArr18);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(maxKeyCode, i14, i15, -874156483, false, (String) objArr18[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                        Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(797565291);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                            char cKeyCodeFromString = (char) KeyEvent.keyCodeFromString("");
                            int bitsPerPixel = ImageFormat.getBitsPerPixel(0) + 2268;
                            int i16 = 34 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1));
                            byte[] bArr5 = $$a;
                            Object[] objArr19 = new Object[1];
                            c(bArr5[5], bArr5[132], bArr5[7], objArr19);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(cKeyCodeFromString, bitsPerPixel, i16, -887667012, false, (String) objArr19[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf2);
                    } catch (Exception unused) {
                        throw new RuntimeException();
                    }
                }
                objArr = objArr14;
                c = 3;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            }
        }
        int i17 = ((int[]) objArr[c])[0];
        int i18 = ((int[]) objArr[0])[0];
        if (i18 == i17) {
            int i19 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 81;
            int i20 = i19 % 128;
            f797a = i20;
            int i21 = i19 % 2;
            objArr2 = new Object[]{new int[]{i}, strArr, new int[]{i ^ (i << 5)}, new int[]{i}};
            int i22 = ((int[]) objArr[2])[0];
            int i23 = ((int[]) objArr[0])[0];
            int i24 = ((int[]) objArr[3])[0];
            String[] strArr2 = (String[]) objArr[1];
            int i25 = ~i;
            int i26 = i22 + (-1965648581) + (((~(i25 | (-553853210))) | (~((-246471299) | i25))) * (-184)) + ((4194404 | (~((-250665703) | i25)) | (~((-558047614) | i25))) * 184) + 2002591560;
            int i27 = (i26 << 13) ^ i26;
            int i28 = i27 ^ (i27 >>> 17);
            int i29 = i20 + 111;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i29 % 128;
            int i30 = i29 % 2;
            c2 = 2;
        } else {
            ArrayList arrayList = new ArrayList();
            String[] strArr3 = (String[]) objArr[1];
            if (strArr3 != null) {
                int i31 = f797a + 105;
                TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i31 % 128;
                int i32 = i31 % 2;
                int i33 = 0;
                while (i33 < strArr3.length) {
                    arrayList.add(strArr3[i33]);
                    i33++;
                    int i34 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 83;
                    f797a = i34 % 128;
                    int i35 = i34 % 2;
                }
            }
            Toast.makeText((Context) null, i18 / (((i18 - 1) * i18) % 2), 0).show();
            objArr2 = new Object[]{new int[]{i}, strArr, new int[1], new int[]{i}};
            int i36 = ((int[]) objArr[2])[0];
            int i37 = ((int[]) objArr[0])[0];
            int i38 = ((int[]) objArr[3])[0];
            String[] strArr4 = (String[]) objArr[1];
            int iFreeMemory = (int) Runtime.getRuntime().freeMemory();
            int i39 = ~iFreeMemory;
            int i40 = i36 + (-1465128305) + (((-705794561) | iFreeMemory) * (-676)) + (((~(94529979 | i39)) | 705794560) * 676) + (((~(iFreeMemory | 800324539)) | (~(i39 | (-714183337))) | 8388776) * 676);
            int i41 = (i40 << 13) ^ i40;
            int i42 = i41 ^ (i41 >>> 17);
            c2 = 2;
            ((int[]) objArr2[2])[0] = i42 ^ (i42 << 5);
        }
        int i43 = R.layout.fuel_option_item;
        int i44 = ((int[]) objArr2[c2])[0];
        int i45 = ((i44 * i44) - (~(-(566599344 * i44)))) - 1;
        int i46 = -(i44 * (-364942000));
        int i47 = (i45 ^ i46) + ((i46 & i45) << 1);
        int i48 = (i47 & 1579417600) + (1579417600 | i47);
        int i49 = i48 >> 18;
        int i50 = ((i49 ^ (-32767)) + ((i49 & (-32767)) << 1)) / 16384;
        int i51 = -(((i48 - (~((i50 & 1) + (i50 | 1)))) - 1) ^ ((((i48 >> 17) - 65535) / 32768) + 1));
        int i52 = (i51 & 4) + (i51 | 4);
        int i53 = ((i52 >> 18) - 32767) / 16384;
        View viewInflate = layoutInflaterFrom.inflate(i43, viewGroup, (boolean) (0 / (((-((((i53 | 1) << 1) - (i53 ^ 1)) + 1)) & i52) * 1607)));
        Intrinsics.checkNotNull(viewInflate);
        return new zzv(viewInflate);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0022  */
    /* JADX WARN: Code duplicated, block: B:8:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:11:0x0029). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0022
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$g(int r7, byte r8, int r9) {
        /*
            int r8 = r8 * 3
            int r8 = 3 - r8
            int r7 = r7 + 67
            byte[] r0 = com.google.android.libraries.places.widget.internal.placedetails.zzw.$$c
            int r9 = r9 * 3
            int r9 = r9 + 1
            byte[] r1 = new byte[r9]
            r2 = 0
            if (r0 != 0) goto L14
            r3 = r8
            r5 = r2
            goto L29
        L14:
            r3 = r2
        L15:
            byte r4 = (byte) r7
            int r5 = r3 + 1
            r1[r3] = r4
            if (r5 != r9) goto L22
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            return r7
        L22:
            int r8 = r8 + 1
            r3 = r0[r8]
            r6 = r3
            r3 = r8
            r8 = r6
        L29:
            int r8 = -r8
            int r7 = r7 + r8
            r8 = r3
            r3 = r5
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.places.widget.internal.placedetails.zzw.$$g(int, byte, int):java.lang.String");
    }
}
