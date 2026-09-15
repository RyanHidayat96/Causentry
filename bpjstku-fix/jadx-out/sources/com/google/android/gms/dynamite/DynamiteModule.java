package com.google.android.gms.dynamite;

import android.content.ContentProviderClient;
import android.content.Context;
import android.content.pm.ComponentInfo;
import android.content.pm.PackageItemInfo;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.net.Uri;
import android.os.Build;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.os.SystemClock;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.CrashUtils;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.firebase.analytics.FirebaseAnalytics;
import dalvik.system.DelegateLastClassLoader;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes3.dex */
public final class DynamiteModule {
    public static final int LOCAL = -1;
    public static final int NONE = 0;
    public static final int NO_SELECTION = 0;
    public static final int REMOTE = 1;
    private static Boolean zzb = null;
    private static String zzc = null;
    private static boolean zzd = false;
    private static int zze = -1;
    private static Boolean zzf;
    private static zzp zzk;
    private static zzq zzl;
    private final Context zzj;
    private static final ThreadLocal zzg = new ThreadLocal();
    private static final ThreadLocal zzh = new zzd();
    private static final VersionPolicy.IVersions zzi = new zze();
    public static final VersionPolicy PREFER_REMOTE = new zzf();
    public static final VersionPolicy PREFER_LOCAL = new zzg();
    public static final VersionPolicy PREFER_REMOTE_VERSION_NO_FORCE_STAGING = new zzh();
    public static final VersionPolicy PREFER_HIGHEST_OR_LOCAL_VERSION = new zzi();
    public static final VersionPolicy PREFER_HIGHEST_OR_LOCAL_VERSION_NO_FORCE_STAGING = new zzj();
    public static final VersionPolicy PREFER_HIGHEST_OR_REMOTE_VERSION = new zzk();
    public static final VersionPolicy zza = new zzl();

    public static class DynamiteLoaderClassLoader {
        public static ClassLoader sClassLoader;
    }

    public static class LoadingException extends Exception {
        /* synthetic */ LoadingException(String str, zzo zzoVar) {
            super(str);
        }

        /* synthetic */ LoadingException(String str, Throwable th, zzo zzoVar) {
            super(str, th);
        }
    }

    public interface VersionPolicy {

        public interface IVersions {
            int zza(Context context, String str);

            int zzb(Context context, String str, boolean z) throws LoadingException;
        }

        public static class SelectionResult {
            public int localVersion = 0;
            public int remoteVersion = 0;
            public int selection = 0;
        }

        SelectionResult selectModule(Context context, String str, IVersions iVersions) throws LoadingException;
    }

    private DynamiteModule(Context context) {
        Preconditions.checkNotNull(context);
        this.zzj = context;
    }

    public static int getLocalVersion(Context context, String str) {
        try {
            ClassLoader classLoader = context.getApplicationContext().getClassLoader();
            StringBuilder sb = new StringBuilder("com.google.android.gms.dynamite.descriptors.");
            sb.append(str);
            sb.append(".ModuleDescriptor");
            Class<?> clsLoadClass = classLoader.loadClass(sb.toString());
            Field declaredField = clsLoadClass.getDeclaredField("MODULE_ID");
            Field declaredField2 = clsLoadClass.getDeclaredField("MODULE_VERSION");
            if (Objects.equal(declaredField.get(null), str)) {
                return declaredField2.getInt(null);
            }
            String.valueOf(declaredField.get(null));
            return 0;
        } catch (ClassNotFoundException unused) {
            return 0;
        } catch (Exception e2) {
            e2.getMessage();
            return 0;
        }
    }

    public static int getRemoteVersion(Context context, String str) {
        return zza(context, str, false);
    }

