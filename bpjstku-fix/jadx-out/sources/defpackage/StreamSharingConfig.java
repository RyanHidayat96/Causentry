package defpackage;

import android.os.Process;
import com.mixpanel.android.mpmetrics.MixpanelAPI;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class StreamSharingConfig implements Thread.UncaughtExceptionHandler {
    private static StreamSharingConfig b;
    private final Thread.UncaughtExceptionHandler TuitionPaymentFragmentbindingInflater1 = Thread.getDefaultUncaughtExceptionHandler();

    public StreamSharingConfig() {
        Thread.setDefaultUncaughtExceptionHandler(this);
    }

    public static void b() {
        if (b == null) {
            synchronized (StreamSharingConfig.class) {
                if (b == null) {
                    b = new StreamSharingConfig();
                }
            }
        }
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public void uncaughtException(Thread thread, final Throwable th) {
        MixpanelAPI.TuitionPaymentFragmentspecialinlinedviewModeldefault3(new MixpanelAPI.TuitionPaymentFragmentbindingInflater1() { // from class: StreamSharingConfig.2
            @Override // com.mixpanel.android.mpmetrics.MixpanelAPI.TuitionPaymentFragmentbindingInflater1
            public final void TuitionPaymentFragmentspecialinlinedviewModeldefault2(MixpanelAPI mixpanelAPI) {
                if (mixpanelAPI.b.booleanValue()) {
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("$ae_crashed_reason", th.toString());
                        mixpanelAPI.TuitionPaymentFragmentbindingInflater1("$ae_crashed", jSONObject, true);
                    } catch (JSONException unused) {
                    }
                }
            }
        });
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.TuitionPaymentFragmentbindingInflater1;
        if (uncaughtExceptionHandler != null) {
            uncaughtExceptionHandler.uncaughtException(thread, th);
            return;
        }
        try {
            Thread.sleep(400L);
        } catch (InterruptedException e2) {
            e2.printStackTrace();
        }
        Process.killProcess(Process.myPid());
        System.exit(10);
    }
}
