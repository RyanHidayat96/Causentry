package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.ImageFormat;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.media.AudioTrack;
import android.os.Build;
import android.os.Handler;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.ImageView;
import androidx.core.view.ViewCompat;
import com.koushikdutta.ion.ResponseServedFrom;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Random;
import java.util.Set;
import okhttp3.tls.internal.der.DerHeader;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes4.dex */
public final class requestClose extends LayerDrawable {
    private static final double cancelAll = Math.log(2.0d);
    boolean INotificationSideChannel;
    private Drawable INotificationSideChannelDefault;
    private final Drawable INotificationSideChannelStub;
    private final Drawable INotificationSideChannelStubProxy;
    private Paint IconCompatParcelizer;
    private TuitionPaymentFragmentspecialinlinedviewModeldefault2 MediaBrowserCompat;
    private int RemoteActionCompatParcelizer;
    SurfaceOutputImpl TuitionPaymentFragmentbindingInflater1;
    Drawable TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    TuitionPaymentFragmentbindingInflater1 TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    canSetProvider TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    Drawable f1345a;
    calculateInvertedTextureTransform asBinder;
    SurfaceProcessorNodeExternalSyntheticLambda2 asInterface;
    int b;
    int cancel;
    private ResponseServedFrom connect;
    boolean d;
    DefaultSurfaceProcessorExternalSyntheticLambda14<requestClose> g;
    private final Drawable getInterfaceDescriptor;
    private int getNotifyChildrenChangedOptions;
    private DefaultSurfaceProcessorExternalSyntheticLambda14<SurfaceProcessorNodeExternalSyntheticLambda2> getRoot;
    int notify;
    int onTransact;
    private int read;
    private Resources write;

    static class TuitionPaymentFragmentbindingInflater1 implements DefaultSurfaceProcessorExternalSyntheticLambda14<SurfaceProcessorNodeExternalSyntheticLambda2> {
        private calculateInvertedTextureTransform TuitionPaymentFragmentbindingInflater1;
        private String TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        private WeakReference<requestClose> TuitionPaymentFragmentspecialinlinedviewModeldefault3;

        public TuitionPaymentFragmentbindingInflater1(requestClose requestclose) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = new WeakReference<>(requestclose);
        }

        public final void TuitionPaymentFragmentspecialinlinedviewModeldefault2(calculateInvertedTextureTransform calculateinvertedtexturetransform, String str) {
            String str2 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            calculateInvertedTextureTransform calculateinvertedtexturetransform2 = this.TuitionPaymentFragmentbindingInflater1;
            if (TextUtils.equals(str2, str) && this.TuitionPaymentFragmentbindingInflater1 == calculateinvertedtexturetransform) {
                return;
            }
            this.TuitionPaymentFragmentbindingInflater1 = calculateinvertedtexturetransform;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = str;
            if (calculateinvertedtexturetransform != null) {
                calculateinvertedtexturetransform.b.b(str, this);
            }
            TuitionPaymentFragmentbindingInflater1(calculateinvertedtexturetransform2, str2);
        }