    /* JADX WARN: Code duplicated, block: B:110:0x018f  */
    /* JADX WARN: Code duplicated, block: B:111:0x0195  */
    /* JADX WARN: Code duplicated, block: B:114:0x01a2  */
    /* JADX WARN: Code duplicated, block: B:119:0x01b3 A[Catch: all -> 0x01f4, TryCatch #3 {all -> 0x01f4, blocks: (B:5:0x0029, B:9:0x0045, B:14:0x004d, B:17:0x0053, B:20:0x005d, B:94:0x0158, B:95:0x0162, B:97:0x0164, B:99:0x0166, B:100:0x016d, B:119:0x01b3, B:120:0x01c6, B:102:0x016f, B:104:0x0176, B:106:0x0185, B:117:0x01ab, B:118:0x01b2, B:121:0x01c7, B:122:0x01f3), top: B:139:0x0029, inners: #1 }] */
    /* JADX WARN: Code duplicated, block: B:135:0x0077 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:137:0x005d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:138:0x0062 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:17:0x0053 A[Catch: all -> 0x01f4, TRY_LEAVE, TryCatch #3 {all -> 0x01f4, blocks: (B:5:0x0029, B:9:0x0045, B:14:0x004d, B:17:0x0053, B:20:0x005d, B:94:0x0158, B:95:0x0162, B:97:0x0164, B:99:0x0166, B:100:0x016d, B:119:0x01b3, B:120:0x01c6, B:102:0x016f, B:104:0x0176, B:106:0x0185, B:117:0x01ab, B:118:0x01b2, B:121:0x01c7, B:122:0x01f3), top: B:139:0x0029, inners: #1 }] */
    /* JADX WARN: Code duplicated, block: B:19:0x005b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:25:0x0068 A[Catch: all -> 0x0154, TRY_LEAVE, TryCatch #2 {, blocks: (B:23:0x0062, B:25:0x0068, B:88:0x014c, B:89:0x0153), top: B:138:0x0062 }] */
    /* JADX WARN: Code duplicated, block: B:28:0x006d A[Catch: all -> 0x0157, LoadingException -> 0x0163, RemoteException -> 0x0165, TRY_ENTER, TryCatch #7 {RemoteException -> 0x0165, LoadingException -> 0x0163, all -> 0x0157, blocks: (B:22:0x0061, B:28:0x006d, B:31:0x0076, B:35:0x007c, B:37:0x0084, B:39:0x0088, B:40:0x0093, B:47:0x009e, B:49:0x00b7, B:51:0x00bf, B:52:0x00c5, B:53:0x00cc, B:48:0x00ab, B:57:0x00d0, B:58:0x00d1, B:59:0x00d8, B:60:0x00d9, B:61:0x00e0, B:65:0x00e4, B:66:0x00e5, B:68:0x00eb, B:70:0x00f2, B:72:0x00fa, B:78:0x0124, B:80:0x012a, B:82:0x0134, B:83:0x013b, B:73:0x0109, B:74:0x0110, B:76:0x0113, B:77:0x011c, B:84:0x013c, B:85:0x0143, B:86:0x0144, B:87:0x014b, B:92:0x0156), top: B:142:0x0061 }] */
    /* JADX WARN: Code duplicated, block: B:30:0x0074  */
    /* JADX WARN: Code duplicated, block: B:35:0x007c A[Catch: all -> 0x0157, LoadingException -> 0x0163, RemoteException -> 0x0165, TRY_ENTER, TryCatch #7 {RemoteException -> 0x0165, LoadingException -> 0x0163, all -> 0x0157, blocks: (B:22:0x0061, B:28:0x006d, B:31:0x0076, B:35:0x007c, B:37:0x0084, B:39:0x0088, B:40:0x0093, B:47:0x009e, B:49:0x00b7, B:51:0x00bf, B:52:0x00c5, B:53:0x00cc, B:48:0x00ab, B:57:0x00d0, B:58:0x00d1, B:59:0x00d8, B:60:0x00d9, B:61:0x00e0, B:65:0x00e4, B:66:0x00e5, B:68:0x00eb, B:70:0x00f2, B:72:0x00fa, B:78:0x0124, B:80:0x012a, B:82:0x0134, B:83:0x013b, B:73:0x0109, B:74:0x0110, B:76:0x0113, B:77:0x011c, B:84:0x013c, B:85:0x0143, B:86:0x0144, B:87:0x014b, B:92:0x0156), top: B:142:0x0061 }] */
    /* JADX WARN: Code duplicated, block: B:60:0x00d9 A[Catch: all -> 0x0157, LoadingException -> 0x0163, RemoteException -> 0x0165, TryCatch #7 {RemoteException -> 0x0165, LoadingException -> 0x0163, all -> 0x0157, blocks: (B:22:0x0061, B:28:0x006d, B:31:0x0076, B:35:0x007c, B:37:0x0084, B:39:0x0088, B:40:0x0093, B:47:0x009e, B:49:0x00b7, B:51:0x00bf, B:52:0x00c5, B:53:0x00cc, B:48:0x00ab, B:57:0x00d0, B:58:0x00d1, B:59:0x00d8, B:60:0x00d9, B:61:0x00e0, B:65:0x00e4, B:66:0x00e5, B:68:0x00eb, B:70:0x00f2, B:72:0x00fa, B:78:0x0124, B:80:0x012a, B:82:0x0134, B:83:0x013b, B:73:0x0109, B:74:0x0110, B:76:0x0113, B:77:0x011c, B:84:0x013c, B:85:0x0143, B:86:0x0144, B:87:0x014b, B:92:0x0156), top: B:142:0x0061 }] */
    /* JADX WARN: Code duplicated, block: B:66:0x00e5 A[Catch: all -> 0x0157, LoadingException -> 0x0163, RemoteException -> 0x0165, TryCatch #7 {RemoteException -> 0x0165, LoadingException -> 0x0163, all -> 0x0157, blocks: (B:22:0x0061, B:28:0x006d, B:31:0x0076, B:35:0x007c, B:37:0x0084, B:39:0x0088, B:40:0x0093, B:47:0x009e, B:49:0x00b7, B:51:0x00bf, B:52:0x00c5, B:53:0x00cc, B:48:0x00ab, B:57:0x00d0, B:58:0x00d1, B:59:0x00d8, B:60:0x00d9, B:61:0x00e0, B:65:0x00e4, B:66:0x00e5, B:68:0x00eb, B:70:0x00f2, B:72:0x00fa, B:78:0x0124, B:80:0x012a, B:82:0x0134, B:83:0x013b, B:73:0x0109, B:74:0x0110, B:76:0x0113, B:77:0x011c, B:84:0x013c, B:85:0x0143, B:86:0x0144, B:87:0x014b, B:92:0x0156), top: B:142:0x0061 }] */
    /* JADX WARN: Code duplicated, block: B:68:0x00eb A[Catch: all -> 0x0157, LoadingException -> 0x0163, RemoteException -> 0x0165, TryCatch #7 {RemoteException -> 0x0165, LoadingException -> 0x0163, all -> 0x0157, blocks: (B:22:0x0061, B:28:0x006d, B:31:0x0076, B:35:0x007c, B:37:0x0084, B:39:0x0088, B:40:0x0093, B:47:0x009e, B:49:0x00b7, B:51:0x00bf, B:52:0x00c5, B:53:0x00cc, B:48:0x00ab, B:57:0x00d0, B:58:0x00d1, B:59:0x00d8, B:60:0x00d9, B:61:0x00e0, B:65:0x00e4, B:66:0x00e5, B:68:0x00eb, B:70:0x00f2, B:72:0x00fa, B:78:0x0124, B:80:0x012a, B:82:0x0134, B:83:0x013b, B:73:0x0109, B:74:0x0110, B:76:0x0113, B:77:0x011c, B:84:0x013c, B:85:0x0143, B:86:0x0144, B:87:0x014b, B:92:0x0156), top: B:142:0x0061 }] */
    /* JADX WARN: Code duplicated, block: B:70:0x00f2 A[Catch: all -> 0x0157, LoadingException -> 0x0163, RemoteException -> 0x0165, TryCatch #7 {RemoteException -> 0x0165, LoadingException -> 0x0163, all -> 0x0157, blocks: (B:22:0x0061, B:28:0x006d, B:31:0x0076, B:35:0x007c, B:37:0x0084, B:39:0x0088, B:40:0x0093, B:47:0x009e, B:49:0x00b7, B:51:0x00bf, B:52:0x00c5, B:53:0x00cc, B:48:0x00ab, B:57:0x00d0, B:58:0x00d1, B:59:0x00d8, B:60:0x00d9, B:61:0x00e0, B:65:0x00e4, B:66:0x00e5, B:68:0x00eb, B:70:0x00f2, B:72:0x00fa, B:78:0x0124, B:80:0x012a, B:82:0x0134, B:83:0x013b, B:73:0x0109, B:74:0x0110, B:76:0x0113, B:77:0x011c, B:84:0x013c, B:85:0x0143, B:86:0x0144, B:87:0x014b, B:92:0x0156), top: B:142:0x0061 }] */
    /* JADX WARN: Code duplicated, block: B:72:0x00fa A[Catch: all -> 0x0157, LoadingException -> 0x0163, RemoteException -> 0x0165, TryCatch #7 {RemoteException -> 0x0165, LoadingException -> 0x0163, all -> 0x0157, blocks: (B:22:0x0061, B:28:0x006d, B:31:0x0076, B:35:0x007c, B:37:0x0084, B:39:0x0088, B:40:0x0093, B:47:0x009e, B:49:0x00b7, B:51:0x00bf, B:52:0x00c5, B:53:0x00cc, B:48:0x00ab, B:57:0x00d0, B:58:0x00d1, B:59:0x00d8, B:60:0x00d9, B:61:0x00e0, B:65:0x00e4, B:66:0x00e5, B:68:0x00eb, B:70:0x00f2, B:72:0x00fa, B:78:0x0124, B:80:0x012a, B:82:0x0134, B:83:0x013b, B:73:0x0109, B:74:0x0110, B:76:0x0113, B:77:0x011c, B:84:0x013c, B:85:0x0143, B:86:0x0144, B:87:0x014b, B:92:0x0156), top: B:142:0x0061 }] */
    /* JADX WARN: Code duplicated, block: B:73:0x0109 A[Catch: all -> 0x0157, LoadingException -> 0x0163, RemoteException -> 0x0165, TryCatch #7 {RemoteException -> 0x0165, LoadingException -> 0x0163, all -> 0x0157, blocks: (B:22:0x0061, B:28:0x006d, B:31:0x0076, B:35:0x007c, B:37:0x0084, B:39:0x0088, B:40:0x0093, B:47:0x009e, B:49:0x00b7, B:51:0x00bf, B:52:0x00c5, B:53:0x00cc, B:48:0x00ab, B:57:0x00d0, B:58:0x00d1, B:59:0x00d8, B:60:0x00d9, B:61:0x00e0, B:65:0x00e4, B:66:0x00e5, B:68:0x00eb, B:70:0x00f2, B:72:0x00fa, B:78:0x0124, B:80:0x012a, B:82:0x0134, B:83:0x013b, B:73:0x0109, B:74:0x0110, B:76:0x0113, B:77:0x011c, B:84:0x013c, B:85:0x0143, B:86:0x0144, B:87:0x014b, B:92:0x0156), top: B:142:0x0061 }] */
    /* JADX WARN: Code duplicated, block: B:75:0x0111 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:76:0x0113 A[Catch: all -> 0x0157, LoadingException -> 0x0163, RemoteException -> 0x0165, TryCatch #7 {RemoteException -> 0x0165, LoadingException -> 0x0163, all -> 0x0157, blocks: (B:22:0x0061, B:28:0x006d, B:31:0x0076, B:35:0x007c, B:37:0x0084, B:39:0x0088, B:40:0x0093, B:47:0x009e, B:49:0x00b7, B:51:0x00bf, B:52:0x00c5, B:53:0x00cc, B:48:0x00ab, B:57:0x00d0, B:58:0x00d1, B:59:0x00d8, B:60:0x00d9, B:61:0x00e0, B:65:0x00e4, B:66:0x00e5, B:68:0x00eb, B:70:0x00f2, B:72:0x00fa, B:78:0x0124, B:80:0x012a, B:82:0x0134, B:83:0x013b, B:73:0x0109, B:74:0x0110, B:76:0x0113, B:77:0x011c, B:84:0x013c, B:85:0x0143, B:86:0x0144, B:87:0x014b, B:92:0x0156), top: B:142:0x0061 }] */
    /* JADX WARN: Code duplicated, block: B:77:0x011c A[Catch: all -> 0x0157, LoadingException -> 0x0163, RemoteException -> 0x0165, TryCatch #7 {RemoteException -> 0x0165, LoadingException -> 0x0163, all -> 0x0157, blocks: (B:22:0x0061, B:28:0x006d, B:31:0x0076, B:35:0x007c, B:37:0x0084, B:39:0x0088, B:40:0x0093, B:47:0x009e, B:49:0x00b7, B:51:0x00bf, B:52:0x00c5, B:53:0x00cc, B:48:0x00ab, B:57:0x00d0, B:58:0x00d1, B:59:0x00d8, B:60:0x00d9, B:61:0x00e0, B:65:0x00e4, B:66:0x00e5, B:68:0x00eb, B:70:0x00f2, B:72:0x00fa, B:78:0x0124, B:80:0x012a, B:82:0x0134, B:83:0x013b, B:73:0x0109, B:74:0x0110, B:76:0x0113, B:77:0x011c, B:84:0x013c, B:85:0x0143, B:86:0x0144, B:87:0x014b, B:92:0x0156), top: B:142:0x0061 }] */
    /* JADX WARN: Code duplicated, block: B:80:0x012a A[Catch: all -> 0x0157, LoadingException -> 0x0163, RemoteException -> 0x0165, TryCatch #7 {RemoteException -> 0x0165, LoadingException -> 0x0163, all -> 0x0157, blocks: (B:22:0x0061, B:28:0x006d, B:31:0x0076, B:35:0x007c, B:37:0x0084, B:39:0x0088, B:40:0x0093, B:47:0x009e, B:49:0x00b7, B:51:0x00bf, B:52:0x00c5, B:53:0x00cc, B:48:0x00ab, B:57:0x00d0, B:58:0x00d1, B:59:0x00d8, B:60:0x00d9, B:61:0x00e0, B:65:0x00e4, B:66:0x00e5, B:68:0x00eb, B:70:0x00f2, B:72:0x00fa, B:78:0x0124, B:80:0x012a, B:82:0x0134, B:83:0x013b, B:73:0x0109, B:74:0x0110, B:76:0x0113, B:77:0x011c, B:84:0x013c, B:85:0x0143, B:86:0x0144, B:87:0x014b, B:92:0x0156), top: B:142:0x0061 }] */
    /* JADX WARN: Code duplicated, block: B:82:0x0134 A[Catch: all -> 0x0157, LoadingException -> 0x0163, RemoteException -> 0x0165, TryCatch #7 {RemoteException -> 0x0165, LoadingException -> 0x0163, all -> 0x0157, blocks: (B:22:0x0061, B:28:0x006d, B:31:0x0076, B:35:0x007c, B:37:0x0084, B:39:0x0088, B:40:0x0093, B:47:0x009e, B:49:0x00b7, B:51:0x00bf, B:52:0x00c5, B:53:0x00cc, B:48:0x00ab, B:57:0x00d0, B:58:0x00d1, B:59:0x00d8, B:60:0x00d9, B:61:0x00e0, B:65:0x00e4, B:66:0x00e5, B:68:0x00eb, B:70:0x00f2, B:72:0x00fa, B:78:0x0124, B:80:0x012a, B:82:0x0134, B:83:0x013b, B:73:0x0109, B:74:0x0110, B:76:0x0113, B:77:0x011c, B:84:0x013c, B:85:0x0143, B:86:0x0144, B:87:0x014b, B:92:0x0156), top: B:142:0x0061 }] */
    /* JADX WARN: Code duplicated, block: B:84:0x013c A[Catch: all -> 0x0157, LoadingException -> 0x0163, RemoteException -> 0x0165, TryCatch #7 {RemoteException -> 0x0165, LoadingException -> 0x0163, all -> 0x0157, blocks: (B:22:0x0061, B:28:0x006d, B:31:0x0076, B:35:0x007c, B:37:0x0084, B:39:0x0088, B:40:0x0093, B:47:0x009e, B:49:0x00b7, B:51:0x00bf, B:52:0x00c5, B:53:0x00cc, B:48:0x00ab, B:57:0x00d0, B:58:0x00d1, B:59:0x00d8, B:60:0x00d9, B:61:0x00e0, B:65:0x00e4, B:66:0x00e5, B:68:0x00eb, B:70:0x00f2, B:72:0x00fa, B:78:0x0124, B:80:0x012a, B:82:0x0134, B:83:0x013b, B:73:0x0109, B:74:0x0110, B:76:0x0113, B:77:0x011c, B:84:0x013c, B:85:0x0143, B:86:0x0144, B:87:0x014b, B:92:0x0156), top: B:142:0x0061 }] */
    /* JADX WARN: Code duplicated, block: B:86:0x0144 A[Catch: all -> 0x0157, LoadingException -> 0x0163, RemoteException -> 0x0165, TryCatch #7 {RemoteException -> 0x0165, LoadingException -> 0x0163, all -> 0x0157, blocks: (B:22:0x0061, B:28:0x006d, B:31:0x0076, B:35:0x007c, B:37:0x0084, B:39:0x0088, B:40:0x0093, B:47:0x009e, B:49:0x00b7, B:51:0x00bf, B:52:0x00c5, B:53:0x00cc, B:48:0x00ab, B:57:0x00d0, B:58:0x00d1, B:59:0x00d8, B:60:0x00d9, B:61:0x00e0, B:65:0x00e4, B:66:0x00e5, B:68:0x00eb, B:70:0x00f2, B:72:0x00fa, B:78:0x0124, B:80:0x012a, B:82:0x0134, B:83:0x013b, B:73:0x0109, B:74:0x0110, B:76:0x0113, B:77:0x011c, B:84:0x013c, B:85:0x0143, B:86:0x0144, B:87:0x014b, B:92:0x0156), top: B:142:0x0061 }] */
    /* JADX WARN: Code duplicated, block: B:88:0x014c A[Catch: all -> 0x0154, TRY_ENTER, TryCatch #2 {, blocks: (B:23:0x0062, B:25:0x0068, B:88:0x014c, B:89:0x0153), top: B:138:0x0062 }] */
    public static DynamiteModule load(Context context, VersionPolicy versionPolicy, String str) throws LoadingException {
        DynamiteModule dynamiteModuleZzc;
        int i;
        Boolean bool;
        zzp zzpVarZzg;
        int iZze;
        IObjectWrapper iObjectWrapperZzh;
        Object objUnwrap;
        DynamiteModule dynamiteModule;
        zzm zzmVar;
        zzq zzqVar;
        zzm zzmVar2;
        boolean z;
        Cursor cursor;
        Context applicationContext = context.getApplicationContext();
        zzo zzoVar = null;
        if (applicationContext == null) {
            throw new LoadingException("null application Context", zzoVar);
        }
        ThreadLocal threadLocal = zzg;
        zzm zzmVar3 = (zzm) threadLocal.get();
        zzm zzmVar4 = new zzm(null);
        threadLocal.set(zzmVar4);
        ThreadLocal threadLocal2 = zzh;
        long jLongValue = ((Long) threadLocal2.get()).longValue();
        try {
            threadLocal2.set(Long.valueOf(SystemClock.uptimeMillis()));
            VersionPolicy.SelectionResult selectionResultSelectModule = versionPolicy.selectModule(context, str, zzi);
            int i2 = selectionResultSelectModule.localVersion;
            int i3 = selectionResultSelectModule.remoteVersion;
            int i4 = selectionResultSelectModule.selection;
            if (i4 != 0) {
                if (i4 != -1) {
                    if (i4 == 1 || selectionResultSelectModule.remoteVersion != 0) {
                        if (i4 == -1) {
                            dynamiteModuleZzc = zzc(applicationContext, str);
                        } else {
                            if (i4 == 1) {
                                StringBuilder sb = new StringBuilder("VersionPolicy returned invalid code:");
                                sb.append(i4);
                                throw new LoadingException(sb.toString(), zzoVar);
                            }
                            try {
                                i = selectionResultSelectModule.remoteVersion;
                                try {
                                    synchronized (DynamiteModule.class) {
                                        if (zzf(context)) {
                                            throw new LoadingException("Remote loading disabled", zzoVar);
                                        }
                                        bool = zzb;
                                    }
                                    if (bool != null) {
                                        throw new LoadingException("Failed to determine which loading route to use.", zzoVar);
                                    }
                                    if (bool.booleanValue()) {
                                        synchronized (DynamiteModule.class) {
                                            zzqVar = zzl;
                                        }
                                        if (zzqVar != null) {
                                            throw new LoadingException("DynamiteLoaderV2 was not cached.", zzoVar);
                                        }
                                        zzmVar2 = (zzm) threadLocal.get();
                                        if (zzmVar2 != null || zzmVar2.zza == null) {
                                            throw new LoadingException("No result cursor", zzoVar);
                                        }
                                        Context applicationContext2 = context.getApplicationContext();
                                        Cursor cursor2 = zzmVar2.zza;
                                        ObjectWrapper.wrap(null);
                                        synchronized (DynamiteModule.class) {
                                            z = zze >= 2;
                                        }
                                        Context context2 = (Context) ObjectWrapper.unwrap(z ? zzqVar.zzf(ObjectWrapper.wrap(applicationContext2), str, i, ObjectWrapper.wrap(cursor2)) : zzqVar.zze(ObjectWrapper.wrap(applicationContext2), str, i, ObjectWrapper.wrap(cursor2)));
                                        if (context2 == null) {
                                            throw new LoadingException("Failed to get module context", zzoVar);
                                        }
                                        dynamiteModule = new DynamiteModule(context2);
                                    } else {
                                        zzpVarZzg = zzg(context);
                                        if (zzpVarZzg != null) {
                                            throw new LoadingException("Failed to create IDynamiteLoader.", zzoVar);
                                        }
                                        iZze = zzpVarZzg.zze();
                                        if (iZze >= 3) {
                                            zzmVar = (zzm) threadLocal.get();
                                            if (zzmVar != null) {
                                                throw new LoadingException("No cached result cursor holder", zzoVar);
                                            }
                                            iObjectWrapperZzh = zzpVarZzg.zzi(ObjectWrapper.wrap(context), str, i, ObjectWrapper.wrap(zzmVar.zza));
                                        } else if (iZze == 2) {
                                            iObjectWrapperZzh = zzpVarZzg.zzj(ObjectWrapper.wrap(context), str, i);
                                        } else {
                                            iObjectWrapperZzh = zzpVarZzg.zzh(ObjectWrapper.wrap(context), str, i);
                                        }
                                        objUnwrap = ObjectWrapper.unwrap(iObjectWrapperZzh);
                                        if (objUnwrap != null) {
                                            throw new LoadingException("Failed to load remote module.", zzoVar);
                                        }
                                        dynamiteModule = new DynamiteModule((Context) objUnwrap);
                                    }
                                    dynamiteModuleZzc = dynamiteModule;
                                } catch (RemoteException e2) {
                                    throw new LoadingException("Failed to load remote module.", e2, zzoVar);
                                } catch (LoadingException e3) {
                                    throw e3;
                                } catch (Throwable th) {
                                    CrashUtils.addDynamiteErrorToDropBox(context, th);
                                    throw new LoadingException("Failed to load remote module.", th, zzoVar);
                                }
                            } catch (LoadingException e4) {
                                e4.getMessage();
                                int i5 = selectionResultSelectModule.localVersion;
                                if (i5 == 0 || versionPolicy.selectModule(context, str, new zzn(i5, 0)).selection != -1) {
                                    throw new LoadingException("Remote load failed. No local fallback found.", e4, zzoVar);
                                }
                                dynamiteModuleZzc = zzc(applicationContext, str);
                            }
                        }
                        if (jLongValue == 0) {
                            zzh.remove();
                        } else {
                            zzh.set(Long.valueOf(jLongValue));
                        }
                        cursor = zzmVar4.zza;
                        if (cursor != null) {
                            cursor.close();
                        }
                        zzg.set(zzmVar3);
                        return dynamiteModuleZzc;
                    }
                } else if (selectionResultSelectModule.localVersion != 0) {
                    i4 = -1;
                    if (i4 == 1) {
                    }
                    if (i4 == -1) {
                        dynamiteModuleZzc = zzc(applicationContext, str);
                    } else {
                        if (i4 == 1) {
                            StringBuilder sb2 = new StringBuilder("VersionPolicy returned invalid code:");
                            sb2.append(i4);
                            throw new LoadingException(sb2.toString(), zzoVar);
                        }
                        i = selectionResultSelectModule.remoteVersion;
                        synchronized (DynamiteModule.class) {
                            if (zzf(context)) {
                                throw new LoadingException("Remote loading disabled", zzoVar);
                            }
                            bool = zzb;
                            if (bool != null) {
                                throw new LoadingException("Failed to determine which loading route to use.", zzoVar);
                            }
                            if (bool.booleanValue()) {
                                synchronized (DynamiteModule.class) {
                                    zzqVar = zzl;
                                    if (zzqVar != null) {
                                        throw new LoadingException("DynamiteLoaderV2 was not cached.", zzoVar);
                                    }
                                    zzmVar2 = (zzm) threadLocal.get();
                                    if (zzmVar2 != null) {
                                    }
                                    throw new LoadingException("No result cursor", zzoVar);
                                }
                            }
                            zzpVarZzg = zzg(context);
                            if (zzpVarZzg != null) {
                                throw new LoadingException("Failed to create IDynamiteLoader.", zzoVar);
                            }
                            iZze = zzpVarZzg.zze();
                            if (iZze >= 3) {
                                zzmVar = (zzm) threadLocal.get();
                                if (zzmVar != null) {
                                    throw new LoadingException("No cached result cursor holder", zzoVar);
                                }
                                iObjectWrapperZzh = zzpVarZzg.zzi(ObjectWrapper.wrap(context), str, i, ObjectWrapper.wrap(zzmVar.zza));
                            } else if (iZze == 2) {
                                iObjectWrapperZzh = zzpVarZzg.zzj(ObjectWrapper.wrap(context), str, i);
                            } else {
                                iObjectWrapperZzh = zzpVarZzg.zzh(ObjectWrapper.wrap(context), str, i);
                            }
                            objUnwrap = ObjectWrapper.unwrap(iObjectWrapperZzh);
                            if (objUnwrap != null) {
                                throw new LoadingException("Failed to load remote module.", zzoVar);
                            }
                            dynamiteModule = new DynamiteModule((Context) objUnwrap);
                            dynamiteModuleZzc = dynamiteModule;
                        }
                    }
                    if (jLongValue == 0) {
                        zzh.remove();
                    } else {
                        zzh.set(Long.valueOf(jLongValue));
                    }
                    cursor = zzmVar4.zza;
                    if (cursor != null) {
                        cursor.close();
                    }
                    zzg.set(zzmVar3);
                    return dynamiteModuleZzc;
                }
            }
            int i6 = selectionResultSelectModule.localVersion;
            int i7 = selectionResultSelectModule.remoteVersion;
            StringBuilder sb3 = new StringBuilder("No acceptable module ");
            sb3.append(str);
            sb3.append(" found. Local version is ");
            sb3.append(i6);
            sb3.append(" and remote version is ");
            sb3.append(i7);
            sb3.append(".");
            throw new LoadingException(sb3.toString(), zzoVar);
        } catch (Throwable th2) {
            if (jLongValue == 0) {
                zzh.remove();
            } else {
                zzh.set(Long.valueOf(jLongValue));
            }
            Cursor cursor3 = zzmVar4.zza;
            if (cursor3 != null) {
                cursor3.close();
            }
            zzg.set(zzmVar3);
            throw th2;
        }
    }

