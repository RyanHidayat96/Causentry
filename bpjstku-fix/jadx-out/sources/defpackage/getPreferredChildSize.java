package defpackage;

import android.content.Context;
import android.graphics.Color;
import android.media.AudioTrack;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.Toast;
import com.bpjstku.presentation.asik.active.model.IndividualDataAsik;
import com.midtrans.sdk.corekit.models.BankType;
import com.midtrans.sdk.corekit.models.PaymentDetails;
import com.midtrans.sdk.corekit.models.snap.ItemDetails;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes5.dex */
public final class getPreferredChildSize extends filterOutChildSizesThatWillNeverBeSelected {
    public double TuitionPaymentFragmentbindingInflater1;
    public String TuitionPaymentFragmentspecialinlinedviewModeldefault2;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f965a;
    public long asBinder;
    public double asInterface;
    private float d;
    public float g;
    private static final byte[] $$c = {14, 116, 92, -78};
    private static final int $$d = 174;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$a = {68, 104, -93, -37, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, -7, 18, 16, 1, 16, 16, 4, -19, 48, 3, 17, 0, 30, -4, 24, -54, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -56, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -54};
    private static final int $$b = 128;
    private static int INotificationSideChannel = 0;
    private static int notify = 1;
    private static long cancelAll = -6377398940819159759L;
    private static int onTransact = -981105359;
    private static char cancel = 19436;

