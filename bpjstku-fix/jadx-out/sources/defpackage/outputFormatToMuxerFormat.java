package defpackage;

import android.app.ActivityManager;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Process;
import android.os.StatFs;
import android.provider.Settings;
import android.support.v4.media.session.PlaybackStateCompat;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.ThreadFactory;
import okio.ByteString;

/* JADX INFO: loaded from: classes4.dex */
public final class outputFormatToMuxerFormat {
    private static StringBuilder TuitionPaymentFragmentspecialinlinedviewModeldefault3 = new StringBuilder();
    private static final ByteString TuitionPaymentFragmentbindingInflater1 = ByteString.TuitionPaymentFragmentspecialinlinedviewModeldefault1("RIFF");
    private static final ByteString b = ByteString.TuitionPaymentFragmentspecialinlinedviewModeldefault1("WEBP");

    static int b(Bitmap bitmap) {
        int allocationByteCount = bitmap.getAllocationByteCount();
        if (allocationByteCount >= 0) {
            return allocationByteCount;
        }
        throw new IllegalStateException("Negative size: ".concat(String.valueOf(bitmap)));
    }

    static <T> T b(T t, String str) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(str);
    }

    static String TuitionPaymentFragmentspecialinlinedviewModeldefault2(ExperimentalAudioApi experimentalAudioApi) {
        return TuitionPaymentFragmentspecialinlinedviewModeldefault2(experimentalAudioApi, "");
    }

    static String TuitionPaymentFragmentspecialinlinedviewModeldefault2(ExperimentalAudioApi experimentalAudioApi, String str) {
        StringBuilder sb = new StringBuilder(str);
        findNearestHigherSupportedEncoderProfilesFor findnearesthighersupportedencoderprofilesfor = experimentalAudioApi.TuitionPaymentFragmentbindingInflater1;
        if (findnearesthighersupportedencoderprofilesfor != null) {
            sb.append(findnearesthighersupportedencoderprofilesfor.d.b());
        }
        List<findNearestHigherSupportedEncoderProfilesFor> list = experimentalAudioApi.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        if (list != null) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                if (i > 0 || findnearesthighersupportedencoderprofilesfor != null) {
                    sb.append(", ");
                }
                sb.append(list.get(i).d.b());
            }
        }
        return sb.toString();
    }

    public static void TuitionPaymentFragmentspecialinlinedviewModeldefault2(String str, String str2, String str3) {
        new Object[]{str, str2, str3, ""};
    }

    public static void TuitionPaymentFragmentspecialinlinedviewModeldefault3(String str, String str2, String str3, String str4) {
        new Object[]{str, str2, str3, str4};
    }

    public static String TuitionPaymentFragmentspecialinlinedviewModeldefault2(FileDescriptorOutputOptionsFileDescriptorOutputOptionsInternalBuilder fileDescriptorOutputOptionsFileDescriptorOutputOptionsInternalBuilder) {
        StringBuilder sb = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        if (fileDescriptorOutputOptionsFileDescriptorOutputOptionsInternalBuilder.cancelAll != null) {
            sb.ensureCapacity(fileDescriptorOutputOptionsFileDescriptorOutputOptionsInternalBuilder.cancelAll.length() + 50);
            sb.append(fileDescriptorOutputOptionsFileDescriptorOutputOptionsInternalBuilder.cancelAll);
        } else if (fileDescriptorOutputOptionsFileDescriptorOutputOptionsInternalBuilder.INotificationSideChannelDefault != null) {
            String string = fileDescriptorOutputOptionsFileDescriptorOutputOptionsInternalBuilder.INotificationSideChannelDefault.toString();
            sb.ensureCapacity(string.length() + 50);
            sb.append(string);
        } else {
            sb.ensureCapacity(50);
            sb.append(fileDescriptorOutputOptionsFileDescriptorOutputOptionsInternalBuilder.cancel);
        }
        sb.append('\n');
        if (fileDescriptorOutputOptionsFileDescriptorOutputOptionsInternalBuilder.INotificationSideChannel != 0.0f) {
            sb.append("rotation:");
            sb.append(fileDescriptorOutputOptionsFileDescriptorOutputOptionsInternalBuilder.INotificationSideChannel);
            if (fileDescriptorOutputOptionsFileDescriptorOutputOptionsInternalBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
                sb.append('@');
                sb.append(fileDescriptorOutputOptionsFileDescriptorOutputOptionsInternalBuilder.onTransact);
                sb.append('x');
                sb.append(fileDescriptorOutputOptionsFileDescriptorOutputOptionsInternalBuilder.notify);
            }
            sb.append('\n');
        }
        if (fileDescriptorOutputOptionsFileDescriptorOutputOptionsInternalBuilder.RemoteActionCompatParcelizer != 0 || fileDescriptorOutputOptionsFileDescriptorOutputOptionsInternalBuilder.getInterfaceDescriptor != 0) {
            sb.append("resize:");
            sb.append(fileDescriptorOutputOptionsFileDescriptorOutputOptionsInternalBuilder.RemoteActionCompatParcelizer);
            sb.append('x');
            sb.append(fileDescriptorOutputOptionsFileDescriptorOutputOptionsInternalBuilder.getInterfaceDescriptor);
            sb.append('\n');
        }
        if (fileDescriptorOutputOptionsFileDescriptorOutputOptionsInternalBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3) {
            sb.append("centerCrop:");
            sb.append(fileDescriptorOutputOptionsFileDescriptorOutputOptionsInternalBuilder.b);
            sb.append('\n');
        } else if (fileDescriptorOutputOptionsFileDescriptorOutputOptionsInternalBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
            sb.append("centerInside\n");
        }
        if (fileDescriptorOutputOptionsFileDescriptorOutputOptionsInternalBuilder.INotificationSideChannelStubProxy != null) {
            int size = fileDescriptorOutputOptionsFileDescriptorOutputOptionsInternalBuilder.INotificationSideChannelStubProxy.size();
            for (int i = 0; i < size; i++) {
                sb.append(fileDescriptorOutputOptionsFileDescriptorOutputOptionsInternalBuilder.INotificationSideChannelStubProxy.get(i).TuitionPaymentFragmentspecialinlinedviewModeldefault2());
                sb.append('\n');
            }
        }
        String string2 = sb.toString();
        sb.setLength(0);
        return string2;
    }

    static File TuitionPaymentFragmentspecialinlinedviewModeldefault2(Context context) {
        File file = new File(context.getApplicationContext().getCacheDir(), "picasso-cache");
        if (!file.exists()) {
            file.mkdirs();
        }
        return file;
    }

    static long TuitionPaymentFragmentspecialinlinedviewModeldefault3(File file) {
        long blockCountLong;
        try {
            StatFs statFs = new StatFs(file.getAbsolutePath());
            blockCountLong = (statFs.getBlockCountLong() * statFs.getBlockSizeLong()) / 50;
        } catch (IllegalArgumentException unused) {
            blockCountLong = 5242880;
        }
        return Math.max(Math.min(blockCountLong, 52428800L), 5242880L);
    }

    static int b(Context context) {
        ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
        return (int) ((((long) ((context.getApplicationInfo().flags & 1048576) != 0 ? activityManager.getLargeMemoryClass() : activityManager.getMemoryClass())) * PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED) / 7);
    }

    static boolean TuitionPaymentFragmentspecialinlinedviewModeldefault3(Context context) {
        try {
            return Settings.Global.getInt(context.getContentResolver(), "airplane_mode_on", 0) != 0;
        } catch (NullPointerException | SecurityException unused) {
        }
    }

    static <T> T TuitionPaymentFragmentbindingInflater1(Context context, String str) {
        return (T) context.getSystemService(str);
    }

    static boolean b(Context context, String str) {
        return context.checkCallingOrSelfPermission(str) == 0;
    }

    static boolean TuitionPaymentFragmentspecialinlinedviewModeldefault3(RotationProvider1 rotationProvider1) throws IOException {
        return rotationProvider1.TuitionPaymentFragmentspecialinlinedviewModeldefault2(0L, TuitionPaymentFragmentbindingInflater1) && rotationProvider1.TuitionPaymentFragmentspecialinlinedviewModeldefault2(8L, b);
    }

    static int TuitionPaymentFragmentspecialinlinedviewModeldefault1(Resources resources, FileDescriptorOutputOptionsFileDescriptorOutputOptionsInternalBuilder fileDescriptorOutputOptionsFileDescriptorOutputOptionsInternalBuilder) throws FileNotFoundException {
        if (fileDescriptorOutputOptionsFileDescriptorOutputOptionsInternalBuilder.cancel != 0 || fileDescriptorOutputOptionsFileDescriptorOutputOptionsInternalBuilder.INotificationSideChannelDefault == null) {
            return fileDescriptorOutputOptionsFileDescriptorOutputOptionsInternalBuilder.cancel;
        }
        String authority = fileDescriptorOutputOptionsFileDescriptorOutputOptionsInternalBuilder.INotificationSideChannelDefault.getAuthority();
        if (authority == null) {
            StringBuilder sb = new StringBuilder("No package provided: ");
            sb.append(fileDescriptorOutputOptionsFileDescriptorOutputOptionsInternalBuilder.INotificationSideChannelDefault);
            throw new FileNotFoundException(sb.toString());
        }
        List<String> pathSegments = fileDescriptorOutputOptionsFileDescriptorOutputOptionsInternalBuilder.INotificationSideChannelDefault.getPathSegments();
        if (pathSegments == null || pathSegments.isEmpty()) {
            StringBuilder sb2 = new StringBuilder("No path segments: ");
            sb2.append(fileDescriptorOutputOptionsFileDescriptorOutputOptionsInternalBuilder.INotificationSideChannelDefault);
            throw new FileNotFoundException(sb2.toString());
        }
        if (pathSegments.size() == 1) {
            try {
                return Integer.parseInt(pathSegments.get(0));
            } catch (NumberFormatException unused) {
                StringBuilder sb3 = new StringBuilder("Last path segment is not a resource ID: ");
                sb3.append(fileDescriptorOutputOptionsFileDescriptorOutputOptionsInternalBuilder.INotificationSideChannelDefault);
                throw new FileNotFoundException(sb3.toString());
            }
        }
        if (pathSegments.size() == 2) {
            return resources.getIdentifier(pathSegments.get(1), pathSegments.get(0), authority);
        }
        StringBuilder sb4 = new StringBuilder("More than two path segments: ");
        sb4.append(fileDescriptorOutputOptionsFileDescriptorOutputOptionsInternalBuilder.INotificationSideChannelDefault);
        throw new FileNotFoundException(sb4.toString());
    }

    static Resources b(Context context, FileDescriptorOutputOptionsFileDescriptorOutputOptionsInternalBuilder fileDescriptorOutputOptionsFileDescriptorOutputOptionsInternalBuilder) throws FileNotFoundException {
        if (fileDescriptorOutputOptionsFileDescriptorOutputOptionsInternalBuilder.cancel != 0 || fileDescriptorOutputOptionsFileDescriptorOutputOptionsInternalBuilder.INotificationSideChannelDefault == null) {
            return context.getResources();
        }
        String authority = fileDescriptorOutputOptionsFileDescriptorOutputOptionsInternalBuilder.INotificationSideChannelDefault.getAuthority();
        if (authority == null) {
            StringBuilder sb = new StringBuilder("No package provided: ");
            sb.append(fileDescriptorOutputOptionsFileDescriptorOutputOptionsInternalBuilder.INotificationSideChannelDefault);
            throw new FileNotFoundException(sb.toString());
        }
        try {
            return context.getPackageManager().getResourcesForApplication(authority);
        } catch (PackageManager.NameNotFoundException unused) {
            StringBuilder sb2 = new StringBuilder("Unable to obtain resources for package: ");
            sb2.append(fileDescriptorOutputOptionsFileDescriptorOutputOptionsInternalBuilder.INotificationSideChannelDefault);
            throw new FileNotFoundException(sb2.toString());
        }
    }

    static void b(Looper looper) {
        Handler handler = new Handler(looper) { // from class: outputFormatToMuxerFormat.1
            @Override // android.os.Handler
            public final void handleMessage(Message message) {
                sendMessageDelayed(obtainMessage(), 1000L);
            }
        };
        handler.sendMessageDelayed(handler.obtainMessage(), 1000L);
    }

    static class TuitionPaymentFragmentbindingInflater1 implements ThreadFactory {
        TuitionPaymentFragmentbindingInflater1() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public final Thread newThread(Runnable runnable) {
            return new TuitionPaymentFragmentspecialinlinedviewModeldefault1(runnable);
        }
    }

    /* JADX INFO: loaded from: classes5.dex */
    static class TuitionPaymentFragmentspecialinlinedviewModeldefault1 extends Thread {
        TuitionPaymentFragmentspecialinlinedviewModeldefault1(Runnable runnable) {
            super(runnable);
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public final void run() {
            Process.setThreadPriority(10);
            super.run();
        }
    }

    public static void TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
            throw new IllegalStateException("Method call should happen from the main thread.");
        }
    }
}
