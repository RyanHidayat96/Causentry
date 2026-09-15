package defpackage;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.p002lifecycle.MutableLiveData;
import androidx.p002lifecycle.ViewModel;
import com.bpjstku.data.lib.model.BaseRequest;
import com.bpjstku.data.office.model.request.BranchOfficeRequest;
import com.bpjstku.data.office.model.request.NearestBranchOfficeRequest;
import com.bpjstku.data.office.model.response.BranchOfficeDefaultSelectedResponse;
import com.bpjstku.domain.branchoffice.model.Office;
import com.bpjstku.domain.branchoffice.model.RegionalOffice;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.io.encoding.Base64;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Typography;

/* JADX INFO: loaded from: classes3.dex */
public final class drawSelectorCompat extends ViewModel {
    public final acquireBuffer TuitionPaymentFragmentbindingInflater1;
    public final MutableLiveData<VirtualCameraAdapter1<List<RegionalOffice>>> TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    public final MutableLiveData<VirtualCameraAdapter1<List<Office>>> TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    public final MutableLiveData<VirtualCameraAdapter1<List<Office>>> TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MutableLiveData<VirtualCameraAdapter1<Office>> f898a;
    public final MutableLiveData<VirtualCameraAdapter1<List<RegionalOffice>>> asInterface;
    public final MutableLiveData<VirtualCameraAdapter1<BranchOfficeDefaultSelectedResponse>> b;
    public final getFrameTimeMillis d;

