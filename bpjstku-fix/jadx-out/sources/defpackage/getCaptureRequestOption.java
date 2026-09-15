package defpackage;

import android.content.Context;
import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.util.Base64;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.Toast;
import androidx.autofill.HintConstants;
import androidx.core.app.NotificationCompat;
import androidx.core.view.ViewCompat;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.firebase.messaging.Constants;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.PBEKeySpec;
import javax.crypto.spec.SecretKeySpec;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00042\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LgetCaptureRequestOption;", "", "<init>", "()V", "TuitionPaymentFragmentbindingInflater1"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class getCaptureRequestOption {

    /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 32;

    /* JADX INFO: renamed from: getCaptureRequestOption$TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u0012\n\u0002\b\u000f\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J \u0010\r\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u00052\b\b\u0002\u0010\u0010\u001a\u00020\u0005J\u0018\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u000e\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0012H\u0002J \u0010\u0014\u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u00052\b\b\u0002\u0010\u0010\u001a\u00020\u0005J\u0018\u0010\u0016\u001a\u00020\u00122\u0006\u0010\u0017\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0012H\u0002J\n\u0010\u0018\u001a\u00020\u0005*\u00020\u0005J\n\u0010\u0019\u001a\u00020\u0005*\u00020\u0005J \u0010\u001a\u001a\u00020\u00052\u0006\u0010\u001b\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u00052\b\b\u0002\u0010\u001c\u001a\u00020\u0005J\u0010\u0010\u001d\u001a\u00020\u00052\u0006\u0010\u001e\u001a\u00020\u0012H\u0002J\u0016\u0010\u001f\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u00052\u0006\u0010 \u001a\u00020\u0005R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006!"}, d2 = {"Lcom/bpjstku/util/utils/EncryptionUtilsNew$Companion;", "", "<init>", "()V", "ALGORITHM_NAME", "", "ALGORITHM_NONCE_SIZE", "", "ALGORITHM_TAG_SIZE", "ALGORITHM_KEY_SIZE", "PBKDF2_NAME", "PBKDF2_SALT_SIZE", "PBKDF2_ITERATIONS", "encryptAes", "plaintext", HintConstants.AUTOFILL_HINT_PASSWORD, "type", "encrypt", "", "key", "decryptAes", "base64CiphertextAndNonceAndSalt", "decrypt", "ciphertextAndNonce", "toBase64WithoutPadding", "decodeBase64WithPadding", "digest", NotificationCompat.CATEGORY_MESSAGE, "alg", "format", "bytes", "testEncrypt", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private static final byte[] $$c = {94, -1, 37, -59};
        private static final int $$f = 68;
        private static int $10 = 0;
        private static int $11 = 1;
        private static final byte[] $$d = {117, 57, 101, -72, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -56};
        private static final int $$e = 162;
        private static final byte[] $$a = {25, 5, -88, -44, 1, 18, -40, 40, 8, 4, -16, 16, -8, 5};
        private static final int $$b = 3;
        private static int TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
        private static int b = 1;
        private static char[] TuitionPaymentFragmentspecialinlinedviewModeldefault2 = {5895, 45742, 23647, 59370, 33227, 11051, 63168, 36973, 14874, 50673, 28491, 2814, 54419, 32315, 6612, 41840, 19769, 59521, 45636, 23566, 59313, 33103, 11502, 63111, 56898, 31714, 38165, 11918, 18626, 57963, 16256, 22829, 62300, 3314, 42499, 50080, 63129, 21296, 48577, 1652, 24661, 51893, 5982, 29171, 56196, 9327, 36565, 60256, 13581, 40869, 63562, 17134, 44199, 2335, 21466, 48538, 1599, 24784, 52601, 5908, 29094, 55891, 45557, 5197, 64150, 16667, 10080, 36319, 20518, 13975, 45563, 5211, 64172, 16680, 10097, 36290, 20517, 13952, 40162, 25466, 51633, 44058, 29281, 15320, 40568, 28815, 51977, 44374, 2023, 55826, 48316, 5834, 59769, 17294, 9787, 63603, 21244, 13587, 36772, 25068};
        private static long TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 5139895605979911230L;

        /* JADX WARN: Code duplicated, block: B:10:0x0027  */
        /* JADX WARN: Code duplicated, block: B:8:0x001f  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x0029). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0027
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        private static void a(int r5, short r6, int r7, java.lang.Object[] r8) {
            /*
                int r5 = r5 * 4
                int r5 = 11 - r5
                int r7 = r7 + 4
                byte[] r0 = defpackage.getCaptureRequestOption.Companion.$$a
                int r6 = r6 * 2
                int r6 = r6 + 103
                byte[] r1 = new byte[r5]
                r2 = 0
                if (r0 != 0) goto L15
                r4 = r6
                r3 = r2
                r6 = r5
                goto L29
            L15:
                r3 = r2
            L16:
                int r7 = r7 + 1
                byte r4 = (byte) r6
                r1[r3] = r4
                int r3 = r3 + 1
                if (r3 != r5) goto L27
                java.lang.String r5 = new java.lang.String
                r5.<init>(r1, r2)
                r8[r2] = r5
                return
            L27:
                r4 = r0[r7]
            L29:
                int r6 = r6 + r4
                int r6 = r6 + (-3)
                goto L16
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.getCaptureRequestOption.Companion.a(int, short, int, java.lang.Object[]):void");
        }

        /* JADX WARN: Code duplicated, block: B:10:0x0024  */
        /* JADX WARN: Code duplicated, block: B:8:0x001c  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x0028). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0024
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        private static void c(byte r5, byte r6, byte r7, java.lang.Object[] r8) {
            /*
                int r7 = 103 - r7
                int r6 = r6 * 52
                int r0 = r6 + 1
                int r5 = r5 * 52
                int r5 = 55 - r5
                byte[] r1 = defpackage.getCaptureRequestOption.Companion.$$d
                byte[] r0 = new byte[r0]
                r2 = 0
                if (r1 != 0) goto L14
                r4 = r6
                r3 = r2
                goto L28
            L14:
                r3 = r2
            L15:
                int r5 = r5 + 1
                byte r4 = (byte) r7
                r0[r3] = r4
                if (r3 != r6) goto L24
                java.lang.String r5 = new java.lang.String
                r5.<init>(r0, r2)
                r8[r2] = r5
                return
            L24:
                int r3 = r3 + 1
                r4 = r1[r5]
            L28:
                int r7 = r7 + r4
                int r7 = r7 + (-11)
                goto L15
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.getCaptureRequestOption.Companion.c(byte, byte, byte, java.lang.Object[]):void");
        }

        private Companion() {
        }

        public static /* synthetic */ String TuitionPaymentFragmentspecialinlinedviewModeldefault3(Companion companion, String str, String str2) throws Throwable {
            int i = 2 % 2;
            int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 107;
            b = i2 % 128;
            if (i2 % 2 != 0) {
                return companion.TuitionPaymentFragmentbindingInflater1(str, str2, "");
            }
            companion.TuitionPaymentFragmentbindingInflater1(str, str2, "");
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final String TuitionPaymentFragmentbindingInflater1(String str, String str2, String str3) throws Throwable {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            byte[] bArr = new byte[16];
            new SecureRandom().nextBytes(bArr);
            char[] charArray = str2.toCharArray();
            Intrinsics.checkNotNullExpressionValue(charArray, "");
            PBEKeySpec pBEKeySpec = new PBEKeySpec(charArray, bArr, getCaptureRequestOption.TuitionPaymentFragmentspecialinlinedviewModeldefault1, 128);
            SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("PBKDF2WithHmacSHA256");
            Intrinsics.checkNotNullExpressionValue(secretKeyFactory, "");
            byte[] encoded = secretKeyFactory.generateSecret(pBEKeySpec).getEncoded();
            Intrinsics.checkNotNullExpressionValue(encoded, "");
            Charset charset = StandardCharsets.UTF_8;
            Intrinsics.checkNotNullExpressionValue(charset, "");
            byte[] bytes = str.getBytes(charset);
            Intrinsics.checkNotNullExpressionValue(bytes, "");
            byte[] bArrTuitionPaymentFragmentspecialinlinedviewModeldefault3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3(bytes, encoded);
            byte[] bArr2 = new byte[bArrTuitionPaymentFragmentspecialinlinedviewModeldefault3.length + 16];
            System.arraycopy(bArr, 0, bArr2, 0, 16);
            System.arraycopy(bArrTuitionPaymentFragmentspecialinlinedviewModeldefault3, 0, bArr2, 16, bArrTuitionPaymentFragmentspecialinlinedviewModeldefault3.length);
            String strEncodeToString = Base64.encodeToString(bArr2, 0);
            Intrinsics.checkNotNullExpressionValue(strEncodeToString, "");
            int i2 = b + 77;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
            if (i2 % 2 == 0) {
                return strEncodeToString;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        private static void d(int i, int i2, char c, Object[] objArr) throws Throwable {
            long j;
            int i3 = 2 % 2;
            lambdabuild0androidxcameracoreimplSessionConfigValidatingBuilder lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder = new lambdabuild0androidxcameracoreimplSessionConfigValidatingBuilder();
            long[] jArr = new long[i2];
            lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
            int i4 = $11 + 61;
            $10 = i4 % 128;
            int i5 = i4 % 2;
            while (true) {
                j = 0;
                if (lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 >= i2) {
                    break;
                }
                int i6 = $11 + 59;
                $10 = i6 % 128;
                int i7 = i6 % 2;
                int i8 = lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                try {
                    Object[] objArr2 = {Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault2[i + i8])};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-692725632);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        char trimmedLength = (char) TextUtils.getTrimmedLength("");
                        int i9 = (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 2186;
                        int size = View.MeasureSpec.getSize(0) + 40;
                        byte b2 = (byte) ($$c[1] + 1);
                        byte b3 = b2;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(trimmedLength, i9, size, 841711447, false, $$g(b2, b3, b3), new Class[]{Integer.TYPE});
                    }
                    Object[] objArr3 = {Long.valueOf(((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).longValue()), Long.valueOf(i8), Long.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault1), Integer.valueOf(c)};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-139477533);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                        char modifierMetaStateMask = (char) (((byte) KeyEvent.getModifierMetaStateMask()) + 33018);
                        int doubleTapTimeout = 3011 - (ViewConfiguration.getDoubleTapTimeout() >> 16);
                        int iIndexOf = TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 27;
                        byte b4 = (byte) ($$c[1] + 1);
                        byte b5 = (byte) (b4 + 2);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(modifierMetaStateMask, doubleTapTimeout, iIndexOf, 321985076, false, $$g(b4, b5, (byte) (b5 - 2)), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                    }
                    jArr[i8] = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).longValue();
                    Object[] objArr4 = {lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder, lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(584784343);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                        char keyRepeatTimeout = (char) (36505 - (ViewConfiguration.getKeyRepeatTimeout() >> 16));
                        int i10 = 3376 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
                        int iResolveSize = View.resolveSize(0, 0) + 17;
                        byte b6 = $$c[1];
                        byte b7 = (byte) (b6 + 1);
                        byte b8 = (byte) (-b6);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(keyRepeatTimeout, i10, iResolveSize, -968507904, false, $$g(b7, b8, (byte) (b8 - 1)), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            char[] cArr = new char[i2];
            lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
            while (lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 < i2) {
                int i11 = $10 + 119;
                $11 = i11 % 128;
                int i12 = i11 % 2;
                cArr[lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) jArr[lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1];
                try {
                    Object[] objArr5 = {lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder, lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(584784343);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        char cArgb = (char) (36505 - Color.argb(0, 0, 0, 0));
                        int iResolveOpacity = 3376 - Drawable.resolveOpacity(0, 0);
                        int packedPositionChild = 16 - ExpandableListView.getPackedPositionChild(j);
                        byte b9 = $$c[1];
                        byte b10 = (byte) (b9 + 1);
                        byte b11 = (byte) (-b9);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(cArgb, iResolveOpacity, packedPositionChild, -968507904, false, $$g(b10, b11, (byte) (b11 - 1)), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5);
                    int i13 = $10 + 5;
                    $11 = i13 % 128;
                    int i14 = i13 % 2;
                    j = 0;
                } catch (Throwable th2) {
                    Throwable cause2 = th2.getCause();
                    if (cause2 == null) {
                        throw th2;
                    }
                    throw cause2;
                }
            }
            objArr[0] = new String(cArr);
        }

        private final byte[] TuitionPaymentFragmentspecialinlinedviewModeldefault3(byte[] bArr, byte[] bArr2) throws Throwable {
            int i;
            Method method;
            int i2 = 2;
            int i3 = 2 % 2;
            int i4 = 12;
            byte[] bArr3 = new byte[12];
            new SecureRandom().nextBytes(bArr3);
            int iIntValue = ((Integer) Class.forName("java.lang.System").getMethod("identityHashCode", Object.class).invoke(null, this)).intValue();
            if (FloatingActionButton.BaseBehavior.TuitionPaymentFragmentspecialinlinedviewModeldefault3(new ArrayList()) != 0) {
                int[] iArr = new int[iIntValue];
                int i5 = iIntValue - 1;
                iArr[i5] = 1;
                Toast.makeText((Context) null, iArr[((iIntValue * i5) % 2) - 1], 1).show();
                int i6 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1;
                b = i6 % 128;
                int i7 = i6 % 2;
            }
            int iIntValue2 = ((Integer) Class.forName("java.lang.System").getMethod("identityHashCode", Object.class).invoke(null, this)).intValue();
            if (setCompoundDrawables.b(new ArrayList()) != 0) {
                throw new RuntimeException(String.valueOf(iIntValue2));
            }
            ArrayList arrayList = new ArrayList();
            int iIntValue3 = ((Integer) Class.forName("java.lang.System").getMethod("identityHashCode", Object.class).invoke(null, this)).intValue();
            Class<?> cls = Class.forName("javax.crypto.Cipher");
            byte b2 = (byte) ($$b - 3);
            Object[] objArr = new Object[1];
            a(b2, b2, (byte) (-$$a[4]), objArr);
            int i8 = 0;
            Method[] methodArr = {cls.getMethod((String) objArr[0], String.class)};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                char absoluteGravity = (char) Gravity.getAbsoluteGravity(0, 0);
                int iLastIndexOf = TextUtils.lastIndexOf("", '0') + 2824;
                int deadChar = 22 - KeyEvent.getDeadChar(0, 0);
                byte[] bArr4 = $$d;
                byte b3 = (byte) (-bArr4[5]);
                Object[] objArr2 = new Object[1];
                c(b3, b3, bArr4[54], objArr2);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(absoluteGravity, iLastIndexOf, deadChar, 1814927978, false, (String) objArr2[0], null);
            }
            if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).get(null) == null) {
                Method[] declaredMethods = ((Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) KeyEvent.normalizeMetaState(0), 2823 - Gravity.getAbsoluteGravity(0, 0), View.combineMeasuredStates(0, 0) + 22)).getDeclaredMethods();
                int length = declaredMethods.length;
                int i9 = 0;
                while (i9 < length) {
                    Method method2 = declaredMethods[i9];
                    int i10 = b + 103;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i10 % 128;
                    int i11 = i10 % i2;
                    try {
                        Object[] objArr3 = new Object[1];
                        d(Color.green(i8), 24 - (CdmaCellLocation.convertQuartSecToDecDegrees(i8) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(i8) == 0.0d ? 0 : -1)), (char) (42737 - Drawable.resolveOpacity(i8, i8)), objArr3);
                        Class<?> cls2 = Class.forName((String) objArr3[i8]);
                        Object[] objArr4 = new Object[1];
                        d(24 - (Process.myPid() >> 22), (ViewConfiguration.getScrollBarSize() >> 8) + i4, (char) (KeyEvent.normalizeMetaState(i8) + 28601), objArr4);
                        int iIntValue4 = ((Integer) cls2.getMethod((String) objArr4[i8], null).invoke(method2, null)).intValue();
                        Object[] objArr5 = new Object[1];
                        objArr5[i8] = Integer.valueOf(iIntValue4);
                        Object[] objArr6 = new Object[1];
                        d(35 - Process.getGidForName(""), TextUtils.lastIndexOf("", '0', i8) + 27, (char) (18287 - TextUtils.getOffsetBefore("", i8)), objArr6);
                        Class<?> cls3 = Class.forName((String) objArr6[i8]);
                        int i12 = 62 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
                        int offsetAfter = TextUtils.getOffsetAfter("", i8) + 8;
                        char cIndexOf = (char) TextUtils.indexOf("", "", i8, i8);
                        Object[] objArr7 = new Object[1];
                        d(i12, offsetAfter, cIndexOf, objArr7);
                        if (((Boolean) cls3.getMethod((String) objArr7[0], Integer.TYPE).invoke(null, objArr5)).booleanValue()) {
                            Class cls4 = Long.TYPE;
                            Object[] objArr8 = new Object[1];
                            d(ViewConfiguration.getFadingEdgeLength() >> 16, Gravity.getAbsoluteGravity(0, 0) + 24, (char) (42737 - (ViewConfiguration.getScrollBarSize() >> 8)), objArr8);
                            Class<?> cls5 = Class.forName((String) objArr8[0]);
                            Object[] objArr9 = new Object[1];
                            d((ViewConfiguration.getFadingEdgeLength() >> 16) + 70, 13 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), (char) ((-1) - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))), objArr9);
                            if (!cls4.equals(cls5.getMethod((String) objArr9[0], null).invoke(method2, null))) {
                                continue;
                            } else {
                                int i13 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 73;
                                b = i13 % 128;
                                int i14 = i13 % 2;
                                Object[] objArr10 = new Object[1];
                                d(ViewConfiguration.getTouchSlop() >> 8, 24 - ((Process.getThreadPriority(0) + 20) >> 6), (char) (42737 - TextUtils.getTrimmedLength("")), objArr10);
                                Class<?> cls6 = Class.forName((String) objArr10[0]);
                                Object[] objArr11 = new Object[1];
                                d(83 - View.resolveSizeAndState(0, 0, 0), (Process.myTid() >> 22) + 17, (char) (TextUtils.indexOf((CharSequence) "", '0') + 35364), objArr11);
                                Object[] objArr12 = (Object[]) cls6.getMethod((String) objArr11[0], null).invoke(method2, null);
                                if (objArr12.length == 2 && !(!Long.TYPE.equals(objArr12[0]))) {
                                    Object[] objArr13 = new Object[1];
                                    d(ViewConfiguration.getFadingEdgeLength() >> 16, 24 - (Process.myTid() >> 22), (char) (42737 - (ViewConfiguration.getEdgeSlop() >> 16)), objArr13);
                                    if (Class.forName((String) objArr13[0]).equals(objArr12[1])) {
                                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
                                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                            char cIndexOf2 = (char) TextUtils.indexOf("", "");
                                            int fadingEdgeLength = (ViewConfiguration.getFadingEdgeLength() >> 16) + 2823;
                                            int scrollBarSize = 22 - (ViewConfiguration.getScrollBarSize() >> 8);
                                            byte[] bArr5 = $$d;
                                            byte b4 = (byte) (-bArr5[5]);
                                            Object[] objArr14 = new Object[1];
                                            c(b4, b4, bArr5[54], objArr14);
                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cIndexOf2, fadingEdgeLength, scrollBarSize, 1814927978, false, (String) objArr14[0], null);
                                        }
                                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).set(null, method2);
                                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
                                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                                            char cIndexOf3 = (char) (TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 1);
                                            int maxKeyCode = 2823 - (KeyEvent.getMaxKeyCode() >> 16);
                                            int minimumFlingVelocity = 22 - (ViewConfiguration.getMinimumFlingVelocity() >> 16);
                                            byte[] bArr6 = $$d;
                                            byte b5 = (byte) (-bArr6[5]);
                                            Object[] objArr15 = new Object[1];
                                            c(b5, b5, bArr6[54], objArr15);
                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(cIndexOf3, maxKeyCode, minimumFlingVelocity, 1814927978, false, (String) objArr15[0], null);
                                        }
                                        try {
                                            Object[] objArr16 = {0L, ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null)};
                                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1678062333);
                                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                                                char cLastIndexOf = (char) (TextUtils.lastIndexOf("", '0') + 1);
                                                int minimumFlingVelocity2 = (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 2823;
                                                int offsetAfter2 = TextUtils.getOffsetAfter("", 0) + 22;
                                                byte b6 = $$d[7];
                                                byte b7 = b6;
                                                Object[] objArr17 = new Object[1];
                                                c(b6, b7, b7, objArr17);
                                                objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(cLastIndexOf, minimumFlingVelocity2, offsetAfter2, -2137287382, false, (String) objArr17[0], new Class[]{Long.TYPE, Method.class});
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
                            }
                        }
                        i9++;
                        int i15 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 15;
                        b = i15 % 128;
                        int i16 = i15 % 2;
                        i2 = 2;
                        i4 = 12;
                        i8 = 0;
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
                char touchSlop = (char) (ViewConfiguration.getTouchSlop() >> 8);
                int iIndexOf = TextUtils.indexOf((CharSequence) "", '0') + 2824;
                int i17 = 23 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1));
                byte[] bArr7 = $$d;
                byte b8 = (byte) (-bArr7[5]);
                Object[] objArr18 = new Object[1];
                c(b8, b8, bArr7[54], objArr18);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(touchSlop, iIndexOf, i17, 1814927978, false, (String) objArr18[0], null);
            }
            Object[] objArr19 = {((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).get(null)};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-645763082);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                char keyRepeatTimeout = (char) (ViewConfiguration.getKeyRepeatTimeout() >> 16);
                int doubleTapTimeout = 2823 - (ViewConfiguration.getDoubleTapTimeout() >> 16);
                int iResolveSize = View.resolveSize(0, 0) + 22;
                byte b9 = $$d[7];
                byte b10 = b9;
                Object[] objArr20 = new Object[1];
                c(b9, b10, (byte) (b10 + 5), objArr20);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(keyRepeatTimeout, doubleTapTimeout, iResolveSize, 1025296417, false, (String) objArr20[0], new Class[]{Object.class});
            }
            ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).invoke(null, objArr19);
            Object[] objArr21 = {0, methodArr, null};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1189131659);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
                char cCombineMeasuredStates = (char) (View.combineMeasuredStates(0, 0) + 37657);
                int touchSlop2 = (ViewConfiguration.getTouchSlop() >> 8) + 2720;
                int keyRepeatDelay = (ViewConfiguration.getKeyRepeatDelay() >> 16) + 19;
                byte b11 = $$d[7];
                byte b12 = b11;
                Object[] objArr22 = new Object[1];
                c(b11, b12, (byte) (b12 + 5), objArr22);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(cCombineMeasuredStates, touchSlop2, keyRepeatDelay, -1568796068, false, (String) objArr22[0], new Class[]{Integer.TYPE, Method[].class, List.class});
            }
            long jLongValue = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).invoke(null, objArr21)).longValue();
            long j = -1180209281;
            long j2 = 69;
            long j3 = -1;
            long j4 = j ^ j3;
            long j5 = jLongValue ^ j3;
            long startUptimeMillis = (int) Process.getStartUptimeMillis();
            long j6 = (((long) 70) * j) + (((long) (-68)) * jLongValue) + (((((j4 | j5) | startUptimeMillis) ^ j3) | (((j | jLongValue) | startUptimeMillis) ^ j3)) * j2) + (((long) (-69)) * (((j4 | jLongValue) ^ j3) | ((j4 | startUptimeMillis) ^ j3) | ((jLongValue | startUptimeMillis) ^ j3))) + (j2 * ((j5 | j) ^ j3)) + ((long) (-630196564));
            int iIdentityHashCode = System.identityHashCode(this);
            int i18 = ((int) (j6 >> 32)) & (1520786966 + (((~((~iIdentityHashCode) | (-507579364))) | 201329249) * 529) + (((~(iIdentityHashCode | (-507579364))) | (-1944805775)) * 529));
            int startElapsedRealtime = (int) Process.getStartElapsedRealtime();
            int i19 = ~startElapsedRealtime;
            int i20 = i18 | (((int) j6) & (135433745 + ((1879044054 | startElapsedRealtime) * (-676)) + (((~(254635798 | i19)) | (-1879044055)) * 676) + (((~(startElapsedRealtime | (-1624408257))) | (~(i19 | 1691862208)) | 187181846) * 676)));
            int i21 = i20 >>> 24;
            int i22 = i20 & ViewCompat.MEASURED_SIZE_MASK;
            boolean z = i21 != 0;
            if (z) {
                int i23 = b + 67;
                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i23 % 128;
                int i24 = i23 % 2;
                i = 1;
            } else {
                i = 0;
            }
            arrayList.add((!z || i22 >= 1 || (method = methodArr[i22]) == null) ? null : method.toString());
            if ((i21 + 6) * i != 0) {
                int[] iArr2 = new int[iIntValue3];
                int i25 = iIntValue3 - 1;
                iArr2[i25] = 1;
                Toast.makeText((Context) null, iArr2[((i25 * iIntValue3) % 2) - 1], 1).show();
            }
            Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
            Intrinsics.checkNotNullExpressionValue(cipher, "");
            cipher.init(1, new SecretKeySpec(bArr2, "AES"), new GCMParameterSpec(128, bArr3));
            byte[] bArrDoFinal = cipher.doFinal(bArr);
            Intrinsics.checkNotNullExpressionValue(bArrDoFinal, "");
            byte[] bArr8 = new byte[bArrDoFinal.length + 12];
            System.arraycopy(bArr3, 0, bArr8, 0, 12);
            System.arraycopy(bArrDoFinal, 0, bArr8, 12, bArrDoFinal.length);
            return bArr8;
        }

        public static String TuitionPaymentFragmentspecialinlinedviewModeldefault3(String str) {
            String strEncodeToString;
            int i = 2 % 2;
            int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 87;
            b = i2 % 128;
            if (i2 % 2 == 0) {
                Intrinsics.checkNotNullParameter(str, "");
                Charset charset = StandardCharsets.UTF_8;
                Intrinsics.checkNotNullExpressionValue(charset, "");
                byte[] bytes = str.getBytes(charset);
                Intrinsics.checkNotNullExpressionValue(bytes, "");
                Base64.encodeToString(bytes, 0);
                strEncodeToString = Base64.encodeToString(bytes, 1);
            } else {
                Intrinsics.checkNotNullParameter(str, "");
                Charset charset2 = StandardCharsets.UTF_8;
                Intrinsics.checkNotNullExpressionValue(charset2, "");
                byte[] bytes2 = str.getBytes(charset2);
                Intrinsics.checkNotNullExpressionValue(bytes2, "");
                Base64.encodeToString(bytes2, 0);
                strEncodeToString = Base64.encodeToString(bytes2, 0);
            }
            Intrinsics.checkNotNullExpressionValue(strEncodeToString, "");
            return strEncodeToString;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private static String $$g(short s, int i, byte b2) {
            int i2 = (i * 3) + 109;
            int i3 = s * 2;
            int i4 = 3 - (b2 * 2);
            byte[] bArr = $$c;
            byte[] bArr2 = new byte[i3 + 1];
            int i5 = -1;
            if (bArr == null) {
                i2 = i3 + i4;
                i4 = i4;
                i5 = -1;
            }
            while (true) {
                int i6 = i5 + 1;
                bArr2[i6] = (byte) i2;
                if (i6 == i3) {
                    return new String(bArr2, 0);
                }
                int i7 = i4 + 1;
                i2 += bArr[i7];
                i4 = i7;
                i5 = i6;
            }
        }
    }
}
