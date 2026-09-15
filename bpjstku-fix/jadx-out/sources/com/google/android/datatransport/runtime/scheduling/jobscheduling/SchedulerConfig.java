package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.app.job.JobInfo;
import android.os.SystemClock;
import com.google.android.datatransport.Priority;
import defpackage.CameraConfigs;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public abstract class SchedulerConfig {

    public enum Flag {
        NETWORK_UNMETERED,
        DEVICE_IDLE,
        DEVICE_CHARGING
    }

    public static abstract class TuitionPaymentFragmentspecialinlinedviewModeldefault2 {

        public static abstract class TuitionPaymentFragmentbindingInflater1 {
            public abstract TuitionPaymentFragmentbindingInflater1 TuitionPaymentFragmentbindingInflater1();

            public abstract TuitionPaymentFragmentbindingInflater1 TuitionPaymentFragmentspecialinlinedviewModeldefault2(long j);

            public abstract TuitionPaymentFragmentbindingInflater1 TuitionPaymentFragmentspecialinlinedviewModeldefault3(Set<Flag> set);

            public abstract TuitionPaymentFragmentspecialinlinedviewModeldefault2 b();
        }

        public abstract Set<Flag> TuitionPaymentFragmentspecialinlinedviewModeldefault1();

        public abstract long TuitionPaymentFragmentspecialinlinedviewModeldefault2();

        public abstract long b();
    }

    public abstract Map<Priority, TuitionPaymentFragmentspecialinlinedviewModeldefault2> TuitionPaymentFragmentbindingInflater1();

    public abstract CameraConfigs TuitionPaymentFragmentspecialinlinedviewModeldefault3();

    public static class TuitionPaymentFragmentspecialinlinedviewModeldefault3 {
        public static int TuitionPaymentFragmentbindingInflater1;
        public static int b;
        public CameraConfigs TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        public Map<Priority, TuitionPaymentFragmentspecialinlinedviewModeldefault2> TuitionPaymentFragmentspecialinlinedviewModeldefault2 = new HashMap();

        public static int TuitionPaymentFragmentbindingInflater1() {
            int i = TuitionPaymentFragmentbindingInflater1;
            int i2 = i % 6704354;
            TuitionPaymentFragmentbindingInflater1 = i + 1;
            if (i2 != 0) {
                return b;
            }
            int iUptimeMillis = (int) SystemClock.uptimeMillis();
            b = iUptimeMillis;
            return iUptimeMillis;
        }
    }

    public final long TuitionPaymentFragmentspecialinlinedviewModeldefault2(Priority priority, long j, int i) {
        long jTuitionPaymentFragmentspecialinlinedviewModeldefault1 = TuitionPaymentFragmentspecialinlinedviewModeldefault3().TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 tuitionPaymentFragmentspecialinlinedviewModeldefault2 = TuitionPaymentFragmentbindingInflater1().get(priority);
        return Math.min(Math.max(TuitionPaymentFragmentspecialinlinedviewModeldefault2(i, tuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault2()), j - jTuitionPaymentFragmentspecialinlinedviewModeldefault1), tuitionPaymentFragmentspecialinlinedviewModeldefault2.b());
    }

    private static long TuitionPaymentFragmentspecialinlinedviewModeldefault2(int i, long j) {
        int i2 = i - 1;
        return (long) (Math.pow(3.0d, i2) * j * Math.max(1.0d, Math.log(10000.0d) / Math.log((j > 1 ? j : 2L) * ((long) i2))));
    }

    public final JobInfo.Builder TuitionPaymentFragmentbindingInflater1(JobInfo.Builder builder, Priority priority, long j, int i) {
        builder.setMinimumLatency(TuitionPaymentFragmentspecialinlinedviewModeldefault2(priority, j, i));
        TuitionPaymentFragmentspecialinlinedviewModeldefault1(builder, TuitionPaymentFragmentbindingInflater1().get(priority).TuitionPaymentFragmentspecialinlinedviewModeldefault1());
        return builder;
    }

    private static void TuitionPaymentFragmentspecialinlinedviewModeldefault1(JobInfo.Builder builder, Set<Flag> set) {
        if (set.contains(Flag.NETWORK_UNMETERED)) {
            builder.setRequiredNetworkType(2);
        } else {
            builder.setRequiredNetworkType(1);
        }
        if (set.contains(Flag.DEVICE_CHARGING)) {
            builder.setRequiresCharging(true);
        }
        if (set.contains(Flag.DEVICE_IDLE)) {
            builder.setRequiresDeviceIdle(true);
        }
    }
}