    /* JADX INFO: Removed unreachable split cross block B:131:0x0162 */
    /* JADX WARN: Code duplicated, block: B:96:0x013d A[Catch: all -> 0x016e, TRY_LEAVE, TryCatch #5 {all -> 0x016e, blocks: (B:3:0x0002, B:60:0x00c9, B:62:0x00cf, B:67:0x00d9, B:89:0x0131, B:96:0x013d, B:113:0x0167, B:114:0x016a, B:109:0x015f, B:65:0x00d5, B:117:0x016d, B:4:0x0003, B:7:0x0009, B:8:0x0025, B:58:0x00c6, B:51:0x00bb, B:57:0x00c1), top: B:127:0x0002, inners: #3, #4 }] */
    public static int zza(Context context, String str, boolean z) {
        ClassLoader zzcVar;
        Throwable th;
        Cursor cursor;
        RemoteException e2;
        Cursor cursor2;
        try {
            synchronized (DynamiteModule.class) {
                Boolean bool = zzb;
                int iZzg = 0;
                Cursor cursor3 = null;
                if (bool == null) {
                    try {
                        Field declaredField = context.getApplicationContext().getClassLoader().loadClass(DynamiteLoaderClassLoader.class.getName()).getDeclaredField("sClassLoader");
                        synchronized (declaredField.getDeclaringClass()) {
                            try {
                                ClassLoader classLoader = (ClassLoader) declaredField.get(null);
                                if (classLoader == ClassLoader.getSystemClassLoader()) {
                                    bool = Boolean.FALSE;
                                } else if (classLoader != null) {
                                    try {
                                        zzd(classLoader);
                                    } catch (LoadingException unused) {
                                    }
                                    bool = Boolean.TRUE;
                                } else {
                                    if (!zzf(context)) {
                                        return 0;
                                    }
                                    if (zzd || Boolean.TRUE.equals(null)) {
                                        declaredField.set(null, ClassLoader.getSystemClassLoader());
                                        bool = Boolean.FALSE;
                                    } else {
                                        try {
                                            int iZzb = zzb(context, str, z, true);
                                            String str2 = zzc;
                                            if (str2 != null && !str2.isEmpty()) {
                                                ClassLoader classLoaderZza = zzb.zza();
                                                if (classLoaderZza == null) {
                                                    if (Build.VERSION.SDK_INT >= 29) {
                                                        String str3 = zzc;
                                                        Preconditions.checkNotNull(str3);
                                                        zzcVar = new DelegateLastClassLoader(str3, ClassLoader.getSystemClassLoader());
                                                    } else {
                                                        String str4 = zzc;
                                                        Preconditions.checkNotNull(str4);
                                                        zzcVar = new zzc(str4, ClassLoader.getSystemClassLoader());
                                                    }
                                                    classLoaderZza = zzcVar;
                                                }
                                                zzd(classLoaderZza);
                                                declaredField.set(null, classLoaderZza);
                                                zzb = Boolean.TRUE;
                                                return iZzb;
                                            }
                                            return iZzb;
                                        } catch (LoadingException unused2) {
                                            declaredField.set(null, ClassLoader.getSystemClassLoader());
                                            bool = Boolean.FALSE;
                                        }
                                    }
                                }
                                zzb = bool;
                            } catch (Throwable th2) {
                                throw th2;
                            }
                        }
                    } catch (ClassNotFoundException | IllegalAccessException | NoSuchFieldException e3) {
                        e3.toString();
                        bool = Boolean.FALSE;
                    }
                }
                if (bool.booleanValue()) {
                    try {
                        return zzb(context, str, z, false);
                    } catch (LoadingException e4) {
                        e4.getMessage();
                        return 0;
                    }
                }
                zzp zzpVarZzg = zzg(context);
                try {
                    if (zzpVarZzg != null) {
                        try {
                            int iZze = zzpVarZzg.zze();
                            if (iZze >= 3) {
                                zzm zzmVar = (zzm) zzg.get();
                                if (zzmVar == null || (cursor2 = zzmVar.zza) == null) {
                                    cursor = (Cursor) ObjectWrapper.unwrap(zzpVarZzg.zzk(ObjectWrapper.wrap(context), str, z, ((Long) zzh.get()).longValue()));
                                    if (cursor != null) {
                                        try {
                                            if (cursor.moveToFirst()) {
                                                int i = cursor.getInt(0);
                                                cursor3 = (i <= 0 || !zze(cursor)) ? cursor : null;
                                                if (cursor3 != null) {
                                                    cursor3.close();
                                                }
                                                iZzg = i;
                                            } else if (cursor != null) {
                                                cursor.close();
                                            }
                                        } catch (RemoteException e5) {
                                            e2 = e5;
                                            cursor3 = cursor;
                                            e2.getMessage();
                                            if (cursor3 != null) {
                                                cursor3.close();
                                            }
                                        } catch (Throwable th3) {
                                            th = th3;
                                            if (cursor == null) {
                                                throw th;
                                            }
                                            cursor.close();
                                            throw th;
                                        }
                                    } else if (cursor != null) {
                                        cursor.close();
                                    }
                                } else {
                                    iZzg = cursor2.getInt(0);
                                }
                            } else {
                                iZzg = iZze == 2 ? zzpVarZzg.zzg(ObjectWrapper.wrap(context), str, z) : zzpVarZzg.zzf(ObjectWrapper.wrap(context), str, z);
                            }
                        } catch (RemoteException e6) {
                            e2 = e6;
                        }
                    }
                    return iZzg;
                } catch (Throwable th4) {
                    th = th4;
                    cursor = cursor3;
                }
            }
        } catch (Throwable th5) {
            CrashUtils.addDynamiteErrorToDropBox(context, th5);
            throw th5;
        }
    }

