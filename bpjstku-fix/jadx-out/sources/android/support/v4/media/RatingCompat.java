package android.support.v4.media;

import android.content.Context;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.media.Rating;
import android.os.Parcel;
import android.os.Parcelable;
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
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.view.PointerIconCompat;
import androidx.recyclerview.widget.ItemTouchHelper;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import defpackage.AudioSourceExternalSyntheticLambda9;
import defpackage.initSession;
import defpackage.lambdabuild0androidxcameracoreimplSessionConfigValidatingBuilder;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

/* JADX INFO: loaded from: classes5.dex */
public final class RatingCompat implements Parcelable {
    public static final Parcelable.Creator<RatingCompat> CREATOR = new Parcelable.Creator<RatingCompat>() { // from class: android.support.v4.media.RatingCompat.1
        private static long TuitionPaymentFragmentbindingInflater1;
        private static char[] TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        private static final byte[] $$c = {102, -96, -78, -55};
        private static final int $$d = 158;
        private static int $10 = 0;
        private static int $11 = 1;
        private static final byte[] $$a = {30, 17, -35, 104};
        private static final int $$b = 203;
        private static int TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
        private static int TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 1;

        /* JADX WARN: Code duplicated, block: B:10:0x0024  */
        /* JADX WARN: Code duplicated, block: B:8:0x001c  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x0028). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0024
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        private static void b(short r5, byte r6, byte r7, java.lang.Object[] r8) {
            /*
                int r6 = r6 + 97
                byte[] r0 = android.support.v4.media.RatingCompat.AnonymousClass1.$$a
                int r7 = r7 + 4
                int r5 = r5 * 3
                int r1 = 1 - r5
                byte[] r1 = new byte[r1]
                r2 = 0
                int r5 = 0 - r5
                if (r0 != 0) goto L14
                r3 = r5
                r4 = r2
                goto L28
            L14:
                r3 = r2
            L15:
                byte r4 = (byte) r6
                r1[r3] = r4
                int r4 = r3 + 1
                if (r3 != r5) goto L24
                java.lang.String r5 = new java.lang.String
                r5.<init>(r1, r2)
                r8[r2] = r5
                return
            L24:
                int r7 = r7 + 1
                r3 = r0[r7]
            L28:
                int r6 = r6 + r3
                r3 = r4
                goto L15
            */
            throw new UnsupportedOperationException("Method not decompiled: android.support.v4.media.RatingCompat.AnonymousClass1.b(short, byte, byte, java.lang.Object[]):void");
        }

