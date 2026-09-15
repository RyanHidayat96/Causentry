package com.bpjstku.util.constant;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import defpackage.deInitSession;
import defpackage.initSession;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Typography;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 com.bpjstku.util.constant.AsikPointer[], still in use, count: 1, list:
  (r0v1 com.bpjstku.util.constant.AsikPointer[]) from 0x0020: INVOKE (r0v1 com.bpjstku.util.constant.AsikPointer[]) STATIC call: kotlin.enums.EnumEntriesKt.enumEntries(java.lang.Enum[]):kotlin.enums.EnumEntries A[MD:<E extends java.lang.Enum<E>>:(E extends java.lang.Enum<E>[]):kotlin.enums.EnumEntries<E extends java.lang.Enum<E>> (m)]
	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
	at jadx.core.utils.InsnRemover.removeAllAndUnbind(InsnRemover.java:257)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:187)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\b\u0086\u0001\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002B\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\r\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\r\u001a\u00020\f2\u0006\u0010\u0004\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0007¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\u00038\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012j\u0002\b\u0013j\u0002\b\u0014"}, d2 = {"Lcom/bpjstku/util/constant/AsikPointer;", "Landroid/os/Parcelable;", "", "", "p0", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "p1", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "type", "Ljava/lang/String;", "getType", "()Ljava/lang/String;", "b", "TuitionPaymentFragmentspecialinlinedviewModeldefault3"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class AsikPointer implements Parcelable {
    MENU("menu"),
    KLAIM("klaim");

    public static final Parcelable.Creator<AsikPointer> CREATOR;
    private final String type;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    private AsikPointer(String str) {
        super(str, i);
        this.type = str;
    }

    public final String getType() {
        return this.type;
    }

    static {
        EnumEntriesKt.enumEntries(asikPointerArr);
        CREATOR = new Parcelable.Creator<AsikPointer>() { // from class: com.bpjstku.util.constant.AsikPointer.TuitionPaymentFragmentspecialinlinedviewModeldefault1
            private static final byte[] $$c = {57, -56, 23, -36};
            private static final int $$f = 167;
            private static int $10 = 0;
            private static int $11 = 1;
            private static final byte[] $$d = {101, 89, 94, -73, -3, 26, -37, 48, 21, 8, 7, 0, 35, -33, 45, 0, 12, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -55};
            private static final int $$e = 231;
            private static final byte[] $$a = {117, -15, -81, 1, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -54, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -55, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, -7, 18, 16, 1, 16, 16, 4, -19, 48, 3, 17, 0, 30, -4, 24, -54};
            private static final int $$b = 45;
            private static int TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
            private static int TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 1;
            private static char[] TuitionPaymentFragmentbindingInflater1 = {60090, 60073, 60088, 60094, 60041, 60058, 60050, 60053, 60040, 60047, 60049, 60062, 60054, 60045, 60036, 60095, 60055, 60046, 60052, 60035, 60051, 60072, 60048, 60079, 60032, 60060, 60117, 60063, 60043, 60083, 60093, 60034, 60037, 60056, 60092, 60033};
            private static char b = 57191;

            /* JADX WARN: Code duplicated, block: B:10:0x0025  */
            /* JADX WARN: Code duplicated, block: B:8:0x001d  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002c). Please report as a decompilation issue!!! */
            /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0025
                	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                */
            private static void a(short r7, int r8, int r9, java.lang.Object[] r10) {
                /*
                    int r8 = r8 * 4
                    int r8 = 84 - r8
                    int r9 = r9 * 15
                    int r9 = 53 - r9
                    int r7 = r7 + 4
                    byte[] r0 = com.bpjstku.util.constant.AsikPointer.TuitionPaymentFragmentspecialinlinedviewModeldefault1.$$a
                    byte[] r1 = new byte[r9]
                    r2 = 0
                    if (r0 != 0) goto L15
                    r3 = r8
                    r4 = r2
                    r8 = r7
                    goto L2c
                L15:
                    r3 = r2
                L16:
                    int r4 = r3 + 1
                    byte r5 = (byte) r8
                    r1[r3] = r5
                    if (r4 != r9) goto L25
                    java.lang.String r7 = new java.lang.String
                    r7.<init>(r1, r2)
                    r10[r2] = r7
                    return
                L25:
                    int r7 = r7 + 1
                    r3 = r0[r7]
                    r6 = r8
                    r8 = r7
                    r7 = r6
                L2c:
                    int r7 = r7 + r3
                    int r7 = r7 + (-11)
                    r3 = r4
                    r6 = r8
                    r8 = r7
                    r7 = r6
                    goto L16
                */
                throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.util.constant.AsikPointer.TuitionPaymentFragmentspecialinlinedviewModeldefault1.a(short, int, int, java.lang.Object[]):void");
            }

            /* JADX WARN: Code duplicated, block: B:10:0x0026  */
            /* JADX WARN: Code duplicated, block: B:8:0x001e  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x0028). Please report as a decompilation issue!!! */
            /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0026
                	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                */
            private static void d(int r5, int r6, short r7, java.lang.Object[] r8) {
                /*
                    int r7 = r7 * 31
                    int r7 = r7 + 84
                    int r5 = r5 * 13
                    int r5 = 17 - r5
                    byte[] r0 = com.bpjstku.util.constant.AsikPointer.TuitionPaymentFragmentspecialinlinedviewModeldefault1.$$d
                    int r6 = r6 * 39
                    int r6 = 53 - r6
                    byte[] r1 = new byte[r6]
                    r2 = 0
                    if (r0 != 0) goto L16
                    r4 = r6
                    r3 = r2
                    goto L28
                L16:
                    r3 = r2
                L17:
                    byte r4 = (byte) r7
                    r1[r3] = r4
                    int r3 = r3 + 1
                    if (r3 != r6) goto L26
                    java.lang.String r5 = new java.lang.String
                    r5.<init>(r1, r2)
                    r8[r2] = r5
                    return
                L26:
                    r4 = r0[r5]
                L28:
                    int r7 = r7 + r4
                    int r7 = r7 + (-11)
                    int r5 = r5 + 1
                    goto L17
                */
                throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.util.constant.AsikPointer.TuitionPaymentFragmentspecialinlinedviewModeldefault1.d(int, int, short, java.lang.Object[]):void");
            }

            /* JADX WARN: Code duplicated, block: B:36:0x013a  */
            /* JADX WARN: Code duplicated, block: B:37:0x0153  */
            /* JADX WARN: Code duplicated, block: B:40:0x01a0 A[Catch: all -> 0x036b, TryCatch #0 {all -> 0x036b, blocks: (B:7:0x0022, B:9:0x0030, B:10:0x0060, B:17:0x0095, B:19:0x00a8, B:20:0x00da, B:38:0x0155, B:40:0x01a0, B:41:0x0214, B:45:0x0229, B:47:0x0264, B:49:0x02d2), top: B:68:0x0022 }] */
            /* JADX WARN: Code duplicated, block: B:44:0x0227  */
            /* JADX WARN: Code duplicated, block: B:47:0x0264 A[Catch: all -> 0x036b, TryCatch #0 {all -> 0x036b, blocks: (B:7:0x0022, B:9:0x0030, B:10:0x0060, B:17:0x0095, B:19:0x00a8, B:20:0x00da, B:38:0x0155, B:40:0x01a0, B:41:0x0214, B:45:0x0229, B:47:0x0264, B:49:0x02d2), top: B:68:0x0022 }] */
            /* JADX WARN: Code duplicated, block: B:48:0x02cf  */
            /* JADX WARN: Code duplicated, block: B:51:0x02f3  */
            /* JADX WARN: Code duplicated, block: B:53:0x02fd  */
            /* JADX WARN: Code duplicated, block: B:54:0x0325  */
            private static void c(char[] cArr, byte b2, int i, Object[] objArr) throws Throwable {
                int i2;
                Object obj;
                Object[] objArr2;
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3;
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4;
                int i3 = 2 % 2;
                deInitSession deinitsession = new deInitSession();
                char[] cArr2 = TuitionPaymentFragmentbindingInflater1;
                int i4 = 1770390596;
                char c = '0';
                Object obj2 = null;
                int i5 = 8;
                if (cArr2 != null) {
                    int length = cArr2.length;
                    char[] cArr3 = new char[length];
                    int i6 = 0;
                    while (i6 < length) {
                        try {
                            Object[] objArr3 = {Integer.valueOf(cArr2[i6])};
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(i4);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                                byte b3 = (byte) 0;
                                byte b4 = b3;
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (ViewConfiguration.getTouchSlop() >> i5), 2266 - TextUtils.lastIndexOf("", c), 33 - (ViewConfiguration.getLongPressTimeout() >> 16), -1927765101, false, $$g(b3, b4, b4), new Class[]{Integer.TYPE});
                            }
                            cArr3[i6] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr3)).charValue();
                            i6++;
                            int i7 = $11 + 21;
                            $10 = i7 % 128;
                            int i8 = i7 % 2;
                            i4 = 1770390596;
                            c = '0';
                            i5 = 8;
                        } catch (Throwable th) {
                            Throwable cause = th.getCause();
                            if (cause == null) {
                                throw th;
                            }
                            throw cause;
                        }
                    }
                    int i9 = $11 + 51;
                    $10 = i9 % 128;
                    if (i9 % 2 != 0) {
                        int i10 = 2 % 3;
                    }
                    cArr2 = cArr3;
                }
                Object[] objArr4 = {Integer.valueOf(b)};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1770390596);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    byte b5 = (byte) 0;
                    byte b6 = b5;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) ((-1) - TextUtils.lastIndexOf("", '0')), Color.rgb(0, 0, 0) + 16779483, ExpandableListView.getPackedPositionGroup(0L) + 33, -1927765101, false, $$g(b5, b6, b6), new Class[]{Integer.TYPE});
                }
                char cCharValue = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr4)).charValue();
                char[] cArr4 = new char[i];
                if (i % 2 != 0) {
                    int i11 = $11 + 1;
                    $10 = i11 % 128;
                    int i12 = i11 % 2;
                    i2 = i - 1;
                    cArr4[i2] = (char) (cArr[i2] - b2);
                } else {
                    i2 = i;
                }
                if (i2 > 1) {
                    deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
                    while (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 < i2) {
                        int i13 = $10 + 113;
                        $11 = i13 % 128;
                        if (i13 % 2 == 0) {
                            deinitsession.b = cArr[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3];
                            deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = cArr[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3];
                            if (deinitsession.b == deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                                cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = (char) (deinitsession.b - b2);
                                cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = (char) (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault2 - b2);
                                obj = obj2;
                            } else {
                                objArr2 = new Object[]{deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession};
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(486174475);
                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                                    char cRed = (char) (49267 - Color.red(0));
                                    int scrollDefaultDelay = (ViewConfiguration.getScrollDefaultDelay() >> 16) + 3261;
                                    int iResolveOpacity = 30 - Drawable.resolveOpacity(0, 0);
                                    byte b7 = (byte) ($$f & 1);
                                    byte b8 = (byte) (b7 - 1);
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cRed, scrollDefaultDelay, iResolveOpacity, -127612708, false, $$g(b7, b8, b8), new Class[]{Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class});
                                }
                                if (((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).intValue() == deinitsession.asBinder) {
                                    Object[] objArr5 = {deinitsession, deinitsession, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), deinitsession, Integer.valueOf(cCharValue), deinitsession};
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1187000607);
                                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                        char cLastIndexOf = (char) (22877 - TextUtils.lastIndexOf("", '0'));
                                        int packedPositionChild = ExpandableListView.getPackedPositionChild(0L) + 595;
                                        int maximumFlingVelocity = 17 - (ViewConfiguration.getMaximumFlingVelocity() >> 16);
                                        byte b9 = (byte) ($$f & 11);
                                        byte b10 = (byte) (b9 - 3);
                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cLastIndexOf, packedPositionChild, maximumFlingVelocity, 1570859318, false, $$g(b9, b10, b10), new Class[]{Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Integer.TYPE, Object.class});
                                    }
                                    obj = null;
                                    int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr5)).intValue();
                                    int i14 = (deinitsession.TuitionPaymentFragmentbindingInflater1 * cCharValue) + deinitsession.asBinder;
                                    cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr2[iIntValue];
                                    cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = cArr2[i14];
                                } else {
                                    obj = null;
                                    if (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault1 == deinitsession.TuitionPaymentFragmentbindingInflater1) {
                                        deinitsession.g = ((deinitsession.g + cCharValue) - 1) % cCharValue;
                                        deinitsession.asBinder = ((deinitsession.asBinder + cCharValue) - 1) % cCharValue;
                                        int i15 = (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault1 * cCharValue) + deinitsession.g;
                                        int i16 = (deinitsession.TuitionPaymentFragmentbindingInflater1 * cCharValue) + deinitsession.asBinder;
                                        cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr2[i15];
                                        cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = cArr2[i16];
                                    } else {
                                        int i17 = (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault1 * cCharValue) + deinitsession.asBinder;
                                        int i18 = (deinitsession.TuitionPaymentFragmentbindingInflater1 * cCharValue) + deinitsession.g;
                                        cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr2[i17];
                                        cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = cArr2[i18];
                                    }
                                }
                            }
                        } else {
                            deinitsession.b = cArr[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3];
                            deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = cArr[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1];
                            if (deinitsession.b == deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                                cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = (char) (deinitsession.b - b2);
                                cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = (char) (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault2 - b2);
                                obj = obj2;
                            } else {
                                objArr2 = new Object[]{deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession};
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(486174475);
                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                                    char cRed2 = (char) (49267 - Color.red(0));
                                    int scrollDefaultDelay2 = (ViewConfiguration.getScrollDefaultDelay() >> 16) + 3261;
                                    int iResolveOpacity2 = 30 - Drawable.resolveOpacity(0, 0);
                                    byte b11 = (byte) ($$f & 1);
                                    byte b12 = (byte) (b11 - 1);
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cRed2, scrollDefaultDelay2, iResolveOpacity2, -127612708, false, $$g(b11, b12, b12), new Class[]{Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class});
                                }
                                if (((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).intValue() == deinitsession.asBinder) {
                                    Object[] objArr6 = {deinitsession, deinitsession, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), deinitsession, Integer.valueOf(cCharValue), deinitsession};
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1187000607);
                                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                        char cLastIndexOf2 = (char) (22877 - TextUtils.lastIndexOf("", '0'));
                                        int packedPositionChild2 = ExpandableListView.getPackedPositionChild(0L) + 595;
                                        int maximumFlingVelocity2 = 17 - (ViewConfiguration.getMaximumFlingVelocity() >> 16);
                                        byte b13 = (byte) ($$f & 11);
                                        byte b14 = (byte) (b13 - 3);
                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cLastIndexOf2, packedPositionChild2, maximumFlingVelocity2, 1570859318, false, $$g(b13, b14, b14), new Class[]{Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Integer.TYPE, Object.class});
                                    }
                                    obj = null;
                                    int iIntValue2 = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr6)).intValue();
                                    int i19 = (deinitsession.TuitionPaymentFragmentbindingInflater1 * cCharValue) + deinitsession.asBinder;
                                    cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr2[iIntValue2];
                                    cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = cArr2[i19];
                                } else {
                                    obj = null;
                                    if (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault1 == deinitsession.TuitionPaymentFragmentbindingInflater1) {
                                        deinitsession.g = ((deinitsession.g + cCharValue) - 1) % cCharValue;
                                        deinitsession.asBinder = ((deinitsession.asBinder + cCharValue) - 1) % cCharValue;
                                        int i110 = (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault1 * cCharValue) + deinitsession.g;
                                        int i111 = (deinitsession.TuitionPaymentFragmentbindingInflater1 * cCharValue) + deinitsession.asBinder;
                                        cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr2[i110];
                                        cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = cArr2[i111];
                                    } else {
                                        int i112 = (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault1 * cCharValue) + deinitsession.asBinder;
                                        int i113 = (deinitsession.TuitionPaymentFragmentbindingInflater1 * cCharValue) + deinitsession.g;
                                        cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr2[i112];
                                        cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = cArr2[i113];
                                    }
                                }
                            }
                        }
                        deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 += 2;
                        obj2 = obj;
                    }
                }
                for (int i20 = 0; i20 < i; i20++) {
                    cArr4[i20] = (char) (cArr4[i20] ^ 13722);
                }
                objArr[0] = new String(cArr4);
                int i21 = $10 + 117;
                $11 = i21 % 128;
                if (i21 % 2 == 0) {
                    int i22 = 0 / 0;
                }
            }

            /* JADX WARN: Code duplicated, block: B:22:0x0216  */
            private AsikPointer TuitionPaymentFragmentspecialinlinedviewModeldefault1(Parcel parcel) throws Throwable {
                Object[] objArr;
                char c;
                int i = 2 % 2;
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(797565291);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    char jumpTapTimeout = (char) (ViewConfiguration.getJumpTapTimeout() >> 16);
                    int mode = View.MeasureSpec.getMode(0) + 2267;
                    int iArgb = 33 - Color.argb(0, 0, 0, 0);
                    byte[] bArr = $$a;
                    byte b2 = bArr[5];
                    byte b3 = bArr[7];
                    Object[] objArr2 = new Object[1];
                    a(b2, b3, b3, objArr2);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(jumpTapTimeout, mode, iArgb, -887667012, false, (String) objArr2[0], null);
                }
                long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
                Object[] objArr3 = new Object[1];
                c(new char[]{1, 11, 28, 3, 24, '\f', 28, 27, 20, 6, 27, 20, ' ', 7, '\n', 6, 14, 0, '\f', 22, Typography.quote, 21}, (byte) (54 - (ViewConfiguration.getKeyRepeatDelay() >> 16)), TextUtils.lastIndexOf("", '0', 0) + 23, objArr3);
                Class<?> cls = Class.forName((String) objArr3[0]);
                Object[] objArr4 = new Object[1];
                c(new char[]{'\n', 17, 4, 29, '\t', 6, 25, 3, 17, 11, 15, '\n', '\f', 18, 13949}, (byte) (View.MeasureSpec.getSize(0) + 126), 14 - ImageFormat.getBitsPerPixel(0), objArr4);
                long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(796641770);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                    char size = (char) View.MeasureSpec.getSize(0);
                    int packedPositionChild = 2266 - ExpandableListView.getPackedPositionChild(0L);
                    int i2 = 34 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1));
                    byte b4 = $$a[7];
                    Object[] objArr5 = new Object[1];
                    a((byte) 51, b4, b4, objArr5);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(size, packedPositionChild, i2, -874156483, false, (String) objArr5[0], null);
                }
                if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
                    int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 67;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i3 % 128;
                    int i4 = i3 % 2;
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1013250600);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                        char cMyTid = (char) (Process.myTid() >> 22);
                        int iKeyCodeFromString = KeyEvent.keyCodeFromString("") + 2267;
                        int touchSlop = 33 - (ViewConfiguration.getTouchSlop() >> 8);
                        byte[] bArr2 = $$a;
                        Object[] objArr6 = new Object[1];
                        a((byte) 103, bArr2[7], bArr2[3], objArr6);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(cMyTid, iKeyCodeFromString, touchSlop, -654680577, false, (String) objArr6[0], null);
                    }
                    Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
                    objArr = new Object[]{new int[]{i}, strArr, new int[1], new int[]{i}};
                    int i5 = ((int[]) objArr7[0])[0];
                    int i6 = ((int[]) objArr7[3])[0];
                    String[] strArr = (String[]) objArr7[1];
                    int iIdentityHashCode = System.identityHashCode(this);
                    int i7 = (((2086067545 + (((~((~iIdentityHashCode) | (-253825025))) | (~((-5244333) | iIdentityHashCode))) * (-302))) + ((~((-253825025) | iIdentityHashCode)) * (-604))) + (((~(iIdentityHashCode | (-259069357))) | (-1073027005)) * 302)) - 710574556;
                    int i8 = (i7 << 13) ^ i7;
                    int i9 = i8 ^ (i8 >>> 17);
                    ((int[]) objArr[2])[0] = i9 ^ (i9 << 5);
                    c = 3;
                } else {
                    Object[] objArr8 = new Object[1];
                    c(new char[]{1, 11, 28, 3, 24, '\f', 28, 27, 4, 29, 29, 27, 3, 30, '\n', 7, '\f', 7, 7, '!', 18, 21, 5, '\n', 3, 29}, (byte) (67 - ExpandableListView.getPackedPositionGroup(0L)), (ViewConfiguration.getEdgeSlop() >> 16) + 26, objArr8);
                    Class<?> cls2 = Class.forName((String) objArr8[0]);
                    Object[] objArr9 = new Object[1];
                    c(new char[]{'#', 15, 13917, 13917, 6, '\b', 6, 3, 13919, 13919, '\f', '\n', '#', 3, '\n', 7, 19, 6}, (byte) (116 - TextUtils.lastIndexOf("", '0')), View.MeasureSpec.makeMeasureSpec(0, 0) + 18, objArr9);
                    Context applicationContext = (Context) cls2.getMethod((String) objArr9[0], new Class[0]).invoke(null, null);
                    if (applicationContext != null) {
                        if (applicationContext instanceof ContextWrapper) {
                            int i10 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 9;
                            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i10 % 128;
                            int i11 = i10 % 2;
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
                    c(new char[]{11, 4, 17, 1, 28, 14, 1, 11, 26, 27, 19, '!', '\t', '\n', 6, 17}, (byte) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 49), 16 - TextUtils.indexOf("", ""), objArr10);
                    Class<?> cls3 = Class.forName((String) objArr10[0]);
                    Object[] objArr11 = new Object[1];
                    c(new char[]{'\t', 24, 6, '\b', '\n', 7, 7, '!', '#', 11, 14, 26, 0, 20, 29, '\t'}, (byte) ((ViewConfiguration.getKeyRepeatTimeout() >> 16) + 121), (Process.myTid() >> 22) + 16, objArr11);
                    int iIntValue = ((Integer) cls3.getMethod((String) objArr11[0], Object.class).invoke(null, this)).intValue();
                    int i12 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 17;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i12 % 128;
                    int i13 = i12 % 2;
                    try {
                        Object[] objArr12 = {applicationContext, Integer.valueOf(iIntValue), 0, -710574556};
                        byte[] bArr3 = $$d;
                        byte b5 = (byte) (-bArr3[18]);
                        byte b6 = b5;
                        Object[] objArr13 = new Object[1];
                        d(b5, b6, b6, objArr13);
                        Class<?> cls4 = Class.forName((String) objArr13[0]);
                        byte b7 = bArr3[11];
                        byte b8 = b7;
                        Object[] objArr14 = new Object[1];
                        d(b7, b8, b8, objArr14);
                        Object[] objArr15 = (Object[]) cls4.getMethod((String) objArr14[0], Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr12);
                        if (applicationContext != null) {
                            int i14 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 59;
                            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i14 % 128;
                            int i15 = i14 % 2;
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1013250600);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                                char cNormalizeMetaState = (char) KeyEvent.normalizeMetaState(0);
                                int absoluteGravity = 2267 - Gravity.getAbsoluteGravity(0, 0);
                                int iLastIndexOf = 32 - TextUtils.lastIndexOf("", '0');
                                byte[] bArr4 = $$a;
                                Object[] objArr16 = new Object[1];
                                a((byte) 103, bArr4[7], bArr4[3], objArr16);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(cNormalizeMetaState, absoluteGravity, iLastIndexOf, -654680577, false, (String) objArr16[0], null);
                            }
                            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr15);
                            try {
                                Object[] objArr17 = new Object[1];
                                c(new char[]{1, 11, 28, 3, 24, '\f', 28, 27, 20, 6, 27, 20, ' ', 7, '\n', 6, 14, 0, '\f', 22, Typography.quote, 21}, (byte) ((Process.myTid() >> 22) + 54), 22 - Gravity.getAbsoluteGravity(0, 0), objArr17);
                                Class<?> cls5 = Class.forName((String) objArr17[0]);
                                Object[] objArr18 = new Object[1];
                                c(new char[]{'\n', 17, 4, 29, '\t', 6, 25, 3, 17, 11, 15, '\n', '\f', 18, 13949}, (byte) (126 - Color.red(0)), (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 15, objArr18);
                                long jLongValue2 = ((Long) cls5.getDeclaredMethod((String) objArr18[0], new Class[0]).invoke(null, new Object[0])).longValue();
                                Long lValueOf = Long.valueOf(jLongValue2);
                                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(796641770);
                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                                    char longPressTimeout = (char) (ViewConfiguration.getLongPressTimeout() >> 16);
                                    int iAlpha = 2267 - Color.alpha(0);
                                    int i16 = 34 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1));
                                    byte b9 = $$a[7];
                                    Object[] objArr19 = new Object[1];
                                    a((byte) 51, b9, b9, objArr19);
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(longPressTimeout, iAlpha, i16, -874156483, false, (String) objArr19[0], null);
                                }
                                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                                Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(797565291);
                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                                    char c2 = (char) (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1));
                                    int bitsPerPixel = ImageFormat.getBitsPerPixel(0) + 2268;
                                    int iMyTid = (Process.myTid() >> 22) + 33;
                                    byte[] bArr5 = $$a;
                                    byte b10 = bArr5[5];
                                    byte b11 = bArr5[7];
                                    Object[] objArr20 = new Object[1];
                                    a(b10, b11, b11, objArr20);
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(c2, bitsPerPixel, iMyTid, -887667012, false, (String) objArr20[0], null);
                                }
                                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf2);
                            } catch (Exception unused) {
                                throw new RuntimeException();
                            }
                        }
                        objArr = objArr15;
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
                if (i18 != i17) {
                    ArrayList arrayList = new ArrayList();
                    String[] strArr2 = (String[]) objArr[1];
                    if (strArr2 != null) {
                        for (String str : strArr2) {
                            arrayList.add(str);
                        }
                    }
                    throw new RuntimeException(String.valueOf(i18));
                }
                int i19 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 79;
                TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i19 % 128;
                int i20 = i19 % 2;
                Object[] objArr21 = {new int[]{i}, strArr, new int[1], new int[]{i}};
                int i21 = ((int[]) objArr[2])[0];
                int i22 = ((int[]) objArr[0])[0];
                int i23 = ((int[]) objArr[3])[0];
                String[] strArr3 = (String[]) objArr[1];
                int iIdentityHashCode2 = System.identityHashCode(this);
                int i24 = i21 + (((~((-1022038054) | iIdentityHashCode2)) | 212013057) * (-283)) + 678866302 + ((~(iIdentityHashCode2 | (-810024997))) * 283);
                int i25 = i24 ^ (i24 << 13);
                int i26 = i25 ^ (i25 >>> 17);
                Object obj = objArr21[2];
                ((int[]) obj)[0] = i26 ^ (i26 << 5);
                int i27 = ((int[]) obj)[0];
                int i28 = i27 * i27;
                int i29 = -(1995224865 * i27);
                int i30 = ((((i28 | i29) << 1) - (i28 ^ i29)) - (~(-(i27 * (-1694225857))))) - 1;
                int i31 = (i30 & (-2036696832)) + ((-2036696832) | i30);
                int i32 = i31 >> 17;
                int i33 = (i32 - 65535) / 32768;
                int i34 = ((i33 | 1) << 1) - (i33 ^ 1);
                int i35 = -(((i31 ^ i34) + ((i31 & i34) << 1)) ^ ((((((-65535) | i32) << 1) - (i32 ^ (-65535))) / 32768) + 1));
                int i36 = (i35 ^ 9) + ((i35 & 9) << 1);
                int i37 = i36 >> 23;
                int i38 = ((i37 & (-1023)) + (i37 | (-1023))) / 512;
                Intrinsics.checkNotNullParameter(parcel, "23;11;parcel".substring(94176 / (((-(((i38 ^ 1) + ((i38 & 1) << 1)) + 1)) & i36) * 1744)));
                return AsikPointer.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final /* synthetic */ AsikPointer[] newArray(int i) {
                int i2 = 2 % 2;
                int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 51;
                TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3 % 128;
                if (i3 % 2 == 0) {
                    return new AsikPointer[i];
                }
                int i4 = 97 / 0;
                return new AsikPointer[i];
            }

            @Override // android.os.Parcelable.Creator
            public final /* synthetic */ AsikPointer createFromParcel(Parcel parcel) throws Throwable {
                int i = 2 % 2;
                int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 105;
                TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
                int i3 = i2 % 2;
                AsikPointer asikPointerTuitionPaymentFragmentspecialinlinedviewModeldefault1 = TuitionPaymentFragmentspecialinlinedviewModeldefault1(parcel);
                int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 53;
                TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i4 % 128;
                if (i4 % 2 == 0) {
                    return asikPointerTuitionPaymentFragmentspecialinlinedviewModeldefault1;
                }
                throw null;
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
            private static java.lang.String $$g(byte r6, short r7, byte r8) {
                /*
                    int r7 = r7 * 3
                    int r7 = 1 - r7
                    int r8 = r8 * 4
                    int r8 = 3 - r8
                    byte[] r0 = com.bpjstku.util.constant.AsikPointer.TuitionPaymentFragmentspecialinlinedviewModeldefault1.$$c
                    int r6 = r6 + 113
                    byte[] r1 = new byte[r7]
                    r2 = 0
                    if (r0 != 0) goto L15
                    r4 = r7
                    r6 = r8
                    r3 = r2
                    goto L2a
                L15:
                    r3 = r2
                    r5 = r8
                    r8 = r6
                    r6 = r5
                L19:
                    byte r4 = (byte) r8
                    r1[r3] = r4
                    int r3 = r3 + 1
                    int r6 = r6 + 1
                    if (r3 != r7) goto L28
                    java.lang.String r6 = new java.lang.String
                    r6.<init>(r1, r2)
                    return r6
                L28:
                    r4 = r0[r6]
                L2a:
                    int r4 = -r4
                    int r8 = r8 + r4
                    goto L19
                */
                throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.util.constant.AsikPointer.TuitionPaymentFragmentspecialinlinedviewModeldefault1.$$g(byte, short, byte):java.lang.String");
            }
        };
    }

    public static AsikPointer valueOf(String str) {
        return (AsikPointer) Enum.valueOf(AsikPointer.class, str);
    }

    public static AsikPointer[] values() {
        return (AsikPointer[]) TuitionPaymentFragmentspecialinlinedviewModeldefault2.clone();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel p0, int p1) {
        Intrinsics.checkNotNullParameter(p0, "");
        p0.writeString(name());
    }
}
