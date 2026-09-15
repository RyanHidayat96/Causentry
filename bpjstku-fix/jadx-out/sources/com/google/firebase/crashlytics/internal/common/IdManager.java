package com.google.firebase.crashlytics.internal.common;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.crashlytics.internal.Logger;
import com.google.firebase.crashlytics.internal.concurrency.CrashlyticsWorkers;
import com.google.firebase.installations.FirebaseInstallationsApi;
import com.google.firebase.installations.InstallationTokenResult;
import java.util.Locale;
import java.util.Objects;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes4.dex */
public class IdManager implements InstallIdProvider {
    public static final String DEFAULT_VERSION_NAME = "0.0";
    static final String PREFKEY_ADVERTISING_ID = "crashlytics.advertising.id";
    static final String PREFKEY_FIREBASE_IID = "firebase.installation.id";
    static final String PREFKEY_INSTALLATION_UUID = "crashlytics.installation.id";
    static final String PREFKEY_LEGACY_INSTALLATION_UUID = "crashlytics.installation.id";
    private static final String SYNTHETIC_FID_PREFIX = "SYN_";
    private static final int TIMEOUT_MILLIS = 10000;
    private final Context appContext;
    private final String appIdentifier;
    private final DataCollectionArbiter dataCollectionArbiter;
    private final FirebaseInstallationsApi firebaseInstallations;
    private InstallIdProvider.InstallIds installIds;
    private final InstallerPackageNameProvider installerPackageNameProvider;
    private static final Pattern ID_PATTERN = Pattern.compile("[^\\p{Alnum}]");
    private static final String FORWARD_SLASH_REGEX = Pattern.quote("/");

    public IdManager(Context context, String str, FirebaseInstallationsApi firebaseInstallationsApi, DataCollectionArbiter dataCollectionArbiter) {
        if (context == null) {
            throw new IllegalArgumentException("appContext must not be null");
        }
        if (str == null) {
            throw new IllegalArgumentException("appIdentifier must not be null");
        }
        this.appContext = context;
        this.appIdentifier = str;
        this.firebaseInstallations = firebaseInstallationsApi;
        this.dataCollectionArbiter = dataCollectionArbiter;
        this.installerPackageNameProvider = new InstallerPackageNameProvider();
    }

    private static String formatId(String str) {
        return ID_PATTERN.matcher(str).replaceAll("").toLowerCase(Locale.US);
    }

    @Override // com.google.firebase.crashlytics.internal.common.InstallIdProvider
    public InstallIdProvider.InstallIds getInstallIds() {
        synchronized (this) {
            if (!shouldRefresh()) {
                return this.installIds;
            }
            Logger.getLogger().v("Determining Crashlytics installation ID...");
            SharedPreferences sharedPrefs = CommonUtils.getSharedPrefs(this.appContext);
            String string = sharedPrefs.getString(PREFKEY_FIREBASE_IID, null);
            Logger logger = Logger.getLogger();
            StringBuilder sb = new StringBuilder("Cached Firebase Installation ID: ");
            sb.append(string);
            logger.v(sb.toString());
            if (this.dataCollectionArbiter.isAutomaticDataCollectionEnabled()) {
                FirebaseInstallationId firebaseInstallationIdFetchTrueFid = fetchTrueFid(false);
                Logger logger2 = Logger.getLogger();
                StringBuilder sb2 = new StringBuilder("Fetched Firebase Installation ID: ");
                sb2.append(firebaseInstallationIdFetchTrueFid.getFid());
                logger2.v(sb2.toString());
                if (firebaseInstallationIdFetchTrueFid.getFid() == null) {
                    firebaseInstallationIdFetchTrueFid = new FirebaseInstallationId(string == null ? createSyntheticFid() : string, null);
                }
                if (Objects.equals(firebaseInstallationIdFetchTrueFid.getFid(), string)) {
                    this.installIds = InstallIdProvider.InstallIds.create(readCachedCrashlyticsInstallId(sharedPrefs), firebaseInstallationIdFetchTrueFid);
                } else {
                    this.installIds = InstallIdProvider.InstallIds.create(createAndCacheCrashlyticsInstallId(firebaseInstallationIdFetchTrueFid.getFid(), sharedPrefs), firebaseInstallationIdFetchTrueFid);
                }
            } else if (isSyntheticFid(string)) {
                this.installIds = InstallIdProvider.InstallIds.createWithoutFid(readCachedCrashlyticsInstallId(sharedPrefs));
            } else {
                this.installIds = InstallIdProvider.InstallIds.createWithoutFid(createAndCacheCrashlyticsInstallId(createSyntheticFid(), sharedPrefs));
            }
            Logger logger3 = Logger.getLogger();
            StringBuilder sb3 = new StringBuilder("Install IDs: ");
            sb3.append(this.installIds);
            logger3.v(sb3.toString());
            return this.installIds;
        }
    }

