package defpackage;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.bpjstku.data.lib.model.BaseItem;
import com.bpjstku.data.lib.model.BaseRequest;
import com.bpjstku.data.promo.PromoRepository;
import com.bpjstku.data.promo.model.request.DetailMerchantRequest;
import com.bpjstku.data.promo.model.request.DetailVoucherRequest;
import com.bpjstku.data.promo.model.request.FlagDeeplinkRequest;
import com.bpjstku.data.promo.model.request.MerchantRequest;
import com.bpjstku.data.promo.model.request.RedeemRequest;
import com.bpjstku.data.promo.model.request.VoucherRequest;
import com.bpjstku.data.promo.model.response.CategoryItem;
import com.bpjstku.data.promo.model.response.DetailMerchantItem;
import com.bpjstku.data.promo.model.response.ListMerchantItem;
import com.bpjstku.data.promo.model.response.RedeemResponse;
import com.bpjstku.data.promo.model.response.VoucherList;
import com.bpjstku.domain.promo.model.CategoryMerchant;
import com.bpjstku.domain.promo.model.DetailMerchant;
import com.bpjstku.domain.promo.model.ListMerchant;
import com.bpjstku.domain.promo.model.VoucherItem;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.ArraysUtilJVM;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.ByteCompanionObject;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class dispatcherlambda0 implements addCallbackdefault {
    private final PromoRepository b;

    public dispatcherlambda0(PromoRepository promoRepository) {
        Intrinsics.checkNotNullParameter(promoRepository, "");
        this.b = promoRepository;
    }

    @Override // defpackage.addCallbackdefault
    public final deriveCodec<List<CategoryMerchant>> TuitionPaymentFragmentspecialinlinedviewModeldefault3(BaseRequest baseRequest) {
        Intrinsics.checkNotNullParameter(baseRequest, "");
        deriveCodec<List<CategoryItem>> categoryMerchant = this.b.getCategoryMerchant(baseRequest);
        final Function1 function1 = new Function1() { // from class: backCompleted
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return dispatcherlambda0.b((List) obj);
            }
        };
        readableMs readablems = new readableMs() { // from class: getDispatcher
            @Override // defpackage.readableMs
            public final Object apply(Object obj) {
                return dispatcherlambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1(function1, obj);
            }
        };
        share.b(readablems, "mapper is null");
        Api23Impl api23Impl = new Api23Impl(categoryMerchant, readablems);
        Intrinsics.checkNotNullExpressionValue(api23Impl, "");
        return api23Impl;
    }

    @Override // defpackage.addCallbackdefault
    public final deriveCodec<DetailMerchant> b(DetailMerchantRequest detailMerchantRequest) {
        Intrinsics.checkNotNullParameter(detailMerchantRequest, "");
        deriveCodec<DetailMerchantItem> detailMerchant = this.b.getDetailMerchant(detailMerchantRequest);
        final Function1 function1 = new Function1() { // from class: PipHintTrackerKt
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return dispatcherlambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1((DetailMerchantItem) obj);
            }
        };
        readableMs readablems = new readableMs() { // from class: OnBackPressedDispatcherOwner
            @Override // defpackage.readableMs
            public final Object apply(Object obj) {
                return dispatcherlambda0.g(function1, obj);
            }
        };
        share.b(readablems, "mapper is null");
        Api23Impl api23Impl = new Api23Impl(detailMerchant, readablems);
        Intrinsics.checkNotNullExpressionValue(api23Impl, "");
        return api23Impl;
    }

    @Override // defpackage.addCallbackdefault
    public final deriveCodec<List<ListMerchant>> TuitionPaymentFragmentspecialinlinedviewModeldefault3(MerchantRequest merchantRequest) {
        Intrinsics.checkNotNullParameter(merchantRequest, "");
        deriveCodec<List<ListMerchantItem>> listMerchant = this.b.getListMerchant(merchantRequest);
        final Function1 function1 = new Function1() { // from class: close
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return dispatcherlambda0.TuitionPaymentFragmentbindingInflater1((List) obj);
            }
        };
        readableMs readablems = new readableMs() { // from class: backCancelled
            private static final byte[] $$c = {80, -8, 43, 65};
            private static final int $$d = 100;
            private static int $10 = 0;
            private static int $11 = 1;
            private static final byte[] $$a = {83, ByteCompanionObject.MIN_VALUE, -37, -48};
            private static final int $$b = 36;
            private static int TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
            private static int TuitionPaymentFragmentbindingInflater1 = 1;
            private static int[] b = {897747643, 502395500, 944816936, 1543257201, 459405485, 272750393, -1454736722, 1846946774, -340537849, -500309696, 1682117072, -1620386534, 746765588, 1992488916, 1897924801, 921565005, -2039190243, 180544409};

            /* JADX WARN: Code duplicated, block: B:10:0x002b  */
            /* JADX WARN: Code duplicated, block: B:8:0x0023  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002b -> B:11:0x002d). Please report as a decompilation issue!!! */
            /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x002b
                	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                */
            private static void c(short r5, int r6, byte r7, java.lang.Object[] r8) {
                /*
                    int r6 = r6 * 2
                    int r6 = 3 - r6
                    int r7 = r7 * 3
                    int r7 = r7 + 98
                    byte[] r0 = defpackage.backCancelled.$$a
                    int r5 = r5 * 3
                    int r1 = 1 - r5
                    byte[] r1 = new byte[r1]
                    r2 = 0
                    int r5 = 0 - r5
                    if (r0 != 0) goto L19
                    r3 = r7
                    r4 = r2
                    r7 = r5
                    goto L2d
                L19:
                    r3 = r2
                L1a:
                    int r6 = r6 + 1
                    byte r4 = (byte) r7
                    r1[r3] = r4
                    int r4 = r3 + 1
                    if (r3 != r5) goto L2b
                    java.lang.String r5 = new java.lang.String
                    r5.<init>(r1, r2)
                    r8[r2] = r5
                    return
                L2b:
                    r3 = r0[r6]
                L2d:
                    int r7 = r7 + r3
                    r3 = r4
                    goto L1a
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.backCancelled.c(short, int, byte, java.lang.Object[]):void");
            }

            @Override // defpackage.readableMs
            public final Object apply(Object obj) {
                int i = 2 % 2;
                int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 41;
                TuitionPaymentFragmentbindingInflater1 = i2 % 128;
                int i3 = i2 % 2;
                List listTuitionPaymentFragmentspecialinlinedviewModeldefault3 = dispatcherlambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3(function1, obj);
                int i4 = TuitionPaymentFragmentbindingInflater1 + 83;
                TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i4 % 128;
                int i5 = i4 % 2;
                return listTuitionPaymentFragmentspecialinlinedviewModeldefault3;
            }

            private static void a(int[] iArr, int i, Object[] objArr) throws Throwable {
                int i2;
                int i3 = 2 % 2;
                SessionConfigValidatingBuilder sessionConfigValidatingBuilder = new SessionConfigValidatingBuilder();
                char[] cArr = new char[4];
                char[] cArr2 = new char[iArr.length * 2];
                int[] iArr2 = b;
                float f = 0.0f;
                int i4 = -1870535734;
                int i5 = 1;
                int i6 = 0;
                if (iArr2 != null) {
                    int length = iArr2.length;
                    int[] iArr3 = new int[length];
                    int i7 = 0;
                    while (i7 < length) {
                        try {
                            Object[] objArr2 = {Integer.valueOf(iArr2[i7])};
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(i4);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                                byte b2 = (byte) 0;
                                byte b3 = (byte) (b2 + 1);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (ViewConfiguration.getFadingEdgeLength() >> 16), 3291 - (AudioTrack.getMinVolume() > f ? 1 : (AudioTrack.getMinVolume() == f ? 0 : -1)), 31 - ((Process.getThreadPriority(0) + 20) >> 6), 1948206109, false, $$e(b2, b3, (byte) (b3 - 1)), new Class[]{Integer.TYPE});
                            }
                            iArr3[i7] = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).intValue();
                            i7++;
                            f = 0.0f;
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
                int[] iArr5 = b;
                long j = 0;
                if (iArr5 != null) {
                    int length3 = iArr5.length;
                    int[] iArr6 = new int[length3];
                    int i8 = 0;
                    while (i8 < length3) {
                        int i9 = $11 + 63;
                        $10 = i9 % 128;
                        int i10 = i9 % 2;
                        Object[] objArr3 = new Object[i5];
                        objArr3[i6] = Integer.valueOf(iArr5[i8]);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1870535734);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                            char c = (char) ((Process.getElapsedCpuTime() > j ? 1 : (Process.getElapsedCpuTime() == j ? 0 : -1)) - 1);
                            int i11 = 3291 - (TypedValue.complexToFloat(i6) > 0.0f ? 1 : (TypedValue.complexToFloat(i6) == 0.0f ? 0 : -1));
                            int i12 = 32 - (SystemClock.elapsedRealtimeNanos() > j ? 1 : (SystemClock.elapsedRealtimeNanos() == j ? 0 : -1));
                            byte b4 = (byte) i6;
                            byte b5 = (byte) (b4 + 1);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(c, i11, i12, 1948206109, false, $$e(b4, b5, (byte) (b5 - 1)), new Class[]{Integer.TYPE});
                        }
                        iArr6[i8] = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).intValue();
                        i8++;
                        j = 0;
                        i5 = 1;
                        i6 = 0;
                    }
                    i2 = i6;
                    iArr5 = iArr6;
                } else {
                    i2 = 0;
                }
                System.arraycopy(iArr5, i2, iArr4, i2, length2);
                sessionConfigValidatingBuilder.b = 2;
                int i13 = $11 + 87;
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
                        int i17 = $11 + 121;
                        $10 = i17 % 128;
                        int i18 = i17 % 2;
                        sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 ^= iArr4[i15];
                        Object[] objArr4 = {sessionConfigValidatingBuilder, Integer.valueOf(SessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1)), sessionConfigValidatingBuilder, sessionConfigValidatingBuilder};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-869811764);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                            byte b6 = (byte) 0;
                            byte b7 = b6;
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) ((Process.getThreadPriority(0) + 20) >> 6), (Process.myTid() >> 22) + 2559, 29 - ExpandableListView.getPackedPositionGroup(0L), 683220507, false, $$e(b6, b7, b7), new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                        }
                        int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4)).intValue();
                        sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 = sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                        sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = iIntValue;
                        i15--;
                        int i19 = $11 + 93;
                        $10 = i19 % 128;
                        int i20 = i19 % 2;
                    }
                    int i21 = sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1;
                    sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 = sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                    sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i21;
                    sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 ^= iArr4[1];
                    sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 ^= iArr4[0];
                    sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 ^= iArr[sessionConfigValidatingBuilder.b - 2];
                    int i22 = sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                    Object[] objArr5 = {sessionConfigValidatingBuilder};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(447797990);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (28879 - Drawable.resolveOpacity(0, 0)), 348 - TextUtils.getCapsMode("", 0, 0), 25 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), -30507727, false, "G", new Class[]{Object.class});
                    }
                    sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i22 ^ iArr[((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).intValue()];
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

            /* JADX WARN: Code duplicated, block: B:92:0x0538  */
            /* JADX WARN: Code duplicated, block: B:94:0x053f  */
            public static Object[] TuitionPaymentFragmentspecialinlinedviewModeldefault3(int i, int i2) throws Throwable {
                int i3;
                String line;
                char c;
                Object[] objArr;
                int i4;
                int[] iArr;
                int i5;
                int[] iArr2;
                int i6;
                int i7;
                int i8 = 2 % 2;
                int i9 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 55;
                TuitionPaymentFragmentbindingInflater1 = i9 % 128;
                int i10 = i9 % 2;
                try {
                    Object[] objArr2 = new Object[1];
                    a(new int[]{1508026498, 729733356, -1974550879, 1620487771, -1216074705, 1723282354, -1046423083, -101624133, 1456517576, 823907507, 496273633, -1887896601}, 18 - (~(-Color.green(0))), objArr2);
                    int mode = View.MeasureSpec.getMode(0);
                    int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = ArraysUtilJVM.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
                    int i11 = (mode * (-500)) - 9000;
                    int i12 = ~(((-19) & mode) | ((-19) ^ mode));
                    int i13 = ~mode;
                    int i14 = ~((i13 ^ 18) | (i13 & 18) | iTuitionPaymentFragmentspecialinlinedviewModeldefault3);
                    int i15 = ((i11 + (((i12 ^ i14) | (i12 & i14)) * TypedValues.PositionType.TYPE_TRANSITION_EASING)) - (~(-(-((~(i13 | (-19))) * 1002))))) - 1;
                    int i16 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault3;
                    int i17 = (i13 & i16) | (i13 ^ i16);
                    int i18 = -(-((~((i17 & 18) | (i17 ^ 18))) * TypedValues.PositionType.TYPE_TRANSITION_EASING));
                    int i19 = (i15 & i18) + (i18 | i15);
                    Object[] objArr3 = new Object[1];
                    a(new int[]{1771158780, 1031809215, 638896814, -452559567, 1685261004, 1478543016, 1436404117, 563182407, -125984658, 1135382305, -487877365, -1845619115}, i19, objArr3);
                    String[] strArr = {(String) objArr2[0], (String) objArr3[0]};
                    int i20 = TuitionPaymentFragmentbindingInflater1 + 101;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i20 % 128;
                    int i21 = i20 % 2;
                    int i22 = 0;
                    while (true) {
                        if (i22 >= 2) {
                            int i23 = TuitionPaymentFragmentbindingInflater1;
                            int i24 = ((i23 | 23) << 1) - (i23 ^ 23);
                            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i24 % 128;
                            int i25 = i24 % 2;
                            i3 = i;
                            break;
                        }
                        int i26 = TuitionPaymentFragmentbindingInflater1;
                        int i27 = ((i26 | 113) << 1) - (i26 ^ 113);
                        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i27 % 128;
                        if (i27 % 2 != 0) {
                            String str = strArr[i22];
                            int i28 = -TextUtils.lastIndexOf("", ' ', 0);
                            int i29 = (i28 ^ 64) + ((i28 & 64) << 1);
                            Object[] objArr4 = new Object[1];
                            a(new int[]{-135268223, -1848489326, 1737522530, 1770338751, 1514182799, 1851582588, -503362743, 920189129, 1836109132, -640081844}, i29, objArr4);
                            Class<?> cls = Class.forName((String) objArr4[0]);
                            if (((Boolean) cls.getMethod(str, new Class[1]).invoke(cls, null)).booleanValue()) {
                                int i30 = TuitionPaymentFragmentbindingInflater1;
                                int i31 = i30 + 19;
                                TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i31 % 128;
                                int i32 = i31 % 2;
                                i3 = i ^ 1;
                                int i33 = (i30 ^ 37) + ((i30 & 37) << 1);
                                TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i33 % 128;
                                int i34 = i33 % 2;
                                break;
                            }
                            int i35 = i22 + 25;
                            i22 = ((i35 & (-24)) << 1) + (i35 ^ (-24));
                        } else {
                            String str2 = strArr[i22];
                            int i36 = -TextUtils.lastIndexOf("", '0', 0);
                            int i37 = ((i36 | 15) << 1) - (i36 ^ 15);
                            Object[] objArr5 = new Object[1];
                            a(new int[]{-135268223, -1848489326, 1737522530, 1770338751, 1514182799, 1851582588, -503362743, 920189129, 1836109132, -640081844}, i37, objArr5);
                            Class<?> cls2 = Class.forName((String) objArr5[0]);
                            if (((Boolean) cls2.getMethod(str2, new Class[0]).invoke(cls2, null)).booleanValue()) {
                                int i38 = TuitionPaymentFragmentbindingInflater1;
                                int i39 = i38 + 19;
                                TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i39 % 128;
                                int i310 = i39 % 2;
                                i3 = i ^ 1;
                                int i311 = (i38 ^ 37) + ((i38 & 37) << 1);
                                TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i311 % 128;
                                int i312 = i311 % 2;
                                break;
                            }
                            int i313 = i22 + 25;
                            i22 = ((i313 & (-24)) << 1) + (i313 ^ (-24));
                        }
                    }
                } catch (Exception unused) {
                    i3 = i ^ 2;
                }
                try {
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(109138771);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        char c2 = (char) ((AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 2419);
                        int iAxisFromString = 2844 - MotionEvent.axisFromString("");
                        int bitsPerPixel = 4 - ImageFormat.getBitsPerPixel(0);
                        byte b2 = (byte) 0;
                        byte b3 = b2;
                        Object[] objArr6 = new Object[1];
                        c(b2, b3, b3, objArr6);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(c2, iAxisFromString, bitsPerPixel, -501222268, false, (String) objArr6[0], new Class[0]);
                    }
                    long jLongValue = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, null)).longValue();
                    long j = 767126447;
                    int elapsedCpuTime = (int) Process.getElapsedCpuTime();
                    long j2 = 306;
                    long j3 = ((long) TypedValues.MotionType.TYPE_QUANTIZE_MOTIONSTEPS) + (j2 * j) + (j2 * jLongValue);
                    long j4 = 305;
                    long j5 = -1;
                    long j6 = elapsedCpuTime;
                    long j7 = j3 + ((((j | jLongValue) ^ j5) | ((j | j6) ^ j5)) * j4) + (j4 * ((j5 ^ ((j6 ^ j5) | j)) | (jLongValue ^ j5))) + ((long) (-1926313133));
                    int i40 = (-1180174418) + (((~(1203004641 | i)) | 1654736243) * (-964));
                    int i41 = ~i;
                    int i42 = ((int) (j7 >> 32)) & (i40 + (((~(1203004641 | i41)) | 536936722) * (-964)));
                    int iFreeMemory = (int) Runtime.getRuntime().freeMemory();
                    int i43 = ((int) j7) & ((-1587633331) + (((~(1293227050 | iFreeMemory)) | (-1565890092) | (~(1564513835 | iFreeMemory))) * (-744)) + (((~iFreeMemory) | 1291850794) * 744) + ((iFreeMemory | 1565890091) * 744));
                    int i44 = (i42 & i43) | (i42 ^ i43);
                    int i45 = (~(i & 10)) & (i | 10);
                    int i46 = (i44 & (-2)) | ((~i44) & 1);
                    int i47 = -i46;
                    int i48 = ((i46 & i47) | (i46 ^ i47)) >> 31;
                    int i49 = i45 & (~i48);
                    int i50 = i48 & i;
                    int i51 = (i50 & i49) | (i49 ^ i50);
                    int i52 = (~(i & i3)) & (i | i3);
                    int i53 = -i52;
                    int i54 = ((i52 & i53) | (i52 ^ i53)) >> 31;
                    int i55 = i51 & (~i54);
                    int i56 = i54 & i3;
                    int i57 = (i55 ^ i56) | (i55 & i56);
                    try {
                        int i58 = -(ViewConfiguration.getMinimumFlingVelocity() >> 16);
                        int iTuitionPaymentFragmentspecialinlinedviewModeldefault4 = ArraysUtilJVM.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
                        int i59 = (i58 * (-958)) - 38320;
                        int i60 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault4;
                        int i61 = ~(((-41) & i60) | ((-41) ^ i60));
                        int i62 = ~i58;
                        int i63 = ~((i62 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault4) | (i62 & iTuitionPaymentFragmentspecialinlinedviewModeldefault4));
                        int i64 = (i61 ^ i63) | (i61 & i63);
                        int i65 = ~(i60 | i58);
                        int i66 = -(-(((i64 ^ i65) | (i64 & i65)) * 959));
                        int i67 = (i59 & i66) + (i59 | i66);
                        int i68 = -(-((~((i58 ^ 40) | (i58 & 40))) * (-959)));
                        int i69 = (i67 & i68) + (i68 | i67);
                        int i70 = ~((~i58) | i60);
                        int i71 = ~(((-41) & iTuitionPaymentFragmentspecialinlinedviewModeldefault4) | ((-41) ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault4));
                        int i72 = (i70 & i71) | (i70 ^ i71);
                        int i73 = ~((i58 & iTuitionPaymentFragmentspecialinlinedviewModeldefault4) | (i58 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault4));
                        int i74 = -(-(((i73 & i72) | (i72 ^ i73)) * 959));
                        Object[] objArr7 = new Object[1];
                        a(new int[]{-2120866910, 53264891, -73496952, 1492892845, -1018948653, 529158320, -969174450, 251783008, -1358541688, -1059691930, 1969653437, 1347347261, 2133395427, 849396396, -1731789435, -941716845, 855839677, -2133119043, -1054108225, -1167949931, -1570071135, 1933868475}, (i69 & i74) + (i74 | i69), objArr7);
                        File file = new File((String) objArr7[0]);
                        if (file.canRead()) {
                            FileReader fileReader = new FileReader(file);
                            BufferedReader bufferedReader = new BufferedReader(fileReader);
                            int i75 = TuitionPaymentFragmentbindingInflater1;
                            int i76 = (i75 ^ 19) + ((i75 & 19) << 1);
                            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i76 % 128;
                            try {
                                if (i76 % 2 != 0) {
                                    line = bufferedReader.readLine();
                                    iArr2 = new int[]{1910498351, 487287186, -225642802, -2081793059};
                                    i7 = 1;
                                    i6 = 4;
                                } else {
                                    line = bufferedReader.readLine();
                                    iArr2 = new int[]{1910498351, 487287186, -225642802, -2081793059};
                                    i6 = 3;
                                    i7 = 0;
                                }
                                int i77 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                                int i78 = (i77 & 101) + (i77 | 101);
                                TuitionPaymentFragmentbindingInflater1 = i78 % 128;
                                if (i78 % 2 == 0) {
                                    Object[] objArr8 = new Object[1];
                                    a(iArr2, i6 / View.resolveSizeAndState(0, i7, 0), objArr8);
                                    if (!line.equals((String) objArr8[0])) {
                                        fileReader.close();
                                        bufferedReader.close();
                                    }
                                    fileReader.close();
                                    bufferedReader.close();
                                    int i79 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 125;
                                    TuitionPaymentFragmentbindingInflater1 = i79 % 128;
                                    int i80 = i79 % 2;
                                } else {
                                    Object[] objArr9 = new Object[1];
                                    a(iArr2, i6 + View.resolveSizeAndState(0, i7, 0), objArr9);
                                    if (!line.equals((String) objArr9[0])) {
                                        fileReader.close();
                                        bufferedReader.close();
                                    } else {
                                        fileReader.close();
                                        bufferedReader.close();
                                        int i710 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 125;
                                        TuitionPaymentFragmentbindingInflater1 = i710 % 128;
                                        int i81 = i710 % 2;
                                    }
                                }
                                line = null;
                            } catch (Throwable th) {
                                fileReader.close();
                                bufferedReader.close();
                                throw th;
                            }
                        } else {
                            line = null;
                        }
                    } catch (Exception unused2) {
                    }
                    try {
                        int iMyPid = Process.myPid() >> 22;
                        int iTuitionPaymentFragmentspecialinlinedviewModeldefault5 = ArraysUtilJVM.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
                        int i82 = iMyPid * 829;
                        int i83 = (i82 & 25699) + (i82 | 25699);
                        int i84 = ~iMyPid;
                        int i85 = ~((i84 & (-32)) | (i84 ^ (-32)));
                        int i86 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault5;
                        int i87 = (i86 ^ iMyPid) | (i86 & iMyPid);
                        int i88 = (i83 - (~((i85 | (~((i87 & 31) | (i87 ^ 31)))) * (-828)))) - 1;
                        int i89 = iMyPid | 31;
                        int i90 = i88 + (((i86 & i89) | (i89 ^ i86)) * (-828));
                        int i91 = -(-((~((iMyPid & 31) | (iMyPid ^ 31))) * 828));
                        Object[] objArr10 = new Object[1];
                        a(new int[]{-1878080052, -406549936, -568682059, -156190882, -517878850, -902281667, -1839114625, -617927668, 729249872, -2141816911, -885570883, 589105255, 1607997706, -587430196, -254979979, 1063516998, 1277960062, -1637749271}, (i90 & i91) + (i91 | i90), objArr10);
                        File file2 = new File((String) objArr10[0]);
                        int i92 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 7;
                        TuitionPaymentFragmentbindingInflater1 = i92 % 128;
                        if (i92 % 2 == 0) {
                            file2.canRead();
                            throw null;
                        }
                        if (file2.canRead()) {
                            FileReader fileReader2 = new FileReader(file2);
                            BufferedReader bufferedReader2 = new BufferedReader(fileReader2);
                            int i93 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 107;
                            TuitionPaymentFragmentbindingInflater1 = i93 % 128;
                            int i94 = i93 % 2;
                            try {
                                String line2 = bufferedReader2.readLine();
                                int iResolveSize = View.resolveSize(0, 0);
                                int i95 = ((iResolveSize | 1) << 1) - (iResolveSize ^ 1);
                                Object[] objArr11 = new Object[1];
                                a(new int[]{-160664227, -549977998, 268369579, -530243454}, i95, objArr11);
                                boolean zEquals = line2.equals((String) objArr11[0]);
                                fileReader2.close();
                                int i96 = TuitionPaymentFragmentbindingInflater1;
                                int i97 = ((i96 | 101) << 1) - (i96 ^ 101);
                                TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i97 % 128;
                                if (i97 % 2 != 0) {
                                    bufferedReader2.close();
                                    Object obj = null;
                                    obj.hashCode();
                                    throw null;
                                }
                                bufferedReader2.close();
                                if (zEquals) {
                                    int absoluteGravity = Gravity.getAbsoluteGravity(0, 0);
                                    int i98 = absoluteGravity * 367;
                                    int i99 = ((i98 | 13212) << 1) - (i98 ^ 13212);
                                    int i100 = -(-((absoluteGravity | 36) * (-366)));
                                    int i101 = (i99 & i100) + (i100 | i99) + (((~(((-37) & i) | ((-37) ^ i))) | absoluteGravity) * (-366));
                                    int i102 = ~absoluteGravity;
                                    int i103 = ~((i102 & 36) | (i102 ^ 36));
                                    int i104 = (absoluteGravity & (-37)) | ((-37) ^ absoluteGravity);
                                    int i105 = ~((i104 & i) | (i104 ^ i));
                                    int i106 = i101 + (((i103 & i105) | (i103 ^ i105)) * 366);
                                    Object[] objArr12 = new Object[1];
                                    a(new int[]{487798022, 686394588, -1430620642, -1365369228, -2012987891, -769334872, 543032325, 1489019914, 1002952385, -1820067379, -783618013, 783143, -1316155628, -1493844856, -1200271936, 1144467585, -841198183, -1715608596, -1946693448, -1985955371}, i106, objArr12);
                                    File file3 = new File((String) objArr12[0]);
                                    if (file3.canRead()) {
                                        FileReader fileReader3 = new FileReader(file3);
                                        BufferedReader bufferedReader3 = new BufferedReader(fileReader3);
                                        try {
                                            String line3 = bufferedReader3.readLine();
                                            Object[] objArr13 = new Object[1];
                                            a(new int[]{-160664227, -549977998, 268369579, -530243454}, -MotionEvent.axisFromString(""), objArr13);
                                            boolean zEquals2 = line3.equals((String) objArr13[0]);
                                            fileReader3.close();
                                            bufferedReader3.close();
                                            int i107 = TuitionPaymentFragmentbindingInflater1;
                                            int i108 = (i107 ^ 85) + ((i107 & 85) << 1);
                                            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i108 % 128;
                                            int i109 = i108 % 2;
                                            if (zEquals2) {
                                                int i110 = (i107 & 57) + (i107 | 57);
                                                TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i110 % 128;
                                                int i111 = i110 % 2;
                                                if (line != null) {
                                                    int i112 = i107 + 27;
                                                    TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i112 % 128;
                                                    int i113 = i112 % 2;
                                                    objArr = new Object[]{new int[]{(i & (-21)) | (i41 & 20)}, new String[]{line}};
                                                    c = 0;
                                                } else {
                                                    i4 = 2;
                                                }
                                            }
                                            objArr = new Object[i4];
                                            iArr = new int[1];
                                            objArr[0] = iArr;
                                            String[] strArr2 = new String[0];
                                            int i114 = TuitionPaymentFragmentbindingInflater1;
                                            i5 = (i114 ^ 33) + ((i114 & 33) << 1);
                                            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i5 % 128;
                                            if (i5 % 2 != 0) {
                                                c = 0;
                                                iArr[0] = i;
                                            } else {
                                                c = 0;
                                                iArr[0] = i;
                                            }
                                            objArr[1] = strArr2;
                                        } catch (Throwable th2) {
                                            fileReader3.close();
                                            bufferedReader3.close();
                                            throw th2;
                                        }
                                    }
                                }
                                int i115 = ((int[]) objArr[c])[c];
                                int i116 = i ^ i57;
                                int i117 = -i116;
                                int i118 = ((i116 & i117) | (i116 ^ i117)) >> 31;
                                int i119 = (~i118) & i115;
                                int i120 = i57 & i118;
                                int i121 = (i120 & i119) | (i119 ^ i120);
                                String[] strArr3 = (String[]) objArr[1];
                                Object[] objArr14 = new Object[2];
                                int i122 = (i115 & i41) | ((~i115) & i);
                                int i123 = ((i122 | (-i122)) >> 31) & 1;
                                int i124 = -i123;
                                int i125 = (~(((i124 & i123) | (i123 ^ i124)) >> 31)) & 1;
                                objArr14[i123] = null;
                                objArr14[i125] = strArr3;
                                String[] strArr4 = (String[]) objArr14[0];
                                int i126 = (~(i & i121)) & (i | i121);
                                int i127 = -i126;
                                Object[] objArr15 = {new int[]{i}, new int[1], new int[]{i121}, strArr4};
                                int iMyPid2 = Process.myPid();
                                int i128 = ~iMyPid2;
                                int i129 = ((((((~(847477039 | i128)) | (~(iMyPid2 | 887787268))) * 959) + 2006439007) + (((~(iMyPid2 | 847477039)) | (~(i128 | 887787268))) * 959)) - (~(-(-((((i126 & i127) | (i126 ^ i127)) >> 31) & 16))))) - 1;
                                int i130 = (i129 * (-949)) + (i2 * (-949));
                                int i131 = ~i2;
                                int i132 = ~((i131 & i41) | (i131 ^ i41));
                                int i133 = ~i129;
                                int i134 = -(-((i132 | (~((i133 & i) | (i133 ^ i)))) * 1900));
                                int i135 = (i130 & i134) + (i130 | i134);
                                int i136 = ~((i41 ^ i129) | (i41 & i129));
                                int i137 = ~((i2 ^ i) | (i2 & i));
                                int i138 = i135 + (((i136 & i137) | (i136 ^ i137)) * (-950));
                                int i139 = ~((i41 ^ i2) | (i41 & i2));
                                int i140 = ~((i129 ^ i) | (i129 & i));
                                int i141 = ((i139 & i140) | (i139 ^ i140)) * 950;
                                int i142 = ((i138 | i141) << 1) - (i141 ^ i138);
                                int i143 = (i142 << 13) ^ i142;
                                int i144 = i143 >>> 17;
                                int i145 = (i143 | i144) & (~(i143 & i144));
                                ((int[]) objArr15[1])[0] = i145 ^ (i145 << 5);
                                return objArr15;
                            } catch (Throwable th3) {
                                fileReader2.close();
                                bufferedReader2.close();
                                throw th3;
                            }
                        }
                    } catch (Exception unused3) {
                    }
                    i4 = 2;
                    objArr = new Object[i4];
                    iArr = new int[1];
                    objArr[0] = iArr;
                    String[] strArr5 = new String[0];
                    int i1110 = TuitionPaymentFragmentbindingInflater1;
                    i5 = (i1110 ^ 33) + ((i1110 & 33) << 1);
                    TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i5 % 128;
                    if (i5 % 2 != 0) {
                        c = 0;
                        iArr[0] = i;
                    } else {
                        c = 0;
                        iArr[0] = i;
                    }
                    objArr[1] = strArr5;
                    int i1111 = ((int[]) objArr[c])[c];
                    int i1112 = i ^ i57;
                    int i1113 = -i1112;
                    int i1114 = ((i1112 & i1113) | (i1112 ^ i1113)) >> 31;
                    int i1115 = (~i1114) & i1111;
                    int i1210 = i57 & i1114;
                    int i1211 = (i1210 & i1115) | (i1115 ^ i1210);
                    String[] strArr6 = (String[]) objArr[1];
                    Object[] objArr16 = new Object[2];
                    int i1212 = (i1111 & i41) | ((~i1111) & i);
                    int i1213 = ((i1212 | (-i1212)) >> 31) & 1;
                    int i1214 = -i1213;
                    int i1215 = (~(((i1214 & i1213) | (i1213 ^ i1214)) >> 31)) & 1;
                    objArr16[i1213] = null;
                    objArr16[i1215] = strArr6;
                    String[] strArr7 = (String[]) objArr16[0];
                    int i1216 = (~(i & i1211)) & (i | i1211);
                    int i1217 = -i1216;
                    Object[] objArr17 = {new int[]{i}, new int[1], new int[]{i1211}, strArr7};
                    int iMyPid3 = Process.myPid();
                    int i1218 = ~iMyPid3;
                    int i1219 = ((((((~(847477039 | i1218)) | (~(iMyPid3 | 887787268))) * 959) + 2006439007) + (((~(iMyPid3 | 847477039)) | (~(i1218 | 887787268))) * 959)) - (~(-(-((((i1216 & i1217) | (i1216 ^ i1217)) >> 31) & 16))))) - 1;
                    int i1310 = (i1219 * (-949)) + (i2 * (-949));
                    int i1311 = ~i2;
                    int i1312 = ~((i1311 & i41) | (i1311 ^ i41));
                    int i1313 = ~i1219;
                    int i1314 = -(-((i1312 | (~((i1313 & i) | (i1313 ^ i)))) * 1900));
                    int i1315 = (i1310 & i1314) + (i1310 | i1314);
                    int i1316 = ~((i41 ^ i1219) | (i41 & i1219));
                    int i1317 = ~((i2 ^ i) | (i2 & i));
                    int i1318 = i1315 + (((i1316 & i1317) | (i1316 ^ i1317)) * (-950));
                    int i1319 = ~((i41 ^ i2) | (i41 & i2));
                    int i146 = ~((i1219 ^ i) | (i1219 & i));
                    int i147 = ((i1319 & i146) | (i1319 ^ i146)) * 950;
                    int i148 = ((i1318 | i147) << 1) - (i147 ^ i1318);
                    int i149 = (i148 << 13) ^ i148;
                    int i1410 = i149 >>> 17;
                    int i1411 = (i149 | i1410) & (~(i149 & i1410));
                    ((int[]) objArr17[1])[0] = i1411 ^ (i1411 << 5);
                    return objArr17;
                } catch (Throwable th4) {
                    Throwable cause = th4.getCause();
                    if (cause != null) {
                        throw cause;
                    }
                    throw th4;
                }
            }

            /* JADX WARN: Code duplicated, block: B:10:0x0024  */
            /* JADX WARN: Code duplicated, block: B:8:0x001e  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x0028). Please report as a decompilation issue!!! */
            /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0024
                	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                */
            private static java.lang.String $$e(int r5, int r6, int r7) {
                /*
                    int r6 = r6 * 56
                    int r6 = 122 - r6
                    byte[] r0 = defpackage.backCancelled.$$c
                    int r5 = r5 * 3
                    int r5 = 3 - r5
                    int r7 = r7 * 2
                    int r1 = r7 + 1
                    byte[] r1 = new byte[r1]
                    r2 = 0
                    if (r0 != 0) goto L16
                    r4 = r7
                    r3 = r2
                    goto L28
                L16:
                    r3 = r2
                L17:
                    byte r4 = (byte) r6
                    r1[r3] = r4
                    int r5 = r5 + 1
                    if (r3 != r7) goto L24
                    java.lang.String r5 = new java.lang.String
                    r5.<init>(r1, r2)
                    return r5
                L24:
                    r4 = r0[r5]
                    int r3 = r3 + 1
                L28:
                    int r6 = r6 + r4
                    goto L17
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.backCancelled.$$e(int, int, int):java.lang.String");
            }
        };
        share.b(readablems, "mapper is null");
        Api23Impl api23Impl = new Api23Impl(listMerchant, readablems);
        Intrinsics.checkNotNullExpressionValue(api23Impl, "");
        return api23Impl;
    }

    @Override // defpackage.addCallbackdefault
    public final deriveCodec<List<VoucherItem>> TuitionPaymentFragmentspecialinlinedviewModeldefault2(VoucherRequest voucherRequest) {
        Intrinsics.checkNotNullParameter(voucherRequest, "");
        deriveCodec<List<VoucherList>> listVoucher = this.b.getListVoucher(voucherRequest);
        final Function1 function1 = new Function1() { // from class: OnBackPressedDispatcherOnBackPressedEventInput
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return dispatcherlambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1((List) obj);
            }
        };
        readableMs readablems = new readableMs() { // from class: OnBackPressedDispatcherOnBackPressedEventInputExternalSyntheticLambda0
            @Override // defpackage.readableMs
            public final Object apply(Object obj) {
                return dispatcherlambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2(function1, obj);
            }
        };
        share.b(readablems, "mapper is null");
        Api23Impl api23Impl = new Api23Impl(listVoucher, readablems);
        Intrinsics.checkNotNullExpressionValue(api23Impl, "");
        return api23Impl;
    }

    @Override // defpackage.addCallbackdefault
    public final deriveCodec<RedeemResponse> TuitionPaymentFragmentspecialinlinedviewModeldefault1(RedeemRequest redeemRequest) {
        Intrinsics.checkNotNullParameter(redeemRequest, "");
        deriveCodec<RedeemResponse> voucherCode = this.b.getVoucherCode(redeemRequest);
        final Function1 function1 = new Function1() { // from class: backProgressed
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return dispatcherlambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1((RedeemResponse) obj);
            }
        };
        readableMs readablems = new readableMs() { // from class: backStarted
            @Override // defpackage.readableMs
            public final Object apply(Object obj) {
                return dispatcherlambda0.b(function1, obj);
            }
        };
        share.b(readablems, "mapper is null");
        Api23Impl api23Impl = new Api23Impl(voucherCode, readablems);
        Intrinsics.checkNotNullExpressionValue(api23Impl, "");
        return api23Impl;
    }

    @Override // defpackage.addCallbackdefault
    public final deriveCodec<DetailMerchant> TuitionPaymentFragmentspecialinlinedviewModeldefault2(DetailVoucherRequest detailVoucherRequest) {
        Intrinsics.checkNotNullParameter(detailVoucherRequest, "");
        deriveCodec<DetailMerchantItem> detailVoucher = this.b.getDetailVoucher(detailVoucherRequest);
        final Function1 function1 = new Function1() { // from class: onHasEnabledHandlersChanged
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return dispatcherlambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3((DetailMerchantItem) obj);
            }
        };
        readableMs readablems = new readableMs() { // from class: OnBackPressedDispatcheraddCallbackobserver1
            @Override // defpackage.readableMs
            public final Object apply(Object obj) {
                return dispatcherlambda0.a(function1, obj);
            }
        };
        share.b(readablems, "mapper is null");
        Api23Impl api23Impl = new Api23Impl(detailVoucher, readablems);
        Intrinsics.checkNotNullExpressionValue(api23Impl, "");
        return api23Impl;
    }

    @Override // defpackage.addCallbackdefault
    public final deriveCodec<BaseItem> TuitionPaymentFragmentbindingInflater1(FlagDeeplinkRequest flagDeeplinkRequest) {
        Intrinsics.checkNotNullParameter(flagDeeplinkRequest, "");
        deriveCodec<BaseItem> derivecodecUpdateFlagAksesDeeplink = this.b.updateFlagAksesDeeplink(flagDeeplinkRequest);
        onBackCompletedFallback onbackcompletedfallback = new onBackCompletedFallback(new Function1() { // from class: OnBackPressedDispatcheraddCallbackobserver1WhenMappings
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return dispatcherlambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1((BaseItem) obj);
            }
        });
        share.b(onbackcompletedfallback, "mapper is null");
        Api23Impl api23Impl = new Api23Impl(derivecodecUpdateFlagAksesDeeplink, onbackcompletedfallback);
        Intrinsics.checkNotNullExpressionValue(api23Impl, "");
        return api23Impl;
    }

    public static /* synthetic */ List TuitionPaymentFragmentspecialinlinedviewModeldefault3(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (List) function1.invoke(obj);
    }

    public static /* synthetic */ BaseItem TuitionPaymentFragmentbindingInflater1(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (BaseItem) function1.invoke(obj);
    }

    public static /* synthetic */ List TuitionPaymentFragmentbindingInflater1(List list) {
        Intrinsics.checkNotNullParameter(list, "");
        List<ListMerchantItem> list2 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
        for (ListMerchantItem listMerchantItem : list2) {
            Intrinsics.checkNotNullParameter(listMerchantItem, "");
            String kodeJenisProduk = listMerchantItem.getKodeJenisProduk();
            String str = kodeJenisProduk == null ? "" : kodeJenisProduk;
            String kodeDivisi = listMerchantItem.getKodeDivisi();
            String str2 = kodeDivisi == null ? "" : kodeDivisi;
            String namaProduk = listMerchantItem.getNamaProduk();
            String str3 = namaProduk == null ? "" : namaProduk;
            String tglPromo = listMerchantItem.getTglPromo();
            String str4 = tglPromo == null ? "" : tglPromo;
            String kodePks = listMerchantItem.getKodePks();
            String str5 = kodePks == null ? "" : kodePks;
            String kodePerusahaan = listMerchantItem.getKodePerusahaan();
            String str6 = kodePerusahaan == null ? "" : kodePerusahaan;
            String namaJenisKategori = listMerchantItem.getNamaJenisKategori();
            String str7 = namaJenisKategori == null ? "" : namaJenisKategori;
            String kodePengajuanPromo = listMerchantItem.getKodePengajuanPromo();
            String str8 = kodePengajuanPromo == null ? "" : kodePengajuanPromo;
            String statusPromo = listMerchantItem.getStatusPromo();
            String str9 = statusPromo == null ? "" : statusPromo;
            String tglApproval = listMerchantItem.getTglApproval();
            String str10 = tglApproval == null ? "" : tglApproval;
            String fileThumbnail = listMerchantItem.getFileThumbnail();
            String str11 = fileThumbnail == null ? "" : fileThumbnail;
            String kodeProgram = listMerchantItem.getKodeProgram();
            String str12 = kodeProgram == null ? "" : kodeProgram;
            String tglAwalPromo = listMerchantItem.getTglAwalPromo();
            String str13 = tglAwalPromo == null ? "" : tglAwalPromo;
            String shortDesc = listMerchantItem.getShortDesc();
            String str14 = shortDesc == null ? "" : shortDesc;
            String fileBanner = listMerchantItem.getFileBanner();
            String str15 = fileBanner == null ? "" : fileBanner;
            String tglBerakhirPromo = listMerchantItem.getTglBerakhirPromo();
            String str16 = tglBerakhirPromo == null ? "" : tglBerakhirPromo;
            String lokasiComar = listMerchantItem.getLokasiComar();
            String str17 = lokasiComar == null ? "" : lokasiComar;
            String namaPropinsi = listMerchantItem.getNamaPropinsi();
            String str18 = namaPropinsi == null ? "" : namaPropinsi;
            String strIsWebview = listMerchantItem.isWebview();
            String str19 = strIsWebview == null ? "" : strIsWebview;
            String urlWebview = listMerchantItem.getUrlWebview();
            arrayList.add(new ListMerchant(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, str13, str14, str15, str16, str17, str18, str19, urlWebview == null ? "" : urlWebview));
        }
        return arrayList;
    }

    public static /* synthetic */ BaseItem TuitionPaymentFragmentspecialinlinedviewModeldefault1(BaseItem baseItem) {
        Intrinsics.checkNotNullParameter(baseItem, "");
        return baseItem;
    }

    public static /* synthetic */ List TuitionPaymentFragmentspecialinlinedviewModeldefault1(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (List) function1.invoke(obj);
    }

    public static /* synthetic */ DetailMerchant TuitionPaymentFragmentspecialinlinedviewModeldefault3(DetailMerchantItem detailMerchantItem) {
        Intrinsics.checkNotNullParameter(detailMerchantItem, "");
        return OnBackPressedDispatcherKtaddCallbackcallback1.TuitionPaymentFragmentspecialinlinedviewModeldefault3(detailMerchantItem);
    }

    public static /* synthetic */ RedeemResponse b(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (RedeemResponse) function1.invoke(obj);
    }

    public static /* synthetic */ RedeemResponse TuitionPaymentFragmentspecialinlinedviewModeldefault1(RedeemResponse redeemResponse) {
        Intrinsics.checkNotNullParameter(redeemResponse, "");
        return redeemResponse;
    }

    public static /* synthetic */ DetailMerchant TuitionPaymentFragmentspecialinlinedviewModeldefault1(DetailMerchantItem detailMerchantItem) {
        Intrinsics.checkNotNullParameter(detailMerchantItem, "");
        return OnBackPressedDispatcherKtaddCallbackcallback1.TuitionPaymentFragmentspecialinlinedviewModeldefault3(detailMerchantItem);
    }

    public static /* synthetic */ List TuitionPaymentFragmentspecialinlinedviewModeldefault1(List list) {
        Intrinsics.checkNotNullParameter(list, "");
        List<VoucherList> list2 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
        for (VoucherList voucherList : list2) {
            Intrinsics.checkNotNullParameter(voucherList, "");
            String kodeJenisProduk = voucherList.getKodeJenisProduk();
            String str = kodeJenisProduk == null ? "" : kodeJenisProduk;
            String kodeDivisi = voucherList.getKodeDivisi();
            String str2 = kodeDivisi == null ? "" : kodeDivisi;
            String namaProduk = voucherList.getNamaProduk();
            String str3 = namaProduk == null ? "" : namaProduk;
            String tglPromo = voucherList.getTglPromo();
            String str4 = tglPromo == null ? "" : tglPromo;
            String kodePks = voucherList.getKodePks();
            String str5 = kodePks == null ? "" : kodePks;
            String kodePerusahaan = voucherList.getKodePerusahaan();
            String str6 = kodePerusahaan == null ? "" : kodePerusahaan;
            String namaJenisKategori = voucherList.getNamaJenisKategori();
            String str7 = namaJenisKategori == null ? "" : namaJenisKategori;
            String kodePengajuanPromo = voucherList.getKodePengajuanPromo();
            String str8 = kodePengajuanPromo == null ? "" : kodePengajuanPromo;
            String statusPromo = voucherList.getStatusPromo();
            String str9 = statusPromo == null ? "" : statusPromo;
            String tglApproval = voucherList.getTglApproval();
            String str10 = tglApproval == null ? "" : tglApproval;
            String fileThumbnail = voucherList.getFileThumbnail();
            String str11 = fileThumbnail == null ? "" : fileThumbnail;
            String kodeProgram = voucherList.getKodeProgram();
            String str12 = kodeProgram == null ? "" : kodeProgram;
            String tglAwalPromo = voucherList.getTglAwalPromo();
            String str13 = tglAwalPromo == null ? "" : tglAwalPromo;
            String shortDesc = voucherList.getShortDesc();
            String str14 = shortDesc == null ? "" : shortDesc;
            String fileBanner = voucherList.getFileBanner();
            String str15 = fileBanner == null ? "" : fileBanner;
            String tglBerakhirPromo = voucherList.getTglBerakhirPromo();
            String str16 = tglBerakhirPromo == null ? "" : tglBerakhirPromo;
            String lokasiComar = voucherList.getLokasiComar();
            String str17 = lokasiComar == null ? "" : lokasiComar;
            String namaPropinsi = voucherList.getNamaPropinsi();
            String str18 = namaPropinsi == null ? "" : namaPropinsi;
            String strIsWebview = voucherList.isWebview();
            String str19 = strIsWebview == null ? "" : strIsWebview;
            String urlWebview = voucherList.getUrlWebview();
            arrayList.add(new VoucherItem(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, str13, str14, str15, str16, str17, str18, str19, urlWebview == null ? "" : urlWebview));
        }
        return arrayList;
    }

    public static /* synthetic */ List TuitionPaymentFragmentspecialinlinedviewModeldefault2(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (List) function1.invoke(obj);
    }

    public static /* synthetic */ DetailMerchant g(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (DetailMerchant) function1.invoke(obj);
    }

    public static /* synthetic */ List b(List list) {
        Intrinsics.checkNotNullParameter(list, "");
        List<CategoryItem> list2 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
        for (CategoryItem categoryItem : list2) {
            Intrinsics.checkNotNullParameter(categoryItem, "");
            String kodeJenisProduk = categoryItem.getKodeJenisProduk();
            if (kodeJenisProduk == null) {
                kodeJenisProduk = "";
            }
            String namaProduk = categoryItem.getNamaProduk();
            if (namaProduk == null) {
                namaProduk = "";
            }
            arrayList.add(new CategoryMerchant(kodeJenisProduk, namaProduk));
        }
        return arrayList;
    }

    public static /* synthetic */ DetailMerchant a(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (DetailMerchant) function1.invoke(obj);
    }
}
