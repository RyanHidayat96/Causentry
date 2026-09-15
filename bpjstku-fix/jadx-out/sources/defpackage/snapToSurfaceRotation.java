package defpackage;

import androidx.core.app.NotificationCompat;
import com.bpjstku.presentation.main.home.HomeFragment$special$$inlined$inject$default$1;
import com.dynatrace.android.agent.comm.InvalidConfigurationException;
import com.dynatrace.android.agent.conf.AgentMode;
import com.dynatrace.android.agent.conf.ServerConfiguration;
import com.google.firebase.dynamiclinks.DynamicLink;
import java.text.ParseException;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;

/* JADX INFO: loaded from: classes4.dex */
public final class snapToSurfaceRotation implements getAttachedSurfaceResolution {
    static final ServerConfiguration TuitionPaymentFragmentbindingInflater1;
    private static final ServerConfiguration TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    private static final String b;
    private final String TuitionPaymentFragmentspecialinlinedviewModeldefault1;

    static {
        StringBuilder sb = new StringBuilder();
        sb.append(SurfaceRequestExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
        sb.append("ServerConfigurationManager");
        b = sb.toString();
        ServerConfiguration.TuitionPaymentFragmentbindingInflater1 tuitionPaymentFragmentbindingInflater1 = new ServerConfiguration.TuitionPaymentFragmentbindingInflater1();
        tuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
        tuitionPaymentFragmentbindingInflater1.notify = ServerConfiguration.Status.ERROR;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = new ServerConfiguration(tuitionPaymentFragmentbindingInflater1, (byte) 0);
        ServerConfiguration.TuitionPaymentFragmentbindingInflater1 tuitionPaymentFragmentbindingInflater2 = new ServerConfiguration.TuitionPaymentFragmentbindingInflater1();
        tuitionPaymentFragmentbindingInflater2.onTransact = -1L;
        TuitionPaymentFragmentbindingInflater1 = new ServerConfiguration(tuitionPaymentFragmentbindingInflater2, (byte) 0);
    }

    public snapToSurfaceRotation(String str) {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = str;
    }

    @Override // defpackage.getAttachedSurfaceResolution
    public final ServerConfiguration b(ServerConfiguration serverConfiguration, String str) throws Throwable {
        ServerConfiguration.TuitionPaymentFragmentbindingInflater1 tuitionPaymentFragmentbindingInflater1;
        byte b2;
        JSONObject jSONObject = (JSONObject) new JSONTokener(str).nextValue();
        if (!jSONObject.has("dynamicConfig")) {
            throw new InvalidConfigurationException("The configuration is missing the dynamicConfig block");
        }
        if (jSONObject.has("timestamp") && jSONObject.has("appConfig") && jSONObject.has("mobileAgentConfig")) {
            tuitionPaymentFragmentbindingInflater1 = ServerConfiguration.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
            try {
                long j = jSONObject.getLong("timestamp");
                if (j <= serverConfiguration.cancelAll) {
                    return serverConfiguration;
                }
                tuitionPaymentFragmentbindingInflater1.onTransact = j;
                addStateChangeCallback.b bVarTuitionPaymentFragmentspecialinlinedviewModeldefault1 = addStateChangeCallback.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                JSONObject jSONObject2 = jSONObject.getJSONObject("mobileAgentConfig");
                if (jSONObject2.has("maxBeaconSizeKb")) {
                    tuitionPaymentFragmentbindingInflater1.b = b(jSONObject2, "maxBeaconSizeKb", 10, Integer.MAX_VALUE, 150);
                }
                if (jSONObject2.has("selfmonitoring")) {
                    tuitionPaymentFragmentbindingInflater1.asBinder = TuitionPaymentFragmentspecialinlinedviewModeldefault1(jSONObject2, "selfmonitoring", true);
                }
                getAppTargetRotation.TuitionPaymentFragmentspecialinlinedviewModeldefault2 tuitionPaymentFragmentspecialinlinedviewModeldefault2B = getAppTargetRotation.b();
                if (jSONObject2.has("maxSessionDurationMins")) {
                    tuitionPaymentFragmentspecialinlinedviewModeldefault2B.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = b(jSONObject2, "maxSessionDurationMins", 10, Integer.MAX_VALUE, 360);
                }
                if (jSONObject2.has("sessionTimeoutSec")) {
                    tuitionPaymentFragmentspecialinlinedviewModeldefault2B.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = b(jSONObject2, "sessionTimeoutSec", 30, Integer.MAX_VALUE, 600);
                }
                tuitionPaymentFragmentbindingInflater1.cancel = new getAppTargetRotation(tuitionPaymentFragmentspecialinlinedviewModeldefault2B, (byte) 0);
                if (jSONObject2.has("sendIntervalSec")) {
                    tuitionPaymentFragmentbindingInflater1.d = b(jSONObject2, "sendIntervalSec", 10, 120, 120);
                }
                if (jSONObject2.has("maxCachedCrashesCount")) {
                    tuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentbindingInflater1 = b(jSONObject2, "maxCachedCrashesCount", 0, 100, 0);
                }
                if (jSONObject2.has("rageTapConfig")) {
                    JSONObject jSONObject3 = jSONObject2.getJSONObject("rageTapConfig");
                    UseCase.b bVarTuitionPaymentFragmentspecialinlinedviewModeldefault2 = UseCase.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                    if (jSONObject3.has("tapDuration")) {
                        bVarTuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentbindingInflater1 = b(jSONObject3, "tapDuration", 0, Integer.MAX_VALUE, 100);
                    }
                    if (jSONObject3.has("dispersionRadius")) {
                        bVarTuitionPaymentFragmentspecialinlinedviewModeldefault2.b = b(jSONObject3, "dispersionRadius", 0, Integer.MAX_VALUE, 100);
                    }
                    if (jSONObject3.has("timespanDifference")) {
                        bVarTuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = b(jSONObject3, "timespanDifference", 0, Integer.MAX_VALUE, 300);
                    }
                    if (jSONObject3.has("minimumNumberOfTaps")) {
                        bVarTuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = b(jSONObject3, "minimumNumberOfTaps", 3, Integer.MAX_VALUE, 3);
                    }
                    tuitionPaymentFragmentbindingInflater1.g = new UseCase(bVarTuitionPaymentFragmentspecialinlinedviewModeldefault2, (byte) 0);
                }
                if (jSONObject2.has("replayConfig")) {
                    JSONObject jSONObject4 = jSONObject2.getJSONObject("replayConfig");
                    if (jSONObject4.has("protocolVersion")) {
                        bVarTuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentbindingInflater1 = b(jSONObject4, "protocolVersion", 1, 32767, 1);
                    }
                    if (jSONObject4.has("selfmonitoring")) {
                        bVarTuitionPaymentFragmentspecialinlinedviewModeldefault1.g = b(jSONObject4, "selfmonitoring", 0, Integer.MAX_VALUE, 0);
                    }
                }
                JSONObject jSONObject5 = jSONObject.getJSONObject("appConfig");
                try {
                    if (jSONObject5.has("applicationId")) {
                        try {
                            if (!this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.equals(jSONObject5.getString("applicationId"))) {
                                throw new ParseException("No application id", 0);
                            }
                        } catch (ParseException unused) {
                            return TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                        }
                    }
                    if (jSONObject5.has("capture")) {
                        tuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = TuitionPaymentFragmentspecialinlinedviewModeldefault1(jSONObject5, "capture", 0, 1, 1, 1);
                    }
                    if (jSONObject5.has("trafficControlPercentage")) {
                        tuitionPaymentFragmentbindingInflater1.INotificationSideChannel = TuitionPaymentFragmentspecialinlinedviewModeldefault1(jSONObject5, "trafficControlPercentage", 1, 100, 100, 100);
                    }
                    if (jSONObject5.has("bp4Enabled")) {
                        tuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1(jSONObject5, "bp4Enabled", false);
                    }
                    if (jSONObject5.has("replayConfig")) {
                        JSONObject jSONObject6 = jSONObject5.getJSONObject("replayConfig");
                        if (jSONObject6.has("capture")) {
                            bVarTuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = TuitionPaymentFragmentspecialinlinedviewModeldefault1(jSONObject6, "capture", false);
                        }
                        if (jSONObject6.has("crashesEnabled")) {
                            bVarTuitionPaymentFragmentspecialinlinedviewModeldefault1.b = TuitionPaymentFragmentspecialinlinedviewModeldefault1(jSONObject6, "crashesEnabled", false);
                            bVarTuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = true;
                        }
                        if (jSONObject6.has("trafficControlPercentage")) {
                            bVarTuitionPaymentFragmentspecialinlinedviewModeldefault1.d = TuitionPaymentFragmentspecialinlinedviewModeldefault1(jSONObject6, "trafficControlPercentage", 0, 100, 0, 100);
                        }
                        if (jSONObject6.has("imageRetentionTimeInMinutes")) {
                            bVarTuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = b(jSONObject6, "imageRetentionTimeInMinutes", 0, Integer.MAX_VALUE, 0);
                        }
                    }
                    tuitionPaymentFragmentbindingInflater1.f763a = new addStateChangeCallback(bVarTuitionPaymentFragmentspecialinlinedviewModeldefault1, (byte) 0);
                } catch (ParseException unused2) {
                }
            } catch (JSONException unused3) {
                if (SurfaceRequestExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                    ViewPort.TuitionPaymentFragmentbindingInflater1("timestamp must be of type Long");
                }
                return TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            }
        } else {
            tuitionPaymentFragmentbindingInflater1 = new ServerConfiguration.TuitionPaymentFragmentbindingInflater1(serverConfiguration, true);
        }
        JSONObject jSONObject7 = jSONObject.getJSONObject("dynamicConfig");
        try {
            if (jSONObject7.has(NotificationCompat.CATEGORY_STATUS) && jSONObject7.getString(NotificationCompat.CATEGORY_STATUS).compareToIgnoreCase("ERROR") == 0) {
                throw new ParseException("Error status detected", 0);
            }
            tuitionPaymentFragmentbindingInflater1.notify = ServerConfiguration.Status.OK;
            if (jSONObject7.has("multiplicity")) {
                tuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = TuitionPaymentFragmentspecialinlinedviewModeldefault1(jSONObject7, "multiplicity", 0, Integer.MAX_VALUE, 1, 1);
            }
            if (jSONObject7.has("serverId")) {
                tuitionPaymentFragmentbindingInflater1.asInterface = TuitionPaymentFragmentspecialinlinedviewModeldefault1(jSONObject7, "serverId", 0, Integer.MAX_VALUE, 1, 1);
            }
            if (jSONObject7.has("switchServer")) {
                b2 = 0;
                tuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault3(TuitionPaymentFragmentspecialinlinedviewModeldefault1(jSONObject7, "switchServer", false));
            } else {
                b2 = 0;
            }
            return new ServerConfiguration(tuitionPaymentFragmentbindingInflater1, b2);
        } catch (ParseException unused4) {
            return TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        }
    }

    @Override // defpackage.getAttachedSurfaceResolution
    public final ServerConfiguration TuitionPaymentFragmentspecialinlinedviewModeldefault2(Map<String, String> map, AgentMode agentMode) {
        ServerConfiguration.TuitionPaymentFragmentbindingInflater1 tuitionPaymentFragmentbindingInflater1 = new ServerConfiguration.TuitionPaymentFragmentbindingInflater1();
        tuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = ViewPort.TuitionPaymentFragmentspecialinlinedviewModeldefault3(map, "cp", 0, 1, 1);
        tuitionPaymentFragmentbindingInflater1.d = ((Integer) ViewPort.TuitionPaymentFragmentspecialinlinedviewModeldefault1(HomeFragment$special$$inlined$inject$default$1.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), -1076271412, HomeFragment$special$$inlined$inject$default$1.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), 1076271415, HomeFragment$special$$inlined$inject$default$1.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), new Object[]{map, DynamicLink.SocialMetaTagParameters.KEY_SOCIAL_IMAGE_LINK, 60, 540, 120}, HomeFragment$special$$inlined$inject$default$1.TuitionPaymentFragmentspecialinlinedviewModeldefault1())).intValue();
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault1 = HomeFragment$special$$inlined$inject$default$1.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        tuitionPaymentFragmentbindingInflater1.asInterface = ((Integer) ViewPort.TuitionPaymentFragmentspecialinlinedviewModeldefault1(HomeFragment$special$$inlined$inject$default$1.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), -1076271412, HomeFragment$special$$inlined$inject$default$1.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), 1076271415, HomeFragment$special$$inlined$inject$default$1.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), new Object[]{map, "id", 0, Integer.MAX_VALUE, 1}, iTuitionPaymentFragmentspecialinlinedviewModeldefault1)).intValue();
        tuitionPaymentFragmentbindingInflater1.b = ((Integer) ViewPort.TuitionPaymentFragmentspecialinlinedviewModeldefault1(HomeFragment$special$$inlined$inject$default$1.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), -1076271412, HomeFragment$special$$inlined$inject$default$1.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), 1076271415, HomeFragment$special$$inlined$inject$default$1.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), new Object[]{map, "bl", 1, Integer.MAX_VALUE, Integer.valueOf(agentMode == AgentMode.APP_MON ? 30 : 150)}, HomeFragment$special$$inlined$inject$default$1.TuitionPaymentFragmentspecialinlinedviewModeldefault1())).intValue();
        getAppTargetRotation.TuitionPaymentFragmentspecialinlinedviewModeldefault2 tuitionPaymentFragmentspecialinlinedviewModeldefault2B = getAppTargetRotation.b();
        tuitionPaymentFragmentspecialinlinedviewModeldefault2B.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = ((Integer) ViewPort.TuitionPaymentFragmentspecialinlinedviewModeldefault1(HomeFragment$special$$inlined$inject$default$1.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), -1076271412, HomeFragment$special$$inlined$inject$default$1.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), 1076271415, HomeFragment$special$$inlined$inject$default$1.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), new Object[]{map, DynamicLink.SocialMetaTagParameters.KEY_SOCIAL_TITLE, 0, Integer.MAX_VALUE, 600}, HomeFragment$special$$inlined$inject$default$1.TuitionPaymentFragmentspecialinlinedviewModeldefault1())).intValue();
        tuitionPaymentFragmentbindingInflater1.cancel = new getAppTargetRotation(tuitionPaymentFragmentspecialinlinedviewModeldefault2B, (byte) 0);
        tuitionPaymentFragmentbindingInflater1.INotificationSideChannel = ViewPort.TuitionPaymentFragmentspecialinlinedviewModeldefault3(map, "tc", 1, 100, 100);
        tuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = ViewPort.TuitionPaymentFragmentspecialinlinedviewModeldefault3(map, "mp", 0, Integer.MAX_VALUE, 1);
        tuitionPaymentFragmentbindingInflater1.asBinder = ViewPort.TuitionPaymentFragmentspecialinlinedviewModeldefault3(map, "sm", 0, 1, 1) == 1;
        return new ServerConfiguration(tuitionPaymentFragmentbindingInflater1, (byte) 0);
    }

    private static boolean TuitionPaymentFragmentspecialinlinedviewModeldefault1(JSONObject jSONObject, String str, boolean z) {
        try {
            return jSONObject.getBoolean(str);
        } catch (JSONException unused) {
            StringBuilder sb = new StringBuilder("expected JSON property \"");
            sb.append(str);
            sb.append("\" to be a Boolean, but it was not");
            String string = sb.toString();
            if (SurfaceRequestExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                ViewPort.TuitionPaymentFragmentbindingInflater1(string);
            }
            return z;
        }
    }

    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault1(JSONObject jSONObject, String str, int i, int i2, int i3, int i4) {
        if (jSONObject.has(str)) {
            try {
                int i5 = jSONObject.getInt(str);
                if (i5 >= i) {
                    return i5 > i2 ? i4 : i5;
                }
            } catch (JSONException unused) {
                StringBuilder sb = new StringBuilder("expected JSON property \"");
                sb.append(str);
                sb.append("\" to be an Integer, but it was not");
                String string = sb.toString();
                if (SurfaceRequestExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                    ViewPort.TuitionPaymentFragmentbindingInflater1(string);
                }
            }
        }
        return i3;
    }

    private static int b(JSONObject jSONObject, String str, int i, int i2, int i3) {
        if (jSONObject.has(str)) {
            try {
                return Math.max(Math.min(jSONObject.getInt(str), i2), i);
            } catch (JSONException unused) {
                StringBuilder sb = new StringBuilder("expected JSON property \"");
                sb.append(str);
                sb.append("\" to be an Integer, but it was not");
                String string = sb.toString();
                if (SurfaceRequestExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                    ViewPort.TuitionPaymentFragmentbindingInflater1(string);
                }
            }
        }
        return i3;
    }

    public static JSONObject TuitionPaymentFragmentspecialinlinedviewModeldefault1(ServerConfiguration serverConfiguration) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("serverId", serverConfiguration.d);
        return jSONObject;
    }

    public static JSONObject TuitionPaymentFragmentbindingInflater1(ServerConfiguration serverConfiguration) throws JSONException {
        UseCase useCase = serverConfiguration.asInterface;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("tapDuration", useCase.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
        jSONObject.put("dispersionRadius", useCase.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
        jSONObject.put("timespanDifference", useCase.b);
        jSONObject.put("minimumNumberOfTaps", useCase.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
        return jSONObject;
    }

    public static JSONObject b(ServerConfiguration serverConfiguration) throws JSONException {
        addStateChangeCallback addstatechangecallback = serverConfiguration.g;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("capture", addstatechangecallback.b);
        jSONObject.put("imageRetentionTimeInMinutes", addstatechangecallback.d);
        if (addstatechangecallback.TuitionPaymentFragmentspecialinlinedviewModeldefault3) {
            jSONObject.put("trafficControlPercentage", addstatechangecallback.g);
            jSONObject.put("crashesEnabled", addstatechangecallback.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
        }
        return jSONObject;
    }

    public static JSONObject TuitionPaymentFragmentspecialinlinedviewModeldefault2(ServerConfiguration serverConfiguration) throws JSONException {
        addStateChangeCallback addstatechangecallback = serverConfiguration.g;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("protocolVersion", addstatechangecallback.TuitionPaymentFragmentbindingInflater1);
        return jSONObject;
    }
}
