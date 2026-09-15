package com.esafirm.imagepicker.features;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.Toast;
import com.esafirm.imagepicker.features.common.BaseConfig;
import com.esafirm.imagepicker.model.Image;
import defpackage.deInitSession;
import defpackage.initSession;
import defpackage.initialValue;
import defpackage.rotate;
import java.io.File;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import kotlin.text.Typography;

/* JADX INFO: loaded from: classes3.dex */
public class ImagePickerConfig extends BaseConfig implements Parcelable {
    public static final Parcelable.Creator<ImagePickerConfig> CREATOR;
    private static char INotificationSideChannelStubProxy;
    private static int RemoteActionCompatParcelizer;
    private static char[] getInterfaceDescriptor;
    public int INotificationSideChannel;
    private int INotificationSideChannelDefault;
    int TuitionPaymentFragmentbindingInflater1;
    public String TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    public ArrayList<File> TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    public String TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public transient String f765a;
    public boolean asBinder;
    public String asInterface;
    public boolean b;
    public boolean cancel;
    public int d;
    public boolean g;
    public boolean notify;
    public ArrayList<Image> onTransact;
    private static final byte[] $$c = {68, 83, 49, -116};
    private static final int $$f = 18;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$d = {94, -1, 37, -59, 4, -11, -11, -19, -10, 6, -22, 38, -39, -21, -1, -22, 8, 52, -57, -42, 3, -20, 2, -15, -8, 21, -26, -33, 3, -1, -18, -15, 37, -53, 8, -15, -15, -1, -18, -15, 9, -16, -14, 1, -14, -14, -2, 21, -46, -1, -15, 2, -28, 6, -22, 56, -42, 3, -20, 2, -15, -8, 21, -26, -33, 3, -1, -18, -15, 37, -53, 8, -15, -15, -1, -18, -15, -8, -6, 2, -7, -15, -1, -20, -6, -14, -7, -6, -14, 0, -8, -27, 4, -5, -27, 33, -43, 2, -10, -16, -1, -10, -10, -4, -29, 0, -17, 57};
    private static final int $$e = 69;
    private static final byte[] $$a = {84, 10, 24, -102, 43, -2, 21, -1, 16, 9, -20, 27, 34, -2, 2, 19, 16, -36, 54, -7, 16, 16, 2, 19, 16, 9, 7, -1, 8, 16, 2, 21, 7, 15, 8, 7, 15, 1, 9, 28, -3, 6, 28, -32, 44, -1, 11, 17, 2, 11, 11, 5, 30, 1, 18, -55, 43, -2, 21, -1, 16, 9, -20, 27, 34, -2, 2, 19, 16, -36, 54, -7, 16, 16, 2, 19, 16, -8, 17, 15, 0, 15, 15, 3, -20, 47, 2, 16, -1, 29, -5, 23, -55};
    private static final int $$b = 244;
    private static int read = 0;
    private static int write = 1;
    private static int IconCompatParcelizer = 1;

