package com.google.android.gms.common.api;

import android.accounts.Account;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.PointF;
import android.os.Build;
import android.os.IBinder;
import android.os.Looper;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.bpjstku.presentation.membership.login.LoginActivity;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Api.ApiOptions;
import com.google.android.gms.common.api.internal.ConnectionCallbacks;
import com.google.android.gms.common.api.internal.OnConnectionFailedListener;
import com.google.android.gms.common.internal.BaseGmsClient;
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.common.internal.IAccountAccessor;
import com.google.android.gms.common.internal.Preconditions;
import defpackage.initSession;
import defpackage.onCaptureSessionEnd;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class Api<O extends ApiOptions> {
    private final AbstractClientBuilder zaa;
    private final ClientKey zab;
    private final String zac;

    public static abstract class AbstractClientBuilder<T extends Client, O> extends BaseClientBuilder<T, O> {
        @Deprecated
        public T buildClient(Context context, Looper looper, ClientSettings clientSettings, O o, GoogleApiClient.ConnectionCallbacks connectionCallbacks, GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener) {
            return (T) buildClient(context, looper, clientSettings, (Object) o, (ConnectionCallbacks) connectionCallbacks, (OnConnectionFailedListener) onConnectionFailedListener);
        }

        public T buildClient(Context context, Looper looper, ClientSettings clientSettings, O o, ConnectionCallbacks connectionCallbacks, OnConnectionFailedListener onConnectionFailedListener) {
            throw new UnsupportedOperationException("buildClient must be implemented");
        }
    }

    public interface AnyClient {
    }

    public static class AnyClientKey<C extends AnyClient> {
    }

    public interface ApiOptions {
        public static final NoOptions NO_OPTIONS = new NoOptions(null);

        /* JADX INFO: loaded from: classes4.dex */
        public interface HasAccountOptions extends HasOptions, NotRequiredOptions {
            Account getAccount();
        }

        /* JADX INFO: loaded from: classes4.dex */
        public interface HasGoogleSignInAccountOptions extends HasOptions {
            GoogleSignInAccount getGoogleSignInAccount();
        }

        /* JADX INFO: loaded from: classes4.dex */
        public interface HasOptions extends ApiOptions {
        }

        public static final class NoOptions implements NotRequiredOptions {
            private NoOptions() {
            }

            /* synthetic */ NoOptions(zaa zaaVar) {
            }
        }

        public interface NotRequiredOptions extends ApiOptions {
        }

        /* JADX INFO: loaded from: classes4.dex */
        public interface Optional extends HasOptions, NotRequiredOptions {
        }
    }

    public static abstract class BaseClientBuilder<T extends AnyClient, O> {
        public static final int API_PRIORITY_GAMES = 1;
        public static final int API_PRIORITY_OTHER = Integer.MAX_VALUE;
        public static final int API_PRIORITY_PLUS = 2;

        public List<Scope> getImpliedScopes(O o) {
            return Collections.emptyList();
        }

        public int getPriority() {
            return Integer.MAX_VALUE;
        }
    }

    public interface Client extends AnyClient {
        void connect(BaseGmsClient.ConnectionProgressReportCallbacks connectionProgressReportCallbacks);

        void disconnect();

        void disconnect(String str);

        void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr);

        Feature[] getAvailableFeatures();

        String getEndpointPackageName();

        String getLastDisconnectMessage();

        int getMinApkVersion();

        void getRemoteService(IAccountAccessor iAccountAccessor, Set<Scope> set);

        Feature[] getRequiredFeatures();

        Set<Scope> getScopesForConnectionlessNonSignIn();

        IBinder getServiceBrokerBinder();

        Intent getSignInIntent();

        boolean isConnected();

        boolean isConnecting();

        void onUserSignOut(BaseGmsClient.SignOutCallbacks signOutCallbacks);

        boolean providesSignIn();

        boolean requiresAccount();

        boolean requiresGooglePlayServices();

        boolean requiresSignIn();
    }

    public <C extends Client> Api(String str, AbstractClientBuilder<C, O> abstractClientBuilder, ClientKey<C> clientKey) {
        Preconditions.checkNotNull(abstractClientBuilder, "Cannot construct an Api with a null ClientBuilder");
        Preconditions.checkNotNull(clientKey, "Cannot construct an Api with a null ClientKey");
        this.zac = str;
        this.zaa = abstractClientBuilder;
        this.zab = clientKey;
    }

    public final AbstractClientBuilder zaa() {
        return this.zaa;
    }

    public final AnyClientKey zab() {
        return this.zab;
    }

    public final BaseClientBuilder zac() {
        return this.zaa;
    }

    public final String zad() {
        return this.zac;
    }

    public static final class ClientKey<C extends Client> extends AnyClientKey<C> {
        private static final byte[] $$c = {108, -26, -110, 50};
        private static final int $$d = 196;
        private static int $10 = 0;
        private static int $11 = 1;
        private static final byte[] $$a = {101, 89, 94, -73, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 56, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 55, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, 7, -18, -16, -1, -16, -16, -4, 19, -48, -3, -17, 0, -30, 4, -24, 54};
        private static final int $$b = 23;
        private static int TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
        private static int d = 1;
        private static char TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 1639;
        private static char TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 40247;
        private static char b = 5834;
        private static char TuitionPaymentFragmentbindingInflater1 = 45356;

        /* JADX WARN: Code duplicated, block: B:10:0x0024  */
        /* JADX WARN: Code duplicated, block: B:8:0x001c  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x0026). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0024
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        private static void c(byte r5, short r6, byte r7, java.lang.Object[] r8) {
            /*
                int r5 = r5 * 14
                int r5 = 98 - r5
                int r6 = r6 + 4
                int r0 = r7 + 1
                byte[] r1 = com.google.android.gms.common.api.Api.ClientKey.$$a
                byte[] r0 = new byte[r0]
                r2 = 0
                if (r1 != 0) goto L12
                r3 = r7
                r4 = r2
                goto L26
            L12:
                r3 = r2
            L13:
                byte r4 = (byte) r5
                int r6 = r6 + 1
                r0[r3] = r4
                int r4 = r3 + 1
                if (r3 != r7) goto L24
                java.lang.String r5 = new java.lang.String
                r5.<init>(r0, r2)
                r8[r2] = r5
                return
            L24:
                r3 = r1[r6]
            L26:
                int r3 = -r3
                int r5 = r5 + r3
                int r5 = r5 + (-11)
                r3 = r4
                goto L13
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.Api.ClientKey.c(byte, short, byte, java.lang.Object[]):void");
        }

        private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
            int i2;
            int i3 = 2 % 2;
            onCaptureSessionEnd oncapturesessionend = new onCaptureSessionEnd();
            char[] cArr2 = new char[cArr.length - 2];
            oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 2;
            char[] cArr3 = new char[2];
            while (true) {
                int i4 = 0;
                if (oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 >= cArr.length) {
                    break;
                }
                int i5 = $11 + 11;
                $10 = i5 % 128;
                if (i5 % 2 != 0) {
                    cArr3[1] = cArr[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3];
                    cArr3[0] = cArr[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3];
                    i2 = 1;
                } else {
                    cArr3[0] = cArr[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3];
                    cArr3[1] = cArr[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1];
                    i2 = 0;
                }
                int i6 = 58224;
                while (i2 < 16) {
                    char c = cArr3[1];
                    char c2 = cArr3[i4];
                    int i7 = (c2 + i6) ^ ((c2 << 4) + ((char) (((long) b) ^ 8611973335120459638L)));
                    int i8 = c2 >>> 5;
                    try {
                        Object[] objArr2 = new Object[4];
                        objArr2[3] = Integer.valueOf(TuitionPaymentFragmentbindingInflater1);
                        objArr2[2] = Integer.valueOf(i8);
                        objArr2[1] = Integer.valueOf(i7);
                        objArr2[i4] = Integer.valueOf(c);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1824600641);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                            char c3 = (char) ((ExpandableListView.getPackedPositionForChild(i4, i4) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(i4, i4) == 0L ? 0 : -1)) + 47774);
                            int iIndexOf = 468 - TextUtils.indexOf("", "", i4, i4);
                            int iLastIndexOf = TextUtils.lastIndexOf("", '0', i4) + 14;
                            Class[] clsArr = new Class[4];
                            clsArr[i4] = Integer.TYPE;
                            clsArr[1] = Integer.TYPE;
                            clsArr[2] = Integer.TYPE;
                            clsArr[3] = Integer.TYPE;
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(c3, iIndexOf, iLastIndexOf, -2007001706, false, "o", clsArr);
                        }
                        char cCharValue = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                        cArr3[1] = cCharValue;
                        int i9 = i6;
                        Object[] objArr3 = {Integer.valueOf(cArr3[i4]), Integer.valueOf((cCharValue + i6) ^ ((cCharValue << 4) + ((char) (((long) TuitionPaymentFragmentspecialinlinedviewModeldefault2) ^ 8611973335120459638L)))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault3)};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1824600641);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (TextUtils.getOffsetBefore("", 0) + 47773), 468 - (Process.myPid() >> 22), 13 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), -2007001706, false, "o", new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                        }
                        cArr3[0] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).charValue();
                        i6 = i9 - 40503;
                        i2++;
                        i4 = 0;
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
                    byte b3 = b2;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) TextUtils.getCapsMode("", 0, 0), (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 2322, (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 43, -1312321721, false, $$e(b2, b3, b3), new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
            }
            objArr[0] = new String(cArr2, 0, i);
            int i10 = $11 + 79;
            $10 = i10 % 128;
            if (i10 % 2 != 0) {
                throw null;
            }
        }

        /* JADX WARN: Code duplicated, block: B:30:0x02e0  */
        /* JADX WARN: Code duplicated, block: B:32:0x02e4  */
        /* JADX WARN: Code duplicated, block: B:36:0x02f0  */
        /* JADX WARN: Code duplicated, block: B:40:0x0322 A[Catch: all -> 0x041a, TryCatch #4 {all -> 0x041a, blocks: (B:38:0x0315, B:40:0x0322, B:41:0x0362), top: B:97:0x0315, outer: #1 }] */
        /* JADX WARN: Code duplicated, block: B:46:0x0411  */
        /* JADX WARN: Code duplicated, block: B:54:0x0426 A[Catch: Exception -> 0x050b, TRY_LEAVE, TryCatch #1 {Exception -> 0x050b, blocks: (B:50:0x041e, B:52:0x0424, B:53:0x0425, B:54:0x0426, B:57:0x0458, B:63:0x04dd, B:68:0x0500, B:70:0x0506, B:71:0x0507, B:58:0x046d, B:38:0x0315, B:40:0x0322, B:41:0x0362, B:59:0x0486, B:61:0x0493, B:62:0x04d6), top: B:92:0x02ee, inners: #4, #6 }] */
        /* JADX WARN: Code duplicated, block: B:57:0x0458 A[Catch: Exception -> 0x050b, TRY_ENTER, TryCatch #1 {Exception -> 0x050b, blocks: (B:50:0x041e, B:52:0x0424, B:53:0x0425, B:54:0x0426, B:57:0x0458, B:63:0x04dd, B:68:0x0500, B:70:0x0506, B:71:0x0507, B:58:0x046d, B:38:0x0315, B:40:0x0322, B:41:0x0362, B:59:0x0486, B:61:0x0493, B:62:0x04d6), top: B:92:0x02ee, inners: #4, #6 }] */
        /* JADX WARN: Code duplicated, block: B:58:0x046d A[Catch: Exception -> 0x050b, TRY_LEAVE, TryCatch #1 {Exception -> 0x050b, blocks: (B:50:0x041e, B:52:0x0424, B:53:0x0425, B:54:0x0426, B:57:0x0458, B:63:0x04dd, B:68:0x0500, B:70:0x0506, B:71:0x0507, B:58:0x046d, B:38:0x0315, B:40:0x0322, B:41:0x0362, B:59:0x0486, B:61:0x0493, B:62:0x04d6), top: B:92:0x02ee, inners: #4, #6 }] */
        /* JADX WARN: Code duplicated, block: B:61:0x0493 A[Catch: all -> 0x04ff, TryCatch #6 {all -> 0x04ff, blocks: (B:59:0x0486, B:61:0x0493, B:62:0x04d6), top: B:101:0x0486, outer: #1 }] */
        /* JADX WARN: Code duplicated, block: B:65:0x04e3  */
        /* JADX WARN: Code duplicated, block: B:66:0x04f4  */
        /* JADX WARN: Code duplicated, block: B:76:0x0531  */
        /* JADX WARN: Code duplicated, block: B:93:0x02e9 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        public static Object[] b(Context context, int i, int i2, int i3) throws Throwable {
            int i4;
            int i5;
            int i6;
            int i7;
            int i8;
            int i9;
            int i10;
            String str;
            char[] cArr;
            int i11;
            String str2;
            Object[] objArr;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4;
            int i12;
            int i13 = 2 % 2;
            if (context != null) {
                int i14 = d;
                int i15 = ((i14 | 61) << 1) - (i14 ^ 61);
                int i16 = i15 % 128;
                TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i16;
                int i17 = i15 % 2;
                int i18 = (i16 ^ 77) + ((i16 & 77) << 1);
                d = i18 % 128;
                int i19 = i18 % 2;
                try {
                    char[] cArr2 = {41225, 58827, 39501, 8616, 17804, 62625, 37044, 50049, 28362, 50925, 44069, 13766, 33164, 7077, 47564, 21032, 48192, 57438, 24492, 7928, 40033, 25589, 16347, 9883, 40041, 48788};
                    int i20 = -(ViewConfiguration.getLongPressTimeout() >> 16);
                    int i21 = (i20 ^ i) | (i20 & i);
                    int i22 = (~i21) | (~(((-24) ^ i20) | ((-24) & i20)));
                    int i23 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                    int i24 = (i23 ^ 109) + ((i23 & 109) << 1);
                    d = i24 % 128;
                    int i25 = i24 % 2;
                    int i26 = (((i20 * (-813)) + 9384) - (~((-814) * i22))) - 1;
                    int i27 = ~i;
                    int i28 = (~(((-24) ^ i27) | ((-24) & i27))) | (~((~i20) | 23));
                    int i29 = ~i21;
                    int i30 = -(-(((i29 & i28) | (i28 ^ i29)) * 407));
                    int i31 = (i26 & i30) + (i30 | i26);
                    int i32 = ~i20;
                    int i33 = ~(i32 | 23);
                    int i34 = (i23 & 105) + (i23 | 105);
                    d = i34 % 128;
                    int i35 = i34 % 2;
                    int i36 = ~((i32 & i) | (i32 ^ i));
                    int i37 = (i36 & i33) | (i33 ^ i36);
                    int i38 = ~((23 ^ i) | (23 & i));
                    int i39 = -(-(407 * ((i37 & i38) | (i37 ^ i38))));
                    int i40 = ((i31 | i39) << 1) - (i39 ^ i31);
                    Object[] objArr2 = new Object[1];
                    a(cArr2, i40, objArr2);
                    Class<?> cls = Class.forName((String) objArr2[0]);
                    int i41 = -(ViewConfiguration.getKeyRepeatTimeout() >> 16);
                    int iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = LoginActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                    int i42 = i41 * (-496);
                    int i43 = (i42 & (-8928)) + (i42 | (-8928));
                    int i44 = ~i41;
                    int i45 = i43 + ((~(i44 | (-19))) * 497);
                    int i46 = ~i41;
                    int i47 = (i46 ^ (-19)) | (i46 & (-19));
                    int i48 = ~((i47 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault2) | (i47 & iTuitionPaymentFragmentspecialinlinedviewModeldefault2));
                    int i49 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault2;
                    int i50 = ((-19) ^ i49) | ((-19) & i49);
                    int i51 = ~((i50 ^ i41) | (i50 & i41));
                    int i52 = i45 + (((i48 ^ i51) | (i51 & i48)) * 497);
                    int i53 = ~(i49 | i44);
                    int i54 = ~(i46 | 18);
                    int i55 = (i53 & i54) | (i53 ^ i54);
                    int i56 = ~((-19) | i41 | iTuitionPaymentFragmentspecialinlinedviewModeldefault2);
                    int i57 = i52 + (((i55 & i56) | (i55 ^ i56)) * 497);
                    Object[] objArr3 = new Object[1];
                    a(new char[]{14350, 50334, 49596, 11829, 19190, 64955, 29922, 39077, 37784, 11005, 59388, 240, 55772, 35927, 2463, 47727, 37047, 38390, 31689, 16402}, i57, objArr3);
                    Object objInvoke = cls.getMethod((String) objArr3[0], null).invoke(context, null);
                    int iIndexOf = 34 - TextUtils.indexOf("", "");
                    int i58 = d;
                    int i59 = (i58 & 93) + (i58 | 93);
                    TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i59 % 128;
                    int i60 = i59 % 2;
                    Object[] objArr4 = new Object[1];
                    a(new char[]{13856, 11961, 19471, 47010, 25173, 44300, 48270, 55963, 56607, 34056, 42292, 60163, 376, 479, 36784, 26654, 36519, 48300, 64665, 57180, 49352, 29286, 16044, 7187, 25667, 19804, 55281, 23060, 53175, 59573, 1533, 36169, 57160, 23756, 62101, 42324}, iIndexOf, objArr4);
                    Class<?> cls2 = Class.forName((String) objArr4[0]);
                    int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                    int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = LoginActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                    int i61 = (iMakeMeasureSpec * (-432)) + 2170;
                    int i62 = ~iMakeMeasureSpec;
                    int i63 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault3;
                    int i64 = (~((i62 & i63) | (i62 ^ i63) | 5)) * 433;
                    int i65 = ((i61 | i64) << 1) - (i61 ^ i64);
                    int i66 = d;
                    int i67 = ((i66 | 39) << 1) - (i66 ^ 39);
                    TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i67 % 128;
                    int i68 = i67 % 2;
                    int i69 = ~iMakeMeasureSpec;
                    int i70 = ~(((-6) & iTuitionPaymentFragmentspecialinlinedviewModeldefault3) | ((-6) ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault3));
                    int i71 = -(-((-433) * ((i70 & i69) | (i69 ^ i70))));
                    int i72 = (i65 & i71) + (i71 | i65);
                    int i73 = ~((iTuitionPaymentFragmentspecialinlinedviewModeldefault3 & i69) | (i69 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault3));
                    int i74 = ~((iMakeMeasureSpec & 5) | (iMakeMeasureSpec ^ 5));
                    int i75 = ((i73 & i74) | (i73 ^ i74)) * 433;
                    int i76 = ((i72 | i75) << 1) - (i75 ^ i72);
                    Object[] objArr5 = new Object[1];
                    a(new char[]{56585, 38140, 32045, 33537, 33137, 39767, 23502, 61558}, i76, objArr5);
                    int i77 = cls2.getField((String) objArr5[0]).getInt(objInvoke) & 2;
                    int i78 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 63;
                    d = i78 % 128;
                    int i79 = i78 % 2;
                    int i80 = (i & (-2)) | (i27 & 1);
                    int i81 = -i77;
                    int i82 = ((i77 & i81) | (i77 ^ i81)) >> 31;
                    i4 = (i82 & i80) | ((~i82) & i);
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
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1122237249);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    char cAlpha = (char) (16949 - Color.alpha(0));
                    int iLastIndexOf = TextUtils.lastIndexOf("", '0', 0, 0) + 2740;
                    int gidForName = Process.getGidForName("") + 14;
                    byte[] bArr = $$a;
                    byte b2 = bArr[5];
                    short s = bArr[132];
                    Object[] objArr6 = new Object[1];
                    c(b2, s, (byte) (s & 52), objArr6);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(cAlpha, iLastIndexOf, gidForName, 1501733736, false, (String) objArr6[0], new Class[0]);
                }
                Set set = (Set) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, null);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-431688923);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    char windowTouchSlop = (char) (16949 - (ViewConfiguration.getWindowTouchSlop() >> 8));
                    int maximumDrawingCacheSize = (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 2739;
                    int i83 = 14 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1));
                    byte b3 = $$a[5];
                    short s2 = (short) (b3 | 50);
                    Object[] objArr7 = new Object[1];
                    c(b3, s2, (byte) (s2 + 1), objArr7);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(windowTouchSlop, maximumDrawingCacheSize, i83, 47863026, false, (String) objArr7[0], null);
                }
                if (!set.contains(((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).get(null))) {
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1056710067);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                        char keyRepeatTimeout = (char) ((ViewConfiguration.getKeyRepeatTimeout() >> 16) + 16949);
                        int touchSlop = (ViewConfiguration.getTouchSlop() >> 8) + 2739;
                        int maximumDrawingCacheSize2 = 13 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24);
                        byte b4 = $$a[5];
                        short s3 = (short) (b4 | 102);
                        Object[] objArr8 = new Object[1];
                        c(b4, s3, (byte) (s3 & 189), objArr8);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(keyRepeatTimeout, touchSlop, maximumDrawingCacheSize2, 631063962, false, (String) objArr8[0], null);
                    }
                    if (!set.contains(((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).get(null))) {
                        if (Build.VERSION.SDK_INT > 33) {
                            int i84 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 13;
                            d = i84 % 128;
                            int i85 = i84 % 2;
                            int i86 = -View.combineMeasuredStates(0, 0);
                            int i87 = ((i86 | 28) << 1) - (i86 ^ 28);
                            Object[] objArr9 = new Object[1];
                            a(new char[]{47663, 32375, 24133, 51331, 32910, 14621, 36448, 49695, 59113, 54659, 19406, 61649, 48414, 21887, 56583, 49862, 25731, 16075, 55950, 22292, 38688, 59395, 37797, 17884, 27188, 55864, 55589, 3226, 47091, 49924}, i87, objArr9);
                            Object[] objArr10 = {(String) objArr9[0]};
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-52092531);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                char minimumFlingVelocity = (char) (ViewConfiguration.getMinimumFlingVelocity() >> 16);
                                int packedPositionChild = ExpandableListView.getPackedPositionChild(0L) + 994;
                                int i88 = (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 7;
                                byte b5 = $$a[7];
                                byte b6 = b5;
                                Object[] objArr11 = new Object[1];
                                c(b6, (short) (b6 | 140), b5, objArr11);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(minimumFlingVelocity, packedPositionChild, i88, 410748506, false, (String) objArr11[0], new Class[]{String.class});
                            }
                            long jLongValue = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr10)).longValue();
                            int i89 = d + 63;
                            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i89 % 128;
                            int i90 = i89 % 2;
                            long j = 1088169696;
                            long j2 = 220;
                            long j3 = -1;
                            i8 = i4;
                            long j4 = i;
                            long j5 = j4 ^ j3;
                            long j6 = (((long) 221) * j) + (((long) (-219)) * jLongValue) + (((((j ^ j3) | (jLongValue ^ j3)) ^ j3) | (((j5 | j) | jLongValue) ^ j3)) * j2) + (((long) (-440)) * ((j3 ^ (j5 | jLongValue)) | j)) + (j2 * (j | jLongValue | j4)) + ((long) (-1289087933));
                            int i91 = (int) (j6 >> 32);
                            int startElapsedRealtime = (int) Process.getStartElapsedRealtime();
                            int i92 = ~startElapsedRealtime;
                            int i93 = i91 & ((((~((-564678691) | i92)) | (~((-1079356502) | startElapsedRealtime))) * 988) + 1030242918 + (((~(startElapsedRealtime | 1213705693)) | (-1778384384) | (~(i92 | (-1079356502)))) * 988));
                            i4 = i;
                            int i94 = ((int) j6) & (1561507610 + (((~(1424636799 | (~i4))) | 12589610) * (-591)) + ((1424636799 | i4) * 591));
                            i9 = (i93 & i94) | (i93 ^ i94);
                            int i95 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                            i12 = (i95 & 89) + (i95 | 89);
                            d = i12 % 128;
                            if (i12 % 2 == 0) {
                                int i96 = 5 / 4;
                            }
                        } else {
                            i8 = i4;
                            i4 = i;
                            Object[] objArr12 = new Object[1];
                            a(new char[]{25682, 524, 50643, 21866}, (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), objArr12);
                            str = (String) objArr12[0];
                            cArr = new char[]{24565, 4547, 24408, 10973, 42571, 4633, 48273, 13757, 57784, 56208, 3643, 3941, 32954, 53022, 32270, 15674};
                            int i97 = d;
                            i11 = ((i97 | 107) << 1) - (i97 ^ 107);
                            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i11 % 128;
                            if (i11 % 2 != 0) {
                                Object[] objArr13 = new Object[1];
                                a(cArr, 15 % (ViewConfiguration.getPressedStateDuration() * 93), objArr13);
                                str2 = (String) objArr13[0];
                            } else {
                                int pressedStateDuration = ViewConfiguration.getPressedStateDuration() >> 16;
                                int i98 = (pressedStateDuration ^ 13) + ((pressedStateDuration & 13) << 1);
                                Object[] objArr14 = new Object[1];
                                a(cArr, i98, objArr14);
                                str2 = (String) objArr14[0];
                            }
                            objArr = new Object[]{str2};
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1333629456);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                                char gidForName2 = (char) (33601 - Process.getGidForName(""));
                                int packedPositionChild2 = ExpandableListView.getPackedPositionChild(0L) + 3086;
                                int i99 = (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 26;
                                byte b7 = $$a[7];
                                byte b8 = b7;
                                Object[] objArr15 = new Object[1];
                                c(b8, (short) (b8 | 140), b7, objArr15);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(gidForName2, packedPositionChild2, i99, 1411172903, false, (String) objArr15[0], new Class[]{String.class});
                            }
                            if (str.equals(((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr))) {
                                int i100 = d;
                                int i101 = (i100 ^ 11) + ((i100 & 11) << 1);
                                TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i101 % 128;
                                int i102 = i101 % 2;
                                i9 = 1;
                            } else {
                                int i103 = d + 85;
                                TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i103 % 128;
                                int i104 = i103 % 2;
                                i9 = 0;
                            }
                        }
                        int i105 = (~(i4 & 10)) & (i4 | 10);
                        int i106 = -i9;
                        int i107 = ((i9 & i106) | (i9 ^ i106)) >> 31;
                        int i108 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                        int i109 = (i108 ^ 75) + ((i108 & 75) << 1);
                        d = i109 % 128;
                        i10 = i109 % 2;
                        int i110 = (~i107) & i4;
                        int i111 = i107 & i105;
                        int i112 = (i111 & i110) | (i110 ^ i111);
                        if (i10 == 0) {
                            int i113 = 96 / 0;
                        }
                        int i114 = i2 & 32;
                        int i115 = -i114;
                        int i116 = ((i114 & i115) | (i114 ^ i115)) >> 31;
                        int i117 = i112 & (~i116);
                        int i118 = i116 & i4;
                        i5 = (i117 & i118) | (i117 ^ i118);
                        LoginActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                        LoginActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                        i6 = i8;
                    } else if (Build.VERSION.SDK_INT == 30) {
                        i5 = i;
                        i6 = i4;
                        i4 = i5;
                    } else {
                        if (Build.VERSION.SDK_INT > 33) {
                            int i810 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 13;
                            d = i810 % 128;
                            int i811 = i810 % 2;
                            int i812 = -View.combineMeasuredStates(0, 0);
                            int i813 = ((i812 | 28) << 1) - (i812 ^ 28);
                            Object[] objArr16 = new Object[1];
                            a(new char[]{47663, 32375, 24133, 51331, 32910, 14621, 36448, 49695, 59113, 54659, 19406, 61649, 48414, 21887, 56583, 49862, 25731, 16075, 55950, 22292, 38688, 59395, 37797, 17884, 27188, 55864, 55589, 3226, 47091, 49924}, i813, objArr16);
                            Object[] objArr17 = {(String) objArr16[0]};
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-52092531);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                char minimumFlingVelocity2 = (char) (ViewConfiguration.getMinimumFlingVelocity() >> 16);
                                int packedPositionChild3 = ExpandableListView.getPackedPositionChild(0L) + 994;
                                int i814 = (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 7;
                                byte b9 = $$a[7];
                                byte b10 = b9;
                                Object[] objArr18 = new Object[1];
                                c(b10, (short) (b10 | 140), b9, objArr18);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(minimumFlingVelocity2, packedPositionChild3, i814, 410748506, false, (String) objArr18[0], new Class[]{String.class});
                            }
                            long jLongValue2 = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr17)).longValue();
                            int i815 = d + 63;
                            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i815 % 128;
                            int i910 = i815 % 2;
                            long j7 = 1088169696;
                            long j8 = 220;
                            long j9 = -1;
                            i8 = i4;
                            long j10 = i;
                            long j11 = j10 ^ j9;
                            long j12 = (((long) 221) * j7) + (((long) (-219)) * jLongValue2) + (((((j7 ^ j9) | (jLongValue2 ^ j9)) ^ j9) | (((j11 | j7) | jLongValue2) ^ j9)) * j8) + (((long) (-440)) * ((j9 ^ (j11 | jLongValue2)) | j7)) + (j8 * (j7 | jLongValue2 | j10)) + ((long) (-1289087933));
                            int i911 = (int) (j12 >> 32);
                            int startElapsedRealtime2 = (int) Process.getStartElapsedRealtime();
                            int i912 = ~startElapsedRealtime2;
                            int i913 = i911 & ((((~((-564678691) | i912)) | (~((-1079356502) | startElapsedRealtime2))) * 988) + 1030242918 + (((~(startElapsedRealtime2 | 1213705693)) | (-1778384384) | (~(i912 | (-1079356502)))) * 988));
                            i4 = i;
                            int i914 = ((int) j12) & (1561507610 + (((~(1424636799 | (~i4))) | 12589610) * (-591)) + ((1424636799 | i4) * 591));
                            i9 = (i913 & i914) | (i913 ^ i914);
                            int i915 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                            i12 = (i915 & 89) + (i915 | 89);
                            d = i12 % 128;
                            if (i12 % 2 == 0) {
                                int i916 = 5 / 4;
                            }
                        } else {
                            i8 = i4;
                            i4 = i;
                            Object[] objArr19 = new Object[1];
                            a(new char[]{25682, 524, 50643, 21866}, (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), objArr19);
                            str = (String) objArr19[0];
                            cArr = new char[]{24565, 4547, 24408, 10973, 42571, 4633, 48273, 13757, 57784, 56208, 3643, 3941, 32954, 53022, 32270, 15674};
                            int i917 = d;
                            i11 = ((i917 | 107) << 1) - (i917 ^ 107);
                            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i11 % 128;
                            if (i11 % 2 != 0) {
                                Object[] objArr110 = new Object[1];
                                a(cArr, 15 % (ViewConfiguration.getPressedStateDuration() * 93), objArr110);
                                str2 = (String) objArr110[0];
                            } else {
                                int pressedStateDuration2 = ViewConfiguration.getPressedStateDuration() >> 16;
                                int i918 = (pressedStateDuration2 ^ 13) + ((pressedStateDuration2 & 13) << 1);
                                Object[] objArr111 = new Object[1];
                                a(cArr, i918, objArr111);
                                str2 = (String) objArr111[0];
                            }
                            objArr = new Object[]{str2};
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1333629456);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                                char gidForName3 = (char) (33601 - Process.getGidForName(""));
                                int packedPositionChild4 = ExpandableListView.getPackedPositionChild(0L) + 3086;
                                int i919 = (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 26;
                                byte b11 = $$a[7];
                                byte b12 = b11;
                                Object[] objArr112 = new Object[1];
                                c(b12, (short) (b12 | 140), b11, objArr112);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(gidForName3, packedPositionChild4, i919, 1411172903, false, (String) objArr112[0], new Class[]{String.class});
                            }
                            if (str.equals(((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr))) {
                                int i1010 = d;
                                int i1011 = (i1010 ^ 11) + ((i1010 & 11) << 1);
                                TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i1011 % 128;
                                int i1012 = i1011 % 2;
                                i9 = 1;
                            } else {
                                int i1013 = d + 85;
                                TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i1013 % 128;
                                int i1014 = i1013 % 2;
                                i9 = 0;
                            }
                        }
                        int i1015 = (~(i4 & 10)) & (i4 | 10);
                        int i1016 = -i9;
                        int i1017 = ((i9 & i1016) | (i9 ^ i1016)) >> 31;
                        int i1018 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                        int i1019 = (i1018 ^ 75) + ((i1018 & 75) << 1);
                        d = i1019 % 128;
                        i10 = i1019 % 2;
                        int i119 = (~i1017) & i4;
                        int i1110 = i1017 & i1015;
                        int i1111 = (i1110 & i119) | (i119 ^ i1110);
                        if (i10 == 0) {
                            int i1112 = 96 / 0;
                        }
                        int i1113 = i2 & 32;
                        int i1114 = -i1113;
                        int i1115 = ((i1113 & i1114) | (i1113 ^ i1114)) >> 31;
                        int i1116 = i1111 & (~i1115);
                        int i1117 = i1115 & i4;
                        i5 = (i1116 & i1117) | (i1116 ^ i1117);
                        LoginActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                        LoginActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                        i6 = i8;
                    }
                } else if (Build.VERSION.SDK_INT == 30) {
                    i5 = i;
                    i6 = i4;
                    i4 = i5;
                } else {
                    try {
                        try {
                            if (Build.VERSION.SDK_INT > 33) {
                                int i816 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 13;
                                d = i816 % 128;
                                int i817 = i816 % 2;
                                int i818 = -View.combineMeasuredStates(0, 0);
                                int i819 = ((i818 | 28) << 1) - (i818 ^ 28);
                                Object[] objArr113 = new Object[1];
                                a(new char[]{47663, 32375, 24133, 51331, 32910, 14621, 36448, 49695, 59113, 54659, 19406, 61649, 48414, 21887, 56583, 49862, 25731, 16075, 55950, 22292, 38688, 59395, 37797, 17884, 27188, 55864, 55589, 3226, 47091, 49924}, i819, objArr113);
                                try {
                                    Object[] objArr114 = {(String) objArr113[0]};
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-52092531);
                                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                        char minimumFlingVelocity3 = (char) (ViewConfiguration.getMinimumFlingVelocity() >> 16);
                                        int packedPositionChild5 = ExpandableListView.getPackedPositionChild(0L) + 994;
                                        int i8110 = (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 7;
                                        byte b13 = $$a[7];
                                        byte b14 = b13;
                                        Object[] objArr115 = new Object[1];
                                        c(b14, (short) (b14 | 140), b13, objArr115);
                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(minimumFlingVelocity3, packedPositionChild5, i8110, 410748506, false, (String) objArr115[0], new Class[]{String.class});
                                    }
                                    long jLongValue3 = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr114)).longValue();
                                    int i8111 = d + 63;
                                    TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i8111 % 128;
                                    int i9110 = i8111 % 2;
                                    long j13 = 1088169696;
                                    long j14 = 220;
                                    long j15 = -1;
                                    i8 = i4;
                                    long j16 = i;
                                    long j17 = j16 ^ j15;
                                    long j18 = (((long) 221) * j13) + (((long) (-219)) * jLongValue3) + (((((j13 ^ j15) | (jLongValue3 ^ j15)) ^ j15) | (((j17 | j13) | jLongValue3) ^ j15)) * j14) + (((long) (-440)) * ((j15 ^ (j17 | jLongValue3)) | j13)) + (j14 * (j13 | jLongValue3 | j16)) + ((long) (-1289087933));
                                    int i9111 = (int) (j18 >> 32);
                                    try {
                                        int startElapsedRealtime3 = (int) Process.getStartElapsedRealtime();
                                        int i9112 = ~startElapsedRealtime3;
                                        int i9113 = i9111 & ((((~((-564678691) | i9112)) | (~((-1079356502) | startElapsedRealtime3))) * 988) + 1030242918 + (((~(startElapsedRealtime3 | 1213705693)) | (-1778384384) | (~(i9112 | (-1079356502)))) * 988));
                                        i4 = i;
                                        int i9114 = ((int) j18) & (1561507610 + (((~(1424636799 | (~i4))) | 12589610) * (-591)) + ((1424636799 | i4) * 591));
                                        i9 = (i9113 & i9114) | (i9113 ^ i9114);
                                        int i9115 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                                        i12 = (i9115 & 89) + (i9115 | 89);
                                        d = i12 % 128;
                                        if (i12 % 2 == 0) {
                                            int i9116 = 5 / 4;
                                        }
                                    } catch (Exception unused) {
                                        i4 = i;
                                        i9 = 0;
                                    }
                                } catch (Throwable th2) {
                                    Throwable cause2 = th2.getCause();
                                    if (cause2 != null) {
                                        throw cause2;
                                    }
                                    throw th2;
                                }
                            } else {
                                i8 = i4;
                                i4 = i;
                                Object[] objArr116 = new Object[1];
                                a(new char[]{25682, 524, 50643, 21866}, (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), objArr116);
                                str = (String) objArr116[0];
                                cArr = new char[]{24565, 4547, 24408, 10973, 42571, 4633, 48273, 13757, 57784, 56208, 3643, 3941, 32954, 53022, 32270, 15674};
                                int i9117 = d;
                                i11 = ((i9117 | 107) << 1) - (i9117 ^ 107);
                                TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i11 % 128;
                                if (i11 % 2 != 0) {
                                    Object[] objArr117 = new Object[1];
                                    a(cArr, 15 % (ViewConfiguration.getPressedStateDuration() * 93), objArr117);
                                    str2 = (String) objArr117[0];
                                } else {
                                    int pressedStateDuration3 = ViewConfiguration.getPressedStateDuration() >> 16;
                                    int i9118 = (pressedStateDuration3 ^ 13) + ((pressedStateDuration3 & 13) << 1);
                                    Object[] objArr118 = new Object[1];
                                    a(cArr, i9118, objArr118);
                                    str2 = (String) objArr118[0];
                                }
                                try {
                                    objArr = new Object[]{str2};
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1333629456);
                                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                                        char gidForName4 = (char) (33601 - Process.getGidForName(""));
                                        int packedPositionChild6 = ExpandableListView.getPackedPositionChild(0L) + 3086;
                                        int i9119 = (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 26;
                                        byte b15 = $$a[7];
                                        byte b16 = b15;
                                        Object[] objArr119 = new Object[1];
                                        c(b16, (short) (b16 | 140), b15, objArr119);
                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(gidForName4, packedPositionChild6, i9119, 1411172903, false, (String) objArr119[0], new Class[]{String.class});
                                    }
                                    if (str.equals(((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr))) {
                                        int i10110 = d;
                                        int i10111 = (i10110 ^ 11) + ((i10110 & 11) << 1);
                                        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i10111 % 128;
                                        int i10112 = i10111 % 2;
                                        i9 = 1;
                                    } else {
                                        int i10113 = d + 85;
                                        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i10113 % 128;
                                        int i10114 = i10113 % 2;
                                        i9 = 0;
                                    }
                                } catch (Throwable th3) {
                                    Throwable cause3 = th3.getCause();
                                    if (cause3 != null) {
                                        throw cause3;
                                    }
                                    throw th3;
                                }
                            }
                        } catch (Exception unused2) {
                        }
                    } catch (Exception unused3) {
                        i8 = i4;
                        i4 = i;
                    }
                    int i10115 = (~(i4 & 10)) & (i4 | 10);
                    int i10116 = -i9;
                    int i10117 = ((i9 & i10116) | (i9 ^ i10116)) >> 31;
                    int i10118 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                    int i10119 = (i10118 ^ 75) + ((i10118 & 75) << 1);
                    d = i10119 % 128;
                    i10 = i10119 % 2;
                    int i1118 = (~i10117) & i4;
                    int i1119 = i10117 & i10115;
                    int i11110 = (i1119 & i1118) | (i1118 ^ i1119);
                    if (i10 == 0) {
                        int i11111 = 96 / 0;
                    }
                    int i11112 = i2 & 32;
                    int i11113 = -i11112;
                    int i11114 = ((i11112 & i11113) | (i11112 ^ i11113)) >> 31;
                    int i11115 = i11110 & (~i11114);
                    int i11116 = i11114 & i4;
                    i5 = (i11115 & i11116) | (i11115 ^ i11116);
                    LoginActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                    LoginActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                    i6 = i8;
                }
                int i120 = (~i6) & i4;
                int i121 = ~i4;
                int i122 = i120 | (i6 & i121);
                int i123 = (i122 | (-i122)) >> 31;
                int i124 = d;
                int i125 = (i124 & 81) + (i124 | 81);
                TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i125 % 128;
                int i126 = i125 % 2;
                int i127 = i5 & (~i123);
                int i128 = i6 & i123;
                int i129 = (i127 & i128) | (i127 ^ i128);
                int i130 = ((~i129) & i4) | (i129 & i121);
                int i131 = -i130;
                Object[] objArr20 = {new int[]{i4}, new int[1], new int[]{i129}, null};
                int i132 = (-340708924) + ((~((-12642901) | i121)) * (-116)) + ((993662379 | i4) * 116) + (((~(953352150 | i4)) | 52953129) * 116) + ((((i130 & i131) | (i130 ^ i131)) >> 31) & 16);
                int iTuitionPaymentFragmentspecialinlinedviewModeldefault4 = LoginActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                int i133 = i132 * (-711);
                int i134 = i3 * 713;
                int i135 = (i133 ^ i134) + ((i133 & i134) << 1);
                int i136 = ~i3;
                int i137 = ~((i136 ^ i132) | (i136 & i132));
                int i138 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault4;
                int i139 = ~((i138 ^ i132) | (i138 & i132));
                int i140 = ((i137 & i139) | (i137 ^ i139)) * (-712);
                int i141 = ((i135 | i140) << 1) - (i140 ^ i135);
                int i142 = d + 59;
                int i143 = i142 % 128;
                TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i143;
                if (i142 % 2 != 0) {
                    int i144 = ~i3;
                    int i145 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault4;
                    int i146 = (i144 & i145) | (i144 ^ i145);
                    int i147 = ~((i146 & i132) | (i146 ^ i132));
                    int i148 = ~(iTuitionPaymentFragmentspecialinlinedviewModeldefault4 | (i3 & i132) | (i132 ^ i3));
                    int i149 = (i148 & i147) | (i147 ^ i148);
                    i7 = i141 / ((i149 ^ (-712)) + ((i149 & (-712)) << 1));
                } else {
                    i136 = ~i3;
                    int i150 = (i136 ^ i138) | (i136 & i138);
                    int i151 = ~((i150 & i132) | (i150 ^ i132));
                    int i152 = (i3 & i132) | (i132 ^ i3);
                    int i153 = ~((iTuitionPaymentFragmentspecialinlinedviewModeldefault4 & i152) | (i152 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault4));
                    i7 = i141 + (((i153 & i151) | (i151 ^ i153)) * (-712));
                }
                int i154 = i143 + 89;
                d = i154 % 128;
                int i155 = i154 % 2;
                int i156 = ~((i138 ^ i132) | (i138 & i132));
                int i157 = -(-(712 * ((i156 & i136) | (i136 ^ i156))));
                int i158 = ((i7 | i157) << 1) - (i157 ^ i7);
                int i159 = i158 << 13;
                int i160 = (i159 | i158) & (~(i158 & i159));
                int i161 = i160 ^ (i160 >>> 17);
                int i162 = i161 << 5;
                ((int[]) objArr20[1])[0] = ((~i161) & i162) | ((~i162) & i161);
                return objArr20;
            } catch (Throwable th4) {
                Throwable cause4 = th4.getCause();
                if (cause4 != null) {
                    throw cause4;
                }
                throw th4;
            }
        }

        /* JADX WARN: Code duplicated, block: B:10:0x0022  */
        /* JADX WARN: Code duplicated, block: B:8:0x001c  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:11:0x0026). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0022
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        private static java.lang.String $$e(short r5, int r6, short r7) {
            /*
                int r7 = r7 * 2
                int r0 = r7 + 1
                int r5 = r5 * 2
                int r5 = 108 - r5
                int r6 = r6 * 3
                int r6 = r6 + 4
                byte[] r1 = com.google.android.gms.common.api.Api.ClientKey.$$c
                byte[] r0 = new byte[r0]
                r2 = 0
                if (r1 != 0) goto L16
                r4 = r6
                r3 = r2
                goto L26
            L16:
                r3 = r2
            L17:
                byte r4 = (byte) r5
                r0[r3] = r4
                if (r3 != r7) goto L22
                java.lang.String r5 = new java.lang.String
                r5.<init>(r0, r2)
                return r5
            L22:
                int r3 = r3 + 1
                r4 = r1[r6]
            L26:
                int r6 = r6 + 1
                int r4 = -r4
                int r5 = r5 + r4
                goto L17
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.Api.ClientKey.$$e(short, int, short):java.lang.String");
        }
    }
}
