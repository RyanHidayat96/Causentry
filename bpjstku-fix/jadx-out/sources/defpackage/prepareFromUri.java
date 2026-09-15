package defpackage;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.Toast;
import androidx.core.util.Pair;
import androidx.core.view.ViewCompat;
import com.airbnb.lottie.network.FileExtension;
import com.airbnb.lottie.parser.moshi.JsonReader;
import com.google.mlkit.common.sdkinternal.zze;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.Callable;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import kotlin.io.encoding.Base64;

/* JADX INFO: loaded from: classes4.dex */
public final class prepareFromUri {
    private static int TuitionPaymentFragmentbindingInflater1;
    private static char[] TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    private static final Map<String, sendCommand<previous>> TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    private static long TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    private static final byte[] $$c = {109, 7, 114, -90};
    private static final int $$f = 148;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$d = {110, -73, -111, 99, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 56};
    private static final int $$e = 138;
    private static final byte[] $$a = {27, 65, -33, 120, -2, 10, -10};
    private static final int $$b = 133;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f1324a = 0;
    private static int d = 1;
    private static int b = 1;

    public static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault2(int i, int i2, int i3, int i4, Object[] objArr, int i5, int i6) {
        int i7 = ~i6;
        int i8 = ~((~i3) | i7 | i);
        int i9 = ~i;
        int i10 = (~(i7 | i3)) | (~(i7 | i9)) | (~(i9 | i3));
        int i11 = (~(i9 | i6)) | i3;
        int i12 = i6 + i3 + i5 + ((-946781377) * i4) + ((-59450693) * i2);
        int i13 = i12 * i12;
        int i14 = (((-143250568) * i6) - 346488832) + (357422218 * i3) + (i8 * (-1897147255)) + ((-1897147255) * i10) + (1897147255 * i11) + ((-2040397824) * i5) + ((-1205993472) * i4) + ((-1651113984) * i2) + ((-884408320) * i13);
        int i15 = ((i6 * 358501064) - 1042343473) + (i3 * 358500518) + (i8 * (-273)) + (i10 * (-273)) + (i11 * 273) + (i5 * 358500791) + (i4 * (-249165559)) + (i2 * 1905372845) + (i13 * 573505536);
        int i16 = i14 + (i15 * i15 * (-553189376));
        if (i16 == 1) {
            return TuitionPaymentFragmentspecialinlinedviewModeldefault2(objArr);
        }
        if (i16 == 2) {
            return b(objArr);
        }
        Context context = (Context) objArr[0];
        String str = (String) objArr[1];
        int i17 = 2 % 2;
        sendCommand<previous> sendcommandTuitionPaymentFragmentspecialinlinedviewModeldefault3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3((String) null, new AnonymousClass1(context.getApplicationContext(), str, null));
        int i18 = f1324a + 47;
        d = i18 % 128;
        int i19 = i18 % 2;
        return sendcommandTuitionPaymentFragmentspecialinlinedviewModeldefault3;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x002a  */
    /* JADX WARN: Code duplicated, block: B:8:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002a -> B:11:0x0031). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x002a
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void c(short r6, byte r7, short r8, java.lang.Object[] r9) {
        /*
            int r7 = r7 * 3
            int r7 = 4 - r7
            int r8 = r8 * 3
            int r8 = r8 + 111
            int r6 = r6 * 4
            int r0 = r6 + 4
            byte[] r1 = defpackage.prepareFromUri.$$a
            byte[] r0 = new byte[r0]
            int r6 = r6 + 3
            r2 = 0
            if (r1 != 0) goto L19
            r4 = r6
            r8 = r7
            r3 = r2
            goto L31
        L19:
            r3 = r2
        L1a:
            r5 = r8
            r8 = r7
            r7 = r5
            byte r4 = (byte) r7
            r0[r3] = r4
            if (r3 != r6) goto L2a
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            r9[r2] = r6
            return
        L2a:
            int r3 = r3 + 1
            r4 = r1[r8]
            r5 = r8
            r8 = r7
            r7 = r5
        L31:
            int r7 = r7 + 1
            int r4 = -r4
            int r8 = r8 + r4
            int r8 = r8 + (-1)
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.prepareFromUri.c(short, byte, short, java.lang.Object[]):void");
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0025  */
    /* JADX WARN: Code duplicated, block: B:8:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002d). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0025
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void e(int r5, byte r6, byte r7, java.lang.Object[] r8) {
        /*
            int r5 = r5 + 4
            int r7 = r7 * 52
            int r0 = r7 + 1
            int r6 = 103 - r6
            byte[] r1 = defpackage.prepareFromUri.$$d
            byte[] r0 = new byte[r0]
            r2 = -1
            if (r1 != 0) goto L12
            r3 = r2
            r2 = r5
            goto L2d
        L12:
            r4 = r6
            r6 = r5
            r5 = r4
        L15:
            int r2 = r2 + 1
            byte r3 = (byte) r5
            r0[r2] = r3
            if (r2 != r7) goto L25
            java.lang.String r5 = new java.lang.String
            r6 = 0
            r5.<init>(r0, r6)
            r8[r6] = r5
            return
        L25:
            int r6 = r6 + 1
            r3 = r1[r6]
            r4 = r2
            r2 = r6
            r6 = r3
            r3 = r4
        L2d:
            int r6 = -r6
            int r5 = r5 + r6
            int r5 = r5 + (-11)
            r6 = r2
            r2 = r3
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.prepareFromUri.e(int, byte, byte, java.lang.Object[]):void");
    }

    private static /* synthetic */ Object b(Object[] objArr) {
        int i = 2 % 2;
        int i2 = f1324a;
        int i3 = i2 + 79;
        d = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        Map<String, sendCommand<previous>> map = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        int i4 = i2 + 85;
        d = i4 % 128;
        if (i4 % 2 != 0) {
            return map;
        }
        throw null;
    }

    static {
        TuitionPaymentFragmentbindingInflater1 = 0;
        b();
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = new HashMap();
        int i = b + 111;
        TuitionPaymentFragmentbindingInflater1 = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    public static sendCommand<previous> TuitionPaymentFragmentspecialinlinedviewModeldefault3(Context context, String str) {
        int i = 2 % 2;
        String strConcat = "url_".concat(String.valueOf(str));
        sendCommand<previous> sendcommandTuitionPaymentFragmentspecialinlinedviewModeldefault3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3(strConcat, new AnonymousClass4(context, str, strConcat));
        int i2 = f1324a + 113;
        d = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 90 / 0;
        }
        return sendcommandTuitionPaymentFragmentspecialinlinedviewModeldefault3;
    }

    /* JADX INFO: renamed from: prepareFromUri$4, reason: invalid class name */
    final class AnonymousClass4 implements Callable<rateWithExtras<previous>> {
        private /* synthetic */ String TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        private /* synthetic */ String TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        private /* synthetic */ Context TuitionPaymentFragmentspecialinlinedviewModeldefault3;

        AnonymousClass4(Context context, String str, String str2) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = context;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = str;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = str2;
        }

        /* JADX WARN: Code duplicated, block: B:13:0x003e  */
        @Override // java.util.concurrent.Callable
        public final /* synthetic */ rateWithExtras<previous> call() throws Exception {
            previous previousVar;
            Pair<FileExtension, InputStream> pairTuitionPaymentFragmentspecialinlinedviewModeldefault1;
            rateWithExtras<previous> ratewithextrasTuitionPaymentFragmentbindingInflater1;
            getCurrentControllerInfo getcurrentcontrollerinfo = new getCurrentControllerInfo(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, this.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
            getRemoteControlClient getremotecontrolclient = getcurrentcontrollerinfo.b;
            if (getremotecontrolclient == null || (pairTuitionPaymentFragmentspecialinlinedviewModeldefault1 = getremotecontrolclient.TuitionPaymentFragmentspecialinlinedviewModeldefault1(getcurrentcontrollerinfo.TuitionPaymentFragmentspecialinlinedviewModeldefault1)) == null) {
                previousVar = null;
            } else {
                FileExtension fileExtension = pairTuitionPaymentFragmentspecialinlinedviewModeldefault1.first;
                InputStream inputStream = pairTuitionPaymentFragmentspecialinlinedviewModeldefault1.second;
                if (fileExtension == FileExtension.ZIP) {
                    ratewithextrasTuitionPaymentFragmentbindingInflater1 = prepareFromUri.b(new ZipInputStream(inputStream), getcurrentcontrollerinfo.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
                } else {
                    ratewithextrasTuitionPaymentFragmentbindingInflater1 = prepareFromUri.TuitionPaymentFragmentbindingInflater1(inputStream, getcurrentcontrollerinfo.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
                }
                if (ratewithextrasTuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault2 != null) {
                    previousVar = ratewithextrasTuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                } else {
                    previousVar = null;
                }
            }
            if (previousVar != null) {
                return new rateWithExtras<>(previousVar);
            }
            String str = getcurrentcontrollerinfo.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            onSetCaptioningEnabled.TuitionPaymentFragmentbindingInflater1();
            return getcurrentcontrollerinfo.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        }
    }

    public static sendCommand<previous> TuitionPaymentFragmentspecialinlinedviewModeldefault2(Context context, String str, String str2) {
        int i = 2 % 2;
        sendCommand<previous> sendcommandTuitionPaymentFragmentspecialinlinedviewModeldefault3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3(str2, new AnonymousClass4(context, str, str2));
        int i2 = d + 117;
        f1324a = i2 % 128;
        if (i2 % 2 == 0) {
            return sendcommandTuitionPaymentFragmentspecialinlinedviewModeldefault3;
        }
        throw null;
    }

    private static void f(int i, int i2, char c, Object[] objArr) throws Throwable {
        int i3 = 2 % 2;
        lambdabuild0androidxcameracoreimplSessionConfigValidatingBuilder lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder = new lambdabuild0androidxcameracoreimplSessionConfigValidatingBuilder();
        long[] jArr = new long[i2];
        lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
        while (lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 < i2) {
            int i4 = lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            try {
                Object[] objArr2 = {Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault1[i + i4])};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-692725632);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    byte b2 = (byte) 0;
                    byte b3 = b2;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) TextUtils.indexOf("", "", 0, 0), 2187 - Color.blue(0), 40 - (ViewConfiguration.getDoubleTapTimeout() >> 16), 841711447, false, $$g(b2, b3, (byte) (b3 + 2)), new Class[]{Integer.TYPE});
                }
                Object[] objArr3 = {Long.valueOf(((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).longValue()), Long.valueOf(i4), Long.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault3), Integer.valueOf(c)};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-139477533);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                    byte b4 = (byte) 0;
                    byte b5 = b4;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) ((ViewConfiguration.getDoubleTapTimeout() >> 16) + 33017), 3010 - TextUtils.indexOf((CharSequence) "", '0', 0), TextUtils.getTrimmedLength("") + 26, 321985076, false, $$g(b4, b5, b5), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                }
                jArr[i4] = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).longValue();
                Object[] objArr4 = {lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder, lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(584784343);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    byte b6 = (byte) 0;
                    byte b7 = b6;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) ((ViewConfiguration.getMaximumFlingVelocity() >> 16) + 36505), (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 3376, TextUtils.indexOf((CharSequence) "", '0', 0) + 18, -968507904, false, $$g(b6, b7, (byte) (b7 + 1)), new Class[]{Object.class, Object.class});
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
        int i5 = $10 + 31;
        $11 = i5 % 128;
        int i6 = i5 % 2;
        while (lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 < i2) {
            int i7 = $11 + 83;
            $10 = i7 % 128;
            if (i7 % 2 != 0) {
                cArr[lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) jArr[lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1];
                try {
                    Object[] objArr5 = {lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder, lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(584784343);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        byte b8 = (byte) 0;
                        byte b9 = b8;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) ((ViewConfiguration.getMaximumFlingVelocity() >> 16) + 36505), 3376 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), 17 - View.MeasureSpec.getSize(0), -968507904, false, $$g(b8, b9, (byte) (b9 + 1)), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5);
                    int i8 = 66 / 0;
                } catch (Throwable th2) {
                    Throwable cause2 = th2.getCause();
                    if (cause2 == null) {
                        throw th2;
                    }
                    throw cause2;
                }
            } else {
                cArr[lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) jArr[lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1];
                Object[] objArr6 = {lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder, lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(584784343);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                    byte b10 = (byte) 0;
                    byte b11 = b10;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b((char) (36505 - (ViewConfiguration.getWindowTouchSlop() >> 8)), 3376 - View.resolveSizeAndState(0, 0, 0), 17 - (ViewConfiguration.getTouchSlop() >> 8), -968507904, false, $$g(b10, b11, (byte) (b11 + 1)), new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr6);
            }
        }
        objArr[0] = new String(cArr);
    }

    public static sendCommand<previous> b(Context context, String str) {
        int i = 2 % 2;
        String strConcat = "asset_".concat(String.valueOf(str));
        sendCommand<previous> sendcommandTuitionPaymentFragmentspecialinlinedviewModeldefault3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3(strConcat, new AnonymousClass1(context.getApplicationContext(), str, strConcat));
        int i2 = f1324a + 65;
        d = i2 % 128;
        if (i2 % 2 != 0) {
            return sendcommandTuitionPaymentFragmentspecialinlinedviewModeldefault3;
        }
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX INFO: renamed from: prepareFromUri$1, reason: invalid class name */
    public final class AnonymousClass1 implements Callable<rateWithExtras<previous>> {
        private /* synthetic */ String TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        private /* synthetic */ Context TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        private /* synthetic */ String b;

        AnonymousClass1(Context context, String str, String str2) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = context;
            this.b = str;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = str2;
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ rateWithExtras<previous> call() throws Exception {
            return prepareFromUri.TuitionPaymentFragmentbindingInflater1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, this.b, this.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
        }
    }

    /* JADX INFO: renamed from: prepareFromUri$5, reason: invalid class name */
    final class AnonymousClass5 implements Callable<rateWithExtras<previous>> {
        private /* synthetic */ WeakReference TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        private /* synthetic */ int TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        private /* synthetic */ Context b;

        AnonymousClass5(WeakReference weakReference, Context context, int i) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = weakReference;
            this.b = context;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i;
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ rateWithExtras<previous> call() throws Exception {
            Context context = (Context) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.get();
            if (context == null) {
                context = this.b;
            }
            return prepareFromUri.TuitionPaymentFragmentspecialinlinedviewModeldefault3(context, this.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:75:0x0586  */
    public static rateWithExtras<previous> TuitionPaymentFragmentbindingInflater1(Context context, String str, String str2) throws Throwable {
        int length;
        String string;
        int i = 2;
        int i2 = 2 % 2;
        ArrayList arrayList = new ArrayList();
        int i3 = 0;
        if (str != null) {
            int i4 = f1324a + 27;
            d = i4 % 128;
            if (i4 % 2 == 0) {
                length = str.length();
                int i5 = 35 / 0;
            } else {
                length = str.length();
            }
        } else {
            length = 0;
        }
        byte b2 = (byte) 0;
        byte b3 = b2;
        Object[] objArr = new Object[1];
        c(b2, b3, b3, objArr);
        Method[] methodArr = {AssetManager.class.getMethod((String) objArr[0], String.class)};
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char bitsPerPixel = (char) ((-1) - ImageFormat.getBitsPerPixel(0));
            int iKeyCodeFromString = 2823 - KeyEvent.keyCodeFromString("");
            int i6 = 23 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1));
            byte[] bArr = $$d;
            byte b4 = bArr[5];
            Object[] objArr2 = new Object[1];
            e((byte) (-b4), bArr[10], b4, objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(bitsPerPixel, iKeyCodeFromString, i6, 1814927978, false, (String) objArr2[0], null);
        }
        float f = 0.0f;
        if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).get(null) == null) {
            Method[] declaredMethods = ((Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (ViewConfiguration.getMinimumFlingVelocity() >> 16), 2824 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), 22 - Color.green(0))).getDeclaredMethods();
            int length2 = declaredMethods.length;
            int i7 = 0;
            while (i7 < length2) {
                int i8 = f1324a + 101;
                d = i8 % 128;
                if (i8 % i == 0) {
                    Method method = declaredMethods[i7];
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                Method method2 = declaredMethods[i7];
                try {
                    Object[] objArr3 = new Object[1];
                    f((TypedValue.complexToFloat(i3) > f ? 1 : (TypedValue.complexToFloat(i3) == f ? 0 : -1)), ImageFormat.getBitsPerPixel(i3) + 25, (char) ((AudioTrack.getMaxVolume() > f ? 1 : (AudioTrack.getMaxVolume() == f ? 0 : -1)) - 1), objArr3);
                    Class<?> cls = Class.forName((String) objArr3[i3]);
                    int mode = View.MeasureSpec.getMode(i3) + 24;
                    int scrollDefaultDelay = 12 - (ViewConfiguration.getScrollDefaultDelay() >> 16);
                    char offsetBefore = (char) (TextUtils.getOffsetBefore("", i3) + 60348);
                    Object[] objArr4 = new Object[1];
                    f(mode, scrollDefaultDelay, offsetBefore, objArr4);
                    Object[] objArr5 = {Integer.valueOf(((Integer) cls.getMethod((String) objArr4[0], null).invoke(method2, null)).intValue())};
                    Object[] objArr6 = new Object[1];
                    f(36 - View.combineMeasuredStates(0, 0), 26 - (Process.myPid() >> 22), (char) (((byte) KeyEvent.getModifierMetaStateMask()) + Base64.padSymbol), objArr6);
                    Class<?> cls2 = Class.forName((String) objArr6[0]);
                    int i9 = length2;
                    Object[] objArr7 = new Object[1];
                    f(63 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), View.resolveSizeAndState(0, 0, 0) + 8, (char) ((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 38097), objArr7);
                    if (((Boolean) cls2.getMethod((String) objArr7[0], Integer.TYPE).invoke(null, objArr5)).booleanValue()) {
                        Class cls3 = Long.TYPE;
                        Object[] objArr8 = new Object[1];
                        f((-1) - TextUtils.lastIndexOf("", '0'), 23 - TextUtils.lastIndexOf("", '0', 0), (char) View.MeasureSpec.makeMeasureSpec(0, 0), objArr8);
                        Class<?> cls4 = Class.forName((String) objArr8[0]);
                        Object[] objArr9 = new Object[1];
                        f(TextUtils.indexOf("", "", 0) + 70, (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 12, (char) (12574 - KeyEvent.keyCodeFromString("")), objArr9);
                        if (cls3.equals(cls4.getMethod((String) objArr9[0], null).invoke(method2, null))) {
                            int i10 = f1324a + 25;
                            d = i10 % 128;
                            int i11 = i10 % 2;
                            Object[] objArr10 = new Object[1];
                            f(AndroidCharacter.getMirror('0') - '0', 24 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), (char) (TextUtils.lastIndexOf("", '0', 0) + 1), objArr10);
                            Class<?> cls5 = Class.forName((String) objArr10[0]);
                            Object[] objArr11 = new Object[1];
                            f(83 - (ViewConfiguration.getDoubleTapTimeout() >> 16), View.resolveSizeAndState(0, 0, 0) + 17, (char) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 37335), objArr11);
                            Object[] objArr12 = (Object[]) cls5.getMethod((String) objArr11[0], null).invoke(method2, null);
                            if (objArr12.length == 2 && Long.TYPE.equals(objArr12[0])) {
                                Object[] objArr13 = new Object[1];
                                f(ViewConfiguration.getKeyRepeatDelay() >> 16, 23 - ((byte) KeyEvent.getModifierMetaStateMask()), (char) (TextUtils.lastIndexOf("", '0') + 1), objArr13);
                                if (Class.forName((String) objArr13[0]).equals(objArr12[1])) {
                                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
                                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                        char cMakeMeasureSpec = (char) View.MeasureSpec.makeMeasureSpec(0, 0);
                                        int i12 = (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 2823;
                                        int packedPositionGroup = ExpandableListView.getPackedPositionGroup(0L) + 22;
                                        byte[] bArr2 = $$d;
                                        byte b5 = bArr2[5];
                                        Object[] objArr14 = new Object[1];
                                        e((byte) (-b5), bArr2[10], b5, objArr14);
                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cMakeMeasureSpec, i12, packedPositionGroup, 1814927978, false, (String) objArr14[0], null);
                                    }
                                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).set(null, method2);
                                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
                                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                                        char size = (char) View.MeasureSpec.getSize(0);
                                        int packedPositionChild = ExpandableListView.getPackedPositionChild(0L) + 2824;
                                        int iArgb = 22 - Color.argb(0, 0, 0, 0);
                                        byte[] bArr3 = $$d;
                                        byte b6 = bArr3[5];
                                        Object[] objArr15 = new Object[1];
                                        e((byte) (-b6), bArr3[10], b6, objArr15);
                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(size, packedPositionChild, iArgb, 1814927978, false, (String) objArr15[0], null);
                                    }
                                    try {
                                        Object[] objArr16 = {0L, ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null)};
                                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1678062333);
                                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                                            char cIndexOf = (char) TextUtils.indexOf("", "", 0);
                                            int i13 = (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 2822;
                                            int defaultSize = View.getDefaultSize(0, 0) + 22;
                                            byte b7 = $$d[7];
                                            Object[] objArr17 = new Object[1];
                                            e((byte) 51, b7, b7, objArr17);
                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(cIndexOf, i13, defaultSize, -2137287382, false, (String) objArr17[0], new Class[]{Long.TYPE, Method.class});
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
                    length2 = i9;
                    i = 2;
                    i3 = 0;
                    f = 0.0f;
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
            char cResolveOpacity = (char) Drawable.resolveOpacity(0, 0);
            int iBlue = Color.blue(0) + 2823;
            int packedPositionChild2 = ExpandableListView.getPackedPositionChild(0L) + 23;
            byte[] bArr4 = $$d;
            byte b8 = bArr4[5];
            Object[] objArr18 = new Object[1];
            e((byte) (-b8), bArr4[10], b8, objArr18);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(cResolveOpacity, iBlue, packedPositionChild2, 1814927978, false, (String) objArr18[0], null);
        }
        Object[] objArr19 = {((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).get(null)};
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-645763082);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
            char cNormalizeMetaState = (char) KeyEvent.normalizeMetaState(0);
            int i14 = 2823 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
            int pressedStateDuration = (ViewConfiguration.getPressedStateDuration() >> 16) + 22;
            byte[] bArr5 = $$d;
            Object[] objArr20 = new Object[1];
            e((byte) 51, (byte) (bArr5[19] - 1), bArr5[7], objArr20);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(cNormalizeMetaState, i14, pressedStateDuration, 1025296417, false, (String) objArr20[0], new Class[]{Object.class});
        }
        ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).invoke(null, objArr19);
        Object[] objArr21 = {0, methodArr, null};
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1189131659);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
            char cRgb = (char) ((-16739559) - Color.rgb(0, 0, 0));
            int iIndexOf = 2720 - TextUtils.indexOf("", "", 0, 0);
            int modifierMetaStateMask = 18 - ((byte) KeyEvent.getModifierMetaStateMask());
            byte[] bArr6 = $$d;
            Object[] objArr22 = new Object[1];
            e((byte) 51, (byte) (bArr6[19] - 1), bArr6[7], objArr22);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(cRgb, iIndexOf, modifierMetaStateMask, -1568796068, false, (String) objArr22[0], new Class[]{Integer.TYPE, Method[].class, List.class});
        }
        long jLongValue = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).invoke(null, objArr21)).longValue();
        long j = -1253588201;
        long j2 = -1;
        long j3 = j ^ j2;
        long j4 = (((long) 592) * j) + (((long) (-590)) * jLongValue) + (((long) (-1182)) * ((j3 | jLongValue) ^ j2));
        long j5 = jLongValue ^ j2;
        long jFreeMemory = (int) Runtime.getRuntime().freeMemory();
        long j6 = j4 + ((((jLongValue | j) ^ j2) | (((j3 | j5) | (jFreeMemory ^ j2)) ^ j2)) * ((long) (-591))) + (((long) 591) * (jFreeMemory | j3 | j5)) + ((long) (-556817644));
        int elapsedCpuTime = (int) Process.getElapsedCpuTime();
        int i15 = ~elapsedCpuTime;
        int i16 = (-2037155478) + (((~((-1446143506) | i15)) | (~((-697111023) | elapsedCpuTime))) * 520);
        int i17 = ~(697111022 | i15);
        int i18 = ~(elapsedCpuTime | 2134337433);
        int i19 = ((int) (j6 >> 32)) & (i16 + ((i17 | i18) * (-1040)) + ((i18 | (~(i15 | (-2134337434))) | (-2143254528)) * 520));
        int startElapsedRealtime = (int) Process.getStartElapsedRealtime();
        int i20 = ~startElapsedRealtime;
        int i21 = i19 | (((int) j6) & ((-1871736089) + (((~(1955766169 | i20)) | (~((-518539760) | startElapsedRealtime))) * 1900) + (((~(i20 | 518539759)) | (~((-1955766170) | startElapsedRealtime))) * (-950)) + (((~(startElapsedRealtime | 518539759)) | (~(i20 | (-1955766170)))) * 950)));
        int i22 = i21 >>> 24;
        int i23 = i21 & ViewCompat.MEASURED_SIZE_MASK;
        int i24 = i22 != 0 ? 1 : 0;
        if (i24 == 0 || i23 >= 1) {
            string = null;
        } else {
            int i25 = d + 17;
            f1324a = i25 % 128;
            int i26 = i25 % 2;
            Method method3 = methodArr[i23];
            if (method3 != null) {
                string = method3.toString();
            } else {
                string = null;
            }
        }
        arrayList.add(string);
        if ((i22 + 6) * i24 != 0) {
            Toast.makeText((Context) null, length / (((length - 1) * length) % 2), 0).show();
        }
        try {
            if (str.endsWith(".zip")) {
                return b(new ZipInputStream(context.getAssets().open(str)), str2);
            }
            rateWithExtras<previous> ratewithextrasTuitionPaymentFragmentspecialinlinedviewModeldefault3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3(context.getAssets().open(str), str2);
            int i27 = f1324a + 9;
            d = i27 % 128;
            int i28 = i27 % 2;
            return ratewithextrasTuitionPaymentFragmentspecialinlinedviewModeldefault3;
        } catch (IOException e2) {
            return new rateWithExtras<>((Throwable) e2);
        }
    }

    public static sendCommand<previous> TuitionPaymentFragmentbindingInflater1(Context context, int i) {
        int i2 = 2 % 2;
        sendCommand<previous> sendcommandTuitionPaymentFragmentspecialinlinedviewModeldefault3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3(b(context, i), new AnonymousClass5(new WeakReference(context), context.getApplicationContext(), i));
        int i3 = f1324a + 57;
        d = i3 % 128;
        int i4 = i3 % 2;
        return sendcommandTuitionPaymentFragmentspecialinlinedviewModeldefault3;
    }

    private static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault2(Object[] objArr) {
        Context context = (Context) objArr[0];
        int iIntValue = ((Number) objArr[1]).intValue();
        int i = 2 % 2;
        sendCommand<previous> sendcommandTuitionPaymentFragmentspecialinlinedviewModeldefault3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3((String) null, new AnonymousClass5(new WeakReference(context), context.getApplicationContext(), iIntValue));
        int i2 = f1324a + 5;
        d = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 13 / 0;
        }
        return sendcommandTuitionPaymentFragmentspecialinlinedviewModeldefault3;
    }

    public static rateWithExtras<previous> TuitionPaymentFragmentspecialinlinedviewModeldefault3(Context context, int i) {
        int i2 = 2 % 2;
        int i3 = d + 63;
        f1324a = i3 % 128;
        int i4 = i3 % 2;
        rateWithExtras<previous> ratewithextrasTuitionPaymentFragmentspecialinlinedviewModeldefault2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2(context, i, b(context, i));
        int i5 = d + 29;
        f1324a = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 93 / 0;
        }
        return ratewithextrasTuitionPaymentFragmentspecialinlinedviewModeldefault2;
    }

    private static rateWithExtras<previous> TuitionPaymentFragmentspecialinlinedviewModeldefault2(Context context, int i, String str) {
        int i2 = 2 % 2;
        int i3 = d + 19;
        f1324a = i3 % 128;
        try {
            if (i3 % 2 != 0) {
                TuitionPaymentFragmentspecialinlinedviewModeldefault3(context.getResources().openRawResource(i), str);
                throw null;
            }
            rateWithExtras<previous> ratewithextrasTuitionPaymentFragmentspecialinlinedviewModeldefault3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3(context.getResources().openRawResource(i), str);
            int i4 = f1324a + 101;
            d = i4 % 128;
            int i5 = i4 % 2;
            return ratewithextrasTuitionPaymentFragmentspecialinlinedviewModeldefault3;
        } catch (Resources.NotFoundException e2) {
            return new rateWithExtras<>((Throwable) e2);
        }
    }

    private static String b(Context context, int i) {
        String str;
        int i2 = 2 % 2;
        StringBuilder sb = new StringBuilder("rawRes");
        if ((context.getResources().getConfiguration().uiMode & 48) == 32) {
            int i3 = f1324a + 15;
            d = i3 % 128;
            int i4 = i3 % 2;
            str = "_night_";
        } else {
            int i5 = d + 103;
            f1324a = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 5 / 3;
            }
            str = "_day_";
        }
        sb.append(str);
        sb.append(i);
        return sb.toString();
    }

    public static sendCommand<previous> TuitionPaymentFragmentspecialinlinedviewModeldefault2(final InputStream inputStream, final String str) {
        int i = 2 % 2;
        sendCommand<previous> sendcommandTuitionPaymentFragmentspecialinlinedviewModeldefault3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3(str, new Callable<rateWithExtras<previous>>() { // from class: prepareFromUri.8
            private static short[] asBinder;
            private static final byte[] $$c = {115, 25, -47, -94};
            private static final int $$f = 96;
            private static int $10 = 0;
            private static int $11 = 1;
            private static final byte[] $$d = {0, -94, -62, -97, 20, 6, -55, 60, 22, 2, 17, 9, -1, 18, -63, 62, 5, 27, -11, 9, 15, 13, -2, 13, 13, 1, -49, 32, 52, -9, 14, 14, 0, 17, 14, -43, 58, -2, 10, -34, 42, 25, -3, 21, -9, -13, 25, 25, 10, -3, 2, 14, 15, -7, 21, 14, -41, 46, 19, -3, 25, -13, 17, 13, -3, 9, 15, -36, 51, -4, 26, 0, 0, 17, 14, -42, 47, 13, -2, 13, 13, 1, 41, -4, 19, -3, 14, 7, -22, 25, 32, -4, 0, 17, 14, -38, 52, -9, 14, 14, 0, 17, 14, 7, 5, -3, 6, 14, 0, 19, 5, 13, 6, 5, 13, -1, 7, 26, -5, 4, 26, -34, 42, -3, 9, 15, 0, 9, 9, 3, 28, -1, 16, -58};
            private static final int $$e = 40;
            private static final byte[] $$a = {119, -102, -34, -3, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -55, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -54, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, -7, 18, 16, 1, 16, 16, 4, -19, 48, 3, 17, 0, 30, -4, 24, -54};
            private static final int $$b = 213;
            private static int g = 0;
            private static int asInterface = 1;
            private static int TuitionPaymentFragmentbindingInflater1 = 1143807971;
            private static int b = -1934795636;
            private static int TuitionPaymentFragmentspecialinlinedviewModeldefault3 = -470895073;
            private static byte[] d = {74, -18, 18, -27, -49, 48, -18, 23, -25, 28, -64, -61, 93, -30, -89, 44, 29, 28, 27, -24, 16, -21, 67, 30, -30, 19, -18, -19, 26, -11, 8, 25, 20, -27, -23, 19, -31, 64, -18, 23, -25, 28, -64, -61, 33, 31, -21, 19, -40, 43, 13, -13, 17, 64, -25, 19, -54, Base64.padSymbol, 19, -12, -1, 41, -29, -19, 19, -32, -17, -25, 29};

            /* JADX WARN: Code duplicated, block: B:10:0x0027  */
            /* JADX WARN: Code duplicated, block: B:8:0x001f  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x002b). Please report as a decompilation issue!!! */
            /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0027
                	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                */
            private static void a(int r5, int r6, short r7, java.lang.Object[] r8) {
                /*
                    int r7 = r7 * 2
                    int r7 = r7 + 84
                    int r6 = r6 + 4
                    int r5 = r5 * 15
                    int r0 = 53 - r5
                    byte[] r1 = defpackage.prepareFromUri.AnonymousClass8.$$a
                    byte[] r0 = new byte[r0]
                    int r5 = 52 - r5
                    r2 = 0
                    if (r1 != 0) goto L17
                    r4 = r7
                    r3 = r2
                    r7 = r5
                    goto L2b
                L17:
                    r3 = r2
                L18:
                    byte r4 = (byte) r7
                    r0[r3] = r4
                    int r6 = r6 + 1
                    if (r3 != r5) goto L27
                    java.lang.String r5 = new java.lang.String
                    r5.<init>(r0, r2)
                    r8[r2] = r5
                    return
                L27:
                    int r3 = r3 + 1
                    r4 = r1[r6]
                L2b:
                    int r7 = r7 + r4
                    int r7 = r7 + (-11)
                    goto L18
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.prepareFromUri.AnonymousClass8.a(int, int, short, java.lang.Object[]):void");
            }

            /* JADX WARN: Code duplicated, block: B:10:0x0027  */
            /* JADX WARN: Code duplicated, block: B:8:0x001f  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x002e). Please report as a decompilation issue!!! */
            /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0027
                	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                */
            private static void e(short r7, short r8, short r9, java.lang.Object[] r10) {
                /*
                    int r9 = r9 * 15
                    int r9 = r9 + 84
                    int r7 = r7 * 78
                    int r7 = 81 - r7
                    byte[] r0 = defpackage.prepareFromUri.AnonymousClass8.$$d
                    int r8 = r8 * 26
                    int r8 = r8 + 53
                    byte[] r1 = new byte[r8]
                    r2 = 0
                    if (r0 != 0) goto L17
                    r9 = r7
                    r3 = r8
                    r4 = r2
                    goto L2e
                L17:
                    r3 = r2
                L18:
                    int r4 = r3 + 1
                    byte r5 = (byte) r9
                    r1[r3] = r5
                    if (r4 != r8) goto L27
                    java.lang.String r7 = new java.lang.String
                    r7.<init>(r1, r2)
                    r10[r2] = r7
                    return
                L27:
                    int r7 = r7 + 1
                    r3 = r0[r7]
                    r6 = r9
                    r9 = r7
                    r7 = r6
                L2e:
                    int r7 = r7 + r3
                    int r7 = r7 + (-8)
                    r3 = r4
                    r6 = r9
                    r9 = r7
                    r7 = r6
                    goto L18
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.prepareFromUri.AnonymousClass8.e(short, short, short, java.lang.Object[]):void");
            }

            /* JADX WARN: Code duplicated, block: B:56:0x0267  */
            private static void c(int i2, int i3, short s, byte b2, int i4, Object[] objArr) throws Throwable {
                boolean z;
                int i5;
                boolean z2;
                int i6 = 2 % 2;
                SessionConfigValidatingBuilderExternalSyntheticLambda0 sessionConfigValidatingBuilderExternalSyntheticLambda0 = new SessionConfigValidatingBuilderExternalSyntheticLambda0();
                StringBuilder sb = new StringBuilder();
                try {
                    Object[] objArr2 = {Integer.valueOf(i3), Integer.valueOf(b)};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1238528667);
                    long j = 0;
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        char mode = (char) View.MeasureSpec.getMode(0);
                        int i7 = (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 2266;
                        int maxKeyCode = (KeyEvent.getMaxKeyCode() >> 16) + 33;
                        byte length = (byte) $$c.length;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(mode, i7, maxKeyCode, 1387473586, false, $$g((byte) 0, length, (byte) (length - 4)), new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).intValue();
                    if (iIntValue == -1) {
                        z = true;
                    } else {
                        int i8 = $10 + 21;
                        $11 = i8 % 128;
                        int i9 = i8 % 2;
                        z = false;
                    }
                    if (z) {
                        byte[] bArr = d;
                        if (bArr != null) {
                            int i10 = $11 + 123;
                            $10 = i10 % 128;
                            int i11 = i10 % 2;
                            int length2 = bArr.length;
                            byte[] bArr2 = new byte[length2];
                            int i12 = 0;
                            while (i12 < length2) {
                                Object[] objArr3 = {Integer.valueOf(bArr[i12])};
                                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(632534666);
                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                    byte b3 = (byte) 0;
                                    byte b4 = b3;
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (ExpandableListView.getPackedPositionForGroup(0) > j ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == j ? 0 : -1)), View.MeasureSpec.makeMeasureSpec(0, 0) + 3358, 18 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), -1054011043, false, $$g(b3, b4, b4), new Class[]{Integer.TYPE});
                                }
                                bArr2[i12] = ((Byte) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).byteValue();
                                i12++;
                                j = 0;
                            }
                            bArr = bArr2;
                        }
                        if (bArr != null) {
                            byte[] bArr3 = d;
                            Object[] objArr4 = {Integer.valueOf(i4), Integer.valueOf(TuitionPaymentFragmentbindingInflater1)};
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1238528667);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                                char touchSlop = (char) (ViewConfiguration.getTouchSlop() >> 8);
                                int iLastIndexOf = 2266 - TextUtils.lastIndexOf("", '0');
                                int offsetBefore = TextUtils.getOffsetBefore("", 0) + 33;
                                byte length3 = (byte) $$c.length;
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(touchSlop, iLastIndexOf, offsetBefore, 1387473586, false, $$g((byte) 0, length3, (byte) (length3 - 4)), new Class[]{Integer.TYPE, Integer.TYPE});
                            }
                            iIntValue = (byte) (((byte) (((long) bArr3[((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4)).intValue()]) ^ 3046761265686732006L)) + ((int) (((long) b) ^ 3046761265686732006L)));
                        } else {
                            iIntValue = (short) (((short) (((long) asBinder[i4 + ((int) (((long) TuitionPaymentFragmentbindingInflater1) ^ 3046761265686732006L))]) ^ 3046761265686732006L)) + ((int) (((long) b) ^ 3046761265686732006L)));
                        }
                    }
                    if (iIntValue > 0) {
                        int i13 = $11 + 83;
                        int i14 = i13 % 128;
                        $10 = i14;
                        int i15 = i13 % 2;
                        int i16 = ((i4 + iIntValue) - 2) + ((int) (((long) TuitionPaymentFragmentbindingInflater1) ^ 3046761265686732006L));
                        if (z) {
                            int i17 = i14 + 113;
                            $11 = i17 % 128;
                            int i18 = i17 % 2;
                            i5 = 1;
                        } else {
                            i5 = 0;
                        }
                        sessionConfigValidatingBuilderExternalSyntheticLambda0.b = i16 + i5;
                        Object[] objArr5 = {sessionConfigValidatingBuilderExternalSyntheticLambda0, Integer.valueOf(i2), Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault3), sb};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1079014435);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                            byte b5 = (byte) 0;
                            byte b6 = (byte) (b5 + 3);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (TextUtils.indexOf((CharSequence) "", '0', 0) + 55905), (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 2855, 13 - ((Process.getThreadPriority(0) + 20) >> 6), -1529949196, false, $$g(b5, b6, (byte) (b6 - 3)), new Class[]{Object.class, Integer.TYPE, Integer.TYPE, Object.class});
                        }
                        ((StringBuilder) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).append(sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
                        sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                        byte[] bArr4 = d;
                        if (bArr4 != null) {
                            int length4 = bArr4.length;
                            byte[] bArr5 = new byte[length4];
                            int i19 = 0;
                            while (i19 < length4) {
                                int i20 = $10 + 107;
                                $11 = i20 % 128;
                                if (i20 % 2 == 0) {
                                    bArr5[i19] = (byte) (((long) bArr4[i19]) | 3046761265686732006L);
                                } else {
                                    bArr5[i19] = (byte) (((long) bArr4[i19]) ^ 3046761265686732006L);
                                    i19++;
                                }
                            }
                            bArr4 = bArr5;
                        }
                        if (bArr4 != null) {
                            int i21 = $11 + 57;
                            $10 = i21 % 128;
                            if (i21 % 2 != 0) {
                                z2 = false;
                            } else {
                                z2 = true;
                            }
                        } else {
                            z2 = false;
                        }
                        sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 1;
                        while (sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3 < iIntValue) {
                            int i22 = $11 + 3;
                            $10 = i22 % 128;
                            if (i22 % 2 != 0) {
                                Object obj = null;
                                obj.hashCode();
                                throw null;
                            }
                            if (z2) {
                                byte[] bArr6 = d;
                                int i23 = sessionConfigValidatingBuilderExternalSyntheticLambda0.b;
                                sessionConfigValidatingBuilderExternalSyntheticLambda0.b = i23 - 1;
                                sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = (char) (sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2 + (((byte) (((byte) (((long) bArr6[i23]) ^ 3046761265686732006L)) + s)) ^ b2));
                            } else {
                                short[] sArr = asBinder;
                                int i24 = sessionConfigValidatingBuilderExternalSyntheticLambda0.b;
                                sessionConfigValidatingBuilderExternalSyntheticLambda0.b = i24 - 1;
                                sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = (char) (sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2 + (((short) (((short) (((long) sArr[i24]) ^ 3046761265686732006L)) + s)) ^ b2));
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

            @Override // java.util.concurrent.Callable
            public final /* synthetic */ rateWithExtras<previous> call() throws Exception {
                int i2 = 2 % 2;
                int i3 = asInterface + 47;
                g = i3 % 128;
                if (i3 % 2 == 0) {
                    return TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                }
                TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                throw null;
            }

            private rateWithExtras<previous> TuitionPaymentFragmentspecialinlinedviewModeldefault2() throws Throwable {
                char c;
                Object[] objArr;
                int i2 = 2 % 2;
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1354724972);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    char tapTimeout = (char) (43042 - (ViewConfiguration.getTapTimeout() >> 16));
                    int defaultSize = 3111 - View.getDefaultSize(0, 0);
                    int i3 = (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 22;
                    byte[] bArr = $$a;
                    byte b2 = bArr[7];
                    Object[] objArr2 = new Object[1];
                    a(b2, bArr[5], b2, objArr2);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(tapTimeout, defaultSize, i3, -1272852037, false, (String) objArr2[0], null);
                }
                long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
                Object[] objArr3 = new Object[1];
                c((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) - 1866721945, (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) - 108, (short) TextUtils.getOffsetAfter("", 0), (byte) (Process.myTid() >> 22), View.MeasureSpec.getMode(0) + 931118331, objArr3);
                Class<?> cls = Class.forName((String) objArr3[0]);
                Object[] objArr4 = new Object[1];
                c((-1866721940) - (ViewConfiguration.getTapTimeout() >> 16), (ViewConfiguration.getFadingEdgeLength() >> 16) - 107, (short) TextUtils.indexOf("", "", 0, 0), (byte) View.getDefaultSize(0, 0), 931118352 - TextUtils.indexOf((CharSequence) "", '0'), objArr4);
                long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1355648493);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                    char offsetAfter = (char) (43042 - TextUtils.getOffsetAfter("", 0));
                    int defaultSize2 = View.getDefaultSize(0, 0) + 3111;
                    int iResolveSize = 22 - View.resolveSize(0, 0);
                    byte b3 = $$a[7];
                    byte b4 = b3;
                    Object[] objArr5 = new Object[1];
                    a(b4, (byte) (b4 | 51), b3, objArr5);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(offsetAfter, defaultSize2, iResolveSize, -1269618118, false, (String) objArr5[0], null);
                }
                if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-308143642);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                        char gidForName = (char) (Process.getGidForName("") + 43043);
                        int doubleTapTimeout = 3111 - (ViewConfiguration.getDoubleTapTimeout() >> 16);
                        int iLastIndexOf = TextUtils.lastIndexOf("", '0') + 23;
                        byte[] bArr2 = $$a;
                        byte b5 = bArr2[132];
                        Object[] objArr6 = new Object[1];
                        a(b5, (byte) (b5 | 102), bArr2[7], objArr6);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(gidForName, doubleTapTimeout, iLastIndexOf, 154975793, false, (String) objArr6[0], null);
                    }
                    Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
                    int i4 = ((int[]) objArr7[2])[0];
                    int i5 = ((int[]) objArr7[1])[0];
                    String[] strArr = (String[]) objArr7[3];
                    int[] iArr = {i4};
                    int[] iArr2 = {i5};
                    int iNextInt = new Random().nextInt();
                    int i6 = ~iNextInt;
                    int i7 = (-664046006) + ((iNextInt | 1044385660) * 140) + (((~(1044385660 | i6)) | 18915458) * (-280)) + (((~(iNextInt | (-18915459))) | (~(660645798 | i6)) | 402655320) * 140) + 364330324;
                    int i8 = (i7 << 13) ^ i7;
                    int i9 = i8 ^ (i8 >>> 17);
                    ((int[]) objArr[0])[0] = i9 ^ (i9 << 5);
                    objArr = new Object[]{new int[1], iArr2, iArr, strArr};
                    c = 2;
                } else {
                    Object[] objArr8 = new Object[1];
                    c((-1866721935) - (ViewConfiguration.getWindowTouchSlop() >> 8), TextUtils.indexOf((CharSequence) "", '0', 0) - 106, (short) (ViewConfiguration.getScrollBarFadeDuration() >> 16), (byte) (1 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))), (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 931118367, objArr8);
                    Class<?> cls2 = Class.forName((String) objArr8[0]);
                    Object[] objArr9 = new Object[1];
                    c((PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) - 1866721936, View.MeasureSpec.getMode(0) - 107, (short) (ViewConfiguration.getJumpTapTimeout() >> 16), (byte) Drawable.resolveOpacity(0, 0), 931118384 - Color.alpha(0), objArr9);
                    try {
                        Object[] objArr10 = {null, Integer.valueOf(((Integer) cls2.getMethod((String) objArr9[0], Object.class).invoke(null, this)).intValue()), 0, 364330324};
                        byte[] bArr3 = $$d;
                        byte b6 = bArr3[25];
                        byte b7 = b6;
                        Object[] objArr11 = new Object[1];
                        e(b6, b7, b7, objArr11);
                        Class<?> cls3 = Class.forName((String) objArr11[0]);
                        byte b8 = bArr3[0];
                        byte b9 = b8;
                        Object[] objArr12 = new Object[1];
                        e(b8, b9, b9, objArr12);
                        Object[] objArr13 = (Object[]) cls3.getMethod((String) objArr12[0], Class.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr10);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-308143642);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                            char cLastIndexOf = (char) (TextUtils.lastIndexOf("", '0') + 43043);
                            int pressedStateDuration = 3111 - (ViewConfiguration.getPressedStateDuration() >> 16);
                            int i10 = 21 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1));
                            byte[] bArr4 = $$a;
                            byte b10 = bArr4[132];
                            Object[] objArr14 = new Object[1];
                            a(b10, (byte) (b10 | 102), bArr4[7], objArr14);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(cLastIndexOf, pressedStateDuration, i10, 154975793, false, (String) objArr14[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr13);
                        try {
                            Object[] objArr15 = new Object[1];
                            c(TextUtils.indexOf("", "") - 1866721944, (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) - 108, (short) (ViewConfiguration.getLongPressTimeout() >> 16), (byte) (TextUtils.indexOf((CharSequence) "", '0', 0) + 1), (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 931118330, objArr15);
                            Class<?> cls4 = Class.forName((String) objArr15[0]);
                            Object[] objArr16 = new Object[1];
                            c((ViewConfiguration.getKeyRepeatDelay() >> 16) - 1866721940, (-107) - (ViewConfiguration.getScrollBarFadeDuration() >> 16), (short) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) - 1), (byte) ExpandableListView.getPackedPositionGroup(0L), 931118353 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), objArr16);
                            long jLongValue2 = ((Long) cls4.getDeclaredMethod((String) objArr16[0], new Class[0]).invoke(null, new Object[0])).longValue();
                            Long lValueOf = Long.valueOf(jLongValue2);
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1355648493);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                                char cArgb = (char) (43042 - Color.argb(0, 0, 0, 0));
                                int i11 = 3110 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1));
                                int offsetBefore = TextUtils.getOffsetBefore("", 0) + 22;
                                byte b11 = $$a[7];
                                byte b12 = b11;
                                Object[] objArr17 = new Object[1];
                                a(b12, (byte) (b12 | 51), b11, objArr17);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(cArgb, i11, offsetBefore, -1269618118, false, (String) objArr17[0], null);
                            }
                            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                            Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1354724972);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                                char c2 = (char) ((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 43041);
                                int i12 = 3112 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1));
                                int i13 = (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 21;
                                byte[] bArr5 = $$a;
                                byte b13 = bArr5[7];
                                Object[] objArr18 = new Object[1];
                                a(b13, bArr5[5], b13, objArr18);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(c2, i12, i13, -1272852037, false, (String) objArr18[0], null);
                            }
                            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf2);
                            int i14 = g + 75;
                            asInterface = i14 % 128;
                            c = 2;
                            int i15 = i14 % 2;
                            objArr = objArr13;
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
                int i16 = ((int[]) objArr[1])[0];
                int i17 = ((int[]) objArr[c])[0];
                if (i17 == i16) {
                    Object[] objArr19 = new Object[4];
                    objArr19[0] = new int[1];
                    objArr19[1] = new int[]{i};
                    objArr19[c] = new int[]{i};
                    int i18 = ((int[]) objArr[0])[0];
                    int i19 = ((int[]) objArr[c])[0];
                    int i20 = ((int[]) objArr[1])[0];
                    String[] strArr2 = (String[]) objArr[3];
                    int iIdentityHashCode = System.identityHashCode(this);
                    int i21 = i18 + (-1744362186) + (((~iIdentityHashCode) | 809631784) * 1324) + (((~(iIdentityHashCode | 893793914)) | (~(811237544 | iIdentityHashCode))) * (-1324)) + 943768332;
                    int i22 = (i21 << 13) ^ i21;
                    int i23 = i22 ^ (i22 >>> 17);
                    ((int[]) objArr19[0])[0] = i23 ^ (i23 << 5);
                    objArr19[3] = strArr2;
                } else {
                    ArrayList arrayList = new ArrayList();
                    String[] strArr3 = (String[]) objArr[3];
                    if (strArr3 != null) {
                        int i24 = 0;
                        while (i24 < strArr3.length) {
                            int i25 = asInterface + 109;
                            g = i25 % 128;
                            if (i25 % 2 != 0) {
                                arrayList.add(strArr3[i24]);
                                i24 += 82;
                            } else {
                                arrayList.add(strArr3[i24]);
                                i24++;
                            }
                        }
                    }
                    Toast.makeText((Context) null, i17 / (((i17 - 1) * i17) % 2), 0).show();
                    int i26 = ((int[]) objArr[0])[0];
                    int i27 = ((int[]) objArr[2])[0];
                    int i28 = ((int[]) objArr[1])[0];
                    String[] strArr4 = (String[]) objArr[3];
                    int i29 = ~(Process.myTid() | 912074363);
                    int i30 = i26 + (((421443292 | i29) * (-658)) - 839170734) + ((i29 | 151163012) * 658);
                    int i31 = (i30 << 13) ^ i30;
                    int i32 = i31 ^ (i31 >>> 17);
                    ((int[]) objArr[0])[0] = i32 ^ (i32 << 5);
                    Object[] objArr20 = {new int[1], new int[]{i28}, new int[]{i27}, strArr4};
                }
                return prepareFromUri.TuitionPaymentFragmentbindingInflater1(inputStream, str);
            }

            /* JADX WARN: Code duplicated, block: B:10:0x0021  */
            /* JADX WARN: Code duplicated, block: B:8:0x001b  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0021 -> B:11:0x0025). Please report as a decompilation issue!!! */
            /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0021
                	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                */
            private static java.lang.String $$g(short r5, int r6, short r7) {
                /*
                    byte[] r0 = defpackage.prepareFromUri.AnonymousClass8.$$c
                    int r6 = 121 - r6
                    int r7 = r7 * 2
                    int r7 = r7 + 4
                    int r5 = r5 * 3
                    int r1 = r5 + 1
                    byte[] r1 = new byte[r1]
                    r2 = 0
                    if (r0 != 0) goto L15
                    r4 = r5
                    r6 = r7
                    r3 = r2
                    goto L25
                L15:
                    r3 = r2
                L16:
                    byte r4 = (byte) r6
                    r1[r3] = r4
                    if (r3 != r5) goto L21
                    java.lang.String r5 = new java.lang.String
                    r5.<init>(r1, r2)
                    return r5
                L21:
                    int r3 = r3 + 1
                    r4 = r0[r7]
                L25:
                    int r7 = r7 + 1
                    int r4 = -r4
                    int r6 = r6 + r4
                    goto L16
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.prepareFromUri.AnonymousClass8.$$g(short, int, short):java.lang.String");
            }
        });
        int i2 = f1324a + 57;
        d = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 47 / 0;
        }
        return sendcommandTuitionPaymentFragmentspecialinlinedviewModeldefault3;
    }

    public static rateWithExtras<previous> TuitionPaymentFragmentbindingInflater1(InputStream inputStream, String str) {
        int i = 2 % 2;
        int i2 = f1324a + 45;
        d = i2 % 128;
        if (i2 % 2 == 0) {
            TuitionPaymentFragmentspecialinlinedviewModeldefault3(inputStream, str);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        rateWithExtras<previous> ratewithextrasTuitionPaymentFragmentspecialinlinedviewModeldefault3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3(inputStream, str);
        int i3 = d + 121;
        f1324a = i3 % 128;
        int i4 = i3 % 2;
        return ratewithextrasTuitionPaymentFragmentspecialinlinedviewModeldefault3;
    }

    private static rateWithExtras<previous> TuitionPaymentFragmentspecialinlinedviewModeldefault3(InputStream inputStream, String str) {
        int i = 2 % 2;
        int i2 = f1324a + 45;
        d = i2 % 128;
        try {
            rateWithExtras<previous> ratewithextrasTuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 2 == 0 ? TuitionPaymentFragmentspecialinlinedviewModeldefault3(JsonReader.b(SurfaceViewImplementation.TuitionPaymentFragmentspecialinlinedviewModeldefault3(SurfaceViewImplementation.TuitionPaymentFragmentspecialinlinedviewModeldefault2(inputStream))), str, false) : TuitionPaymentFragmentspecialinlinedviewModeldefault3(JsonReader.b(SurfaceViewImplementation.TuitionPaymentFragmentspecialinlinedviewModeldefault3(SurfaceViewImplementation.TuitionPaymentFragmentspecialinlinedviewModeldefault2(inputStream))), str, true);
            onSkipToPrevious.TuitionPaymentFragmentbindingInflater1(inputStream);
            return ratewithextrasTuitionPaymentFragmentspecialinlinedviewModeldefault3;
        } catch (Throwable th) {
            onSkipToPrevious.TuitionPaymentFragmentbindingInflater1(inputStream);
            throw th;
        }
    }

    private static rateWithExtras<previous> TuitionPaymentFragmentspecialinlinedviewModeldefault3(JsonReader jsonReader, String str, boolean z) {
        MediaControllerCompatMediaControllerImplBase mediaControllerCompatMediaControllerImplBaseTuitionPaymentFragmentspecialinlinedviewModeldefault3;
        int i = 2 % 2;
        int i2 = d + 101;
        f1324a = i2 % 128;
        int i3 = i2 % 2;
        try {
            try {
                previous previousVarB = handleMediaPlayPauseKeySingleTapIfPending.b(jsonReader);
                if (str != null) {
                    int i4 = f1324a + 47;
                    d = i4 % 128;
                    if (i4 % 2 == 0) {
                        mediaControllerCompatMediaControllerImplBaseTuitionPaymentFragmentspecialinlinedviewModeldefault3 = MediaControllerCompatMediaControllerImplBase.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
                        int i5 = 29 / 0;
                        if (str != null) {
                            mediaControllerCompatMediaControllerImplBaseTuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault2.put(str, previousVarB);
                        }
                    } else {
                        mediaControllerCompatMediaControllerImplBaseTuitionPaymentFragmentspecialinlinedviewModeldefault3 = MediaControllerCompatMediaControllerImplBase.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
                        if (str != null) {
                            mediaControllerCompatMediaControllerImplBaseTuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault2.put(str, previousVarB);
                        }
                    }
                }
                rateWithExtras<previous> ratewithextras = new rateWithExtras<>(previousVarB);
                if (!(!z)) {
                    int i6 = f1324a + 77;
                    d = i6 % 128;
                    int i7 = i6 % 2;
                    onSkipToPrevious.TuitionPaymentFragmentbindingInflater1(jsonReader);
                    if (i7 == 0) {
                        Object obj = null;
                        obj.hashCode();
                        throw null;
                    }
                }
                return ratewithextras;
            } catch (Exception e2) {
                rateWithExtras<previous> ratewithextras2 = new rateWithExtras<>(e2);
                if (z) {
                    onSkipToPrevious.TuitionPaymentFragmentbindingInflater1(jsonReader);
                }
                return ratewithextras2;
            }
        } catch (Throwable th) {
            if (z) {
                onSkipToPrevious.TuitionPaymentFragmentbindingInflater1(jsonReader);
            }
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.io.Closeable, java.util.zip.ZipInputStream] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r3v4, types: [int] */
    public static rateWithExtras<previous> b(ZipInputStream zipInputStream, String str) {
        rateWithExtras<previous> ratewithextrasTuitionPaymentFragmentspecialinlinedviewModeldefault3;
        int i = 2 % 2;
        int i2 = f1324a + 59;
        d = i2 % 128;
        try {
            if (i2 % 2 == 0) {
                ratewithextrasTuitionPaymentFragmentspecialinlinedviewModeldefault3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3((ZipInputStream) zipInputStream, str);
                onSkipToPrevious.TuitionPaymentFragmentbindingInflater1((Closeable) zipInputStream);
                int i3 = 61 / 0;
            } else {
                ratewithextrasTuitionPaymentFragmentspecialinlinedviewModeldefault3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3((ZipInputStream) zipInputStream, str);
                onSkipToPrevious.TuitionPaymentFragmentbindingInflater1((Closeable) zipInputStream);
            }
            int i4 = d + 17;
            f1324a = i4 % 128;
            zipInputStream = i4 % 2;
            return ratewithextrasTuitionPaymentFragmentspecialinlinedviewModeldefault3;
        } catch (Throwable th) {
            onSkipToPrevious.TuitionPaymentFragmentbindingInflater1((Closeable) zipInputStream);
            throw th;
        }
    }

    private static rateWithExtras<previous> TuitionPaymentFragmentspecialinlinedviewModeldefault3(ZipInputStream zipInputStream, String str) {
        prepareFromMediaId next;
        int i;
        int i2 = 2 % 2;
        HashMap map = new HashMap();
        try {
            ZipEntry nextEntry = zipInputStream.getNextEntry();
            Object obj = null;
            previous previousVar = null;
            while (nextEntry != null) {
                String name = nextEntry.getName();
                if (name.contains("__MACOSX")) {
                    zipInputStream.closeEntry();
                } else {
                    if (nextEntry.getName().contains(".json")) {
                        previousVar = TuitionPaymentFragmentspecialinlinedviewModeldefault3(JsonReader.b(SurfaceViewImplementation.TuitionPaymentFragmentspecialinlinedviewModeldefault3(SurfaceViewImplementation.TuitionPaymentFragmentspecialinlinedviewModeldefault2(zipInputStream))), (String) null, false).TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                        i = f1324a + 59;
                    } else {
                        if (!name.contains(".png")) {
                            int i3 = f1324a + 71;
                            d = i3 % 128;
                            if (i3 % 2 == 0) {
                                name.contains(".webp");
                                throw null;
                            }
                            if (!name.contains(".webp")) {
                                zipInputStream.closeEntry();
                            }
                        }
                        String[] strArrSplit = name.split("/");
                        map.put(strArrSplit[strArrSplit.length - 1], BitmapFactory.decodeStream(zipInputStream));
                        i = f1324a + 113;
                    }
                    d = i % 128;
                    int i4 = i % 2;
                }
                nextEntry = zipInputStream.getNextEntry();
            }
            if (previousVar == null) {
                return new rateWithExtras<>((Throwable) new IllegalArgumentException("Unable to parse composition"));
            }
            for (Map.Entry entry : map.entrySet()) {
                int i5 = f1324a + 23;
                d = i5 % 128;
                int i6 = i5 % 2;
                String str2 = (String) entry.getKey();
                Iterator<prepareFromMediaId> it = previousVar.g.values().iterator();
                int i7 = d + 51;
                f1324a = i7 % 128;
                int i8 = i7 % 2;
                do {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                } while (!next.TuitionPaymentFragmentbindingInflater1.equals(str2));
                if (next != null) {
                    int i9 = f1324a + 33;
                    d = i9 % 128;
                    if (i9 % 2 == 0) {
                        next.b = onSkipToPrevious.b((Bitmap) entry.getValue(), next.TuitionPaymentFragmentspecialinlinedviewModeldefault1, next.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
                        obj.hashCode();
                        throw null;
                    }
                    next.b = onSkipToPrevious.b((Bitmap) entry.getValue(), next.TuitionPaymentFragmentspecialinlinedviewModeldefault1, next.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
                }
            }
            Iterator<Map.Entry<String, prepareFromMediaId>> it2 = previousVar.g.entrySet().iterator();
            while (it2.hasNext()) {
                int i10 = f1324a + 85;
                d = i10 % 128;
                if (i10 % 2 == 0) {
                    Bitmap bitmap = it2.next().getValue().b;
                    throw null;
                }
                Map.Entry<String, prepareFromMediaId> next2 = it2.next();
                if (next2.getValue().b == null) {
                    StringBuilder sb = new StringBuilder("There is no image for ");
                    sb.append(next2.getValue().TuitionPaymentFragmentbindingInflater1);
                    return new rateWithExtras<>((Throwable) new IllegalStateException(sb.toString()));
                }
            }
            if (str != null) {
                MediaControllerCompatMediaControllerImplBase mediaControllerCompatMediaControllerImplBaseTuitionPaymentFragmentspecialinlinedviewModeldefault3 = MediaControllerCompatMediaControllerImplBase.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
                if (str != null) {
                    mediaControllerCompatMediaControllerImplBaseTuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault2.put(str, previousVar);
                }
            }
            return new rateWithExtras<>(previousVar);
        } catch (IOException e2) {
            return new rateWithExtras<>((Throwable) e2);
        }
    }

    private static sendCommand<previous> TuitionPaymentFragmentspecialinlinedviewModeldefault3(final String str, Callable<rateWithExtras<previous>> callable) {
        int i = 2 % 2;
        final previous previousVar = null;
        if (str == null) {
            int i2 = f1324a + 87;
            d = i2 % 128;
            if (i2 % 2 == 0) {
                previousVar.hashCode();
                throw null;
            }
        } else {
            MediaControllerCompatMediaControllerImplBase mediaControllerCompatMediaControllerImplBaseTuitionPaymentFragmentspecialinlinedviewModeldefault3 = MediaControllerCompatMediaControllerImplBase.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
            if (str != null) {
                previousVar = mediaControllerCompatMediaControllerImplBaseTuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault2.get(str);
            }
        }
        if (previousVar != null) {
            return new sendCommand<>(new Callable<rateWithExtras<previous>>() { // from class: prepareFromUri.9
                @Override // java.util.concurrent.Callable
                public final /* synthetic */ rateWithExtras<previous> call() throws Exception {
                    return new rateWithExtras<>(previousVar);
                }
            });
        }
        if (str != null) {
            Map<String, sendCommand<previous>> map = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            if (map.containsKey(str)) {
                int i3 = f1324a + 87;
                d = i3 % 128;
                int i4 = i3 % 2;
                return map.get(str);
            }
        }
        sendCommand<previous> sendcommand = new sendCommand<>(callable);
        if (str != null) {
            sendcommand.b(new removeQueueItemAt<previous>() { // from class: prepareFromUri.3
                @Override // defpackage.removeQueueItemAt
                public final /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault3(previous previousVar2) {
                    int iB = zze.b();
                    int iB2 = zze.b();
                    int iB3 = zze.b();
                    ((Map) prepareFromUri.TuitionPaymentFragmentspecialinlinedviewModeldefault2(iB, zze.b(), 1341221897, iB3, new Object[0], iB2, -1341221895)).remove(str);
                }
            });
            sendcommand.TuitionPaymentFragmentbindingInflater1(new removeQueueItemAt<Throwable>() { // from class: prepareFromUri.2
                @Override // defpackage.removeQueueItemAt
                public final /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault3(Throwable th) {
                    int iB = zze.b();
                    int iB2 = zze.b();
                    int iB3 = zze.b();
                    ((Map) prepareFromUri.TuitionPaymentFragmentspecialinlinedviewModeldefault2(iB, zze.b(), 1341221897, iB3, new Object[0], iB2, -1341221895)).remove(str);
                }
            });
            TuitionPaymentFragmentspecialinlinedviewModeldefault2.put(str, sendcommand);
            int i5 = d + 29;
            f1324a = i5 % 128;
            int i6 = i5 % 2;
        }
        return sendcommand;
    }

    static /* synthetic */ Map TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        int iB = zze.b();
        int iB2 = zze.b();
        int iB3 = zze.b();
        return (Map) TuitionPaymentFragmentspecialinlinedviewModeldefault2(iB, zze.b(), 1341221897, iB3, new Object[0], iB2, -1341221895);
    }

    public static sendCommand<previous> TuitionPaymentFragmentspecialinlinedviewModeldefault3(Context context, String str, String str2) {
        int iB = zze.b();
        int iB2 = zze.b();
        int iB3 = zze.b();
        return (sendCommand) TuitionPaymentFragmentspecialinlinedviewModeldefault2(iB, zze.b(), 2009335379, iB3, new Object[]{context, str, str2}, iB2, -2009335379);
    }

    public static sendCommand<previous> TuitionPaymentFragmentbindingInflater1(Context context, int i, String str) {
        Object[] objArr = {context, Integer.valueOf(i), str};
        int iB = zze.b();
        int iB2 = zze.b();
        return (sendCommand) TuitionPaymentFragmentspecialinlinedviewModeldefault2(iB, zze.b(), 262616839, zze.b(), objArr, iB2, -262616838);
    }

    static void b() {
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = new char[]{45558, 34471, 57182, 6131, 27866, 42290, 64993, 12932, 2859, 17304, 39018, 53543, 10690, 32354, 46869, 36793, 50248, 7496, 21893, 43607, 58080, 15254, 28751, 18670, 23111, 27935, 13536, 64611, 34599, 20102, 5717, 55600, 57497, 43119, 29654, 14989, 15818, 2715, 21346, 39887, 57574, 10510, 29149, 48824, 34583, 53156, 5206, 23835, 42494, 62046, 15145, 901, 18548, 37236, 55737, 9825, 28364, 47019, 64634, 50399, 3509, 23064, 9511, 4711, 19380, 33569, 63570, 12773, 26916, 42589, 32997, 47037, 60994, 9950, 23951, 37940, 52459, 902, 14908, 29436, 43391, 57388, 6367, 8237, 6005, 20106, 34324, 64835, 13562, 27703, 41809, 39679, 53780, 2475, 16614, 47142, 61345, 9942, 7785, 21913};
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = -8380438032792516922L;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0025  */
    /* JADX WARN: Code duplicated, block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002c). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0025
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$g(int r6, byte r7, byte r8) {
        /*
            int r7 = r7 * 3
            int r7 = r7 + 1
            int r8 = r8 * 3
            int r8 = 115 - r8
            int r6 = r6 * 2
            int r6 = r6 + 4
            byte[] r0 = defpackage.prepareFromUri.$$c
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L17
            r3 = r8
            r4 = r2
            r8 = r6
            goto L2c
        L17:
            r3 = r2
        L18:
            byte r4 = (byte) r8
            r1[r3] = r4
            int r3 = r3 + 1
            if (r3 != r7) goto L25
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L25:
            r4 = r0[r6]
            r5 = r8
            r8 = r6
            r6 = r4
            r4 = r3
            r3 = r5
        L2c:
            int r6 = -r6
            int r6 = r6 + r3
            int r8 = r8 + 1
            r3 = r4
            r5 = r8
            r8 = r6
            r6 = r5
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.prepareFromUri.$$g(int, byte, byte):java.lang.String");
    }
}