    /* JADX WARN: Code duplicated, block: B:103:0x0167  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 5, insn: 0x0164: MOVE (r0 I:??[OBJECT, ARRAY]) = (r5 I:??[OBJECT, ARRAY]), block:B:101:0x0164 */
    private static int zzb(Context context, String str, boolean z, boolean z2) throws Throwable {
        Cursor cursor;
        MatrixCursor matrixCursor;
        Cursor cursor2 = null;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        try {
            try {
                boolean z3 = true;
                Uri uriBuild = new Uri.Builder().scheme(FirebaseAnalytics.Param.CONTENT).authority("com.google.android.gms.chimera").path(true != z ? "api" : "api_force_staging").appendPath(str).appendQueryParameter("requestStartUptime", String.valueOf(((Long) zzh.get()).longValue())).build();
                ContentProviderClient contentProviderClientAcquireUnstableContentProviderClient = context.getContentResolver().acquireUnstableContentProviderClient(uriBuild);
                boolean z4 = false;
                if (contentProviderClientAcquireUnstableContentProviderClient == null) {
                    matrixCursor = null;
                } else {
                    try {
                        Cursor cursorQuery = contentProviderClientAcquireUnstableContentProviderClient.query(uriBuild, null, null, null, null);
                        if (cursorQuery == null) {
                            contentProviderClientAcquireUnstableContentProviderClient.release();
                            matrixCursor = null;
                        } else {
                            try {
                                int count = cursorQuery.getCount();
                                int columnCount = cursorQuery.getColumnCount();
                                matrixCursor = new MatrixCursor(cursorQuery.getColumnNames(), count);
                                for (int i = 0; i < count; i++) {
                                    if (!cursorQuery.moveToPosition(i)) {
                                        throw new RemoteException("Cursor read incomplete (ContentProvider dead?)");
                                    }
                                    Object[] objArr4 = new Object[columnCount];
                                    for (int i2 = 0; i2 < columnCount; i2++) {
                                        int type = cursorQuery.getType(i2);
                                        if (type == 0) {
                                            objArr4[i2] = null;
                                        } else if (type == 1) {
                                            objArr4[i2] = Long.valueOf(cursorQuery.getLong(i2));
                                        } else if (type == 2) {
                                            objArr4[i2] = Double.valueOf(cursorQuery.getDouble(i2));
                                        } else if (type == 3) {
                                            objArr4[i2] = cursorQuery.getString(i2);
                                        } else {
                                            if (type != 4) {
                                                throw new RemoteException("Unknown column type");
                                            }
                                            objArr4[i2] = cursorQuery.getBlob(i2);
                                        }
                                    }
                                    matrixCursor.addRow(objArr4);
                                }
                                cursorQuery.close();
                                contentProviderClientAcquireUnstableContentProviderClient.release();
                            } catch (Throwable th) {
                                try {
                                    cursorQuery.close();
                                } catch (Throwable th2) {
                                    th.addSuppressed(th2);
                                }
                                throw th;
                            }
                        }
                    } catch (RemoteException unused) {
                    } catch (Throwable th3) {
                        contentProviderClientAcquireUnstableContentProviderClient.release();
                        throw th3;
                    }
                }
                if (matrixCursor != null) {
                    try {
                        if (matrixCursor.moveToFirst()) {
                            int i3 = matrixCursor.getInt(0);
                            if (i3 > 0) {
                                synchronized (DynamiteModule.class) {
                                    zzc = matrixCursor.getString(2);
                                    int columnIndex = matrixCursor.getColumnIndex("loaderVersion");
                                    if (columnIndex >= 0) {
                                        zze = matrixCursor.getInt(columnIndex);
                                    }
                                    int columnIndex2 = matrixCursor.getColumnIndex("disableStandaloneDynamiteLoader2");
                                    if (columnIndex2 >= 0) {
                                        if (matrixCursor.getInt(columnIndex2) == 0) {
                                            z3 = false;
                                        }
                                        zzd = z3;
                                        z4 = z3;
                                    }
                                }
                                if (zze(matrixCursor)) {
                                    matrixCursor = null;
                                }
                            }
                            if (z2 && z4) {
                                throw new LoadingException("forcing fallback to container DynamiteLoader impl", objArr2 == true ? 1 : 0);
                            }
                            if (matrixCursor != null) {
                                matrixCursor.close();
                            }
                            return i3;
                        }
                    } catch (Exception e2) {
                        e = e2;
                        if (e instanceof LoadingException) {
                            throw e;
                        }
                        String message = e.getMessage();
                        StringBuilder sb = new StringBuilder();
                        sb.append("V2 version check failed: ");
                        sb.append(message);
                        throw new LoadingException(sb.toString(), e, objArr == true ? 1 : 0);
                    }
                }
                throw new LoadingException("Failed to connect to dynamite module ContentResolver.", objArr3 == true ? 1 : 0);
            } catch (Throwable th4) {
                th = th4;
                cursor2 = cursor;
                if (cursor2 != null) {
                    cursor2.close();
                }
                throw th;
            }
        } catch (Exception e3) {
            e = e3;
        } catch (Throwable th5) {
            th = th5;
            if (cursor2 != null) {
                cursor2.close();
            }
            throw th;
        }
    }