    private boolean shouldRefresh() {
        InstallIdProvider.InstallIds installIds = this.installIds;
        if (installIds != null) {
            return installIds.getFirebaseInstallationId() == null && this.dataCollectionArbiter.isAutomaticDataCollectionEnabled();
        }
        return true;
    }

    static String createSyntheticFid() {
        StringBuilder sb = new StringBuilder(SYNTHETIC_FID_PREFIX);
        sb.append(UUID.randomUUID().toString());
        return sb.toString();
    }

    static boolean isSyntheticFid(String str) {
        return str != null && str.startsWith(SYNTHETIC_FID_PREFIX);
    }

    private String readCachedCrashlyticsInstallId(SharedPreferences sharedPreferences) {
        return sharedPreferences.getString("crashlytics.installation.id", null);
    }

    public FirebaseInstallationId fetchTrueFid(boolean z) {
        String token;
        CrashlyticsWorkers.checkNotMainThread();
        String str = null;
        if (z) {
            try {
                token = ((InstallationTokenResult) Tasks.await(this.firebaseInstallations.getToken(false), 10000L, TimeUnit.MILLISECONDS)).getToken();
            } catch (Exception e2) {
                Logger.getLogger().w("Error getting Firebase authentication token.", e2);
                token = null;
            }
        } else {
            token = null;
        }
        try {
            str = (String) Tasks.await(this.firebaseInstallations.getId(), 10000L, TimeUnit.MILLISECONDS);
        } catch (Exception e3) {
            Logger.getLogger().w("Error getting Firebase installation id.", e3);
        }
        return new FirebaseInstallationId(str, token);
    }

    private String createAndCacheCrashlyticsInstallId(String str, SharedPreferences sharedPreferences) {
        String id2;
        synchronized (this) {
            id2 = formatId(UUID.randomUUID().toString());
            Logger logger = Logger.getLogger();
            StringBuilder sb = new StringBuilder("Created new Crashlytics installation ID: ");
            sb.append(id2);
            sb.append(" for FID: ");
            sb.append(str);
            logger.v(sb.toString());
            sharedPreferences.edit().putString("crashlytics.installation.id", id2).putString(PREFKEY_FIREBASE_IID, str).apply();
        }
        return id2;
    }

    public String getAppIdentifier() {
        return this.appIdentifier;
    }

    public String getOsDisplayVersionString() {
        return removeForwardSlashesIn(Build.VERSION.RELEASE);
    }

    public String getOsBuildVersionString() {
        return removeForwardSlashesIn(Build.VERSION.INCREMENTAL);
    }

    public String getModelName() {
        return String.format(Locale.US, "%s/%s", removeForwardSlashesIn(Build.MANUFACTURER), removeForwardSlashesIn(Build.MODEL));
    }

    private String removeForwardSlashesIn(String str) {
        return str.replaceAll(FORWARD_SLASH_REGEX, "");
    }

    public String getInstallerPackageName() {
        return this.installerPackageNameProvider.getInstallerPackageName(this.appContext);
    }
}
