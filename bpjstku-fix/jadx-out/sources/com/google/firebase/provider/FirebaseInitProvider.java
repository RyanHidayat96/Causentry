package com.google.firebase.provider;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.net.Uri;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.Toast;
import androidx.compose.runtime.ComposerKt;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.google.android.gms.common.internal.Preconditions;
import com.google.firebase.FirebaseApp;
import com.google.firebase.StartupTime;
import defpackage.CameraCaptureResultImageInfo;
import defpackage.checkUnsupportedFeatureCombinationAndThrow;
import defpackage.deInitSession;
import defpackage.initSession;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Random;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.ByteCompanionObject;
import kotlin.text.Typography;
import okhttp3.tls.internal.der.DerHeader;
import org.koin.core.error.ScopeAlreadyCreatedException;

/* JADX INFO: loaded from: classes5.dex */
public class FirebaseInitProvider extends ContentProvider {
    private static final byte[] $$a;
    private static final int $$b;
    private static final byte[] $$d;
    private static final int $$e;
    static final String EMPTY_APPLICATION_ID_PROVIDER_AUTHORITY = "com.google.firebase.firebaseinitprovider";
    private static final String TAG = "FirebaseInitProvider";
    private static int TuitionPaymentFragmentbindingInflater1;
    private static char TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    private static char[] TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    private static int b;
    private static AtomicBoolean currentlyInitializing;
    private static int g;
    private static StartupTime startupTime;
    private static final byte[] $$c = {93, -122, -23, -24};
    private static final int $$f = 190;
    private static int $10 = 0;
    private static int $11 = 1;

