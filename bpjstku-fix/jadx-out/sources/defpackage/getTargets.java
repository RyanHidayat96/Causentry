package defpackage;

import android.content.Context;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.net.Uri;
import android.os.Process;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.util.Log;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.Toast;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.HttpException;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class getTargets implements isUseCasesCombinationSupportedByFramework<InputStream> {
    private static b TuitionPaymentFragmentbindingInflater1 = new TuitionPaymentFragmentspecialinlinedviewModeldefault3();
    private final b TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    private volatile boolean TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    private final getCameraFactoryProvider TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private HttpURLConnection f996a;
    private InputStream b;
    private final int g;

    interface b {
        HttpURLConnection TuitionPaymentFragmentspecialinlinedviewModeldefault3(URL url) throws IOException;
    }

    public getTargets(getCameraFactoryProvider getcamerafactoryprovider, int i) {
        this(getcamerafactoryprovider, i, TuitionPaymentFragmentbindingInflater1);
    }

    private getTargets(getCameraFactoryProvider getcamerafactoryprovider, int i, b bVar) {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = getcamerafactoryprovider;
        this.g = i;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = bVar;
    }

    @Override // defpackage.isUseCasesCombinationSupportedByFramework
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault2(Priority priority, isUseCasesCombinationSupportedByFramework.TuitionPaymentFragmentspecialinlinedviewModeldefault1<? super InputStream> tuitionPaymentFragmentspecialinlinedviewModeldefault1) {
        long jTuitionPaymentFragmentbindingInflater1 = setTargetResolution.TuitionPaymentFragmentbindingInflater1();
        try {
            try {
                getCameraFactoryProvider getcamerafactoryprovider = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                if (getcamerafactoryprovider.TuitionPaymentFragmentspecialinlinedviewModeldefault2 == null) {
                    if (TextUtils.isEmpty(getcamerafactoryprovider.b)) {
                        String string = getcamerafactoryprovider.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                        if (TextUtils.isEmpty(string)) {
                            URL url = getcamerafactoryprovider.asBinder;
                            if (url != null) {
                                string = url.toString();
                            } else {
                                throw new NullPointerException("Argument must not be null");
                            }
                        }
                        getcamerafactoryprovider.b = Uri.encode(string, "@#&=*+-_.,:!?()/~'%;$");
                    }
                    getcamerafactoryprovider.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = new URL(getcamerafactoryprovider.b);
                }
                tuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault1(TuitionPaymentFragmentspecialinlinedviewModeldefault1(getcamerafactoryprovider.TuitionPaymentFragmentspecialinlinedviewModeldefault2, 0, null, this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault3()));
                if (Log.isLoggable("HttpUrlFetcher", 2)) {
                    setTargetResolution.TuitionPaymentFragmentbindingInflater1(jTuitionPaymentFragmentbindingInflater1);
                }
            } catch (IOException e2) {
                tuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault2(e2);
                if (Log.isLoggable("HttpUrlFetcher", 2)) {
                    setTargetResolution.TuitionPaymentFragmentbindingInflater1(jTuitionPaymentFragmentbindingInflater1);
                }
            }
        } catch (Throwable th) {
            if (Log.isLoggable("HttpUrlFetcher", 2)) {
                setTargetResolution.TuitionPaymentFragmentbindingInflater1(jTuitionPaymentFragmentbindingInflater1);
            }
            throw th;
        }
    }

    private InputStream TuitionPaymentFragmentspecialinlinedviewModeldefault1(URL url, int i, URL url2, Map<String, String> map) throws HttpException {
        while (i < 5) {
            if (url2 != null) {
                try {
                    if (url.toURI().equals(url2.toURI())) {
                        throw new HttpException("In re-direct loop", -1);
                    }
                } catch (URISyntaxException unused) {
                }
            }
            HttpURLConnection httpURLConnectionTuitionPaymentFragmentspecialinlinedviewModeldefault3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3(url, map);
            this.f996a = httpURLConnectionTuitionPaymentFragmentspecialinlinedviewModeldefault3;
            try {
                httpURLConnectionTuitionPaymentFragmentspecialinlinedviewModeldefault3.connect();
                this.b = ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.f996a);
                if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                    return null;
                }
                int iTuitionPaymentFragmentspecialinlinedviewModeldefault1 = TuitionPaymentFragmentspecialinlinedviewModeldefault1(this.f996a);
                int i2 = iTuitionPaymentFragmentspecialinlinedviewModeldefault1 / 100;
                if (i2 == 2) {
                    return b(this.f996a);
                }
                if (i2 != 3) {
                    if (iTuitionPaymentFragmentspecialinlinedviewModeldefault1 == -1) {
                        throw new HttpException(iTuitionPaymentFragmentspecialinlinedviewModeldefault1);
                    }
                    try {
                        throw new HttpException(this.f996a.getResponseMessage(), iTuitionPaymentFragmentspecialinlinedviewModeldefault1);
                    } catch (IOException e2) {
                        throw new HttpException("Failed to get a response message", iTuitionPaymentFragmentspecialinlinedviewModeldefault1, e2);
                    }
                }
                String headerField = this.f996a.getHeaderField("Location");
                if (TextUtils.isEmpty(headerField)) {
                    throw new HttpException("Received empty or null redirect url", iTuitionPaymentFragmentspecialinlinedviewModeldefault1);
                }
                try {
                    URL url3 = new URL(url, headerField);
                    b();
                    i++;
                    url2 = url;
                    url = url3;
                } catch (MalformedURLException e3) {
                    throw new HttpException("Bad redirect url: ".concat(String.valueOf(headerField)), iTuitionPaymentFragmentspecialinlinedviewModeldefault1, e3);
                }
            } catch (IOException e4) {
                throw new HttpException("Failed to connect or obtain data", TuitionPaymentFragmentspecialinlinedviewModeldefault1(this.f996a), e4);
            }
        }
        throw new HttpException("Too many (> 5) redirects!", -1);
    }

    static class TuitionPaymentFragmentspecialinlinedviewModeldefault3 implements b {
        private static final byte[] $$c = {60, 80, 13, 34};
        private static final int $$d = 177;
        private static int $10 = 0;
        private static int $11 = 1;
        private static final byte[] $$a = {89, 107, -36, -112, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, 7, -18, -16, -1, -16, -16, -4, 19, -48, -3, -17, 0, -30, 4, -24, 54, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 56, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 54};
        private static final int $$b = 111;
        private static int b = 0;
        private static int d = 1;
        private static char TuitionPaymentFragmentbindingInflater1 = 13198;
        private static char TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 12693;
        private static char TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 43463;
        private static char TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 24601;

        /* JADX WARN: Code duplicated, block: B:10:0x0025  */
        /* JADX WARN: Code duplicated, block: B:8:0x001d  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002a). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0025
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        private static void a(byte r7, byte r8, int r9, java.lang.Object[] r10) {
            /*
                int r7 = r7 * 15
                int r7 = 53 - r7
                int r9 = r9 * 4
                int r9 = r9 + 84
                byte[] r0 = getTargets.TuitionPaymentFragmentspecialinlinedviewModeldefault3.$$a
                int r8 = r8 + 4
                byte[] r1 = new byte[r7]
                r2 = 0
                if (r0 != 0) goto L15
                r3 = r9
                r4 = r2
                r9 = r8
                goto L2a
            L15:
                r3 = r2
            L16:
                int r4 = r3 + 1
                byte r5 = (byte) r9
                r1[r3] = r5
                if (r4 != r7) goto L25
                java.lang.String r7 = new java.lang.String
                r7.<init>(r1, r2)
                r10[r2] = r7
                return
            L25:
                r3 = r0[r8]
                r6 = r9
                r9 = r8
                r8 = r6
            L2a:
                int r3 = -r3
                int r8 = r8 + r3
                int r8 = r8 + (-11)
                int r9 = r9 + 1
                r3 = r4
                r6 = r9
                r9 = r8
                r8 = r6
                goto L16
            */
            throw new UnsupportedOperationException("Method not decompiled: getTargets.TuitionPaymentFragmentspecialinlinedviewModeldefault3.a(byte, byte, int, java.lang.Object[]):void");
        }

        private static void c(char[] cArr, int i, Object[] objArr) throws Throwable {
            int i2 = 2 % 2;
            onCaptureSessionEnd oncapturesessionend = new onCaptureSessionEnd();
            char[] cArr2 = new char[cArr.length - 2];
            oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 2;
            char[] cArr3 = new char[2];
            while (true) {
                char c = 0;
                if (oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 >= cArr.length) {
                    objArr[0] = new String(cArr2, 0, i);
                    return;
                }
                int i3 = $11 + 101;
                $10 = i3 % 128;
                if (i3 % 2 != 0) {
                    cArr3[0] = cArr[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3];
                    cArr3[1] = cArr[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 << 1];
                } else {
                    cArr3[0] = cArr[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3];
                    cArr3[1] = cArr[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1];
                }
                int i4 = 58224;
                int i5 = 0;
                while (i5 < 16) {
                    int i6 = $11 + 69;
                    $10 = i6 % 128;
                    int i7 = i6 % 2;
                    char c2 = cArr3[1];
                    char c3 = cArr3[c];
                    int i8 = (c3 + i4) ^ ((c3 << 4) + ((char) (((long) TuitionPaymentFragmentspecialinlinedviewModeldefault3) ^ 8611973335120459638L)));
                    int i9 = c3 >>> 5;
                    try {
                        Object[] objArr2 = new Object[4];
                        objArr2[3] = Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault1);
                        objArr2[2] = Integer.valueOf(i9);
                        objArr2[1] = Integer.valueOf(i8);
                        objArr2[c] = Integer.valueOf(c2);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1824600641);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                            char packedPositionGroup = (char) (47773 - ExpandableListView.getPackedPositionGroup(0L));
                            int pressedStateDuration = (ViewConfiguration.getPressedStateDuration() >> 16) + 468;
                            int minimumFlingVelocity = (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 13;
                            Class[] clsArr = new Class[4];
                            clsArr[c] = Integer.TYPE;
                            clsArr[1] = Integer.TYPE;
                            clsArr[2] = Integer.TYPE;
                            clsArr[3] = Integer.TYPE;
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(packedPositionGroup, pressedStateDuration, minimumFlingVelocity, -2007001706, false, "o", clsArr);
                        }
                        char cCharValue = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                        cArr3[1] = cCharValue;
                        int i10 = i5;
                        Object[] objArr3 = {Integer.valueOf(cArr3[c]), Integer.valueOf((cCharValue + i4) ^ ((cCharValue << 4) + ((char) (((long) TuitionPaymentFragmentbindingInflater1) ^ 8611973335120459638L)))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault2)};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1824600641);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (Drawable.resolveOpacity(0, 0) + 47773), (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 468, Color.argb(0, 0, 0, 0) + 13, -2007001706, false, "o", new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                        }
                        cArr3[0] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).charValue();
                        i4 -= 40503;
                        i5 = i10 + 1;
                        c = 0;
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                }
                cArr2[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 - 2] = (char) (cArr[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 - 2] ^ cArr3[0]);
                cArr2[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 - 1] = (char) (cArr3[1] ^ cArr[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 - 1]);
                Object[] objArr4 = {oncapturesessionend, oncapturesessionend};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1431906448);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    byte b2 = (byte) 0;
                    byte b3 = (byte) (b2 - 1);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (ViewConfiguration.getJumpTapTimeout() >> 16), 2323 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), View.MeasureSpec.getMode(0) + 44, -1312321721, false, $$e(b2, b3, (byte) (b3 + 1)), new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
            }
        }

        TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        }

        @Override // getTargets.b
        public final HttpURLConnection TuitionPaymentFragmentspecialinlinedviewModeldefault3(URL url) throws Throwable {
            Object[] objArr;
            int i = 2 % 2;
            int i2 = b + 73;
            d = i2 % 128;
            int i3 = i2 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                char defaultSize = (char) (29944 - View.getDefaultSize(0, 0));
                int iResolveSize = View.resolveSize(0, 0) + 1755;
                int iLastIndexOf = 22 - TextUtils.lastIndexOf("", '0', 0);
                byte[] bArr = $$a;
                byte b2 = bArr[5];
                byte b3 = bArr[7];
                Object[] objArr2 = new Object[1];
                a(b2, b3, b3, objArr2);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(defaultSize, iResolveSize, iLastIndexOf, 986134021, false, (String) objArr2[0], null);
            }
            long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
            Object[] objArr3 = new Object[1];
            c(new char[]{19969, 40715, 53362, 65195, 55340, 27885, 65136, 2133, 22131, 48617, 36822, 6912, 58797, 9411, 30384, 32742, 8104, 63009, 12904, 6705, 6018, 61832, 58304, 51098}, (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 22, objArr3);
            Class<?> cls = Class.forName((String) objArr3[0]);
            Object[] objArr4 = new Object[1];
            c(new char[]{6012, 9319, 31126, 64793, 14935, 19493, 52195, 5396, 15570, 42352, 31336, 55683, 17000, 18668, 60028, 10079, 64264, 62091}, 15 - Color.argb(0, 0, 0, 0), objArr4);
            long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1145728641);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                char doubleTapTimeout = (char) (29944 - (ViewConfiguration.getDoubleTapTimeout() >> 16));
                int iLastIndexOf2 = 1754 - TextUtils.lastIndexOf("", '0', 0);
                int keyRepeatTimeout = 23 - (ViewConfiguration.getKeyRepeatTimeout() >> 16);
                byte b4 = $$a[7];
                byte b5 = b4;
                Object[] objArr5 = new Object[1];
                a(b5, (byte) (b5 | 37), b4, objArr5);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(doubleTapTimeout, iLastIndexOf2, keyRepeatTimeout, 1596667560, false, (String) objArr5[0], null);
            }
            if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    char cIndexOf = (char) (TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 29945);
                    int iCombineMeasuredStates = 1755 - View.combineMeasuredStates(0, 0);
                    int packedPositionChild = ExpandableListView.getPackedPositionChild(0L) + 24;
                    byte[] bArr2 = $$a;
                    byte b6 = bArr2[7];
                    Object[] objArr6 = new Object[1];
                    a(b6, bArr2[0], b6, objArr6);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(cIndexOf, iCombineMeasuredStates, packedPositionChild, 1599039318, false, (String) objArr6[0], null);
                }
                Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
                objArr = new Object[]{new int[]{((int[]) objArr7[0])[0]}, new int[]{((int[]) objArr7[1])[0]}, (Object[]) objArr7[2], new int[1], (String[]) objArr7[4]};
                int iIdentityHashCode = System.identityHashCode(this);
                int i4 = ((((-1200358369) + (((~(699343022 | iIdentityHashCode)) | 161742854) * (-502))) + ((~((~iIdentityHashCode) | 1073688302)) * (-502))) + (((~(iIdentityHashCode | (-911945449))) | 699343022) * TypedValues.PositionType.TYPE_DRAWPATH)) - 2143557542;
                int i5 = (i4 << 13) ^ i4;
                int i6 = i5 ^ (i5 >>> 17);
                ((int[]) objArr[3])[0] = i6 ^ (i6 << 5);
            } else {
                Object[] objArr8 = new Object[1];
                c(new char[]{55246, 38438, 38690, 11809, 59836, 8444, 47565, 17512, 11321, 13070, 39319, 32804, 9781, 4520, 39430, 34391, 26744, 38151}, 16 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), objArr8);
                Class<?> cls2 = Class.forName((String) objArr8[0]);
                Object[] objArr9 = new Object[1];
                c(new char[]{22601, 7214, 14096, 50840, 20267, 50744, 52657, 46493, 11608, 47629, 20687, 63027, 51468, 22548, 54496, 37245, 51072, 10632}, ((Process.getThreadPriority(0) + 20) >> 6) + 16, objArr9);
                int iIntValue = ((Integer) cls2.getMethod((String) objArr9[0], Object.class).invoke(null, this)).intValue();
                try {
                    Object[] objArr10 = {1399311947};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2063193834);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (42048 - TextUtils.indexOf((CharSequence) "", '0', 0, 0)), (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 1726, 28 - TextUtils.lastIndexOf("", '0', 0), -1637387971, false, null, new Class[]{Integer.TYPE});
                    }
                    Object[] objArrTuitionPaymentFragmentbindingInflater1$7879113 = lambdastart1androidxcameravideointernalaudioAudioSource.TuitionPaymentFragmentbindingInflater1$7879113(iIntValue, 0, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).newInstance(objArr10), -2143557542, false, true);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                        char offsetBefore = (char) (TextUtils.getOffsetBefore("", 0) + 29944);
                        int iAlpha = 1755 - Color.alpha(0);
                        int packedPositionType = ExpandableListView.getPackedPositionType(0L) + 23;
                        byte[] bArr3 = $$a;
                        byte b7 = bArr3[7];
                        Object[] objArr11 = new Object[1];
                        a(b7, bArr3[0], b7, objArr11);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(offsetBefore, iAlpha, packedPositionType, 1599039318, false, (String) objArr11[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, objArrTuitionPaymentFragmentbindingInflater1$7879113);
                    try {
                        Object[] objArr12 = new Object[1];
                        c(new char[]{19969, 40715, 53362, 65195, 55340, 27885, 65136, 2133, 22131, 48617, 36822, 6912, 58797, 9411, 30384, 32742, 8104, 63009, 12904, 6705, 6018, 61832, 58304, 51098}, (ViewConfiguration.getLongPressTimeout() >> 16) + 22, objArr12);
                        Class<?> cls3 = Class.forName((String) objArr12[0]);
                        Object[] objArr13 = new Object[1];
                        c(new char[]{6012, 9319, 31126, 64793, 14935, 19493, 52195, 5396, 15570, 42352, 31336, 55683, 17000, 18668, 60028, 10079, 64264, 62091}, View.resolveSize(0, 0) + 15, objArr13);
                        long jLongValue2 = ((Long) cls3.getDeclaredMethod((String) objArr13[0], new Class[0]).invoke(null, new Object[0])).longValue();
                        Long lValueOf = Long.valueOf(jLongValue2);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1145728641);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                            char bitsPerPixel = (char) (29943 - ImageFormat.getBitsPerPixel(0));
                            int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0) + 1755;
                            int i7 = (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 24;
                            byte b8 = $$a[7];
                            byte b9 = b8;
                            Object[] objArr14 = new Object[1];
                            a(b9, (byte) (b9 | 37), b8, objArr14);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(bitsPerPixel, iMakeMeasureSpec, i7, 1596667560, false, (String) objArr14[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf);
                        Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
                            char cAxisFromString = (char) (29943 - MotionEvent.axisFromString(""));
                            int touchSlop = 1755 - (ViewConfiguration.getTouchSlop() >> 8);
                            int i8 = (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 23;
                            byte[] bArr4 = $$a;
                            byte b10 = bArr4[5];
                            byte b11 = bArr4[7];
                            Object[] objArr15 = new Object[1];
                            a(b10, b11, b11, objArr15);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(cAxisFromString, touchSlop, i8, 986134021, false, (String) objArr15[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).set(null, lValueOf2);
                        int i9 = b + 105;
                        d = i9 % 128;
                        int i10 = i9 % 2;
                        objArr = objArrTuitionPaymentFragmentbindingInflater1$7879113;
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
            int i11 = ((int[]) objArr[1])[0];
            int i12 = ((int[]) objArr[0])[0];
            if (i12 == i11) {
                int i13 = ((int[]) objArr[3])[0];
                Object[] objArr16 = {new int[]{((int[]) objArr[0])[0]}, new int[]{((int[]) objArr[1])[0]}, (Object[]) objArr[2], new int[1], (String[]) objArr[4]};
                int i14 = ~((int) Runtime.getRuntime().freeMemory());
                int i15 = ~(869433583 | i14);
                int i16 = i13 + 1650558413 + ((i15 | (-656831158)) * 764) + (((~(i14 | (-656831158))) | 587333797) * (-1528)) + (((-351597147) | i15) * 764);
                int i17 = (i16 << 13) ^ i16;
                int i18 = i17 ^ (i17 >>> 17);
                ((int[]) objArr16[3])[0] = i18 ^ (i18 << 5);
            } else {
                ArrayList arrayList = new ArrayList();
                String[] strArr = (String[]) objArr[4];
                if (strArr != null) {
                    int i19 = d + 95;
                    b = i19 % 128;
                    int i20 = 2;
                    int i21 = i19 % 2 != 0 ? 1 : 0;
                    while (i21 < strArr.length) {
                        int i22 = d + 5;
                        b = i22 % 128;
                        int i23 = i22 % i20;
                        arrayList.add(strArr[i21]);
                        i21++;
                        i20 = 2;
                    }
                }
                int[] iArr = new int[i12];
                int i24 = i12 - 1;
                iArr[i24] = 1;
                Toast.makeText((Context) null, iArr[((i12 * i24) % 2) - 1], 1).show();
                int i25 = ((int[]) objArr[3])[0];
                Object[] objArr17 = {new int[]{((int[]) objArr[0])[0]}, new int[]{((int[]) objArr[1])[0]}, (Object[]) objArr[2], new int[1], (String[]) objArr[4]};
                int iFreeMemory = (int) Runtime.getRuntime().freeMemory();
                int i26 = i25 + ((((-884875950) + (((~((-347082811) | iFreeMemory)) | (~((-134480385) | iFreeMemory))) * 69)) + (((~(iFreeMemory | (-726065734))) | ((~((-938668160) | iFreeMemory)) | 591585349)) * (-69))) - 1032805504);
                int i27 = (i26 << 13) ^ i26;
                int i28 = i27 ^ (i27 >>> 17);
                ((int[]) objArr17[3])[0] = i28 ^ (i28 << 5);
            }
            URLConnection uRLConnectionOpenConnection = url.openConnection();
            ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(uRLConnectionOpenConnection);
            HttpURLConnection httpURLConnection = (HttpURLConnection) uRLConnectionOpenConnection;
            int i29 = b + 59;
            d = i29 % 128;
            if (i29 % 2 != 0) {
                return httpURLConnection;
            }
            throw null;
        }

        /* JADX WARN: Code duplicated, block: B:10:0x0025  */
        /* JADX WARN: Code duplicated, block: B:8:0x001f  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x0029). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0025
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        private static java.lang.String $$e(int r5, short r6, int r7) {
            /*
                byte[] r0 = getTargets.TuitionPaymentFragmentspecialinlinedviewModeldefault3.$$c
                int r6 = r6 + 4
                int r5 = r5 * 3
                int r1 = 1 - r5
                int r7 = r7 * 4
                int r7 = 108 - r7
                byte[] r1 = new byte[r1]
                r2 = 0
                int r5 = 0 - r5
                if (r0 != 0) goto L17
                r3 = r7
                r4 = r2
                r7 = r5
                goto L29
            L17:
                r3 = r2
            L18:
                byte r4 = (byte) r7
                r1[r3] = r4
                int r4 = r3 + 1
                if (r3 != r5) goto L25
                java.lang.String r5 = new java.lang.String
                r5.<init>(r1, r2)
                return r5
            L25:
                int r6 = r6 + 1
                r3 = r0[r6]
            L29:
                int r7 = r7 + r3
                r3 = r4
                goto L18
            */
            throw new UnsupportedOperationException("Method not decompiled: getTargets.TuitionPaymentFragmentspecialinlinedviewModeldefault3.$$e(int, short, int):java.lang.String");
        }
    }

    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault1(HttpURLConnection httpURLConnection) {
        try {
            return ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault2(httpURLConnection);
        } catch (IOException unused) {
            return -1;
        }
    }

    private HttpURLConnection TuitionPaymentFragmentspecialinlinedviewModeldefault3(URL url, Map<String, String> map) throws HttpException {
        try {
            HttpURLConnection httpURLConnectionTuitionPaymentFragmentspecialinlinedviewModeldefault3 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault3(url);
            for (Map.Entry<String, String> entry : map.entrySet()) {
                httpURLConnectionTuitionPaymentFragmentspecialinlinedviewModeldefault3.addRequestProperty(entry.getKey(), entry.getValue());
            }
            httpURLConnectionTuitionPaymentFragmentspecialinlinedviewModeldefault3.setConnectTimeout(this.g);
            httpURLConnectionTuitionPaymentFragmentspecialinlinedviewModeldefault3.setReadTimeout(this.g);
            httpURLConnectionTuitionPaymentFragmentspecialinlinedviewModeldefault3.setUseCaches(false);
            httpURLConnectionTuitionPaymentFragmentspecialinlinedviewModeldefault3.setDoInput(true);
            httpURLConnectionTuitionPaymentFragmentspecialinlinedviewModeldefault3.setInstanceFollowRedirects(false);
            return httpURLConnectionTuitionPaymentFragmentspecialinlinedviewModeldefault3;
        } catch (IOException e2) {
            throw new HttpException("URL.openConnection threw", 0, e2);
        }
    }

    private InputStream b(HttpURLConnection httpURLConnection) throws HttpException {
        try {
            if (TextUtils.isEmpty(httpURLConnection.getContentEncoding())) {
                this.b = new ImageAnalysisDefaults(ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(httpURLConnection), httpURLConnection.getContentLength());
            } else {
                if (Log.isLoggable("HttpUrlFetcher", 3)) {
                    httpURLConnection.getContentEncoding();
                }
                this.b = ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(httpURLConnection);
            }
            return this.b;
        } catch (IOException e2) {
            throw new HttpException("Failed to obtain InputStream", TuitionPaymentFragmentspecialinlinedviewModeldefault1(httpURLConnection), e2);
        }
    }

    @Override // defpackage.isUseCasesCombinationSupportedByFramework
    public final void b() {
        InputStream inputStream = this.b;
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException unused) {
            }
        }
        HttpURLConnection httpURLConnection = this.f996a;
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
        }
        this.f996a = null;
    }

    @Override // defpackage.isUseCasesCombinationSupportedByFramework
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = true;
    }

    @Override // defpackage.isUseCasesCombinationSupportedByFramework
    public final Class<InputStream> TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        return InputStream.class;
    }

    @Override // defpackage.isUseCasesCombinationSupportedByFramework
    public final DataSource TuitionPaymentFragmentbindingInflater1() {
        return DataSource.REMOTE;
    }
}
