package defpackage;

import android.content.Context;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.support.v4.media.session.MediaControllerCompat;
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
import androidx.core.view.ViewCompat;
import at.favre.lib.armadillo.AuthenticatedEncryptionException;
import at.favre.lib.bytes.Bytes;
import at.favre.lib.bytes.MutableBytes;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.security.InvalidKeyException;
import java.security.Provider;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import javax.crypto.SecretKey;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import kotlin.UByte;
import kotlin.io.encoding.Base64;
import okhttp3.tls.internal.der.DerHeader;

/* JADX INFO: loaded from: classes5.dex */
@Deprecated
public final class onResult implements MediaBrowserCompatMediaBrowserImplApi21 {
    private static short[] g;
    private ThreadLocal<Cipher> TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    private final SecureRandom TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    private Mac TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    private final Provider b;
    private static final byte[] $$c = {1, 115, -83, 116};
    private static final int $$f = 218;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$d = {82, Base64.padSymbol, -66, -42, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 56};
    private static final int $$e = 99;
    private static final byte[] $$a = {91, -9, 99, 11, 7, -23, 19, -25, 72, -55, -17, -9, 7, -6, 3, 63, -71, 1, 9, 0, 51, -39, -20, 0, -17, 11, -17, 39, -28, -22, 36, -31, 9, 0, 7, -23, 19, -25, 72, -55, -17, -9, 7, -6, 3, 63, -23, -40, -9, 6, 1, -15, 0, -17, 41, -39, -7, -3, 17, -15, 9, -4, -13, 39, -37, -7, 11, -13};
    private static final int $$b = 181;
    private static int asBinder = 0;
    private static int INotificationSideChannel = 1;
    private static int TuitionPaymentFragmentbindingInflater1 = 859230127;
    private static int d = -1934795575;
    private static int asInterface = 2012087826;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static byte[] f1307a = {19, -31, 18, -23, -2, -7, 92, -9, 24, 31, -32, -25, 21, -94, 33, 31, -21, 19, -40, 43, 13, -13, 17, -25, -21, 26, -27, 27, -29, 19, -60, 63, -23, 24, -21, 26, -27, 27, -29, 19, -60, -7, 92, -9, 24, 31, -32, -25, 21, -94, 33, 31, -21, 19, -40, 43, 13, -13, 17, 9, -21, 19, -11, -11, Base64.padSymbol, -20, 19, 17, -61, 0, 26, 27, -25, -23, -11, 56, -23, 24, -24, 19, 17, -61, 4, -21, 23, -23, 30, -22, 9, -9, -9, 58, -23, 24, -26, -26, -26, -26, -26, -26};