        private void TuitionPaymentFragmentbindingInflater1(calculateInvertedTextureTransform calculateinvertedtexturetransform, String str) {
            if (str == null) {
                return;
            }
            if (calculateinvertedtexturetransform.b.TuitionPaymentFragmentbindingInflater1(str, this)) {
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = calculateinvertedtexturetransform.b.TuitionPaymentFragmentspecialinlinedviewModeldefault3(str);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 instanceof SurfaceProcessorNodeExternalSyntheticLambda0) {
                    SurfaceProcessorNodeExternalSyntheticLambda0 surfaceProcessorNodeExternalSyntheticLambda0 = (SurfaceProcessorNodeExternalSyntheticLambda0) objTuitionPaymentFragmentspecialinlinedviewModeldefault3;
                    calculateinvertedtexturetransform.b.TuitionPaymentFragmentspecialinlinedviewModeldefault2(surfaceProcessorNodeExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
                    if (calculateinvertedtexturetransform.b.TuitionPaymentFragmentbindingInflater1(surfaceProcessorNodeExternalSyntheticLambda0.b, surfaceProcessorNodeExternalSyntheticLambda0)) {
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = calculateinvertedtexturetransform.b.TuitionPaymentFragmentspecialinlinedviewModeldefault3(surfaceProcessorNodeExternalSyntheticLambda0.b);
                    }
                }
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 instanceof SurfaceEdgeSettableSurfaceExternalSyntheticLambda0) {
                    calculateinvertedtexturetransform.b.TuitionPaymentFragmentspecialinlinedviewModeldefault2(((SurfaceEdgeSettableSurfaceExternalSyntheticLambda0) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).TuitionPaymentFragmentspecialinlinedviewModeldefault2);
                }
            }
            Handler handler = calculateInvertedTextureTransform.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            handler.removeCallbacks(calculateinvertedtexturetransform.cancelAll);
            handler.post(calculateinvertedtexturetransform.cancelAll);
        }

        @Override // defpackage.DefaultSurfaceProcessorExternalSyntheticLambda14
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final void TuitionPaymentFragmentbindingInflater1(Exception exc, SurfaceProcessorNodeExternalSyntheticLambda2 surfaceProcessorNodeExternalSyntheticLambda2) {
            requestClose requestclose = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.get();
            if (requestclose != null) {
                requestclose.TuitionPaymentFragmentbindingInflater1(surfaceProcessorNodeExternalSyntheticLambda2, surfaceProcessorNodeExternalSyntheticLambda2.notify).TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                DefaultSurfaceProcessorExternalSyntheticLambda14 defaultSurfaceProcessorExternalSyntheticLambda14 = requestclose.g;
                if (defaultSurfaceProcessorExternalSyntheticLambda14 != null) {
                    defaultSurfaceProcessorExternalSyntheticLambda14.TuitionPaymentFragmentbindingInflater1(exc, requestclose);
                }
            }
        }
    }

    public class TuitionPaymentFragmentspecialinlinedviewModeldefault2 {
        public static int asInterface;
        public static int g;
        getPrimarySurfaceEdge TuitionPaymentFragmentbindingInflater1;
        boolean TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        long TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        getNumberOfTargets TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        Exception b;
        private Runnable asBinder = new Runnable() { // from class: requestClose.TuitionPaymentFragmentspecialinlinedviewModeldefault2.2
            private static final byte[] $$c = {115, 98, 19, 9};
            private static final int $$d = 70;
            private static int $10 = 0;
            private static int $11 = 1;
            private static final byte[] $$a = {114, -59, 10, 31, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -56, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -55, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, -7, 18, 16, 1, 16, 16, 4, -19, 48, 3, 17, 0, 30, -4, 24, -54};
            private static final int $$b = 19;
            private static int TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
            private static int TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 1;
            private static long TuitionPaymentFragmentbindingInflater1 = 7863878341556028412L;

            /* JADX WARN: Code duplicated, block: B:10:0x0023  */
            /* JADX WARN: Code duplicated, block: B:8:0x001b  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x0025). Please report as a decompilation issue!!! */
            /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0023
                	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                */
            private static void c(short r6, int r7, int r8, java.lang.Object[] r9) {
                /*
                    int r8 = 145 - r8
                    int r6 = r6 * 14
                    int r6 = 98 - r6
                    byte[] r0 = requestClose.TuitionPaymentFragmentspecialinlinedviewModeldefault2.AnonymousClass2.$$a
                    int r7 = 53 - r7
                    byte[] r1 = new byte[r7]
                    r2 = 0
                    if (r0 != 0) goto L13
                    r6 = r7
                    r3 = r8
                    r5 = r2
                    goto L25
                L13:
                    r3 = r2
                L14:
                    byte r4 = (byte) r6
                    int r5 = r3 + 1
                    r1[r3] = r4
                    if (r5 != r7) goto L23
                    java.lang.String r6 = new java.lang.String
                    r6.<init>(r1, r2)
                    r9[r2] = r6
                    return
                L23:
                    r3 = r0[r8]
                L25:
                    int r8 = r8 + 1
                    int r6 = r6 + r3
                    int r6 = r6 + (-11)
                    r3 = r5
                    goto L14
                */
                throw new UnsupportedOperationException("Method not decompiled: requestClose.TuitionPaymentFragmentspecialinlinedviewModeldefault2.AnonymousClass2.c(short, int, int, java.lang.Object[]):void");
            }

            private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
                int i2 = 2 % 2;
                abortCapture abortcapture = new abortCapture();
                char[] cArrB = abortCapture.b(TuitionPaymentFragmentbindingInflater1 ^ (-2687588926731523482L), cArr, i);
                abortcapture.b = 4;
                while (abortcapture.b < cArrB.length) {
                    int i3 = $10 + 39;
                    $11 = i3 % 128;
                    int i4 = i3 % 2;
                    abortcapture.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = abortcapture.b - 4;
                    int i5 = abortcapture.b;
                    try {
                        Object[] objArr2 = {Long.valueOf(cArrB[abortcapture.b] ^ cArrB[abortcapture.b % 4]), Long.valueOf(abortcapture.TuitionPaymentFragmentspecialinlinedviewModeldefault1), Long.valueOf(TuitionPaymentFragmentbindingInflater1)};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-774687567);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                            byte b = (byte) 0;
                            byte b2 = b;
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (64838 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1))), (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 1356, (ViewConfiguration.getWindowTouchSlop() >> 8) + 38, 894276454, false, $$e(b, b2, b2), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                        }
                        cArrB[i5] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                        Object[] objArr3 = {abortcapture, abortcapture};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-772308768);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (47773 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1))), ExpandableListView.getPackedPositionType(0L) + 468, (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 12, 896083767, false, "n", new Class[]{Object.class, Object.class});
                        }
                        ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3);
                        int i6 = $10 + 21;
                        $11 = i6 % 128;
                        int i7 = i6 % 2;
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                }
                objArr[0] = new String(cArrB, 4, cArrB.length - 4);
            }

            @Override // java.lang.Runnable
            public void run() {
                int i = 2 % 2;
                int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 23;
                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
                try {
                    if (i2 % 2 == 0) {
                        TuitionPaymentFragmentspecialinlinedviewModeldefault2.this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.b();
                        calculateInvertedTextureTransform.TuitionPaymentFragmentspecialinlinedviewModeldefault1.post(TuitionPaymentFragmentspecialinlinedviewModeldefault2.this.d);
                        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 59;
                        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3 % 128;
                        int i4 = i3 % 2;
                        return;
                    }
                    TuitionPaymentFragmentspecialinlinedviewModeldefault2.this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.b();
                    throw null;
                } catch (Exception e2) {
                    TuitionPaymentFragmentspecialinlinedviewModeldefault2.this.b = e2;
                } catch (OutOfMemoryError e3) {
                    TuitionPaymentFragmentspecialinlinedviewModeldefault2.this.b = new Exception(e3);
                }
            }

            /* JADX WARN: Code duplicated, block: B:101:0x054f A[PHI: r15
  0x054f: PHI (r15v6 int) = (r15v5 int), (r15v8 int), (r15v9 int), (r15v9 int) binds: [B:100:0x054e, B:118:0x054f, B:93:0x0533, B:80:0x04b4] A[DONT_GENERATE, DONT_INLINE]] */
            /* JADX WARN: Code duplicated, block: B:45:0x0246  */
            /* JADX WARN: Code duplicated, block: B:47:0x024c  */
            /* JADX WARN: Code duplicated, block: B:48:0x0269  */
            /* JADX WARN: Code duplicated, block: B:52:0x0273  */
            /* JADX WARN: Code duplicated, block: B:56:0x02a0 A[Catch: all -> 0x0414, TryCatch #4 {all -> 0x0414, blocks: (B:54:0x0293, B:56:0x02a0, B:57:0x02e5), top: B:126:0x0293, outer: #0 }] */
            /* JADX WARN: Code duplicated, block: B:60:0x0334  */
            /* JADX WARN: Code duplicated, block: B:62:0x0394 A[Catch: Exception -> 0x054f, TRY_LEAVE, TryCatch #0 {Exception -> 0x054f, blocks: (B:61:0x0339, B:62:0x0394, B:67:0x0416, B:69:0x041c, B:70:0x041d, B:71:0x041e, B:74:0x044a, B:79:0x04b0, B:83:0x04b9, B:85:0x04bf, B:86:0x04c0, B:87:0x04c1, B:92:0x052f, B:96:0x0546, B:98:0x054c, B:99:0x054d, B:54:0x0293, B:56:0x02a0, B:57:0x02e5, B:88:0x04d6, B:90:0x04e3, B:91:0x0528, B:75:0x045c, B:77:0x0469, B:78:0x04a9), top: B:119:0x0271, inners: #4, #5, #6 }] */
            /* JADX WARN: Code duplicated, block: B:71:0x041e A[Catch: Exception -> 0x054f, TRY_LEAVE, TryCatch #0 {Exception -> 0x054f, blocks: (B:61:0x0339, B:62:0x0394, B:67:0x0416, B:69:0x041c, B:70:0x041d, B:71:0x041e, B:74:0x044a, B:79:0x04b0, B:83:0x04b9, B:85:0x04bf, B:86:0x04c0, B:87:0x04c1, B:92:0x052f, B:96:0x0546, B:98:0x054c, B:99:0x054d, B:54:0x0293, B:56:0x02a0, B:57:0x02e5, B:88:0x04d6, B:90:0x04e3, B:91:0x0528, B:75:0x045c, B:77:0x0469, B:78:0x04a9), top: B:119:0x0271, inners: #4, #5, #6 }] */
            /* JADX WARN: Code duplicated, block: B:74:0x044a A[Catch: Exception -> 0x054f, TRY_ENTER, TRY_LEAVE, TryCatch #0 {Exception -> 0x054f, blocks: (B:61:0x0339, B:62:0x0394, B:67:0x0416, B:69:0x041c, B:70:0x041d, B:71:0x041e, B:74:0x044a, B:79:0x04b0, B:83:0x04b9, B:85:0x04bf, B:86:0x04c0, B:87:0x04c1, B:92:0x052f, B:96:0x0546, B:98:0x054c, B:99:0x054d, B:54:0x0293, B:56:0x02a0, B:57:0x02e5, B:88:0x04d6, B:90:0x04e3, B:91:0x0528, B:75:0x045c, B:77:0x0469, B:78:0x04a9), top: B:119:0x0271, inners: #4, #5, #6 }] */
            /* JADX WARN: Code duplicated, block: B:77:0x0469 A[Catch: all -> 0x04b8, TryCatch #6 {all -> 0x04b8, blocks: (B:75:0x045c, B:77:0x0469, B:78:0x04a9), top: B:130:0x045c, outer: #0 }] */
            /* JADX WARN: Code duplicated, block: B:81:0x04b6  */
            /* JADX WARN: Code duplicated, block: B:87:0x04c1 A[Catch: Exception -> 0x054f, TRY_LEAVE, TryCatch #0 {Exception -> 0x054f, blocks: (B:61:0x0339, B:62:0x0394, B:67:0x0416, B:69:0x041c, B:70:0x041d, B:71:0x041e, B:74:0x044a, B:79:0x04b0, B:83:0x04b9, B:85:0x04bf, B:86:0x04c0, B:87:0x04c1, B:92:0x052f, B:96:0x0546, B:98:0x054c, B:99:0x054d, B:54:0x0293, B:56:0x02a0, B:57:0x02e5, B:88:0x04d6, B:90:0x04e3, B:91:0x0528, B:75:0x045c, B:77:0x0469, B:78:0x04a9), top: B:119:0x0271, inners: #4, #5, #6 }] */
            /* JADX WARN: Code duplicated, block: B:90:0x04e3 A[Catch: all -> 0x0545, TryCatch #5 {all -> 0x0545, blocks: (B:88:0x04d6, B:90:0x04e3, B:91:0x0528), top: B:128:0x04d6, outer: #0 }] */
            /* JADX WARN: Code duplicated, block: B:94:0x0535  */
            public static Object[] b(Context context, int i, int i2, int i3) throws Throwable {
                int i4;
                int i5;
                int i6;
                int i7;
                int i8;
                Object[] objArr;
                int i9;
                int i10;
                int i11;
                int i12;
                int i13;
                String str;
                char[] cArr;
                int i14;
                Object[] objArr2;
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3;
                Object[] objArr3;
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4;
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5;
                long j;
                int i15;
                int i16;
                int i17;
                int i18;
                int i19;
                int i20 = 2 % 2;
                if (context != null) {
                    try {
                        Object[] objArr4 = new Object[1];
                        a(new char[]{44148, 44053, 17316, 27216, 59315, 46307, 33822, 63650, 2675, 37839, 19739, 42758, 57543, 13729, 5257, 19956, 24361, 24344, 62203, 62518, 13719, 33009, 22617, 37380, 60441, 10878, 10155}, Color.alpha(0), objArr4);
                        Class<?> cls = Class.forName((String) objArr4[0]);
                        char[] cArr2 = {31446, 31409, 50101, 59978, 52545, 40449, 33235, 64860, 56526, 5063, 26609, 41612, 13925, 46526, 15985, 18468, 35201, 57097, 55332, 61883, 58128, 224};
                        int iRgb = Color.rgb(0, 0, 0);
                        int i21 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 49;
                        int i22 = i21 % 128;
                        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i22;
                        int i23 = i21 % 2 == 0 ? (659 - iRgb) % 16776559 : (iRgb * 659) - (-1862270976);
                        int i24 = ~iRgb;
                        int i25 = (~((16777216 & i24) | (i24 ^ 16777216))) | (~(((-16777217) & iRgb) | ((-16777217) ^ iRgb)));
                        int i26 = ~(iRgb | i);
                        i19 = (-16777217) ^ iRgb;
                        int i27 = (iRgb & (-16777217)) | i19;
                        int i28 = ((i23 + ((-658) * ((i25 & i26) | (i25 ^ i26)))) - (~(-(-((~(i27 == true ? 1 : 0)) * 658))))) - 1;
                        int i29 = ((~(i27 == true ? 1 : 0)) | i26) * 658;
                        int i30 = i22 + 21;
                        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i30 % 128;
                        int i31 = i30 % 2;
                        int i32 = i28 + i29;
                        Object[] objArr5 = new Object[1];
                        a(cArr2, i32, objArr5);
                        Object objInvoke = cls.getMethod((String) objArr5[0], null).invoke(context, null);
                        Object[] objArr6 = new Object[1];
                        a(new char[]{38841, 38872, 3606, 10210, 4452, 16948, 30291, 2799, 12734, 56957, 48076, 21835, 56074, 30739, 57950, 49081, 25828, 4778, 1068, 1659, 3689, 52545, 44750, 24700, 55233, 26564, 53604, 51948, 29098, 7805, 31716, 5380, 6926, 47114, 41585, 32667, 42143, 21155}, ViewConfiguration.getTouchSlop() >> 8, objArr6);
                        Class<?> cls2 = Class.forName((String) objArr6[0]);
                        int i33 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 3;
                        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i33 % 128;
                        int i34 = i33 % 2;
                        Object[] objArr7 = new Object[1];
                        a(new char[]{43501, 43403, 40765, 46795, 28130, 16055, 49234, 48379, 4086}, Color.green(0), objArr7);
                        int i35 = cls2.getField((String) objArr7[0]).getInt(objInvoke) & 2;
                        int i36 = (~(i & 1)) & (i | 1);
                        int i37 = -i35;
                        int i38 = ((i35 & i37) | (i35 ^ i37)) >> 31;
                        int i39 = (~i38) & i;
                        int i40 = i38 & i36;
                        int i41 = (i40 & i39) | (i39 ^ i40);
                        int i42 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                        int i43 = (i42 ^ 99) + ((i42 & 99) << 1);
                        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i43 % 128;
                        int i44 = i43 % 2;
                        i4 = i41;
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause != null) {
                            throw cause;
                        }
                        throw th;
                    }
                } else {
                    i4 = i;
                }
                try {
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1122237249);
                    int i45 = i19;
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        char offsetBefore = (char) (16949 - TextUtils.getOffsetBefore("", 0));
                        int maxKeyCode = 2739 - (KeyEvent.getMaxKeyCode() >> 16);
                        int iIndexOf = 12 - TextUtils.indexOf((CharSequence) "", '0');
                        byte[] bArr = $$a;
                        byte b = bArr[132];
                        byte b2 = bArr[7];
                        Object[] objArr8 = new Object[1];
                        c(b, b2, (short) (b2 | 141), objArr8);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(offsetBefore, maxKeyCode, iIndexOf, 1501733736, false, (String) objArr8[0], new Class[0]);
                        i45 = iIndexOf;
                    }
                    Set set = (Set) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, null);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-431688923);
                    int i46 = i45;
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                        char c = (char) ((ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 16949);
                        int packedPositionGroup = ExpandableListView.getPackedPositionGroup(0L) + 2739;
                        int offsetAfter = 13 - TextUtils.getOffsetAfter("", 0);
                        byte[] bArr2 = $$a;
                        byte b3 = bArr2[132];
                        byte b4 = bArr2[7];
                        Object[] objArr9 = new Object[1];
                        c(b3, b4, (short) (b4 | 89), objArr9);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(c, packedPositionGroup, offsetAfter, 47863026, false, (String) objArr9[0], null);
                        i46 = b3;
                    }
                    if (!set.contains(((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).get(null))) {
                        int i47 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                        int i48 = ((i47 | 75) << 1) - (i47 ^ 75);
                        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i48 % 128;
                        if (i48 % 2 == 0) {
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1056710067);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                                char bitsPerPixel = (char) (ImageFormat.getBitsPerPixel(0) + 16950);
                                int pressedStateDuration = 2739 - (ViewConfiguration.getPressedStateDuration() >> 16);
                                int iAlpha = 13 - Color.alpha(0);
                                byte b5 = $$a[132];
                                Object[] objArr10 = new Object[1];
                                c(b5, (byte) (b5 | 14), (short) 37, objArr10);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(bitsPerPixel, pressedStateDuration, iAlpha, 631063962, false, (String) objArr10[0], null);
                            }
                            set.contains(((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).get(null));
                            throw null;
                        }
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1056710067);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
                            char cIndexOf = (char) (16949 - TextUtils.indexOf("", "", 0));
                            int scrollBarSize = (ViewConfiguration.getScrollBarSize() >> 8) + 2739;
                            int iBlue = Color.blue(0) + 13;
                            byte b6 = $$a[132];
                            Object[] objArr11 = new Object[1];
                            c(b6, (byte) (b6 | 14), (short) 37, objArr11);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(cIndexOf, scrollBarSize, iBlue, 631063962, false, (String) objArr11[0], null);
                        }
                        if (!set.contains(((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).get(null))) {
                            if (Build.VERSION.SDK_INT > 33) {
                                int i49 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 17;
                                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i49 % 128;
                                int i50 = i49 % 2;
                                Object[] objArr12 = new Object[1];
                                a(new char[]{26443, 26468, 34577, 44782, 30043, 9755, 14025, 19044, 49420, 22394, 57321, 5526, 11247, 61780, 34419, 65339, 37912, 39847, 24666, 18091, 65166, 17481, 51898, 8384, 10020, 61138, 46405, 35443, 33118, 38709, 8141, 21908}, (-TextUtils.indexOf((CharSequence) "", '0', 0)) - 1, objArr12);
                                Object[] objArr13 = {(String) objArr12[0]};
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-52092531);
                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                                    char c2 = (char) (1 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)));
                                    int pressedStateDuration2 = (ViewConfiguration.getPressedStateDuration() >> 16) + 993;
                                    int iIndexOf2 = TextUtils.indexOf((CharSequence) "", '0') + 9;
                                    byte b7 = $$a[7];
                                    byte b8 = b7;
                                    Object[] objArr14 = new Object[1];
                                    c(b8, (byte) (b8 | 52), b7, objArr14);
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(c2, pressedStateDuration2, iIndexOf2, 410748506, false, (String) objArr14[0], new Class[]{String.class});
                                }
                                long jLongValue = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr13)).longValue();
                                long j2 = 922975443;
                                i13 = i4;
                                long j3 = -1;
                                long j4 = j2 ^ j3;
                                long j5 = 191;
                                long j6 = i;
                                j = (((long) (-381)) * j2) + (((long) DerHeader.TAG_CLASS_PRIVATE) * jLongValue) + (((long) (-191)) * j4) + ((j2 | ((jLongValue | j6) ^ j3)) * j5) + (j5 * ((j3 ^ ((j6 ^ j3) | jLongValue)) | ((j4 | jLongValue) ^ j3))) + ((long) (-1123893680));
                                int i51 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                                i15 = ((i51 | 39) << 1) - (i51 ^ 39);
                                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i15 % 128;
                                if (i15 % 2 != 0) {
                                    int i52 = (int) (j >>> 111);
                                    int iMyPid = Process.myPid();
                                    int i53 = ~iMyPid;
                                    int i54 = (-124166548) + (((~(1909197243 | i53)) | (-2112732604)) * (-1188));
                                    int i55 = (~(iMyPid | (-1909197244))) | (-2112732604);
                                    int i56 = ~((-471970833) | i53);
                                    i16 = i52 & (i54 + ((i55 | i56) * 594) + (((~((-1909197244) | i53)) | 268435472 | i56) * 594));
                                    i17 = (int) j;
                                    int i57 = ~i;
                                    i18 = (-1532391521) + (((~(1179647238 | i57)) | 152043681) * 98) + (((~(i57 | 257579171)) | 1179647238 | (~((-257579172) | i))) * (-49)) + (((~(1179647238 | i)) | 105535490) * 49);
                                } else {
                                    int i58 = ~i;
                                    i16 = ((int) (j >> 32)) & (501358106 + (((~(918334086 | i58)) | (-2008874959)) * 168) + ((~(2008874958 | i)) * 168) + (((~(i58 | 1939406798)) | 69468160 | (~((-1090540873) | i))) * 168));
                                    i17 = (int) j;
                                    int i59 = ~new Random().nextInt();
                                    i18 = 1019428157 + (((~(i59 | 2079842031)) | (~((-25297990) | i59))) * (-184)) + ((308658816 | (~((-333956806) | i59)) | (~(1771183215 | i59))) * 184) + 879665432;
                                }
                                int i60 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                                int i61 = ((i60 | 63) << 1) - (i60 ^ 63);
                                TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i61 % 128;
                                int i62 = i61 % 2;
                                int i63 = i17 & i18;
                                i12 = (i16 & i63) | (i16 ^ i63);
                                int i64 = i60 + 117;
                                TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i64 % 128;
                                int i65 = i64 % 2;
                            } else {
                                i46 = i4;
                                Object[] objArr15 = new Object[1];
                                a(new char[]{43199, 43150, 58101, 62040, 32423}, ViewConfiguration.getEdgeSlop() >> 16, objArr15);
                                str = (String) objArr15[0];
                                cArr = new char[]{33779, 33665, 57575, 51474, 22404, 1182, 22911, 9685, 9726, 12423, 64887, 31278, 53060, 38636, 42232, 37005, 28846};
                                int i66 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                                i14 = (i66 & 79) + (i66 | 79);
                                TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i14 % 128;
                                if (i14 % 2 == 0) {
                                    Object[] objArr16 = new Object[1];
                                    a(cArr, 1 - ((byte) KeyEvent.getModifierMetaStateMask()), objArr16);
                                    objArr3 = new Object[]{(String) objArr16[0]};
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1333629456);
                                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                        char cLastIndexOf = (char) (TextUtils.lastIndexOf("", '0', 0, 0) + 33603);
                                        int packedPositionChild = 3084 - ExpandableListView.getPackedPositionChild(0L);
                                        int touchSlop = 26 - (ViewConfiguration.getTouchSlop() >> 8);
                                        byte b9 = $$a[7];
                                        byte b10 = b9;
                                        Object[] objArr17 = new Object[1];
                                        c(b10, (byte) (b10 | 52), b9, objArr17);
                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cLastIndexOf, packedPositionChild, touchSlop, 1411172903, false, (String) objArr17[0], new Class[]{String.class});
                                    }
                                    if (str.equals(((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3))) {
                                        int i67 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                                        int i68 = ((i67 | 33) << 1) - (i67 ^ 33);
                                        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i68 % 128;
                                        int i69 = i68 % 2;
                                        i12 = 1;
                                        i13 = i46;
                                    } else {
                                        i12 = 0;
                                        i13 = i46;
                                    }
                                } else {
                                    Object[] objArr18 = new Object[1];
                                    a(cArr, 0 - (~(-(-((byte) KeyEvent.getModifierMetaStateMask())))), objArr18);
                                    objArr2 = new Object[]{(String) objArr18[0]};
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1333629456);
                                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                                        char c3 = (char) ((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 33601);
                                        int size = 3085 - View.MeasureSpec.getSize(0);
                                        int iIndexOf3 = 26 - TextUtils.indexOf("", "", 0, 0);
                                        byte b11 = $$a[7];
                                        byte b12 = b11;
                                        Object[] objArr19 = new Object[1];
                                        c(b12, (byte) (b12 | 52), b11, objArr19);
                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(c3, size, iIndexOf3, 1411172903, false, (String) objArr19[0], new Class[]{String.class});
                                    }
                                    if (str.equals(((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2))) {
                                        int i610 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                                        int i611 = ((i610 | 33) << 1) - (i610 ^ 33);
                                        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i611 % 128;
                                        int i612 = i611 % 2;
                                        i12 = 1;
                                        i13 = i46;
                                    } else {
                                        i12 = 0;
                                        i13 = i46;
                                    }
                                }
                            }
                            int i70 = (i & (-11)) | ((~i) & 10);
                            int i71 = -i12;
                            int i72 = ((i12 & i71) | (i12 ^ i71)) >> 31;
                            int i73 = (~i72) & i;
                            int i74 = i72 & i70;
                            int i75 = (i74 & i73) | (i73 ^ i74);
                            int i76 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                            int i77 = (i76 & 87) + (i76 | 87);
                            int i78 = i77 % 128;
                            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i78;
                            int i79 = i77 % 2;
                            int i80 = i2 & 32;
                            int i81 = i78 + 73;
                            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i81 % 128;
                            int i82 = i81 % 2;
                            int i83 = ((-i80) | i80) >> 31;
                            int i84 = i75 & (~i83);
                            int i85 = i83 & i;
                            i5 = (i84 & i85) | (i84 ^ i85);
                            i6 = i13;
                        } else if (Build.VERSION.SDK_INT == 30) {
                            int i86 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                            int i87 = (i86 ^ 3) + ((i86 & 3) << 1);
                            int i88 = i87 % 128;
                            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i88;
                            int i89 = i87 % 2;
                            int i90 = (i88 ^ 105) + ((i88 & 105) << 1);
                            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i90 % 128;
                            int i91 = i90 % 2;
                            i5 = i;
                            i6 = i4;
                        } else {
                            if (Build.VERSION.SDK_INT > 33) {
                                int i410 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 17;
                                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i410 % 128;
                                int i510 = i410 % 2;
                                Object[] objArr110 = new Object[1];
                                a(new char[]{26443, 26468, 34577, 44782, 30043, 9755, 14025, 19044, 49420, 22394, 57321, 5526, 11247, 61780, 34419, 65339, 37912, 39847, 24666, 18091, 65166, 17481, 51898, 8384, 10020, 61138, 46405, 35443, 33118, 38709, 8141, 21908}, (-TextUtils.indexOf((CharSequence) "", '0', 0)) - 1, objArr110);
                                Object[] objArr111 = {(String) objArr110[0]};
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-52092531);
                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                                    char c4 = (char) (1 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)));
                                    int pressedStateDuration3 = (ViewConfiguration.getPressedStateDuration() >> 16) + 993;
                                    int iIndexOf4 = TextUtils.indexOf((CharSequence) "", '0') + 9;
                                    byte b13 = $$a[7];
                                    byte b14 = b13;
                                    Object[] objArr112 = new Object[1];
                                    c(b14, (byte) (b14 | 52), b13, objArr112);
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(c4, pressedStateDuration3, iIndexOf4, 410748506, false, (String) objArr112[0], new Class[]{String.class});
                                }
                                long jLongValue2 = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr111)).longValue();
                                long j7 = 922975443;
                                i13 = i4;
                                long j8 = -1;
                                long j9 = j7 ^ j8;
                                long j10 = 191;
                                long j11 = i;
                                j = (((long) (-381)) * j7) + (((long) DerHeader.TAG_CLASS_PRIVATE) * jLongValue2) + (((long) (-191)) * j9) + ((j7 | ((jLongValue2 | j11) ^ j8)) * j10) + (j10 * ((j8 ^ ((j11 ^ j8) | jLongValue2)) | ((j9 | jLongValue2) ^ j8))) + ((long) (-1123893680));
                                int i511 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                                i15 = ((i511 | 39) << 1) - (i511 ^ 39);
                                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i15 % 128;
                                if (i15 % 2 != 0) {
                                    int i512 = (int) (j >>> 111);
                                    int iMyPid2 = Process.myPid();
                                    int i513 = ~iMyPid2;
                                    int i514 = (-124166548) + (((~(1909197243 | i513)) | (-2112732604)) * (-1188));
                                    int i515 = (~(iMyPid2 | (-1909197244))) | (-2112732604);
                                    int i516 = ~((-471970833) | i513);
                                    i16 = i512 & (i514 + ((i515 | i516) * 594) + (((~((-1909197244) | i513)) | 268435472 | i516) * 594));
                                    i17 = (int) j;
                                    int i517 = ~i;
                                    i18 = (-1532391521) + (((~(1179647238 | i517)) | 152043681) * 98) + (((~(i517 | 257579171)) | 1179647238 | (~((-257579172) | i))) * (-49)) + (((~(1179647238 | i)) | 105535490) * 49);
                                } else {
                                    int i518 = ~i;
                                    i16 = ((int) (j >> 32)) & (501358106 + (((~(918334086 | i518)) | (-2008874959)) * 168) + ((~(2008874958 | i)) * 168) + (((~(i518 | 1939406798)) | 69468160 | (~((-1090540873) | i))) * 168));
                                    i17 = (int) j;
                                    int i519 = ~new Random().nextInt();
                                    i18 = 1019428157 + (((~(i519 | 2079842031)) | (~((-25297990) | i519))) * (-184)) + ((308658816 | (~((-333956806) | i519)) | (~(1771183215 | i519))) * 184) + 879665432;
                                }
                                int i613 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                                int i614 = ((i613 | 63) << 1) - (i613 ^ 63);
                                TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i614 % 128;
                                int i615 = i614 % 2;
                                int i616 = i17 & i18;
                                i12 = (i16 & i616) | (i16 ^ i616);
                                int i617 = i613 + 117;
                                TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i617 % 128;
                                int i618 = i617 % 2;
                            } else {
                                i46 = i4;
                                Object[] objArr113 = new Object[1];
                                a(new char[]{43199, 43150, 58101, 62040, 32423}, ViewConfiguration.getEdgeSlop() >> 16, objArr113);
                                str = (String) objArr113[0];
                                cArr = new char[]{33779, 33665, 57575, 51474, 22404, 1182, 22911, 9685, 9726, 12423, 64887, 31278, 53060, 38636, 42232, 37005, 28846};
                                int i619 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                                i14 = (i619 & 79) + (i619 | 79);
                                TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i14 % 128;
                                if (i14 % 2 == 0) {
                                    Object[] objArr114 = new Object[1];
                                    a(cArr, 1 - ((byte) KeyEvent.getModifierMetaStateMask()), objArr114);
                                    objArr3 = new Object[]{(String) objArr114[0]};
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1333629456);
                                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                        char cLastIndexOf2 = (char) (TextUtils.lastIndexOf("", '0', 0, 0) + 33603);
                                        int packedPositionChild2 = 3084 - ExpandableListView.getPackedPositionChild(0L);
                                        int touchSlop2 = 26 - (ViewConfiguration.getTouchSlop() >> 8);
                                        byte b15 = $$a[7];
                                        byte b16 = b15;
                                        Object[] objArr115 = new Object[1];
                                        c(b16, (byte) (b16 | 52), b15, objArr115);
                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cLastIndexOf2, packedPositionChild2, touchSlop2, 1411172903, false, (String) objArr115[0], new Class[]{String.class});
                                    }
                                    if (str.equals(((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3))) {
                                        int i6110 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                                        int i6111 = ((i6110 | 33) << 1) - (i6110 ^ 33);
                                        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i6111 % 128;
                                        int i6112 = i6111 % 2;
                                        i12 = 1;
                                        i13 = i46;
                                    } else {
                                        i12 = 0;
                                        i13 = i46;
                                    }
                                } else {
                                    Object[] objArr116 = new Object[1];
                                    a(cArr, 0 - (~(-(-((byte) KeyEvent.getModifierMetaStateMask())))), objArr116);
                                    objArr2 = new Object[]{(String) objArr116[0]};
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1333629456);
                                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                                        char c5 = (char) ((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 33601);
                                        int size2 = 3085 - View.MeasureSpec.getSize(0);
                                        int iIndexOf5 = 26 - TextUtils.indexOf("", "", 0, 0);
                                        byte b17 = $$a[7];
                                        byte b18 = b17;
                                        Object[] objArr117 = new Object[1];
                                        c(b18, (byte) (b18 | 52), b17, objArr117);
                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(c5, size2, iIndexOf5, 1411172903, false, (String) objArr117[0], new Class[]{String.class});
                                    }
                                    if (str.equals(((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2))) {
                                        int i6113 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                                        int i6114 = ((i6113 | 33) << 1) - (i6113 ^ 33);
                                        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i6114 % 128;
                                        int i6115 = i6114 % 2;
                                        i12 = 1;
                                        i13 = i46;
                                    } else {
                                        i12 = 0;
                                        i13 = i46;
                                    }
                                }
                            }
                            int i710 = (i & (-11)) | ((~i) & 10);
                            int i711 = -i12;
                            int i712 = ((i12 & i711) | (i12 ^ i711)) >> 31;
                            int i713 = (~i712) & i;
                            int i714 = i712 & i710;
                            int i715 = (i714 & i713) | (i713 ^ i714);
                            int i716 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                            int i717 = (i716 & 87) + (i716 | 87);
                            int i718 = i717 % 128;
                            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i718;
                            int i719 = i717 % 2;
                            int i810 = i2 & 32;
                            int i811 = i718 + 73;
                            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i811 % 128;
                            int i812 = i811 % 2;
                            int i813 = ((-i810) | i810) >> 31;
                            int i814 = i715 & (~i813);
                            int i815 = i813 & i;
                            i5 = (i814 & i815) | (i814 ^ i815);
                            i6 = i13;
                        }
                    } else if (Build.VERSION.SDK_INT == 30) {
                        int i816 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                        int i817 = (i816 ^ 3) + ((i816 & 3) << 1);
                        int i818 = i817 % 128;
                        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i818;
                        int i819 = i817 % 2;
                        int i92 = (i818 ^ 105) + ((i818 & 105) << 1);
                        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i92 % 128;
                        int i93 = i92 % 2;
                        i5 = i;
                        i6 = i4;
                    } else {
                        try {
                            try {
                                if (Build.VERSION.SDK_INT > 33) {
                                    int i411 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 17;
                                    TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i411 % 128;
                                    int i5110 = i411 % 2;
                                    Object[] objArr118 = new Object[1];
                                    a(new char[]{26443, 26468, 34577, 44782, 30043, 9755, 14025, 19044, 49420, 22394, 57321, 5526, 11247, 61780, 34419, 65339, 37912, 39847, 24666, 18091, 65166, 17481, 51898, 8384, 10020, 61138, 46405, 35443, 33118, 38709, 8141, 21908}, (-TextUtils.indexOf((CharSequence) "", '0', 0)) - 1, objArr118);
                                    try {
                                        Object[] objArr119 = {(String) objArr118[0]};
                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-52092531);
                                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                                            char c6 = (char) (1 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)));
                                            int pressedStateDuration4 = (ViewConfiguration.getPressedStateDuration() >> 16) + 993;
                                            int iIndexOf6 = TextUtils.indexOf((CharSequence) "", '0') + 9;
                                            byte b19 = $$a[7];
                                            byte b110 = b19;
                                            Object[] objArr1110 = new Object[1];
                                            c(b110, (byte) (b110 | 52), b19, objArr1110);
                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(c6, pressedStateDuration4, iIndexOf6, 410748506, false, (String) objArr1110[0], new Class[]{String.class});
                                        }
                                        long jLongValue3 = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr119)).longValue();
                                        long j12 = 922975443;
                                        i13 = i4;
                                        long j13 = -1;
                                        long j14 = j12 ^ j13;
                                        long j15 = 191;
                                        long j16 = i;
                                        j = (((long) (-381)) * j12) + (((long) DerHeader.TAG_CLASS_PRIVATE) * jLongValue3) + (((long) (-191)) * j14) + ((j12 | ((jLongValue3 | j16) ^ j13)) * j15) + (j15 * ((j13 ^ ((j16 ^ j13) | jLongValue3)) | ((j14 | jLongValue3) ^ j13))) + ((long) (-1123893680));
                                        int i5111 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                                        i15 = ((i5111 | 39) << 1) - (i5111 ^ 39);
                                        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i15 % 128;
                                        if (i15 % 2 != 0) {
                                            int i5112 = (int) (j >>> 111);
                                            int iMyPid3 = Process.myPid();
                                            int i5113 = ~iMyPid3;
                                            int i5114 = (-124166548) + (((~(1909197243 | i5113)) | (-2112732604)) * (-1188));
                                            int i5115 = (~(iMyPid3 | (-1909197244))) | (-2112732604);
                                            int i5116 = ~((-471970833) | i5113);
                                            i16 = i5112 & (i5114 + ((i5115 | i5116) * 594) + (((~((-1909197244) | i5113)) | 268435472 | i5116) * 594));
                                            i17 = (int) j;
                                            int i5117 = ~i;
                                            i18 = (-1532391521) + (((~(1179647238 | i5117)) | 152043681) * 98) + (((~(i5117 | 257579171)) | 1179647238 | (~((-257579172) | i))) * (-49)) + (((~(1179647238 | i)) | 105535490) * 49);
                                        } else {
                                            int i5118 = ~i;
                                            i16 = ((int) (j >> 32)) & (501358106 + (((~(918334086 | i5118)) | (-2008874959)) * 168) + ((~(2008874958 | i)) * 168) + (((~(i5118 | 1939406798)) | 69468160 | (~((-1090540873) | i))) * 168));
                                            i17 = (int) j;
                                            int i5119 = ~new Random().nextInt();
                                            i18 = 1019428157 + (((~(i5119 | 2079842031)) | (~((-25297990) | i5119))) * (-184)) + ((308658816 | (~((-333956806) | i5119)) | (~(1771183215 | i5119))) * 184) + 879665432;
                                        }
                                        int i6116 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                                        int i6117 = ((i6116 | 63) << 1) - (i6116 ^ 63);
                                        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i6117 % 128;
                                        int i6118 = i6117 % 2;
                                        int i6119 = i17 & i18;
                                        i12 = (i16 & i6119) | (i16 ^ i6119);
                                        int i6120 = i6116 + 117;
                                        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i6120 % 128;
                                        int i6121 = i6120 % 2;
                                    } catch (Throwable th2) {
                                        Throwable cause2 = th2.getCause();
                                        if (cause2 != null) {
                                            throw cause2;
                                        }
                                        throw th2;
                                    }
                                } else {
                                    i46 = i4;
                                    Object[] objArr1111 = new Object[1];
                                    a(new char[]{43199, 43150, 58101, 62040, 32423}, ViewConfiguration.getEdgeSlop() >> 16, objArr1111);
                                    str = (String) objArr1111[0];
                                    cArr = new char[]{33779, 33665, 57575, 51474, 22404, 1182, 22911, 9685, 9726, 12423, 64887, 31278, 53060, 38636, 42232, 37005, 28846};
                                    int i6122 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                                    i14 = (i6122 & 79) + (i6122 | 79);
                                    TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i14 % 128;
                                    if (i14 % 2 == 0) {
                                        Object[] objArr1112 = new Object[1];
                                        a(cArr, 1 - ((byte) KeyEvent.getModifierMetaStateMask()), objArr1112);
                                        try {
                                            objArr3 = new Object[]{(String) objArr1112[0]};
                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1333629456);
                                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                                char cLastIndexOf3 = (char) (TextUtils.lastIndexOf("", '0', 0, 0) + 33603);
                                                int packedPositionChild3 = 3084 - ExpandableListView.getPackedPositionChild(0L);
                                                int touchSlop3 = 26 - (ViewConfiguration.getTouchSlop() >> 8);
                                                byte b111 = $$a[7];
                                                byte b112 = b111;
                                                Object[] objArr1113 = new Object[1];
                                                c(b112, (byte) (b112 | 52), b111, objArr1113);
                                                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cLastIndexOf3, packedPositionChild3, touchSlop3, 1411172903, false, (String) objArr1113[0], new Class[]{String.class});
                                            }
                                            if (str.equals(((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3))) {
                                                int i61110 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                                                int i61111 = ((i61110 | 33) << 1) - (i61110 ^ 33);
                                                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i61111 % 128;
                                                int i61112 = i61111 % 2;
                                                i12 = 1;
                                                i13 = i46;
                                            } else {
                                                i12 = 0;
                                                i13 = i46;
                                            }
                                        } catch (Throwable th3) {
                                            Throwable cause3 = th3.getCause();
                                            if (cause3 != null) {
                                                throw cause3;
                                            }
                                            throw th3;
                                        }
                                    } else {
                                        Object[] objArr1114 = new Object[1];
                                        a(cArr, 0 - (~(-(-((byte) KeyEvent.getModifierMetaStateMask())))), objArr1114);
                                        try {
                                            objArr2 = new Object[]{(String) objArr1114[0]};
                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1333629456);
                                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                                                char c7 = (char) ((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 33601);
                                                int size3 = 3085 - View.MeasureSpec.getSize(0);
                                                int iIndexOf7 = 26 - TextUtils.indexOf("", "", 0, 0);
                                                byte b113 = $$a[7];
                                                byte b114 = b113;
                                                Object[] objArr1115 = new Object[1];
                                                c(b114, (byte) (b114 | 52), b113, objArr1115);
                                                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(c7, size3, iIndexOf7, 1411172903, false, (String) objArr1115[0], new Class[]{String.class});
                                            }
                                            if (str.equals(((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2))) {
                                                int i61113 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                                                int i61114 = ((i61113 | 33) << 1) - (i61113 ^ 33);
                                                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i61114 % 128;
                                                int i61115 = i61114 % 2;
                                                i12 = 1;
                                                i13 = i46;
                                            } else {
                                                i12 = 0;
                                                i13 = i46;
                                            }
                                        } catch (Throwable th4) {
                                            Throwable cause4 = th4.getCause();
                                            if (cause4 != null) {
                                                throw cause4;
                                            }
                                            throw th4;
                                        }
                                    }
                                }
                            } catch (Exception unused) {
                            }
                        } catch (Exception unused2) {
                            i46 = i4;
                        }
                        int i7110 = (i & (-11)) | ((~i) & 10);
                        int i7111 = -i12;
                        int i7112 = ((i12 & i7111) | (i12 ^ i7111)) >> 31;
                        int i7113 = (~i7112) & i;
                        int i7114 = i7112 & i7110;
                        int i7115 = (i7114 & i7113) | (i7113 ^ i7114);
                        int i7116 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                        int i7117 = (i7116 & 87) + (i7116 | 87);
                        int i7118 = i7117 % 128;
                        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i7118;
                        int i7119 = i7117 % 2;
                        int i8110 = i2 & 32;
                        int i8111 = i7118 + 73;
                        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i8111 % 128;
                        int i8112 = i8111 % 2;
                        int i8113 = ((-i8110) | i8110) >> 31;
                        int i8114 = i7115 & (~i8113);
                        int i8115 = i8113 & i;
                        i5 = (i8114 & i8115) | (i8114 ^ i8115);
                        i6 = i13;
                    }
                    int i94 = i ^ i6;
                    int i95 = -(i94 == true ? 1 : 0);
                    int i96 = (((i94 == true ? 1 : 0) & i95) | ((i94 == true ? 1 : 0) ^ i95)) >> 31;
                    int i97 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                    int i98 = (i97 & 115) + (i97 | 115);
                    int i99 = i98 % 128;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i99;
                    if (i98 % 2 != 0) {
                        int i100 = i5 & (~i96);
                        int i101 = i96 & i6;
                        i8 = (i100 & i101) | (i100 ^ i101);
                        i7 = 1;
                        objArr = new Object[]{new int[0], new int[1]};
                    } else {
                        i7 = 1;
                        int i102 = i5 & (~i96);
                        int i103 = i96 & i6;
                        i8 = (i102 & (i103 == true ? 1 : 0)) | (i102 ^ (i103 == true ? 1 : 0));
                        objArr = new Object[4];
                        objArr[0] = new int[1];
                        objArr[1] = new int[1];
                    }
                    int[] iArr = new int[i7];
                    objArr[2] = iArr;
                    int i104 = ((~i8) & i) | ((~i) & i8);
                    int i105 = ((i104 | (-i104)) >> 31) & 16;
                    int i106 = i99 + 99;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i106 % 128;
                    int i107 = i106 % 2;
                    ((int[]) objArr[0])[0] = i;
                    iArr[0] = i8;
                    objArr[3] = null;
                    int iNextInt = new Random().nextInt();
                    int i108 = 172185176 + (((~((-52969481) | (~iNextInt))) | 12659251) * (-591)) + ((iNextInt | (-52969481)) * 591);
                    int i109 = ((i108 | i105) << 1) - (i108 ^ i105);
                    int iTuitionPaymentFragmentbindingInflater1 = getTextOn.TuitionPaymentFragmentbindingInflater1();
                    int i110 = i109 * 236;
                    int i111 = -(-(i3 * 471));
                    int i112 = ((i110 | i111) << 1) - (i110 ^ i111);
                    int i113 = ~i109;
                    int i114 = ~iTuitionPaymentFragmentbindingInflater1;
                    int i115 = ~((i114 & i113) | (i113 ^ i114));
                    int i116 = -(-(((i115 & i3) | (i3 ^ i115)) * (-235)));
                    int i117 = (i112 & i116) + (i116 | i112);
                    int i118 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 3;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i118 % 128;
                    if (i118 % 2 != 0) {
                        int i119 = ~(i113 | iTuitionPaymentFragmentbindingInflater1);
                        int i120 = ((i119 & i3) | (i3 ^ i119)) * (-470);
                        i9 = (i117 & i120) + (i120 | i117);
                        i10 = ~((~i3) | i109);
                        int i121 = ~i109;
                        int i122 = (i121 & i3) | (i121 ^ i3);
                        i11 = (i122 & iTuitionPaymentFragmentbindingInflater1) | (i122 ^ iTuitionPaymentFragmentbindingInflater1);
                    } else {
                        int i123 = ~((i113 ^ iTuitionPaymentFragmentbindingInflater1) | (i113 & iTuitionPaymentFragmentbindingInflater1));
                        int i124 = -(-(((i123 & i3) | (i3 ^ i123)) * (-470)));
                        i9 = (i124 | i117) + (i117 & i124);
                        int i125 = ~i3;
                        int i126 = iTuitionPaymentFragmentbindingInflater1 | i3 | i113;
                        i10 = ~((i109 & i125) | (i125 ^ i109));
                        i11 = i126;
                    }
                    int i127 = ~i11;
                    int i128 = (i9 - (~(-(-(235 * ((i127 & i10) | (i10 ^ i127))))))) - 1;
                    int i129 = i128 << 13;
                    int i130 = (i129 | i128) & (~(i128 & i129));
                    int i131 = i130 >>> 17;
                    int i132 = ((~i130) & i131) | ((~i131) & i130);
                    int i133 = i132 << 5;
                    ((int[]) objArr[1])[0] = ((~i132) & i133) | ((~i133) & i132);
                    return objArr;
                } catch (Throwable th5) {
                    Throwable cause5 = th5.getCause();
                    if (cause5 != null) {
                        throw cause5;
                    }
                    throw th5;
                }
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
            private static java.lang.String $$e(short r7, int r8, int r9) {
                /*
                    int r9 = r9 * 2
                    int r9 = 3 - r9
                    int r7 = r7 * 2
                    int r7 = 1 - r7
                    int r8 = r8 * 4
                    int r8 = 107 - r8
                    byte[] r0 = requestClose.TuitionPaymentFragmentspecialinlinedviewModeldefault2.AnonymousClass2.$$c
                    byte[] r1 = new byte[r7]
                    r2 = 0
                    if (r0 != 0) goto L17
                    r8 = r7
                    r3 = r9
                    r4 = r2
                    goto L2c
                L17:
                    r3 = r2
                L18:
                    int r4 = r3 + 1
                    byte r5 = (byte) r8
                    r1[r3] = r5
                    if (r4 != r7) goto L25
                    java.lang.String r7 = new java.lang.String
                    r7.<init>(r1, r2)
                    return r7
                L25:
                    int r9 = r9 + 1
                    r3 = r0[r9]
                    r6 = r3
                    r3 = r9
                    r9 = r6
                L2c:
                    int r9 = -r9
                    int r8 = r8 + r9
                    r9 = r3
                    r3 = r4
                    goto L18
                */
                throw new UnsupportedOperationException("Method not decompiled: requestClose.TuitionPaymentFragmentspecialinlinedviewModeldefault2.AnonymousClass2.$$e(short, int, int):java.lang.String");
            }
        };
        Runnable d = new Runnable() { // from class: requestClose.TuitionPaymentFragmentspecialinlinedviewModeldefault2.5
            @Override // java.lang.Runnable
            public final void run() {
                TuitionPaymentFragmentspecialinlinedviewModeldefault2.this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = false;
                requestClose.this.invalidateSelf();
            }
        };

        public TuitionPaymentFragmentspecialinlinedviewModeldefault2(SurfaceProcessorNodeExternalSyntheticLambda2 surfaceProcessorNodeExternalSyntheticLambda2) {
            getNumberOfTargets getnumberoftargetsTuitionPaymentFragmentspecialinlinedviewModeldefault3 = surfaceProcessorNodeExternalSyntheticLambda2.f227a.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = getnumberoftargetsTuitionPaymentFragmentspecialinlinedviewModeldefault3;
            this.TuitionPaymentFragmentbindingInflater1 = getnumberoftargetsTuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentbindingInflater1;
        }

        public final void TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
            synchronized (this) {
                if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
                    return;
                }
                if (this.b != null) {
                    return;
                }
                if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.asBinder == -1 && requestClose.this.INotificationSideChannel) {
                    getNumberOfTargets getnumberoftargets = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                    getnumberoftargets.f958a = 0;
                    getnumberoftargets.asBinder = 0;
                    getnumberoftargets.b = null;
                    getnumberoftargets.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = null;
                    getnumberoftargets.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                }
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = true;
                calculateInvertedTextureTransform.TuitionPaymentFragmentbindingInflater1().execute(this.asBinder);
            }
        }

        public static int TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
            int i = asInterface;
            int i2 = i % 9571395;
            asInterface = i + 1;
            if (i2 != 0) {
                return g;
            }
            int iMyUid = Process.myUid();
            g = iMyUid;
            return iMyUid;
        }
    }

    private requestClose(Resources resources) {
        super(new Drawable[]{new BitmapDrawable((Bitmap) null), new BitmapDrawable((Bitmap) null), new BitmapDrawable((Bitmap) null)});
        this.RemoteActionCompatParcelizer = 255;
        this.getRoot = new DefaultSurfaceProcessorExternalSyntheticLambda14<SurfaceProcessorNodeExternalSyntheticLambda2>() { // from class: requestClose.4
            @Override // defpackage.DefaultSurfaceProcessorExternalSyntheticLambda14
            public final /* synthetic */ void TuitionPaymentFragmentbindingInflater1(Exception exc, SurfaceProcessorNodeExternalSyntheticLambda2 surfaceProcessorNodeExternalSyntheticLambda2) {
                requestClose.this.invalidateSelf();
            }
        };
        setId(0, 0);
        setId(1, 1);
        setId(2, 2);
        this.getInterfaceDescriptor = getDrawable(0);
        this.INotificationSideChannelStub = getDrawable(1);
        this.INotificationSideChannelStubProxy = getDrawable(2);
        this.write = resources;
        this.IconCompatParcelizer = new Paint(6);
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = new TuitionPaymentFragmentbindingInflater1(this);
    }

    public final requestClose TuitionPaymentFragmentbindingInflater1(SurfaceProcessorNodeExternalSyntheticLambda2 surfaceProcessorNodeExternalSyntheticLambda2, ResponseServedFrom responseServedFrom) {
        if (this.asInterface != surfaceProcessorNodeExternalSyntheticLambda2) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault2(null, null);
            this.TuitionPaymentFragmentbindingInflater1 = null;
            this.connect = responseServedFrom;
            this.asInterface = surfaceProcessorNodeExternalSyntheticLambda2;
            this.MediaBrowserCompat = null;
            this.INotificationSideChannelDefault = null;
            invalidateSelf();
            if (surfaceProcessorNodeExternalSyntheticLambda2 != null) {
                if (surfaceProcessorNodeExternalSyntheticLambda2.TuitionPaymentFragmentspecialinlinedviewModeldefault3 != null) {
                    int iCeil = (int) Math.ceil(Math.log(Math.max(((double) surfaceProcessorNodeExternalSyntheticLambda2.d.x) / 256.0d, ((double) surfaceProcessorNodeExternalSyntheticLambda2.d.y) / 256.0d)) / cancelAll);
                    this.read = iCeil;
                    this.getNotifyChildrenChangedOptions = 256 << iCeil;
                    return this;
                }
                if (surfaceProcessorNodeExternalSyntheticLambda2.f227a != null) {
                    this.MediaBrowserCompat = new TuitionPaymentFragmentspecialinlinedviewModeldefault2(surfaceProcessorNodeExternalSyntheticLambda2);
                }
            }
        }
        return this;
    }

    @Override // android.graphics.drawable.LayerDrawable, android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        SurfaceProcessorNodeExternalSyntheticLambda2 surfaceProcessorNodeExternalSyntheticLambda2 = this.asInterface;
        if (surfaceProcessorNodeExternalSyntheticLambda2 != null) {
            if (surfaceProcessorNodeExternalSyntheticLambda2.TuitionPaymentFragmentspecialinlinedviewModeldefault3 != null) {
                return this.asInterface.d.x;
            }
            if (this.asInterface.TuitionPaymentFragmentbindingInflater1 != null) {
                return this.asInterface.TuitionPaymentFragmentbindingInflater1.getScaledWidth(this.write.getDisplayMetrics().densityDpi);
            }
        }
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 tuitionPaymentFragmentspecialinlinedviewModeldefault2 = this.MediaBrowserCompat;
        if (tuitionPaymentFragmentspecialinlinedviewModeldefault2 == null) {
            if (this.asInterface != null) {
                Drawable drawable = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                if (drawable == null) {
                    drawable = null;
                }
                if (drawable != null) {
                    return drawable.getIntrinsicWidth();
                }
            }
            Drawable drawable2 = this.f1345a;
            Drawable drawable3 = drawable2 != null ? drawable2 : null;
            if (drawable3 != null) {
                return drawable3.getIntrinsicWidth();
            }
            return -1;
        }
        return tuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault3.d;
    }

    @Override // android.graphics.drawable.LayerDrawable, android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        SurfaceProcessorNodeExternalSyntheticLambda2 surfaceProcessorNodeExternalSyntheticLambda2 = this.asInterface;
        if (surfaceProcessorNodeExternalSyntheticLambda2 != null) {
            if (surfaceProcessorNodeExternalSyntheticLambda2.TuitionPaymentFragmentspecialinlinedviewModeldefault3 != null) {
                return this.asInterface.d.y;
            }
            if (this.asInterface.TuitionPaymentFragmentbindingInflater1 != null) {
                return this.asInterface.TuitionPaymentFragmentbindingInflater1.getScaledHeight(this.write.getDisplayMetrics().densityDpi);
            }
        }
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 tuitionPaymentFragmentspecialinlinedviewModeldefault2 = this.MediaBrowserCompat;
        if (tuitionPaymentFragmentspecialinlinedviewModeldefault2 == null) {
            if (this.asInterface != null) {
                Drawable drawable = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                if (drawable == null) {
                    drawable = null;
                }
                if (drawable != null) {
                    return drawable.getIntrinsicHeight();
                }
            }
            Drawable drawable2 = this.f1345a;
            Drawable drawable3 = drawable2 != null ? drawable2 : null;
            if (drawable3 != null) {
                return drawable3.getIntrinsicHeight();
            }
            return -1;
        }
        return tuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    }

    /* JADX WARN: Code duplicated, block: B:115:0x030f  */
    /* JADX WARN: Code duplicated, block: B:126:0x0339  */
    @Override // android.graphics.drawable.LayerDrawable, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        long j;
        long j2;
        int i;
        int i2;
        int i3;
        int i4;
        Rect rect;
        int i5;
        SurfaceProcessorNodeExternalSyntheticLambda2 surfaceProcessorNodeExternalSyntheticLambda2B;
        int i6;
        SurfaceProcessorNodeExternalSyntheticLambda2 surfaceProcessorNodeExternalSyntheticLambda2 = this.asInterface;
        if (surfaceProcessorNodeExternalSyntheticLambda2 == null) {
            super.draw(canvas);
            SurfaceOutputImpl surfaceOutputImpl = this.TuitionPaymentFragmentbindingInflater1;
            if (surfaceOutputImpl != null) {
                if (surfaceOutputImpl.asBinder == 0 && this.TuitionPaymentFragmentbindingInflater1.asInterface == 0) {
                    if (canvas.getWidth() != 1) {
                        this.TuitionPaymentFragmentbindingInflater1.asBinder = canvas.getWidth();
                    }
                    if (canvas.getHeight() != 1) {
                        this.TuitionPaymentFragmentbindingInflater1.asInterface = canvas.getHeight();
                    }
                    SurfaceOutputImpl surfaceOutputImpl2 = this.TuitionPaymentFragmentbindingInflater1;
                    String strTuitionPaymentFragmentspecialinlinedviewModeldefault3 = SurfaceOutputImplExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3(surfaceOutputImpl2.TuitionPaymentFragmentspecialinlinedviewModeldefault3, surfaceOutputImpl2.asBinder, surfaceOutputImpl2.asInterface, surfaceOutputImpl2.TuitionPaymentFragmentspecialinlinedviewModeldefault2, surfaceOutputImpl2.TuitionPaymentFragmentbindingInflater1);
                    surfaceOutputImpl2.b = strTuitionPaymentFragmentspecialinlinedviewModeldefault3;
                    surfaceOutputImpl2.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = SurfaceOutputImplExternalSyntheticLambda0.b(strTuitionPaymentFragmentspecialinlinedviewModeldefault3, surfaceOutputImpl2.INotificationSideChannel);
                    SurfaceProcessorNodeExternalSyntheticLambda2 surfaceProcessorNodeExternalSyntheticLambda2B2 = this.asBinder.TuitionPaymentFragmentbindingInflater1.b(this.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
                    if (surfaceProcessorNodeExternalSyntheticLambda2B2 != null) {
                        this.TuitionPaymentFragmentbindingInflater1 = null;
                        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentbindingInflater1(null, surfaceProcessorNodeExternalSyntheticLambda2B2);
                        return;
                    }
                }
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.asBinder, this.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
                if (SurfaceOutputImpl.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.asBinder)) {
                    this.TuitionPaymentFragmentbindingInflater1.b();
                } else {
                    this.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
                }
                this.TuitionPaymentFragmentbindingInflater1 = null;
                return;
            }
            return;
        }
        if (surfaceProcessorNodeExternalSyntheticLambda2.TuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            if (this.asInterface.TuitionPaymentFragmentspecialinlinedviewModeldefault2 == 0) {
                this.asInterface.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = SystemClock.uptimeMillis();
            }
            long jMin = this.RemoteActionCompatParcelizer;
            if (this.d) {
                jMin = Math.min(((SystemClock.uptimeMillis() - this.asInterface.TuitionPaymentFragmentspecialinlinedviewModeldefault2) << 8) / 200, this.RemoteActionCompatParcelizer);
            }
            if (jMin == this.RemoteActionCompatParcelizer) {
                if (this.f1345a != null) {
                    this.f1345a = null;
                    setDrawableByLayerId(0, this.getInterfaceDescriptor);
                }
            } else if (this.f1345a != null) {
                invalidateSelf();
            }
            if (this.asInterface.f227a != null) {
                super.draw(canvas);
                TuitionPaymentFragmentspecialinlinedviewModeldefault2 tuitionPaymentFragmentspecialinlinedviewModeldefault2 = this.MediaBrowserCompat;
                long jCurrentTimeMillis = System.currentTimeMillis();
                long j3 = 100;
                if (tuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault2 == 0) {
                    getPrimarySurfaceEdge getprimarysurfaceedge = tuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentbindingInflater1;
                    if (getprimarysurfaceedge == null) {
                        j2 = 100;
                    } else {
                        j2 = getprimarysurfaceedge.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                        if (j2 == 0) {
                            j2 = 100;
                        }
                    }
                    tuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = j2 + jCurrentTimeMillis;
                    tuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                }
                if (jCurrentTimeMillis >= tuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                    if (tuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentbindingInflater1 != tuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentbindingInflater1) {
                        tuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentbindingInflater1 = tuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentbindingInflater1;
                        long j4 = tuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                        getPrimarySurfaceEdge getprimarysurfaceedge2 = tuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentbindingInflater1;
                        if (getprimarysurfaceedge2 == null) {
                            j = 100;
                        } else {
                            j = getprimarysurfaceedge2.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                            if (j == 0) {
                                j = 100;
                            }
                        }
                        if (jCurrentTimeMillis <= j4 + j) {
                            long j5 = tuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                            getPrimarySurfaceEdge getprimarysurfaceedge3 = tuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentbindingInflater1;
                            if (getprimarysurfaceedge3 != null) {
                                long j6 = getprimarysurfaceedge3.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                                if (j6 != 0) {
                                    j3 = j6;
                                }
                            }
                            tuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = j5 + j3;
                        } else {
                            getPrimarySurfaceEdge getprimarysurfaceedge4 = tuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentbindingInflater1;
                            if (getprimarysurfaceedge4 != null) {
                                long j7 = getprimarysurfaceedge4.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                                if (j7 != 0) {
                                    j3 = j7;
                                }
                            }
                            tuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = jCurrentTimeMillis + j3;
                        }
                    }
                    tuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                }
                getPrimarySurfaceEdge getprimarysurfaceedge5 = tuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentbindingInflater1;
                if (getprimarysurfaceedge5 != null) {
                    this.IconCompatParcelizer.setAlpha((int) jMin);
                    canvas.drawBitmap(getprimarysurfaceedge5.TuitionPaymentFragmentspecialinlinedviewModeldefault2, (Rect) null, getBounds(), this.IconCompatParcelizer);
                    this.IconCompatParcelizer.setAlpha(this.RemoteActionCompatParcelizer);
                    invalidateSelf();
                    return;
                }
                return;
            }
            if (this.asInterface.TuitionPaymentFragmentbindingInflater1 != null) {
                Drawable drawable = this.INotificationSideChannelDefault;
                if (drawable != null) {
                    drawable.setAlpha((int) jMin);
                }
            } else {
                Drawable drawable2 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                if (drawable2 != null) {
                    drawable2.setAlpha((int) jMin);
                }
            }
            super.draw(canvas);
            return;
        }
        Rect clipBounds = canvas.getClipBounds();
        Rect bounds = getBounds();
        float width = canvas.getWidth() / clipBounds.width();
        float fWidth = bounds.width();
        float fHeight = bounds.height();
        double dLog = Math.log((fWidth * width) / 256.0f);
        double d = cancelAll;
        double dMax = Math.max(dLog / d, Math.log((width * fHeight) / 256.0f) / d);
        int iMax = Math.max(0, clipBounds.left);
        int iMin = Math.min(bounds.width(), clipBounds.right);
        int iMax2 = Math.max(0, clipBounds.top);
        int iMin2 = Math.min(bounds.height(), clipBounds.bottom);
        int iMax3 = Math.max(Math.min(this.read, (int) Math.floor(dMax)), 0);
        int i7 = 1 << iMax3;
        int i8 = this.getNotifyChildrenChangedOptions / i7;
        if (this.asInterface.TuitionPaymentFragmentbindingInflater1 != null) {
            canvas.drawBitmap(this.asInterface.TuitionPaymentFragmentbindingInflater1, (Rect) null, getBounds(), this.IconCompatParcelizer);
        } else {
            this.IconCompatParcelizer.setColor(ViewCompat.MEASURED_STATE_MASK);
            canvas.drawRect(getBounds(), this.IconCompatParcelizer);
        }
        int i9 = 1;
        while (i8 / i9 > 256) {
            i9 <<= 1;
        }
        int i10 = 0;
        while (i10 < i7) {
            int i11 = i8 * i10;
            int i12 = i10 + 1;
            int iMin3 = Math.min(i8 * i12, bounds.bottom);
            if (iMin3 < iMax2) {
                i = iMin2;
                rect = bounds;
                i5 = iMax3;
                i2 = i7;
                break;
            }
            if (i11 > iMin2) {
                return;
            }
            int i13 = 0;
            while (true) {
                if (i13 >= i7) {
                    i = iMin2;
                    rect = bounds;
                    i5 = iMax3;
                    i2 = i7;
                    break;
                }
                int i14 = i8 * i13;
                int i15 = i13 + 1;
                i = iMin2;
                i2 = i7;
                int iMin4 = Math.min(i8 * i15, bounds.right);
                if (iMin4 < iMax) {
                    i3 = iMin3;
                } else {
                    if (i14 > iMin) {
                        rect = bounds;
                        i5 = iMax3;
                        break;
                    }
                    Rect rect2 = new Rect(i14, i11, iMin4, iMin3);
                    String strB = SurfaceEdgeExternalSyntheticLambda5.b(this.asInterface.g, ",", Integer.valueOf(iMax3), ",", Integer.valueOf(i13), ",", Integer.valueOf(i10));
                    SurfaceProcessorNodeExternalSyntheticLambda2 surfaceProcessorNodeExternalSyntheticLambda2B3 = this.asBinder.TuitionPaymentFragmentbindingInflater1.b(strB);
                    i3 = iMin3;
                    if (surfaceProcessorNodeExternalSyntheticLambda2B3 != null && surfaceProcessorNodeExternalSyntheticLambda2B3.TuitionPaymentFragmentbindingInflater1 != null) {
                        canvas.drawBitmap(surfaceProcessorNodeExternalSyntheticLambda2B3.TuitionPaymentFragmentbindingInflater1, (Rect) null, rect2, this.IconCompatParcelizer);
                    } else {
                        if (this.asBinder.b.TuitionPaymentFragmentspecialinlinedviewModeldefault3(strB) == null) {
                            new sendSurfaceOutputs(this.asBinder, strB, this.asInterface.TuitionPaymentFragmentspecialinlinedviewModeldefault3, rect2, i9);
                        }
                        this.asBinder.b.b(strB, this.getRoot);
                        int i16 = i13 % 2 == 1 ? 1 : 0;
                        int i17 = i13 >> 1;
                        int i18 = i10 >> 1;
                        int i19 = iMax3 - 1;
                        int i20 = i16;
                        int i21 = i10 % 2 == 1 ? 1 : 0;
                        int i22 = 1;
                        while (true) {
                            if (i19 < 0) {
                                i4 = iMax3;
                                surfaceProcessorNodeExternalSyntheticLambda2B = surfaceProcessorNodeExternalSyntheticLambda2B3;
                                break;
                            }
                            i4 = iMax3;
                            surfaceProcessorNodeExternalSyntheticLambda2B = this.asBinder.TuitionPaymentFragmentbindingInflater1.b(SurfaceEdgeExternalSyntheticLambda5.b(this.asInterface.g, ",", Integer.valueOf(i19), ",", Integer.valueOf(i17), ",", Integer.valueOf(i18)));
                            if (surfaceProcessorNodeExternalSyntheticLambda2B != null && surfaceProcessorNodeExternalSyntheticLambda2B.TuitionPaymentFragmentbindingInflater1 != null) {
                                break;
                            }
                            if (i17 % 2 == 1) {
                                i20 += 1 << i22;
                            }
                            if (i18 % 2 == 1) {
                                i21 += 1 << i22;
                            }
                            i19--;
                            i22++;
                            i17 >>= 1;
                            i18 >>= 1;
                            iMax3 = i4;
                            surfaceProcessorNodeExternalSyntheticLambda2B3 = surfaceProcessorNodeExternalSyntheticLambda2B;
                        }
                        if (surfaceProcessorNodeExternalSyntheticLambda2B != null && surfaceProcessorNodeExternalSyntheticLambda2B.TuitionPaymentFragmentbindingInflater1 != null) {
                            int i23 = this.getNotifyChildrenChangedOptions / (1 << i19);
                            int i24 = 1;
                            while (true) {
                                i6 = i23 / i24;
                                int i25 = i23;
                                if (i6 <= 256) {
                                    break;
                                }
                                i24 <<= 1;
                                i23 = i25;
                            }
                            int i26 = i6 >> i22;
                            int i27 = i20 * i26;
                            int i28 = i21 * i26;
                            canvas.drawBitmap(surfaceProcessorNodeExternalSyntheticLambda2B.TuitionPaymentFragmentbindingInflater1, new Rect(i27, i28, i27 + i26, i26 + i28), rect2, this.IconCompatParcelizer);
                        }
                    }
                    iMax3 = i4;
                    i13 = i15;
                    iMin2 = i;
                    i7 = i2;
                    iMin3 = i3;
                    i11 = i11;
                    bounds = bounds;
                }
                i11 = i11;
                bounds = bounds;
                i4 = iMax3;
                iMax3 = i4;
                i13 = i15;
                iMin2 = i;
                i7 = i2;
                iMin3 = i3;
                i11 = i11;
                bounds = bounds;
            }
            iMax3 = i5;
            i10 = i12;
            iMin2 = i;
            i7 = i2;
            bounds = rect;
        }
    }

    @Override // android.graphics.drawable.LayerDrawable, android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        super.setAlpha(i);
        this.RemoteActionCompatParcelizer = i;
        this.IconCompatParcelizer.setAlpha(i);
    }

    @Override // android.graphics.drawable.LayerDrawable, android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        super.setColorFilter(colorFilter);
        this.IconCompatParcelizer.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.LayerDrawable, android.graphics.drawable.Drawable
    public final int getOpacity() {
        SurfaceProcessorNodeExternalSyntheticLambda2 surfaceProcessorNodeExternalSyntheticLambda2 = this.asInterface;
        if (surfaceProcessorNodeExternalSyntheticLambda2 == null || surfaceProcessorNodeExternalSyntheticLambda2.TuitionPaymentFragmentbindingInflater1 == null || this.asInterface.TuitionPaymentFragmentbindingInflater1.hasAlpha() || this.IconCompatParcelizer.getAlpha() < 255) {
            return -3;
        }
        return super.getOpacity();
    }

    static requestClose TuitionPaymentFragmentbindingInflater1(ImageView imageView) {
        requestClose requestclose;
        Drawable drawable = imageView.getDrawable();
        if (drawable == null || !(drawable instanceof requestClose)) {
            requestclose = new requestClose(imageView.getResources());
        } else {
            requestclose = (requestClose) drawable;
        }
        imageView.setImageDrawable(null);
        return requestclose;
    }

    public final requestClose TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        SurfaceProcessorNodeExternalSyntheticLambda2 surfaceProcessorNodeExternalSyntheticLambda2;
        Drawable drawable = this.f1345a;
        if (drawable == null) {
            setDrawableByLayerId(0, this.getInterfaceDescriptor);
        } else {
            setDrawableByLayerId(0, drawable);
        }
        SurfaceProcessorNodeExternalSyntheticLambda2 surfaceProcessorNodeExternalSyntheticLambda3 = this.asInterface;
        if (surfaceProcessorNodeExternalSyntheticLambda3 == null) {
            setDrawableByLayerId(1, this.INotificationSideChannelStub);
            setDrawableByLayerId(2, this.INotificationSideChannelStubProxy);
            return this;
        }
        if (surfaceProcessorNodeExternalSyntheticLambda3.TuitionPaymentFragmentbindingInflater1 == null && this.asInterface.TuitionPaymentFragmentspecialinlinedviewModeldefault3 == null && this.asInterface.f227a == null) {
            setDrawableByLayerId(1, this.INotificationSideChannelStub);
            Drawable drawable2 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            if (drawable2 == null) {
                setDrawableByLayerId(2, this.INotificationSideChannelStubProxy);
                return this;
            }
            setDrawableByLayerId(2, drawable2);
            return this;
        }
        if (this.asInterface.TuitionPaymentFragmentspecialinlinedviewModeldefault3 != null || this.asInterface.f227a != null) {
            setDrawableByLayerId(1, this.INotificationSideChannelStub);
        } else {
            if (this.INotificationSideChannelDefault == null && (surfaceProcessorNodeExternalSyntheticLambda2 = this.asInterface) != null && surfaceProcessorNodeExternalSyntheticLambda2.f227a == null && this.asInterface.TuitionPaymentFragmentspecialinlinedviewModeldefault3 == null && this.asInterface.TuitionPaymentFragmentbindingInflater1 != null) {
                this.INotificationSideChannelDefault = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.write, this.asInterface.TuitionPaymentFragmentbindingInflater1);
            }
            setDrawableByLayerId(1, this.INotificationSideChannelDefault);
        }
        setDrawableByLayerId(2, this.INotificationSideChannelStubProxy);
        return this;
    }
}
