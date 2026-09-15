package com.bpjstku.presentation.syariah;

import android.content.Context;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.Toast;
import androidx.recyclerview.widget.ItemTouchHelper;
import com.bpjstku.R;
import com.bpjstku.databinding.ItemProgramChosenBinding;
import com.bpjstku.presentation.program.jht.olddaysecurity.eclaim.claim.ClaimOldDaySecurityWorkTerminationParticipantActivity;
import com.nbs.nucleosnucleo.presentation.BaseActivity;
import defpackage.cacheInteropConfig;
import defpackage.generateCameraId;
import defpackage.initSession;
import defpackage.lambdastopMediaCodec12androidxcameravideointernalencoderEncoderImpl;
import defpackage.onCaptureSessionEnd;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Random;
import kotlin.Metadata;
import kotlin.NotImplementedError;
import kotlin.text.Typography;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0005\u0010\u0003J\u000f\u0010\u0006\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0006\u0010\u0003J\u000f\u0010\u0007\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0007\u0010\u0003J\u000f\u0010\b\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\b\u0010\u0003J\u000f\u0010\t\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\t\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\n8UX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/bpjstku/presentation/syariah/TermAndConditionSyariahActivity;", "Lcom/nbs/nucleosnucleo/presentation/BaseActivity;", "<init>", "()V", "", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "b", "a", "asInterface", "asBinder", "", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "()I"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class TermAndConditionSyariahActivity extends BaseActivity {
    private static final byte[] $$c = {23, -73, 107, 5};
    private static final int $$d = ItemTouchHelper.Callback.DEFAULT_SWIPE_ANIMATION_DURATION;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$a = {5, -91, 77, 46, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -55, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -54, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, -7, 18, 16, 1, 16, 16, 4, -19, 48, 3, 17, 0, 30, -4, 24, -54, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -56};
    private static final int $$b = 176;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 0;
    private static int asInterface = 1;
    private static char TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 31152;
    private static char TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 55892;
    private static char TuitionPaymentFragmentbindingInflater1 = 61276;
    private static char b = 49451;

    public static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault2(Object[] objArr, int i, int i2, int i3, int i4, int i5, int i6) throws IllegalAccessException {
        int i7 = ~i2;
        int i8 = ~(i7 | i3);
        int i9 = ~i3;
        int i10 = i8 | (~(i9 | i2 | i6));
        int i11 = ~(i7 | i9);
        int i12 = (~i6) | i9;
        int i13 = i11 | (~i12);
        int i14 = ~(i12 | i2);
        int i15 = i2 + i3 + i + ((-1261570137) * i5) + (2040842291 * i4);
        int i16 = i15 * i15;
        int i17 = ((i2 * (-750812765)) - 1471086592) + ((-750812765) * i3) + (1493335646 * i10) + ((-1308296004) * i13) + ((-1493335646) * i14) + (742522880 * i) + ((-1928462336) * i5) + (1629880320 * i4) + (2096168960 * i16);
        int i18 = ((i2 * 1408203179) - 1033136887) + (i3 * 1408203179) + (i10 * (-338)) + (i13 * (-676)) + (i14 * 338) + (i * 1408202841) + (i5 * (-1046847217)) + (i4 * (-121732677)) + (i16 * 1741225984);
        if (i17 + (i18 * i18 * 838795264) != 1) {
            return TuitionPaymentFragmentspecialinlinedviewModeldefault1(objArr);
        }
        TermAndConditionSyariahActivity termAndConditionSyariahActivity = (TermAndConditionSyariahActivity) objArr[0];
        int i19 = 2 % 2;
        int i20 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 47;
        asInterface = i20 % 128;
        int i21 = i20 % 2;
        int i22 = ((Field) cacheInteropConfig.b[0]).getInt(null);
        int iUptimeMillis = (int) SystemClock.uptimeMillis();
        if (i22 != (-1806733070) + (((~((~iUptimeMillis) | 122667424)) | 947919959) * 529) + (((~(iUptimeMillis | 122667424)) | 952654967) * 529)) {
            int i23 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 61;
            asInterface = i23 % 128;
            if (i23 % 2 == 0) {
                int[] iArr = new int[1500329487];
                iArr[1500329486] = 1;
                Toast.makeText((Context) null, iArr[-1], 0).show();
            } else {
                int[] iArr2 = new int[1500329487];
                iArr2[1500329486] = 1;
                int i24 = 683876050 % 2;
                Toast.makeText((Context) null, iArr2[-1], 1).show();
            }
        }
        int i25 = ((Field) generateCameraId.TuitionPaymentFragmentspecialinlinedviewModeldefault1[0]).getInt(null);
        int iNextInt = new Random().nextInt(1805268151);
        if (i25 != 1862978656 + (((~((-72336585) | iNextInt)) | 71925888) * 345) + (((~((-72336585) | (~iNextInt))) | (-1860173804)) * 345) + ((~(iNextInt | (-71925889))) * 345)) {
            throw null;
        }
        super.onStart();
        int i26 = asInterface + 35;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i26 % 128;
        int i27 = i26 % 2;
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0025  */
    /* JADX WARN: Code duplicated, block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002c). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0025
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void c(short r6, byte r7, short r8, java.lang.Object[] r9) {
        /*
            byte[] r0 = com.bpjstku.presentation.syariah.TermAndConditionSyariahActivity.$$a
            int r8 = 53 - r8
            int r7 = r7 * 14
            int r7 = 98 - r7
            int r6 = 144 - r6
            byte[] r1 = new byte[r8]
            r2 = 0
            if (r0 != 0) goto L13
            r7 = r6
            r3 = r8
            r4 = r2
            goto L2c
        L13:
            r3 = r2
        L14:
            int r6 = r6 + 1
            byte r4 = (byte) r7
            r1[r3] = r4
            int r3 = r3 + 1
            if (r3 != r8) goto L25
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L25:
            r4 = r0[r6]
            r5 = r7
            r7 = r6
            r6 = r4
            r4 = r3
            r3 = r5
        L2c:
            int r3 = r3 + r6
            int r6 = r3 + (-11)
            r3 = r4
            r5 = r7
            r7 = r6
            r6 = r5
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.syariah.TermAndConditionSyariahActivity.c(short, byte, short, java.lang.Object[]):void");
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final int TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        int i = 2 % 2;
        throw new NotImplementedError("An operation is not implemented: Not yet implemented");
    }

    private static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault1(Object[] objArr) throws Throwable {
        Object[] objArr2;
        Object[] objArrB$5f1425da;
        int i = 0;
        TermAndConditionSyariahActivity termAndConditionSyariahActivity = (TermAndConditionSyariahActivity) objArr[0];
        int i2 = 2 % 2;
        super.attachBaseContext((Context) objArr[1]);
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char c = (char) (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
            int i3 = (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 1030;
            int edgeSlop = 15 - (ViewConfiguration.getEdgeSlop() >> 16);
            byte[] bArr = $$a;
            Object[] objArr3 = new Object[1];
            c((short) 141, bArr[132], bArr[7], objArr3);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(c, i3, edgeSlop, 1357589585, false, (String) objArr3[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr4 = new Object[1];
        e(new char[]{59520, 38946, 50946, 25587, 24839, 22241, Typography.ellipsis, 53908, 24181, 20501, 7311, 64976, 744, 48208, 12067, 5123, 10817, 4699, 61459, 2585, 29778, 2263, 26452, 411}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 11, objArr4);
        Class<?> cls = Class.forName((String) objArr4[0]);
        Object[] objArr5 = new Object[1];
        e(new char[]{21686, 52316, 9102, 26442, 34059, 17677, 33348, 7858, 46277, 37215, 12815, 21239, 24487, 24789, 17599, 28231, 63281, 24381}, 15 - KeyEvent.keyCodeFromString(""), objArr5);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr5[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char scrollBarSize = (char) (ViewConfiguration.getScrollBarSize() >> 8);
            int mode = View.MeasureSpec.getMode(0) + 1031;
            int iIndexOf = 14 - TextUtils.indexOf((CharSequence) "", '0', 0);
            byte[] bArr2 = $$a;
            Object[] objArr6 = new Object[1];
            c((short) 89, bArr2[132], bArr2[7], objArr6);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(scrollBarSize, mode, iIndexOf, 1344079056, false, (String) objArr6[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 107;
            asInterface = i4 % 128;
            int i5 = i4 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char trimmedLength = (char) TextUtils.getTrimmedLength("");
                int packedPositionGroup = ExpandableListView.getPackedPositionGroup(0L) + 1031;
                int gidForName = Process.getGidForName("") + 16;
                byte b2 = $$a[7];
                Object[] objArr7 = new Object[1];
                c((short) 37, b2, (byte) (b2 | 52), objArr7);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(trimmedLength, packedPositionGroup, gidForName, 632103528, false, (String) objArr7[0], null);
            }
            Object[] objArr8 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            objArr2 = new Object[]{strArr, new int[]{i}, new int[1], new int[]{i}};
            int i6 = ((int[]) objArr8[3])[0];
            int i7 = ((int[]) objArr8[1])[0];
            String[] strArr = (String[]) objArr8[0];
            int iNextInt = new Random().nextInt(524470693);
            int i8 = ((((~((-134504450) | iNextInt)) * 521) - 271113184) + (((~((~iNextInt) | (-134504450))) | (-966128832)) * 521)) - 1687095219;
            int i9 = (i8 << 13) ^ i8;
            int i10 = i9 ^ (i9 >>> 17);
            ((int[]) objArr2[2])[0] = i10 ^ (i10 << 5);
            int i11 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 15;
            asInterface = i11 % 128;
            int i12 = i11 % 2;
        } else {
            Object[] objArr9 = new Object[1];
            e(new char[]{35353, 6946, 32479, 45811, 8417, 16330, 43887, 9233, 9757, 30368, 23347, 44355, 4513, 40779, 32318, 24384, 973, 10049}, (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 15, objArr9);
            Class<?> cls2 = Class.forName((String) objArr9[0]);
            Object[] objArr10 = new Object[1];
            e(new char[]{42226, 25997, 8235, 44187, 26970, 62251, 48966, 15830, 4564, 25785, 20282, 59260, 44912, 55769, 2575, 34479, 37529, 3399}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.vida_tutorial_screen_wearing_mask_text).substring(0, 6).length() + 10, objArr10);
            int iIntValue = ((Integer) cls2.getMethod((String) objArr10[0], Object.class).invoke(null, termAndConditionSyariahActivity)).intValue();
            try {
                Object[] objArr11 = {-1084765211};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-725886332);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (46038 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1))), 1134 - TextUtils.indexOf("", "", 0, 0), 17 - ImageFormat.getBitsPerPixel(0), 807763283, false, null, new Class[]{Integer.TYPE});
                }
                Object[] objArr12 = {Integer.valueOf(iIntValue), 0, -1687095219, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).newInstance(objArr11), false};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1443305588);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                    char keyRepeatDelay = (char) (ViewConfiguration.getKeyRepeatDelay() >> 16);
                    int windowTouchSlop = (ViewConfiguration.getWindowTouchSlop() >> 8) + 1031;
                    int pressedStateDuration = 15 - (ViewConfiguration.getPressedStateDuration() >> 16);
                    byte[] bArr3 = $$a;
                    Object[] objArr13 = new Object[1];
                    c((short) 141, bArr3[132], bArr3[7], objArr13);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(keyRepeatDelay, windowTouchSlop, pressedStateDuration, 1298546779, false, (String) objArr13[0], new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (45993 - View.getDefaultSize(0, 0)), Color.rgb(0, 0, 0) + 16778333, 16 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))), Boolean.TYPE});
                }
                objArr2 = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr12);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                    char c2 = (char) (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
                    int iNormalizeMetaState = KeyEvent.normalizeMetaState(0) + 1031;
                    int iNormalizeMetaState2 = 15 - KeyEvent.normalizeMetaState(0);
                    byte b3 = $$a[7];
                    Object[] objArr14 = new Object[1];
                    c((short) 37, b3, (byte) (b3 | 52), objArr14);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(c2, iNormalizeMetaState, iNormalizeMetaState2, 632103528, false, (String) objArr14[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, objArr2);
                try {
                    Object[] objArr15 = new Object[1];
                    e(new char[]{59520, 38946, 50946, 25587, 24839, 22241, Typography.ellipsis, 53908, 24181, 20501, 7311, 64976, 744, 48208, 12067, 5123, 10817, 4699, 61459, 2585, 29778, 2263, 26452, 411}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.uikit_shopeepay_instruction_step2).substring(15, 16).length() + 21, objArr15);
                    Class<?> cls3 = Class.forName((String) objArr15[0]);
                    Object[] objArr16 = new Object[1];
                    e(new char[]{21686, 52316, 9102, 26442, 34059, 17677, 33348, 7858, 46277, 37215, 12815, 21239, 24487, 24789, 17599, 28231, 63281, 24381}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.credit_card).substring(10, 12).length() + 13, objArr16);
                    long jLongValue2 = ((Long) cls3.getDeclaredMethod((String) objArr16[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue2);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
                        char modifierMetaStateMask = (char) (((byte) KeyEvent.getModifierMetaStateMask()) + 1);
                        int threadPriority = 1031 - ((Process.getThreadPriority(0) + 20) >> 6);
                        int iRed = Color.red(0) + 15;
                        byte[] bArr4 = $$a;
                        Object[] objArr17 = new Object[1];
                        c((short) 89, bArr4[132], bArr4[7], objArr17);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(modifierMetaStateMask, threadPriority, iRed, 1344079056, false, (String) objArr17[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault10 == null) {
                        char defaultSize = (char) View.getDefaultSize(0, 0);
                        int i13 = (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 1030;
                        int keyRepeatTimeout = 15 - (ViewConfiguration.getKeyRepeatTimeout() >> 16);
                        byte[] bArr5 = $$a;
                        Object[] objArr18 = new Object[1];
                        c((short) 141, bArr5[132], bArr5[7], objArr18);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.b(defaultSize, i13, keyRepeatTimeout, 1357589585, false, (String) objArr18[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault10).set(null, lValueOf2);
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
        int i14 = ((int[]) objArr2[1])[0];
        int i15 = ((int[]) objArr2[3])[0];
        if (i15 != i14) {
            ArrayList arrayList = new ArrayList();
            String[] strArr2 = (String[]) objArr2[0];
            if (strArr2 != null) {
                int i16 = asInterface + 43;
                TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i16 % 128;
                int i17 = i16 % 2;
                while (i < strArr2.length) {
                    arrayList.add(strArr2[i]);
                    i++;
                }
            }
            throw new RuntimeException(String.valueOf(i15));
        }
        Object[] objArr19 = {strArr, new int[]{i}, new int[1], new int[]{i}};
        int i18 = ((int[]) objArr2[2])[0];
        int i19 = ((int[]) objArr2[3])[0];
        int i20 = ((int[]) objArr2[1])[0];
        String[] strArr3 = (String[]) objArr2[0];
        int i21 = (int) Runtime.getRuntime().totalMemory();
        int i22 = ~(701603468 | i21);
        int i23 = i18 + (-1077281380) + (((-1003732911) | i22) * (-814)) + ((i22 | (~((~i21) | 457323298)) | 155193856) * 407) + (((~(i21 | (-457323299))) | (~((-701603469) | i21)) | 155193856) * 407);
        int i24 = (i23 << 13) ^ i23;
        int i25 = i24 ^ (i24 >>> 17);
        ((int[]) objArr19[2])[0] = i25 ^ (i25 << 5);
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault11 == null) {
            char cRed = (char) (29944 - Color.red(0));
            int trimmedLength2 = 1755 - TextUtils.getTrimmedLength("");
            int iMyPid = 23 - (Process.myPid() >> 22);
            byte b4 = $$a[132];
            Object[] objArr20 = new Object[1];
            c((short) 37, b4, (byte) (b4 | 14), objArr20);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.b(cRed, trimmedLength2, iMyPid, 986134021, false, (String) objArr20[0], null);
        }
        if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault11).getLong(null) != -1) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault12 == null) {
                char cLastIndexOf = (char) (29943 - TextUtils.lastIndexOf("", '0'));
                int iLastIndexOf = 1754 - TextUtils.lastIndexOf("", '0', 0);
                int iMyTid = (Process.myTid() >> 22) + 23;
                byte[] bArr6 = $$a;
                Object[] objArr21 = new Object[1];
                c((short) 89, bArr6[132], bArr6[7], objArr21);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.b(cLastIndexOf, iLastIndexOf, iMyTid, 1599039318, false, (String) objArr21[0], null);
            }
            Object[] objArr22 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault12).get(null);
            int i26 = ((int[]) objArr22[0])[0];
            objArrB$5f1425da = new Object[]{new int[]{i26}, new int[]{((int[]) objArr22[1])[0]}, (Object[]) objArr22[2], new int[1], (String[]) objArr22[4]};
            int i27 = ~((int) Process.getElapsedCpuTime());
            int i28 = ~(415381266 | i27);
            int i29 = (((344733481 + ((i28 | (-202778841)) * 764)) + (((~(i27 | (-202778841))) | 134357008) * (-1528))) + (((-349446091) | i28) * 764)) - 1705667576;
            int i30 = (i29 << 13) ^ i29;
            int i31 = i30 ^ (i30 >>> 17);
            ((int[]) objArrB$5f1425da[3])[0] = i31 ^ (i31 << 5);
            int i32 = asInterface + 107;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i32 % 128;
            int i33 = i32 % 2;
        } else {
            Object[] objArr23 = new Object[1];
            e(new char[]{35353, 6946, 32479, 45811, 8417, 16330, 43887, 9233, 9757, 30368, 23347, 44355, 4513, 40779, 32318, 24384, 973, 10049}, ImageFormat.getBitsPerPixel(0) + 17, objArr23);
            Class<?> cls4 = Class.forName((String) objArr23[0]);
            Object[] objArr24 = new Object[1];
            e(new char[]{42226, 25997, 8235, 44187, 26970, 62251, 48966, 15830, 4564, 25785, 20282, 59260, 44912, 55769, 2575, 34479, 37529, 3399}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 20, objArr24);
            int iIntValue2 = ((Integer) cls4.getMethod((String) objArr24[0], Object.class).invoke(null, termAndConditionSyariahActivity)).intValue();
            Object[] objArr25 = {-1084765211};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2063193834);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault13 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.b((char) (42049 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1))), (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 1726, 29 - View.MeasureSpec.getSize(0), -1637387971, false, null, new Class[]{Integer.TYPE});
            }
            objArrB$5f1425da = ItemProgramChosenBinding.b$5f1425da(iIntValue2, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault13).newInstance(objArr25), -1705667576);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault14 == null) {
                char c3 = (char) ((CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 29944);
                int iNormalizeMetaState3 = KeyEvent.normalizeMetaState(0) + 1755;
                int edgeSlop2 = (ViewConfiguration.getEdgeSlop() >> 16) + 23;
                byte[] bArr7 = $$a;
                Object[] objArr26 = new Object[1];
                c((short) 89, bArr7[132], bArr7[7], objArr26);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.b(c3, iNormalizeMetaState3, edgeSlop2, 1599039318, false, (String) objArr26[0], null);
            }
            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault14).set(null, objArrB$5f1425da);
            try {
                Object[] objArr27 = new Object[1];
                e(new char[]{59520, 38946, 50946, 25587, 24839, 22241, Typography.ellipsis, 53908, 24181, 20501, 7311, 64976, 744, 48208, 12067, 5123, 10817, 4699, 61459, 2585, 29778, 2263, 26452, 411}, 22 - (KeyEvent.getMaxKeyCode() >> 16), objArr27);
                Class<?> cls5 = Class.forName((String) objArr27[0]);
                Object[] objArr28 = new Object[1];
                e(new char[]{21686, 52316, 9102, 26442, 34059, 17677, 33348, 7858, 46277, 37215, 12815, 21239, 24487, 24789, 17599, 28231, 63281, 24381}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 4, objArr28);
                long jLongValue3 = ((Long) cls5.getDeclaredMethod((String) objArr28[0], new Class[0]).invoke(null, new Object[0])).longValue();
                Long lValueOf3 = Long.valueOf(jLongValue3);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1145728641);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault15 == null) {
                    char gidForName2 = (char) (29943 - Process.getGidForName(""));
                    int i34 = (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 1754;
                    int offsetBefore = 23 - TextUtils.getOffsetBefore("", 0);
                    byte[] bArr8 = $$a;
                    byte b5 = bArr8[7];
                    Object[] objArr29 = new Object[1];
                    c(b5, bArr8[132], b5, objArr29);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.b(gidForName2, i34, offsetBefore, 1596667560, false, (String) objArr29[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault15).set(null, lValueOf3);
                Long lValueOf4 = Long.valueOf(jLongValue3 >> 12);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault16 == null) {
                    char doubleTapTimeout = (char) (29944 - (ViewConfiguration.getDoubleTapTimeout() >> 16));
                    int scrollBarSize2 = 1755 - (ViewConfiguration.getScrollBarSize() >> 8);
                    int maxKeyCode = (KeyEvent.getMaxKeyCode() >> 16) + 23;
                    byte b6 = $$a[132];
                    Object[] objArr30 = new Object[1];
                    c((short) 37, b6, (byte) (b6 | 14), objArr30);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.b(doubleTapTimeout, scrollBarSize2, maxKeyCode, 986134021, false, (String) objArr30[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault16).set(null, lValueOf4);
            } catch (Exception unused2) {
                throw new RuntimeException();
            }
        }
        int i35 = ((int[]) objArrB$5f1425da[1])[0];
        int i36 = ((int[]) objArrB$5f1425da[0])[0];
        if (i36 != i35) {
            ArrayList arrayList2 = new ArrayList();
            String[] strArr4 = (String[]) objArrB$5f1425da[4];
            if (strArr4 != null) {
                int i37 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 97;
                asInterface = i37 % 128;
                int i38 = i37 % 2;
                while (i < strArr4.length) {
                    arrayList2.add(strArr4[i]);
                    i++;
                }
            }
            throw new RuntimeException(String.valueOf(i36));
        }
        int i39 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 93;
        asInterface = i39 % 128;
        int i40 = i39 % 2;
        int i41 = ((int[]) objArrB$5f1425da[3])[0];
        int i42 = ((int[]) objArrB$5f1425da[0])[0];
        Object[] objArr31 = {new int[]{i42}, new int[]{((int[]) objArrB$5f1425da[1])[0]}, (Object[]) objArrB$5f1425da[2], new int[1], (String[]) objArrB$5f1425da[4]};
        int iMyPid2 = Process.myPid();
        int i43 = (~((-1070629785) | iMyPid2)) | 214991488;
        int i44 = i41 + 2135982025 + (i43 * 992) + ((i43 | (~((~iMyPid2) | (-2389063)))) * (-496)) + ((iMyPid2 | (-858027359)) * 496);
        int i45 = (i44 << 13) ^ i44;
        int i46 = i45 ^ (i45 >>> 17);
        ((int[]) objArr31[3])[0] = i46 ^ (i46 << 5);
        return null;
    }

    private static void e(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        onCaptureSessionEnd oncapturesessionend = new onCaptureSessionEnd();
        char[] cArr2 = new char[cArr.length - 2];
        oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 2;
        char[] cArr3 = new char[2];
        while (true) {
            char c = 0;
            if (oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 >= cArr.length) {
                objArr[0] = new String(cArr2, 0, i);
                int i3 = $10 + 117;
                $11 = i3 % 128;
                int i4 = i3 % 2;
                return;
            }
            int i5 = $11 + 93;
            $10 = i5 % 128;
            int i6 = i5 % 2;
            cArr3[0] = cArr[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3];
            cArr3[1] = cArr[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1];
            int i7 = 58224;
            int i8 = 0;
            while (i8 < 16) {
                int i9 = $10 + 49;
                $11 = i9 % 128;
                int i10 = i9 % 2;
                char c2 = cArr3[1];
                char c3 = cArr3[c];
                int i11 = (c3 + i7) ^ ((c3 << 4) + ((char) (((long) TuitionPaymentFragmentbindingInflater1) ^ 8611973335120459638L)));
                int i12 = c3 >>> 5;
                try {
                    Object[] objArr2 = new Object[4];
                    objArr2[3] = Integer.valueOf(b);
                    objArr2[2] = Integer.valueOf(i12);
                    objArr2[1] = Integer.valueOf(i11);
                    objArr2[c] = Integer.valueOf(c2);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1824600641);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        char gidForName = (char) (47772 - Process.getGidForName(""));
                        int jumpTapTimeout = 468 - (ViewConfiguration.getJumpTapTimeout() >> 16);
                        int mirror = AndroidCharacter.getMirror('0') - '#';
                        Class[] clsArr = new Class[4];
                        clsArr[c] = Integer.TYPE;
                        clsArr[1] = Integer.TYPE;
                        clsArr[2] = Integer.TYPE;
                        clsArr[3] = Integer.TYPE;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(gidForName, jumpTapTimeout, mirror, -2007001706, false, "o", clsArr);
                    }
                    char cCharValue = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                    cArr3[1] = cCharValue;
                    int i13 = i8;
                    Object[] objArr3 = {Integer.valueOf(cArr3[c]), Integer.valueOf((cCharValue + i7) ^ ((cCharValue << 4) + ((char) (((long) TuitionPaymentFragmentspecialinlinedviewModeldefault3) ^ 8611973335120459638L)))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault1)};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1824600641);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (47773 - (ViewConfiguration.getKeyRepeatDelay() >> 16)), 469 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), 13 - (ViewConfiguration.getTouchSlop() >> 8), -2007001706, false, "o", new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    cArr3[0] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).charValue();
                    i7 -= 40503;
                    i8 = i13 + 1;
                    c = 0;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr2[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 - 2] = (char) (cArr[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 - 2] ^ cArr3[0]);
            cArr2[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 - 1] = (char) (cArr3[1] ^ cArr[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 - 1]);
            Object[] objArr4 = {oncapturesessionend, oncapturesessionend};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1431906448);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                byte b2 = (byte) 0;
                byte b3 = b2;
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) ExpandableListView.getPackedPositionType(0L), 2323 - View.resolveSize(0, 0), 44 - ExpandableListView.getPackedPositionType(0L), -1312321721, false, $$e(b2, b3, b3), new Class[]{Object.class, Object.class});
            }
            ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
            int i14 = $11 + 45;
            $10 = i14 % 128;
            int i15 = i14 % 2;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x00c5, code lost:
    
        if (r1 != (((-40233120) + ((r5 | r6) * (-470))) + (((~(r4 | 2121265087)) | r6) * 470))) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x00c7, code lost:
    
        super.onResume();
        r1 = com.bpjstku.presentation.syariah.TermAndConditionSyariahActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 71;
        com.bpjstku.presentation.syariah.TermAndConditionSyariahActivity.asInterface = r1 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x00d3, code lost:
    
        if ((r1 % 2) != 0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x00d5, code lost:
    
        r0 = 3 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x00d7, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x00d8, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x00d9, code lost:
    
        r1 = 1885648052 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x00e2, code lost:
    
        throw new java.lang.ArithmeticException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0046, code lost:
    
        if (r1 == (((475278640 + (((~(1783067544 | r5)) | 953080001) * (-90))) + (((~(1783067544 | r4)) | 1107370776) * (-45))) + ((((~(r4 | (-953080002))) | 1783067544) | (~(r5 | 953080001))) * 45))) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0073, code lost:
    
        if (r1 == (((((~(1083028707 | r5)) | (~(r4 | 253041164))) * 959) + 560766455) + (((~(r4 | 1083028707)) | (~(r5 | 253041164))) * 959))) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0075, code lost:
    
        r1 = ((java.lang.reflect.Field) defpackage.checkUnsupportedFeatureCombinationAndThrow.b[0]).getInt(null);
        r5 = (java.lang.Object[]) null;
        r4 = ((android.content.Context) java.lang.Class.forName("android.app.ActivityThread").getMethod("currentApplication", new java.lang.Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 471384581;
        r5 = (~(1953211705 | r4)) | 168053382;
        r6 = ~((~r4) | (-1883964714));
     */
    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onResume() throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 227
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.syariah.TermAndConditionSyariahActivity.onResume():void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x00b0, code lost:
    
        if (r1 != ((1156203498 + ((((~(r4 | (-2143739736))) | 1715919683) | (~((-8353) | r2))) * 717)) + (((~(r2 | (-2143739736))) | ((~(r4 | (-8353))) | 1715919683)) * 717))) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x00b2, code lost:
    
        super.onCreate(r11);
        r11 = com.bpjstku.presentation.syariah.TermAndConditionSyariahActivity.asInterface + 39;
        com.bpjstku.presentation.syariah.TermAndConditionSyariahActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = r11 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x00be, code lost:
    
        if ((r11 % 2) == 0) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x00c0, code lost:
    
        r11 = 47 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x00c3, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x00cb, code lost:
    
        throw new java.lang.RuntimeException("-1965076527");
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x00cc, code lost:
    
        r11 = 119013198 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x00d5, code lost:
    
        throw new java.lang.ArithmeticException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0041, code lost:
    
        if (r1 == ((((-2029520776) + (((~(r5 | (-1107338498))) | 277350954) * 220)) + (((~(r5 | (-1798370642))) | 968383098) * (-440))) + ((r4 | (-1107338498)) * 220))) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x007f, code lost:
    
        if (r1 == (((931369672 + (((-1509800960) | r5) * (-814))) + ((r5 | ((~((~r4) | 1241328495)) | 142868488)) * 407)) + (((~(r4 | (-1241328496))) | ((~((-411340953) | r4)) | 142868488)) * 407))) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0081, code lost:
    
        r1 = ((java.lang.reflect.Field) defpackage.generateCameraId.TuitionPaymentFragmentspecialinlinedviewModeldefault1[0]).getInt(null);
        r2 = (int) android.os.Process.getStartElapsedRealtime();
        r4 = ~r2;
     */
    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onCreate(android.os.Bundle r11) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 214
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.syariah.TermAndConditionSyariahActivity.onCreate(android.os.Bundle):void");
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 103;
        asInterface = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void b() {
        int i = 2 % 2;
        int i2 = asInterface + 63;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        if (i2 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void a() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 1;
        asInterface = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void asInterface() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 119;
        asInterface = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void asBinder() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 45;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onStart() throws IllegalAccessException {
        TuitionPaymentFragmentspecialinlinedviewModeldefault2(new Object[]{this}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() - 1326609393, -1494051849, 1494051850, ClaimOldDaySecurityWorkTerminationParticipantActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), lambdastopMediaCodec12androidxcameravideointernalencoderEncoderImpl.TuitionPaymentFragmentspecialinlinedviewModeldefault2.b(), (-1132697512) + ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.mandiri_clickpay).substring(0, 16).codePointAt(5));
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onPause() throws Throwable {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 11;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        super.onPause();
        int i4 = asInterface + 43;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public final void attachBaseContext(Context context) throws IllegalAccessException {
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = ClaimOldDaySecurityWorkTerminationParticipantActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        TuitionPaymentFragmentspecialinlinedviewModeldefault2(new Object[]{this, context}, 1747722923 + ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion, -575826746, 575826746, lambdastopMediaCodec12androidxcameravideointernalencoderEncoderImpl.TuitionPaymentFragmentspecialinlinedviewModeldefault2.b(), ClaimOldDaySecurityWorkTerminationParticipantActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), iTuitionPaymentFragmentspecialinlinedviewModeldefault3);
    }

    private static String $$e(byte b2, short s, short s2) {
        int i = 4 - (s2 * 2);
        int i2 = 108 - (b2 * 2);
        byte[] bArr = $$c;
        int i3 = s * 4;
        byte[] bArr2 = new byte[1 - i3];
        int i4 = 0 - i3;
        int i5 = -1;
        if (bArr == null) {
            i++;
            i2 = (-i2) + i;
            i5 = -1;
        }
        while (true) {
            int i6 = i;
            int i7 = i2;
            int i8 = i5 + 1;
            bArr2[i8] = (byte) i7;
            if (i8 == i4) {
                return new String(bArr2, 0);
            }
            i = i6 + 1;
            i2 = (-bArr[i6]) + i7;
            i5 = i8;
        }
    }
}