    /* JADX WARN: Code duplicated, block: B:10:0x0029  */
    /* JADX WARN: Code duplicated, block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0029 -> B:11:0x0032). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0029
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void c(byte r6, byte r7, short r8, java.lang.Object[] r9) {
        /*
            int r7 = r7 * 2
            int r7 = 62 - r7
            int r6 = r6 * 3
            int r6 = 106 - r6
            int r8 = r8 * 4
            int r0 = r8 + 7
            byte[] r1 = defpackage.onResult.$$a
            byte[] r0 = new byte[r0]
            int r8 = r8 + 6
            r2 = 0
            if (r1 != 0) goto L18
            r3 = r7
            r4 = r2
            goto L32
        L18:
            r3 = r2
        L19:
            r5 = r7
            r7 = r6
            r6 = r5
            byte r4 = (byte) r7
            r0[r3] = r4
            if (r3 != r8) goto L29
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            r9[r2] = r6
            return
        L29:
            r4 = r1[r6]
            int r3 = r3 + 1
            r5 = r7
            r7 = r6
            r6 = r4
            r4 = r3
            r3 = r5
        L32:
            int r6 = -r6
            int r7 = r7 + 1
            int r3 = r3 + r6
            int r6 = r3 + (-2)
            r3 = r4
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.onResult.c(byte, byte, short, java.lang.Object[]):void");
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0025  */
    /* JADX WARN: Code duplicated, block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002e). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0025
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void e(short r6, byte r7, short r8, java.lang.Object[] r9) {
        /*
            int r8 = 103 - r8
            int r6 = r6 * 52
            int r6 = 55 - r6
            int r7 = r7 * 52
            int r0 = r7 + 1
            byte[] r1 = defpackage.onResult.$$d
            byte[] r0 = new byte[r0]
            r2 = 0
            if (r1 != 0) goto L15
            r3 = r8
            r4 = r2
            r8 = r6
            goto L2e
        L15:
            r3 = r2
        L16:
            byte r4 = (byte) r8
            int r6 = r6 + 1
            r0[r3] = r4
            if (r3 != r7) goto L25
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            r9[r2] = r6
            return
        L25:
            int r3 = r3 + 1
            r4 = r1[r6]
            r5 = r8
            r8 = r6
            r6 = r4
            r4 = r3
            r3 = r5
        L2e:
            int r6 = -r6
            int r3 = r3 + r6
            int r6 = r3 + (-11)
            r3 = r4
            r5 = r8
            r8 = r6
            r6 = r5
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.onResult.e(short, byte, short, java.lang.Object[]):void");
    }

    public onResult() {
        this(new SecureRandom(), null);
    }

    public onResult(SecureRandom secureRandom, Provider provider) {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = new ThreadLocal<>();
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = secureRandom;
        this.b = provider;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v14, types: [byte[]] */
    /* JADX WARN: Type inference failed for: r4v15, types: [int] */
    @Override // defpackage.MediaBrowserCompatMediaBrowserImplApi21
    public final byte[] TuitionPaymentFragmentspecialinlinedviewModeldefault1(byte[] bArr, byte[] bArr2, byte[] bArr3) throws Throwable {
        byte[] bArr4;
        MutableBytes mutableBytes;
        MutableBytes mutableBytes2;
        MutableBytes mutableBytes3;
        int i = 2 % 2;
        int i2 = INotificationSideChannel + 39;
        int i3 = i2 % 128;
        asBinder = i3;
        int i4 = i2 % 2;
        int length = bArr.length;
        if (length != 16) {
            int i5 = i3 + 5;
            bArr4 = i5 % 128;
            INotificationSideChannel = bArr4;
            int i6 = i5 % 2;
            if (length != 32) {
                throw new IllegalArgumentException("AES key length must be 16, 24, or 32 bytes");
            }
        }
        try {
            try {
                bArr4 = new byte[16];
                try {
                    this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.nextBytes(bArr4);
                    Cipher cipherB = b();
                    int iIntValue = ((Integer) Class.forName("java.lang.System").getMethod("identityHashCode", Object.class).invoke(null, this)).intValue();
                    if (clearMutated.TuitionPaymentFragmentspecialinlinedviewModeldefault1(new ArrayList()) != 0) {
                        Toast.makeText((Context) null, iIntValue / (((iIntValue - 1) * iIntValue) % 2), 0).show();
                        int i7 = INotificationSideChannel + 5;
                        asBinder = i7 % 128;
                        int i8 = i7 % 2;
                    }
                    cipherB.init(1, TuitionPaymentFragmentspecialinlinedviewModeldefault3(bArr), new IvParameterSpec(bArr4));
                    bArr2 = cipherB.doFinal(bArr2);
                    try {
                        byte[] bArrTuitionPaymentFragmentspecialinlinedviewModeldefault2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2(bArr, bArr2, bArr4, bArr3);
                        try {
                            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(bArrTuitionPaymentFragmentspecialinlinedviewModeldefault2.length + 18 + bArr2.length);
                            byteBufferAllocate.put((byte) 16);
                            byteBufferAllocate.put((byte[]) bArr4);
                            byteBufferAllocate.put((byte) bArrTuitionPaymentFragmentspecialinlinedviewModeldefault2.length);
                            byteBufferAllocate.put(bArrTuitionPaymentFragmentspecialinlinedviewModeldefault2);
                            byteBufferAllocate.put(bArr2);
                            byte[] bArrArray = byteBufferAllocate.array();
                            Bytes bytesTuitionPaymentFragmentspecialinlinedviewModeldefault2 = Bytes.TuitionPaymentFragmentspecialinlinedviewModeldefault2((byte[]) bArr4);
                            if (bytesTuitionPaymentFragmentspecialinlinedviewModeldefault2 instanceof MutableBytes) {
                                int i9 = asBinder + 115;
                                INotificationSideChannel = i9 % 128;
                                if (i9 % 2 == 0) {
                                    mutableBytes2 = (MutableBytes) bytesTuitionPaymentFragmentspecialinlinedviewModeldefault2;
                                    int i10 = 50 / 0;
                                } else {
                                    mutableBytes2 = (MutableBytes) bytesTuitionPaymentFragmentspecialinlinedviewModeldefault2;
                                }
                            } else {
                                mutableBytes2 = new MutableBytes(bytesTuitionPaymentFragmentspecialinlinedviewModeldefault2.byteArray, bytesTuitionPaymentFragmentspecialinlinedviewModeldefault2.byteOrder);
                            }
                            SecureRandom secureRandom = new SecureRandom();
                            if (mutableBytes2.byteArray.length > 0) {
                                secureRandom.nextBytes(mutableBytes2.byteArray);
                            }
                            Bytes bytesTuitionPaymentFragmentspecialinlinedviewModeldefault3 = Bytes.TuitionPaymentFragmentspecialinlinedviewModeldefault2(bArr2);
                            if (bytesTuitionPaymentFragmentspecialinlinedviewModeldefault3 instanceof MutableBytes) {
                                int i11 = INotificationSideChannel + 9;
                                asBinder = i11 % 128;
                                int i12 = i11 % 2;
                                mutableBytes3 = (MutableBytes) bytesTuitionPaymentFragmentspecialinlinedviewModeldefault3;
                            } else {
                                mutableBytes3 = new MutableBytes(bytesTuitionPaymentFragmentspecialinlinedviewModeldefault3.byteArray, bytesTuitionPaymentFragmentspecialinlinedviewModeldefault3.byteOrder);
                            }
                            SecureRandom secureRandom2 = new SecureRandom();
                            if (mutableBytes3.byteArray.length > 0) {
                                int i13 = asBinder + 119;
                                INotificationSideChannel = i13 % 128;
                                int i14 = i13 % 2;
                                secureRandom2.nextBytes(mutableBytes3.byteArray);
                            }
                            Bytes bytesTuitionPaymentFragmentspecialinlinedviewModeldefault4 = Bytes.TuitionPaymentFragmentspecialinlinedviewModeldefault2(bArrTuitionPaymentFragmentspecialinlinedviewModeldefault2);
                            MutableBytes mutableBytes4 = bytesTuitionPaymentFragmentspecialinlinedviewModeldefault4 instanceof MutableBytes ? (MutableBytes) bytesTuitionPaymentFragmentspecialinlinedviewModeldefault4 : new MutableBytes(bytesTuitionPaymentFragmentspecialinlinedviewModeldefault4.byteArray, bytesTuitionPaymentFragmentspecialinlinedviewModeldefault4.byteOrder);
                            SecureRandom secureRandom3 = new SecureRandom();
                            if (mutableBytes4.byteArray.length > 0) {
                                secureRandom3.nextBytes(mutableBytes4.byteArray);
                            }
                            return bArrArray;
                        } catch (Exception e2) {
                            e = e2;
                            throw new AuthenticatedEncryptionException("could not encrypt", e);
                        }
                    } catch (Exception e3) {
                        e = e3;
                    } catch (Throwable th) {
                        th = th;
                        bArr = null;
                        Bytes bytesTuitionPaymentFragmentspecialinlinedviewModeldefault5 = Bytes.TuitionPaymentFragmentspecialinlinedviewModeldefault2(bArr4);
                        if (bytesTuitionPaymentFragmentspecialinlinedviewModeldefault5 instanceof MutableBytes) {
                            int i15 = INotificationSideChannel + 55;
                            asBinder = i15 % 128;
                            if (i15 % 2 != 0) {
                                throw null;
                            }
                            mutableBytes = (MutableBytes) bytesTuitionPaymentFragmentspecialinlinedviewModeldefault5;
                        } else {
                            mutableBytes = new MutableBytes(bytesTuitionPaymentFragmentspecialinlinedviewModeldefault5.byteArray, bytesTuitionPaymentFragmentspecialinlinedviewModeldefault5.byteOrder);
                        }
                        SecureRandom secureRandom4 = new SecureRandom();
                        if (mutableBytes.byteArray.length > 0) {
                            int i16 = INotificationSideChannel + 103;
                            asBinder = i16 % 128;
                            int i17 = i16 % 2;
                            secureRandom4.nextBytes(mutableBytes.byteArray);
                        }
                        Bytes bytesTuitionPaymentFragmentspecialinlinedviewModeldefault6 = Bytes.TuitionPaymentFragmentspecialinlinedviewModeldefault2(bArr2);
                        MutableBytes mutableBytes5 = !(bytesTuitionPaymentFragmentspecialinlinedviewModeldefault6 instanceof MutableBytes) ? new MutableBytes(bytesTuitionPaymentFragmentspecialinlinedviewModeldefault6.byteArray, bytesTuitionPaymentFragmentspecialinlinedviewModeldefault6.byteOrder) : (MutableBytes) bytesTuitionPaymentFragmentspecialinlinedviewModeldefault6;
                        SecureRandom secureRandom5 = new SecureRandom();
                        if (mutableBytes5.byteArray.length > 0) {
                            secureRandom5.nextBytes(mutableBytes5.byteArray);
                        }
                        Bytes bytesTuitionPaymentFragmentspecialinlinedviewModeldefault7 = Bytes.TuitionPaymentFragmentspecialinlinedviewModeldefault2(bArr);
                        MutableBytes mutableBytes6 = bytesTuitionPaymentFragmentspecialinlinedviewModeldefault7 instanceof MutableBytes ? (MutableBytes) bytesTuitionPaymentFragmentspecialinlinedviewModeldefault7 : new MutableBytes(bytesTuitionPaymentFragmentspecialinlinedviewModeldefault7.byteArray, bytesTuitionPaymentFragmentspecialinlinedviewModeldefault7.byteOrder);
                        SecureRandom secureRandom6 = new SecureRandom();
                        if (mutableBytes6.byteArray.length > 0) {
                            secureRandom6.nextBytes(mutableBytes6.byteArray);
                        }
                        throw th;
                    }
                } catch (Exception e4) {
                    e = e4;
                } catch (Throwable th2) {
                    th = th2;
                    bArr = null;
                    bArr2 = null;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (Exception e5) {
            e = e5;
        } catch (Throwable th4) {
            th = th4;
            bArr = null;
            bArr2 = null;
            bArr4 = 0;
        }
    }

    private static void f(int i, int i2, short s, byte b, int i3, Object[] objArr) throws Throwable {
        int i4;
        long j;
        int i5 = 2 % 2;
        SessionConfigValidatingBuilderExternalSyntheticLambda0 sessionConfigValidatingBuilderExternalSyntheticLambda0 = new SessionConfigValidatingBuilderExternalSyntheticLambda0();
        StringBuilder sb = new StringBuilder();
        try {
            Object[] objArr2 = {Integer.valueOf(i2), Integer.valueOf(d)};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1238528667);
            char c = '0';
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                char defaultSize = (char) View.getDefaultSize(0, 0);
                int iLastIndexOf = TextUtils.lastIndexOf("", '0', 0) + 2268;
                int i6 = 34 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1));
                byte[] bArr = $$c;
                byte b2 = (byte) (bArr[0] - 1);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(defaultSize, iLastIndexOf, i6, 1387473586, false, $$g(b2, b2, (byte) bArr.length), new Class[]{Integer.TYPE, Integer.TYPE});
            }
            int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).intValue();
            if (iIntValue == -1) {
                int i7 = $10 + 59;
                $11 = i7 % 128;
                int i8 = i7 % 2;
                i4 = 1;
            } else {
                i4 = 0;
            }
            if (i4 == 0) {
                j = 3046761265686732006L;
            } else {
                byte[] bArr2 = f1307a;
                if (bArr2 != null) {
                    int i9 = $10 + 65;
                    $11 = i9 % 128;
                    int i10 = i9 % 2;
                    int length = bArr2.length;
                    byte[] bArr3 = new byte[length];
                    int i11 = 0;
                    while (i11 < length) {
                        Object[] objArr3 = {Integer.valueOf(bArr2[i11])};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(632534666);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                            char cIndexOf = (char) ((-1) - TextUtils.indexOf("", c, 0, 0));
                            int i12 = 3358 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1));
                            int modifierMetaStateMask = ((byte) KeyEvent.getModifierMetaStateMask()) + 19;
                            byte b3 = (byte) ($$c[0] - 1);
                            byte b4 = b3;
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cIndexOf, i12, modifierMetaStateMask, -1054011043, false, $$g(b3, b4, b4), new Class[]{Integer.TYPE});
                        }
                        bArr3[i11] = ((Byte) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).byteValue();
                        i11++;
                        c = '0';
                    }
                    bArr2 = bArr3;
                }
                if (bArr2 != null) {
                    byte[] bArr4 = f1307a;
                    Object[] objArr4 = {Integer.valueOf(i3), Integer.valueOf(TuitionPaymentFragmentbindingInflater1)};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1238528667);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                        char cNormalizeMetaState = (char) KeyEvent.normalizeMetaState(0);
                        int iResolveSize = 2267 - View.resolveSize(0, 0);
                        int deadChar = 33 - KeyEvent.getDeadChar(0, 0);
                        byte[] bArr5 = $$c;
                        byte b5 = (byte) (bArr5[0] - 1);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(cNormalizeMetaState, iResolveSize, deadChar, 1387473586, false, $$g(b5, b5, (byte) bArr5.length), new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    iIntValue = (byte) (((byte) (((long) bArr4[((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4)).intValue()]) ^ 3046761265686732006L)) + ((int) (((long) d) ^ 3046761265686732006L)));
                    j = 3046761265686732006L;
                } else {
                    j = 3046761265686732006L;
                    iIntValue = (short) (((short) (((long) g[i3 + ((int) (((long) TuitionPaymentFragmentbindingInflater1) ^ 3046761265686732006L))]) ^ 3046761265686732006L)) + ((int) (((long) d) ^ 3046761265686732006L)));
                }
            }
            if (iIntValue > 0) {
                sessionConfigValidatingBuilderExternalSyntheticLambda0.b = ((i3 + iIntValue) - 2) + ((int) (((long) TuitionPaymentFragmentbindingInflater1) ^ j)) + i4;
                Object[] objArr5 = {sessionConfigValidatingBuilderExternalSyntheticLambda0, Integer.valueOf(i), Integer.valueOf(asInterface), sb};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1079014435);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    char scrollDefaultDelay = (char) ((ViewConfiguration.getScrollDefaultDelay() >> 16) + 55904);
                    int defaultSize2 = 2855 - View.getDefaultSize(0, 0);
                    int offsetBefore = 13 - TextUtils.getOffsetBefore("", 0);
                    byte b6 = (byte) ($$c[0] - 1);
                    byte b7 = b6;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(scrollDefaultDelay, defaultSize2, offsetBefore, -1529949196, false, $$g(b6, b7, (byte) (b7 + 3)), new Class[]{Object.class, Integer.TYPE, Integer.TYPE, Object.class});
                }
                ((StringBuilder) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).append(sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
                sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                byte[] bArr6 = f1307a;
                if (bArr6 != null) {
                    int length2 = bArr6.length;
                    byte[] bArr7 = new byte[length2];
                    for (int i13 = 0; i13 < length2; i13++) {
                        int i14 = $11 + 7;
                        $10 = i14 % 128;
                        int i15 = i14 % 2;
                        bArr7[i13] = (byte) (((long) bArr6[i13]) ^ 3046761265686732006L);
                    }
                    bArr6 = bArr7;
                }
                boolean z = bArr6 != null;
                sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 1;
                while (sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3 < iIntValue) {
                    int i16 = $11 + 111;
                    $10 = i16 % 128;
                    int i17 = i16 % 2;
                    if (z) {
                        byte[] bArr8 = f1307a;
                        int i18 = sessionConfigValidatingBuilderExternalSyntheticLambda0.b;
                        sessionConfigValidatingBuilderExternalSyntheticLambda0.b = i18 - 1;
                        sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = (char) (sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2 + (((byte) (((byte) (((long) bArr8[i18]) ^ 3046761265686732006L)) + s)) ^ b));
                    } else {
                        short[] sArr = g;
                        int i19 = sessionConfigValidatingBuilderExternalSyntheticLambda0.b;
                        sessionConfigValidatingBuilderExternalSyntheticLambda0.b = i19 - 1;
                        sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = (char) (sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2 + (((short) (((short) (((long) sArr[i19]) ^ 3046761265686732006L)) + s)) ^ b));
                    }
                    sb.append(sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
                    sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                    sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3++;
                }
            }
            objArr[0] = sb.toString();
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }

    /* JADX WARN: Code duplicated, block: B:70:0x064b  */
    private SecretKeySpec TuitionPaymentFragmentspecialinlinedviewModeldefault3(byte[] bArr) throws Throwable {
        int i;
        boolean z;
        int i2;
        String string;
        int i3 = 2 % 2;
        ArrayList arrayList = new ArrayList();
        Class<?>[] clsArr = null;
        int iIntValue = ((Integer) Class.forName("java.lang.System").getMethod("identityHashCode", Object.class).invoke(null, this)).intValue();
        byte[] bArr2 = $$a;
        byte b = bArr2[19];
        Object[] objArr = new Object[1];
        c(b, (byte) (b | 29), bArr2[49], objArr);
        Constructor[] constructorArr = {Class.forName((String) objArr[0]).getDeclaredConstructor(byte[].class, String.class)};
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char cLastIndexOf = (char) ((-1) - TextUtils.lastIndexOf("", '0', 0, 0));
            int i4 = 2824 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1));
            int i5 = (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 21;
            byte[] bArr3 = $$d;
            byte b2 = bArr3[5];
            Object[] objArr2 = new Object[1];
            e(b2, b2, bArr3[10], objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cLastIndexOf, i4, i5, 1814927978, false, (String) objArr2[0], null);
        }
        if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).get(null) == null) {
            int i6 = INotificationSideChannel + 43;
            asBinder = i6 % 128;
            int i7 = i6 % 2;
            Method[] declaredMethods = ((Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (1 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))), 2823 - Color.argb(0, 0, 0, 0), 22 - Gravity.getAbsoluteGravity(0, 0))).getDeclaredMethods();
            int length = declaredMethods.length;
            int i8 = 0;
            while (i8 < length) {
                Method method = declaredMethods[i8];
                try {
                    Object[] objArr3 = new Object[1];
                    f((ViewConfiguration.getPressedStateDuration() >> 16) + 79471990, (-23) - (ViewConfiguration.getLongPressTimeout() >> 16), (short) View.resolveSize(0, 0), (byte) ((-1) - Process.getGidForName("")), ((byte) KeyEvent.getModifierMetaStateMask()) + 1080323256, objArr3);
                    Class<?> cls = Class.forName((String) objArr3[0]);
                    Object[] objArr4 = new Object[1];
                    f((KeyEvent.getMaxKeyCode() >> 16) + 79471987, (-35) - (Process.myPid() >> 22), (short) Drawable.resolveOpacity(0, 0), (byte) (ViewConfiguration.getTouchSlop() >> 8), Color.green(0) + 1080323278, objArr4);
                    Object[] objArr5 = {Integer.valueOf(((Integer) cls.getMethod((String) objArr4[0], clsArr).invoke(method, clsArr)).intValue())};
                    Object[] objArr6 = new Object[1];
                    f(79471990 - KeyEvent.keyCodeFromString(""), (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) - 21, (short) (ViewConfiguration.getWindowTouchSlop() >> 8), (byte) (ViewConfiguration.getKeyRepeatDelay() >> 16), (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 1080323288, objArr6);
                    Class<?> cls2 = Class.forName((String) objArr6[0]);
                    Object[] objArr7 = new Object[1];
                    f((PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 79471989, MotionEvent.axisFromString("") - 38, (short) (1 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))), (byte) ((-1) - TextUtils.indexOf((CharSequence) "", '0', 0, 0)), 1080323315 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), objArr7);
                    if (((Boolean) cls2.getMethod((String) objArr7[0], Integer.TYPE).invoke(null, objArr5)).booleanValue()) {
                        Class cls3 = Long.TYPE;
                        Object[] objArr8 = new Object[1];
                        f((AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 79471990, (-23) - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), (short) ((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) - 1), (byte) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) - 1), Color.green(0) + 1080323255, objArr8);
                        Class<?> cls4 = Class.forName((String) objArr8[0]);
                        Object[] objArr9 = new Object[1];
                        f(TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 79471988, (-34) - (ViewConfiguration.getWindowTouchSlop() >> 8), (short) TextUtils.getOffsetAfter("", 0), (byte) View.combineMeasuredStates(0, 0), 1080323321 - TextUtils.getCapsMode("", 0, 0), objArr9);
                        if (cls3.equals(cls4.getMethod((String) objArr9[0], null).invoke(method, null))) {
                            Object[] objArr10 = new Object[1];
                            f(ImageFormat.getBitsPerPixel(0) + 79471991, (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) - 23, (short) Color.alpha(0), (byte) (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), 1080323255 - (ViewConfiguration.getLongPressTimeout() >> 16), objArr10);
                            Class<?> cls5 = Class.forName((String) objArr10[0]);
                            Object[] objArr11 = new Object[1];
                            f(79471987 - TextUtils.indexOf("", "", 0), Color.argb(0, 0, 0, 0) - 30, (short) TextUtils.getOffsetBefore("", 0), (byte) Color.alpha(0), AndroidCharacter.getMirror('0') + 27861, objArr11);
                            Object[] objArr12 = (Object[]) cls5.getMethod((String) objArr11[0], null).invoke(method, null);
                            if (objArr12.length == 2 && Long.TYPE.equals(objArr12[0])) {
                                int i9 = asBinder + 69;
                                INotificationSideChannel = i9 % 128;
                                int i10 = i9 % 2;
                                Object[] objArr13 = new Object[1];
                                f(Color.rgb(0, 0, 0) + 96249206, (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) - 24, (short) (ViewConfiguration.getTapTimeout() >> 16), (byte) ExpandableListView.getPackedPositionGroup(0L), TextUtils.lastIndexOf("", '0', 0, 0) + 1080323256, objArr13);
                                if (Class.forName((String) objArr13[0]).equals(objArr12[1])) {
                                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
                                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                        char scrollDefaultDelay = (char) (ViewConfiguration.getScrollDefaultDelay() >> 16);
                                        int maxKeyCode = (KeyEvent.getMaxKeyCode() >> 16) + 2823;
                                        int trimmedLength = TextUtils.getTrimmedLength("") + 22;
                                        byte[] bArr4 = $$d;
                                        byte b3 = bArr4[5];
                                        Object[] objArr14 = new Object[1];
                                        e(b3, b3, bArr4[10], objArr14);
                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(scrollDefaultDelay, maxKeyCode, trimmedLength, 1814927978, false, (String) objArr14[0], null);
                                    }
                                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).set(null, method);
                                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
                                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                                        char windowTouchSlop = (char) (ViewConfiguration.getWindowTouchSlop() >> 8);
                                        int capsMode = 2823 - TextUtils.getCapsMode("", 0, 0);
                                        int iIndexOf = 21 - TextUtils.indexOf((CharSequence) "", '0', 0);
                                        byte[] bArr5 = $$d;
                                        byte b4 = bArr5[5];
                                        Object[] objArr15 = new Object[1];
                                        e(b4, b4, bArr5[10], objArr15);
                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(windowTouchSlop, capsMode, iIndexOf, 1814927978, false, (String) objArr15[0], null);
                                    }
                                    try {
                                        Object[] objArr16 = {0L, ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null)};
                                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1678062333);
                                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                                            char cLastIndexOf2 = (char) ((-1) - TextUtils.lastIndexOf("", '0', 0));
                                            int packedPositionGroup = 2823 - ExpandableListView.getPackedPositionGroup(0L);
                                            int modifierMetaStateMask = ((byte) KeyEvent.getModifierMetaStateMask()) + 23;
                                            byte b5 = $$d[7];
                                            byte b6 = b5;
                                            Object[] objArr17 = new Object[1];
                                            e(b5, b6, b6, objArr17);
                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(cLastIndexOf2, packedPositionGroup, modifierMetaStateMask, -2137287382, false, (String) objArr17[0], new Class[]{Long.TYPE, Method.class});
                                        }
                                        ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr16)).longValue();
                                        break;
                                    } catch (Throwable th) {
                                        Throwable cause = th.getCause();
                                        if (cause != null) {
                                            throw cause;
                                        }
                                        throw th;
                                    }
                                }
                            }
                        } else {
                            continue;
                        }
                    }
                    i8++;
                    clsArr = null;
                } catch (Throwable th2) {
                    Throwable cause2 = th2.getCause();
                    if (cause2 != null) {
                        throw cause2;
                    }
                    throw th2;
                }
            }
        }
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
            char scrollBarFadeDuration = (char) (ViewConfiguration.getScrollBarFadeDuration() >> 16);
            int iIndexOf2 = TextUtils.indexOf("", "") + 2823;
            int iIndexOf3 = 21 - TextUtils.indexOf((CharSequence) "", '0');
            byte[] bArr6 = $$d;
            byte b7 = bArr6[5];
            Object[] objArr18 = new Object[1];
            e(b7, b7, bArr6[10], objArr18);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(scrollBarFadeDuration, iIndexOf2, iIndexOf3, 1814927978, false, (String) objArr18[0], null);
        }
        Object[] objArr19 = {((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).get(null)};
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-645763082);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
            char modifierMetaStateMask2 = (char) ((-1) - ((byte) KeyEvent.getModifierMetaStateMask()));
            int offsetAfter = TextUtils.getOffsetAfter("", 0) + 2823;
            int iIndexOf4 = TextUtils.indexOf((CharSequence) "", '0', 0) + 23;
            byte b8 = $$d[7];
            byte b9 = b8;
            Object[] objArr20 = new Object[1];
            e(b8, b9, (byte) (b9 + 5), objArr20);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(modifierMetaStateMask2, offsetAfter, iIndexOf4, 1025296417, false, (String) objArr20[0], new Class[]{Object.class});
        }
        ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).invoke(null, objArr19);
        Object[] objArr21 = {0, constructorArr, null};
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-687574488);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
            char longPressTimeout = (char) ((ViewConfiguration.getLongPressTimeout() >> 16) + 37657);
            int gidForName = Process.getGidForName("") + 2721;
            int pressedStateDuration = 19 - (ViewConfiguration.getPressedStateDuration() >> 16);
            byte[] bArr7 = $$d;
            byte b10 = bArr7[7];
            Object[] objArr22 = new Object[1];
            e(b10, b10, (byte) (-bArr7[14]), objArr22);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(longPressTimeout, gidForName, pressedStateDuration, 865785343, false, (String) objArr22[0], new Class[]{Integer.TYPE, Constructor[].class, List.class});
        }
        long jLongValue = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).invoke(null, objArr21)).longValue();
        long j = -533224940;
        long j2 = -495;
        long j3 = -1;
        long j4 = j ^ j3;
        long jUptimeMillis = (int) SystemClock.uptimeMillis();
        long j5 = ((j4 | (jLongValue ^ j3)) ^ j3) | ((j4 | jUptimeMillis) ^ j3);
        long j6 = (j2 * j) + (j2 * jLongValue) + (((long) 992) * j5) + (((long) (-496)) * (j5 | ((((jUptimeMillis ^ j3) | j) | jLongValue) ^ j3))) + (((long) 496) * (jLongValue | jUptimeMillis)) + ((long) (-490830682));
        int iIdentityHashCode = System.identityHashCode(this);
        int i11 = ((int) (j6 >> 32)) & (384870307 + (((~(707902125 | iIdentityHashCode)) | (-729324286)) * (-465)) + ((707902125 | (~((-729324286) | iIdentityHashCode))) * 930) + ((iIdentityHashCode | (-21495889)) * 465));
        int iIdentityHashCode2 = System.identityHashCode(this);
        int i12 = i11 | (((int) j6) & ((-941668369) + (((~(566337283 | iIdentityHashCode2)) | (-2011955120)) * (-140)) + ((~((-1445617837) | iIdentityHashCode2)) * 70) + (((~(iIdentityHashCode2 | (-2003563694))) | (-1454009263)) * 70)));
        int i13 = i12 >>> 24;
        int i14 = i12 & ViewCompat.MEASURED_SIZE_MASK;
        if (i13 != 0) {
            int i15 = asBinder + 81;
            INotificationSideChannel = i15 % 128;
            i = 2;
            int i16 = i15 % 2;
            z = true;
        } else {
            i = 2;
            z = false;
        }
        if (z) {
            int i17 = INotificationSideChannel + 99;
            asBinder = i17 % 128;
            int i18 = i17 % i;
            i2 = 1;
        } else {
            i2 = 0;
        }
        if (!z || i14 >= 1) {
            string = null;
        } else {
            int i19 = INotificationSideChannel + 59;
            asBinder = i19 % 128;
            if (i19 % 2 != 0) {
                Constructor constructor = constructorArr[i14];
                throw null;
            }
            Constructor constructor2 = constructorArr[i14];
            if (constructor2 != null) {
                string = constructor2.toString();
            } else {
                string = null;
            }
        }
        arrayList.add(string);
        if ((i13 + 6) * i2 != 0) {
            int[] iArr = new int[iIntValue];
            int i20 = iIntValue - 1;
            iArr[i20] = 1;
            Toast.makeText((Context) null, iArr[((i20 * iIntValue) % 2) - 1], 1).show();
        }
        if (MediaBrowserCompatMediaBrowserImplBaseMediaServiceConnection.TuitionPaymentFragmentbindingInflater1 == null) {
            MediaBrowserCompatMediaBrowserImplBaseMediaServiceConnection.TuitionPaymentFragmentbindingInflater1 = new MediaBrowserCompatMediaBrowserImplBaseMediaServiceConnection(new MediaBrowserCompatMediaBrowserImplBase5.TuitionPaymentFragmentspecialinlinedviewModeldefault1("HmacSHA256"));
        }
        MediaBrowserCompatMediaBrowserImplBaseMediaServiceConnection mediaBrowserCompatMediaBrowserImplBaseMediaServiceConnection = MediaBrowserCompatMediaBrowserImplBaseMediaServiceConnection.TuitionPaymentFragmentbindingInflater1;
        return new SecretKeySpec(new MediaBrowserCompatMediaBrowserImplBaseMediaServiceConnection.b(mediaBrowserCompatMediaBrowserImplBaseMediaServiceConnection.TuitionPaymentFragmentspecialinlinedviewModeldefault3).TuitionPaymentFragmentspecialinlinedviewModeldefault3(mediaBrowserCompatMediaBrowserImplBaseMediaServiceConnection.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault3(bArr), Bytes.TuitionPaymentFragmentbindingInflater1("encKey").byteArray, bArr.length), "AES");
    }

    private byte[] TuitionPaymentFragmentspecialinlinedviewModeldefault2(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) throws Throwable {
        int i = 2 % 2;
        int i2 = asBinder + 95;
        INotificationSideChannel = i2 % 128;
        int i3 = i2 % 2;
        SecretKey secretKeyTuitionPaymentFragmentbindingInflater1 = TuitionPaymentFragmentbindingInflater1(bArr);
        try {
            TuitionPaymentFragmentspecialinlinedviewModeldefault3();
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.init(secretKeyTuitionPaymentFragmentbindingInflater1);
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.update(bArr3);
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.update(bArr2);
            if (bArr4 != null) {
                int i4 = asBinder + 81;
                INotificationSideChannel = i4 % 128;
                if (i4 % 2 == 0) {
                    this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.update(bArr4);
                    throw null;
                }
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.update(bArr4);
            }
            return this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.doFinal();
        } catch (InvalidKeyException unused) {
            throw new IllegalStateException("error during HMAC calculation");
        }
    }

    private SecretKey TuitionPaymentFragmentbindingInflater1(byte[] bArr) throws Throwable {
        int i;
        int i2;
        String string;
        Constructor constructor;
        int i3 = 2;
        int i4 = 2 % 2;
        ArrayList arrayList = new ArrayList();
        int iIntValue = ((Integer) Class.forName("java.lang.System").getMethod("identityHashCode", Object.class).invoke(null, this)).intValue();
        byte[] bArr2 = $$a;
        byte b = bArr2[19];
        Object[] objArr = new Object[1];
        c(b, (byte) (b | 29), bArr2[49], objArr);
        Constructor[] constructorArr = {Class.forName((String) objArr[0]).getDeclaredConstructor(byte[].class, String.class)};
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
        float f = 0.0f;
        long j = 0;
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char c = (char) (1 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)));
            int i5 = 2824 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1));
            int i6 = 23 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1));
            byte[] bArr3 = $$d;
            byte b2 = bArr3[5];
            Object[] objArr2 = new Object[1];
            e(b2, b2, bArr3[10], objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(c, i5, i6, 1814927978, false, (String) objArr2[0], null);
        }
        if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).get(null) == null) {
            Method[] declaredMethods = ((Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (TextUtils.indexOf((CharSequence) "", '0', 0) + 1), 2822 - TextUtils.lastIndexOf("", '0', 0, 0), 22 - (ViewConfiguration.getPressedStateDuration() >> 16))).getDeclaredMethods();
            int length = declaredMethods.length;
            int i7 = 0;
            while (i7 < length) {
                int i8 = INotificationSideChannel + 105;
                int i9 = i8 % 128;
                asBinder = i9;
                int i10 = i8 % i3;
                Method method = declaredMethods[i7];
                int i11 = i9 + 27;
                INotificationSideChannel = i11 % 128;
                int i12 = i11 % i3;
                try {
                    int iGreen = Color.green(0) + 79471990;
                    int capsMode = TextUtils.getCapsMode("", 0, 0) - 23;
                    short sIndexOf = (short) TextUtils.indexOf("", "");
                    byte bRgb = (byte) (Color.rgb(0, 0, 0) + 16777216);
                    int packedPositionType = 1080323255 - ExpandableListView.getPackedPositionType(j);
                    Object[] objArr3 = new Object[1];
                    f(iGreen, capsMode, sIndexOf, bRgb, packedPositionType, objArr3);
                    Class<?> cls = Class.forName((String) objArr3[0]);
                    int i13 = 79471987 - (TypedValue.complexToFloat(0) > f ? 1 : (TypedValue.complexToFloat(0) == f ? 0 : -1));
                    int gidForName = (-36) - Process.getGidForName("");
                    short sLastIndexOf = (short) (TextUtils.lastIndexOf("", '0', 0) + 1);
                    byte b3 = (byte) (PointF.length(f, f) > f ? 1 : (PointF.length(f, f) == f ? 0 : -1));
                    int i14 = (TypedValue.complexToFraction(0, f, f) > f ? 1 : (TypedValue.complexToFraction(0, f, f) == f ? 0 : -1)) + 1080323278;
                    Object[] objArr4 = new Object[1];
                    f(i13, gidForName, sLastIndexOf, b3, i14, objArr4);
                    Object[] objArr5 = {Integer.valueOf(((Integer) cls.getMethod((String) objArr4[0], null).invoke(method, null)).intValue())};
                    Object[] objArr6 = new Object[1];
                    f(TextUtils.getTrimmedLength("") + 79471990, (-22) - TextUtils.indexOf((CharSequence) "", '0'), (short) View.MeasureSpec.makeMeasureSpec(0, 0), (byte) (ViewConfiguration.getWindowTouchSlop() >> 8), Color.green(0) + 1080323289, objArr6);
                    Class<?> cls2 = Class.forName((String) objArr6[0]);
                    Object[] objArr7 = new Object[1];
                    f(79471990 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), (-39) - Gravity.getAbsoluteGravity(0, 0), (short) (((byte) KeyEvent.getModifierMetaStateMask()) + 1), (byte) View.MeasureSpec.getSize(0), TextUtils.getCapsMode("", 0, 0) + 1080323314, objArr7);
                    if (((Boolean) cls2.getMethod((String) objArr7[0], Integer.TYPE).invoke(null, objArr5)).booleanValue()) {
                        int i15 = asBinder + 67;
                        INotificationSideChannel = i15 % 128;
                        int i16 = i15 % 2;
                        Class cls3 = Long.TYPE;
                        Object[] objArr8 = new Object[1];
                        f(TextUtils.indexOf((CharSequence) "", '0') + 79471991, TextUtils.indexOf("", "", 0) - 23, (short) Gravity.getAbsoluteGravity(0, 0), (byte) (KeyEvent.getMaxKeyCode() >> 16), AndroidCharacter.getMirror('0') + 27783, objArr8);
                        Class<?> cls4 = Class.forName((String) objArr8[0]);
                        Object[] objArr9 = new Object[1];
                        f((KeyEvent.getMaxKeyCode() >> 16) + 79471987, View.MeasureSpec.getSize(0) - 34, (short) (1 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1))), (byte) (Process.myTid() >> 22), ExpandableListView.getPackedPositionGroup(0L) + 1080323321, objArr9);
                        if (cls3.equals(cls4.getMethod((String) objArr9[0], null).invoke(method, null))) {
                            Object[] objArr10 = new Object[1];
                            f((AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 79471990, (-24) - TextUtils.lastIndexOf("", '0', 0), (short) View.MeasureSpec.makeMeasureSpec(0, 0), (byte) Gravity.getAbsoluteGravity(0, 0), 1063546039 - Color.rgb(0, 0, 0), objArr10);
                            Class<?> cls5 = Class.forName((String) objArr10[0]);
                            Object[] objArr11 = new Object[1];
                            f(79471987 - (ViewConfiguration.getKeyRepeatDelay() >> 16), (ViewConfiguration.getScrollDefaultDelay() >> 16) - 30, (short) KeyEvent.normalizeMetaState(0), (byte) TextUtils.indexOf("", ""), (ViewConfiguration.getScrollBarSize() >> 8) + 1080323333, objArr11);
                            Object[] objArr12 = (Object[]) cls5.getMethod((String) objArr11[0], null).invoke(method, null);
                            if (objArr12.length == 2 && Long.TYPE.equals(objArr12[0])) {
                                int i17 = asBinder + 83;
                                INotificationSideChannel = i17 % 128;
                                int i18 = i17 % 2;
                                Object[] objArr13 = new Object[1];
                                f((ViewConfiguration.getDoubleTapTimeout() >> 16) + 79471990, KeyEvent.getDeadChar(0, 0) - 23, (short) (1 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1))), (byte) (1 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))), 1080323256 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), objArr13);
                                if (Class.forName((String) objArr13[0]).equals(objArr12[1])) {
                                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
                                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                        char cLastIndexOf = (char) (TextUtils.lastIndexOf("", '0', 0, 0) + 1);
                                        int mode = View.MeasureSpec.getMode(0) + 2823;
                                        int touchSlop = 22 - (ViewConfiguration.getTouchSlop() >> 8);
                                        byte[] bArr4 = $$d;
                                        byte b4 = bArr4[5];
                                        Object[] objArr14 = new Object[1];
                                        e(b4, b4, bArr4[10], objArr14);
                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cLastIndexOf, mode, touchSlop, 1814927978, false, (String) objArr14[0], null);
                                    }
                                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).set(null, method);
                                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
                                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                                        char cResolveSizeAndState = (char) View.resolveSizeAndState(0, 0, 0);
                                        int fadingEdgeLength = (ViewConfiguration.getFadingEdgeLength() >> 16) + 2823;
                                        int iResolveSizeAndState = View.resolveSizeAndState(0, 0, 0) + 22;
                                        byte[] bArr5 = $$d;
                                        byte b5 = bArr5[5];
                                        Object[] objArr15 = new Object[1];
                                        e(b5, b5, bArr5[10], objArr15);
                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(cResolveSizeAndState, fadingEdgeLength, iResolveSizeAndState, 1814927978, false, (String) objArr15[0], null);
                                    }
                                    try {
                                        Object[] objArr16 = {0L, ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null)};
                                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1678062333);
                                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                                            char keyRepeatDelay = (char) (ViewConfiguration.getKeyRepeatDelay() >> 16);
                                            int bitsPerPixel = 2822 - ImageFormat.getBitsPerPixel(0);
                                            int windowTouchSlop = 22 - (ViewConfiguration.getWindowTouchSlop() >> 8);
                                            byte b6 = $$d[7];
                                            byte b7 = b6;
                                            Object[] objArr17 = new Object[1];
                                            e(b6, b7, b7, objArr17);
                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(keyRepeatDelay, bitsPerPixel, windowTouchSlop, -2137287382, false, (String) objArr17[0], new Class[]{Long.TYPE, Method.class});
                                        }
                                        ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr16)).longValue();
                                        break;
                                    } catch (Throwable th) {
                                        Throwable cause = th.getCause();
                                        if (cause != null) {
                                            throw cause;
                                        }
                                        throw th;
                                    }
                                }
                            }
                        } else {
                            continue;
                        }
                    }
                    i7++;
                    i3 = 2;
                    f = 0.0f;
                    j = 0;
                } catch (Throwable th2) {
                    Throwable cause2 = th2.getCause();
                    if (cause2 != null) {
                        throw cause2;
                    }
                    throw th2;
                }
            }
        }
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
            char c2 = (char) (1 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)));
            int longPressTimeout = 2823 - (ViewConfiguration.getLongPressTimeout() >> 16);
            int packedPositionChild = ExpandableListView.getPackedPositionChild(0L) + 23;
            byte[] bArr6 = $$d;
            byte b8 = bArr6[5];
            Object[] objArr18 = new Object[1];
            e(b8, b8, bArr6[10], objArr18);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(c2, longPressTimeout, packedPositionChild, 1814927978, false, (String) objArr18[0], null);
        }
        Object[] objArr19 = {((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).get(null)};
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-645763082);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
            char cAxisFromString = (char) (MotionEvent.axisFromString("") + 1);
            int iIndexOf = TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 2824;
            int iAxisFromString = MotionEvent.axisFromString("") + 23;
            byte b9 = $$d[7];
            byte b10 = b9;
            Object[] objArr20 = new Object[1];
            e(b9, b10, (byte) (b10 + 5), objArr20);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(cAxisFromString, iIndexOf, iAxisFromString, 1025296417, false, (String) objArr20[0], new Class[]{Object.class});
        }
        ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).invoke(null, objArr19);
        Object[] objArr21 = {0, constructorArr, null};
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-687574488);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
            char cIndexOf = (char) (TextUtils.indexOf((CharSequence) "", '0', 0) + 37658);
            int i19 = (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 2720;
            int i20 = (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 18;
            byte[] bArr7 = $$d;
            byte b11 = bArr7[7];
            Object[] objArr22 = new Object[1];
            e(b11, b11, (byte) (-bArr7[14]), objArr22);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(cIndexOf, i19, i20, 865785343, false, (String) objArr22[0], new Class[]{Integer.TYPE, Constructor[].class, List.class});
        }
        long jLongValue = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).invoke(null, objArr21)).longValue();
        long j2 = -697072838;
        long j3 = (((long) (-589)) * j2) + (((long) 591) * jLongValue);
        long j4 = 590;
        long j5 = -1;
        long j6 = jLongValue ^ j5;
        long jIdentityHashCode = System.identityHashCode(this);
        long j7 = jIdentityHashCode ^ j5;
        long j8 = ((j6 | j7) ^ j5) | ((j6 | j2) ^ j5) | ((j7 | j2) ^ j5);
        long j9 = j2 ^ j5;
        long j10 = j3 + ((j8 | (((j9 | jLongValue) | jIdentityHashCode) ^ j5)) * j4) + (((long) (-1180)) * j8) + (j4 * ((j5 ^ (j7 | jLongValue)) | ((j9 | j7) ^ j5))) + ((long) (-326982784));
        int i21 = ~((int) Process.getStartUptimeMillis());
        int i22 = ((int) (j10 >> 32)) & (1754752898 + (((~(761921407 | i21)) | 675305003) * (-828)) + ((i21 | 761921407) * (-828)) + 489266688);
        int iUptimeMillis = (int) SystemClock.uptimeMillis();
        int i23 = i22 | (((int) j10) & (484646344 + (((~((-679973242) | iUptimeMillis)) | 8786008) * 345) + (((~((-679973242) | (~iUptimeMillis))) | (-2125985660)) * 345) + ((~(iUptimeMillis | (-8786009))) * 345)));
        int i24 = i23 >>> 24;
        int i25 = i23 & ViewCompat.MEASURED_SIZE_MASK;
        if (i24 != 0) {
            i = 1;
            i2 = 0;
        } else {
            i = 1;
            i2 = 1;
        }
        int i26 = i2 ^ 1;
        if (i26 == 0 || i25 >= i || (constructor = constructorArr[i25]) == null) {
            string = null;
        } else {
            string = constructor.toString();
            int i27 = INotificationSideChannel + 57;
            asBinder = i27 % 128;
            int i28 = i27 % 2;
        }
        arrayList.add(string);
        if ((i24 + 6) * i26 != 0) {
            throw new RuntimeException(String.valueOf(iIntValue));
        }
        if (MediaBrowserCompatMediaBrowserImplBaseMediaServiceConnection.TuitionPaymentFragmentbindingInflater1 == null) {
            MediaBrowserCompatMediaBrowserImplBaseMediaServiceConnection.TuitionPaymentFragmentbindingInflater1 = new MediaBrowserCompatMediaBrowserImplBaseMediaServiceConnection(new MediaBrowserCompatMediaBrowserImplBase5.TuitionPaymentFragmentspecialinlinedviewModeldefault1("HmacSHA256"));
        }
        MediaBrowserCompatMediaBrowserImplBaseMediaServiceConnection mediaBrowserCompatMediaBrowserImplBaseMediaServiceConnection = MediaBrowserCompatMediaBrowserImplBaseMediaServiceConnection.TuitionPaymentFragmentbindingInflater1;
        return new SecretKeySpec(new MediaBrowserCompatMediaBrowserImplBaseMediaServiceConnection.b(mediaBrowserCompatMediaBrowserImplBaseMediaServiceConnection.TuitionPaymentFragmentspecialinlinedviewModeldefault3).TuitionPaymentFragmentspecialinlinedviewModeldefault3(mediaBrowserCompatMediaBrowserImplBaseMediaServiceConnection.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault3(bArr), Bytes.TuitionPaymentFragmentbindingInflater1("macKey").byteArray, 32), "HmacSHA256");
    }

    private Mac TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        Mac mac;
        synchronized (this) {
            if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                try {
                    this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = Mac.getInstance("HmacSHA256");
                } catch (Exception e2) {
                    throw new IllegalStateException("could not get cipher instance", e2);
                }
            }
            mac = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        }
        return mac;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0690  */
    /* JADX WARN: Code duplicated, block: B:103:0x0699 A[Catch: all -> 0x07d3, Exception -> 0x07d8, TRY_LEAVE, TryCatch #19 {Exception -> 0x07d8, all -> 0x07d3, blocks: (B:16:0x00d1, B:18:0x00f2, B:25:0x0229, B:27:0x029a, B:30:0x031c, B:32:0x0320, B:35:0x0334, B:39:0x0381, B:41:0x0387, B:42:0x03c3, B:44:0x03d2, B:45:0x040f, B:53:0x047c, B:55:0x0482, B:56:0x0483, B:57:0x0484, B:59:0x048d, B:61:0x0493, B:62:0x0494, B:63:0x0495, B:65:0x049e, B:66:0x04db, B:85:0x05ad, B:96:0x067d, B:99:0x068b, B:101:0x0691, B:103:0x0699), top: B:234:0x00d1 }] */
    /* JADX WARN: Code duplicated, block: B:158:0x07a0  */
    /* JADX WARN: Code duplicated, block: B:197:0x0800  */
    /* JADX WARN: Code duplicated, block: B:198:0x0803  */
    /* JADX WARN: Code duplicated, block: B:201:0x0817  */
    /* JADX WARN: Code duplicated, block: B:204:0x0824  */
    /* JADX WARN: Code duplicated, block: B:205:0x0827  */
    /* JADX WARN: Code duplicated, block: B:208:0x083b  */
    /* JADX WARN: Code duplicated, block: B:211:0x0848  */
    /* JADX WARN: Code duplicated, block: B:212:0x084b  */
    /* JADX WARN: Code duplicated, block: B:215:0x085f  */
    /* JADX WARN: Code duplicated, block: B:65:0x049e A[Catch: all -> 0x07d3, Exception -> 0x07d8, TryCatch #19 {Exception -> 0x07d8, all -> 0x07d3, blocks: (B:16:0x00d1, B:18:0x00f2, B:25:0x0229, B:27:0x029a, B:30:0x031c, B:32:0x0320, B:35:0x0334, B:39:0x0381, B:41:0x0387, B:42:0x03c3, B:44:0x03d2, B:45:0x040f, B:53:0x047c, B:55:0x0482, B:56:0x0483, B:57:0x0484, B:59:0x048d, B:61:0x0493, B:62:0x0494, B:63:0x0495, B:65:0x049e, B:66:0x04db, B:85:0x05ad, B:96:0x067d, B:99:0x068b, B:101:0x0691, B:103:0x0699), top: B:234:0x00d1 }] */
    /* JADX WARN: Code duplicated, block: B:71:0x04ef A[Catch: all -> 0x07c3, TryCatch #1 {all -> 0x07c3, blocks: (B:69:0x04e2, B:71:0x04ef, B:72:0x052c), top: B:217:0x04e2 }] */
    /* JADX WARN: Code duplicated, block: B:79:0x0549 A[Catch: all -> 0x07ad, TryCatch #7 {all -> 0x07ad, blocks: (B:77:0x0538, B:79:0x0549, B:80:0x059c, B:83:0x05a3), top: B:221:0x0538 }] */
    /* JADX WARN: Code duplicated, block: B:88:0x065c  */
    /* JADX WARN: Code duplicated, block: B:89:0x0668  */
    /* JADX WARN: Code duplicated, block: B:91:0x066c  */
    /* JADX WARN: Code duplicated, block: B:92:0x0677  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v106, types: [java.nio.Buffer, java.nio.ByteBuffer] */
    /* JADX WARN: Type inference failed for: r2v119, types: [byte[]] */
    /* JADX WARN: Type inference failed for: r2v120 */
    /* JADX WARN: Type inference failed for: r2v153 */
    /* JADX WARN: Type inference failed for: r2v26 */
    /* JADX WARN: Type inference failed for: r2v27 */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7, types: [byte[]] */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v3, types: [byte[]] */
    /* JADX WARN: Type inference failed for: r3v61 */
    /* JADX WARN: Type inference failed for: r3v62 */
    /* JADX WARN: Type inference failed for: r3v63 */
    /* JADX WARN: Type inference failed for: r3v66, types: [byte[]] */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v91 */
    /* JADX WARN: Type inference failed for: r43v0 */
    /* JADX WARN: Type inference failed for: r43v1 */
    /* JADX WARN: Type inference failed for: r44v0, types: [java.lang.Object, onResult] */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v15 */
    /* JADX WARN: Type inference failed for: r4v16, types: [java.util.ArrayList, java.util.List] */
    /* JADX WARN: Type inference failed for: r4v17 */
    /* JADX WARN: Type inference failed for: r4v18 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v24 */
    /* JADX WARN: Type inference failed for: r4v25 */
    /* JADX WARN: Type inference failed for: r4v26 */
    /* JADX WARN: Type inference failed for: r4v27 */
    /* JADX WARN: Type inference failed for: r4v28 */
    /* JADX WARN: Type inference failed for: r4v29 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v31, types: [byte[]] */
    /* JADX WARN: Type inference failed for: r4v4, types: [byte[]] */
    /* JADX WARN: Type inference failed for: r4v43 */
    /* JADX WARN: Type inference failed for: r5v19, types: [javax.crypto.Cipher] */
    @Override // defpackage.MediaBrowserCompatMediaBrowserImplApi21
    public final byte[] TuitionPaymentFragmentbindingInflater1(byte[] bArr, byte[] bArr2, byte[] bArr3) throws Throwable {
        ?? arrayList;
        ?? r2;
        ?? r3;
        Bytes bytesTuitionPaymentFragmentspecialinlinedviewModeldefault2;
        MutableBytes mutableBytes;
        SecureRandom secureRandom;
        Bytes bytesTuitionPaymentFragmentspecialinlinedviewModeldefault3;
        MutableBytes mutableBytes2;
        SecureRandom secureRandom2;
        Bytes bytesTuitionPaymentFragmentspecialinlinedviewModeldefault4;
        MutableBytes mutableBytes3;
        SecureRandom secureRandom3;
        ?? r4;
        ?? r5;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5;
        int i;
        int i2;
        boolean z;
        int i3;
        String string;
        byte[] bArrTuitionPaymentFragmentspecialinlinedviewModeldefault2;
        Method method;
        int i4 = 2;
        int i5 = 2 % 2;
        int length = bArr.length;
        int i6 = 16;
        if (length != 16) {
            int i7 = INotificationSideChannel + 13;
            asBinder = i7 % 128;
            int i8 = i7 % 2;
            if (length != 32) {
                throw new IllegalArgumentException("AES key length must be 16, 24, or 32 bytes");
            }
        }
        Class<?>[] clsArr = null;
        try {
            arrayList = new ArrayList();
            int iIntValue = ((Integer) Class.forName("java.lang.System").getMethod("identityHashCode", Object.class).invoke(null, this)).intValue();
            byte[] bArr4 = $$a;
            byte b = bArr4[19];
            Object[] objArr = new Object[1];
            c(b, (byte) (b | 14), bArr4[14], objArr);
            Class<?> cls = Class.forName((String) objArr[0]);
            byte b2 = (byte) (bArr4[14] - 1);
            byte b3 = bArr4[19];
            Object[] objArr2 = new Object[1];
            c(b2, b3, b3, objArr2);
            Method[] methodArr = {cls.getMethod((String) objArr2[0], byte[].class)};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                char windowTouchSlop = (char) (ViewConfiguration.getWindowTouchSlop() >> 8);
                int offsetAfter = TextUtils.getOffsetAfter("", 0) + 2823;
                int iLastIndexOf = 21 - TextUtils.lastIndexOf("", '0');
                byte[] bArr5 = $$d;
                byte b4 = bArr5[5];
                Object[] objArr3 = new Object[1];
                e(b4, b4, bArr5[10], objArr3);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(windowTouchSlop, offsetAfter, iLastIndexOf, 1814927978, false, (String) objArr3[0], null);
            }
            if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).get(null) != null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    char pressedStateDuration = (char) (ViewConfiguration.getPressedStateDuration() >> 16);
                    int iLastIndexOf2 = 2822 - TextUtils.lastIndexOf("", '0');
                    int keyRepeatTimeout = (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 22;
                    byte[] bArr6 = $$d;
                    byte b5 = bArr6[5];
                    Object[] objArr4 = new Object[1];
                    e(b5, b5, bArr6[10], objArr4);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(pressedStateDuration, iLastIndexOf2, keyRepeatTimeout, 1814927978, false, (String) objArr4[0], null);
                }
                clsArr = null;
                Object[] objArr5 = {((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).get(null)};
                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-645763082);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                    char cMyPid = (char) (Process.myPid() >> 22);
                    int mode = 2823 - View.MeasureSpec.getMode(0);
                    int iIndexOf = TextUtils.indexOf("", "", 0) + 22;
                    byte b6 = $$d[7];
                    byte b7 = b6;
                    Object[] objArr6 = new Object[1];
                    e(b6, b7, (byte) (b7 + 5), objArr6);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cMyPid, mode, iIndexOf, 1025296417, false, (String) objArr6[0], new Class[]{Object.class});
                }
                Object obj = null;
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr5);
                Object[] objArr7 = new Object[3];
                objArr7[2] = null;
                objArr7[1] = methodArr;
                objArr7[0] = 0;
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1189131659);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    char c = (char) ((PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 37657);
                    int touchSlop = (ViewConfiguration.getTouchSlop() >> 8) + 2720;
                    int maxKeyCode = 19 - (KeyEvent.getMaxKeyCode() >> 16);
                    byte b8 = $$d[7];
                    byte b9 = b8;
                    Object[] objArr8 = new Object[1];
                    e(b8, b9, (byte) (b9 + 5), objArr8);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(c, touchSlop, maxKeyCode, -1568796068, false, (String) objArr8[0], new Class[]{Integer.TYPE, Method[].class, List.class});
                }
                obj = null;
                long jLongValue = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr7)).longValue();
                long j = -827381333;
                long j2 = (((long) 465) * j) + (((long) (-463)) * jLongValue);
                long j3 = 464;
                long j4 = -1;
                long j5 = jLongValue ^ j4;
                long startElapsedRealtime = (int) Process.getStartElapsedRealtime();
                long j6 = startElapsedRealtime ^ j4;
                long j7 = (j5 | j) ^ j4;
                long j8 = j2 + ((((j5 | j6) ^ j4) | j7 | ((j6 | j) ^ j4)) * j3) + (((long) (-464)) * (j5 | (j ^ j4) | startElapsedRealtime)) + (j3 * (j7 | ((j | startElapsedRealtime) ^ j4))) + ((long) (-983024512));
                int iUptimeMillis = (int) SystemClock.uptimeMillis();
                int i9 = ~iUptimeMillis;
                int i10 = ((int) (j8 >> 32)) & (1205054886 + ((~((-1574215564) | i9)) * 979) + (((-136989153) | iUptimeMillis) * (-979)) + (((~(iUptimeMillis | (-1574215564))) | (~(i9 | (-136989153)))) * 979));
                int i11 = (int) j8;
                int startUptimeMillis = (int) Process.getStartUptimeMillis();
                int i12 = ~startUptimeMillis;
                int i13 = (-743281331) + (((~((-1283591259) | i12)) | (~(1305644410 | startUptimeMillis))) * 520);
                int i14 = ~((-1305644411) | i12);
                int i15 = ~(startUptimeMillis | 1552096475);
                int i16 = (i11 & (i13 + ((i14 | i15) * (-1040)) + ((i15 | (~(i12 | (-1552096476))) | 22053152) * 520))) | i10;
                i = i16 >>> 24;
                int i17 = i16 & ViewCompat.MEASURED_SIZE_MASK;
                if (i != 0) {
                    int i18 = asBinder + 101;
                    INotificationSideChannel = i18 % 128;
                    i2 = 2;
                    int i19 = i18 % 2;
                    z = true;
                } else {
                    i2 = 2;
                    z = false;
                }
                if (z) {
                    int i20 = asBinder + 39;
                    INotificationSideChannel = i20 % 128;
                    int i21 = i20 % i2;
                    i3 = 1;
                } else {
                    i3 = 0;
                }
                if (z) {
                    string = null;
                } else {
                    string = null;
                }
                arrayList.add(string);
                if ((i + 6) * i3 == 0) {
                    throw new RuntimeException(String.valueOf(iIntValue));
                }
                ?? Wrap = ByteBuffer.wrap(bArr2);
                r2 = new byte[Wrap.get() & UByte.MAX_VALUE];
                Wrap.get(r2);
                r3 = new byte[Wrap.get() & UByte.MAX_VALUE];
                Wrap.get(r3);
                arrayList = new byte[Wrap.remaining()];
                Wrap.get(arrayList);
                bArrTuitionPaymentFragmentspecialinlinedviewModeldefault2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2(bArr, arrayList, r2, bArr3);
                Bytes bytesB = Bytes.b((byte[]) r3);
                if (bArrTuitionPaymentFragmentspecialinlinedviewModeldefault2 != null) {
                }
                throw new AuthenticatedEncryptionException("encryption integrity exception: mac does not match");
            }
            try {
                Method[] declaredMethods = ((Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) View.resolveSizeAndState(0, 0, 0), (ViewConfiguration.getWindowTouchSlop() >> 8) + 2823, Gravity.getAbsoluteGravity(0, 0) + 22)).getDeclaredMethods();
                int length2 = declaredMethods.length;
                int i22 = 0;
                while (i22 < length2) {
                    Method method2 = declaredMethods[i22];
                    int i23 = asBinder + 103;
                    INotificationSideChannel = i23 % 128;
                    int i24 = i23 % i4;
                    try {
                        Object[] objArr9 = new Object[1];
                        f((ViewConfiguration.getScrollBarSize() >> 8) + 79471990, (-16777239) - Color.rgb(0, 0, 0), (short) Gravity.getAbsoluteGravity(0, 0), (byte) (ViewConfiguration.getScrollBarSize() >> 8), View.MeasureSpec.getSize(0) + 1080323255, objArr9);
                        Class<?> cls2 = Class.forName((String) objArr9[0]);
                        Object[] objArr10 = new Object[1];
                        f((ViewConfiguration.getScrollBarFadeDuration() >> i6) + 79471987, KeyEvent.keyCodeFromString("") - 35, (short) View.MeasureSpec.getSize(0), (byte) (ViewConfiguration.getScrollDefaultDelay() >> 16), 1080323277 - TextUtils.indexOf((CharSequence) "", '0', 0), objArr10);
                        Object[] objArr11 = {Integer.valueOf(((Integer) cls2.getMethod((String) objArr10[0], clsArr).invoke(method2, clsArr)).intValue())};
                        Object[] objArr12 = new Object[1];
                        f(79471989 - TextUtils.indexOf((CharSequence) "", '0'), (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) - 22, (short) (1 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1))), (byte) ExpandableListView.getPackedPositionType(0L), 1080323289 - (ViewConfiguration.getJumpTapTimeout() >> 16), objArr12);
                        Class<?> cls3 = Class.forName((String) objArr12[0]);
                        Object[] objArr13 = new Object[1];
                        f((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 79471988, Color.red(0) - 39, (short) ((-1) - TextUtils.indexOf((CharSequence) "", '0', 0, 0)), (byte) (ViewConfiguration.getTouchSlop() >> 8), (ViewConfiguration.getFadingEdgeLength() >> 16) + 1080323314, objArr13);
                        if (!(!((Boolean) cls3.getMethod((String) objArr13[0], Integer.TYPE).invoke(null, objArr11)).booleanValue())) {
                            int i25 = asBinder + 83;
                            INotificationSideChannel = i25 % 128;
                            int i26 = i25 % 2;
                            Class cls4 = Long.TYPE;
                            Object[] objArr14 = new Object[1];
                            f(Color.argb(0, 0, 0, 0) + 79471990, View.MeasureSpec.makeMeasureSpec(0, 0) - 23, (short) TextUtils.indexOf("", ""), (byte) View.combineMeasuredStates(0, 0), Color.alpha(0) + 1080323255, objArr14);
                            Class<?> cls5 = Class.forName((String) objArr14[0]);
                            Object[] objArr15 = new Object[1];
                            f(79471987 - Color.red(0), TextUtils.indexOf("", "", 0, 0) - 34, (short) (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), (byte) TextUtils.getOffsetBefore("", 0), 1080323321 - Color.green(0), objArr15);
                            if (cls4.equals(cls5.getMethod((String) objArr15[0], null).invoke(method2, null))) {
                                Object[] objArr16 = new Object[1];
                                f(Color.blue(0) + 79471990, (ViewConfiguration.getKeyRepeatDelay() >> 16) - 23, (short) TextUtils.indexOf("", "", 0, 0), (byte) KeyEvent.keyCodeFromString(""), 1080323255 - (ViewConfiguration.getLongPressTimeout() >> 16), objArr16);
                                Class<?> cls6 = Class.forName((String) objArr16[0]);
                                Object[] objArr17 = new Object[1];
                                f(79471987 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), TextUtils.lastIndexOf("", '0', 0) - 29, (short) View.resolveSize(0, 0), (byte) ExpandableListView.getPackedPositionGroup(0L), 1080323333 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), objArr17);
                                Object[] objArr18 = (Object[]) cls6.getMethod((String) objArr17[0], null).invoke(method2, null);
                                if (objArr18.length == 2 && Long.TYPE.equals(objArr18[0])) {
                                    int i27 = asBinder + 75;
                                    INotificationSideChannel = i27 % 128;
                                    int i28 = i27 % 2;
                                    Object[] objArr19 = new Object[1];
                                    f(KeyEvent.getDeadChar(0, 0) + 79471990, ExpandableListView.getPackedPositionChild(0L) - 22, (short) (ViewConfiguration.getWindowTouchSlop() >> 8), (byte) (Color.rgb(0, 0, 0) + 16777216), 1080323255 - ExpandableListView.getPackedPositionType(0L), objArr19);
                                    if (!(!Class.forName((String) objArr19[0]).equals(objArr18[1]))) {
                                        int i29 = INotificationSideChannel + 5;
                                        asBinder = i29 % 128;
                                        int i30 = i29 % 2;
                                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
                                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                                            char keyRepeatTimeout2 = (char) (ViewConfiguration.getKeyRepeatTimeout() >> 16);
                                            int iIndexOf2 = 2822 - TextUtils.indexOf((CharSequence) "", '0');
                                            int iLastIndexOf3 = 21 - TextUtils.lastIndexOf("", '0');
                                            byte[] bArr7 = $$d;
                                            byte b10 = bArr7[5];
                                            Object[] objArr20 = new Object[1];
                                            e(b10, b10, bArr7[10], objArr20);
                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(keyRepeatTimeout2, iIndexOf2, iLastIndexOf3, 1814927978, false, (String) objArr20[0], null);
                                        }
                                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, method2);
                                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
                                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                                            char c2 = (char) (1 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)));
                                            int i31 = (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 2823;
                                            int iMakeMeasureSpec = 22 - View.MeasureSpec.makeMeasureSpec(0, 0);
                                            byte[] bArr8 = $$d;
                                            byte b11 = bArr8[5];
                                            Object[] objArr21 = new Object[1];
                                            e(b11, b11, bArr8[10], objArr21);
                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(c2, i31, iMakeMeasureSpec, 1814927978, false, (String) objArr21[0], null);
                                        }
                                        try {
                                            Object[] objArr22 = {0L, ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).get(null)};
                                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1678062333);
                                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
                                                char trimmedLength = (char) TextUtils.getTrimmedLength("");
                                                int keyRepeatDelay = 2823 - (ViewConfiguration.getKeyRepeatDelay() >> 16);
                                                int iRgb = Color.rgb(0, 0, 0) + 16777238;
                                                byte b12 = $$d[7];
                                                byte b13 = b12;
                                                Object[] objArr23 = new Object[1];
                                                e(b12, b13, b13, objArr23);
                                                objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(trimmedLength, keyRepeatDelay, iRgb, -2137287382, false, (String) objArr23[0], new Class[]{Long.TYPE, Method.class});
                                            }
                                            ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).invoke(null, objArr22)).longValue();
                                            break;
                                        } catch (Throwable th) {
                                            Throwable cause = th.getCause();
                                            if (cause != null) {
                                                throw cause;
                                            }
                                            throw th;
                                        }
                                    }
                                }
                            } else {
                                continue;
                            }
                        }
                        i22++;
                        i4 = 2;
                        clsArr = null;
                        i6 = 16;
                    } catch (Throwable th2) {
                        Throwable cause2 = th2.getCause();
                        if (cause2 != null) {
                            throw cause2;
                        }
                        throw th2;
                    }
                }
                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    char pressedStateDuration2 = (char) (ViewConfiguration.getPressedStateDuration() >> 16);
                    int iLastIndexOf4 = 2822 - TextUtils.lastIndexOf("", '0');
                    int keyRepeatTimeout3 = (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 22;
                    byte[] bArr9 = $$d;
                    byte b14 = bArr9[5];
                    Object[] objArr24 = new Object[1];
                    e(b14, b14, bArr9[10], objArr24);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(pressedStateDuration2, iLastIndexOf4, keyRepeatTimeout3, 1814927978, false, (String) objArr24[0], null);
                }
                clsArr = null;
                try {
                    try {
                        Object[] objArr25 = {((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).get(null)};
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-645763082);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                            char cMyPid2 = (char) (Process.myPid() >> 22);
                            int mode2 = 2823 - View.MeasureSpec.getMode(0);
                            int iIndexOf3 = TextUtils.indexOf("", "", 0) + 22;
                            byte b15 = $$d[7];
                            byte b16 = b15;
                            Object[] objArr26 = new Object[1];
                            e(b15, b16, (byte) (b16 + 5), objArr26);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cMyPid2, mode2, iIndexOf3, 1025296417, false, (String) objArr26[0], new Class[]{Object.class});
                        }
                        Object obj2 = null;
                        try {
                            ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr25);
                            try {
                                Object[] objArr27 = new Object[3];
                                objArr27[2] = null;
                                try {
                                    objArr27[1] = methodArr;
                                    objArr27[0] = 0;
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1189131659);
                                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                                        char c3 = (char) ((PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 37657);
                                        int touchSlop2 = (ViewConfiguration.getTouchSlop() >> 8) + 2720;
                                        int maxKeyCode2 = 19 - (KeyEvent.getMaxKeyCode() >> 16);
                                        byte b17 = $$d[7];
                                        byte b18 = b17;
                                        Object[] objArr28 = new Object[1];
                                        e(b17, b18, (byte) (b18 + 5), objArr28);
                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(c3, touchSlop2, maxKeyCode2, -1568796068, false, (String) objArr28[0], new Class[]{Integer.TYPE, Method[].class, List.class});
                                    }
                                    obj2 = null;
                                    long jLongValue2 = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr27)).longValue();
                                    long j9 = -827381333;
                                    long j10 = (((long) 465) * j9) + (((long) (-463)) * jLongValue2);
                                    long j11 = 464;
                                    long j12 = -1;
                                    long j13 = jLongValue2 ^ j12;
                                    long startElapsedRealtime2 = (int) Process.getStartElapsedRealtime();
                                    long j14 = startElapsedRealtime2 ^ j12;
                                    long j15 = (j13 | j9) ^ j12;
                                    long j16 = j10 + ((((j13 | j14) ^ j12) | j15 | ((j14 | j9) ^ j12)) * j11) + (((long) (-464)) * (j13 | (j9 ^ j12) | startElapsedRealtime2)) + (j11 * (j15 | ((j9 | startElapsedRealtime2) ^ j12))) + ((long) (-983024512));
                                    int iUptimeMillis2 = (int) SystemClock.uptimeMillis();
                                    int i32 = ~iUptimeMillis2;
                                    int i110 = ((int) (j16 >> 32)) & (1205054886 + ((~((-1574215564) | i32)) * 979) + (((-136989153) | iUptimeMillis2) * (-979)) + (((~(iUptimeMillis2 | (-1574215564))) | (~(i32 | (-136989153)))) * 979));
                                    int i111 = (int) j16;
                                    int startUptimeMillis2 = (int) Process.getStartUptimeMillis();
                                    int i112 = ~startUptimeMillis2;
                                    int i113 = (-743281331) + (((~((-1283591259) | i112)) | (~(1305644410 | startUptimeMillis2))) * 520);
                                    int i114 = ~((-1305644411) | i112);
                                    int i115 = ~(startUptimeMillis2 | 1552096475);
                                    int i116 = (i111 & (i113 + ((i114 | i115) * (-1040)) + ((i115 | (~(i112 | (-1552096476))) | 22053152) * 520))) | i110;
                                    i = i116 >>> 24;
                                    int i117 = i116 & ViewCompat.MEASURED_SIZE_MASK;
                                    if (i != 0) {
                                        int i118 = asBinder + 101;
                                        INotificationSideChannel = i118 % 128;
                                        i2 = 2;
                                        int i119 = i118 % 2;
                                        z = true;
                                    } else {
                                        i2 = 2;
                                        z = false;
                                    }
                                    if (z) {
                                        int i210 = asBinder + 39;
                                        INotificationSideChannel = i210 % 128;
                                        int i211 = i210 % i2;
                                        i3 = 1;
                                    } else {
                                        i3 = 0;
                                    }
                                    if (z || i117 >= 1 || (method = methodArr[i117]) == null) {
                                        string = null;
                                    } else {
                                        int i33 = asBinder + 43;
                                        INotificationSideChannel = i33 % 128;
                                        int i34 = i33 % 2;
                                        string = method.toString();
                                    }
                                    arrayList.add(string);
                                    if ((i + 6) * i3 == 0) {
                                        throw new RuntimeException(String.valueOf(iIntValue));
                                    }
                                    ?? Wrap2 = ByteBuffer.wrap(bArr2);
                                    r2 = new byte[Wrap2.get() & UByte.MAX_VALUE];
                                    try {
                                        Wrap2.get(r2);
                                        r3 = new byte[Wrap2.get() & UByte.MAX_VALUE];
                                        try {
                                            Wrap2.get(r3);
                                            arrayList = new byte[Wrap2.remaining()];
                                            try {
                                                Wrap2.get(arrayList);
                                                try {
                                                    bArrTuitionPaymentFragmentspecialinlinedviewModeldefault2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2(bArr, arrayList, r2, bArr3);
                                                    Bytes bytesB2 = Bytes.b((byte[]) r3);
                                                    if (bArrTuitionPaymentFragmentspecialinlinedviewModeldefault2 != null || !MediaBrowserCompatMediaBrowserImplBase6.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault2(bytesB2.byteArray, bArrTuitionPaymentFragmentspecialinlinedviewModeldefault2)) {
                                                        throw new AuthenticatedEncryptionException("encryption integrity exception: mac does not match");
                                                    }
                                                    ?? B = b();
                                                    B.init(2, TuitionPaymentFragmentspecialinlinedviewModeldefault3(bArr), new IvParameterSpec(r2));
                                                    byte[] bArrDoFinal = B.doFinal(arrayList);
                                                    Bytes bytesTuitionPaymentFragmentspecialinlinedviewModeldefault5 = Bytes.TuitionPaymentFragmentspecialinlinedviewModeldefault2((byte[]) r2);
                                                    MutableBytes mutableBytes4 = bytesTuitionPaymentFragmentspecialinlinedviewModeldefault5 instanceof MutableBytes ? (MutableBytes) bytesTuitionPaymentFragmentspecialinlinedviewModeldefault5 : new MutableBytes(bytesTuitionPaymentFragmentspecialinlinedviewModeldefault5.byteArray, bytesTuitionPaymentFragmentspecialinlinedviewModeldefault5.byteOrder);
                                                    SecureRandom secureRandom4 = new SecureRandom();
                                                    if (mutableBytes4.byteArray.length > 0) {
                                                        int i35 = asBinder + 45;
                                                        INotificationSideChannel = i35 % 128;
                                                        if (i35 % 2 == 0) {
                                                            secureRandom4.nextBytes(mutableBytes4.byteArray);
                                                            Object obj3 = null;
                                                            obj3.hashCode();
                                                            throw null;
                                                        }
                                                        secureRandom4.nextBytes(mutableBytes4.byteArray);
                                                    }
                                                    Bytes bytesTuitionPaymentFragmentspecialinlinedviewModeldefault6 = Bytes.TuitionPaymentFragmentspecialinlinedviewModeldefault2((byte[]) arrayList);
                                                    MutableBytes mutableBytes5 = bytesTuitionPaymentFragmentspecialinlinedviewModeldefault6 instanceof MutableBytes ? (MutableBytes) bytesTuitionPaymentFragmentspecialinlinedviewModeldefault6 : new MutableBytes(bytesTuitionPaymentFragmentspecialinlinedviewModeldefault6.byteArray, bytesTuitionPaymentFragmentspecialinlinedviewModeldefault6.byteOrder);
                                                    SecureRandom secureRandom5 = new SecureRandom();
                                                    if (mutableBytes5.byteArray.length > 0) {
                                                        secureRandom5.nextBytes(mutableBytes5.byteArray);
                                                    }
                                                    Bytes bytesTuitionPaymentFragmentspecialinlinedviewModeldefault7 = Bytes.TuitionPaymentFragmentspecialinlinedviewModeldefault2((byte[]) r3);
                                                    MutableBytes mutableBytes6 = !((bytesTuitionPaymentFragmentspecialinlinedviewModeldefault7 instanceof MutableBytes) ^ true) ? (MutableBytes) bytesTuitionPaymentFragmentspecialinlinedviewModeldefault7 : new MutableBytes(bytesTuitionPaymentFragmentspecialinlinedviewModeldefault7.byteArray, bytesTuitionPaymentFragmentspecialinlinedviewModeldefault7.byteOrder);
                                                    SecureRandom secureRandom6 = new SecureRandom();
                                                    if (mutableBytes6.byteArray.length > 0) {
                                                        secureRandom6.nextBytes(mutableBytes6.byteArray);
                                                    }
                                                    return bArrDoFinal;
                                                } catch (Exception e2) {
                                                    e = e2;
                                                    ?? r43 = arrayList;
                                                    r4 = r2;
                                                    r5 = r43;
                                                    r3 = r3;
                                                    try {
                                                        throw new AuthenticatedEncryptionException("could not decrypt", e);
                                                    } catch (Throwable th3) {
                                                        th = th3;
                                                        ?? r44 = r4;
                                                        arrayList = r5;
                                                        r2 = r44;
                                                    }
                                                } catch (Throwable th4) {
                                                    th = th4;
                                                }
                                            } catch (Exception e3) {
                                                e = e3;
                                            } catch (Throwable th5) {
                                                th = th5;
                                            }
                                        } catch (Exception e4) {
                                            e = e4;
                                            arrayList = 0;
                                        } catch (Throwable th6) {
                                            th = th6;
                                            arrayList = 0;
                                        }
                                    } catch (Exception e5) {
                                        e = e5;
                                        arrayList = 0;
                                        r3 = 0;
                                    } catch (Throwable th7) {
                                        th = th7;
                                        arrayList = 0;
                                        r3 = 0;
                                    }
                                } catch (Throwable th8) {
                                    th = th8;
                                    Throwable cause3 = th.getCause();
                                    if (cause3 != null) {
                                        throw cause3;
                                    }
                                    throw th;
                                }
                            } catch (Throwable th9) {
                                th = th9;
                            }
                        } catch (Throwable th10) {
                            th = th10;
                            Throwable cause4 = th.getCause();
                            if (cause4 != null) {
                                throw cause4;
                            }
                            throw th;
                        }
                    } catch (Throwable th11) {
                        th = th11;
                    }
                } catch (Exception e6) {
                    e = e6;
                    ?? r6 = arrayList;
                    r3 = r6;
                    r5 = r6;
                    r4 = arrayList;
                    throw new AuthenticatedEncryptionException("could not decrypt", e);
                } catch (Throwable th12) {
                    th = th12;
                    r2 = arrayList;
                    r3 = r2;
                }
            } catch (Exception e7) {
                e = e7;
                arrayList = 0;
                ?? r7 = arrayList;
                r3 = r7;
                r5 = r7;
                r4 = arrayList;
                throw new AuthenticatedEncryptionException("could not decrypt", e);
            } catch (Throwable th13) {
                th = th13;
                arrayList = 0;
                r2 = arrayList;
                r3 = r2;
                bytesTuitionPaymentFragmentspecialinlinedviewModeldefault2 = Bytes.TuitionPaymentFragmentspecialinlinedviewModeldefault2((byte[]) r2);
                if (bytesTuitionPaymentFragmentspecialinlinedviewModeldefault2 instanceof MutableBytes) {
                    mutableBytes = (MutableBytes) bytesTuitionPaymentFragmentspecialinlinedviewModeldefault2;
                } else {
                    mutableBytes = new MutableBytes(bytesTuitionPaymentFragmentspecialinlinedviewModeldefault2.byteArray, bytesTuitionPaymentFragmentspecialinlinedviewModeldefault2.byteOrder);
                }
                secureRandom = new SecureRandom();
                if (mutableBytes.byteArray.length > 0) {
                    secureRandom.nextBytes(mutableBytes.byteArray);
                }
                bytesTuitionPaymentFragmentspecialinlinedviewModeldefault3 = Bytes.TuitionPaymentFragmentspecialinlinedviewModeldefault2((byte[]) arrayList);
                if (bytesTuitionPaymentFragmentspecialinlinedviewModeldefault3 instanceof MutableBytes) {
                    mutableBytes2 = (MutableBytes) bytesTuitionPaymentFragmentspecialinlinedviewModeldefault3;
                } else {
                    mutableBytes2 = new MutableBytes(bytesTuitionPaymentFragmentspecialinlinedviewModeldefault3.byteArray, bytesTuitionPaymentFragmentspecialinlinedviewModeldefault3.byteOrder);
                }
                secureRandom2 = new SecureRandom();
                if (mutableBytes2.byteArray.length > 0) {
                    secureRandom2.nextBytes(mutableBytes2.byteArray);
                }
                bytesTuitionPaymentFragmentspecialinlinedviewModeldefault4 = Bytes.TuitionPaymentFragmentspecialinlinedviewModeldefault2((byte[]) r3);
                if (bytesTuitionPaymentFragmentspecialinlinedviewModeldefault4 instanceof MutableBytes) {
                    mutableBytes3 = (MutableBytes) bytesTuitionPaymentFragmentspecialinlinedviewModeldefault4;
                } else {
                    mutableBytes3 = new MutableBytes(bytesTuitionPaymentFragmentspecialinlinedviewModeldefault4.byteArray, bytesTuitionPaymentFragmentspecialinlinedviewModeldefault4.byteOrder);
                }
                secureRandom3 = new SecureRandom();
                if (mutableBytes3.byteArray.length > 0) {
                    int i36 = INotificationSideChannel + 17;
                    asBinder = i36 % 128;
                    int i37 = i36 % 2;
                    secureRandom3.nextBytes(mutableBytes3.byteArray);
                }
                throw th;
            }
        } catch (Exception e8) {
            e = e8;
            arrayList = clsArr;
        } catch (Throwable th14) {
            th = th14;
            arrayList = clsArr;
        }
        bytesTuitionPaymentFragmentspecialinlinedviewModeldefault2 = Bytes.TuitionPaymentFragmentspecialinlinedviewModeldefault2((byte[]) r2);
        if (bytesTuitionPaymentFragmentspecialinlinedviewModeldefault2 instanceof MutableBytes) {
            mutableBytes = (MutableBytes) bytesTuitionPaymentFragmentspecialinlinedviewModeldefault2;
        } else {
            mutableBytes = new MutableBytes(bytesTuitionPaymentFragmentspecialinlinedviewModeldefault2.byteArray, bytesTuitionPaymentFragmentspecialinlinedviewModeldefault2.byteOrder);
        }
        secureRandom = new SecureRandom();
        if (mutableBytes.byteArray.length > 0) {
            secureRandom.nextBytes(mutableBytes.byteArray);
        }
        bytesTuitionPaymentFragmentspecialinlinedviewModeldefault3 = Bytes.TuitionPaymentFragmentspecialinlinedviewModeldefault2((byte[]) arrayList);
        if (bytesTuitionPaymentFragmentspecialinlinedviewModeldefault3 instanceof MutableBytes) {
            mutableBytes2 = (MutableBytes) bytesTuitionPaymentFragmentspecialinlinedviewModeldefault3;
        } else {
            mutableBytes2 = new MutableBytes(bytesTuitionPaymentFragmentspecialinlinedviewModeldefault3.byteArray, bytesTuitionPaymentFragmentspecialinlinedviewModeldefault3.byteOrder);
        }
        secureRandom2 = new SecureRandom();
        if (mutableBytes2.byteArray.length > 0) {
            secureRandom2.nextBytes(mutableBytes2.byteArray);
        }
        bytesTuitionPaymentFragmentspecialinlinedviewModeldefault4 = Bytes.TuitionPaymentFragmentspecialinlinedviewModeldefault2((byte[]) r3);
        if (bytesTuitionPaymentFragmentspecialinlinedviewModeldefault4 instanceof MutableBytes) {
            mutableBytes3 = (MutableBytes) bytesTuitionPaymentFragmentspecialinlinedviewModeldefault4;
        } else {
            mutableBytes3 = new MutableBytes(bytesTuitionPaymentFragmentspecialinlinedviewModeldefault4.byteArray, bytesTuitionPaymentFragmentspecialinlinedviewModeldefault4.byteOrder);
        }
        secureRandom3 = new SecureRandom();
        if (mutableBytes3.byteArray.length > 0) {
            int i38 = INotificationSideChannel + 17;
            asBinder = i38 % 128;
            int i39 = i38 % 2;
            secureRandom3.nextBytes(mutableBytes3.byteArray);
        }
        throw th;
    }

    /* JADX WARN: Code duplicated, block: B:93:0x06cc  */
    private Cipher b() throws Throwable {
        int i;
        boolean z;
        int i2;
        String string;
        Cipher cipher;
        Method method;
        Method[] declaredMethods;
        int length;
        int i3 = 2;
        int i4 = 2 % 2;
        Cipher cipher2 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.get();
        if (cipher2 != null) {
            return cipher2;
        }
        try {
            int iIntValue = ((Integer) Class.forName("java.lang.System").getMethod("identityHashCode", Object.class).invoke(null, this)).intValue();
            if (MediaControllerCompat.Callback.StubApi21.TuitionPaymentFragmentspecialinlinedviewModeldefault1(new ArrayList()) != 0) {
                Toast.makeText((Context) null, iIntValue / (((iIntValue - 1) * iIntValue) % 2), 0).show();
            }
            Provider provider = this.b;
            if (provider != null) {
                cipher = Cipher.getInstance("AES/CBC/PKCS5Padding", provider);
            } else {
                ArrayList arrayList = new ArrayList();
                byte[] bArr = $$a;
                byte b = bArr[19];
                Object[] objArr = new Object[1];
                c(b, (byte) (b | 14), bArr[14], objArr);
                Class<?> cls = Class.forName((String) objArr[0]);
                byte b2 = bArr[17];
                byte b3 = b2;
                Object[] objArr2 = new Object[1];
                c(b3, (byte) (b3 + 4), b2, objArr2);
                Method[] methodArr = {cls.getMethod((String) objArr2[0], String.class)};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
                char c = '0';
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    char packedPositionType = (char) ExpandableListView.getPackedPositionType(0L);
                    int iLastIndexOf = TextUtils.lastIndexOf("", '0', 0, 0) + 2824;
                    int iMyTid = (Process.myTid() >> 22) + 22;
                    byte[] bArr2 = $$d;
                    byte b4 = bArr2[5];
                    Object[] objArr3 = new Object[1];
                    e(b4, b4, bArr2[10], objArr3);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(packedPositionType, iLastIndexOf, iMyTid, 1814927978, false, (String) objArr3[0], null);
                }
                if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).get(null) == null) {
                    int i5 = INotificationSideChannel + 121;
                    asBinder = i5 % 128;
                    if (i5 % 2 != 0) {
                        declaredMethods = ((Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) View.resolveSize(0, 0), Color.argb(0, 0, 0, 0) + 2823, (Process.myPid() >> 22) + 22)).getDeclaredMethods();
                        length = declaredMethods.length;
                    } else {
                        declaredMethods = ((Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (ViewConfiguration.getMinimumFlingVelocity() >> 16), MotionEvent.axisFromString("") + 2824, TextUtils.indexOf("", "") + 22)).getDeclaredMethods();
                        length = declaredMethods.length;
                    }
                    int i6 = 0;
                    while (i6 < length) {
                        int i7 = INotificationSideChannel + 13;
                        asBinder = i7 % 128;
                        int i8 = i7 % i3;
                        Method method2 = declaredMethods[i6];
                        try {
                            Object[] objArr4 = new Object[1];
                            f(AndroidCharacter.getMirror(c) + 42310, (-23) - TextUtils.indexOf("", ""), (short) Color.argb(0, 0, 0, 0), (byte) TextUtils.indexOf("", ""), TextUtils.indexOf("", c, 0) + 1080323256, objArr4);
                            Class<?> cls2 = Class.forName((String) objArr4[0]);
                            Object[] objArr5 = new Object[1];
                            f(Color.alpha(0) + 79471987, (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) - 35, (short) (ViewConfiguration.getFadingEdgeLength() >> 16), (byte) (ViewConfiguration.getScrollBarSize() >> 8), (KeyEvent.getMaxKeyCode() >> 16) + 1080323278, objArr5);
                            Object[] objArr6 = {Integer.valueOf(((Integer) cls2.getMethod((String) objArr5[0], null).invoke(method2, null)).intValue())};
                            Object[] objArr7 = new Object[1];
                            f(ExpandableListView.getPackedPositionType(0L) + 79471990, (ViewConfiguration.getScrollBarFadeDuration() >> 16) - 21, (short) (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), (byte) KeyEvent.keyCodeFromString(""), (ViewConfiguration.getFadingEdgeLength() >> 16) + 1080323289, objArr7);
                            Class<?> cls3 = Class.forName((String) objArr7[0]);
                            Object[] objArr8 = new Object[1];
                            f(79471989 - Drawable.resolveOpacity(0, 0), TextUtils.lastIndexOf("", c, 0, 0) - 38, (short) ((-1) - TextUtils.indexOf("", c, 0)), (byte) TextUtils.getTrimmedLength(""), ImageFormat.getBitsPerPixel(0) + 1080323315, objArr8);
                            if (((Boolean) cls3.getMethod((String) objArr8[0], Integer.TYPE).invoke(null, objArr6)).booleanValue()) {
                                Class cls4 = Long.TYPE;
                                Object[] objArr9 = new Object[1];
                                f(79471989 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), Drawable.resolveOpacity(0, 0) - 23, (short) (ViewConfiguration.getJumpTapTimeout() >> 16), (byte) (AndroidCharacter.getMirror('0') - '0'), TextUtils.indexOf((CharSequence) "", '0', 0) + 1080323256, objArr9);
                                Class<?> cls5 = Class.forName((String) objArr9[0]);
                                Object[] objArr10 = new Object[1];
                                f(79471987 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), TextUtils.indexOf("", "") - 34, (short) ((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) - 1), (byte) ((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) - 1), 1080323320 - TextUtils.indexOf((CharSequence) "", '0', 0), objArr10);
                                if (cls4.equals(cls5.getMethod((String) objArr10[0], null).invoke(method2, null))) {
                                    int i9 = INotificationSideChannel + 51;
                                    asBinder = i9 % 128;
                                    int i10 = i9 % 2;
                                    Object[] objArr11 = new Object[1];
                                    f(TextUtils.indexOf((CharSequence) "", '0', 0) + 79471991, (-23) - View.MeasureSpec.getMode(0), (short) KeyEvent.normalizeMetaState(0), (byte) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 1), (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 1080323255, objArr11);
                                    Class<?> cls6 = Class.forName((String) objArr11[0]);
                                    Object[] objArr12 = new Object[1];
                                    f(79471987 - View.resolveSize(0, 0), (-30) - (ViewConfiguration.getTapTimeout() >> 16), (short) (ViewConfiguration.getScrollDefaultDelay() >> 16), (byte) TextUtils.getOffsetAfter("", 0), (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 1080323333, objArr12);
                                    Object[] objArr13 = (Object[]) cls6.getMethod((String) objArr12[0], null).invoke(method2, null);
                                    if (objArr13.length == 2 && Long.TYPE.equals(objArr13[0])) {
                                        int i11 = INotificationSideChannel + 65;
                                        asBinder = i11 % 128;
                                        int i12 = i11 % 2;
                                        Object[] objArr14 = new Object[1];
                                        f((ViewConfiguration.getTapTimeout() >> 16) + 79471990, (-23) - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), (short) TextUtils.indexOf("", "", 0), (byte) (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), TextUtils.indexOf("", "") + 1080323255, objArr14);
                                        if (Class.forName((String) objArr14[0]).equals(objArr13[1])) {
                                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
                                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                                char cLastIndexOf = (char) ((-1) - TextUtils.lastIndexOf("", '0', 0, 0));
                                                int mirror = 2871 - AndroidCharacter.getMirror('0');
                                                int longPressTimeout = (ViewConfiguration.getLongPressTimeout() >> 16) + 22;
                                                byte[] bArr3 = $$d;
                                                byte b5 = bArr3[5];
                                                Object[] objArr15 = new Object[1];
                                                e(b5, b5, bArr3[10], objArr15);
                                                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cLastIndexOf, mirror, longPressTimeout, 1814927978, false, (String) objArr15[0], null);
                                            }
                                            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).set(null, method2);
                                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
                                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                                                char cArgb = (char) Color.argb(0, 0, 0, 0);
                                                int i13 = 2823 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
                                                int keyRepeatTimeout = 22 - (ViewConfiguration.getKeyRepeatTimeout() >> 16);
                                                byte[] bArr4 = $$d;
                                                byte b6 = bArr4[5];
                                                Object[] objArr16 = new Object[1];
                                                e(b6, b6, bArr4[10], objArr16);
                                                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(cArgb, i13, keyRepeatTimeout, 1814927978, false, (String) objArr16[0], null);
                                            }
                                            try {
                                                Object[] objArr17 = {0L, ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null)};
                                                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1678062333);
                                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                                                    char packedPositionType2 = (char) ExpandableListView.getPackedPositionType(0L);
                                                    int mirror2 = 2871 - AndroidCharacter.getMirror('0');
                                                    int bitsPerPixel = 21 - ImageFormat.getBitsPerPixel(0);
                                                    byte b7 = $$d[7];
                                                    byte b8 = b7;
                                                    Object[] objArr18 = new Object[1];
                                                    e(b7, b8, b8, objArr18);
                                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(packedPositionType2, mirror2, bitsPerPixel, -2137287382, false, (String) objArr18[0], new Class[]{Long.TYPE, Method.class});
                                                }
                                                ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr17)).longValue();
                                                int i14 = INotificationSideChannel + 67;
                                                asBinder = i14 % 128;
                                                int i15 = i14 % 2;
                                                break;
                                            } catch (Throwable th) {
                                                Throwable cause = th.getCause();
                                                if (cause != null) {
                                                    throw cause;
                                                }
                                                throw th;
                                            }
                                        }
                                    }
                                } else {
                                    continue;
                                }
                            }
                            i6++;
                            i3 = 2;
                            c = '0';
                        } catch (Throwable th2) {
                            Throwable cause2 = th2.getCause();
                            if (cause2 != null) {
                                throw cause2;
                            }
                            throw th2;
                        }
                    }
                }
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                    char cGreen = (char) Color.green(0);
                    int iIndexOf = 2823 - TextUtils.indexOf("", "", 0, 0);
                    int iIndexOf2 = 22 - TextUtils.indexOf("", "", 0, 0);
                    byte[] bArr5 = $$d;
                    byte b9 = bArr5[5];
                    Object[] objArr19 = new Object[1];
                    e(b9, b9, bArr5[10], objArr19);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(cGreen, iIndexOf, iIndexOf2, 1814927978, false, (String) objArr19[0], null);
                }
                try {
                    Object[] objArr20 = {((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).get(null)};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-645763082);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                        char c2 = (char) ((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) - 1);
                        int edgeSlop = 2823 - (ViewConfiguration.getEdgeSlop() >> 16);
                        int packedPositionChild = 21 - ExpandableListView.getPackedPositionChild(0L);
                        byte b10 = $$d[7];
                        byte b11 = b10;
                        Object[] objArr21 = new Object[1];
                        e(b10, b11, (byte) (b11 + 5), objArr21);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(c2, edgeSlop, packedPositionChild, 1025296417, false, (String) objArr21[0], new Class[]{Object.class});
                    }
                    ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).invoke(null, objArr20);
                    try {
                        Object[] objArr22 = {0, methodArr, null};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1189131659);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
                            char cIndexOf = (char) (TextUtils.indexOf((CharSequence) "", '0') + 37658);
                            int minimumFlingVelocity = (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 2720;
                            int mirror3 = AndroidCharacter.getMirror('0') - 29;
                            byte b12 = $$d[7];
                            byte b13 = b12;
                            Object[] objArr23 = new Object[1];
                            e(b12, b13, (byte) (b13 + 5), objArr23);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(cIndexOf, minimumFlingVelocity, mirror3, -1568796068, false, (String) objArr23[0], new Class[]{Integer.TYPE, Method[].class, List.class});
                        }
                        long jLongValue = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).invoke(null, objArr22)).longValue();
                        long j = -62881669;
                        long j2 = -1;
                        long j3 = j ^ j2;
                        long j4 = 191;
                        long startElapsedRealtime = (int) Process.getStartElapsedRealtime();
                        long j5 = (((long) (-381)) * j) + (((long) DerHeader.TAG_CLASS_PRIVATE) * jLongValue) + (((long) (-191)) * j3) + ((j | ((jLongValue | startElapsedRealtime) ^ j2)) * j4) + (j4 * (((jLongValue | (startElapsedRealtime ^ j2)) ^ j2) | ((j3 | jLongValue) ^ j2))) + ((long) (-1747524176));
                        int iElapsedRealtime = (int) SystemClock.elapsedRealtime();
                        int i16 = ~iElapsedRealtime;
                        int i17 = ((int) (j5 >> 32)) & ((-1130699678) + (((~(i16 | 576812889)) | 860413521) * (-1042)) + ((576812889 | iElapsedRealtime) * 521) + (((~(iElapsedRealtime | (-860413522))) | 574641745 | (~(i16 | 862584665))) * 521));
                        int i18 = (int) j5;
                        int iIdentityHashCode = System.identityHashCode(this);
                        int i19 = ~iIdentityHashCode;
                        int i20 = (-1905160647) + (((~(2004680080 | i19)) | 8520294 | (~((-567453671) | i19)) | (~((-1445746705) | iIdentityHashCode))) * (-84));
                        int i21 = (~(iIdentityHashCode | (-567453671))) | (-2004680081);
                        int i22 = ~(i19 | 567453670);
                        int i23 = i17 | (i18 & (i20 + ((i21 | i22) * (-84)) + ((1445746704 | i22) * 84)));
                        int i24 = i23 >>> 24;
                        int i25 = i23 & ViewCompat.MEASURED_SIZE_MASK;
                        if (i24 != 0) {
                            z = true;
                            i = 2;
                        } else {
                            int i26 = asBinder + 11;
                            INotificationSideChannel = i26 % 128;
                            i = 2;
                            int i27 = i26 % 2;
                            z = false;
                        }
                        if (z) {
                            int i28 = INotificationSideChannel + 119;
                            asBinder = i28 % 128;
                            int i29 = i28 % i;
                            i2 = 1;
                        } else {
                            i2 = 0;
                        }
                        if (z) {
                            int i30 = asBinder + 97;
                            INotificationSideChannel = i30 % 128;
                            int i31 = i30 % i;
                            if (i25 >= 1 || (method = methodArr[i25]) == null) {
                                string = null;
                            } else {
                                string = method.toString();
                            }
                        } else {
                            string = null;
                        }
                        arrayList.add(string);
                        if ((i24 + 6) * i2 != 0) {
                            throw new NullPointerException();
                        }
                        cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
                    } catch (Throwable th3) {
                        Throwable cause3 = th3.getCause();
                        if (cause3 != null) {
                            throw cause3;
                        }
                        throw th3;
                    }
                } catch (Throwable th4) {
                    Throwable cause4 = th4.getCause();
                    if (cause4 != null) {
                        throw cause4;
                    }
                    throw th4;
                }
            }
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.set(cipher);
            return this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.get();
        } catch (Exception e2) {
            throw new IllegalStateException("could not get cipher instance", e2);
        }
    }

    @Override // defpackage.MediaBrowserCompatMediaBrowserImplApi21
    public final int TuitionPaymentFragmentspecialinlinedviewModeldefault1(int i) {
        int i2 = 2 % 2;
        int i3 = INotificationSideChannel + 125;
        int i4 = i3 % 128;
        asBinder = i4;
        int i5 = i3 % 2;
        if (i == 0) {
            int i6 = i4 + 67;
            INotificationSideChannel = i6 % 128;
            return i6 % 2 == 0 ? 12 : 16;
        }
        int i7 = i4 + 81;
        INotificationSideChannel = i7 % 128;
        if (i7 % 2 == 0) {
            int i8 = 25 / 0;
        }
        return 32;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0023  */
    /* JADX WARN: Code duplicated, block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x0025). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0023
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$g(byte r6, int r7, int r8) {
        /*
            int r7 = r7 * 3
            int r7 = 4 - r7
            int r8 = 121 - r8
            int r6 = r6 * 3
            int r6 = r6 + 1
            byte[] r0 = defpackage.onResult.$$c
            byte[] r1 = new byte[r6]
            r2 = 0
            if (r0 != 0) goto L15
            r3 = r8
            r5 = r2
            r8 = r6
            goto L25
        L15:
            r3 = r2
        L16:
            byte r4 = (byte) r8
            int r5 = r3 + 1
            r1[r3] = r4
            if (r5 != r6) goto L23
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L23:
            r3 = r0[r7]
        L25:
            int r7 = r7 + 1
            int r8 = r8 + r3
            r3 = r5
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.onResult.$$g(byte, int, int):java.lang.String");
    }
}