    private static void zzd(ClassLoader classLoader) throws LoadingException {
        zzq zzqVar;
        zzo zzoVar = null;
        try {
            IBinder iBinder = (IBinder) classLoader.loadClass("com.google.android.gms.dynamiteloader.DynamiteLoaderV2").getConstructor(new Class[0]).newInstance(new Object[0]);
            if (iBinder == null) {
                zzqVar = null;
            } else {
                IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoaderV2");
                zzqVar = iInterfaceQueryLocalInterface instanceof zzq ? (zzq) iInterfaceQueryLocalInterface : new zzq(iBinder);
            }
            zzl = zzqVar;
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException e2) {
            throw new LoadingException("Failed to instantiate dynamite loader", e2, zzoVar);
        }
    }

    private static boolean zze(Cursor cursor) {
        zzm zzmVar = (zzm) zzg.get();
        if (zzmVar == null || zzmVar.zza != null) {
            return false;
        }
        zzmVar.zza = cursor;
        return true;
    }

    private static boolean zzf(Context context) {
        if (Boolean.TRUE.equals(null) || Boolean.TRUE.equals(zzf)) {
            return true;
        }
        boolean zBooleanValue = false;
        if (zzf == null) {
            ProviderInfo providerInfoResolveContentProvider = context.getPackageManager().resolveContentProvider("com.google.android.gms.chimera", true != PlatformVersion.isAtLeastQ() ? 0 : 268435456);
            if (GoogleApiAvailabilityLight.getInstance().isGooglePlayServicesAvailable(context, 10000000) == 0 && providerInfoResolveContentProvider != null && "com.google.android.gms".equals(((PackageItemInfo) providerInfoResolveContentProvider).packageName)) {
                zBooleanValue = true;
            }
            Boolean boolValueOf = Boolean.valueOf(zBooleanValue);
            zzf = boolValueOf;
            zBooleanValue = boolValueOf.booleanValue();
            if (zBooleanValue && ((ComponentInfo) providerInfoResolveContentProvider).applicationInfo != null && (((ComponentInfo) providerInfoResolveContentProvider).applicationInfo.flags & 129) == 0) {
                zzd = true;
            }
        }
        return zBooleanValue;
    }