        private static void a(int i, int i2, char c, Object[] objArr) throws Throwable {
            int i3 = 2 % 2;
            lambdabuild0androidxcameracoreimplSessionConfigValidatingBuilder lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder = new lambdabuild0androidxcameracoreimplSessionConfigValidatingBuilder();
            long[] jArr = new long[i2];
            lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
            while (lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 < i2) {
                int i4 = lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                try {
                    Object[] objArr2 = {Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault3[i + i4])};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-692725632);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        byte b = (byte) 0;
                        byte b2 = b;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) View.MeasureSpec.getMode(0), View.resolveSize(0, 0) + 2187, (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 40, 841711447, false, $$e(b, b2, b2), new Class[]{Integer.TYPE});
                    }
                    Object[] objArr3 = {Long.valueOf(((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).longValue()), Long.valueOf(i4), Long.valueOf(TuitionPaymentFragmentbindingInflater1), Integer.valueOf(c)};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-139477533);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                        byte b3 = (byte) 0;
                        byte b4 = (byte) (b3 + 2);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (33017 - View.MeasureSpec.makeMeasureSpec(0, 0)), (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 3011, 27 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), 321985076, false, $$e(b3, b4, (byte) (b4 - 2)), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                    }
                    jArr[i4] = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).longValue();
                    Object[] objArr4 = {lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder, lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(584784343);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                        byte b5 = (byte) 0;
                        byte b6 = (byte) (b5 + 1);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (Color.rgb(0, 0, 0) + 16813721), (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 3376, (-16777199) - Color.rgb(0, 0, 0), -968507904, false, $$e(b5, b6, (byte) (b6 - 1)), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
                    int i5 = $11 + 125;
                    $10 = i5 % 128;
                    int i6 = i5 % 2;
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
                int i7 = $11 + 99;
                $10 = i7 % 128;
                int i8 = i7 % 2;
                cArr[lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) jArr[lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1];
                Object[] objArr5 = {lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder, lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(584784343);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    byte b7 = (byte) 0;
                    byte b8 = (byte) (b7 + 1);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (TextUtils.indexOf((CharSequence) "", '0') + 36506), 3376 - (ViewConfiguration.getWindowTouchSlop() >> 8), View.resolveSizeAndState(0, 0, 0) + 17, -968507904, false, $$e(b7, b8, (byte) (b8 - 1)), new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5);
            }
            objArr[0] = new String(cArr);
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ RatingCompat createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 55;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
            int i3 = i2 % 2;
            RatingCompat ratingCompatCreateFromParcel = createFromParcel(parcel);
            if (i3 == 0) {
                int i4 = 16 / 0;
            }
            int i5 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 115;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 76 / 0;
            }
            return ratingCompatCreateFromParcel;
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ RatingCompat[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 85;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i3 % 128;
            int i4 = i3 % 2;
            RatingCompat[] ratingCompatArrNewArray = newArray(i);
            if (i4 == 0) {
                int i5 = 16 / 0;
            }
            int i6 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 111;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i6 % 128;
            int i7 = i6 % 2;
            return ratingCompatArrNewArray;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final RatingCompat createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            RatingCompat ratingCompat = new RatingCompat(parcel.readInt(), parcel.readFloat());
            int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 15;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 2 / 0;
            }
            return ratingCompat;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final RatingCompat[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            int i4 = i3 + 101;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i4 % 128;
            int i5 = i4 % 2;
            RatingCompat[] ratingCompatArr = new RatingCompat[i];
            int i6 = i3 + 51;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i6 % 128;
            if (i6 % 2 != 0) {
                int i7 = 16 / 0;
            }
            return ratingCompatArr;
        }

        /* JADX WARN: Code duplicated, block: B:243:0x29b8  */
        /* JADX WARN: Code duplicated, block: B:246:0x29c9 A[Catch: all -> 0x0261, TryCatch #2 {all -> 0x0261, blocks: (B:6:0x0141, B:8:0x014e, B:9:0x0187, B:24:0x039a, B:26:0x03a7, B:27:0x03e4, B:34:0x04f3, B:36:0x0500, B:37:0x0541, B:64:0x0742, B:66:0x074a, B:67:0x0788, B:69:0x088f, B:71:0x089c, B:72:0x08df, B:77:0x0a6c, B:79:0x0a79, B:81:0x0abe, B:88:0x0bb2, B:90:0x0bbf, B:91:0x0c01, B:98:0x0cb8, B:100:0x0cc5, B:101:0x0d0a, B:107:0x0de8, B:109:0x0df5, B:110:0x0e33, B:123:0x0fcf, B:125:0x0fdc, B:127:0x1022, B:135:0x1102, B:137:0x110f, B:138:0x114e, B:159:0x143c, B:161:0x1449, B:163:0x148a, B:187:0x173f, B:189:0x174c, B:191:0x178e, B:201:0x186c, B:203:0x1872, B:204:0x18b1, B:208:0x197f, B:210:0x1991, B:211:0x19c4, B:217:0x1ac4, B:219:0x1ad1, B:220:0x1b0f, B:224:0x1b29, B:226:0x1b40, B:227:0x1b84, B:276:0x2b9b, B:278:0x2ba8, B:279:0x2be6, B:296:0x309d, B:298:0x30aa, B:299:0x30e6, B:305:0x31c6, B:307:0x31d3, B:308:0x3211, B:321:0x35c6, B:323:0x35d3, B:325:0x3624, B:357:0x38fa, B:359:0x3907, B:360:0x393e, B:283:0x2bff, B:285:0x2c16, B:286:0x2c5e, B:231:0x1c3a, B:233:0x1c51, B:235:0x1c97, B:244:0x29bc, B:246:0x29c9, B:248:0x2a15, B:166:0x14e7, B:168:0x14f4, B:170:0x1537, B:144:0x126a, B:146:0x1277, B:147:0x12bd, B:45:0x0635, B:47:0x0642, B:48:0x0683, B:54:0x06cb, B:56:0x06d8, B:57:0x0719), top: B:373:0x0141 }] */
        /* JADX WARN: Code duplicated, block: B:247:0x2a0f  */
        /* JADX WARN: Code duplicated, block: B:251:0x2a28  */
        /* JADX WARN: Code duplicated, block: B:266:0x2a71  */
        /* JADX WARN: Code duplicated, block: B:267:0x2a9f  */
        /* JADX WARN: Code duplicated, block: B:272:0x2b0b  */
        /* JADX WARN: Code duplicated, block: B:273:0x2b31  */
        /* JADX WARN: Code duplicated, block: B:402:0x2ace A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:96:0x0c49  */
        /* JADX WARN: Multi-variable search skipped. Vars limit reached: 6606 (expected less than 5000) */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r5v492 */
        /* JADX WARN: Type inference failed for: r5v493 */
        /* JADX WARN: Type inference failed for: r5v494 */
        /* JADX WARN: Type inference failed for: r5v495, types: [java.lang.CharSequence] */
        /* JADX WARN: Type inference failed for: r5v860 */
        /* JADX WARN: Type inference failed for: r5v861 */
        /* JADX WARN: Type inference failed for: r5v863 */
        /* JADX WARN: Type inference failed for: r5v864 */
        /* JADX WARN: Type inference failed for: r5v865 */
        public static Object[] TuitionPaymentFragmentspecialinlinedviewModeldefault2(Context context, int i, int i2, int i3) throws Throwable {
            String str;
            int i4;
            int i5;
            long jUptimeMillis;
            int i6;
            char c;
            int i7;
            int i8;
            int i9;
            int i10;
            int i11;
            String str2;
            int i12;
            int i13;
            int i14;
            String str3;
            String str4;
            int i15;
            int i16;
            int i17;
            String[] strArr;
            int i18;
            int i19;
            String str5;
            long j;
            int i20;
            int i21;
            int i22;
            String[][] strArr2;
            StringBuilder sb;
            int i23;
            int i24;
            int i25;
            int i26;
            int i27;
            Object[] objArr;
            char c2;
            String[] strArr3;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3;
            String str6;
            int i28;
            char c3;
            int i29;
            int i30;
            int i31;
            String str7;
            String[] strArr4;
            int i32;
            ?? r5;
            int i33;
            ?? r6;
            String str8;
            int i34;
            int i35;
            String[] strArr5;
            int i36;
            long j2;
            int i37;
            int i38;
            int i39 = 2;
            int i40 = 2 % 2;
            int i41 = 0;
            int iRed = 908 - Color.red(0);
            int i42 = -(-(AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)));
            int i43 = 1;
            Object[] objArr2 = new Object[1];
            a(iRed, (i42 & 7) + (i42 | 7), (char) Color.blue(0), objArr2);
            String str9 = (String) objArr2[0];
            new ArrayList();
            int i44 = 4;
            Object[] objArr3 = new Object[1];
            a((PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), 26 - (~(-(ViewConfiguration.getDoubleTapTimeout() >> 16))), (char) ((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) - 1), objArr3);
            int i45 = -(-View.MeasureSpec.makeMeasureSpec(0, 0));
            int i46 = (i45 ^ 27) + ((i45 & 27) << 1);
            int i47 = -(Process.myPid() >> 22);
            Object[] objArr4 = new Object[1];
            a(i46, (i47 ^ 25) + ((i47 & 25) << 1), (char) (11372 - (~(-(ViewConfiguration.getScrollBarFadeDuration() >> 16)))), objArr4);
            int i48 = (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
            int iTuitionPaymentFragmentspecialinlinedviewModeldefault1 = AudioSourceExternalSyntheticLambda9.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
            int i49 = ~((~i48) | (-53));
            int i50 = ~((~iTuitionPaymentFragmentspecialinlinedviewModeldefault1) | (-53));
            int i51 = (i50 & i49) | (i49 ^ i50);
            int i52 = i48 | 52;
            int i53 = ~((i52 & iTuitionPaymentFragmentspecialinlinedviewModeldefault1) | (i52 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault1));
            int i54 = (i48 * 253) + 13156 + (((i51 & i53) | (i51 ^ i53)) * (-252));
            int i55 = (i48 ^ 52) | (i48 & 52);
            int i56 = i54 + (i55 * (-252));
            int i57 = (-53) | (~iTuitionPaymentFragmentspecialinlinedviewModeldefault1);
            int i58 = -(-(((~((i55 & iTuitionPaymentFragmentspecialinlinedviewModeldefault1) | (i55 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault1))) | (~((i48 & i57) | (i57 ^ i48)))) * 252));
            int i59 = (i56 & i58) + (i58 | i56);
            int i60 = 17 - (~(-ExpandableListView.getPackedPositionGroup(0L)));
            int i61 = -(-(Process.myTid() >> 22));
            Object[] objArr5 = new Object[1];
            a(i59, i60, (char) ((i61 ^ 44188) + ((i61 & 44188) << 1)), objArr5);
            int i62 = 69 - (~(-(-(AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)))));
            float maxVolume = AudioTrack.getMaxVolume();
            AudioSourceExternalSyntheticLambda9.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
            int i63 = ~i;
            Object[] objArr6 = new Object[1];
            a(i62, 26 - (~(-(-(maxVolume > 0.0f ? 1 : (maxVolume == 0.0f ? 0 : -1))))), (char) (53390 - (~(-(ViewConfiguration.getMaximumFlingVelocity() >> 16)))), objArr6);
            String[] strArr6 = {(String) objArr3[0], (String) objArr4[0], (String) objArr5[0], (String) objArr6[0]};
            int i64 = 0;
            while (true) {
                if (i64 >= i44) {
                    str = str9;
                    i4 = i63;
                    i5 = i;
                    break;
                }
                int i65 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                int i66 = (i65 ^ 13) + ((i65 & 13) << 1);
                TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i66 % 128;
                int i67 = i66 % i39;
                try {
                    Object[] objArr7 = {strArr6[i64]};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-52092531);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                        char cGreen = (char) Color.green(i41);
                        int mirror = AndroidCharacter.getMirror('0') + 945;
                        int windowTouchSlop = (ViewConfiguration.getWindowTouchSlop() >> 8) + 8;
                        byte b = (byte) i41;
                        byte b2 = (byte) (b + 1);
                        Object[] objArr8 = new Object[1];
                        b(b, b2, (byte) (-b2), objArr8);
                        String str10 = (String) objArr8[i41];
                        Class[] clsArr = new Class[1];
                        clsArr[i41] = String.class;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cGreen, mirror, windowTouchSlop, 410748506, false, str10, clsArr);
                    }
                    long jLongValue = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr7)).longValue();
                    long j3 = 881484245;
                    str = str9;
                    i4 = i63;
                    long j4 = -1;
                    long j5 = j3 ^ j4;
                    String[] strArr7 = strArr6;
                    int i68 = i64;
                    long j6 = ((((long) i) ^ j4) | j3) ^ j4;
                    long j7 = (((long) 375) * j3) + (((long) (-747)) * jLongValue) + (((long) (-374)) * (((j5 | jLongValue) ^ j4) | j6));
                    long j8 = jLongValue ^ j4;
                    long j9 = j7 + (((long) 748) * ((j3 | j8) ^ j4)) + (((long) 374) * (((j5 | j8) ^ j4) | j6)) + ((long) (-1082402482));
                    int iMaxMemory = (int) Runtime.getRuntime().maxMemory();
                    int i69 = ((int) (j9 >> 32)) & ((((-1153123274) + (((~iMaxMemory) | 1523971549) * 1444)) + (((~(iMaxMemory | (-43373114))) | ((~(1480599524 | iMaxMemory)) | 43372569)) * (-1444))) - 795831324);
                    int iUptimeMillis = (int) SystemClock.uptimeMillis();
                    int i70 = ~iUptimeMillis;
                    int i71 = (~(1488933969 | i70)) | (-1539309304) | (~(51707559 | i70));
                    int i72 = ((int) j9) & (117338231 + (((~(iUptimeMillis | (-1332226))) | i71) * 590) + (i71 * (-1180)) + (((~((-51707560) | i70)) | (~(i70 | (-1488933970)))) * 590));
                    if (((i72 & i69) | (i69 ^ i72)) != 0) {
                        int i73 = (i68 & 190) + (i68 | 190);
                        i5 = (i73 & (~i)) | ((~i73) & i);
                        break;
                    }
                    int i74 = (i68 & (-41)) + (i68 | (-41));
                    i64 = ((i74 | 42) << 1) - (i74 ^ 42);
                    strArr6 = strArr7;
                    str9 = str;
                    i63 = i4;
                    i39 = 2;
                    i41 = 0;
                    i44 = 4;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause != null) {
                        throw cause;
                    }
                    throw th;
                }
            }
            int i75 = 3;
            String[] strArr8 = new String[3];
            int i76 = -(ViewConfiguration.getJumpTapTimeout() >> 16);
            int i77 = (i76 ^ 98) + ((i76 & 98) << 1);
            int i78 = 13 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1));
            int i79 = ~(((-216100782) & i) | ((-216100782) ^ i));
            int i80 = ~((i4 ^ 1967101949) | (i4 & 1967101949));
            int i81 = -(-(((i79 & i80) | (i79 ^ i80)) * (-1808)));
            int i82 = (((-173888214) | i81) << 1) - (i81 ^ (-173888214));
            int i83 = ~(((-69273518) & i) | ((-69273518) ^ i));
            int i84 = ~i;
            int i85 = (i84 ^ 216100781) | (i84 & 216100781);
            int i86 = ~((1967101949 & i85) | (i85 ^ 1967101949));
            int i87 = ((i83 & i86) | (i83 ^ i86)) * TypedValues.Custom.TYPE_BOOLEAN;
            int i88 = (((i82 | i87) << 1) - (i87 ^ i82)) + (((~(((-1967101950) & i) | ((-1967101950) ^ i))) | 146827264 | (~((i4 & 216100781) | (i4 ^ 216100781)))) * TypedValues.Custom.TYPE_BOOLEAN);
            int i89 = ~(521943303 | i);
            int i90 = 984159399 + (((i89 & (-2145143084)) | ((-2145143084) ^ i89)) * 191);
            int i91 = ~(521943303 | i84);
            if (i88 > (i90 - (~(((i91 & (-2145155376)) | ((-2145155376) ^ i91)) * 191))) - 1) {
                c = 0;
                Object[] objArr9 = new Object[1];
                a(i77, i78, (char) ((-16714102) >>> Color.rgb(0, 0, 0)), objArr9);
                strArr8[0] = (String) objArr9[0];
                jUptimeMillis = SystemClock.uptimeMillis();
                i6 = 125;
            } else {
                Object[] objArr10 = new Object[1];
                a(i77, i78, (char) ((-16714102) - Color.rgb(0, 0, 0)), objArr10);
                strArr8[0] = (String) objArr10[0];
                jUptimeMillis = SystemClock.uptimeMillis();
                i6 = 111;
                c = 1;
            }
            int i92 = -(jUptimeMillis > 0L ? 1 : (jUptimeMillis == 0L ? 0 : -1));
            int i93 = ((i6 | i92) << 1) - (i92 ^ i6);
            int i94 = -MotionEvent.axisFromString("");
            int i95 = (i94 & 12) + (i94 | 12);
            int iNormalizeMetaState = KeyEvent.normalizeMetaState(0);
            int i96 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 35;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i96 % 128;
            int i97 = i96 % 2;
            char c4 = (char) iNormalizeMetaState;
            Object[] objArr11 = new Object[1];
            a(i93, i95, c4, objArr11);
            strArr8[c] = (String) objArr11[0];
            int i98 = (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 123;
            int i99 = -(ViewConfiguration.getMaximumFlingVelocity() >> 16);
            int i100 = ((i99 | 18) << 1) - (i99 ^ 18);
            int i101 = -(ViewConfiguration.getKeyRepeatTimeout() >> 16);
            Object[] objArr12 = new Object[1];
            a(i98, i100, (char) (((i101 | 54930) << 1) - (i101 ^ 54930)), objArr12);
            strArr8[2] = (String) objArr12[0];
            int i102 = 0;
            while (true) {
                if (i102 >= i75) {
                    i7 = i;
                    break;
                }
                Object[] objArr13 = {strArr8[i102]};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-52092531);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    char c5 = (char) ((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) - 1);
                    int size = View.MeasureSpec.getSize(0) + 993;
                    int iResolveSize = 8 - View.resolveSize(0, 0);
                    byte b3 = (byte) 0;
                    byte b4 = (byte) (b3 + 1);
                    Object[] objArr14 = new Object[i43];
                    b(b3, b4, (byte) (-b4), objArr14);
                    String str11 = (String) objArr14[0];
                    Class[] clsArr2 = new Class[i43];
                    clsArr2[0] = String.class;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(c5, size, iResolveSize, 410748506, false, str11, clsArr2);
                }
                long jLongValue2 = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr13)).longValue();
                long j10 = 1667028123;
                long j11 = 46;
                long j12 = -1;
                long j13 = jLongValue2 ^ j12;
                String[] strArr9 = strArr8;
                long jFreeMemory = (int) Runtime.getRuntime().freeMemory();
                long j14 = jFreeMemory ^ j12;
                long j15 = (j11 * j10) + (j11 * jLongValue2) + (((long) (-90)) * (j10 | ((j13 | j14) ^ j12))) + (((long) (-45)) * (((j13 | jFreeMemory) ^ j12) | ((j10 | jLongValue2) ^ j12))) + (((long) 45) * (j13 | ((jFreeMemory | (j10 ^ j12)) ^ j12) | (j12 ^ (j14 | j10)))) + ((long) (-1867946360));
                int i103 = ~(634484483 | i);
                int i104 = ((int) (j15 >> 32)) & (526995538 + (((-2147221424) | i103) * (-280)) + ((i103 | (~((-2071710895) | i))) * 140) + (((~((-1512736941) | i)) | (~(2147221423 | i84)) | (~((-558973955) | i84))) * 140));
                int startUptimeMillis = (int) Process.getStartUptimeMillis();
                int i105 = ~startUptimeMillis;
                int i106 = ((int) j15) & (2055568080 + (((~(257467168 | i105)) | (-1179759242)) * 226) + (((~(i105 | (-1073811594))) | (~(1179759241 | startUptimeMillis)) | 151519520) * (-113)) + ((~(startUptimeMillis | 257467168)) * 113));
                if (((i106 & i104) | (i104 ^ i106)) != 0) {
                    i7 = ((i102 & 270) + (i102 | 270)) ^ i;
                    break;
                }
                i102++;
                strArr8 = strArr9;
                i75 = 3;
                i43 = 1;
            }
            int i107 = i ^ i5;
            int i108 = -i107;
            int i109 = ((i107 & i108) | (i107 ^ i108)) >> 31;
            int i110 = i7 & (~i109);
            int i111 = i5 & i109;
            int i112 = (i111 & i110) | (i110 ^ i111);
            int i113 = 140 - (~View.MeasureSpec.getMode(0));
            int i114 = -(-(ViewConfiguration.getWindowTouchSlop() >> 8));
            Object[] objArr15 = new Object[1];
            a(i113, ((i114 | 14) << 1) - (i114 ^ 14), (char) ((-2) - ((-TextUtils.indexOf((CharSequence) "", '0', 0, 0)) ^ (-1))), objArr15);
            Object[] objArr16 = {(String) objArr15[0]};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1004662034);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                char cLastIndexOf = (char) ((-1) - TextUtils.lastIndexOf("", '0', 0, 0));
                int fadingEdgeLength = 993 - (ViewConfiguration.getFadingEdgeLength() >> 16);
                int i115 = 8 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
                byte b5 = (byte) 0;
                Object[] objArr17 = new Object[1];
                b(b5, (byte) (b5 | 6), (byte) (-1), objArr17);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(cLastIndexOf, fadingEdgeLength, i115, -545305915, false, (String) objArr17[0], new Class[]{String.class});
            }
            long jLongValue3 = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr16)).longValue();
            long j16 = 543316256;
            long j17 = 983;
            long j18 = -1;
            long j19 = jLongValue3 ^ j18;
            long j20 = (((long) (-1965)) * j16) + (((long) 984) * jLongValue3) + ((j16 | j19) * j17);
            long j21 = j16 ^ j18;
            long j22 = i;
            long j23 = j22 ^ j18;
            long j24 = j20 + (((long) (-983)) * (j21 | ((j19 | j23) ^ j18))) + (j17 * (((j21 | jLongValue3) ^ j18) | ((j21 | j23) ^ j18))) + ((long) 77143028);
            int iFreeMemory = (int) Runtime.getRuntime().freeMemory();
            int i116 = ~iFreeMemory;
            int i117 = (((((~(i116 | (-1190098924))) | ((~(1190098923 | iFreeMemory)) | (~(1667641961 | i116)))) * 959) - 1346595203) + (((~(1190098923 | i116)) | (~(1667641961 | iFreeMemory)) | (~(iFreeMemory | (-1190098924)))) * 959)) & ((int) (j24 >> 32));
            int i118 = (int) j24;
            int i119 = (-677780269) + (((~((-1245943622) | i84)) | 1073807617) * (-1188));
            int i120 = 1073807617 | (~(1245943621 | i));
            int i121 = ~((-191282789) | i84);
            int i122 = i118 & (i119 + ((i120 | i121) * 594) + (((~(1245943621 | i84)) | 19146784 | i121) * 594));
            if (((i117 & i122) | (i117 ^ i122)) != 0) {
                int i123 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 107;
                TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i123 % 128;
                i8 = i123 % 2 == 0 ? i ^ 17078 : (i & (-267)) | (i84 & 266);
            } else {
                int i124 = -(AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
                Object[] objArr18 = new Object[1];
                a(((i124 | ModuleDescriptor.MODULE_VERSION) << 1) - (i124 ^ ModuleDescriptor.MODULE_VERSION), 24 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), (char) KeyEvent.normalizeMetaState(0), objArr18);
                Object[] objArr19 = {(String) objArr18[0]};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1333629456);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                    char c6 = (char) (33603 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)));
                    int iIndexOf = 3085 - TextUtils.indexOf("", "", 0);
                    int i125 = (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 25;
                    byte b6 = (byte) 0;
                    byte b7 = (byte) (b6 + 1);
                    Object[] objArr20 = new Object[1];
                    b(b6, b7, (byte) (-b7), objArr20);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(c6, iIndexOf, i125, 1411172903, false, (String) objArr20[0], new Class[]{String.class});
                }
                String str12 = (String) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr19);
                if (str12 == null || str12.isEmpty()) {
                    int iIndexOf2 = TextUtils.indexOf("", "", 0) + 179;
                    int i126 = -TextUtils.getOffsetBefore("", 0);
                    Object[] objArr21 = new Object[1];
                    a(iIndexOf2, (i126 ^ 24) + ((i126 & 24) << 1), (char) (ViewConfiguration.getJumpTapTimeout() >> 16), objArr21);
                    Object[] objArr22 = {(String) objArr21[0]};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1333629456);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                        char cIndexOf = (char) (33602 - TextUtils.indexOf("", "", 0, 0));
                        int longPressTimeout = (ViewConfiguration.getLongPressTimeout() >> 16) + 3085;
                        int iRgb = (-16777190) - Color.rgb(0, 0, 0);
                        byte b8 = (byte) 0;
                        byte b9 = (byte) (b8 + 1);
                        Object[] objArr23 = new Object[1];
                        b(b8, b9, (byte) (-b9), objArr23);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(cIndexOf, longPressTimeout, iRgb, 1411172903, false, (String) objArr23[0], new Class[]{String.class});
                    }
                    String str13 = (String) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).invoke(null, objArr22);
                    i8 = (str13 == null || str13.isEmpty()) ? i : i ^ 267;
                } else {
                    int i127 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 35;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i127 % 128;
                    int i128 = i127 % 2;
                    i8 = (~(i & 267)) & (i | 267);
                }
            }
            int i129 = i ^ i112;
            int i130 = -i129;
            int i131 = ((i129 & i130) | (i129 ^ i130)) >> 31;
            int i132 = i8 & (~i131);
            int i133 = i131 & i112;
            int i134 = (i132 & i133) | (i132 ^ i133);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2061288340);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
                char cLastIndexOf2 = (char) (TextUtils.lastIndexOf("", '0', 0, 0) + 56828);
                int i135 = (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 2814;
                int size2 = View.MeasureSpec.getSize(0) + 9;
                byte b10 = (byte) 0;
                byte b11 = (byte) (b10 + 1);
                Object[] objArr24 = new Object[1];
                b(b10, b11, (byte) (-b11), objArr24);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(cLastIndexOf2, i135, size2, -1639816125, false, (String) objArr24[0], new Class[0]);
            }
            long jLongValue4 = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).invoke(null, null)).longValue();
            long j25 = 1932109081;
            long j26 = 829;
            long j27 = (j26 * j25) + (j26 * jLongValue4);
            long j28 = -828;
            long elapsedCpuTime = ((long) ((int) Process.getElapsedCpuTime())) ^ j18;
            long j29 = j25 | jLongValue4;
            long j30 = j27 + (((((j25 ^ j18) | (jLongValue4 ^ j18)) ^ j18) | (((elapsedCpuTime | j25) | jLongValue4) ^ j18)) * j28) + (j28 * (elapsedCpuTime | j29)) + (((long) 828) * (j29 ^ j18)) + ((long) 181247425);
            int i136 = ~(Process.myUid() | (-1383806705));
            int i137 = ((int) (j30 >> 32)) & (((94455188 | i136) * (-658)) + 2035380722 + ((i136 | 2163856) * 658));
            int i138 = ~((-675706482) | i);
            int i139 = ((int) j30) & (((86083848 | i138) * (-196)) + 1537355229 + ((i138 | (-761790330)) * 196));
            int i140 = (i139 & i137) | (i137 ^ i139);
            int i141 = -(-(i140 - 1));
            int i142 = (i141 ^ 200) + ((i141 & 200) << 1);
            int i143 = (~(i & i142)) & (i142 | i);
            int i144 = -i140;
            int i145 = ((i140 & i144) | (i140 ^ i144)) >> 31;
            int i146 = (~i145) & i;
            int i147 = i145 & i143;
            int i148 = (i147 & i146) | (i146 ^ i147);
            int i149 = ((~i134) & i) | (i134 & i84);
            int i150 = -i149;
            int i151 = ((i149 & i150) | (i149 ^ i150)) >> 31;
            int i152 = i148 & (~i151);
            int i153 = i134 & i151;
            int i154 = (i153 & i152) | (i152 ^ i153);
            int i155 = -View.combineMeasuredStates(0, 0);
            int i156 = (i155 & 203) + (i155 | 203);
            int windowTouchSlop2 = ViewConfiguration.getWindowTouchSlop() >> 8;
            Object[] objArr25 = new Object[1];
            a(i156, (windowTouchSlop2 ^ 20) + ((windowTouchSlop2 & 20) << 1), (char) (((byte) KeyEvent.getModifierMetaStateMask()) + 1), objArr25);
            String str14 = (String) objArr25[0];
            Object[] objArr26 = new Object[1];
            a((-16776994) - (~(-Color.rgb(0, 0, 0))), 5 - (~(ViewConfiguration.getScrollDefaultDelay() >> 16)), (char) (ViewConfiguration.getPressedStateDuration() >> 16), objArr26);
            Object[] objArr27 = {str14, (String) objArr26[0]};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1553143710);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault10 == null) {
                char cMyPid = (char) (Process.myPid() >> 22);
                int i157 = 2386 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1));
                int absoluteGravity = 32 - Gravity.getAbsoluteGravity(0, 0);
                byte b12 = (byte) 0;
                byte b13 = (byte) (b12 + 1);
                Object[] objArr28 = new Object[1];
                b(b12, b13, (byte) (-b13), objArr28);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.b(cMyPid, i157, absoluteGravity, -1207062455, false, (String) objArr28[0], new Class[]{String.class, String.class});
            }
            long jLongValue5 = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault10).invoke(null, objArr27)).longValue();
            long j31 = 1229428752;
            long j32 = 765;
            long j33 = j31 ^ j18;
            long j34 = jLongValue5 ^ j18;
            long j35 = j33 | j34;
            long j36 = (((long) (-1529)) * j31) + (((long) (-764)) * jLongValue5) + ((((j35 | j23) ^ j18) | (((j33 | jLongValue5) | j22) ^ j18) | (((j34 | j31) | j22) ^ j18)) * j32) + (((long) 1530) * ((j35 ^ j18) | ((j33 | j23) ^ j18))) + (j32 * (((j33 | j22) ^ j18) | (((j34 | j23) | j31) ^ j18))) + ((long) 747614576);
            int i158 = (int) Runtime.getRuntime().totalMemory();
            int i159 = ((int) (j36 >> 32)) & ((-1840200278) + (((~((-577145131) | i158)) | 536905728) * (-140)) + ((~((-40239403) | i158)) * 70) + (((~(i158 | 2014371541)) | (-1517705216)) * 70));
            int elapsedCpuTime2 = (int) Process.getElapsedCpuTime();
            int i160 = ((int) j36) & ((((~((~elapsedCpuTime2) | (-5505601))) * 130) - 39026365) + (((~(elapsedCpuTime2 | (-5505601))) | 16777225) * 130));
            int i161 = (i159 & i160) | (i159 ^ i160);
            int i162 = (~(i & 262)) & (i | 262);
            int i163 = (i161 | (-i161)) >> 31;
            int i164 = (~i163) & i;
            int i165 = i163 & i162;
            int i166 = (i165 & i164) | (i164 ^ i165);
            int i167 = i ^ i154;
            int i168 = -i167;
            int i169 = ((i167 & i168) | (i167 ^ i168)) >> 31;
            int i170 = i166 & (~i169);
            int i171 = i154 & i169;
            int i172 = (i171 & i170) | (i170 ^ i171);
            int i173 = -(-Color.blue(0));
            int i174 = (i173 & 229) + (i173 | 229);
            int i175 = -(-TextUtils.indexOf((CharSequence) "", '0'));
            int i176 = (i175 ^ 32) + ((i175 & 32) << 1);
            int i177 = -(ViewConfiguration.getDoubleTapTimeout() >> 16);
            Object[] objArr29 = new Object[1];
            a(i174, i176, (char) ((i177 ^ 57809) + ((i177 & 57809) << 1)), objArr29);
            String str15 = (String) objArr29[0];
            int i178 = 260 - (~(-(-ExpandableListView.getPackedPositionChild(0L))));
            int i179 = -(-(ViewConfiguration.getTapTimeout() >> 16));
            Object[] objArr30 = new Object[1];
            a(i178, (i179 & 23) + (i179 | 23), (char) (25012 - (~(-(SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1))))), objArr30);
            String str16 = (String) objArr30[0];
            int i180 = -(-View.resolveSizeAndState(0, 0, 0));
            int i181 = -View.MeasureSpec.getMode(0);
            Object[] objArr31 = new Object[1];
            a((i180 ^ 283) + ((i180 & 283) << 1), (i181 ^ 28) + ((i181 & 28) << 1), (char) (ViewConfiguration.getKeyRepeatTimeout() >> 16), objArr31);
            String str17 = (String) objArr31[0];
            int i182 = -(CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1));
            int i183 = (i182 ^ 311) + ((i182 & 311) << 1);
            int i184 = -(ViewConfiguration.getFadingEdgeLength() >> 16);
            Object[] objArr32 = new Object[1];
            a(i183, ((i184 | 14) << 1) - (i184 ^ 14), (char) (ViewConfiguration.getDoubleTapTimeout() >> 16), objArr32);
            String[] strArr10 = {str15, str16, str17, (String) objArr32[0]};
            int i185 = 0;
            while (true) {
                if (i185 >= 4) {
                    i9 = i;
                    break;
                }
                Object[] objArr33 = {strArr10[i185]};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-263443444);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault11 == null) {
                    char keyRepeatDelay = (char) (ViewConfiguration.getKeyRepeatDelay() >> 16);
                    int i186 = 993 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
                    int keyRepeatTimeout = 8 - (ViewConfiguration.getKeyRepeatTimeout() >> 16);
                    byte b14 = (byte) 0;
                    byte b15 = b14;
                    Object[] objArr34 = new Object[1];
                    b(b14, b15, (byte) (b15 - 1), objArr34);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.b(keyRepeatDelay, i186, keyRepeatTimeout, 349342683, false, (String) objArr34[0], new Class[]{String.class});
                }
                long jLongValue6 = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault11).invoke(null, objArr33)).longValue();
                long j37 = 968450267;
                long j38 = TypedValues.PositionType.TYPE_PERCENT_WIDTH;
                long j39 = (j38 * j37) + (j38 * jLongValue6);
                long j40 = -502;
                long j41 = j37 | jLongValue6;
                long j42 = j39 + (j40 * j41);
                long j43 = j37 ^ j18;
                long j44 = (j43 | (jLongValue6 ^ j18)) ^ j18;
                long j45 = j43 | j23;
                long j46 = (j41 | j22) ^ j18;
                long j47 = j42 + (j40 * (j44 | (j45 ^ j18) | j46)) + (((long) TypedValues.PositionType.TYPE_DRAWPATH) * (((jLongValue6 | j45) ^ j18) | j46)) + ((long) (-1815528872));
                int iMaxMemory2 = (int) Runtime.getRuntime().maxMemory();
                int i187 = ~((-1652529076) | iMaxMemory2);
                int i188 = ((int) (j47 >> 32)) & (1376195700 + ((539591954 | i187) * (-814)) + ((i187 | (~((~iMaxMemory2) | 1205211809)) | 92274688) * 407) + (((~(iMaxMemory2 | (-1205211810))) | (~(1652529075 | iMaxMemory2)) | 92274688) * 407));
                int i189 = ((int) j47) & (((((~((-750182182) | i)) | (-687044229)) * 56) - 2137680163) + (((-750182182) | (~((-687044229) | i84))) * 56));
                if (((i188 & i189) | (i188 ^ i189)) != 0) {
                    i9 = (((i185 | 252) << 1) - (i185 ^ 252)) ^ i;
                    break;
                }
                int i190 = ((i185 | 83) << 1) - (i185 ^ 83);
                i185 = (i190 ^ (-82)) + ((i190 & (-82)) << 1);
                strArr10 = strArr10;
            }
            int i191 = (~(i & i172)) & (i | i172);
            int i192 = -i191;
            int i193 = ((i191 & i192) | (i191 ^ i192)) >> 31;
            int i194 = (i172 & i193) | (i9 & (~i193));
            int i195 = -(SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1));
            Object[] objArr35 = new Object[1];
            a(((i195 | 326) << 1) - (i195 ^ 326), 13 - View.MeasureSpec.getSize(0), (char) (22898 - (~(-ExpandableListView.getPackedPositionChild(0L)))), objArr35);
            Object[] objArr36 = {(String) objArr35[0]};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1333629456);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault12 == null) {
                char c7 = (char) (33603 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)));
                int modifierMetaStateMask = ((byte) KeyEvent.getModifierMetaStateMask()) + 3086;
                int scrollBarFadeDuration = (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 26;
                byte b16 = (byte) 0;
                byte b17 = (byte) (b16 + 1);
                Object[] objArr37 = new Object[1];
                b(b16, b17, (byte) (-b17), objArr37);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.b(c7, modifierMetaStateMask, scrollBarFadeDuration, 1411172903, false, (String) objArr37[0], new Class[]{String.class});
            }
            String str18 = (String) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault12).invoke(null, objArr36);
            if (str18 != null) {
                int i196 = (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 338;
                int i197 = -(ViewConfiguration.getEdgeSlop() >> 16);
                int iResolveSize2 = View.resolveSize(0, 0);
                Object[] objArr38 = new Object[1];
                a(i196, (i197 ^ 9) + ((i197 & 9) << 1), (char) ((iResolveSize2 ^ 53587) + ((iResolveSize2 & 53587) << 1)), objArr38);
                if (str18.contains((String) objArr38[0])) {
                    i10 = (~(i & ItemTouchHelper.Callback.DEFAULT_SWIPE_ANIMATION_DURATION)) & (i | ItemTouchHelper.Callback.DEFAULT_SWIPE_ANIMATION_DURATION);
                } else {
                    i10 = i;
                }
            } else {
                i10 = i;
            }
            int i198 = (~(i & i194)) & (i | i194);
            int i199 = -i198;
            int i200 = ((i198 & i199) | (i198 ^ i199)) >> 31;
            int i201 = i10 & (~i200);
            int i202 = i194 & i200;
            int i203 = (i202 & i201) | (i201 ^ i202);
            int i204 = 16777562 - (~Color.rgb(0, 0, 0));
            AudioSourceExternalSyntheticLambda9.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
            int i205 = -(-ExpandableListView.getPackedPositionChild(0L));
            int size3 = View.MeasureSpec.getSize(0);
            Object[] objArr39 = new Object[1];
            a(i204, (18 & i205) + (i205 | 18), (char) ((size3 & 49390) + (size3 | 49390)), objArr39);
            String str19 = (String) objArr39[0];
            int iRgb2 = Color.rgb(0, 0, 0);
            int i206 = -(ViewConfiguration.getKeyRepeatDelay() >> 16);
            Object[] objArr40 = new Object[1];
            a((iRgb2 & 16777580) + (16777580 | iRgb2), (i206 ^ 6) + ((i206 & 6) << 1), (char) (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), objArr40);
            Object[] objArr41 = {str19, (String) objArr40[0]};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1553143710);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault13 == null) {
                char keyRepeatDelay2 = (char) (ViewConfiguration.getKeyRepeatDelay() >> 16);
                int i207 = 2385 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
                int windowTouchSlop3 = (ViewConfiguration.getWindowTouchSlop() >> 8) + 32;
                byte b18 = (byte) 0;
                byte b19 = (byte) (b18 + 1);
                Object[] objArr42 = new Object[1];
                b(b18, b19, (byte) (-b19), objArr42);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.b(keyRepeatDelay2, i207, windowTouchSlop3, -1207062455, false, (String) objArr42[0], new Class[]{String.class, String.class});
            }
            long jLongValue7 = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault13).invoke(null, objArr41)).longValue();
            long j48 = 95434135;
            long j49 = -754;
            long j50 = j48 ^ j18;
            long j51 = j50 | jLongValue7;
            long j52 = (((long) 755) * j48) + (((long) (-753)) * jLongValue7) + (((j51 ^ j18) | ((j50 | j22) ^ j18) | ((jLongValue7 | j22) ^ j18)) * j49) + (j49 * (((j51 | j22) ^ j18) | ((jLongValue7 | (j23 | j48)) ^ j18))) + (((long) 754) * (j50 | j23)) + ((long) 1881609193);
            int i208 = ~new Random().nextInt(1273195479);
            int i209 = ((((int) (j52 >> 32)) & (((-1424944518) + ((~(2130436091 | i208)) * (-783))) + (((~(i208 | 1786453883)) | 349227472) * 783))) | (((int) j52) & ((((-501357939) + (((~((-864505421) | i)) | 847662088) * 336)) + (((~(1993235465 | i)) | (-2010078798)) * (-168))) + (((-864505421) | (~(1993235465 | i84))) * 168)))) != 0 ? (~(i & 251)) & (i | 251) : i;
            int i210 = i ^ i203;
            int i211 = -i210;
            int i212 = ((i210 & i211) | (i210 ^ i211)) >> 31;
            int i213 = i209 & (~i212);
            int i214 = i203 & i212;
            int i215 = (i214 & i213) | (i213 ^ i214);
            int scrollBarFadeDuration2 = ViewConfiguration.getScrollBarFadeDuration() >> 16;
            int i216 = (scrollBarFadeDuration2 & 370) + (scrollBarFadeDuration2 | 370);
            int i217 = -(SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1));
            Object[] objArr43 = new Object[1];
            a(i216, ((i217 | 24) << 1) - (i217 ^ 24), (char) (TextUtils.getOffsetAfter("", 0) + 26080), objArr43);
            Object[] objArr44 = {(String) objArr43[0]};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1333629456);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault14 == null) {
                char scrollBarFadeDuration3 = (char) ((ViewConfiguration.getScrollBarFadeDuration() >> 16) + 33602);
                int minimumFlingVelocity = 3085 - (ViewConfiguration.getMinimumFlingVelocity() >> 16);
                int mirror2 = 'J' - AndroidCharacter.getMirror('0');
                byte b20 = (byte) 0;
                byte b21 = (byte) (b20 + 1);
                Object[] objArr45 = new Object[1];
                b(b20, b21, (byte) (-b21), objArr45);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.b(scrollBarFadeDuration3, minimumFlingVelocity, mirror2, 1411172903, false, (String) objArr45[0], new Class[]{String.class});
            }
            String lowerCase = ((String) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault14).invoke(null, objArr44)).toLowerCase();
            int i218 = -(SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1));
            int i219 = (i218 ^ 394) + ((i218 & 394) << 1);
            int i220 = -(-TextUtils.lastIndexOf("", '0'));
            int i221 = ((i220 | 5) << 1) - (i220 ^ 5);
            int trimmedLength = TextUtils.getTrimmedLength("");
            Object[] objArr46 = new Object[1];
            a(i219, i221, (char) ((trimmedLength & 60688) + (trimmedLength | 60688)), objArr46);
            int i222 = i ^ i215;
            int i223 = -i222;
            int i224 = ((i222 & i223) | (i222 ^ i223)) >> 31;
            int i225 = (lowerCase.contains((String) objArr46[0]) ? (i & (-265)) | (i84 & 264) : i) & (~i224);
            int i226 = i215 & i224;
            int i227 = (i226 & i225) | (i225 ^ i226);
            String[] strArr11 = new String[6];
            int i228 = -(-KeyEvent.keyCodeFromString(""));
            int absoluteGravity2 = Gravity.getAbsoluteGravity(0, 0);
            Object[] objArr47 = new Object[1];
            a(((i228 | 397) << 1) - (i228 ^ 397), ((absoluteGravity2 | 42) << 1) - (absoluteGravity2 ^ 42), (char) (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), objArr47);
            strArr11[0] = (String) objArr47[0];
            int i229 = -(-(ViewConfiguration.getMaximumFlingVelocity() >> 16));
            int i230 = (i229 ^ 439) + ((i229 & 439) << 1);
            int i231 = (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 39;
            int i232 = -(-TextUtils.lastIndexOf("", '0', 0, 0));
            Object[] objArr48 = new Object[1];
            a(i230, i231, (char) ((i232 ^ 1) + ((i232 & 1) << 1)), objArr48);
            strArr11[1] = (String) objArr48[0];
            int i233 = (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
            int i234 = (i233 & 479) + (i233 | 479);
            int i235 = -(-TextUtils.getTrimmedLength(""));
            Object[] objArr49 = new Object[1];
            a(i234, (i235 ^ 27) + ((i235 & 27) << 1), (char) (ViewConfiguration.getKeyRepeatDelay() >> 16), objArr49);
            strArr11[2] = (String) objArr49[0];
            Object[] objArr50 = new Object[1];
            a(Gravity.getAbsoluteGravity(0, 0) + TypedValues.PositionType.TYPE_PERCENT_X, (ViewConfiguration.getPressedStateDuration() >> 16) + 27, (char) View.MeasureSpec.makeMeasureSpec(0, 0), objArr50);
            strArr11[3] = (String) objArr50[0];
            int i236 = -TextUtils.indexOf("", "");
            int i237 = ((i236 | 533) << 1) - (i236 ^ 533);
            int i238 = -(-Color.blue(0));
            int i239 = (i238 ^ 27) + ((i238 & 27) << 1);
            int i240 = -(ViewConfiguration.getDoubleTapTimeout() >> 16);
            Object[] objArr51 = new Object[1];
            a(i237, i239, (char) ((i240 ^ 26907) + ((i240 & 26907) << 1)), objArr51);
            strArr11[4] = (String) objArr51[0];
            int size4 = View.MeasureSpec.getSize(0);
            int i241 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            int i242 = (i241 & 109) + (i241 | 109);
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i242 % 128;
            if (i242 % 2 != 0) {
                int i243 = -size4;
                Object[] objArr52 = new Object[1];
                a(((i243 | 560) << 1) - (i243 ^ 560), 58 << TextUtils.getTrimmedLength(""), (char) (ViewConfiguration.getPressedStateDuration() >> 61), objArr52);
                strArr11[5] = (String) objArr52[0];
            } else {
                int i244 = -size4;
                Object[] objArr53 = new Object[1];
                a(((i244 | 560) << 1) - (i244 ^ 560), 27 - TextUtils.getTrimmedLength(""), (char) (ViewConfiguration.getPressedStateDuration() >> 16), objArr53);
                strArr11[5] = (String) objArr53[0];
            }
            int i245 = 0;
            while (true) {
                if (i245 >= 6) {
                    i11 = i;
                    break;
                }
                Object[] objArr54 = {strArr11[i245]};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1333629456);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault15 == null) {
                    char cAlpha = (char) (33602 - Color.alpha(0));
                    int mode = 3085 - View.MeasureSpec.getMode(0);
                    int i246 = 26 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                    byte b22 = (byte) 0;
                    byte b23 = (byte) (b22 + 1);
                    Object[] objArr55 = new Object[1];
                    b(b22, b23, (byte) (-b23), objArr55);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.b(cAlpha, mode, i246, 1411172903, false, (String) objArr55[0], new Class[]{String.class});
                }
                String str20 = (String) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault15).invoke(null, objArr54);
                if (str20 != null && !str20.isEmpty()) {
                    i11 = i ^ 265;
                    break;
                }
                i245 = (i245 | 1) + (i245 & 1);
                strArr11 = strArr11;
            }
            int i247 = ((~i227) & i) | (i227 & i84);
            int i248 = -i247;
            int i249 = ((i247 & i248) | (i247 ^ i248)) >> 31;
            int i250 = i11 & (~i249);
            int i251 = i227 & i249;
            int i252 = (i251 & i250) | (i250 ^ i251);
            int i253 = 346 - (~(-Color.alpha(0)));
            int windowTouchSlop4 = ViewConfiguration.getWindowTouchSlop() >> 8;
            int i254 = ((windowTouchSlop4 | 17) << 1) - (windowTouchSlop4 ^ 17);
            int i255 = -(-(Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)));
            Object[] objArr56 = new Object[1];
            a(i253, i254, (char) ((i255 ^ 49389) + ((i255 & 49389) << 1)), objArr56);
            String str21 = (String) objArr56[0];
            int i256 = -ImageFormat.getBitsPerPixel(0);
            int iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = AudioSourceExternalSyntheticLambda9.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
            int i257 = (i256 * (-523)) - (-154118);
            int i258 = ~i256;
            int i259 = ((-587) & i256) | ((-587) ^ i256);
            int i260 = (~((i258 & 586) | (i258 ^ 586))) | (~i259);
            int i261 = ~(((-587) ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault2) | ((-587) & iTuitionPaymentFragmentspecialinlinedviewModeldefault2));
            int i262 = ((i260 & i261) | (i260 ^ i261)) * 262;
            int i263 = (i257 & i262) + (i257 | i262);
            int i264 = -(-((~i259) * (-786)));
            int i265 = (i263 & i264) + (i264 | i263);
            int i266 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault2;
            int i267 = ~((i266 & (-587)) | ((-587) ^ i266));
            int i268 = ~i256;
            int i269 = ~((i268 & 586) | (i268 ^ 586));
            int i270 = (i267 & i269) | (i267 ^ i269);
            int i271 = ~((i256 & (-587)) | ((-587) ^ i256));
            int i272 = -(-(((i271 & i270) | (i270 ^ i271)) * 262));
            int i273 = (i265 ^ i272) + ((i272 & i265) << 1);
            int windowTouchSlop5 = ViewConfiguration.getWindowTouchSlop() >> 8;
            Object[] objArr57 = new Object[1];
            a(i273, ((windowTouchSlop5 | 6) << 1) - (windowTouchSlop5 ^ 6), (char) (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), objArr57);
            Object[] objArr58 = {str21, (String) objArr57[0]};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1553143710);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault16 == null) {
                char minimumFlingVelocity2 = (char) (ViewConfiguration.getMinimumFlingVelocity() >> 16);
                int modifierMetaStateMask2 = ((byte) KeyEvent.getModifierMetaStateMask()) + 2386;
                int iLastIndexOf = TextUtils.lastIndexOf("", '0') + 33;
                byte b24 = (byte) 0;
                byte b25 = (byte) (b24 + 1);
                Object[] objArr59 = new Object[1];
                b(b24, b25, (byte) (-b25), objArr59);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.b(minimumFlingVelocity2, modifierMetaStateMask2, iLastIndexOf, -1207062455, false, (String) objArr59[0], new Class[]{String.class, String.class});
            }
            long jLongValue8 = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault16).invoke(null, objArr58)).longValue();
            long j53 = 1499094308;
            long j54 = -406;
            long j55 = jLongValue8 ^ j18;
            long jMyPid = Process.myPid();
            long j56 = jMyPid ^ j18;
            long j57 = (((long) (-405)) * j53) + (((long) 407) * jLongValue8) + ((((j55 | jMyPid) ^ j18) | (((j56 | j53) | jLongValue8) ^ j18)) * j54) + (j54 * (((j55 | j56) | j53) ^ j18)) + (((long) 406) * (((jMyPid | (j53 ^ j18)) ^ j18) | ((j56 | jLongValue8) ^ j18))) + ((long) 477949020);
            int i274 = ((int) (j57 >> 32)) & ((-981417782) + (((~(i84 | (-2043037093))) | 814105760) * (-160)) + (((-2043037093) | (~(814703792 | i84))) * 160));
            int i275 = ((int) j57) & (1153123995 + (((-697636258) | i84) * 1444) + (((~((-931901445) | i)) | 369795076 | (~((-505324966) | i))) * (-1444)) + 1182203922);
            if (((i274 & i275) | (i274 ^ i275)) != 0) {
                i13 = (i & (-261)) | (i84 & 260);
                str2 = "";
                i12 = i;
            } else {
                int i276 = -TextUtils.getOffsetAfter("", 0);
                int i277 = ((i276 | 593) << 1) - (i276 ^ 593);
                int i278 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 121;
                TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i278 % 128;
                int i279 = i278 % 2;
                int maximumFlingVelocity = 13 + (ViewConfiguration.getMaximumFlingVelocity() >> 16);
                int pressedStateDuration = ViewConfiguration.getPressedStateDuration();
                int i280 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                int i281 = ((i280 | 71) << 1) - (i280 ^ 71);
                TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i281 % 128;
                int i282 = i281 % 2;
                Object[] objArr60 = new Object[1];
                a(i277, maximumFlingVelocity, (char) (53392 - (~(-(pressedStateDuration >> 16)))), objArr60);
                String str22 = (String) objArr60[0];
                int i283 = -(SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1));
                int i284 = (i283 ^ TypedValues.MotionType.TYPE_PATHMOTION_ARC) + ((i283 & TypedValues.MotionType.TYPE_PATHMOTION_ARC) << 1);
                int i285 = -TextUtils.lastIndexOf("", '0', 0, 0);
                int i286 = (i285 ^ 8) + ((i285 & 8) << 1);
                int i287 = (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1));
                Object[] objArr61 = new Object[1];
                a(i284, i286, (char) ((i287 ^ (-1)) + (i287 << 1)), objArr61);
                Object[] objArr62 = {str22, (String) objArr61[0]};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault17 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1553143710);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault17 == null) {
                    char scrollBarFadeDuration4 = (char) (ViewConfiguration.getScrollBarFadeDuration() >> 16);
                    int i288 = 2386 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1));
                    int i289 = 32 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
                    byte b26 = (byte) 0;
                    byte b27 = (byte) (b26 + 1);
                    Object[] objArr63 = new Object[1];
                    b(b26, b27, (byte) (-b27), objArr63);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault17 = initSession.b(scrollBarFadeDuration4, i288, i289, -1207062455, false, (String) objArr63[0], new Class[]{String.class, String.class});
                }
                long jLongValue9 = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault17).invoke(null, objArr62)).longValue();
                long j58 = 1185027987;
                long j59 = 614;
                long j60 = j58 ^ j18;
                long j61 = (j60 | jLongValue9) ^ j18;
                long j62 = jLongValue9 ^ j18;
                str2 = "";
                long j63 = (((long) 615) * j58) + (((long) (-613)) * jLongValue9) + ((j22 | j61 | ((j62 | j58) ^ j18)) * j59) + (((long) (-1228)) * (((j60 | j23) ^ j18) | j61 | ((j23 | jLongValue9) ^ j18))) + (j59 * (((jLongValue9 | (j23 | j58)) ^ j18) | (((j60 | j62) | j23) ^ j18))) + ((long) 792015341);
                int i290 = ~((int) Runtime.getRuntime().totalMemory());
                int i291 = ((int) (j63 >> 32)) & ((-1019427974) + (((~(i290 | (-604045377))) | (~((-17080581) | i290))) * (-184)) + (((-1739433421) | (~(1722352840 | i290)) | (~(1135388044 | i290))) * 184) + 389856648);
                int i292 = 1521331438 + (((~(1974769802 | i84)) | (-1975442155)) * (-245));
                i12 = i;
                int i293 = ~(1974769802 | i12);
                int i294 = ((int) j63) & (i292 + (i293 * (-245)) + ((i293 | 537543392) * 245));
                i13 = ((i291 & i294) | (i291 ^ i294)) != 0 ? (~(i12 & 261)) & (i12 | 261) : i12;
            }
            int i295 = ((~i252) & i12) | (i252 & i84);
            int i296 = -i295;
            int i297 = ((i295 & i296) | (i295 ^ i296)) >> 31;
            int i298 = (i13 & (~i297)) | (i252 & i297);
            if ((i2 & 8) == 0) {
                int i299 = 3;
                String str23 = str2;
                int i300 = -TextUtils.lastIndexOf(str23, '0', 0, 0);
                int i301 = ((i300 | 614) << 1) - (i300 ^ 614);
                int i302 = -ImageFormat.getBitsPerPixel(0);
                Object[] objArr64 = new Object[1];
                a(i301, ((i302 | 42) << 1) - (i302 ^ 42), (char) (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), objArr64);
                int i303 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                int i304 = (i303 & 59) + (i303 | 59);
                TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i304 % 128;
                int i305 = i304 % 2;
                int i306 = -ExpandableListView.getPackedPositionType(0L);
                Object[] objArr65 = new Object[1];
                a(((i306 | 658) << 1) - (i306 ^ 658), TextUtils.getTrimmedLength(str23) + 41, (char) (ViewConfiguration.getLongPressTimeout() >> 16), objArr65);
                int i307 = -(Process.myPid() >> 22);
                int i308 = ((i307 | 699) << 1) - (i307 ^ 699);
                int i309 = -Color.red(0);
                int i310 = (i309 ^ 38) + ((i309 & 38) << 1);
                int i311 = -(-(ViewConfiguration.getFadingEdgeLength() >> 16));
                Object[] objArr66 = new Object[1];
                a(i308, i310, (char) ((i311 & 32280) + (i311 | 32280)), objArr66);
                String[] strArr12 = {(String) objArr64[0], (String) objArr65[0], (String) objArr66[0]};
                int i312 = 0;
                while (true) {
                    if (i312 >= i299) {
                        String str24 = str23;
                        i14 = i12;
                        str3 = str24;
                        i34 = i298;
                        i35 = i14;
                        break;
                    }
                    int i313 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                    int i314 = (i313 ^ 89) + ((i313 & 89) << 1);
                    TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i314 % 128;
                    if (i314 % 2 != 0) {
                        Object[] objArr67 = {strArr12[i312]};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault18 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-263443444);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault18 == null) {
                            char cRed = (char) Color.red(0);
                            int i315 = (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 992;
                            int iCombineMeasuredStates = 8 - View.combineMeasuredStates(0, 0);
                            byte b28 = (byte) 0;
                            byte b29 = b28;
                            Object[] objArr68 = new Object[1];
                            b(b28, b29, (byte) (b29 - 1), objArr68);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault18 = initSession.b(cRed, i315, iCombineMeasuredStates, 349342683, false, (String) objArr68[0], new Class[]{String.class});
                        }
                        long jLongValue10 = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault18).invoke(null, objArr67)).longValue();
                        long j64 = 581510125;
                        int iMyTid = Process.myTid();
                        strArr5 = strArr12;
                        long j65 = (((long) (-419)) * j64) + (((long) 421) * jLongValue10);
                        long j66 = TypedValues.CycleType.TYPE_EASING;
                        int i316 = i312;
                        long j67 = iMyTid;
                        long j68 = j64 ^ j18;
                        j2 = j65 + (((jLongValue10 | j67) ^ j18) * j66) + (((long) (-420)) * (jLongValue10 | j68)) + (j66 * (((jLongValue10 | (j67 ^ j18)) ^ j18) | (((jLongValue10 ^ j18) | j68) ^ j18))) + ((long) (-1428588730));
                        int i317 = 92 / 0;
                        i36 = i316;
                        str3 = str23;
                    } else {
                        i298 = i298;
                        strArr5 = strArr12;
                        int i318 = i312;
                        String str25 = str23;
                        Object[] objArr69 = {strArr5[i318]};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault19 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-263443444);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault19 == null) {
                            str3 = str25;
                            char cIndexOf2 = (char) ((-1) - TextUtils.indexOf((CharSequence) str3, '0', 0, 0));
                            int iIndexOf3 = 992 - TextUtils.indexOf((CharSequence) str3, '0', 0);
                            int gidForName = 7 - Process.getGidForName(str3);
                            byte b30 = (byte) 0;
                            byte b31 = b30;
                            Object[] objArr70 = new Object[1];
                            b(b30, b31, (byte) (b31 - 1), objArr70);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault19 = initSession.b(cIndexOf2, iIndexOf3, gidForName, 349342683, false, (String) objArr70[0], new Class[]{String.class});
                        } else {
                            str3 = str25;
                        }
                        long jLongValue11 = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault19).invoke(null, objArr69)).longValue();
                        long j69 = 301156069;
                        long j70 = -712;
                        long j71 = jLongValue11 ^ j18;
                        i36 = i318;
                        long jMaxMemory = (int) Runtime.getRuntime().maxMemory();
                        long j72 = jMaxMemory ^ j18;
                        long j73 = (j72 | j69) ^ j18;
                        j2 = (((long) (-711)) * j69) + (((long) 713) * jLongValue11) + ((((j71 | j69) ^ j18) | j73) * j70) + (j70 * ((((j71 | j72) | j69) ^ j18) | (((jLongValue11 | j69) | jMaxMemory) ^ j18))) + (((long) 712) * (j71 | j73)) + ((long) (-1148234674));
                    }
                    int i319 = -(-((((-549552145) & i84) | ((-549552145) ^ i84)) * (-369)));
                    int i320 = ~((616661788 ^ i84) | (616661788 & i84));
                    int i321 = ((-1208974396) ^ i319) + ((i319 & (-1208974396)) << 1) + (((i320 & 102641423) | (102641423 ^ i320)) * (-369));
                    i14 = i;
                    int i322 = ~((-616661789) | i14);
                    int i323 = 616661788 | i4;
                    int i324 = i321 + (((~((i323 & 102641423) | (i323 ^ 102641423))) | (i322 & 67109644) | (67109644 ^ i322)) * 369);
                    int i325 = -(-((((-282590192) ^ i14) | ((-282590192) & i14)) * (-859)));
                    int i326 = ((-400602048) & i325) + (i325 | (-400602048));
                    int i327 = ~((-282590192) | i84);
                    int i328 = ~((-1848116225) | i14);
                    int i329 = -(-(((i327 & i328) | (i327 ^ i328)) * 859));
                    int i330 = (i326 & i329) + (i329 | i326);
                    int i331 = ~(((-2125002689) & i84) | ((-2125002689) ^ i84));
                    if (i324 > i330 + (((i331 & 276886464) | (i331 ^ 276886464)) * 859)) {
                        i37 = ((int) (j2 << 76)) & (1514114598 + (((~((-475622743) | i14)) | (-961603669)) * (-318)) + (((~((-961603669) | i14)) | (~(1029303638 | i84))) * TypedValues.AttributesType.TYPE_PIVOT_TARGET) + (((~((-553680897) | i84)) | (~(1029303638 | i14))) * TypedValues.AttributesType.TYPE_PIVOT_TARGET));
                        i38 = ((int) j2) & ((((~((-564404225) | i84)) * 130) - 1938246357) + (((~((-564404225) | i14)) | 67175765) * 130));
                    } else {
                        int iNextInt = new Random().nextInt(1207852072);
                        i37 = ((int) (j2 >> 32)) & (933648242 + (((~((-1648400050) | (~iNextInt))) | 211173638) * (-591)) + ((iNextInt | (-1648400050)) * 591));
                        i38 = ((int) j2) & (726378717 + ((2137915370 | i84) * 184) + (((~(526506304 | i84)) | 1785591722) * 184));
                    }
                    if (((i37 & i38) | (i37 ^ i38)) != 0) {
                        i35 = i14 ^ (i36 + 280);
                        i34 = i298;
                        break;
                    }
                    int i332 = i36;
                    int i333 = ((i332 | (-42)) << 1) - (i332 ^ (-42));
                    i312 = (i333 & 43) + (i333 | 43);
                    i298 = i298;
                    strArr12 = strArr5;
                    i299 = 3;
                    str23 = str3;
                    i12 = i14;
                }
                int i334 = ((~i34) & i14) | (i34 & i84);
                int i335 = -i334;
                int i336 = ((i334 & i335) | (i334 ^ i335)) >> 31;
                int i337 = i35 & (~i336);
                int i338 = i34 & i336;
                i298 = (i337 & i338) | (i337 ^ i338);
            } else {
                i14 = i12;
                str3 = str2;
            }
            int i339 = 736 - (~(-(ViewConfiguration.getLongPressTimeout() >> 16)));
            int maximumFlingVelocity2 = ViewConfiguration.getMaximumFlingVelocity() >> 16;
            int i340 = (maximumFlingVelocity2 & 41) + (maximumFlingVelocity2 | 41);
            int i341 = -(ViewConfiguration.getLongPressTimeout() >> 16);
            Object[] objArr71 = new Object[1];
            a(i339, i340, (char) (((i341 | 21576) << 1) - (i341 ^ 21576)), objArr71);
            String str26 = (String) objArr71[0];
            int i342 = -KeyEvent.keyCodeFromString(str3);
            int i343 = (i342 & 778) + (i342 | 778);
            int i344 = -(ViewConfiguration.getKeyRepeatDelay() >> 16);
            int i345 = ((i344 | 30) << 1) - (i344 ^ 30);
            int i346 = -(-TextUtils.indexOf((CharSequence) str3, '0', 0, 0));
            Object[] objArr72 = new Object[1];
            a(i343, i345, (char) ((i346 ^ 1) + ((i346 & 1) << 1)), objArr72);
            String[] strArr13 = {str26, (String) objArr72[0]};
            int i347 = 0;
            while (true) {
                if (i347 >= 2) {
                    str4 = str3;
                    i15 = i14;
                    break;
                }
                Object[] objArr73 = {strArr13[i347]};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault20 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1004662034);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault20 == null) {
                    char cResolveOpacity = (char) Drawable.resolveOpacity(0, 0);
                    int packedPositionGroup = 993 - ExpandableListView.getPackedPositionGroup(0L);
                    int scrollDefaultDelay = 8 - (ViewConfiguration.getScrollDefaultDelay() >> 16);
                    byte b32 = (byte) 0;
                    Object[] objArr74 = new Object[1];
                    b(b32, (byte) (b32 | 6), (byte) (-1), objArr74);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault20 = initSession.b(cResolveOpacity, packedPositionGroup, scrollDefaultDelay, -545305915, false, (String) objArr74[0], new Class[]{String.class});
                }
                long jLongValue12 = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault20).invoke(null, objArr73)).longValue();
                long j74 = -9909596;
                long j75 = 253;
                long j76 = (j75 * j74) + (j75 * jLongValue12);
                long j77 = -252;
                long j78 = jLongValue12 ^ j18;
                long j79 = ((j74 ^ j18) | j78) ^ j18;
                str4 = str3;
                long jNextInt = new Random().nextInt();
                long j80 = j78 | (jNextInt ^ j18);
                long j81 = jLongValue12 | j74;
                long j82 = (jNextInt | j81) ^ j18;
                long j83 = j76 + ((j79 | (j80 ^ j18) | j82) * j77) + (j77 * j81) + (((long) 252) * (j82 | ((j80 | j74) ^ j18))) + ((long) 630368880);
                int i348 = ((int) (j83 >> 32)) & ((-219707320) + (((~((-1783411129) | i84)) | 346184717) * (-933)) + (((~(346184717 | i84)) | (-2129591742)) * 933) + 863964729);
                int iUptimeMillis2 = (int) SystemClock.uptimeMillis();
                int i349 = ((int) j83) & ((-1921601523) + (((~(66154157 | iUptimeMillis2)) | 1371072252) * (-964)) + (((~((~iUptimeMillis2) | 66154157)) | 1342734416) * (-964)));
                if (((i348 & i349) | (i348 ^ i349)) != 0) {
                    int i350 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                    int i351 = ((i350 | 45) << 1) - (i350 ^ 45);
                    TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i351 % 128;
                    if (i351 % 2 != 0) {
                        i15 = i14 ^ (i347 + 288);
                        break;
                    }
                    int i352 = i347 << 18013;
                    i15 = (i352 | i14) & (~(i14 & i352));
                    break;
                }
                i347++;
                strArr13 = strArr13;
                str3 = str4;
            }
            int i353 = (~(i14 & i298)) & (i14 | i298);
            int i354 = -i353;
            int i355 = ((i353 & i354) | (i353 ^ i354)) >> 31;
            int i356 = i15 & (~i355);
            int i357 = i298 & i355;
            int i358 = (i357 & i356) | (i356 ^ i357);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault21 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-555308653);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault21 == null) {
                char c8 = (char) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 1);
                int i359 = (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 3526;
                int maximumFlingVelocity3 = 23 - (ViewConfiguration.getMaximumFlingVelocity() >> 16);
                byte b33 = (byte) 0;
                byte b34 = (byte) (b33 + 1);
                Object[] objArr75 = new Object[1];
                b(b33, b34, (byte) (-b34), objArr75);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault21 = initSession.b(c8, i359, maximumFlingVelocity3, 980946500, false, (String) objArr75[0], new Class[0]);
            }
            long jLongValue13 = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault21).invoke(null, null)).longValue();
            long j84 = 843435731;
            long j85 = 471;
            long j86 = (j85 * j84) + (j85 * jLongValue13);
            long j87 = -470;
            long j88 = jLongValue13 ^ j18;
            long jUptimeMillis2 = (int) SystemClock.uptimeMillis();
            long j89 = (((jUptimeMillis2 ^ j18) | j84) | jLongValue13) ^ j18;
            long j90 = j86 + ((j84 | jLongValue13) * j87) + (j87 * ((((j84 ^ j18) | j88) ^ j18) | ((j88 | jUptimeMillis2) ^ j18) | j89)) + (((long) 470) * (j89 | (((j88 | j84) | jUptimeMillis2) ^ j18))) + ((long) (-1023758369));
            int iFreeMemory2 = (int) Runtime.getRuntime().freeMemory();
            int i360 = ~(991899273 | iFreeMemory2);
            int i361 = ~iFreeMemory2;
            int i362 = i360 | (~((-1865841612) | i361));
            int i363 = ~((-991899274) | i361);
            int i364 = ((int) (j90 >> 32)) & (1419906738 + ((i362 | i363) * (-516)) + (((~(iFreeMemory2 | 2134867915)) | (~((-269026305) | i361))) * 516) + ((269026304 | i363) * 516));
            int iMyTid2 = Process.myTid();
            int i365 = ~iMyTid2;
            int i366 = (~(669459644 | i365)) | 134221889 | (~((-767766766) | i365));
            int i367 = ((int) j90) & (729400131 + (((~(iMyTid2 | (-35914769))) | i366) * 590) + (i366 * (-1180)) + (((~(767766765 | i365)) | (~(i365 | (-669459645)))) * 590));
            if (((i364 & i367) | (i364 ^ i367)) != 1) {
                int i368 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 101;
                TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i368 % 128;
                int i369 = i368 % 2;
                Object[] objArr76 = {1};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault22 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1331892133);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault22 == null) {
                    char cAlpha2 = (char) Color.alpha(0);
                    int iAlpha = Color.alpha(0) + 2673;
                    int edgeSlop = (ViewConfiguration.getEdgeSlop() >> 16) + 16;
                    byte b35 = (byte) 0;
                    byte b36 = (byte) (b35 + 1);
                    Object[] objArr77 = new Object[1];
                    b(b35, b36, (byte) (-b36), objArr77);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault22 = initSession.b(cAlpha2, iAlpha, edgeSlop, -1409439630, false, (String) objArr77[0], new Class[]{Integer.TYPE});
                }
                long jLongValue14 = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault22).invoke(null, objArr76)).longValue();
                long j91 = 617763842;
                long j92 = 140;
                long j93 = (j91 ^ j18) | jLongValue14;
                long j94 = (((long) 141) * j91) + (((long) (-279)) * jLongValue14) + ((jLongValue14 | j22) * j92) + (((long) (-280)) * ((j93 ^ j18) | ((j23 | jLongValue14) ^ j18))) + (j92 * ((((jLongValue14 ^ j18) | j91) ^ j18) | ((j23 | j91) ^ j18) | ((j93 | j22) ^ j18))) + ((long) 1249934838);
                AudioSourceExternalSyntheticLambda9.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                AudioSourceExternalSyntheticLambda9.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                int iMyUid = Process.myUid();
                int i370 = ~iMyUid;
                int i371 = ((int) (j94 >> 32)) & (1972008040 + (((~(1748199729 | i370)) | (~(1109541155 | i370))) * (-867)) + (((~(1748199729 | iMyUid)) | (-1781754164) | (~(1109541155 | iMyUid))) * (-1734)) + (((~(iMyUid | (-672213009))) | (~(i370 | 1781754163)) | (~((-33554435) | iMyUid))) * 867));
                int i372 = (int) j94;
                int iMyPid = Process.myPid();
                int i373 = ~(86768282 | iMyPid);
                int i374 = (-614307247) + ((1347682565 | i373) * (-280)) + ((i373 | (~(1350458127 | iMyPid))) * 140);
                int i375 = ~(1434450847 | iMyPid);
                int i376 = ~iMyPid;
                if ((i371 | (i372 & (i374 + (((~(i376 | (-83992721))) | i375 | (~((-1347682566) | i376))) * 140)))) != 0) {
                    i18 = i;
                    i19 = (~(i18 & 220)) & (i18 | 220);
                } else {
                    i18 = i;
                    i19 = i18;
                }
                int i377 = i18 ^ i358;
                int i378 = -i377;
                int i379 = ((i377 & i378) | (i377 ^ i378)) >> 31;
                int i380 = i19 & (~i379);
                int i381 = i358 & i379;
                int i382 = (i381 & i380) | (i380 ^ i381);
                int i383 = -(-View.MeasureSpec.getMode(0));
                Object[] objArr78 = new Object[1];
                a((i383 ^ 370) + ((i383 & 370) << 1), 22 - (~(-Gravity.getAbsoluteGravity(0, 0))), (char) (26080 - View.combineMeasuredStates(0, 0)), objArr78);
                Object[] objArr79 = {(String) objArr78[0]};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault23 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1333629456);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault23 == null) {
                    char minimumFlingVelocity3 = (char) ((ViewConfiguration.getMinimumFlingVelocity() >> 16) + 33602);
                    int i384 = 3085 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
                    int maxKeyCode = (KeyEvent.getMaxKeyCode() >> 16) + 26;
                    byte b37 = (byte) 0;
                    byte b38 = (byte) (b37 + 1);
                    Object[] objArr80 = new Object[1];
                    b(b37, b38, (byte) (-b38), objArr80);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault23 = initSession.b(minimumFlingVelocity3, i384, maxKeyCode, 1411172903, false, (String) objArr80[0], new Class[]{String.class});
                }
                Object objInvoke = ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault23).invoke(null, objArr79);
                if (objInvoke != null) {
                    int i385 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                    int i386 = (i385 ^ 95) + ((i385 & 95) << 1);
                    TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i386 % 128;
                    if (i386 % 2 != 0) {
                        Object[] objArr81 = {objInvoke, 118};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault24 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1557991223);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault24 == null) {
                            char c9 = (char) ((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) - 1);
                            int jumpTapTimeout = 3393 - (ViewConfiguration.getJumpTapTimeout() >> 16);
                            int i387 = 9 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
                            byte b39 = (byte) 0;
                            byte b40 = (byte) (b39 + 1);
                            Object[] objArr82 = new Object[1];
                            b(b39, b40, (byte) (-b40), objArr82);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault24 = initSession.b(c9, jumpTapTimeout, i387, 1203525406, false, (String) objArr82[0], new Class[]{String.class, Integer.TYPE});
                        }
                        long jLongValue15 = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault24).invoke(null, objArr81)).longValue();
                        long j95 = 1752684515;
                        long j96 = ((j95 ^ j18) | jLongValue15) ^ j18;
                        long j97 = (((long) 595) * j95) + (((long) (-1187)) * jLongValue15) + (((long) (-1188)) * (j96 | ((j23 | jLongValue15) ^ j18)));
                        long j98 = 594;
                        long j99 = jLongValue15 ^ j18;
                        long j100 = (j23 | j95) ^ j18;
                        long j101 = j97 + ((j96 | ((j99 | j22) ^ j18) | j100) * j98) + (j98 * (((j99 | j95) ^ j18) | ((j99 | j23) ^ j18) | j100)) + ((long) (-1754754392));
                        int i388 = ((int) (j101 << 9)) & ((-89481374) + ((~((-813738582) | i84)) * 52) + (((~((-1909763710) | i84)) | (~(947977175 | i84)) | 1096025128) * (-52)) + (((~(1909763709 | i84)) | 134238594) * 52));
                        int i389 = (int) j101;
                        int iMyUid2 = Process.myUid();
                        int i390 = (-1025518493) + (((-1058093510) | iMyUid2) * (-50));
                        int i391 = ~(1067006949 | iMyUid2);
                        int i392 = ~iMyUid2;
                        int i393 = i389 & (i390 + ((i391 | (~((-687874050) | i392))) * 50) + (((~(i392 | (-1058093510))) | (~(379132900 | i392)) | 687874049) * 50));
                        if (((i388 & i393) | (i388 ^ i393)) == 1986687685) {
                            str5 = str4;
                        }
                        str5 = str4;
                        int i394 = -(ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
                        int i395 = (i394 & 370) + (i394 | 370);
                        int trimmedLength2 = TextUtils.getTrimmedLength(str5) + 23;
                        int i396 = -(ViewConfiguration.getScrollDefaultDelay() >> 16);
                        Object[] objArr83 = new Object[1];
                        a(i395, trimmedLength2, (char) (((i396 | 26080) << 1) - (i396 ^ 26080)), objArr83);
                        String str27 = (String) objArr83[0];
                        int i397 = -(-KeyEvent.normalizeMetaState(0));
                        int i398 = (i397 ^ 808) + ((i397 & 808) << 1);
                        int i399 = -(ViewConfiguration.getJumpTapTimeout() >> 16);
                        Object[] objArr84 = new Object[1];
                        a(i398, (i399 ^ 10) + ((i399 & 10) << 1), (char) ((-2) - ((-ImageFormat.getBitsPerPixel(0)) ^ (-1))), objArr84);
                        String str28 = (String) objArr84[0];
                        int iAlpha2 = Color.alpha(0);
                        int i400 = ((iAlpha2 | 818) << 1) - (iAlpha2 ^ 818);
                        byte modifierMetaStateMask3 = (byte) KeyEvent.getModifierMetaStateMask();
                        int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = AudioSourceExternalSyntheticLambda9.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                        int i401 = modifierMetaStateMask3 * (-574);
                        int i402 = ((i401 | (-4592)) << 1) - (i401 ^ (-4592));
                        int i403 = ~modifierMetaStateMask3;
                        int i404 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault3;
                        int i405 = ~((i403 ^ i404) | (i403 & i404));
                        j = j18;
                        int i406 = ~(((-9) ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault3) | ((-9) & iTuitionPaymentFragmentspecialinlinedviewModeldefault3));
                        int i407 = -(-(((i405 & i406) | (i405 ^ i406)) * 1150));
                        int i408 = (i402 & i407) + (i402 | i407);
                        int i409 = ~(((-9) ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault3) | ((-9) & iTuitionPaymentFragmentspecialinlinedviewModeldefault3));
                        int i410 = ~((~iTuitionPaymentFragmentspecialinlinedviewModeldefault3) | 8);
                        int i411 = ~((i403 & iTuitionPaymentFragmentspecialinlinedviewModeldefault3) | (i403 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault3));
                        int i412 = ~((modifierMetaStateMask3 & i404) | (i404 ^ modifierMetaStateMask3));
                        Object[] objArr85 = new Object[1];
                        a(i400, ((i408 + (((i409 & i410) | (i409 ^ i410)) * (-575))) - (~(-(-(((i412 & i411) | (i411 ^ i412)) * 575))))) - 1, (char) (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), objArr85);
                        String str29 = (String) objArr85[0];
                        int mirror3 = 873 - AndroidCharacter.getMirror('0');
                        int i413 = -AndroidCharacter.getMirror('0');
                        int i414 = i413 * 624;
                        int i415 = ((((-34832) ^ i414) + ((i414 & (-34832)) << 1)) - (~(-(-((~((((-57) ^ i413) | ((-57) & i413)) | i18)) * 623))))) - 1;
                        int i416 = ~i413;
                        int i417 = ~((i416 & 56) | (i416 ^ 56));
                        int i418 = (i415 - (~(-(-(((i417 & i84) | (i84 ^ i417)) * (-623)))))) - 1;
                        int i419 = (~(((-57) ^ i413) | ((-57) & i413))) | (~(((-57) ^ i18) | ((-57) & i18)));
                        int i420 = ~((i413 & i18) | (i413 ^ i18));
                        int i421 = ((i420 & i419) | (i419 ^ i420)) * 623;
                        Object[] objArr86 = new Object[1];
                        a(mirror3, (i418 & i421) + (i421 | i418), (char) Drawable.resolveOpacity(0, 0), objArr86);
                        String[] strArr14 = {str27, str28, str29, (String) objArr86[0]};
                        int trimmedLength3 = TextUtils.getTrimmedLength(str5);
                        Object[] objArr87 = new Object[1];
                        a((trimmedLength3 ^ 833) + ((trimmedLength3 & 833) << 1), 15 - (~(-TextUtils.lastIndexOf(str5, '0', 0))), (char) (44244 - (ViewConfiguration.getMinimumFlingVelocity() >> 16)), objArr87);
                        String str30 = (String) objArr87[0];
                        int iIndexOf4 = 850 - TextUtils.indexOf(str5, str5);
                        int i422 = -View.MeasureSpec.getMode(0);
                        Object[] objArr88 = new Object[1];
                        a(iIndexOf4, ((i422 | 7) << 1) - (i422 ^ 7), (char) ((-2) - ((-ImageFormat.getBitsPerPixel(0)) ^ (-1))), objArr88);
                        String str31 = (String) objArr88[0];
                        int scrollDefaultDelay2 = 857 - (ViewConfiguration.getScrollDefaultDelay() >> 16);
                        int i423 = 5 - (~(-(-(SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)))));
                        int i424 = -(SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1));
                        Object[] objArr89 = new Object[1];
                        a(scrollDefaultDelay2, i423, (char) ((41185 ^ i424) + ((i424 & 41185) << 1)), objArr89);
                        String str32 = (String) objArr89[0];
                        int i425 = -(ViewConfiguration.getTouchSlop() >> 8);
                        Object[] objArr90 = new Object[1];
                        a(((i425 | 864) << 1) - (i425 ^ 864), 10 - ImageFormat.getBitsPerPixel(0), (char) ((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 26796), objArr90);
                        String str33 = (String) objArr90[0];
                        int i426 = 874 - (~(-(CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1))));
                        int i427 = -(-View.combineMeasuredStates(0, 0));
                        int i428 = (i427 ^ 14) + ((i427 & 14) << 1);
                        int i429 = (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1));
                        Object[] objArr91 = new Object[1];
                        a(i426, i428, (char) ((i429 ^ (-1)) + (i429 << 1)), objArr91);
                        String[] strArr15 = {str30, str31, str32, str33, (String) objArr91[0]};
                        int mode2 = View.MeasureSpec.getMode(0);
                        int i430 = ((mode2 | 889) << 1) - (mode2 ^ 889);
                        int bitsPerPixel = 15 - ImageFormat.getBitsPerPixel(0);
                        int i431 = -ExpandableListView.getPackedPositionChild(0L);
                        int iTuitionPaymentFragmentspecialinlinedviewModeldefault4 = AudioSourceExternalSyntheticLambda9.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                        int i432 = ~i431;
                        int i433 = ((i431 * (-103)) - 1441485) + (((~((i432 & (-13996)) | (i432 ^ (-13996)))) | (~(((-13996) ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault4) | ((-13996) & iTuitionPaymentFragmentspecialinlinedviewModeldefault4)))) * 104);
                        int i434 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault4;
                        int i435 = (~((i434 & i431) | (i434 ^ i431) | 13995)) * (-104);
                        int i436 = (i433 ^ i435) + ((i433 & i435) << 1);
                        int i437 = ((i431 & iTuitionPaymentFragmentspecialinlinedviewModeldefault4) | (i431 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault4)) * 104;
                        Object[] objArr92 = new Object[1];
                        a(i430, bitsPerPixel, (char) ((i436 ^ i437) + ((i437 & i436) << 1)), objArr92);
                        String str34 = (String) objArr92[0];
                        int i438 = (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1));
                        int i439 = ((((i438 * 980) - 884112) + ((~((-905) | i4)) * 979)) - (~(((i438 ^ i18) | (i438 & i18)) * (-979)))) - 1;
                        int i440 = ~((-905) | i18);
                        int i441 = ~((i4 & i438) | (i4 ^ i438));
                        int i442 = -(-(((i441 & i440) | (i440 ^ i441)) * 979));
                        int i443 = (i439 ^ i442) + ((i442 & i439) << 1);
                        int i444 = -(-(ViewConfiguration.getPressedStateDuration() >> 16));
                        Object[] objArr93 = new Object[1];
                        a(i443, (i444 ^ 3) + ((i444 & 3) << 1), (char) (35700 - (~(-(ViewConfiguration.getLongPressTimeout() >> 16)))), objArr93);
                        String str35 = (String) objArr93[0];
                        int iRgb3 = Color.rgb(0, 0, 0);
                        int i445 = (16778132 ^ iRgb3) + ((iRgb3 & 16778132) << 1);
                        int i446 = 21 - (~(AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)));
                        int i447 = -(ViewConfiguration.getPressedStateDuration() >> 16);
                        Object[] objArr94 = new Object[1];
                        a(i445, i446, (char) ((i447 & 3413) + (i447 | 3413)), objArr94);
                        String str36 = (String) objArr94[0];
                        int i448 = 937 - (~(-(-ExpandableListView.getPackedPositionGroup(0L))));
                        int i449 = -KeyEvent.keyCodeFromString(str5);
                        int i450 = i449 * (-433);
                        int i451 = (i450 & (-5400)) + (i450 | (-5400));
                        int i452 = ~i449;
                        int i453 = (i451 - (~(((~((i452 ^ i4) | (i452 & i4))) | (~(((-26) ^ i18) | ((-26) & i18)))) * 217))) - 1;
                        int i454 = ~((i452 ^ (-26)) | (i452 & (-26)));
                        int i455 = ~((i452 & i18) | (i452 ^ i18));
                        int i456 = ((i455 & i454) | (i454 ^ i455)) * 217;
                        int i457 = ((i453 | i456) << 1) - (i456 ^ i453);
                        int i458 = ~(((-26) ^ i84) | ((-26) & i84));
                        int i459 = ((i449 & i458) | (i449 ^ i458)) * 217;
                        Object[] objArr95 = new Object[1];
                        a(i448, ((i457 | i459) << 1) - (i459 ^ i457), (char) View.resolveSizeAndState(0, 0, 0), objArr95);
                        String str37 = (String) objArr95[0];
                        int i460 = 963 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                        int i461 = -AndroidCharacter.getMirror('0');
                        int i462 = (i461 & 76) + (i461 | 76);
                        int threadPriority = Process.getThreadPriority(0);
                        int i463 = -(((threadPriority ^ 20) + ((threadPriority & 20) << 1)) >> 6);
                        Object[] objArr96 = new Object[1];
                        a(i460, i462, (char) (((i463 | 22166) << 1) - (i463 ^ 22166)), objArr96);
                        String str38 = (String) objArr96[0];
                        i20 = i4;
                        i21 = i84;
                        i22 = -1;
                        String[] strArr16 = {str34, str35, str, str36, str37, str38};
                        int i464 = -View.getDefaultSize(0, 0);
                        int i465 = i464 * (-958);
                        int i466 = ((-949378) & i465) + (i465 | (-949378));
                        int i467 = ~(((-992) ^ i21) | ((-992) & i21));
                        int i468 = ~i464;
                        int i469 = ~((i468 & i18) | (i468 ^ i18));
                        int i470 = (i467 & i469) | (i467 ^ i469);
                        int i471 = ~((i21 ^ i464) | (i21 & i464));
                        int i472 = ((i470 & i471) | (i470 ^ i471)) * 959;
                        int i473 = (i466 & i472) + (i472 | i466);
                        int i474 = (~((i464 ^ 991) | (i464 & 991))) * (-959);
                        int i475 = (i473 ^ i474) + ((i474 & i473) << 1);
                        int i476 = ~((~i464) | i21);
                        int i477 = ~(((-992) ^ i18) | ((-992) & i18));
                        Object[] objArr97 = new Object[1];
                        a((i475 - (~(-(-(((~((i464 & i18) | (i464 ^ i18))) | ((i476 & i477) | (i476 ^ i477))) * 959))))) - 1, (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 11, (char) (62500 - KeyEvent.normalizeMetaState(0)), objArr97);
                        String str39 = (String) objArr97[0];
                        int i478 = -KeyEvent.keyCodeFromString(str5);
                        Object[] objArr98 = new Object[1];
                        a(((i478 | 1002) << 1) - (i478 ^ 1002), 8 - View.resolveSize(0, 0), (char) (46206 - (~(-View.MeasureSpec.getSize(0)))), objArr98);
                        String str40 = (String) objArr98[0];
                        int iResolveOpacity = Drawable.resolveOpacity(0, 0);
                        Object[] objArr99 = new Object[1];
                        a((iResolveOpacity ^ PointerIconCompat.TYPE_ALIAS) + ((iResolveOpacity & PointerIconCompat.TYPE_ALIAS) << 1), 5 - (~(-TextUtils.getOffsetBefore(str5, 0))), (char) (33818 - View.MeasureSpec.makeMeasureSpec(0, 0)), objArr99);
                        String str41 = (String) objArr99[0];
                        char mirror4 = AndroidCharacter.getMirror('0');
                        int i479 = ((mirror4 | 968) << 1) - (mirror4 ^ 968);
                        int maximumFlingVelocity4 = ViewConfiguration.getMaximumFlingVelocity() >> 16;
                        Object[] objArr100 = new Object[1];
                        a(i479, ((maximumFlingVelocity4 | 6) << 1) - (maximumFlingVelocity4 ^ 6), (char) (0 - (~(-(-TextUtils.indexOf((CharSequence) str5, '0', 0, 0))))), objArr100);
                        String[] strArr17 = {str39, str40, str41, (String) objArr100[0]};
                        int iArgb = 1022 - Color.argb(0, 0, 0, 0);
                        int capsMode = TextUtils.getCapsMode(str5, 0, 0);
                        Object[] objArr101 = new Object[1];
                        a(iArgb, ((capsMode | 16) << 1) - (capsMode ^ 16), (char) (Process.myPid() >> 22), objArr101);
                        String str42 = (String) objArr101[0];
                        int mode3 = View.MeasureSpec.getMode(0);
                        int i480 = (mode3 ^ 857) + ((mode3 & 857) << 1);
                        int i481 = -TextUtils.indexOf(str5, str5, 0, 0);
                        int i482 = (i481 ^ 7) + ((i481 & 7) << 1);
                        int i483 = -(ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1));
                        int i484 = i483 * (-1939);
                        int i485 = ((39990635 | i484) << 1) - (39990635 ^ i484);
                        int i486 = ~((-41186) | i483);
                        int i487 = ~((i20 ^ 41185) | (i20 & 41185));
                        int i488 = -(-(((i486 & i487) | (i486 ^ i487)) * (-970)));
                        int i489 = ~i483;
                        int i490 = (((i485 & i488) + (i488 | i485)) - (~(-(-((~((41185 ^ i489) | (41185 & i489))) * 1940))))) - 1;
                        int i491 = ~(i489 | (-41186));
                        int i492 = ~((41185 ^ i21) | (41185 & i21));
                        char c10 = (char) ((i490 - (~(((i491 & i492) | (i491 ^ i492)) * 970))) - 1);
                        Object[] objArr102 = new Object[1];
                        a(i480, i482, c10, objArr102);
                        String str43 = (String) objArr102[0];
                        int packedPositionGroup2 = 825 - ExpandableListView.getPackedPositionGroup(0L);
                        int iIndexOf5 = TextUtils.indexOf((CharSequence) str5, '0') + 9;
                        int i493 = -(-TextUtils.indexOf((CharSequence) str5, '0', 0, 0));
                        Object[] objArr103 = new Object[1];
                        a(packedPositionGroup2, iIndexOf5, (char) (((i493 | 1) << 1) - (i493 ^ 1)), objArr103);
                        String[] strArr18 = {str42, str43, (String) objArr103[0]};
                        int i494 = -MotionEvent.axisFromString(str5);
                        int i495 = (i494 ^ 1037) + ((i494 & 1037) << 1);
                        int i496 = -TextUtils.lastIndexOf(str5, '0');
                        int i497 = ((i496 | 13) << 1) - (i496 ^ 13);
                        int i498 = -Process.getGidForName(str5);
                        Object[] objArr104 = new Object[1];
                        a(i495, i497, (char) (((64362 | i498) << 1) - (i498 ^ 64362)), objArr104);
                        String str44 = (String) objArr104[0];
                        int i499 = -MotionEvent.axisFromString(str5);
                        Object[] objArr105 = new Object[1];
                        a((i499 ^ 1051) + ((i499 & 1051) << 1), -TextUtils.lastIndexOf(str5, '0', 0), (char) (40740 - (ViewConfiguration.getTouchSlop() >> 8)), objArr105);
                        String[] strArr19 = {str44, (String) objArr105[0]};
                        int i500 = -(-Process.getGidForName(str5));
                        int i501 = (i500 ^ 1054) + ((i500 & 1054) << 1);
                        int i502 = -(KeyEvent.getMaxKeyCode() >> 16);
                        Object[] objArr106 = new Object[1];
                        a(i501, (i502 ^ 9) + ((i502 & 9) << 1), (char) (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), objArr106);
                        String str45 = (String) objArr106[0];
                        int iLastIndexOf2 = TextUtils.lastIndexOf(str5, '0', 0, 0);
                        int i503 = ((iLastIndexOf2 | 1063) << 1) - (iLastIndexOf2 ^ 1063);
                        int i504 = 0 - (~TextUtils.indexOf(str5, str5, 0, 0));
                        int i505 = -TextUtils.indexOf(str5, str5, 0);
                        Object[] objArr107 = new Object[1];
                        a(i503, i504, (char) ((57643 ^ i505) + ((i505 & 57643) << 1)), objArr107);
                        String[] strArr20 = {str45, (String) objArr107[0]};
                        Object[] objArr108 = new Object[1];
                        a(1063 - (~(-(SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)))), 14 - (~(-ImageFormat.getBitsPerPixel(0))), (char) (ViewConfiguration.getMinimumFlingVelocity() >> 16), objArr108);
                        String str46 = (String) objArr108[0];
                        int size5 = 905 - View.MeasureSpec.getSize(0);
                        int i506 = -(-((byte) KeyEvent.getModifierMetaStateMask()));
                        Object[] objArr109 = new Object[1];
                        a(size5, (i506 ^ 4) + ((i506 & 4) << 1), (char) (Color.red(0) + 35701), objArr109);
                        String str47 = (String) objArr109[0];
                        int i507 = -ImageFormat.getBitsPerPixel(0);
                        Object[] objArr110 = new Object[1];
                        a((i507 ^ 849) + ((i507 & 849) << 1), (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 6, (char) Color.argb(0, 0, 0, 0), objArr110);
                        String str48 = (String) objArr110[0];
                        int packedPositionType = ExpandableListView.getPackedPositionType(0L);
                        int i508 = (packedPositionType ^ 1079) + ((packedPositionType & 1079) << 1);
                        int iIndexOf6 = TextUtils.indexOf(str5, str5);
                        int i509 = (iIndexOf6 & 8) + (iIndexOf6 | 8);
                        int keyRepeatDelay3 = ViewConfiguration.getKeyRepeatDelay() >> 16;
                        Object[] objArr111 = new Object[1];
                        a(i508, i509, (char) ((keyRepeatDelay3 & 7130) + (keyRepeatDelay3 | 7130)), objArr111);
                        String str49 = (String) objArr111[0];
                        int i510 = 863 - (~(-View.MeasureSpec.getMode(0)));
                        int i511 = -(ViewConfiguration.getDoubleTapTimeout() >> 16);
                        Object[] objArr112 = new Object[1];
                        a(i510, (i511 & 11) + (i511 | 11), (char) ((ViewConfiguration.getPressedStateDuration() >> 16) + 26797), objArr112);
                        String str50 = (String) objArr112[0];
                        Object[] objArr113 = new Object[1];
                        a(875 - TextUtils.getCapsMode(str5, 0, 0), 13 - (~(-Drawable.resolveOpacity(0, 0))), (char) Color.argb(0, 0, 0, 0), objArr113);
                        String[] strArr21 = {str46, str47, str48, str49, str50, (String) objArr113[0]};
                        int i512 = 1085 - (~(-TextUtils.indexOf((CharSequence) str5, '0')));
                        int i513 = -(-TextUtils.indexOf((CharSequence) str5, '0', 0));
                        Object[] objArr114 = new Object[1];
                        a(i512, (i513 & 21) + (i513 | 21), (char) TextUtils.indexOf(str5, str5), objArr114);
                        String str51 = (String) objArr114[0];
                        int i514 = -(Process.myPid() >> 22);
                        int iTuitionPaymentFragmentspecialinlinedviewModeldefault5 = AudioSourceExternalSyntheticLambda9.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                        int i515 = (i514 * (-300)) + 334314;
                        int i516 = (i514 ^ 1107) | (i514 & 1107);
                        int i517 = -(-((~((i516 & iTuitionPaymentFragmentspecialinlinedviewModeldefault5) | (i516 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault5))) * (-301)));
                        int i518 = (i515 & i517) + (i515 | i517);
                        int i519 = ~(((-1108) ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault5) | ((-1108) & iTuitionPaymentFragmentspecialinlinedviewModeldefault5));
                        int i520 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault5;
                        int i521 = ~((i520 & i514) | (i520 ^ i514));
                        int i522 = (i518 - (~(-(-(((i519 & i521) | (i519 ^ i521)) * (-301)))))) - 1;
                        int i523 = ~i514;
                        int i524 = ~((i523 & iTuitionPaymentFragmentspecialinlinedviewModeldefault5) | (i523 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault5));
                        int i525 = ((i524 & (-1108)) | ((-1108) ^ i524)) * 301;
                        int i526 = (i522 & i525) + (i525 | i522);
                        int i527 = -TextUtils.indexOf(str5, str5, 0, 0);
                        Object[] objArr115 = new Object[1];
                        a(i526, (i527 ^ 19) + ((i527 & 19) << 1), (char) TextUtils.indexOf(str5, str5), objArr115);
                        String str52 = (String) objArr115[0];
                        int i528 = -TextUtils.lastIndexOf(str5, '0', 0);
                        Object[] objArr116 = new Object[1];
                        a((i528 & 1125) + (i528 | 1125), TextUtils.indexOf((CharSequence) str5, '0', 0, 0) + 32, (char) (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), objArr116);
                        String str53 = (String) objArr116[0];
                        int i529 = -KeyEvent.keyCodeFromString(str5);
                        int i530 = (i529 ^ 1157) + ((i529 & 1157) << 1);
                        int i531 = -(Process.myTid() >> 22);
                        int i532 = (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1));
                        Object[] objArr117 = new Object[1];
                        a(i530, (i531 ^ 26) + ((i531 & 26) << 1), (char) ((i532 & 2734) + (i532 | 2734)), objArr117);
                        String str54 = (String) objArr117[0];
                        int i533 = -(-Drawable.resolveOpacity(0, 0));
                        int i534 = (i533 ^ 1183) + ((i533 & 1183) << 1);
                        int i535 = -(-(ViewConfiguration.getScrollDefaultDelay() >> 16));
                        Object[] objArr118 = new Object[1];
                        a(i534, (i535 & 23) + (i535 | 23), (char) (25628 - TextUtils.indexOf((CharSequence) str5, '0', 0, 0)), objArr118);
                        String str55 = (String) objArr118[0];
                        Object[] objArr119 = new Object[1];
                        a(1205 - (~(-(-(ViewConfiguration.getKeyRepeatDelay() >> 16)))), 33 - Color.green(0), (char) (38339 - KeyEvent.keyCodeFromString(str5)), objArr119);
                        String[] strArr22 = {str51, str52, str53, str54, str55, (String) objArr119[0], str};
                        int i536 = 1238 - (~(ViewConfiguration.getPressedStateDuration() >> 16));
                        int i537 = -View.resolveSize(0, 0);
                        Object[] objArr120 = new Object[1];
                        a(i536, (i537 ^ 13) + ((i537 & 13) << 1), (char) (ViewConfiguration.getEdgeSlop() >> 16), objArr120);
                        String str56 = (String) objArr120[0];
                        int i538 = 817 - (~(-(KeyEvent.getMaxKeyCode() >> 16)));
                        int defaultSize = View.getDefaultSize(0, 0);
                        Object[] objArr121 = new Object[1];
                        a(i538, (defaultSize & 7) + (defaultSize | 7), (char) ((-1) - TextUtils.lastIndexOf(str5, '0')), objArr121);
                        String[] strArr23 = {str56, (String) objArr121[0]};
                        int i539 = -(-(ViewConfiguration.getPressedStateDuration() >> 16));
                        int i540 = (i539 ^ 1252) + ((i539 & 1252) << 1);
                        int i541 = -(-(ViewConfiguration.getMaximumDrawingCacheSize() >> 24));
                        Object[] objArr122 = new Object[1];
                        a(i540, ((i541 | 30) << 1) - (i541 ^ 30), (char) (4319 - (~(-(SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1))))), objArr122);
                        String str57 = (String) objArr122[0];
                        Object[] objArr123 = new Object[1];
                        a(1281 - (~(-(-TextUtils.getOffsetAfter(str5, 0)))), 10 - (~(-(Process.myPid() >> 22))), (char) Drawable.resolveOpacity(0, 0), objArr123);
                        String[] strArr24 = {str57, (String) objArr123[0]};
                        int i542 = -(-(ViewConfiguration.getMaximumDrawingCacheSize() >> 24));
                        int i543 = (i542 ^ 1293) + ((i542 & 1293) << 1);
                        int i544 = -(ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1));
                        Object[] objArr124 = new Object[1];
                        a(i543, (i544 ^ 20) + ((i544 & 20) << 1), (char) Color.red(0), objArr124);
                        String str58 = (String) objArr124[0];
                        int gidForName2 = Process.getGidForName(str5) + 1313;
                        int i545 = -Color.alpha(0);
                        Object[] objArr125 = new Object[1];
                        a(gidForName2, (i545 & 5) + (i545 | 5), (char) KeyEvent.normalizeMetaState(0), objArr125);
                        String[] strArr25 = {str58, (String) objArr125[0]};
                        int iRgb4 = (-16775899) - Color.rgb(0, 0, 0);
                        int i546 = -TextUtils.indexOf((CharSequence) str5, '0');
                        Object[] objArr126 = new Object[1];
                        a(iRgb4, ((i546 | 18) << 1) - (i546 ^ 18), (char) (3383 - (~(-TextUtils.lastIndexOf(str5, '0')))), objArr126);
                        String[] strArr26 = {(String) objArr126[0]};
                        int pressedStateDuration2 = ViewConfiguration.getPressedStateDuration() >> 16;
                        int i547 = ((pressedStateDuration2 | 1336) << 1) - (pressedStateDuration2 ^ 1336);
                        int i548 = -(-((byte) KeyEvent.getModifierMetaStateMask()));
                        Object[] objArr127 = new Object[1];
                        a(i547, (i548 ^ 17) + ((i548 & 17) << 1), (char) (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), objArr127);
                        String[] strArr27 = {(String) objArr127[0]};
                        int iLastIndexOf3 = TextUtils.lastIndexOf(str5, '0', 0);
                        int iTuitionPaymentFragmentspecialinlinedviewModeldefault6 = AudioSourceExternalSyntheticLambda9.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                        int i549 = iLastIndexOf3 * (-183);
                        int i550 = ((250305 | i549) << 1) - (i549 ^ 250305);
                        int i551 = ~iLastIndexOf3;
                        int i552 = ~((i551 ^ 1353) | (i551 & 1353));
                        int i553 = ~((~iTuitionPaymentFragmentspecialinlinedviewModeldefault6) | 1353);
                        int i554 = ~((iLastIndexOf3 & (-1354)) | ((-1354) ^ iLastIndexOf3));
                        int i555 = i550 + (((i552 & i553) | (i552 ^ i553)) * 184) + (((i554 & iTuitionPaymentFragmentspecialinlinedviewModeldefault6) | (iTuitionPaymentFragmentspecialinlinedviewModeldefault6 ^ i554)) * (-184));
                        int i556 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault6;
                        int i557 = i555 + ((~((i556 & i551) | (i551 ^ i556))) * 184);
                        int jumpTapTimeout2 = ViewConfiguration.getJumpTapTimeout() >> 16;
                        int i558 = ((jumpTapTimeout2 | 19) << 1) - (jumpTapTimeout2 ^ 19);
                        int i559 = (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1));
                        int iTuitionPaymentFragmentspecialinlinedviewModeldefault7 = AudioSourceExternalSyntheticLambda9.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                        int i560 = (i559 * 371) - 371;
                        int i561 = ~(~iTuitionPaymentFragmentspecialinlinedviewModeldefault7);
                        int i562 = ~i559;
                        int i563 = ~(i562 | iTuitionPaymentFragmentspecialinlinedviewModeldefault7);
                        int i564 = -(-(((i561 & i563) | (i561 ^ i563)) * (-370)));
                        int i565 = ((i560 | i564) << 1) - (i560 ^ i564);
                        int i566 = ~((~i559) | (~iTuitionPaymentFragmentspecialinlinedviewModeldefault7));
                        int i567 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault7;
                        char c11 = (char) ((((i565 - (~(((i567 & i566) | (i566 ^ i567)) * (-370)))) - 1) - (~((~(i559 | i562)) * 370))) - 1);
                        Object[] objArr128 = new Object[1];
                        a(i557, i558, c11, objArr128);
                        String[] strArr28 = {(String) objArr128[0]};
                        int offsetBefore = 1371 - TextUtils.getOffsetBefore(str5, 0);
                        int iGreen = Color.green(0) + 19;
                        int iIndexOf7 = TextUtils.indexOf(str5, str5, 0);
                        int iTuitionPaymentFragmentspecialinlinedviewModeldefault8 = AudioSourceExternalSyntheticLambda9.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                        int i568 = iIndexOf7 * (-317);
                        int i569 = (8101324 & i568) + (i568 | 8101324);
                        int i570 = ~iIndexOf7;
                        int i571 = ~((i570 ^ (-25397)) | (i570 & (-25397)) | iTuitionPaymentFragmentspecialinlinedviewModeldefault8);
                        int i572 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault8;
                        int i573 = (i572 & iIndexOf7) | (i572 ^ iIndexOf7);
                        int i574 = ~((i573 & 25396) | (i573 ^ 25396));
                        int i575 = -(-(((i571 & i574) | (i571 ^ i574)) * (-318)));
                        int i576 = (i569 ^ i575) + ((i569 & i575) << 1);
                        int i577 = ~(((-25397) ^ iIndexOf7) | ((-25397) & iIndexOf7));
                        int i578 = ~((iIndexOf7 & iTuitionPaymentFragmentspecialinlinedviewModeldefault8) | (iIndexOf7 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault8));
                        int i579 = ((i578 & i577) | (i577 ^ i578)) * (-318);
                        int i580 = ((i576 | i579) << 1) - (i579 ^ i576);
                        int i581 = ~((iTuitionPaymentFragmentspecialinlinedviewModeldefault8 & i570) | (i570 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault8));
                        int i582 = ((i581 & (-25397)) | ((-25397) ^ i581)) * TypedValues.AttributesType.TYPE_PIVOT_TARGET;
                        Object[] objArr129 = new Object[1];
                        a(offsetBefore, iGreen, (char) ((i580 & i582) + (i582 | i580)), objArr129);
                        String[] strArr29 = {(String) objArr129[0]};
                        int i583 = 1390 - (~((byte) KeyEvent.getModifierMetaStateMask()));
                        int iRed2 = Color.red(0);
                        Object[] objArr130 = new Object[1];
                        a(i583, (iRed2 & 23) + (iRed2 | 23), (char) ExpandableListView.getPackedPositionType(0L), objArr130);
                        String[] strArr30 = {(String) objArr130[0]};
                        int i584 = 1413 - (~TextUtils.lastIndexOf(str5, '0', 0));
                        int iAlpha3 = Color.alpha(0);
                        Object[] objArr131 = new Object[1];
                        a(i584, ((iAlpha3 | 21) << 1) - (iAlpha3 ^ 21), (char) (Process.myPid() >> 22), objArr131);
                        String[] strArr31 = {(String) objArr131[0]};
                        int packedPositionChild = ExpandableListView.getPackedPositionChild(0L) + 1435;
                        int i585 = -((Process.getThreadPriority(0) + 20) >> 6);
                        Object[] objArr132 = new Object[1];
                        a(packedPositionChild, (i585 ^ 24) + ((i585 & 24) << 1), (char) TextUtils.getCapsMode(str5, 0, 0), objArr132);
                        String str59 = str;
                        String[] strArr32 = {(String) objArr132[0], str59};
                        int i586 = -(ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1));
                        int i587 = (i586 ^ 1459) + ((i586 & 1459) << 1);
                        int i588 = -(SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1));
                        int threadPriority2 = Process.getThreadPriority(0);
                        Object[] objArr133 = new Object[1];
                        a(i587, (i588 ^ 29) + ((i588 & 29) << 1), (char) (((threadPriority2 & 20) + (threadPriority2 | 20)) >> 6), objArr133);
                        String[] strArr33 = {(String) objArr133[0], str59};
                        Object[] objArr134 = new Object[1];
                        a(1485 - (~(-(-View.combineMeasuredStates(0, 0)))), 25 - (~(-(-(SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))))), (char) TextUtils.indexOf(str5, str5, 0, 0), objArr134);
                        String[] strArr34 = {(String) objArr134[0], str59};
                        int maximumDrawingCacheSize = ViewConfiguration.getMaximumDrawingCacheSize() >> 24;
                        int i589 = (maximumDrawingCacheSize ^ 1513) + ((maximumDrawingCacheSize & 1513) << 1);
                        int i590 = -AndroidCharacter.getMirror('0');
                        int i591 = -TextUtils.indexOf(str5, str5, 0, 0);
                        Object[] objArr135 = new Object[1];
                        a(i589, (i590 ^ 79) + ((i590 & 79) << 1), (char) ((45849 & i591) + (i591 | 45849)), objArr135);
                        String[] strArr35 = {(String) objArr135[0], str59};
                        int i592 = 1543 - (~(-Color.blue(0)));
                        int i593 = -TextUtils.lastIndexOf(str5, '0', 0, 0);
                        Object[] objArr136 = new Object[1];
                        a(i592, (i593 ^ 26) + ((i593 & 26) << 1), (char) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 59420), objArr136);
                        String[] strArr36 = {(String) objArr136[0], str59};
                        int i594 = 1570 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1));
                        int maxKeyCode2 = KeyEvent.getMaxKeyCode() >> 16;
                        int i595 = ~maxKeyCode2;
                        int i596 = (((maxKeyCode2 * (-575)) - 18400) - (~(((~((i595 ^ (-33)) | (i595 & (-33)))) | (~(((-33) ^ i18) | ((-33) & i18)))) * 576))) - 1;
                        int i597 = ~((i595 & 32) | (i595 ^ 32));
                        int i598 = ((-33) ^ i21) | ((-33) & i21);
                        int i599 = ~((i598 & maxKeyCode2) | (i598 ^ maxKeyCode2));
                        int i600 = ((i597 & i599) | (i597 ^ i599)) * 576;
                        int i601 = ~maxKeyCode2;
                        Object[] objArr137 = new Object[1];
                        a(i594, (i596 & i600) + (i596 | i600) + ((~((i601 & (-33)) | (i601 ^ (-33)))) * 576), (char) (ViewConfiguration.getFadingEdgeLength() >> 16), objArr137);
                        strArr2 = new String[][]{strArr14, strArr15, strArr16, strArr17, strArr18, strArr19, strArr20, strArr21, strArr22, strArr23, strArr24, strArr25, strArr26, strArr27, strArr28, strArr29, strArr30, strArr31, strArr32, strArr33, strArr34, strArr35, strArr36, new String[]{(String) objArr137[0], str59}};
                        int i602 = -(-ExpandableListView.getPackedPositionGroup(0L));
                        int i603 = (i602 ^ 1603) + ((i602 & 1603) << 1);
                        int i604 = -((byte) KeyEvent.getModifierMetaStateMask());
                        i23 = 0;
                        int iLastIndexOf4 = TextUtils.lastIndexOf(str5, '0', 0, 0);
                        char c12 = (char) ((iLastIndexOf4 ^ 1) + ((iLastIndexOf4 & 1) << 1));
                        Object[] objArr138 = new Object[1];
                        a(i603, i604, c12, objArr138);
                        sb = new StringBuilder((String) objArr138[0]);
                        i24 = i18;
                        i25 = 0;
                        i26 = 0;
                        while (i25 < 24) {
                            String[] strArr37 = strArr2[i25];
                            Object[] objArr139 = {strArr37[i23]};
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1333629456);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                                char cIndexOf3 = (char) (33602 - TextUtils.indexOf(str5, str5, i23, i23));
                                int maximumFlingVelocity5 = (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 3085;
                                int deadChar = KeyEvent.getDeadChar(i23, i23) + 26;
                                byte b41 = (byte) i23;
                                byte b42 = (byte) (b41 + 1);
                                Object[] objArr140 = new Object[1];
                                b(b41, b42, (byte) (-b42), objArr140);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cIndexOf3, maximumFlingVelocity5, deadChar, 1411172903, false, (String) objArr140[0], new Class[]{String.class});
                            }
                            str6 = (String) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr139);
                            String[] strArr38 = (String[]) Arrays.copyOfRange(strArr37, 1, strArr37.length);
                            if (str6 == null && (!str6.isEmpty())) {
                                int i605 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                                int i606 = (i605 ^ 53) + ((i605 & 53) << 1);
                                TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i606 % 128;
                                int i607 = i606 % 2;
                                int length = strArr37.length;
                                if (i607 != 0 ? length == 1 : length == 1) {
                                    int i608 = i25 + 10;
                                    i24 = (~(i18 & i608)) & (i608 | i18);
                                    i28 = ((i26 | 1) << 1) - (i26 ^ 1);
                                    if (i28 > 1) {
                                        int i609 = -TextUtils.indexOf(str5, str5, 0);
                                        int i610 = (i609 ^ 1604) + ((i609 & 1604) << 1);
                                        int i611 = (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 1;
                                        int i612 = -(SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1));
                                        Object[] objArr141 = new Object[1];
                                        a(i610, i611, (char) ((i612 ^ 1) + ((i612 & 1) << 1)), objArr141);
                                        c3 = 0;
                                        sb.append((String) objArr141[0]);
                                    } else {
                                        c3 = 0;
                                    }
                                    sb.append(strArr37[c3]);
                                    int iKeyCodeFromString = 1606 - KeyEvent.keyCodeFromString(str5);
                                    int i613 = -(ViewConfiguration.getScrollDefaultDelay() >> 16);
                                    Object[] objArr142 = new Object[1];
                                    a(iKeyCodeFromString, (i613 ^ 1) + ((i613 & 1) << 1), (char) View.resolveSizeAndState(0, 0, 0), objArr142);
                                    sb.append((String) objArr142[0]);
                                    sb.append(str6);
                                    i26 = i28;
                                } else {
                                    int length2 = strArr38.length;
                                    int i614 = 0;
                                    while (true) {
                                        if (i614 < length2) {
                                            if (str6.contains(strArr38[i614])) {
                                                int i6010 = i25 + 10;
                                                i24 = (~(i18 & i6010)) & (i6010 | i18);
                                                i28 = ((i26 | 1) << 1) - (i26 ^ 1);
                                                if (i28 > 1) {
                                                    int i6011 = -TextUtils.indexOf(str5, str5, 0);
                                                    int i615 = (i6011 ^ 1604) + ((i6011 & 1604) << 1);
                                                    int i616 = (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 1;
                                                    int i617 = -(SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1));
                                                    Object[] objArr143 = new Object[1];
                                                    a(i615, i616, (char) ((i617 ^ 1) + ((i617 & 1) << 1)), objArr143);
                                                    c3 = 0;
                                                    sb.append((String) objArr143[0]);
                                                } else {
                                                    c3 = 0;
                                                }
                                                sb.append(strArr37[c3]);
                                                int iKeyCodeFromString2 = 1606 - KeyEvent.keyCodeFromString(str5);
                                                int i618 = -(ViewConfiguration.getScrollDefaultDelay() >> 16);
                                                Object[] objArr144 = new Object[1];
                                                a(iKeyCodeFromString2, (i618 ^ 1) + ((i618 & 1) << 1), (char) View.resolveSizeAndState(0, 0, 0), objArr144);
                                                sb.append((String) objArr144[0]);
                                                sb.append(str6);
                                                i26 = i28;
                                            } else {
                                                int i619 = (i614 ^ 39) + ((i614 & 39) << 1);
                                                i614 = ((i619 | (-38)) << 1) - (i619 ^ (-38));
                                            }
                                        }
                                    }
                                }
                            }
                            i25++;
                            strArr2 = strArr2;
                            i21 = i21;
                            i382 = i382;
                            i23 = 0;
                        }
                        int i620 = i382;
                        i27 = i21;
                        int i621 = -TextUtils.lastIndexOf(str5, '0');
                        Object[] objArr145 = new Object[1];
                        a(((i621 | 1606) << 1) - (i621 ^ 1606), (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), (char) ((Process.getThreadPriority(0) + 20) >> 6), objArr145);
                        sb.append((String) objArr145[0]);
                        if (i26 > 2) {
                            int i622 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                            int i623 = (i622 & 1) + (i622 | 1);
                            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i623 % 128;
                            int i624 = i623 % 2;
                            String[] strArr39 = {sb.toString()};
                            ((int[]) objArr[0])[0] = i24;
                            objArr = new Object[]{new int[1], strArr39};
                            c2 = 0;
                        } else {
                            objArr = new Object[]{new int[]{i18}, new String[0]};
                            int i625 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                            int i626 = ((i625 | 97) << 1) - (i625 ^ 97);
                            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i626 % 128;
                            int i627 = i626 % 2;
                            c2 = 0;
                        }
                        int i628 = ((int[]) objArr[c2])[c2];
                        int i629 = ((~i620) & i18) | (i620 & i27);
                        int i630 = -i629;
                        int i631 = ((i629 & i630) | (i629 ^ i630)) >> 31;
                        int i632 = i628 & (~i631);
                        int i633 = i620 & i631;
                        i382 = (i633 & i632) | (i632 ^ i633);
                        strArr3 = (String[]) objArr[1];
                    } else {
                        Object[] objArr146 = {objInvoke, 42};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault25 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1557991223);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault25 == null) {
                            char edgeSlop2 = (char) (ViewConfiguration.getEdgeSlop() >> 16);
                            String str60 = str4;
                            int offsetBefore2 = TextUtils.getOffsetBefore(str60, 0) + 3393;
                            int offsetAfter = TextUtils.getOffsetAfter(str60, 0) + 9;
                            byte b43 = (byte) 0;
                            byte b44 = (byte) (b43 + 1);
                            Object[] objArr147 = new Object[1];
                            b(b43, b44, (byte) (-b44), objArr147);
                            str5 = str60;
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault25 = initSession.b(edgeSlop2, offsetBefore2, offsetAfter, 1203525406, false, (String) objArr147[0], new Class[]{String.class, Integer.TYPE});
                        } else {
                            str5 = str4;
                        }
                        long jLongValue16 = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault25).invoke(null, objArr146)).longValue();
                        long j102 = 785138627;
                        long j103 = -560;
                        long j104 = (((long) (-559)) * j102) + (((long) 561) * jLongValue16) + (((j23 | j102) ^ j18) * j103) + (j103 * ((((jLongValue16 ^ j18) | j102) | j22) ^ j18)) + (((long) 560) * (((j23 | jLongValue16) ^ j18) | (((j102 ^ j18) | jLongValue16) ^ j18))) + ((long) (-787208504));
                        int i634 = ((int) (j104 >> 32)) & (501358106 + (((~((-2049143126) | i18)) | 1510105173) * 336) + (((~((-611916715) | i18)) | 72878762) * (-168)) + (((-2049143126) | (~((-611916715) | i84))) * 168));
                        int startElapsedRealtime = (int) Process.getStartElapsedRealtime();
                        int i635 = ((int) j104) & ((((~((-1559249430) | startElapsedRealtime)) | 122023019) * 56) + 18346845 + (((~((~startElapsedRealtime) | 122023019)) | (-1559249430)) * 56));
                        if (((i634 & i635) | (i634 ^ i635)) != 1986687685) {
                            int i3910 = -(ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
                            int i3911 = (i3910 & 370) + (i3910 | 370);
                            int trimmedLength4 = TextUtils.getTrimmedLength(str5) + 23;
                            int i3912 = -(ViewConfiguration.getScrollDefaultDelay() >> 16);
                            Object[] objArr810 = new Object[1];
                            a(i3911, trimmedLength4, (char) (((i3912 | 26080) << 1) - (i3912 ^ 26080)), objArr810);
                            String str210 = (String) objArr810[0];
                            int i3913 = -(-KeyEvent.normalizeMetaState(0));
                            int i3914 = (i3913 ^ 808) + ((i3913 & 808) << 1);
                            int i3915 = -(ViewConfiguration.getJumpTapTimeout() >> 16);
                            Object[] objArr811 = new Object[1];
                            a(i3914, (i3915 ^ 10) + ((i3915 & 10) << 1), (char) ((-2) - ((-ImageFormat.getBitsPerPixel(0)) ^ (-1))), objArr811);
                            String str211 = (String) objArr811[0];
                            int iAlpha4 = Color.alpha(0);
                            int i4010 = ((iAlpha4 | 818) << 1) - (iAlpha4 ^ 818);
                            byte modifierMetaStateMask4 = (byte) KeyEvent.getModifierMetaStateMask();
                            int iTuitionPaymentFragmentspecialinlinedviewModeldefault9 = AudioSourceExternalSyntheticLambda9.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                            int i4011 = modifierMetaStateMask4 * (-574);
                            int i4012 = ((i4011 | (-4592)) << 1) - (i4011 ^ (-4592));
                            int i4013 = ~modifierMetaStateMask4;
                            int i4014 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault9;
                            int i4015 = ~((i4013 ^ i4014) | (i4013 & i4014));
                            j = j18;
                            int i4016 = ~(((-9) ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault9) | ((-9) & iTuitionPaymentFragmentspecialinlinedviewModeldefault9));
                            int i4017 = -(-(((i4015 & i4016) | (i4015 ^ i4016)) * 1150));
                            int i4018 = (i4012 & i4017) + (i4012 | i4017);
                            int i4019 = ~(((-9) ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault9) | ((-9) & iTuitionPaymentFragmentspecialinlinedviewModeldefault9));
                            int i4110 = ~((~iTuitionPaymentFragmentspecialinlinedviewModeldefault9) | 8);
                            int i4111 = ~((i4013 & iTuitionPaymentFragmentspecialinlinedviewModeldefault9) | (i4013 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault9));
                            int i4112 = ~((modifierMetaStateMask4 & i4014) | (i4014 ^ modifierMetaStateMask4));
                            Object[] objArr812 = new Object[1];
                            a(i4010, ((i4018 + (((i4019 & i4110) | (i4019 ^ i4110)) * (-575))) - (~(-(-(((i4112 & i4111) | (i4111 ^ i4112)) * 575))))) - 1, (char) (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), objArr812);
                            String str212 = (String) objArr812[0];
                            int mirror5 = 873 - AndroidCharacter.getMirror('0');
                            int i4113 = -AndroidCharacter.getMirror('0');
                            int i4114 = i4113 * 624;
                            int i4115 = ((((-34832) ^ i4114) + ((i4114 & (-34832)) << 1)) - (~(-(-((~((((-57) ^ i4113) | ((-57) & i4113)) | i18)) * 623))))) - 1;
                            int i4116 = ~i4113;
                            int i4117 = ~((i4116 & 56) | (i4116 ^ 56));
                            int i4118 = (i4115 - (~(-(-(((i4117 & i84) | (i84 ^ i4117)) * (-623)))))) - 1;
                            int i4119 = (~(((-57) ^ i4113) | ((-57) & i4113))) | (~(((-57) ^ i18) | ((-57) & i18)));
                            int i4210 = ~((i4113 & i18) | (i4113 ^ i18));
                            int i4211 = ((i4210 & i4119) | (i4119 ^ i4210)) * 623;
                            Object[] objArr813 = new Object[1];
                            a(mirror5, (i4118 & i4211) + (i4211 | i4118), (char) Drawable.resolveOpacity(0, 0), objArr813);
                            String[] strArr110 = {str210, str211, str212, (String) objArr813[0]};
                            int trimmedLength5 = TextUtils.getTrimmedLength(str5);
                            Object[] objArr814 = new Object[1];
                            a((trimmedLength5 ^ 833) + ((trimmedLength5 & 833) << 1), 15 - (~(-TextUtils.lastIndexOf(str5, '0', 0))), (char) (44244 - (ViewConfiguration.getMinimumFlingVelocity() >> 16)), objArr814);
                            String str310 = (String) objArr814[0];
                            int iIndexOf8 = 850 - TextUtils.indexOf(str5, str5);
                            int i4212 = -View.MeasureSpec.getMode(0);
                            Object[] objArr815 = new Object[1];
                            a(iIndexOf8, ((i4212 | 7) << 1) - (i4212 ^ 7), (char) ((-2) - ((-ImageFormat.getBitsPerPixel(0)) ^ (-1))), objArr815);
                            String str311 = (String) objArr815[0];
                            int scrollDefaultDelay3 = 857 - (ViewConfiguration.getScrollDefaultDelay() >> 16);
                            int i4213 = 5 - (~(-(-(SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)))));
                            int i4214 = -(SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1));
                            Object[] objArr816 = new Object[1];
                            a(scrollDefaultDelay3, i4213, (char) ((41185 ^ i4214) + ((i4214 & 41185) << 1)), objArr816);
                            String str312 = (String) objArr816[0];
                            int i4215 = -(ViewConfiguration.getTouchSlop() >> 8);
                            Object[] objArr910 = new Object[1];
                            a(((i4215 | 864) << 1) - (i4215 ^ 864), 10 - ImageFormat.getBitsPerPixel(0), (char) ((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 26796), objArr910);
                            String str313 = (String) objArr910[0];
                            int i4216 = 874 - (~(-(CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1))));
                            int i4217 = -(-View.combineMeasuredStates(0, 0));
                            int i4218 = (i4217 ^ 14) + ((i4217 & 14) << 1);
                            int i4219 = (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1));
                            Object[] objArr911 = new Object[1];
                            a(i4216, i4218, (char) ((i4219 ^ (-1)) + (i4219 << 1)), objArr911);
                            String[] strArr111 = {str310, str311, str312, str313, (String) objArr911[0]};
                            int mode4 = View.MeasureSpec.getMode(0);
                            int i4310 = ((mode4 | 889) << 1) - (mode4 ^ 889);
                            int bitsPerPixel2 = 15 - ImageFormat.getBitsPerPixel(0);
                            int i4311 = -ExpandableListView.getPackedPositionChild(0L);
                            int iTuitionPaymentFragmentspecialinlinedviewModeldefault10 = AudioSourceExternalSyntheticLambda9.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                            int i4312 = ~i4311;
                            int i4313 = ((i4311 * (-103)) - 1441485) + (((~((i4312 & (-13996)) | (i4312 ^ (-13996)))) | (~(((-13996) ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault10) | ((-13996) & iTuitionPaymentFragmentspecialinlinedviewModeldefault10)))) * 104);
                            int i4314 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault10;
                            int i4315 = (~((i4314 & i4311) | (i4314 ^ i4311) | 13995)) * (-104);
                            int i4316 = (i4313 ^ i4315) + ((i4313 & i4315) << 1);
                            int i4317 = ((i4311 & iTuitionPaymentFragmentspecialinlinedviewModeldefault10) | (i4311 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault10)) * 104;
                            Object[] objArr912 = new Object[1];
                            a(i4310, bitsPerPixel2, (char) ((i4316 ^ i4317) + ((i4317 & i4316) << 1)), objArr912);
                            String str314 = (String) objArr912[0];
                            int i4318 = (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1));
                            int i4319 = ((((i4318 * 980) - 884112) + ((~((-905) | i4)) * 979)) - (~(((i4318 ^ i18) | (i4318 & i18)) * (-979)))) - 1;
                            int i4410 = ~((-905) | i18);
                            int i4411 = ~((i4 & i4318) | (i4 ^ i4318));
                            int i4412 = -(-(((i4411 & i4410) | (i4410 ^ i4411)) * 979));
                            int i4413 = (i4319 ^ i4412) + ((i4412 & i4319) << 1);
                            int i4414 = -(-(ViewConfiguration.getPressedStateDuration() >> 16));
                            Object[] objArr913 = new Object[1];
                            a(i4413, (i4414 ^ 3) + ((i4414 & 3) << 1), (char) (35700 - (~(-(ViewConfiguration.getLongPressTimeout() >> 16)))), objArr913);
                            String str315 = (String) objArr913[0];
                            int iRgb5 = Color.rgb(0, 0, 0);
                            int i4415 = (16778132 ^ iRgb5) + ((iRgb5 & 16778132) << 1);
                            int i4416 = 21 - (~(AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)));
                            int i4417 = -(ViewConfiguration.getPressedStateDuration() >> 16);
                            Object[] objArr914 = new Object[1];
                            a(i4415, i4416, (char) ((i4417 & 3413) + (i4417 | 3413)), objArr914);
                            String str316 = (String) objArr914[0];
                            int i4418 = 937 - (~(-(-ExpandableListView.getPackedPositionGroup(0L))));
                            int i4419 = -KeyEvent.keyCodeFromString(str5);
                            int i4510 = i4419 * (-433);
                            int i4511 = (i4510 & (-5400)) + (i4510 | (-5400));
                            int i4512 = ~i4419;
                            int i4513 = (i4511 - (~(((~((i4512 ^ i4) | (i4512 & i4))) | (~(((-26) ^ i18) | ((-26) & i18)))) * 217))) - 1;
                            int i4514 = ~((i4512 ^ (-26)) | (i4512 & (-26)));
                            int i4515 = ~((i4512 & i18) | (i4512 ^ i18));
                            int i4516 = ((i4515 & i4514) | (i4514 ^ i4515)) * 217;
                            int i4517 = ((i4513 | i4516) << 1) - (i4516 ^ i4513);
                            int i4518 = ~(((-26) ^ i84) | ((-26) & i84));
                            int i4519 = ((i4419 & i4518) | (i4419 ^ i4518)) * 217;
                            Object[] objArr915 = new Object[1];
                            a(i4418, ((i4517 | i4519) << 1) - (i4519 ^ i4517), (char) View.resolveSizeAndState(0, 0, 0), objArr915);
                            String str317 = (String) objArr915[0];
                            int i4610 = 963 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                            int i4611 = -AndroidCharacter.getMirror('0');
                            int i4612 = (i4611 & 76) + (i4611 | 76);
                            int threadPriority3 = Process.getThreadPriority(0);
                            int i4613 = -(((threadPriority3 ^ 20) + ((threadPriority3 & 20) << 1)) >> 6);
                            Object[] objArr916 = new Object[1];
                            a(i4610, i4612, (char) (((i4613 | 22166) << 1) - (i4613 ^ 22166)), objArr916);
                            String str318 = (String) objArr916[0];
                            i20 = i4;
                            i21 = i84;
                            i22 = -1;
                            String[] strArr112 = {str314, str315, str, str316, str317, str318};
                            int i4614 = -View.getDefaultSize(0, 0);
                            int i4615 = i4614 * (-958);
                            int i4616 = ((-949378) & i4615) + (i4615 | (-949378));
                            int i4617 = ~(((-992) ^ i21) | ((-992) & i21));
                            int i4618 = ~i4614;
                            int i4619 = ~((i4618 & i18) | (i4618 ^ i18));
                            int i4710 = (i4617 & i4619) | (i4617 ^ i4619);
                            int i4711 = ~((i21 ^ i4614) | (i21 & i4614));
                            int i4712 = ((i4710 & i4711) | (i4710 ^ i4711)) * 959;
                            int i4713 = (i4616 & i4712) + (i4712 | i4616);
                            int i4714 = (~((i4614 ^ 991) | (i4614 & 991))) * (-959);
                            int i4715 = (i4713 ^ i4714) + ((i4714 & i4713) << 1);
                            int i4716 = ~((~i4614) | i21);
                            int i4717 = ~(((-992) ^ i18) | ((-992) & i18));
                            Object[] objArr917 = new Object[1];
                            a((i4715 - (~(-(-(((~((i4614 & i18) | (i4614 ^ i18))) | ((i4716 & i4717) | (i4716 ^ i4717))) * 959))))) - 1, (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 11, (char) (62500 - KeyEvent.normalizeMetaState(0)), objArr917);
                            String str319 = (String) objArr917[0];
                            int i4718 = -KeyEvent.keyCodeFromString(str5);
                            Object[] objArr918 = new Object[1];
                            a(((i4718 | 1002) << 1) - (i4718 ^ 1002), 8 - View.resolveSize(0, 0), (char) (46206 - (~(-View.MeasureSpec.getSize(0)))), objArr918);
                            String str410 = (String) objArr918[0];
                            int iResolveOpacity2 = Drawable.resolveOpacity(0, 0);
                            Object[] objArr919 = new Object[1];
                            a((iResolveOpacity2 ^ PointerIconCompat.TYPE_ALIAS) + ((iResolveOpacity2 & PointerIconCompat.TYPE_ALIAS) << 1), 5 - (~(-TextUtils.getOffsetBefore(str5, 0))), (char) (33818 - View.MeasureSpec.makeMeasureSpec(0, 0)), objArr919);
                            String str411 = (String) objArr919[0];
                            char mirror6 = AndroidCharacter.getMirror('0');
                            int i4719 = ((mirror6 | 968) << 1) - (mirror6 ^ 968);
                            int maximumFlingVelocity6 = ViewConfiguration.getMaximumFlingVelocity() >> 16;
                            Object[] objArr1010 = new Object[1];
                            a(i4719, ((maximumFlingVelocity6 | 6) << 1) - (maximumFlingVelocity6 ^ 6), (char) (0 - (~(-(-TextUtils.indexOf((CharSequence) str5, '0', 0, 0))))), objArr1010);
                            String[] strArr113 = {str319, str410, str411, (String) objArr1010[0]};
                            int iArgb2 = 1022 - Color.argb(0, 0, 0, 0);
                            int capsMode2 = TextUtils.getCapsMode(str5, 0, 0);
                            Object[] objArr1011 = new Object[1];
                            a(iArgb2, ((capsMode2 | 16) << 1) - (capsMode2 ^ 16), (char) (Process.myPid() >> 22), objArr1011);
                            String str412 = (String) objArr1011[0];
                            int mode5 = View.MeasureSpec.getMode(0);
                            int i4810 = (mode5 ^ 857) + ((mode5 & 857) << 1);
                            int i4811 = -TextUtils.indexOf(str5, str5, 0, 0);
                            int i4812 = (i4811 ^ 7) + ((i4811 & 7) << 1);
                            int i4813 = -(ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1));
                            int i4814 = i4813 * (-1939);
                            int i4815 = ((39990635 | i4814) << 1) - (39990635 ^ i4814);
                            int i4816 = ~((-41186) | i4813);
                            int i4817 = ~((i20 ^ 41185) | (i20 & 41185));
                            int i4818 = -(-(((i4816 & i4817) | (i4816 ^ i4817)) * (-970)));
                            int i4819 = ~i4813;
                            int i4910 = (((i4815 & i4818) + (i4818 | i4815)) - (~(-(-((~((41185 ^ i4819) | (41185 & i4819))) * 1940))))) - 1;
                            int i4911 = ~(i4819 | (-41186));
                            int i4912 = ~((41185 ^ i21) | (41185 & i21));
                            char c13 = (char) ((i4910 - (~(((i4911 & i4912) | (i4911 ^ i4912)) * 970))) - 1);
                            Object[] objArr1012 = new Object[1];
                            a(i4810, i4812, c13, objArr1012);
                            String str413 = (String) objArr1012[0];
                            int packedPositionGroup3 = 825 - ExpandableListView.getPackedPositionGroup(0L);
                            int iIndexOf9 = TextUtils.indexOf((CharSequence) str5, '0') + 9;
                            int i4913 = -(-TextUtils.indexOf((CharSequence) str5, '0', 0, 0));
                            Object[] objArr1013 = new Object[1];
                            a(packedPositionGroup3, iIndexOf9, (char) (((i4913 | 1) << 1) - (i4913 ^ 1)), objArr1013);
                            String[] strArr114 = {str412, str413, (String) objArr1013[0]};
                            int i4914 = -MotionEvent.axisFromString(str5);
                            int i4915 = (i4914 ^ 1037) + ((i4914 & 1037) << 1);
                            int i4916 = -TextUtils.lastIndexOf(str5, '0');
                            int i4917 = ((i4916 | 13) << 1) - (i4916 ^ 13);
                            int i4918 = -Process.getGidForName(str5);
                            Object[] objArr1014 = new Object[1];
                            a(i4915, i4917, (char) (((64362 | i4918) << 1) - (i4918 ^ 64362)), objArr1014);
                            String str414 = (String) objArr1014[0];
                            int i4919 = -MotionEvent.axisFromString(str5);
                            Object[] objArr1015 = new Object[1];
                            a((i4919 ^ 1051) + ((i4919 & 1051) << 1), -TextUtils.lastIndexOf(str5, '0', 0), (char) (40740 - (ViewConfiguration.getTouchSlop() >> 8)), objArr1015);
                            String[] strArr115 = {str414, (String) objArr1015[0]};
                            int i5010 = -(-Process.getGidForName(str5));
                            int i5011 = (i5010 ^ 1054) + ((i5010 & 1054) << 1);
                            int i5012 = -(KeyEvent.getMaxKeyCode() >> 16);
                            Object[] objArr1016 = new Object[1];
                            a(i5011, (i5012 ^ 9) + ((i5012 & 9) << 1), (char) (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), objArr1016);
                            String str415 = (String) objArr1016[0];
                            int iLastIndexOf5 = TextUtils.lastIndexOf(str5, '0', 0, 0);
                            int i5013 = ((iLastIndexOf5 | 1063) << 1) - (iLastIndexOf5 ^ 1063);
                            int i5014 = 0 - (~TextUtils.indexOf(str5, str5, 0, 0));
                            int i5015 = -TextUtils.indexOf(str5, str5, 0);
                            Object[] objArr1017 = new Object[1];
                            a(i5013, i5014, (char) ((57643 ^ i5015) + ((i5015 & 57643) << 1)), objArr1017);
                            String[] strArr210 = {str415, (String) objArr1017[0]};
                            Object[] objArr1018 = new Object[1];
                            a(1063 - (~(-(SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)))), 14 - (~(-ImageFormat.getBitsPerPixel(0))), (char) (ViewConfiguration.getMinimumFlingVelocity() >> 16), objArr1018);
                            String str416 = (String) objArr1018[0];
                            int size6 = 905 - View.MeasureSpec.getSize(0);
                            int i5016 = -(-((byte) KeyEvent.getModifierMetaStateMask()));
                            Object[] objArr1019 = new Object[1];
                            a(size6, (i5016 ^ 4) + ((i5016 & 4) << 1), (char) (Color.red(0) + 35701), objArr1019);
                            String str417 = (String) objArr1019[0];
                            int i5017 = -ImageFormat.getBitsPerPixel(0);
                            Object[] objArr1110 = new Object[1];
                            a((i5017 ^ 849) + ((i5017 & 849) << 1), (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 6, (char) Color.argb(0, 0, 0, 0), objArr1110);
                            String str418 = (String) objArr1110[0];
                            int packedPositionType2 = ExpandableListView.getPackedPositionType(0L);
                            int i5018 = (packedPositionType2 ^ 1079) + ((packedPositionType2 & 1079) << 1);
                            int iIndexOf10 = TextUtils.indexOf(str5, str5);
                            int i5019 = (iIndexOf10 & 8) + (iIndexOf10 | 8);
                            int keyRepeatDelay4 = ViewConfiguration.getKeyRepeatDelay() >> 16;
                            Object[] objArr1111 = new Object[1];
                            a(i5018, i5019, (char) ((keyRepeatDelay4 & 7130) + (keyRepeatDelay4 | 7130)), objArr1111);
                            String str419 = (String) objArr1111[0];
                            int i5110 = 863 - (~(-View.MeasureSpec.getMode(0)));
                            int i5111 = -(ViewConfiguration.getDoubleTapTimeout() >> 16);
                            Object[] objArr1112 = new Object[1];
                            a(i5110, (i5111 & 11) + (i5111 | 11), (char) ((ViewConfiguration.getPressedStateDuration() >> 16) + 26797), objArr1112);
                            String str510 = (String) objArr1112[0];
                            Object[] objArr1113 = new Object[1];
                            a(875 - TextUtils.getCapsMode(str5, 0, 0), 13 - (~(-Drawable.resolveOpacity(0, 0))), (char) Color.argb(0, 0, 0, 0), objArr1113);
                            String[] strArr211 = {str416, str417, str418, str419, str510, (String) objArr1113[0]};
                            int i5112 = 1085 - (~(-TextUtils.indexOf((CharSequence) str5, '0')));
                            int i5113 = -(-TextUtils.indexOf((CharSequence) str5, '0', 0));
                            Object[] objArr1114 = new Object[1];
                            a(i5112, (i5113 & 21) + (i5113 | 21), (char) TextUtils.indexOf(str5, str5), objArr1114);
                            String str511 = (String) objArr1114[0];
                            int i5114 = -(Process.myPid() >> 22);
                            int iTuitionPaymentFragmentspecialinlinedviewModeldefault11 = AudioSourceExternalSyntheticLambda9.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                            int i5115 = (i5114 * (-300)) + 334314;
                            int i5116 = (i5114 ^ 1107) | (i5114 & 1107);
                            int i5117 = -(-((~((i5116 & iTuitionPaymentFragmentspecialinlinedviewModeldefault11) | (i5116 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault11))) * (-301)));
                            int i5118 = (i5115 & i5117) + (i5115 | i5117);
                            int i5119 = ~(((-1108) ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault11) | ((-1108) & iTuitionPaymentFragmentspecialinlinedviewModeldefault11));
                            int i5210 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault11;
                            int i5211 = ~((i5210 & i5114) | (i5210 ^ i5114));
                            int i5212 = (i5118 - (~(-(-(((i5119 & i5211) | (i5119 ^ i5211)) * (-301)))))) - 1;
                            int i5213 = ~i5114;
                            int i5214 = ~((i5213 & iTuitionPaymentFragmentspecialinlinedviewModeldefault11) | (i5213 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault11));
                            int i5215 = ((i5214 & (-1108)) | ((-1108) ^ i5214)) * 301;
                            int i5216 = (i5212 & i5215) + (i5215 | i5212);
                            int i5217 = -TextUtils.indexOf(str5, str5, 0, 0);
                            Object[] objArr1115 = new Object[1];
                            a(i5216, (i5217 ^ 19) + ((i5217 & 19) << 1), (char) TextUtils.indexOf(str5, str5), objArr1115);
                            String str512 = (String) objArr1115[0];
                            int i5218 = -TextUtils.lastIndexOf(str5, '0', 0);
                            Object[] objArr1116 = new Object[1];
                            a((i5218 & 1125) + (i5218 | 1125), TextUtils.indexOf((CharSequence) str5, '0', 0, 0) + 32, (char) (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), objArr1116);
                            String str513 = (String) objArr1116[0];
                            int i5219 = -KeyEvent.keyCodeFromString(str5);
                            int i5310 = (i5219 ^ 1157) + ((i5219 & 1157) << 1);
                            int i5311 = -(Process.myTid() >> 22);
                            int i5312 = (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1));
                            Object[] objArr1117 = new Object[1];
                            a(i5310, (i5311 ^ 26) + ((i5311 & 26) << 1), (char) ((i5312 & 2734) + (i5312 | 2734)), objArr1117);
                            String str514 = (String) objArr1117[0];
                            int i5313 = -(-Drawable.resolveOpacity(0, 0));
                            int i5314 = (i5313 ^ 1183) + ((i5313 & 1183) << 1);
                            int i5315 = -(-(ViewConfiguration.getScrollDefaultDelay() >> 16));
                            Object[] objArr1118 = new Object[1];
                            a(i5314, (i5315 & 23) + (i5315 | 23), (char) (25628 - TextUtils.indexOf((CharSequence) str5, '0', 0, 0)), objArr1118);
                            String str515 = (String) objArr1118[0];
                            Object[] objArr1119 = new Object[1];
                            a(1205 - (~(-(-(ViewConfiguration.getKeyRepeatDelay() >> 16)))), 33 - Color.green(0), (char) (38339 - KeyEvent.keyCodeFromString(str5)), objArr1119);
                            String[] strArr212 = {str511, str512, str513, str514, str515, (String) objArr1119[0], str};
                            int i5316 = 1238 - (~(ViewConfiguration.getPressedStateDuration() >> 16));
                            int i5317 = -View.resolveSize(0, 0);
                            Object[] objArr1210 = new Object[1];
                            a(i5316, (i5317 ^ 13) + ((i5317 & 13) << 1), (char) (ViewConfiguration.getEdgeSlop() >> 16), objArr1210);
                            String str516 = (String) objArr1210[0];
                            int i5318 = 817 - (~(-(KeyEvent.getMaxKeyCode() >> 16)));
                            int defaultSize2 = View.getDefaultSize(0, 0);
                            Object[] objArr1211 = new Object[1];
                            a(i5318, (defaultSize2 & 7) + (defaultSize2 | 7), (char) ((-1) - TextUtils.lastIndexOf(str5, '0')), objArr1211);
                            String[] strArr213 = {str516, (String) objArr1211[0]};
                            int i5319 = -(-(ViewConfiguration.getPressedStateDuration() >> 16));
                            int i5410 = (i5319 ^ 1252) + ((i5319 & 1252) << 1);
                            int i5411 = -(-(ViewConfiguration.getMaximumDrawingCacheSize() >> 24));
                            Object[] objArr1212 = new Object[1];
                            a(i5410, ((i5411 | 30) << 1) - (i5411 ^ 30), (char) (4319 - (~(-(SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1))))), objArr1212);
                            String str517 = (String) objArr1212[0];
                            Object[] objArr1213 = new Object[1];
                            a(1281 - (~(-(-TextUtils.getOffsetAfter(str5, 0)))), 10 - (~(-(Process.myPid() >> 22))), (char) Drawable.resolveOpacity(0, 0), objArr1213);
                            String[] strArr214 = {str517, (String) objArr1213[0]};
                            int i5412 = -(-(ViewConfiguration.getMaximumDrawingCacheSize() >> 24));
                            int i5413 = (i5412 ^ 1293) + ((i5412 & 1293) << 1);
                            int i5414 = -(ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1));
                            Object[] objArr1214 = new Object[1];
                            a(i5413, (i5414 ^ 20) + ((i5414 & 20) << 1), (char) Color.red(0), objArr1214);
                            String str518 = (String) objArr1214[0];
                            int gidForName3 = Process.getGidForName(str5) + 1313;
                            int i5415 = -Color.alpha(0);
                            Object[] objArr1215 = new Object[1];
                            a(gidForName3, (i5415 & 5) + (i5415 | 5), (char) KeyEvent.normalizeMetaState(0), objArr1215);
                            String[] strArr215 = {str518, (String) objArr1215[0]};
                            int iRgb6 = (-16775899) - Color.rgb(0, 0, 0);
                            int i5416 = -TextUtils.indexOf((CharSequence) str5, '0');
                            Object[] objArr1216 = new Object[1];
                            a(iRgb6, ((i5416 | 18) << 1) - (i5416 ^ 18), (char) (3383 - (~(-TextUtils.lastIndexOf(str5, '0')))), objArr1216);
                            String[] strArr216 = {(String) objArr1216[0]};
                            int pressedStateDuration3 = ViewConfiguration.getPressedStateDuration() >> 16;
                            int i5417 = ((pressedStateDuration3 | 1336) << 1) - (pressedStateDuration3 ^ 1336);
                            int i5418 = -(-((byte) KeyEvent.getModifierMetaStateMask()));
                            Object[] objArr1217 = new Object[1];
                            a(i5417, (i5418 ^ 17) + ((i5418 & 17) << 1), (char) (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), objArr1217);
                            String[] strArr217 = {(String) objArr1217[0]};
                            int iLastIndexOf6 = TextUtils.lastIndexOf(str5, '0', 0);
                            int iTuitionPaymentFragmentspecialinlinedviewModeldefault12 = AudioSourceExternalSyntheticLambda9.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                            int i5419 = iLastIndexOf6 * (-183);
                            int i5510 = ((250305 | i5419) << 1) - (i5419 ^ 250305);
                            int i5511 = ~iLastIndexOf6;
                            int i5512 = ~((i5511 ^ 1353) | (i5511 & 1353));
                            int i5513 = ~((~iTuitionPaymentFragmentspecialinlinedviewModeldefault12) | 1353);
                            int i5514 = ~((iLastIndexOf6 & (-1354)) | ((-1354) ^ iLastIndexOf6));
                            int i5515 = i5510 + (((i5512 & i5513) | (i5512 ^ i5513)) * 184) + (((i5514 & iTuitionPaymentFragmentspecialinlinedviewModeldefault12) | (iTuitionPaymentFragmentspecialinlinedviewModeldefault12 ^ i5514)) * (-184));
                            int i5516 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault12;
                            int i5517 = i5515 + ((~((i5516 & i5511) | (i5511 ^ i5516))) * 184);
                            int jumpTapTimeout3 = ViewConfiguration.getJumpTapTimeout() >> 16;
                            int i5518 = ((jumpTapTimeout3 | 19) << 1) - (jumpTapTimeout3 ^ 19);
                            int i5519 = (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1));
                            int iTuitionPaymentFragmentspecialinlinedviewModeldefault13 = AudioSourceExternalSyntheticLambda9.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                            int i5610 = (i5519 * 371) - 371;
                            int i5611 = ~(~iTuitionPaymentFragmentspecialinlinedviewModeldefault13);
                            int i5612 = ~i5519;
                            int i5613 = ~(i5612 | iTuitionPaymentFragmentspecialinlinedviewModeldefault13);
                            int i5614 = -(-(((i5611 & i5613) | (i5611 ^ i5613)) * (-370)));
                            int i5615 = ((i5610 | i5614) << 1) - (i5610 ^ i5614);
                            int i5616 = ~((~i5519) | (~iTuitionPaymentFragmentspecialinlinedviewModeldefault13));
                            int i5617 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault13;
                            char c14 = (char) ((((i5615 - (~(((i5617 & i5616) | (i5616 ^ i5617)) * (-370)))) - 1) - (~((~(i5519 | i5612)) * 370))) - 1);
                            Object[] objArr1218 = new Object[1];
                            a(i5517, i5518, c14, objArr1218);
                            String[] strArr218 = {(String) objArr1218[0]};
                            int offsetBefore3 = 1371 - TextUtils.getOffsetBefore(str5, 0);
                            int iGreen2 = Color.green(0) + 19;
                            int iIndexOf11 = TextUtils.indexOf(str5, str5, 0);
                            int iTuitionPaymentFragmentspecialinlinedviewModeldefault14 = AudioSourceExternalSyntheticLambda9.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                            int i5618 = iIndexOf11 * (-317);
                            int i5619 = (8101324 & i5618) + (i5618 | 8101324);
                            int i5710 = ~iIndexOf11;
                            int i5711 = ~((i5710 ^ (-25397)) | (i5710 & (-25397)) | iTuitionPaymentFragmentspecialinlinedviewModeldefault14);
                            int i5712 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault14;
                            int i5713 = (i5712 & iIndexOf11) | (i5712 ^ iIndexOf11);
                            int i5714 = ~((i5713 & 25396) | (i5713 ^ 25396));
                            int i5715 = -(-(((i5711 & i5714) | (i5711 ^ i5714)) * (-318)));
                            int i5716 = (i5619 ^ i5715) + ((i5619 & i5715) << 1);
                            int i5717 = ~(((-25397) ^ iIndexOf11) | ((-25397) & iIndexOf11));
                            int i5718 = ~((iIndexOf11 & iTuitionPaymentFragmentspecialinlinedviewModeldefault14) | (iIndexOf11 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault14));
                            int i5719 = ((i5718 & i5717) | (i5717 ^ i5718)) * (-318);
                            int i5810 = ((i5716 | i5719) << 1) - (i5719 ^ i5716);
                            int i5811 = ~((iTuitionPaymentFragmentspecialinlinedviewModeldefault14 & i5710) | (i5710 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault14));
                            int i5812 = ((i5811 & (-25397)) | ((-25397) ^ i5811)) * TypedValues.AttributesType.TYPE_PIVOT_TARGET;
                            Object[] objArr1219 = new Object[1];
                            a(offsetBefore3, iGreen2, (char) ((i5810 & i5812) + (i5812 | i5810)), objArr1219);
                            String[] strArr219 = {(String) objArr1219[0]};
                            int i5813 = 1390 - (~((byte) KeyEvent.getModifierMetaStateMask()));
                            int iRed3 = Color.red(0);
                            Object[] objArr1310 = new Object[1];
                            a(i5813, (iRed3 & 23) + (iRed3 | 23), (char) ExpandableListView.getPackedPositionType(0L), objArr1310);
                            String[] strArr310 = {(String) objArr1310[0]};
                            int i5814 = 1413 - (~TextUtils.lastIndexOf(str5, '0', 0));
                            int iAlpha5 = Color.alpha(0);
                            Object[] objArr1311 = new Object[1];
                            a(i5814, ((iAlpha5 | 21) << 1) - (iAlpha5 ^ 21), (char) (Process.myPid() >> 22), objArr1311);
                            String[] strArr311 = {(String) objArr1311[0]};
                            int packedPositionChild2 = ExpandableListView.getPackedPositionChild(0L) + 1435;
                            int i5815 = -((Process.getThreadPriority(0) + 20) >> 6);
                            Object[] objArr1312 = new Object[1];
                            a(packedPositionChild2, (i5815 ^ 24) + ((i5815 & 24) << 1), (char) TextUtils.getCapsMode(str5, 0, 0), objArr1312);
                            String str519 = str;
                            String[] strArr312 = {(String) objArr1312[0], str519};
                            int i5816 = -(ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1));
                            int i5817 = (i5816 ^ 1459) + ((i5816 & 1459) << 1);
                            int i5818 = -(SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1));
                            int threadPriority4 = Process.getThreadPriority(0);
                            Object[] objArr1313 = new Object[1];
                            a(i5817, (i5818 ^ 29) + ((i5818 & 29) << 1), (char) (((threadPriority4 & 20) + (threadPriority4 | 20)) >> 6), objArr1313);
                            String[] strArr313 = {(String) objArr1313[0], str519};
                            Object[] objArr1314 = new Object[1];
                            a(1485 - (~(-(-View.combineMeasuredStates(0, 0)))), 25 - (~(-(-(SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))))), (char) TextUtils.indexOf(str5, str5, 0, 0), objArr1314);
                            String[] strArr314 = {(String) objArr1314[0], str519};
                            int maximumDrawingCacheSize2 = ViewConfiguration.getMaximumDrawingCacheSize() >> 24;
                            int i5819 = (maximumDrawingCacheSize2 ^ 1513) + ((maximumDrawingCacheSize2 & 1513) << 1);
                            int i5910 = -AndroidCharacter.getMirror('0');
                            int i5911 = -TextUtils.indexOf(str5, str5, 0, 0);
                            Object[] objArr1315 = new Object[1];
                            a(i5819, (i5910 ^ 79) + ((i5910 & 79) << 1), (char) ((45849 & i5911) + (i5911 | 45849)), objArr1315);
                            String[] strArr315 = {(String) objArr1315[0], str519};
                            int i5912 = 1543 - (~(-Color.blue(0)));
                            int i5913 = -TextUtils.lastIndexOf(str5, '0', 0, 0);
                            Object[] objArr1316 = new Object[1];
                            a(i5912, (i5913 ^ 26) + ((i5913 & 26) << 1), (char) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 59420), objArr1316);
                            String[] strArr316 = {(String) objArr1316[0], str519};
                            int i5914 = 1570 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1));
                            int maxKeyCode3 = KeyEvent.getMaxKeyCode() >> 16;
                            int i5915 = ~maxKeyCode3;
                            int i5916 = (((maxKeyCode3 * (-575)) - 18400) - (~(((~((i5915 ^ (-33)) | (i5915 & (-33)))) | (~(((-33) ^ i18) | ((-33) & i18)))) * 576))) - 1;
                            int i5917 = ~((i5915 & 32) | (i5915 ^ 32));
                            int i5918 = ((-33) ^ i21) | ((-33) & i21);
                            int i5919 = ~((i5918 & maxKeyCode3) | (i5918 ^ maxKeyCode3));
                            int i6012 = ((i5917 & i5919) | (i5917 ^ i5919)) * 576;
                            int i6013 = ~maxKeyCode3;
                            Object[] objArr1317 = new Object[1];
                            a(i5914, (i5916 & i6012) + (i5916 | i6012) + ((~((i6013 & (-33)) | (i6013 ^ (-33)))) * 576), (char) (ViewConfiguration.getFadingEdgeLength() >> 16), objArr1317);
                            strArr2 = new String[][]{strArr110, strArr111, strArr112, strArr113, strArr114, strArr115, strArr210, strArr211, strArr212, strArr213, strArr214, strArr215, strArr216, strArr217, strArr218, strArr219, strArr310, strArr311, strArr312, strArr313, strArr314, strArr315, strArr316, new String[]{(String) objArr1317[0], str519}};
                            int i6014 = -(-ExpandableListView.getPackedPositionGroup(0L));
                            int i6015 = (i6014 ^ 1603) + ((i6014 & 1603) << 1);
                            int i6016 = -((byte) KeyEvent.getModifierMetaStateMask());
                            i23 = 0;
                            int iLastIndexOf7 = TextUtils.lastIndexOf(str5, '0', 0, 0);
                            char c15 = (char) ((iLastIndexOf7 ^ 1) + ((iLastIndexOf7 & 1) << 1));
                            Object[] objArr1318 = new Object[1];
                            a(i6015, i6016, c15, objArr1318);
                            sb = new StringBuilder((String) objArr1318[0]);
                            i24 = i18;
                            i25 = 0;
                            i26 = 0;
                            while (i25 < 24) {
                                String[] strArr317 = strArr2[i25];
                                Object[] objArr1319 = {strArr317[i23]};
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1333629456);
                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                                    char cIndexOf4 = (char) (33602 - TextUtils.indexOf(str5, str5, i23, i23));
                                    int maximumFlingVelocity7 = (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 3085;
                                    int deadChar2 = KeyEvent.getDeadChar(i23, i23) + 26;
                                    byte b45 = (byte) i23;
                                    byte b46 = (byte) (b45 + 1);
                                    Object[] objArr148 = new Object[1];
                                    b(b45, b46, (byte) (-b46), objArr148);
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cIndexOf4, maximumFlingVelocity7, deadChar2, 1411172903, false, (String) objArr148[0], new Class[]{String.class});
                                }
                                str6 = (String) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr1319);
                                String[] strArr318 = (String[]) Arrays.copyOfRange(strArr317, 1, strArr317.length);
                                if (str6 == null) {
                                }
                                i25++;
                                strArr2 = strArr2;
                                i21 = i21;
                                i382 = i382;
                                i23 = 0;
                            }
                            int i6210 = i382;
                            i27 = i21;
                            int i6211 = -TextUtils.lastIndexOf(str5, '0');
                            Object[] objArr149 = new Object[1];
                            a(((i6211 | 1606) << 1) - (i6211 ^ 1606), (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), (char) ((Process.getThreadPriority(0) + 20) >> 6), objArr149);
                            sb.append((String) objArr149[0]);
                            if (i26 > 2) {
                                int i6212 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                                int i6213 = (i6212 & 1) + (i6212 | 1);
                                TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i6213 % 128;
                                int i6214 = i6213 % 2;
                                String[] strArr319 = {sb.toString()};
                                ((int[]) objArr[0])[0] = i24;
                                objArr = new Object[]{new int[1], strArr319};
                                c2 = 0;
                            } else {
                                objArr = new Object[]{new int[]{i18}, new String[0]};
                                int i6215 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                                int i6216 = ((i6215 | 97) << 1) - (i6215 ^ 97);
                                TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i6216 % 128;
                                int i6217 = i6216 % 2;
                                c2 = 0;
                            }
                            int i6218 = ((int[]) objArr[c2])[c2];
                            int i6219 = ((~i6210) & i18) | (i6210 & i27);
                            int i636 = -i6219;
                            int i637 = ((i6219 & i636) | (i6219 ^ i636)) >> 31;
                            int i638 = i6218 & (~i637);
                            int i639 = i6210 & i637;
                            i382 = (i639 & i638) | (i638 ^ i639);
                            strArr3 = (String[]) objArr[1];
                        }
                    }
                    j = j18;
                    i27 = i84;
                    i20 = i4;
                    strArr3 = null;
                    i22 = -1;
                } else {
                    str5 = str4;
                    int i3916 = -(ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
                    int i3917 = (i3916 & 370) + (i3916 | 370);
                    int trimmedLength6 = TextUtils.getTrimmedLength(str5) + 23;
                    int i3918 = -(ViewConfiguration.getScrollDefaultDelay() >> 16);
                    Object[] objArr817 = new Object[1];
                    a(i3917, trimmedLength6, (char) (((i3918 | 26080) << 1) - (i3918 ^ 26080)), objArr817);
                    String str213 = (String) objArr817[0];
                    int i3919 = -(-KeyEvent.normalizeMetaState(0));
                    int i39110 = (i3919 ^ 808) + ((i3919 & 808) << 1);
                    int i39111 = -(ViewConfiguration.getJumpTapTimeout() >> 16);
                    Object[] objArr818 = new Object[1];
                    a(i39110, (i39111 ^ 10) + ((i39111 & 10) << 1), (char) ((-2) - ((-ImageFormat.getBitsPerPixel(0)) ^ (-1))), objArr818);
                    String str214 = (String) objArr818[0];
                    int iAlpha6 = Color.alpha(0);
                    int i40110 = ((iAlpha6 | 818) << 1) - (iAlpha6 ^ 818);
                    byte modifierMetaStateMask5 = (byte) KeyEvent.getModifierMetaStateMask();
                    int iTuitionPaymentFragmentspecialinlinedviewModeldefault15 = AudioSourceExternalSyntheticLambda9.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                    int i40111 = modifierMetaStateMask5 * (-574);
                    int i40112 = ((i40111 | (-4592)) << 1) - (i40111 ^ (-4592));
                    int i40113 = ~modifierMetaStateMask5;
                    int i40114 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault15;
                    int i40115 = ~((i40113 ^ i40114) | (i40113 & i40114));
                    j = j18;
                    int i40116 = ~(((-9) ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault15) | ((-9) & iTuitionPaymentFragmentspecialinlinedviewModeldefault15));
                    int i40117 = -(-(((i40115 & i40116) | (i40115 ^ i40116)) * 1150));
                    int i40118 = (i40112 & i40117) + (i40112 | i40117);
                    int i40119 = ~(((-9) ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault15) | ((-9) & iTuitionPaymentFragmentspecialinlinedviewModeldefault15));
                    int i41110 = ~((~iTuitionPaymentFragmentspecialinlinedviewModeldefault15) | 8);
                    int i41111 = ~((i40113 & iTuitionPaymentFragmentspecialinlinedviewModeldefault15) | (i40113 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault15));
                    int i41112 = ~((modifierMetaStateMask5 & i40114) | (i40114 ^ modifierMetaStateMask5));
                    Object[] objArr819 = new Object[1];
                    a(i40110, ((i40118 + (((i40119 & i41110) | (i40119 ^ i41110)) * (-575))) - (~(-(-(((i41112 & i41111) | (i41111 ^ i41112)) * 575))))) - 1, (char) (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), objArr819);
                    String str215 = (String) objArr819[0];
                    int mirror7 = 873 - AndroidCharacter.getMirror('0');
                    int i41113 = -AndroidCharacter.getMirror('0');
                    int i41114 = i41113 * 624;
                    int i41115 = ((((-34832) ^ i41114) + ((i41114 & (-34832)) << 1)) - (~(-(-((~((((-57) ^ i41113) | ((-57) & i41113)) | i18)) * 623))))) - 1;
                    int i41116 = ~i41113;
                    int i41117 = ~((i41116 & 56) | (i41116 ^ 56));
                    int i41118 = (i41115 - (~(-(-(((i41117 & i84) | (i84 ^ i41117)) * (-623)))))) - 1;
                    int i41119 = (~(((-57) ^ i41113) | ((-57) & i41113))) | (~(((-57) ^ i18) | ((-57) & i18)));
                    int i42110 = ~((i41113 & i18) | (i41113 ^ i18));
                    int i42111 = ((i42110 & i41119) | (i41119 ^ i42110)) * 623;
                    Object[] objArr8110 = new Object[1];
                    a(mirror7, (i41118 & i42111) + (i42111 | i41118), (char) Drawable.resolveOpacity(0, 0), objArr8110);
                    String[] strArr116 = {str213, str214, str215, (String) objArr8110[0]};
                    int trimmedLength7 = TextUtils.getTrimmedLength(str5);
                    Object[] objArr8111 = new Object[1];
                    a((trimmedLength7 ^ 833) + ((trimmedLength7 & 833) << 1), 15 - (~(-TextUtils.lastIndexOf(str5, '0', 0))), (char) (44244 - (ViewConfiguration.getMinimumFlingVelocity() >> 16)), objArr8111);
                    String str3110 = (String) objArr8111[0];
                    int iIndexOf12 = 850 - TextUtils.indexOf(str5, str5);
                    int i42112 = -View.MeasureSpec.getMode(0);
                    Object[] objArr8112 = new Object[1];
                    a(iIndexOf12, ((i42112 | 7) << 1) - (i42112 ^ 7), (char) ((-2) - ((-ImageFormat.getBitsPerPixel(0)) ^ (-1))), objArr8112);
                    String str3111 = (String) objArr8112[0];
                    int scrollDefaultDelay4 = 857 - (ViewConfiguration.getScrollDefaultDelay() >> 16);
                    int i42113 = 5 - (~(-(-(SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)))));
                    int i42114 = -(SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1));
                    Object[] objArr8113 = new Object[1];
                    a(scrollDefaultDelay4, i42113, (char) ((41185 ^ i42114) + ((i42114 & 41185) << 1)), objArr8113);
                    String str3112 = (String) objArr8113[0];
                    int i42115 = -(ViewConfiguration.getTouchSlop() >> 8);
                    Object[] objArr9110 = new Object[1];
                    a(((i42115 | 864) << 1) - (i42115 ^ 864), 10 - ImageFormat.getBitsPerPixel(0), (char) ((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 26796), objArr9110);
                    String str3113 = (String) objArr9110[0];
                    int i42116 = 874 - (~(-(CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1))));
                    int i42117 = -(-View.combineMeasuredStates(0, 0));
                    int i42118 = (i42117 ^ 14) + ((i42117 & 14) << 1);
                    int i42119 = (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1));
                    Object[] objArr9111 = new Object[1];
                    a(i42116, i42118, (char) ((i42119 ^ (-1)) + (i42119 << 1)), objArr9111);
                    String[] strArr117 = {str3110, str3111, str3112, str3113, (String) objArr9111[0]};
                    int mode6 = View.MeasureSpec.getMode(0);
                    int i43110 = ((mode6 | 889) << 1) - (mode6 ^ 889);
                    int bitsPerPixel3 = 15 - ImageFormat.getBitsPerPixel(0);
                    int i43111 = -ExpandableListView.getPackedPositionChild(0L);
                    int iTuitionPaymentFragmentspecialinlinedviewModeldefault16 = AudioSourceExternalSyntheticLambda9.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                    int i43112 = ~i43111;
                    int i43113 = ((i43111 * (-103)) - 1441485) + (((~((i43112 & (-13996)) | (i43112 ^ (-13996)))) | (~(((-13996) ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault16) | ((-13996) & iTuitionPaymentFragmentspecialinlinedviewModeldefault16)))) * 104);
                    int i43114 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault16;
                    int i43115 = (~((i43114 & i43111) | (i43114 ^ i43111) | 13995)) * (-104);
                    int i43116 = (i43113 ^ i43115) + ((i43113 & i43115) << 1);
                    int i43117 = ((i43111 & iTuitionPaymentFragmentspecialinlinedviewModeldefault16) | (i43111 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault16)) * 104;
                    Object[] objArr9112 = new Object[1];
                    a(i43110, bitsPerPixel3, (char) ((i43116 ^ i43117) + ((i43117 & i43116) << 1)), objArr9112);
                    String str3114 = (String) objArr9112[0];
                    int i43118 = (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1));
                    int i43119 = ((((i43118 * 980) - 884112) + ((~((-905) | i4)) * 979)) - (~(((i43118 ^ i18) | (i43118 & i18)) * (-979)))) - 1;
                    int i44110 = ~((-905) | i18);
                    int i44111 = ~((i4 & i43118) | (i4 ^ i43118));
                    int i44112 = -(-(((i44111 & i44110) | (i44110 ^ i44111)) * 979));
                    int i44113 = (i43119 ^ i44112) + ((i44112 & i43119) << 1);
                    int i44114 = -(-(ViewConfiguration.getPressedStateDuration() >> 16));
                    Object[] objArr9113 = new Object[1];
                    a(i44113, (i44114 ^ 3) + ((i44114 & 3) << 1), (char) (35700 - (~(-(ViewConfiguration.getLongPressTimeout() >> 16)))), objArr9113);
                    String str3115 = (String) objArr9113[0];
                    int iRgb7 = Color.rgb(0, 0, 0);
                    int i44115 = (16778132 ^ iRgb7) + ((iRgb7 & 16778132) << 1);
                    int i44116 = 21 - (~(AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)));
                    int i44117 = -(ViewConfiguration.getPressedStateDuration() >> 16);
                    Object[] objArr9114 = new Object[1];
                    a(i44115, i44116, (char) ((i44117 & 3413) + (i44117 | 3413)), objArr9114);
                    String str3116 = (String) objArr9114[0];
                    int i44118 = 937 - (~(-(-ExpandableListView.getPackedPositionGroup(0L))));
                    int i44119 = -KeyEvent.keyCodeFromString(str5);
                    int i45110 = i44119 * (-433);
                    int i45111 = (i45110 & (-5400)) + (i45110 | (-5400));
                    int i45112 = ~i44119;
                    int i45113 = (i45111 - (~(((~((i45112 ^ i4) | (i45112 & i4))) | (~(((-26) ^ i18) | ((-26) & i18)))) * 217))) - 1;
                    int i45114 = ~((i45112 ^ (-26)) | (i45112 & (-26)));
                    int i45115 = ~((i45112 & i18) | (i45112 ^ i18));
                    int i45116 = ((i45115 & i45114) | (i45114 ^ i45115)) * 217;
                    int i45117 = ((i45113 | i45116) << 1) - (i45116 ^ i45113);
                    int i45118 = ~(((-26) ^ i84) | ((-26) & i84));
                    int i45119 = ((i44119 & i45118) | (i44119 ^ i45118)) * 217;
                    Object[] objArr9115 = new Object[1];
                    a(i44118, ((i45117 | i45119) << 1) - (i45119 ^ i45117), (char) View.resolveSizeAndState(0, 0, 0), objArr9115);
                    String str3117 = (String) objArr9115[0];
                    int i46110 = 963 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                    int i46111 = -AndroidCharacter.getMirror('0');
                    int i46112 = (i46111 & 76) + (i46111 | 76);
                    int threadPriority5 = Process.getThreadPriority(0);
                    int i46113 = -(((threadPriority5 ^ 20) + ((threadPriority5 & 20) << 1)) >> 6);
                    Object[] objArr9116 = new Object[1];
                    a(i46110, i46112, (char) (((i46113 | 22166) << 1) - (i46113 ^ 22166)), objArr9116);
                    String str3118 = (String) objArr9116[0];
                    i20 = i4;
                    i21 = i84;
                    i22 = -1;
                    String[] strArr118 = {str3114, str3115, str, str3116, str3117, str3118};
                    int i46114 = -View.getDefaultSize(0, 0);
                    int i46115 = i46114 * (-958);
                    int i46116 = ((-949378) & i46115) + (i46115 | (-949378));
                    int i46117 = ~(((-992) ^ i21) | ((-992) & i21));
                    int i46118 = ~i46114;
                    int i46119 = ~((i46118 & i18) | (i46118 ^ i18));
                    int i47110 = (i46117 & i46119) | (i46117 ^ i46119);
                    int i47111 = ~((i21 ^ i46114) | (i21 & i46114));
                    int i47112 = ((i47110 & i47111) | (i47110 ^ i47111)) * 959;
                    int i47113 = (i46116 & i47112) + (i47112 | i46116);
                    int i47114 = (~((i46114 ^ 991) | (i46114 & 991))) * (-959);
                    int i47115 = (i47113 ^ i47114) + ((i47114 & i47113) << 1);
                    int i47116 = ~((~i46114) | i21);
                    int i47117 = ~(((-992) ^ i18) | ((-992) & i18));
                    Object[] objArr9117 = new Object[1];
                    a((i47115 - (~(-(-(((~((i46114 & i18) | (i46114 ^ i18))) | ((i47116 & i47117) | (i47116 ^ i47117))) * 959))))) - 1, (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 11, (char) (62500 - KeyEvent.normalizeMetaState(0)), objArr9117);
                    String str3119 = (String) objArr9117[0];
                    int i47118 = -KeyEvent.keyCodeFromString(str5);
                    Object[] objArr9118 = new Object[1];
                    a(((i47118 | 1002) << 1) - (i47118 ^ 1002), 8 - View.resolveSize(0, 0), (char) (46206 - (~(-View.MeasureSpec.getSize(0)))), objArr9118);
                    String str4110 = (String) objArr9118[0];
                    int iResolveOpacity3 = Drawable.resolveOpacity(0, 0);
                    Object[] objArr9119 = new Object[1];
                    a((iResolveOpacity3 ^ PointerIconCompat.TYPE_ALIAS) + ((iResolveOpacity3 & PointerIconCompat.TYPE_ALIAS) << 1), 5 - (~(-TextUtils.getOffsetBefore(str5, 0))), (char) (33818 - View.MeasureSpec.makeMeasureSpec(0, 0)), objArr9119);
                    String str4111 = (String) objArr9119[0];
                    char mirror8 = AndroidCharacter.getMirror('0');
                    int i47119 = ((mirror8 | 968) << 1) - (mirror8 ^ 968);
                    int maximumFlingVelocity8 = ViewConfiguration.getMaximumFlingVelocity() >> 16;
                    Object[] objArr10110 = new Object[1];
                    a(i47119, ((maximumFlingVelocity8 | 6) << 1) - (maximumFlingVelocity8 ^ 6), (char) (0 - (~(-(-TextUtils.indexOf((CharSequence) str5, '0', 0, 0))))), objArr10110);
                    String[] strArr119 = {str3119, str4110, str4111, (String) objArr10110[0]};
                    int iArgb3 = 1022 - Color.argb(0, 0, 0, 0);
                    int capsMode3 = TextUtils.getCapsMode(str5, 0, 0);
                    Object[] objArr10111 = new Object[1];
                    a(iArgb3, ((capsMode3 | 16) << 1) - (capsMode3 ^ 16), (char) (Process.myPid() >> 22), objArr10111);
                    String str4112 = (String) objArr10111[0];
                    int mode7 = View.MeasureSpec.getMode(0);
                    int i48110 = (mode7 ^ 857) + ((mode7 & 857) << 1);
                    int i48111 = -TextUtils.indexOf(str5, str5, 0, 0);
                    int i48112 = (i48111 ^ 7) + ((i48111 & 7) << 1);
                    int i48113 = -(ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1));
                    int i48114 = i48113 * (-1939);
                    int i48115 = ((39990635 | i48114) << 1) - (39990635 ^ i48114);
                    int i48116 = ~((-41186) | i48113);
                    int i48117 = ~((i20 ^ 41185) | (i20 & 41185));
                    int i48118 = -(-(((i48116 & i48117) | (i48116 ^ i48117)) * (-970)));
                    int i48119 = ~i48113;
                    int i49110 = (((i48115 & i48118) + (i48118 | i48115)) - (~(-(-((~((41185 ^ i48119) | (41185 & i48119))) * 1940))))) - 1;
                    int i49111 = ~(i48119 | (-41186));
                    int i49112 = ~((41185 ^ i21) | (41185 & i21));
                    char c16 = (char) ((i49110 - (~(((i49111 & i49112) | (i49111 ^ i49112)) * 970))) - 1);
                    Object[] objArr10112 = new Object[1];
                    a(i48110, i48112, c16, objArr10112);
                    String str4113 = (String) objArr10112[0];
                    int packedPositionGroup4 = 825 - ExpandableListView.getPackedPositionGroup(0L);
                    int iIndexOf13 = TextUtils.indexOf((CharSequence) str5, '0') + 9;
                    int i49113 = -(-TextUtils.indexOf((CharSequence) str5, '0', 0, 0));
                    Object[] objArr10113 = new Object[1];
                    a(packedPositionGroup4, iIndexOf13, (char) (((i49113 | 1) << 1) - (i49113 ^ 1)), objArr10113);
                    String[] strArr1110 = {str4112, str4113, (String) objArr10113[0]};
                    int i49114 = -MotionEvent.axisFromString(str5);
                    int i49115 = (i49114 ^ 1037) + ((i49114 & 1037) << 1);
                    int i49116 = -TextUtils.lastIndexOf(str5, '0');
                    int i49117 = ((i49116 | 13) << 1) - (i49116 ^ 13);
                    int i49118 = -Process.getGidForName(str5);
                    Object[] objArr10114 = new Object[1];
                    a(i49115, i49117, (char) (((64362 | i49118) << 1) - (i49118 ^ 64362)), objArr10114);
                    String str4114 = (String) objArr10114[0];
                    int i49119 = -MotionEvent.axisFromString(str5);
                    Object[] objArr10115 = new Object[1];
                    a((i49119 ^ 1051) + ((i49119 & 1051) << 1), -TextUtils.lastIndexOf(str5, '0', 0), (char) (40740 - (ViewConfiguration.getTouchSlop() >> 8)), objArr10115);
                    String[] strArr1111 = {str4114, (String) objArr10115[0]};
                    int i50110 = -(-Process.getGidForName(str5));
                    int i50111 = (i50110 ^ 1054) + ((i50110 & 1054) << 1);
                    int i50112 = -(KeyEvent.getMaxKeyCode() >> 16);
                    Object[] objArr10116 = new Object[1];
                    a(i50111, (i50112 ^ 9) + ((i50112 & 9) << 1), (char) (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), objArr10116);
                    String str4115 = (String) objArr10116[0];
                    int iLastIndexOf8 = TextUtils.lastIndexOf(str5, '0', 0, 0);
                    int i50113 = ((iLastIndexOf8 | 1063) << 1) - (iLastIndexOf8 ^ 1063);
                    int i50114 = 0 - (~TextUtils.indexOf(str5, str5, 0, 0));
                    int i50115 = -TextUtils.indexOf(str5, str5, 0);
                    Object[] objArr10117 = new Object[1];
                    a(i50113, i50114, (char) ((57643 ^ i50115) + ((i50115 & 57643) << 1)), objArr10117);
                    String[] strArr2110 = {str4115, (String) objArr10117[0]};
                    Object[] objArr10118 = new Object[1];
                    a(1063 - (~(-(SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)))), 14 - (~(-ImageFormat.getBitsPerPixel(0))), (char) (ViewConfiguration.getMinimumFlingVelocity() >> 16), objArr10118);
                    String str4116 = (String) objArr10118[0];
                    int size7 = 905 - View.MeasureSpec.getSize(0);
                    int i50116 = -(-((byte) KeyEvent.getModifierMetaStateMask()));
                    Object[] objArr10119 = new Object[1];
                    a(size7, (i50116 ^ 4) + ((i50116 & 4) << 1), (char) (Color.red(0) + 35701), objArr10119);
                    String str4117 = (String) objArr10119[0];
                    int i50117 = -ImageFormat.getBitsPerPixel(0);
                    Object[] objArr11110 = new Object[1];
                    a((i50117 ^ 849) + ((i50117 & 849) << 1), (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 6, (char) Color.argb(0, 0, 0, 0), objArr11110);
                    String str4118 = (String) objArr11110[0];
                    int packedPositionType3 = ExpandableListView.getPackedPositionType(0L);
                    int i50118 = (packedPositionType3 ^ 1079) + ((packedPositionType3 & 1079) << 1);
                    int iIndexOf14 = TextUtils.indexOf(str5, str5);
                    int i50119 = (iIndexOf14 & 8) + (iIndexOf14 | 8);
                    int keyRepeatDelay5 = ViewConfiguration.getKeyRepeatDelay() >> 16;
                    Object[] objArr11111 = new Object[1];
                    a(i50118, i50119, (char) ((keyRepeatDelay5 & 7130) + (keyRepeatDelay5 | 7130)), objArr11111);
                    String str4119 = (String) objArr11111[0];
                    int i51110 = 863 - (~(-View.MeasureSpec.getMode(0)));
                    int i51111 = -(ViewConfiguration.getDoubleTapTimeout() >> 16);
                    Object[] objArr11112 = new Object[1];
                    a(i51110, (i51111 & 11) + (i51111 | 11), (char) ((ViewConfiguration.getPressedStateDuration() >> 16) + 26797), objArr11112);
                    String str5110 = (String) objArr11112[0];
                    Object[] objArr11113 = new Object[1];
                    a(875 - TextUtils.getCapsMode(str5, 0, 0), 13 - (~(-Drawable.resolveOpacity(0, 0))), (char) Color.argb(0, 0, 0, 0), objArr11113);
                    String[] strArr2111 = {str4116, str4117, str4118, str4119, str5110, (String) objArr11113[0]};
                    int i51112 = 1085 - (~(-TextUtils.indexOf((CharSequence) str5, '0')));
                    int i51113 = -(-TextUtils.indexOf((CharSequence) str5, '0', 0));
                    Object[] objArr11114 = new Object[1];
                    a(i51112, (i51113 & 21) + (i51113 | 21), (char) TextUtils.indexOf(str5, str5), objArr11114);
                    String str5111 = (String) objArr11114[0];
                    int i51114 = -(Process.myPid() >> 22);
                    int iTuitionPaymentFragmentspecialinlinedviewModeldefault17 = AudioSourceExternalSyntheticLambda9.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                    int i51115 = (i51114 * (-300)) + 334314;
                    int i51116 = (i51114 ^ 1107) | (i51114 & 1107);
                    int i51117 = -(-((~((i51116 & iTuitionPaymentFragmentspecialinlinedviewModeldefault17) | (i51116 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault17))) * (-301)));
                    int i51118 = (i51115 & i51117) + (i51115 | i51117);
                    int i51119 = ~(((-1108) ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault17) | ((-1108) & iTuitionPaymentFragmentspecialinlinedviewModeldefault17));
                    int i52110 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault17;
                    int i52111 = ~((i52110 & i51114) | (i52110 ^ i51114));
                    int i52112 = (i51118 - (~(-(-(((i51119 & i52111) | (i51119 ^ i52111)) * (-301)))))) - 1;
                    int i52113 = ~i51114;
                    int i52114 = ~((i52113 & iTuitionPaymentFragmentspecialinlinedviewModeldefault17) | (i52113 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault17));
                    int i52115 = ((i52114 & (-1108)) | ((-1108) ^ i52114)) * 301;
                    int i52116 = (i52112 & i52115) + (i52115 | i52112);
                    int i52117 = -TextUtils.indexOf(str5, str5, 0, 0);
                    Object[] objArr11115 = new Object[1];
                    a(i52116, (i52117 ^ 19) + ((i52117 & 19) << 1), (char) TextUtils.indexOf(str5, str5), objArr11115);
                    String str5112 = (String) objArr11115[0];
                    int i52118 = -TextUtils.lastIndexOf(str5, '0', 0);
                    Object[] objArr11116 = new Object[1];
                    a((i52118 & 1125) + (i52118 | 1125), TextUtils.indexOf((CharSequence) str5, '0', 0, 0) + 32, (char) (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), objArr11116);
                    String str5113 = (String) objArr11116[0];
                    int i52119 = -KeyEvent.keyCodeFromString(str5);
                    int i53110 = (i52119 ^ 1157) + ((i52119 & 1157) << 1);
                    int i53111 = -(Process.myTid() >> 22);
                    int i53112 = (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1));
                    Object[] objArr11117 = new Object[1];
                    a(i53110, (i53111 ^ 26) + ((i53111 & 26) << 1), (char) ((i53112 & 2734) + (i53112 | 2734)), objArr11117);
                    String str5114 = (String) objArr11117[0];
                    int i53113 = -(-Drawable.resolveOpacity(0, 0));
                    int i53114 = (i53113 ^ 1183) + ((i53113 & 1183) << 1);
                    int i53115 = -(-(ViewConfiguration.getScrollDefaultDelay() >> 16));
                    Object[] objArr11118 = new Object[1];
                    a(i53114, (i53115 & 23) + (i53115 | 23), (char) (25628 - TextUtils.indexOf((CharSequence) str5, '0', 0, 0)), objArr11118);
                    String str5115 = (String) objArr11118[0];
                    Object[] objArr11119 = new Object[1];
                    a(1205 - (~(-(-(ViewConfiguration.getKeyRepeatDelay() >> 16)))), 33 - Color.green(0), (char) (38339 - KeyEvent.keyCodeFromString(str5)), objArr11119);
                    String[] strArr2112 = {str5111, str5112, str5113, str5114, str5115, (String) objArr11119[0], str};
                    int i53116 = 1238 - (~(ViewConfiguration.getPressedStateDuration() >> 16));
                    int i53117 = -View.resolveSize(0, 0);
                    Object[] objArr12110 = new Object[1];
                    a(i53116, (i53117 ^ 13) + ((i53117 & 13) << 1), (char) (ViewConfiguration.getEdgeSlop() >> 16), objArr12110);
                    String str5116 = (String) objArr12110[0];
                    int i53118 = 817 - (~(-(KeyEvent.getMaxKeyCode() >> 16)));
                    int defaultSize3 = View.getDefaultSize(0, 0);
                    Object[] objArr12111 = new Object[1];
                    a(i53118, (defaultSize3 & 7) + (defaultSize3 | 7), (char) ((-1) - TextUtils.lastIndexOf(str5, '0')), objArr12111);
                    String[] strArr2113 = {str5116, (String) objArr12111[0]};
                    int i53119 = -(-(ViewConfiguration.getPressedStateDuration() >> 16));
                    int i54110 = (i53119 ^ 1252) + ((i53119 & 1252) << 1);
                    int i54111 = -(-(ViewConfiguration.getMaximumDrawingCacheSize() >> 24));
                    Object[] objArr12112 = new Object[1];
                    a(i54110, ((i54111 | 30) << 1) - (i54111 ^ 30), (char) (4319 - (~(-(SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1))))), objArr12112);
                    String str5117 = (String) objArr12112[0];
                    Object[] objArr12113 = new Object[1];
                    a(1281 - (~(-(-TextUtils.getOffsetAfter(str5, 0)))), 10 - (~(-(Process.myPid() >> 22))), (char) Drawable.resolveOpacity(0, 0), objArr12113);
                    String[] strArr2114 = {str5117, (String) objArr12113[0]};
                    int i54112 = -(-(ViewConfiguration.getMaximumDrawingCacheSize() >> 24));
                    int i54113 = (i54112 ^ 1293) + ((i54112 & 1293) << 1);
                    int i54114 = -(ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1));
                    Object[] objArr12114 = new Object[1];
                    a(i54113, (i54114 ^ 20) + ((i54114 & 20) << 1), (char) Color.red(0), objArr12114);
                    String str5118 = (String) objArr12114[0];
                    int gidForName4 = Process.getGidForName(str5) + 1313;
                    int i54115 = -Color.alpha(0);
                    Object[] objArr12115 = new Object[1];
                    a(gidForName4, (i54115 & 5) + (i54115 | 5), (char) KeyEvent.normalizeMetaState(0), objArr12115);
                    String[] strArr2115 = {str5118, (String) objArr12115[0]};
                    int iRgb8 = (-16775899) - Color.rgb(0, 0, 0);
                    int i54116 = -TextUtils.indexOf((CharSequence) str5, '0');
                    Object[] objArr12116 = new Object[1];
                    a(iRgb8, ((i54116 | 18) << 1) - (i54116 ^ 18), (char) (3383 - (~(-TextUtils.lastIndexOf(str5, '0')))), objArr12116);
                    String[] strArr2116 = {(String) objArr12116[0]};
                    int pressedStateDuration4 = ViewConfiguration.getPressedStateDuration() >> 16;
                    int i54117 = ((pressedStateDuration4 | 1336) << 1) - (pressedStateDuration4 ^ 1336);
                    int i54118 = -(-((byte) KeyEvent.getModifierMetaStateMask()));
                    Object[] objArr12117 = new Object[1];
                    a(i54117, (i54118 ^ 17) + ((i54118 & 17) << 1), (char) (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), objArr12117);
                    String[] strArr2117 = {(String) objArr12117[0]};
                    int iLastIndexOf9 = TextUtils.lastIndexOf(str5, '0', 0);
                    int iTuitionPaymentFragmentspecialinlinedviewModeldefault18 = AudioSourceExternalSyntheticLambda9.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                    int i54119 = iLastIndexOf9 * (-183);
                    int i55110 = ((250305 | i54119) << 1) - (i54119 ^ 250305);
                    int i55111 = ~iLastIndexOf9;
                    int i55112 = ~((i55111 ^ 1353) | (i55111 & 1353));
                    int i55113 = ~((~iTuitionPaymentFragmentspecialinlinedviewModeldefault18) | 1353);
                    int i55114 = ~((iLastIndexOf9 & (-1354)) | ((-1354) ^ iLastIndexOf9));
                    int i55115 = i55110 + (((i55112 & i55113) | (i55112 ^ i55113)) * 184) + (((i55114 & iTuitionPaymentFragmentspecialinlinedviewModeldefault18) | (iTuitionPaymentFragmentspecialinlinedviewModeldefault18 ^ i55114)) * (-184));
                    int i55116 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault18;
                    int i55117 = i55115 + ((~((i55116 & i55111) | (i55111 ^ i55116))) * 184);
                    int jumpTapTimeout4 = ViewConfiguration.getJumpTapTimeout() >> 16;
                    int i55118 = ((jumpTapTimeout4 | 19) << 1) - (jumpTapTimeout4 ^ 19);
                    int i55119 = (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1));
                    int iTuitionPaymentFragmentspecialinlinedviewModeldefault19 = AudioSourceExternalSyntheticLambda9.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                    int i56110 = (i55119 * 371) - 371;
                    int i56111 = ~(~iTuitionPaymentFragmentspecialinlinedviewModeldefault19);
                    int i56112 = ~i55119;
                    int i56113 = ~(i56112 | iTuitionPaymentFragmentspecialinlinedviewModeldefault19);
                    int i56114 = -(-(((i56111 & i56113) | (i56111 ^ i56113)) * (-370)));
                    int i56115 = ((i56110 | i56114) << 1) - (i56110 ^ i56114);
                    int i56116 = ~((~i55119) | (~iTuitionPaymentFragmentspecialinlinedviewModeldefault19));
                    int i56117 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault19;
                    char c17 = (char) ((((i56115 - (~(((i56117 & i56116) | (i56116 ^ i56117)) * (-370)))) - 1) - (~((~(i55119 | i56112)) * 370))) - 1);
                    Object[] objArr12118 = new Object[1];
                    a(i55117, i55118, c17, objArr12118);
                    String[] strArr2118 = {(String) objArr12118[0]};
                    int offsetBefore4 = 1371 - TextUtils.getOffsetBefore(str5, 0);
                    int iGreen3 = Color.green(0) + 19;
                    int iIndexOf15 = TextUtils.indexOf(str5, str5, 0);
                    int iTuitionPaymentFragmentspecialinlinedviewModeldefault110 = AudioSourceExternalSyntheticLambda9.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                    int i56118 = iIndexOf15 * (-317);
                    int i56119 = (8101324 & i56118) + (i56118 | 8101324);
                    int i57110 = ~iIndexOf15;
                    int i57111 = ~((i57110 ^ (-25397)) | (i57110 & (-25397)) | iTuitionPaymentFragmentspecialinlinedviewModeldefault110);
                    int i57112 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault110;
                    int i57113 = (i57112 & iIndexOf15) | (i57112 ^ iIndexOf15);
                    int i57114 = ~((i57113 & 25396) | (i57113 ^ 25396));
                    int i57115 = -(-(((i57111 & i57114) | (i57111 ^ i57114)) * (-318)));
                    int i57116 = (i56119 ^ i57115) + ((i56119 & i57115) << 1);
                    int i57117 = ~(((-25397) ^ iIndexOf15) | ((-25397) & iIndexOf15));
                    int i57118 = ~((iIndexOf15 & iTuitionPaymentFragmentspecialinlinedviewModeldefault110) | (iIndexOf15 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault110));
                    int i57119 = ((i57118 & i57117) | (i57117 ^ i57118)) * (-318);
                    int i58110 = ((i57116 | i57119) << 1) - (i57119 ^ i57116);
                    int i58111 = ~((iTuitionPaymentFragmentspecialinlinedviewModeldefault110 & i57110) | (i57110 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault110));
                    int i58112 = ((i58111 & (-25397)) | ((-25397) ^ i58111)) * TypedValues.AttributesType.TYPE_PIVOT_TARGET;
                    Object[] objArr12119 = new Object[1];
                    a(offsetBefore4, iGreen3, (char) ((i58110 & i58112) + (i58112 | i58110)), objArr12119);
                    String[] strArr2119 = {(String) objArr12119[0]};
                    int i58113 = 1390 - (~((byte) KeyEvent.getModifierMetaStateMask()));
                    int iRed4 = Color.red(0);
                    Object[] objArr13110 = new Object[1];
                    a(i58113, (iRed4 & 23) + (iRed4 | 23), (char) ExpandableListView.getPackedPositionType(0L), objArr13110);
                    String[] strArr3110 = {(String) objArr13110[0]};
                    int i58114 = 1413 - (~TextUtils.lastIndexOf(str5, '0', 0));
                    int iAlpha7 = Color.alpha(0);
                    Object[] objArr13111 = new Object[1];
                    a(i58114, ((iAlpha7 | 21) << 1) - (iAlpha7 ^ 21), (char) (Process.myPid() >> 22), objArr13111);
                    String[] strArr3111 = {(String) objArr13111[0]};
                    int packedPositionChild3 = ExpandableListView.getPackedPositionChild(0L) + 1435;
                    int i58115 = -((Process.getThreadPriority(0) + 20) >> 6);
                    Object[] objArr13112 = new Object[1];
                    a(packedPositionChild3, (i58115 ^ 24) + ((i58115 & 24) << 1), (char) TextUtils.getCapsMode(str5, 0, 0), objArr13112);
                    String str5119 = str;
                    String[] strArr3112 = {(String) objArr13112[0], str5119};
                    int i58116 = -(ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1));
                    int i58117 = (i58116 ^ 1459) + ((i58116 & 1459) << 1);
                    int i58118 = -(SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1));
                    int threadPriority6 = Process.getThreadPriority(0);
                    Object[] objArr13113 = new Object[1];
                    a(i58117, (i58118 ^ 29) + ((i58118 & 29) << 1), (char) (((threadPriority6 & 20) + (threadPriority6 | 20)) >> 6), objArr13113);
                    String[] strArr3113 = {(String) objArr13113[0], str5119};
                    Object[] objArr13114 = new Object[1];
                    a(1485 - (~(-(-View.combineMeasuredStates(0, 0)))), 25 - (~(-(-(SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))))), (char) TextUtils.indexOf(str5, str5, 0, 0), objArr13114);
                    String[] strArr3114 = {(String) objArr13114[0], str5119};
                    int maximumDrawingCacheSize3 = ViewConfiguration.getMaximumDrawingCacheSize() >> 24;
                    int i58119 = (maximumDrawingCacheSize3 ^ 1513) + ((maximumDrawingCacheSize3 & 1513) << 1);
                    int i59110 = -AndroidCharacter.getMirror('0');
                    int i59111 = -TextUtils.indexOf(str5, str5, 0, 0);
                    Object[] objArr13115 = new Object[1];
                    a(i58119, (i59110 ^ 79) + ((i59110 & 79) << 1), (char) ((45849 & i59111) + (i59111 | 45849)), objArr13115);
                    String[] strArr3115 = {(String) objArr13115[0], str5119};
                    int i59112 = 1543 - (~(-Color.blue(0)));
                    int i59113 = -TextUtils.lastIndexOf(str5, '0', 0, 0);
                    Object[] objArr13116 = new Object[1];
                    a(i59112, (i59113 ^ 26) + ((i59113 & 26) << 1), (char) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 59420), objArr13116);
                    String[] strArr3116 = {(String) objArr13116[0], str5119};
                    int i59114 = 1570 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1));
                    int maxKeyCode4 = KeyEvent.getMaxKeyCode() >> 16;
                    int i59115 = ~maxKeyCode4;
                    int i59116 = (((maxKeyCode4 * (-575)) - 18400) - (~(((~((i59115 ^ (-33)) | (i59115 & (-33)))) | (~(((-33) ^ i18) | ((-33) & i18)))) * 576))) - 1;
                    int i59117 = ~((i59115 & 32) | (i59115 ^ 32));
                    int i59118 = ((-33) ^ i21) | ((-33) & i21);
                    int i59119 = ~((i59118 & maxKeyCode4) | (i59118 ^ maxKeyCode4));
                    int i6017 = ((i59117 & i59119) | (i59117 ^ i59119)) * 576;
                    int i6018 = ~maxKeyCode4;
                    Object[] objArr13117 = new Object[1];
                    a(i59114, (i59116 & i6017) + (i59116 | i6017) + ((~((i6018 & (-33)) | (i6018 ^ (-33)))) * 576), (char) (ViewConfiguration.getFadingEdgeLength() >> 16), objArr13117);
                    strArr2 = new String[][]{strArr116, strArr117, strArr118, strArr119, strArr1110, strArr1111, strArr2110, strArr2111, strArr2112, strArr2113, strArr2114, strArr2115, strArr2116, strArr2117, strArr2118, strArr2119, strArr3110, strArr3111, strArr3112, strArr3113, strArr3114, strArr3115, strArr3116, new String[]{(String) objArr13117[0], str5119}};
                    int i6019 = -(-ExpandableListView.getPackedPositionGroup(0L));
                    int i60110 = (i6019 ^ 1603) + ((i6019 & 1603) << 1);
                    int i60111 = -((byte) KeyEvent.getModifierMetaStateMask());
                    i23 = 0;
                    int iLastIndexOf10 = TextUtils.lastIndexOf(str5, '0', 0, 0);
                    char c18 = (char) ((iLastIndexOf10 ^ 1) + ((iLastIndexOf10 & 1) << 1));
                    Object[] objArr13118 = new Object[1];
                    a(i60110, i60111, c18, objArr13118);
                    sb = new StringBuilder((String) objArr13118[0]);
                    i24 = i18;
                    i25 = 0;
                    i26 = 0;
                    while (i25 < 24) {
                        String[] strArr3117 = strArr2[i25];
                        Object[] objArr13119 = {strArr3117[i23]};
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1333629456);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                            char cIndexOf5 = (char) (33602 - TextUtils.indexOf(str5, str5, i23, i23));
                            int maximumFlingVelocity9 = (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 3085;
                            int deadChar3 = KeyEvent.getDeadChar(i23, i23) + 26;
                            byte b47 = (byte) i23;
                            byte b48 = (byte) (b47 + 1);
                            Object[] objArr1410 = new Object[1];
                            b(b47, b48, (byte) (-b48), objArr1410);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cIndexOf5, maximumFlingVelocity9, deadChar3, 1411172903, false, (String) objArr1410[0], new Class[]{String.class});
                        }
                        str6 = (String) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr13119);
                        String[] strArr3118 = (String[]) Arrays.copyOfRange(strArr3117, 1, strArr3117.length);
                        if (str6 == null) {
                        }
                        i25++;
                        strArr2 = strArr2;
                        i21 = i21;
                        i382 = i382;
                        i23 = 0;
                    }
                    int i62110 = i382;
                    i27 = i21;
                    int i62111 = -TextUtils.lastIndexOf(str5, '0');
                    Object[] objArr1411 = new Object[1];
                    a(((i62111 | 1606) << 1) - (i62111 ^ 1606), (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), (char) ((Process.getThreadPriority(0) + 20) >> 6), objArr1411);
                    sb.append((String) objArr1411[0]);
                    if (i26 > 2) {
                        int i62112 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                        int i62113 = (i62112 & 1) + (i62112 | 1);
                        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i62113 % 128;
                        int i62114 = i62113 % 2;
                        String[] strArr3119 = {sb.toString()};
                        ((int[]) objArr[0])[0] = i24;
                        objArr = new Object[]{new int[1], strArr3119};
                        c2 = 0;
                    } else {
                        objArr = new Object[]{new int[]{i18}, new String[0]};
                        int i62115 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                        int i62116 = ((i62115 | 97) << 1) - (i62115 ^ 97);
                        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i62116 % 128;
                        int i62117 = i62116 % 2;
                        c2 = 0;
                    }
                    int i62118 = ((int[]) objArr[c2])[c2];
                    int i62119 = ((~i62110) & i18) | (i62110 & i27);
                    int i6310 = -i62119;
                    int i6311 = ((i62119 & i6310) | (i62119 ^ i6310)) >> 31;
                    int i6312 = i62118 & (~i6311);
                    int i6313 = i62110 & i6311;
                    i382 = (i6313 & i6312) | (i6312 ^ i6313);
                    strArr3 = (String[]) objArr[1];
                }
                int iLastIndexOf11 = TextUtils.lastIndexOf(str5, '0') + 890;
                int maximumFlingVelocity10 = (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 16;
                int i640 = -(ViewConfiguration.getScrollBarFadeDuration() >> 16);
                Object[] objArr150 = new Object[1];
                a(iLastIndexOf11, maximumFlingVelocity10, (char) (((i640 | 13996) << 1) - (i640 ^ 13996)), objArr150);
                Object[] objArr151 = {(String) objArr150[0]};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault26 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1333629456);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault26 == null) {
                    char jumpTapTimeout5 = (char) ((ViewConfiguration.getJumpTapTimeout() >> 16) + 33602);
                    int i641 = (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 3084;
                    int i642 = (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 25;
                    byte b49 = (byte) 0;
                    byte b50 = (byte) (b49 + 1);
                    Object[] objArr152 = new Object[1];
                    b(b49, b50, (byte) (-b50), objArr152);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault26 = initSession.b(jumpTapTimeout5, i641, i642, 1411172903, false, (String) objArr152[0], new Class[]{String.class});
                }
                Object objInvoke2 = ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault26).invoke(null, objArr151);
                if (objInvoke2 == null) {
                    int i643 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 55;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i643 % 128;
                    int i644 = i643 % 2;
                    i29 = 0;
                } else {
                    Object[] objArr153 = {objInvoke2, 42};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault27 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1557991223);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault27 == null) {
                        char c19 = (char) (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
                        int keyRepeatTimeout2 = 3393 - (ViewConfiguration.getKeyRepeatTimeout() >> 16);
                        int i645 = 9 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
                        byte b51 = (byte) 0;
                        byte b52 = (byte) (b51 + 1);
                        Object[] objArr154 = new Object[1];
                        b(b51, b52, (byte) (-b52), objArr154);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault27 = initSession.b(c19, keyRepeatTimeout2, i645, 1203525406, false, (String) objArr154[0], new Class[]{String.class, Integer.TYPE});
                    }
                    long jLongValue17 = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault27).invoke(null, objArr153)).longValue();
                    long j105 = 78739266;
                    long j106 = -495;
                    long j107 = j105 ^ j;
                    long jFreeMemory2 = (int) Runtime.getRuntime().freeMemory();
                    long j108 = ((j107 | (jLongValue17 ^ j)) ^ j) | ((j107 | jFreeMemory2) ^ j);
                    long j109 = (j106 * j105) + (j106 * jLongValue17) + (((long) 992) * j108) + (((long) (-496)) * (((((jFreeMemory2 ^ j) | j105) | jLongValue17) ^ j) | j108)) + (((long) 496) * (jFreeMemory2 | jLongValue17)) + ((long) (-80809143));
                    int iUptimeMillis3 = (int) SystemClock.uptimeMillis();
                    int i646 = ~iUptimeMillis3;
                    int i647 = ((int) (j109 >> 32)) & (1871737038 + (((~(220049388 | i646)) | (~((-1657275800) | iUptimeMillis3))) * 1900) + (((~(i646 | 1657275799)) | (~((-220049389) | iUptimeMillis3))) * (-950)) + (((~(iUptimeMillis3 | 1657275799)) | (~(i646 | (-220049389)))) * 950));
                    int iMaxMemory3 = (int) Runtime.getRuntime().maxMemory();
                    int i648 = (~((-1808315542) | iMaxMemory3)) | 713602176;
                    int i649 = ((int) j109) & ((-1537497691) + (i648 * 992) + ((i648 | (~((~iMaxMemory3) | 2144138709))) * (-496)) + ((iMaxMemory3 | 1049425344) * 496));
                    i29 = (i647 & i649) | (i647 ^ i649);
                }
                if (i29 == 1986687685 || i29 == -1514516938) {
                    i16 = i;
                    i30 = i382;
                } else {
                    int i650 = 19;
                    int scrollBarFadeDuration5 = ViewConfiguration.getScrollBarFadeDuration() >> 16;
                    Object[] objArr155 = new Object[1];
                    a((scrollBarFadeDuration5 ^ 1608) + ((scrollBarFadeDuration5 & 1608) << 1), 13 - (~(KeyEvent.getMaxKeyCode() >> 16)), (char) Drawable.resolveOpacity(0, 0), objArr155);
                    Object[] objArr156 = new Object[1];
                    a((ViewConfiguration.getScrollDefaultDelay() >> 16) + 1622, 25 - (~(ViewConfiguration.getFadingEdgeLength() >> 16)), (char) Gravity.getAbsoluteGravity(0, 0), objArr156);
                    int capsMode4 = TextUtils.getCapsMode(str5, 0, 0);
                    int i651 = (capsMode4 ^ 1648) + ((capsMode4 & 1648) << 1);
                    int i652 = -(ViewConfiguration.getTapTimeout() >> 16);
                    int i653 = (i652 & 17) + (i652 | 17);
                    int i654 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 57;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i654 % 128;
                    int i655 = i654 % 2;
                    Object[] objArr157 = new Object[1];
                    a(i651, i653, (char) ((-1) - TextUtils.lastIndexOf(str5, '0')), objArr157);
                    int capsMode5 = 1665 - TextUtils.getCapsMode(str5, 0, 0);
                    int i656 = -(ViewConfiguration.getScrollBarFadeDuration() >> 16);
                    Object[] objArr158 = new Object[1];
                    a(capsMode5, (i656 ^ 17) + ((i656 & 17) << 1), (char) TextUtils.getOffsetBefore(str5, 0), objArr158);
                    int i657 = -(-TextUtils.lastIndexOf(str5, '0'));
                    int i658 = -(TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1));
                    Object[] objArr159 = new Object[1];
                    a(((i657 | 1683) << 1) - (i657 ^ 1683), ((i658 | 15) << 1) - (i658 ^ 15), (char) View.resolveSizeAndState(0, 0, 0), objArr159);
                    int i659 = -(-(CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)));
                    int capsMode6 = TextUtils.getCapsMode(str5, 0, 0);
                    int i660 = (capsMode6 & 37) + (capsMode6 | 37);
                    int iAlpha8 = Color.alpha(0);
                    Object[] objArr160 = new Object[1];
                    a((i659 ^ 1697) + ((i659 & 1697) << 1), i660, (char) ((iAlpha8 & 43960) + (iAlpha8 | 43960)), objArr160);
                    int i661 = -TextUtils.indexOf((CharSequence) str5, '0', 0, 0);
                    int i662 = (i661 & 1733) + (i661 | 1733);
                    int i663 = 10 - (~(-(ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))));
                    int i664 = -Process.getGidForName(str5);
                    Object[] objArr161 = new Object[1];
                    a(i662, i663, (char) ((i664 ^ (-1)) + (i664 << 1)), objArr161);
                    int i665 = -(-Color.blue(0));
                    int i666 = (i665 & 1746) + (i665 | 1746);
                    int i667 = -((byte) KeyEvent.getModifierMetaStateMask());
                    Object[] objArr162 = new Object[1];
                    a(i666, (i667 & 12) + (i667 | 12), (char) (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), objArr162);
                    int packedPositionGroup5 = 1759 - ExpandableListView.getPackedPositionGroup(0L);
                    int i668 = -(SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1));
                    int i669 = (i668 & 23) + (i668 | 23);
                    int i670 = -(-(ViewConfiguration.getKeyRepeatDelay() >> 16));
                    Object[] objArr163 = new Object[1];
                    a(packedPositionGroup5, i669, (char) (((i670 | 21016) << 1) - (i670 ^ 21016)), objArr163);
                    int iKeyCodeFromString3 = KeyEvent.keyCodeFromString(str5);
                    int i671 = (iKeyCodeFromString3 & 1781) + (iKeyCodeFromString3 | 1781);
                    int i672 = -(-View.resolveSize(0, 0));
                    Object[] objArr164 = new Object[1];
                    a(i671, (i672 ^ 31) + ((i672 & 31) << 1), (char) (View.MeasureSpec.getMode(0) + 11911), objArr164);
                    int i673 = -(ViewConfiguration.getWindowTouchSlop() >> 8);
                    int i674 = (i673 & 1812) + (i673 | 1812);
                    int i675 = -TextUtils.getTrimmedLength(str5);
                    Object[] objArr165 = new Object[1];
                    a(i674, (i675 ^ 12) + ((i675 & 12) << 1), (char) View.combineMeasuredStates(0, 0), objArr165);
                    int bitsPerPixel4 = ImageFormat.getBitsPerPixel(0) + 1825;
                    int i676 = -(ViewConfiguration.getDoubleTapTimeout() >> 16);
                    int i677 = (i676 & 12) + (i676 | 12);
                    int i678 = -View.MeasureSpec.getMode(0);
                    Object[] objArr166 = new Object[1];
                    a(bitsPerPixel4, i677, (char) ((i678 & 32867) + (i678 | 32867)), objArr166);
                    Object[] objArr167 = new Object[1];
                    a(1835 - (~(-(-View.MeasureSpec.makeMeasureSpec(0, 0)))), 11 - (~(-(-(ViewConfiguration.getPressedStateDuration() >> 16)))), (char) (63349 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))), objArr167);
                    int i679 = -ExpandableListView.getPackedPositionChild(0L);
                    int i680 = (i679 ^ 1847) + ((i679 & 1847) << 1);
                    int iCombineMeasuredStates2 = View.combineMeasuredStates(0, 0);
                    int i681 = ((iCombineMeasuredStates2 | 12) << 1) - (iCombineMeasuredStates2 ^ 12);
                    byte modifierMetaStateMask6 = (byte) KeyEvent.getModifierMetaStateMask();
                    int i682 = ~modifierMetaStateMask6;
                    i16 = i;
                    int i683 = ((modifierMetaStateMask6 * (-520)) - (-4739238)) + ((~((i682 & 9079) | (i682 ^ 9079) | i16)) * 521);
                    int i684 = ((-9080) & modifierMetaStateMask6) | ((-9080) ^ modifierMetaStateMask6);
                    int i685 = -(-((~i684) * (-1042)));
                    int i686 = (i683 & i685) + (i683 | i685);
                    int i687 = ~i684;
                    int i688 = ~modifierMetaStateMask6;
                    int i689 = (i688 & i20) | (i688 ^ i20);
                    int i690 = ~((i689 & 9079) | (i689 ^ 9079));
                    Object[] objArr168 = new Object[1];
                    a(i680, i681, (char) ((i686 - (~(((i690 & i687) | (i687 ^ i690)) * 521))) - 1), objArr168);
                    int i691 = 1860 - (~(-(-Process.getGidForName(str5))));
                    int i692 = -(ViewConfiguration.getKeyRepeatDelay() >> 16);
                    Object[] objArr169 = new Object[1];
                    a(i691, ((i692 | 12) << 1) - (i692 ^ 12), (char) TextUtils.getOffsetAfter(str5, 0), objArr169);
                    Object[] objArr170 = new Object[1];
                    a(1872 - (~TextUtils.indexOf((CharSequence) str5, '0', 0)), 15 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), (char) View.getDefaultSize(0, 0), objArr170);
                    int i693 = -(-(ViewConfiguration.getFadingEdgeLength() >> 16));
                    int i694 = (i693 & 1886) + (i693 | 1886);
                    int i695 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 17;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i695 % 128;
                    int i696 = i695 % 2;
                    int i697 = -ExpandableListView.getPackedPositionChild(0L);
                    Object[] objArr171 = new Object[1];
                    a(i694, (i697 & 11) + (i697 | 11), (char) View.resolveSize(0, 0), objArr171);
                    int i698 = -View.MeasureSpec.getMode(0);
                    int i699 = (i698 ^ 1898) + ((i698 & 1898) << 1);
                    int scrollDefaultDelay5 = ViewConfiguration.getScrollDefaultDelay() >> 16;
                    Object[] objArr172 = new Object[1];
                    a(i699, (scrollDefaultDelay5 ^ 24) + ((scrollDefaultDelay5 & 24) << 1), (char) (View.MeasureSpec.getMode(0) + 29839), objArr172);
                    int modifierMetaStateMask7 = 1921 - ((byte) KeyEvent.getModifierMetaStateMask());
                    int maximumDrawingCacheSize4 = ViewConfiguration.getMaximumDrawingCacheSize() >> 24;
                    Object[] objArr173 = new Object[1];
                    a(modifierMetaStateMask7, ((maximumDrawingCacheSize4 | 28) << 1) - (maximumDrawingCacheSize4 ^ 28), (char) (ViewConfiguration.getScrollBarSize() >> 8), objArr173);
                    String[] strArr40 = {(String) objArr155[0], (String) objArr156[0], (String) objArr157[0], (String) objArr158[0], (String) objArr159[0], (String) objArr160[0], (String) objArr161[0], (String) objArr162[0], (String) objArr163[0], (String) objArr164[0], (String) objArr165[0], (String) objArr166[0], (String) objArr167[0], (String) objArr168[0], (String) objArr169[0], (String) objArr170[0], (String) objArr171[0], (String) objArr172[0], (String) objArr173[0]};
                    int i700 = 0;
                    while (true) {
                        if (i700 >= i650) {
                            i700 = i22;
                            break;
                        }
                        String str61 = strArr40[i700];
                        Object[] objArr174 = {str61};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault28 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-263443444);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault28 == null) {
                            char mirror9 = (char) (AndroidCharacter.getMirror('0') - '0');
                            int deadChar4 = 993 - KeyEvent.getDeadChar(0, 0);
                            int size8 = 8 - View.MeasureSpec.getSize(0);
                            byte b53 = (byte) 0;
                            byte b54 = b53;
                            Object[] objArr175 = new Object[1];
                            b(b53, b54, (byte) (b54 - 1), objArr175);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault28 = initSession.b(mirror9, deadChar4, size8, 349342683, false, (String) objArr175[0], new Class[]{String.class});
                        }
                        long jLongValue18 = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault28).invoke(null, objArr174)).longValue();
                        long j110 = -798530681;
                        String[] strArr41 = strArr40;
                        long j111 = j110 ^ j;
                        long j112 = (((long) 302) * j110) + (((long) TypedValues.MotionType.TYPE_EASING) * jLongValue18) + (((long) (-602)) * (jLongValue18 | ((j111 | j23) ^ j))) + (((long) (-301)) * (((j111 | (jLongValue18 ^ j)) ^ j) | ((j111 | j22) ^ j) | (((j23 | j110) | jLongValue18) ^ j))) + (((long) 301) * ((j23 | jLongValue18) ^ j)) + ((long) (-48547924));
                        int i701 = ((int) (j112 >> 32)) & (1149601852 + (((~(718384051 | i27)) | (~((-713140898) | i16))) * (-831)) + ((~((-1426215937) | i16)) * (-1662)) + (((~(2139356833 | i27)) | (~((-2139356834) | i16)) | (~((-718384052) | i16))) * 831));
                        int iElapsedRealtime = (int) SystemClock.elapsedRealtime();
                        int i702 = ~iElapsedRealtime;
                        int i703 = ((int) j112) & ((-220392897) + (((~((-1256231444) | i702)) | (~((-1601509443) | iElapsedRealtime))) * 210) + (((~(iElapsedRealtime | (-8421906))) | (~(i702 | (-353699905)))) * 210));
                        if (((i701 & i703) | (i701 ^ i703)) != 0) {
                            break;
                        }
                        int maximumDrawingCacheSize5 = ViewConfiguration.getMaximumDrawingCacheSize() >> 24;
                        Object[] objArr176 = new Object[1];
                        a((maximumDrawingCacheSize5 & 1872) + (maximumDrawingCacheSize5 | 1872), 12 - (~(-TextUtils.lastIndexOf(str5, '0'))), (char) (0 - (~TextUtils.indexOf((CharSequence) str5, '0', 0, 0))), objArr176);
                        if (str61.equals((String) objArr176[0])) {
                            Object[] objArr177 = {str61};
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault29 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-263443444);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault29 == null) {
                                char cNormalizeMetaState = (char) KeyEvent.normalizeMetaState(0);
                                int i704 = 993 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1));
                                int iMyTid3 = (Process.myTid() >> 22) + 8;
                                byte b55 = (byte) 0;
                                byte b56 = b55;
                                Object[] objArr178 = new Object[1];
                                b(b55, b56, (byte) (b56 - 1), objArr178);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault29 = initSession.b(cNormalizeMetaState, i704, iMyTid3, 349342683, false, (String) objArr178[0], new Class[]{String.class});
                            }
                            long jLongValue19 = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault29).invoke(null, objArr177)).longValue();
                            long j113 = -170963372;
                            long j114 = -112;
                            long j115 = jLongValue19 ^ j;
                            long j116 = j115 | j23;
                            long j117 = j113 ^ j;
                            long j118 = (j114 * j113) + (j114 * jLongValue19) + (((long) 226) * (j113 | (j116 ^ j))) + (((long) (-113)) * (((j117 | jLongValue19) ^ j) | ((j117 | j22) ^ j) | ((j116 | j113) ^ j))) + (((long) 113) * ((j115 | j22) ^ j)) + ((long) (-676115233));
                            int i705 = ((int) (j118 >> 32)) & (1304952362 + (((~(i27 | (-1125781107))) | 1040) * 184) + ((606179712 | i16) * (-184)) + ((~(1731959778 | i27)) * 184));
                            int i706 = ((int) j118) & ((-1636680863) + (((~((-174508705) | i27)) | 1611735114 | (~((-1696146527) | i16))) * (-68)) + ((~(i27 | (-84411413))) * (-68)) + (((~(1696146526 | i27)) | (-258920117)) * 68));
                            if (((i705 & i706) | (i705 ^ i706)) != 0) {
                                break;
                            }
                        }
                        i700 = ((i700 | 1) << 1) - (i700 ^ 1);
                        strArr40 = strArr41;
                        i650 = 19;
                    }
                    int i707 = (i700 ^ 130) + ((i700 & 130) << 1);
                    int i708 = (i707 | i16) & (~(i16 & i707));
                    int i709 = ~i700;
                    int i710 = -i709;
                    int i711 = ((i709 & i710) | (i709 ^ i710)) >> 31;
                    int i712 = (i708 & i711) | ((~i711) & i16);
                    int i713 = i382;
                    int i714 = ((~i713) & i16) | (i713 & i27);
                    int i715 = (i714 | (-i714)) >> 31;
                    int i716 = i712 & (~i715);
                    int i717 = i713 & i715;
                    i30 = (i716 & i717) | (i716 ^ i717);
                }
                int keyRepeatDelay6 = 1950 - (ViewConfiguration.getKeyRepeatDelay() >> 16);
                int i718 = -(-(ViewConfiguration.getTouchSlop() >> 8));
                int i719 = -TextUtils.indexOf(str5, str5, 0);
                Object[] objArr179 = new Object[1];
                a(keyRepeatDelay6, ((i718 | 13) << 1) - (i718 ^ 13), (char) ((i719 ^ 63015) + ((i719 & 63015) << 1)), objArr179);
                String str62 = (String) objArr179[0];
                int i720 = -(ViewConfiguration.getPressedStateDuration() >> 16);
                int i721 = ((i720 | 1963) << 1) - (i720 ^ 1963);
                int mode8 = View.MeasureSpec.getMode(0);
                Object[] objArr180 = new Object[1];
                a(i721, ((mode8 | 5) << 1) - (mode8 ^ 5), (char) (20560 - TextUtils.lastIndexOf(str5, '0', 0)), objArr180);
                String[] strArr42 = {str62, (String) objArr180[0]};
                int i722 = 1967 - (~(-Color.alpha(0)));
                int i723 = -ExpandableListView.getPackedPositionGroup(0L);
                Object[] objArr181 = new Object[1];
                a(i722, ((i723 | 15) << 1) - (i723 ^ 15), (char) (54325 - TextUtils.lastIndexOf(str5, '0', 0, 0)), objArr181);
                String str63 = (String) objArr181[0];
                int maximumFlingVelocity11 = ViewConfiguration.getMaximumFlingVelocity() >> 16;
                int iTuitionPaymentFragmentspecialinlinedviewModeldefault20 = AudioSourceExternalSyntheticLambda9.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                int i724 = ~maximumFlingVelocity11;
                int i725 = i724 | (-1984);
                int i726 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault20;
                int i727 = ~((i725 & i726) | (i725 ^ i726));
                int i728 = (i724 ^ 1983) | (i724 & 1983);
                int i729 = ~((i728 & iTuitionPaymentFragmentspecialinlinedviewModeldefault20) | (i728 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault20));
                int i730 = (i727 & i729) | (i727 ^ i729);
                int i731 = ((-1984) & maximumFlingVelocity11) | ((-1984) ^ maximumFlingVelocity11);
                int i732 = ~((i731 & iTuitionPaymentFragmentspecialinlinedviewModeldefault20) | (i731 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault20));
                int i733 = (((maximumFlingVelocity11 * (-1529)) - 1515012) - (~(-(-(((i730 & i732) | (i730 ^ i732)) * 765))))) - 1;
                int i734 = ~maximumFlingVelocity11;
                int i735 = ~(i734 | (-1984));
                int i736 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault20;
                int i737 = i733 + (((~((i724 & i736) | (i724 ^ i736))) | i735) * 1530);
                int i738 = ~((iTuitionPaymentFragmentspecialinlinedviewModeldefault20 & i734) | (i734 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault20));
                int i739 = ~(maximumFlingVelocity11 | (-1984) | i726);
                int i740 = i737 + (((i739 & i738) | (i738 ^ i739)) * 765);
                int i741 = -MotionEvent.axisFromString(str5);
                Object[] objArr182 = new Object[1];
                a(i740, (i741 & 18) + (i741 | 18), (char) (TextUtils.getCapsMode(str5, 0, 0) + 8735), objArr182);
                String str64 = (String) objArr182[0];
                int i742 = 2001 - (~View.MeasureSpec.getMode(0));
                int i743 = -Color.blue(0);
                int i744 = -(-(ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)));
                Object[] objArr183 = new Object[1];
                a(i742, (i743 ^ 14) + ((i743 & 14) << 1), (char) (((i744 | 19210) << 1) - (i744 ^ 19210)), objArr183);
                String[] strArr43 = {str63, str64, (String) objArr183[0]};
                int i745 = 2015 - (~(-(-KeyEvent.getDeadChar(0, 0))));
                int iRed5 = Color.red(0);
                int i746 = ~iRed5;
                int i747 = ~((i746 ^ i27) | (i746 & i27));
                int i748 = ~((i746 & 21) | (i746 ^ 21));
                int i749 = (i748 & i747) | (i747 ^ i748);
                int i750 = ~(((-22) & iRed5) | ((-22) ^ iRed5) | i16);
                int i751 = ((iRed5 * 714) - 14952) + (((i749 & i750) | (i749 ^ i750)) * (-713));
                int i752 = (iRed5 & (-22)) | ((-22) ^ iRed5);
                int i753 = (~((i752 & i16) | (i752 ^ i16))) * 1426;
                int i754 = (i751 & i753) + (i751 | i753) + ((~(((-22) ^ i20) | ((-22) & i20))) * 713);
                int i755 = -(-KeyEvent.normalizeMetaState(0));
                Object[] objArr184 = new Object[1];
                a(i745, i754, (char) ((i755 & 7022) + (i755 | 7022)), objArr184);
                String str65 = (String) objArr184[0];
                int i756 = (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1));
                int iTuitionPaymentFragmentspecialinlinedviewModeldefault21 = AudioSourceExternalSyntheticLambda9.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                int i757 = i756 * (-464);
                int i758 = (i757 ^ (-1891444)) + ((i757 & (-1891444)) << 1);
                int i759 = ((~i756) | (~(iTuitionPaymentFragmentspecialinlinedviewModeldefault21 | 2036))) * (-465);
                int i760 = ((i758 | i759) << 1) - (i759 ^ i758);
                int i761 = ~i756;
                int i762 = ~((i761 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault21) | (i761 & iTuitionPaymentFragmentspecialinlinedviewModeldefault21));
                int i763 = ((i762 & 2036) | (i762 ^ 2036)) * 930;
                int i764 = (i760 ^ i763) + ((i763 & i760) << 1);
                int i765 = (i761 | (iTuitionPaymentFragmentspecialinlinedviewModeldefault21 & 2036) | (iTuitionPaymentFragmentspecialinlinedviewModeldefault21 ^ 2036)) * 465;
                int i766 = ((i764 | i765) << 1) - (i765 ^ i764);
                int i767 = -(Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1));
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                Object[] objArr185 = new Object[1];
                a(i766, (i767 & 11) + (i767 | 11), (char) ((iMakeMeasureSpec & 40397) + (iMakeMeasureSpec | 40397)), objArr185);
                String[] strArr44 = {str65, (String) objArr185[0]};
                Object[] objArr186 = new Object[1];
                a(2047 - (ViewConfiguration.getFadingEdgeLength() >> 16), 10 - (~(-(-KeyEvent.keyCodeFromString(str5)))), (char) (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), objArr186);
                String str66 = (String) objArr186[0];
                Object[] objArr187 = new Object[1];
                a(587 - View.resolveSizeAndState(0, 0, 0), 6 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), (char) KeyEvent.normalizeMetaState(0), objArr187);
                String[] strArr45 = {str66, (String) objArr187[0]};
                int i768 = -(ViewConfiguration.getKeyRepeatDelay() >> 16);
                int i769 = (i768 & 2058) + (i768 | 2058);
                int i770 = -Color.rgb(0, 0, 0);
                int i771 = ((i770 | (-16777188)) << 1) - (i770 ^ (-16777188));
                int i772 = -(SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1));
                Object[] objArr188 = new Object[1];
                a(i769, i771, (char) (((i772 | 27275) << 1) - (i772 ^ 27275)), objArr188);
                String str67 = (String) objArr188[0];
                int i773 = (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1));
                int i774 = (i773 & 2036) + (i773 | 2036);
                int i775 = -TextUtils.getOffsetBefore(str5, 0);
                int i776 = ((i775 | 10) << 1) - (i775 ^ 10);
                int i777 = -(-ExpandableListView.getPackedPositionGroup(0L));
                Object[] objArr189 = new Object[1];
                a(i774, i776, (char) (((i777 | 40397) << 1) - (i777 ^ 40397)), objArr189);
                char c20 = 0;
                String[][] strArr46 = {strArr42, strArr43, strArr44, strArr45, new String[]{str67, (String) objArr189[0]}};
                int i778 = 0;
                int i779 = i22;
                int i780 = 5;
                loop7: while (true) {
                    if (i778 >= i780) {
                        i31 = i30;
                        str7 = str5;
                        strArr4 = strArr3;
                        i32 = i16;
                        r5 = i780;
                        break;
                    }
                    String[] strArr47 = strArr46[i778];
                    String str68 = strArr47[c20];
                    int i781 = 1;
                    String[] strArr48 = (String[]) Arrays.copyOfRange(strArr47, 1, strArr47.length);
                    int length3 = strArr48.length;
                    int i782 = 0;
                    while (i782 < length3) {
                        int i783 = ((i779 | 54) << i781) - (i779 ^ 54);
                        i779 = ((i783 | (-53)) << i781) - (i783 ^ (-53));
                        Object[] objArr190 = {str68, strArr48[i782]};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault30 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1553143710);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault30 == null) {
                            char defaultSize4 = (char) View.getDefaultSize(0, 0);
                            int iNormalizeMetaState2 = KeyEvent.normalizeMetaState(0) + 2385;
                            int packedPositionType4 = 32 - ExpandableListView.getPackedPositionType(0L);
                            byte b57 = (byte) 0;
                            byte b58 = (byte) (b57 + 1);
                            Object[] objArr191 = new Object[1];
                            b(b57, b58, (byte) (-b58), objArr191);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault30 = initSession.b(defaultSize4, iNormalizeMetaState2, packedPositionType4, -1207062455, false, (String) objArr191[0], new Class[]{String.class, String.class});
                        }
                        long jLongValue20 = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault30).invoke(null, objArr190)).longValue();
                        long j119 = 1795511892;
                        strArr4 = strArr3;
                        long j120 = 52;
                        i31 = i30;
                        long jMyPid2 = ((long) Process.myPid()) ^ j;
                        long j121 = jMyPid2 | j119;
                        str7 = str5;
                        int i784 = i778;
                        long j122 = jLongValue20 ^ j;
                        long j123 = j119 ^ j;
                        long j124 = (((long) (-51)) * j119) + (((long) 53) * jLongValue20) + (((j121 | jLongValue20) ^ j) * j120) + (((long) (-52)) * (((j122 | jMyPid2) ^ j) | ((j122 | j119) ^ j) | (j121 ^ j))) + (j120 * (((jMyPid2 | j123) ^ j) | ((j123 | jLongValue20) ^ j))) + ((long) 181531436);
                        int startUptimeMillis2 = (int) Process.getStartUptimeMillis();
                        int i785 = ((int) (j124 >> 32)) & ((-2088991750) + ((1515575261 | startUptimeMillis2) * 376) + (((~((~startUptimeMillis2) | (-48087322))) | 39174425) * (-376)) + (((~(startUptimeMillis2 | 48087321)) | 1485313732) * 376));
                        int i786 = 810606810 + (((~(1867236919 | i27)) | (~((-1716160051) | i16))) * (-831)) + ((~(2146170559 | i16)) * (-1662));
                        int i787 = (~((-430010510) | i27)) | (~(430010509 | i16));
                        int i788 = ~((-1867236920) | i16);
                        int i789 = ((int) j124) & (i786 + ((i787 | i788) * 831));
                        if (((i785 & i789) | (i785 ^ i789)) != 0) {
                            int i790 = (i779 & 170) + (i779 | 170);
                            i32 = (i790 & i27) | ((~i790) & i16);
                            r5 = i788;
                            break loop7;
                        }
                        int i791 = (i782 & 57) + (i782 | 57);
                        i782 = (i791 & (-56)) + (i791 | (-56));
                        strArr46 = strArr46;
                        strArr48 = strArr48;
                        str68 = str68;
                        length3 = length3;
                        strArr3 = strArr4;
                        i30 = i31;
                        i778 = i784;
                        str5 = str7;
                        i781 = 1;
                    }
                    int i792 = i30;
                    int i793 = i778;
                    int i794 = (i793 ^ (-118)) + ((i793 & (-118)) << 1);
                    i778 = ((i794 | 119) << 1) - (i794 ^ 119);
                    strArr46 = strArr46;
                    i30 = i792;
                    i780 = 5;
                    c20 = 0;
                }
                int i795 = (~(i16 & i31)) & (i16 | i31);
                int i796 = -i795;
                int i797 = ((i795 & i796) | (i795 ^ i796)) >> 31;
                int i798 = i32 & (~i797);
                int i799 = i31 & i797;
                int i800 = (i798 & i799) | (i798 ^ i799);
                try {
                    try {
                        int i801 = -(ViewConfiguration.getScrollBarSize() >> 8);
                        Object[] objArr192 = new Object[1];
                        a((i801 & 2086) + (i801 | 2086), 11 - (~(AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))), (char) (View.combineMeasuredStates(0, 0) + 9573), objArr192);
                        String str69 = (String) objArr192[0];
                        int i802 = -(ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1));
                        int i803 = (i802 ^ 2098) + ((i802 & 2098) << 1);
                        int i804 = (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1));
                        int i805 = (i804 ^ 7) + ((i804 & 7) << 1);
                        int i806 = -(-KeyEvent.normalizeMetaState(0));
                        Object[] objArr193 = new Object[1];
                        a(i803, i805, (char) ((i806 ^ 1690) + ((i806 & 1690) << 1)), objArr193);
                        try {
                            Object[] objArr194 = {str69, (String) objArr193[0]};
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault31 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1553143710);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault31 == null) {
                                char bitsPerPixel5 = (char) (ImageFormat.getBitsPerPixel(0) + 1);
                                int iResolveSizeAndState = View.resolveSizeAndState(0, 0, 0) + 2385;
                                String str70 = str7;
                                try {
                                    int iIndexOf16 = 32 - TextUtils.indexOf(str70, str70, 0);
                                    byte b59 = (byte) 0;
                                    byte b60 = (byte) (b59 + 1);
                                    Object[] objArr195 = new Object[1];
                                    b(b59, b60, (byte) (-b60), objArr195);
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault31 = initSession.b(bitsPerPixel5, iResolveSizeAndState, iIndexOf16, -1207062455, false, (String) objArr195[0], new Class[]{String.class, String.class});
                                    str8 = str70;
                                } catch (Throwable th2) {
                                    th = th2;
                                    Throwable th3 = th;
                                    Throwable cause2 = th3.getCause();
                                    if (cause2 != null) {
                                        throw cause2;
                                    }
                                    throw th3;
                                }
                            } else {
                                str8 = str7;
                            }
                            long jLongValue21 = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault31).invoke(null, objArr194)).longValue();
                            long j125 = 610107656;
                            long j126 = -783;
                            long j127 = (((long) 784) * j125) + (((long) (-782)) * jLongValue21) + ((jLongValue21 ^ j) * j126);
                            long j128 = j125 ^ j;
                            long jNextInt2 = ((long) new Random().nextInt()) ^ j;
                            long j129 = j127 + (j126 * (((j128 | jNextInt2) | jLongValue21) ^ j)) + (((long) 783) * (((jLongValue21 | jNextInt2) ^ j) | j128)) + ((long) 1366935672);
                            int iNextInt2 = new Random().nextInt(776944814);
                            int i807 = ((int) (j129 >> 32)) & ((-119580654) + (((~((-1693855433) | iNextInt2)) | 547357760) * (-140)) + ((~((-1146497673) | iNextInt2)) * 70) + (((~(iNextInt2 | (-1163885453))) | 564745540) * 70));
                            int iMyPid2 = Process.myPid();
                            int i808 = ~iMyPid2;
                            int i809 = ((int) j129) & ((-1870870276) + ((283626749 | iMyPid2) * (-859)) + (((~(iMyPid2 | (-275106905))) | (~(283626749 | i808))) * 859) + (((~(1720853159 | i808)) | (-1995960064)) * 859));
                            if (((i807 & i809) | (i807 ^ i809)) != 0) {
                                i33 = (i16 & (-151)) | (i27 & 150);
                                r6 = str8;
                            } else {
                                i33 = i16;
                                r6 = str8;
                            }
                        } catch (Throwable th4) {
                            th = th4;
                        }
                    } catch (Exception unused) {
                        i33 = i16 ^ 151;
                        r6 = r5;
                    }
                } catch (Exception unused2) {
                    r5 = str7;
                    i33 = i16 ^ 151;
                    r6 = r5;
                }
                int i810 = i16 ^ i800;
                int i811 = -i810;
                int i812 = ((i810 & i811) | (i810 ^ i811)) >> 31;
                int i813 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                int i814 = ((i813 | 23) << 1) - (i813 ^ 23);
                TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i814 % 128;
                int i815 = i814 % 2;
                int i816 = i33 & (~i812);
                int i817 = i800 & i812;
                int i818 = (i817 & i816) | (i816 ^ i817);
                int i819 = 2107 - (~ImageFormat.getBitsPerPixel(0));
                int i820 = -(ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1));
                Object[] objArr196 = new Object[1];
                a(i819, ((i820 | 46) << 1) - (i820 ^ 46), (char) (60148 - TextUtils.indexOf((CharSequence) r6, (CharSequence) r6, 0, 0)), objArr196);
                Object[] objArr197 = {(String) objArr196[0]};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault32 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-263443444);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault32 == null) {
                    char cIndexOf6 = (char) TextUtils.indexOf((CharSequence) r6, (CharSequence) r6);
                    int pressedStateDuration5 = (ViewConfiguration.getPressedStateDuration() >> 16) + 993;
                    int iLastIndexOf12 = 7 - TextUtils.lastIndexOf(r6, '0');
                    byte b61 = (byte) 0;
                    byte b62 = b61;
                    Object[] objArr198 = new Object[1];
                    b(b61, b62, (byte) (b62 - 1), objArr198);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault32 = initSession.b(cIndexOf6, pressedStateDuration5, iLastIndexOf12, 349342683, false, (String) objArr198[0], new Class[]{String.class});
                }
                long jLongValue22 = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault32).invoke(null, objArr197)).longValue();
                long j130 = -418926436;
                long j131 = 367;
                long j132 = (j131 * j130) + (j131 * jLongValue22);
                long j133 = -366;
                long j134 = jLongValue22 ^ j;
                long jMyPid3 = Process.myPid();
                long j135 = j132 + ((j130 | jLongValue22) * j133) + (j133 * (j130 | ((j134 | jMyPid3) ^ j))) + (((long) 366) * ((((j130 ^ j) | jLongValue22) ^ j) | (((j130 | j134) | jMyPid3) ^ j))) + ((long) (-428152169));
                int iMyTid4 = Process.myTid();
                int i821 = (-30253322) + (((~((-174829599) | iMyTid4)) | (-1612056010)) * (-668)) + (((-174829599) | (~((-1612056010) | iMyTid4))) * 1336) + ((iMyTid4 | (-131081)) * 668);
                int i822 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 71;
                TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i822 % 128;
                int i823 = i822 % 2;
                int i824 = ((int) (j135 >> 32)) & i821;
                int i825 = (int) Runtime.getRuntime().totalMemory();
                int i826 = 1415694623 + (((~((-969366610) | i825)) | 155258961 | (~(1888374276 | i825))) * (-754));
                int i827 = ~((-155258962) | i825);
                int i828 = ~i825;
                int i829 = ((int) j135) & (i826 + ((i827 | (~(2043633237 | i828))) * (-754)) + ((i828 | (-969366610)) * 754));
                int i830 = ((i824 & i829) | (i824 ^ i829)) * 263;
                int i831 = (i830 | i16) & (~(i16 & i830));
                int i832 = (~(i16 & i818)) & (i16 | i818);
                int i833 = -i832;
                int i834 = ((i832 & i833) | (i832 ^ i833)) >> 31;
                int i835 = i831 & (~i834);
                int i836 = i818 & i834;
                i358 = (i836 & i835) | (i835 ^ i836);
                strArr = strArr4;
                i17 = 5;
            } else {
                i16 = i;
                i17 = 5;
                strArr = null;
            }
            Object[] objArr199 = new Object[i17];
            objArr199[0] = new int[1];
            objArr199[1] = new int[]{i358};
            objArr199[3] = new int[]{i16};
            int i837 = i16 ^ i358;
            int i838 = -i837;
            int i839 = (((i837 & i838) | (i837 ^ i838)) >> 31) & 16;
            objArr199[4] = strArr;
            objArr199[2] = null;
            int iMaxMemory4 = (int) Runtime.getRuntime().maxMemory();
            int i840 = ~iMaxMemory4;
            int i841 = 1944333059 + (((~((-33575717) | i840)) | (~(1110211444 | iMaxMemory4))) * 520);
            int i842 = ~((-1110211445) | i840);
            int i843 = ~(iMaxMemory4 | 663868199);
            int i844 = i841 + ((i842 | i843) * (-1040)) + ((i843 | (~(i840 | (-663868200))) | 1076635728) * 520) + i839;
            int i845 = (i3 & i844) + (i3 | i844);
            int i846 = i845 ^ (i845 << 13);
            int i847 = i846 >>> 17;
            int i848 = ((~i846) & i847) | ((~i847) & i846);
            int i849 = i848 << 5;
            ((int[]) objArr199[0])[0] = (i848 | i849) & (~(i848 & i849));
            return objArr199;
        }

        static {
            char[] cArr = new char[2154];
            ByteBuffer.wrap("±³f¹\u001f{4)ì·\u0085¾ºuS7\u000bð ³Ù\u007f\u008e$¦ø_\u008ets-7Åèú¿\u0093kH<`û\u0019\u0096Îyç;\u009få´¦mc\u009dÞJÔ3\u0016\u0018DÀÚ©Ó\u0096\u0018\u007fZ'\u009d\fÞõ\u0012¢I\u008a\u0095sãX\u000f\u0001Wé\u0091ÖÅ¿<dFL\u00955Öâ\u0004ËR³\u008d\u001d/Ê%³ç\u0098µ@+)\"\u0016éÿ«§l\u008c/uã\"¸\ndó\u0012Øý\u0081¶i~V2a<¶!Ïèä£<8U;jú\u0083°Ûnð6\tü^÷vx\u008f1¤ñý¸\u0015e*+Cò\u0098¨°XÉ$\u001eä7°O\u007fd/½ûÒ±G9\u00902éàÂ¶\u001a=s7L÷¥ÿýnÖ-/óx\u00ad±³f¸\u001fj4<ì·\u0085ªºsS6\u000bº ¥Ùd\u008e8¦àg!°<Éèâ®:kS9lì\u0085æÝTö\u0001\u000fÉXªpt\u0089&¢Äû \u0013j,>±³f¹\u001f\u007f4+ìù\u0085öº4S8\u000bä  Ù\u007f\u008e9¦ö_¾±îf²\u001f04=ì÷\u0085¶ºnSu\u000bæ °Ùr\u008e%¦ÿ_¸tv-\fÅâú¨\u0093zH\u0010`ì\u0019§Îyçz±îf²\u001f04=ì÷\u0085¶ºnSu\u000bæ °Ùr\u008e%¦ÿ_¸tv-\fÅâú¨\u0093zH\u0010`ì\u0019§Îyçy±³f®\u001fg4,ìì\u0085¼ºwSt\u000bø ¼Ùt\u008ex¦ü_¸tp-=Åîúã\u0093}H ±þf´\u001fy41ì÷\u0085¡Pb\u0087\u007fþ¶Õý\r=dm[¦²¥ê'Ám8©o©G/¾e\u0095®Ì÷$\u000b\u001bQrò©ð\u0081<øu/®\u0006·~6U{\u008c¹ãâÛ#2\u007fi¿Ð\u0007\u0007\u001a~ÓU\u0098\u008dXä\bÛÃ2ÀjBA\b¸ÌïÌÇJ>\u0000\u0015ËL\u0092¤n\u009b4ò\u0097)\u008b\u0001Nx\u0012¯Î±³f®\u001fg4,ìì\u0085¼ºwSt\u000bø ¼Ùt\u008ex¦ü_¸tp-=Åéú \u0093{H\u0019`Å\u0019¹Îxç$\u009fô´ëmu\u0002(±³f¹\u001f{4)ì·\u0085·º\u007fS6\u000bá ²Ùc\u008e2¦ã_¥è\u009a?ÆFDmIµ\u0099ÜÄã\u0002\nKRÎyÉ\u0080\r×Pÿ\u0090`¡·ëÎ,å\u007f=®T¤k'\u0082mÚ³q]¦Cß\u0082ôÞ,\u0015E\u0018z\u0092\u0093ÜË\u0016à^\u0019\u008bNÀf\r\u009fK´\u0099íÐ\u0005\u0011±òf¸\u001fs4*ìë\u0085¿Ô\u000e\u0003RzÐQÏ\u0089\nàVß\u009e6În\u0017EA¼ØëÚÃ\u0011:_\u0011\u0087HÕ \r\u009fNö\u009a-Ú\u0005\u001a|L«\u0098\\ë\u008b¨ò`Ù6±ìf¸\u001fl4,ìñ\u0085ªºnSu\u000bç ¬Ùe\u008ey¦ò_µt<-7Åéú¯\u0093{H(`¦\u0019®Îzç>\u009fª´£mg\u0002,:åÓ\u009e\u0088e¡3YÉ\u000e¢'LÜ\u001aôÖ\u00ad\u009dB_{\t\u0013ÑÈ\u0087±ìf¸\u001fl4,ìñ\u0085ªºnSu\u000bç ¬Ùe\u008ey¦ò_µt<-7Åéú¯\u0093{H(`¦\u0019®Îzç>\u009fª´£mg\u0002,:åÓ\u009e\u0088e¡3YÉ\u000e¢'HÜ\u001aôÖ\u00ad\u009dBU{\t±ìf¸\u001fl4,ìñ\u0085ªºnSu\u000bç ¬Ùe\u008ey¦ò_µt<-7Åéú¯\u0093{H(`¦\u0019»Îeçe\u009fç´´mo±ìf¸\u001fl4,ìñ\u0085ªºnSu\u000bç ¬Ùe\u008ey¦ò_µt<-7Åéú¯\u0093{H(`¦\u0019»Îeçe\u009fè´¤meØ÷\u000f£vw]7\u0085êì±Óu:nbüI·°~çbÏé6®\u001d'D,¬ò\u0093´ú`!3\t½p §~\u008e~öòÝ½\u0004~±ìf¸\u001fl4,ìñ\u0085ªºnSu\u000bç ¬Ùe\u008ey¦ò_µt<-7Åéú¯\u0093{H(`¦\u0019»Îeçe\u009fé´«me±êf¿\u001fq4'ìë\u0085¿a\"¶<Ïýä¡<jUgjæ\u0083¥Ûað1\të^£vr±êf¿\u001fq4'ìÿ\u0085¬º\u007fS(\u000bà±³f®\u001fg4,ìì\u0085¼ºwSt\u000bò §Ùw\u008e:¦õ_¦t}-!Åçúâ\u0093yH&`æ\u0019\u00adÎeç<\u009f÷´èmu\u0002>:óÓµ\u0088g¡.Yã\u000e\u008e'[Ü\rôÎ\u00ad\u009cBH{U\u0013ÞÈ\u0094áD±³f«\u001f{41ìü\u0085¶ºhSt\u000bø ¼Ùt\u008ea¦¤_þtz-$Å£ú¬\u0093{H+`á\u0019¦Î$ç;\u009fö´¬mk\u0002&:òÓ¸\u0088,¡4YÕ\u000e\u0093'ZÜ\u0010ôÏ\u00ad\u008aB\u0014{\b\u0013ÛÏ«\u0018³acJ)\u0092äû®Äp-luà^¤§lðyØ¼!æ\nbS<»»\u0084½ía64\u001eÿg¼°b\u0099<áïÊ¸\u0013l|qDï\u00ad°ötß?'Ëp\u0092YU¢I\u008aÓÓ\u008eåû2æK/`d¸¤Ñôî?\u0007<_°tô\u008d<Ú)òì\u000b¶ 9yw\u0091«®ðÇ\"\u001cX4¡Mè\u009a&³oË\u0093àä9 V{n\u00ad\u0087ûÜ,õj\r\u0097ZÐs[\u0088T \u0080ùÁ\u0016\\/@G\u0093±³f¸\u001fj4<ì·\u0085°ºtS2\u000bà úÙ\u007f\u008e9¦ù_¥t<-0Åàú¢\u0093{H+`û\u0019¬Îxç=\u009fí´¦mc\u0002i:òÓ¢±Ûf¸\u001fp4&ìõ\u0085¶ºnS2\u000bû »±éf³\u001fu41ì÷\u0085®ºt±ÿfµ\u001fl40ìõ\u0085°ºoS6\u001d:Êf³ä\u0098û@>)b\u0016ªÿú§#\u008cuuì\"ç\n!ósØ¯\u0081äi=±êf¿\u001fq4'ì \u0085ïºj\u0011\u001bÆX¿\u0090\u0094ÚL\n%P\u001a\u0099ÙV\u000e\u0015wÝ\\\u0097\u0084Gí\u001dÒÔ;©cAH@±\u008d±ûf¸\u001fp4:ìê\u0085°ºyS\u0004\u000bì íÙ \u008e\b¦¦_å\u0087BP\u001e)\u009c\u0002\u0083ÚF³\u001a\u008cÒe\u0082=[\u0016\rï\u0094¸\u0096\u0090Si\u0019BÛ\u001b\u0093:\u009aíÌ\u0094\u0000±ùf°\u001fk43ìù\u0085\u00adºuS)¼\u0088kø\u0012;9*á\u009f\u0088ù·!^z\u0006¨-íÔ&\u0083\"«£Rëy5 &È\u009a÷ð\u009e)Eum°\u0014ù±Ýf³\u001fz4-ì÷\u0085°º~S{\u000bÇ \u0091Ù]\u008ew¦ò_¤t{-?Åøúí\u0093hH `ú\u0019éÎrçs\u009f²çK0%Iìb»ºaÓ&ìè\u0005í]Qv\u0007\u008fËØáðd\t2\"í{©\u0093n¬{Åþ\u001e¶6lO\u007f\u0098ä±åÉ$â\f;¦TåEÊ\u0092\u0096ë\u0014À\u0013\u0018Ýq\u008fNZ§\bÿÑÔ\u0083-W\u0005\u0084ÒÍ«\r\u0080DX\u00811Ï\u000e\u0016çL5ðâ¥\u009bk°=hº\u0001õ±îf¼\u001fp4<ìð\u0085¬±îf²\u001f04/ìê\u0085¶º~S.\u000b÷ ¡Ù8\u008e5¦â_°t|-7J\u0085\u009dÙä[Ï_\u0017\u0096~ÀA\u001f¨Uð\u0093Û\u0090\"\fuY]\u0096¤Ï.\u0089±îf²\u001f04,ìý\u0085ººoS)\u000bñP\u0087±îf²\u001f04=ìí\u0085°ºvS?\u000bº ¥Ùd\u008e8¦ô_¤tq-'ª }r\u0004¨/é÷\u001d\u009e{¡øH·±îf²\u001f04=ìí\u0085°ºvS?\u000bº ³Ù\u007f\u008e9¦÷_´t`-#Åþú¤\u0093`H;±ûf¸\u001fp4:ìê\u0085°ºySt\u000bç ±Ù}\u008ex¦÷_´t|-6Åþú¤\u0093m±ûf¸\u001fp4:ìê\u0085°ºyS\u0004\u000bì íÙ \u008ex¦ã_µty-\fÅôúõ\u00938H``ï\u0019¬Îdç.\u009fö´¬me\u0002\u0018:øÓù\u00884»Vl\u0015\u0015Ý>\u0097æG\u008f\u001d°ÔYÙ\u0001^*\u0017ÓÔ\u0084\u009d¬QU\u0019~à'\u008dÏEð\u000b\u0099\u008cB\u0085j@\u0013\nÄÂí\u0094\u0095@¾\u000bÕæ\u0002¥{mP'\u0088÷á\u00adÞd7ioÿDª½dê2Âµ;ú\u0010\u007fIa¡ç\u009e²÷|,*\u0004\u00ad}âªg$8óq\u008a²¡ûy7\u0010\u007f/öÆë\u009e3µ}L\u008a\u001bó3#Êzá¾¸þP*oQ\u0006µÝ´õ}\u008c%[®rí\n)!cø·\u0097í¯ F]\u001d¹4¸ÌI±îf²\u001f04=ì÷\u0085¶ºnS7\u000bû ´Ùr\u008e2¦â¡1vm\u000fï$âü(\u0095iª±Cí\u001b&0kÉ®\u009eí¶aOld¸=åÕ?êv\u0083ÿXöp>\txÞ²÷ñ\u008f)¤j}«\u0012ñ*1Ãj±Ýf³\u001fz4-ì÷\u0085°º~Sv\u000bì íÙ ±îf²\u001f04=ìí\u0085°ºvS?\u000bº ±Ù\u007f\u008e$¦à_½ts-*Å¢ú¤\u0093j±èf¸\u001fm4+ìµ¼Ìk\u008a\u0012N9\u0012á\u008f\u0088\u0093·U^\u0001\u0006\u0083-\u009dÔJ\u0083\u0003«ÜRÅy[ \u0018ÈÚ÷\u0084\u009eD±íf¸\u001fs4*ì¶\u0085±ºmSu\u000bù ´Ù\u007f\u008e9¦û_´tk- ±íf¸\u001fs4*ì¶\u0085ªº|Su\u000bò ´Ù}\u008e2¦Ï_²ts->Åéú¿\u0093oÒÙ\u0005\u008c|GW\u001e\u008f\u0082æ\u009eÙH0AhÌC\u0082ºFí<ÅÀ<\u0080\u0017HN\u0014¦Ñ\u0099\u008dðC±îf²\u001f044ìý\u0085«ºtS>\u000bø ûÙw\u008e9¦ô_£t}-:Åèúã\u0093\u007fH*`å\u0019¼În±îf²\u001f04=ì÷\u0085¶ºnSu\u000bå °Ù{\u008e\"¦¾_°td-7ÅÓú£\u0093oH\"`í±îf²\u001f040ìü\u0085´º4S9\u000bá ¼Ùz\u008e3¦¾_·t{-=Åëú¨\u0093|H?`ú\u0019 Îdç?±îf²\u001f04/ìê\u0085¶º~S.\u000b÷ ¡Ù8\u008e5¦å_¸t~-7Å¢ú«\u0093gH!`ï\u0019¬Îxç;\u009fö´¬mh\u00023±îf²\u001f04,ìá\u0085ªºnS>\u000bù ûÙt\u008e\"¦ù_½tv-}Åêú¤\u0093`H(`í\u0019»Îzç9\u009fí´«mr\u0002÷Õ«¬)\u00875_ø6³\twà'¸à\u0093\u0093jj=6\u0015ýìæÇi\u009e?vüI¸ sûxÓ÷ª¹}}T5,ø\u0007®Þo±,\u0089ð`¶;oYõ\u008e©÷+Ü2\u0004æm¬Re»/ãýÈà1of9Nâ·¦\u009cmÅf-ñ\u0012¿{{ 3\u0088öñ &a\u000f\"wö\\°\u0085i±îf²\u001f04)ìý\u0085·º~S4\u000bæ \u008aÙr\u008e;¦û_¼t<-1Åùú¤\u0093bH+`¦\u0019¯Îcç%\u009fã´ mt\u00027:òÓ¨\u0088l¡7±´±°fý±¦±µ±³f¹\u001f{4)ì·\u0085¨º\u007fS6\u000bá \u008aÙf\u008e>¦à_´±³f¹\u001f{4)ì·\u0085ªºuS8\u000bÿ °Ùb\u008ex¦ò_°ta-6Åîú¬\u0093`H+`×\u0019®Îoç%\u009fý´¡±³f¹\u001f{4)ì·\u0085ªºuS8\u000bÿ °Ùb\u008ex¦÷_´t|-*Åè±³f¹\u001f{4)ì·\u0085ªºuS8\u000bÿ °Ùb\u008ex¦á_´t\u007f-&Åè±³f®\u001fg4,ì·\u0085¨º\u007fS6\u000bá \u008aÙb\u008e%¦ñ_²tw\u001a\u000bÍ\u0016´ß\u009f\u0094GT.\u0004\u0011ÏøÌ @\u008b\u0004rÌ%À\rDô\u0000ßÈ\u0086\u0088nkQ\u00188×ã\u009bË\\²\u001eeÑL¬4X\u001f\u0018ÆÜ©\u008a\u0091_x&#Ë\n\u009eòi¥0\u008c¨w´_o±³f¹\u001f{4)ì·\u0085»ºiS/\u000bË ²Ùf\u008e$±³f¹\u001f{4)ì·\u0085»ºiS/\u000bË ¡Ù\u007f\u008e:¦õã«4¡Mcf1¾¯×²èm\u0001 Yçr¨\u008bzÜ`ôê\rº&~\u007f-\u0097û¨¹Ár\u001a22âKµ\u009f4H)1à\u001a«Âk«;\u0094ð}ó%\u007f\u000e;÷ó ÿ\u0088{q?Z÷\u0003¶ëxÔ>½ïf§Nc7*àèÉ¾±\\\u009a(Cï,©\u0014)ý5¦ê±³f¹\u001f{4)ì·\u0085»ºiS/\u000bõ ¶Ùu\u008e21ÐæÚ\u009f\u0018´JlÔ\u0005Ø:\nÓL\u008b\u0090 ÏY\u0007\u000e[FÇ\u0091Íè\u000fÃ]\u001bÃrÏM\u001d¤[ü\u008d×Ä.\u0005yM\u0092ÅEÏ<\r\u0017_ÏÁ¦Í\u0099\u001fpY(\u008d\u0003Ñú\t\u00adD±³f¹\u001f{4)ì·\u0085»ºiS/\u000bâ ¸Ùe\u008e0±³f¹\u001f{4)ì·\u0085»ºiS/\u000bä ²Ùw\u008e>¦à_²±³f¹\u001f{4)ì·\u0085»ºiS/\u000bË ¼Ù{\u008e2Å<\u00126kð@¤\u0098vñyÎñ'»\u007flT4\u00adõú·Ò~+:\u0000îYó±-\u008e:çã<ï\u0014em5ºñ\u0093¯±³f°\u001fp4+ì·\u0085®ºsS5\u000bð ºÙa\u008e$¦¿_\u0093ta-'Åßú¥\u0093oH=`í\u0019\u00adÎLç$\u009fè´¡mc\u00025G\u0094\u0090\u008aéKÂ\u0017\u001aÜsÑLT¥\u0013ýÃÖ\u009d/Cx\u0004PÄáý6êO)d.¼óe\u0085²\u009bËZà\u00068ÍQÀn_\u0087\bßÎô\u0085\r\u000fZ\frÇ\u008b\u0097 W\u0093äD°=`\u0016,Îë§©\u0098fqj)ì\u0002¥ûe¬,\u0084é}§V~\u000f$ç½Ø¡±~úù-½Tu\u007f\u0011§ÝÎ\u0095ñ@\u0018\r@ÿk¯\u0092kÅpíê\u0014·ªÝ}Ö\u0004\u0004/R÷Ù\u009eÚ¡\u0011HQ\u0010\u0093;ÚÂ'\u0095Z½\u0091DÛo\u00196^Þ\u0091á\u008d\u0088\u0018SL{\u008a,3û|\u0082¦©÷q&\u0018`'¶Îõ\u00962½k±³f¸\u001fj4<ì·\u0085´ºuS.\u000bú ¡ÙeÛ9\f3uõ^¡\u0086sï|Ðô9¾aiJ1³ðä²Ì{5?\u001eëGö¯(\u0090#ùô\"ê\ncs3¤ð\u008d²õ Þ7\u0007áh¡\u0094ÖCÈ:\t\u0011UÉ\u009e \u0093\u009f\u001cvN.\u0084\u0005Ùü\u001d«T\u0083\u009a·A`(\u0019è2¡êd\u0083*¼óU©[G\u008cMõ\u008bÞß\u0006\ro\u0002P\u0083¹Æá\u0013ÊB3ÍdÓL\u0016µJ\u009e\u0080ÇÎ/\u0014\u0010\\y\u0089¢\u0094\u008a\u001fóH$\u008c\r\u0090u@^\u001e\u0087\u0091èÜÐ\u00199\u001bb\u009bKÞ³+ä{Í¥6ý\u001e%G\u007f¨º\u0091¡ù-\"d\u000b¯|ö¤-\u008dhö£".getBytes("ISO-8859-1")).asCharBuffer().get(cArr, 0, 2154);
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = cArr;
            TuitionPaymentFragmentbindingInflater1 = -3270251685215770915L;
        }

        private static String $$e(int i, byte b, byte b2) {
            int i2 = (b * 3) + 109;
            int i3 = i * 2;
            byte[] bArr = $$c;
            int i4 = 4 - (b2 * 2);
            byte[] bArr2 = new byte[1 - i3];
            int i5 = 0 - i3;
            int i6 = -1;
            if (bArr == null) {
                i4++;
                i2 += i4;
                i6 = -1;
            }
            while (true) {
                int i7 = i6 + 1;
                bArr2[i7] = (byte) i2;
                if (i7 == i5) {
                    return new String(bArr2, 0);
                }
                byte b3 = bArr[i4];
                i4++;
                i2 = b3 + i2;
                i6 = i7;
            }
        }
    };
    public static final int RATING_3_STARS = 3;
    public static final int RATING_4_STARS = 4;
    public static final int RATING_5_STARS = 5;
    public static final int RATING_HEART = 1;
    public static final int RATING_NONE = 0;
    private static final float RATING_NOT_RATED = -1.0f;
    public static final int RATING_PERCENTAGE = 6;
    public static final int RATING_THUMB_UP_DOWN = 2;
    private static final String TAG = "Rating";
    private Object mRatingObj;
    private final int mRatingStyle;
    private final float mRatingValue;

    @Retention(RetentionPolicy.SOURCE)
    public @interface StarStyle {
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface Style {
    }

    RatingCompat(int i, float f) {
        this.mRatingStyle = i;
        this.mRatingValue = f;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Rating:style=");
        sb.append(this.mRatingStyle);
        sb.append(" rating=");
        float f = this.mRatingValue;
        sb.append(f < 0.0f ? "unrated" : String.valueOf(f));
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return this.mRatingStyle;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.mRatingStyle);
        parcel.writeFloat(this.mRatingValue);
    }

    public static RatingCompat newUnratedRating(int i) {
        switch (i) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                return new RatingCompat(i, -1.0f);
            default:
                return null;
        }
    }

    public static RatingCompat newHeartRating(boolean z) {
        return new RatingCompat(1, z ? 1.0f : 0.0f);
    }

    public static RatingCompat newThumbRating(boolean z) {
        return new RatingCompat(2, z ? 1.0f : 0.0f);
    }

    public static RatingCompat newStarRating(int i, float f) {
        float f2;
        if (i == 3) {
            f2 = 3.0f;
        } else if (i == 4) {
            f2 = 4.0f;
        } else {
            if (i != 5) {
                return null;
            }
            f2 = 5.0f;
        }
        if (f < 0.0f || f > f2) {
            return null;
        }
        return new RatingCompat(i, f);
    }

    public static RatingCompat newPercentageRating(float f) {
        if (f < 0.0f || f > 100.0f) {
            return null;
        }
        return new RatingCompat(6, f);
    }

    public final boolean isRated() {
        return this.mRatingValue >= 0.0f;
    }

    public final int getRatingStyle() {
        return this.mRatingStyle;
    }

    public final boolean hasHeart() {
        return this.mRatingStyle == 1 && this.mRatingValue == 1.0f;
    }

    public final boolean isThumbUp() {
        return this.mRatingStyle == 2 && this.mRatingValue == 1.0f;
    }

    public final float getStarRating() {
        int i = this.mRatingStyle;
        if ((i == 3 || i == 4 || i == 5) && isRated()) {
            return this.mRatingValue;
        }
        return -1.0f;
    }

    public final float getPercentRating() {
        if (this.mRatingStyle == 6 && isRated()) {
            return this.mRatingValue;
        }
        return -1.0f;
    }

    public static RatingCompat fromRating(Object obj) {
        RatingCompat ratingCompatNewUnratedRating = null;
        if (obj != null) {
            Rating rating = (Rating) obj;
            int ratingStyle = rating.getRatingStyle();
            if (rating.isRated()) {
                switch (ratingStyle) {
                    case 1:
                        ratingCompatNewUnratedRating = newHeartRating(rating.hasHeart());
                        break;
                    case 2:
                        ratingCompatNewUnratedRating = newThumbRating(rating.isThumbUp());
                        break;
                    case 3:
                    case 4:
                    case 5:
                        ratingCompatNewUnratedRating = newStarRating(ratingStyle, rating.getStarRating());
                        break;
                    case 6:
                        ratingCompatNewUnratedRating = newPercentageRating(rating.getPercentRating());
                        break;
                    default:
                        return null;
                }
            } else {
                ratingCompatNewUnratedRating = newUnratedRating(ratingStyle);
            }
            ratingCompatNewUnratedRating.mRatingObj = obj;
        }
        return ratingCompatNewUnratedRating;
    }

    public final Object getRating() {
        if (this.mRatingObj == null) {
            if (isRated()) {
                int i = this.mRatingStyle;
                switch (i) {
                    case 1:
                        this.mRatingObj = Rating.newHeartRating(hasHeart());
                        break;
                    case 2:
                        this.mRatingObj = Rating.newThumbRating(isThumbUp());
                        break;
                    case 3:
                    case 4:
                    case 5:
                        this.mRatingObj = Rating.newStarRating(i, getStarRating());
                        break;
                    case 6:
                        this.mRatingObj = Rating.newPercentageRating(getPercentRating());
                        break;
                    default:
                        return null;
                }
            } else {
                this.mRatingObj = Rating.newUnratedRating(this.mRatingStyle);
            }
        }
        return this.mRatingObj;
    }
}
