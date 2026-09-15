package com.google.firebase.dynamiclinks;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.net.Uri;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.android.gms.tasks.Task;
import com.google.firebase.FirebaseApp;
import com.google.firebase.dynamiclinks.internal.FirebaseDynamicLinksImpl;
import defpackage.SessionConfigValidatingBuilderExternalSyntheticLambda0;
import defpackage.initSession;
import defpackage.onCaptureSessionEnd;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import kotlin.io.encoding.Base64;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class DynamicLink {
    private final Bundle builderParameters;

    DynamicLink(Bundle bundle) {
        this.builderParameters = bundle;
    }

    @Deprecated
    public final Uri getUri() {
        return FirebaseDynamicLinksImpl.createDynamicLink(this.builderParameters);
    }

    @Deprecated
    public static final class Builder {
        private static final String APP_GOO_GL_PATTERN = "(https:\\/\\/)?[a-z0-9]{3,}\\.app\\.goo\\.gl$";
        public static final String KEY_API_KEY = "apiKey";
        public static final String KEY_DOMAIN = "domain";
        public static final String KEY_DOMAIN_URI_PREFIX = "domainUriPrefix";
        public static final String KEY_DYNAMIC_LINK = "dynamicLink";
        public static final String KEY_DYNAMIC_LINK_PARAMETERS = "parameters";
        public static final String KEY_LINK = "link";
        public static final String KEY_SUFFIX = "suffix";
        private static final String PAGE_LINK_PATTERN = "(https:\\/\\/)?[a-z0-9]{3,}\\.page\\.link$";
        private static final String SCHEME_PREFIX = "https://";
        private final Bundle builderParameters;
        private final Bundle fdlParameters;
        private final FirebaseDynamicLinksImpl firebaseDynamicLinksImpl;
        private static final byte[] $$c = {14, 70, 6, -35};
        private static final int $$f = 88;
        private static int $10 = 0;
        private static int $11 = 1;
        private static final byte[] $$d = {58, 66, -14, -31, -53, -3, -23, -12, 39, -54, -9, -16, -8, -7, -7, -10, -3, -23, 39, -53, -3, -23, -12, 26, -27, -27, 7, -22, -16, 54, -43, 2, -21, 1, -16, -9, 20, -27, -34, 2, -2, -19, -16, 36, -54, 7, -16, -16, -2, -19, -16, 8, -17, -15, 0, -15, -15, -3, 20, -47, -2, -16, 1, -29, 5, -23, 55};
        private static final int $$e = 247;
        private static final byte[] $$a = {25, 5, -88, -44, 43, -2, 21, -1, 16, 9, -20, 27, 34, -2, 2, 19, 16, -36, 54, -7, 16, 16, 2, 19, 16, 9, 7, -1, 8, 16, 2, 21, 7, 15, 8, 7, 15, 1, 9, 28, -3, 6, 28, -32, 44, -1, 11, 17, 2, 11, 11, 5, 30, 1, 18, -55, 43, -2, 21, -1, 16, 9, -20, 27, 34, -2, 2, 19, 16, -36, 54, -7, 16, 16, 2, 19, 16, -8, 17, 15, 0, 15, 15, 3, -20, 47, 2, 16, -1, 29, -5, 23, -55};
        private static final int $$b = 14;
        private static int TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 0;
        private static int g = 1;
        private static char b = 48832;
        private static char TuitionPaymentFragmentbindingInflater1 = 51985;
        private static char TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 27460;
        private static char TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 39393;

        private static void a(short s, short s2, short s3, Object[] objArr) {
            int i = (s3 * 52) + 4;
            byte[] bArr = $$a;
            int i2 = (s * 14) + 84;
            byte[] bArr2 = new byte[s2 + 1];
            int i3 = -1;
            if (bArr == null) {
                i2 = (i2 + i) - 10;
                i++;
                i3 = -1;
            }
            while (true) {
                int i4 = i3 + 1;
                bArr2[i4] = (byte) i2;
                if (i4 == s2) {
                    objArr[0] = new String(bArr2, 0);
                    return;
                }
                int i5 = i;
                i2 = (i2 + bArr[i]) - 10;
                i = i5 + 1;
                i3 = i4;
            }
        }

        /* JADX WARN: Code duplicated, block: B:10:0x0027  */
        /* JADX WARN: Code duplicated, block: B:8:0x001f  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x0030). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0027
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        private static void d(int r6, int r7, short r8, java.lang.Object[] r9) {
            /*
                byte[] r0 = com.google.firebase.dynamiclinks.DynamicLink.Builder.$$d
                int r8 = r8 * 11
                int r1 = 38 - r8
                int r6 = r6 * 19
                int r6 = 84 - r6
                int r7 = r7 * 26
                int r7 = 30 - r7
                byte[] r1 = new byte[r1]
                int r8 = 37 - r8
                r2 = 0
                if (r0 != 0) goto L19
                r3 = r7
                r7 = r8
                r4 = r2
                goto L30
            L19:
                r3 = r2
            L1a:
                byte r4 = (byte) r6
                r1[r3] = r4
                if (r3 != r8) goto L27
                java.lang.String r6 = new java.lang.String
                r6.<init>(r1, r2)
                r9[r2] = r6
                return
            L27:
                int r3 = r3 + 1
                r4 = r0[r7]
                r5 = r7
                r7 = r6
                r6 = r4
                r4 = r3
                r3 = r5
            L30:
                int r6 = -r6
                int r7 = r7 + r6
                int r6 = r7 + (-10)
                int r7 = r3 + 1
                r3 = r4
                goto L1a
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.dynamiclinks.DynamicLink.Builder.d(int, int, short, java.lang.Object[]):void");
        }

        public Builder(FirebaseDynamicLinksImpl firebaseDynamicLinksImpl) {
            this.firebaseDynamicLinksImpl = firebaseDynamicLinksImpl;
            Bundle bundle = new Bundle();
            this.builderParameters = bundle;
            bundle.putString(KEY_API_KEY, firebaseDynamicLinksImpl.getFirebaseApp().getOptions().getApiKey());
            Bundle bundle2 = new Bundle();
            this.fdlParameters = bundle2;
            bundle.putBundle(KEY_DYNAMIC_LINK_PARAMETERS, bundle2);
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
                int i3 = $10 + 49;
                $11 = i3 % 128;
                int i4 = i3 % 2;
                cArr3[0] = cArr[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3];
                cArr3[1] = cArr[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1];
                int i5 = 58224;
                int i6 = 0;
                while (i6 < 16) {
                    char c2 = cArr3[1];
                    char c3 = cArr3[c];
                    int i7 = (c3 + i5) ^ ((c3 << 4) + ((char) (((long) TuitionPaymentFragmentspecialinlinedviewModeldefault3) ^ 8611973335120459638L)));
                    int i8 = c3 >>> 5;
                    try {
                        Object[] objArr2 = new Object[4];
                        objArr2[3] = Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault1);
                        objArr2[2] = Integer.valueOf(i8);
                        objArr2[1] = Integer.valueOf(i7);
                        objArr2[c] = Integer.valueOf(c2);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1824600641);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                            char modifierMetaStateMask = (char) (((byte) KeyEvent.getModifierMetaStateMask()) + 47774);
                            int scrollBarFadeDuration = 468 - (ViewConfiguration.getScrollBarFadeDuration() >> 16);
                            int iMyTid = (Process.myTid() >> 22) + 13;
                            Class[] clsArr = new Class[4];
                            clsArr[c] = Integer.TYPE;
                            clsArr[1] = Integer.TYPE;
                            clsArr[2] = Integer.TYPE;
                            clsArr[3] = Integer.TYPE;
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(modifierMetaStateMask, scrollBarFadeDuration, iMyTid, -2007001706, false, "o", clsArr);
                        }
                        char cCharValue = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                        cArr3[1] = cCharValue;
                        int i9 = i6;
                        Object[] objArr3 = {Integer.valueOf(cArr3[c]), Integer.valueOf((cCharValue + i5) ^ ((cCharValue << 4) + ((char) (((long) b) ^ 8611973335120459638L)))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(TuitionPaymentFragmentbindingInflater1)};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1824600641);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (View.resolveSize(0, 0) + 47773), 468 - Color.alpha(0), (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 13, -2007001706, false, "o", new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                        }
                        cArr3[0] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).charValue();
                        i5 -= 40503;
                        i6 = i9 + 1;
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
                    byte b2 = (byte) (-1);
                    byte b3 = (byte) (b2 + 1);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (MotionEvent.axisFromString("") + 1), (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 2323, 44 - (ViewConfiguration.getScrollBarSize() >> 8), -1312321721, false, $$g(b2, b3, b3), new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
                int i10 = $11 + 9;
                $10 = i10 % 128;
                int i11 = i10 % 2;
            }
        }

        @Deprecated
        public final Builder setLongLink(Uri uri) {
            int i = 2 % 2;
            int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 13;
            g = i2 % 128;
            if (i2 % 2 == 0) {
                this.builderParameters.putParcelable(KEY_DYNAMIC_LINK, uri);
                throw null;
            }
            this.builderParameters.putParcelable(KEY_DYNAMIC_LINK, uri);
            int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 105;
            g = i3 % 128;
            int i4 = i3 % 2;
            return this;
        }

        @Deprecated
        public final Uri getLongLink() {
            int i = 2 % 2;
            int i2 = g + 121;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
            int i3 = i2 % 2;
            Uri uri = (Uri) this.fdlParameters.getParcelable(KEY_DYNAMIC_LINK);
            if (uri != null) {
                return uri;
            }
            int i4 = g + 3;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
            if (i4 % 2 == 0) {
                return Uri.EMPTY;
            }
            Uri uri2 = Uri.EMPTY;
            throw null;
        }

        @Deprecated
        public final Builder setLink(Uri uri) {
            int i = 2 % 2;
            int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 7;
            g = i2 % 128;
            int i3 = i2 % 2;
            this.fdlParameters.putParcelable(KEY_LINK, uri);
            int i4 = g + 87;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
            if (i4 % 2 == 0) {
                return this;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Deprecated
        public final Uri getLink() {
            int i = 2 % 2;
            int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 11;
            g = i2 % 128;
            int i3 = i2 % 2;
            Uri uri = (Uri) this.fdlParameters.getParcelable(KEY_LINK);
            if (uri != null) {
                return uri;
            }
            Uri uri2 = Uri.EMPTY;
            int i4 = g + 59;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
            int i5 = i4 % 2;
            return uri2;
        }

        @Deprecated
        public final Builder setDynamicLinkDomain(String str) {
            int i = 2 % 2;
            int i2 = g + 87;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
            int i3 = i2 % 2;
            if (!str.matches(APP_GOO_GL_PATTERN)) {
                int i4 = g + 47;
                TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
                int i5 = i4 % 2;
                if (!str.matches(PAGE_LINK_PATTERN)) {
                    throw new IllegalArgumentException("Use setDomainUriPrefix() instead, setDynamicLinkDomain() is only applicable for *.page.link and *.app.goo.gl domains.");
                }
            }
            this.builderParameters.putString(KEY_DOMAIN, str);
            this.builderParameters.putString(KEY_DOMAIN_URI_PREFIX, SCHEME_PREFIX.concat(String.valueOf(str)));
            return this;
        }

        @Deprecated
        public final Builder setDomainUriPrefix(String str) {
            int i = 2 % 2;
            int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 87;
            g = i2 % 128;
            if (i2 % 2 == 0) {
                str.matches(APP_GOO_GL_PATTERN);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            if (str.matches(APP_GOO_GL_PATTERN) || str.matches(PAGE_LINK_PATTERN)) {
                this.builderParameters.putString(KEY_DOMAIN, str.replace(SCHEME_PREFIX, ""));
                int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 19;
                g = i3 % 128;
                if (i3 % 2 == 0) {
                    int i4 = 3 / 2;
                }
            }
            this.builderParameters.putString(KEY_DOMAIN_URI_PREFIX, str);
            return this;
        }

        @Deprecated
        public final String getDomainUriPrefix() {
            int i = 2 % 2;
            int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 125;
            g = i2 % 128;
            int i3 = i2 % 2;
            String string = this.builderParameters.getString(KEY_DOMAIN_URI_PREFIX, "");
            int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 41;
            g = i4 % 128;
            if (i4 % 2 != 0) {
                return string;
            }
            throw null;
        }

        @Deprecated
        public final Builder setAndroidParameters(AndroidParameters androidParameters) {
            int i = 2 % 2;
            int i2 = g + 35;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
            if (i2 % 2 != 0) {
                this.fdlParameters.putAll(androidParameters.parameters);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            this.fdlParameters.putAll(androidParameters.parameters);
            int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 107;
            g = i3 % 128;
            int i4 = i3 % 2;
            return this;
        }

        @Deprecated
        public final Builder setIosParameters(IosParameters iosParameters) {
            int i = 2 % 2;
            int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 109;
            g = i2 % 128;
            int i3 = i2 % 2;
            Bundle bundle = this.fdlParameters;
            Bundle bundle2 = iosParameters.parameters;
            if (i3 != 0) {
                bundle.putAll(bundle2);
                return this;
            }
            bundle.putAll(bundle2);
            throw null;
        }

        @Deprecated
        public final Builder setGoogleAnalyticsParameters(GoogleAnalyticsParameters googleAnalyticsParameters) {
            int i = 2 % 2;
            int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 49;
            g = i2 % 128;
            if (i2 % 2 == 0) {
                this.fdlParameters.putAll(googleAnalyticsParameters.parameters);
                throw null;
            }
            this.fdlParameters.putAll(googleAnalyticsParameters.parameters);
            int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 13;
            g = i3 % 128;
            int i4 = i3 % 2;
            return this;
        }

        @Deprecated
        public final Builder setItunesConnectAnalyticsParameters(ItunesConnectAnalyticsParameters itunesConnectAnalyticsParameters) throws Throwable {
            Object[] objArr;
            int i = 2 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                char c = (char) (31533 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)));
                int iKeyCodeFromString = 921 - KeyEvent.keyCodeFromString("");
                int edgeSlop = (ViewConfiguration.getEdgeSlop() >> 16) + 28;
                byte[] bArr = $$a;
                byte b2 = bArr[37];
                byte b3 = bArr[80];
                Object[] objArr2 = new Object[1];
                a(b2, b3, b3, objArr2);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(c, iKeyCodeFromString, edgeSlop, -1048449946, false, (String) objArr2[0], null);
            }
            long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
            Object[] objArr3 = new Object[1];
            c(new char[]{1177, 13937, 64876, 19010, 15786, 14373, 33187, 20081, 57666, 7897, 9291, 54642, 4778, 3323, 31069, 27168, 65188, 267, 24096, 3435, 59524, 23861, 18678, 22834}, 22 - (ViewConfiguration.getDoubleTapTimeout() >> 16), objArr3);
            Class<?> cls = Class.forName((String) objArr3[0]);
            Object[] objArr4 = new Object[1];
            c(new char[]{50988, 47430, 53687, 13155, 58037, 63724, 23903, 15743, 5965, 2227, 27017, 45738, 21474, 1615, 44758, 20763, 47055, 59942}, ((byte) KeyEvent.getModifierMetaStateMask()) + 16, objArr4);
            long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(889369593);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                char c2 = (char) ((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 31532);
                int iIndexOf = TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 922;
                int iMakeMeasureSpec = 28 - View.MeasureSpec.makeMeasureSpec(0, 0);
                byte b4 = $$a[80];
                byte b5 = b4;
                Object[] objArr5 = new Object[1];
                a(b5, (byte) (b5 | 52), b4, objArr5);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(c2, iIndexOf, iMakeMeasureSpec, -778300370, false, (String) objArr5[0], null);
            }
            if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    char threadPriority = (char) (((Process.getThreadPriority(0) + 20) >> 6) + 31533);
                    int iNormalizeMetaState = 921 - KeyEvent.normalizeMetaState(0);
                    int keyRepeatDelay = (ViewConfiguration.getKeyRepeatDelay() >> 16) + 28;
                    byte[] bArr2 = $$a;
                    byte b6 = bArr2[80];
                    Object[] objArr6 = new Object[1];
                    a(b6, (byte) (b6 | 37), bArr2[37], objArr6);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(threadPriority, iNormalizeMetaState, keyRepeatDelay, -1142834547, false, (String) objArr6[0], null);
                }
                Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
                objArr = new Object[]{new int[1], new int[]{((int[]) objArr7[1])[0]}, (Object[]) objArr7[2], new int[]{((int[]) objArr7[3])[0]}, (String[]) objArr7[4]};
                int iIdentityHashCode = System.identityHashCode(this);
                int i2 = ~iIdentityHashCode;
                int i3 = ((((-1128424400) + (((~((-1143362585) | i2)) | 630717059) * 226)) + (((~(i2 | (-1075840025))) | ((~((-630717060) | iIdentityHashCode)) | 563194499)) * (-113))) + ((~(iIdentityHashCode | (-1143362585))) * 113)) - 1724163970;
                int i4 = (i3 << 13) ^ i3;
                int i5 = i4 ^ (i4 >>> 17);
                ((int[]) objArr[0])[0] = i5 ^ (i5 << 5);
            } else {
                Object[] objArr8 = new Object[1];
                c(new char[]{9822, 43317, 5810, 58258, 43997, 874, 38242, 26702, 7468, 1117, 152, 16912, 50631, 12509, 46580, 4103, 28012, 60702, 24344, 62911, 1338, 6031, 45390, 44520, 12486, 63414, 59671, 261}, (Process.myPid() >> 22) + 26, objArr8);
                Class<?> cls2 = Class.forName((String) objArr8[0]);
                Object[] objArr9 = new Object[1];
                c(new char[]{32648, 21707, 42022, 3343, 16604, 14168, 42080, 2671, 52137, 62636, 60350, 51852, 24003, 5943, 36409, 9032, 5018, 27860, 41515, 30284}, 18 - (ViewConfiguration.getDoubleTapTimeout() >> 16), objArr9);
                Context applicationContext = (Context) cls2.getMethod((String) objArr9[0], new Class[0]).invoke(null, null);
                if (applicationContext != null) {
                    if ((applicationContext instanceof ContextWrapper) && ((ContextWrapper) applicationContext).getBaseContext() == null) {
                        int i6 = g + 11;
                        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i6 % 128;
                        int i7 = i6 % 2;
                        applicationContext = null;
                    } else {
                        applicationContext = applicationContext.getApplicationContext();
                    }
                }
                Object[] objArr10 = new Object[1];
                c(new char[]{21969, 1865, 64582, 2590, 47295, 12582, 5199, 48207, 48034, 60233, 31626, 19026, 31580, 33831, 11842, 40714, 25613, 30760}, 16 - TextUtils.getOffsetAfter("", 0), objArr10);
                Class<?> cls3 = Class.forName((String) objArr10[0]);
                Object[] objArr11 = new Object[1];
                c(new char[]{47560, 36586, 30775, 13899, 24915, 1394, 28606, 12181, 27316, 46486, 57455, 29745, 1154, 45526, 17139, 48432, 54991, 34016}, (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 15, objArr11);
                int iIntValue = ((Integer) cls3.getMethod((String) objArr11[0], Object.class).invoke(null, this)).intValue();
                int i8 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 47;
                g = i8 % 128;
                int i9 = i8 % 2;
                try {
                    Object[] objArr12 = {applicationContext, Integer.valueOf(iIntValue), 0, -1724163970};
                    byte[] bArr3 = $$d;
                    byte b7 = bArr3[33];
                    byte b8 = b7;
                    Object[] objArr13 = new Object[1];
                    d(b7, b8, b8, objArr13);
                    Class<?> cls4 = Class.forName((String) objArr13[0]);
                    byte b9 = bArr3[54];
                    byte b10 = b9;
                    Object[] objArr14 = new Object[1];
                    d(b9, b10, b10, objArr14);
                    Object[] objArr15 = (Object[]) cls4.getMethod((String) objArr14[0], Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        char maximumFlingVelocity = (char) ((ViewConfiguration.getMaximumFlingVelocity() >> 16) + 31533);
                        int iGreen = Color.green(0) + 921;
                        int i10 = 29 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1));
                        byte[] bArr4 = $$a;
                        byte b11 = bArr4[80];
                        Object[] objArr16 = new Object[1];
                        a(b11, (byte) (b11 | 37), bArr4[37], objArr16);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(maximumFlingVelocity, iGreen, i10, -1142834547, false, (String) objArr16[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr15);
                    try {
                        Object[] objArr17 = new Object[1];
                        c(new char[]{1177, 13937, 64876, 19010, 15786, 14373, 33187, 20081, 57666, 7897, 9291, 54642, 4778, 3323, 31069, 27168, 65188, 267, 24096, 3435, 59524, 23861, 18678, 22834}, Process.getGidForName("") + 23, objArr17);
                        Class<?> cls5 = Class.forName((String) objArr17[0]);
                        Object[] objArr18 = new Object[1];
                        c(new char[]{50988, 47430, 53687, 13155, 58037, 63724, 23903, 15743, 5965, 2227, 27017, 45738, 21474, 1615, 44758, 20763, 47055, 59942}, View.MeasureSpec.makeMeasureSpec(0, 0) + 15, objArr18);
                        long jLongValue2 = ((Long) cls5.getDeclaredMethod((String) objArr18[0], new Class[0]).invoke(null, new Object[0])).longValue();
                        Long lValueOf = Long.valueOf(jLongValue2);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(889369593);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                            char cResolveOpacity = (char) (31533 - Drawable.resolveOpacity(0, 0));
                            int iAlpha = Color.alpha(0) + 921;
                            int iAxisFromString = MotionEvent.axisFromString("") + 29;
                            byte b12 = $$a[80];
                            byte b13 = b12;
                            Object[] objArr19 = new Object[1];
                            a(b13, (byte) (b13 | 52), b12, objArr19);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(cResolveOpacity, iAlpha, iAxisFromString, -778300370, false, (String) objArr19[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                        Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                            char minimumFlingVelocity = (char) ((ViewConfiguration.getMinimumFlingVelocity() >> 16) + 31533);
                            int iIndexOf2 = TextUtils.indexOf("", "", 0) + 921;
                            int maximumFlingVelocity2 = 28 - (ViewConfiguration.getMaximumFlingVelocity() >> 16);
                            byte[] bArr5 = $$a;
                            byte b14 = bArr5[37];
                            byte b15 = bArr5[80];
                            Object[] objArr20 = new Object[1];
                            a(b14, b15, b15, objArr20);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(minimumFlingVelocity, iIndexOf2, maximumFlingVelocity2, -1048449946, false, (String) objArr20[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf2);
                        objArr = objArr15;
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
            if (((int[]) objArr[3])[0] != ((int[]) objArr[1])[0]) {
                ArrayList arrayList = new ArrayList();
                String[] strArr = (String[]) objArr[4];
                if (strArr == null) {
                    throw null;
                }
                for (String str : strArr) {
                    arrayList.add(str);
                }
                throw null;
            }
            int i11 = ((int[]) objArr[0])[0];
            Object[] objArr21 = {new int[1], new int[]{((int[]) objArr[1])[0]}, (Object[]) objArr[2], new int[]{((int[]) objArr[3])[0]}, (String[]) objArr[4]};
            int iIdentityHashCode2 = System.identityHashCode(this);
            int i12 = ~iIdentityHashCode2;
            int i13 = ~(48044710 | i12);
            int i14 = i11 + (-1792757165) + ((1679827281 | i13) * (-712)) + (((~(iIdentityHashCode2 | 1727871991)) | (~(i12 | (-1679827282)))) * (-712)) + (((-1726034934) | i13) * 712);
            int i15 = (i14 << 13) ^ i14;
            int i16 = i15 ^ (i15 >>> 17);
            ((int[]) objArr21[0])[0] = i16 ^ (i16 << 5);
            this.fdlParameters.putAll(itunesConnectAnalyticsParameters.parameters);
            return this;
        }

        @Deprecated
        public final Builder setSocialMetaTagParameters(SocialMetaTagParameters socialMetaTagParameters) {
            int i = 2 % 2;
            int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 39;
            g = i2 % 128;
            int i3 = i2 % 2;
            this.fdlParameters.putAll(socialMetaTagParameters.parameters);
            if (i3 != 0) {
                return this;
            }
            throw null;
        }

        @Deprecated
        public final Builder setNavigationInfoParameters(NavigationInfoParameters navigationInfoParameters) {
            int i = 2 % 2;
            int i2 = g + 97;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
            if (i2 % 2 != 0) {
                this.fdlParameters.putAll(navigationInfoParameters.parameters);
                int i3 = 19 / 0;
            } else {
                this.fdlParameters.putAll(navigationInfoParameters.parameters);
            }
            int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 21;
            g = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 8 / 0;
            }
            return this;
        }

        @Deprecated
        public final DynamicLink buildDynamicLink() {
            int i = 2 % 2;
            FirebaseDynamicLinksImpl.verifyDomainUriPrefix(this.builderParameters);
            DynamicLink dynamicLink = new DynamicLink(this.builderParameters);
            int i2 = g + 43;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
            if (i2 % 2 == 0) {
                return dynamicLink;
            }
            throw null;
        }

        @Deprecated
        public final Task<ShortDynamicLink> buildShortDynamicLink() {
            int i = 2 % 2;
            int i2 = g + 101;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
            int i3 = i2 % 2;
            verifyApiKey();
            Task<ShortDynamicLink> taskCreateShortDynamicLink = this.firebaseDynamicLinksImpl.createShortDynamicLink(this.builderParameters);
            int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 81;
            g = i4 % 128;
            int i5 = i4 % 2;
            return taskCreateShortDynamicLink;
        }

        @Deprecated
        public final Task<ShortDynamicLink> buildShortDynamicLink(int i) {
            int i2 = 2 % 2;
            int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 93;
            g = i3 % 128;
            int i4 = i3 % 2;
            verifyApiKey();
            this.builderParameters.putInt(KEY_SUFFIX, i);
            Task<ShortDynamicLink> taskCreateShortDynamicLink = this.firebaseDynamicLinksImpl.createShortDynamicLink(this.builderParameters);
            int i5 = g + 71;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i5 % 128;
            int i6 = i5 % 2;
            return taskCreateShortDynamicLink;
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x002e, code lost:
        
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:12:0x0036, code lost:
        
            throw new java.lang.IllegalArgumentException("Missing API key. Set with setApiKey().");
         */
        /* JADX WARN: Code restructure failed: missing block: B:5:0x001a, code lost:
        
            if (r3.builderParameters.getString(com.google.firebase.dynamiclinks.DynamicLink.Builder.KEY_API_KEY) != null) goto L9;
         */
        /* JADX WARN: Code restructure failed: missing block: B:8:0x0023, code lost:
        
            if (r3.builderParameters.getString(com.google.firebase.dynamiclinks.DynamicLink.Builder.KEY_API_KEY) != null) goto L9;
         */
        /* JADX WARN: Code restructure failed: missing block: B:9:0x0025, code lost:
        
            r1 = com.google.firebase.dynamiclinks.DynamicLink.Builder.TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 97;
            com.google.firebase.dynamiclinks.DynamicLink.Builder.g = r1 % 128;
            r1 = r1 % 2;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private void verifyApiKey() {
            /*
                r3 = this;
                r0 = 2
                int r1 = r0 % r0
                int r1 = com.google.firebase.dynamiclinks.DynamicLink.Builder.TuitionPaymentFragmentspecialinlinedviewModeldefault2
                int r1 = r1 + 103
                int r2 = r1 % 128
                com.google.firebase.dynamiclinks.DynamicLink.Builder.g = r2
                int r1 = r1 % r0
                java.lang.String r2 = "apiKey"
                if (r1 != 0) goto L1d
                android.os.Bundle r1 = r3.builderParameters
                java.lang.String r1 = r1.getString(r2)
                r2 = 71
                int r2 = r2 / 0
                if (r1 == 0) goto L2f
                goto L25
            L1d:
                android.os.Bundle r1 = r3.builderParameters
                java.lang.String r1 = r1.getString(r2)
                if (r1 == 0) goto L2f
            L25:
                int r1 = com.google.firebase.dynamiclinks.DynamicLink.Builder.TuitionPaymentFragmentspecialinlinedviewModeldefault2
                int r1 = r1 + 97
                int r2 = r1 % 128
                com.google.firebase.dynamiclinks.DynamicLink.Builder.g = r2
                int r1 = r1 % r0
                return
            L2f:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.String r1 = "Missing API key. Set with setApiKey()."
                r0.<init>(r1)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.dynamiclinks.DynamicLink.Builder.verifyApiKey():void");
        }

        /* JADX WARN: Code duplicated, block: B:10:0x0024  */
        /* JADX WARN: Code duplicated, block: B:8:0x001e  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x0026). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0024
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        private static java.lang.String $$g(byte r6, int r7, int r8) {
            /*
                int r6 = r6 + 4
                byte[] r0 = com.google.firebase.dynamiclinks.DynamicLink.Builder.$$c
                int r8 = r8 * 2
                int r8 = r8 + 108
                int r7 = r7 * 2
                int r7 = r7 + 1
                byte[] r1 = new byte[r7]
                r2 = 0
                if (r0 != 0) goto L14
                r3 = r7
                r4 = r2
                goto L26
            L14:
                r3 = r2
            L15:
                int r4 = r3 + 1
                int r6 = r6 + 1
                byte r5 = (byte) r8
                r1[r3] = r5
                if (r4 != r7) goto L24
                java.lang.String r6 = new java.lang.String
                r6.<init>(r1, r2)
                return r6
            L24:
                r3 = r0[r6]
            L26:
                int r8 = r8 + r3
                r3 = r4
                goto L15
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.dynamiclinks.DynamicLink.Builder.$$g(byte, int, int):java.lang.String");
        }
    }

    @Deprecated
    public static final class NavigationInfoParameters {
        public static final String KEY_FORCED_REDIRECT = "efr";
        final Bundle parameters;

        /* JADX INFO: loaded from: classes5.dex */
        @Deprecated
        public static final class Builder {
            private static short[] TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            private final Bundle parameters = new Bundle();
            private static final byte[] $$c = {Base64.padSymbol, -108, 49, -100};
            private static final int $$f = 61;
            private static int $10 = 0;
            private static int $11 = 1;
            private static final byte[] $$d = {112, 19, -59, 97, -9, 5, 66, -54, -5, 3, 11, -2, 10, 58, -48, -10, 13, -11, 6, 9, 8, 57, -59, 6, 10, -13, 20, -14, 12, 7, -11, 72, -63, 7, 14, 1, 1, -11, 72, -56, -2, -3, 18, -10, 7, 16, -8, 65, -73, 3, 27, -5, 6, -30, 15, -8, 14, -3, 4, 33, -14, -21, 15, 11, -6, -3, 49, -41, 20, -3, -3, 11, -6, -3, 4, 6, 14, 5, -3, 11, -8, 6, -2, 5, 6, -2, 12, 4, -15, 16, 7, -15, 45, -31, 14, 2, -4, 11, 2, 2, 8, -17, 12, -5, 70};
            private static final int $$e = 128;
            private static final byte[] $$a = {104, 27, -72, 120, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 55, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 54};
            private static final int $$b = 249;
            private static int asInterface = 0;
            private static int asBinder = 1;
            private static int TuitionPaymentFragmentbindingInflater1 = 407029505;
            private static int TuitionPaymentFragmentspecialinlinedviewModeldefault3 = -1934795620;
            private static int TuitionPaymentFragmentspecialinlinedviewModeldefault2 = -135357191;
            private static byte[] b = {122, -18, 18, -27, -49, 48, -18, 23, -25, 28, -64, -61, 93, -30, -89, 44, 29, 28, 27, -24, 16, -21, 115, 30, -30, 19, -18, -19, 26, -11, 8, 25, 20, -27, -23, 19, -31, 70, -27, 26, 21, -20, -14, Base64.padSymbol, -29, -19, 21, -21, 19, -9, -60, -11, 88, -26, -23, -43, 44, 29, 28, 27, -24, 16, -21, 126, 25, -32, 19, -11, 24, 28, 27, 26, -26, -55, 43, -32, -17, 21, -26, 27, -12, 112, -18, 23, -25, 28, -64, -61, 33, 31, -21, 19, -40, 43, 13, -13, 17, 112, -25, 19, -54, Base64.padSymbol, 19, -12, -1, 41, -29, -19, 19, -32, -17, -25, 29, 32, -42, 42, -30, -26, -56, 26, 25, 49, -42, 28, -30, 53, -49, -18, 41, -54, -28, 40, 25, -56, -30, 25, 41, -29, -49, -31, -26, 30, -31, 55, -50, -26, -29, 54, -41, -28, 41, -51, 52, -27, -51, -26, -28, 54, -55, -29, 28, -28, 50, 26, -26, -42, 41, -26, -53, -27, 54, -30, -25, -26, 29, -25, -43, 32, -42, -32, 41, -53, -28, 42, -27, -41, 25, 25, 52, -49, -26, 48, -52, -32, -26, 25, 27, -25, 54, -25, -43, -26, 55, 26, -41, -27, 26, 53, -49, -25, 25, -26, -32, 28, 49, -56, 52, -54, 54, -55, -28, -28, 27, -27, -25, 24, 40, -46, 43, -27, -44, 44, -25, -56, 51, -53, -29, 28, 52, -27, 24};

            /* JADX WARN: Code duplicated, block: B:10:0x0028  */
            /* JADX WARN: Code duplicated, block: B:8:0x0020  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:11:0x002a). Please report as a decompilation issue!!! */
            /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0028
                	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                */
            private static void a(byte r5, byte r6, byte r7, java.lang.Object[] r8) {
                /*
                    int r5 = r5 * 52
                    int r5 = 55 - r5
                    byte[] r0 = com.google.firebase.dynamiclinks.DynamicLink.NavigationInfoParameters.Builder.$$a
                    int r7 = r7 * 14
                    int r7 = 98 - r7
                    int r6 = r6 * 52
                    int r1 = r6 + 1
                    byte[] r1 = new byte[r1]
                    r2 = 0
                    if (r0 != 0) goto L16
                    r3 = r6
                    r4 = r2
                    goto L2a
                L16:
                    r3 = r2
                L17:
                    byte r4 = (byte) r7
                    r1[r3] = r4
                    int r5 = r5 + 1
                    int r4 = r3 + 1
                    if (r3 != r6) goto L28
                    java.lang.String r5 = new java.lang.String
                    r5.<init>(r1, r2)
                    r8[r2] = r5
                    return
                L28:
                    r3 = r0[r5]
                L2a:
                    int r3 = -r3
                    int r7 = r7 + r3
                    int r7 = r7 + (-11)
                    r3 = r4
                    goto L17
                */
                throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.dynamiclinks.DynamicLink.NavigationInfoParameters.Builder.a(byte, byte, byte, java.lang.Object[]):void");
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
            private static void d(short r6, byte r7, short r8, java.lang.Object[] r9) {
                /*
                    byte[] r0 = com.google.firebase.dynamiclinks.DynamicLink.NavigationInfoParameters.Builder.$$d
                    int r8 = r8 * 15
                    int r8 = r8 + 84
                    int r6 = r6 * 3
                    int r1 = r6 + 50
                    int r7 = r7 + 4
                    byte[] r1 = new byte[r1]
                    int r6 = r6 + 49
                    r2 = 0
                    if (r0 != 0) goto L17
                    r4 = r8
                    r3 = r2
                    r8 = r7
                    goto L2e
                L17:
                    r3 = r2
                L18:
                    int r7 = r7 + 1
                    byte r4 = (byte) r8
                    r1[r3] = r4
                    if (r3 != r6) goto L27
                    java.lang.String r6 = new java.lang.String
                    r6.<init>(r1, r2)
                    r9[r2] = r6
                    return
                L27:
                    r4 = r0[r7]
                    int r3 = r3 + 1
                    r5 = r8
                    r8 = r7
                    r7 = r5
                L2e:
                    int r4 = -r4
                    int r7 = r7 + r4
                    int r7 = r7 + 3
                    r5 = r8
                    r8 = r7
                    r7 = r5
                    goto L18
                */
                throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.dynamiclinks.DynamicLink.NavigationInfoParameters.Builder.d(short, byte, short, java.lang.Object[]):void");
            }

            /* JADX WARN: Code duplicated, block: B:69:0x02c6  */
            private static void c(int i, int i2, short s, byte b2, int i3, Object[] objArr) throws Throwable {
                long j;
                boolean z;
                int i4;
                int i5 = 2;
                int i6 = 2 % 2;
                SessionConfigValidatingBuilderExternalSyntheticLambda0 sessionConfigValidatingBuilderExternalSyntheticLambda0 = new SessionConfigValidatingBuilderExternalSyntheticLambda0();
                StringBuilder sb = new StringBuilder();
                try {
                    Object[] objArr2 = {Integer.valueOf(i2), Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault3)};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1238528667);
                    long j2 = 0;
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        byte b3 = (byte) 0;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 2267, (ViewConfiguration.getScrollBarSize() >> 8) + 33, 1387473586, false, $$g(b3, b3, (byte) $$c.length), new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).intValue();
                    int i7 = iIntValue == -1 ? 1 : 0;
                    if (i7 == 0) {
                        j = 3046761265686732006L;
                    } else {
                        byte[] bArr = b;
                        if (bArr != null) {
                            int length = bArr.length;
                            byte[] bArr2 = new byte[length];
                            int i8 = $10 + 7;
                            $11 = i8 % 128;
                            int i9 = i8 % 2;
                            int i10 = 0;
                            while (i10 < length) {
                                int i11 = $10 + 13;
                                $11 = i11 % 128;
                                int i12 = i11 % i5;
                                try {
                                    Object[] objArr3 = {Integer.valueOf(bArr[i10])};
                                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(632534666);
                                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                        byte b4 = (byte) 0;
                                        byte b5 = b4;
                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (ViewConfiguration.getWindowTouchSlop() >> 8), 3357 - (ExpandableListView.getPackedPositionForChild(0, 0) > j2 ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == j2 ? 0 : -1)), 18 - KeyEvent.normalizeMetaState(0), -1054011043, false, $$g(b4, b5, b5), new Class[]{Integer.TYPE});
                                    }
                                    bArr2[i10] = ((Byte) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).byteValue();
                                    i10++;
                                    i5 = 2;
                                    j2 = 0;
                                } catch (Throwable th) {
                                    Throwable cause = th.getCause();
                                    if (cause == null) {
                                        throw th;
                                    }
                                    throw cause;
                                }
                            }
                            bArr = bArr2;
                        }
                        if (bArr != null) {
                            int i13 = $10 + 113;
                            $11 = i13 % 128;
                            if (i13 % 2 == 0) {
                                byte[] bArr3 = b;
                                Object[] objArr4 = {Integer.valueOf(i3), Integer.valueOf(TuitionPaymentFragmentbindingInflater1)};
                                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1238528667);
                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                                    byte b6 = (byte) 0;
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) TextUtils.getCapsMode("", 0, 0), 2267 - View.getDefaultSize(0, 0), TextUtils.indexOf("", "") + 33, 1387473586, false, $$g(b6, b6, (byte) $$c.length), new Class[]{Integer.TYPE, Integer.TYPE});
                                }
                                i4 = ((byte) (((long) bArr3[((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4)).intValue()]) | 3046761265686732006L)) - ((int) (((long) TuitionPaymentFragmentspecialinlinedviewModeldefault3) + 3046761265686732006L));
                            } else {
                                byte[] bArr4 = b;
                                try {
                                    Object[] objArr5 = {Integer.valueOf(i3), Integer.valueOf(TuitionPaymentFragmentbindingInflater1)};
                                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1238528667);
                                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                                        byte b7 = (byte) 0;
                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (ViewConfiguration.getFadingEdgeLength() >> 16), TextUtils.indexOf("", "", 0) + 2267, 33 - (ViewConfiguration.getTapTimeout() >> 16), 1387473586, false, $$g(b7, b7, (byte) $$c.length), new Class[]{Integer.TYPE, Integer.TYPE});
                                    }
                                    i4 = ((byte) (((long) bArr4[((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).intValue()]) ^ 3046761265686732006L)) + ((int) (((long) TuitionPaymentFragmentspecialinlinedviewModeldefault3) ^ 3046761265686732006L));
                                } catch (Throwable th2) {
                                    Throwable cause2 = th2.getCause();
                                    if (cause2 == null) {
                                        throw th2;
                                    }
                                    throw cause2;
                                }
                            }
                            iIntValue = (byte) i4;
                            j = 3046761265686732006L;
                        } else {
                            j = 3046761265686732006L;
                            iIntValue = (short) (((short) (((long) TuitionPaymentFragmentspecialinlinedviewModeldefault1[i3 + ((int) (((long) TuitionPaymentFragmentbindingInflater1) ^ 3046761265686732006L))]) ^ 3046761265686732006L)) + ((int) (((long) TuitionPaymentFragmentspecialinlinedviewModeldefault3) ^ 3046761265686732006L)));
                        }
                    }
                    if (iIntValue > 0) {
                        sessionConfigValidatingBuilderExternalSyntheticLambda0.b = ((i3 + iIntValue) - 2) + ((int) (((long) TuitionPaymentFragmentbindingInflater1) ^ j)) + i7;
                        Object[] objArr6 = {sessionConfigValidatingBuilderExternalSyntheticLambda0, Integer.valueOf(i), Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault2), sb};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1079014435);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                            byte b8 = (byte) 0;
                            byte b9 = b8;
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b((char) (55904 - (ViewConfiguration.getTouchSlop() >> 8)), 2854 - MotionEvent.axisFromString(""), 14 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), -1529949196, false, $$g(b8, b9, (byte) (b9 + 3)), new Class[]{Object.class, Integer.TYPE, Integer.TYPE, Object.class});
                        }
                        ((StringBuilder) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr6)).append(sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
                        sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                        byte[] bArr5 = b;
                        if (bArr5 != null) {
                            int length2 = bArr5.length;
                            byte[] bArr6 = new byte[length2];
                            for (int i14 = 0; i14 < length2; i14++) {
                                bArr6[i14] = (byte) (((long) bArr5[i14]) ^ 3046761265686732006L);
                            }
                            bArr5 = bArr6;
                        }
                        if (bArr5 != null) {
                            int i15 = $11 + 95;
                            $10 = i15 % 128;
                            if (i15 % 2 != 0) {
                                z = false;
                            } else {
                                z = true;
                            }
                        } else {
                            z = false;
                        }
                        sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 1;
                        while (sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3 < iIntValue) {
                            if (z) {
                                int i16 = $11 + 123;
                                $10 = i16 % 128;
                                int i17 = i16 % 2;
                                byte[] bArr7 = b;
                                int i18 = sessionConfigValidatingBuilderExternalSyntheticLambda0.b;
                                sessionConfigValidatingBuilderExternalSyntheticLambda0.b = i18 - 1;
                                sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = (char) (sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2 + (((byte) (((byte) (((long) bArr7[i18]) ^ 3046761265686732006L)) + s)) ^ b2));
                            } else {
                                short[] sArr = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                                int i19 = sessionConfigValidatingBuilderExternalSyntheticLambda0.b;
                                sessionConfigValidatingBuilderExternalSyntheticLambda0.b = i19 - 1;
                                sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = (char) (sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2 + (((short) (((short) (((long) sArr[i19]) ^ 3046761265686732006L)) + s)) ^ b2));
                            }
                            sb.append(sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
                            sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                            sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3++;
                        }
                    }
                    objArr[0] = sb.toString();
                } catch (Throwable th3) {
                    Throwable cause3 = th3.getCause();
                    if (cause3 == null) {
                        throw th3;
                    }
                    throw cause3;
                }
            }

            @Deprecated
            public Builder() {
            }

            @Deprecated
            public final Builder setForcedRedirectEnabled(boolean z) throws Throwable {
                Object[] objArr;
                int i = 2 % 2;
                int i2 = asBinder + 23;
                asInterface = i2 % 128;
                int i3 = i2 % 2;
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(118372281);
                int i4 = 0;
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    char tapTimeout = (char) (37567 - (ViewConfiguration.getTapTimeout() >> 16));
                    int keyRepeatDelay = 625 - (ViewConfiguration.getKeyRepeatDelay() >> 16);
                    int keyRepeatDelay2 = (ViewConfiguration.getKeyRepeatDelay() >> 16) + 14;
                    byte[] bArr = $$a;
                    byte b2 = bArr[5];
                    byte b3 = bArr[7];
                    Object[] objArr2 = new Object[1];
                    a(b2, b3, b3, objArr2);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(tapTimeout, keyRepeatDelay, keyRepeatDelay2, -477065106, false, (String) objArr2[0], null);
                }
                long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
                Object[] objArr3 = new Object[1];
                c((-2068037567) - TextUtils.indexOf((CharSequence) "", '0', 0), (-124) - ExpandableListView.getPackedPositionChild(0L), (short) Gravity.getAbsoluteGravity(0, 0), (byte) (ViewConfiguration.getFadingEdgeLength() >> 16), 1796236313 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), objArr3);
                Class<?> cls = Class.forName((String) objArr3[0]);
                Object[] objArr4 = new Object[1];
                c((-2068037562) - TextUtils.getOffsetAfter("", 0), TextUtils.getOffsetBefore("", 0) - 123, (short) (1 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))), (byte) TextUtils.getOffsetBefore("", 0), 1796236335 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), objArr4);
                long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(559617152);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                    char cResolveSize = (char) (View.resolveSize(0, 0) + 37567);
                    int packedPositionType = ExpandableListView.getPackedPositionType(0L) + 625;
                    int i5 = (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 15;
                    byte b4 = $$a[5];
                    byte b5 = b4;
                    Object[] objArr5 = new Object[1];
                    a(b4, b5, b5, objArr5);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cResolveSize, packedPositionType, i5, -976899241, false, (String) objArr5[0], null);
                }
                if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(560540673);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                        char cIndexOf = (char) (37567 - TextUtils.indexOf("", "", 0));
                        int jumpTapTimeout = (ViewConfiguration.getJumpTapTimeout() >> 16) + 625;
                        int edgeSlop = (ViewConfiguration.getEdgeSlop() >> 16) + 14;
                        byte[] bArr2 = $$a;
                        byte b6 = bArr2[7];
                        byte b7 = bArr2[5];
                        Object[] objArr6 = new Object[1];
                        a(b6, b7, b7, objArr6);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(cIndexOf, jumpTapTimeout, edgeSlop, -973632554, false, (String) objArr6[0], null);
                    }
                    Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
                    int i6 = ((int[]) objArr7[2])[0];
                    int i7 = ((int[]) objArr7[0])[0];
                    String[] strArr = (String[]) objArr7[3];
                    int[] iArr = {i7};
                    int i8 = (int) Runtime.getRuntime().totalMemory();
                    int i9 = ~i8;
                    int i10 = (((2104438572 + (((~((-1149785843) | i9)) | (~(1823209206 | i8))) * (-831))) + ((~((-1149256929) | i8)) * (-1662))) + (((~(i8 | 1149785842)) | ((~(i9 | (-673952279))) | (~(673952278 | i8)))) * 831)) - 2071582370;
                    int i11 = (i10 << 13) ^ i10;
                    int i12 = i11 ^ (i11 >>> 17);
                    ((int[]) objArr[1])[0] = i12 ^ (i12 << 5);
                    objArr = new Object[]{iArr, new int[1], new int[]{i6}, strArr};
                } else {
                    Object[] objArr8 = new Object[1];
                    c(View.getDefaultSize(0, 0) - 2068037566, (-124) - TextUtils.lastIndexOf("", '0', 0), (short) TextUtils.indexOf("", "", 0), (byte) (1 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1))), 1796236350 - ExpandableListView.getPackedPositionGroup(0L), objArr8);
                    Class<?> cls2 = Class.forName((String) objArr8[0]);
                    Object[] objArr9 = new Object[1];
                    c((-2068037564) - (ViewConfiguration.getPressedStateDuration() >> 16), (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) - 123, (short) (ViewConfiguration.getTouchSlop() >> 8), (byte) ExpandableListView.getPackedPositionGroup(0L), 1796236376 - Color.blue(0), objArr9);
                    Context applicationContext = (Context) cls2.getMethod((String) objArr9[0], new Class[0]).invoke(null, null);
                    if (applicationContext != null) {
                        int i13 = asInterface + 57;
                        asBinder = i13 % 128;
                        if (i13 % 2 == 0) {
                            boolean z2 = applicationContext instanceof ContextWrapper;
                            throw null;
                        }
                        if ((applicationContext instanceof ContextWrapper) && ((ContextWrapper) applicationContext).getBaseContext() == null) {
                            int i14 = asInterface + 17;
                            asBinder = i14 % 128;
                            int i15 = i14 % 2;
                            applicationContext = null;
                        } else {
                            applicationContext = applicationContext.getApplicationContext();
                        }
                    }
                    Object[] objArr10 = new Object[1];
                    c((-2068037557) - ((Process.getThreadPriority(0) + 20) >> 6), (-123) - Color.red(0), (short) ((-1) - TextUtils.lastIndexOf("", '0', 0)), (byte) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) - 1), (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 1796236393, objArr10);
                    Class<?> cls3 = Class.forName((String) objArr10[0]);
                    Object[] objArr11 = new Object[1];
                    c(View.resolveSize(0, 0) - 2068037558, ExpandableListView.getPackedPositionChild(0L) - 122, (short) (ViewConfiguration.getTouchSlop() >> 8), (byte) (((byte) KeyEvent.getModifierMetaStateMask()) + 1), (ViewConfiguration.getFadingEdgeLength() >> 16) + 1796236410, objArr11);
                    int iIntValue = ((Integer) cls3.getMethod((String) objArr11[0], Object.class).invoke(null, this)).intValue();
                    Object[] objArr12 = new Object[1];
                    c(Color.red(0) - 2068037613, (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) - 123, (short) Color.alpha(0), (byte) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) - 1), 1796236426 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), objArr12);
                    String str = (String) objArr12[0];
                    Object[] objArr13 = new Object[1];
                    c((-2068037565) - Process.getGidForName(""), (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) - 123, (short) (ExpandableListView.getPackedPositionChild(0L) + 1), (byte) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 1), (ViewConfiguration.getScrollDefaultDelay() >> 16) + 1796236490, objArr13);
                    try {
                        Object[] objArr14 = {applicationContext, new String[]{str, (String) objArr13[0]}, Integer.valueOf(iIntValue), 17, -2071582370};
                        byte[] bArr3 = $$d;
                        byte b8 = bArr3[35];
                        Object[] objArr15 = new Object[1];
                        d((byte) (b8 - 1), (byte) (-b8), b8, objArr15);
                        Class<?> cls4 = Class.forName((String) objArr15[0]);
                        byte b9 = bArr3[35];
                        Object[] objArr16 = new Object[1];
                        d(b9, (byte) (-bArr3[14]), (byte) (b9 - 1), objArr16);
                        Object[] objArr17 = (Object[]) cls4.getMethod((String) objArr16[0], Context.class, String[].class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr14);
                        int i16 = ((int[]) objArr17[0])[0];
                        int i17 = ((int[]) objArr17[2])[0];
                        if (applicationContext != null) {
                            int i18 = asInterface + 113;
                            asBinder = i18 % 128;
                            int i19 = i18 % 2;
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(560540673);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                                char cCombineMeasuredStates = (char) (View.combineMeasuredStates(0, 0) + 37567);
                                int iResolveSizeAndState = View.resolveSizeAndState(0, 0, 0) + 625;
                                int iLastIndexOf = TextUtils.lastIndexOf("", '0', 0, 0) + 15;
                                byte[] bArr4 = $$a;
                                byte b10 = bArr4[7];
                                byte b11 = bArr4[5];
                                Object[] objArr18 = new Object[1];
                                a(b10, b11, b11, objArr18);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(cCombineMeasuredStates, iResolveSizeAndState, iLastIndexOf, -973632554, false, (String) objArr18[0], null);
                            }
                            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr17);
                            try {
                                Object[] objArr19 = new Object[1];
                                c(TextUtils.lastIndexOf("", '0', 0, 0) - 2068037565, (-124) - MotionEvent.axisFromString(""), (short) Color.blue(0), (byte) (ViewConfiguration.getScrollBarSize() >> 8), 1796236313 - ((Process.getThreadPriority(0) + 20) >> 6), objArr19);
                                Class<?> cls5 = Class.forName((String) objArr19[0]);
                                Object[] objArr20 = new Object[1];
                                c((-2068037562) - (ViewConfiguration.getMinimumFlingVelocity() >> 16), (-124) - ((byte) KeyEvent.getModifierMetaStateMask()), (short) ((-1) - Process.getGidForName("")), (byte) (TextUtils.lastIndexOf("", '0', 0) + 1), 1796236335 - Color.red(0), objArr20);
                                long jLongValue2 = ((Long) cls5.getDeclaredMethod((String) objArr20[0], new Class[0]).invoke(null, new Object[0])).longValue();
                                Long lValueOf = Long.valueOf(jLongValue2);
                                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(559617152);
                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                                    char offsetBefore = (char) (TextUtils.getOffsetBefore("", 0) + 37567);
                                    int iMyTid = (Process.myTid() >> 22) + 625;
                                    int mode = 14 - View.MeasureSpec.getMode(0);
                                    byte b12 = $$a[5];
                                    byte b13 = b12;
                                    Object[] objArr21 = new Object[1];
                                    a(b12, b13, b13, objArr21);
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(offsetBefore, iMyTid, mode, -976899241, false, (String) objArr21[0], null);
                                }
                                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                                Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(118372281);
                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                                    char cBlue = (char) (37567 - Color.blue(0));
                                    int iIndexOf = TextUtils.indexOf("", "", 0) + 625;
                                    int scrollBarFadeDuration = (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 14;
                                    byte[] bArr5 = $$a;
                                    byte b14 = bArr5[5];
                                    byte b15 = bArr5[7];
                                    Object[] objArr22 = new Object[1];
                                    a(b14, b15, b15, objArr22);
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(cBlue, iIndexOf, scrollBarFadeDuration, -477065106, false, (String) objArr22[0], null);
                                }
                                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf2);
                            } catch (Exception unused) {
                                throw new RuntimeException();
                            }
                        }
                        objArr = objArr17;
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause != null) {
                            throw cause;
                        }
                        throw th;
                    }
                }
                int i20 = ((int[]) objArr[0])[0];
                int i21 = ((int[]) objArr[2])[0];
                if (i21 != i20) {
                    ArrayList arrayList = new ArrayList();
                    String[] strArr2 = (String[]) objArr[3];
                    if (strArr2 != null) {
                        while (i4 < strArr2.length) {
                            int i22 = asBinder + 119;
                            asInterface = i22 % 128;
                            int i23 = i22 % 2;
                            arrayList.add(strArr2[i4]);
                            i4++;
                            int i24 = asBinder + 25;
                            asInterface = i24 % 128;
                            if (i24 % 2 != 0) {
                                int i25 = 3 % 5;
                            }
                        }
                    }
                    throw new RuntimeException(String.valueOf(i21));
                }
                int i26 = ((int[]) objArr[1])[0];
                int i27 = ((int[]) objArr[2])[0];
                int i28 = ((int[]) objArr[0])[0];
                String[] strArr3 = (String[]) objArr[3];
                int[] iArr2 = {i27};
                int iElapsedRealtime = (int) SystemClock.elapsedRealtime();
                int i29 = i26 + (-1845762460) + (((~(1551646535 | iElapsedRealtime)) | 245888) * (-140)) + ((~(1551892423 | iElapsedRealtime)) * 70) + (((~(iElapsedRealtime | 272091585)) | 1280046726) * 70);
                int i30 = (i29 << 13) ^ i29;
                int i31 = i30 ^ (i30 >>> 17);
                Object obj = new Object[]{new int[]{i28}, new int[1], iArr2, strArr3}[1];
                ((int[]) obj)[0] = i31 ^ (i31 << 5);
                Bundle bundle = this.parameters;
                int i32 = ((int[]) obj)[0];
                int i33 = ((i32 * i32) - (~(-(1662294326 * i32)))) - 1;
                int i34 = -(i32 * (-1066307978));
                int i35 = (((i33 | i34) << 1) - (i34 ^ i33)) - (-1142077156);
                int i36 = i35 >> 24;
                int i37 = i35 >> 15;
                int i38 = (-(((i35 - (~((((i36 ^ (-511)) + ((i36 & (-511)) << 1)) / 256) + 1))) - 1) ^ (((((-262143) ^ i37) + ((i37 & (-262143)) << 1)) / 131072) + 1))) + 3;
                int i39 = i38 >> 22;
                int i40 = ((i39 ^ (-2047)) + ((i39 & (-2047)) << 1)) / 1024;
                int i41 = (i40 ^ 1) + ((i40 & 1) << 1);
                bundle.putInt("22\\efr".substring(14355 / ((i38 & (-((i41 & 1) + (i41 | 1)))) * 1595)), z ? 1 : 0);
                return this;
            }

            public final boolean getForcedRedirectEnabled() {
                int i = 2 % 2;
                int i2 = asInterface + 107;
                asBinder = i2 % 128;
                int i3 = i2 % 2;
                if (this.parameters.getInt(NavigationInfoParameters.KEY_FORCED_REDIRECT) == 1) {
                    return true;
                }
                int i4 = asBinder + 91;
                asInterface = i4 % 128;
                int i5 = i4 % 2;
                return false;
            }

            @Deprecated
            public final NavigationInfoParameters build() {
                int i = 2 % 2;
                NavigationInfoParameters navigationInfoParameters = new NavigationInfoParameters(this.parameters);
                int i2 = asInterface + 115;
                asBinder = i2 % 128;
                if (i2 % 2 == 0) {
                    int i3 = 9 / 0;
                }
                return navigationInfoParameters;
            }

            private static String $$g(byte b2, short s, int i) {
                int i2 = (b2 * 2) + 4;
                int i3 = s * 3;
                byte[] bArr = $$c;
                int i4 = 121 - i;
                byte[] bArr2 = new byte[1 - i3];
                int i5 = 0 - i3;
                int i6 = -1;
                if (bArr == null) {
                    i2++;
                    i4 += i2;
                }
                while (true) {
                    i6++;
                    bArr2[i6] = (byte) i4;
                    if (i6 == i5) {
                        return new String(bArr2, 0);
                    }
                    byte b3 = bArr[i2];
                    i2++;
                    i4 += b3;
                }
            }
        }

        private NavigationInfoParameters(Bundle bundle) {
            this.parameters = bundle;
        }
    }

    @Deprecated
    public static final class AndroidParameters {
        public static final String KEY_ANDROID_FALLBACK_LINK = "afl";
        public static final String KEY_ANDROID_MIN_VERSION_CODE = "amv";
        public static final String KEY_ANDROID_PACKAGE_NAME = "apn";
        final Bundle parameters;

        private AndroidParameters(Bundle bundle) {
            this.parameters = bundle;
        }

        @Deprecated
        public static final class Builder {
            private final Bundle parameters;

            @Deprecated
            public Builder() {
                if (FirebaseApp.getInstance() == null) {
                    throw new IllegalStateException("FirebaseApp not initialized.");
                }
                Bundle bundle = new Bundle();
                this.parameters = bundle;
                bundle.putString(AndroidParameters.KEY_ANDROID_PACKAGE_NAME, FirebaseApp.getInstance().getApplicationContext().getPackageName());
            }

            @Deprecated
            public Builder(String str) {
                Bundle bundle = new Bundle();
                this.parameters = bundle;
                bundle.putString(AndroidParameters.KEY_ANDROID_PACKAGE_NAME, str);
            }

            @Deprecated
            public final Builder setFallbackUrl(Uri uri) {
                this.parameters.putParcelable(AndroidParameters.KEY_ANDROID_FALLBACK_LINK, uri);
                return this;
            }

            @Deprecated
            public final Uri getFallbackUrl() {
                Uri uri = (Uri) this.parameters.getParcelable(AndroidParameters.KEY_ANDROID_FALLBACK_LINK);
                return uri == null ? Uri.EMPTY : uri;
            }

            @Deprecated
            public final Builder setMinimumVersion(int i) {
                this.parameters.putInt(AndroidParameters.KEY_ANDROID_MIN_VERSION_CODE, i);
                return this;
            }

            @Deprecated
            public final int getMinimumVersion() {
                return this.parameters.getInt(AndroidParameters.KEY_ANDROID_MIN_VERSION_CODE);
            }

            @Deprecated
            public final AndroidParameters build() {
                return new AndroidParameters(this.parameters);
            }
        }
    }

    @Deprecated
    public static final class IosParameters {
        public static final String KEY_IOS_APP_STORE_ID = "isi";
        public static final String KEY_IOS_BUNDLE_ID = "ibi";
        public static final String KEY_IOS_CUSTOM_SCHEME = "ius";
        public static final String KEY_IOS_FALLBACK_LINK = "ifl";
        public static final String KEY_IOS_MINIMUM_VERSION = "imv";
        public static final String KEY_IPAD_BUNDLE_ID = "ipbi";
        public static final String KEY_IPAD_FALLBACK_LINK = "ipfl";
        final Bundle parameters;

        private IosParameters(Bundle bundle) {
            this.parameters = bundle;
        }

        @Deprecated
        public static final class Builder {
            private final Bundle parameters;

            @Deprecated
            public Builder(String str) {
                Bundle bundle = new Bundle();
                this.parameters = bundle;
                bundle.putString(IosParameters.KEY_IOS_BUNDLE_ID, str);
            }

            @Deprecated
            public final Builder setFallbackUrl(Uri uri) {
                this.parameters.putParcelable(IosParameters.KEY_IOS_FALLBACK_LINK, uri);
                return this;
            }

            @Deprecated
            public final Builder setCustomScheme(String str) {
                this.parameters.putString(IosParameters.KEY_IOS_CUSTOM_SCHEME, str);
                return this;
            }

            @Deprecated
            public final String getCustomScheme() {
                return this.parameters.getString(IosParameters.KEY_IOS_CUSTOM_SCHEME, "");
            }

            @Deprecated
            public final Builder setIpadFallbackUrl(Uri uri) {
                this.parameters.putParcelable(IosParameters.KEY_IPAD_FALLBACK_LINK, uri);
                return this;
            }

            @Deprecated
            public final Uri getIpadFallbackUrl() {
                Uri uri = (Uri) this.parameters.getParcelable(IosParameters.KEY_IPAD_FALLBACK_LINK);
                return uri == null ? Uri.EMPTY : uri;
            }

            @Deprecated
            public final Builder setIpadBundleId(String str) {
                this.parameters.putString(IosParameters.KEY_IPAD_BUNDLE_ID, str);
                return this;
            }

            @Deprecated
            public final String getIpadBundleId() {
                return this.parameters.getString(IosParameters.KEY_IPAD_BUNDLE_ID, "");
            }

            @Deprecated
            public final Builder setAppStoreId(String str) {
                this.parameters.putString(IosParameters.KEY_IOS_APP_STORE_ID, str);
                return this;
            }

            @Deprecated
            public final String getAppStoreId() {
                return this.parameters.getString(IosParameters.KEY_IOS_APP_STORE_ID, "");
            }

            @Deprecated
            public final Builder setMinimumVersion(String str) {
                this.parameters.putString(IosParameters.KEY_IOS_MINIMUM_VERSION, str);
                return this;
            }

            @Deprecated
            public final String getMinimumVersion() {
                return this.parameters.getString(IosParameters.KEY_IOS_MINIMUM_VERSION, "");
            }

            @Deprecated
            public final IosParameters build() {
                return new IosParameters(this.parameters);
            }
        }
    }

    @Deprecated
    public static final class GoogleAnalyticsParameters {
        public static final String KEY_UTM_CAMPAIGN = "utm_campaign";
        public static final String KEY_UTM_CONTENT = "utm_content";
        public static final String KEY_UTM_MEDIUM = "utm_medium";
        public static final String KEY_UTM_SOURCE = "utm_source";
        public static final String KEY_UTM_TERM = "utm_term";
        Bundle parameters;

        private GoogleAnalyticsParameters(Bundle bundle) {
            this.parameters = bundle;
        }

        /* JADX INFO: loaded from: classes5.dex */
        @Deprecated
        public static final class Builder {
            private final Bundle parameters;

            @Deprecated
            public Builder() {
                this.parameters = new Bundle();
            }

            @Deprecated
            public Builder(String str, String str2, String str3) {
                Bundle bundle = new Bundle();
                this.parameters = bundle;
                bundle.putString("utm_source", str);
                bundle.putString("utm_medium", str2);
                bundle.putString("utm_campaign", str3);
            }

            @Deprecated
            public final Builder setSource(String str) {
                this.parameters.putString("utm_source", str);
                return this;
            }

            @Deprecated
            public final String getSource() {
                return this.parameters.getString("utm_source", "");
            }

            @Deprecated
            public final Builder setMedium(String str) {
                this.parameters.putString("utm_medium", str);
                return this;
            }

            @Deprecated
            public final String getMedium() {
                return this.parameters.getString("utm_medium", "");
            }

            @Deprecated
            public final Builder setCampaign(String str) {
                this.parameters.putString("utm_campaign", str);
                return this;
            }

            @Deprecated
            public final String getCampaign() {
                return this.parameters.getString("utm_campaign", "");
            }

            @Deprecated
            public final Builder setTerm(String str) {
                this.parameters.putString(GoogleAnalyticsParameters.KEY_UTM_TERM, str);
                return this;
            }

            @Deprecated
            public final String getTerm() {
                return this.parameters.getString(GoogleAnalyticsParameters.KEY_UTM_TERM, "");
            }

            @Deprecated
            public final Builder setContent(String str) {
                this.parameters.putString(GoogleAnalyticsParameters.KEY_UTM_CONTENT, str);
                return this;
            }

            @Deprecated
            public final String getContent() {
                return this.parameters.getString(GoogleAnalyticsParameters.KEY_UTM_CONTENT, "");
            }

            @Deprecated
            public final GoogleAnalyticsParameters build() {
                return new GoogleAnalyticsParameters(this.parameters);
            }
        }
    }

    @Deprecated
    public static final class ItunesConnectAnalyticsParameters {
        public static final String KEY_ITUNES_CONNECT_AT = "at";
        public static final String KEY_ITUNES_CONNECT_CT = "ct";
        public static final String KEY_ITUNES_CONNECT_PT = "pt";
        final Bundle parameters;

        private ItunesConnectAnalyticsParameters(Bundle bundle) {
            this.parameters = bundle;
        }

        /* JADX INFO: loaded from: classes5.dex */
        @Deprecated
        public static final class Builder {
            private final Bundle parameters = new Bundle();

            @Deprecated
            public Builder() {
            }

            @Deprecated
            public final Builder setProviderToken(String str) {
                this.parameters.putString(ItunesConnectAnalyticsParameters.KEY_ITUNES_CONNECT_PT, str);
                return this;
            }

            @Deprecated
            public final String getProviderToken() {
                return this.parameters.getString(ItunesConnectAnalyticsParameters.KEY_ITUNES_CONNECT_PT, "");
            }

            @Deprecated
            public final Builder setAffiliateToken(String str) {
                this.parameters.putString(ItunesConnectAnalyticsParameters.KEY_ITUNES_CONNECT_AT, str);
                return this;
            }

            @Deprecated
            public final String getAffiliateToken() {
                return this.parameters.getString(ItunesConnectAnalyticsParameters.KEY_ITUNES_CONNECT_AT, "");
            }

            @Deprecated
            public final Builder setCampaignToken(String str) {
                this.parameters.putString(ItunesConnectAnalyticsParameters.KEY_ITUNES_CONNECT_CT, str);
                return this;
            }

            @Deprecated
            public final String getCampaignToken() {
                return this.parameters.getString(ItunesConnectAnalyticsParameters.KEY_ITUNES_CONNECT_CT, "");
            }

            @Deprecated
            public final ItunesConnectAnalyticsParameters build() {
                return new ItunesConnectAnalyticsParameters(this.parameters);
            }
        }
    }

    @Deprecated
    public static final class SocialMetaTagParameters {
        public static final String KEY_SOCIAL_DESCRIPTION = "sd";
        public static final String KEY_SOCIAL_IMAGE_LINK = "si";
        public static final String KEY_SOCIAL_TITLE = "st";
        final Bundle parameters;

        private SocialMetaTagParameters(Bundle bundle) {
            this.parameters = bundle;
        }

        /* JADX INFO: loaded from: classes5.dex */
        @Deprecated
        public static final class Builder {
            private final Bundle parameters = new Bundle();

            @Deprecated
            public Builder() {
            }

            @Deprecated
            public final Builder setTitle(String str) {
                this.parameters.putString(SocialMetaTagParameters.KEY_SOCIAL_TITLE, str);
                return this;
            }

            @Deprecated
            public final String getTitle() {
                return this.parameters.getString(SocialMetaTagParameters.KEY_SOCIAL_TITLE, "");
            }

            @Deprecated
            public final Builder setDescription(String str) {
                this.parameters.putString(SocialMetaTagParameters.KEY_SOCIAL_DESCRIPTION, str);
                return this;
            }

            @Deprecated
            public final String getDescription() {
                return this.parameters.getString(SocialMetaTagParameters.KEY_SOCIAL_DESCRIPTION, "");
            }

            @Deprecated
            public final Builder setImageUrl(Uri uri) {
                this.parameters.putParcelable(SocialMetaTagParameters.KEY_SOCIAL_IMAGE_LINK, uri);
                return this;
            }

            @Deprecated
            public final Uri getImageUrl() {
                Uri uri = (Uri) this.parameters.getParcelable(SocialMetaTagParameters.KEY_SOCIAL_IMAGE_LINK);
                return uri == null ? Uri.EMPTY : uri;
            }

            @Deprecated
            public final SocialMetaTagParameters build() {
                return new SocialMetaTagParameters(this.parameters);
            }
        }
    }
}
