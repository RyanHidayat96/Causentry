package defpackage;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Build;
import android.os.Environment;
import android.os.StatFs;
import android.support.v4.media.session.PlaybackStateCompat;
import android.view.Display;
import android.view.WindowManager;
import java.io.RandomAccessFile;
import java.util.Date;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes4.dex */
public class checkEglErrorOrThrow {
    String INotificationSideChannel;
    int INotificationSideChannelDefault;
    long INotificationSideChannelStubProxy;
    int RemoteActionCompatParcelizer;
    long TuitionPaymentFragmentbindingInflater1;
    String TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    String TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    String TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    String f351a;
    String asBinder;
    String asInterface;
    long b;
    String cancel;
    long cancelAll;
    long d;
    String g;
    double getInterfaceDescriptor;
    int notify;
    String onTransact;

    public checkEglErrorOrThrow(Context context) {
        try {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = Build.CPU_ABI;
            this.cancel = Build.VERSION.RELEASE;
            this.onTransact = Build.VERSION.SDK;
            this.f351a = Build.MODEL;
            this.g = Build.DEVICE;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = Build.BRAND;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = Build.BOARD;
            this.notify = Runtime.getRuntime().availableProcessors();
            int i = context.getResources().getConfiguration().orientation;
            if (i == 1) {
                this.asInterface = "Portrait";
            } else if (i == 2) {
                this.asInterface = "Landscape";
            } else if (i == 3) {
                this.asInterface = "Square";
            } else {
                this.asInterface = "Undefined";
            }
            Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
            this.INotificationSideChannelDefault = defaultDisplay.getWidth();
            this.RemoteActionCompatParcelizer = defaultDisplay.getHeight();
            this.getInterfaceDescriptor = TimeUnit.SECONDS.convert(TimeZone.getDefault().getOffset(new Date().getTime()), TimeUnit.MILLISECONDS) / 3600;
            this.INotificationSideChannel = context.getResources().getConfiguration().locale.toString();
            ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
            ((ActivityManager) context.getSystemService("activity")).getMemoryInfo(memoryInfo);
            this.TuitionPaymentFragmentbindingInflater1 = memoryInfo.availMem / PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED;
            Matcher matcher = Pattern.compile("^\\D*(\\d*).*$").matcher(TuitionPaymentFragmentbindingInflater1());
            matcher.find();
            this.cancelAll = Long.parseLong(matcher.group(1)) / 1024;
            StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
            this.d = (((long) statFs.getAvailableBlocks()) * ((long) statFs.getBlockSize())) / PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED;
        } catch (Exception e2) {
            e2.toString();
        }
    }

    private static String TuitionPaymentFragmentbindingInflater1() throws Throwable {
        Throwable th;
        RandomAccessFile randomAccessFile;
        try {
            randomAccessFile = new RandomAccessFile("/proc/meminfo", "r");
            try {
                String line = randomAccessFile.readLine();
                randomAccessFile.close();
                return line;
            } catch (Throwable th2) {
                th = th2;
                randomAccessFile.close();
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            randomAccessFile = null;
        }
    }

    public /* synthetic */ checkEglErrorOrThrow() {
    }
}
