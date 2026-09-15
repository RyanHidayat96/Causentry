package defpackage;

import android.content.Context;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.ExpandableListView;
import android.widget.Toast;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.ListAdapter;
import androidx.recyclerview.widget.RecyclerView;
import com.bpjstku.databinding.ItemScholarPersonBinding;
import com.bpjstku.domain.scholarship.model.ScholarPerson;
import com.google.android.material.card.MaterialCardView;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class setZslDisabledByFlashMode extends ListAdapter<ScholarPerson, TuitionPaymentFragmentbindingInflater1> {
    private final Function1<ScholarPerson, Unit> TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    private final Context b;
    private static final byte[] $$c = {43, 23, 22, -14};
    private static final int $$f = 56;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$d = {117, 50, 102, 124, 12, -2, -63, 52, 14, -6, 9, 1, -9, 10, -71, 54, -3, 19, -19, -51, 71, -2, -14, 13, -68, 63, 2, -11, 1, 7, -62, 68, -13, 14, -3, -1, -1, 5, -14, -55, 23, 39, -3, -2, 2, -7, 10, -7, -19, 15, 24, -24, 33, -12, 11, -11, 6, -1, -30, 17, 24, -12, -8, 9, 6, -46, 44, -17, 6, 6, -8, 9, 6, -18, 7, 5, -10, 5, 5, -7, -30, 37, -8, 6, -11, 19, -15, 13, -65};
    private static final int $$e = 221;
    private static final byte[] $$a = {6, -86, -9, -124, -23, 37, -42, -11, 10, -18, 7, 0, -7, -7, -23, 44, -44, -10, 5, -6, -18};
    private static final int $$b = 127;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
    private static int TuitionPaymentFragmentbindingInflater1 = 1;
    private static char[] TuitionPaymentFragmentspecialinlinedviewModeldefault1 = {59703, 59773, 59768, 59751, 59746, 59731, 59740, 59750, 59746, 59756, 59757, 59756, 59746, 59744, 59771, 59751, 59757, 59714, 59717, 59770, 59739, 59723, 59769, 59875, 59873, 59878, 59876, 59886, 59881, 59857, 59857, 59880, 59872, 59899, 59884, 59886, 59884};

    /* JADX WARN: Code duplicated, block: B:10:0x0025  */
    /* JADX WARN: Code duplicated, block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002d). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0025
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void a(byte r6, int r7, int r8, java.lang.Object[] r9) {
        /*
            int r7 = r7 * 3
            int r7 = r7 + 97
            int r8 = r8 + 4
            int r0 = 11 - r6
            byte[] r1 = defpackage.setZslDisabledByFlashMode.$$a
            byte[] r0 = new byte[r0]
            int r6 = 10 - r6
            r2 = 0
            if (r1 != 0) goto L15
            r7 = r6
            r3 = r8
            r4 = r2
            goto L2d
        L15:
            r3 = r2
        L16:
            byte r4 = (byte) r7
            r0[r3] = r4
            int r8 = r8 + 1
            if (r3 != r6) goto L25
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            r9[r2] = r6
            return
        L25:
            int r3 = r3 + 1
            r4 = r1[r8]
            r5 = r3
            r3 = r8
            r8 = r4
            r4 = r5
        L2d:
            int r8 = -r8
            int r7 = r7 + r8
            int r7 = r7 + (-5)
            r8 = r3
            r3 = r4
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.setZslDisabledByFlashMode.a(byte, int, int, java.lang.Object[]):void");
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0028  */
    /* JADX WARN: Code duplicated, block: B:8:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:11:0x002c). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0028
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void d(byte r5, short r6, short r7, java.lang.Object[] r8) {
        /*
            int r5 = r5 * 15
            int r5 = r5 + 84
            byte[] r0 = defpackage.setZslDisabledByFlashMode.$$d
            int r6 = r6 * 11
            int r1 = 49 - r6
            int r7 = r7 * 48
            int r7 = 51 - r7
            byte[] r1 = new byte[r1]
            int r6 = 48 - r6
            r2 = 0
            if (r0 != 0) goto L18
            r4 = r6
            r3 = r2
            goto L2c
        L18:
            r3 = r2
        L19:
            int r7 = r7 + 1
            byte r4 = (byte) r5
            r1[r3] = r4
            if (r3 != r6) goto L28
            java.lang.String r5 = new java.lang.String
            r5.<init>(r1, r2)
            r8[r2] = r5
            return
        L28:
            r4 = r0[r7]
            int r3 = r3 + 1
        L2c:
            int r5 = r5 + r4
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.setZslDisabledByFlashMode.d(byte, short, short, java.lang.Object[]):void");
    }

    public static final /* synthetic */ Function1 TuitionPaymentFragmentspecialinlinedviewModeldefault2(setZslDisabledByFlashMode setzsldisabledbyflashmode) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1;
        int i3 = i2 + 35;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3 % 128;
        int i4 = i3 % 2;
        Function1<ScholarPerson, Unit> function1 = setzsldisabledbyflashmode.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        if (i4 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i5 = i2 + 39;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 86 / 0;
        }
        return function1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final /* synthetic */ void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) throws Throwable {
        Object[] objArr;
        char c;
        Object[] objArr2;
        int i2 = 2 % 2;
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 71;
        TuitionPaymentFragmentbindingInflater1 = i3 % 128;
        int i4 = i3 % 2;
        TuitionPaymentFragmentbindingInflater1 tuitionPaymentFragmentbindingInflater1 = (TuitionPaymentFragmentbindingInflater1) viewHolder;
        Intrinsics.checkNotNullParameter(tuitionPaymentFragmentbindingInflater1, "");
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1545400921);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char cKeyCodeFromString = (char) KeyEvent.keyCodeFromString("");
            int mode = 876 - View.MeasureSpec.getMode(0);
            int size = View.MeasureSpec.getSize(0) + 10;
            byte b = $$a[11];
            byte b2 = b;
            Object[] objArr3 = new Object[1];
            a(b, b2, (byte) (b2 - 1), objArr3);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cKeyCodeFromString, mode, size, -1199417970, false, (String) objArr3[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr4 = new Object[1];
        c(new int[]{0, 22, 0, 10}, false, new byte[]{1, 0, 1, 1, 0, 0, 1, 1, 0, 0, 0, 1, 0, 0, 1, 0, 1, 0, 1, 0, 1, 1}, objArr4);
        Class<?> cls = Class.forName((String) objArr4[0]);
        Object[] objArr5 = new Object[1];
        c(new int[]{22, 15, 127, 0}, true, new byte[]{0, 0, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 1, 1, 1}, objArr5);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr5[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-340665130);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char c2 = (char) (1 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)));
            int iRed = Color.red(0) + 876;
            int minimumFlingVelocity = (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 10;
            byte[] bArr = $$a;
            Object[] objArr6 = new Object[1];
            a(bArr[8], (byte) ($$b & 1), (byte) (-bArr[2]), objArr6);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(c2, iRed, minimumFlingVelocity, 254769921, false, (String) objArr6[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1435299656);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char offsetBefore = (char) TextUtils.getOffsetBefore("", 0);
                int i5 = (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 875;
                int trimmedLength = 10 - TextUtils.getTrimmedLength("");
                byte b3 = (byte) ($$b & 3);
                byte[] bArr2 = $$a;
                Object[] objArr7 = new Object[1];
                a(b3, bArr2[11], (byte) (-bArr2[2]), objArr7);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(offsetBefore, i5, trimmedLength, 1324201839, false, (String) objArr7[0], null);
            }
            Object[] objArr8 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            objArr = new Object[]{new int[]{((int[]) objArr8[0])[0]}, new int[1], new int[]{((int[]) objArr8[2])[0]}, (String[]) objArr8[3]};
            int iUptimeMillis = (int) SystemClock.uptimeMillis();
            int i6 = (-758182276) + (((~((~iUptimeMillis) | 62981454)) | 69736993) * 446) + (((~(iUptimeMillis | 132718447)) | 33554690) * 446) + 1983651956;
            int i7 = (i6 << 13) ^ i6;
            int i8 = i7 ^ (i7 >>> 17);
            ((int[]) objArr[1])[0] = i8 ^ (i8 << 5);
            int i9 = TuitionPaymentFragmentbindingInflater1 + 61;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i9 % 128;
            int i10 = i9 % 2;
            c = 2;
        } else {
            try {
                Object[] objArr9 = {Integer.valueOf(i), 945724150};
                byte[] bArr3 = $$d;
                byte b4 = bArr3[11];
                byte b5 = b4;
                Object[] objArr10 = new Object[1];
                d(b5, (byte) (b5 - 1), b4, objArr10);
                Class<?> cls2 = Class.forName((String) objArr10[0]);
                byte b6 = bArr3[11];
                byte b7 = (byte) (b6 - 1);
                byte b8 = b6;
                Object[] objArr11 = new Object[1];
                d(b7, b8, (byte) (b8 - 1), objArr11);
                objArr = (Object[]) cls2.getMethod((String) objArr11[0], Integer.TYPE, Integer.TYPE).invoke(null, objArr9);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1435299656);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    char cArgb = (char) Color.argb(0, 0, 0, 0);
                    int iResolveSize = View.resolveSize(0, 0) + 876;
                    int iBlue = Color.blue(0) + 10;
                    byte b9 = (byte) ($$b & 3);
                    byte[] bArr4 = $$a;
                    Object[] objArr12 = new Object[1];
                    a(b9, bArr4[11], (byte) (-bArr4[2]), objArr12);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(cArgb, iResolveSize, iBlue, 1324201839, false, (String) objArr12[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr);
                try {
                    Object[] objArr13 = new Object[1];
                    c(new int[]{0, 22, 0, 10}, false, new byte[]{1, 0, 1, 1, 0, 0, 1, 1, 0, 0, 0, 1, 0, 0, 1, 0, 1, 0, 1, 0, 1, 1}, objArr13);
                    Class<?> cls3 = Class.forName((String) objArr13[0]);
                    Object[] objArr14 = new Object[1];
                    c(new int[]{22, 15, 127, 0}, true, new byte[]{0, 0, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 1, 1, 1}, objArr14);
                    long jLongValue2 = ((Long) cls3.getDeclaredMethod((String) objArr14[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue2);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-340665130);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                        char cResolveSize = (char) View.resolveSize(0, 0);
                        int offsetBefore2 = TextUtils.getOffsetBefore("", 0) + 876;
                        int bitsPerPixel = 9 - ImageFormat.getBitsPerPixel(0);
                        byte[] bArr5 = $$a;
                        Object[] objArr15 = new Object[1];
                        a(bArr5[8], (byte) ($$b & 1), (byte) (-bArr5[2]), objArr15);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(cResolveSize, offsetBefore2, bitsPerPixel, 254769921, false, (String) objArr15[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1545400921);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                        char mirror = (char) (AndroidCharacter.getMirror('0') - '0');
                        int offsetBefore3 = TextUtils.getOffsetBefore("", 0) + 876;
                        int maximumFlingVelocity = 10 - (ViewConfiguration.getMaximumFlingVelocity() >> 16);
                        byte b10 = $$a[11];
                        byte b11 = b10;
                        Object[] objArr16 = new Object[1];
                        a(b10, b11, (byte) (b11 - 1), objArr16);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(mirror, offsetBefore3, maximumFlingVelocity, -1199417970, false, (String) objArr16[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf2);
                    c = 2;
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
        int i11 = ((int[]) objArr[c])[0];
        int i12 = ((int[]) objArr[0])[0];
        if (i12 == i11) {
            int i13 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 59;
            TuitionPaymentFragmentbindingInflater1 = i13 % 128;
            int i14 = i13 % 2;
            int i15 = ((int[]) objArr[1])[0];
            objArr2 = new Object[]{new int[]{((int[]) objArr[0])[0]}, new int[]{i ^ (i << 5)}, new int[]{((int[]) objArr[2])[0]}, (String[]) objArr[3]};
            int i16 = ~i;
            int i17 = i15 + 2105197428 + (((~((-429406944) | i16)) | 429396116) * 184) + (((-469728000) | i) * (-184)) + ((~(i16 | (-469717173))) * 184);
            int i18 = (i17 << 13) ^ i17;
            int i19 = i18 ^ (i18 >>> 17);
        } else {
            ArrayList arrayList = new ArrayList();
            String[] strArr = (String[]) objArr[3];
            if (strArr != null) {
                for (String str : strArr) {
                    arrayList.add(str);
                }
            }
            Toast.makeText((Context) null, i12 / (((i12 - 1) * i12) % 2), 0).show();
            int i20 = ((int[]) objArr[1])[0];
            objArr2 = new Object[]{new int[]{((int[]) objArr[0])[0]}, new int[1], new int[]{((int[]) objArr[2])[0]}, (String[]) objArr[3]};
            int iIdentityHashCode = System.identityHashCode(this);
            int i21 = (-185537872) + (((~((-283170644) | iIdentityHashCode)) | 242860414) * (-318));
            int i22 = ~(242860414 | iIdentityHashCode);
            int i23 = ~iIdentityHashCode;
            int i24 = i20 + i21 + ((i22 | (~((-236519469) | i23))) * TypedValues.AttributesType.TYPE_PIVOT_TARGET) + (((~(iIdentityHashCode | (-236519469))) | (~(519690111 | i23))) * TypedValues.AttributesType.TYPE_PIVOT_TARGET);
            int i25 = (i24 << 13) ^ i24;
            int i26 = i25 ^ (i25 >>> 17);
            ((int[]) objArr2[1])[0] = i26 ^ (i26 << 5);
        }
        ScholarPerson scholarPerson = getCurrentList().get(i);
        int i27 = ((int[]) objArr2[1])[0];
        int i28 = i27 * i27;
        int i29 = -(593766683 * i27);
        int i30 = (i28 & i29) + (i28 | i29);
        int i31 = -(i27 * (-1717328285));
        int i32 = (i30 ^ i31) + ((i31 & i30) << 1);
        int i33 = (i32 ^ 1128546433) + ((1128546433 & i32) << 1);
        int i34 = i33 >> 29;
        int i35 = ((((i34 | (-15)) << 1) - (i34 ^ (-15))) / 8) + 1;
        int i36 = (i33 ^ i35) + ((i35 & i33) << 1);
        int i37 = i33 >> 16;
        int i38 = -(i36 ^ (((((-131071) & i37) + (i37 | (-131071))) / 65536) + 1));
        int i39 = (i38 ^ 6) + ((i38 & 6) << 1);
        int i40 = ((i39 >> 15) - 262143) / 131072;
        Intrinsics.checkNotNullExpressionValue(scholarPerson, "11,20,0,get(...)".substring(71760 / (((-(((i40 & 1) + (i40 | 1)) + 1)) & i39) * 1495)));
        final ScholarPerson scholarPerson2 = scholarPerson;
        Intrinsics.checkNotNullParameter(scholarPerson2, "");
        ItemScholarPersonBinding itemScholarPersonBinding = tuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        final setZslDisabledByFlashMode setzsldisabledbyflashmode = tuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        itemScholarPersonBinding.itemScholarPersonName.setText(scholarPerson2.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
        itemScholarPersonBinding.itemScholarPersonCode.setText(scholarPerson2.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
        MaterialCardView root = tuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "");
        root.setOnClickListener(new LifecycleCameraRepositoryKey(new Function1() { // from class: lambdanew0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return setZslDisabledByFlashMode.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, scholarPerson2, (View) obj);
            }
        }));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final /* synthetic */ RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(viewGroup, "");
        ItemScholarPersonBinding itemScholarPersonBindingInflate = ItemScholarPersonBinding.inflate(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(itemScholarPersonBindingInflate, "");
        TuitionPaymentFragmentbindingInflater1 tuitionPaymentFragmentbindingInflater1 = new TuitionPaymentFragmentbindingInflater1(this, itemScholarPersonBindingInflate);
        int i3 = TuitionPaymentFragmentbindingInflater1 + 17;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3 % 128;
        if (i3 % 2 == 0) {
            return tuitionPaymentFragmentbindingInflater1;
        }
        throw null;
    }

    static final class TuitionPaymentFragmentspecialinlinedviewModeldefault3 extends DiffUtil.ItemCallback<ScholarPerson> {
        @Override // androidx.recyclerview.widget.DiffUtil.ItemCallback
        public final /* synthetic */ boolean areContentsTheSame(ScholarPerson scholarPerson, ScholarPerson scholarPerson2) {
            ScholarPerson scholarPerson3 = scholarPerson;
            ScholarPerson scholarPerson4 = scholarPerson2;
            Intrinsics.checkNotNullParameter(scholarPerson3, "");
            Intrinsics.checkNotNullParameter(scholarPerson4, "");
            return Intrinsics.areEqual(scholarPerson3.TuitionPaymentFragmentspecialinlinedviewModeldefault3, scholarPerson4.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
        }

        @Override // androidx.recyclerview.widget.DiffUtil.ItemCallback
        public final /* synthetic */ boolean areItemsTheSame(ScholarPerson scholarPerson, ScholarPerson scholarPerson2) {
            ScholarPerson scholarPerson3 = scholarPerson;
            ScholarPerson scholarPerson4 = scholarPerson2;
            Intrinsics.checkNotNullParameter(scholarPerson3, "");
            Intrinsics.checkNotNullParameter(scholarPerson4, "");
            return Intrinsics.areEqual(scholarPerson3.TuitionPaymentFragmentspecialinlinedviewModeldefault3, scholarPerson4.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public setZslDisabledByFlashMode(Context context, Function1<? super ScholarPerson, Unit> function1) {
        super(new TuitionPaymentFragmentspecialinlinedviewModeldefault3());
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(function1, "");
        this.b = context;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = function1;
    }

    public final class TuitionPaymentFragmentbindingInflater1 extends RecyclerView.ViewHolder {
        final /* synthetic */ setZslDisabledByFlashMode TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        final ItemScholarPersonBinding TuitionPaymentFragmentspecialinlinedviewModeldefault3;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TuitionPaymentFragmentbindingInflater1(setZslDisabledByFlashMode setzsldisabledbyflashmode, ItemScholarPersonBinding itemScholarPersonBinding) {
            super(itemScholarPersonBinding.getRoot());
            Intrinsics.checkNotNullParameter(itemScholarPersonBinding, "");
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = setzsldisabledbyflashmode;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = itemScholarPersonBinding;
        }

        public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault3(setZslDisabledByFlashMode setzsldisabledbyflashmode, ScholarPerson scholarPerson, View view) {
            Intrinsics.checkNotNullParameter(view, "");
            setZslDisabledByFlashMode.TuitionPaymentFragmentspecialinlinedviewModeldefault2(setzsldisabledbyflashmode).invoke(scholarPerson);
            return Unit.INSTANCE;
        }
    }

    private static void c(int[] iArr, boolean z, byte[] bArr, Object[] objArr) throws Throwable {
        int i;
        int i2;
        int length;
        char[] cArr;
        int i3 = 2;
        int i4 = 2 % 2;
        setVideoStabilizationMode setvideostabilizationmode = new setVideoStabilizationMode();
        int i5 = 0;
        int i6 = iArr[0];
        int i7 = 1;
        int i8 = iArr[1];
        int i9 = iArr[2];
        int i10 = iArr[3];
        char[] cArr2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        float f = 0.0f;
        if (cArr2 != null) {
            int i11 = $10 + 121;
            $11 = i11 % 128;
            if (i11 % 2 == 0) {
                length = cArr2.length;
                cArr = new char[length];
            } else {
                length = cArr2.length;
                cArr = new char[length];
            }
            int i12 = 0;
            while (i12 < length) {
                int i13 = $11 + 95;
                $10 = i13 % 128;
                if (i13 % i3 != 0) {
                    try {
                        Object[] objArr2 = new Object[i7];
                        objArr2[i5] = Integer.valueOf(cArr2[i12]);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-52690717);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                            char jumpTapTimeout = (char) (ViewConfiguration.getJumpTapTimeout() >> 16);
                            int iIndexOf = 1270 - TextUtils.indexOf("", "");
                            int i14 = 18 - (AudioTrack.getMinVolume() > f ? 1 : (AudioTrack.getMinVolume() == f ? 0 : -1));
                            byte b = (byte) i5;
                            byte b2 = (byte) (b + 1);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(jumpTapTimeout, iIndexOf, i14, 407021364, false, $$g(b, b2, (byte) (b2 - 1)), new Class[]{Integer.TYPE});
                        }
                        cArr[i12] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                        i12 >>= 1;
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                } else {
                    Object[] objArr3 = {Integer.valueOf(cArr2[i12])};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-52690717);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                        byte b3 = (byte) 0;
                        byte b4 = (byte) (b3 + 1);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (ViewConfiguration.getKeyRepeatDelay() >> 16), (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 1269, TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 19, 407021364, false, $$g(b3, b4, (byte) (b4 - 1)), new Class[]{Integer.TYPE});
                    }
                    cArr[i12] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).charValue();
                    i12++;
                }
                i3 = 2;
                i5 = 0;
                i7 = 1;
                f = 0.0f;
            }
            cArr2 = cArr;
        }
        char[] cArr3 = new char[i8];
        System.arraycopy(cArr2, i6, cArr3, 0, i8);
        if (bArr != null) {
            char[] cArr4 = new char[i8];
            setvideostabilizationmode.b = 0;
            char c = 0;
            while (setvideostabilizationmode.b < i8) {
                int i15 = $10 + 31;
                $11 = i15 % 128;
                if (i15 % 2 != 0 ? bArr[setvideostabilizationmode.b] != 1 : bArr[setvideostabilizationmode.b] != 1) {
                    int i16 = setvideostabilizationmode.b;
                    Object[] objArr4 = {Integer.valueOf(cArr3[setvideostabilizationmode.b]), Integer.valueOf(c)};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-209040917);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                        byte b5 = (byte) 0;
                        byte b6 = (byte) (b5 + 2);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (29944 - View.combineMeasuredStates(0, 0)), 1755 - (ViewConfiguration.getLongPressTimeout() >> 16), 23 - Drawable.resolveOpacity(0, 0), 387247676, false, $$g(b5, b6, (byte) (b6 - 2)), new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[i16] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4)).charValue();
                } else {
                    int i17 = setvideostabilizationmode.b;
                    Object[] objArr5 = {Integer.valueOf(cArr3[setvideostabilizationmode.b]), Integer.valueOf(c)};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1683071655);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        byte b7 = (byte) 0;
                        byte b8 = b7;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) View.getDefaultSize(0, 0), Process.getGidForName("") + 3226, 14 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), 2133916302, false, $$g(b7, b8, b8), new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[i17] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).charValue();
                }
                c = cArr4[setvideostabilizationmode.b];
                try {
                    Object[] objArr6 = {setvideostabilizationmode, setvideostabilizationmode};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1323373940);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                        byte b9 = (byte) 0;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b((char) (ExpandableListView.getPackedPositionChild(0L) + 41242), (ViewConfiguration.getScrollBarSize() >> 8) + 1705, (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 21, -1434471773, false, $$g(b9, (byte) (b9 | 6), b9), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr6);
                    int i18 = $10 + 83;
                    $11 = i18 % 128;
                    int i19 = i18 % 2;
                } catch (Throwable th2) {
                    Throwable cause2 = th2.getCause();
                    if (cause2 == null) {
                        throw th2;
                    }
                    throw cause2;
                }
            }
            cArr3 = cArr4;
        }
        if (i10 > 0) {
            char[] cArr5 = new char[i8];
            i = 0;
            System.arraycopy(cArr3, 0, cArr5, 0, i8);
            int i20 = i8 - i10;
            System.arraycopy(cArr5, 0, cArr3, i20, i10);
            System.arraycopy(cArr5, i10, cArr3, 0, i20);
        } else {
            i = 0;
        }
        if (z) {
            char[] cArr6 = new char[i8];
            while (true) {
                setvideostabilizationmode.b = i;
                if (setvideostabilizationmode.b >= i8) {
                    break;
                }
                cArr6[setvideostabilizationmode.b] = cArr3[(i8 - setvideostabilizationmode.b) - 1];
                i = setvideostabilizationmode.b + 1;
            }
            int i21 = $11 + 91;
            $10 = i21 % 128;
            i2 = 2;
            int i22 = i21 % 2;
            cArr3 = cArr6;
        } else {
            i2 = 2;
        }
        if (i9 > 0) {
            int i23 = $11 + 49;
            $10 = i23 % 128;
            if (i23 % i2 != 0) {
                setvideostabilizationmode.b = 1;
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

    /* JADX WARN: Code duplicated, block: B:10:0x0028  */
    /* JADX WARN: Code duplicated, block: B:8:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0028
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$g(int r6, byte r7, int r8) {
        /*
            int r6 = r6 * 2
            int r6 = r6 + 4
            int r8 = r8 * 2
            int r0 = 1 - r8
            int r7 = r7 + 99
            byte[] r1 = defpackage.setZslDisabledByFlashMode.$$c
            byte[] r0 = new byte[r0]
            r2 = 0
            int r8 = 0 - r8
            if (r1 != 0) goto L17
            r3 = r7
            r4 = r2
            r7 = r6
            goto L2a
        L17:
            r3 = r2
            r5 = r7
            r7 = r6
            r6 = r5
        L1b:
            byte r4 = (byte) r6
            r0[r3] = r4
            int r4 = r3 + 1
            if (r3 != r8) goto L28
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            return r6
        L28:
            r3 = r1[r7]
        L2a:
            int r6 = r6 + r3
            int r7 = r7 + 1
            r3 = r4
            goto L1b
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.setZslDisabledByFlashMode.$$g(int, byte, int):java.lang.String");
    }
}