    /* JADX WARN: Code duplicated, block: B:10:0x0026  */
    /* JADX WARN: Code duplicated, block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x0028). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0026
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void c(short r6, byte r7, byte r8, java.lang.Object[] r9) {
        /*
            int r6 = 214 - r6
            int r0 = 53 - r8
            int r7 = r7 + 84
            byte[] r1 = com.google.firebase.provider.FirebaseInitProvider.$$a
            byte[] r0 = new byte[r0]
            int r8 = 52 - r8
            r2 = 0
            if (r1 != 0) goto L13
            r3 = r7
            r4 = r2
            r7 = r6
            goto L28
        L13:
            r3 = r2
            r5 = r7
            r7 = r6
            r6 = r5
        L17:
            byte r4 = (byte) r6
            r0[r3] = r4
            int r4 = r3 + 1
            if (r3 != r8) goto L26
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            r9[r2] = r6
            return
        L26:
            r3 = r1[r7]
        L28:
            int r3 = -r3
            int r6 = r6 + r3
            int r6 = r6 + (-11)
            int r7 = r7 + 1
            r3 = r4
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.provider.FirebaseInitProvider.c(short, byte, byte, java.lang.Object[]):void");
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0020  */
    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0020 -> B:11:0x0025). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0020
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void d(int r7, int r8, short r9, java.lang.Object[] r10) {
        /*
            int r8 = 115 - r8
            int r7 = 115 - r7
            byte[] r0 = com.google.firebase.provider.FirebaseInitProvider.$$d
            int r9 = r9 + 4
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L10
            r3 = r9
            r5 = r2
            goto L25
        L10:
            r3 = r2
        L11:
            byte r4 = (byte) r8
            int r5 = r3 + 1
            r1[r3] = r4
            if (r5 != r7) goto L20
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            r10[r2] = r7
            return
        L20:
            r3 = r0[r9]
            r6 = r3
            r3 = r9
            r9 = r6
        L25:
            int r8 = r8 + r9
            int r8 = r8 + (-4)
            int r9 = r3 + 1
            r3 = r5
            goto L11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.provider.FirebaseInitProvider.d(int, int, short, java.lang.Object[]):void");
    }

    static {
        byte[] bArr = new byte[542];
        System.arraycopy("\f\u000b÷\u0096\u0010\u0002ÅC\u0000ÿ\u0014\u0002ó\u0011\t¿Iõ\u000bÇKø\u0006\u0002\u000f¾L÷\u0000\u0016\u0000¿8\u0003\u0011\u0001\r\u0002ó\u0011\t÷\u0003\u0011ÀI\u0005ñ\u0017\u0005\u0002¿#\u0018\u0011ú\t\rûÝ+\u0007\u0004ë%ñ\u0017\u0005\u0002Ò&\u0015ù\u0011÷\u000f\t¯\u0012%ø\u000fù\n\u0003æ\u0015\u001cøü\r\nÖ0ó\n\nü\r\n\u0003\u0001ù\u0002\nü\u000f\u0001\t\u0002\u0001\tû\u0003\u0016÷\u0000\u0016Ú&ù\u0005\u000bü\u0005\u0005ÿ\u0018û\fÃö\u0013Ô)\u000e\u0001\u0000ù\u001cØ&ù\u0005%ø\u000fù\n\u0003æ\u0015\u001cøü\r\nÖ0ó\n\nü\r\n\u0003\u0001ù\u0002\nü\u000f\u0001\t\u0002\u0001\tû\u0003\u0016÷\u0000\u0016Ú&ù\u0005\u000bü\u0005\u0005ÿ\u0018û\fÂ\u0010\u0002Å=\f\u0004ü\týÍ7\u0011ú\u0012\u0001þÿÎB\u0001ý\u0014ó\u0015û\u0000\u0012¿F\u0000ù\u0006\u0006\u0012¿7\u0013ýÉC\u0006ù\u0005\u000bÆP\u0004í\u0013\u0010\u0002Å=\f\u0004ü\týÍ<\u0007\r÷\u0001\u0003\u0016öÍ9\u0013ó\u0016ù\b\u0011ÿùþ\u0014¿\u001c'\r÷\u0001\u0003\u0016öâ3ó\u0016ù\b\u0011ÿùþ\u0014Ü-\bÞ\u0017\u0006\u0006\u000e\u0005\u0002ó\u0015¶#0\u0002\u0007õ\u0011ÿ\n\u0003\u0010\u0002Å8\u0012þ\r\u0005û\u000e½:\u0001\u0017ñ\u0005\u000b\tú\t\týË\u001c0ó\n\nü\r\nÑ6ú\u0006Ú&\u0015ù\u0011óï\u0015\u0015\u0006ùþ\n\u000bõ\u0011\nÓ*\u000fù\u0015ï\r\tù\u0005\u000bØ/ø\u0016üü\r\nÒ+\tú\t\týÊ8ù\u0010ù\u0006\u0001ç\b)æ-Ûå\r/í-ñ\u000fèâ\u0018÷$ã#àEñÛ\u0015\u0016ù\u0010ù\u0006\u0001\u0017\u0002\u000bß\u001få&\u0001\u000b÷ÿ\u0005ï&÷\u0015÷\u0000\u0016à&\u0001øÿ\u0006\u0006Ñ3\u0011ú\u0012\u0001þÿ\u0018ï\u0002\u0010ü\u0011ó\u0019÷\u0000\u0016á\u0015\u0017\u0000\u0005\u0001÷õ\u0017\u0000\u0016Ö(\u0007\u0000ý\fü\r\nñ\u0017ù\n\u0003º4%ø\u000fù\n\u0003æ\u0015\u001cøü\r\nÖ0ó\n\nü\r\nò\u000b\tú\t\týæ)ü\nù\u0017õ\u0011Ã".getBytes("ISO-8859-1"), 0, bArr, 0, 542);
        $$d = bArr;
        $$e = 185;
        $$a = new byte[]{88, 99, -94, -58, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 55, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 54, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, 7, -18, -16, -1, -16, -16, -4, 19, -48, -3, -17, 0, -30, 4, -24, 54, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 56, -29, 31, -48, -17, 4, -24, 1, -6, -13, -13, -29, 38, -50, -16, -1, -12, -24};
        $$b = 210;
        TuitionPaymentFragmentbindingInflater1 = 0;
        g = 1;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
        b = 1;
        b();
        startupTime = StartupTime.now();
        currentlyInitializing = new AtomicBoolean(false);
        int i = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 33;
        b = i % 128;
        int i2 = i % 2;
    }

    public static StartupTime getStartupTime() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 99;
        int i3 = i2 % 128;
        g = i3;
        if (i2 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        StartupTime startupTime2 = startupTime;
        int i4 = i3 + 19;
        TuitionPaymentFragmentbindingInflater1 = i4 % 128;
        int i5 = i4 % 2;
        return startupTime2;
    }

    public static boolean isCurrentlyInitializing() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 39;
        g = i2 % 128;
        int i3 = i2 % 2;
        boolean z = currentlyInitializing.get();
        int i4 = TuitionPaymentFragmentbindingInflater1 + 107;
        g = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 35 / 0;
        }
        return z;
    }

    @Override // android.content.ContentProvider
    public void attachInfo(Context context, ProviderInfo providerInfo) {
        int i = 2 % 2;
        int i2 = g + 25;
        TuitionPaymentFragmentbindingInflater1 = i2 % 128;
        if (i2 % 2 == 0) {
            checkContentProviderAuthority(providerInfo);
            super.attachInfo(context, providerInfo);
        } else {
            checkContentProviderAuthority(providerInfo);
            super.attachInfo(context, providerInfo);
            throw null;
        }
    }

    private static void a(char[] cArr, byte b2, int i, Object[] objArr) throws Throwable {
        int i2;
        Object obj;
        int i3 = 2 % 2;
        deInitSession deinitsession = new deInitSession();
        char[] cArr2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        int i4 = 1770390596;
        Object obj2 = null;
        int i5 = -1;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i6 = $11 + 83;
            $10 = i6 % 128;
            int i7 = i6 % 2;
            int i8 = 0;
            while (i8 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i8])};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(i4);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        byte b3 = (byte) i5;
                        byte b4 = (byte) (b3 + 4);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) KeyEvent.keyCodeFromString(""), 2267 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), 33 - Color.green(0), -1927765101, false, $$g(b3, b4, (byte) (b4 - 3)), new Class[]{Integer.TYPE});
                    }
                    cArr3[i8] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                    i8++;
                    i4 = 1770390596;
                    i5 = -1;
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
        Object[] objArr3 = {Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault1)};
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1770390596);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            byte b5 = (byte) (-1);
            byte b6 = (byte) (b5 + 4);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) Color.green(0), 2267 - TextUtils.getTrimmedLength(""), 33 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), -1927765101, false, $$g(b5, b6, (byte) (b6 - 3)), new Class[]{Integer.TYPE});
        }
        char cCharValue = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).charValue();
        char[] cArr4 = new char[i];
        if (i % 2 != 0) {
            int i9 = $11 + 85;
            $10 = i9 % 128;
            if (i9 % 2 != 0) {
                i2 = i + 85;
                cArr4[i2] = (char) (cArr[i2] * b2);
            } else {
                i2 = i - 1;
                cArr4[i2] = (char) (cArr[i2] - b2);
            }
        } else {
            i2 = i;
        }
        if (i2 > 1) {
            int i10 = $11 + 99;
            $10 = i10 % 128;
            if (i10 % 2 != 0) {
                deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 1;
            } else {
                deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
            }
            while (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 < i2) {
                deinitsession.b = cArr[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3];
                deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = cArr[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1];
                if (deinitsession.b == deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                    int i11 = $10 + 63;
                    $11 = i11 % 128;
                    if (i11 % 2 == 0) {
                        cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = (char) (deinitsession.b % b2);
                        cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = (char) (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault2 >> b2);
                    } else {
                        cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = (char) (deinitsession.b - b2);
                        cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = (char) (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault2 - b2);
                    }
                    obj = obj2;
                } else {
                    Object[] objArr4 = {deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(486174475);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                        byte b7 = (byte) (-1);
                        byte b8 = (byte) (b7 + 3);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (View.resolveSizeAndState(0, 0, 0) + 49267), (ViewConfiguration.getWindowTouchSlop() >> 8) + 3261, 30 - Color.green(0), -127612708, false, $$g(b7, b8, (byte) (b8 - 2)), new Class[]{Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class});
                    }
                    if (((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4)).intValue() == deinitsession.asBinder) {
                        Object[] objArr5 = {deinitsession, deinitsession, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), deinitsession, Integer.valueOf(cCharValue), deinitsession};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1187000607);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                            byte b9 = (byte) (-1);
                            byte b10 = (byte) (b9 + 1);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (22878 - ExpandableListView.getPackedPositionType(0L)), 593 - TextUtils.lastIndexOf("", '0', 0, 0), (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 17, 1570859318, false, $$g(b9, b10, b10), new Class[]{Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Integer.TYPE, Object.class});
                        }
                        obj = null;
                        int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).intValue();
                        int i12 = (deinitsession.TuitionPaymentFragmentbindingInflater1 * cCharValue) + deinitsession.asBinder;
                        cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr2[iIntValue];
                        cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = cArr2[i12];
                        int i13 = $11 + 111;
                        $10 = i13 % 128;
                        int i14 = i13 % 2;
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
                deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 += 2;
                obj2 = obj;
            }
        }
        int i19 = 0;
        while (i19 < i) {
            cArr4[i19] = (char) (cArr4[i19] ^ 13722);
            i19++;
            int i20 = $11 + 37;
            $10 = i20 % 128;
            int i21 = i20 % 2;
        }
        objArr[0] = new String(cArr4);
    }

    /* JADX WARN: Code duplicated, block: B:425:0x292a  */
    /* JADX WARN: Code duplicated, block: B:427:0x29a3  */
    /* JADX WARN: Code duplicated, block: B:430:0x2a03  */
    /* JADX WARN: Code duplicated, block: B:433:0x2a58  */
    /* JADX WARN: Code duplicated, block: B:435:0x2a61  */
    /* JADX WARN: Code duplicated, block: B:437:0x2b1d  */
    /* JADX WARN: Code duplicated, block: B:440:0x2b27 A[Catch: all -> 0x3281, TryCatch #0 {all -> 0x3281, blocks: (B:438:0x2b21, B:440:0x2b27, B:441:0x2b50, B:443:0x2b7b, B:444:0x2c0a, B:289:0x1b32, B:291:0x1b47, B:292:0x1b7a, B:251:0x1732, B:253:0x1747, B:254:0x1779, B:256:0x17b6, B:257:0x183e), top: B:564:0x1732 }] */
    /* JADX WARN: Code duplicated, block: B:443:0x2b7b A[Catch: all -> 0x3281, TryCatch #0 {all -> 0x3281, blocks: (B:438:0x2b21, B:440:0x2b27, B:441:0x2b50, B:443:0x2b7b, B:444:0x2c0a, B:289:0x1b32, B:291:0x1b47, B:292:0x1b7a, B:251:0x1732, B:253:0x1747, B:254:0x1779, B:256:0x17b6, B:257:0x183e), top: B:564:0x1732 }] */
    /* JADX WARN: Code duplicated, block: B:447:0x2c1d  */
    /* JADX WARN: Code duplicated, block: B:452:0x2c86  */
    /* JADX WARN: Code duplicated, block: B:455:0x2cd5  */
    /* JADX WARN: Code duplicated, block: B:459:0x2d25  */
    /* JADX WARN: Code duplicated, block: B:461:0x3215  */
    /* JADX WARN: Code duplicated, block: B:463:0x3221  */
    /* JADX WARN: Code duplicated, block: B:466:0x3225 A[LOOP:0: B:464:0x3222->B:466:0x3225, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:471:0x323f  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v796, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r3v414, types: [boolean, int] */
    @Override // android.content.ContentProvider
    public boolean onCreate() throws Throwable {
        String str;
        Object[] objArr;
        Object[] objArr2;
        int i;
        String str2;
        String str3;
        Object[] objArr3;
        char c;
        String str4;
        Object[] objArr4;
        char c2;
        String str5;
        Object[] objArr5;
        String str6;
        Object[] objArr6;
        String str7;
        Object[] objArr7;
        char c3;
        Object[] objArr8;
        Object[] objArr9;
        Object[] objArr10;
        String str8;
        Object[] objArr11;
        Object[] objArr12;
        int i2;
        Object[] objArr13;
        String str9;
        Object[] objArr14;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3;
        long j;
        long jLongValue;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6;
        Object[] objArr15;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9;
        int i3;
        ArrayList arrayList;
        String[] strArr;
        int i4;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault10;
        int i5 = 2 % 2;
        Object[] objArr16 = new Object[1];
        a(new char[]{22, 26, '\r', 26, Typography.quote, 0, 11, 19, '!', '*', 20, '.', '!', 5, '\r', '\'', 30, '\r', 7, 29, '\n', 24}, (byte) (121 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1))), Gravity.getAbsoluteGravity(0, 0) + 22, objArr16);
        String str10 = (String) objArr16[0];
        Object[] objArr17 = new Object[1];
        a(new char[]{Typography.dollar, '\r', 27, 14, '0', '(', '\r', 11, '#', 27, '\t', '\f', '\r', ')', 13857}, (byte) (34 - (KeyEvent.getMaxKeyCode() >> 16)), (ViewConfiguration.getFadingEdgeLength() >> 16) + 15, objArr17);
        String str11 = (String) objArr17[0];
        String str12 = "";
        Object[] objArr18 = new Object[1];
        a(new char[]{0, 26, 0, 22, 15, 11, 22, 26, ' ', 15, '/', 27, '.', '\f', '0', ')'}, (byte) (TextUtils.getCapsMode("", 0, 0) + 73), 16 - View.getDefaultSize(0, 0), objArr18);
        String str13 = (String) objArr18[0];
        Object[] objArr19 = new Object[1];
        a(new char[]{5, '\r', '\'', 27, '\r', 4, '\f', 25, 28, 26, '.', '(', 7, 30, '\r', '('}, (byte) (Drawable.resolveOpacity(0, 0) + 70), KeyEvent.keyCodeFromString("") + 16, objArr19);
        String str14 = (String) objArr19[0];
        Object[] objArr20 = new Object[1];
        a(new char[]{22, 26, '\r', 26, Typography.quote, 0, 11, 19, 27, 14, 14, 19, 5, 4, '\r', 4, 2, 0, '\f', 25, ' ', '%', Typography.quote, '0', 26, 7}, (byte) (15 - TextUtils.indexOf("", "")), TextUtils.getTrimmedLength("") + 26, objArr20);
        String str15 = (String) objArr20[0];
        Object[] objArr21 = new Object[1];
        a(new char[]{4, '-', 13866, 13866, '\'', 27, 18, 11, 13868, 13868, '\r', 1, 0, 24, '\r', 4, ' ', 21}, (byte) (AndroidCharacter.getMirror('0') + 18), View.getDefaultSize(0, 0) + 18, objArr21);
        String str16 = (String) objArr21[0];
        int i6 = ((Field) CameraCaptureResultImageInfo.TuitionPaymentFragmentspecialinlinedviewModeldefault3[0]).getInt(null);
        int i7 = (int) Runtime.getRuntime().totalMemory();
        int i8 = ~i7;
        if (i6 != (-305062744) + ((~(i8 | 102234496)) * (-560)) + ((~(932707799 | i7)) * (-560)) + (((~((-932222040) | i8)) | 101748736) * 560)) {
            int[] iArr = new int[910449609];
            iArr[910449608] = 1;
            int i9 = 2037131272 % 2;
            Toast.makeText((Context) null, iArr[-1], 1).show();
        }
        int i10 = ((Field) checkUnsupportedFeatureCombinationAndThrow.b[0]).getInt(null);
        int iUptimeMillis = (int) SystemClock.uptimeMillis();
        if (i10 != (((-1858558638) | (~(2076150504 | iUptimeMillis))) * 398) + 1905971870 + (((~((~iUptimeMillis) | 2076150504)) | (-1858558638)) * 398)) {
            int i11 = (-1894528304) % 2;
            throw new ArithmeticException();
        }
        try {
            currentlyInitializing.set(true);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault11 == null) {
                char cIndexOf = (char) ((-1) - TextUtils.indexOf((CharSequence) "", '0'));
                int trimmedLength = 1031 - TextUtils.getTrimmedLength("");
                int mode = View.MeasureSpec.getMode(0) + 15;
                short s = (short) $$b;
                byte b2 = $$a[7];
                Object[] objArr22 = new Object[1];
                c(s, b2, b2, objArr22);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.b(cIndexOf, trimmedLength, mode, 1357589585, false, (String) objArr22[0], null);
            }
            long j2 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault11).getLong(null);
            long jLongValue2 = ((Long) Class.forName(str10).getDeclaredMethod(str11, new Class[0]).invoke(null, new Object[0])).longValue();
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault12 == null) {
                char c4 = (char) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 1);
                int iLastIndexOf = 1030 - TextUtils.lastIndexOf("", '0', 0);
                int mode2 = View.MeasureSpec.getMode(0) + 15;
                byte b3 = $$a[7];
                Object[] objArr23 = new Object[1];
                c((short) 158, b3, b3, objArr23);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.b(c4, iLastIndexOf, mode2, 1344079056, false, (String) objArr23[0], null);
            }
            if (j2 == ((jLongValue2 - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault12).getLong(null) << 52) >>> 52)) >> 12)) {
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault13 == null) {
                    char keyRepeatDelay = (char) (ViewConfiguration.getKeyRepeatDelay() >> 16);
                    int modifierMetaStateMask = ((byte) KeyEvent.getModifierMetaStateMask()) + 1032;
                    int jumpTapTimeout = (ViewConfiguration.getJumpTapTimeout() >> 16) + 15;
                    Object[] objArr24 = new Object[1];
                    c((short) 106, (byte) 14, (byte) ($$b >>> 2), objArr24);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.b(keyRepeatDelay, modifierMetaStateMask, jumpTapTimeout, 632103528, false, (String) objArr24[0], null);
                }
                Object[] objArr25 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault13).get(null);
                objArr = new Object[]{strArr, new int[]{i}, new int[1], new int[]{i}};
                int i12 = ((int[]) objArr25[3])[0];
                int i13 = ((int[]) objArr25[1])[0];
                String[] strArr2 = (String[]) objArr25[0];
                int iIdentityHashCode = System.identityHashCode(this);
                int i14 = (-2140082559) + (((~(308040250 | iIdentityHashCode)) | 547597700) * 336) + ((303317530 | (~(iIdentityHashCode | 552320420))) * (-168)) + (((~((~iIdentityHashCode) | 552320420)) | 308040250) * 168) + 991019557;
                int i15 = (i14 << 13) ^ i14;
                int i16 = i15 ^ (i15 >>> 17);
                ((int[]) objArr[2])[0] = i16 ^ (i16 << 5);
                str = str11;
            } else {
                int iIntValue = ((Integer) Class.forName(str13).getMethod(str14, Object.class).invoke(null, this)).intValue();
                try {
                    Object[] objArr26 = {-1933763502};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-725886332);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault14 == null) {
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.b((char) (46038 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1))), 1133 - ((byte) KeyEvent.getModifierMetaStateMask()), (Process.myTid() >> 22) + 18, 807763283, false, null, new Class[]{Integer.TYPE});
                    }
                    try {
                        Object[] objArr27 = {Integer.valueOf(iIntValue), 0, 991019557, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault14).newInstance(objArr26), false};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1443305588);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault15 == null) {
                            char c5 = (char) (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
                            int i17 = (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 1031;
                            int trimmedLength2 = TextUtils.getTrimmedLength("") + 15;
                            short s2 = (short) $$b;
                            byte b4 = $$a[7];
                            Object[] objArr28 = new Object[1];
                            c(s2, b4, b4, objArr28);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.b(c5, i17, trimmedLength2, 1298546779, false, (String) objArr28[0], new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (45993 - (ViewConfiguration.getMaximumFlingVelocity() >> 16)), View.MeasureSpec.getSize(0) + 1117, (ViewConfiguration.getScrollBarSize() >> 8) + 17), Boolean.TYPE});
                        }
                        Object[] objArr29 = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault15).invoke(null, objArr27);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault16 == null) {
                            char defaultSize = (char) View.getDefaultSize(0, 0);
                            int iResolveSize = 1031 - View.resolveSize(0, 0);
                            int i18 = 16 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1));
                            Object[] objArr30 = new Object[1];
                            c((short) 106, (byte) 14, (byte) ($$b >>> 2), objArr30);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.b(defaultSize, iResolveSize, i18, 632103528, false, (String) objArr30[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault16).set(null, objArr29);
                        try {
                            str = str11;
                            long jLongValue3 = ((Long) Class.forName(str10).getDeclaredMethod(str, new Class[0]).invoke(null, new Object[0])).longValue();
                            Long lValueOf = Long.valueOf(jLongValue3);
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault17 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault17 == null) {
                                char c6 = (char) (1 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)));
                                int absoluteGravity = Gravity.getAbsoluteGravity(0, 0) + 1031;
                                int defaultSize2 = 15 - View.getDefaultSize(0, 0);
                                byte b5 = $$a[7];
                                Object[] objArr31 = new Object[1];
                                c((short) 158, b5, b5, objArr31);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault17 = initSession.b(c6, absoluteGravity, defaultSize2, 1344079056, false, (String) objArr31[0], null);
                            }
                            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault17).set(null, lValueOf);
                            Long lValueOf2 = Long.valueOf(jLongValue3 >> 12);
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault18 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault18 == null) {
                                char keyRepeatDelay2 = (char) (ViewConfiguration.getKeyRepeatDelay() >> 16);
                                int i19 = 1032 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1));
                                int mirror = AndroidCharacter.getMirror('0') - '!';
                                short s3 = (short) $$b;
                                byte b6 = $$a[7];
                                Object[] objArr32 = new Object[1];
                                c(s3, b6, b6, objArr32);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault18 = initSession.b(keyRepeatDelay2, i19, mirror, 1357589585, false, (String) objArr32[0], null);
                            }
                            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault18).set(null, lValueOf2);
                            objArr = objArr29;
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
                } catch (Throwable th2) {
                    Throwable cause2 = th2.getCause();
                    if (cause2 != null) {
                        throw cause2;
                    }
                    throw th2;
                }
            }
            int i20 = ((int[]) objArr[1])[0];
            int i21 = ((int[]) objArr[3])[0];
            if (i21 == i20) {
                objArr2 = new Object[]{strArr, new int[]{i}, new int[1], new int[]{i}};
                int i22 = ((int[]) objArr[2])[0];
                int i23 = ((int[]) objArr[3])[0];
                int i24 = ((int[]) objArr[1])[0];
                String[] strArr3 = (String[]) objArr[0];
                int iMyPid = Process.myPid();
                int i25 = i22 + (-1210876524) + (((-21758022) | iMyPid) * (-627)) + (((~(88907997 | iMyPid)) | 333188167) * (-627)) + (((~(iMyPid | 333188167)) | (~((~iMyPid) | (-88907998)))) * 627);
                int i26 = (i25 << 13) ^ i25;
                int i27 = i26 ^ (i26 >>> 17);
                ((int[]) objArr2[2])[0] = i27 ^ (i27 << 5);
                i = 0;
            } else {
                ArrayList arrayList2 = new ArrayList();
                String[] strArr4 = (String[]) objArr[0];
                if (strArr4 != null) {
                    for (String str17 : strArr4) {
                        arrayList2.add(str17);
                    }
                }
                int[] iArr2 = new int[i21];
                int i28 = i21 - 1;
                iArr2[i28] = 1;
                Toast.makeText((Context) null, iArr2[((i21 * i28) % 2) - 1], 1).show();
                objArr2 = new Object[]{strArr, new int[]{i}, new int[1], new int[]{i}};
                int i29 = ((int[]) objArr[2])[0];
                int i30 = ((int[]) objArr[3])[0];
                int i31 = ((int[]) objArr[1])[0];
                String[] strArr5 = (String[]) objArr[0];
                int i32 = ~new Random().nextInt(753002677);
                int i33 = i29 + 247797000 + (((~(145781531 | i32)) | (-390061702)) * (-983)) + (((~(i32 | (-390061702))) | 3166721) * 983);
                int i34 = (i33 << 13) ^ i33;
                int i35 = i34 ^ (i34 >>> 17);
                i = 0;
                ((int[]) objArr2[2])[0] = i35 ^ (i35 << 5);
            }
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault19 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2030658839);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault19 == null) {
                char capsMode = (char) TextUtils.getCapsMode("", i, i);
                int trimmedLength3 = TextUtils.getTrimmedLength("") + 876;
                int iIndexOf = 10 - TextUtils.indexOf("", "", i, i);
                byte b7 = $$a[7];
                Object[] objArr33 = new Object[1];
                c((short) 106, b7, (byte) (b7 | 15), objArr33);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault19 = initSession.b(capsMode, trimmedLength3, iIndexOf, -1650998592, false, (String) objArr33[0], null);
            }
            long j3 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault19).getLong(null);
            long jLongValue4 = ((Long) Class.forName(str10).getDeclaredMethod(str, new Class[0]).invoke(null, new Object[0])).longValue();
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault20 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1821222244);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault20 == null) {
                char pressedStateDuration = (char) (ViewConfiguration.getPressedStateDuration() >> 16);
                int deadChar = KeyEvent.getDeadChar(0, 0) + 876;
                int iIndexOf2 = TextUtils.indexOf("", "", 0, 0) + 10;
                byte b8 = $$a[7];
                Object[] objArr34 = new Object[1];
                c((short) 158, b8, b8, objArr34);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault20 = initSession.b(pressedStateDuration, deadChar, iIndexOf2, 2012020043, false, (String) objArr34[0], null);
            }
            if (j3 == ((jLongValue4 - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault20).getLong(null) << 52) >>> 52)) >> 12)) {
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault21 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1822145765);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault21 == null) {
                    char fadingEdgeLength = (char) (ViewConfiguration.getFadingEdgeLength() >> 16);
                    int modifierMetaStateMask2 = 875 - ((byte) KeyEvent.getModifierMetaStateMask());
                    int iNormalizeMetaState = 10 - KeyEvent.normalizeMetaState(0);
                    short s4 = (short) $$b;
                    byte b9 = $$a[7];
                    Object[] objArr35 = new Object[1];
                    c(s4, b9, b9, objArr35);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault21 = initSession.b(fadingEdgeLength, modifierMetaStateMask2, iNormalizeMetaState, 2012931276, false, (String) objArr35[0], null);
                }
                Object[] objArr36 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault21).get(null);
                objArr3 = new Object[]{new int[]{((int[]) objArr36[0])[0]}, new int[1], new int[]{((int[]) objArr36[2])[0]}, (String[]) objArr36[3]};
                int startUptimeMillis = (int) Process.getStartUptimeMillis();
                int i36 = (-549971510) + (((~(startUptimeMillis | 465090155)) | 4259988) * 305) + (((~((~startUptimeMillis) | 465090155)) | 424779926) * 305) + 2088454358;
                int i37 = (i36 << 13) ^ i36;
                int i38 = i37 ^ (i37 >>> 17);
                ((int[]) objArr3[1])[0] = i38 ^ (i38 << 5);
                str2 = str16;
                str3 = str;
                c = 2;
                str12 = "";
            } else {
                Context applicationContext = (Context) Class.forName(str15).getMethod(str2, new Class[0]).invoke(null, null);
                if (applicationContext != null) {
                    if (!(applicationContext instanceof ContextWrapper)) {
                        str2 = str16;
                        applicationContext = applicationContext.getApplicationContext();
                    } else if (((ContextWrapper) applicationContext).getBaseContext() != null) {
                        str2 = str16;
                        str2 = str16;
                        applicationContext = applicationContext.getApplicationContext();
                    } else {
                        str2 = str16;
                        applicationContext = null;
                    }
                }
                str2 = str16;
                try {
                    Object[] objArr37 = {applicationContext, Integer.valueOf(((Integer) Class.forName(str13).getMethod(str14, Object.class).invoke(null, this)).intValue()), 0, 2088454358};
                    byte[] bArr = $$d;
                    Object[] objArr38 = new Object[1];
                    d(bArr[277], bArr[4], bArr[8], objArr38);
                    Class<?> cls = Class.forName((String) objArr38[0]);
                    Object[] objArr39 = new Object[1];
                    d((byte) (-bArr[195]), bArr[437], bArr[20], objArr39);
                    Object[] objArr40 = (Object[]) cls.getMethod((String) objArr39[0], Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr37);
                    if (applicationContext != null) {
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault22 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1822145765);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault22 == null) {
                            char offsetBefore = (char) TextUtils.getOffsetBefore("", 0);
                            int iResolveOpacity = 876 - Drawable.resolveOpacity(0, 0);
                            int capsMode2 = TextUtils.getCapsMode("", 0, 0) + 10;
                            short s5 = (short) $$b;
                            byte b10 = $$a[7];
                            Object[] objArr41 = new Object[1];
                            c(s5, b10, b10, objArr41);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault22 = initSession.b(offsetBefore, iResolveOpacity, capsMode2, 2012931276, false, (String) objArr41[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault22).set(null, objArr40);
                        try {
                            str3 = str;
                            long jLongValue5 = ((Long) Class.forName(str10).getDeclaredMethod(str3, new Class[0]).invoke(null, new Object[0])).longValue();
                            Long lValueOf3 = Long.valueOf(jLongValue5);
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault23 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1821222244);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault23 == null) {
                                char keyRepeatDelay3 = (char) (ViewConfiguration.getKeyRepeatDelay() >> 16);
                                int iIndexOf3 = 876 - TextUtils.indexOf("", "", 0);
                                int iIndexOf4 = TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 11;
                                byte b11 = $$a[7];
                                Object[] objArr42 = new Object[1];
                                c((short) 158, b11, b11, objArr42);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault23 = initSession.b(keyRepeatDelay3, iIndexOf3, iIndexOf4, 2012020043, false, (String) objArr42[0], null);
                            }
                            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault23).set(null, lValueOf3);
                            Long lValueOf4 = Long.valueOf(jLongValue5 >> 12);
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault24 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2030658839);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault24 == null) {
                                char c7 = (char) (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                                int iRed = 876 - Color.red(0);
                                int scrollBarSize = (ViewConfiguration.getScrollBarSize() >> 8) + 10;
                                byte b12 = $$a[7];
                                Object[] objArr43 = new Object[1];
                                c((short) 106, b12, (byte) (b12 | 15), objArr43);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault24 = initSession.b(c7, iRed, scrollBarSize, -1650998592, false, (String) objArr43[0], null);
                            }
                            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault24).set(null, lValueOf4);
                        } catch (Exception unused2) {
                            throw new RuntimeException();
                        }
                    } else {
                        objArr40 = objArr40;
                        str3 = str;
                        str12 = "";
                    }
                    objArr3 = objArr40;
                    c = 2;
                } catch (Throwable th3) {
                    Throwable cause3 = th3.getCause();
                    if (cause3 != null) {
                        throw cause3;
                    }
                    throw th3;
                }
            }
            int i39 = ((int[]) objArr3[c])[0];
            int i40 = ((int[]) objArr3[0])[0];
            if (i40 != i39) {
                throw new RuntimeException(String.valueOf(i40));
            }
            int i41 = ((int[]) objArr3[1])[0];
            Object[] objArr44 = {new int[]{((int[]) objArr3[0])[0]}, new int[1], new int[]{((int[]) objArr3[2])[0]}, (String[]) objArr3[3]};
            int iIdentityHashCode2 = System.identityHashCode(this);
            int i42 = ~iIdentityHashCode2;
            int i43 = i41 + 2070192700 + (((~(866223066 | i42)) | (~((-906533296) | iIdentityHashCode2))) * (-370)) + (((~(iIdentityHashCode2 | 866223066)) | (~(i42 | (-906533296))) | 27329104) * (-370)) + 1521833888;
            int i44 = (i43 << 13) ^ i43;
            int i45 = i44 ^ (i44 >>> 17);
            ((int[]) objArr44[1])[0] = i45 ^ (i45 << 5);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault25 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(797565291);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault25 == null) {
                char cGreen = (char) Color.green(0);
                int scrollDefaultDelay = (ViewConfiguration.getScrollDefaultDelay() >> 16) + 2267;
                int i46 = (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 34;
                byte b13 = $$a[7];
                Object[] objArr45 = new Object[1];
                c((short) 158, b13, b13, objArr45);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault25 = initSession.b(cGreen, scrollDefaultDelay, i46, -887667012, false, (String) objArr45[0], null);
            }
            if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault25).getLong(null) != -1) {
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault26 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1013250600);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault26 == null) {
                    char minimumFlingVelocity = (char) (ViewConfiguration.getMinimumFlingVelocity() >> 16);
                    int iMyPid2 = 2267 - (Process.myPid() >> 22);
                    int i47 = (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 34;
                    byte b14 = $$a[7];
                    Object[] objArr46 = new Object[1];
                    c((short) 106, b14, (byte) (b14 | 15), objArr46);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault26 = initSession.b(minimumFlingVelocity, iMyPid2, i47, -654680577, false, (String) objArr46[0], null);
                }
                Object[] objArr47 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault26).get(null);
                objArr4 = new Object[]{new int[]{i}, strArr, new int[1], new int[]{i}};
                int i48 = ((int[]) objArr47[0])[0];
                int i49 = ((int[]) objArr47[3])[0];
                String[] strArr6 = (String[]) objArr47[1];
                int i50 = (int) Runtime.getRuntime().totalMemory();
                int i51 = ~((-613587556) | i50);
                int i52 = ~i50;
                int i53 = i51 | (~(195125760 | i52));
                int i54 = ~(613587555 | i52);
                int i55 = (((1986634735 + ((i53 | i54) * (-516))) + (((~(i50 | (-8389121))) | (~((-186736641) | i52))) * 516)) + ((186736640 | i54) * 516)) - 1398121050;
                int i56 = (i55 << 13) ^ i55;
                int i57 = i56 ^ (i56 >>> 17);
                ((int[]) objArr4[2])[0] = i57 ^ (i57 << 5);
                str3 = str3;
                str4 = str12;
                c2 = 3;
                objArr44 = objArr44;
            } else {
                Context applicationContext2 = (Context) Class.forName(str15).getMethod(str2, new Class[0]).invoke(null, null);
                if (applicationContext2 != null) {
                    applicationContext2 = ((applicationContext2 instanceof ContextWrapper) && ((ContextWrapper) applicationContext2).getBaseContext() == null) ? null : applicationContext2.getApplicationContext();
                }
                int iIntValue2 = ((Integer) Class.forName(str13).getMethod(str14, Object.class).invoke(null, this)).intValue();
                int i58 = TuitionPaymentFragmentbindingInflater1 + 125;
                g = i58 % 128;
                int i59 = i58 % 2;
                try {
                    Object[] objArr48 = {applicationContext2, Integer.valueOf(iIntValue2), 0, -1398121050};
                    byte[] bArr2 = $$d;
                    byte b15 = bArr2[8];
                    Object[] objArr49 = new Object[1];
                    d((byte) 101, b15, (short) (b15 | ByteCompanionObject.MAX_VALUE), objArr49);
                    Class<?> cls2 = Class.forName((String) objArr49[0]);
                    Object[] objArr50 = new Object[1];
                    d((byte) (-bArr2[195]), bArr2[437], (short) 140, objArr50);
                    Object[] objArr51 = (Object[]) cls2.getMethod((String) objArr50[0], Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr48);
                    if (applicationContext2 != null) {
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault27 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1013250600);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault27 == null) {
                            char cGreen2 = (char) Color.green(0);
                            int scrollDefaultDelay2 = (ViewConfiguration.getScrollDefaultDelay() >> 16) + 2267;
                            int scrollBarSize2 = 33 - (ViewConfiguration.getScrollBarSize() >> 8);
                            byte b16 = $$a[7];
                            Object[] objArr52 = new Object[1];
                            c((short) 106, b16, (byte) (b16 | 15), objArr52);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault27 = initSession.b(cGreen2, scrollDefaultDelay2, scrollBarSize2, -654680577, false, (String) objArr52[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault27).set(null, objArr51);
                        try {
                            long jLongValue6 = ((Long) Class.forName(str10).getDeclaredMethod(str3, new Class[0]).invoke(null, new Object[0])).longValue();
                            Long lValueOf5 = Long.valueOf(jLongValue6);
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault28 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(796641770);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault28 == null) {
                                char cResolveOpacity = (char) Drawable.resolveOpacity(0, 0);
                                int iKeyCodeFromString = KeyEvent.keyCodeFromString(str12) + 2267;
                                str4 = str12;
                                int iIndexOf5 = TextUtils.indexOf((CharSequence) str4, '0', 0) + 34;
                                short s6 = (short) $$b;
                                byte b17 = $$a[7];
                                Object[] objArr53 = new Object[1];
                                c(s6, b17, b17, objArr53);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault28 = initSession.b(cResolveOpacity, iKeyCodeFromString, iIndexOf5, -874156483, false, (String) objArr53[0], null);
                            } else {
                                str4 = str12;
                            }
                            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault28).set(null, lValueOf5);
                            Long lValueOf6 = Long.valueOf(jLongValue6 >> 12);
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault29 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(797565291);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault29 == null) {
                                char cArgb = (char) Color.argb(0, 0, 0, 0);
                                int iIndexOf6 = TextUtils.indexOf((CharSequence) str4, '0') + 2268;
                                int capsMode3 = TextUtils.getCapsMode(str4, 0, 0) + 33;
                                byte b18 = $$a[7];
                                Object[] objArr54 = new Object[1];
                                c((short) 158, b18, b18, objArr54);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault29 = initSession.b(cArgb, iIndexOf6, capsMode3, -887667012, false, (String) objArr54[0], null);
                            }
                            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault29).set(null, lValueOf6);
                        } catch (Exception unused3) {
                            throw new RuntimeException();
                        }
                    } else {
                        objArr51 = objArr51;
                        str3 = str3;
                        str4 = str12;
                        objArr44 = objArr44;
                    }
                    objArr4 = objArr51;
                    c2 = 3;
                } catch (Throwable th4) {
                    Throwable cause4 = th4.getCause();
                    if (cause4 != null) {
                        throw cause4;
                    }
                    throw th4;
                }
            }
            if (((int[]) objArr4[0])[0] != ((int[]) objArr4[c2])[0]) {
                ArrayList arrayList3 = new ArrayList();
                String[] strArr7 = (String[]) objArr4[1];
                if (strArr7 != null) {
                    for (String str18 : strArr7) {
                        arrayList3.add(str18);
                    }
                }
                throw new NullPointerException();
            }
            Object[] objArr55 = {new int[]{i}, strArr, new int[1], new int[]{i}};
            int i60 = ((int[]) objArr4[2])[0];
            int i61 = ((int[]) objArr4[0])[0];
            int i62 = ((int[]) objArr4[3])[0];
            String[] strArr8 = (String[]) objArr4[1];
            int iIdentityHashCode3 = System.identityHashCode(this);
            int i63 = i60 + (-1338910239) + (((~((~iIdentityHashCode3) | (-27))) | (~(799010367 | iIdentityHashCode3))) * (-302)) + ((~((-27) | iIdentityHashCode3)) * (-604)) + (((~(iIdentityHashCode3 | 799010341)) | 789307393) * 302);
            int i64 = (i63 << 13) ^ i63;
            int i65 = i64 ^ (i64 >>> 17);
            ((int[]) objArr55[2])[0] = i65 ^ (i65 << 5);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault30 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault30 == null) {
                char longPressTimeout = (char) (31533 - (ViewConfiguration.getLongPressTimeout() >> 16));
                int i66 = 921 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
                int doubleTapTimeout = 28 - (ViewConfiguration.getDoubleTapTimeout() >> 16);
                Object[] objArr56 = new Object[1];
                c((short) 106, (byte) 14, (byte) ($$b >>> 2), objArr56);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault30 = initSession.b(longPressTimeout, i66, doubleTapTimeout, -1048449946, false, (String) objArr56[0], null);
            }
            if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault30).getLong(null) != -1) {
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault31 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault31 == null) {
                    char edgeSlop = (char) ((ViewConfiguration.getEdgeSlop() >> 16) + 31533);
                    int keyRepeatDelay4 = 921 - (ViewConfiguration.getKeyRepeatDelay() >> 16);
                    int threadPriority = ((Process.getThreadPriority(0) + 20) >> 6) + 28;
                    byte b19 = $$a[7];
                    Object[] objArr57 = new Object[1];
                    c((short) 106, b19, (byte) (b19 | 15), objArr57);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault31 = initSession.b(edgeSlop, keyRepeatDelay4, threadPriority, -1142834547, false, (String) objArr57[0], null);
                }
                Object[] objArr58 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault31).get(null);
                objArr5 = new Object[]{new int[1], new int[]{((int[]) objArr58[1])[0]}, (Object[]) objArr58[2], new int[]{((int[]) objArr58[3])[0]}, (String[]) objArr58[4]};
                int startUptimeMillis2 = (int) Process.getStartUptimeMillis();
                int i67 = ~startUptimeMillis2;
                int i68 = (((443232256 + (((~((-816756625) | i67)) | (-957323020)) * (-865))) + ((~(startUptimeMillis2 | 816756624)) * 865)) + (((~((-957323020) | i67)) | (~(i67 | 816756624))) * 865)) - 1911351416;
                int i69 = (i68 << 13) ^ i68;
                int i70 = i69 ^ (i69 >>> 17);
                ((int[]) objArr5[0])[0] = i70 ^ (i70 << 5);
                objArr55 = objArr55;
                str14 = str14;
                str5 = str3;
            } else {
                Context applicationContext3 = (Context) Class.forName(str15).getMethod(str2, new Class[0]).invoke(null, null);
                if (applicationContext3 != null) {
                    applicationContext3 = ((applicationContext3 instanceof ContextWrapper) && ((ContextWrapper) applicationContext3).getBaseContext() == null) ? null : applicationContext3.getApplicationContext();
                }
                int iIntValue3 = ((Integer) Class.forName(str13).getMethod(str14, Object.class).invoke(null, this)).intValue();
                int i71 = TuitionPaymentFragmentbindingInflater1 + 111;
                g = i71 % 128;
                int i72 = i71 % 2;
                try {
                    Object[] objArr59 = {applicationContext3, Integer.valueOf(iIntValue3), 0, -1911351416};
                    byte[] bArr3 = $$d;
                    Object[] objArr60 = new Object[1];
                    d((byte) (-bArr3[15]), bArr3[4], (short) DerHeader.TAG_CLASS_PRIVATE, objArr60);
                    Class<?> cls3 = Class.forName((String) objArr60[0]);
                    byte b20 = bArr3[13];
                    Object[] objArr61 = new Object[1];
                    d((byte) 114, b20, (short) (b20 | 224), objArr61);
                    Object[] objArr62 = (Object[]) cls3.getMethod((String) objArr61[0], Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr59);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault32 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault32 == null) {
                        char cNormalizeMetaState = (char) (KeyEvent.normalizeMetaState(0) + 31533);
                        int iIndexOf7 = TextUtils.indexOf((CharSequence) str4, '0', 0, 0) + 922;
                        int iIndexOf8 = 27 - TextUtils.indexOf((CharSequence) str4, '0', 0, 0);
                        byte b21 = $$a[7];
                        Object[] objArr63 = new Object[1];
                        c((short) 106, b21, (byte) (b21 | 15), objArr63);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault32 = initSession.b(cNormalizeMetaState, iIndexOf7, iIndexOf8, -1142834547, false, (String) objArr63[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault32).set(null, objArr62);
                    try {
                        str5 = str3;
                        long jLongValue7 = ((Long) Class.forName(str10).getDeclaredMethod(str5, new Class[0]).invoke(null, new Object[0])).longValue();
                        Long lValueOf7 = Long.valueOf(jLongValue7);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault33 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(889369593);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault33 == null) {
                            char scrollBarFadeDuration = (char) ((ViewConfiguration.getScrollBarFadeDuration() >> 16) + 31533);
                            int i73 = (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 920;
                            int capsMode4 = 28 - TextUtils.getCapsMode(str4, 0, 0);
                            byte b22 = $$a[7];
                            Object[] objArr64 = new Object[1];
                            c((short) 158, b22, b22, objArr64);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault33 = initSession.b(scrollBarFadeDuration, i73, capsMode4, -778300370, false, (String) objArr64[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault33).set(null, lValueOf7);
                        Long lValueOf8 = Long.valueOf(jLongValue7 >> 12);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault34 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault34 == null) {
                            char c8 = (char) (31533 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)));
                            int trimmedLength4 = 921 - TextUtils.getTrimmedLength(str4);
                            int i74 = (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 28;
                            Object[] objArr65 = new Object[1];
                            c((short) 106, (byte) 14, (byte) ($$b >>> 2), objArr65);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault34 = initSession.b(c8, trimmedLength4, i74, -1048449946, false, (String) objArr65[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault34).set(null, lValueOf8);
                        objArr5 = objArr62;
                    } catch (Exception unused4) {
                        throw new RuntimeException();
                    }
                } catch (Throwable th5) {
                    Throwable cause5 = th5.getCause();
                    if (cause5 != null) {
                        throw cause5;
                    }
                    throw th5;
                }
            }
            int i75 = ((int[]) objArr5[1])[0];
            int i76 = ((int[]) objArr5[3])[0];
            if (i76 != i75) {
                ArrayList arrayList4 = new ArrayList();
                String[] strArr9 = (String[]) objArr5[4];
                if (strArr9 != null) {
                    for (String str19 : strArr9) {
                        arrayList4.add(str19);
                    }
                }
                throw new RuntimeException(String.valueOf(i76));
            }
            int i77 = ((int[]) objArr5[0])[0];
            Object[] objArr66 = {new int[1], new int[]{((int[]) objArr5[1])[0]}, (Object[]) objArr5[2], new int[]{((int[]) objArr5[3])[0]}, (String[]) objArr5[4]};
            int iIdentityHashCode4 = System.identityHashCode(this);
            int i78 = ~iIdentityHashCode4;
            int i79 = i77 + 1447165961 + (((~((-242640700) | i78)) | (~(iIdentityHashCode4 | 1531438944))) * 333) + (((~(iIdentityHashCode4 | (-242640700))) | (~(i78 | 1531438944))) * 333);
            int i80 = (i79 << 13) ^ i79;
            int i81 = i80 ^ (i80 >>> 17);
            ((int[]) objArr66[0])[0] = i81 ^ (i81 << 5);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault35 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(118372281);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault35 == null) {
                char c9 = (char) (37567 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)));
                int iLastIndexOf2 = 624 - TextUtils.lastIndexOf(str4, '0', 0, 0);
                int iCombineMeasuredStates = View.combineMeasuredStates(0, 0) + 14;
                Object[] objArr67 = new Object[1];
                c((short) 106, (byte) 14, (byte) ($$b >>> 2), objArr67);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault35 = initSession.b(c9, iLastIndexOf2, iCombineMeasuredStates, -477065106, false, (String) objArr67[0], null);
            }
            long j4 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault35).getLong(null);
            long jLongValue8 = ((Long) Class.forName(str10).getDeclaredMethod(str5, new Class[0]).invoke(null, new Object[0])).longValue();
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault36 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(559617152);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault36 == null) {
                char trimmedLength5 = (char) (TextUtils.getTrimmedLength(str4) + 37567);
                int iNormalizeMetaState2 = 625 - KeyEvent.normalizeMetaState(0);
                int i82 = 13 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1));
                short s7 = (short) $$b;
                byte b23 = $$a[7];
                Object[] objArr68 = new Object[1];
                c(s7, b23, b23, objArr68);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault36 = initSession.b(trimmedLength5, iNormalizeMetaState2, i82, -976899241, false, (String) objArr68[0], null);
            }
            if (j4 == ((jLongValue8 - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault36).getLong(null) << 52) >>> 52)) >> 12)) {
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault37 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(560540673);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault37 == null) {
                    char cCombineMeasuredStates = (char) (View.combineMeasuredStates(0, 0) + 37567);
                    int iIndexOf9 = 624 - TextUtils.indexOf((CharSequence) str4, '0', 0);
                    int trimmedLength6 = TextUtils.getTrimmedLength(str4) + 14;
                    byte b24 = $$a[7];
                    Object[] objArr69 = new Object[1];
                    c((short) 158, b24, b24, objArr69);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault37 = initSession.b(cCombineMeasuredStates, iIndexOf9, trimmedLength6, -973632554, false, (String) objArr69[0], null);
                }
                Object[] objArr70 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault37).get(null);
                int i83 = ((int[]) objArr70[2])[0];
                int i84 = ((int[]) objArr70[0])[0];
                String[] strArr10 = (String[]) objArr70[3];
                int iIdentityHashCode5 = System.identityHashCode(this);
                int i85 = (-300688064) + (((~((-186880978) | iIdentityHashCode5)) | 16781585) * 345) + (((~((-186880978) | (~iIdentityHashCode5))) | 1620075558) * 345) + ((~(iIdentityHashCode5 | (-16781586))) * 345) + 675824152;
                int i86 = (i85 << 13) ^ i85;
                int i87 = i86 ^ (i86 >>> 17);
                ((int[]) objArr6[1])[0] = i87 ^ (i87 << 5);
                objArr6 = new Object[]{new int[]{i84}, new int[1], new int[]{i83}, strArr10};
                str6 = str14;
            } else {
                Context applicationContext4 = (Context) Class.forName(str15).getMethod(str2, new Class[0]).invoke(null, null);
                if (applicationContext4 != null) {
                    applicationContext4 = ((applicationContext4 instanceof ContextWrapper) && ((ContextWrapper) applicationContext4).getBaseContext() == null) ? null : applicationContext4.getApplicationContext();
                }
                str6 = str14;
                int iIntValue4 = ((Integer) Class.forName(str13).getMethod(str6, Object.class).invoke(null, this)).intValue();
                Object[] objArr71 = new Object[1];
                a(new char[]{20, '0', 0, 23, 23, '*', 0, '%', ',', 1, 4, 30, 13944, 13944, 25, 28, ',', '#', Typography.dollar, '#', 28, '.', '+', '-', '#', '0', 2, ',', '/', '\n', 15, ',', '*', 22, '\b', '0', 13860, 13860, 7, 28, 4, 30, 14, 2, 6, '%', '.', 31, 26, 14, 7, 28, 14, 2, '\t', '0', '*', 1, 23, 2, 2, '\t', '\t', '0'}, (byte) (TextUtils.getCapsMode(str4, 0, 0) + 121), 64 - TextUtils.getCapsMode(str4, 0, 0), objArr71);
                Object[] objArr72 = new Object[1];
                a(new char[]{0, 24, 7, '(', 18, '!', '-', '+', '%', 6, 16, '/', '0', 20, '\t', 23, '\n', '0', Typography.amp, '*', 28, '.', 0, '%', 2, 23, '-', ',', '.', ',', '*', 1, ',', '-', 30, '\'', 20, '%', 27, 7, 20, '0', 0, '%', ',', 14, 13834, 13834, '-', 1, 13828, 13828, 2, 23, '0', '\n', 4, 3, '\t', 20, 26, 14, '%', 0}, (byte) ((ViewConfiguration.getPressedStateDuration() >> 16) + 97), 65 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), objArr72);
                try {
                    Object[] objArr73 = {applicationContext4, new String[]{(String) objArr71[0], (String) objArr72[0]}, Integer.valueOf(iIntValue4), 17, 675824152};
                    byte[] bArr4 = $$d;
                    byte b25 = bArr4[370];
                    byte b26 = bArr4[4];
                    Object[] objArr74 = new Object[1];
                    d(b25, b26, (short) (b26 | 225), objArr74);
                    Class<?> cls4 = Class.forName((String) objArr74[0]);
                    byte b27 = bArr4[13];
                    Object[] objArr75 = new Object[1];
                    d((byte) 114, b27, (short) (b27 | 224), objArr75);
                    Object[] objArr76 = (Object[]) cls4.getMethod((String) objArr75[0], Context.class, String[].class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr73);
                    int i88 = ((int[]) objArr76[0])[0];
                    int i89 = ((int[]) objArr76[2])[0];
                    if (applicationContext4 != null) {
                        int i90 = TuitionPaymentFragmentbindingInflater1 + 31;
                        g = i90 % 128;
                        int i91 = i90 % 2;
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault38 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(560540673);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault38 == null) {
                            char cRgb = (char) (Color.rgb(0, 0, 0) + 16814783);
                            int i92 = 626 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1));
                            int edgeSlop2 = (ViewConfiguration.getEdgeSlop() >> 16) + 14;
                            byte b28 = $$a[7];
                            Object[] objArr77 = new Object[1];
                            c((short) 158, b28, b28, objArr77);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault38 = initSession.b(cRgb, i92, edgeSlop2, -973632554, false, (String) objArr77[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault38).set(null, objArr76);
                        try {
                            str5 = str5;
                            long jLongValue9 = ((Long) Class.forName(str10).getDeclaredMethod(str5, new Class[0]).invoke(null, new Object[0])).longValue();
                            Long lValueOf9 = Long.valueOf(jLongValue9);
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault39 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(559617152);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault39 == null) {
                                char cMakeMeasureSpec = (char) (View.MeasureSpec.makeMeasureSpec(0, 0) + 37567);
                                int tapTimeout = 625 - (ViewConfiguration.getTapTimeout() >> 16);
                                int i93 = (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 13;
                                short s8 = (short) $$b;
                                byte b29 = $$a[7];
                                Object[] objArr78 = new Object[1];
                                c(s8, b29, b29, objArr78);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault39 = initSession.b(cMakeMeasureSpec, tapTimeout, i93, -976899241, false, (String) objArr78[0], null);
                            }
                            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault39).set(null, lValueOf9);
                            Long lValueOf10 = Long.valueOf(jLongValue9 >> 12);
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault40 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(118372281);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault40 == null) {
                                char c10 = (char) (37568 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)));
                                int iMyTid = (Process.myTid() >> 22) + 625;
                                int i94 = (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 15;
                                Object[] objArr79 = new Object[1];
                                c((short) 106, (byte) 14, (byte) ($$b >>> 2), objArr79);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault40 = initSession.b(c10, iMyTid, i94, -477065106, false, (String) objArr79[0], null);
                            }
                            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault40).set(null, lValueOf10);
                        } catch (Exception unused5) {
                            throw new RuntimeException();
                        }
                    } else {
                        objArr76 = objArr76;
                    }
                    objArr6 = objArr76;
                } catch (Throwable th6) {
                    Throwable cause6 = th6.getCause();
                    if (cause6 != null) {
                        throw cause6;
                    }
                    throw th6;
                }
            }
            if (((int[]) objArr6[2])[0] != ((int[]) objArr6[0])[0]) {
                ArrayList arrayList5 = new ArrayList();
                String[] strArr11 = (String[]) objArr6[3];
                if (strArr11 != null) {
                    for (String str20 : strArr11) {
                        arrayList5.add(str20);
                    }
                }
                throw new NullPointerException();
            }
            int i95 = TuitionPaymentFragmentbindingInflater1 + 67;
            g = i95 % 128;
            int i96 = i95 % 2;
            int i97 = ((int[]) objArr6[1])[0];
            int i98 = ((int[]) objArr6[2])[0];
            int i99 = ((int[]) objArr6[0])[0];
            String[] strArr12 = (String[]) objArr6[3];
            int iNextInt = new Random().nextInt();
            int i100 = ~iNextInt;
            int i101 = i97 + 320846508 + (((~((-1267836271) | i100)) | (~((-555901851) | iNextInt))) * 210) + (((~(iNextInt | (-1251050597))) | (~(i100 | (-539116177)))) * 210);
            int i102 = (i101 << 13) ^ i101;
            int i103 = i102 ^ (i102 >>> 17);
            ((int[]) objArr[1])[0] = i103 ^ (i103 << 5);
            Object[] objArr80 = {new int[]{i99}, new int[1], new int[]{i98}, strArr12};
            FirebaseApp.initializeApp(getContext());
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault41 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1309309962);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault41 == null) {
                char cLastIndexOf = (char) (53892 - TextUtils.lastIndexOf(str4, '0'));
                int i104 = (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 1319;
                int iIndexOf10 = 35 - TextUtils.indexOf((CharSequence) str4, '0');
                Object[] objArr81 = new Object[1];
                c((short) 106, (byte) 14, (byte) ($$b >>> 2), objArr81);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault41 = initSession.b(cLastIndexOf, i104, iIndexOf10, -1433084963, false, (String) objArr81[0], null);
            }
            if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault41).getLong(null) != -1) {
                int i105 = TuitionPaymentFragmentbindingInflater1 + 91;
                g = i105 % 128;
                int i106 = i105 % 2;
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault42 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1763547602);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault42 == null) {
                    char pressedStateDuration2 = (char) ((ViewConfiguration.getPressedStateDuration() >> 16) + 53893);
                    int offsetAfter = 1320 - TextUtils.getOffsetAfter(str4, 0);
                    int fadingEdgeLength2 = (ViewConfiguration.getFadingEdgeLength() >> 16) + 36;
                    byte b30 = $$a[7];
                    Object[] objArr82 = new Object[1];
                    c((short) 158, b30, b30, objArr82);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault42 = initSession.b(pressedStateDuration2, offsetAfter, fadingEdgeLength2, -1920778747, false, (String) objArr82[0], null);
                }
                Object[] objArr83 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault42).get(null);
                objArr7 = new Object[]{new int[]{i}, new int[1], strArr, new int[]{i}};
                int i107 = ((int[]) objArr83[0])[0];
                int i108 = ((int[]) objArr83[3])[0];
                String[] strArr13 = (String[]) objArr83[2];
                int iIdentityHashCode6 = System.identityHashCode(this);
                int i109 = ~(633359790 | iIdentityHashCode6);
                int i110 = (((632213402 + ((171020352 | i109) * (-814))) + ((i109 | ((~((~iIdentityHashCode6) | (-737268035))) | 67112108)) * 407)) + (((~(iIdentityHashCode6 | 737268034)) | ((~((-633359791) | iIdentityHashCode6)) | 67112108)) * 407)) - 998032955;
                int i111 = (i110 << 13) ^ i110;
                int i112 = i111 ^ (i111 >>> 17);
                ((int[]) objArr7[1])[0] = i112 ^ (i112 << 5);
                objArr80 = objArr80;
                str7 = str5;
                c3 = 3;
                str2 = str2;
            } else {
                Context applicationContext5 = (Context) Class.forName(str15).getMethod(str2, new Class[0]).invoke(null, null);
                if (applicationContext5 != null) {
                    applicationContext5 = ((applicationContext5 instanceof ContextWrapper) && ((ContextWrapper) applicationContext5).getBaseContext() == null) ? null : applicationContext5.getApplicationContext();
                }
                int iIntValue5 = ((Integer) Class.forName(str13).getMethod(str6, Object.class).invoke(null, this)).intValue();
                try {
                    Object[] objArr84 = {2141848474};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault43 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(41341784);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault43 == null) {
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault43 = initSession.b((char) (TextUtils.indexOf(str4, str4, 0, 0) + 47977), View.getDefaultSize(0, 0) + 1300, (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 20, -420973425, false, null, new Class[]{Integer.TYPE});
                    }
                    Object[] objArr85 = {applicationContext5, "com.bpjstku", -998032955, Integer.valueOf(iIntValue5), 643, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault43).newInstance(objArr84), false};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault44 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-733829592);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault44 == null) {
                        char cMakeMeasureSpec2 = (char) (View.MeasureSpec.makeMeasureSpec(0, 0) + 53893);
                        int trimmedLength7 = TextUtils.getTrimmedLength(str4) + 1320;
                        int i113 = 37 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1));
                        byte b31 = $$a[7];
                        Object[] objArr86 = new Object[1];
                        c((short) 158, b31, b31, objArr86);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault44 = initSession.b(cMakeMeasureSpec2, trimmedLength7, i113, 819724799, false, (String) objArr86[0], new Class[]{Context.class, String.class, Integer.TYPE, Integer.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) ((KeyEvent.getMaxKeyCode() >> 16) + 57878), (ViewConfiguration.getScrollBarSize() >> 8) + 1394, (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 75), Boolean.TYPE});
                    }
                    Object[] objArr87 = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault44).invoke(null, objArr85);
                    if (applicationContext5 != null) {
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault45 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1763547602);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault45 == null) {
                            char size = (char) (View.MeasureSpec.getSize(0) + 53893);
                            int iIndexOf11 = 1319 - TextUtils.indexOf((CharSequence) str4, '0');
                            int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0) + 36;
                            byte b32 = $$a[7];
                            Object[] objArr88 = new Object[1];
                            c((short) 158, b32, b32, objArr88);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault45 = initSession.b(size, iIndexOf11, iMakeMeasureSpec, -1920778747, false, (String) objArr88[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault45).set(null, objArr87);
                        try {
                            str7 = str5;
                            long jLongValue10 = ((Long) Class.forName(str10).getDeclaredMethod(str7, new Class[0]).invoke(null, new Object[0])).longValue();
                            Long lValueOf11 = Long.valueOf(jLongValue10);
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault46 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1351245985);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault46 == null) {
                                char deadChar2 = (char) (KeyEvent.getDeadChar(0, 0) + 53893);
                                int windowTouchSlop = 1320 - (ViewConfiguration.getWindowTouchSlop() >> 8);
                                int iResolveSize2 = View.resolveSize(0, 0) + 36;
                                byte b33 = $$a[7];
                                Object[] objArr89 = new Object[1];
                                c((short) 106, b33, (byte) (b33 | 15), objArr89);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault46 = initSession.b(deadChar2, windowTouchSlop, iResolveSize2, -1273706634, false, (String) objArr89[0], null);
                            }
                            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault46).set(null, lValueOf11);
                            Long lValueOf12 = Long.valueOf(jLongValue10 >> 12);
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault47 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1309309962);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault47 == null) {
                                char size2 = (char) (View.MeasureSpec.getSize(0) + 53893);
                                int i114 = 1320 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
                                int pressedStateDuration3 = 36 - (ViewConfiguration.getPressedStateDuration() >> 16);
                                Object[] objArr90 = new Object[1];
                                c((short) 106, (byte) 14, (byte) ($$b >>> 2), objArr90);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault47 = initSession.b(size2, i114, pressedStateDuration3, -1433084963, false, (String) objArr90[0], null);
                            }
                            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault47).set(null, lValueOf12);
                        } catch (Exception unused6) {
                            throw new RuntimeException();
                        }
                    } else {
                        objArr80 = objArr80;
                        objArr87 = objArr87;
                        str7 = str5;
                        str2 = str2;
                    }
                    objArr7 = objArr87;
                    c3 = 3;
                } catch (Throwable th7) {
                    Throwable cause7 = th7.getCause();
                    if (cause7 != null) {
                        throw cause7;
                    }
                    throw th7;
                }
            }
            if (((int[]) objArr7[0])[0] != ((int[]) objArr7[c3])[0]) {
                throw null;
            }
            Object[] objArr91 = {new int[]{i}, new int[1], strArr, new int[]{i}};
            int i115 = ((int[]) objArr7[1])[0];
            int i116 = ((int[]) objArr7[0])[0];
            int i117 = ((int[]) objArr7[3])[0];
            String[] strArr14 = (String[]) objArr7[2];
            int iIdentityHashCode7 = System.identityHashCode(this);
            int i118 = i115 + 1760814272 + (((-537927361) | iIdentityHashCode7) * (-627)) + (((~((-518127648) | iIdentityHashCode7)) | 852500177) * (-627)) + (((~(iIdentityHashCode7 | 852500177)) | (~((~iIdentityHashCode7) | 518127647))) * 627);
            int i119 = i118 ^ (i118 << 13);
            int i120 = i119 ^ (i119 >>> 17);
            ((int[]) objArr91[1])[0] = i120 ^ (i120 << 5);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault48 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault48 == null) {
                char c11 = (char) ((PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 29944);
                int minimumFlingVelocity2 = (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 1755;
                int longPressTimeout2 = 23 - (ViewConfiguration.getLongPressTimeout() >> 16);
                byte b34 = $$a[7];
                Object[] objArr92 = new Object[1];
                c((short) 106, b34, (byte) (b34 | 15), objArr92);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault48 = initSession.b(c11, minimumFlingVelocity2, longPressTimeout2, 986134021, false, (String) objArr92[0], null);
            }
            if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault48).getLong(null) != -1) {
                int i121 = TuitionPaymentFragmentbindingInflater1 + 3;
                g = i121 % 128;
                int i122 = i121 % 2;
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault49 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault49 == null) {
                    char cKeyCodeFromString = (char) (29944 - KeyEvent.keyCodeFromString(str4));
                    int absoluteGravity2 = Gravity.getAbsoluteGravity(0, 0) + 1755;
                    int absoluteGravity3 = 23 - Gravity.getAbsoluteGravity(0, 0);
                    byte b35 = $$a[7];
                    Object[] objArr93 = new Object[1];
                    c((short) 158, b35, b35, objArr93);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault49 = initSession.b(cKeyCodeFromString, absoluteGravity2, absoluteGravity3, 1599039318, false, (String) objArr93[0], null);
                }
                Object[] objArr94 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault49).get(null);
                objArr8 = new Object[]{new int[]{((int[]) objArr94[0])[0]}, new int[]{((int[]) objArr94[1])[0]}, (Object[]) objArr94[2], new int[1], (String[]) objArr94[4]};
                int iNextInt2 = new Random().nextInt();
                int i123 = (((-923525086) + (((~((-21766209) | (~iNextInt2))) | (-190836218)) * (-591))) + ((iNextInt2 | (-21766209)) * 591)) - 82854191;
                int i124 = (i123 << 13) ^ i123;
                int i125 = i124 ^ (i124 >>> 17);
                ((int[]) objArr8[3])[0] = i125 ^ (i125 << 5);
                objArr91 = objArr91;
            } else {
                int iIntValue6 = ((Integer) Class.forName(str13).getMethod(str6, Object.class).invoke(null, this)).intValue();
                Object[] objArr95 = {2141848474};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault50 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2063193834);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault50 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault50 = initSession.b((char) (ExpandableListView.getPackedPositionGroup(0L) + 42049), 1726 - View.resolveSizeAndState(0, 0, 0), 29 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), -1637387971, false, null, new Class[]{Integer.TYPE});
                }
                Object[] objArrB$7879113 = ScopeAlreadyCreatedException.b$7879113(iIntValue6, 0, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault50).newInstance(objArr95), -82854191, false, true);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault51 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault51 == null) {
                    char cMakeMeasureSpec3 = (char) (View.MeasureSpec.makeMeasureSpec(0, 0) + 29944);
                    int mode3 = 1755 - View.MeasureSpec.getMode(0);
                    int gidForName = Process.getGidForName(str4) + 24;
                    byte b36 = $$a[7];
                    Object[] objArr96 = new Object[1];
                    c((short) 158, b36, b36, objArr96);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault51 = initSession.b(cMakeMeasureSpec3, mode3, gidForName, 1599039318, false, (String) objArr96[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault51).set(null, objArrB$7879113);
                try {
                    long jLongValue11 = ((Long) Class.forName(str10).getDeclaredMethod(str7, new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf13 = Long.valueOf(jLongValue11);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault52 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1145728641);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault52 == null) {
                        char edgeSlop3 = (char) (29944 - (ViewConfiguration.getEdgeSlop() >> 16));
                        int bitsPerPixel = 1754 - ImageFormat.getBitsPerPixel(0);
                        int mode4 = View.MeasureSpec.getMode(0) + 23;
                        byte b37 = $$a[7];
                        Object[] objArr97 = new Object[1];
                        c((short) 69, b37, b37, objArr97);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault52 = initSession.b(edgeSlop3, bitsPerPixel, mode4, 1596667560, false, (String) objArr97[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault52).set(null, lValueOf13);
                    Long lValueOf14 = Long.valueOf(jLongValue11 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault53 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault53 == null) {
                        char keyRepeatTimeout = (char) (29944 - (ViewConfiguration.getKeyRepeatTimeout() >> 16));
                        int i126 = (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 1754;
                        int keyRepeatDelay5 = 23 - (ViewConfiguration.getKeyRepeatDelay() >> 16);
                        byte b38 = $$a[7];
                        Object[] objArr98 = new Object[1];
                        c((short) 106, b38, (byte) (b38 | 15), objArr98);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault53 = initSession.b(keyRepeatTimeout, i126, keyRepeatDelay5, 986134021, false, (String) objArr98[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault53).set(null, lValueOf14);
                    objArr8 = objArrB$7879113;
                } catch (Exception unused7) {
                    throw new RuntimeException();
                }
            }
            int i127 = ((int[]) objArr8[1])[0];
            int i128 = ((int[]) objArr8[0])[0];
            if (i128 == i127) {
                int i129 = ((int[]) objArr8[3])[0];
                objArr9 = new Object[]{new int[]{((int[]) objArr8[0])[0]}, new int[]{((int[]) objArr8[1])[0]}, (Object[]) objArr8[2], new int[1], (String[]) objArr8[4]};
                int i130 = (int) Runtime.getRuntime().totalMemory();
                int i131 = ~i130;
                int i132 = i129 + 706184329 + (((~(i131 | 629819409)) | (~(417216983 | i131)) | (-1037990360)) * 464) + (((-620773377) | i130) * (-464)) + (((~(i130 | 629819409)) | (-1037990360)) * 464);
                int i133 = (i132 << 13) ^ i132;
                int i134 = i133 ^ (i133 >>> 17);
                ((int[]) objArr9[3])[0] = i134 ^ (i134 << 5);
            } else {
                ArrayList arrayList6 = new ArrayList();
                String[] strArr15 = (String[]) objArr8[4];
                if (strArr15 != null) {
                    int i135 = g + 95;
                    TuitionPaymentFragmentbindingInflater1 = i135 % 128;
                    int i136 = i135 % 2;
                    for (String str21 : strArr15) {
                        arrayList6.add(str21);
                    }
                }
                int[] iArr3 = new int[i128];
                int i137 = i128 - 1;
                iArr3[i137] = 1;
                Toast.makeText((Context) null, iArr3[((i128 * i137) % 2) - 1], 1).show();
                int i138 = ((int[]) objArr8[3])[0];
                objArr9 = new Object[]{new int[]{((int[]) objArr8[0])[0]}, new int[]{((int[]) objArr8[1])[0]}, (Object[]) objArr8[2], new int[1], (String[]) objArr8[4]};
                int i139 = ~((int) Runtime.getRuntime().freeMemory());
                int i140 = i138 + 1074086083 + ((~((-138611858) | i139)) * (-783)) + (((~(i139 | (-474156700))) | (-686759126)) * 783);
                int i141 = (i140 << 13) ^ i140;
                int i142 = i141 ^ (i141 >>> 17);
                ((int[]) objArr9[3])[0] = i142 ^ (i142 << 5);
            }
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault54 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1354724972);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault54 == null) {
                char c12 = (char) ((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 43041);
                int iNormalizeMetaState3 = 3111 - KeyEvent.normalizeMetaState(0);
                int packedPositionType = 22 - ExpandableListView.getPackedPositionType(0L);
                short s9 = (short) $$b;
                byte b39 = $$a[7];
                Object[] objArr99 = new Object[1];
                c(s9, b39, b39, objArr99);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault54 = initSession.b(c12, iNormalizeMetaState3, packedPositionType, -1272852037, false, (String) objArr99[0], null);
            }
            if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault54).getLong(null) != -1) {
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault55 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-308143642);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault55 == null) {
                    char scrollBarSize3 = (char) (43042 - (ViewConfiguration.getScrollBarSize() >> 8));
                    int pressedStateDuration4 = (ViewConfiguration.getPressedStateDuration() >> 16) + 3111;
                    int i143 = 21 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1));
                    byte b40 = $$a[7];
                    Object[] objArr100 = new Object[1];
                    c((short) 106, b40, (byte) (b40 | 15), objArr100);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault55 = initSession.b(scrollBarSize3, pressedStateDuration4, i143, 154975793, false, (String) objArr100[0], null);
                }
                Object[] objArr101 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault55).get(null);
                int i144 = ((int[]) objArr101[2])[0];
                int i145 = ((int[]) objArr101[1])[0];
                String[] strArr16 = (String[]) objArr101[3];
                int[] iArr4 = {i145};
                int iIdentityHashCode8 = System.identityHashCode(this);
                int i146 = ((~((-83960609) | iIdentityHashCode8)) * 521) + 616174320 + (((~((~iIdentityHashCode8) | (-83960609))) | 1352532994) * 521) + 719761157;
                int i147 = (i146 << 13) ^ i146;
                int i148 = i147 ^ (i147 >>> 17);
                ((int[]) objArr10[0])[0] = i148 ^ (i148 << 5);
                objArr10 = new Object[]{new int[1], iArr4, new int[]{i144}, strArr16};
                objArr9 = objArr9;
            } else {
                int iIntValue7 = ((Integer) Class.forName(str13).getMethod(str6, Object.class).invoke(null, this)).intValue();
                int i149 = TuitionPaymentFragmentbindingInflater1 + 1;
                g = i149 % 128;
                int i150 = i149 % 2;
                try {
                    Object[] objArr102 = {null, Integer.valueOf(iIntValue7), 0, 719761157};
                    byte[] bArr5 = $$d;
                    byte b41 = bArr5[419];
                    byte b42 = bArr5[4];
                    Object[] objArr103 = new Object[1];
                    d(b41, b42, (short) (b42 | 297), objArr103);
                    Class<?> cls5 = Class.forName((String) objArr103[0]);
                    Object[] objArr104 = new Object[1];
                    d((byte) (-bArr5[195]), bArr5[437], (short) 140, objArr104);
                    Object[] objArr105 = (Object[]) cls5.getMethod((String) objArr104[0], Class.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr102);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault56 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-308143642);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault56 == null) {
                        char offsetAfter2 = (char) (TextUtils.getOffsetAfter(str4, 0) + 43042);
                        int i151 = 3111 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
                        int modifierMetaStateMask3 = ((byte) KeyEvent.getModifierMetaStateMask()) + 23;
                        byte b43 = $$a[7];
                        Object[] objArr106 = new Object[1];
                        c((short) 106, b43, (byte) (b43 | 15), objArr106);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault56 = initSession.b(offsetAfter2, i151, modifierMetaStateMask3, 154975793, false, (String) objArr106[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault56).set(null, objArr105);
                    try {
                        long jLongValue12 = ((Long) Class.forName(str10).getDeclaredMethod(str7, new Class[0]).invoke(null, new Object[0])).longValue();
                        Long lValueOf15 = Long.valueOf(jLongValue12);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault57 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1355648493);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault57 == null) {
                            char cIndexOf2 = (char) (TextUtils.indexOf(str4, str4, 0) + 43042);
                            int i152 = 3112 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1));
                            int tapTimeout2 = (ViewConfiguration.getTapTimeout() >> 16) + 22;
                            byte b44 = $$a[7];
                            Object[] objArr107 = new Object[1];
                            c((short) 158, b44, b44, objArr107);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault57 = initSession.b(cIndexOf2, i152, tapTimeout2, -1269618118, false, (String) objArr107[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault57).set(null, lValueOf15);
                        Long lValueOf16 = Long.valueOf(jLongValue12 >> 12);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault58 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1354724972);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault58 == null) {
                            char longPressTimeout3 = (char) ((ViewConfiguration.getLongPressTimeout() >> 16) + 43042);
                            int iAlpha = 3111 - Color.alpha(0);
                            int iLastIndexOf3 = 21 - TextUtils.lastIndexOf(str4, '0', 0);
                            short s10 = (short) $$b;
                            byte b45 = $$a[7];
                            Object[] objArr108 = new Object[1];
                            c(s10, b45, b45, objArr108);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault58 = initSession.b(longPressTimeout3, iAlpha, iLastIndexOf3, -1272852037, false, (String) objArr108[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault58).set(null, lValueOf16);
                        objArr10 = objArr105;
                    } catch (Exception unused8) {
                        throw new RuntimeException();
                    }
                } catch (Throwable th8) {
                    Throwable cause8 = th8.getCause();
                    if (cause8 != null) {
                        throw cause8;
                    }
                    throw th8;
                }
            }
            int i153 = ((int[]) objArr10[1])[0];
            int i154 = ((int[]) objArr10[2])[0];
            if (i154 != i153) {
                ArrayList arrayList7 = new ArrayList();
                String[] strArr17 = (String[]) objArr10[3];
                if (strArr17 != null) {
                    for (String str22 : strArr17) {
                        arrayList7.add(str22);
                    }
                }
                throw new RuntimeException(String.valueOf(i154));
            }
            int i155 = TuitionPaymentFragmentbindingInflater1 + 57;
            g = i155 % 128;
            int i156 = i155 % 2;
            int i157 = ((int[]) objArr10[0])[0];
            int i158 = ((int[]) objArr10[2])[0];
            int i159 = ((int[]) objArr10[1])[0];
            String[] strArr18 = (String[]) objArr10[3];
            int[] iArr5 = {i159};
            int i160 = ~System.identityHashCode(this);
            int i161 = i157 + (-692063934) + (((~(i160 | 3322021)) | (-1702803198)) * (-160)) + (((~(i160 | (-1701709438))) | 3322021) * 160);
            int i162 = (i161 << 13) ^ i161;
            int i163 = i162 ^ (i162 >>> 17);
            ((int[]) objArr[0])[0] = i163 ^ (i163 << 5);
            Object[] objArr109 = {new int[1], iArr5, new int[]{i158}, strArr18};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault59 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1545400921);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault59 == null) {
                char cNormalizeMetaState2 = (char) KeyEvent.normalizeMetaState(0);
                int iIndexOf12 = TextUtils.indexOf((CharSequence) str4, '0', 0, 0) + 877;
                int i164 = (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 10;
                byte[] bArr6 = $$a;
                Object[] objArr110 = new Object[1];
                c((short) (-bArr6[8]), (byte) (-bArr6[205]), (byte) 42, objArr110);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault59 = initSession.b(cNormalizeMetaState2, iIndexOf12, i164, -1199417970, false, (String) objArr110[0], null);
            }
            long j5 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault59).getLong(null);
            long jLongValue13 = ((Long) Class.forName(str10).getDeclaredMethod(str7, new Class[0]).invoke(null, new Object[0])).longValue();
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault60 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-340665130);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault60 == null) {
                char packedPositionType2 = (char) ExpandableListView.getPackedPositionType(0L);
                int mode5 = 876 - View.MeasureSpec.getMode(0);
                int mode6 = View.MeasureSpec.getMode(0) + 10;
                byte[] bArr7 = $$a;
                short s11 = bArr7[129];
                byte b46 = (byte) (-bArr7[33]);
                Object[] objArr111 = new Object[1];
                c(s11, b46, (byte) (b46 | 36), objArr111);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault60 = initSession.b(packedPositionType2, mode5, mode6, 254769921, false, (String) objArr111[0], null);
            }
            if (j5 == ((jLongValue13 - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault60).getLong(null) << 52) >>> 52)) >> 12)) {
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault61 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1435299656);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault61 == null) {
                    char doubleTapTimeout2 = (char) (ViewConfiguration.getDoubleTapTimeout() >> 16);
                    int gidForName2 = 875 - Process.getGidForName(str4);
                    int scrollBarFadeDuration2 = (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 10;
                    byte[] bArr8 = $$a;
                    Object[] objArr112 = new Object[1];
                    c(bArr8[129], (byte) (-bArr8[205]), (byte) (-bArr8[44]), objArr112);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault61 = initSession.b(doubleTapTimeout2, gidForName2, scrollBarFadeDuration2, 1324201839, false, (String) objArr112[0], null);
                }
                Object[] objArr113 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault61).get(null);
                objArr11 = new Object[]{new int[]{((int[]) objArr113[0])[0]}, new int[1], new int[]{((int[]) objArr113[2])[0]}, (String[]) objArr113[3]};
                int iMyUid = Process.myUid();
                int i165 = ~iMyUid;
                int i166 = 1461683252 + (((~((-685243200) | i165)) | 143071765 | (~(644932970 | i165))) * (-1136)) + (((~((-685243200) | iMyUid)) | (~(644932970 | iMyUid)) | (~((-102761537) | i165))) * (-568)) + (((~(iMyUid | (-143071766))) | (~(i165 | (-644932971))) | (~(685243199 | i165))) * 568) + 1222310178;
                int i167 = (i166 << 13) ^ i166;
                int i168 = i167 ^ (i167 >>> 17);
                ((int[]) objArr11[1])[0] = i168 ^ (i168 << 5);
                str8 = str7;
            } else {
                Object[] objArr114 = {Integer.valueOf(((Integer) Class.forName(str13).getMethod(str6, Object.class).invoke(null, this)).intValue()), 1222310178};
                byte[] bArr9 = $$d;
                byte b47 = (byte) (-bArr9[77]);
                byte b48 = bArr9[35];
                Object[] objArr115 = new Object[1];
                d(b47, b48, (short) (b48 | 390), objArr115);
                Class<?> cls6 = Class.forName((String) objArr115[0]);
                Object[] objArr116 = new Object[1];
                d((byte) (-bArr9[195]), bArr9[437], bArr9[20], objArr116);
                Object[] objArr117 = (Object[]) cls6.getMethod((String) objArr116[0], Integer.TYPE, Integer.TYPE).invoke(null, objArr114);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault62 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1435299656);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault62 == null) {
                    char cResolveOpacity2 = (char) Drawable.resolveOpacity(0, 0);
                    int i169 = (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 875;
                    int iMyPid3 = (Process.myPid() >> 22) + 10;
                    byte[] bArr10 = $$a;
                    Object[] objArr118 = new Object[1];
                    c(bArr10[129], (byte) (-bArr10[205]), (byte) (-bArr10[44]), objArr118);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault62 = initSession.b(cResolveOpacity2, i169, iMyPid3, 1324201839, false, (String) objArr118[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault62).set(null, objArr117);
                try {
                    str8 = str7;
                    long jLongValue14 = ((Long) Class.forName(str10).getDeclaredMethod(str8, new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf17 = Long.valueOf(jLongValue14);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault63 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-340665130);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault63 == null) {
                        char c13 = (char) (1 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)));
                        int i170 = 876 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1));
                        int maximumFlingVelocity = 10 - (ViewConfiguration.getMaximumFlingVelocity() >> 16);
                        byte[] bArr11 = $$a;
                        short s12 = bArr11[129];
                        byte b49 = (byte) (-bArr11[33]);
                        Object[] objArr119 = new Object[1];
                        c(s12, b49, (byte) (b49 | 36), objArr119);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault63 = initSession.b(c13, i170, maximumFlingVelocity, 254769921, false, (String) objArr119[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault63).set(null, lValueOf17);
                    Long lValueOf18 = Long.valueOf(jLongValue14 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault64 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1545400921);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault64 == null) {
                        char modifierMetaStateMask4 = (char) ((-1) - ((byte) KeyEvent.getModifierMetaStateMask()));
                        int touchSlop = (ViewConfiguration.getTouchSlop() >> 8) + 876;
                        int i171 = (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 9;
                        byte[] bArr12 = $$a;
                        Object[] objArr120 = new Object[1];
                        c((short) (-bArr12[8]), (byte) (-bArr12[205]), (byte) 42, objArr120);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault64 = initSession.b(modifierMetaStateMask4, touchSlop, i171, -1199417970, false, (String) objArr120[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault64).set(null, lValueOf18);
                    objArr11 = objArr117;
                } catch (Exception unused9) {
                    throw new RuntimeException();
                }
            }
            int i172 = ((int[]) objArr11[2])[0];
            int i173 = ((int[]) objArr11[0])[0];
            if (i173 == i172) {
                int i174 = ((int[]) objArr11[1])[0];
                objArr12 = new Object[]{new int[]{((int[]) objArr11[0])[0]}, new int[1], new int[]{((int[]) objArr11[2])[0]}, (String[]) objArr11[3]};
                int iMyTid2 = Process.myTid();
                int i175 = ~iMyTid2;
                int i176 = i174 + 1647575137 + (((~((-67642970) | i175)) | (~((-810696963) | iMyTid2)) | (~(905672671 | iMyTid2))) * 765) + (((~((-878339932) | i175)) | 67642969) * 1530) + (((~(iMyTid2 | (-878339932))) | (~(i175 | 905672671))) * 765);
                int i177 = i176 ^ (i176 << 13);
                int i178 = i177 ^ (i177 >>> 17);
                i2 = 0;
                ((int[]) objArr12[1])[0] = i178 ^ (i178 << 5);
            } else {
                ArrayList arrayList8 = new ArrayList();
                String[] strArr19 = (String[]) objArr11[3];
                if (strArr19 != null) {
                    for (String str23 : strArr19) {
                        arrayList8.add(str23);
                    }
                }
                int[] iArr6 = new int[i173];
                int i179 = i173 - 1;
                iArr6[i179] = 1;
                Toast.makeText((Context) null, iArr6[((i173 * i179) % 2) - 1], 1).show();
                int i180 = ((int[]) objArr11[1])[0];
                objArr12 = new Object[]{new int[]{((int[]) objArr11[0])[0]}, new int[1], new int[]{((int[]) objArr11[2])[0]}, (String[]) objArr11[3]};
                int iIdentityHashCode9 = System.identityHashCode(this);
                int i181 = ~iIdentityHashCode9;
                int i182 = i180 + 1088892124 + (((~(iIdentityHashCode9 | (-524425959))) | (~((-547954714) | i181)) | 507644484) * (-68)) + ((~((-16781475) | i181)) * (-68)) + (((~(524425958 | i181)) | (-564736188)) * 68);
                int i183 = (i182 << 13) ^ i182;
                int i184 = i183 ^ (i183 >>> 17);
                i2 = 0;
                ((int[]) objArr12[1])[0] = i184 ^ (i184 << 5);
            }
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault65 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-342512172);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault65 == null) {
                char cIndexOf3 = (char) ((-1) - TextUtils.indexOf((CharSequence) str4, '0', i2, i2));
                int jumpTapTimeout2 = 876 - (ViewConfiguration.getJumpTapTimeout() >> 16);
                int i185 = 11 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1));
                Object[] objArr121 = new Object[1];
                c((short) 106, (byte) 14, (byte) ($$b >>> 2), objArr121);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault65 = initSession.b(cIndexOf3, jumpTapTimeout2, i185, 252381699, false, (String) objArr121[0], null);
            }
            long j6 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault65).getLong(null);
            long jLongValue15 = ((Long) Class.forName(str10).getDeclaredMethod(str8, new Class[0]).invoke(null, new Object[0])).longValue();
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault66 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1823069286);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault66 == null) {
                char c14 = (char) (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1));
                int i186 = (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 877;
                int size3 = 10 - View.MeasureSpec.getSize(0);
                byte b50 = $$a[7];
                Object[] objArr122 = new Object[1];
                c((short) 69, b50, b50, objArr122);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault66 = initSession.b(c14, i186, size3, 2009631821, false, (String) objArr122[0], null);
            }
            if (j6 != ((jLongValue15 - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault66).getLong(null) << 52) >>> 52)) >> 12)) {
                Context applicationContext6 = (Context) Class.forName(str15).getMethod(str2, new Class[0]).invoke(null, null);
                if (applicationContext6 != null) {
                    applicationContext6 = ((applicationContext6 instanceof ContextWrapper) && ((ContextWrapper) applicationContext6).getBaseContext() == null) ? null : applicationContext6.getApplicationContext();
                }
                Object[] objArr123 = {applicationContext6, Integer.valueOf(((Integer) Class.forName(str13).getMethod(str6, Object.class).invoke(null, this)).intValue()), 1267193144};
                byte[] bArr13 = $$d;
                Object[] objArr124 = new Object[1];
                d(bArr13[8], bArr13[61], (short) TypedValues.CycleType.TYPE_WAVE_OFFSET, objArr124);
                Class<?> cls7 = Class.forName((String) objArr124[0]);
                Object[] objArr125 = new Object[1];
                d((byte) (-bArr13[195]), bArr13[437], bArr13[20], objArr125);
                objArr13 = (Object[]) cls7.getMethod((String) objArr125[0], Context.class, Integer.TYPE, Integer.TYPE).invoke(null, objArr123);
                if (applicationContext6 != null) {
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault67 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-337894567);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault67 == null) {
                        char cCombineMeasuredStates2 = (char) View.combineMeasuredStates(0, 0);
                        int modifierMetaStateMask5 = 875 - ((byte) KeyEvent.getModifierMetaStateMask());
                        int edgeSlop4 = (ViewConfiguration.getEdgeSlop() >> 16) + 10;
                        byte[] bArr14 = $$a;
                        Object[] objArr126 = new Object[1];
                        c(bArr14[7], bArr14[10], (byte) ($$b >>> 2), objArr126);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault67 = initSession.b(cCombineMeasuredStates2, modifierMetaStateMask5, edgeSlop4, 256017550, false, (String) objArr126[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault67).set(null, objArr13);
                    try {
                        long jLongValue16 = ((Long) Class.forName(str10).getDeclaredMethod(str8, new Class[0]).invoke(null, new Object[0])).longValue();
                        Long lValueOf19 = Long.valueOf(jLongValue16);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault68 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1823069286);
                        str9 = str4;
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault68 == null) {
                            char capsMode5 = (char) TextUtils.getCapsMode(str9, 0, 0);
                            int maximumFlingVelocity2 = 876 - (ViewConfiguration.getMaximumFlingVelocity() >> 16);
                            int iMyTid3 = 10 - (Process.myTid() >> 22);
                            byte b51 = $$a[7];
                            Object[] objArr127 = new Object[1];
                            c((short) 69, b51, b51, objArr127);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault68 = initSession.b(capsMode5, maximumFlingVelocity2, iMyTid3, 2009631821, false, (String) objArr127[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault68).set(null, lValueOf19);
                        Long lValueOf20 = Long.valueOf(jLongValue16 >> 12);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault69 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-342512172);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault69 == null) {
                            char cAxisFromString = (char) (MotionEvent.axisFromString(str9) + 1);
                            int iIndexOf13 = TextUtils.indexOf(str9, str9, 0) + 876;
                            int iAxisFromString = MotionEvent.axisFromString(str9) + 11;
                            Object[] objArr128 = new Object[1];
                            c((short) 106, (byte) 14, (byte) ($$b >>> 2), objArr128);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault69 = initSession.b(cAxisFromString, iIndexOf13, iAxisFromString, 252381699, false, (String) objArr128[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault69).set(null, lValueOf20);
                    } catch (Exception unused10) {
                        throw new RuntimeException();
                    }
                }
                if (((int[]) objArr13[0])[0] == ((int[]) objArr13[2])[0]) {
                    throw null;
                }
                int i187 = ((int[]) objArr13[1])[0];
                objArr14 = new Object[]{new int[]{((int[]) objArr13[0])[0]}, new int[1], new int[]{((int[]) objArr13[2])[0]}, (String[]) objArr13[3]};
                int startElapsedRealtime = (int) Process.getStartElapsedRealtime();
                int i188 = i187 + 674230692 + (((~((-76554787) | startElapsedRealtime)) | (~((-36244558) | startElapsedRealtime))) * 69) + (((~(startElapsedRealtime | (-980372958))) | (~((-1020683187) | startElapsedRealtime)) | 944128400) * (-69)) + 86429696;
                int i189 = i188 ^ (i188 << 13);
                int i190 = i189 ^ (i189 >>> 17);
                ((int[]) objArr14[1])[0] = i190 ^ (i190 << 5);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(650054);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    char defaultSize3 = (char) View.getDefaultSize(0, 0);
                    int iAxisFromString2 = MotionEvent.axisFromString(str9) + 652;
                    int iMyPid4 = (Process.myPid() >> 22) + 44;
                    byte b52 = $$a[7];
                    Object[] objArr129 = new Object[1];
                    c((short) 69, b52, b52, objArr129);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(defaultSize3, iAxisFromString2, iMyPid4, -459846511, false, (String) objArr129[0], null);
                }
                j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
                jLongValue = ((Long) Class.forName(str10).getDeclaredMethod(str8, new Class[0]).invoke(null, new Object[0])).longValue();
                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(795782016);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                    char c15 = (char) ((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) - 1);
                    int size4 = 651 - View.MeasureSpec.getSize(0);
                    int i191 = (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 43;
                    Object[] objArr130 = new Object[1];
                    c((short) 106, (byte) 14, (byte) ($$b >>> 2), objArr130);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(c15, size4, i191, -873460649, false, (String) objArr130[0], null);
                }
                if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1148961515);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault10 == null) {
                        char cLastIndexOf2 = (char) ((-1) - TextUtils.lastIndexOf(str9, '0', 0));
                        int i192 = (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 651;
                        int doubleTapTimeout3 = 44 - (ViewConfiguration.getDoubleTapTimeout() >> 16);
                        byte b53 = $$a[7];
                        Object[] objArr131 = new Object[1];
                        c((short) 106, b53, (byte) (b53 | 15), objArr131);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.b(cLastIndexOf2, i192, doubleTapTimeout3, -1595579076, false, (String) objArr131[0], null);
                    }
                    Object[] objArr132 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault10).get(null);
                    objArr15 = new Object[]{new int[]{i}, new String[0], new int[]{i}, new int[1]};
                    int i193 = ((int[]) objArr132[2])[0];
                    int i194 = ((int[]) objArr132[0])[0];
                    int iIdentityHashCode10 = System.identityHashCode(this);
                    int i195 = ~(176673627 | iIdentityHashCode10);
                    int i196 = 429636305 + (((-181926876) | i195) * (-814)) + ((i195 | (~((~iIdentityHashCode10) | 173242817)) | 167989569) * 407) + (((~(iIdentityHashCode10 | (-173242818))) | (~((-176673628) | iIdentityHashCode10)) | 167989569) * 407) + 304650325;
                    int i197 = (i196 << 13) ^ i196;
                    int i198 = i197 ^ (i197 >>> 17);
                    ((int[]) objArr15[3])[0] = i198 ^ (i198 << 5);
                    i3 = 0;
                } else {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1686493381);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) TextUtils.getCapsMode(str9, 0, 0), 1610 - (ViewConfiguration.getJumpTapTimeout() >> 16), TextUtils.indexOf((CharSequence) str9, '0', 0, 0) + 27, 2145681644, false, null, new Class[0]);
                    }
                    Object[] objArr133 = {null, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).newInstance(null), 304650325, 0};
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1625117732);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        char cAlpha = (char) Color.alpha(0);
                        int i199 = 652 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1));
                        int iRgb = (-16777172) - Color.rgb(0, 0, 0);
                        Object[] objArr134 = new Object[1];
                        c((short) 106, (byte) 14, (byte) ($$b >>> 2), objArr134);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(cAlpha, i199, iRgb, 2075921419, false, (String) objArr134[0], new Class[]{(Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) ((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) - 1), 695 - Color.red(0), (ViewConfiguration.getTapTimeout() >> 16) + 98), (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (63406 - View.MeasureSpec.makeMeasureSpec(0, 0)), (-16776423) - Color.rgb(0, 0, 0), 83 - Color.argb(0, 0, 0, 0)), Integer.TYPE, Integer.TYPE});
                    }
                    objArr15 = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr133);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1148961515);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                        char scrollBarSize4 = (char) (ViewConfiguration.getScrollBarSize() >> 8);
                        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0) + 651;
                        int iIndexOf14 = TextUtils.indexOf((CharSequence) str9, '0', 0) + 45;
                        byte b54 = $$a[7];
                        Object[] objArr135 = new Object[1];
                        c((short) 106, b54, (byte) (b54 | 15), objArr135);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(scrollBarSize4, iMakeMeasureSpec2, iIndexOf14, -1595579076, false, (String) objArr135[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, objArr15);
                    try {
                        long jLongValue17 = ((Long) Class.forName(str10).getDeclaredMethod(str8, new Class[0]).invoke(null, new Object[0])).longValue();
                        Long lValueOf21 = Long.valueOf(jLongValue17);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(795782016);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                            char maxKeyCode = (char) (KeyEvent.getMaxKeyCode() >> 16);
                            int mirror2 = AndroidCharacter.getMirror('0') + 603;
                            int modifierMetaStateMask6 = 43 - ((byte) KeyEvent.getModifierMetaStateMask());
                            Object[] objArr136 = new Object[1];
                            c((short) 106, (byte) 14, (byte) ($$b >>> 2), objArr136);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(maxKeyCode, mirror2, modifierMetaStateMask6, -873460649, false, (String) objArr136[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf21);
                        Long lValueOf22 = Long.valueOf(jLongValue17 >> 12);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(650054);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
                            char c16 = (char) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) - 1);
                            int maximumFlingVelocity3 = 651 - (ViewConfiguration.getMaximumFlingVelocity() >> 16);
                            int maximumFlingVelocity4 = 44 - (ViewConfiguration.getMaximumFlingVelocity() >> 16);
                            byte b55 = $$a[7];
                            Object[] objArr137 = new Object[1];
                            c((short) 69, b55, b55, objArr137);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(c16, maximumFlingVelocity3, maximumFlingVelocity4, -459846511, false, (String) objArr137[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).set(null, lValueOf22);
                        i3 = 0;
                    } catch (Exception unused11) {
                        throw new RuntimeException();
                    }
                }
                if (((int[]) objArr15[2])[i3] == ((int[]) objArr15[i3])[i3]) {
                    arrayList = new ArrayList();
                    strArr = (String[]) objArr15[1];
                    if (strArr != null) {
                        for (String str24 : strArr) {
                            int i200 = g + 79;
                            TuitionPaymentFragmentbindingInflater1 = i200 % 128;
                            int i201 = i200 % 2;
                            arrayList.add(str24);
                        }
                    }
                    throw null;
                }
                Object[] objArr138 = new Object[4];
                int[] iArr7 = new int[1];
                objArr138[i3] = iArr7;
                int[] iArr8 = new int[1];
                objArr138[2] = iArr8;
                objArr138[3] = new int[1];
                int i202 = ((int[]) objArr15[3])[i3];
                int i203 = ((int[]) objArr15[2])[i3];
                int i204 = ((int[]) objArr15[i3])[i3];
                iArr8[i3] = i203;
                iArr7[i3] = i204;
                objArr138[1] = new String[i3];
                int iNextInt3 = new Random().nextInt();
                int i205 = ~iNextInt3;
                int i206 = i202 + 1045776813 + ((534641659 | iNextInt3) * (-676)) + (((~(269333451 | i205)) | (-534641660)) * 676) + (((~(iNextInt3 | (-265308209))) | (~(i205 | 265902641)) | 268739018) * 676);
                int i207 = (i206 << 13) ^ i206;
                int i208 = i207 ^ (i207 >>> 17);
                ((int[]) objArr138[3])[0] = i208 ^ (i208 << 5);
                AtomicBoolean atomicBoolean = currentlyInitializing;
                int i209 = ((int[]) objArr44[1])[0];
                int i210 = i209 * i209;
                int i211 = -(1156870894 * i209);
                int i212 = (((i210 & i211) + (i210 | i211)) - (~(-(i209 * 1946998554)))) - 1;
                int i213 = (i212 ^ 1314793488) + ((1314793488 & i212) << 1);
                int i214 = i213 >> 26;
                int i215 = ((i214 ^ ComposerKt.defaultsKey) + ((i214 & ComposerKt.defaultsKey) << 1)) / 64;
                int i216 = (i215 & 1) + (i215 | 1);
                int i217 = (i213 ^ i216) + ((i216 & i213) << 1);
                int i218 = i213 >> 27;
                int i219 = (((i218 | (-63)) << 1) - (i218 ^ (-63))) / 32;
                int i220 = -(i217 ^ ((i219 ^ 1) + ((i219 & 1) << 1)));
                int i221 = (i220 & 7) + (i220 | 7);
                int i222 = ((i221 >> 19) - 16383) / 8192;
                int i223 = ((i222 | 1) << 1) - (i222 ^ 1);
                int i224 = 13965 / (((-(((i223 | 1) << 1) - (i223 ^ 1))) & i221) * 15);
                int i225 = ((int[]) objArr55[2])[0];
                int i226 = i225 * i225;
                int i227 = -(1083519183 * i225);
                int i228 = ((i226 | i227) << 1) - (i226 ^ i227);
                int i229 = -(i225 * 965311691);
                int i230 = ((i228 | i229) << 1) - (i229 ^ i228);
                int i231 = (i230 ^ (-76259287)) + (((-76259287) & i230) << 1);
                int i232 = i231 >> 15;
                int i233 = (-262143) & i232;
                int i234 = (((-262143) ^ i232) + (i233 << 1)) / 131072;
                int i235 = ((i234 | 1) << 1) - (i234 ^ 1);
                int i236 = (i233 + (i232 | (-262143))) / 131072;
                int i237 = -(((i236 & 1) + (i236 | 1)) ^ ((i231 ^ i235) + ((i231 & i235) << 1)));
                int i238 = ((i237 | 4) << 1) - (i237 ^ 4);
                int i239 = (((i238 >> 25) - 255) / 128) - (-1);
                int i240 = i224 + (524800 / (((-((i239 & 1) + (i239 | 1))) & i238) * 320));
                int i241 = ((int[]) objArr91[1])[0];
                int i242 = i241 * i241;
                int i243 = -(1699618340 * i241);
                int i244 = (i242 & i243) + (i242 | i243);
                int i245 = -(i241 * 326057006);
                int i246 = (i244 & i245) + (i245 | i244);
                int i247 = (i246 ^ (-683904879)) + (((-683904879) & i246) << 1);
                int i248 = i247 >> 16;
                int i249 = (-131071) ^ i248;
                int i250 = ((((-131071) | i248) << 1) - i249) / 65536;
                int i251 = ((i250 | 1) << 1) - (i250 ^ 1);
                int i252 = (i249 + ((i248 & (-131071)) << 1)) / 65536;
                int i253 = -((((i252 | 1) << 1) - (i252 ^ 1)) ^ (((i247 | i251) << 1) - (i247 ^ i251)));
                int i254 = (i253 ^ 2) + ((i253 & 2) << 1);
                int i255 = ((i254 >> 25) - 255) / 128;
                int i256 = (i255 & 1) + (i255 | 1);
                int i257 = i240 + (1913646 / (((-(((i256 | 1) << 1) - (i256 ^ 1))) & i254) * 1127));
                int i258 = ((int[]) objArr9[3])[0];
                int i259 = ((i258 * i258) - (~(-(547872347 * i258)))) - 1;
                int i260 = -(i258 * (-2076198463));
                int i261 = ((i259 | i260) << 1) - (i259 ^ i260);
                int i262 = ((i261 | (-281390908)) << 1) - ((-281390908) ^ i261);
                int i263 = i262 >> 19;
                int i264 = ((i263 ^ (-16383)) + ((i263 & (-16383)) << 1)) / 8192;
                int i265 = (i264 & 1) + (i264 | 1);
                int i266 = (i262 ^ i265) + ((i265 & i262) << 1);
                int i267 = i262 >> 29;
                int i268 = ((i267 & (-15)) + (i267 | (-15))) / 8;
                int i269 = -(((i268 ^ 1) + ((i268 & 1) << 1)) ^ i266);
                int i270 = (i269 & 6) + (i269 | 6);
                int i271 = i270 >> 17;
                int i272 = ((((-65535) | i271) << 1) - (i271 ^ (-65535))) / 32768;
                int i273 = (i272 ^ 1) + ((i272 & 1) << 1);
                int i274 = i257 + (6869070 / (((-((i273 & 1) + (i273 | 1))) & i270) * 1957));
                int i275 = ((int[]) objArr109[0])[0];
                int i276 = i275 * i275;
                int i277 = -(627586861 * i275);
                int i278 = (i276 ^ i277) + ((i276 & i277) << 1);
                int i279 = -(i275 * (-1125311029));
                int i280 = ((i278 & i279) + (i279 | i278)) - 633803760;
                int i281 = i280 >> 22;
                int i282 = ((i281 & (-2047)) + (i281 | (-2047))) / 1024;
                int i283 = (i282 & 1) + (i282 | 1);
                int i284 = ((i280 | i283) << 1) - (i283 ^ i280);
                int i285 = i280 >> 18;
                int i286 = ((i285 & (-32767)) + (i285 | (-32767))) / 16384;
                int i287 = (-(((i286 & 1) + (i286 | 1)) ^ i284)) + 9;
                int i288 = i287 >> 18;
                int i289 = (((i288 | (-32767)) << 1) - (i288 ^ (-32767))) / 16384;
                int i290 = (i289 ^ 1) + ((i289 & 1) << 1);
                int i291 = i274 + (10009350 / ((i287 & (-(((i290 | 1) << 1) - (i290 ^ 1)))) * 1534));
                int i292 = ((int[]) objArr12[1])[0];
                int i293 = ((((i292 * i292) - (~(-(252222011 * i292)))) - 1) - (~(-(i292 * (-1104263575))))) - 1;
                int i294 = (i293 ^ (-1936467388)) + (((-1936467388) & i293) << 1);
                int i295 = i294 >> 17;
                int i296 = ((((-65535) ^ i295) + ((i295 & (-65535)) << 1)) / 32768) - (-1);
                int i297 = (i294 ^ i296) + ((i296 & i294) << 1);
                int i298 = i294 >> 28;
                int i299 = -(i297 ^ (((((i298 | (-31)) << 1) - (i298 ^ (-31))) / 16) - (-1)));
                int i300 = (i299 ^ 5) + ((i299 & 5) << 1);
                int i301 = i300 >> 21;
                int i302 = ((i301 & (-4095)) + (i301 | (-4095))) / 2048;
                int i303 = i291 + (5930240 / (((-((((i302 | 1) << 1) - (i302 ^ 1)) - (-1))) & i300) * 1808));
                int i304 = ((int[]) objArr14[1])[0];
                int i305 = i304 * i304;
                int i306 = -(324545837 * i304);
                int i307 = ((i305 | i306) << 1) - (i305 ^ i306);
                int i308 = -(i304 * (-2016075675));
                int i309 = (i307 & i308) + (i308 | i307);
                int i310 = ((i309 | (-902477359)) << 1) - ((-902477359) ^ i309);
                int i311 = (((i310 >> 19) - 16383) / 8192) - (-1);
                int i312 = ((i310 | i311) << 1) - (i311 ^ i310);
                int i313 = ((i310 >> 28) - 31) / 16;
                int i314 = -(i312 ^ (((i313 | 1) << 1) - (i313 ^ 1)));
                int i315 = ((i314 | 8) << 1) - (i314 ^ 8);
                int i316 = i315 >> 28;
                int i317 = (((i316 | (-31)) << 1) - (i316 ^ (-31))) / 16;
                int i318 = (i317 ^ 1) + ((i317 & 1) << 1);
                atomicBoolean.set(i303 + ((-49402896) / (((-((i318 ^ 1) + ((i318 & 1) << 1))) & i315) * 1839)));
                int i319 = ((int[]) objArr2[2])[0];
                int i320 = ((((i319 * i319) - (~(-(753491505 * i319)))) - 1) - (~(-(i319 * (-2109099297))))) - 1;
                int i321 = (i320 & (-345978816)) + ((-345978816) | i320);
                int i322 = i321 >> 20;
                int i323 = ((i322 ^ (-8191)) + ((i322 & (-8191)) << 1)) / 4096;
                int i324 = (i321 - (~((i323 & 1) + (i323 | 1)))) - 1;
                int i325 = i321 >> 15;
                int i326 = ((((-262143) | i325) << 1) - (i325 ^ (-262143))) / 131072;
                int i327 = (-(i324 ^ ((i326 & 1) + (i326 | 1)))) + 3;
                int i328 = ((i327 >> 29) - 15) / 8;
                int i329 = (i328 & 1) + (i328 | 1);
                int i330 = 1470144 / ((i327 & (-((i329 & 1) + (i329 | 1)))) * 1178);
                int i331 = ((int[]) objArr66[0])[0];
                int i332 = i331 * i331;
                int i333 = -(660165277 * i331);
                int i334 = ((i332 | i333) << 1) - (i332 ^ i333);
                int i335 = -(i331 * 1101681981);
                int i336 = (i334 ^ i335) + ((i335 & i334) << 1);
                int i337 = (i336 ^ (-1941272215)) + (((-1941272215) & i336) << 1);
                int i338 = i337 >> 20;
                int i339 = (((i338 & (-8191)) + (i338 | (-8191))) / 4096) - (-1);
                int i340 = ((i337 | i339) << 1) - (i339 ^ i337);
                int i341 = i337 >> 26;
                int i342 = (-(i340 ^ (((((i341 | ComposerKt.defaultsKey) << 1) - (i341 ^ ComposerKt.defaultsKey)) / 64) - (-1)))) + 3;
                int i343 = i342 >> 24;
                int i344 = ((((i343 | (-511)) << 1) - (i343 ^ (-511))) / 256) - (-1);
                int i345 = i330 + (590010 / ((i342 & (-(((i344 | 1) << 1) - (i344 ^ 1)))) * 355));
                int i346 = ((int[]) objArr80[1])[0];
                int i347 = i346 * i346;
                int i348 = -(642006777 * i346);
                int i349 = ((((i347 | i348) << 1) - (i347 ^ i348)) - (~(-(i346 * (-2049160503))))) - 1;
                int i350 = (i349 ^ (-626504255)) + (((-626504255) & i349) << 1);
                int i351 = ((i350 >> 25) - 255) / 128;
                int i352 = (i350 - (~((i351 & 1) + (i351 | 1)))) - 1;
                int i353 = i350 >> 17;
                int i354 = (((-65535) ^ i353) + ((i353 & (-65535)) << 1)) / 32768;
                int i355 = -(i352 ^ ((i354 & 1) + (i354 | 1)));
                int i356 = (i355 ^ 7) + ((i355 & 7) << 1);
                int i357 = i356 >> 21;
                int i358 = (((i357 & (-4095)) + (i357 | (-4095))) / 2048) - (-1);
                int i359 = i345 + (4693794 / (((-(((i358 | 1) << 1) - (i358 ^ 1))) & i356) * 1978));
                int i360 = ((int[]) objArr138[3])[0];
                int i361 = ((i360 * i360) - (~(-(1841607508 * i360)))) - 1;
                int i362 = -(i360 * (-2023757626));
                int i363 = ((i361 | i362) << 1) - (i362 ^ i361);
                int i364 = (i363 ^ (-2103448407)) + (((-2103448407) & i363) << 1);
                int i365 = i364 >> 19;
                int i366 = ((i365 ^ (-16383)) + ((i365 & (-16383)) << 1)) / 8192;
                int i367 = ((i366 | 1) << 1) - (i366 ^ 1);
                int i368 = ((i364 | i367) << 1) - (i367 ^ i364);
                int i369 = i364 >> 26;
                int i370 = -(i368 ^ ((((i369 ^ ComposerKt.defaultsKey) + ((i369 & ComposerKt.defaultsKey) << 1)) / 64) - (-1)));
                int i371 = ((i370 | 8) << 1) - (i370 ^ 8);
                int i372 = i371 >> 19;
                int i373 = ((i372 ^ (-16383)) + ((i372 & (-16383)) << 1)) / 8192;
                int i374 = (i373 & 1) + (i373 | 1);
                return i359 + ((-20169072) / (((-((i374 & 1) + (i374 | 1))) & i371) * 1926));
            }
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault70 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-337894567);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault70 == null) {
                char keyRepeatTimeout2 = (char) (ViewConfiguration.getKeyRepeatTimeout() >> 16);
                int iNormalizeMetaState4 = 876 - KeyEvent.normalizeMetaState(0);
                int iAlpha2 = 10 - Color.alpha(0);
                byte[] bArr15 = $$a;
                Object[] objArr139 = new Object[1];
                c(bArr15[7], bArr15[10], (byte) ($$b >>> 2), objArr139);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault70 = initSession.b(keyRepeatTimeout2, iNormalizeMetaState4, iAlpha2, 256017550, false, (String) objArr139[0], null);
            }
            Object[] objArr140 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault70).get(null);
            objArr13 = new Object[]{new int[]{((int[]) objArr140[0])[0]}, new int[1], new int[]{((int[]) objArr140[2])[0]}, (String[]) objArr140[3]};
            int iNextInt4 = new Random().nextInt();
            int i375 = ~iNextInt4;
            int i376 = 469928980 + ((935009023 | iNextInt4) * (-676)) + (((~(890902642 | i375)) | (-935009024)) * 676) + (((~(iNextInt4 | (-44106382))) | (~(i375 | 850592413)) | 84416610) * 676) + 1267193144;
            int i377 = (i376 << 13) ^ i376;
            int i378 = i377 ^ (i377 >>> 17);
            ((int[]) objArr13[1])[0] = i378 ^ (i378 << 5);
            str9 = str4;
            if (((int[]) objArr13[0])[0] == ((int[]) objArr13[2])[0]) {
                throw null;
            }
            int i1810 = ((int[]) objArr13[1])[0];
            objArr14 = new Object[]{new int[]{((int[]) objArr13[0])[0]}, new int[1], new int[]{((int[]) objArr13[2])[0]}, (String[]) objArr13[3]};
            int startElapsedRealtime2 = (int) Process.getStartElapsedRealtime();
            int i1811 = i1810 + 674230692 + (((~((-76554787) | startElapsedRealtime2)) | (~((-36244558) | startElapsedRealtime2))) * 69) + (((~(startElapsedRealtime2 | (-980372958))) | (~((-1020683187) | startElapsedRealtime2)) | 944128400) * (-69)) + 86429696;
            int i1812 = i1811 ^ (i1811 << 13);
            int i1910 = i1812 ^ (i1812 >>> 17);
            ((int[]) objArr14[1])[0] = i1910 ^ (i1910 << 5);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(650054);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                char defaultSize4 = (char) View.getDefaultSize(0, 0);
                int iAxisFromString3 = MotionEvent.axisFromString(str9) + 652;
                int iMyPid5 = (Process.myPid() >> 22) + 44;
                byte b56 = $$a[7];
                Object[] objArr1210 = new Object[1];
                c((short) 69, b56, b56, objArr1210);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(defaultSize4, iAxisFromString3, iMyPid5, -459846511, false, (String) objArr1210[0], null);
            }
            j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
            jLongValue = ((Long) Class.forName(str10).getDeclaredMethod(str8, new Class[0]).invoke(null, new Object[0])).longValue();
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(795782016);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                char c17 = (char) ((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) - 1);
                int size5 = 651 - View.MeasureSpec.getSize(0);
                int i1911 = (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 43;
                Object[] objArr1310 = new Object[1];
                c((short) 106, (byte) 14, (byte) ($$b >>> 2), objArr1310);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(c17, size5, i1911, -873460649, false, (String) objArr1310[0], null);
            }
            if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1148961515);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault10 == null) {
                    char cLastIndexOf3 = (char) ((-1) - TextUtils.lastIndexOf(str9, '0', 0));
                    int i1912 = (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 651;
                    int doubleTapTimeout4 = 44 - (ViewConfiguration.getDoubleTapTimeout() >> 16);
                    byte b57 = $$a[7];
                    Object[] objArr1311 = new Object[1];
                    c((short) 106, b57, (byte) (b57 | 15), objArr1311);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.b(cLastIndexOf3, i1912, doubleTapTimeout4, -1595579076, false, (String) objArr1311[0], null);
                }
                Object[] objArr1312 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault10).get(null);
                objArr15 = new Object[]{new int[]{i194}, new String[0], new int[]{i193}, new int[1]};
                int i1913 = ((int[]) objArr1312[2])[0];
                int i1914 = ((int[]) objArr1312[0])[0];
                int iIdentityHashCode11 = System.identityHashCode(this);
                int i1915 = ~(176673627 | iIdentityHashCode11);
                int i1916 = 429636305 + (((-181926876) | i1915) * (-814)) + ((i1915 | (~((~iIdentityHashCode11) | 173242817)) | 167989569) * 407) + (((~(iIdentityHashCode11 | (-173242818))) | (~((-176673628) | iIdentityHashCode11)) | 167989569) * 407) + 304650325;
                int i1917 = (i1916 << 13) ^ i1916;
                int i1918 = i1917 ^ (i1917 >>> 17);
                ((int[]) objArr15[3])[0] = i1918 ^ (i1918 << 5);
                i3 = 0;
            } else {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1686493381);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) TextUtils.getCapsMode(str9, 0, 0), 1610 - (ViewConfiguration.getJumpTapTimeout() >> 16), TextUtils.indexOf((CharSequence) str9, '0', 0, 0) + 27, 2145681644, false, null, new Class[0]);
                }
                Object[] objArr1313 = {null, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).newInstance(null), 304650325, 0};
                objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1625117732);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    char cAlpha2 = (char) Color.alpha(0);
                    int i1919 = 652 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1));
                    int iRgb2 = (-16777172) - Color.rgb(0, 0, 0);
                    Object[] objArr1314 = new Object[1];
                    c((short) 106, (byte) 14, (byte) ($$b >>> 2), objArr1314);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(cAlpha2, i1919, iRgb2, 2075921419, false, (String) objArr1314[0], new Class[]{(Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) ((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) - 1), 695 - Color.red(0), (ViewConfiguration.getTapTimeout() >> 16) + 98), (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (63406 - View.MeasureSpec.makeMeasureSpec(0, 0)), (-16776423) - Color.rgb(0, 0, 0), 83 - Color.argb(0, 0, 0, 0)), Integer.TYPE, Integer.TYPE});
                }
                objArr15 = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr1313);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1148961515);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                    char scrollBarSize5 = (char) (ViewConfiguration.getScrollBarSize() >> 8);
                    int iMakeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(0, 0) + 651;
                    int iIndexOf15 = TextUtils.indexOf((CharSequence) str9, '0', 0) + 45;
                    byte b58 = $$a[7];
                    Object[] objArr1315 = new Object[1];
                    c((short) 106, b58, (byte) (b58 | 15), objArr1315);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(scrollBarSize5, iMakeMeasureSpec3, iIndexOf15, -1595579076, false, (String) objArr1315[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, objArr15);
                long jLongValue18 = ((Long) Class.forName(str10).getDeclaredMethod(str8, new Class[0]).invoke(null, new Object[0])).longValue();
                Long lValueOf23 = Long.valueOf(jLongValue18);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(795782016);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                    char maxKeyCode2 = (char) (KeyEvent.getMaxKeyCode() >> 16);
                    int mirror3 = AndroidCharacter.getMirror('0') + 603;
                    int modifierMetaStateMask7 = 43 - ((byte) KeyEvent.getModifierMetaStateMask());
                    Object[] objArr1316 = new Object[1];
                    c((short) 106, (byte) 14, (byte) ($$b >>> 2), objArr1316);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(maxKeyCode2, mirror3, modifierMetaStateMask7, -873460649, false, (String) objArr1316[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf23);
                Long lValueOf24 = Long.valueOf(jLongValue18 >> 12);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(650054);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
                    char c18 = (char) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) - 1);
                    int maximumFlingVelocity5 = 651 - (ViewConfiguration.getMaximumFlingVelocity() >> 16);
                    int maximumFlingVelocity6 = 44 - (ViewConfiguration.getMaximumFlingVelocity() >> 16);
                    byte b59 = $$a[7];
                    Object[] objArr1317 = new Object[1];
                    c((short) 69, b59, b59, objArr1317);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(c18, maximumFlingVelocity5, maximumFlingVelocity6, -459846511, false, (String) objArr1317[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).set(null, lValueOf24);
                i3 = 0;
            }
            if (((int[]) objArr15[2])[i3] == ((int[]) objArr15[i3])[i3]) {
                arrayList = new ArrayList();
                strArr = (String[]) objArr15[1];
                if (strArr != null) {
                    while (i4 < strArr.length) {
                        int i2010 = g + 79;
                        TuitionPaymentFragmentbindingInflater1 = i2010 % 128;
                        int i2011 = i2010 % 2;
                        arrayList.add(str24);
                    }
                }
                throw null;
            }
            Object[] objArr1318 = new Object[4];
            int[] iArr9 = new int[1];
            objArr1318[i3] = iArr9;
            int[] iArr10 = new int[1];
            objArr1318[2] = iArr10;
            objArr1318[3] = new int[1];
            int i2012 = ((int[]) objArr15[3])[i3];
            int i2013 = ((int[]) objArr15[2])[i3];
            int i2014 = ((int[]) objArr15[i3])[i3];
            iArr10[i3] = i2013;
            iArr9[i3] = i2014;
            objArr1318[1] = new String[i3];
            int iNextInt5 = new Random().nextInt();
            int i2015 = ~iNextInt5;
            int i2016 = i2012 + 1045776813 + ((534641659 | iNextInt5) * (-676)) + (((~(269333451 | i2015)) | (-534641660)) * 676) + (((~(iNextInt5 | (-265308209))) | (~(i2015 | 265902641)) | 268739018) * 676);
            int i2017 = (i2016 << 13) ^ i2016;
            int i2018 = i2017 ^ (i2017 >>> 17);
            ((int[]) objArr1318[3])[0] = i2018 ^ (i2018 << 5);
            AtomicBoolean atomicBoolean2 = currentlyInitializing;
            int i2019 = ((int[]) objArr44[1])[0];
            int i2110 = i2019 * i2019;
            int i2111 = -(1156870894 * i2019);
            int i2112 = (((i2110 & i2111) + (i2110 | i2111)) - (~(-(i2019 * 1946998554)))) - 1;
            int i2113 = (i2112 ^ 1314793488) + ((1314793488 & i2112) << 1);
            int i2114 = i2113 >> 26;
            int i2115 = ((i2114 ^ ComposerKt.defaultsKey) + ((i2114 & ComposerKt.defaultsKey) << 1)) / 64;
            int i2116 = (i2115 & 1) + (i2115 | 1);
            int i2117 = (i2113 ^ i2116) + ((i2116 & i2113) << 1);
            int i2118 = i2113 >> 27;
            int i2119 = (((i2118 | (-63)) << 1) - (i2118 ^ (-63))) / 32;
            int i2210 = -(i2117 ^ ((i2119 ^ 1) + ((i2119 & 1) << 1)));
            int i2211 = (i2210 & 7) + (i2210 | 7);
            int i2212 = ((i2211 >> 19) - 16383) / 8192;
            int i2213 = ((i2212 | 1) << 1) - (i2212 ^ 1);
            int i2214 = 13965 / (((-(((i2213 | 1) << 1) - (i2213 ^ 1))) & i2211) * 15);
            int i2215 = ((int[]) objArr55[2])[0];
            int i2216 = i2215 * i2215;
            int i2217 = -(1083519183 * i2215);
            int i2218 = ((i2216 | i2217) << 1) - (i2216 ^ i2217);
            int i2219 = -(i2215 * 965311691);
            int i2310 = ((i2218 | i2219) << 1) - (i2219 ^ i2218);
            int i2311 = (i2310 ^ (-76259287)) + (((-76259287) & i2310) << 1);
            int i2312 = i2311 >> 15;
            int i2313 = (-262143) & i2312;
            int i2314 = (((-262143) ^ i2312) + (i2313 << 1)) / 131072;
            int i2315 = ((i2314 | 1) << 1) - (i2314 ^ 1);
            int i2316 = (i2313 + (i2312 | (-262143))) / 131072;
            int i2317 = -(((i2316 & 1) + (i2316 | 1)) ^ ((i2311 ^ i2315) + ((i2311 & i2315) << 1)));
            int i2318 = ((i2317 | 4) << 1) - (i2317 ^ 4);
            int i2319 = (((i2318 >> 25) - 255) / 128) - (-1);
            int i2410 = i2214 + (524800 / (((-((i2319 & 1) + (i2319 | 1))) & i2318) * 320));
            int i2411 = ((int[]) objArr91[1])[0];
            int i2412 = i2411 * i2411;
            int i2413 = -(1699618340 * i2411);
            int i2414 = (i2412 & i2413) + (i2412 | i2413);
            int i2415 = -(i2411 * 326057006);
            int i2416 = (i2414 & i2415) + (i2415 | i2414);
            int i2417 = (i2416 ^ (-683904879)) + (((-683904879) & i2416) << 1);
            int i2418 = i2417 >> 16;
            int i2419 = (-131071) ^ i2418;
            int i2510 = ((((-131071) | i2418) << 1) - i2419) / 65536;
            int i2511 = ((i2510 | 1) << 1) - (i2510 ^ 1);
            int i2512 = (i2419 + ((i2418 & (-131071)) << 1)) / 65536;
            int i2513 = -((((i2512 | 1) << 1) - (i2512 ^ 1)) ^ (((i2417 | i2511) << 1) - (i2417 ^ i2511)));
            int i2514 = (i2513 ^ 2) + ((i2513 & 2) << 1);
            int i2515 = ((i2514 >> 25) - 255) / 128;
            int i2516 = (i2515 & 1) + (i2515 | 1);
            int i2517 = i2410 + (1913646 / (((-(((i2516 | 1) << 1) - (i2516 ^ 1))) & i2514) * 1127));
            int i2518 = ((int[]) objArr9[3])[0];
            int i2519 = ((i2518 * i2518) - (~(-(547872347 * i2518)))) - 1;
            int i2610 = -(i2518 * (-2076198463));
            int i2611 = ((i2519 | i2610) << 1) - (i2519 ^ i2610);
            int i2612 = ((i2611 | (-281390908)) << 1) - ((-281390908) ^ i2611);
            int i2613 = i2612 >> 19;
            int i2614 = ((i2613 ^ (-16383)) + ((i2613 & (-16383)) << 1)) / 8192;
            int i2615 = (i2614 & 1) + (i2614 | 1);
            int i2616 = (i2612 ^ i2615) + ((i2615 & i2612) << 1);
            int i2617 = i2612 >> 29;
            int i2618 = ((i2617 & (-15)) + (i2617 | (-15))) / 8;
            int i2619 = -(((i2618 ^ 1) + ((i2618 & 1) << 1)) ^ i2616);
            int i2710 = (i2619 & 6) + (i2619 | 6);
            int i2711 = i2710 >> 17;
            int i2712 = ((((-65535) | i2711) << 1) - (i2711 ^ (-65535))) / 32768;
            int i2713 = (i2712 ^ 1) + ((i2712 & 1) << 1);
            int i2714 = i2517 + (6869070 / (((-((i2713 & 1) + (i2713 | 1))) & i2710) * 1957));
            int i2715 = ((int[]) objArr109[0])[0];
            int i2716 = i2715 * i2715;
            int i2717 = -(627586861 * i2715);
            int i2718 = (i2716 ^ i2717) + ((i2716 & i2717) << 1);
            int i2719 = -(i2715 * (-1125311029));
            int i2810 = ((i2718 & i2719) + (i2719 | i2718)) - 633803760;
            int i2811 = i2810 >> 22;
            int i2812 = ((i2811 & (-2047)) + (i2811 | (-2047))) / 1024;
            int i2813 = (i2812 & 1) + (i2812 | 1);
            int i2814 = ((i2810 | i2813) << 1) - (i2813 ^ i2810);
            int i2815 = i2810 >> 18;
            int i2816 = ((i2815 & (-32767)) + (i2815 | (-32767))) / 16384;
            int i2817 = (-(((i2816 & 1) + (i2816 | 1)) ^ i2814)) + 9;
            int i2818 = i2817 >> 18;
            int i2819 = (((i2818 | (-32767)) << 1) - (i2818 ^ (-32767))) / 16384;
            int i2910 = (i2819 ^ 1) + ((i2819 & 1) << 1);
            int i2911 = i2714 + (10009350 / ((i2817 & (-(((i2910 | 1) << 1) - (i2910 ^ 1)))) * 1534));
            int i2912 = ((int[]) objArr12[1])[0];
            int i2913 = ((((i2912 * i2912) - (~(-(252222011 * i2912)))) - 1) - (~(-(i2912 * (-1104263575))))) - 1;
            int i2914 = (i2913 ^ (-1936467388)) + (((-1936467388) & i2913) << 1);
            int i2915 = i2914 >> 17;
            int i2916 = ((((-65535) ^ i2915) + ((i2915 & (-65535)) << 1)) / 32768) - (-1);
            int i2917 = (i2914 ^ i2916) + ((i2916 & i2914) << 1);
            int i2918 = i2914 >> 28;
            int i2919 = -(i2917 ^ (((((i2918 | (-31)) << 1) - (i2918 ^ (-31))) / 16) - (-1)));
            int i3010 = (i2919 ^ 5) + ((i2919 & 5) << 1);
            int i3011 = i3010 >> 21;
            int i3012 = ((i3011 & (-4095)) + (i3011 | (-4095))) / 2048;
            int i3013 = i2911 + (5930240 / (((-((((i3012 | 1) << 1) - (i3012 ^ 1)) - (-1))) & i3010) * 1808));
            int i3014 = ((int[]) objArr14[1])[0];
            int i3015 = i3014 * i3014;
            int i3016 = -(324545837 * i3014);
            int i3017 = ((i3015 | i3016) << 1) - (i3015 ^ i3016);
            int i3018 = -(i3014 * (-2016075675));
            int i3019 = (i3017 & i3018) + (i3018 | i3017);
            int i3110 = ((i3019 | (-902477359)) << 1) - ((-902477359) ^ i3019);
            int i3111 = (((i3110 >> 19) - 16383) / 8192) - (-1);
            int i3112 = ((i3110 | i3111) << 1) - (i3111 ^ i3110);
            int i3113 = ((i3110 >> 28) - 31) / 16;
            int i3114 = -(i3112 ^ (((i3113 | 1) << 1) - (i3113 ^ 1)));
            int i3115 = ((i3114 | 8) << 1) - (i3114 ^ 8);
            int i3116 = i3115 >> 28;
            int i3117 = (((i3116 | (-31)) << 1) - (i3116 ^ (-31))) / 16;
            int i3118 = (i3117 ^ 1) + ((i3117 & 1) << 1);
            atomicBoolean2.set(i3013 + ((-49402896) / (((-((i3118 ^ 1) + ((i3118 & 1) << 1))) & i3115) * 1839)));
            int i3119 = ((int[]) objArr2[2])[0];
            int i3210 = ((((i3119 * i3119) - (~(-(753491505 * i3119)))) - 1) - (~(-(i3119 * (-2109099297))))) - 1;
            int i3211 = (i3210 & (-345978816)) + ((-345978816) | i3210);
            int i3212 = i3211 >> 20;
            int i3213 = ((i3212 ^ (-8191)) + ((i3212 & (-8191)) << 1)) / 4096;
            int i3214 = (i3211 - (~((i3213 & 1) + (i3213 | 1)))) - 1;
            int i3215 = i3211 >> 15;
            int i3216 = ((((-262143) | i3215) << 1) - (i3215 ^ (-262143))) / 131072;
            int i3217 = (-(i3214 ^ ((i3216 & 1) + (i3216 | 1)))) + 3;
            int i3218 = ((i3217 >> 29) - 15) / 8;
            int i3219 = (i3218 & 1) + (i3218 | 1);
            int i3310 = 1470144 / ((i3217 & (-((i3219 & 1) + (i3219 | 1)))) * 1178);
            int i3311 = ((int[]) objArr66[0])[0];
            int i3312 = i3311 * i3311;
            int i3313 = -(660165277 * i3311);
            int i3314 = ((i3312 | i3313) << 1) - (i3312 ^ i3313);
            int i3315 = -(i3311 * 1101681981);
            int i3316 = (i3314 ^ i3315) + ((i3315 & i3314) << 1);
            int i3317 = (i3316 ^ (-1941272215)) + (((-1941272215) & i3316) << 1);
            int i3318 = i3317 >> 20;
            int i3319 = (((i3318 & (-8191)) + (i3318 | (-8191))) / 4096) - (-1);
            int i3410 = ((i3317 | i3319) << 1) - (i3319 ^ i3317);
            int i3411 = i3317 >> 26;
            int i3412 = (-(i3410 ^ (((((i3411 | ComposerKt.defaultsKey) << 1) - (i3411 ^ ComposerKt.defaultsKey)) / 64) - (-1)))) + 3;
            int i3413 = i3412 >> 24;
            int i3414 = ((((i3413 | (-511)) << 1) - (i3413 ^ (-511))) / 256) - (-1);
            int i3415 = i3310 + (590010 / ((i3412 & (-(((i3414 | 1) << 1) - (i3414 ^ 1)))) * 355));
            int i3416 = ((int[]) objArr80[1])[0];
            int i3417 = i3416 * i3416;
            int i3418 = -(642006777 * i3416);
            int i3419 = ((((i3417 | i3418) << 1) - (i3417 ^ i3418)) - (~(-(i3416 * (-2049160503))))) - 1;
            int i3510 = (i3419 ^ (-626504255)) + (((-626504255) & i3419) << 1);
            int i3511 = ((i3510 >> 25) - 255) / 128;
            int i3512 = (i3510 - (~((i3511 & 1) + (i3511 | 1)))) - 1;
            int i3513 = i3510 >> 17;
            int i3514 = (((-65535) ^ i3513) + ((i3513 & (-65535)) << 1)) / 32768;
            int i3515 = -(i3512 ^ ((i3514 & 1) + (i3514 | 1)));
            int i3516 = (i3515 ^ 7) + ((i3515 & 7) << 1);
            int i3517 = i3516 >> 21;
            int i3518 = (((i3517 & (-4095)) + (i3517 | (-4095))) / 2048) - (-1);
            int i3519 = i3415 + (4693794 / (((-(((i3518 | 1) << 1) - (i3518 ^ 1))) & i3516) * 1978));
            int i3610 = ((int[]) objArr1318[3])[0];
            int i3611 = ((i3610 * i3610) - (~(-(1841607508 * i3610)))) - 1;
            int i3612 = -(i3610 * (-2023757626));
            int i3613 = ((i3611 | i3612) << 1) - (i3612 ^ i3611);
            int i3614 = (i3613 ^ (-2103448407)) + (((-2103448407) & i3613) << 1);
            int i3615 = i3614 >> 19;
            int i3616 = ((i3615 ^ (-16383)) + ((i3615 & (-16383)) << 1)) / 8192;
            int i3617 = ((i3616 | 1) << 1) - (i3616 ^ 1);
            int i3618 = ((i3614 | i3617) << 1) - (i3617 ^ i3614);
            int i3619 = i3614 >> 26;
            int i379 = -(i3618 ^ ((((i3619 ^ ComposerKt.defaultsKey) + ((i3619 & ComposerKt.defaultsKey) << 1)) / 64) - (-1)));
            int i3710 = ((i379 | 8) << 1) - (i379 ^ 8);
            int i3711 = i3710 >> 19;
            int i3712 = ((i3711 ^ (-16383)) + ((i3711 & (-16383)) << 1)) / 8192;
            int i3713 = (i3712 & 1) + (i3712 | 1);
            return i3519 + ((-20169072) / (((-((i3713 & 1) + (i3713 | 1))) & i3710) * 1926));
        } catch (Throwable th9) {
            currentlyInitializing.set(false);
            throw th9;
        }
    }

    private static void checkContentProviderAuthority(ProviderInfo providerInfo) {
        int i = 2 % 2;
        int i2 = g + 91;
        TuitionPaymentFragmentbindingInflater1 = i2 % 128;
        int i3 = i2 % 2;
        Preconditions.checkNotNull(providerInfo, "FirebaseInitProvider ProviderInfo cannot be null.");
        if (EMPTY_APPLICATION_ID_PROVIDER_AUTHORITY.equals(providerInfo.authority)) {
            throw new IllegalStateException("Incorrect provider authority in manifest. Most likely due to a missing applicationId variable in application's build.gradle.");
        }
        int i4 = TuitionPaymentFragmentbindingInflater1 + 21;
        g = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // android.content.ContentProvider
    public int delete(Uri uri, String str, String[] strArr) {
        int i = 2 % 2;
        int i2 = g + 113;
        int i3 = i2 % 128;
        TuitionPaymentFragmentbindingInflater1 = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 101;
        g = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 17 / 0;
        }
        return 0;
    }

    @Override // android.content.ContentProvider
    public String getType(Uri uri) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 31;
        int i3 = i2 % 128;
        g = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 89;
        TuitionPaymentFragmentbindingInflater1 = i5 % 128;
        Object obj = null;
        if (i5 % 2 == 0) {
            return null;
        }
        obj.hashCode();
        throw null;
    }

    @Override // android.content.ContentProvider
    public Uri insert(Uri uri, ContentValues contentValues) {
        int i = 2 % 2;
        int i2 = g + 119;
        TuitionPaymentFragmentbindingInflater1 = i2 % 128;
        if (i2 % 2 == 0) {
            return null;
        }
        int i3 = 9 / 0;
        return null;
    }

    @Override // android.content.ContentProvider
    public Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        int i = 2 % 2;
        int i2 = g;
        int i3 = i2 + 93;
        TuitionPaymentFragmentbindingInflater1 = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        int i4 = i2 + 5;
        TuitionPaymentFragmentbindingInflater1 = i4 % 128;
        if (i4 % 2 == 0) {
            return null;
        }
        obj.hashCode();
        throw null;
    }

    @Override // android.content.ContentProvider
    public int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 95;
        int i3 = i2 % 128;
        g = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 25;
        TuitionPaymentFragmentbindingInflater1 = i5 % 128;
        int i6 = i5 % 2;
        return 0;
    }

    static void b() {
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = new char[]{60099, 60045, 60061, 60056, 60090, 60049, 60050, 60119, 60055, 60088, 60073, 60047, 60063, 60105, 60100, 60113, 60111, 60048, 60117, 60107, 60043, 60058, 60116, 60102, 60103, 60053, 60034, 60041, 60052, 60060, 60079, 60114, 60110, 60083, 60054, 60109, 60115, 60106, 60101, 60051, 60112, 60062, 60108, 60098, 60057, 60104, 60046, 60040, 60072};
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = (char) 57190;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0022  */
    /* JADX WARN: Code duplicated, block: B:8:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0022
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$g(short r6, int r7, short r8) {
        /*
            byte[] r0 = com.google.firebase.provider.FirebaseInitProvider.$$c
            int r6 = r6 + 4
            int r7 = 116 - r7
            int r8 = r8 * 2
            int r1 = 1 - r8
            byte[] r1 = new byte[r1]
            r2 = 0
            int r8 = 0 - r8
            if (r0 != 0) goto L14
            r3 = r8
            r4 = r2
            goto L2a
        L14:
            r3 = r2
        L15:
            int r6 = r6 + 1
            byte r4 = (byte) r7
            r1[r3] = r4
            if (r3 != r8) goto L22
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L22:
            int r3 = r3 + 1
            r4 = r0[r6]
            r5 = r3
            r3 = r7
            r7 = r4
            r4 = r5
        L2a:
            int r7 = -r7
            int r7 = r7 + r3
            r3 = r4
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.provider.FirebaseInitProvider.$$g(short, int, short):java.lang.String");
    }
}
