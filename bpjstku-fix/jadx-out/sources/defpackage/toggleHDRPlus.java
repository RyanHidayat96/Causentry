package defpackage;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.compose.runtime.ComposerKt;
import com.bpjstku.domain.vocation.model.Bank;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.ByteCompanionObject;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B=\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00060\u0005\u0012\u0016\b\u0002\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\t\u0018\u00010\b¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0004\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010"}, d2 = {"LtoggleHDRPlus;", "LMediaSessionCompatMediaSessionImplApi28;", "Lcom/bpjstku/domain/vocation/model/Bank;", "Landroid/content/Context;", "p0", "", "LlambdasetOnImageAvailableListener0androidxcameracoreAndroidImageReaderProxy;", "p1", "Lkotlin/Function1;", "", "p2", "<init>", "(Landroid/content/Context;Ljava/util/List;Lkotlin/jvm/functions/Function1;)V", "", "", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "(Ljava/lang/String;Lcom/bpjstku/domain/vocation/model/Bank;)Z"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class toggleHDRPlus extends MediaSessionCompatMediaSessionImplApi28<Bank> {
    private static final byte[] $$c = {107, 48, 57, 107};
    private static final int $$f = 190;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$d = {109, 48, -62, 38, 18, 4, -57, 69, 2, 1, 22, 4, -11, 19, 11, -63, 75, -9, 13, -55, 77, -6, 8, 4, 17, -64, 78, -7, 2, 24, 2, -63, 59, 21, -7, 5, 11, 17, -11, 4, 23, -8, -48, 58, 5, 19, 3, 11, 5, 0, 11, 12, 5, -63, 26, 37, 19, 3, -21, 37, 0, 11, 12, 5, -44, 40, 23, -5, 19, -7, 17, 11, -79, 20};
    private static final int $$e = 175;
    private static final byte[] $$a = {86, -48, ByteCompanionObject.MIN_VALUE, 88, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, 7, -18, -16, -1, -16, -16, -4, 19, -48, -3, -17, 0, -30, 4, -24, 54, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 54, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 55};
    private static final int $$b = 116;
    private static int b = 0;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 1;
    private static char[] TuitionPaymentFragmentspecialinlinedviewModeldefault3 = {60047, 60046, 60056, 60072, 60073, 60049, 60041, 60063, 60034, 60051, 60088, 60048, 60058, 60040, 60043, 60090, 60117, 60054, 60079, 60053, 60050, 60055, 60052, 60045, 60062};
    private static char TuitionPaymentFragmentbindingInflater1 = 57188;

    private static void c(short s, byte b2, byte b3, Object[] objArr) {
        byte[] bArr = $$a;
        int i = b2 * 15;
        int i2 = 84 - (b3 * 3);
        int i3 = s + 4;
        byte[] bArr2 = new byte[53 - i];
        int i4 = 52 - i;
        int i5 = -1;
        if (bArr == null) {
            int i6 = i2 + (-i3);
            i3++;
            i2 = i6 - 11;
            i5 = -1;
        }
        while (true) {
            int i7 = i5 + 1;
            bArr2[i7] = (byte) i2;
            if (i7 == i4) {
                objArr[0] = new String(bArr2, 0);
                return;
            }
            int i8 = i2;
            int i9 = i3;
            int i10 = i8 + (-bArr[i3]);
            i3 = i9 + 1;
            i2 = i10 - 11;
            i5 = i7;
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0028  */
    /* JADX WARN: Code duplicated, block: B:8:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:11:0x002d). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0028
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void f(int r7, short r8, short r9, java.lang.Object[] r10) {
        /*
            byte[] r0 = defpackage.toggleHDRPlus.$$d
            int r7 = r7 * 70
            int r7 = r7 + 4
            int r9 = r9 + 98
            int r8 = r8 * 70
            int r8 = 71 - r8
            byte[] r1 = new byte[r8]
            r2 = 0
            if (r0 != 0) goto L15
            r9 = r7
            r3 = r8
            r4 = r2
            goto L2d
        L15:
            r3 = r2
        L16:
            r6 = r9
            r9 = r7
            r7 = r6
            int r4 = r3 + 1
            byte r5 = (byte) r7
            r1[r3] = r5
            if (r4 != r8) goto L28
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            r10[r2] = r7
            return
        L28:
            r3 = r0[r9]
            r6 = r9
            r9 = r7
            r7 = r6
        L2d:
            int r7 = r7 + 1
            int r9 = r9 + r3
            int r9 = r9 + (-6)
            r3 = r4
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.toggleHDRPlus.f(int, short, short, java.lang.Object[]):void");
    }

    @Override // defpackage.MediaSessionCompatMediaSessionImplApi28
    public final /* synthetic */ String TuitionPaymentFragmentbindingInflater1(Bank bank) {
        int i = 2 % 2;
        int i2 = b + 69;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        int i3 = i2 % 2;
        Bank bank2 = bank;
        Intrinsics.checkNotNullParameter(bank2, "");
        String str = bank2.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        int i4 = b + 101;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    @Override // defpackage.MediaSessionCompatMediaSessionImplApi28
    public final /* bridge */ /* synthetic */ boolean TuitionPaymentFragmentspecialinlinedviewModeldefault3(String str, Bank bank) throws Throwable {
        int i = 2 % 2;
        int i2 = b + 15;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        int i3 = i2 % 2;
        boolean zTuitionPaymentFragmentspecialinlinedviewModeldefault32 = TuitionPaymentFragmentspecialinlinedviewModeldefault32(str, bank);
        int i4 = b + 51;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i4 % 128;
        int i5 = i4 % 2;
        return zTuitionPaymentFragmentspecialinlinedviewModeldefault32;
    }

    public /* synthetic */ toggleHDRPlus(Context context, List list, Function1 function1, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 2) != 0) {
            list = new ArrayList();
            int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 103;
            b = i2 % 128;
            int i3 = i2 % 2;
            int i4 = 2 % 2;
        }
        if ((i & 4) != 0) {
            int i5 = b + 23;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 2 % 2;
            }
            function1 = null;
        }
        this(context, list, function1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    private toggleHDRPlus(Context context, List<lambdasetOnImageAvailableListener0androidxcameracoreAndroidImageReaderProxy<Bank>> list, Function1<? super Bank, Unit> function1) {
        super(context, list, function1);
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(list, "");
    }

    /* JADX WARN: Code duplicated, block: B:22:0x021d  */
    /* JADX WARN: Type inference failed for: r3v47, types: [boolean, int] */
    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: avoid collision after fix types in other method */
    private static boolean TuitionPaymentFragmentspecialinlinedviewModeldefault32(String p0, Bank p1) throws Throwable {
        int length;
        Object[] objArr;
        int i = 2 % 2;
        int i2 = b + 69;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(p0, "");
        Intrinsics.checkNotNullParameter(p1, "");
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2030658839);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char cIndexOf = (char) ((-1) - TextUtils.indexOf((CharSequence) "", '0', 0));
            int iIndexOf = TextUtils.indexOf("", "", 0, 0) + 876;
            int iGreen = 10 - Color.green(0);
            byte[] bArr = $$a;
            byte b2 = bArr[7];
            Object[] objArr2 = new Object[1];
            c(b2, bArr[5], b2, objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cIndexOf, iIndexOf, iGreen, -1650998592, false, (String) objArr2[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr3 = new Object[1];
        e(new char[]{14, 17, '\b', 7, 23, 21, 6, 17, 23, '\f', 18, 1, '\r', 18, 4, 20, 15, '\f', 22, 23, 1, '\f'}, (byte) ((KeyEvent.getMaxKeyCode() >> 16) + 89), 22 - (KeyEvent.getMaxKeyCode() >> 16), objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        e(new char[]{20, 22, '\r', '\n', 14, 23, '\t', 2, 22, 14, 20, 1, 22, 15, 13919}, (byte) (96 - (ViewConfiguration.getScrollDefaultDelay() >> 16)), (ViewConfiguration.getScrollBarSize() >> 8) + 15, objArr4);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1821222244);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char mirror = (char) (AndroidCharacter.getMirror('0') - '0');
            int mirror2 = 924 - AndroidCharacter.getMirror('0');
            int fadingEdgeLength = 10 - (ViewConfiguration.getFadingEdgeLength() >> 16);
            byte b3 = $$a[7];
            Object[] objArr5 = new Object[1];
            c((byte) 37, b3, b3, objArr5);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(mirror, mirror2, fadingEdgeLength, 2012020043, false, (String) objArr5[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1822145765);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char defaultSize = (char) View.getDefaultSize(0, 0);
                int tapTimeout = (ViewConfiguration.getTapTimeout() >> 16) + 876;
                int maximumFlingVelocity = (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 10;
                byte[] bArr2 = $$a;
                byte b4 = (byte) (bArr2[3] + 1);
                byte b5 = bArr2[7];
                Object[] objArr6 = new Object[1];
                c(b4, b5, b5, objArr6);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(defaultSize, tapTimeout, maximumFlingVelocity, 2012931276, false, (String) objArr6[0], null);
            }
            Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            objArr = new Object[]{new int[]{((int[]) objArr7[0])[0]}, new int[1], new int[]{((int[]) objArr7[2])[0]}, (String[]) objArr7[3]};
            int i4 = ~((~((int) Runtime.getRuntime().freeMemory())) | 572242639);
            int i5 = ((((34644170 | i4) * (-374)) + 913963426) + ((i4 | 537598469) * 374)) - 1292372857;
            int i6 = (i5 << 13) ^ i5;
            int i7 = i6 ^ (i6 >>> 17);
            ((int[]) objArr[1])[0] = i7 ^ (i7 << 5);
        } else {
            Object[] objArr8 = new Object[1];
            e(new char[]{14, 17, '\b', 7, 23, 21, 6, 17, '\r', '\n', 11, 19, 17, 0, 5, 0, 24, 21, 3, 5, 19, '\b', '\t', 21, 17, '\f'}, (byte) (((Process.getThreadPriority(0) + 20) >> 6) + 29), 26 - (ViewConfiguration.getTouchSlop() >> 8), objArr8);
            Class<?> cls2 = Class.forName((String) objArr8[0]);
            Object[] objArr9 = new Object[1];
            e(new char[]{3, 2, 13825, 13825, 4, 24, 5, 20, 13827, 13827, 22, 21, 7, 17, 5, 0, 24, 17}, (byte) (25 - KeyEvent.normalizeMetaState(0)), (ViewConfiguration.getPressedStateDuration() >> 16) + 18, objArr9);
            Context applicationContext = (Context) cls2.getMethod((String) objArr9[0], new Class[0]).invoke(null, null);
            if (applicationContext != null) {
                if (!(applicationContext instanceof ContextWrapper)) {
                    applicationContext = applicationContext.getApplicationContext();
                } else {
                    int i8 = b + 11;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i8 % 128;
                    int i9 = i8 % 2;
                    if (((ContextWrapper) applicationContext).getBaseContext() != null) {
                        applicationContext = applicationContext.getApplicationContext();
                    } else {
                        applicationContext = null;
                    }
                }
            }
            if (p0 != null) {
                int i10 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 97;
                b = i10 % 128;
                if (i10 % 2 != 0) {
                    p0.length();
                    throw null;
                }
                length = p0.length();
            } else {
                length = 0;
            }
            int i11 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 31;
            b = i11 % 128;
            int i12 = i11 % 2;
            try {
                Object[] objArr10 = {applicationContext, Integer.valueOf(length), 0, -1292372857};
                byte[] bArr3 = $$d;
                byte b6 = bArr3[49];
                Object[] objArr11 = new Object[1];
                f(b6, b6, bArr3[9], objArr11);
                Class<?> cls3 = Class.forName((String) objArr11[0]);
                byte b7 = bArr3[9];
                Object[] objArr12 = new Object[1];
                f(b7, b7, bArr3[49], objArr12);
                Object[] objArr13 = (Object[]) cls3.getMethod((String) objArr12[0], Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr10);
                if (applicationContext != null) {
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1822145765);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        char cLastIndexOf = (char) ((-1) - TextUtils.lastIndexOf("", '0', 0, 0));
                        int maximumDrawingCacheSize = 876 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24);
                        int mode = View.MeasureSpec.getMode(0) + 10;
                        byte[] bArr4 = $$a;
                        byte b8 = (byte) (bArr4[3] + 1);
                        byte b9 = bArr4[7];
                        Object[] objArr14 = new Object[1];
                        c(b8, b9, b9, objArr14);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(cLastIndexOf, maximumDrawingCacheSize, mode, 2012931276, false, (String) objArr14[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr13);
                    try {
                        Object[] objArr15 = new Object[1];
                        e(new char[]{14, 17, '\b', 7, 23, 21, 6, 17, 23, '\f', 18, 1, '\r', 18, 4, 20, 15, '\f', 22, 23, 1, '\f'}, (byte) (89 - (ViewConfiguration.getLongPressTimeout() >> 16)), (Process.myTid() >> 22) + 22, objArr15);
                        Class<?> cls4 = Class.forName((String) objArr15[0]);
                        Object[] objArr16 = new Object[1];
                        e(new char[]{20, 22, '\r', '\n', 14, 23, '\t', 2, 22, 14, 20, 1, 22, 15, 13919}, (byte) (96 - TextUtils.getOffsetBefore("", 0)), 15 - Color.argb(0, 0, 0, 0), objArr16);
                        long jLongValue2 = ((Long) cls4.getDeclaredMethod((String) objArr16[0], new Class[0]).invoke(null, new Object[0])).longValue();
                        Long lValueOf = Long.valueOf(jLongValue2);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1821222244);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                            char cLastIndexOf2 = (char) ((-1) - TextUtils.lastIndexOf("", '0', 0));
                            int i13 = (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 875;
                            int bitsPerPixel = ImageFormat.getBitsPerPixel(0) + 11;
                            byte b10 = $$a[7];
                            Object[] objArr17 = new Object[1];
                            c((byte) 37, b10, b10, objArr17);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(cLastIndexOf2, i13, bitsPerPixel, 2012020043, false, (String) objArr17[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                        Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2030658839);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                            char pressedStateDuration = (char) (ViewConfiguration.getPressedStateDuration() >> 16);
                            int packedPositionType = 876 - ExpandableListView.getPackedPositionType(0L);
                            int iBlue = 10 - Color.blue(0);
                            byte[] bArr5 = $$a;
                            byte b11 = bArr5[7];
                            Object[] objArr18 = new Object[1];
                            c(b11, bArr5[5], b11, objArr18);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(pressedStateDuration, packedPositionType, iBlue, -1650998592, false, (String) objArr18[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf2);
                    } catch (Exception unused) {
                        throw new RuntimeException();
                    }
                }
                objArr = objArr13;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            }
        }
        if (((int[]) objArr[0])[0] != ((int[]) objArr[2])[0]) {
            throw null;
        }
        int i14 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 109;
        b = i14 % 128;
        int i15 = i14 % 2;
        int i16 = ((int[]) objArr[1])[0];
        Object[] objArr19 = {new int[]{((int[]) objArr[0])[0]}, new int[1], new int[]{((int[]) objArr[2])[0]}, (String[]) objArr[3]};
        int iNextInt = new Random().nextInt(300354329);
        int i17 = ~iNextInt;
        int i18 = i16 + 865512692 + (((~((-246037944) | i17)) | 4484) * 184) + ((iNextInt | (-532381632)) * (-184)) + ((~((-286348173) | i17)) * 184);
        int i19 = (i18 << 13) ^ i18;
        int i20 = i19 ^ (i19 >>> 17);
        ((int[]) objArr19[1])[0] = i20 ^ (i20 << 5);
        int i21 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 81;
        b = i21 % 128;
        int i22 = i21 % 2;
        int i23 = ((int[]) objArr19[1])[0];
        int i24 = i23 * i23;
        int i25 = -(1435889232 * i23);
        int i26 = ((((i24 | i25) << 1) - (i24 ^ i25)) - (~(-(i23 * (-748972240))))) - 1;
        int i27 = (i26 & 673681408) + (673681408 | i26);
        int i28 = i27 >> 15;
        int i29 = (((((-262143) | i28) << 1) - (i28 ^ (-262143))) / 131072) + 1;
        int i30 = ((i27 | i29) << 1) - (i29 ^ i27);
        int i31 = i27 >> 26;
        int i32 = ((i31 & ComposerKt.defaultsKey) + (i31 | ComposerKt.defaultsKey)) / 64;
        int i33 = -(i30 ^ ((i32 & 1) + (i32 | 1)));
        int i34 = (i33 & 9) + (i33 | 9);
        int i35 = (((i34 >> 27) - 63) / 32) + 1;
        return StringsKt.contains(p1.TuitionPaymentFragmentspecialinlinedviewModeldefault1, p0, (boolean) (243 / (((-((i35 & 1) + (i35 | 1))) & i34) * 27)));
    }

    private static void e(char[] cArr, byte b2, int i, Object[] objArr) throws Throwable {
        int i2;
        Object obj;
        int i3 = 2 % 2;
        deInitSession deinitsession = new deInitSession();
        char[] cArr2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        long j = 0;
        Object obj2 = null;
        int i4 = 3;
        if (cArr2 != null) {
            int i5 = $10 + 59;
            $11 = i5 % 128;
            int i6 = i5 % 2;
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i7 = 0;
            while (i7 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i7])};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1770390596);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        byte b3 = (byte) i4;
                        byte b4 = (byte) (b3 - 3);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) ExpandableListView.getPackedPositionGroup(j), 2267 - (ViewConfiguration.getFadingEdgeLength() >> 16), (ViewConfiguration.getDoubleTapTimeout() >> 16) + 33, -1927765101, false, $$g(b3, b4, b4), new Class[]{Integer.TYPE});
                    }
                    cArr3[i7] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                    i7++;
                    j = 0;
                    i4 = 3;
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
        Object[] objArr3 = {Integer.valueOf(TuitionPaymentFragmentbindingInflater1)};
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1770390596);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            byte b5 = (byte) 3;
            byte b6 = (byte) (b5 - 3);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (1 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))), ((Process.getThreadPriority(0) + 20) >> 6) + 2267, (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 33, -1927765101, false, $$g(b5, b6, b6), new Class[]{Integer.TYPE});
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
                    cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = (char) (deinitsession.b - b2);
                    cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = (char) (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault2 - b2);
                    obj = obj2;
                } else {
                    Object[] objArr4 = {deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(486174475);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                        char cResolveSizeAndState = (char) (49267 - View.resolveSizeAndState(0, 0, 0));
                        int i8 = 3261 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1));
                        int maximumDrawingCacheSize = (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 30;
                        byte b7 = (byte) ($$f & 3);
                        byte b8 = (byte) (b7 - 2);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(cResolveSizeAndState, i8, maximumDrawingCacheSize, -127612708, false, $$g(b7, b8, b8), new Class[]{Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class});
                    }
                    if (((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4)).intValue() == deinitsession.asBinder) {
                        Object[] objArr5 = {deinitsession, deinitsession, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), deinitsession, Integer.valueOf(cCharValue), deinitsession};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1187000607);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                            byte b9 = (byte) 0;
                            byte b10 = b9;
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (22879 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))), (ViewConfiguration.getJumpTapTimeout() >> 16) + 594, 16 - Process.getGidForName(""), 1570859318, false, $$g(b9, b10, b10), new Class[]{Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Integer.TYPE, Object.class});
                        }
                        obj = null;
                        int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).intValue();
                        int i9 = (deinitsession.TuitionPaymentFragmentbindingInflater1 * cCharValue) + deinitsession.asBinder;
                        cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr2[iIntValue];
                        cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = cArr2[i9];
                    } else {
                        obj = null;
                        if (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault1 == deinitsession.TuitionPaymentFragmentbindingInflater1) {
                            int i10 = $10 + 27;
                            $11 = i10 % 128;
                            int i11 = i10 % 2;
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
                    }
                }
                deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 += 2;
                obj2 = obj;
            }
        }
        for (int i16 = 0; i16 < i; i16++) {
            cArr4[i16] = (char) (cArr4[i16] ^ 13722);
        }
        objArr[0] = new String(cArr4);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0025  */
    /* JADX WARN: Code duplicated, block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0025
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$g(int r6, short r7, int r8) {
        /*
            byte[] r0 = defpackage.toggleHDRPlus.$$c
            int r6 = 116 - r6
            int r7 = r7 * 4
            int r7 = 4 - r7
            int r8 = r8 * 3
            int r1 = 1 - r8
            byte[] r1 = new byte[r1]
            r2 = 0
            int r8 = 0 - r8
            if (r0 != 0) goto L17
            r3 = r7
            r6 = r8
            r4 = r2
            goto L2a
        L17:
            r3 = r2
        L18:
            byte r4 = (byte) r6
            r1[r3] = r4
            int r4 = r3 + 1
            if (r3 != r8) goto L25
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L25:
            r3 = r0[r7]
            r5 = r3
            r3 = r7
            r7 = r5
        L2a:
            int r7 = -r7
            int r6 = r6 + r7
            int r7 = r3 + 1
            r3 = r4
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.toggleHDRPlus.$$g(int, short, int):java.lang.String");
    }
}
