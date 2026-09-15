package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.media.AudioTrack;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import com.dynatrace.android.agent.comm.InvalidConfigurationException;
import com.dynatrace.android.agent.conf.DataCollectionLevel;
import com.dynatrace.android.agent.conf.ServerConfiguration;
import java.lang.reflect.Field;

/* JADX INFO: loaded from: classes3.dex */
public final class removeStateChangeCallback {
    public static final String TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    public final snapToSurfaceRotation TuitionPaymentFragmentbindingInflater1;
    public final SharedPreferences b;

    static {
        StringBuilder sb = new StringBuilder();
        sb.append(SurfaceRequestExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
        sb.append("PreferencesManager");
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = sb.toString();
    }

    private removeStateChangeCallback(SharedPreferences sharedPreferences, snapToSurfaceRotation snaptosurfacerotation) {
        this.b = sharedPreferences;
        this.TuitionPaymentFragmentbindingInflater1 = snaptosurfacerotation;
    }

    public static removeStateChangeCallback b(Context context, snapToSurfaceRotation snaptosurfacerotation) {
        return new removeStateChangeCallback(context.getSharedPreferences("com.dynatrace.android.dtxPref", 0), snaptosurfacerotation);
    }

    public final getAttachedStreamSpec TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        getAttachedStreamSpec getattachedstreamspec = bindToCamera.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        try {
            boolean z = this.b.getBoolean("DTXOptInCrashes", getattachedstreamspec.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
            DataCollectionLevel dataCollectionLevelValueOf = DataCollectionLevel.valueOf(this.b.getString("DTXDataCollectionLevel", getattachedstreamspec.TuitionPaymentFragmentspecialinlinedviewModeldefault2.name()));
            boolean z2 = this.b.getBoolean("DTXCrashReplayOptedIn", getattachedstreamspec.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
            if (!z && z2) {
                this.b.edit().putBoolean("DTXCrashReplayOptedIn", false).apply();
                if (SurfaceRequestExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                    ViewPort.asInterface("CrashReplayOptedIn cannot be true when CrashReportOptIn is false");
                }
                z2 = false;
            }
            getAttachedStreamSpec.TuitionPaymentFragmentspecialinlinedviewModeldefault3 tuitionPaymentFragmentspecialinlinedviewModeldefault3 = new getAttachedStreamSpec.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
            if (dataCollectionLevelValueOf == null) {
                if (SurfaceRequestExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                    String unused = getAttachedStreamSpec.b;
                    ViewPort.asInterface("dataCollectionLevel == null is not allowed");
                }
            } else {
                tuitionPaymentFragmentspecialinlinedviewModeldefault3.b = dataCollectionLevelValueOf;
            }
            tuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = z;
            int i = this.b.getInt("DTXCScreenRecordOptedIn", -1);
            if (i != -1) {
                boolean z3 = true;
                if (i != 1) {
                    z3 = false;
                }
                Boolean boolValueOf = Boolean.valueOf(z3);
                tuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = boolValueOf;
                if (boolValueOf != null) {
                    tuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentbindingInflater1 = boolValueOf.booleanValue();
                }
            } else {
                tuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = null;
                if (tuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault1 == null) {
                    tuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentbindingInflater1 = z2;
                }
            }
            return new getAttachedStreamSpec(tuitionPaymentFragmentspecialinlinedviewModeldefault3, (byte) 0);
        } catch (Exception unused2) {
            if (SurfaceRequestExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                ViewPort.TuitionPaymentFragmentbindingInflater1("could not read privacy settings");
            }
            TuitionPaymentFragmentspecialinlinedviewModeldefault3();
            return getattachedstreamspec;
        }
    }

    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        this.b.edit().remove("DTXOptInCrashes").remove("DTXDataCollectionLevel").remove("DTXCrashReplayOptedIn").remove("DTXCScreenRecordOptedIn").apply();
    }

    public final ServerConfiguration TuitionPaymentFragmentbindingInflater1() throws Throwable {
        if (!this.b.contains("ServerConfig")) {
            return null;
        }
        String strTuitionPaymentFragmentspecialinlinedviewModeldefault2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2("ServerConfig", null);
        if (SurfaceRequestExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
            ViewPort.TuitionPaymentFragmentspecialinlinedviewModeldefault2("stored configuration: ".concat(String.valueOf(strTuitionPaymentFragmentspecialinlinedviewModeldefault2)));
        }
        try {
            ServerConfiguration serverConfigurationB = this.TuitionPaymentFragmentbindingInflater1.b(snapToSurfaceRotation.TuitionPaymentFragmentbindingInflater1, strTuitionPaymentFragmentspecialinlinedviewModeldefault2);
            if (serverConfigurationB.cancel == ServerConfiguration.Status.OK) {
                return serverConfigurationB;
            }
            StringBuilder sb = new StringBuilder("unexpected status code: ");
            sb.append(serverConfigurationB.cancel);
            throw new InvalidConfigurationException(sb.toString());
        } catch (Exception unused) {
            if (SurfaceRequestExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                ViewPort.TuitionPaymentFragmentbindingInflater1("can't parse stored configuration");
            }
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1096626159);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (46400 - Color.green(0)), 41 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), (ViewConfiguration.getWindowTouchSlop() >> 8) + 19, 1513912262, false, "b", null);
            }
            int i = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getInt(null);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-914723831);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (TextUtils.lastIndexOf("", '0', 0, 0) + 37837), (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 59, 18 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), 769969118, false, "TuitionPaymentFragmentbindingInflater1", null);
            }
            long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getInt(null);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-639884696);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (37836 - KeyEvent.normalizeMetaState(0)), (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 59, (KeyEvent.getMaxKeyCode() >> 16) + 18, 1027769791, false, "TuitionPaymentFragmentspecialinlinedviewModeldefault1", null);
            }
            int i2 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).getInt(null);
            long j2 = 85;
            long j3 = (j2 * 1979630244252212654L) + (j2 * 3539623252907573585L);
            long j4 = -84;
            long j5 = -1;
            long j6 = j5 ^ 1979630244252212654L;
            long j7 = j5 ^ 3539623252907573585L;
            long jIdentityHashCode = System.identityHashCode(this);
            long j8 = jIdentityHashCode ^ j5;
            long j9 = (j8 | 3539623252907573585L) ^ j5;
            long j10 = j3 + ((((j6 | j7) ^ j5) | ((j6 | j8) ^ j5) | ((j7 | j8) ^ j5) | ((4287233056185900543L | jIdentityHashCode) ^ j5)) * j4) + (j4 * (((j7 | jIdentityHashCode) ^ j5) | 1979630244252212654L | j9)) + (((long) 84) * ((4287233056185900543L ^ j5) | j9));
            int i3 = i2;
            int i4 = 0;
            while (true) {
                for (int i5 = 0; i5 != 8; i5++) {
                    i3 = (((((int) (j >> i5)) & 255) + (i3 << 6)) + (i3 << 16)) - i3;
                }
                if (i4 != 0) {
                    break;
                }
                i4++;
                j = j10;
            }
            if (i3 != i) {
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1551937752);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (46399 - TextUtils.lastIndexOf("", '0', 0, 0)), 41 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), 19 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), -1205987569, false, "TuitionPaymentFragmentspecialinlinedviewModeldefault2", null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).get(null);
                throw null;
            }
            this.b.edit().remove("ServerConfig").apply();
            return null;
        }
    }

    public final String TuitionPaymentFragmentspecialinlinedviewModeldefault2(String str, String str2) {
        try {
            return this.b.getString(str, str2);
        } catch (ClassCastException unused) {
            this.b.edit().remove(str).apply();
            return str2;
        }
    }

    public final boolean b(String str) {
        try {
            return this.b.getBoolean(str, true);
        } catch (ClassCastException unused) {
            this.b.edit().remove(str).apply();
            return true;
        }
    }

    public static ServerConfiguration TuitionPaymentFragmentspecialinlinedviewModeldefault1(ServerConfiguration serverConfiguration, int i) throws Throwable {
        ServerConfiguration.TuitionPaymentFragmentbindingInflater1 tuitionPaymentFragmentbindingInflater1;
        if (serverConfiguration == null) {
            ServerConfiguration.TuitionPaymentFragmentbindingInflater1 tuitionPaymentFragmentbindingInflater2 = new ServerConfiguration.TuitionPaymentFragmentbindingInflater1();
            tuitionPaymentFragmentbindingInflater2.asInterface = i;
            tuitionPaymentFragmentbindingInflater1 = tuitionPaymentFragmentbindingInflater2;
        } else {
            tuitionPaymentFragmentbindingInflater1 = new ServerConfiguration.TuitionPaymentFragmentbindingInflater1(serverConfiguration, false);
        }
        tuitionPaymentFragmentbindingInflater1.onTransact = 0L;
        tuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 1;
        tuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 1;
        ServerConfiguration.TuitionPaymentFragmentbindingInflater1 tuitionPaymentFragmentbindingInflater1TuitionPaymentFragmentspecialinlinedviewModeldefault3 = tuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault3(false);
        tuitionPaymentFragmentbindingInflater1TuitionPaymentFragmentspecialinlinedviewModeldefault3.INotificationSideChannel = -1;
        return new ServerConfiguration(tuitionPaymentFragmentbindingInflater1TuitionPaymentFragmentspecialinlinedviewModeldefault3, (byte) 0);
    }
}