    /* JADX WARN: Code duplicated, block: B:10:0x0025  */
    /* JADX WARN: Code duplicated, block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x0027). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0025
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void c(byte r6, short r7, int r8, java.lang.Object[] r9) {
        /*
            int r6 = 53 - r6
            byte[] r0 = com.esafirm.imagepicker.features.ImagePickerConfig.$$a
            int r8 = r8 * 52
            int r8 = 56 - r8
            int r7 = r7 * 14
            int r7 = 98 - r7
            byte[] r1 = new byte[r6]
            r2 = 0
            if (r0 != 0) goto L15
            r3 = r7
            r4 = r2
            r7 = r6
            goto L27
        L15:
            r3 = r2
        L16:
            int r4 = r3 + 1
            byte r5 = (byte) r7
            r1[r3] = r5
            if (r4 != r6) goto L25
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L25:
            r3 = r0[r8]
        L27:
            int r7 = r7 + r3
            int r7 = r7 + (-10)
            int r8 = r8 + 1
            r3 = r4
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.esafirm.imagepicker.features.ImagePickerConfig.c(byte, short, int, java.lang.Object[]):void");
    }

    /* JADX WARN: Code duplicated, block: B:10:0x002b  */
    /* JADX WARN: Code duplicated, block: B:8:0x0023  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002b -> B:11:0x0030). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x002b
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void f(short r6, short r7, short r8, java.lang.Object[] r9) {
        /*
            int r7 = r7 * 2
            int r0 = 53 - r7
            int r6 = r6 * 30
            int r6 = r6 + 84
            byte[] r1 = com.esafirm.imagepicker.features.ImagePickerConfig.$$d
            int r8 = r8 * 52
            int r8 = 55 - r8
            byte[] r0 = new byte[r0]
            int r7 = 52 - r7
            r2 = 0
            if (r1 != 0) goto L19
            r6 = r7
            r3 = r8
            r4 = r2
            goto L30
        L19:
            r3 = r2
        L1a:
            int r8 = r8 + 1
            byte r4 = (byte) r6
            r0[r3] = r4
            int r4 = r3 + 1
            if (r3 != r7) goto L2b
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            r9[r2] = r6
            return
        L2b:
            r3 = r1[r8]
            r5 = r3
            r3 = r8
            r8 = r5
        L30:
            int r8 = -r8
            int r6 = r6 + r8
            int r6 = r6 + (-9)
            r8 = r3
            r3 = r4
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.esafirm.imagepicker.features.ImagePickerConfig.f(short, short, short, java.lang.Object[]):void");
    }

    public ImagePickerConfig() {
        this.TuitionPaymentFragmentbindingInflater1 = -1;
    }

    protected ImagePickerConfig(Parcel parcel) {
        boolean z;
        boolean z2;
        boolean z3;
        super(parcel);
        this.TuitionPaymentFragmentbindingInflater1 = -1;
        this.onTransact = parcel.createTypedArrayList(Image.CREATOR);
        if (parcel.readByte() != 0) {
            ArrayList<File> arrayList = new ArrayList<>();
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = arrayList;
            parcel.readList(arrayList, File.class.getClassLoader());
            int i = 2 % 2;
        }
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = parcel.readString();
        this.asInterface = parcel.readString();
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = parcel.readString();
        this.TuitionPaymentFragmentbindingInflater1 = parcel.readInt();
        this.INotificationSideChannel = parcel.readInt();
        this.d = parcel.readInt();
        this.INotificationSideChannelDefault = parcel.readInt();
        boolean z4 = true;
        if (parcel.readByte() != 0) {
            z = true;
        } else {
            int i2 = 2 % 2;
            z = false;
        }
        this.b = z;
        if (parcel.readByte() != 0) {
            z2 = true;
        } else {
            int i3 = 2 % 2;
            z2 = false;
        }
        this.g = z2;
        if (parcel.readByte() != 0) {
            int i4 = read + 77;
            write = i4 % 128;
            int i5 = i4 % 2;
            int i6 = 2 % 2;
            z3 = true;
        } else {
            z3 = false;
        }
        this.notify = z3;
        this.asBinder = parcel.readByte() != 0;
        if (parcel.readByte() != 0) {
            int i7 = write + 55;
            read = i7 % 128;
            int i8 = i7 % 2;
            int i9 = 2 % 2;
        } else {
            z4 = false;
        }
        this.cancel = z4;
    }

    /* JADX INFO: renamed from: com.esafirm.imagepicker.features.ImagePickerConfig$3, reason: invalid class name */
    public static final class AnonymousClass3 implements Parcelable.Creator<ImagePickerConfig> {
        AnonymousClass3() {
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ ImagePickerConfig createFromParcel(Parcel parcel) {
            return new ImagePickerConfig(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ ImagePickerConfig[] newArray(int i) {
            return new ImagePickerConfig[i];
        }

        public static /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
            initialValue.TuitionPaymentFragmentspecialinlinedviewModeldefault3[0] = rotate.TuitionPaymentFragmentspecialinlinedviewModeldefault3[0];
        }
    }

    private static void e(char[] cArr, byte b, int i, Object[] objArr) throws Throwable {
        int i2;
        Object obj;
        int i3 = 2;
        int i4 = 2 % 2;
        deInitSession deinitsession = new deInitSession();
        char[] cArr2 = getInterfaceDescriptor;
        int i5 = 1770390596;
        Object obj2 = null;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i6 = 0;
            while (i6 < length) {
                int i7 = $10 + 35;
                $11 = i7 % 128;
                int i8 = i7 % i3;
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i6])};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(i5);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        byte b2 = (byte) 0;
                        byte b3 = b2;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (TextUtils.indexOf((CharSequence) "", '0', 0) + 1), 2267 - Color.blue(0), 33 - View.getDefaultSize(0, 0), -1927765101, false, $$g(b2, b3, (byte) (b3 + 3)), new Class[]{Integer.TYPE});
                    }
                    cArr3[i6] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                    i6++;
                    i3 = 2;
                    i5 = 1770390596;
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
        Object[] objArr3 = {Integer.valueOf(INotificationSideChannelStubProxy)};
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1770390596);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            byte b4 = (byte) 0;
            byte b5 = b4;
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), 2267 - Gravity.getAbsoluteGravity(0, 0), 32 - ((byte) KeyEvent.getModifierMetaStateMask()), -1927765101, false, $$g(b4, b5, (byte) (b5 + 3)), new Class[]{Integer.TYPE});
        }
        char cCharValue = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).charValue();
        char[] cArr4 = new char[i];
        if (i % 2 != 0) {
            i2 = i - 1;
            cArr4[i2] = (char) (cArr[i2] - b);
        } else {
            i2 = i;
        }
        if (i2 > 1) {
            deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
            while (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 < i2) {
                int i9 = $11 + 59;
                $10 = i9 % 128;
                int i10 = i9 % 2;
                deinitsession.b = cArr[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3];
                deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = cArr[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1];
                if (deinitsession.b == deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                    cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = (char) (deinitsession.b - b);
                    cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = (char) (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault2 - b);
                    obj = obj2;
                } else {
                    try {
                        Object[] objArr4 = {deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(486174475);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                            byte b6 = (byte) 0;
                            byte b7 = b6;
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (ImageFormat.getBitsPerPixel(0) + 49268), ExpandableListView.getPackedPositionChild(0L) + 3262, 30 - Color.green(0), -127612708, false, $$g(b6, b7, (byte) (b7 + 2)), new Class[]{Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class});
                        }
                        if (((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4)).intValue() == deinitsession.asBinder) {
                            int i11 = $11 + 75;
                            $10 = i11 % 128;
                            int i12 = i11 % 2;
                            Object[] objArr5 = {deinitsession, deinitsession, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), deinitsession, Integer.valueOf(cCharValue), deinitsession};
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1187000607);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                                byte b8 = (byte) 0;
                                byte b9 = b8;
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (22878 - ExpandableListView.getPackedPositionType(0L)), 593 - Process.getGidForName(""), Color.rgb(0, 0, 0) + 16777233, 1570859318, false, $$g(b8, b9, b9), new Class[]{Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Integer.TYPE, Object.class});
                            }
                            obj = null;
                            int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).intValue();
                            int i13 = (deinitsession.TuitionPaymentFragmentbindingInflater1 * cCharValue) + deinitsession.asBinder;
                            cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr2[iIntValue];
                            cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = cArr2[i13];
                        } else {
                            obj = null;
                            if (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault1 == deinitsession.TuitionPaymentFragmentbindingInflater1) {
                                int i14 = $10 + 97;
                                $11 = i14 % 128;
                                int i15 = i14 % 2;
                                deinitsession.g = ((deinitsession.g + cCharValue) - 1) % cCharValue;
                                deinitsession.asBinder = ((deinitsession.asBinder + cCharValue) - 1) % cCharValue;
                                int i16 = (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault1 * cCharValue) + deinitsession.g;
                                int i17 = (deinitsession.TuitionPaymentFragmentbindingInflater1 * cCharValue) + deinitsession.asBinder;
                                cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr2[i16];
                                cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = cArr2[i17];
                                int i18 = $11 + 9;
                                $10 = i18 % 128;
                                int i19 = i18 % 2;
                            } else {
                                int i20 = (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault1 * cCharValue) + deinitsession.asBinder;
                                int i21 = (deinitsession.TuitionPaymentFragmentbindingInflater1 * cCharValue) + deinitsession.g;
                                cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr2[i20];
                                cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = cArr2[i21];
                            }
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
                obj2 = obj;
            }
        }
        for (int i22 = 0; i22 < i; i22++) {
            cArr4[i22] = (char) (cArr4[i22] ^ 13722);
        }
        objArr[0] = new String(cArr4);
    }

    /* JADX WARN: Code duplicated, block: B:24:0x023c  */
    public final int TuitionPaymentFragmentspecialinlinedviewModeldefault1() throws Throwable {
        Object[] objArr;
        int i = 2 % 2;
        int i2 = read + 13;
        write = i2 % 128;
        int i3 = i2 % 2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char cCombineMeasuredStates = (char) (31533 - View.combineMeasuredStates(0, 0));
            int scrollBarSize = (ViewConfiguration.getScrollBarSize() >> 8) + 921;
            int iCombineMeasuredStates = View.combineMeasuredStates(0, 0) + 28;
            byte b = (byte) ($$b & 63);
            byte[] bArr = $$a;
            Object[] objArr2 = new Object[1];
            c(b, bArr[80], bArr[37], objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cCombineMeasuredStates, scrollBarSize, iCombineMeasuredStates, -1048449946, false, (String) objArr2[0], null);
        }
        Object obj = null;
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr3 = new Object[1];
        e(new char[]{5, 28, ' ', 2, '\t', '#', 28, 20, '\n', 17, 23, 22, Typography.quote, 22, 0, '#', 19, '#', '#', '\n', Typography.quote, 11}, (byte) ((ViewConfiguration.getEdgeSlop() >> 16) + 94), 23 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        e(new char[]{31, '#', 0, 16, '\f', Typography.quote, 27, 26, Typography.quote, 0, '#', 4, '#', 21, 13946}, (byte) (ExpandableListView.getPackedPositionType(0L) + 123), 15 - (ViewConfiguration.getJumpTapTimeout() >> 16), objArr4);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(889369593);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char cLastIndexOf = (char) (31532 - TextUtils.lastIndexOf("", '0', 0));
            int offsetBefore = TextUtils.getOffsetBefore("", 0) + 921;
            int i4 = 29 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1));
            byte[] bArr2 = $$a;
            byte b2 = bArr2[80];
            byte b3 = bArr2[37];
            Object[] objArr5 = new Object[1];
            c(b2, b3, b3, objArr5);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cLastIndexOf, offsetBefore, i4, -778300370, false, (String) objArr5[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            int i5 = read + 5;
            write = i5 % 128;
            int i6 = i5 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char mirror = (char) (31581 - AndroidCharacter.getMirror('0'));
                int iLastIndexOf = 920 - TextUtils.lastIndexOf("", '0', 0, 0);
                int scrollDefaultDelay = (ViewConfiguration.getScrollDefaultDelay() >> 16) + 28;
                byte[] bArr3 = $$a;
                Object[] objArr6 = new Object[1];
                c(bArr3[33], bArr3[37], bArr3[80], objArr6);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(mirror, iLastIndexOf, scrollDefaultDelay, -1142834547, false, (String) objArr6[0], null);
            }
            Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            int i7 = ((int[]) objArr7[3])[0];
            objArr = new Object[]{new int[1], new int[]{((int[]) objArr7[1])[0]}, (Object[]) objArr7[2], new int[]{i7}, (String[]) objArr7[4]};
            int iIdentityHashCode = System.identityHashCode(this);
            int i8 = (((-543009295) + (((~(iIdentityHashCode | 993407842)) | 780671801) * 191)) + (((~((~iIdentityHashCode) | 993407842)) | 76023833) * 191)) - 327615794;
            int i9 = (i8 << 13) ^ i8;
            int i10 = i9 ^ (i9 >>> 17);
            ((int[]) objArr[0])[0] = i10 ^ (i10 << 5);
        } else {
            Object[] objArr8 = new Object[1];
            e(new char[]{5, 28, ' ', 2, '\t', '#', 28, 20, 0, 16, 16, 18, 5, ' ', 3, '#', '\t', 3, 4, 29, 16, '\f', '!', 31, 2, 28}, (byte) (45 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24)), TextUtils.lastIndexOf("", '0', 0, 0) + 27, objArr8);
            Class<?> cls2 = Class.forName((String) objArr8[0]);
            Object[] objArr9 = new Object[1];
            e(new char[]{30, 29, 13913, 13913, '#', 24, 0, 3, 13915, 13915, '#', Typography.quote, Typography.quote, 5, 3, '#', 17, '#'}, (byte) (113 - (ViewConfiguration.getMaximumFlingVelocity() >> 16)), 18 - TextUtils.getCapsMode("", 0, 0), objArr9);
            Context applicationContext = (Context) cls2.getMethod((String) objArr9[0], new Class[0]).invoke(null, null);
            if (applicationContext != null) {
                int i11 = write + 117;
                int i12 = i11 % 128;
                read = i12;
                if (i11 % 2 != 0) {
                    boolean z = applicationContext instanceof ContextWrapper;
                    obj.hashCode();
                    throw null;
                }
                if (applicationContext instanceof ContextWrapper) {
                    int i13 = i12 + 13;
                    write = i13 % 128;
                    int i14 = i13 % 2;
                    if (((ContextWrapper) applicationContext).getBaseContext() != null) {
                        applicationContext = applicationContext.getApplicationContext();
                    } else {
                        applicationContext = null;
                    }
                } else {
                    applicationContext = applicationContext.getApplicationContext();
                }
            }
            Object[] objArr10 = new Object[1];
            e(new char[]{22, 0, 4, 5, 28, 4, 5, 28, 20, 23, 22, 27, 17, 4, '#', 18}, (byte) (Color.rgb(0, 0, 0) + 16777258), 15 - TextUtils.lastIndexOf("", '0', 0), objArr10);
            Class<?> cls3 = Class.forName((String) objArr10[0]);
            Object[] objArr11 = new Object[1];
            e(new char[]{' ', 27, '#', 24, 3, '#', 4, 29, 1, 5, 17, '\f', '#', 7, 24, ' '}, (byte) (89 - View.resolveSizeAndState(0, 0, 0)), 15 - Process.getGidForName(""), objArr11);
            int iIntValue = ((Integer) cls3.getMethod((String) objArr11[0], Object.class).invoke(null, this)).intValue();
            int i15 = read + 17;
            write = i15 % 128;
            int i16 = i15 % 2;
            try {
                Object[] objArr12 = {applicationContext, Integer.valueOf(iIntValue), 0, -327615794};
                byte[] bArr4 = $$d;
                byte b4 = bArr4[43];
                Object[] objArr13 = new Object[1];
                f(b4, bArr4[89], b4, objArr13);
                Class<?> cls4 = Class.forName((String) objArr13[0]);
                byte b5 = bArr4[89];
                byte b6 = b5;
                Object[] objArr14 = new Object[1];
                f(b5, b6, b6, objArr14);
                objArr = (Object[]) cls4.getMethod((String) objArr14[0], Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr12);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    char cAxisFromString = (char) (31532 - MotionEvent.axisFromString(""));
                    int iBlue = Color.blue(0) + 921;
                    int maximumDrawingCacheSize = 28 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24);
                    byte[] bArr5 = $$a;
                    Object[] objArr15 = new Object[1];
                    c(bArr5[33], bArr5[37], bArr5[80], objArr15);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(cAxisFromString, iBlue, maximumDrawingCacheSize, -1142834547, false, (String) objArr15[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr);
                try {
                    Object[] objArr16 = new Object[1];
                    e(new char[]{5, 28, ' ', 2, '\t', '#', 28, 20, '\n', 17, 23, 22, Typography.quote, 22, 0, '#', 19, '#', '#', '\n', Typography.quote, 11}, (byte) (TextUtils.lastIndexOf("", '0', 0) + 95), AndroidCharacter.getMirror('0') - 26, objArr16);
                    Class<?> cls5 = Class.forName((String) objArr16[0]);
                    Object[] objArr17 = new Object[1];
                    e(new char[]{31, '#', 0, 16, '\f', Typography.quote, 27, 26, Typography.quote, 0, '#', 4, '#', 21, 13946}, (byte) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 122), 15 - Color.red(0), objArr17);
                    long jLongValue2 = ((Long) cls5.getDeclaredMethod((String) objArr17[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue2);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(889369593);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                        char cLastIndexOf2 = (char) (TextUtils.lastIndexOf("", '0', 0, 0) + 31534);
                        int iIndexOf = TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 922;
                        int i17 = 28 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1));
                        byte[] bArr6 = $$a;
                        byte b7 = bArr6[80];
                        byte b8 = bArr6[37];
                        Object[] objArr18 = new Object[1];
                        c(b7, b8, b8, objArr18);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(cLastIndexOf2, iIndexOf, i17, -778300370, false, (String) objArr18[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                        char pressedStateDuration = (char) (31533 - (ViewConfiguration.getPressedStateDuration() >> 16));
                        int i18 = 922 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1));
                        int jumpTapTimeout = (ViewConfiguration.getJumpTapTimeout() >> 16) + 28;
                        byte b9 = (byte) ($$b & 63);
                        byte[] bArr7 = $$a;
                        Object[] objArr19 = new Object[1];
                        c(b9, bArr7[80], bArr7[37], objArr19);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(pressedStateDuration, i18, jumpTapTimeout, -1048449946, false, (String) objArr19[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf2);
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
        int i19 = ((int[]) objArr[1])[0];
        int i20 = ((int[]) objArr[3])[0];
        if (i20 == i19) {
            int i21 = ((int[]) objArr[0])[0];
            int i22 = ((int[]) objArr[3])[0];
            Object[] objArr20 = {new int[1], new int[]{((int[]) objArr[1])[0]}, (Object[]) objArr[2], new int[]{i22}, (String[]) objArr[4]};
            int iIdentityHashCode2 = System.identityHashCode(this);
            int i23 = ~iIdentityHashCode2;
            int i24 = i21 + (-318458949) + (((~((-780899626) | i23)) | 76088329) * 98) + (((~(i23 | (-993180019))) | (-780899626) | (~(993180018 | iIdentityHashCode2))) * (-49)) + (((~(iIdentityHashCode2 | (-780899626))) | (-1069268348)) * 49);
            int i25 = (i24 << 13) ^ i24;
            int i26 = i25 ^ (i25 >>> 17);
            ((int[]) objArr20[0])[0] = i26 ^ (i26 << 5);
        } else {
            ArrayList arrayList = new ArrayList();
            String[] strArr = (String[]) objArr[4];
            if (strArr != null) {
                int i27 = 0;
                while (i27 < strArr.length) {
                    arrayList.add(strArr[i27]);
                    i27++;
                    int i28 = read + 7;
                    write = i28 % 128;
                    int i29 = i28 % 2;
                }
            }
            int[] iArr = new int[i20];
            int i30 = i20 - 1;
            iArr[i30] = 1;
            Toast.makeText((Context) null, iArr[((i20 * i30) % 2) - 1], 1).show();
            int i31 = ((int[]) objArr[0])[0];
            int i32 = ((int[]) objArr[3])[0];
            Object[] objArr21 = {new int[1], new int[]{((int[]) objArr[1])[0]}, (Object[]) objArr[2], new int[]{i32}, (String[]) objArr[4]};
            int elapsedCpuTime = (int) Process.getElapsedCpuTime();
            int i33 = ~elapsedCpuTime;
            int i34 = i31 + 464625949 + (((~((-876108170) | i33)) | (~(elapsedCpuTime | 897971474))) * 333) + (((~(elapsedCpuTime | (-876108170))) | (~(i33 | 897971474))) * 333);
            int i35 = (i34 << 13) ^ i34;
            int i36 = i35 ^ (i35 >>> 17);
            ((int[]) objArr21[0])[0] = i36 ^ (i36 << 5);
        }
        return this.INotificationSideChannelDefault;
    }

    @Override // com.esafirm.imagepicker.features.common.BaseConfig, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int i2;
        int i3 = 2 % 2;
        int i4 = write + 47;
        read = i4 % 128;
        int i5 = i4 % 2;
        super.writeToParcel(parcel, i);
        parcel.writeTypedList(this.onTransact);
        if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 != null) {
            int i6 = read + 69;
            write = i6 % 128;
            int i7 = i6 % 2;
            i2 = 1;
        } else {
            i2 = 0;
        }
        parcel.writeByte((byte) i2);
        ArrayList<File> arrayList = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        if (arrayList != null) {
            int i8 = write + 43;
            read = i8 % 128;
            int i9 = i8 % 2;
            parcel.writeList(arrayList);
        }
        parcel.writeString(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
        parcel.writeString(this.asInterface);
        parcel.writeString(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
        parcel.writeInt(this.TuitionPaymentFragmentbindingInflater1);
        parcel.writeInt(this.INotificationSideChannel);
        parcel.writeInt(this.d);
        parcel.writeInt(this.INotificationSideChannelDefault);
        parcel.writeByte(this.b ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.g ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.notify ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.asBinder ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.cancel ? (byte) 1 : (byte) 0);
    }

    static {
        RemoteActionCompatParcelizer = 0;
        TuitionPaymentFragmentbindingInflater1();
        CREATOR = new AnonymousClass3();
        int i = IconCompatParcelizer + 23;
        RemoteActionCompatParcelizer = i % 128;
        if (i % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // com.esafirm.imagepicker.features.common.BaseConfig, android.os.Parcelable
    public int describeContents() {
        int i = 2 % 2;
        int i2 = read + 121;
        write = i2 % 128;
        return 1 ^ (i2 % 2 == 0 ? 0 : 1);
    }

    static void TuitionPaymentFragmentbindingInflater1() {
        getInterfaceDescriptor = new char[]{60083, 60091, 60090, 60045, 60058, 60047, 60082, 60086, 60085, 60084, 60048, 60052, 60043, 60093, 60089, 60079, 60040, 60051, 60049, 60060, 60092, 60072, 60117, 60054, 60046, 60073, 60063, 60087, 60034, 60053, 60062, 60088, 60041, 60050, 60055, 60056};
        INotificationSideChannelStubProxy = (char) 57191;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0025  */
    /* JADX WARN: Code duplicated, block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002d). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0025
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$g(byte r6, int r7, int r8) {
        /*
            int r6 = r6 * 4
            int r6 = r6 + 1
            int r7 = r7 * 4
            int r7 = 3 - r7
            int r8 = 116 - r8
            byte[] r0 = com.esafirm.imagepicker.features.ImagePickerConfig.$$c
            byte[] r1 = new byte[r6]
            r2 = 0
            if (r0 != 0) goto L14
            r3 = r7
            r4 = r2
            goto L2d
        L14:
            r3 = r2
            r5 = r8
            r8 = r7
            r7 = r5
        L18:
            byte r4 = (byte) r7
            r1[r3] = r4
            int r3 = r3 + 1
            if (r3 != r6) goto L25
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L25:
            int r8 = r8 + 1
            r4 = r0[r8]
            r5 = r3
            r3 = r8
            r8 = r4
            r4 = r5
        L2d:
            int r7 = r7 + r8
            r8 = r3
            r3 = r4
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: com.esafirm.imagepicker.features.ImagePickerConfig.$$g(byte, int, int):java.lang.String");
    }
}