    public drawSelectorCompat(getFrameTimeMillis getframetimemillis, acquireBuffer acquirebuffer) {
        Intrinsics.checkNotNullParameter(getframetimemillis, "");
        Intrinsics.checkNotNullParameter(acquirebuffer, "");
        this.d = getframetimemillis;
        this.TuitionPaymentFragmentbindingInflater1 = acquirebuffer;
        MutableLiveData<VirtualCameraAdapter1<List<Office>>> mutableLiveData = new MutableLiveData<>();
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = mutableLiveData;
        MutableLiveData<VirtualCameraAdapter1<List<RegionalOffice>>> mutableLiveData2 = new MutableLiveData<>();
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = mutableLiveData2;
        MutableLiveData<VirtualCameraAdapter1<List<RegionalOffice>>> mutableLiveData3 = new MutableLiveData<>();
        this.asInterface = mutableLiveData3;
        MutableLiveData<VirtualCameraAdapter1<List<Office>>> mutableLiveData4 = new MutableLiveData<>();
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = mutableLiveData4;
        MutableLiveData<VirtualCameraAdapter1<Office>> mutableLiveData5 = new MutableLiveData<>();
        this.f898a = mutableLiveData5;
        MutableLiveData<VirtualCameraAdapter1<BranchOfficeDefaultSelectedResponse>> mutableLiveData6 = new MutableLiveData<>();
        this.b = mutableLiveData6;
        mutableLiveData.setValue(new VirtualCameraAdapter1.TuitionPaymentFragmentbindingInflater1());
        mutableLiveData2.setValue(new VirtualCameraAdapter1.TuitionPaymentFragmentbindingInflater1());
        mutableLiveData4.setValue(new VirtualCameraAdapter1.TuitionPaymentFragmentbindingInflater1());
        mutableLiveData5.setValue(new VirtualCameraAdapter1.TuitionPaymentFragmentbindingInflater1());
        mutableLiveData3.setValue(new VirtualCameraAdapter1.TuitionPaymentFragmentbindingInflater1());
        mutableLiveData6.setValue(new VirtualCameraAdapter1.TuitionPaymentFragmentbindingInflater1());
    }

    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        MutableLiveData<VirtualCameraAdapter1<List<RegionalOffice>>> mutableLiveData = this.asInterface;
        VirtualCameraAdapter1.Companion companion = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentbindingInflater1());
        deriveCodec derivecodecB = deriveCodec.b(((modifyBitrate) share.b(onResume.TuitionPaymentFragmentspecialinlinedviewModeldefault1(null, null, 3), "transformer is null")).TuitionPaymentFragmentbindingInflater1(this.d.TuitionPaymentFragmentspecialinlinedviewModeldefault1(new BaseRequest())));
        final Function1 function1 = new Function1() { // from class: positionSelectorLikeFocusCompat
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return drawSelectorCompat.TuitionPaymentFragmentbindingInflater1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, (List) obj);
            }
        };
        logToString logtostring = new logToString() { // from class: positionSelectorCompat
            @Override // defpackage.logToString
            public final void accept(Object obj) {
                function1.invoke(obj);
            }
        };
        final Function1 function2 = new Function1() { // from class: setPressedItem
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return drawSelectorCompat.TuitionPaymentFragmentbindingInflater1(this.TuitionPaymentFragmentbindingInflater1, (Throwable) obj);
            }
        };
        BufferProviderState bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3 = derivecodecB.TuitionPaymentFragmentspecialinlinedviewModeldefault3(logtostring, new logToString() { // from class: setSelectorEnabled
            @Override // defpackage.logToString
            public final void accept(Object obj) {
                function2.invoke(obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3, "");
        this.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault3(bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3);
    }

    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        MutableLiveData<VirtualCameraAdapter1<List<RegionalOffice>>> mutableLiveData = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        VirtualCameraAdapter1.Companion companion = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentbindingInflater1());
        deriveCodec derivecodecB = deriveCodec.b(((modifyBitrate) share.b(onResume.TuitionPaymentFragmentspecialinlinedviewModeldefault1(null, null, 3), "transformer is null")).TuitionPaymentFragmentbindingInflater1(this.d.TuitionPaymentFragmentspecialinlinedviewModeldefault2(new BaseRequest())));
        final Function1 function1 = new Function1() { // from class: isInTouchMode
            private static final byte[] $$c = {42, -104, -68, 105};
            private static final int $$f = 109;
            private static int $10 = 0;
            private static int $11 = 1;
            private static final byte[] $$d = {83, -4, -55, -17, -20, -6, 55, -65, -16, -8, 0, -13, -1, 47, -64, -11, -17, 5, -5, -7, -26, 6, 47, -61, -23, 9, -26, 3, -12, -21, -3, 3, -2, -24, Base64.padSymbol, -67, -13, -14, 7, -21, -4, 5, -19, 54, -71, -10, 3, -9, -15, 54, -27, -60, -7, -3, 17, -19, -19, -17, 8, -2, 20, -55, 9, -26, 3, -12, -21, -3, 3, -2, -24, 25, -27, -19, -7, -11, -10, 13, 4, -26, -22, -8, 2, -14, -7, 7, 18, -57, 9, -17, -14, 13, 5, -37, -5, -8, -11, -14, -7, 43, -58, -8, 2, -6, -15, -7, 0, -17, -14, 72, -21};
            private static final int $$e = 188;
            private static final byte[] $$a = {93, -122, -23, -24, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -54, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -55, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, -7, 18, 16, 1, 16, 16, 4, -19, 48, 3, 17, 0, 30, -4, 24, -54};
            private static final int $$b = 209;
            private static int TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
            private static int TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 1;
            private static char[] TuitionPaymentFragmentbindingInflater1 = {60058, 60040, 60053, 59745, 60090, 60055, 60079, 60052, 59748, 60041, 60043, 60054, 60034, 59746, 60088, 60056, 60045, 60083, 60060, 60051, 60062, 60046, 60050, 60048, 59749, 60061, 59744, 60049, 59747, 60117, 59750, 60047, 60063, 60072, 60073, 59751};
            private static char b = 57191;

            private static void a(byte b2, byte b3, int i, Object[] objArr) {
                int i2 = (i * 2) + 84;
                byte[] bArr = $$a;
                int i3 = b2 + 4;
                int i4 = b3 * 15;
                byte[] bArr2 = new byte[53 - i4];
                int i5 = 52 - i4;
                int i6 = -1;
                if (bArr == null) {
                    i2 = (i2 + i5) - 11;
                }
                while (true) {
                    i6++;
                    i3++;
                    bArr2[i6] = (byte) i2;
                    if (i6 == i5) {
                        objArr[0] = new String(bArr2, 0);
                        return;
                    }
                    i2 = (i2 + bArr[i3]) - 11;
                }
            }

            /* JADX WARN: Code duplicated, block: B:10:0x0023  */
            /* JADX WARN: Code duplicated, block: B:8:0x001b  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x002b). Please report as a decompilation issue!!! */
            /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0023
                	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                */
            private static void d(int r7, byte r8, int r9, java.lang.Object[] r10) {
                /*
                    byte[] r0 = defpackage.isInTouchMode.$$d
                    int r7 = r7 + 4
                    int r8 = r8 * 107
                    int r8 = 108 - r8
                    int r9 = 99 - r9
                    byte[] r1 = new byte[r8]
                    r2 = 0
                    if (r0 != 0) goto L13
                    r3 = r9
                    r5 = r2
                    r9 = r7
                    goto L2b
                L13:
                    r3 = r2
                L14:
                    byte r4 = (byte) r9
                    int r5 = r3 + 1
                    r1[r3] = r4
                    if (r5 != r8) goto L23
                    java.lang.String r7 = new java.lang.String
                    r7.<init>(r1, r2)
                    r10[r2] = r7
                    return
                L23:
                    int r7 = r7 + 1
                    r3 = r0[r7]
                    r6 = r9
                    r9 = r7
                    r7 = r3
                    r3 = r6
                L2b:
                    int r7 = -r7
                    int r3 = r3 + r7
                    int r7 = r3 + (-8)
                    r3 = r5
                    r6 = r9
                    r9 = r7
                    r7 = r6
                    goto L14
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.isInTouchMode.d(int, byte, int, java.lang.Object[]):void");
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) throws Throwable {
                Object[] objArr;
                int i = 2 % 2;
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(797565291);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    char packedPositionChild = (char) ((-1) - ExpandableListView.getPackedPositionChild(0L));
                    int iRgb = (-16774949) - Color.rgb(0, 0, 0);
                    int offsetAfter = 33 - TextUtils.getOffsetAfter("", 0);
                    byte[] bArr = $$a;
                    byte b2 = bArr[5];
                    byte b3 = bArr[7];
                    Object[] objArr2 = new Object[1];
                    a(b2, b3, b3, objArr2);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(packedPositionChild, iRgb, offsetAfter, -887667012, false, (String) objArr2[0], null);
                }
                long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
                Object[] objArr3 = new Object[1];
                c(new char[]{1, 3, '!', '\b', '\n', 19, '#', 26, '\r', 7, 27, '#', '\r', 0, ' ', 19, '\b', 17, 1, 11, 17, 21}, (byte) ((ViewConfiguration.getJumpTapTimeout() >> 16) + 65), Process.getGidForName("") + 23, objArr3);
                Class<?> cls = Class.forName((String) objArr3[0]);
                Object[] objArr4 = new Object[1];
                c(new char[]{23, 2, 4, 6, 2, 19, '!', '#', 18, 2, 1, '#', 23, '\n', 13835}, (byte) (12 - (ViewConfiguration.getTapTimeout() >> 16)), 16 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), objArr4);
                long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(796641770);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                    char cLastIndexOf = (char) ((-1) - TextUtils.lastIndexOf("", '0', 0, 0));
                    int iKeyCodeFromString = 2267 - KeyEvent.keyCodeFromString("");
                    int iResolveSize = 33 - View.resolveSize(0, 0);
                    byte b4 = $$a[7];
                    Object[] objArr5 = new Object[1];
                    a((byte) 51, b4, b4, objArr5);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cLastIndexOf, iKeyCodeFromString, iResolveSize, -874156483, false, (String) objArr5[0], null);
                }
                if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1013250600);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                        char scrollDefaultDelay = (char) (ViewConfiguration.getScrollDefaultDelay() >> 16);
                        int scrollBarSize = 2267 - (ViewConfiguration.getScrollBarSize() >> 8);
                        int iMakeMeasureSpec = 33 - View.MeasureSpec.makeMeasureSpec(0, 0);
                        byte[] bArr2 = $$a;
                        Object[] objArr6 = new Object[1];
                        a((byte) 103, bArr2[132], bArr2[7], objArr6);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(scrollDefaultDelay, scrollBarSize, iMakeMeasureSpec, -654680577, false, (String) objArr6[0], null);
                    }
                    Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
                    objArr = new Object[]{new int[]{i}, strArr, new int[1], new int[]{i}};
                    int i2 = ((int[]) objArr7[0])[0];
                    int i3 = ((int[]) objArr7[3])[0];
                    String[] strArr = (String[]) objArr7[1];
                    int iUptimeMillis = (int) SystemClock.uptimeMillis();
                    int i4 = (-651543447) + (((-4721957) | (~iUptimeMillis)) * (-490)) + (((~(iUptimeMillis | (-199863591))) | 195141634) * 490) + 924715091;
                    int i5 = (i4 << 13) ^ i4;
                    int i6 = i5 ^ (i5 >>> 17);
                    ((int[]) objArr[2])[0] = i6 ^ (i6 << 5);
                } else {
                    Object[] objArr8 = new Object[1];
                    c(new char[]{1, 3, '!', '\b', '\n', 19, '#', 26, 4, 6, 11, 28, 3, 16, Typography.quote, 19, 22, 28, 30, '\r', 7, 18, '\b', 21, 2, 30}, (byte) (100 - TextUtils.getCapsMode("", 0, 0)), View.MeasureSpec.getMode(0) + 26, objArr8);
                    Class<?> cls2 = Class.forName((String) objArr8[0]);
                    Object[] objArr9 = new Object[1];
                    c(new char[]{21, 27, 13890, 13890, 26, '\b', Typography.quote, 1, 13892, 13892, 4, 23, '\f', 3, Typography.quote, 19, '\b', 1}, (byte) (90 - (ViewConfiguration.getDoubleTapTimeout() >> 16)), TextUtils.lastIndexOf("", '0') + 19, objArr9);
                    Context applicationContext = (Context) cls2.getMethod((String) objArr9[0], new Class[0]).invoke(null, null);
                    if (applicationContext != null) {
                        applicationContext = (!((applicationContext instanceof ContextWrapper) ^ true) && ((ContextWrapper) applicationContext).getBaseContext() == null) ? null : applicationContext.getApplicationContext();
                    }
                    Object[] objArr10 = new Object[1];
                    c(new char[]{24, 3, '\f', 4, '#', 11, 1, 3, 23, 24, 30, 15, 7, 1, 23, '\b'}, (byte) ((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 6), KeyEvent.normalizeMetaState(0) + 16, objArr10);
                    Class<?> cls3 = Class.forName((String) objArr10[0]);
                    Object[] objArr11 = new Object[1];
                    c(new char[]{20, Typography.quote, 26, '\b', Typography.quote, 19, 30, '\r', '\f', 5, 7, 25, '\r', '\b', 2, 26}, (byte) (81 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))), (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 16, objArr11);
                    try {
                        Object[] objArr12 = {applicationContext, Integer.valueOf(((Integer) cls3.getMethod((String) objArr11[0], Object.class).invoke(null, this)).intValue()), 0, -1386629889};
                        byte[] bArr3 = $$d;
                        byte b5 = bArr3[12];
                        byte b6 = bArr3[10];
                        Object[] objArr13 = new Object[1];
                        d(b5, b6, b6, objArr13);
                        Class<?> cls4 = Class.forName((String) objArr13[0]);
                        byte b7 = (byte) (-bArr3[12]);
                        Object[] objArr14 = new Object[1];
                        d((byte) 106, b7, b7, objArr14);
                        objArr = (Object[]) cls4.getMethod((String) objArr14[0], Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr12);
                        if (applicationContext != null) {
                            int i7 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 81;
                            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i7 % 128;
                            int i8 = i7 % 2;
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1013250600);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                                char c = (char) ((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) - 1);
                                int iMyPid = (Process.myPid() >> 22) + 2267;
                                int size = View.MeasureSpec.getSize(0) + 33;
                                byte[] bArr4 = $$a;
                                Object[] objArr15 = new Object[1];
                                a((byte) 103, bArr4[132], bArr4[7], objArr15);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(c, iMyPid, size, -654680577, false, (String) objArr15[0], null);
                            }
                            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr);
                            try {
                                Object[] objArr16 = new Object[1];
                                c(new char[]{1, 3, '!', '\b', '\n', 19, '#', 26, '\r', 7, 27, '#', '\r', 0, ' ', 19, '\b', 17, 1, 11, 17, 21}, (byte) (65 - Drawable.resolveOpacity(0, 0)), TextUtils.getCapsMode("", 0, 0) + 22, objArr16);
                                Class<?> cls5 = Class.forName((String) objArr16[0]);
                                Object[] objArr17 = new Object[1];
                                c(new char[]{23, 2, 4, 6, 2, 19, '!', '#', 18, 2, 1, '#', 23, '\n', 13835}, (byte) (TextUtils.getOffsetAfter("", 0) + 12), 15 - View.getDefaultSize(0, 0), objArr17);
                                long jLongValue2 = ((Long) cls5.getDeclaredMethod((String) objArr17[0], new Class[0]).invoke(null, new Object[0])).longValue();
                                Long lValueOf = Long.valueOf(jLongValue2);
                                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(796641770);
                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                                    char packedPositionChild2 = (char) ((-1) - ExpandableListView.getPackedPositionChild(0L));
                                    int iMyPid2 = (Process.myPid() >> 22) + 2267;
                                    int iIndexOf = TextUtils.indexOf("", "", 0, 0) + 33;
                                    byte b8 = $$a[7];
                                    Object[] objArr18 = new Object[1];
                                    a((byte) 51, b8, b8, objArr18);
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(packedPositionChild2, iMyPid2, iIndexOf, -874156483, false, (String) objArr18[0], null);
                                }
                                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                                Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(797565291);
                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                                    char cResolveSizeAndState = (char) View.resolveSizeAndState(0, 0, 0);
                                    int maximumFlingVelocity = (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 2267;
                                    int iBlue = Color.blue(0) + 33;
                                    byte[] bArr5 = $$a;
                                    byte b9 = bArr5[5];
                                    byte b10 = bArr5[7];
                                    Object[] objArr19 = new Object[1];
                                    a(b9, b10, b10, objArr19);
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(cResolveSizeAndState, maximumFlingVelocity, iBlue, -887667012, false, (String) objArr19[0], null);
                                }
                                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf2);
                            } catch (Exception unused) {
                                throw new RuntimeException();
                            }
                        }
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause != null) {
                            throw cause;
                        }
                        throw th;
                    }
                }
                if (((int[]) objArr[0])[0] == ((int[]) objArr[3])[0]) {
                    Object[] objArr20 = {new int[]{i}, strArr, new int[1], new int[]{i}};
                    int i9 = ((int[]) objArr[2])[0];
                    int i10 = ((int[]) objArr[0])[0];
                    int i11 = ((int[]) objArr[3])[0];
                    String[] strArr2 = (String[]) objArr[1];
                    int iIdentityHashCode = System.identityHashCode(this);
                    int i12 = ~iIdentityHashCode;
                    int i13 = i9 + 527904327 + (((~((-177191123) | i12)) | 631522193) * (-602)) + (((~(iIdentityHashCode | (-177191123))) | 8650896 | (~(800062419 | i12))) * (-301)) + ((~(i12 | 631522193)) * 301);
                    int i14 = (i13 << 13) ^ i13;
                    int i15 = i14 ^ (i14 >>> 17);
                    ((int[]) objArr20[2])[0] = i15 ^ (i15 << 5);
                    int i16 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 9;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i16 % 128;
                    int i17 = i16 % 2;
                    return drawSelectorCompat.b(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, (List) obj);
                }
                ArrayList arrayList = new ArrayList();
                String[] strArr3 = (String[]) objArr[1];
                if (strArr3 != null) {
                    for (String str : strArr3) {
                        arrayList.add(str);
                    }
                    throw null;
                }
                throw null;
            }

            private static void c(char[] cArr, byte b2, int i, Object[] objArr) throws Throwable {
                int i2;
                int i3 = 2;
                int i4 = 2 % 2;
                deInitSession deinitsession = new deInitSession();
                char[] cArr2 = TuitionPaymentFragmentbindingInflater1;
                int i5 = 1770390596;
                int i6 = 13;
                if (cArr2 != null) {
                    int length = cArr2.length;
                    char[] cArr3 = new char[length];
                    int i7 = 0;
                    while (i7 < length) {
                        int i8 = $11 + i6;
                        $10 = i8 % 128;
                        int i9 = i8 % i3;
                        try {
                            Object[] objArr2 = {Integer.valueOf(cArr2[i7])};
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(i5);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                                byte b3 = (byte) 0;
                                byte b4 = b3;
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) ((-1) - MotionEvent.axisFromString("")), TextUtils.getOffsetAfter("", 0) + 2267, (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 33, -1927765101, false, $$g(b3, b4, (byte) (b4 - 1)), new Class[]{Integer.TYPE});
                            }
                            cArr3[i7] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                            i7++;
                            i3 = 2;
                            i5 = 1770390596;
                            i6 = 13;
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
                Object[] objArr3 = {Integer.valueOf(b)};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1770390596);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                    byte b5 = (byte) 0;
                    byte b6 = b5;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) Gravity.getAbsoluteGravity(0, 0), (ViewConfiguration.getWindowTouchSlop() >> 8) + 2267, 'Q' - AndroidCharacter.getMirror('0'), -1927765101, false, $$g(b5, b6, (byte) (b6 - 1)), new Class[]{Integer.TYPE});
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
                    int i10 = $10 + 95;
                    $11 = i10 % 128;
                    if (i10 % 2 == 0) {
                        deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 1;
                    } else {
                        deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
                    }
                    while (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 < i2) {
                        deinitsession.b = cArr[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3];
                        deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = cArr[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1];
                        if (deinitsession.b == deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                            cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = (char) (deinitsession.b - b2);
                            cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = (char) (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault2 - b2);
                        } else {
                            try {
                                Object[] objArr4 = {deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession};
                                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(486174475);
                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                                    char trimmedLength = (char) (TextUtils.getTrimmedLength("") + 49267);
                                    int fadingEdgeLength = (ViewConfiguration.getFadingEdgeLength() >> 16) + 3261;
                                    int windowTouchSlop = (ViewConfiguration.getWindowTouchSlop() >> 8) + 30;
                                    byte b7 = (byte) ($$f & 3);
                                    byte b8 = (byte) (b7 - 1);
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(trimmedLength, fadingEdgeLength, windowTouchSlop, -127612708, false, $$g(b7, b8, (byte) (b8 - 1)), new Class[]{Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class});
                                }
                                if (((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4)).intValue() == deinitsession.asBinder) {
                                    Object[] objArr5 = {deinitsession, deinitsession, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), deinitsession, Integer.valueOf(cCharValue), deinitsession};
                                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1187000607);
                                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                                        byte b9 = (byte) 3;
                                        byte b10 = (byte) (b9 - 3);
                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (22878 - Color.alpha(0)), (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 593, 16 - ExpandableListView.getPackedPositionChild(0L), 1570859318, false, $$g(b9, b10, (byte) (b10 - 1)), new Class[]{Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Integer.TYPE, Object.class});
                                    }
                                    int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).intValue();
                                    int i11 = (deinitsession.TuitionPaymentFragmentbindingInflater1 * cCharValue) + deinitsession.asBinder;
                                    cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr2[iIntValue];
                                    cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = cArr2[i11];
                                } else if (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault1 == deinitsession.TuitionPaymentFragmentbindingInflater1) {
                                    deinitsession.g = ((deinitsession.g + cCharValue) - 1) % cCharValue;
                                    deinitsession.asBinder = ((deinitsession.asBinder + cCharValue) - 1) % cCharValue;
                                    int i12 = (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault1 * cCharValue) + deinitsession.g;
                                    int i13 = (deinitsession.TuitionPaymentFragmentbindingInflater1 * cCharValue) + deinitsession.asBinder;
                                    cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr2[i12];
                                    cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = cArr2[i13];
                                } else {
                                    int i14 = (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault1 * cCharValue) + deinitsession.asBinder;
                                    int i15 = (deinitsession.TuitionPaymentFragmentbindingInflater1 * cCharValue) + deinitsession.g;
                                    cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr2[i14];
                                    cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = cArr2[i15];
                                }
                            } catch (Throwable th2) {
                                Throwable cause2 = th2.getCause();
                                if (cause2 == null) {
                                    throw th2;
                                }
                                throw cause2;
                            }
                        }
                        deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 += 2;
                    }
                }
                int i16 = 0;
                while (i16 < i) {
                    int i17 = $11 + 29;
                    $10 = i17 % 128;
                    if (i17 % 2 != 0) {
                        cArr4[i16] = (char) (cArr4[i16] ^ 15190);
                        i16 += 28;
                    } else {
                        cArr4[i16] = (char) (cArr4[i16] ^ 13722);
                        i16++;
                    }
                }
                objArr[0] = new String(cArr4);
            }

            private static String $$g(short s, int i, int i2) {
                int i3 = s + 113;
                int i4 = i * 2;
                int i5 = i2 + 4;
                byte[] bArr = $$c;
                byte[] bArr2 = new byte[1 - i4];
                int i6 = 0 - i4;
                int i7 = -1;
                if (bArr == null) {
                    i3 = (-i3) + i5;
                    i5 = i5;
                    i7 = -1;
                }
                while (true) {
                    int i8 = i7 + 1;
                    int i9 = i5 + 1;
                    bArr2[i8] = (byte) i3;
                    if (i8 == i6) {
                        return new String(bArr2, 0);
                    }
                    i3 = (-bArr[i9]) + i3;
                    i5 = i9;
                    i7 = i8;
                }
            }
        };
        logToString logtostring = new logToString() { // from class: measureHeightOfChildrenCompat
            @Override // defpackage.logToString
            public final void accept(Object obj) {
                function1.invoke(obj);
            }
        };
        final Function1 function2 = new Function1() { // from class: DropDownListViewApi21Impl
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return drawSelectorCompat.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, (Throwable) obj);
            }
        };
        BufferProviderState bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3 = derivecodecB.TuitionPaymentFragmentspecialinlinedviewModeldefault3(logtostring, new logToString() { // from class: setSelector
            @Override // defpackage.logToString
            public final void accept(Object obj) {
                function2.invoke(obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3, "");
        this.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault3(bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3);
    }

    public final void TuitionPaymentFragmentbindingInflater1() {
        MutableLiveData<VirtualCameraAdapter1<List<Office>>> mutableLiveData = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        VirtualCameraAdapter1.Companion companion = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentbindingInflater1());
        deriveCodec derivecodecB = deriveCodec.b(((modifyBitrate) share.b(onResume.TuitionPaymentFragmentspecialinlinedviewModeldefault1(null, null, 3), "transformer is null")).TuitionPaymentFragmentbindingInflater1(this.d.TuitionPaymentFragmentspecialinlinedviewModeldefault3(new BaseRequest())));
        final Function1 function1 = new Function1() { // from class: hasFocus
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return drawSelectorCompat.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, (List) obj);
            }
        };
        logToString logtostring = new logToString() { // from class: lookForSelectablePosition
            @Override // defpackage.logToString
            public final void accept(Object obj) {
                function1.invoke(obj);
            }
        };
        final Function1 function2 = new Function1() { // from class: clickPressedItem
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return drawSelectorCompat.b(this.b, (Throwable) obj);
            }
        };
        BufferProviderState bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3 = derivecodecB.TuitionPaymentFragmentspecialinlinedviewModeldefault3(logtostring, new logToString() { // from class: superSetSelectedChildViewEnabled
            @Override // defpackage.logToString
            public final void accept(Object obj) {
                function2.invoke(obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3, "");
        this.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault3(bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3);
    }

    public final void b(String str) {
        Intrinsics.checkNotNullParameter(str, "");
        MutableLiveData<VirtualCameraAdapter1<List<Office>>> mutableLiveData = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        VirtualCameraAdapter1.Companion companion = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentbindingInflater1());
        deriveCodec derivecodecB = deriveCodec.b(((modifyBitrate) share.b(onResume.TuitionPaymentFragmentspecialinlinedviewModeldefault1(null, null, 3), "transformer is null")).TuitionPaymentFragmentbindingInflater1(this.d.TuitionPaymentFragmentspecialinlinedviewModeldefault1(new BranchOfficeRequest(str))));
        final Function1 function1 = new Function1() { // from class: DropDownListView
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return drawSelectorCompat.TuitionPaymentFragmentspecialinlinedviewModeldefault1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, (List) obj);
            }
        };
        BufferProviderState bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3 = derivecodecB.TuitionPaymentFragmentspecialinlinedviewModeldefault3(new logToString() { // from class: positionSelectorLikeTouchCompat
            @Override // defpackage.logToString
            public final void accept(Object obj) {
                function1.invoke(obj);
            }
        }, new updateSelectorStateCompat(new Function1() { // from class: dispatchDraw
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return drawSelectorCompat.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, (Throwable) obj);
            }
        }));
        Intrinsics.checkNotNullExpressionValue(bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3, "");
        this.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault3(bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3);
    }

    public final void TuitionPaymentFragmentbindingInflater1(String str, String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        MutableLiveData<VirtualCameraAdapter1<Office>> mutableLiveData = this.f898a;
        VirtualCameraAdapter1.Companion companion = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentbindingInflater1());
        deriveCodec derivecodecB = deriveCodec.b(((modifyBitrate) share.b(onResume.TuitionPaymentFragmentspecialinlinedviewModeldefault1(null, null, 3), "transformer is null")).TuitionPaymentFragmentbindingInflater1(this.d.TuitionPaymentFragmentspecialinlinedviewModeldefault3(new NearestBranchOfficeRequest(str, str2))));
        final Function1 function1 = new Function1() { // from class: superIsSelectedChildViewEnabled
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return drawSelectorCompat.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.TuitionPaymentFragmentbindingInflater1, (Office) obj);
            }
        };
        logToString logtostring = new logToString() { // from class: touchModeDrawsInPressedStateCompat
            @Override // defpackage.logToString
            public final void accept(Object obj) {
                function1.invoke(obj);
            }
        };
        final Function1 function2 = new Function1() { // from class: hasWindowFocus
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return drawSelectorCompat.TuitionPaymentFragmentspecialinlinedviewModeldefault1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, (Throwable) obj);
            }
        };
        BufferProviderState bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3 = derivecodecB.TuitionPaymentFragmentspecialinlinedviewModeldefault3(logtostring, new logToString() { // from class: isFocused
            @Override // defpackage.logToString
            public final void accept(Object obj) {
                function2.invoke(obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3, "");
        this.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault3(bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3);
    }

    @Override // androidx.p002lifecycle.ViewModel
    public final void onCleared() {
        super.onCleared();
        if (this.TuitionPaymentFragmentbindingInflater1.isDisposed()) {
            return;
        }
        this.TuitionPaymentFragmentbindingInflater1.dispose();
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault2(drawSelectorCompat drawselectorcompat, Throwable th) {
        Intrinsics.checkNotNull(th);
        setRccState.TuitionPaymentFragmentspecialinlinedviewModeldefault3(th, drawselectorcompat.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault1(drawSelectorCompat drawselectorcompat, List list) {
        MutableLiveData<VirtualCameraAdapter1<List<Office>>> mutableLiveData = drawselectorcompat.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        VirtualCameraAdapter1.Companion companion = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentbindingInflater1(list));
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault1(drawSelectorCompat drawselectorcompat, Throwable th) {
        Intrinsics.checkNotNull(th);
        setRccState.TuitionPaymentFragmentspecialinlinedviewModeldefault3(th, drawselectorcompat.f898a);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit b(drawSelectorCompat drawselectorcompat, List list) {
        MutableLiveData<VirtualCameraAdapter1<List<RegionalOffice>>> mutableLiveData = drawselectorcompat.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        VirtualCameraAdapter1.Companion companion = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentbindingInflater1(list));
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault2(drawSelectorCompat drawselectorcompat, BranchOfficeDefaultSelectedResponse branchOfficeDefaultSelectedResponse) {
        MutableLiveData<VirtualCameraAdapter1<BranchOfficeDefaultSelectedResponse>> mutableLiveData = drawselectorcompat.b;
        VirtualCameraAdapter1.Companion companion = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentbindingInflater1(branchOfficeDefaultSelectedResponse));
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault3(drawSelectorCompat drawselectorcompat, Office office) {
        MutableLiveData<VirtualCameraAdapter1<Office>> mutableLiveData = drawselectorcompat.f898a;
        VirtualCameraAdapter1.Companion companion = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentbindingInflater1(office));
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault3(drawSelectorCompat drawselectorcompat, List list) {
        MutableLiveData<VirtualCameraAdapter1<List<Office>>> mutableLiveData = drawselectorcompat.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        VirtualCameraAdapter1.Companion companion = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentbindingInflater1(list));
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault3(drawSelectorCompat drawselectorcompat, Throwable th) {
        Intrinsics.checkNotNull(th);
        setRccState.TuitionPaymentFragmentspecialinlinedviewModeldefault3(th, drawselectorcompat.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit b(drawSelectorCompat drawselectorcompat, Throwable th) {
        Intrinsics.checkNotNull(th);
        setRccState.TuitionPaymentFragmentspecialinlinedviewModeldefault3(th, drawselectorcompat.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentbindingInflater1(drawSelectorCompat drawselectorcompat, Throwable th) {
        Intrinsics.checkNotNull(th);
        setRccState.TuitionPaymentFragmentspecialinlinedviewModeldefault3(th, drawselectorcompat.asInterface);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentbindingInflater1(drawSelectorCompat drawselectorcompat, List list) {
        MutableLiveData<VirtualCameraAdapter1<List<RegionalOffice>>> mutableLiveData = drawselectorcompat.asInterface;
        VirtualCameraAdapter1.Companion companion = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentbindingInflater1(list));
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit g(drawSelectorCompat drawselectorcompat, Throwable th) {
        Intrinsics.checkNotNull(th);
        setRccState.TuitionPaymentFragmentspecialinlinedviewModeldefault3(th, drawselectorcompat.b);
        return Unit.INSTANCE;
    }
}
