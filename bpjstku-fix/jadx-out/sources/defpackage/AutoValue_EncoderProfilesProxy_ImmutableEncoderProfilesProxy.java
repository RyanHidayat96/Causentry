package defpackage;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.os.PersistableBundle;
import android.util.Base64;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.zip.Adler32;
import org.apache.commons.codec.binary.Hex;

/* JADX INFO: loaded from: classes3.dex */
public final class AutoValue_EncoderProfilesProxy_ImmutableEncoderProfilesProxy implements getExpectedFrameRateRange {
    private final AutoValue_StreamSpec1 TuitionPaymentFragmentbindingInflater1;
    private final Context TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    private final SchedulerConfig TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    public AutoValue_EncoderProfilesProxy_ImmutableEncoderProfilesProxy(Context context, AutoValue_StreamSpec1 autoValue_StreamSpec1, SchedulerConfig schedulerConfig) {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = context;
        this.TuitionPaymentFragmentbindingInflater1 = autoValue_StreamSpec1;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = schedulerConfig;
    }

    private int TuitionPaymentFragmentspecialinlinedviewModeldefault1(retryRequest retryrequest) {
        Adler32 adler32 = new Adler32();
        adler32.update(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getPackageName().getBytes(Charset.forName(Hex.DEFAULT_CHARSET_NAME)));
        adler32.update(retryrequest.TuitionPaymentFragmentspecialinlinedviewModeldefault2().getBytes(Charset.forName(Hex.DEFAULT_CHARSET_NAME)));
        adler32.update(ByteBuffer.allocate(4).putInt(getImplementation.TuitionPaymentFragmentspecialinlinedviewModeldefault3(retryrequest.TuitionPaymentFragmentspecialinlinedviewModeldefault3())).array());
        if (retryrequest.TuitionPaymentFragmentspecialinlinedviewModeldefault1() != null) {
            adler32.update(retryrequest.TuitionPaymentFragmentspecialinlinedviewModeldefault1());
        }
        return (int) adler32.getValue();
    }

    private static boolean TuitionPaymentFragmentspecialinlinedviewModeldefault1(JobScheduler jobScheduler, int i, int i2) {
        for (JobInfo jobInfo : jobScheduler.getAllPendingJobs()) {
            int i3 = jobInfo.getExtras().getInt("attemptNumber");
            if (jobInfo.getId() == i) {
                return i3 >= i2;
            }
        }
        return false;
    }

    @Override // defpackage.getExpectedFrameRateRange
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault2(retryRequest retryrequest, int i) {
        TuitionPaymentFragmentspecialinlinedviewModeldefault2(retryrequest, i, false);
    }

    @Override // defpackage.getExpectedFrameRateRange
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault2(retryRequest retryrequest, int i, boolean z) {
        ComponentName componentName = new ComponentName(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, (Class<?>) JobInfoSchedulerService.class);
        JobScheduler jobScheduler = (JobScheduler) this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getSystemService("jobscheduler");
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault1 = TuitionPaymentFragmentspecialinlinedviewModeldefault1(retryrequest);
        if (!z && TuitionPaymentFragmentspecialinlinedviewModeldefault1(jobScheduler, iTuitionPaymentFragmentspecialinlinedviewModeldefault1, i)) {
            sdkVersion.TuitionPaymentFragmentbindingInflater1("JobInfoScheduler", retryrequest);
            return;
        }
        long jTuitionPaymentFragmentbindingInflater1 = this.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentbindingInflater1(retryrequest);
        JobInfo.Builder builderTuitionPaymentFragmentbindingInflater1 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentbindingInflater1(new JobInfo.Builder(iTuitionPaymentFragmentspecialinlinedviewModeldefault1, componentName), retryrequest.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), jTuitionPaymentFragmentbindingInflater1, i);
        PersistableBundle persistableBundle = new PersistableBundle();
        persistableBundle.putInt("attemptNumber", i);
        persistableBundle.putString("backendName", retryrequest.TuitionPaymentFragmentspecialinlinedviewModeldefault2());
        persistableBundle.putInt("priority", getImplementation.TuitionPaymentFragmentspecialinlinedviewModeldefault3(retryrequest.TuitionPaymentFragmentspecialinlinedviewModeldefault3()));
        if (retryrequest.TuitionPaymentFragmentspecialinlinedviewModeldefault1() != null) {
            persistableBundle.putString("extras", Base64.encodeToString(retryrequest.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), 0));
        }
        builderTuitionPaymentFragmentbindingInflater1.setExtras(persistableBundle);
        new Object[]{retryrequest, Integer.valueOf(iTuitionPaymentFragmentspecialinlinedviewModeldefault1), Long.valueOf(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault2(retryrequest.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), jTuitionPaymentFragmentbindingInflater1, i)), Long.valueOf(jTuitionPaymentFragmentbindingInflater1), Integer.valueOf(i)};
        jobScheduler.schedule(builderTuitionPaymentFragmentbindingInflater1.build());
    }
}