    public getPreferredChildSize(float f, String str) {
        double totalAmount;
        PaymentDetails paymentDetails = b().getPaymentDetails();
        if (paymentDetails != null) {
            totalAmount = paymentDetails.getTotalAmount();
            int i = notify + 101;
            INotificationSideChannel = i % 128;
            if (i % 2 == 0) {
                int i2 = 2 % 2;
            }
        } else {
            totalAmount = 0.0d;
        }
        this.TuitionPaymentFragmentbindingInflater1 = totalAmount;
        this.asInterface = totalAmount;
        this.d = 0.0f;
        this.g = f;
        this.f965a = str;
        int i3 = INotificationSideChannel + 7;
        notify = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0027  */
    /* JADX WARN: Code duplicated, block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x0030). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0027
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void c(short r6, short r7, int r8, java.lang.Object[] r9) {
        /*
            byte[] r0 = defpackage.getPreferredChildSize.$$a
            int r8 = r8 * 3
            int r8 = 84 - r8
            int r6 = r6 * 15
            int r1 = 53 - r6
            int r7 = 92 - r7
            byte[] r1 = new byte[r1]
            int r6 = 52 - r6
            r2 = 0
            if (r0 != 0) goto L17
            r3 = r6
            r8 = r7
            r4 = r2
            goto L30
        L17:
            r3 = r2
        L18:
            byte r4 = (byte) r8
            r1[r3] = r4
            int r7 = r7 + 1
            if (r3 != r6) goto L27
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L27:
            int r3 = r3 + 1
            r4 = r0[r7]
            r5 = r8
            r8 = r7
            r7 = r4
            r4 = r3
            r3 = r5
        L30:
            int r3 = r3 + r7
            int r7 = r3 + (-11)
            r3 = r4
            r5 = r8
            r8 = r7
            r7 = r5
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.getPreferredChildSize.c(short, short, int, java.lang.Object[]):void");
    }

    private static void e(char[] cArr, char[] cArr2, char c, int i, char[] cArr3, Object[] objArr) throws Throwable {
        int i2 = 2;
        int i3 = 2 % 2;
        SessionProcessor sessionProcessor = new SessionProcessor();
        int length = cArr2.length;
        char[] cArr4 = new char[length];
        int length2 = cArr.length;
        char[] cArr5 = new char[length2];
        int i4 = 0;
        System.arraycopy(cArr2, 0, cArr4, 0, length);
        System.arraycopy(cArr, 0, cArr5, 0, length2);
        cArr4[0] = (char) (cArr4[0] ^ c);
        cArr5[2] = (char) (cArr5[2] + ((char) i));
        int length3 = cArr3.length;
        char[] cArr6 = new char[length3];
        sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 0;
        while (sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2 < length3) {
            int i5 = $10 + 69;
            $11 = i5 % 128;
            int i6 = i5 % i2;
            try {
                Object[] objArr2 = {sessionProcessor};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1033601528);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    char size = (char) (8328 - View.MeasureSpec.getSize(i4));
                    int doubleTapTimeout = 1235 - (ViewConfiguration.getDoubleTapTimeout() >> 16);
                    int size2 = View.MeasureSpec.getSize(i4) + 35;
                    byte b = (byte) ($$d & 3);
                    byte b2 = (byte) (b - 2);
                    String str$$e = $$e(b, b2, (byte) (b2 - 1));
                    Class[] clsArr = new Class[1];
                    clsArr[i4] = Object.class;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(size, doubleTapTimeout, size2, -653973969, false, str$$e, clsArr);
                }
                int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).intValue();
                try {
                    Object[] objArr3 = {sessionProcessor};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1120586870);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                        byte b3 = (byte) i4;
                        byte b4 = b3;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (ViewConfiguration.getWindowTouchSlop() >> 8), 2764 - TextUtils.indexOf("", "", i4), (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 14, 1504416861, false, $$e(b3, b4, (byte) (b4 - 1)), new Class[]{Object.class});
                    }
                    int iIntValue2 = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).intValue();
                    try {
                        Object[] objArr4 = {sessionProcessor, Integer.valueOf(cArr4[sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2 % 4] * 32718), Integer.valueOf(cArr5[iIntValue])};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(811618268);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (43326 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))), 253 - ExpandableListView.getPackedPositionGroup(0L), View.MeasureSpec.makeMeasureSpec(0, 0) + 22, -721491957, false, "j", new Class[]{Object.class, Integer.TYPE, Integer.TYPE});
                        }
                        ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
                        try {
                            Object[] objArr5 = {Integer.valueOf(cArr4[iIntValue2] * 32718), Integer.valueOf(cArr5[iIntValue])};
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1821841887);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                                byte b5 = (byte) 1;
                                byte b6 = (byte) (b5 - 1);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (65200 - TextUtils.indexOf("", "", 0, 0)), 2890 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), 17 - TextUtils.indexOf("", "", 0, 0), 2012627446, false, $$e(b5, b6, (byte) (b6 - 1)), new Class[]{Integer.TYPE, Integer.TYPE});
                            }
                            cArr5[iIntValue2] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).charValue();
                            cArr4[iIntValue2] = sessionProcessor.b;
                            cArr6[sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2] = (char) (((((long) (cArr4[iIntValue2] ^ cArr3[sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2])) ^ (cancelAll ^ (-6377398940819159759L))) ^ ((long) ((int) (((long) onTransact) ^ (-6377398940819159759L))))) ^ ((long) ((char) (((long) cancel) ^ (-6377398940819159759L)))));
                            sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2++;
                            i2 = 2;
                            i4 = 0;
                        } catch (Throwable th) {
                            Throwable cause = th.getCause();
                            if (cause == null) {
                                throw th;
                            }
                            throw cause;
                        }
                    } catch (Throwable th2) {
                        Throwable cause2 = th2.getCause();
                        if (cause2 == null) {
                            throw th2;
                        }
                        throw cause2;
                    }
                } catch (Throwable th3) {
                    Throwable cause3 = th3.getCause();
                    if (cause3 == null) {
                        throw th3;
                    }
                    throw cause3;
                }
            } catch (Throwable th4) {
                Throwable cause4 = th4.getCause();
                if (cause4 == null) {
                    throw th4;
                }
                throw cause4;
            }
        }
        objArr[0] = new String(cArr6);
        int i7 = $11 + 45;
        $10 = i7 % 128;
        if (i7 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault3(float f) throws Throwable {
        Object[] objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$5f1425da;
        int i = 2 % 2;
        int i2 = notify + 71;
        INotificationSideChannel = i2 % 128;
        int i3 = i2 % 2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char c = (char) (29945 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)));
            int iBlue = Color.blue(0) + 1755;
            int i4 = (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 23;
            byte[] bArr = $$a;
            byte b = bArr[28];
            Object[] objArr = new Object[1];
            c(b, (byte) (b | 88), bArr[7], objArr);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(c, iBlue, i4, 986134021, false, (String) objArr[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr2 = new Object[1];
        e(new char[]{0, 0, 0, 0}, new char[]{24879, 17170, 36072, 32531}, (char) (ViewConfiguration.getJumpTapTimeout() >> 16), 1 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), new char[]{31722, 35291, 16181, 57239, 47388, 27507, 503, 39592, 46284, 59564, 19945, 30340, 7702, 11560, 45647, 10343, 37884, 36670, 33789, 64165, 3192, 62181}, objArr2);
        Class<?> cls = Class.forName((String) objArr2[0]);
        Object[] objArr3 = new Object[1];
        e(new char[]{0, 0, 0, 0}, new char[]{22056, 41266, 32311, 46439}, (char) (View.MeasureSpec.getMode(0) + 26494), 933311062 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), new char[]{26259, 57847, 65114, 33445, 54367, 4554, 44358, 44101, 16262, 63789, 39898, 17129, 15369, 47775, 13306}, objArr3);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr3[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1145728641);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char deadChar = (char) (KeyEvent.getDeadChar(0, 0) + 29944);
            int i5 = (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 1756;
            int deadChar2 = KeyEvent.getDeadChar(0, 0) + 23;
            byte b2 = $$a[7];
            byte b3 = b2;
            Object[] objArr4 = new Object[1];
            c(b3, (byte) (b3 | 52), b2, objArr4);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(deadChar, i5, deadChar2, 1596667560, false, (String) objArr4[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            int i6 = notify + 99;
            INotificationSideChannel = i6 % 128;
            int i7 = i6 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char packedPositionChild = (char) (29943 - ExpandableListView.getPackedPositionChild(0L));
                int iGreen = Color.green(0) + 1755;
                int iCombineMeasuredStates = 23 - View.combineMeasuredStates(0, 0);
                byte b4 = $$a[7];
                byte b5 = b4;
                Object[] objArr5 = new Object[1];
                c(b4, b5, b5, objArr5);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(packedPositionChild, iGreen, iCombineMeasuredStates, 1599039318, false, (String) objArr5[0], null);
            }
            Object[] objArr6 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$5f1425da = new Object[]{new int[]{((int[]) objArr6[0])[0]}, new int[]{((int[]) objArr6[1])[0]}, (Object[]) objArr6[2], new int[1], (String[]) objArr6[4]};
            int iIdentityHashCode = System.identityHashCode(this);
            int i8 = ~iIdentityHashCode;
            int i9 = ((((((~(830413797 | i8)) | (~((-1043016224) | iIdentityHashCode))) | (~(i8 | 1043016223))) * 959) - 1707880302) + (((~(iIdentityHashCode | 1043016223)) | ((~(i8 | (-1043016224))) | (~(830413797 | iIdentityHashCode)))) * 959)) - 1851610066;
            int i10 = (i9 << 13) ^ i9;
            int i11 = i10 ^ (i10 >>> 17);
            ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$5f1425da[3])[0] = i11 ^ (i11 << 5);
        } else {
            Object[] objArr7 = new Object[1];
            e(new char[]{0, 0, 0, 0}, new char[]{16066, 61980, 9594, 56353}, (char) (8485 - KeyEvent.getDeadChar(0, 0)), ViewConfiguration.getKeyRepeatTimeout() >> 16, new char[]{39544, 21488, 7781, 23668, 26262, 1256, 8706, 38437, 26193, 17364, 36221, 33284, 44986, 32354, 48065, 37579}, objArr7);
            Class<?> cls2 = Class.forName((String) objArr7[0]);
            Object[] objArr8 = new Object[1];
            e(new char[]{0, 0, 0, 0}, new char[]{8159, 54956, 44790, 27379}, (char) ((KeyEvent.getMaxKeyCode() >> 16) + 62382), (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), new char[]{2380, 31809, 28655, 3618, 29419, 32727, 21379, 9984, 24009, 13442, 58754, 7866, 57318, 15924, 3942, 31342}, objArr8);
            int iIntValue = ((Integer) cls2.getMethod((String) objArr8[0], Object.class).invoke(null, this)).intValue();
            try {
                Object[] objArr9 = {1799036761};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2063193834);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (KeyEvent.getDeadChar(0, 0) + 42049), Color.green(0) + 1726, 29 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), -1637387971, false, null, new Class[]{Integer.TYPE});
                }
                objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$5f1425da = IndividualDataAsik.TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault1$5f1425da(iIntValue, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).newInstance(objArr9), -1851610066);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                    char mode = (char) (29944 - View.MeasureSpec.getMode(0));
                    int iArgb = 1755 - Color.argb(0, 0, 0, 0);
                    int iIndexOf = TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 24;
                    byte b6 = $$a[7];
                    byte b7 = b6;
                    Object[] objArr10 = new Object[1];
                    c(b6, b7, b7, objArr10);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(mode, iArgb, iIndexOf, 1599039318, false, (String) objArr10[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$5f1425da);
                try {
                    Object[] objArr11 = new Object[1];
                    e(new char[]{0, 0, 0, 0}, new char[]{24879, 17170, 36072, 32531}, (char) Color.blue(0), Gravity.getAbsoluteGravity(0, 0), new char[]{31722, 35291, 16181, 57239, 47388, 27507, 503, 39592, 46284, 59564, 19945, 30340, 7702, 11560, 45647, 10343, 37884, 36670, 33789, 64165, 3192, 62181}, objArr11);
                    Class<?> cls3 = Class.forName((String) objArr11[0]);
                    Object[] objArr12 = new Object[1];
                    e(new char[]{0, 0, 0, 0}, new char[]{22056, 41266, 32311, 46439}, (char) (26494 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1))), TextUtils.lastIndexOf("", '0', 0, 0) + 933311063, new char[]{26259, 57847, 65114, 33445, 54367, 4554, 44358, 44101, 16262, 63789, 39898, 17129, 15369, 47775, 13306}, objArr12);
                    long jLongValue2 = ((Long) cls3.getDeclaredMethod((String) objArr12[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue2);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1145728641);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                        char packedPositionGroup = (char) (29944 - ExpandableListView.getPackedPositionGroup(0L));
                        int iLastIndexOf = 1754 - TextUtils.lastIndexOf("", '0', 0);
                        int trimmedLength = TextUtils.getTrimmedLength("") + 23;
                        byte b8 = $$a[7];
                        byte b9 = b8;
                        Object[] objArr13 = new Object[1];
                        c(b9, (byte) (b9 | 52), b8, objArr13);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(packedPositionGroup, iLastIndexOf, trimmedLength, 1596667560, false, (String) objArr13[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
                        char cNormalizeMetaState = (char) (29944 - KeyEvent.normalizeMetaState(0));
                        int iIndexOf2 = 1755 - TextUtils.indexOf("", "", 0);
                        int iAlpha = Color.alpha(0) + 23;
                        byte[] bArr2 = $$a;
                        byte b10 = bArr2[28];
                        Object[] objArr14 = new Object[1];
                        c(b10, (byte) (b10 | 88), bArr2[7], objArr14);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(cNormalizeMetaState, iIndexOf2, iAlpha, 986134021, false, (String) objArr14[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).set(null, lValueOf2);
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
        int i12 = ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$5f1425da[1])[0];
        int i13 = ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$5f1425da[0])[0];
        if (i13 == i12) {
            int i14 = notify + 97;
            INotificationSideChannel = i14 % 128;
            int i15 = i14 % 2;
            int i16 = ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$5f1425da[3])[0];
            Object[] objArr15 = {new int[]{((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$5f1425da[0])[0]}, new int[]{((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$5f1425da[1])[0]}, (Object[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$5f1425da[2], new int[1], (String[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$5f1425da[4]};
            int i17 = ~System.identityHashCode(this);
            int i18 = i16 + 148850401 + ((1068482174 | i17) * 184) + (((~(i17 | 976201332)) | 397164110) * 184);
            int i19 = (i18 << 13) ^ i18;
            int i20 = i19 ^ (i19 >>> 17);
            ((int[]) objArr15[3])[0] = i20 ^ (i20 << 5);
        } else {
            ArrayList arrayList = new ArrayList();
            String[] strArr = (String[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$5f1425da[4];
            if (strArr != null) {
                for (String str : strArr) {
                    arrayList.add(str);
                }
            }
            Toast.makeText((Context) null, i13 / (((i13 - 1) * i13) % 2), 0).show();
            int i21 = ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$5f1425da[3])[0];
            Object[] objArr16 = {new int[]{((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$5f1425da[0])[0]}, new int[]{((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$5f1425da[1])[0]}, (Object[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$5f1425da[2], new int[1], (String[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$5f1425da[4]};
            int i22 = ~(System.identityHashCode(this) | (-126595594));
            int i23 = i21 + (((514912547 + (((-339198020) | i22) * (-220))) + ((i22 | 59257352) * 220)) - 2063146042);
            int i24 = (i23 << 13) ^ i23;
            int i25 = i24 ^ (i24 >>> 17);
            ((int[]) objArr16[3])[0] = i25 ^ (i25 << 5);
        }
        this.d = f;
        this.TuitionPaymentFragmentbindingInflater1 = this.asInterface - ((double) f);
    }

    public final ItemDetails TuitionPaymentFragmentbindingInflater1() {
        int i = 2 % 2;
        int i2 = notify + 27;
        INotificationSideChannel = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            TextUtils.isEmpty(this.f965a);
            throw null;
        }
        if (!TextUtils.isEmpty(this.f965a) && !TextUtils.isEmpty(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2)) {
            int i3 = INotificationSideChannel + 111;
            notify = i3 % 128;
            int i4 = i3 % 2;
            int i5 = ((int) this.d) * (-1);
            String str = this.f965a;
            str.hashCode();
            if (str.equals(BankType.BNI)) {
                ItemDetails itemDetails = new ItemDetails("bni_point", this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, i5, 1);
                int i6 = INotificationSideChannel + 91;
                notify = i6 % 128;
                if (i6 % 2 != 0) {
                    return itemDetails;
                }
                obj.hashCode();
                throw null;
            }
            if (str.equals(BankType.MANDIRI)) {
                return new ItemDetails("mandiri_point", this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, i5, 1);
            }
        }
        int i7 = notify + 37;
        INotificationSideChannel = i7 % 128;
        if (i7 % 2 == 0) {
            return null;
        }
        throw null;
    }

    private static String $$e(short s, int i, int i2) {
        int i3 = i2 + 4;
        int i4 = 104 - s;
        byte[] bArr = $$c;
        int i5 = i * 4;
        byte[] bArr2 = new byte[1 - i5];
        int i6 = 0 - i5;
        int i7 = -1;
        if (bArr == null) {
            i4 += i3;
            i3 = i3;
            i7 = -1;
        }
        while (true) {
            int i8 = i3 + 1;
            int i9 = i7 + 1;
            bArr2[i9] = (byte) i4;
            if (i9 == i6) {
                return new String(bArr2, 0);
            }
            i4 = bArr[i8] + i4;
            i3 = i8;
            i7 = i9;
        }
    }
}
