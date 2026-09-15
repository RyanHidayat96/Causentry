package defpackage;

import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.collection.LongSparseArray;
import androidx.collection.SparseArrayCompat;
import com.airbnb.lottie.model.layer.Layer;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class previous {
    public float TuitionPaymentFragmentbindingInflater1;
    public Rect TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    public Map<String, MediaControllerCompatMediaControllerImplApi21ExtraCallback> TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    public float TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f1325a;
    public LongSparseArray<Layer> asBinder;
    public List<getCurrentVolume> asInterface;
    public SparseArrayCompat<getMaxVolume> b;
    public Map<String, List<Layer>> cancel;
    public List<Layer> d;
    public Map<String, prepareFromMediaId> g;
    public float onTransact;
    private static final byte[] $$c = {73, 55, 58, 33};
    private static final int $$d = 129;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$a = {12, 11, -9, -106, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 55};
    private static final int $$b = 254;
    private static int INotificationSideChannelStubProxy = 0;
    private static int INotificationSideChannelStub = 1;
    private static char[] getInterfaceDescriptor = {60052, 60034, 60060, 60050, 60073, 60047, 60043, 60072, 60061, 60117, 59745, 60053, 59744, 60040, 60088, 60059, 60056, 60041, 60057, 60062, 60058, 60063, 60048, 60055, 60054};
    private static char RemoteActionCompatParcelizer = 57188;
    public final sendMediaButton cancelAll = new sendMediaButton();
    public final HashSet<String> notify = new HashSet<>();
    public int INotificationSideChannel = 0;

    /* JADX WARN: Code duplicated, block: B:10:0x002a  */
    /* JADX WARN: Code duplicated, block: B:8:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002a -> B:11:0x002c). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x002a
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void e(int r6, byte r7, int r8, java.lang.Object[] r9) {
        /*
            int r7 = r7 * 3
            int r7 = r7 + 4
            byte[] r0 = defpackage.previous.$$a
            int r6 = r6 * 3
            int r6 = 53 - r6
            int r8 = r8 * 3
            int r8 = 84 - r8
            byte[] r1 = new byte[r6]
            r2 = 0
            if (r0 != 0) goto L17
            r4 = r8
            r3 = r2
            r8 = r7
            goto L2c
        L17:
            r3 = r2
            r5 = r8
            r8 = r7
            r7 = r5
        L1b:
            byte r4 = (byte) r7
            r1[r3] = r4
            int r3 = r3 + 1
            if (r3 != r6) goto L2a
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L2a:
            r4 = r0[r8]
        L2c:
            int r4 = -r4
            int r7 = r7 + r4
            int r8 = r8 + 1
            int r7 = r7 + (-11)
            goto L1b
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.previous.e(int, byte, int, java.lang.Object[]):void");
    }

    private static void c(char[] cArr, byte b, int i, Object[] objArr) throws Throwable {
        int i2;
        Object obj;
        int length;
        char[] cArr2;
        int i3 = 2 % 2;
        deInitSession deinitsession = new deInitSession();
        char[] cArr3 = getInterfaceDescriptor;
        int i4 = 1770390596;
        char c = '0';
        Object obj2 = null;
        if (cArr3 != null) {
            int i5 = $11 + 23;
            $10 = i5 % 128;
            if (i5 % 2 != 0) {
                length = cArr3.length;
                cArr2 = new char[length];
            } else {
                length = cArr3.length;
                cArr2 = new char[length];
            }
            int i6 = 0;
            while (i6 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr3[i6])};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(i4);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        byte b2 = (byte) 0;
                        byte b3 = b2;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (TextUtils.indexOf("", c, 0, 0) + 1), 2266 - TextUtils.lastIndexOf("", c, 0), 33 - TextUtils.getOffsetBefore("", 0), -1927765101, false, $$e(b2, b3, (byte) (b3 + 3)), new Class[]{Integer.TYPE});
                    }
                    cArr2[i6] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                    i6++;
                    i4 = 1770390596;
                    c = '0';
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr3 = cArr2;
        }
        try {
            Object[] objArr3 = {Integer.valueOf(RemoteActionCompatParcelizer)};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1770390596);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                byte b4 = (byte) 0;
                byte b5 = b4;
                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) ((-1) - TextUtils.indexOf((CharSequence) "", '0')), 2266 - Process.getGidForName(""), Drawable.resolveOpacity(0, 0) + 33, -1927765101, false, $$e(b4, b5, (byte) (b5 + 3)), new Class[]{Integer.TYPE});
            }
            char cCharValue = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).charValue();
            char[] cArr4 = new char[i];
            if (i % 2 != 0) {
                i2 = i - 1;
                cArr4[i2] = (char) (cArr[i2] - b);
                int i7 = $10 + 1;
                $11 = i7 % 128;
                int i8 = i7 % 2;
            } else {
                i2 = i;
            }
            if (i2 > 1) {
                deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
                while (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 < i2) {
                    deinitsession.b = cArr[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3];
                    deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = cArr[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1];
                    if (deinitsession.b == deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                        cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = (char) (deinitsession.b - b);
                        cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = (char) (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault2 - b);
                        obj = obj2;
                    } else {
                        Object[] objArr4 = {deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(486174475);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                            byte b6 = (byte) 0;
                            byte b7 = b6;
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (49267 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24)), 3261 - TextUtils.indexOf("", "", 0), (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 30, -127612708, false, $$e(b6, b7, (byte) (b7 + 2)), new Class[]{Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class});
                        }
                        if (((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4)).intValue() == deinitsession.asBinder) {
                            int i9 = $11 + 33;
                            $10 = i9 % 128;
                            int i10 = i9 % 2;
                            Object[] objArr5 = {deinitsession, deinitsession, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), deinitsession, Integer.valueOf(cCharValue), deinitsession};
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1187000607);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                                byte b8 = (byte) 0;
                                byte b9 = b8;
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (22878 - (Process.myTid() >> 22)), 594 - TextUtils.getOffsetAfter("", 0), 17 - Color.red(0), 1570859318, false, $$e(b8, b9, b9), new Class[]{Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Integer.TYPE, Object.class});
                            }
                            obj = null;
                            int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).intValue();
                            int i11 = (deinitsession.TuitionPaymentFragmentbindingInflater1 * cCharValue) + deinitsession.asBinder;
                            cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr3[iIntValue];
                            cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = cArr3[i11];
                        } else {
                            obj = null;
                            if (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault1 == deinitsession.TuitionPaymentFragmentbindingInflater1) {
                                deinitsession.g = ((deinitsession.g + cCharValue) - 1) % cCharValue;
                                deinitsession.asBinder = ((deinitsession.asBinder + cCharValue) - 1) % cCharValue;
                                int i12 = (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault1 * cCharValue) + deinitsession.g;
                                int i13 = (deinitsession.TuitionPaymentFragmentbindingInflater1 * cCharValue) + deinitsession.asBinder;
                                cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr3[i12];
                                cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = cArr3[i13];
                            } else {
                                int i14 = (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault1 * cCharValue) + deinitsession.asBinder;
                                int i15 = (deinitsession.TuitionPaymentFragmentbindingInflater1 * cCharValue) + deinitsession.g;
                                cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr3[i14];
                                cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = cArr3[i15];
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
        } catch (Throwable th2) {
            Throwable cause2 = th2.getCause();
            if (cause2 == null) {
                throw th2;
            }
            throw cause2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:72:0x0355 A[LOOP:0: B:7:0x001f->B:72:0x0355, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:87:0x0354 A[SYNTHETIC] */
    public final getCurrentVolume b(String str) throws Throwable {
        int i;
        int i2;
        int i3;
        long j;
        int i4 = 2 % 2;
        int i5 = INotificationSideChannelStubProxy + 89;
        INotificationSideChannelStub = i5 % 128;
        int i6 = 0;
        if (i5 % 2 == 0) {
            this.asInterface.size();
        } else {
            this.asInterface.size();
        }
        int i7 = 0;
        while (true) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1552861273);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) ((CdmaCellLocation.convertQuartSecToDecDegrees(i6) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(i6) == 0.0d ? 0 : -1)) + 46400), (TypedValue.complexToFraction(i6, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(i6, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 40, TextUtils.getOffsetBefore("", i6) + 19, -1206882418, false, "TuitionPaymentFragmentspecialinlinedviewModeldefault3", null);
            }
            int i8 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getInt(null);
            Object[] objArr = new Object[1];
            c(new char[]{21, '\n', 22, 16, 1, 4, 24, 6, 3, '\n', 5, '\b', 3, 11, '\t', 15, 4, 19, 20, 3, 17, 21}, (byte) ((ViewConfiguration.getScrollBarSize() >> 8) + 44), (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 22, objArr);
            Class<?> cls = Class.forName((String) objArr[i6]);
            Object[] objArr2 = new Object[1];
            c(new char[]{18, 24, 21, 5, 14, 18, 24, 1, 15, 24, 20, '\b', 4, 23, 13948}, (byte) ((AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 125), TextUtils.getOffsetAfter("", i6) + 15, objArr2);
            long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr2[i6], new Class[i6]).invoke(null, new Object[i6])).longValue() & (-1024);
            int i9 = i8;
            long j2 = -68;
            long j3 = -1;
            long j4 = j3 ^ 2002627151657471916L;
            long j5 = j3 ^ 94630023084487071L;
            long jIdentityHashCode = System.identityHashCode(this);
            long j6 = jIdentityHashCode ^ j3;
            long j7 = (((long) 69) * 2002627151657471916L) + (((long) (-67)) * 94630023084487071L) + (((((j4 | j5) | j6) ^ j3) | (2007184631767089087L ^ j3) | ((jIdentityHashCode | 94630023084487071L) ^ j3)) * j2) + (j2 * (((j4 | j6) | 94630023084487071L) ^ j3)) + (((long) 68) * (j4 | ((j5 | j6) ^ j3)));
            int i10 = 0;
            while (true) {
                if (i10 == 10) {
                    int length = str != null ? str.length() : 0;
                    try {
                        Object[] objArr3 = {1687854523};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-725886332);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (46038 - TextUtils.getCapsMode("", 0, 0)), 1134 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), 18 - View.resolveSizeAndState(0, 0, 0), 807763283, false, null, new Class[]{Integer.TYPE});
                        }
                        Object[] objArr4 = {Integer.valueOf(length), 0, -1823471915, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).newInstance(objArr3), false};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1443305588);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                            char c = (char) (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
                            int i11 = (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 1031;
                            int offsetAfter = 15 - TextUtils.getOffsetAfter("", 0);
                            byte b = $$a[7];
                            byte b2 = b;
                            Object[] objArr5 = new Object[1];
                            e(b, b2, b2, objArr5);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(c, i11, offsetAfter, 1298546779, false, (String) objArr5[0], new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (45993 - (ViewConfiguration.getKeyRepeatTimeout() >> 16)), Color.alpha(0) + 1117, (Process.myTid() >> 22) + 17), Boolean.TYPE});
                        }
                        Object[] objArr6 = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
                        if (((int[]) objArr6[3])[0] == ((int[]) objArr6[1])[0]) {
                            break;
                        }
                        ArrayList arrayList = new ArrayList();
                        String[] strArr = (String[]) objArr6[0];
                        if (strArr != null) {
                            int i12 = 0;
                            while (i12 < strArr.length) {
                                arrayList.add(strArr[i12]);
                                i12++;
                                int i13 = INotificationSideChannelStub + 53;
                                INotificationSideChannelStubProxy = i13 % 128;
                                int i14 = i13 % 2;
                            }
                        }
                        throw null;
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause != null) {
                            throw cause;
                        }
                        throw th;
                    }
                }
                int i15 = INotificationSideChannelStub + 121;
                INotificationSideChannelStubProxy = i15 % 128;
                if (i15 % 2 != 0) {
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-638037654);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (TextUtils.getTrimmedLength("") + 37836), (ViewConfiguration.getEdgeSlop() >> 16) + 59, (ViewConfiguration.getPressedStateDuration() >> 16) + 18, 1030158013, false, "TuitionPaymentFragmentspecialinlinedviewModeldefault3", null);
                    }
                    i3 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).getInt(null);
                } else {
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-638037654);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b((char) ((PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 37836), (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 59, (ViewConfiguration.getLongPressTimeout() >> 16) + 18, 1030158013, false, "TuitionPaymentFragmentspecialinlinedviewModeldefault3", null);
                    }
                    i3 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).getInt(null);
                }
                int i16 = 0;
                while (true) {
                    int i17 = INotificationSideChannelStub + 123;
                    INotificationSideChannelStubProxy = i17 % 128;
                    int i18 = i17 % 2;
                    int i19 = 0;
                    while (i19 != 8) {
                        i3 = (((((int) (jLongValue >> i19)) & 255) + (i3 << 6)) + (i3 << 16)) - i3;
                        i19++;
                        j7 = j7;
                    }
                    j = j7;
                    if (i16 != 0) {
                        break;
                    }
                    int i20 = INotificationSideChannelStubProxy + 103;
                    INotificationSideChannelStub = i20 % 128;
                    int i21 = i20 % 2;
                    i16++;
                    jLongValue = j;
                    j7 = jLongValue;
                }
                int i22 = i9;
                if (i3 == i22) {
                    break;
                }
                jLongValue -= 1024;
                i10++;
                i9 = i22;
                j7 = j;
            }
            if (i7 >= this.asInterface.size()) {
                return null;
            }
            int i23 = INotificationSideChannelStubProxy + 103;
            INotificationSideChannelStub = i23 % 128;
            if (i23 % 2 == 0) {
                this.asInterface.get(i7).b.equalsIgnoreCase(str);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            getCurrentVolume getcurrentvolume = this.asInterface.get(i7);
            if (!getcurrentvolume.b.equalsIgnoreCase(str)) {
                if (getcurrentvolume.b.endsWith(getCurrentVolume.TuitionPaymentFragmentspecialinlinedviewModeldefault2)) {
                    String str2 = getcurrentvolume.b;
                    i = 0;
                    if (str2.substring(0, str2.length() - 1).equalsIgnoreCase(str)) {
                    }
                    if (i2 != 0) {
                        return getcurrentvolume;
                    }
                    i7++;
                    i6 = i;
                } else {
                    i = 0;
                }
                i2 = i;
                if (i2 != 0) {
                    return getcurrentvolume;
                }
                i7++;
                i6 = i;
            } else {
                i = 0;
                int i24 = INotificationSideChannelStub + 117;
                INotificationSideChannelStubProxy = i24 % 128;
                int i25 = i24 % 2;
            }
            i2 = 1;
            if (i2 != 0) {
                return getcurrentvolume;
            }
            i7++;
            i6 = i;
        }
    }

    public String toString() {
        int i = 2 % 2;
        StringBuilder sb = new StringBuilder("LottieComposition:\n");
        Iterator<Layer> it = this.d.iterator();
        int i2 = INotificationSideChannelStub + 15;
        INotificationSideChannelStubProxy = i2 % 128;
        while (true) {
            int i3 = i2 % 2;
            if (!it.hasNext()) {
                return sb.toString();
            }
            sb.append(it.next().TuitionPaymentFragmentspecialinlinedviewModeldefault2("\t"));
            i2 = INotificationSideChannelStubProxy + 29;
            INotificationSideChannelStub = i2 % 128;
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0026  */
    /* JADX WARN: Code duplicated, block: B:8:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x0028). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0026
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$e(byte r7, byte r8, short r9) {
        /*
            int r8 = r8 * 2
            int r8 = r8 + 4
            byte[] r0 = defpackage.previous.$$c
            int r9 = 116 - r9
            int r7 = r7 * 2
            int r7 = 1 - r7
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L15
            r3 = r9
            r4 = r2
            r9 = r8
            goto L28
        L15:
            r3 = r2
            r6 = r9
            r9 = r8
            r8 = r6
        L19:
            int r4 = r3 + 1
            byte r5 = (byte) r8
            r1[r3] = r5
            if (r4 != r7) goto L26
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            return r7
        L26:
            r3 = r0[r9]
        L28:
            int r8 = r8 + r3
            int r9 = r9 + 1
            r3 = r4
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.previous.$$e(byte, byte, short):java.lang.String");
    }
}
