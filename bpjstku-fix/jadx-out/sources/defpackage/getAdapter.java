package defpackage;

import android.content.Context;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.drawable.Drawable;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.Toast;
import androidx.p002lifecycle.MutableLiveData;
import androidx.p002lifecycle.ViewModel;
import com.bpjstku.data.digitalcard.model.request.MembershipInformationRequest;
import com.bpjstku.domain.digitalcard.model.BPUMembershipInformation;
import com.bpjstku.domain.digitalcard.model.DigitalCard;
import com.bpjstku.domain.digitalcard.model.DigitalCardImage;
import com.bpjstku.domain.digitalcard.model.PMIMembershipInformation;
import com.bpjstku.domain.digitalcard.model.PUMembershipInformation;
import com.bpjstku.domain.user.model.User;
import com.bpjstku.util.constant.MembershipType;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class getAdapter extends ViewModel {
    public final MutableLiveData<VirtualCameraAdapter1<List<DigitalCard>>> TuitionPaymentFragmentbindingInflater1;
    public final ensureViewModelStore TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    public final MutableLiveData<VirtualCameraAdapter1<BPUMembershipInformation>> TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    public final acquireBuffer TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    public final registerlambda1 asBinder;
    public final MutableLiveData<VirtualCameraAdapter1<PUMembershipInformation>> asInterface;
    public final MutableLiveData<VirtualCameraAdapter1<PMIMembershipInformation>> b;
    private final MutableLiveData<VirtualCameraAdapter1<DigitalCardImage>> d;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[MembershipType.values().length];
            try {
                iArr[MembershipType.PMI.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[MembershipType.BPU.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[MembershipType.PU.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public getAdapter(ensureViewModelStore ensureviewmodelstore, acquireBuffer acquirebuffer, registerlambda1 registerlambda1Var) {
        Intrinsics.checkNotNullParameter(ensureviewmodelstore, "");
        Intrinsics.checkNotNullParameter(acquirebuffer, "");
        Intrinsics.checkNotNullParameter(registerlambda1Var, "");
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = ensureviewmodelstore;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = acquirebuffer;
        this.asBinder = registerlambda1Var;
        MutableLiveData<VirtualCameraAdapter1<List<DigitalCard>>> mutableLiveData = new MutableLiveData<>();
        this.TuitionPaymentFragmentbindingInflater1 = mutableLiveData;
        MutableLiveData<VirtualCameraAdapter1<DigitalCardImage>> mutableLiveData2 = new MutableLiveData<>();
        this.d = mutableLiveData2;
        MutableLiveData<VirtualCameraAdapter1<BPUMembershipInformation>> mutableLiveData3 = new MutableLiveData<>();
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = mutableLiveData3;
        MutableLiveData<VirtualCameraAdapter1<PUMembershipInformation>> mutableLiveData4 = new MutableLiveData<>();
        this.asInterface = mutableLiveData4;
        MutableLiveData<VirtualCameraAdapter1<PMIMembershipInformation>> mutableLiveData5 = new MutableLiveData<>();
        this.b = mutableLiveData5;
        VirtualCameraAdapter1.Companion companion = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1());
        VirtualCameraAdapter1.Companion companion2 = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData2.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1());
        VirtualCameraAdapter1.Companion companion3 = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData3.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1());
        VirtualCameraAdapter1.Companion companion4 = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData4.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1());
        VirtualCameraAdapter1.Companion companion5 = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData5.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1());
    }

    public final String TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        User userAsBinder = this.asBinder.asBinder();
        String str = userAsBinder != null ? userAsBinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 : null;
        return str == null ? "" : str;
    }

    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault2(DigitalCard digitalCard) {
        Intrinsics.checkNotNullParameter(digitalCard, "");
        User userAsBinder = this.asBinder.asBinder();
        String str = userAsBinder != null ? userAsBinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 : null;
        if (str == null) {
            str = "";
        }
        MembershipInformationRequest membershipInformationRequest = new MembershipInformationRequest(str, digitalCard.TuitionPaymentFragmentspecialinlinedviewModeldefault1.name(), digitalCard.b, digitalCard.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
        int i = WhenMappings.$EnumSwitchMapping$0[digitalCard.TuitionPaymentFragmentspecialinlinedviewModeldefault1.ordinal()];
        if (i == 1) {
            MutableLiveData<VirtualCameraAdapter1<PMIMembershipInformation>> mutableLiveData = this.b;
            VirtualCameraAdapter1.Companion companion = VirtualCameraAdapter1.INSTANCE;
            mutableLiveData.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentbindingInflater1());
            deriveCodec derivecodecB = deriveCodec.b(((modifyBitrate) share.b(onResume.TuitionPaymentFragmentspecialinlinedviewModeldefault1(null, null, 3), "transformer is null")).TuitionPaymentFragmentbindingInflater1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault2(membershipInformationRequest)));
            final Function1 function1 = new Function1() { // from class: setGroupDividerEnabled
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return getAdapter.TuitionPaymentFragmentbindingInflater1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, (PMIMembershipInformation) obj);
                }
            };
            logToString logtostring = new logToString() { // from class: dispatchSubMenuSelected
                @Override // defpackage.logToString
                public final void accept(Object obj) {
                    function1.invoke(obj);
                }
            };
            final Function1 function2 = new Function1() { // from class: setItemIndexOffset
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return getAdapter.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, (Throwable) obj);
                }
            };
            BufferProviderState bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3 = derivecodecB.TuitionPaymentFragmentspecialinlinedviewModeldefault3(logtostring, new logToString() { // from class: findExpandedIndex
                @Override // defpackage.logToString
                public final void accept(Object obj) {
                    function2.invoke(obj);
                }
            });
            Intrinsics.checkNotNullExpressionValue(bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3, "");
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault3(bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3);
            return;
        }
        if (i == 2) {
            MutableLiveData<VirtualCameraAdapter1<BPUMembershipInformation>> mutableLiveData2 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            VirtualCameraAdapter1.Companion companion2 = VirtualCameraAdapter1.INSTANCE;
            mutableLiveData2.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentbindingInflater1());
            deriveCodec derivecodecB2 = deriveCodec.b(((modifyBitrate) share.b(onResume.TuitionPaymentFragmentspecialinlinedviewModeldefault1(null, null, 3), "transformer is null")).TuitionPaymentFragmentbindingInflater1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.b(membershipInformationRequest)));
            final Function1 function3 = new Function1() { // from class: getCount
                private static final byte[] $$c = {21, -108, 100, 114};
                private static final int $$f = 135;
                private static int $10 = 0;
                private static int $11 = 1;
                private static final byte[] $$d = {32, 1, 70, -122, -2, 21, -2, 11, 6, 23, 8, -19, 28, 23, 11, 0, 17, -57, 56, 22, -1, 23, 6, 3, 4, 29, -12, 7, 21, 1, 22, -8, 11, 21, 12, -4, 13, 13, -3, 15, 7, 7, 7, 24, 13, 10, 6, -4, -8, 22, 19, 3, -12, 34, 3, 26, 10, 6, -4, -10, 28, 21, 13, -7, 23, 10, 42, -3, 20, -2, 15, 8, -21, 26, 33, -3, 1, 18, 15, -37, 53, -8, 15, 15, 1, 18, 15, -9, 16, 14, -1, 14, 14, 2, -21, 46, 1, 15, -2, 28, -6, 22, -56};
                private static final int $$e = 102;
                private static final byte[] $$a = {101, 89, 94, -73, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -55, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -54, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, -7, 18, 16, 1, 16, 16, 4, -19, 48, 3, 17, 0, 30, -4, 24, -54};
                private static final int $$b = 151;
                private static int TuitionPaymentFragmentbindingInflater1 = 0;
                private static int TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 1;
                private static long TuitionPaymentFragmentspecialinlinedviewModeldefault1 = -4307718266195539938L;

                /* JADX WARN: Code duplicated, block: B:10:0x0027  */
                /* JADX WARN: Code duplicated, block: B:8:0x001f  */
                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x002e). Please report as a decompilation issue!!! */
                /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                    jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0027
                    	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                    	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                    	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                    */
                private static void a(byte r6, short r7, int r8, java.lang.Object[] r9) {
                    /*
                        byte[] r0 = defpackage.getCount.$$a
                        int r7 = r7 * 4
                        int r7 = r7 + 84
                        int r8 = r8 * 15
                        int r1 = r8 + 38
                        int r6 = r6 * 52
                        int r6 = r6 + 4
                        byte[] r1 = new byte[r1]
                        int r8 = r8 + 37
                        r2 = 0
                        if (r0 != 0) goto L19
                        r7 = r6
                        r4 = r8
                        r3 = r2
                        goto L2e
                    L19:
                        r3 = r2
                    L1a:
                        byte r4 = (byte) r7
                        r1[r3] = r4
                        if (r3 != r8) goto L27
                        java.lang.String r6 = new java.lang.String
                        r6.<init>(r1, r2)
                        r9[r2] = r6
                        return
                    L27:
                        int r3 = r3 + 1
                        r4 = r0[r6]
                        r5 = r7
                        r7 = r6
                        r6 = r5
                    L2e:
                        int r6 = r6 + r4
                        int r7 = r7 + 1
                        int r6 = r6 + (-11)
                        r5 = r7
                        r7 = r6
                        r6 = r5
                        goto L1a
                    */
                    throw new UnsupportedOperationException("Method not decompiled: defpackage.getCount.a(byte, short, int, java.lang.Object[]):void");
                }

                private static void d(short s, short s2, int i2, Object[] objArr) {
                    byte[] bArr = $$d;
                    int i3 = s2 * 25;
                    int i4 = 108 - (i2 * 24);
                    int i5 = (s * 62) + 4;
                    byte[] bArr2 = new byte[i3 + 38];
                    int i6 = i3 + 37;
                    int i7 = -1;
                    if (bArr == null) {
                        i5++;
                        i4 = (i5 + i4) - 9;
                    }
                    while (true) {
                        i7++;
                        bArr2[i7] = (byte) i4;
                        if (i7 == i6) {
                            objArr[0] = new String(bArr2, 0);
                            return;
                        } else {
                            byte b = bArr[i5];
                            i5++;
                            i4 = (i4 + b) - 9;
                        }
                    }
                }

                private static void c(char[] cArr, int i2, Object[] objArr) throws Throwable {
                    int i3 = 2 % 2;
                    abortCapture abortcapture = new abortCapture();
                    char[] cArrB = abortCapture.b(TuitionPaymentFragmentspecialinlinedviewModeldefault1 ^ (-2687588926731523482L), cArr, i2);
                    abortcapture.b = 4;
                    while (abortcapture.b < cArrB.length) {
                        int i4 = $10 + 71;
                        $11 = i4 % 128;
                        int i5 = i4 % 2;
                        abortcapture.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = abortcapture.b - 4;
                        int i6 = abortcapture.b;
                        try {
                            Object[] objArr2 = {Long.valueOf(cArrB[abortcapture.b] ^ cArrB[abortcapture.b % 4]), Long.valueOf(abortcapture.TuitionPaymentFragmentspecialinlinedviewModeldefault1), Long.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault1)};
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-774687567);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                                byte b = (byte) 0;
                                byte b2 = b;
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) ((TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 64838), 1356 - Color.red(0), Color.rgb(0, 0, 0) + 16777254, 894276454, false, $$g(b, b2, (byte) (b2 - 1)), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                            }
                            cArrB[i6] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                            Object[] objArr3 = {abortcapture, abortcapture};
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-772308768);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (Drawable.resolveOpacity(0, 0) + 47773), TextUtils.lastIndexOf("", '0') + 469, (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 14, 896083767, false, "n", new Class[]{Object.class, Object.class});
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
                    int i7 = $10 + 57;
                    $11 = i7 % 128;
                    if (i7 % 2 == 0) {
                        int i8 = 15 / 0;
                    }
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) throws Throwable {
                    Object[] objArr;
                    int i2 = 2 % 2;
                    int i3 = TuitionPaymentFragmentbindingInflater1 + 93;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i3 % 128;
                    int i4 = i3 % 2;
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1354724972);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        char scrollBarSize = (char) (43042 - (ViewConfiguration.getScrollBarSize() >> 8));
                        int iLastIndexOf = 3110 - TextUtils.lastIndexOf("", '0', 0, 0);
                        int maxKeyCode = (KeyEvent.getMaxKeyCode() >> 16) + 22;
                        byte[] bArr = $$a;
                        byte b = bArr[7];
                        Object[] objArr2 = new Object[1];
                        a(b, b, bArr[132], objArr2);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(scrollBarSize, iLastIndexOf, maxKeyCode, -1272852037, false, (String) objArr2[0], null);
                    }
                    long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
                    Object[] objArr3 = new Object[1];
                    c(new char[]{31580, 551, 21436, 31549, 57393, 38696, 37558, 13740, 62163, 28182, 7432, 1226, 26867, 62572, 35618, 36567, 59013, 33356, 12632, 28865, 23729, 2972, 49056, 64299, 51807, 37268}, TextUtils.getCapsMode("", 0, 0), objArr3);
                    Class<?> cls = Class.forName((String) objArr3[0]);
                    Object[] objArr4 = new Object[1];
                    c(new char[]{32363, 9633, 12810, 32270, 51125, 63131, 44097, 2905, 63480, 18844, 31934, 14915, 28110, 54264, 60118, 45061, 58274, 42452, 20735}, ViewConfiguration.getScrollBarFadeDuration() >> 16, objArr4);
                    long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1355648493);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                        char doubleTapTimeout = (char) (43042 - (ViewConfiguration.getDoubleTapTimeout() >> 16));
                        int mode = View.MeasureSpec.getMode(0) + 3111;
                        int iLastIndexOf2 = TextUtils.lastIndexOf("", '0', 0) + 23;
                        byte[] bArr2 = $$a;
                        byte b2 = bArr2[132];
                        Object[] objArr5 = new Object[1];
                        a(b2, bArr2[7], b2, objArr5);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(doubleTapTimeout, mode, iLastIndexOf2, -1269618118, false, (String) objArr5[0], null);
                    }
                    if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-308143642);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                            char cRed = (char) (43042 - Color.red(0));
                            int iRgb = (-16774105) - Color.rgb(0, 0, 0);
                            int longPressTimeout = (ViewConfiguration.getLongPressTimeout() >> 16) + 22;
                            byte[] bArr3 = $$a;
                            byte b3 = bArr3[37];
                            byte b4 = bArr3[7];
                            Object[] objArr6 = new Object[1];
                            a(b3, b4, b4, objArr6);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(cRed, iRgb, longPressTimeout, 154975793, false, (String) objArr6[0], null);
                        }
                        Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
                        int i5 = ((int[]) objArr7[2])[0];
                        int i6 = ((int[]) objArr7[1])[0];
                        String[] strArr = (String[]) objArr7[3];
                        int iIdentityHashCode = System.identityHashCode(this);
                        int i7 = ~iIdentityHashCode;
                        int i8 = (((((~(i7 | 1051607743)) | ((~((-653423716) | i7)) | 5256256)) * (-397)) + 453028662) + ((iIdentityHashCode | 408696540) * 397)) - 1664826004;
                        int i9 = (i8 << 13) ^ i8;
                        int i10 = i9 ^ (i9 >>> 17);
                        ((int[]) objArr[0])[0] = i10 ^ (i10 << 5);
                        objArr = new Object[]{new int[1], new int[]{i6}, new int[]{i5}, strArr};
                    } else {
                        Object[] objArr8 = new Object[1];
                        c(new char[]{36868, 6145, 4763, 36974, 64024, 54813, 63959, 24286, 6602, 29749, 23594, 28664, 33699, 60951, 51832, 58767, 3543, 39021, 28782, 7099}, (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) - 1, objArr8);
                        Class<?> cls2 = Class.forName((String) objArr8[0]);
                        Object[] objArr9 = new Object[1];
                        c(new char[]{2321, 34811, 25201, 2424, 26087, 42724, 41420, 1738, 32901, 60362, 11477, 14331, 6809, 29090, 47794, 48522, 38130, 1932, 133, 17319}, KeyEvent.normalizeMetaState(0), objArr9);
                        try {
                            Object[] objArr10 = {null, Integer.valueOf(((Integer) cls2.getMethod((String) objArr9[0], Object.class).invoke(null, this)).intValue()), 0, -1664826004};
                            byte[] bArr4 = $$d;
                            byte b5 = bArr4[15];
                            Object[] objArr11 = new Object[1];
                            d(b5, bArr4[1], b5, objArr11);
                            Class<?> cls3 = Class.forName((String) objArr11[0]);
                            byte b6 = bArr4[1];
                            Object[] objArr12 = new Object[1];
                            d(b6, bArr4[15], b6, objArr12);
                            Object[] objArr13 = (Object[]) cls3.getMethod((String) objArr12[0], Class.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr10);
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-308143642);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                                char bitsPerPixel = (char) (ImageFormat.getBitsPerPixel(0) + 43043);
                                int threadPriority = ((Process.getThreadPriority(0) + 20) >> 6) + 3111;
                                int keyRepeatTimeout = (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 22;
                                byte[] bArr5 = $$a;
                                byte b7 = bArr5[37];
                                byte b8 = bArr5[7];
                                Object[] objArr14 = new Object[1];
                                a(b7, b8, b8, objArr14);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(bitsPerPixel, threadPriority, keyRepeatTimeout, 154975793, false, (String) objArr14[0], null);
                            }
                            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr13);
                            try {
                                Object[] objArr15 = new Object[1];
                                c(new char[]{31580, 551, 21436, 31549, 57393, 38696, 37558, 13740, 62163, 28182, 7432, 1226, 26867, 62572, 35618, 36567, 59013, 33356, 12632, 28865, 23729, 2972, 49056, 64299, 51807, 37268}, TextUtils.getOffsetBefore("", 0), objArr15);
                                Class<?> cls4 = Class.forName((String) objArr15[0]);
                                Object[] objArr16 = new Object[1];
                                c(new char[]{32363, 9633, 12810, 32270, 51125, 63131, 44097, 2905, 63480, 18844, 31934, 14915, 28110, 54264, 60118, 45061, 58274, 42452, 20735}, ViewConfiguration.getLongPressTimeout() >> 16, objArr16);
                                long jLongValue2 = ((Long) cls4.getDeclaredMethod((String) objArr16[0], new Class[0]).invoke(null, new Object[0])).longValue();
                                Long lValueOf = Long.valueOf(jLongValue2);
                                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1355648493);
                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                                    char windowTouchSlop = (char) (43042 - (ViewConfiguration.getWindowTouchSlop() >> 8));
                                    int i11 = (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 3110;
                                    int packedPositionType = ExpandableListView.getPackedPositionType(0L) + 22;
                                    byte[] bArr6 = $$a;
                                    byte b9 = bArr6[132];
                                    Object[] objArr17 = new Object[1];
                                    a(b9, bArr6[7], b9, objArr17);
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(windowTouchSlop, i11, packedPositionType, -1269618118, false, (String) objArr17[0], null);
                                }
                                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                                Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1354724972);
                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                                    char mirror = (char) (AndroidCharacter.getMirror('0') + 42994);
                                    int touchSlop = (ViewConfiguration.getTouchSlop() >> 8) + 3111;
                                    int iIndexOf = 21 - TextUtils.indexOf((CharSequence) "", '0');
                                    byte[] bArr7 = $$a;
                                    byte b10 = bArr7[7];
                                    Object[] objArr18 = new Object[1];
                                    a(b10, b10, bArr7[132], objArr18);
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(mirror, touchSlop, iIndexOf, -1272852037, false, (String) objArr18[0], null);
                                }
                                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf2);
                                objArr = objArr13;
                            } catch (Exception unused) {
                                throw new RuntimeException();
                            }
                        } catch (Throwable th) {
                            Throwable cause = th.getCause();
                            if (cause != null) {
                                throw cause;
                            }
                            throw th;
                        }
                    }
                    int i12 = ((int[]) objArr[1])[0];
                    int i13 = ((int[]) objArr[2])[0];
                    if (i13 == i12) {
                        int i14 = TuitionPaymentFragmentbindingInflater1 + 55;
                        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i14 % 128;
                        int i15 = i14 % 2;
                        int i16 = ((int[]) objArr[0])[0];
                        int i17 = ((int[]) objArr[2])[0];
                        int i18 = ((int[]) objArr[1])[0];
                        String[] strArr2 = (String[]) objArr[3];
                        int i19 = (int) Runtime.getRuntime().totalMemory();
                        int i20 = i16 + (-1901287946) + (((~((-1456574229) | i19)) | (-248457231)) * (-964)) + (((~((~i19) | (-1456574229))) | 1343260432) * (-964));
                        int i21 = (i20 << 13) ^ i20;
                        int i22 = i21 ^ (i21 >>> 17);
                        ((int[]) objArr[0])[0] = i22 ^ (i22 << 5);
                        Object[] objArr19 = {new int[1], new int[]{i18}, new int[]{i17}, strArr2};
                    } else {
                        ArrayList arrayList = new ArrayList();
                        String[] strArr3 = (String[]) objArr[3];
                        if (strArr3 != null) {
                            int i23 = TuitionPaymentFragmentbindingInflater1 + 95;
                            int i24 = i23 % 128;
                            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i24;
                            int i25 = i24 + 107;
                            TuitionPaymentFragmentbindingInflater1 = i25 % 128;
                            int i26 = i25 % 2;
                            for (int i27 = i23 % 2 == 0 ? 1 : 0; i27 < strArr3.length; i27++) {
                                arrayList.add(strArr3[i27]);
                            }
                        }
                        int[] iArr = new int[i13];
                        int i28 = i13 - 1;
                        iArr[i28] = 1;
                        Toast.makeText((Context) null, iArr[((i13 * i28) % 2) - 1], 1).show();
                        int i29 = ((int[]) objArr[0])[0];
                        int i30 = ((int[]) objArr[2])[0];
                        int i31 = ((int[]) objArr[1])[0];
                        String[] strArr4 = (String[]) objArr[3];
                        int[] iArr2 = {i30};
                        int i32 = (int) Runtime.getRuntime().totalMemory();
                        int i33 = ~i32;
                        int i34 = i29 + (-1272411950) + (((~((-755302518) | i33)) | 671154213) * 168) + ((~((-671154214) | i32)) * 168) + (((~(i32 | (-84148305))) | (~(i33 | (-949728942))) | 278574728) * 168);
                        int i35 = (i34 << 13) ^ i34;
                        int i36 = i35 ^ (i35 >>> 17);
                        ((int[]) objArr[0])[0] = i36 ^ (i36 << 5);
                        Object[] objArr20 = {new int[1], new int[]{i31}, iArr2, strArr4};
                    }
                    Unit unitB = getAdapter.b(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, (BPUMembershipInformation) obj);
                    int i37 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 15;
                    TuitionPaymentFragmentbindingInflater1 = i37 % 128;
                    int i38 = i37 % 2;
                    return unitB;
                }

                private static String $$g(byte b, int i2, short s) {
                    int i3 = b * 4;
                    int i4 = 107 - (i2 * 4);
                    byte[] bArr = $$c;
                    int i5 = s + 4;
                    byte[] bArr2 = new byte[i3 + 1];
                    int i6 = -1;
                    if (bArr == null) {
                        int i7 = i5 + (-i3);
                        i5 = i5;
                        i4 = i7;
                    }
                    while (true) {
                        i6++;
                        int i8 = i5 + 1;
                        bArr2[i6] = (byte) i4;
                        if (i6 == i3) {
                            return new String(bArr2, 0);
                        }
                        i5 = i8;
                        i4 += -bArr[i8];
                    }
                }
            };
            logToString logtostring2 = new logToString() { // from class: saveHierarchyState
                @Override // defpackage.logToString
                public final void accept(Object obj) {
                    function3.invoke(obj);
                }
            };
            final Function1 function4 = new Function1() { // from class: MenuAdapter
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return getAdapter.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, (Throwable) obj);
                }
            };
            BufferProviderState bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault4 = derivecodecB2.TuitionPaymentFragmentspecialinlinedviewModeldefault3(logtostring2, new logToString() { // from class: getForceShowIcon
                @Override // defpackage.logToString
                public final void accept(Object obj) {
                    function4.invoke(obj);
                }
            });
            Intrinsics.checkNotNullExpressionValue(bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault4, "");
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault3(bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault4);
            return;
        }
        if (i != 3) {
            throw new NoWhenBranchMatchedException();
        }
        MutableLiveData<VirtualCameraAdapter1<PUMembershipInformation>> mutableLiveData3 = this.asInterface;
        VirtualCameraAdapter1.Companion companion3 = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData3.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentbindingInflater1());
        deriveCodec derivecodecB3 = deriveCodec.b(((modifyBitrate) share.b(onResume.TuitionPaymentFragmentspecialinlinedviewModeldefault1(null, null, 3), "transformer is null")).TuitionPaymentFragmentbindingInflater1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault3(membershipInformationRequest)));
        final Function1 function5 = new Function1() { // from class: ListMenuPresenterMenuAdapter
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return getAdapter.TuitionPaymentFragmentbindingInflater1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, (PUMembershipInformation) obj);
            }
        };
        logToString logtostring3 = new logToString() { // from class: getAdapterMenu
            @Override // defpackage.logToString
            public final void accept(Object obj) {
                function5.invoke(obj);
            }
        };
        final Function1 function6 = new Function1() { // from class: dispatchPresenterUpdate
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return getAdapter.TuitionPaymentFragmentspecialinlinedviewModeldefault1(this.b, (Throwable) obj);
            }
        };
        BufferProviderState bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault5 = derivecodecB3.TuitionPaymentFragmentspecialinlinedviewModeldefault3(logtostring3, new logToString() { // from class: dispatchRestoreInstanceState
            @Override // defpackage.logToString
            public final void accept(Object obj) {
                function6.invoke(obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault5, "");
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault3(bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault5);
    }

    @Override // androidx.p002lifecycle.ViewModel
    public final void onCleared() {
        super.onCleared();
        if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.isDisposed()) {
            return;
        }
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.dispose();
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault1(getAdapter getadapter, Throwable th) {
        Intrinsics.checkNotNull(th);
        setRccState.TuitionPaymentFragmentspecialinlinedviewModeldefault3(th, getadapter.asInterface);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault3(getAdapter getadapter, Throwable th) {
        Intrinsics.checkNotNull(th);
        setRccState.TuitionPaymentFragmentspecialinlinedviewModeldefault3(th, getadapter.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault2(getAdapter getadapter, Throwable th) {
        Intrinsics.checkNotNull(th);
        setRccState.TuitionPaymentFragmentspecialinlinedviewModeldefault3(th, getadapter.b);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault1(getAdapter getadapter, List list) {
        MutableLiveData<VirtualCameraAdapter1<List<DigitalCard>>> mutableLiveData = getadapter.TuitionPaymentFragmentbindingInflater1;
        VirtualCameraAdapter1.Companion companion = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentbindingInflater1(list));
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit b(getAdapter getadapter, Throwable th) {
        Intrinsics.checkNotNull(th);
        setRccState.TuitionPaymentFragmentspecialinlinedviewModeldefault3(th, getadapter.TuitionPaymentFragmentbindingInflater1);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentbindingInflater1(getAdapter getadapter, PUMembershipInformation pUMembershipInformation) {
        MutableLiveData<VirtualCameraAdapter1<PUMembershipInformation>> mutableLiveData = getadapter.asInterface;
        VirtualCameraAdapter1.Companion companion = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentbindingInflater1(pUMembershipInformation));
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentbindingInflater1(getAdapter getadapter, PMIMembershipInformation pMIMembershipInformation) {
        MutableLiveData<VirtualCameraAdapter1<PMIMembershipInformation>> mutableLiveData = getadapter.b;
        VirtualCameraAdapter1.Companion companion = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentbindingInflater1(pMIMembershipInformation));
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit b(getAdapter getadapter, BPUMembershipInformation bPUMembershipInformation) {
        MutableLiveData<VirtualCameraAdapter1<BPUMembershipInformation>> mutableLiveData = getadapter.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        VirtualCameraAdapter1.Companion companion = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentbindingInflater1(bPUMembershipInformation));
        return Unit.INSTANCE;
    }
}