    private static zzp zzg(Context context) {
        zzp zzpVar;
        synchronized (DynamiteModule.class) {
            zzp zzpVar2 = zzk;
            if (zzpVar2 != null) {
                return zzpVar2;
            }
            try {
                IBinder iBinder = (IBinder) context.createPackageContext("com.google.android.gms", 3).getClassLoader().loadClass("com.google.android.gms.chimera.container.DynamiteLoaderImpl").newInstance();
                if (iBinder == null) {
                    zzpVar = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoader");
                    zzpVar = iInterfaceQueryLocalInterface instanceof zzp ? (zzp) iInterfaceQueryLocalInterface : new zzp(iBinder);
                }
                if (zzpVar != null) {
                    zzk = zzpVar;
                    return zzpVar;
                }
            } catch (Exception e2) {
                e2.getMessage();
            }
            return null;
        }
    }

    public final IBinder instantiate(String str) throws LoadingException {
        try {
            return (IBinder) this.zzj.getClassLoader().loadClass(str).newInstance();
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException e2) {
            throw new LoadingException("Failed to instantiate module class: ".concat(String.valueOf(str)), e2, null);
        }
    }

    private static DynamiteModule zzc(Context context, String str) {
        return new DynamiteModule(context);
    }

    public final Context getModuleContext() {
        return this.zzj;
    }
}
