package com.karumi.dexter.listener.single;

import android.app.AlertDialog;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.DialogInterface;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.Toast;
import com.karumi.dexter.listener.PermissionDeniedResponse;
import defpackage.deInitSession;
import defpackage.initSession;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Random;
import kotlin.text.Typography;

/* JADX INFO: loaded from: classes4.dex */
public class DialogOnDeniedPermissionListener extends BasePermissionListener {
    private final Context context;
    private final Drawable icon;
    private final String message;
    private final String positiveButtonText;
    private final String title;

    private DialogOnDeniedPermissionListener(Context context, String str, String str2, String str3, Drawable drawable) {
        this.context = context;
        this.title = str;
        this.message = str2;
        this.positiveButtonText = str3;
        this.icon = drawable;
    }

    @Override // com.karumi.dexter.listener.single.BasePermissionListener, com.karumi.dexter.listener.single.PermissionListener
    public void onPermissionDenied(PermissionDeniedResponse permissionDeniedResponse) {
        super.onPermissionDenied(permissionDeniedResponse);
        new AlertDialog.Builder(this.context).setTitle(this.title).setMessage(this.message).setPositiveButton(this.positiveButtonText, new DialogInterface.OnClickListener() { // from class: com.karumi.dexter.listener.single.DialogOnDeniedPermissionListener.1
            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.dismiss();
            }
        }).setIcon(this.icon).show();
    }

    public static class Builder {
        private String buttonText;
        private final Context context;
        private Drawable icon;
        private String message;
        private String title;
        private static final byte[] $$c = {49, -45, -112, 57};
        private static final int $$f = 72;
        private static int $10 = 0;
        private static int $11 = 1;
        private static final byte[] $$d = {58, 66, -14, -31, -6, 65, -68, 13, 4, -2, -17, 11, -13, 17, -19, 74, -59, -5, -6, 15, -13, 4, 13, -11, 62, -56, -15, 7, 11, -17, 11, -6, 1, -5, 69, -24, -47, 7, 11, -17, 11, -6, 1, -5, 79, -79, 14, 4, -17, 15, -5, -33, 12, -11, 11, -6, 1, 30, -17, -24, 12, 8, -9, -6, 46, -44, 17, -6, -6, 8, -9, -6, 1, 3, 11, 2, -6, 8, -11, 3, -5, 2, 3, -5, 9, 1, -18, 13, 4, -18, 42, -34, 11, -1, -7, 8, -1, -1, 5, -20, 9, -8, 65};
        private static final int $$e = 20;
        private static final byte[] $$a = {33, -59, 107, -108, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -56};
        private static final int $$b = 46;
        private static int TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
        private static int TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 1;
        private static char[] TuitionPaymentFragmentbindingInflater1 = {57184, 60040, 60041, 60043, 60053, 60073, 57186, 57192, 60072, 60051, 60045, 60060, 60063, 57189, 57190, 60047, 60034, 60056, 60046, 60050, 60079, 60062, 57191, 60088, 60049, 60083, 60117, 57193, 60090, 57187, 60058, 60055, 60054, 57188, 60052, 60048};
        private static char TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 57191;

        /* JADX WARN: Code duplicated, block: B:10:0x0023  */
        /* JADX WARN: Code duplicated, block: B:8:0x001b  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x002a). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0023
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        private static void a(short r6, byte r7, int r8, java.lang.Object[] r9) {
            /*
                byte[] r0 = com.karumi.dexter.listener.single.DialogOnDeniedPermissionListener.Builder.$$a
                int r8 = r8 + 84
                int r6 = r6 * 52
                int r1 = r6 + 1
                int r7 = r7 + 4
                byte[] r1 = new byte[r1]
                r2 = 0
                if (r0 != 0) goto L13
                r4 = r6
                r8 = r7
                r3 = r2
                goto L2a
            L13:
                r3 = r2
            L14:
                byte r4 = (byte) r8
                r1[r3] = r4
                int r7 = r7 + 1
                if (r3 != r6) goto L23
                java.lang.String r6 = new java.lang.String
                r6.<init>(r1, r2)
                r9[r2] = r6
                return
            L23:
                int r3 = r3 + 1
                r4 = r0[r7]
                r5 = r8
                r8 = r7
                r7 = r5
            L2a:
                int r7 = r7 + r4
                int r7 = r7 + (-11)
                r5 = r8
                r8 = r7
                r7 = r5
                goto L14
            */
            throw new UnsupportedOperationException("Method not decompiled: com.karumi.dexter.listener.single.DialogOnDeniedPermissionListener.Builder.a(short, byte, int, java.lang.Object[]):void");
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
        private static void c(byte r6, short r7, short r8, java.lang.Object[] r9) {
            /*
                int r8 = r8 * 21
                int r8 = 105 - r8
                int r6 = r6 * 47
                int r6 = 51 - r6
                int r7 = r7 * 5
                int r0 = r7 + 48
                byte[] r1 = com.karumi.dexter.listener.single.DialogOnDeniedPermissionListener.Builder.$$d
                byte[] r0 = new byte[r0]
                int r7 = r7 + 47
                r2 = 0
                if (r1 != 0) goto L18
                r3 = r7
                r4 = r2
                goto L2d
            L18:
                r3 = r2
            L19:
                byte r4 = (byte) r8
                r0[r3] = r4
                int r4 = r3 + 1
                if (r3 != r7) goto L28
                java.lang.String r6 = new java.lang.String
                r6.<init>(r0, r2)
                r9[r2] = r6
                return
            L28:
                r3 = r1[r6]
                r5 = r3
                r3 = r8
                r8 = r5
            L2d:
                int r8 = -r8
                int r6 = r6 + 1
                int r8 = r8 + r3
                r3 = r4
                goto L19
            */
            throw new UnsupportedOperationException("Method not decompiled: com.karumi.dexter.listener.single.DialogOnDeniedPermissionListener.Builder.c(byte, short, short, java.lang.Object[]):void");
        }

        public Builder withIcon(Drawable drawable) throws Throwable {
            Object[] objArr;
            char c = 2;
            int i = 2 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-342512172);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                char keyRepeatDelay = (char) (ViewConfiguration.getKeyRepeatDelay() >> 16);
                int iRgb = (-16776340) - Color.rgb(0, 0, 0);
                int minimumFlingVelocity = (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 10;
                byte[] bArr = $$a;
                byte b = bArr[7];
                byte b2 = bArr[5];
                Object[] objArr2 = new Object[1];
                a(b, b2, (byte) (b2 & 14), objArr2);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(keyRepeatDelay, iRgb, minimumFlingVelocity, 252381699, false, (String) objArr2[0], null);
            }
            long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
            Object[] objArr3 = new Object[1];
            b(new char[]{Typography.quote, 0, 14, 0, 31, 22, 14, 24, 31, 4, ' ', 14, '\r', 4, 21, 27, '#', 20, ' ', '#', 23, 5}, (byte) (109 - (ViewConfiguration.getFadingEdgeLength() >> 16)), 22 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), objArr3);
            Class<?> cls = Class.forName((String) objArr3[0]);
            Object[] objArr4 = new Object[1];
            b(new char[]{19, '!', '!', 0, 3, 19, 17, 0, 18, '!', '!', '\r', 20, 31, 13869}, (byte) (46 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1))), (ViewConfiguration.getTouchSlop() >> 8) + 15, objArr4);
            long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1823069286);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                char c2 = (char) (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
                int mirror = 924 - AndroidCharacter.getMirror('0');
                int fadingEdgeLength = (ViewConfiguration.getFadingEdgeLength() >> 16) + 10;
                byte[] bArr2 = $$a;
                byte b3 = bArr2[5];
                Object[] objArr5 = new Object[1];
                a((byte) (-b3), b3, bArr2[7], objArr5);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(c2, mirror, fadingEdgeLength, 2009631821, false, (String) objArr5[0], null);
            }
            if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
                int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 49;
                TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
                int i3 = i2 % 2;
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-337894567);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    char scrollBarSize = (char) (ViewConfiguration.getScrollBarSize() >> 8);
                    int i4 = 877 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1));
                    int iResolveOpacity = 10 - Drawable.resolveOpacity(0, 0);
                    byte[] bArr3 = $$a;
                    byte b4 = bArr3[7];
                    Object[] objArr6 = new Object[1];
                    a(b4, (byte) (b4 | 51), bArr3[54], objArr6);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(scrollBarSize, i4, iResolveOpacity, 256017550, false, (String) objArr6[0], null);
                }
                Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
                objArr = new Object[]{new int[]{((int[]) objArr7[0])[0]}, new int[1], new int[]{((int[]) objArr7[2])[0]}, (String[]) objArr7[3]};
                int iNextInt = new Random().nextInt(1458854770);
                int i5 = 583401485 + (((~(iNextInt | (-821675923))) | 861986151) * 191) + (((~((~iNextInt) | (-821675923))) | 811648258) * 191) + 232034100;
                int i6 = (i5 << 13) ^ i5;
                int i7 = i6 ^ (i6 >>> 17);
                ((int[]) objArr[1])[0] = i7 ^ (i7 << 5);
            } else {
                Object[] objArr8 = new Object[1];
                b(new char[]{Typography.quote, 0, 14, 0, 31, 22, 14, 24, '!', 0, 2, 27, 29, 16, '\r', 21, 7, 22, 16, 17, 21, '\b', 3, 20, 0, 18}, (byte) (KeyEvent.normalizeMetaState(0) + 102), 26 - View.resolveSizeAndState(0, 0, 0), objArr8);
                Class<?> cls2 = Class.forName((String) objArr8[0]);
                Object[] objArr9 = new Object[1];
                b(new char[]{'\f', 23, 13805, 13805, 22, 3, 16, 27, 13807, 13807, 1, 25, '\f', '#', '\r', 21, 4, '\n'}, (byte) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 6), 18 - TextUtils.getOffsetBefore("", 0), objArr9);
                Context applicationContext = (Context) cls2.getMethod((String) objArr9[0], new Class[0]).invoke(null, null);
                if (applicationContext != null) {
                    int i8 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 85;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i8 % 128;
                    int i9 = i8 % 2;
                    applicationContext = (((applicationContext instanceof ContextWrapper) ^ true) || ((ContextWrapper) applicationContext).getBaseContext() != null) ? applicationContext.getApplicationContext() : null;
                }
                Object[] objArr10 = new Object[1];
                b(new char[]{30, 0, 6, Typography.quote, 25, ' ', Typography.quote, 0, '\b', 29, '\n', 14, 3, '\r', 20, '!'}, (byte) (11 - TextUtils.indexOf((CharSequence) "", '0', 0)), (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 16, objArr10);
                Class<?> cls3 = Class.forName((String) objArr10[0]);
                Object[] objArr11 = new Object[1];
                b(new char[]{18, '\r', 22, 3, '\r', 21, 16, 17, 24, 31, 3, 7, 22, '#', 15, 18}, (byte) (MotionEvent.axisFromString("") + 119), 17 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), objArr11);
                int iIntValue = ((Integer) cls3.getMethod((String) objArr11[0], Object.class).invoke(null, this)).intValue();
                int i10 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 45;
                TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i10 % 128;
                int i11 = i10 % 2;
                try {
                    Object[] objArr12 = {applicationContext, Integer.valueOf(iIntValue), 232034100};
                    byte[] bArr4 = $$d;
                    byte b5 = bArr4[32];
                    byte b6 = (byte) (b5 - 1);
                    Object[] objArr13 = new Object[1];
                    c(b5, b6, b6, objArr13);
                    Class<?> cls4 = Class.forName((String) objArr13[0]);
                    byte b7 = bArr4[32];
                    byte b8 = (byte) (b7 - 1);
                    byte b9 = b7;
                    Object[] objArr14 = new Object[1];
                    c(b8, b9, b9, objArr14);
                    objArr = (Object[]) cls4.getMethod((String) objArr14[0], Context.class, Integer.TYPE, Integer.TYPE).invoke(null, objArr12);
                    if (applicationContext != null) {
                        int i12 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 25;
                        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i12 % 128;
                        int i13 = i12 % 2;
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-337894567);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                            char scrollBarSize2 = (char) (ViewConfiguration.getScrollBarSize() >> 8);
                            int i14 = 876 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                            int i15 = 11 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1));
                            byte[] bArr5 = $$a;
                            byte b10 = bArr5[7];
                            Object[] objArr15 = new Object[1];
                            a(b10, (byte) (b10 | 51), bArr5[54], objArr15);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(scrollBarSize2, i14, i15, 256017550, false, (String) objArr15[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr);
                        try {
                            Object[] objArr16 = new Object[1];
                            b(new char[]{Typography.quote, 0, 14, 0, 31, 22, 14, 24, 31, 4, ' ', 14, '\r', 4, 21, 27, '#', 20, ' ', '#', 23, 5}, (byte) (108 - MotionEvent.axisFromString("")), TextUtils.lastIndexOf("", '0', 0, 0) + 23, objArr16);
                            Class<?> cls5 = Class.forName((String) objArr16[0]);
                            Object[] objArr17 = new Object[1];
                            b(new char[]{19, '!', '!', 0, 3, 19, 17, 0, 18, '!', '!', '\r', 20, 31, 13869}, (byte) ((ViewConfiguration.getScrollBarFadeDuration() >> 16) + 46), 15 - (ViewConfiguration.getFadingEdgeLength() >> 16), objArr17);
                            long jLongValue2 = ((Long) cls5.getDeclaredMethod((String) objArr17[0], new Class[0]).invoke(null, new Object[0])).longValue();
                            Long lValueOf = Long.valueOf(jLongValue2);
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1823069286);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                                char c3 = (char) (1 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)));
                                int i16 = 877 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1));
                                int packedPositionChild = ExpandableListView.getPackedPositionChild(0L) + 11;
                                byte[] bArr6 = $$a;
                                byte b11 = bArr6[5];
                                Object[] objArr18 = new Object[1];
                                a((byte) (-b11), b11, bArr6[7], objArr18);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(c3, i16, packedPositionChild, 2009631821, false, (String) objArr18[0], null);
                            }
                            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                            Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-342512172);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                                char cIndexOf = (char) TextUtils.indexOf("", "");
                                int iIndexOf = 875 - TextUtils.indexOf((CharSequence) "", '0', 0, 0);
                                int i17 = 11 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1));
                                byte[] bArr7 = $$a;
                                byte b12 = bArr7[7];
                                byte b13 = bArr7[5];
                                Object[] objArr19 = new Object[1];
                                a(b12, b13, (byte) (b13 & 14), objArr19);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(cIndexOf, iIndexOf, i17, 252381699, false, (String) objArr19[0], null);
                            }
                            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf2);
                        } catch (Exception unused) {
                            throw new RuntimeException();
                        }
                    }
                    c = 2;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause != null) {
                        throw cause;
                    }
                    throw th;
                }
            }
            int i18 = ((int[]) objArr[c])[0];
            int i19 = ((int[]) objArr[0])[0];
            if (i19 == i18) {
                int i20 = ((int[]) objArr[1])[0];
                Object[] objArr20 = {new int[]{((int[]) objArr[0])[0]}, new int[1], new int[]{((int[]) objArr[2])[0]}, (String[]) objArr[3]};
                int iIdentityHashCode = System.identityHashCode(this);
                int i21 = i20 + (((~((-964011713) | iIdentityHashCode)) | 822378688) * (-283)) + 845244948 + ((~(iIdentityHashCode | (-141633025))) * 283);
                int i22 = (i21 << 13) ^ i21;
                int i23 = i22 ^ (i22 >>> 17);
                ((int[]) objArr20[1])[0] = i23 ^ (i23 << 5);
            } else {
                Toast.makeText((Context) null, i19 / (((i19 - 1) * i19) % 2), 0).show();
                int i24 = ((int[]) objArr[1])[0];
                Object[] objArr21 = {new int[]{((int[]) objArr[0])[0]}, new int[1], new int[]{((int[]) objArr[2])[0]}, (String[]) objArr[3]};
                int iIdentityHashCode2 = System.identityHashCode(this);
                int i25 = ~iIdentityHashCode2;
                int i26 = i24 + (-851048596) + ((402389749 | iIdentityHashCode2) * (-676)) + (((~(397529189 | i25)) | (-402389750)) * 676) + (((~(iIdentityHashCode2 | (-4860561))) | (~(i25 | 357218960)) | 45170789) * 676);
                int i27 = (i26 << 13) ^ i26;
                int i28 = i27 ^ (i27 >>> 17);
                ((int[]) objArr21[1])[0] = i28 ^ (i28 << 5);
            }
            this.icon = drawable;
            return this;
        }

        /* JADX WARN: Code duplicated, block: B:33:0x0111  */
        /* JADX WARN: Code duplicated, block: B:34:0x0131  */
        /* JADX WARN: Code duplicated, block: B:38:0x0181 A[Catch: all -> 0x0339, TRY_ENTER, TryCatch #0 {all -> 0x0339, blocks: (B:7:0x0025, B:9:0x0033, B:10:0x0066, B:14:0x007e, B:16:0x008f, B:17:0x00b9, B:35:0x0133, B:38:0x0181, B:39:0x01f1, B:43:0x0210, B:45:0x024b, B:46:0x02b2), top: B:63:0x0025 }] */
        /* JADX WARN: Code duplicated, block: B:42:0x0204  */
        /* JADX WARN: Code duplicated, block: B:45:0x024b A[Catch: all -> 0x0339, TryCatch #0 {all -> 0x0339, blocks: (B:7:0x0025, B:9:0x0033, B:10:0x0066, B:14:0x007e, B:16:0x008f, B:17:0x00b9, B:35:0x0133, B:38:0x0181, B:39:0x01f1, B:43:0x0210, B:45:0x024b, B:46:0x02b2), top: B:63:0x0025 }] */
        /* JADX WARN: Code duplicated, block: B:48:0x02d3  */
        /* JADX WARN: Code duplicated, block: B:50:0x02da  */
        /* JADX WARN: Code duplicated, block: B:51:0x0302  */
        private static void b(char[] cArr, byte b, int i, Object[] objArr) throws Throwable {
            int i2;
            Object obj;
            Object[] objArr2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4;
            int i3 = 2;
            int i4 = 2 % 2;
            deInitSession deinitsession = new deInitSession();
            char[] cArr2 = TuitionPaymentFragmentbindingInflater1;
            int i5 = 1770390596;
            Object obj2 = null;
            if (cArr2 != null) {
                int length = cArr2.length;
                char[] cArr3 = new char[length];
                int i6 = 0;
                while (i6 < length) {
                    int i7 = $10 + 41;
                    $11 = i7 % 128;
                    int i8 = i7 % i3;
                    try {
                        Object[] objArr3 = {Integer.valueOf(cArr2[i6])};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(i5);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                            byte b2 = (byte) 0;
                            byte b3 = (byte) (b2 + 3);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (ViewConfiguration.getFadingEdgeLength() >> 16), (ViewConfiguration.getJumpTapTimeout() >> 16) + 2267, 33 - (ViewConfiguration.getScrollDefaultDelay() >> 16), -1927765101, false, $$g(b2, b3, (byte) (b3 - 3)), new Class[]{Integer.TYPE});
                        }
                        cArr3[i6] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr3)).charValue();
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
            Object[] objArr4 = {Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault3)};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1770390596);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                byte b4 = (byte) 0;
                byte b5 = (byte) (b4 + 3);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) View.resolveSize(0, 0), View.combineMeasuredStates(0, 0) + 2267, 33 - Drawable.resolveOpacity(0, 0), -1927765101, false, $$g(b4, b5, (byte) (b5 - 3)), new Class[]{Integer.TYPE});
            }
            char cCharValue = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr4)).charValue();
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
                    int i9 = $11 + 23;
                    $10 = i9 % 128;
                    if (i9 % 2 != 0) {
                        deinitsession.b = cArr[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3];
                        deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = cArr[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 >> 1];
                        if (deinitsession.b == deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                            cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = (char) (deinitsession.b - b);
                            cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = (char) (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault2 - b);
                            int i10 = $11 + 43;
                            $10 = i10 % 128;
                            int i11 = i10 % 2;
                            obj = obj2;
                        } else {
                            objArr2 = new Object[]{deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession};
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(486174475);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                                byte b6 = (byte) 0;
                                byte b7 = (byte) (b6 + 2);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (TextUtils.getCapsMode("", 0, 0) + 49267), ImageFormat.getBitsPerPixel(0) + 3262, 29 - TextUtils.lastIndexOf("", '0'), -127612708, false, $$g(b6, b7, (byte) (b7 - 2)), new Class[]{Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class});
                            }
                            if (((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).intValue() == deinitsession.asBinder) {
                                int i12 = $11 + 59;
                                $10 = i12 % 128;
                                int i13 = i12 % 2;
                                Object[] objArr5 = {deinitsession, deinitsession, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), deinitsession, Integer.valueOf(cCharValue), deinitsession};
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1187000607);
                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                    byte b8 = (byte) 0;
                                    byte b9 = b8;
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (22878 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1))), (Process.myTid() >> 22) + 594, TextUtils.lastIndexOf("", '0', 0, 0) + 18, 1570859318, false, $$g(b8, b9, b9), new Class[]{Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Integer.TYPE, Object.class});
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
                            cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = (char) (deinitsession.b - b);
                            cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = (char) (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault2 - b);
                            int i19 = $11 + 43;
                            $10 = i19 % 128;
                            int i110 = i19 % 2;
                            obj = obj2;
                        } else {
                            objArr2 = new Object[]{deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession};
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(486174475);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                                byte b10 = (byte) 0;
                                byte b11 = (byte) (b10 + 2);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (TextUtils.getCapsMode("", 0, 0) + 49267), ImageFormat.getBitsPerPixel(0) + 3262, 29 - TextUtils.lastIndexOf("", '0'), -127612708, false, $$g(b10, b11, (byte) (b11 - 2)), new Class[]{Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class});
                            }
                            if (((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).intValue() == deinitsession.asBinder) {
                                int i111 = $11 + 59;
                                $10 = i111 % 128;
                                int i112 = i111 % 2;
                                Object[] objArr6 = {deinitsession, deinitsession, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), deinitsession, Integer.valueOf(cCharValue), deinitsession};
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1187000607);
                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                    byte b12 = (byte) 0;
                                    byte b13 = b12;
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (22878 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1))), (Process.myTid() >> 22) + 594, TextUtils.lastIndexOf("", '0', 0, 0) + 18, 1570859318, false, $$g(b12, b13, b13), new Class[]{Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Integer.TYPE, Object.class});
                                }
                                obj = null;
                                int iIntValue2 = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr6)).intValue();
                                int i113 = (deinitsession.TuitionPaymentFragmentbindingInflater1 * cCharValue) + deinitsession.asBinder;
                                cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr2[iIntValue2];
                                cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = cArr2[i113];
                            } else {
                                obj = null;
                                if (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault1 == deinitsession.TuitionPaymentFragmentbindingInflater1) {
                                    deinitsession.g = ((deinitsession.g + cCharValue) - 1) % cCharValue;
                                    deinitsession.asBinder = ((deinitsession.asBinder + cCharValue) - 1) % cCharValue;
                                    int i114 = (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault1 * cCharValue) + deinitsession.g;
                                    int i115 = (deinitsession.TuitionPaymentFragmentbindingInflater1 * cCharValue) + deinitsession.asBinder;
                                    cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr2[i114];
                                    cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = cArr2[i115];
                                } else {
                                    int i116 = (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault1 * cCharValue) + deinitsession.asBinder;
                                    int i117 = (deinitsession.TuitionPaymentFragmentbindingInflater1 * cCharValue) + deinitsession.g;
                                    cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr2[i116];
                                    cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = cArr2[i117];
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
        }

        private Builder(Context context) {
            this.context = context;
        }

        public static Builder withContext(Context context) {
            int i = 2 % 2;
            Builder builder = new Builder(context);
            int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 67;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
            int i3 = i2 % 2;
            return builder;
        }

        public DialogOnDeniedPermissionListener build() {
            String str;
            String str2;
            int i = 2 % 2;
            int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 77;
            int i3 = i2 % 128;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3;
            int i4 = i2 % 2;
            String str3 = this.title;
            if (str3 == null) {
                int i5 = i3 + 51;
                TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i5 % 128;
                int i6 = i5 % 2;
                str = "";
            } else {
                str = str3;
            }
            String str4 = this.message;
            String str5 = str4 == null ? "" : str4;
            String str6 = this.buttonText;
            if (str6 == null) {
                int i7 = i3 + 97;
                TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i7 % 128;
                int i8 = i7 % 2;
                str2 = "";
            } else {
                str2 = str6;
            }
            return new DialogOnDeniedPermissionListener(this.context, str, str5, str2, this.icon);
        }

        public Builder withButtonText(int i) {
            int i2 = 2 % 2;
            int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 7;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i3 % 128;
            if (i3 % 2 == 0) {
                this.buttonText = this.context.getString(i);
                throw null;
            }
            this.buttonText = this.context.getString(i);
            int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 45;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
            if (i4 % 2 != 0) {
                return this;
            }
            throw null;
        }

        public Builder withButtonText(String str) {
            int i = 2 % 2;
            int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 59;
            int i3 = i2 % 128;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i3;
            int i4 = i2 % 2;
            this.buttonText = str;
            if (i4 == 0) {
                throw null;
            }
            int i5 = i3 + 51;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i5 % 128;
            if (i5 % 2 == 0) {
                return this;
            }
            throw null;
        }

        public Builder withIcon(int i) {
            int i2 = 2 % 2;
            int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 15;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i3 % 128;
            int i4 = i3 % 2;
            this.icon = this.context.getResources().getDrawable(i);
            if (i4 != 0) {
                return this;
            }
            throw null;
        }

        public Builder withMessage(int i) {
            int i2 = 2 % 2;
            int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 113;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i3 % 128;
            int i4 = i3 % 2;
            this.message = this.context.getString(i);
            if (i4 == 0) {
                int i5 = 0 / 0;
            }
            return this;
        }

        public Builder withMessage(String str) {
            int i = 2 % 2;
            int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 83;
            int i3 = i2 % 128;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3;
            int i4 = i2 % 2;
            this.message = str;
            if (i4 != 0) {
                throw null;
            }
            int i5 = i3 + 47;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i5 % 128;
            int i6 = i5 % 2;
            return this;
        }

        public Builder withTitle(int i) {
            int i2 = 2 % 2;
            int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 63;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i3 % 128;
            if (i3 % 2 == 0) {
                this.title = this.context.getString(i);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            this.title = this.context.getString(i);
            int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 91;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
            int i5 = i4 % 2;
            return this;
        }

        public Builder withTitle(String str) {
            int i = 2 % 2;
            int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 39;
            int i3 = i2 % 128;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i3;
            int i4 = i2 % 2;
            Object obj = null;
            this.title = str;
            if (i4 == 0) {
                obj.hashCode();
                throw null;
            }
            int i5 = i3 + 17;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i5 % 128;
            if (i5 % 2 == 0) {
                return this;
            }
            throw null;
        }

        private static String $$g(short s, short s2, byte b) {
            byte[] bArr = $$c;
            int i = 4 - (s * 4);
            int i2 = 116 - s2;
            int i3 = b * 4;
            byte[] bArr2 = new byte[i3 + 1];
            int i4 = -1;
            if (bArr == null) {
                i2 = (-i2) + i3;
                i++;
                i4 = -1;
            }
            while (true) {
                int i5 = i4 + 1;
                bArr2[i5] = (byte) i2;
                if (i5 == i3) {
                    return new String(bArr2, 0);
                }
                i2 = (-bArr[i]) + i2;
                i++;
                i4 = i5;
            }
        }
    }
}
